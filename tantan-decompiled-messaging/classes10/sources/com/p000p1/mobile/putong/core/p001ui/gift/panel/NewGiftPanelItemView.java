package com.p000p1.mobile.putong.core.p001ui.gift.panel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.lsi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.c3c0;
import p003l.hr20;
import p003l.rr20;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewGiftPanelItemView extends ConstraintLayout implements Checkable {

    /* JADX INFO: renamed from: d */
    public View f1665d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1666e;

    /* JADX INFO: renamed from: f */
    public VText f1667f;

    /* JADX INFO: renamed from: g */
    public TextView f1668g;

    /* JADX INFO: renamed from: h */
    public VLinear f1669h;

    /* JADX INFO: renamed from: i */
    public VText f1670i;

    /* JADX INFO: renamed from: j */
    public VText f1671j;

    /* JADX INFO: renamed from: k */
    public VText f1672k;

    /* JADX INFO: renamed from: l */
    public VText f1673l;

    /* JADX INFO: renamed from: m */
    public View f1674m;

    /* JADX INFO: renamed from: n */
    public CoreGiftInfo f1675n;

    /* JADX INFO: renamed from: o */
    public rr20 f1676o;

    /* JADX INFO: renamed from: p */
    public boolean f1677p;

    /* JADX INFO: renamed from: q */
    public final float f1678q;

    public NewGiftPanelItemView(Context context) {
        super(context);
        this.f1677p = false;
        this.f1678q = t100.d(13.0f);
    }

    /* JADX INFO: renamed from: k0 */
    private boolean m2869k0() {
        return NullChecker.a(this.f1675n.extra.style) && NullChecker.a(this.f1675n.extra.style.tag) && !TextUtils.isEmpty(this.f1675n.extra.style.tag.text);
    }

    /* JADX INFO: renamed from: o0 */
    private void m2870o0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1666e.getLayoutParams();
        marginLayoutParams.topMargin = t100.d(13.0f);
        int i = t100.K;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        xdl0.M(this.f1667f, false);
        xdl0.M(this.f1668g, false);
        xdl0.M(this.f1669h, true);
        xdl0.M(this.f1665d, false);
        boolean zM2869k0 = m2869k0();
        VText vText = this.f1673l;
        if (zM2869k0) {
            xdl0.M(vText, true);
        } else {
            xdl0.M(vText, false);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m2871q0() {
        this.f1667f.setText(this.f1675n.name);
        this.f1670i.setText(this.f1675n.name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    private void m2872r0() {
        if (!m2869k0()) {
            this.f1673l.setBackground(getResources().getDrawable(c3c0.f3775f0));
            xdl0.M(this.f1673l, false);
            return;
        }
        xdl0.M(this.f1673l, true);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f1673l.getBackground();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        List<String> list = this.f1675n.extra.style.tag.backgroundColors;
        if (list != null && list.size() > 1) {
            gradientDrawable.setColors(new int[]{Color.parseColor(this.f1675n.extra.style.tag.backgroundColors.get(0)), Color.parseColor(this.f1675n.extra.style.tag.backgroundColors.get(1))});
        }
        this.f1673l.setBackground(gradientDrawable.mutate());
        this.f1673l.setText(this.f1675n.extra.style.tag.text);
    }

    /* JADX INFO: renamed from: s0 */
    private void m2873s0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1666e.getLayoutParams();
        marginLayoutParams.topMargin = t100.s;
        marginLayoutParams.height = t100.d(93.0f);
        marginLayoutParams.width = t100.d(93.0f);
        xdl0.M(this.f1667f, true);
        xdl0.M(this.f1669h, false);
        xdl0.M(this.f1668g, true);
        xdl0.M(this.f1665d, true);
        boolean zM2869k0 = m2869k0();
        VText vText = this.f1673l;
        if (zM2869k0) {
            xdl0.M(vText, true);
        } else {
            xdl0.M(vText, false);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m2874i0(View view) {
        hr20.m7064a(this, view);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1677p;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m2875j0(boolean z) {
        if (z) {
            m2870o0();
        } else {
            m2873s0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m2876l0(rr20 rr20Var, CoreGiftInfo coreGiftInfo, View view) {
        String strM6495F = rr20Var.m9175v().m6495F();
        if (!TextUtils.equals(strM6495F, "from_meet_picks") && !TextUtils.equals(strM6495F, "from_meet_liked")) {
            zvf0.u("e_chat_gift_bar_gift_send", rr20Var.m9175v().m6496G() == CoreGiftPanelName.get("note") ? "p_meet" : rr20Var.m9175v().m6500L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) this.f1675n).id)});
        }
        if (coreGiftInfo.quota == 0) {
            lsi0.z(coreGiftInfo.extra.noQuotaToast, rr20Var.m9175v().getWindow().getDecorView());
        } else {
            rr20Var.m9177x(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m2877m0(final rr20 rr20Var, final CoreGiftInfo coreGiftInfo, boolean z, boolean z2) {
        this.f1675n = coreGiftInfo;
        this.f1676o = rr20Var;
        if (z2 || TextUtils.isEmpty(coreGiftInfo.extra.grayURL)) {
            qib0.G.L0(this.f1666e, coreGiftInfo.url);
        } else {
            qib0.G.L0(this.f1666e, coreGiftInfo.extra.grayURL);
        }
        m2871q0();
        m2872r0();
        m2879p0();
        xdl0.E0(this.f1672k, new View.OnClickListener() { // from class: l.gr20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4714a.m2876l0(rr20Var, coreGiftInfo, view);
            }
        });
        rr20Var.m9166k(coreGiftInfo);
        int i = coreGiftInfo.quota;
        VText vText = this.f1673l;
        if (i == 0) {
            vText.setAlpha(0.6f);
            this.f1667f.setAlpha(0.5f);
            this.f1666e.setAlpha(0.6f);
            this.f1668g.setAlpha(0.6f);
        } else {
            vText.setAlpha(1.0f);
            this.f1667f.setAlpha(1.0f);
            this.f1666e.setAlpha(1.0f);
            this.f1668g.setAlpha(1.0f);
        }
        if (!TextUtils.isEmpty(coreGiftInfo.extra.style.nameColor)) {
            this.f1667f.setTextColor(Color.parseColor(coreGiftInfo.extra.style.nameColor));
        }
        m2878n0();
        setChecked(z);
        xdl0.M(this.f1674m, coreGiftInfo.quota == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final void m2878n0() {
        if (!NullChecker.a(this.f1675n.extra.style) || vwb.J(this.f1675n.extra.style.backgroundColors)) {
            this.f1665d.setBackground(getResources().getDrawable(c3c0.f3766e0));
            return;
        }
        int[] iArr = {Color.parseColor(this.f1675n.extra.style.backgroundColors.get(0)), Color.parseColor(this.f1675n.extra.style.backgroundColors.get(1))};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(this.f1678q);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setColors(iArr);
        this.f1665d.setBackground(gradientDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2874i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m2879p0() {
        int i = (int) this.f1675n.unitCoinPrice;
        VText vText = this.f1671j;
        if (i == 0) {
            vText.setText("免费");
            this.f1668g.setText("免费");
            return;
        }
        vText.setText(((int) this.f1675n.unitCoinPrice) + " 探探币");
        this.f1668g.setText(((int) this.f1675n.unitCoinPrice) + " 探探币");
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f1677p != z) {
            this.f1677p = z;
            m2875j0(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f1677p);
        boolean z = this.f1677p;
        rr20 rr20Var = this.f1676o;
        if (z) {
            rr20Var.m9176w(this.f1675n);
        } else {
            rr20Var.m9165A();
        }
    }

    public NewGiftPanelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1677p = false;
        this.f1678q = t100.d(13.0f);
    }

    public NewGiftPanelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1677p = false;
        this.f1678q = t100.d(13.0f);
    }
}
