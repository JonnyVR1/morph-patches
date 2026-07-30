package p149l;

import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zbs extends d1q<VText> {

    /* JADX INFO: renamed from: a */
    public final String f202487a;

    /* JADX INFO: renamed from: b */
    public boolean f202488b;

    public zbs(String str, boolean z) {
        this.f202487a = str;
        this.f202488b = z;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VText vText) {
        super.mo70566u(vText);
        vText.setText(this.f202487a);
        if (this.f202488b) {
            vText.setTextColor(-436207616);
            vText.setBackgroundDrawable(yb2.m213884i(117440512, 16));
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
            zbs zbsVar = (zbs) obj;
            if (this.f202488b == zbsVar.f202488b && v050.m196470a(this.f202487a, zbsVar.f202487a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f202487a, Boolean.valueOf(this.f202488b));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168483q3;
    }
}
