package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePrivilegeTopView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.MembershipType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/va90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "u", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/data/Merchandise;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class va90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePrivilegeTopView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final Boolean m200502t(Ref.BooleanRef booleanRef, Ref.IntRef intRef, Merchandise merchandise) {
        merchandise.getClass();
        boolean z = false;
        if (booleanRef.element) {
            if (merchandise.quantity == intRef.element && merchandise.autoRenewable() && merchandise.monthType()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (merchandise.quantity == intRef.element && merchandise.noneRenewable() && merchandise.monthType()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: v */
    public static final void m200503v(va90 va90Var, View view) {
        i4g0.m138520r(va90Var.mo96815h(), va90Var.m214188f());
        i4g0.m138523u("e_purchase_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("productType", "svip"), jyb.m147494Y("discount_type", "svip_rebuy"), jyb.m147494Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        strMo34342Ie.getClass();
        va90Var.m214193o(strMo34342Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m200504w(va90 va90Var, View view) {
        i4g0.m138520r(va90Var.m200506u(), va90Var.m214188f());
        i4g0.m138520r("e_diamond_privilege_entrance", OMSDialogPositon.p_navigation_view);
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        va90Var.m214193o(strMo34318F0);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (dk90.m116230i() || !joa.m146386f4() || joa.m146357G3() || !xzc0.m213720r().m213726E() || !CoreModule.m30933P().m143405a().mo180463f() || !CoreModule.f18264c.f20340Q1.f20859R.m35763N()) {
            return false;
        }
        Merchandise merchandiseM200505s = m200505s();
        this.merchandise = merchandiseM200505s;
        return NullChecker.m82486a(merchandiseM200505s);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        int iM193530c = txq.m193530c(5);
        this._top_view = (PrivilegeEntrancePrivilegeTopView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PRIVILEGE_TOP_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(70));
        layoutParams.leftMargin = iM193530c;
        layoutParams.topMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, txq.m193530c(52));
        layoutParams2.leftMargin = iM193530c;
        layoutParams2.rightMargin = iM193530c;
        layoutParams2.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_svipexpiredodpurchase";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119752s3);
        PrivilegeEntrancePrivilegeTopView privilegeEntrancePrivilegeTopView = this._top_view;
        if (privilegeEntrancePrivilegeTopView != null) {
            privilegeEntrancePrivilegeTopView.get_texture().setImageResource(jbc0.f119836y3);
            privilegeEntrancePrivilegeTopView.get_border().setBackgroundResource(jbc0.f119766t3);
            privilegeEntrancePrivilegeTopView.get_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119794v3));
            privilegeEntrancePrivilegeTopView.get_privilege_icon().setImageResource(jbc0.f119277J8);
            privilegeEntrancePrivilegeTopView.get_privilege_text().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108397u));
            privilegeEntrancePrivilegeTopView.get_privilege_text().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePrivilegeTopView.get_privilege_text().setText(z7a.m218876s0(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("svip"))));
            privilegeEntrancePrivilegeTopView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            VText vText = privilegeEntrancePrivilegeTopView.get_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            NumberFormat numberFormat = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise = this.merchandise;
            String str = numberFormat.format((merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) ? null : Double.valueOf(prices.price));
            Merchandise merchandise2 = this.merchandise;
            vText.setText(String.format("仅需%1$s元 即可恢复%2$s个月会员", Arrays.copyOf(new Object[]{str, merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 2)));
            privilegeEntrancePrivilegeTopView.get_action().setBackgroundResource(jbc0.f119193D8);
            privilegeEntrancePrivilegeTopView.get_action().setTextColor(Color.parseColor("#D35006"));
            privilegeEntrancePrivilegeTopView.get_action().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePrivilegeTopView.get_action().setText("立即恢复");
            bnl0.m105509E0(privilegeEntrancePrivilegeTopView, new View.OnClickListener() { // from class: l.sa90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    va90.m200503v(this.f167019a, view);
                }
            });
            Merchandise merchandise3 = this.merchandise;
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1))), jyb.m147494Y("discount_type", "svip_rebuy"), jyb.m147494Y("productType", "svip"), jyb.m147494Y("membership_status", m214187e()));
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (s7a.m184986o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119712p5);
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108347Q));
                privilegeEntranceODiamondSingleView.get_arrow_right().setImageResource(jbc0.f119768t5);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119696o3);
                uqb0.f180374G.m127138Y0(privilegeEntranceODiamondSingleView.get_texture(), jbc0.f119710p3);
            }
            privilegeEntranceODiamondSingleView.get_title().setTypeface(lyh0.m156283c(3));
            privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
            bnl0.m105524M(privilegeEntranceODiamondSingleView.get_arrow_right(), true);
            bnl0.m105524M(privilegeEntranceODiamondSingleView.get_unlock(), false);
            bnl0.m105509E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.ta90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    va90.m200504w(this.f172706a, view);
                }
            });
            i4g0.m138526x("e_diamond_privilege_entrance", OMSDialogPositon.p_navigation_view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final Merchandise m200505s() {
        Merchandise merchandiseM213744q;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Object objM147529r = null;
        if (xzc0.m213720r().m213723B(MembershipType.get("svip"))) {
            merchandiseM213744q = xzc0.m213720r().m213745s();
            booleanRef.element = false;
        } else if (xzc0.m213720r().m213725D(MembershipType.get("svip"))) {
            merchandiseM213744q = xzc0.m213720r().m213744q();
            booleanRef.element = true;
        } else {
            merchandiseM213744q = null;
        }
        if (merchandiseM213744q != null) {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = merchandiseM213744q.quantity;
            if (TEnum.equals(ProductCategory.get("svip"), merchandiseM213744q.category) && merchandiseM213744q.quarterly()) {
                intRef.element = 6;
            }
            objM147529r = jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(merchandiseM213744q.category), new qcj() { // from class: l.ua90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return va90.m200502t(booleanRef, intRef, (Merchandise) obj);
                }
            });
        }
        return (Merchandise) objM147529r;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m200506u() {
        return "e_privilege_button_svipexpiredodpurchase";
    }
}
