package p149l;

import android.os.IBinder;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class scw0 extends pdw0 {

    /* JADX INFO: renamed from: a */
    public IBinder f163779a;

    /* JADX INFO: renamed from: b */
    public String f163780b;

    /* JADX INFO: renamed from: c */
    public int f163781c;

    /* JADX INFO: renamed from: d */
    public float f163782d;

    /* JADX INFO: renamed from: e */
    public int f163783e;

    /* JADX INFO: renamed from: f */
    public String f163784f;

    /* JADX INFO: renamed from: g */
    public byte f163785g;

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: a */
    public final pdw0 mo168434a(String str) {
        this.f163784f = str;
        return this;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: b */
    public final pdw0 mo168435b(String str) {
        this.f163780b = str;
        return this;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: c */
    public final pdw0 mo168436c(int i) {
        this.f163785g = (byte) (this.f163785g | 8);
        return this;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: d */
    public final pdw0 mo168437d(int i) {
        this.f163781c = i;
        this.f163785g = (byte) (this.f163785g | 2);
        return this;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: e */
    public final pdw0 mo168438e(float f) {
        this.f163782d = f;
        this.f163785g = (byte) (this.f163785g | 4);
        return this;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: f */
    public final pdw0 mo168439f(boolean z) {
        this.f163785g = (byte) (this.f163785g | 1);
        return this;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: g */
    public final pdw0 mo168440g(IBinder iBinder) {
        if (iBinder != null) {
            this.f163779a = iBinder;
            return this;
        }
        jfd0.m141176a("Null windowToken");
        return null;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: h */
    public final pdw0 mo168441h(int i) {
        this.f163783e = i;
        this.f163785g = (byte) (this.f163785g | Tnaf.POW_2_WIDTH);
        return this;
    }

    @Override // p149l.pdw0
    /* JADX INFO: renamed from: i */
    public final qdw0 mo168442i() {
        IBinder iBinder;
        if (this.f163785g == 31 && (iBinder = this.f163779a) != null) {
            return new ucw0(iBinder, false, this.f163780b, this.f163781c, this.f163782d, 0, null, this.f163783e, null, this.f163784f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f163779a == null) {
            sb.append(" windowToken");
        }
        if ((this.f163785g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.f163785g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f163785g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f163785g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f163785g & Tnaf.POW_2_WIDTH) == 0) {
            sb.append(" windowWidthPx");
        }
        qkq0.m175383a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
