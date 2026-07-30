package p153l;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d8o<V extends View> extends d3q<V> implements Comparable<d8o<? extends View>> {

    /* JADX INFO: renamed from: a */
    public int f85660a = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull d8o<? extends View> d8oVar) {
        return this.f85660a - d8oVar.f85660a;
    }

    /* JADX INFO: renamed from: I */
    public int m114918I() {
        return this.f85660a;
    }

    /* JADX INFO: renamed from: J */
    public void m114919J(int i) {
        this.f85660a = i;
    }
}
