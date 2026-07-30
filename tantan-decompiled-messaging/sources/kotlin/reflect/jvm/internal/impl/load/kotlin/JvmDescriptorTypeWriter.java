package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class JvmDescriptorTypeWriter<T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JvmTypeFactory<T> f65045a;

    /* JADX INFO: renamed from: b */
    public int f65046b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public T f65047c;

    /* JADX INFO: renamed from: a */
    public void m90321a() {
    }

    /* JADX INFO: renamed from: b */
    public void m90322b() {
        if (this.f65047c == null) {
            this.f65046b++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m90323c(@NotNull T t) {
        t.getClass();
        m90324d(t);
    }

    /* JADX INFO: renamed from: d */
    public final void m90324d(@NotNull T t) {
        t.getClass();
        if (this.f65047c == null) {
            if (this.f65046b > 0) {
                t = this.f65045a.mo90351a(C15386d.m93475B("[", this.f65046b) + this.f65045a.mo90355e(t));
            }
            this.f65047c = t;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m90325e(@NotNull Name name, @NotNull T t) {
        name.getClass();
        t.getClass();
        m90324d(t);
    }
}
