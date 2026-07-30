package com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.navigationbar.VNavigationBar;
import p153l.cmg;
import p153l.e320;
import p153l.i4g0;
import p153l.jyb;
import p153l.k6c;
import p153l.l4g0;
import p153l.ljh;
import p153l.lrl;
import p153l.mah;
import p153l.njh;
import p153l.o1j0;
import p153l.ojh;
import p153l.pf60;
import p153l.psd0;
import p153l.tfj0;
import p153l.x1m;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMyInterestPeopleAct extends PutongAct implements k6c, ViewPager.InterfaceC0718j, lrl {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f42957c;

    /* JADX INFO: renamed from: d */
    public ViewPager f42958d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f42959e;

    /* JADX INFO: renamed from: f */
    public ImageView f42960f;

    /* JADX INFO: renamed from: g */
    public TextView f42961g;

    /* JADX INFO: renamed from: i */
    public x1m f42963i;

    /* JADX INFO: renamed from: j */
    public ojh f42964j;

    /* JADX INFO: renamed from: l */
    public int f42966l;

    /* JADX INFO: renamed from: m */
    public int f42967m;

    /* JADX INFO: renamed from: n */
    public e320 f42968n;

    /* JADX INFO: renamed from: p */
    public boolean f42970p;

    /* JADX INFO: renamed from: h */
    public l4g0 f42962h = new l4g0("p_interested_user", FeedMyInterestPeopleAct.class.getName());

    /* JADX INFO: renamed from: k */
    public ArrayList<mah> f42965k = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public ArrayList<String> f42969o = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public int f42971q = -1;

    /* JADX INFO: renamed from: r */
    public boolean f42972r = false;

    /* JADX INFO: renamed from: s */
    public y20<Integer> f42973s = new y20() { // from class: l.cjh
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f82161a.m66079n2((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m66061Z1(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m66062a2(Throwable th) {
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m66063b2(y20 y20Var, Throwable th) {
        if (y20Var != null) {
            y20Var.call(th);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ void m66066e2(y20 y20Var, Envelope envelope) {
        if (y20Var != null) {
            y20Var.call(envelope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m66068m2(C4470c c4470c) {
        if (NullChecker.m82487b(this.f42962h)) {
            if (c4470c == C4470c.f16264f) {
                this.f42962h.m152768c();
            } else if (c4470c == C4470c.f16268j) {
                this.f42962h.m152772g();
            } else if (c4470c == C4470c.f16271m) {
                this.f42962h.m152770e();
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    private void m66069w2() {
        e320 e320Var = new e320(this, this);
        this.f42968n = e320Var;
        e320Var.m119245g();
    }

    /* JADX INFO: renamed from: A2 */
    public void m66070A2(boolean z) {
        this.f42970p = z;
    }

    /* JADX INFO: renamed from: B2 */
    public final void m66071B2() {
        List<User> listM222761e = FeedModule.f39703d.f121379t0.m222761e();
        if (listM222761e.isEmpty() || this.f42965k.isEmpty() || this.f42963i.mo163415c() - 1 >= this.f42965k.size()) {
            return;
        }
        for (User user : listM222761e) {
            final mah mahVar = this.f42965k.get(this.f42963i.mo163415c() - 1);
            if (user.f56859id.equals(mahVar.m157649b().f56859id)) {
                postDelayed(new Runnable() { // from class: l.ejh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94300a.m66083q2(mahVar);
                    }
                }, 200L);
                break;
            }
        }
        listM222761e.clear();
    }

    @Override // p153l.lrl
    /* JADX INFO: renamed from: U */
    public void mo66072U(final mah mahVar) {
        m66088y2(mahVar, new y20() { // from class: l.jjh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121177a.m66081p2(mahVar, (Envelope) obj);
            }
        }, new y20() { // from class: l.kjh
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m66061Z1((Throwable) obj);
            }
        });
    }

    @Override // p153l.k6c
    /* JADX INFO: renamed from: a */
    public void mo66073a(Throwable th) {
        th.printStackTrace();
        this.f42959e.setVisibility(0);
        this.f42961g.setText("网络错误，请稍后重试");
        this.f42972r = false;
    }

    @Override // p153l.k6c
    /* JADX INFO: renamed from: c */
    public void mo66074c(int i, List<mah> list, Links links) {
        boolean z;
        this.f42972r = false;
        if (this.f42965k.isEmpty()) {
            m66089z2(i);
            if (list.isEmpty()) {
                m66085s2();
                this.f42963i.mo163413a(-1, -1);
                return;
            } else {
                m66077k2();
                z = true;
            }
        } else {
            z = false;
        }
        if (list.isEmpty()) {
            return;
        }
        this.f42965k.addAll(list);
        this.f42963i.mo163413a(i, -1);
        this.f42964j.m167864s(this.f42965k);
        this.f42966l = i;
        if (z) {
            onPageSelected(0);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m51642n2() {
        User user;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<mah> arrayList2 = this.f42965k;
        for (mah mahVar : arrayList2.subList(0, Math.min(arrayList2.size(), 3))) {
            if (mahVar != null && (user = mahVar.f135519a) != null) {
                arrayList.add(user.f56859id);
            }
        }
        Intent intent = new Intent();
        intent.putExtra(PhotoAlbumActivitiesAct.f43096n, this.f42966l);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(PhotoAlbumActivitiesAct.f43094l, arrayList);
        bundle.putStringArrayList(PhotoAlbumActivitiesAct.f43095m, this.f42969o);
        intent.putExtra(PhotoAlbumActivitiesAct.f43097o, bundle);
        this.act.setResult(-1, intent);
        super.m51642n2();
    }

    /* JADX INFO: renamed from: h2 */
    public View m66075h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ljh.m154508b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m66076i2(int i) {
        int size = this.f42965k.size() - i;
        if (size <= 0 || size >= 4 || this.f42972r) {
            return;
        }
        this.f42968n.m119244f();
        this.f42972r = true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM66075h2 = m66075h2(layoutInflater, viewGroup);
        m66069w2();
        m66078l2();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.djh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88850a.m66068m2((C4470c) obj);
            }
        }));
        return viewM66075h2;
    }

    /* JADX INFO: renamed from: k2 */
    public final void m66077k2() {
        ojh ojhVar = new ojh(this, this);
        this.f42964j = ojhVar;
        this.f42958d.setAdapter(ojhVar);
    }

    /* JADX INFO: renamed from: l2 */
    public final void m66078l2() {
        this.f42958d.m4187d(this);
        this.f42958d.setOffscreenPageLimit(3);
        this.f42963i = new njh(this.f42957c, this);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m66079n2(Integer num) {
        m66087v2(num.intValue());
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m66080o2(mah mahVar, Followship followship) {
        m66086u2(mahVar, true);
        m66088y2(mahVar, null, null);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        if (this.f42970p || this.f42971q == i) {
            return;
        }
        this.f42967m = i;
        this.f42963i.mo163414b(i);
        m66076i2(i);
        i4g0.m138492A("e_interested_user_card", "p_interested_user", jyb.m147494Y("notes_type", this.f42965k.get(i).m157649b().activityUser.action.equals(ActivityActionApi.moment_swipe) ? "respond_match" : this.f42965k.get(i).m157649b().activityUser.action), jyb.m147494Y("card_user_id", this.f42965k.get(i).m157649b().f56859id));
        boolean zEquals = this.f42965k.get(i).m157649b().activityUser.action.equals(ActivityActionApi.moment_swipe);
        ArrayList<mah> arrayList = this.f42965k;
        if (zEquals) {
            tfj0.m190942e("e_respond_match", "p_interested_user", pf60.m172085a("card_user_id", arrayList.get(i).m157649b().f56859id));
        } else if ("like".equals(arrayList.get(i).m157649b().activityUser.action) && cmg.m111183K()) {
            tfj0.m190942e("e_polite_gratitude", "p_interested_user", pf60.m172085a("moments_user_id", this.f42965k.get(i).m157649b().f56859id));
        } else {
            tfj0.m190942e(MatchScData.ModuleId.mid_e_follow, "p_interested_user", pf60.m172085a("card_user_id", this.f42965k.get(i).m157649b().f56859id));
        }
        tfj0.m190942e("e_interested_user_card_close", "p_interested_user", pf60.m172085a("card_user_id", this.f42965k.get(i).m157649b().f56859id));
        this.f42971q = i;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        m66071B2();
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m66081p2(mah mahVar, Envelope envelope) {
        m66086u2(mahVar, false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_interested_user";
    }

    @Override // p153l.lrl
    /* JADX INFO: renamed from: q0 */
    public void mo66082q0(final mah mahVar, boolean z) {
        if (z) {
            m66086u2(mahVar, true);
            m66088y2(mahVar, null, null);
            return;
        }
        User userM157649b = mahVar.m157649b();
        if (NullChecker.m82487b(userM157649b)) {
            Followship followship = userM157649b.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(userM157649b.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(userM157649b.localFollowship.state, "unknown_")) {
                if (userM157649b.profile.moments.hidePublicMoments) {
                    o1j0.m165649w(R$string.f39977q);
                } else {
                    duringCreated(FeedModule.f39703d.m145694f7(FeedModule.m61405F().userId(), userM157649b, true)).subscribe(psd0.m173597H(new y20() { // from class: l.hjh
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f110219a.m66080o2(mahVar, (Followship) obj);
                        }
                    }, new y20() { // from class: l.ijh
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            FeedMyInterestPeopleAct.m66062a2((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m66083q2(mah mahVar) {
        m66088y2(mahVar, null, null);
        m66086u2(mahVar, true);
    }

    /* JADX INFO: renamed from: r2 */
    public void m66084r2() {
        if (TextUtils.isEmpty(this.f42968n.m119241c())) {
            m66085s2();
        } else {
            this.f42968n.m119244f();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public void m66085s2() {
        this.f42959e.setVisibility(0);
        this.f42961g.setText("没有更多了，先去冒个泡让更多的人看到你吧");
        this.f42963i.mo163413a(-1, -1);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m66086u2(mah mahVar, boolean z) {
        ojh ojhVar = this.f42964j;
        if (z) {
            ojhVar.m167862q(this.f42965k.indexOf(mahVar), this.f42973s);
        } else {
            ojhVar.m167863r(this.f42965k.indexOf(mahVar), this.f42973s);
        }
        x1m x1mVar = this.f42963i;
        int i = this.f42966l - 1;
        this.f42966l = i;
        x1mVar.mo163416d(i, -1);
        this.f42969o.add(mahVar.f135519a.f56859id);
    }

    /* JADX INFO: renamed from: v2 */
    public void m66087v2(int i) {
        if (i < this.f42965k.size()) {
            this.f42965k.remove(i);
            this.f42964j.m167864s(this.f42965k);
            if (this.f42965k.isEmpty()) {
                m66084r2();
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m66088y2(mah mahVar, final y20<Envelope> y20Var, final y20<Throwable> y20Var2) {
        duringCreated(FeedModule.f39703d.m145610T6(mahVar.m157649b().f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.fjh
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m66066e2(y20Var, (Envelope) obj);
            }
        }, new y20() { // from class: l.gjh
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m66063b2(y20Var2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public void m66089z2(int i) {
        this.f42962h.m152780o(tfj0.m190938a(tfj0.C20302a.m190948f("user_num", i)));
        this.f42962h.m152783r();
    }
}
