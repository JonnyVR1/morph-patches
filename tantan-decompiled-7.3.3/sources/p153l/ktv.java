package p153l;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public class ktv {

    /* JADX INFO: renamed from: a */
    public Uri f128755a;

    /* JADX INFO: renamed from: b */
    public int f128756b;

    /* JADX INFO: renamed from: c */
    public int f128757c;

    /* JADX INFO: renamed from: d */
    public tvb.InterfaceC20409a f128758d;

    /* JADX INFO: renamed from: e */
    public boolean f128759e = false;

    public ktv(Uri uri, tvb.InterfaceC20409a interfaceC20409a) {
        this.f128755a = uri;
        this.f128758d = interfaceC20409a;
    }

    /* JADX INFO: renamed from: a */
    public void m151409a(int i, int i2) {
        this.f128756b = i;
        this.f128757c = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m151410b(Context context) {
        if (this.f128759e) {
            return;
        }
        if (this.f128756b == 0 || this.f128757c == 0) {
            xvb.m213211a("LoadBitmapCommand for %s delayed, wrong dimensions {width=%d, height=%d}", this.f128755a.toString(), Integer.valueOf(this.f128756b), Integer.valueOf(this.f128757c));
        } else {
            this.f128759e = true;
            tvb.m192787h().m192796m(context, this.f128755a, this.f128756b, this.f128757c, this.f128758d);
        }
    }
}
