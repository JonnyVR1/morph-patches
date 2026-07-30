package com.p046p1.mobile.putong.core.newui.loveletter;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p149l.bt0;
import p149l.j760;
import p149l.lsi0;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterEditLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f24381a;

    /* JADX INFO: renamed from: b */
    public TextView f24382b;

    /* JADX INFO: renamed from: c */
    public EditText f24383c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f24384d;

    /* JADX INFO: renamed from: e */
    public TextView f24385e;

    /* JADX INFO: renamed from: f */
    public TextView f24386f;

    /* JADX INFO: renamed from: g */
    public View f24387g;

    /* JADX INFO: renamed from: h */
    public View f24388h;

    /* JADX INFO: renamed from: i */
    public ValueAnimator f24389i;

    /* JADX INFO: renamed from: j */
    public boolean f24390j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.LoveLetterEditLayout$a */
    public class C8085a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f24391a;

        public C8085a(int i) {
            this.f24391a = i;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LoveLetterEditLayout.this.f24385e.setText((200 - editable.toString().length()) + "");
            if (editable.toString().length() <= this.f24391a || editable.toString().trim().length() <= 0) {
                LoveLetterEditLayout.this.f24387g.setSelected(false);
            } else {
                LoveLetterEditLayout.this.f24387g.setSelected(true);
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
    public final /* synthetic */ void m39580h(int i, LoveLetterEditAct loveLetterEditAct, User user, View view) {
        if (this.f24387g.isSelected()) {
            zvf0.m220399u("e_send_letter", "p_write_letter", new j760("button_type", "bright"));
            loveLetterEditAct.m39571p2(user, this.f24383c.getText().toString());
            return;
        }
        zvf0.m220399u("e_send_letter", "p_write_letter", new j760("button_type", "grey"));
        lsi0.m151595y("大于" + i + "个字才可以发送");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m39581i(int i, ValueAnimator valueAnimator) {
        m39583k(((Float) valueAnimator.getAnimatedValue()).floatValue(), i);
    }

    /* JADX INFO: renamed from: l */
    public final String m39584l(String str) {
        if (str.length() > 8) {
            str = str.substring(0, 8).concat("...");
        }
        return "（   " + str + "   ）";
    }

    /* JADX INFO: renamed from: m */
    public void m39585m(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        boolean z = this.f24390j;
        if (zBooleanValue) {
            if (z) {
                m39583k(1.0f, num.intValue());
                return;
            } else {
                this.f24390j = true;
                m39588p(0.0f, 1.0f, num.intValue());
                return;
            }
        }
        if (z) {
            this.f24390j = false;
            m39588p(1.0f, 0.0f, num.intValue());
            xdl0.m208357U(this.f24385e, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m39586n(final LoveLetterEditAct loveLetterEditAct, final String str, final int i, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f24383c.setHint(str2);
        }
        this.f24383c.addTextChangedListener(new C8085a(i));
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (userM169430Pa == null || loveLetterEditAct == null) {
            return;
        }
        this.f24382b.setText("To " + m39584l(userM169430Pa.name));
        this.f24386f.setText("By " + m39584l(CoreModule.f17545c.f19639e0.m169527p9().name));
        this.f24381a.setImageUrl(userM169430Pa.m60124fp().url);
        zvf0.m220368A("e_send_letter", "p_write_letter", new j760("button_type", "grey"));
        xdl0.m208329E0(this.f24381a, new View.OnClickListener() { // from class: l.taw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoveLetterEditAct loveLetterEditAct2 = loveLetterEditAct;
                loveLetterEditAct2.startActivity(ProfileAct.m50736n2(loveLetterEditAct2, str, "", false));
            }
        });
        xdl0.m208329E0(this.f24387g, new View.OnClickListener() { // from class: l.uaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175643a.m39580h(i, loveLetterEditAct, userM169430Pa, view);
            }
        });
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m39583k(float f, int i) {
        this.f24382b.setTranslationY((-t100.m186890d(118.0f)) * f);
        this.f24381a.setTranslationX(((xdl0.m208412y0() / 2.0f) - t100.m186890d(70.0f)) * f);
        float f2 = 1.0f - (0.25f * f);
        this.f24381a.setScaleX(f2);
        this.f24381a.setScaleY(f2);
        this.f24381a.setTranslationY((-t100.m186890d(13.0f)) * f);
        xdl0.m208357U(this.f24388h, -((int) (t100.m186890d(77.0f) * f)));
        xdl0.m208357U(this.f24385e, Math.max(0, (int) (f * (i - t100.m186890d(230.0f)))));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24388h = findViewById(u4c0.f174488te);
        this.f24381a = (AutoVDraweeView) findViewById(u4c0.f174071V);
        this.f24382b = (TextView) findViewById(u4c0.f174366mb);
        this.f24383c = (EditText) findViewById(u4c0.f174358m3);
        this.f24384d = (AutoVDraweeView) findViewById(u4c0.f174508v0);
        this.f24385e = (TextView) findViewById(u4c0.f174053Td);
        this.f24386f = (TextView) findViewById(u4c0.f174215dc);
        this.f24387g = findViewById(u4c0.f174132Yc);
        xdl0.m208325C0(this.f24384d, (int) ((xdl0.m208412y0() * 160.0f) / 375.0f));
        this.f24384d.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IlE3NUtTRVJQQk9USEFZNFRZRk1NSDRVQk01VFlHRTE0IiwidyI6MTEyNSwiaCI6NjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIxMzAwMzcwMzE0OTQzNzI2MDh9.png", 1);
    }

    /* JADX INFO: renamed from: p */
    public final void m39588p(float f, final float f2, final int i) {
        ValueAnimator valueAnimator = this.f24389i;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24389i.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f24389i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f24389i.removeAllUpdateListeners();
        this.f24389i.removeAllListeners();
        this.f24389i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vaw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f180789a.m39581i(i, valueAnimator2);
            }
        });
        bt0.m103734g(this.f24389i, new Runnable() { // from class: l.waw
            @Override // java.lang.Runnable
            public final void run() {
                this.f185513a.m39582j(f2, i);
            }
        }, new Runnable() { // from class: l.xaw
            @Override // java.lang.Runnable
            public final void run() {
                this.f191847a.m39583k(f2, i);
            }
        });
        this.f24389i.start();
    }

    public LoveLetterEditLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterEditLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
