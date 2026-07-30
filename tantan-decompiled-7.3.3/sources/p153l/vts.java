package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightItem;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class vts extends jic0<lsw.C18452b> {

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f185742c;

    /* JADX INFO: renamed from: d */
    public List<lsw.C18452b> f185743d;

    public vts(VRecyclerView vRecyclerView) {
        this.f185742c = vRecyclerView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        if (jyb.m147479J(this.f185743d)) {
            return 0;
        }
        return this.f185743d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f185742c.getContext()).inflate(yec0.f198993Z1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, lsw.C18452b c18452b, int i, int i2) {
        ((LiveGuardPrivilegeRightItem) view).m75872i0(c18452b);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public lsw.C18452b getItem(int i) {
        if (jyb.m147479J(this.f185743d)) {
            return null;
        }
        return this.f185743d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m202764G(List<lsw.C18452b> list) {
        this.f185743d = list;
    }
}
