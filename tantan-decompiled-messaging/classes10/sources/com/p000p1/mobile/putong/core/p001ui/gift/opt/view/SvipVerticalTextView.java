package com.p000p1.mobile.putong.core.p001ui.gift.opt.view;

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
import l.e30;
import l.eqh0;
import l.t100;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SvipVerticalTextView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public final Handler f1658a;

    /* JADX INFO: renamed from: b */
    public int f1659b;

    /* JADX INFO: renamed from: c */
    public final List<String> f1660c;

    /* JADX INFO: renamed from: d */
    public long f1661d;

    /* JADX INFO: renamed from: e */
    public boolean f1662e;

    /* JADX INFO: renamed from: f */
    public final List<Integer> f1663f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.SvipVerticalTextView$a */
    public static final class HandlerC3119a extends Handler {

        /* JADX INFO: renamed from: a */
        public final WeakReference<SvipVerticalTextView> f1664a;

        public HandlerC3119a(SvipVerticalTextView svipVerticalTextView) {
            super(Looper.getMainLooper());
            this.f1664a = new WeakReference<>(svipVerticalTextView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SvipVerticalTextView svipVerticalTextView = this.f1664a.get();
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
            int size = svipVerticalTextView.f1660c.size();
            if (size > 0) {
                svipVerticalTextView.f1659b = (svipVerticalTextView.f1659b + 1) % size;
                if (svipVerticalTextView.f1663f.size() > 0) {
                    svipVerticalTextView.setTextColor(((Integer) svipVerticalTextView.f1663f.get(svipVerticalTextView.f1659b)).intValue());
                }
                svipVerticalTextView.setText((CharSequence) svipVerticalTextView.f1660c.get(svipVerticalTextView.f1659b));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, svipVerticalTextView.f1661d);
            }
        }
    }

    public SvipVerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1659b = -1;
        this.f1661d = 3000L;
        this.f1662e = false;
        this.f1660c = new ArrayList();
        this.f1663f = new ArrayList();
        this.f1658a = new HandlerC3119a();
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
    public final /* synthetic */ void m2866h(long j, int[] iArr) {
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
    public void m2867i() {
        this.f1662e = true;
        this.f1658a.removeCallbacksAndMessages(null);
        this.f1658a.sendEmptyMessage(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        int i = xdl0.e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        layoutParams.rightMargin = t100.d;
        textView.setGravity(16);
        textView.setTextColor(-1);
        textView.setTextSize(2, 10.0f);
        textView.setTypeface(eqh0.c(3));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1658a.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(final long j) {
        if (this.f1662e) {
            return;
        }
        if (!vwb.J(this.f1660c) && this.f1660c.size() != 1) {
            xdl0.Q0(this, new e30() { // from class: l.n6h0
                public final void call(Object obj) {
                    this.f6481a.m2866h(j, (int[]) obj);
                }
            });
        } else {
            setInAnimation(null);
            setOutAnimation(null);
        }
    }

    public void setTextColorList(List<Integer> list) {
        if (this.f1662e) {
            return;
        }
        this.f1663f.clear();
        this.f1663f.addAll(list);
        if (!vwb.J(list)) {
            setTextColor(list.get(list.size() - 1).intValue());
        }
        this.f1659b = -1;
    }

    public void setTextList(List<String> list) {
        if (this.f1662e) {
            return;
        }
        this.f1660c.clear();
        this.f1660c.addAll(list);
        if (!vwb.J(list)) {
            setText(list.get(list.size() - 1));
        }
        this.f1659b = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f1662e) {
            return;
        }
        this.f1661d = j;
    }

    public SvipVerticalTextView(Context context) {
        this(context, null);
    }
}
