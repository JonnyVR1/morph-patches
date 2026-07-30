package p153l;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageNicknameSettingAct;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes4.dex */
public class w200 implements iam<u200> {

    /* JADX INFO: renamed from: a */
    public VMaterialEdit f186856a;

    /* JADX INFO: renamed from: b */
    public u200 f186857b;

    /* JADX INFO: renamed from: c */
    public MessageNicknameSettingAct f186858c;

    public w200(MessageNicknameSettingAct messageNicknameSettingAct) {
        this.f186858c = messageNicknameSettingAct;
    }

    /* JADX INFO: renamed from: A3 */
    public void m204493A3(String str) {
        this.f186856a.setFloatingLabel(0);
        this.f186856a.setPrimaryColor(this.f186858c.getResources().getColor(g9c0.f102821k));
        this.f186856a.setFloatingLabelAlwaysShown(false);
        this.f186856a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        this.f186856a.requestFocus();
        this.f186856a.setText(str);
        this.f186856a.setSelection(Math.min(str.length(), 15));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f186858c;
    }

    /* JADX INFO: renamed from: a */
    public View m204494a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x200.m209125b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f186858c;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u200 u200Var) {
        this.f186857b = u200Var;
    }

    /* JADX INFO: renamed from: c */
    public boolean m204496c(Menu menu) {
        this.f186858c.getMenuInflater().inflate(nfc0.f141723c, menu);
        View actionView = menu.findItem(edc0.f93484x0).getActionView();
        actionView.setClickable(true);
        actionView.setOnClickListener(new View.OnClickListener() { // from class: l.v200
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182055a.m204497d(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m204497d(View view) {
        i4g0.m138520r("e_save_nickname", "p_set_nickname");
        String string = this.f186856a.getEditableText().toString();
        if (uqb0.f180394Z.m95954K(string) || (!TextUtils.isEmpty(string) && TextUtils.isEmpty(string.trim()))) {
            o1j0.m165649w(R$string.f21616U5);
        } else if (!Network.isConnected(view.getContext())) {
            o1j0.m165634h(R$string.f21461B2);
        } else {
            this.f186857b.m194236k0(string.trim());
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m204494a(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
