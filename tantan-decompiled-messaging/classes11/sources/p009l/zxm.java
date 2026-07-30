package p009l;

import android.view.View;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.newui.home.bubble.MagicBubble;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.PopAction;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.aie0;
import l.d30;
import l.e51;
import l.f0m;
import l.fdb0;
import l.s7m;
import l.t100;
import l.v9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zxm extends aie0 {

    /* JADX INFO: renamed from: i */
    public final s7m<?> f24023i;

    /* JADX INFO: renamed from: j */
    public final PushMessageCustom f24024j;

    /* JADX INFO: renamed from: k */
    public final PushMessage f24025k;

    /* JADX INFO: renamed from: l */
    public final aym f24026l;

    /* JADX INFO: renamed from: m */
    public final Act f24027m;

    /* JADX INFO: renamed from: n */
    public uys f24028n;

    /* JADX INFO: renamed from: l.zxm$a */
    public class C1378a implements d30 {
        public C1378a() {
        }

        public void call() {
            a.p().o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.OTHER_ACTION);
            zxm.this.f24026l.mo1857f();
        }
    }

    public zxm(s7m s7mVar, PushMessage pushMessage) {
        this.f24027m = s7mVar.act();
        this.f24023i = s7mVar;
        this.f24025k = pushMessage;
        this.f24024j = pushMessage.messageCustom;
        final aym aymVarM11770a = aym.m11770a(pushMessage, this);
        this.f24026l = aymVarM11770a;
        Objects.requireNonNull(aymVarM11770a);
        z(new v9j() { // from class: l.txm
            public final Object call() {
                return Boolean.valueOf(aymVarM11770a.mo1861k());
            }
        });
        Objects.requireNonNull(aymVarM11770a);
        s(new d30() { // from class: l.uxm
            public final void call() {
                aymVarM11770a.mo1858h();
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public int m26110A() {
        v9j v9jVar = ((aie0) this).d;
        int i = 0;
        boolean z = v9jVar == null || ((Boolean) v9jVar.call()).booleanValue();
        Act act = this.f24023i.act();
        if (!z || act == null || act.isFinishing()) {
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
            return 0;
        }
        final LiveInternalPushBaseView liveInternalPushBaseViewMo1854c = this.f24026l.mo1854c(this.f24023i.act());
        final uys uysVar = new uys(liveInternalPushBaseViewMo1854c);
        this.f24028n = uysVar;
        final Runnable runnable = new Runnable() { // from class: l.vxm
            @Override // java.lang.Runnable
            public final void run() {
                this.f21815a.m26113L(uysVar);
            }
        };
        uysVar.m23203n(new C1378a());
        uysVar.m23204o(new d30() { // from class: l.wxm
            public final void call() {
                this.f22358a.m26114M(uysVar);
            }
        });
        uysVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.xxm
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f22783a.m26115N(runnable, uysVar);
            }
        });
        View rootView = act.toolbar();
        if (rootView == null) {
            rootView = act.getWindow().getDecorView().getRootView();
        } else if (rootView.getHeight() != 0) {
            i = -xdl0.C(act);
        }
        final View view = rootView;
        final int i2 = i;
        final int iMo11771b = this.f24026l.mo11771b();
        view.post(new Runnable() { // from class: l.yxm
            @Override // java.lang.Runnable
            public final void run() {
                this.f23268a.m26116O(uysVar, view, i2, liveInternalPushBaseViewMo1854c, runnable, iMo11771b);
            }
        });
        this.f24024j.toJson();
        return iMo11771b;
    }

    /* JADX INFO: renamed from: J */
    public void m26111J() {
        uys uysVar = this.f24028n;
        if (uysVar != null) {
            uysVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: K */
    public String m26112K() {
        NewMainAct newMainActAct = this.f24023i.act();
        return newMainActAct instanceof NewMainAct ? (String) newMainActAct.m3875Y5().a : "p_suggest_users_home_view";
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m26113L(uys uysVar) {
        a.p().o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.AUTO_CLOSE);
        this.f24026l.mo1856e();
        uysVar.dismiss();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m26114M(uys uysVar) {
        a.p().o(CorePopLevel.LIVE_PUSH.getOnlyName(), PopAction.USER_CLOSE);
        this.f24026l.mo1859i(uysVar);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m26115N(Runnable runnable, uys uysVar) {
        e51.J(runnable);
        aym aymVar = this.f24026l;
        if (aymVar != null) {
            aymVar.mo11772g(uysVar);
        }
        d30 d30Var = ((fdb0) this).b;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m26116O(uys uysVar, View view, int i, LiveInternalPushBaseView liveInternalPushBaseView, Runnable runnable, int i2) {
        uysVar.m23205p(view, this.f24024j, t100.i, i, liveInternalPushBaseView.getShowAnim(), liveInternalPushBaseView.getHideAnim());
        try {
            this.f24026l.mo1860j(uysVar.getContentView());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        if (NullChecker.a(((fdb0) this).a)) {
            ((fdb0) this).a.call();
        }
        if (this.f24026l.mo1855d()) {
            e51.H(this.f24023i.act(), runnable, i2);
        }
        this.f24026l.mo1862l();
    }

    /* JADX INFO: renamed from: f */
    public void m26117f(boolean z) {
        uys uysVar = this.f24028n;
        if (uysVar == null || !uysVar.isShowing()) {
            return;
        }
        uys uysVar2 = this.f24028n;
        if (z) {
            uysVar2.getContentView().setTranslationY(0.0f);
            this.f24028n.getContentView().setAlpha(1.0f);
        } else {
            uysVar2.getContentView().setTranslationY(-4000.0f);
            this.f24028n.getContentView().setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m26118j() {
        return this.f24023i.act().hashCode();
    }

    /* JADX INFO: renamed from: m */
    public Act m26119m() {
        return this.f24023i.act();
    }

    /* JADX INFO: renamed from: n */
    public void m26120n(boolean z) {
        uys uysVar = this.f24028n;
        if (uysVar != null && uysVar.isShowing()) {
            this.f24028n.dismiss();
            return;
        }
        f0m f0mVar = ((aie0) this).f;
        if (f0mVar != null) {
            f0mVar.a(this);
        }
    }

    /* JADX INFO: renamed from: o */
    public String m26121o() {
        return MagicBubble.INTERNAL_PUSH_LIVE.getGroup();
    }

    /* JADX INFO: renamed from: p */
    public String m26122p() {
        return MagicBubble.INTERNAL_PUSH_LIVE.getId() + this.f24024j.liveId;
    }
}
