package p149l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RequiresApi;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.producers.C1627a;
import com.facebook.imagepipeline.producers.C1628b;
import com.facebook.imagepipeline.producers.C1629c;
import com.facebook.imagepipeline.producers.C1630d;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;

/* JADX INFO: loaded from: classes.dex */
public class xc90 {

    /* JADX INFO: renamed from: a */
    public ContentResolver f192185a;

    /* JADX INFO: renamed from: b */
    public Resources f192186b;

    /* JADX INFO: renamed from: c */
    public AssetManager f192187c;

    /* JADX INFO: renamed from: d */
    public final wp3 f192188d;

    /* JADX INFO: renamed from: e */
    public final cfm f192189e;

    /* JADX INFO: renamed from: f */
    public final pwa0 f192190f;

    /* JADX INFO: renamed from: g */
    public final DownsampleMode f192191g;

    /* JADX INFO: renamed from: h */
    public final boolean f192192h;

    /* JADX INFO: renamed from: i */
    public final boolean f192193i;

    /* JADX INFO: renamed from: j */
    public final x5f f192194j;

    /* JADX INFO: renamed from: k */
    public final za80 f192195k;

    /* JADX INFO: renamed from: l */
    public final syg0<s2e> f192196l;

    /* JADX INFO: renamed from: m */
    public final pgy<cx3, PooledByteBuffer> f192197m;

    /* JADX INFO: renamed from: n */
    public final pgy<cx3, da5> f192198n;

    /* JADX INFO: renamed from: o */
    public final dx3 f192199o;

    /* JADX INFO: renamed from: p */
    public final je3<cx3> f192200p;

    /* JADX INFO: renamed from: q */
    public final je3<cx3> f192201q;

    /* JADX INFO: renamed from: r */
    public final r480 f192202r;

    /* JADX INFO: renamed from: s */
    public final int f192203s;

    /* JADX INFO: renamed from: t */
    public final int f192204t;

    /* JADX INFO: renamed from: u */
    public boolean f192205u;

    /* JADX INFO: renamed from: v */
    public final ga5 f192206v;

    /* JADX INFO: renamed from: w */
    public final int f192207w;

    /* JADX INFO: renamed from: x */
    public final boolean f192208x;

    public xc90(Context context, wp3 wp3Var, cfm cfmVar, pwa0 pwa0Var, DownsampleMode downsampleMode, boolean z, boolean z2, x5f x5fVar, za80 za80Var, pgy<cx3, da5> pgyVar, pgy<cx3, PooledByteBuffer> pgyVar2, syg0<s2e> syg0Var, dx3 dx3Var, r480 r480Var, int i, int i2, boolean z3, int i3, ga5 ga5Var, boolean z4, int i4) {
        this.f192185a = context.getApplicationContext().getContentResolver();
        this.f192186b = context.getApplicationContext().getResources();
        this.f192187c = context.getApplicationContext().getAssets();
        this.f192188d = wp3Var;
        this.f192189e = cfmVar;
        this.f192190f = pwa0Var;
        this.f192191g = downsampleMode;
        this.f192192h = z;
        this.f192193i = z2;
        this.f192194j = x5fVar;
        this.f192195k = za80Var;
        this.f192198n = pgyVar;
        this.f192197m = pgyVar2;
        this.f192196l = syg0Var;
        this.f192199o = dx3Var;
        this.f192202r = r480Var;
        this.f192200p = new je3<>(i4);
        this.f192201q = new je3<>(i4);
        this.f192203s = i;
        this.f192204t = i2;
        this.f192205u = z3;
        this.f192207w = i3;
        this.f192206v = ga5Var;
        this.f192208x = z4;
    }

    /* JADX INFO: renamed from: a */
    public static x80 m208079a(sc90<jze> sc90Var) {
        return new x80(sc90Var);
    }

    /* JADX INFO: renamed from: h */
    public static re3 m208080h(sc90<jze> sc90Var, sc90<jze> sc90Var2) {
        return new re3(sc90Var, sc90Var2);
    }

    /* JADX INFO: renamed from: A */
    public xd80 m208081A(sc90<fa5<da5>> sc90Var) {
        return new xd80(this.f192198n, this.f192199o, sc90Var);
    }

    /* JADX INFO: renamed from: B */
    public zd80 m208082B(sc90<fa5<da5>> sc90Var) {
        return new zd80(sc90Var, this.f192202r, this.f192194j.getBackgroundExecutor());
    }

    /* JADX INFO: renamed from: C */
    public lnb0 m208083C() {
        return new lnb0(this.f192194j.getIoBoundExecutor(), this.f192195k, this.f192185a);
    }

    /* JADX INFO: renamed from: D */
    public C1630d m208084D(sc90<jze> sc90Var, boolean z, uim uimVar) {
        return new C1630d(this.f192194j.getBackgroundExecutor(), this.f192195k, sc90Var, z, uimVar);
    }

    /* JADX INFO: renamed from: E */
    public <T> x6h0<T> m208085E(sc90<T> sc90Var) {
        return new x6h0<>(sc90Var);
    }

