package com.p046p1.mobile.putong.core.p053ui.vip.privilege;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.eb2;
import p149l.mkd0;
import p149l.qib0;
import p149l.rb90;
import p149l.t100;
import p149l.w9j;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeSupremePartnerCard extends PrivilegeBaseCard {

    /* JADX INFO: renamed from: d */
    public PrivilegeSupremePartnerCard f37491d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f37492e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f37493f;

    /* JADX INFO: renamed from: g */
    public VText f37494g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f37495h;

    /* JADX INFO: renamed from: i */
    public ImageView f37496i;

    /* JADX INFO: renamed from: j */
    public VText f37497j;

    /* JADX INFO: renamed from: k */
    public VText f37498k;

    /* JADX INFO: renamed from: l */
    public eb2 f37499l;

    /* JADX INFO: renamed from: m */
    public PutongFrag f37500m;

    /* JADX INFO: renamed from: n */
    public PurchaseType f37501n;

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
    private void m56890r0() {
        StringBuilder sb = new StringBuilder("至尊合伙人");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f37497j.setTextColor(Color.parseColor("#D1AE68"));
        this.f37497j.setText(spannableString);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: h0 */
    public void mo56836h0(eb2 eb2Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f37499l = eb2Var;
        this.f37500m = putongFrag;
        this.f37501n = purchaseType;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: i0 */
    public void mo56837i0() {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: j0 */
    public void mo56838j0() {
        qib0.f154691G.m102325I0(this.f37493f, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkpPVkhLR09PSUZFR1ZHNlBNM0lIUllDRUFHTjJLSjE0IiwidyI6OTYwLCJoIjozOTAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MDczMTM0ODkyMTEyMDYyMDEwfQ.png", t100.m186890d(320.0f), t100.m186890d(130.0f));
        m56890r0();
        m56895p0();
        m56893n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m56891l0(View view) {
        rb90.m178579a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final String m56892m0(int i) {
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
    public void m56893n0() {
        this.f37499l.m115452n(this.f37500m, CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged(new w9j() { // from class: l.pb90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isSupremePartner());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.qb90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153633a.m56894o0((User) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56891l0(this);
        this.f37497j.getPaint().setFakeBoldText(true);
        this.f37494g.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m56895p0() {
        StringBuilder sb = new StringBuilder("Ultimate experience");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f37498k.setTextColor(Color.parseColor("#C5AD7D"));
        this.f37498k.setText(spannableString);
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final void m56894o0(User user) {
        StringBuilder sb = new StringBuilder("NO.");
        int supremePartnerUserCode = user.getSupremePartnerUserCode();
        if (!xma.m210049N3() || supremePartnerUserCode <= 0) {
            sb.append("XXX");
        } else {
            sb.append(m56892m0(supremePartnerUserCode));
        }
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f37494g.setTextColor(Color.parseColor("#C5AD7D"));
        this.f37494g.setText(spannableString);
    }

    public PrivilegeSupremePartnerCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSupremePartnerCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
