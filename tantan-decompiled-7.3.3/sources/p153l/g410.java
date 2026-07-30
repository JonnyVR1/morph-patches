package p153l;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class g410 implements MomoPipeline {

    /* JADX INFO: renamed from: b */
    protected o410 f102056b;

    /* JADX INFO: renamed from: d */
    protected dpl f102058d;

    /* JADX INFO: renamed from: f */
    private bfj f102060f;

    /* JADX INFO: renamed from: g */
    protected rsy f102061g;

    /* JADX INFO: renamed from: h */
    protected uow f102062h;

    /* JADX INFO: renamed from: k */
    private qmq0 f102065k;

    /* JADX INFO: renamed from: l */
    private qmq0 f102066l;

    /* JADX INFO: renamed from: u */
    private drl f102075u;

    /* JADX INFO: renamed from: v */
    private o410.InterfaceC19024d f102076v;

    /* JADX INFO: renamed from: w */
    private j410.InterfaceC17870b f102077w;

    /* JADX INFO: renamed from: x */
    private o410.InterfaceC19026f f102078x;

    /* JADX INFO: renamed from: y */
    protected fpf0 f102079y;

    /* JADX INFO: renamed from: a */
    private final String f102055a = "CodecFilterManager";

    /* JADX INFO: renamed from: c */
    protected final Object f102057c = new Object();

    /* JADX INFO: renamed from: e */
    private PipelineConcurrentHashMap<gfj, bfj> f102059e = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    protected PipelineConcurrentHashMap<MomoCodec, wzl> f102064j = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    private boolean f102067m = false;

    /* JADX INFO: renamed from: n */
    private boolean f102068n = false;

    /* JADX INFO: renamed from: o */
    private boolean f102069o = false;

    /* JADX INFO: renamed from: p */
    private boolean f102070p = false;

    /* JADX INFO: renamed from: q */
    private boolean f102071q = false;

    /* JADX INFO: renamed from: r */
    private int f102072r = 0;

    /* JADX INFO: renamed from: s */
    private int f102073s = 0;

    /* JADX INFO: renamed from: t */
    private int f102074t = 0;

    /* JADX INFO: renamed from: z */
    private int f102080z = 5000;

    /* JADX INFO: renamed from: A */
    private int f102054A = 5;

    /* JADX INFO: renamed from: i */
    protected List<MomoCodec> f102063i = new ArrayList();

    /* JADX INFO: renamed from: l.g410$a */
    public class RunnableC17129a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoCodec f102081a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ uow f102082b;

        public RunnableC17129a(MomoCodec momoCodec, uow uowVar) {
            this.f102081a = momoCodec;
            this.f102082b = uowVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g410.this.mo20703j0().m128975B(this.f102081a);
            this.f102081a.mo20656Y(g410.this.mo20703j0(), this.f102082b);
        }
    }

    /* JADX INFO: renamed from: l.g410$b */
    public class RunnableC17130b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoCodec f102084a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ gfj f102085b;

        public RunnableC17130b(MomoCodec momoCodec, gfj gfjVar) {
            this.f102084a = momoCodec;
            this.f102085b = gfjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            rsy rsyVar = g410.this.f102061g;
            if (rsyVar != null) {
                rsyVar.removeTarget(this.f102084a.getFilter());
            } else {
                gfj gfjVar = this.f102085b;
                if (gfjVar != null) {
                    gfjVar.removeTarget(this.f102084a.getFilter());
                }
            }
            if (this.f102084a.getFilter() != null) {
                this.f102084a.getFilter().releaseFrameBuffer();
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$c */
    public class RunnableC17131c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoCodec f102087a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ uow f102088b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ gfj f102089c;

        public RunnableC17131c(MomoCodec momoCodec, uow uowVar, gfj gfjVar) {
            this.f102087a = momoCodec;
            this.f102088b = uowVar;
            this.f102089c = gfjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g410.this.f102061g == null) {
                this.f102089c.removeTarget(this.f102087a.getFilter());
                this.f102089c.addTarget(this.f102087a.getFilter());
                return;
            }
            b7y.m102882c().m102888g("MomoPiplineImpl", "mProcessingPipeline.runOnDraw codecFilter.isCameraCodec" + this.f102087a.mo20668r1() + ",mpCodec:" + this.f102088b.f180162G0);
            if (this.f102087a.mo20668r1() || this.f102088b.f180162G0) {
                g410.this.f102061g.removeTarget(this.f102087a.getFilter());
                g410.this.f102061g.m183039Q1(this.f102087a.getFilter());
            } else {
                g410.this.f102061g.removeTarget(this.f102087a.getFilter());
                g410.this.f102061g.addTarget(this.f102087a.getFilter());
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$d */
    public class RunnableC17132d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ dfj f102091a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ z5m f102092b;

        public RunnableC17132d(dfj dfjVar, z5m z5mVar) {
            this.f102091a = dfjVar;
            this.f102092b = z5mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            rsy rsyVar = g410.this.f102061g;
            if (rsyVar != null) {
                rsyVar.addTarget(this.f102091a);
            } else {
                this.f102092b.getInput().removeTarget(this.f102091a);
                this.f102092b.getInput().addTarget(this.f102091a);
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$e */
    public class RunnableC17133e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ dfj f102094a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ z5m f102095b;

        public RunnableC17133e(dfj dfjVar, z5m z5mVar) {
            this.f102094a = dfjVar;
            this.f102095b = z5mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            rsy rsyVar = g410.this.f102061g;
            if (rsyVar != null) {
                rsyVar.removeTarget(this.f102094a);
                return;
            }
            z5m z5mVar = this.f102095b;
            if (z5mVar != null) {
                z5mVar.getInput().removeTarget(this.f102094a);
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$f */
    public class C17134f implements qmq0.InterfaceC19603a {
        public C17134f() {
        }

        @Override // p153l.qmq0.InterfaceC19603a
        /* JADX INFO: renamed from: a */
        public void mo128845a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = g410.this.f102063i.iterator();
            while (it.hasNext()) {
                it.next().mo20664m1(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$g */
    public class C17135g implements qmq0.InterfaceC19603a {
        public C17135g() {
        }

        @Override // p153l.qmq0.InterfaceC19603a
        /* JADX INFO: renamed from: a */
        public void mo128845a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = g410.this.f102063i.iterator();
            while (it.hasNext()) {
                it.next().mo20669v0(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$h */
    public class C17136h implements qmq0.InterfaceC19603a {
        public C17136h() {
        }

        @Override // p153l.qmq0.InterfaceC19603a
        /* JADX INFO: renamed from: a */
        public void mo128845a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = g410.this.f102063i.iterator();
            while (it.hasNext()) {
                it.next().mo20664m1(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$i */
    public class C17137i implements qmq0.InterfaceC19603a {
        public C17137i() {
        }

        @Override // p153l.qmq0.InterfaceC19603a
        /* JADX INFO: renamed from: a */
        public void mo128845a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = g410.this.f102063i.iterator();
            while (it.hasNext()) {
                it.next().mo20669v0(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$j */
    public class C17138j implements o410.InterfaceC19026f {
        public C17138j() {
        }

        @Override // p153l.o410.InterfaceC19026f
        /* JADX INFO: renamed from: P0 */
        public void mo20958P0(g510 g510Var, int i, int i2, int i3, int i4) {
            if (g410.this.f102072r == 10) {
                g410.this.f102072r = 0;
            }
            g410.m128832k(g410.this);
            if (g410.this.f102078x != null) {
                g410.this.f102078x.mo20958P0(g510Var, i, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$l */
    public class C17140l implements o410.InterfaceC19025e {
        public C17140l() {
        }

        @Override // p153l.o410.InterfaceC19025e
        /* JADX INFO: renamed from: a */
        public void mo128847a() {
            if (g410.this.f102060f != null && !g410.this.f102070p) {
                if (g410.this.f102060f.m103902b() != null) {
                    g410.this.f102060f.m103902b().releaseFrameBuffer();
                }
                if (g410.this.f102060f.m103901a() != null) {
                    g410.this.f102060f.m103901a().releaseFrameBuffer();
                }
            }
            rsy rsyVar = g410.this.f102061g;
            if (rsyVar != null) {
                rsyVar.releaseFrameBuffer();
                g410.this.f102061g.reInitialize();
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$m */
    public class C17141m implements o410.InterfaceC19024d {
        public C17141m() {
        }

        @Override // p153l.o410.InterfaceC19024d
        /* JADX INFO: renamed from: a */
        public void mo128848a() {
            if (g410.this.f102069o) {
                synchronized (g410.this.f102063i) {
                    try {
                        for (MomoCodec momoCodec : g410.this.f102063i) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (g410.this.f102076v != null) {
                    g410.this.f102076v.mo128848a();
                }
                if (g410.this.f102071q) {
                    synchronized (g410.this.f102063i) {
                        try {
                            for (MomoCodec momoCodec2 : g410.this.f102063i) {
                                g410 g410Var = g410.this;
                                momoCodec2.mo20656Y(g410Var.f102056b.m165928I(g410Var.f102060f.m103901a()), g410.this.f102062h);
                            }
                            g410.this.f102056b.m165932N();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    g410.this.f102071q = false;
                }
                g410.this.f102069o = false;
            }
        }

        @Override // p153l.o410.InterfaceC19024d
        /* JADX INFO: renamed from: b */
        public void mo128849b() {
            if (g410.this.f102076v != null) {
                g410.this.f102076v.mo128849b();
            }
        }

        @Override // p153l.o410.InterfaceC19024d
        /* JADX INFO: renamed from: c */
        public void mo128850c() {
            if (g410.this.f102059e != null) {
                for (V v2 : g410.this.f102059e.values()) {
                    if (v2.m103902b() != null) {
                        rsy rsyVar = g410.this.f102061g;
                        if (rsyVar != null) {
                            rsyVar.removeTarget(v2.m103902b());
                        }
                        v2.m103902b().destroy();
                    }
                }
                g410.this.f102059e.clear();
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "onEglDestory");
            if (g410.this.f102076v != null) {
                g410.this.f102076v.mo128850c();
            }
        }

        @Override // p153l.o410.InterfaceC19024d
        /* JADX INFO: renamed from: d */
        public void mo128851d(int i, int i2) {
            g410 g410Var = g410.this;
            if (g410Var.f102061g == null || g410Var.f102076v == null) {
                return;
            }
            g410.this.f102076v.mo128851d(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.g410$n */
    public class RunnableC17142n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ bql f102105a;

        public RunnableC17142n(bql bqlVar) {
            this.f102105a = bqlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            bql bqlVar = this.f102105a;
            if (bqlVar != null) {
                bqlVar.mo105947M();
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$o */
    public class RunnableC17143o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ jt2 f102107a;

        public RunnableC17143o(jt2 jt2Var) {
            this.f102107a = jt2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (V v2 : g410.this.f102059e.values()) {
                if (v2.m103903c() instanceof bql) {
                    ((bql) v2.m103903c()).mo105949j(this.f102107a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$p */
    public class RunnableC17144p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ zej f102109a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ bfj f102110b;

        public RunnableC17144p(zej zejVar, bfj bfjVar) {
            this.f102109a = zejVar;
            this.f102110b = bfjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g410.this.f102057c) {
                try {
                    rsy rsyVar = g410.this.f102061g;
                    if (rsyVar != null) {
                        rsyVar.addTarget(this.f102109a);
                        this.f102110b.m103901a().removeTarget(g410.this.f102061g);
                        this.f102110b.m103901a().addTarget(g410.this.f102061g);
                        b7y.m102882c().m102888g("prepareRoot addTarget mScreenEndpoint modle:" + this.f102110b.m103901a());
                    } else {
                        this.f102110b.m103901a().addTarget(this.f102109a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$q */
    public class RunnableC17145q implements Runnable {
        public RunnableC17145q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g410.this.f102057c) {
                try {
                    for (MomoCodec momoCodec : g410.this.f102063i) {
                        b7y.m102882c().m102888g("startRender isCameraCodec()" + momoCodec.mo20668r1() + ",isCameraCodec" + g410.this.f102062h.f180162G0 + "codec:" + momoCodec);
                        g410 g410Var = g410.this;
                        if (g410Var.f102061g == null) {
                            g410Var.f102060f.m103901a().removeTarget(momoCodec.getFilter());
                            g410.this.f102060f.m103901a().addTarget(momoCodec.getFilter());
                        } else if (momoCodec.mo20668r1()) {
                            g410.this.f102061g.removeTarget(momoCodec.getFilter());
                            g410.this.f102061g.m183039Q1(momoCodec.getFilter());
                        } else {
                            g410 g410Var2 = g410.this;
                            if (g410Var2.f102062h.f180162G0) {
                                g410.this.f102061g.removeTarget(momoCodec.getFilter());
                                g410.this.f102061g.m183039Q1(momoCodec.getFilter());
                            } else {
                                g410Var2.f102061g.removeTarget(momoCodec.getFilter());
                                g410.this.f102061g.addTarget(momoCodec.getFilter());
                            }
                        }
                        g410 g410Var3 = g410.this;
                        g410Var3.f102056b.m165928I(g410Var3.f102060f.m103901a()).m128989h(momoCodec);
                        g410 g410Var4 = g410.this;
                        g410Var4.f102056b.m165928I(g410Var4.f102060f.m103901a()).m128984L();
                        g410 g410Var5 = g410.this;
                        g410Var5.f102056b.m165928I(g410Var5.f102060f.m103901a()).m128981I(g410.this.f102062h.f180160E0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.g410$r */
    public class RunnableC17146r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ bfj f102113a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ z5m f102114b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ bfj f102115c;

        public RunnableC17146r(bfj bfjVar, z5m z5mVar, bfj bfjVar2) {
            this.f102113a = bfjVar;
            this.f102114b = z5mVar;
            this.f102115c = bfjVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (g410.this.f102057c) {
                try {
                    for (MomoCodec momoCodec : g410.this.f102063i) {
                        rsy rsyVar = g410.this.f102061g;
                        if (rsyVar == null) {
                            this.f102113a.m103901a().removeTarget(momoCodec.getFilter());
                        } else {
                            rsyVar.removeTarget(momoCodec.getFilter());
                            g410.this.f102061g.m183039Q1(momoCodec.getFilter());
                            this.f102113a.m103901a().removeTarget(g410.this.f102061g);
                        }
                        o410 o410Var = g410.this.f102056b;
                        o410Var.m165933O(o410Var.m165929J());
                        momoCodec.getFilter().reInitialize();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f102113a.m103902b() != null) {
                rsy rsyVar2 = g410.this.f102061g;
                bfj bfjVar = this.f102113a;
                if (rsyVar2 != null) {
                    rsyVar2.removeTarget(bfjVar.m103902b());
                    this.f102113a.m103901a().removeTarget(g410.this.f102061g);
                } else {
                    bfjVar.m103901a().removeTarget(this.f102113a.m103902b());
                }
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "addFilterToDestroy >>>" + this.f102113a.m103902b().toString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                g410.this.f102056b.m165921A(this.f102113a.m103902b(), this.f102113a.m103901a().toString());
                this.f102113a.m103905e(null);
            }
            if (this.f102113a.m103901a() != this.f102114b.getInput()) {
                g410.this.f102059e.remove(this.f102113a.m103901a());
            }
            bfj bfjVar2 = this.f102115c;
            if (bfjVar2 != null) {
                zej zejVarM103902b = bfjVar2.m103902b();
                if (zejVarM103902b == null) {
                    zejVarM103902b = new zej();
                    this.f102115c.m103905e(zejVarM103902b);
                }
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setScreenEnd Size" + g410.this.f102062h.f175510u + ":" + g410.this.f102062h.f175511v);
                if (zejVarM103902b instanceof hej) {
                    uow uowVar = g410.this.f102062h;
                    zejVarM103902b.setRenderSize(uowVar.f175494m, uowVar.f175496n);
                } else {
                    u6y u6yVarM194722F = u6y.m194722F();
                    uow uowVar2 = g410.this.f102062h;
                    u6yVarM194722F.m194775n0(uowVar2.f175510u, uowVar2.f175511v);
                    uow uowVar3 = g410.this.f102062h;
                    zejVarM103902b.setRenderSize(uowVar3.f175510u, uowVar3.f175511v);
                }
                rsy rsyVar3 = g410.this.f102061g;
                if (rsyVar3 == null) {
                    this.f102115c.m103901a().removeTarget(zejVarM103902b);
                    this.f102115c.m103901a().addTarget(zejVarM103902b);
                } else {
                    rsyVar3.removeTarget(zejVarM103902b);
                    g410.this.f102061g.addTarget(zejVarM103902b);
                    this.f102115c.m103901a().removeTarget(g410.this.f102061g);
                    this.f102115c.m103901a().addTarget(g410.this.f102061g);
                }
            }
        }
    }

    public g410(uow uowVar) {
        this.f102062h = uowVar;
        o410 o410Var = new o410();
        this.f102056b = o410Var;
        o410Var.m165946b0(new C17138j());
        this.f102056b.m165947c0(new C17139k());
        this.f102056b.m165944Z(new C17140l());
        this.f102056b.m165943Y(new C17141m());
    }

    /* JADX INFO: renamed from: B */
    private void m128827B(g510 g510Var) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "attachCodec" + this.f102063i.size());
        synchronized (this.f102057c) {
            try {
                List<MomoCodec> list = this.f102063i;
                if (list != null) {
                    Iterator<MomoCodec> it = list.iterator();
                    while (it.hasNext()) {
                        this.f102056b.m165960z(g510Var, it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private void m128828M(z5m z5mVar) {
        z5mVar.mo99495K(this.f102056b.m165928I(z5mVar.getInput()));
        bfj bfjVar = this.f102059e.get(z5mVar.getInput());
        if (bfjVar == null || bfjVar.m103902b() != null) {
            return;
        }
        this.f102056b.m165922B(bfjVar.m103901a());
        zej zejVar = new zej();
        uow uowVar = this.f102062h;
        zejVar.setRenderSize(uowVar.f175510u, uowVar.f175511v);
        bfjVar.m103905e(zejVar);
        this.f102056b.m165940V(new RunnableC17144p(zejVar, bfjVar), mo20703j0().m128994m());
        this.f102060f = bfjVar;
    }

    /* JADX INFO: renamed from: O */
    private void m128829O(gfj gfjVar, MomoCodec momoCodec) {
        synchronized (this.f102057c) {
            this.f102063i.remove(momoCodec);
        }
        this.f102056b.m165934P(momoCodec);
        if (mo20703j0() == null) {
            rsy rsyVar = this.f102061g;
            if (rsyVar != null) {
                rsyVar.removeTarget(momoCodec.getFilter());
            } else if (gfjVar != null) {
                gfjVar.removeTarget(momoCodec.getFilter());
            }
        } else {
            this.f102056b.m165940V(new RunnableC17130b(momoCodec, gfjVar), mo20703j0().m128994m());
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "unregisterLog>>>>>:" + momoCodec);
        wzl wzlVar = this.f102064j.get(momoCodec);
        if (wzlVar != null) {
            wzlVar.stop();
            mo20704k0(wzlVar);
            mo20722y0(wzlVar);
            mo20710o0(wzlVar);
        }
        this.f102064j.remove(momoCodec);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m128832k(g410 g410Var) {
        int i = g410Var.f102072r;
        g410Var.f102072r = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: z */
    private void m128842z(gfj gfjVar, MomoCodec momoCodec, uow uowVar) {
        if (momoCodec instanceof MediaBaseCodecFilter) {
            momoCodec.getFilter().mo20745n2(uowVar);
            momoCodec.getFilter().setRenderSize(uowVar.f175494m, uowVar.f175496n);
            MediaBaseCodecFilter filter = momoCodec.getFilter();
            float f = uowVar.f180186u0;
            if (f <= 0.0f) {
                f = 1.0f;
            }
            filter.m219497U1(f);
        }
        synchronized (this.f102057c) {
            this.f102063i.add(momoCodec);
            b7y.m102882c().m102888g("MomoPiplineImpl", "addMediaCodecFilter codeListSize:" + this.f102063i.size() + ",codec:" + momoCodec);
        }
        if (momoCodec instanceof wyl) {
            wzl wzlVarMo119337E = mo119337E(momoCodec.toString());
            wzlVarMo119337E.mo138379G1((wyl) momoCodec);
            wzlVarMo119337E.mo143397t(this.f102073s);
            wzlVarMo119337E.mo143396n(this.f102074t);
            wzlVarMo119337E.mo143394f1(this.f102077w);
            momoCodec.mo20662i(this.f102080z, this.f102054A, this.f102079y);
            boolean z = false;
            for (bfj bfjVar : this.f102059e.values()) {
                if (bfjVar.m103903c() instanceof eql) {
                    wzlVarMo119337E.mo143391A1((eql) bfjVar.m103903c());
                    z = true;
                }
            }
            if (!z) {
                wzlVarMo119337E.mo143391A1(null);
            }
            this.f102064j.put(momoCodec, wzlVarMo119337E);
        }
        if (mo20703j0() != null) {
            this.f102056b.m165940V(new RunnableC17131c(momoCodec, uowVar, gfjVar), mo20703j0().m128994m());
            return;
        }
        if (this.f102061g == null) {
            gfjVar.removeTarget(momoCodec.getFilter());
            gfjVar.addTarget(momoCodec.getFilter());
        } else if (momoCodec.mo20668r1() || uowVar.f180162G0) {
            this.f102061g.removeTarget(momoCodec.getFilter());
            this.f102061g.m183039Q1(momoCodec.getFilter());
        } else {
            this.f102061g.removeTarget(momoCodec.getFilter());
            this.f102061g.addTarget(momoCodec.getFilter());
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: A */
    public synchronized void mo20672A(Object obj) {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            this.f102069o = true;
            o410Var.m165937S(obj);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: A0 */
    public q210.InterfaceC19500a mo20673A0() {
        return this.f102056b;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: B0 */
    public void mo20674B0(q210.InterfaceC19503d interfaceC19503d) {
        this.f102056b.m165927H().m174970c(interfaceC19503d);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: C */
    public synchronized void mo20675C(Object obj) {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            this.f102069o = true;
            o410Var.m165935Q(obj);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: D */
    public void mo20677D(j410.InterfaceC17870b interfaceC17870b) {
        this.f102077w = interfaceC17870b;
        for (wzl wzlVar : this.f102064j.values()) {
            if (wzlVar != null) {
                wzlVar.mo143394f1(interfaceC17870b);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: D0 */
    public void mo20678D0(fb1 fb1Var) {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            o410Var.m165942X(fb1Var);
        }
    }

    /* JADX INFO: renamed from: E */
    public wzl mo119337E(String str) {
        throw null;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: F */
    public boolean mo20679F() {
        return this.f102067m;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: G */
    public synchronized void mo20680G() {
        try {
            this.f102056b.m165926G();
            Iterator<bfj> it = this.f102059e.values().iterator();
            while (it.hasNext()) {
                it.next().m103904d();
            }
            this.f102060f = null;
            this.f102059e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: H */
    public void mo20681H(suf sufVar) {
        synchronized (this.f102057c) {
            this.f102056b.m165945a0(sufVar);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: I */
    public void mo20682I(wej wejVar, String str) {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            o410Var.m165921A(wejVar, str);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: J */
    public synchronized void mo20683J(Object obj) {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            this.f102069o = true;
            o410Var.m165936R(obj);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: K */
    public synchronized void mo20684K() {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            o410Var.m165931M();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m128843N(MomoCodec momoCodec) {
        bfj bfjVar = this.f102060f;
        if (bfjVar != null) {
            m128829O(bfjVar.m103901a(), momoCodec);
        } else {
            m128829O(null, momoCodec);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m128844P() {
        synchronized (this.f102057c) {
            this.f102063i.clear();
        }
        if (this.f102067m) {
            this.f102067m = false;
            for (wzl wzlVar : this.f102064j.values()) {
                if (wzlVar != null) {
                    wzlVar.stop();
                    mo20704k0(wzlVar);
                    mo20722y0(wzlVar);
                    mo20710o0(wzlVar);
                }
            }
            this.f102064j.clear();
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "stopRecordNotLeaveRoom>>>>>>>");
            this.f102056b.m165955m0(null);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: U */
    public void mo20685U(drl drlVar) {
        this.f102075u = drlVar;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: V */
    public void mo20686V(@NonNull z5m z5mVar) {
        boolean z;
        MomoPipeline.DecodeType decodeType = MomoPipeline.DecodeType.HARD_DECODE;
        synchronized (this.f102057c) {
            try {
                z = false;
                for (MomoCodec momoCodec : this.f102063i) {
                    MomoPipeline.DecodeType decodeType2 = momoCodec.getFilter().m20728Z1().f180156A0;
                    MomoPipeline.DecodeType decodeType3 = MomoPipeline.DecodeType.SOFT_DECODE;
                    if (decodeType2 == decodeType3) {
                        decodeType = decodeType3;
                    }
                    if (momoCodec.mo20658c1() == 2 && momoCodec.getFilter().m20728Z1().f175502q) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (this.f102066l == null) {
                qmq0 qmq0Var = new qmq0();
                this.f102066l = qmq0Var;
                uow uowVar = this.f102062h;
                qmq0Var.setRenderSize(uowVar.f175498o, uowVar.f175500p);
                this.f102066l.f158394a = new C17134f();
            }
            rsy rsyVar = this.f102061g;
            if (rsyVar != null) {
                rsyVar.removeTarget(this.f102066l);
                this.f102061g.addTarget(this.f102066l);
            } else {
                z5mVar.getInput().removeTarget(this.f102066l);
                z5mVar.getInput().addTarget(this.f102066l);
            }
        }
        if (decodeType == MomoPipeline.DecodeType.SOFT_DECODE) {
            if (this.f102065k == null) {
                qmq0 qmq0Var2 = new qmq0();
                this.f102065k = qmq0Var2;
                uow uowVar2 = this.f102062h;
                qmq0Var2.setRenderSize(uowVar2.f175494m, uowVar2.f175496n);
                this.f102065k.f158394a = new C17135g();
            }
            rsy rsyVar2 = this.f102061g;
            if (rsyVar2 != null) {
                rsyVar2.removeTarget(this.f102065k);
                this.f102061g.addTarget(this.f102065k);
            } else {
                z5mVar.getInput().removeTarget(this.f102065k);
                z5mVar.getInput().addTarget(this.f102065k);
            }
        }
        if (!this.f102067m) {
            this.f102067m = true;
            dpl dplVar = this.f102058d;
            if (dplVar != null) {
                dplVar.mo20934I1();
            }
            if (z5mVar instanceof vze) {
                m128827B(null);
            } else {
                m128827B(mo20690Z(z5mVar));
            }
            bfj bfjVar = this.f102060f;
            if (bfjVar != null && bfjVar.m103901a() != null) {
                this.f102056b.m165928I(this.f102060f.m103901a()).m128981I(this.f102062h.f180160E0);
            }
            b7y.m102882c().m102888g(getClass() + " startRecord mProcessingPipeline");
            this.f102056b.m165948d0(this.f102062h);
        }
        for (wzl wzlVar : this.f102064j.values()) {
            if (wzlVar != null) {
                for (bfj bfjVar2 : this.f102059e.values()) {
                    if (bfjVar2.m103903c() instanceof eql) {
                        wzlVar.mo143391A1((eql) bfjVar2.m103903c());
                    }
                }
                for (MomoCodec momoCodec2 : this.f102063i) {
                    if (momoCodec2 instanceof o410.InterfaceC19026f) {
                        this.f102056b.m165946b0((o410.InterfaceC19026f) momoCodec2);
                    }
                }
                wzlVar.mo143392U(this.f102075u);
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", ">>>>>:" + wzlVar + " >>>>> start");
                wzlVar.start();
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: W */
    public void mo20687W(o410.InterfaceC19026f interfaceC19026f) {
        this.f102078x = interfaceC19026f;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: X */
    public void mo20688X(z5m z5mVar, dfj dfjVar) {
        if (mo20703j0() != null) {
            this.f102056b.m165940V(new RunnableC17133e(dfjVar, z5mVar), mo20703j0().m128994m());
            return;
        }
        rsy rsyVar = this.f102061g;
        if (rsyVar != null) {
            rsyVar.removeTarget(dfjVar);
        } else if (z5mVar != null) {
            z5mVar.getInput().removeTarget(dfjVar);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: Y */
    public void mo20689Y(z5m z5mVar, MomoCodec momoCodec, uow uowVar) {
        mo20706m0(z5mVar, momoCodec, uowVar);
        this.f102056b.m165923D(mo20690Z(z5mVar), momoCodec, uowVar);
        for (wzl wzlVar : this.f102064j.values()) {
            if (wzlVar != null) {
                if ((momoCodec instanceof wyl) && (momoCodec instanceof o410.InterfaceC19026f)) {
                    this.f102056b.m165946b0((o410.InterfaceC19026f) momoCodec);
                }
                for (bfj bfjVar : this.f102059e.values()) {
                    if (bfjVar.m103903c() instanceof eql) {
                        wzlVar.mo143391A1((eql) bfjVar.m103903c());
                    }
                }
                for (MomoCodec momoCodec2 : this.f102063i) {
                    if (momoCodec2 instanceof o410.InterfaceC19026f) {
                        this.f102056b.m165946b0((o410.InterfaceC19026f) momoCodec2);
                    }
                }
                wzlVar.mo143392U(this.f102075u);
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", ">>>>>:" + wzlVar + " >>>>>watcher start");
                wzlVar.start();
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: Z */
    public g510 mo20690Z(z5m z5mVar) {
        return this.f102056b.m165928I(z5mVar.getInput());
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: a0 */
    public void mo20691a0() {
        this.f102056b.m165927H().m174973f();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: b0 */
    public void mo20692b0(MomoCodec momoCodec, uow uowVar) {
        if (mo20703j0() == null) {
            momoCodec.mo20656Y(mo20703j0(), uowVar);
        } else {
            this.f102056b.m165941W(new RunnableC17129a(momoCodec, uowVar), mo20703j0().m128994m());
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: c0 */
    public void mo20693c0() {
        this.f102056b.m165927H().m174972e();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: d0 */
    public void mo20694d0(MomoCodec momoCodec) {
        boolean z;
        synchronized (this.f102057c) {
            try {
                Iterator<MomoCodec> it = this.f102063i.iterator();
                z = false;
                while (it.hasNext()) {
                    if (it.next() == momoCodec) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b7y.m102882c().m102888g("MomoPiplineImpl", "stopRecord isIn:" + z);
        if (z) {
            m128843N(momoCodec);
            if (mo20703j0() != null) {
                mo20703j0().m128976C(momoCodec);
            }
            this.f102056b.m165954l0(momoCodec);
        }
        if (z) {
            return;
        }
        mo20696f();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: e0 */
    public void mo20695e0(MomoCodec momoCodec) {
        boolean z;
        synchronized (this.f102057c) {
            try {
                Iterator<MomoCodec> it = this.f102063i.iterator();
                z = false;
                while (it.hasNext()) {
                    if (it.next() == momoCodec) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m128843N(momoCodec);
            if (mo20703j0() != null) {
                mo20703j0().m128976C(momoCodec);
            }
            this.f102056b.m165955m0(momoCodec);
        }
        if (z) {
            return;
        }
        m128844P();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: f */
    public void mo20696f() {
        synchronized (this.f102057c) {
            this.f102063i.clear();
        }
        if (this.f102067m) {
            this.f102067m = false;
            for (wzl wzlVar : this.f102064j.values()) {
                if (wzlVar != null) {
                    wzlVar.stop();
                    mo20704k0(wzlVar);
                    mo20722y0(wzlVar);
                    mo20710o0(wzlVar);
                }
            }
            this.f102064j.clear();
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "stopRecord>>>>>>>");
            this.f102056b.m165953k0();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: f0 */
    public void mo20697f0(z5m z5mVar) {
        this.f102059e.put(z5mVar.getInput(), new bfj(z5mVar, null));
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: g0 */
    public void mo20698g0(q210.InterfaceC19501b interfaceC19501b) {
        this.f102056b.m165927H().m174968a(interfaceC19501b);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: h0 */
    public void mo20699h0(q210.InterfaceC19502c interfaceC19502c) {
        this.f102056b.m165927H().m174969b(interfaceC19502c);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: i */
    public void mo20700i(int i, int i2, fpf0 fpf0Var) {
        esx.m122399d("setSimpleMediaLogsUpload", "interFace : " + fpf0Var);
        this.f102080z = i;
        this.f102054A = i2;
        this.f102079y = fpf0Var;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: i0 */
    public void mo20701i0(uow uowVar) {
        rsy rsyVar = this.f102061g;
        if (rsyVar != null) {
            rsyVar.setRenderSize(uowVar.f175510u, uowVar.f175511v);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: j */
    public void mo20702j(jt2 jt2Var) {
        if (mo20703j0() != null) {
            this.f102056b.m165940V(new RunnableC17143o(jt2Var), mo20703j0().m128994m());
            return;
        }
        for (bfj bfjVar : this.f102059e.values()) {
            if (bfjVar.m103903c() instanceof bql) {
                ((bql) bfjVar.m103903c()).mo105949j(jt2Var);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: j0 */
    public g510 mo20703j0() {
        return this.f102056b.m165929J();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: k0 */
    public void mo20704k0(q210.InterfaceC19503d interfaceC19503d) {
        this.f102056b.m165927H().m174976i(interfaceC19503d);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: l0 */
    public void mo20705l0(j410.InterfaceC17870b interfaceC17870b, MomoCodec momoCodec) {
        this.f102077w = interfaceC17870b;
        PipelineConcurrentHashMap<MomoCodec, wzl> pipelineConcurrentHashMap = this.f102064j;
        if (pipelineConcurrentHashMap == null || momoCodec == null || !pipelineConcurrentHashMap.containsKey(momoCodec)) {
            return;
        }
        this.f102064j.get(momoCodec).mo143394f1(interfaceC17870b);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    @TargetApi(18)
    /* JADX INFO: renamed from: m0 */
    public void mo20706m0(z5m z5mVar, MomoCodec momoCodec, uow uowVar) {
        m128842z(z5mVar.getInput(), momoCodec, uowVar);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: n */
    public void mo20707n(int i) {
        this.f102074t = i;
        for (wzl wzlVar : this.f102064j.values()) {
            if (wzlVar != null) {
                wzlVar.mo143396n(i);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: n0 */
    public void mo20708n0(z5m z5mVar) {
        boolean z;
        MomoPipeline.DecodeType decodeType = MomoPipeline.DecodeType.HARD_DECODE;
        synchronized (this.f102057c) {
            try {
                z = false;
                for (MomoCodec momoCodec : this.f102063i) {
                    MomoPipeline.DecodeType decodeType2 = momoCodec.getFilter().m20728Z1().f180156A0;
                    MomoPipeline.DecodeType decodeType3 = MomoPipeline.DecodeType.SOFT_DECODE;
                    if (decodeType2 == decodeType3) {
                        decodeType = decodeType3;
                    }
                    if (momoCodec.mo20658c1() == 2 && momoCodec.getFilter().m20728Z1().f175502q) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (this.f102066l == null) {
                qmq0 qmq0Var = new qmq0();
                this.f102066l = qmq0Var;
                uow uowVar = this.f102062h;
                qmq0Var.setRenderSize(uowVar.f175498o, uowVar.f175500p);
                this.f102066l.f158394a = new C17136h();
            }
            rsy rsyVar = this.f102061g;
            if (rsyVar != null) {
                rsyVar.removeTarget(this.f102066l);
                this.f102061g.addTarget(this.f102066l);
            } else {
                z5mVar.getInput().removeTarget(this.f102066l);
                z5mVar.getInput().addTarget(this.f102066l);
            }
        }
        if (decodeType == MomoPipeline.DecodeType.SOFT_DECODE) {
            if (this.f102065k == null) {
                qmq0 qmq0Var2 = new qmq0();
                this.f102065k = qmq0Var2;
                uow uowVar2 = this.f102062h;
                qmq0Var2.setRenderSize(uowVar2.f175494m, uowVar2.f175496n);
                this.f102065k.f158394a = new C17137i();
            }
            rsy rsyVar2 = this.f102061g;
            if (rsyVar2 != null) {
                rsyVar2.removeTarget(this.f102065k);
                this.f102061g.addTarget(this.f102065k);
            } else {
                z5mVar.getInput().removeTarget(this.f102065k);
                z5mVar.getInput().addTarget(this.f102065k);
            }
        }
        if (!this.f102067m) {
            this.f102067m = true;
            dpl dplVar = this.f102058d;
            if (dplVar != null) {
                dplVar.mo20934I1();
            }
            if (z5mVar instanceof vze) {
                m128827B(null);
            } else {
                m128827B(mo20690Z(z5mVar));
            }
            bfj bfjVar = this.f102060f;
            if (bfjVar != null && bfjVar.m103901a() != null) {
                this.f102056b.m165928I(this.f102060f.m103901a()).m128981I(this.f102062h.f180160E0);
            }
            this.f102056b.m165949e0(this.f102062h);
        }
        for (wzl wzlVar : this.f102064j.values()) {
            if (wzlVar != null) {
                for (bfj bfjVar2 : this.f102059e.values()) {
                    if (bfjVar2.m103903c() instanceof eql) {
                        wzlVar.mo143391A1((eql) bfjVar2.m103903c());
                    }
                }
                for (MomoCodec momoCodec2 : this.f102063i) {
                    if (momoCodec2 instanceof o410.InterfaceC19026f) {
                        this.f102056b.m165946b0((o410.InterfaceC19026f) momoCodec2);
                    }
                }
                wzlVar.mo143392U(this.f102075u);
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", ">>>>>:" + wzlVar + " >>>>> start");
                wzlVar.start();
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: o */
    public void mo20709o() {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            o410Var.m165959s();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: o0 */
    public void mo20710o0(q210.InterfaceC19502c interfaceC19502c) {
        this.f102056b.m165927H().m174975h(interfaceC19502c);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: p */
    public void mo20711p(String str, int i) {
        this.f102056b.m165957q(str, i);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: p0 */
    public void mo20712p0() {
        this.f102056b.m165927H().m174971d();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: q0 */
    public void mo20713q0(z5m z5mVar, Object obj, boolean z) {
        bfj bfjVar = this.f102059e.get(z5mVar.getInput());
        bfj bfjVar2 = this.f102060f;
        this.f102056b.m165924E(z5mVar.getInput());
        this.f102056b.m165940V(new RunnableC17146r(bfjVar2, z5mVar, bfjVar), mo20703j0().m128994m());
        if (bfjVar != null) {
            this.f102060f = bfjVar;
        }
        this.f102069o = true;
        this.f102070p = z5mVar instanceof m5m;
        if (z) {
            this.f102071q = true;
            this.f102056b.m165932N();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: r0 */
    public boolean mo20714r0() {
        o410 o410Var = this.f102056b;
        if (o410Var != null) {
            return o410Var.m165930L();
        }
        return false;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    public void release() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", ">>>>>>baisongling 释放所有");
        for (wzl wzlVar : this.f102064j.values()) {
            if (wzlVar != null) {
                wzlVar.stop();
                mo20704k0(wzlVar);
                mo20722y0(wzlVar);
                mo20710o0(wzlVar);
            }
        }
        this.f102064j.clear();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: s0 */
    public void mo20715s0(bql bqlVar) {
        if (mo20703j0() != null) {
            this.f102056b.m165940V(new RunnableC17142n(bqlVar), mo20703j0().m128994m());
        } else if (bqlVar != null) {
            bqlVar.mo105947M();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: t */
    public void mo20716t(int i) {
        this.f102073s = i;
        for (wzl wzlVar : this.f102064j.values()) {
            if (wzlVar != null) {
                wzlVar.mo143397t(i);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: t0 */
    public void mo20717t0(rsy rsyVar) {
        this.f102061g = rsyVar;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: u0 */
    public void mo20718u0(z5m z5mVar) {
        if (this.f102060f == null) {
            m128828M(z5mVar);
            return;
        }
        this.f102070p = z5mVar instanceof m5m;
        z5mVar.mo99495K(this.f102056b.m165928I(z5mVar.getInput()));
        bfj bfjVar = this.f102059e.get(z5mVar.getInput());
        if (bfjVar == null || bfjVar.m103902b() != null) {
            return;
        }
        this.f102056b.m165922B(bfjVar.m103901a());
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: v0 */
    public int mo20719v0() {
        return this.f102063i.size();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: w0 */
    public void mo20720w0(z5m z5mVar, dfj dfjVar) {
        if (mo20703j0() != null) {
            this.f102056b.m165940V(new RunnableC17132d(dfjVar, z5mVar), mo20703j0().m128994m());
            return;
        }
        rsy rsyVar = this.f102061g;
        if (rsyVar != null) {
            rsyVar.addTarget(dfjVar);
        } else {
            z5mVar.getInput().removeTarget(dfjVar);
            z5mVar.getInput().addTarget(dfjVar);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: x0 */
    public synchronized void mo20721x0(Object obj) {
        this.f102056b.m165951h0(obj);
        this.f102056b.m165940V(new RunnableC17145q(), mo20703j0().m128994m());
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: y0 */
    public void mo20722y0(q210.InterfaceC19501b interfaceC19501b) {
        this.f102056b.m165927H().m174974g(interfaceC19501b);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: z0 */
    public o410 mo20723z0() {
        return this.f102056b;
    }

    /* JADX INFO: renamed from: l.g410$k */
    public class C17139k implements o410.InterfaceC19027g {
        public C17139k() {
        }

        @Override // p153l.o410.InterfaceC19027g
        /* JADX INFO: renamed from: a */
        public void mo128846a() {
        }
    }
}
