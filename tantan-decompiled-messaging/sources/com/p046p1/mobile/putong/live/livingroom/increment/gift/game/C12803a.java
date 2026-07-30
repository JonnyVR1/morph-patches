package com.p046p1.mobile.putong.live.livingroom.increment.gift.game;

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
import p149l.iij;
import p149l.rhi;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12803a {

    /* JADX INFO: renamed from: a */
    public final String f49632a;

    /* JADX INFO: renamed from: b */
    public final String f49633b;

    /* JADX INFO: renamed from: c */
    public final String f49634c;

    /* JADX INFO: renamed from: d */
    public String f49635d;

    /* JADX INFO: renamed from: e */
    public final c f49636e;

    /* JADX INFO: renamed from: f */
    public boolean f49637f;

    /* JADX INFO: renamed from: g */
    public boolean f49638g;

    /* JADX INFO: renamed from: i */
    public XEGameView f49640i;

    /* JADX INFO: renamed from: j */
    public LiveGameHandler f49641j;

    /* JADX INFO: renamed from: h */
    public boolean f49639h = false;

    /* JADX INFO: renamed from: k */
    public final Handler f49642k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$a */
    public class a implements IXGameView.Callback {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m73617b(String str) {
            if (C12803a.this.f49636e != null) {
                C12803a.this.f49636e.mo73589b(str);
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
            C12803a.this.m73612l(iXEngine);
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onStartFailed(final String str) {
            C12803a.this.f49642k.post(new Runnable() { // from class: l.eij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91607a.m73617b(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$b */
    public class b extends LiveGameHandler.C12801c {
        public b() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12801c, com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12799a
        /* JADX INFO: renamed from: b */
        public void mo73599b(String str) {
            C12803a.this.f49642k.post(new Runnable() { // from class: l.gij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102904a.m73621f();
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m73621f() {
            if (C12803a.this.f49636e != null) {
                C12803a.this.f49636e.mo73592e();
            }
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m73622g() {
            C12803a.this.m73613m();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12801c, com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        public String getUserInfo() {
            return C12803a.this.f49632a;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m73623h(String str, ScriptBridge.Callback callback) {
            if (C12803a.this.f49636e != null) {
                C12803a.this.f49636e.mo73588a(str, callback);
            }
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12801c, com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12799a
        public void removeGame(String str) {
            iij.m136409c("removeGame gameId = " + str);
            C12803a.this.f49642k.removeCallbacksAndMessages(null);
            C12803a.this.f49642k.post(new Runnable() { // from class: l.hij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f107932a.m73622g();
                }
            });
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C12801c, com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        public void uploadScore(final String str, final ScriptBridge.Callback callback) {
            C12803a.this.f49642k.post(new Runnable() { // from class: l.fij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97680a.m73623h(str, callback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo73588a(String str, ScriptBridge.Callback callback);

        /* JADX INFO: renamed from: b */
        void mo73589b(String str);

        /* JADX INFO: renamed from: c */
        void mo73590c();

        /* JADX INFO: renamed from: d */
        void mo73591d(View view);

        /* JADX INFO: renamed from: e */
        void mo73592e();
    }

    public C12803a(@NotNull c cVar, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        this.f49637f = false;
        this.f49638g = false;
        this.f49632a = str;
        this.f49633b = str2;
        this.f49634c = str3;
        this.f49635d = str4;
        this.f49637f = z;
        this.f49638g = z2;
        this.f49636e = cVar;
    }

    /* JADX INFO: renamed from: g */
    public void m73607g() {
        this.f49639h = false;
        Handler handler = this.f49642k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LiveGameHandler liveGameHandler = this.f49641j;
        if (liveGameHandler != null) {
            liveGameHandler.removeLuaGame();
            this.f49641j.unRegister();
            this.f49641j = null;
        }
        m73614n();
    }

    /* JADX INFO: renamed from: h */
    public final String m73608h() {
        File file = new File(this.f49635d + "/params.txt");
        if (file.exists()) {
            try {
                String strM179354A = rhi.m179354A(file);
                if (!TextUtils.isEmpty(strM179354A)) {
                    return ((JSONObject) new JSONObject(strM179354A).getJSONArray("itemList").get(0)).getString("folder");
                }
            } catch (IOException | JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        iij.m136421o("can not get game fold name, use default. gameRootPath is " + this.f49635d);
        return "game";
    }

    /* JADX INFO: renamed from: i */
    public boolean m73609i() {
        return this.f49639h;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73610j() {
        this.f49639h = true;
    }

    /* JADX INFO: renamed from: k */
    public void m73611k(@NotNull Context context) {
        if (this.f49636e == null) {
            iij.m136421o("gameEffectListener should not be null");
            return;
        }
        XEGameView xEGameView = new XEGameView(context);
        this.f49640i = xEGameView;
        if (this.f49637f) {
            xEGameView.setTouchEnable(true);
        } else {
            xEGameView.setTouchEnable(false);
        }
        this.f49636e.mo73591d(this.f49640i);
        boolean z = this.f49638g;
        XEGameView xEGameView2 = this.f49640i;
        if (z) {
            xEGameView2.setPreferredFramesPerSecond(15);
        } else {
            xEGameView2.setPreferredFramesPerSecond(30);
        }
        this.f49640i.setCallback((IXGameView.Callback) new a());
        this.f49640i.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m73612l(IXEngine iXEngine) {
        String str = this.f49635d + "/" + m73608h();
        this.f49635d = str;
        iXEngine.addLibraryPath(str);
        iXEngine.getLogger().setLogEnable(true);
        LiveGameHandler liveGameHandler = LiveGameHandler.getInstance(iXEngine);
        this.f49641j = liveGameHandler;
        liveGameHandler.register();
        iXEngine.getScriptEngine().startGameScriptFile("app");
        this.f49641j.pushRoomInfo(this.f49633b);
        LiveGameHandler liveGameHandler2 = this.f49641j;
        if (liveGameHandler2 == null) {
            return;
        }
        liveGameHandler2.setLuaCallback(new b());
        this.f49642k.post(new Runnable() { // from class: l.dij
            @Override // java.lang.Runnable
            public final void run() {
                this.f86391a.m73610j();
            }
        });
        this.f49641j.pushGameInfo(this.f49634c);
    }

    @MainThread
    /* JADX INFO: renamed from: m */
    public final void m73613m() {
        c cVar = this.f49636e;
        if (cVar != null) {
            cVar.mo73590c();
        }
        m73615o();
    }

    /* JADX INFO: renamed from: n */
    public final void m73614n() {
        if (this.f49640i != null) {
            this.f49640i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m73615o() {
        LiveGameHandler liveGameHandler = this.f49641j;
        if (liveGameHandler != null) {
            liveGameHandler.removeLuaGame();
        }
        m73614n();
        this.f49639h = false;
        Handler handler = this.f49642k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LiveGameHandler liveGameHandler2 = this.f49641j;
        if (liveGameHandler2 != null) {
            liveGameHandler2.unRegister();
            this.f49641j.setLuaCallback(null);
        }
    }
}
