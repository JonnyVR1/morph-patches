package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes11.dex */
public class diq extends bq2 {

    /* JADX INFO: renamed from: c */
    public bc70 f86415c;

    /* JADX INFO: renamed from: d */
    public String f86416d;

    public diq(bc70 bc70Var, String str) {
        this.f86415c = bc70Var;
        this.f86416d = str;
    }

    @Override // p149l.bq2
    /* JADX INFO: renamed from: e */
    public void mo102088e(Bitmap bitmap) {
        k760 k760VarM144664a;
        super.mo102088e(bitmap);
        if (this.f86415c == null || (k760VarM144664a = k760.m144649b(bitmap).m144664a()) == null) {
            return;
        }
        this.f86415c.mo101047a(this.f86416d, k760VarM144664a.m144656h(-2302756));
    }
}
