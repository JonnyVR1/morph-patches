package com.vivo.push.p118d;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14756e;
import com.vivo.push.C14765m;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.p116b.C14698p;
import com.vivo.push.p116b.C14706x;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14796q;
import com.vivo.push.util.C14805z;
import com.vivo.push.util.NotifyAdapterUtil;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.vivo.push.d.u */
/* JADX INFO: loaded from: classes2.dex */
final class C14750u extends AbstractC14755z {
    public C14750u(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static Intent m86025b(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14698p c14698p = (C14698p) abstractC14769o;
        InsideNotificationItem insideNotificationItemM85942f = c14698p.m85942f();
        if (insideNotificationItemM85942f == null) {
            C14795p.m86192d("OnNotificationClickTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage uPSNotificationMessageM86195a = C14796q.m86195a(insideNotificationItemM85942f);
        boolean zEquals = this.f61899a.getPackageName().equals(c14698p.m85940d());
        if (zEquals) {
            NotifyAdapterUtil.cancelNotify(this.f61899a);
        }
        if (!zEquals) {
            C14795p.m86179a("OnNotificationClickTask", "notify is " + uPSNotificationMessageM86195a + " ; isMatch is " + zEquals);
            return;
        }
        C14706x c14706x = new C14706x(1030L);
        HashMap<String, String> map = new HashMap<>();
        map.put("type", "2");
        map.put(Message.MESSAGE_ID, String.valueOf(c14698p.m85941e()));
        map.put("platform", this.f61899a.getPackageName());
        Context context = this.f61899a;
        String strM86232b = C14805z.m86232b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strM86232b)) {
            map.put("remoteAppId", strM86232b);
        }
        c14706x.m85955a(map);
        C14756e.m86032a().m86049a(c14706x);
        C14795p.m86192d("OnNotificationClickTask", "notification is clicked by skip type[" + uPSNotificationMessageM86195a.getSkipType() + Constants.AES_SUFFIX);
        int skipType = uPSNotificationMessageM86195a.getSkipType();
        if (skipType == 1) {
            new Thread(new RunnableC14751v(this, this.f61899a, uPSNotificationMessageM86195a.getParams())).start();
            m86024a(uPSNotificationMessageM86195a);
            return;
        }
        if (skipType == 2) {
            String skipContent = uPSNotificationMessageM86195a.getSkipContent();
            if (skipContent.startsWith("http://") || skipContent.startsWith("https://")) {
                Uri uri = Uri.parse(skipContent);
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                m86025b(intent, uPSNotificationMessageM86195a.getParams());
                try {
                    this.f61899a.startActivity(intent);
                } catch (Exception unused) {
                    C14795p.m86179a("OnNotificationClickTask", "startActivity error : ".concat(String.valueOf(uri)));
                }
            } else {
                C14795p.m86179a("OnNotificationClickTask", "url not legal");
            }
            m86024a(uPSNotificationMessageM86195a);
            return;
        }
        if (skipType == 3) {
            m86024a(uPSNotificationMessageM86195a);
            return;
        }
        if (skipType != 4) {
            C14795p.m86179a("OnNotificationClickTask", "illegitmacy skip type error : " + uPSNotificationMessageM86195a.getSkipType());
            return;
        }
        String skipContent2 = uPSNotificationMessageM86195a.getSkipContent();
        try {
            Intent uri2 = Intent.parseUri(skipContent2, 1);
            String str = uri2.getPackage();
            if (!TextUtils.isEmpty(str) && !this.f61899a.getPackageName().equals(str)) {
                C14795p.m86179a("OnNotificationClickTask", "open activity error : local pkgName is " + this.f61899a.getPackageName() + "; but remote pkgName is " + uri2.getPackage());
                return;
            }
            String packageName = uri2.getComponent() == null ? null : uri2.getComponent().getPackageName();
            if (!TextUtils.isEmpty(packageName) && !this.f61899a.getPackageName().equals(packageName)) {
                C14795p.m86179a("OnNotificationClickTask", "open activity component error : local pkgName is " + this.f61899a.getPackageName() + "; but remote pkgName is " + uri2.getPackage());
                return;
            }
            uri2.setSelector(null);
            uri2.setPackage(this.f61899a.getPackageName());
            uri2.addFlags(335544320);
            m86025b(uri2, uPSNotificationMessageM86195a.getParams());
            ActivityInfo activityInfoResolveActivityInfo = uri2.resolveActivityInfo(this.f61899a.getPackageManager(), 65536);
            if (activityInfoResolveActivityInfo == null || activityInfoResolveActivityInfo.exported) {
                this.f61899a.startActivity(uri2);
                m86024a(uPSNotificationMessageM86195a);
            } else {
                C14795p.m86179a("OnNotificationClickTask", "activity is not exported : " + activityInfoResolveActivityInfo.toString());
            }
        } catch (Exception e) {
            C14795p.m86180a("OnNotificationClickTask", "open activity error : ".concat(String.valueOf(skipContent2)), e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m86024a(UPSNotificationMessage uPSNotificationMessage) {
        C14765m.m86087c(new RunnableC14752w(this, uPSNotificationMessage));
    }
}
