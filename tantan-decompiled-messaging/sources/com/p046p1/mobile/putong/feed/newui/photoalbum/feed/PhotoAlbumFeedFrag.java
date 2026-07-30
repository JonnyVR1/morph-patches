package com.p046p1.mobile.putong.feed.newui.photoalbum.feed;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.OccasionComponent;
import com.p046p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p046p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.b770;
import p149l.d670;
import p149l.e30;
import p149l.hrg;
import p149l.j760;
import p149l.tfh;
import p149l.tpd0;
import p149l.uzb0;
import p149l.vqg;
import p149l.vrh;
import p149l.xzl;
import p149l.zpd0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFeedFrag extends PutongFrag implements xzl {

    /* JADX INFO: renamed from: E */
    public static C22392a<j760<String, Integer>> f41624E = C22392a.m221512b();

    /* JADX INFO: renamed from: F */
    public static C22392a<Integer> f41625F = C22392a.m221512b();

    /* JADX INFO: renamed from: G */
    public static C22393b<j760<String, Boolean>> f41626G = C22393b.m221521b();

    /* JADX INFO: renamed from: A */
    public d670 f41627A;

    /* JADX INFO: renamed from: B */
    public DiscoveryPager f41628B = null;

    /* JADX INFO: renamed from: C */
    public boolean f41629C;

    /* JADX INFO: renamed from: D */
    public boolean f41630D;

    /* JADX INFO: renamed from: z */
    public b770 f41631z;

    /* JADX INFO: renamed from: M4 */
    public static PhotoAlbumFeedFrag m64360M4(String str, String str2, int i, String str3, int i2) {
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
    public static PhotoAlbumFeedFrag m64361N4(String str, String str2, int i, String str3, int i2, boolean z) {
        PhotoAlbumFeedFrag photoAlbumFeedFragM64360M4 = m64360M4(str, str2, i, str3, i2);
        photoAlbumFeedFragM64360M4.getArguments().putBoolean("is_auto_refresh", z);
        return photoAlbumFeedFragM64360M4;
    }

    /* JADX INFO: renamed from: d5 */
    public static void m64362d5(int i) {
        f41625F.m132487l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j5 */
    public static void m64363j5(String str, int i) {
        f41624E.m132487l(new j760<>(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l5 */
    public static void m64364l5(String str, boolean z) {
        f41626G.m132487l(new j760<>(str, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: O4 */
    public void m64365O4() {
        this.f41627A = new d670(this);
        b770 b770Var = new b770(this);
        this.f41631z = b770Var;
        this.f41627A.mo51532C(b770Var);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m64366P0() {
        return m64372U4().m100607l0();
    }

    /* JADX INFO: renamed from: P4 */
    public void m64367P4() {
        m64372U4().m100574P();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m64368Q4() {
        return m64372U4().f73913C;
    }

    /* JADX INFO: renamed from: R4 */
    public PhotoAlbumFeedBaseFrag m64369R4() {
        return this.f41631z.f73933k;
    }

    /* JADX INFO: renamed from: S4 */
    public d670 m64370S4() {
        if (this.f41627A == null) {
            m64365O4();
        }
        return this.f41627A;
    }

    /* JADX INFO: renamed from: T4 */
    public int m64371T4() {
        return this.f41627A.f84597e;
    }

    /* JADX INFO: renamed from: U4 */
    public b770 m64372U4() {
        if (this.f41631z == null) {
            m64365O4();
        }
        return this.f41631z;
    }

    /* JADX INFO: renamed from: V4 */
    public void m64373V4() {
        m64372U4().m100591Z();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m64374W4(List<Moment> list) {
        if (!NullChecker.m81303a(this.f41631z)) {
            return false;
        }
        this.f41631z.m100603h0(list);
        return true;
    }

    /* JADX INFO: renamed from: X4 */
    public boolean m64375X4(Moment moment) {
        if (!NullChecker.m81303a(this.f41631z)) {
            return false;
        }
        this.f41631z.m100604i0(moment);
        return true;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m64376Y4() {
        m64372U4().m100557D0();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m64377Z4() {
        this.f41631z.m100559G0();
    }

    /* JADX INFO: renamed from: a5 */
    public void m64378a5() {
        if (NullChecker.m81303a(this.f41627A)) {
            this.f41627A.m110146S0();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public void m64379b5() {
        m64372U4().m100560H0();
    }

    /* JADX INFO: renamed from: c5 */
    public void m64380c5() {
        if (m64369R4() == null) {
            return;
        }
        m64369R4().m64025f5();
    }

    /* JADX INFO: renamed from: e5 */
    public void m64381e5(boolean z) {
        this.f41629C = z;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m64372U4();
        this.f41631z.m100571N0(act());
        this.f41627A.mo39470a0();
    }

    /* JADX INFO: renamed from: f5 */
    public PhotoAlbumFeedFrag m64382f5(DiscoveryPager discoveryPager) {
        this.f41628B = discoveryPager;
        return this;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f41631z.m100601g0(bundle);
        tfh.m188712h().m188725p(this.f41627A.f84599g, this);
        hrg.m132673g().m132683n(this.f41627A.f84599g, this);
    }

    /* JADX INFO: renamed from: g5 */
    public void m64383g5(boolean z) {
        m64372U4().m100577Q0(z);
    }

    /* JADX INFO: renamed from: h5 */
    public void m64384h5(boolean z) {
        m64372U4().m100579R0(z);
    }

    /* JADX INFO: renamed from: i5 */
    public void m64385i5(e30<String> e30Var) {
        m64372U4().m100581S0(e30Var);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41631z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public void m64386k5(String str) {
        if (!this.f41630D || this.f41629C) {
            return;
        }
        vrh.f182724b.add(str);
        PostBasePopWindow postBasePopWindowM199660d = vrh.m199660d(str);
        if (postBasePopWindowM199660d != null) {
            zpd0 zpd0Var = new zpd0("immediately_show_dialog_time_" + postBasePopWindowM199660d.basic.name + FeedModule.m60221F().userId(), 0L);
            tpd0 tpd0Var = new tpd0("immediately_show_dialog_count_" + postBasePopWindowM199660d.basic.name + FeedModule.m60221F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindowM199660d.occasion;
            vrh.m199663g(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes);
            vrh.m199662f(postBasePopWindowM199660d.basic.name);
            act().startActivity(FeedPostBaseDialogAct.m61867Z1(act(), postBasePopWindowM199660d));
            act().overridePendingTransition(uzb0.f178984i, 0);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public void m64387m5() {
        m64372U4().m100598e1();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        m64370S4().m110153z0();
        super.mo20594n4(bundle);
    }

    /* JADX INFO: renamed from: n5 */
    public void m64388n5() {
        this.f41627A.m110148V0();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f41631z.f73942t = true;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m64379b5();
        m64387m5();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            this.f41630D = true;
        } else {
            this.f41630D = false;
            m64367P4();
        }
        String strM199515K = vqg.m199515K(m64370S4().f84596d, false);
        if (TextUtils.isEmpty(strM199515K) || vrh.f182724b.contains(strM199515K)) {
            return;
        }
        m64386k5(strM199515K);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        this.f41631z.m100563J();
    }
}
