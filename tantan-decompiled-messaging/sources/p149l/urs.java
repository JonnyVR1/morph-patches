package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightItem;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class urs extends dac0<mpw.C18529b> {

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f177872c;

    /* JADX INFO: renamed from: d */
    public List<mpw.C18529b> f177873d;

    public urs(VRecyclerView vRecyclerView) {
        this.f177872c = vRecyclerView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        if (vwb.m200296J(this.f177873d)) {
            return 0;
        }
        return this.f177873d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f177872c.getContext()).inflate(t6c0.f168261Z1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mpw.C18529b c18529b, int i, int i2) {
        ((LiveGuardPrivilegeRightItem) view).m74689i0(c18529b);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mpw.C18529b getItem(int i) {
        if (vwb.m200296J(this.f177873d)) {
            return null;
        }
        return this.f177873d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m195122G(List<mpw.C18529b> list) {
        this.f177873d = list;
    }
}
