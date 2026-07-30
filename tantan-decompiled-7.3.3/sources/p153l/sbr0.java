package p153l;

import android.content.Context;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public final class sbr0 implements rbr0 {

    /* JADX INFO: renamed from: a */
    public final WindowManager f167175a;

    public sbr0(WindowManager windowManager) {
        this.f167175a = windowManager;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static rbr0 m185331b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (windowManager != null) {
            return new sbr0(windowManager);
        }
        return null;
    }

    @Override // p153l.rbr0
    /* JADX INFO: renamed from: a */
    public final void mo180758a(obr0 obr0Var) {
        vbr0.m200729b(obr0Var.f146612a, this.f167175a.getDefaultDisplay());
    }

    @Override // p153l.rbr0
    public final void zza() {
    }
}
