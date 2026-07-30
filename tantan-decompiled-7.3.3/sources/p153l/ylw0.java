package p153l;

import android.os.IBinder;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class ylw0 extends vmw0 {

    /* JADX INFO: renamed from: a */
    public IBinder f200595a;

    /* JADX INFO: renamed from: b */
    public String f200596b;

    /* JADX INFO: renamed from: c */
    public int f200597c;

    /* JADX INFO: renamed from: d */
    public float f200598d;

    /* JADX INFO: renamed from: e */
    public int f200599e;

    /* JADX INFO: renamed from: f */
    public String f200600f;

    /* JADX INFO: renamed from: g */
    public byte f200601g;

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: a */
    public final vmw0 mo201847a(String str) {
        this.f200600f = str;
        return this;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: b */
    public final vmw0 mo201848b(String str) {
        this.f200596b = str;
        return this;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: c */
    public final vmw0 mo201849c(int i) {
        this.f200601g = (byte) (this.f200601g | 8);
        return this;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: d */
    public final vmw0 mo201850d(int i) {
        this.f200597c = i;
        this.f200601g = (byte) (this.f200601g | 2);
        return this;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: e */
    public final vmw0 mo201851e(float f) {
        this.f200598d = f;
        this.f200601g = (byte) (this.f200601g | 4);
        return this;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: f */
    public final vmw0 mo201852f(boolean z) {
        this.f200601g = (byte) (this.f200601g | 1);
        return this;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: g */
    public final vmw0 mo201853g(IBinder iBinder) {
        if (iBinder != null) {
            this.f200595a = iBinder;
            return this;
        }
        mnd0.m159157a("Null windowToken");
        return null;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: h */
    public final vmw0 mo201854h(int i) {
        this.f200599e = i;
        this.f200601g = (byte) (this.f200601g | Tnaf.POW_2_WIDTH);
        return this;
    }

    @Override // p153l.vmw0
    /* JADX INFO: renamed from: i */
    public final wmw0 mo201855i() {
        IBinder iBinder;
        if (this.f200601g == 31 && (iBinder = this.f200595a) != null) {
            return new amw0(iBinder, false, this.f200596b, this.f200597c, this.f200598d, 0, null, this.f200599e, null, this.f200600f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f200595a == null) {
            sb.append(" windowToken");
        }
        if ((this.f200601g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.f200601g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f200601g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f200601g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f200601g & Tnaf.POW_2_WIDTH) == 0) {
            sb.append(" windowWidthPx");
        }
        wtq0.m207906a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
