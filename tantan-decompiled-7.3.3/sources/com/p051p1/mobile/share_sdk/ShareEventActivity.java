package com.p051p1.mobile.share_sdk;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.share_sdk.content.Content;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.share.WbShareHandler;
import com.tencent.tauth.Tencent;
import p153l.fqf0;
import p153l.fvb0;
import p153l.gvb0;
import p153l.hvb0;
import p153l.j5f;
import p153l.jvp0;
import p153l.owp0;

/* JADX INFO: loaded from: classes10.dex */
public class ShareEventActivity extends Activity {
    public static final String PLATFORM = "platform";
    public static final String SHARE_DATA = "share_data";
    String platform;

    /* JADX INFO: renamed from: com.p1.mobile.share_sdk.ShareEventActivity$a */
    public class ViewOnClickListenerC13315a implements View.OnClickListener {
        public ViewOnClickListenerC13315a() {
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
    public class RunnableC13316b implements Runnable {
        public RunnableC13316b() {
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
            Tencent.onActivityResultData(i, i2, intent, j5f.f118429e);
        } else if (fqf0.f100284b.equals(this.platform)) {
            if (intent == null) {
                j5f.m143523c(new j5f.C17884e(2, null));
            } else if (intent.getIntExtra(WBConstants.Response.ERRCODE, -31) == -31) {
                j5f.m143523c(new j5f.C17884e(1, null));
            } else {
                new WbShareHandler(this).doResultIntent(intent, j5f.f118427c);
            }
        }
        if (hvb0.f111748b.equals(this.platform)) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC13316b(), 800L);
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
        findViewById(R.id.content).setOnClickListener(new ViewOnClickListenerC13315a());
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("platform");
        this.platform = stringExtra;
        if (!TextUtils.isEmpty(stringExtra) && (this.platform.equals(hvb0.f111748b) || this.platform.equals(gvb0.f106619b))) {
            fvb0.m127598l(this.platform, this, (Content) intent.getSerializableExtra(SHARE_DATA));
            return;
        }
        if (!TextUtils.equals(this.platform, fqf0.f100284b)) {
            jvp0.m147081g(this).handleIntent(intent, j5f.f118428d);
        } else if (WbSdk.isWbInstall(this)) {
            owp0.m169607j(this, (Content) intent.getSerializableExtra(SHARE_DATA));
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
