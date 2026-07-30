package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;
import p153l.go5;
import p153l.uvq;
import p153l.vvq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "KotlinFunction", "KotlinConstructor", "JavaMethod", "JavaConstructor", "FakeJavaAnnotationConstructor", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class JvmFunctionSignature {

    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", Constants.INAPP_DATA_TAG, "()Ljava/util/List;", "methods", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<?> jClass;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Method> methods;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(@NotNull Class<?> cls) {
            super(null);
            cls.getClass();
            this.jClass = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            this.methods = ArraysKt.sortedWith(declaredMethods, new Comparator() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return go5.m131087d(((Method) t).getName(), ((Method) t2).getName());
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public static final CharSequence m88572c(Method method) {
            Class<?> returnType = method.getReturnType();
            returnType.getClass();
            return ReflectClassUtilKt.m89883f(returnType);
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String get_signature() {
            return CollectionsKt.joinToString$default(this.methods, "", "<init>(", ")V", 0, null, uvq.INSTANCE, 24, null);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final List<Method> m88573d() {
            return this.methods;
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", Constants.INAPP_DATA_TAG, "()Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Constructor<?> constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(@NotNull Constructor<?> constructor) {
            super(null);
            constructor.getClass();
            this.constructor = constructor;
        }

        /* JADX INFO: renamed from: c */
        public static final CharSequence m88575c(Class cls) {
            cls.getClass();
            return ReflectClassUtilKt.m89883f(cls);
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String get_signature() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            parameterTypes.getClass();
            return ArraysKt.joinToString$default(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, vvq.INSTANCE, 24, (Object) null);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Constructor<?> m88576d() {
            return this.constructor;
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Ljava/lang/reflect/Method;", FirebaseAnalytics.Param.METHOD, "<init>", "(Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class JavaMethod extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethod(@NotNull Method method) {
            super(null);
            method.getClass();
            this.method = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String get_signature() {
            return RuntimeTypeMapperKt.m88928d(this.method);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getMethod() {
            return this.method;
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", SocialOperation.GAME_SIGNATURE, "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "constructorDesc", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class KotlinConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final JvmMemberSignature.Method signature;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinConstructor(@NotNull JvmMemberSignature.Method method) {
            super(null);
            method.getClass();
            this.signature = method;
            this._signature = method.mo91899a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m88578b() {
            return this.signature.m91906d();
        }
    }

    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0012"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", SocialOperation.GAME_SIGNATURE, "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "b", "Ljava/lang/String;", "_signature", "c", "methodName", "methodDesc", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class KotlinFunction extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final JvmMemberSignature.Method signature;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String _signature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinFunction(@NotNull JvmMemberSignature.Method method) {
            super(null);
            method.getClass();
            this.signature = method;
            this._signature = method.mo91899a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String get_signature() {
            return this._signature;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m88579b() {
            return this.signature.m91906d();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m88580c() {
            return this.signature.m91907e();
        }
    }

    public /* synthetic */ JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String get_signature();

    private JvmFunctionSignature() {
    }
}
