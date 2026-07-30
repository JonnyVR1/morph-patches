package p003l;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.FigureMessageType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.banner.DrawerBannersView;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.BannerSize;
import com.p1.mobile.putong.data.Banners;
import com.p1.mobile.putong.data.BannersItem;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.f6c0;
import l.hpd0;
import l.j760;
import l.mqi0;
import l.o7r;
import l.ogw;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zpd0;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ife {

    /* JADX INFO: renamed from: c */
    public static ife f5115c;

    /* JADX INFO: renamed from: a */
    public a<C3346a> f5116a = a.c(new C3346a(BannerLoc.get("unknown_"), false));

    /* JADX INFO: renamed from: b */
    public a<List<Banners>> f5117b = a.b();

    /* JADX INFO: renamed from: l.ife$a */
    public class C3346a {

        /* JADX INFO: renamed from: a */
        public BannerLoc f5118a;

        /* JADX INFO: renamed from: b */
        public boolean f5119b;

        public C3346a(BannerLoc bannerLoc, boolean z) {
            this.f5118a = bannerLoc;
            this.f5119b = z;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Banners m7165f(ArrayList arrayList) {
        return (Banners) arrayList.get(0);
    }

    /* JADX INFO: renamed from: o */
    public static ife m7169o() {
        if (f5115c == null) {
            synchronized (ife.class) {
                try {
                    if (f5115c == null) {
                        f5115c = new ife();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f5115c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m7170j(BannerLoc bannerLoc) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean m7171k(final BannerLoc bannerLoc) {
        ArrayList arrayListN = vwb.n(CoreModule.f.Q, new w9j() { // from class: l.ffe
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
            }
        });
        if (arrayListN.size() > 0) {
            return m7172l((Banners) arrayListN.get(0), false);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m7172l(Banners banners, boolean z) {
        final StringBuilder sb = new StringBuilder();
        vwb.z(banners.content.banners, new e30() { // from class: l.efe
            public final void call(Object obj) {
                sb.append(((BannersItem) obj).url);
            }
        });
        String string = banners.action.red_dot.toString();
        string.getClass();
        if (string.equals("once")) {
            hpd0 hpd0Var = new hpd0("red_dot_show_once" + banners.loc + ogw.e(sb.toString()) + CoreModule.H().userId(), Boolean.FALSE);
            if (((Boolean) hpd0Var.get()).booleanValue()) {
                return false;
            }
            if (z) {
                hpd0Var.put(Boolean.TRUE);
            }
            return true;
        }
        if (!string.equals("everyday")) {
            return false;
        }
        zpd0 zpd0Var = new zpd0("red_dot_last_show_time_" + banners.loc + ogw.e(sb.toString()) + CoreModule.H().userId(), 0L);
        long jO = mqi0.o();
        if (jO - ((Long) zpd0Var.get()).longValue() <= 86400000) {
            return false;
        }
        if (z) {
            zpd0Var.put(Long.valueOf(jO));
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public String m7173m(final BannerLoc bannerLoc) {
        ArrayList arrayListN = vwb.n(CoreModule.f.Q, new w9j() { // from class: l.hfe
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
            }
        });
        return (arrayListN.size() <= 0 || ((Banners) arrayListN.get(0)).content.banners.size() <= 0) ? "" : ((BannersItem) ((Banners) arrayListN.get(0)).content.banners.get(0)).banner;
    }

    /* JADX INFO: renamed from: n */
    public c<Banners> m7174n(final BannerLoc bannerLoc) {
        return this.f5117b.map(new w9j() { // from class: l.afe
            public final Object call(Object obj) {
                return vwb.n((List) obj, new w9j() { // from class: l.gfe
                    public final Object call(Object obj2) {
                        Banners banners = (Banners) obj2;
                        return Boolean.valueOf(TEnum.equals(banners.loc, bannerLoc) && banners.content.display);
                    }
                });
            }
        }).filter(new w9j() { // from class: l.bfe
            public final Object call(Object obj) {
                return Boolean.valueOf(((ArrayList) obj).size() > 0);
            }
        }).map(new w9j() { // from class: l.cfe
            public final Object call(Object obj) {
                return ife.m7165f((ArrayList) obj);
            }
        }).filter(new w9j() { // from class: l.dfe
            public final Object call(Object obj) {
                Banners banners = (Banners) obj;
                return Boolean.valueOf(banners.content.banners.size() > 0 && banners.content.size.width > 0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m7175p(Banners banners, DrawerBannersView drawerBannersView, Act act, e30 e30Var, int[] iArr) {
        this.f5116a.onNext(new C3346a(banners.loc, m7172l(banners, false)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) drawerBannersView.getLayoutParams();
        float f = iArr[0];
        BannerSize bannerSize = banners.content.size;
        layoutParams.height = (int) ((f * (bannerSize.height * 1.0f)) / bannerSize.width);
        String string = banners.loc.toString();
        string.getClass();
        switch (string) {
            case "moment_feed":
                layoutParams.setMargins(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f));
                break;
            case "conversation_old":
                layoutParams.setMargins(t100.d(16.0f), 0, t100.d(16.0f), 0);
                break;
            case "leftdrawer_old":
                layoutParams.setMargins(t100.d(31.0f), 0, t100.d(31.0f), 0);
                break;
            case "conversation":
                layoutParams.setMargins(t100.d(10.0f), 0, t100.d(10.0f), 0);
                break;
        }
        drawerBannersView.setLayoutParams(layoutParams);
        drawerBannersView.o(act, banners);
        if (NullChecker.a(e30Var)) {
            drawerBannersView.setClickAction(e30Var);
        }
    }

    /* JADX INFO: renamed from: q */
    public ViewGroup m7176q(final Act act, ViewGroup viewGroup, final Banners banners, final e30<Integer> e30Var) {
        final DrawerBannersView drawerBannersViewInflate = o7r.a(act).inflate(f6c0.fd, (ViewGroup) null, false);
        viewGroup.addView(drawerBannersViewInflate);
        xdl0.Q0(drawerBannersViewInflate, new e30() { // from class: l.zee
            public final void call(Object obj) {
                this.f9231a.m7175p(banners, drawerBannersViewInflate, act, e30Var, (int[]) obj);
            }
        });
        return viewGroup;
    }

    /* JADX INFO: renamed from: r */
    public void m7177r(Act act, ViewGroup viewGroup, Banners banners) {
        m7176q(act, viewGroup, banners, null);
    }

    /* JADX INFO: renamed from: s */
    public void m7178s(BannerLoc bannerLoc, Banners banners, int i) {
        byte b = 0;
        this.f5116a.onNext(new C3346a(bannerLoc, false));
        String string = bannerLoc.toString();
        string.getClass();
        switch (string.hashCode()) {
            case -1068531200:
                if (!string.equals("moment")) {
                    b = -1;
                }
                break;
            case -193176451:
                b = !string.equals("moment_feed") ? (byte) -1 : (byte) 1;
                break;
            case -114114453:
                b = !string.equals("conversation_old") ? (byte) -1 : (byte) 2;
                break;
            case 106852524:
                b = !string.equals("popup") ? (byte) -1 : (byte) 3;
                break;
            case 740154499:
                b = !string.equals(Conversation.TYPE) ? (byte) -1 : (byte) 4;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                zvf0.u("e_explore_banner", "p_explore_view", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "new"), vwb.Y("banner_num", Integer.valueOf(i))});
                break;
            case 1:
                zvf0.u("e_moment_banner", "p_moments_view", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "new"), vwb.Y("banner_num", Integer.valueOf(i))});
                break;
            case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                zvf0.u("e_rightbanner", "p_messages_view", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "old"), vwb.Y("banner_num", Integer.valueOf(i))});
                break;
            case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                zvf0.u("e_bulletbox", "p_bulletbox", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "new"), vwb.Y("banner_num", Integer.valueOf(i))});
                break;
            case 4:
                zvf0.u("e_rightbanner", "p_messages_view", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "new"), vwb.Y("banner_num", Integer.valueOf(i))});
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m7179t(@Nullable Banners banners) {
        if (banners == null) {
            return;
        }
        String string = banners.loc.toString();
        string.getClass();
        switch (string) {
            case "moment":
                zvf0.A("e_explore_banner", "p_explore_view", new j760[]{vwb.Y("UI", "new"), vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("banner_num", 0)});
                break;
            case "moment_feed":
                zvf0.A("e_moment_banner", "p_moments_view", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "new"), vwb.Y("banner_num", 0)});
                break;
            case "conversation_old":
                zvf0.A("e_rightbanner", "p_messages_view", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "old"), vwb.Y("banner_num", 0)});
                break;
            case "conversation":
                zvf0.A("e_rightbanner", "p_messages_view", new j760[]{vwb.Y(FigureMessageType.number, Integer.valueOf(banners.id)), vwb.Y("UI", "new"), vwb.Y("banner_num", 0)});
                break;
        }
    }
}
