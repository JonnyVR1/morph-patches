package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import com.p051p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class iw40 extends sz90 {
    public iw40(u3m u3mVar, ner nerVar) {
        super(u3mVar, nerVar);
    }

    @Override // p153l.j7q
    /* JADX INFO: renamed from: a */
    public void mo142369a(List<on2<t3m>> list) {
        list.add(new ProfileImagesItemHolder(this.f171366a, this.f171367b));
        if (TextUtils.equals(this.f171366a.userId(), CoreModule.m30929H().userId())) {
            list.add(new rm90(this.f171366a, this.f171367b));
        }
        list.add(new ap90(this.f171366a, this.f171367b));
        if (TextUtils.equals(this.f171366a.from(), "push_like")) {
            list.add(new xya0(this.f171366a, this.f171367b));
        }
        list.add(new du90(this.f171366a, this.f171367b));
        list.add(new d4b0(this.f171366a, this.f171367b));
        list.add(new s1b0(this.f171366a, this.f171367b));
        list.add(new mya0(this.f171366a, this.f171367b));
        list.add(new fs90(this.f171366a, this.f171367b));
        list.add(new axa0(this.f171366a, this.f171367b));
        list.add(new oma0(this.f171366a, this.f171367b));
        list.add(new m2b0(this.f171366a, this.f171367b));
        if (!tnt.m191965b(this.f171366a.from()) && !TextUtils.equals(this.f171366a.from(), "p_tantanx_card")) {
            list.add(new qya0(this.f171366a, this.f171367b));
        }
        list.add(new n1b0(this.f171366a, this.f171367b));
        list.add(new pxa0(this.f171366a, this.f171367b));
        list.add(new fwa0(this.f171366a, this.f171367b));
        list.add(new qq90(this.f171366a, this.f171367b));
        list.add(new mm90(this.f171366a, this.f171367b));
        list.add(new oz90(this.f171366a, this.f171367b));
        list.add(new fy90(this.f171366a, this.f171367b));
        if (CoreModule.m30933P().m143410g().mo36090yc() || CoreModule.m30933P().m143410g().mo36057d9()) {
            list.add(new zz90(this.f171366a, this.f171367b));
        }
        list.add(new ProfileGameItemHolder(this.f171366a, this.f171367b));
        list.add(new y1b0(this.f171366a, this.f171367b));
        list.add(new xwa0(this.f171366a, this.f171367b));
        list.add(new jz90(this.f171366a, this.f171367b));
        list.add(new cza0(this.f171366a, this.f171367b));
        list.add(new p0a0(this.f171366a, this.f171367b));
        list.add(new vya0(this.f171366a, this.f171367b));
        list.add(new k1b0(this.f171366a, this.f171367b));
        if (!User.ID_OFFICIAL_CHANNEL.equals(this.f171366a.userId()) && !"from_guess_liker_result".equals(this.f171366a.from())) {
            list.add(new ProfileReportItemHolder(this.f171366a, this.f171367b));
        }
        if (!TextUtils.equals(this.f171366a.userId(), CoreModule.m30929H().userId())) {
            list.add(new b43(this.f171366a, this.f171367b));
        }
        list.add(new b43(this.f171366a, this.f171367b));
    }
}
