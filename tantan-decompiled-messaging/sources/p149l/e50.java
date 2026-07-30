package p149l;

import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class e50 extends d50 {
    @Override // p149l.d50
    /* JADX INFO: renamed from: b */
    public void mo110002b(IBinder iBinder) {
        kmc0.m146494l(iel.m135708a()).m146502c("finishActivity", iBinder, 0, null, 0).m146506h();
    }

    @Override // p149l.d50
    @Nullable
    /* JADX INFO: renamed from: d */
    public IBinder mo110003d(int i, Message message) {
        return i == 100 ? (IBinder) kmc0.m146494l(message.obj).m146504e("token").m146506h() : (IBinder) kmc0.m146494l(message.obj).m146504e("arg1").m146506h();
    }
}
