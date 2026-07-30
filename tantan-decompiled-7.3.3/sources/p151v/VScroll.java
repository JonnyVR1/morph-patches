package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tantanapp.common.utils.CrashHelper;
import p153l.bnl0;

/* JADX INFO: loaded from: classes3.dex */
public class VScroll extends ScrollView {

    /* JADX INFO: renamed from: a */
    public int f210250a;

    /* JADX INFO: renamed from: b */
    public int f210251b;

    /* JADX INFO: renamed from: c */
    public InterfaceC22682b f210252c;

    /* JADX INFO: renamed from: d */
    public InterfaceC22681a f210253d;

    /* JADX INFO: renamed from: v.VScroll$a */
    public interface InterfaceC22681a {
        /* JADX INFO: renamed from: a */
        void mo44202a(VScroll vScroll, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: v.VScroll$b */
    public interface InterfaceC22682b {
        /* JADX INFO: renamed from: a */
        boolean mo51991a(int i, int i2);
    }

    public VScroll(Context context) {
        super(context);
        m224438c(context);
    }

    /* JADX INFO: renamed from: c */
    private void m224438c(Context context) {
        if (bnl0.f77541b) {
            setOverScrollMode(2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m224439d(InterfaceC22681a interfaceC22681a) {
        this.f210253d = interfaceC22681a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f210252c == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f210252c.mo51991a(((int) (motionEvent.getX() + getScrollX())) - this.f210250a, ((int) (motionEvent.getY() + getScrollY())) - this.f210251b)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("VScroll onInterceptTouchEvent" + e.getMessage(), e));
            return false;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        InterfaceC22681a interfaceC22681a = this.f210253d;
        if (interfaceC22681a != null) {
            interfaceC22681a.mo44202a(this, i, i2, i3, i4);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setInterceptTouchEvent(InterfaceC22682b interfaceC22682b) {
        View view = (View) interfaceC22682b;
        if (interfaceC22682b == 0) {
            this.f210252c = null;
            return;
        }
        this.f210252c = interfaceC22682b;
        this.f210250a = 0;
        this.f210251b = 0;
        while (view.getParent() != this) {
            view = (View) view.getParent();
            this.f210250a += view.getLeft() + view.getScrollX();
            this.f210251b += view.getTop() + view.getScrollY();
        }
    }

    public VScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224438c(context);
    }

    public VScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224438c(context);
    }
}
