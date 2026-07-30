package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;

/* JADX INFO: loaded from: classes9.dex */
public interface u6m {
    /* JADX INFO: renamed from: a */
    void mo30878a(long j);

    /* JADX INFO: renamed from: b */
    void mo30879b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo30880c();

    /* JADX INFO: renamed from: d */
    void mo30881d(long j, long j2);

    View getCloseButton();

    TTFullScreenAutoFitSurfaceView getPreviewSurface();

    View getRecordButton();

    @Nullable
    default View getSwitchCameraButton() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    View mo30882q();

    void release();
}
