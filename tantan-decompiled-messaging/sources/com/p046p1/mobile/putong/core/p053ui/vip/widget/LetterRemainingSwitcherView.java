package com.p046p1.mobile.putong.core.p053ui.vip.widget;

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
import org.jetbrains.annotations.NotNull;
import p149l.r9c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class LetterRemainingSwitcherView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f37992a;

    /* JADX INFO: renamed from: b */
    public HandlerC9031a f37993b;

    /* JADX INFO: renamed from: c */
    public int f37994c;

    /* JADX INFO: renamed from: d */
    public List<String> f37995d;

    /* JADX INFO: renamed from: e */
    public float f37996e;

    /* JADX INFO: renamed from: f */
    public int f37997f;

    /* JADX INFO: renamed from: g */
    public boolean f37998g;

    /* JADX INFO: renamed from: h */
    public boolean f37999h;

    /* JADX INFO: renamed from: i */
    public int f38000i;

    /* JADX INFO: renamed from: j */
    public float f38001j;

    /* JADX INFO: renamed from: k */
    public float f38002k;

    /* JADX INFO: renamed from: l */
    public boolean f38003l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView$a */
    public static final class HandlerC9031a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<LetterRemainingSwitcherView> f38004a;

        /* JADX INFO: renamed from: b */
        public int f38005b;

        public HandlerC9031a(LetterRemainingSwitcherView letterRemainingSwitcherView, Looper looper) {
            super(looper);
            this.f38005b = 2500;
            this.f38004a = new WeakReference<>(letterRemainingSwitcherView);
        }

        /* JADX INFO: renamed from: a */
        public void m57727a(int i) {
            this.f38005b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            LetterRemainingSwitcherView letterRemainingSwitcherView = this.f38004a.get();
            if (letterRemainingSwitcherView != null && message.what == 0) {
                int size = letterRemainingSwitcherView.f37995d.size();
                if (size > 0) {
                    letterRemainingSwitcherView.f37994c = (letterRemainingSwitcherView.f37994c + 1) % size;
                    letterRemainingSwitcherView.setText((CharSequence) letterRemainingSwitcherView.f37995d.get(letterRemainingSwitcherView.f37994c));
                }
                if (size > 1) {
                    sendEmptyMessageDelayed(0, this.f38005b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView$b */
    public interface InterfaceC9032b {
    }

    public LetterRemainingSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37994c = -1;
        this.f37998g = false;
        this.f37999h = true;
        this.f38000i = 17;
        this.f38001j = 0.3f;
        this.f38002k = 0.0f;
        this.f38003l = false;
        m57722e(context, attributeSet);
    }

    private float getAnimationInFromY() {
        boolean z = this.f37999h;
        float f = this.f38001j;
        return z ? -f : f;
    }

    private float getAnimationOutToY() {
        boolean z = this.f37999h;
        float f = this.f38001j;
        return z ? f : -f;
    }

    /* JADX INFO: renamed from: e */
    public final void m57722e(Context context, AttributeSet attributeSet) {
        this.f37992a = context;
        this.f37995d = new ArrayList();
        this.f37993b = new HandlerC9031a(this, Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158343p);
        this.f37996e = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.f158346s, t100.m186892f(13));
        this.f37997f = typedArrayObtainStyledAttributes.getColor(r9c0.f158345r, -1);
        this.f38003l = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158344q, true);
        this.f37993b.m57727a(typedArrayObtainStyledAttributes.getInt(r9c0.f158347t, 2500));
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m57723f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public void m57724g(long j, boolean z, long j2) {
        if (this.f37998g) {
            return;
        }
        if (vwb.m200296J(this.f37995d) || this.f37995d.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, getAnimationInFromY(), 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.f38002k, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(j);
        if (z && j2 > 0) {
            animationSet.setStartOffset(j2);
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, getAnimationOutToY());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, this.f38002k);
        animationSet2.addAnimation(translateAnimation2);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setDuration(j);
        setInAnimation(animationSet);
        setOutAnimation(animationSet2);
    }

    /* JADX INFO: renamed from: h */
    public void m57725h() {
        if (this.f37998g) {
            return;
        }
        this.f37998g = true;
        this.f37993b.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: i */
    public void m57726i() {
        this.f37998g = false;
        this.f37993b.removeMessages(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f37992a);
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(this.f38000i);
        textView.setTextColor(this.f37997f);
        textView.setTextSize(0, this.f37996e);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f38003l) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.cbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80178a.m57723f(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37993b.removeCallbacksAndMessages(null);
    }

    public void setAnimateDirection(boolean z) {
        this.f37999h = z;
    }

    public void setInOutAnimation(long j) {
        m57724g(j, false, 0L);
    }

    public void setIntervalMills(int i) {
        HandlerC9031a handlerC9031a = this.f37993b;
        if (handlerC9031a != null) {
            handlerC9031a.m57727a(i);
        }
    }

    public void setOnItemClickListener(InterfaceC9032b interfaceC9032b) {
    }

    public void setOutAlpha(float f) {
        this.f38002k = f;
    }

    public void setOutTranslateY(float f) {
        this.f38001j = f;
    }

    public void setTextBold(boolean z) {
        this.f38003l = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof TextView) {
                ((TextView) getChildAt(i)).setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    public void setTextColor(int i) {
        this.f37997f = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2) instanceof TextView) {
                ((TextView) getChildAt(i2)).setTextColor(i);
            }
        }
    }

    public void setTextGravity(int i) {
        this.f38000i = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2) instanceof TextView) {
                ((TextView) getChildAt(i2)).setGravity(i);
            }
        }
    }

    public void setTextList(List<String> list) {
        if (this.f37998g) {
            return;
        }
        this.f37995d.clear();
        this.f37995d.addAll(list);
        this.f37994c = -1;
    }

    public LetterRemainingSwitcherView(Context context) {
        this(context, null);
    }
}
