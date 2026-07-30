package com.p051p1.mobile.putong.core.newui.myinterestpeople;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.myinterestpeople.CoreMyInterestPeopleTraceAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.navigationbar.VNavigationBar;
import p153l.b3a;
import p153l.bnl0;
import p153l.d39;
import p153l.d3a;
import p153l.dbc0;
import p153l.epc0;
import p153l.f59;
import p153l.g3a;
import p153l.g6m;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.l51;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.r2a;
import p153l.sfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CoreMyInterestPeopleTraceAct extends PutongAct implements r2a, d39 {

    /* JADX INFO: renamed from: c */
    public LinearLayout f26787c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f26788d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f26789e;

    /* JADX INFO: renamed from: f */
    public ImageView f26790f;

    /* JADX INFO: renamed from: g */
    public TextView f26791g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f26792h;

    /* JADX INFO: renamed from: k */
    public int f26795k;

    /* JADX INFO: renamed from: l */
    public g3a f26796l;

    /* JADX INFO: renamed from: o */
    public CoreMyInterestPeopleCardStack f26799o;

    /* JADX INFO: renamed from: p */
    public d3a f26800p;

    /* JADX INFO: renamed from: q */
    public g6m<C8343c.a, VSwipeStack.OnCardSwipeResult> f26801q;

    /* JADX INFO: renamed from: s */
    public int f26803s;

    /* JADX INFO: renamed from: i */
    public l4g0 f26793i = new l4g0("p_interested_user", CoreMyInterestPeopleTraceAct.class.getName());

    /* JADX INFO: renamed from: j */
    public ArrayList<f59> f26794j = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f26797m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public boolean f26798n = false;

    /* JADX INFO: renamed from: r */
    public int f26802r = 20;

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m43633c2(Throwable th) {
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m43634d2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m43637l2(C4470c c4470c) {
        if (NullChecker.m82487b(this.f26793i)) {
            if (c4470c == C4470c.f16264f) {
                this.f26793i.m152768c();
            } else if (c4470c == C4470c.f16268j) {
                this.f26793i.m152772g();
            } else if (c4470c == C4470c.f16271m) {
                this.f26793i.m152770e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m43638o2(String str) {
        f59 f59Var;
        View viewM43626d = this.f26799o.m43626d();
        if (viewM43626d == null || !(viewM43626d instanceof CoreMyInterestItem) || (f59Var = ((CoreMyInterestItem) viewM43626d).f26760i1) == null || !TextUtils.equals(f59Var.m124109c().f56859id, str)) {
            return;
        }
        this.f26799o.m43625A(SwipeDirection.LEFT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m43639p2(View view) {
        this.act.m51642n2();
    }

    /* JADX INFO: renamed from: r */
    private void m43640r() {
        this.f26788d.setLeftIconOnClick(new View.OnClickListener() { // from class: l.a3a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68283a.m43639p2(view);
            }
        });
        this.f26788d.setLeftIconResource(dbc0.f86456P);
        this.f26788d.setTitle("对你感兴趣的人");
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: O */
    public void mo43641O(f59 f59Var) {
        if (epc0.m121848c(f59Var.m124109c().f56859id)) {
            act().startActivity(MessagesAct.m50126k2(act(), f59Var.m124109c().f56859id, false, false));
        } else {
            CoreModule.m30930K().mo31741Yn(act(), f59Var.m124109c().f56859id, null, "p_interested_user", null, false, "");
        }
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: a */
    public void mo43642a(Throwable th) {
        th.printStackTrace();
        bnl0.m105524M(this.f26789e, true);
        this.f26791g.setText("网络错误，请稍后重试");
        this.f26798n = false;
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: c */
    public void mo43643c(int i, List<f59> list, Links links) {
        this.f26798n = false;
        if (this.f26794j.isEmpty()) {
            m43656s2(i);
            if (list.isEmpty()) {
                bnl0.m105524M(this.f26789e, true);
                return;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        bnl0.m105524M(this.f26789e, false);
        this.f26794j.addAll(list);
        this.f26800p.m113798n(this.f26794j);
        this.f26795k = i;
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: d */
    public VSwipeStack.OnCardSwipeResult mo43644d(View view, SwipeDirection swipeDirection, boolean z) {
        f59 f59Var = view instanceof CoreMyInterestItem ? ((CoreMyInterestItem) view).f26760i1 : null;
        if (f59Var == null) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (swipeDirection == SwipeDirection.UP) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (CoreModule.m30932N().mo61465Hj() && swipeDirection == SwipeDirection.RIGHT && f59Var.m124107a() == 6 && this.f26803s <= 0) {
            r1j0.m179420g("小红花余额不足");
            ((CoreMyInterestItem) view).mo43611d(f59Var);
            return VSwipeStack.OnCardSwipeResult.back;
        }
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection == swipeDirection2 && f59Var.m124107a() == 5 && this.f26802r <= 0) {
            r1j0.m179420g("今日礼貌回谢已达上限");
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f26801q == null) {
            this.f26801q = new C8343c();
        }
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38500a = this.f26801q.mo38500a(new C8343c.a(act(), f59Var, view, swipeDirection, z, this));
        if (onCardSwipeResultMo38500a == VSwipeStack.OnCardSwipeResult.pass) {
            if (swipeDirection == swipeDirection2) {
                if (CoreModule.m30932N().mo61465Hj() && f59Var.m124107a() == 6) {
                    int i = this.f26803s - 1;
                    this.f26803s = i;
                    if (i == 0) {
                        l51.m152887G(new Runnable() { // from class: l.u2a
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f177197a.m43652q2();
                            }
                        });
                    }
                } else if (f59Var.m124107a() == 5) {
                    this.f26802r--;
                }
            }
            i4g0.m138495D("e_swipeaction", "p_interested_user", new pf60("actionname", swipeDirection == swipeDirection2 ? "like" : "dislike"));
        }
        return onCardSwipeResultMo38500a;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: e */
    public void mo43645e(f59 f59Var, boolean z) {
        this.f26799o.m43627r(SwipeDirection.RIGHT, true);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m51642n2() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f26794j.size(); i++) {
            f59 f59Var = this.f26794j.get(i);
            if (f59Var != null && f59Var.f97205a != null && arrayList.size() < 3) {
                arrayList.add(f59Var.f97205a.f56859id);
            }
        }
        Intent intent = new Intent();
        intent.putExtra("interested_users_counter", this.f26795k - this.f26797m.size());
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("interested_users_front_part", arrayList);
        bundle.putStringArrayList("interested_users_removed", this.f26797m);
        intent.putExtra("interested_users_counter_bundle", bundle);
        this.act.setResult(-1, intent);
        super.m51642n2();
    }

    /* JADX INFO: renamed from: h2 */
    public View m43646h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b3a.m102277b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i2 */
    public final void m43647i2() {
        duringCreated(CoreModule.f18264c.f20420r0.m35155w5()).subscribe(psd0.m173597H(new y20() { // from class: l.w2a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186890a.m43650m2((Integer) obj);
            }
        }, new y20() { // from class: l.x2a
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMyInterestPeopleTraceAct.m43633c2((Throwable) obj);
            }
        }));
        if (CoreModule.m30932N().mo61465Hj()) {
            duringCreated(CoreModule.m30930K().counter().map(new qcj() { // from class: l.y2a
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Integer.valueOf(((Counter) obj).flower.count);
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.z2a
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202664a.m43651n2((Integer) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM43646h2 = m43646h2(layoutInflater, viewGroup);
        m43640r();
        m43648k2();
        m43654r2();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.v2a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182085a.m43637l2((C4470c) obj);
            }
        }));
        return viewM43646h2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(CoreModule.f18264c.f20420r0.f20771j0).subscribe(psd0.m173597H(new y20() { // from class: l.s2a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165871a.m43638o2((String) obj);
            }
        }, new y20() { // from class: l.t2a
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMyInterestPeopleTraceAct.m43634d2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final void m43648k2() {
        CoreMyInterestPeopleCardStack coreMyInterestPeopleCardStack = new CoreMyInterestPeopleCardStack(act(), this);
        this.f26799o = coreMyInterestPeopleCardStack;
        coreMyInterestPeopleCardStack.setClipChildren(false);
        this.f26799o.setClipToPadding(false);
        this.f26792h.addView(this.f26799o, 0, new FrameLayout.LayoutParams(-1, -1));
        d3a d3aVar = new d3a(this, this, this.f26799o);
        this.f26800p = d3aVar;
        this.f26799o.setAdapter(d3aVar);
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: m0 */
    public void mo43649m0(f59 f59Var) {
        m43657u2(f59Var);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m43650m2(Integer num) {
        this.f26802r = num.intValue();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m43651n2(Integer num) {
        this.f26803s = num.intValue();
        if (num.intValue() == 0) {
            this.f26800p.mo140726a();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_interested_user";
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m43652q2() {
        this.f26800p.mo140726a();
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: r0 */
    public void mo43653r0(f59 f59Var) {
        this.f26799o.m43627r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m43654r2() {
        m43647i2();
        g3a g3aVar = new g3a(this, this);
        this.f26796l = g3aVar;
        g3aVar.m128723d();
    }

    @Override // p153l.d39
    /* JADX INFO: renamed from: s */
    public void mo43655s(View view, SwipeDirection swipeDirection, f59 f59Var) {
        this.f26797m.add(f59Var.m124109c().f56859id);
        if (this.f26795k > this.f26797m.size()) {
            if (NullChecker.m82486a(this.f26794j) && this.f26794j.size() >= 2) {
                m43657u2(this.f26794j.get(1));
            }
        } else if (!bnl0.m105529O0(this.f26789e)) {
            bnl0.m105524M(this.f26789e, true);
        }
        int size = this.f26794j.size();
        if (size <= 0 || size > 4 || this.f26798n) {
            return;
        }
        this.f26796l.m128721b();
        this.f26798n = true;
    }

    /* JADX INFO: renamed from: s2 */
    public void m43656s2(int i) {
        this.f26793i.m152780o(sfj0.m185595b(sfj0.C20032a.m185613f("user_num", i)));
        this.f26793i.m152783r();
    }

    /* JADX INFO: renamed from: u2 */
    public void m43657u2(f59 f59Var) {
        if (f59Var == null) {
            return;
        }
        i4g0.m138492A("e_interested_user_card", "p_interested_user", jyb.m147494Y("notes_type", f59Var.m124109c().activityUser.action.equals(ActivityActionApi.moment_swipe) ? "respond_match" : f59Var.m124109c().activityUser.action), jyb.m147494Y("card_user_id", f59Var.m124109c().f56859id));
        if (f59Var.m124109c().activityUser.action.equals(ActivityActionApi.moment_swipe)) {
            sfj0.m185605l("e_respond_match", "p_interested_user", pf60.m172085a("card_user_id", f59Var.m124109c().f56859id));
        } else if ("like".equals(f59Var.m124109c().activityUser.action) && CoreModule.m30932N().mo61573so()) {
            sfj0.m185605l("e_polite_gratitude", "p_interested_user", pf60.m172085a("moments_user_id", f59Var.m124109c().f56859id));
        } else {
            sfj0.m185605l(MatchScData.ModuleId.mid_e_follow, "p_interested_user", pf60.m172085a("card_user_id", f59Var.m124109c().f56859id));
        }
        sfj0.m185605l("e_interested_user_card_close", "p_interested_user", pf60.m172085a("card_user_id", f59Var.m124109c().f56859id));
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: v */
    public void mo43658v() {
    }

    @Override // p153l.r2a
    /* JADX INFO: renamed from: v0 */
    public void mo43659v0(float f, float f2, float f3) {
        if ((f2 > 0.0f || f > 0.0f) && !bnl0.m105529O0(this.f26789e)) {
            bnl0.m105524M(this.f26789e, true);
        }
        if (f2 == 0.0f && f == 0.0f) {
            bnl0.m105524M(this.f26789e, false);
        }
    }
}
