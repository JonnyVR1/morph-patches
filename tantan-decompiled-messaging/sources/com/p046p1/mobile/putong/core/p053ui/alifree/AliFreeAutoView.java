package com.p046p1.mobile.putong.core.p053ui.alifree;

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
import com.p046p1.mobile.putong.core.CoreModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p149l.d3c0;
import p149l.j9c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AliFreeAutoView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Handler f28438a;

    /* JADX INFO: renamed from: b */
    public int f28439b;

    /* JADX INFO: renamed from: c */
    public List<String> f28440c;

    /* JADX INFO: renamed from: d */
    public long f28441d;

    /* JADX INFO: renamed from: e */
    public boolean f28442e;

    /* JADX INFO: renamed from: f */
    public int f28443f;

    /* JADX INFO: renamed from: g */
    public int f28444g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.alifree.AliFreeAutoView$a */
    public static final class HandlerC8285a extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<AliFreeAutoView> f28445a;

        public HandlerC8285a(AliFreeAutoView aliFreeAutoView) {
            this.f28445a = new WeakReference<>(aliFreeAutoView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AliFreeAutoView aliFreeAutoView = this.f28445a.get();
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
            int size = aliFreeAutoView.f28440c.size();
            if (size > 0) {
                aliFreeAutoView.f28439b = (aliFreeAutoView.f28439b + 1) % size;
                aliFreeAutoView.setText((CharSequence) aliFreeAutoView.f28440c.get(aliFreeAutoView.f28439b));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, aliFreeAutoView.f28441d);
            }
        }
    }

    public AliFreeAutoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28439b = -1;
        this.f28441d = 3000L;
        this.f28442e = false;
        int iM186890d = t100.m186890d(12.0f);
        this.f28443f = iM186890d;
        this.f28444g = iM186890d + t100.m186890d(5.0f);
        m44312e(context, attributeSet);
    }

    @Override // android.widget.TextSwitcher, android.widget.ViewSwitcher, android.widget.ViewAnimator, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public final void m44312e(Context context, AttributeSet attributeSet) {
        this.f28440c = new ArrayList();
        this.f28438a = new HandlerC8285a(this);
        context.obtainStyledAttributes(attributeSet, j9c0.f116877a).recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: f */
    public void m44313f() {
        this.f28442e = true;
        this.f28438a.sendEmptyMessage(0);
    }

    /* JADX INFO: renamed from: g */
    public void m44314g() {
        this.f28442e = false;
        this.f28438a.sendEmptyMessage(1);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        int i = xdl0.f192404f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        textView.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f84065q), (Drawable) null, (Drawable) null, (Drawable) null);
        layoutParams.gravity = 1;
        textView.setGravity(1);
        textView.setCompoundDrawablePadding(t100.m186890d(5.0f));
        textView.setTextColor(-1);
        textView.setTextSize(0, this.f28443f);
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
        this.f28438a.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(long j) {
        if (this.f28442e) {
            return;
        }
        if (vwb.m200296J(this.f28440c) || this.f28440c.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f28444g, 0.0f);
        translateAnimation.setDuration(j);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.f28444g);
        translateAnimation2.setDuration(j);
        setInAnimation(translateAnimation);
        setOutAnimation(translateAnimation2);
    }

    public void setTextList(List<String> list) {
        if (this.f28442e) {
            return;
        }
        this.f28440c.clear();
        this.f28440c.addAll(list);
        if (!vwb.m200296J(list)) {
            setText(list.get(list.size() - 1));
        }
        this.f28439b = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f28442e) {
            return;
        }
        this.f28441d = j;
    }

    public AliFreeAutoView(Context context) {
        super(context);
        this.f28439b = -1;
        this.f28441d = 3000L;
        this.f28442e = false;
        int iM186890d = t100.m186890d(12.0f);
        this.f28443f = iM186890d;
        this.f28444g = iM186890d + t100.m186890d(5.0f);
    }
}
