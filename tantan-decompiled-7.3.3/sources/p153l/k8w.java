package p153l;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00042\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u00042\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u0018\u001a\u00020\u00042\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\nJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/k8w;", "", "<init>", "()V", "", "k", "Landroid/content/Context;", "ctx", "", "a", "(Landroid/content/Context;)Z", "", "expire", "", "g", "(J)Ljava/lang/String;", "countDownTime", "c", "", "Landroid/view/View;", "views", "j", "([Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f45292l, Constants.INAPP_DATA_TAG, "context", "b", "type", "", "h", "(Ljava/lang/String;)I", "e", RXScreenCaptureService.KEY_INDEX, "f", "()I", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class k8w {

    @NotNull
    public static final k8w INSTANCE = new k8w();

    /* JADX INFO: renamed from: a */
    public final boolean m148752a(@Nullable Context ctx) {
        if (ctx == null) {
            return false;
        }
        if (!(ctx instanceof Act)) {
            return true;
        }
        Act act = (Act) ctx;
        return (act.isFinishing() || act.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m148753b(@NotNull Context context) {
        boolean zIsScreenOn;
        context.getClass();
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        try {
            zIsScreenOn = powerManager.isScreenOn();
        } catch (Exception unused) {
            zIsScreenOn = false;
        }
        return powerManager.isInteractive() || zIsScreenOn;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m148754c(long countDownTime) {
        long j = countDownTime / 1000;
        if (j < 0) {
            j = 0;
        }
        long j2 = j / 3600;
        long j3 = (j / 60) % 60;
        long j4 = j % 60;
        long j5 = j4 >= 0 ? j4 : 0L;
        if (j2 >= 1) {
            return tzi0.m193672j(j2) + ":" + tzi0.m193672j(j3) + ":" + tzi0.m193672j(j5);
        }
        if (j3 < 1) {
            return "00:" + tzi0.m193672j(j5);
        }
        return tzi0.m193672j(j3) + ":" + tzi0.m193672j(j5);
    }

    /* JADX INFO: renamed from: d */
    public final void m148755d(@NotNull View... views) {
        views.getClass();
        for (View view : views) {
            if (view != null) {
                view.setEnabled(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: e */
    public final int m148756e(@NotNull String type) {
        int i;
        type.getClass();
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz") && loveBuzzDataM134315v0 != null) {
                    i = loveBuzzDataM134315v0.memojiBuzzConnectTimeout;
                } else {
                    i = 10;
                }
            } else if (type.equals("videoBuzz") && loveBuzzDataM134315v0 != null) {
                i = loveBuzzDataM134315v0.videoBuzzConnectTimeout;
            } else {
                i = 10;
            }
        } else if (!type.equals("voiceBuzz") || loveBuzzDataM134315v0 == null) {
            i = 10;
        } else {
            i = loveBuzzDataM134315v0.voiceBuzzConnectTimeout;
        }
        if (i <= 0) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public final int m148757f() {
        int iM101297k = b0e.m101297k(CoreModule.f18263b);
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("LoveBuzzHelper", "getDeviceLevel judgeDeviceLevel 11 " + iM101297k);
        if (iM101297k == -1 && cgw.m109764h(CoreModule.f18263b)) {
            iM101297k = 0;
        }
        xa2Var.m209830a("LoveBuzzHelper", "getDeviceLevel judgeDeviceLevel 22 " + iM101297k);
        if (iM101297k == -1) {
            int iM105592y0 = bnl0.m105592y0();
            if (iM105592y0 >= 1080) {
                iM101297k = 2;
            } else {
                iM101297k = iM105592y0 >= 720 ? 1 : 0;
            }
        }
        xa2Var.m209830a("LoveBuzzHelper", "getDeviceLevel judgeDeviceLevel 33 " + iM101297k);
        if (iM101297k == -1) {
            return 0;
        }
        return iM101297k + 2;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m148758g(long expire) {
        long jM174454o = ((expire - pzi0.m174454o()) + 500) / 1000;
        if (jM174454o < 0) {
            jM174454o = 0;
        }
        long j = jM174454o / 3600;
        long j2 = (jM174454o / 60) % 60;
        if (jM174454o >= 60) {
            return tzi0.m193672j(j) + ":" + tzi0.m193672j(j2);
        }
        long j3 = jM174454o % 60;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 <= 0) {
            return "00:00";
        }
        return tzi0.m193672j(j3) + BLiveStormDanmakuGiftResourceType.f45294s;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX INFO: renamed from: h */
    public final int m148759h(@NotNull String type) {
        type.getClass();
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        int iHashCode = type.hashCode();
        Integer numValueOf = null;
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode != 1740758636 || !type.equals("memojiBuzz")) {
                    numValueOf = 10;
                } else if (loveBuzzDataM134315v0 != null) {
                    numValueOf = Integer.valueOf(loveBuzzDataM134315v0.memojiBuzzReactTimeout);
                }
            } else if (!type.equals("videoBuzz")) {
                numValueOf = 10;
            } else if (loveBuzzDataM134315v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM134315v0.videoBuzzReactTimeout);
            }
        } else if (!type.equals("voiceBuzz")) {
            numValueOf = 10;
        } else if (loveBuzzDataM134315v0 != null) {
            numValueOf = Integer.valueOf(loveBuzzDataM134315v0.voiceBuzzReactTimeout);
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 10;
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: i */
    public final int m148760i(@NotNull String type) {
        int i;
        type.getClass();
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz") && loveBuzzDataM134315v0 != null) {
                    i = loveBuzzDataM134315v0.memojiBuzzWaitingTimeout;
                } else {
                    i = 15;
                }
            } else if (type.equals("videoBuzz") && loveBuzzDataM134315v0 != null) {
                i = loveBuzzDataM134315v0.videoBuzzWaitingTimeout;
            } else {
                i = 15;
            }
        } else if (!type.equals("voiceBuzz") || loveBuzzDataM134315v0 == null) {
            i = 15;
        } else {
            i = loveBuzzDataM134315v0.voiceBuzzWaitingTimeout;
        }
        if (i <= 0) {
            return 15;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public final void m148761j(@NotNull View... views) {
        views.getClass();
        for (View view : views) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m148762k() {
        if (NullChecker.m82486a(CoreModule.f18263b)) {
            Object systemService = CoreModule.f18263b.getSystemService("vibrator");
            Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(200L, 100));
                } else {
                    vibrator.vibrate(200L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m148763l(@NotNull View... views) {
        views.getClass();
        for (View view : views) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }
}
