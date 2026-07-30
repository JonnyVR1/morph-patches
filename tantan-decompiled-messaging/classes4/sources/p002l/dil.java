package p002l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import java.util.List;
import l.s7m;
import l.vdt;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dil implements s7m<uil> {

    /* JADX INFO: renamed from: a */
    public uil f9291a;

    /* JADX INFO: renamed from: b */
    public C0200a f9292b;

    /* JADX INFO: renamed from: c */
    public rsl f9293c;

    /* JADX INFO: renamed from: d */
    public final dfl f9294d = new C0531a();

    /* JADX INFO: renamed from: l.dil$a */
    public class C0531a implements dfl {
        public C0531a() {
        }

        @Override // p002l.dfl
        @NotNull
        /* JADX INFO: renamed from: C */
        public Frag mo8523C() {
            return dil.this.f9291a.m25549H2();
        }

        @Override // p002l.dfl
        @NotNull
        /* JADX INFO: renamed from: D */
        public String mo8524D() {
            return dil.this.f9291a.mo21430R2();
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: E */
        public void mo8525E(@NotNull String str, boolean z) {
            dil dilVar = dil.this;
            if (z) {
                dilVar.f9291a.m25548F2().OpenH5Event.open().j(jp50.m16064c(4100).m16094B(str).m16099t(80).m16098s(24).m16095p(CommonH5Builder.BgType.TRAN_GRAY_BG).m16093A(xdl0.y0(), dil.this.f9293c.getContentHeight()).m16096q());
            } else {
                dilVar.f9291a.m14203v3(str, dilVar.m11896i(), 4100);
            }
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: F */
        public void mo8526F(@NotNull BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
            dil.this.f9291a.m23492R3(bLiveHourLeaderBoardItem);
        }

        @Override // p002l.dfl
        /* JADX INFO: renamed from: G */
        public void mo8527G() {
            dil.this.m11894e();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public Context m11892C0() {
        return this.f9291a.act();
    }

    @Nullable
    public Act act() {
        return this.f9291a.act();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m11897i1(uil uilVar) {
        this.f9291a = uilVar;
    }

    public void destroy() {
        m11904q();
        m11894e();
        m11895f().onDestroy();
    }

    /* JADX INFO: renamed from: e */
    public void m11894e() {
        a aVar = this.f9292b;
        if (aVar != null && aVar.isShowing()) {
            m11895f().mo8349I(false);
            this.f9292b.dismiss();
        }
        m11895f().mo8347G();
    }

    /* JADX INFO: renamed from: f */
    public final rsl m11895f() {
        rsl rslVar = this.f9293c;
        return rslVar != null ? rslVar : new efl();
    }

    /* JADX INFO: renamed from: i */
    public final int m11896i() {
        return m11895f().getDialogViewHeight();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final rsl m11898j() {
        return !vdt.b(2) ? (rsl) LayoutInflater.from(m11892C0()).inflate(t6c0.f19796c2, (ViewGroup) null) : (rsl) LayoutInflater.from(m11892C0()).inflate(t6c0.f19809d2, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: k */
    public void m11899k() {
        Context contextM11892C0;
        if (this.f9292b != null || (contextM11892C0 = m11892C0()) == null) {
            return;
        }
        this.f9293c = m11898j();
        byr byrVar = new byr(this.f9291a, this.f9293c.mo8353g(contextM11892C0));
        this.f9292b = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cil
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8686a.m11900l(dialogInterface);
            }
        });
        this.f9292b.m5146j0(LiveDialogEnum.HOUR_LEADER_BOARD);
        this.f9293c.mo8350K(this.f9294d);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11900l(DialogInterface dialogInterface) {
        this.f9293c.mo8352b();
    }

    /* JADX INFO: renamed from: m */
    public void m11901m(List<BLiveHourLeaderBoardItem> list) {
        m11895f().mo8356l(list);
    }

    /* JADX INFO: renamed from: n */
    public void m11902n(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m11895f().mo8351Y(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: p */
    public void m11903p(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m11895f().mo8348H(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: q */
    public void m11904q() {
        if (this.f9292b == null) {
            return;
        }
        m11895f().mo8354i();
    }

    /* JADX INFO: renamed from: s */
    public void m11905s() {
        if (this.f9292b == null) {
            m11899k();
        }
        m11895f().mo8349I(true);
        this.f9292b.show();
    }
}
