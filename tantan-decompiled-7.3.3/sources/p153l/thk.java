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
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupNameEditAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class thk implements iam<qhk> {

    /* JADX INFO: renamed from: a */
    public VEditText f174376a;

    /* JADX INFO: renamed from: b */
    public VImage f174377b;

    /* JADX INFO: renamed from: c */
    public VText f174378c;

    /* JADX INFO: renamed from: d */
    public VText f174379d;

    /* JADX INFO: renamed from: e */
    public GroupNameEditAct f174380e;

    /* JADX INFO: renamed from: f */
    public qhk f174381f;

    /* JADX INFO: renamed from: g */
    public VText f174382g;

    /* JADX INFO: renamed from: h */
    public String f174383h;

    /* JADX INFO: renamed from: i */
    public ChatGroup f174384i;

    /* JADX INFO: renamed from: l.thk$b */
    public static class C20320b {
        /* JADX INFO: renamed from: b */
        public static void m191260b(thk thkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            thkVar.f174376a = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            thkVar.f174377b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            thkVar.f174378c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            thkVar.f174379d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m191261c(thk thkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157100q0, viewGroup, false);
            m191260b(thkVar, viewInflate);
            return viewInflate;
        }
    }

    public thk(GroupNameEditAct groupNameEditAct) {
        this.f174380e = groupNameEditAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m191251s() {
        String strTrim = this.f174376a.getText().toString().trim();
        return (TextUtils.isEmpty(strTrim) || TextUtils.equals(strTrim, this.f174383h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m191252v(View view) {
        this.f174376a.setText("");
    }

    /* JADX INFO: renamed from: A3 */
    public void m191253A3(String str) {
        this.f174383h = str;
        this.f174376a.setText(str);
        this.f174376a.addTextChangedListener(new C20319a());
        if (!TextUtils.isEmpty(CoreModule.f18264c.f20387g0.m32865Z6())) {
            this.f174378c.setText(CoreModule.f18264c.f20387g0.m32865Z6());
        }
        bnl0.m105509E0(this.f174377b, new View.OnClickListener() { // from class: l.shk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168717a.m191252v(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f174380e;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m191254n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m191254n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20320b.m191261c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qhk qhkVar) {
        this.f174381f = qhkVar;
    }

    /* JADX INFO: renamed from: q */
    public boolean m191256q(Menu menu) {
        this.f174380e.getMenuInflater().inflate(nfc0.f141722b, menu);
        this.f174382g = (VText) menu.findItem(edc0.f93388j2).getActionView().findViewById(edc0.f93384i5);
        boolean zM158352c = mgk.m158352c(this.f174384i);
        VText vText = this.f174382g;
        if (zM158352c) {
            mgk.m158355f(new eik.C16780b(vText, this.f174376a, this.f174377b), this.f174384i.inModeration.name);
            return true;
        }
        vText.setEnabled(m191251s());
        bnl0.m105509E0(this.f174382g, new View.OnClickListener() { // from class: l.rhk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163181a.m191257u(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m191257u(View view) {
        this.f174380e.hideInput(this.f174376a);
        this.f174381f.m176592q0(this.f174376a.getText().toString().trim());
    }

    /* JADX INFO: renamed from: w */
    public void m191258w(ChatGroup chatGroup) {
        this.f174384i = chatGroup;
        if (mgk.m158352c(chatGroup)) {
            mgk.m158355f(new eik.C16780b(this.f174382g, this.f174376a, this.f174377b), chatGroup.inModeration.name);
            return;
        }
        this.f174376a.setText(chatGroup.name);
        VEditText vEditText = this.f174376a;
        vEditText.setSelection(vEditText.getText().length());
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.thk$a */
    public class C20319a implements TextWatcher {
        public C20319a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            thk.this.f174379d.setText(String.format("%1$s/%2$s", Integer.valueOf(string.length()), 15));
            if (mgk.m158352c(thk.this.f174384i)) {
                return;
            }
            bnl0.m105524M(thk.this.f174377b, !TextUtils.isEmpty(string));
            if (NullChecker.m82486a(thk.this.f174382g)) {
                thk.this.f174382g.setEnabled(thk.this.m191251s());
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
