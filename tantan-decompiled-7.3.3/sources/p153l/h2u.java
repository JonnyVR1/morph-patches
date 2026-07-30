package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.base.R$string;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class h2u extends d3q<View> implements p4u, d6m {

    /* JADX INFO: renamed from: a */
    public boolean f107587a;

    /* JADX INFO: renamed from: b */
    public int f107588b;

    /* JADX INFO: renamed from: c */
    public boolean f107589c;

    /* JADX INFO: renamed from: d */
    public int f107590d;

    /* JADX INFO: renamed from: e */
    public String f107591e = tbs.f172988a.getString(R$string.f44961I);

    public h2u(int i, boolean z, boolean z2) {
        this.f107589c = true;
        this.f107588b = i;
        this.f107587a = z;
        this.f107589c = z2;
    }

    /* JADX INFO: renamed from: H */
    public final void m133402H(View view) {
        boolean z = this.f107587a || this.f107589c;
        VText vText = (VText) view.findViewById(jdc0.f120171X0);
        if (z) {
            vText.setText(this.f107591e);
        }
        int i = this.f107590d;
        if (i != 0) {
            vText.setTextColor(i);
        }
        bnl0.m105524M(view, z);
    }

    /* JADX INFO: renamed from: I */
    public void m133403I(int i) {
        this.f107590d = i;
    }

    /* JADX INFO: renamed from: J */
    public void m133404J(String str) {
        this.f107591e = str;
    }

    @Override // p153l.d6m
    /* JADX INFO: renamed from: b */
    public void mo71534b(RecyclerView.AbstractC0569e0 abstractC0569e0, StaggeredGridLayoutManager.C0595c c0595c) {
        c0595c.m3577i(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h2u h2uVar = (h2u) obj;
            if (this.f107587a == h2uVar.f107587a && this.f107588b == h2uVar.f107588b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(Boolean.valueOf(this.f107587a), Integer.valueOf(this.f107588b));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: m */
    public void mo72182m(View view) {
        m133402H(view);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183733a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return this.f107588b;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        m133402H(view);
        y6u.m214518v(view, this.f107587a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: v */
    public void mo71942v(View view, @NonNull List<Object> list) {
        super.mo71942v(view, list);
        if (m170580h(list)) {
            ((VText) view.findViewById(jdc0.f120171X0)).setText(tbs.f172988a.getString(R$string.f45057u));
            y6u.m214518v(view, false);
        }
    }
}
