package com.unlimitedappworks.randroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImagenesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes);
        GridView gridView = (GridView) findViewById(R.id.gv_img);
        gridView.setAdapter(new Imagenes());
    }

    public class Imagenes extends BaseAdapter {
        private ArrayList<Integer> imagenes;

        public Imagenes() {
            imagenes = new ArrayList<>();
            imagenes.add(R.mipmap.ic_img1);
            imagenes.add(R.mipmap.ic_img2);
            imagenes.add(R.mipmap.ic_img3);
            imagenes.add(R.mipmap.ic_img4);
            imagenes.add(R.mipmap.ic_img5);
        }

        @Override
        public int getCount() {
            return imagenes.size();
        }

        @Override
        public Object getItem(int position) {
            return imagenes.get(position);
        }

        @Override
        public long getItemId(int position) {
            return imagenes.get(position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(getApplication().getApplicationContext());
            imageView.setImageResource(imagenes.get(position));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(64, 64));
            return imageView;
        }
    }
}
