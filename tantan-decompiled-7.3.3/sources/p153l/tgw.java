package p153l;

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
public class tgw implements w23 {

    /* JADX INFO: renamed from: k */
    private static final Bitmap.Config f174164k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    private final ahw f174165a;

    /* JADX INFO: renamed from: b */
    private final Set<Bitmap.Config> f174166b;

    /* JADX INFO: renamed from: c */
    private final long f174167c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC20309a f174168d;

    /* JADX INFO: renamed from: e */
    private long f174169e;

    /* JADX INFO: renamed from: f */
    private long f174170f;

    /* JADX INFO: renamed from: g */
    private int f174171g;

    /* JADX INFO: renamed from: h */
    private int f174172h;

    /* JADX INFO: renamed from: i */
    private int f174173i;

    /* JADX INFO: renamed from: j */
    private int f174174j;

    /* JADX INFO: renamed from: l.tgw$a */
    public interface InterfaceC20309a {
        /* JADX INFO: renamed from: a */
        void mo191130a(Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        void mo191131b(Bitmap bitmap);
    }

    public tgw(long j, ahw ahwVar, Set<Bitmap.Config> set) {
        this.f174167c = j;
        this.f174169e = j;
        this.f174165a = ahwVar;
        this.f174166b = set;
        this.f174168d = new C20310b();
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: f */
    private static void m191113f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            v1d0.m199002a("Cannot create a mutable Bitmap with config: ", config, ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    private static Bitmap m191114g(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f174164k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: h */
    private void m191115h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m191116i();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m191116i() {
        Objects.toString(this.f174165a);
    }

    /* JADX INFO: renamed from: j */
    private void m191117j() {
        m191123q(this.f174169e);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: k */
    private static Set<Bitmap.Config> m191118k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: l */
    private static ahw m191119l() {
        return new grf0();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    private synchronized Bitmap m191120m(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap bitmapMo97938d;
        try {
            m191113f(config);
            bitmapMo97938d = this.f174165a.mo97938d(i, i2, config != null ? config : f174164k);
            if (bitmapMo97938d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f174165a.mo97935a(i, i2, config);
                }
                this.f174172h++;
            } else {
                this.f174171g++;
                this.f174170f -= (long) this.f174165a.mo97936b(bitmapMo97938d);
                this.f174168d.mo191131b(bitmapMo97938d);
                m191122p(bitmapMo97938d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f174165a.mo97935a(i, i2, config);
            }
            m191115h();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapMo97938d;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: o */
    private static void m191121o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* JADX INFO: renamed from: p */
    private static void m191122p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m191121o(bitmap);
    }

    /* JADX INFO: renamed from: q */
    private synchronized void m191123q(long j) {
        while (this.f174170f > j) {
            try {
                Bitmap bitmapRemoveLast = this.f174165a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        m191116i();
                    }
                    this.f174170f = 0L;
                    return;
                } else {
                    this.f174168d.mo191131b(bitmapRemoveLast);
                    this.f174170f -= (long) this.f174165a.mo97936b(bitmapRemoveLast);
                    this.f174174j++;
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        this.f174165a.mo97939e(bitmapRemoveLast);
                    }
                    m191115h();
                    bitmapRemoveLast.recycle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.w23
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo191124a(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            mo191125b();
        } else if (i >= 20 || i == 15) {
            m191123q(m191129n() / 2);
        }
    }

    @Override // p153l.w23
    /* JADX INFO: renamed from: b */
    public void mo191125b() {
        Log.isLoggable("LruBitmapPool", 3);
        m191123q(0L);
    }

    @Override // p153l.w23
    /* JADX INFO: renamed from: c */
    public synchronized void mo191126c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f174165a.mo97936b(bitmap) <= this.f174169e && this.f174166b.contains(bitmap.getConfig())) {
                int iMo97936b = this.f174165a.mo97936b(bitmap);
                this.f174165a.mo97937c(bitmap);
                this.f174168d.mo191130a(bitmap);
                this.f174173i++;
                this.f174170f += (long) iMo97936b;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f174165a.mo97939e(bitmap);
                }
                m191115h();
                m191117j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f174165a.mo97939e(bitmap);
                bitmap.isMutable();
                this.f174166b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.w23
    @NonNull
    /* JADX INFO: renamed from: d */
    public Bitmap mo191127d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM191120m = m191120m(i, i2, config);
        if (bitmapM191120m == null) {
            return m191114g(i, i2, config);
        }
        bitmapM191120m.eraseColor(0);
        return bitmapM191120m;
    }

    @Override // p153l.w23
    @NonNull
    /* JADX INFO: renamed from: e */
    public Bitmap mo191128e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM191120m = m191120m(i, i2, config);
        return bitmapM191120m == null ? m191114g(i, i2, config) : bitmapM191120m;
    }

    /* JADX INFO: renamed from: n */
    public long m191129n() {
        return this.f174169e;
    }

    public tgw(long j) {
        this(j, m191119l(), m191118k());
    }

    /* JADX INFO: renamed from: l.tgw$b */
    public static final class C20310b implements InterfaceC20309a {
        @Override // p153l.tgw.InterfaceC20309a
        /* JADX INFO: renamed from: a */
        public void mo191130a(Bitmap bitmap) {
        }

        @Override // p153l.tgw.InterfaceC20309a
        /* JADX INFO: renamed from: b */
        public void mo191131b(Bitmap bitmap) {
        }
    }
}
