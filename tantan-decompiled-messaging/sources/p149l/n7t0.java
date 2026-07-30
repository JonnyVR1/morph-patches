package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import com.p046p1.mobile.putong.core.data.Reason;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class n7t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f137553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f137554b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f137555c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f137556d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ o7t0 f137557e;

    public n7t0(o7t0 o7t0Var, String str, String str2, String str3, String str4) {
        this.f137553a = str;
        this.f137554b = str2;
        this.f137555c = str3;
        this.f137556d = str4;
        this.f137557e = o7t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        map.put("src", this.f137553a);
        if (!TextUtils.isEmpty(this.f137554b)) {
            map.put("cachedSrc", this.f137554b);
        }
        String str2 = this.f137555c;
        String str3 = "internal";
        switch (str2.hashCode()) {
            case -1947652542:
                str = "interrupted";
                str2.equals(str);
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    str3 = "network";
                }
                break;
            case -1347010958:
                str = "inProgress";
                str2.equals(str);
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    str3 = "network";
                }
                break;
            case -659376217:
                str = "contentLengthMissing";
                str2.equals(str);
                break;
            case -642208130:
                str = "playerFailed";
                str2.equals(str);
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    str3 = "policy";
                }
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    str3 = "policy";
                }
                break;
            case 3387234:
                str = GuideBoostMode.noop;
                str2.equals(str);
                break;
            case 96784904:
                str = "error";
                str2.equals(str);
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    str3 = "io";
                }
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    str3 = "io";
                }
                break;
        }
        map.put("type", str3);
        map.put(Reason.TYPE, this.f137555c);
        if (!TextUtils.isEmpty(this.f137556d)) {
            map.put("message", this.f137556d);
        }
        o7t0.m163062f(this.f137557e, "onPrecacheEvent", map);
    }
}
