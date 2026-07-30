package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.HourLeaderBoardContentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import java.util.List;
import l.s7m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hil implements s7m<nil> {

    /* JADX INFO: renamed from: a */
    public HourLeaderBoardContentView f12053a;

    /* JADX INFO: renamed from: b */
    public nil f12054b;

    /* JADX INFO: renamed from: c */
    public final dfl f12055c = new C0607a();

    public hil(Act act) {
        this.f12053a = HourLeaderBoardContentView.m8497l0(act.inflater());
    }

    /* JADX INFO: renamed from: d */
    private rsl m14390d() {
        HourLeaderBoardContentView hourLeaderBoardContentView = this.f12053a;
        return hourLeaderBoardContentView != null ? hourLeaderBoardContentView : new efl();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14391C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m14397i1(nil nilVar) {
        this.f12054b = nilVar;
    }

    public void destroy() {
        m14390d().onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public View m14394e() {
        return this.f12053a;
    }

    /* JADX INFO: renamed from: f */
    public void m14395f() {
        m14390d().mo8347G();
    }

    /* JADX INFO: renamed from: i */
    public void m14396i(List<BLiveHourLeaderBoardItem> list) {
        m14390d().mo8356l(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m14398j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m14390d().mo8351Y(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m14399k(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m14390d().mo8348H(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: l */
    public void m14400l() {
        m14390d().mo8350K(this.f12055c);
        m14390d().mo8349I(true);
    }

    /* JADX INFO: renamed from: c */
    public void m14393c() {
    }

    /* JADX INFO: renamed from: l.hil$a */
    public class C0607a implements dfl {
        public C0607a() {
        }

        @Override // p002l.dfl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo8523C() {
            return hil.this.f12054b.m25549H2();
        }

        @Override // p002l.dfl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo8524D() {
            return hil.this.f12054b.mo21430R2();
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: F */
        public void mo8526F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            hil.this.f12054b.m18791b4(bLiveHourLeaderBoardItem);
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: G */
        public void mo8527G() {
            hil.this.m14393c();
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: E */
        public void mo8525E(@NotNull String str, boolean z) {
        }
    }
}
