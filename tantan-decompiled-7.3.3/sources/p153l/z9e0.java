package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes9.dex */
public class z9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if ("datingAttitude".equals(TextUtils.isEmpty(abe0Var.m96744g()) ? "" : abe0Var.m96744g().replaceFirst("/", ""))) {
            baj.m103187a0(CoreModule.f18264c.f20381e0.m116600p9(), (Act) abe0Var.m96739b(), null, baj.f75707h);
        }
        return null;
    }
}
