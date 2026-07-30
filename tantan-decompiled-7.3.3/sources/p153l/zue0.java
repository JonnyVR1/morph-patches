package p153l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class zue0 {

    /* JADX INFO: renamed from: b */
    private String f206116b;

    /* JADX INFO: renamed from: c */
    private String f206117c;

    /* JADX INFO: renamed from: a */
    private boolean f206115a = false;

    /* JADX INFO: renamed from: d */
    private ArrayList<rkw> f206118d = null;

    /* JADX INFO: renamed from: a */
    public boolean m221634a(rkw rkwVar) {
        if (rkwVar == null) {
            return false;
        }
        if (this.f206118d == null) {
            this.f206118d = new ArrayList<>();
        }
        if (this.f206118d.contains(rkwVar)) {
            return false;
        }
        this.f206118d.add(rkwVar);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public String m221635b() {
        return this.f206117c;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<rkw> m221636c() {
        return this.f206118d;
    }

    /* JADX INFO: renamed from: d */
    public String m221637d() {
        return this.f206116b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m221638e() {
        return this.f206115a;
    }

    /* JADX INFO: renamed from: f */
    public void m221639f(boolean z) {
        this.f206115a = z;
    }

    /* JADX INFO: renamed from: g */
    public void m221640g(String str, String str2) {
        this.f206116b = str;
        this.f206117c = str2;
    }
}
