package p149l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class hzd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        super.mo94421a(w2e0Var, f30Var);
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        if (NullChecker.m81303a(mapM201098f) && !mapM201098f.isEmpty() && (mapM201098f instanceof HashMap) && TextUtils.equals(mapM201098f.get("action"), SocialOperation.GAME_SIGNATURE) && (w2e0Var.m201094b() instanceof Activity)) {
            ((Activity) w2e0Var.m201094b()).finish();
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        if (!NullChecker.m81303a(mapM201098f) || mapM201098f.isEmpty() || !(mapM201098f instanceof HashMap)) {
            return ProfileAct.m50738p2(w2e0Var.m201094b(), CoreModule.m29931H().userId(), "", false, true);
        }
        Intent intentM50738p2 = ProfileAct.m50738p2(w2e0Var.m201094b(), CoreModule.m29931H().userId(), "", false, true);
        intentM50738p2.putExtra("params_extra_map_data", (HashMap) mapM201098f);
        return intentM50738p2;
    }
}
