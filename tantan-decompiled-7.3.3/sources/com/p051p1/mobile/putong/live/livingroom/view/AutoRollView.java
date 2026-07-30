package com.p051p1.mobile.putong.live.livingroom.view;

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
import p153l.bnl0;
import p153l.jyb;
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes5.dex */
public class AutoRollView extends TextSwitcher implements ViewSwitcher.ViewFactory {

    /* JADX INFO: renamed from: a */
    public Context f52701a;

    /* JADX INFO: renamed from: b */
    public Handler f52702b;

    /* JADX INFO: renamed from: c */
    public int f52703c;

    /* JADX INFO: renamed from: d */
    public List<String> f52704d;

    /* JADX INFO: renamed from: e */
    public InterfaceC13079a f52705e;

    /* JADX INFO: renamed from: f */
    public float f52706f;

    /* JADX INFO: renamed from: g */
    public int f52707g;

    /* JADX INFO: renamed from: h */
    public long f52708h;

    /* JADX INFO: renamed from: i */
    public boolean f52709i;

    /* JADX INFO: renamed from: j */
    public boolean f52710j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AutoRollView$a */
    public interface InterfaceC13079a {
        /* JADX INFO: renamed from: a */
        void mo77577a(int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.AutoRollView$b */
    public static final class HandlerC13080b extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<AutoRollView> f52711a;

        public HandlerC13080b(AutoRollView autoRollView) {
            this.f52711a = new WeakReference<>(autoRollView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AutoRollView autoRollView = this.f52711a.get();
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
            int size = autoRollView.f52704d.size();
            if (size > 0) {
                autoRollView.f52703c = (autoRollView.f52703c + 1) % size;
                autoRollView.setText((CharSequence) autoRollView.f52704d.get(autoRollView.f52703c));
            }
            if (size > 1) {
                sendEmptyMessageDelayed(0, autoRollView.f52708h);
            }
        }
    }

    public AutoRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52703c = -1;
        this.f52708h = 3000L;
        this.f52709i = false;
        this.f52710j = false;
        m77574f(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final void m77574f(Context context, AttributeSet attributeSet) {
        this.f52701a = context;
        this.f52704d = new ArrayList();
        this.f52702b = new HandlerC13080b(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184116a);
        this.f52706f = typedArrayObtainStyledAttributes.getDimensionPixelSize(vhc0.f184122d, qa00.m175861f(13));
        this.f52707g = typedArrayObtainStyledAttributes.getColor(vhc0.f184120c, -1);
        this.f52710j = typedArrayObtainStyledAttributes.getBoolean(vhc0.f184118b, false);
        typedArrayObtainStyledAttributes.recycle();
        setFactory(this);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m77575g(View view) {
        int i;
        if (this.f52705e == null || this.f52704d.size() <= 0 || (i = this.f52703c) == -1) {
            return;
        }
        this.f52705e.mo77577a(i % this.f52704d.size());
    }

    /* JADX INFO: renamed from: h */
    public void m77576h() {
        this.f52709i = true;
        this.f52702b.sendEmptyMessage(0);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(this.f52701a);
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 19;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(19);
        textView.setTextColor(this.f52707g);
        textView.setTextSize(0, this.f52706f);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (this.f52710j) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setClickable(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.mj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137048a.m77575g(view);
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52702b.removeCallbacksAndMessages(null);
    }

    public void setAnimTime(long j) {
        if (this.f52709i) {
            return;
        }
        if (jyb.m147479J(this.f52704d) || this.f52704d.size() == 1) {
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

    public void setOnItemClickListener(InterfaceC13079a interfaceC13079a) {
        this.f52705e = interfaceC13079a;
    }

    public void setTextList(List<String> list) {
        if (this.f52709i) {
            return;
        }
        this.f52704d.clear();
        this.f52704d.addAll(list);
        this.f52703c = -1;
    }

    public void setTextStillTime(long j) {
        if (this.f52709i) {
            return;
        }
        this.f52708h = j;
    }

    public AutoRollView(Context context) {
        this(context, null);
    }
}
