package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.BonusThreshold;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.Target;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/h6w;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Landroid/view/View;", Target.TYPE, "", "tag", "", "f", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V", "bonusId", NotificationCompat.CATEGORY_STATUS, "e", "(Ljava/lang/String;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "", "mm", "convId", "c", "(ILjava/lang/String;)V", "type", "b", "(Ljava/lang/String;)V", "", "g", "()Z", "a", "(Ljava/lang/String;)Z", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class h6w {

    @NotNull
    public static final h6w INSTANCE = new h6w();

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX INFO: renamed from: a */
    public final boolean m129529a(@NotNull String type) {
        int i;
        type.getClass();
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1019560155) {
                if (iHashCode != 1332422126) {
                    if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                        i = loveBuzzDataM140468v0.remainingMemojiBuzz;
                    } else {
                        i = loveBuzzDataM140468v0.remainingTextBuzz;
                    }
                } else if (type.equals("videoBuzz")) {
                    i = loveBuzzDataM140468v0.remainingVideoBuzz;
                } else {
                    i = loveBuzzDataM140468v0.remainingTextBuzz;
                }
            } else if (type.equals("voiceBuzz")) {
                i = loveBuzzDataM140468v0.remainingVoiceBuzz;
            } else {
                i = loveBuzzDataM140468v0.remainingTextBuzz;
            }
            if (i != -1 && loveBuzzDataM140468v0.bonusEnabledBuzz.contains(type)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX INFO: renamed from: b */
    public final void m129530b(@NotNull String type) {
        Integer numValueOf;
        BonusThreshold bonusThreshold;
        BonusThreshold bonusThreshold2;
        BonusThreshold bonusThreshold3;
        type.getClass();
        j8w.Companion companion = j8w.INSTANCE;
        hhx hhxVarM140417B0 = companion.m140473a().m140417B0();
        if (TextUtils.isEmpty(hhxVarM140417B0.getChannelToken())) {
            qa2.INSTANCE.m173681a("LoveBuzzHelper", "checkMediaBuzzBonus, no have channelToken ");
            return;
        }
        if (hhxVarM140417B0.getStartTime() <= 0) {
            qa2.INSTANCE.m173681a("LoveBuzzHelper", "checkMediaBuzzBonus, no have startTime ");
            return;
        }
        LoveBuzzData loveBuzzDataM140468v0 = companion.m140473a().m140468v0();
        if (!NullChecker.m81303a(loveBuzzDataM140468v0)) {
            qa2.INSTANCE.m173681a("LoveBuzzHelper", "checkMediaBuzzBonus, no have buzzData ");
            return;
        }
        Integer numValueOf2 = null;
        if (Intrinsics.m87488d(type, "videoBuzz")) {
            if (loveBuzzDataM140468v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM140468v0.remainingVideoBuzz);
            } else {
                numValueOf = null;
            }
        } else if (Intrinsics.m87488d(type, "memojiBuzz")) {
            if (loveBuzzDataM140468v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM140468v0.remainingMemojiBuzz);
            } else {
                numValueOf = null;
            }
        } else if (loveBuzzDataM140468v0 != null) {
            numValueOf = Integer.valueOf(loveBuzzDataM140468v0.remainingVoiceBuzz);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == -1) {
            qa2.INSTANCE.m173681a("LoveBuzzHelper", "checkMediaBuzzBonus, no limit ");
            return;
        }
        if (Intrinsics.m87488d(type, "videoBuzz")) {
            if (loveBuzzDataM140468v0 != null && (bonusThreshold3 = loveBuzzDataM140468v0.bonusThreshold) != null) {
                numValueOf2 = Integer.valueOf(bonusThreshold3.videoBuzz);
            }
        } else if (Intrinsics.m87488d(type, "memojiBuzz")) {
            if (loveBuzzDataM140468v0 != null && (bonusThreshold2 = loveBuzzDataM140468v0.bonusThreshold) != null) {
                numValueOf2 = Integer.valueOf(bonusThreshold2.memojiBuzz);
            }
        } else if (loveBuzzDataM140468v0 != null && (bonusThreshold = loveBuzzDataM140468v0.bonusThreshold) != null) {
            numValueOf2 = Integer.valueOf(bonusThreshold.voiceBuzz);
        }
        if (mqi0.m155944o() - hhxVarM140417B0.getStartTime() <= ((long) (numValueOf2 != null ? numValueOf2.intValue() : 60)) * 1000) {
            qa2.INSTANCE.m173681a("LoveBuzzHelper", "checkMediaBuzzBonus, no canBonus bonusTime " + numValueOf2);
            return;
        }
        String strM129532d = m129532d(hhxVarM140417B0.getChannelToken());
        qa2.INSTANCE.m173681a("LoveBuzzHelper", "checkMediaBuzzBonus, buzzBonusStatus " + strM129532d);
        if (Intrinsics.m87488d(strM129532d, "bonus_unknown")) {
            companion.m140473a().m140443e0(hhxVarM140417B0.getChannelToken(), type);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m129531c(int mm, @NotNull String convId) {
        BonusThreshold bonusThreshold;
        convId.getClass();
        j8w.Companion companion = j8w.INSTANCE;
        LoveBuzzData loveBuzzDataM140468v0 = companion.m140473a().m140468v0();
        int i = (loveBuzzDataM140468v0 == null || (bonusThreshold = loveBuzzDataM140468v0.bonusThreshold) == null) ? 0 : bonusThreshold.textBuzz;
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("LoveBuzzHelper", "checkTextBuzzBonus, mm " + mm + " bonusThreshold " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (i == 0) {
            qa2Var.m173681a("LoveBuzzHelper", "checkTextBuzzBonus, bonusThreshold == 0 ");
            return;
        }
        if (mm < i) {
            return;
        }
        String strM129532d = m129532d(convId);
        qa2Var.m173681a("LoveBuzzHelper", "checkMediaBuzzBonus, buzzBonusStatus " + strM129532d);
        if (Intrinsics.m87488d(strM129532d, "bonus_unknown")) {
            companion.m140473a().m140443e0(convId, "textBuzz");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m129532d(@Nullable String bonusId) {
        if (TextUtils.isEmpty(bonusId)) {
            return "";
        }
        String str = new uqd0("buzz_bonus_" + bonusId + "_" + CoreModule.m29931H().userId(), "bonus_unknown").get();
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: e */
    public final void m129533e(@Nullable String bonusId, @NotNull String status) {
        status.getClass();
        if (bonusId != null) {
            new uqd0("buzz_bonus_" + bonusId + "_" + CoreModule.m29931H().userId(), "").put(status);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m129534f(@NotNull Context ctx, @Nullable View target, @NotNull String tag) {
        ctx.getClass();
        tag.getClass();
        if (!m6w.INSTANCE.m153296a(ctx) || !NullChecker.m81303a(target)) {
            qa2.INSTANCE.m173681a("IntlLoveBuzzMedia", "showBonusTip, ctx is empty");
            return;
        }
        if (C4348d.m20896l().m20912x(tag)) {
            qa2.INSTANCE.m173681a("IntlLoveBuzzMedia", "showBonusTip, tag " + tag + " is showing");
            return;
        }
        qa2.INSTANCE.m173681a("IntlLoveBuzzMedia", "showBonusTip, to show " + tag);
        TextView textView = new TextView(ctx);
        textView.setText(hvc0.m133156c(R$string.f20222g));
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setMinWidth(t100.m186890d(300.0f));
        textView.setTextColor(-1);
        int i = t100.f167261j;
        textView.setPadding(i, i, i, i);
        C4348d.m20896l().m20909u(new C4345a(ctx).m20870k(hvc0.m133154a(x0c0.f188955i), hvc0.m133154a(x0c0.f188956j)).m20877s(textView).m20884z(i).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20882x(t100.f167258g).m20875q(jtk.f119617D), target, tag);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m129535g() {
        return m129529a("textBuzz");
    }
}
