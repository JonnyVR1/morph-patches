package p003l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.Prices;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.StockKeepUnit;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePrivilegeTopView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.MembershipType;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import l.a5;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.g6a;
import l.j760;
import l.n6a;
import l.qib0;
import l.src0;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ll/p490;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "s", "()Lcom/p1/mobile/putong/core/data/Merchandise;", "", "a", "()Z", "", "b", "()V", "m", "", "u", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class p490 extends a5 {

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
    public p490(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final Merchandise m8693s() {
        final Merchandise merchandiseQ;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (src0.r().B(MembershipType.get("vip"))) {
            merchandiseQ = src0.r().s();
            booleanRef.element = false;
        } else if (src0.r().D(MembershipType.get("vip"))) {
            merchandiseQ = src0.r().q();
            booleanRef.element = true;
        } else {
            merchandiseQ = null;
        }
        return (Merchandise) (merchandiseQ != null ? vwb.r(CoreModule.c.j0.D5(merchandiseQ.category), new w9j() { // from class: l.m490
            public final Object call(Object obj) {
                return p490.m8694t(booleanRef, merchandiseQ, (Merchandise) obj);
            }
        }) : null);
    }

    /* JADX INFO: renamed from: t */
    public static final Boolean m8694t(Ref.BooleanRef booleanRef, Merchandise merchandise, Merchandise merchandise2) {
        merchandise2.getClass();
        boolean z = false;
        if (booleanRef.element) {
            if (merchandise2.quantity == merchandise.quantity && merchandise2.autoRenewable() && merchandise2.monthType()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (merchandise2.quantity == merchandise.quantity && merchandise2.noneRenewable() && merchandise2.monthType()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: v */
    public static final void m8695v(p490 p490Var, View view) {
        zvf0.r(p490Var.m8699h(), p490Var.f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("productType", "vip"), vwb.Y("discount_type", "vip_rebuy"), vwb.Y("purchaseShowFrom", "p_navigation,privilege_button")});
        String strY3 = CoreModule.P().a().Y3();
        strY3.getClass();
        p490Var.o(strY3);
    }

    /* JADX INFO: renamed from: w */
    public static final void m8696w(p490 p490Var, View view) {
        zvf0.r(p490Var.m8701u(), p490Var.f());
        zvf0.r("e_diamond_privilege_entrance", "p_navigation_view");
        String strF0 = CoreModule.P().a().F0();
        strF0.getClass();
        p490Var.o(strF0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m8697a() {
        if (!CoreModule.P().a().f() || !CoreModule.c.Q1.R.N() || !CoreModule.c.e0.p9().isVIPExpired() || xma.f4() || xma.F3() || !src0.r().E()) {
            return false;
        }
        Merchandise merchandiseM8693s = m8693s();
        this.merchandise = merchandiseM8693s;
        return NullChecker.a(merchandiseM8693s);
    }

    /* JADX INFO: renamed from: b */
    public void m8698b() {
        g().getNumberFormat().setMaximumFractionDigits(1);
        int iC = svq.c(5);
        this._top_view = (PrivilegeEntrancePrivilegeTopView) i(g().getAct(), g().getRoot(), PrivilegeViewType.PRIVILEGE_TOP_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(70));
        layoutParams.leftMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.bottomMargin = iC;
        g().getRoot().addView((View) this._top_view, (ViewGroup.LayoutParams) layoutParams);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) i(g().getAct(), g().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(52));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        g().getRoot().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams2);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m8699h() {
        return "e_privilege_banner_vipexpiredodpurchase";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePrivilegeTopView] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceODiamondSingleView] */
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
    public void m8700m() {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        super.m();
        g().getRoot().setBackgroundResource(d3c0.C3);
        ?? r0 = this._top_view;
        if (r0 != 0) {
            r0.get_texture().setImageResource(d3c0.z3);
            r0.get_border().setBackgroundResource(d3c0.D3);
            r0.get_icon_svga().setImageDrawable(g().getAct().drawable(d3c0.F3));
            r0.get_privilege_icon().setImageResource(d3c0.Ra);
            r0.get_privilege_text().setTextColor(Color.parseColor("#9D5C36"));
            r0.get_privilege_text().setTypeface(eqh0.c(3));
            r0.get_privilege_text().setText(n6a.s0(CoreModule.c.C0.w4(SummarizedPrivilegesId.get("vip"))));
            r0.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            VText vText = r0.get_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            NumberFormat numberFormat = g().getNumberFormat();
            Merchandise merchandise = this.merchandise;
            String str = numberFormat.format((merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) ? null : Double.valueOf(prices.price));
            Merchandise merchandise2 = this.merchandise;
            vText.setText(String.format("仅需%1$s元 即可恢复%2$s个月会员", Arrays.copyOf(new Object[]{str, merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 2)));
            r0.get_action().setTextColor(Color.parseColor("#9B4918"));
            r0.get_action().setTypeface(eqh0.c(3));
            r0.get_action().setBackgroundResource(d3c0.E3);
            r0.get_action().setText("立即恢复");
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.n490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p490.m8695v(this.f6477a, view);
                }
            });
            Merchandise merchandise3 = this.merchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", String.format("%sm", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1))), vwb.Y("discount_type", "vip_rebuy"), vwb.Y("productType", "vip"), vwb.Y("membership_status", e())});
        }
        ?? r1 = this._bottom_view;
        if (r1 != 0) {
            if (g6a.o()) {
                r1.setBackgroundResource(d3c0.p5);
                xdl0.M(r1.get_texture(), false);
                r1.get_title().setTextColor(g().getAct().color(b1c0.Q));
                r1.get_arrow_right().setImageResource(d3c0.t5);
            } else {
                r1.setBackgroundResource(d3c0.o3);
                qib0.G.Y0(r1.get_texture(), d3c0.p3);
            }
            r1.get_title().setTypeface(eqh0.c(3));
            r1.get_title().setText("解锁黑金会员，尊享全平台权益!");
            xdl0.M(r1.get_arrow_right(), true);
            xdl0.M(r1.get_unlock(), false);
            xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.o490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p490.m8696w(this.f6596a, view);
                }
            });
            zvf0.x("e_diamond_privilege_entrance", "p_navigation_view");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m8701u() {
        return "e_privilege_button_vipexpiredodpurchase";
    }
}
