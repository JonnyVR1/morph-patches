package p149l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00100\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\"\u00104\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m87232d2 = {"Ll/peq0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "F", "(Landroid/view/View;)V", "M", "()V", BloodType.f38728O, "G", "show", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", SysnotifListener.ACTION_DISMISS, "onDetachedFromWindow", "P", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "g", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "H", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", RXScreenCaptureService.KEY_INDEX, "J", "set_stickers", "_stickers", "j", "K", "set_subtitle", "_subtitle", "k", "L", "set_title", "_title", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VDraweeView;", "I", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Ll/cwf0;", "m", "Ll/cwf0;", "pageHelper", "Ll/c4g0;", "n", "Ll/c4g0;", "merchandiseSubs", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "o", "Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class peq0 extends l5j0 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _stickers;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public cwf0 pageHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public c4g0 merchandiseSubs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final NumberFormat numberFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peq0(@NotNull Act act, @Nullable String str) {
        super(act);
        act.getClass();
        this.act = act;
        this.from = str;
        cwf0 cwf0VarM133794c = i0e.m133794c("p_youthvip_guide_pop", peq0.class.getName());
        cwf0VarM133794c.getClass();
        this.pageHelper = cwf0VarM133794c;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: A */
    public static void m168525A(peq0 peq0Var, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.oeq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return peq0.m168531N((Merchandise) obj);
            }
        });
        if (merchandise != null) {
            Prices prices = merchandise.defaultStockKeepUnit.prices;
            double d = prices.price;
            double d2 = prices.originalUnitPrice;
            peq0Var.m168540K().setText("新增为年轻用户定制功能，畅享劲爽社交体验！原价¥" + peq0Var.numberFormat.format(d2) + "/周，限时特惠，只需¥" + peq0Var.numberFormat.format(d));
            peq0Var.m168537H().setText(merchandise.defaultStockKeepUnit.prices.currencySymbol + peq0Var.numberFormat.format(d) + "/周购买");
        }
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m168526C(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public static void m168527D(peq0 peq0Var) {
        Window window = peq0Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.f196695e);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m168528E(peq0 peq0Var) {
        super.dismiss();
    }

    /* JADX INFO: renamed from: G */
    private final void m168529G() {
        Window window = getWindow();
        if (window != null) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.f201574y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(d3c0.f83930g4);
            bottomSheetBehaviorFrom.setState(3);
        }
        e51.m114742G(new Runnable() { // from class: l.neq0
            @Override // java.lang.Runnable
            public final void run() {
                peq0.m168527D(this.f138643a);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    private final void m168530M() {
        C22306c c22306cDuringCreated = this.act.duringCreated(CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("youthVip")));
        final Function1 function1 = new Function1() { // from class: l.keq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return peq0.m168526C((List) obj);
            }
        };
        this.merchandiseSubs = c22306cDuringCreated.filter(new w9j() { // from class: l.leq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return peq0.m168535z(function1, obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.meq0
            @Override // p149l.e30
            public final void call(Object obj) {
                peq0.m168525A(this.f133478a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static final Boolean m168531N(Merchandise merchandise) {
        boolean z = false;
        if (!g6a.m124576y() ? !(!merchandise.noneRenewable() || !merchandise.weekly()) : !(!merchandise.autoRenewable() || !merchandise.weekly())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: O */
    private final void m168532O() {
        qib0.f154691G.m102331L0(m168538I(), "https://auto.tancdn.com/v1/images/eyJpZCI6IlRQSVQ2NjJGWlRaN1pCMkpGQVJSRk03V0VLNDJWTDE0IiwidyI6NjYwLCJoIjo2NjMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjc5OTY5NTI5Nzk5NjQwODgwfQ.png?format=originalOFGHLERTH");
        m168541L().setText("全新 · 青春专享会员");
        m168540K().setText("新增为年轻用户定制功能，畅享劲爽社交体验！限时特惠");
        if (g6a.m124576y()) {
            m168537H().setText("成为青春专享会员");
        } else {
            m168537H().setText("¥1/周购买");
        }
        m168537H().setBackgroundResource(d3c0.f84175xb);
        m168539J().setText("限时特惠");
        m168539J().setBackgroundResource(d3c0.f83541Db);
        xdl0.m208344M(m168539J(), true);
        xdl0.m208329E0(m168537H(), new View.OnClickListener() { // from class: l.ieq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                peq0.m168533x(this.f112821a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static void m168533x(peq0 peq0Var, View view) {
        peq0Var.dismiss();
        zvf0.m220396r("e_youthvip_guide_button", "p_youthvip_guide_pop");
        C8764c.m53426S0(peq0Var.act, "p_home,youthvip_guide", null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: z */
    public static Boolean m168535z(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public final void m168536F(View view) {
        qeq0.m174229a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TextView m168537H() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VDraweeView m168538I() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final TextView m168539J() {
        TextView textView = this._stickers;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_stickers");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final TextView m168540K() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m168541L() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m168542P() {
        mkd0.m154992z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    @Override // p149l.l5j0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.f196691a);
        }
        e51.m114742G(new Runnable() { // from class: l.jeq0
            @Override // java.lang.Runnable
            public final void run() {
                peq0.m168528E(this.f117597a);
            }
        });
        i0e.m133796e(this.pageHelper);
        m168542P();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewInflate = LayoutInflater.from(getContext()).inflate(m6c0.f131484G2, (ViewGroup) null);
        viewInflate.getClass();
        m168536F(viewInflate);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        m168532O();
        m168530M();
    }

    @Override // p149l.l5j0, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m168542P();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m168529G();
        i0e.m133797f(this.pageHelper);
    }
}