    /* JADX INFO: renamed from: F */
    public <T> ppi0<T> m208086F(sc90<T> sc90Var) {
        return new ppi0<>(5, this.f192194j.getLightWeightBackgroundExecutor(), sc90Var);
    }

    /* JADX INFO: renamed from: G */
    public wpi0 m208087G(xpi0<jze>[] xpi0VarArr) {
        return new wpi0(xpi0VarArr);
    }

    /* JADX INFO: renamed from: b */
    public <T> sc90<T> m208088b(sc90<T> sc90Var, moi0 moi0Var) {
        return new loi0(sc90Var, moi0Var);
    }

    /* JADX INFO: renamed from: c */
    public x13 m208089c(sc90<fa5<da5>> sc90Var) {
        return new x13(this.f192198n, this.f192199o, sc90Var);
    }

    /* JADX INFO: renamed from: d */
    public z13 m208090d(sc90<fa5<da5>> sc90Var) {
        return new z13(this.f192199o, sc90Var);
    }

    /* JADX INFO: renamed from: e */
    public a23 m208091e(sc90<fa5<da5>> sc90Var) {
        return new a23(this.f192198n, this.f192199o, sc90Var);
    }

    /* JADX INFO: renamed from: f */
    public j23 m208092f(sc90<fa5<da5>> sc90Var) {
        return new j23(sc90Var, this.f192203s, this.f192204t, this.f192205u);
    }

    /* JADX INFO: renamed from: g */
    public l23 m208093g(sc90<fa5<da5>> sc90Var) {
        return new l23(this.f192197m, this.f192196l, this.f192199o, this.f192200p, this.f192201q, sc90Var);
    }

    /* JADX INFO: renamed from: i */
    public k4c m208094i() {
        return new k4c(this.f192195k);
    }

    /* JADX INFO: renamed from: j */
    public C1627a m208095j(sc90<jze> sc90Var) {
        return new C1627a(this.f192188d, this.f192194j.getDecodeExecutor(), this.f192189e, this.f192190f, this.f192191g, this.f192192h, this.f192193i, sc90Var, this.f192207w, this.f192206v, null, vyg0.f183524b);
    }

    /* JADX INFO: renamed from: k */
    public tsd m208096k(sc90<fa5<da5>> sc90Var) {
        return new tsd(sc90Var, this.f192194j.getBackgroundScheduledExecutorService());
    }

    /* JADX INFO: renamed from: l */
    public C1628b m208097l(sc90<jze> sc90Var) {
        return new C1628b(this.f192196l, this.f192199o, sc90Var);
    }

    /* JADX INFO: renamed from: m */
    public C1629c m208098m(sc90<jze> sc90Var) {
        return new C1629c(this.f192196l, this.f192199o, sc90Var);
    }

    /* JADX INFO: renamed from: n */
    public hze m208099n(sc90<jze> sc90Var) {
        return new hze(this.f192199o, this.f192208x, sc90Var);
    }

    /* JADX INFO: renamed from: o */
    public sc90<jze> m208100o(sc90<jze> sc90Var) {
        return new mze(this.f192197m, this.f192199o, sc90Var);
    }

    /* JADX INFO: renamed from: p */
    public nze m208101p(sc90<jze> sc90Var) {
        return new nze(this.f192196l, this.f192199o, this.f192200p, this.f192201q, sc90Var);
    }

    /* JADX INFO: renamed from: q */
    public xrv m208102q() {
        return new xrv(this.f192194j.getIoBoundExecutor(), this.f192195k, this.f192187c);
    }

    /* JADX INFO: renamed from: r */
    public zrv m208103r() {
        return new zrv(this.f192194j.getIoBoundExecutor(), this.f192195k, this.f192185a);
    }

    /* JADX INFO: renamed from: s */
    public asv m208104s() {
        return new asv(this.f192194j.getIoBoundExecutor(), this.f192195k, this.f192185a);
    }

    /* JADX INFO: renamed from: t */
    public LocalExifThumbnailProducer m208105t() {
        return new LocalExifThumbnailProducer(this.f192194j.mo146565d(), this.f192195k, this.f192185a);
    }

    /* JADX INFO: renamed from: u */
    public ntv m208106u() {
        return new ntv(this.f192194j.getIoBoundExecutor(), this.f192195k);
    }

    /* JADX INFO: renamed from: v */
    public vuv m208107v() {
        return new vuv(this.f192194j.getIoBoundExecutor(), this.f192195k, this.f192186b);
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: w */
    public zuv m208108w() {
        return new zuv(this.f192194j.getBackgroundExecutor(), this.f192185a);
    }

    /* JADX INFO: renamed from: x */
    public dvv m208109x() {
        return new dvv(this.f192194j.getIoBoundExecutor(), this.f192185a);
    }

    /* JADX INFO: renamed from: y */
    public sc90<jze> m208110y(mb20 mb20Var) {
        return new lb20(this.f192195k, this.f192188d, mb20Var);
    }

    /* JADX INFO: renamed from: z */
    public m860 m208111z(sc90<jze> sc90Var) {
        return new m860(this.f192196l, this.f192199o, this.f192195k, this.f192188d, sc90Var);
    }
}
