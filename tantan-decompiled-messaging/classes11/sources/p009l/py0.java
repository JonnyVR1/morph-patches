package p009l;

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
import com.p000p1.mobile.putong.core.newui.appeal.AppealAct;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.AppealMaterial;
import com.tantanapp.common.utils.NullChecker;
import l.lsi0;
import l.o6j0;
import l.qy0;
import l.s7m;
import l.xdl0;
import v.VButton_FakeShadow;
import v.VEditText;
import v.VMaterialEdit;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class py0 implements s7m<iy0> {

    /* JADX INFO: renamed from: a */
    public VEditText f18952a;

    /* JADX INFO: renamed from: b */
    public VText f18953b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f18954c;

    /* JADX INFO: renamed from: d */
    public VMaterialEdit f18955d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f18956e;

    /* JADX INFO: renamed from: f */
    public AppealAct f18957f;

    /* JADX INFO: renamed from: g */
    public iy0 f18958g;

    /* JADX INFO: renamed from: h */
    public String f18959h = "";

    /* JADX INFO: renamed from: i */
    public cy0 f18960i = new cy0(this);

    /* JADX INFO: renamed from: j */
    public LinearLayoutManager f18961j;

    public py0(AppealAct appealAct) {
        this.f18957f = appealAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m20755j(View view) {
        if (TextUtils.isEmpty(this.f18959h)) {
            lsi0.h(R.string.nq);
            return;
        }
        o6j0.c("e_p_appeal_reason_next", this.f18957f.pageId(), new o6j0.a[]{o6j0.a.h("appeal_type", this.f18957f.m67a2())});
        AppealMaterial appealMaterialNew_ = AppealMaterial.new_();
        appealMaterialNew_.text = this.f18959h;
        appealMaterialNew_.contact = this.f18955d.getText().toString().trim();
        this.f18958g.m16801p0(appealMaterialNew_);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20756C0() {
        return this.f18957f;
    }

    /* JADX INFO: renamed from: c */
    public View m20757c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qy0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m20758d() {
        qy0.c(this);
    }

    public void destroy() {
        m20758d();
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f18957f;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m20762i1(iy0 iy0Var) {
        this.f18958g = iy0Var;
    }

    /* JADX INFO: renamed from: i */
    public int m20761i() {
        return 4;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20757c(layoutInflater, viewGroup);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public LinearLayoutManager m20763k() {
        if (NullChecker.a(this.f18961j)) {
            return this.f18961j;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act(), 0, false);
        this.f18961j = linearLayoutManager;
        return linearLayoutManager;
    }

    /* JADX INFO: renamed from: l */
    public iy0 m20764l() {
        return this.f18958g;
    }

    /* JADX INFO: renamed from: m */
    public final void m20765m() {
        String strTrim = this.f18952a.getText().toString().trim();
        this.f18959h = strTrim;
        this.f18956e.setActivated(TextUtils.isEmpty(strTrim));
        this.f18953b.setText(String.valueOf(TextUtils.isEmpty(this.f18959h) ? 120 : 120 - this.f18959h.length()));
    }

    /* JADX INFO: renamed from: n */
    public void m20766n() {
        this.f18960i.notifyDataSetChanged();
        m20763k().scrollToPosition(this.f18960i.getItemCount() - 1);
    }

    /* JADX INFO: renamed from: r */
    public void m20767r() {
        this.f18957f.setTitle(R.string.h0);
        this.f18952a.addTextChangedListener(new C1133a());
        m20765m();
        this.f18954c.setLayoutManager(m20763k());
        this.f18954c.setAdapter(this.f18960i);
        m20763k().scrollToPosition(this.f18960i.getItemCount() - 1);
        xdl0.E0(this.f18956e, new View.OnClickListener() { // from class: l.oy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18287a.m20755j(view);
            }
        });
    }

    /* JADX INFO: renamed from: l.py0$a */
    public class C1133a implements TextWatcher {
        public C1133a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            py0.this.m20765m();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
