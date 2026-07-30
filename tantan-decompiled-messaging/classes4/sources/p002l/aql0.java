package p002l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.act.VirtualCompatibleActivity;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.tantanapp.common.utils.NullChecker;
import l.fcm0;
import l.ycp0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aql0 extends ruf0 {
    @Override // p002l.ruf0
    /* JADX INFO: renamed from: a */
    public void mo10063a(guf0 guf0Var) {
        uuf0 uuf0VarMo14046a = guf0Var.mo14046a();
        AudienceStartData audienceStartDataM23633c = uuf0VarMo14046a.m23633c();
        if (uuf0VarMo14046a.m23632b() != null) {
            guf0Var.mo14047b(uuf0VarMo14046a);
            return;
        }
        if (NullChecker.a(audienceStartDataM23633c) && NullChecker.a(audienceStartDataM23633c.live) && ycp0.d().f() && TextUtils.equals(ycp0.d().e(), audienceStartDataM23633c.live.id)) {
            ho2 ho2VarC = ycp0.d().c();
            if (NullChecker.a(ho2VarC)) {
                g4c.m13625a().m13627c(ho2VarC);
                audienceStartDataM23633c.fromFW = true;
            }
            if (ho2VarC instanceof fcm0) {
                uuf0VarMo14046a.m23637g(new Intent(uuf0VarMo14046a.m23631a(), (Class<?>) VirtualCompatibleActivity.class));
            }
        }
        guf0Var.mo14047b(uuf0VarMo14046a);
    }
}
