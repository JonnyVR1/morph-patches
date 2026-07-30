package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ven extends il2 {

    /* JADX INFO: renamed from: L */
    public VText f183833L;

    @Override // p153l.il2
    /* JADX INFO: renamed from: A */
    public VText mo76349A() {
        return this.f183833L;
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: F */
    public void mo76354F() {
        View viewM201075e0 = m201075e0(act().inflater(), null);
        this.f183833L.setEnabled(true);
        this.f115510t.addView(viewM201075e0);
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: a0 */
    public void mo76368a0() {
        this.f183833L.setText(R$string.f48323qa);
    }

    /* JADX INFO: renamed from: e0 */
    public View m201075e0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wen.m206024b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: y */
    public void mo76380y(boolean z) {
    }
}
