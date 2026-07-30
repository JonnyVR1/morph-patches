package p007l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.ExplorePostBubble;
import com.p000p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.view.FeedActivityPostTipsView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.j760;
import l.mqi0;
import l.t100;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jlg {

    /* JADX INFO: renamed from: f */
    public static volatile jlg f9383f;

    /* JADX INFO: renamed from: a */
    public ExplorePostBubble f9384a;

    /* JADX INFO: renamed from: b */
    public String f9385b;

    /* JADX INFO: renamed from: c */
    public WeakReference<gsl> f9386c;

    /* JADX INFO: renamed from: d */
    public WeakReference<NewPhotoAlbumFrag> f9387d;

    /* JADX INFO: renamed from: e */
    public int f9388e;

    public jlg() {
        this.f9388e = -1;
        this.f9388e = RemoteConfig.x().z("explore_post_guide_browse_limit", 10);
    }

    /* JADX INFO: renamed from: f */
    public static jlg m11182f() {
        if (f9383f == null) {
            synchronized (jlg.class) {
                try {
                    if (f9383f == null) {
                        f9383f = new jlg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9383f;
    }

    /* JADX INFO: renamed from: b */
    public void m11183b(NewPhotoAlbumFrag newPhotoAlbumFrag) {
        this.f9387d = new WeakReference<>(newPhotoAlbumFrag);
    }

    /* JADX INFO: renamed from: c */
    public boolean m11184c(Act act, gsl gslVar) {
        WeakReference<NewPhotoAlbumFrag> weakReference;
        ExplorePostBubble explorePostBubble = this.f9384a;
        if (explorePostBubble == null || TextUtils.isEmpty(explorePostBubble.title) || act == null || (weakReference = this.f9387d) == null || weakReference.get() == null || m11191k()) {
            return false;
        }
        this.f9386c = new WeakReference<>(gslVar);
        m11197q(act);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public String m11185d() {
        if (NullChecker.a(this.f9384a) && NullChecker.a(this.f9384a.user)) {
            return this.f9384a.user.f675id;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int m11186e() {
        return this.f9388e;
    }

    /* JADX INFO: renamed from: g */
    public String m11187g() {
        if (NullChecker.a(this.f9384a)) {
            return this.f9384a.topicId;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m11188h() {
        if (NullChecker.a(this.f9384a)) {
            return this.f9384a.topicName;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m11189i() {
        if (m11190j()) {
            d.l().k(this.f9385b);
            this.f9385b = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11190j() {
        return !TextUtils.isEmpty(this.f9385b);
    }

    /* JADX INFO: renamed from: k */
    public boolean m11191k() {
        return mqi0.D(((Long) FeedModule.f316d.f14942O.get()).longValue());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11192l(String str) {
        this.f9385b = null;
        if (NullChecker.a(this.f9386c) && NullChecker.a(this.f9386c.get())) {
            this.f9386c.get().mo10497c();
            this.f9386c.clear();
            this.f9386c = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m11193m() {
        return m11190j();
    }

    /* JADX INFO: renamed from: n */
    public void m11194n(ExplorePostBubble explorePostBubble) {
        this.f9384a = explorePostBubble;
    }

    /* JADX INFO: renamed from: o */
    public boolean m11195o() {
        return this.f9388e == 0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m11196p() {
        return this.f9388e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.feed.newui.view.FeedActivityPostTipsView] */
    /* JADX INFO: renamed from: q */
    public final void m11197q(Act act) {
        NewPhotoAlbumFrag newPhotoAlbumFrag = this.f9387d.get();
        if (newPhotoAlbumFrag == null) {
            return;
        }
        ?? r1 = (FeedActivityPostTipsView) LayoutInflater.from(act).inflate(o6c0.f11297s, (ViewGroup) null);
        this.f9385b = d.l().t(new a(act).s((View) r1).e(false).k(new int[]{act.getResources().getColor(e1c0.f7154n)}).b(5000L).j(new a.c() { // from class: l.ilg
            /* JADX INFO: renamed from: a */
            public final void m10981a(String str) {
                this.f9087a.m11192l(str);
            }
        }).q(a.N | a.P).o(a.P, t100.n).x(t100.h), newPhotoAlbumFrag.f3014I);
        r1.m7405q(this.f9384a);
        m11198r();
        if (NullChecker.a(this.f9386c) && NullChecker.a(this.f9386c.get())) {
            this.f9386c.get().mo10496b();
        }
        String strM5343C6 = newPhotoAlbumFrag.m5343C6();
        String str = this.f9384a.topicId;
        if (str == null) {
            str = "";
        }
        j760 j760VarY = vwb.Y("topic_id", str);
        String str2 = this.f9384a.title;
        zvf0.A("e_active_post_pop", strM5343C6, new j760[]{j760VarY, vwb.Y("active_pop_content", str2 != null ? str2 : "")});
    }

    /* JADX INFO: renamed from: r */
    public void m11198r() {
        FeedModule.f316d.f14942O.put(Long.valueOf(mqi0.o()));
    }
}
