package p149l;

import android.view.View;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.LivePkScoreView;

/* JADX INFO: loaded from: classes5.dex */
public class ht70 {

    /* JADX INFO: renamed from: a */
    public static String f109375a = "LivePkConstant";

    /* JADX INFO: renamed from: b */
    public static int f109376b;

    /* JADX INFO: renamed from: c */
    public static int f109377c;

    /* JADX INFO: renamed from: a */
    public static String m132844a(h4t<pn40, ?> h4tVar) {
        pn40 pn40VarM206027E2 = h4tVar.m206027E2();
        return "pk mute anchorId = " + (pn40VarM206027E2.m132146l0() == null ? "" : pn40VarM206027E2.m132146l0().f56011id) + " liveId = " + pn40VarM206027E2.m149814k() + " roomId = " + pn40VarM206027E2.m149818o();
    }

    /* JADX INFO: renamed from: b */
    public static void m132845b(String str) {
        if (vdt.m198092b(2)) {
            hfw.m130790a(f109375a, str);
        } else {
            gkh0.m126624g(str, f109375a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m132846c(h4t<pn40, ?> h4tVar, boolean z, boolean z2, String str, boolean z3) {
        m132853j("onAnchorTogglePkMute " + m132844a(h4tVar) + " engineIsNull = " + z + " motionIsNull = " + z2 + " targetUserId = " + str + " isMute = " + z3);
    }

    /* JADX INFO: renamed from: d */
    public static void m132847d(h4t<pn40, ?> h4tVar, boolean z) {
        StringBuilder sb = new StringBuilder("onMuteButtonClick ");
        sb.append(m132844a(h4tVar));
        sb.append(" currentMuteStatus = ");
        sb.append(z);
        sb.append(" to newState = ");
        sb.append(!z);
        m132853j(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m132848e(h4t<pn40, ?> h4tVar) {
        m132853j("onMuteConfirmDialogDismiss " + m132844a(h4tVar));
    }

    /* JADX INFO: renamed from: f */
    public static void m132849f(h4t<pn40, ?> h4tVar) {
        m132853j("onMuteConfirmDialogShow " + m132844a(h4tVar));
    }

    /* JADX INFO: renamed from: g */
    public static void m132850g(h4t<pn40, ?> h4tVar, boolean z, Throwable th) {
        String str = "onMuteNotifyService " + m132844a(h4tVar) + " isSuccess = " + z;
        if (th != null) {
            str = str + " throwable = " + th.toString();
        }
        m132853j(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m132851h() {
        f109376b = 0;
        f109377c = 0;
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m132852i(String str, T t) {
        m132845b(str);
        return t;
    }

    /* JADX INFO: renamed from: j */
    public static void m132853j(String str) {
        m132845b(str);
    }

    /* JADX INFO: renamed from: k */
    public static LivePkMessage m132854k(LivePkMessage livePkMessage) {
        if ("pk_point".equals(livePkMessage.type)) {
            m132860q(livePkMessage);
            return livePkMessage;
        }
        m132853j("receive longlink message:" + livePkMessage.toString());
        return livePkMessage;
    }

    /* JADX INFO: renamed from: l */
    public static void m132855l(int i) {
        String str;
        if (i == 1) {
            str = "SEEK";
        } else if (i == 2) {
            str = "TIMEOUT";
        } else if (i == 3) {
            str = "PK_CREATE";
        } else {
            str = i == 4 ? "PK_INVITE" : "UNKOWN";
        }
        m132853j("PkMathchModule renderView type：".concat(str));
    }

    /* JADX INFO: renamed from: m */
    public static void m132856m(int i) {
        String str;
        if (i == 2) {
            str = "MATCHING";
        } else {
            str = i == 3 ? "PK_PROCESS" : RelationshipStatus.DEFAULT;
        }
        m132853j("PkAnchorLaunchModule set state :".concat(str));
    }

    /* JADX INFO: renamed from: n */
    public static void m132857n(LivePkScoreView livePkScoreView, long j, long j2) {
        if (f109376b % 10 == 0) {
            m132853j("renderPoint view visible:" + xdl0.m208349O0(livePkScoreView) + ",score[0]=" + j + ",score[1]=" + j2);
        }
        f109376b++;
    }

    /* JADX INFO: renamed from: o */
    public static void m132858o(PkData pkData) {
        m132853j(" receive pk state change:" + pkData.toString());
        if (TEnum.equals(pkData.state, "ended") || TEnum.equals(pkData.state, "preparing")) {
            m132851h();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m132859p(PkData pkData, View view, boolean z) {
        m132845b("render pk view data: " + pkData + ",visible:" + xdl0.m208349O0(view) + ",show anim:" + z);
    }

    /* JADX INFO: renamed from: q */
    public static void m132860q(LivePkMessage livePkMessage) {
        if (f109377c % 10 == 0) {
            m132853j("trackPointMessage " + livePkMessage.toString());
        }
        f109377c++;
    }
}
