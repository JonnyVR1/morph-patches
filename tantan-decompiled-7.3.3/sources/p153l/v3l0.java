package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.VerificationNetworkData;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class v3l0 {

    /* JADX INFO: renamed from: d */
    public static volatile v3l0 f182219d;

    /* JADX INFO: renamed from: a */
    public C22508b<VerificationNetworkData> f182220a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public String f182221b = "";

    /* JADX INFO: renamed from: c */
    public boolean f182222c = false;

    /* JADX INFO: renamed from: e */
    public static v3l0 m199281e() {
        if (f182219d == null) {
            synchronized (esf0.class) {
                try {
                    if (f182219d == null) {
                        f182219d = new v3l0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f182219d;
    }

    /* JADX INFO: renamed from: b */
    public C22508b<VerificationNetworkData> m199282b() {
        return this.f182220a;
    }

    /* JADX INFO: renamed from: c */
    public void m199283c(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final VerificationNetworkData verificationNetworkData = VerificationNetworkData.JSON_ADAPTER.parse(str);
        if (NullChecker.m82486a(verificationNetworkData) && NullChecker.m82486a(verificationNetworkData.meta) && NullChecker.m82486a(verificationNetworkData.data)) {
            int i = verificationNetworkData.meta.code;
            if (i == 400312 || i == 400314 || i == 400313) {
                l51.m152887G(new Runnable() { // from class: l.u3l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f177353a.m199286g(verificationNetworkData);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public String m199284d() {
        return this.f182221b;
    }

    /* JADX INFO: renamed from: f */
    public boolean m199285f() {
        return this.f182222c;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m199286g(VerificationNetworkData verificationNetworkData) {
        m199282b().onNext(verificationNetworkData);
    }

    /* JADX INFO: renamed from: h */
    public void m199287h(String str) {
        this.f182221b = str;
    }

    /* JADX INFO: renamed from: i */
    public void m199288i(boolean z) {
        this.f182222c = z;
    }
}
