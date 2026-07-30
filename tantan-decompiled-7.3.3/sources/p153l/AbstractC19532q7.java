package p153l;

import androidx.core.app.NotificationCompat;
import com.facebook.datasource.AbstractDataSource;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.q7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000e\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m88121d2 = {"Ll/q7;", p7f.GPS_DIRECTION_TRUE, "Lcom/facebook/datasource/AbstractDataSource;", "", "Ll/wk90;", "producer", "Ll/eve0;", "settableProducerContext", "Ll/k2d0;", "requestListener", "<init>", "(Ll/wk90;Ll/eve0;Ll/k2d0;)V", LovePlanetStage.result, "", NotificationCompat.CATEGORY_STATUS, "Ll/yk90;", "producerContext", "", "F", "(Ljava/lang/Object;ILl/yk90;)V", "", "", "B", "(Ll/yk90;)Ljava/util/Map;", "", "close", "()Z", "Ll/z06;", "A", "()Ll/z06;", "", "throwable", "E", "(Ljava/lang/Throwable;)V", "D", "()V", "h", "Ll/eve0;", c4s.C_ZONE, "()Ll/eve0;", RXScreenCaptureService.KEY_INDEX, "Ll/k2d0;", "getRequestListener", "()Ll/k2d0;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class AbstractC19532q7<T> extends AbstractDataSource<T> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final eve0 settableProducerContext;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final k2d0 requestListener;

    /* JADX INFO: renamed from: l.q7$a */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"l/q7$a", "Ll/ji2;", "newResult", "", NotificationCompat.CATEGORY_STATUS, "", "h", "(Ljava/lang/Object;I)V", "", "throwable", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "", "progress", RXScreenCaptureService.KEY_INDEX, "(F)V", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class a extends ji2<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC19532q7<T> f155930b;

        public a(AbstractC19532q7<T> abstractC19532q7) {
            this.f155930b = abstractC19532q7;
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: f */
        public void mo8575f() {
            this.f155930b.m175629D();
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: g */
        public void mo8576g(Throwable throwable) {
            throwable.getClass();
            this.f155930b.m175630E(throwable);
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: h */
        public void mo8577h(T newResult, int status) {
            AbstractC19532q7<T> abstractC19532q7 = this.f155930b;
            abstractC19532q7.mo120152F(newResult, status, abstractC19532q7.getSettableProducerContext());
        }

        @Override // p153l.ji2
        /* JADX INFO: renamed from: i */
        public void mo8578i(float progress) {
            this.f155930b.m8248r(progress);
        }
    }

    public AbstractC19532q7(@NotNull wk90<T> wk90Var, @NotNull eve0 eve0Var, @NotNull k2d0 k2d0Var) {
        wk90Var.getClass();
        eve0Var.getClass();
        k2d0Var.getClass();
        this.settableProducerContext = eve0Var;
        this.requestListener = k2d0Var;
        if (!i9j.m139099d()) {
            m8244n(eve0Var.getExtras());
            if (i9j.m139099d()) {
                i9j.m139097a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    k2d0Var.mo101485b(eve0Var);
                    Unit unit = Unit.INSTANCE;
                    i9j.m139098b();
                } catch (Throwable th) {
                    i9j.m139098b();
                    throw th;
                }
            } else {
                k2d0Var.mo101485b(eve0Var);
            }
            if (!i9j.m139099d()) {
                wk90Var.mo8539b(m175626A(), eve0Var);
                return;
            }
            i9j.m139097a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                wk90Var.mo8539b(m175626A(), eve0Var);
                Unit unit2 = Unit.INSTANCE;
                return;
            } finally {
                i9j.m139098b();
            }
        }
        i9j.m139097a("AbstractProducerToDataSourceAdapter()");
        try {
            m8244n(eve0Var.getExtras());
            if (i9j.m139099d()) {
                i9j.m139097a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    k2d0Var.mo101485b(eve0Var);
                    Unit unit3 = Unit.INSTANCE;
                    i9j.m139098b();
                } catch (Throwable th2) {
                    i9j.m139098b();
                    throw th2;
                }
            } else {
                k2d0Var.mo101485b(eve0Var);
            }
            if (i9j.m139099d()) {
                i9j.m139097a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    wk90Var.mo8539b(m175626A(), eve0Var);
                    Unit unit4 = Unit.INSTANCE;
                    i9j.m139098b();
                } finally {
                    i9j.m139098b();
                }
            } else {
                wk90Var.mo8539b(m175626A(), eve0Var);
            }
            Unit unit5 = Unit.INSTANCE;
        } catch (Throwable th3) {
            i9j.m139098b();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: A */
    public final z06<T> m175626A() {
        return new a(this);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final Map<String, Object> m175627B(@NotNull yk90 producerContext) {
        producerContext.getClass();
        return producerContext.getExtras();
    }

    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public final eve0 getSettableProducerContext() {
        return this.settableProducerContext;
    }

    /* JADX INFO: renamed from: D */
    public final synchronized void m175629D() {
        wn80.m207184i(m8240j());
    }

    /* JADX INFO: renamed from: E */
    public final void m175630E(Throwable throwable) {
        if (super.m8246p(throwable, m175627B(this.settableProducerContext))) {
            this.requestListener.mo101487g(this.settableProducerContext, throwable);
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo120152F(@Nullable T result, int status, @NotNull yk90 producerContext) {
        producerContext.getClass();
        boolean zM144947d = ji2.m144947d(status);
        if (super.mo8251u(result, zM144947d, m175627B(producerContext)) && zM144947d) {
            this.requestListener.mo101486c(this.settableProducerContext);
        }
    }

    @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.mo8236e()) {
            return true;
        }
        this.requestListener.mo101488h(this.settableProducerContext);
        this.settableProducerContext.m117669h();
        return true;
    }
}
