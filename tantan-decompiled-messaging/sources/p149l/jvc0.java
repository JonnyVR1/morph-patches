package p149l;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;

/* JADX INFO: loaded from: classes8.dex */
public class jvc0 {

    /* JADX INFO: renamed from: a */
    public Context f119928a;

    public jvc0(Context context) {
        this.f119928a = context;
    }

    @ColorInt
    /* JADX INFO: renamed from: a */
    public int m143483a(@ColorRes int i) {
        return e16.m114375c(this.f119928a, i);
    }

    /* JADX INFO: renamed from: b */
    public int m143484b(@DimenRes int i) {
        return Math.round(this.f119928a.getResources().getDimension(i));
    }
}
