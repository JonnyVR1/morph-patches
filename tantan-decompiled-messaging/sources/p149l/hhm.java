package p149l;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class hhm extends uq2 {

    /* JADX INFO: renamed from: a */
    public final by00 f107731a;

    /* JADX INFO: renamed from: b */
    public final ihm f107732b;

    public hhm(by00 by00Var, ihm ihmVar) {
        this.f107731a = by00Var;
        this.f107732b = ihmVar;
    }

    @Override // p149l.uq2, p149l.guc0
    /* JADX INFO: renamed from: b */
    public void mo109500b(ImageRequest imageRequest, String str, boolean z) {
        this.f107732b.m136252J(this.f107731a.now());
        this.f107732b.m136251I(imageRequest);
        this.f107732b.m136258P(str);
        this.f107732b.m136257O(z);
    }

    @Override // p149l.uq2, p149l.guc0
    /* JADX INFO: renamed from: e */
    public void mo109503e(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f107732b.m136253K(this.f107731a.now());
        this.f107732b.m136251I(imageRequest);
        this.f107732b.m136264y(obj);
        this.f107732b.m136258P(str);
        this.f107732b.m136257O(z);
    }

    @Override // p149l.uq2, p149l.guc0
    /* JADX INFO: renamed from: j */
    public void mo109508j(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.f107732b.m136252J(this.f107731a.now());
        this.f107732b.m136251I(imageRequest);
        this.f107732b.m136258P(str);
        this.f107732b.m136257O(z);
    }

    @Override // p149l.uq2, p149l.guc0
    /* JADX INFO: renamed from: k */
    public void mo109509k(String str) {
        this.f107732b.m136252J(this.f107731a.now());
        this.f107732b.m136258P(str);
    }
}
