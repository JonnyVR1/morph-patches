package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c7h<T> extends dac0<T> {

    /* JADX INFO: renamed from: l.c7h$a */
    public class C16090a extends RecyclerView.AbstractC0566d0 {
        public C16090a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract View mo105564E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo105565F(int i);

    /* JADX INFO: renamed from: G */
    public abstract void mo105566G(View view, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (mo105565F(i)) {
            return -3;
        }
        return super.getItemViewType(i);
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        if (abstractC0566d0.getItemViewType() == -3) {
            mo105566G(abstractC0566d0.itemView, i);
        } else {
            super.onBindViewHolder(abstractC0566d0, i);
        }
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return -3 == i ? new C16090a(mo105564E()) : super.onCreateViewHolder(viewGroup, i);
    }
}
