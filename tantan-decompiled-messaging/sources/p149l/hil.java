package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.HourLeaderBoardContentView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class hil implements s7m<nil> {

    /* JADX INFO: renamed from: a */
    public HourLeaderBoardContentView f107934a;

    /* JADX INFO: renamed from: b */
    public nil f107935b;

    /* JADX INFO: renamed from: c */
    public final dfl f107936c = new C17324a();

    public hil(Act act) {
        this.f107934a = HourLeaderBoardContentView.m74895l0(act.inflater());
    }

    /* JADX INFO: renamed from: d */
    private rsl m131273d() {
        HourLeaderBoardContentView hourLeaderBoardContentView = this.f107934a;
        return hourLeaderBoardContentView != null ? hourLeaderBoardContentView : new efl();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return super.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nil nilVar) {
        this.f107935b = nilVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        m131273d().onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public View m131276e() {
        return this.f107934a;
    }

    /* JADX INFO: renamed from: f */
    public void m131277f() {
        m131273d().mo74749G();
    }

    /* JADX INFO: renamed from: i */
    public void m131278i(List<BLiveHourLeaderBoardItem> list) {
        m131273d().mo74758l(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m131279j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m131273d().mo74753Y(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m131280k(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m131273d().mo74750H(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: l */
    public void m131281l() {
        m131273d().mo74752K(this.f107936c);
        m131273d().mo74751I(true);
    }

    /* JADX INFO: renamed from: c */
    public void m131275c() {
    }

    /* JADX INFO: renamed from: l.hil$a */
    public class C17324a implements dfl {
        public C17324a() {
        }

        @Override // p149l.dfl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo74921C() {
            return hil.this.f107935b.m206029H2();
        }

        @Override // p149l.dfl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo74922D() {
            return hil.this.f107935b.mo77274R2();
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: F */
        public void mo74924F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            hil.this.f107935b.m159521b4(bLiveHourLeaderBoardItem);
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: G */
        public void mo74925G() {
            hil.this.m131275c();
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: E */
        public void mo74923E(@NotNull String str, boolean z) {
        }
    }
}
