package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;

/* JADX INFO: loaded from: classes9.dex */
public class s5k extends mwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        m184678u(act, new zit(abe0Var.m96740c()).m219937g("h5Url"));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/room/octopusGame".equals(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m184678u(final Act act, String str) {
        act.duringCreated(IntlGameApiProvider.getRealOctopusGameUrl(str)).filter(new qcj() { // from class: l.p5k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.q5k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155727a.m184677t(act, (String) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m184677t(Act act, String str) {
        px50 px50VarM221019d = zqo.m221019d(str);
        new pjn(act).m172521O(px50VarM221019d.m174124n(), px50VarM221019d.m174123m(), px50VarM221019d.m174119i(), px50VarM221019d.m174118h(), px50VarM221019d.m174113b(), px50VarM221019d.m174121k(), px50VarM221019d.m174120j(), px50VarM221019d.m174116f(), false);
    }
}
