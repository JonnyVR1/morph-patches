package p149l;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class dck0 {

    /* JADX INFO: renamed from: l.dck0$a */
    public class C16332a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f85439a;

        public C16332a(VDraweeView vDraweeView) {
            this.f85439a = vDraweeView;
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m110730j(VDraweeView vDraweeView, int i, int i2) {
            int width = vDraweeView.getWidth();
            int i3 = (int) (width * (i / i2));
            ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = i3;
            vDraweeView.setLayoutParams(layoutParams);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            final int height = ngmVar.getHeight();
            final int width = ngmVar.getWidth();
            final VDraweeView vDraweeView = this.f85439a;
            vDraweeView.post(new Runnable() { // from class: l.cck0
                @Override // java.lang.Runnable
                public final void run() {
                    dck0.C16332a.m110730j(vDraweeView, height, width);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m110717b(UserCardBean userCardBean, gul gulVar) {
        try {
            if (gulVar instanceof wr2) {
                ((wr2) gulVar).m205088i4(userCardBean);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            ztr.m220139d(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m110718c(UserCardData userCardData) {
        if (TextUtils.equals(userCardData.getTo(), "anchor")) {
            return "anchor";
        }
        return TextUtils.equals(userCardData.getTo(), "callUser") ? GameIdentity.guest : "audience";
    }

    /* JADX INFO: renamed from: d */
    public static String m110719d(String str) {
        return (TextUtils.equals(str, "p_anchor_audio_room") || TextUtils.equals(str, "p_user_audio_room")) ? "audio" : "video";
    }

    /* JADX INFO: renamed from: e */
    public static <E> List<E> m110720e(List<E> list, List<E> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            arrayList.addAll(list);
        }
        if (!vwb.m200296J(list2)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static void m110721f(mqv<y16.C21278b> mqvVar, SimpleDraweeView simpleDraweeView) {
        wk3.m203644c(simpleDraweeView, mqvVar, new w9j() { // from class: l.bck0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((y16.C21278b) obj).f195390d.imageUrl;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m110722g(String str, VDraweeView vDraweeView) {
        hxs.m133410w("context_livingAct", vDraweeView, str, new C16332a(vDraweeView));
    }

    /* JADX INFO: renamed from: h */
    public static void m110723h(Collection<gul> collection, final UserCardBean userCardBean) {
        vwb.m200354z(collection, new e30() { // from class: l.ack0
            @Override // p149l.e30
            public final void call(Object obj) {
                dck0.m110717b(userCardBean, (gul) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX INFO: renamed from: i */
    public static void m110724i(h4t<?, ?> h4tVar, String str) {
        r44 r44Var = (r44) h4tVar.m129297F3(new y24(3800).m212356e(str));
        if (r44Var == null) {
            return;
        }
        h4tVar.m206028F2().PlugPubEvent.openContributeDialog().mo172463j(new k980(TextUtils.equals(r44Var.m177770b(), h4tVar.m206027E2().m132146l0().f56011id) ? h4tVar.m206027E2().m149814k() : r44Var.m177769a().f152537a, r44Var.m177769a().f152538b, str));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public static void m110725j(h4t<?, ?> h4tVar, String str, String str2) {
        h4tVar.m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(3800).userId(str).setFromIdentity(bqq.m103386a(h4tVar, h4tVar.m206027E2().m132146l0().f56011id, str, 0)).setTo(bqq.m103389d(h4tVar, h4tVar.m206027E2().m132146l0().f56011id, str, 0)).setScene("live").setSource(str2).trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: k */
    public static void m110726k(h4t<?, ?> h4tVar, User user, String str) {
        if (r610.m177979N(h4tVar)) {
            m110727l(h4tVar, user);
        } else {
            m110728m(h4tVar, user, str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m110727l(h4t<?, ?> h4tVar, User user) {
        BLiveMultiCall bLiveMultiCallM177970E = r610.m177970E(h4tVar, user.f56011id);
        if (bLiveMultiCallM177970E == null) {
            return;
        }
        h4tVar.m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m122564h(new mnj.C18509a().m155525f(l610.m148688e(bLiveMultiCallM177970E)).m155523d()).m122566j(l610.m148690g(bLiveMultiCallM177970E)));
    }

    /* JADX INFO: renamed from: m */
    public static void m110728m(h4t<?, ?> h4tVar, User user, String str) {
        r44 r44Var = (r44) h4tVar.m129297F3(new y24(3800).m212356e(str));
        if (r44Var == null) {
            return;
        }
        h4tVar.m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(3800).m122564h(new mnj.C18509a().m155527h(mlj.m155154c(new i54(user.f56011id, user.name, user.m60124fp().profileSmall().formatted()), r44Var.m177769a())).m155523d()).m122566j(r44Var.m177771c()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: n */
    public static void m110729n(h4t h4tVar, p1k0 p1k0Var, UserCardData userCardData, String str) {
        User user = p1k0Var == null ? null : p1k0Var.f146688c.f135304a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str2 = user.f56011id.equals(h4tVar.m206027E2().m132146l0().f56011id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (userCardData.getFrom() == 600) {
            str2 = "liveProfilecard_pkanchor";
        }
        sds.C19911a c19911aM183543b = sds.m183540k().m183543b(h4tVar.m206027E2(), false);
        c19911aM183543b.m183549h(user.f56011id).m183546e(str2);
        zcu.m218089d(str, c19911aM183543b.m183542a());
    }
}
