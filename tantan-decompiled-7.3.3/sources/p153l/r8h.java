package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public abstract class r8h<T> extends jic0<T> {

    /* JADX INFO: renamed from: l.r8h$a */
    public class C19790a extends RecyclerView.AbstractC0569e0 {
        public C19790a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract View mo180207E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo180208F(int i);

    /* JADX INFO: renamed from: G */
    public abstract void mo180209G(View view, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (mo180208F(i)) {
            return -3;
        }
        return super.getItemViewType(i);
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        if (abstractC0569e0.getItemViewType() == -3) {
            mo180209G(abstractC0569e0.itemView, i);
        } else {
            super.onBindViewHolder(abstractC0569e0, i);
        }
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return -3 == i ? new C19790a(mo180207E()) : super.onCreateViewHolder(viewGroup, i);
    }
}
