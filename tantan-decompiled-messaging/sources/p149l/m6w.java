package p149l;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00042\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u00042\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u0018\u001a\u00020\u00042\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\nJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Ll/m6w;", "", "<init>", "()V", "", "k", "Landroid/content/Context;", "ctx", "", "a", "(Landroid/content/Context;)Z", "", "expire", "", "g", "(J)Ljava/lang/String;", "countDownTime", "c", "", "Landroid/view/View;", "views", "j", "([Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f44444l, Constants.INAPP_DATA_TAG, "context", "b", "type", "", "h", "(Ljava/lang/String;)I", "e", RXScreenCaptureService.KEY_INDEX, "f", "()I", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m6w {

    @NotNull
    public static final m6w INSTANCE = new m6w();

    /* JADX INFO: renamed from: a */
    public final boolean m153296a(@Nullable Context ctx) {
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
    public final boolean m153297b(@NotNull Context context) {
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
    public final String m153298c(long countDownTime) {
        long j = countDownTime / 1000;
        if (j < 0) {
            j = 0;
        }
        long j2 = j / 3600;
        long j3 = (j / 60) % 60;
        long j4 = j % 60;
        long j5 = j4 >= 0 ? j4 : 0L;
        if (j2 >= 1) {
            return qqi0.m175942j(j2) + ":" + qqi0.m175942j(j3) + ":" + qqi0.m175942j(j5);
        }
        if (j3 < 1) {
            return "00:" + qqi0.m175942j(j5);
        }
        return qqi0.m175942j(j3) + ":" + qqi0.m175942j(j5);
    }

    /* JADX INFO: renamed from: d */
    public final void m153299d(@NotNull View... views) {
        views.getClass();
        for (View view : views) {
            if (view != null) {
                view.setEnabled(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: e */
    public final int m153300e(@NotNull String type) {
        int i;
        type.getClass();
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz") && loveBuzzDataM140468v0 != null) {
                    i = loveBuzzDataM140468v0.memojiBuzzConnectTimeout;
                } else {
                    i = 10;
                }
            } else if (type.equals("videoBuzz") && loveBuzzDataM140468v0 != null) {
                i = loveBuzzDataM140468v0.videoBuzzConnectTimeout;
            } else {
                i = 10;
            }
        } else if (!type.equals("voiceBuzz") || loveBuzzDataM140468v0 == null) {
            i = 10;
        } else {
            i = loveBuzzDataM140468v0.voiceBuzzConnectTimeout;
        }
        if (i <= 0) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public final int m153301f() {
        int iM166658k = oyd.m166658k(CoreModule.f17544b);
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("LoveBuzzHelper", "getDeviceLevel judgeDeviceLevel 11 " + iM166658k);
        if (iM166658k == -1 && eew.m116012h(CoreModule.f17544b)) {
            iM166658k = 0;
        }
        qa2Var.m173681a("LoveBuzzHelper", "getDeviceLevel judgeDeviceLevel 22 " + iM166658k);
        if (iM166658k == -1) {
            int iM208412y0 = xdl0.m208412y0();
            if (iM208412y0 >= 1080) {
                iM166658k = 2;
            } else {
                iM166658k = iM208412y0 >= 720 ? 1 : 0;
            }
        }
        qa2Var.m173681a("LoveBuzzHelper", "getDeviceLevel judgeDeviceLevel 33 " + iM166658k);
        if (iM166658k == -1) {
            return 0;
        }
        return iM166658k + 2;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m153302g(long expire) {
        long jM155944o = ((expire - mqi0.m155944o()) + 500) / 1000;
        if (jM155944o < 0) {
            jM155944o = 0;
        }
        long j = jM155944o / 3600;
        long j2 = (jM155944o / 60) % 60;
        if (jM155944o >= 60) {
            return qqi0.m175942j(j) + ":" + qqi0.m175942j(j2);
        }
        long j3 = jM155944o % 60;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 <= 0) {
            return "00:00";
        }
        return qqi0.m175942j(j3) + BLiveStormDanmakuGiftResourceType.f44446s;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX INFO: renamed from: h */
    public final int m153303h(@NotNull String type) {
        type.getClass();
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        int iHashCode = type.hashCode();
        Integer numValueOf = null;
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode != 1740758636 || !type.equals("memojiBuzz")) {
                    numValueOf = 10;
                } else if (loveBuzzDataM140468v0 != null) {
                    numValueOf = Integer.valueOf(loveBuzzDataM140468v0.memojiBuzzReactTimeout);
                }
            } else if (!type.equals("videoBuzz")) {
                numValueOf = 10;
            } else if (loveBuzzDataM140468v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM140468v0.videoBuzzReactTimeout);
            }
        } else if (!type.equals("voiceBuzz")) {
            numValueOf = 10;
        } else if (loveBuzzDataM140468v0 != null) {
            numValueOf = Integer.valueOf(loveBuzzDataM140468v0.voiceBuzzReactTimeout);
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 10;
        if (iIntValue <= 0) {
            return 10;
        }
        return iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: i */
    public final int m153304i(@NotNull String type) {
        int i;
        type.getClass();
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz") && loveBuzzDataM140468v0 != null) {
                    i = loveBuzzDataM140468v0.memojiBuzzWaitingTimeout;
                } else {
                    i = 15;
                }
            } else if (type.equals("videoBuzz") && loveBuzzDataM140468v0 != null) {
                i = loveBuzzDataM140468v0.videoBuzzWaitingTimeout;
            } else {
                i = 15;
            }
        } else if (!type.equals("voiceBuzz") || loveBuzzDataM140468v0 == null) {
            i = 15;
        } else {
            i = loveBuzzDataM140468v0.voiceBuzzWaitingTimeout;
        }
        if (i <= 0) {
            return 15;
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public final void m153305j(@NotNull View... views) {
        views.getClass();
        for (View view : views) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m153306k() {
        if (NullChecker.m81303a(CoreModule.f17544b)) {
            Object systemService = CoreModule.f17544b.getSystemService("vibrator");
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
    public final void m153307l(@NotNull View... views) {
        views.getClass();
        for (View view : views) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }
}
