package p149l;

import Sudthrow.Sudint;

/* JADX INFO: loaded from: classes.dex */
public abstract class klg0 extends h9g0 {
    public klg0(int i) {
        super(i);
    }

    @Override // p149l.h9g0
    /* JADX INFO: renamed from: a */
    public void mo127138a() throws Sudint {
        if (!this.f106580a) {
            throw new Sudint("Control frame cant have fin==false set");
        }
        if (this.f106584e) {
            throw new Sudint("Control frame cant have rsv1==true set");
        }
        if (this.f106585f) {
            throw new Sudint("Control frame cant have rsv2==true set");
        }
        if (this.f106586g) {
            throw new Sudint("Control frame cant have rsv3==true set");
        }
    }
}
