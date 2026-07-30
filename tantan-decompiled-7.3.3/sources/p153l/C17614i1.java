package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackException;
import com.tantanapp.beatles.anrmonitor.C13704a;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;

/* JADX INFO: renamed from: l.i1 */
/* JADX INFO: loaded from: classes11.dex */
public class C17614i1 extends c610<MonitorEvent> {

    /* JADX INFO: renamed from: d */
    public int f112468d;

    /* JADX INFO: renamed from: e */
    public boolean f112469e;

    /* JADX INFO: renamed from: f */
    public boolean f112470f;

    /* JADX INFO: renamed from: l.i1$a */
    public class a implements k5f {
        public a() {
        }

        @Override // p153l.k5f
        /* JADX INFO: renamed from: a */
        public void mo82303a(@NonNull MonitorEvent monitorEvent) {
            monitorEvent.setFormat(mod.m159258c().mo107477a());
            monitorEvent.setCacheDir(C17614i1.this.mo82291c() + "/" + monitorEvent.getEventId());
        }
    }

    public C17614i1(boolean z) {
        this.f112468d = PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
        this.f112469e = z;
    }

    @Override // p153l.f0m
    /* JADX INFO: renamed from: a */
    public String mo82290a() {
        return "anr";
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: b */
    public void mo108089b() {
        if (this.f112469e || !this.f79924c) {
            return;
        }
        C17113g1.m128480d();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo82291c() {
        return super.mo82291c() + "/" + getEventType() + "/" + mo82290a();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: d */
    public x2f mo82292d() {
        return this.f112470f ? C16158c1.m107476d() : mod.m159258c();
    }

    @Override // p153l.c610
    @Nullable
    /* JADX INFO: renamed from: e */
    public k5f mo82293e() {
        return this.f112470f ? new C16413d1() : new a();
    }

    @Override // p153l.c610
    /* JADX INFO: renamed from: g */
    public void mo82295g(Context context, x3f x3fVar) {
        super.mo82295g(context, x3fVar);
        if (this.f112469e) {
            C13704a c13704a = new C13704a(context, this.f112468d, this);
            c13704a.m82234c();
            c13704a.start();
            this.f79924c = true;
            return;
        }
        String strMo82291c = mo82291c();
        File file = new File(strMo82291c);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f112470f = true;
        this.f79924c = C17113g1.m128482f(context, this, strMo82291c);
    }

    @Override // p153l.f0m
    public String getEventType() {
        return "crash";
    }

    public C17614i1() {
        this(true);
    }
}
