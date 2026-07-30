package com.p000p1.mobile.putong.live.livingroom.increment.gift.game;

import com.momo.xeengine.IXEngine;
import com.momo.xeengine.script.ScriptBridge;
import com.tantanapp.common.utils.CrashHelper;
import l.pk8;
import l.qib0;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.iij;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGameHandler {
    private static final String HANDLER = "LiveGameHandler";
    private static final String TAG = "LiveGameHandler";
    private final IXEngine engine;
    private InterfaceC0389b luaCallback;
    private InterfaceC0391d rhythmGameCallback;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$a */
    public interface InterfaceC0388a {
        /* JADX INFO: renamed from: b */
        void mo7145b(String str);

        void removeGame(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$b */
    public interface InterfaceC0389b extends InterfaceC0388a {
        /* JADX INFO: renamed from: a */
        void mo7146a(int i);

        String getUserInfo();

        void playerDead(String str);

        void setTouchArea(String str);

        void uploadScore(String str);

        void uploadScore(String str, ScriptBridge.Callback callback);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$c */
    public static class C0390c implements InterfaceC0389b {
        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        /* JADX INFO: renamed from: a */
        public void mo7146a(int i) {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0388a
        /* JADX INFO: renamed from: b */
        public void mo7145b(String str) {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        public String getUserInfo() {
            return null;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        public void playerDead(String str) {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0388a
        public void removeGame(String str) {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        public void setTouchArea(String str) {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        public void uploadScore(String str) {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC0389b
        public void uploadScore(String str, ScriptBridge.Callback callback) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$d */
    public interface InterfaceC0391d extends InterfaceC0388a {
    }

    private LiveGameHandler(IXEngine iXEngine) {
        this.engine = iXEngine;
    }

    public static LiveGameHandler getInstance(IXEngine iXEngine) {
        return new LiveGameHandler(iXEngine);
    }

    public void addTrace(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optInt("type");
            jSONObject.optString("sType");
            jSONObject.optString("msg");
            iij.m15193o(str);
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.toString();
        }
    }

    public void apiWithUrlParams(String str, ScriptBridge.Callback callback) {
        InterfaceC0389b interfaceC0389b = this.luaCallback;
        if (interfaceC0389b != null) {
            interfaceC0389b.uploadScore(str, callback);
        }
    }

    public void gameEnded(String str) {
    }

    public void gameStarted(String str) {
        InterfaceC0389b interfaceC0389b = this.luaCallback;
        if (interfaceC0389b != null) {
            interfaceC0389b.mo7145b(str);
        }
    }

    public String getClientInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appVersionName", qib0.s);
            jSONObject.put("appVersion", qib0.t + "");
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public void getGameScore() {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "getGameScore", "");
    }

    public String getSystemInfo() {
        return pk8.M().toJson();
    }

    public void playerDead(String str) {
        InterfaceC0389b interfaceC0389b = this.luaCallback;
        if (interfaceC0389b != null) {
            interfaceC0389b.playerDead(str);
        }
    }

    public void playerOff(String str) {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "playerOff", str);
    }

    public void pushGameInfo(String str) {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "gameInfo", str);
    }

    public void pushPBGameInfo(String str, String str2) {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "pbGameInfo", str2);
    }

    public void pushRoomInfo(String str) {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "roomInfo", str);
    }

    public void receivedMessage(String str) {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "receivedMessage", str);
    }

    public void register() {
        String str;
        IXEngine iXEngine = this.engine;
        if (iXEngine == null) {
            str = "engine null";
        } else {
            str = iXEngine.getScriptBridge() == null ? "engine.getScriptBridge null" : "";
        }
        IXEngine iXEngine2 = this.engine;
        if (iXEngine2 == null || iXEngine2.getScriptBridge() == null) {
            iij.m15193o("game.register.fail: ".concat(str));
        } else {
            this.engine.getScriptBridge().regist(this, "LiveGameHandler");
        }
    }

    public void removeGame(String str) {
        InterfaceC0389b interfaceC0389b = this.luaCallback;
        if (interfaceC0389b != null) {
            interfaceC0389b.removeGame(str);
        }
    }

    public void removeLuaGame() {
        ScriptBridge scriptBridge;
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || (scriptBridge = iXEngine.getScriptBridge()) == null) {
            return;
        }
        scriptBridge.call("LiveGameHandler", "removeLuaGame", "");
    }

    public void rhythmBuy(String str) {
    }

    public void sendDataToLua(String str) {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "sendDataToLua", str);
    }

    public void sendGameStateToLua(String str) {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call("LiveGameHandler", "sendGameStateToLua", str);
    }

    public void setLuaCallback(InterfaceC0389b interfaceC0389b) {
        this.luaCallback = interfaceC0389b;
    }

    public void setRhythmCallback(InterfaceC0391d interfaceC0391d) {
    }

    public void touchArea(String str) {
        InterfaceC0389b interfaceC0389b = this.luaCallback;
        if (interfaceC0389b != null) {
            interfaceC0389b.setTouchArea(str);
        }
    }

    public void unRegister() {
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || iXEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().unregist("LiveGameHandler");
    }

    public void uploadCurrentScore(String str) {
        try {
            int iOptInt = new JSONObject(str).optInt("currentScore");
            InterfaceC0389b interfaceC0389b = this.luaCallback;
            if (interfaceC0389b != null) {
                interfaceC0389b.mo7146a(iOptInt);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.toString();
        }
    }

    public void uploadGameScore(String str) {
        InterfaceC0389b interfaceC0389b = this.luaCallback;
        if (interfaceC0389b != null) {
            interfaceC0389b.uploadScore(str);
        }
    }

    public String userInfo(String str) {
        InterfaceC0389b interfaceC0389b = this.luaCallback;
        if (interfaceC0389b != null) {
            return interfaceC0389b.getUserInfo();
        }
        return null;
    }
}
