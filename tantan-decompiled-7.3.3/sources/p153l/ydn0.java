package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ydn0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m215249b(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82886b = l6o0Var.f130275b;
        cojVar.f82885a = l6o0Var.f130276c;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m215250c(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82886b = l6o0Var.f130275b;
        cojVar.f82885a = l6o0Var.f130276c;
    }

    /* JADX INFO: renamed from: d */
    public static void m215251d(i6t<?, ?> i6tVar, nsv<User> nsvVar) {
        m215252e(i6tVar, nsvVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: e */
    public static void m215252e(i6t<?, ?> i6tVar, nsv<User> nsvVar, qcj<cqj.C16337a, cqj.C16337a> qcjVar, qcj<lx50, lx50> qcjVar2) {
        User user = nsvVar.f143542a;
        String str = user.pictures.get(0).url;
        if (i6tVar.m213810E2().mo183435j().isVoiceLive() && wft.m206159b(3)) {
            str = l6o0.m153068c(nsvVar).f130275b.avatar;
        }
        final coj cojVarM111660b = coj.m111660b(new h64(user.f56859id, user.name, str), p54.m170591a());
        cojVarM111660b.f82891g = "voiceLiveAudience";
        l6o0.m153068c(nsvVar).m153069a(new y20() { // from class: l.vdn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ydn0.m215250c(cojVarM111660b, (l6o0) obj);
            }
        });
        cqj.C16337a c16337aM111926g = new cqj.C16337a().m111926g(cojVarM111660b);
        if (qcjVar != null) {
            c16337aM111926g = qcjVar.call(c16337aM111926g);
        }
        lx50 lx50VarM156160j = new lx50().m156159i(9000).m156158h(c16337aM111926g.m111923d()).m156160j("voiceLiveAudience");
        if (NullChecker.m82486a(qcjVar2)) {
            lx50VarM156160j = qcjVar2.call(lx50VarM156160j);
        }
        i6tVar.m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(lx50VarM156160j);
    }

    /* JADX INFO: renamed from: f */
    public static void m215253f(i6t<?, ?> i6tVar, BLiveVoiceCall bLiveVoiceCall) {
        m215254g(i6tVar, bLiveVoiceCall, "");
    }

    /* JADX INFO: renamed from: g */
    public static void m215254g(i6t<?, ?> i6tVar, BLiveVoiceCall bLiveVoiceCall, String str) {
        bzm0 bzm0VarM107181b = new bzm0().m107181b(bLiveVoiceCall);
        Object objM213810E2 = i6tVar.m213810E2();
        if (!wft.m206159b(3) && (objM213810E2 instanceof rwn0) && ((rwn0) objM213810E2).m183429e3()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            bzm0VarM107181b.m107187h(str);
        }
        i6tVar.m213811F2().VoiceCallEvent.leaveVoiceEvent().mo199273j(bzm0VarM107181b);
    }

    /* JADX INFO: renamed from: h */
    public static void m215255h(i6t<?, ?> i6tVar, BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar) {
        m215256i(i6tVar, bLiveVoiceCall, nsvVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: i */
    public static void m215256i(i6t<?, ?> i6tVar, BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar, qcj<cqj.C16337a, cqj.C16337a> qcjVar, qcj<lx50, lx50> qcjVar2) {
        String str = TextUtils.equals(bLiveVoiceCall.user, i6tVar.m213810E2().m168532l0().f56859id) ? "voiceLiveMain" : "voiceLiveVice";
        final coj cojVarM111661c = coj.m111661c(nsvVar.f143542a, p54.m170592b(bLiveVoiceCall.f45333id, TextUtils.equals(bLiveVoiceCall.user, bLiveVoiceCall.anchor) ? "gift-audience-none-voiceLiveMain" : "gift-audience-none-voiceLiveVice", bLiveVoiceCall.position));
        l6o0.m153068c(nsvVar).m153069a(new y20() { // from class: l.wdn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ydn0.m215249b(cojVarM111661c, (l6o0) obj);
            }
        });
        cojVarM111661c.f82891g = str;
        cqj.C16337a c16337aM111926g = new cqj.C16337a().m111926g(cojVarM111661c);
        if (qcjVar != null) {
            c16337aM111926g = qcjVar.call(c16337aM111926g);
        }
        lx50 lx50VarM156160j = new lx50().m156159i(9000).m156158h(c16337aM111926g.m111923d()).m156160j(str);
        if (NullChecker.m82486a(qcjVar2)) {
            lx50VarM156160j = qcjVar2.call(lx50VarM156160j);
        }
        i6tVar.m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(lx50VarM156160j);
    }

    /* JADX INFO: renamed from: j */
    public static void m215257j(i6t<?, ?> i6tVar, final List<Integer> list, String str, String str2, String str3) {
        rwn0 rwn0Var = (rwn0) i6tVar.m213810E2();
        BLiveVoiceCall bLiveVoiceCallM136873l = rwn0Var.m183411P2().m136873l(str);
        nsv<h64> nsvVarM136874m = rwn0Var.m183411P2().m136874m(str);
        if (bLiveVoiceCallM136873l != null) {
            m215255h(i6tVar, bLiveVoiceCallM136873l, nsvVarM136874m);
            return;
        }
        User userNew_ = User.new_();
        userNew_.f56859id = str;
        userNew_.pictures = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = str3;
        userNew_.pictures.add(pictureNew_);
        userNew_.name = str2;
        BLiveUserMask bLiveUserMask = new BLiveUserMask();
        bLiveUserMask.avatar = str3;
        bLiveUserMask.userId = str;
        bLiveUserMask.name = str2;
        m215252e(i6tVar, nsv.m164636f(userNew_).m164640d(new l6o0().m153073f(bLiveUserMask)), null, new qcj() { // from class: l.xdn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((lx50) obj).m156157g(list);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static void m215258k(i6t i6tVar, String str, String str2) {
        m215259l(i6tVar, str, str2, false);
    }

    /* JADX INFO: renamed from: l */
    public static void m215259l(i6t i6tVar, String str, String str2, boolean z) {
        String strM112228b = csq.m112228b(i6tVar, str, str2, 9000);
        UserCardData.Builder builderTrackFrom = UserCardData.builder(9000).userId(str2).setFromIdentity(strM112228b).setTo(csq.m112231e(i6tVar, str, str2, 9000)).setSource("live").setScene(BLiveType.voiceLive).trackFrom("liveRoom");
        if (z) {
            builderTrackFrom.showShadow();
        }
        i6tVar.m213811F2().OpenUserCardDialogEvent.show().mo199273j(builderTrackFrom.build());
    }

    /* JADX INFO: renamed from: m */
    public static void m215260m(i6t<?, ?> i6tVar) {
        i6tVar.m213811F2().VoiceCallEvent.updateDeputyEvent().m199277p();
    }

    /* JADX INFO: renamed from: n */
    public static void m215261n(i6t<?, ?> i6tVar) {
        i6tVar.m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
    }

    /* JADX INFO: renamed from: o */
    public static void m215262o(i6t<?, ?> i6tVar) {
        i6tVar.m213811F2().VoiceCallEvent.nineMicApplyCallChooseEvent().m199277p();
    }

    /* JADX INFO: renamed from: p */
    public static void m215263p(i6t<?, ?> i6tVar, String str, boolean z, String str2) {
        i6tVar.m213811F2().VoiceCallEvent.callMuteEvent().mo199273j(new bzm0().m107182c(str).m107188i(z).m107187h(str2));
    }

    /* JADX INFO: renamed from: q */
    public static void m215264q(i6t<?, ?> i6tVar, BLiveVoiceCall bLiveVoiceCall) {
        i6tVar.m213811F2().VoiceCallEvent.updateSelfCallEvent().mo199273j(bLiveVoiceCall);
    }
}
