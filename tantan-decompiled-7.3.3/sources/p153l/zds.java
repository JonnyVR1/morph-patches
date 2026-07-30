package p153l;

import android.view.View;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class zds extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public final String f203941a;

    /* JADX INFO: renamed from: b */
    public final String f203942b;

    public zds(String str, String str2) {
        this.f203941a = str;
        this.f203942b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zds zdsVar = (zds) obj;
            if (k950.m148863a(this.f203941a, zdsVar.f203941a) && k950.m148863a(this.f203942b, zdsVar.f203942b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f203941a, this.f203942b);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199202p3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        izs.m142868s("context_single_room", (VDraweeView) view.findViewById(mdc0.f136179g1), this.f203941a);
        ((TextView) view.findViewById(mdc0.f135944G6)).setText(this.f203942b);
    }
}
