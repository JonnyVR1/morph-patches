package p007l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hrg {

    /* JADX INFO: renamed from: k */
    public static volatile hrg f8798k;

    /* JADX INFO: renamed from: c */
    public WeakReference<zzl> f8801c;

    /* JADX INFO: renamed from: d */
    public WeakReference<PhotoAlbumFeedFrag> f8802d;

    /* JADX INFO: renamed from: e */
    public WeakReference<PhotoAlbumFeedFrag> f8803e;

    /* JADX INFO: renamed from: f */
    public WeakReference<PhotoAlbumFeedFrag> f8804f;

    /* JADX INFO: renamed from: g */
    public WeakReference<PhotoAlbumFeedFrag> f8805g;

    /* JADX INFO: renamed from: i */
    public List<Moment> f8807i;

    /* JADX INFO: renamed from: j */
    public int f8808j;

    /* JADX INFO: renamed from: a */
    public int f8799a = 0;

    /* JADX INFO: renamed from: b */
    public zpd0 f8800b = new zpd0("show_card_guide_bubble_time" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public List<Moment> f8806h = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10713a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10715c(Moment moment, Act act) {
        if (TextUtils.isEmpty(((DbObject) moment).id) || TextUtils.isEmpty(moment.owner)) {
            return;
        }
        if (nkg.m12255o()) {
            act.startActivity(kjb0.m11455g(act, NavigationIntent.get("moment")));
            return;
        }
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(act).m5936f("album").m5943m(((DbObject) moment).id).m5944n(moment.owner).m5950t(true).m5932b();
        if (intentM5932b == null) {
            return;
        }
        act.startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: g */
    public static hrg m10716g() {
        if (f8798k == null) {
            synchronized (hrg.class) {
                try {
                    if (f8798k == null) {
                        f8798k = new hrg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8798k;
    }

    /* JADX INFO: renamed from: d */
    public boolean m10717d(int i, List<Moment> list) {
        if (vwb.J(list)) {
            return false;
        }
        if (nkg.m12213K() && i == 1) {
            i = 4;
        }
        WeakReference<zzl> weakReference = this.f8801c;
        if (weakReference == null || weakReference.get() == null) {
            this.f8808j = i;
            ArrayList arrayList = new ArrayList();
            this.f8807i = arrayList;
            arrayList.addAll(list);
            return false;
        }
        if (i == 1) {
            this.f8801c.get().mo4819j1(0);
            if (nkg.m12263s()) {
                n7c.m12098e().m12100b();
            }
            WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f8802d;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.f8808j = i;
                ArrayList arrayList2 = new ArrayList();
                this.f8807i = arrayList2;
                arrayList2.addAll(list);
                return false;
            }
            m10718e(this.f8802d.get(), list);
        } else if (i == 2) {
            this.f8801c.get().mo4819j1(1);
            WeakReference<PhotoAlbumFeedFrag> weakReference3 = this.f8803e;
            if (weakReference3 == null || weakReference3.get() == null) {
                this.f8808j = i;
                ArrayList arrayList3 = new ArrayList();
                this.f8807i = arrayList3;
                arrayList3.addAll(list);
                return false;
            }
            m10718e(weakReference3.get(), list);
        } else if (i == 4) {
            NewPhotoAlbumFrag.f3001p1.onNext(Boolean.TRUE);
        } else if (i == 5 || i == 6) {
            this.f8801c.get().mo4819j1(14);
            n7c.m12098e().m12102d();
            WeakReference<PhotoAlbumFeedFrag> weakReference4 = this.f8805g;
            if (weakReference4 == null || weakReference4.get() == null) {
                this.f8808j = i;
                ArrayList arrayList4 = new ArrayList();
                this.f8807i = arrayList4;
                arrayList4.addAll(list);
                return false;
            }
            m10718e(weakReference4.get(), list);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m10718e(PhotoAlbumFeedFrag photoAlbumFeedFrag, List<Moment> list) {
        if (photoAlbumFeedFrag == null || vwb.J(list)) {
            return;
        }
        photoAlbumFeedFrag.m5448W4(list);
    }

    /* JADX INFO: renamed from: f */
    public void m10719f(final Act act, final boolean z) {
        act.duringCreated(FeedModule.f316d.m16564V6(null)).subscribe(mkd0.H(new e30() { // from class: l.erg
            public final void call(Object obj) {
                this.f7466a.m10720h(z, act, (j760) obj);
            }
        }, new e30() { // from class: l.frg
            public final void call(Object obj) {
                hrg.m10713a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m10720h(boolean z, Act act, j760 j760Var) {
        Object obj;
        Moment moment;
        User userM16628e8;
        if (j760Var == null || (obj = j760Var.b) == null) {
            return;
        }
        Iterator it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                moment = null;
                userM16628e8 = null;
                break;
            }
            moment = (Moment) it.next();
            if (!TextUtils.isEmpty(moment.owner)) {
                userM16628e8 = FeedModule.f316d.m16628e8(moment.owner);
                if (!NullChecker.a(userM16628e8)) {
                    continue;
                } else if (z) {
                    if (!userM16628e8.isFemale()) {
                        break;
                    }
                } else if (userM16628e8.isFemale()) {
                    break;
                }
            }
        }
        if (NullChecker.a(moment) && NullChecker.a(userM16628e8)) {
            m10727o(act, userM16628e8, moment);
            return;
        }
        if (moment != null || ((List) j760Var.b).size() <= 2) {
            return;
        }
        Moment moment2 = (Moment) ((List) j760Var.b).get(2);
        if (TextUtils.isEmpty(moment2.owner)) {
            return;
        }
        User userM16628e9 = FeedModule.f316d.m16628e8(moment2.owner);
        if (NullChecker.a(moment2) && NullChecker.a(userM16628e9)) {
            m10727o(act, userM16628e9, moment2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m10721i(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f8805g = new WeakReference<>(photoAlbumFeedFrag);
        int i = this.f8808j;
        if ((i == 5 || i == 6) && !vwb.J(this.f8807i)) {
            m10717d(this.f8808j, this.f8807i);
            this.f8807i = null;
            this.f8808j = -1;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m10722j(zzl zzlVar) {
        this.f8801c = new WeakReference<>(zzlVar);
    }

    /* JADX INFO: renamed from: k */
    public void m10723k(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f8802d = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f8808j != 1 || vwb.J(this.f8807i)) {
            return;
        }
        m10717d(1, this.f8807i);
        this.f8807i = null;
        this.f8808j = -1;
    }

    /* JADX INFO: renamed from: l */
    public void m10724l(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f8804f = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f8808j != 4 || vwb.J(this.f8807i)) {
            return;
        }
        m10717d(4, this.f8807i);
        this.f8807i = null;
        this.f8808j = -1;
    }

    /* JADX INFO: renamed from: m */
    public void m10725m(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f8803e = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f8808j != 2 || vwb.J(this.f8807i)) {
            return;
        }
        m10717d(2, this.f8807i);
        this.f8807i = null;
        this.f8808j = -1;
    }

    /* JADX INFO: renamed from: n */
    public void m10726n(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        if (i == 0) {
            m10723k(photoAlbumFeedFrag);
            return;
        }
        if (i == 1) {
            m10725m(photoAlbumFeedFrag);
        } else if (i == 12) {
            m10724l(photoAlbumFeedFrag);
        } else {
            if (i != 14) {
                return;
            }
            m10721i(photoAlbumFeedFrag);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10727o(final Act act, User user, final Moment moment) {
        String str = user.m1042fp().profile128().formatted();
        String str2 = String.format("%s正在参与讨论，等你一起聊聊~", user.isFemale() ? "他" : "她");
        CoreService coreServiceM1140H = FeedModule.m1140H();
        if (!TextUtils.isEmpty(moment.value)) {
            str2 = moment.value;
        }
        coreServiceM1140H.Ni(act, str2, str, new d30() { // from class: l.grg
            public final void call() {
                hrg.m10715c(moment, act);
            }
        });
    }
}
