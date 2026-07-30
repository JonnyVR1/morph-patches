package p153l;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.C2223n;
import com.google.android.gms.tasks.Task;
import com.tencent.liteav.TXLiteAVCode;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class siw0 {

    /* JADX INFO: renamed from: a */
    public final Context f168876a;

    /* JADX INFO: renamed from: b */
    public final Executor f168877b;

    /* JADX INFO: renamed from: c */
    public final vhw0 f168878c;

    /* JADX INFO: renamed from: d */
    public final xhw0 f168879d;

    /* JADX INFO: renamed from: e */
    public final riw0 f168880e;

    /* JADX INFO: renamed from: f */
    public final riw0 f168881f;

    /* JADX INFO: renamed from: g */
    public Task f168882g;

    /* JADX INFO: renamed from: h */
    public Task f168883h;

    @VisibleForTesting
    public siw0(Context context, Executor executor, vhw0 vhw0Var, xhw0 xhw0Var, piw0 piw0Var, qiw0 qiw0Var) {
        this.f168876a = context;
        this.f168877b = executor;
        this.f168878c = vhw0Var;
        this.f168879d = xhw0Var;
        this.f168880e = piw0Var;
        this.f168881f = qiw0Var;
    }

    /* JADX INFO: renamed from: e */
    public static siw0 m186040e(@NonNull Context context, @NonNull Executor executor, @NonNull vhw0 vhw0Var, @NonNull xhw0 xhw0Var) {
        final siw0 siw0Var = new siw0(context, executor, vhw0Var, xhw0Var, new piw0(), new qiw0());
        if (siw0Var.f168879d.mo104578d()) {
            siw0Var.f168882g = siw0Var.m186047h(new Callable() { // from class: l.miw0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f137034a.m186044c();
                }
            });
        } else {
            siw0Var.f168882g = toi0.m192068f(siw0Var.f168880e.zza());
        }
        siw0Var.f168883h = siw0Var.m186047h(new Callable() { // from class: l.niw0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f142176a.m186045d();
            }
        });
        return siw0Var;
    }

    /* JADX INFO: renamed from: g */
    public static C2223n m186041g(@NonNull Task task, @NonNull C2223n c2223n) {
        return !task.mo15431p() ? c2223n : (C2223n) task.mo15427l();
    }

    /* JADX INFO: renamed from: a */
    public final C2223n m186042a() {
        return m186041g(this.f168882g, this.f168880e.zza());
    }

    /* JADX INFO: renamed from: b */
    public final C2223n m186043b() {
        return m186041g(this.f168883h, this.f168881f.zza());
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2223n m186044c() throws Exception {
        fzr0 fzr0VarM13037l0 = C2223n.m13037l0();
        AdvertisingIdClient.C2093a advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f168876a);
        String strM12287a = advertisingIdInfo.m12287a();
        if (strM12287a != null && strM12287a.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strM12287a);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strM12287a = Base64.encodeToString(bArr, 11);
        }
        if (strM12287a != null) {
            fzr0VarM13037l0.m128322t0(strM12287a);
            fzr0VarM13037l0.m128320s0(advertisingIdInfo.m12288b());
            fzr0VarM13037l0.m128295W(6);
        }
        return (C2223n) fzr0VarM13037l0.m185950m();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2223n m186045d() throws Exception {
        Context context = this.f168876a;
        return diw0.m116005a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m186046f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f168878c.m201302c(TXLiteAVCode.EVT_AUDIO_JITTER_STATE_PLAYING, -1L, exc);
    }

    /* JADX INFO: renamed from: h */
    public final Task m186047h(@NonNull Callable callable) {
        return toi0.m192065c(this.f168877b, callable).mo15418c(this.f168877b, new fm50() { // from class: l.oiw0
            @Override // p153l.fm50
            public final void onFailure(Exception exc) {
                this.f147591a.m186046f(exc);
            }
        });
    }
}
