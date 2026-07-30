package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class dil implements s7m<uil> {

    /* JADX INFO: renamed from: a */
    public uil f86396a;

    /* JADX INFO: renamed from: b */
    public DialogC12611a f86397b;

    /* JADX INFO: renamed from: c */
    public rsl f86398c;

    /* JADX INFO: renamed from: d */
    public final dfl f86399d = new C16380a();

    /* JADX INFO: renamed from: l.dil$a */
    public class C16380a implements dfl {
        public C16380a() {
        }

        @Override // p149l.dfl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo74921C() {
            return dil.this.f86396a.m206029H2();
        }

        @Override // p149l.dfl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo74922D() {
            return dil.this.f86396a.mo77274R2();
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: E */
        public void mo74923E(@NotNull String str, boolean z) {
            dil dilVar = dil.this;
            if (z) {
                dilVar.f86396a.m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(4100).m142598B(str).m142603t(80).m142602s(24).m142599p(CommonH5Builder.BgType.TRAN_GRAY_BG).m142597A(xdl0.m208412y0(), dil.this.f86398c.getContentHeight()).m142600q());
            } else {
                dilVar.f86396a.m129316v3(str, dilVar.m111881i(), 4100);
            }
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: F */
        public void mo74924F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            dil.this.f86396a.m193893R3(bLiveHourLeaderBoardItem);
        }

        @Override // p149l.dfl
        /* JADX INFO: renamed from: G */
        public void mo74925G() {
            dil.this.m111879e();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f86396a.act();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f86396a.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(uil uilVar) {
        this.f86396a = uilVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        m111888q();
        m111879e();
        m111880f().onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public void m111879e() {
        DialogC12611a dialogC12611a = this.f86397b;
        if (dialogC12611a != null && dialogC12611a.isShowing()) {
            m111880f().mo74751I(false);
            this.f86397b.dismiss();
        }
        m111880f().mo74749G();
    }

    /* JADX INFO: renamed from: f */
    public final rsl m111880f() {
        rsl rslVar = this.f86398c;
        return rslVar != null ? rslVar : new efl();
    }

    /* JADX INFO: renamed from: i */
    public final int m111881i() {
        return m111880f().getDialogViewHeight();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final rsl m111882j() {
        return !vdt.m198092b(2) ? (rsl) LayoutInflater.from(getContext()).inflate(t6c0.f168300c2, (ViewGroup) null) : (rsl) LayoutInflater.from(getContext()).inflate(t6c0.f168313d2, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: k */
    public void m111883k() {
        Context context;
        if (this.f86397b != null || (context = getContext()) == null) {
            return;
        }
        this.f86398c = m111882j();
        byr byrVar = new byr(this.f86396a, this.f86398c.mo74755g(context));
        this.f86397b = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cil
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f81099a.m111884l(dialogInterface);
            }
        });
        this.f86397b.m71778j0(LiveDialogEnum.HOUR_LEADER_BOARD);
        this.f86398c.mo74752K(this.f86399d);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m111884l(DialogInterface dialogInterface) {
        this.f86398c.mo74754b();
    }

    /* JADX INFO: renamed from: m */
    public void m111885m(List<BLiveHourLeaderBoardItem> list) {
        m111880f().mo74758l(list);
    }

    /* JADX INFO: renamed from: n */
    public void m111886n(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m111880f().mo74753Y(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: p */
    public void m111887p(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m111880f().mo74750H(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: q */
    public void m111888q() {
        if (this.f86397b == null) {
            return;
        }
        m111880f().mo74756i();
    }

    /* JADX INFO: renamed from: s */
    public void m111889s() {
        if (this.f86397b == null) {
            m111883k();
        }
        m111880f().mo74751I(true);
        this.f86397b.show();
    }
}
