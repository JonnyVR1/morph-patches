package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class zzq implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f205817b = new zzq();

    /* JADX INFO: renamed from: d */
    public static j4m m221027d() {
        return f205817b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        User user = pi6Var.f149102b;
        return false;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        Conversation conversation = pi6Var.f149101a;
        int color = -79843;
        try {
            if (!TextUtils.isEmpty(conversation.additional.game.gameTextColor)) {
                color = Color.parseColor(conversation.additional.game.gameTextColor);
            }
        } catch (Exception unused) {
        }
        return zz6.m221002s0(conversation.additional.game.gameText, color);
    }
}
