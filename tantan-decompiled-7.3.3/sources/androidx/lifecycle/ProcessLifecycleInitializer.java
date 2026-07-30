package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import p153l.jum;
import p153l.ker;
import p153l.wtq0;
import p153l.ww0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ll/jum;", "Ll/ker;", "<init>", "()V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Ll/ker;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ProcessLifecycleInitializer implements jum<ker> {
    @Override // p153l.jum
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ker mo2996a(@NotNull Context context) {
        context.getClass();
        ww0 ww0VarM208111d = ww0.m208111d(context);
        ww0VarM208111d.getClass();
        if (!ww0VarM208111d.m208115e(ProcessLifecycleInitializer.class)) {
            wtq0.m207906a("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        C0478g.m3023a(context);
        C0486o.Companion companion = C0486o.INSTANCE;
        companion.m3059b(context);
        return companion.m3058a();
    }

    @Override // p153l.jum
    @NotNull
    public List<Class<? extends jum<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
