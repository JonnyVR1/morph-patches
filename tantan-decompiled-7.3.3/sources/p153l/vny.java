package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.common.member.view.MemberWeekLeaderBoardContentView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class vny implements iam<boy> {

    /* JADX INFO: renamed from: a */
    public final MemberWeekLeaderBoardContentView f184932a;

    /* JADX INFO: renamed from: b */
    public fwp0 f184933b;

    /* JADX INFO: renamed from: c */
    public boy f184934c;

    /* JADX INFO: renamed from: d */
    public String f184935d;

    public vny(Act act, final boy boyVar) {
        this.f184934c = boyVar;
        MemberWeekLeaderBoardContentView memberWeekLeaderBoardContentViewM74277l0 = MemberWeekLeaderBoardContentView.m74277l0(act.inflater());
        this.f184932a = memberWeekLeaderBoardContentViewM74277l0;
        memberWeekLeaderBoardContentViewM74277l0.setShowCardAction(new y20() { // from class: l.rny
            @Override // p153l.y20
            public final void call(Object obj) {
                kny.m150555c(boyVar, (String) obj);
            }
        });
        memberWeekLeaderBoardContentViewM74277l0.setOnRefreshListener(new x20() { // from class: l.sny
            @Override // p153l.x20
            public final void call() {
                vny.m202015d(boyVar);
            }
        });
        memberWeekLeaderBoardContentViewM74277l0.setOnCheckedChangeListener(new x20() { // from class: l.tny
            @Override // p153l.x20
            public final void call() {
                vny.m202014c(boyVar);
            }
        });
        memberWeekLeaderBoardContentViewM74277l0.setOnJumpClickListener(new View.OnClickListener() { // from class: l.uny
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179999a.m202021l(boyVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m202014c(boy boyVar) {
        if (boyVar != null) {
            boyVar.m105747h4();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m202015d(boy boyVar) {
        if (boyVar != null) {
            boyVar.m105747h4();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f184932a.getContext();
    }

    /* JADX INFO: renamed from: i */
    public MemberWeekLeaderBoardContentView m202018i() {
        return this.f184932a;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f184932a.f50090e.check(mdc0.f136100Y0);
        fwp0 fwp0Var = new fwp0(this.f184934c.act(), new y20() { // from class: l.qny
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158671a.m202020k((String) obj);
            }
        });
        this.f184933b = fwp0Var;
        this.f184932a.f50095j.setAdapter(fwp0Var);
    }

    /* JADX INFO: renamed from: j */
    public String m202019j() {
        return this.f184932a.getWeekBoardItem();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m202020k(String str) {
        kny.m150555c(this.f184934c, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m202021l(boy boyVar, View view) {
        if (TextUtils.isEmpty(this.f184935d)) {
            return;
        }
        boyVar.m138876w3(this.f184935d, qa00.m175859d(574.0f), 4100, 24);
    }

    /* JADX INFO: renamed from: m */
    public void m202022m() {
        if (NullChecker.m82486a(this.f184933b)) {
            this.f184933b.m127835H();
        }
        if (NullChecker.m82486a(this.f184932a)) {
            HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f184932a.f50095j.findViewWithTag(Integer.valueOf(mdc0.f135896B3));
            if (NullChecker.m82486a(hourBoardHeaderView)) {
                hourBoardHeaderView.m76021G();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m202023n(Pair<hcr, cm0> pair) {
        this.f184933b.m127841O(((hcr) pair.first).m134493c(), (cm0) pair.second, m202019j());
        this.f184935d = ((hcr) pair.first).m134496f().ruleUrl;
        this.f184932a.m74282p0(((hcr) pair.first).m134492b(), (cm0) pair.second);
    }

    /* JADX INFO: renamed from: p */
    public void m202024p() {
        this.f184932a.f50094i.setRefreshing(false);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(boy boyVar) {
    }
}
