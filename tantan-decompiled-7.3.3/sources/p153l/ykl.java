package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainlandnew.HourLeaderBoardContentView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class ykl implements iam<ell> {

    /* JADX INFO: renamed from: a */
    public HourLeaderBoardContentView f200399a;

    /* JADX INFO: renamed from: b */
    public ell f200400b;

    /* JADX INFO: renamed from: c */
    public final uhl f200401c = new C21616a();

    public ykl(Act act) {
        this.f200399a = HourLeaderBoardContentView.m76078l0(act.inflater());
    }

    /* JADX INFO: renamed from: d */
    private evl m216474d() {
        HourLeaderBoardContentView hourLeaderBoardContentView = this.f200399a;
        return hourLeaderBoardContentView != null ? hourLeaderBoardContentView : new vhl();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return super.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ell ellVar) {
        this.f200400b = ellVar;
    }

    @Override // p153l.iam
    public void destroy() {
        m216474d().onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public View m216477e() {
        return this.f200399a;
    }

    /* JADX INFO: renamed from: f */
    public void m216478f() {
        m216474d().mo75932G();
    }

    /* JADX INFO: renamed from: i */
    public void m216479i(List<BLiveHourLeaderBoardItem> list) {
        m216474d().mo75941l(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m216480j(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m216474d().mo75936Y(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: k */
    public void m216481k(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m216474d().mo75933H(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: l */
    public void m216482l() {
        m216474d().mo75935K(this.f200401c);
        m216474d().mo75934I(true);
    }

    /* JADX INFO: renamed from: c */
    public void m216476c() {
    }

    /* JADX INFO: renamed from: l.ykl$a */
    public class C21616a implements uhl {
        public C21616a() {
        }

        @Override // p153l.uhl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo76104C() {
            return ykl.this.f200400b.m213812H2();
        }

        @Override // p153l.uhl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo76105D() {
            return ykl.this.f200400b.mo78457R2();
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: F */
        public void mo76107F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            ykl.this.f200400b.m121235b4(bLiveHourLeaderBoardItem);
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: G */
        public void mo76108G() {
            ykl.this.m216476c();
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: E */
        public void mo76106E(@NotNull String str, boolean z) {
        }
    }
}
