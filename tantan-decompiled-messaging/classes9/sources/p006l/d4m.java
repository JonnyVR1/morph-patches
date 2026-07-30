package p006l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface d4m {
    /* JADX INFO: renamed from: c */
    default l95 mo1772c() {
        return null;
    }

    View getCloseButton();

    TTFullScreenAutoFitSurfaceView getPreviewSurface();

    @Nullable
    default View getSwitchCameraButton() {
        return null;
    }

    View getTakePictureButton();

    /* JADX INFO: renamed from: p */
    View mo1774p();

    default void setDescriptionText(String str) {
    }
}
