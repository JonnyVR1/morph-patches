package com.tencent.could.huiyansdk.fragments;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.g */
/* JADX INFO: loaded from: classes2.dex */
public class C13897g implements YtSDKKitFramework.IYTReflectListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f57399a;

    public C13897g(AuthingFragment authingFragment) {
        this.f57399a = authingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82306a() {
        FragmentActivity activity;
        Paint paint;
        LoadingFrontAnimatorView loadingFrontAnimatorView;
        if (this.f57399a.f57377k == -1) {
            return;
        }
        C13880j c13880j = C13880j.a.f57352a;
        if (c13880j.m82235b().isAutoScreenBrightness()) {
            this.f57399a.m82276b(255);
        }
        if (c13880j.m82235b().isOpenLightReflectAnim() && (loadingFrontAnimatorView = this.f57399a.f57375i) != null) {
            loadingFrontAnimatorView.m82426b();
            return;
        }
        AuthingFragment authingFragment = this.f57399a;
        if (authingFragment.f57375i == null || (activity = authingFragment.getActivity()) == null) {
            return;
        }
        this.f57399a.f57390x = true;
        AuthUiConfig authUiConfig = c13880j.f57344c;
        if (authUiConfig != null && authUiConfig.isHideFrontCircleViewOnReflect()) {
            this.f57399a.f57375i.setVisibility(8);
            return;
        }
        this.f57399a.f57375i.setVisibility(0);
        LoadingFrontAnimatorView loadingFrontAnimatorView2 = this.f57399a.f57375i;
        int color = activity.getResources().getColor(C13869R.color.txy_animation_mid_color);
        if (color == loadingFrontAnimatorView2.f57576g || (paint = loadingFrontAnimatorView2.f57579j) == null) {
            return;
        }
        loadingFrontAnimatorView2.f57576g = color;
        paint.setColor(color);
        loadingFrontAnimatorView2.invalidate();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public float onGetAppBrightness() {
        return this.f57399a.f57377k;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
        this.f57399a.m82278b(colorMatrixColorFilter);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectStart(long j) {
        this.f57399a.runOnUiThread(new Runnable() { // from class: l.ktq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f124609a.m82306a();
            }
        });
    }
}
