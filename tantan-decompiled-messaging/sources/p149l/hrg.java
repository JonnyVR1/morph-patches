package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class hrg {

    /* JADX INFO: renamed from: k */
    public static volatile hrg f109207k;

    /* JADX INFO: renamed from: c */
    public WeakReference<zzl> f109210c;

    /* JADX INFO: renamed from: d */
    public WeakReference<PhotoAlbumFeedFrag> f109211d;

    /* JADX INFO: renamed from: e */
    public WeakReference<PhotoAlbumFeedFrag> f109212e;

    /* JADX INFO: renamed from: f */
    public WeakReference<PhotoAlbumFeedFrag> f109213f;

    /* JADX INFO: renamed from: g */
    public WeakReference<PhotoAlbumFeedFrag> f109214g;

    /* JADX INFO: renamed from: i */
    public List<Moment> f109216i;

    /* JADX INFO: renamed from: j */
    public int f109217j;

    /* JADX INFO: renamed from: a */
    public int f109208a = 0;

    /* JADX INFO: renamed from: b */
    public zpd0 f109209b = new zpd0("show_card_guide_bubble_time" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: h */
    public List<Moment> f109215h = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m132670a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m132672c(Moment moment, Act act) {
        if (TextUtils.isEmpty(moment.f56011id) || TextUtils.isEmpty(moment.owner)) {
            return;
        }
        if (nkg.m159896o()) {
            act.startActivity(kjb0.m146196g(act, NavigationIntent.get("moment")));
            return;
        }
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(act).m64839f(ProfileLikeModuleType.album).m64846m(moment.f56011id).m64847n(moment.owner).m64853t(true).m64835b();
        if (intentM64835b == null) {
            return;
        }
        act.startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: g */
    public static hrg m132673g() {
        if (f109207k == null) {
            synchronized (hrg.class) {
                try {
                    if (f109207k == null) {
                        f109207k = new hrg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f109207k;
    }

    /* JADX INFO: renamed from: d */
    public boolean m132674d(int i, List<Moment> list) {
        if (vwb.m200296J(list)) {
            return false;
        }
        if (nkg.m159854K() && i == 1) {
            i = 4;
        }
        WeakReference<zzl> weakReference = this.f109210c;
        if (weakReference == null || weakReference.get() == null) {
            this.f109217j = i;
            ArrayList arrayList = new ArrayList();
            this.f109216i = arrayList;
            arrayList.addAll(list);
            return false;
        }
        if (i == 1) {
            this.f109210c.get().mo63793j1(0);
            if (nkg.m159904s()) {
                n7c.m158118e().m158120b();
            }
            WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f109211d;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.f109217j = i;
                ArrayList arrayList2 = new ArrayList();
                this.f109216i = arrayList2;
                arrayList2.addAll(list);
                return false;
            }
            m132675e(this.f109211d.get(), list);
        } else if (i == 2) {
            this.f109210c.get().mo63793j1(1);
            WeakReference<PhotoAlbumFeedFrag> weakReference3 = this.f109212e;
            if (weakReference3 == null || weakReference3.get() == null) {
                this.f109217j = i;
                ArrayList arrayList3 = new ArrayList();
                this.f109216i = arrayList3;
                arrayList3.addAll(list);
                return false;
            }
            m132675e(weakReference3.get(), list);
        } else if (i == 4) {
            NewPhotoAlbumFrag.f41540p1.m132487l(Boolean.TRUE);
        } else if (i == 5 || i == 6) {
            this.f109210c.get().mo63793j1(14);
            n7c.m158118e().m158122d();
            WeakReference<PhotoAlbumFeedFrag> weakReference4 = this.f109214g;
            if (weakReference4 == null || weakReference4.get() == null) {
                this.f109217j = i;
                ArrayList arrayList4 = new ArrayList();
                this.f109216i = arrayList4;
                arrayList4.addAll(list);
                return false;
            }
            m132675e(weakReference4.get(), list);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m132675e(PhotoAlbumFeedFrag photoAlbumFeedFrag, List<Moment> list) {
        if (photoAlbumFeedFrag == null || vwb.m200296J(list)) {
            return;
        }
        photoAlbumFeedFrag.m64374W4(list);
    }

    /* JADX INFO: renamed from: f */
    public void m132676f(final Act act, final boolean z) {
        act.duringCreated(FeedModule.f38855d.m209383V6(null)).subscribe(mkd0.m154956H(new e30() { // from class: l.erg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92911a.m132677h(z, act, (j760) obj);
            }
        }, new e30() { // from class: l.frg
            @Override // p149l.e30
            public final void call(Object obj) {
                hrg.m132670a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m132677h(boolean z, Act act, j760 j760Var) {
        S s;
        Moment moment;
        User userM209447e8;
        if (j760Var == null || (s = j760Var.f116565b) == 0) {
            return;
        }
        Iterator it = ((List) s).iterator();
        while (true) {
            if (!it.hasNext()) {
                moment = null;
                userM209447e8 = null;
                break;
            }
            moment = (Moment) it.next();
            if (!TextUtils.isEmpty(moment.owner)) {
                userM209447e8 = FeedModule.f38855d.m209447e8(moment.owner);
                if (!NullChecker.m81303a(userM209447e8)) {
                    continue;
                } else if (z) {
                    if (!userM209447e8.isFemale()) {
                        break;
                    }
                } else if (userM209447e8.isFemale()) {
                    break;
                }
            }
        }
        if (NullChecker.m81303a(moment) && NullChecker.m81303a(userM209447e8)) {
            m132684o(act, userM209447e8, moment);
            return;
        }
        if (moment != null || ((List) j760Var.f116565b).size() <= 2) {
            return;
        }
        Moment moment2 = (Moment) ((List) j760Var.f116565b).get(2);
        if (TextUtils.isEmpty(moment2.owner)) {
            return;
        }
        User userM209447e9 = FeedModule.f38855d.m209447e8(moment2.owner);
        if (NullChecker.m81303a(moment2) && NullChecker.m81303a(userM209447e9)) {
            m132684o(act, userM209447e9, moment2);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m132678i(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f109214g = new WeakReference<>(photoAlbumFeedFrag);
        int i = this.f109217j;
        if ((i == 5 || i == 6) && !vwb.m200296J(this.f109216i)) {
            m132674d(this.f109217j, this.f109216i);
            this.f109216i = null;
            this.f109217j = -1;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m132679j(zzl zzlVar) {
        this.f109210c = new WeakReference<>(zzlVar);
    }

    /* JADX INFO: renamed from: k */
    public void m132680k(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f109211d = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f109217j != 1 || vwb.m200296J(this.f109216i)) {
            return;
        }
        m132674d(1, this.f109216i);
        this.f109216i = null;
        this.f109217j = -1;
    }

    /* JADX INFO: renamed from: l */
    public void m132681l(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f109213f = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f109217j != 4 || vwb.m200296J(this.f109216i)) {
            return;
        }
        m132674d(4, this.f109216i);
        this.f109216i = null;
        this.f109217j = -1;
    }

    /* JADX INFO: renamed from: m */
    public void m132682m(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f109212e = new WeakReference<>(photoAlbumFeedFrag);
        if (this.f109217j != 2 || vwb.m200296J(this.f109216i)) {
            return;
        }
        m132674d(2, this.f109216i);
        this.f109216i = null;
        this.f109217j = -1;
    }

    /* JADX INFO: renamed from: n */
    public void m132683n(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        if (i == 0) {
            m132680k(photoAlbumFeedFrag);
            return;
        }
        if (i == 1) {
            m132682m(photoAlbumFeedFrag);
        } else if (i == 12) {
            m132681l(photoAlbumFeedFrag);
        } else {
            if (i != 14) {
                return;
            }
            m132678i(photoAlbumFeedFrag);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m132684o(final Act act, User user, final Moment moment) {
        String str = user.m60124fp().profile128().formatted();
        String str2 = String.format("%s正在参与讨论，等你一起聊聊~", user.isFemale() ? "他" : "她");
        CoreService coreServiceM60222H = FeedModule.m60222H();
        if (!TextUtils.isEmpty(moment.value)) {
            str2 = moment.value;
        }
        coreServiceM60222H.mo30712Ni(act, str2, str, new d30() { // from class: l.grg
            @Override // p149l.d30
            public final void call() {
                hrg.m132672c(moment, act);
            }
        });
    }
}
