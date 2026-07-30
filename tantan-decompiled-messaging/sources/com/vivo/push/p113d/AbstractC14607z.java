package com.vivo.push.p113d;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.C14608e;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14652u;
import com.vivo.push.util.NotifyAdapterUtil;
import java.security.PublicKey;

/* JADX INFO: renamed from: com.vivo.push.d.z */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14607z extends AbstractRunnableC14616l {

    /* JADX INFO: renamed from: b */
    protected PushMessageCallback f61011b;

    public AbstractC14607z(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m84857a(PublicKey publicKey, String str, String str2) {
        if (!C14608e.m84861a().m84894d()) {
            C14647p.m85021d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        }
        if (publicKey == null) {
            C14647p.m85021d("OnVerifyCallBackCommand", "vertify key is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            C14647p.m85021d("OnVerifyCallBackCommand", "contentTag is null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            C14647p.m85021d("OnVerifyCallBackCommand", "vertify id is null");
            return false;
        }
        try {
            C14647p.m85021d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
            if (C14652u.m85044a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                C14647p.m85021d("OnVerifyCallBackCommand", "vertify id is success");
                return true;
            }
            C14647p.m85021d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(str));
            C14647p.m85020c(this.f61052a, "vertify fail srcDigest is ".concat(str));
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85021d("OnVerifyCallBackCommand", "vertify exception");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m84858b() {
        NotificationManager notificationManager = (NotificationManager) this.f61052a.getSystemService("notification");
        if (notificationManager != null && !notificationManager.areNotificationsEnabled()) {
            return 2104;
        }
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null) {
            return 0;
        }
        try {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(NotifyAdapterUtil.PRIMARY_CHANNEL);
            return (notificationChannel == null || notificationChannel.getImportance() != 0) ? 0 : 2121;
        } catch (Exception unused) {
            C14647p.m85015b("OnVerifyCallBackCommand", "判断通知通道出现系统错误");
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84856a(PushMessageCallback pushMessageCallback) {
        this.f61011b = pushMessageCallback;
    }
}
