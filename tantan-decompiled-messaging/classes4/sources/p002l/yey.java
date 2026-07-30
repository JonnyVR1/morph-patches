package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.member.view.MemberWeekLeaderBoardContentView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.s7m;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yey implements s7m<efy> {

    /* JADX INFO: renamed from: a */
    public final MemberWeekLeaderBoardContentView f22825a;

    /* JADX INFO: renamed from: b */
    public bnp0 f22826b;

    /* JADX INFO: renamed from: c */
    public efy f22827c;

    /* JADX INFO: renamed from: d */
    public String f22828d;

    public yey(Act act, final efy efyVar) {
        this.f22827c = efyVar;
        MemberWeekLeaderBoardContentView memberWeekLeaderBoardContentViewM6620l0 = MemberWeekLeaderBoardContentView.m6620l0(act.inflater());
        this.f22825a = memberWeekLeaderBoardContentViewM6620l0;
        memberWeekLeaderBoardContentViewM6620l0.setShowCardAction(new e30() { // from class: l.uey
            public final void call(Object obj) {
                ney.m18700c(efyVar, (String) obj);
            }
        });
        memberWeekLeaderBoardContentViewM6620l0.setOnRefreshListener(new d30() { // from class: l.vey
            public final void call() {
                yey.m26663d(efyVar);
            }
        });
        memberWeekLeaderBoardContentViewM6620l0.setOnCheckedChangeListener(new d30() { // from class: l.wey
            public final void call() {
                yey.m26662c(efyVar);
            }
        });
        memberWeekLeaderBoardContentViewM6620l0.setOnJumpClickListener(new View.OnClickListener() { // from class: l.xey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22249a.m26671l(efyVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m26662c(efy efyVar) {
        if (efyVar != null) {
            efyVar.m12468h4();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m26663d(efy efyVar) {
        if (efyVar != null) {
            efyVar.m12468h4();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m26665C0() {
        return this.f22825a.getContext();
    }

    /* JADX INFO: renamed from: i */
    public MemberWeekLeaderBoardContentView m26667i() {
        return this.f22825a;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f22825a.f5284e.check(g5c0.f11005Y0);
        bnp0 bnp0Var = new bnp0(this.f22827c.act(), new e30() { // from class: l.tey
            public final void call(Object obj) {
                this.f20205a.m26670k((String) obj);
            }
        });
        this.f22826b = bnp0Var;
        this.f22825a.f5289j.setAdapter(bnp0Var);
    }

    /* JADX INFO: renamed from: j */
    public String m26669j() {
        return this.f22825a.getWeekBoardItem();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m26670k(String str) {
        ney.m18700c(this.f22827c, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m26671l(efy efyVar, View view) {
        if (TextUtils.isEmpty(this.f22828d)) {
            return;
        }
        efyVar.m14204w3(this.f22828d, t100.d(574.0f), 4100, 24);
    }

    /* JADX INFO: renamed from: m */
    public void m26672m() {
        if (NullChecker.a(this.f22826b)) {
            this.f22826b.m10528H();
        }
        if (NullChecker.a(this.f22825a)) {
            HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f22825a.f5289j.findViewWithTag(Integer.valueOf(g5c0.f10801B3));
            if (NullChecker.a(hourBoardHeaderView)) {
                hourBoardHeaderView.m8438G();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m26673n(Pair<far, gm0> pair) {
        this.f22826b.m10534O(((far) pair.first).m13041c(), (gm0) pair.second, m26669j());
        this.f22828d = ((far) pair.first).m13044f().ruleUrl;
        this.f22825a.m6625p0(((far) pair.first).m13040b(), (gm0) pair.second);
    }

    /* JADX INFO: renamed from: p */
    public void m26674p() {
        this.f22825a.f5288i.setRefreshing(false);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m26668i1(efy efyVar) {
    }
}
