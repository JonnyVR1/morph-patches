package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class hcj {

    /* JADX INFO: renamed from: a */
    private fcj f107050a;

    /* JADX INFO: renamed from: b */
    private i3m f107051b;

    public hcj(i3m i3mVar, fcj fcjVar) {
        this.f107051b = i3mVar;
        this.f107050a = fcjVar;
        if (fcjVar != null) {
            fcjVar.m120434T1(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public mcj m130422a() {
        return this.f107051b.getInput();
    }

    /* JADX INFO: renamed from: b */
    public fcj m130423b() {
        return this.f107050a;
    }

    /* JADX INFO: renamed from: c */
    public i3m m130424c() {
        return this.f107051b;
    }

    /* JADX INFO: renamed from: d */
    public void m130425d() {
        this.f107050a = null;
        this.f107051b = null;
    }

    /* JADX INFO: renamed from: e */
    public void m130426e(@NonNull fcj fcjVar) {
        this.f107050a = fcjVar;
        if (fcjVar != null) {
            fcjVar.m120434T1(false);
        }
    }
}
