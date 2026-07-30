package kotlin.reflect.jvm.internal.calls;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.cmq;
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002*+BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010%R\u0014\u0010)\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", "b", "Ljava/util/List;", "c", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", Constants.INAPP_DATA_TAG, "Ljava/lang/reflect/Type;", "e", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "CallMode", "Origin", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class AnnotationConstructorCaller implements Caller {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Class<?> jClass;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<String> parameterNames;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CallMode callMode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<Method> methods;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<Type> parameterTypes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<Class<?>> erasedParameterTypes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<Object> defaultValues;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "<init>", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "<init>", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum Origin {
        JAVA,
        KOTLIN;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
    }

    public AnnotationConstructorCaller(@NotNull Class<?> cls, @NotNull List<String> list, @NotNull CallMode callMode, @NotNull Origin origin, @NotNull List<Method> list2) {
        cls.getClass();
        list.getClass();
        callMode.getClass();
        origin.getClass();
        list2.getClass();
        this.jClass = cls;
        this.parameterNames = list;
        this.callMode = callMode;
        this.methods = list2;
        List<Method> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list4 = this.methods;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> clsM89888k = ReflectClassUtilKt.m89888k(returnType);
            if (clsM89888k != null) {
                returnType = clsM89888k;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list5 = this.methods;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
        Iterator<T> it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && !CollectionsKt.minus(this.parameterNames, "value").isEmpty()) {
            pr3.m173429a("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a */
    public /* bridge */ boolean mo88949a() {
        return m88953e();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Member mo88950b() {
        return (Member) m88954f();
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ void m88951c(@NotNull Object[] objArr) {
        m88952d(objArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) {
        args.getClass();
        m88951c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = args[i];
            int i3 = i2 + 1;
            Object objM88971q = (obj == null && this.callMode == CallMode.CALL_BY_NAME) ? this.defaultValues.get(i2) : AnnotationConstructorCallerKt.m88971q(obj, this.erasedParameterTypes.get(i2));
            if (objM88971q == null) {
                AnnotationConstructorCallerKt.m88970p(i2, this.parameterNames.get(i2), this.erasedParameterTypes.get(i2));
                throw new KotlinNothingValueException();
            }
            arrayList.add(objM88971q);
            i++;
            i2 = i3;
        }
        return AnnotationConstructorCallerKt.m88961g(this.jClass, MapsKt.toMap(CollectionsKt.zip(this.parameterNames, arrayList)), this.methods);
    }

    /* JADX INFO: renamed from: d */
    public void m88952d(Object[] objArr) {
        objArr.getClass();
        if (CallerKt.m88982a(this) == objArr.length) {
            return;
        }
        cmq.m111312a("Callable expects ", CallerKt.m88982a(this), " arguments, but ", objArr.length, " were provided.");
    }

    /* JADX INFO: renamed from: e */
    public boolean m88953e() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Void m88954f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.jClass;
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, CallMode callMode, Origin origin, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        if ((i & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, callMode, origin, list3);
    }
}
