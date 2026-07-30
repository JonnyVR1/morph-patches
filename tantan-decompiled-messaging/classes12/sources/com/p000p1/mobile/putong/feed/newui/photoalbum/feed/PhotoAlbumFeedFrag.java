package com.p000p1.mobile.putong.feed.newui.photoalbum.feed;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.OccasionComponent;
import com.p000p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p000p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.tpd0;
import l.zpd0;
import p007l.b770;
import p007l.d670;
import p007l.hrg;
import p007l.tfh;
import p007l.uzb0;
import p007l.vqg;
import p007l.vrh;
import p007l.xzl;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFeedFrag extends PutongFrag implements xzl {

    /* JADX INFO: renamed from: E */
    public static a<j760<String, Integer>> f3085E = a.b();

    /* JADX INFO: renamed from: F */
    public static a<Integer> f3086F = a.b();

    /* JADX INFO: renamed from: G */
    public static b<j760<String, Boolean>> f3087G = b.b();

    /* JADX INFO: renamed from: A */
    public d670 f3088A;

    /* JADX INFO: renamed from: B */
    public DiscoveryPager f3089B = null;

    /* JADX INFO: renamed from: C */
    public boolean f3090C;

    /* JADX INFO: renamed from: D */
    public boolean f3091D;

    /* JADX INFO: renamed from: z */
    public b770 f3092z;

    /* JADX INFO: renamed from: M4 */
    public static PhotoAlbumFeedFrag m5434M4(String str, String str2, int i, String str3, int i2) {
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
    public static PhotoAlbumFeedFrag m5435N4(String str, String str2, int i, String str3, int i2, boolean z) {
        PhotoAlbumFeedFrag photoAlbumFeedFragM5434M4 = m5434M4(str, str2, i, str3, i2);
        photoAlbumFeedFragM5434M4.getArguments().putBoolean("is_auto_refresh", z);
        return photoAlbumFeedFragM5434M4;
    }

    /* JADX INFO: renamed from: d5 */
    public static void m5436d5(int i) {
        f3086F.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j5 */
    public static void m5437j5(String str, int i) {
        f3085E.onNext(new j760(str, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: l5 */
    public static void m5438l5(String str, boolean z) {
        f3087G.onNext(new j760(str, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: O4 */
    public void m5439O4() {
        this.f3088A = new d670(this);
        b770 b770Var = new b770(this);
        this.f3092z = b770Var;
        this.f3088A.C(b770Var);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m5440P0() {
        return m5446U4().m8727l0();
    }

    /* JADX INFO: renamed from: P4 */
    public void m5441P4() {
        m5446U4().m8693P();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m5442Q4() {
        return m5446U4().f6127C;
    }

    /* JADX INFO: renamed from: R4 */
    public PhotoAlbumFeedBaseFrag m5443R4() {
        return this.f3092z.f6147k;
    }

    /* JADX INFO: renamed from: S4 */
    public d670 m5444S4() {
        if (this.f3088A == null) {
            m5439O4();
        }
        return this.f3088A;
    }

    /* JADX INFO: renamed from: T4 */
    public int m5445T4() {
        return this.f3088A.f6846e;
    }

    /* JADX INFO: renamed from: U4 */
    public b770 m5446U4() {
        if (this.f3092z == null) {
            m5439O4();
        }
        return this.f3092z;
    }

    /* JADX INFO: renamed from: V4 */
    public void m5447V4() {
        m5446U4().m8710Z();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m5448W4(List<Moment> list) {
        if (!NullChecker.a(this.f3092z)) {
            return false;
        }
        this.f3092z.m8722h0(list);
        return true;
    }

    /* JADX INFO: renamed from: X4 */
    public boolean m5449X4(Moment moment) {
        if (!NullChecker.a(this.f3092z)) {
            return false;
        }
        this.f3092z.m8723i0(moment);
        return true;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m5450Y4() {
        m5446U4().m8676D0();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m5451Z4() {
        this.f3092z.m8678G0();
    }

    /* JADX INFO: renamed from: a5 */
    public void m5452a5() {
        if (NullChecker.a(this.f3088A)) {
            this.f3088A.m9341S0();
        }
    }

    /* JADX INFO: renamed from: b5 */
    public void m5453b5() {
        m5446U4().m8679H0();
    }

    /* JADX INFO: renamed from: c5 */
    public void m5454c5() {
        if (m5443R4() == null) {
            return;
        }
        m5443R4().m5069f5();
    }

    /* JADX INFO: renamed from: e5 */
    public void m5455e5(boolean z) {
        this.f3090C = z;
    }

    /* JADX INFO: renamed from: f4 */
    public void m5456f4() {
        super.f4();
        m5446U4();
        this.f3092z.m8690N0(act());
        this.f3088A.m9344a0();
    }

    /* JADX INFO: renamed from: f5 */
    public PhotoAlbumFeedFrag m5457f5(DiscoveryPager discoveryPager) {
        this.f3089B = discoveryPager;
        return this;
    }

    /* JADX INFO: renamed from: g4 */
    public void m5458g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3092z.m8720g0(bundle);
        tfh.m14518h().m14531p(this.f3088A.f6848g, this);
        hrg.m10716g().m10726n(this.f3088A.f6848g, this);
    }

    /* JADX INFO: renamed from: g5 */
    public void m5459g5(boolean z) {
        m5446U4().m8696Q0(z);
    }

    /* JADX INFO: renamed from: h5 */
    public void m5460h5(boolean z) {
        m5446U4().m8698R0(z);
    }

    /* JADX INFO: renamed from: i5 */
    public void m5461i5(e30<String> e30Var) {
        m5446U4().m8700S0(e30Var);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3092z.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public void m5462k5(String str) {
        if (!this.f3091D || this.f3090C) {
            return;
        }
        vrh.f14287b.add(str);
        PostBasePopWindow postBasePopWindowM15559d = vrh.m15559d(str);
        if (postBasePopWindowM15559d != null) {
            zpd0 zpd0Var = new zpd0("immediately_show_dialog_time_" + postBasePopWindowM15559d.basic.name + FeedModule.m1139F().userId(), 0L);
            tpd0 tpd0Var = new tpd0("immediately_show_dialog_count_" + postBasePopWindowM15559d.basic.name + FeedModule.m1139F().userId(), 0);
            OccasionComponent occasionComponent = postBasePopWindowM15559d.occasion;
            vrh.m15562g(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes);
            vrh.m15561f(postBasePopWindowM15559d.basic.name);
            act().startActivity(FeedPostBaseDialogAct.m2834Z1(act(), postBasePopWindowM15559d));
            act().overridePendingTransition(uzb0.f13995i, 0);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public void m5463m5() {
        m5446U4().m8717e1();
    }

    /* JADX INFO: renamed from: n4 */
    public void m5464n4(Bundle bundle) {
        m5444S4().m9349z0();
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    /* JADX INFO: renamed from: n5 */
    public void m5465n5() {
        this.f3088A.m9343V0();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        this.f3092z.f6156t = true;
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
        m5453b5();
        m5463m5();
    }

    public void setUserVisibleHint(boolean z) {
        super/*androidx.fragment.app.Fragment*/.setUserVisibleHint(z);
        if (z) {
            this.f3091D = true;
        } else {
            this.f3091D = false;
            m5441P4();
        }
        String strM15485K = vqg.m15485K(m5444S4().f6845d, false);
        if (TextUtils.isEmpty(strM15485K) || vrh.f14287b.contains(strM15485K)) {
            return;
        }
        m5462k5(strM15485K);
    }

    /* JADX INFO: renamed from: y4 */
    public void m5466y4() {
        this.f3092z.m8682J();
    }
}
