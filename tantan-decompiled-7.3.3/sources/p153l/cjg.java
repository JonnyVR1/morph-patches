package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.FansWeekLeaderBoardContentView;

/* JADX INFO: loaded from: classes5.dex */
public class cjg implements iam<fjg> {

    /* JADX INFO: renamed from: e */
    public static int f82153e = 1003;

    /* JADX INFO: renamed from: f */
    public static int f82154f = 1004;

    /* JADX INFO: renamed from: a */
    public final FansWeekLeaderBoardContentView f82155a;

    /* JADX INFO: renamed from: b */
    public bzl0 f82156b;

    /* JADX INFO: renamed from: c */
    public fjg f82157c;

    /* JADX INFO: renamed from: d */
    public osn0 f82158d = new C16282a();

    /* JADX INFO: renamed from: l.cjg$a */
    public class C16282a implements osn0 {
        public C16282a() {
        }

        @Override // p153l.osn0
        /* JADX INFO: renamed from: p */
        public void mo78062p(@NonNull BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem) {
            cjg.this.f82157c.m125801a4(bLiveVoiceHourLeaderBoardItem);
        }
    }

    public cjg(Act act, fjg fjgVar) {
        this.f82157c = fjgVar;
        this.f82155a = FansWeekLeaderBoardContentView.m78024l0(act.inflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m110184l() {
        fjg fjgVar = this.f82157c;
        if (fjgVar != null) {
            fjgVar.m125802b4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m110185m(View view) {
        this.f82157c.m138876w3(efv.f93834M, qa00.m175859d(574.0f), 4100, 24);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82155a.getContext();
    }

    /* JADX INFO: renamed from: i */
    public void m110187i() {
        this.f82155a.f53044i.setRefreshing(false);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        this.f82155a.setShowCardAction(new y20() { // from class: l.yig
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200084a.m110189k((String) obj);
            }
        });
        this.f82155a.setOnRefreshListener(new x20() { // from class: l.zig
            @Override // p153l.x20
            public final void call() {
                this.f204561a.m110184l();
            }
        });
        this.f82155a.setOnJumpClickListener(new View.OnClickListener() { // from class: l.ajg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71822a.m110185m(view);
            }
        });
        this.f82155a.f53041f.setText("本周榜单");
        this.f82155a.f53042g.setText("上周榜单");
        this.f82155a.f53040e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.bjg
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                this.f76988a.m110190n(radioGroup, i);
            }
        });
        this.f82155a.f53040e.check(mdc0.f136100Y0);
        this.f82156b = new bzl0();
        FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView = this.f82155a;
        fansWeekLeaderBoardContentView.f53040e.check(fansWeekLeaderBoardContentView.f53041f.getId());
        this.f82156b.m107177H(this.f82158d);
        this.f82155a.f53045j.setAdapter(this.f82156b);
    }

    /* JADX INFO: renamed from: j */
    public FansWeekLeaderBoardContentView m110188j() {
        return this.f82155a;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m110189k(String str) {
        kny.m150555c(this.f82157c, str);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m110190n(RadioGroup radioGroup, int i) {
        m110191p();
    }

    /* JADX INFO: renamed from: p */
    public void m110191p() {
        FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView = this.f82155a;
        if (fansWeekLeaderBoardContentView != null) {
            if (fansWeekLeaderBoardContentView.f53040e.getCheckedRadioButtonId() == mdc0.f136100Y0) {
                this.f82157c.m125803c4(f82153e);
            } else if (this.f82155a.f53040e.getCheckedRadioButtonId() == mdc0.f136111Z2) {
                this.f82157c.m125803c4(f82154f);
            }
            bnl0.m105524M(this.f82155a.f53046k, false);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m110192q(BLiveVoiceHourLeaderBoard bLiveVoiceHourLeaderBoard) {
        this.f82155a.f53045j.scrollToPosition(0);
        this.f82156b.m107176G(bLiveVoiceHourLeaderBoard.leaderboards);
        BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem = bLiveVoiceHourLeaderBoard.myLeaderboard;
        FansWeekLeaderBoardContentView fansWeekLeaderBoardContentView = this.f82155a;
        if (bLiveVoiceHourLeaderBoardItem == null) {
            bnl0.m105524M(fansWeekLeaderBoardContentView.f53046k, false);
        } else {
            bnl0.m105524M(fansWeekLeaderBoardContentView.f53046k, true);
            this.f82155a.f53047l.m78037i0(bLiveVoiceHourLeaderBoard.myLeaderboard, this.f82158d);
        }
        m110187i();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fjg fjgVar) {
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
