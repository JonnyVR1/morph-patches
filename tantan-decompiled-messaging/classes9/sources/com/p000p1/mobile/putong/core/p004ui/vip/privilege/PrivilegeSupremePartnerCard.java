package com.p000p1.mobile.putong.core.p004ui.vip.privilege;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import l.e30;
import l.eb2;
import l.mkd0;
import l.rb90;
import l.t100;
import l.w9j;
import p006l.qib0;
import p006l.xma;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeSupremePartnerCard extends PrivilegeBaseCard {

    /* JADX INFO: renamed from: d */
    public PrivilegeSupremePartnerCard f7272d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f7273e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7274f;

    /* JADX INFO: renamed from: g */
    public VText f7275g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f7276h;

    /* JADX INFO: renamed from: i */
    public ImageView f7277i;

    /* JADX INFO: renamed from: j */
    public VText f7278j;

    /* JADX INFO: renamed from: k */
    public VText f7279k;

    /* JADX INFO: renamed from: l */
    public eb2 f7280l;

    /* JADX INFO: renamed from: m */
    public PutongFrag f7281m;

    /* JADX INFO: renamed from: n */
    public PurchaseType f7282n;

    public class ShaderSpan extends RelativeSizeSpan {

        @NonNull
        @ColorInt
        int[] colors;
        float[] positions;
        float start;
        String value;

        public ShaderSpan(float f, float f2, @NonNull @ColorInt String str, int[] iArr, float[] fArr) {
            super(f);
            this.start = f2;
            this.value = str;
            this.colors = iArr;
            this.positions = fArr;
        }

        @Override // android.text.style.RelativeSizeSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setShader(new LinearGradient(this.start, 0.0f, textPaint.measureText(this.value) + this.start, 0.0f, this.colors, this.positions, Shader.TileMode.CLAMP));
        }

        @Override // android.text.style.RelativeSizeSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(@NonNull TextPaint textPaint) {
            super.updateMeasureState(textPaint);
        }
    }

    public PrivilegeSupremePartnerCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r0 */
    private void m10361r0() {
        StringBuilder sb = new StringBuilder("至尊合伙人");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f7278j.setTextColor(Color.parseColor("#D1AE68"));
        this.f7278j.setText(spannableString);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: h0 */
    public void mo10307h0(eb2 eb2Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f7280l = eb2Var;
        this.f7281m = putongFrag;
        this.f7282n = purchaseType;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: i0 */
    public void mo10308i0() {
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: j0 */
    public void mo10309j0() {
        qib0.f19782G.m12738I0(this.f7274f, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkpPVkhLR09PSUZFR1ZHNlBNM0lIUllDRUFHTjJLSjE0IiwidyI6OTYwLCJoIjozOTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MDczMTM0ODkyMTEyMDYyMDEwfQ.png", t100.d(320.0f), t100.d(130.0f));
        m10361r0();
        m10366p0();
        m10364n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m10362l0(View view) {
        rb90.a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final String m10363m0(int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 9) {
            sb.append("00");
            sb.append(i);
        } else if (i <= 99) {
            sb.append("0");
            sb.append(i);
        } else {
            sb.append(i);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n0 */
    public void m10364n0() {
        this.f7280l.n(this.f7281m, CoreModule.f1534c.f3628e0.m21486o9()).distinctUntilChanged(new w9j() { // from class: l.pb90
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isSupremePartner());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.qb90
            public final void call(Object obj) {
                this.f19700a.m10365o0((User) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m10362l0(this);
        this.f7278j.getPaint().setFakeBoldText(true);
        this.f7275g.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m10366p0() {
        StringBuilder sb = new StringBuilder("Ultimate experience");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f7279k.setTextColor(Color.parseColor("#C5AD7D"));
        this.f7279k.setText(spannableString);
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final void m10365o0(User user) {
        StringBuilder sb = new StringBuilder("NO.");
        int supremePartnerUserCode = user.getSupremePartnerUserCode();
        if (!xma.m27357N3() || supremePartnerUserCode <= 0) {
            sb.append("XXX");
        } else {
            sb.append(m10363m0(supremePartnerUserCode));
        }
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f7275g.setTextColor(Color.parseColor("#C5AD7D"));
        this.f7275g.setText(spannableString);
    }

    public PrivilegeSupremePartnerCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSupremePartnerCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
