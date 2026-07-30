package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class wsg {

    /* JADX INFO: renamed from: k */
    public static volatile wsg f190630k;

    /* JADX INFO: renamed from: c */
    public WeakReference<t2m> f190633c;

    /* JADX INFO: renamed from: d */
    public WeakReference<PhotoAlbumFeedFrag> f190634d;

    /* JADX INFO: renamed from: e */
    public WeakReference<PhotoAlbumFeedFrag> f190635e;

    /* JADX INFO: renamed from: f */
    public WeakReference<PhotoAlbumFeedFrag> f190636f;

    /* JADX INFO: renamed from: g */
    public WeakReference<PhotoAlbumFeedFrag> f190637g;

    /* JADX INFO: renamed from: i */
    public List<Moment> f190639i;

    /* JADX INFO: renamed from: j */
    public int f190640j;

    /* JADX INFO: renamed from: a */
    public int f190631a = 0;

    /* JADX INFO: renamed from: b */
    public byd0 f190632b = new byd0("show_card_guide_bubble_time" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public List<Moment> f190638h = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m207769a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m207771c(Moment moment, Act act) {
        if (TextUtils.isEmpty(moment.f56859id) || TextUtils.isEmpty(moment.owner)) {
            return;
        }
        if (cmg.m111225o()) {
            act.startActivity(orb0.m168890g(act, NavigationIntent.get("moment")));
            return;
        }
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(act).m66022f(ProfileLikeModuleType.album).m66029m(moment.f56859id).m66030n(moment.owner).m66036t(true).m66018b();
        if (intentM66018b == null) {
            return;
        }
        act.startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: g */
    public static wsg m207772g() {
        if (f190630k == null) {
            synchronized (wsg.class) {
                try {
                    if (f190630k == null) {
                        f190630k = new wsg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f190630k;
    }

    /* JADX INFO: renamed from: d */
    public boolean m207773d(int i, List<Moment> list) {
        if (jyb.m147479J(list)) {
            return false;
        }
        if (cmg.m111183K() && i == 1) {
            i = 4;
        }
        WeakReference<t2m> weakReference = this.f190633c;
        if (weakReference == null || weakReference.get() == null) {
            this.f190640j = i;
            ArrayList arrayList = new ArrayList();
            this.f190639i = arrayList;
            arrayList.addAll(list);
            return false;
        }
        if (i == 1) {
            this.f190633c.get().mo64976j1(0);
            if (cmg.m111233s()) {
                t8c.m189652e().m189654b();
            }
            WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f190634d;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.f190640j = i;
                ArrayList arrayList2 = new ArrayList();
                this.f190639i = arrayList2;
                arrayList2.addAll(list);
                return false;
            }
            m207774e(this.f190634d.get(), list);
        } else if (i == 2) {
            this.f190633c.get().mo64976j1(1);
            WeakReference<PhotoAlbumFeedFrag> weakReference3 = this.f190635e;
            if (weakReference3 == null || weakReference3.get() == null) {
                this.f190640j = i;
                ArrayList arrayList3 = new ArrayList();
                this.f190639i = arrayList3;
                arrayList3.addAll(list);
                return false;
            }
            m207774e(weakReference3.get(), list);
        } else if (i == 4) {
            NewPhotoAlbumFrag.f42388p1.m137019l(Boolean.TRUE);
        } else if (i == 5 || i == 6) {
            this.f190633c.get().mo64976j1(14);
            t8c.m189652e().m189656d();
            WeakReference<PhotoAlbumFeedFrag> weakReference4 = this.f190637g;
            if (weakReference4 == null || weakReference4.get() == null) {
                this.f190640j = i;
                ArrayList arrayList4 = new ArrayList();
                this.f190639i = arrayList4;
                arrayList4.addAll(list);
                return false;
            }
            m207774e(weakReference4.get(), list);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m207774e(PhotoAlbumFeedFrag photoAlbumFeedFrag, List<Moment> list) {
        if (photoAlbumFeedFrag == null || jyb.m147479J(list)) {
            return;
        }
        photoAlbumFeedFrag.m65557W4(list);
    }

    /* JADX INFO: renamed from: f */
    public void m207775f(final Act act, final boolean z) {
        act.duringCreated(FeedModule.f39703d.m145624V6(null)).subscribe(psd0.m173597H(new y20() { // from class: l.tsg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175992a.m207776h(z, act, (pf60) obj);
            }
        }, new y20() { // from class: l.usg
            @Override // p153l.y20
            public final void call(Object obj) {
                wsg.m207769a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m207776h(boolean z, Act act, pf60 pf60Var) {
        S s;
        Moment moment;
        User userM145688e8;
        if (pf60Var == null || (s = pf60Var.f152157b) == 0) {
            return;
        }
        Iterator it = ((List) s).iterator();
        while (true) {
            if (!it.hasNext()) {
                moment = null;
                userM145688e8 = null;
                break;
            }
            moment = (Moment) it.next();
            if (!TextUtils.isEmpty(moment.owner)) {
                userM145688e8 = FeedModule.f39703d.m145688e8(moment.owner);
                if (!NullChecker.m82486a(userM145688e8)) {
                    continue;
                } else if (z) {
                    if (!userM145688e8.isFemale()) {
                        break;
                    }
                } else if (userM145688e8.isFemale()) {
                    break;
                }
            }
        }
        if (NullChecker.m82486a(moment) && NullChecker.m82486a(userM145688e8)) {
            m207783o(act, userM145688e8, moment);
            return;
        }
        if (moment != null || ((List) pf60Var.f152157b).size() <= 2) {
            return;
        }
        Moment moment2 = (Moment) ((List) pf60Var.f152157b).get(2);
        if (TextUtils.isEmpty(moment2.owner)) {
            return;
        }
        User userM145688e9 = FeedModule.f39703d.m145688e8(moment2.owner);
        if (NullChecker.m82486a(moment2) && NullChecker.m82486a(userM145688e9)) {
            m207783o(act, userM145688e9, moment2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m207777i(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f190637g = new WeakReference<>(photoAlbumFeedFrag);
        int i = this.f190640j;
        if ((i == 5 || i == 6) && !jyb.m147479J(this.f190639i)) {
            m207773d(this.f190640j, this.f190639i);
            this.f190639i = null;
            this.f190640j = -1;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m207778j(t2m t2mVar) {
        this.f190633c = new WeakReference<>(t2mVar);
    }

    /* JADX INFO: renamed from: k */
    public void m207779k(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f190634d = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f190640j != 1 || jyb.m147479J(this.f190639i)) {
            return;
        }
        m207773d(1, this.f190639i);
        this.f190639i = null;
        this.f190640j = -1;
    }

    /* JADX INFO: renamed from: l */
    public void m207780l(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f190636f = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f190640j != 4 || jyb.m147479J(this.f190639i)) {
            return;
        }
        m207773d(4, this.f190639i);
        this.f190639i = null;
        this.f190640j = -1;
    }

    /* JADX INFO: renamed from: m */
    public void m207781m(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f190635e = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f190640j != 2 || jyb.m147479J(this.f190639i)) {
            return;
        }
        m207773d(2, this.f190639i);
        this.f190639i = null;
        this.f190640j = -1;
    }

    /* JADX INFO: renamed from: n */
    public void m207782n(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        if (i == 0) {
            m207779k(photoAlbumFeedFrag);
            return;
        }
        if (i == 1) {
            m207781m(photoAlbumFeedFrag);
        } else if (i == 12) {
            m207780l(photoAlbumFeedFrag);
        } else {
            if (i != 14) {
                return;
            }
            m207777i(photoAlbumFeedFrag);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m207783o(final Act act, User user, final Moment moment) {
        String str = user.m61308fp().profile128().formatted();
        String str2 = String.format("%s正在参与讨论，等你一起聊聊~", user.isFemale() ? "他" : "她");
        CoreService coreServiceM61406H = FeedModule.m61406H();
        if (!TextUtils.isEmpty(moment.value)) {
            str2 = moment.value;
        }
        coreServiceM61406H.mo31715Ni(act, str2, str, new x20() { // from class: l.vsg
            @Override // p153l.x20
            public final void call() {
                wsg.m207771c(moment, act);
            }
        });
    }
}
