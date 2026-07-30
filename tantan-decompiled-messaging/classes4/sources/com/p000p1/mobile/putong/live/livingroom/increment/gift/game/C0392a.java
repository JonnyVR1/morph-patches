package com.p000p1.mobile.putong.live.livingroom.increment.gift.game;

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
import l.rhi;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.iij;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0392a {

    /* JADX INFO: renamed from: a */
    public final String f5674a;

    /* JADX INFO: renamed from: b */
    public final String f5675b;

    /* JADX INFO: renamed from: c */
    public final String f5676c;

    /* JADX INFO: renamed from: d */
    public String f5677d;

    /* JADX INFO: renamed from: e */
    public final c f5678e;

    /* JADX INFO: renamed from: f */
    public boolean f5679f;

    /* JADX INFO: renamed from: g */
    public boolean f5680g;

    /* JADX INFO: renamed from: i */
    public XEGameView f5682i;

    /* JADX INFO: renamed from: j */
    public LiveGameHandler f5683j;

    /* JADX INFO: renamed from: h */
    public boolean f5681h = false;

    /* JADX INFO: renamed from: k */
    public final Handler f5684k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$a */
    public class a implements IXGameView.Callback {
        public a() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m7163b(String str) {
            if (C0392a.this.f5678e != null) {
                C0392a.this.f5678e.mo7135b(str);
            }
        }

        public void onEngineDynamicLinkLibraryDownloadProcess(int i, double d) {
        }

        public void onRenderSizeChanged(int i, int i2) {
        }

        public void onRenderViewCreate(View view) {
        }

        public void onStart(IXEngine iXEngine) {
            C0392a.this.m7158l(iXEngine);
        }

        public void onStartFailed(final String str) {
            C0392a.this.f5684k.post(new Runnable() { // from class: l.eij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9809a.m7163b(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$b */
    public class b extends LiveGameHandler.C0390c {
        public b() {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C0390c, com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0388a
        /* JADX INFO: renamed from: b */
        public void mo7145b(String str) {
            C0392a.this.f5684k.post(new Runnable() { // from class: l.gij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11456a.m7167f();
                }
            });
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m7167f() {
            if (C0392a.this.f5678e != null) {
                C0392a.this.f5678e.mo7138e();
            }
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m7168g() {
            C0392a.this.m7159m();
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C0390c, com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        public String getUserInfo() {
            return C0392a.this.f5674a;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m7169h(String str, ScriptBridge.Callback callback) {
            if (C0392a.this.f5678e != null) {
                C0392a.this.f5678e.mo7134a(str, callback);
            }
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C0390c, com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0388a
        public void removeGame(String str) {
            iij.m15181c("removeGame gameId = " + str);
            C0392a.this.f5684k.removeCallbacksAndMessages(null);
            C0392a.this.f5684k.post(new Runnable() { // from class: l.hij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12052a.m7168g();
                }
            });
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.C0390c, com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        public void uploadScore(final String str, final ScriptBridge.Callback callback) {
            C0392a.this.f5684k.post(new Runnable() { // from class: l.fij
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10403a.m7169h(str, callback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo7134a(String str, ScriptBridge.Callback callback);

        /* JADX INFO: renamed from: b */
        void mo7135b(String str);

        /* JADX INFO: renamed from: c */
        void mo7136c();

        /* JADX INFO: renamed from: d */
        void mo7137d(View view);

        /* JADX INFO: renamed from: e */
        void mo7138e();
    }

    public C0392a(@NotNull c cVar, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2) {
        this.f5679f = false;
        this.f5680g = false;
        this.f5674a = str;
        this.f5675b = str2;
        this.f5676c = str3;
        this.f5677d = str4;
        this.f5679f = z;
        this.f5680g = z2;
        this.f5678e = cVar;
    }

    /* JADX INFO: renamed from: g */
    public void m7153g() {
        this.f5681h = false;
        Handler handler = this.f5684k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LiveGameHandler liveGameHandler = this.f5683j;
        if (liveGameHandler != null) {
            liveGameHandler.removeLuaGame();
            this.f5683j.unRegister();
            this.f5683j = null;
        }
        m7160n();
    }

    /* JADX INFO: renamed from: h */
    public final String m7154h() {
        File file = new File(this.f5677d + "/params.txt");
        if (file.exists()) {
            try {
                String strA = rhi.A(file);
                if (!TextUtils.isEmpty(strA)) {
                    return ((JSONObject) new JSONObject(strA).getJSONArray("itemList").get(0)).getString("folder");
                }
            } catch (IOException | JSONException e) {
                CrashHelper.c(e);
            }
        }
        iij.m15193o("can not get game fold name, use default. gameRootPath is " + this.f5677d);
        return "game";
    }

    /* JADX INFO: renamed from: i */
    public boolean m7155i() {
        return this.f5681h;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7156j() {
        this.f5681h = true;
    }

    /* JADX INFO: renamed from: k */
    public void m7157k(@NotNull Context context) {
        if (this.f5678e == null) {
            iij.m15193o("gameEffectListener should not be null");
            return;
        }
        XEGameView xEGameView = new XEGameView(context);
        this.f5682i = xEGameView;
        if (this.f5679f) {
            xEGameView.setTouchEnable(true);
        } else {
            xEGameView.setTouchEnable(false);
        }
        this.f5678e.mo7137d(this.f5682i);
        boolean z = this.f5680g;
        XEGameView xEGameView2 = this.f5682i;
        if (z) {
            xEGameView2.setPreferredFramesPerSecond(15);
        } else {
            xEGameView2.setPreferredFramesPerSecond(30);
        }
        this.f5682i.setCallback(new a());
        this.f5682i.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m7158l(IXEngine iXEngine) {
        String str = this.f5677d + "/" + m7154h();
        this.f5677d = str;
        iXEngine.addLibraryPath(str);
        iXEngine.getLogger().setLogEnable(true);
        LiveGameHandler liveGameHandler = LiveGameHandler.getInstance(iXEngine);
        this.f5683j = liveGameHandler;
        liveGameHandler.register();
        iXEngine.getScriptEngine().startGameScriptFile("app");
        this.f5683j.pushRoomInfo(this.f5675b);
        LiveGameHandler liveGameHandler2 = this.f5683j;
        if (liveGameHandler2 == null) {
            return;
        }
        liveGameHandler2.setLuaCallback(new b());
        this.f5684k.post(new Runnable() { // from class: l.dij
            @Override // java.lang.Runnable
            public final void run() {
                this.f9290a.m7156j();
            }
        });
        this.f5683j.pushGameInfo(this.f5676c);
    }

    @MainThread
    /* JADX INFO: renamed from: m */
    public final void m7159m() {
        c cVar = this.f5678e;
        if (cVar != null) {
            cVar.mo7136c();
        }
        m7161o();
    }

    /* JADX INFO: renamed from: n */
    public final void m7160n() {
        if (this.f5682i != null) {
            this.f5682i = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m7161o() {
        LiveGameHandler liveGameHandler = this.f5683j;
        if (liveGameHandler != null) {
            liveGameHandler.removeLuaGame();
        }
        m7160n();
        this.f5681h = false;
        Handler handler = this.f5684k;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LiveGameHandler liveGameHandler2 = this.f5683j;
        if (liveGameHandler2 != null) {
            liveGameHandler2.unRegister();
            this.f5683j.setLuaCallback(null);
        }
    }
}
