package com.p051p1.mobile.putong.core.p058ui.messages.meme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p153l.bnl0;
import p153l.eac0;
import p153l.ibc0;
import p153l.p9r;
import p153l.qec0;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardPagerAdapterPage<T> extends ViewGroup implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public int f32716a;

    /* JADX INFO: renamed from: b */
    public Timer f32717b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8703b<T> f32718c;

    /* JADX INFO: renamed from: d */
    public int f32719d;

    /* JADX INFO: renamed from: e */
    public int f32720e;

    /* JADX INFO: renamed from: f */
    public boolean f32721f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.KeyboardPagerAdapterPage$a */
    public class C8702a extends TimerTask {
        public C8702a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m50431b() {
            KeyboardPagerAdapterPage.this.onClick(null);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            KeyboardPagerAdapterPage.this.post(new Runnable() { // from class: l.q1r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155216a.m50431b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.KeyboardPagerAdapterPage$b */
    public interface InterfaceC8703b<T> {
        /* JADX INFO: renamed from: i */
        View mo50432i(T t, Context context);
    }

    public KeyboardPagerAdapterPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m50426a() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public void m50427b(int i, int i2, int i3, List<T> list, InterfaceC8703b<T> interfaceC8703b, boolean z) {
        this.f32720e = i;
        this.f32719d = i2;
        this.f32718c = interfaceC8703b;
        this.f32721f = z;
        this.f32716a = i3;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(eac0.f92766n);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            addView(this.f32718c.mo50432i(it.next(), getContext()));
        }
        if (this.f32721f) {
            ImageView imageView = (ImageView) p9r.m171370a(getContext()).inflate(qec0.f157063k5, (ViewGroup) null);
            imageView.setImageDrawable(getContext().getResources().getDrawable(ibc0.f113840K7));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setOnClickListener(this);
            imageView.setOnTouchListener(this);
            addView(imageView);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m50428c() {
        Timer timer = new Timer("KeyboardPagerAdapterPage-Thread");
        this.f32717b = timer;
        timer.schedule(new C8702a(), ViewConfiguration.getLongPressTimeout(), 130L);
    }

    /* JADX INFO: renamed from: d */
    public final void m50429d() {
        if (NullChecker.m82486a(this.f32717b)) {
            this.f32717b.cancel();
            this.f32717b = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m50426a().mo50138B0().m143374g0().m114041t0().getBar_center_text().dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (this.f32721f) {
            childCount--;
        }
        int measuredWidth = (((getMeasuredWidth() - ((this.f32720e - 1) * this.f32716a)) - getPaddingLeft()) - getPaddingRight()) / this.f32720e;
        int measuredHeight = (((getMeasuredHeight() - ((this.f32719d - 1) * this.f32716a)) - getPaddingTop()) - getPaddingBottom()) / this.f32719d;
        for (int i5 = 0; i5 < childCount; i5++) {
            int i6 = this.f32720e;
            int paddingLeft = getPaddingLeft() + ((i5 % i6) * (this.f32716a + measuredWidth));
            int paddingTop = getPaddingTop() + ((i5 / i6) * (this.f32716a + measuredHeight));
            getChildAt(i5).layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
        }
        if (this.f32721f) {
            int i7 = this.f32720e - 1;
            int i8 = this.f32719d - 1;
            int paddingLeft2 = getPaddingLeft() + (i7 * (this.f32716a + measuredWidth));
            int paddingTop2 = getPaddingTop() + (i8 * (this.f32716a + measuredHeight));
            getChildAt(getChildCount() - 1).layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int measuredWidth = (((getMeasuredWidth() - ((this.f32720e - 1) * this.f32716a)) - getPaddingLeft()) - getPaddingRight()) / this.f32720e;
        int measuredHeight = (((getMeasuredHeight() - ((this.f32719d - 1) * this.f32716a)) - getPaddingTop()) - getPaddingBottom()) / this.f32719d;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m50428c();
            return false;
        }
        if (motionEvent.getAction() == 1 || !bnl0.m105528O(view, motionEvent)) {
            m50429d();
            return false;
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        m50429d();
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
