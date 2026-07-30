package p149l;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public class jrv {

    /* JADX INFO: renamed from: a */
    public Uri f119445a;

    /* JADX INFO: renamed from: b */
    public int f119446b;

    /* JADX INFO: renamed from: c */
    public int f119447c;

    /* JADX INFO: renamed from: d */
    public fub.InterfaceC16922a f119448d;

    /* JADX INFO: renamed from: e */
    public boolean f119449e = false;

    public jrv(Uri uri, fub.InterfaceC16922a interfaceC16922a) {
        this.f119445a = uri;
        this.f119448d = interfaceC16922a;
    }

    /* JADX INFO: renamed from: a */
    public void m142975a(int i, int i2) {
        this.f119446b = i;
        this.f119447c = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m142976b(Context context) {
        if (this.f119449e) {
            return;
        }
        if (this.f119446b == 0 || this.f119447c == 0) {
            jub.m143262a("LoadBitmapCommand for %s delayed, wrong dimensions {width=%d, height=%d}", this.f119445a.toString(), Integer.valueOf(this.f119446b), Integer.valueOf(this.f119447c));
        } else {
            this.f119449e = true;
            fub.m123168h().m123177m(context, this.f119445a, this.f119446b, this.f119447c, this.f119448d);
        }
    }
}
