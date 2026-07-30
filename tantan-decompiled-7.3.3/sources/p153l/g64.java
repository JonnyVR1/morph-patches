package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;

/* JADX INFO: loaded from: classes5.dex */
public class g64 {

    /* JADX INFO: renamed from: a */
    public static String f102376a = "[live]call";

    /* JADX INFO: renamed from: b */
    public static int f102377b;

    /* JADX INFO: renamed from: c */
    public static int f102378c;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m129080a(StringBuilder sb, BLiveCall bLiveCall) {
        sb.append("userId:");
        sb.append(bLiveCall.user);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append("state:");
        sb.append(bLiveCall.state);
        sb.append(com.meituan.robust.Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m129081b(StringBuilder sb, BLiveCall bLiveCall) {
        sb.append(bLiveCall.f45190id);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append("state");
        sb.append(bLiveCall.state);
        sb.append(com.meituan.robust.Constants.PACKNAME_END);
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m129082c(String str, T t) {
        return (T) heu.m134674b(f102376a, str, t);
    }

    /* JADX INFO: renamed from: d */
    public static void m129083d(String str) {
        heu.m134675c(f102376a, str);
    }

    /* JADX INFO: renamed from: e */
    public static void m129084e(Integer num, Object obj, qvd qvdVar) {
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
        if (num.intValue() != 5 || f102378c % 10 == 0) {
            final StringBuilder sb = new StringBuilder();
            jyb.m147537z(qvdVar.m178269l(), new y20() { // from class: l.f64
                @Override // p153l.y20
                public final void call(Object obj2) {
                    g64.m129081b(sb, (BLiveCall) obj2);
                }
            });
            m129083d("anchor sdk callback action:" + str + ",param:" + string + ",current deputies:" + sb.toString());
        }
        if (num.intValue() == 5) {
            if (f102378c == 10) {
                f102378c = 0;
            }
            f102378c++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m129085f(Integer num, Object obj, qvd qvdVar) {
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
        if (num.intValue() != 3 || f102377b % 10 == 0) {
            final StringBuilder sb = new StringBuilder();
            jyb.m147537z(qvdVar.m178269l(), new y20() { // from class: l.e64
                @Override // p153l.y20
                public final void call(Object obj2) {
                    g64.m129080a(sb, (BLiveCall) obj2);
                }
            });
            m129083d("audience sdk callback action:" + str + ",param:" + string + ",current deputies:" + sb.toString());
        }
        if (num.intValue() == 3) {
            if (f102377b == 10) {
                f102377b = 0;
            }
            f102377b++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m129086g(boolean z, boolean z2, qvd qvdVar) {
        m129082c("checkDeputyPusher", "deputy size = " + qvdVar.m178270m().m143253m().size() + " hasConnecting " + z2 + " to call = " + z);
    }

    /* JADX INFO: renamed from: h */
    public static void m129087h(LiveCallMessage liveCallMessage) {
        if (liveCallMessage == null) {
            return;
        }
        m129083d("call message type:" + liveCallMessage.getType() + ",call:" + (liveCallMessage.getCall() == null ? "" : liveCallMessage.getCall().toString()));
    }
}
