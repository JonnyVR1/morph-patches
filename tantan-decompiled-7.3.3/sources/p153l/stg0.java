package p153l;

import Sudthrow.Sudint;

/* JADX INFO: loaded from: classes.dex */
public abstract class stg0 extends phg0 {
    public stg0(int i) {
        super(i);
    }

    @Override // p153l.phg0
    /* JADX INFO: renamed from: a */
    public void mo122951a() throws Sudint {
        if (!this.f152432a) {
            throw new Sudint("Control frame cant have fin==false set");
        }
        if (this.f152436e) {
            throw new Sudint("Control frame cant have rsv1==true set");
        }
        if (this.f152437f) {
            throw new Sudint("Control frame cant have rsv2==true set");
        }
        if (this.f152438g) {
            throw new Sudint("Control frame cant have rsv3==true set");
        }
    }
}
