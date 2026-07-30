package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: classes9.dex */
public class z4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        String str2 = abe0Var.m96743f().get("from");
        fk3.C16996b c16996b = new fk3.C16996b();
        c16996b.f99480a = Constants.VIA_REPORT_TYPE_SET_AVATAR;
        c16996b.f99481b = str2;
        ((fk3) tbs.m190077m(itd0.f116820b)).m125950Q(c16996b);
        if (mbs.m157853g().mo31745a().mo192251h()) {
            y6u.m214519w(act);
        } else {
            act.startActivity(mbs.m157853g().toNewMainAct(act, NavigationIntent.get("live")));
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return mo160563a("videoChatSquare").equals(str);
    }
}
