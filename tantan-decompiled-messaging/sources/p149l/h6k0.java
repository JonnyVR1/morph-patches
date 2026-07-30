package p149l;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class h6k0 {

    /* JADX INFO: renamed from: l.h6k0$a */
    @RequiresApi(24)
    public static class C17232a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m129484a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m129483a(@NonNull Context context) {
        return C17232a.m129484a(context);
    }
}
