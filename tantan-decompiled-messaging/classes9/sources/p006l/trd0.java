package p006l;

import android.R;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.sayHi.view.SayHiDialogContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e30;
import l.l5j0;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.s4e;
import l.vwb;
import l.x19;
import l.y4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u0013J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0013R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010!R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Ll/trd0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "greetBuilder", "", "theme", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;I)V", "", "show", "()V", "dismiss", "W", "U", "", "message", "R", "(Ljava/lang/String;)V", "Q", "b0", "f0", "e0", "d0", "j0", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "Lcom/p1/mobile/putong/core/data/Message;", "a0", "(Lcom/p1/mobile/putong/core/data/Greeting;Lcom/p1/mobile/putong/core/data/Message;)V", "userId", "X", "Z", "", "V", "()Z", "S", "(Lcom/p1/mobile/putong/core/data/Greeting;)V", "T", "()Ljava/lang/String;", "P", "c0", "k0", "i0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "f", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "mDialogBehavior", "g", "Lcom/p1/mobile/android/app/Act;", "h", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", "i", "Lcom/p1/mobile/putong/core/ui/sayHi/view/SayHiDialogContainer;", "sayHiDialogContainerView", "j", "needRemoveTopCard", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "k", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "mBottomSheetBehaviorCallback", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class trd0 extends l5j0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public BottomSheetBehavior<FrameLayout> mDialogBehavior;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public Act act;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public d.a greetBuilder;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public SayHiDialogContainer sayHiDialogContainerView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean needRemoveTopCard;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final BottomSheetBehavior.BottomSheetCallback mBottomSheetBehaviorCallback;

    /* JADX INFO: renamed from: l.trd0$a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"l/trd0$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "onStateChanged", "(Landroid/view/View;I)V", "", "slideOffset", "onSlide", "(Landroid/view/View;F)V", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1321a extends BottomSheetBehavior.BottomSheetCallback {
        public C1321a() {
        }

        public void onSlide(View bottomSheet, float slideOffset) {
            bottomSheet.getClass();
        }

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
    public trd0(@NotNull Act act, @NotNull d.a aVar, int i) {
        super(act, i);
        act.getClass();
        aVar.getClass();
        this.act = act;
        this.greetBuilder = aVar;
        setContentView(l6c0.q4);
        u(s4e.e);
        this.mBottomSheetBehaviorCallback = new C1321a();
    }

    /* JADX INFO: renamed from: C */
    public static void m24770C(trd0 trd0Var, String str, boolean z) {
        if (CoreModule.f1543l.m11706a().m5463jj() && TEnum.equals(trd0Var.greetBuilder.d().channel, "confession")) {
            if (z) {
                trd0Var.m24805f0(str);
                return;
            } else if (xma.m27345A3()) {
                trd0Var.m24804e0(str);
                return;
            } else {
                trd0Var.m24797P(str);
                return;
            }
        }
        if (CoreModule.f1543l.m11711g().m7022xn() && TEnum.equals(trd0Var.greetBuilder.d().channel, "confession")) {
            if (z) {
                trd0Var.m24805f0(str);
                return;
            } else if (xma.m27345A3()) {
                trd0Var.m24804e0(str);
                return;
            } else {
                lsi0.y("今天的抢先告白已用完");
                return;
            }
        }
        if (CoreModule.m1851K().ck()) {
            trd0Var.m24805f0(str);
        } else if (z) {
            trd0Var.m24805f0(str);
        } else {
            trd0Var.m24783Q(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m24771D(trd0 trd0Var, String str) {
        trd0Var.m24803c0(str);
        CoreModule.m1854P().m11711g().m6955Ko();
    }

    /* JADX INFO: renamed from: E */
    public static void m24772E(trd0 trd0Var) {
        trd0Var.dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static void m24773F(trd0 trd0Var, String str, roj0 roj0Var) {
        if (CoreModule.m1854P().m11711g().m7025zl()) {
            trd0Var.m24806i0(str);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m24775H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static void m24776I(trd0 trd0Var, String str) {
        trd0Var.m24790d0(str);
        CoreModule.m1854P().m11711g().m6975Xe();
    }

    /* JADX INFO: renamed from: J */
    public static void m24777J(trd0 trd0Var, String str, String str2) {
        trd0Var.m24807k0(str);
    }

    /* JADX INFO: renamed from: K */
    public static void m24778K(trd0 trd0Var, String str, String str2) {
        trd0Var.m24793j0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public static void m24779L(Greeting greeting, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.y("对方账号异常");
                return;
            } else {
                if (i == 40046) {
                    CoreModule.f1534c.f3631f0.m4832ap(greeting.otherUser);
                    return;
                }
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = th instanceof TantanException.Client.TantanForbidden ? (TantanException.Client.TantanForbidden) th : null;
        if (tantanForbidden != null) {
            if (x19.e(tantanForbidden)) {
                lsi0.y("对方同意配对后可发送消息，请耐心等待");
            } else if (x19.d(tantanForbidden)) {
                lsi0.y(tantanForbidden.message);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m24781N(trd0 trd0Var, String str, roj0 roj0Var) {
        if (CoreModule.m1854P().m11711g().m6946Fh() > 0) {
            trd0Var.m24789b0(str);
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m24783Q(final String message) {
        if (xma.m27356M3()) {
            m24804e0(message);
        } else if (CoreModule.m1854P().m11711g().m6946Fh() > 0) {
            m24789b0(message);
        } else {
            CoreModule.m1854P().m11711g().m6961Pk(this.act, this.greetBuilder.c(), new e30() { // from class: l.rrd0
                public final void call(Object obj) {
                    trd0.m24778K(this.f20689a, message, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    private final void m24784S(Greeting greeting) {
        if (TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            greeting.channel = Channel.get(m24785T());
        }
    }

    /* JADX INFO: renamed from: T */
    private final String m24785T() {
        if (!TextUtils.isEmpty(this.greetBuilder.i())) {
            return "state";
        }
        if (TextUtils.equals(this.greetBuilder.c(), "from_h5_suggest_user")) {
            return "specialguest";
        }
        return TextUtils.equals(this.greetBuilder.c(), "from_anonymous_profile") ? "anonymous" : "moment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    private final void m24786U() {
        View currentFocus;
        IBinder windowToken;
        Object systemService = this.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (NullChecker.a(inputMethodManager)) {
            inputMethodManager.getClass();
            if (!inputMethodManager.isActive() || (currentFocus = getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
        }
    }

    /* JADX INFO: renamed from: V */
    private final boolean m24787V() {
        return TextUtils.equals("card", this.greetBuilder.c()) || TextUtils.equals("from_city_centre_card", this.greetBuilder.c()) || TextUtils.equals("home_card", this.greetBuilder.c()) || TextUtils.equals("home_moment_theme_card", this.greetBuilder.c()) || TextUtils.equals("p_poi_nearby_card", this.greetBuilder.c());
    }

    /* JADX INFO: renamed from: Y */
    public static final void m24788Y(Relationship relationship) {
        CoreModule.m1853N().kq(relationship);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m24789b0(final String message) {
        if (CoreModule.m1854P().m11711g().m6973Wi()) {
            CoreModule.f1546o.m25559d().m5797jf(this.act, CoreModule.f1534c.f3559H0.m27554t5(), null, null, new d30() { // from class: l.grd0
                public final void call() {
                    trd0.m24776I(this.f13459a, message);
                }
            });
        } else {
            m24790d0(message);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m24790d0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "coin";
        messageNew_.coinSign = CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("greetNumber"));
        Greeting greetingD = this.greetBuilder.d();
        greetingD.getClass();
        m24802a0(greetingD, messageNew_);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m24791g0(trd0 trd0Var) {
        trd0Var.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m24792h0(trd0 trd0Var, String str) {
        trd0Var.m24786U();
        str.getClass();
        trd0Var.m24798R(str);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m24793j0(final String message) {
        if (NullChecker.a(this.act)) {
            this.act.duringCreated(CoreModule.f1534c.f3559H0.m27536k5()).take(1).subscribe(mkd0.G(new e30() { // from class: l.ird0
                public final void call(Object obj) {
                    trd0.m24781N(this.f14723a, message, (roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m24794x(List list) {
        if (NullChecker.a(list)) {
            vwb.z(list, new e30() { // from class: l.jrd0
                public final void call(Object obj) {
                    trd0.m24788Y((Relationship) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public static Unit m24795y(Message message, Greeting greeting, trd0 trd0Var, Message message2) {
        if (Intrinsics.d("coin", message.consumeType)) {
            CoreModule.f1534c.f3559H0.m27536k5();
        } else if (Intrinsics.d("privilege", message.consumeType)) {
            CoreModule.f1534c.f3544C0.m27420u4();
        }
        if (CoreModule.m1853N().so()) {
            CoreModule.m1853N().Gm().add(greeting.id);
        }
        trd0Var.m24801Z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static void m24796z(trd0 trd0Var, Greeting greeting, Message message) {
        CoreModule.f1534c.f3667r0.m6029J6();
        String str = greeting.id;
        str.getClass();
        trd0Var.m24800X(str);
        trd0Var.m24799W();
    }

    /* JADX INFO: renamed from: P */
    public final void m24797P(final String message) {
        if (CoreModule.m1854P().m11711g().m7025zl()) {
            m24806i0(message);
        } else {
            CoreModule.m1854P().m11711g().m6932Am(this.act, this.greetBuilder.c(), new e30() { // from class: l.mrd0
                public final void call(Object obj) {
                    trd0.m24777J(this.f17211a, message, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m24798R(final String message) {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            if (userM21490p9.isJailed()) {
                CoreModule.m1851K().startJailedDialogLikeAct();
                return;
            } else if (userM21490p9.isNameFake()) {
                CoreModule.m1854P().m11713i().m19705A(this.act);
                return;
            }
        }
        this.act.duringCreated(CoreModule.f1534c.f3631f0.m4533Cg(this.greetBuilder.d().id, this.greetBuilder.g())).take(1).subscribe(mkd0.G(new e30() { // from class: l.lrd0
            public final void call(Object obj) {
                trd0.m24770C(this.f16604a, message, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final void m24799W() {
        SayHiDialogContainer sayHiDialogContainer = this.sayHiDialogContainerView;
        if (sayHiDialogContainer != null) {
            sayHiDialogContainer.m8304v(this.act, new d30() { // from class: l.erd0
                public final void call() {
                    trd0.m24772E(this.f11414a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m24800X(String userId) {
        CoreModule.f1534c.f3628e0.m21374L7(userId).subscribe(mkd0.G(new e30() { // from class: l.hrd0
            public final void call(Object obj) {
                trd0.m24794x((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public final void m24801Z() {
        if (m24787V()) {
            this.needRemoveTopCard = true;
        } else {
            CoreModule.f1534c.f3652m0.m2936H8(vwb.f0(new String[]{this.greetBuilder.g()}));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m24802a0(final Greeting greeting, final Message message) {
        String str;
        String strUserId;
        m24784S(greeting);
        if (TextUtils.isEmpty(greeting.moment.id)) {
            str = "";
        } else {
            if (TextUtils.equals(greeting.actorUserId, CoreModule.m1850H().userId())) {
                strUserId = greeting.otherUser;
                strUserId.getClass();
            } else {
                strUserId = CoreModule.m1850H().userId();
                strUserId.getClass();
            }
            str = "?source=moment&moment_id=" + greeting.moment.id + "&moment_owner_id=" + strUserId;
        }
        String str2 = str;
        Act act = this.act;
        c cVarTake = CoreModule.f1534c.f3667r0.m6086u6(greeting.id, greeting.channel, message, str2, null).take(1);
        final Function1 function1 = new Function1() { // from class: l.nrd0
            public final Object invoke(Object obj) {
                return trd0.m24795y(message, greeting, this, (Message) obj);
            }
        };
        act.duringCreated(cVarTake.doOnNext(new e30() { // from class: l.ord0
            public final void call(Object obj) {
                trd0.m24775H(function1, obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.prd0
            public final void call(Object obj) {
                trd0.m24796z(this.f19273a, greeting, (Message) obj);
            }
        }, new e30() { // from class: l.qrd0
            public final void call(Object obj) {
                trd0.m24779L(greeting, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m24803c0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "coin";
        messageNew_.coinSign = CoreModule.f1534c.f3559H0.m27551s4(SummarizedPrivilegesId.get("preConfession"));
        Greeting greetingD = this.greetBuilder.d();
        greetingD.getClass();
        m24802a0(greetingD, messageNew_);
    }

    public void dismiss() {
        m24786U();
        super.dismiss();
        if (this.needRemoveTopCard) {
            CoreModule.f1534c.f3667r0.f4019k0 = this.greetBuilder.g();
            CoreModule.f1534c.f3667r0.f4017i0.onNext(this.greetBuilder.g());
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m24804e0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "privilege";
        messageNew_.coinSign = "";
        Greeting greetingD = this.greetBuilder.d();
        greetingD.getClass();
        m24802a0(greetingD, messageNew_);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m24805f0(String message) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("text");
        messageNew_.value = message;
        messageNew_.consumeType = "";
        messageNew_.coinSign = "";
        Greeting greetingD = this.greetBuilder.d();
        greetingD.getClass();
        m24802a0(greetingD, messageNew_);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m24806i0(final String message) {
        if (CoreModule.m1854P().m11711g().m7004nb()) {
            CoreModule.f1546o.m25559d().m5705Vi(this.act, CoreModule.f1534c.f3559H0.m27525b5(), null, null, new d30() { // from class: l.frd0
                public final void call() {
                    trd0.m24771D(this.f12873a, message);
                }
            });
        } else {
            m24803c0(message);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m24807k0(final String message) {
        if (NullChecker.a(this.act)) {
            this.act.duringCreated(CoreModule.f1534c.f3559H0.m27536k5()).take(1).subscribe(mkd0.G(new e30() { // from class: l.srd0
                public final void call(Object obj) {
                    trd0.m24773F(this.f21626a, message, (roj0) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        Window window = getWindow();
        if (window != null) {
            View viewFindViewById = window.findViewById(R.id.content);
            viewFindViewById.getClass();
            this.sayHiDialogContainerView = (SayHiDialogContainer) viewFindViewById.findViewById(y4c0.U3);
            View viewFindViewById2 = viewFindViewById.findViewById(y4c0.s0);
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
                sayHiDialogContainer.m8305w(this.act, this.greetBuilder, new d30() { // from class: l.drd0
                    public final void call() {
                        trd0.m24791g0(this.f10540a);
                    }
                }, new e30() { // from class: l.krd0
                    public final void call(Object obj) {
                        trd0.m24792h0(this.f15972a, (String) obj);
                    }
                });
            }
        }
    }

    public /* synthetic */ trd0(Act act, d.a aVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, aVar, (i2 & 4) != 0 ? 0 : i);
    }
}
