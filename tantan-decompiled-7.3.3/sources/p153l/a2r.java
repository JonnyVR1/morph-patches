package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class a2r implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f68019b = new a2r();

    /* JADX INFO: renamed from: d */
    public static z6m m95723d() {
        return f68019b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        User user = sj6Var.f168927b;
        return false;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        Conversation conversation = sj6Var.f168926a;
        int color = -79843;
        try {
            if (!TextUtils.isEmpty(conversation.additional.game.gameTextColor)) {
                color = Color.parseColor(conversation.additional.game.gameTextColor);
            }
        } catch (Exception unused) {
        }
        return c17.m107526s0(conversation.additional.game.gameText, color);
    }
}
