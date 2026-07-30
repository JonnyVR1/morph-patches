package p149l;

import android.view.View;
import android.widget.PopupWindow;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.android.p048ui.poplevel.PopAction;
import com.p046p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class zxm extends aie0 {

    /* JADX INFO: renamed from: i */
    public final s7m<?> f205465i;

    /* JADX INFO: renamed from: j */
    public final PushMessageCustom f205466j;

    /* JADX INFO: renamed from: k */
    public final PushMessage f205467k;

    /* JADX INFO: renamed from: l */
    public final aym f205468l;

    /* JADX INFO: renamed from: m */
    public final Act f205469m;

    /* JADX INFO: renamed from: n */
    public uys f205470n;

    /* JADX INFO: renamed from: l.zxm$a */
    public class C21810a implements d30 {
        public C21810a() {
        }

        @Override // p149l.d30
        public void call() {
            C4371a.m21100p().m21119o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.OTHER_ACTION);
            zxm.this.f205468l.mo37886f();
        }
    }

    public zxm(s7m s7mVar, PushMessage pushMessage) {
        this.f205469m = s7mVar.getAct();
        this.f205465i = s7mVar;
        this.f205467k = pushMessage;
        this.f205466j = pushMessage.messageCustom;
        final aym aymVarM99570a = aym.m99570a(pushMessage, this);
        this.f205468l = aymVarM99570a;
        Objects.requireNonNull(aymVarM99570a);
        m96810z(new v9j() { // from class: l.txm
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(aymVarM99570a.mo37890k());
            }
        });
        Objects.requireNonNull(aymVarM99570a);
        m120965s(new d30() { // from class: l.uxm
            @Override // p149l.d30
            public final void call() {
                aymVarM99570a.mo37887h();
            }
        });
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        v9j<Boolean> v9jVar = this.f69975d;
        int i = 0;
        boolean z = v9jVar == null || v9jVar.call().booleanValue();
        Act act = this.f205465i.getAct();
        if (!z || act == null || act.isFinishing()) {
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            return 0;
        }
        final LiveInternalPushBaseView liveInternalPushBaseViewMo37883c = this.f205468l.mo37883c(this.f205465i.getAct());
        final uys uysVar = new uys(liveInternalPushBaseViewMo37883c);
        this.f205470n = uysVar;
        final Runnable runnable = new Runnable() { // from class: l.vxm
            @Override // java.lang.Runnable
            public final void run() {
                this.f183461a.m220846L(uysVar);
            }
        };
        uysVar.m196361n(new C21810a());
        uysVar.m196362o(new d30() { // from class: l.wxm
            @Override // p149l.d30
            public final void call() {
                this.f188495a.m220847M(uysVar);
            }
        });
        uysVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.xxm
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f194880a.m220848N(runnable, uysVar);
            }
        });
        View rootView = act.toolbar();
        if (rootView == null) {
            rootView = act.getWindow().getDecorView().getRootView();
        } else if (rootView.getHeight() != 0) {
            i = -xdl0.m208324C(act);
        }
        final View view = rootView;
        final int i2 = i;
        final int iMo99571b = this.f205468l.mo99571b();
        view.post(new Runnable() { // from class: l.yxm
            @Override // java.lang.Runnable
            public final void run() {
                this.f200637a.m220849O(uysVar, view, i2, liveInternalPushBaseViewMo37883c, runnable, iMo99571b);
            }
        });
        this.f205466j.toJson();
        return iMo99571b;
    }

    /* JADX INFO: renamed from: J */
    public void m220844J() {
        uys uysVar = this.f205470n;
        if (uysVar != null) {
            uysVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: K */
    public String m220845K() {
        Act act = this.f205465i.getAct();
        return act instanceof NewMainAct ? ((NewMainAct) act).m39799Y5().f116564a : "p_suggest_users_home_view";
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m220846L(uys uysVar) {
        C4371a.m21100p().m21119o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.AUTO_CLOSE);
        this.f205468l.mo37885e();
        uysVar.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m220847M(uys uysVar) {
        C4371a.m21100p().m21119o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.USER_CLOSE);
        this.f205468l.mo37888i(uysVar);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m220848N(Runnable runnable, uys uysVar) {
        e51.m114745J(runnable);
        aym aymVar = this.f205468l;
        if (aymVar != null) {
            aymVar.mo99572g(uysVar);
        }
        d30 d30Var = this.f97025b;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m220849O(uys uysVar, View view, int i, LiveInternalPushBaseView liveInternalPushBaseView, Runnable runnable, int i2) {
        uysVar.m196363p(view, this.f205466j, t100.f167260i, i, liveInternalPushBaseView.getShowAnim(), liveInternalPushBaseView.getHideAnim());
        try {
            this.f205468l.mo37889j(uysVar.getContentView());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        if (NullChecker.m81303a(this.f97024a)) {
            this.f97024a.call();
        }
        if (this.f205468l.mo37884d()) {
            e51.m114743H(this.f205465i.getAct(), runnable, i2);
        }
        this.f205468l.mo37891l();
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        uys uysVar = this.f205470n;
        if (uysVar == null || !uysVar.isShowing()) {
            return;
        }
        uys uysVar2 = this.f205470n;
        if (z) {
            uysVar2.getContentView().setTranslationY(0.0f);
            this.f205470n.getContentView().setAlpha(1.0f);
        } else {
            uysVar2.getContentView().setTranslationY(-4000.0f);
            this.f205470n.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f205465i.getAct().hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f205465i.getAct();
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        uys uysVar = this.f205470n;
        if (uysVar != null && uysVar.isShowing()) {
            this.f205470n.dismiss();
            return;
        }
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return MagicBubble.INTERNAL_PUSH_LIVE.getGroup();
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.INTERNAL_PUSH_LIVE.getId() + this.f205466j.liveId;
    }
}
