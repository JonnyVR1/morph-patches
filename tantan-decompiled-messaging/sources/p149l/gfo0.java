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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p046p1.mobile.putong.live.base.view.MaximumScroll;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class gfo0 implements s7m<wdn0>, TextWatcher {

    /* JADX INFO: renamed from: p */
    public static int f102407p = 16;

    /* JADX INFO: renamed from: a */
    public LinearLayout f102408a;

    /* JADX INFO: renamed from: b */
    public View f102409b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f102410c;

    /* JADX INFO: renamed from: d */
    public ImageView f102411d;

    /* JADX INFO: renamed from: e */
    public VText f102412e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f102413f;

    /* JADX INFO: renamed from: g */
    public VEditText f102414g;

    /* JADX INFO: renamed from: h */
    public MaximumScroll f102415h;

    /* JADX INFO: renamed from: i */
    public FlowLayout f102416i;

    /* JADX INFO: renamed from: j */
    public VText f102417j;

    /* JADX INFO: renamed from: k */
    public VText f102418k;

    /* JADX INFO: renamed from: l */
    public wdn0 f102419l;

    /* JADX INFO: renamed from: m */
    public byr f102420m;

    /* JADX INFO: renamed from: n */
    public TextView f102421n;

    /* JADX INFO: renamed from: o */
    public boolean f102422o = false;

    /* JADX INFO: renamed from: H */
    private void m125895H() {
        this.f102409b.setOnClickListener(new View.OnClickListener() { // from class: l.yeo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197700a.m125910x(view);
            }
        });
        xdl0.m208329E0(this.f102411d, new View.OnClickListener() { // from class: l.zeo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202855a.m125911y(view);
            }
        });
        xdl0.m208329E0(this.f102418k, new View.OnClickListener() { // from class: l.afo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69204a.m125912z(view);
            }
        });
        m125909v();
    }

    /* JADX INFO: renamed from: J */
    private void m125896J() {
        if (this.f102422o) {
            if (m125907p(m125922q()).length() == 0) {
                lsi0.m151593w(R$string.f47659yi);
                return;
            }
        } else if (m125907p(m125922q()).length() == 0) {
            act().dialog().m20500D(R$string.f46641Di).m20542l0(R$string.f46619Ci, new Runnable() { // from class: l.cfo0
                @Override // java.lang.Runnable
                public final void run() {
                    gfo0.m125897a();
                }
            }).m20556t0(R$string.f47646y5, new Runnable() { // from class: l.dfo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85965a.m125913A();
                }
            }).m20496B(false).m20568z0();
            return;
        }
        this.f102419l.m202755O3(m125922q());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m125897a() {
    }

    /* JADX INFO: renamed from: l */
    private void m125904l() {
        if (!this.f102422o) {
            this.f102418k.setSelected(true);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(m125922q());
        VText vText = this.f102418k;
        if (zIsEmpty) {
            vText.setSelected(false);
        } else {
            vText.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m125905m() {
        byr byrVar = this.f102420m;
        if (byrVar == null || !byrVar.isShowing()) {
            return;
        }
        this.f102420m.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m125906n() {
        lsi0.m151595y(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(f102407p)));
    }

    /* JADX INFO: renamed from: p */
    private String m125907p(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: u */
    private void m125908u() {
        if (this.f102420m == null) {
            this.f102420m = new byr(this.f102419l, m125920j(act().inflater(), null));
            m125895H();
        } else {
            this.f102414g.setText("");
            this.f102416i.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m125909v() {
        act().setUpKeyboardDetectorLayout(new View(act()), this.f102414g, new f30() { // from class: l.efo0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f90851a.m125915C((Boolean) obj, ((Integer) obj2).intValue());
            }
        });
        this.f102414g.setFilters(new InputFilter[]{new oar(32, new d30() { // from class: l.ffo0
            @Override // p149l.d30
            public final void call() {
                this.f97276a.m125906n();
            }
        })});
        this.f102414g.addTextChangedListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m125910x(View view) {
        m125905m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m125911y(View view) {
        m125905m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m125912z(View view) {
        m125896J();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m125913A() {
        this.f102419l.m202755O3(m125922q());
    }

    /* JADX INFO: renamed from: B */
    public final void m125914B(TextView textView, BLiveVoiceTopic bLiveVoiceTopic) {
        TextView textView2 = this.f102421n;
        if (textView2 == null) {
            textView.setSelected(true);
            this.f102421n = textView;
        } else if (textView2 != textView) {
            textView2.setSelected(false);
            textView.setSelected(true);
            this.f102421n = textView;
        } else {
            textView.setSelected(!textView.isSelected());
        }
        wdn0 wdn0Var = this.f102419l;
        if (!textView.isSelected()) {
            bLiveVoiceTopic = null;
        }
        wdn0Var.m202758U3(bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: C */
    public void m125915C(Boolean bool, int i) {
        boolean zBooleanValue = bool.booleanValue();
        LinearLayout linearLayout = this.f102408a;
        if (zBooleanValue) {
            linearLayout.setTranslationY(-i);
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f102419l.act();
    }

    /* JADX INFO: renamed from: E */
    public void m125916E(List<BLiveVoiceTopic> list, BLiveVoiceRoom bLiveVoiceRoom, boolean z) {
        this.f102422o = z;
        this.f102416i.removeAllViews();
        if (bLiveVoiceRoom != null && !TextUtils.isEmpty(bLiveVoiceRoom.title)) {
            m125919I(bLiveVoiceRoom.title);
            m125904l();
        }
        boolean zM200296J = vwb.m200296J(list);
        MaximumScroll maximumScroll = this.f102415h;
        if (zM200296J) {
            maximumScroll.setVisibility(8);
            return;
        }
        maximumScroll.setVisibility(0);
        for (int i = 0; i < list.size(); i++) {
            final BLiveVoiceTopic bLiveVoiceTopic = list.get(i);
            final TextView textView = (TextView) m125923s(this.f102416i);
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.bfo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f75339a.m125924w(textView, bLiveVoiceTopic, view);
                }
            });
            m125918G(bLiveVoiceTopic, bLiveVoiceRoom, textView);
            textView.setText(bLiveVoiceTopic.name);
            this.f102416i.addView(textView);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m125917F(boolean z) {
        if (!z) {
            m125905m();
        } else {
            m125908u();
            this.f102420m.show();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m125918G(BLiveVoiceTopic bLiveVoiceTopic, BLiveVoiceRoom bLiveVoiceRoom, TextView textView) {
        if (vwb.m200296J(bLiveVoiceRoom.topics) || !TextUtils.equals(bLiveVoiceRoom.topics.get(0).name, bLiveVoiceTopic.name)) {
            return;
        }
        m125914B(textView, bLiveVoiceTopic);
    }

    /* JADX INFO: renamed from: I */
    public void m125919I(String str) {
        this.f102414g.setText(str);
        VEditText vEditText = this.f102414g;
        vEditText.setSelection(vEditText.length());
        this.f102414g.requestFocus();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f102419l.act();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m125904l();
    }

    @Override // p149l.s7m
    public void destroy() {
        m125905m();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public View m125920j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hfo0.m130777b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wdn0 wdn0Var) {
        this.f102419l = wdn0Var;
    }

    /* JADX INFO: renamed from: q */
    public String m125922q() {
        return this.f102414g.getText().toString().trim();
    }

    /* JADX INFO: renamed from: s */
    public final View m125923s(ViewGroup viewGroup) {
        return act().inflater().inflate(t6c0.f168102La, viewGroup, false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m125924w(TextView textView, BLiveVoiceTopic bLiveVoiceTopic, View view) {
        m125914B(textView, bLiveVoiceTopic);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
