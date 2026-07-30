package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tantanapp.common.utils.CrashHelper;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VScroll extends ScrollView {

    /* JADX INFO: renamed from: a */
    public int f209328a;

    /* JADX INFO: renamed from: b */
    public int f209329b;

    /* JADX INFO: renamed from: c */
    public InterfaceC22567b f209330c;

    /* JADX INFO: renamed from: d */
    public InterfaceC22566a f209331d;

    /* JADX INFO: renamed from: v.VScroll$a */
    public interface InterfaceC22566a {
        /* JADX INFO: renamed from: a */
        void mo43191a(VScroll vScroll, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: v.VScroll$b */
    public interface InterfaceC22567b {
        /* JADX INFO: renamed from: a */
        boolean mo50808a(int i, int i2);
    }

    public VScroll(Context context) {
        super(context);
        m223192c(context);
    }

    /* JADX INFO: renamed from: c */
    private void m223192c(Context context) {
        if (xdl0.f192400b) {
            setOverScrollMode(2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m223193d(InterfaceC22566a interfaceC22566a) {
        this.f209331d = interfaceC22566a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f209330c == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f209330c.mo50808a(((int) (motionEvent.getX() + getScrollX())) - this.f209328a, ((int) (motionEvent.getY() + getScrollY())) - this.f209329b)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("VScroll onInterceptTouchEvent" + e.getMessage(), e));
            return false;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC22566a interfaceC22566a = this.f209331d;
        if (interfaceC22566a != null) {
            interfaceC22566a.mo43191a(this, i, i2, i3, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setInterceptTouchEvent(InterfaceC22567b interfaceC22567b) {
        View view = (View) interfaceC22567b;
        if (interfaceC22567b == 0) {
            this.f209330c = null;
            return;
        }
        this.f209330c = interfaceC22567b;
        this.f209328a = 0;
        this.f209329b = 0;
        while (view.getParent() != this) {
            view = (View) view.getParent();
            this.f209328a += view.getLeft() + view.getScrollX();
            this.f209329b += view.getTop() + view.getScrollY();
        }
    }

    public VScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223192c(context);
    }

    public VScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223192c(context);
    }
}
