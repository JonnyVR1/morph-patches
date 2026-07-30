package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class qap0 implements s7m<wap0>, TextWatcher {

    /* JADX INFO: renamed from: n */
    public static int f153551n = 15;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f153552a;

    /* JADX INFO: renamed from: b */
    public View f153553b;

    /* JADX INFO: renamed from: c */
    public View f153554c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f153555d;

    /* JADX INFO: renamed from: e */
    public VLinear f153556e;

    /* JADX INFO: renamed from: f */
    public ImageView f153557f;

    /* JADX INFO: renamed from: g */
    public VText f153558g;

    /* JADX INFO: renamed from: h */
    public TextView f153559h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f153560i;

    /* JADX INFO: renamed from: j */
    public VEditText f153561j;

    /* JADX INFO: renamed from: k */
    public TextView f153562k;

    /* JADX INFO: renamed from: l */
    public wap0 f153563l;

    /* JADX INFO: renamed from: m */
    public byr f153564m;

    /* JADX INFO: renamed from: B */
    private void m173746B() {
        this.f153553b.setOnClickListener(new View.OnClickListener() { // from class: l.map0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132945a.m173755v(view);
            }
        });
        xdl0.m208329E0(this.f153557f, new View.OnClickListener() { // from class: l.nap0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137927a.m173756w(view);
            }
        });
        xdl0.m208329E0(this.f153559h, new View.OnClickListener() { // from class: l.oap0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142856a.m173757x(view);
            }
        });
        m173766s();
    }

    /* JADX INFO: renamed from: k */
    private void m173752k() {
        byr byrVar = this.f153564m;
        if (byrVar == null || !byrVar.isShowing()) {
            return;
        }
        wap0 wap0Var = this.f153563l;
        if (wap0Var != null && wap0Var.act() != null) {
            this.f153563l.act().hideInput(this.f153552a);
        }
        this.f153564m.dismiss();
    }

    /* JADX INFO: renamed from: m */
    private String m173753m(String str) {
        return str == null ? "" : str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: q */
    private void m173754q() {
        if (this.f153564m == null) {
            this.f153564m = new byr(this.f153563l, d8c0.f84852g, m173760f(act().inflater(), null));
            m173746B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m173755v(View view) {
        m173752k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m173756w(View view) {
        m173752k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m173757x(View view) {
        m173759C();
    }

    /* JADX INFO: renamed from: A */
    public final void m173758A(ifo0 ifo0Var) {
        String strM173764n = m173764n(ifo0Var);
        if (!TextUtils.isEmpty(strM173764n)) {
            this.f153561j.setText(strM173764n);
            this.f153561j.setSelection(strM173764n.length());
        }
        this.f153561j.requestFocus();
        e51.m114743H(act(), new Runnable() { // from class: l.lap0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127233a.m173767u();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: C */
    public final void m173759C() {
        if (m173753m(m173765p()).length() == 0) {
            lsi0.m151595y("请填写群名称");
        } else {
            this.f153563l.m202454O3(m173765p());
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f153563l.act();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f153563l.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == null) {
            m173762j(false);
            this.f153562k.setText("0/15");
            return;
        }
        int length = m173765p().length();
        m173762j(length != 0);
        int i = f153551n;
        TextView textView = this.f153562k;
        if (length >= i) {
            textView.setText("15/15");
            return;
        }
        textView.setText(length + "/15");
    }

    @Override // p149l.s7m
    public void destroy() {
        m173752k();
    }

    /* JADX INFO: renamed from: f */
    public View m173760f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xap0.m207664b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wap0 wap0Var) {
        this.f153563l = wap0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m173762j(boolean z) {
        TextView textView = this.f153559h;
        if (z) {
            textView.setTextColor(kvc0.m147352a(h1c0.f105394p0));
            xdl0.m208411y(this.f153559h, true);
        } else {
            textView.setTextColor(kvc0.m147352a(h1c0.f105377j1));
            xdl0.m208411y(this.f153559h, false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m173763l() {
        lsi0.m151595y(w8u.m202218u(R$string.f46695G6, Integer.valueOf(f153551n)));
    }

    /* JADX INFO: renamed from: n */
    public final String m173764n(ifo0 ifo0Var) {
        String str;
        if (TextUtils.equals(ifo0Var.getType(), "title")) {
            str = ifo0Var.getRoomInfo().voiceRoomProfile.title;
        } else {
            str = TextUtils.equals(ifo0Var.getType(), "notice") ? ifo0Var.getRoomInfo().voiceRoomProfile.announcement : "";
        }
        int length = str.length();
        int i = f153551n;
        return length > i ? str.substring(0, i) : str;
    }

    /* JADX INFO: renamed from: p */
    public String m173765p() {
        return m173753m(this.f153561j.getText().toString().trim());
    }

    /* JADX INFO: renamed from: s */
    public final void m173766s() {
        this.f153561j.setFilters(new InputFilter[]{new oar(f153551n * 2, new d30() { // from class: l.pap0
            @Override // p149l.d30
            public final void call() {
                this.f147996a.m173763l();
            }
        })});
        this.f153561j.addTextChangedListener(this);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m173767u() {
        this.f153563l.act().showInput(this.f153561j, 0);
    }

    /* JADX INFO: renamed from: y */
    public void m173768y() {
        this.f153564m.dismiss();
    }

    /* JADX INFO: renamed from: z */
    public void m173769z(ifo0 ifo0Var) {
        m173754q();
        this.f153564m.show();
        m173758A(ifo0Var);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
