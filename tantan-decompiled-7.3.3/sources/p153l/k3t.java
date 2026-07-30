package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Ll/k3t;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ljava/lang/Runnable;", "dismissAction", "", "g", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/Runnable;)V", "j", "e", "f", "(Lcom/p1/mobile/android/app/Act;)V", RXScreenCaptureService.KEY_INDEX, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class k3t {

    @NotNull
    public static final k3t INSTANCE = new k3t();

    /* JADX INFO: renamed from: a */
    public static void m148159a(Act act, Runnable runnable) {
        INSTANCE.m148166f(act);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m148160b(Act act, Runnable runnable, boolean z) {
        if (z) {
            INSTANCE.m148168j(act, runnable);
        } else {
            INSTANCE.m148165e(act, runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m148161c(Runnable runnable, Act act, View view) {
        if (runnable != null) {
            runnable.run();
        }
        act.m68056e2();
    }

    /* JADX INFO: renamed from: d */
    public static void m148162d(Runnable runnable, Act act, View view) {
        if (runnable != null) {
            runnable.run();
        }
        INSTANCE.m148167i(act);
        act.m68056e2();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m148163g(@NotNull final Act act, @Nullable final Runnable dismissAction) {
        act.getClass();
        if (zrv.f205799a.m207632E()) {
            INSTANCE.m148168j(act, dismissAction);
        } else if (zrv.f205799a.m207653X()) {
            zrv.f205799a.m207671h0(new y20() { // from class: l.g3t
                @Override // p153l.y20
                public final void call(Object obj) {
                    k3t.m148160b(act, dismissAction, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            INSTANCE.m148165e(act, dismissAction);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m148164h(Act act, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        m148163g(act, runnable);
    }

    /* JADX INFO: renamed from: e */
    public final void m148165e(final Act act, final Runnable dismissAction) {
        new th0.C20312a(act).m191150i(R$string.f47822T7).m191146e(R$string.f48321q8).m191144c(new View.OnClickListener() { // from class: l.h3t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3t.m148161c(dismissAction, act, view);
            }
        }).m191148g(false).m191149h(false).m191158q(R$string.f47801S7).m191156o(new View.OnClickListener() { // from class: l.i3t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3t.m148162d(dismissAction, act, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: f */
    public final void m148166f(Act act) {
        pn0.m172991o(act, AnchorStartData.getBuilder().m68745m(false).m68744l(true).m68746n(AnchorStartData.ANCHOR_SOURCE_MULTI_CALL_MATCH).m68743k());
    }

    /* JADX INFO: renamed from: i */
    public final void m148167i(Act act) {
        act.startActivity(LiveWebViewAct.m70067e2(act, efv.f93844a + "?createAnchorInterfaceType=" + zrv.m221193k().m203420G5() + "&extra=multiMatch", LiveWebViewAct.f45695l));
    }

    /* JADX INFO: renamed from: j */
    public final void m148168j(final Act act, final Runnable dismissAction) {
        wgt.m206250q(act, iit.INSTANCE.m140129O(), R$string.f48113gj, new x20() { // from class: l.j3t
            @Override // p153l.x20
            public final void call() {
                k3t.m148159a(act, dismissAction);
            }
        });
    }
}
