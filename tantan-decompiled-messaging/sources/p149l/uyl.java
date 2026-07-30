package p149l;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public interface uyl extends IInterface {

    /* JADX INFO: renamed from: l.uyl$a */
    public static abstract class AbstractBinderC20541a extends wzr0 implements uyl {
        public AbstractBinderC20541a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        /* JADX INFO: renamed from: O */
        public static uyl m196295O(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof uyl ? (uyl) iInterfaceQueryLocalInterface : new pzr0(iBinder);
        }
    }
}
