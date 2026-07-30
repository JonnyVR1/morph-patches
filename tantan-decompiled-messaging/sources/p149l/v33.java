package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class v33 extends or90 {
    public v33(b1m b1mVar, mcr mcrVar) {
        super(b1mVar, mcrVar);
    }

    @Override // p149l.j5q
    /* JADX INFO: renamed from: a */
    public void mo137133a(List<hn2<a1m>> list) {
        list.add(new ProfileImagesItemHolder(this.f145242a, this.f145243b));
        list.add(new wg90(this.f145242a, this.f145243b));
        if (TextUtils.equals(this.f145242a.from(), "push_like")) {
            list.add(new tqa0(this.f145242a, this.f145243b));
        }
        list.add(new zva0(this.f145242a, this.f145243b));
        list.add(new ota0(this.f145242a, this.f145243b));
        list.add(new iqa0(this.f145242a, this.f145243b));
        list.add(new iua0(this.f145242a, this.f145243b));
        list.add(new rqa0(this.f145242a, this.f145243b));
        list.add(new gta0(this.f145242a, this.f145243b));
        if (!TextUtils.equals(this.f145242a.userId(), CoreModule.m29931H().userId())) {
            list.add(new l33(this.f145242a, this.f145243b));
        }
        list.add(new l33(this.f145242a, this.f145243b));
    }
}
