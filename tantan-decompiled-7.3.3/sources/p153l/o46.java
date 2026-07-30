package p153l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o46 implements RecyclerView.InterfaceC0583s {

    /* JADX INFO: renamed from: a */
    public lmj f144936a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f144937b;

    /* JADX INFO: renamed from: l.o46$a */
    public class C19030a extends GestureDetector.SimpleOnGestureListener {
        public C19030a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewFindChildViewUnder = o46.this.f144937b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder != null) {
                o46.this.mo42884f(o46.this.f144937b.getChildViewHolder(viewFindChildViewUnder));
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            View viewFindChildViewUnder = o46.this.f144937b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder == null) {
                return true;
            }
            o46.this.mo42883d(o46.this.f144937b.getChildViewHolder(viewFindChildViewUnder));
            return true;
        }
    }

    public o46(RecyclerView recyclerView) {
        this.f144937b = recyclerView;
        this.f144936a = new lmj(recyclerView.getContext(), new C19030a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
    /* JADX INFO: renamed from: a */
    public void mo3425a(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f144936a.m154870a(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
    /* JADX INFO: renamed from: c */
    public boolean mo3426c(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f144936a.m154870a(motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo42883d(RecyclerView.AbstractC0569e0 abstractC0569e0);

    /* JADX INFO: renamed from: f */
    public abstract void mo42884f(RecyclerView.AbstractC0569e0 abstractC0569e0);

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0583s
    /* JADX INFO: renamed from: e */
    public void mo3427e(boolean z) {
    }
}
