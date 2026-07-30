package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;

/* JADX INFO: loaded from: classes4.dex */
public class md4 {

    /* JADX INFO: renamed from: a */
    public String f135862a;

    /* JADX INFO: renamed from: b */
    public String f135863b;

    public md4(String str, String str2) {
        this.f135862a = str;
        this.f135863b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m157955a() {
        return this.f135863b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m157956b() {
        return TextUtils.equals("alertCampaign", this.f135862a);
    }

    /* JADX INFO: renamed from: c */
    public boolean m157957c() {
        return this.f135862a.contains(BLiveOperationClickAction.scheme);
    }

    /* JADX INFO: renamed from: d */
    public boolean m157958d() {
        return TextUtils.equals("showUserProfileCard", this.f135862a);
    }
}
