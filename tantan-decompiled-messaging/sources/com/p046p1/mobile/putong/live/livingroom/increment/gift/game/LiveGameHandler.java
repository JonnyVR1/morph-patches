package com.p046p1.mobile.putong.live.livingroom.increment.gift.game;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.momo.xeengine.IXEngine;
import com.momo.xeengine.script.ScriptBridge;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.iij;
import p149l.pk8;
import p149l.qib0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGameHandler {
    private static final String HANDLER = "LiveGameHandler";
    private static final String TAG = "LiveGameHandler";
    private final IXEngine engine;
    private InterfaceC12800b luaCallback;
    private InterfaceC12802d rhythmGameCallback;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$a */
    public interface InterfaceC12799a {
        /* JADX INFO: renamed from: b */
        void mo73599b(String str);

        void removeGame(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$b */
    public interface InterfaceC12800b extends InterfaceC12799a {
        /* JADX INFO: renamed from: a */
        void mo73600a(int i);

        String getUserInfo();

        void playerDead(String str);

        void setTouchArea(String str);

        void uploadScore(String str);

        void uploadScore(String str, ScriptBridge.Callback callback);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$c */
    public static class C12801c implements InterfaceC12800b {
        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        /* JADX INFO: renamed from: a */
        public void mo73600a(int i) {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12799a
        /* JADX INFO: renamed from: b */
        public void mo73599b(String str) {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        public String getUserInfo() {
            return null;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        public void playerDead(String str) {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12799a
        public void removeGame(String str) {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        public void setTouchArea(String str) {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        public void uploadScore(String str) {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler.InterfaceC12800b
        public void uploadScore(String str, ScriptBridge.Callback callback) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.LiveGameHandler$d */
    public interface InterfaceC12802d extends InterfaceC12799a {
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
            iij.m136421o(str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.toString();
        }
    }

    public void apiWithUrlParams(String str, ScriptBridge.Callback callback) {
        InterfaceC12800b interfaceC12800b = this.luaCallback;
        if (interfaceC12800b != null) {
            interfaceC12800b.uploadScore(str, callback);
        }
    }

    public void gameEnded(String str) {
    }

    public void gameStarted(String str) {
        InterfaceC12800b interfaceC12800b = this.luaCallback;
        if (interfaceC12800b != null) {
            interfaceC12800b.mo73599b(str);
        }
    }

    public String getClientInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appVersionName", qib0.f154730s);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, qib0.f154732t + "");
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
        return pk8.m169980M().toJson();
    }

    public void playerDead(String str) {
        InterfaceC12800b interfaceC12800b = this.luaCallback;
        if (interfaceC12800b != null) {
            interfaceC12800b.playerDead(str);
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
            iij.m136421o("game.register.fail: ".concat(str));
        } else {
            this.engine.getScriptBridge().regist(this, "LiveGameHandler");
        }
    }

    public void removeGame(String str) {
        InterfaceC12800b interfaceC12800b = this.luaCallback;
        if (interfaceC12800b != null) {
            interfaceC12800b.removeGame(str);
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

    public void setLuaCallback(InterfaceC12800b interfaceC12800b) {
        this.luaCallback = interfaceC12800b;
    }

    public void setRhythmCallback(InterfaceC12802d interfaceC12802d) {
    }

    public void touchArea(String str) {
        InterfaceC12800b interfaceC12800b = this.luaCallback;
        if (interfaceC12800b != null) {
            interfaceC12800b.setTouchArea(str);
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
            InterfaceC12800b interfaceC12800b = this.luaCallback;
            if (interfaceC12800b != null) {
                interfaceC12800b.mo73600a(iOptInt);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.toString();
        }
    }

    public void uploadGameScore(String str) {
        InterfaceC12800b interfaceC12800b = this.luaCallback;
        if (interfaceC12800b != null) {
            interfaceC12800b.uploadScore(str);
        }
    }

    public String userInfo(String str) {
        InterfaceC12800b interfaceC12800b = this.luaCallback;
        if (interfaceC12800b != null) {
            return interfaceC12800b.getUserInfo();
        }
        return null;
    }
}
