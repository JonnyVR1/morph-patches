package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.tarot.C0353a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.TarotData;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/oci0;", "", "<init>", "()V", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class oci0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m20526a(@NotNull Act act) {
        INSTANCE.m20529c(act);
    }

    /* JADX INFO: renamed from: l.oci0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Ll/oci0$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "c", "(Lcom/p1/mobile/android/app/Act;)V", "a", "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", "d", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m20527a(@NotNull Act act) {
            act.getClass();
            new mci0(act).m19220o();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m20528b(@NotNull Act act, @NotNull TarotData tarotInfo) {
            act.getClass();
            tarotInfo.getClass();
            new bdi0(act).m12600b(tarotInfo);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final void m20529c(@NotNull Act act) {
            act.getClass();
            if (CoreModule.f1534c.f3683w1.getCardType() == -1) {
                hei0.INSTANCE.m16206g(act, true);
                return;
            }
            TarotData tarotData = CoreModule.f1534c.f3683w1.m20361k3().data;
            tarotData.getClass();
            new vci0(act, tarotData).m25803r();
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m20530d(@NotNull Act act, @NotNull TarotData tarotInfo) {
            act.getClass();
            tarotInfo.getClass();
            new C0353a(act, tarotInfo).m9310R();
        }

        public Companion() {
        }
    }
}
