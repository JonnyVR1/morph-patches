package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.AutoVDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class pzh extends RecyclerView.Adapter<C19380b> {

    /* JADX INFO: renamed from: a */
    public List<fyh> f151948a;

    /* JADX INFO: renamed from: b */
    public Context f151949b;

    /* JADX INFO: renamed from: c */
    public l80<fyh> f151950c = new C19379a();

    /* JADX INFO: renamed from: d */
    public f30<Integer, fyh> f151951d;

    /* JADX INFO: renamed from: l.pzh$a */
    public class C19379a extends l80<fyh> {
        public C19379a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(fyh fyhVar, int i, View view) {
            zvf0.m220368A("e_set_my_state_type", "p_state_post_guide", vwb.m200311Y("state_type_id", fyhVar.m123767b().f38748id));
        }
    }

    /* JADX INFO: renamed from: l.pzh$b */
    public class C19380b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public ViewGroup f151953a;

        /* JADX INFO: renamed from: b */
        public AutoVDraweeView f151954b;

        public C19380b(View view) {
            super(view);
            this.f151953a = (ViewGroup) view.findViewById(b5c0.f73471C1);
            this.f151954b = (AutoVDraweeView) view.findViewById(b5c0.f73604r0);
        }
    }

    public pzh(List<fyh> list, Context context) {
        this.f151948a = list;
        this.f151949b = context;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m172228A(int i, fyh fyhVar, View view) {
        this.f151951d.call(Integer.valueOf(i), fyhVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C19380b c19380b, final int i) {
        int iM172234z = i % m172234z();
        final fyh fyhVar = this.f151948a.get(iM172234z);
        if (nkg.m159840A()) {
            xdl0.m208327D0(t100.m186890d(100.0f), c19380b.f151954b);
            xdl0.m208325C0(c19380b.f151954b, t100.m186890d(100.0f));
        }
        c19380b.f151954b.m222887x(fyhVar.m123768c(), 1);
        this.f151950c.m148839h(c19380b.itemView, fyhVar, iM172234z);
        xdl0.m208329E0(c19380b.itemView, new View.OnClickListener() { // from class: l.ozh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146438a.m172228A(i, fyhVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C19380b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C19380b(LayoutInflater.from(this.f151949b).inflate(o6c0.f142226k3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NonNull @NotNull C19380b c19380b) {
        super.onViewAttachedToWindow(c19380b);
        this.f151950c.m148842o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NonNull @NotNull C19380b c19380b) {
        super.onViewDetachedFromWindow(c19380b);
        this.f151950c.m148842o();
    }

    /* JADX INFO: renamed from: G */
    public void m172233G(f30<Integer, fyh> f30Var) {
        this.f151951d = f30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: z */
    public int m172234z() {
        return this.f151948a.size();
    }
}
