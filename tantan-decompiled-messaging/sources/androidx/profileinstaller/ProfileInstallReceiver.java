package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.rfx;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    @NonNull
    public static final String ACTION_BENCHMARK_OPERATION = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    @NonNull
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";

    @NonNull
    public static final String ACTION_SAVE_PROFILE = "androidx.profileinstaller.action.SAVE_PROFILE";

    @NonNull
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";

    @NonNull
    private static final String EXTRA_BENCHMARK_OPERATION = "EXTRA_BENCHMARK_OPERATION";

    @NonNull
    private static final String EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE = "DROP_SHADER_CACHE";

    @NonNull
    private static final String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";

    @NonNull
    private static final String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";

    @NonNull
    private static final String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C0542a implements C0547c.c {
        public C0542a() {
        }

        @Override // androidx.profileinstaller.C0547c.c
        /* JADX INFO: renamed from: a */
        public void mo3221a(int i, @Nullable Object obj) {
            C0547c.f2516b.mo3221a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.C0547c.c
        /* JADX INFO: renamed from: b */
        public void mo3222b(int i, @Nullable Object obj) {
            C0547c.f2516b.mo3222b(i, obj);
        }
    }

    public static void saveProfile(@NonNull C0547c.c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.mo3221a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            C0547c.m3256j(context, new rfx(), new C0542a(), true);
            return;
        }
        if (ACTION_SKIP_FILE.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(EXTRA_SKIP_FILE_OPERATION);
                if (EXTRA_SKIP_FILE_OPERATION_WRITE.equals(string)) {
                    C0547c.m3257k(context, new rfx(), new C0542a());
                    return;
                } else {
                    if (EXTRA_SKIP_FILE_OPERATION_DELETE.equals(string)) {
                        C0547c.m3249c(context, new rfx(), new C0542a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (ACTION_SAVE_PROFILE.equals(action)) {
            saveProfile(new C0542a());
            return;
        }
        if (!ACTION_BENCHMARK_OPERATION.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString(EXTRA_BENCHMARK_OPERATION);
        C0542a c0542a = new C0542a();
        if (EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE.equals(string2)) {
            C0545a.m3231b(context, c0542a);
        } else {
            c0542a.mo3221a(16, null);
        }
    }
}
