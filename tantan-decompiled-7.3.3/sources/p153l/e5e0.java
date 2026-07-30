package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.HelpCenterFrag;

/* JADX INFO: loaded from: classes9.dex */
public class e5e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Intent intent = new Intent(abe0Var.m96739b(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", HelpCenterFrag.class.getSimpleName());
        return intent;
    }
}
