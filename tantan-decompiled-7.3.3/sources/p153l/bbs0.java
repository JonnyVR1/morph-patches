package p153l;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;

/* JADX INFO: loaded from: classes6.dex */
public final class bbs0 {

    /* JADX INFO: renamed from: a */
    public oys0 f75982a;

    /* JADX INFO: renamed from: b */
    public final Context f75983b;

    /* JADX INFO: renamed from: c */
    public final String f75984c;

    /* JADX INFO: renamed from: d */
    public final xxu0 f75985d;

    /* JADX INFO: renamed from: e */
    public final int f75986e;

    /* JADX INFO: renamed from: f */
    public final bx0.AbstractC16125a f75987f;

    /* JADX INFO: renamed from: g */
    public final qws0 f75988g = new qws0();

    /* JADX INFO: renamed from: h */
    public final ioy0 f75989h = ioy0.f116230a;

    public bbs0(Context context, String str, xxu0 xxu0Var, int i, bx0.AbstractC16125a abstractC16125a) {
        this.f75983b = context;
        this.f75984c = str;
        this.f75985d = xxu0Var;
        this.f75986e = i;
        this.f75987f = abstractC16125a;
    }

    /* JADX INFO: renamed from: a */
    public final void m103310a() {
        try {
            oys0 oys0VarM184298d = k6s0.m148568a().m184298d(this.f75983b, zzq.m12306F(), this.f75984c, this.f75988g);
            this.f75982a = oys0VarM184298d;
            if (oys0VarM184298d != null) {
                if (this.f75986e != 3) {
                    this.f75982a.mo113749I1(new zzw(this.f75986e));
                }
                this.f75982a.mo113742A5(new oas0(this.f75987f, this.f75984c));
                this.f75982a.mo113762f2(this.f75989h.m141359a(this.f75983b, this.f75985d));
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }
}
