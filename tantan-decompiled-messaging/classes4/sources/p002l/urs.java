package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeRightItem;
import java.util.List;
import l.dac0;
import l.vwb;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class urs extends dac0<mpw.C0682b> {

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f20769c;

    /* JADX INFO: renamed from: d */
    public List<mpw.C0682b> f20770d;

    public urs(VRecyclerView vRecyclerView) {
        this.f20769c = vRecyclerView;
    }

    /* JADX INFO: renamed from: C */
    public int m23585C() {
        if (vwb.J(this.f20770d)) {
            return 0;
        }
        return this.f20770d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m23586D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f20769c.getContext()).inflate(t6c0.f19757Z1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m23584A(View view, mpw.C0682b c0682b, int i, int i2) {
        ((LiveGuardPrivilegeRightItem) view).m8283i0(c0682b);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public mpw.C0682b getItem(int i) {
        if (vwb.J(this.f20770d)) {
            return null;
        }
        return this.f20770d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m23589G(List<mpw.C0682b> list) {
        this.f20770d = list;
    }
}
