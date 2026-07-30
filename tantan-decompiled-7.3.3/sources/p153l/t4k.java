package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class t4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (SchemeKey.liveSetting.equals(str)) {
            act.startActivity(m189291r(act, v5k0.m199898j(abe0Var, "subCode")));
        } else if (SchemeKey.livePrivacy.equals(str)) {
            act.startActivity(LiveIndependentSettingAct.m71882Z1(act, "privacy_setting", null));
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return SchemeKey.liveSetting.equals(str) || SchemeKey.livePrivacy.equals(str);
    }

    /* JADX INFO: renamed from: r */
    public Intent m189291r(Context context, String str) {
        LiveSettingArgs liveSettingArgs;
        if (TextUtils.isEmpty(str)) {
            liveSettingArgs = null;
        } else {
            try {
                liveSettingArgs = new LiveSettingArgs(Integer.parseInt(str));
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                liveSettingArgs = null;
            }
        }
        return mbs.m157821G().mo68403Gr(context, liveSettingArgs);
    }
}
