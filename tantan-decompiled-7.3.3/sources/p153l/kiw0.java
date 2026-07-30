package p153l;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.ads.C2289v1;
import com.google.android.gms.internal.ads.C2297w1;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
public final class kiw0 {

    /* JADX INFO: renamed from: a */
    public final Context f127050a;

    /* JADX INFO: renamed from: b */
    public final Looper f127051b;

    public kiw0(@NonNull Context context, @NonNull Looper looper) {
        this.f127050a = context;
        this.f127051b = looper;
    }

    /* JADX INFO: renamed from: a */
    public final void m149983a(@NonNull String str) {
        xiw0 xiw0VarM13468L = C2297w1.m13468L();
        xiw0VarM13468L.m211175q(this.f127050a.getPackageName());
        xiw0VarM13468L.m211177s(2);
        viw0 viw0VarM13429L = C2289v1.m13429L();
        viw0VarM13429L.m201426q(str);
        viw0VarM13429L.m201427r(2);
        xiw0VarM13468L.m211176r(viw0VarM13429L);
        new liw0(this.f127050a, this.f127051b, (C2297w1) xiw0VarM13468L.m185950m()).m154422a();
    }
}
