package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

    public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyAdapter>{
    List<SuperHero> heroList;

    public SuperHeroAdapter(List<SuperHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public SuperHeroAdapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.item_super_hero,parent,false);
        MyAdapter viewHolder = new MyAdapter(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuperHeroAdapter.MyAdapter holder, int position) {
        //ambil satu item hero
        SuperHero hero = heroList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.heroName.setText(hero.getHeroName());
    }

    @Override
    public int getItemCount()    {
        return (heroList != null) ? heroList.size() : 0;
        /*for non shorthand people*/
        /*if(heroList!=null){
          return heroList.size();
        }else{
          return 0;
        }*/
    }

    public class MyAdapter extends RecyclerView.ViewHolder {
        public TextView heroName;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}