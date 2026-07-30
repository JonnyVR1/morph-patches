package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class blg extends flh {

    /* JADX INFO: renamed from: m */
    public FeedPhotoAlbumActivitiesFrag f76183m;

    /* JADX INFO: renamed from: n */
    public clg f76184n;

    public blg(FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag) {
        super(feedPhotoAlbumActivitiesFrag);
        this.f76183m = feedPhotoAlbumActivitiesFrag;
        Bundle arguments = feedPhotoAlbumActivitiesFrag.getArguments();
        if (NullChecker.m81303a(arguments)) {
            this.f98175b = arguments.getInt("tab_tag");
            this.f98174a = arguments.getString("from");
            this.f98178e = arguments.getBoolean("needRefreshData", false);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m102524X1(List list) {
        this.f76184n.mo169865z(list);
    }

    @Override // p149l.flh, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        this.f76184n = (clg) this.viewModel;
        super.mo39470a0();
        duringCreated(FeedModule.f38855d.f193026X0).subscribe(mkd0.m154955G(new e30() { // from class: l.alg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70431a.m102524X1((List) obj);
            }
        }));
    }
}
