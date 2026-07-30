package p007l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.mkd0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tfh {

    /* JADX INFO: renamed from: j */
    public static volatile tfh f13276j;

    /* JADX INFO: renamed from: a */
    public WeakReference<zzl> f13277a;

    /* JADX INFO: renamed from: b */
    public WeakReference<PhotoAlbumFeedFrag> f13278b;

    /* JADX INFO: renamed from: c */
    public WeakReference<PhotoAlbumFeedFrag> f13279c;

    /* JADX INFO: renamed from: d */
    public WeakReference<PhotoAlbumFeedFrag> f13280d;

    /* JADX INFO: renamed from: e */
    public WeakReference<PhotoAlbumFeedFrag> f13281e;

    /* JADX INFO: renamed from: f */
    public WeakReference<PhotoAlbumFeedFrag> f13282f;

    /* JADX INFO: renamed from: g */
    public Pair<String, String> f13283g;

    /* JADX INFO: renamed from: h */
    public Pair<String, String> f13284h;

    /* JADX INFO: renamed from: i */
    public Pair<String, String> f13285i;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14516a(boolean[] zArr, PhotoAlbumFeedFrag photoAlbumFeedFrag, xaj0 xaj0Var) {
        if (zArr.length != 0) {
            FeedModule.f316d.f14923G1 = "recommend";
        }
        photoAlbumFeedFrag.m5449X4((Moment) xaj0Var.a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14517b(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static tfh m14518h() {
        if (f13276j == null) {
            synchronized (tfh.class) {
                try {
                    if (f13276j == null) {
                        f13276j = new tfh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13276j;
    }

    /* JADX INFO: renamed from: c */
    public boolean m14519c(String str, String str2) {
        if (m14524i(str, str2, "p_follow", new HashMap())) {
            return true;
        }
        WeakReference<zzl> weakReference = this.f13277a;
        if (weakReference == null || weakReference.get() == null) {
            this.f13284h = new Pair<>(str, str2);
            return false;
        }
        this.f13277a.get().mo4819j1(0);
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f13278b;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f13284h = new Pair<>(str, str2);
            return false;
        }
        m14523g(this.f13278b.get(), str, str2, new boolean[0]);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean m14520d(String str, String str2) {
        if (m14524i(str, str2, "p_discover_dating", new HashMap())) {
            return true;
        }
        if (nkg.m12213K()) {
            NewPhotoAlbumFrag.f3001p1.onNext(Boolean.TRUE);
            return true;
        }
        WeakReference<zzl> weakReference = this.f13277a;
        if (weakReference == null || weakReference.get() == null) {
            this.f13284h = new Pair<>(str, str2);
            return false;
        }
        this.f13277a.get().mo4819j1(14);
        n7c.m12098e().m12100b();
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f13278b;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f13284h = new Pair<>(str, str2);
            return false;
        }
        m14523g(this.f13278b.get(), str, str2, new boolean[0]);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m14521e(String str, String str2, String str3, Map<String, String> map) {
        if ((!TextUtils.isEmpty(str) && m14524i(str2, str3, str, map)) || m14524i(str2, str3, "p_discover_dating", new HashMap())) {
            return true;
        }
        WeakReference<zzl> weakReference = this.f13277a;
        if (weakReference == null || weakReference.get() == null) {
            this.f13283g = new Pair<>(str2, str3);
            return false;
        }
        zzl zzlVar = this.f13277a.get();
        if (nkg.m12263s()) {
            zzlVar.mo4819j1(14);
            n7c.m12098e().m12102d();
            WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f13282f;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.f13283g = new Pair<>(str2, str3);
                return false;
            }
            m14523g(weakReference2.get(), str2, str3, new boolean[0]);
        } else {
            zzlVar.mo4819j1(1);
            WeakReference<PhotoAlbumFeedFrag> weakReference3 = this.f13280d;
            if (weakReference3 == null || weakReference3.get() == null) {
                this.f13283g = new Pair<>(str2, str3);
                return false;
            }
            m14523g(weakReference3.get(), str2, str3, new boolean[0]);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14522f(String str, String str2) {
        if (m14524i(str, str2, "p_like", new HashMap())) {
            return true;
        }
        if (nkg.m12213K()) {
            NewPhotoAlbumFrag.f3001p1.onNext(Boolean.TRUE);
            return true;
        }
        WeakReference<zzl> weakReference = this.f13277a;
        if (weakReference == null || weakReference.get() == null) {
            this.f13285i = new Pair<>(str, str2);
            return false;
        }
        this.f13277a.get().mo4819j1(12);
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f13279c;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f13285i = new Pair<>(str, str2);
            return false;
        }
        m14523g(this.f13279c.get(), str, str2, true);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m14523g(final PhotoAlbumFeedFrag photoAlbumFeedFrag, String str, String str2, final boolean... zArr) {
        if (photoAlbumFeedFrag == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        photoAlbumFeedFrag.duringCreated(FeedModule.f316d.m16555Tb(str2, str, false)).subscribe(mkd0.H(new e30() { // from class: l.rfh
            public final void call(Object obj) {
                tfh.m14516a(zArr, photoAlbumFeedFrag, (xaj0) obj);
            }
        }, new e30() { // from class: l.sfh
            public final void call(Object obj) {
                tfh.m14517b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m14524i(String str, String str2, String str3, Map<String, String> map) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m14525j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f13282f = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.a(this.f13283g)) {
            Pair<String, String> pair = this.f13283g;
            m14520d((String) pair.first, (String) pair.second);
            this.f13283g = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14526k(zzl zzlVar) {
        this.f13277a = new WeakReference<>(zzlVar);
    }

    /* JADX INFO: renamed from: l */
    public void m14527l(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f13281e = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.a(this.f13283g)) {
            Pair<String, String> pair = this.f13283g;
            m14521e("", (String) pair.first, (String) pair.second, new HashMap());
            this.f13283g = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m14528m(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f13278b = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.a(this.f13284h)) {
            Pair<String, String> pair = this.f13284h;
            m14519c((String) pair.first, (String) pair.second);
            this.f13284h = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14529n(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f13279c = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.a(this.f13285i)) {
            Pair<String, String> pair = this.f13284h;
            m14522f((String) pair.first, (String) pair.second);
            this.f13285i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m14530o(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f13280d = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.a(this.f13283g)) {
            Pair<String, String> pair = this.f13283g;
            m14521e("", (String) pair.first, (String) pair.second, new HashMap());
            this.f13283g = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m14531p(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        if (i == 0) {
            m14528m(photoAlbumFeedFrag);
            return;
        }
        if (i == 1) {
            m14530o(photoAlbumFeedFrag);
            return;
        }
        if (i == 12) {
            m14529n(photoAlbumFeedFrag);
        } else if (i == 14) {
            m14525j(photoAlbumFeedFrag);
        } else {
            if (i != 15) {
                return;
            }
            m14527l(photoAlbumFeedFrag);
        }
    }
}
