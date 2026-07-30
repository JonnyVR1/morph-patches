package com.p000p1.mobile.putong.core.newui.myinterestpeople;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Links;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.q1a;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xgc0;
import l.zvf0;
import p009l.g1a;
import p009l.p3m;
import p009l.s1a;
import p009l.u19;
import p009l.v1a;
import p009l.w39;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreMyInterestPeopleTraceAct extends PutongAct implements g1a, u19 {

    /* JADX INFO: renamed from: c */
    public LinearLayout f4823c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f4824d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f4825e;

    /* JADX INFO: renamed from: f */
    public ImageView f4826f;

    /* JADX INFO: renamed from: g */
    public TextView f4827g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f4828h;

    /* JADX INFO: renamed from: k */
    public int f4831k;

    /* JADX INFO: renamed from: l */
    public v1a f4832l;

    /* JADX INFO: renamed from: o */
    public CoreMyInterestPeopleCardStack f4835o;

    /* JADX INFO: renamed from: p */
    public s1a f4836p;

    /* JADX INFO: renamed from: q */
    public p3m<C0356c.a, VSwipeStack.OnCardSwipeResult> f4837q;

    /* JADX INFO: renamed from: s */
    public int f4839s;

    /* JADX INFO: renamed from: i */
    public cwf0 f4829i = new cwf0("p_interested_user", CoreMyInterestPeopleTraceAct.class.getName());

    /* JADX INFO: renamed from: j */
    public ArrayList<w39> f4830j = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f4833m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public boolean f4834n = false;

    /* JADX INFO: renamed from: r */
    public int f4838r = 20;

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m6785b2(Throwable th) {
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m6786c2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m6789k2(c cVar) {
        if (NullChecker.b(this.f4829i)) {
            if (cVar == c.f) {
                this.f4829i.c();
            } else if (cVar == c.j) {
                this.f4829i.g();
            } else if (cVar == c.m) {
                this.f4829i.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m6790n2(String str) {
        w39 w39Var;
        View viewM6778d = this.f4835o.m6778d();
        if (viewM6778d == null || !(viewM6778d instanceof CoreMyInterestItem) || (w39Var = ((CoreMyInterestItem) viewM6778d).f4796i1) == null || !TextUtils.equals(((DbObject) w39Var.m23799c()).id, str)) {
            return;
        }
        this.f4835o.m6777A(SwipeDirection.LEFT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m6791o2(View view) {
        ((Act) this).act.finish();
    }

    /* JADX INFO: renamed from: r */
    private void m6792r() {
        this.f4824d.setLeftIconOnClick(new View.OnClickListener() { // from class: l.p1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18314a.m6791o2(view);
            }
        });
        this.f4824d.setLeftIconResource(x2c0.O);
        this.f4824d.setTitle("对你感兴趣的人");
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: M */
    public void mo6793M(w39 w39Var) {
        if (xgc0.c(((DbObject) w39Var.m23799c()).id)) {
            act().startActivity(MessagesAct.i2(act(), ((DbObject) w39Var.m23799c()).id, false, false));
        } else {
            CoreModule.K().Yn(act(), ((DbObject) w39Var.m23799c()).id, (String) null, "p_interested_user", (String) null, false, "");
        }
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: a */
    public void mo6794a(Throwable th) {
        th.printStackTrace();
        xdl0.M(this.f4825e, true);
        this.f4827g.setText("网络错误，请稍后重试");
        this.f4834n = false;
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: c */
    public void mo6795c(int i, List<w39> list, Links links) {
        this.f4834n = false;
        if (this.f4830j.isEmpty()) {
            m6807r2(i);
            if (list.isEmpty()) {
                xdl0.M(this.f4825e, true);
                return;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        xdl0.M(this.f4825e, false);
        this.f4830j.addAll(list);
        this.f4836p.m21981n(this.f4830j);
        this.f4831k = i;
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: d */
    public VSwipeStack.OnCardSwipeResult mo6796d(View view, SwipeDirection swipeDirection, boolean z) {
        w39 w39Var = view instanceof CoreMyInterestItem ? ((CoreMyInterestItem) view).f4796i1 : null;
        if (w39Var == null) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (CoreModule.N().Hj() && swipeDirection == SwipeDirection.RIGHT && w39Var.m23797a() == 6 && this.f4839s <= 0) {
            osi0.g("小红花余额不足");
            ((CoreMyInterestItem) view).mo6763d(w39Var);
            return VSwipeStack.OnCardSwipeResult.back;
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2 && w39Var.m23797a() == 5 && this.f4838r <= 0) {
            osi0.g("今日礼貌回谢已达上限");
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f4837q == null) {
            this.f4837q = new C0356c();
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1468a = this.f4837q.mo1468a(new C0356c.a(act(), w39Var, view, swipeDirection, z, this));
        if (onCardSwipeResultMo1468a == VSwipeStack.OnCardSwipeResult.pass) {
            if (swipeDirection == swipeDirection2) {
                if (CoreModule.N().Hj() && w39Var.m23797a() == 6) {
                    int i = this.f4839s - 1;
                    this.f4839s = i;
                    if (i == 0) {
                        e51.G(new Runnable() { // from class: l.j1a
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f14896a.m6804p2();
                            }
                        });
                    }
                } else if (w39Var.m23797a() == 5) {
                    this.f4838r--;
                }
            }
            zvf0.D("e_swipeaction", "p_interested_user", new j760[]{new j760("actionname", swipeDirection == swipeDirection2 ? "like" : "dislike")});
        }
        return onCardSwipeResultMo1468a;
    }

    public boolean disableAutoPV() {
        return true;
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: e */
    public void mo6797e(w39 w39Var, boolean z) {
        this.f4835o.m6779r(SwipeDirection.RIGHT, true);
    }

    public void finish() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f4830j.size(); i++) {
            w39 w39Var = this.f4830j.get(i);
            if (w39Var != null && w39Var.f21867a != null && arrayList.size() < 3) {
                arrayList.add(((DbObject) w39Var.f21867a).id);
            }
        }
        Intent intent = new Intent();
        intent.putExtra("interested_users_counter", this.f4831k - this.f4833m.size());
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("interested_users_front_part", arrayList);
        bundle.putStringArrayList("interested_users_removed", this.f4833m);
        intent.putExtra("interested_users_counter_bundle", bundle);
        ((Act) this).act.setResult(-1, intent);
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    /* JADX INFO: renamed from: g2 */
    public View m6798g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q1a.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m6799h2() {
        duringCreated(CoreModule.c.r0.w5()).subscribe(mkd0.H(new e30() { // from class: l.l1a
            public final void call(Object obj) {
                this.f15907a.m6802l2((Integer) obj);
            }
        }, new e30() { // from class: l.m1a
            public final void call(Object obj) {
                CoreMyInterestPeopleTraceAct.m6785b2((Throwable) obj);
            }
        }));
        if (CoreModule.N().Hj()) {
            duringCreated(CoreModule.K().counter().map(new w9j() { // from class: l.n1a
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).flower.count);
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.o1a
                public final void call(Object obj) {
                    this.f17798a.m6803m2((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m6800i2() {
        CoreMyInterestPeopleCardStack coreMyInterestPeopleCardStack = new CoreMyInterestPeopleCardStack((Context) act(), (g1a) this);
        this.f4835o = coreMyInterestPeopleCardStack;
        coreMyInterestPeopleCardStack.setClipChildren(false);
        this.f4835o.setClipToPadding(false);
        this.f4828h.addView(this.f4835o, 0, new FrameLayout.LayoutParams(-1, -1));
        s1a s1aVar = new s1a(this, this, this.f4835o);
        this.f4836p = s1aVar;
        this.f4835o.setAdapter(s1aVar);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM6798g2 = m6798g2(layoutInflater, viewGroup);
        m6792r();
        m6800i2();
        m6806q2();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.k1a
            public final void call(Object obj) {
                this.f15384a.m6789k2((c) obj);
            }
        }));
        return viewM6798g2;
    }

    public void initSubscription() {
        super.initSubscription();
        duringCreated(CoreModule.c.r0.j0).subscribe(mkd0.H(new e30() { // from class: l.h1a
            public final void call(Object obj) {
                this.f13838a.m6790n2((String) obj);
            }
        }, new e30() { // from class: l.i1a
            public final void call(Object obj) {
                CoreMyInterestPeopleTraceAct.m6786c2((Throwable) obj);
            }
        }));
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: l0 */
    public void mo6801l0(w39 w39Var) {
        m6809s2(w39Var);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m6802l2(Integer num) {
        this.f4838r = num.intValue();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m6803m2(Integer num) {
        this.f4839s = num.intValue();
        if (num.intValue() == 0) {
            this.f4836p.mo12312a();
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m6804p2() {
        this.f4836p.mo12312a();
    }

    public String pageId() {
        return "p_interested_user";
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: q0 */
    public void mo6805q0(w39 w39Var) {
        this.f4835o.m6779r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: q2 */
    public final void m6806q2() {
        m6799h2();
        v1a v1aVar = new v1a(this, this);
        this.f4832l = v1aVar;
        v1aVar.m23230d();
    }

    /* JADX INFO: renamed from: r2 */
    public void m6807r2(int i) {
        this.f4829i.o(o6j0.b(new o6j0.a[]{o6j0.a.f("user_num", i)}));
        this.f4829i.r();
    }

    @Override // p009l.u19
    /* JADX INFO: renamed from: s */
    public void mo6808s(View view, SwipeDirection swipeDirection, w39 w39Var) {
        this.f4833m.add(((DbObject) w39Var.m23799c()).id);
        if (this.f4831k > this.f4833m.size()) {
            if (NullChecker.a(this.f4830j) && this.f4830j.size() >= 2) {
                m6809s2(this.f4830j.get(1));
            }
        } else if (!xdl0.O0(this.f4825e)) {
            xdl0.M(this.f4825e, true);
        }
        int size = this.f4830j.size();
        if (size <= 0 || size > 4 || this.f4834n) {
            return;
        }
        this.f4832l.m23228b();
        this.f4834n = true;
    }

    /* JADX INFO: renamed from: s2 */
    public void m6809s2(w39 w39Var) {
        if (w39Var == null) {
            return;
        }
        zvf0.A("e_interested_user_card", "p_interested_user", new j760[]{vwb.Y("notes_type", w39Var.m23799c().activityUser.action.equals("moment_swipe") ? "respond_match" : w39Var.m23799c().activityUser.action), vwb.Y("card_user_id", ((DbObject) w39Var.m23799c()).id)});
        if (w39Var.m23799c().activityUser.action.equals("moment_swipe")) {
            o6j0.l("e_respond_match", "p_interested_user", new j760[]{j760.a("card_user_id", ((DbObject) w39Var.m23799c()).id)});
        } else if ("like".equals(w39Var.m23799c().activityUser.action) && CoreModule.N().so()) {
            o6j0.l("e_polite_gratitude", "p_interested_user", new j760[]{j760.a("moments_user_id", ((DbObject) w39Var.m23799c()).id)});
        } else {
            o6j0.l("e_follow", "p_interested_user", new j760[]{j760.a("card_user_id", ((DbObject) w39Var.m23799c()).id)});
        }
        o6j0.l("e_interested_user_card_close", "p_interested_user", new j760[]{j760.a("card_user_id", ((DbObject) w39Var.m23799c()).id)});
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: u0 */
    public void mo6810u0(float f, float f2, float f3) {
        if ((f2 > 0.0f || f > 0.0f) && !xdl0.O0(this.f4825e)) {
            xdl0.M(this.f4825e, true);
        }
        if (f2 == 0.0f && f == 0.0f) {
            xdl0.M(this.f4825e, false);
        }
    }

    @Override // p009l.g1a
    /* JADX INFO: renamed from: v */
    public void mo6811v() {
    }
}
