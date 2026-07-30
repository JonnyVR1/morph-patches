package p149l;

import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ddc0 extends eci0 {

    /* JADX INFO: renamed from: B */
    protected yhm f85586B;

    public ddc0(String str) {
        super(str);
        m98670D(null);
    }

    /* JADX INFO: renamed from: G0 */
    public abstract void mo111000G0(boolean z);

    /* JADX INFO: renamed from: H0 */
    public abstract void mo111001H0(int i);

    /* JADX INFO: renamed from: I0 */
    public void m111002I0() {
        m115717s0();
    }

    /* JADX INFO: renamed from: J0 */
    public void m111003J0(boolean z) {
        m115714p0(6, z ? 1 : 0);
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: h */
    public void mo98696h() {
        yhm yhmVar = this.f85586B;
        if (yhmVar != null) {
            yhmVar.m214830e();
            m115696C0(this.f85586B);
        }
    }

    @Override // p149l.at2
    /* JADX INFO: renamed from: l */
    public void mo98700l(Message message) {
        super.mo98700l(message);
        int i = message.what;
        if (i == 6) {
            mo111000G0(message.arg1 == 1);
        } else {
            if (i != 7) {
                return;
            }
            mo111001H0(message.arg1);
        }
    }

    @Override // p149l.eci0
    /* JADX INFO: renamed from: x0 */
    public void mo111004x0(int i) {
        m115714p0(7, i);
    }

    @Override // p149l.eci0, p149l.at2
    /* JADX INFO: renamed from: y */
    public void mo98713y(tif0 tif0Var) {
        super.mo98713y(tif0Var);
        yhm yhmVar = this.f85586B;
        if (yhmVar != null) {
            yhmVar.mo177605n(tif0Var);
        }
    }
}
