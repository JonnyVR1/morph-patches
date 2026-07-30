package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.p051p1.mobile.putong.live.base.vap.mix.Src;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/m33;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "a", "()Landroid/graphics/Bitmap;", "Lcom/p1/mobile/putong/live/base/vap/mix/Src;", "src", "b", "(Lcom/p1/mobile/putong/live/base/vap/mix/Src;)Landroid/graphics/Bitmap;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class m33 {

    @NotNull
    public static final m33 INSTANCE = new m33();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Bitmap m156917a() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        bitmapCreateBitmap.eraseColor(0);
        return bitmapCreateBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Bitmap m156918b(@NotNull Src src) {
        src.getClass();
        int w = src.getW();
        int h = src.getH();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(0, 0, w, h);
        new Rect();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(h * 0.8f);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setAntiAlias(true);
        if (src.getStyle() == Src.Style.BOLD) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        textPaint.setColor(src.getColor());
        String txt = src.getTxt();
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(txt, rect.left, (rect.centerY() - (fontMetricsInt.top / 2)) - (fontMetricsInt.bottom / 2), textPaint);
        return bitmapCreateBitmap;
    }
}
