package com.p051p1.mobile.putong.core.p058ui.gift.panel;

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
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.b030;
import p153l.bnl0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.o1j0;
import p153l.qa00;
import p153l.rz20;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class NewGiftPanelItemView extends ConstraintLayout implements Checkable {

    /* JADX INFO: renamed from: d */
    public View f30119d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30120e;

    /* JADX INFO: renamed from: f */
    public VText f30121f;

    /* JADX INFO: renamed from: g */
    public TextView f30122g;

    /* JADX INFO: renamed from: h */
    public VLinear f30123h;

    /* JADX INFO: renamed from: i */
    public VText f30124i;

    /* JADX INFO: renamed from: j */
    public VText f30125j;

    /* JADX INFO: renamed from: k */
    public VText f30126k;

    /* JADX INFO: renamed from: l */
    public VText f30127l;

    /* JADX INFO: renamed from: m */
    public View f30128m;

    /* JADX INFO: renamed from: n */
    public CoreGiftInfo f30129n;

    /* JADX INFO: renamed from: o */
    public b030 f30130o;

    /* JADX INFO: renamed from: p */
    public boolean f30131p;

    /* JADX INFO: renamed from: q */
    public final float f30132q;

    public NewGiftPanelItemView(Context context) {
        super(context);
        this.f30131p = false;
        this.f30132q = qa00.m175859d(13.0f);
    }

    /* JADX INFO: renamed from: k0 */
    private boolean m46716k0() {
        return NullChecker.m82486a(this.f30129n.extra.style) && NullChecker.m82486a(this.f30129n.extra.style.tag) && !TextUtils.isEmpty(this.f30129n.extra.style.tag.text);
    }

    /* JADX INFO: renamed from: o0 */
    private void m46717o0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30120e.getLayoutParams();
        marginLayoutParams.topMargin = qa00.m175859d(13.0f);
        int i = qa00.f156298K;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        bnl0.m105524M(this.f30121f, false);
        bnl0.m105524M(this.f30122g, false);
        bnl0.m105524M(this.f30123h, true);
        bnl0.m105524M(this.f30119d, false);
        boolean zM46716k0 = m46716k0();
        VText vText = this.f30127l;
        if (zM46716k0) {
            bnl0.m105524M(vText, true);
        } else {
            bnl0.m105524M(vText, false);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m46718q0() {
        this.f30121f.setText(this.f30129n.name);
        this.f30124i.setText(this.f30129n.name);
    }

    /* JADX INFO: renamed from: r0 */
    private void m46719r0() {
        if (!m46716k0()) {
            this.f30127l.setBackground(getResources().getDrawable(ibc0.f114013f0));
            bnl0.m105524M(this.f30127l, false);
            return;
        }
        bnl0.m105524M(this.f30127l, true);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f30127l.getBackground();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        List<String> list = this.f30129n.extra.style.tag.backgroundColors;
        if (list != null && list.size() > 1) {
            gradientDrawable.setColors(new int[]{Color.parseColor(this.f30129n.extra.style.tag.backgroundColors.get(0)), Color.parseColor(this.f30129n.extra.style.tag.backgroundColors.get(1))});
        }
        this.f30127l.setBackground(gradientDrawable.mutate());
        this.f30127l.setText(this.f30129n.extra.style.tag.text);
    }

    /* JADX INFO: renamed from: s0 */
    private void m46720s0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30120e.getLayoutParams();
        marginLayoutParams.topMargin = qa00.f156332s;
        marginLayoutParams.height = qa00.m175859d(93.0f);
        marginLayoutParams.width = qa00.m175859d(93.0f);
        bnl0.m105524M(this.f30121f, true);
        bnl0.m105524M(this.f30123h, false);
        bnl0.m105524M(this.f30122g, true);
        bnl0.m105524M(this.f30119d, true);
        boolean zM46716k0 = m46716k0();
        VText vText = this.f30127l;
        if (zM46716k0) {
            bnl0.m105524M(vText, true);
        } else {
            bnl0.m105524M(vText, false);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m46721i0(View view) {
        rz20.m183669a(this, view);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30131p;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m46722j0(boolean z) {
        if (z) {
            m46717o0();
        } else {
            m46720s0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m46723l0(b030 b030Var, CoreGiftInfo coreGiftInfo, View view) {
        String strM174330F = b030Var.m101257v().m174330F();
        if (!TextUtils.equals(strM174330F, "from_meet_picks") && !TextUtils.equals(strM174330F, "from_meet_liked")) {
            i4g0.m138523u("e_chat_gift_bar_gift_send", b030Var.m101257v().m174331G() == CoreGiftPanelName.get("note") ? "p_meet" : b030Var.m101257v().m174335L(), jyb.m147494Y("chat_gift_id", this.f30129n.f56859id));
        }
        if (coreGiftInfo.quota == 0) {
            o1j0.m165652z(coreGiftInfo.extra.noQuotaToast, b030Var.m101257v().getWindow().getDecorView());
        } else {
            b030Var.m101259x(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m46724m0(final b030 b030Var, final CoreGiftInfo coreGiftInfo, boolean z, boolean z2) {
        this.f30129n = coreGiftInfo;
        this.f30130o = b030Var;
        if (z2 || TextUtils.isEmpty(coreGiftInfo.extra.grayURL)) {
            uqb0.f180374G.m127115L0(this.f30120e, coreGiftInfo.url);
        } else {
            uqb0.f180374G.m127115L0(this.f30120e, coreGiftInfo.extra.grayURL);
        }
        m46718q0();
        m46719r0();
        m46726p0();
        bnl0.m105509E0(this.f30126k, new View.OnClickListener() { // from class: l.qz20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160217a.m46723l0(b030Var, coreGiftInfo, view);
            }
        });
        b030Var.m101248k(coreGiftInfo);
        int i = coreGiftInfo.quota;
        VText vText = this.f30127l;
        if (i == 0) {
            vText.setAlpha(0.6f);
            this.f30121f.setAlpha(0.5f);
            this.f30120e.setAlpha(0.6f);
            this.f30122g.setAlpha(0.6f);
        } else {
            vText.setAlpha(1.0f);
            this.f30121f.setAlpha(1.0f);
            this.f30120e.setAlpha(1.0f);
            this.f30122g.setAlpha(1.0f);
        }
        if (!TextUtils.isEmpty(coreGiftInfo.extra.style.nameColor)) {
            this.f30121f.setTextColor(Color.parseColor(coreGiftInfo.extra.style.nameColor));
        }
        m46725n0();
        setChecked(z);
        bnl0.m105524M(this.f30128m, coreGiftInfo.quota == 0);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m46725n0() {
        if (!NullChecker.m82486a(this.f30129n.extra.style) || jyb.m147479J(this.f30129n.extra.style.backgroundColors)) {
            this.f30119d.setBackground(getResources().getDrawable(ibc0.f114004e0));
            return;
        }
        int[] iArr = {Color.parseColor(this.f30129n.extra.style.backgroundColors.get(0)), Color.parseColor(this.f30129n.extra.style.backgroundColors.get(1))};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(this.f30132q);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setColors(iArr);
        this.f30119d.setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46721i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m46726p0() {
        int i = (int) this.f30129n.unitCoinPrice;
        VText vText = this.f30125j;
        if (i == 0) {
            vText.setText("免费");
            this.f30122g.setText("免费");
            return;
        }
        vText.setText(((int) this.f30129n.unitCoinPrice) + " 探探币");
        this.f30122g.setText(((int) this.f30129n.unitCoinPrice) + " 探探币");
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f30131p != z) {
            this.f30131p = z;
            m46722j0(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f30131p);
        boolean z = this.f30131p;
        b030 b030Var = this.f30130o;
        if (z) {
            b030Var.m101258w(this.f30129n);
        } else {
            b030Var.m101247A();
        }
    }

    public NewGiftPanelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30131p = false;
        this.f30132q = qa00.m175859d(13.0f);
    }

    public NewGiftPanelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30131p = false;
        this.f30132q = qa00.m175859d(13.0f);
    }
}
