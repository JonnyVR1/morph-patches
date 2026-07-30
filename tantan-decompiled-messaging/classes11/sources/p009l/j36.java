package p009l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import l.sjj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class j36 implements RecyclerView.s {

    /* JADX INFO: renamed from: a */
    public sjj f14925a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f14926b;

    /* JADX INFO: renamed from: l.j36$a */
    public class C0969a extends GestureDetector.SimpleOnGestureListener {
        public C0969a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewFindChildViewUnder = j36.this.f14926b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder != null) {
                j36.this.mo6006f(j36.this.f14926b.getChildViewHolder(viewFindChildViewUnder));
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            View viewFindChildViewUnder = j36.this.f14926b.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            if (viewFindChildViewUnder == null) {
                return true;
            }
            j36.this.mo6005d(j36.this.f14926b.getChildViewHolder(viewFindChildViewUnder));
            return true;
        }
    }

    public j36(RecyclerView recyclerView) {
        this.f14926b = recyclerView;
        this.f14925a = new sjj(recyclerView.getContext(), new C0969a());
    }

    /* JADX INFO: renamed from: a */
    public void m16856a(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f14925a.a(motionEvent);
    }

    /* JADX INFO: renamed from: c */
    public boolean m16857c(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f14925a.a(motionEvent);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo6005d(RecyclerView.d0 d0Var);

    /* JADX INFO: renamed from: f */
    public abstract void mo6006f(RecyclerView.d0 d0Var);

    /* JADX INFO: renamed from: e */
    public void m16858e(boolean z) {
    }
}
