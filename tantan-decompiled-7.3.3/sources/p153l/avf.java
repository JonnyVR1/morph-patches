package p153l;

import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class avf implements jtl {

    /* JADX INFO: renamed from: a */
    private int f73615a = 0;

    /* JADX INFO: renamed from: b */
    private int f73616b = 100;

    /* JADX INFO: renamed from: c */
    private int f73617c = 100;

    /* JADX INFO: renamed from: d */
    private int f73618d = 0;

    @Override // p153l.jtl
    /* JADX INFO: renamed from: a */
    public boolean mo100462a(IProcessOutput iProcessOutput) {
        if (this.f73616b <= 0) {
            return true;
        }
        if (iProcessOutput.m19367a() > 0) {
            int i = this.f73615a;
            if (i % this.f73616b == 0) {
                this.f73615a = 1;
                return false;
            }
            this.f73615a = i + 1;
            this.f73618d = 0;
        } else {
            int i2 = this.f73618d + 1;
            this.f73618d = i2;
            if (i2 == this.f73617c) {
                this.f73618d = 0;
                return false;
            }
        }
        return true;
    }
}
