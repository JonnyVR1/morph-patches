package p153l;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class kjm extends kr2 {

    /* JADX INFO: renamed from: a */
    public final l610 f127114a;

    /* JADX INFO: renamed from: b */
    public final ljm f127115b;

    public kjm(l610 l610Var, ljm ljmVar) {
        this.f127114a = l610Var;
        this.f127115b = ljmVar;
    }

    @Override // p153l.kr2, p153l.j2d0
    /* JADX INFO: renamed from: b */
    public void mo143211b(ImageRequest imageRequest, String str, boolean z) {
        this.f127115b.m154537J(this.f127114a.now());
        this.f127115b.m154536I(imageRequest);
        this.f127115b.m154543P(str);
        this.f127115b.m154542O(z);
    }

    @Override // p153l.kr2, p153l.j2d0
    /* JADX INFO: renamed from: e */
    public void mo143212e(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f127115b.m154538K(this.f127114a.now());
        this.f127115b.m154536I(imageRequest);
        this.f127115b.m154549y(obj);
        this.f127115b.m154543P(str);
        this.f127115b.m154542O(z);
    }

    @Override // p153l.kr2, p153l.j2d0
    /* JADX INFO: renamed from: j */
    public void mo143213j(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.f127115b.m154537J(this.f127114a.now());
        this.f127115b.m154536I(imageRequest);
        this.f127115b.m154543P(str);
        this.f127115b.m154542O(z);
    }

    @Override // p153l.kr2, p153l.j2d0
    /* JADX INFO: renamed from: k */
    public void mo143214k(String str) {
        this.f127115b.m154537J(this.f127114a.now());
        this.f127115b.m154543P(str);
    }
}
