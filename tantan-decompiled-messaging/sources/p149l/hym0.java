package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/hym0;", "", "<init>", "()V", "", "error", "", "a", "(Ljava/lang/Throwable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hym0 {

    @NotNull
    public static final hym0 INSTANCE = new hym0();

    /* JADX INFO: renamed from: a */
    public final void m133616a(@NotNull Throwable error) {
        error.getClass();
        if (error instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) error;
            int i = coreService.code;
            String str = coreService.metaMessage;
            if (str == null) {
                lsi0.m151593w(R$string.f46698G9);
                return;
            }
            switch (i) {
                case 43076:
                    lsi0.m151595y(str);
                    break;
                case 43077:
                    lsi0.m151595y(str);
                    break;
                case 43078:
                    lsi0.m151595y(str);
                    break;
                case 43079:
                    lsi0.m151595y(str);
                    break;
                case 43080:
                    lsi0.m151595y(str);
                    break;
                default:
                    lsi0.m151593w(R$string.f46698G9);
                    break;
            }
        }
    }
}
