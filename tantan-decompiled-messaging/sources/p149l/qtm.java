package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.SvipPrivacySettings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class qtm {
    /* JADX INFO: renamed from: a */
    public static boolean m176464a(String str, User user) {
        Conversation conversationM32856Xe;
        if (user == null || str.startsWith("-") || (conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str)) == null || TextUtils.equals(conversationM32856Xe.convType, "group") || conversationM32856Xe.isQuickChatConv()) {
            return false;
        }
        if (!TextUtils.equals(CoreModule.f17545c.f19639e0.f149194I5.get(), m176465b())) {
            return true;
        }
        String str2 = CoreModule.f17545c.f19639e0.f149201J5.get();
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
    public static String m176465b() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        return mqi0.f135252d.format(date);
    }

    /* JADX INFO: renamed from: c */
    public static long m176466c(User user) {
        SvipPrivacySettings svipPrivacySettings;
        if (!NullChecker.m81303a(user.settings) || vwb.m200296J(user.settings.settingGroups)) {
            return 0L;
        }
        SettingGroups settingGroup = user.settings.getSettingGroup();
        if (!NullChecker.m81303a(settingGroup) || (svipPrivacySettings = settingGroup.svipPrivacy) == null) {
            return 0L;
        }
        long j = user.localLatestReceivedMessageTime;
        long j2 = svipPrivacySettings.frozenTime;
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: d */
    public static void m176467d(String str, String str2) {
        if (!TextUtils.equals(CoreModule.f17545c.f19639e0.f149194I5.get(), m176465b())) {
            CoreModule.f17545c.f19639e0.f149194I5.put(m176465b());
            CoreModule.f17545c.f19639e0.f149201J5.clear();
            CoreModule.f17545c.f19639e0.f149201J5.put(str + "&" + str2);
            CoreModule.f17545c.f19639e0.f149208K5.clear();
            return;
        }
        String str3 = CoreModule.f17545c.f19639e0.f149201J5.get();
        if (TextUtils.isEmpty(str3)) {
            CoreModule.f17545c.f19639e0.f149201J5.put(str + "&" + str2);
            return;
        }
        CoreModule.f17545c.f19639e0.f149201J5.put(str3 + "#" + str + "&" + str2);
    }

    /* JADX INFO: renamed from: e */
    public static int m176468e(String str, User user) {
        if (user.location.isHideUpdateTime()) {
            return 0;
        }
        long jM155944o = ((mqi0.m155944o() - ((long) (user.isHideActiveFromSVip() ? m176466c(user) : user.location.updatedTime))) / 1000) / 3600;
        if (jM155944o < 1 || jM155944o >= 48) {
            return 0;
        }
        return (int) jM155944o;
    }

    /* JADX INFO: renamed from: f */
    public static void m176469f(String str) {
        String str2 = CoreModule.f17545c.f19639e0.f149208K5.get();
        if ((TextUtils.isEmpty(str2) || !str2.contains(str)) && TextUtils.equals(CoreModule.f17545c.f19639e0.f149194I5.get(), m176465b())) {
            String str3 = CoreModule.f17545c.f19639e0.f149201J5.get();
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            for (String str4 : str3.split("#")) {
                if (!TextUtils.isEmpty(str4)) {
                    String[] strArrSplit = str4.split("&");
                    if (strArrSplit.length == 2 && TextUtils.equals(strArrSplit[0], str)) {
                        String str5 = CoreModule.f17545c.f19639e0.f149208K5.get();
                        if (TextUtils.isEmpty(str5)) {
                            CoreModule.f17545c.f19639e0.f149208K5.put(str);
                        } else {
                            CoreModule.f17545c.f19639e0.f149208K5.put(str5 + "#" + str);
                        }
                        CoreModule.f17545c.f19642f0.m32750Of(strArrSplit[1]);
                        CoreModule.f17545c.f19642f0.m32762Pf(str, MessageType.local_push_switch_plus);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m176470g(String str) {
        int iM176468e;
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str);
        if (m176464a(str, userM169524oa) && (iM176468e = m176468e(str, userM169524oa)) > 0) {
            Message messageNew_ = Message.new_();
            messageNew_.messageType = MessageType.get(MessageType.local_normal_tips);
            messageNew_.cid = str;
            messageNew_.value = String.format("%s上次活跃在%s小时前，可能不会立即回复，请稍候", userM169524oa.getPronoun(), Integer.valueOf(iM176468e));
            messageNew_.localInConversation = true;
            long jM155944o = mqi0.m155944o();
            messageNew_.owner = CoreModule.m29931H().userId();
            messageNew_.createdTime = jM155944o;
            messageNew_.localCreatedTime = jM155944o;
            messageNew_.recalled = Boolean.FALSE;
            messageNew_.hostId = str;
            tpd0 tpd0Var = App.f15373i;
            messageNew_.localCreatedSession = tpd0Var.get().intValue();
            messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
            CoreModule.f17545c.f19642f0.m32882Zg(messageNew_);
            m176467d(str, messageNew_.f56011id);
            if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed) {
                CoreModule.f17545c.f19642f0.m32930dh(str, MessageType.get(MessageType.local_push_switch_plus));
            }
        }
    }
}
