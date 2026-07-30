package com.uuzuche.lib_zxing.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import p153l.bfc0;
import p153l.ic5;
import p153l.pdc0;

/* JADX INFO: loaded from: classes2.dex */
public class CaptureActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c */
    ic5 f61695c = new C14675b();

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureActivity$a */
    public class C14674a implements CaptureFragment.InterfaceC14677b {
        public C14674a() {
        }

        @Override // com.uuzuche.lib_zxing.activity.CaptureFragment.InterfaceC14677b
        /* JADX INFO: renamed from: a */
        public void mo85861a(Exception exc) {
            if (exc == null) {
                return;
            }
            Log.e("TAG", "callBack: ", exc);
        }
    }

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureActivity$b */
    public class C14675b implements ic5 {
        public C14675b() {
        }

        @Override // p153l.ic5
        /* JADX INFO: renamed from: a */
        public void mo85862a(Bitmap bitmap, String str) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("result_type", 1);
            bundle.putString("result_string", str);
            intent.putExtras(bundle);
            CaptureActivity.this.setResult(-1, intent);
            CaptureActivity.this.finish();
        }

        @Override // p153l.ic5
        /* JADX INFO: renamed from: b */
        public void mo85863b() {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("result_type", 2);
            bundle.putString("result_string", "");
            intent.putExtras(bundle);
            CaptureActivity.this.setResult(-1, intent);
            CaptureActivity.this.finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(bfc0.f76478a);
        CaptureFragment captureFragment = new CaptureFragment();
        captureFragment.m85870b4(this.f61695c);
        getSupportFragmentManager().m2568m().m2812s(pdc0.f151735e, captureFragment).mo2708i();
        captureFragment.m85871c4(new C14674a());
    }
}
