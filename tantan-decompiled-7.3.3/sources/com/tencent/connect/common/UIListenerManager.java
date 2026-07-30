package com.tencent.connect.common;

import android.content.Intent;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class UIListenerManager {

    /* JADX INFO: renamed from: a */
    private static UIListenerManager f58038a;

    /* JADX INFO: renamed from: b */
    private Map<String, ApiTask> f58039b;

    public class ApiTask {
        public IUiListener mListener;
        public int mRequestCode;

        public ApiTask(int i, IUiListener iUiListener) {
            this.mRequestCode = i;
            this.mListener = iUiListener;
        }
    }

    private UIListenerManager() {
        Map<String, ApiTask> mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        this.f58039b = mapSynchronizedMap;
        if (mapSynchronizedMap == null) {
            this.f58039b = Collections.synchronizedMap(new HashMap());
        }
    }

    /* JADX INFO: renamed from: a */
    private IUiListener m83342a(int i, IUiListener iUiListener) {
        if (i == 11101) {
            SLog.m85490e("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
            return iUiListener;
        }
        if (i == 11105) {
            SLog.m85490e("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
            return iUiListener;
        }
        if (i == 11106) {
            SLog.m85490e("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        return iUiListener;
    }

    public static UIListenerManager getInstance() {
        if (f58038a == null) {
            f58038a = new UIListenerManager();
        }
        return f58038a;
    }

    public IUiListener getListnerWithAction(String str) {
        ApiTask apiTask;
        if (str == null) {
            SLog.m85490e("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f58039b) {
            apiTask = this.f58039b.get(str);
            this.f58039b.remove(str);
        }
        if (apiTask == null) {
            return null;
        }
        return apiTask.mListener;
    }

    public IUiListener getListnerWithRequestCode(int i) {
        String strM85613a = C14557l.m85613a(i);
        if (strM85613a != null) {
            return getListnerWithAction(strM85613a);
        }
        SLog.m85490e("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i);
        return null;
    }

    public void handleDataToListener(Intent intent, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.UIListenerManager", "handleDataToListener");
        if (intent == null) {
            iUiListener.onCancel();
            return;
        }
        String stringExtra = intent.getStringExtra(Constants.KEY_ACTION);
        if ("action_login".equals(stringExtra)) {
            int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            if (intExtra != 0) {
                SLog.m85490e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
                iUiListener.onError(new UiError(intExtra, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
                return;
            }
            String stringExtra2 = intent.getStringExtra(Constants.KEY_RESPONSE);
            if (stringExtra2 == null) {
                SLog.m85488d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                iUiListener.onComplete(new JSONObject());
                return;
            }
            try {
                iUiListener.onComplete(C14559n.m85678d(stringExtra2));
                return;
            } catch (JSONException e) {
                iUiListener.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra2));
                SLog.m85491e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                return;
            }
        }
        if ("action_share".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra(LovePlanetStage.result);
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                iUiListener.onCancel();
                return;
            }
            if ("error".equals(stringExtra3)) {
                iUiListener.onError(new UiError(-6, "unknown error", stringExtra4 + ""));
                return;
            }
            if ("complete".equals(stringExtra3)) {
                try {
                    iUiListener.onComplete(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    iUiListener.onError(new UiError(-4, "json error", stringExtra4 + ""));
                }
            }
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i + " res=" + i2);
        IUiListener listnerWithRequestCode = getListnerWithRequestCode(i);
        if (listnerWithRequestCode == null) {
            if (iUiListener == null) {
                SLog.m85490e("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
                return false;
            }
            listnerWithRequestCode = m83342a(i, iUiListener);
        }
        if (i2 != -1) {
            listnerWithRequestCode.onCancel();
            return true;
        }
        if (intent == null) {
            listnerWithRequestCode.onError(new UiError(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return true;
        }
        String stringExtra = intent.getStringExtra(Constants.KEY_ACTION);
        if ("action_login".equals(stringExtra)) {
            int intExtra = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            if (intExtra == 0) {
                String stringExtra2 = intent.getStringExtra(Constants.KEY_RESPONSE);
                if (stringExtra2 != null) {
                    try {
                        listnerWithRequestCode.onComplete(C14559n.m85678d(stringExtra2));
                    } catch (JSONException e) {
                        listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra2));
                        SLog.m85491e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                    }
                } else {
                    SLog.m85488d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                    listnerWithRequestCode.onComplete(new JSONObject());
                }
            } else {
                SLog.m85490e("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
                listnerWithRequestCode.onError(new UiError(intExtra, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
            }
            return true;
        }
        if ("action_share".equals(stringExtra) || "action_request_avatar".equals(stringExtra) || "action_request_dynamic_avatar".equals(stringExtra) || "action_request_set_emotion".equals(stringExtra) || "guildOpen".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra(LovePlanetStage.result);
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                listnerWithRequestCode.onCancel();
                return true;
            }
            if ("error".equals(stringExtra3)) {
                listnerWithRequestCode.onError(new UiError(-6, "unknown error", stringExtra4 + ""));
                return true;
            }
            if (!"complete".equals(stringExtra3)) {
                return true;
            }
            try {
                listnerWithRequestCode.onComplete(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                return true;
            } catch (JSONException e2) {
                SLog.m85491e("openSDK_LOG.UIListenerManager", "JSONException", e2);
                listnerWithRequestCode.onError(new UiError(-4, "json error", stringExtra4 + ""));
                return true;
            }
        }
        if (!"action_common_channel".equals(stringExtra)) {
            int intExtra2 = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            if (intExtra2 != 0) {
                listnerWithRequestCode.onError(new UiError(intExtra2, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
                return true;
            }
            String stringExtra5 = intent.getStringExtra(Constants.KEY_RESPONSE);
            if (stringExtra5 == null) {
                listnerWithRequestCode.onComplete(new JSONObject());
                return true;
            }
            try {
                listnerWithRequestCode.onComplete(C14559n.m85678d(stringExtra5));
                return true;
            } catch (JSONException unused) {
                listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra5));
                return true;
            }
        }
        int intExtra3 = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
        if (intExtra3 != 0) {
            listnerWithRequestCode.onError(new UiError(intExtra3, intent.getStringExtra(Constants.KEY_ERROR_MSG), intent.getStringExtra(Constants.KEY_ERROR_DETAIL)));
            return true;
        }
        String stringExtra6 = intent.getStringExtra("response");
        if (stringExtra6 == null) {
            listnerWithRequestCode.onComplete(new JSONObject());
            return true;
        }
        try {
            String stringExtra7 = intent.getStringExtra("message");
            JSONObject jSONObjectM85678d = C14559n.m85678d(stringExtra6);
            jSONObjectM85678d.put("message", stringExtra7);
            listnerWithRequestCode.onComplete(jSONObjectM85678d);
            return true;
        } catch (JSONException unused2) {
            listnerWithRequestCode.onError(new UiError(-4, Constants.MSG_JSON_ERROR, stringExtra6));
            return true;
        }
    }

    public Object setListenerWithRequestcode(int i, IUiListener iUiListener) {
        ApiTask apiTaskPut;
        String strM85613a = C14557l.m85613a(i);
        if (strM85613a == null) {
            SLog.m85490e("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=" + i);
            return null;
        }
        synchronized (this.f58039b) {
            apiTaskPut = this.f58039b.put(strM85613a, new ApiTask(i, iUiListener));
        }
        if (apiTaskPut == null) {
            return null;
        }
        return apiTaskPut.mListener;
    }

    public Object setListnerWithAction(String str, IUiListener iUiListener) {
        ApiTask apiTaskPut;
        int iM85623b = C14557l.m85623b(str);
        if (iM85623b == -1) {
            SLog.m85490e("openSDK_LOG.UIListenerManager", "setListnerWithAction fail, action = " + str);
            return null;
        }
        synchronized (this.f58039b) {
            apiTaskPut = this.f58039b.put(str, new ApiTask(iM85623b, iUiListener));
        }
        if (apiTaskPut == null) {
            return null;
        }
        return apiTaskPut.mListener;
    }
}
