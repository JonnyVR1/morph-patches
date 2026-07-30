package p153l;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class nfk0 {

    /* JADX INFO: renamed from: l.nfk0$a */
    @RequiresApi(24)
    public static class C18866a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m162930a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m162929a(@NonNull Context context) {
        return C18866a.m162930a(context);
    }
}
