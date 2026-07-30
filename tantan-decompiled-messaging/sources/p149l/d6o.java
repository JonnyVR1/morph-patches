package p149l;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d6o<V extends View> extends d1q<V> implements Comparable<d6o<? extends View>> {

    /* JADX INFO: renamed from: a */
    public int f84647a = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull d6o<? extends View> d6oVar) {
        return this.f84647a - d6oVar.f84647a;
    }

    /* JADX INFO: renamed from: I */
    public int m110183I() {
        return this.f84647a;
    }

    /* JADX INFO: renamed from: J */
    public void m110184J(int i) {
        this.f84647a = i;
    }
}
