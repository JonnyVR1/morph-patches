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
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupDescriptionEditAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class odk implements s7m<mdk> {

    /* JADX INFO: renamed from: a */
    public VEditText f143209a;

    /* JADX INFO: renamed from: b */
    public VText f143210b;

    /* JADX INFO: renamed from: c */
    public VText f143211c;

    /* JADX INFO: renamed from: d */
    public GroupDescriptionEditAct f143212d;

    /* JADX INFO: renamed from: e */
    public mdk f143213e;

    /* JADX INFO: renamed from: f */
    public VText f143214f;

    /* JADX INFO: renamed from: g */
    public String f143215g;

    /* JADX INFO: renamed from: h */
    public ChatGroup f143216h;

    /* JADX INFO: renamed from: l.odk$b */
    public static class C18898b {
        /* JADX INFO: renamed from: b */
        public static void m163685b(odk odkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            odkVar.f143209a = (VEditText) viewGroup.getChildAt(0);
            odkVar.f143210b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            odkVar.f143211c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m163686c(odk odkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126509l0, viewGroup, false);
            m163685b(odkVar, viewInflate);
            return viewInflate;
        }
    }

    public odk(GroupDescriptionEditAct groupDescriptionEditAct) {
        this.f143212d = groupDescriptionEditAct;
    }

    /* JADX INFO: renamed from: A3 */
    public void m163677A3(String str) {
        this.f143215g = str;
        this.f143209a.setText(str);
        this.f143209a.addTextChangedListener(new C18897a());
        if (TextUtils.isEmpty(CoreModule.f17545c.f19645g0.m31835Q6())) {
            return;
        }
        this.f143210b.setText(CoreModule.f17545c.f19645g0.m31835Q6());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f143212d;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m163678k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m163678k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18898b.m163686c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mdk mdkVar) {
        this.f143213e = mdkVar;
    }

    /* JADX INFO: renamed from: m */
    public boolean m163680m(Menu menu) {
        this.f143212d.getMenuInflater().inflate(j7c0.f116586b, menu);
        this.f143214f = (VText) menu.findItem(y4c0.f196153j2).getActionView().findViewById(y4c0.f196149i5);
        boolean zM202742b = wdk.m202742b(this.f143216h);
        VText vText = this.f143214f;
        if (zM202742b) {
            wdk.m202746f(new ofk.C18924b(vText, this.f143209a, null), this.f143216h.inModeration.description);
            return true;
        }
        vText.setEnabled(m163681n());
        xdl0.m208329E0(this.f143214f, new View.OnClickListener() { // from class: l.ndk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138288a.m163682p(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m163681n() {
        String strTrim = this.f143209a.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return false;
        }
        return !TextUtils.equals(strTrim, this.f143215g);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m163682p(View view) {
        this.f143212d.hideInput(this.f143209a);
        this.f143213e.m154101q0(this.f143209a.getText().toString().trim());
    }

    /* JADX INFO: renamed from: q */
    public void m163683q(ChatGroup chatGroup) {
        this.f143216h = chatGroup;
        if (wdk.m202742b(chatGroup)) {
            wdk.m202746f(new ofk.C18924b(this.f143214f, this.f143209a, null), chatGroup.inModeration.description);
            return;
        }
        this.f143209a.setText(chatGroup.description);
        VEditText vEditText = this.f143209a;
        vEditText.setSelection(vEditText.getText().length());
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.odk$a */
    public class C18897a implements TextWatcher {
        public C18897a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            odk.this.f143211c.setText(String.format("%1$s/%2$s", Integer.valueOf(editable.toString().length()), 300));
            if (!wdk.m202742b(odk.this.f143216h) && NullChecker.m81303a(odk.this.f143214f)) {
                odk.this.f143214f.setEnabled(odk.this.m163681n());
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
