package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;

/* JADX INFO: loaded from: classes9.dex */
public class w4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        act.startActivity(m204897r(act));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/room/showUserMedal".equals(str);
    }

    /* JADX INFO: renamed from: r */
    public Intent m204897r(Context context) {
        Intent intent = new Intent(context, (Class<?>) LiveUserRightListAct.class);
        Bundle bundle = new Bundle();
        bundle.putString("right_type", UserRightType.USER_MEDAL_MANAGE.toString());
        intent.putExtras(bundle);
        return intent;
    }
}
