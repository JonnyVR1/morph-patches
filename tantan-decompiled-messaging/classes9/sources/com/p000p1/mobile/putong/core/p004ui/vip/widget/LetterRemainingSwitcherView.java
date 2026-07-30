package com.p000p1.mobile.putong.core.p004ui.vip.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import l.r9c0;
import l.t100;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LetterRemainingSwitcherView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f7773a;

    /* JADX INFO: renamed from: b */
    public HandlerC0467a f7774b;

    /* JADX INFO: renamed from: c */
    public int f7775c;

    /* JADX INFO: renamed from: d */
    public List<String> f7776d;

    /* JADX INFO: renamed from: e */
    public float f7777e;

    /* JADX INFO: renamed from: f */
    public int f7778f;

    /* JADX INFO: renamed from: g */
    public boolean f7779g;

    /* JADX INFO: renamed from: h */
    public boolean f7780h;

    /* JADX INFO: renamed from: i */
    public int f7781i;

    /* JADX INFO: renamed from: j */
    public float f7782j;

    /* JADX INFO: renamed from: k */
    public float f7783k;

    /* JADX INFO: renamed from: l */
    public boolean f7784l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView$a */
    public static final class HandlerC0467a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<LetterRemainingSwitcherView> f7785a;

        /* JADX INFO: renamed from: b */
        public int f7786b;

        public HandlerC0467a(LetterRemainingSwitcherView letterRemainingSwitcherView, Looper looper) {
            super(looper);
            this.f7786b = 2500;
            this.f7785a = new WeakReference<>(letterRemainingSwitcherView);
        }

        /* JADX INFO: renamed from: a */
        public void m11223a(int i) {
            this.f7786b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            LetterRemainingSwitcherView letterRemainingSwitcherView = this.f7785a.get();
            if (letterRemainingSwitcherView != null && message.what == 0) {
                int size = letterRemainingSwitcherView.f7776d.size();
                if (size > 0) {
                    letterRemainingSwitcherView.f7775c = (letterRemainingSwitcherView.f7775c + 1) % size;
                    letterRemainingSwitcherView.setText((CharSequence) letterRemainingSwitcherView.f7776d.get(letterRemainingSwitcherView.f7775c));
                }
                if (size > 1) {
                    sendEmptyMessageDelayed(0, this.f7786b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView$b */
    public interface InterfaceC0468b {
    }

    public LetterRemainingSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7775c = -1;
        this.f7779g = false;
        this.f7780h = true;
        this.f7781i = 17;
        this.f7782j = 0.3f;
        this.f7783k = 0.0f;
        this.f7784l = false;
        m11218e(context, attributeSet);
    }

    private float getAnimationInFromY() {
        boolean z = this.f7780h;
        float f = this.f7782j;
        return z ? -f : f;
    }

    private float getAnimationOutToY() {
        boolean z = this.f7780h;
        float f = this.f7782j;
        return z ? f : -f;
    }

    /* JADX INFO: renamed from: e */
    public final void m11218e(Context context, AttributeSet attributeSet) {
        this.f7773a = context;
        this.f7776d = new ArrayList();
        this.f7774b = new HandlerC0467a(this, Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.p);
        this.f7777e = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.s, t100.f(13));
        this.f7778f = typedArrayObtainStyledAttributes.getColor(r9c0.r, -1);
        this.f7784l = typedArrayObtainStyledAttributes.getBoolean(r9c0.q, true);
        this.f7774b.m11223a(typedArrayObtainStyledAttributes.getInt(r9c0.t, 2500));
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m11219f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public void m11220g(long j, boolean z, long j2) {
        if (this.f7779g) {
            return;
        }
        if (vwb.J(this.f7776d) || this.f7776d.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, getAnimationInFromY(), 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.f7783k, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(j);
        if (z && j2 > 0) {
            animationSet.setStartOffset(j2);
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, getAnimationOutToY());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, this.f7783k);
        animationSet2.addAnimation(translateAnimation2);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setDuration(j);
        setInAnimation(animationSet);
        setOutAnimation(animationSet2);
    }

    /* JADX INFO: renamed from: h */
    public void m11221h() {
        if (this.f7779g) {
            return;
        }
        this.f7779g = true;
        this.f7774b.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: i */
    public void m11222i() {
        this.f7779g = false;
        this.f7774b.removeMessages(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f7773a);
        int i = xdl0.e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(this.f7781i);
        textView.setTextColor(this.f7778f);
        textView.setTextSize(0, this.f7777e);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f7784l) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.cbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9584a.m11219f(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7774b.removeCallbacksAndMessages(null);
    }

    public void setAnimateDirection(boolean z) {
        this.f7780h = z;
    }

    public void setInOutAnimation(long j) {
        m11220g(j, false, 0L);
    }

    public void setIntervalMills(int i) {
        HandlerC0467a handlerC0467a = this.f7774b;
        if (handlerC0467a != null) {
            handlerC0467a.m11223a(i);
        }
    }

    public void setOnItemClickListener(InterfaceC0468b interfaceC0468b) {
    }

    public void setOutAlpha(float f) {
        this.f7783k = f;
    }

    public void setOutTranslateY(float f) {
        this.f7782j = f;
    }

    public void setTextBold(boolean z) {
        this.f7784l = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof TextView) {
                ((TextView) getChildAt(i)).setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    public void setTextColor(int i) {
        this.f7778f = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2) instanceof TextView) {
                ((TextView) getChildAt(i2)).setTextColor(i);
            }
        }
    }

    public void setTextGravity(int i) {
        this.f7781i = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2) instanceof TextView) {
                ((TextView) getChildAt(i2)).setGravity(i);
            }
        }
    }

    public void setTextList(List<String> list) {
        if (this.f7779g) {
            return;
        }
        this.f7776d.clear();
        this.f7776d.addAll(list);
        this.f7775c = -1;
    }

    public LetterRemainingSwitcherView(Context context) {
        this(context, null);
    }
}
