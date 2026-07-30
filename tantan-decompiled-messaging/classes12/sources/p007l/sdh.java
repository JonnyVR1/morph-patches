package p007l;

import android.content.Context;
import android.text.style.ImageSpan;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sdh extends ImageSpan {

    /* JADX INFO: renamed from: a */
    public final String f12890a;

    public sdh(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, @ColorInt int i6, float f2, boolean z, int i7) {
        super(new rdh(context, str, i, i2, i3, i4, i5, f, 14, z, i7).m13897c(i6, f2), str);
        this.f12890a = str;
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public String toString() {
        return this.f12890a;
    }

    public sdh(Context context, String str, int i, int i2, int i3, int i4, int i5, float f, boolean z, int i6) {
        super(new rdh(context, str, i, i2, i3, i4, i5, f, 14, z, i6), str);
        this.f12890a = str;
    }
}
