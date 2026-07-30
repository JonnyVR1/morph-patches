package p002l;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.gul;
import l.hxs;
import l.i54;
import l.l610;
import l.mqv;
import l.ngm;
import l.r610;
import l.sds;
import l.vwb;
import l.w9j;
import l.wk3;
import l.ym2;
import l.zcu;
import l.ztr;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dck0 {

    /* JADX INFO: renamed from: l.dck0$a */
    public class C0527a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f9168a;

        public C0527a(VDraweeView vDraweeView) {
            this.f9168a = vDraweeView;
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m11747j(VDraweeView vDraweeView, int i, int i2) {
            int width = vDraweeView.getWidth();
            int i3 = (int) (width * (i / i2));
            ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = i3;
            vDraweeView.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: h */
        public void m11748h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            final int height = ngmVar.getHeight();
            final int width = ngmVar.getWidth();
            final VDraweeView vDraweeView = this.f9168a;
            vDraweeView.post(new Runnable() { // from class: l.cck0
                @Override // java.lang.Runnable
                public final void run() {
                    dck0.C0527a.m11747j(vDraweeView, height, width);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11734b(UserCardBean userCardBean, gul gulVar) {
        try {
            if (gulVar instanceof wr2) {
                ((wr2) gulVar).m25338i4(userCardBean);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            ztr.d(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m11735c(UserCardData userCardData) {
        if (TextUtils.equals(userCardData.getTo(), "anchor")) {
            return "anchor";
        }
        return TextUtils.equals(userCardData.getTo(), "callUser") ? "guest" : "audience";
    }

    /* JADX INFO: renamed from: d */
    public static String m11736d(String str) {
        return (TextUtils.equals(str, "p_anchor_audio_room") || TextUtils.equals(str, "p_user_audio_room")) ? "audio" : "video";
    }

    /* JADX INFO: renamed from: e */
    public static <E> List<E> m11737e(List<E> list, List<E> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            arrayList.addAll(list);
        }
        if (!vwb.J(list2)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static void m11738f(mqv<y16.C0904b> mqvVar, SimpleDraweeView simpleDraweeView) {
        wk3.c(simpleDraweeView, mqvVar, new w9j() { // from class: l.bck0
            public final Object call(Object obj) {
                return ((y16.C0904b) obj).f22603d.imageUrl;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m11739g(String str, VDraweeView vDraweeView) {
        hxs.w("context_livingAct", vDraweeView, str, new C0527a(vDraweeView));
    }

    /* JADX INFO: renamed from: h */
    public static void m11740h(Collection<gul> collection, final UserCardBean userCardBean) {
        vwb.z(collection, new e30() { // from class: l.ack0
            public final void call(Object obj) {
                dck0.m11734b(userCardBean, (gul) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX INFO: renamed from: i */
    public static void m11741i(h4t<?, ?> h4tVar, String str) {
        r44 r44Var = (r44) h4tVar.m14184F3(new y24(3800).m26304e(str));
        if (r44Var == null) {
            return;
        }
        h4tVar.m25548F2().PlugPubEvent.openContributeDialog().j(new k980(TextUtils.equals(r44Var.m21771b(), ((DbObject) h4tVar.m25547E2().m14582l0()).id) ? h4tVar.m25547E2().m17235k() : r44Var.m21770a().f17800a, r44Var.m21770a().f17801b, str));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public static void m11742j(h4t<?, ?> h4tVar, String str, String str2) {
        h4tVar.m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(3800).userId(str).setFromIdentity(bqq.m10554a(h4tVar, ((DbObject) h4tVar.m25547E2().m14582l0()).id, str, 0)).setTo(bqq.m10557d(h4tVar, ((DbObject) h4tVar.m25547E2().m14582l0()).id, str, 0)).setScene("live").setSource(str2).trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: k */
    public static void m11743k(h4t<?, ?> h4tVar, User user, String str) {
        if (r610.N(h4tVar)) {
            m11744l(h4tVar, user);
        } else {
            m11745m(h4tVar, user, str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m11744l(h4t<?, ?> h4tVar, User user) {
        BLiveMultiCall bLiveMultiCallE = r610.E(h4tVar, ((DbObject) user).id);
        if (bLiveMultiCallE == null) {
            return;
        }
        h4tVar.m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(6000).m13444h(new mnj.C0680a().m18102f(l610.e(bLiveMultiCallE)).m18100d()).m13446j(l610.g(bLiveMultiCallE)));
    }

    /* JADX INFO: renamed from: m */
    public static void m11745m(h4t<?, ?> h4tVar, User user, String str) {
        r44 r44Var = (r44) h4tVar.m14184F3(new y24(3800).m26304e(str));
        if (r44Var == null) {
            return;
        }
        h4tVar.m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(3800).m13444h(new mnj.C0680a().m18104h(mlj.m18003c(new i54(((DbObject) user).id, user.name, user.fp().profileSmall().formatted()), r44Var.m21770a())).m18100d()).m13446j(r44Var.m21772c()));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: n */
    public static void m11746n(h4t h4tVar, p1k0 p1k0Var, UserCardData userCardData, String str) {
        User user = p1k0Var == null ? null : (User) p1k0Var.f16959c.a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str2 = ((DbObject) user).id.equals(((DbObject) h4tVar.m25547E2().m14582l0()).id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (userCardData.getFrom() == 600) {
            str2 = "liveProfilecard_pkanchor";
        }
        sds.a aVarB = sds.k().b((ho2) h4tVar.m25547E2(), false);
        aVarB.h(((DbObject) user).id).e(str2);
        zcu.d(str, aVarB.a());
    }
}
