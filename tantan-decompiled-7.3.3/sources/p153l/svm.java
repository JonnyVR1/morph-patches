package p153l;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class svm {

    /* JADX INFO: renamed from: e */
    @NonNull
    public static final svm f170856e = new svm(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f170857a;

    /* JADX INFO: renamed from: b */
    public final int f170858b;

    /* JADX INFO: renamed from: c */
    public final int f170859c;

    /* JADX INFO: renamed from: d */
    public final int f170860d;

    /* JADX INFO: renamed from: l.svm$a */
    @RequiresApi(29)
    public static class C20162a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Insets m188217a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public svm(int i, int i2, int i3, int i4) {
        this.f170857a = i;
        this.f170858b = i2;
        this.f170859c = i3;
        this.f170860d = i4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static svm m188212a(@NonNull svm svmVar, @NonNull svm svmVar2) {
        return m188213b(Math.max(svmVar.f170857a, svmVar2.f170857a), Math.max(svmVar.f170858b, svmVar2.f170858b), Math.max(svmVar.f170859c, svmVar2.f170859c), Math.max(svmVar.f170860d, svmVar2.f170860d));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static svm m188213b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f170856e : new svm(i, i2, i3, i4);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static svm m188214c(@NonNull Rect rect) {
        return m188213b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: d */
    public static svm m188215d(@NonNull Insets insets) {
        return m188213b(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @RequiresApi(29)
    /* JADX INFO: renamed from: e */
    public Insets m188216e() {
        return C20162a.m188217a(this.f170857a, this.f170858b, this.f170859c, this.f170860d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || svm.class != obj.getClass()) {
            return false;
        }
        svm svmVar = (svm) obj;
        return this.f170860d == svmVar.f170860d && this.f170857a == svmVar.f170857a && this.f170859c == svmVar.f170859c && this.f170858b == svmVar.f170858b;
    }

    public int hashCode() {
        return (((((this.f170857a * 31) + this.f170858b) * 31) + this.f170859c) * 31) + this.f170860d;
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.f170857a + ", top=" + this.f170858b + ", right=" + this.f170859c + ", bottom=" + this.f170860d + '}';
    }
}
