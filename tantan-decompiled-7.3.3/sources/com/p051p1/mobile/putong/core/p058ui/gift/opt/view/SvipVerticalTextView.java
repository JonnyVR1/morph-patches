package com.p051p1.mobile.putong.core.p058ui.gift.opt.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
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
import p153l.bnl0;
import p153l.jyb;
import p153l.lyh0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class SvipVerticalTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public final Handler f30112a;

    /* JADX INFO: renamed from: b */
    public int f30113b;

    /* JADX INFO: renamed from: c */
    public final List<String> f30114c;

    /* JADX INFO: renamed from: d */
    public long f30115d;

    /* JADX INFO: renamed from: e */
    public boolean f30116e;

    /* JADX INFO: renamed from: f */
    public final List<Integer> f30117f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.SvipVerticalTextView$a */
    public static final class HandlerC8507a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SvipVerticalTextView> f30118a;

        public HandlerC8507a(SvipVerticalTextView svipVerticalTextView) {
            super(Looper.getMainLooper());
            this.f30118a = new WeakReference<>(svipVerticalTextView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SvipVerticalTextView svipVerticalTextView = this.f30118a.get();
            if (svipVerticalTextView == null) {
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
            int size = svipVerticalTextView.f30114c.size();
            if (size > 0) {
                svipVerticalTextView.f30113b = (svipVerticalTextView.f30113b + 1) % size;
                if (svipVerticalTextView.f30117f.size() > 0) {
                    svipVerticalTextView.setTextColor(((Integer) svipVerticalTextView.f30117f.get(svipVerticalTextView.f30113b)).intValue());
                }
                svipVerticalTextView.setText((CharSequence) svipVerticalTextView.f30114c.get(svipVerticalTextView.f30113b));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, svipVerticalTextView.f30115d);
            }
        }
    }

    public SvipVerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30113b = -1;
        this.f30115d = 3000L;
        this.f30116e = false;
        this.f30114c = new ArrayList();
        this.f30117f = new ArrayList();
        this.f30112a = new HandlerC8507a();
        setFactory(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextColor(int i) {
        ((TextView) getNextView()).setTextColor(i);
    }

    @Override // android.widget.TextSwitcher, android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m46713h(long j, int[] iArr) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, iArr[1], 0.0f));
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.setDuration(j);
        setInAnimation(animationSet);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, -iArr[1]));
        animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet2.setDuration(j);
        setOutAnimation(animationSet2);
    }

    /* JADX INFO: renamed from: i */
    public void m46714i() {
        this.f30116e = true;
        this.f30112a.removeCallbacksAndMessages(null);
        this.f30112a.sendEmptyMessage(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        layoutParams.rightMargin = qa00.f156317d;
        textView.setGravity(16);
        textView.setTextColor(-1);
        textView.setTextSize(2, 10.0f);
        textView.setTypeface(lyh0.m156283c(3));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30112a.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(final long j) {
        if (this.f30116e) {
            return;
        }
        if (!jyb.m147479J(this.f30114c) && this.f30114c.size() != 1) {
            bnl0.m105533Q0(this, new y20() { // from class: l.veh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183775a.m46713h(j, (int[]) obj);
                }
            });
        } else {
            setInAnimation(null);
            setOutAnimation(null);
        }
    }

    public void setTextColorList(List<Integer> list) {
        if (this.f30116e) {
            return;
        }
        this.f30117f.clear();
        this.f30117f.addAll(list);
        if (!jyb.m147479J(list)) {
            setTextColor(list.get(list.size() - 1).intValue());
        }
        this.f30113b = -1;
    }

    public void setTextList(List<String> list) {
        if (this.f30116e) {
            return;
        }
        this.f30114c.clear();
        this.f30114c.addAll(list);
        if (!jyb.m147479J(list)) {
            setText(list.get(list.size() - 1));
        }
        this.f30113b = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f30116e) {
            return;
        }
        this.f30115d = j;
    }

    public SvipVerticalTextView(Context context) {
        this(context, null);
    }
}
