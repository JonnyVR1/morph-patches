package com.p051p1.mobile.putong.core.p058ui.vip.widget;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.LetterWrapper;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bb50;
import p153l.bnl0;
import p153l.bsj0;
import p153l.hsn;
import p153l.i4g0;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.o1j0;
import p153l.p9r;
import p153l.psd0;
import p153l.uxj0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class IntlLetterSendPanel extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f38817a;

    /* JADX INFO: renamed from: b */
    public VText f38818b;

    /* JADX INFO: renamed from: c */
    public VText f38819c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f38820d;

    /* JADX INFO: renamed from: e */
    public VEditText f38821e;

    /* JADX INFO: renamed from: f */
    public VText f38822f;

    /* JADX INFO: renamed from: g */
    public VText f38823g;

    /* JADX INFO: renamed from: h */
    public VText f38824h;

    /* JADX INFO: renamed from: i */
    public VText f38825i;

    /* JADX INFO: renamed from: j */
    public C9193d f38826j;

    /* JADX INFO: renamed from: k */
    public y20<String> f38827k;

    /* JADX INFO: renamed from: l */
    public kcg0 f38828l;

    /* JADX INFO: renamed from: m */
    public x20 f38829m;

    /* JADX INFO: renamed from: n */
    public x20 f38830n;

    /* JADX INFO: renamed from: o */
    public List<LetterWrapper> f38831o;

    /* JADX INFO: renamed from: p */
    public List<LetterWrapper> f38832p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$a */
    public class C9190a implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a */
        public long f38833a;

        public C9190a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (SystemClock.uptimeMillis() - this.f38833a <= 500) {
                return false;
            }
            this.f38833a = SystemClock.uptimeMillis();
            if (i != 4 && i != 6 && (!NullChecker.m82486a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return true;
            }
            IntlLetterSendPanel.this.m58891r();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$b */
    public class C9191b implements TextWatcher {
        public C9191b() {
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
                        o1j0.m165636j(intlLetterSendPanel.getResources().getString(R$string.f18869T2, 30));
                    } else {
                        o1j0.m165636j(intlLetterSendPanel.getResources().getString(R$string.f18869T2, 60));
                    }
                    String strSubstring = string.substring(0, i5);
                    IntlLetterSendPanel.this.f38821e.setText(strSubstring);
                    if (selectionEnd > strSubstring.length()) {
                        selectionEnd = strSubstring.length();
                    }
                    Selection.setSelection(IntlLetterSendPanel.this.f38821e.getText(), selectionEnd);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$c */
    public class C9192c implements bb50<uxj0> {
        public C9192c() {
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(uxj0 uxj0Var) {
            if (NullChecker.m82486a(IntlLetterSendPanel.this.f38827k)) {
                IntlLetterSendPanel.this.f38827k.call(IntlLetterSendPanel.this.f38821e.getText().toString().trim());
            }
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel$d */
    public static class C9193d extends jic0<LetterWrapper> {

        /* JADX INFO: renamed from: c */
        public Context f38837c;

        /* JADX INFO: renamed from: d */
        public List<LetterWrapper> f38838d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public y20<String> f38839e;

        public C9193d(Context context) {
            this.f38837c = context;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f38838d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(this.f38837c).inflate(kec0.f125462Id, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final LetterWrapper letterWrapper, int i, final int i2) {
            IntlLetterSendItem intlLetterSendItem = (IntlLetterSendItem) view;
            intlLetterSendItem.m58873l(letterWrapper);
            intlLetterSendItem.setOnClickListener(new View.OnClickListener() { // from class: l.gsn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f106315a.m58898H(letterWrapper, i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public LetterWrapper getItem(int i) {
            return this.f38838d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m58898H(LetterWrapper letterWrapper, int i, View view) {
            for (LetterWrapper letterWrapper2 : this.f38838d) {
                letterWrapper2.select = letterWrapper.equals(letterWrapper2);
            }
            if (NullChecker.m82486a(this.f38839e)) {
                this.f38839e.call(this.f38838d.get(i).letter);
            }
            HashMap map = new HashMap();
            map.put("text", Boolean.valueOf(this.f38838d.get(i).select));
            i4g0.m138521s("e_letter_text_bubble", "p_letter_sentmessage_page", map);
        }

        /* JADX INFO: renamed from: I */
        public void m58899I(List<LetterWrapper> list) {
            this.f38838d.clear();
            this.f38838d.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: J */
        public void m58900J(y20<String> y20Var) {
            this.f38839e = y20Var;
        }
    }

    public IntlLetterSendPanel(Context context) {
        super(context);
        this.f38831o = new ArrayList();
        this.f38832p = new LinkedList();
        m58883j(p9r.m171370a(context), this);
    }

    /* JADX INFO: renamed from: j */
    public View m58883j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hsn.m136991b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m58884k() {
        this.f38822f.setText(R$string.f18959W2);
        C9193d c9193d = new C9193d(getContext());
        this.f38826j = c9193d;
        c9193d.m58900J(new y20() { // from class: l.zrn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205776a.m58886m((String) obj);
            }
        });
        this.f38820d.setLayoutManager(new StaggeredGridLayoutManager(2, 0));
        this.f38820d.setAdapter(this.f38826j);
        bnl0.m105509E0(this.f38822f, new View.OnClickListener() { // from class: l.asn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73148a.m58887n(view);
            }
        });
        bnl0.m105509E0(this.f38825i, new View.OnClickListener() { // from class: l.bsn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78180a.m58888o(view);
            }
        });
        this.f38821e.setHorizontallyScrolling(false);
        this.f38821e.setImeOptions(4);
        this.f38821e.setOnEditorActionListener(new C9190a());
        this.f38821e.addTextChangedListener(new C9191b());
        this.f38817a.setOnClickListener(new View.OnClickListener() { // from class: l.csn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83469a.m58889p(view);
            }
        });
        this.f38825i.setText(R$string.f19049Z2);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m58885l(String str) {
        this.f38821e.requestFocus();
        this.f38821e.setText(str);
        VEditText vEditText = this.f38821e;
        vEditText.setSelection(vEditText.length());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m58886m(final String str) {
        this.f38821e.postDelayed(new Runnable() { // from class: l.esn
            @Override // java.lang.Runnable
            public final void run() {
                this.f95643a.m58885l(str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m58887n(View view) {
        m58891r();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m58888o(View view) {
        this.f38829m.call();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        psd0.m173633z(this.f38828l);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58884k();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m58889p(View view) {
        this.f38830n.call();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m58890q() {
        if (NullChecker.m82486a(this.f38828l) && !this.f38828l.isUnsubscribed()) {
            this.f38828l.unsubscribe();
            this.f38828l = null;
        }
        this.f38828l = CoreModule.f18264c.f20324L0.m185528g3(this.f38821e.getText().toString().trim()).subscribe(psd0.m173601L(new C9192c()));
    }

    /* JADX INFO: renamed from: r */
    public final void m58891r() {
        if (TextUtils.isEmpty(this.f38821e.getText().toString().trim())) {
            o1j0.m165634h(R$string.f18779Q2);
            return;
        }
        x20 x20Var = new x20() { // from class: l.dsn
            @Override // p153l.x20
            public final void call() {
                this.f90499a.m58890q();
            }
        };
        i4g0.m138520r("e_letter_send_button", "p_letter_sentmessage_page");
        if (joa.m146361M3()) {
            x20Var.call();
        } else {
            CoreModule.m30933P().m143405a().mo34568pr((Act) getContext(), "letter", Privilege.letter);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m58892s() {
        for (LetterWrapper letterWrapper : this.f38831o) {
            if (!this.f38832p.contains(letterWrapper)) {
                this.f38832p.add(letterWrapper);
            }
        }
        this.f38826j.m58899I(this.f38832p);
    }

    public void setCloseCallBack(x20 x20Var) {
        this.f38830n = x20Var;
    }

    public void setLetterWrapperLibraries(List<LetterWrapper> list) {
        if (jyb.m147479J(this.f38831o)) {
            this.f38831o.addAll(list);
        }
    }

    public void setSendClickCallBack(y20<String> y20Var) {
        this.f38827k = y20Var;
    }

    public void setSuperLikeClickCallBack(x20 x20Var) {
        this.f38829m = x20Var;
    }

    /* JADX INFO: renamed from: t */
    public void m58893t(User user, final x20 x20Var) {
        this.f38821e.setHint(TEnum.equals(user.gender, "female") ? R$string.f18809R2 : R$string.f18839S2);
        this.f38818b.setText(TEnum.equals(user.gender, "female") ? R$string.f19173d3 : R$string.f19203e3);
        this.f38819c.setText(TEnum.equals(user.gender, "female") ? R$string.f19111b3 : R$string.f19142c3);
        this.f38823g.setText(TEnum.equals(user.gender, "female") ? R$string.f19327i3 : R$string.f19296h3);
        this.f38824h.setText(TEnum.equals(user.gender, "female") ? R$string.f19234f3 : R$string.f19265g3);
        m58892s();
        setOnClickListener(new View.OnClickListener() { // from class: l.fsn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    public IntlLetterSendPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38831o = new ArrayList();
        this.f38832p = new LinkedList();
        m58883j(p9r.m171370a(context), this);
    }

    public IntlLetterSendPanel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38831o = new ArrayList();
        this.f38832p = new LinkedList();
        m58883j(p9r.m171370a(context), this);
    }
}
