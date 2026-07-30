package com.p051p1.mobile.putong.feed.newui.photoalbum.feed;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.OccasionComponent;
import com.p051p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p051p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.a8c0;
import p153l.byd0;
import p153l.hf70;
import p153l.ihh;
import p153l.je70;
import p153l.ksg;
import p153l.kth;
import p153l.pf60;
import p153l.r2m;
import p153l.vxd0;
import p153l.wsg;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFeedFrag extends PutongFrag implements r2m {

    /* JADX INFO: renamed from: E */
    public static C22507a<pf60<String, Integer>> f42472E = C22507a.m222758b();

    /* JADX INFO: renamed from: F */
    public static C22507a<Integer> f42473F = C22507a.m222758b();

    /* JADX INFO: renamed from: G */
    public static C22508b<pf60<String, Boolean>> f42474G = C22508b.m222767b();

    /* JADX INFO: renamed from: A */
    public je70 f42475A;

    /* JADX INFO: renamed from: B */
    public DiscoveryPager f42476B = null;

    /* JADX INFO: renamed from: C */
    public boolean f42477C;

    /* JADX INFO: renamed from: D */
    public boolean f42478D;

    /* JADX INFO: renamed from: z */
    public hf70 f42479z;

    /* JADX INFO: renamed from: M4 */
    public static PhotoAlbumFeedFrag m65543M4(String str, String str2, int i, String str3, int i2) {
        PhotoAlbumFeedFrag photoAlbumFeedFrag = new PhotoAlbumFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("from", str2);
        bundle.putInt("selected_item_position", i);
        bundle.putString("target_moment_id", str3);
        bundle.putInt("page_type", i2);
        photoAlbumFeedFrag.setArguments(bundle);
        return photoAlbumFeedFrag;
    }

    /* JADX INFO: renamed from: N4 */
    public static PhotoAlbumFeedFrag m65544N4(String str, String str2, int i, String str3, int i2, boolean z) {
        PhotoAlbumFeedFrag photoAlbumFeedFragM65543M4 = m65543M4(str, str2, i, str3, i2);
        photoAlbumFeedFragM65543M4.getArguments().putBoolean("is_auto_refresh", z);
        return photoAlbumFeedFragM65543M4;
    }

    /* JADX INFO: renamed from: d5 */
    public static void m65545d5(int i) {
        f42473F.m137019l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j5 */
    public static void m65546j5(String str, int i) {
        f42472E.m137019l(new pf60<>(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l5 */
    public static void m65547l5(String str, boolean z) {
        f42474G.m137019l(new pf60<>(str, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: O4 */
    public void m65548O4() {
        this.f42475A = new je70(this);
        hf70 hf70Var = new hf70(this);
        this.f42479z = hf70Var;
        this.f42475A.mo52715C(hf70Var);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m65549P0() {
        return m65555U4().m134770l0();
    }

    /* JADX INFO: renamed from: P4 */
    public void m65550P4() {
        m65555U4().m134737P();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m65551Q4() {
        return m65555U4().f109223C;
    }

    /* JADX INFO: renamed from: R4 */
    public PhotoAlbumFeedBaseFrag m65552R4() {
        return this.f42479z.f109243k;
    }

    /* JADX INFO: renamed from: S4 */
    public je70 m65553S4() {
        if (this.f42475A == null) {
            m65548O4();
        }
        return this.f42475A;
    }

    /* JADX INFO: renamed from: T4 */
    public int m65554T4() {
        return this.f42475A.f120400e;
    }

    /* JADX INFO: renamed from: U4 */
    public hf70 m65555U4() {
        if (this.f42479z == null) {
            m65548O4();
        }
        return this.f42479z;
    }

    /* JADX INFO: renamed from: V4 */
    public void m65556V4() {
        m65555U4().m134754Z();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m65557W4(List<Moment> list) {
        if (!NullChecker.m82486a(this.f42479z)) {
            return false;
        }
        this.f42479z.m134766h0(list);
        return true;
    }

    /* JADX INFO: renamed from: X4 */
    public boolean m65558X4(Moment moment) {
        if (!NullChecker.m82486a(this.f42479z)) {
            return false;
        }
        this.f42479z.m134767i0(moment);
        return true;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m65559Y4() {
        m65555U4().m134720D0();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m65560Z4() {
        this.f42479z.m134722G0();
    }

    /* JADX INFO: renamed from: a5 */
    public void m65561a5() {
        if (NullChecker.m82486a(this.f42475A)) {
            this.f42475A.m144549S0();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public void m65562b5() {
        m65555U4().m134723H0();
    }

    /* JADX INFO: renamed from: c5 */
    public void m65563c5() {
        if (m65552R4() == null) {
            return;
        }
        m65552R4().m65208f5();
    }

    /* JADX INFO: renamed from: e5 */
    public void m65564e5(boolean z) {
        this.f42477C = z;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m65555U4();
        this.f42479z.m134734N0(act());
        this.f42475A.mo40473a0();
    }

    /* JADX INFO: renamed from: f5 */
    public PhotoAlbumFeedFrag m65565f5(DiscoveryPager discoveryPager) {
        this.f42476B = discoveryPager;
        return this;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42479z.m134764g0(bundle);
        ihh.m139977h().m139990p(this.f42475A.f120402g, this);
        wsg.m207772g().m207782n(this.f42475A.f120402g, this);
    }

    /* JADX INFO: renamed from: g5 */
    public void m65566g5(boolean z) {
        m65555U4().m134740Q0(z);
    }

    /* JADX INFO: renamed from: h5 */
    public void m65567h5(boolean z) {
        m65555U4().m134742R0(z);
    }

    /* JADX INFO: renamed from: i5 */
    public void m65568i5(y20<String> y20Var) {
        m65555U4().m134744S0(y20Var);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42479z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public void m65569k5(String str) {
        if (!this.f42478D || this.f42477C) {
            return;
        }
        kth.f128699b.add(str);
        PostBasePopWindow postBasePopWindowM151355d = kth.m151355d(str);
        if (postBasePopWindowM151355d != null) {
            byd0 byd0Var = new byd0("immediately_show_dialog_time_" + postBasePopWindowM151355d.basic.name + FeedModule.m61405F().userId(), 0L);
            vxd0 vxd0Var = new vxd0("immediately_show_dialog_count_" + postBasePopWindowM151355d.basic.name + FeedModule.m61405F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindowM151355d.occasion;
            kth.m151358g(byd0Var, vxd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes);
            kth.m151357f(postBasePopWindowM151355d.basic.name);
            act().startActivity(FeedPostBaseDialogAct.m63050a2(act(), postBasePopWindowM151355d));
            act().overridePendingTransition(a8c0.f68909i, 0);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public void m65570m5() {
        m65555U4().m134761e1();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        m65553S4().m144556z0();
        super.mo21593n4(bundle);
    }

    /* JADX INFO: renamed from: n5 */
    public void m65571n5() {
        this.f42475A.m144551V0();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f42479z.f109252t = true;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m65562b5();
        m65570m5();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            this.f42478D = true;
        } else {
            this.f42478D = false;
            m65550P4();
        }
        String strM151174K = ksg.m151174K(m65553S4().f120399d, false);
        if (TextUtils.isEmpty(strM151174K) || kth.f128699b.contains(strM151174K)) {
            return;
        }
        m65569k5(strM151174K);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        this.f42479z.m134726J();
    }
}
