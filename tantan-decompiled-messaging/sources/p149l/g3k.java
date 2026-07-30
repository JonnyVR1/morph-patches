package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class g3k extends aul {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: c */
    public void mo124162c(Act act, LiveGoAction liveGoAction) {
        super.mo124162c(act, liveGoAction);
        if (TextUtils.isEmpty(liveGoAction.getGoData())) {
            return;
        }
        try {
            j2e0.m139446m(act, Uri.parse(liveGoAction.getGoData()));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            gkh0.m126627j("LiveGoActionSchema", "handleGoSchema has error: " + e.getMessage() + ", origin data: " + liveGoAction.getGoData());
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo100100d(act, str, pushMessageCustom);
        if (!TextUtils.isEmpty(pushMessageCustom.link)) {
            j2e0.m139446m(act, Uri.parse(pushMessageCustom.link));
        } else {
            if (TextUtils.isEmpty(this.f199994a.link)) {
                return;
            }
            j2e0.m139446m(act, Uri.parse(this.f199994a.link));
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: j */
    public boolean mo124163j(int i) {
        return 1 == i;
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        return str.startsWith("goPage.live.") || str.startsWith("goRun.live.");
    }
}
