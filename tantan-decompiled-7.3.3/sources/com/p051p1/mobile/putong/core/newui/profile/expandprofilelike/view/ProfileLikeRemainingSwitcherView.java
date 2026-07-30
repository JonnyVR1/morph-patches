package com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view;

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
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.jyb;
import p153l.khc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileLikeRemainingSwitcherView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f27286a;

    /* JADX INFO: renamed from: b */
    public HandlerC8370a f27287b;

    /* JADX INFO: renamed from: c */
    public int f27288c;

    /* JADX INFO: renamed from: d */
    public List<String> f27289d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8371b f27290e;

    /* JADX INFO: renamed from: f */
    public float f27291f;

    /* JADX INFO: renamed from: g */
    public int f27292g;

    /* JADX INFO: renamed from: h */
    public boolean f27293h;

    /* JADX INFO: renamed from: i */
    public boolean f27294i;

    /* JADX INFO: renamed from: j */
    public int f27295j;

    /* JADX INFO: renamed from: k */
    public float f27296k;

    /* JADX INFO: renamed from: l */
    public float f27297l;

    /* JADX INFO: renamed from: m */
    public boolean f27298m;

    /* JADX INFO: renamed from: n */
    public int f27299n;

    /* JADX INFO: renamed from: o */
    public int f27300o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView$a */
    public static final class HandlerC8370a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<ProfileLikeRemainingSwitcherView> f27301a;

        /* JADX INFO: renamed from: b */
        public int f27302b;

        public HandlerC8370a(ProfileLikeRemainingSwitcherView profileLikeRemainingSwitcherView, Looper looper) {
            super(looper);
            this.f27302b = 2500;
            this.f27301a = new WeakReference<>(profileLikeRemainingSwitcherView);
        }

        /* JADX INFO: renamed from: a */
        public void m44277a(int i) {
            this.f27302b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            ProfileLikeRemainingSwitcherView profileLikeRemainingSwitcherView = this.f27301a.get();
            if (profileLikeRemainingSwitcherView != null && message.what == 0) {
                int size = profileLikeRemainingSwitcherView.f27289d.size();
                if (size > 0) {
                    profileLikeRemainingSwitcherView.f27288c = (profileLikeRemainingSwitcherView.f27288c + 1) % size;
                    profileLikeRemainingSwitcherView.setText((CharSequence) profileLikeRemainingSwitcherView.f27289d.get(profileLikeRemainingSwitcherView.f27288c));
                    if (profileLikeRemainingSwitcherView.f27288c == size - 1) {
                        profileLikeRemainingSwitcherView.f27300o++;
                    }
                }
                if (size <= 1 || profileLikeRemainingSwitcherView.f27300o >= profileLikeRemainingSwitcherView.f27299n - 1) {
                    return;
                }
                sendEmptyMessageDelayed(0, this.f27302b);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView$b */
    public interface InterfaceC8371b {
        /* JADX INFO: renamed from: a */
        void mo44278a(int i);
    }

    public ProfileLikeRemainingSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27288c = -1;
        this.f27293h = false;
        this.f27294i = true;
        this.f27295j = 17;
        this.f27296k = 0.3f;
        this.f27297l = 0.0f;
        this.f27298m = false;
        this.f27299n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f27300o = -1;
        m44272e(context, attributeSet);
    }

    private float getAnimationInFromY() {
        boolean z = this.f27294i;
        float f = this.f27296k;
        return z ? -f : f;
    }

    private float getAnimationOutToY() {
        boolean z = this.f27294i;
        float f = this.f27296k;
        return z ? f : -f;
    }

    /* JADX INFO: renamed from: e */
    public final void m44272e(Context context, AttributeSet attributeSet) {
        this.f27286a = context;
        this.f27289d = new ArrayList();
        this.f27287b = new HandlerC8370a(this, Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126812j1);
        this.f27291f = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126821m1, qa00.m175861f(13));
        this.f27292g = typedArrayObtainStyledAttributes.getColor(khc0.f126818l1, -1);
        this.f27298m = typedArrayObtainStyledAttributes.getBoolean(khc0.f126815k1, true);
        this.f27299n = typedArrayObtainStyledAttributes.getInt(khc0.f126827o1, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f27287b.m44277a(typedArrayObtainStyledAttributes.getInt(khc0.f126824n1, 2500));
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m44273f(View view) {
        int i;
        if (this.f27290e == null || this.f27289d.size() <= 0 || (i = this.f27288c) == -1) {
            return;
        }
        this.f27290e.mo44278a(i % this.f27289d.size());
    }

    /* JADX INFO: renamed from: g */
    public void m44274g(long j, boolean z, long j2) {
        if (this.f27293h) {
            return;
        }
        if (jyb.m147479J(this.f27289d) || this.f27289d.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, getAnimationInFromY(), 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.f27297l, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(j);
        if (z && j2 > 0) {
            animationSet.setStartOffset(j2);
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, getAnimationOutToY());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, this.f27297l);
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
    public void m44275h() {
        if (this.f27293h) {
            return;
        }
        if (this.f27299n < Integer.MAX_VALUE) {
            this.f27300o = -1;
        }
        this.f27293h = true;
        this.f27287b.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: i */
    public void m44276i() {
        this.f27293h = false;
        if (this.f27299n < Integer.MAX_VALUE) {
            this.f27300o = -1;
        }
        this.f27287b.removeMessages(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f27286a);
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(this.f27295j);
        textView.setTextColor(this.f27292g);
        textView.setTextSize(0, this.f27291f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f27298m) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.k1a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123465a.m44273f(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27287b.removeCallbacksAndMessages(null);
    }

    public void setAnimateDirection(boolean z) {
        this.f27294i = z;
    }

    public void setInOutAnimation(long j) {
        m44274g(j, false, 0L);
    }

    public void setOnItemClickListener(InterfaceC8371b interfaceC8371b) {
        this.f27290e = interfaceC8371b;
    }

    public void setOutAlpha(float f) {
        this.f27297l = f;
    }

    public void setOutTranslateY(float f) {
        this.f27296k = f;
    }

    public void setTextGravity(int i) {
        this.f27295j = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((TextView) getChildAt(i2)).setGravity(i);
        }
    }

    public void setTextList(List<String> list) {
        if (this.f27293h) {
            return;
        }
        this.f27289d.clear();
        this.f27289d.addAll(list);
        this.f27288c = -1;
    }

    public ProfileLikeRemainingSwitcherView(Context context) {
        this(context, null);
    }
}
