package com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.navigationbar.VNavigationBar;
import p149l.cwf0;
import p149l.czl;
import p149l.e30;
import p149l.e5c;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.nkg;
import p149l.p6j0;
import p149l.vwb;
import p149l.whh;
import p149l.wu10;
import p149l.x8h;
import p149l.yhh;
import p149l.zhh;
import p149l.zol;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMyInterestPeopleAct extends PutongAct implements e5c, ViewPager.InterfaceC0716j, zol {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f42109c;

    /* JADX INFO: renamed from: d */
    public ViewPager f42110d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f42111e;

    /* JADX INFO: renamed from: f */
    public ImageView f42112f;

    /* JADX INFO: renamed from: g */
    public TextView f42113g;

    /* JADX INFO: renamed from: i */
    public czl f42115i;

    /* JADX INFO: renamed from: j */
    public zhh f42116j;

    /* JADX INFO: renamed from: l */
    public int f42118l;

    /* JADX INFO: renamed from: m */
    public int f42119m;

    /* JADX INFO: renamed from: n */
    public wu10 f42120n;

    /* JADX INFO: renamed from: p */
    public boolean f42122p;

    /* JADX INFO: renamed from: h */
    public cwf0 f42114h = new cwf0("p_interested_user", FeedMyInterestPeopleAct.class.getName());

    /* JADX INFO: renamed from: k */
    public ArrayList<x8h> f42117k = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public ArrayList<String> f42121o = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public int f42123q = -1;

    /* JADX INFO: renamed from: r */
    public boolean f42124r = false;

    /* JADX INFO: renamed from: s */
    public e30<Integer> f42125s = new e30() { // from class: l.nhh
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f138982a.m64895m2((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m64878Y1(Throwable th) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m64879Z1(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m64880a2(e30 e30Var, Throwable th) {
        if (e30Var != null) {
            e30Var.call(th);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m64883d2(e30 e30Var, Envelope envelope) {
        if (e30Var != null) {
            e30Var.call(envelope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m64885l2(C4319c c4319c) {
        if (NullChecker.m81304b(this.f42114h)) {
            if (c4319c == C4319c.f15545f) {
                this.f42114h.m109027c();
            } else if (c4319c == C4319c.f15549j) {
                this.f42114h.m109031g();
            } else if (c4319c == C4319c.f15552m) {
                this.f42114h.m109029e();
            }
        }
    }

    /* JADX INFO: renamed from: v2 */
    private void m64886v2() {
        wu10 wu10Var = new wu10(this, this);
        this.f42120n = wu10Var;
        wu10Var.m205590g();
    }

    /* JADX INFO: renamed from: A2 */
    public final void m64887A2() {
        List<User> listM221515e = FeedModule.f38855d.f193069t0.m221515e();
        if (listM221515e.isEmpty() || this.f42117k.isEmpty() || this.f42115i.mo109425c() - 1 >= this.f42117k.size()) {
            return;
        }
        for (User user : listM221515e) {
            final x8h x8hVar = this.f42117k.get(this.f42115i.mo109425c() - 1);
            if (user.f56011id.equals(x8hVar.m207396b().f56011id)) {
                postDelayed(new Runnable() { // from class: l.phh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f148930a.m64899p2(x8hVar);
                    }
                }, 200L);
                break;
            }
        }
        listM221515e.clear();
    }

    @Override // p149l.zol
    /* JADX INFO: renamed from: T */
    public void mo64888T(final x8h x8hVar) {
        m64904w2(x8hVar, new e30() { // from class: l.uhh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176552a.m64897o2(x8hVar, (Envelope) obj);
            }
        }, new e30() { // from class: l.vhh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m64878Y1((Throwable) obj);
            }
        });
    }

    @Override // p149l.e5c
    /* JADX INFO: renamed from: a */
    public void mo64889a(Throwable th) {
        th.printStackTrace();
        this.f42111e.setVisibility(0);
        this.f42113g.setText("网络错误，请稍后重试");
        this.f42124r = false;
    }

    @Override // p149l.e5c
    /* JADX INFO: renamed from: c */
    public void mo64890c(int i, List<x8h> list, Links links) {
        boolean z;
        this.f42124r = false;
        if (this.f42117k.isEmpty()) {
            m64905y2(i);
            if (list.isEmpty()) {
                m64901r2();
                this.f42115i.mo109424a(-1, -1);
                return;
            } else {
                m64893i2();
                z = true;
            }
        } else {
            z = false;
        }
        if (list.isEmpty()) {
            return;
        }
        this.f42117k.addAll(list);
        this.f42115i.mo109424a(i, -1);
        this.f42116j.m218796s(this.f42117k);
        this.f42118l = i;
        if (z) {
            onPageSelected(0);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m50458m2() {
        User user;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<x8h> arrayList2 = this.f42117k;
        for (x8h x8hVar : arrayList2.subList(0, Math.min(arrayList2.size(), 3))) {
            if (x8hVar != null && (user = x8hVar.f191512a) != null) {
                arrayList.add(user.f56011id);
            }
        }
        Intent intent = new Intent();
        intent.putExtra(PhotoAlbumActivitiesAct.f42248n, this.f42118l);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(PhotoAlbumActivitiesAct.f42246l, arrayList);
        bundle.putStringArrayList(PhotoAlbumActivitiesAct.f42247m, this.f42121o);
        intent.putExtra(PhotoAlbumActivitiesAct.f42249o, bundle);
        this.act.setResult(-1, intent);
        super.m50458m2();
    }

    /* JADX INFO: renamed from: g2 */
    public View m64891g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return whh.m203214b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m64892h2(int i) {
        int size = this.f42117k.size() - i;
        if (size <= 0 || size >= 4 || this.f42124r) {
            return;
        }
        this.f42120n.m205589f();
        this.f42124r = true;
    }

    /* JADX INFO: renamed from: i2 */
    public final void m64893i2() {
        zhh zhhVar = new zhh(this, this);
        this.f42116j = zhhVar;
        this.f42110d.setAdapter(zhhVar);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM64891g2 = m64891g2(layoutInflater, viewGroup);
        m64886v2();
        m64894k2();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ohh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143981a.m64885l2((C4319c) obj);
            }
        }));
        return viewM64891g2;
    }

    /* JADX INFO: renamed from: k2 */
    public final void m64894k2() {
        this.f42110d.m4185d(this);
        this.f42110d.setOffscreenPageLimit(3);
        this.f42115i = new yhh(this.f42109c, this);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m64895m2(Integer num) {
        m64903u2(num.intValue());
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m64896n2(x8h x8hVar, Followship followship) {
        m64902s2(x8hVar, true);
        m64904w2(x8hVar, null, null);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m64897o2(x8h x8hVar, Envelope envelope) {
        m64902s2(x8hVar, false);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        if (this.f42122p || this.f42123q == i) {
            return;
        }
        this.f42119m = i;
        this.f42115i.mo98833b(i);
        m64892h2(i);
        zvf0.m220368A("e_interested_user_card", "p_interested_user", vwb.m200311Y("notes_type", this.f42117k.get(i).m207396b().activityUser.action.equals(ActivityActionApi.moment_swipe) ? "respond_match" : this.f42117k.get(i).m207396b().activityUser.action), vwb.m200311Y("card_user_id", this.f42117k.get(i).m207396b().f56011id));
        boolean zEquals = this.f42117k.get(i).m207396b().activityUser.action.equals(ActivityActionApi.moment_swipe);
        ArrayList<x8h> arrayList = this.f42117k;
        if (zEquals) {
            p6j0.m167671e("e_respond_match", "p_interested_user", j760.m140076a("card_user_id", arrayList.get(i).m207396b().f56011id));
        } else if ("like".equals(arrayList.get(i).m207396b().activityUser.action) && nkg.m159854K()) {
            p6j0.m167671e("e_polite_gratitude", "p_interested_user", j760.m140076a("moments_user_id", this.f42117k.get(i).m207396b().f56011id));
        } else {
            p6j0.m167671e(MatchScData.ModuleId.mid_e_follow, "p_interested_user", j760.m140076a("card_user_id", this.f42117k.get(i).m207396b().f56011id));
        }
        p6j0.m167671e("e_interested_user_card_close", "p_interested_user", j760.m140076a("card_user_id", this.f42117k.get(i).m207396b().f56011id));
        this.f42123q = i;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        m64887A2();
    }

    @Override // p149l.zol
    /* JADX INFO: renamed from: p0 */
    public void mo64898p0(final x8h x8hVar, boolean z) {
        if (z) {
            m64902s2(x8hVar, true);
            m64904w2(x8hVar, null, null);
            return;
        }
        User userM207396b = x8hVar.m207396b();
        if (NullChecker.m81304b(userM207396b)) {
            Followship followship = userM207396b.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(userM207396b.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(userM207396b.localFollowship.state, "unknown_")) {
                if (userM207396b.profile.moments.hidePublicMoments) {
                    lsi0.m151593w(R$string.f39129q);
                } else {
                    duringCreated(FeedModule.f38855d.m209453f7(FeedModule.m60221F().userId(), userM207396b, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.shh
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f164563a.m64896n2(x8hVar, (Followship) obj);
                        }
                    }, new e30() { // from class: l.thh
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            FeedMyInterestPeopleAct.m64879Z1((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m64899p2(x8h x8hVar) {
        m64904w2(x8hVar, null, null);
        m64902s2(x8hVar, true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_interested_user";
    }

    /* JADX INFO: renamed from: q2 */
    public void m64900q2() {
        if (TextUtils.isEmpty(this.f42120n.m205586c())) {
            m64901r2();
        } else {
            this.f42120n.m205589f();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m64901r2() {
        this.f42111e.setVisibility(0);
        this.f42113g.setText("没有更多了，先去冒个泡让更多的人看到你吧");
        this.f42115i.mo109424a(-1, -1);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m64902s2(x8h x8hVar, boolean z) {
        zhh zhhVar = this.f42116j;
        if (z) {
            zhhVar.m218794q(this.f42117k.indexOf(x8hVar), this.f42125s);
        } else {
            zhhVar.m218795r(this.f42117k.indexOf(x8hVar), this.f42125s);
        }
        czl czlVar = this.f42115i;
        int i = this.f42118l - 1;
        this.f42118l = i;
        czlVar.mo109426d(i, -1);
        this.f42121o.add(x8hVar.f191512a.f56011id);
    }

    /* JADX INFO: renamed from: u2 */
    public void m64903u2(int i) {
        if (i < this.f42117k.size()) {
            this.f42117k.remove(i);
            this.f42116j.m218796s(this.f42117k);
            if (this.f42117k.isEmpty()) {
                m64900q2();
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m64904w2(x8h x8hVar, final e30<Envelope> e30Var, final e30<Throwable> e30Var2) {
        duringCreated(FeedModule.f38855d.m209369T6(x8hVar.m207396b().f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.qhh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m64883d2(e30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.rhh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m64880a2(e30Var2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y2 */
    public void m64905y2(int i) {
        this.f42114h.m109039o(p6j0.m167667a(p6j0.C19147a.m167677f("user_num", i)));
        this.f42114h.m109042r();
    }

    /* JADX INFO: renamed from: z2 */
    public void m64906z2(boolean z) {
        this.f42122p = z;
    }
}
