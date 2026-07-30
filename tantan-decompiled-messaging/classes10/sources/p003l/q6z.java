package p003l;

import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.data.Picture;
import kotlin.Metadata;
import l.j760;
import l.qib0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/q6z;", "", "<init>", "()V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imageV", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "", "percent", "", "a", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;I)V", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class q6z {

    @NotNull
    public static final q6z INSTANCE = new q6z();

    /* JADX INFO: renamed from: a */
    public final void m8919a(@Nullable SimpleDraweeView imageV, @NotNull Picture.ImageUri url, int percent) {
        url.getClass();
        if (imageV == null) {
            return;
        }
        j760 j760VarA = j760.a(8, Integer.valueOf((100 - percent) / 10));
        j760VarA.getClass();
        Integer num = (Integer) j760VarA.b;
        if (num != null) {
            if (num.intValue() > 0) {
                qib0.G.O(imageV, url.formatted(), 2, 8);
            } else {
                qib0.G.Q0(imageV, url);
            }
        }
    }
}
