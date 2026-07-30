package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p149l.p9c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class AutoRollView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f51853a;

    /* JADX INFO: renamed from: b */
    public Handler f51854b;

    /* JADX INFO: renamed from: c */
    public int f51855c;

    /* JADX INFO: renamed from: d */
    public List<String> f51856d;

    /* JADX INFO: renamed from: e */
    public InterfaceC12916a f51857e;

    /* JADX INFO: renamed from: f */
    public float f51858f;

    /* JADX INFO: renamed from: g */
    public int f51859g;

    /* JADX INFO: renamed from: h */
    public long f51860h;

    /* JADX INFO: renamed from: i */
    public boolean f51861i;

    /* JADX INFO: renamed from: j */
    public boolean f51862j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AutoRollView$a */
    public interface InterfaceC12916a {
        /* JADX INFO: renamed from: a */
        void mo76394a(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AutoRollView$b */
    public static final class HandlerC12917b extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<AutoRollView> f51863a;

        public HandlerC12917b(AutoRollView autoRollView) {
            this.f51863a = new WeakReference<>(autoRollView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AutoRollView autoRollView = this.f51863a.get();
            if (autoRollView == null) {
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
            int size = autoRollView.f51856d.size();
            if (size > 0) {
                autoRollView.f51855c = (autoRollView.f51855c + 1) % size;
                autoRollView.setText((CharSequence) autoRollView.f51856d.get(autoRollView.f51855c));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, autoRollView.f51860h);
            }
        }
    }

    public AutoRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51855c = -1;
        this.f51860h = 3000L;
        this.f51861i = false;
        this.f51862j = false;
        m76391f(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final void m76391f(Context context, AttributeSet attributeSet) {
        this.f51853a = context;
        this.f51856d = new ArrayList();
        this.f51854b = new HandlerC12917b(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147717a);
        this.f51858f = typedArrayObtainStyledAttributes.getDimensionPixelSize(p9c0.f147723d, t100.m186892f(13));
        this.f51859g = typedArrayObtainStyledAttributes.getColor(p9c0.f147721c, -1);
        this.f51862j = typedArrayObtainStyledAttributes.getBoolean(p9c0.f147719b, false);
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m76392g(View view) {
        int i;
        if (this.f51857e == null || this.f51856d.size() <= 0 || (i = this.f51855c) == -1) {
            return;
        }
        this.f51857e.mo76394a(i % this.f51856d.size());
    }

    /* JADX INFO: renamed from: h */
    public void m76393h() {
        this.f51861i = true;
        this.f51854b.sendEmptyMessage(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f51853a);
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 19;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(19);
        textView.setTextColor(this.f51859g);
        textView.setTextSize(0, this.f51858f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f51862j) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.fj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97748a.m76392g(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51854b.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(long j) {
        if (this.f51861i) {
            return;
        }
        if (vwb.m200296J(this.f51856d) || this.f51856d.size() == 1) {
            setInAnimation(null);
            setOutAnimation(null);
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, j, 0.0f);
        translateAnimation.setDuration(j);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -j);
        translateAnimation2.setDuration(j);
        setInAnimation(translateAnimation);
        setOutAnimation(translateAnimation2);
    }

    public void setOnItemClickListener(InterfaceC12916a interfaceC12916a) {
        this.f51857e = interfaceC12916a;
    }

    public void setTextList(List<String> list) {
        if (this.f51861i) {
            return;
        }
        this.f51856d.clear();
        this.f51856d.addAll(list);
        this.f51855c = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f51861i) {
            return;
        }
        this.f51860h = j;
    }

    public AutoRollView(Context context) {
        this(context, null);
    }
}
