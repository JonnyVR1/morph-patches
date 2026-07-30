package p006l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.camera.widget.TTFullScreenAutoFitSurfaceView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface e4m {
    /* JADX INFO: renamed from: a */
    void mo1792a(long j);

    /* JADX INFO: renamed from: b */
    void mo1793b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo1794c();

    /* JADX INFO: renamed from: d */
    void mo1795d(long j, long j2);

    View getCloseButton();

    TTFullScreenAutoFitSurfaceView getPreviewSurface();

    View getRecordButton();

    @Nullable
    default View getSwitchCameraButton() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    View mo1796p();

    void release();
}
