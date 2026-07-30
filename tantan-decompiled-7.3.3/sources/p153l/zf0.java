package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumPickerItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class zf0 extends jic0<ff0> {

    /* JADX INFO: renamed from: c */
    public List<ff0> f204099c = new ArrayList();

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f204099c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126109w, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, ff0 ff0Var, int i, int i2) {
        if (i == 1) {
            ((AiAlbumPickerItemView) view).m45449q(ff0Var);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ff0 getItem(int i) {
        if (jyb.m147479J(this.f204099c)) {
            return null;
        }
        return this.f204099c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public void m219519G(List<ff0> list) {
        this.f204099c.clear();
        this.f204099c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }
}
