package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.OccasionComponent;
import com.p046p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p046p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.C11280a;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;

/* JADX INFO: loaded from: classes12.dex */
public class srh extends AbstractC18619n4 {
    @Override // p149l.hsl
    /* JADX INFO: renamed from: a */
    public boolean mo128028a(Act act, String str, isl islVar) {
        PhotoAlbumBaseFrag photoAlbumBaseFrag;
        C11280a c11280a;
        PostBasePopWindow postBasePopWindowM199661e;
        if (islVar instanceof a7h) {
            a7h a7hVar = (a7h) islVar;
            photoAlbumBaseFrag = a7hVar.f67927c;
            c11280a = a7hVar.f67928d;
        } else {
            photoAlbumBaseFrag = null;
            c11280a = null;
        }
        if (photoAlbumBaseFrag == null || c11280a == null || (postBasePopWindowM199661e = vrh.m199661e(vqg.m199515K(c11280a.f41383h, c11280a.f41384i), vqg.f182637a)) == null) {
            return false;
        }
        zpd0 zpd0Var = new zpd0("read_count_show_dialog_time_" + postBasePopWindowM199661e.basic.name + FeedModule.m60221F().userId(), 0L);
        tpd0 tpd0Var = new tpd0("read_count_show_dialog_count_" + postBasePopWindowM199661e.basic.name + FeedModule.m60221F().userId(), 0);
        OccasionComponent occasionComponent = postBasePopWindowM199661e.occasion;
        vrh.m199663g(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes);
        vrh.m199662f(postBasePopWindowM199661e.basic.name);
        act.startActivity(FeedPostBaseDialogAct.m61867Z1(act, postBasePopWindowM199661e));
        act.overridePendingTransition(uzb0.f178984i, 0);
        return true;
    }
}
