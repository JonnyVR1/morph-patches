package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.OccasionComponent;
import com.p051p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p051p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;

/* JADX INFO: loaded from: classes13.dex */
public class hth extends AbstractC18534m4 {
    @Override // p153l.vul
    /* JADX INFO: renamed from: a */
    public boolean mo137075a(Act act, String str, wul wulVar) {
        PhotoAlbumBaseFrag photoAlbumBaseFrag;
        C11443a c11443a;
        PostBasePopWindow postBasePopWindowM151356e;
        if (wulVar instanceof p8h) {
            p8h p8hVar = (p8h) wulVar;
            photoAlbumBaseFrag = p8hVar.f151030c;
            c11443a = p8hVar.f151031d;
        } else {
            photoAlbumBaseFrag = null;
            c11443a = null;
        }
        if (photoAlbumBaseFrag == null || c11443a == null || (postBasePopWindowM151356e = kth.m151356e(ksg.m151174K(c11443a.f42231h, c11443a.f42232i), ksg.f128560a)) == null) {
            return false;
        }
        byd0 byd0Var = new byd0("read_count_show_dialog_time_" + postBasePopWindowM151356e.basic.name + FeedModule.m61405F().userId(), 0L);
        vxd0 vxd0Var = new vxd0("read_count_show_dialog_count_" + postBasePopWindowM151356e.basic.name + FeedModule.m61405F().userId(), 0);
        OccasionComponent occasionComponent = postBasePopWindowM151356e.occasion;
        kth.m151358g(byd0Var, vxd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes);
        kth.m151357f(postBasePopWindowM151356e.basic.name);
        act.startActivity(FeedPostBaseDialogAct.m63050a2(act, postBasePopWindowM151356e));
        act.overridePendingTransition(a8c0.f68909i, 0);
        return true;
    }
}
