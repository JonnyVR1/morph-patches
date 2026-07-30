package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p153l.gfc0;
import p153l.kcc0;
import p153l.ybc0;
import p153l.ztb;

/* JADX INFO: loaded from: classes6.dex */
public class ToolTipPopup {

    /* JADX INFO: renamed from: a */
    public final String f6862a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<View> f6863b;

    /* JADX INFO: renamed from: c */
    public final Context f6864c;

    /* JADX INFO: renamed from: d */
    public PopupContentView f6865d;

    /* JADX INFO: renamed from: e */
    public PopupWindow f6866e;

    /* JADX INFO: renamed from: f */
    public Style f6867f = Style.BLUE;

    /* JADX INFO: renamed from: g */
    public long f6868g = 6000;

    /* JADX INFO: renamed from: h */
    public final ViewTreeObserver.OnScrollChangedListener f6869h = new ViewTreeObserverOnScrollChangedListenerC1732a();

    public class PopupContentView extends FrameLayout {

        /* JADX INFO: renamed from: a */
        public ImageView f6870a;

        /* JADX INFO: renamed from: b */
        public ImageView f6871b;

        /* JADX INFO: renamed from: c */
        public View f6872c;

        /* JADX INFO: renamed from: d */
        public ImageView f6873d;

        public PopupContentView(Context context) {
            super(context);
            m9274e();
        }

        /* JADX INFO: renamed from: e */
        public final void m9274e() {
            LayoutInflater.from(getContext()).inflate(gfc0.f103894a, this);
            this.f6870a = (ImageView) findViewById(kcc0.f125041e);
            this.f6871b = (ImageView) findViewById(kcc0.f125039c);
            this.f6872c = findViewById(kcc0.f125037a);
            this.f6873d = (ImageView) findViewById(kcc0.f125038b);
        }

        /* JADX INFO: renamed from: f */
        public void m9275f() {
            this.f6870a.setVisibility(4);
            this.f6871b.setVisibility(0);
        }

        /* JADX INFO: renamed from: g */
        public void m9276g() {
            this.f6870a.setVisibility(0);
            this.f6871b.setVisibility(4);
        }
    }

    public enum Style {
        BLUE,
        BLACK
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ToolTipPopup$a */
    public class ViewTreeObserverOnScrollChangedListenerC1732a implements ViewTreeObserver.OnScrollChangedListener {
        public ViewTreeObserverOnScrollChangedListenerC1732a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (ToolTipPopup.m9260a(ToolTipPopup.this).get() == null || ToolTipPopup.m9261b(ToolTipPopup.this) == null || !ToolTipPopup.m9261b(ToolTipPopup.this).isShowing()) {
                return;
            }
            boolean zIsAboveAnchor = ToolTipPopup.m9261b(ToolTipPopup.this).isAboveAnchor();
            ToolTipPopup toolTipPopup = ToolTipPopup.this;
            if (zIsAboveAnchor) {
                ToolTipPopup.m9262c(toolTipPopup).m9275f();
            } else {
                ToolTipPopup.m9262c(toolTipPopup).m9276g();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ToolTipPopup$b */
    public class RunnableC1733b implements Runnable {
        public RunnableC1733b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                ToolTipPopup.this.m9263d();
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ToolTipPopup$c */
    public class ViewOnClickListenerC1734c implements View.OnClickListener {
        public ViewOnClickListenerC1734c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                ToolTipPopup.this.m9263d();
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    public ToolTipPopup(String str, View view) {
        this.f6862a = str;
        this.f6863b = new WeakReference<>(view);
        this.f6864c = view.getContext();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WeakReference m9260a(ToolTipPopup toolTipPopup) {
        if (ztb.m221490d(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.f6863b;
        } catch (Throwable th) {
            ztb.m221488b(th, ToolTipPopup.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ PopupWindow m9261b(ToolTipPopup toolTipPopup) {
        if (ztb.m221490d(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.f6866e;
        } catch (Throwable th) {
            ztb.m221488b(th, ToolTipPopup.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ PopupContentView m9262c(ToolTipPopup toolTipPopup) {
        if (ztb.m221490d(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.f6865d;
        } catch (Throwable th) {
            ztb.m221488b(th, ToolTipPopup.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m9263d() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m9268i();
            PopupWindow popupWindow = this.f6866e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9264e() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m9268i();
            if (this.f6863b.get() != null) {
                this.f6863b.get().getViewTreeObserver().addOnScrollChangedListener(this.f6869h);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9265f(long j) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            this.f6868g = j;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9266g(Style style) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            this.f6867f = style;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m9267h() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (this.f6863b.get() != null) {
                PopupContentView popupContentView = new PopupContentView(this.f6864c);
                this.f6865d = popupContentView;
                ((TextView) popupContentView.findViewById(kcc0.f125040d)).setText(this.f6862a);
                Style style = this.f6867f;
                Style style2 = Style.BLUE;
                PopupContentView popupContentView2 = this.f6865d;
                if (style == style2) {
                    popupContentView2.f6872c.setBackgroundResource(ybc0.f198297g);
                    this.f6865d.f6871b.setImageResource(ybc0.f198298h);
                    this.f6865d.f6870a.setImageResource(ybc0.f198299i);
                    this.f6865d.f6873d.setImageResource(ybc0.f198300j);
                } else {
                    popupContentView2.f6872c.setBackgroundResource(ybc0.f198293c);
                    this.f6865d.f6871b.setImageResource(ybc0.f198294d);
                    this.f6865d.f6870a.setImageResource(ybc0.f198295e);
                    this.f6865d.f6873d.setImageResource(ybc0.f198296f);
                }
                View decorView = ((Activity) this.f6864c).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                m9264e();
                this.f6865d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupContentView popupContentView3 = this.f6865d;
                PopupWindow popupWindow = new PopupWindow(popupContentView3, popupContentView3.getMeasuredWidth(), this.f6865d.getMeasuredHeight());
                this.f6866e = popupWindow;
                popupWindow.showAsDropDown(this.f6863b.get());
                m9269j();
                if (this.f6868g > 0) {
                    this.f6865d.postDelayed(new RunnableC1733b(), this.f6868g);
                }
                this.f6866e.setTouchable(true);
                this.f6865d.setOnClickListener(new ViewOnClickListenerC1734c());
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9268i() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (this.f6863b.get() != null) {
                this.f6863b.get().getViewTreeObserver().removeOnScrollChangedListener(this.f6869h);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9269j() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.f6866e;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            boolean zIsAboveAnchor = this.f6866e.isAboveAnchor();
            PopupContentView popupContentView = this.f6865d;
            if (zIsAboveAnchor) {
                popupContentView.m9275f();
            } else {
                popupContentView.m9276g();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
