package p149l;

import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class mtf implements wql {

    /* JADX INFO: renamed from: a */
    private int f135589a = 0;

    /* JADX INFO: renamed from: b */
    private int f135590b = 100;

    /* JADX INFO: renamed from: c */
    private int f135591c = 100;

    /* JADX INFO: renamed from: d */
    private int f135592d = 0;

    @Override // p149l.wql
    /* JADX INFO: renamed from: a */
    public boolean mo156218a(IProcessOutput iProcessOutput) {
        if (this.f135590b <= 0) {
            return true;
        }
        if (iProcessOutput.m18290a() > 0) {
            int i = this.f135589a;
            if (i % this.f135590b == 0) {
                this.f135589a = 1;
                return false;
            }
            this.f135589a = i + 1;
            this.f135592d = 0;
        } else {
            int i2 = this.f135592d + 1;
            this.f135592d = i2;
            if (i2 == this.f135591c) {
                this.f135592d = 0;
                return false;
            }
        }
        return true;
    }
}
