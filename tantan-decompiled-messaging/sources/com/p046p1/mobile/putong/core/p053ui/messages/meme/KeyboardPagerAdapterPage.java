package com.p046p1.mobile.putong.core.p053ui.messages.meme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p149l.c3c0;
import p149l.l6c0;
import p149l.o7r;
import p149l.x1c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class KeyboardPagerAdapterPage<T> extends ViewGroup implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public int f31868a;

    /* JADX INFO: renamed from: b */
    public Timer f31869b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8540b<T> f31870c;

    /* JADX INFO: renamed from: d */
    public int f31871d;

    /* JADX INFO: renamed from: e */
    public int f31872e;

    /* JADX INFO: renamed from: f */
    public boolean f31873f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.KeyboardPagerAdapterPage$a */
    public class C8539a extends TimerTask {
        public C8539a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m49248b() {
            KeyboardPagerAdapterPage.this.onClick(null);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            KeyboardPagerAdapterPage.this.post(new Runnable() { // from class: l.qzq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157088a.m49248b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.meme.KeyboardPagerAdapterPage$b */
    public interface InterfaceC8540b<T> {
        /* JADX INFO: renamed from: i */
        View mo49249i(T t, Context context);
    }

    public KeyboardPagerAdapterPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m49243a() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public void m49244b(int i, int i2, int i3, List<T> list, InterfaceC8540b<T> interfaceC8540b, boolean z) {
        this.f31872e = i;
        this.f31871d = i2;
        this.f31870c = interfaceC8540b;
        this.f31873f = z;
        this.f31868a = i3;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(x1c0.f189059n);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            addView(this.f31870c.mo49249i(it.next(), getContext()));
        }
        if (this.f31873f) {
            ImageView imageView = (ImageView) o7r.m163037a(getContext()).inflate(l6c0.f126507k5, (ViewGroup) null);
            imageView.setImageDrawable(getContext().getResources().getDrawable(c3c0.f78565K7));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setOnClickListener(this);
            imageView.setOnTouchListener(this);
            addView(imageView);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m49245c() {
        Timer timer = new Timer("KeyboardPagerAdapterPage-Thread");
        this.f31869b = timer;
        timer.schedule(new C8539a(), ViewConfiguration.getLongPressTimeout(), 130L);
    }

    /* JADX INFO: renamed from: d */
    public final void m49246d() {
        if (NullChecker.m81303a(this.f31869b)) {
            this.f31869b.cancel();
            this.f31869b = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m49243a().mo48954A0().m156457g0().m128210t0().getBar_center_text().dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (this.f31873f) {
            childCount--;
        }
        int measuredWidth = (((getMeasuredWidth() - ((this.f31872e - 1) * this.f31868a)) - getPaddingLeft()) - getPaddingRight()) / this.f31872e;
        int measuredHeight = (((getMeasuredHeight() - ((this.f31871d - 1) * this.f31868a)) - getPaddingTop()) - getPaddingBottom()) / this.f31871d;
        for (int i5 = 0; i5 < childCount; i5++) {
            int i6 = this.f31872e;
            int paddingLeft = getPaddingLeft() + ((i5 % i6) * (this.f31868a + measuredWidth));
            int paddingTop = getPaddingTop() + ((i5 / i6) * (this.f31868a + measuredHeight));
            getChildAt(i5).layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
        }
        if (this.f31873f) {
            int i7 = this.f31872e - 1;
            int i8 = this.f31871d - 1;
            int paddingLeft2 = getPaddingLeft() + (i7 * (this.f31868a + measuredWidth));
            int paddingTop2 = getPaddingTop() + (i8 * (this.f31868a + measuredHeight));
            getChildAt(getChildCount() - 1).layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int measuredWidth = (((getMeasuredWidth() - ((this.f31872e - 1) * this.f31868a)) - getPaddingLeft()) - getPaddingRight()) / this.f31872e;
        int measuredHeight = (((getMeasuredHeight() - ((this.f31871d - 1) * this.f31868a)) - getPaddingTop()) - getPaddingBottom()) / this.f31871d;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m49245c();
            return false;
        }
        if (motionEvent.getAction() == 1 || !xdl0.m208348O(view, motionEvent)) {
            m49246d();
            return false;
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        m49246d();
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
