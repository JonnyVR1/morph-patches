package p149l;

import android.content.Context;
import android.text.style.ImageSpan;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes11.dex */
public class au4 extends ImageSpan {

    /* JADX INFO: renamed from: a */
    public final String f71723a;

    public au4(Context context, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, @ColorInt int i7, float f4, boolean z) {
        super(new zt4(context, str, i, i2, i3, i4, i5, i6, f, f2, f3, i7, f4, z), str);
        this.f71723a = str;
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public String toString() {
        return this.f71723a;
    }
}
