package com.p051p1.mobile.putong.core.p058ui.vip.privilege;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VText;
import p153l.joa;
import p153l.lb2;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.vj90;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeSupremePartnerCard extends PrivilegeBaseCard {

    /* JADX INFO: renamed from: d */
    public PrivilegeSupremePartnerCard f38339d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f38340e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f38341f;

    /* JADX INFO: renamed from: g */
    public VText f38342g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f38343h;

    /* JADX INFO: renamed from: i */
    public ImageView f38344i;

    /* JADX INFO: renamed from: j */
    public VText f38345j;

    /* JADX INFO: renamed from: k */
    public VText f38346k;

    /* JADX INFO: renamed from: l */
    public lb2 f38347l;

    /* JADX INFO: renamed from: m */
    public PutongFrag f38348m;

    /* JADX INFO: renamed from: n */
    public PurchaseType f38349n;

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
    private void m58073r0() {
        StringBuilder sb = new StringBuilder("至尊合伙人");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f38345j.setTextColor(Color.parseColor("#D1AE68"));
        this.f38345j.setText(spannableString);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: h0 */
    public void mo58019h0(lb2 lb2Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f38347l = lb2Var;
        this.f38348m = putongFrag;
        this.f38349n = purchaseType;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: i0 */
    public void mo58020i0() {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: j0 */
    public void mo58021j0() {
        uqb0.f180374G.m127109I0(this.f38341f, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkpPVkhLR09PSUZFR1ZHNlBNM0lIUllDRUFHTjJLSjE0IiwidyI6OTYwLCJoIjozOTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MDczMTM0ODkyMTEyMDYyMDEwfQ.png", qa00.m175859d(320.0f), qa00.m175859d(130.0f));
        m58073r0();
        m58078p0();
        m58076n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m58074l0(View view) {
        vj90.m201496a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final String m58075m0(int i) {
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
    public void m58076n0() {
        this.f38347l.m153557n(this.f38348m, CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged(new qcj() { // from class: l.tj90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isSupremePartner());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.uj90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179190a.m58077o0((User) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58074l0(this);
        this.f38345j.getPaint().setFakeBoldText(true);
        this.f38342g.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m58078p0() {
        StringBuilder sb = new StringBuilder("Ultimate experience");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f38346k.setTextColor(Color.parseColor("#C5AD7D"));
        this.f38346k.setText(spannableString);
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final void m58077o0(User user) {
        StringBuilder sb = new StringBuilder("NO.");
        int supremePartnerUserCode = user.getSupremePartnerUserCode();
        if (!joa.m146363O3() || supremePartnerUserCode <= 0) {
            sb.append("XXX");
        } else {
            sb.append(m58075m0(supremePartnerUserCode));
        }
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f38342g.setTextColor(Color.parseColor("#C5AD7D"));
        this.f38342g.setText(spannableString);
    }

    public PrivilegeSupremePartnerCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSupremePartnerCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
