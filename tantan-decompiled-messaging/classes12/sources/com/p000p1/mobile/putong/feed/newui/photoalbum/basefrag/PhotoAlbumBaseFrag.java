package com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import l.d30;
import l.j760;
import l.xaj0;
import p007l.py60;
import p007l.sy60;
import p007l.xzl;
import p007l.yzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumBaseFrag extends PutongFrag implements xzl {

    /* JADX INFO: renamed from: A */
    public py60 f2912A;

    /* JADX INFO: renamed from: B */
    public String f2913B;

    /* JADX INFO: renamed from: C */
    public yzl f2914C;

    /* JADX INFO: renamed from: z */
    public sy60 f2915z;

    /* JADX INFO: renamed from: N4 */
    public static PhotoAlbumBaseFrag m5047N4(boolean z, String str, String str2, int i, String str3, int i2, boolean z2) {
        PhotoAlbumBaseFrag photoAlbumBaseFrag = new PhotoAlbumBaseFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("start_home_card", z);
        bundle.putString("user_id", str);
        bundle.putString("from", str2);
        bundle.putInt("selected_item_position", i);
        bundle.putString("target_moment_id", str3);
        bundle.putInt("page_type", i2);
        bundle.putBoolean("from_feed_act", z2);
        photoAlbumBaseFrag.setArguments(bundle);
        return photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: B3 */
    public void m5048B3(j760<User, Boolean> j760Var, boolean z) {
        this.f2912A.m13331X0(j760Var, z);
    }

    /* JADX INFO: renamed from: M4 */
    public void m5049M4(Moment moment) {
        this.f2912A.m13325U0(moment);
    }

    /* JADX INFO: renamed from: O4 */
    public void mo5050O4() {
        this.f2912A = new py60(this);
        sy60 sy60Var = new sy60(this);
        this.f2915z = sy60Var;
        this.f2912A.C(sy60Var);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m5051P0() {
        sy60 sy60Var = this.f2915z;
        if (sy60Var == null) {
            return false;
        }
        return sy60Var.mo10060w();
    }

    /* JADX INFO: renamed from: P4 */
    public void m5052P4(Moment moment) {
        this.f2912A.m13329W0(moment);
    }

    /* JADX INFO: renamed from: Q4 */
    public Links m5053Q4() {
        return this.f2912A.f12020k;
    }

    /* JADX INFO: renamed from: R4 */
    public List<Moment> m5054R4() {
        return this.f2912A.f12019j;
    }

    /* JADX INFO: renamed from: S4 */
    public final py60 m5055S4() {
        if (this.f2912A == null) {
            mo5050O4();
        }
        return this.f2912A;
    }

    /* JADX INFO: renamed from: T4 */
    public String m5056T4() {
        return this.f2912A.f12012c;
    }

    /* JADX INFO: renamed from: U4 */
    public final sy60 m5057U4() {
        if (this.f2915z == null) {
            mo5050O4();
        }
        return this.f2915z;
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m5058V4() {
        return this.f2912A.m13336c1();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m5059W4(int i, List<Moment> list) {
        return m5055S4().m13340h1(i, list);
    }

    /* JADX INFO: renamed from: X4 */
    public void m5060X4(Map<String, Moment> map) {
        this.f2912A.m13309C1(map);
    }

    /* JADX INFO: renamed from: Y4 */
    public void m5061Y4(String str, boolean z) {
        this.f2912A.m13310D1(str, z);
    }

    /* JADX INFO: renamed from: Z4 */
    public void m5062Z4() {
        this.f2912A.mo9612E1();
    }

    /* JADX INFO: renamed from: a5 */
    public void m5063a5() {
        this.f2915z.mo10062z();
    }

    /* JADX INFO: renamed from: b5 */
    public void m5064b5() {
        this.f2915z.m14385C();
    }

    /* JADX INFO: renamed from: c5 */
    public void m5065c5(j760<Links, List<Moment>> j760Var) {
        if (NullChecker.a(this.f2914C)) {
            this.f2914C.m17203F2(j760Var);
        }
        this.f2912A.m13314J1(j760Var);
    }

    /* JADX INFO: renamed from: d5 */
    public void m5066d5(j760<Links, List<Moment>> j760Var) {
        if (NullChecker.a(this.f2914C)) {
            this.f2914C.mo8712a1(j760Var);
        }
        this.f2912A.mo9613L1(j760Var);
    }

    /* JADX INFO: renamed from: e5 */
    public void m5067e5(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var) {
        this.f2912A.m13315N1(xaj0Var);
    }

    /* JADX INFO: renamed from: f4 */
    public void m5068f4() {
        super.f4();
        m5057U4();
        this.f2912A.m13333a0();
    }

    /* JADX INFO: renamed from: f5 */
    public void m5069f5() {
        if (NullChecker.b(this.f2915z)) {
            this.f2915z.m14388F();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m5070g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f2915z.mo10059v(bundle);
    }

    /* JADX INFO: renamed from: g5 */
    public void m5071g5(d30 d30Var) {
        m5055S4().m13326U1(d30Var);
    }

    /* JADX INFO: renamed from: h5 */
    public void m5072h5(yzl yzlVar) {
        this.f2914C = yzlVar;
    }

    /* JADX INFO: renamed from: i5 */
    public void m5073i5(String str) {
        this.f2913B = str;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2915z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public void m5074j5(boolean z) {
        m5057U4().m14391J(z);
    }

    /* JADX INFO: renamed from: k5 */
    public void m5075k5(boolean z) {
        m5057U4().m14392K(z);
    }

    /* JADX INFO: renamed from: l5 */
    public void m5076l5(boolean z) {
        sy60 sy60Var = this.f2915z;
        if (sy60Var == null) {
            return;
        }
        sy60Var.mo10051L(z);
    }

    /* JADX INFO: renamed from: m5 */
    public void m5077m5(Map<String, User> map) {
        this.f2912A.m13330W1(map);
    }

    /* JADX INFO: renamed from: n4 */
    public void m5078n4(Bundle bundle) {
        m5055S4().m13338f1();
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    public void onPause() {
        PhotoAlbumPictureView.m4886u(act().getWindow().getDecorView(), false);
        this.f2915z.m14383A();
        super/*com.p1.mobile.android.app.Frag*/.onPause();
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
        this.f2915z.m14383A();
    }

    /* JADX INFO: renamed from: y4 */
    public void mo5079y4() {
        this.f2915z.m14394d();
    }
}
