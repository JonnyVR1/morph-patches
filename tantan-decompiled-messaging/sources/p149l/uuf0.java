package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;

/* JADX INFO: loaded from: classes4.dex */
public class uuf0 {

    /* JADX INFO: renamed from: a */
    public Intent f178376a;

    /* JADX INFO: renamed from: b */
    public AudienceStartData f178377b;

    /* JADX INFO: renamed from: c */
    public Context f178378c;

    public uuf0(Intent intent, AudienceStartData audienceStartData, Context context) {
        this.f178376a = intent;
        this.f178377b = audienceStartData;
        this.f178378c = context;
    }

    /* JADX INFO: renamed from: a */
    public Context m195357a() {
        return this.f178378c;
    }

    /* JADX INFO: renamed from: b */
    public Intent m195358b() {
        return this.f178376a;
    }

    /* JADX INFO: renamed from: c */
    public AudienceStartData m195359c() {
        return this.f178377b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m195360d() {
        BLiveAbsData bLiveAbsData = this.f178377b.live;
        return bLiveAbsData != null && bLiveAbsData.isOfficialShowRoom();
    }

    /* JADX INFO: renamed from: e */
    public boolean m195361e() {
        BLiveAbsData bLiveAbsData = this.f178377b.live;
        return bLiveAbsData != null && bLiveAbsData.isVoiceLive() && uvr.m196087d().m162662C1();
    }

    /* JADX INFO: renamed from: f */
    public boolean m195362f() {
        BLiveAbsData bLiveAbsData;
        BLiveStreamUrl bLiveStreamUrl;
        AudienceStartData audienceStartData = this.f178377b;
        if (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null || (bLiveStreamUrl = bLiveAbsData.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv)) {
            return false;
        }
        return rht.m179462a(this.f178377b.live.streamUrl.pullFlv, "rtc");
    }

    /* JADX INFO: renamed from: g */
    public void m195363g(Intent intent) {
        this.f178376a = intent;
    }
}
