package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class JvmDescriptorTypeWriter<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JvmTypeFactory<T> f65719a;

    /* JADX INFO: renamed from: b */
    public int f65720b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public T f65721c;

    /* JADX INFO: renamed from: a */
    public void m91212a() {
    }

    /* JADX INFO: renamed from: b */
    public void m91213b() {
        if (this.f65721c == null) {
            this.f65720b++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m91214c(@NotNull T t) {
        t.getClass();
        m91215d(t);
    }

    /* JADX INFO: renamed from: d */
    public final void m91215d(@NotNull T t) {
        t.getClass();
        if (this.f65721c == null) {
            if (this.f65720b > 0) {
                t = this.f65719a.mo91242a(C15493d.m94366B("[", this.f65720b) + this.f65719a.mo91246e(t));
            }
            this.f65721c = t;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m91216e(@NotNull Name name, @NotNull T t) {
        name.getClass();
        t.getClass();
        m91215d(t);
    }
}
