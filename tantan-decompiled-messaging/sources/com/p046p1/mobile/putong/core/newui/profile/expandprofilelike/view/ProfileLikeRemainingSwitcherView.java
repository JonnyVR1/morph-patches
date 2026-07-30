package com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view;

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
import p149l.e9c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileLikeRemainingSwitcherView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f26544a;

    /* JADX INFO: renamed from: b */
    public HandlerC8219a f26545b;

    /* JADX INFO: renamed from: c */
    public int f26546c;

    /* JADX INFO: renamed from: d */
    public List<String> f26547d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8220b f26548e;

    /* JADX INFO: renamed from: f */
    public float f26549f;

    /* JADX INFO: renamed from: g */
    public int f26550g;

    /* JADX INFO: renamed from: h */
    public boolean f26551h;

    /* JADX INFO: renamed from: i */
    public boolean f26552i;

    /* JADX INFO: renamed from: j */
    public int f26553j;

    /* JADX INFO: renamed from: k */
    public float f26554k;

    /* JADX INFO: renamed from: l */
    public float f26555l;

    /* JADX INFO: renamed from: m */
    public boolean f26556m;

    /* JADX INFO: renamed from: n */
    public int f26557n;

    /* JADX INFO: renamed from: o */
    public int f26558o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView$a */
    public static final class HandlerC8219a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<ProfileLikeRemainingSwitcherView> f26559a;

        /* JADX INFO: renamed from: b */
        public int f26560b;

        public HandlerC8219a(ProfileLikeRemainingSwitcherView profileLikeRemainingSwitcherView, Looper looper) {
            super(looper);
            this.f26560b = 2500;
            this.f26559a = new WeakReference<>(profileLikeRemainingSwitcherView);
        }

        /* JADX INFO: renamed from: a */
        public void m43266a(int i) {
            this.f26560b = i;
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
            ProfileLikeRemainingSwitcherView profileLikeRemainingSwitcherView = this.f26559a.get();
            if (profileLikeRemainingSwitcherView != null && message.what == 0) {
                int size = profileLikeRemainingSwitcherView.f26547d.size();
                if (size > 0) {
                    profileLikeRemainingSwitcherView.f26546c = (profileLikeRemainingSwitcherView.f26546c + 1) % size;
                    profileLikeRemainingSwitcherView.setText((CharSequence) profileLikeRemainingSwitcherView.f26547d.get(profileLikeRemainingSwitcherView.f26546c));
                    if (profileLikeRemainingSwitcherView.f26546c == size - 1) {
                        profileLikeRemainingSwitcherView.f26558o++;
                    }
                }
                if (size <= 1 || profileLikeRemainingSwitcherView.f26558o >= profileLikeRemainingSwitcherView.f26557n - 1) {
                    return;
                }
                sendEmptyMessageDelayed(0, this.f26560b);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeRemainingSwitcherView$b */
    public interface InterfaceC8220b {
        /* JADX INFO: renamed from: a */
        void mo43267a(int i);
    }

    public ProfileLikeRemainingSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26546c = -1;
        this.f26551h = false;
        this.f26552i = true;
        this.f26553j = 17;
        this.f26554k = 0.3f;
        this.f26555l = 0.0f;
        this.f26556m = false;
        this.f26557n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f26558o = -1;
        m43261e(context, attributeSet);
    }

    private float getAnimationInFromY() {
        boolean z = this.f26552i;
        float f = this.f26554k;
        return z ? -f : f;
    }

    private float getAnimationOutToY() {
        boolean z = this.f26552i;
        float f = this.f26554k;
        return z ? f : -f;
    }

    /* JADX INFO: renamed from: e */
    public final void m43261e(Context context, AttributeSet attributeSet) {
        this.f26544a = context;
        this.f26547d = new ArrayList();
        this.f26545b = new HandlerC8219a(this, Looper.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90042j1);
        this.f26549f = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f90051m1, t100.m186892f(13));
        this.f26550g = typedArrayObtainStyledAttributes.getColor(e9c0.f90048l1, -1);
        this.f26556m = typedArrayObtainStyledAttributes.getBoolean(e9c0.f90045k1, true);
        this.f26557n = typedArrayObtainStyledAttributes.getInt(e9c0.f90057o1, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f26545b.m43266a(typedArrayObtainStyledAttributes.getInt(e9c0.f90054n1, 2500));
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m43262f(View view) {
        int i;
        if (this.f26548e == null || this.f26547d.size() <= 0 || (i = this.f26546c) == -1) {
            return;
        }
        this.f26548e.mo43267a(i % this.f26547d.size());
    }

    /* JADX INFO: renamed from: g */
    public void m43263g(long j, boolean z, long j2) {
        if (this.f26551h) {
            return;
        }
        if (vwb.m200296J(this.f26547d) || this.f26547d.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, getAnimationInFromY(), 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.f26555l, 1.0f);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(j);
        if (z && j2 > 0) {
            animationSet.setStartOffset(j2);
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, getAnimationOutToY());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, this.f26555l);
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
    public void m43264h() {
        if (this.f26551h) {
            return;
        }
        if (this.f26557n < Integer.MAX_VALUE) {
            this.f26558o = -1;
        }
        this.f26551h = true;
        this.f26545b.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: i */
    public void m43265i() {
        this.f26551h = false;
        if (this.f26557n < Integer.MAX_VALUE) {
            this.f26558o = -1;
        }
        this.f26545b.removeMessages(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f26544a);
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(this.f26553j);
        textView.setTextColor(this.f26550g);
        textView.setTextSize(0, this.f26549f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f26556m) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.gt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104264a.m43262f(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26545b.removeCallbacksAndMessages(null);
    }

    public void setAnimateDirection(boolean z) {
        this.f26552i = z;
    }

    public void setInOutAnimation(long j) {
        m43263g(j, false, 0L);
    }

    public void setOnItemClickListener(InterfaceC8220b interfaceC8220b) {
        this.f26548e = interfaceC8220b;
    }

    public void setOutAlpha(float f) {
        this.f26555l = f;
    }

    public void setOutTranslateY(float f) {
        this.f26554k = f;
    }

    public void setTextGravity(int i) {
        this.f26553j = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((TextView) getChildAt(i2)).setGravity(i);
        }
    }

    public void setTextList(List<String> list) {
        if (this.f26551h) {
            return;
        }
        this.f26547d.clear();
        this.f26547d.addAll(list);
        this.f26546c = -1;
    }

    public ProfileLikeRemainingSwitcherView(Context context) {
        this(context, null);
    }
}
