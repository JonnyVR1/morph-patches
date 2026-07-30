package com.vivo.push.p118d;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.p116b.C14699q;
import com.vivo.push.util.AsyncTaskC14790k;
import com.vivo.push.util.C14784e;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14796q;
import com.vivo.push.util.C14797r;
import com.vivo.push.util.C14805z;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.d.s */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC14748s implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InsideNotificationItem f61847a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C14699q f61848b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C14747r f61849c;

    public RunnableC14748s(C14747r c14747r, InsideNotificationItem insideNotificationItem, C14699q c14699q) {
        this.f61849c = c14747r;
        this.f61847a = insideNotificationItem;
        this.f61848b = c14699q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int type;
        C14747r c14747r = this.f61849c;
        boolean zOnNotificationMessageArrived = ((AbstractC14755z) c14747r).f61858b.onNotificationMessageArrived(((AbstractRunnableC14764l) c14747r).f61899a, C14796q.m86195a(this.f61847a));
        C14747r c14747r2 = this.f61849c;
        if (zOnNotificationMessageArrived) {
            C14795p.m86186b("OnNotificationArrivedTask", "pkg name : " + ((AbstractRunnableC14764l) c14747r2).f61899a.getPackageName() + " 应用主动拦截通知");
            C14795p.m86189b(((AbstractRunnableC14764l) this.f61849c).f61899a, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
            HashMap map = new HashMap();
            map.put(Message.MESSAGE_ID, String.valueOf(this.f61848b.m85951f()));
            String strM86232b = C14805z.m86232b(((AbstractRunnableC14764l) this.f61849c).f61899a, ((AbstractRunnableC14764l) this.f61849c).f61899a.getPackageName());
            if (!TextUtils.isEmpty(strM86232b)) {
                map.put("remoteAppId", strM86232b);
            }
            C14784e.m86145a(2120L, map);
            return;
        }
        int iM86029b = c14747r2.m86029b();
        if (iM86029b > 0) {
            C14795p.m86186b("OnNotificationArrivedTask", "pkg name : " + ((AbstractRunnableC14764l) this.f61849c).f61899a.getPackageName() + " notify channel switch is " + iM86029b);
            C14795p.m86189b(((AbstractRunnableC14764l) this.f61849c).f61899a, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(iM86029b)));
            HashMap map2 = new HashMap();
            map2.put(Message.MESSAGE_ID, String.valueOf(this.f61848b.m85951f()));
            String strM86232b2 = C14805z.m86232b(((AbstractRunnableC14764l) this.f61849c).f61899a, ((AbstractRunnableC14764l) this.f61849c).f61899a.getPackageName());
            if (!TextUtils.isEmpty(strM86232b2)) {
                map2.put("remoteAppId", strM86232b2);
            }
            C14784e.m86145a(iM86029b, map2);
            return;
        }
        Context context = ((AbstractRunnableC14764l) this.f61849c).f61899a;
        InsideNotificationItem insideNotificationItem = this.f61847a;
        long jM85951f = this.f61848b.m85951f();
        C14747r c14747r3 = this.f61849c;
        AsyncTaskC14790k asyncTaskC14790k = new AsyncTaskC14790k(context, insideNotificationItem, jM85951f, ((AbstractC14755z) c14747r3).f61858b.isAllowNet(((AbstractRunnableC14764l) c14747r3).f61899a), new C14749t(this));
        boolean zIsShowBigPicOnMobileNet = this.f61847a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f61847a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f61847a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            C14795p.m86190c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(zIsShowBigPicOnMobileNet)));
            C14747r c14747r4 = this.f61849c;
            if (zIsShowBigPicOnMobileNet) {
                C14795p.m86183a(((AbstractRunnableC14764l) c14747r4).f61899a, "mobile net show");
            } else {
                C14795p.m86183a(((AbstractRunnableC14764l) c14747r4).f61899a, "mobile net unshow");
                NetworkInfo networkInfoM86197a = C14797r.m86197a(((AbstractRunnableC14764l) this.f61849c).f61899a);
                if (networkInfoM86197a != null && networkInfoM86197a.getState() == NetworkInfo.State.CONNECTED && (type = networkInfoM86197a.getType()) != 1 && type == 0) {
                    this.f61847a.clearCoverUrl();
                    this.f61847a.clearPurePicUrl();
                    purePicUrl = null;
                }
            }
        }
        asyncTaskC14790k.execute(this.f61847a.getIconUrl(), purePicUrl);
    }
}
