package com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import p149l.d30;
import p149l.j760;
import p149l.py60;
import p149l.sy60;
import p149l.xaj0;
import p149l.xzl;
import p149l.yzl;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumBaseFrag extends PutongFrag implements xzl {

    /* JADX INFO: renamed from: A */
    public py60 f41451A;

    /* JADX INFO: renamed from: B */
    public String f41452B;

    /* JADX INFO: renamed from: C */
    public yzl f41453C;

    /* JADX INFO: renamed from: z */
    public sy60 f41454z;

    /* JADX INFO: renamed from: N4 */
    public static PhotoAlbumBaseFrag m64004N4(boolean z, String str, String str2, int i, String str3, int i2, boolean z2) {
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
    public void m64005B3(j760<User, Boolean> j760Var, boolean z) {
        this.f41451A.m172073X0(j760Var, z);
    }

    /* JADX INFO: renamed from: M4 */
    public void m64006M4(Moment moment) {
        this.f41451A.m172067U0(moment);
    }

    /* JADX INFO: renamed from: O4 */
    public void mo64007O4() {
        this.f41451A = new py60(this);
        sy60 sy60Var = new sy60(this);
        this.f41454z = sy60Var;
        this.f41451A.mo51532C(sy60Var);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m64008P0() {
        sy60 sy60Var = this.f41454z;
        if (sy60Var == null) {
            return false;
        }
        return sy60Var.mo119484w();
    }

    /* JADX INFO: renamed from: P4 */
    public void m64009P4(Moment moment) {
        this.f41451A.m172071W0(moment);
    }

    /* JADX INFO: renamed from: Q4 */
    public Links m64010Q4() {
        return this.f41451A.f151812k;
    }

    /* JADX INFO: renamed from: R4 */
    public List<Moment> m64011R4() {
        return this.f41451A.f151811j;
    }

    /* JADX INFO: renamed from: S4 */
    public final py60 m64012S4() {
        if (this.f41451A == null) {
            mo64007O4();
        }
        return this.f41451A;
    }

    /* JADX INFO: renamed from: T4 */
    public String m64013T4() {
        return this.f41451A.f151804c;
    }

    /* JADX INFO: renamed from: U4 */
    public final sy60 m64014U4() {
        if (this.f41454z == null) {
            mo64007O4();
        }
        return this.f41454z;
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m64015V4() {
        return this.f41451A.m172077c1();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m64016W4(int i, List<Moment> list) {
        return m64012S4().m172081h1(i, list);
    }

    /* JADX INFO: renamed from: X4 */
    public void m64017X4(Map<String, Moment> map) {
        this.f41451A.m172051C1(map);
    }

    /* JADX INFO: renamed from: Y4 */
    public void m64018Y4(String str, boolean z) {
        this.f41451A.m172052D1(str, z);
    }

    /* JADX INFO: renamed from: Z4 */
    public void m64019Z4() {
        this.f41451A.mo114781E1();
    }

    /* JADX INFO: renamed from: a5 */
    public void m64020a5() {
        this.f41454z.mo119485z();
    }

    /* JADX INFO: renamed from: b5 */
    public void m64021b5() {
        this.f41454z.m186614C();
    }

    /* JADX INFO: renamed from: c5 */
    public void m64022c5(j760<Links, List<Moment>> j760Var) {
        if (NullChecker.m81303a(this.f41453C)) {
            this.f41453C.m216684F2(j760Var);
        }
        this.f41451A.m172056J1(j760Var);
    }

    /* JADX INFO: renamed from: d5 */
    public void m64023d5(j760<Links, List<Moment>> j760Var) {
        if (NullChecker.m81303a(this.f41453C)) {
            this.f41453C.mo100593a1(j760Var);
        }
        this.f41451A.mo114782L1(j760Var);
    }

    /* JADX INFO: renamed from: e5 */
    public void m64024e5(xaj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> xaj0Var) {
        this.f41451A.m172057N1(xaj0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m64014U4();
        this.f41451A.mo39470a0();
    }

    /* JADX INFO: renamed from: f5 */
    public void m64025f5() {
        if (NullChecker.m81304b(this.f41454z)) {
            this.f41454z.m186616F();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f41454z.mo119483v(bundle);
    }

    /* JADX INFO: renamed from: g5 */
    public void m64026g5(d30 d30Var) {
        m64012S4().m172068U1(d30Var);
    }

    /* JADX INFO: renamed from: h5 */
    public void m64027h5(yzl yzlVar) {
        this.f41453C = yzlVar;
    }

    /* JADX INFO: renamed from: i5 */
    public void m64028i5(String str) {
        this.f41452B = str;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41454z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public void m64029j5(boolean z) {
        m64014U4().m186619J(z);
    }

    /* JADX INFO: renamed from: k5 */
    public void m64030k5(boolean z) {
        m64014U4().m186620K(z);
    }

    /* JADX INFO: renamed from: l5 */
    public void m64031l5(boolean z) {
        sy60 sy60Var = this.f41454z;
        if (sy60Var == null) {
            return;
        }
        sy60Var.mo119476L(z);
    }

    /* JADX INFO: renamed from: m5 */
    public void m64032m5(Map<String, User> map) {
        this.f41451A.m172072W1(map);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        m64012S4().m172079f1();
        super.mo20594n4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        PhotoAlbumPictureView.m63859u(act().getWindow().getDecorView(), false);
        this.f41454z.m186612A();
        super.onPause();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f41454z.m186612A();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        this.f41454z.m186622d();
    }
}
