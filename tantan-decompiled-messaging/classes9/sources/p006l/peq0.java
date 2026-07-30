package p006l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.e51;
import l.i0e;
import l.l5j0;
import l.m6c0;
import l.mkd0;
import l.qeq0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y7c0;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00100\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\"\u00104\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Ll/peq0;", "Ll/l5j0;", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Landroid/view/View;", "view", "", "F", "(Landroid/view/View;)V", "M", "()V", "O", "G", "show", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "dismiss", "onDetachedFromWindow", "P", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "g", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "H", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "i", "J", "set_stickers", "_stickers", "j", "K", "set_subtitle", "_subtitle", "k", "L", "set_title", "_title", "Lv/VDraweeView;", "l", "Lv/VDraweeView;", "I", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Ll/cwf0;", "m", "Ll/cwf0;", "pageHelper", "Ll/c4g0;", "n", "Ll/c4g0;", "merchandiseSubs", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "o", "Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        cwf0 cwf0VarC = i0e.c("p_youthvip_guide_pop", peq0.class.getName());
        cwf0VarC.getClass();
        this.pageHelper = cwf0VarC;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: A */
    public static void m21085A(peq0 peq0Var, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) vwb.r(list, new w9j() { // from class: l.oeq0
            public final Object call(Object obj) {
                return peq0.m21091N((Merchandise) obj);
            }
        });
        if (merchandise != null) {
            Prices prices = merchandise.defaultStockKeepUnit.prices;
            double d = prices.price;
            double d2 = prices.originalUnitPrice;
            peq0Var.m21100K().setText("新增为年轻用户定制功能，畅享劲爽社交体验！原价¥" + peq0Var.numberFormat.format(d2) + "/周，限时特惠，只需¥" + peq0Var.numberFormat.format(d));
            peq0Var.m21097H().setText(merchandise.defaultStockKeepUnit.prices.currencySymbol + peq0Var.numberFormat.format(d) + "/周购买");
        }
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m21086C(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static void m21087D(peq0 peq0Var) {
        Window window = peq0Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.e);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m21088E(peq0 peq0Var) {
        super.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private final void m21089G() {
        Window window = getWindow();
        if (window != null) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(d3c0.g4);
            bottomSheetBehaviorFrom.setState(3);
        }
        e51.G(new Runnable() { // from class: l.neq0
            @Override // java.lang.Runnable
            public final void run() {
                peq0.m21087D(this.f17635a);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    private final void m21090M() {
        c cVarDuringCreated = this.act.duringCreated(CoreModule.f1534c.f3643j0.m2572y5(ProductCategory.get("youthVip")));
        final Function1 function1 = new Function1() { // from class: l.keq0
            public final Object invoke(Object obj) {
                return peq0.m21086C((List) obj);
            }
        };
        this.merchandiseSubs = cVarDuringCreated.filter(new w9j() { // from class: l.leq0
            public final Object call(Object obj) {
                return peq0.m21095z(function1, obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.meq0
            public final void call(Object obj) {
                peq0.m21085A(this.f16944a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static final Boolean m21091N(Merchandise merchandise) {
        boolean z = false;
        if (!g6a.m15602y() ? !(!merchandise.noneRenewable() || !merchandise.weekly()) : !(!merchandise.autoRenewable() || !merchandise.weekly())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: O */
    private final void m21092O() {
        qib0.f19782G.m12744L0(m21098I(), "https://auto.tancdn.com/v1/images/eyJpZCI6IlRQSVQ2NjJGWlRaN1pCMkpGQVJSRk03V0VLNDJWTDE0IiwidyI6NjYwLCJoIjo2NjMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjc5OTY5NTI5Nzk5NjQwODgwfQ.png?format=originalOFGHLERTH");
        m21101L().setText("全新 · 青春专享会员");
        m21100K().setText("新增为年轻用户定制功能，畅享劲爽社交体验！限时特惠");
        if (g6a.m15602y()) {
            m21097H().setText("成为青春专享会员");
        } else {
            m21097H().setText("¥1/周购买");
        }
        m21097H().setBackgroundResource(d3c0.xb);
        m21099J().setText("限时特惠");
        m21099J().setBackgroundResource(d3c0.Db);
        xdl0.M(m21099J(), true);
        xdl0.E0(m21097H(), new View.OnClickListener() { // from class: l.ieq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                peq0.m21093x(this.f14414a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static void m21093x(peq0 peq0Var, View view) {
        peq0Var.dismiss();
        zvf0.r("e_youthvip_guide_button", "p_youthvip_guide_pop");
        com.p1.mobile.putong.core.ui.purchase.c.S0(peq0Var.act, "p_home,youthvip_guide", (Privilege) null, (e30) null, (d30) null, (d30) null, (d30) null, 124, (Object) null);
    }

    /* JADX INFO: renamed from: z */
    public static Boolean m21095z(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public final void m21096F(View view) {
        qeq0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TextView m21097H() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VDraweeView m21098I() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final TextView m21099J() {
        TextView textView = this._stickers;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_stickers");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final TextView m21100K() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m21101L() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m21102P() {
        mkd0.z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(y7c0.a);
        }
        e51.G(new Runnable() { // from class: l.jeq0
            @Override // java.lang.Runnable
            public final void run() {
                peq0.m21088E(this.f15129a);
            }
        });
        i0e.e(this.pageHelper);
        m21102P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(savedInstanceState);
        View viewInflate = LayoutInflater.from(getContext()).inflate(m6c0.G2, (ViewGroup) null);
        viewInflate.getClass();
        m21096F(viewInflate);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        m21092O();
        m21090M();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m21102P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m21089G();
        i0e.f(this.pageHelper);
    }
}
