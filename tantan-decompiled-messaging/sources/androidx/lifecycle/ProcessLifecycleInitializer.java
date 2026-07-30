package androidx.lifecycle;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import p149l.hsm;
import p149l.jcr;
import p149l.pw0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ll/hsm;", "Ll/jcr;", "<init>", "()V", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Ll/jcr;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ProcessLifecycleInitializer implements hsm<jcr> {
    @Override // p149l.hsm
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public jcr mo2995a(@NotNull Context context) {
        context.getClass();
        pw0 pw0VarM171696d = pw0.m171696d(context);
        pw0VarM171696d.getClass();
        if (!pw0VarM171696d.m171700e(ProcessLifecycleInitializer.class)) {
            qkq0.m175383a("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        C0477g.m3022a(context);
        C0485o.Companion companion = C0485o.INSTANCE;
        companion.m3058b(context);
        return companion.m3057a();
    }

    @Override // p149l.hsm
    @NotNull
    public List<Class<? extends hsm<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
