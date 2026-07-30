package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class dk6 implements s7m<wj6>, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public FrameLayout f86599a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f86600b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f86601c;

    /* JADX INFO: renamed from: d */
    public VText f86602d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f86603e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f86604f;

    /* JADX INFO: renamed from: g */
    public VEditTextEmojiCompat f86605g;

    /* JADX INFO: renamed from: h */
    public VImage f86606h;

    /* JADX INFO: renamed from: i */
    public VImage f86607i;

    /* JADX INFO: renamed from: j */
    public VText f86608j;

    /* JADX INFO: renamed from: k */
    public ConversationSearchAct f86609k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f86610l;

    /* JADX INFO: renamed from: m */
    public wj6 f86611m;

    /* JADX INFO: renamed from: n */
    public qj6 f86612n;

    /* JADX INFO: renamed from: o */
    public boolean f86613o = false;

    /* JADX INFO: renamed from: p */
    public int f86614p = 0;

    /* JADX INFO: renamed from: q */
    public final int f86615q = 3;

    /* JADX INFO: renamed from: r */
    public final qj6.InterfaceC19517a f86616r = new C16396a();

    /* JADX INFO: renamed from: l.dk6$a */
    public class C16396a implements qj6.InterfaceC19517a {
        public C16396a() {
        }

        @Override // p149l.qj6.InterfaceC19517a
        /* JADX INFO: renamed from: a */
        public void mo112185a(boolean z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            wj6 wj6Var = dk6.this.f86611m;
            List<Conversation> list = z ? wj6Var.f186608j : wj6Var.f186610l;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(list.get(i).f56011id);
            }
            if (!z) {
                for (int i2 = 0; i2 < dk6.this.f86611m.f186611m.size(); i2++) {
                    arrayList2.add(dk6.this.f86611m.f186611m.get(i2).f56011id);
                }
            }
            Editable text = dk6.this.f86605g.getText();
            ConversationSearchAct conversationSearchAct = dk6.this.f86609k;
            conversationSearchAct.startActivity(ConversationSearchAct.m42551b2(conversationSearchAct, -t100.m186890d(53.5f), NullChecker.m81303a(text) ? text.toString() : "", z ? ConversationSearchAct.f25951m : ConversationSearchAct.f25952n, arrayList, arrayList2));
            dk6.this.f86609k.overridePendingTransition(rzb0.f161648t, rzb0.f161649u);
        }
    }

    /* JADX INFO: renamed from: l.dk6$c */
    public class C16398c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f86619a;

        public C16398c(boolean z) {
            this.f86619a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f86619a && !dk6.this.act().isFinishing()) {
                dk6.this.act().m44477e2();
            }
            if (this.f86619a) {
                return;
            }
            CoreModule.f17545c.f19642f0.f19924b2.onNext(Boolean.TRUE);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (this.f86619a) {
                return;
            }
            CoreModule.f17545c.f19642f0.f19924b2.onNext(Boolean.FALSE);
        }
    }

    public dk6(ConversationSearchAct conversationSearchAct) {
        this.f86609k = conversationSearchAct;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m112163b(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m112169p(View view) {
        zvf0.m220396r("e_canncel_search", "p_chat_search");
        act().hideInput(this.f86605g);
        this.f86605g.clearFocus();
        m112175m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m112170q(View view) {
        this.f86605g.setText("");
        xdl0.m208344M(this.f86607i, false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f86609k;
    }

    /* JADX INFO: renamed from: h */
    public void m112171h(int i, int i2) {
        if (i > 0) {
            this.f86613o = true;
        }
        this.f86600b.setPadding(0, t100.m186890d(12.0f), 0, i);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m112172j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m112172j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ek6.m116925b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wj6 wj6Var) {
        this.f86611m = wj6Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m112174l() {
        e51.m114743H(act(), new Runnable() { // from class: l.bk6
            @Override // java.lang.Runnable
            public final void run() {
                this.f75967a.m112176n();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: m */
    public void m112175m() {
        this.f86613o = true;
        ValueAnimator valueAnimator = this.f86610l;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m112184z(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m112176n() {
        int i;
        if (this.f86613o || (i = this.f86614p) >= 3) {
            return;
        }
        this.f86614p = i + 1;
        this.f86605g.requestFocus();
        act().showInput(this.f86605g, 0);
        m112174l();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        m112183y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: r */
    public void m112177r() {
        String strString = this.f86609k.string(R$string.f18891rm);
        int i = this.f86611m.f186603e;
        if (i == ConversationSearchAct.f25953o) {
            strString = bjb.m102165q0() ? "输入昵称/聊天内容/ID搜索" : this.f86609k.string(R$string.f18951tm);
        } else if (i == ConversationSearchAct.f25952n) {
            strString = this.f86609k.string(R$string.f18861qm);
        }
        this.f86602d.setText(this.f86609k.string(R$string.f18921sm));
        this.f86605g.setSpaceHint(strString);
        xdl0.m208329E0(this.f86608j, new View.OnClickListener() { // from class: l.yj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198596a.m112169p(view);
            }
        });
        if (upa.m194847z()) {
            this.f86608j.setTextColor(Color.parseColor("#66000000"));
        }
        xdl0.m208329E0(this.f86607i, new View.OnClickListener() { // from class: l.zj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203384a.m112170q(view);
            }
        });
        ConversationSearchAct conversationSearchAct = this.f86609k;
        wj6 wj6Var = this.f86611m;
        this.f86612n = new qj6(conversationSearchAct, wj6Var.f186603e, wj6Var.f186605g, this.f86616r);
        this.f86600b.setLayoutManager(new LinearLayoutManager(act()));
        this.f86600b.setAdapter(this.f86612n);
        if (NullChecker.m81303a(this.f86609k.getIntent()) && this.f86609k.getIntent().hasExtra(ConversationSearchAct.f25946h)) {
            String stringExtra = this.f86609k.getIntent().getStringExtra(ConversationSearchAct.f25946h);
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f86605g.setText(stringExtra);
                this.f86611m.m203408t0(stringExtra);
            }
        }
        this.f86605g.addTextChangedListener(new C16397b());
        this.f86605g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ak6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return dk6.m112163b(textView, i2, keyEvent);
            }
        });
        this.f86599a.setPadding(0, t100.m186890d(48.0f) + xdl0.m208331F0(), 0, 0);
        xdl0.m208325C0(this.f86603e, t100.m186890d(44.0f) + xdl0.m208331F0());
        LinearLayout linearLayout = this.f86603e;
        int i2 = t100.f167261j;
        linearLayout.setPadding(i2, xdl0.m208331F0(), i2, 0);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m112178s(String str, List list, List list2, List list3, List list4) {
        this.f86612n.m174979L(str);
        this.f86612n.m174978K(list, list2, list3, list4);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m112179u() {
        this.f86605g.requestFocus();
        act().showInput(this.f86605g, 0);
        m112174l();
    }

    /* JADX INFO: renamed from: v */
    public void m112180v(final List<Conversation> list, final List<User> list2, final List<Conversation> list3, final List<Message> list4, final String str) {
        this.f86609k.runOnUiThread(new Runnable() { // from class: l.ck6
            @Override // java.lang.Runnable
            public final void run() {
                this.f81294a.m112178s(str, list, list2, list3, list4);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m112181w(boolean z) {
        xdl0.m208344M(this.f86600b, !z);
        if (z) {
            xdl0.m208344M(this.f86601c, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m112182x(boolean z) {
        xdl0.m208344M(this.f86601c, z);
        xdl0.m208344M(this.f86600b, !z);
    }

    /* JADX INFO: renamed from: y */
    public void m112183y(float f) {
        int intExtra = 0;
        if (NullChecker.m81303a(this.f86609k.getIntent()) && this.f86609k.getIntent().hasExtra(ConversationSearchAct.f25944f)) {
            intExtra = this.f86609k.getIntent().getIntExtra(ConversationSearchAct.f25944f, 0);
        }
        this.f86599a.setAlpha(f);
        this.f86603e.setAlpha(f);
        this.f86604f.setAlpha(Math.max(0.0f, Math.min(1.0f, 10.0f * f)));
        this.f86603e.setTranslationX(((xdl0.m208412y0() - t100.m186890d(53.5f)) - intExtra) * (1.0f - f));
    }

    /* JADX INFO: renamed from: z */
    public void m112184z(boolean z) {
        float fFloatValue = z ? 0.0f : 1.0f;
        float f = z ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.f86610l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) this.f86610l.getAnimatedValue()).floatValue();
            this.f86610l.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        this.f86610l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        this.f86610l.setDuration(350L);
        this.f86610l.addUpdateListener(this);
        this.f86610l.addListener(new C16398c(z));
        this.f86610l.start();
        if (z) {
            e51.m114743H(act(), new Runnable() { // from class: l.xj6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193183a.m112179u();
                }
            }, 100L);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.dk6$b */
    public class C16397b implements TextWatcher {
        public C16397b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            if (TextUtils.isEmpty(editable.toString()) || !TextUtils.isEmpty(strTrim)) {
                dk6.this.f86611m.m203407s0(editable.toString().trim());
            } else {
                dk6.this.f86611m.m203407s0("");
                dk6.this.f86605g.setText("");
            }
            xdl0.m208344M(dk6.this.f86607i, !TextUtils.isEmpty(strTrim));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
