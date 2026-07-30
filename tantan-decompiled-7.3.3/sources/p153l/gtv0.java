package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class gtv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public glw0 f106451a;

    /* JADX INFO: renamed from: b */
    public glw0 f106452b;

    /* JADX INFO: renamed from: c */
    public boolean f106453c;

    /* JADX INFO: renamed from: d */
    public boolean f106454d;

    /* JADX INFO: renamed from: e */
    public final boolean f106455e = false;

    /* JADX INFO: renamed from: f */
    public final boolean f106456f;

    public gtv0(glw0 glw0Var, glw0 glw0Var2, boolean z, boolean z2, boolean z3) {
        this.f106451a = glw0Var;
        this.f106452b = glw0Var2;
        this.f106453c = z;
        this.f106454d = z2;
        this.f106456f = z3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f106455e) {
            return;
        }
        Bundle bundleM103038a = b8w0.m103038a(bundle, "pii");
        if (!this.f106456f) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168038K2)).booleanValue()) {
                if (this.f106451a.m130721c()) {
                    bundleM103038a.putString("paidv1_id_android", this.f106451a.m130720b());
                    bundleM103038a.putLong("paidv1_creation_time_android", this.f106451a.m130719a());
                }
            } else if (this.f106456f) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168062M2)).booleanValue()) {
                    if (this.f106451a.m130721c()) {
                        bundleM103038a.putString("paidv1_id_android", this.f106451a.m130720b());
                        bundleM103038a.putLong("paidv1_creation_time_android", this.f106451a.m130719a());
                    }
                }
            }
        } else if (this.f106456f) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168062M2)).booleanValue()) {
                if (this.f106451a.m130721c()) {
                    bundleM103038a.putString("paidv1_id_android", this.f106451a.m130720b());
                    bundleM103038a.putLong("paidv1_creation_time_android", this.f106451a.m130719a());
                }
            }
        }
        if (!this.f106456f) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168050L2)).booleanValue()) {
                if (this.f106452b.m130721c()) {
                    bundleM103038a.putString("paidv2_id_android", this.f106452b.m130720b());
                    bundleM103038a.putLong("paidv2_creation_time_android", this.f106452b.m130719a());
                }
                bundleM103038a.putBoolean("paidv2_pub_option_android", this.f106453c);
                bundleM103038a.putBoolean("paidv2_user_option_android", this.f106454d);
            } else if (this.f106456f) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168074N2)).booleanValue()) {
                    if (this.f106452b.m130721c()) {
                        bundleM103038a.putString("paidv2_id_android", this.f106452b.m130720b());
                        bundleM103038a.putLong("paidv2_creation_time_android", this.f106452b.m130719a());
                    }
                    bundleM103038a.putBoolean("paidv2_pub_option_android", this.f106453c);
                    bundleM103038a.putBoolean("paidv2_user_option_android", this.f106454d);
                }
            }
        } else if (this.f106456f) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168074N2)).booleanValue()) {
                if (this.f106452b.m130721c()) {
                    bundleM103038a.putString("paidv2_id_android", this.f106452b.m130720b());
                    bundleM103038a.putLong("paidv2_creation_time_android", this.f106452b.m130719a());
                }
                bundleM103038a.putBoolean("paidv2_pub_option_android", this.f106453c);
                bundleM103038a.putBoolean("paidv2_user_option_android", this.f106454d);
            }
        }
        if (bundleM103038a.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleM103038a);
    }

    public gtv0(boolean z) {
        this.f106456f = z;
    }
}
