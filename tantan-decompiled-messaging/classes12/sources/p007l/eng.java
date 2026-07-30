package p007l;

import android.app.Activity;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.s0j;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class eng extends vzh {

    /* JADX INFO: renamed from: a */
    public Activity f7435a;

    /* JADX INFO: renamed from: b */
    public List<String> f7436b;

    /* JADX INFO: renamed from: c */
    public List<String> f7437c;

    /* JADX INFO: renamed from: d */
    public int f7438d = 1;

    public eng(Activity activity) {
        this.f7435a = activity;
        m9938e();
        m9939f();
    }

    /* JADX INFO: renamed from: c */
    public static void m9934c() {
        wng.m15855v().m15891j0();
    }

    /* JADX INFO: renamed from: o */
    public static void m9935o() {
        m9934c();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9936b(String str) {
        return (m9940g(str) || m9942l(str)) && m9943m(str) && m9945p(str);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9937d(String str) {
        if (!m9941k(str)) {
            return false;
        }
        if (nkg.m12263s()) {
            return NewPhotoAlbumFrag.f2998m1;
        }
        return PhotoAlbumFrag.f2702g1;
    }

    /* JADX INFO: renamed from: e */
    public final void m9938e() {
        ArrayList arrayList = new ArrayList();
        this.f7437c = arrayList;
        arrayList.add("com.p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct");
        this.f7437c.add("com.p1.mobile.putong.feed.newui.kankan.post.FeedKanPostAct");
    }

    /* JADX INFO: renamed from: f */
    public final void m9939f() {
        ArrayList arrayList = new ArrayList();
        this.f7436b = arrayList;
        arrayList.add("com.p1.mobile.putong.core.newui.main.NewMainAct");
        this.f7436b.add("com.p1.mobile.putong.core.ui.profile.ProfileAct");
        this.f7436b.add("com.p1.mobile.putong.core.ui.report.ReportAct");
        this.f7436b.add("com.p1.mobile.putong.app.mln.luaview.TTLuaActivity");
        this.f7436b.add("com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9940g(String str) {
        return str.contains("com.p1.mobile.putong.feed");
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9941k(String str) {
        return str.contains("com.p1.mobile.putong.core.newui.main.NewMainAct");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m9942l(String str) {
        List<String> list = this.f7436b;
        Objects.requireNonNull(str);
        return vwb.r(list, new s0j(str)) != null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9943m(String str) {
        List<String> list = this.f7437c;
        Objects.requireNonNull(str);
        return vwb.r(list, new s0j(str)) == null;
    }

    /* JADX INFO: renamed from: n */
    public final void m9944n() {
        m9934c();
    }

    @Override // p007l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        this.f7435a = activity;
        if (m9936b(activity.getClass().getName())) {
            return;
        }
        m9934c();
    }

    @Override // p007l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        this.f7438d++;
    }

    @Override // p007l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        super.onActivityStopped(activity);
        int i = this.f7438d - 1;
        this.f7438d = i;
        if (i == 0) {
            m9944n();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9945p(String str) {
        return !m9937d(str);
    }
}
