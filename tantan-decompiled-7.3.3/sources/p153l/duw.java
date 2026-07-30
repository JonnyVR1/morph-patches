package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class duw extends px2 {
    public duw(Context context) {
        super(context);
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: D */
    public float mo118218D() {
        return super.mo118218D();
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: E */
    public float mo118219E() {
        return super.mo118219E();
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: F */
    public float mo118220F() {
        return super.mo118220F();
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: W */
    public boolean mo118221W() {
        if (!gra.m131596L3()) {
            return super.mo118221W();
        }
        if (gra.m131773y()) {
            return gra.m131589K1() && CoreModule.f18264c.f20446z2.m31253r3();
        }
        return true;
    }

    @Override // p153l.px2, p153l.ox2
    @NonNull
    /* JADX INFO: renamed from: f */
    public qn2 mo111754f() {
        return (IntlCountryCodeController.m29125v() || !gra.m131773y()) ? super.mo111754f() : new iof();
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: u */
    public float mo118222u() {
        if (gra.m131773y()) {
            return super.mo118222u();
        }
        if (s7a.m184994w()) {
            return qa00.f156326m;
        }
        return gra.m131596L3() ? m169623H().m195491a() : super.mo118222u();
    }

    @Override // p153l.ox2
    /* JADX INFO: renamed from: v */
    public float mo118223v() {
        return gra.m131606N3() ? qa00.m175859d(20.0f) : super.mo118223v();
    }
}
