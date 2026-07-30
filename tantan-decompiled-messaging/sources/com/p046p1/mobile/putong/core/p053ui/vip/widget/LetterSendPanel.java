package com.p046p1.mobile.putong.core.p053ui.vip.widget;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterSendPanel;
import com.p046p1.mobile.putong.data.LetterWrapper;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.b43;
import p149l.bii0;
import p149l.bkb0;
import p149l.c4g0;
import p149l.ccx;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.f30;
import p149l.f6c0;
import p149l.fce;
import p149l.hdb0;
import p149l.i0g0;
import p149l.l7k0;
import p149l.lsi0;
import p149l.m250;
import p149l.mkd0;
import p149l.n3b0;
import p149l.o7r;
import p149l.obr;
import p149l.osi0;
import p149l.qib0;
import p149l.roj0;
import p149l.rza;
import p149l.sw6;
import p149l.t100;
import p149l.u4c0;
import p149l.u59;
import p149l.upf0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class LetterSendPanel extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f38006a;

    /* JADX INFO: renamed from: b */
    public TextView f38007b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f38008c;

    /* JADX INFO: renamed from: d */
    public VText f38009d;

    /* JADX INFO: renamed from: e */
    public VText f38010e;

    /* JADX INFO: renamed from: f */
    public VImage f38011f;

    /* JADX INFO: renamed from: g */
    public TextView f38012g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f38013h;

    /* JADX INFO: renamed from: i */
    public TextView f38014i;

    /* JADX INFO: renamed from: j */
    public VText f38015j;

    /* JADX INFO: renamed from: k */
    public TextView f38016k;

    /* JADX INFO: renamed from: l */
    public VEditText f38017l;

    /* JADX INFO: renamed from: m */
    public TextView f38018m;

    /* JADX INFO: renamed from: n */
    public C9037e f38019n;

    /* JADX INFO: renamed from: o */
    public e30<String> f38020o;

    /* JADX INFO: renamed from: p */
    public c4g0 f38021p;

    /* JADX INFO: renamed from: q */
    public String f38022q;

    /* JADX INFO: renamed from: r */
    public User f38023r;

    /* JADX INFO: renamed from: s */
    public List<LetterWrapper> f38024s;

    /* JADX INFO: renamed from: t */
    public List<LetterWrapper> f38025t;

    /* JADX INFO: renamed from: u */
    public boolean f38026u;

    /* JADX INFO: renamed from: v */
    public final f30<Throwable, String> f38027v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$a */
    public class C9033a implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a */
        public long f38028a;

        public C9033a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (SystemClock.uptimeMillis() - this.f38028a <= 500) {
                return false;
            }
            this.f38028a = SystemClock.uptimeMillis();
            if (i != 4 && i != 6 && (!NullChecker.m81303a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return true;
            }
            LetterSendPanel.this.m57744A();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$b */
    public class C9034b implements TextWatcher {
        public C9034b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ("spotlight_messages".equals(LetterSendPanel.this.f38022q)) {
                int length = LetterSendPanel.this.f38017l.getText().toString().length();
                LetterSendPanel letterSendPanel = LetterSendPanel.this;
                if (length != 0) {
                    letterSendPanel.f38018m.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    letterSendPanel.f38018m.setTextColor(Color.parseColor("#66ffffff"));
                    LetterSendPanel.this.f38019n.m57764G();
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
                        lsi0.m151580j(letterSendPanel.getResources().getString(R$string.f18079R2, 30));
                    } else {
                        lsi0.m151580j(letterSendPanel.getResources().getString(R$string.f18079R2, 60));
                    }
                    String strSubstring = string.substring(0, i5);
                    LetterSendPanel.this.f38017l.setText(strSubstring);
                    if (selectionEnd > strSubstring.length()) {
                        selectionEnd = strSubstring.length();
                    }
                    Selection.setSelection(LetterSendPanel.this.f38017l.getText(), selectionEnd);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$c */
    public class C9035c implements m250<roj0> {
        public C9035c() {
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(roj0 roj0Var) {
            if (NullChecker.m81303a(LetterSendPanel.this.f38020o)) {
                LetterSendPanel.this.f38020o.call(LetterSendPanel.this.f38017l.getText().toString().trim());
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$d */
    public class C9036d implements f30<Throwable, String> {
        public C9036d() {
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th, String str) {
            if (NullChecker.m81303a(th)) {
                if (!TantanException.Client.TantanForbidden.isIllegalContent(th)) {
                    ccx.m106209f(R$string.f19096yh, LetterSendPanel.this.f38023r.m60124fp().profileSmall());
                    return;
                } else {
                    CoreModule.f17545c.f19642f0.m32750Of(str);
                    osi0.m165782f(R$string.f17844J7);
                    return;
                }
            }
            View viewInflate = o7r.m163037a(LetterSendPanel.this.getContext()).inflate(f6c0.f95598Ub, (ViewGroup) null);
            bkb0 bkb0Var = qib0.f154691G;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(u4c0.f173757C6);
            LetterSendPanel letterSendPanel = LetterSendPanel.this;
            bkb0Var.m102341Q0(simpleDraweeView, letterSendPanel.m57749q(letterSendPanel.f38023r));
            upf0 upf0VarM194870m = new upf0.C20477a((Act) LetterSendPanel.this.getContext(), viewInflate).m194870m();
            upf0VarM194870m.m96808x(CorePopLevel.SPOT_PUSH_BUBBLE);
            hdb0.m130575c().m130582i(upf0VarM194870m);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$e */
    public static class C9037e extends dac0<LetterWrapper> {

        /* JADX INFO: renamed from: c */
        public Context f38033c;

        /* JADX INFO: renamed from: d */
        public List<LetterWrapper> f38034d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public String f38035e;

        /* JADX INFO: renamed from: f */
        public e30<String> f38036f;

        public C9037e(Context context) {
            this.f38033c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m57762I(LetterWrapper letterWrapper, int i, View view) {
            for (LetterWrapper letterWrapper2 : this.f38034d) {
                letterWrapper2.select = letterWrapper.equals(letterWrapper2);
            }
            if (NullChecker.m81303a(this.f38036f)) {
                this.f38036f.call(this.f38034d.get(i).letter);
            }
            notifyDataSetChanged();
            HashMap map = new HashMap();
            map.put("text", Boolean.valueOf(this.f38034d.get(i).select));
            zvf0.m220397s("e_letter_text_bubble", "p_letter_sentmessage_page", map);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f38034d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(this.f38033c).inflate(f6c0.f95392Hd, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final LetterWrapper letterWrapper, int i, final int i2) {
            LetterSendItem letterSendItem = (LetterSendItem) view;
            if ("spotlight_messages".equals(this.f38035e)) {
                xdl0.m208370d0(letterSendItem, t100.m186890d(15.0f));
                xdl0.m208372e0(letterSendItem, t100.m186890d(15.0f));
            }
            letterSendItem.m57728l(letterWrapper, this.f38035e);
            letterSendItem.setOnClickListener(new View.OnClickListener() { // from class: l.nbr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f138059a.m57762I(letterWrapper, i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G */
        public void m57764G() {
            Iterator<LetterWrapper> it = this.f38034d.iterator();
            while (it.hasNext()) {
                it.next().select = false;
            }
            notifyDataSetChanged();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public LetterWrapper getItem(int i) {
            return this.f38034d.get(i);
        }

        /* JADX INFO: renamed from: J */
        public void m57766J(List<LetterWrapper> list, String str) {
            this.f38034d.clear();
            this.f38035e = str;
            this.f38034d.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: K */
        public void m57767K(e30<String> e30Var) {
            this.f38036f = e30Var;
        }
    }

    public LetterSendPanel(Context context) {
        super(context);
        this.f38024s = new ArrayList();
        this.f38025t = new LinkedList();
        this.f38027v = new C9036d();
        m57748p(o7r.m163037a(context), this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m57734f(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m57744A() {
        if (TextUtils.isEmpty(this.f38017l.getText().toString().trim())) {
            lsi0.m151578h(R$string.f17989O2);
            return;
        }
        d30 d30Var = new d30() { // from class: l.jbr
            @Override // p149l.d30
            public final void call() {
                this.f117208a.m57756x();
            }
        };
        d30 d30Var2 = new d30() { // from class: l.kbr
            @Override // p149l.d30
            public final void call() {
                this.f122261a.m57758z();
            }
        };
        if ("spotlight_messages".equals(this.f38022q)) {
            zvf0.m220396r("e_spotlight_msg_send_button", "p_spotlight_chat_popup");
            if (qib0.f154711Z.m119125K(this.f38017l.getText().toString().trim())) {
                ((Act) getContext()).dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new bii0(d30Var2)).m20568z0();
                return;
            } else {
                d30Var2.call();
                return;
            }
        }
        zvf0.m220396r("e_letter_send_button", "p_letter_sentmessage_page");
        if (u59.m191827f0()) {
            d30Var.call();
            return;
        }
        if (xma.m210047L3()) {
            d30Var.call();
        } else if (this.f38026u) {
            CoreModule.m29935P().m94651a().mo33565pr((Act) getContext(), "letter", Privilege.liked_user);
        } else {
            CoreModule.m29935P().m94651a().mo33565pr((Act) getContext(), "letter", Privilege.letter);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m57745B() {
        if (this.f38025t.size() < 5) {
            for (LetterWrapper letterWrapper : this.f38024s) {
                if (!this.f38025t.contains(letterWrapper)) {
                    this.f38025t.add(letterWrapper);
                }
            }
        }
        if (this.f38025t.isEmpty()) {
            return;
        }
        Random random = new Random();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            LetterWrapper letterWrapper2 = this.f38025t.get(random.nextInt(this.f38025t.size()));
            letterWrapper2.select = false;
            arrayList.add(letterWrapper2);
            this.f38025t.remove(letterWrapper2);
        }
        this.f38019n.m57766J(arrayList, this.f38022q);
    }

    /* JADX INFO: renamed from: C */
    public void m57746C(User user, boolean z) {
        String str;
        this.f38026u = z;
        this.f38023r = user;
        if (user.isFemale()) {
            str = getContext().getResources().getString(R$string.f18597i3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        } else {
            str = getContext().getResources().getString(R$string.f18626j3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        this.f38012g.setText(str);
        qib0.f154691G.m102327J0(this.f38006a, user.m60124fp().profileSmall(), true);
        this.f38007b.setText(user.name);
        l7k0.m148809d(this.f38009d, user.gender, user.age.intValue(), false, user);
        if (!b43.m100168b()) {
            this.f38010e.setText(i0g0.m133869j0(user.profile.zodiac));
            this.f38010e.setBackgroundDrawable(fce.m120425b(i0g0.m133871l0(user.profile.zodiac), t100.m186890d(4.0f)));
        } else if (!vwb.m200296J(user.profile.extensions.physical.bloodType)) {
            this.f38010e.setText(b43.m100167a(user.profile.extensions.physical.bloodType.get(0)));
            this.f38010e.setBackgroundDrawable(fce.m120425b(i0g0.m133871l0(user.profile.zodiac), t100.m186890d(4.0f)));
        }
        this.f38017l.setHint(TEnum.equals(user.gender, "female") ? R$string.f18019P2 : R$string.f18049Q2);
        if ("spotlight_messages".equals(this.f38022q)) {
            this.f38017l.setHint(user.isFemale() ? R$string.f18464dp : R$string.f18495ep);
            zvf0.m220402x("e_spotlight_msg_send_button", "p_spotlight_chat_popup");
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(this.f38017l, Integer.valueOf(x2c0.f190500qp));
            } catch (Exception unused) {
            }
            xdl0.m208344M(this.f38011f, true);
            this.f38012g.setTextColor(Color.parseColor("#44C5FF"));
            this.f38012g.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f189226C8), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38014i.setTextColor(Color.parseColor("#33000000"));
            this.f38014i.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f190532rp), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38018m.setBackgroundResource(x2c0.f190436op);
            this.f38018m.setText(R$string.f18988v);
            this.f38018m.setMinWidth(t100.m186890d(75.0f));
            this.f38018m.setTextColor(Color.parseColor("#66ffffff"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString("* " + getContext().getString(R$string.f18526fp));
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#d34530")), 0, 2, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            this.f38016k.setText(spannableStringBuilder);
        }
        m57745B();
        if (u59.m191827f0()) {
            m57747D();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m57747D() {
        this.f38015j.setText(getContext().getString(R$string.f17637Ca, String.valueOf(xma.m210100z4())));
    }

    public VEditText getEditTextView() {
        return this.f38017l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mkd0.m154992z(this.f38021p);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57750r();
    }

    /* JADX INFO: renamed from: p */
    public View m57748p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return obr.m163462b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public Picture.ImageUri m57749q(User user) {
        return sw6.m186127b(user).profileSmall();
    }

    /* JADX INFO: renamed from: r */
    public final void m57750r() {
        this.f38018m.setText(R$string.f18169U2);
        C9037e c9037e = new C9037e(getContext());
        this.f38019n = c9037e;
        c9037e.m57767K(new e30() { // from class: l.ebr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90375a.m57752t((String) obj);
            }
        });
        this.f38013h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f38013h.setAdapter(this.f38019n);
        xdl0.m208329E0(this.f38018m, new View.OnClickListener() { // from class: l.fbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96748a.m57753u(view);
            }
        });
        this.f38016k.setText(rza.m181740T0("* " + getContext().getString(R$string.f18526fp), "\\*", Color.parseColor("#d34530"), null));
        this.f38017l.setHorizontallyScrolling(false);
        this.f38017l.setImeOptions(4);
        this.f38017l.setOnEditorActionListener(new C9033a());
        this.f38017l.setMaxLength(65);
        this.f38017l.addTextChangedListener(new C9034b());
        this.f38014i.setText(R$string.f18199V2);
        this.f38014i.setOnClickListener(new View.OnClickListener() { // from class: l.gbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101911a.m57755w(view);
            }
        });
        if (u59.m191827f0()) {
            xdl0.m208344M(this.f38016k, false);
            xdl0.m208344M(this.f38011f, true);
            this.f38012g.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f189773To), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38012g.setTextColor(Color.parseColor("#ff6f49"));
            this.f38014i.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f189804Uo), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f38018m.setBackgroundResource(x2c0.f189742So);
            long jM157734i = n3b0.m157734i();
            VText vText = this.f38015j;
            if (jM157734i > 0) {
                xdl0.m208344M(vText, true);
            } else {
                xdl0.m208344M(vText, false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m57751s(String str) {
        this.f38017l.requestFocus();
        this.f38017l.setText(str);
        VEditText vEditText = this.f38017l;
        vEditText.setSelection(vEditText.length());
    }

    public void setCloseClick(final d30 d30Var) {
        xdl0.m208329E0(this.f38011f, new View.OnClickListener() { // from class: l.dbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    public void setFrom(String str) {
        this.f38022q = str;
    }

    public void setLetterWrapperLibraries(List<LetterWrapper> list) {
        if (vwb.m200296J(this.f38024s)) {
            this.f38024s.addAll(list);
        }
    }

    public void setSendClickCallBack(e30<String> e30Var) {
        this.f38020o = e30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m57752t(final String str) {
        this.f38017l.postDelayed(new Runnable() { // from class: l.hbr
            @Override // java.lang.Runnable
            public final void run() {
                this.f106958a.m57751s(str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m57753u(View view) {
        m57744A();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m57754v() {
        this.f38017l.requestFocus();
        VEditText vEditText = this.f38017l;
        vEditText.setSelection(vEditText.length());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m57755w(View view) {
        m57745B();
        this.f38017l.postDelayed(new Runnable() { // from class: l.ibr
            @Override // java.lang.Runnable
            public final void run() {
                this.f112376a.m57754v();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m57756x() {
        if (NullChecker.m81303a(this.f38021p) && !this.f38021p.isUnsubscribed()) {
            this.f38021p.unsubscribe();
            this.f38021p = null;
        }
        this.f38021p = CoreModule.f17545c.f19582L0.m141021g3(this.f38017l.getText().toString().trim()).subscribe(mkd0.m154960L(new C9035c()));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m57757y(roj0 roj0Var) {
        this.f38018m.setTextColor(Color.parseColor("#66ffffff"));
        if (NullChecker.m81303a(this.f38020o)) {
            this.f38020o.call(this.f38017l.getText().toString().trim());
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m57758z() {
        if (NullChecker.m81303a(this.f38021p) && !this.f38021p.isUnsubscribed()) {
            this.f38021p.unsubscribe();
            this.f38021p = null;
        }
        this.f38021p = CoreModule.f17545c.f19579K0.m176987v3(this.f38023r.f56011id, this.f38017l.getText().toString().trim(), this.f38027v).subscribe(mkd0.m154956H(new e30() { // from class: l.lbr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127328a.m57757y((roj0) obj);
            }
        }, new e30() { // from class: l.mbr
            @Override // p149l.e30
            public final void call(Object obj) {
                LetterSendPanel.m57734f((Throwable) obj);
            }
        }));
    }

    public LetterSendPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38024s = new ArrayList();
        this.f38025t = new LinkedList();
        this.f38027v = new C9036d();
        m57748p(o7r.m163037a(context), this);
    }

    public LetterSendPanel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38024s = new ArrayList();
        this.f38025t = new LinkedList();
        this.f38027v = new C9036d();
        m57748p(o7r.m163037a(context), this);
    }
}
