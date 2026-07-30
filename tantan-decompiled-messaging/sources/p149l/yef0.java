package p149l;

import android.util.Pair;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class yef0 extends xxl {

    /* JADX INFO: renamed from: c */
    public final dkf0 f197684c;

    public yef0(dkf0 dkf0Var, C22306c<Pair<Boolean, Boolean>> c22306c, f6t f6tVar) {
        super(c22306c, f6tVar);
        this.f197684c = dkf0Var;
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: f */
    public void mo105961f() {
        m211508c(ypv.f199493a.m199375u0()).takeFirst(new w9j() { // from class: l.wef0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.xef0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192597a.m214348i((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m214348i(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f197684c.mo112220d(true, false, null, null);
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: b */
    public void mo105960b() {
    }
}
