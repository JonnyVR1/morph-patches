package com.p051p1.mobile.putong.core.p058ui.vip.widget;

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
import p153l.bnl0;
import p153l.jyb;
import p153l.qa00;
import p153l.xhc0;

/* JADX INFO: loaded from: classes12.dex */
public class LetterRemainingSwitcherView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f38840a;

    /* JADX INFO: renamed from: b */
    public HandlerC9194a f38841b;

    /* JADX INFO: renamed from: c */
    public int f38842c;

    /* JADX INFO: renamed from: d */
    public List<String> f38843d;

    /* JADX INFO: renamed from: e */
    public float f38844e;

    /* JADX INFO: renamed from: f */
    public int f38845f;

    /* JADX INFO: renamed from: g */
    public boolean f38846g;

    /* JADX INFO: renamed from: h */
    public boolean f38847h;

    /* JADX INFO: renamed from: i */
    public int f38848i;

    /* JADX INFO: renamed from: j */
    public float f38849j;

    /* JADX INFO: renamed from: k */
    public float f38850k;

    /* JADX INFO: renamed from: l */
    public boolean f38851l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView$a */
    public static final class HandlerC9194a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<LetterRemainingSwitcherView> f38852a;

        /* JADX INFO: renamed from: b */
        public int f38853b;

        public HandlerC9194a(LetterRemainingSwitcherView letterRemainingSwitcherView, Looper looper) {
            super(looper);
            this.f38853b = 2500;
            this.f38852a = new WeakReference<>(letterRemainingSwitcherView);
        }

        /* JADX INFO: renamed from: a */
        public void m58910a(int i) {
            this.f38853b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            LetterRemainingSwitcherView letterRemainingSwitcherView = this.f38852a.get();
            if (letterRemainingSwitcherView != null && message.what == 0) {
                int size = letterRemainingSwitcherView.f38843d.size();
                if (size > 0) {
                    letterRemainingSwitcherView.f38842c = (letterRemainingSwitcherView.f38842c + 1) % size;
                    letterRemainingSwitcherView.setText((CharSequence) letterRemainingSwitcherView.f38843d.get(letterRemainingSwitcherView.f38842c));
                }
                if (size > 1) {
                    sendEmptyMessageDelayed(0, this.f38853b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView$b */
    public interface InterfaceC9195b {
    }

    public LetterRemainingSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38842c = -1;
        this.f38846g = false;
        this.f38847h = true;
        this.f38848i = 17;
        this.f38849j = 0.3f;
        this.f38850k = 0.0f;
        this.f38851l = false;
        m58905e(context, attributeSet);
    }

    private float getAnimationInFromY() {
        boolean z = this.f38847h;
        float f = this.f38849j;
        return z ? -f : f;
    }

    private float getAnimationOutToY() {
        boolean z = this.f38847h;
        float f = this.f38849j;
        return z ? f : -f;
    }

    /* JADX INFO: renamed from: e */
    public final void m58905e(Context context, AttributeSet attributeSet) {
        this.f38840a = context;
        this.f38843d = new ArrayList();
        this.f38841b = new HandlerC9194a(this, Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194343p);
        this.f38844e = typedArrayObtainStyledAttributes.getDimensionPixelSize(xhc0.f194346s, qa00.m175861f(13));
        this.f38845f = typedArrayObtainStyledAttributes.getColor(xhc0.f194345r, -1);
        this.f38851l = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194344q, true);
        this.f38841b.m58910a(typedArrayObtainStyledAttributes.getInt(xhc0.f194347t, 2500));
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m58906f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public void m58907g(long j, boolean z, long j2) {
        if (this.f38846g) {
            return;
        }
        if (jyb.m147479J(this.f38843d) || this.f38843d.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, getAnimationInFromY(), 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.f38850k, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(j);
        if (z && j2 > 0) {
            animationSet.setStartOffset(j2);
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, getAnimationOutToY());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, this.f38850k);
        animationSet2.addAnimation(translateAnimation2);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setDuration(j);
        setInAnimation(animationSet);
        setOutAnimation(animationSet2);
    }

    /* JADX INFO: renamed from: h */
    public void m58908h() {
        if (this.f38846g) {
            return;
        }
        this.f38846g = true;
        this.f38841b.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: i */
    public void m58909i() {
        this.f38846g = false;
        this.f38841b.removeMessages(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f38840a);
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(this.f38848i);
        textView.setTextColor(this.f38845f);
        textView.setTextSize(0, this.f38844e);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f38851l) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.edr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93571a.m58906f(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38841b.removeCallbacksAndMessages(null);
    }

    public void setAnimateDirection(boolean z) {
        this.f38847h = z;
    }

    public void setInOutAnimation(long j) {
        m58907g(j, false, 0L);
    }

    public void setIntervalMills(int i) {
        HandlerC9194a handlerC9194a = this.f38841b;
        if (handlerC9194a != null) {
            handlerC9194a.m58910a(i);
        }
    }

    public void setOnItemClickListener(InterfaceC9195b interfaceC9195b) {
    }

    public void setOutAlpha(float f) {
        this.f38850k = f;
    }

    public void setOutTranslateY(float f) {
        this.f38849j = f;
    }

    public void setTextBold(boolean z) {
        this.f38851l = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof TextView) {
                ((TextView) getChildAt(i)).setTypeface(Typeface.DEFAULT_BOLD);
            }
        }
    }

    public void setTextColor(int i) {
        this.f38845f = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2) instanceof TextView) {
                ((TextView) getChildAt(i2)).setTextColor(i);
            }
        }
    }

    public void setTextGravity(int i) {
        this.f38848i = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2) instanceof TextView) {
                ((TextView) getChildAt(i2)).setGravity(i);
            }
        }
    }

    public void setTextList(List<String> list) {
        if (this.f38846g) {
            return;
        }
        this.f38843d.clear();
        this.f38843d.addAll(list);
        this.f38842c = -1;
    }

    public LetterRemainingSwitcherView(Context context) {
        this(context, null);
    }
}
