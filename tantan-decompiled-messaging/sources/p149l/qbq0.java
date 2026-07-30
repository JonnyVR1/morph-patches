package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class qbq0 extends sx00<MonitorEvent> {
    @Override // p149l.mxl
    /* JADX INFO: renamed from: a */
    public String mo81107a() {
        return "native";
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: b */
    public void mo133937b() {
        b620.m100386a();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo81108c() {
        return super.mo81108c() + "/crash/" + mo81107a();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: d */
    public s1f mo81109d() {
        return c620.m105364d();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: e */
    public g4f mo81110e() {
        return new d620();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: g */
    public void mo81112g(Context context, s2f s2fVar) {
        super.mo81112g(context, s2fVar);
        String strMo81108c = mo81108c();
        File file = new File(strMo81108c);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f166774c = b620.m100388c(context, this, strMo81108c);
    }

    @Override // p149l.mxl
    public String getEventType() {
        return "crash";
    }
}
