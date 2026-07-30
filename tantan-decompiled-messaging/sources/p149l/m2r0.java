package p149l;

import android.content.Context;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class m2r0 implements l2r0 {

    /* JADX INFO: renamed from: a */
    public final WindowManager f130940a;

    public m2r0(WindowManager windowManager) {
        this.f130940a = windowManager;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static l2r0 m152702b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null) {
            return new m2r0(windowManager);
        }
        return null;
    }

    @Override // p149l.l2r0
    /* JADX INFO: renamed from: a */
    public final void mo148295a(i2r0 i2r0Var) {
        p2r0.m167208b(i2r0Var.f110579a, this.f130940a.getDefaultDisplay());
    }

    @Override // p149l.l2r0
    public final void zza() {
    }
}
