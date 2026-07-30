package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ihh {

    /* JADX INFO: renamed from: j */
    public static volatile ihh f114939j;

    /* JADX INFO: renamed from: a */
    public WeakReference<t2m> f114940a;

    /* JADX INFO: renamed from: b */
    public WeakReference<PhotoAlbumFeedFrag> f114941b;

    /* JADX INFO: renamed from: c */
    public WeakReference<PhotoAlbumFeedFrag> f114942c;

    /* JADX INFO: renamed from: d */
    public WeakReference<PhotoAlbumFeedFrag> f114943d;

    /* JADX INFO: renamed from: e */
    public WeakReference<PhotoAlbumFeedFrag> f114944e;

    /* JADX INFO: renamed from: f */
    public WeakReference<PhotoAlbumFeedFrag> f114945f;

    /* JADX INFO: renamed from: g */
    public Pair<String, String> f114946g;

    /* JADX INFO: renamed from: h */
    public Pair<String, String> f114947h;

    /* JADX INFO: renamed from: i */
    public Pair<String, String> f114948i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m139975a(boolean[] zArr, PhotoAlbumFeedFrag photoAlbumFeedFrag, bkj0 bkj0Var) {
        if (zArr.length != 0) {
            FeedModule.f39703d.f121298G1 = "recommend";
        }
        photoAlbumFeedFrag.m65558X4((Moment) bkj0Var.f77081a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m139976b(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static ihh m139977h() {
        if (f114939j == null) {
            synchronized (ihh.class) {
                try {
                    if (f114939j == null) {
                        f114939j = new ihh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f114939j;
    }

    /* JADX INFO: renamed from: c */
    public boolean m139978c(String str, String str2) {
        if (m139983i(str, str2, "p_follow", new HashMap())) {
            return true;
        }
        WeakReference<t2m> weakReference = this.f114940a;
        if (weakReference == null || weakReference.get() == null) {
            this.f114947h = new Pair<>(str, str2);
            return false;
        }
        this.f114940a.get().mo64976j1(0);
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f114941b;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f114947h = new Pair<>(str, str2);
            return false;
        }
        m139982g(this.f114941b.get(), str, str2, new boolean[0]);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean m139979d(String str, String str2) {
        if (m139983i(str, str2, "p_discover_dating", new HashMap())) {
            return true;
        }
        if (cmg.m111183K()) {
            NewPhotoAlbumFrag.f42388p1.m137019l(Boolean.TRUE);
            return true;
        }
        WeakReference<t2m> weakReference = this.f114940a;
        if (weakReference == null || weakReference.get() == null) {
            this.f114947h = new Pair<>(str, str2);
            return false;
        }
        this.f114940a.get().mo64976j1(14);
        t8c.m189652e().m189654b();
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f114941b;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f114947h = new Pair<>(str, str2);
            return false;
        }
        m139982g(this.f114941b.get(), str, str2, new boolean[0]);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m139980e(String str, String str2, String str3, Map<String, String> map) {
        if ((!TextUtils.isEmpty(str) && m139983i(str2, str3, str, map)) || m139983i(str2, str3, "p_discover_dating", new HashMap())) {
            return true;
        }
        WeakReference<t2m> weakReference = this.f114940a;
        if (weakReference == null || weakReference.get() == null) {
            this.f114946g = new Pair<>(str2, str3);
            return false;
        }
        t2m t2mVar = this.f114940a.get();
        if (cmg.m111233s()) {
            t2mVar.mo64976j1(14);
            t8c.m189652e().m189656d();
            WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f114945f;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.f114946g = new Pair<>(str2, str3);
                return false;
            }
            m139982g(weakReference2.get(), str2, str3, new boolean[0]);
        } else {
            t2mVar.mo64976j1(1);
            WeakReference<PhotoAlbumFeedFrag> weakReference3 = this.f114943d;
            if (weakReference3 == null || weakReference3.get() == null) {
                this.f114946g = new Pair<>(str2, str3);
                return false;
            }
            m139982g(weakReference3.get(), str2, str3, new boolean[0]);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m139981f(String str, String str2) {
        if (m139983i(str, str2, "p_like", new HashMap())) {
            return true;
        }
        if (cmg.m111183K()) {
            NewPhotoAlbumFrag.f42388p1.m137019l(Boolean.TRUE);
            return true;
        }
        WeakReference<t2m> weakReference = this.f114940a;
        if (weakReference == null || weakReference.get() == null) {
            this.f114948i = new Pair<>(str, str2);
            return false;
        }
        this.f114940a.get().mo64976j1(12);
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f114942c;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f114948i = new Pair<>(str, str2);
            return false;
        }
        m139982g(this.f114942c.get(), str, str2, true);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m139982g(final PhotoAlbumFeedFrag photoAlbumFeedFrag, String str, String str2, final boolean... zArr) {
        if (photoAlbumFeedFrag == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        photoAlbumFeedFrag.duringCreated(FeedModule.f39703d.m145615Tb(str2, str, false)).subscribe(psd0.m173597H(new y20() { // from class: l.ghh
            @Override // p153l.y20
            public final void call(Object obj) {
                ihh.m139975a(zArr, photoAlbumFeedFrag, (bkj0) obj);
            }
        }, new y20() { // from class: l.hhh
            @Override // p153l.y20
            public final void call(Object obj) {
                ihh.m139976b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m139983i(String str, String str2, String str3, Map<String, String> map) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m139984j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f114945f = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m82486a(this.f114946g)) {
            Pair<String, String> pair = this.f114946g;
            m139979d((String) pair.first, (String) pair.second);
            this.f114946g = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m139985k(t2m t2mVar) {
        this.f114940a = new WeakReference<>(t2mVar);
    }

    /* JADX INFO: renamed from: l */
    public void m139986l(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f114944e = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m82486a(this.f114946g)) {
            Pair<String, String> pair = this.f114946g;
            m139980e("", (String) pair.first, (String) pair.second, new HashMap());
            this.f114946g = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m139987m(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f114941b = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m82486a(this.f114947h)) {
            Pair<String, String> pair = this.f114947h;
            m139978c((String) pair.first, (String) pair.second);
            this.f114947h = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m139988n(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f114942c = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m82486a(this.f114948i)) {
            Pair<String, String> pair = this.f114947h;
            m139981f((String) pair.first, (String) pair.second);
            this.f114948i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m139989o(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f114943d = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m82486a(this.f114946g)) {
            Pair<String, String> pair = this.f114946g;
            m139980e("", (String) pair.first, (String) pair.second, new HashMap());
            this.f114946g = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m139990p(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        if (i == 0) {
            m139987m(photoAlbumFeedFrag);
            return;
        }
        if (i == 1) {
            m139989o(photoAlbumFeedFrag);
            return;
        }
        if (i == 12) {
            m139988n(photoAlbumFeedFrag);
        } else if (i == 14) {
            m139984j(photoAlbumFeedFrag);
        } else {
            if (i != 15) {
                return;
            }
            m139986l(photoAlbumFeedFrag);
        }
    }
}
