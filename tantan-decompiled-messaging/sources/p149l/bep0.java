package p149l;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverVote;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class bep0 extends RecyclerView.Adapter<C15843b> {

    /* JADX INFO: renamed from: a */
    public List<BLiveUndercoverVote> f75179a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public f8m f75180b;

    /* JADX INFO: renamed from: c */
    public boolean f75181c;

    /* JADX INFO: renamed from: l.bep0$a */
    public class ViewOnClickListenerC15842a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveUndercoverVote f75182a;

        public ViewOnClickListenerC15842a(BLiveUndercoverVote bLiveUndercoverVote) {
            this.f75182a = bLiveUndercoverVote;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (bep0.this.f75180b != null) {
                if (TextUtils.equals(this.f75182a.candidateMask.userId, ypv.f199493a.m199309D0())) {
                    lsi0.m151593w(R$string.f46874Oc);
                    return;
                }
                f8m f8mVar = bep0.this.f75180b;
                BLiveUndercoverVote bLiveUndercoverVote = this.f75182a;
                f8mVar.mo120025a(bLiveUndercoverVote.candidateMask.userId, String.valueOf(bLiveUndercoverVote.number));
            }
        }
    }

    /* JADX INFO: renamed from: l.bep0$b */
    public static class C15843b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VDraweeView f75184a;

        /* JADX INFO: renamed from: b */
        public VText f75185b;

        /* JADX INFO: renamed from: c */
        public VRecyclerView f75186c;

        /* JADX INFO: renamed from: d */
        public zdp0 f75187d;

        /* JADX INFO: renamed from: l.bep0$b$a */
        public class a extends RecyclerView.AbstractC0576n {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f75188a;

            public a(boolean z) {
                this.f75188a = z;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
            public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int i = childAdapterPosition / 3;
                rect.top = (-t100.m186890d(this.f75188a ? 3.0f : 4.0f)) * (childAdapterPosition % 3);
                rect.left = i > 0 ? t100.m186890d(1.0f) : 0;
            }
        }

        public C15843b(@NonNull @NotNull View view, boolean z) {
            super(view);
            this.f75184a = (VDraweeView) view.findViewById(g5c0.f100862Y7);
            this.f75185b = (VText) view.findViewById(g5c0.f100871Z7);
            VRecyclerView vRecyclerView = (VRecyclerView) view.findViewById(g5c0.f100881a8);
            this.f75186c = vRecyclerView;
            vRecyclerView.addItemDecoration(new a(z));
            this.f75187d = new zdp0();
            this.f75186c.setLayoutManager(new GridLayoutManager(this.f75186c.getContext(), 3, 0, false));
            this.f75186c.setAdapter(this.f75187d);
        }
    }

    public bep0(f8m f8mVar, boolean z) {
        this.f75180b = f8mVar;
        this.f75181c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public C15843b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
        return i == 0 ? new C15843b(LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168512s6, viewGroup, false), this.f75181c) : new C15843b(LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168486q6, viewGroup, false), this.f75181c);
    }

    /* JADX INFO: renamed from: C */
    public final void m101358C(VRecyclerView vRecyclerView, List<Integer> list) {
        if (list == null || list.size() == 0) {
            vRecyclerView.setVisibility(4);
        } else {
            vRecyclerView.setVisibility(0);
            ((zdp0) vRecyclerView.getAdapter()).m218189A(list);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m101359D(List<BLiveUndercoverVote> list) {
        this.f75179a.clear();
        this.f75179a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75179a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !this.f75181c ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull @NotNull C15843b c15843b, int i) {
        BLiveUndercoverVote bLiveUndercoverVote = this.f75179a.get(i);
        if (bLiveUndercoverVote == null) {
            return;
        }
        c15843b.f75185b.setText(String.valueOf(bLiveUndercoverVote.number));
        wk3.m203643b(c15843b.f75184a, bLiveUndercoverVote.candidateMask, false);
        m101358C(c15843b.f75186c, bLiveUndercoverVote.voterNumbers);
        c15843b.f75184a.setOnClickListener(new ViewOnClickListenerC15842a(bLiveUndercoverVote));
    }
}
