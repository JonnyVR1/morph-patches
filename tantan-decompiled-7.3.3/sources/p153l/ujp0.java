package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class ujp0 implements iam<akp0>, TextWatcher {

    /* JADX INFO: renamed from: n */
    public static int f179308n = 15;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f179309a;

    /* JADX INFO: renamed from: b */
    public View f179310b;

    /* JADX INFO: renamed from: c */
    public View f179311c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f179312d;

    /* JADX INFO: renamed from: e */
    public VLinear f179313e;

    /* JADX INFO: renamed from: f */
    public ImageView f179314f;

    /* JADX INFO: renamed from: g */
    public VText f179315g;

    /* JADX INFO: renamed from: h */
    public TextView f179316h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f179317i;

    /* JADX INFO: renamed from: j */
    public VEditText f179318j;

    /* JADX INFO: renamed from: k */
    public TextView f179319k;

    /* JADX INFO: renamed from: l */
    public akp0 f179320l;

    /* JADX INFO: renamed from: m */
    public c0s f179321m;

    /* JADX INFO: renamed from: B */
    private void m196421B() {
        this.f179310b.setOnClickListener(new View.OnClickListener() { // from class: l.qjp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158026a.m196430v(view);
            }
        });
        bnl0.m105509E0(this.f179314f, new View.OnClickListener() { // from class: l.rjp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163496a.m196431w(view);
            }
        });
        bnl0.m105509E0(this.f179316h, new View.OnClickListener() { // from class: l.sjp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169131a.m196432x(view);
            }
        });
        m196441s();
    }

    /* JADX INFO: renamed from: k */
    private void m196427k() {
        c0s c0sVar = this.f179321m;
        if (c0sVar == null || !c0sVar.isShowing()) {
            return;
        }
        akp0 akp0Var = this.f179320l;
        if (akp0Var != null && akp0Var.act() != null) {
            this.f179320l.act().hideInput(this.f179309a);
        }
        this.f179321m.dismiss();
    }

    /* JADX INFO: renamed from: m */
    private String m196428m(String str) {
        return str == null ? "" : str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: q */
    private void m196429q() {
        if (this.f179321m == null) {
            this.f179321m = new c0s(this.f179320l, jgc0.f120700g, m196435f(act().inflater(), null));
            m196421B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m196430v(View view) {
        m196427k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m196431w(View view) {
        m196427k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m196432x(View view) {
        m196434C();
    }

    /* JADX INFO: renamed from: A */
    public final void m196433A(moo0 moo0Var) {
        String strM196439n = m196439n(moo0Var);
        if (!TextUtils.isEmpty(strM196439n)) {
            this.f179318j.setText(strM196439n);
            this.f179318j.setSelection(strM196439n.length());
        }
        this.f179318j.requestFocus();
        l51.m152888H(act(), new Runnable() { // from class: l.pjp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152729a.m196442u();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: C */
    public final void m196434C() {
        if (m196428m(m196440p()).length() == 0) {
            o1j0.m165651y("请填写群名称");
        } else {
            this.f179320l.m98586O3(m196440p());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f179320l.act();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f179320l.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == null) {
            m196437j(false);
            this.f179319k.setText("0/15");
            return;
        }
        int length = m196440p().length();
        m196437j(length != 0);
        int i = f179308n;
        TextView textView = this.f179319k;
        if (length >= i) {
            textView.setText("15/15");
            return;
        }
        textView.setText(length + "/15");
    }

    @Override // p153l.iam
    public void destroy() {
        m196427k();
    }

    /* JADX INFO: renamed from: f */
    public View m196435f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bkp0.m104839b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(akp0 akp0Var) {
        this.f179320l = akp0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m196437j(boolean z) {
        TextView textView = this.f179316h;
        if (z) {
            textView.setTextColor(n3d0.m161277a(n9c0.f140855p0));
            bnl0.m105591y(this.f179316h, true);
        } else {
            textView.setTextColor(n3d0.m161277a(n9c0.f140838j1));
            bnl0.m105591y(this.f179316h, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m196438l() {
        o1j0.m165651y(xau.m209911u(R$string.f47543G6, Integer.valueOf(f179308n)));
    }

    /* JADX INFO: renamed from: n */
    public final String m196439n(moo0 moo0Var) {
        String str;
        if (TextUtils.equals(moo0Var.getType(), "title")) {
            str = moo0Var.getRoomInfo().voiceRoomProfile.title;
        } else {
            str = TextUtils.equals(moo0Var.getType(), "notice") ? moo0Var.getRoomInfo().voiceRoomProfile.announcement : "";
        }
        int length = str.length();
        int i = f179308n;
        return length > i ? str.substring(0, i) : str;
    }

    /* JADX INFO: renamed from: p */
    public String m196440p() {
        return m196428m(this.f179318j.getText().toString().trim());
    }

    /* JADX INFO: renamed from: s */
    public final void m196441s() {
        this.f179318j.setFilters(new InputFilter[]{new qcr(f179308n * 2, new x20() { // from class: l.tjp0
            @Override // p153l.x20
            public final void call() {
                this.f174603a.m196438l();
            }
        })});
        this.f179318j.addTextChangedListener(this);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m196442u() {
        this.f179320l.act().showInput(this.f179318j, 0);
    }

    /* JADX INFO: renamed from: y */
    public void m196443y() {
        this.f179321m.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public void m196444z(moo0 moo0Var) {
        m196429q();
        this.f179321m.show();
        m196433A(moo0Var);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
