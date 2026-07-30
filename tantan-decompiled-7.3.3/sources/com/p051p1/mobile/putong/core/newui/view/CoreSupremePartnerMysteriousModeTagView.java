package com.p051p1.mobile.putong.core.newui.view;

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
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import p151v.VText;
import p153l.a7b;

/* JADX INFO: loaded from: classes11.dex */
public class CoreSupremePartnerMysteriousModeTagView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreSupremePartnerMysteriousModeTagView f27745a;

    /* JADX INFO: renamed from: b */
    public VText f27746b;

    /* JADX INFO: renamed from: c */
    public VText f27747c;

    /* JADX INFO: renamed from: d */
    public VText f27748d;

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

    public CoreSupremePartnerMysteriousModeTagView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44886a(View view) {
        a7b.m96354a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m44887b(User user) {
        m44890e();
        m44888c(user == null ? false : user.isFemale());
        m44889d();
    }

    /* JADX INFO: renamed from: c */
    public final void m44888c(boolean z) {
        StringBuilder sb = new StringBuilder(z ? "她" : "他");
        sb.append("非常中意你");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.6f, 0.9f}), 0, sb.length(), 33);
        this.f27747c.setTextColor(Color.parseColor("#C5AD7D"));
        this.f27747c.setText(spannableString);
    }

    /* JADX INFO: renamed from: d */
    public final void m44889d() {
        StringBuilder sb = new StringBuilder("匹配后为你揭晓真实身份");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.6f, 0.9f}), 0, sb.length(), 33);
        this.f27748d.setTextColor(Color.parseColor("#C5AD7D"));
        this.f27748d.setText(spannableString);
    }

    /* JADX INFO: renamed from: e */
    public final void m44890e() {
        StringBuilder sb = new StringBuilder("至尊合伙人");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f27746b.setTextColor(Color.parseColor("#D1AE68"));
        this.f27746b.setText(spannableString);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44886a(this);
        this.f27746b.getPaint().setFakeBoldText(true);
    }

    public CoreSupremePartnerMysteriousModeTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreSupremePartnerMysteriousModeTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
