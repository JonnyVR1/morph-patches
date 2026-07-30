package com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.view;

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
import l.e9c0;
import l.t100;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ProfileLikeRemainingSwitcherView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f5322a;

    /* JADX INFO: renamed from: b */
    public HandlerC0383a f5323b;

    /* JADX INFO: renamed from: c */
    public int f5324c;

    /* JADX INFO: renamed from: d */
    public List<String> f5325d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0384b f5326e;

    /* JADX INFO: renamed from: f */
    public float f5327f;

    /* JADX INFO: renamed from: g */
    public int f5328g;

    /* JADX INFO: renamed from: h */
    public boolean f5329h;

    /* JADX INFO: renamed from: i */
    public boolean f5330i;

    /* JADX INFO: renamed from: j */
    public int f5331j;

    /* JADX INFO: renamed from: k */
    public float f5332k;

    /* JADX INFO: renamed from: l */
    public float f5333l;

    /* JADX INFO: renamed from: m */
    public boolean f5334m;

    /* JADX INFO: renamed from: n */
    public int f5335n;

    /* JADX INFO: renamed from: o */
    public int f5336o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView$a */
    public static final class HandlerC0383a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<ProfileLikeRemainingSwitcherView> f5337a;

        /* JADX INFO: renamed from: b */
        public int f5338b;

        public HandlerC0383a(ProfileLikeRemainingSwitcherView profileLikeRemainingSwitcherView, Looper looper) {
            super(looper);
            this.f5338b = 2500;
            this.f5337a = new WeakReference<>(profileLikeRemainingSwitcherView);
        }

        /* JADX INFO: renamed from: a */
        public void m7487a(int i) {
            this.f5338b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            ProfileLikeRemainingSwitcherView profileLikeRemainingSwitcherView = this.f5337a.get();
            if (profileLikeRemainingSwitcherView != null && message.what == 0) {
                int size = profileLikeRemainingSwitcherView.f5325d.size();
                if (size > 0) {
                    profileLikeRemainingSwitcherView.f5324c = (profileLikeRemainingSwitcherView.f5324c + 1) % size;
                    profileLikeRemainingSwitcherView.setText((CharSequence) profileLikeRemainingSwitcherView.f5325d.get(profileLikeRemainingSwitcherView.f5324c));
                    if (profileLikeRemainingSwitcherView.f5324c == size - 1) {
                        profileLikeRemainingSwitcherView.f5336o++;
                    }
                }
                if (size <= 1 || profileLikeRemainingSwitcherView.f5336o >= profileLikeRemainingSwitcherView.f5335n - 1) {
                    return;
                }
                sendEmptyMessageDelayed(0, this.f5338b);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView$b */
    public interface InterfaceC0384b {
        /* JADX INFO: renamed from: a */
        void mo7488a(int i);
    }

    public ProfileLikeRemainingSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5324c = -1;
        this.f5329h = false;
        this.f5330i = true;
        this.f5331j = 17;
        this.f5332k = 0.3f;
        this.f5333l = 0.0f;
        this.f5334m = false;
        this.f5335n = Integer.MAX_VALUE;
        this.f5336o = -1;
        m7482e(context, attributeSet);
    }

    private float getAnimationInFromY() {
        boolean z = this.f5330i;
        float f = this.f5332k;
        return z ? -f : f;
    }

    private float getAnimationOutToY() {
        boolean z = this.f5330i;
        float f = this.f5332k;
        return z ? f : -f;
    }

    /* JADX INFO: renamed from: e */
    public final void m7482e(Context context, AttributeSet attributeSet) {
        this.f5322a = context;
        this.f5325d = new ArrayList();
        this.f5323b = new HandlerC0383a(this, Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.j1);
        this.f5327f = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.m1, t100.f(13));
        this.f5328g = typedArrayObtainStyledAttributes.getColor(e9c0.l1, -1);
        this.f5334m = typedArrayObtainStyledAttributes.getBoolean(e9c0.k1, true);
        this.f5335n = typedArrayObtainStyledAttributes.getInt(e9c0.o1, Integer.MAX_VALUE);
        this.f5323b.m7487a(typedArrayObtainStyledAttributes.getInt(e9c0.n1, 2500));
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m7483f(View view) {
        int i;
        if (this.f5326e == null || this.f5325d.size() <= 0 || (i = this.f5324c) == -1) {
            return;
        }
        this.f5326e.mo7488a(i % this.f5325d.size());
    }

    /* JADX INFO: renamed from: g */
    public void m7484g(long j, boolean z, long j2) {
        if (this.f5329h) {
            return;
        }
        if (vwb.J(this.f5325d) || this.f5325d.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, getAnimationInFromY(), 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.f5333l, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(j);
        if (z && j2 > 0) {
            animationSet.setStartOffset(j2);
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, getAnimationOutToY());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, this.f5333l);
        animationSet2.addAnimation(translateAnimation2);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setDuration(j);
        if (z && j2 > 0) {
            animationSet2.setStartOffset(j2);
        }
        setInAnimation(animationSet);
        setOutAnimation(animationSet2);
    }

    /* JADX INFO: renamed from: h */
    public void m7485h() {
        if (this.f5329h) {
            return;
        }
        if (this.f5335n < Integer.MAX_VALUE) {
            this.f5336o = -1;
        }
        this.f5329h = true;
        this.f5323b.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: i */
    public void m7486i() {
        this.f5329h = false;
        if (this.f5335n < Integer.MAX_VALUE) {
            this.f5336o = -1;
        }
        this.f5323b.removeMessages(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f5322a);
        int i = xdl0.e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(this.f5331j);
        textView.setTextColor(this.f5328g);
        textView.setTextSize(0, this.f5327f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f5334m) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.gt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13731a.m7483f(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5323b.removeCallbacksAndMessages(null);
    }

    public void setAnimateDirection(boolean z) {
        this.f5330i = z;
    }

    public void setInOutAnimation(long j) {
        m7484g(j, false, 0L);
    }

    public void setOnItemClickListener(InterfaceC0384b interfaceC0384b) {
        this.f5326e = interfaceC0384b;
    }

    public void setOutAlpha(float f) {
        this.f5333l = f;
    }

    public void setOutTranslateY(float f) {
        this.f5332k = f;
    }

    public void setTextGravity(int i) {
        this.f5331j = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((TextView) getChildAt(i2)).setGravity(i);
        }
    }

    public void setTextList(List<String> list) {
        if (this.f5329h) {
            return;
        }
        this.f5325d.clear();
        this.f5325d.addAll(list);
        this.f5324c = -1;
    }

    public ProfileLikeRemainingSwitcherView(Context context) {
        this(context, null);
    }
}
