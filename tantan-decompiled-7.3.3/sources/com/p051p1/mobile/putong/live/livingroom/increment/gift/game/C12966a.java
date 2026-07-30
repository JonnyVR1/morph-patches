package com.p051p1.mobile.putong.live.livingroom.increment.gift.game;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.MainThread;
import com.momo.xeengine.IXEngine;
import com.momo.xeengine.game.IXGameView;
import com.momo.xeengine.game.XEGameView;
import com.momo.xeengine.script.ScriptBridge;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.clj;
import p153l.oki;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12966a {

    /* JADX INFO: renamed from: a */
    public final String f50480a;

    /* JADX INFO: renamed from: b */
    public final String f50481b;

    /* JADX INFO: renamed from: c */
    public final String f50482c;

    /* JADX INFO: renamed from: d */
    public String f50483d;

    /* JADX INFO: renamed from: e */
    public final c f50484e;

    /* JADX INFO: renamed from: f */
    public boolean f50485f;

    /* JADX INFO: renamed from: g */
    public boolean f50486g;

    /* JADX INFO: renamed from: i */
    public XEGameView f50488i;

    /* JADX INFO: renamed from: j */
    public LiveGameHandler f50489j;

    /* JADX INFO: renamed from: h */
    public boolean f50487h = false;

    /* JADX INFO: renamed from: k */
    public final Handler f50490k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$a */
    public class a implements IXGameView.Callback {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m74800b(String str) {
            if (C12966a.this.f50484e != null) {
                C12966a.this.f50484e.mo74772b(str);
            }
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onEngineDynamicLinkLibraryDownloadProcess(int i, double d) {
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onRenderSizeChanged(int i, int i2) {
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onRenderViewCreate(View view) {
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onStart(IXEngine iXEngine) {
            C12966a.this.m74795l(iXEngine);
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onStartFailed(final String str) {
            C12966a.this.f50490k.post(new Runnable() { // from class: l.ykj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200394a.m74800b(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$b */
    public class b extends LiveGameHandler.C12964c {
        public b() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12964c, com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12962a
        /* JADX INFO: renamed from: b */
        public void mo74782b(String str) {
            C12966a.this.f50490k.post(new Runnable() { // from class: l.alj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72116a.m74804f();
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m74804f() {
            if (C12966a.this.f50484e != null) {
                C12966a.this.f50484e.mo74775e();
            }
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m74805g() {
            C12966a.this.m74796m();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12964c, com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12963b
        public String getUserInfo() {
            return C12966a.this.f50480a;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m74806h(String str, ScriptBridge.Callback callback) {
            if (C12966a.this.f50484e != null) {
                C12966a.this.f50484e.mo74771a(str, callback);
            }
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12964c, com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12962a
        public void removeGame(String str) {
            clj.m110624c("removeGame gameId = " + str);
            C12966a.this.f50490k.removeCallbacksAndMessages(null);
            C12966a.this.f50490k.post(new Runnable() { // from class: l.blj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77196a.m74805g();
                }
            });
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12964c, com.p051p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12963b
        public void uploadScore(final String str, final ScriptBridge.Callback callback) {
            C12966a.this.f50490k.post(new Runnable() { // from class: l.zkj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204779a.m74806h(str, callback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo74771a(String str, ScriptBridge.Callback callback);

        /* JADX INFO: renamed from: b */
        void mo74772b(String str);

        /* JADX INFO: renamed from: c */
        void mo74773c();

        /* JADX INFO: renamed from: d */
        void mo74774d(View view);

        /* JADX INFO: renamed from: e */
        void mo74775e();
    }

    public C12966a(@NotNull c cVar, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        this.f50485f = false;
        this.f50486g = false;
        this.f50480a = str;
        this.f50481b = str2;
        this.f50482c = str3;
        this.f50483d = str4;
        this.f50485f = z;
        this.f50486g = z2;
        this.f50484e = cVar;
    }

    /* JADX INFO: renamed from: g */
    public void m74790g() {
        this.f50487h = false;
        Handler handler = this.f50490k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LiveGameHandler liveGameHandler = this.f50489j;
        if (liveGameHandler != null) {
            liveGameHandler.removeLuaGame();
            this.f50489j.unRegister();
            this.f50489j = null;
        }
        m74797n();
    }

    /* JADX INFO: renamed from: h */
    public final String m74791h() {
        File file = new File(this.f50483d + "/params.txt");
        if (file.exists()) {
            try {
                String strM168010A = oki.m168010A(file);
                if (!TextUtils.isEmpty(strM168010A)) {
                    return ((JSONObject) new JSONObject(strM168010A).getJSONArray("itemList").get(0)).getString("folder");
                }
            } catch (IOException | JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        clj.m110636o("can not get game fold name, use default. gameRootPath is " + this.f50483d);
        return "game";
    }

    /* JADX INFO: renamed from: i */
    public boolean m74792i() {
        return this.f50487h;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m74793j() {
        this.f50487h = true;
    }

    /* JADX INFO: renamed from: k */
    public void m74794k(@NotNull Context context) {
        if (this.f50484e == null) {
            clj.m110636o("gameEffectListener should not be null");
            return;
        }
        XEGameView xEGameView = new XEGameView(context);
        this.f50488i = xEGameView;
        if (this.f50485f) {
            xEGameView.setTouchEnable(true);
        } else {
            xEGameView.setTouchEnable(false);
        }
        this.f50484e.mo74774d(this.f50488i);
        boolean z = this.f50486g;
        XEGameView xEGameView2 = this.f50488i;
        if (z) {
            xEGameView2.setPreferredFramesPerSecond(15);
        } else {
            xEGameView2.setPreferredFramesPerSecond(30);
        }
        this.f50488i.setCallback((IXGameView.Callback) new a());
        this.f50488i.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m74795l(IXEngine iXEngine) {
        String str = this.f50483d + "/" + m74791h();
        this.f50483d = str;
        iXEngine.addLibraryPath(str);
        iXEngine.getLogger().setLogEnable(true);
        LiveGameHandler liveGameHandler = LiveGameHandler.getInstance(iXEngine);
        this.f50489j = liveGameHandler;
        liveGameHandler.register();
        iXEngine.getScriptEngine().startGameScriptFile("app");
        this.f50489j.pushRoomInfo(this.f50481b);
        LiveGameHandler liveGameHandler2 = this.f50489j;
        if (liveGameHandler2 == null) {
            return;
        }
        liveGameHandler2.setLuaCallback(new b());
        this.f50490k.post(new Runnable() { // from class: l.xkj
            @Override // java.lang.Runnable
            public final void run() {
                this.f194790a.m74793j();
            }
        });
        this.f50489j.pushGameInfo(this.f50482c);
    }

    @MainThread
    /* JADX INFO: renamed from: m */
    public final void m74796m() {
        c cVar = this.f50484e;
        if (cVar != null) {
            cVar.mo74773c();
        }
        m74798o();
    }

    /* JADX INFO: renamed from: n */
    public final void m74797n() {
        if (this.f50488i != null) {
            this.f50488i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m74798o() {
        LiveGameHandler liveGameHandler = this.f50489j;
        if (liveGameHandler != null) {
            liveGameHandler.removeLuaGame();
        }
        m74797n();
        this.f50487h = false;
        Handler handler = this.f50490k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LiveGameHandler liveGameHandler2 = this.f50489j;
        if (liveGameHandler2 != null) {
            liveGameHandler2.unRegister();
            this.f50489j.setLuaCallback(null);
        }
    }
}
