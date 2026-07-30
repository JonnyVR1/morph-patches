package com.p051p1.mobile.putong.live.livingroom.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.efv;
import p153l.n9c0;
import p153l.obc0;
import p153l.sej0;
import p153l.wft;
import p153l.zct;

/* JADX INFO: loaded from: classes5.dex */
public class LivePreviewBottomView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f52837a;

    /* JADX INFO: renamed from: b */
    public VImage f52838b;

    /* JADX INFO: renamed from: c */
    public VText f52839c;

    /* JADX INFO: renamed from: d */
    public VText f52840d;

    /* JADX INFO: renamed from: e */
    public VText f52841e;

    /* JADX INFO: renamed from: f */
    public VText f52842f;

    /* JADX INFO: renamed from: g */
    public VLinear f52843g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f52844h;

    /* JADX INFO: renamed from: i */
    public TextView f52845i;

    /* JADX INFO: renamed from: j */
    public boolean f52846j;

    /* JADX INFO: renamed from: k */
    public ObjectAnimator f52847k;

    /* JADX INFO: renamed from: l */
    public ObjectAnimator f52848l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LivePreviewBottomView$a */
    public class C13093a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f52849a;

        public C13093a(String str) {
            this.f52849a = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            new sej0(LivePreviewBottomView.this.getContext()).m185560j(this.f52849a);
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
        return efv.f93837P;
    }

    private String getSecret2() {
        return efv.f93838Q;
    }

    /* JADX INFO: renamed from: a */
    public final void m77712a(View view) {
        zct.m219263a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m77713b() {
        ObjectAnimator objectAnimator = this.f52847k;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f52843g, "translationX", 0.0f, -30.0f, 0.0f);
            this.f52847k = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(600L);
            this.f52847k.setInterpolator(new BounceInterpolator());
            this.f52847k.start();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77714c() {
        ObjectAnimator objectAnimator = this.f52848l;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f52838b, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
            this.f52848l = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f52848l.start();
        }
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m77715d(String str, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < strArr.length; i += 2) {
            String str2 = strArr[i];
            spannableStringBuilder.setSpan(new C13093a(strArr[i + 1]), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: e */
    public final String m77716e(int i) {
        return "《" + getContext().getResources().getString(i) + "》";
    }

    /* JADX INFO: renamed from: f */
    public boolean m77717f() {
        return this.f52846j;
    }

    /* JADX INFO: renamed from: g */
    public boolean m77718g() {
        return this.f52844h.isChecked();
    }

    /* JADX INFO: renamed from: h */
    public final void m77719h() {
        this.f52845i.setText(m77715d(getContext().getResources().getString(R$string.f47592Ib) + m77716e(R$string.f47919Y) + getContext().getResources().getString(R$string.f47984b0) + m77716e(R$string.f48524zd), m77716e(R$string.f47919Y), getSecret1(), m77716e(R$string.f48524zd), getSecret2()));
        this.f52845i.setMovementMethod(LinkMovementMethod.getInstance());
        this.f52845i.setHighlightColor(getResources().getColor(n9c0.f140874v1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77712a(this);
        if (wft.m206159b(2)) {
            m77719h();
        } else {
            this.f52843g.setVisibility(4);
        }
    }

    public void setLiveBellSelected(boolean z) {
        this.f52846j = z;
        Drawable drawable = z ? getResources().getDrawable(obc0.f146414m4) : getResources().getDrawable(obc0.f146402l4);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f52841e.setCompoundDrawables(null, drawable, null, null);
    }

    public LivePreviewBottomView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LivePreviewBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
