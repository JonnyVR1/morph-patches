package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.jq2;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class blg extends flh {

    /* JADX INFO: renamed from: m */
    public FeedPhotoAlbumActivitiesFrag f6364m;

    /* JADX INFO: renamed from: n */
    public clg f6365n;

    public blg(FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag) {
        super(feedPhotoAlbumActivitiesFrag);
        this.f6364m = feedPhotoAlbumActivitiesFrag;
        Bundle arguments = feedPhotoAlbumActivitiesFrag.getArguments();
        if (NullChecker.a(arguments)) {
            this.f8142b = arguments.getInt("tab_tag");
            this.f8141a = arguments.getString("from");
            this.f8145e = arguments.getBoolean("needRefreshData", false);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m8908X1(List list) {
        this.f6365n.mo13062z(list);
    }

    @Override // p007l.flh
    /* JADX INFO: renamed from: a0 */
    public void mo8909a0() {
        this.f6365n = (clg) ((jq2) this).viewModel;
        super.mo8909a0();
        duringCreated(FeedModule.f316d.f14961X0).subscribe(mkd0.G(new e30() { // from class: l.alg
            public final void call(Object obj) {
                this.f5774a.m8908X1((List) obj);
            }
        }));
    }
}
