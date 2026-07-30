package p009l;

import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dqc0 implements cqc0 {

    /* JADX INFO: renamed from: a */
    public final String f11951a;

    /* JADX INFO: renamed from: b */
    public final int f11952b;

    public dqc0(String str, int i) {
        this.f11951a = str;
        this.f11952b = i;
    }

    @Override // p009l.cqc0
    /* JADX INFO: renamed from: a */
    public String mo12761a() {
        int i = this.f11952b;
        if (i != 1) {
            return i != 2 ? "Static" : "Online";
        }
        return "Default";
    }

    @Override // p009l.cqc0
    public String asString() {
        if (this.f11952b == 0) {
            return "";
        }
        m13438b();
        return this.f11951a;
    }

    /* JADX INFO: renamed from: b */
    public final void m13438b() {
        if (this.f11951a != null) {
            return;
        }
        ig3.a("Value is null, and cannot be converted to the desired type.");
    }
}
