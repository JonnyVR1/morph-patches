package com.tencent.could.huiyansdk.fragments;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.entity.AuthUiConfig;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.fragments.g */
/* JADX INFO: loaded from: classes12.dex */
public class C14060g implements YtSDKKitFramework.IYTReflectListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AuthingFragment f58247a;

    public C14060g(AuthingFragment authingFragment) {
        this.f58247a = authingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83489a() {
        FragmentActivity activity;
        Paint paint;
        LoadingFrontAnimatorView loadingFrontAnimatorView;
        if (this.f58247a.f58225k == -1) {
            return;
        }
        C14043j c14043j = C14043j.a.f58200a;
        if (c14043j.m83418b().isAutoScreenBrightness()) {
            this.f58247a.m83459b(255);
        }
        if (c14043j.m83418b().isOpenLightReflectAnim() && (loadingFrontAnimatorView = this.f58247a.f58223i) != null) {
            loadingFrontAnimatorView.m83609b();
            return;
        }
        AuthingFragment authingFragment = this.f58247a;
        if (authingFragment.f58223i == null || (activity = authingFragment.getActivity()) == null) {
            return;
        }
        this.f58247a.f58238x = true;
        AuthUiConfig authUiConfig = c14043j.f58192c;
        if (authUiConfig != null && authUiConfig.isHideFrontCircleViewOnReflect()) {
            this.f58247a.f58223i.setVisibility(8);
            return;
        }
        this.f58247a.f58223i.setVisibility(0);
        LoadingFrontAnimatorView loadingFrontAnimatorView2 = this.f58247a.f58223i;
        int color = activity.getResources().getColor(C14032R.color.txy_animation_mid_color);
        if (color == loadingFrontAnimatorView2.f58424g || (paint = loadingFrontAnimatorView2.f58427j) == null) {
            return;
        }
        loadingFrontAnimatorView2.f58424g = color;
        paint.setColor(color);
        loadingFrontAnimatorView2.invalidate();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public float onGetAppBrightness() {
        return this.f58247a.f58225k;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f) {
        this.f58247a.m83461b(colorMatrixColorFilter);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectStart(long j) {
        this.f58247a.runOnUiThread(new Runnable() { // from class: l.q2r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155383a.m83489a();
            }
        });
    }
}
