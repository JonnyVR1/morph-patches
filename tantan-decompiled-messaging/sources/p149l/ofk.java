package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupNicknameSetAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ofk implements s7m<lfk> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f143702a;

    /* JADX INFO: renamed from: b */
    public VEditText f143703b;

    /* JADX INFO: renamed from: c */
    public VImage f143704c;

    /* JADX INFO: renamed from: d */
    public VText f143705d;

    /* JADX INFO: renamed from: e */
    public GroupNicknameSetAct f143706e;

    /* JADX INFO: renamed from: f */
    public lfk f143707f;

    /* JADX INFO: renamed from: g */
    public VText f143708g;

    /* JADX INFO: renamed from: h */
    public String f143709h;

    /* JADX INFO: renamed from: i */
    public ChatGroupMember f143710i;

    /* JADX INFO: renamed from: l.ofk$b */
    public static class C18924b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public VText f143712a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public VEditText f143713b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public VImage f143714c;

        public C18924b(VText vText, VEditText vEditText, VImage vImage) {
            this.f143712a = vText;
            this.f143713b = vEditText;
            this.f143714c = vImage;
        }
    }

    /* JADX INFO: renamed from: l.ofk$c */
    public static class C18925c {
        /* JADX INFO: renamed from: b */
        public static void m164093b(ofk ofkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            ofkVar.f143702a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            ofkVar.f143703b = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            ofkVar.f143704c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            ofkVar.f143705d = (VText) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m164094c(ofk ofkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126551r0, viewGroup, false);
            m164093b(ofkVar, viewInflate);
            return viewInflate;
        }
    }

    public ofk(GroupNicknameSetAct groupNicknameSetAct) {
        this.f143706e = groupNicknameSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m164084s() {
        String strTrim = this.f143703b.getText().toString().trim();
        return (TextUtils.isEmpty(strTrim) || TextUtils.equals(strTrim, this.f143709h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m164085u(View view) {
        this.f143706e.hideInput(this.f143703b);
        this.f143707f.m149723q0(this.f143703b.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m164086v(View view) {
        this.f143703b.setText("");
    }

    /* JADX INFO: renamed from: A3 */
    public void m164087A3(String str) {
        this.f143709h = str;
        this.f143703b.setText(str);
        this.f143703b.addTextChangedListener(new C18923a());
        xdl0.m208329E0(this.f143704c, new View.OnClickListener() { // from class: l.nfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138801a.m164086v(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143706e;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m164088n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m164088n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18925c.m164094c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lfk lfkVar) {
        this.f143707f = lfkVar;
    }

    /* JADX INFO: renamed from: q */
    public boolean m164090q(Menu menu) {
        this.f143706e.getMenuInflater().inflate(j7c0.f116586b, menu);
        this.f143708g = (VText) menu.findItem(y4c0.f196153j2).getActionView().findViewById(y4c0.f196149i5);
        boolean zM202745e = wdk.m202745e(this.f143710i);
        VText vText = this.f143708g;
        if (zM202745e) {
            wdk.m202746f(new C18924b(vText, this.f143703b, this.f143704c), this.f143710i.inModeration.nickName);
            return true;
        }
        vText.setEnabled(m164084s());
        xdl0.m208329E0(this.f143708g, new View.OnClickListener() { // from class: l.mfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133598a.m164085u(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m164091w(ChatGroup chatGroup, ChatGroupMember chatGroupMember) {
        this.f143710i = chatGroupMember;
        if (tbk.m187872s(chatGroup)) {
            qib0.f154691G.m102356Z0(this.f143702a, tbk.m187863j(chatGroupMember));
        } else {
            qib0.f154691G.m102356Z0(this.f143702a, chatGroupMember.avatar);
        }
        if (wdk.m202745e(chatGroupMember)) {
            wdk.m202746f(new C18924b(this.f143708g, this.f143703b, this.f143704c), chatGroupMember.inModeration.nickName);
            return;
        }
        this.f143703b.setText(chatGroupMember.groupMemberName());
        VEditText vEditText = this.f143703b;
        vEditText.setSelection(vEditText.getText().length());
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ofk$a */
    public class C18923a implements TextWatcher {
        public C18923a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            ofk.this.f143705d.setText(String.format("%1$s/%2$s", Integer.valueOf(string.length()), 15));
            if (wdk.m202745e(ofk.this.f143710i)) {
                return;
            }
            xdl0.m208344M(ofk.this.f143704c, !TextUtils.isEmpty(string));
            if (NullChecker.m81303a(ofk.this.f143708g)) {
                ofk.this.f143708g.setEnabled(ofk.this.m164084s());
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
