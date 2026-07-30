package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.RequiresApi;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.producers.C1650a;
import com.facebook.imagepipeline.producers.C1651b;
import com.facebook.imagepipeline.producers.C1652c;
import com.facebook.imagepipeline.producers.C1653d;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;

/* JADX INFO: loaded from: classes.dex */
public class bl90 {

    /* JADX INFO: renamed from: a */
    public ContentResolver f77153a;

    /* JADX INFO: renamed from: b */
    public Resources f77154b;

    /* JADX INFO: renamed from: c */
    public AssetManager f77155c;

    /* JADX INFO: renamed from: d */
    public final wq3 f77156d;

    /* JADX INFO: renamed from: e */
    public final shm f77157e;

    /* JADX INFO: renamed from: f */
    public final t4b0 f77158f;

    /* JADX INFO: renamed from: g */
    public final DownsampleMode f77159g;

    /* JADX INFO: renamed from: h */
    public final boolean f77160h;

    /* JADX INFO: renamed from: i */
    public final boolean f77161i;

    /* JADX INFO: renamed from: j */
    public final d7f f77162j;

    /* JADX INFO: renamed from: k */
    public final fj80 f77163k;

    /* JADX INFO: renamed from: l */
    public final a7h0<g4e> f77164l;

    /* JADX INFO: renamed from: m */
    public final mpy<by3, PooledByteBuffer> f77165m;

    /* JADX INFO: renamed from: n */
    public final mpy<by3, db5> f77166n;

    /* JADX INFO: renamed from: o */
    public final cy3 f77167o;

    /* JADX INFO: renamed from: p */
    public final ye3<by3> f77168p;

    /* JADX INFO: renamed from: q */
    public final ye3<by3> f77169q;

    /* JADX INFO: renamed from: r */
    public final xc80 f77170r;

    /* JADX INFO: renamed from: s */
    public final int f77171s;

    /* JADX INFO: renamed from: t */
    public final int f77172t;

    /* JADX INFO: renamed from: u */
    public boolean f77173u;

    /* JADX INFO: renamed from: v */
    public final gb5 f77174v;

    /* JADX INFO: renamed from: w */
    public final int f77175w;

    /* JADX INFO: renamed from: x */
    public final boolean f77176x;

    public bl90(Context context, wq3 wq3Var, shm shmVar, t4b0 t4b0Var, DownsampleMode downsampleMode, boolean z, boolean z2, d7f d7fVar, fj80 fj80Var, mpy<by3, db5> mpyVar, mpy<by3, PooledByteBuffer> mpyVar2, a7h0<g4e> a7h0Var, cy3 cy3Var, xc80 xc80Var, int i, int i2, boolean z3, int i3, gb5 gb5Var, boolean z4, int i4) {
        this.f77153a = context.getApplicationContext().getContentResolver();
        this.f77154b = context.getApplicationContext().getResources();
        this.f77155c = context.getApplicationContext().getAssets();
        this.f77156d = wq3Var;
        this.f77157e = shmVar;
        this.f77158f = t4b0Var;
        this.f77159g = downsampleMode;
        this.f77160h = z;
        this.f77161i = z2;
        this.f77162j = d7fVar;
        this.f77163k = fj80Var;
        this.f77166n = mpyVar;
        this.f77165m = mpyVar2;
        this.f77164l = a7h0Var;
        this.f77167o = cy3Var;
        this.f77170r = xc80Var;
        this.f77168p = new ye3<>(i4);
        this.f77169q = new ye3<>(i4);
        this.f77171s = i;
        this.f77172t = i2;
        this.f77173u = z3;
        this.f77175w = i3;
        this.f77174v = gb5Var;
        this.f77176x = z4;
    }

    /* JADX INFO: renamed from: a */
    public static t80 m104871a(wk90<n0f> wk90Var) {
        return new t80(wk90Var);
    }

    /* JADX INFO: renamed from: h */
    public static gf3 m104872h(wk90<n0f> wk90Var, wk90<n0f> wk90Var2) {
        return new gf3(wk90Var, wk90Var2);
    }

    /* JADX INFO: renamed from: A */
    public em80 m104873A(wk90<fb5<db5>> wk90Var) {
        return new em80(this.f77166n, this.f77167o, wk90Var);
    }

    /* JADX INFO: renamed from: B */
    public gm80 m104874B(wk90<fb5<db5>> wk90Var) {
        return new gm80(wk90Var, this.f77170r, this.f77162j.getBackgroundExecutor());
    }

    /* JADX INFO: renamed from: C */
    public pvb0 m104875C() {
        return new pvb0(this.f77162j.getIoBoundExecutor(), this.f77163k, this.f77153a);
    }

    /* JADX INFO: renamed from: D */
    public C1653d m104876D(wk90<n0f> wk90Var, boolean z, xkm xkmVar) {
        return new C1653d(this.f77162j.getBackgroundExecutor(), this.f77163k, wk90Var, z, xkmVar);
    }

    /* JADX INFO: renamed from: E */
    public <T> ffh0<T> m104877E(wk90<T> wk90Var) {
        return new ffh0<>(wk90Var);
    }

