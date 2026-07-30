package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class dze0 extends thp0 {
    private static int FILE_CHOOSER_RESULT_CODE = 34;
    private WeakReference<Act> act;
    private boolean adWebViewSet = false;
    private Uri cameraFileUri;
    private String selectFileType;
    private ValueCallback<Uri[]> uploadCallBack;

    public dze0(Act act) {
        this.act = new WeakReference<>(act);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == FILE_CHOOSER_RESULT_CODE) {
            Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            if (!NullChecker.m81303a(data)) {
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

    @Override // p149l.thp0
    public boolean onShowFileChooserX(WebViewX webViewX, prk0<Uri[]> prk0Var, ofi ofiVar) {
        File fileM145083O;
        Intent intent;
        Act act = this.act.get();
        if (!NullChecker.m81303a(act)) {
            return super.onShowFileChooserX(webViewX, prk0Var, ofiVar);
        }
        this.uploadCallBack = prk0Var.f150922a;
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.addCategory("android.intent.category.OPENABLE");
        if (TextUtils.equals(this.selectFileType, "video")) {
            intent2.setType("video/*");
            fileM145083O = k9j.m145083O("mp4");
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            intent2.setType("image/*");
            fileM145083O = k9j.m145083O("jpg");
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Uri uriForFile = FileProvider.getUriForFile(act, "files." + App.f15369e.getPackageName(), fileM145083O);
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
