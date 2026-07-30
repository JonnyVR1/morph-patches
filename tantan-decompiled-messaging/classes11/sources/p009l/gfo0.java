package p009l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p1.mobile.putong.live.base.view.MaximumScroll;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.List;
import l.byr;
import l.d30;
import l.f30;
import l.hfo0;
import l.lsi0;
import l.oar;
import l.s7m;
import l.t6c0;
import l.vwb;
import l.xdl0;
import org.apmem.tools.layouts.FlowLayout;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gfo0 implements s7m<wdn0>, TextWatcher {

    /* JADX INFO: renamed from: p */
    public static int f13508p = 16;

    /* JADX INFO: renamed from: a */
    public LinearLayout f13509a;

    /* JADX INFO: renamed from: b */
    public View f13510b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f13511c;

    /* JADX INFO: renamed from: d */
    public ImageView f13512d;

    /* JADX INFO: renamed from: e */
    public VText f13513e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f13514f;

    /* JADX INFO: renamed from: g */
    public VEditText f13515g;

    /* JADX INFO: renamed from: h */
    public MaximumScroll f13516h;

    /* JADX INFO: renamed from: i */
    public FlowLayout f13517i;

    /* JADX INFO: renamed from: j */
    public VText f13518j;

    /* JADX INFO: renamed from: k */
    public VText f13519k;

    /* JADX INFO: renamed from: l */
    public wdn0 f13520l;

    /* JADX INFO: renamed from: m */
    public byr f13521m;

    /* JADX INFO: renamed from: n */
    public TextView f13522n;

    /* JADX INFO: renamed from: o */
    public boolean f13523o = false;

    /* JADX INFO: renamed from: H */
    private void m14967H() {
        this.f13510b.setOnClickListener(new View.OnClickListener() { // from class: l.yeo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23010a.m14982x(view);
            }
        });
        xdl0.E0(this.f13512d, new View.OnClickListener() { // from class: l.zeo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23627a.m14983y(view);
            }
        });
        xdl0.E0(this.f13519k, new View.OnClickListener() { // from class: l.afo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9466a.m14984z(view);
            }
        });
        m14981v();
    }

    /* JADX INFO: renamed from: J */
    private void m14968J() {
        if (this.f13523o) {
            if (m14979p(m14996q()).length() == 0) {
                lsi0.w(R.string.yi);
                return;
            }
        } else if (m14979p(m14996q()).length() == 0) {
            act().dialog().D(R.string.Di).l0(R.string.Ci, new Runnable() { // from class: l.cfo0
                @Override // java.lang.Runnable
                public final void run() {
                    gfo0.m14969a();
                }
            }).t0(R.string.y5, new Runnable() { // from class: l.dfo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11823a.m14985A();
                }
            }).B(false).z0();
            return;
        }
        this.f13520l.m24076O3(m14996q());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14969a() {
    }

    /* JADX INFO: renamed from: l */
    private void m14976l() {
        if (!this.f13523o) {
            this.f13519k.setSelected(true);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(m14996q());
        VText vText = this.f13519k;
        if (zIsEmpty) {
            vText.setSelected(false);
        } else {
            vText.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m14977m() {
        byr byrVar = this.f13521m;
        if (byrVar == null || !byrVar.isShowing()) {
            return;
        }
        this.f13521m.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m14978n() {
        lsi0.y(ypv.f23200e.getString(R.string.G6, Integer.valueOf(f13508p)));
    }

    /* JADX INFO: renamed from: p */
    private String m14979p(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: u */
    private void m14980u() {
        if (this.f13521m == null) {
            this.f13521m = new byr(this.f13520l, m14994j(act().inflater(), null));
            m14967H();
        } else {
            this.f13515g.setText("");
            this.f13517i.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m14981v() {
        act().setUpKeyboardDetectorLayout(new View(act()), this.f13515g, new f30() { // from class: l.efo0
            public final void call(Object obj, Object obj2) {
                this.f12543a.m14987C((Boolean) obj, ((Integer) obj2).intValue());
            }
        });
        this.f13515g.setFilters(new InputFilter[]{new oar(32, new d30() { // from class: l.ffo0
            public final void call() {
                this.f12987a.m14978n();
            }
        })});
        this.f13515g.addTextChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m14982x(View view) {
        m14977m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m14983y(View view) {
        m14977m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m14984z(View view) {
        m14968J();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m14985A() {
        this.f13520l.m24076O3(m14996q());
    }

    /* JADX INFO: renamed from: B */
    public final void m14986B(TextView textView, BLiveVoiceTopic bLiveVoiceTopic) {
        TextView textView2 = this.f13522n;
        if (textView2 == null) {
            textView.setSelected(true);
            this.f13522n = textView;
        } else if (textView2 != textView) {
            textView2.setSelected(false);
            textView.setSelected(true);
            this.f13522n = textView;
        } else {
            textView.setSelected(!textView.isSelected());
        }
        wdn0 wdn0Var = this.f13520l;
        if (!textView.isSelected()) {
            bLiveVoiceTopic = null;
        }
        wdn0Var.m24080U3(bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: C */
    public void m14987C(Boolean bool, int i) {
        boolean zBooleanValue = bool.booleanValue();
        LinearLayout linearLayout = this.f13509a;
        if (zBooleanValue) {
            linearLayout.setTranslationY(-i);
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14988C0() {
        return this.f13520l.act();
    }

    /* JADX INFO: renamed from: E */
    public void m14989E(List<BLiveVoiceTopic> list, BLiveVoiceRoom bLiveVoiceRoom, boolean z) {
        this.f13523o = z;
        this.f13517i.removeAllViews();
        if (bLiveVoiceRoom != null && !TextUtils.isEmpty(((BLiveAbsRoom) bLiveVoiceRoom).title)) {
            m14992I(((BLiveAbsRoom) bLiveVoiceRoom).title);
            m14976l();
        }
        boolean zJ = vwb.J(list);
        MaximumScroll maximumScroll = this.f13516h;
        if (zJ) {
            maximumScroll.setVisibility(8);
            return;
        }
        maximumScroll.setVisibility(0);
        for (int i = 0; i < list.size(); i++) {
            final BLiveVoiceTopic bLiveVoiceTopic = list.get(i);
            final TextView textView = (TextView) m14997s(this.f13517i);
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.bfo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10051a.m14998w(textView, bLiveVoiceTopic, view);
                }
            });
            m14991G(bLiveVoiceTopic, bLiveVoiceRoom, textView);
            textView.setText(bLiveVoiceTopic.name);
            this.f13517i.addView(textView);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m14990F(boolean z) {
        if (!z) {
            m14977m();
        } else {
            m14980u();
            this.f13521m.show();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m14991G(BLiveVoiceTopic bLiveVoiceTopic, BLiveVoiceRoom bLiveVoiceRoom, TextView textView) {
        if (vwb.J(bLiveVoiceRoom.topics) || !TextUtils.equals(((BLiveVoiceTopic) bLiveVoiceRoom.topics.get(0)).name, bLiveVoiceTopic.name)) {
            return;
        }
        m14986B(textView, bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: I */
    public void m14992I(String str) {
        this.f13515g.setText(str);
        VEditText vEditText = this.f13515g;
        vEditText.setSelection(vEditText.length());
        this.f13515g.requestFocus();
    }

    @Nullable
    public Act act() {
        return this.f13520l.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m14976l();
    }

    public void destroy() {
        m14977m();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public View m14994j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hfo0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m14993i1(wdn0 wdn0Var) {
        this.f13520l = wdn0Var;
    }

    /* JADX INFO: renamed from: q */
    public String m14996q() {
        return this.f13515g.getText().toString().trim();
    }

    /* JADX INFO: renamed from: s */
    public final View m14997s(ViewGroup viewGroup) {
        return act().inflater().inflate(t6c0.La, viewGroup, false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m14998w(TextView textView, BLiveVoiceTopic bLiveVoiceTopic, View view) {
        m14986B(textView, bLiveVoiceTopic);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
