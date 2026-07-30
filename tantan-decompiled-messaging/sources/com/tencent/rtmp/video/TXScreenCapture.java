package com.tencent.rtmp.video;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.screencapture.C14191c;

/* JADX INFO: loaded from: classes2.dex */
public class TXScreenCapture {

    @TargetApi(21)
    public static class TXScreenCaptureAssistantActivity extends Activity {
        private static final int REQUEST_CODE = 100;
        private static final String TAG = "TXScreenCaptureAssistantActivity";
        private MediaProjectionManager mMediaProjectionManager;

        @Override // android.app.Activity
        public void onActivityResult(int i, int i2, Intent intent) {
            TXCLog.m82969i(TAG, "onActivityResult " + this);
            C14191c.m83998a(this).m84008a(this.mMediaProjectionManager.getMediaProjection(i2, intent));
            finish();
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            TXCLog.m82969i(TAG, "onCreate " + this);
            requestWindowFeature(1);
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getApplicationContext().getSystemService("media_projection");
            this.mMediaProjectionManager = mediaProjectionManager;
            try {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 100);
            } catch (Exception e) {
                TXCLog.m82966e(TAG, "start permission activity failed. " + e);
                C14191c.m83998a(this).m84008a((MediaProjection) null);
                finish();
            }
        }

        @Override // android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            TXCLog.m82969i(TAG, "onDestroy " + this);
        }
    }
}
