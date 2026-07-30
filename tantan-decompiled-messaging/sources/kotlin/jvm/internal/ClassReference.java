package kotlin.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001.B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u001f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\"R\u001a\u0010-\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u0006/"}, m87232d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "g", "()Ljava/lang/Void;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", BLiveStormDanmakuGiftResourceType.f44446s, "simpleName", "r", "qualifiedName", "", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "getTypeParameters$annotations", "()V", "typeParameters", "Lkotlin/reflect/KType;", "c", "getSupertypes$annotations", "supertypes", "q", "()Z", "isValue$annotations", "isValue", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<Class<? extends Function<?>>, Integer> f63512b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Class<?> jClass;

    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010R,\u0010\u0015\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u0004\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "jClass", "", "c", "(Ljava/lang/Class;)Ljava/lang/String;", "b", "value", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;Ljava/lang/Class;)Z", "type", "a", "(Ljava/lang/String;)Ljava/lang/String;", "e", "", "Lkotlin/Function;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v1 int, still in use, count: 3, list:
          (r8v1 int) from 0x0017: SWITCH (r8v1 int)
         case -1811142716: goto B:118:0x0140
         case -1811142715: goto B:113:0x0133
         case -1811142714: goto B:108:0x0126
         case -1811142713: goto B:103:0x0119
         case -1811142712: goto B:98:0x010c
         case -1811142711: goto B:93:0x00ff
         case -1811142710: goto B:88:0x00f2
         case -1811142709: goto B:83:0x00e5
         case -1811142708: goto B:78:0x00d8
         case -1811142707: goto B:73:0x00cb
         default: goto B:5:0x001a A[RegionRef:SW:4] (LINE:24)
          (r8v1 int) from 0x001a: SWITCH (r8v1 int)
         case -1811142685: goto B:68:0x00be
         case -1811142684: goto B:63:0x00b1
         case -1811142683: goto B:58:0x00a4
         default: goto B:6:0x001d A[RegionRef:SW:5] (LINE:27)
          (r8v1 int) from 0x001d: SWITCH (r8v1 int)
         case 80123371: goto B:53:0x0097
         case 80123372: goto B:48:0x008a
         case 80123373: goto B:43:0x007d
         case 80123374: goto B:38:0x0070
         case 80123375: goto B:33:0x0063
         case 80123376: goto B:28:0x0056
         case 80123377: goto B:23:0x0049
         case 80123378: goto B:18:0x003c
         case 80123379: goto B:13:0x002f
         case 80123380: goto B:8:0x0022
         default: goto B:323:? A[RegionRef:SW:6] (LINE:30)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        public final String m87472a(String type) {
            switch (type) {
                case "kotlin.jvm.internal.DoubleCompanionObject":
                    return "kotlin.Double.Companion";
                case "java.lang.Integer":
                    return "kotlin.Int";
                case "java.lang.Cloneable":
                    return "kotlin.Cloneable";
                case "java.lang.annotation.Annotation":
                    return "kotlin.Annotation";
                case "java.lang.Comparable":
                    return "kotlin.Comparable";
                case "java.util.Map":
                    return "kotlin.collections.Map";
                case "java.util.Set":
                    return "kotlin.collections.Set";
                case "double":
                    return "kotlin.Double";
                case "kotlin.jvm.internal.ByteCompanionObject":
                    return "kotlin.Byte.Companion";
                case "java.lang.CharSequence":
                    return "kotlin.CharSequence";
                case "java.util.Collection":
                    return "kotlin.collections.Collection";
                case "java.lang.Float":
                    return "kotlin.Float";
                case "java.lang.Short":
                    return "kotlin.Short";
                case "kotlin.jvm.internal.CharCompanionObject":
                    return "kotlin.Char.Companion";
                case "kotlin.jvm.internal.LongCompanionObject":
                    return "kotlin.Long.Companion";
                case "java.util.Map$Entry":
                    return "kotlin.collections.Map.Entry";
                case "int":
                    return "kotlin.Int";
                case "byte":
                    return "kotlin.Byte";
                case "char":
                    return "kotlin.Char";
                case "long":
                    return "kotlin.Long";
                case "boolean":
                    return "kotlin.Boolean";
                case "java.util.List":
                    return "kotlin.collections.List";
                case "kotlin.jvm.internal.ShortCompanionObject":
                    return "kotlin.Short.Companion";
                case "float":
                    return "kotlin.Float";
                case "short":
                    return "kotlin.Short";
                case "java.lang.Character":
                    return "kotlin.Char";
                case "kotlin.jvm.internal.EnumCompanionObject":
                    return "kotlin.Enum.Companion";
                case "java.lang.Boolean":
                    return "kotlin.Boolean";
                case "java.lang.Byte":
                    return "kotlin.Byte";
                case "java.lang.Enum":
                    return "kotlin.Enum";
                case "java.lang.Long":
                    return "kotlin.Long";
                case "kotlin.jvm.internal.FloatCompanionObject":
                    return "kotlin.Float.Companion";
                case "java.util.Iterator":
                    return "kotlin.collections.Iterator";
                case "java.util.ListIterator":
                    return "kotlin.collections.ListIterator";
                case "kotlin.jvm.internal.StringCompanionObject":
                    return "kotlin.String.Companion";
                case "java.lang.Double":
                    return "kotlin.Double";
                case "java.lang.Number":
                    return "kotlin.Number";
                case "java.lang.Object":
                    return "kotlin.Any";
                case "java.lang.String":
                    return "kotlin.String";
                case "java.lang.Iterable":
                    return "kotlin.collections.Iterable";
                case "kotlin.jvm.internal.BooleanCompanionObject":
                    return "kotlin.Boolean.Companion";
                case "java.lang.Throwable":
                    return "kotlin.Throwable";
                case "kotlin.jvm.internal.IntCompanionObject":
                    return "kotlin.Int.Companion";
                default:
                    switch (type) {
                        case -1811142716:
                            if (type.equals("kotlin.jvm.functions.Function10")) {
                                return "kotlin.Function10";
                            }
                            return null;
                        case -1811142715:
                            if (type.equals("kotlin.jvm.functions.Function11")) {
                                return "kotlin.Function11";
                            }
                            return null;
                        case -1811142714:
                            if (type.equals("kotlin.jvm.functions.Function12")) {
                                return "kotlin.Function12";
                            }
                            return null;
                        case -1811142713:
                            if (type.equals("kotlin.jvm.functions.Function13")) {
                                return "kotlin.Function13";
                            }
                            return null;
                        case -1811142712:
                            if (type.equals("kotlin.jvm.functions.Function14")) {
                                return "kotlin.Function14";
                            }
                            return null;
                        case -1811142711:
                            if (type.equals("kotlin.jvm.functions.Function15")) {
                                return "kotlin.Function15";
                            }
                            return null;
                        case -1811142710:
                            if (type.equals("kotlin.jvm.functions.Function16")) {
                                return "kotlin.Function16";
                            }
                            return null;
                        case -1811142709:
                            if (type.equals("kotlin.jvm.functions.Function17")) {
                                return "kotlin.Function17";
                            }
                            return null;
                        case -1811142708:
                            if (type.equals("kotlin.jvm.functions.Function18")) {
                                return "kotlin.Function18";
                            }
                            return null;
                        case -1811142707:
                            if (type.equals("kotlin.jvm.functions.Function19")) {
                                return "kotlin.Function19";
                            }
                            return null;
                        default:
                            switch (type) {
                                case -1811142685:
                                    if (type.equals("kotlin.jvm.functions.Function20")) {
                                        return "kotlin.Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (type.equals("kotlin.jvm.functions.Function21")) {
                                        return "kotlin.Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (type.equals("kotlin.jvm.functions.Function22")) {
                                        return "kotlin.Function22";
                                    }
                                    return null;
                                default:
                                    switch (type) {
                                        case 80123371:
                                            if (type.equals("kotlin.jvm.functions.Function0")) {
                                                return "kotlin.Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (type.equals("kotlin.jvm.functions.Function1")) {
                                                return "kotlin.Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (type.equals("kotlin.jvm.functions.Function2")) {
                                                return "kotlin.Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (type.equals("kotlin.jvm.functions.Function3")) {
                                                return "kotlin.Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (type.equals("kotlin.jvm.functions.Function4")) {
                                                return "kotlin.Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (type.equals("kotlin.jvm.functions.Function5")) {
                                                return "kotlin.Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (type.equals("kotlin.jvm.functions.Function6")) {
                                                return "kotlin.Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (type.equals("kotlin.jvm.functions.Function7")) {
                                                return "kotlin.Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (type.equals("kotlin.jvm.functions.Function8")) {
                                                return "kotlin.Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (type.equals("kotlin.jvm.functions.Function9")) {
                                                return "kotlin.Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final String m87473b(@NotNull Class<?> jClass) {
            String strM87472a;
            jClass.getClass();
            String strConcat = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String strM87472a2 = m87472a(jClass.getName());
                return strM87472a2 == null ? jClass.getCanonicalName() : strM87472a2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strM87472a = m87472a(componentType.getName())) != null) {
                strConcat = strM87472a.concat("Array");
            }
            return strConcat == null ? "kotlin.Array" : strConcat;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m87474c(@NotNull Class<?> jClass) {
            String strM87476e;
            jClass.getClass();
            String strConcat = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String strM87476e2 = m87476e(jClass.getName());
                    return strM87476e2 == null ? jClass.getSimpleName() : strM87476e2;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (strM87476e = m87476e(componentType.getName())) != null) {
                    strConcat = strM87476e.concat("Array");
                }
                return strConcat == null ? "Array" : strConcat;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                String strN0 = StringsKt.m93409N0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strN0 != null) {
                    return strN0;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                return StringsKt.m93407M0(simpleName, '$', null, 2, null);
            }
            return StringsKt.m93409N0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX INFO: renamed from: d */
        public final boolean m87475d(@Nullable Object value, @NotNull Class<?> jClass) {
            jClass.getClass();
            Map map = ClassReference.f63512b;
            map.getClass();
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return TypeIntrinsics.m87548o(value, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = JvmClassMappingKt.m87453c(JvmClassMappingKt.m87455e(jClass));
            }
            return jClass.isInstance(value);
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 int, still in use, count: 3, list:
          (r9v1 int) from 0x0019: SWITCH (r9v1 int)
         case -1811142716: goto B:118:0x0142
         case -1811142715: goto B:113:0x0135
         case -1811142714: goto B:108:0x0128
         case -1811142713: goto B:103:0x011b
         case -1811142712: goto B:98:0x010e
         case -1811142711: goto B:93:0x0101
         case -1811142710: goto B:88:0x00f4
         case -1811142709: goto B:83:0x00e7
         case -1811142708: goto B:78:0x00da
         case -1811142707: goto B:73:0x00cd
         default: goto B:5:0x001c A[RegionRef:SW:4] (LINE:26)
          (r9v1 int) from 0x001c: SWITCH (r9v1 int)
         case -1811142685: goto B:68:0x00c0
         case -1811142684: goto B:63:0x00b3
         case -1811142683: goto B:58:0x00a6
         default: goto B:6:0x001f A[RegionRef:SW:5] (LINE:29)
          (r9v1 int) from 0x001f: SWITCH (r9v1 int)
         case 80123371: goto B:53:0x0099
         case 80123372: goto B:48:0x008c
         case 80123373: goto B:43:0x007f
         case 80123374: goto B:38:0x0072
         case 80123375: goto B:33:0x0065
         case 80123376: goto B:28:0x0058
         case 80123377: goto B:23:0x004b
         case 80123378: goto B:18:0x003e
         case 80123379: goto B:13:0x0031
         case 80123380: goto B:8:0x0024
         default: goto B:313:? A[RegionRef:SW:6] (LINE:32)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: e */
        public final String m87476e(String type) {
            switch (type) {
                case "kotlin.jvm.internal.DoubleCompanionObject":
                    return "Companion";
                case "java.lang.Integer":
                    return "Int";
                case "java.lang.Cloneable":
                    return "Cloneable";
                case "java.lang.annotation.Annotation":
                    return "Annotation";
                case "java.lang.Comparable":
                    return "Comparable";
                case "java.util.Map":
                    return "Map";
                case "java.util.Set":
                    return "Set";
                case "double":
                    return "Double";
                case "kotlin.jvm.internal.ByteCompanionObject":
                    return "Companion";
                case "java.lang.CharSequence":
                    return "CharSequence";
                case "java.util.Collection":
                    return "Collection";
                case "java.lang.Float":
                    return "Float";
                case "java.lang.Short":
                    return "Short";
                case "kotlin.jvm.internal.CharCompanionObject":
                    return "Companion";
                case "kotlin.jvm.internal.LongCompanionObject":
                    return "Companion";
                case "java.util.Map$Entry":
                    return "Entry";
                case "int":
                    return "Int";
                case "byte":
                    return "Byte";
                case "char":
                    return "Char";
                case "long":
                    return "Long";
                case "boolean":
                    return "Boolean";
                case "java.util.List":
                    return "List";
                case "kotlin.jvm.internal.ShortCompanionObject":
                    return "Companion";
                case "float":
                    return "Float";
                case "short":
                    return "Short";
                case "java.lang.Character":
                    return "Char";
                case "kotlin.jvm.internal.EnumCompanionObject":
                    return "Companion";
                case "java.lang.Boolean":
                    return "Boolean";
                case "java.lang.Byte":
                    return "Byte";
                case "java.lang.Enum":
                    return "Enum";
                case "java.lang.Long":
                    return "Long";
                case "kotlin.jvm.internal.FloatCompanionObject":
                    return "Companion";
                case "java.util.Iterator":
                    return "Iterator";
                case "java.util.ListIterator":
                    return "ListIterator";
                case "kotlin.jvm.internal.StringCompanionObject":
                    return "Companion";
                case "java.lang.Double":
                    return "Double";
                case "java.lang.Number":
                    return "Number";
                case "java.lang.Object":
                    return "Any";
                case "java.lang.String":
                    return "String";
                case "java.lang.Iterable":
                    return "Iterable";
                case "kotlin.jvm.internal.BooleanCompanionObject":
                    return "Companion";
                case "java.lang.Throwable":
                    return "Throwable";
                case "kotlin.jvm.internal.IntCompanionObject":
                    return "Companion";
                default:
                    switch (type) {
                        case -1811142716:
                            if (type.equals("kotlin.jvm.functions.Function10")) {
                                return "Function10";
                            }
                            return null;
                        case -1811142715:
                            if (type.equals("kotlin.jvm.functions.Function11")) {
                                return "Function11";
                            }
                            return null;
                        case -1811142714:
                            if (type.equals("kotlin.jvm.functions.Function12")) {
                                return "Function12";
                            }
                            return null;
                        case -1811142713:
                            if (type.equals("kotlin.jvm.functions.Function13")) {
                                return "Function13";
                            }
                            return null;
                        case -1811142712:
                            if (type.equals("kotlin.jvm.functions.Function14")) {
                                return "Function14";
                            }
                            return null;
                        case -1811142711:
                            if (type.equals("kotlin.jvm.functions.Function15")) {
                                return "Function15";
                            }
                            return null;
                        case -1811142710:
                            if (type.equals("kotlin.jvm.functions.Function16")) {
                                return "Function16";
                            }
                            return null;
                        case -1811142709:
                            if (type.equals("kotlin.jvm.functions.Function17")) {
                                return "Function17";
                            }
                            return null;
                        case -1811142708:
                            if (type.equals("kotlin.jvm.functions.Function18")) {
                                return "Function18";
                            }
                            return null;
                        case -1811142707:
                            if (type.equals("kotlin.jvm.functions.Function19")) {
                                return "Function19";
                            }
                            return null;
                        default:
                            switch (type) {
                                case -1811142685:
                                    if (type.equals("kotlin.jvm.functions.Function20")) {
                                        return "Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (type.equals("kotlin.jvm.functions.Function21")) {
                                        return "Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (type.equals("kotlin.jvm.functions.Function22")) {
                                        return "Function22";
                                    }
                                    return null;
                                default:
                                    switch (type) {
                                        case 80123371:
                                            if (type.equals("kotlin.jvm.functions.Function0")) {
                                                return "Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (type.equals("kotlin.jvm.functions.Function1")) {
                                                return "Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (type.equals("kotlin.jvm.functions.Function2")) {
                                                return "Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (type.equals("kotlin.jvm.functions.Function3")) {
                                                return "Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (type.equals("kotlin.jvm.functions.Function4")) {
                                                return "Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (type.equals("kotlin.jvm.functions.Function5")) {
                                                return "Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (type.equals("kotlin.jvm.functions.Function6")) {
                                                return "Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (type.equals("kotlin.jvm.functions.Function7")) {
                                                return "Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (type.equals("kotlin.jvm.functions.Function8")) {
                                                return "Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (type.equals("kotlin.jvm.functions.Function9")) {
                                                return "Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        private Companion() {
        }
    }

    static {
        List listListOf = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        int i = 0;
        for (Object obj : listListOf) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.m87240a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f63512b = MapsKt.toMap(arrayList);
    }

    public ClassReference(@NotNull Class<?> cls) {
        cls.getClass();
        this.jClass = cls;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<KType> mo87467c() {
        m87468g();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<?> mo87465d() {
        return this.jClass;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ClassReference) && Intrinsics.m87488d(JvmClassMappingKt.m87453c(this), JvmClassMappingKt.m87453c((KClass) other));
    }

    /* JADX INFO: renamed from: g */
    public final Void m87468g() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        m87468g();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.m87453c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    @SinceKotlin
    public boolean isInstance(@Nullable Object value) {
        return INSTANCE.m87475d(value, mo87465d());
    }

    @Override // kotlin.reflect.KClass
    /* JADX INFO: renamed from: q */
    public boolean mo87469q() {
        m87468g();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* JADX INFO: renamed from: r */
    public String mo87470r() {
        return INSTANCE.m87473b(mo87465d());
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* JADX INFO: renamed from: s */
    public String mo87471s() {
        return INSTANCE.m87474c(mo87465d());
    }

    @NotNull
    public String toString() {
        return mo87465d().toString() + " (Kotlin reflection is not available)";
    }
}
