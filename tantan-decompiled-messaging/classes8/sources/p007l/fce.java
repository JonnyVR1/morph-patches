package p007l;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import l.ftd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class fce {

    /* JADX INFO: renamed from: a */
    public static ftd0 f2671a = new C0535a();

    /* JADX INFO: renamed from: l.fce$a */
    public class C0535a implements ftd0 {
        /* JADX INFO: renamed from: a */
        public Matrix m9085a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            matrix.setTranslate((int) (((rect.left + rect.width()) - i) + 0.5f), (int) (rect.top + ((rect.height() - i2) * 0.5f) + 0.5f));
            return matrix;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m9082a(double d, double d2, double d3, GradientDrawable.Orientation orientation) {
        int iFloor = (int) Math.floor(d * 1000.0d);
        int[] iArr = new int[iFloor + LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE];
        for (int i = 0; i < iFloor; i++) {
            iArr[i] = Color.argb((int) (255.0d * d2), 0, 0, 0);
        }
        for (int i2 = 0; i2 < 1000; i2++) {
            iArr[i2 + iFloor] = Color.argb((int) ((((Math.pow(i2, 1.0d) * (d3 - d2)) / Math.pow(999.0d, 1.0d)) + d2) * 255.0d), 0, 0, 0);
        }
        return new GradientDrawable(orientation, iArr);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m9083b(int i, float f) {
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setCornerRadius(f);
        paintDrawable.getPaint().setColor(i);
        return paintDrawable;
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m9084c(int i, float[] fArr) {
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setCornerRadii(fArr);
        paintDrawable.getPaint().setColor(i);
        return paintDrawable;
    }
}
