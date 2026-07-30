package com.p046p1.mobile.putong.core.newui.view;

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
import com.p046p1.mobile.putong.data.User;
import p147v.VText;
import p149l.n5b;

/* JADX INFO: loaded from: classes11.dex */
public class CoreSupremePartnerMysteriousModeTagView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreSupremePartnerMysteriousModeTagView f26897a;

    /* JADX INFO: renamed from: b */
    public VText f26898b;

    /* JADX INFO: renamed from: c */
    public VText f26899c;

    /* JADX INFO: renamed from: d */
    public VText f26900d;

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
    public final void m43700a(View view) {
        n5b.m157988a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m43701b(User user) {
        m43704e();
        m43702c(user == null ? false : user.isFemale());
        m43703d();
    }

    /* JADX INFO: renamed from: c */
    public final void m43702c(boolean z) {
        StringBuilder sb = new StringBuilder(z ? "她" : "他");
        sb.append("非常中意你");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.6f, 0.9f}), 0, sb.length(), 33);
        this.f26899c.setTextColor(Color.parseColor("#C5AD7D"));
        this.f26899c.setText(spannableString);
    }

    /* JADX INFO: renamed from: d */
    public final void m43703d() {
        StringBuilder sb = new StringBuilder("匹配后为你揭晓真实身份");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.1f, 0.6f, 0.9f}), 0, sb.length(), 33);
        this.f26900d.setTextColor(Color.parseColor("#C5AD7D"));
        this.f26900d.setText(spannableString);
    }

    /* JADX INFO: renamed from: e */
    public final void m43704e() {
        StringBuilder sb = new StringBuilder("至尊合伙人");
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new ShaderSpan(1.0f, 0.0f, sb.toString(), new int[]{Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761")}, new float[]{0.1f, 0.5f, 0.9f}), 0, sb.length(), 33);
        this.f26898b.setTextColor(Color.parseColor("#D1AE68"));
        this.f26898b.setText(spannableString);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43700a(this);
        this.f26898b.getPaint().setFakeBoldText(true);
    }

    public CoreSupremePartnerMysteriousModeTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreSupremePartnerMysteriousModeTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
