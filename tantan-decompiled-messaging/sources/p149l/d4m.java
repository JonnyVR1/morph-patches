package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;

/* JADX INFO: loaded from: classes9.dex */
public interface d4m {
    /* JADX INFO: renamed from: c */
    default l95 mo29860c() {
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
    View mo29862p();

    default void setDescriptionText(String str) {
    }
}
