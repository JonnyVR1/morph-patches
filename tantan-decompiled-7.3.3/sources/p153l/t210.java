package p153l;

import android.content.Context;
import android.view.Surface;
import com.immomo.momomediaext.utils.MMLivePlayerConfig;
import com.immomo.momomediaext.utils.MMLivePlayerStatus;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.mmsdk.player.LivePlayerStatus;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes13.dex */
public class t210 implements x6m {

    /* JADX INFO: renamed from: a */
    public fnw f171706a;

    /* JADX INFO: renamed from: l.t210$a */
    public class C20216a extends dnw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pxh0 f171707a;

        public C20216a(pxh0 pxh0Var) {
            this.f171707a = pxh0Var;
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: d */
        public void mo117077d() {
            super.mo117077d();
            this.f171707a.mo174222a();
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: e */
        public void mo117078e(int i) {
            super.mo117078e(i);
            this.f171707a.mo174225d(i);
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: f */
        public void mo117079f() {
            super.mo117079f();
            this.f171707a.mo174224c();
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: g */
        public void mo117080g() {
            super.mo117080g();
            this.f171707a.mo174226e();
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: h */
        public void mo117081h() {
            super.mo117081h();
            this.f171707a.mo174227f();
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: i */
        public void mo117082i() {
            super.mo117082i();
            this.f171707a.mo174223b();
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: j */
        public void mo117083j(MMLiveTranscoding mMLiveTranscoding) {
            super.mo117083j(mMLiveTranscoding);
            this.f171707a.mo174228g(mMLiveTranscoding);
        }

        @Override // p153l.dnw
        /* JADX INFO: renamed from: k */
        public void mo117084k(int i, int i2) {
            super.mo117084k(i, i2);
            this.f171707a.mo174229h(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.t210$b */
    public static /* synthetic */ class C20217b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171709a;

        static {
            int[] iArr = new int[MMLivePlayerStatus.values().length];
            f171709a = iArr;
            try {
                iArr[MMLivePlayerStatus.MMLivePlayerStatusPlaying.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f171709a[MMLivePlayerStatus.MMLivePlayerStatusBuffering.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f171709a[MMLivePlayerStatus.MMLivePlayerStatusStopped.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f171709a[MMLivePlayerStatus.MMLivePlayerStatusFinished.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f171709a[MMLivePlayerStatus.MMLivePlayerStatusFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public t210(cgu cguVar, Context context) {
        this.f171706a = new fnw(context, new MMLiveUserConfig(cguVar.f81730a, cguVar.f81735f, cguVar.f81731b, cguVar.f81732c, wx0.m208362b(App.f16088e), wx0.m208361a(App.f16088e), false));
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: a */
    public PullWatchInfo mo69698a() {
        fnw fnwVar = this.f171706a;
        if (fnwVar == null) {
            return null;
        }
        return fnwVar.m126395i();
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: b */
    public void mo69699b(String str, String str2) {
        MMLivePlayerConfig mMLivePlayerConfig = new MMLivePlayerConfig();
        mMLivePlayerConfig.url = str;
        mMLivePlayerConfig.ipv6Url = str2;
        this.f171706a.m126400o(mMLivePlayerConfig);
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: c */
    public void mo69700c(pxh0 pxh0Var) {
        fnw fnwVar = this.f171706a;
        if (pxh0Var == null) {
            fnwVar.m126398m(null);
        } else {
            fnwVar.m126398m(new C20216a(pxh0Var));
        }
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: d */
    public void mo69701d(Surface surface) {
        this.f171706a.m126399n(surface);
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: e */
    public void mo69702e(boolean z) {
        this.f171706a.m126401p();
    }

    /* JADX INFO: renamed from: f */
    public LivePlayerStatus m188939f() {
        return m188940g(this.f171706a.m126394h());
    }

    /* JADX INFO: renamed from: g */
    public final LivePlayerStatus m188940g(MMLivePlayerStatus mMLivePlayerStatus) {
        if (mMLivePlayerStatus == null) {
            return LivePlayerStatus.Unknown;
        }
        int i = C20217b.f171709a[mMLivePlayerStatus.ordinal()];
        if (i == 1) {
            return LivePlayerStatus.Playing;
        }
        if (i == 2) {
            return LivePlayerStatus.Buffering;
        }
        if (i == 3) {
            return LivePlayerStatus.Stopped;
        }
        if (i != 4) {
            return i != 5 ? LivePlayerStatus.Unknown : LivePlayerStatus.Failed;
        }
        return LivePlayerStatus.Finished;
    }

    @Override // p153l.x6m
    public boolean isPlaying() {
        return m188939f() == LivePlayerStatus.Playing;
    }

    @Override // p153l.x6m
    public void release() {
        this.f171706a.m126396k();
    }

    @Override // p153l.x6m
    public void setMute(boolean z) {
        this.f171706a.m126397l(z);
    }
}
