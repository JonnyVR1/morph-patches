package p149l;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.C2200n;
import com.google.android.gms.tasks.Task;
import com.tencent.liteav.TXLiteAVCode;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class m9w0 {

    /* JADX INFO: renamed from: a */
    public final Context f132810a;

    /* JADX INFO: renamed from: b */
    public final Executor f132811b;

    /* JADX INFO: renamed from: c */
    public final p8w0 f132812c;

    /* JADX INFO: renamed from: d */
    public final r8w0 f132813d;

    /* JADX INFO: renamed from: e */
    public final l9w0 f132814e;

    /* JADX INFO: renamed from: f */
    public final l9w0 f132815f;

    /* JADX INFO: renamed from: g */
    public Task f132816g;

    /* JADX INFO: renamed from: h */
    public Task f132817h;

    @VisibleForTesting
    public m9w0(Context context, Executor executor, p8w0 p8w0Var, r8w0 r8w0Var, j9w0 j9w0Var, k9w0 k9w0Var) {
        this.f132810a = context;
        this.f132811b = executor;
        this.f132812c = p8w0Var;
        this.f132813d = r8w0Var;
        this.f132814e = j9w0Var;
        this.f132815f = k9w0Var;
    }

    /* JADX INFO: renamed from: e */
    public static m9w0 m153620e(@NonNull Context context, @NonNull Executor executor, @NonNull p8w0 p8w0Var, @NonNull r8w0 r8w0Var) {
        final m9w0 m9w0Var = new m9w0(context, executor, p8w0Var, r8w0Var, new j9w0(), new k9w0());
        if (m9w0Var.f132813d.mo178289d()) {
            m9w0Var.f132816g = m9w0Var.m153627h(new Callable() { // from class: l.g9w0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f101606a.m153624c();
                }
            });
        } else {
            m9w0Var.f132816g = tfi0.m188734f(m9w0Var.f132814e.zza());
        }
        m9w0Var.f132817h = m9w0Var.m153627h(new Callable() { // from class: l.h9w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f106641a.m153625d();
            }
        });
        return m9w0Var;
    }

    /* JADX INFO: renamed from: g */
    public static C2200n m153621g(@NonNull Task task, @NonNull C2200n c2200n) {
        return !task.mo15377p() ? c2200n : (C2200n) task.mo15373l();
    }

    /* JADX INFO: renamed from: a */
    public final C2200n m153622a() {
        return m153621g(this.f132816g, this.f132814e.zza());
    }

    /* JADX INFO: renamed from: b */
    public final C2200n m153623b() {
        return m153621g(this.f132817h, this.f132815f.zza());
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2200n m153624c() throws Exception {
        zpr0 zpr0VarM12983l0 = C2200n.m12983l0();
        AdvertisingIdClient.C2070a advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f132810a);
        String strM12233a = advertisingIdInfo.m12233a();
        if (strM12233a != null && strM12233a.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strM12233a);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strM12233a = Base64.encodeToString(bArr, 11);
        }
        if (strM12233a != null) {
            zpr0VarM12983l0.m219787t0(strM12233a);
            zpr0VarM12983l0.m219785s0(advertisingIdInfo.m12234b());
            zpr0VarM12983l0.m219760W(6);
        }
        return (C2200n) zpr0VarM12983l0.m153521m();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2200n m153625d() throws Exception {
        Context context = this.f132810a;
        return x8w0.m207457a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m153626f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f132812c.m167827c(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_PLAYING, -1L, exc);
    }

    /* JADX INFO: renamed from: h */
    public final Task m153627h(@NonNull Callable callable) {
        return tfi0.m188731c(this.f132811b, callable).mo15364c(this.f132811b, new yd50() { // from class: l.i9w0
            @Override // p149l.yd50
            public final void onFailure(Exception exc) {
                this.f112263a.m153626f(exc);
            }
        });
    }
}
