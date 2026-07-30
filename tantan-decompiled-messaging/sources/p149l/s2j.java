package p149l;

import android.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class s2j {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC19833e f161986a = new C19831c();

    /* JADX INFO: renamed from: l.s2j$a */
    @RequiresApi(15)
    public static class C19829a extends C19832d {
    }

    /* JADX INFO: renamed from: l.s2j$b */
    @RequiresApi(23)
    public static class C19830b extends C19829a {
        @Override // p149l.s2j.InterfaceC19833e
        /* JADX INFO: renamed from: a */
        public void mo182067a(Fragment fragment, String[] strArr, int i) {
            fragment.requestPermissions(strArr, i);
        }
    }

    /* JADX INFO: renamed from: l.s2j$c */
    @RequiresApi(24)
    public static class C19831c extends C19830b {
    }

    /* JADX INFO: renamed from: l.s2j$d */
    public static class C19832d implements InterfaceC19833e {
    }

    /* JADX INFO: renamed from: l.s2j$e */
    public interface InterfaceC19833e {
        /* JADX INFO: renamed from: a */
        void mo182067a(Fragment fragment, String[] strArr, int i);
    }

    @Deprecated
    public s2j() {
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m182066a(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
        f161986a.mo182067a(fragment, strArr, i);
    }
}
