package com.p051p1.mobile.putong.core.p058ui.alifree;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.p051p1.mobile.putong.core.CoreModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.jbc0;
import p153l.jyb;
import p153l.phc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class AliFreeAutoView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Handler f29286a;

    /* JADX INFO: renamed from: b */
    public int f29287b;

    /* JADX INFO: renamed from: c */
    public List<String> f29288c;

    /* JADX INFO: renamed from: d */
    public long f29289d;

    /* JADX INFO: renamed from: e */
    public boolean f29290e;

    /* JADX INFO: renamed from: f */
    public int f29291f;

    /* JADX INFO: renamed from: g */
    public int f29292g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.alifree.AliFreeAutoView$a */
    public static final class HandlerC8448a extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<AliFreeAutoView> f29293a;

        public HandlerC8448a(AliFreeAutoView aliFreeAutoView) {
            this.f29293a = new WeakReference<>(aliFreeAutoView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AliFreeAutoView aliFreeAutoView = this.f29293a.get();
            if (aliFreeAutoView == null) {
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                removeCallbacksAndMessages(null);
                return;
            }
            int size = aliFreeAutoView.f29288c.size();
            if (size > 0) {
                aliFreeAutoView.f29287b = (aliFreeAutoView.f29287b + 1) % size;
                aliFreeAutoView.setText((CharSequence) aliFreeAutoView.f29288c.get(aliFreeAutoView.f29287b));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, aliFreeAutoView.f29289d);
            }
        }
    }

    public AliFreeAutoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29287b = -1;
        this.f29289d = 3000L;
        this.f29290e = false;
        int iM175859d = qa00.m175859d(12.0f);
        this.f29291f = iM175859d;
        this.f29292g = iM175859d + qa00.m175859d(5.0f);
        m45495e(context, attributeSet);
    }

    @Override // android.widget.TextSwitcher, android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public final void m45495e(Context context, AttributeSet attributeSet) {
        this.f29288c = new ArrayList();
        this.f29286a = new HandlerC8448a(this);
        context.obtainStyledAttributes(attributeSet, phc0.f152413a).recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public void m45496f() {
        this.f29290e = true;
        this.f29286a.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: g */
    public void m45497g() {
        this.f29290e = false;
        this.f29286a.sendEmptyMessage(1);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        int i = bnl0.f77545f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119720q), (Drawable) null, (Drawable) null, (Drawable) null);
        layoutParams.gravity = 1;
        textView.setGravity(1);
        textView.setCompoundDrawablePadding(qa00.m175859d(5.0f));
        textView.setTextColor(-1);
        textView.setTextSize(0, this.f29291f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29286a.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(long j) {
        if (this.f29290e) {
            return;
        }
        if (jyb.m147479J(this.f29288c) || this.f29288c.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f29292g, 0.0f);
        translateAnimation.setDuration(j);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.f29292g);
        translateAnimation2.setDuration(j);
        setInAnimation(translateAnimation);
        setOutAnimation(translateAnimation2);
    }

    public void setTextList(List<String> list) {
        if (this.f29290e) {
            return;
        }
        this.f29288c.clear();
        this.f29288c.addAll(list);
        if (!jyb.m147479J(list)) {
            setText(list.get(list.size() - 1));
        }
        this.f29287b = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f29290e) {
            return;
        }
        this.f29289d = j;
    }

    public AliFreeAutoView(Context context) {
        super(context);
        this.f29287b = -1;
        this.f29289d = 3000L;
        this.f29290e = false;
        int iM175859d = qa00.m175859d(12.0f);
        this.f29291f = iM175859d;
        this.f29292g = iM175859d + qa00.m175859d(5.0f);
    }
}
