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
import p149l.c7c0;
import p149l.e4c0;
import p149l.lsb;
import p149l.s3c0;

/* JADX INFO: loaded from: classes6.dex */
public class ToolTipPopup {

    /* JADX INFO: renamed from: a */
    public final String f6825a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<View> f6826b;

    /* JADX INFO: renamed from: c */
    public final Context f6827c;

    /* JADX INFO: renamed from: d */
    public PopupContentView f6828d;

    /* JADX INFO: renamed from: e */
    public PopupWindow f6829e;

    /* JADX INFO: renamed from: f */
    public Style f6830f = Style.BLUE;

    /* JADX INFO: renamed from: g */
    public long f6831g = 6000;

    /* JADX INFO: renamed from: h */
    public final ViewTreeObserver.OnScrollChangedListener f6832h = new ViewTreeObserverOnScrollChangedListenerC1709a();

    public class PopupContentView extends FrameLayout {

        /* JADX INFO: renamed from: a */
        public ImageView f6833a;

        /* JADX INFO: renamed from: b */
        public ImageView f6834b;

        /* JADX INFO: renamed from: c */
        public View f6835c;

        /* JADX INFO: renamed from: d */
        public ImageView f6836d;

        public PopupContentView(Context context) {
            super(context);
            m9220e();
        }

        /* JADX INFO: renamed from: e */
        public final void m9220e() {
            LayoutInflater.from(getContext()).inflate(c7c0.f79606a, this);
            this.f6833a = (ImageView) findViewById(e4c0.f89269e);
            this.f6834b = (ImageView) findViewById(e4c0.f89267c);
            this.f6835c = findViewById(e4c0.f89265a);
            this.f6836d = (ImageView) findViewById(e4c0.f89266b);
        }

        /* JADX INFO: renamed from: f */
        public void m9221f() {
            this.f6833a.setVisibility(4);
            this.f6834b.setVisibility(0);
        }

        /* JADX INFO: renamed from: g */
        public void m9222g() {
            this.f6833a.setVisibility(0);
            this.f6834b.setVisibility(4);
        }
    }

    public enum Style {
        BLUE,
        BLACK
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ToolTipPopup$a */
    public class ViewTreeObserverOnScrollChangedListenerC1709a implements ViewTreeObserver.OnScrollChangedListener {
        public ViewTreeObserverOnScrollChangedListenerC1709a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (ToolTipPopup.m9206a(ToolTipPopup.this).get() == null || ToolTipPopup.m9207b(ToolTipPopup.this) == null || !ToolTipPopup.m9207b(ToolTipPopup.this).isShowing()) {
                return;
            }
            boolean zIsAboveAnchor = ToolTipPopup.m9207b(ToolTipPopup.this).isAboveAnchor();
            ToolTipPopup toolTipPopup = ToolTipPopup.this;
            if (zIsAboveAnchor) {
                ToolTipPopup.m9208c(toolTipPopup).m9221f();
            } else {
                ToolTipPopup.m9208c(toolTipPopup).m9222g();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ToolTipPopup$b */
    public class RunnableC1710b implements Runnable {
        public RunnableC1710b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                ToolTipPopup.this.m9209d();
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.widget.ToolTipPopup$c */
    public class ViewOnClickListenerC1711c implements View.OnClickListener {
        public ViewOnClickListenerC1711c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                ToolTipPopup.this.m9209d();
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
    }

    public ToolTipPopup(String str, View view) {
        this.f6825a = str;
        this.f6826b = new WeakReference<>(view);
        this.f6827c = view.getContext();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WeakReference m9206a(ToolTipPopup toolTipPopup) {
        if (lsb.m151554d(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.f6826b;
        } catch (Throwable th) {
            lsb.m151552b(th, ToolTipPopup.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ PopupWindow m9207b(ToolTipPopup toolTipPopup) {
        if (lsb.m151554d(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.f6829e;
        } catch (Throwable th) {
            lsb.m151552b(th, ToolTipPopup.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ PopupContentView m9208c(ToolTipPopup toolTipPopup) {
        if (lsb.m151554d(ToolTipPopup.class)) {
            return null;
        }
        try {
            return toolTipPopup.f6828d;
        } catch (Throwable th) {
            lsb.m151552b(th, ToolTipPopup.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m9209d() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m9214i();
            PopupWindow popupWindow = this.f6829e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9210e() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m9214i();
            if (this.f6826b.get() != null) {
                this.f6826b.get().getViewTreeObserver().addOnScrollChangedListener(this.f6832h);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9211f(long j) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            this.f6831g = j;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9212g(Style style) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            this.f6830f = style;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m9213h() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (this.f6826b.get() != null) {
                PopupContentView popupContentView = new PopupContentView(this.f6827c);
                this.f6828d = popupContentView;
                ((TextView) popupContentView.findViewById(e4c0.f89268d)).setText(this.f6825a);
                Style style = this.f6830f;
                Style style2 = Style.BLUE;
                PopupContentView popupContentView2 = this.f6828d;
                if (style == style2) {
                    popupContentView2.f6835c.setBackgroundResource(s3c0.f162102g);
                    this.f6828d.f6834b.setImageResource(s3c0.f162103h);
                    this.f6828d.f6833a.setImageResource(s3c0.f162104i);
                    this.f6828d.f6836d.setImageResource(s3c0.f162105j);
                } else {
                    popupContentView2.f6835c.setBackgroundResource(s3c0.f162098c);
                    this.f6828d.f6834b.setImageResource(s3c0.f162099d);
                    this.f6828d.f6833a.setImageResource(s3c0.f162100e);
                    this.f6828d.f6836d.setImageResource(s3c0.f162101f);
                }
                View decorView = ((Activity) this.f6827c).getWindow().getDecorView();
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                m9210e();
                this.f6828d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupContentView popupContentView3 = this.f6828d;
                PopupWindow popupWindow = new PopupWindow(popupContentView3, popupContentView3.getMeasuredWidth(), this.f6828d.getMeasuredHeight());
                this.f6829e = popupWindow;
                popupWindow.showAsDropDown(this.f6826b.get());
                m9215j();
                if (this.f6831g > 0) {
                    this.f6828d.postDelayed(new RunnableC1710b(), this.f6831g);
                }
                this.f6829e.setTouchable(true);
                this.f6828d.setOnClickListener(new ViewOnClickListenerC1711c());
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9214i() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (this.f6826b.get() != null) {
                this.f6826b.get().getViewTreeObserver().removeOnScrollChangedListener(this.f6832h);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9215j() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.f6829e;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            boolean zIsAboveAnchor = this.f6829e.isAboveAnchor();
            PopupContentView popupContentView = this.f6828d;
            if (zIsAboveAnchor) {
                popupContentView.m9221f();
            } else {
                popupContentView.m9222g();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
