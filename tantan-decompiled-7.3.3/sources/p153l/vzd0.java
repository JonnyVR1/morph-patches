package p153l;

import android.R;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.IntlMarketToken;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.sayHi.view.SayHiDialogContainer;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0013J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0013R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010!R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, m88121d2 = {"Ll/vzd0;", "Ll/pej0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "greetBuilder", "", IntlMarketToken.theme, "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;I)V", "", "show", "()V", SysnotifListener.ACTION_DISMISS, "W", "U", "", "message", "R", "(Ljava/lang/String;)V", "Q", "b0", "f0", "e0", "d0", "j0", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "Lcom/p1/mobile/putong/core/data/Message;", "a0", "(Lcom/p1/mobile/putong/core/data/Greeting;Lcom/p1/mobile/putong/core/data/Message;)V", "userId", "X", "Z", "", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Z", p7f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/Greeting;)V", p7f.GPS_DIRECTION_TRUE, "()Ljava/lang/String;", "P", "c0", "k0", "i0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "mDialogBehavior", "g", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", "sayHiDialogContainerView", "j", "needRemoveTopCard", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "k", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "mBottomSheetBehaviorCallback", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vzd0 extends pej0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public BottomSheetBehavior<FrameLayout> mDialogBehavior;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public Act act;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public C8523d.a greetBuilder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public SayHiDialogContainer sayHiDialogContainerView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean needRemoveTopCard;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final BottomSheetBehavior.BottomSheetCallback mBottomSheetBehaviorCallback;

    /* JADX INFO: renamed from: l.vzd0$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"l/vzd0$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20962a extends BottomSheetBehavior.BottomSheetCallback {
        public C20962a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            bottomSheet.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            bottomSheet.getClass();
            if (newState == 1) {
                BottomSheetBehavior bottomSheetBehavior = vzd0.this.mDialogBehavior;
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.setState(3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public vzd0(@NotNull Act act, @NotNull C8523d.a aVar, int i) {
        super(act, i);
        act.getClass();
        aVar.getClass();
        this.act = act;
        this.greetBuilder = aVar;
        setContentView(qec0.f157104q4);
        m172032u(g6e.f102431e);
        this.mBottomSheetBehaviorCallback = new C20962a();
    }

    /* JADX INFO: renamed from: C */
    public static void m204051C(vzd0 vzd0Var, String str, boolean z) {
        if (CoreModule.f18273l.m143405a().mo34529jj() && TEnum.equals(vzd0Var.greetBuilder.m47090d().channel, Channel.confession)) {
            if (z) {
                vzd0Var.m204086f0(str);
                return;
            } else if (joa.m146351B3()) {
                vzd0Var.m204085e0(str);
                return;
            } else {
                vzd0Var.m204078P(str);
                return;
            }
        }
        if (CoreModule.f18273l.m143410g().mo36088xn() && TEnum.equals(vzd0Var.greetBuilder.m47090d().channel, Channel.confession)) {
            if (z) {
                vzd0Var.m204086f0(str);
                return;
            } else if (joa.m146351B3()) {
                vzd0Var.m204085e0(str);
                return;
            } else {
                o1j0.m165651y("今天的抢先告白已用完");
                return;
            }
        }
        if (CoreModule.m30930K().mo31754ck()) {
            vzd0Var.m204086f0(str);
        } else if (z) {
            vzd0Var.m204086f0(str);
        } else {
            vzd0Var.m204064Q(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m204052D(vzd0 vzd0Var, String str) {
        vzd0Var.m204084c0(str);
        CoreModule.m30933P().m143410g().mo36021Ko();
    }

    /* JADX INFO: renamed from: E */
    public static void m204053E(vzd0 vzd0Var) {
        vzd0Var.m176562T();
    }

    /* JADX INFO: renamed from: F */
    public static void m204054F(vzd0 vzd0Var, String str, uxj0 uxj0Var) {
        if (CoreModule.m30933P().m143410g().mo36091zl()) {
            vzd0Var.m204087i0(str);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m204056H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static void m204057I(vzd0 vzd0Var, String str) {
        vzd0Var.m204071d0(str);
        CoreModule.m30933P().m143410g().mo36041Xe();
    }

    /* JADX INFO: renamed from: J */
    public static void m204058J(vzd0 vzd0Var, String str, String str2) {
        vzd0Var.m204088k0(str);
    }

    /* JADX INFO: renamed from: K */
    public static void m204059K(vzd0 vzd0Var, String str, String str2) {
        vzd0Var.m204074j0(str);
    }

    /* JADX INFO: renamed from: L */
    public static void m204060L(Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                o1j0.m165651y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f18264c.f20384f0.m33905ap(greeting.otherUser);
                    return;
                }
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = th instanceof TantanException.Client.TantanForbidden ? (TantanException.Client.TantanForbidden) th : null;
        if (tantanForbidden != null) {
            if (g39.m128719e(tantanForbidden)) {
                o1j0.m165651y("对方同意配对后可发送消息，请耐心等待");
            } else if (g39.m128718d(tantanForbidden)) {
                o1j0.m165651y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m204062N(vzd0 vzd0Var, String str, uxj0 uxj0Var) {
        if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
            vzd0Var.m204070b0(str);
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m204064Q(final String message) {
        if (joa.m146362N3()) {
            m204085e0(message);
        } else if (CoreModule.m30933P().m143410g().mo36012Fh() > 0) {
            m204070b0(message);
        } else {
            CoreModule.m30933P().m143410g().mo36027Pk(this.act, this.greetBuilder.m47089c(), new y20() { // from class: l.tzd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vzd0.m204059K(this.f176756a, message, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    private final void m204065S(Greeting greeting) {
        if (TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            greeting.channel = Channel.get(m204066T());
        }
    }

    /* JADX INFO: renamed from: T */
    private final String m204066T() {
        if (!TextUtils.isEmpty(this.greetBuilder.m47095i())) {
            return "state";
        }
        if (TextUtils.equals(this.greetBuilder.m47089c(), "from_h5_suggest_user")) {
            return Channel.specialguest;
        }
        return TextUtils.equals(this.greetBuilder.m47089c(), "from_anonymous_profile") ? "anonymous" : "moment";
    }

    /* JADX INFO: renamed from: U */
    private final void m204067U() {
        View currentFocus;
        IBinder windowToken;
        Object systemService = this.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (NullChecker.m82486a(inputMethodManager)) {
            inputMethodManager.getClass();
            if (!inputMethodManager.isActive() || (currentFocus = getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
        }
    }

    /* JADX INFO: renamed from: V */
    private final boolean m204068V() {
        return TextUtils.equals("card", this.greetBuilder.m47089c()) || TextUtils.equals("from_city_centre_card", this.greetBuilder.m47089c()) || TextUtils.equals("home_card", this.greetBuilder.m47089c()) || TextUtils.equals("home_moment_theme_card", this.greetBuilder.m47089c()) || TextUtils.equals("p_poi_nearby_card", this.greetBuilder.m47089c());
    }

    /* JADX INFO: renamed from: Y */
    public static final void m204069Y(Relationship relationship) {
        CoreModule.m30932N().mo61550kq(relationship);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m204070b0(final String message) {
        if (CoreModule.m30933P().m143410g().mo36039Wi()) {
            CoreModule.f18276o.m132214d().mo34863jf(this.act, CoreModule.f18264c.f20312H0.m155467t5(), null, null, new x20() { // from class: l.izd0
                @Override // p153l.x20
                public final void call() {
                    vzd0.m204057I(this.f117690a, message);
                }
            });
        } else {
            m204071d0(message);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m204071d0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "coin";
        messageNew_.coinSign = CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
        Greeting greetingM47090d = this.greetBuilder.m47090d();
        greetingM47090d.getClass();
        m204083a0(greetingM47090d, messageNew_);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m204072g0(vzd0 vzd0Var) {
        vzd0Var.m176562T();
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m204073h0(vzd0 vzd0Var, String str) {
        vzd0Var.m204067U();
        str.getClass();
        vzd0Var.m204079R(str);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m204074j0(final String message) {
        if (NullChecker.m82486a(this.act)) {
            this.act.duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.kzd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vzd0.m204062N(this.f129400a, message, (uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m204075x(List list) {
        if (NullChecker.m82486a(list)) {
            jyb.m147537z(list, new y20() { // from class: l.lzd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vzd0.m204069Y((Relationship) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public static Unit m204076y(Message message, Greeting greeting, vzd0 vzd0Var, Message message2) {
        if (Intrinsics.m88377d("coin", message.consumeType)) {
            CoreModule.f18264c.f20312H0.m155449k5();
        } else if (Intrinsics.m88377d("privilege", message.consumeType)) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
        if (CoreModule.m30932N().mo61573so()) {
            CoreModule.m30932N().mo61462Gm().add(greeting.f21143id);
        }
        vzd0Var.m204082Z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static void m204077z(vzd0 vzd0Var, Greeting greeting, Message message) {
        CoreModule.f18264c.f20420r0.m35095J6();
        String str = greeting.f21143id;
        str.getClass();
        vzd0Var.m204081X(str);
        vzd0Var.m204080W();
    }

    /* JADX INFO: renamed from: P */
    public final void m204078P(final String message) {
        if (CoreModule.m30933P().m143410g().mo36091zl()) {
            m204087i0(message);
        } else {
            CoreModule.m30933P().m143410g().mo35998Am(this.act, this.greetBuilder.m47089c(), new y20() { // from class: l.ozd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vzd0.m204058J(this.f149861a, message, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m204079R(final String message) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (userM116600p9.isJailed()) {
                CoreModule.m30930K().startJailedDialogLikeAct();
                return;
            } else if (userM116600p9.isNameFake()) {
                CoreModule.m30933P().m143412i().mo180291A(this.act);
                return;
            }
        }
        this.act.duringCreated(CoreModule.f18264c.f20384f0.m33606Cg(this.greetBuilder.m47090d().f21143id, this.greetBuilder.m47093g())).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.nzd0
            @Override // p153l.y20
            public final void call(Object obj) {
                vzd0.m204051C(this.f144427a, message, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final void m204080W() {
        SayHiDialogContainer sayHiDialogContainer = this.sayHiDialogContainerView;
        if (sayHiDialogContainer != null) {
            sayHiDialogContainer.m56123v(this.act, new x20() { // from class: l.gzd0
                @Override // p153l.x20
                public final void call() {
                    vzd0.m204053E(this.f107187a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m204081X(String userId) {
        CoreModule.f18264c.f20381e0.m116484L7(userId).subscribe(psd0.m173596G(new y20() { // from class: l.jzd0
            @Override // p153l.y20
            public final void call(Object obj) {
                vzd0.m204075x((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public final void m204082Z() {
        if (m204068V()) {
            this.needRemoveTopCard = true;
        } else {
            CoreModule.f18264c.f20405m0.m32009H8(jyb.m147507f0(this.greetBuilder.m47093g()));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m204083a0(final Greeting greeting, final Message message) {
        String str;
        String strUserId;
        m204065S(greeting);
        if (TextUtils.isEmpty(greeting.moment.f39607id)) {
            str = "";
        } else {
            if (TextUtils.equals(greeting.actorUserId, CoreModule.m30929H().userId())) {
                strUserId = greeting.otherUser;
                strUserId.getClass();
            } else {
                strUserId = CoreModule.m30929H().userId();
                strUserId.getClass();
            }
            str = "?source=moment&moment_id=" + greeting.moment.f39607id + "&moment_owner_id=" + strUserId;
        }
        String str2 = str;
        Act act = this.act;
        C22421c<Message> c22421cTake = CoreModule.f18264c.f20420r0.m35152u6(greeting.f21143id, greeting.channel, message, str2, null).take(1);
        final Function1 function1 = new Function1() { // from class: l.pzd0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vzd0.m204076y(message, greeting, this, (Message) obj);
            }
        };
        act.duringCreated(c22421cTake.doOnNext(new y20() { // from class: l.qzd0
            @Override // p153l.y20
            public final void call(Object obj) {
                vzd0.m204056H(function1, obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.rzd0
            @Override // p153l.y20
            public final void call(Object obj) {
                vzd0.m204077z(this.f165513a, greeting, (Message) obj);
            }
        }, new y20() { // from class: l.szd0
            @Override // p153l.y20
            public final void call(Object obj) {
                vzd0.m204060L(greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m204084c0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "coin";
        messageNew_.coinSign = CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
        Greeting greetingM47090d = this.greetBuilder.m47090d();
        greetingM47090d.getClass();
        m204083a0(greetingM47090d, messageNew_);
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m176562T() {
        m204067U();
        super.m176562T();
        if (this.needRemoveTopCard) {
            CoreModule.f18264c.f20420r0.f20772k0 = this.greetBuilder.m47093g();
            CoreModule.f18264c.f20420r0.f20770i0.m137019l(this.greetBuilder.m47093g());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m204085e0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "privilege";
        messageNew_.coinSign = "";
        Greeting greetingM47090d = this.greetBuilder.m47090d();
        greetingM47090d.getClass();
        m204083a0(greetingM47090d, messageNew_);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m204086f0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "";
        messageNew_.coinSign = "";
        Greeting greetingM47090d = this.greetBuilder.m47090d();
        greetingM47090d.getClass();
        m204083a0(greetingM47090d, messageNew_);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m204087i0(final String message) {
        if (CoreModule.m30933P().m143410g().mo36070nb()) {
            CoreModule.f18276o.m132214d().mo34771Vi(this.act, CoreModule.f18264c.f20312H0.m155438b5(), null, null, new x20() { // from class: l.hzd0
                @Override // p153l.x20
                public final void call() {
                    vzd0.m204052D(this.f112232a, message);
                }
            });
        } else {
            m204084c0(message);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m204088k0(final String message) {
        if (NullChecker.m82486a(this.act)) {
            this.act.duringCreated(CoreModule.f18264c.f20312H0.m155449k5()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.uzd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vzd0.m204054F(this.f181780a, message, (uxj0) obj);
                }
            }));
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            View viewFindViewById = window.findViewById(R.id.content);
            viewFindViewById.getClass();
            this.sayHiDialogContainerView = (SayHiDialogContainer) viewFindViewById.findViewById(edc0.f93290U3);
            View viewFindViewById2 = viewFindViewById.findViewById(edc0.f93449s0);
            viewFindViewById2.getClass();
            FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
            frameLayout.setBackgroundColor(0);
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            this.mDialogBehavior = bottomSheetBehaviorFrom;
            if (bottomSheetBehaviorFrom != null) {
                bottomSheetBehaviorFrom.setState(3);
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
                bottomSheetBehaviorFrom.setBottomSheetCallback(this.mBottomSheetBehaviorCallback);
            }
            SayHiDialogContainer sayHiDialogContainer = this.sayHiDialogContainerView;
            if (sayHiDialogContainer != null) {
                sayHiDialogContainer.m56124w(this.act, this.greetBuilder, new x20() { // from class: l.fzd0
                    @Override // p153l.x20
                    public final void call() {
                        vzd0.m204072g0(this.f101472a);
                    }
                }, new y20() { // from class: l.mzd0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vzd0.m204073h0(this.f139503a, (String) obj);
                    }
                });
            }
        }
    }

    public /* synthetic */ vzd0(Act act, C8523d.a aVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, aVar, (i2 & 4) != 0 ? 0 : i);
    }
}
