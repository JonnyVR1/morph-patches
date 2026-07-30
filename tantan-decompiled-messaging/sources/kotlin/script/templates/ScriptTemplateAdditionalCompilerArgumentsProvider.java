package kotlin.script.templates;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Lkotlin/script/templates/ScriptTemplateAdditionalCompilerArgumentsProvider;", "", "", "", "arguments", "<init>", "(Ljava/lang/Iterable;)V", "a", "Ljava/lang/Iterable;", "getArguments", "()Ljava/lang/Iterable;", "kotlin-script-runtime"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public class ScriptTemplateAdditionalCompilerArgumentsProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Iterable<String> arguments;

    public /* synthetic */ ScriptTemplateAdditionalCompilerArgumentsProvider(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public ScriptTemplateAdditionalCompilerArgumentsProvider(@NotNull Iterable<String> iterable) {
        iterable.getClass();
        this.arguments = iterable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScriptTemplateAdditionalCompilerArgumentsProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
