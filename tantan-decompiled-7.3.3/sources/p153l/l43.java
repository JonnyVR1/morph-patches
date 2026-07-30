package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l43 extends sz90 {
    public l43(u3m u3mVar, ner nerVar) {
        super(u3mVar, nerVar);
    }

    @Override // p153l.j7q
    /* JADX INFO: renamed from: a */
    public void mo142369a(List<on2<t3m>> list) {
        list.add(new ProfileImagesItemHolder(this.f171366a, this.f171367b));
        list.add(new ap90(this.f171366a, this.f171367b));
        if (TextUtils.equals(this.f171366a.from(), "push_like")) {
            list.add(new xya0(this.f171366a, this.f171367b));
        }
        list.add(new d4b0(this.f171366a, this.f171367b));
        list.add(new s1b0(this.f171366a, this.f171367b));
        list.add(new mya0(this.f171366a, this.f171367b));
        list.add(new m2b0(this.f171366a, this.f171367b));
        list.add(new vya0(this.f171366a, this.f171367b));
        list.add(new k1b0(this.f171366a, this.f171367b));
        if (!TextUtils.equals(this.f171366a.userId(), CoreModule.m30929H().userId())) {
            list.add(new b43(this.f171366a, this.f171367b));
        }
        list.add(new b43(this.f171366a, this.f171367b));
    }
}
