package com.p000p1.mobile.putong.core.p001ui.messages.meme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import l.c3c0;
import l.l6c0;
import l.o7r;
import l.x1c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class KeyboardPagerAdapterPage<T> extends ViewGroup implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public int f1759a;

    /* JADX INFO: renamed from: b */
    public Timer f1760b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0123b<T> f1761c;

    /* JADX INFO: renamed from: d */
    public int f1762d;

    /* JADX INFO: renamed from: e */
    public int f1763e;

    /* JADX INFO: renamed from: f */
    public boolean f1764f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.KeyboardPagerAdapterPage$a */
    public class C0122a extends TimerTask {
        public C0122a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m2375b() {
            KeyboardPagerAdapterPage.this.onClick(null);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            KeyboardPagerAdapterPage.this.post(new Runnable() { // from class: l.qzq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6735a.m2375b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.KeyboardPagerAdapterPage$b */
    public interface InterfaceC0123b<T> {
        /* JADX INFO: renamed from: i */
        View mo2376i(T t, Context context);
    }

    public KeyboardPagerAdapterPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m2370a() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public void m2371b(int i, int i2, int i3, List<T> list, InterfaceC0123b<T> interfaceC0123b, boolean z) {
        this.f1763e = i;
        this.f1762d = i2;
        this.f1761c = interfaceC0123b;
        this.f1764f = z;
        this.f1759a = i3;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(x1c0.n);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            addView(this.f1761c.mo2376i(it.next(), getContext()));
        }
        if (this.f1764f) {
            ImageView imageView = (ImageView) o7r.a(getContext()).inflate(l6c0.k5, (ViewGroup) null);
            imageView.setImageDrawable(getContext().getResources().getDrawable(c3c0.K7));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setOnClickListener(this);
            imageView.setOnTouchListener(this);
            addView(imageView);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2372c() {
        Timer timer = new Timer("KeyboardPagerAdapterPage-Thread");
        this.f1760b = timer;
        timer.schedule(new C0122a(), ViewConfiguration.getLongPressTimeout(), 130L);
    }

    /* JADX INFO: renamed from: d */
    public final void m2373d() {
        if (NullChecker.a(this.f1760b)) {
            this.f1760b.cancel();
            this.f1760b = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m2370a().mo2046A0().m6499g0().m4844t0().getBar_center_text().dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (this.f1764f) {
            childCount--;
        }
        int measuredWidth = (((getMeasuredWidth() - ((this.f1763e - 1) * this.f1759a)) - getPaddingLeft()) - getPaddingRight()) / this.f1763e;
        int measuredHeight = (((getMeasuredHeight() - ((this.f1762d - 1) * this.f1759a)) - getPaddingTop()) - getPaddingBottom()) / this.f1762d;
        for (int i5 = 0; i5 < childCount; i5++) {
            int i6 = this.f1763e;
            int paddingLeft = getPaddingLeft() + ((i5 % i6) * (this.f1759a + measuredWidth));
            int paddingTop = getPaddingTop() + ((i5 / i6) * (this.f1759a + measuredHeight));
            getChildAt(i5).layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
        }
        if (this.f1764f) {
            int i7 = this.f1763e - 1;
            int i8 = this.f1762d - 1;
            int paddingLeft2 = getPaddingLeft() + (i7 * (this.f1759a + measuredWidth));
            int paddingTop2 = getPaddingTop() + (i8 * (this.f1759a + measuredHeight));
            getChildAt(getChildCount() - 1).layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int measuredWidth = (((getMeasuredWidth() - ((this.f1763e - 1) * this.f1759a)) - getPaddingLeft()) - getPaddingRight()) / this.f1763e;
        int measuredHeight = (((getMeasuredHeight() - ((this.f1762d - 1) * this.f1759a)) - getPaddingTop()) - getPaddingBottom()) / this.f1762d;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m2372c();
            return false;
        }
        if (motionEvent.getAction() == 1 || !xdl0.O(view, motionEvent)) {
            m2373d();
            return false;
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        m2373d();
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public KeyboardPagerAdapterPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardPagerAdapterPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
