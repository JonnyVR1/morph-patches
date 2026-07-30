package p147v;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import p149l.du2;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VList extends ListView {

    /* JADX INFO: renamed from: a */
    public int f209146a;

    /* JADX INFO: renamed from: b */
    public String f209147b;

    /* JADX INFO: renamed from: c */
    public boolean f209148c;

    /* JADX INFO: renamed from: d */
    public boolean f209149d;

    /* JADX INFO: renamed from: e */
    public InterfaceC22544a f209150e;

    /* JADX INFO: renamed from: v.VList$a */
    public interface InterfaceC22544a {
        /* JADX INFO: renamed from: a */
        void mo131882a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);
    }

    public VList(Context context) {
        super(context);
        this.f209147b = "default";
        this.f209148c = false;
        this.f209149d = false;
        m223073a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m223073a(Context context) {
        if (xdl0.f192400b || "SMARTISAN".equals(Build.BRAND)) {
            setOverScrollMode(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f209148c) {
            int actionMasked = motionEvent.getActionMasked() & 255;
            if (actionMasked == 0) {
                this.f209146a = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                return super.dispatchTouchEvent(motionEvent);
            }
            if (actionMasked == 2) {
                return true;
            }
            if (actionMasked == 1) {
                if (pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY()) != this.f209146a) {
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
        du2.m113670a("VListMaybeCrash", "Crash Vlist info ==> " + getContext().getClass().getSimpleName() + " , flag => " + this.f209147b);
        return super.getId();
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        InterfaceC22544a interfaceC22544a = this.f209150e;
        if (interfaceC22544a != null) {
            interfaceC22544a.mo131882a(i, i2, i3, i4, i5, i6, i7, i8, z);
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
        this.f209147b = str;
    }

    public void setOverScrollListener(InterfaceC22544a interfaceC22544a) {
        this.f209150e = interfaceC22544a;
    }

    public VList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209147b = "default";
        this.f209148c = false;
        this.f209149d = false;
        m223073a(context);
    }

    public VList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209147b = "default";
        this.f209148c = false;
        this.f209149d = false;
        m223073a(context);
    }
}
