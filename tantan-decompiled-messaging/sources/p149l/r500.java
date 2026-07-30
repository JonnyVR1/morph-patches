package p149l;

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
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class r500 extends deb0 {

    /* JADX INFO: renamed from: f */
    public static volatile r500 f157747f;

    /* JADX INFO: renamed from: d */
    public final C22392a<String> f157748d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public boolean f157749e = false;

    /* JADX INFO: renamed from: l.r500$a */
    public class C19637a implements e30<String> {
        public C19637a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            r500.this.m111186h(str);
            r500.this.m111184f(true);
        }
    }

    /* JADX INFO: renamed from: l.r500$b */
    public class C19638b implements e30<Throwable> {
        public C19638b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            r500.this.m111186h(null);
            r500.this.m111184f(false);
            r500.this.f157749e = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static r500 m177876n() {
        if (f157747f == null) {
            synchronized (r500.class) {
                try {
                    if (f157747f == null) {
                        f157747f = new r500();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f157747f;
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: a */
    public boolean mo81431a(Intent intent) {
        if (intent.hasExtra("custom")) {
            try {
                return m111182c(intent.getStringExtra("custom"), true);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                return false;
            }
        }
        if (!intent.hasExtra("key_message")) {
            return false;
        }
        try {
            try {
                MiPushMessage miPushMessage = (MiPushMessage) intent.getSerializableExtra("key_message");
                if (NullChecker.m81303a(miPushMessage)) {
                    Map<String, String> extra = miPushMessage.getExtra();
                    if (NullChecker.m81304b(extra)) {
                        return m111182c(extra.get("custom"), true);
                    }
                }
            } catch (Exception e2) {
                CrashHelper.m81296c(e2);
            }
            return false;
        } finally {
            MiPushClient.clearNotification(f16.m119092a());
        }
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: e */
    public String mo81432e() {
        return "mopushT";
    }

    @Override // p149l.deb0
    /* JADX INFO: renamed from: i */
    public void mo81433i() {
        if (this.f157749e) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f157749e) {
                    this.f157749e = true;
                    du2.m113670a("[common][push]", "MoPush start!");
                    PhotonPushManager.getInstance().register();
                    this.f157748d.subscribe(mkd0.m154956H(new C19637a(), new C19638b()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m177877o(Application application) {
        du2.m113670a("[common][push]", "MoPush init!");
        if (TextUtils.equals(br2.m103433b().m103435c("sp_protocal", "https"), "https")) {
            PhotonPushManager.getInstance().init(application, "7d619d2a0cc234d97768aecf533d7aa9", new C19639c());
        } else {
            PhotonPushManager.getInstance().init(application, "f5cdebeda60c5cd421d53c3e5c03a2d5", new C19639c());
        }
    }

    /* JADX INFO: renamed from: l.r500$c */
    public class C19639c extends PushMessageReceiver {
        public C19639c() {
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isFcmOpen() {
            return false;
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isHonorPushOpen() {
            return eel.m115977r();
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isHuaweiPushOpen() {
            return false;
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isMeizuPushOpen() {
            return false;
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isMiPushOpen() {
            return false;
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isOppoPushOpen() {
            return false;
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isVivoPushOpen() {
            return false;
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean onNotificationMessageClicked(MoNotify moNotify) {
            return super.onNotificationMessageClicked(moNotify);
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean onNotificationShow(MoNotify moNotify) {
            try {
                r500.this.m111182c(Intent.parseUri(moNotify.action, 0).getStringExtra("custom"), false);
                return true;
            } catch (URISyntaxException unused) {
                return true;
            }
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onReceivePassThroughMessage(MoMessage moMessage) {
            super.onReceivePassThroughMessage(moMessage);
            r500.this.m111182c(moMessage.text, false);
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onThirdPushRegisterResult(int i, int i2, String str) {
            if (10 == ThirdPushManager.getPushSdk() && 1001 == i2 && !TextUtils.isEmpty(str)) {
                eel.m115975p().m115982w(str);
            }
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onToken(int i, String str, String str2) {
            du2.m113670a("[common][push]", "MoPush onToken,result=" + i + ",token=" + str + ",message=" + str2);
            if (i == 0) {
                r500.this.f157748d.m132487l(str);
                r500.this.f157748d.onCompleted();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("result=" + i + ",message=" + str2);
            r500 r500Var = r500.this;
            if (i == -1) {
                r500Var.f157748d.onError(new NetIgnoredException(illegalStateException));
            } else {
                r500Var.f157748d.onError(illegalStateException);
            }
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onCommand(int i, int i2, String str) {
        }
    }
}
