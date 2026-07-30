package p006l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumPickerItemView;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dg0 extends dac0<jf0> {

    /* JADX INFO: renamed from: c */
    public List<jf0> f10388c = new ArrayList();

    /* JADX INFO: renamed from: C */
    public int m14037C() {
        return this.f10388c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14038D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f12469w, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m14036A(View view, jf0 jf0Var, int i, int i2) {
        if (i == 1) {
            ((AiAlbumPickerItemView) view).m7222q(jf0Var);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public jf0 getItem(int i) {
        if (vwb.J(this.f10388c)) {
            return null;
        }
        return this.f10388c.get(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G */
    public void m14041G(List<jf0> list) {
        this.f10388c.clear();
        this.f10388c.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return 1;
    }
}
