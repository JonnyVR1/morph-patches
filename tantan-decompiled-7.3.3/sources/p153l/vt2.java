package p153l;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class vt2 implements epr {

    /* JADX INFO: renamed from: a */
    public final epr f185678a;

    /* JADX INFO: renamed from: b */
    public int f185679b = 0;

    /* JADX INFO: renamed from: c */
    public int f185680c = -1;

    /* JADX INFO: renamed from: d */
    public int f185681d = -1;

    /* JADX INFO: renamed from: e */
    public Object f185682e = null;

    public vt2(@NonNull epr eprVar) {
        this.f185678a = eprVar;
    }

    @Override // p153l.epr
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: a */
    public void mo3632a(int i, int i2, Object obj) {
        int i3;
        if (this.f185679b == 3) {
            int i4 = this.f185680c;
            int i5 = this.f185681d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f185682e == obj) {
                this.f185680c = Math.min(i, i4);
                this.f185681d = Math.max(i5 + i4, i3) - this.f185680c;
                return;
            }
        }
        m202670e();
        this.f185680c = i;
        this.f185681d = i2;
        this.f185682e = obj;
        this.f185679b = 3;
    }

    @Override // p153l.epr
    /* JADX INFO: renamed from: b */
    public void mo3633b(int i, int i2) {
        int i3;
        if (this.f185679b == 1 && i >= (i3 = this.f185680c)) {
            int i4 = this.f185681d;
            if (i <= i3 + i4) {
                this.f185681d = i4 + i2;
                this.f185680c = Math.min(i, i3);
                return;
            }
        }
        m202670e();
        this.f185680c = i;
        this.f185681d = i2;
        this.f185679b = 1;
    }

    @Override // p153l.epr
    /* JADX INFO: renamed from: c */
    public void mo3634c(int i, int i2) {
        int i3;
        if (this.f185679b == 2 && (i3 = this.f185680c) >= i && i3 <= i + i2) {
            this.f185681d += i2;
            this.f185680c = i;
        } else {
            m202670e();
            this.f185680c = i;
            this.f185681d = i2;
            this.f185679b = 2;
        }
    }

    @Override // p153l.epr
    /* JADX INFO: renamed from: d */
    public void mo3635d(int i, int i2) {
        m202670e();
        this.f185678a.mo3635d(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public void m202670e() {
        int i = this.f185679b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f185678a.mo3633b(this.f185680c, this.f185681d);
        } else if (i == 2) {
            this.f185678a.mo3634c(this.f185680c, this.f185681d);
        } else if (i == 3) {
            this.f185678a.mo3632a(this.f185680c, this.f185681d, this.f185682e);
        }
        this.f185682e = null;
        this.f185679b = 0;
    }
}
