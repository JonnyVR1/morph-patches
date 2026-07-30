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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.base.view.MaximumScroll;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class koo0 implements iam<ann0>, TextWatcher {

    /* JADX INFO: renamed from: p */
    public static int f127770p = 16;

    /* JADX INFO: renamed from: a */
    public LinearLayout f127771a;

    /* JADX INFO: renamed from: b */
    public View f127772b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f127773c;

    /* JADX INFO: renamed from: d */
    public ImageView f127774d;

    /* JADX INFO: renamed from: e */
    public VText f127775e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f127776f;

    /* JADX INFO: renamed from: g */
    public VEditText f127777g;

    /* JADX INFO: renamed from: h */
    public MaximumScroll f127778h;

    /* JADX INFO: renamed from: i */
    public FlowLayout f127779i;

    /* JADX INFO: renamed from: j */
    public VText f127780j;

    /* JADX INFO: renamed from: k */
    public VText f127781k;

    /* JADX INFO: renamed from: l */
    public ann0 f127782l;

    /* JADX INFO: renamed from: m */
    public c0s f127783m;

    /* JADX INFO: renamed from: n */
    public TextView f127784n;

    /* JADX INFO: renamed from: o */
    public boolean f127785o = false;

    /* JADX INFO: renamed from: H */
    private void m150644H() {
        this.f127772b.setOnClickListener(new View.OnClickListener() { // from class: l.coo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82902a.m150659x(view);
            }
        });
        bnl0.m105509E0(this.f127774d, new View.OnClickListener() { // from class: l.doo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89993a.m150660y(view);
            }
        });
        bnl0.m105509E0(this.f127781k, new View.OnClickListener() { // from class: l.eoo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94940a.m150661z(view);
            }
        });
        m150658v();
    }

    /* JADX INFO: renamed from: J */
    private void m150645J() {
        if (this.f127785o) {
            if (m150656p(m150671q()).length() == 0) {
                o1j0.m165649w(R$string.f48507yi);
                return;
            }
        } else if (m150656p(m150671q()).length() == 0) {
            act().dialog().m21499D(R$string.f47489Di).m21541l0(R$string.f47467Ci, new Runnable() { // from class: l.goo0
                @Override // java.lang.Runnable
                public final void run() {
                    koo0.m150646a();
                }
            }).m21555t0(R$string.f48494y5, new Runnable() { // from class: l.hoo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110939a.m150662A();
                }
            }).m21495B(false).m21567z0();
            return;
        }
        this.f127782l.m99013O3(m150671q());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m150646a() {
    }

    /* JADX INFO: renamed from: l */
    private void m150653l() {
        if (!this.f127785o) {
            this.f127781k.setSelected(true);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(m150671q());
        VText vText = this.f127781k;
        if (zIsEmpty) {
            vText.setSelected(false);
        } else {
            vText.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m150654m() {
        c0s c0sVar = this.f127783m;
        if (c0sVar == null || !c0sVar.isShowing()) {
            return;
        }
        this.f127783m.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m150655n() {
        o1j0.m165651y(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(f127770p)));
    }

    /* JADX INFO: renamed from: p */
    private String m150656p(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: u */
    private void m150657u() {
        if (this.f127783m == null) {
            this.f127783m = new c0s(this.f127782l, m150669j(act().inflater(), null));
            m150644H();
        } else {
            this.f127777g.setText("");
            this.f127779i.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m150658v() {
        act().setUpKeyboardDetectorLayout(new View(act()), this.f127777g, new z20() { // from class: l.ioo0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f116190a.m150664C((Boolean) obj, ((Integer) obj2).intValue());
            }
        });
        this.f127777g.setFilters(new InputFilter[]{new qcr(32, new x20() { // from class: l.joo0
            @Override // p153l.x20
            public final void call() {
                this.f122046a.m150655n();
            }
        })});
        this.f127777g.addTextChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m150659x(View view) {
        m150654m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m150660y(View view) {
        m150654m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m150661z(View view) {
        m150645J();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m150662A() {
        this.f127782l.m99013O3(m150671q());
    }

    /* JADX INFO: renamed from: B */
    public final void m150663B(TextView textView, BLiveVoiceTopic bLiveVoiceTopic) {
        TextView textView2 = this.f127784n;
        if (textView2 == null) {
            textView.setSelected(true);
            this.f127784n = textView;
        } else if (textView2 != textView) {
            textView2.setSelected(false);
            textView.setSelected(true);
            this.f127784n = textView;
        } else {
            textView.setSelected(!textView.isSelected());
        }
        ann0 ann0Var = this.f127782l;
        if (!textView.isSelected()) {
            bLiveVoiceTopic = null;
        }
        ann0Var.m99016U3(bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: C */
    public void m150664C(Boolean bool, int i) {
        boolean zBooleanValue = bool.booleanValue();
        LinearLayout linearLayout = this.f127771a;
        if (zBooleanValue) {
            linearLayout.setTranslationY(-i);
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f127782l.act();
    }

    /* JADX INFO: renamed from: E */
    public void m150665E(List<BLiveVoiceTopic> list, BLiveVoiceRoom bLiveVoiceRoom, boolean z) {
        this.f127785o = z;
        this.f127779i.removeAllViews();
        if (bLiveVoiceRoom != null && !TextUtils.isEmpty(bLiveVoiceRoom.title)) {
            m150668I(bLiveVoiceRoom.title);
            m150653l();
        }
        boolean zM147479J = jyb.m147479J(list);
        MaximumScroll maximumScroll = this.f127778h;
        if (zM147479J) {
            maximumScroll.setVisibility(8);
            return;
        }
        maximumScroll.setVisibility(0);
        for (int i = 0; i < list.size(); i++) {
            final BLiveVoiceTopic bLiveVoiceTopic = list.get(i);
            final TextView textView = (TextView) m150672s(this.f127779i);
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.foo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f100080a.m150673w(textView, bLiveVoiceTopic, view);
                }
            });
            m150667G(bLiveVoiceTopic, bLiveVoiceRoom, textView);
            textView.setText(bLiveVoiceTopic.name);
            this.f127779i.addView(textView);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m150666F(boolean z) {
        if (!z) {
            m150654m();
        } else {
            m150657u();
            this.f127783m.show();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m150667G(BLiveVoiceTopic bLiveVoiceTopic, BLiveVoiceRoom bLiveVoiceRoom, TextView textView) {
        if (jyb.m147479J(bLiveVoiceRoom.topics) || !TextUtils.equals(bLiveVoiceRoom.topics.get(0).name, bLiveVoiceTopic.name)) {
            return;
        }
        m150663B(textView, bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: I */
    public void m150668I(String str) {
        this.f127777g.setText(str);
        VEditText vEditText = this.f127777g;
        vEditText.setSelection(vEditText.length());
        this.f127777g.requestFocus();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f127782l.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m150653l();
    }

    @Override // p153l.iam
    public void destroy() {
        m150654m();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public View m150669j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return loo0.m155094b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ann0 ann0Var) {
        this.f127782l = ann0Var;
    }

    /* JADX INFO: renamed from: q */
    public String m150671q() {
        return this.f127777g.getText().toString().trim();
    }

    /* JADX INFO: renamed from: s */
    public final View m150672s(ViewGroup viewGroup) {
        return act().inflater().inflate(yec0.f198834La, viewGroup, false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m150673w(TextView textView, BLiveVoiceTopic bLiveVoiceTopic, View view) {
        m150663B(textView, bLiveVoiceTopic);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
