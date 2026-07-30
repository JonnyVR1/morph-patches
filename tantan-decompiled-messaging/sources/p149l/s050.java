package p149l;

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
public final class s050<T> extends uyl.AbstractBinderC20541a {

    /* JADX INFO: renamed from: a */
    public final Object f161743a;

    public s050(Object obj) {
        this.f161743a = obj;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /* JADX INFO: renamed from: P2 */
    public static <T> T m181847P2(@NonNull uyl uylVar) {
        if (uylVar instanceof s050) {
            return (T) ((s050) uylVar).f161743a;
        }
        IBinder iBinderAsBinder = uylVar.asBinder();
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
            bub.m103905a("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length);
            return null;
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            ig3.m135964a("IObjectWrapper declared field not private!");
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
    public static <T> uyl m181848Y2(@NonNull T t) {
        return new s050(t);
    }
}
