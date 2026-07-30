package com.sina.weibo.sdk.share;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.api.StoryMessage;
import com.sina.weibo.sdk.api.StoryObject;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.web.view.WbSdkProgressBar;

/* JADX INFO: loaded from: classes11.dex */
public class WbShareToStoryActivity extends BaseActivity {
    private String callbackActivity;
    private View progressBar;
    private int progressColor = -1;
    private int progressId = -1;
    private FrameLayout rootLayout;
    private SaveFileTask saveFileTask;

    private boolean checkInfo(StoryMessage storyMessage) {
        return storyMessage.checkSource() && WbSdk.supportMultiImage(this);
    }

    private void gotoSave(StoryMessage storyMessage) {
        SaveFileTask saveFileTask = this.saveFileTask;
        if (saveFileTask != null) {
            saveFileTask.cancel(true);
        }
        SaveFileTask saveFileTask2 = new SaveFileTask(this, new TransResourceCallback() { // from class: com.sina.weibo.sdk.share.WbShareToStoryActivity.1
            @Override // com.sina.weibo.sdk.share.TransResourceCallback
            public void onTransFinish(StoryObject storyObject) {
                if (storyObject == null) {
                    WbShareToStoryActivity.this.setCallbackActivity(2);
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("sinaweibo://story/publish?forceedit=1&finish=true"));
                    intent.setPackage(intent.getStringExtra(WBConstants.SHARE_START_PACKAGE));
                    intent.putExtra("storyData", storyObject);
                    WbShareToStoryActivity.this.startActivity(intent);
                } catch (Exception unused) {
                    WbShareToStoryActivity.this.setCallbackActivity(2);
                }
            }

            @Override // com.sina.weibo.sdk.share.TransResourceCallback
            public void onTransFinish(TransResourceResult transResourceResult) {
            }
        });
        this.saveFileTask = saveFileTask2;
        saveFileTask2.execute(storyMessage);
    }

    private void initView() {
        try {
            this.progressColor = getIntent().getIntExtra(WBConstants.TRANS_PROGRESS_COLOR, -1);
            this.progressId = getIntent().getIntExtra(WBConstants.TRANS_PROGRESS_ID, -1);
        } catch (Exception unused) {
        }
        this.rootLayout = new FrameLayout(this);
        if (this.progressId != -1) {
            try {
                this.progressBar = ((LayoutInflater) getSystemService("layout_inflater")).inflate(this.progressId, (ViewGroup) null);
            } catch (Exception unused2) {
                this.progressBar = new WbSdkProgressBar(this);
            }
        } else {
            WbSdkProgressBar wbSdkProgressBar = new WbSdkProgressBar(this);
            this.progressBar = wbSdkProgressBar;
            int i = this.progressColor;
            if (i != -1) {
                wbSdkProgressBar.setProgressColor(i);
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.rootLayout.addView(this.progressBar, layoutParams);
        this.rootLayout.setBackgroundColor(855638016);
        setContentView(this.rootLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallbackActivity(int i) {
        FrameLayout frameLayout = this.rootLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        try {
            Intent intent = new Intent();
            intent.putExtra(WBConstants.Response.ERRCODE, i);
            setResult(-1, intent);
        } catch (Exception e) {
            LogUtil.m81664v("weibo sdk", e.toString());
        }
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.sina.weibo.sdk.share.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        StoryMessage storyMessage;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        try {
            if (bundle != null) {
                this.callbackActivity = bundle.getString(WBConstants.SHARE_START_ACTIVITY);
            } else {
                this.callbackActivity = intent.getStringExtra(WBConstants.SHARE_START_ACTIVITY);
            }
        } catch (Exception unused) {
        }
        if (intent.getIntExtra(WBConstants.SHARE_START_FLAG, -1) != 0) {
            finish();
            return;
        }
        if (TextUtils.isEmpty(this.callbackActivity)) {
            finish();
            return;
        }
        try {
            storyMessage = (StoryMessage) getIntent().getParcelableExtra(WBConstants.Msg.STORY);
        } catch (Exception unused2) {
            storyMessage = null;
        }
        if (storyMessage == null) {
            setCallbackActivity(2);
        } else if (!checkInfo(storyMessage)) {
            setCallbackActivity(2);
        } else {
            initView();
            gotoSave(storyMessage);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        int intExtra;
        super.onNewIntent(intent);
        try {
            intExtra = intent.getIntExtra("backType", 0);
        } catch (Exception unused) {
            intExtra = 0;
        }
        if (intExtra == 0) {
            setCallbackActivity(1);
        } else {
            setCallbackActivity(0);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(WBConstants.SHARE_START_ACTIVITY, this.callbackActivity);
    }
}
