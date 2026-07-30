package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class ukl implements iam<lll> {

    /* JADX INFO: renamed from: a */
    public lll f179420a;

    /* JADX INFO: renamed from: b */
    public DialogC12774a f179421b;

    /* JADX INFO: renamed from: c */
    public evl f179422c;

    /* JADX INFO: renamed from: d */
    public final uhl f179423d = new C20593a();

    /* JADX INFO: renamed from: l.ukl$a */
    public class C20593a implements uhl {
        public C20593a() {
        }

        @Override // p153l.uhl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo76104C() {
            return ukl.this.f179420a.m213812H2();
        }

        @Override // p153l.uhl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo76105D() {
            return ukl.this.f179420a.mo78457R2();
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: E */
        public void mo76106E(@NotNull String str, boolean z) {
            ukl uklVar = ukl.this;
            if (z) {
                uklVar.f179420a.m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(4100).m174141B(str).m174146t(80).m174145s(24).m174142p(CommonH5Builder.BgType.TRAN_GRAY_BG).m174140A(bnl0.m105592y0(), ukl.this.f179422c.getContentHeight()).m174143q());
            } else {
                uklVar.f179420a.m138875v3(str, uklVar.m196495i(), 4100);
            }
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: F */
        public void mo76107F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            ukl.this.f179420a.m154744R3(bLiveHourLeaderBoardItem);
        }

        @Override // p153l.uhl
        /* JADX INFO: renamed from: G */
        public void mo76108G() {
            ukl.this.m196493e();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f179420a.act();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f179420a.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lll lllVar) {
        this.f179420a = lllVar;
    }

    @Override // p153l.iam
    public void destroy() {
        m196502q();
        m196493e();
        m196494f().onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public void m196493e() {
        DialogC12774a dialogC12774a = this.f179421b;
        if (dialogC12774a != null && dialogC12774a.isShowing()) {
            m196494f().mo75934I(false);
            this.f179421b.dismiss();
        }
        m196494f().mo75932G();
    }

    /* JADX INFO: renamed from: f */
    public final evl m196494f() {
        evl evlVar = this.f179422c;
        return evlVar != null ? evlVar : new vhl();
    }

    /* JADX INFO: renamed from: i */
    public final int m196495i() {
        return m196494f().getDialogViewHeight();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final evl m196496j() {
        return !wft.m206159b(2) ? (evl) LayoutInflater.from(getContext()).inflate(yec0.f199032c2, (ViewGroup) null) : (evl) LayoutInflater.from(getContext()).inflate(yec0.f199045d2, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: k */
    public void m196497k() {
        Context context;
        if (this.f179421b != null || (context = getContext()) == null) {
            return;
        }
        this.f179422c = m196496j();
        c0s c0sVar = new c0s(this.f179420a, this.f179422c.mo75938g(context));
        this.f179421b = c0sVar;
        c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.tkl
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f174723a.m196498l(dialogInterface);
            }
        });
        this.f179421b.m72961j0(LiveDialogEnum.HOUR_LEADER_BOARD);
        this.f179422c.mo75935K(this.f179423d);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m196498l(DialogInterface dialogInterface) {
        this.f179422c.mo75937b();
    }

    /* JADX INFO: renamed from: m */
    public void m196499m(List<BLiveHourLeaderBoardItem> list) {
        m196494f().mo75941l(list);
    }

    /* JADX INFO: renamed from: n */
    public void m196500n(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m196494f().mo75936Y(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: p */
    public void m196501p(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m196494f().mo75933H(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: q */
    public void m196502q() {
        if (this.f179421b == null) {
            return;
        }
        m196494f().mo75939i();
    }

    /* JADX INFO: renamed from: s */
    public void m196503s() {
        if (this.f179421b == null) {
            m196497k();
        }
        m196494f().mo75934I(true);
        this.f179421b.show();
    }
}
