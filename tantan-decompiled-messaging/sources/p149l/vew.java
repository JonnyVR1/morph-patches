package p149l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class vew implements g23 {

    /* JADX INFO: renamed from: k */
    private static final Bitmap.Config f181222k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    private final cfw f181223a;

    /* JADX INFO: renamed from: b */
    private final Set<Bitmap.Config> f181224b;

    /* JADX INFO: renamed from: c */
    private final long f181225c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC20625a f181226d;

    /* JADX INFO: renamed from: e */
    private long f181227e;

    /* JADX INFO: renamed from: f */
    private long f181228f;

    /* JADX INFO: renamed from: g */
    private int f181229g;

    /* JADX INFO: renamed from: h */
    private int f181230h;

    /* JADX INFO: renamed from: i */
    private int f181231i;

    /* JADX INFO: renamed from: j */
    private int f181232j;

    /* JADX INFO: renamed from: l.vew$a */
    public interface InterfaceC20625a {
        /* JADX INFO: renamed from: a */
        void mo198259a(Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        void mo198260b(Bitmap bitmap);
    }

    public vew(long j, cfw cfwVar, Set<Bitmap.Config> set) {
        this.f181225c = j;
        this.f181227e = j;
        this.f181223a = cfwVar;
        this.f181224b = set;
        this.f181226d = new C20626b();
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: f */
    private static void m198247f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            qtc0.m176411a("Cannot create a mutable Bitmap with config: ", config, ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    private static Bitmap m198248g(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f181222k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: h */
    private void m198249h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m198250i();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m198250i() {
        Objects.toString(this.f181223a);
    }

    /* JADX INFO: renamed from: j */
    private void m198251j() {
        m198257q(this.f181227e);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: k */
    private static Set<Bitmap.Config> m198252k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: l */
    private static cfw m198253l() {
        return new xif0();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    private synchronized Bitmap m198254m(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap bitmapMo106611d;
        try {
            m198247f(config);
            bitmapMo106611d = this.f181223a.mo106611d(i, i2, config != null ? config : f181222k);
            if (bitmapMo106611d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f181223a.mo106608a(i, i2, config);
                }
                this.f181230h++;
            } else {
                this.f181229g++;
                this.f181228f -= (long) this.f181223a.mo106609b(bitmapMo106611d);
                this.f181226d.mo198260b(bitmapMo106611d);
                m198256p(bitmapMo106611d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f181223a.mo106608a(i, i2, config);
            }
            m198249h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo106611d;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: o */
    private static void m198255o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* JADX INFO: renamed from: p */
    private static void m198256p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m198255o(bitmap);
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m198257q(long j) {
        while (this.f181228f > j) {
            try {
                Bitmap bitmapRemoveLast = this.f181223a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        m198250i();
                    }
                    this.f181228f = 0L;
                    return;
                } else {
                    this.f181226d.mo198260b(bitmapRemoveLast);
                    this.f181228f -= (long) this.f181223a.mo106609b(bitmapRemoveLast);
                    this.f181232j++;
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        this.f181223a.mo106612e(bitmapRemoveLast);
                    }
                    m198249h();
                    bitmapRemoveLast.recycle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.g23
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo124140a(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            mo124141b();
        } else if (i >= 20 || i == 15) {
            m198257q(m198258n() / 2);
        }
    }

    @Override // p149l.g23
    /* JADX INFO: renamed from: b */
    public void mo124141b() {
        Log.isLoggable("LruBitmapPool", 3);
        m198257q(0L);
    }

    @Override // p149l.g23
    /* JADX INFO: renamed from: c */
    public synchronized void mo124142c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f181223a.mo106609b(bitmap) <= this.f181227e && this.f181224b.contains(bitmap.getConfig())) {
                int iMo106609b = this.f181223a.mo106609b(bitmap);
                this.f181223a.mo106610c(bitmap);
                this.f181226d.mo198259a(bitmap);
                this.f181231i++;
                this.f181228f += (long) iMo106609b;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f181223a.mo106612e(bitmap);
                }
                m198249h();
                m198251j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f181223a.mo106612e(bitmap);
                bitmap.isMutable();
                this.f181224b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.g23
    @NonNull
    /* JADX INFO: renamed from: d */
    public Bitmap mo124143d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM198254m = m198254m(i, i2, config);
        if (bitmapM198254m == null) {
            return m198248g(i, i2, config);
        }
        bitmapM198254m.eraseColor(0);
        return bitmapM198254m;
    }

    @Override // p149l.g23
    @NonNull
    /* JADX INFO: renamed from: e */
    public Bitmap mo124144e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM198254m = m198254m(i, i2, config);
        return bitmapM198254m == null ? m198248g(i, i2, config) : bitmapM198254m;
    }

    /* JADX INFO: renamed from: n */
    public long m198258n() {
        return this.f181227e;
    }

    public vew(long j) {
        this(j, m198253l(), m198252k());
    }

    /* JADX INFO: renamed from: l.vew$b */
    public static final class C20626b implements InterfaceC20625a {
        @Override // p149l.vew.InterfaceC20625a
        /* JADX INFO: renamed from: a */
        public void mo198259a(Bitmap bitmap) {
        }

        @Override // p149l.vew.InterfaceC20625a
        /* JADX INFO: renamed from: b */
        public void mo198260b(Bitmap bitmap) {
        }
    }
}
