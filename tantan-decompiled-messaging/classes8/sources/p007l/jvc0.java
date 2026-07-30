package p007l;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import l.e16;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class jvc0 {

    /* JADX INFO: renamed from: a */
    public Context f3030a;

    public jvc0(Context context) {
        this.f3030a = context;
    }

    @ColorInt
    /* JADX INFO: renamed from: a */
    public int m9559a(@ColorRes int i) {
        return e16.c(this.f3030a, i);
    }

    /* JADX INFO: renamed from: b */
    public int m9560b(@DimenRes int i) {
        return Math.round(this.f3030a.getResources().getDimension(i));
    }
}
