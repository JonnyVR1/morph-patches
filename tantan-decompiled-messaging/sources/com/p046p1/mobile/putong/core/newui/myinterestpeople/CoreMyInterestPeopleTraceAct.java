package com.p046p1.mobile.putong.core.newui.myinterestpeople;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.navigationbar.VNavigationBar;
import p149l.cwf0;
import p149l.e30;
import p149l.e51;
import p149l.g1a;
import p149l.j760;
import p149l.mkd0;
import p149l.o6j0;
import p149l.osi0;
import p149l.p3m;
import p149l.q1a;
import p149l.s1a;
import p149l.u19;
import p149l.v1a;
import p149l.vwb;
import p149l.w39;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xgc0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyInterestPeopleTraceAct extends PutongAct implements g1a, u19 {

    /* JADX INFO: renamed from: c */
    public LinearLayout f26045c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f26046d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f26047e;

    /* JADX INFO: renamed from: f */
    public ImageView f26048f;

    /* JADX INFO: renamed from: g */
    public TextView f26049g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f26050h;

    /* JADX INFO: renamed from: k */
    public int f26053k;

    /* JADX INFO: renamed from: l */
    public v1a f26054l;

    /* JADX INFO: renamed from: o */
    public CoreMyInterestPeopleCardStack f26057o;

    /* JADX INFO: renamed from: p */
    public s1a f26058p;

    /* JADX INFO: renamed from: q */
    public p3m<C8192c.a, VSwipeStack.OnCardSwipeResult> f26059q;

    /* JADX INFO: renamed from: s */
    public int f26061s;

    /* JADX INFO: renamed from: i */
    public cwf0 f26051i = new cwf0("p_interested_user", CoreMyInterestPeopleTraceAct.class.getName());

    /* JADX INFO: renamed from: j */
    public ArrayList<w39> f26052j = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f26055m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public boolean f26056n = false;

    /* JADX INFO: renamed from: r */
    public int f26060r = 20;

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m42622b2(Throwable th) {
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m42623c2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m42626k2(C4319c c4319c) {
        if (NullChecker.m81304b(this.f26051i)) {
            if (c4319c == C4319c.f15545f) {
                this.f26051i.m109027c();
            } else if (c4319c == C4319c.f15549j) {
                this.f26051i.m109031g();
            } else if (c4319c == C4319c.f15552m) {
                this.f26051i.m109029e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m42627n2(String str) {
        w39 w39Var;
        View viewM42615d = this.f26057o.m42615d();
        if (viewM42615d == null || !(viewM42615d instanceof CoreMyInterestItem) || (w39Var = ((CoreMyInterestItem) viewM42615d).f26018i1) == null || !TextUtils.equals(w39Var.m201263c().f56011id, str)) {
            return;
        }
        this.f26057o.m42614A(SwipeDirection.LEFT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m42628o2(View view) {
        this.act.m50458m2();
    }

    /* JADX INFO: renamed from: r */
    private void m42629r() {
        this.f26046d.setLeftIconOnClick(new View.OnClickListener() { // from class: l.p1a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146660a.m42628o2(view);
            }
        });
        this.f26046d.setLeftIconResource(x2c0.f189593O);
        this.f26046d.setTitle("对你感兴趣的人");
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: M */
    public void mo42630M(w39 w39Var) {
        if (xgc0.m208625c(w39Var.m201263c().f56011id)) {
            act().startActivity(MessagesAct.m48943i2(act(), w39Var.m201263c().f56011id, false, false));
        } else {
            CoreModule.m29932K().mo30738Yn(act(), w39Var.m201263c().f56011id, null, "p_interested_user", null, false, "");
        }
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: a */
    public void mo42631a(Throwable th) {
        th.printStackTrace();
        xdl0.m208344M(this.f26047e, true);
        this.f26049g.setText("网络错误，请稍后重试");
        this.f26056n = false;
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: c */
    public void mo42632c(int i, List<w39> list, Links links) {
        this.f26056n = false;
        if (this.f26052j.isEmpty()) {
            m42644r2(i);
            if (list.isEmpty()) {
                xdl0.m208344M(this.f26047e, true);
                return;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        xdl0.m208344M(this.f26047e, false);
        this.f26052j.addAll(list);
        this.f26058p.m181936n(this.f26052j);
        this.f26053k = i;
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: d */
    public VSwipeStack.OnCardSwipeResult mo42633d(View view, SwipeDirection swipeDirection, boolean z) {
        w39 w39Var = view instanceof CoreMyInterestItem ? ((CoreMyInterestItem) view).f26018i1 : null;
        if (w39Var == null) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (CoreModule.m29934N().mo60281Hj() && swipeDirection == SwipeDirection.RIGHT && w39Var.m201261a() == 6 && this.f26061s <= 0) {
            osi0.m165783g("小红花余额不足");
            ((CoreMyInterestItem) view).mo42600d(w39Var);
            return VSwipeStack.OnCardSwipeResult.back;
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2 && w39Var.m201261a() == 5 && this.f26060r <= 0) {
            osi0.m165783g("今日礼貌回谢已达上限");
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f26059q == null) {
            this.f26059q = new C8192c();
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37497a = this.f26059q.mo37497a(new C8192c.a(act(), w39Var, view, swipeDirection, z, this));
        if (onCardSwipeResultMo37497a == VSwipeStack.OnCardSwipeResult.pass) {
            if (swipeDirection == swipeDirection2) {
                if (CoreModule.m29934N().mo60281Hj() && w39Var.m201261a() == 6) {
                    int i = this.f26061s - 1;
                    this.f26061s = i;
                    if (i == 0) {
                        e51.m114742G(new Runnable() { // from class: l.j1a
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f115777a.m42641p2();
                            }
                        });
                    }
                } else if (w39Var.m201261a() == 5) {
                    this.f26060r--;
                }
            }
            zvf0.m220371D("e_swipeaction", "p_interested_user", new j760("actionname", swipeDirection == swipeDirection2 ? "like" : "dislike"));
        }
        return onCardSwipeResultMo37497a;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: e */
    public void mo42634e(w39 w39Var, boolean z) {
        this.f26057o.m42616r(SwipeDirection.RIGHT, true);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m50458m2() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f26052j.size(); i++) {
            w39 w39Var = this.f26052j.get(i);
            if (w39Var != null && w39Var.f184317a != null && arrayList.size() < 3) {
                arrayList.add(w39Var.f184317a.f56011id);
            }
        }
        Intent intent = new Intent();
        intent.putExtra("interested_users_counter", this.f26053k - this.f26055m.size());
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("interested_users_front_part", arrayList);
        bundle.putStringArrayList("interested_users_removed", this.f26055m);
        intent.putExtra("interested_users_counter_bundle", bundle);
        this.act.setResult(-1, intent);
        super.m50458m2();
    }

    /* JADX INFO: renamed from: g2 */
    public View m42635g2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q1a.m172384b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m42636h2() {
        duringCreated(CoreModule.f17545c.f19678r0.m34152w5()).subscribe(mkd0.m154956H(new e30() { // from class: l.l1a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125625a.m42639l2((Integer) obj);
            }
        }, new e30() { // from class: l.m1a
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMyInterestPeopleTraceAct.m42622b2((Throwable) obj);
            }
        }));
        if (CoreModule.m29934N().mo60281Hj()) {
            duringCreated(CoreModule.m29932K().counter().map(new w9j() { // from class: l.n1a
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).flower.count);
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.o1a
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141417a.m42640m2((Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m42637i2() {
        CoreMyInterestPeopleCardStack coreMyInterestPeopleCardStack = new CoreMyInterestPeopleCardStack(act(), this);
        this.f26057o = coreMyInterestPeopleCardStack;
        coreMyInterestPeopleCardStack.setClipChildren(false);
        this.f26057o.setClipToPadding(false);
        this.f26050h.addView(this.f26057o, 0, new FrameLayout.LayoutParams(-1, -1));
        s1a s1aVar = new s1a(this, this, this.f26057o);
        this.f26058p = s1aVar;
        this.f26057o.setAdapter(s1aVar);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM42635g2 = m42635g2(layoutInflater, viewGroup);
        m42629r();
        m42637i2();
        m42643q2();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.k1a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120554a.m42626k2((C4319c) obj);
            }
        }));
        return viewM42635g2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(CoreModule.f17545c.f19678r0.f20029j0).subscribe(mkd0.m154956H(new e30() { // from class: l.h1a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105291a.m42627n2((String) obj);
            }
        }, new e30() { // from class: l.i1a
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMyInterestPeopleTraceAct.m42623c2((Throwable) obj);
            }
        }));
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: l0 */
    public void mo42638l0(w39 w39Var) {
        m42646s2(w39Var);
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m42639l2(Integer num) {
        this.f26060r = num.intValue();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m42640m2(Integer num) {
        this.f26061s = num.intValue();
        if (num.intValue() == 0) {
            this.f26058p.mo104259a();
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m42641p2() {
        this.f26058p.mo104259a();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_interested_user";
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: q0 */
    public void mo42642q0(w39 w39Var) {
        this.f26057o.m42616r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: q2 */
    public final void m42643q2() {
        m42636h2();
        v1a v1aVar = new v1a(this, this);
        this.f26054l = v1aVar;
        v1aVar.m196546d();
    }

    /* JADX INFO: renamed from: r2 */
    public void m42644r2(int i) {
        this.f26051i.m109039o(o6j0.m162858b(o6j0.C18854a.m162876f("user_num", i)));
        this.f26051i.m109042r();
    }

    @Override // p149l.u19
    /* JADX INFO: renamed from: s */
    public void mo42645s(View view, SwipeDirection swipeDirection, w39 w39Var) {
        this.f26055m.add(w39Var.m201263c().f56011id);
        if (this.f26053k > this.f26055m.size()) {
            if (NullChecker.m81303a(this.f26052j) && this.f26052j.size() >= 2) {
                m42646s2(this.f26052j.get(1));
            }
        } else if (!xdl0.m208349O0(this.f26047e)) {
            xdl0.m208344M(this.f26047e, true);
        }
        int size = this.f26052j.size();
        if (size <= 0 || size > 4 || this.f26056n) {
            return;
        }
        this.f26054l.m196544b();
        this.f26056n = true;
    }

    /* JADX INFO: renamed from: s2 */
    public void m42646s2(w39 w39Var) {
        if (w39Var == null) {
            return;
        }
        zvf0.m220368A("e_interested_user_card", "p_interested_user", vwb.m200311Y("notes_type", w39Var.m201263c().activityUser.action.equals(ActivityActionApi.moment_swipe) ? "respond_match" : w39Var.m201263c().activityUser.action), vwb.m200311Y("card_user_id", w39Var.m201263c().f56011id));
        if (w39Var.m201263c().activityUser.action.equals(ActivityActionApi.moment_swipe)) {
            o6j0.m162868l("e_respond_match", "p_interested_user", j760.m140076a("card_user_id", w39Var.m201263c().f56011id));
        } else if ("like".equals(w39Var.m201263c().activityUser.action) && CoreModule.m29934N().mo60389so()) {
            o6j0.m162868l("e_polite_gratitude", "p_interested_user", j760.m140076a("moments_user_id", w39Var.m201263c().f56011id));
        } else {
            o6j0.m162868l(MatchScData.ModuleId.mid_e_follow, "p_interested_user", j760.m140076a("card_user_id", w39Var.m201263c().f56011id));
        }
        o6j0.m162868l("e_interested_user_card_close", "p_interested_user", j760.m140076a("card_user_id", w39Var.m201263c().f56011id));
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: u0 */
    public void mo42647u0(float f, float f2, float f3) {
        if ((f2 > 0.0f || f > 0.0f) && !xdl0.m208349O0(this.f26047e)) {
            xdl0.m208344M(this.f26047e, true);
        }
        if (f2 == 0.0f && f == 0.0f) {
            xdl0.m208344M(this.f26047e, false);
        }
    }

    @Override // p149l.g1a
    /* JADX INFO: renamed from: v */
    public void mo42648v() {
    }
}
