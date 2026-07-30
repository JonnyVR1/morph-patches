package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.instrument.C1662a;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\u0010R8\u0010\u0015\u001a&\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00010\u0001 \u0012*\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/lsb;", "", "<init>", "()V", "", "a", "", "e", "o", "b", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Z", "c", "()Z", "(Ljava/lang/Throwable;)V", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "crashingObjects", "Z", "enabled", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class lsb {

    @NotNull
    public static final lsb INSTANCE = new lsb();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Set<Object> crashingObjects = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: l.lsb$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/lsb$a", "Ljava/lang/Runnable;", "", "run", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class RunnableC18312a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f129841a;

        public RunnableC18312a(Throwable th) {
            this.f129841a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f129841a);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m151551a() {
        enabled = true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m151552b(@Nullable Throwable e, @NotNull Object o) {
        o.getClass();
        if (enabled) {
            crashingObjects.add(o);
            if (C1577c.m8051p()) {
                C1662a.m8905c(e);
                InstrumentData.C1659a.m8898b(e, InstrumentData.Type.CrashShield).m8896g();
            }
            m151555e(e);
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final boolean m151553c() {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m151554d(@NotNull Object o) {
        o.getClass();
        return crashingObjects.contains(o);
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final void m151555e(@Nullable Throwable e) {
        if (m151553c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC18312a(e));
        }
    }
}
