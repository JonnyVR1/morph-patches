package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.SvipPrivacySettings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;
import l.tpd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qtm {
    /* JADX INFO: renamed from: a */
    public static boolean m21305a(String str, User user) {
        Conversation conversationXe;
        if (user == null || str.startsWith("-") || (conversationXe = CoreModule.c.f0.Xe(str)) == null || TextUtils.equals(conversationXe.convType, "group") || conversationXe.isQuickChatConv()) {
            return false;
        }
        if (!TextUtils.equals((String) CoreModule.c.e0.I5.get(), m21306b())) {
            return true;
        }
        String str2 = (String) CoreModule.c.e0.J5.get();
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
    public static String m21306b() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        return mqi0.f17028d.format(date);
    }

    /* JADX INFO: renamed from: c */
    public static long m21307c(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.a(user.settings) || vwb.J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: d */
    public static void m21308d(String str, String str2) {
        if (!TextUtils.equals((String) CoreModule.c.e0.I5.get(), m21306b())) {
            CoreModule.c.e0.I5.put(m21306b());
            CoreModule.c.e0.J5.clear();
            CoreModule.c.e0.J5.put(str + "&" + str2);
            CoreModule.c.e0.K5.clear();
            return;
        }
        String str3 = (String) CoreModule.c.e0.J5.get();
        if (TextUtils.isEmpty(str3)) {
            CoreModule.c.e0.J5.put(str + "&" + str2);
            return;
        }
        CoreModule.c.e0.J5.put(str3 + "#" + str + "&" + str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m21309e(String str, User user) {
        if (user.location.isHideUpdateTime()) {
            return 0;
        }
        long jM18550o = ((mqi0.m18550o() - ((long) (user.isHideActiveFromSVip() ? m21307c(user) : user.location.updatedTime))) / 1000) / 3600;
        if (jM18550o < 1 || jM18550o >= 48) {
            return 0;
        }
        return (int) jM18550o;
    }

    /* JADX INFO: renamed from: f */
    public static void m21310f(String str) {
        String str2 = (String) CoreModule.c.e0.K5.get();
        if ((TextUtils.isEmpty(str2) || !str2.contains(str)) && TextUtils.equals((String) CoreModule.c.e0.I5.get(), m21306b())) {
            String str3 = (String) CoreModule.c.e0.J5.get();
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            for (String str4 : str3.split("#")) {
                if (!TextUtils.isEmpty(str4)) {
                    String[] strArrSplit = str4.split("&");
                    if (strArrSplit.length == 2 && TextUtils.equals(strArrSplit[0], str)) {
                        String str5 = (String) CoreModule.c.e0.K5.get();
                        if (TextUtils.isEmpty(str5)) {
                            CoreModule.c.e0.K5.put(str);
                        } else {
                            CoreModule.c.e0.K5.put(str5 + "#" + str);
                        }
                        CoreModule.c.f0.Of(strArrSplit[1]);
                        CoreModule.c.f0.Pf(str, "local_push_switch_plus");
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m21311g(String str) {
        int iM21309e;
        User userOa = CoreModule.c.e0.oa(str);
        if (m21305a(str, userOa) && (iM21309e = m21309e(str, userOa)) > 0) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get("local_normal_tips");
            messageNew_.cid = str;
            messageNew_.value = String.format("%s上次活跃在%s小时前，可能不会立即回复，请稍候", userOa.getPronoun(), Integer.valueOf(iM21309e));
            messageNew_.localInConversation = true;
            long jM18550o = mqi0.m18550o();
            messageNew_.owner = CoreModule.H().userId();
            messageNew_.createdTime = jM18550o;
            messageNew_.localCreatedTime = jM18550o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = str;
            tpd0 tpd0Var = App.i;
            messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
            ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
            CoreModule.c.f0.Zg(messageNew_);
            m21308d(str, ((DbObject) messageNew_).id);
            if (NotificationCheckerCommon.m9539a() == NotificationCheckerCommon.State.closed) {
                CoreModule.c.f0.dh(str, MessageType.get("local_push_switch_plus"));
            }
        }
    }
}
