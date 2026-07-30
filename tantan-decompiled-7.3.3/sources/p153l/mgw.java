package p153l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcBean;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class mgw {

    /* JADX INFO: renamed from: a */
    public StaticLayout f136802a;

    /* JADX INFO: renamed from: b */
    public StaticLayout f136803b;

    /* JADX INFO: renamed from: c */
    public Rect[] f136804c;

    /* JADX INFO: renamed from: d */
    public Rect[] f136805d;

    /* JADX INFO: renamed from: e */
    public Rect[] f136806e;

    /* JADX INFO: renamed from: f */
    public LrcBean f136807f;

    public mgw(LrcBean lrcBean, @NonNull TextPaint textPaint, int i) {
        this.f136807f = lrcBean;
        m158395e(null, textPaint, i);
    }

    /* JADX INFO: renamed from: a */
    public void m158391a(Canvas canvas) {
        this.f136802a.draw(canvas);
    }

    /* JADX INFO: renamed from: b */
    public void m158392b(Canvas canvas) {
        this.f136803b.draw(canvas);
    }

    /* JADX INFO: renamed from: c */
    public Rect[] m158393c(long j) {
        List<LrcBean.Tone> list;
        float f;
        LrcBean lrcBean = this.f136807f;
        if (lrcBean == null || (list = lrcBean.tones) == null) {
            return null;
        }
        int i = 0;
        int iWidth = 0;
        while (true) {
            f = 0.0f;
            if (i >= list.size()) {
                break;
            }
            LrcBean.Tone tone = list.get(i);
            if (j < tone.end) {
                Rect[] rectArr = this.f136805d;
                int iWidth2 = i == 0 ? rectArr[i].width() : rectArr[i].width() - this.f136805d[i - 1].width();
                long j2 = tone.begin;
                float f2 = (j - j2) / (tone.end - j2);
                f = (f2 > 0.0f ? f2 : 0.0f) * iWidth2;
                break;
            }
            iWidth = this.f136803b.getLineCount() == 1 ? i == list.size() - 1 ? this.f136806e[0].width() : this.f136805d[i].width() : this.f136805d[i].width();
            i++;
        }
        int i2 = (int) (iWidth + f);
        for (int i3 = 0; i3 < this.f136803b.getLineCount(); i3++) {
            int iWidth3 = this.f136806e[i3].width();
            Rect rect = this.f136804c[i3];
            Rect rect2 = this.f136806e[i3];
            int i4 = rect2.left;
            rect.left = i4;
            rect.right = rect2.right;
            if (iWidth3 > i2) {
                rect.right = i4 + i2;
                i2 = 0;
            } else {
                i2 -= iWidth3;
            }
        }
        return this.f136804c;
    }

    /* JADX INFO: renamed from: d */
    public int m158394d() {
        StaticLayout staticLayout = this.f136802a;
        if (staticLayout == null) {
            return 0;
        }
        return staticLayout.getHeight();
    }

    /* JADX INFO: renamed from: e */
    public final void m158395e(@Nullable TextPaint textPaint, @NonNull TextPaint textPaint2, int i) {
        List<LrcBean.Tone> list;
        int i2;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StringBuilder sb = new StringBuilder();
        LrcBean lrcBean = this.f136807f;
        if (lrcBean == null || (list = lrcBean.tones) == null) {
            return;
        }
        this.f136805d = new Rect[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            LrcBean.Tone tone = list.get(i3);
            Rect rect = new Rect();
            this.f136805d[i3] = rect;
            String str = tone.word;
            if (tone.lang != LrcBean.Lang.Chinese) {
                str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            }
            sb.append(str);
            String string = sb.toString();
            textPaint2.getTextBounds(string, 0, string.length(), rect);
        }
        String string2 = sb.toString();
        if (textPaint != null) {
            i2 = i;
            this.f136803b = new StaticLayout(string2, textPaint, i2, alignment, 1.0f, 0.0f, false);
        } else {
            i2 = i;
        }
        StaticLayout staticLayout = new StaticLayout(string2, textPaint2, i2, alignment, 1.0f, 0.0f, false);
        this.f136802a = staticLayout;
        int lineCount = staticLayout.getLineCount();
        this.f136806e = new Rect[lineCount];
        this.f136804c = new Rect[lineCount];
        for (int i4 = 0; i4 < lineCount; i4++) {
            Rect rect2 = new Rect();
            this.f136802a.getLineBounds(i4, rect2);
            rect2.left = (int) this.f136802a.getLineLeft(i4);
            rect2.right = (int) this.f136802a.getLineRight(i4);
            this.f136806e[i4] = rect2;
            this.f136804c[i4] = new Rect(rect2);
        }
    }

    public mgw(LrcBean lrcBean, @Nullable TextPaint textPaint, @NonNull TextPaint textPaint2, int i) {
        this.f136807f = lrcBean;
        m158395e(textPaint, textPaint2, i);
    }
}
