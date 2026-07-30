package p153l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bo90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public boolean f77661u;

    public bo90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f77661u = false;
    }

    /* JADX INFO: renamed from: S */
    public abstract boolean mo105673S();

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m105674T(x20 x20Var, View view) {
        if (TEnum.equals(mo53983O().mo53371V2(), "sayhi")) {
            return;
        }
        i4g0.m138520r("e_avatarverification_banner_click", OMSDialogPositon.p_suggest_user_profile_info_view);
        x20Var.call();
    }

    /* JADX INFO: renamed from: U */
    public void m105675U(View view, int i, boolean z, final x20 x20Var, TextView textView, String str) {
        view.setVisibility(i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.ao90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f72433a.m105674T(x20Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: V */
    public void m105676V(boolean z) {
        this.f77661u = z;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return this.f77661u && mo105673S();
    }
}
