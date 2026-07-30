package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class gl6 implements iam<zk6>, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public FrameLayout f104797a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f104798b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f104799c;

    /* JADX INFO: renamed from: d */
    public VText f104800d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f104801e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f104802f;

    /* JADX INFO: renamed from: g */
    public VEditTextEmojiCompat f104803g;

    /* JADX INFO: renamed from: h */
    public VImage f104804h;

    /* JADX INFO: renamed from: i */
    public VImage f104805i;

    /* JADX INFO: renamed from: j */
    public VText f104806j;

    /* JADX INFO: renamed from: k */
    public ConversationSearchAct f104807k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f104808l;

    /* JADX INFO: renamed from: m */
    public zk6 f104809m;

    /* JADX INFO: renamed from: n */
    public tk6 f104810n;

    /* JADX INFO: renamed from: o */
    public boolean f104811o = false;

    /* JADX INFO: renamed from: p */
    public int f104812p = 0;

    /* JADX INFO: renamed from: q */
    public final int f104813q = 3;

    /* JADX INFO: renamed from: r */
    public final tk6.InterfaceC20337a f104814r = new C17242a();

    /* JADX INFO: renamed from: l.gl6$a */
    public class C17242a implements tk6.InterfaceC20337a {
        public C17242a() {
        }

        @Override // p153l.tk6.InterfaceC20337a
        /* JADX INFO: renamed from: a */
        public void mo130640a(boolean z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            zk6 zk6Var = gl6.this.f104809m;
            List<Conversation> list = z ? zk6Var.f204741j : zk6Var.f204743l;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(list.get(i).f56859id);
            }
            if (!z) {
                for (int i2 = 0; i2 < gl6.this.f104809m.f204744m.size(); i2++) {
                    arrayList2.add(gl6.this.f104809m.f204744m.get(i2).f56859id);
                }
            }
            Editable text = gl6.this.f104803g.getText();
            ConversationSearchAct conversationSearchAct = gl6.this.f104807k;
            conversationSearchAct.startActivity(ConversationSearchAct.m43562c2(conversationSearchAct, -qa00.m175859d(53.5f), NullChecker.m82486a(text) ? text.toString() : "", z ? ConversationSearchAct.f26693m : ConversationSearchAct.f26694n, arrayList, arrayList2));
            gl6.this.f104807k.overridePendingTransition(x7c0.f192705t, x7c0.f192706u);
        }
    }

    /* JADX INFO: renamed from: l.gl6$c */
    public class C17244c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f104817a;

        public C17244c(boolean z) {
            this.f104817a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f104817a && !gl6.this.act().isFinishing()) {
                gl6.this.act().m45660g2();
            }
            if (this.f104817a) {
                return;
            }
            CoreModule.f18264c.f20384f0.f20666b2.onNext(Boolean.TRUE);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (this.f104817a) {
                return;
            }
            CoreModule.f18264c.f20384f0.f20666b2.onNext(Boolean.FALSE);
        }
    }

    public gl6(ConversationSearchAct conversationSearchAct) {
        this.f104807k = conversationSearchAct;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m130618b(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m130624p(View view) {
        i4g0.m138520r("e_canncel_search", "p_chat_search");
        act().hideInput(this.f104803g);
        this.f104803g.clearFocus();
        m130630m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m130625q(View view) {
        this.f104803g.setText("");
        bnl0.m105524M(this.f104805i, false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    @Override // p153l.iam
    public Act act() {
        return this.f104807k;
    }

    /* JADX INFO: renamed from: h */
    public void m130626h(int i, int i2) {
        if (i > 0) {
            this.f104811o = true;
        }
        this.f104798b.setPadding(0, qa00.m175859d(12.0f), 0, i);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m130627j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m130627j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hl6.m135695b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zk6 zk6Var) {
        this.f104809m = zk6Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m130629l() {
        l51.m152888H(act(), new Runnable() { // from class: l.el6
            @Override // java.lang.Runnable
            public final void run() {
                this.f94480a.m130631n();
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: m */
    public void m130630m() {
        this.f104811o = true;
        ValueAnimator valueAnimator = this.f104808l;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m130639z(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m130631n() {
        int i;
        if (this.f104811o || (i = this.f104812p) >= 3) {
            return;
        }
        this.f104812p = i + 1;
        this.f104803g.requestFocus();
        act().showInput(this.f104803g, 0);
        m130629l();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        m130638y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: r */
    public void m130632r() {
        String strString = this.f104807k.string(R$string.f18709Nm);
        int i = this.f104809m.f204736e;
        if (i == ConversationSearchAct.f26695o) {
            strString = pkb.m172596q0() ? "输入昵称/聊天内容/ID搜索" : this.f104807k.string(R$string.f18769Pm);
        } else if (i == ConversationSearchAct.f26694n) {
            strString = this.f104807k.string(R$string.f18679Mm);
        }
        this.f104800d.setText(this.f104807k.string(R$string.f18739Om));
        this.f104803g.setSpaceHint(strString);
        bnl0.m105509E0(this.f104806j, new View.OnClickListener() { // from class: l.bl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77148a.m130624p(view);
            }
        });
        if (gra.m131778z()) {
            this.f104806j.setTextColor(Color.parseColor("#66000000"));
        }
        bnl0.m105509E0(this.f104805i, new View.OnClickListener() { // from class: l.cl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82348a.m130625q(view);
            }
        });
        ConversationSearchAct conversationSearchAct = this.f104807k;
        zk6 zk6Var = this.f104809m;
        this.f104810n = new tk6(conversationSearchAct, zk6Var.f204736e, zk6Var.f204738g, this.f104814r);
        this.f104798b.setLayoutManager(new LinearLayoutManager(act()));
        this.f104798b.setAdapter(this.f104810n);
        if (NullChecker.m82486a(this.f104807k.getIntent()) && this.f104807k.getIntent().hasExtra(ConversationSearchAct.f26688h)) {
            String stringExtra = this.f104807k.getIntent().getStringExtra(ConversationSearchAct.f26688h);
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f104803g.setText(stringExtra);
                this.f104809m.m220066t0(stringExtra);
            }
        }
        this.f104803g.addTextChangedListener(new C17243b());
        this.f104803g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.dl6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return gl6.m130618b(textView, i2, keyEvent);
            }
        });
        this.f104797a.setPadding(0, qa00.m175859d(48.0f) + bnl0.m105511F0(), 0, 0);
        bnl0.m105505C0(this.f104801e, qa00.m175859d(44.0f) + bnl0.m105511F0());
        LinearLayout linearLayout = this.f104801e;
        int i2 = qa00.f156323j;
        linearLayout.setPadding(i2, bnl0.m105511F0(), i2, 0);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m130633s(String str, List list, List list2, List list3, List list4) {
        this.f104810n.m191539L(str);
        this.f104810n.m191538K(list, list2, list3, list4);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m130634u() {
        this.f104803g.requestFocus();
        act().showInput(this.f104803g, 0);
        m130629l();
    }

    /* JADX INFO: renamed from: v */
    public void m130635v(final List<Conversation> list, final List<User> list2, final List<Conversation> list3, final List<Message> list4, final String str) {
        this.f104807k.runOnUiThread(new Runnable() { // from class: l.fl6
            @Override // java.lang.Runnable
            public final void run() {
                this.f99617a.m130633s(str, list, list2, list3, list4);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m130636w(boolean z) {
        bnl0.m105524M(this.f104798b, !z);
        if (z) {
            bnl0.m105524M(this.f104799c, false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m130637x(boolean z) {
        bnl0.m105524M(this.f104799c, z);
        bnl0.m105524M(this.f104798b, !z);
    }

    /* JADX INFO: renamed from: y */
    public void m130638y(float f) {
        int intExtra = 0;
        if (NullChecker.m82486a(this.f104807k.getIntent()) && this.f104807k.getIntent().hasExtra(ConversationSearchAct.f26686f)) {
            intExtra = this.f104807k.getIntent().getIntExtra(ConversationSearchAct.f26686f, 0);
        }
        this.f104797a.setAlpha(f);
        this.f104801e.setAlpha(f);
        this.f104802f.setAlpha(Math.max(0.0f, Math.min(1.0f, 10.0f * f)));
        this.f104801e.setTranslationX(((bnl0.m105592y0() - qa00.m175859d(53.5f)) - intExtra) * (1.0f - f));
    }

    /* JADX INFO: renamed from: z */
    public void m130639z(boolean z) {
        float fFloatValue = z ? 0.0f : 1.0f;
        float f = z ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.f104808l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) this.f104808l.getAnimatedValue()).floatValue();
            this.f104808l.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        this.f104808l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        this.f104808l.setDuration(350L);
        this.f104808l.addUpdateListener(this);
        this.f104808l.addListener(new C17244c(z));
        this.f104808l.start();
        if (z) {
            l51.m152888H(act(), new Runnable() { // from class: l.al6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72074a.m130634u();
                }
            }, 100L);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.gl6$b */
    public class C17243b implements TextWatcher {
        public C17243b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            if (TextUtils.isEmpty(editable.toString()) || !TextUtils.isEmpty(strTrim)) {
                gl6.this.f104809m.m220065s0(editable.toString().trim());
            } else {
                gl6.this.f104809m.m220065s0("");
                gl6.this.f104803g.setText("");
            }
            bnl0.m105524M(gl6.this.f104805i, !TextUtils.isEmpty(strTrim));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
