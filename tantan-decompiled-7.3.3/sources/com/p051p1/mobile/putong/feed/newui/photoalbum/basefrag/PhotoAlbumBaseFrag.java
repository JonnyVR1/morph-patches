package com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import p153l.bkj0;
import p153l.pf60;
import p153l.r2m;
import p153l.s2m;
import p153l.v670;
import p153l.x20;
import p153l.y670;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumBaseFrag extends PutongFrag implements r2m {

    /* JADX INFO: renamed from: A */
    public v670 f42299A;

    /* JADX INFO: renamed from: B */
    public String f42300B;

    /* JADX INFO: renamed from: C */
    public s2m f42301C;

    /* JADX INFO: renamed from: z */
    public y670 f42302z;

    /* JADX INFO: renamed from: N4 */
    public static PhotoAlbumBaseFrag m65187N4(boolean z, String str, String str2, int i, String str3, int i2, boolean z2) {
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
    public void m65188B3(pf60<User, Boolean> pf60Var, boolean z) {
        this.f42299A.m200027X0(pf60Var, z);
    }

    /* JADX INFO: renamed from: M4 */
    public void m65189M4(Moment moment) {
        this.f42299A.m200021U0(moment);
    }

    /* JADX INFO: renamed from: O4 */
    public void mo65190O4() {
        this.f42299A = new v670(this);
        y670 y670Var = new y670(this);
        this.f42302z = y670Var;
        this.f42299A.mo52715C(y670Var);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m65191P0() {
        y670 y670Var = this.f42302z;
        if (y670Var == null) {
            return false;
        }
        return y670Var.mo153736w();
    }

    /* JADX INFO: renamed from: P4 */
    public void m65192P4(Moment moment) {
        this.f42299A.m200025W0(moment);
    }

    /* JADX INFO: renamed from: Q4 */
    public Links m65193Q4() {
        return this.f42299A.f182614k;
    }

    /* JADX INFO: renamed from: R4 */
    public List<Moment> m65194R4() {
        return this.f42299A.f182613j;
    }

    /* JADX INFO: renamed from: S4 */
    public final v670 m65195S4() {
        if (this.f42299A == null) {
            mo65190O4();
        }
        return this.f42299A;
    }

    /* JADX INFO: renamed from: T4 */
    public String m65196T4() {
        return this.f42299A.f182606c;
    }

    /* JADX INFO: renamed from: U4 */
    public final y670 m65197U4() {
        if (this.f42302z == null) {
            mo65190O4();
        }
        return this.f42302z;
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m65198V4() {
        return this.f42299A.m200031c1();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m65199W4(int i, List<Moment> list) {
        return m65195S4().m200035h1(i, list);
    }

    /* JADX INFO: renamed from: X4 */
    public void m65200X4(Map<String, Moment> map) {
        this.f42299A.m200005C1(map);
    }

    /* JADX INFO: renamed from: Y4 */
    public void m65201Y4(String str, boolean z) {
        this.f42299A.m200006D1(str, z);
    }

    /* JADX INFO: renamed from: Z4 */
    public void m65202Z4() {
        this.f42299A.mo149176E1();
    }

    /* JADX INFO: renamed from: a5 */
    public void m65203a5() {
        this.f42302z.mo153737z();
    }

    /* JADX INFO: renamed from: b5 */
    public void m65204b5() {
        this.f42302z.m214384C();
    }

    /* JADX INFO: renamed from: c5 */
    public void m65205c5(pf60<Links, List<Moment>> pf60Var) {
        if (NullChecker.m82486a(this.f42301C)) {
            this.f42301C.m184130F2(pf60Var);
        }
        this.f42299A.m200010J1(pf60Var);
    }

    /* JADX INFO: renamed from: d5 */
    public void m65206d5(pf60<Links, List<Moment>> pf60Var) {
        if (NullChecker.m82486a(this.f42301C)) {
            this.f42301C.mo134756a1(pf60Var);
        }
        this.f42299A.mo149177L1(pf60Var);
    }

    /* JADX INFO: renamed from: e5 */
    public void m65207e5(bkj0<List<TopicOperations>, List<TopicMoment>, List<Moment>> bkj0Var) {
        this.f42299A.m200011N1(bkj0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m65197U4();
        this.f42299A.mo40473a0();
    }

    /* JADX INFO: renamed from: f5 */
    public void m65208f5() {
        if (NullChecker.m82487b(this.f42302z)) {
            this.f42302z.m214386F();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42302z.mo153735v(bundle);
    }

    /* JADX INFO: renamed from: g5 */
    public void m65209g5(x20 x20Var) {
        m65195S4().m200022U1(x20Var);
    }

    /* JADX INFO: renamed from: h5 */
    public void m65210h5(s2m s2mVar) {
        this.f42301C = s2mVar;
    }

    /* JADX INFO: renamed from: i5 */
    public void m65211i5(String str) {
        this.f42300B = str;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42302z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public void m65212j5(boolean z) {
        m65197U4().m214389J(z);
    }

    /* JADX INFO: renamed from: k5 */
    public void m65213k5(boolean z) {
        m65197U4().m214390K(z);
    }

    /* JADX INFO: renamed from: l5 */
    public void m65214l5(boolean z) {
        y670 y670Var = this.f42302z;
        if (y670Var == null) {
            return;
        }
        y670Var.mo153728L(z);
    }

    /* JADX INFO: renamed from: m5 */
    public void m65215m5(Map<String, User> map) {
        this.f42299A.m200026W1(map);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        m65195S4().m200033f1();
        super.mo21593n4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        PhotoAlbumPictureView.m65042u(act().getWindow().getDecorView(), false);
        this.f42302z.m214382A();
        super.onPause();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f42302z.m214382A();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        this.f42302z.m214392d();
    }
}
