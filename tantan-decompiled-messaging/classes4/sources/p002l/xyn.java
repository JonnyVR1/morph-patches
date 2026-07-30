package p002l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.C0425e;
import com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import l.bwr;
import l.e30;
import l.ffw;
import l.l9e;
import l.soj0;
import l.svq;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Ll/xyn;", "Ll/h4t;", "Ll/ho2;", "Ll/ezn;", "Ll/bsm;", "info", "Landroid/widget/FrameLayout;", "container", "<init>", "(Ll/bsm;Landroid/widget/FrameLayout;)V", "", "changeHeight", "", "b4", "(I)V", "Ll/tzd;", "event", "e4", "(Ll/tzd;)V", "f4", "()V", "T", "t", "c4", "", "textSchema", "d4", "(Ljava/lang/String;)V", "n", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "pushInfo", "a4", "(Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;)V", "space", "g4", "i", "I", "DefaultY", "j", "DialogShowY", "k", "traysHeightWithoutDialog", "l", "currentChangeHeight", "Lkotlin/collections/ArrayDeque;", "m", "Lkotlin/collections/ArrayDeque;", "pushInfoDeque", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class xyn extends h4t<ho2, ezn> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int DefaultY;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int DialogShowY;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int traysHeightWithoutDialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int currentChangeHeight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final ArrayDeque<LongLinkIntlLightPushMessage.IntlLightPushInfo> pushInfoDeque;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyn(@NotNull bsm<? extends ho2> bsmVar, @NotNull FrameLayout frameLayout) {
        super(bsmVar);
        bsmVar.getClass();
        frameLayout.getClass();
        this.DialogShowY = svq.c(36);
        this.traysHeightWithoutDialog = this.DefaultY;
        this.pushInfoDeque = new ArrayDeque<>();
        C(new ezn(frameLayout));
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m26249J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m26250K3(tzd tzdVar) {
        tzdVar.getClass();
        return Boolean.valueOf(tzdVar.f20436a == LiveDialogEnum.GIFT);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: L3 */
    public static Boolean m26251L3(xyn xynVar, tzd tzdVar) {
        return Boolean.valueOf(!xynVar.m25547E2().m14548Z0());
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m26252M3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m26253N3(xyn xynVar, soj0 soj0Var) {
        xynVar.m26267f4();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m26254O3(xyn xynVar, LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo) {
        intlLightPushInfo.getClass();
        xynVar.m26269a4(intlLightPushInfo);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m26255P3(xyn xynVar, tzd tzdVar) {
        tzdVar.getClass();
        xynVar.m26266e4(tzdVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public static Boolean m26256R3(xyn xynVar, C0425e c0425e) {
        return Boolean.valueOf(!xynVar.m25547E2().m14548Z0());
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m26257S3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m26258T3(LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo) {
        return Boolean.valueOf(NullChecker.a(intlLightPushInfo));
    }

    /* JADX INFO: renamed from: U3 */
    public static Boolean m26259U3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m26260V3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m26261W3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m26262X3(C0425e c0425e) {
        c0425e.getClass();
        return Boolean.valueOf(c0425e.mo16065a() == 4400 || c0425e.mo16065a() == 6000);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public static Boolean m26263Y3(xyn xynVar, soj0 soj0Var) {
        return Boolean.valueOf(!xynVar.m25547E2().m14548Z0());
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m26264Z3(xyn xynVar, C0425e c0425e) {
        c0425e.getClass();
        xynVar.m26272g4(c0425e.m7872b());
    }

    /* JADX INFO: renamed from: b4 */
    private final void m26265b4(int changeHeight) {
        if (this.currentChangeHeight != changeHeight) {
            this.currentChangeHeight = changeHeight;
            ((ezn) ((bwr) this).viewModel).m12857B(-changeHeight);
        }
    }

    /* JADX INFO: renamed from: e4 */
    private final void m26266e4(tzd event) {
        if (event.f20438c) {
            m26267f4();
        } else {
            m26265b4(this.traysHeightWithoutDialog);
        }
    }

    /* JADX INFO: renamed from: f4 */
    private final void m26267f4() {
        m26265b4(Math.max(((xnj.C0900a) m14184F3(new xnj(700))).m26043b() + this.DialogShowY, this.currentChangeHeight));
    }

    /* JADX INFO: renamed from: T */
    public void m26268T() {
        super.T();
        ((ezn) ((bwr) this).viewModel).m12857B(0);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m26269a4(LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        this.pushInfoDeque.add(pushInfo);
        m26270c4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m26270c4() {
        if (this.pushInfoDeque.isEmpty() || !((ezn) ((bwr) this).viewModel).m12864k()) {
            return;
        }
        ((ezn) ((bwr) this).viewModel).m12860F((LongLinkIntlLightPushMessage.IntlLightPushInfo) this.pushInfoDeque.removeFirst());
    }

    /* JADX INFO: renamed from: d4 */
    public final void m26271d4(@Nullable String textSchema) {
        if (textSchema != null) {
            m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(textSchema).m25608c());
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m26272g4(int space) {
        this.traysHeightWithoutDialog = space - l9e.m;
        if (m25551K2().m22218f(LiveDialogEnum.GIFT) || m25551K2().m22218f(LiveDialogEnum.CHAT_INPUT)) {
            return;
        }
        m26265b4(this.traysHeightWithoutDialog);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        if (this.pushInfoDeque.isEmpty()) {
            return;
        }
        this.pushInfoDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m26273t() {
        super.t();
        c cVarDuringCreated = duringCreated(m25547E2().m14596q1().q());
        final Function1 function1 = new Function1() { // from class: l.hyn
            public final Object invoke(Object obj) {
                return xyn.m26258T3((LongLinkIntlLightPushMessage.IntlLightPushInfo) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.uyn
            public final Object call(Object obj) {
                return xyn.m26257S3(function1, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.vyn
            public final void call(Object obj) {
                xyn.m26254O3(this.f21384a, (LongLinkIntlLightPushMessage.IntlLightPushInfo) obj);
            }
        }));
        c cVarDuringCreated2 = duringCreated((c) m25548F2().DialogCenterEvent.changeVisibility().g());
        final Function1 function2 = new Function1() { // from class: l.wyn
            public final Object invoke(Object obj) {
                return xyn.m26251L3(this.f22044a, (tzd) obj);
            }
        };
        c cVarFilter = cVarDuringCreated2.filter(new w9j() { // from class: l.iyn
            public final Object call(Object obj) {
                return xyn.m26261W3(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.jyn
            public final Object invoke(Object obj) {
                return xyn.m26250K3((tzd) obj);
            }
        };
        cVarFilter.filter(new w9j() { // from class: l.kyn
            public final Object call(Object obj) {
                return xyn.m26260V3(function3, obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.lyn
            public final void call(Object obj) {
                xyn.m26255P3(this.f15176a, (tzd) obj);
            }
        }));
        c cVarDuringCreated3 = duringCreated((c) m25548F2().TraysViewEvent.changeBottomSpace().g());
        final Function1 function4 = new Function1() { // from class: l.myn
            public final Object invoke(Object obj) {
                return xyn.m26256R3(this.f15745a, (C0425e) obj);
            }
        };
        c cVarFilter2 = cVarDuringCreated3.filter(new w9j() { // from class: l.nyn
            public final Object call(Object obj) {
                return xyn.m26252M3(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.oyn
            public final Object invoke(Object obj) {
                return xyn.m26262X3((C0425e) obj);
            }
        };
        cVarFilter2.filter(new w9j() { // from class: l.pyn
            public final Object call(Object obj) {
                return xyn.m26259U3(function5, obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.qyn
            public final void call(Object obj) {
                xyn.m26264Z3(this.f18275a, (C0425e) obj);
            }
        }));
        c cVarDuringCreated4 = duringCreated((c) m25548F2().GiftDialogEventGroup.giftDialogHeightChange().g());
        final Function1 function6 = new Function1() { // from class: l.ryn
            public final Object invoke(Object obj) {
                return xyn.m26263Y3(this.f18724a, (soj0) obj);
            }
        };
        cVarDuringCreated4.filter(new w9j() { // from class: l.syn
            public final Object call(Object obj) {
                return xyn.m26249J3(function6, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.tyn
            public final void call(Object obj) {
                xyn.m26253N3(this.f20426a, (soj0) obj);
            }
        }));
    }
}
