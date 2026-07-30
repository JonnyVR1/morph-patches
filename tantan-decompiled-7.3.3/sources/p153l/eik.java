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
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupNicknameSetAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class eik implements iam<bik> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f94167a;

    /* JADX INFO: renamed from: b */
    public VEditText f94168b;

    /* JADX INFO: renamed from: c */
    public VImage f94169c;

    /* JADX INFO: renamed from: d */
    public VText f94170d;

    /* JADX INFO: renamed from: e */
    public GroupNicknameSetAct f94171e;

    /* JADX INFO: renamed from: f */
    public bik f94172f;

    /* JADX INFO: renamed from: g */
    public VText f94173g;

    /* JADX INFO: renamed from: h */
    public String f94174h;

    /* JADX INFO: renamed from: i */
    public ChatGroupMember f94175i;

    /* JADX INFO: renamed from: l.eik$b */
    public static class C16780b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public VText f94177a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public VEditText f94178b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public VImage f94179c;

        public C16780b(VText vText, VEditText vEditText, VImage vImage) {
            this.f94177a = vText;
            this.f94178b = vEditText;
            this.f94179c = vImage;
        }
    }

    /* JADX INFO: renamed from: l.eik$c */
    public static class C16781c {
        /* JADX INFO: renamed from: b */
        public static void m120934b(eik eikVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            eikVar.f94167a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            eikVar.f94168b = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            eikVar.f94169c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            eikVar.f94170d = (VText) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m120935c(eik eikVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157107r0, viewGroup, false);
            m120934b(eikVar, viewInflate);
            return viewInflate;
        }
    }

    public eik(GroupNicknameSetAct groupNicknameSetAct) {
        this.f94171e = groupNicknameSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m120925s() {
        String strTrim = this.f94168b.getText().toString().trim();
        return (TextUtils.isEmpty(strTrim) || TextUtils.equals(strTrim, this.f94174h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m120926u(View view) {
        this.f94171e.hideInput(this.f94168b);
        this.f94172f.m104479q0(this.f94168b.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m120927v(View view) {
        this.f94168b.setText("");
    }

    /* JADX INFO: renamed from: A3 */
    public void m120928A3(String str) {
        this.f94174h = str;
        this.f94168b.setText(str);
        this.f94168b.addTextChangedListener(new C16779a());
        bnl0.m105509E0(this.f94169c, new View.OnClickListener() { // from class: l.dik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88663a.m120927v(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f94171e;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m120929n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m120929n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16781c.m120935c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bik bikVar) {
        this.f94172f = bikVar;
    }

    /* JADX INFO: renamed from: q */
    public boolean m120931q(Menu menu) {
        this.f94171e.getMenuInflater().inflate(nfc0.f141722b, menu);
        this.f94173g = (VText) menu.findItem(edc0.f93388j2).getActionView().findViewById(edc0.f93384i5);
        boolean zM158354e = mgk.m158354e(this.f94175i);
        VText vText = this.f94173g;
        if (zM158354e) {
            mgk.m158355f(new C16780b(vText, this.f94168b, this.f94169c), this.f94175i.inModeration.nickName);
            return true;
        }
        vText.setEnabled(m120925s());
        bnl0.m105509E0(this.f94173g, new View.OnClickListener() { // from class: l.cik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81965a.m120926u(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m120932w(ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        this.f94175i = chatGroupMember;
        if (jek.m144587s(chatGroup)) {
            uqb0.f180374G.m127140Z0(this.f94167a, jek.m144578j(chatGroupMember));
        } else {
            uqb0.f180374G.m127140Z0(this.f94167a, chatGroupMember.avatar);
        }
        if (mgk.m158354e(chatGroupMember)) {
            mgk.m158355f(new C16780b(this.f94173g, this.f94168b, this.f94169c), chatGroupMember.inModeration.nickName);
            return;
        }
        this.f94168b.setText(chatGroupMember.groupMemberName());
        VEditText vEditText = this.f94168b;
        vEditText.setSelection(vEditText.getText().length());
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.eik$a */
    public class C16779a implements TextWatcher {
        public C16779a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            eik.this.f94170d.setText(String.format("%1$s/%2$s", Integer.valueOf(string.length()), 15));
            if (mgk.m158354e(eik.this.f94175i)) {
                return;
            }
            bnl0.m105524M(eik.this.f94169c, !TextUtils.isEmpty(string));
            if (NullChecker.m82486a(eik.this.f94173g)) {
                eik.this.f94173g.setEnabled(eik.this.m120925s());
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
