package com.p000p1.mobile.putong.core.newui.loveletter;

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
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import l.bt0;
import l.j760;
import l.lsi0;
import l.t100;
import l.u4c0;
import l.xdl0;
import l.zvf0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterEditLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f3159a;

    /* JADX INFO: renamed from: b */
    public TextView f3160b;

    /* JADX INFO: renamed from: c */
    public EditText f3161c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f3162d;

    /* JADX INFO: renamed from: e */
    public TextView f3163e;

    /* JADX INFO: renamed from: f */
    public TextView f3164f;

    /* JADX INFO: renamed from: g */
    public View f3165g;

    /* JADX INFO: renamed from: h */
    public View f3166h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f3167i;

    /* JADX INFO: renamed from: j */
    public boolean f3168j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.LoveLetterEditLayout$a */
    public class C0249a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f3169a;

        public C0249a(int i) {
            this.f3169a = i;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoveLetterEditLayout.this.f3163e.setText((200 - editable.toString().length()) + "");
            if (editable.toString().length() <= this.f3169a || editable.toString().trim().length() <= 0) {
                LoveLetterEditLayout.this.f3165g.setSelected(false);
            } else {
                LoveLetterEditLayout.this.f3165g.setSelected(true);
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
    public final /* synthetic */ void m3651h(int i, LoveLetterEditAct loveLetterEditAct, User user, View view) {
        if (this.f3165g.isSelected()) {
            zvf0.u("e_send_letter", "p_write_letter", new j760[]{new j760("button_type", "bright")});
            loveLetterEditAct.m3642p2(user, this.f3161c.getText().toString());
            return;
        }
        zvf0.u("e_send_letter", "p_write_letter", new j760[]{new j760("button_type", "grey")});
        lsi0.y("大于" + i + "个字才可以发送");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m3652i(int i, ValueAnimator valueAnimator) {
        m3654k(((Float) valueAnimator.getAnimatedValue()).floatValue(), i);
    }

    /* JADX INFO: renamed from: l */
    public final String m3655l(String str) {
        if (str.length() > 8) {
            str = str.substring(0, 8).concat("...");
        }
        return "（   " + str + "   ）";
    }

    /* JADX INFO: renamed from: m */
    public void m3656m(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        boolean z = this.f3168j;
        if (zBooleanValue) {
            if (z) {
                m3654k(1.0f, num.intValue());
                return;
            } else {
                this.f3168j = true;
                m3659p(0.0f, 1.0f, num.intValue());
                return;
            }
        }
        if (z) {
            this.f3168j = false;
            m3659p(1.0f, 0.0f, num.intValue());
            xdl0.U(this.f3163e, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m3657n(final LoveLetterEditAct loveLetterEditAct, final String str, final int i, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f3161c.setHint(str2);
        }
        this.f3161c.addTextChangedListener(new C0249a(i));
        final User userPa = CoreModule.c.e0.Pa(str);
        if (userPa == null || loveLetterEditAct == null) {
            return;
        }
        this.f3160b.setText("To " + m3655l(userPa.name));
        this.f3164f.setText("By " + m3655l(CoreModule.c.e0.p9().name));
        this.f3159a.setImageUrl(((Media) userPa.fp()).url);
        zvf0.A("e_send_letter", "p_write_letter", new j760[]{new j760("button_type", "grey")});
        xdl0.E0(this.f3159a, new View.OnClickListener() { // from class: l.taw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoveLetterEditAct loveLetterEditAct2 = loveLetterEditAct;
                loveLetterEditAct2.startActivity(ProfileAct.n2(loveLetterEditAct2, str, "", false));
            }
        });
        xdl0.E0(this.f3165g, new View.OnClickListener() { // from class: l.uaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21048a.m3651h(i, loveLetterEditAct, userPa, view);
            }
        });
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m3654k(float f, int i) {
        this.f3160b.setTranslationY((-t100.d(118.0f)) * f);
        this.f3159a.setTranslationX(((xdl0.y0() / 2.0f) - t100.d(70.0f)) * f);
        float f2 = 1.0f - (0.25f * f);
        this.f3159a.setScaleX(f2);
        this.f3159a.setScaleY(f2);
        this.f3159a.setTranslationY((-t100.d(13.0f)) * f);
        xdl0.U(this.f3166h, -((int) (t100.d(77.0f) * f)));
        xdl0.U(this.f3163e, Math.max(0, (int) (f * (i - t100.d(230.0f)))));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3166h = findViewById(u4c0.te);
        this.f3159a = findViewById(u4c0.V);
        this.f3160b = (TextView) findViewById(u4c0.mb);
        this.f3161c = (EditText) findViewById(u4c0.m3);
        this.f3162d = findViewById(u4c0.v0);
        this.f3163e = (TextView) findViewById(u4c0.Td);
        this.f3164f = (TextView) findViewById(u4c0.dc);
        this.f3165g = findViewById(u4c0.Yc);
        xdl0.C0(this.f3162d, (int) ((xdl0.y0() * 160.0f) / 375.0f));
        this.f3162d.x("https://auto.tancdn.com/v1/images/eyJpZCI6IlE3NUtTRVJQQk9USEFZNFRZRk1NSDRVQk01VFlHRTE0IiwidyI6MTEyNSwiaCI6NjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIxMzAwMzcwMzE0OTQzNzI2MDh9.png", 1);
    }

    /* JADX INFO: renamed from: p */
    public final void m3659p(float f, final float f2, final int i) {
        ValueAnimator valueAnimator = this.f3167i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f3167i.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f3167i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f3167i.removeAllUpdateListeners();
        this.f3167i.removeAllListeners();
        this.f3167i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vaw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f21511a.m3652i(i, valueAnimator2);
            }
        });
        bt0.g(this.f3167i, new Runnable() { // from class: l.waw
            @Override // java.lang.Runnable
            public final void run() {
                this.f21972a.m3653j(f2, i);
            }
        }, new Runnable() { // from class: l.xaw
            @Override // java.lang.Runnable
            public final void run() {
                this.f22490a.m3654k(f2, i);
            }
        });
        this.f3167i.start();
    }

    public LoveLetterEditLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterEditLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
