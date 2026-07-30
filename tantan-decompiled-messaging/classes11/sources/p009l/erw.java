package p009l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import l.g6a;
import l.t100;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class erw extends ax2 {
    public erw(Context context) {
        super(context);
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: D */
    public float mo14098D() {
        return super.mo14098D();
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: E */
    public float mo14099E() {
        return super.mo14099E();
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: F */
    public float mo14100F() {
        return super.mo14100F();
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: W */
    public boolean mo14101W() {
        if (!upa.L3()) {
            return super.mo14101W();
        }
        if (upa.y()) {
            return upa.K1() && CoreModule.c.z2.r3();
        }
        return true;
    }

    @Override // p009l.ax2, p009l.zw2
    @NonNull
    /* JADX INFO: renamed from: f */
    public jn2 mo11680f() {
        return (IntlCountryCodeController.v() || !upa.y()) ? super.mo11680f() : new cnf();
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: u */
    public float mo14102u() {
        if (upa.y()) {
            return super.mo14102u();
        }
        if (g6a.w()) {
            return t100.m;
        }
        return upa.L3() ? m25992H().m20802a() : super.mo14102u();
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: v */
    public float mo14103v() {
        return upa.N3() ? t100.d(20.0f) : super.mo14103v();
    }
}
