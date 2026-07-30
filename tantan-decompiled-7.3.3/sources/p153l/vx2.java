package p153l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class vx2 extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public LiveBaseAdapter f186222a = new LiveBaseAdapter();

    /* JADX INFO: renamed from: b */
    public final int f186223b;

    /* JADX INFO: renamed from: c */
    public int f186224c;

    /* JADX INFO: renamed from: d */
    public final boolean f186225d;

    /* JADX INFO: renamed from: e */
    public final Map<Integer, teg.C20297a> f186226e;

    /* JADX INFO: renamed from: l.vx2$a */
    public class C20950a extends RecyclerView.AbstractC0578n {
        public C20950a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            rect.set(0, 0, bnl0.m105587w(4.0f), 0);
        }
    }

    public vx2(boolean z, int i, int i2, Map<Integer, teg.C20297a> map) {
        HashMap map2 = new HashMap();
        this.f186226e = map2;
        this.f186225d = z;
        this.f186223b = i2;
        map2.putAll(map);
        this.f186224c = i;
    }

    /* JADX INFO: renamed from: I */
    private List<d3q<?>> m203830I() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f186226e.values());
        for (int i = 0; i < arrayList2.size(); i++) {
            final teg.C20297a c20297a = (teg.C20297a) arrayList2.get(i);
            aes aesVar = new aes(c20297a.f173812a, this.f186223b == c20297a.f173814c);
            aesVar.mo113881A(new View.OnClickListener() { // from class: l.ux2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((hiv) zrv.m221194l(htd0.f111521c)).m135144D(c20297a.f173814c);
                }
            });
            arrayList.add(aesVar);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vx2 vx2Var = (vx2) obj;
            if (this.f186223b == vx2Var.f186223b && k950.m148863a(this.f186226e, vx2Var.f186226e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(Integer.valueOf(this.f186223b), this.f186226e);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: m */
    public void mo72182m(View view) {
        super.mo72182m(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(mdc0.f136095X4);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.addItemDecoration(new C20950a());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199020b3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        ((RecyclerView) view.findViewById(mdc0.f136095X4)).setAdapter(this.f186222a);
        this.f186222a.m68554Z(m203830I());
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: w */
    public void mo72183w(View view) {
        super.mo72183w(view);
        ((RecyclerView) view.findViewById(mdc0.f136095X4)).setAdapter(null);
    }
}
