package p153l;

import android.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class n5j {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC18809e f140368a = new C18807c();

    /* JADX INFO: renamed from: l.n5j$a */
    @RequiresApi(15)
    public static class C18805a extends C18808d {
    }

    /* JADX INFO: renamed from: l.n5j$b */
    @RequiresApi(23)
    public static class C18806b extends C18805a {
        @Override // p153l.n5j.InterfaceC18809e
        /* JADX INFO: renamed from: a */
        public void mo161727a(Fragment fragment, String[] strArr, int i) {
            fragment.requestPermissions(strArr, i);
        }
    }

    /* JADX INFO: renamed from: l.n5j$c */
    @RequiresApi(24)
    public static class C18807c extends C18806b {
    }

    /* JADX INFO: renamed from: l.n5j$d */
    public static class C18808d implements InterfaceC18809e {
    }

    /* JADX INFO: renamed from: l.n5j$e */
    public interface InterfaceC18809e {
        /* JADX INFO: renamed from: a */
        void mo161727a(Fragment fragment, String[] strArr, int i);
    }

    @Deprecated
    public n5j() {
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m161726a(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
        f140368a.mo161727a(fragment, strArr, i);
    }
}
