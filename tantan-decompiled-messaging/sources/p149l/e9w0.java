package p149l;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.ads.C2266v1;
import com.google.android.gms.internal.ads.C2274w1;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
public final class e9w0 {

    /* JADX INFO: renamed from: a */
    public final Context f90152a;

    /* JADX INFO: renamed from: b */
    public final Looper f90153b;

    public e9w0(@NonNull Context context, @NonNull Looper looper) {
        this.f90152a = context;
        this.f90153b = looper;
    }

    /* JADX INFO: renamed from: a */
    public final void m115399a(@NonNull String str) {
        r9w0 r9w0VarM13414L = C2274w1.m13414L();
        r9w0VarM13414L.m178462q(this.f90152a.getPackageName());
        r9w0VarM13414L.m178464s(2);
        p9w0 p9w0VarM13375L = C2266v1.m13375L();
        p9w0VarM13375L.m167968q(str);
        p9w0VarM13375L.m167969r(2);
        r9w0VarM13414L.m178463r(p9w0VarM13375L);
        new f9w0(this.f90152a, this.f90153b, (C2274w1) r9w0VarM13414L.m153521m()).m120131a();
    }
}
