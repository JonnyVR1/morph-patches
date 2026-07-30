package p153l;

import android.content.Context;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;

/* JADX INFO: loaded from: classes11.dex */
public class f6f extends c610 {

    /* JADX INFO: renamed from: l.f6f$a */
    public class C16911a implements k5f {
        public C16911a() {
        }

        @Override // p153l.k5f
        /* JADX INFO: renamed from: a */
        public void mo82303a(MonitorEvent monitorEvent) {
            monitorEvent.setFormat(mod.m159258c().mo107477a());
            monitorEvent.setCacheDir(f6f.this.mo82291c() + "/" + monitorEvent.getEventId());
        }
    }

    @Override // p153l.f0m
    /* JADX INFO: renamed from: a */
    public String mo82290a() {
        return "catch";
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: c */
    public String mo82291c() {
        return super.mo82291c() + "/" + getEventType();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: d */
    public x2f mo82292d() {
        return mod.m159258c();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: e */
    public k5f mo82293e() {
        return new C16911a();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: g */
    public void mo82295g(Context context, x3f x3fVar) {
        super.mo82295g(context, x3fVar);
        uu2.m198141c(this);
        this.f79924c = true;
    }

    @Override // p153l.f0m
    public String getEventType() {
        return "exception";
    }
}
