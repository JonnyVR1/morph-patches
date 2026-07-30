package p149l;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.banner.DrawerBannersView;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.BannerRedDot;
import com.p046p1.mobile.putong.data.BannerSize;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.BannersItem;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class ife {

    /* JADX INFO: renamed from: c */
    public static ife f112984c;

    /* JADX INFO: renamed from: a */
    public C22392a<C17538a> f112985a = C22392a.m221513c(new C17538a(BannerLoc.get("unknown_"), false));

    /* JADX INFO: renamed from: b */
    public C22392a<List<Banners>> f112986b = C22392a.m221512b();

    /* JADX INFO: renamed from: l.ife$a */
    public class C17538a {

        /* JADX INFO: renamed from: a */
        public BannerLoc f112987a;

        /* JADX INFO: renamed from: b */
        public boolean f112988b;

        public C17538a(BannerLoc bannerLoc, boolean z) {
            this.f112987a = bannerLoc;
            this.f112988b = z;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Banners m135902f(ArrayList arrayList) {
        return (Banners) arrayList.get(0);
    }

    /* JADX INFO: renamed from: o */
    public static ife m135906o() {
        if (f112984c == null) {
            synchronized (ife.class) {
                try {
                    if (f112984c == null) {
                        f112984c = new ife();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112984c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m135907j(BannerLoc bannerLoc) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m135908k(final BannerLoc bannerLoc) {
        ArrayList arrayListM200339n = vwb.m200339n(CoreModule.f17548f.f70873Q, new w9j() { // from class: l.ffe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
            }
        });
        if (arrayListM200339n.size() > 0) {
            return m135909l((Banners) arrayListM200339n.get(0), false);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m135909l(Banners banners, boolean z) {
        final StringBuilder sb = new StringBuilder();
        vwb.m200354z(banners.content.banners, new e30() { // from class: l.efe
            @Override // p149l.e30
            public final void call(Object obj) {
                sb.append(((BannersItem) obj).url);
            }
        });
        String string = banners.action.red_dot.toString();
        string.getClass();
        if (string.equals(BannerRedDot.once)) {
            hpd0 hpd0Var = new hpd0("red_dot_show_once" + banners.loc + ogw.m164284e(sb.toString()) + CoreModule.m29931H().userId(), Boolean.FALSE);
            if (hpd0Var.get().booleanValue()) {
                return false;
            }
            if (z) {
                hpd0Var.put(Boolean.TRUE);
            }
            return true;
        }
        if (!string.equals(BannerRedDot.everyday)) {
            return false;
        }
        zpd0 zpd0Var = new zpd0("red_dot_last_show_time_" + banners.loc + ogw.m164284e(sb.toString()) + CoreModule.m29931H().userId(), 0L);
        long jM155944o = mqi0.m155944o();
        if (jM155944o - zpd0Var.get().longValue() <= 86400000) {
            return false;
        }
        if (z) {
            zpd0Var.put(Long.valueOf(jM155944o));
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public String m135910m(final BannerLoc bannerLoc) {
        ArrayList arrayListM200339n = vwb.m200339n(CoreModule.f17548f.f70873Q, new w9j() { // from class: l.hfe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
            }
        });
        return (arrayListM200339n.size() <= 0 || ((Banners) arrayListM200339n.get(0)).content.banners.size() <= 0) ? "" : ((Banners) arrayListM200339n.get(0)).content.banners.get(0).banner;
    }

    /* JADX INFO: renamed from: n */
    public C22306c<Banners> m135911n(final BannerLoc bannerLoc) {
        return this.f112986b.map(new w9j() { // from class: l.afe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200339n((List) obj, new w9j() { // from class: l.gfe
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Banners banners = (Banners) obj2;
                        return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
                    }
                });
            }
        }).filter(new w9j() { // from class: l.bfe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((ArrayList) obj).size() > 0);
            }
        }).map(new w9j() { // from class: l.cfe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ife.m135902f((ArrayList) obj);
            }
        }).filter(new w9j() { // from class: l.dfe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(banners.content.banners.size() > 0 && banners.content.size.width > 0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m135912p(Banners banners, DrawerBannersView drawerBannersView, Act act, e30 e30Var, int[] iArr) {
        this.f112985a.m132487l(new C17538a(banners.loc, m135909l(banners, false)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) drawerBannersView.getLayoutParams();
        float f = iArr[0];
        BannerSize bannerSize = banners.content.size;
        layoutParams.height = (int) ((f * (bannerSize.height * 1.0f)) / bannerSize.width);
        String string = banners.loc.toString();
        string.getClass();
        switch (string) {
            case "moment_feed":
                layoutParams.setMargins(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f));
                break;
            case "conversation_old":
                layoutParams.setMargins(t100.m186890d(16.0f), 0, t100.m186890d(16.0f), 0);
                break;
            case "leftdrawer_old":
                layoutParams.setMargins(t100.m186890d(31.0f), 0, t100.m186890d(31.0f), 0);
                break;
            case "conversation":
                layoutParams.setMargins(t100.m186890d(10.0f), 0, t100.m186890d(10.0f), 0);
                break;
        }
        drawerBannersView.setLayoutParams(layoutParams);
        drawerBannersView.m44346o(act, banners);
        if (NullChecker.m81303a(e30Var)) {
            drawerBannersView.setClickAction(e30Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public ViewGroup m135913q(final Act act, ViewGroup viewGroup, final Banners banners, final e30<Integer> e30Var) {
        final DrawerBannersView drawerBannersView = (DrawerBannersView) o7r.m163037a(act).inflate(f6c0.f95781fd, (ViewGroup) null, false);
        viewGroup.addView(drawerBannersView);
        xdl0.m208353Q0(drawerBannersView, new e30() { // from class: l.zee
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202804a.m135912p(banners, drawerBannersView, act, e30Var, (int[]) obj);
            }
        });
        return viewGroup;
    }

    /* JADX INFO: renamed from: r */
    public void m135914r(Act act, ViewGroup viewGroup, Banners banners) {
        m135913q(act, viewGroup, banners, null);
    }

    /* JADX INFO: renamed from: s */
    public void m135915s(BannerLoc bannerLoc, Banners banners, int i) {
        byte b = 0;
        this.f112985a.m132487l(new C17538a(bannerLoc, false));
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
                zvf0.m220399u("e_explore_banner", "p_explore_view", vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.NEW_VERSION), vwb.m200311Y("banner_num", Integer.valueOf(i)));
                break;
            case 1:
                zvf0.m220399u("e_moment_banner", "p_moments_view", vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.NEW_VERSION), vwb.m200311Y("banner_num", Integer.valueOf(i)));
                break;
            case 2:
                zvf0.m220399u("e_rightbanner", OMSDialogPositon.p_messages_view, vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.OLD_VERSION), vwb.m200311Y("banner_num", Integer.valueOf(i)));
                break;
            case 3:
                zvf0.m220399u("e_bulletbox", "p_bulletbox", vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.NEW_VERSION), vwb.m200311Y("banner_num", Integer.valueOf(i)));
                break;
            case 4:
                zvf0.m220399u("e_rightbanner", OMSDialogPositon.p_messages_view, vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.NEW_VERSION), vwb.m200311Y("banner_num", Integer.valueOf(i)));
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m135916t(@Nullable Banners banners) {
        if (banners == null) {
            return;
        }
        String string = banners.loc.toString();
        string.getClass();
        switch (string) {
            case "moment":
                zvf0.m220368A("e_explore_banner", "p_explore_view", vwb.m200311Y("UI", ShareConstants.NEW_VERSION), vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("banner_num", 0));
                break;
            case "moment_feed":
                zvf0.m220368A("e_moment_banner", "p_moments_view", vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.NEW_VERSION), vwb.m200311Y("banner_num", 0));
                break;
            case "conversation_old":
                zvf0.m220368A("e_rightbanner", OMSDialogPositon.p_messages_view, vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.OLD_VERSION), vwb.m200311Y("banner_num", 0));
                break;
            case "conversation":
                zvf0.m220368A("e_rightbanner", OMSDialogPositon.p_messages_view, vwb.m200311Y("number", Integer.valueOf(banners.f38724id)), vwb.m200311Y("UI", ShareConstants.NEW_VERSION), vwb.m200311Y("banner_num", 0));
                break;
        }
    }
}
