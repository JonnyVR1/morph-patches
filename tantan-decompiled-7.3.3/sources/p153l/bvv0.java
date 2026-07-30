package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.OMSMercuryType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class bvv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f78642a;

    /* JADX INFO: renamed from: b */
    public final boolean f78643b;

    /* JADX INFO: renamed from: c */
    public final String f78644c;

    /* JADX INFO: renamed from: d */
    public final boolean f78645d;

    /* JADX INFO: renamed from: e */
    public final boolean f78646e;

    /* JADX INFO: renamed from: f */
    public final boolean f78647f;

    /* JADX INFO: renamed from: g */
    public final String f78648g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f78649h;

    /* JADX INFO: renamed from: i */
    public final String f78650i;

    /* JADX INFO: renamed from: j */
    public final String f78651j;

    /* JADX INFO: renamed from: k */
    public final String f78652k;

    /* JADX INFO: renamed from: l */
    public final boolean f78653l;

    /* JADX INFO: renamed from: m */
    public final String f78654m;

    /* JADX INFO: renamed from: n */
    public final long f78655n;

    /* JADX INFO: renamed from: o */
    public final boolean f78656o;

    /* JADX INFO: renamed from: p */
    public final String f78657p;

    /* JADX INFO: renamed from: q */
    public final int f78658q;

    public bvv0(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j, boolean z7, String str7, int i) {
        this.f78642a = z;
        this.f78643b = z2;
        this.f78644c = str;
        this.f78645d = z3;
        this.f78646e = z4;
        this.f78647f = z5;
        this.f78648g = str2;
        this.f78649h = arrayList;
        this.f78650i = str3;
        this.f78651j = str4;
        this.f78652k = str5;
        this.f78653l = z6;
        this.f78654m = str6;
        this.f78655n = j;
        this.f78656o = z7;
        this.f78657p = str7;
        this.f78658q = i;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f78642a);
        bundle.putBoolean("coh", this.f78643b);
        bundle.putString("gl", this.f78644c);
        bundle.putBoolean("simulator", this.f78645d);
        bundle.putBoolean("is_latchsky", this.f78646e);
        bundle.putInt("build_api_level", this.f78658q);
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168544ya)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f78647f);
        }
        bundle.putString("hl", this.f78648g);
        if (!this.f78649h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f78649h);
        }
        bundle.putString(OMSMercuryType.f39640mv, this.f78650i);
        bundle.putString("submodel", this.f78654m);
        Bundle bundleM103038a = b8w0.m103038a(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleM103038a);
        bundleM103038a.putString("build", this.f78652k);
        bundleM103038a.putLong("remaining_data_partition_space", this.f78655n);
        Bundle bundleM103038a2 = b8w0.m103038a(bundleM103038a, "browser");
        bundleM103038a.putBundle("browser", bundleM103038a2);
        bundleM103038a2.putBoolean("is_browser_custom_tabs_capable", this.f78653l);
        if (!TextUtils.isEmpty(this.f78651j)) {
            Bundle bundleM103038a3 = b8w0.m103038a(bundleM103038a, "play_store");
            bundleM103038a.putBundle("play_store", bundleM103038a3);
            bundleM103038a3.putString("package_version", this.f78651j);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168070Ma)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f78656o);
        }
        if (!TextUtils.isEmpty(this.f78657p)) {
            bundle.putString("v_unity", this.f78657p);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168034Ja)).booleanValue()) {
            b8w0.m103044g(bundle, "gotmt_l", true, ((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue());
            b8w0.m103044g(bundle, "gotmt_i", true, ((Boolean) jas0.m144075c().m176505a(sgs0.f167986Fa)).booleanValue());
        }
    }
}
