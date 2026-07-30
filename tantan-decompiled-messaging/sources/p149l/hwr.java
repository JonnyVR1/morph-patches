package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public abstract class hwr<V extends View> extends d1q<V> {

    /* JADX INFO: renamed from: a */
    public CharSequence f109781a;

    public hwr(CharSequence charSequence) {
        this.f109781a = charSequence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.m196470a(this.f109781a, ((hwr) obj).f109781a);
    }

    public int hashCode() {
        return v050.m196471b(this.f109781a);
    }
}
