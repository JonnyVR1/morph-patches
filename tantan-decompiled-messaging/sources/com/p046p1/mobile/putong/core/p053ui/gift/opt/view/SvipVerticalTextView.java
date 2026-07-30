package com.p046p1.mobile.putong.core.p053ui.gift.opt.view;

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
import p149l.e30;
import p149l.eqh0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class SvipVerticalTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public final Handler f29264a;

    /* JADX INFO: renamed from: b */
    public int f29265b;

    /* JADX INFO: renamed from: c */
    public final List<String> f29266c;

    /* JADX INFO: renamed from: d */
    public long f29267d;

    /* JADX INFO: renamed from: e */
    public boolean f29268e;

    /* JADX INFO: renamed from: f */
    public final List<Integer> f29269f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.SvipVerticalTextView$a */
    public static final class HandlerC8344a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SvipVerticalTextView> f29270a;

        public HandlerC8344a(SvipVerticalTextView svipVerticalTextView) {
            super(Looper.getMainLooper());
            this.f29270a = new WeakReference<>(svipVerticalTextView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SvipVerticalTextView svipVerticalTextView = this.f29270a.get();
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
            int size = svipVerticalTextView.f29266c.size();
            if (size > 0) {
                svipVerticalTextView.f29265b = (svipVerticalTextView.f29265b + 1) % size;
                if (svipVerticalTextView.f29269f.size() > 0) {
                    svipVerticalTextView.setTextColor(((Integer) svipVerticalTextView.f29269f.get(svipVerticalTextView.f29265b)).intValue());
                }
                svipVerticalTextView.setText((CharSequence) svipVerticalTextView.f29266c.get(svipVerticalTextView.f29265b));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, svipVerticalTextView.f29267d);
            }
        }
    }

    public SvipVerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29265b = -1;
        this.f29267d = 3000L;
        this.f29268e = false;
        this.f29266c = new ArrayList();
        this.f29269f = new ArrayList();
        this.f29264a = new HandlerC8344a();
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
    public final /* synthetic */ void m45530h(long j, int[] iArr) {
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
    public void m45531i() {
        this.f29268e = true;
        this.f29264a.removeCallbacksAndMessages(null);
        this.f29264a.sendEmptyMessage(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        layoutParams.rightMargin = t100.f167255d;
        textView.setGravity(16);
        textView.setTextColor(-1);
        textView.setTextSize(2, 10.0f);
        textView.setTypeface(eqh0.m117752c(3));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29264a.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(final long j) {
        if (this.f29268e) {
            return;
        }
        if (!vwb.m200296J(this.f29266c) && this.f29266c.size() != 1) {
            xdl0.m208353Q0(this, new e30() { // from class: l.n6h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137405a.m45530h(j, (int[]) obj);
                }
            });
        } else {
            setInAnimation(null);
            setOutAnimation(null);
        }
    }

    public void setTextColorList(List<Integer> list) {
        if (this.f29268e) {
            return;
        }
        this.f29269f.clear();
        this.f29269f.addAll(list);
        if (!vwb.m200296J(list)) {
            setTextColor(list.get(list.size() - 1).intValue());
        }
        this.f29265b = -1;
    }

    public void setTextList(List<String> list) {
        if (this.f29268e) {
            return;
        }
        this.f29266c.clear();
        this.f29266c.addAll(list);
        if (!vwb.m200296J(list)) {
            setText(list.get(list.size() - 1));
        }
        this.f29265b = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f29268e) {
            return;
        }
        this.f29267d = j;
    }

    public SvipVerticalTextView(Context context) {
        this(context, null);
    }
}
