package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b */
    public static final ExtensionRegistryLite f66314b = new ExtensionRegistryLite(true);

    /* JADX INFO: renamed from: a */
    public final Map<C15392a, GeneratedMessageLite.GeneratedExtension<?, ?>> f66315a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite$a */
    public static final class C15392a {

        /* JADX INFO: renamed from: a */
        public final Object f66316a;

        /* JADX INFO: renamed from: b */
        public final int f66317b;

        public C15392a(Object obj, int i) {
            this.f66316a = obj;
            this.f66317b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C15392a)) {
                return false;
            }
            C15392a c15392a = (C15392a) obj;
            return this.f66316a == c15392a.f66316a && this.f66317b == c15392a.f66317b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f66316a) * p7f.COLOR_SPACE_UNCALIBRATED) + this.f66317b;
        }
    }

    public ExtensionRegistryLite() {
        this.f66315a = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static ExtensionRegistryLite m92190c() {
        return f66314b;
    }

    /* JADX INFO: renamed from: d */
    public static ExtensionRegistryLite m92191d() {
        return new ExtensionRegistryLite();
    }

    /* JADX INFO: renamed from: a */
    public final void m92192a(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f66315a.put(new C15392a(generatedExtension.m92231b(), generatedExtension.m92233d()), generatedExtension);
    }

    /* JADX INFO: renamed from: b */
    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> m92193b(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.GeneratedExtension) this.f66315a.get(new C15392a(containingtype, i));
    }

    public ExtensionRegistryLite(boolean z) {
        this.f66315a = Collections.EMPTY_MAP;
    }
}
