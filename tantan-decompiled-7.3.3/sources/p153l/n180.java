package p153l;

import android.view.View;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.LivePkScoreView;

/* JADX INFO: loaded from: classes5.dex */
public class n180 {

    /* JADX INFO: renamed from: a */
    public static String f139727a = "LivePkConstant";

    /* JADX INFO: renamed from: b */
    public static int f139728b;

    /* JADX INFO: renamed from: c */
    public static int f139729c;

    /* JADX INFO: renamed from: a */
    public static String m161084a(i6t<dw40, ?> i6tVar) {
        dw40 dw40VarM213810E2 = i6tVar.m213810E2();
        return "pk mute anchorId = " + (dw40VarM213810E2.m168532l0() == null ? "" : dw40VarM213810E2.m168532l0().f56859id) + " liveId = " + dw40VarM213810E2.m202191k() + " roomId = " + dw40VarM213810E2.m202194o();
    }

    /* JADX INFO: renamed from: b */
    public static void m161085b(String str) {
        if (wft.m206159b(2)) {
            fhw.m125605a(f139727a, str);
        } else {
            nsh0.m164605g(str, f139727a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m161086c(i6t<dw40, ?> i6tVar, boolean z, boolean z2, String str, boolean z3) {
        m161093j("onAnchorTogglePkMute " + m161084a(i6tVar) + " engineIsNull = " + z + " motionIsNull = " + z2 + " targetUserId = " + str + " isMute = " + z3);
    }

    /* JADX INFO: renamed from: d */
    public static void m161087d(i6t<dw40, ?> i6tVar, boolean z) {
        StringBuilder sb = new StringBuilder("onMuteButtonClick ");
        sb.append(m161084a(i6tVar));
        sb.append(" currentMuteStatus = ");
        sb.append(z);
        sb.append(" to newState = ");
        sb.append(!z);
        m161093j(sb.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m161088e(i6t<dw40, ?> i6tVar) {
        m161093j("onMuteConfirmDialogDismiss " + m161084a(i6tVar));
    }

    /* JADX INFO: renamed from: f */
    public static void m161089f(i6t<dw40, ?> i6tVar) {
        m161093j("onMuteConfirmDialogShow " + m161084a(i6tVar));
    }

    /* JADX INFO: renamed from: g */
    public static void m161090g(i6t<dw40, ?> i6tVar, boolean z, Throwable th) {
        String str = "onMuteNotifyService " + m161084a(i6tVar) + " isSuccess = " + z;
        if (th != null) {
            str = str + " throwable = " + th.toString();
        }
        m161093j(str);
    }

    /* JADX INFO: renamed from: h */
    public static void m161091h() {
        f139728b = 0;
        f139729c = 0;
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m161092i(String str, T t) {
        m161085b(str);
        return t;
    }

    /* JADX INFO: renamed from: j */
    public static void m161093j(String str) {
        m161085b(str);
    }

    /* JADX INFO: renamed from: k */
    public static LivePkMessage m161094k(LivePkMessage livePkMessage) {
        if ("pk_point".equals(livePkMessage.type)) {
            m161100q(livePkMessage);
            return livePkMessage;
        }
        m161093j("receive longlink message:" + livePkMessage.toString());
        return livePkMessage;
    }

    /* JADX INFO: renamed from: l */
    public static void m161095l(int i) {
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
        m161093j("PkMathchModule renderView type：".concat(str));
    }

    /* JADX INFO: renamed from: m */
    public static void m161096m(int i) {
        String str;
        if (i == 2) {
            str = "MATCHING";
        } else {
            str = i == 3 ? "PK_PROCESS" : RelationshipStatus.DEFAULT;
        }
        m161093j("PkAnchorLaunchModule set state :".concat(str));
    }

    /* JADX INFO: renamed from: n */
    public static void m161097n(LivePkScoreView livePkScoreView, long j, long j2) {
        if (f139728b % 10 == 0) {
            m161093j("renderPoint view visible:" + bnl0.m105529O0(livePkScoreView) + ",score[0]=" + j + ",score[1]=" + j2);
        }
        f139728b++;
    }

    /* JADX INFO: renamed from: o */
    public static void m161098o(PkData pkData) {
        m161093j(" receive pk state change:" + pkData.toString());
        if (TEnum.equals(pkData.state, "ended") || TEnum.equals(pkData.state, "preparing")) {
            m161091h();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m161099p(PkData pkData, View view, boolean z) {
        m161085b("render pk view data: " + pkData + ",visible:" + bnl0.m105529O0(view) + ",show anim:" + z);
    }

    /* JADX INFO: renamed from: q */
    public static void m161100q(LivePkMessage livePkMessage) {
        if (f139729c % 10 == 0) {
            m161093j("trackPointMessage " + livePkMessage.toString());
        }
        f139729c++;
    }
}
