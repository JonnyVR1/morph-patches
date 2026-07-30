package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.base.R$string;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class j3o extends d1q<View> implements o2u, m3m {

    /* JADX INFO: renamed from: a */
    public boolean f116097a;

    /* JADX INFO: renamed from: b */
    public int f116098b;

    /* JADX INFO: renamed from: c */
    public boolean f116099c;

    /* JADX INFO: renamed from: d */
    public int f116100d;

    /* JADX INFO: renamed from: e */
    public String f116101e;

    public j3o(int i, boolean z, boolean z2) {
        this.f116099c = true;
        this.f116101e = s9s.f163227a.getString(R$string.f44113I);
        this.f116098b = i;
        this.f116097a = z;
        this.f116099c = z2;
    }

    /* JADX INFO: renamed from: H */
    private void m139596H(View view) {
        boolean z = this.f116097a || this.f116099c;
        VText vText = (VText) view.findViewById(d5c0.f84453X0);
        if (z) {
            vText.setText(this.f116101e);
        }
        int i = this.f116100d;
        if (i != 0) {
            vText.setTextColor(i);
        }
        xdl0.m208344M(view, z);
    }

    @Override // p149l.m3m
    /* JADX INFO: renamed from: b */
    public void mo70351b(RecyclerView.AbstractC0566d0 abstractC0566d0, StaggeredGridLayoutManager.C0593c c0593c) {
        c0593c.m3576i(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j3o j3oVar = (j3o) obj;
            if (this.f116097a == j3oVar.f116097a && this.f116098b == j3oVar.f116098b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(Boolean.valueOf(this.f116097a), Integer.valueOf(this.f116098b));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: m */
    public void mo70999m(View view) {
        m139596H(view);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152876a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return this.f116098b;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        m139596H(view);
        x4u.m207036v(view, this.f116097a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: v */
    public void mo70759v(View view, @NonNull List<Object> list) {
        super.mo70759v(view, list);
        if (m162323h(list)) {
            ((VText) view.findViewById(d5c0.f84453X0)).setText(s9s.f163227a.getString(R$string.f44209u));
            x4u.m207036v(view, false);
        }
    }

    public j3o(int i, boolean z) {
        this.f116099c = true;
        this.f116101e = s9s.f163227a.getString(R$string.f44113I);
        this.f116098b = i;
        this.f116097a = z;
    }
}
