package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;

/* JADX INFO: loaded from: classes4.dex */
public class d3g0 {

    /* JADX INFO: renamed from: a */
    public Intent f84895a;

    /* JADX INFO: renamed from: b */
    public AudienceStartData f84896b;

    /* JADX INFO: renamed from: c */
    public Context f84897c;

    public d3g0(Intent intent, AudienceStartData audienceStartData, Context context) {
        this.f84895a = intent;
        this.f84896b = audienceStartData;
        this.f84897c = context;
    }

    /* JADX INFO: renamed from: a */
    public Context m113811a() {
        return this.f84897c;
    }

    /* JADX INFO: renamed from: b */
    public Intent m113812b() {
        return this.f84895a;
    }

    /* JADX INFO: renamed from: c */
    public AudienceStartData m113813c() {
        return this.f84896b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m113814d() {
        BLiveAbsData bLiveAbsData = this.f84896b.live;
        return bLiveAbsData != null && bLiveAbsData.isOfficialShowRoom();
    }

    /* JADX INFO: renamed from: e */
    public boolean m113815e() {
        BLiveAbsData bLiveAbsData = this.f84896b.live;
        return bLiveAbsData != null && bLiveAbsData.isVoiceLive() && vxr.m203876d().m170969C1();
    }

    /* JADX INFO: renamed from: f */
    public boolean m113816f() {
        BLiveAbsData bLiveAbsData;
        BLiveStreamUrl bLiveStreamUrl;
        AudienceStartData audienceStartData = this.f84896b;
        if (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null || (bLiveStreamUrl = bLiveAbsData.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv)) {
            return false;
        }
        return sjt.m186307a(this.f84896b.live.streamUrl.pullFlv, "rtc");
    }

    /* JADX INFO: renamed from: g */
    public void m113817g(Intent intent) {
        this.f84895a = intent;
    }
}
