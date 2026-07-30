package p153l;

import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aes extends d3q<VText> {

    /* JADX INFO: renamed from: a */
    public final String f70822a;

    /* JADX INFO: renamed from: b */
    public boolean f70823b;

    public aes(String str, boolean z) {
        this.f70822a = str;
        this.f70823b = z;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VText vText) {
        super.mo71749u(vText);
        vText.setText(this.f70822a);
        if (this.f70823b) {
            vText.setTextColor(-436207616);
            vText.setBackgroundDrawable(fc2.m124979i(117440512, 16));
        } else {
            vText.setTextColor(1291845632);
            vText.setBackgroundDrawable(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aes aesVar = (aes) obj;
            if (this.f70823b == aesVar.f70823b && k950.m148863a(this.f70822a, aesVar.f70822a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f70822a, Boolean.valueOf(this.f70823b));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199215q3;
    }
}
