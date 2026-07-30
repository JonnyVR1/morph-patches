package com.p051p1.mobile.putong.live.livingroom.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.gt0;
import p153l.it0;
import p153l.jyb;
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveHorizontalAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f52824a;

    /* JADX INFO: renamed from: b */
    public TextView f52825b;

    /* JADX INFO: renamed from: c */
    public List<String> f52826c;

    /* JADX INFO: renamed from: d */
    public int f52827d;

    /* JADX INFO: renamed from: e */
    public Runnable f52828e;

    /* JADX INFO: renamed from: f */
    public float f52829f;

    /* JADX INFO: renamed from: g */
    public int f52830g;

    /* JADX INFO: renamed from: h */
    public long f52831h;

    /* JADX INFO: renamed from: i */
    public long f52832i;

    /* JADX INFO: renamed from: j */
    public int f52833j;

    /* JADX INFO: renamed from: k */
    public boolean f52834k;

    /* JADX INFO: renamed from: l */
    public Animator f52835l;

    /* JADX INFO: renamed from: m */
    public boolean f52836m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveHorizontalAutoScrollView$a */
    public interface InterfaceC13092a {
    }

    public LiveHorizontalAutoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52827d = 0;
        this.f52831h = 3000L;
        this.f52832i = 3000L;
        this.f52833j = qa00.m175859d(20.0f);
        this.f52834k = false;
        this.f52836m = false;
        m77703f(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public final TextView m77702e() {
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(8388627);
        textView.setTextColor(this.f52830g);
        textView.setTextSize(0, this.f52829f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.czs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84495a.m77705h(view);
            }
        });
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public final void m77703f(Context context, AttributeSet attributeSet) {
        this.f52826c = new ArrayList();
        this.f52828e = new Runnable() { // from class: l.azs
            @Override // java.lang.Runnable
            public final void run() {
                this.f74182a.m77711n();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184116a);
        this.f52829f = typedArrayObtainStyledAttributes.getDimensionPixelSize(vhc0.f184122d, qa00.m175861f(13));
        this.f52830g = typedArrayObtainStyledAttributes.getColor(vhc0.f184120c, -1);
        typedArrayObtainStyledAttributes.recycle();
        m77704g();
    }

    /* JADX INFO: renamed from: g */
    public final void m77704g() {
        TextView textViewM77702e = m77702e();
        this.f52824a = textViewM77702e;
        addView(textViewM77702e);
        TextView textViewM77702e2 = m77702e();
        this.f52825b = textViewM77702e2;
        textViewM77702e2.setVisibility(8);
        addView(this.f52825b);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m77705h(View view) {
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77706i() {
        TextView textView = this.f52824a;
        TextView textView2 = this.f52825b;
        this.f52824a = textView2;
        this.f52825b = textView;
        textView2.setTranslationX(0.0f);
        this.f52825b.setTranslationX(0.0f);
        this.f52825b.setVisibility(8);
        if (this.f52834k) {
            postDelayed(this.f52828e, this.f52832i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m77707j() {
        int width = getWidth();
        if (width > 0) {
            this.f52824a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            bnl0.m105507D0(this.f52824a.getMeasuredWidth(), this.f52824a);
            int measuredWidth = this.f52824a.getMeasuredWidth();
            if (this.f52836m && measuredWidth <= (width - getPaddingLeft()) - getPaddingRight()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52824a.getLayoutParams();
                layoutParams.gravity = 17;
                this.f52824a.setLayoutParams(layoutParams);
                return;
            }
        }
        this.f52834k = true;
        m77708k();
    }

    /* JADX INFO: renamed from: k */
    public final void m77708k() {
        if (this.f52824a == null || this.f52825b == null) {
            return;
        }
        Animator animator = this.f52835l;
        if (animator != null) {
            it0.m142007A(animator);
        }
        int size = this.f52826c.size();
        if (size == 0) {
            return;
        }
        int i = this.f52827d;
        int i2 = (i + 1) % size;
        String str = this.f52826c.get(i);
        String str2 = this.f52826c.get(i2);
        this.f52824a.setText(str);
        this.f52824a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52824a.getLayoutParams();
        layoutParams.width = this.f52824a.getMeasuredWidth();
        layoutParams.gravity = 8388627;
        this.f52824a.setLayoutParams(layoutParams);
        int measuredWidth = this.f52824a.getMeasuredWidth() + this.f52833j;
        this.f52825b.setText(str2);
        this.f52825b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f52825b.getLayoutParams();
        layoutParams2.width = this.f52825b.getMeasuredWidth();
        layoutParams2.gravity = 8388627;
        this.f52825b.setLayoutParams(layoutParams2);
        this.f52825b.setVisibility(0);
        this.f52824a.setTranslationX(0.0f);
        float f = measuredWidth;
        this.f52825b.setTranslationX(f);
        Animator animatorM132180z = gt0.m132180z(ObjectAnimator.ofFloat(this.f52824a, "translationX", 0.0f, -measuredWidth), ObjectAnimator.ofFloat(this.f52825b, "translationX", f, 0.0f));
        animatorM132180z.setDuration(this.f52831h);
        animatorM132180z.setInterpolator(new LinearInterpolator());
        this.f52835l = animatorM132180z;
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.dzs
            @Override // java.lang.Runnable
            public final void run() {
                this.f91380a.m77706i();
            }
        });
        animatorM132180z.start();
    }

    /* JADX INFO: renamed from: l */
    public void m77709l() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f52824a.getLayoutParams();
        layoutParams.gravity = 17;
        this.f52824a.setLayoutParams(layoutParams);
        removeCallbacks(this.f52828e);
        Animator animator = this.f52835l;
        if (animator != null) {
            it0.m142007A(animator);
            this.f52835l = null;
        }
        TextView textView = this.f52824a;
        if (textView != null) {
            textView.setTranslationX(0.0f);
            this.f52824a.setVisibility(0);
        }
        TextView textView2 = this.f52825b;
        if (textView2 != null) {
            textView2.setTranslationX(0.0f);
            this.f52825b.setVisibility(8);
        }
        this.f52827d = 0;
        this.f52834k = false;
    }

    /* JADX INFO: renamed from: m */
    public void m77710m() {
        TextView textView;
        if (this.f52834k || jyb.m147479J(this.f52826c)) {
            return;
        }
        m77709l();
        String str = this.f52826c.get(0);
        if (TextUtils.isEmpty(str) || (textView = this.f52824a) == null) {
            this.f52834k = true;
            m77708k();
        } else {
            textView.setText(str);
            post(new Runnable() { // from class: l.bzs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79175a.m77707j();
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m77711n() {
        int size = this.f52826c.size();
        if (size == 0) {
            return;
        }
        this.f52827d = (this.f52827d + 1) % size;
        m77708k();
    }

    public void setGap(int i) {
        this.f52833j = i;
    }

    public void setOnItemClickListener(InterfaceC13092a interfaceC13092a) {
    }

    public void setScrollDuration(long j) {
        if (this.f52834k) {
            return;
        }
        this.f52831h = Math.max(100L, j);
    }

    public void setSingleText(String str) {
        m77709l();
        this.f52826c.clear();
        if (!TextUtils.isEmpty(str)) {
            this.f52826c.add(str);
            this.f52826c.add(str);
        }
        this.f52824a.setText(str);
        this.f52827d = 0;
        this.f52836m = true;
    }

    public void setStillTime(long j) {
        if (this.f52834k) {
            return;
        }
        this.f52832i = Math.max(0L, j);
    }

    public void setTextColor(@ColorInt int i) {
        this.f52830g = i;
        TextView textView = this.f52824a;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.f52825b;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    public void setTextList(List<String> list) {
        m77709l();
        this.f52826c.clear();
        if (list != null) {
            this.f52826c.addAll(list);
        }
        this.f52827d = 0;
        this.f52836m = false;
    }

    public void setTextSize(float f) {
        this.f52829f = f;
        TextView textView = this.f52824a;
        if (textView != null) {
            textView.setTextSize(0, f);
        }
        TextView textView2 = this.f52825b;
        if (textView2 != null) {
            textView2.setTextSize(0, f);
        }
    }

    public LiveHorizontalAutoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveHorizontalAutoScrollView(Context context) {
        this(context, null);
    }
}
