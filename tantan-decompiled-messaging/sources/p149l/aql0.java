package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.livingroom.archi.act.VirtualCompatibleActivity;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class aql0 extends ruf0 {
    @Override // p149l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo98305a(guf0 guf0Var) {
        uuf0 uuf0VarMo128030a = guf0Var.mo128030a();
        AudienceStartData audienceStartDataM195359c = uuf0VarMo128030a.m195359c();
        if (uuf0VarMo128030a.m195358b() != null) {
            guf0Var.mo128031b(uuf0VarMo128030a);
            return;
        }
        if (NullChecker.m81303a(audienceStartDataM195359c) && NullChecker.m81303a(audienceStartDataM195359c.live) && ycp0.m214190d().m214196f() && TextUtils.equals(ycp0.m214190d().m214195e(), audienceStartDataM195359c.live.f44323id)) {
            ho2 ho2VarM214194c = ycp0.m214190d().m214194c();
            if (NullChecker.m81303a(ho2VarM214194c)) {
                g4c.m124360a().m124362c(ho2VarM214194c);
                audienceStartDataM195359c.fromFW = true;
            }
            if (ho2VarM214194c instanceof fcm0) {
                uuf0VarMo128030a.m195363g(new Intent(uuf0VarMo128030a.m195357a(), (Class<?>) VirtualCompatibleActivity.class));
            }
        }
        guf0Var.mo128031b(uuf0VarMo128030a);
    }
}
