package com.p046p1.mobile.putong.live.livingroom.view;

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
import p149l.bt0;
import p149l.dt0;
import p149l.p9c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveHorizontalAutoScrollView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f51976a;

    /* JADX INFO: renamed from: b */
    public TextView f51977b;

    /* JADX INFO: renamed from: c */
    public List<String> f51978c;

    /* JADX INFO: renamed from: d */
    public int f51979d;

    /* JADX INFO: renamed from: e */
    public Runnable f51980e;

    /* JADX INFO: renamed from: f */
    public float f51981f;

    /* JADX INFO: renamed from: g */
    public int f51982g;

    /* JADX INFO: renamed from: h */
    public long f51983h;

    /* JADX INFO: renamed from: i */
    public long f51984i;

    /* JADX INFO: renamed from: j */
    public int f51985j;

    /* JADX INFO: renamed from: k */
    public boolean f51986k;

    /* JADX INFO: renamed from: l */
    public Animator f51987l;

    /* JADX INFO: renamed from: m */
    public boolean f51988m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveHorizontalAutoScrollView$a */
    public interface InterfaceC12929a {
    }

    public LiveHorizontalAutoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51979d = 0;
        this.f51983h = 3000L;
        this.f51984i = 3000L;
        this.f51985j = t100.m186890d(20.0f);
        this.f51986k = false;
        this.f51988m = false;
        m76520f(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public final TextView m76519e() {
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(8388627);
        textView.setTextColor(this.f51982g);
        textView.setTextSize(0, this.f51981f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.bxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77820a.m76522h(view);
            }
        });
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public final void m76520f(Context context, AttributeSet attributeSet) {
        this.f51978c = new ArrayList();
        this.f51980e = new Runnable() { // from class: l.zws
            @Override // java.lang.Runnable
            public final void run() {
                this.f205258a.m76528n();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147717a);
        this.f51981f = typedArrayObtainStyledAttributes.getDimensionPixelSize(p9c0.f147723d, t100.m186892f(13));
        this.f51982g = typedArrayObtainStyledAttributes.getColor(p9c0.f147721c, -1);
        typedArrayObtainStyledAttributes.recycle();
        m76521g();
    }

    /* JADX INFO: renamed from: g */
    public final void m76521g() {
        TextView textViewM76519e = m76519e();
        this.f51976a = textViewM76519e;
        addView(textViewM76519e);
        TextView textViewM76519e2 = m76519e();
        this.f51977b = textViewM76519e2;
        textViewM76519e2.setVisibility(8);
        addView(this.f51977b);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m76522h(View view) {
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76523i() {
        TextView textView = this.f51976a;
        TextView textView2 = this.f51977b;
        this.f51976a = textView2;
        this.f51977b = textView;
        textView2.setTranslationX(0.0f);
        this.f51977b.setTranslationX(0.0f);
        this.f51977b.setVisibility(8);
        if (this.f51986k) {
            postDelayed(this.f51980e, this.f51984i);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m76524j() {
        int width = getWidth();
        if (width > 0) {
            this.f51976a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            xdl0.m208327D0(this.f51976a.getMeasuredWidth(), this.f51976a);
            int measuredWidth = this.f51976a.getMeasuredWidth();
            if (this.f51988m && measuredWidth <= (width - getPaddingLeft()) - getPaddingRight()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51976a.getLayoutParams();
                layoutParams.gravity = 17;
                this.f51976a.setLayoutParams(layoutParams);
                return;
            }
        }
        this.f51986k = true;
        m76525k();
    }

    /* JADX INFO: renamed from: k */
    public final void m76525k() {
        if (this.f51976a == null || this.f51977b == null) {
            return;
        }
        Animator animator = this.f51987l;
        if (animator != null) {
            dt0.m113501A(animator);
        }
        int size = this.f51978c.size();
        if (size == 0) {
            return;
        }
        int i = this.f51979d;
        int i2 = (i + 1) % size;
        String str = this.f51978c.get(i);
        String str2 = this.f51978c.get(i2);
        this.f51976a.setText(str);
        this.f51976a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51976a.getLayoutParams();
        layoutParams.width = this.f51976a.getMeasuredWidth();
        layoutParams.gravity = 8388627;
        this.f51976a.setLayoutParams(layoutParams);
        int measuredWidth = this.f51976a.getMeasuredWidth() + this.f51985j;
        this.f51977b.setText(str2);
        this.f51977b.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f51977b.getLayoutParams();
        layoutParams2.width = this.f51977b.getMeasuredWidth();
        layoutParams2.gravity = 8388627;
        this.f51977b.setLayoutParams(layoutParams2);
        this.f51977b.setVisibility(0);
        this.f51976a.setTranslationX(0.0f);
        float f = measuredWidth;
        this.f51977b.setTranslationX(f);
        Animator animatorM103753z = bt0.m103753z(ObjectAnimator.ofFloat(this.f51976a, "translationX", 0.0f, -measuredWidth), ObjectAnimator.ofFloat(this.f51977b, "translationX", f, 0.0f));
        animatorM103753z.setDuration(this.f51983h);
        animatorM103753z.setInterpolator(new LinearInterpolator());
        this.f51987l = animatorM103753z;
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.cxs
            @Override // java.lang.Runnable
            public final void run() {
                this.f82888a.m76523i();
            }
        });
        animatorM103753z.start();
    }

    /* JADX INFO: renamed from: l */
    public void m76526l() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51976a.getLayoutParams();
        layoutParams.gravity = 17;
        this.f51976a.setLayoutParams(layoutParams);
        removeCallbacks(this.f51980e);
        Animator animator = this.f51987l;
        if (animator != null) {
            dt0.m113501A(animator);
            this.f51987l = null;
        }
        TextView textView = this.f51976a;
        if (textView != null) {
            textView.setTranslationX(0.0f);
            this.f51976a.setVisibility(0);
        }
        TextView textView2 = this.f51977b;
        if (textView2 != null) {
            textView2.setTranslationX(0.0f);
            this.f51977b.setVisibility(8);
        }
        this.f51979d = 0;
        this.f51986k = false;
    }

    /* JADX INFO: renamed from: m */
    public void m76527m() {
        TextView textView;
        if (this.f51986k || vwb.m200296J(this.f51978c)) {
            return;
        }
        m76526l();
        String str = this.f51978c.get(0);
        if (TextUtils.isEmpty(str) || (textView = this.f51976a) == null) {
            this.f51986k = true;
            m76525k();
        } else {
            textView.setText(str);
            post(new Runnable() { // from class: l.axs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72233a.m76524j();
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m76528n() {
        int size = this.f51978c.size();
        if (size == 0) {
            return;
        }
        this.f51979d = (this.f51979d + 1) % size;
        m76525k();
    }

    public void setGap(int i) {
        this.f51985j = i;
    }

    public void setOnItemClickListener(InterfaceC12929a interfaceC12929a) {
    }

    public void setScrollDuration(long j) {
        if (this.f51986k) {
            return;
        }
        this.f51983h = Math.max(100L, j);
    }

    public void setSingleText(String str) {
        m76526l();
        this.f51978c.clear();
        if (!TextUtils.isEmpty(str)) {
            this.f51978c.add(str);
            this.f51978c.add(str);
        }
        this.f51976a.setText(str);
        this.f51979d = 0;
        this.f51988m = true;
    }

    public void setStillTime(long j) {
        if (this.f51986k) {
            return;
        }
        this.f51984i = Math.max(0L, j);
    }

    public void setTextColor(@ColorInt int i) {
        this.f51982g = i;
        TextView textView = this.f51976a;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.f51977b;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
    }

    public void setTextList(List<String> list) {
        m76526l();
        this.f51978c.clear();
        if (list != null) {
            this.f51978c.addAll(list);
        }
        this.f51979d = 0;
        this.f51988m = false;
    }

    public void setTextSize(float f) {
        this.f51981f = f;
        TextView textView = this.f51976a;
        if (textView != null) {
            textView.setTextSize(0, f);
        }
        TextView textView2 = this.f51977b;
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
