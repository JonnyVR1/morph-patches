package p149l;

import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class zhx extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f203239c;

    /* JADX INFO: renamed from: d */
    public final boolean f203240d;

    public zhx(nt10 nt10Var, C22306c<Pair<Boolean, Boolean>> c22306c, f6t f6tVar) {
        super(c22306c, f6tVar);
        this.f203239c = nt10Var;
        this.f203240d = nt10Var instanceof dkf0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m218880h(Boolean bool) {
        this.f203239c.mo160504a(true);
        if (this.f203240d) {
            ((dkf0) this.f203239c).mo112219c(false);
        }
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: f */
    public void mo105961f() {
        m211508c(Act.mediaCapture()).subscribe(ffw.m121193d(new e30() { // from class: l.yhx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198421a.m218880h((Boolean) obj);
            }
        }));
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: b */
    public void mo105960b() {
    }
}
