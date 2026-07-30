package com.tencent.liteav;

import android.content.Context;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p086a.EnumC14004b;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.InterfaceC14022o;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p109ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14121n {

    /* JADX INFO: renamed from: b */
    protected Context f59426b;

    /* JADX INFO: renamed from: d */
    protected WeakReference<InterfaceC14007b> f59428d;

    /* JADX INFO: renamed from: a */
    protected C14111h f59425a = null;

    /* JADX INFO: renamed from: c */
    protected TXCloudVideoView f59427c = null;

    public AbstractC14121n(Context context) {
        this.f59426b = null;
        if (context != null) {
            this.f59426b = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo83570a(String str, int i);

    /* JADX INFO: renamed from: a */
    public abstract int mo83571a(boolean z);

    /* JADX INFO: renamed from: a */
    public abstract void mo83573a(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo83577a(InterfaceC14022o interfaceC14022o);

    /* JADX INFO: renamed from: a */
    public void mo83578a(C14111h c14111h) {
        this.f59425a = c14111h;
        if (c14111h == null) {
            this.f59425a = new C14111h();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo83583a(boolean z, int i);

    /* JADX INFO: renamed from: b */
    public void mo83584b() {
        TXCLog.m82973w("TXIPlayer", "resume not support");
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo83585b(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo83586b(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo83587c(int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo83588c(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo83589c();

    /* JADX INFO: renamed from: d */
    public abstract int mo83590d();

    /* JADX INFO: renamed from: d */
    public abstract int mo83591d(int i);

    /* JADX INFO: renamed from: d */
    public void m83665d(boolean z) {
        TXCLog.m82973w("TXIPlayer", "autoPlay not implement");
    }

    /* JADX INFO: renamed from: e */
    public void m83666e(int i) {
        TXCLog.m82973w("TXIPlayer", "seek not support");
    }

    /* JADX INFO: renamed from: f */
    public void mo83593f() {
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo83595h();

    /* JADX INFO: renamed from: i */
    public C14111h m83667i() {
        return this.f59425a;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo83592e() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void mo83574a(int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void mo83575a(Context context, int i) {
    }

    /* JADX INFO: renamed from: a */
    public void mo83576a(Surface surface) {
    }

    /* JADX INFO: renamed from: a */
    public void mo83579a(InterfaceC14155o interfaceC14155o, EnumC14004b enumC14004b, Object obj) {
    }

    /* JADX INFO: renamed from: a */
    public void mo83580a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
    }

    /* JADX INFO: renamed from: a */
    public void mo83582a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    /* JADX INFO: renamed from: a */
    public int mo83569a(String str) {
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public void mo83572a() {
        TXCLog.m82973w("TXIPlayer", "pause not support");
    }

    /* JADX INFO: renamed from: a */
    public void mo83581a(TXCloudVideoView tXCloudVideoView) {
        this.f59427c = tXCloudVideoView;
    }

    /* JADX INFO: renamed from: a */
    public void m83664a(InterfaceC14007b interfaceC14007b) {
        this.f59428d = new WeakReference<>(interfaceC14007b);
    }

    /* JADX INFO: renamed from: a */
    public void m83663a(float f) {
        TXCLog.m82973w("TXIPlayer", "rate not implement");
    }
}
