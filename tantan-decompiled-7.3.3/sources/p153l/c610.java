package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c610<T extends MonitorEvent> implements f0m<T> {

    /* JADX INFO: renamed from: a */
    public x3f f79922a;

    /* JADX INFO: renamed from: b */
    public Context f79923b;

    /* JADX INFO: renamed from: c */
    public boolean f79924c;

    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo82291c() {
        return du2.m118056p().m110256l();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract x2f mo82292d();

    @Nullable
    /* JADX INFO: renamed from: e */
    public abstract k5f mo82293e();

    /* JADX INFO: renamed from: f */
    public String mo82294f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void mo82295g(Context context, x3f x3fVar) {
        this.f79923b = context;
        this.f79922a = x3fVar;
        f610.m124266d("[init]" + getEventType() + " init!!!", new Object[0]);
    }

    /* JADX INFO: renamed from: h */
    public boolean m108090h() {
        return this.f79924c;
    }

    /* JADX INFO: renamed from: i */
    public final void m108091i(@Nullable vrf vrfVar, @NonNull MonitorEvent monitorEvent) {
        fo4.m126441c(monitorEvent);
        if (vrfVar == null) {
            return;
        }
        HashMap<String, String> mapM202490a = vrfVar.m202490a();
        if (mapM202490a.size() > 0) {
            for (Map.Entry<String, String> entry : mapM202490a.entrySet()) {
                monitorEvent.setExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, JSONObject> mapM202492c = vrfVar.m202492c();
        if (mapM202492c.size() > 0) {
            for (Map.Entry<String, JSONObject> entry2 : mapM202492c.entrySet()) {
                monitorEvent.setExtra(entry2.getKey(), entry2.getValue().toString());
            }
        }
        ArrayList<File> arrayListM202491b = vrfVar.m202491b();
        if (arrayListM202491b == null || arrayListM202491b.size() <= 0) {
            return;
        }
        monitorEvent.addFiles(arrayListM202491b);
    }

    /* JADX INFO: renamed from: j */
    public void m108092j(T t) {
        x3f x3fVar;
        x3f x3fVar2 = this.f79922a;
        if ((x3fVar2 == null || !x3fVar2.mo187986b(t)) && (x3fVar = this.f79922a) != null) {
            m108091i(x3fVar.mo187985a(t), t);
            u4f u4fVarM96064j = a5f.m96060m().m96064j();
            if (t.getEventType() == null || !u4fVarM96064j.mo164113b(t.getEventType())) {
                return;
            }
            u4fVarM96064j.mo164114c(t, mo82293e());
            u4fVarM96064j.mo164112a(t);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo108089b() {
    }
}
