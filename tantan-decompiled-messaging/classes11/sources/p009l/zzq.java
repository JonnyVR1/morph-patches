package p009l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zzq implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f24058b = new zzq();

    /* JADX INFO: renamed from: d */
    public static j4m m26150d() {
        return f24058b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        User user = pi6Var.f18623b;
        return false;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        Conversation conversation = pi6Var.f18622a;
        int color = -79843;
        try {
            if (!TextUtils.isEmpty(conversation.additional.game.gameTextColor)) {
                color = Color.parseColor(conversation.additional.game.gameTextColor);
            }
        } catch (Exception unused) {
        }
        return zz6.s0(conversation.additional.game.gameText, color);
    }
}
