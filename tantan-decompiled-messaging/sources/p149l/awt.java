package p149l;

import android.view.View;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class awt extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final CharSequence f72081a;

    public awt(CharSequence charSequence) {
        this.f72081a = charSequence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.m196470a(this.f72081a, ((awt) obj).f72081a);
    }

    public int hashCode() {
        return v050.m196471b(this.f72081a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168587y3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        ((VText) view.findViewById(g5c0.f100699G6)).setText(this.f72081a);
    }
}
