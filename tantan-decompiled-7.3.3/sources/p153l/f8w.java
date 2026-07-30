package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.BonusThreshold;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.Target;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/f8w;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Landroid/view/View;", Target.TYPE, "", "tag", "", "f", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V", "bonusId", NotificationCompat.CATEGORY_STATUS, "e", "(Ljava/lang/String;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "", "mm", "convId", "c", "(ILjava/lang/String;)V", "type", "b", "(Ljava/lang/String;)V", "", "g", "()Z", "a", "(Ljava/lang/String;)Z", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class f8w {

    @NotNull
    public static final f8w INSTANCE = new f8w();

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX INFO: renamed from: a */
    public final boolean m124565a(@NotNull String type) {
        int i;
        type.getClass();
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1019560155) {
                if (iHashCode != 1332422126) {
                    if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                        i = loveBuzzDataM134315v0.remainingMemojiBuzz;
                    } else {
                        i = loveBuzzDataM134315v0.remainingTextBuzz;
                    }
                } else if (type.equals("videoBuzz")) {
                    i = loveBuzzDataM134315v0.remainingVideoBuzz;
                } else {
                    i = loveBuzzDataM134315v0.remainingTextBuzz;
                }
            } else if (type.equals("voiceBuzz")) {
                i = loveBuzzDataM134315v0.remainingVoiceBuzz;
            } else {
                i = loveBuzzDataM134315v0.remainingTextBuzz;
            }
            if (i != -1 && loveBuzzDataM134315v0.bonusEnabledBuzz.contains(type)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX INFO: renamed from: b */
    public final void m124566b(@NotNull String type) {
        Integer numValueOf;
        BonusThreshold bonusThreshold;
        BonusThreshold bonusThreshold2;
        BonusThreshold bonusThreshold3;
        type.getClass();
        haw.Companion companion = haw.INSTANCE;
        eqx eqxVarM134264B0 = companion.m134320a().m134264B0();
        if (TextUtils.isEmpty(eqxVarM134264B0.getChannelToken())) {
            xa2.INSTANCE.m209830a("LoveBuzzHelper", "checkMediaBuzzBonus, no have channelToken ");
            return;
        }
        if (eqxVarM134264B0.getStartTime() <= 0) {
            xa2.INSTANCE.m209830a("LoveBuzzHelper", "checkMediaBuzzBonus, no have startTime ");
            return;
        }
        LoveBuzzData loveBuzzDataM134315v0 = companion.m134320a().m134315v0();
        if (!NullChecker.m82486a(loveBuzzDataM134315v0)) {
            xa2.INSTANCE.m209830a("LoveBuzzHelper", "checkMediaBuzzBonus, no have buzzData ");
            return;
        }
        Integer numValueOf2 = null;
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            if (loveBuzzDataM134315v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM134315v0.remainingVideoBuzz);
            } else {
                numValueOf = null;
            }
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            if (loveBuzzDataM134315v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM134315v0.remainingMemojiBuzz);
            } else {
                numValueOf = null;
            }
        } else if (loveBuzzDataM134315v0 != null) {
            numValueOf = Integer.valueOf(loveBuzzDataM134315v0.remainingVoiceBuzz);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == -1) {
            xa2.INSTANCE.m209830a("LoveBuzzHelper", "checkMediaBuzzBonus, no limit ");
            return;
        }
        if (Intrinsics.m88377d(type, "videoBuzz")) {
            if (loveBuzzDataM134315v0 != null && (bonusThreshold3 = loveBuzzDataM134315v0.bonusThreshold) != null) {
                numValueOf2 = Integer.valueOf(bonusThreshold3.videoBuzz);
            }
        } else if (Intrinsics.m88377d(type, "memojiBuzz")) {
            if (loveBuzzDataM134315v0 != null && (bonusThreshold2 = loveBuzzDataM134315v0.bonusThreshold) != null) {
                numValueOf2 = Integer.valueOf(bonusThreshold2.memojiBuzz);
            }
        } else if (loveBuzzDataM134315v0 != null && (bonusThreshold = loveBuzzDataM134315v0.bonusThreshold) != null) {
            numValueOf2 = Integer.valueOf(bonusThreshold.voiceBuzz);
        }
        if (pzi0.m174454o() - eqxVarM134264B0.getStartTime() <= ((long) (numValueOf2 != null ? numValueOf2.intValue() : 60)) * 1000) {
            xa2.INSTANCE.m209830a("LoveBuzzHelper", "checkMediaBuzzBonus, no canBonus bonusTime " + numValueOf2);
            return;
        }
        String strM124568d = m124568d(eqxVarM134264B0.getChannelToken());
        xa2.INSTANCE.m209830a("LoveBuzzHelper", "checkMediaBuzzBonus, buzzBonusStatus " + strM124568d);
        if (Intrinsics.m88377d(strM124568d, "bonus_unknown")) {
            companion.m134320a().m134290e0(eqxVarM134264B0.getChannelToken(), type);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m124567c(int mm, @NotNull String convId) {
        BonusThreshold bonusThreshold;
        convId.getClass();
        haw.Companion companion = haw.INSTANCE;
        LoveBuzzData loveBuzzDataM134315v0 = companion.m134320a().m134315v0();
        int i = (loveBuzzDataM134315v0 == null || (bonusThreshold = loveBuzzDataM134315v0.bonusThreshold) == null) ? 0 : bonusThreshold.textBuzz;
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("LoveBuzzHelper", "checkTextBuzzBonus, mm " + mm + " bonusThreshold " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (i == 0) {
            xa2Var.m209830a("LoveBuzzHelper", "checkTextBuzzBonus, bonusThreshold == 0 ");
            return;
        }
        if (mm < i) {
            return;
        }
        String strM124568d = m124568d(convId);
        xa2Var.m209830a("LoveBuzzHelper", "checkMediaBuzzBonus, buzzBonusStatus " + strM124568d);
        if (Intrinsics.m88377d(strM124568d, "bonus_unknown")) {
            companion.m134320a().m134290e0(convId, "textBuzz");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m124568d(@Nullable String bonusId) {
        if (TextUtils.isEmpty(bonusId)) {
            return "";
        }
        String str = new wyd0("buzz_bonus_" + bonusId + "_" + CoreModule.m30929H().userId(), "bonus_unknown").get();
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: e */
    public final void m124569e(@Nullable String bonusId, @NotNull String status) {
        status.getClass();
        if (bonusId != null) {
            new wyd0("buzz_bonus_" + bonusId + "_" + CoreModule.m30929H().userId(), "").put(status);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m124570f(@NotNull Context ctx, @Nullable View target, @NotNull String tag) {
        ctx.getClass();
        tag.getClass();
        if (!k8w.INSTANCE.m148752a(ctx) || !NullChecker.m82486a(target)) {
            xa2.INSTANCE.m209830a("IntlLoveBuzzMedia", "showBonusTip, ctx is empty");
            return;
        }
        if (C4499d.m21895l().m21911x(tag)) {
            xa2.INSTANCE.m209830a("IntlLoveBuzzMedia", "showBonusTip, tag " + tag + " is showing");
            return;
        }
        xa2.INSTANCE.m209830a("IntlLoveBuzzMedia", "showBonusTip, to show " + tag);
        TextView textView = new TextView(ctx);
        textView.setText(k3d0.m148007c(R$string.f20964g));
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setMinWidth(qa00.m175859d(300.0f));
        textView.setTextColor(-1);
        int i = qa00.f156323j;
        textView.setPadding(i, i, i, i);
        C4499d.m21895l().m21908u(new C4496a(ctx).m21869k(k3d0.m148005a(d9c0.f85752i), k3d0.m148005a(d9c0.f85753j)).m21876s(textView).m21883z(i).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21881x(qa00.f156320g).m21874q(zvk.f206227D), target, tag);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m124571g() {
        return m124565a("textBuzz");
    }
}
