package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import com.immomo.velib.anim.model.Element;

/* JADX INFO: loaded from: classes7.dex */
public class gre {

    /* JADX INFO: renamed from: a */
    private Canvas f106019a;

    /* JADX INFO: renamed from: b */
    private Paint f106020b;

    /* JADX INFO: renamed from: c */
    private String f106021c;

    /* JADX INFO: renamed from: d */
    private Element f106022d;

    /* JADX INFO: renamed from: a */
    public Bitmap m131786a(Element element) {
        this.f106021c = "";
        this.f106022d = element;
        String text = element.getText();
        element.getBackgroundPath();
        int fontSize = element.getFontSize();
        int maxLen = element.getMaxLen();
        int height = ((int) (element.getHeight() * 1280.0f)) + 12;
        int width = ((int) (element.getWidth() * 720.0f)) + 16;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        if (fontSize == 0) {
            fontSize = 14;
        }
        if (maxLen == 0) {
            maxLen = 5;
        }
        if (this.f106020b == null) {
            Paint paint = new Paint();
            this.f106020b = paint;
            paint.setAntiAlias(true);
            this.f106020b.setStrokeWidth(2.0f);
            this.f106020b.setTextAlign(Paint.Align.CENTER);
        }
        this.f106020b.setTextSize((int) (fontSize * 2.0f));
        int color = -1;
        if (!TextUtils.isEmpty(element.getTextColor())) {
            try {
                color = Color.parseColor(element.getTextColor());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f106020b.setColor(color);
        Rect rect = new Rect();
        int i = maxLen * 2;
        if (wnk0.m207216d(text) > i) {
            text = wnk0.m207213a(text, i) + "…";
        }
        this.f106020b.getTextBounds(text, 0, text.length(), rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i2 = iWidth + 40;
        if (width < i2) {
            width = i2;
        }
        int i3 = iHeight + 24;
        if (height < i3) {
            height = i3;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = this.f106019a;
        if (canvas == null) {
            this.f106019a = new Canvas(bitmapCreateBitmap2);
        } else {
            canvas.setBitmap(bitmapCreateBitmap2);
            this.f106019a.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        if (bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height) {
            bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, width, height, true);
        }
        this.f106019a.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f106020b);
        Paint.FontMetrics fontMetrics = this.f106020b.getFontMetrics();
        this.f106019a.drawText(text, width * 0.5f, (int) (((height * 0.5f) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f106020b);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m131787b(Element element, int i, int i2, int i3) throws Throwable {
        this.f106021c = "";
        this.f106022d = element;
        String text = element.getText();
        String backgroundPath = element.getBackgroundPath();
        element.getFontSize();
        int maxLen = element.getMaxLen();
        int height = ((int) (element.getHeight() * i2)) + 12;
        float f = i;
        int width = ((int) (element.getWidth() * f)) + 16;
        Bitmap bitmapM152667a = l33.m152667a(backgroundPath);
        if (bitmapM152667a == null) {
            bitmapM152667a = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        if (maxLen == 0) {
            maxLen = 5;
        }
        if (this.f106020b == null) {
            Paint paint = new Paint();
            this.f106020b = paint;
            paint.setAntiAlias(true);
            this.f106020b.setTextAlign(Paint.Align.CENTER);
        }
        this.f106020b.setTextSize((int) (element.getFontPixel() * ((f * 1.0f) / i3)));
        int color = -1;
        if (!TextUtils.isEmpty(element.getTextColor())) {
            try {
                color = Color.parseColor(element.getTextColor());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f106020b.setColor(color);
        Rect rect = new Rect();
        int iM207216d = wnk0.m207216d(text);
        int textSize = (int) (width / this.f106020b.getTextSize());
        if (maxLen <= textSize) {
            int i4 = maxLen * 2;
            if (iM207216d > i4) {
                text = wnk0.m207213a(text, i4) + "…";
            }
        } else if (iM207216d > textSize * 2) {
            text = wnk0.m207213a(text, (textSize - 1) * 2) + "…";
        }
        this.f106020b.getTextBounds(text, 0, text.length(), rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (width < iWidth) {
            width = iWidth;
        }
        if (height < iHeight) {
            height = iHeight;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = this.f106019a;
        if (canvas == null) {
            this.f106019a = new Canvas(bitmapCreateBitmap);
        } else {
            canvas.setBitmap(bitmapCreateBitmap);
            this.f106019a.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        if (bitmapM152667a.getWidth() != width || bitmapM152667a.getHeight() != height) {
            bitmapM152667a = Bitmap.createScaledBitmap(bitmapM152667a, width, height, true);
        }
        this.f106019a.drawBitmap(bitmapM152667a, 0.0f, 0.0f, this.f106020b);
        Paint.FontMetrics fontMetrics = this.f106020b.getFontMetrics();
        this.f106019a.drawText(text, width * 0.5f, (int) (((height * 0.5f) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f106020b);
        return bitmapCreateBitmap;
    }
}
