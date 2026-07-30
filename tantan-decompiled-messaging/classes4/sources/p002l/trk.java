package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardItem;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class trk extends dac0<f0t> {

    /* JADX INFO: renamed from: c */
    public ArrayList<f0t> f20359c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public e30<String> f20360d;

    public trk(e30<String> e30Var) {
        this.f20360d = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m23154C() {
        return this.f20359c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m23155D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19697U1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m23153A(View view, f0t f0tVar, int i, int i2) {
        ((LiveGuardItem) view).m8243j0(f0tVar, this.f20360d);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public f0t getItem(int i) {
        return this.f20359c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m23158G(List<f0t> list) {
        this.f20359c.clear();
        this.f20359c.addAll(list);
        notifyDataSetChanged();
    }
}
