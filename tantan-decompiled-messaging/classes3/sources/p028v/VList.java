package p028v;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import l.du2;
import l.xdl0;
import org.eclipse.jetty.servlet.ServletHandler;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VList extends ListView {

    /* JADX INFO: renamed from: a */
    public int f12771a;

    /* JADX INFO: renamed from: b */
    public String f12772b;

    /* JADX INFO: renamed from: c */
    public boolean f12773c;

    /* JADX INFO: renamed from: d */
    public boolean f12774d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1337a f12775e;

    /* JADX INFO: renamed from: v.VList$a */
    public interface InterfaceC1337a {
        /* JADX INFO: renamed from: a */
        void m11554a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);
    }

    public VList(Context context) {
        super(context);
        this.f12772b = ServletHandler.__DEFAULT_SERVLET;
        this.f12773c = false;
        this.f12774d = false;
        m11553a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m11553a(Context context) {
        if (xdl0.b || "SMARTISAN".equals(Build.BRAND)) {
            setOverScrollMode(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f12773c) {
            int actionMasked = motionEvent.getActionMasked() & 255;
            if (actionMasked == 0) {
                this.f12771a = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                return super.dispatchTouchEvent(motionEvent);
            }
            if (actionMasked == 2) {
                return true;
            }
            if (actionMasked == 1) {
                if (pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY()) != this.f12771a) {
                    setPressed(false);
                    invalidate();
                    return true;
                }
                super.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public int getId() {
        du2.a("VListMaybeCrash", "Crash Vlist info ==> " + getContext().getClass().getSimpleName() + " , flag => " + this.f12772b);
        return super.getId();
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        InterfaceC1337a interfaceC1337a = this.f12775e;
        if (interfaceC1337a != null) {
            interfaceC1337a.m11554a(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        if (listAdapter instanceof AbsListView.RecyclerListener) {
            setRecyclerListener((AbsListView.RecyclerListener) listAdapter);
        }
    }

    public void setCrashLogFlag(String str) {
        this.f12772b = str;
    }

    public void setOverScrollListener(InterfaceC1337a interfaceC1337a) {
        this.f12775e = interfaceC1337a;
    }

    public VList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12772b = ServletHandler.__DEFAULT_SERVLET;
        this.f12773c = false;
        this.f12774d = false;
        m11553a(context);
    }

    public VList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12772b = ServletHandler.__DEFAULT_SERVLET;
        this.f12773c = false;
        this.f12774d = false;
        m11553a(context);
    }
}
