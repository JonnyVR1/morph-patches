package p006l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumRenderItemView;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hg0 extends dac0<Integer> {

    /* JADX INFO: renamed from: c */
    public List<Integer> f13870c;

    public hg0() {
        ArrayList arrayList = new ArrayList();
        this.f13870c = arrayList;
        arrayList.add(Integer.valueOf(x2c0.f26883m0));
        this.f13870c.add(Integer.valueOf(x2c0.f26883m0));
        this.f13870c.add(Integer.valueOf(x2c0.f26883m0));
        this.f13870c.add(Integer.valueOf(x2c0.f26883m0));
    }

    /* JADX INFO: renamed from: C */
    public int m16212C() {
        return this.f13870c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m16213D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f12486x, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m16211A(View view, Integer num, int i, int i2) {
        if (i == 1) {
            ((AiAlbumRenderItemView) view).m7230q(num);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (vwb.J(this.f13870c)) {
            return null;
        }
        return this.f13870c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public void m16216G() {
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return 1;
    }
}
