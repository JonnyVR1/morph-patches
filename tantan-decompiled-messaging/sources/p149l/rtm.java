package p149l;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class rtm {

    /* JADX INFO: renamed from: e */
    @NonNull
    public static final rtm f160971e = new rtm(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f160972a;

    /* JADX INFO: renamed from: b */
    public final int f160973b;

    /* JADX INFO: renamed from: c */
    public final int f160974c;

    /* JADX INFO: renamed from: d */
    public final int f160975d;

    /* JADX INFO: renamed from: l.rtm$a */
    @RequiresApi(29)
    public static class C19780a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Insets m180818a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public rtm(int i, int i2, int i3, int i4) {
        this.f160972a = i;
        this.f160973b = i2;
        this.f160974c = i3;
        this.f160975d = i4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static rtm m180813a(@NonNull rtm rtmVar, @NonNull rtm rtmVar2) {
        return m180814b(Math.max(rtmVar.f160972a, rtmVar2.f160972a), Math.max(rtmVar.f160973b, rtmVar2.f160973b), Math.max(rtmVar.f160974c, rtmVar2.f160974c), Math.max(rtmVar.f160975d, rtmVar2.f160975d));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static rtm m180814b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f160971e : new rtm(i, i2, i3, i4);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static rtm m180815c(@NonNull Rect rect) {
        return m180814b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: d */
    public static rtm m180816d(@NonNull Insets insets) {
        return m180814b(insets.left, insets.top, insets.right, insets.bottom);
    }

    @NonNull
    @RequiresApi(29)
    /* JADX INFO: renamed from: e */
    public Insets m180817e() {
        return C19780a.m180818a(this.f160972a, this.f160973b, this.f160974c, this.f160975d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rtm.class != obj.getClass()) {
            return false;
        }
        rtm rtmVar = (rtm) obj;
        return this.f160975d == rtmVar.f160975d && this.f160972a == rtmVar.f160972a && this.f160974c == rtmVar.f160974c && this.f160973b == rtmVar.f160973b;
    }

    public int hashCode() {
        return (((((this.f160972a * 31) + this.f160973b) * 31) + this.f160974c) * 31) + this.f160975d;
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.f160972a + ", top=" + this.f160973b + ", right=" + this.f160974c + ", bottom=" + this.f160975d + '}';
    }
}
