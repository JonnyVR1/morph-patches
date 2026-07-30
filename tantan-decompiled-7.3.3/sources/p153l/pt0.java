package p153l;

import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/pt0;", "Ll/apl;", "<init>", "()V", "", "url", "", CommandMessage.PARAMS, "a", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Ll/rg50;", "Ll/rg50;", "getDefaultClient", "()Ll/rg50;", "defaultClient", "sdk_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class pt0 implements apl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final rg50 defaultClient;

    public pt0() {
        rg50 rg50VarM181365c = new rg50.C19837b().m181374l(new nk20(null, null, 3, null)).m181365c();
        rg50VarM181365c.getClass();
        this.defaultClient = rg50VarM181365c;
    }

    @Override // p153l.apl
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo99322a(@NotNull String url, @NotNull Map<String, String> params) throws IOException {
        url.getClass();
        params.getClass();
        rnl.C19886a c19886aM182288p = rnl.m182263l(url).m182288p();
        ArrayList arrayList = new ArrayList(params.size());
        for (Map.Entry<String, String> entry : params.entrySet()) {
            arrayList.add(c19886aM182288p.m182298a(entry.getKey(), entry.getValue()));
        }
        i5d0 i5d0VarExecute = this.defaultClient.mo181341a(new x1d0.C21228a().m209045s(c19886aM182288p.m182301d()).m209032f().m209028b()).execute();
        try {
            i5d0VarExecute.getClass();
            if (!i5d0VarExecute.m138661I()) {
                throw new IOException("Unexpected code " + i5d0VarExecute);
            }
            k5d0 k5d0VarM138670k = i5d0VarExecute.m138670k();
            String strString = k5d0VarM138670k != null ? k5d0VarM138670k.string() : null;
            NetworkMetricsStatistics.INSTANCE.m19255f();
            CloseableKt.m88293a(i5d0VarExecute, null);
            return strString;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(i5d0VarExecute, th);
                throw th2;
            }
        }
    }
}
