package p149l;

import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.Picture;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/q6z;", "", "<init>", "()V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imageV", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "", "percent", "", "a", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;I)V", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q6z {

    @NotNull
    public static final q6z INSTANCE = new q6z();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m173182a(@Nullable SimpleDraweeView imageV, @NotNull Picture.ImageUri url, int percent) {
        url.getClass();
        if (imageV == null) {
            return;
        }
        j760 j760VarM140076a = j760.m140076a(8, Integer.valueOf((100 - percent) / 10));
        j760VarM140076a.getClass();
        Integer num = (Integer) j760VarM140076a.f116565b;
        if (num != null) {
            if (num.intValue() > 0) {
                qib0.f154691G.m102336O(imageV, url.formatted(), 2, 8);
            } else {
                qib0.f154691G.m102341Q0(imageV, url);
            }
        }
    }
}
