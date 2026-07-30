package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;

/* JADX INFO: loaded from: classes9.dex */
public interface e4m {
    /* JADX INFO: renamed from: a */
    void mo29880a(long j);

    /* JADX INFO: renamed from: b */
    void mo29881b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo29882c();

    /* JADX INFO: renamed from: d */
    void mo29883d(long j, long j2);

    View getCloseButton();

    TTFullScreenAutoFitSurfaceView getPreviewSurface();

    View getRecordButton();

    @Nullable
    default View getSwitchCameraButton() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    View mo29884p();

    void release();
}
