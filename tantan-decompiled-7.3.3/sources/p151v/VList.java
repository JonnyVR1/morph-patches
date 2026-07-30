package p151v;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import p153l.bnl0;
import p153l.tu2;

/* JADX INFO: loaded from: classes3.dex */
public class VList extends ListView {

    /* JADX INFO: renamed from: a */
    public int f210068a;

    /* JADX INFO: renamed from: b */
    public String f210069b;

    /* JADX INFO: renamed from: c */
    public boolean f210070c;

    /* JADX INFO: renamed from: d */
    public boolean f210071d;

    /* JADX INFO: renamed from: e */
    public InterfaceC22659a f210072e;

    /* JADX INFO: renamed from: v.VList$a */
    public interface InterfaceC22659a {
        /* JADX INFO: renamed from: a */
        void mo150587a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);
    }

    public VList(Context context) {
        super(context);
        this.f210069b = "default";
        this.f210070c = false;
        this.f210071d = false;
        m224319a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m224319a(Context context) {
        if (bnl0.f77541b || "SMARTISAN".equals(Build.BRAND)) {
            setOverScrollMode(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f210070c) {
            int actionMasked = motionEvent.getActionMasked() & 255;
            if (actionMasked == 0) {
                this.f210068a = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                return super.dispatchTouchEvent(motionEvent);
            }
            if (actionMasked == 2) {
                return true;
            }
            if (actionMasked == 1) {
                if (pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY()) != this.f210068a) {
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
        tu2.m192703a("VListMaybeCrash", "Crash Vlist info ==> " + getContext().getClass().getSimpleName() + " , flag => " + this.f210069b);
        return super.getId();
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        InterfaceC22659a interfaceC22659a = this.f210072e;
        if (interfaceC22659a != null) {
            interfaceC22659a.mo150587a(i, i2, i3, i4, i5, i6, i7, i8, z);
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
        this.f210069b = str;
    }

    public void setOverScrollListener(InterfaceC22659a interfaceC22659a) {
        this.f210072e = interfaceC22659a;
    }

    public VList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210069b = "default";
        this.f210070c = false;
        this.f210071d = false;
        m224319a(context);
    }

    public VList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210069b = "default";
        this.f210070c = false;
        this.f210071d = false;
        m224319a(context);
    }
}
