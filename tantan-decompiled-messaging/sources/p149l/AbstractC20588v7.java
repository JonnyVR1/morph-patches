package p149l;

import androidx.core.app.NotificationCompat;
import com.facebook.datasource.AbstractDataSource;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.v7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m87232d2 = {"Ll/v7;", j6f.GPS_DIRECTION_TRUE, "Lcom/facebook/datasource/AbstractDataSource;", "", "Ll/sc90;", "producer", "Ll/xme0;", "settableProducerContext", "Ll/huc0;", "requestListener", "<init>", "(Ll/sc90;Ll/xme0;Ll/huc0;)V", LovePlanetStage.result, "", NotificationCompat.CATEGORY_STATUS, "Ll/uc90;", "producerContext", "", "F", "(Ljava/lang/Object;ILl/uc90;)V", "", "", "B", "(Ll/uc90;)Ljava/util/Map;", "", "close", "()Z", "Ll/uz5;", "A", "()Ll/uz5;", "", "throwable", "E", "(Ljava/lang/Throwable;)V", "D", "()V", "h", "Ll/xme0;", b2s.C_ZONE, "()Ll/xme0;", RXScreenCaptureService.KEY_INDEX, "Ll/huc0;", "getRequestListener", "()Ll/huc0;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class AbstractC20588v7<T> extends AbstractDataSource<T> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final xme0 settableProducerContext;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final huc0 requestListener;

    /* JADX INFO: renamed from: l.v7$a */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"l/v7$a", "Ll/ci2;", "newResult", "", NotificationCompat.CATEGORY_STATUS, "", "h", "(Ljava/lang/Object;I)V", "", "throwable", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "", "progress", RXScreenCaptureService.KEY_INDEX, "(F)V", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class a extends ci2<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC20588v7<T> f180249b;

        public a(AbstractC20588v7<T> abstractC20588v7) {
            this.f180249b = abstractC20588v7;
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: f */
        public void mo8521f() {
            this.f180249b.m197289D();
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: g */
        public void mo8522g(Throwable throwable) {
            throwable.getClass();
            this.f180249b.m197290E(throwable);
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: h */
        public void mo8523h(T newResult, int status) {
            AbstractC20588v7<T> abstractC20588v7 = this.f180249b;
            abstractC20588v7.mo115410F(newResult, status, abstractC20588v7.getSettableProducerContext());
        }

        @Override // p149l.ci2
        /* JADX INFO: renamed from: i */
        public void mo8524i(float progress) {
            this.f180249b.m8194r(progress);
        }
    }

    public AbstractC20588v7(@NotNull sc90<T> sc90Var, @NotNull xme0 xme0Var, @NotNull huc0 huc0Var) {
        sc90Var.getClass();
        xme0Var.getClass();
        huc0Var.getClass();
        this.settableProducerContext = xme0Var;
        this.requestListener = huc0Var;
        if (!o6j.m162852d()) {
            m8190n(xme0Var.getExtras());
            if (o6j.m162852d()) {
                o6j.m162850a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    huc0Var.mo104625b(xme0Var);
                    Unit unit = Unit.INSTANCE;
                    o6j.m162851b();
                } catch (Throwable th) {
                    o6j.m162851b();
                    throw th;
                }
            } else {
                huc0Var.mo104625b(xme0Var);
            }
            if (!o6j.m162852d()) {
                sc90Var.mo8485b(m197286A(), xme0Var);
                return;
            }
            o6j.m162850a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                sc90Var.mo8485b(m197286A(), xme0Var);
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
                o6j.m162851b();
            }
        }
        o6j.m162850a("AbstractProducerToDataSourceAdapter()");
        try {
            m8190n(xme0Var.getExtras());
            if (o6j.m162852d()) {
                o6j.m162850a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    huc0Var.mo104625b(xme0Var);
                    Unit unit3 = Unit.INSTANCE;
                    o6j.m162851b();
                } catch (Throwable th2) {
                    o6j.m162851b();
                    throw th2;
                }
            } else {
                huc0Var.mo104625b(xme0Var);
            }
            if (o6j.m162852d()) {
                o6j.m162850a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    sc90Var.mo8485b(m197286A(), xme0Var);
                    Unit unit4 = Unit.INSTANCE;
                    o6j.m162851b();
                } finally {
                    o6j.m162851b();
                }
            } else {
                sc90Var.mo8485b(m197286A(), xme0Var);
            }
            Unit unit5 = Unit.INSTANCE;
        } catch (Throwable th3) {
            o6j.m162851b();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: A */
    public final uz5<T> m197286A() {
        return new a(this);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final Map<String, Object> m197287B(@NotNull uc90 producerContext) {
        producerContext.getClass();
        return producerContext.getExtras();
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final xme0 getSettableProducerContext() {
        return this.settableProducerContext;
    }

    /* JADX INFO: renamed from: D */
    public final synchronized void m197289D() {
        rf80.m179118i(m8186j());
    }

    /* JADX INFO: renamed from: E */
    public final void m197290E(Throwable throwable) {
        if (super.m8192p(throwable, m197287B(this.settableProducerContext))) {
            this.requestListener.mo104627g(this.settableProducerContext, throwable);
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo115410F(@Nullable T result, int status, @NotNull uc90 producerContext) {
        producerContext.getClass();
        boolean zM107028d = ci2.m107028d(status);
        if (super.mo8197u(result, zM107028d, m197287B(producerContext)) && zM107028d) {
            this.requestListener.mo104626c(this.settableProducerContext);
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.mo8182e()) {
            return true;
        }
        this.requestListener.mo104628h(this.settableProducerContext);
        this.settableProducerContext.m155864h();
        return true;
    }
}
