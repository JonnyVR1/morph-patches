package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.TarotData;
import com.p051p1.mobile.putong.core.p058ui.tarot.C9080a;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/oli0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class oli0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m168122a(@NotNull Act act) {
        INSTANCE.m168125c(act);
    }

    /* JADX INFO: renamed from: l.oli0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/oli0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "c", "(Lcom/p1/mobile/android/app/Act;)V", "a", "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", Constants.INAPP_DATA_TAG, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m168123a(@NotNull Act act) {
            act.getClass();
            new mli0(act).m158894o();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m168124b(@NotNull Act act, @NotNull TarotData tarotInfo) {
            act.getClass();
            tarotInfo.getClass();
            new bmi0(act).m105062b(tarotInfo);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m168125c(@NotNull Act act) {
            act.getClass();
            if (CoreModule.f18264c.f20436w1.getCardType() == -1) {
                hni0.INSTANCE.m136124g(act, true);
                return;
            }
            TarotData tarotData = CoreModule.f18264c.f20436w1.m102950k3().data;
            tarotData.getClass();
            new vli0(act, tarotData).m201641r();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m168126d(@NotNull Act act, @NotNull TarotData tarotInfo) {
            act.getClass();
            tarotInfo.getClass();
            new C9080a(act, tarotInfo).m57091R();
        }

        public Companion() {
        }
    }
}
