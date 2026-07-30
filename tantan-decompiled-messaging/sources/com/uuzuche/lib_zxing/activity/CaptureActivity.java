package com.uuzuche.lib_zxing.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import p149l.ib5;
import p149l.j5c0;
import p149l.w6c0;

/* JADX INFO: loaded from: classes2.dex */
public class CaptureActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c */
    ib5 f60848c = new C14527b();

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureActivity$a */
    public class C14526a implements CaptureFragment.InterfaceC14529b {
        public C14526a() {
        }

        @Override // com.uuzuche.lib_zxing.activity.CaptureFragment.InterfaceC14529b
        /* JADX INFO: renamed from: a */
        public void mo84690a(Exception exc) {
            if (exc == null) {
                return;
            }
            Log.e("TAG", "callBack: ", exc);
        }
    }

    /* JADX INFO: renamed from: com.uuzuche.lib_zxing.activity.CaptureActivity$b */
    public class C14527b implements ib5 {
        public C14527b() {
        }

        @Override // p149l.ib5
        /* JADX INFO: renamed from: a */
        public void mo84691a(Bitmap bitmap, String str) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("result_type", 1);
            bundle.putString("result_string", str);
            intent.putExtras(bundle);
            CaptureActivity.this.setResult(-1, intent);
            CaptureActivity.this.finish();
        }

        @Override // p149l.ib5
        /* JADX INFO: renamed from: b */
        public void mo84692b() {
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
        setContentView(w6c0.f184828a);
        CaptureFragment captureFragment = new CaptureFragment();
        captureFragment.m84699b4(this.f60848c);
        getSupportFragmentManager().m2567m().m2811s(j5c0.f116289e, captureFragment).mo2707i();
        captureFragment.m84700c4(new C14526a());
    }
}
