package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.core.p053ui.moment.MomentMessageAct;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gh00 implements s7m<sg00> {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f102591a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f102592b;

    /* JADX INFO: renamed from: c */
    public TextView f102593c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f102594d;

    /* JADX INFO: renamed from: e */
    public VText f102595e;

    /* JADX INFO: renamed from: f */
    public VText f102596f;

    /* JADX INFO: renamed from: g */
    public VText f102597g;

    /* JADX INFO: renamed from: h */
    public VText f102598h;

    /* JADX INFO: renamed from: i */
    public VText f102599i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f102600j;

    /* JADX INFO: renamed from: k */
    public VLinear f102601k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f102602l;

    /* JADX INFO: renamed from: m */
    public VEditTextEmojiCompat f102603m;

    /* JADX INFO: renamed from: n */
    public TextView f102604n;

    /* JADX INFO: renamed from: o */
    public MomentMessageAct f102605o;

    /* JADX INFO: renamed from: p */
    public sg00 f102606p;

    /* JADX INFO: renamed from: r */
    public String f102608r;

    /* JADX INFO: renamed from: s */
    public String f102609s;

    /* JADX INFO: renamed from: v */
    public PopupWindow f102612v;

    /* JADX INFO: renamed from: q */
    public boolean f102607q = false;

    /* JADX INFO: renamed from: t */
    public Interpolator f102610t = new jig();

    /* JADX INFO: renamed from: u */
    public Animator f102611u = null;

    public gh00(MomentMessageAct momentMessageAct) {
        this.f102605o = momentMessageAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m126098B(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m126124N(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m126099E(String str, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", "p_moment_chat", j760.m140076a("moment_id", str), j760.m140076a("moment_chat_send_from", "moment_chat_emoji"), j760.m140076a("moment_type", CoreModule.m29934N().mo60326Ur(str)));
        m126123M("🔥");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m126100F(String str, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", "p_moment_chat", j760.m140076a("moment_id", str), j760.m140076a("moment_chat_send_from", "moment_chat_emoji"), j760.m140076a("moment_type", CoreModule.m29934N().mo60326Ur(str)));
        m126123M("😄");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m126101G(String str, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", "p_moment_chat", j760.m140076a("moment_id", str), j760.m140076a("moment_chat_send_from", "moment_chat_emoji"), j760.m140076a("moment_type", CoreModule.m29934N().mo60326Ur(str)));
        m126123M("👏");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m126102H(String str, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", "p_moment_chat", j760.m140076a("moment_id", str), j760.m140076a("moment_chat_send_from", "moment_chat_emoji"), j760.m140076a("moment_type", CoreModule.m29934N().mo60326Ur(str)));
        m126123M("🎉");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m126103I(String str, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", "p_moment_chat", j760.m140076a("moment_id", str), j760.m140076a("moment_chat_send_from", "moment_chat_send"), j760.m140076a("moment_type", CoreModule.m29934N().mo60326Ur(str)));
        String strTrim = this.f102603m.getText().toString().trim();
        m126123M(strTrim);
        if (this.f102606p.m184020j0() != null) {
            this.f102606p.m184020j0().mo104394h(strTrim);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m126104J(View view) {
        this.f102605o.hideInput();
        act().m47815F2();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m126108c(final String str) {
        if (Act.foreground_() == null || Act.foreground_().f15343a == null || Act.foreground_().f15343a.get() == null || !(Act.foreground_().f15343a.get() instanceof Act)) {
            return;
        }
        qib0.f154711Z.m119131Q(str, OmsDialog.p_user_passive_show_chat.getIdentifier()).subscribe(mkd0.m154956H(new e30() { // from class: l.vg00
            @Override // p149l.e30
            public final void call(Object obj) {
                gh00.m126118p(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.wg00
            @Override // p149l.e30
            public final void call(Object obj) {
                gh00.m126110e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m126110e(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m126118p(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreDlg.m45035W1((Act) Act.foreground_().f15343a.get(), str);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m126119u() {
        PopupWindow popupWindow = new PopupWindow();
        this.f102612v = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(f6c0.f96019te, (ViewGroup) null, false));
        this.f102612v.setInputMethodMode(1);
        this.f102612v.setWidth(0);
        this.f102612v.setHeight(0);
    }

    /* JADX INFO: renamed from: A */
    public void m126120A(final String str, String str2) {
        this.f102608r = str;
        this.f102609s = str2;
        User userById = CoreModule.m29932K().getUserById(str2);
        VEditTextEmojiCompat vEditTextEmojiCompat = this.f102603m;
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(this.f102605o.getString(R$string.f18155Ti, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + userById.name));
        vEditTextEmojiCompat.setHint(sb.toString());
        this.f102603m.setMaxLines(1);
        this.f102604n.setTypeface(Typeface.DEFAULT_BOLD);
        qib0.f154691G.m102341Q0(this.f102602l, CoreModule.m29932K().me_().m60124fp().profileSmall());
        this.f102607q = false;
        this.f102603m.addTextChangedListener(new C17078a(userById));
        xdl0.m208329E0(this.f102595e, new View.OnClickListener() { // from class: l.xg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192729a.m126121C(str, view);
            }
        });
        xdl0.m208329E0(this.f102596f, new View.OnClickListener() { // from class: l.yg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198109a.m126099E(str, view);
            }
        });
        xdl0.m208329E0(this.f102597g, new View.OnClickListener() { // from class: l.zg00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203000a.m126100F(str, view);
            }
        });
        xdl0.m208329E0(this.f102598h, new View.OnClickListener() { // from class: l.ah00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69538a.m126101G(str, view);
            }
        });
        xdl0.m208329E0(this.f102599i, new View.OnClickListener() { // from class: l.bh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75545a.m126102H(str, view);
            }
        });
        xdl0.m208329E0(this.f102604n, new View.OnClickListener() { // from class: l.ch00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80826a.m126103I(str, view);
            }
        });
        xdl0.m208329E0(this.f102591a, new View.OnClickListener() { // from class: l.dh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86225a.m126104J(view);
            }
        });
        e51.m114743H(this.f102605o, new Runnable() { // from class: l.eh00
            @Override // java.lang.Runnable
            public final void run() {
                this.f91275a.m126105K();
            }
        }, 200L);
        if (CoreModule.f17545c.f19639e0.f149244P6.containsKey(str)) {
            String str3 = CoreModule.f17545c.f19639e0.f149244P6.get(str);
            this.f102603m.setText(str3);
            this.f102603m.setSelection(str3.length());
        } else {
            this.f102603m.setText("");
        }
        if (this.f102606p.m184020j0() != null) {
            this.f102606p.m184020j0().mo104389c(this);
            return;
        }
        this.f102595e.setText("❤️");
        this.f102596f.setText("🔥️");
        this.f102597g.setText("😄");
        this.f102598h.setText("👏️");
        this.f102599i.setText("🎉️");
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m126121C(String str, View view) {
        zvf0.m220399u("e_profile_moment_chat_send", "p_moment_chat", j760.m140076a("moment_id", str), j760.m140076a("moment_chat_send_from", "moment_chat_emoji"), j760.m140076a("moment_type", CoreModule.m29934N().mo60326Ur(str)));
        m126123M("❤️");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f102605o;
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m126122L(String str, Detect detect) {
        if (detect == null) {
            this.f102606p.m184031z0(str);
        } else if (AntiSpamHelper.m80266a(detect, this.f102605o.pageId())) {
            lsi0.m151593w(R$string.f18409c0);
        } else {
            lsi0.m151593w(R$string.f17844J7);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m126123M(final String str) {
        if (qib0.f154711Z.m119125K(str) || qib0.f154711Z.m119127M(str)) {
            this.f102603m.setText("");
            this.f102606p.m184030y0(4);
            act().hideInput();
            act().m47815F2();
            return;
        }
        m126133y(str);
        this.f102603m.setText("");
        if (this.f102606p.m184020j0() == null) {
            this.f102606p.m184031z0(str);
        } else {
            CoreModule.m29934N().mo60383po(this.f102605o, str, new e30() { // from class: l.fh00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97466a.m126122L(str, (Detect) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: N */
    public void m126124N(int i) {
        if (i == 0 && this.f102607q) {
            act().m47815F2();
            return;
        }
        if (i > 0) {
            if (this.f102607q && NullChecker.m81303a(this.f102611u)) {
                this.f102611u.cancel();
            }
            m126127Q(i);
            this.f102607q = true;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m126125O(boolean z) {
        if (z && hm7.m131700b() && NullChecker.m81303a(this.f102612v) && !this.f102612v.isShowing()) {
            this.f102612v.setBackgroundDrawable(new ColorDrawable(0));
            this.f102612v.showAtLocation(this.f102605o.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m126105K() {
        this.f102603m.setFocusable(true);
        this.f102603m.setFocusableInTouchMode(true);
        this.f102603m.requestFocus();
        this.f102605o.showInput(this.f102603m, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m126127Q(int i) {
        Animator animatorM103748u = bt0.m103748u(true, this.f102610t, 390L, bt0.m103744q(this.f102592b, "translationY", -i));
        this.f102611u = animatorM103748u;
        animatorM103748u.start();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = this.f102605o.setUpKeyboardDetectorLayout(m126128q(layoutInflater, viewGroup), new View(this.f102605o), new h30() { // from class: l.tg00
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f170041a.m126098B((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        if (hm7.m131700b()) {
            m126119u();
        }
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: q */
    public View m126128q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hh00.m130931b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MomentMessageAct act() {
        return this.f102605o;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sg00 sg00Var) {
        this.f102606p = sg00Var;
    }

    /* JADX INFO: renamed from: w */
    public void m126131w() {
        if (NullChecker.m81303a(this.f102612v) && this.f102612v.isShowing()) {
            this.f102612v.dismiss();
            this.f102612v = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public String m126132x() {
        return this.f102603m.getText().toString();
    }

    /* JADX INFO: renamed from: y */
    public final void m126133y(final String str) {
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.ug00
            @Override // java.lang.Runnable
            public final void run() {
                gh00.m126108c(str);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: z */
    public void m126134z() {
        this.f102607q = false;
        bt0.m103748u(true, this.f102610t, 390L, bt0.m103744q(this.f102592b, "translationY", 0.0f)).start();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.gh00$a */
    public class C17078a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f102613a;

        public C17078a(User user) {
            this.f102613a = user;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable.toString());
            gh00 gh00Var = gh00.this;
            if (zIsEmpty) {
                gh00Var.f102603m.setMaxLines(1);
                VEditTextEmojiCompat vEditTextEmojiCompat = gh00.this.f102603m;
                StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(gh00.this.f102605o.getString(R$string.f18155Ti, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f102613a.name));
                vEditTextEmojiCompat.setHint(sb.toString());
            } else {
                gh00Var.f102603m.setMaxLines(4);
                gh00.this.f102603m.setHint("");
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(editable.toString().trim());
            boolean z = !zIsEmpty2;
            gh00.this.f102604n.setTextColor(Color.parseColor(!zIsEmpty2 ? "#fffe7e1d" : "#19000000"));
            gh00.this.f102604n.setEnabled(z);
            xdl0.m208344M(gh00.this.f102594d, zIsEmpty2);
            xdl0.m208344M(gh00.this.f102593c, zIsEmpty2);
            if (gh00.this.f102606p.m184020j0() != null) {
                gh00.this.f102606p.m184020j0().mo104393g(editable.toString(), gh00.this);
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
