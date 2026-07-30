package p153l;

import android.view.View;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class byt extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public final CharSequence f79058a;

    public byt(CharSequence charSequence) {
        this.f79058a = charSequence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k950.m148863a(this.f79058a, ((byt) obj).f79058a);
    }

    public int hashCode() {
        return k950.m148864b(this.f79058a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199319y3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        ((VText) view.findViewById(mdc0.f135944G6)).setText(this.f79058a);
    }
}
