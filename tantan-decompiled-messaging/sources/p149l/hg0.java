package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumRenderItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hg0 extends dac0<Integer> {

    /* JADX INFO: renamed from: c */
    public List<Integer> f107541c;

    public hg0() {
        ArrayList arrayList = new ArrayList();
        this.f107541c = arrayList;
        arrayList.add(Integer.valueOf(x2c0.f190347m0));
        this.f107541c.add(Integer.valueOf(x2c0.f190347m0));
        this.f107541c.add(Integer.valueOf(x2c0.f190347m0));
        this.f107541c.add(Integer.valueOf(x2c0.f190347m0));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f107541c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96072x, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Integer num, int i, int i2) {
        if (i == 1) {
            ((AiAlbumRenderItemView) view).m44274q(num);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (vwb.m200296J(this.f107541c)) {
            return null;
        }
        return this.f107541c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public void m130803G() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }
}
