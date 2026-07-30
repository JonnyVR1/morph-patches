package p153l;

import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class z40 extends y40 {
    @Override // p153l.y40
    /* JADX INFO: renamed from: b */
    public void mo96011b(IBinder iBinder) {
        puc0.m173843l(ygl.m215846a()).m173851c("finishActivity", iBinder, 0, null, 0).m173855h();
    }

    @Override // p153l.y40
    @Nullable
    /* JADX INFO: renamed from: d */
    public IBinder mo96012d(int i, Message message) {
        return i == 100 ? (IBinder) puc0.m173843l(message.obj).m173853e("token").m173855h() : (IBinder) puc0.m173843l(message.obj).m173853e("arg1").m173855h();
    }
}
