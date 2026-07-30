package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.mcr;
import l.rlt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class un40 extends or90 {
    public un40(b1m b1mVar, mcr mcrVar) {
        super(b1mVar, mcrVar);
    }

    @Override // p002l.j5q
    /* JADX INFO: renamed from: a */
    public void mo15243a(List<hn2<a1m>> list) {
        list.add(new ProfileImagesItemHolder(this.f16756a, this.f16757b));
        if (TextUtils.equals(this.f16756a.userId(), CoreModule.H().userId())) {
            list.add(new ne90(this.f16756a, this.f16757b));
        }
        list.add(new wg90(this.f16756a, this.f16757b));
        if (TextUtils.equals(this.f16756a.from(), "push_like")) {
            list.add(new tqa0(this.f16756a, this.f16757b));
        }
        list.add(new zl90(this.f16756a, this.f16757b));
        list.add(new zva0(this.f16756a, this.f16757b));
        list.add(new ota0(this.f16756a, this.f16757b));
        list.add(new iqa0(this.f16756a, this.f16757b));
        list.add(new bk90(this.f16756a, this.f16757b));
        list.add(new woa0(this.f16756a, this.f16757b));
        list.add(new kea0(this.f16756a, this.f16757b));
        list.add(new iua0(this.f16756a, this.f16757b));
        if (!rlt.b(this.f16756a.from()) && !TextUtils.equals(this.f16756a.from(), "p_tantanx_card")) {
            list.add(new mqa0(this.f16756a, this.f16757b));
        }
        list.add(new jta0(this.f16756a, this.f16757b));
        list.add(new lpa0(this.f16756a, this.f16757b));
        list.add(new boa0(this.f16756a, this.f16757b));
        list.add(new mi90(this.f16756a, this.f16757b));
        list.add(new ie90(this.f16756a, this.f16757b));
        list.add(new kr90(this.f16756a, this.f16757b));
        list.add(new bq90(this.f16756a, this.f16757b));
        if (CoreModule.P().g().yc() || CoreModule.P().g().d9()) {
            list.add(new vr90(this.f16756a, this.f16757b));
        }
        list.add(new ProfileGameItemHolder(this.f16756a, this.f16757b));
        list.add(new uta0(this.f16756a, this.f16757b));
        list.add(new toa0(this.f16756a, this.f16757b));
        list.add(new fr90(this.f16756a, this.f16757b));
        list.add(new yqa0(this.f16756a, this.f16757b));
        list.add(new ls90(this.f16756a, this.f16757b));
        list.add(new rqa0(this.f16756a, this.f16757b));
        list.add(new gta0(this.f16756a, this.f16757b));
        if (!"-11005".equals(this.f16756a.userId()) && !"from_guess_liker_result".equals(this.f16756a.from())) {
            list.add(new ProfileReportItemHolder(this.f16756a, this.f16757b));
        }
        if (!TextUtils.equals(this.f16756a.userId(), CoreModule.H().userId())) {
            list.add(new l33(this.f16756a, this.f16757b));
        }
        list.add(new l33(this.f16756a, this.f16757b));
    }
}
