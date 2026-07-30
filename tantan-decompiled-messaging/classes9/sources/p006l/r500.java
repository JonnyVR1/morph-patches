package p006l;

import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.cosmos.photon.push.PhotonPushManager;
import com.cosmos.photon.push.PushMessageReceiver;
import com.cosmos.photon.push.msg.MoMessage;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.tantanapp.common.network.NetIgnoredException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.net.URISyntaxException;
import java.util.Map;
import l.br2;
import l.deb0;
import l.du2;
import l.e30;
import l.f16;
import l.mkd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r500 extends deb0 {

    /* JADX INFO: renamed from: f */
    public static volatile r500 f20340f;

    /* JADX INFO: renamed from: d */
    public final a<String> f20341d = a.b();

    /* JADX INFO: renamed from: e */
    public boolean f20342e = false;

    /* JADX INFO: renamed from: l.r500$a */
    public class C1205a implements e30<String> {
        public C1205a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            r500.this.h(str);
            r500.this.f(true);
        }
    }

    /* JADX INFO: renamed from: l.r500$b */
    public class C1206b implements e30<Throwable> {
        public C1206b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            r500.this.h((String) null);
            r500.this.f(false);
            r500.this.f20342e = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static r500 m22641n() {
        if (f20340f == null) {
            synchronized (r500.class) {
                try {
                    if (f20340f == null) {
                        f20340f = new r500();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20340f;
    }

    /* JADX INFO: renamed from: a */
    public boolean m22642a(Intent intent) {
        if (intent.hasExtra("custom")) {
            try {
                return c(intent.getStringExtra("custom"), true);
            } catch (Exception e) {
                CrashHelper.c(e);
                return false;
            }
        }
        if (!intent.hasExtra("key_message")) {
            return false;
        }
        try {
            try {
                MiPushMessage serializableExtra = intent.getSerializableExtra("key_message");
                if (NullChecker.a(serializableExtra)) {
                    Map extra = serializableExtra.getExtra();
                    if (NullChecker.b(extra)) {
                        return c((String) extra.get("custom"), true);
                    }
                }
            } catch (Exception e2) {
                CrashHelper.c(e2);
            }
            return false;
        } finally {
            MiPushClient.clearNotification(f16.a());
        }
    }

    /* JADX INFO: renamed from: e */
    public String m22643e() {
        return "mopushT";
    }

    /* JADX INFO: renamed from: i */
    public void m22644i() {
        if (this.f20342e) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f20342e) {
                    this.f20342e = true;
                    du2.a("[common][push]", "MoPush start!");
                    PhotonPushManager.getInstance().register();
                    this.f20341d.subscribe(mkd0.H(new C1205a(), new C1206b()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m22645o(Application application) {
        du2.a("[common][push]", "MoPush init!");
        if (TextUtils.equals(br2.b().c("sp_protocal", "https"), "https")) {
            PhotonPushManager.getInstance().init(application, "7d619d2a0cc234d97768aecf533d7aa9", new C1207c());
        } else {
            PhotonPushManager.getInstance().init(application, "f5cdebeda60c5cd421d53c3e5c03a2d5", new C1207c());
        }
    }

    /* JADX INFO: renamed from: l.r500$c */
    public class C1207c extends PushMessageReceiver {
        public C1207c() {
        }

        public boolean isFcmOpen() {
            return false;
        }

        public boolean isHonorPushOpen() {
            return eel.m14493r();
        }

        public boolean isHuaweiPushOpen() {
            return false;
        }

        public boolean isMeizuPushOpen() {
            return false;
        }

        public boolean isMiPushOpen() {
            return false;
        }

        public boolean isOppoPushOpen() {
            return false;
        }

        public boolean isVivoPushOpen() {
            return false;
        }

        public boolean onNotificationMessageClicked(MoNotify moNotify) {
            return super.onNotificationMessageClicked(moNotify);
        }

        public boolean onNotificationShow(MoNotify moNotify) {
            try {
                r500.this.c(Intent.parseUri(moNotify.action, 0).getStringExtra("custom"), false);
                return true;
            } catch (URISyntaxException unused) {
                return true;
            }
        }

        public void onReceivePassThroughMessage(MoMessage moMessage) {
            super.onReceivePassThroughMessage(moMessage);
            r500.this.c(moMessage.text, false);
        }

        public void onThirdPushRegisterResult(int i, int i2, String str) {
            if (10 == ThirdPushManager.getPushSdk() && 1001 == i2 && !TextUtils.isEmpty(str)) {
                eel.m14491p().m14501w(str);
            }
        }

        public void onToken(int i, String str, String str2) {
            du2.a("[common][push]", "MoPush onToken,result=" + i + ",token=" + str + ",message=" + str2);
            if (i == 0) {
                r500.this.f20341d.onNext(str);
                r500.this.f20341d.onCompleted();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("result=" + i + ",message=" + str2);
            r500 r500Var = r500.this;
            if (i == -1) {
                r500Var.f20341d.onError(new NetIgnoredException(illegalStateException));
            } else {
                r500Var.f20341d.onError(illegalStateException);
            }
        }

        public void onCommand(int i, int i2, String str) {
        }
    }
}
