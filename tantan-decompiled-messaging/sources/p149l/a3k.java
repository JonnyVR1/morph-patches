package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;

/* JADX INFO: loaded from: classes13.dex */
public class a3k extends ytl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        m94723u(act, new ygt(w2e0Var.m201095c()).m214763g("h5Url"));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/room/octopusGame".equals(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m94723u(final Act act, String str) {
        act.duringCreated(IntlGameApiProvider.getRealOctopusGameUrl(str)).filter(new w9j() { // from class: l.x2k
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.y2k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195620a.m94722t(act, (String) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m94722t(Act act, String str) {
        jp50 jp50VarM219573d = zoo.m219573d(str);
        new phn(act).m169094O(jp50VarM219573d.m142581n(), jp50VarM219573d.m142580m(), jp50VarM219573d.m142576i(), jp50VarM219573d.m142575h(), jp50VarM219573d.m142570b(), jp50VarM219573d.m142578k(), jp50VarM219573d.m142577j(), jp50VarM219573d.m142573f(), false);
    }
}
