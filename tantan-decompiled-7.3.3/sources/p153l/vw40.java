package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0010R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u0017¨\u0006("}, m88121d2 = {"Ll/vw40;", "Ll/oo2;", "D", "Ll/nn2;", "Ll/yw40;", "Ll/dum;", BaseSei.INFO, "Landroid/widget/LinearLayout;", "tips", "<init>", "(Ll/dum;Landroid/widget/LinearLayout;)V", "", "k4", "()Z", "", "m4", "()V", "show", "", "progress", "Z3", "(ZI)V", "Y3", "(Z)V", p7f.GPS_DIRECTION_TRUE, "Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;", "bLiveChatTip", "sendDanmuStyle", "l4", "(Lcom/p1/mobile/putong/live/base/data/BLiveChatTip;Z)V", "", "type", "Landroid/view/View;", "j4", "(Ljava/lang/String;)Landroid/view/View;", "P3", "j", "Z", "getSendDanmuStyle", "setSendDanmuStyle", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vw40<D extends oo2> extends nn2<D, yw40> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean sendDanmuStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw40(@NotNull dum<D> dumVar, @NotNull LinearLayout linearLayout) {
        super(dumVar);
        dumVar.getClass();
        linearLayout.getClass();
        mo52715C(new yw40(linearLayout));
    }

    /* JADX INFO: renamed from: d4 */
    public static Boolean m203055d4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m203056e4(vw40 vw40Var, boolean z) {
        if (z) {
            ((yw40) vw40Var.viewModel).m217579w();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public static void m203057f4(vw40 vw40Var, boolean z) {
        ((yw40) vw40Var.viewModel).m217580x(z);
    }

    /* JADX INFO: renamed from: g4 */
    public static Boolean m203058g4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: h4 */
    public static Boolean m203059h4(vw40 vw40Var, Boolean bool) {
        return Boolean.valueOf(!vw40Var.m213810E2().mo118373p());
    }

    /* JADX INFO: renamed from: i4 */
    public static Boolean m203060i4(Boolean bool) {
        return Boolean.valueOf(bool != null);
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        if (((yw40) this.viewModel).m217574p()) {
            BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
            bLiveBubbleConfig.type = "vipServiceBubble";
            bLiveBubbleConfig.f45188id = "-2";
            bLiveBubbleConfig.bubbleTextList = jyb.m147482M(zrv.f205803e.getString(R$string.f47955Ze));
            bLiveBubbleConfig.bubbleStartColor = "FF8817";
            bLiveBubbleConfig.bubbleEndColor = "FF8817";
            bLiveBubbleConfig.bubbleDisappear = 3;
            m213811F2().BootBubbleEvent.showExtraBubble().mo199273j(bLiveBubbleConfig);
        }
        C22421c<T> c22421cDuringCreated = duringCreated(zrv.f205799a.m207630D());
        final Function1 function1 = new Function1() { // from class: l.sw40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vw40.m203060i4((Boolean) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.tw40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vw40.m203058g4(function1, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.uw40
            @Override // p153l.y20
            public final void call(Object obj) {
                vw40.m203057f4(this.f181234a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        C22421c<T> c22421cDuringCreated = duringCreated(zrv.f205799a.m207626B());
        final Function1 function1 = new Function1() { // from class: l.pw40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vw40.m203059h4(this.f154370a, (Boolean) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.qw40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vw40.m203055d4(function1, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.rw40
            @Override // p153l.y20
            public final void call(Object obj) {
                vw40.m203056e4(this.f165104a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // p153l.nn2
    /* JADX INFO: renamed from: Y3 */
    public void mo95792Y3(boolean show) {
        super.mo95792Y3(show);
        if (show) {
            ((yw40) this.viewModel).m217578v(0.0f, true);
        }
    }

    @Override // p153l.nn2
    /* JADX INFO: renamed from: Z3 */
    public void mo95793Z3(boolean show, int progress) {
        super.mo95793Z3(show, progress);
        if (((yw40) this.viewModel).m217568i().getPageCount() == 0) {
            bnl0.m105524M(((yw40) this.viewModel).getTips(), false);
            return;
        }
        V v2 = this.viewModel;
        if (!show) {
            ((yw40) v2).m217566e(progress / 180.0f);
        } else if (bnl0.m105529O0(((yw40) v2).getTips())) {
            float f = progress;
            ((yw40) this.viewModel).m217578v(f <= 240.0f ? (240.0f - f) / 240.0f : 0.0f, false);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j4 */
    public final View m203061j4(@NotNull String type) {
        type.getClass();
        return ((yw40) this.viewModel).m217567f(type);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m203062k4() {
        return ((yw40) this.viewModel).m217568i().getPageCount() > 0;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m203063l4(@Nullable BLiveChatTip bLiveChatTip, boolean sendDanmuStyle) {
        this.sendDanmuStyle = sendDanmuStyle;
        ((yw40) this.viewModel).m217575q(bLiveChatTip);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m203064m4() {
        act().startActivity(zrv.f205799a.m207707z0(act(), User.ID_LIVE_VIP_SERVICE, false, false));
        m163852X3();
        i4g0.m138520r("e_live_vip_customer_service", mo78457R2());
    }
}
