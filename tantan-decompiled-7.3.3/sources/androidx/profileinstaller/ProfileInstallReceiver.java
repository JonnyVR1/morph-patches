package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.pox;

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
    public class C0543a implements C0548c.c {
        public C0543a() {
        }

        @Override // androidx.profileinstaller.C0548c.c
        /* JADX INFO: renamed from: a */
        public void mo3222a(int i, @Nullable Object obj) {
            C0548c.f2516b.mo3222a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.C0548c.c
        /* JADX INFO: renamed from: b */
        public void mo3223b(int i, @Nullable Object obj) {
            C0548c.f2516b.mo3223b(i, obj);
        }
    }

    public static void saveProfile(@NonNull C0548c.c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.mo3222a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            C0548c.m3257j(context, new pox(), new C0543a(), true);
            return;
        }
        if (ACTION_SKIP_FILE.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(EXTRA_SKIP_FILE_OPERATION);
                if (EXTRA_SKIP_FILE_OPERATION_WRITE.equals(string)) {
                    C0548c.m3258k(context, new pox(), new C0543a());
                    return;
                } else {
                    if (EXTRA_SKIP_FILE_OPERATION_DELETE.equals(string)) {
                        C0548c.m3250c(context, new pox(), new C0543a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (ACTION_SAVE_PROFILE.equals(action)) {
            saveProfile(new C0543a());
            return;
        }
        if (!ACTION_BENCHMARK_OPERATION.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString(EXTRA_BENCHMARK_OPERATION);
        C0543a c0543a = new C0543a();
        if (EXTRA_BENCHMARK_OPERATION_DROP_SHADER_CACHE.equals(string2)) {
            C0546a.m3232b(context, c0543a);
        } else {
            c0543a.mo3222a(16, null);
        }
    }
}
