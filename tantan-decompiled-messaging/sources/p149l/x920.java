package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class x920 {

    /* JADX INFO: renamed from: a */
    public int f191569a;

    /* JADX INFO: renamed from: b */
    public int f191570b;

    public x920(@NonNull ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: a */
    public int m207460a() {
        return this.f191570b | this.f191569a;
    }

    /* JADX INFO: renamed from: b */
    public void m207461b(@NonNull View view, @NonNull View view2, int i) {
        m207462c(view, view2, i, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m207462c(@NonNull View view, @NonNull View view2, int i, int i2) {
        if (i2 == 1) {
            this.f191570b = i;
        } else {
            this.f191569a = i;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m207463d(@NonNull View view) {
        m207464e(view, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m207464e(@NonNull View view, int i) {
        if (i == 1) {
            this.f191570b = 0;
        } else {
            this.f191569a = 0;
        }
    }
}
