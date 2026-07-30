package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/l7n0;", "", "<init>", "()V", "", "error", "", "a", "(Ljava/lang/Throwable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class l7n0 {

    @NotNull
    public static final l7n0 INSTANCE = new l7n0();

    /* JADX INFO: renamed from: a */
    public final void m153146a(@NotNull Throwable error) {
        error.getClass();
        if (error instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) error;
            int i = coreService.code;
            String str = coreService.metaMessage;
            if (str == null) {
                o1j0.m165649w(R$string.f47546G9);
                return;
            }
            switch (i) {
                case 43076:
                    o1j0.m165651y(str);
                    break;
                case 43077:
                    o1j0.m165651y(str);
                    break;
                case 43078:
                    o1j0.m165651y(str);
                    break;
                case 43079:
                    o1j0.m165651y(str);
                    break;
                case 43080:
                    o1j0.m165651y(str);
                    break;
                default:
                    o1j0.m165649w(R$string.f47546G9);
                    break;
            }
        }
    }
}
