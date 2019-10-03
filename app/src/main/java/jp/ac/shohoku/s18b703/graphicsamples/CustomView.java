package jp.ac.shohoku.s18b703.graphicsamples;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by usaNasu on 2019.10.03
 * Android端末でグラフィックスを表示するためのサンプル
 */
public class CustomView extends View {
    //コンストラクタ1
    public CustomView(Context context) {
        super(context);
    }

    //コンストラクタ2
    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //コンストラクタ3
    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * このメソッドで描画する
     *
     * @param canvas 画像表示用のキャンバス
     */
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);  //キャンバスの背景

        int w = this.getWidth();    //Viewの幅を取得
        int h = this.getHeight();   //Viewの高さを取得
        Paint p = new Paint();      //描画する図形の属性

        Resources rs = this.getContext().getResources();    //リソースの取得
        Bitmap bmp01 = BitmapFactory.decodeResource(rs, R.drawable.illumination); //画像の取得
        canvas.drawBitmap(bmp01, 0, 0, p);  //画像の左上をCanvasの(0,0)に合わせて表示する

        Bitmap bmp02 = BitmapFactory.decodeResource(rs, R.drawable.ring);
        canvas.drawBitmap(bmp02, 200, 400, p);
    }
}
