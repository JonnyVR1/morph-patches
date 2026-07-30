package p149l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2456e;

/* JADX INFO: loaded from: classes6.dex */
public final class jix0 extends zew<String, a0s0> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2456e f118208i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jix0(C2456e c2456e, int i) {
        super(20);
        this.f118208i = c2456e;
    }

    @Override // p149l.zew
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a0s0 mo141716a(String str) {
        String str2 = str;
        Preconditions.checkNotEmpty(str2);
        return C2456e.m15110y(this.f118208i, str2);
    }
}
