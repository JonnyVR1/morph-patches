package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.moment.MomentMessageAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.messages.emoji.VEditTextEmojiCompat;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.e30;
import l.e51;
import l.f6c0;
import l.h30;
import l.hh00;
import l.hm7;
import l.j760;
import l.jig;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gh00 implements s7m<sg00> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f11412a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f11413b;

    /* JADX INFO: renamed from: c */
    public TextView f11414c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f11415d;

    /* JADX INFO: renamed from: e */
    public VText f11416e;

    /* JADX INFO: renamed from: f */
    public VText f11417f;

    /* JADX INFO: renamed from: g */
    public VText f11418g;

    /* JADX INFO: renamed from: h */
    public VText f11419h;

    /* JADX INFO: renamed from: i */
    public VText f11420i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f11421j;

    /* JADX INFO: renamed from: k */
    public VLinear f11422k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f11423l;

    /* JADX INFO: renamed from: m */
    public VEditTextEmojiCompat f11424m;

    /* JADX INFO: renamed from: n */
    public TextView f11425n;

    /* JADX INFO: renamed from: o */
    public MomentMessageAct f11426o;

    /* JADX INFO: renamed from: p */
    public sg00 f11427p;

    /* JADX INFO: renamed from: r */
    public String f11429r;

    /* JADX INFO: renamed from: s */
    public String f11430s;

    /* JADX INFO: renamed from: v */
    public PopupWindow f11433v;

    /* JADX INFO: renamed from: q */
    public boolean f11428q = false;

    /* JADX INFO: renamed from: t */
    public Interpolator f11431t = new jig();

    /* JADX INFO: renamed from: u */
    public Animator f11432u = null;

    public gh00(MomentMessageAct momentMessageAct) {
        this.f11426o = momentMessageAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m13775B(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m13802N(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m13776E(String str, View view) {
        zvf0.u("e_profile_moment_chat_send", "p_moment_chat", new j760[]{j760.a("moment_id", str), j760.a("moment_chat_send_from", "moment_chat_emoji"), j760.a("moment_type", CoreModule.N().Ur(str))});
        m13801M("🔥");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m13777F(String str, View view) {
        zvf0.u("e_profile_moment_chat_send", "p_moment_chat", new j760[]{j760.a("moment_id", str), j760.a("moment_chat_send_from", "moment_chat_emoji"), j760.a("moment_type", CoreModule.N().Ur(str))});
        m13801M("😄");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m13778G(String str, View view) {
        zvf0.u("e_profile_moment_chat_send", "p_moment_chat", new j760[]{j760.a("moment_id", str), j760.a("moment_chat_send_from", "moment_chat_emoji"), j760.a("moment_type", CoreModule.N().Ur(str))});
        m13801M("👏");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m13779H(String str, View view) {
        zvf0.u("e_profile_moment_chat_send", "p_moment_chat", new j760[]{j760.a("moment_id", str), j760.a("moment_chat_send_from", "moment_chat_emoji"), j760.a("moment_type", CoreModule.N().Ur(str))});
        m13801M("🎉");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m13780I(String str, View view) {
        zvf0.u("e_profile_moment_chat_send", "p_moment_chat", new j760[]{j760.a("moment_id", str), j760.a("moment_chat_send_from", "moment_chat_send"), j760.a("moment_type", CoreModule.N().Ur(str))});
        String strTrim = this.f11424m.getText().toString().trim();
        m13801M(strTrim);
        if (this.f11427p.m22439j0() != null) {
            this.f11427p.m22439j0().mo10651h(strTrim);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m13781J(View view) {
        this.f11426o.hideInput();
        act().finish();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m13785c(final String str) {
        if (Act.foreground_() == null || Act.foreground_().a == null || Act.foreground_().a.get() == null || !(Act.foreground_().a.get() instanceof Act)) {
            return;
        }
        qib0.Z.Q(str, OmsDialog.p_user_passive_show_chat.getIdentifier()).subscribe(mkd0.H(new e30() { // from class: l.vg00
            public final void call(Object obj) {
                gh00.m13795p(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.wg00
            public final void call(Object obj) {
                gh00.m13787e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13787e(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13795p(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreDlg.W1((Act) Act.foreground_().a.get(), str);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m13796u() {
        PopupWindow popupWindow = new PopupWindow();
        this.f11433v = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(f6c0.te, (ViewGroup) null, false));
        this.f11433v.setInputMethodMode(1);
        this.f11433v.setWidth(0);
        this.f11433v.setHeight(0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: A */
    public void m13797A(final String str, String str2) {
        this.f11429r = str;
        this.f11430s = str2;
        User userById = CoreModule.K().getUserById(str2);
        VEditTextEmojiCompat vEditTextEmojiCompat = this.f11424m;
        StringBuilder sb = new StringBuilder(" ");
        sb.append(this.f11426o.getString(R.string.Ti, " " + userById.name));
        vEditTextEmojiCompat.setHint(sb.toString());
        this.f11424m.setMaxLines(1);
        this.f11425n.setTypeface(Typeface.DEFAULT_BOLD);
        qib0.G.Q0(this.f11423l, CoreModule.K().me_().fp().profileSmall());
        this.f11428q = false;
        this.f11424m.addTextChangedListener(new C0589a(userById));
        xdl0.E0(this.f11416e, new View.OnClickListener() { // from class: l.xg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22263a.m13798C(str, view);
            }
        });
        xdl0.E0(this.f11417f, new View.OnClickListener() { // from class: l.yg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22850a.m13776E(str, view);
            }
        });
        xdl0.E0(this.f11418g, new View.OnClickListener() { // from class: l.zg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23389a.m13777F(str, view);
            }
        });
        xdl0.E0(this.f11419h, new View.OnClickListener() { // from class: l.ah00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7605a.m13778G(str, view);
            }
        });
        xdl0.E0(this.f11420i, new View.OnClickListener() { // from class: l.bh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8124a.m13779H(str, view);
            }
        });
        xdl0.E0(this.f11425n, new View.OnClickListener() { // from class: l.ch00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8666a.m13780I(str, view);
            }
        });
        xdl0.E0(this.f11412a, new View.OnClickListener() { // from class: l.dh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9257a.m13781J(view);
            }
        });
        e51.H(this.f11426o, new Runnable() { // from class: l.eh00
            @Override // java.lang.Runnable
            public final void run() {
                this.f9772a.m13782K();
            }
        }, 200L);
        if (CoreModule.c.e0.P6.containsKey(str)) {
            String str3 = (String) CoreModule.c.e0.P6.get(str);
            this.f11424m.setText(str3);
            this.f11424m.setSelection(str3.length());
        } else {
            this.f11424m.setText("");
        }
        if (this.f11427p.m22439j0() != null) {
            this.f11427p.m22439j0().mo10646c(this);
            return;
        }
        this.f11416e.setText("❤️");
        this.f11417f.setText("🔥️");
        this.f11418g.setText("😄");
        this.f11419h.setText("👏️");
        this.f11420i.setText("🎉️");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m13798C(String str, View view) {
        zvf0.u("e_profile_moment_chat_send", "p_moment_chat", new j760[]{j760.a("moment_id", str), j760.a("moment_chat_send_from", "moment_chat_emoji"), j760.a("moment_type", CoreModule.N().Ur(str))});
        m13801M("❤️");
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13799C0() {
        return this.f11426o;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m13800L(String str, Detect detect) {
        if (detect == null) {
            this.f11427p.m22450z0(str);
        } else if (AntiSpamHelper.a(detect, this.f11426o.pageId())) {
            lsi0.w(R.string.c0);
        } else {
            lsi0.w(R.string.J7);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m13801M(final String str) {
        if (qib0.Z.K(str) || qib0.Z.M(str)) {
            this.f11424m.setText("");
            this.f11427p.m22449y0(4);
            act().hideInput();
            act().finish();
            return;
        }
        m13812y(str);
        this.f11424m.setText("");
        if (this.f11427p.m22439j0() == null) {
            this.f11427p.m22450z0(str);
        } else {
            CoreModule.N().po(this.f11426o, str, new e30() { // from class: l.fh00
                public final void call(Object obj) {
                    this.f10340a.m13800L(str, (Detect) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public void m13802N(int i) {
        if (i == 0 && this.f11428q) {
            act().finish();
            return;
        }
        if (i > 0) {
            if (this.f11428q && NullChecker.a(this.f11432u)) {
                this.f11432u.cancel();
            }
            m13805Q(i);
            this.f11428q = true;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m13803O(boolean z) {
        if (z && hm7.b() && NullChecker.a(this.f11433v) && !this.f11433v.isShowing()) {
            this.f11433v.setBackgroundDrawable(new ColorDrawable(0));
            this.f11433v.showAtLocation(this.f11426o.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m13782K() {
        this.f11424m.setFocusable(true);
        this.f11424m.setFocusableInTouchMode(true);
        this.f11424m.requestFocus();
        this.f11426o.showInput(this.f11424m, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m13805Q(int i) {
        Animator animatorU = bt0.u(true, this.f11431t, 390L, new Animator[]{bt0.q(this.f11413b, "translationY", new float[]{-i})});
        this.f11432u = animatorU;
        animatorU.start();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = this.f11426o.setUpKeyboardDetectorLayout(m13807q(layoutInflater, viewGroup), new View(this.f11426o), new h30() { // from class: l.tg00
            /* JADX INFO: renamed from: b */
            public final void m22951b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f20224a.m13775B((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (hm7.b()) {
            m13796u();
        }
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: q */
    public View m13807q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hh00.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MomentMessageAct act() {
        return this.f11426o;
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m13806i1(sg00 sg00Var) {
        this.f11427p = sg00Var;
    }

    /* JADX INFO: renamed from: w */
    public void m13810w() {
        if (NullChecker.a(this.f11433v) && this.f11433v.isShowing()) {
            this.f11433v.dismiss();
            this.f11433v = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public String m13811x() {
        return this.f11424m.getText().toString();
    }

    /* JADX INFO: renamed from: y */
    public final void m13812y(final String str) {
        e51.H(CoreModule.b, new Runnable() { // from class: l.ug00
            @Override // java.lang.Runnable
            public final void run() {
                gh00.m13785c(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: z */
    public void m13813z() {
        this.f11428q = false;
        bt0.u(true, this.f11431t, 390L, new Animator[]{bt0.q(this.f11413b, "translationY", new float[]{0.0f})}).start();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.gh00$a */
    public class C0589a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f11434a;

        public C0589a(User user) {
            this.f11434a = user;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable.toString());
            gh00 gh00Var = gh00.this;
            if (zIsEmpty) {
                gh00Var.f11424m.setMaxLines(1);
                VEditTextEmojiCompat vEditTextEmojiCompat = gh00.this.f11424m;
                StringBuilder sb = new StringBuilder(" ");
                sb.append(gh00.this.f11426o.getString(R.string.Ti, " " + this.f11434a.name));
                vEditTextEmojiCompat.setHint(sb.toString());
            } else {
                gh00Var.f11424m.setMaxLines(4);
                gh00.this.f11424m.setHint("");
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(editable.toString().trim());
            boolean z = !zIsEmpty2;
            gh00.this.f11425n.setTextColor(Color.parseColor(!zIsEmpty2 ? "#fffe7e1d" : "#19000000"));
            gh00.this.f11425n.setEnabled(z);
            xdl0.M(gh00.this.f11415d, zIsEmpty2);
            xdl0.M(gh00.this.f11414c, zIsEmpty2);
            if (gh00.this.f11427p.m22439j0() != null) {
                gh00.this.f11427p.m22439j0().mo10650g(editable.toString(), gh00.this);
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
