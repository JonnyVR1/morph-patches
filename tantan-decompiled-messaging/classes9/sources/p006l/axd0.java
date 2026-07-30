package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class axd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Intent intent = new Intent(w2e0Var.m26156b(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", HelpCenterFrag.class.getSimpleName());
        return intent;
    }
}
