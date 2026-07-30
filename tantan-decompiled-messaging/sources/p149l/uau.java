package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class uau extends jq2<bbu> {

    /* JADX INFO: renamed from: a */
    public final String f175636a;

    /* JADX INFO: renamed from: b */
    public final int f175637b;

    /* JADX INFO: renamed from: c */
    public final Act f175638c;

    public uau(Act act, String str, int i) {
        super(act);
        this.f175638c = act;
        this.f175636a = str;
        this.f175637b = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m192801g0(Bundle bundle) {
        String string;
        String string2;
        int i = this.f175637b;
        if (i == 1) {
            string = s9s.f163227a.getString(R$string.f44105E0);
            string2 = s9s.f163227a.getString(R$string.f44099C0);
        } else if (i == 2) {
            string = s9s.f163227a.getString(R$string.f44096B0);
            string2 = s9s.f163227a.getString(R$string.f44102D0);
        } else if (i == 3) {
            string = s9s.f163227a.getString(R$string.f44096B0);
            string2 = s9s.f163227a.getString(R$string.f44135T);
        } else if (i != 4) {
            string = null;
            string2 = null;
        } else {
            string = s9s.f163227a.getString(R$string.f44096B0);
            string2 = s9s.f163227a.getString(R$string.f44099C0);
        }
        int i2 = this.f175637b;
        V v2 = this.viewModel;
        if (i2 == 1) {
            ((bbu) v2).m101029s(this.f175636a);
        } else {
            ((bbu) v2).m101030u(this.f175636a, string, string2);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.tau
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169186a.m192801g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m192802f0() {
        int i = this.f175637b;
        return i == 1 || i == 4;
    }

    /* JADX INFO: renamed from: h0 */
    public void m192803h0() {
        int i = this.f175637b;
        if (i == 2) {
            pgi0.m168730l().m168753z(this.f175638c, 1);
        } else {
            if (i != 3) {
                return;
            }
            pgi0.m168730l().m168753z(this.f175638c, 2);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m192804i0() {
        int i = this.f175637b;
        if (i == 1) {
            pgi0.m168730l().m168732B(this.f175638c);
            return;
        }
        if (i == 2) {
            pgi0.m168730l().m168731A(this.f175638c);
        } else if (i == 3) {
            pgi0.m168730l().m168731A(this.f175638c);
        } else {
            if (i != 4) {
                return;
            }
            pgi0.m168730l().m168731A(this.f175638c);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
