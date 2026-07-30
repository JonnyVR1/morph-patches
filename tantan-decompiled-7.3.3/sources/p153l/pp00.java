package p153l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.core.p058ui.moment.MomentMessageAct;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pp00 implements iam<bp00> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f153445a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f153446b;

    /* JADX INFO: renamed from: c */
    public TextView f153447c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f153448d;

    /* JADX INFO: renamed from: e */
    public VText f153449e;

    /* JADX INFO: renamed from: f */
    public VText f153450f;

    /* JADX INFO: renamed from: g */
    public VText f153451g;

    /* JADX INFO: renamed from: h */
    public VText f153452h;

    /* JADX INFO: renamed from: i */
    public VText f153453i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f153454j;

    /* JADX INFO: renamed from: k */
    public VLinear f153455k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f153456l;

    /* JADX INFO: renamed from: m */
    public VEditTextEmojiCompat f153457m;

    /* JADX INFO: renamed from: n */
    public TextView f153458n;

    /* JADX INFO: renamed from: o */
    public MomentMessageAct f153459o;

    /* JADX INFO: renamed from: p */
    public bp00 f153460p;

    /* JADX INFO: renamed from: r */
    public String f153462r;

    /* JADX INFO: renamed from: s */
    public String f153463s;

    /* JADX INFO: renamed from: v */
    public PopupWindow f153466v;

    /* JADX INFO: renamed from: q */
    public boolean f153461q = false;

    /* JADX INFO: renamed from: t */
    public Interpolator f153464t = new xjg();

    /* JADX INFO: renamed from: u */
    public Animator f153465u = null;

    public pp00(MomentMessageAct momentMessageAct) {
        this.f153459o = momentMessageAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m173137B(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m173163N(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m173138E(String str, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", "p_moment_chat", pf60.m172085a("moment_id", str), pf60.m172085a("moment_chat_send_from", "moment_chat_emoji"), pf60.m172085a("moment_type", CoreModule.m30932N().mo61510Ur(str)));
        m173162M("🔥");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m173139F(String str, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", "p_moment_chat", pf60.m172085a("moment_id", str), pf60.m172085a("moment_chat_send_from", "moment_chat_emoji"), pf60.m172085a("moment_type", CoreModule.m30932N().mo61510Ur(str)));
        m173162M("😄");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m173140G(String str, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", "p_moment_chat", pf60.m172085a("moment_id", str), pf60.m172085a("moment_chat_send_from", "moment_chat_emoji"), pf60.m172085a("moment_type", CoreModule.m30932N().mo61510Ur(str)));
        m173162M("👏");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m173141H(String str, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", "p_moment_chat", pf60.m172085a("moment_id", str), pf60.m172085a("moment_chat_send_from", "moment_chat_emoji"), pf60.m172085a("moment_type", CoreModule.m30932N().mo61510Ur(str)));
        m173162M("🎉");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m173142I(String str, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", "p_moment_chat", pf60.m172085a("moment_id", str), pf60.m172085a("moment_chat_send_from", "moment_chat_send"), pf60.m172085a("moment_type", CoreModule.m30932N().mo61510Ur(str)));
        String strTrim = this.f153457m.getText().toString().trim();
        m173162M(strTrim);
        if (this.f153460p.m105775j0() != null) {
            this.f153460p.m105775j0().mo199771h(strTrim);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m173143J(View view) {
        this.f153459o.hideInput();
        act().m48999H2();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m173147c(final String str) {
        if (Act.foreground_() == null || Act.foreground_().f16062a == null || Act.foreground_().f16062a.get() == null || !(Act.foreground_().f16062a.get() instanceof Act)) {
            return;
        }
        uqb0.f180394Z.m95960Q(str, OmsDialog.p_user_passive_show_chat.getIdentifier()).subscribe(psd0.m173597H(new y20() { // from class: l.ep00
            @Override // p153l.y20
            public final void call(Object obj) {
                pp00.m173157p(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.fp00
            @Override // p153l.y20
            public final void call(Object obj) {
                pp00.m173149e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m173149e(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m173157p(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreDlg.m46218W1((Act) Act.foreground_().f16062a.get(), str);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m173158u() {
        PopupWindow popupWindow = new PopupWindow();
        this.f153466v = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(kec0.f125330Ae, (ViewGroup) null, false));
        this.f153466v.setInputMethodMode(1);
        this.f153466v.setWidth(0);
        this.f153466v.setHeight(0);
    }

    /* JADX INFO: renamed from: A */
    public void m173159A(final String str, String str2) {
        this.f153462r = str;
        this.f153463s = str2;
        User userById = CoreModule.m30930K().getUserById(str2);
        VEditTextEmojiCompat vEditTextEmojiCompat = this.f153457m;
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this.f153459o.getString(R$string.f19558pj, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userById.name));
        vEditTextEmojiCompat.setHint(sb.toString());
        this.f153457m.setMaxLines(1);
        this.f153458n.setTypeface(Typeface.DEFAULT_BOLD);
        uqb0.f180374G.m127125Q0(this.f153456l, CoreModule.m30930K().me_().m61308fp().profileSmall());
        this.f153461q = false;
        this.f153457m.addTextChangedListener(new C19412a(userById));
        bnl0.m105509E0(this.f153449e, new View.OnClickListener() { // from class: l.gp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105402a.m173160C(str, view);
            }
        });
        bnl0.m105509E0(this.f153450f, new View.OnClickListener() { // from class: l.hp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110972a.m173138E(str, view);
            }
        });
        bnl0.m105509E0(this.f153451g, new View.OnClickListener() { // from class: l.ip00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116247a.m173139F(str, view);
            }
        });
        bnl0.m105509E0(this.f153452h, new View.OnClickListener() { // from class: l.jp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122066a.m173140G(str, view);
            }
        });
        bnl0.m105509E0(this.f153453i, new View.OnClickListener() { // from class: l.kp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127822a.m173141H(str, view);
            }
        });
        bnl0.m105509E0(this.f153458n, new View.OnClickListener() { // from class: l.lp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132993a.m173142I(str, view);
            }
        });
        bnl0.m105509E0(this.f153445a, new View.OnClickListener() { // from class: l.mp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137863a.m173143J(view);
            }
        });
        l51.m152888H(this.f153459o, new Runnable() { // from class: l.np00
            @Override // java.lang.Runnable
            public final void run() {
                this.f143064a.m173144K();
            }
        }, 200L);
        if (CoreModule.f18264c.f20381e0.f89101P6.containsKey(str)) {
            String str3 = CoreModule.f18264c.f20381e0.f89101P6.get(str);
            this.f153457m.setText(str3);
            this.f153457m.setSelection(str3.length());
        } else {
            this.f153457m.setText("");
        }
        if (this.f153460p.m105775j0() != null) {
            this.f153460p.m105775j0().mo199766c(this);
            return;
        }
        this.f153449e.setText("❤️");
        this.f153450f.setText("🔥️");
        this.f153451g.setText("😄");
        this.f153452h.setText("👏️");
        this.f153453i.setText("🎉️");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m173160C(String str, View view) {
        i4g0.m138523u("e_profile_moment_chat_send", "p_moment_chat", pf60.m172085a("moment_id", str), pf60.m172085a("moment_chat_send_from", "moment_chat_emoji"), pf60.m172085a("moment_type", CoreModule.m30932N().mo61510Ur(str)));
        m173162M("❤️");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f153459o;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m173161L(String str, Detect detect) {
        if (detect == null) {
            this.f153460p.m105786z0(str);
        } else if (AntiSpamHelper.m81449a(detect, this.f153459o.pageId())) {
            o1j0.m165649w(R$string.f19139c0);
        } else {
            o1j0.m165649w(R$string.f18634L7);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m173162M(final String str) {
        if (uqb0.f180394Z.m95954K(str) || uqb0.f180394Z.m95956M(str)) {
            this.f153457m.setText("");
            this.f153460p.m105785y0(4);
            act().hideInput();
            act().m48999H2();
            return;
        }
        m173172y(str);
        this.f153457m.setText("");
        if (this.f153460p.m105775j0() == null) {
            this.f153460p.m105786z0(str);
        } else {
            CoreModule.m30932N().mo61567po(this.f153459o, str, new y20() { // from class: l.op00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148405a.m173161L(str, (Detect) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public void m173163N(int i) {
        if (i == 0 && this.f153461q) {
            act().m48999H2();
            return;
        }
        if (i > 0) {
            if (this.f153461q && NullChecker.m82486a(this.f153465u)) {
                this.f153465u.cancel();
            }
            m173166Q(i);
            this.f153461q = true;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m173164O(boolean z) {
        if (z && ln7.m154967b() && NullChecker.m82486a(this.f153466v) && !this.f153466v.isShowing()) {
            this.f153466v.setBackgroundDrawable(new ColorDrawable(0));
            this.f153466v.showAtLocation(this.f153459o.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m173144K() {
        this.f153457m.setFocusable(true);
        this.f153457m.setFocusableInTouchMode(true);
        this.f153457m.requestFocus();
        this.f153459o.showInput(this.f153457m, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m173166Q(int i) {
        Animator animatorM132175u = gt0.m132175u(true, this.f153464t, 390L, gt0.m132171q(this.f153446b, "translationY", -i));
        this.f153465u = animatorM132175u;
        animatorM132175u.start();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = this.f153459o.setUpKeyboardDetectorLayout(m173167q(layoutInflater, viewGroup), new View(this.f153459o), new b30() { // from class: l.cp00
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f82952a.m173137B((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (ln7.m154967b()) {
            m173158u();
        }
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: q */
    public View m173167q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qp00.m177391b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MomentMessageAct act() {
        return this.f153459o;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bp00 bp00Var) {
        this.f153460p = bp00Var;
    }

    /* JADX INFO: renamed from: w */
    public void m173170w() {
        if (NullChecker.m82486a(this.f153466v) && this.f153466v.isShowing()) {
            this.f153466v.dismiss();
            this.f153466v = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public String m173171x() {
        return this.f153457m.getText().toString();
    }

    /* JADX INFO: renamed from: y */
    public final void m173172y(final String str) {
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.dp00
            @Override // java.lang.Runnable
            public final void run() {
                pp00.m173147c(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: z */
    public void m173173z() {
        this.f153461q = false;
        gt0.m132175u(true, this.f153464t, 390L, gt0.m132171q(this.f153446b, "translationY", 0.0f)).start();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.pp00$a */
    public class C19412a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f153467a;

        public C19412a(User user) {
            this.f153467a = user;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable.toString());
            pp00 pp00Var = pp00.this;
            if (zIsEmpty) {
                pp00Var.f153457m.setMaxLines(1);
                VEditTextEmojiCompat vEditTextEmojiCompat = pp00.this.f153457m;
                StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(pp00.this.f153459o.getString(R$string.f19558pj, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f153467a.name));
                vEditTextEmojiCompat.setHint(sb.toString());
            } else {
                pp00Var.f153457m.setMaxLines(4);
                pp00.this.f153457m.setHint("");
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(editable.toString().trim());
            boolean z = !zIsEmpty2;
            pp00.this.f153458n.setTextColor(Color.parseColor(!zIsEmpty2 ? "#fffe7e1d" : "#19000000"));
            pp00.this.f153458n.setEnabled(z);
            bnl0.m105524M(pp00.this.f153448d, zIsEmpty2);
            bnl0.m105524M(pp00.this.f153447c, zIsEmpty2);
            if (pp00.this.f153460p.m105775j0() != null) {
                pp00.this.f153460p.m105775j0().mo199770g(editable.toString(), pp00.this);
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
