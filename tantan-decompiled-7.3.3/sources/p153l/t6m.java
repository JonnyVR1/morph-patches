package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;

/* JADX INFO: loaded from: classes9.dex */
public interface t6m {
    /* JADX INFO: renamed from: c */
    default ma5 mo30858c() {
        return null;
    }

    View getCloseButton();

    TTFullScreenAutoFitSurfaceView getPreviewSurface();

    @Nullable
    default View getSwitchCameraButton() {
        return null;
    }

    View getTakePictureButton();

    /* JADX INFO: renamed from: q */
    View mo30860q();

    default void setDescriptionText(String str) {
    }
}
