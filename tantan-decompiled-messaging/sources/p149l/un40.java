package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileReportItemHolder;
import com.p046p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class un40 extends or90 {
    public un40(b1m b1mVar, mcr mcrVar) {
        super(b1mVar, mcrVar);
    }

    @Override // p149l.j5q
    /* JADX INFO: renamed from: a */
    public void mo137133a(List<hn2<a1m>> list) {
        list.add(new ProfileImagesItemHolder(this.f145242a, this.f145243b));
        if (TextUtils.equals(this.f145242a.userId(), CoreModule.m29931H().userId())) {
            list.add(new ne90(this.f145242a, this.f145243b));
        }
        list.add(new wg90(this.f145242a, this.f145243b));
        if (TextUtils.equals(this.f145242a.from(), "push_like")) {
            list.add(new tqa0(this.f145242a, this.f145243b));
        }
        list.add(new zl90(this.f145242a, this.f145243b));
        list.add(new zva0(this.f145242a, this.f145243b));
        list.add(new ota0(this.f145242a, this.f145243b));
        list.add(new iqa0(this.f145242a, this.f145243b));
        list.add(new bk90(this.f145242a, this.f145243b));
        list.add(new woa0(this.f145242a, this.f145243b));
        list.add(new kea0(this.f145242a, this.f145243b));
        list.add(new iua0(this.f145242a, this.f145243b));
        if (!rlt.m179881b(this.f145242a.from()) && !TextUtils.equals(this.f145242a.from(), "p_tantanx_card")) {
            list.add(new mqa0(this.f145242a, this.f145243b));
        }
        list.add(new jta0(this.f145242a, this.f145243b));
        list.add(new lpa0(this.f145242a, this.f145243b));
        list.add(new boa0(this.f145242a, this.f145243b));
        list.add(new mi90(this.f145242a, this.f145243b));
        list.add(new ie90(this.f145242a, this.f145243b));
        list.add(new kr90(this.f145242a, this.f145243b));
        list.add(new bq90(this.f145242a, this.f145243b));
        if (CoreModule.m29935P().m94656g().mo35087yc() || CoreModule.m29935P().m94656g().mo35054d9()) {
            list.add(new vr90(this.f145242a, this.f145243b));
        }
        list.add(new ProfileGameItemHolder(this.f145242a, this.f145243b));
        list.add(new uta0(this.f145242a, this.f145243b));
        list.add(new toa0(this.f145242a, this.f145243b));
        list.add(new fr90(this.f145242a, this.f145243b));
        list.add(new yqa0(this.f145242a, this.f145243b));
        list.add(new ls90(this.f145242a, this.f145243b));
        list.add(new rqa0(this.f145242a, this.f145243b));
        list.add(new gta0(this.f145242a, this.f145243b));
        if (!User.ID_OFFICIAL_CHANNEL.equals(this.f145242a.userId()) && !"from_guess_liker_result".equals(this.f145242a.from())) {
            list.add(new ProfileReportItemHolder(this.f145242a, this.f145243b));
        }
        if (!TextUtils.equals(this.f145242a.userId(), CoreModule.m29931H().userId())) {
            list.add(new l33(this.f145242a, this.f145243b));
        }
        list.add(new l33(this.f145242a, this.f145243b));
    }
}
