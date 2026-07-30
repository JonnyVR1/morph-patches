package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.base.R$string;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class j5o extends d3q<View> implements p4u, d6m {

    /* JADX INFO: renamed from: a */
    public boolean f118481a;

    /* JADX INFO: renamed from: b */
    public int f118482b;

    /* JADX INFO: renamed from: c */
    public boolean f118483c;

    /* JADX INFO: renamed from: d */
    public int f118484d;

    /* JADX INFO: renamed from: e */
    public String f118485e;

    public j5o(int i, boolean z, boolean z2) {
        this.f118483c = true;
        this.f118485e = tbs.f172988a.getString(R$string.f44961I);
        this.f118482b = i;
        this.f118481a = z;
        this.f118483c = z2;
    }

    /* JADX INFO: renamed from: H */
    private void m143547H(View view) {
        boolean z = this.f118481a || this.f118483c;
        VText vText = (VText) view.findViewById(jdc0.f120171X0);
        if (z) {
            vText.setText(this.f118485e);
        }
        int i = this.f118484d;
        if (i != 0) {
            vText.setTextColor(i);
        }
        bnl0.m105524M(view, z);
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
            j5o j5oVar = (j5o) obj;
            if (this.f118481a == j5oVar.f118481a && this.f118482b == j5oVar.f118482b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(Boolean.valueOf(this.f118481a), Integer.valueOf(this.f118482b));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: m */
    public void mo72182m(View view) {
        m143547H(view);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return vec0.f183733a;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return this.f118482b;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        m143547H(view);
        y6u.m214518v(view, this.f118481a);
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

    public j5o(int i, boolean z) {
        this.f118483c = true;
        this.f118485e = tbs.f172988a.getString(R$string.f44961I);
        this.f118482b = i;
        this.f118481a = z;
    }
}
