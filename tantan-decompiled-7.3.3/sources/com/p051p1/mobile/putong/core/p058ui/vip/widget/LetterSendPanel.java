package com.p051p1.mobile.putong.core.p058ui.vip.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterSendPanel;
import com.p051p1.mobile.putong.data.LetterWrapper;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.adc0;
import p153l.bb50;
import p153l.bfx;
import p153l.bnl0;
import p153l.bri0;
import p153l.bsj0;
import p153l.d79;
import p153l.dbc0;
import p153l.dyf0;
import p153l.e1b;
import p153l.fsb0;
import p153l.i4g0;
import p153l.jde;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.llb0;
import p153l.o1j0;
import p153l.p9r;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qdr;
import p153l.r1j0;
import p153l.r43;
import p153l.rbb0;
import p153l.rgk0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vx6;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
public class LetterSendPanel extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f38854a;

    /* JADX INFO: renamed from: b */
    public TextView f38855b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f38856c;

    /* JADX INFO: renamed from: d */
    public VText f38857d;

    /* JADX INFO: renamed from: e */
    public VText f38858e;

    /* JADX INFO: renamed from: f */
    public VImage f38859f;

    /* JADX INFO: renamed from: g */
    public TextView f38860g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f38861h;

    /* JADX INFO: renamed from: i */
    public TextView f38862i;

    /* JADX INFO: renamed from: j */
    public VText f38863j;

    /* JADX INFO: renamed from: k */
    public TextView f38864k;

    /* JADX INFO: renamed from: l */
    public VEditText f38865l;

    /* JADX INFO: renamed from: m */
    public TextView f38866m;

    /* JADX INFO: renamed from: n */
    public C9200e f38867n;

    /* JADX INFO: renamed from: o */
    public y20<String> f38868o;

    /* JADX INFO: renamed from: p */
    public kcg0 f38869p;

    /* JADX INFO: renamed from: q */
    public String f38870q;

    /* JADX INFO: renamed from: r */
    public User f38871r;

    /* JADX INFO: renamed from: s */
    public List<LetterWrapper> f38872s;

    /* JADX INFO: renamed from: t */
    public List<LetterWrapper> f38873t;

    /* JADX INFO: renamed from: u */
    public boolean f38874u;

    /* JADX INFO: renamed from: v */
    public final z20<Throwable, String> f38875v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$a */
    public class C9196a implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a */
        public long f38876a;

        public C9196a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (SystemClock.uptimeMillis() - this.f38876a <= 500) {
                return false;
            }
            this.f38876a = SystemClock.uptimeMillis();
            if (i != 4 && i != 6 && (!NullChecker.m82486a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return true;
            }
            LetterSendPanel.this.m58927A();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$b */
    public class C9197b implements TextWatcher {
        public C9197b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ("spotlight_messages".equals(LetterSendPanel.this.f38870q)) {
                int length = LetterSendPanel.this.f38865l.getText().toString().length();
                LetterSendPanel letterSendPanel = LetterSendPanel.this;
                if (length != 0) {
                    letterSendPanel.f38866m.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    letterSendPanel.f38866m.setTextColor(Color.parseColor("#66ffffff"));
                    LetterSendPanel.this.f38867n.m58947G();
                }
            }
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
                    LetterSendPanel letterSendPanel = LetterSendPanel.this;
                    if (z) {
                        o1j0.m165636j(letterSendPanel.getResources().getString(R$string.f18869T2, 30));
                    } else {
                        o1j0.m165636j(letterSendPanel.getResources().getString(R$string.f18869T2, 60));
                    }
                    String strSubstring = string.substring(0, i5);
                    LetterSendPanel.this.f38865l.setText(strSubstring);
                    if (selectionEnd > strSubstring.length()) {
                        selectionEnd = strSubstring.length();
                    }
                    Selection.setSelection(LetterSendPanel.this.f38865l.getText(), selectionEnd);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$c */
    public class C9198c implements bb50<uxj0> {
        public C9198c() {
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(uxj0 uxj0Var) {
            if (NullChecker.m82486a(LetterSendPanel.this.f38868o)) {
                LetterSendPanel.this.f38868o.call(LetterSendPanel.this.f38865l.getText().toString().trim());
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$d */
    public class C9199d implements z20<Throwable, String> {
        public C9199d() {
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th, String str) {
            if (NullChecker.m82486a(th)) {
                if (!TantanException.Client.TantanForbidden.isIllegalContent(th)) {
                    bfx.m104083f(R$string.f18884Th, LetterSendPanel.this.f38871r.m61308fp().profileSmall());
                    return;
                } else {
                    CoreModule.f18264c.f20384f0.m33753Of(str);
                    r1j0.m179419f(R$string.f18634L7);
                    return;
                }
            }
            View viewInflate = p9r.m171370a(LetterSendPanel.this.getContext()).inflate(kec0.f125766bc, (ViewGroup) null);
            fsb0 fsb0Var = uqb0.f180374G;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(adc0.f69879E6);
            LetterSendPanel letterSendPanel = LetterSendPanel.this;
            fsb0Var.m127125Q0(simpleDraweeView, letterSendPanel.m58932q(letterSendPanel.f38871r));
            dyf0 dyf0VarM118689m = new dyf0.C16658a((Act) LetterSendPanel.this.getContext(), viewInflate).m118689m();
            dyf0VarM118689m.m126745x(CorePopLevel.SPOT_PUSH_BUBBLE);
            llb0.m154703c().m154710i(dyf0VarM118689m);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$e */
    public static class C9200e extends jic0<LetterWrapper> {

        /* JADX INFO: renamed from: c */
        public Context f38881c;

        /* JADX INFO: renamed from: d */
        public List<LetterWrapper> f38882d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public String f38883e;

        /* JADX INFO: renamed from: f */
        public y20<String> f38884f;

        public C9200e(Context context) {
            this.f38881c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m58945I(LetterWrapper letterWrapper, int i, View view) {
            for (LetterWrapper letterWrapper2 : this.f38882d) {
                letterWrapper2.select = letterWrapper.equals(letterWrapper2);
            }
            if (NullChecker.m82486a(this.f38884f)) {
                this.f38884f.call(this.f38882d.get(i).letter);
            }
            notifyDataSetChanged();
            HashMap map = new HashMap();
            map.put("text", Boolean.valueOf(this.f38882d.get(i).select));
            i4g0.m138521s("e_letter_text_bubble", "p_letter_sentmessage_page", map);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f38882d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(this.f38881c).inflate(kec0.f125558Od, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final LetterWrapper letterWrapper, int i, final int i2) {
            LetterSendItem letterSendItem = (LetterSendItem) view;
            if ("spotlight_messages".equals(this.f38883e)) {
                bnl0.m105550d0(letterSendItem, qa00.m175859d(15.0f));
                bnl0.m105552e0(letterSendItem, qa00.m175859d(15.0f));
            }
            letterSendItem.m58911l(letterWrapper, this.f38883e);
            letterSendItem.setOnClickListener(new View.OnClickListener() { // from class: l.pdr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f151825a.m58945I(letterWrapper, i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G */
        public void m58947G() {
            Iterator<LetterWrapper> it = this.f38882d.iterator();
            while (it.hasNext()) {
                it.next().select = false;
            }
            notifyDataSetChanged();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public LetterWrapper getItem(int i) {
            return this.f38882d.get(i);
        }

        /* JADX INFO: renamed from: J */
        public void m58949J(List<LetterWrapper> list, String str) {
            this.f38882d.clear();
            this.f38883e = str;
            this.f38882d.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: K */
        public void m58950K(y20<String> y20Var) {
            this.f38884f = y20Var;
        }
    }

    public LetterSendPanel(Context context) {
        super(context);
        this.f38872s = new ArrayList();
        this.f38873t = new LinkedList();
        this.f38875v = new C9199d();
        m58931p(p9r.m171370a(context), this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m58917f(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m58927A() {
        if (TextUtils.isEmpty(this.f38865l.getText().toString().trim())) {
            o1j0.m165634h(R$string.f18779Q2);
            return;
        }
        x20 x20Var = new x20() { // from class: l.ldr
            @Override // p153l.x20
            public final void call() {
                this.f131665a.m58939x();
            }
        };
        x20 x20Var2 = new x20() { // from class: l.mdr
            @Override // p153l.x20
            public final void call() {
                this.f136403a.m58941z();
            }
        };
        if ("spotlight_messages".equals(this.f38870q)) {
            i4g0.m138520r("e_spotlight_msg_send_button", "p_spotlight_chat_popup");
            if (uqb0.f180394Z.m95954K(this.f38865l.getText().toString().trim())) {
                ((Act) getContext()).dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new bri0(x20Var2)).m21567z0();
                return;
            } else {
                x20Var2.call();
                return;
            }
        }
        i4g0.m138520r("e_letter_send_button", "p_letter_sentmessage_page");
        if (d79.m114685j0()) {
            x20Var.call();
            return;
        }
        if (joa.m146361M3()) {
            x20Var.call();
        } else if (this.f38874u) {
            CoreModule.m30933P().m143405a().mo34568pr((Act) getContext(), "letter", Privilege.liked_user);
        } else {
            CoreModule.m30933P().m143405a().mo34568pr((Act) getContext(), "letter", Privilege.letter);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m58928B() {
        if (this.f38873t.size() < 5) {
            for (LetterWrapper letterWrapper : this.f38872s) {
                if (!this.f38873t.contains(letterWrapper)) {
                    this.f38873t.add(letterWrapper);
                }
            }
        }
        if (this.f38873t.isEmpty()) {
            return;
        }
        Random random = new Random();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            LetterWrapper letterWrapper2 = this.f38873t.get(random.nextInt(this.f38873t.size()));
            letterWrapper2.select = false;
            arrayList.add(letterWrapper2);
            this.f38873t.remove(letterWrapper2);
        }
        this.f38867n.m58949J(arrayList, this.f38870q);
    }

    /* JADX INFO: renamed from: C */
    public void m58929C(User user, boolean z) {
        String str;
        this.f38874u = z;
        this.f38871r = user;
        if (user.isFemale()) {
            str = getContext().getResources().getString(R$string.f19387k3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        } else {
            str = getContext().getResources().getString(R$string.f19418l3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        this.f38860g.setText(str);
        uqb0.f180374G.m127111J0(this.f38854a, user.m61308fp().profileSmall(), true);
        this.f38855b.setText(user.name);
        rgk0.m181451d(this.f38857d, user.gender, user.age.intValue(), false, user);
        if (!r43.m179739b()) {
            this.f38858e.setText(q8g0.m175804j0(user.profile.zodiac));
            this.f38858e.setBackgroundDrawable(jde.m144406b(q8g0.m175806l0(user.profile.zodiac), qa00.m175859d(4.0f)));
        } else if (!jyb.m147479J(user.profile.extensions.physical.bloodType)) {
            this.f38858e.setText(r43.m179738a(user.profile.extensions.physical.bloodType.get(0)));
            this.f38858e.setBackgroundDrawable(jde.m144406b(q8g0.m175806l0(user.profile.zodiac), qa00.m175859d(4.0f)));
        }
        this.f38865l.setHint(TEnum.equals(user.gender, "female") ? R$string.f18809R2 : R$string.f18839S2);
        if ("spotlight_messages".equals(this.f38870q)) {
            this.f38865l.setHint(user.isFemale() ? R$string.f19874zp : R$string.f18311Ap);
            i4g0.m138526x("e_spotlight_msg_send_button", "p_spotlight_chat_popup");
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(this.f38865l, Integer.valueOf(dbc0.f86966eq));
            } catch (Exception unused) {
            }
            bnl0.m105524M(this.f38859f, true);
            this.f38860g.setTextColor(Color.parseColor("#44C5FF"));
            this.f38860g.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(dbc0.f86081D8), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38862i.setTextColor(Color.parseColor("#33000000"));
            this.f38862i.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(dbc0.f86999fq), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38866m.setBackgroundResource(dbc0.f86901cq);
            this.f38866m.setText(R$string.f19724v);
            this.f38866m.setMinWidth(qa00.m175859d(75.0f));
            this.f38866m.setTextColor(Color.parseColor("#66ffffff"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString("* " + getContext().getString(R$string.f18342Bp));
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#d34530")), 0, 2, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            this.f38864k.setText(spannableStringBuilder);
        }
        m58928B();
        if (d79.m114685j0()) {
            m58930D();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m58930D() {
        this.f38863j.setText(getContext().getString(R$string.f18697Na, String.valueOf(joa.m146350A4())));
    }

    public VEditText getEditTextView() {
        return this.f38865l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        psd0.m173633z(this.f38869p);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58933r();
    }

    /* JADX INFO: renamed from: p */
    public View m58931p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qdr.m176205b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public Picture.ImageUri m58932q(User user) {
        return vx6.m203838b(user).profileSmall();
    }

    /* JADX INFO: renamed from: r */
    public final void m58933r() {
        this.f38866m.setText(R$string.f18959W2);
        C9200e c9200e = new C9200e(getContext());
        this.f38867n = c9200e;
        c9200e.m58950K(new y20() { // from class: l.gdr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103733a.m58935t((String) obj);
            }
        });
        this.f38861h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f38861h.setAdapter(this.f38867n);
        bnl0.m105509E0(this.f38866m, new View.OnClickListener() { // from class: l.hdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109034a.m58936u(view);
            }
        });
        this.f38864k.setText(e1b.m118962T0("* " + getContext().getString(R$string.f18342Bp), "\\*", Color.parseColor("#d34530"), null));
        this.f38865l.setHorizontallyScrolling(false);
        this.f38865l.setImeOptions(4);
        this.f38865l.setOnEditorActionListener(new C9196a());
        this.f38865l.setMaxLength(65);
        this.f38865l.addTextChangedListener(new C9197b());
        this.f38862i.setText(R$string.f18989X2);
        this.f38862i.setOnClickListener(new View.OnClickListener() { // from class: l.idr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114519a.m58938w(view);
            }
        });
        if (d79.m114685j0()) {
            bnl0.m105524M(this.f38864k, false);
            bnl0.m105524M(this.f38859f, true);
            this.f38860g.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(dbc0.f86226Hp), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38860g.setTextColor(Color.parseColor("#ff6f49"));
            this.f38862i.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(dbc0.f86258Ip), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38866m.setBackgroundResource(dbc0.f86194Gp);
            long jM180736i = rbb0.m180736i();
            VText vText = this.f38863j;
            if (jM180736i > 0) {
                bnl0.m105524M(vText, true);
            } else {
                bnl0.m105524M(vText, false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m58934s(String str) {
        this.f38865l.requestFocus();
        this.f38865l.setText(str);
        VEditText vEditText = this.f38865l;
        vEditText.setSelection(vEditText.length());
    }

    public void setCloseClick(final x20 x20Var) {
        bnl0.m105509E0(this.f38859f, new View.OnClickListener() { // from class: l.fdr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    public void setFrom(String str) {
        this.f38870q = str;
    }

    public void setLetterWrapperLibraries(List<LetterWrapper> list) {
        if (jyb.m147479J(this.f38872s)) {
            this.f38872s.addAll(list);
        }
    }

    public void setSendClickCallBack(y20<String> y20Var) {
        this.f38868o = y20Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m58935t(final String str) {
        this.f38865l.postDelayed(new Runnable() { // from class: l.jdr
            @Override // java.lang.Runnable
            public final void run() {
                this.f120347a.m58934s(str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m58936u(View view) {
        m58927A();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m58937v() {
        this.f38865l.requestFocus();
        VEditText vEditText = this.f38865l;
        vEditText.setSelection(vEditText.length());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m58938w(View view) {
        m58928B();
        this.f38865l.postDelayed(new Runnable() { // from class: l.kdr
            @Override // java.lang.Runnable
            public final void run() {
                this.f125274a.m58937v();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m58939x() {
        if (NullChecker.m82486a(this.f38869p) && !this.f38869p.isUnsubscribed()) {
            this.f38869p.unsubscribe();
            this.f38869p = null;
        }
        this.f38869p = CoreModule.f18264c.f20324L0.m185528g3(this.f38865l.getText().toString().trim()).subscribe(psd0.m173601L(new C9198c()));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m58940y(uxj0 uxj0Var) {
        this.f38866m.setTextColor(Color.parseColor("#66ffffff"));
        if (NullChecker.m82486a(this.f38868o)) {
            this.f38868o.call(this.f38865l.getText().toString().trim());
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m58941z() {
        if (NullChecker.m82486a(this.f38869p) && !this.f38869p.isUnsubscribed()) {
            this.f38869p.unsubscribe();
            this.f38869p = null;
        }
        this.f38869p = CoreModule.f18264c.f20321K0.m113314v3(this.f38871r.f56859id, this.f38865l.getText().toString().trim(), this.f38875v).subscribe(psd0.m173597H(new y20() { // from class: l.ndr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141526a.m58940y((uxj0) obj);
            }
        }, new y20() { // from class: l.odr
            @Override // p153l.y20
            public final void call(Object obj) {
                LetterSendPanel.m58917f((Throwable) obj);
            }
        }));
    }

    public LetterSendPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38872s = new ArrayList();
        this.f38873t = new LinkedList();
        this.f38875v = new C9199d();
        m58931p(p9r.m171370a(context), this);
    }

    public LetterSendPanel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38872s = new ArrayList();
        this.f38873t = new LinkedList();
        this.f38875v = new C9199d();
        m58931p(p9r.m171370a(context), this);
    }
}
