package com.tencent.connect.emotion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.tencent.connect.C13965a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class QQEmotion extends BaseApi {

    /* JADX INFO: renamed from: a */
    private IUiListener f58041a;

    public QQEmotion(QQToken qQToken) {
        super(qQToken);
    }

    /* JADX INFO: renamed from: a */
    private boolean m83345a(Context context, ArrayList<Uri> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return false;
        }
        if (arrayList.size() > 9) {
            SLog.m85492i("QQEMOTION", "isLegality -->illegal, file count > 9, count = " + arrayList.size());
            return false;
        }
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            long jM85643a = C14559n.m85643a(context, arrayList.get(i));
            if (jM85643a > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                SLog.m85492i("QQEMOTION", "isLegality -->illegal, fileSize: " + jM85643a);
                return false;
            }
            j += jM85643a;
        }
        if (j > 3145728) {
            SLog.m85492i("QQEMOTION", "isLegality -->illegal, totalSize: " + j);
            return false;
        }
        SLog.m85492i("QQEMOTION", "isLegality -->legal, totalSize: " + j);
        return true;
    }

    public void setEmotions(Activity activity, ArrayList<Uri> arrayList, IUiListener iUiListener) {
        if (C13965a.m83167a("QQEmotion", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f58041a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f58041a = iUiListener;
        if (!C14557l.m85626b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (C14557l.m85628c(activity, "8.0.0") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置表情功能。", 1).show();
            return;
        }
        if (!m83345a(activity.getApplicationContext(), arrayList)) {
            Toast.makeText(activity.getApplicationContext(), "图片不符合要求，不支持设置表情功能。", 1).show();
            return;
        }
        String strM85652a = C14559n.m85652a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_face_collection?");
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(strM85652a)) {
            if (strM85652a.length() > 20) {
                strM85652a = strM85652a.substring(0, 20).concat("...");
            }
            sb.append(strM85652a);
            stringBuffer.append("&app_name=" + Base64.encodeToString(C14559n.m85693j(strM85652a), 2));
        }
        String appId = this.f58031c.getAppId();
        String openId = this.f58031c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
            sb.append(appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            sb.append(openId);
            stringBuffer.append("&open_id=" + Base64.encodeToString(C14559n.m85693j(openId), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(C14559n.m85693j(Constants.SDK_VERSION), 2));
        sb.append(Constants.SDK_VERSION);
        String strM83344a = m83344a(activity, arrayList);
        if (TextUtils.isEmpty(strM83344a)) {
            iUiListener.onError(new UiError(-6, Constants.MSG_UNKNOWN_ERROR, "picPathList is null"));
            return;
        }
        sb.append(strM83344a);
        stringBuffer.append("&set_uri_list=" + Base64.encodeToString(C14559n.m85693j(strM83344a), 2));
        stringBuffer.append("&ppsts=");
        stringBuffer.append(C14557l.m85615a(activity, sb.toString()));
        SLog.m85496v("QQEMOTION", "-->set avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.setPackage("com.tencent.mobileqq");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_EDIT_EMOTION, iUiListener);
        m83330a(activity, Constants.REQUEST_EDIT_EMOTION, intent, false);
    }

    /* JADX INFO: renamed from: a */
    private String m83344a(Activity activity, ArrayList<Uri> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<Uri> it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uriM85645a = C14559n.m85645a(activity, this.f58031c.getAppId(), C14559n.m85669b(activity, it.next()));
            if (uriM85645a == null) {
                SLog.m85490e("QQEmotion", "getFilePathListJson: grantedUri = null");
            } else {
                sb.append(uriM85645a);
                sb.append(com.meituan.robust.Constants.PACKNAME_END);
            }
        }
        String string = sb.toString();
        SLog.m85492i("QQEmotion", "-->getFilePathListJson listStr : ".concat(string));
        return string;
    }
}
