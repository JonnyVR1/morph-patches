package p149l;

import com.core.glcore.util.ErrorCode;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ1\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J1\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J1\u0010\u0013\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0010R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/rmp;", "", "<init>", "()V", "", "eid", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "j", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "from", "Lkotlin/Function0;", "onDismiss", "o", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "q", "k", BLiveStormDanmakuGiftResourceType.f44446s, "", "", "a", "[Ljava/lang/Integer;", "h", "()[Ljava/lang/Integer;", "TITLE_COVER", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class rmp {

    @NotNull
    public static final rmp INSTANCE = new rmp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Integer[] TITLE_COVER = {Integer.valueOf(x2c0.f189792Uc), Integer.valueOf(x2c0.f189823Vc), Integer.valueOf(x2c0.f189854Wc), Integer.valueOf(x2c0.f189885Xc), Integer.valueOf(x2c0.f189916Yc)};

    /* JADX INFO: renamed from: l */
    public static final void m180029l(Act act, PurchaseType purchaseType) {
        e51.m114743H(act, new Runnable() { // from class: l.qmp
            @Override // java.lang.Runnable
            public final void run() {
                rmp.m180030m();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public static final void m180030m() {
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: n */
    public static final void m180031n(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m180032p(rmp rmpVar, Act act, String str, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        rmpVar.m180041o(act, str, function0);
    }

    /* JADX INFO: renamed from: r */
    public static final void m180033r(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: t */
    public static final void m180034t(Act act, PurchaseType purchaseType) {
        e51.m114743H(act, new Runnable() { // from class: l.pmp
            @Override // java.lang.Runnable
            public final void run() {
                rmp.m180035u();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: u */
    public static final void m180035u() {
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: v */
    public static final void m180036v(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Integer[] m180037h() {
        return TITLE_COVER;
    }

    /* JADX INFO: renamed from: i */
    public final void m180038i(@NotNull String eid) {
        eid.getClass();
        zvf0.m220396r(eid, "p_intl_visitors_list");
    }

    /* JADX INFO: renamed from: j */
    public final void m180039j(@NotNull String eid) {
        eid.getClass();
        zvf0.m220402x(eid, "p_intl_visitors_list");
    }

    /* JADX INFO: renamed from: k */
    public final void m180040k(@Nullable final Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            C8764c.m53384D0(act, from, Privilege.intl_visitor, null, new e30() { // from class: l.hmp
                @Override // p149l.e30
                public final void call(Object obj) {
                    rmp.m180029l(act, (PurchaseType) obj);
                }
            }, 0, onDismiss != null ? new d30() { // from class: l.jmp
                @Override // p149l.d30
                public final void call() {
                    rmp.m180031n(onDismiss);
                }
            } : null, null, null, null, false, false, ErrorCode.CAMERA_SWITCH_FAILED, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m180041o(@Nullable Act act, @NotNull String from, @Nullable Function0<Unit> onDismiss) {
        from.getClass();
        if (CoreModule.f17545c.f19672p0.m173364l3()) {
            m180043s(act, from, onDismiss);
        } else if (CoreModule.f17545c.f19672p0.m173362j3()) {
            m180042q(act, from, onDismiss);
        } else {
            m180040k(act, from, onDismiss);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m180042q(@Nullable Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            C8764c.m53388E1(act, from, Privilege.intl_visitor, onDismiss != null ? new d30() { // from class: l.fmp
                @Override // p149l.d30
                public final void call() {
                    rmp.m180033r(onDismiss);
                }
            } : null, null, 16, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m180043s(@Nullable final Act act, @NotNull String from, @Nullable final Function0<Unit> onDismiss) {
        from.getClass();
        if (act != null) {
            C8764c.m53414N0(act, from, new e30() { // from class: l.lmp
                @Override // p149l.e30
                public final void call(Object obj) {
                    rmp.m180034t(act, (PurchaseType) obj);
                }
            }, onDismiss != null ? new d30() { // from class: l.nmp
                @Override // p149l.d30
                public final void call() {
                    rmp.m180036v(onDismiss);
                }
            } : null, null, Privilege.intl_visitor, null, 64, null);
        }
    }
}
