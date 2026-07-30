package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.FansWeekLeaderBoardContentView;

/* JADX INFO: loaded from: classes5.dex */
public class ohg implements s7m<rhg> {

    /* JADX INFO: renamed from: e */
    public static int f143974e = 1003;

    /* JADX INFO: renamed from: f */
    public static int f143975f = 1004;

    /* JADX INFO: renamed from: a */
    public final FansWeekLeaderBoardContentView f143976a;

    /* JADX INFO: renamed from: b */
    public xpl0 f143977b;

    /* JADX INFO: renamed from: c */
    public rhg f143978c;

    /* JADX INFO: renamed from: d */
    public kjn0 f143979d = new C18937a();

    /* JADX INFO: renamed from: l.ohg$a */
    public class C18937a implements kjn0 {
        public C18937a() {
        }

        @Override // p149l.kjn0
        /* JADX INFO: renamed from: q */
        public void mo76879q(@NonNull BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem) {
            ohg.this.f143978c.m179350a4(bLiveVoiceHourLeaderBoardItem);
        }
    }

    public ohg(Act act, rhg rhgVar) {
        this.f143978c = rhgVar;
        this.f143976a = FansWeekLeaderBoardContentView.m76841l0(act.inflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m164355l() {
        rhg rhgVar = this.f143978c;
        if (rhgVar != null) {
            rhgVar.m179351b4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m164356m(View view) {
        this.f143978c.m129317w3(ddv.f85641M, t100.m186890d(574.0f), 4100, 24);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143976a.getContext();
    }

    /* JADX INFO: renamed from: i */
    public void m164358i() {
        this.f143976a.f52196i.setRefreshing(false);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f143976a.setShowCardAction(new e30() { // from class: l.khg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123146a.m164360k((String) obj);
            }
        });
        this.f143976a.setOnRefreshListener(new d30() { // from class: l.lhg
            @Override // p149l.d30
            public final void call() {
                this.f128098a.m164355l();
            }
        });
        this.f143976a.setOnJumpClickListener(new View.OnClickListener() { // from class: l.mhg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133816a.m164356m(view);
            }
        });
        this.f143976a.f52193f.setText("本周榜单");
        this.f143976a.f52194g.setText("上周榜单");
        this.f143976a.f52192e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.nhg
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f138977a.m164361n(radioGroup, i);
            }
        });
        this.f143976a.f52192e.check(g5c0.f100855Y0);
        this.f143977b = new xpl0();
        FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView = this.f143976a;
        fansWeekLeaderBoardContentView.f52192e.check(fansWeekLeaderBoardContentView.f52193f.getId());
        this.f143977b.m210506H(this.f143979d);
        this.f143976a.f52197j.setAdapter(this.f143977b);
    }

    /* JADX INFO: renamed from: j */
    public FansWeekLeaderBoardContentView m164359j() {
        return this.f143976a;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m164360k(String str) {
        ney.m159136c(this.f143978c, str);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m164361n(RadioGroup radioGroup, int i) {
        m164362p();
    }

    /* JADX INFO: renamed from: p */
    public void m164362p() {
        FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView = this.f143976a;
        if (fansWeekLeaderBoardContentView != null) {
            if (fansWeekLeaderBoardContentView.f52192e.getCheckedRadioButtonId() == g5c0.f100855Y0) {
                this.f143978c.m179352c4(f143974e);
            } else if (this.f143976a.f52192e.getCheckedRadioButtonId() == g5c0.f100866Z2) {
                this.f143978c.m179352c4(f143975f);
            }
            xdl0.m208344M(this.f143976a.f52198k, false);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m164363q(BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard) {
        this.f143976a.f52197j.scrollToPosition(0);
        this.f143977b.m210505G(bLiveVoiceHourLeaderBoard.leaderboards);
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = bLiveVoiceHourLeaderBoard.myLeaderboard;
        FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView = this.f143976a;
        if (bLiveVoiceHourLeaderBoardItem == null) {
            xdl0.m208344M(fansWeekLeaderBoardContentView.f52198k, false);
        } else {
            xdl0.m208344M(fansWeekLeaderBoardContentView.f52198k, true);
            this.f143976a.f52199l.m76854i0(bLiveVoiceHourLeaderBoard.myLeaderboard, this.f143979d);
        }
        m164358i();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rhg rhgVar) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
