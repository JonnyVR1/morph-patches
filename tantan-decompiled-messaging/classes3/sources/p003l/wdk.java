package p003l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.InModeration;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.lsi0;
import l.xdl0;
import p028v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wdk {
    /* JADX INFO: renamed from: b */
    public static boolean m8549b(ChatGroup chatGroup) {
        InModeration inModeration;
        return (chatGroup == null || (inModeration = chatGroup.inModeration) == null || TextUtils.isEmpty(inModeration.description)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8550c(ChatGroup chatGroup) {
        InModeration inModeration;
        return (chatGroup == null || (inModeration = chatGroup.inModeration) == null || TextUtils.isEmpty(inModeration.name)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8551d(User user) {
        if (!NullChecker.a(user) || user.isMe()) {
            return false;
        }
        if (user.isBanned() || user.isBannedNew()) {
            lsi0.y("对方账号异常");
            return true;
        }
        if (user.isDelIn()) {
            lsi0.y("我暂时离开几天~");
            return true;
        }
        if (!user.isDelOut()) {
            return false;
        }
        lsi0.y("对方已注销");
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8552e(ChatGroupMember chatGroupMember) {
        InModeration inModeration;
        return (chatGroupMember == null || (inModeration = chatGroupMember.inModeration) == null || TextUtils.isEmpty(inModeration.nickName)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public static void m8553f(ofk.C0449b c0449b, String str) {
        AppCompatTextView appCompatTextView = c0449b.f6123a;
        if (appCompatTextView != null) {
            appCompatTextView.setEnabled(false);
        }
        AppCompatImageView appCompatImageView = c0449b.f6125c;
        if (appCompatImageView != null) {
            xdl0.M(appCompatImageView, false);
        }
        VEditText vEditText = c0449b.f6124b;
        if (vEditText != null) {
            vEditText.setFocusable(false);
            c0449b.f6124b.setFocusableInTouchMode(false);
            c0449b.f6124b.setTextColor(Color.parseColor("#33000000"));
            xdl0.E0(c0449b.f6124b, new View.OnClickListener() { // from class: l.vdk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lsi0.y("审核中，暂不可更改");
                }
            });
            c0449b.f6124b.setText(str);
        }
    }
}
