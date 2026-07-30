package p002l;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d1q;
import l.fld0;
import l.ggv;
import l.v050;
import l.xdl0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gx2 extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public LiveBaseAdapter f11663a = new LiveBaseAdapter();

    /* JADX INFO: renamed from: b */
    public final int f11664b;

    /* JADX INFO: renamed from: c */
    public int f11665c;

    /* JADX INFO: renamed from: d */
    public final boolean f11666d;

    /* JADX INFO: renamed from: e */
    public final Map<Integer, fdg.C0564a> f11667e;

    /* JADX INFO: renamed from: l.gx2$a */
    public class C0599a extends RecyclerView.n {
        public C0599a() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            rect.set(0, 0, xdl0.w(4.0f), 0);
        }
    }

    public gx2(boolean z, int i, int i2, Map<Integer, fdg.C0564a> map) {
        HashMap map2 = new HashMap();
        this.f11667e = map2;
        this.f11666d = z;
        this.f11664b = i2;
        map2.putAll(map);
        this.f11665c = i;
    }

    /* JADX INFO: renamed from: I */
    private List<d1q<?>> m14071I() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f11667e.values());
        for (int i = 0; i < arrayList2.size(); i++) {
            final fdg.C0564a c0564a = (fdg.C0564a) arrayList2.get(i);
            zbs zbsVar = new zbs(c0564a.f10300a, this.f11664b == c0564a.f10302c);
            zbsVar.A(new View.OnClickListener() { // from class: l.fx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((ggv) ypv.l(fld0.c)).D(c0564a.f10302c);
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
            if (this.f11664b == gx2Var.f11664b && v050.a(this.f11667e, gx2Var.f11667e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{Integer.valueOf(this.f11664b), this.f11667e});
    }

    /* JADX INFO: renamed from: m */
    public void m14072m(View view) {
        super.m(view);
        RecyclerView recyclerViewFindViewById = view.findViewById(g5c0.f11000X4);
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerViewFindViewById.addItemDecoration(new C0599a());
    }

    /* JADX INFO: renamed from: o */
    public int m14073o() {
        return t6c0.f19784b3;
    }

    /* JADX INFO: renamed from: u */
    public void m14074u(View view) {
        super.u(view);
        view.findViewById(g5c0.f11000X4).setAdapter(this.f11663a);
        this.f11663a.Z(m14071I());
    }

    /* JADX INFO: renamed from: w */
    public void m14075w(View view) {
        super.w(view);
        view.findViewById(g5c0.f11000X4).setAdapter((RecyclerView.Adapter) null);
    }
}
