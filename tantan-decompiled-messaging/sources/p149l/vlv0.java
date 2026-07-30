package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.OMSMercuryType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class vlv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f181995a;

    /* JADX INFO: renamed from: b */
    public final boolean f181996b;

    /* JADX INFO: renamed from: c */
    public final String f181997c;

    /* JADX INFO: renamed from: d */
    public final boolean f181998d;

    /* JADX INFO: renamed from: e */
    public final boolean f181999e;

    /* JADX INFO: renamed from: f */
    public final boolean f182000f;

    /* JADX INFO: renamed from: g */
    public final String f182001g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f182002h;

    /* JADX INFO: renamed from: i */
    public final String f182003i;

    /* JADX INFO: renamed from: j */
    public final String f182004j;

    /* JADX INFO: renamed from: k */
    public final String f182005k;

    /* JADX INFO: renamed from: l */
    public final boolean f182006l;

    /* JADX INFO: renamed from: m */
    public final String f182007m;

    /* JADX INFO: renamed from: n */
    public final long f182008n;

    /* JADX INFO: renamed from: o */
    public final boolean f182009o;

    /* JADX INFO: renamed from: p */
    public final String f182010p;

    /* JADX INFO: renamed from: q */
    public final int f182011q;

    public vlv0(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j, boolean z7, String str7, int i) {
        this.f181995a = z;
        this.f181996b = z2;
        this.f181997c = str;
        this.f181998d = z3;
        this.f181999e = z4;
        this.f182000f = z5;
        this.f182001g = str2;
        this.f182002h = arrayList;
        this.f182003i = str3;
        this.f182004j = str4;
        this.f182005k = str5;
        this.f182006l = z6;
        this.f182007m = str6;
        this.f182008n = j;
        this.f182009o = z7;
        this.f182010p = str7;
        this.f182011q = i;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f181995a);
        bundle.putBoolean("coh", this.f181996b);
        bundle.putString("gl", this.f181997c);
        bundle.putBoolean("simulator", this.f181998d);
        bundle.putBoolean("is_latchsky", this.f181999e);
        bundle.putInt("build_api_level", this.f182011q);
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132473ya)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f182000f);
        }
        bundle.putString("hl", this.f182001g);
        if (!this.f182002h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f182002h);
        }
        bundle.putString(OMSMercuryType.f38792mv, this.f182003i);
        bundle.putString("submodel", this.f182007m);
        Bundle bundleM200674a = vyv0.m200674a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleM200674a);
        bundleM200674a.putString("build", this.f182005k);
        bundleM200674a.putLong("remaining_data_partition_space", this.f182008n);
        Bundle bundleM200674a2 = vyv0.m200674a(bundleM200674a, "browser");
        bundleM200674a.putBundle("browser", bundleM200674a2);
        bundleM200674a2.putBoolean("is_browser_custom_tabs_capable", this.f182006l);
        if (!TextUtils.isEmpty(this.f182004j)) {
            Bundle bundleM200674a3 = vyv0.m200674a(bundleM200674a, "play_store");
            bundleM200674a.putBundle("play_store", bundleM200674a3);
            bundleM200674a3.putString("package_version", this.f182004j);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131999Ma)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f182009o);
        }
        if (!TextUtils.isEmpty(this.f182010p)) {
            bundle.putString("v_unity", this.f182010p);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131963Ja)).booleanValue()) {
            vyv0.m200680g(bundle, "gotmt_l", true, ((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue());
            vyv0.m200680g(bundle, "gotmt_i", true, ((Boolean) d1s0.m109677c().m144697a(m7s0.f131915Fa)).booleanValue());
        }
    }
}
