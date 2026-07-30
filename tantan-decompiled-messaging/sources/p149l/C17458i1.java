package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackException;
import com.tantanapp.beatles.anrmonitor.C13541a;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;

/* JADX INFO: renamed from: l.i1 */
/* JADX INFO: loaded from: classes13.dex */
public class C17458i1 extends sx00<MonitorEvent> {

    /* JADX INFO: renamed from: d */
    public int f110400d;

    /* JADX INFO: renamed from: e */
    public boolean f110401e;

    /* JADX INFO: renamed from: f */
    public boolean f110402f;

    /* JADX INFO: renamed from: l.i1$a */
    public class a implements g4f {
        public a() {
        }

        @Override // p149l.g4f
        /* JADX INFO: renamed from: a */
        public void mo81120a(@NonNull MonitorEvent monitorEvent) {
            monitorEvent.setFormat(hnd.m131888c().mo104783a());
            monitorEvent.setCacheDir(C17458i1.this.mo81108c() + "/" + monitorEvent.getEventId());
        }
    }

    public C17458i1(boolean z) {
        this.f110400d = PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
        this.f110401e = z;
    }

    @Override // p149l.mxl
    /* JADX INFO: renamed from: a */
    public String mo81107a() {
        return "anr";
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: b */
    public void mo133937b() {
        if (this.f110401e || !this.f166774c) {
            return;
        }
        C16975g1.m124036d();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo81108c() {
        return super.mo81108c() + "/" + getEventType() + "/" + mo81107a();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: d */
    public s1f mo81109d() {
        return this.f110402f ? C16035c1.m104782d() : hnd.m131888c();
    }

    @Override // p149l.sx00
    @Nullable
    /* JADX INFO: renamed from: e */
    public g4f mo81110e() {
        return this.f110402f ? new C16284d1() : new a();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: g */
    public void mo81112g(Context context, s2f s2fVar) {
        super.mo81112g(context, s2fVar);
        if (this.f110401e) {
            C13541a c13541a = new C13541a(context, this.f110400d, this);
            c13541a.m81051c();
            c13541a.start();
            this.f166774c = true;
            return;
        }
        String strMo81108c = mo81108c();
        File file = new File(strMo81108c);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f110402f = true;
        this.f166774c = C16975g1.m124038f(context, this, strMo81108c);
    }

    @Override // p149l.mxl
    public String getEventType() {
        return "crash";
    }

    public C17458i1() {
        this(true);
    }
}
