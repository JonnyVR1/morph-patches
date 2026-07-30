package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class sx00<T extends MonitorEvent> implements mxl<T> {

    /* JADX INFO: renamed from: a */
    public s2f f166772a;

    /* JADX INFO: renamed from: b */
    public Context f166773b;

    /* JADX INFO: renamed from: c */
    public boolean f166774c;

    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo81108c() {
        return nt2.m160825p().m202321l();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract s1f mo81109d();

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract g4f mo81110e();

    /* JADX INFO: renamed from: f */
    public String mo81111f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void mo81112g(Context context, s2f s2fVar) {
        this.f166773b = context;
        this.f166772a = s2fVar;
        vx00.m200474d("[init]" + getEventType() + " init!!!", new Object[0]);
    }

    /* JADX INFO: renamed from: h */
    public boolean m186393h() {
        return this.f166774c;
    }

    /* JADX INFO: renamed from: i */
    public final void m186394i(@Nullable oqf oqfVar, @NonNull MonitorEvent monitorEvent) {
        gn4.m127113c(monitorEvent);
        if (oqfVar == null) {
            return;
        }
        HashMap<String, String> mapM165422a = oqfVar.m165422a();
        if (mapM165422a.size() > 0) {
            for (Map.Entry<String, String> entry : mapM165422a.entrySet()) {
                monitorEvent.setExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, JSONObject> mapM165424c = oqfVar.m165424c();
        if (mapM165424c.size() > 0) {
            for (Map.Entry<String, JSONObject> entry2 : mapM165424c.entrySet()) {
                monitorEvent.setExtra(entry2.getKey(), entry2.getValue().toString());
            }
        }
        ArrayList<File> arrayListM165423b = oqfVar.m165423b();
        if (arrayListM165423b == null || arrayListM165423b.size() <= 0) {
            return;
        }
        monitorEvent.addFiles(arrayListM165423b);
    }

    /* JADX INFO: renamed from: j */
    public void m186395j(T t) {
        s2f s2fVar;
        s2f s2fVar2 = this.f166772a;
        if ((s2fVar2 == null || !s2fVar2.mo108725b(t)) && (s2fVar = this.f166772a) != null) {
            m186394i(s2fVar.mo108724a(t), t);
            p3f p3fVarM201301j = w3f.m201297m().m201301j();
            if (t.getEventType() == null || !p3fVarM201301j.mo137131b(t.getEventType())) {
                return;
            }
            p3fVarM201301j.mo137132c(t, mo81110e());
            p3fVarM201301j.mo137130a(t);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo133937b() {
    }
}
