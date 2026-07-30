package com.tencent.connect.emotion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.tencent.connect.C13802a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class QQEmotion extends BaseApi {

    /* JADX INFO: renamed from: a */
    private IUiListener f57193a;

    public QQEmotion(QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: renamed from: a */
    private boolean m82162a(Context context, ArrayList<Uri> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return false;
        }
        if (arrayList.size() > 9) {
            SLog.m84309i("QQEMOTION", "isLegality -->illegal, file count > 9, count = " + arrayList.size());
            return false;
        }
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            long jM84460a = C14396n.m84460a(context, arrayList.get(i));
            if (jM84460a > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                SLog.m84309i("QQEMOTION", "isLegality -->illegal, fileSize: " + jM84460a);
                return false;
            }
            j += jM84460a;
        }
        if (j > 3145728) {
            SLog.m84309i("QQEMOTION", "isLegality -->illegal, totalSize: " + j);
            return false;
        }
        SLog.m84309i("QQEMOTION", "isLegality -->legal, totalSize: " + j);
        return true;
    }

    public void setEmotions(Activity activity, ArrayList<Uri> arrayList, IUiListener iUiListener) {
        if (C13802a.m81984a("QQEmotion", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f57193a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f57193a = iUiListener;
        if (!C14394l.m84443b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (C14394l.m84445c(activity, "8.0.0") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置表情功能。", 1).show();
            return;
        }
        if (!m82162a(activity.getApplicationContext(), arrayList)) {
            Toast.makeText(activity.getApplicationContext(), "图片不符合要求，不支持设置表情功能。", 1).show();
            return;
        }
        String strM84469a = C14396n.m84469a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_face_collection?");
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(strM84469a)) {
            if (strM84469a.length() > 20) {
                strM84469a = strM84469a.substring(0, 20).concat("...");
            }
            sb.append(strM84469a);
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14396n.m84510j(strM84469a), 2));
        }
        String appId = this.f57183c.getAppId();
        String openId = this.f57183c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
            sb.append(appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            sb.append(openId);
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14396n.m84510j(openId), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(C14396n.m84510j(Constants.SDK_VERSION), 2));
        sb.append(Constants.SDK_VERSION);
        String strM82161a = m82161a(activity, arrayList);
        if (TextUtils.isEmpty(strM82161a)) {
            iUiListener.onError(new UiError(-6, Constants.MSG_UNKNOWN_ERROR, "picPathList is null"));
            return;
        }
        sb.append(strM82161a);
        stringBuffer.append("&set_uri_list=" + Base64.encodeToString(C14396n.m84510j(strM82161a), 2));
        stringBuffer.append("&ppsts=");
        stringBuffer.append(C14394l.m84432a(activity, sb.toString()));
        SLog.m84313v("QQEMOTION", "-->set avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.setPackage("com.tencent.mobileqq");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_EDIT_EMOTION, iUiListener);
        m82147a(activity, Constants.REQUEST_EDIT_EMOTION, intent, false);
    }

    /* JADX INFO: renamed from: a */
    private String m82161a(Activity activity, ArrayList<Uri> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<Uri> it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uriM84462a = C14396n.m84462a(activity, this.f57183c.getAppId(), C14396n.m84486b(activity, it.next()));
            if (uriM84462a == null) {
                SLog.m84307e("QQEmotion", "getFilePathListJson: grantedUri = null");
            } else {
                sb.append(uriM84462a);
                sb.append(com.meituan.robust.Constants.PACKNAME_END);
            }
        }
        String string = sb.toString();
        SLog.m84309i("QQEmotion", "-->getFilePathListJson listStr : ".concat(string));
        return string;
    }
}
