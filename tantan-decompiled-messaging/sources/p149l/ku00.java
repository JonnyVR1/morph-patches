package p149l;

import android.content.Context;
import android.view.Surface;
import com.immomo.momomediaext.utils.MMLivePlayerConfig;
import com.immomo.momomediaext.utils.MMLivePlayerStatus;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.mmsdk.player.LivePlayerStatus;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes13.dex */
public class ku00 implements h4m {

    /* JADX INFO: renamed from: a */
    public gkw f124637a;

    /* JADX INFO: renamed from: l.ku00$a */
    public class C18081a extends ekw {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ iph0 f124638a;

        public C18081a(iph0 iph0Var) {
            this.f124638a = iph0Var;
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: d */
        public void mo117007d() {
            super.mo117007d();
            this.f124638a.mo137475a();
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: e */
        public void mo117008e(int i) {
            super.mo117008e(i);
            this.f124638a.mo137478d(i);
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: f */
        public void mo117009f() {
            super.mo117009f();
            this.f124638a.mo137477c();
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: g */
        public void mo117010g() {
            super.mo117010g();
            this.f124638a.mo137479e();
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: h */
        public void mo117011h() {
            super.mo117011h();
            this.f124638a.mo137480f();
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: i */
        public void mo117012i() {
            super.mo117012i();
            this.f124638a.mo137476b();
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: j */
        public void mo117013j(MMLiveTranscoding mMLiveTranscoding) {
            super.mo117013j(mMLiveTranscoding);
            this.f124638a.mo137481g(mMLiveTranscoding);
        }

        @Override // p149l.ekw
        /* JADX INFO: renamed from: k */
        public void mo117014k(int i, int i2) {
            super.mo117014k(i, i2);
            this.f124638a.mo137482h(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.ku00$b */
    public static /* synthetic */ class C18082b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f124640a;

        static {
            int[] iArr = new int[MMLivePlayerStatus.values().length];
            f124640a = iArr;
            try {
                iArr[MMLivePlayerStatus.MMLivePlayerStatusPlaying.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124640a[MMLivePlayerStatus.MMLivePlayerStatusBuffering.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124640a[MMLivePlayerStatus.MMLivePlayerStatusStopped.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124640a[MMLivePlayerStatus.MMLivePlayerStatusFinished.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124640a[MMLivePlayerStatus.MMLivePlayerStatusFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ku00(beu beuVar, Context context) {
        this.f124637a = new gkw(context, new MMLiveUserConfig(beuVar.f75241a, beuVar.f75246f, beuVar.f75242b, beuVar.f75243c, px0.m171778b(App.f15369e), px0.m171777a(App.f15369e), false));
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: a */
    public PullWatchInfo mo68515a() {
        gkw gkwVar = this.f124637a;
        if (gkwVar == null) {
            return null;
        }
        return gkwVar.m126728i();
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: b */
    public void mo68516b(String str, String str2) {
        MMLivePlayerConfig mMLivePlayerConfig = new MMLivePlayerConfig();
        mMLivePlayerConfig.url = str;
        mMLivePlayerConfig.ipv6Url = str2;
        this.f124637a.m126733o(mMLivePlayerConfig);
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: c */
    public void mo68517c(iph0 iph0Var) {
        gkw gkwVar = this.f124637a;
        if (iph0Var == null) {
            gkwVar.m126731m(null);
        } else {
            gkwVar.m126731m(new C18081a(iph0Var));
        }
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: d */
    public void mo68518d(Surface surface) {
        this.f124637a.m126732n(surface);
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: e */
    public void mo68519e(boolean z) {
        this.f124637a.m126734p();
    }

    /* JADX INFO: renamed from: f */
    public LivePlayerStatus m147237f() {
        return m147238g(this.f124637a.m126727h());
    }

    /* JADX INFO: renamed from: g */
    public final LivePlayerStatus m147238g(MMLivePlayerStatus mMLivePlayerStatus) {
        if (mMLivePlayerStatus == null) {
            return LivePlayerStatus.Unknown;
        }
        int i = C18082b.f124640a[mMLivePlayerStatus.ordinal()];
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

    @Override // p149l.h4m
    public boolean isPlaying() {
        return m147237f() == LivePlayerStatus.Playing;
    }

    @Override // p149l.h4m
    public void release() {
        this.f124637a.m126729k();
    }

    @Override // p149l.h4m
    public void setMute(boolean z) {
        this.f124637a.m126730l(z);
    }
}
