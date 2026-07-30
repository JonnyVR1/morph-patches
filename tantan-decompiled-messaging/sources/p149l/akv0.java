package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class akv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public acw0 f70321a;

    /* JADX INFO: renamed from: b */
    public acw0 f70322b;

    /* JADX INFO: renamed from: c */
    public boolean f70323c;

    /* JADX INFO: renamed from: d */
    public boolean f70324d;

    /* JADX INFO: renamed from: e */
    public final boolean f70325e = false;

    /* JADX INFO: renamed from: f */
    public final boolean f70326f;

    public akv0(acw0 acw0Var, acw0 acw0Var2, boolean z, boolean z2, boolean z3) {
        this.f70321a = acw0Var;
        this.f70322b = acw0Var2;
        this.f70323c = z;
        this.f70324d = z2;
        this.f70326f = z3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f70325e) {
            return;
        }
        Bundle bundleM200674a = vyv0.m200674a(bundle, "pii");
        if (!this.f70326f) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131967K2)).booleanValue()) {
                if (this.f70321a.m95847c()) {
                    bundleM200674a.putString("paidv1_id_android", this.f70321a.m95846b());
                    bundleM200674a.putLong("paidv1_creation_time_android", this.f70321a.m95845a());
                }
            } else if (this.f70326f) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131991M2)).booleanValue()) {
                    if (this.f70321a.m95847c()) {
                        bundleM200674a.putString("paidv1_id_android", this.f70321a.m95846b());
                        bundleM200674a.putLong("paidv1_creation_time_android", this.f70321a.m95845a());
                    }
                }
            }
        } else if (this.f70326f) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131991M2)).booleanValue()) {
                if (this.f70321a.m95847c()) {
                    bundleM200674a.putString("paidv1_id_android", this.f70321a.m95846b());
                    bundleM200674a.putLong("paidv1_creation_time_android", this.f70321a.m95845a());
                }
            }
        }
        if (!this.f70326f) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131979L2)).booleanValue()) {
                if (this.f70322b.m95847c()) {
                    bundleM200674a.putString("paidv2_id_android", this.f70322b.m95846b());
                    bundleM200674a.putLong("paidv2_creation_time_android", this.f70322b.m95845a());
                }
                bundleM200674a.putBoolean("paidv2_pub_option_android", this.f70323c);
                bundleM200674a.putBoolean("paidv2_user_option_android", this.f70324d);
            } else if (this.f70326f) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132003N2)).booleanValue()) {
                    if (this.f70322b.m95847c()) {
                        bundleM200674a.putString("paidv2_id_android", this.f70322b.m95846b());
                        bundleM200674a.putLong("paidv2_creation_time_android", this.f70322b.m95845a());
                    }
                    bundleM200674a.putBoolean("paidv2_pub_option_android", this.f70323c);
                    bundleM200674a.putBoolean("paidv2_user_option_android", this.f70324d);
                }
            }
        } else if (this.f70326f) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132003N2)).booleanValue()) {
                if (this.f70322b.m95847c()) {
                    bundleM200674a.putString("paidv2_id_android", this.f70322b.m95846b());
                    bundleM200674a.putLong("paidv2_creation_time_android", this.f70322b.m95845a());
                }
                bundleM200674a.putBoolean("paidv2_pub_option_android", this.f70323c);
                bundleM200674a.putBoolean("paidv2_user_option_android", this.f70324d);
            }
        }
        if (bundleM200674a.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleM200674a);
    }

    public akv0(boolean z) {
        this.f70326f = z;
    }
}
