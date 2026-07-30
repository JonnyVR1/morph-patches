package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/j1t;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ljava/lang/Runnable;", "dismissAction", "", "g", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/Runnable;)V", "j", "e", "f", "(Lcom/p1/mobile/android/app/Act;)V", RXScreenCaptureService.KEY_INDEX, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class j1t {

    @NotNull
    public static final j1t INSTANCE = new j1t();

    /* JADX INFO: renamed from: a */
    public static void m139379a(Act act, Runnable runnable) {
        INSTANCE.m139386f(act);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m139380b(Act act, Runnable runnable, boolean z) {
        if (z) {
            INSTANCE.m139388j(act, runnable);
        } else {
            INSTANCE.m139385e(act, runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m139381c(Runnable runnable, Act act, View view) {
        if (runnable != null) {
            runnable.run();
        }
        act.m66873d2();
    }

    /* JADX INFO: renamed from: d */
    public static void m139382d(Runnable runnable, Act act, View view) {
        if (runnable != null) {
            runnable.run();
        }
        INSTANCE.m139387i(act);
        act.m66873d2();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m139383g(@NotNull final Act act, @Nullable final Runnable dismissAction) {
        act.getClass();
        if (ypv.f199493a.m199310E()) {
            INSTANCE.m139388j(act, dismissAction);
        } else if (ypv.f199493a.m199331X()) {
            ypv.f199493a.m199349h0(new e30() { // from class: l.f1t
                @Override // p149l.e30
                public final void call(Object obj) {
                    j1t.m139380b(act, dismissAction, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            INSTANCE.m139385e(act, dismissAction);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m139384h(Act act, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        m139383g(act, runnable);
    }

    /* JADX INFO: renamed from: e */
    public final void m139385e(final Act act, final Runnable dismissAction) {
        new xh0.C21150a(act).m208730i(R$string.f46974T7).m208726e(R$string.f47473q8).m208724c(new View.OnClickListener() { // from class: l.g1t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j1t.m139381c(dismissAction, act, view);
            }
        }).m208728g(false).m208729h(false).m208738q(R$string.f46953S7).m208736o(new View.OnClickListener() { // from class: l.h1t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j1t.m139382d(dismissAction, act, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: f */
    public final void m139386f(Act act) {
        tn0.m189747o(act, AnchorStartData.getBuilder().m67562m(false).m67561l(true).m67563n(AnchorStartData.ANCHOR_SOURCE_MULTI_CALL_MATCH).m67560k());
    }

    /* JADX INFO: renamed from: i */
    public final void m139387i(Act act) {
        act.startActivity(LiveWebViewAct.m68884d2(act, ddv.f85651a + "?createAnchorInterfaceType=" + ypv.m215672k().m195633G5() + "&extra=multiMatch", LiveWebViewAct.f44847l));
    }

    /* JADX INFO: renamed from: j */
    public final void m139388j(final Act act, final Runnable dismissAction) {
        vet.m198233q(act, hgt.INSTANCE.m130908O(), R$string.f47265gj, new d30() { // from class: l.i1t
            @Override // p149l.d30
            public final void call() {
                j1t.m139379a(act, dismissAction);
            }
        });
    }
}
