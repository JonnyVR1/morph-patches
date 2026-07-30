package p153l;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class jlk0 {

    /* JADX INFO: renamed from: l.jlk0$a */
    public class C17975a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VDraweeView f121578a;

        public C17975a(VDraweeView vDraweeView) {
            this.f121578a = vDraweeView;
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ void m146093j(VDraweeView vDraweeView, int i, int i2) {
            int width = vDraweeView.getWidth();
            int i3 = (int) (width * (i / i2));
            ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = i3;
            vDraweeView.setLayoutParams(layoutParams);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            final int height = qimVar.getHeight();
            final int width = qimVar.getWidth();
            final VDraweeView vDraweeView = this.f121578a;
            vDraweeView.post(new Runnable() { // from class: l.ilk0
                @Override // java.lang.Runnable
                public final void run() {
                    jlk0.C17975a.m146093j(vDraweeView, height, width);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m146080b(UserCardBean userCardBean, uwl uwlVar) {
        try {
            if (uwlVar instanceof ms2) {
                ((ms2) uwlVar).m159736i4(userCardBean);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            awr.m100710d(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m146081c(UserCardData userCardData) {
        if (TextUtils.equals(userCardData.getTo(), "anchor")) {
            return "anchor";
        }
        return TextUtils.equals(userCardData.getTo(), "callUser") ? GameIdentity.guest : "audience";
    }

    /* JADX INFO: renamed from: d */
    public static String m146082d(String str) {
        return (TextUtils.equals(str, "p_anchor_audio_room") || TextUtils.equals(str, "p_user_audio_room")) ? "audio" : "video";
    }

    /* JADX INFO: renamed from: e */
    public static <E> List<E> m146083e(List<E> list, List<E> list2) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            arrayList.addAll(list);
        }
        if (!jyb.m147479J(list2)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static void m146084f(nsv<d36.C16429b> nsvVar, SimpleDraweeView simpleDraweeView) {
        ql3.m176985c(simpleDraweeView, nsvVar, new qcj() { // from class: l.hlk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((d36.C16429b) obj).f84869d.imageUrl;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m146085g(String str, VDraweeView vDraweeView) {
        izs.m142872w("context_livingAct", vDraweeView, str, new C17975a(vDraweeView));
    }

    /* JADX INFO: renamed from: h */
    public static void m146086h(Collection<uwl> collection, final UserCardBean userCardBean) {
        jyb.m147537z(collection, new y20() { // from class: l.glk0
            @Override // p153l.y20
            public final void call(Object obj) {
                jlk0.m146080b(userCardBean, (uwl) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX INFO: renamed from: i */
    public static void m146087i(i6t<?, ?> i6tVar, String str) {
        q54 q54Var = (q54) i6tVar.m138856F3(new x34(3800).m209191e(str));
        if (q54Var == null) {
            return;
        }
        i6tVar.m213811F2().PlugPubEvent.openContributeDialog().mo199273j(new qh80(TextUtils.equals(q54Var.m175289b(), i6tVar.m213810E2().m168532l0().f56859id) ? i6tVar.m213810E2().m202191k() : q54Var.m175288a().f150592a, q54Var.m175288a().f150593b, str));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2] */
    /* JADX INFO: renamed from: j */
    public static void m146088j(i6t<?, ?> i6tVar, String str, String str2) {
        i6tVar.m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(3800).userId(str).setFromIdentity(csq.m112227a(i6tVar, i6tVar.m213810E2().m168532l0().f56859id, str, 0)).setTo(csq.m112230d(i6tVar, i6tVar.m213810E2().m168532l0().f56859id, str, 0)).setScene("live").setSource(str2).trackFrom("liveRoom").build());
    }

    /* JADX INFO: renamed from: k */
    public static void m146089k(i6t<?, ?> i6tVar, User user, String str) {
        if (bf10.m103808N(i6tVar)) {
            m146090l(i6tVar, user);
        } else {
            m146091m(i6tVar, user, str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m146090l(i6t<?, ?> i6tVar, User user) {
        BLiveMultiCall bLiveMultiCallM103799E = bf10.m103799E(i6tVar, user.f56859id);
        if (bLiveMultiCallM103799E == null) {
            return;
        }
        i6tVar.m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m156158h(new cqj.C16337a().m111925f(ve10.m201025e(bLiveMultiCallM103799E)).m111923d()).m156160j(ve10.m201027g(bLiveMultiCallM103799E)));
    }

    /* JADX INFO: renamed from: m */
    public static void m146091m(i6t<?, ?> i6tVar, User user, String str) {
        q54 q54Var = (q54) i6tVar.m138856F3(new x34(3800).m209191e(str));
        if (q54Var == null) {
            return;
        }
        i6tVar.m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(3800).m156158h(new cqj.C16337a().m111927h(coj.m111661c(new h64(user.f56859id, user.name, user.m61308fp().profileSmall().formatted()), q54Var.m175288a())).m111923d()).m156160j(q54Var.m175290c()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: n */
    public static void m146092n(i6t i6tVar, vak0 vak0Var, UserCardData userCardData, String str) {
        User user = vak0Var == null ? null : vak0Var.f183108c.f143542a;
        if (user == null || user.matchedOrFollowed()) {
            return;
        }
        String str2 = user.f56859id.equals(i6tVar.m213810E2().m168532l0().f56859id) ? "liveProfilecard" : "live_watcher_profilecard";
        if (userCardData.getFrom() == 600) {
            str2 = "liveProfilecard_pkanchor";
        }
        tfs.C20303a c20303aM190972b = tfs.m190969k().m190972b(i6tVar.m213810E2(), false);
        c20303aM190972b.m190978h(user.f56859id).m190975e(str2);
        afu.m97555d(str, c20303aM190972b.m190971a());
    }
}
