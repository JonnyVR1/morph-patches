package p149l;

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
public class bye {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<f100> f77908d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final int f77909a;

    /* JADX INFO: renamed from: b */
    public final k100 f77910b;

    /* JADX INFO: renamed from: c */
    public volatile int f77911c = 0;

    public bye(@NonNull k100 k100Var, @IntRange(from = 0) int i) {
        this.f77910b = k100Var;
        this.f77909a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m104440a(@NonNull Canvas canvas, float f, float f2, @NonNull Paint paint) {
        Typeface typefaceM144132g = this.f77910b.m144132g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM144132g);
        canvas.drawText(this.f77910b.m144128c(), this.f77909a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: b */
    public int m104441b(int i) {
        return m104446g().m119062g(i);
    }

    /* JADX INFO: renamed from: c */
    public int m104442c() {
        return m104446g().m119063h();
    }

    /* JADX INFO: renamed from: d */
    public int m104443d() {
        return this.f77911c;
    }

    /* JADX INFO: renamed from: e */
    public short m104444e() {
        return m104446g().m119065j();
    }

    /* JADX INFO: renamed from: f */
    public int m104445f() {
        return m104446g().m119066k();
    }

    /* JADX INFO: renamed from: g */
    public final f100 m104446g() {
        ThreadLocal<f100> threadLocal = f77908d;
        f100 f100Var = threadLocal.get();
        if (f100Var == null) {
            f100Var = new f100();
            threadLocal.set(f100Var);
        }
        this.f77910b.m144129d().m124046i(f100Var, this.f77909a);
        return f100Var;
    }

    /* JADX INFO: renamed from: h */
    public short m104447h() {
        return m104446g().m119067l();
    }

    /* JADX INFO: renamed from: i */
    public boolean m104448i() {
        return m104446g().m119064i();
    }

    /* JADX INFO: renamed from: j */
    public void m104449j(boolean z) {
        this.f77911c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m104445f()));
        sb.append(", codepoints:");
        int iM104442c = m104442c();
        for (int i = 0; i < iM104442c; i++) {
            sb.append(Integer.toHexString(m104441b(i)));
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        return sb.toString();
    }
}
