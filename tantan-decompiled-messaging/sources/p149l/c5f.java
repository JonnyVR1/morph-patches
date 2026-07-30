package p149l;

import android.content.Context;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;

/* JADX INFO: loaded from: classes13.dex */
public class c5f extends sx00 {

    /* JADX INFO: renamed from: l.c5f$a */
    public class C16076a implements g4f {
        public C16076a() {
        }

        @Override // p149l.g4f
        /* JADX INFO: renamed from: a */
        public void mo81120a(MonitorEvent monitorEvent) {
            monitorEvent.setFormat(hnd.m131888c().mo104783a());
            monitorEvent.setCacheDir(c5f.this.mo81108c() + "/" + monitorEvent.getEventId());
        }
    }

    @Override // p149l.mxl
    /* JADX INFO: renamed from: a */
    public String mo81107a() {
        return "catch";
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: c */
    public String mo81108c() {
        return super.mo81108c() + "/" + getEventType();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: d */
    public s1f mo81109d() {
        return hnd.m131888c();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: e */
    public g4f mo81110e() {
        return new C16076a();
    }

    @Override // p149l.sx00
    /* JADX INFO: renamed from: g */
    public void mo81112g(Context context, s2f s2fVar) {
        super.mo81112g(context, s2fVar);
        eu2.m118149c(this);
        this.f166774c = true;
    }

    @Override // p149l.mxl
    public String getEventType() {
        return "exception";
    }
}
