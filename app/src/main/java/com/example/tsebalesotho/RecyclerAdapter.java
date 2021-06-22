package com.example.tsebalesotho;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public
class RecyclerAdapter extends RecyclerView.Adapter < RecyclerAdapter.ViewHolder > {
    String[] data;
    String[] data1;
    int[]    data2;
    Context  context, context1, context2;

    public
    RecyclerAdapter ( Context context, String[] data, Context context1, String[] data1, Context context2, int[] data2 ) {
        this.data    = data;
        this.context = context;

        this.data1    = data1;
        this.context1 = context1;

        this.data2    = data2;
        this.context2 = context2;
    }


    @NonNull
    @Override
    public
    RecyclerAdapter.ViewHolder onCreateViewHolder ( @NonNull ViewGroup parent, int viewType ) {
        LayoutInflater layoutInflater = LayoutInflater.from ( parent.getContext ( ) );
        View view = layoutInflater.inflate ( R.layout.custom_layout, parent, false );
        ViewHolder viewHolder = new ViewHolder ( view );
        return viewHolder;
    }

    @Override
    public
    void onBindViewHolder ( @NonNull RecyclerAdapter.ViewHolder holder, int position ) {
        holder.textView1.setText ( data[ position ] );
        holder.textView2.setText ( data1[ position ] );
        holder.img.setImageResource ( data2[ position ] );
        holder.textView1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public
            void onClick ( View v ) {
                Intent intent = new Intent ( context, moreDetails.class );

                if ( position == 0 ) {
                    intent.putExtra ( "message1", "With its 192 meters (630 feet), Maletsunyane falls is one of the most impressive waterfalls in Africa and the among the highest single-drop falls." );
                    intent.putExtra ( "message2", "Semonkong and the waterfall of Maletsunyane are found along the recently paved A5 route.This new traffic artery cuts Lesotho in half, going from Maseru to Seforong." );
                    intent.putExtra ( "message3", "The town of Semenkong, about 5 kilometers from the Maletsunyane waterfall, lays 2,275 meters above sea level and has about 8,000 inhabitants." );
                    intent.putExtra ( "name", data2[ position ] );
                }
                else if ( position == 1 ) {
                    intent.putExtra ( "message1", "The origin of the Basotho blanket goes back over a century. In 1860, King Moshoeshoe I, the founder of  of Lesotho, was given a wool blanket as a gift." );
                    intent.putExtra ( "message2", "Versions of the Basotho tribal blanket, or ‘Seanamarena’ in Sesotho, are also worn in every day life by herd boys, grannies and even children to keep warm" );
                    intent.putExtra ( "message3", "Many people in Lesotho live in farming and animal husbandry based communities and therefore wear clothing that is suitable for this lifestyle." );
                    intent.putExtra ( "name", data2[ position ] );


                }
                else if ( position == 2 ) {
                    intent.putExtra ( "message1", "Lebollo is a cultural and traditional practice that transitions boys in the Basotho society to manhood. It is a rite of passage where boys become men" );
                    intent.putExtra ( "message2", "This practice is commonly found among Basotho men in the Free State Province of South Africa as well as in Lesotho. " );
                    intent.putExtra ( "message3", "The prevalence of traditional male circumcision among the Sotho people, who mostly reside in the Free State, is at 57.3%." );
                    intent.putExtra ( "name", data2[ position ] );


                }
                else if ( position == 3 ) {
                    intent.putExtra ( "message1", "The Sotho women have earned themselves the reputation of being masters of pottery craft. Once the clay soil, as raw material, has been collected from the river banks." );
                    intent.putExtra ( "message2", "The pliable lump is flattened into a disc like bottom of the pot which is placed on the small grass wreath or any flat object." );
                    intent.putExtra ( "message3", " Basotho, normally the women, make clay pots and candles. Both potting skills as well as cooking is expected of a prospective bride." );
                    intent.putExtra ( "name", data2[ position ] );


                }
                else if ( position == 4 ) {
                    intent.putExtra ( "message1", "Religious Beliefs. Religion in Lesotho is a mix of traditionally based ancestor worship and Christianity (about 80 percent), with a small representation of Islam." );
                    intent.putExtra ( "message2", "The main church groups are Catholic, Anglican, and Dutch Reformed with a small representation of Islam and Buddism" );
                    intent.putExtra ( "message3", "The dominance of the Catholic religion reflects the church's involvement in education, with over 75 percent of all primary and secondary schools being owned and managed by Catholics." );
                    intent.putExtra ( "name", data2[ position ] );


                }
                else if ( position == 5 ) {
                    intent.putExtra ( "message1", "Moferefere is a medicinal plant name that alludes to trouble the users of this plant have shown that once it is used it causes trouble in the family though the degree of the problem is not specified" );
                    intent.putExtra ( "message2", "Users of this medicinal plant believe that people whom this plant is used against will always have trouble." );
                    intent.putExtra ( "message3", " They will find it hard to keep the peace and as a result they will be dispersed and displaced. " );
                    intent.putExtra ( "name", data2[ position ] );


                }
                else if ( position == 6 ) {
                    intent.putExtra ( "message1", "Lesotho has a deit that consists of various foods such as maize, millet, melons, pumpkins, peas, beans, and ground nuts." );
                    intent.putExtra ( "message2", "It also domesticates animals for food. These animals included sheep, goats, fowl, and cattle with cattle and a variety of wild animals." );
                    intent.putExtra ( "message3", "During the traditional ceremonies, they have traditional alcohol known simply as jwala, which played an essential role in their culture." );
                    intent.putExtra ( "name", data2[ position ] );
                }

                Toast.makeText ( context, data[ position ], Toast.LENGTH_SHORT ).show ( );
                context.startActivity ( intent );
            }
        } );
    }

    @Override
    public
    int getItemCount ( ) {

        return data.length;
    }

    public
    class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView1, textView2;
        ImageView img;

        public
        ViewHolder ( @NonNull View itemView ) {

            super ( itemView );
            textView1 = itemView.findViewById ( R.id.name );
            textView2 = itemView.findViewById ( R.id.desc );
            img       = itemView.findViewById ( R.id.img );

        }
    }
}
