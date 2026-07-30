package com.sina.weibo.sdk.share;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.api.VideoSourceObject;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.WbAppInfo;
import com.sina.weibo.sdk.utils.FileUtils;
import com.sina.weibo.sdk.utils.ImageUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CopyResourceTask extends AsyncTask<WeiboMultiMessage, Object, TransResourceResult> {
    private TransResourceCallback mCallback;
    private WeakReference<Context> mReference;

    public CopyResourceTask(Context context, TransResourceCallback transResourceCallback) {
        this.mReference = new WeakReference<>(context);
        this.mCallback = transResourceCallback;
    }

    @Override // android.os.AsyncTask
    public TransResourceResult doInBackground(WeiboMultiMessage... weiboMultiMessageArr) throws Throwable {
        Uri uri;
        Context context = this.mReference.get();
        if (context == null) {
            return null;
        }
        WeiboMultiMessage weiboMultiMessage = weiboMultiMessageArr[0];
        TransResourceResult transResourceResult = new TransResourceResult();
        try {
            if (WbSdk.isWbInstall(context)) {
                WbAppInfo wbAppInfoQueryWbInfoInternal = WeiboAppManager.queryWbInfoInternal(context);
                if (wbAppInfoQueryWbInfoInternal == null || wbAppInfoQueryWbInfoInternal.getSupportVersion() < 10772) {
                    weiboMultiMessage.multiImageObject = null;
                    weiboMultiMessage.videoSourceObject = null;
                } else {
                    if (weiboMultiMessage.imageObject != null && weiboMultiMessage.multiImageObject != null) {
                        weiboMultiMessage.imageObject = null;
                    }
                    if (weiboMultiMessage.videoSourceObject != null && (weiboMultiMessage.multiImageObject != null || weiboMultiMessage.imageObject != null)) {
                        weiboMultiMessage.multiImageObject = null;
                        weiboMultiMessage.imageObject = null;
                    }
                }
                if (weiboMultiMessage.multiImageObject != null) {
                    ArrayList<Uri> arrayList = new ArrayList<>();
                    for (Uri uri2 : weiboMultiMessage.multiImageObject.getImageList()) {
                        if (uri2 != null && FileUtils.isImageFile(context, uri2)) {
                            String strCopyFileToWeiboTem = ShareUtils.copyFileToWeiboTem(context, uri2, 1);
                            if (!TextUtils.isEmpty(strCopyFileToWeiboTem)) {
                                arrayList.add(Uri.fromFile(new File(strCopyFileToWeiboTem)));
                            }
                        }
                    }
                    weiboMultiMessage.multiImageObject.setImageList(arrayList);
                }
                VideoSourceObject videoSourceObject = weiboMultiMessage.videoSourceObject;
                if (videoSourceObject != null && (uri = videoSourceObject.videoPath) != null && FileUtils.isVideoFile(context, uri)) {
                    String strCopyFileToWeiboTem2 = ShareUtils.copyFileToWeiboTem(context, uri, 0);
                    weiboMultiMessage.videoSourceObject.videoPath = Uri.fromFile(new File(strCopyFileToWeiboTem2));
                    weiboMultiMessage.videoSourceObject.during = ImageUtils.getVideoDuring(strCopyFileToWeiboTem2);
                }
            }
            transResourceResult.message = weiboMultiMessage;
            transResourceResult.transDone = true;
            return transResourceResult;
        } catch (Exception unused) {
            transResourceResult.transDone = false;
            return transResourceResult;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(TransResourceResult transResourceResult) {
        super.onPostExecute(transResourceResult);
        TransResourceCallback transResourceCallback = this.mCallback;
        if (transResourceCallback != null) {
            transResourceCallback.onTransFinish(transResourceResult);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
    }
}
