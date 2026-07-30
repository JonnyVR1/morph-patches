package p153l;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class q23 implements wk90<fb5<db5>> {

    /* JADX INFO: renamed from: a */
    public final mpy<by3, db5> f155268a;

    /* JADX INFO: renamed from: b */
    public final cy3 f155269b;

    /* JADX INFO: renamed from: c */
    public final wk90<fb5<db5>> f155270c;

    /* JADX INFO: renamed from: l.q23$a */
    public class C19504a extends pud<fb5<db5>, fb5<db5>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ by3 f155271c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f155272d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19504a(z06 z06Var, by3 by3Var, boolean z) {
            super(z06Var);
            this.f155271c = by3Var;
            this.f155272d = z;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8577h(fb5<db5> fb5Var, int i) {
            fb5<db5> fb5Var2;
            try {
                if (i9j.m139099d()) {
                    i9j.m139097a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zM144947d = ji2.m144947d(i);
                if (fb5Var == null) {
                    if (zM144947d) {
                        m173861o().mo144954b(null, i);
                    }
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                        return;
                    }
                    return;
                }
                if (!fb5Var.m124875B().mo97951g0() && !ji2.m144951m(i, 8)) {
                    if (!zM144947d && (fb5Var2 = q23.this.f155268a.get(this.f155271c)) != null) {
                        try {
                            qvb0 qvb0VarMo97948Y = fb5Var.m124875B().mo97948Y();
                            qvb0 qvb0VarMo97948Y2 = fb5Var2.m124875B().mo97948Y();
                            if (qvb0VarMo97948Y2.mo99002a() || qvb0VarMo97948Y2.mo99004c() >= qvb0VarMo97948Y.mo99004c()) {
                                m173861o().mo144954b(fb5Var2, i);
                                fb5.m124874v(fb5Var2);
                                if (i9j.m139099d()) {
                                    i9j.m139098b();
                                    return;
                                }
                                return;
                            }
                            fb5.m124874v(fb5Var2);
                        } catch (Throwable th) {
                            fb5.m124874v(fb5Var2);
                            throw th;
                        }
                    }
                    fb5<db5> fb5VarMo137756b = this.f155272d ? q23.this.f155268a.mo137756b(this.f155271c, fb5Var) : null;
                    if (zM144947d) {
                        try {
                            m173861o().mo144955c(1.0f);
                        } catch (Throwable th2) {
                            fb5.m124874v(fb5VarMo137756b);
                            throw th2;
                        }
                    }
                    z06<fb5<db5>> z06VarM173861o = m173861o();
                    if (fb5VarMo137756b != null) {
                        fb5Var = fb5VarMo137756b;
                    }
                    z06VarM173861o.mo144954b(fb5Var, i);
                    fb5.m124874v(fb5VarMo137756b);
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                        return;
                    }
                    return;
                }
                m173861o().mo144954b(fb5Var, i);
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
            } catch (Throwable th3) {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
                throw th3;
            }
        }
    }

    public q23(mpy<by3, db5> mpyVar, cy3 cy3Var, wk90<fb5<db5>> wk90Var) {
        this.f155268a = mpyVar;
        this.f155269b = cy3Var;
        this.f155270c = wk90Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m174988f(nyk nykVar, yk90 yk90Var) {
        yk90Var.mo97950d(nykVar.getExtras());
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<fb5<db5>> z06Var, yk90 yk90Var) {
        boolean zM139099d;
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("BitmapMemoryCacheProducer#produceResults");
            }
            cl90 cl90VarMo117675n = yk90Var.mo117675n();
            cl90VarMo117675n.mo110444d(yk90Var, mo161153e());
            by3 by3VarMo113094c = this.f155269b.mo113094c(yk90Var.mo117678t(), yk90Var.mo117672k());
            fb5<db5> fb5Var = yk90Var.mo117678t().m8641z(1) ? this.f155268a.get(by3VarMo113094c) : null;
            if (fb5Var != null) {
                m174988f(fb5Var.m124875B(), yk90Var);
                boolean zMo99002a = fb5Var.m124875B().mo97948Y().mo99002a();
                if (zMo99002a) {
                    cl90VarMo117675n.mo110446f(yk90Var, mo161153e(), cl90VarMo117675n.mo110449k(yk90Var, mo161153e()) ? ImmutableMap.m8202of("cached_value_found", "true") : null);
                    cl90VarMo117675n.mo110445e(yk90Var, mo161153e(), true);
                    yk90Var.mo117679u("memory_bitmap", mo161152d());
                    z06Var.mo144955c(1.0f);
                }
                z06Var.mo144954b(fb5Var, ji2.m144949k(zMo99002a));
                fb5Var.close();
                if (zMo99002a) {
                    if (zM139099d) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (yk90Var.mo117667I().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                cl90VarMo117675n.mo110446f(yk90Var, mo161153e(), cl90VarMo117675n.mo110449k(yk90Var, mo161153e()) ? ImmutableMap.m8202of("cached_value_found", "false") : null);
                cl90VarMo117675n.mo110445e(yk90Var, mo161153e(), false);
                yk90Var.mo117679u("memory_bitmap", mo161152d());
                z06Var.mo144954b(null, 1);
                if (zM139099d) {
                    return;
                } else {
                    return;
                }
            }
            z06<fb5<db5>> z06VarMo161154g = mo161154g(z06Var, by3VarMo113094c, yk90Var.mo117678t().m8641z(2));
            cl90VarMo117675n.mo110446f(yk90Var, mo161153e(), cl90VarMo117675n.mo110449k(yk90Var, mo161153e()) ? ImmutableMap.m8202of("cached_value_found", "false") : null);
            if (i9j.m139099d()) {
                i9j.m139097a("mInputProducer.produceResult");
            }
            this.f155270c.mo8539b(z06VarMo161154g, yk90Var);
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        } finally {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String mo161152d() {
        return "pipe_bg";
    }

    /* JADX INFO: renamed from: e */
    public String mo161153e() {
        return "BitmapMemoryCacheProducer";
    }

    /* JADX INFO: renamed from: g */
    public z06<fb5<db5>> mo161154g(z06<fb5<db5>> z06Var, by3 by3Var, boolean z) {
        return new C19504a(z06Var, by3Var, z);
    }
}
