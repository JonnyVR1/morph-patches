package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0010R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u0017¨\u0006("}, m87232d2 = {"Ll/ho40;", "Ll/ho2;", "D", "Ll/gn2;", "Ll/ko40;", "Ll/bsm;", BaseSei.INFO, "Landroid/widget/LinearLayout;", "tips", "<init>", "(Ll/bsm;Landroid/widget/LinearLayout;)V", "", "k4", "()Z", "", "m4", "()V", "show", "", "progress", "Z3", "(ZI)V", "Y3", "(Z)V", j6f.GPS_DIRECTION_TRUE, "Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;", "bLiveChatTip", "sendDanmuStyle", "l4", "(Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;Z)V", "", "type", "Landroid/view/View;", "j4", "(Ljava/lang/String;)Landroid/view/View;", "P3", "j", "Z", "getSendDanmuStyle", "setSendDanmuStyle", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ho40<D extends ho2> extends gn2<D, ko40> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean sendDanmuStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho40(@NotNull bsm<D> bsmVar, @NotNull LinearLayout linearLayout) {
        super(bsmVar);
        bsmVar.getClass();
        linearLayout.getClass();
        mo51532C(new ko40(linearLayout));
    }

    /* JADX INFO: renamed from: d4 */
    public static Boolean m132199d4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m132200e4(ho40 ho40Var, boolean z) {
        if (z) {
            ((ko40) ho40Var.viewModel).m146683w();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public static void m132201f4(ho40 ho40Var, boolean z) {
        ((ko40) ho40Var.viewModel).m146684x(z);
    }

    /* JADX INFO: renamed from: g4 */
    public static Boolean m132202g4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public static Boolean m132203h4(ho40 ho40Var, Boolean bool) {
        return Boolean.valueOf(!ho40Var.m206027E2().mo97490p());
    }

    /* JADX INFO: renamed from: i4 */
    public static Boolean m132204i4(Boolean bool) {
        return Boolean.valueOf(bool != null);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        if (((ko40) this.viewModel).m146678p()) {
            BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
            bLiveBubbleConfig.type = "vipServiceBubble";
            bLiveBubbleConfig.f44340id = "-2";
            bLiveBubbleConfig.bubbleTextList = vwb.m200299M(ypv.f199497e.getString(R$string.f47107Ze));
            bLiveBubbleConfig.bubbleStartColor = "FF8817";
            bLiveBubbleConfig.bubbleEndColor = "FF8817";
            bLiveBubbleConfig.bubbleDisappear = 3;
            m206028F2().BootBubbleEvent.showExtraBubble().mo172463j(bLiveBubbleConfig);
        }
        C22306c<T> c22306cDuringCreated = duringCreated(ypv.f199493a.m199308D());
        final Function1 function1 = new Function1() { // from class: l.eo40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ho40.m132204i4((Boolean) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.fo40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ho40.m132202g4(function1, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.go40
            @Override // p149l.e30
            public final void call(Object obj) {
                ho40.m132201f4(this.f103652a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        C22306c<T> c22306cDuringCreated = duringCreated(ypv.f199493a.m199304B());
        final Function1 function1 = new Function1() { // from class: l.bo40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ho40.m132203h4(this.f76481a, (Boolean) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.co40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ho40.m132199d4(function1, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.do40
            @Override // p149l.e30
            public final void call(Object obj) {
                ho40.m132200e4(this.f87128a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p149l.gn2
    /* JADX INFO: renamed from: Y3 */
    public void mo127107Y3(boolean show) {
        super.mo127107Y3(show);
        if (show) {
            ((ko40) this.viewModel).m146682v(0.0f, true);
        }
    }

    @Override // p149l.gn2
    /* JADX INFO: renamed from: Z3 */
    public void mo127108Z3(boolean show, int progress) {
        super.mo127108Z3(show, progress);
        if (((ko40) this.viewModel).m146672i().getPageCount() == 0) {
            xdl0.m208344M(((ko40) this.viewModel).getTips(), false);
            return;
        }
        V v2 = this.viewModel;
        if (!show) {
            ((ko40) v2).m146670e(progress / 180.0f);
        } else if (xdl0.m208349O0(((ko40) v2).getTips())) {
            float f = progress;
            ((ko40) this.viewModel).m146682v(f <= 240.0f ? (240.0f - f) / 240.0f : 0.0f, false);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j4 */
    public final View m132205j4(@NotNull String type) {
        type.getClass();
        return ((ko40) this.viewModel).m146671f(type);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m132206k4() {
        return ((ko40) this.viewModel).m146672i().getPageCount() > 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m132207l4(@Nullable BLiveChatTip bLiveChatTip, boolean sendDanmuStyle) {
        this.sendDanmuStyle = sendDanmuStyle;
        ((ko40) this.viewModel).m146679q(bLiveChatTip);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m132208m4() {
        act().startActivity(ypv.f199493a.m199385z0(act(), User.ID_LIVE_VIP_SERVICE, false, false));
        m127106X3();
        zvf0.m220396r("e_live_vip_customer_service", mo77274R2());
    }
}
