package com.tencent.could.huiyansdk.activitys;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.C13869R;
import org.jetbrains.annotations.NotNull;
import p149l.otb;

/* JADX INFO: loaded from: classes2.dex */
public class LandMainAuthActivity extends BaseActivity {
    @Override // com.tencent.could.huiyansdk.activitys.BaseActivity
    /* JADX INFO: renamed from: d */
    public void mo82217d() {
        setContentView(C13869R.layout.txy_huiyan_activity_main_auth);
    }

    @Override // com.tencent.could.huiyansdk.activitys.BaseActivity, androidx.lifecycle.InterfaceC0475e
    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.tencent.could.huiyansdk.activitys.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT == 26 && m82218e()) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(0);
        }
    }
}
