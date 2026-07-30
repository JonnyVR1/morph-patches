package com.tencent.liteav;

import android.content.Context;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p091a.EnumC14167b;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.InterfaceC14185o;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14284n {

    /* JADX INFO: renamed from: b */
    protected Context f60274b;

    /* JADX INFO: renamed from: d */
    protected WeakReference<InterfaceC14170b> f60276d;

    /* JADX INFO: renamed from: a */
    protected C14274h f60273a = null;

    /* JADX INFO: renamed from: c */
    protected TXCloudVideoView f60275c = null;

    public AbstractC14284n(Context context) {
        this.f60274b = null;
        if (context != null) {
            this.f60274b = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo84753a(String str, int i);

    /* JADX INFO: renamed from: a */
    public abstract int mo84754a(boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo84756a(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo84760a(InterfaceC14185o interfaceC14185o);

    /* JADX INFO: renamed from: a */
    public void mo84761a(C14274h c14274h) {
        this.f60273a = c14274h;
        if (c14274h == null) {
            this.f60273a = new C14274h();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo84766a(boolean z, int i);

    /* JADX INFO: renamed from: b */
    public void mo84767b() {
        TXCLog.m84156w("TXIPlayer", "resume not support");
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo84768b(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo84769b(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo84770c(int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo84771c(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo84772c();

    /* JADX INFO: renamed from: d */
    public abstract int mo84773d();

    /* JADX INFO: renamed from: d */
    public abstract int mo84774d(int i);

    /* JADX INFO: renamed from: d */
    public void m84848d(boolean z) {
        TXCLog.m84156w("TXIPlayer", "autoPlay not implement");
    }

    /* JADX INFO: renamed from: e */
    public void m84849e(int i) {
        TXCLog.m84156w("TXIPlayer", "seek not support");
    }

    /* JADX INFO: renamed from: f */
    public void mo84776f() {
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo84778h();

    /* JADX INFO: renamed from: i */
    public C14274h m84850i() {
        return this.f60273a;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo84775e() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void mo84757a(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void mo84758a(Context context, int i) {
    }

    /* JADX INFO: renamed from: a */
    public void mo84759a(Surface surface) {
    }

    /* JADX INFO: renamed from: a */
    public void mo84762a(InterfaceC14318o interfaceC14318o, EnumC14167b enumC14167b, Object obj) {
    }

    /* JADX INFO: renamed from: a */
    public void mo84763a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
    }

    /* JADX INFO: renamed from: a */
    public void mo84765a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    /* JADX INFO: renamed from: a */
    public int mo84752a(String str) {
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public void mo84755a() {
        TXCLog.m84156w("TXIPlayer", "pause not support");
    }

    /* JADX INFO: renamed from: a */
    public void mo84764a(TXCloudVideoView tXCloudVideoView) {
        this.f60275c = tXCloudVideoView;
    }

    /* JADX INFO: renamed from: a */
    public void m84847a(InterfaceC14170b interfaceC14170b) {
        this.f60276d = new WeakReference<>(interfaceC14170b);
    }

    /* JADX INFO: renamed from: a */
    public void m84846a(float f) {
        TXCLog.m84156w("TXIPlayer", "rate not implement");
    }
}
