package p153l;

import android.view.View;
import android.widget.PopupWindow;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.android.p053ui.poplevel.PopAction;
import com.p051p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class zzm extends fqe0 {

    /* JADX INFO: renamed from: i */
    public final iam<?> f206717i;

    /* JADX INFO: renamed from: j */
    public final PushMessageCustom f206718j;

    /* JADX INFO: renamed from: k */
    public final PushMessage f206719k;

    /* JADX INFO: renamed from: l */
    public final a0n f206720l;

    /* JADX INFO: renamed from: m */
    public final Act f206721m;

    /* JADX INFO: renamed from: n */
    public v0t f206722n;

    /* JADX INFO: renamed from: l.zzm$a */
    public class C21948a implements x20 {
        public C21948a() {
        }

        @Override // p153l.x20
        public void call() {
            C4522a.m22099p().m22118o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.OTHER_ACTION);
            zzm.this.f206720l.mo38889f();
        }
    }

    public zzm(iam iamVar, PushMessage pushMessage) {
        this.f206721m = iamVar.getAct();
        this.f206717i = iamVar;
        this.f206719k = pushMessage;
        this.f206718j = pushMessage.messageCustom;
        final a0n a0nVarM95406a = a0n.m95406a(pushMessage, this);
        this.f206720l = a0nVarM95406a;
        Objects.requireNonNull(a0nVarM95406a);
        m126747z(new pcj() { // from class: l.tzm
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(a0nVarM95406a.mo38893k());
            }
        });
        Objects.requireNonNull(a0nVarM95406a);
        m146060s(new x20() { // from class: l.uzm
            @Override // p153l.x20
            public final void call() {
                a0nVarM95406a.mo38890h();
            }
        });
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        pcj<Boolean> pcjVar = this.f100279d;
        int i = 0;
        boolean z = pcjVar == null || pcjVar.call().booleanValue();
        Act act = this.f206717i.getAct();
        if (!z || act == null || act.isFinishing()) {
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            return 0;
        }
        final LiveInternalPushBaseView liveInternalPushBaseViewMo38886c = this.f206720l.mo38886c(this.f206717i.getAct());
        final v0t v0tVar = new v0t(liveInternalPushBaseViewMo38886c);
        this.f206722n = v0tVar;
        final Runnable runnable = new Runnable() { // from class: l.vzm
            @Override // java.lang.Runnable
            public final void run() {
                this.f186501a.m222274L(v0tVar);
            }
        };
        v0tVar.m198926n(new C21948a());
        v0tVar.m198927o(new x20() { // from class: l.wzm
            @Override // p153l.x20
            public final void call() {
                this.f191808a.m222275M(v0tVar);
            }
        });
        v0tVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.xzm
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f196889a.m222276N(runnable, v0tVar);
            }
        });
        View rootView = act.toolbar();
        if (rootView == null) {
            rootView = act.getWindow().getDecorView().getRootView();
        } else if (rootView.getHeight() != 0) {
            i = -bnl0.m105504C(act);
        }
        final View view = rootView;
        final int i2 = i;
        final int iMo95407b = this.f206720l.mo95407b();
        view.post(new Runnable() { // from class: l.yzm
            @Override // java.lang.Runnable
            public final void run() {
                this.f202202a.m222277O(v0tVar, view, i2, liveInternalPushBaseViewMo38886c, runnable, iMo95407b);
            }
        });
        this.f206718j.toJson();
        return iMo95407b;
    }

    /* JADX INFO: renamed from: J */
    public void m222272J() {
        v0t v0tVar = this.f206722n;
        if (v0tVar != null) {
            v0tVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: K */
    public String m222273K() {
        Act act = this.f206717i.getAct();
        return act instanceof NewMainAct ? ((NewMainAct) act).m40808c6().f152156a : "p_suggest_users_home_view";
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m222274L(v0t v0tVar) {
        C4522a.m22099p().m22118o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.AUTO_CLOSE);
        this.f206720l.mo38888e();
        v0tVar.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m222275M(v0t v0tVar) {
        C4522a.m22099p().m22118o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.USER_CLOSE);
        this.f206720l.mo38891i(v0tVar);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m222276N(Runnable runnable, v0t v0tVar) {
        l51.m152890J(runnable);
        a0n a0nVar = this.f206720l;
        if (a0nVar != null) {
            a0nVar.mo95408g(v0tVar);
        }
        x20 x20Var = this.f121543b;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m222277O(v0t v0tVar, View view, int i, LiveInternalPushBaseView liveInternalPushBaseView, Runnable runnable, int i2) {
        v0tVar.m198928p(view, this.f206718j, qa00.f156322i, i, liveInternalPushBaseView.getShowAnim(), liveInternalPushBaseView.getHideAnim());
        try {
            this.f206720l.mo38892j(v0tVar.getContentView());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        if (NullChecker.m82486a(this.f121542a)) {
            this.f121542a.call();
        }
        if (this.f206720l.mo38887d()) {
            l51.m152888H(this.f206717i.getAct(), runnable, i2);
        }
        this.f206720l.mo38894l();
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        v0t v0tVar = this.f206722n;
        if (v0tVar == null || !v0tVar.isShowing()) {
            return;
        }
        v0t v0tVar2 = this.f206722n;
        if (z) {
            v0tVar2.getContentView().setTranslationY(0.0f);
            this.f206722n.getContentView().setAlpha(1.0f);
        } else {
            v0tVar2.getContentView().setTranslationY(-4000.0f);
            this.f206722n.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f206717i.getAct().hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act getAct() {
        return this.f206717i.getAct();
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        v0t v0tVar = this.f206722n;
        if (v0tVar != null && v0tVar.isShowing()) {
            this.f206722n.dismiss();
            return;
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return MagicBubble.INTERNAL_PUSH_LIVE.getGroup();
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String getBubbleId() {
        return MagicBubble.INTERNAL_PUSH_LIVE.getId() + this.f206718j.liveId;
    }
}
