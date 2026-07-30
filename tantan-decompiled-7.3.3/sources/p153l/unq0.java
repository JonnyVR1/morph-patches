package p153l;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00100\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'R\"\u00104\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m88121d2 = {"Ll/unq0;", "Ll/pej0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "F", "(Landroid/view/View;)V", "M", "()V", BloodType.f39576O, "G", "show", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", SysnotifListener.ACTION_DISMISS, "onDetachedFromWindow", "P", "f", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "g", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "H", "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", RXScreenCaptureService.KEY_INDEX, "J", "set_stickers", "_stickers", "j", "K", "set_subtitle", "_subtitle", "k", "L", "set_title", "_title", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VDraweeView;", "I", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Ll/l4g0;", "m", "Ll/l4g0;", "pageHelper", "Ll/kcg0;", "n", "Ll/kcg0;", "merchandiseSubs", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "o", "Ljava/text/NumberFormat;", "numberFormat", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class unq0 extends pej0 {

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
    public l4g0 pageHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public kcg0 merchandiseSubs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final NumberFormat numberFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unq0(@NotNull Act act, @Nullable String str) {
        super(act);
        act.getClass();
        this.act = act;
        this.from = str;
        l4g0 l4g0VarM204399c = w1e.m204399c("p_youthvip_guide_pop", unq0.class.getName());
        l4g0VarM204399c.getClass();
        this.pageHelper = l4g0VarM204399c;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: A */
    public static void m196888A(unq0 unq0Var, List list) {
        list.getClass();
        Merchandise merchandise = (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.tnq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return unq0.m196894N((Merchandise) obj);
            }
        });
        if (merchandise != null) {
            Prices prices = merchandise.defaultStockKeepUnit.prices;
            double d = prices.price;
            double d2 = prices.originalUnitPrice;
            unq0Var.m196903K().setText("新增为年轻用户定制功能，畅享劲爽社交体验！原价¥" + unq0Var.numberFormat.format(d2) + "/周，限时特惠，只需¥" + unq0Var.numberFormat.format(d));
            unq0Var.m196900H().setText(merchandise.defaultStockKeepUnit.prices.currencySymbol + unq0Var.numberFormat.format(d) + "/周购买");
        }
    }

    /* JADX INFO: renamed from: C */
    public static Boolean m196889C(List list) {
        list.getClass();
        return Boolean.valueOf(!list.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public static void m196890D(unq0 unq0Var) {
        Window window = unq0Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(dgc0.f88280e);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m196891E(unq0 unq0Var) {
        super.dismiss();
    }

    /* JADX INFO: renamed from: G */
    private final void m196892G() {
        Window window = getWindow();
        if (window != null) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(fdc0.f98450y);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.getClass();
            frameLayout.setBackgroundResource(jbc0.f119585g4);
            bottomSheetBehaviorFrom.setState(3);
        }
        l51.m152887G(new Runnable() { // from class: l.snq0
            @Override // java.lang.Runnable
            public final void run() {
                unq0.m196890D(this.f169751a);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    private final void m196893M() {
        C22421c c22421cDuringCreated = this.act.duringCreated(CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("youthVip")));
        final Function1 function1 = new Function1() { // from class: l.pnq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return unq0.m196889C((List) obj);
            }
        };
        this.merchandiseSubs = c22421cDuringCreated.filter(new qcj() { // from class: l.qnq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return unq0.m196898z(function1, obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.rnq0
            @Override // p153l.y20
            public final void call(Object obj) {
                unq0.m196888A(this.f164095a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N */
    public static final Boolean m196894N(Merchandise merchandise) {
        boolean z = false;
        if (!s7a.m184996y() ? !(!merchandise.noneRenewable() || !merchandise.weekly()) : !(!merchandise.autoRenewable() || !merchandise.weekly())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: O */
    private final void m196895O() {
        uqb0.f180374G.m127115L0(m196901I(), "https://auto.tancdn.com/v1/images/eyJpZCI6IlRQSVQ2NjJGWlRaN1pCMkpGQVJSRk03V0VLNDJWTDE0IiwidyI6NjYwLCJoIjo2NjMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjc5OTY5NTI5Nzk5NjQwODgwfQ.png?format=originalOFGHLERTH");
        m196904L().setText("全新 · 青春专享会员");
        m196903K().setText("新增为年轻用户定制功能，畅享劲爽社交体验！限时特惠");
        if (s7a.m184996y()) {
            m196900H().setText("成为青春专享会员");
        } else {
            m196900H().setText("¥1/周购买");
        }
        m196900H().setBackgroundResource(jbc0.f119830xb);
        m196902J().setText("限时特惠");
        m196902J().setBackgroundResource(jbc0.f119196Db);
        bnl0.m105524M(m196902J(), true);
        bnl0.m105509E0(m196900H(), new View.OnClickListener() { // from class: l.nnq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                unq0.m196896x(this.f142820a, view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static void m196896x(unq0 unq0Var, View view) {
        unq0Var.dismiss();
        i4g0.m138520r("e_youthvip_guide_button", "p_youthvip_guide_pop");
        C8927c.m54609S0(unq0Var.act, "p_home,youthvip_guide", null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: z */
    public static Boolean m196898z(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public final void m196899F(View view) {
        vnq0.m202004a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final TextView m196900H() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VDraweeView m196901I() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final TextView m196902J() {
        TextView textView = this._stickers;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_stickers");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final TextView m196903K() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m196904L() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m196905P() {
        psd0.m173633z(this.merchandiseSubs);
        this.merchandiseSubs = null;
    }

    @Override // p153l.pej0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(dgc0.f88276a);
        }
        l51.m152887G(new Runnable() { // from class: l.onq0
            @Override // java.lang.Runnable
            public final void run() {
                unq0.m196891E(this.f148119a);
            }
        });
        w1e.m204401e(this.pageHelper);
        m196905P();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewInflate = LayoutInflater.from(getContext()).inflate(rec0.f162444G2, (ViewGroup) null);
        viewInflate.getClass();
        m196899F(viewInflate);
        setContentView(viewInflate);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        m196895O();
        m196893M();
    }

    @Override // p153l.pej0, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m196905P();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m196892G();
        w1e.m204402f(this.pageHelper);
    }
}
