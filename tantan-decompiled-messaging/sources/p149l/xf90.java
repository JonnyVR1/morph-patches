package p149l;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xf90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public boolean f192674u;

    public xf90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f192674u = false;
    }

    /* JADX INFO: renamed from: S */
    public abstract boolean mo102271S();

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m208597T(d30 d30Var, View view) {
        if (TEnum.equals(mo52800O().mo52188V2(), "sayhi")) {
            return;
        }
        zvf0.m220396r("e_avatarverification_banner_click", OMSDialogPositon.p_suggest_user_profile_info_view);
        d30Var.call();
    }

    /* JADX INFO: renamed from: U */
    public void m208598U(View view, int i, boolean z, final d30 d30Var, TextView textView, String str) {
        view.setVisibility(i);
        if (z) {
            view.setEnabled(true);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.wf90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f186071a.m208597T(d30Var, view2);
                }
            });
        } else {
            view.setEnabled(false);
            view.setOnClickListener(null);
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: V */
    public void m208599V(boolean z) {
        this.f192674u = z;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return this.f192674u && mo102271S();
    }
}
