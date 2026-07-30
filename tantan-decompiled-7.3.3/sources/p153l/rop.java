package p153l;

import com.core.glcore.util.ErrorCode;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ1\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J1\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J1\u0010\u0013\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0010R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/rop;", "", "<init>", "()V", "", "eid", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "j", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "from", "Lkotlin/Function0;", "onDismiss", "o", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "q", "k", BLiveStormDanmakuGiftResourceType.f45294s, "", "", "a", "[Ljava/lang/Integer;", "h", "()[Ljava/lang/Integer;", "TITLE_COVER", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rop {

    @NotNull
    public static final rop INSTANCE = new rop();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Integer[] TITLE_COVER = {Integer.valueOf(dbc0.f86661Vc), Integer.valueOf(dbc0.f86693Wc), Integer.valueOf(dbc0.f86725Xc), Integer.valueOf(dbc0.f86757Yc), Integer.valueOf(dbc0.f86789Zc)};

    /* JADX INFO: renamed from: l */
    public static final void m182425l(Act act, PurchaseType purchaseType) {
        l51.m152888H(act, new Runnable() { // from class: l.qop
            @Override // java.lang.Runnable
            public final void run() {
                rop.m182426m();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public static final void m182426m() {
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: n */
    public static final void m182427n(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m182428p(rop ropVar, Act act, String str, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        ropVar.m182437o(act, str, function0);
    }

    /* JADX INFO: renamed from: r */
    public static final void m182429r(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: t */
    public static final void m182430t(Act act, PurchaseType purchaseType) {
        l51.m152888H(act, new Runnable() { // from class: l.pop
            @Override // java.lang.Runnable
            public final void run() {
                rop.m182431u();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: u */
    public static final void m182431u() {
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: v */
    public static final void m182432v(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Integer[] m182433h() {
        return TITLE_COVER;
    }

    /* JADX INFO: renamed from: i */
    public final void m182434i(@NotNull String eid) {
        eid.getClass();
        i4g0.m138520r(eid, "p_intl_visitors_list");
    }

    /* JADX INFO: renamed from: j */
    public final void m182435j(@NotNull String eid) {
        eid.getClass();
        i4g0.m138526x(eid, "p_intl_visitors_list");
    }

    /* JADX INFO: renamed from: k */
    public final void m182436k(@Nullable final Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            C8927c.m54567D0(act, from, Privilege.intl_visitor, null, new y20() { // from class: l.hop
                @Override // p153l.y20
                public final void call(Object obj) {
                    rop.m182425l(act, (PurchaseType) obj);
                }
            }, 0, onDismiss != null ? new x20() { // from class: l.jop
                @Override // p153l.x20
                public final void call() {
                    rop.m182427n(onDismiss);
                }
            } : null, null, null, null, false, false, ErrorCode.CAMERA_SWITCH_FAILED, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m182437o(@Nullable Act act, @NotNull String from, @Nullable Function0<Unit> onDismiss) {
        from.getClass();
        if (CoreModule.f18264c.f20414p0.m219067l3()) {
            m182439s(act, from, onDismiss);
        } else if (CoreModule.f18264c.f20414p0.m219065j3()) {
            m182438q(act, from, onDismiss);
        } else {
            m182436k(act, from, onDismiss);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m182438q(@Nullable Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            C8927c.m54571E1(act, from, Privilege.intl_visitor, onDismiss != null ? new x20() { // from class: l.fop
                @Override // p153l.x20
                public final void call() {
                    rop.m182429r(onDismiss);
                }
            } : null, null, 16, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m182439s(@Nullable final Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            C8927c.m54597N0(act, from, new y20() { // from class: l.lop
                @Override // p153l.y20
                public final void call(Object obj) {
                    rop.m182430t(act, (PurchaseType) obj);
                }
            }, onDismiss != null ? new x20() { // from class: l.nop
                @Override // p153l.x20
                public final void call() {
                    rop.m182432v(onDismiss);
                }
            } : null, null, Privilege.intl_visitor, null, 64, null);
        }
    }
}
