package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class n300 implements iam<l300> {

    /* JADX INFO: renamed from: a */
    public VRelative f139927a;

    /* JADX INFO: renamed from: b */
    public VCheckBox f139928b;

    /* JADX INFO: renamed from: c */
    public MessagesAct f139929c;

    /* JADX INFO: renamed from: d */
    public l300 f139930d;

    public n300(MessagesAct messagesAct) {
        this.f139929c = messagesAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f139929c;
    }

    /* JADX INFO: renamed from: b */
    public View m161265b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o300.m165835b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(l300 l300Var) {
        this.f139930d = l300Var;
    }

    /* JADX INFO: renamed from: d */
    public void m161267d() {
        if (NullChecker.m82486a(this.f139928b)) {
            this.f139928b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.m300
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f134638a.m161268e(compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m161268e(CompoundButton compoundButton, boolean z) {
        if (this.f139929c.mo50143F() != null) {
            this.f139929c.mo50143F().m183229q0(z);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m161265b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
