package p009l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.lang.ref.WeakReference;
import l.k9j;
import l.ofi;
import l.prk0;
import l.thp0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
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
            if (!NullChecker.a(data)) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (this.adWebViewSet) {
            callback.invoke(str, true, false);
        }
        super/*android.webkit.WebChromeClient*/.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public boolean onShowFileChooserX(WebViewX webViewX, prk0<Uri[]> prk0Var, ofi ofiVar) {
        File fileO;
        Intent intent;
        Act act = this.act.get();
        if (!NullChecker.a(act)) {
            return super.onShowFileChooserX(webViewX, prk0Var, ofiVar);
        }
        this.uploadCallBack = prk0Var.a;
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.addCategory("android.intent.category.OPENABLE");
        if (TextUtils.equals(this.selectFileType, "video")) {
            intent2.setType("video/*");
            fileO = k9j.O("mp4");
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            intent2.setType("image/*");
            fileO = k9j.O("jpg");
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Uri uriForFile = FileProvider.getUriForFile(act, "files." + App.e.getPackageName(), fileO);
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
