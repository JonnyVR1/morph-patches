package p153l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverVote;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class fnp0 extends RecyclerView.Adapter<C17020b> {

    /* JADX INFO: renamed from: a */
    public List<BLiveUndercoverVote> f99940a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public vam f99941b;

    /* JADX INFO: renamed from: c */
    public boolean f99942c;

    /* JADX INFO: renamed from: l.fnp0$a */
    public class ViewOnClickListenerC17019a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUndercoverVote f99943a;

        public ViewOnClickListenerC17019a(BLiveUndercoverVote bLiveUndercoverVote) {
            this.f99943a = bLiveUndercoverVote;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (fnp0.this.f99941b != null) {
                if (TextUtils.equals(this.f99943a.candidateMask.userId, zrv.f205799a.m207631D0())) {
                    o1j0.m165649w(R$string.f47722Oc);
                    return;
                }
                vam vamVar = fnp0.this.f99941b;
                BLiveUndercoverVote bLiveUndercoverVote = this.f99943a;
                vamVar.mo160554a(bLiveUndercoverVote.candidateMask.userId, String.valueOf(bLiveUndercoverVote.number));
            }
        }
    }

    /* JADX INFO: renamed from: l.fnp0$b */
    public static class C17020b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f99945a;

        /* JADX INFO: renamed from: b */
        public VText f99946b;

        /* JADX INFO: renamed from: c */
        public VRecyclerView f99947c;

        /* JADX INFO: renamed from: d */
        public dnp0 f99948d;

        /* JADX INFO: renamed from: l.fnp0$b$a */
        public class a extends RecyclerView.AbstractC0578n {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f99949a;

            public a(boolean z) {
                this.f99949a = z;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
            public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int i = childAdapterPosition / 3;
                rect.top = (-qa00.m175859d(this.f99949a ? 3.0f : 4.0f)) * (childAdapterPosition % 3);
                rect.left = i > 0 ? qa00.m175859d(1.0f) : 0;
            }
        }

        public C17020b(@NonNull @NotNull View view, boolean z) {
            super(view);
            this.f99945a = (VDraweeView) view.findViewById(mdc0.f136107Y7);
            this.f99946b = (VText) view.findViewById(mdc0.f136116Z7);
            VRecyclerView vRecyclerView = (VRecyclerView) view.findViewById(mdc0.f136126a8);
            this.f99947c = vRecyclerView;
            vRecyclerView.addItemDecoration(new a(z));
            this.f99948d = new dnp0();
            this.f99947c.setLayoutManager(new GridLayoutManager(this.f99947c.getContext(), 3, 0, false));
            this.f99947c.setAdapter(this.f99948d);
        }
    }

    public fnp0(vam vamVar, boolean z) {
        this.f99941b = vamVar;
        this.f99942c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C17020b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return i == 0 ? new C17020b(LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199244s6, viewGroup, false), this.f99942c) : new C17020b(LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199218q6, viewGroup, false), this.f99942c);
    }

    /* JADX INFO: renamed from: C */
    public final void m126372C(VRecyclerView vRecyclerView, List<Integer> list) {
        if (list == null || list.size() == 0) {
            vRecyclerView.setVisibility(4);
        } else {
            vRecyclerView.setVisibility(0);
            ((dnp0) vRecyclerView.getAdapter()).m117067A(list);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m126373D(List<BLiveUndercoverVote> list) {
        this.f99940a.clear();
        this.f99940a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f99940a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !this.f99942c ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull C17020b c17020b, int i) {
        BLiveUndercoverVote bLiveUndercoverVote = this.f99940a.get(i);
        if (bLiveUndercoverVote == null) {
            return;
        }
        c17020b.f99946b.setText(String.valueOf(bLiveUndercoverVote.number));
        ql3.m176984b(c17020b.f99945a, bLiveUndercoverVote.candidateMask, false);
        m126372C(c17020b.f99947c, bLiveUndercoverVote.voterNumbers);
        c17020b.f99945a.setOnClickListener(new ViewOnClickListenerC17019a(bLiveUndercoverVote));
    }
}
