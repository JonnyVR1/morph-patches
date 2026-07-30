package p149l;

import android.app.Activity;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class eng extends vzh {

    /* JADX INFO: renamed from: a */
    public Activity f92309a;

    /* JADX INFO: renamed from: b */
    public List<String> f92310b;

    /* JADX INFO: renamed from: c */
    public List<String> f92311c;

    /* JADX INFO: renamed from: d */
    public int f92312d = 1;

    public eng(Activity activity) {
        this.f92309a = activity;
        m117271e();
        m117272f();
    }

    /* JADX INFO: renamed from: c */
    public static void m117267c() {
        wng.m204695v().m204731j0();
    }

    /* JADX INFO: renamed from: o */
    public static void m117268o() {
        m117267c();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m117269b(String str) {
        return (m117273g(str) || m117275l(str)) && m117276m(str) && m117278p(str);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m117270d(String str) {
        if (!m117274k(str)) {
            return false;
        }
        if (nkg.m159904s()) {
            return NewPhotoAlbumFrag.f41537m1;
        }
        return PhotoAlbumFrag.f41241g1;
    }

    /* JADX INFO: renamed from: e */
    public final void m117271e() {
        ArrayList arrayList = new ArrayList();
        this.f92311c = arrayList;
        arrayList.add("com.p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct");
        this.f92311c.add("com.p1.mobile.putong.feed.newui.kankan.post.FeedKanPostAct");
    }

    /* JADX INFO: renamed from: f */
    public final void m117272f() {
        ArrayList arrayList = new ArrayList();
        this.f92310b = arrayList;
        arrayList.add("com.p1.mobile.putong.core.newui.main.NewMainAct");
        this.f92310b.add("com.p1.mobile.putong.core.ui.profile.ProfileAct");
        this.f92310b.add("com.p1.mobile.putong.core.ui.report.ReportAct");
        this.f92310b.add("com.p1.mobile.putong.app.mln.luaview.TTLuaActivity");
        this.f92310b.add("com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m117273g(String str) {
        return str.contains("com.p1.mobile.putong.feed");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m117274k(String str) {
        return str.contains("com.p1.mobile.putong.core.newui.main.NewMainAct");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m117275l(String str) {
        List<String> list = this.f92310b;
        Objects.requireNonNull(str);
        return vwb.m200346r(list, new s0j(str)) != null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m117276m(String str) {
        List<String> list = this.f92311c;
        Objects.requireNonNull(str);
        return vwb.m200346r(list, new s0j(str)) == null;
    }

    /* JADX INFO: renamed from: n */
    public final void m117277n() {
        m117267c();
    }

    @Override // p149l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        this.f92309a = activity;
        if (m117269b(activity.getClass().getName())) {
            return;
        }
        m117267c();
    }

    @Override // p149l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        this.f92312d++;
    }

    @Override // p149l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        int i = this.f92312d - 1;
        this.f92312d = i;
        if (i == 0) {
            m117277n();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m117278p(String str) {
        return !m117270d(str);
    }
}
