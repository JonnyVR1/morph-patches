package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/txp;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class txp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.txp$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/txp$a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Z", "", "userId", "Lrx/c;", "c", "(Ljava/lang/String;)Lrx/c;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Boolean m193524a(Function1 function1, Object obj) {
            return (Boolean) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: b */
        public static Boolean m193525b(BLiveEnvelope bLiveEnvelope) {
            bLiveEnvelope.getClass();
            return Boolean.valueOf(bLiveEnvelope.data.anchorGuildCheck.isGuildAnchor);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C22421c<Boolean> m193526c(@NotNull String userId) {
            userId.getClass();
            rnl rnlVarM182301d = rnl.m182263l(zvr.m221801a(userId + "/guild-check")).m182288p().m182301d();
            StringBuilder sb = new StringBuilder("checkUserIsGuildAnchor");
            sb.append(userId);
            C22421c<BLiveEnvelope> c22421cBuildLiveReadReq = LiveExternalApi.buildLiveReadReq(rnlVarM182301d, sb.toString());
            final Function1 function1 = new Function1() { // from class: l.rxp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return txp.Companion.m193525b((BLiveEnvelope) obj);
                }
            };
            C22421c map = c22421cBuildLiveReadReq.map(new qcj() { // from class: l.sxp
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return txp.Companion.m193524a(function1, obj);
                }
            });
            map.getClass();
            return map;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m193527d() {
            return vxr.m203876d().m170984K0();
        }

        public Companion() {
        }
    }
}