    /* JADX INFO: renamed from: F */
    public <T> syi0<T> m104878F(wk90<T> wk90Var) {
        return new syi0<>(5, this.f77162j.getLightWeightBackgroundExecutor(), wk90Var);
    }

    /* JADX INFO: renamed from: G */
    public zyi0 m104879G(azi0<n0f>[] azi0VarArr) {
        return new zyi0(azi0VarArr);
    }

    /* JADX INFO: renamed from: b */
    public <T> wk90<T> m104880b(wk90<T> wk90Var, oxi0 oxi0Var) {
        return new nxi0(wk90Var, oxi0Var);
    }

    /* JADX INFO: renamed from: c */
    public n23 m104881c(wk90<fb5<db5>> wk90Var) {
        return new n23(this.f77166n, this.f77167o, wk90Var);
    }

    /* JADX INFO: renamed from: d */
    public p23 m104882d(wk90<fb5<db5>> wk90Var) {
        return new p23(this.f77167o, wk90Var);
    }

    /* JADX INFO: renamed from: e */
    public q23 m104883e(wk90<fb5<db5>> wk90Var) {
        return new q23(this.f77166n, this.f77167o, wk90Var);
    }

    /* JADX INFO: renamed from: f */
    public z23 m104884f(wk90<fb5<db5>> wk90Var) {
        return new z23(wk90Var, this.f77171s, this.f77172t, this.f77173u);
    }

    /* JADX INFO: renamed from: g */
    public b33 m104885g(wk90<fb5<db5>> wk90Var) {
        return new b33(this.f77165m, this.f77164l, this.f77167o, this.f77168p, this.f77169q, wk90Var);
    }

    /* JADX INFO: renamed from: i */
    public s5c m104886i() {
        return new s5c(this.f77163k);
    }

    /* JADX INFO: renamed from: j */
    public C1650a m104887j(wk90<n0f> wk90Var) {
        return new C1650a(this.f77156d, this.f77162j.getDecodeExecutor(), this.f77157e, this.f77158f, this.f77159g, this.f77160h, this.f77161i, wk90Var, this.f77175w, this.f77174v, null, d7h0.f85513b);
    }

    /* JADX INFO: renamed from: k */
    public hud m104888k(wk90<fb5<db5>> wk90Var) {
        return new hud(wk90Var, this.f77162j.getBackgroundScheduledExecutorService());
    }

    /* JADX INFO: renamed from: l */
    public C1651b m104889l(wk90<n0f> wk90Var) {
        return new C1651b(this.f77164l, this.f77167o, wk90Var);
    }

    /* JADX INFO: renamed from: m */
    public C1652c m104890m(wk90<n0f> wk90Var) {
        return new C1652c(this.f77164l, this.f77167o, wk90Var);
    }

    /* JADX INFO: renamed from: n */
    public l0f m104891n(wk90<n0f> wk90Var) {
        return new l0f(this.f77167o, this.f77176x, wk90Var);
    }

    /* JADX INFO: renamed from: o */
    public wk90<n0f> m104892o(wk90<n0f> wk90Var) {
        return new q0f(this.f77165m, this.f77167o, wk90Var);
    }

    /* JADX INFO: renamed from: p */
    public r0f m104893p(wk90<n0f> wk90Var) {
        return new r0f(this.f77164l, this.f77167o, this.f77168p, this.f77169q, wk90Var);
    }

    /* JADX INFO: renamed from: q */
    public ytv m104894q() {
        return new ytv(this.f77162j.getIoBoundExecutor(), this.f77163k, this.f77155c);
    }

    /* JADX INFO: renamed from: r */
    public auv m104895r() {
        return new auv(this.f77162j.getIoBoundExecutor(), this.f77163k, this.f77153a);
    }

    /* JADX INFO: renamed from: s */
    public buv m104896s() {
        return new buv(this.f77162j.getIoBoundExecutor(), this.f77163k, this.f77153a);
    }

    /* JADX INFO: renamed from: t */
    public LocalExifThumbnailProducer m104897t() {
        return new LocalExifThumbnailProducer(this.f77162j.mo114730d(), this.f77163k, this.f77153a);
    }

    /* JADX INFO: renamed from: u */
    public ovv m104898u() {
        return new ovv(this.f77162j.getIoBoundExecutor(), this.f77163k);
    }

    /* JADX INFO: renamed from: v */
    public wwv m104899v() {
        return new wwv(this.f77162j.getIoBoundExecutor(), this.f77163k, this.f77154b);
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: w */
    public axv m104900w() {
        return new axv(this.f77162j.getBackgroundExecutor(), this.f77153a);
    }

    /* JADX INFO: renamed from: x */
    public exv m104901x() {
        return new exv(this.f77162j.getIoBoundExecutor(), this.f77153a);
    }

    /* JADX INFO: renamed from: y */
    public wk90<n0f> m104902y(vj20 vj20Var) {
        return new uj20(this.f77163k, this.f77156d, vj20Var);
    }

    /* JADX INFO: renamed from: z */
    public rg60 m104903z(wk90<n0f> wk90Var) {
        return new rg60(this.f77164l, this.f77167o, this.f77163k, this.f77156d, wk90Var);
    }
}
