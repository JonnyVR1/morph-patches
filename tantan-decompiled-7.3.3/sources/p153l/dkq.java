package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public class dkq extends sq2 {

    /* JADX INFO: renamed from: c */
    public hk70 f89426c;

    /* JADX INFO: renamed from: d */
    public String f89427d;

    public dkq(hk70 hk70Var, String str) {
        this.f89426c = hk70Var;
        this.f89427d = str;
    }

    @Override // p153l.sq2
    /* JADX INFO: renamed from: e */
    public void mo104841e(Bitmap bitmap) {
        qf60 qf60VarM176339a;
        super.mo104841e(bitmap);
        if (this.f89426c == null || (qf60VarM176339a = qf60.m176324b(bitmap).m176339a()) == null) {
            return;
        }
        this.f89426c.mo119505a(this.f89427d, qf60VarM176339a.m176331h(-2302756));
    }
}
