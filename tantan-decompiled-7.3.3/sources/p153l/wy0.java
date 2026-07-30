package p153l;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p051p1.mobile.putong.data.AppealMaterial;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadow;
import p151v.VEditText;
import p151v.VMaterialEdit;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class wy0 implements iam<py0> {

    /* JADX INFO: renamed from: a */
    public VEditText f191553a;

    /* JADX INFO: renamed from: b */
    public VText f191554b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f191555c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f191556d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f191557e;

    /* JADX INFO: renamed from: f */
    public AppealAct f191558f;

    /* JADX INFO: renamed from: g */
    public py0 f191559g;

    /* JADX INFO: renamed from: h */
    public String f191560h = "";

    /* JADX INFO: renamed from: i */
    public jy0 f191561i = new jy0(this);

    /* JADX INFO: renamed from: j */
    public LinearLayoutManager f191562j;

    public wy0(AppealAct appealAct) {
        this.f191558f = appealAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m208466j(View view) {
        if (TextUtils.isEmpty(this.f191560h)) {
            o1j0.m165634h(R$string.f18560Iq);
            return;
        }
        sfj0.m185596c("e_p_appeal_reason_next", this.f191558f.pageId(), sfj0.C20032a.m185615h("appeal_type", this.f191558f.m37171b2()));
        AppealMaterial appealMaterialNew_ = AppealMaterial.new_();
        appealMaterialNew_.text = this.f191560h;
        appealMaterialNew_.contact = this.f191556d.getText().toString().trim();
        this.f191559g.m174268p0(appealMaterialNew_);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f191558f;
    }

    /* JADX INFO: renamed from: c */
    public View m208467c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xy0.m213599b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m208468d() {
        xy0.m213600c(this);
    }

    @Override // p153l.iam
    public void destroy() {
        m208468d();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f191558f;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(py0 py0Var) {
        this.f191559g = py0Var;
    }

    /* JADX INFO: renamed from: i */
    public int m208471i() {
        return 4;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m208467c(layoutInflater, viewGroup);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public LinearLayoutManager m208472k() {
        if (NullChecker.m82486a(this.f191562j)) {
            return this.f191562j;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getAct(), 0, false);
        this.f191562j = linearLayoutManager;
        return linearLayoutManager;
    }

    /* JADX INFO: renamed from: l */
    public py0 m208473l() {
        return this.f191559g;
    }

    /* JADX INFO: renamed from: m */
    public final void m208474m() {
        String strTrim = this.f191553a.getText().toString().trim();
        this.f191560h = strTrim;
        this.f191557e.setActivated(TextUtils.isEmpty(strTrim));
        this.f191554b.setText(String.valueOf(TextUtils.isEmpty(this.f191560h) ? 120 : 120 - this.f191560h.length()));
    }

    /* JADX INFO: renamed from: n */
    public void m208475n() {
        this.f191561i.notifyDataSetChanged();
        m208472k().scrollToPosition(this.f191561i.getItemCount() - 1);
    }

    /* JADX INFO: renamed from: r */
    public void m208476r() {
        this.f191558f.setTitle(R$string.f19293h0);
        this.f191553a.addTextChangedListener(new C21203a());
        m208474m();
        this.f191555c.setLayoutManager(m208472k());
        this.f191555c.setAdapter(this.f191561i);
        m208472k().scrollToPosition(this.f191561i.getItemCount() - 1);
        bnl0.m105509E0(this.f191557e, new View.OnClickListener() { // from class: l.vy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186315a.m208466j(view);
            }
        });
    }

    /* JADX INFO: renamed from: l.wy0$a */
    public class C21203a implements TextWatcher {
        public C21203a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            wy0.this.m208474m();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
