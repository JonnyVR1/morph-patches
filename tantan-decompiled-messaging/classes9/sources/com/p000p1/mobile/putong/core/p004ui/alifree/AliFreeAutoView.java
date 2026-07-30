package com.p000p1.mobile.putong.core.p004ui.alifree;

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
import com.p000p1.mobile.putong.core.CoreModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import l.d3c0;
import l.j9c0;
import l.t100;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AliFreeAutoView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Handler f4505a;

    /* JADX INFO: renamed from: b */
    public int f4506b;

    /* JADX INFO: renamed from: c */
    public List<String> f4507c;

    /* JADX INFO: renamed from: d */
    public long f4508d;

    /* JADX INFO: renamed from: e */
    public boolean f4509e;

    /* JADX INFO: renamed from: f */
    public int f4510f;

    /* JADX INFO: renamed from: g */
    public int f4511g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.alifree.AliFreeAutoView$a */
    public static final class HandlerC0201a extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<AliFreeAutoView> f4512a;

        public HandlerC0201a(AliFreeAutoView aliFreeAutoView) {
            this.f4512a = new WeakReference<>(aliFreeAutoView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AliFreeAutoView aliFreeAutoView = this.f4512a.get();
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
            int size = aliFreeAutoView.f4507c.size();
            if (size > 0) {
                aliFreeAutoView.f4506b = (aliFreeAutoView.f4506b + 1) % size;
                aliFreeAutoView.setText((CharSequence) aliFreeAutoView.f4507c.get(aliFreeAutoView.f4506b));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, aliFreeAutoView.f4508d);
            }
        }
    }

    public AliFreeAutoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4506b = -1;
        this.f4508d = 3000L;
        this.f4509e = false;
        int iD = t100.d(12.0f);
        this.f4510f = iD;
        this.f4511g = iD + t100.d(5.0f);
        m7268e(context, attributeSet);
    }

    @Override // android.widget.TextSwitcher, android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public final void m7268e(Context context, AttributeSet attributeSet) {
        this.f4507c = new ArrayList();
        this.f4505a = new HandlerC0201a(this);
        context.obtainStyledAttributes(attributeSet, j9c0.a).recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public void m7269f() {
        this.f4509e = true;
        this.f4505a.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: g */
    public void m7270g() {
        this.f4509e = false;
        this.f4505a.sendEmptyMessage(1);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        int i = xdl0.f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f1533b.getResources().getDrawable(d3c0.q), (Drawable) null, (Drawable) null, (Drawable) null);
        layoutParams.gravity = 1;
        textView.setGravity(1);
        textView.setCompoundDrawablePadding(t100.d(5.0f));
        textView.setTextColor(-1);
        textView.setTextSize(0, this.f4510f);
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
        this.f4505a.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(long j) {
        if (this.f4509e) {
            return;
        }
        if (vwb.J(this.f4507c) || this.f4507c.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f4511g, 0.0f);
        translateAnimation.setDuration(j);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.f4511g);
        translateAnimation2.setDuration(j);
        setInAnimation(translateAnimation);
        setOutAnimation(translateAnimation2);
    }

    public void setTextList(List<String> list) {
        if (this.f4509e) {
            return;
        }
        this.f4507c.clear();
        this.f4507c.addAll(list);
        if (!vwb.J(list)) {
            setText(list.get(list.size() - 1));
        }
        this.f4506b = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f4509e) {
            return;
        }
        this.f4508d = j;
    }

    public AliFreeAutoView(Context context) {
        super(context);
        this.f4506b = -1;
        this.f4508d = 3000L;
        this.f4509e = false;
        int iD = t100.d(12.0f);
        this.f4510f = iD;
        this.f4511g = iD + t100.d(5.0f);
    }
}
