package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import l.f30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pzh extends RecyclerView.Adapter<C2461b> {

    /* JADX INFO: renamed from: a */
    public List<fyh> f12031a;

    /* JADX INFO: renamed from: b */
    public Context f12032b;

    /* JADX INFO: renamed from: c */
    public l80<fyh> f12033c = new C2460a();

    /* JADX INFO: renamed from: d */
    public f30<Integer, fyh> f12034d;

    /* JADX INFO: renamed from: l.pzh$a */
    public class C2460a extends l80<fyh> {
        public C2460a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(fyh fyhVar, int i, View view) {
            zvf0.A("e_set_my_state_type", "p_state_post_guide", new j760[]{vwb.Y("state_type_id", fyhVar.m10328b().f209id)});
        }
    }

    /* JADX INFO: renamed from: l.pzh$b */
    public class C2461b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public ViewGroup f12036a;

        /* JADX INFO: renamed from: b */
        public AutoVDraweeView f12037b;

        public C2461b(View view) {
            super(view);
            this.f12036a = (ViewGroup) view.findViewById(b5c0.f5952C1);
            this.f12037b = view.findViewById(b5c0.f6085r0);
        }
    }

    public pzh(List<fyh> list, Context context) {
        this.f12031a = list;
        this.f12032b = context;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m13363A(int i, fyh fyhVar, View view) {
        this.f12034d.call(Integer.valueOf(i), fyhVar);
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C2461b c2461b, final int i) {
        int iM13369z = i % m13369z();
        final fyh fyhVar = this.f12031a.get(iM13369z);
        if (nkg.m12199A()) {
            xdl0.D0(t100.d(100.0f), new View[]{c2461b.f12037b});
            xdl0.C0(c2461b.f12037b, t100.d(100.0f));
        }
        c2461b.f12037b.x(fyhVar.m10329c(), 1);
        this.f12033c.m11594h(((RecyclerView.d0) c2461b).itemView, fyhVar, iM13369z);
        xdl0.E0(((RecyclerView.d0) c2461b).itemView, new View.OnClickListener() { // from class: l.ozh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11652a.m13363A(i, fyhVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C2461b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2461b(LayoutInflater.from(this.f12032b).inflate(o6c0.f11245k3, viewGroup, false));
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NonNull @NotNull C2461b c2461b) {
        super.onViewAttachedToWindow(c2461b);
        this.f12033c.m11597o();
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NonNull @NotNull C2461b c2461b) {
        super.onViewDetachedFromWindow(c2461b);
        this.f12033c.m11597o();
    }

    /* JADX INFO: renamed from: G */
    public void m13368G(f30<Integer, fyh> f30Var) {
        this.f12034d = f30Var;
    }

    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: z */
    public int m13369z() {
        return this.f12031a.size();
    }
}
