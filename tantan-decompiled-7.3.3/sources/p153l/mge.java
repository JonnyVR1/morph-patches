package p153l;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.banner.DrawerBannersView;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.BannerRedDot;
import com.p051p1.mobile.putong.data.BannerSize;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.BannersItem;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class mge {

    /* JADX INFO: renamed from: c */
    public static mge f136704c;

    /* JADX INFO: renamed from: a */
    public C22507a<C18609a> f136705a = C22507a.m222759c(new C18609a(BannerLoc.get("unknown_"), false));

    /* JADX INFO: renamed from: b */
    public C22507a<List<Banners>> f136706b = C22507a.m222758b();

    /* JADX INFO: renamed from: l.mge$a */
    public class C18609a {

        /* JADX INFO: renamed from: a */
        public BannerLoc f136707a;

        /* JADX INFO: renamed from: b */
        public boolean f136708b;

        public C18609a(BannerLoc bannerLoc, boolean z) {
            this.f136707a = bannerLoc;
            this.f136708b = z;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Banners m158195f(ArrayList arrayList) {
        return (Banners) arrayList.get(0);
    }

    /* JADX INFO: renamed from: o */
    public static mge m158199o() {
        if (f136704c == null) {
            synchronized (mge.class) {
                try {
                    if (f136704c == null) {
                        f136704c = new mge();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f136704c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m158200j(BannerLoc bannerLoc) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m158201k(final BannerLoc bannerLoc) {
        ArrayList arrayListM147522n = jyb.m147522n(CoreModule.f18267f.f159016Q, new qcj() { // from class: l.jge
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
            }
        });
        if (arrayListM147522n.size() > 0) {
            return m158202l((Banners) arrayListM147522n.get(0), false);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m158202l(Banners banners, boolean z) {
        final StringBuilder sb = new StringBuilder();
        jyb.m147537z(banners.content.banners, new y20() { // from class: l.ige
            @Override // p153l.y20
            public final void call(Object obj) {
                sb.append(((BannersItem) obj).url);
            }
        });
        String string = banners.action.red_dot.toString();
        string.getClass();
        if (string.equals(BannerRedDot.once)) {
            jxd0 jxd0Var = new jxd0("red_dot_show_once" + banners.loc + niw.m163315e(sb.toString()) + CoreModule.m30929H().userId(), Boolean.FALSE);
            if (jxd0Var.get().booleanValue()) {
                return false;
            }
            if (z) {
                jxd0Var.put(Boolean.TRUE);
            }
            return true;
        }
        if (!string.equals(BannerRedDot.everyday)) {
            return false;
        }
        byd0 byd0Var = new byd0("red_dot_last_show_time_" + banners.loc + niw.m163315e(sb.toString()) + CoreModule.m30929H().userId(), 0L);
        long jM174454o = pzi0.m174454o();
        if (jM174454o - byd0Var.get().longValue() <= 86400000) {
            return false;
        }
        if (z) {
            byd0Var.put(Long.valueOf(jM174454o));
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public String m158203m(final BannerLoc bannerLoc) {
        ArrayList arrayListM147522n = jyb.m147522n(CoreModule.f18267f.f159016Q, new qcj() { // from class: l.lge
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
            }
        });
        return (arrayListM147522n.size() <= 0 || ((Banners) arrayListM147522n.get(0)).content.banners.size() <= 0) ? "" : ((Banners) arrayListM147522n.get(0)).content.banners.get(0).banner;
    }

    /* JADX INFO: renamed from: n */
    public C22421c<Banners> m158204n(final BannerLoc bannerLoc) {
        return this.f136706b.map(new qcj() { // from class: l.ege
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147522n((List) obj, new qcj() { // from class: l.kge
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Banners banners = (Banners) obj2;
                        return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
                    }
                });
            }
        }).filter(new qcj() { // from class: l.fge
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ArrayList) obj).size() > 0);
            }
        }).map(new qcj() { // from class: l.gge
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mge.m158195f((ArrayList) obj);
            }
        }).filter(new qcj() { // from class: l.hge
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(banners.content.banners.size() > 0 && banners.content.size.width > 0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m158205p(Banners banners, DrawerBannersView drawerBannersView, Act act, y20 y20Var, int[] iArr) {
        this.f136705a.m137019l(new C18609a(banners.loc, m158202l(banners, false)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) drawerBannersView.getLayoutParams();
        float f = iArr[0];
        BannerSize bannerSize = banners.content.size;
        layoutParams.height = (int) ((f * (bannerSize.height * 1.0f)) / bannerSize.width);
        String string = banners.loc.toString();
        string.getClass();
        switch (string) {
            case "moment_feed":
                layoutParams.setMargins(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f));
                break;
            case "conversation_old":
                layoutParams.setMargins(qa00.m175859d(16.0f), 0, qa00.m175859d(16.0f), 0);
                break;
            case "leftdrawer_old":
                layoutParams.setMargins(qa00.m175859d(31.0f), 0, qa00.m175859d(31.0f), 0);
                break;
            case "conversation":
                layoutParams.setMargins(qa00.m175859d(10.0f), 0, qa00.m175859d(10.0f), 0);
                break;
        }
        drawerBannersView.setLayoutParams(layoutParams);
        drawerBannersView.m45529o(act, banners);
        if (NullChecker.m82486a(y20Var)) {
            drawerBannersView.setClickAction(y20Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public ViewGroup m158206q(final Act act, ViewGroup viewGroup, final Banners banners, final y20<Integer> y20Var) {
        final DrawerBannersView drawerBannersView = (DrawerBannersView) p9r.m171370a(act).inflate(kec0.f125953md, (ViewGroup) null, false);
        viewGroup.addView(drawerBannersView);
        bnl0.m105533Q0(drawerBannersView, new y20() { // from class: l.dge
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88290a.m158205p(banners, drawerBannersView, act, y20Var, (int[]) obj);
            }
        });
        return viewGroup;
    }

    /* JADX INFO: renamed from: r */
    public void m158207r(Act act, ViewGroup viewGroup, Banners banners) {
        m158206q(act, viewGroup, banners, null);
    }

    /* JADX INFO: renamed from: s */
    public void m158208s(BannerLoc bannerLoc, Banners banners, int i) {
        byte b = 0;
        this.f136705a.m137019l(new C18609a(bannerLoc, false));
        String string = bannerLoc.toString();
        string.getClass();
        switch (string.hashCode()) {
            case -1068531200:
                if (!string.equals("moment")) {
                    b = -1;
                }
                break;
            case -193176451:
                b = !string.equals(BannerLoc.moment_feed) ? (byte) -1 : (byte) 1;
                break;
            case -114114453:
                b = !string.equals(BannerLoc.conversation_old) ? (byte) -1 : (byte) 2;
                break;
            case 106852524:
                b = !string.equals(BannerLoc.popup) ? (byte) -1 : (byte) 3;
                break;
            case 740154499:
                b = !string.equals("conversation") ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                i4g0.m138523u("e_explore_banner", "p_explore_view", jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.NEW_VERSION), jyb.m147494Y("banner_num", Integer.valueOf(i)));
                break;
            case 1:
                i4g0.m138523u("e_moment_banner", "p_moments_view", jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.NEW_VERSION), jyb.m147494Y("banner_num", Integer.valueOf(i)));
                break;
            case 2:
                i4g0.m138523u("e_rightbanner", OMSDialogPositon.p_messages_view, jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.OLD_VERSION), jyb.m147494Y("banner_num", Integer.valueOf(i)));
                break;
            case 3:
                i4g0.m138523u("e_bulletbox", "p_bulletbox", jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.NEW_VERSION), jyb.m147494Y("banner_num", Integer.valueOf(i)));
                break;
            case 4:
                i4g0.m138523u("e_rightbanner", OMSDialogPositon.p_messages_view, jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.NEW_VERSION), jyb.m147494Y("banner_num", Integer.valueOf(i)));
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m158209t(@Nullable Banners banners) {
        if (banners == null) {
            return;
        }
        String string = banners.loc.toString();
        string.getClass();
        switch (string) {
            case "moment":
                i4g0.m138492A("e_explore_banner", "p_explore_view", jyb.m147494Y("UI", ShareConstants.NEW_VERSION), jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("banner_num", 0));
                break;
            case "moment_feed":
                i4g0.m138492A("e_moment_banner", "p_moments_view", jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.NEW_VERSION), jyb.m147494Y("banner_num", 0));
                break;
            case "conversation_old":
                i4g0.m138492A("e_rightbanner", OMSDialogPositon.p_messages_view, jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.OLD_VERSION), jyb.m147494Y("banner_num", 0));
                break;
            case "conversation":
                i4g0.m138492A("e_rightbanner", OMSDialogPositon.p_messages_view, jyb.m147494Y("number", Integer.valueOf(banners.f39572id)), jyb.m147494Y("UI", ShareConstants.NEW_VERSION), jyb.m147494Y("banner_num", 0));
                break;
        }
    }
}
