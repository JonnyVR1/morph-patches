package p007l;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class jrv {

    /* JADX INFO: renamed from: a */
    public Uri f3022a;

    /* JADX INFO: renamed from: b */
    public int f3023b;

    /* JADX INFO: renamed from: c */
    public int f3024c;

    /* JADX INFO: renamed from: d */
    public fub.InterfaceC0547a f3025d;

    /* JADX INFO: renamed from: e */
    public boolean f3026e = false;

    public jrv(Uri uri, fub.InterfaceC0547a interfaceC0547a) {
        this.f3022a = uri;
        this.f3025d = interfaceC0547a;
    }

    /* JADX INFO: renamed from: a */
    public void m9555a(int i, int i2) {
        this.f3023b = i;
        this.f3024c = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m9556b(Context context) {
        if (this.f3026e) {
            return;
        }
        if (this.f3023b == 0 || this.f3024c == 0) {
            jub.m9557a("LoadBitmapCommand for %s delayed, wrong dimensions {width=%d, height=%d}", this.f3022a.toString(), Integer.valueOf(this.f3023b), Integer.valueOf(this.f3024c));
        } else {
            this.f3026e = true;
            fub.m9148h().m9157m(context, this.f3022a, this.f3023b, this.f3024c, this.f3025d);
        }
    }
}
