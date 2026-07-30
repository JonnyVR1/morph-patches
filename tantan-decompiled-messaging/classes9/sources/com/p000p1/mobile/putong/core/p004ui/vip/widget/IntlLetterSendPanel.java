package com.p000p1.mobile.putong.core.p004ui.vip.widget;

import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.LetterWrapper;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import l.c4g0;
import l.d30;
import l.dac0;
import l.e30;
import l.hqn;
import l.lsi0;
import l.m250;
import l.mkd0;
import l.o7r;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import p006l.f6c0;
import p006l.xma;
import v.VEditText;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlLetterSendPanel extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f7750a;

    /* JADX INFO: renamed from: b */
    public VText f7751b;

    /* JADX INFO: renamed from: c */
    public VText f7752c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f7753d;

    /* JADX INFO: renamed from: e */
    public VEditText f7754e;

    /* JADX INFO: renamed from: f */
    public VText f7755f;

    /* JADX INFO: renamed from: g */
    public VText f7756g;

    /* JADX INFO: renamed from: h */
    public VText f7757h;

    /* JADX INFO: renamed from: i */
    public VText f7758i;

    /* JADX INFO: renamed from: j */
    public C0466d f7759j;

    /* JADX INFO: renamed from: k */
    public e30<String> f7760k;

    /* JADX INFO: renamed from: l */
    public c4g0 f7761l;

    /* JADX INFO: renamed from: m */
    public d30 f7762m;

    /* JADX INFO: renamed from: n */
    public d30 f7763n;

    /* JADX INFO: renamed from: o */
    public List<LetterWrapper> f7764o;

    /* JADX INFO: renamed from: p */
    public List<LetterWrapper> f7765p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$a */
    public class C0463a implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a */
        public long f7766a;

        public C0463a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (SystemClock.uptimeMillis() - this.f7766a <= 500) {
                return false;
            }
            this.f7766a = SystemClock.uptimeMillis();
            if (i != 4 && i != 6 && (!NullChecker.a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return true;
            }
            IntlLetterSendPanel.this.m11201r();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$b */
    public class C0464b implements TextWatcher {
        public C0464b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string = charSequence.toString();
            int selectionEnd = Selection.getSelectionEnd(charSequence);
            int i4 = 0;
            boolean z = false;
            for (int i5 = 0; i5 < string.length(); i5++) {
                if (String.valueOf(string.charAt(i5)).matches("[^\\x00-\\xff]")) {
                    i4 += 2;
                    z = true;
                } else {
                    i4++;
                }
                if (i4 > 60) {
                    IntlLetterSendPanel intlLetterSendPanel = IntlLetterSendPanel.this;
                    if (z) {
                        lsi0.j(intlLetterSendPanel.getResources().getString(R$string.f2068R2, 30));
                    } else {
                        lsi0.j(intlLetterSendPanel.getResources().getString(R$string.f2068R2, 60));
                    }
                    String strSubstring = string.substring(0, i5);
                    IntlLetterSendPanel.this.f7754e.setText(strSubstring);
                    if (selectionEnd > strSubstring.length()) {
                        selectionEnd = strSubstring.length();
                    }
                    Selection.setSelection(IntlLetterSendPanel.this.f7754e.getText(), selectionEnd);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$c */
    public class C0465c implements m250<roj0> {
        public C0465c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(roj0 roj0Var) {
            if (NullChecker.a(IntlLetterSendPanel.this.f7760k)) {
                IntlLetterSendPanel.this.f7760k.call(IntlLetterSendPanel.this.f7754e.getText().toString().trim());
            }
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$d */
    public static class C0466d extends dac0<LetterWrapper> {

        /* JADX INFO: renamed from: c */
        public Context f7770c;

        /* JADX INFO: renamed from: d */
        public List<LetterWrapper> f7771d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public e30<String> f7772e;

        public C0466d(Context context) {
            this.f7770c = context;
        }

        /* JADX INFO: renamed from: C */
        public int m11207C() {
            return this.f7771d.size();
        }

        /* JADX INFO: renamed from: D */
        public View m11208D(ViewGroup viewGroup, int i) {
            return o7r.a(this.f7770c).inflate(f6c0.f11710Bd, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendItem] */
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m11206A(View view, final LetterWrapper letterWrapper, int i, final int i2) {
            ?? r1 = (IntlLetterSendItem) view;
            r1.m11183l(letterWrapper);
            r1.setOnClickListener(new View.OnClickListener() { // from class: l.gqn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f13446a.m11211H(letterWrapper, i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public LetterWrapper getItem(int i) {
            return this.f7771d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m11211H(LetterWrapper letterWrapper, int i, View view) {
            for (LetterWrapper letterWrapper2 : this.f7771d) {
                letterWrapper2.select = letterWrapper.equals(letterWrapper2);
            }
            if (NullChecker.a(this.f7772e)) {
                this.f7772e.call(this.f7771d.get(i).letter);
            }
            HashMap map = new HashMap();
            map.put("text", Boolean.valueOf(this.f7771d.get(i).select));
            zvf0.s("e_letter_text_bubble", "p_letter_sentmessage_page", map);
        }

        /* JADX INFO: renamed from: I */
        public void m11212I(List<LetterWrapper> list) {
            this.f7771d.clear();
            this.f7771d.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: J */
        public void m11213J(e30<String> e30Var) {
            this.f7772e = e30Var;
        }
    }

    public IntlLetterSendPanel(Context context) {
        super(context);
        this.f7764o = new ArrayList();
        this.f7765p = new LinkedList();
        m11193j(o7r.a(context), this);
    }

    /* JADX INFO: renamed from: j */
    public View m11193j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hqn.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m11194k() {
        this.f7755f.setText(R$string.f2158U2);
        C0466d c0466d = new C0466d(getContext());
        this.f7759j = c0466d;
        c0466d.m11213J(new e30() { // from class: l.zpn
            public final void call(Object obj) {
                this.f28906a.m11196m((String) obj);
            }
        });
        this.f7753d.setLayoutManager(new StaggeredGridLayoutManager(2, 0));
        this.f7753d.setAdapter(this.f7759j);
        xdl0.E0(this.f7755f, new View.OnClickListener() { // from class: l.aqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8447a.m11197n(view);
            }
        });
        xdl0.E0(this.f7758i, new View.OnClickListener() { // from class: l.bqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9038a.m11198o(view);
            }
        });
        this.f7754e.setHorizontallyScrolling(false);
        this.f7754e.setImeOptions(4);
        this.f7754e.setOnEditorActionListener(new C0463a());
        this.f7754e.addTextChangedListener(new C0464b());
        this.f7750a.setOnClickListener(new View.OnClickListener() { // from class: l.cqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9793a.m11199p(view);
            }
        });
        this.f7758i.setText(R$string.f2248X2);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m11195l(String str) {
        this.f7754e.requestFocus();
        this.f7754e.setText(str);
        VEditText vEditText = this.f7754e;
        vEditText.setSelection(vEditText.length());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m11196m(final String str) {
        this.f7754e.postDelayed(new Runnable() { // from class: l.eqn
            @Override // java.lang.Runnable
            public final void run() {
                this.f11402a.m11195l(str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11197n(View view) {
        m11201r();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m11198o(View view) {
        this.f7762m.call();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mkd0.z(this.f7761l);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11194k();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11199p(View view) {
        this.f7763n.call();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m11200q() {
        if (NullChecker.a(this.f7761l) && !this.f7761l.isUnsubscribed()) {
            this.f7761l.unsubscribe();
            this.f7761l = null;
        }
        this.f7761l = CoreModule.f1534c.f3571L0.m17431g3(this.f7754e.getText().toString().trim()).subscribe(mkd0.L(new C0465c()));
    }

    /* JADX INFO: renamed from: r */
    public final void m11201r() {
        if (TextUtils.isEmpty(this.f7754e.getText().toString().trim())) {
            lsi0.h(R$string.f1978O2);
            return;
        }
        d30 d30Var = new d30() { // from class: l.dqn
            public final void call() {
                this.f10529a.m11200q();
            }
        };
        zvf0.r("e_letter_send_button", "p_letter_sentmessage_page");
        if (xma.m27355L3()) {
            d30Var.call();
        } else {
            CoreModule.m1854P().m11706a().m5502pr((Act) getContext(), "letter", Privilege.letter);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m11202s() {
        for (LetterWrapper letterWrapper : this.f7764o) {
            if (!this.f7765p.contains(letterWrapper)) {
                this.f7765p.add(letterWrapper);
            }
        }
        this.f7759j.m11212I(this.f7765p);
    }

    public void setCloseCallBack(d30 d30Var) {
        this.f7763n = d30Var;
    }

    public void setLetterWrapperLibraries(List<LetterWrapper> list) {
        if (vwb.J(this.f7764o)) {
            this.f7764o.addAll(list);
        }
    }

    public void setSendClickCallBack(e30<String> e30Var) {
        this.f7760k = e30Var;
    }

    public void setSuperLikeClickCallBack(d30 d30Var) {
        this.f7762m = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m11203t(User user, final d30 d30Var) {
        this.f7754e.setHint(TEnum.equals(user.gender, "female") ? R$string.f2008P2 : R$string.f2038Q2);
        this.f7751b.setText(TEnum.equals(user.gender, "female") ? R$string.f2370b3 : R$string.f2401c3);
        this.f7752c.setText(TEnum.equals(user.gender, "female") ? R$string.f2308Z2 : R$string.f2339a3);
        this.f7756g.setText(TEnum.equals(user.gender, "female") ? R$string.f2524g3 : R$string.f2493f3);
        this.f7757h.setText(TEnum.equals(user.gender, "female") ? R$string.f2432d3 : R$string.f2462e3);
        m11202s();
        setOnClickListener(new View.OnClickListener() { // from class: l.fqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    public IntlLetterSendPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7764o = new ArrayList();
        this.f7765p = new LinkedList();
        m11193j(o7r.a(context), this);
    }

    public IntlLetterSendPanel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7764o = new ArrayList();
        this.f7765p = new LinkedList();
        m11193j(o7r.a(context), this);
    }
}
