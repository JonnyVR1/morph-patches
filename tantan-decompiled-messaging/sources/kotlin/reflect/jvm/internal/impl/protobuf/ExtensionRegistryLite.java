package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b */
    public static final ExtensionRegistryLite f65640b = new ExtensionRegistryLite(true);

    /* JADX INFO: renamed from: a */
    public final Map<C15285a, GeneratedMessageLite.GeneratedExtension<?, ?>> f65641a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite$a */
    public static final class C15285a {

        /* JADX INFO: renamed from: a */
        public final Object f65642a;

        /* JADX INFO: renamed from: b */
        public final int f65643b;

        public C15285a(Object obj, int i) {
            this.f65642a = obj;
            this.f65643b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C15285a)) {
                return false;
            }
            C15285a c15285a = (C15285a) obj;
            return this.f65642a == c15285a.f65642a && this.f65643b == c15285a.f65643b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f65642a) * j6f.COLOR_SPACE_UNCALIBRATED) + this.f65643b;
        }
    }

    public ExtensionRegistryLite() {
        this.f65641a = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static ExtensionRegistryLite m91299c() {
        return f65640b;
    }

    /* JADX INFO: renamed from: d */
    public static ExtensionRegistryLite m91300d() {
        return new ExtensionRegistryLite();
    }

    /* JADX INFO: renamed from: a */
    public final void m91301a(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f65641a.put(new C15285a(generatedExtension.m91340b(), generatedExtension.m91342d()), generatedExtension);
    }

    /* JADX INFO: renamed from: b */
    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> m91302b(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.f65641a.get(new C15285a(containingtype, i));
    }

    public ExtensionRegistryLite(boolean z) {
        this.f65641a = Collections.EMPTY_MAP;
    }
}
