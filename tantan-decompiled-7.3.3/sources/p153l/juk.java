package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class juk extends jic0<g2t> {

    /* JADX INFO: renamed from: c */
    public ArrayList<g2t> f122722c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public y20<String> f122723d;

    public juk(y20<String> y20Var) {
        this.f122723d = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f122722c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198933U1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, g2t g2tVar, int i, int i2) {
        ((LiveGuardItem) view).m75833j0(g2tVar, this.f122723d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public g2t getItem(int i) {
        return this.f122722c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m146991G(List<g2t> list) {
        this.f122722c.clear();
        this.f122722c.addAll(list);
        notifyDataSetChanged();
    }
}
