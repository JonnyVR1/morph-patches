package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class u4n0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m191743b(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134441b = hxn0Var.f109896b;
        mljVar.f134440a = hxn0Var.f109897c;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m191744c(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134441b = hxn0Var.f109896b;
        mljVar.f134440a = hxn0Var.f109897c;
    }

    /* JADX INFO: renamed from: d */
    public static void m191745d(h4t<?, ?> h4tVar, mqv<User> mqvVar) {
        m191746e(h4tVar, mqvVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: e */
    public static void m191746e(h4t<?, ?> h4tVar, mqv<User> mqvVar, w9j<mnj.C18509a, mnj.C18509a> w9jVar, w9j<fp50, fp50> w9jVar2) {
        User user = mqvVar.f135304a;
        String str = user.pictures.get(0).url;
        if (h4tVar.m206027E2().mo149813j().isVoiceLive() && vdt.m198092b(3)) {
            str = hxn0.m133350c(mqvVar).f109896b.avatar;
        }
        final mlj mljVarM155153b = mlj.m155153b(new i54(user.f56011id, user.name, str), q44.m172921a());
        mljVarM155153b.f134446g = "voiceLiveAudience";
        hxn0.m133350c(mqvVar).m133351a(new e30() { // from class: l.r4n0
            @Override // p149l.e30
            public final void call(Object obj) {
                u4n0.m191744c(mljVarM155153b, (hxn0) obj);
            }
        });
        mnj.C18509a c18509aM155526g = new mnj.C18509a().m155526g(mljVarM155153b);
        if (w9jVar != null) {
            c18509aM155526g = w9jVar.call(c18509aM155526g);
        }
        fp50 fp50VarM122566j = new fp50().m122565i(9000).m122564h(c18509aM155526g.m155523d()).m122566j("voiceLiveAudience");
        if (NullChecker.m81303a(w9jVar2)) {
            fp50VarM122566j = w9jVar2.call(fp50VarM122566j);
        }
        h4tVar.m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(fp50VarM122566j);
    }

    /* JADX INFO: renamed from: f */
    public static void m191747f(h4t<?, ?> h4tVar, BLiveVoiceCall bLiveVoiceCall) {
        m191748g(h4tVar, bLiveVoiceCall, "");
    }

    /* JADX INFO: renamed from: g */
    public static void m191748g(h4t<?, ?> h4tVar, BLiveVoiceCall bLiveVoiceCall, String str) {
        xpm0 xpm0VarM210508b = new xpm0().m210508b(bLiveVoiceCall);
        Object objM206027E2 = h4tVar.m206027E2();
        if (!vdt.m198092b(3) && (objM206027E2 instanceof nnn0) && ((nnn0) objM206027E2).m160267e3()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            xpm0VarM210508b.m210514h(str);
        }
        h4tVar.m206028F2().VoiceCallEvent.leaveVoiceEvent().mo172463j(xpm0VarM210508b);
    }

    /* JADX INFO: renamed from: h */
    public static void m191749h(h4t<?, ?> h4tVar, BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar) {
        m191750i(h4tVar, bLiveVoiceCall, mqvVar, null, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: i */
    public static void m191750i(h4t<?, ?> h4tVar, BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar, w9j<mnj.C18509a, mnj.C18509a> w9jVar, w9j<fp50, fp50> w9jVar2) {
        String str = TextUtils.equals(bLiveVoiceCall.user, h4tVar.m206027E2().m132146l0().f56011id) ? "voiceLiveMain" : "voiceLiveVice";
        final mlj mljVarM155154c = mlj.m155154c(mqvVar.f135304a, q44.m172922b(bLiveVoiceCall.f44485id, TextUtils.equals(bLiveVoiceCall.user, bLiveVoiceCall.anchor) ? "gift-audience-none-voiceLiveMain" : "gift-audience-none-voiceLiveVice", bLiveVoiceCall.position));
        hxn0.m133350c(mqvVar).m133351a(new e30() { // from class: l.s4n0
            @Override // p149l.e30
            public final void call(Object obj) {
                u4n0.m191743b(mljVarM155154c, (hxn0) obj);
            }
        });
        mljVarM155154c.f134446g = str;
        mnj.C18509a c18509aM155526g = new mnj.C18509a().m155526g(mljVarM155154c);
        if (w9jVar != null) {
            c18509aM155526g = w9jVar.call(c18509aM155526g);
        }
        fp50 fp50VarM122566j = new fp50().m122565i(9000).m122564h(c18509aM155526g.m155523d()).m122566j(str);
        if (NullChecker.m81303a(w9jVar2)) {
            fp50VarM122566j = w9jVar2.call(fp50VarM122566j);
        }
        h4tVar.m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(fp50VarM122566j);
    }

    /* JADX INFO: renamed from: j */
    public static void m191751j(h4t<?, ?> h4tVar, final List<Integer> list, String str, String str2, String str3) {
        nnn0 nnn0Var = (nnn0) h4tVar.m206027E2();
        BLiveVoiceCall bLiveVoiceCallM102063l = nnn0Var.m160249P2().m102063l(str);
        mqv<i54> mqvVarM102064m = nnn0Var.m160249P2().m102064m(str);
        if (bLiveVoiceCallM102063l != null) {
            m191749h(h4tVar, bLiveVoiceCallM102063l, mqvVarM102064m);
            return;
        }
        User userNew_ = User.new_();
        userNew_.f56011id = str;
        userNew_.pictures = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = str3;
        userNew_.pictures.add(pictureNew_);
        userNew_.name = str2;
        BLiveUserMask bLiveUserMask = new BLiveUserMask();
        bLiveUserMask.avatar = str3;
        bLiveUserMask.userId = str;
        bLiveUserMask.name = str2;
        m191746e(h4tVar, mqv.m155998f(userNew_).m156002d(new hxn0().m133355f(bLiveUserMask)), null, new w9j() { // from class: l.t4n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((fp50) obj).m122563g(list);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static void m191752k(h4t h4tVar, String str, String str2) {
        m191753l(h4tVar, str, str2, false);
    }

    /* JADX INFO: renamed from: l */
    public static void m191753l(h4t h4tVar, String str, String str2, boolean z) {
        String strM103387b = bqq.m103387b(h4tVar, str, str2, 9000);
        UserCardData.Builder builderTrackFrom = UserCardData.builder(9000).userId(str2).setFromIdentity(strM103387b).setTo(bqq.m103390e(h4tVar, str, str2, 9000)).setSource("live").setScene(BLiveType.voiceLive).trackFrom("liveRoom");
        if (z) {
            builderTrackFrom.showShadow();
        }
        h4tVar.m206028F2().OpenUserCardDialogEvent.show().mo172463j(builderTrackFrom.build());
    }

    /* JADX INFO: renamed from: m */
    public static void m191754m(h4t<?, ?> h4tVar) {
        h4tVar.m206028F2().VoiceCallEvent.updateDeputyEvent().m172467p();
    }

    /* JADX INFO: renamed from: n */
    public static void m191755n(h4t<?, ?> h4tVar) {
        h4tVar.m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
    }

    /* JADX INFO: renamed from: o */
    public static void m191756o(h4t<?, ?> h4tVar) {
        h4tVar.m206028F2().VoiceCallEvent.nineMicApplyCallChooseEvent().m172467p();
    }

    /* JADX INFO: renamed from: p */
    public static void m191757p(h4t<?, ?> h4tVar, String str, boolean z, String str2) {
        h4tVar.m206028F2().VoiceCallEvent.callMuteEvent().mo172463j(new xpm0().m210509c(str).m210515i(z).m210514h(str2));
    }

    /* JADX INFO: renamed from: q */
    public static void m191758q(h4t<?, ?> h4tVar, BLiveVoiceCall bLiveVoiceCall) {
        h4tVar.m206028F2().VoiceCallEvent.updateSelfCallEvent().mo172463j(bLiveVoiceCall);
    }
}
