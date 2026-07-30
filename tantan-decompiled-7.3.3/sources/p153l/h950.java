package p153l;

import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes6.dex */
@RetainForClient
@KeepForSdk
public final class h950<T> extends p1m.AbstractBinderC19271a {

    /* JADX INFO: renamed from: a */
    public final Object f108318a;

    public h950(Object obj) {
        this.f108318a = obj;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /* JADX INFO: renamed from: P2 */
    public static <T> T m134037P2(@NonNull p1m p1mVar) {
        if (p1mVar instanceof h950) {
            return (T) ((h950) p1mVar).f108318a;
        }
        IBinder iBinderAsBinder = p1mVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            pvb.m173939a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length);
            return null;
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            wg3.m206174a("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: Y2 */
    public static <T> p1m m134038Y2(@NonNull T t) {
        return new h950(t);
    }
}
