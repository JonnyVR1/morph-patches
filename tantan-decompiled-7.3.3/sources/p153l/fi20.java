package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class fi20 {

    /* JADX INFO: renamed from: a */
    public int f99147a;

    /* JADX INFO: renamed from: b */
    public int f99148b;

    public fi20(@NonNull ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: a */
    public int m125663a() {
        return this.f99148b | this.f99147a;
    }

    /* JADX INFO: renamed from: b */
    public void m125664b(@NonNull View view, @NonNull View view2, int i) {
        m125665c(view, view2, i, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m125665c(@NonNull View view, @NonNull View view2, int i, int i2) {
        if (i2 == 1) {
            this.f99148b = i;
        } else {
            this.f99147a = i;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m125666d(@NonNull View view) {
        m125667e(view, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m125667e(@NonNull View view, int i) {
        if (i == 1) {
            this.f99148b = 0;
        } else {
            this.f99147a = 0;
        }
    }
}
