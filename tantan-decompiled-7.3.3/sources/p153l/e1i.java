package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.AutoVDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class e1i extends RecyclerView.Adapter<C16681b> {

    /* JADX INFO: renamed from: a */
    public List<uzh> f91608a;

    /* JADX INFO: renamed from: b */
    public Context f91609b;

    /* JADX INFO: renamed from: c */
    public h80<uzh> f91610c = new C16680a();

    /* JADX INFO: renamed from: d */
    public z20<Integer, uzh> f91611d;

    /* JADX INFO: renamed from: l.e1i$a */
    public class C16680a extends h80<uzh> {
        public C16680a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(uzh uzhVar, int i, View view) {
            i4g0.m138492A("e_set_my_state_type", "p_state_post_guide", jyb.m147494Y("state_type_id", uzhVar.m198834b().f39596id));
        }
    }

    /* JADX INFO: renamed from: l.e1i$b */
    public class C16681b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public ViewGroup f91613a;

        /* JADX INFO: renamed from: b */
        public AutoVDraweeView f91614b;

        public C16681b(View view) {
            super(view);
            this.f91613a = (ViewGroup) view.findViewById(hdc0.f108824C1);
            this.f91614b = (AutoVDraweeView) view.findViewById(hdc0.f108957r0);
        }
    }

    public e1i(List<uzh> list, Context context) {
        this.f91608a = list;
        this.f91609b = context;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m118973A(int i, uzh uzhVar, View view) {
        this.f91611d.call(Integer.valueOf(i), uzhVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C16681b c16681b, final int i) {
        int iM118979z = i % m118979z();
        final uzh uzhVar = this.f91608a.get(iM118979z);
        if (cmg.m111169A()) {
            bnl0.m105507D0(qa00.m175859d(100.0f), c16681b.f91614b);
            bnl0.m105505C0(c16681b.f91614b, qa00.m175859d(100.0f));
        }
        c16681b.f91614b.m224133x(uzhVar.m198835c(), 1);
        this.f91610c.m133881h(c16681b.itemView, uzhVar, iM118979z);
        bnl0.m105509E0(c16681b.itemView, new View.OnClickListener() { // from class: l.d1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84685a.m118973A(i, uzhVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C16681b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C16681b(LayoutInflater.from(this.f91609b).inflate(tec0.f173695k3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NonNull @NotNull C16681b c16681b) {
        super.onViewAttachedToWindow(c16681b);
        this.f91610c.m133884o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NonNull @NotNull C16681b c16681b) {
        super.onViewDetachedFromWindow(c16681b);
        this.f91610c.m133884o();
    }

    /* JADX INFO: renamed from: G */
    public void m118978G(z20<Integer, uzh> z20Var) {
        this.f91611d = z20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: z */
    public int m118979z() {
        return this.f91608a.size();
    }
}
