package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;

/* JADX INFO: loaded from: classes5.dex */
public class h54 {

    /* JADX INFO: renamed from: a */
    public static String f105920a = "[live]call";

    /* JADX INFO: renamed from: b */
    public static int f105921b;

    /* JADX INFO: renamed from: c */
    public static int f105922c;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m129374a(StringBuilder sb, BLiveCall bLiveCall) {
        sb.append("userId:");
        sb.append(bLiveCall.user);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append("state:");
        sb.append(bLiveCall.state);
        sb.append(com.meituan.robust.Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m129375b(StringBuilder sb, BLiveCall bLiveCall) {
        sb.append(bLiveCall.f44342id);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append("state");
        sb.append(bLiveCall.state);
        sb.append(com.meituan.robust.Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m129376c(String str, T t) {
        return (T) gcu.m125523b(f105920a, str, t);
    }

    /* JADX INFO: renamed from: d */
    public static void m129377d(String str) {
        gcu.m125524c(f105920a, str);
    }

    /* JADX INFO: renamed from: e */
    public static void m129378e(Integer num, Object obj, cud cudVar) {
        String str = "";
        String string = obj == null ? "" : obj.toString();
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            str = "ACTION_REMOTE_MEMBER_ADDED";
        } else if (iIntValue == 2) {
            str = "ACTION_REMOTE_MEMBER_REMOVE";
        } else if (iIntValue == 4) {
            str = "ACTION_REMOTE_VIDEO_ADD";
        } else if (iIntValue == 5) {
            str = "ACTION_UPDATE_VOLUME";
        } else if (iIntValue == 6) {
            str = "ACTION_RTC_TOKEN_REQUEST";
        }
        if (num.intValue() != 5 || f105922c % 10 == 0) {
            final StringBuilder sb = new StringBuilder();
            vwb.m200354z(cudVar.m108759l(), new e30() { // from class: l.g54
                @Override // p149l.e30
                public final void call(Object obj2) {
                    h54.m129375b(sb, (BLiveCall) obj2);
                }
            });
            m129377d("anchor sdk callback action:" + str + ",param:" + string + ",current deputies:" + sb.toString());
        }
        if (num.intValue() == 5) {
            if (f105922c == 10) {
                f105922c = 0;
            }
            f105922c++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m129379f(Integer num, Object obj, cud cudVar) {
        String str = "";
        String string = obj == null ? "" : obj.toString();
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            str = "ACTION_REMOTE_VIDEO_ADDED";
        } else if (iIntValue == 2) {
            str = "ACTION_REMOTE_VIDEO_REMOVE";
        } else if (iIntValue == 3) {
            str = "ACTION_UPDATE_VOLUME";
        } else if (iIntValue == 4) {
            str = "ACTION_RTC_TOKEN_REQUEST";
        }
        if (num.intValue() != 3 || f105921b % 10 == 0) {
            final StringBuilder sb = new StringBuilder();
            vwb.m200354z(cudVar.m108759l(), new e30() { // from class: l.f54
                @Override // p149l.e30
                public final void call(Object obj2) {
                    h54.m129374a(sb, (BLiveCall) obj2);
                }
            });
            m129377d("audience sdk callback action:" + str + ",param:" + string + ",current deputies:" + sb.toString());
        }
        if (num.intValue() == 3) {
            if (f105921b == 10) {
                f105921b = 0;
            }
            f105921b++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m129380g(boolean z, boolean z2, cud cudVar) {
        m129376c("checkDeputyPusher", "deputy size = " + cudVar.m108760m().m133919m().size() + " hasConnecting " + z2 + " to call = " + z);
    }

    /* JADX INFO: renamed from: h */
    public static void m129381h(LiveCallMessage liveCallMessage) {
        if (liveCallMessage == null) {
            return;
        }
        m129377d("call message type:" + liveCallMessage.getType() + ",call:" + (liveCallMessage.getCall() == null ? "" : liveCallMessage.getCall().toString()));
    }
}
