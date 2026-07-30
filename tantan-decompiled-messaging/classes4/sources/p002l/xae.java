package p002l;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.xdl0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xae {

    /* JADX INFO: renamed from: a */
    public int f22194a;

    /* JADX INFO: renamed from: b */
    public List<mae> f22195b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public RecyclerView.n f22196c = new C0895a();

    /* JADX INFO: renamed from: d */
    public pae f22197d;

    /* JADX INFO: renamed from: e */
    public d30 f22198e;

    /* JADX INFO: renamed from: l.xae$a */
    public class C0895a extends RecyclerView.n {
        public C0895a() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.set(xdl0.w(20.0f), 0, xdl0.w(10.0f), 0);
            } else if (childAdapterPosition == xae.this.f22195b.size() - 1) {
                rect.set(0, 0, xdl0.w(20.0f), 0);
            } else {
                rect.set(0, 0, xdl0.w(10.0f), 0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m25809d(final DrawGiftContainer drawGiftContainer, RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        pae paeVar = new pae(recyclerView.getContext());
        this.f22197d = paeVar;
        recyclerView.setAdapter(paeVar);
        recyclerView.removeItemDecoration(this.f22196c);
        recyclerView.addItemDecoration(this.f22196c);
        this.f22197d.m20178K(this.f22195b);
        this.f22197d.f17171e = new e30() { // from class: l.uae
            public final void call(Object obj) {
                this.f20564a.m25813h(drawGiftContainer, (mae) obj);
            }
        };
        this.f22197d.f17172f = new e30() { // from class: l.vae
            public final void call(Object obj) {
                drawGiftContainer.m7059J0();
            }
        };
        drawGiftContainer.f5589D.put(this, new e30() { // from class: l.wae
            public final void call(Object obj) {
                this.f21589a.m25814i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m25810e(mae maeVar) {
        this.f22195b.add(maeVar);
    }

    /* JADX INFO: renamed from: f */
    public int m25811f() {
        return this.f22195b.size();
    }

    /* JADX INFO: renamed from: g */
    public RecyclerView m25812g(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19468B0, viewGroup, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m25813h(DrawGiftContainer drawGiftContainer, mae maeVar) {
        if (maeVar.f15295b) {
            return;
        }
        drawGiftContainer.setGiftItem(maeVar.f15294a);
        drawGiftContainer.m7057H0(maeVar);
        d30 d30Var = this.f22198e;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m25814i(Integer num) {
        m25815j(this.f22197d, num.intValue());
    }

    /* JADX INFO: renamed from: j */
    public void m25815j(pae paeVar, int i) {
        mae maeVar;
        if (paeVar != null) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f22195b.size()) {
                    maeVar = null;
                    i2 = 0;
                    break;
                } else {
                    if (this.f22195b.get(i2).f15295b) {
                        maeVar = this.f22195b.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (maeVar != null) {
                int iG4 = ypv.k().g4();
                int i3 = maeVar.f15297d;
                boolean z2 = i3 >= iG4 && i < iG4;
                if (i3 < iG4 && i >= iG4) {
                    z = true;
                }
                maeVar.f15297d = i;
                if (z2 || z) {
                    paeVar.notifyItemChanged(i2);
                }
            }
        }
    }
}
