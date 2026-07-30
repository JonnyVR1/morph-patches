package com.tencent.could.huiyansdk.activitys;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.tencent.could.huiyansdk.C14032R;
import org.jetbrains.annotations.NotNull;
import p153l.cvb;

/* JADX INFO: loaded from: classes12.dex */
public class LandMainAuthActivity extends BaseActivity {
    @Override // com.tencent.could.huiyansdk.activitys.BaseActivity
    /* JADX INFO: renamed from: d */
    public void mo83400d() {
        setContentView(C14032R.layout.txy_huiyan_activity_main_auth);
    }

    @Override // com.tencent.could.huiyansdk.activitys.BaseActivity, androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.tencent.could.huiyansdk.activitys.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT == 26 && m83401e()) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(0);
        }
    }
}
