package p149l;

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

/* JADX INFO: loaded from: classes7.dex */
public class yv00 implements MomoPipeline {

    /* JADX INFO: renamed from: b */
    protected gw00 f200152b;

    /* JADX INFO: renamed from: d */
    protected sml f200154d;

    /* JADX INFO: renamed from: f */
    private hcj f200156f;

    /* JADX INFO: renamed from: g */
    protected ujy f200157g;

    /* JADX INFO: renamed from: h */
    protected vlw f200158h;

    /* JADX INFO: renamed from: k */
    private ldq0 f200161k;

    /* JADX INFO: renamed from: l */
    private ldq0 f200162l;

    /* JADX INFO: renamed from: u */
    private sol f200171u;

    /* JADX INFO: renamed from: v */
    private gw00.InterfaceC17172d f200172v;

    /* JADX INFO: renamed from: w */
    private bw00.InterfaceC15993b f200173w;

    /* JADX INFO: renamed from: x */
    private gw00.InterfaceC17174f f200174x;

    /* JADX INFO: renamed from: y */
    protected xgf0 f200175y;

    /* JADX INFO: renamed from: a */
    private final String f200151a = "CodecFilterManager";

    /* JADX INFO: renamed from: c */
    protected final Object f200153c = new Object();

    /* JADX INFO: renamed from: e */
    private PipelineConcurrentHashMap<mcj, hcj> f200155e = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    protected PipelineConcurrentHashMap<MomoCodec, dxl> f200160j = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    private boolean f200163m = false;

    /* JADX INFO: renamed from: n */
    private boolean f200164n = false;

    /* JADX INFO: renamed from: o */
    private boolean f200165o = false;

    /* JADX INFO: renamed from: p */
    private boolean f200166p = false;

    /* JADX INFO: renamed from: q */
    private boolean f200167q = false;

    /* JADX INFO: renamed from: r */
    private int f200168r = 0;

    /* JADX INFO: renamed from: s */
    private int f200169s = 0;

    /* JADX INFO: renamed from: t */
    private int f200170t = 0;

    /* JADX INFO: renamed from: z */
    private int f200176z = 5000;

    /* JADX INFO: renamed from: A */
    private int f200150A = 5;

    /* JADX INFO: renamed from: i */
    protected List<MomoCodec> f200159i = new ArrayList();

    /* JADX INFO: renamed from: l.yv00$a */
    public class RunnableC21520a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoCodec f200177a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ vlw f200178b;

