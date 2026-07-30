package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab.FeedPhotoAlbumActivitiesFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class qmg extends umh {

    /* JADX INFO: renamed from: m */
    public FeedPhotoAlbumActivitiesFrag f158343m;

    /* JADX INFO: renamed from: n */
    public rmg f158344n;

    public qmg(FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag) {
        super(feedPhotoAlbumActivitiesFrag);
        this.f158343m = feedPhotoAlbumActivitiesFrag;
        Bundle arguments = feedPhotoAlbumActivitiesFrag.getArguments();
        if (NullChecker.m82486a(arguments)) {
            this.f179639b = arguments.getInt("tab_tag");
            this.f179638a = arguments.getString("from");
            this.f179642e = arguments.getBoolean("needRefreshData", false);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m177111X1(List list) {
        this.f158344n.mo121175z(list);
    }

    @Override // p153l.umh, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        this.f158344n = (rmg) this.viewModel;
        super.mo40473a0();
        duringCreated(FeedModule.f39703d.f121336X0).subscribe(psd0.m173596G(new y20() { // from class: l.pmg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153182a.m177111X1((List) obj);
            }
        }));
    }
}
