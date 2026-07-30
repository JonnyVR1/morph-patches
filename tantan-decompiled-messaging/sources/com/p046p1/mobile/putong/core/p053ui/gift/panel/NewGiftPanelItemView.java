package com.p046p1.mobile.putong.core.p053ui.gift.panel;

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
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.c3c0;
import p149l.hr20;
import p149l.lsi0;
import p149l.qib0;
import p149l.rr20;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class NewGiftPanelItemView extends ConstraintLayout implements Checkable {

    /* JADX INFO: renamed from: d */
    public View f29271d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f29272e;

    /* JADX INFO: renamed from: f */
    public VText f29273f;

    /* JADX INFO: renamed from: g */
    public TextView f29274g;

    /* JADX INFO: renamed from: h */
    public VLinear f29275h;

    /* JADX INFO: renamed from: i */
    public VText f29276i;

    /* JADX INFO: renamed from: j */
    public VText f29277j;

    /* JADX INFO: renamed from: k */
    public VText f29278k;

    /* JADX INFO: renamed from: l */
    public VText f29279l;

    /* JADX INFO: renamed from: m */
    public View f29280m;

    /* JADX INFO: renamed from: n */
    public CoreGiftInfo f29281n;

    /* JADX INFO: renamed from: o */
    public rr20 f29282o;

    /* JADX INFO: renamed from: p */
    public boolean f29283p;

    /* JADX INFO: renamed from: q */
    public final float f29284q;

    public NewGiftPanelItemView(Context context) {
        super(context);
        this.f29283p = false;
        this.f29284q = t100.m186890d(13.0f);
    }

    /* JADX INFO: renamed from: k0 */
    private boolean m45533k0() {
        return NullChecker.m81303a(this.f29281n.extra.style) && NullChecker.m81303a(this.f29281n.extra.style.tag) && !TextUtils.isEmpty(this.f29281n.extra.style.tag.text);
    }

    /* JADX INFO: renamed from: o0 */
    private void m45534o0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29272e.getLayoutParams();
        marginLayoutParams.topMargin = t100.m186890d(13.0f);
        int i = t100.f167236K;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        xdl0.m208344M(this.f29273f, false);
        xdl0.m208344M(this.f29274g, false);
        xdl0.m208344M(this.f29275h, true);
        xdl0.m208344M(this.f29271d, false);
        boolean zM45533k0 = m45533k0();
        VText vText = this.f29279l;
        if (zM45533k0) {
            xdl0.m208344M(vText, true);
        } else {
            xdl0.m208344M(vText, false);
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m45535q0() {
        this.f29273f.setText(this.f29281n.name);
        this.f29276i.setText(this.f29281n.name);
    }

    /* JADX INFO: renamed from: r0 */
    private void m45536r0() {
        if (!m45533k0()) {
            this.f29279l.setBackground(getResources().getDrawable(c3c0.f78738f0));
            xdl0.m208344M(this.f29279l, false);
            return;
        }
        xdl0.m208344M(this.f29279l, true);
        GradientDrawable gradientDrawable = (GradientDrawable) this.f29279l.getBackground();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        List<String> list = this.f29281n.extra.style.tag.backgroundColors;
        if (list != null && list.size() > 1) {
            gradientDrawable.setColors(new int[]{Color.parseColor(this.f29281n.extra.style.tag.backgroundColors.get(0)), Color.parseColor(this.f29281n.extra.style.tag.backgroundColors.get(1))});
        }
        this.f29279l.setBackground(gradientDrawable.mutate());
        this.f29279l.setText(this.f29281n.extra.style.tag.text);
    }

    /* JADX INFO: renamed from: s0 */
    private void m45537s0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29272e.getLayoutParams();
        marginLayoutParams.topMargin = t100.f167270s;
        marginLayoutParams.height = t100.m186890d(93.0f);
        marginLayoutParams.width = t100.m186890d(93.0f);
        xdl0.m208344M(this.f29273f, true);
        xdl0.m208344M(this.f29275h, false);
        xdl0.m208344M(this.f29274g, true);
        xdl0.m208344M(this.f29271d, true);
        boolean zM45533k0 = m45533k0();
        VText vText = this.f29279l;
        if (zM45533k0) {
            xdl0.m208344M(vText, true);
        } else {
            xdl0.m208344M(vText, false);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m45538i0(View view) {
        hr20.m132611a(this, view);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29283p;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m45539j0(boolean z) {
        if (z) {
            m45534o0();
        } else {
            m45537s0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m45540l0(rr20 rr20Var, CoreGiftInfo coreGiftInfo, View view) {
        String strM122794F = rr20Var.m180538v().m122794F();
        if (!TextUtils.equals(strM122794F, "from_meet_picks") && !TextUtils.equals(strM122794F, "from_meet_liked")) {
            zvf0.m220399u("e_chat_gift_bar_gift_send", rr20Var.m180538v().m122795G() == CoreGiftPanelName.get("note") ? "p_meet" : rr20Var.m180538v().m122799L(), vwb.m200311Y("chat_gift_id", this.f29281n.f56011id));
        }
        if (coreGiftInfo.quota == 0) {
            lsi0.m151596z(coreGiftInfo.extra.noQuotaToast, rr20Var.m180538v().getWindow().getDecorView());
        } else {
            rr20Var.m180540x(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m45541m0(final rr20 rr20Var, final CoreGiftInfo coreGiftInfo, boolean z, boolean z2) {
        this.f29281n = coreGiftInfo;
        this.f29282o = rr20Var;
        if (z2 || TextUtils.isEmpty(coreGiftInfo.extra.grayURL)) {
            qib0.f154691G.m102331L0(this.f29272e, coreGiftInfo.url);
        } else {
            qib0.f154691G.m102331L0(this.f29272e, coreGiftInfo.extra.grayURL);
        }
        m45535q0();
        m45536r0();
        m45543p0();
        xdl0.m208329E0(this.f29278k, new View.OnClickListener() { // from class: l.gr20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104009a.m45540l0(rr20Var, coreGiftInfo, view);
            }
        });
        rr20Var.m180529k(coreGiftInfo);
        int i = coreGiftInfo.quota;
        VText vText = this.f29279l;
        if (i == 0) {
            vText.setAlpha(0.6f);
            this.f29273f.setAlpha(0.5f);
            this.f29272e.setAlpha(0.6f);
            this.f29274g.setAlpha(0.6f);
        } else {
            vText.setAlpha(1.0f);
            this.f29273f.setAlpha(1.0f);
            this.f29272e.setAlpha(1.0f);
            this.f29274g.setAlpha(1.0f);
        }
        if (!TextUtils.isEmpty(coreGiftInfo.extra.style.nameColor)) {
            this.f29273f.setTextColor(Color.parseColor(coreGiftInfo.extra.style.nameColor));
        }
        m45542n0();
        setChecked(z);
        xdl0.m208344M(this.f29280m, coreGiftInfo.quota == 0);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m45542n0() {
        if (!NullChecker.m81303a(this.f29281n.extra.style) || vwb.m200296J(this.f29281n.extra.style.backgroundColors)) {
            this.f29271d.setBackground(getResources().getDrawable(c3c0.f78729e0));
            return;
        }
        int[] iArr = {Color.parseColor(this.f29281n.extra.style.backgroundColors.get(0)), Color.parseColor(this.f29281n.extra.style.backgroundColors.get(1))};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(this.f29284q);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setColors(iArr);
        this.f29271d.setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45538i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m45543p0() {
        int i = (int) this.f29281n.unitCoinPrice;
        VText vText = this.f29277j;
        if (i == 0) {
            vText.setText("免费");
            this.f29274g.setText("免费");
            return;
        }
        vText.setText(((int) this.f29281n.unitCoinPrice) + " 探探币");
        this.f29274g.setText(((int) this.f29281n.unitCoinPrice) + " 探探币");
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f29283p != z) {
            this.f29283p = z;
            m45539j0(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f29283p);
        boolean z = this.f29283p;
        rr20 rr20Var = this.f29282o;
        if (z) {
            rr20Var.m180539w(this.f29281n);
        } else {
            rr20Var.m180528A();
        }
    }

    public NewGiftPanelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29283p = false;
        this.f29284q = t100.m186890d(13.0f);
    }

    public NewGiftPanelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29283p = false;
        this.f29284q = t100.m186890d(13.0f);
    }
}
