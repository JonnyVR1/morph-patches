package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vcn extends al2 {

    /* JADX INFO: renamed from: L */
    public VText f180967L;

    @Override // p149l.al2
    /* JADX INFO: renamed from: A */
    public VText mo75166A() {
        return this.f180967L;
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: F */
    public void mo75171F() {
        View viewM197907e0 = m197907e0(act().inflater(), null);
        this.f180967L.setEnabled(true);
        this.f70392t.addView(viewM197907e0);
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: a0 */
    public void mo75185a0() {
        this.f180967L.setText(R$string.f47475qa);
    }

    /* JADX INFO: renamed from: e0 */
    public View m197907e0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wcn.m202669b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: y */
    public void mo75197y(boolean z) {
    }
}
