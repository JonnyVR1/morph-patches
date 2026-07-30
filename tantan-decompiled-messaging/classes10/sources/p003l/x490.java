package p003l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.RefundDetail;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.a5;
import l.d3c0;
import l.eqh0;
import l.j760;
import l.src0;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xma;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 *2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Ll/x490;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "", "refund", "t", "(Ljava/util/List;J)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "quantity", "s", "(Ljava/util/List;IJ)Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "J", "vipUpgradeSVIPRefundAmount", "g", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class x490 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long vipUpgradeSVIPRefundAmount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x490(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m10622p(int i, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.quantity == i && merchandise.monthType() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: v */
    public static final void m10625v(x490 x490Var, View view) {
        zvf0.r(x490Var.m10629h(), x490Var.f());
        String strY3 = CoreModule.P().a().Y3();
        strY3.getClass();
        x490Var.o(strY3);
    }

    /* JADX INFO: renamed from: w */
    public static final void m10626w(x490 x490Var, View view) {
        zvf0.r(x490Var.m10633u(), x490Var.f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("productType", "svip"), vwb.Y("discount_type", "svip_upgrade"), vwb.Y("purchaseShowFrom", "p_navigation,privilege_button")});
        String strIe = CoreModule.P().a().Ie();
        strIe.getClass();
        x490Var.o(strIe);
    }

    /* JADX INFO: renamed from: a */
    public boolean m10627a() {
        if (zb90.i() && xma.e4()) {
            Optional optional = (Optional) CoreModule.c.j0.J4().e();
            if (NullChecker.a(optional) && optional.isPresent()) {
                RefundDetail refundDetail = (RefundDetail) optional.get();
                if (NullChecker.a(refundDetail) && Math.floor(refundDetail.totalRefundAmount) >= 1.0d) {
                    List<? extends Merchandise> listD5 = CoreModule.c.j0.D5(ProductCategory.get("svip"));
                    long jFloor = (long) Math.floor(refundDetail.totalRefundAmount);
                    this.vipUpgradeSVIPRefundAmount = jFloor;
                    Merchandise merchandiseM10632t = m10632t(listD5, jFloor);
                    this.merchandise = merchandiseM10632t;
                    if (NullChecker.a(merchandiseM10632t) && this.vipUpgradeSVIPRefundAmount > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m10628b() {
        g().getNumberFormat().setMaximumFractionDigits(1);
        this._top_view = (PrivilegeEntranceSingleTextWithIconBgView) i(g().getAct(), g().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        int iC = svq.c(5);
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        g().getRoot().addView((View) this._top_view, (ViewGroup.LayoutParams) layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) i(g().getAct(), g().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        g().getRoot().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams2);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m10629h() {
        return "e_privilege_banner_vipupgradesvip";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public void m10630m() {
        String str;
        String str2;
        super.m();
        g().getRoot().setBackgroundResource(d3c0.Da);
        ?? r0 = this._top_view;
        if (r0 != 0) {
            r0.setBackgroundResource(d3c0.D3);
            r0.get_texture().setImageResource(d3c0.B3);
            r0.get_privilege_icon_simple().setImageResource(d3c0.j6);
            r0.get_privilege_icon().setImageResource(d3c0.l6);
            String strF = zb90.f();
            boolean zN = src0.r().N();
            boolean zY = src0.r().y();
            if (zN && zY) {
                strF = CoreModule.P().a().c7();
            }
            r0.get_desc().setText(strF);
            r0.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            r0.get_go().setImageResource(d3c0.va);
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.u490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x490.m10625v(this.f7666a, view);
                }
            });
        }
        ?? r1 = this._bottom_view;
        if (r1 != 0) {
            r1.setBackgroundResource(d3c0.Ga);
            r1.get_promotion_desc_left().setTypeface(eqh0.c(3));
            r1.get_promotion_desc_left().setTextColor(Color.parseColor("#9D5C36"));
            r1.get_promotion_desc_left().setText("升级");
            xdl0.M(r1.get_promotion_desc_left(), true);
            r1.get_promotion_icon().setImageResource(d3c0.Ba);
            r1.get_promotion_desc().setTypeface(eqh0.c(3));
            r1.get_promotion_desc().setTextColor(Color.parseColor("#9D5C36"));
            VText vText = r1.get_promotion_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText.setText(String.format("抵扣%s元", Arrays.copyOf(new Object[]{g().getNumberFormat().format(this.vipUpgradeSVIPRefundAmount)}, 1)));
            r1.get_promotion_tip().setBackground(g().getAct().drawable(d3c0.Fa));
            r1.get_promotion_tip().setText("限时立减");
            xdl0.M(r1.get_promotion_tip(), true);
            r1.get_buy_tip().setTextColor(Color.parseColor("#E69D5C36"));
            TextView textView = r1.get_buy_tip();
            Merchandise merchandise = this.merchandise;
            if (merchandise != null) {
                if (merchandise.quarterly()) {
                    str2 = "首季会员仅需%s元";
                } else {
                    str2 = merchandise.yearly() ? "首年会员仅需%s元" : "首月会员仅需%s元";
                }
                str = String.format(str2, Arrays.copyOf(new Object[]{g().getNumberFormat().format(merchandise.defaultStockKeepUnit.prices.price - this.vipUpgradeSVIPRefundAmount)}, 1));
            } else {
                str = null;
            }
            textView.setText(str);
            r1.get_goto_buy().setBackgroundResource(d3c0.E3);
            r1.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            r1.get_goto_buy().setTypeface(eqh0.c(3));
            r1.get_goto_buy().setText("立即升级");
            xdl0.E0(r1.get_goto_buy(), new View.OnClickListener() { // from class: l.v490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x490.m10626w(this.f7863a, view);
                }
            });
            Merchandise merchandise2 = this.merchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", String.format("%sm", Arrays.copyOf(new Object[]{merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 1))), vwb.Y("discount_type", "svip_upgrade"), vwb.Y("productType", "svip"), vwb.Y("membership_status", e())});
        }
    }

    /* JADX INFO: renamed from: s */
    public final Merchandise m10631s(List<? extends Merchandise> merchandises, final int quantity, long refund) {
        Merchandise merchandise = (Merchandise) vwb.r(merchandises, new w9j() { // from class: l.w490
            public final Object call(Object obj) {
                return x490.m10622p(quantity, (Merchandise) obj);
            }
        });
        if (!NullChecker.a(merchandise) || ((long) (merchandise.defaultStockKeepUnit.prices.price - refund)) <= 0) {
            return null;
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: t */
    public final Merchandise m10632t(List<? extends Merchandise> merchandises, long refund) {
        Merchandise merchandiseM10631s = m10631s(merchandises, 1, refund);
        if (NullChecker.a(merchandiseM10631s)) {
            return merchandiseM10631s;
        }
        Merchandise merchandiseM10631s2 = m10631s(merchandises, 3, refund);
        if (NullChecker.a(merchandiseM10631s2)) {
            return merchandiseM10631s2;
        }
        Merchandise merchandiseM10631s3 = m10631s(merchandises, 12, refund);
        if (NullChecker.a(merchandiseM10631s3)) {
            return merchandiseM10631s3;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m10633u() {
        return "e_privilege_button_vipupgradesvip";
    }
}
