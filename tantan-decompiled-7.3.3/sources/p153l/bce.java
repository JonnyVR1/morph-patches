package p153l;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bce {

    /* JADX INFO: renamed from: a */
    public int f76133a;

    /* JADX INFO: renamed from: b */
    public List<qbe> f76134b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public RecyclerView.AbstractC0578n f76135c = new C15968a();

    /* JADX INFO: renamed from: d */
    public tbe f76136d;

    /* JADX INFO: renamed from: e */
    public x20 f76137e;

    /* JADX INFO: renamed from: l.bce$a */
    public class C15968a extends RecyclerView.AbstractC0578n {
        public C15968a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.set(bnl0.m105587w(20.0f), 0, bnl0.m105587w(10.0f), 0);
            } else if (childAdapterPosition == bce.this.f76134b.size() - 1) {
                rect.set(0, 0, bnl0.m105587w(20.0f), 0);
            } else {
                rect.set(0, 0, bnl0.m105587w(10.0f), 0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m103498d(final DrawGiftContainer drawGiftContainer, RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        tbe tbeVar = new tbe(recyclerView.getContext());
        this.f76136d = tbeVar;
        recyclerView.setAdapter(tbeVar);
        recyclerView.removeItemDecoration(this.f76135c);
        recyclerView.addItemDecoration(this.f76135c);
        this.f76136d.m190013K(this.f76134b);
        this.f76136d.f172916e = new y20() { // from class: l.ybe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198301a.m103502h(drawGiftContainer, (qbe) obj);
            }
        };
        this.f76136d.f172917f = new y20() { // from class: l.zbe
            @Override // p153l.y20
            public final void call(Object obj) {
                drawGiftContainer.m74700J0();
            }
        };
        drawGiftContainer.f50395D.put(this, new y20() { // from class: l.ace
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69698a.m103503i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m103499e(qbe qbeVar) {
        this.f76134b.add(qbeVar);
    }

    /* JADX INFO: renamed from: f */
    public int m103500f() {
        return this.f76134b.size();
    }

    /* JADX INFO: renamed from: g */
    public RecyclerView m103501g(ViewGroup viewGroup) {
        return (RecyclerView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198704B0, viewGroup, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m103502h(DrawGiftContainer drawGiftContainer, qbe qbeVar) {
        if (qbeVar.f156469b) {
            return;
        }
        drawGiftContainer.setGiftItem(qbeVar.f156468a);
        drawGiftContainer.m74698H0(qbeVar);
        x20 x20Var = this.f76137e;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m103503i(Integer num) {
        m103504j(this.f76136d, num.intValue());
    }

    /* JADX INFO: renamed from: j */
    public void m103504j(tbe tbeVar, int i) {
        qbe qbeVar;
        if (tbeVar != null) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f76134b.size()) {
                    qbeVar = null;
                    i2 = 0;
                    break;
                } else {
                    if (this.f76134b.get(i2).f156469b) {
                        qbeVar = this.f76134b.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (qbeVar != null) {
                int iM203626g4 = zrv.m221193k().m203626g4();
                int i3 = qbeVar.f156471d;
                boolean z2 = i3 >= iM203626g4 && i < iM203626g4;
                if (i3 < iM203626g4 && i >= iM203626g4) {
                    z = true;
                }
                qbeVar.f156471d = i;
                if (z2 || z) {
                    tbeVar.notifyItemChanged(i2);
                }
            }
        }
    }
}
