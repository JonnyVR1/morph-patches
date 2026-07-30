package p153l;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;

/* JADX INFO: loaded from: classes8.dex */
public class m3d0 {

    /* JADX INFO: renamed from: a */
    public Context f134661a;

    public m3d0(Context context) {
        this.f134661a = context;
    }

    @ColorInt
    /* JADX INFO: renamed from: a */
    public int m156923a(@ColorRes int i) {
        return j26.m143190c(this.f134661a, i);
    }

    /* JADX INFO: renamed from: b */
    public int m156924b(@DimenRes int i) {
        return Math.round(this.f134661a.getResources().getDimension(i));
    }
}
