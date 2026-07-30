package com.p051p1.mobile.putong.core.newui.loveletter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p153l.adc0;
import p153l.bnl0;
import p153l.gt0;
import p153l.i4g0;
import p153l.o1j0;
import p153l.pf60;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterEditLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f25123a;

    /* JADX INFO: renamed from: b */
    public TextView f25124b;

    /* JADX INFO: renamed from: c */
    public EditText f25125c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f25126d;

    /* JADX INFO: renamed from: e */
    public TextView f25127e;

    /* JADX INFO: renamed from: f */
    public TextView f25128f;

    /* JADX INFO: renamed from: g */
    public View f25129g;

    /* JADX INFO: renamed from: h */
    public View f25130h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f25131i;

    /* JADX INFO: renamed from: j */
    public boolean f25132j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.LoveLetterEditLayout$a */
    public class C8236a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f25133a;

        public C8236a(int i) {
            this.f25133a = i;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoveLetterEditLayout.this.f25127e.setText((200 - editable.toString().length()) + "");
            if (editable.toString().length() <= this.f25133a || editable.toString().trim().length() <= 0) {
                LoveLetterEditLayout.this.f25129g.setSelected(false);
            } else {
                LoveLetterEditLayout.this.f25129g.setSelected(true);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public LoveLetterEditLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m40583h(int i, LoveLetterEditAct loveLetterEditAct, User user, View view) {
        if (this.f25129g.isSelected()) {
            i4g0.m138523u("e_send_letter", "p_write_letter", new pf60("button_type", "bright"));
            loveLetterEditAct.m40574q2(user, this.f25125c.getText().toString());
            return;
        }
        i4g0.m138523u("e_send_letter", "p_write_letter", new pf60("button_type", "grey"));
        o1j0.m165651y("大于" + i + "个字才可以发送");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m40584i(int i, ValueAnimator valueAnimator) {
        m40586k(((Float) valueAnimator.getAnimatedValue()).floatValue(), i);
    }

    /* JADX INFO: renamed from: l */
    public final String m40587l(String str) {
        if (str.length() > 8) {
            str = str.substring(0, 8).concat("...");
        }
        return "（   " + str + "   ）";
    }

    /* JADX INFO: renamed from: m */
    public void m40588m(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        boolean z = this.f25132j;
        if (zBooleanValue) {
            if (z) {
                m40586k(1.0f, num.intValue());
                return;
            } else {
                this.f25132j = true;
                m40591p(0.0f, 1.0f, num.intValue());
                return;
            }
        }
        if (z) {
            this.f25132j = false;
            m40591p(1.0f, 0.0f, num.intValue());
            bnl0.m105537U(this.f25127e, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m40589n(final LoveLetterEditAct loveLetterEditAct, final String str, final int i, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f25125c.setHint(str2);
        }
        this.f25125c.addTextChangedListener(new C8236a(i));
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (userM116503Pa == null || loveLetterEditAct == null) {
            return;
        }
        this.f25124b.setText("To " + m40587l(userM116503Pa.name));
        this.f25128f.setText("By " + m40587l(CoreModule.f18264c.f20381e0.m116600p9().name));
        this.f25123a.setImageUrl(userM116503Pa.m61308fp().url);
        i4g0.m138492A("e_send_letter", "p_write_letter", new pf60("button_type", "grey"));
        bnl0.m105509E0(this.f25123a, new View.OnClickListener() { // from class: l.rcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoveLetterEditAct loveLetterEditAct2 = loveLetterEditAct;
                loveLetterEditAct2.startActivity(ProfileAct.m51920o2(loveLetterEditAct2, str, "", false));
            }
        });
        bnl0.m105509E0(this.f25129g, new View.OnClickListener() { // from class: l.scw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167350a.m40583h(i, loveLetterEditAct, userM116503Pa, view);
            }
        });
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m40586k(float f, int i) {
        this.f25124b.setTranslationY((-qa00.m175859d(118.0f)) * f);
        this.f25123a.setTranslationX(((bnl0.m105592y0() / 2.0f) - qa00.m175859d(70.0f)) * f);
        float f2 = 1.0f - (0.25f * f);
        this.f25123a.setScaleX(f2);
        this.f25123a.setScaleY(f2);
        this.f25123a.setTranslationY((-qa00.m175859d(13.0f)) * f);
        bnl0.m105537U(this.f25130h, -((int) (qa00.m175859d(77.0f) * f)));
        bnl0.m105537U(this.f25127e, Math.max(0, (int) (f * (i - qa00.m175859d(230.0f)))));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f25130h = findViewById(adc0.f70630we);
        this.f25123a = (AutoVDraweeView) findViewById(adc0.f70161V);
        this.f25124b = (TextView) findViewById(adc0.f70491ob);
        this.f25125c = (EditText) findViewById(adc0.f70483o3);
        this.f25126d = (AutoVDraweeView) findViewById(adc0.f70599v0);
        this.f25127e = (TextView) findViewById(adc0.f70192Wd);
        this.f25128f = (TextView) findViewById(adc0.f70340fc);
        this.f25129g = findViewById(adc0.f70256ad);
        bnl0.m105505C0(this.f25126d, (int) ((bnl0.m105592y0() * 160.0f) / 375.0f));
        this.f25126d.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IlE3NUtTRVJQQk9USEFZNFRZRk1NSDRVQk01VFlHRTE0IiwidyI6MTEyNSwiaCI6NjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIxMzAwMzcwMzE0OTQzNzI2MDh9.png", 1);
    }

    /* JADX INFO: renamed from: p */
    public final void m40591p(float f, final float f2, final int i) {
        ValueAnimator valueAnimator = this.f25131i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f25131i.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f25131i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f25131i.removeAllUpdateListeners();
        this.f25131i.removeAllListeners();
        this.f25131i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tcw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f173282a.m40584i(i, valueAnimator2);
            }
        });
        gt0.m132161g(this.f25131i, new Runnable() { // from class: l.ucw
            @Override // java.lang.Runnable
            public final void run() {
                this.f178465a.m40585j(f2, i);
            }
        }, new Runnable() { // from class: l.vcw
            @Override // java.lang.Runnable
            public final void run() {
                this.f183494a.m40586k(f2, i);
            }
        });
        this.f25131i.start();
    }

    public LoveLetterEditLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterEditLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
