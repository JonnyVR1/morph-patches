package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.InModeration;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class mgk {
    /* JADX INFO: renamed from: b */
    public static boolean m158351b(ChatGroup chatGroup) {
        InModeration inModeration;
        return (chatGroup == null || (inModeration = chatGroup.inModeration) == null || TextUtils.isEmpty(inModeration.description)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m158352c(ChatGroup chatGroup) {
        InModeration inModeration;
        return (chatGroup == null || (inModeration = chatGroup.inModeration) == null || TextUtils.isEmpty(inModeration.name)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m158353d(User user) {
        if (!NullChecker.m82486a(user) || user.isMe()) {
            return false;
        }
        if (user.isBanned() || user.isBannedNew()) {
            o1j0.m165651y("对方账号异常");
            return true;
        }
        if (user.isDelIn()) {
            o1j0.m165651y("我暂时离开几天~");
            return true;
        }
        if (!user.isDelOut()) {
            return false;
        }
        o1j0.m165651y("对方已注销");
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m158354e(ChatGroupMember chatGroupMember) {
        InModeration inModeration;
        return (chatGroupMember == null || (inModeration = chatGroupMember.inModeration) == null || TextUtils.isEmpty(inModeration.nickName)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static void m158355f(eik.C16780b c16780b, String str) {
        VText vText = c16780b.f94177a;
        if (vText != null) {
            vText.setEnabled(false);
        }
        VImage vImage = c16780b.f94179c;
        if (vImage != null) {
            bnl0.m105524M(vImage, false);
        }
        VEditText vEditText = c16780b.f94178b;
        if (vEditText != null) {
            vEditText.setFocusable(false);
            c16780b.f94178b.setFocusableInTouchMode(false);
            c16780b.f94178b.setTextColor(Color.parseColor("#33000000"));
            bnl0.m105509E0(c16780b.f94178b, new View.OnClickListener() { // from class: l.lgk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o1j0.m165651y("审核中，暂不可更改");
                }
            });
            c16780b.f94178b.setText(str);
        }
    }
}
