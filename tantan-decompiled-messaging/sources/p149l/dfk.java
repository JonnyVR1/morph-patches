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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupNameEditAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class dfk implements s7m<afk> {

    /* JADX INFO: renamed from: a */
    public VEditText f85953a;

    /* JADX INFO: renamed from: b */
    public VImage f85954b;

    /* JADX INFO: renamed from: c */
    public VText f85955c;

    /* JADX INFO: renamed from: d */
    public VText f85956d;

    /* JADX INFO: renamed from: e */
    public GroupNameEditAct f85957e;

    /* JADX INFO: renamed from: f */
    public afk f85958f;

    /* JADX INFO: renamed from: g */
    public VText f85959g;

    /* JADX INFO: renamed from: h */
    public String f85960h;

    /* JADX INFO: renamed from: i */
    public ChatGroup f85961i;

    /* JADX INFO: renamed from: l.dfk$b */
    public static class C16349b {
        /* JADX INFO: renamed from: b */
        public static void m111492b(dfk dfkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            dfkVar.f85953a = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            dfkVar.f85954b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            dfkVar.f85955c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            dfkVar.f85956d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m111493c(dfk dfkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126544q0, viewGroup, false);
            m111492b(dfkVar, viewInflate);
            return viewInflate;
        }
    }

    public dfk(GroupNameEditAct groupNameEditAct) {
        this.f85957e = groupNameEditAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m111483s() {
        String strTrim = this.f85953a.getText().toString().trim();
        return (TextUtils.isEmpty(strTrim) || TextUtils.equals(strTrim, this.f85960h)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m111484v(View view) {
        this.f85953a.setText("");
    }

    /* JADX INFO: renamed from: A3 */
    public void m111485A3(String str) {
        this.f85960h = str;
        this.f85953a.setText(str);
        this.f85953a.addTextChangedListener(new C16348a());
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19645g0.m31862Z6())) {
            this.f85955c.setText(CoreModule.f17545c.f19645g0.m31862Z6());
        }
        xdl0.m208329E0(this.f85954b, new View.OnClickListener() { // from class: l.cfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80632a.m111484v(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f85957e;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m111486n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m111486n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16349b.m111493c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(afk afkVar) {
        this.f85958f = afkVar;
    }

    /* JADX INFO: renamed from: q */
    public boolean m111488q(Menu menu) {
        this.f85957e.getMenuInflater().inflate(j7c0.f116586b, menu);
        this.f85959g = (VText) menu.findItem(y4c0.f196153j2).getActionView().findViewById(y4c0.f196149i5);
        boolean zM202743c = wdk.m202743c(this.f85961i);
        VText vText = this.f85959g;
        if (zM202743c) {
            wdk.m202746f(new ofk.C18924b(vText, this.f85953a, this.f85954b), this.f85961i.inModeration.name);
            return true;
        }
        vText.setEnabled(m111483s());
        xdl0.m208329E0(this.f85959g, new View.OnClickListener() { // from class: l.bfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75325a.m111489u(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m111489u(View view) {
        this.f85957e.hideInput(this.f85953a);
        this.f85958f.m96241q0(this.f85953a.getText().toString().trim());
    }

    /* JADX INFO: renamed from: w */
    public void m111490w(ChatGroup chatGroup) {
        this.f85961i = chatGroup;
        if (wdk.m202743c(chatGroup)) {
            wdk.m202746f(new ofk.C18924b(this.f85959g, this.f85953a, this.f85954b), chatGroup.inModeration.name);
            return;
        }
        this.f85953a.setText(chatGroup.name);
        VEditText vEditText = this.f85953a;
        vEditText.setSelection(vEditText.getText().length());
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.dfk$a */
    public class C16348a implements TextWatcher {
        public C16348a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            dfk.this.f85956d.setText(String.format("%1$s/%2$s", Integer.valueOf(string.length()), 15));
            if (wdk.m202743c(dfk.this.f85961i)) {
                return;
            }
            xdl0.m208344M(dfk.this.f85954b, !TextUtils.isEmpty(string));
            if (NullChecker.m81303a(dfk.this.f85959g)) {
                dfk.this.f85959g.setEnabled(dfk.this.m111483s());
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
