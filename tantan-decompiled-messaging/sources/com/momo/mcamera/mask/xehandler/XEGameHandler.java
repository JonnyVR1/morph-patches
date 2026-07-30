package com.momo.mcamera.mask.xehandler;

import com.momo.xeengine.XE3DEngine;
import com.momo.xeengine.script.ScriptBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class XEGameHandler {
    private static final String HANDLER = "LiveGameHandler";
    private XE3DEngine engine;
    private LuaGameCallback luaCallback;
    private RhythmGameCallback rhythmGameCallback;

    public interface BaseGameCallback {
        void removeGame(String str);
    }

    public interface LuaGameCallback extends BaseGameCallback {
        String getUserInfo();

        void onLuaEntrance();

        void playerDead(String str);

        void setTouchArea(String str);

        void uploadScore(String str);

        void uploadScore(String str, ScriptBridge.Callback callback);
    }

    public static class LuaGameCallbackAdapter implements LuaGameCallback {
        @Override // com.momo.mcamera.mask.xehandler.XEGameHandler.LuaGameCallback
        public String getUserInfo() {
            return null;
        }

        @Override // com.momo.mcamera.mask.xehandler.XEGameHandler.LuaGameCallback
        public void onLuaEntrance() {
        }

        @Override // com.momo.mcamera.mask.xehandler.XEGameHandler.LuaGameCallback
        public void playerDead(String str) {
        }

        @Override // com.momo.mcamera.mask.xehandler.XEGameHandler.BaseGameCallback
        public void removeGame(String str) {
        }

        @Override // com.momo.mcamera.mask.xehandler.XEGameHandler.LuaGameCallback
        public void setTouchArea(String str) {
        }

        @Override // com.momo.mcamera.mask.xehandler.XEGameHandler.LuaGameCallback
        public void uploadScore(String str) {
        }

        @Override // com.momo.mcamera.mask.xehandler.XEGameHandler.LuaGameCallback
        public void uploadScore(String str, ScriptBridge.Callback callback) {
        }
    }

    public interface RhythmGameCallback extends BaseGameCallback {
        void rhythmBuy(String str);
    }

    public XEGameHandler(XE3DEngine xE3DEngine) {
        this.engine = xE3DEngine;
    }

    public void addTrace(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optInt("type");
            jSONObject.optString("sType");
            jSONObject.optString("msg");
        } catch (JSONException unused) {
        }
    }

    public void apiWithUrlParams(String str, ScriptBridge.Callback callback) {
        LuaGameCallback luaGameCallback = this.luaCallback;
        if (luaGameCallback != null) {
            luaGameCallback.uploadScore(str, callback);
        }
    }

    public void gameDecodeError(String str) {
    }

    public String getClientInfo() {
        return new JSONObject().toString();
    }

    public void getGameScore() {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "getGameScore", "");
    }

    public String getSystemInfo() {
        return new JSONObject().toString();
    }

    public void gotoAction(String str) {
    }

    public void imgWithUrlParams(String str, ScriptBridge.Callback callback) {
    }

    public void onLuaEntrance(String str) {
        LuaGameCallback luaGameCallback = this.luaCallback;
        if (luaGameCallback != null) {
            luaGameCallback.onLuaEntrance();
        }
    }

    public void playerDead(String str) {
        LuaGameCallback luaGameCallback = this.luaCallback;
        if (luaGameCallback != null) {
            luaGameCallback.playerDead(str);
        }
    }

    public void playerOff(String str) {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "playerOff", str);
    }

    public void pushGameInfo(String str) {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "gameInfo", str);
    }

    public void pushPBGameInfo(String str, String str2) {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "pbGameInfo", str2);
    }

    public void pushRoomInfo(String str) {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "roomInfo", str);
    }

    public void receivedMessage(String str) {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "receivedMessage", str);
    }

    public void register() {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine != null) {
            xE3DEngine.getScriptBridge();
        }
        XE3DEngine xE3DEngine2 = this.engine;
        if (xE3DEngine2 == null || xE3DEngine2.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().regist(this, HANDLER);
    }

    public void removeGame(String str) {
        LuaGameCallback luaGameCallback = this.luaCallback;
        if (luaGameCallback != null) {
            luaGameCallback.removeGame(str);
        }
        RhythmGameCallback rhythmGameCallback = this.rhythmGameCallback;
        if (rhythmGameCallback != null) {
            rhythmGameCallback.removeGame(str);
        }
    }

    public void removeLuaGame() {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "removeLuaGame", "");
    }

    public void rhythmBuy(String str) {
        RhythmGameCallback rhythmGameCallback = this.rhythmGameCallback;
        if (rhythmGameCallback != null) {
            rhythmGameCallback.rhythmBuy(str);
        }
    }

    public void sendDataToLua(String str) {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().call(HANDLER, "sendDataToLua", str);
    }

    public void sendMessage(String str) {
    }

    public void setLuaCallback(LuaGameCallback luaGameCallback) {
        this.luaCallback = luaGameCallback;
    }

    public void setRhythmCallback(RhythmGameCallback rhythmGameCallback) {
        this.rhythmGameCallback = rhythmGameCallback;
    }

    public void touchArea(String str) {
        LuaGameCallback luaGameCallback = this.luaCallback;
        if (luaGameCallback != null) {
            luaGameCallback.setTouchArea(str);
        }
    }

    public void unRegister() {
        XE3DEngine xE3DEngine = this.engine;
        if (xE3DEngine == null || xE3DEngine.getScriptBridge() == null) {
            return;
        }
        this.engine.getScriptBridge().unregist(HANDLER);
    }

    public void uploadGameData(String str) {
    }

    public void uploadGameScore(String str) {
        LuaGameCallback luaGameCallback = this.luaCallback;
        if (luaGameCallback != null) {
            luaGameCallback.uploadScore(str);
        }
    }

    public String userInfo(String str) {
        LuaGameCallback luaGameCallback = this.luaCallback;
        if (luaGameCallback != null) {
            return luaGameCallback.getUserInfo();
        }
        return null;
    }
}
