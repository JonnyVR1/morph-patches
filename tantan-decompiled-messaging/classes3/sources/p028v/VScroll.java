package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tantanapp.common.utils.CrashHelper;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VScroll extends ScrollView {

    /* JADX INFO: renamed from: a */
    public int f12953a;

    /* JADX INFO: renamed from: b */
    public int f12954b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1360b f12955c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1359a f12956d;

    /* JADX INFO: renamed from: v.VScroll$a */
    public interface InterfaceC1359a {
        /* JADX INFO: renamed from: a */
        void mo9423a(VScroll vScroll, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: v.VScroll$b */
    public interface InterfaceC1360b {
        /* JADX INFO: renamed from: a */
        boolean m11677a(int i, int i2);
    }

    public VScroll(Context context) {
        super(context);
        m11675c(context);
    }

    /* JADX INFO: renamed from: c */
    private void m11675c(Context context) {
        if (xdl0.b) {
            setOverScrollMode(2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11676d(InterfaceC1359a interfaceC1359a) {
        this.f12956d = interfaceC1359a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f12955c == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f12955c.m11677a(((int) (motionEvent.getX() + getScrollX())) - this.f12953a, ((int) (motionEvent.getY() + getScrollY())) - this.f12954b)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.c(new Exception("VScroll onInterceptTouchEvent" + e.getMessage(), e));
            return false;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC1359a interfaceC1359a = this.f12956d;
        if (interfaceC1359a != null) {
            interfaceC1359a.mo9423a(this, i, i2, i3, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setInterceptTouchEvent(InterfaceC1360b interfaceC1360b) {
        View view = (View) interfaceC1360b;
        if (interfaceC1360b == 0) {
            this.f12955c = null;
            return;
        }
        this.f12955c = interfaceC1360b;
        this.f12953a = 0;
        this.f12954b = 0;
        while (view.getParent() != this) {
            view = (View) view.getParent();
            this.f12953a += view.getLeft() + view.getScrollX();
            this.f12954b += view.getTop() + view.getScrollY();
        }
    }

    public VScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11675c(context);
    }

    public VScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11675c(context);
    }
}
