package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v33 extends or90 {
    public v33(b1m b1mVar, mcr mcrVar) {
        super(b1mVar, mcrVar);
    }

    @Override // p002l.j5q
    /* JADX INFO: renamed from: a */
    public void mo15243a(List<hn2<a1m>> list) {
        list.add(new ProfileImagesItemHolder(this.f16756a, this.f16757b));
        list.add(new wg90(this.f16756a, this.f16757b));
        if (TextUtils.equals(this.f16756a.from(), "push_like")) {
            list.add(new tqa0(this.f16756a, this.f16757b));
        }
        list.add(new zva0(this.f16756a, this.f16757b));
        list.add(new ota0(this.f16756a, this.f16757b));
        list.add(new iqa0(this.f16756a, this.f16757b));
        list.add(new iua0(this.f16756a, this.f16757b));
        list.add(new rqa0(this.f16756a, this.f16757b));
        list.add(new gta0(this.f16756a, this.f16757b));
        if (!TextUtils.equals(this.f16756a.userId(), CoreModule.H().userId())) {
            list.add(new l33(this.f16756a, this.f16757b));
        }
        list.add(new l33(this.f16756a, this.f16757b));
    }
}
