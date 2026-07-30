package p153l;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public interface p1m extends IInterface {

    /* JADX INFO: renamed from: l.p1m$a */
    public static abstract class AbstractBinderC19271a extends c9s0 implements p1m {
        public AbstractBinderC19271a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        /* JADX INFO: renamed from: O */
        public static p1m m170217O(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof p1m ? (p1m) iInterfaceQueryLocalInterface : new v8s0(iBinder);
        }
    }
}
