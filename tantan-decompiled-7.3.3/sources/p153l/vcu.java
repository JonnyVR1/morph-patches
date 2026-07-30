package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class vcu extends ar2<cdu> {

    /* JADX INFO: renamed from: a */
    public final String f183485a;

    /* JADX INFO: renamed from: b */
    public final int f183486b;

    /* JADX INFO: renamed from: c */
    public final Act f183487c;

    public vcu(Act act, String str, int i) {
        super(act);
        this.f183487c = act;
        this.f183485a = str;
        this.f183486b = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m200834g0(Bundle bundle) {
        String string;
        String string2;
        int i = this.f183486b;
        if (i == 1) {
            string = tbs.f172988a.getString(R$string.f44953E0);
            string2 = tbs.f172988a.getString(R$string.f44947C0);
        } else if (i == 2) {
            string = tbs.f172988a.getString(R$string.f44944B0);
            string2 = tbs.f172988a.getString(R$string.f44950D0);
        } else if (i == 3) {
            string = tbs.f172988a.getString(R$string.f44944B0);
            string2 = tbs.f172988a.getString(R$string.f44983T);
        } else if (i != 4) {
            string = null;
            string2 = null;
        } else {
            string = tbs.f172988a.getString(R$string.f44944B0);
            string2 = tbs.f172988a.getString(R$string.f44947C0);
        }
        int i2 = this.f183486b;
        V v2 = this.viewModel;
        if (i2 == 1) {
            ((cdu) v2).m109254s(this.f183485a);
        } else {
            ((cdu) v2).m109255u(this.f183485a, string, string2);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.ucu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178463a.m200834g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m200835f0() {
        int i = this.f183486b;
        return i == 1 || i == 4;
    }

    /* JADX INFO: renamed from: h0 */
    public void m200836h0() {
        int i = this.f183486b;
        if (i == 2) {
            ppi0.m173207l().m173230z(this.f183487c, 1);
        } else {
            if (i != 3) {
                return;
            }
            ppi0.m173207l().m173230z(this.f183487c, 2);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m200837i0() {
        int i = this.f183486b;
        if (i == 1) {
            ppi0.m173207l().m173209B(this.f183487c);
            return;
        }
        if (i == 2) {
            ppi0.m173207l().m173208A(this.f183487c);
        } else if (i == 3) {
            ppi0.m173207l().m173208A(this.f183487c);
        } else {
            if (i != 4) {
                return;
            }
            ppi0.m173207l().m173208A(this.f183487c);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
