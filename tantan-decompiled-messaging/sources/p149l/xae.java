package p149l;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift.DrawGiftContainer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class xae {

    /* JADX INFO: renamed from: a */
    public int f191728a;

    /* JADX INFO: renamed from: b */
    public List<mae> f191729b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public RecyclerView.AbstractC0576n f191730c = new C21053a();

    /* JADX INFO: renamed from: d */
    public pae f191731d;

    /* JADX INFO: renamed from: e */
    public d30 f191732e;

    /* JADX INFO: renamed from: l.xae$a */
    public class C21053a extends RecyclerView.AbstractC0576n {
        public C21053a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.set(xdl0.m208407w(20.0f), 0, xdl0.m208407w(10.0f), 0);
            } else if (childAdapterPosition == xae.this.f191729b.size() - 1) {
                rect.set(0, 0, xdl0.m208407w(20.0f), 0);
            } else {
                rect.set(0, 0, xdl0.m208407w(10.0f), 0);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m207565d(final DrawGiftContainer drawGiftContainer, RecyclerView recyclerView) {
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        pae paeVar = new pae(recyclerView.getContext());
        this.f191731d = paeVar;
        recyclerView.setAdapter(paeVar);
        recyclerView.removeItemDecoration(this.f191730c);
        recyclerView.addItemDecoration(this.f191730c);
        this.f191731d.m168094K(this.f191729b);
        this.f191731d.f147971e = new e30() { // from class: l.uae
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175596a.m207569h(drawGiftContainer, (mae) obj);
            }
        };
        this.f191731d.f147972f = new e30() { // from class: l.vae
            @Override // p149l.e30
            public final void call(Object obj) {
                drawGiftContainer.m73517J0();
            }
        };
        drawGiftContainer.f49547D.put(this, new e30() { // from class: l.wae
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185455a.m207570i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m207566e(mae maeVar) {
        this.f191729b.add(maeVar);
    }

    /* JADX INFO: renamed from: f */
    public int m207567f() {
        return this.f191729b.size();
    }

    /* JADX INFO: renamed from: g */
    public RecyclerView m207568g(ViewGroup viewGroup) {
        return (RecyclerView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f167972B0, viewGroup, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m207569h(DrawGiftContainer drawGiftContainer, mae maeVar) {
        if (maeVar.f132844b) {
            return;
        }
        drawGiftContainer.setGiftItem(maeVar.f132843a);
        drawGiftContainer.m73515H0(maeVar);
        d30 d30Var = this.f191732e;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m207570i(Integer num) {
        m207571j(this.f191731d, num.intValue());
    }

    /* JADX INFO: renamed from: j */
    public void m207571j(pae paeVar, int i) {
        mae maeVar;
        if (paeVar != null) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f191729b.size()) {
                    maeVar = null;
                    i2 = 0;
                    break;
                } else {
                    if (this.f191729b.get(i2).f132844b) {
                        maeVar = this.f191729b.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (maeVar != null) {
                int iM195839g4 = ypv.m215672k().m195839g4();
                int i3 = maeVar.f132846d;
                boolean z2 = i3 >= iM195839g4 && i < iM195839g4;
                if (i3 < iM195839g4 && i >= iM195839g4) {
                    z = true;
                }
                maeVar.f132846d = i;
                if (z2 || z) {
                    paeVar.notifyItemChanged(i2);
                }
            }
        }
    }
}
