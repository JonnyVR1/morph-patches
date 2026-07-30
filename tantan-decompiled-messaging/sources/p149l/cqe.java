package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.TextUtils;
import com.immomo.velib.anim.model.Element;

/* JADX INFO: loaded from: classes7.dex */
public class cqe {

    /* JADX INFO: renamed from: a */
    private Canvas f82062a;

    /* JADX INFO: renamed from: b */
    private Paint f82063b;

    /* JADX INFO: renamed from: c */
    private String f82064c;

    /* JADX INFO: renamed from: d */
    private Element f82065d;

    /* JADX INFO: renamed from: a */
    public Bitmap m108254a(Element element) {
        this.f82064c = "";
        this.f82065d = element;
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
        if (this.f82063b == null) {
            Paint paint = new Paint();
            this.f82063b = paint;
            paint.setAntiAlias(true);
            this.f82063b.setStrokeWidth(2.0f);
            this.f82063b.setTextAlign(Paint.Align.CENTER);
        }
        this.f82063b.setTextSize((int) (fontSize * 2.0f));
        int color = -1;
        if (!TextUtils.isEmpty(element.getTextColor())) {
            try {
                color = Color.parseColor(element.getTextColor());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f82063b.setColor(color);
        Rect rect = new Rect();
        int i = maxLen * 2;
        if (qek0.m174218d(text) > i) {
            text = qek0.m174215a(text, i) + "…";
        }
        this.f82063b.getTextBounds(text, 0, text.length(), rect);
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
        Canvas canvas = this.f82062a;
        if (canvas == null) {
            this.f82062a = new Canvas(bitmapCreateBitmap2);
        } else {
            canvas.setBitmap(bitmapCreateBitmap2);
            this.f82062a.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        if (bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height) {
            bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, width, height, true);
        }
        this.f82062a.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f82063b);
        Paint.FontMetrics fontMetrics = this.f82063b.getFontMetrics();
        this.f82062a.drawText(text, width * 0.5f, (int) (((height * 0.5f) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f82063b);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m108255b(Element element, int i, int i2, int i3) throws Throwable {
        this.f82064c = "";
        this.f82065d = element;
        String text = element.getText();
        String backgroundPath = element.getBackgroundPath();
        element.getFontSize();
        int maxLen = element.getMaxLen();
        int height = ((int) (element.getHeight() * i2)) + 12;
        float f = i;
        int width = ((int) (element.getWidth() * f)) + 16;
        Bitmap bitmapM196705a = v23.m196705a(backgroundPath);
        if (bitmapM196705a == null) {
            bitmapM196705a = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        if (maxLen == 0) {
            maxLen = 5;
        }
        if (this.f82063b == null) {
            Paint paint = new Paint();
            this.f82063b = paint;
            paint.setAntiAlias(true);
            this.f82063b.setTextAlign(Paint.Align.CENTER);
        }
        this.f82063b.setTextSize((int) (element.getFontPixel() * ((f * 1.0f) / i3)));
        int color = -1;
        if (!TextUtils.isEmpty(element.getTextColor())) {
            try {
                color = Color.parseColor(element.getTextColor());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f82063b.setColor(color);
        Rect rect = new Rect();
        int iM174218d = qek0.m174218d(text);
        int textSize = (int) (width / this.f82063b.getTextSize());
        if (maxLen <= textSize) {
            int i4 = maxLen * 2;
            if (iM174218d > i4) {
                text = qek0.m174215a(text, i4) + "…";
            }
        } else if (iM174218d > textSize * 2) {
            text = qek0.m174215a(text, (textSize - 1) * 2) + "…";
        }
        this.f82063b.getTextBounds(text, 0, text.length(), rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        if (width < iWidth) {
            width = iWidth;
        }
        if (height < iHeight) {
            height = iHeight;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = this.f82062a;
        if (canvas == null) {
            this.f82062a = new Canvas(bitmapCreateBitmap);
        } else {
            canvas.setBitmap(bitmapCreateBitmap);
            this.f82062a.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        if (bitmapM196705a.getWidth() != width || bitmapM196705a.getHeight() != height) {
            bitmapM196705a = Bitmap.createScaledBitmap(bitmapM196705a, width, height, true);
        }
        this.f82062a.drawBitmap(bitmapM196705a, 0.0f, 0.0f, this.f82063b);
        Paint.FontMetrics fontMetrics = this.f82063b.getFontMetrics();
        this.f82062a.drawText(text, width * 0.5f, (int) (((height * 0.5f) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), this.f82063b);
        return bitmapCreateBitmap;
    }
}
