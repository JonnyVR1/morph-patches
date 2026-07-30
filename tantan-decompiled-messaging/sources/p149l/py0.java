package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p046p1.mobile.putong.data.AppealMaterial;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadow;
import p147v.VEditText;
import p147v.VMaterialEdit;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class py0 implements s7m<iy0> {

    /* JADX INFO: renamed from: a */
    public VEditText f151743a;

    /* JADX INFO: renamed from: b */
    public VText f151744b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f151745c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f151746d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f151747e;

    /* JADX INFO: renamed from: f */
    public AppealAct f151748f;

    /* JADX INFO: renamed from: g */
    public iy0 f151749g;

    /* JADX INFO: renamed from: h */
    public String f151750h = "";

    /* JADX INFO: renamed from: i */
    public cy0 f151751i = new cy0(this);

    /* JADX INFO: renamed from: j */
    public LinearLayoutManager f151752j;

    public py0(AppealAct appealAct) {
        this.f151748f = appealAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m171974j(View view) {
        if (TextUtils.isEmpty(this.f151750h)) {
            lsi0.m151578h(R$string.f18773nq);
            return;
        }
        o6j0.m162859c("e_p_appeal_reason_next", this.f151748f.pageId(), o6j0.C18854a.m162878h("appeal_type", this.f151748f.m36168a2()));
        AppealMaterial appealMaterialNew_ = AppealMaterial.new_();
        appealMaterialNew_.text = this.f151750h;
        appealMaterialNew_.contact = this.f151746d.getText().toString().trim();
        this.f151749g.m138912p0(appealMaterialNew_);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151748f;
    }

    /* JADX INFO: renamed from: c */
    public View m171975c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qy0.m177019b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m171976d() {
        qy0.m177020c(this);
    }

    @Override // p149l.s7m
    public void destroy() {
        m171976d();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f151748f;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(iy0 iy0Var) {
        this.f151749g = iy0Var;
    }

    /* JADX INFO: renamed from: i */
    public int m171979i() {
        return 4;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m171975c(layoutInflater, viewGroup);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public LinearLayoutManager m171980k() {
        if (NullChecker.m81303a(this.f151752j)) {
            return this.f151752j;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getAct(), 0, false);
        this.f151752j = linearLayoutManager;
        return linearLayoutManager;
    }

    /* JADX INFO: renamed from: l */
    public iy0 m171981l() {
        return this.f151749g;
    }

    /* JADX INFO: renamed from: m */
    public final void m171982m() {
        String strTrim = this.f151743a.getText().toString().trim();
        this.f151750h = strTrim;
        this.f151747e.setActivated(TextUtils.isEmpty(strTrim));
        this.f151744b.setText(String.valueOf(TextUtils.isEmpty(this.f151750h) ? 120 : 120 - this.f151750h.length()));
    }

    /* JADX INFO: renamed from: n */
    public void m171983n() {
        this.f151751i.notifyDataSetChanged();
        m171980k().scrollToPosition(this.f151751i.getItemCount() - 1);
    }

    /* JADX INFO: renamed from: r */
    public void m171984r() {
        this.f151748f.setTitle(R$string.f18563h0);
        this.f151743a.addTextChangedListener(new C19364a());
        m171982m();
        this.f151745c.setLayoutManager(m171980k());
        this.f151745c.setAdapter(this.f151751i);
        m171980k().scrollToPosition(this.f151751i.getItemCount() - 1);
        xdl0.m208329E0(this.f151747e, new View.OnClickListener() { // from class: l.oy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146267a.m171974j(view);
            }
        });
    }

    /* JADX INFO: renamed from: l.py0$a */
    public class C19364a implements TextWatcher {
        public C19364a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            py0.this.m171982m();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
