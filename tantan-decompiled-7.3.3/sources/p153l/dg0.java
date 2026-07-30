package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumRenderItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class dg0 extends jic0<Integer> {

    /* JADX INFO: renamed from: c */
    public List<Integer> f88239c;

    public dg0() {
        ArrayList arrayList = new ArrayList();
        this.f88239c = arrayList;
        arrayList.add(Integer.valueOf(dbc0.f87235n0));
        this.f88239c.add(Integer.valueOf(dbc0.f87235n0));
        this.f88239c.add(Integer.valueOf(dbc0.f87235n0));
        this.f88239c.add(Integer.valueOf(dbc0.f87235n0));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f88239c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126126x, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Integer num, int i, int i2) {
        if (i == 1) {
            ((AiAlbumRenderItemView) view).m45457q(num);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (jyb.m147479J(this.f88239c)) {
            return null;
        }
        return this.f88239c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public void m115568G() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }
}
