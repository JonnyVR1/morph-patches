package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;

/* JADX INFO: loaded from: classes13.dex */
public class e2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        act.startActivity(m114502r(act));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/room/showUserMedal".equals(str);
    }

    /* JADX INFO: renamed from: r */
    public Intent m114502r(Context context) {
        Intent intent = new Intent(context, (Class<?>) LiveUserRightListAct.class);
        Bundle bundle = new Bundle();
        bundle.putString("right_type", UserRightType.USER_MEDAL_MANAGE.toString());
        intent.putExtras(bundle);
        return intent;
    }
}
