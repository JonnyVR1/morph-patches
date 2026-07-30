package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p153l.yqd0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m88121d2 = {"Ljava/lang/reflect/Method;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/reflect/Method;)Ljava/lang/String;", SocialOperation.GAME_SIGNATURE, "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class RuntimeTypeMapperKt {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m88925a(Class cls) {
        cls.getClass();
        return ReflectClassUtilKt.m89883f(cls);
    }

    /* JADX INFO: renamed from: d */
    public static final String m88928d(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(ArraysKt.joinToString$default(parameterTypes, "", "(", ")", 0, (CharSequence) null, yqd0.INSTANCE, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(ReflectClassUtilKt.m89883f(returnType));
        return sb.toString();
    }
}
