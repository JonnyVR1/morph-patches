package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.config.core.FepConfigManager;
import com.hellogroup.fep.config.model.FepConfigFetchType;
import com.hellogroup.fep.grey.internal.FepGreyContext;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.engine.type.WarningCode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m88121d2 = {"Ll/hgi;", "", "<init>", "()V", "", "c", "", "debugMode", "Ll/jgi;", "greyProvider", "g", "(ZLl/jgi;)V", "", "url", "Ll/ngi;", LovePlanetStage.result, "e", "(Ljava/lang/String;Ll/ngi;)Ljava/lang/String;", "", "localVer", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/Long;)Ll/ngi;", "Ll/igi;", "observer", "f", "(Ll/igi;)V", "Companion", "a", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class hgi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    private static volatile hgi f109410a;

    /* JADX INFO: renamed from: l.hgi$b */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/hgi$b", "Ll/dgi;", "Lcom/hellogroup/fep/config/core/FepConfigManager;", "manager", "", "isLocalData", "Lcom/hellogroup/fep/config/model/FepConfigFetchType;", "type", "", "b", "(Lcom/hellogroup/fep/config/core/FepConfigManager;ZLcom/hellogroup/fep/config/model/FepConfigFetchType;)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C17452b extends dgi {
        @Override // p153l.dgi, p153l.bgi
        /* JADX INFO: renamed from: b */
        public void mo17604b(@NotNull FepConfigManager manager, boolean isLocalData, @NotNull FepConfigFetchType type) {
            manager.getClass();
            type.getClass();
            FepGreyContext.INSTANCE.m17748e().m158333a();
        }
    }

    private hgi() {
    }

    /* JADX INFO: renamed from: c */
    private final void m134940c() {
        FepGreyContext fepGreyContext = FepGreyContext.INSTANCE;
        if (fepGreyContext.m17750g().get()) {
            return;
        }
        pgi.m172234d(fepGreyContext.m17746c(), WarningCode.WARNING_CODE_PUBLISH_STREAM_FAILED, "Called before setup", null, null, 12, null);
        if (fepGreyContext.m17744a()) {
            wtq0.m207906a("FepGreyManager not setup, call setup() first");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ngi m134941d(@NotNull String url, @Nullable Long localVer) {
        url.getClass();
        m134940c();
        return kgi.m149747b(FepGreyContext.INSTANCE.m17749f(), url, localVer, false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m134942e(@NotNull String url, @Nullable ngi result) {
        lgi greyRule;
        url.getClass();
        return (result == null || (greyRule = result.getGreyRule()) == null || !result.m162970e()) ? url : FepGreyContext.INSTANCE.m17749f().m149754d(url, greyRule);
    }

    /* JADX INFO: renamed from: f */
    public final void m134943f(@NotNull igi observer) {
        observer.getClass();
        FepGreyContext.INSTANCE.m17747d().m191605a(observer);
    }

    /* JADX INFO: renamed from: g */
    public final void m134944g(boolean debugMode, @NotNull jgi greyProvider) {
        greyProvider.getClass();
        FepGreyContext fepGreyContext = FepGreyContext.INSTANCE;
        if (fepGreyContext.m17750g().get()) {
            pgi.m172239k(fepGreyContext.m17746c(), "already setup, will ignore repeat setup", null, 0, null, 14, null);
            return;
        }
        fepGreyContext.m17751h(debugMode);
        fepGreyContext.m17752i(greyProvider);
        FepConfigManager.INSTANCE.m17633a().m17630o(new C17452b());
        fepGreyContext.m17750g().set(true);
    }

    /* JADX INFO: renamed from: l.hgi$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/hgi$a;", "", "<init>", "()V", "Ll/hgi;", "a", "()Ll/hgi;", "instance", "Ll/hgi;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final hgi m134945a() {
            hgi hgiVar;
            hgi hgiVar2 = hgi.f109410a;
            if (hgiVar2 != null) {
                return hgiVar2;
            }
            synchronized (this) {
                hgiVar = hgi.f109410a;
                if (hgiVar == null) {
                    hgiVar = new hgi(null);
                    hgi.f109410a = hgiVar;
                }
            }
            return hgiVar;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ hgi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
