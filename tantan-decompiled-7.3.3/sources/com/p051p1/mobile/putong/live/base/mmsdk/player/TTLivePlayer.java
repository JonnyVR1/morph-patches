package com.p051p1.mobile.putong.live.base.mmsdk.player;

import android.content.Context;
import android.view.Surface;
import p153l.cgu;
import p153l.pxh0;
import p153l.t210;
import p153l.x6m;
import tv.danmaku.ijk.media.player.PullWatchInfo;

/* JADX INFO: loaded from: classes13.dex */
public class TTLivePlayer implements x6m {

    /* JADX INFO: renamed from: a */
    public x6m f45379a;

    /* JADX INFO: renamed from: b */
    public C12622a.b f45380b;

    /* JADX INFO: renamed from: c */
    public C12622a f45381c = C12622a.m69707b();

    /* JADX INFO: renamed from: d */
    public boolean f45382d;

    public enum PlayerType {
        NEW_MOMO
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer$a */
    public class C12620a implements C12622a.b {
        public C12620a() {
        }

        @Override // com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a.b
        /* JADX INFO: renamed from: a */
        public void mo69703a(int i) {
            TTLivePlayer.this.f45379a.setMute(true);
        }

        @Override // com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a.b
        /* JADX INFO: renamed from: b */
        public void mo69704b(int i, String str) {
            if (TTLivePlayer.this.f45382d) {
                return;
            }
            TTLivePlayer.this.f45379a.setMute(false);
        }

        @Override // com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a.b
        /* JADX INFO: renamed from: c */
        public void mo69705c(int i) {
            if (TTLivePlayer.this.f45382d) {
                return;
            }
            TTLivePlayer.this.f45379a.setMute(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer$b */
    public static /* synthetic */ class C12621b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45384a;

        static {
            int[] iArr = new int[PlayerType.values().length];
            f45384a = iArr;
            try {
                iArr[PlayerType.NEW_MOMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public TTLivePlayer(Context context, cgu cguVar, PlayerType playerType) {
        if (C12621b.f45384a[playerType.ordinal()] == 1) {
            this.f45379a = new t210(cguVar, context);
        }
        C12620a c12620a = new C12620a();
        this.f45380b = c12620a;
        this.f45381c.m69708c(c12620a);
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: a */
    public PullWatchInfo mo69698a() {
        x6m x6mVar = this.f45379a;
        if (x6mVar == null) {
            return null;
        }
        return x6mVar.mo69698a();
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: b */
    public void mo69699b(String str, String str2) {
        this.f45379a.mo69699b(str, str2);
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: c */
    public void mo69700c(pxh0 pxh0Var) {
        this.f45379a.mo69700c(pxh0Var);
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: d */
    public void mo69701d(Surface surface) {
        this.f45379a.mo69701d(surface);
    }

    @Override // p153l.x6m
    /* JADX INFO: renamed from: e */
    public void mo69702e(boolean z) {
        this.f45379a.mo69702e(z);
    }

    @Override // p153l.x6m
    public boolean isPlaying() {
        return this.f45379a.isPlaying();
    }

    @Override // p153l.x6m
    public void release() {
        this.f45379a.release();
        this.f45381c.m69709d(this.f45380b);
    }

    @Override // p153l.x6m
    public void setMute(boolean z) {
        this.f45379a.setMute(z);
        this.f45382d = z;
    }
}
