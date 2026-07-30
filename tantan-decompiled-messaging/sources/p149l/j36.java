package p149l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j36 implements RecyclerView.InterfaceC0581s {

    /* JADX INFO: renamed from: a */
    public sjj f116002a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f116003b;

    /* JADX INFO: renamed from: l.j36$a */
    public class C17677a extends GestureDetector.SimpleOnGestureListener {
        public C17677a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewFindChildViewUnder = j36.this.f116003b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder != null) {
                j36.this.mo41873f(j36.this.f116003b.getChildViewHolder(viewFindChildViewUnder));
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            View viewFindChildViewUnder = j36.this.f116003b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder == null) {
                return true;
            }
            j36.this.mo41872d(j36.this.f116003b.getChildViewHolder(viewFindChildViewUnder));
            return true;
        }
    }

    public j36(RecyclerView recyclerView) {
        this.f116003b = recyclerView;
        this.f116002a = new sjj(recyclerView.getContext(), new C17677a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
    /* JADX INFO: renamed from: a */
    public void mo3416a(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f116002a.m184493a(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
    /* JADX INFO: renamed from: c */
    public boolean mo3417c(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f116002a.m184493a(motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo41872d(RecyclerView.AbstractC0566d0 abstractC0566d0);

    /* JADX INFO: renamed from: f */
    public abstract void mo41873f(RecyclerView.AbstractC0566d0 abstractC0566d0);

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
    /* JADX INFO: renamed from: e */
    public void mo3418e(boolean z) {
    }
}
