package p002l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveChatTip;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.bwr;
import l.e30;
import l.ffw;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0010R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u0017¨\u0006("}, d2 = {"Ll/ho40;", "Ll/ho2;", "D", "Ll/gn2;", "Ll/ko40;", "Ll/bsm;", "info", "Landroid/widget/LinearLayout;", "tips", "<init>", "(Ll/bsm;Landroid/widget/LinearLayout;)V", "", "k4", "()Z", "", "m4", "()V", "show", "", "progress", "Z3", "(ZI)V", "Y3", "(Z)V", "T", "Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;", "bLiveChatTip", "sendDanmuStyle", "l4", "(Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;Z)V", "", "type", "Landroid/view/View;", "j4", "(Ljava/lang/String;)Landroid/view/View;", "P3", "j", "Z", "getSendDanmuStyle", "setSendDanmuStyle", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ho40<D extends ho2> extends gn2<D, ko40> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean sendDanmuStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho40(@NotNull bsm<D> bsmVar, @NotNull LinearLayout linearLayout) {
        super(bsmVar);
        bsmVar.getClass();
        linearLayout.getClass();
        C(new ko40(linearLayout));
    }

    /* JADX INFO: renamed from: d4 */
    public static Boolean m14640d4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m14641e4(ho40 ho40Var, boolean z) {
        if (z) {
            ((ko40) ((bwr) ho40Var).viewModel).m16721w();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public static void m14642f4(ho40 ho40Var, boolean z) {
        ((ko40) ((bwr) ho40Var).viewModel).m16722x(z);
    }

    /* JADX INFO: renamed from: g4 */
    public static Boolean m14643g4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public static Boolean m14644h4(ho40 ho40Var, Boolean bool) {
        return Boolean.valueOf(!ho40Var.m25547E2().mo9893p());
    }

    /* JADX INFO: renamed from: i4 */
    public static Boolean m14645i4(Boolean bool) {
        return Boolean.valueOf(bool != null);
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        if (((ko40) ((bwr) this).viewModel).m16716p()) {
            BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
            bLiveBubbleConfig.type = "vipServiceBubble";
            bLiveBubbleConfig.id = "-2";
            bLiveBubbleConfig.bubbleTextList = vwb.M(ypv.e.getString(R$string.f3149Ze));
            bLiveBubbleConfig.bubbleStartColor = "FF8817";
            bLiveBubbleConfig.bubbleEndColor = "FF8817";
            bLiveBubbleConfig.bubbleDisappear = 3;
            m25548F2().BootBubbleEvent.showExtraBubble().j(bLiveBubbleConfig);
        }
        c cVarDuringCreated = duringCreated(ypv.a.D());
        final Function1 function1 = new Function1() { // from class: l.eo40
            public final Object invoke(Object obj) {
                return ho40.m14645i4((Boolean) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.fo40
            public final Object call(Object obj) {
                return ho40.m14643g4(function1, obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.go40
            public final void call(Object obj) {
                ho40.m14642f4(this.f11560a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m14646T() {
        super.T();
        c cVarDuringCreated = duringCreated(ypv.a.B());
        final Function1 function1 = new Function1() { // from class: l.bo40
            public final Object invoke(Object obj) {
                return ho40.m14644h4(this.f8290a, (Boolean) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.co40
            public final Object call(Object obj) {
                return ho40.m14640d4(function1, obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.do40
            public final void call(Object obj) {
                ho40.m14641e4(this.f9370a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p002l.gn2
    /* JADX INFO: renamed from: Y3 */
    public void mo13961Y3(boolean show) {
        super.mo13961Y3(show);
        if (show) {
            ((ko40) ((bwr) this).viewModel).m16720v(0.0f, true);
        }
    }

    @Override // p002l.gn2
    /* JADX INFO: renamed from: Z3 */
    public void mo13962Z3(boolean show, int progress) {
        super.mo13962Z3(show, progress);
        if (((ko40) ((bwr) this).viewModel).m16709i().m12925C() == 0) {
            xdl0.M(((ko40) ((bwr) this).viewModel).getTips(), false);
            return;
        }
        s7m s7mVar = ((bwr) this).viewModel;
        if (!show) {
            ((ko40) s7mVar).m16707e(progress / 180.0f);
        } else if (xdl0.O0(((ko40) s7mVar).getTips())) {
            float f = progress;
            ((ko40) ((bwr) this).viewModel).m16720v(f <= 240.0f ? (240.0f - f) / 240.0f : 0.0f, false);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j4 */
    public final View m14647j4(@NotNull String type) {
        type.getClass();
        return ((ko40) ((bwr) this).viewModel).m16708f(type);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m14648k4() {
        return ((ko40) ((bwr) this).viewModel).m16709i().m12925C() > 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m14649l4(@Nullable BLiveChatTip bLiveChatTip, boolean sendDanmuStyle) {
        this.sendDanmuStyle = sendDanmuStyle;
        ((ko40) ((bwr) this).viewModel).m16717q(bLiveChatTip);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m14650m4() {
        act().startActivity(ypv.a.z0(act(), "-11000", false, false));
        m13960X3();
        zvf0.r("e_live_vip_customer_service", mo21430R2());
    }
}
