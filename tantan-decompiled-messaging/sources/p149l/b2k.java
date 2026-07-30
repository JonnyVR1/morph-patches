package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class b2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (SchemeKey.liveSetting.equals(str)) {
            act.startActivity(m99968r(act, rwj0.m181411j(w2e0Var, "subCode")));
        } else if (SchemeKey.livePrivacy.equals(str)) {
            act.startActivity(LiveIndependentSettingAct.m70699Y1(act, "privacy_setting", null));
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return SchemeKey.liveSetting.equals(str) || SchemeKey.livePrivacy.equals(str);
    }

    /* JADX INFO: renamed from: r */
    public Intent m99968r(Context context, String str) {
        LiveSettingArgs liveSettingArgs;
        if (TextUtils.isEmpty(str)) {
            liveSettingArgs = null;
        } else {
            try {
                liveSettingArgs = new LiveSettingArgs(Integer.parseInt(str));
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                liveSettingArgs = null;
            }
        }
        return l9s.m149044G().mo67220Gr(context, liveSettingArgs);
    }
}
