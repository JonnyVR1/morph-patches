package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.common.member.view.MemberWeekLeaderBoardContentView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class yey implements s7m<efy> {

    /* JADX INFO: renamed from: a */
    public final MemberWeekLeaderBoardContentView f197970a;

    /* JADX INFO: renamed from: b */
    public bnp0 f197971b;

    /* JADX INFO: renamed from: c */
    public efy f197972c;

    /* JADX INFO: renamed from: d */
    public String f197973d;

    public yey(Act act, final efy efyVar) {
        this.f197972c = efyVar;
        MemberWeekLeaderBoardContentView memberWeekLeaderBoardContentViewM73094l0 = MemberWeekLeaderBoardContentView.m73094l0(act.inflater());
        this.f197970a = memberWeekLeaderBoardContentViewM73094l0;
        memberWeekLeaderBoardContentViewM73094l0.setShowCardAction(new e30() { // from class: l.uey
            @Override // p149l.e30
            public final void call(Object obj) {
                ney.m159136c(efyVar, (String) obj);
            }
        });
        memberWeekLeaderBoardContentViewM73094l0.setOnRefreshListener(new d30() { // from class: l.vey
            @Override // p149l.d30
            public final void call() {
                yey.m214450d(efyVar);
            }
        });
        memberWeekLeaderBoardContentViewM73094l0.setOnCheckedChangeListener(new d30() { // from class: l.wey
            @Override // p149l.d30
            public final void call() {
                yey.m214449c(efyVar);
            }
        });
        memberWeekLeaderBoardContentViewM73094l0.setOnJumpClickListener(new View.OnClickListener() { // from class: l.xey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192640a.m214456l(efyVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m214449c(efy efyVar) {
        if (efyVar != null) {
            efyVar.m116113h4();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m214450d(efy efyVar) {
        if (efyVar != null) {
            efyVar.m116113h4();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197970a.getContext();
    }

    /* JADX INFO: renamed from: i */
    public MemberWeekLeaderBoardContentView m214453i() {
        return this.f197970a;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f197970a.f49242e.check(g5c0.f100855Y0);
        bnp0 bnp0Var = new bnp0(this.f197972c.act(), new e30() { // from class: l.tey
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169931a.m214455k((String) obj);
            }
        });
        this.f197971b = bnp0Var;
        this.f197970a.f49247j.setAdapter(bnp0Var);
    }

    /* JADX INFO: renamed from: j */
    public String m214454j() {
        return this.f197970a.getWeekBoardItem();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m214455k(String str) {
        ney.m159136c(this.f197972c, str);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m214456l(efy efyVar, View view) {
        if (TextUtils.isEmpty(this.f197973d)) {
            return;
        }
        efyVar.m129317w3(this.f197973d, t100.m186890d(574.0f), 4100, 24);
    }

    /* JADX INFO: renamed from: m */
    public void m214457m() {
        if (NullChecker.m81303a(this.f197971b)) {
            this.f197971b.m102823H();
        }
        if (NullChecker.m81303a(this.f197970a)) {
            HourBoardHeaderView hourBoardHeaderView = (HourBoardHeaderView) this.f197970a.f49247j.findViewWithTag(Integer.valueOf(g5c0.f100651B3));
            if (NullChecker.m81303a(hourBoardHeaderView)) {
                hourBoardHeaderView.m74838G();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m214458n(Pair<far, gm0> pair) {
        this.f197971b.m102829O(((far) pair.first).m120299c(), (gm0) pair.second, m214454j());
        this.f197973d = ((far) pair.first).m120302f().ruleUrl;
        this.f197970a.m73099p0(((far) pair.first).m120298b(), (gm0) pair.second);
    }

    /* JADX INFO: renamed from: p */
    public void m214459p() {
        this.f197970a.f49246i.setRefreshing(false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(efy efyVar) {
    }
}
