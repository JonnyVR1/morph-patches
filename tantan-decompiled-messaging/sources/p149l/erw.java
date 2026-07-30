package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes11.dex */
public class erw extends ax2 {
    public erw(Context context) {
        super(context);
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: D */
    public float mo117876D() {
        return super.mo117876D();
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: E */
    public float mo117877E() {
        return super.mo117877E();
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: F */
    public float mo117878F() {
        return super.mo117878F();
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: W */
    public boolean mo117879W() {
        if (!upa.m194665L3()) {
            return super.mo117879W();
        }
        if (upa.m194842y()) {
            return upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3();
        }
        return true;
    }

    @Override // p149l.ax2, p149l.zw2
    @NonNull
    /* JADX INFO: renamed from: f */
    public jn2 mo99353f() {
        return (IntlCountryCodeController.m28126v() || !upa.m194842y()) ? super.mo99353f() : new cnf();
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: u */
    public float mo117880u() {
        if (upa.m194842y()) {
            return super.mo117880u();
        }
        if (g6a.m124574w()) {
            return t100.f167264m;
        }
        return upa.m194665L3() ? m220510H().m172936a() : super.mo117880u();
    }

    @Override // p149l.zw2
    /* JADX INFO: renamed from: v */
    public float mo117881v() {
        return upa.m194675N3() ? t100.m186890d(20.0f) : super.mo117881v();
    }
}
