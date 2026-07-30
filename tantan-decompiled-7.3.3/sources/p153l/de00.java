package p153l;

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
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class de00 extends hmb0 {

    /* JADX INFO: renamed from: f */
    public static volatile de00 f87976f;

    /* JADX INFO: renamed from: d */
    public final C22507a<String> f87977d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public boolean f87978e = false;

    /* JADX INFO: renamed from: l.de00$a */
    public class C16504a implements y20<String> {
        public C16504a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            de00.this.m135831h(str);
            de00.this.m135829f(true);
        }
    }

    /* JADX INFO: renamed from: l.de00$b */
    public class C16505b implements y20<Throwable> {
        public C16505b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            de00.this.m135831h(null);
            de00.this.m135829f(false);
            de00.this.f87978e = false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static de00 m115372n() {
        if (f87976f == null) {
            synchronized (de00.class) {
                try {
                    if (f87976f == null) {
                        f87976f = new de00();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f87976f;
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: a */
    public boolean mo82614a(Intent intent) {
        if (intent.hasExtra("custom")) {
            try {
                return m135827c(intent.getStringExtra("custom"), true);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                return false;
            }
        }
        if (!intent.hasExtra("key_message")) {
            return false;
        }
        try {
            try {
                MiPushMessage miPushMessage = (MiPushMessage) intent.getSerializableExtra("key_message");
                if (NullChecker.m82486a(miPushMessage)) {
                    Map<String, String> extra = miPushMessage.getExtra();
                    if (NullChecker.m82487b(extra)) {
                        return m135827c(extra.get("custom"), true);
                    }
                }
            } catch (Exception e2) {
                CrashHelper.m82479c(e2);
            }
            return false;
        } finally {
            MiPushClient.clearNotification(k26.m147943a());
        }
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: e */
    public String mo82615e() {
        return "mopushT";
    }

    @Override // p153l.hmb0
    /* JADX INFO: renamed from: i */
    public void mo82616i() {
        if (this.f87978e) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f87978e) {
                    this.f87978e = true;
                    tu2.m192703a("[common][push]", "MoPush start!");
                    PhotonPushManager.getInstance().register();
                    this.f87977d.subscribe(psd0.m173597H(new C16504a(), new C16505b()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m115373o(Application application) {
        tu2.m192703a("[common][push]", "MoPush init!");
        if (TextUtils.equals(rr2.m182682b().m182684c("sp_protocal", "https"), "https")) {
            PhotonPushManager.getInstance().init(application, "7d619d2a0cc234d97768aecf533d7aa9", new C16506c());
        } else {
            PhotonPushManager.getInstance().init(application, "f5cdebeda60c5cd421d53c3e5c03a2d5", new C16506c());
        }
    }

    /* JADX INFO: renamed from: l.de00$c */
    public class C16506c extends PushMessageReceiver {
        public C16506c() {
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isFcmOpen() {
            return false;
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public boolean isHonorPushOpen() {
            return ugl.m195927r();
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
                de00.this.m135827c(Intent.parseUri(moNotify.action, 0).getStringExtra("custom"), false);
                return true;
            } catch (URISyntaxException unused) {
                return true;
            }
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onReceivePassThroughMessage(MoMessage moMessage) {
            super.onReceivePassThroughMessage(moMessage);
            de00.this.m135827c(moMessage.text, false);
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onThirdPushRegisterResult(int i, int i2, String str) {
            if (10 == ThirdPushManager.getPushSdk() && 1001 == i2 && !TextUtils.isEmpty(str)) {
                ugl.m195925p().m195932w(str);
            }
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onToken(int i, String str, String str2) {
            tu2.m192703a("[common][push]", "MoPush onToken,result=" + i + ",token=" + str + ",message=" + str2);
            if (i == 0) {
                de00.this.f87977d.m137019l(str);
                de00.this.f87977d.onCompleted();
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("result=" + i + ",message=" + str2);
            de00 de00Var = de00.this;
            if (i == -1) {
                de00Var.f87977d.onError(new NetIgnoredException(illegalStateException));
            } else {
                de00Var.f87977d.onError(illegalStateException);
            }
        }

        @Override // com.cosmos.photon.push.PushMessageReceiver
        public void onCommand(int i, int i2, String str) {
        }
    }
}
