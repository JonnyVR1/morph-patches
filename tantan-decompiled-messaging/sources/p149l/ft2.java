package p149l;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ft2 implements dnr {

    /* JADX INFO: renamed from: a */
    public final dnr f99134a;

    /* JADX INFO: renamed from: b */
    public int f99135b = 0;

    /* JADX INFO: renamed from: c */
    public int f99136c = -1;

    /* JADX INFO: renamed from: d */
    public int f99137d = -1;

    /* JADX INFO: renamed from: e */
    public Object f99138e = null;

    public ft2(@NonNull dnr dnrVar) {
        this.f99134a = dnrVar;
    }

    @Override // p149l.dnr
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: a */
    public void mo3631a(int i, int i2, Object obj) {
        int i3;
        if (this.f99135b == 3) {
            int i4 = this.f99136c;
            int i5 = this.f99137d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f99138e == obj) {
                this.f99136c = Math.min(i, i4);
                this.f99137d = Math.max(i5 + i4, i3) - this.f99136c;
                return;
            }
        }
        m123006e();
        this.f99136c = i;
        this.f99137d = i2;
        this.f99138e = obj;
        this.f99135b = 3;
    }

    @Override // p149l.dnr
    /* JADX INFO: renamed from: b */
    public void mo3632b(int i, int i2) {
        int i3;
        if (this.f99135b == 1 && i >= (i3 = this.f99136c)) {
            int i4 = this.f99137d;
            if (i <= i3 + i4) {
                this.f99137d = i4 + i2;
                this.f99136c = Math.min(i, i3);
                return;
            }
        }
        m123006e();
        this.f99136c = i;
        this.f99137d = i2;
        this.f99135b = 1;
    }

    @Override // p149l.dnr
    /* JADX INFO: renamed from: c */
    public void mo3633c(int i, int i2) {
        int i3;
        if (this.f99135b == 2 && (i3 = this.f99136c) >= i && i3 <= i + i2) {
            this.f99137d += i2;
            this.f99136c = i;
        } else {
            m123006e();
            this.f99136c = i;
            this.f99137d = i2;
            this.f99135b = 2;
        }
    }

    @Override // p149l.dnr
    /* JADX INFO: renamed from: d */
    public void mo3634d(int i, int i2) {
        m123006e();
        this.f99134a.mo3634d(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public void m123006e() {
        int i = this.f99135b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f99134a.mo3632b(this.f99136c, this.f99137d);
        } else if (i == 2) {
            this.f99134a.mo3633c(this.f99136c, this.f99137d);
        } else if (i == 3) {
            this.f99134a.mo3631a(this.f99136c, this.f99137d, this.f99138e);
        }
        this.f99138e = null;
        this.f99135b = 0;
    }
}
