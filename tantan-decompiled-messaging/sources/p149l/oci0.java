package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.TarotData;
import com.p046p1.mobile.putong.core.p053ui.tarot.C8917a;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/oci0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class oci0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m163519a(@NotNull Act act) {
        INSTANCE.m163522c(act);
    }

    /* JADX INFO: renamed from: l.oci0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/oci0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "c", "(Lcom/p1/mobile/android/app/Act;)V", "a", "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", Constants.INAPP_DATA_TAG, "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m163520a(@NotNull Act act) {
            act.getClass();
            new mci0(act).m154015o();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m163521b(@NotNull Act act, @NotNull TarotData tarotInfo) {
            act.getClass();
            tarotInfo.getClass();
            new bdi0(act).m101178b(tarotInfo);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m163522c(@NotNull Act act) {
            act.getClass();
            if (CoreModule.f17545c.f19694w1.getCardType() == -1) {
                hei0.INSTANCE.m130644g(act, true);
                return;
            }
            TarotData tarotData = CoreModule.f17545c.f19694w1.m162841k3().data;
            tarotData.getClass();
            new vci0(act, tarotData).m197786r();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m163523d(@NotNull Act act, @NotNull TarotData tarotInfo) {
            act.getClass();
            tarotInfo.getClass();
            new C8917a(act, tarotInfo).m55908R();
        }

        public Companion() {
        }
    }
}
