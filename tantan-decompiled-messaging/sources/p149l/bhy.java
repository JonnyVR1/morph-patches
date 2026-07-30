package p149l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.utils.DeviceUtil;

/* JADX INFO: loaded from: classes13.dex */
public class bhy extends ifi0<hhy> {

    /* JADX INFO: renamed from: h */
    public ugy f75685h;

    /* JADX INFO: renamed from: i */
    public Runnable f75686i;

    /* JADX INFO: renamed from: l.bhy$a */
    public class RunnableC15865a implements Runnable {
        public RunnableC15865a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bhy.this.m135926o()) {
                zgy zgyVarM101954v = bhy.this.m101954v();
                if (zgyVarM101954v != null) {
                    zgyVarM101954v.m116070a(bhy.this.mo81141j());
                    bhy.this.m135927q(zgyVarM101954v);
                }
                n21.m157542c(this, bhy.this.f75685h.m193595g());
            }
        }
    }

    public bhy() {
        this.f75686i = new RunnableC15865a();
        this.f75685h = new ugy();
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: c */
    public long mo81136c() {
        return this.f75685h.m193597i();
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: d */
    public int mo81137d() {
        return this.f75685h.m193598j();
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: e */
    public long mo81138e() {
        return this.f75685h.m193599k();
    }

    @Override // p149l.ifi0
    @NonNull
    /* JADX INFO: renamed from: j */
    public String mo81141j() {
        return "memory";
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: k */
    public o3m mo81142k() {
        return new ghy(mo81141j());
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: l */
    public uei0 mo81143l() {
        return this.f75685h;
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: p */
    public int mo81145p() {
        return 30;
    }

    @Override // p149l.ifi0
    /* JADX INFO: renamed from: r */
    public void mo81146r() {
        n21.m157542c(this.f75686i, this.f75685h.m193596h());
    }

    /* JADX INFO: renamed from: v */
    public final zgy m101954v() {
        hhy hhyVarM214780a = ygy.m214780a(nt2.m160814e());
        if (m101956x(hhyVarM214780a)) {
            return new zgy(nt2.m160815f(), hhyVarM214780a.f107860b, hhyVarM214780a.f107859a, hhyVarM214780a.f107862d, hhyVarM214780a.f107861c);
        }
        return null;
    }

    @Override // p149l.xwl
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public hhy mo81139f() {
        return ygy.m214780a(nt2.m160814e());
    }

    /* JADX INFO: renamed from: x */
    public final boolean m101956x(hhy hhyVar) {
        long jM81219l = DeviceUtil.m81219l(this.f113027f);
        return jM81219l > 0 && ((long) hhyVar.f107861c) > jM81219l / 10240;
    }

    public bhy(ugy ugyVar) {
        this.f75686i = new RunnableC15865a();
        this.f75685h = ugyVar;
    }
}
