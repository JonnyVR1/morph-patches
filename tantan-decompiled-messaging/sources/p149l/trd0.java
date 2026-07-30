package p149l;

import android.R;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.sayHi.view.SayHiDialogContainer;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0013J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0013R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010!R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, m87232d2 = {"Ll/trd0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "greetBuilder", "", IntlMarketToken.theme, "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;I)V", "", "show", "()V", SysnotifListener.ACTION_DISMISS, "W", "U", "", "message", "R", "(Ljava/lang/String;)V", "Q", "b0", "f0", "e0", "d0", "j0", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "Lcom/p1/mobile/putong/core/data/Message;", "a0", "(Lcom/p1/mobile/putong/core/data/Greeting;Lcom/p1/mobile/putong/core/data/Message;)V", "userId", "X", "Z", "", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Z", j6f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/Greeting;)V", j6f.GPS_DIRECTION_TRUE, "()Ljava/lang/String;", "P", "c0", "k0", "i0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "mDialogBehavior", "g", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", "sayHiDialogContainerView", "j", "needRemoveTopCard", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "k", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "mBottomSheetBehaviorCallback", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class trd0 extends l5j0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public BottomSheetBehavior<FrameLayout> mDialogBehavior;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public Act act;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public C8360d.a greetBuilder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public SayHiDialogContainer sayHiDialogContainerView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean needRemoveTopCard;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final BottomSheetBehavior.BottomSheetCallback mBottomSheetBehaviorCallback;

    /* JADX INFO: renamed from: l.trd0$a */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"l/trd0$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20260a extends BottomSheetBehavior.BottomSheetCallback {
        public C20260a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            bottomSheet.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            bottomSheet.getClass();
            if (newState == 1) {
                BottomSheetBehavior bottomSheetBehavior = trd0.this.mDialogBehavior;
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.setState(3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public trd0(@NotNull Act act, @NotNull C8360d.a aVar, int i) {
        super(act, i);
        act.getClass();
        aVar.getClass();
        this.act = act;
        this.greetBuilder = aVar;
        setContentView(l6c0.f126548q4);
        m148649u(s4e.f162379e);
        this.mBottomSheetBehaviorCallback = new C20260a();
    }

    /* JADX INFO: renamed from: C */
    public static void m190373C(trd0 trd0Var, String str, boolean z) {
        if (CoreModule.f17554l.m94651a().mo33526jj() && TEnum.equals(trd0Var.greetBuilder.m45907d().channel, Channel.confession)) {
            if (z) {
                trd0Var.m190408f0(str);
                return;
            } else if (xma.m210037A3()) {
                trd0Var.m190407e0(str);
                return;
            } else {
                trd0Var.m190400P(str);
                return;
            }
        }
        if (CoreModule.f17554l.m94656g().mo35085xn() && TEnum.equals(trd0Var.greetBuilder.m45907d().channel, Channel.confession)) {
            if (z) {
                trd0Var.m190408f0(str);
                return;
            } else if (xma.m210037A3()) {
                trd0Var.m190407e0(str);
                return;
            } else {
                lsi0.m151595y("今天的抢先告白已用完");
                return;
            }
        }
        if (CoreModule.m29932K().mo30751ck()) {
            trd0Var.m190408f0(str);
        } else if (z) {
            trd0Var.m190408f0(str);
        } else {
            trd0Var.m190386Q(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m190374D(trd0 trd0Var, String str) {
        trd0Var.m190406c0(str);
        CoreModule.m29935P().m94656g().mo35018Ko();
    }

    /* JADX INFO: renamed from: E */
    public static void m190375E(trd0 trd0Var) {
        trd0Var.m101651T();
    }

    /* JADX INFO: renamed from: F */
    public static void m190376F(trd0 trd0Var, String str, roj0 roj0Var) {
        if (CoreModule.m29935P().m94656g().mo35088zl()) {
            trd0Var.m190409i0(str);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m190378H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static void m190379I(trd0 trd0Var, String str) {
        trd0Var.m190393d0(str);
        CoreModule.m29935P().m94656g().mo35038Xe();
    }

    /* JADX INFO: renamed from: J */
    public static void m190380J(trd0 trd0Var, String str, String str2) {
        trd0Var.m190410k0(str);
    }

    /* JADX INFO: renamed from: K */
    public static void m190381K(trd0 trd0Var, String str, String str2) {
        trd0Var.m190396j0(str);
    }

    /* JADX INFO: renamed from: L */
    public static void m190382L(Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.m151595y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f17545c.f19642f0.m32902ap(greeting.otherUser);
                    return;
                }
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = th instanceof TantanException.Client.TantanForbidden ? (TantanException.Client.TantanForbidden) th : null;
        if (tantanForbidden != null) {
            if (x19.m206695e(tantanForbidden)) {
                lsi0.m151595y("对方同意配对后可发送消息，请耐心等待");
            } else if (x19.m206694d(tantanForbidden)) {
                lsi0.m151595y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m190384N(trd0 trd0Var, String str, roj0 roj0Var) {
        if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
            trd0Var.m190392b0(str);
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m190386Q(final String message) {
        if (xma.m210048M3()) {
            m190407e0(message);
        } else if (CoreModule.m29935P().m94656g().mo35009Fh() > 0) {
            m190392b0(message);
        } else {
            CoreModule.m29935P().m94656g().mo35024Pk(this.act, this.greetBuilder.m45906c(), new e30() { // from class: l.rrd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    trd0.m190381K(this.f160738a, message, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    private final void m190387S(Greeting greeting) {
        if (TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            greeting.channel = Channel.get(m190388T());
        }
    }

    /* JADX INFO: renamed from: T */
    private final String m190388T() {
        if (!TextUtils.isEmpty(this.greetBuilder.m45912i())) {
            return "state";
        }
        if (TextUtils.equals(this.greetBuilder.m45906c(), "from_h5_suggest_user")) {
            return Channel.specialguest;
        }
        return TextUtils.equals(this.greetBuilder.m45906c(), "from_anonymous_profile") ? "anonymous" : "moment";
    }

    /* JADX INFO: renamed from: U */
    private final void m190389U() {
        View currentFocus;
        IBinder windowToken;
        Object systemService = this.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (NullChecker.m81303a(inputMethodManager)) {
            inputMethodManager.getClass();
            if (!inputMethodManager.isActive() || (currentFocus = getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
        }
    }

    /* JADX INFO: renamed from: V */
    private final boolean m190390V() {
        return TextUtils.equals("card", this.greetBuilder.m45906c()) || TextUtils.equals("from_city_centre_card", this.greetBuilder.m45906c()) || TextUtils.equals("home_card", this.greetBuilder.m45906c()) || TextUtils.equals("home_moment_theme_card", this.greetBuilder.m45906c()) || TextUtils.equals("p_poi_nearby_card", this.greetBuilder.m45906c());
    }

    /* JADX INFO: renamed from: Y */
    public static final void m190391Y(Relationship relationship) {
        CoreModule.m29934N().mo60366kq(relationship);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m190392b0(final String message) {
        if (CoreModule.m29935P().m94656g().mo35036Wi()) {
            CoreModule.f17557o.m195057d().mo33860jf(this.act, CoreModule.f17545c.f19570H0.m210379t5(), null, null, new d30() { // from class: l.grd0
                @Override // p149l.d30
                public final void call() {
                    trd0.m190379I(this.f104048a, message);
                }
            });
        } else {
            m190393d0(message);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m190393d0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "coin";
        messageNew_.coinSign = CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.greetNumber));
        Greeting greetingM45907d = this.greetBuilder.m45907d();
        greetingM45907d.getClass();
        m190405a0(greetingM45907d, messageNew_);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m190394g0(trd0 trd0Var) {
        trd0Var.m101651T();
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m190395h0(trd0 trd0Var, String str) {
        trd0Var.m190389U();
        str.getClass();
        trd0Var.m190401R(str);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m190396j0(final String message) {
        if (NullChecker.m81303a(this.act)) {
            this.act.duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ird0
                @Override // p149l.e30
                public final void call(Object obj) {
                    trd0.m190384N(this.f114620a, message, (roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m190397x(List list) {
        if (NullChecker.m81303a(list)) {
            vwb.m200354z(list, new e30() { // from class: l.jrd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    trd0.m190391Y((Relationship) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public static Unit m190398y(Message message, Greeting greeting, trd0 trd0Var, Message message2) {
        if (Intrinsics.m87488d("coin", message.consumeType)) {
            CoreModule.f17545c.f19570H0.m210361k5();
        } else if (Intrinsics.m87488d("privilege", message.consumeType)) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
        if (CoreModule.m29934N().mo60389so()) {
            CoreModule.m29934N().mo60278Gm().add(greeting.f20401id);
        }
        trd0Var.m190404Z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static void m190399z(trd0 trd0Var, Greeting greeting, Message message) {
        CoreModule.f17545c.f19678r0.m34092J6();
        String str = greeting.f20401id;
        str.getClass();
        trd0Var.m190403X(str);
        trd0Var.m190402W();
    }

    /* JADX INFO: renamed from: P */
    public final void m190400P(final String message) {
        if (CoreModule.m29935P().m94656g().mo35088zl()) {
            m190409i0(message);
        } else {
            CoreModule.m29935P().m94656g().mo34995Am(this.act, this.greetBuilder.m45906c(), new e30() { // from class: l.mrd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    trd0.m190380J(this.f135355a, message, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m190401R(final String message) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (userM169527p9.isJailed()) {
                CoreModule.m29932K().startJailedDialogLikeAct();
                return;
            } else if (userM169527p9.isNameFake()) {
                CoreModule.m29935P().m94658i().mo158199A(this.act);
                return;
            }
        }
        this.act.duringCreated(CoreModule.f17545c.f19642f0.m32603Cg(this.greetBuilder.m45907d().f20401id, this.greetBuilder.m45910g())).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.lrd0
            @Override // p149l.e30
            public final void call(Object obj) {
                trd0.m190373C(this.f129686a, message, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final void m190402W() {
        SayHiDialogContainer sayHiDialogContainer = this.sayHiDialogContainerView;
        if (sayHiDialogContainer != null) {
            sayHiDialogContainer.m54940v(this.act, new d30() { // from class: l.erd0
                @Override // p149l.d30
                public final void call() {
                    trd0.m190375E(this.f92906a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m190403X(String userId) {
        CoreModule.f17545c.f19639e0.m169411L7(userId).subscribe(mkd0.m154955G(new e30() { // from class: l.hrd0
            @Override // p149l.e30
            public final void call(Object obj) {
                trd0.m190397x((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public final void m190404Z() {
        if (m190390V()) {
            this.needRemoveTopCard = true;
        } else {
            CoreModule.f17545c.f19663m0.m31006H8(vwb.m200324f0(this.greetBuilder.m45910g()));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m190405a0(final Greeting greeting, final Message message) {
        String str;
        String strUserId;
        m190387S(greeting);
        if (TextUtils.isEmpty(greeting.moment.f38759id)) {
            str = "";
        } else {
            if (TextUtils.equals(greeting.actorUserId, CoreModule.m29931H().userId())) {
                strUserId = greeting.otherUser;
                strUserId.getClass();
            } else {
                strUserId = CoreModule.m29931H().userId();
                strUserId.getClass();
            }
            str = "?source=moment&moment_id=" + greeting.moment.f38759id + "&moment_owner_id=" + strUserId;
        }
        String str2 = str;
        Act act = this.act;
        C22306c<Message> c22306cTake = CoreModule.f17545c.f19678r0.m34149u6(greeting.f20401id, greeting.channel, message, str2, null).take(1);
        final Function1 function1 = new Function1() { // from class: l.nrd0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trd0.m190398y(message, greeting, this, (Message) obj);
            }
        };
        act.duringCreated(c22306cTake.doOnNext(new e30() { // from class: l.ord0
            @Override // p149l.e30
            public final void call(Object obj) {
                trd0.m190378H(function1, obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.prd0
            @Override // p149l.e30
            public final void call(Object obj) {
                trd0.m190399z(this.f150869a, greeting, (Message) obj);
            }
        }, new e30() { // from class: l.qrd0
            @Override // p149l.e30
            public final void call(Object obj) {
                trd0.m190382L(greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m190406c0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "coin";
        messageNew_.coinSign = CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.preConfession));
        Greeting greetingM45907d = this.greetBuilder.m45907d();
        greetingM45907d.getClass();
        m190405a0(greetingM45907d, messageNew_);
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    /* JADX INFO: renamed from: dismiss */
    public void m101651T() {
        m190389U();
        super.m101651T();
        if (this.needRemoveTopCard) {
            CoreModule.f17545c.f19678r0.f20030k0 = this.greetBuilder.m45910g();
            CoreModule.f17545c.f19678r0.f20028i0.m132487l(this.greetBuilder.m45910g());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m190407e0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "privilege";
        messageNew_.coinSign = "";
        Greeting greetingM45907d = this.greetBuilder.m45907d();
        greetingM45907d.getClass();
        m190405a0(greetingM45907d, messageNew_);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m190408f0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "";
        messageNew_.coinSign = "";
        Greeting greetingM45907d = this.greetBuilder.m45907d();
        greetingM45907d.getClass();
        m190405a0(greetingM45907d, messageNew_);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m190409i0(final String message) {
        if (CoreModule.m29935P().m94656g().mo35067nb()) {
            CoreModule.f17557o.m195057d().mo33768Vi(this.act, CoreModule.f17545c.f19570H0.m210350b5(), null, null, new d30() { // from class: l.frd0
                @Override // p149l.d30
                public final void call() {
                    trd0.m190374D(this.f98919a, message);
                }
            });
        } else {
            m190406c0(message);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m190410k0(final String message) {
        if (NullChecker.m81303a(this.act)) {
            this.act.duringCreated(CoreModule.f17545c.f19570H0.m210361k5()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.srd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    trd0.m190376F(this.f166081a, message, (roj0) obj);
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
            this.sayHiDialogContainerView = (SayHiDialogContainer) viewFindViewById.findViewById(y4c0.f196055U3);
            View viewFindViewById2 = viewFindViewById.findViewById(y4c0.f196214s0);
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
                sayHiDialogContainer.m54941w(this.act, this.greetBuilder, new d30() { // from class: l.drd0
                    @Override // p149l.d30
                    public final void call() {
                        trd0.m190394g0(this.f87606a);
                    }
                }, new e30() { // from class: l.krd0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        trd0.m190395h0(this.f124343a, (String) obj);
                    }
                });
            }
        }
    }

    public /* synthetic */ trd0(Act act, C8360d.a aVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, aVar, (i2 & 4) != 0 ? 0 : i);
    }
}
