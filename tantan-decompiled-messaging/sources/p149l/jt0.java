package p149l;

import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/jt0;", "Ll/oml;", "<init>", "()V", "", "url", "", CommandMessage.PARAMS, "a", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Ll/k850;", "Ll/k850;", "getDefaultClient", "()Ll/k850;", "defaultClient", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class jt0 implements oml {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final k850 defaultClient;

    public jt0() {
        k850 k850VarM144882c = new k850.C17954b().m144891l(new ec20(null, null, 3, null)).m144882c();
        k850VarM144882c.getClass();
        this.defaultClient = k850VarM144882c;
    }

    @Override // p149l.oml
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo143069a(@NotNull String url, @NotNull Map<String, String> params) throws IOException {
        url.getClass();
        params.getClass();
        cll.C16188a c16188aM107524p = cll.m107499l(url).m107524p();
        ArrayList arrayList = new ArrayList(params.size());
        for (Map.Entry<String, String> entry : params.entrySet()) {
            arrayList.add(c16188aM107524p.m107534a(entry.getKey(), entry.getValue()));
        }
        exc0 exc0VarExecute = this.defaultClient.mo144849a(new stc0.C20027a().m185900s(c16188aM107524p.m107537d()).m185887f().m185883b()).execute();
        try {
            exc0VarExecute.getClass();
            if (!exc0VarExecute.m118597I()) {
                throw new IOException("Unexpected code " + exc0VarExecute);
            }
            gxc0 gxc0VarM118606k = exc0VarExecute.m118606k();
            String strString = gxc0VarM118606k != null ? gxc0VarM118606k.string() : null;
            NetworkMetricsStatistics.INSTANCE.m18178f();
            CloseableKt.m87404a(exc0VarExecute, null);
            return strString;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(exc0VarExecute, th);
                throw th2;
            }
        }
    }
}
