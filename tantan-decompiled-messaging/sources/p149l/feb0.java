package p149l;

import androidx.annotation.NonNull;
import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class feb0 {

    /* JADX INFO: renamed from: a */
    public String f97113a;

    /* JADX INFO: renamed from: b */
    public int f97114b;

    /* JADX INFO: renamed from: c */
    public int f97115c;

    /* JADX INFO: renamed from: d */
    public int f97116d;

    /* JADX INFO: renamed from: e */
    public int f97117e;

    /* JADX INFO: renamed from: f */
    public int f97118f = 0;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public feb0 clone() {
        feb0 feb0Var = new feb0();
        feb0Var.f97113a = this.f97113a;
        feb0Var.f97114b = this.f97114b;
        feb0Var.f97115c = this.f97115c;
        feb0Var.f97116d = this.f97116d;
        feb0Var.f97117e = this.f97117e;
        feb0Var.f97118f = this.f97118f;
        m121030b();
        return feb0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m121030b() {
        this.f97114b = 0;
        this.f97115c = 0;
        this.f97116d = 0;
    }

    @NonNull
    public String toString() {
        return this.f97113a + Constants.PACKNAME_END + this.f97114b + Constants.PACKNAME_END + this.f97115c + Constants.PACKNAME_END + this.f97116d + Constants.PACKNAME_END + this.f97117e + Constants.PACKNAME_END + this.f97118f;
    }
}
