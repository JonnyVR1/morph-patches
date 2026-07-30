package com.p046p1.mobile.putong.live.livingroom.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.ddv;
import p149l.h1c0;
import p149l.i3c0;
import p149l.o5j0;
import p149l.vdt;
import p149l.yat;

/* JADX INFO: loaded from: classes5.dex */
public class LivePreviewBottomView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f51989a;

    /* JADX INFO: renamed from: b */
    public VImage f51990b;

    /* JADX INFO: renamed from: c */
    public VText f51991c;

    /* JADX INFO: renamed from: d */
    public VText f51992d;

    /* JADX INFO: renamed from: e */
    public VText f51993e;

    /* JADX INFO: renamed from: f */
    public VText f51994f;

    /* JADX INFO: renamed from: g */
    public VLinear f51995g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f51996h;

    /* JADX INFO: renamed from: i */
    public TextView f51997i;

    /* JADX INFO: renamed from: j */
    public boolean f51998j;

    /* JADX INFO: renamed from: k */
    public ObjectAnimator f51999k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f52000l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LivePreviewBottomView$a */
    public class C12930a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f52001a;

        public C12930a(String str) {
            this.f52001a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            new o5j0(LivePreviewBottomView.this.getContext()).m162796j(this.f52001a);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    public LivePreviewBottomView(Context context) {
        this(context, null);
    }

    private String getSecret1() {
        return ddv.f85644P;
    }

    private String getSecret2() {
        return ddv.f85645Q;
    }

    /* JADX INFO: renamed from: a */
    public final void m76529a(View view) {
        yat.m213871a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76530b() {
        ObjectAnimator objectAnimator = this.f51999k;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51995g, "translationX", 0.0f, -30.0f, 0.0f);
            this.f51999k = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(600L);
            this.f51999k.setInterpolator(new BounceInterpolator());
            this.f51999k.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m76531c() {
        ObjectAnimator objectAnimator = this.f52000l;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51990b, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
            this.f52000l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f52000l.start();
        }
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m76532d(String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            spannableStringBuilder.setSpan(new C12930a(strArr[i + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final String m76533e(int i) {
        return "《" + getContext().getResources().getString(i) + "》";
    }

    /* JADX INFO: renamed from: f */
    public boolean m76534f() {
        return this.f51998j;
    }

    /* JADX INFO: renamed from: g */
    public boolean m76535g() {
        return this.f51996h.isChecked();
    }

    /* JADX INFO: renamed from: h */
    public final void m76536h() {
        this.f51997i.setText(m76532d(getContext().getResources().getString(R$string.f46744Ib) + m76533e(R$string.f47071Y) + getContext().getResources().getString(R$string.f47136b0) + m76533e(R$string.f47676zd), m76533e(R$string.f47071Y), getSecret1(), m76533e(R$string.f47676zd), getSecret2()));
        this.f51997i.setMovementMethod(LinkMovementMethod.getInstance());
        this.f51997i.setHighlightColor(getResources().getColor(h1c0.f105413v1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76529a(this);
        if (vdt.m198092b(2)) {
            m76536h();
        } else {
            this.f51995g.setVisibility(4);
        }
    }

    public void setLiveBellSelected(boolean z) {
        this.f51998j = z;
        Drawable drawable = z ? getResources().getDrawable(i3c0.f111086m4) : getResources().getDrawable(i3c0.f111074l4);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f51993e.setCompoundDrawables(null, drawable, null, null);
    }

    public LivePreviewBottomView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LivePreviewBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
