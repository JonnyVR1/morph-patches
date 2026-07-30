package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;

/* JADX INFO: loaded from: classes4.dex */
public class nc4 {

    /* JADX INFO: renamed from: a */
    public String f138096a;

    /* JADX INFO: renamed from: b */
    public String f138097b;

    public nc4(String str, String str2) {
        this.f138096a = str;
        this.f138097b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m158878a() {
        return this.f138097b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m158879b() {
        return TextUtils.equals("alertCampaign", this.f138096a);
    }

    /* JADX INFO: renamed from: c */
    public boolean m158880c() {
        return this.f138096a.contains(BLiveOperationClickAction.scheme);
    }

    /* JADX INFO: renamed from: d */
    public boolean m158881d() {
        return TextUtils.equals("showUserProfileCard", this.f138096a);
    }
}
