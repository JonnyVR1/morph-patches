package kotlin.reflect.jvm.internal.impl.p120km.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.p120km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.p120km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.p120km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.p120km.KmVersionRequirementVersionKind;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class WritersKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64604a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f64605b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f64606c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f64607d;

        static {
            int[] iArr = new int[KmVersionRequirementVersionKind.values().length];
            try {
                iArr[KmVersionRequirementVersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64604a = iArr;
            int[] iArr2 = new int[KmVersionRequirementLevel.values().length];
            try {
                iArr2[KmVersionRequirementLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KmVersionRequirementLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[KmVersionRequirementLevel.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f64605b = iArr2;
            int[] iArr3 = new int[KmEffectType.values().length];
            try {
                iArr3[KmEffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[KmEffectType.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[KmEffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f64606c = iArr3;
            int[] iArr4 = new int[KmEffectInvocationKind.values().length];
            try {
                iArr4[KmEffectInvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[KmEffectInvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[KmEffectInvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f64607d = iArr4;
        }
    }
}
