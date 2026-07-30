package p002l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import l.uvr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uuf0 {

    /* JADX INFO: renamed from: a */
    public Intent f20834a;

    /* JADX INFO: renamed from: b */
    public AudienceStartData f20835b;

    /* JADX INFO: renamed from: c */
    public Context f20836c;

    public uuf0(Intent intent, AudienceStartData audienceStartData, Context context) {
        this.f20834a = intent;
        this.f20835b = audienceStartData;
        this.f20836c = context;
    }

    /* JADX INFO: renamed from: a */
    public Context m23631a() {
        return this.f20836c;
    }

    /* JADX INFO: renamed from: b */
    public Intent m23632b() {
        return this.f20834a;
    }

    /* JADX INFO: renamed from: c */
    public AudienceStartData m23633c() {
        return this.f20835b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m23634d() {
        BLiveAbsData bLiveAbsData = this.f20835b.live;
        return bLiveAbsData != null && bLiveAbsData.isOfficialShowRoom();
    }

    /* JADX INFO: renamed from: e */
    public boolean m23635e() {
        BLiveAbsData bLiveAbsData = this.f20835b.live;
        return bLiveAbsData != null && bLiveAbsData.isVoiceLive() && uvr.d().C1();
    }

    /* JADX INFO: renamed from: f */
    public boolean m23636f() {
        BLiveAbsData bLiveAbsData;
        BLiveStreamUrl bLiveStreamUrl;
        AudienceStartData audienceStartData = this.f20835b;
        if (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null || (bLiveStreamUrl = bLiveAbsData.streamUrl) == null || TextUtils.isEmpty(bLiveStreamUrl.pullFlv)) {
            return false;
        }
        return rht.m21994a(this.f20835b.live.streamUrl.pullFlv, "rtc");
    }

    /* JADX INFO: renamed from: g */
    public void m23637g(Intent intent) {
        this.f20834a = intent;
    }
}
