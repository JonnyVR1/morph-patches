package p153l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class l7e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        super.mo95798a(abe0Var, z20Var);
        Map<String, String> mapM96743f = abe0Var.m96743f();
        if (NullChecker.m82486a(mapM96743f) && !mapM96743f.isEmpty() && (mapM96743f instanceof HashMap) && TextUtils.equals(mapM96743f.get("action"), SocialOperation.GAME_SIGNATURE) && (abe0Var.m96739b() instanceof Activity)) {
            ((Activity) abe0Var.m96739b()).finish();
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        if (!NullChecker.m82486a(mapM96743f) || mapM96743f.isEmpty() || !(mapM96743f instanceof HashMap)) {
            return ProfileAct.m51922q2(abe0Var.m96739b(), CoreModule.m30929H().userId(), "", false, true);
        }
        Intent intentM51922q2 = ProfileAct.m51922q2(abe0Var.m96739b(), CoreModule.m30929H().userId(), "", false, true);
        intentM51922q2.putExtra("params_extra_map_data", (HashMap) mapM96743f);
        return intentM51922q2;
    }
}
