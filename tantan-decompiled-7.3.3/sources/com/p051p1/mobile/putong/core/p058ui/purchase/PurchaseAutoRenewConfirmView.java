package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseAutoRenewConfirmView;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;
import p153l.bn60;
import p153l.bnl0;
import p153l.da5;
import p153l.h9b0;
import p153l.i4g0;
import p153l.l4g0;
import p153l.od0;
import p153l.ur2;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00101\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010=\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u001d¨\u0006>"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/PurchaseAutoRenewConfirmView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/x20;", "confirmClick", "closeClick", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "g", "(Ll/x20;Ll/x20;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Ll/l4g0;", "pageHelper", "f", "(Ll/l4g0;)V", "e", "Lv/VImage;", "a", "Lv/VImage;", "get_close", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "Lv/VText;", "b", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "get_sub_title", "set_sub_title", "_sub_title", "Lv/VButton;", "Lv/VButton;", "get_confirm_button", "()Lv/VButton;", "set_confirm_button", "(Lv/VButton;)V", "_confirm_button", "Ll/l4g0;", "getStatisticsPageHelper", "()Ll/l4g0;", "setStatisticsPageHelper", "statisticsPageHelper", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PurchaseAutoRenewConfirmView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VButton _confirm_button;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.PurchaseAutoRenewConfirmView$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/PurchaseAutoRenewConfirmView$a", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8918a extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_auto_confirm";
        }
    }

    public /* synthetic */ PurchaseAutoRenewConfirmView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m54291a(PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView, x20 x20Var, View view) {
        i4g0.m138520r("e_auto_confirm", "p_auto_confirm");
        purchaseAutoRenewConfirmView.m54296e(purchaseAutoRenewConfirmView.statisticsPageHelper);
        x20Var.call();
    }

    /* JADX INFO: renamed from: b */
    public static void m54292b(PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView, x20 x20Var, View view) {
        i4g0.m138520r("e_auto_close", "p_auto_confirm");
        purchaseAutoRenewConfirmView.m54296e(purchaseAutoRenewConfirmView.statisticsPageHelper);
        x20Var.call();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m54293h(PurchaseAutoRenewConfirmView purchaseAutoRenewConfirmView, x20 x20Var, x20 x20Var2, PurchaseType purchaseType, int i, Object obj) {
        if ((i & 4) != 0) {
            purchaseType = null;
        }
        purchaseAutoRenewConfirmView.m54298g(x20Var, x20Var2, purchaseType);
    }

    /* JADX INFO: renamed from: c */
    public final void m54294c(View view) {
        h9b0.m134044a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m54295d(PurchaseType purchaseType) {
        get_title().setTypeface(Typeface.DEFAULT_BOLD);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("我已阅读并同意%s，确认开通该服务", Arrays.copyOf(new Object[]{"《会员及自动续费协议》"}, 1));
        int iC0 = StringsKt.m94327c0(str, "《会员及自动续费协议》", 0, false, 6, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new da5(bn60.f77437b).m115114c(CoreModule.f18263b.getString(R$string.f27978D6)).m115113b(Color.parseColor("#66000000")), iC0, iC0 + 11, 18);
        get_sub_title().setOnTouchListener(new od0(spannableStringBuilder));
        get_sub_title().setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: e */
    public final void m54296e(l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152776k();
            pageHelper.m152775j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m54297f(l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152774i();
            pageHelper.m152777l();
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: g */
    public final void m54298g(@NotNull final x20 confirmClick, @NotNull final x20 closeClick, @Nullable PurchaseType purchaseType) {
        confirmClick.getClass();
        closeClick.getClass();
        bnl0.m105509E0(get_confirm_button(), new View.OnClickListener() { // from class: l.f9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseAutoRenewConfirmView.m54291a(this.f97852a, confirmClick, view);
            }
        });
        bnl0.m105509E0(get_close(), new View.OnClickListener() { // from class: l.g9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseAutoRenewConfirmView.m54292b(this.f102780a, closeClick, view);
            }
        });
        l4g0 l4g0Var = new l4g0(new C8918a());
        this.statisticsPageHelper = l4g0Var;
        m54297f(l4g0Var);
        m54295d(purchaseType);
    }

    @Nullable
    public final l4g0 getStatisticsPageHelper() {
        return this.statisticsPageHelper;
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    public final VButton get_confirm_button() {
        VButton vButton = this._confirm_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_confirm_button");
        return null;
    }

    @NotNull
    public final VText get_sub_title() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54294c(this);
    }

    public final void setStatisticsPageHelper(@Nullable l4g0 l4g0Var) {
        this.statisticsPageHelper = l4g0Var;
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_confirm_button(@NotNull VButton vButton) {
        vButton.getClass();
        this._confirm_button = vButton;
    }

    public final void set_sub_title(@NotNull VText vText) {
        vText.getClass();
        this._sub_title = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseAutoRenewConfirmView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseAutoRenewConfirmView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseAutoRenewConfirmView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
