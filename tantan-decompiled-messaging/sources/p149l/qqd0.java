package p149l;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C0486p;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\u001aK\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m87232d2 = {"Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "Ljava/lang/reflect/Constructor;", "constructor", "", "", CommandMessage.PARAMS, Constants.INAPP_DATA_TAG, "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ll/jcl0;", "", SocialOperation.GAME_SIGNATURE, "c", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "a", "Ljava/util/List;", "ANDROID_VIEWMODEL_SIGNATURE", "b", "VIEWMODEL_SIGNATURE", "lifecycle-viewmodel-savedstate_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class qqd0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final List<Class<?>> f155882a = CollectionsKt.listOf((Object[]) new Class[]{Application.class, C0486p.class});

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<Class<?>> f155883b = CollectionsKt.listOf(C0486p.class);

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Constructor<T> m175905c(@NotNull Class<T> cls, @NotNull List<? extends Class<?>> list) {
        cls.getClass();
        list.getClass();
        Iterator itM87456a = ArrayIteratorKt.m87456a(cls.getConstructors());
        while (itM87456a.hasNext()) {
            Constructor<T> constructor = (Constructor) itM87456a.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List list2 = ArraysKt.toList(parameterTypes);
            if (Intrinsics.m87488d(list, list2)) {
                return constructor;
            }
            if (list.size() == list2.size() && list2.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final <T extends jcl0> T m175906d(@NotNull Class<T> cls, @NotNull Constructor<T> constructor, @NotNull Object... objArr) {
        cls.getClass();
        constructor.getClass();
        objArr.getClass();
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            ptc0.m171306a("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            pkq0.m170054a("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
