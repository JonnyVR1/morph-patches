package p153l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class fze {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<ca00> f101473d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final int f101474a;

    /* JADX INFO: renamed from: b */
    public final ha00 f101475b;

    /* JADX INFO: renamed from: c */
    public volatile int f101476c = 0;

    public fze(@NonNull ha00 ha00Var, @IntRange(from = 0) int i) {
        this.f101475b = ha00Var;
        this.f101474a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m128160a(@NonNull Canvas canvas, float f, float f2, @NonNull Paint paint) {
        Typeface typefaceM134099g = this.f101475b.m134099g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM134099g);
        canvas.drawText(this.f101475b.m134095c(), this.f101474a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: b */
    public int m128161b(int i) {
        return m128166g().m108465g(i);
    }

    /* JADX INFO: renamed from: c */
    public int m128162c() {
        return m128166g().m108466h();
    }

    /* JADX INFO: renamed from: d */
    public int m128163d() {
        return this.f101476c;
    }

    /* JADX INFO: renamed from: e */
    public short m128164e() {
        return m128166g().m108468j();
    }

    /* JADX INFO: renamed from: f */
    public int m128165f() {
        return m128166g().m108469k();
    }

    /* JADX INFO: renamed from: g */
    public final ca00 m128166g() {
        ThreadLocal<ca00> threadLocal = f101473d;
        ca00 ca00Var = threadLocal.get();
        if (ca00Var == null) {
            ca00Var = new ca00();
            threadLocal.set(ca00Var);
        }
        this.f101475b.m134096d().m115109i(ca00Var, this.f101474a);
        return ca00Var;
    }

    /* JADX INFO: renamed from: h */
    public short m128167h() {
        return m128166g().m108470l();
    }

    /* JADX INFO: renamed from: i */
    public boolean m128168i() {
        return m128166g().m108467i();
    }

    /* JADX INFO: renamed from: j */
    public void m128169j(boolean z) {
        this.f101476c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m128165f()));
        sb.append(", codepoints:");
        int iM128162c = m128162c();
        for (int i = 0; i < iM128162c; i++) {
            sb.append(Integer.toHexString(m128161b(i)));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return sb.toString();
    }
}
