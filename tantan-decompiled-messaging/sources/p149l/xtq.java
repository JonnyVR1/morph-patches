package p149l;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/xtq;", "", "<init>", "()V", "Ll/jcl0;", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Ll/jcl0;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class xtq {

    @NotNull
    public static final xtq INSTANCE = new xtq();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final <T extends jcl0> T m211015a(@NotNull Class<T> modelClass) throws InvocationTargetException {
        modelClass.getClass();
        try {
            Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                ibe.m135253a("Cannot create an instance of ", modelClass);
                return null;
            }
            try {
                T tNewInstance = declaredConstructor.newInstance(null);
                tNewInstance.getClass();
                return tNewInstance;
            } catch (IllegalAccessException e) {
                ptc0.m171306a("Cannot create an instance of ", modelClass, e);
                return null;
            } catch (InstantiationException e2) {
                ptc0.m171306a("Cannot create an instance of ", modelClass, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            ptc0.m171306a("Cannot create an instance of ", modelClass, e3);
            return null;
        }
    }
}
