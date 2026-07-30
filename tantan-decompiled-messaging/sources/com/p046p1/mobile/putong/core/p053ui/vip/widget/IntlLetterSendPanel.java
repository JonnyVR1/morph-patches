package com.p046p1.mobile.putong.core.p053ui.vip.widget;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.LetterWrapper;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.c4g0;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.f6c0;
import p149l.hqn;
import p149l.lsi0;
import p149l.m250;
import p149l.mkd0;
import p149l.o7r;
import p149l.roj0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xma;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLetterSendPanel extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f37969a;

    /* JADX INFO: renamed from: b */
    public VText f37970b;

    /* JADX INFO: renamed from: c */
    public VText f37971c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f37972d;

    /* JADX INFO: renamed from: e */
    public VEditText f37973e;

    /* JADX INFO: renamed from: f */
    public VText f37974f;

    /* JADX INFO: renamed from: g */
    public VText f37975g;

    /* JADX INFO: renamed from: h */
    public VText f37976h;

    /* JADX INFO: renamed from: i */
    public VText f37977i;

    /* JADX INFO: renamed from: j */
    public C9030d f37978j;

    /* JADX INFO: renamed from: k */
    public e30<String> f37979k;

    /* JADX INFO: renamed from: l */
    public c4g0 f37980l;

    /* JADX INFO: renamed from: m */
    public d30 f37981m;

    /* JADX INFO: renamed from: n */
    public d30 f37982n;

    /* JADX INFO: renamed from: o */
    public List<LetterWrapper> f37983o;

    /* JADX INFO: renamed from: p */
    public List<LetterWrapper> f37984p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$a */
    public class C9027a implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a */
        public long f37985a;

        public C9027a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (SystemClock.uptimeMillis() - this.f37985a <= 500) {
                return false;
            }
            this.f37985a = SystemClock.uptimeMillis();
            if (i != 4 && i != 6 && (!NullChecker.m81303a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return true;
            }
            IntlLetterSendPanel.this.m57708r();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$b */
    public class C9028b implements TextWatcher {
        public C9028b() {
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
                        lsi0.m151580j(intlLetterSendPanel.getResources().getString(R$string.f18079R2, 30));
                    } else {
                        lsi0.m151580j(intlLetterSendPanel.getResources().getString(R$string.f18079R2, 60));
                    }
                    String strSubstring = string.substring(0, i5);
                    IntlLetterSendPanel.this.f37973e.setText(strSubstring);
                    if (selectionEnd > strSubstring.length()) {
                        selectionEnd = strSubstring.length();
                    }
                    Selection.setSelection(IntlLetterSendPanel.this.f37973e.getText(), selectionEnd);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$c */
    public class C9029c implements m250<roj0> {
        public C9029c() {
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(roj0 roj0Var) {
            if (NullChecker.m81303a(IntlLetterSendPanel.this.f37979k)) {
                IntlLetterSendPanel.this.f37979k.call(IntlLetterSendPanel.this.f37973e.getText().toString().trim());
            }
        }

        @Override // p149l.m250
        public void onCompleted() {
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$d */
    public static class C9030d extends dac0<LetterWrapper> {

        /* JADX INFO: renamed from: c */
        public Context f37989c;

        /* JADX INFO: renamed from: d */
        public List<LetterWrapper> f37990d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public e30<String> f37991e;

        public C9030d(Context context) {
            this.f37989c = context;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f37990d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(this.f37989c).inflate(f6c0.f95296Bd, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final LetterWrapper letterWrapper, int i, final int i2) {
            IntlLetterSendItem intlLetterSendItem = (IntlLetterSendItem) view;
            intlLetterSendItem.m57690l(letterWrapper);
            intlLetterSendItem.setOnClickListener(new View.OnClickListener() { // from class: l.gqn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f103962a.m57715H(letterWrapper, i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public LetterWrapper getItem(int i) {
            return this.f37990d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m57715H(LetterWrapper letterWrapper, int i, View view) {
            for (LetterWrapper letterWrapper2 : this.f37990d) {
                letterWrapper2.select = letterWrapper.equals(letterWrapper2);
            }
            if (NullChecker.m81303a(this.f37991e)) {
                this.f37991e.call(this.f37990d.get(i).letter);
            }
            HashMap map = new HashMap();
            map.put("text", Boolean.valueOf(this.f37990d.get(i).select));
            zvf0.m220397s("e_letter_text_bubble", "p_letter_sentmessage_page", map);
        }

        /* JADX INFO: renamed from: I */
        public void m57716I(List<LetterWrapper> list) {
            this.f37990d.clear();
            this.f37990d.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: J */
        public void m57717J(e30<String> e30Var) {
            this.f37991e = e30Var;
        }
    }

    public IntlLetterSendPanel(Context context) {
        super(context);
        this.f37983o = new ArrayList();
        this.f37984p = new LinkedList();
        m57700j(o7r.m163037a(context), this);
    }

    /* JADX INFO: renamed from: j */
    public View m57700j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hqn.m132459b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m57701k() {
        this.f37974f.setText(R$string.f18169U2);
        C9030d c9030d = new C9030d(getContext());
        this.f37978j = c9030d;
        c9030d.m57717J(new e30() { // from class: l.zpn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204270a.m57703m((String) obj);
            }
        });
        this.f37972d.setLayoutManager(new StaggeredGridLayoutManager(2, 0));
        this.f37972d.setAdapter(this.f37978j);
        xdl0.m208329E0(this.f37974f, new View.OnClickListener() { // from class: l.aqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71177a.m57704n(view);
            }
        });
        xdl0.m208329E0(this.f37977i, new View.OnClickListener() { // from class: l.bqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76793a.m57705o(view);
            }
        });
        this.f37973e.setHorizontallyScrolling(false);
        this.f37973e.setImeOptions(4);
        this.f37973e.setOnEditorActionListener(new C9027a());
        this.f37973e.addTextChangedListener(new C9028b());
        this.f37969a.setOnClickListener(new View.OnClickListener() { // from class: l.cqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82098a.m57706p(view);
            }
        });
        this.f37977i.setText(R$string.f18259X2);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m57702l(String str) {
        this.f37973e.requestFocus();
        this.f37973e.setText(str);
        VEditText vEditText = this.f37973e;
        vEditText.setSelection(vEditText.length());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m57703m(final String str) {
        this.f37973e.postDelayed(new Runnable() { // from class: l.eqn
            @Override // java.lang.Runnable
            public final void run() {
                this.f92813a.m57702l(str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m57704n(View view) {
        m57708r();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m57705o(View view) {
        this.f37981m.call();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mkd0.m154992z(this.f37980l);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57701k();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m57706p(View view) {
        this.f37982n.call();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m57707q() {
        if (NullChecker.m81303a(this.f37980l) && !this.f37980l.isUnsubscribed()) {
            this.f37980l.unsubscribe();
            this.f37980l = null;
        }
        this.f37980l = CoreModule.f17545c.f19582L0.m141021g3(this.f37973e.getText().toString().trim()).subscribe(mkd0.m154960L(new C9029c()));
    }

    /* JADX INFO: renamed from: r */
    public final void m57708r() {
        if (TextUtils.isEmpty(this.f37973e.getText().toString().trim())) {
            lsi0.m151578h(R$string.f17989O2);
            return;
        }
        d30 d30Var = new d30() { // from class: l.dqn
            @Override // p149l.d30
            public final void call() {
                this.f87459a.m57707q();
            }
        };
        zvf0.m220396r("e_letter_send_button", "p_letter_sentmessage_page");
        if (xma.m210047L3()) {
            d30Var.call();
        } else {
            CoreModule.m29935P().m94651a().mo33565pr((Act) getContext(), "letter", Privilege.letter);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m57709s() {
        for (LetterWrapper letterWrapper : this.f37983o) {
            if (!this.f37984p.contains(letterWrapper)) {
                this.f37984p.add(letterWrapper);
            }
        }
        this.f37978j.m57716I(this.f37984p);
    }

    public void setCloseCallBack(d30 d30Var) {
        this.f37982n = d30Var;
    }

    public void setLetterWrapperLibraries(List<LetterWrapper> list) {
        if (vwb.m200296J(this.f37983o)) {
            this.f37983o.addAll(list);
        }
    }

    public void setSendClickCallBack(e30<String> e30Var) {
        this.f37979k = e30Var;
    }

    public void setSuperLikeClickCallBack(d30 d30Var) {
        this.f37981m = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public void m57710t(User user, final d30 d30Var) {
        this.f37973e.setHint(TEnum.equals(user.gender, "female") ? R$string.f18019P2 : R$string.f18049Q2);
        this.f37970b.setText(TEnum.equals(user.gender, "female") ? R$string.f18381b3 : R$string.f18412c3);
        this.f37971c.setText(TEnum.equals(user.gender, "female") ? R$string.f18319Z2 : R$string.f18350a3);
        this.f37975g.setText(TEnum.equals(user.gender, "female") ? R$string.f18535g3 : R$string.f18504f3);
        this.f37976h.setText(TEnum.equals(user.gender, "female") ? R$string.f18443d3 : R$string.f18473e3);
        m57709s();
        setOnClickListener(new View.OnClickListener() { // from class: l.fqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    public IntlLetterSendPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37983o = new ArrayList();
        this.f37984p = new LinkedList();
        m57700j(o7r.m163037a(context), this);
    }

    public IntlLetterSendPanel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37983o = new ArrayList();
        this.f37984p = new LinkedList();
        m57700j(o7r.m163037a(context), this);
    }
}
