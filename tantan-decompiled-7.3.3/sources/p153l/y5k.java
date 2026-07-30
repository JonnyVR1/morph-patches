package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class y5k extends owl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: c */
    public void mo108063c(Act act, LiveGoAction liveGoAction) {
        super.mo108063c(act, liveGoAction);
        if (TextUtils.isEmpty(liveGoAction.getGoData())) {
            return;
        }
        try {
            nae0.m162083m(act, Uri.parse(liveGoAction.getGoData()));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            nsh0.m164608j("LiveGoActionSchema", "handleGoSchema has error: " + e.getMessage() + ", origin data: " + liveGoAction.getGoData());
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo102761d(act, str, pushMessageCustom);
        if (!TextUtils.isEmpty(pushMessageCustom.link)) {
            nae0.m162083m(act, Uri.parse(pushMessageCustom.link));
        } else {
            if (TextUtils.isEmpty(this.f139111a.link)) {
                return;
            }
            nae0.m162083m(act, Uri.parse(this.f139111a.link));
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: j */
    public boolean mo108064j(int i) {
        return 1 == i;
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        return str.startsWith("goPage.live.") || str.startsWith("goRun.live.");
    }
}
