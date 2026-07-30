package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.ExplorePostBubble;
import com.p046p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.view.FeedActivityPostTipsView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class jlg {

    /* JADX INFO: renamed from: f */
    public static volatile jlg f118538f;

    /* JADX INFO: renamed from: a */
    public ExplorePostBubble f118539a;

    /* JADX INFO: renamed from: b */
    public String f118540b;

    /* JADX INFO: renamed from: c */
    public WeakReference<gsl> f118541c;

    /* JADX INFO: renamed from: d */
    public WeakReference<NewPhotoAlbumFrag> f118542d;

    /* JADX INFO: renamed from: e */
    public int f118543e;

    public jlg() {
        this.f118543e = -1;
        this.f118543e = RemoteConfig.m79298x().m79336z("explore_post_guide_browse_limit", 10);
    }

    /* JADX INFO: renamed from: f */
    public static jlg m142074f() {
        if (f118538f == null) {
            synchronized (jlg.class) {
                try {
                    if (f118538f == null) {
                        f118538f = new jlg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f118538f;
    }

    /* JADX INFO: renamed from: b */
    public void m142075b(NewPhotoAlbumFrag newPhotoAlbumFrag) {
        this.f118542d = new WeakReference<>(newPhotoAlbumFrag);
    }

    /* JADX INFO: renamed from: c */
    public boolean m142076c(Act act, gsl gslVar) {
        WeakReference<NewPhotoAlbumFrag> weakReference;
        ExplorePostBubble explorePostBubble = this.f118539a;
        if (explorePostBubble == null || TextUtils.isEmpty(explorePostBubble.title) || act == null || (weakReference = this.f118542d) == null || weakReference.get() == null || m142083k()) {
            return false;
        }
        this.f118541c = new WeakReference<>(gslVar);
        m142089q(act);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public String m142077d() {
        if (NullChecker.m81303a(this.f118539a) && NullChecker.m81303a(this.f118539a.user)) {
            return this.f118539a.user.f39214id;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int m142078e() {
        return this.f118543e;
    }

    /* JADX INFO: renamed from: g */
    public String m142079g() {
        if (NullChecker.m81303a(this.f118539a)) {
            return this.f118539a.topicId;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m142080h() {
        if (NullChecker.m81303a(this.f118539a)) {
            return this.f118539a.topicName;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m142081i() {
        if (m142082j()) {
            C4348d.m20896l().m20900k(this.f118540b);
            this.f118540b = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m142082j() {
        return !TextUtils.isEmpty(this.f118540b);
    }

    /* JADX INFO: renamed from: k */
    public boolean m142083k() {
        return mqi0.m155929D(FeedModule.f38855d.f193007O.get().longValue());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m142084l(String str) {
        this.f118540b = null;
        if (NullChecker.m81303a(this.f118541c) && NullChecker.m81303a(this.f118541c.get())) {
            this.f118541c.get().mo127807c();
            this.f118541c.clear();
            this.f118541c = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m142085m() {
        return m142082j();
    }

    /* JADX INFO: renamed from: n */
    public void m142086n(ExplorePostBubble explorePostBubble) {
        this.f118539a = explorePostBubble;
    }

    /* JADX INFO: renamed from: o */
    public boolean m142087o() {
        return this.f118543e == 0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m142088p() {
        return this.f118543e > 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m142089q(Act act) {
        NewPhotoAlbumFrag newPhotoAlbumFrag = this.f118542d.get();
        if (newPhotoAlbumFrag == null) {
            return;
        }
        FeedActivityPostTipsView feedActivityPostTipsView = (FeedActivityPostTipsView) LayoutInflater.from(act).inflate(o6c0.f142278s, (ViewGroup) null);
        this.f118540b = C4348d.m20896l().m20908t(new C4345a(act).m20877s(feedActivityPostTipsView).m20864e(false).m20870k(act.getResources().getColor(e1c0.f88798n)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20869j(new C4345a.c() { // from class: l.ilg
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f113838a.m142084l(str);
            }
        }).m20875q(C4345a.f15680N | C4345a.f15682P).m20873o(C4345a.f15682P, t100.f167265n).m20882x(t100.f167259h), newPhotoAlbumFrag.f41553I);
        feedActivityPostTipsView.m66245q(this.f118539a);
        m142090r();
        if (NullChecker.m81303a(this.f118541c) && NullChecker.m81303a(this.f118541c.get())) {
            this.f118541c.get().mo127806b();
        }
        String strM64280C6 = newPhotoAlbumFrag.m64280C6();
        String str = this.f118539a.topicId;
        if (str == null) {
            str = "";
        }
        j760 j760VarM200311Y = vwb.m200311Y("topic_id", str);
        String str2 = this.f118539a.title;
        zvf0.m220368A("e_active_post_pop", strM64280C6, j760VarM200311Y, vwb.m200311Y("active_pop_content", str2 != null ? str2 : ""));
    }

    /* JADX INFO: renamed from: r */
    public void m142090r() {
        FeedModule.f38855d.f193007O.put(Long.valueOf(mqi0.m155944o()));
    }
}
