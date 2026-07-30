package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReadPackageFragmentKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> m91756a(@NotNull InputStream inputStream) {
        ProtoBuf.PackageFragment from;
        inputStream.getClass();
        try {
            BuiltInsBinaryVersion builtInsBinaryVersionM91754a = BuiltInsBinaryVersion.Companion.m91754a(inputStream);
            if (builtInsBinaryVersionM91754a.m91753h()) {
                ExtensionRegistryLite extensionRegistryLiteM92191d = ExtensionRegistryLite.m92191d();
                BuiltInsProtoBuf.m91755a(extensionRegistryLiteM92191d);
                from = ProtoBuf.PackageFragment.parseFrom(inputStream, extensionRegistryLiteM92191d);
            } else {
                from = null;
            }
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pairM88129a = TuplesKt.m88129a(from, builtInsBinaryVersionM91754a);
            CloseableKt.m88293a(inputStream, null);
            return pairM88129a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(inputStream, th);
                throw th2;
            }
        }
    }
}
