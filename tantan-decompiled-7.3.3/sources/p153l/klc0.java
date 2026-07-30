package p153l;

import android.os.Message;

/* JADX INFO: loaded from: classes7.dex */
public abstract class klc0 extends eli0 {

    /* JADX INFO: renamed from: B */
    protected bkm f127363B;

    public klc0(String str) {
        super(str);
        m177846D(null);
    }

    /* JADX INFO: renamed from: G0 */
    public abstract void mo150361G0(boolean z);

    /* JADX INFO: renamed from: H0 */
    public abstract void mo150362H0(int i);

    /* JADX INFO: renamed from: I0 */
    public void m150363I0() {
        m121215s0();
    }

    /* JADX INFO: renamed from: J0 */
    public void m150364J0(boolean z) {
        m121211p0(6, z ? 1 : 0);
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: h */
    public void mo96762h() {
        bkm bkmVar = this.f127363B;
        if (bkmVar != null) {
            bkmVar.m104823e();
            m121183C0(this.f127363B);
        }
    }

    @Override // p153l.qt2
    /* JADX INFO: renamed from: l */
    public void mo96764l(Message message) {
        super.mo96764l(message);
        int i = message.what;
        if (i == 6) {
            mo150361G0(message.arg1 == 1);
        } else {
            if (i != 7) {
                return;
            }
            mo150362H0(message.arg1);
        }
    }

    @Override // p153l.eli0
    /* JADX INFO: renamed from: x0 */
    public void mo96768x0(int i) {
        m121211p0(7, i);
    }

    @Override // p153l.eli0, p153l.qt2
    /* JADX INFO: renamed from: y */
    public void mo96769y(crf0 crf0Var) {
        super.mo96769y(crf0Var);
        bkm bkmVar = this.f127363B;
        if (bkmVar != null) {
            bkmVar.mo104832n(crf0Var);
        }
    }
}
