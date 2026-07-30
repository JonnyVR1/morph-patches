package com.vivo.push.p113d;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p111b.C14551q;
import com.vivo.push.util.AsyncTaskC14642k;
import com.vivo.push.util.C14636e;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14648q;
import com.vivo.push.util.C14649r;
import com.vivo.push.util.C14657z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.s */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14600s implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InsideNotificationItem f61000a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14551q f61001b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14599r f61002c;

    public RunnableC14600s(C14599r c14599r, InsideNotificationItem insideNotificationItem, C14551q c14551q) {
        this.f61002c = c14599r;
        this.f61000a = insideNotificationItem;
        this.f61001b = c14551q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int type;
        C14599r c14599r = this.f61002c;
        boolean zOnNotificationMessageArrived = ((AbstractC14607z) c14599r).f61011b.onNotificationMessageArrived(((AbstractRunnableC14616l) c14599r).f61052a, C14648q.m85024a(this.f61000a));
        C14599r c14599r2 = this.f61002c;
        if (zOnNotificationMessageArrived) {
            C14647p.m85015b("OnNotificationArrivedTask", "pkg name : " + ((AbstractRunnableC14616l) c14599r2).f61052a.getPackageName() + " 应用主动拦截通知");
            C14647p.m85018b(((AbstractRunnableC14616l) this.f61002c).f61052a, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
            HashMap map = new HashMap();
            map.put(Message.MESSAGE_ID, String.valueOf(this.f61001b.m84780f()));
            String strM85061b = C14657z.m85061b(((AbstractRunnableC14616l) this.f61002c).f61052a, ((AbstractRunnableC14616l) this.f61002c).f61052a.getPackageName());
            if (!TextUtils.isEmpty(strM85061b)) {
                map.put("remoteAppId", strM85061b);
            }
            C14636e.m84974a(2120L, map);
            return;
        }
        int iM84858b = c14599r2.m84858b();
        if (iM84858b > 0) {
            C14647p.m85015b("OnNotificationArrivedTask", "pkg name : " + ((AbstractRunnableC14616l) this.f61002c).f61052a.getPackageName() + " notify channel switch is " + iM84858b);
            C14647p.m85018b(((AbstractRunnableC14616l) this.f61002c).f61052a, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(iM84858b)));
            HashMap map2 = new HashMap();
            map2.put(Message.MESSAGE_ID, String.valueOf(this.f61001b.m84780f()));
            String strM85061b2 = C14657z.m85061b(((AbstractRunnableC14616l) this.f61002c).f61052a, ((AbstractRunnableC14616l) this.f61002c).f61052a.getPackageName());
            if (!TextUtils.isEmpty(strM85061b2)) {
                map2.put("remoteAppId", strM85061b2);
            }
            C14636e.m84974a(iM84858b, map2);
            return;
        }
        Context context = ((AbstractRunnableC14616l) this.f61002c).f61052a;
        InsideNotificationItem insideNotificationItem = this.f61000a;
        long jM84780f = this.f61001b.m84780f();
        C14599r c14599r3 = this.f61002c;
        AsyncTaskC14642k asyncTaskC14642k = new AsyncTaskC14642k(context, insideNotificationItem, jM84780f, ((AbstractC14607z) c14599r3).f61011b.isAllowNet(((AbstractRunnableC14616l) c14599r3).f61052a), new C14601t(this));
        boolean zIsShowBigPicOnMobileNet = this.f61000a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f61000a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f61000a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            C14647p.m85019c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(zIsShowBigPicOnMobileNet)));
            C14599r c14599r4 = this.f61002c;
            if (zIsShowBigPicOnMobileNet) {
                C14647p.m85012a(((AbstractRunnableC14616l) c14599r4).f61052a, "mobile net show");
            } else {
                C14647p.m85012a(((AbstractRunnableC14616l) c14599r4).f61052a, "mobile net unshow");
                NetworkInfo networkInfoM85026a = C14649r.m85026a(((AbstractRunnableC14616l) this.f61002c).f61052a);
                if (networkInfoM85026a != null && networkInfoM85026a.getState() == NetworkInfo.State.CONNECTED && (type = networkInfoM85026a.getType()) != 1 && type == 0) {
                    this.f61000a.clearCoverUrl();
                    this.f61000a.clearPurePicUrl();
                    purePicUrl = null;
                }
            }
        }
        asyncTaskC14642k.execute(this.f61000a.getIconUrl(), purePicUrl);
    }
}
