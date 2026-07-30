package p149l;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes.dex */
public class a23 implements sc90<fa5<da5>> {

    /* JADX INFO: renamed from: a */
    public final pgy<cx3, da5> f67219a;

    /* JADX INFO: renamed from: b */
    public final dx3 f67220b;

    /* JADX INFO: renamed from: c */
    public final sc90<fa5<da5>> f67221c;

    /* JADX INFO: renamed from: l.a23$a */
    public class C15514a extends btd<fa5<da5>, fa5<da5>> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ cx3 f67222c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f67223d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15514a(uz5 uz5Var, cx3 cx3Var, boolean z) {
            super(uz5Var);
            this.f67222c = cx3Var;
            this.f67223d = z;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo8523h(fa5<da5> fa5Var, int i) {
            fa5<da5> fa5Var2;
            try {
                if (o6j.m162852d()) {
                    o6j.m162850a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zM107028d = ci2.m107028d(i);
                if (fa5Var == null) {
                    if (zM107028d) {
                        m103812o().mo107035b(null, i);
                    }
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                        return;
                    }
                    return;
                }
                if (!fa5Var.m120155B().mo110566f0() && !ci2.m107032m(i, 8)) {
                    if (!zM107028d && (fa5Var2 = a23.this.f67219a.get(this.f67222c)) != null) {
                        try {
                            mnb0 mnb0VarMo110565X = fa5Var.m120155B().mo110565X();
                            mnb0 mnb0VarMo110565X2 = fa5Var2.m120155B().mo110565X();
                            if (mnb0VarMo110565X2.mo155503a() || mnb0VarMo110565X2.mo155505c() >= mnb0VarMo110565X.mo155505c()) {
                                m103812o().mo107035b(fa5Var2, i);
                                fa5.m120154v(fa5Var2);
                                if (o6j.m162852d()) {
                                    o6j.m162851b();
                                    return;
                                }
                                return;
                            }
                            fa5.m120154v(fa5Var2);
                        } catch (Throwable th) {
                            fa5.m120154v(fa5Var2);
                            throw th;
                        }
                    }
                    fa5<da5> fa5VarMo101592b = this.f67223d ? a23.this.f67219a.mo101592b(this.f67222c, fa5Var) : null;
                    if (zM107028d) {
                        try {
                            m103812o().mo107036c(1.0f);
                        } catch (Throwable th2) {
                            fa5.m120154v(fa5VarMo101592b);
                            throw th2;
                        }
                    }
                    uz5<fa5<da5>> uz5VarM103812o = m103812o();
                    if (fa5VarMo101592b != null) {
                        fa5Var = fa5VarMo101592b;
                    }
                    uz5VarM103812o.mo107035b(fa5Var, i);
                    fa5.m120154v(fa5VarMo101592b);
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                        return;
                    }
                    return;
                }
                m103812o().mo107035b(fa5Var, i);
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
            } catch (Throwable th3) {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
                throw th3;
            }
        }
    }

    public a23(pgy<cx3, da5> pgyVar, dx3 dx3Var, sc90<fa5<da5>> sc90Var) {
        this.f67219a = pgyVar;
        this.f67220b = dx3Var;
        this.f67221c = sc90Var;
    }

    /* JADX INFO: renamed from: f */
    public static void m94587f(xvk xvkVar, uc90 uc90Var) {
        uc90Var.mo155862d(xvkVar.getExtras());
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<fa5<da5>> uz5Var, uc90 uc90Var) {
        boolean zM162852d;
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("BitmapMemoryCacheProducer#produceResults");
            }
            yc90 yc90VarMo155870n = uc90Var.mo155870n();
            yc90VarMo155870n.mo104754d(uc90Var, mo94589e());
            cx3 cx3VarMo113969c = this.f67220b.mo113969c(uc90Var.mo155873t(), uc90Var.mo155867k());
            fa5<da5> fa5Var = uc90Var.mo155873t().m8587z(1) ? this.f67219a.get(cx3VarMo113969c) : null;
            if (fa5Var != null) {
                m94587f(fa5Var.m120155B(), uc90Var);
                boolean zMo155503a = fa5Var.m120155B().mo110565X().mo155503a();
                if (zMo155503a) {
                    yc90VarMo155870n.mo104756f(uc90Var, mo94589e(), yc90VarMo155870n.mo104759k(uc90Var, mo94589e()) ? ImmutableMap.m8148of("cached_value_found", "true") : null);
                    yc90VarMo155870n.mo104755e(uc90Var, mo94589e(), true);
                    uc90Var.mo155874u("memory_bitmap", mo94588d());
                    uz5Var.mo107036c(1.0f);
                }
                uz5Var.mo107035b(fa5Var, ci2.m107030k(zMo155503a));
                fa5Var.close();
                if (zMo155503a) {
                    if (zM162852d) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (uc90Var.mo155860I().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                yc90VarMo155870n.mo104756f(uc90Var, mo94589e(), yc90VarMo155870n.mo104759k(uc90Var, mo94589e()) ? ImmutableMap.m8148of("cached_value_found", "false") : null);
                yc90VarMo155870n.mo104755e(uc90Var, mo94589e(), false);
                uc90Var.mo155874u("memory_bitmap", mo94588d());
                uz5Var.mo107035b(null, 1);
                if (zM162852d) {
                    return;
                } else {
                    return;
                }
            }
            uz5<fa5<da5>> uz5VarMo94590g = mo94590g(uz5Var, cx3VarMo113969c, uc90Var.mo155873t().m8587z(2));
            yc90VarMo155870n.mo104756f(uc90Var, mo94589e(), yc90VarMo155870n.mo104759k(uc90Var, mo94589e()) ? ImmutableMap.m8148of("cached_value_found", "false") : null);
            if (o6j.m162852d()) {
                o6j.m162850a("mInputProducer.produceResult");
            }
            this.f67221c.mo8485b(uz5VarMo94590g, uc90Var);
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        } finally {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String mo94588d() {
        return "pipe_bg";
    }

    /* JADX INFO: renamed from: e */
    public String mo94589e() {
        return "BitmapMemoryCacheProducer";
    }

    /* JADX INFO: renamed from: g */
    public uz5<fa5<da5>> mo94590g(uz5<fa5<da5>> uz5Var, cx3 cx3Var, boolean z) {
        return new C15514a(uz5Var, cx3Var, z);
    }
}
