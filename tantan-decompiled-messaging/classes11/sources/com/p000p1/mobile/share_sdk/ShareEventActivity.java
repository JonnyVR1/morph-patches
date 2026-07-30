package com.p000p1.mobile.share_sdk;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.share_sdk.content.Content;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.share.WbShareHandler;
import com.tencent.tauth.Tencent;
import p009l.bnb0;
import p009l.cnb0;
import p009l.dnb0;
import p009l.f4f;
import p009l.fmp0;
import p009l.knp0;
import p009l.whf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ShareEventActivity extends Activity {
    public static final String PLATFORM = "platform";
    public static final String SHARE_DATA = "share_data";
    String platform;

    /* JADX INFO: renamed from: com.p1.mobile.share_sdk.ShareEventActivity$a */
    public class ViewOnClickListenerC0554a implements View.OnClickListener {
        public ViewOnClickListenerC0554a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ShareEventActivity.this.isFinishing()) {
                return;
            }
            ShareEventActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.share_sdk.ShareEventActivity$b */
    public class RunnableC0555b implements Runnable {
        public RunnableC0555b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ShareEventActivity.this.isFinishing()) {
                return;
            }
            ShareEventActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10103 || i == 10104) {
            Tencent.onActivityResultData(i, i2, intent, f4f.f12777e);
        } else if (whf0.f22112b.equals(this.platform)) {
            if (intent == null) {
                f4f.m14206c(new f4f.C0883e(2, null));
            } else if (intent.getIntExtra(WBConstants.Response.ERRCODE, -31) == -31) {
                f4f.m14206c(new f4f.C0883e(1, null));
            } else {
                new WbShareHandler(this).doResultIntent(intent, f4f.f12775c);
            }
        }
        if (dnb0.f11916b.equals(this.platform)) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0555b(), 800L);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        findViewById(R.id.content).setOnClickListener(new ViewOnClickListenerC0554a());
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(PLATFORM);
        this.platform = stringExtra;
        if (!TextUtils.isEmpty(stringExtra) && (this.platform.equals(dnb0.f11916b) || this.platform.equals(cnb0.f10700b))) {
            bnb0.m12148l(this.platform, this, (Content) intent.getSerializableExtra(SHARE_DATA));
            return;
        }
        if (!TextUtils.equals(this.platform, whf0.f22112b)) {
            fmp0.m14514g(this).handleIntent(intent, f4f.f12776d);
        } else if (WbSdk.isWbInstall(this)) {
            knp0.m17560j(this, (Content) intent.getSerializableExtra(SHARE_DATA));
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (TextUtils.isEmpty(this.platform)) {
            finish();
        }
    }
}
