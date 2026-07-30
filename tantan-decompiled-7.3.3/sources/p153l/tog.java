package p153l;

import android.app.Activity;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class tog extends k1i {

    /* JADX INFO: renamed from: a */
    public Activity f175400a;

    /* JADX INFO: renamed from: b */
    public List<String> f175401b;

    /* JADX INFO: renamed from: c */
    public List<String> f175402c;

    /* JADX INFO: renamed from: d */
    public int f175403d = 1;

    public tog(Activity activity) {
        this.f175400a = activity;
        m192032e();
        m192033f();
    }

    /* JADX INFO: renamed from: c */
    public static void m192028c() {
        lpg.m155193v().m155229j0();
    }

    /* JADX INFO: renamed from: o */
    public static void m192029o() {
        m192028c();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m192030b(String str) {
        return (m192034g(str) || m192036l(str)) && m192037m(str) && m192039p(str);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m192031d(String str) {
        if (!m192035k(str)) {
            return false;
        }
        if (cmg.m111233s()) {
            return NewPhotoAlbumFrag.f42385m1;
        }
        return PhotoAlbumFrag.f42089g1;
    }

    /* JADX INFO: renamed from: e */
    public final void m192032e() {
        ArrayList arrayList = new ArrayList();
        this.f175402c = arrayList;
        arrayList.add("com.p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct");
        this.f175402c.add("com.p1.mobile.putong.feed.newui.kankan.post.FeedKanPostAct");
    }

    /* JADX INFO: renamed from: f */
    public final void m192033f() {
        ArrayList arrayList = new ArrayList();
        this.f175401b = arrayList;
        arrayList.add("com.p1.mobile.putong.core.newui.main.NewMainAct");
        this.f175401b.add("com.p1.mobile.putong.core.ui.profile.ProfileAct");
        this.f175401b.add("com.p1.mobile.putong.core.ui.report.ReportAct");
        this.f175401b.add("com.p1.mobile.putong.app.mln.luaview.TTLuaActivity");
        this.f175401b.add("com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m192034g(String str) {
        return str.contains("com.p1.mobile.putong.feed");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m192035k(String str) {
        return str.contains("com.p1.mobile.putong.core.newui.main.NewMainAct");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m192036l(String str) {
        List<String> list = this.f175401b;
        Objects.requireNonNull(str);
        return jyb.m147529r(list, new n3j(str)) != null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m192037m(String str) {
        List<String> list = this.f175402c;
        Objects.requireNonNull(str);
        return jyb.m147529r(list, new n3j(str)) == null;
    }

    /* JADX INFO: renamed from: n */
    public final void m192038n() {
        m192028c();
    }

    @Override // p153l.k1i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        this.f175400a = activity;
        if (m192030b(activity.getClass().getName())) {
            return;
        }
        m192028c();
    }

    @Override // p153l.k1i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        this.f175403d++;
    }

    @Override // p153l.k1i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        int i = this.f175403d - 1;
        this.f175403d = i;
        if (i == 0) {
            m192038n();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m192039p(String str) {
        return !m192031d(str);
    }
}
