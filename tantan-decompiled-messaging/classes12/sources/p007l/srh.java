package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.OccasionComponent;
import com.p000p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p000p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.C2124a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p1.mobile.android.app.Act;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class srh extends AbstractC2433n4 {
    @Override // p007l.hsl
    /* JADX INFO: renamed from: a */
    public boolean mo10498a(Act act, String str, isl islVar) {
        PhotoAlbumBaseFrag photoAlbumBaseFrag;
        C2124a c2124a;
        PostBasePopWindow postBasePopWindowM15560e;
        if (islVar instanceof a7h) {
            a7h a7hVar = (a7h) islVar;
            photoAlbumBaseFrag = a7hVar.f5624c;
            c2124a = a7hVar.f5625d;
        } else {
            photoAlbumBaseFrag = null;
            c2124a = null;
        }
        if (photoAlbumBaseFrag == null || c2124a == null || (postBasePopWindowM15560e = vrh.m15560e(vqg.m15485K(c2124a.f2844h, c2124a.f2845i), vqg.f14268a)) == null) {
            return false;
        }
        zpd0 zpd0Var = new zpd0("read_count_show_dialog_time_" + postBasePopWindowM15560e.basic.name + FeedModule.m1139F().userId(), 0L);
        tpd0 tpd0Var = new tpd0("read_count_show_dialog_count_" + postBasePopWindowM15560e.basic.name + FeedModule.m1139F().userId(), 0);
        OccasionComponent occasionComponent = postBasePopWindowM15560e.occasion;
        vrh.m15562g(zpd0Var, tpd0Var, occasionComponent.days, occasionComponent.intervalDays, occasionComponent.showTimes);
        vrh.m15561f(postBasePopWindowM15560e.basic.name);
        act.startActivity(FeedPostBaseDialogAct.m2834Z1(act, postBasePopWindowM15560e));
        act.overridePendingTransition(uzb0.f13995i, 0);
        return true;
    }
}
