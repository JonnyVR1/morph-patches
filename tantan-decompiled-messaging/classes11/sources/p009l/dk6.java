package p009l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.messages.emoji.VEditTextEmojiCompat;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bjb;
import l.e51;
import l.ek6;
import l.rzb0;
import l.s7m;
import l.t100;
import l.upa;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dk6 implements s7m<wj6>, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public FrameLayout f11864a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f11865b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f11866c;

    /* JADX INFO: renamed from: d */
    public VText f11867d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f11868e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f11869f;

    /* JADX INFO: renamed from: g */
    public VEditTextEmojiCompat f11870g;

    /* JADX INFO: renamed from: h */
    public VImage f11871h;

    /* JADX INFO: renamed from: i */
    public VImage f11872i;

    /* JADX INFO: renamed from: j */
    public VText f11873j;

    /* JADX INFO: renamed from: k */
    public ConversationSearchAct f11874k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f11875l;

    /* JADX INFO: renamed from: m */
    public wj6 f11876m;

    /* JADX INFO: renamed from: n */
    public qj6 f11877n;

    /* JADX INFO: renamed from: o */
    public boolean f11878o = false;

    /* JADX INFO: renamed from: p */
    public int f11879p = 0;

    /* JADX INFO: renamed from: q */
    public final int f11880q = 3;

    /* JADX INFO: renamed from: r */
    public final qj6.InterfaceC1148a f11881r = new C0852a();

    /* JADX INFO: renamed from: l.dk6$a */
    public class C0852a implements qj6.InterfaceC1148a {
        public C0852a() {
        }

        @Override // p009l.qj6.InterfaceC1148a
        /* JADX INFO: renamed from: a */
        public void mo13421a(boolean z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            wj6 wj6Var = dk6.this.f11876m;
            List<Conversation> list = z ? wj6Var.f22152j : wj6Var.f22154l;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(((DbObject) list.get(i)).id);
            }
            if (!z) {
                for (int i2 = 0; i2 < dk6.this.f11876m.f22155m.size(); i2++) {
                    arrayList2.add(((DbObject) dk6.this.f11876m.f22155m.get(i2)).id);
                }
            }
            Editable text = dk6.this.f11870g.getText();
            PutongMvpAct putongMvpAct = dk6.this.f11874k;
            putongMvpAct.startActivity(ConversationSearchAct.m6710b2(putongMvpAct, -t100.d(53.5f), NullChecker.a(text) ? text.toString() : "", z ? ConversationSearchAct.f4729m : ConversationSearchAct.f4730n, arrayList, arrayList2));
            dk6.this.f11874k.overridePendingTransition(rzb0.t, rzb0.u);
        }
    }

    /* JADX INFO: renamed from: l.dk6$c */
    public class C0854c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f11884a;

        public C0854c(boolean z) {
            this.f11884a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f11884a && !dk6.this.act().isFinishing()) {
                dk6.this.act().finish();
            }
            if (this.f11884a) {
                return;
            }
            CoreModule.c.f0.b2.onNext(Boolean.TRUE);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (this.f11884a) {
                return;
            }
            CoreModule.c.f0.b2.onNext(Boolean.FALSE);
        }
    }

    public dk6(ConversationSearchAct conversationSearchAct) {
        this.f11874k = conversationSearchAct;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m13397b(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m13403p(View view) {
        zvf0.r("e_canncel_search", "p_chat_search");
        act().hideInput(this.f11870g);
        this.f11870g.clearFocus();
        m13411m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m13404q(View view) {
        this.f11870g.setText("");
        xdl0.M(this.f11872i, false);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m13405C0() {
        return act();
    }

    public Act act() {
        return this.f11874k;
    }

    /* JADX INFO: renamed from: h */
    public void m13406h(int i, int i2) {
        if (i > 0) {
            this.f11878o = true;
        }
        this.f11865b.setPadding(0, t100.d(12.0f), 0, i);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13408j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m13408j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ek6.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m13407i1(wj6 wj6Var) {
        this.f11876m = wj6Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m13410l() {
        e51.H(act(), new Runnable() { // from class: l.bk6
            @Override // java.lang.Runnable
            public final void run() {
                this.f10148a.m13412n();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: m */
    public void m13411m() {
        this.f11878o = true;
        ValueAnimator valueAnimator = this.f11875l;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m13420z(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m13412n() {
        int i;
        if (this.f11878o || (i = this.f11879p) >= 3) {
            return;
        }
        this.f11879p = i + 1;
        this.f11870g.requestFocus();
        act().showInput(this.f11870g, 0);
        m13410l();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        m13419y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: r */
    public void m13413r() {
        String strString = this.f11874k.string(R.string.rm);
        int i = this.f11876m.f22147e;
        if (i == ConversationSearchAct.f4731o) {
            strString = bjb.q0() ? "输入昵称/聊天内容/ID搜索" : this.f11874k.string(R.string.tm);
        } else if (i == ConversationSearchAct.f4730n) {
            strString = this.f11874k.string(R.string.qm);
        }
        this.f11867d.setText(this.f11874k.string(R.string.sm));
        this.f11870g.setSpaceHint(strString);
        xdl0.E0(this.f11873j, new View.OnClickListener() { // from class: l.yj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23105a.m13403p(view);
            }
        });
        if (upa.z()) {
            this.f11873j.setTextColor(Color.parseColor("#66000000"));
        }
        xdl0.E0(this.f11872i, new View.OnClickListener() { // from class: l.zj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23708a.m13404q(view);
            }
        });
        ConversationSearchAct conversationSearchAct = this.f11874k;
        wj6 wj6Var = this.f11876m;
        this.f11877n = new qj6(conversationSearchAct, wj6Var.f22147e, wj6Var.f22149g, this.f11881r);
        this.f11865b.setLayoutManager(new LinearLayoutManager(act()));
        this.f11865b.setAdapter(this.f11877n);
        if (NullChecker.a(this.f11874k.getIntent()) && this.f11874k.getIntent().hasExtra(ConversationSearchAct.f4724h)) {
            String stringExtra = this.f11874k.getIntent().getStringExtra(ConversationSearchAct.f4724h);
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f11870g.setText(stringExtra);
                this.f11876m.m24261t0(stringExtra);
            }
        }
        this.f11870g.addTextChangedListener(new C0853b());
        this.f11870g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ak6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return dk6.m13397b(textView, i2, keyEvent);
            }
        });
        this.f11864a.setPadding(0, t100.d(48.0f) + xdl0.F0(), 0, 0);
        xdl0.C0(this.f11868e, t100.d(44.0f) + xdl0.F0());
        LinearLayout linearLayout = this.f11868e;
        int i2 = t100.j;
        linearLayout.setPadding(i2, xdl0.F0(), i2, 0);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m13414s(String str, List list, List list2, List list3, List list4) {
        this.f11877n.m21078L(str);
        this.f11877n.m21077K(list, list2, list3, list4);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m13415u() {
        this.f11870g.requestFocus();
        act().showInput(this.f11870g, 0);
        m13410l();
    }

    /* JADX INFO: renamed from: v */
    public void m13416v(final List<Conversation> list, final List<User> list2, final List<Conversation> list3, final List<Message> list4, final String str) {
        this.f11874k.runOnUiThread(new Runnable() { // from class: l.ck6
            @Override // java.lang.Runnable
            public final void run() {
                this.f10652a.m13414s(str, list, list2, list3, list4);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m13417w(boolean z) {
        xdl0.M(this.f11865b, !z);
        if (z) {
            xdl0.M(this.f11866c, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m13418x(boolean z) {
        xdl0.M(this.f11866c, z);
        xdl0.M(this.f11865b, !z);
    }

    /* JADX INFO: renamed from: y */
    public void m13419y(float f) {
        int intExtra = 0;
        if (NullChecker.a(this.f11874k.getIntent()) && this.f11874k.getIntent().hasExtra(ConversationSearchAct.f4722f)) {
            intExtra = this.f11874k.getIntent().getIntExtra(ConversationSearchAct.f4722f, 0);
        }
        this.f11864a.setAlpha(f);
        this.f11868e.setAlpha(f);
        this.f11869f.setAlpha(Math.max(0.0f, Math.min(1.0f, 10.0f * f)));
        this.f11868e.setTranslationX(((xdl0.y0() - t100.d(53.5f)) - intExtra) * (1.0f - f));
    }

    /* JADX INFO: renamed from: z */
    public void m13420z(boolean z) {
        float fFloatValue = z ? 0.0f : 1.0f;
        float f = z ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.f11875l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) this.f11875l.getAnimatedValue()).floatValue();
            this.f11875l.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        this.f11875l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        this.f11875l.setDuration(350L);
        this.f11875l.addUpdateListener(this);
        this.f11875l.addListener(new C0854c(z));
        this.f11875l.start();
        if (z) {
            e51.H(act(), new Runnable() { // from class: l.xj6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22625a.m13415u();
                }
            }, 100L);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.dk6$b */
    public class C0853b implements TextWatcher {
        public C0853b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            if (TextUtils.isEmpty(editable.toString()) || !TextUtils.isEmpty(strTrim)) {
                dk6.this.f11876m.m24260s0(editable.toString().trim());
            } else {
                dk6.this.f11876m.m24260s0("");
                dk6.this.f11870g.setText("");
            }
            xdl0.M(dk6.this.f11872i, !TextUtils.isEmpty(strTrim));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
