package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class k7f0 extends wqp0 {
    private static int FILE_CHOOSER_RESULT_CODE = 34;
    private WeakReference<Act> act;
    private boolean adWebViewSet = false;
    private Uri cameraFileUri;
    private String selectFileType;
    private ValueCallback<Uri[]> uploadCallBack;

    public k7f0(Act act) {
        this.act = new WeakReference<>(act);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == FILE_CHOOSER_RESULT_CODE) {
            Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            if (!NullChecker.m82486a(data)) {
                data = this.cameraFileUri;
            }
            Uri[] uriArr = {data};
            ValueCallback<Uri[]> valueCallback = this.uploadCallBack;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                this.uploadCallBack = null;
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (this.adWebViewSet) {
            callback.invoke(str, true, false);
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // p153l.wqp0
    public boolean onShowFileChooserX(WebViewX webViewX, v0l0<Uri[]> v0l0Var, lii liiVar) {
        File fileM120381O;
        Intent intent;
        Act act = this.act.get();
        if (!NullChecker.m82486a(act)) {
            return super.onShowFileChooserX(webViewX, v0l0Var, liiVar);
        }
        this.uploadCallBack = v0l0Var.f181884a;
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.addCategory("android.intent.category.OPENABLE");
        if (TextUtils.equals(this.selectFileType, "video")) {
            intent2.setType("video/*");
            fileM120381O = ecj.m120381O("mp4");
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            intent2.setType("image/*");
            fileM120381O = ecj.m120381O("jpg");
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Uri uriForFile = FileProvider.getUriForFile(act, "files." + App.f16088e.getPackageName(), fileM120381O);
        this.cameraFileUri = uriForFile;
        intent.putExtra("output", uriForFile);
        Intent intent3 = new Intent("android.intent.action.CHOOSER");
        if (TextUtils.equals(this.selectFileType, "video")) {
            intent3.putExtra("android.intent.extra.TITLE", "Video Chooser");
        } else {
            intent3.putExtra("android.intent.extra.TITLE", "Image Chooser");
        }
        intent3.putExtra("android.intent.extra.INTENT", intent2);
        intent3.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
        act.startActivityForResult(intent3, FILE_CHOOSER_RESULT_CODE);
        return true;
    }

    public void setADWebViewSet() {
        this.adWebViewSet = true;
    }

    public void setSelectFileType(String str) {
        this.selectFileType = str;
    }
}
