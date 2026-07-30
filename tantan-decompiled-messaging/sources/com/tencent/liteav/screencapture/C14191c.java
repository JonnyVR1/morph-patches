package com.tencent.liteav.screencapture;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.HandlerC14051e;
import com.tencent.liteav.basic.util.HandlerC14054h;
import com.tencent.rtmp.video.TXScreenCapture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p149l.qkq0;

/* JADX INFO: renamed from: com.tencent.liteav.screencapture.c */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
public class C14191c {

    /* JADX INFO: renamed from: a */
    private static volatile C14191c f59905a;

    /* JADX INFO: renamed from: b */
    private final Context f59906b;

    /* JADX INFO: renamed from: f */
    private MediaProjection f59910f;

    /* JADX INFO: renamed from: g */
    private HandlerC14054h f59911g;

    /* JADX INFO: renamed from: h */
    private boolean f59912h;

    /* JADX INFO: renamed from: d */
    private final Map<Surface, a> f59908d = new HashMap();

    /* JADX INFO: renamed from: e */
    private boolean f59909e = false;

    /* JADX INFO: renamed from: i */
    private MediaProjection.Callback f59913i = new MediaProjection.Callback() { // from class: com.tencent.liteav.screencapture.c.1
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            TXCLog.m82966e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            HashMap map = new HashMap(C14191c.this.f59908d);
            C14191c.this.f59908d.clear();
            for (a aVar : map.values()) {
                b bVar = aVar.f59921d;
                if (bVar != null) {
                    if (aVar.f59922e != null) {
                        bVar.mo83985a();
                    } else {
                        bVar.mo83987a(false, false);
                    }
                }
            }
            C14191c.this.m84002a(false);
        }
    };

    /* JADX INFO: renamed from: j */
    private HandlerC14054h.a f59914j = new HandlerC14054h.a() { // from class: com.tencent.liteav.screencapture.c.2
        @Override // com.tencent.liteav.basic.util.HandlerC14054h.a
        public void onTimeout() {
            C14191c c14191c = C14191c.this;
            boolean zM84005b = c14191c.m84005b(c14191c.f59906b);
            if (C14191c.this.f59912h == zM84005b) {
                return;
            }
            C14191c.this.f59912h = zM84005b;
            Iterator it = C14191c.this.f59908d.values().iterator();
            while (it.hasNext()) {
                b bVar = ((a) it.next()).f59921d;
                if (bVar != null) {
                    bVar.mo83986a(zM84005b);
                }
            }
        }
    };

    /* JADX INFO: renamed from: c */
    private final Handler f59907c = new HandlerC14051e(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Surface f59918a;

        /* JADX INFO: renamed from: b */
        public int f59919b;

        /* JADX INFO: renamed from: c */
        public int f59920c;

        /* JADX INFO: renamed from: d */
        public b f59921d;

        /* JADX INFO: renamed from: e */
        public VirtualDisplay f59922e;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo83985a();

        /* JADX INFO: renamed from: a */
        void mo83986a(boolean z);

        /* JADX INFO: renamed from: a */
        void mo83987a(boolean z, boolean z2);
    }

    public C14191c(Context context) {
        this.f59906b = context.getApplicationContext();
        this.f59912h = m84005b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m84005b(Context context) {
        int rotation;
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        return windowManager == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == 0 || rotation == 2;
    }

    /* JADX INFO: renamed from: a */
    public void m84008a(MediaProjection mediaProjection) {
        this.f59909e = false;
        if (mediaProjection == null) {
            HashMap map = new HashMap(this.f59908d);
            this.f59908d.clear();
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                b bVar = ((a) it.next()).f59921d;
                if (bVar != null) {
                    bVar.mo83987a(false, true);
                }
            }
            return;
        }
        TXCLog.m82969i("VirtualDisplayManager", "Got session " + mediaProjection);
        this.f59910f = mediaProjection;
        mediaProjection.registerCallback(this.f59913i, this.f59907c);
        m84000a();
        HandlerC14054h handlerC14054h = new HandlerC14054h(Looper.getMainLooper(), this.f59914j);
        this.f59911g = handlerC14054h;
        handlerC14054h.m83065a(50, 50);
        m84002a(true);
    }

    /* JADX INFO: renamed from: a */
    public static C14191c m83998a(Context context) {
        if (f59905a == null) {
            synchronized (C14191c.class) {
                try {
                    if (f59905a == null) {
                        f59905a = new C14191c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f59905a;
    }

    /* JADX INFO: renamed from: a */
    public void m84010a(Surface surface, int i, int i2, b bVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qkq0.m175383a("Must call this method in main thread!");
            return;
        }
        if (surface == null) {
            TXCLog.m82966e("VirtualDisplayManager", "surface is null!");
            bVar.mo83987a(false, false);
            return;
        }
        a aVar = new a();
        aVar.f59918a = surface;
        aVar.f59919b = i;
        aVar.f59920c = i2;
        aVar.f59921d = bVar;
        aVar.f59922e = null;
        this.f59908d.put(surface, aVar);
        if (this.f59910f == null) {
            if (this.f59909e) {
                return;
            }
            this.f59909e = true;
            Intent intent = new Intent(this.f59906b, (Class<?>) TXScreenCapture.TXScreenCaptureAssistantActivity.class);
            intent.addFlags(268435456);
            this.f59906b.startActivity(intent);
            return;
        }
        m84000a();
    }

    /* JADX INFO: renamed from: a */
    public void m84009a(Surface surface) {
        VirtualDisplay virtualDisplay;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            qkq0.m175383a("Must call this at main thread!");
            return;
        }
        if (surface == null) {
            return;
        }
        a aVarRemove = this.f59908d.remove(surface);
        if (aVarRemove != null && (virtualDisplay = aVarRemove.f59922e) != null) {
            virtualDisplay.release();
            TXCLog.m82969i("VirtualDisplayManager", "VirtualDisplay released, " + aVarRemove.f59922e);
        }
        m84002a(true);
    }

    /* JADX INFO: renamed from: a */
    private void m84000a() {
        for (a aVar : this.f59908d.values()) {
            if (aVar.f59922e == null) {
                aVar.f59922e = this.f59910f.createVirtualDisplay("TXCScreenCapture", aVar.f59919b, aVar.f59920c, 1, 1, aVar.f59918a, null, null);
                TXCLog.m82969i("VirtualDisplayManager", "create VirtualDisplay " + aVar.f59922e);
                b bVar = aVar.f59921d;
                if (bVar != null) {
                    bVar.mo83987a(true, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84002a(boolean z) {
        if (this.f59908d.isEmpty()) {
            if (z) {
                this.f59907c.postDelayed(new Runnable() { // from class: com.tencent.liteav.screencapture.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C14191c.this.m84002a(false);
                    }
                }, 1000L);
                return;
            }
            TXCLog.m82969i("VirtualDisplayManager", "stop media projection session " + this.f59910f);
            MediaProjection mediaProjection = this.f59910f;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this.f59913i);
                this.f59910f.stop();
                this.f59910f = null;
            }
            HandlerC14054h handlerC14054h = this.f59911g;
            if (handlerC14054h != null) {
                handlerC14054h.m83064a();
                this.f59911g = null;
            }
        }
    }
}
