package p153l;

import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12999e;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u000eR\u0014\u0010%\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010$R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Ll/x0o;", "Ll/i6t;", "Ll/oo2;", "Ll/e1o;", "Ll/dum;", BaseSei.INFO, "Landroid/widget/FrameLayout;", "container", "<init>", "(Ll/dum;Landroid/widget/FrameLayout;)V", "", "changeHeight", "", "b4", "(I)V", "Ll/h1e;", NotificationCompat.CATEGORY_EVENT, "e4", "(Ll/h1e;)V", "f4", "()V", p7f.GPS_DIRECTION_TRUE, Constants.KEY_T, "c4", "", "textSchema", "d4", "(Ljava/lang/String;)V", "n", "Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;", "pushInfo", "a4", "(Lcom/p1/mobile/longlink/msg/intl_light_push/LongLinkIntlLightPushMessage$IntlLightPushInfo;)V", OMSTemplateModeType.space, "g4", RXScreenCaptureService.KEY_INDEX, "I", "DefaultY", "j", "DialogShowY", "k", "traysHeightWithoutDialog", BLiveStormDanmakuGiftResourceType.f45292l, "currentChangeHeight", "Lkotlin/collections/ArrayDeque;", "m", "Lkotlin/collections/ArrayDeque;", "pushInfoDeque", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class x0o extends i6t<oo2, e1o> {

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
    public x0o(@NotNull dum<? extends oo2> dumVar, @NotNull FrameLayout frameLayout) {
        super(dumVar);
        dumVar.getClass();
        frameLayout.getClass();
        this.DialogShowY = txq.m193530c(36);
        this.traysHeightWithoutDialog = this.DefaultY;
        this.pushInfoDeque = new ArrayDeque<>();
        mo52715C(new e1o(frameLayout));
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m208868J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m208869K3(h1e h1eVar) {
        h1eVar.getClass();
        return Boolean.valueOf(h1eVar.f107441a == LiveDialogEnum.GIFT);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: L3 */
    public static Boolean m208870L3(x0o x0oVar, h1e h1eVar) {
        return Boolean.valueOf(!x0oVar.m213810E2().m168498Z0());
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m208871M3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m208872N3(x0o x0oVar, vxj0 vxj0Var) {
        x0oVar.m208886f4();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m208873O3(x0o x0oVar, LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo) {
        intlLightPushInfo.getClass();
        x0oVar.m208887a4(intlLightPushInfo);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m208874P3(x0o x0oVar, h1e h1eVar) {
        h1eVar.getClass();
        x0oVar.m208885e4(h1eVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public static Boolean m208875R3(x0o x0oVar, C12999e c12999e) {
        return Boolean.valueOf(!x0oVar.m213810E2().m168498Z0());
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m208876S3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m208877T3(LongLinkIntlLightPushMessage.IntlLightPushInfo intlLightPushInfo) {
        return Boolean.valueOf(NullChecker.m82486a(intlLightPushInfo));
    }

    /* JADX INFO: renamed from: U3 */
    public static Boolean m208878U3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V3 */
    public static Boolean m208879V3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m208880W3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m208881X3(C12999e c12999e) {
        c12999e.getClass();
        return Boolean.valueOf(c12999e.mo125930a() == 4400 || c12999e.mo125930a() == 6000);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: Y3 */
    public static Boolean m208882Y3(x0o x0oVar, vxj0 vxj0Var) {
        return Boolean.valueOf(!x0oVar.m213810E2().m168498Z0());
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m208883Z3(x0o x0oVar, C12999e c12999e) {
        c12999e.getClass();
        x0oVar.m208890g4(c12999e.m75474b());
    }

    /* JADX INFO: renamed from: b4 */
    private final void m208884b4(int changeHeight) {
        if (this.currentChangeHeight != changeHeight) {
            this.currentChangeHeight = changeHeight;
            ((e1o) this.viewModel).m119004B(-changeHeight);
        }
    }

    /* JADX INFO: renamed from: e4 */
    private final void m208885e4(h1e event) {
        if (event.f107443c) {
            m208886f4();
        } else {
            m208884b4(this.traysHeightWithoutDialog);
        }
    }

    /* JADX INFO: renamed from: f4 */
    private final void m208886f4() {
        m208884b4(Math.max(((nqj.C18926a) m138856F3(new nqj(700))).m164322b() + this.DialogShowY, this.currentChangeHeight));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((e1o) this.viewModel).m119004B(0);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m208887a4(LongLinkIntlLightPushMessage.IntlLightPushInfo pushInfo) {
        this.pushInfoDeque.add(pushInfo);
        m208888c4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m208888c4() {
        if (this.pushInfoDeque.isEmpty() || !((e1o) this.viewModel).m119009k()) {
            return;
        }
        ((e1o) this.viewModel).m119006F(this.pushInfoDeque.removeFirst());
    }

    /* JADX INFO: renamed from: d4 */
    public final void m208889d4(@Nullable String textSchema) {
        if (textSchema != null) {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(textSchema).m103152c());
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m208890g4(int space) {
        this.traysHeightWithoutDialog = space - pae.f151269m;
        if (m213814K2().m189699f(LiveDialogEnum.GIFT) || m213814K2().m189699f(LiveDialogEnum.CHAT_INPUT)) {
            return;
        }
        m208884b4(this.traysHeightWithoutDialog);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        if (this.pushInfoDeque.isEmpty()) {
            return;
        }
        this.pushInfoDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m168545q1().m98316q());
        final Function1 function1 = new Function1() { // from class: l.h0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0o.m208877T3((LongLinkIntlLightPushMessage.IntlLightPushInfo) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.u0o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x0o.m208876S3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.v0o
            @Override // p153l.y20
            public final void call(Object obj) {
                x0o.m208873O3(this.f181887a, (LongLinkIntlLightPushMessage.IntlLightPushInfo) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(m213811F2().DialogCenterEvent.changeVisibility().m199270g());
        final Function1 function2 = new Function1() { // from class: l.w0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0o.m208870L3(this.f186621a, (h1e) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated2.filter(new qcj() { // from class: l.i0o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x0o.m208880W3(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.j0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0o.m208869K3((h1e) obj);
            }
        };
        c22421cFilter.filter(new qcj() { // from class: l.k0o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x0o.m208879V3(function3, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.l0o
            @Override // p153l.y20
            public final void call(Object obj) {
                x0o.m208874P3(this.f129577a, (h1e) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated3 = duringCreated(m213811F2().TraysViewEvent.changeBottomSpace().m199270g());
        final Function1 function4 = new Function1() { // from class: l.m0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0o.m208875R3(this.f134325a, (C12999e) obj);
            }
        };
        C22421c c22421cFilter2 = c22421cDuringCreated3.filter(new qcj() { // from class: l.n0o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x0o.m208871M3(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.o0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0o.m208881X3((C12999e) obj);
            }
        };
        c22421cFilter2.filter(new qcj() { // from class: l.p0o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x0o.m208878U3(function5, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.q0o
            @Override // p153l.y20
            public final void call(Object obj) {
                x0o.m208883Z3(this.f155073a, (C12999e) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated4 = duringCreated(m213811F2().GiftDialogEventGroup.giftDialogHeightChange().m199270g());
        final Function1 function6 = new Function1() { // from class: l.r0o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0o.m208882Y3(this.f160659a, (vxj0) obj);
            }
        };
        c22421cDuringCreated4.filter(new qcj() { // from class: l.s0o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x0o.m208868J3(function6, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.t0o
            @Override // p153l.y20
            public final void call(Object obj) {
                x0o.m208872N3(this.f171545a, (vxj0) obj);
            }
        }));
    }
}
