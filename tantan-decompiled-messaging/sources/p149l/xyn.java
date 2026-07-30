package p149l;

import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12836e;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Ll/xyn;", "Ll/h4t;", "Ll/ho2;", "Ll/ezn;", "Ll/bsm;", BaseSei.INFO, "Landroid/widget/FrameLayout;", "container", "<init>", "(Ll/bsm;Landroid/widget/FrameLayout;)V", "", "changeHeight", "", "b4", "(I)V", "Ll/tzd;", NotificationCompat.CATEGORY_EVENT, "e4", "(Ll/tzd;)V", "f4", "()V", j6f.GPS_DIRECTION_TRUE, Constants.KEY_T, "c4", "", "textSchema", "d4", "(Ljava/lang/String;)V", "n", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "pushInfo", "a4", "(Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;)V", OMSTemplateModeType.space, "g4", RXScreenCaptureService.KEY_INDEX, "I", "DefaultY", "j", "DialogShowY", "k", "traysHeightWithoutDialog", BLiveStormDanmakuGiftResourceType.f44444l, "currentChangeHeight", "Lkotlin/collections/ArrayDeque;", "m", "Lkotlin/collections/ArrayDeque;", "pushInfoDeque", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        this.DialogShowY = svq.m186103c(36);
        this.traysHeightWithoutDialog = this.DefaultY;
        this.pushInfoDeque = new ArrayDeque<>();
        mo51532C(new ezn(frameLayout));
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m211839J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m211840K3(tzd tzdVar) {
        tzdVar.getClass();
        return Boolean.valueOf(tzdVar.f172729a == LiveDialogEnum.GIFT);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: L3 */
    public static Boolean m211841L3(xyn xynVar, tzd tzdVar) {
        return Boolean.valueOf(!xynVar.m206027E2().m132112Z0());
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m211842M3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m211843N3(xyn xynVar, soj0 soj0Var) {
        xynVar.m211857f4();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m211844O3(xyn xynVar, LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo) {
        intlLightPushInfo.getClass();
        xynVar.m211858a4(intlLightPushInfo);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m211845P3(xyn xynVar, tzd tzdVar) {
        tzdVar.getClass();
        xynVar.m211856e4(tzdVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public static Boolean m211846R3(xyn xynVar, C12836e c12836e) {
        return Boolean.valueOf(!xynVar.m206027E2().m132112Z0());
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m211847S3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m211848T3(LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo) {
        return Boolean.valueOf(NullChecker.m81303a(intlLightPushInfo));
    }

    /* JADX INFO: renamed from: U3 */
    public static Boolean m211849U3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m211850V3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m211851W3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m211852X3(C12836e c12836e) {
        c12836e.getClass();
        return Boolean.valueOf(c12836e.mo142569a() == 4400 || c12836e.mo142569a() == 6000);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public static Boolean m211853Y3(xyn xynVar, soj0 soj0Var) {
        return Boolean.valueOf(!xynVar.m206027E2().m132112Z0());
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m211854Z3(xyn xynVar, C12836e c12836e) {
        c12836e.getClass();
        xynVar.m211861g4(c12836e.m74291b());
    }

    /* JADX INFO: renamed from: b4 */
    private final void m211855b4(int changeHeight) {
        if (this.currentChangeHeight != changeHeight) {
            this.currentChangeHeight = changeHeight;
            ((ezn) this.viewModel).m118993B(-changeHeight);
        }
    }

    /* JADX INFO: renamed from: e4 */
    private final void m211856e4(tzd event) {
        if (event.f172731c) {
            m211857f4();
        } else {
            m211855b4(this.traysHeightWithoutDialog);
        }
    }

    /* JADX INFO: renamed from: f4 */
    private final void m211857f4() {
        m211855b4(Math.max(((xnj.C21181a) m129297F3(new xnj(700))).m210171b() + this.DialogShowY, this.currentChangeHeight));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((ezn) this.viewModel).m118993B(0);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m211858a4(LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        this.pushInfoDeque.add(pushInfo);
        m211859c4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m211859c4() {
        if (this.pushInfoDeque.isEmpty() || !((ezn) this.viewModel).m118998k()) {
            return;
        }
        ((ezn) this.viewModel).m118995F(this.pushInfoDeque.removeFirst());
    }

    /* JADX INFO: renamed from: d4 */
    public final void m211860d4(@Nullable String textSchema) {
        if (textSchema != null) {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(textSchema).m206699c());
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m211861g4(int space) {
        this.traysHeightWithoutDialog = space - l9e.f127089m;
        if (m206031K2().m182463f(LiveDialogEnum.GIFT) || m206031K2().m182463f(LiveDialogEnum.CHAT_INPUT)) {
            return;
        }
        m211855b4(this.traysHeightWithoutDialog);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        if (this.pushInfoDeque.isEmpty()) {
            return;
        }
        this.pushInfoDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m132160q1().m189134q());
        final Function1 function1 = new Function1() { // from class: l.hyn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xyn.m211848T3((LongLinkIntlLightPushMessage.IntlLightPushInfo) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.uyn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xyn.m211847S3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.vyn
            @Override // p149l.e30
            public final void call(Object obj) {
                xyn.m211844O3(this.f183542a, (LongLinkIntlLightPushMessage.IntlLightPushInfo) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated2 = duringCreated(m206028F2().DialogCenterEvent.changeVisibility().m172460g());
        final Function1 function2 = new Function1() { // from class: l.wyn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xyn.m211841L3(this.f188578a, (tzd) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated2.filter(new w9j() { // from class: l.iyn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xyn.m211851W3(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.jyn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xyn.m211840K3((tzd) obj);
            }
        };
        c22306cFilter.filter(new w9j() { // from class: l.kyn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xyn.m211850V3(function3, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.lyn
            @Override // p149l.e30
            public final void call(Object obj) {
                xyn.m211845P3(this.f130586a, (tzd) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated3 = duringCreated(m206028F2().TraysViewEvent.changeBottomSpace().m172460g());
        final Function1 function4 = new Function1() { // from class: l.myn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xyn.m211846R3(this.f136321a, (C12836e) obj);
            }
        };
        C22306c c22306cFilter2 = c22306cDuringCreated3.filter(new w9j() { // from class: l.nyn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xyn.m211842M3(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.oyn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xyn.m211852X3((C12836e) obj);
            }
        };
        c22306cFilter2.filter(new w9j() { // from class: l.pyn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xyn.m211849U3(function5, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.qyn
            @Override // p149l.e30
            public final void call(Object obj) {
                xyn.m211854Z3(this.f156939a, (C12836e) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated4 = duringCreated(m206028F2().GiftDialogEventGroup.giftDialogHeightChange().m172460g());
        final Function1 function6 = new Function1() { // from class: l.ryn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xyn.m211853Y3(this.f161567a, (soj0) obj);
            }
        };
        c22306cDuringCreated4.filter(new w9j() { // from class: l.syn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xyn.m211839J3(function6, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.tyn
            @Override // p149l.e30
            public final void call(Object obj) {
                xyn.m211843N3(this.f172611a, (soj0) obj);
            }
        }));
    }
}
