package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class tfh {

    /* JADX INFO: renamed from: j */
    public static volatile tfh f169984j;

    /* JADX INFO: renamed from: a */
    public WeakReference<zzl> f169985a;

    /* JADX INFO: renamed from: b */
    public WeakReference<PhotoAlbumFeedFrag> f169986b;

    /* JADX INFO: renamed from: c */
    public WeakReference<PhotoAlbumFeedFrag> f169987c;

    /* JADX INFO: renamed from: d */
    public WeakReference<PhotoAlbumFeedFrag> f169988d;

    /* JADX INFO: renamed from: e */
    public WeakReference<PhotoAlbumFeedFrag> f169989e;

    /* JADX INFO: renamed from: f */
    public WeakReference<PhotoAlbumFeedFrag> f169990f;

    /* JADX INFO: renamed from: g */
    public Pair<String, String> f169991g;

    /* JADX INFO: renamed from: h */
    public Pair<String, String> f169992h;

    /* JADX INFO: renamed from: i */
    public Pair<String, String> f169993i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m188710a(boolean[] zArr, PhotoAlbumFeedFrag photoAlbumFeedFrag, xaj0 xaj0Var) {
        if (zArr.length != 0) {
            FeedModule.f38855d.f192988G1 = "recommend";
        }
        photoAlbumFeedFrag.m64375X4((Moment) xaj0Var.f191751a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m188711b(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static tfh m188712h() {
        if (f169984j == null) {
            synchronized (tfh.class) {
                try {
                    if (f169984j == null) {
                        f169984j = new tfh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f169984j;
    }

    /* JADX INFO: renamed from: c */
    public boolean m188713c(String str, String str2) {
        if (m188718i(str, str2, "p_follow", new HashMap())) {
            return true;
        }
        WeakReference<zzl> weakReference = this.f169985a;
        if (weakReference == null || weakReference.get() == null) {
            this.f169992h = new Pair<>(str, str2);
            return false;
        }
        this.f169985a.get().mo63793j1(0);
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f169986b;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f169992h = new Pair<>(str, str2);
            return false;
        }
        m188717g(this.f169986b.get(), str, str2, new boolean[0]);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean m188714d(String str, String str2) {
        if (m188718i(str, str2, "p_discover_dating", new HashMap())) {
            return true;
        }
        if (nkg.m159854K()) {
            NewPhotoAlbumFrag.f41540p1.m132487l(Boolean.TRUE);
            return true;
        }
        WeakReference<zzl> weakReference = this.f169985a;
        if (weakReference == null || weakReference.get() == null) {
            this.f169992h = new Pair<>(str, str2);
            return false;
        }
        this.f169985a.get().mo63793j1(14);
        n7c.m158118e().m158120b();
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f169986b;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f169992h = new Pair<>(str, str2);
            return false;
        }
        m188717g(this.f169986b.get(), str, str2, new boolean[0]);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m188715e(String str, String str2, String str3, Map<String, String> map) {
        if ((!TextUtils.isEmpty(str) && m188718i(str2, str3, str, map)) || m188718i(str2, str3, "p_discover_dating", new HashMap())) {
            return true;
        }
        WeakReference<zzl> weakReference = this.f169985a;
        if (weakReference == null || weakReference.get() == null) {
            this.f169991g = new Pair<>(str2, str3);
            return false;
        }
        zzl zzlVar = this.f169985a.get();
        if (nkg.m159904s()) {
            zzlVar.mo63793j1(14);
            n7c.m158118e().m158122d();
            WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f169990f;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.f169991g = new Pair<>(str2, str3);
                return false;
            }
            m188717g(weakReference2.get(), str2, str3, new boolean[0]);
        } else {
            zzlVar.mo63793j1(1);
            WeakReference<PhotoAlbumFeedFrag> weakReference3 = this.f169988d;
            if (weakReference3 == null || weakReference3.get() == null) {
                this.f169991g = new Pair<>(str2, str3);
                return false;
            }
            m188717g(weakReference3.get(), str2, str3, new boolean[0]);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m188716f(String str, String str2) {
        if (m188718i(str, str2, "p_like", new HashMap())) {
            return true;
        }
        if (nkg.m159854K()) {
            NewPhotoAlbumFrag.f41540p1.m132487l(Boolean.TRUE);
            return true;
        }
        WeakReference<zzl> weakReference = this.f169985a;
        if (weakReference == null || weakReference.get() == null) {
            this.f169993i = new Pair<>(str, str2);
            return false;
        }
        this.f169985a.get().mo63793j1(12);
        WeakReference<PhotoAlbumFeedFrag> weakReference2 = this.f169987c;
        if (weakReference2 == null || weakReference2.get() == null) {
            this.f169993i = new Pair<>(str, str2);
            return false;
        }
        m188717g(this.f169987c.get(), str, str2, true);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m188717g(final PhotoAlbumFeedFrag photoAlbumFeedFrag, String str, String str2, final boolean... zArr) {
        if (photoAlbumFeedFrag == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        photoAlbumFeedFrag.duringCreated(FeedModule.f38855d.m209374Tb(str2, str, false)).subscribe(mkd0.m154956H(new e30() { // from class: l.rfh
            @Override // p149l.e30
            public final void call(Object obj) {
                tfh.m188710a(zArr, photoAlbumFeedFrag, (xaj0) obj);
            }
        }, new e30() { // from class: l.sfh
            @Override // p149l.e30
            public final void call(Object obj) {
                tfh.m188711b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m188718i(String str, String str2, String str3, Map<String, String> map) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m188719j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f169990f = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m81303a(this.f169991g)) {
            Pair<String, String> pair = this.f169991g;
            m188714d((String) pair.first, (String) pair.second);
            this.f169991g = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m188720k(zzl zzlVar) {
        this.f169985a = new WeakReference<>(zzlVar);
    }

    /* JADX INFO: renamed from: l */
    public void m188721l(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f169989e = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m81303a(this.f169991g)) {
            Pair<String, String> pair = this.f169991g;
            m188715e("", (String) pair.first, (String) pair.second, new HashMap());
            this.f169991g = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m188722m(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f169986b = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m81303a(this.f169992h)) {
            Pair<String, String> pair = this.f169992h;
            m188713c((String) pair.first, (String) pair.second);
            this.f169992h = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m188723n(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f169987c = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m81303a(this.f169993i)) {
            Pair<String, String> pair = this.f169992h;
            m188716f((String) pair.first, (String) pair.second);
            this.f169993i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m188724o(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f169988d = new WeakReference<>(photoAlbumFeedFrag);
        if (NullChecker.m81303a(this.f169991g)) {
            Pair<String, String> pair = this.f169991g;
            m188715e("", (String) pair.first, (String) pair.second, new HashMap());
            this.f169991g = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m188725p(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        if (i == 0) {
            m188722m(photoAlbumFeedFrag);
            return;
        }
        if (i == 1) {
            m188724o(photoAlbumFeedFrag);
            return;
        }
        if (i == 12) {
            m188723n(photoAlbumFeedFrag);
        } else if (i == 14) {
            m188719j(photoAlbumFeedFrag);
        } else {
            if (i != 15) {
                return;
            }
            m188721l(photoAlbumFeedFrag);
        }
    }
}
