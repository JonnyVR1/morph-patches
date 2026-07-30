package com.p000p1.mobile.putong.core.p004ui.vip.widget;

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
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.widget.LetterSendPanel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.LetterWrapper;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import l.bii0;
import l.c4g0;
import l.ccx;
import l.d30;
import l.dac0;
import l.e30;
import l.f30;
import l.fce;
import l.hdb0;
import l.i0g0;
import l.l7k0;
import l.lsi0;
import l.m250;
import l.mkd0;
import l.n3b0;
import l.o7r;
import l.obr;
import l.osi0;
import l.roj0;
import l.rza;
import l.sw6;
import l.t100;
import l.upf0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import p006l.b43;
import p006l.bkb0;
import p006l.f6c0;
import p006l.qib0;
import p006l.u4c0;
import p006l.u59;
import p006l.x2c0;
import p006l.xma;
import v.VDraweeView;
import v.VEditText;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LetterSendPanel extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7787a;

    /* JADX INFO: renamed from: b */
    public TextView f7788b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7789c;

    /* JADX INFO: renamed from: d */
    public VText f7790d;

    /* JADX INFO: renamed from: e */
    public VText f7791e;

    /* JADX INFO: renamed from: f */
    public VImage f7792f;

    /* JADX INFO: renamed from: g */
    public TextView f7793g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f7794h;

    /* JADX INFO: renamed from: i */
    public TextView f7795i;

    /* JADX INFO: renamed from: j */
    public VText f7796j;

    /* JADX INFO: renamed from: k */
    public TextView f7797k;

    /* JADX INFO: renamed from: l */
    public VEditText f7798l;

    /* JADX INFO: renamed from: m */
    public TextView f7799m;

    /* JADX INFO: renamed from: n */
    public C0473e f7800n;

    /* JADX INFO: renamed from: o */
    public e30<String> f7801o;

    /* JADX INFO: renamed from: p */
    public c4g0 f7802p;

    /* JADX INFO: renamed from: q */
    public String f7803q;

    /* JADX INFO: renamed from: r */
    public User f7804r;

    /* JADX INFO: renamed from: s */
    public List<LetterWrapper> f7805s;

    /* JADX INFO: renamed from: t */
    public List<LetterWrapper> f7806t;

    /* JADX INFO: renamed from: u */
    public boolean f7807u;

    /* JADX INFO: renamed from: v */
    public final f30<Throwable, String> f7808v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$a */
    public class C0469a implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: a */
        public long f7809a;

        public C0469a() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (SystemClock.uptimeMillis() - this.f7809a <= 500) {
                return false;
            }
            this.f7809a = SystemClock.uptimeMillis();
            if (i != 4 && i != 6 && (!NullChecker.a(keyEvent) || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return true;
            }
            LetterSendPanel.this.m11240A();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$b */
    public class C0470b implements TextWatcher {
        public C0470b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ("spotlight_messages".equals(LetterSendPanel.this.f7803q)) {
                int length = LetterSendPanel.this.f7798l.getText().toString().length();
                LetterSendPanel letterSendPanel = LetterSendPanel.this;
                if (length != 0) {
                    letterSendPanel.f7799m.setTextColor(Color.parseColor("#ffffff"));
                } else {
                    letterSendPanel.f7799m.setTextColor(Color.parseColor("#66ffffff"));
                    LetterSendPanel.this.f7800n.m11263G();
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
                        lsi0.j(letterSendPanel.getResources().getString(R$string.f2068R2, 30));
                    } else {
                        lsi0.j(letterSendPanel.getResources().getString(R$string.f2068R2, 60));
                    }
                    String strSubstring = string.substring(0, i5);
                    LetterSendPanel.this.f7798l.setText(strSubstring);
                    if (selectionEnd > strSubstring.length()) {
                        selectionEnd = strSubstring.length();
                    }
                    Selection.setSelection(LetterSendPanel.this.f7798l.getText(), selectionEnd);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$c */
    public class C0471c implements m250<roj0> {
        public C0471c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(roj0 roj0Var) {
            if (NullChecker.a(LetterSendPanel.this.f7801o)) {
                LetterSendPanel.this.f7801o.call(LetterSendPanel.this.f7798l.getText().toString().trim());
            }
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$d */
    public class C0472d implements f30<Throwable, String> {
        public C0472d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th, String str) {
            if (NullChecker.a(th)) {
                if (!TantanException.Client.TantanForbidden.isIllegalContent(th)) {
                    ccx.f(R$string.f3085yh, LetterSendPanel.this.f7804r.fp().profileSmall());
                    return;
                } else {
                    CoreModule.f1534c.f3631f0.m4680Of(str);
                    osi0.f(R$string.f1833J7);
                    return;
                }
            }
            View viewInflate = o7r.a(LetterSendPanel.this.getContext()).inflate(f6c0.f12012Ub, (ViewGroup) null);
            bkb0 bkb0Var = qib0.f19782G;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(u4c0.f22505C6);
            LetterSendPanel letterSendPanel = LetterSendPanel.this;
            bkb0Var.m12754Q0(simpleDraweeView, letterSendPanel.m11245q(letterSendPanel.f7804r));
            upf0 upf0VarM = new upf0.a(LetterSendPanel.this.getContext(), viewInflate).m();
            upf0VarM.x(CorePopLevel.SPOT_PUSH_BUBBLE);
            hdb0.c().i(upf0VarM);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel$e */
    public static class C0473e extends dac0<LetterWrapper> {

        /* JADX INFO: renamed from: c */
        public Context f7814c;

        /* JADX INFO: renamed from: d */
        public List<LetterWrapper> f7815d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public String f7816e;

        /* JADX INFO: renamed from: f */
        public e30<String> f7817f;

        public C0473e(Context context) {
            this.f7814c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m11258I(LetterWrapper letterWrapper, int i, View view) {
            for (LetterWrapper letterWrapper2 : this.f7815d) {
                letterWrapper2.select = letterWrapper.equals(letterWrapper2);
            }
            if (NullChecker.a(this.f7817f)) {
                this.f7817f.call(this.f7815d.get(i).letter);
            }
            notifyDataSetChanged();
            HashMap map = new HashMap();
            map.put("text", Boolean.valueOf(this.f7815d.get(i).select));
            zvf0.s("e_letter_text_bubble", "p_letter_sentmessage_page", map);
        }

        /* JADX INFO: renamed from: C */
        public int m11260C() {
            return this.f7815d.size();
        }

        /* JADX INFO: renamed from: D */
        public View m11261D(ViewGroup viewGroup, int i) {
            return o7r.a(this.f7814c).inflate(f6c0.f11806Hd, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.p1.mobile.putong.core.ui.vip.widget.LetterSendItem] */
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m11259A(View view, final LetterWrapper letterWrapper, int i, final int i2) {
            ?? r2 = (LetterSendItem) view;
            if ("spotlight_messages".equals(this.f7816e)) {
                xdl0.d0((View) r2, t100.d(15.0f));
                xdl0.e0((View) r2, t100.d(15.0f));
            }
            r2.m11224l(letterWrapper, this.f7816e);
            r2.setOnClickListener(new View.OnClickListener() { // from class: l.nbr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f17581a.m11258I(letterWrapper, i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G */
        public void m11263G() {
            Iterator<LetterWrapper> it = this.f7815d.iterator();
            while (it.hasNext()) {
                it.next().select = false;
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public LetterWrapper getItem(int i) {
            return this.f7815d.get(i);
        }

        /* JADX INFO: renamed from: J */
        public void m11265J(List<LetterWrapper> list, String str) {
            this.f7815d.clear();
            this.f7816e = str;
            this.f7815d.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: K */
        public void m11266K(e30<String> e30Var) {
            this.f7817f = e30Var;
        }
    }

    public LetterSendPanel(Context context) {
        super(context);
        this.f7805s = new ArrayList();
        this.f7806t = new LinkedList();
        this.f7808v = new C0472d();
        m11244p(o7r.a(context), this);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m11230f(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m11240A() {
        if (TextUtils.isEmpty(this.f7798l.getText().toString().trim())) {
            lsi0.h(R$string.f1978O2);
            return;
        }
        d30 d30Var = new d30() { // from class: l.jbr
            public final void call() {
                this.f15104a.m11252x();
            }
        };
        d30 d30Var2 = new d30() { // from class: l.kbr
            public final void call() {
                this.f15689a.m11254z();
            }
        };
        if ("spotlight_messages".equals(this.f7803q)) {
            zvf0.r("e_spotlight_msg_send_button", "p_spotlight_chat_popup");
            if (qib0.f19802Z.m14990K(this.f7798l.getText().toString().trim())) {
                getContext().dialog().E0(R$string.f3116zi).D(R$string.f3056xi).k0(R$string.f3026wi).t0(R$string.f3086yi, new bii0(d30Var2)).z0();
                return;
            } else {
                d30Var2.call();
                return;
            }
        }
        zvf0.r("e_letter_send_button", "p_letter_sentmessage_page");
        if (u59.m24998f0()) {
            d30Var.call();
            return;
        }
        if (xma.m27355L3()) {
            d30Var.call();
        } else if (this.f7807u) {
            CoreModule.m1854P().m11706a().m5502pr((Act) getContext(), "letter", Privilege.liked_user);
        } else {
            CoreModule.m1854P().m11706a().m5502pr((Act) getContext(), "letter", Privilege.letter);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m11241B() {
        if (this.f7806t.size() < 5) {
            for (LetterWrapper letterWrapper : this.f7805s) {
                if (!this.f7806t.contains(letterWrapper)) {
                    this.f7806t.add(letterWrapper);
                }
            }
        }
        if (this.f7806t.isEmpty()) {
            return;
        }
        Random random = new Random();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            LetterWrapper letterWrapper2 = this.f7806t.get(random.nextInt(this.f7806t.size()));
            letterWrapper2.select = false;
            arrayList.add(letterWrapper2);
            this.f7806t.remove(letterWrapper2);
        }
        this.f7800n.m11265J(arrayList, this.f7803q);
    }

    /* JADX INFO: renamed from: C */
    public void m11242C(User user, boolean z) {
        String str;
        this.f7807u = z;
        this.f7804r = user;
        if (user.isFemale()) {
            str = getContext().getResources().getString(R$string.f2586i3) + " ";
        } else {
            str = getContext().getResources().getString(R$string.f2615j3) + " ";
        }
        this.f7793g.setText(str);
        qib0.f19782G.m12740J0(this.f7787a, user.fp().profileSmall(), true);
        this.f7788b.setText(user.name);
        l7k0.d(this.f7790d, user.gender, user.age.intValue(), false, user);
        if (!b43.m12519b()) {
            this.f7791e.setText(i0g0.j0(user.profile.zodiac));
            this.f7791e.setBackgroundDrawable(fce.b(i0g0.l0(user.profile.zodiac), t100.d(4.0f)));
        } else if (!vwb.J(user.profile.extensions.physical.bloodType)) {
            this.f7791e.setText(b43.m12518a((BloodType) user.profile.extensions.physical.bloodType.get(0)));
            this.f7791e.setBackgroundDrawable(fce.b(i0g0.l0(user.profile.zodiac), t100.d(4.0f)));
        }
        this.f7798l.setHint(TEnum.equals(user.gender, "female") ? R$string.f2008P2 : R$string.f2038Q2);
        if ("spotlight_messages".equals(this.f7803q)) {
            this.f7798l.setHint(user.isFemale() ? R$string.f2453dp : R$string.f2484ep);
            zvf0.x("e_spotlight_msg_send_button", "p_spotlight_chat_popup");
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(this.f7798l, Integer.valueOf(x2c0.f27036qp));
            } catch (Exception unused) {
            }
            xdl0.M(this.f7792f, true);
            this.f7793g.setTextColor(Color.parseColor("#44C5FF"));
            this.f7793g.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f25762C8), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f7795i.setTextColor(Color.parseColor("#33000000"));
            this.f7795i.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f27068rp), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f7799m.setBackgroundResource(x2c0.f26972op);
            this.f7799m.setText(R$string.f2977v);
            this.f7799m.setMinWidth(t100.d(75.0f));
            this.f7799m.setTextColor(Color.parseColor("#66ffffff"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString("* " + getContext().getString(R$string.f2515fp));
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#d34530")), 0, 2, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            this.f7797k.setText(spannableStringBuilder);
        }
        m11241B();
        if (u59.m24998f0()) {
            m11243D();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m11243D() {
        this.f7796j.setText(getContext().getString(R$string.f1626Ca, String.valueOf(xma.m27408z4())));
    }

    public VEditText getEditTextView() {
        return this.f7798l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mkd0.z(this.f7802p);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11246r();
    }

    /* JADX INFO: renamed from: p */
    public View m11244p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return obr.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public Picture.ImageUri m11245q(User user) {
        return sw6.b(user).profileSmall();
    }

    /* JADX INFO: renamed from: r */
    public final void m11246r() {
        this.f7799m.setText(R$string.f2158U2);
        C0473e c0473e = new C0473e(getContext());
        this.f7800n = c0473e;
        c0473e.m11266K(new e30() { // from class: l.ebr
            public final void call(Object obj) {
                this.f11047a.m11248t((String) obj);
            }
        });
        this.f7794h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f7794h.setAdapter(this.f7800n);
        xdl0.E0(this.f7799m, new View.OnClickListener() { // from class: l.fbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12640a.m11249u(view);
            }
        });
        this.f7797k.setText(rza.T0("* " + getContext().getString(R$string.f2515fp), "\\*", Color.parseColor("#d34530"), (w9j) null));
        this.f7798l.setHorizontallyScrolling(false);
        this.f7798l.setImeOptions(4);
        this.f7798l.setOnEditorActionListener(new C0469a());
        this.f7798l.setMaxLength(65);
        this.f7798l.addTextChangedListener(new C0470b());
        this.f7795i.setText(R$string.f2188V2);
        this.f7795i.setOnClickListener(new View.OnClickListener() { // from class: l.gbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13206a.m11251w(view);
            }
        });
        if (u59.m24998f0()) {
            xdl0.M(this.f7797k, false);
            xdl0.M(this.f7792f, true);
            this.f7793g.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f26309To), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f7793g.setTextColor(Color.parseColor("#ff6f49"));
            this.f7795i.setCompoundDrawablesWithIntrinsicBounds(getContext().getDrawable(x2c0.f26340Uo), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f7799m.setBackgroundResource(x2c0.f26278So);
            long jI = n3b0.i();
            VText vText = this.f7796j;
            if (jI > 0) {
                xdl0.M(vText, true);
            } else {
                xdl0.M(vText, false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m11247s(String str) {
        this.f7798l.requestFocus();
        this.f7798l.setText(str);
        VEditText vEditText = this.f7798l;
        vEditText.setSelection(vEditText.length());
    }

    public void setCloseClick(final d30 d30Var) {
        xdl0.E0(this.f7792f, new View.OnClickListener() { // from class: l.dbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    public void setFrom(String str) {
        this.f7803q = str;
    }

    public void setLetterWrapperLibraries(List<LetterWrapper> list) {
        if (vwb.J(this.f7805s)) {
            this.f7805s.addAll(list);
        }
    }

    public void setSendClickCallBack(e30<String> e30Var) {
        this.f7801o = e30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m11248t(final String str) {
        this.f7798l.postDelayed(new Runnable() { // from class: l.hbr
            @Override // java.lang.Runnable
            public final void run() {
                this.f13790a.m11247s(str);
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m11249u(View view) {
        m11240A();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m11250v() {
        this.f7798l.requestFocus();
        VEditText vEditText = this.f7798l;
        vEditText.setSelection(vEditText.length());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m11251w(View view) {
        m11241B();
        this.f7798l.postDelayed(new Runnable() { // from class: l.ibr
            @Override // java.lang.Runnable
            public final void run() {
                this.f14351a.m11250v();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m11252x() {
        if (NullChecker.a(this.f7802p) && !this.f7802p.isUnsubscribed()) {
            this.f7802p.unsubscribe();
            this.f7802p = null;
        }
        this.f7802p = CoreModule.f1534c.f3571L0.m17431g3(this.f7798l.getText().toString().trim()).subscribe(mkd0.L(new C0471c()));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11253y(roj0 roj0Var) {
        this.f7799m.setTextColor(Color.parseColor("#66ffffff"));
        if (NullChecker.a(this.f7801o)) {
            this.f7801o.call(this.f7798l.getText().toString().trim());
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m11254z() {
        if (NullChecker.a(this.f7802p) && !this.f7802p.isUnsubscribed()) {
            this.f7802p.unsubscribe();
            this.f7802p = null;
        }
        this.f7802p = CoreModule.f1534c.f3568K0.m22508v3(((DbObject) this.f7804r).id, this.f7798l.getText().toString().trim(), this.f7808v).subscribe(mkd0.H(new e30() { // from class: l.lbr
            public final void call(Object obj) {
                this.f16319a.m11253y((roj0) obj);
            }
        }, new e30() { // from class: l.mbr
            public final void call(Object obj) {
                LetterSendPanel.m11230f((Throwable) obj);
            }
        }));
    }

    public LetterSendPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7805s = new ArrayList();
        this.f7806t = new LinkedList();
        this.f7808v = new C0472d();
        m11244p(o7r.a(context), this);
    }

    public LetterSendPanel(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7805s = new ArrayList();
        this.f7806t = new LinkedList();
        this.f7808v = new C0472d();
        m11244p(o7r.a(context), this);
    }
}
