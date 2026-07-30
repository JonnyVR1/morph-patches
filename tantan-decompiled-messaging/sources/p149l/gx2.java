package p149l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class gx2 extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public LiveBaseAdapter f104817a = new LiveBaseAdapter();

    /* JADX INFO: renamed from: b */
    public final int f104818b;

    /* JADX INFO: renamed from: c */
    public int f104819c;

    /* JADX INFO: renamed from: d */
    public final boolean f104820d;

    /* JADX INFO: renamed from: e */
    public final Map<Integer, fdg.C16810a> f104821e;

    /* JADX INFO: renamed from: l.gx2$a */
    public class C17186a extends RecyclerView.AbstractC0576n {
        public C17186a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            rect.set(0, 0, xdl0.m208407w(4.0f), 0);
        }
    }

    public gx2(boolean z, int i, int i2, Map<Integer, fdg.C16810a> map) {
        HashMap map2 = new HashMap();
        this.f104821e = map2;
        this.f104820d = z;
        this.f104818b = i2;
        map2.putAll(map);
        this.f104819c = i;
    }

    /* JADX INFO: renamed from: I */
    private List<d1q<?>> m128531I() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f104821e.values());
        for (int i = 0; i < arrayList2.size(); i++) {
            final fdg.C16810a c16810a = (fdg.C16810a) arrayList2.get(i);
            zbs zbsVar = new zbs(c16810a.f97038a, this.f104818b == c16810a.f97040c);
            zbsVar.mo109662A(new View.OnClickListener() { // from class: l.fx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((ggv) ypv.m215673l(fld0.f98148c)).m126010D(c16810a.f97040c);
                }
            });
            arrayList.add(zbsVar);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gx2 gx2Var = (gx2) obj;
            if (this.f104818b == gx2Var.f104818b && v050.m196470a(this.f104821e, gx2Var.f104821e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(Integer.valueOf(this.f104818b), this.f104821e);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: m */
    public void mo70999m(View view) {
        super.mo70999m(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(g5c0.f100850X4);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.addItemDecoration(new C17186a());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168288b3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        ((RecyclerView) view.findViewById(g5c0.f100850X4)).setAdapter(this.f104817a);
        this.f104817a.m67371Z(m128531I());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: w */
    public void mo71000w(View view) {
        super.mo71000w(view);
        ((RecyclerView) view.findViewById(g5c0.f100850X4)).setAdapter(null);
    }
}
