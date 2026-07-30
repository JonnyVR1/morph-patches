package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.ExplorePostBubble;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.view.FeedActivityPostTipsView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class ymg {

    /* JADX INFO: renamed from: f */
    public static volatile ymg f200659f;

    /* JADX INFO: renamed from: a */
    public ExplorePostBubble f200660a;

    /* JADX INFO: renamed from: b */
    public String f200661b;

    /* JADX INFO: renamed from: c */
    public WeakReference<uul> f200662c;

    /* JADX INFO: renamed from: d */
    public WeakReference<NewPhotoAlbumFrag> f200663d;

    /* JADX INFO: renamed from: e */
    public int f200664e;

    public ymg() {
        this.f200664e = -1;
        this.f200664e = RemoteConfig.m80481x().m80519z("explore_post_guide_browse_limit", 10);
    }

    /* JADX INFO: renamed from: f */
    public static ymg m216676f() {
        if (f200659f == null) {
            synchronized (ymg.class) {
                try {
                    if (f200659f == null) {
                        f200659f = new ymg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f200659f;
    }

    /* JADX INFO: renamed from: b */
    public void m216677b(NewPhotoAlbumFrag newPhotoAlbumFrag) {
        this.f200663d = new WeakReference<>(newPhotoAlbumFrag);
    }

    /* JADX INFO: renamed from: c */
    public boolean m216678c(Act act, uul uulVar) {
        WeakReference<NewPhotoAlbumFrag> weakReference;
        ExplorePostBubble explorePostBubble = this.f200660a;
        if (explorePostBubble == null || TextUtils.isEmpty(explorePostBubble.title) || act == null || (weakReference = this.f200663d) == null || weakReference.get() == null || m216685k()) {
            return false;
        }
        this.f200662c = new WeakReference<>(uulVar);
        m216691q(act);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public String m216679d() {
        if (NullChecker.m82486a(this.f200660a) && NullChecker.m82486a(this.f200660a.user)) {
            return this.f200660a.user.f40062id;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int m216680e() {
        return this.f200664e;
    }

    /* JADX INFO: renamed from: g */
    public String m216681g() {
        if (NullChecker.m82486a(this.f200660a)) {
            return this.f200660a.topicId;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public String m216682h() {
        if (NullChecker.m82486a(this.f200660a)) {
            return this.f200660a.topicName;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m216683i() {
        if (m216684j()) {
            C4499d.m21895l().m21899k(this.f200661b);
            this.f200661b = null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m216684j() {
        return !TextUtils.isEmpty(this.f200661b);
    }

    /* JADX INFO: renamed from: k */
    public boolean m216685k() {
        return pzi0.m174439D(FeedModule.f39703d.f121317O.get().longValue());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m216686l(String str) {
        this.f200661b = null;
        if (NullChecker.m82486a(this.f200662c) && NullChecker.m82486a(this.f200662c.get())) {
            this.f200662c.get().mo156950c();
            this.f200662c.clear();
            this.f200662c = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m216687m() {
        return m216684j();
    }

    /* JADX INFO: renamed from: n */
    public void m216688n(ExplorePostBubble explorePostBubble) {
        this.f200660a = explorePostBubble;
    }

    /* JADX INFO: renamed from: o */
    public boolean m216689o() {
        return this.f200664e == 0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m216690p() {
        return this.f200664e > 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m216691q(Act act) {
        NewPhotoAlbumFrag newPhotoAlbumFrag = this.f200663d.get();
        if (newPhotoAlbumFrag == null) {
            return;
        }
        FeedActivityPostTipsView feedActivityPostTipsView = (FeedActivityPostTipsView) LayoutInflater.from(act).inflate(tec0.f173747s, (ViewGroup) null);
        this.f200661b = C4499d.m21895l().m21907t(new C4496a(act).m21876s(feedActivityPostTipsView).m21863e(false).m21869k(act.getResources().getColor(k9c0.f124521n)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21868j(new C4496a.c() { // from class: l.xmg
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f195081a.m216686l(str);
            }
        }).m21874q(C4496a.f16399N | C4496a.f16401P).m21872o(C4496a.f16401P, qa00.f156327n).m21881x(qa00.f156321h), newPhotoAlbumFrag.f42401I);
        feedActivityPostTipsView.m67428q(this.f200660a);
        m216692r();
        if (NullChecker.m82486a(this.f200662c) && NullChecker.m82486a(this.f200662c.get())) {
            this.f200662c.get().mo156949b();
        }
        String strM65463C6 = newPhotoAlbumFrag.m65463C6();
        String str = this.f200660a.topicId;
        if (str == null) {
            str = "";
        }
        pf60 pf60VarM147494Y = jyb.m147494Y("topic_id", str);
        String str2 = this.f200660a.title;
        i4g0.m138492A("e_active_post_pop", strM65463C6, pf60VarM147494Y, jyb.m147494Y("active_pop_content", str2 != null ? str2 : ""));
    }

    /* JADX INFO: renamed from: r */
    public void m216692r() {
        FeedModule.f39703d.f121317O.put(Long.valueOf(pzi0.m174454o()));
    }
}
