package com.vivo.push.p118d;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.C14756e;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14800u;
import com.vivo.push.util.NotifyAdapterUtil;
import java.security.PublicKey;

/* JADX INFO: renamed from: com.vivo.push.d.z */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14755z extends AbstractRunnableC14764l {

    /* JADX INFO: renamed from: b */
    protected PushMessageCallback f61858b;

    public AbstractC14755z(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m86028a(PublicKey publicKey, String str, String str2) {
        if (!C14756e.m86032a().m86065d()) {
            C14795p.m86192d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        }
        if (publicKey == null) {
            C14795p.m86192d("OnVerifyCallBackCommand", "vertify key is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            C14795p.m86192d("OnVerifyCallBackCommand", "contentTag is null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            C14795p.m86192d("OnVerifyCallBackCommand", "vertify id is null");
            return false;
        }
        try {
            C14795p.m86192d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
            if (C14800u.m86215a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                C14795p.m86192d("OnVerifyCallBackCommand", "vertify id is success");
                return true;
            }
            C14795p.m86192d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(str));
            C14795p.m86191c(this.f61899a, "vertify fail srcDigest is ".concat(str));
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86192d("OnVerifyCallBackCommand", "vertify exception");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m86029b() {
        NotificationManager notificationManager = (NotificationManager) this.f61899a.getSystemService("notification");
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
            C14795p.m86186b("OnVerifyCallBackCommand", "判断通知通道出现系统错误");
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86027a(PushMessageCallback pushMessageCallback) {
        this.f61858b = pushMessageCallback;
    }
}
