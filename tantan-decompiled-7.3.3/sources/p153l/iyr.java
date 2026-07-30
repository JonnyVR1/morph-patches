package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public abstract class iyr<V extends View> extends d3q<V> {

    /* JADX INFO: renamed from: a */
    public CharSequence f117622a;

    public iyr(CharSequence charSequence) {
        this.f117622a = charSequence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k950.m148863a(this.f117622a, ((iyr) obj).f117622a);
    }

    public int hashCode() {
        return k950.m148864b(this.f117622a);
    }
}
