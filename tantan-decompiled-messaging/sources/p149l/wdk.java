package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.InModeration;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class wdk {
    /* JADX INFO: renamed from: b */
    public static boolean m202742b(ChatGroup chatGroup) {
        InModeration inModeration;
        return (chatGroup == null || (inModeration = chatGroup.inModeration) == null || TextUtils.isEmpty(inModeration.description)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m202743c(ChatGroup chatGroup) {
        InModeration inModeration;
        return (chatGroup == null || (inModeration = chatGroup.inModeration) == null || TextUtils.isEmpty(inModeration.name)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m202744d(User user) {
        if (!NullChecker.m81303a(user) || user.isMe()) {
            return false;
        }
        if (user.isBanned() || user.isBannedNew()) {
            lsi0.m151595y("对方账号异常");
            return true;
        }
        if (user.isDelIn()) {
            lsi0.m151595y("我暂时离开几天~");
            return true;
        }
        if (!user.isDelOut()) {
            return false;
        }
        lsi0.m151595y("对方已注销");
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m202745e(ChatGroupMember chatGroupMember) {
        InModeration inModeration;
        return (chatGroupMember == null || (inModeration = chatGroupMember.inModeration) == null || TextUtils.isEmpty(inModeration.nickName)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static void m202746f(ofk.C18924b c18924b, String str) {
        VText vText = c18924b.f143712a;
        if (vText != null) {
            vText.setEnabled(false);
        }
        VImage vImage = c18924b.f143714c;
        if (vImage != null) {
            xdl0.m208344M(vImage, false);
        }
        VEditText vEditText = c18924b.f143713b;
        if (vEditText != null) {
            vEditText.setFocusable(false);
            c18924b.f143713b.setFocusableInTouchMode(false);
            c18924b.f143713b.setTextColor(Color.parseColor("#33000000"));
            xdl0.m208329E0(c18924b.f143713b, new View.OnClickListener() { // from class: l.vdk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lsi0.m151595y("审核中，暂不可更改");
                }
            });
            c18924b.f143713b.setText(str);
        }
    }
}
