package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class trk extends dac0<f0t> {

    /* JADX INFO: renamed from: c */
    public ArrayList<f0t> f171821c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public e30<String> f171822d;

    public trk(e30<String> e30Var) {
        this.f171822d = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f171821c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168201U1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, f0t f0tVar, int i, int i2) {
        ((LiveGuardItem) view).m74650j0(f0tVar, this.f171822d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public f0t getItem(int i) {
        return this.f171821c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m190424G(List<f0t> list) {
        this.f171821c.clear();
        this.f171821c.addAll(list);
        notifyDataSetChanged();
    }
}
