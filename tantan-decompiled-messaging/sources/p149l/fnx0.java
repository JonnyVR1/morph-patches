package p149l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class fnx0 implements Callable<List<sdy0>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f98479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f98480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f98481c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ clx0 f98482d;

    public fnx0(clx0 clx0Var, String str, String str2, String str3) {
        this.f98479a = str;
        this.f98480b = str2;
        this.f98481c = str3;
        this.f98482d = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<sdy0> call() throws Exception {
        this.f98482d.f81477a.m15310u0();
        return this.f98482d.f81477a.m15290g0().m136171x0(this.f98479a, this.f98480b, this.f98481c);
    }
}
