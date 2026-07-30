package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupDescriptionEditAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class egk implements iam<cgk> {

    /* JADX INFO: renamed from: a */
    public VEditText f93941a;

    /* JADX INFO: renamed from: b */
    public VText f93942b;

    /* JADX INFO: renamed from: c */
    public VText f93943c;

    /* JADX INFO: renamed from: d */
    public GroupDescriptionEditAct f93944d;

    /* JADX INFO: renamed from: e */
    public cgk f93945e;

    /* JADX INFO: renamed from: f */
    public VText f93946f;

    /* JADX INFO: renamed from: g */
    public String f93947g;

    /* JADX INFO: renamed from: h */
    public ChatGroup f93948h;

    /* JADX INFO: renamed from: l.egk$b */
    public static class C16771b {
        /* JADX INFO: renamed from: b */
        public static void m120788b(egk egkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            egkVar.f93941a = (VEditText) viewGroup.getChildAt(0);
            egkVar.f93942b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            egkVar.f93943c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m120789c(egk egkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157065l0, viewGroup, false);
            m120788b(egkVar, viewInflate);
            return viewInflate;
        }
    }

    public egk(GroupDescriptionEditAct groupDescriptionEditAct) {
        this.f93944d = groupDescriptionEditAct;
    }

    /* JADX INFO: renamed from: A3 */
    public void m120780A3(String str) {
        this.f93947g = str;
        this.f93941a.setText(str);
        this.f93941a.addTextChangedListener(new C16770a());
        if (TextUtils.isEmpty(CoreModule.f18264c.f20387g0.m32838Q6())) {
            return;
        }
        this.f93942b.setText(CoreModule.f18264c.f20387g0.m32838Q6());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f93944d;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m120781k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m120781k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16771b.m120789c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cgk cgkVar) {
        this.f93945e = cgkVar;
    }

    /* JADX INFO: renamed from: m */
    public boolean m120783m(Menu menu) {
        this.f93944d.getMenuInflater().inflate(nfc0.f141722b, menu);
        this.f93946f = (VText) menu.findItem(edc0.f93388j2).getActionView().findViewById(edc0.f93384i5);
        boolean zM158351b = mgk.m158351b(this.f93948h);
        VText vText = this.f93946f;
        if (zM158351b) {
            mgk.m158355f(new eik.C16780b(vText, this.f93941a, null), this.f93948h.inModeration.description);
            return true;
        }
        vText.setEnabled(m120784n());
        bnl0.m105509E0(this.f93946f, new View.OnClickListener() { // from class: l.dgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88315a.m120785p(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m120784n() {
        String strTrim = this.f93941a.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return false;
        }
        return !TextUtils.equals(strTrim, this.f93947g);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m120785p(View view) {
        this.f93944d.hideInput(this.f93941a);
        this.f93945e.m109709q0(this.f93941a.getText().toString().trim());
    }

    /* JADX INFO: renamed from: q */
    public void m120786q(ChatGroup chatGroup) {
        this.f93948h = chatGroup;
        if (mgk.m158351b(chatGroup)) {
            mgk.m158355f(new eik.C16780b(this.f93946f, this.f93941a, null), chatGroup.inModeration.description);
            return;
        }
        this.f93941a.setText(chatGroup.description);
        VEditText vEditText = this.f93941a;
        vEditText.setSelection(vEditText.getText().length());
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.egk$a */
    public class C16770a implements TextWatcher {
        public C16770a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            egk.this.f93943c.setText(String.format("%1$s/%2$s", Integer.valueOf(editable.toString().length()), 300));
            if (!mgk.m158351b(egk.this.f93948h) && NullChecker.m82486a(egk.this.f93946f)) {
                egk.this.f93946f.setEnabled(egk.this.m120784n());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