        public RunnableC21520a(MomoCodec momoCodec, vlw vlwVar) {
            this.f200177a = momoCodec;
            this.f200178b = vlwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            yv00.this.mo19704j0().m216260B(this.f200177a);
            this.f200177a.mo19657Y(yv00.this.mo19704j0(), this.f200178b);
        }
    }

    /* JADX INFO: renamed from: l.yv00$b */
    public class RunnableC21521b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoCodec f200180a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ mcj f200181b;

        public RunnableC21521b(MomoCodec momoCodec, mcj mcjVar) {
            this.f200180a = momoCodec;
            this.f200181b = mcjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ujy ujyVar = yv00.this.f200157g;
            if (ujyVar != null) {
                ujyVar.removeTarget(this.f200180a.getFilter());
            } else {
                mcj mcjVar = this.f200181b;
                if (mcjVar != null) {
                    mcjVar.removeTarget(this.f200180a.getFilter());
                }
            }
            if (this.f200180a.getFilter() != null) {
                this.f200180a.getFilter().releaseFrameBuffer();
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$c */
    public class RunnableC21522c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoCodec f200183a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ vlw f200184b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ mcj f200185c;

        public RunnableC21522c(MomoCodec momoCodec, vlw vlwVar, mcj mcjVar) {
            this.f200183a = momoCodec;
            this.f200184b = vlwVar;
            this.f200185c = mcjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (yv00.this.f200157g == null) {
                this.f200185c.removeTarget(this.f200183a.getFilter());
                this.f200185c.addTarget(this.f200183a.getFilter());
                return;
            }
            eyx.m118802c().m118808g("MomoPiplineImpl", "mProcessingPipeline.runOnDraw codecFilter.isCameraCodec" + this.f200183a.mo19669r1() + ",mpCodec:" + this.f200184b.f182018G0);
            if (this.f200183a.mo19669r1() || this.f200184b.f182018G0) {
                yv00.this.f200157g.removeTarget(this.f200183a.getFilter());
                yv00.this.f200157g.m194134Q1(this.f200183a.getFilter());
            } else {
                yv00.this.f200157g.removeTarget(this.f200183a.getFilter());
                yv00.this.f200157g.addTarget(this.f200183a.getFilter());
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$d */
    public class RunnableC21523d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ jcj f200187a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ i3m f200188b;

        public RunnableC21523d(jcj jcjVar, i3m i3mVar) {
            this.f200187a = jcjVar;
            this.f200188b = i3mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ujy ujyVar = yv00.this.f200157g;
            if (ujyVar != null) {
                ujyVar.addTarget(this.f200187a);
            } else {
                this.f200188b.getInput().removeTarget(this.f200187a);
                this.f200188b.getInput().addTarget(this.f200187a);
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$e */
    public class RunnableC21524e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ jcj f200190a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ i3m f200191b;

        public RunnableC21524e(jcj jcjVar, i3m i3mVar) {
            this.f200190a = jcjVar;
            this.f200191b = i3mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ujy ujyVar = yv00.this.f200157g;
            if (ujyVar != null) {
                ujyVar.removeTarget(this.f200190a);
                return;
            }
            i3m i3mVar = this.f200191b;
            if (i3mVar != null) {
                i3mVar.getInput().removeTarget(this.f200190a);
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$f */
    public class C21525f implements ldq0.InterfaceC18199a {
        public C21525f() {
        }

        @Override // p149l.ldq0.InterfaceC18199a
        /* JADX INFO: renamed from: a */
        public void mo149469a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = yv00.this.f200159i.iterator();
            while (it.hasNext()) {
                it.next().mo19665m1(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$g */
    public class C21526g implements ldq0.InterfaceC18199a {
        public C21526g() {
        }

        @Override // p149l.ldq0.InterfaceC18199a
        /* JADX INFO: renamed from: a */
        public void mo149469a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = yv00.this.f200159i.iterator();
            while (it.hasNext()) {
                it.next().mo19670v0(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$h */
    public class C21527h implements ldq0.InterfaceC18199a {
        public C21527h() {
        }

        @Override // p149l.ldq0.InterfaceC18199a
        /* JADX INFO: renamed from: a */
        public void mo149469a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = yv00.this.f200159i.iterator();
            while (it.hasNext()) {
                it.next().mo19665m1(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$i */
    public class C21528i implements ldq0.InterfaceC18199a {
        public C21528i() {
        }

        @Override // p149l.ldq0.InterfaceC18199a
        /* JADX INFO: renamed from: a */
        public void mo149469a(ByteBuffer byteBuffer, long j) {
            Iterator<MomoCodec> it = yv00.this.f200159i.iterator();
            while (it.hasNext()) {
                it.next().mo19670v0(byteBuffer);
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$j */
    public class C21529j implements gw00.InterfaceC17174f {
        public C21529j() {
        }

        @Override // p149l.gw00.InterfaceC17174f
        /* JADX INFO: renamed from: P0 */
        public void mo19959P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
            if (yv00.this.f200168r == 10) {
                yv00.this.f200168r = 0;
            }
            yv00.m216179k(yv00.this);
            if (yv00.this.f200174x != null) {
                yv00.this.f200174x.mo19959P0(yw00Var, i, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$l */
    public class C21531l implements gw00.InterfaceC17173e {
        public C21531l() {
        }

        @Override // p149l.gw00.InterfaceC17173e
        /* JADX INFO: renamed from: a */
        public void mo128373a() {
            if (yv00.this.f200156f != null && !yv00.this.f200166p) {
                if (yv00.this.f200156f.m130423b() != null) {
                    yv00.this.f200156f.m130423b().releaseFrameBuffer();
                }
                if (yv00.this.f200156f.m130422a() != null) {
                    yv00.this.f200156f.m130422a().releaseFrameBuffer();
                }
            }
            ujy ujyVar = yv00.this.f200157g;
            if (ujyVar != null) {
                ujyVar.releaseFrameBuffer();
                yv00.this.f200157g.reInitialize();
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$m */
    public class C21532m implements gw00.InterfaceC17172d {
        public C21532m() {
        }

        @Override // p149l.gw00.InterfaceC17172d
        /* JADX INFO: renamed from: a */
        public void mo128369a() {
            if (yv00.this.f200165o) {
                synchronized (yv00.this.f200159i) {
                    try {
                        for (MomoCodec momoCodec : yv00.this.f200159i) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (yv00.this.f200172v != null) {
                    yv00.this.f200172v.mo128369a();
                }
                if (yv00.this.f200167q) {
                    synchronized (yv00.this.f200159i) {
                        try {
                            for (MomoCodec momoCodec2 : yv00.this.f200159i) {
                                yv00 yv00Var = yv00.this;
                                momoCodec2.mo19657Y(yv00Var.f200152b.m128321I(yv00Var.f200156f.m130422a()), yv00.this.f200158h);
                            }
                            yv00.this.f200152b.m128325N();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    yv00.this.f200167q = false;
                }
                yv00.this.f200165o = false;
            }
        }

        @Override // p149l.gw00.InterfaceC17172d
        /* JADX INFO: renamed from: b */
        public void mo128370b() {
            if (yv00.this.f200172v != null) {
                yv00.this.f200172v.mo128370b();
            }
        }

        @Override // p149l.gw00.InterfaceC17172d
        /* JADX INFO: renamed from: c */
        public void mo128371c() {
            if (yv00.this.f200155e != null) {
                for (V v2 : yv00.this.f200155e.values()) {
                    if (v2.m130423b() != null) {
                        ujy ujyVar = yv00.this.f200157g;
                        if (ujyVar != null) {
                            ujyVar.removeTarget(v2.m130423b());
                        }
                        v2.m130423b().destroy();
                    }
                }
                yv00.this.f200155e.clear();
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "onEglDestory");
            if (yv00.this.f200172v != null) {
                yv00.this.f200172v.mo128371c();
            }
        }

        @Override // p149l.gw00.InterfaceC17172d
        /* JADX INFO: renamed from: d */
        public void mo128372d(int i, int i2) {
            yv00 yv00Var = yv00.this;
            if (yv00Var.f200157g == null || yv00Var.f200172v == null) {
                return;
            }
            yv00.this.f200172v.mo128372d(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.yv00$n */
    public class RunnableC21533n implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ qnl f200201a;

        public RunnableC21533n(qnl qnlVar) {
            this.f200201a = qnlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            qnl qnlVar = this.f200201a;
            if (qnlVar != null) {
                qnlVar.mo175683M();
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$o */
    public class RunnableC21534o implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ts2 f200203a;

        public RunnableC21534o(ts2 ts2Var) {
            this.f200203a = ts2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (V v2 : yv00.this.f200155e.values()) {
                if (v2.m130424c() instanceof qnl) {
                    ((qnl) v2.m130424c()).mo175685j(this.f200203a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$p */
    public class RunnableC21535p implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ fcj f200205a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ hcj f200206b;

        public RunnableC21535p(fcj fcjVar, hcj hcjVar) {
            this.f200205a = fcjVar;
            this.f200206b = hcjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (yv00.this.f200153c) {
                try {
                    ujy ujyVar = yv00.this.f200157g;
                    if (ujyVar != null) {
                        ujyVar.addTarget(this.f200205a);
                        this.f200206b.m130422a().removeTarget(yv00.this.f200157g);
                        this.f200206b.m130422a().addTarget(yv00.this.f200157g);
                        eyx.m118802c().m118808g("prepareRoot addTarget mScreenEndpoint modle:" + this.f200206b.m130422a());
                    } else {
                        this.f200206b.m130422a().addTarget(this.f200205a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$q */
    public class RunnableC21536q implements Runnable {
        public RunnableC21536q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (yv00.this.f200153c) {
                try {
                    for (MomoCodec momoCodec : yv00.this.f200159i) {
                        eyx.m118802c().m118808g("startRender isCameraCodec()" + momoCodec.mo19669r1() + ",isCameraCodec" + yv00.this.f200158h.f182018G0 + "codec:" + momoCodec);
                        yv00 yv00Var = yv00.this;
                        if (yv00Var.f200157g == null) {
                            yv00Var.f200156f.m130422a().removeTarget(momoCodec.getFilter());
                            yv00.this.f200156f.m130422a().addTarget(momoCodec.getFilter());
                        } else if (momoCodec.mo19669r1()) {
                            yv00.this.f200157g.removeTarget(momoCodec.getFilter());
                            yv00.this.f200157g.m194134Q1(momoCodec.getFilter());
                        } else {
                            yv00 yv00Var2 = yv00.this;
                            if (yv00Var2.f200158h.f182018G0) {
                                yv00.this.f200157g.removeTarget(momoCodec.getFilter());
                                yv00.this.f200157g.m194134Q1(momoCodec.getFilter());
                            } else {
                                yv00Var2.f200157g.removeTarget(momoCodec.getFilter());
                                yv00.this.f200157g.addTarget(momoCodec.getFilter());
                            }
                        }
                        yv00 yv00Var3 = yv00.this;
                        yv00Var3.f200152b.m128321I(yv00Var3.f200156f.m130422a()).m216274h(momoCodec);
                        yv00 yv00Var4 = yv00.this;
                        yv00Var4.f200152b.m128321I(yv00Var4.f200156f.m130422a()).m216269L();
                        yv00 yv00Var5 = yv00.this;
                        yv00Var5.f200152b.m128321I(yv00Var5.f200156f.m130422a()).m216266I(yv00.this.f200158h.f182016E0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yv00$r */
    public class RunnableC21537r implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ hcj f200209a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ i3m f200210b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ hcj f200211c;

        public RunnableC21537r(hcj hcjVar, i3m i3mVar, hcj hcjVar2) {
            this.f200209a = hcjVar;
            this.f200210b = i3mVar;
            this.f200211c = hcjVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (yv00.this.f200153c) {
                try {
                    for (MomoCodec momoCodec : yv00.this.f200159i) {
                        ujy ujyVar = yv00.this.f200157g;
                        if (ujyVar == null) {
                            this.f200209a.m130422a().removeTarget(momoCodec.getFilter());
                        } else {
                            ujyVar.removeTarget(momoCodec.getFilter());
                            yv00.this.f200157g.m194134Q1(momoCodec.getFilter());
                            this.f200209a.m130422a().removeTarget(yv00.this.f200157g);
                        }
                        gw00 gw00Var = yv00.this.f200152b;
                        gw00Var.m128326O(gw00Var.m128322J());
                        momoCodec.getFilter().reInitialize();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f200209a.m130423b() != null) {
                ujy ujyVar2 = yv00.this.f200157g;
                hcj hcjVar = this.f200209a;
                if (ujyVar2 != null) {
                    ujyVar2.removeTarget(hcjVar.m130423b());
                    this.f200209a.m130422a().removeTarget(yv00.this.f200157g);
                } else {
                    hcjVar.m130422a().removeTarget(this.f200209a.m130423b());
                }
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "addFilterToDestroy >>>" + this.f200209a.m130423b().toString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                yv00.this.f200152b.m128313A(this.f200209a.m130423b(), this.f200209a.m130422a().toString());
                this.f200209a.m130426e(null);
            }
            if (this.f200209a.m130422a() != this.f200210b.getInput()) {
                yv00.this.f200155e.remove(this.f200209a.m130422a());
            }
            hcj hcjVar2 = this.f200211c;
            if (hcjVar2 != null) {
                fcj fcjVarM130423b = hcjVar2.m130423b();
                if (fcjVarM130423b == null) {
                    fcjVarM130423b = new fcj();
                    this.f200211c.m130426e(fcjVarM130423b);
                }
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setScreenEnd Size" + yv00.this.f200158h.f177168u + ":" + yv00.this.f200158h.f177169v);
                if (fcjVarM130423b instanceof nbj) {
                    vlw vlwVar = yv00.this.f200158h;
                    fcjVarM130423b.setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                } else {
                    xxx xxxVarM211572F = xxx.m211572F();
                    vlw vlwVar2 = yv00.this.f200158h;
                    xxxVarM211572F.m211625n0(vlwVar2.f177168u, vlwVar2.f177169v);
                    vlw vlwVar3 = yv00.this.f200158h;
                    fcjVarM130423b.setRenderSize(vlwVar3.f177168u, vlwVar3.f177169v);
                }
                ujy ujyVar3 = yv00.this.f200157g;
                if (ujyVar3 == null) {
                    this.f200211c.m130422a().removeTarget(fcjVarM130423b);
                    this.f200211c.m130422a().addTarget(fcjVarM130423b);
                } else {
                    ujyVar3.removeTarget(fcjVarM130423b);
                    yv00.this.f200157g.addTarget(fcjVarM130423b);
                    this.f200211c.m130422a().removeTarget(yv00.this.f200157g);
                    this.f200211c.m130422a().addTarget(yv00.this.f200157g);
                }
            }
        }
    }

    public yv00(vlw vlwVar) {
        this.f200158h = vlwVar;
        gw00 gw00Var = new gw00();
        this.f200152b = gw00Var;
        gw00Var.m128341b0(new C21529j());
        this.f200152b.m128343c0(new C21530k());
        this.f200152b.m128337Z(new C21531l());
        this.f200152b.m128336Y(new C21532m());
    }

    /* JADX INFO: renamed from: B */
    private void m216174B(yw00 yw00Var) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "attachCodec" + this.f200159i.size());
        synchronized (this.f200153c) {
            try {
                List<MomoCodec> list = this.f200159i;
                if (list != null) {
                    Iterator<MomoCodec> it = list.iterator();
                    while (it.hasNext()) {
                        this.f200152b.m128368z(yw00Var, it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private void m216175M(i3m i3mVar) {
        i3mVar.mo100323K(this.f200152b.m128321I(i3mVar.getInput()));
        hcj hcjVar = this.f200155e.get(i3mVar.getInput());
        if (hcjVar == null || hcjVar.m130423b() != null) {
            return;
        }
        this.f200152b.m128314B(hcjVar.m130422a());
        fcj fcjVar = new fcj();
        vlw vlwVar = this.f200158h;
        fcjVar.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
        hcjVar.m130426e(fcjVar);
        this.f200152b.m128333V(new RunnableC21535p(fcjVar, hcjVar), mo19704j0().m216279m());
        this.f200156f = hcjVar;
    }

    /* JADX INFO: renamed from: O */
    private void m216176O(mcj mcjVar, MomoCodec momoCodec) {
        synchronized (this.f200153c) {
            this.f200159i.remove(momoCodec);
        }
        this.f200152b.m128327P(momoCodec);
        if (mo19704j0() == null) {
            ujy ujyVar = this.f200157g;
            if (ujyVar != null) {
                ujyVar.removeTarget(momoCodec.getFilter());
            } else if (mcjVar != null) {
                mcjVar.removeTarget(momoCodec.getFilter());
            }
        } else {
            this.f200152b.m128333V(new RunnableC21521b(momoCodec, mcjVar), mo19704j0().m216279m());
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "unregisterLog>>>>>:" + momoCodec);
        dxl dxlVar = this.f200160j.get(momoCodec);
        if (dxlVar != null) {
            dxlVar.stop();
            mo19705k0(dxlVar);
            mo19723y0(dxlVar);
            mo19711o0(dxlVar);
        }
        this.f200160j.remove(momoCodec);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m216179k(yv00 yv00Var) {
        int i = yv00Var.f200168r;
        yv00Var.f200168r = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: z */
    private void m216189z(mcj mcjVar, MomoCodec momoCodec, vlw vlwVar) {
        if (momoCodec instanceof MediaBaseCodecFilter) {
            momoCodec.getFilter().mo19746n2(vlwVar);
            momoCodec.getFilter().setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
            MediaBaseCodecFilter filter = momoCodec.getFilter();
            float f = vlwVar.f182042u0;
            if (f <= 0.0f) {
                f = 1.0f;
            }
            filter.m120435U1(f);
        }
        synchronized (this.f200153c) {
            this.f200159i.add(momoCodec);
            eyx.m118802c().m118808g("MomoPiplineImpl", "addMediaCodecFilter codeListSize:" + this.f200159i.size() + ",codec:" + momoCodec);
        }
        if (momoCodec instanceof ewl) {
            dxl dxlVarMo205713E = mo205713E(momoCodec.toString());
            dxlVarMo205713E.mo99215G1((ewl) momoCodec);
            dxlVarMo205713E.mo104123t(this.f200169s);
            dxlVarMo205713E.mo104122n(this.f200170t);
            dxlVarMo205713E.mo104120f1(this.f200173w);
            momoCodec.mo19663i(this.f200176z, this.f200150A, this.f200175y);
            boolean z = false;
            for (hcj hcjVar : this.f200155e.values()) {
                if (hcjVar.m130424c() instanceof tnl) {
                    dxlVarMo205713E.mo104117A1((tnl) hcjVar.m130424c());
                    z = true;
                }
            }
            if (!z) {
                dxlVarMo205713E.mo104117A1(null);
            }
            this.f200160j.put(momoCodec, dxlVarMo205713E);
        }
        if (mo19704j0() != null) {
            this.f200152b.m128333V(new RunnableC21522c(momoCodec, vlwVar, mcjVar), mo19704j0().m216279m());
            return;
        }
        if (this.f200157g == null) {
            mcjVar.removeTarget(momoCodec.getFilter());
            mcjVar.addTarget(momoCodec.getFilter());
        } else if (momoCodec.mo19669r1() || vlwVar.f182018G0) {
            this.f200157g.removeTarget(momoCodec.getFilter());
            this.f200157g.m194134Q1(momoCodec.getFilter());
        } else {
            this.f200157g.removeTarget(momoCodec.getFilter());
            this.f200157g.addTarget(momoCodec.getFilter());
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: A */
    public synchronized void mo19673A(Object obj) {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            this.f200165o = true;
            gw00Var.m128330S(obj);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: A0 */
    public hu00.InterfaceC17392a mo19674A0() {
        return this.f200152b;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: B0 */
    public void mo19675B0(hu00.InterfaceC17395d interfaceC17395d) {
        this.f200152b.m128320H().m132946c(interfaceC17395d);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: C */
    public synchronized void mo19676C(Object obj) {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            this.f200165o = true;
            gw00Var.m128328Q(obj);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: D */
    public void mo19678D(bw00.InterfaceC15993b interfaceC15993b) {
        this.f200173w = interfaceC15993b;
        for (dxl dxlVar : this.f200160j.values()) {
            if (dxlVar != null) {
                dxlVar.mo104120f1(interfaceC15993b);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: D0 */
    public void mo19679D0(ya1 ya1Var) {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            gw00Var.m128335X(ya1Var);
        }
    }

    /* JADX INFO: renamed from: E */
    public dxl mo205713E(String str) {
        throw null;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: F */
    public boolean mo19680F() {
        return this.f200163m;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: G */
    public synchronized void mo19681G() {
        try {
            this.f200152b.m128319G();
            Iterator<hcj> it = this.f200155e.values().iterator();
            while (it.hasNext()) {
                it.next().m130425d();
            }
            this.f200156f = null;
            this.f200155e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: H */
    public void mo19682H(etf etfVar) {
        synchronized (this.f200153c) {
            this.f200152b.m128339a0(etfVar);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: I */
    public void mo19683I(ccj ccjVar, String str) {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            gw00Var.m128313A(ccjVar, str);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: J */
    public synchronized void mo19684J(Object obj) {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            this.f200165o = true;
            gw00Var.m128329R(obj);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: K */
    public synchronized void mo19685K() {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            gw00Var.m128324M();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m216190N(MomoCodec momoCodec) {
        hcj hcjVar = this.f200156f;
        if (hcjVar != null) {
            m216176O(hcjVar.m130422a(), momoCodec);
        } else {
            m216176O(null, momoCodec);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m216191P() {
        synchronized (this.f200153c) {
            this.f200159i.clear();
        }
        if (this.f200163m) {
            this.f200163m = false;
            for (dxl dxlVar : this.f200160j.values()) {
                if (dxlVar != null) {
                    dxlVar.stop();
                    mo19705k0(dxlVar);
                    mo19723y0(dxlVar);
                    mo19711o0(dxlVar);
                }
            }
            this.f200160j.clear();
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "stopRecordNotLeaveRoom>>>>>>>");
            this.f200152b.m128360m0(null);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: U */
    public void mo19686U(sol solVar) {
        this.f200171u = solVar;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: V */
    public void mo19687V(@NonNull i3m i3mVar) {
        boolean z;
        MomoPipeline.DecodeType decodeType = MomoPipeline.DecodeType.HARD_DECODE;
        synchronized (this.f200153c) {
            try {
                z = false;
                for (MomoCodec momoCodec : this.f200159i) {
                    MomoPipeline.DecodeType decodeType2 = momoCodec.getFilter().m19729Z1().f182012A0;
                    MomoPipeline.DecodeType decodeType3 = MomoPipeline.DecodeType.SOFT_DECODE;
                    if (decodeType2 == decodeType3) {
                        decodeType = decodeType3;
                    }
                    if (momoCodec.mo19659c1() == 2 && momoCodec.getFilter().m19729Z1().f177160q) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (this.f200162l == null) {
                ldq0 ldq0Var = new ldq0();
                this.f200162l = ldq0Var;
                vlw vlwVar = this.f200158h;
                ldq0Var.setRenderSize(vlwVar.f177156o, vlwVar.f177158p);
                this.f200162l.f127576a = new C21525f();
            }
            ujy ujyVar = this.f200157g;
            if (ujyVar != null) {
                ujyVar.removeTarget(this.f200162l);
                this.f200157g.addTarget(this.f200162l);
            } else {
                i3mVar.getInput().removeTarget(this.f200162l);
                i3mVar.getInput().addTarget(this.f200162l);
            }
        }
        if (decodeType == MomoPipeline.DecodeType.SOFT_DECODE) {
            if (this.f200161k == null) {
                ldq0 ldq0Var2 = new ldq0();
                this.f200161k = ldq0Var2;
                vlw vlwVar2 = this.f200158h;
                ldq0Var2.setRenderSize(vlwVar2.f177152m, vlwVar2.f177154n);
                this.f200161k.f127576a = new C21526g();
            }
            ujy ujyVar2 = this.f200157g;
            if (ujyVar2 != null) {
                ujyVar2.removeTarget(this.f200161k);
                this.f200157g.addTarget(this.f200161k);
            } else {
                i3mVar.getInput().removeTarget(this.f200161k);
                i3mVar.getInput().addTarget(this.f200161k);
            }
        }
        if (!this.f200163m) {
            this.f200163m = true;
            sml smlVar = this.f200154d;
            if (smlVar != null) {
                smlVar.mo19935I1();
            }
            if (i3mVar instanceof rye) {
                m216174B(null);
            } else {
                m216174B(mo19691Z(i3mVar));
            }
            hcj hcjVar = this.f200156f;
            if (hcjVar != null && hcjVar.m130422a() != null) {
                this.f200152b.m128321I(this.f200156f.m130422a()).m216266I(this.f200158h.f182016E0);
            }
            eyx.m118802c().m118808g(getClass() + " startRecord mProcessingPipeline");
            this.f200152b.m128345d0(this.f200158h);
        }
        for (dxl dxlVar : this.f200160j.values()) {
            if (dxlVar != null) {
                for (hcj hcjVar2 : this.f200155e.values()) {
                    if (hcjVar2.m130424c() instanceof tnl) {
                        dxlVar.mo104117A1((tnl) hcjVar2.m130424c());
                    }
                }
                for (MomoCodec momoCodec2 : this.f200159i) {
                    if (momoCodec2 instanceof gw00.InterfaceC17174f) {
                        this.f200152b.m128341b0((gw00.InterfaceC17174f) momoCodec2);
                    }
                }
                dxlVar.mo104118U(this.f200171u);
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", ">>>>>:" + dxlVar + " >>>>> start");
                dxlVar.start();
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: W */
    public void mo19688W(gw00.InterfaceC17174f interfaceC17174f) {
        this.f200174x = interfaceC17174f;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: X */
    public void mo19689X(i3m i3mVar, jcj jcjVar) {
        if (mo19704j0() != null) {
            this.f200152b.m128333V(new RunnableC21524e(jcjVar, i3mVar), mo19704j0().m216279m());
            return;
        }
        ujy ujyVar = this.f200157g;
        if (ujyVar != null) {
            ujyVar.removeTarget(jcjVar);
        } else if (i3mVar != null) {
            i3mVar.getInput().removeTarget(jcjVar);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: Y */
    public void mo19690Y(i3m i3mVar, MomoCodec momoCodec, vlw vlwVar) {
        mo19707m0(i3mVar, momoCodec, vlwVar);
        this.f200152b.m128316D(mo19691Z(i3mVar), momoCodec, vlwVar);
        for (dxl dxlVar : this.f200160j.values()) {
            if (dxlVar != null) {
                if ((momoCodec instanceof ewl) && (momoCodec instanceof gw00.InterfaceC17174f)) {
                    this.f200152b.m128341b0((gw00.InterfaceC17174f) momoCodec);
                }
                for (hcj hcjVar : this.f200155e.values()) {
                    if (hcjVar.m130424c() instanceof tnl) {
                        dxlVar.mo104117A1((tnl) hcjVar.m130424c());
                    }
                }
                for (MomoCodec momoCodec2 : this.f200159i) {
                    if (momoCodec2 instanceof gw00.InterfaceC17174f) {
                        this.f200152b.m128341b0((gw00.InterfaceC17174f) momoCodec2);
                    }
                }
                dxlVar.mo104118U(this.f200171u);
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", ">>>>>:" + dxlVar + " >>>>>watcher start");
                dxlVar.start();
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: Z */
    public yw00 mo19691Z(i3m i3mVar) {
        return this.f200152b.m128321I(i3mVar.getInput());
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: a0 */
    public void mo19692a0() {
        this.f200152b.m128320H().m132949f();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: b0 */
    public void mo19693b0(MomoCodec momoCodec, vlw vlwVar) {
        if (mo19704j0() == null) {
            momoCodec.mo19657Y(mo19704j0(), vlwVar);
        } else {
            this.f200152b.m128334W(new RunnableC21520a(momoCodec, vlwVar), mo19704j0().m216279m());
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: c0 */
    public void mo19694c0() {
        this.f200152b.m128320H().m132948e();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: d0 */
    public void mo19695d0(MomoCodec momoCodec) {
        boolean z;
        synchronized (this.f200153c) {
            try {
                Iterator<MomoCodec> it = this.f200159i.iterator();
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
        eyx.m118802c().m118808g("MomoPiplineImpl", "stopRecord isIn:" + z);
        if (z) {
            m216190N(momoCodec);
            if (mo19704j0() != null) {
                mo19704j0().m216261C(momoCodec);
            }
            this.f200152b.m128358l0(momoCodec);
        }
        if (z) {
            return;
        }
        mo19697f();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: e0 */
    public void mo19696e0(MomoCodec momoCodec) {
        boolean z;
        synchronized (this.f200153c) {
            try {
                Iterator<MomoCodec> it = this.f200159i.iterator();
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
            m216190N(momoCodec);
            if (mo19704j0() != null) {
                mo19704j0().m216261C(momoCodec);
            }
            this.f200152b.m128360m0(momoCodec);
        }
        if (z) {
            return;
        }
        m216191P();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: f */
    public void mo19697f() {
        synchronized (this.f200153c) {
            this.f200159i.clear();
        }
        if (this.f200163m) {
            this.f200163m = false;
            for (dxl dxlVar : this.f200160j.values()) {
                if (dxlVar != null) {
                    dxlVar.stop();
                    mo19705k0(dxlVar);
                    mo19723y0(dxlVar);
                    mo19711o0(dxlVar);
                }
            }
            this.f200160j.clear();
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "stopRecord>>>>>>>");
            this.f200152b.m128356k0();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: f0 */
    public void mo19698f0(i3m i3mVar) {
        this.f200155e.put(i3mVar.getInput(), new hcj(i3mVar, null));
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: g0 */
    public void mo19699g0(hu00.InterfaceC17393b interfaceC17393b) {
        this.f200152b.m128320H().m132944a(interfaceC17393b);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: h0 */
    public void mo19700h0(hu00.InterfaceC17394c interfaceC17394c) {
        this.f200152b.m128320H().m132945b(interfaceC17394c);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: i */
    public void mo19701i(int i, int i2, xgf0 xgf0Var) {
        hjx.m131421d("setSimpleMediaLogsUpload", "interFace : " + xgf0Var);
        this.f200176z = i;
        this.f200150A = i2;
        this.f200175y = xgf0Var;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: i0 */
    public void mo19702i0(vlw vlwVar) {
        ujy ujyVar = this.f200157g;
        if (ujyVar != null) {
            ujyVar.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: j */
    public void mo19703j(ts2 ts2Var) {
        if (mo19704j0() != null) {
            this.f200152b.m128333V(new RunnableC21534o(ts2Var), mo19704j0().m216279m());
            return;
        }
        for (hcj hcjVar : this.f200155e.values()) {
            if (hcjVar.m130424c() instanceof qnl) {
                ((qnl) hcjVar.m130424c()).mo175685j(ts2Var);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: j0 */
    public yw00 mo19704j0() {
        return this.f200152b.m128322J();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: k0 */
    public void mo19705k0(hu00.InterfaceC17395d interfaceC17395d) {
        this.f200152b.m128320H().m132952i(interfaceC17395d);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: l0 */
    public void mo19706l0(bw00.InterfaceC15993b interfaceC15993b, MomoCodec momoCodec) {
        this.f200173w = interfaceC15993b;
        PipelineConcurrentHashMap<MomoCodec, dxl> pipelineConcurrentHashMap = this.f200160j;
        if (pipelineConcurrentHashMap == null || momoCodec == null || !pipelineConcurrentHashMap.containsKey(momoCodec)) {
            return;
        }
        this.f200160j.get(momoCodec).mo104120f1(interfaceC15993b);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    @TargetApi(18)
    /* JADX INFO: renamed from: m0 */
    public void mo19707m0(i3m i3mVar, MomoCodec momoCodec, vlw vlwVar) {
        m216189z(i3mVar.getInput(), momoCodec, vlwVar);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: n */
    public void mo19708n(int i) {
        this.f200170t = i;
        for (dxl dxlVar : this.f200160j.values()) {
            if (dxlVar != null) {
                dxlVar.mo104122n(i);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: n0 */
    public void mo19709n0(i3m i3mVar) {
        boolean z;
        MomoPipeline.DecodeType decodeType = MomoPipeline.DecodeType.HARD_DECODE;
        synchronized (this.f200153c) {
            try {
                z = false;
                for (MomoCodec momoCodec : this.f200159i) {
                    MomoPipeline.DecodeType decodeType2 = momoCodec.getFilter().m19729Z1().f182012A0;
                    MomoPipeline.DecodeType decodeType3 = MomoPipeline.DecodeType.SOFT_DECODE;
                    if (decodeType2 == decodeType3) {
                        decodeType = decodeType3;
                    }
                    if (momoCodec.mo19659c1() == 2 && momoCodec.getFilter().m19729Z1().f177160q) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (this.f200162l == null) {
                ldq0 ldq0Var = new ldq0();
                this.f200162l = ldq0Var;
                vlw vlwVar = this.f200158h;
                ldq0Var.setRenderSize(vlwVar.f177156o, vlwVar.f177158p);
                this.f200162l.f127576a = new C21527h();
            }
            ujy ujyVar = this.f200157g;
            if (ujyVar != null) {
                ujyVar.removeTarget(this.f200162l);
                this.f200157g.addTarget(this.f200162l);
            } else {
                i3mVar.getInput().removeTarget(this.f200162l);
                i3mVar.getInput().addTarget(this.f200162l);
            }
        }
        if (decodeType == MomoPipeline.DecodeType.SOFT_DECODE) {
            if (this.f200161k == null) {
                ldq0 ldq0Var2 = new ldq0();
                this.f200161k = ldq0Var2;
                vlw vlwVar2 = this.f200158h;
                ldq0Var2.setRenderSize(vlwVar2.f177152m, vlwVar2.f177154n);
                this.f200161k.f127576a = new C21528i();
            }
            ujy ujyVar2 = this.f200157g;
            if (ujyVar2 != null) {
                ujyVar2.removeTarget(this.f200161k);
                this.f200157g.addTarget(this.f200161k);
            } else {
                i3mVar.getInput().removeTarget(this.f200161k);
                i3mVar.getInput().addTarget(this.f200161k);
            }
        }
        if (!this.f200163m) {
            this.f200163m = true;
            sml smlVar = this.f200154d;
            if (smlVar != null) {
                smlVar.mo19935I1();
            }
            if (i3mVar instanceof rye) {
                m216174B(null);
            } else {
                m216174B(mo19691Z(i3mVar));
            }
            hcj hcjVar = this.f200156f;
            if (hcjVar != null && hcjVar.m130422a() != null) {
                this.f200152b.m128321I(this.f200156f.m130422a()).m216266I(this.f200158h.f182016E0);
            }
            this.f200152b.m128347e0(this.f200158h);
        }
        for (dxl dxlVar : this.f200160j.values()) {
            if (dxlVar != null) {
                for (hcj hcjVar2 : this.f200155e.values()) {
                    if (hcjVar2.m130424c() instanceof tnl) {
                        dxlVar.mo104117A1((tnl) hcjVar2.m130424c());
                    }
                }
                for (MomoCodec momoCodec2 : this.f200159i) {
                    if (momoCodec2 instanceof gw00.InterfaceC17174f) {
                        this.f200152b.m128341b0((gw00.InterfaceC17174f) momoCodec2);
                    }
                }
                dxlVar.mo104118U(this.f200171u);
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", ">>>>>:" + dxlVar + " >>>>> start");
                dxlVar.start();
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: o */
    public void mo19710o() {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            gw00Var.m128367s();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: o0 */
    public void mo19711o0(hu00.InterfaceC17394c interfaceC17394c) {
        this.f200152b.m128320H().m132951h(interfaceC17394c);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: p */
    public void mo19712p(String str, int i) {
        this.f200152b.m128365q(str, i);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: p0 */
    public void mo19713p0() {
        this.f200152b.m128320H().m132947d();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: q0 */
    public void mo19714q0(i3m i3mVar, Object obj, boolean z) {
        hcj hcjVar = this.f200155e.get(i3mVar.getInput());
        hcj hcjVar2 = this.f200156f;
        this.f200152b.m128317E(i3mVar.getInput());
        this.f200152b.m128333V(new RunnableC21537r(hcjVar2, i3mVar, hcjVar), mo19704j0().m216279m());
        if (hcjVar != null) {
            this.f200156f = hcjVar;
        }
        this.f200165o = true;
        this.f200166p = i3mVar instanceof u2m;
        if (z) {
            this.f200167q = true;
            this.f200152b.m128325N();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: r0 */
    public boolean mo19715r0() {
        gw00 gw00Var = this.f200152b;
        if (gw00Var != null) {
            return gw00Var.m128323L();
        }
        return false;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    public void release() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", ">>>>>>baisongling 释放所有");
        for (dxl dxlVar : this.f200160j.values()) {
            if (dxlVar != null) {
                dxlVar.stop();
                mo19705k0(dxlVar);
                mo19723y0(dxlVar);
                mo19711o0(dxlVar);
            }
        }
        this.f200160j.clear();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: s0 */
    public void mo19716s0(qnl qnlVar) {
        if (mo19704j0() != null) {
            this.f200152b.m128333V(new RunnableC21533n(qnlVar), mo19704j0().m216279m());
        } else if (qnlVar != null) {
            qnlVar.mo175683M();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: t */
    public void mo19717t(int i) {
        this.f200169s = i;
        for (dxl dxlVar : this.f200160j.values()) {
            if (dxlVar != null) {
                dxlVar.mo104123t(i);
            }
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: t0 */
    public void mo19718t0(ujy ujyVar) {
        this.f200157g = ujyVar;
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: u0 */
    public void mo19719u0(i3m i3mVar) {
        if (this.f200156f == null) {
            m216175M(i3mVar);
            return;
        }
        this.f200166p = i3mVar instanceof u2m;
        i3mVar.mo100323K(this.f200152b.m128321I(i3mVar.getInput()));
        hcj hcjVar = this.f200155e.get(i3mVar.getInput());
        if (hcjVar == null || hcjVar.m130423b() != null) {
            return;
        }
        this.f200152b.m128314B(hcjVar.m130422a());
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: v0 */
    public int mo19720v0() {
        return this.f200159i.size();
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: w0 */
    public void mo19721w0(i3m i3mVar, jcj jcjVar) {
        if (mo19704j0() != null) {
            this.f200152b.m128333V(new RunnableC21523d(jcjVar, i3mVar), mo19704j0().m216279m());
            return;
        }
        ujy ujyVar = this.f200157g;
        if (ujyVar != null) {
            ujyVar.addTarget(jcjVar);
        } else {
            i3mVar.getInput().removeTarget(jcjVar);
            i3mVar.getInput().addTarget(jcjVar);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: x0 */
    public synchronized void mo19722x0(Object obj) {
        this.f200152b.m128351h0(obj);
        this.f200152b.m128333V(new RunnableC21536q(), mo19704j0().m216279m());
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: y0 */
    public void mo19723y0(hu00.InterfaceC17393b interfaceC17393b) {
        this.f200152b.m128320H().m132950g(interfaceC17393b);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: z0 */
    public gw00 mo19724z0() {
        return this.f200152b;
    }

    /* JADX INFO: renamed from: l.yv00$k */
    public class C21530k implements gw00.InterfaceC17175g {
        public C21530k() {
        }

        @Override // p149l.gw00.InterfaceC17175g
        /* JADX INFO: renamed from: a */
        public void mo128374a() {
        }
    }
}
