package kotlin.script.experimental.dependencies;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006$"}, m88121d2 = {"Lkotlin/script/experimental/dependencies/ScriptDependencies;", "", "Ljava/io/File;", "javaHome", "", "classpath", "", "imports", "sources", "scripts", "<init>", "(Ljava/io/File;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "getJavaHome", "()Ljava/io/File;", "b", "Ljava/util/List;", "getClasspath", "()Ljava/util/List;", "c", "getImports", Constants.INAPP_DATA_TAG, "getSources", "e", "getScripts", "Companion", "kotlin-script-runtime"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final /* data */ class ScriptDependencies {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final ScriptDependencies f67141f = new ScriptDependencies(null, null, null, null, null, 31, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final File javaHome;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<File> classpath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<String> imports;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<File> sources;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<File> scripts;

    public /* synthetic */ ScriptDependencies(File file, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? CollectionsKt.emptyList() : list4);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScriptDependencies)) {
            return false;
        }
        ScriptDependencies scriptDependencies = (ScriptDependencies) other;
        return Intrinsics.m88377d(this.javaHome, scriptDependencies.javaHome) && Intrinsics.m88377d(this.classpath, scriptDependencies.classpath) && Intrinsics.m88377d(this.imports, scriptDependencies.imports) && Intrinsics.m88377d(this.sources, scriptDependencies.sources) && Intrinsics.m88377d(this.scripts, scriptDependencies.scripts);
    }

    public int hashCode() {
        File file = this.javaHome;
        return ((((((((file == null ? 0 : file.hashCode()) * 31) + this.classpath.hashCode()) * 31) + this.imports.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.scripts.hashCode();
    }

    @NotNull
    public String toString() {
        return "ScriptDependencies(javaHome=" + this.javaHome + ", classpath=" + this.classpath + ", imports=" + this.imports + ", sources=" + this.sources + ", scripts=" + this.scripts + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScriptDependencies(@Nullable File file, @NotNull List<? extends File> list, @NotNull List<String> list2, @NotNull List<? extends File> list3, @NotNull List<? extends File> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.javaHome = file;
        this.classpath = list;
        this.imports = list2;
        this.sources = list3;
        this.scripts = list4;
    }

    public ScriptDependencies() {
        this(null, null, null, null, null, 31, null);
    }
}
