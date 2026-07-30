package com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople;

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
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.FeedMyInterestPeopleAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.vwb;
import l.zvf0;
import p007l.czl;
import p007l.e5c;
import p007l.nkg;
import p007l.p6j0;
import p007l.whh;
import p007l.wu10;
import p007l.x8h;
import p007l.yhh;
import p007l.zhh;
import p007l.zol;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMyInterestPeopleAct extends PutongAct implements e5c, ViewPager.j, zol {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f3570c;

    /* JADX INFO: renamed from: d */
    public ViewPager f3571d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f3572e;

    /* JADX INFO: renamed from: f */
    public ImageView f3573f;

    /* JADX INFO: renamed from: g */
    public TextView f3574g;

    /* JADX INFO: renamed from: i */
    public czl f3576i;

    /* JADX INFO: renamed from: j */
    public zhh f3577j;

    /* JADX INFO: renamed from: l */
    public int f3579l;

    /* JADX INFO: renamed from: m */
    public int f3580m;

    /* JADX INFO: renamed from: n */
    public wu10 f3581n;

    /* JADX INFO: renamed from: p */
    public boolean f3583p;

    /* JADX INFO: renamed from: h */
    public cwf0 f3575h = new cwf0("p_interested_user", FeedMyInterestPeopleAct.class.getName());

    /* JADX INFO: renamed from: k */
    public ArrayList<x8h> f3578k = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public ArrayList<String> f3582o = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public int f3584q = -1;

    /* JADX INFO: renamed from: r */
    public boolean f3585r = false;

    /* JADX INFO: renamed from: s */
    public e30<Integer> f3586s = new e30() { // from class: l.nhh
        public final void call(Object obj) {
            this.f10809a.m5994m2((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m5977Y1(Throwable th) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m5978Z1(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m5979a2(e30 e30Var, Throwable th) {
        if (e30Var != null) {
            e30Var.call(th);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m5982d2(e30 e30Var, Envelope envelope) {
        if (e30Var != null) {
            e30Var.call(envelope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m5984l2(c cVar) {
        if (NullChecker.b(this.f3575h)) {
            if (cVar == c.f) {
                this.f3575h.c();
            } else if (cVar == c.j) {
                this.f3575h.g();
            } else if (cVar == c.m) {
                this.f3575h.e();
            }
        }
    }

    /* JADX INFO: renamed from: v2 */
    private void m5985v2() {
        wu10 wu10Var = new wu10(this, this);
        this.f3581n = wu10Var;
        wu10Var.m15925g();
    }

    /* JADX INFO: renamed from: A2 */
    public final void m5986A2() {
        List<User> list = (List) FeedModule.f316d.f15004t0.e();
        if (list.isEmpty() || this.f3578k.isEmpty() || this.f3576i.mo9266c() - 1 >= this.f3578k.size()) {
            return;
        }
        for (User user : list) {
            final x8h x8hVar = this.f3578k.get(this.f3576i.mo9266c() - 1);
            if (((DbObject) user).id.equals(((DbObject) x8hVar.m16037b()).id)) {
                postDelayed(new Runnable() { // from class: l.phh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11841a.m5998p2(x8hVar);
                    }
                }, 200L);
                break;
            }
        }
        list.clear();
    }

    @Override // p007l.zol
    /* JADX INFO: renamed from: T */
    public void mo5987T(final x8h x8hVar) {
        m6003w2(x8hVar, new e30() { // from class: l.uhh
            public final void call(Object obj) {
                this.f13837a.m5996o2(x8hVar, (Envelope) obj);
            }
        }, new e30() { // from class: l.vhh
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m5977Y1((Throwable) obj);
            }
        });
    }

    @Override // p007l.e5c
    /* JADX INFO: renamed from: a */
    public void mo5988a(Throwable th) {
        th.printStackTrace();
        this.f3572e.setVisibility(0);
        this.f3574g.setText("网络错误，请稍后重试");
        this.f3585r = false;
    }

    @Override // p007l.e5c
    /* JADX INFO: renamed from: c */
    public void mo5989c(int i, List<x8h> list, Links links) {
        boolean z;
        this.f3585r = false;
        if (this.f3578k.isEmpty()) {
            m6004y2(i);
            if (list.isEmpty()) {
                m6000r2();
                this.f3576i.mo9265a(-1, -1);
                return;
            } else {
                m5992i2();
                z = true;
            }
        } else {
            z = false;
        }
        if (list.isEmpty()) {
            return;
        }
        this.f3578k.addAll(list);
        this.f3576i.mo9265a(i, -1);
        this.f3577j.m17399s(this.f3578k);
        this.f3579l = i;
        if (z) {
            onPageSelected(0);
        }
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void finish() {
        User user;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<x8h> arrayList2 = this.f3578k;
        for (x8h x8hVar : arrayList2.subList(0, Math.min(arrayList2.size(), 3))) {
            if (x8hVar != null && (user = x8hVar.f14799a) != null) {
                arrayList.add(((DbObject) user).id);
            }
        }
        Intent intent = new Intent();
        intent.putExtra(PhotoAlbumActivitiesAct.f3709n, this.f3579l);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(PhotoAlbumActivitiesAct.f3707l, arrayList);
        bundle.putStringArrayList(PhotoAlbumActivitiesAct.f3708m, this.f3582o);
        intent.putExtra(PhotoAlbumActivitiesAct.f3710o, bundle);
        ((Act) this).act.setResult(-1, intent);
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    /* JADX INFO: renamed from: g2 */
    public View m5990g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return whh.m15814b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m5991h2(int i) {
        int size = this.f3578k.size() - i;
        if (size <= 0 || size >= 4 || this.f3585r) {
            return;
        }
        this.f3581n.m15924f();
        this.f3585r = true;
    }

    /* JADX INFO: renamed from: i2 */
    public final void m5992i2() {
        zhh zhhVar = new zhh(this, this);
        this.f3577j = zhhVar;
        this.f3571d.setAdapter(zhhVar);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM5990g2 = m5990g2(layoutInflater, viewGroup);
        m5985v2();
        m5993k2();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ohh
            public final void call(Object obj) {
                this.f11484a.m5984l2((c) obj);
            }
        }));
        return viewM5990g2;
    }

    /* JADX INFO: renamed from: k2 */
    public final void m5993k2() {
        this.f3571d.d(this);
        this.f3571d.setOffscreenPageLimit(3);
        this.f3576i = new yhh(this.f3570c, this);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m5994m2(Integer num) {
        m6002u2(num.intValue());
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m5995n2(x8h x8hVar, Followship followship) {
        m6001s2(x8hVar, true);
        m6003w2(x8hVar, null, null);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m5996o2(x8h x8hVar, Envelope envelope) {
        m6001s2(x8hVar, false);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        if (this.f3583p || this.f3584q == i) {
            return;
        }
        this.f3580m = i;
        this.f3576i.mo8595b(i);
        m5991h2(i);
        zvf0.A("e_interested_user_card", "p_interested_user", new j760[]{vwb.Y("notes_type", this.f3578k.get(i).m16037b().activityUser.action.equals(ActivityActionApi.moment_swipe) ? "respond_match" : this.f3578k.get(i).m16037b().activityUser.action), vwb.Y("card_user_id", ((DbObject) this.f3578k.get(i).m16037b()).id)});
        boolean zEquals = this.f3578k.get(i).m16037b().activityUser.action.equals(ActivityActionApi.moment_swipe);
        ArrayList<x8h> arrayList = this.f3578k;
        if (zEquals) {
            p6j0.m12915e("e_respond_match", "p_interested_user", j760.a("card_user_id", ((DbObject) arrayList.get(i).m16037b()).id));
        } else if ("like".equals(arrayList.get(i).m16037b().activityUser.action) && nkg.m12213K()) {
            p6j0.m12915e("e_polite_gratitude", "p_interested_user", j760.a("moments_user_id", ((DbObject) this.f3578k.get(i).m16037b()).id));
        } else {
            p6j0.m12915e(MatchScData.ModuleId.mid_e_follow, "p_interested_user", j760.a("card_user_id", ((DbObject) this.f3578k.get(i).m16037b()).id));
        }
        p6j0.m12915e("e_interested_user_card_close", "p_interested_user", j760.a("card_user_id", ((DbObject) this.f3578k.get(i).m16037b()).id));
        this.f3584q = i;
    }

    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        m5986A2();
    }

    @Override // p007l.zol
    /* JADX INFO: renamed from: p0 */
    public void mo5997p0(final x8h x8hVar, boolean z) {
        if (z) {
            m6001s2(x8hVar, true);
            m6003w2(x8hVar, null, null);
            return;
        }
        User userM16037b = x8hVar.m16037b();
        if (NullChecker.b(userM16037b)) {
            Followship followship = userM16037b.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(userM16037b.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(userM16037b.localFollowship.state, "unknown_")) {
                if (userM16037b.profile.moments.hidePublicMoments) {
                    lsi0.w(R$string.f590q);
                } else {
                    duringCreated(FeedModule.f316d.m16634f7(FeedModule.m1139F().userId(), userM16037b, true)).subscribe(mkd0.H(new e30() { // from class: l.shh
                        public final void call(Object obj) {
                            this.f12957a.m5995n2(x8hVar, (Followship) obj);
                        }
                    }, new e30() { // from class: l.thh
                        public final void call(Object obj) {
                            FeedMyInterestPeopleAct.m5978Z1((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m5998p2(x8h x8hVar) {
        m6003w2(x8hVar, null, null);
        m6001s2(x8hVar, true);
    }

    public String pageId() {
        return "p_interested_user";
    }

    /* JADX INFO: renamed from: q2 */
    public void m5999q2() {
        if (TextUtils.isEmpty(this.f3581n.m15921c())) {
            m6000r2();
        } else {
            this.f3581n.m15924f();
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m6000r2() {
        this.f3572e.setVisibility(0);
        this.f3574g.setText("没有更多了，先去冒个泡让更多的人看到你吧");
        this.f3576i.mo9265a(-1, -1);
    }

    /* JADX INFO: renamed from: s2 */
    public final void m6001s2(x8h x8hVar, boolean z) {
        zhh zhhVar = this.f3577j;
        if (z) {
            zhhVar.m17397q(this.f3578k.indexOf(x8hVar), this.f3586s);
        } else {
            zhhVar.m17398r(this.f3578k.indexOf(x8hVar), this.f3586s);
        }
        czl czlVar = this.f3576i;
        int i = this.f3579l - 1;
        this.f3579l = i;
        czlVar.mo9267d(i, -1);
        this.f3582o.add(((DbObject) x8hVar.f14799a).id);
    }

    /* JADX INFO: renamed from: u2 */
    public void m6002u2(int i) {
        if (i < this.f3578k.size()) {
            this.f3578k.remove(i);
            this.f3577j.m17399s(this.f3578k);
            if (this.f3578k.isEmpty()) {
                m5999q2();
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m6003w2(x8h x8hVar, final e30<Envelope> e30Var, final e30<Throwable> e30Var2) {
        duringCreated(FeedModule.f316d.m16550T6(((DbObject) x8hVar.m16037b()).id)).subscribe(mkd0.H(new e30() { // from class: l.qhh
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m5982d2(e30Var, (Envelope) obj);
            }
        }, new e30() { // from class: l.rhh
            public final void call(Object obj) {
                FeedMyInterestPeopleAct.m5979a2(e30Var2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y2 */
    public void m6004y2(int i) {
        this.f3575h.o(p6j0.m12911a(p6j0.C2456a.m12921f("user_num", i)));
        this.f3575h.r();
    }

    /* JADX INFO: renamed from: z2 */
    public void m6005z2(boolean z) {
        this.f3583p = z;
    }
}
