package p002l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.d30;
import l.mcr;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class xf90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public boolean f22252u;

    public xf90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f22252u = false;
    }

    /* JADX INFO: renamed from: S */
    public abstract boolean mo10392S();

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m25902T(d30 d30Var, View view) {
        if (TEnum.equals(mo3351O().mo2717V2(), "sayhi")) {
            return;
        }
        zvf0.r("e_avatarverification_banner_click", "p_suggest_user_profile_info_view");
        d30Var.call();
    }

    /* JADX INFO: renamed from: U */
    public void m25903U(View view, int i, boolean z, final d30 d30Var, TextView textView, String str) {
        view.setVisibility(i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.wf90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21715a.m25902T(d30Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: V */
    public void m25904V(boolean z) {
        this.f22252u = z;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return this.f22252u && mo10392S();
    }
}
