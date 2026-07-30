package p153l;

import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.Picture;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/nfz;", "", "<init>", "()V", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imageV", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "", "percent", "", "a", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;I)V", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nfz {

    @NotNull
    public static final nfz INSTANCE = new nfz();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m162961a(@Nullable SimpleDraweeView imageV, @NotNull Picture.ImageUri url, int percent) {
        url.getClass();
        if (imageV == null) {
            return;
        }
        pf60 pf60VarM172085a = pf60.m172085a(8, Integer.valueOf((100 - percent) / 10));
        pf60VarM172085a.getClass();
        Integer num = (Integer) pf60VarM172085a.f152157b;
        if (num != null) {
            if (num.intValue() > 0) {
                uqb0.f180374G.m127120O(imageV, url.formatted(), 2, 8);
            } else {
                uqb0.f180374G.m127125Q0(imageV, url);
            }
        }
    }
}
