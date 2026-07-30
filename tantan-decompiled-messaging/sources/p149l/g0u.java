package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.base.R$string;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class g0u extends d1q<View> implements o2u, m3m {

    /* JADX INFO: renamed from: a */
    public boolean f100082a;

    /* JADX INFO: renamed from: b */
    public int f100083b;

    /* JADX INFO: renamed from: c */
    public boolean f100084c;

    /* JADX INFO: renamed from: d */
    public int f100085d;

    /* JADX INFO: renamed from: e */
    public String f100086e = s9s.f163227a.getString(R$string.f44113I);

    public g0u(int i, boolean z, boolean z2) {
        this.f100084c = true;
        this.f100083b = i;
        this.f100082a = z;
        this.f100084c = z2;
    }

    /* JADX INFO: renamed from: H */
    public final void m124004H(View view) {
        boolean z = this.f100082a || this.f100084c;
        VText vText = (VText) view.findViewById(d5c0.f84453X0);
        if (z) {
            vText.setText(this.f100086e);
        }
        int i = this.f100085d;
        if (i != 0) {
            vText.setTextColor(i);
        }
        xdl0.m208344M(view, z);
    }

    /* JADX INFO: renamed from: I */
    public void m124005I(int i) {
        this.f100085d = i;
    }

    /* JADX INFO: renamed from: J */
    public void m124006J(String str) {
        this.f100086e = str;
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
            g0u g0uVar = (g0u) obj;
            if (this.f100082a == g0uVar.f100082a && this.f100083b == g0uVar.f100083b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(Boolean.valueOf(this.f100082a), Integer.valueOf(this.f100083b));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: m */
    public void mo70999m(View view) {
        m124004H(view);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return q6c0.f152876a;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return this.f100083b;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        m124004H(view);
        x4u.m207036v(view, this.f100082a);
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
}
