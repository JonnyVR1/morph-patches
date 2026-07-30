package com.idv.identity.face.p043ui;

import android.os.Bundle;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;

/* JADX INFO: loaded from: classes7.dex */
public class ToygerLandActivity extends ToygerActivity {
    @Override // com.idv.identity.face.p043ui.ToygerActivity, com.idv.identity.platform.IntlFaceBaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, ToygerActivity.f12859E, "activityType", "enterToygerLandActivity");
        super.onCreate(bundle);
    }
}
