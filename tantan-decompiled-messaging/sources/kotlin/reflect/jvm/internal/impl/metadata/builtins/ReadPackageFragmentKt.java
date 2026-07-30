package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReadPackageFragmentKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> m90865a(@NotNull InputStream inputStream) {
        ProtoBuf.PackageFragment from;
        inputStream.getClass();
        try {
            BuiltInsBinaryVersion builtInsBinaryVersionM90863a = BuiltInsBinaryVersion.Companion.m90863a(inputStream);
            if (builtInsBinaryVersionM90863a.m90862h()) {
                ExtensionRegistryLite extensionRegistryLiteM91300d = ExtensionRegistryLite.m91300d();
                BuiltInsProtoBuf.m90864a(extensionRegistryLiteM91300d);
                from = ProtoBuf.PackageFragment.parseFrom(inputStream, extensionRegistryLiteM91300d);
            } else {
                from = null;
            }
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pairM87240a = TuplesKt.m87240a(from, builtInsBinaryVersionM90863a);
            CloseableKt.m87404a(inputStream, null);
            return pairM87240a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(inputStream, th);
                throw th2;
            }
        }
    }
}
