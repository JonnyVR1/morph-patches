package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.SvipPrivacySettings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class rvm {
    /* JADX INFO: renamed from: a */
    public static boolean m183273a(String str, User user) {
        Conversation conversationM33859Xe;
        if (user == null || str.startsWith("-") || (conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str)) == null || TextUtils.equals(conversationM33859Xe.convType, "group") || conversationM33859Xe.isQuickChatConv()) {
            return false;
        }
        if (!TextUtils.equals(CoreModule.f18264c.f20381e0.f89051I5.get(), m183274b())) {
            return true;
        }
        String str2 = CoreModule.f18264c.f20381e0.f89058J5.get();
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String[] strArrSplit = str2.split("#");
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(str3.split("&")[0]);
            }
        }
        return arrayList.size() < 2 && !arrayList.contains(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m183274b() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        return pzi0.f154857d.format(date);
    }

    /* JADX INFO: renamed from: c */
    public static long m183275c(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m82486a(user.settings) || jyb.m147479J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m82486a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: d */
    public static void m183276d(String str, String str2) {
        if (!TextUtils.equals(CoreModule.f18264c.f20381e0.f89051I5.get(), m183274b())) {
            CoreModule.f18264c.f20381e0.f89051I5.put(m183274b());
            CoreModule.f18264c.f20381e0.f89058J5.clear();
            CoreModule.f18264c.f20381e0.f89058J5.put(str + "&" + str2);
            CoreModule.f18264c.f20381e0.f89065K5.clear();
            return;
        }
        String str3 = CoreModule.f18264c.f20381e0.f89058J5.get();
        if (TextUtils.isEmpty(str3)) {
            CoreModule.f18264c.f20381e0.f89058J5.put(str + "&" + str2);
            return;
        }
        CoreModule.f18264c.f20381e0.f89058J5.put(str3 + "#" + str + "&" + str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m183277e(String str, User user) {
        if (user.location.isHideUpdateTime()) {
            return 0;
        }
        long jM174454o = ((pzi0.m174454o() - ((long) (user.isHideActiveFromSVip() ? m183275c(user) : user.location.updatedTime))) / 1000) / 3600;
        if (jM174454o < 1 || jM174454o >= 48) {
            return 0;
        }
        return (int) jM174454o;
    }

    /* JADX INFO: renamed from: f */
    public static void m183278f(String str) {
        String str2 = CoreModule.f18264c.f20381e0.f89065K5.get();
        if ((TextUtils.isEmpty(str2) || !str2.contains(str)) && TextUtils.equals(CoreModule.f18264c.f20381e0.f89051I5.get(), m183274b())) {
            String str3 = CoreModule.f18264c.f20381e0.f89058J5.get();
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            for (String str4 : str3.split("#")) {
                if (!TextUtils.isEmpty(str4)) {
                    String[] strArrSplit = str4.split("&");
                    if (strArrSplit.length == 2 && TextUtils.equals(strArrSplit[0], str)) {
                        String str5 = CoreModule.f18264c.f20381e0.f89065K5.get();
                        if (TextUtils.isEmpty(str5)) {
                            CoreModule.f18264c.f20381e0.f89065K5.put(str);
                        } else {
                            CoreModule.f18264c.f20381e0.f89065K5.put(str5 + "#" + str);
                        }
                        CoreModule.f18264c.f20384f0.m33753Of(strArrSplit[1]);
                        CoreModule.f18264c.f20384f0.m33765Pf(str, MessageType.local_push_switch_plus);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m183279g(String str) {
        int iM183277e;
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str);
        if (m183273a(str, userM116597oa) && (iM183277e = m183277e(str, userM116597oa)) > 0) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.local_normal_tips);
            messageNew_.cid = str;
            messageNew_.value = String.format("%s上次活跃在%s小时前，可能不会立即回复，请稍候", userM116597oa.getPronoun(), Integer.valueOf(iM183277e));
            messageNew_.localInConversation = true;
            long jM174454o = pzi0.m174454o();
            messageNew_.owner = CoreModule.m30929H().userId();
            messageNew_.createdTime = jM174454o;
            messageNew_.localCreatedTime = jM174454o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = str;
            vxd0 vxd0Var = App.f16092i;
            messageNew_.localCreatedSession = vxd0Var.get().intValue();
            messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
            CoreModule.f18264c.f20384f0.m33885Zg(messageNew_);
            m183276d(str, messageNew_.f56859id);
            if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed) {
                CoreModule.f18264c.f20384f0.m33933dh(str, MessageType.get(MessageType.local_push_switch_plus));
            }
        }
    }
}
