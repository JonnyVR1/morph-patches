package com.p046p1.mobile.putong.live.base.mmsdk.player;

import android.content.Context;
import android.view.Surface;
import p149l.beu;
import p149l.h4m;
import p149l.iph0;
import p149l.ku00;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes13.dex */
public class TTLivePlayer implements h4m {

    /* JADX INFO: renamed from: a */
    public h4m f44531a;

    /* JADX INFO: renamed from: b */
    public C12459a.b f44532b;

    /* JADX INFO: renamed from: c */
    public C12459a f44533c = C12459a.m68524b();

    /* JADX INFO: renamed from: d */
    public boolean f44534d;

    public enum PlayerType {
        NEW_MOMO
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer$a */
    public class C12457a implements C12459a.b {
        public C12457a() {
        }

        @Override // com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a.b
        /* JADX INFO: renamed from: a */
        public void mo68520a(int i) {
            TTLivePlayer.this.f44531a.setMute(true);
        }

        @Override // com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a.b
        /* JADX INFO: renamed from: b */
        public void mo68521b(int i, String str) {
            if (TTLivePlayer.this.f44534d) {
                return;
            }
            TTLivePlayer.this.f44531a.setMute(false);
        }

        @Override // com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a.b
        /* JADX INFO: renamed from: c */
        public void mo68522c(int i) {
            if (TTLivePlayer.this.f44534d) {
                return;
            }
            TTLivePlayer.this.f44531a.setMute(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer$b */
    public static /* synthetic */ class C12458b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44536a;

        static {
            int[] iArr = new int[PlayerType.values().length];
            f44536a = iArr;
            try {
                iArr[PlayerType.NEW_MOMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public TTLivePlayer(Context context, beu beuVar, PlayerType playerType) {
        if (C12458b.f44536a[playerType.ordinal()] == 1) {
            this.f44531a = new ku00(beuVar, context);
        }
        C12457a c12457a = new C12457a();
        this.f44532b = c12457a;
        this.f44533c.m68525c(c12457a);
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: a */
    public PullWatchInfo mo68515a() {
        h4m h4mVar = this.f44531a;
        if (h4mVar == null) {
            return null;
        }
        return h4mVar.mo68515a();
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: b */
    public void mo68516b(String str, String str2) {
        this.f44531a.mo68516b(str, str2);
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: c */
    public void mo68517c(iph0 iph0Var) {
        this.f44531a.mo68517c(iph0Var);
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: d */
    public void mo68518d(Surface surface) {
        this.f44531a.mo68518d(surface);
    }

    @Override // p149l.h4m
    /* JADX INFO: renamed from: e */
    public void mo68519e(boolean z) {
        this.f44531a.mo68519e(z);
    }

    @Override // p149l.h4m
    public boolean isPlaying() {
        return this.f44531a.isPlaying();
    }

    @Override // p149l.h4m
    public void release() {
        this.f44531a.release();
        this.f44533c.m68526d(this.f44532b);
    }

    @Override // p149l.h4m
    public void setMute(boolean z) {
        this.f44531a.setMute(z);
        this.f44534d = z;
    }
}
