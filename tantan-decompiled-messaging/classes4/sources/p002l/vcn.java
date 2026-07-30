package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vcn extends al2 {

    /* JADX INFO: renamed from: L */
    public VText f21070L;

    @Override // p002l.al2
    /* JADX INFO: renamed from: A */
    public VText mo8782A() {
        return this.f21070L;
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: F */
    public void mo8787F() {
        View viewM23818e0 = m23818e0(act().inflater(), null);
        this.f21070L.setEnabled(true);
        this.f7704t.addView(viewM23818e0);
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: a0 */
    public void mo8801a0() {
        this.f21070L.setText(R$string.f3517qa);
    }

    /* JADX INFO: renamed from: e0 */
    public View m23818e0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wcn.m24502b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: y */
    public void mo8813y(boolean z) {
    }
}
