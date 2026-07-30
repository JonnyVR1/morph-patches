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
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.HandlerC14214e;
import com.tencent.liteav.basic.util.HandlerC14217h;
import com.tencent.rtmp.video.TXScreenCapture;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.liteav.screencapture.c */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
public class C14354c {

    /* JADX INFO: renamed from: a */
    private static volatile C14354c f60753a;

    /* JADX INFO: renamed from: b */
    private final Context f60754b;

    /* JADX INFO: renamed from: f */
    private MediaProjection f60758f;

    /* JADX INFO: renamed from: g */
    private HandlerC14217h f60759g;

    /* JADX INFO: renamed from: h */
    private boolean f60760h;

    /* JADX INFO: renamed from: d */
    private final Map<Surface, a> f60756d = new HashMap();

    /* JADX INFO: renamed from: e */
    private boolean f60757e = false;

    /* JADX INFO: renamed from: i */
    private MediaProjection.Callback f60761i = new MediaProjection.Callback() { // from class: com.tencent.liteav.screencapture.c.1
        @Override // android.media.projection.MediaProjection.Callback
        public void onStop() {
            TXCLog.m84149e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            HashMap map = new HashMap(C14354c.this.f60756d);
            C14354c.this.f60756d.clear();
            for (a aVar : map.values()) {
                b bVar = aVar.f60769d;
                if (bVar != null) {
                    if (aVar.f60770e != null) {
                        bVar.mo85168a();
                    } else {
                        bVar.mo85170a(false, false);
                    }
                }
            }
            C14354c.this.m85185a(false);
        }
    };

    /* JADX INFO: renamed from: j */
    private HandlerC14217h.a f60762j = new HandlerC14217h.a() { // from class: com.tencent.liteav.screencapture.c.2
        @Override // com.tencent.liteav.basic.util.HandlerC14217h.a
        public void onTimeout() {
            C14354c c14354c = C14354c.this;
            boolean zM85188b = c14354c.m85188b(c14354c.f60754b);
            if (C14354c.this.f60760h == zM85188b) {
                return;
            }
            C14354c.this.f60760h = zM85188b;
            Iterator it = C14354c.this.f60756d.values().iterator();
            while (it.hasNext()) {
                b bVar = ((a) it.next()).f60769d;
                if (bVar != null) {
                    bVar.mo85169a(zM85188b);
                }
            }
        }
    };

    /* JADX INFO: renamed from: c */
    private final Handler f60755c = new HandlerC14214e(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public Surface f60766a;

        /* JADX INFO: renamed from: b */
        public int f60767b;

        /* JADX INFO: renamed from: c */
        public int f60768c;

        /* JADX INFO: renamed from: d */
        public b f60769d;

        /* JADX INFO: renamed from: e */
        public VirtualDisplay f60770e;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.screencapture.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo85168a();

        /* JADX INFO: renamed from: a */
        void mo85169a(boolean z);

        /* JADX INFO: renamed from: a */
        void mo85170a(boolean z, boolean z2);
    }

    public C14354c(Context context) {
        this.f60754b = context.getApplicationContext();
        this.f60760h = m85188b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public boolean m85188b(Context context) {
        int rotation;
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        return windowManager == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == 0 || rotation == 2;
    }

    /* JADX INFO: renamed from: a */
    public void m85191a(MediaProjection mediaProjection) {
        this.f60757e = false;
        if (mediaProjection == null) {
            HashMap map = new HashMap(this.f60756d);
            this.f60756d.clear();
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                b bVar = ((a) it.next()).f60769d;
                if (bVar != null) {
                    bVar.mo85170a(false, true);
                }
            }
            return;
        }
        TXCLog.m84152i("VirtualDisplayManager", "Got session " + mediaProjection);
        this.f60758f = mediaProjection;
        mediaProjection.registerCallback(this.f60761i, this.f60755c);
        m85183a();
        HandlerC14217h handlerC14217h = new HandlerC14217h(Looper.getMainLooper(), this.f60762j);
        this.f60759g = handlerC14217h;
        handlerC14217h.m84248a(50, 50);
        m85185a(true);
    }

    /* JADX INFO: renamed from: a */
    public static C14354c m85181a(Context context) {
        if (f60753a == null) {
            synchronized (C14354c.class) {
                try {
                    if (f60753a == null) {
                        f60753a = new C14354c(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f60753a;
    }

    /* JADX INFO: renamed from: a */
    public void m85193a(Surface surface, int i, int i2, b bVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            wtq0.m207906a("Must call this method in main thread!");
            return;
        }
        if (surface == null) {
            TXCLog.m84149e("VirtualDisplayManager", "surface is null!");
            bVar.mo85170a(false, false);
            return;
        }
        a aVar = new a();
        aVar.f60766a = surface;
        aVar.f60767b = i;
        aVar.f60768c = i2;
        aVar.f60769d = bVar;
        aVar.f60770e = null;
        this.f60756d.put(surface, aVar);
        if (this.f60758f == null) {
            if (this.f60757e) {
                return;
            }
            this.f60757e = true;
            Intent intent = new Intent(this.f60754b, (Class<?>) TXScreenCapture.TXScreenCaptureAssistantActivity.class);
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            this.f60754b.startActivity(intent);
            return;
        }
        m85183a();
    }

    /* JADX INFO: renamed from: a */
    public void m85192a(Surface surface) {
        VirtualDisplay virtualDisplay;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            wtq0.m207906a("Must call this at main thread!");
            return;
        }
        if (surface == null) {
            return;
        }
        a aVarRemove = this.f60756d.remove(surface);
        if (aVarRemove != null && (virtualDisplay = aVarRemove.f60770e) != null) {
            virtualDisplay.release();
            TXCLog.m84152i("VirtualDisplayManager", "VirtualDisplay released, " + aVarRemove.f60770e);
        }
        m85185a(true);
    }

    /* JADX INFO: renamed from: a */
    private void m85183a() {
        for (a aVar : this.f60756d.values()) {
            if (aVar.f60770e == null) {
                aVar.f60770e = this.f60758f.createVirtualDisplay("TXCScreenCapture", aVar.f60767b, aVar.f60768c, 1, 1, aVar.f60766a, null, null);
                TXCLog.m84152i("VirtualDisplayManager", "create VirtualDisplay " + aVar.f60770e);
                b bVar = aVar.f60769d;
                if (bVar != null) {
                    bVar.mo85170a(true, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m85185a(boolean z) {
        if (this.f60756d.isEmpty()) {
            if (z) {
                this.f60755c.postDelayed(new Runnable() { // from class: com.tencent.liteav.screencapture.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C14354c.this.m85185a(false);
                    }
                }, 1000L);
                return;
            }
            TXCLog.m84152i("VirtualDisplayManager", "stop media projection session " + this.f60758f);
            MediaProjection mediaProjection = this.f60758f;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this.f60761i);
                this.f60758f.stop();
                this.f60758f = null;
            }
            HandlerC14217h handlerC14217h = this.f60759g;
            if (handlerC14217h != null) {
                handlerC14217h.m84247a();
                this.f60759g = null;
            }
        }
    }
}
