package com.vivo.push.p113d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14608e;
import com.vivo.push.C14617m;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.p111b.C14550p;
import com.vivo.push.p111b.C14558x;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14648q;
import com.vivo.push.util.C14657z;
import com.vivo.push.util.NotifyAdapterUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.vivo.push.d.u */
/* JADX INFO: loaded from: classes2.dex */
final class C14602u extends AbstractC14607z {
    public C14602u(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Intent m84854b(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14550p c14550p = (C14550p) abstractC14621o;
        InsideNotificationItem insideNotificationItemM84771f = c14550p.m84771f();
        if (insideNotificationItemM84771f == null) {
            C14647p.m85021d("OnNotificationClickTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage uPSNotificationMessageM85024a = C14648q.m85024a(insideNotificationItemM84771f);
        boolean zEquals = this.f61052a.getPackageName().equals(c14550p.m84769d());
        if (zEquals) {
            NotifyAdapterUtil.cancelNotify(this.f61052a);
        }
        if (!zEquals) {
            C14647p.m85008a("OnNotificationClickTask", "notify is " + uPSNotificationMessageM85024a + " ; isMatch is " + zEquals);
            return;
        }
        C14558x c14558x = new C14558x(1030L);
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "2");
        map.put(Message.MESSAGE_ID, String.valueOf(c14550p.m84770e()));
        map.put("platform", this.f61052a.getPackageName());
        Context context = this.f61052a;
        String strM85061b = C14657z.m85061b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strM85061b)) {
            map.put("remoteAppId", strM85061b);
        }
        c14558x.m84784a(map);
        C14608e.m84861a().m84878a(c14558x);
        C14647p.m85021d("OnNotificationClickTask", "notification is clicked by skip type[" + uPSNotificationMessageM85024a.getSkipType() + Constants.AES_SUFFIX);
        int skipType = uPSNotificationMessageM85024a.getSkipType();
        if (skipType == 1) {
            new Thread(new RunnableC14603v(this, this.f61052a, uPSNotificationMessageM85024a.getParams())).start();
            m84853a(uPSNotificationMessageM85024a);
            return;
        }
        if (skipType == 2) {
            String skipContent = uPSNotificationMessageM85024a.getSkipContent();
            if (skipContent.startsWith("http://") || skipContent.startsWith("https://")) {
                Uri uri = Uri.parse(skipContent);
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(268435456);
                m84854b(intent, uPSNotificationMessageM85024a.getParams());
                try {
                    this.f61052a.startActivity(intent);
                } catch (Exception unused) {
                    C14647p.m85008a("OnNotificationClickTask", "startActivity error : ".concat(String.valueOf(uri)));
                }
            } else {
                C14647p.m85008a("OnNotificationClickTask", "url not legal");
            }
            m84853a(uPSNotificationMessageM85024a);
            return;
        }
        if (skipType == 3) {
            m84853a(uPSNotificationMessageM85024a);
            return;
        }
        if (skipType != 4) {
            C14647p.m85008a("OnNotificationClickTask", "illegitmacy skip type error : " + uPSNotificationMessageM85024a.getSkipType());
            return;
        }
        String skipContent2 = uPSNotificationMessageM85024a.getSkipContent();
        try {
            Intent uri2 = Intent.parseUri(skipContent2, 1);
            String str = uri2.getPackage();
            if (!TextUtils.isEmpty(str) && !this.f61052a.getPackageName().equals(str)) {
                C14647p.m85008a("OnNotificationClickTask", "open activity error : local pkgName is " + this.f61052a.getPackageName() + "; but remote pkgName is " + uri2.getPackage());
                return;
            }
            String packageName = uri2.getComponent() == null ? null : uri2.getComponent().getPackageName();
            if (!TextUtils.isEmpty(packageName) && !this.f61052a.getPackageName().equals(packageName)) {
                C14647p.m85008a("OnNotificationClickTask", "open activity component error : local pkgName is " + this.f61052a.getPackageName() + "; but remote pkgName is " + uri2.getPackage());
                return;
            }
            uri2.setSelector(null);
            uri2.setPackage(this.f61052a.getPackageName());
            uri2.addFlags(335544320);
            m84854b(uri2, uPSNotificationMessageM85024a.getParams());
            ActivityInfo activityInfoResolveActivityInfo = uri2.resolveActivityInfo(this.f61052a.getPackageManager(), 65536);
            if (activityInfoResolveActivityInfo == null || activityInfoResolveActivityInfo.exported) {
                this.f61052a.startActivity(uri2);
                m84853a(uPSNotificationMessageM85024a);
            } else {
                C14647p.m85008a("OnNotificationClickTask", "activity is not exported : " + activityInfoResolveActivityInfo.toString());
            }
        } catch (Exception e) {
            C14647p.m85009a("OnNotificationClickTask", "open activity error : ".concat(String.valueOf(skipContent2)), e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84853a(UPSNotificationMessage uPSNotificationMessage) {
        C14617m.m84916c(new RunnableC14604w(this, uPSNotificationMessage));
    }
}
