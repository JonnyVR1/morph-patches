package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import l.dac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class c7h<T> extends dac0<T> {

    /* JADX INFO: renamed from: l.c7h$a */
    public class C2351a extends RecyclerView.d0 {
        public C2351a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract View mo9106E();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo9107F(int i);

    /* JADX INFO: renamed from: G */
    public abstract void mo9108G(View view, int i);

    public int getItemViewType(int i) {
        if (mo9107F(i)) {
            return -3;
        }
        return super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.getItemViewType(i);
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        if (d0Var.getItemViewType() == -3) {
            mo9108G(d0Var.itemView, i);
        } else {
            super.onBindViewHolder(d0Var, i);
        }
    }

    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return -3 == i ? new C2351a(mo9106E()) : super.onCreateViewHolder(viewGroup, i);
    }
}
