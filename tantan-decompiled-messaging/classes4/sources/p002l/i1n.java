package p002l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.p1.mobile.putong.core.CoreModule;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import l.l96;
import l.o96;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b¨\u0006\u001e"}, d2 = {"Ll/i1n;", "", "<init>", "()V", "", "a", "f", "b", "g", "", "promotionHitId", "remainMs", "e", "(JJ)V", "", "c", "()Z", "Landroid/content/Context;", "ctx", "Landroid/os/Vibrator;", "d", "(Landroid/content/Context;)Landroid/os/Vibrator;", "h", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "entryBannerRef", "fullscreenDiscountRef", "J", "lastRemainMsSeen", "activeHitId", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i1n {

    @NotNull
    public static final i1n INSTANCE = new i1n();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger entryBannerRef = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger fullscreenDiscountRef = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static volatile long lastRemainMsSeen = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile long activeHitId = -1;

    /* JADX INFO: renamed from: a */
    public final void m14977a() {
        entryBannerRef.incrementAndGet();
    }

    /* JADX INFO: renamed from: b */
    public final void m14978b() {
        fullscreenDiscountRef.incrementAndGet();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14979c() {
        return entryBannerRef.get() > 0 || fullscreenDiscountRef.get() > 0;
    }

    /* JADX INFO: renamed from: d */
    public final Vibrator m14980d(Context ctx) {
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = ctx.getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                return (Vibrator) systemService;
            }
            return null;
        }
        Object systemService2 = ctx.getSystemService("vibrator_manager");
        VibratorManager vibratorManagerM13534a = f1n.m12921a(systemService2) ? g1n.m13534a(systemService2) : null;
        if (vibratorManagerM13534a != null) {
            return vibratorManagerM13534a.getDefaultVibrator();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m14981e(long promotionHitId, long remainMs) {
        if (promotionHitId <= 0) {
            return;
        }
        try {
            if (activeHitId != promotionHitId) {
                activeHitId = promotionHitId;
                lastRemainMsSeen = -1L;
            }
            long j = lastRemainMsSeen;
            lastRemainMsSeen = remainMs;
            if (m14979c()) {
                if (j < 0) {
                    return;
                }
                if (j > 60000 && remainMs <= 60000 && remainMs > 0) {
                    m14984h(promotionHitId, remainMs);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14982f() {
        AtomicInteger atomicInteger = entryBannerRef;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14983g() {
        AtomicInteger atomicInteger = fullscreenDiscountRef;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14984h(long promotionHitId, long remainMs) {
        Vibrator vibratorM14980d;
        Context applicationContext = CoreModule.b.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        Object systemService = applicationContext.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null || audioManager.getRingerMode() == 0 || (vibratorM14980d = m14980d(applicationContext)) == null || !vibratorM14980d.hasVibrator()) {
            return;
        }
        try {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    o96.a(vibratorM14980d, VibrationEffect.createPredefined(5));
                } else if (i >= 26) {
                    o96.a(vibratorM14980d, l96.a(260L, 255));
                } else {
                    vibratorM14980d.vibrate(new long[]{0, 260, 120, 260}, -1);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            if (Build.VERSION.SDK_INT >= 26) {
                o96.a(vibratorM14980d, l96.a(260L, 255));
            } else {
                vibratorM14980d.vibrate(260L);
            }
        }
    }
}
