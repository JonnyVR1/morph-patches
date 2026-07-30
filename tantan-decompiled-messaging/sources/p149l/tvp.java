package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/tvp;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class tvp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.tvp$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/tvp$a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Z", "", "userId", "Lrx/c;", "c", "(Ljava/lang/String;)Lrx/c;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static Boolean m190771a(Function1 function1, Object obj) {
            return (Boolean) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: b */
        public static Boolean m190772b(BLiveEnvelope bLiveEnvelope) {
            bLiveEnvelope.getClass();
            return Boolean.valueOf(bLiveEnvelope.data.anchorGuildCheck.isGuildAnchor);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C22306c<Boolean> m190773c(@NotNull String userId) {
            userId.getClass();
            cll cllVarM107537d = cll.m107499l(ytr.m216072a(userId + "/guild-check")).m107524p().m107537d();
            StringBuilder sb = new StringBuilder("checkUserIsGuildAnchor");
            sb.append(userId);
            C22306c<BLiveEnvelope> c22306cBuildLiveReadReq = LiveExternalApi.buildLiveReadReq(cllVarM107537d, sb.toString());
            final Function1 function1 = new Function1() { // from class: l.rvp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return tvp.Companion.m190772b((BLiveEnvelope) obj);
                }
            };
            C22306c map = c22306cBuildLiveReadReq.map(new w9j() { // from class: l.svp
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return tvp.Companion.m190771a(function1, obj);
                }
            });
            map.getClass();
            return map;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m190774d() {
            return uvr.m196087d().m162677K0();
        }

        public Companion() {
        }
    }
}
