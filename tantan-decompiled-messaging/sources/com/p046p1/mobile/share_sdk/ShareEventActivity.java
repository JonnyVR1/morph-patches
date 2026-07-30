package com.p046p1.mobile.share_sdk;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.share_sdk.content.Content;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.share.WbShareHandler;
import com.tencent.tauth.Tencent;
import p149l.bnb0;
import p149l.cnb0;
import p149l.dnb0;
import p149l.f4f;
import p149l.fmp0;
import p149l.knp0;
import p149l.whf0;

/* JADX INFO: loaded from: classes11.dex */
public class ShareEventActivity extends Activity {
    public static final String PLATFORM = "platform";
    public static final String SHARE_DATA = "share_data";
    String platform;

    /* JADX INFO: renamed from: com.p1.mobile.share_sdk.ShareEventActivity$a */
    public class ViewOnClickListenerC13152a implements View.OnClickListener {
        public ViewOnClickListenerC13152a() {
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
    public class RunnableC13153b implements Runnable {
        public RunnableC13153b() {
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
            Tencent.onActivityResultData(i, i2, intent, f4f.f94813e);
        } else if (whf0.f186432b.equals(this.platform)) {
            if (intent == null) {
                f4f.m119310c(new f4f.C16752e(2, null));
            } else if (intent.getIntExtra(WBConstants.Response.ERRCODE, -31) == -31) {
                f4f.m119310c(new f4f.C16752e(1, null));
            } else {
                new WbShareHandler(this).doResultIntent(intent, f4f.f94811c);
            }
        }
        if (dnb0.f87044b.equals(this.platform)) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC13153b(), 800L);
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
        findViewById(R.id.content).setOnClickListener(new ViewOnClickListenerC13152a());
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("platform");
        this.platform = stringExtra;
        if (!TextUtils.isEmpty(stringExtra) && (this.platform.equals(dnb0.f87044b) || this.platform.equals(cnb0.f81658b))) {
            bnb0.m102759l(this.platform, this, (Content) intent.getSerializableExtra(SHARE_DATA));
            return;
        }
        if (!TextUtils.equals(this.platform, whf0.f186432b)) {
            fmp0.m122175g(this).handleIntent(intent, f4f.f94812d);
        } else if (WbSdk.isWbInstall(this)) {
            knp0.m146582j(this, (Content) intent.getSerializableExtra(SHARE_DATA));
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
