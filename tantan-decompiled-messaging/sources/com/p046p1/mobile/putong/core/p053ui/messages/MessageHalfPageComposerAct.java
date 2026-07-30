package com.p046p1.mobile.putong.core.p053ui.messages;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageHalfPageComposerAct;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputEditRootLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.HashSet;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dyq;
import p149l.e30;
import p149l.fyq;
import p149l.j760;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qib0;
import p149l.szb0;
import p149l.t4z;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageHalfPageComposerAct extends PutongAct implements dyq {

    /* JADX INFO: renamed from: l */
    public static String f31601l = "key_message_uid";

    /* JADX INFO: renamed from: m */
    public static String f31602m = "from";

    /* JADX INFO: renamed from: n */
    public static String f31603n = "from_home_card";

    /* JADX INFO: renamed from: o */
    public static String f31604o = "from_message";

    /* JADX INFO: renamed from: p */
    public static String f31605p = "from_message_impress";

    /* JADX INFO: renamed from: q */
    public static String f31606q = "from_match_ice_break";

    /* JADX INFO: renamed from: r */
    public static String f31607r = "from_card_match_pop";

    /* JADX INFO: renamed from: c */
    public FrameLayout f31608c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f31609d;

    /* JADX INFO: renamed from: e */
    public MessageInputEditRootLayout f31610e;

    /* JADX INFO: renamed from: f */
    public VEditTextEmojiCompat f31611f;

    /* JADX INFO: renamed from: g */
    public VText f31612g;

    /* JADX INFO: renamed from: h */
    public fyq f31613h;

    /* JADX INFO: renamed from: i */
    public String f31614i;

    /* JADX INFO: renamed from: j */
    public String f31615j;

    /* JADX INFO: renamed from: k */
    public boolean f31616k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MessageHalfPageComposerAct$a */
    public class C8515a implements Animator.AnimatorListener {
        public C8515a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MessageHalfPageComposerAct.super.m66873d2();
            MessageHalfPageComposerAct.this.overridePendingTransition(szb0.f167028c, szb0.f167029d);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m48875X1(View view) {
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m48886l2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MessageHalfPageComposerAct.class);
        intent.putExtra(f31601l, str);
        intent.putExtra(f31602m, str2);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    private void m48887n2() {
        postDelayed(new Runnable() { // from class: l.r4z
            @Override // java.lang.Runnable
            public final void run() {
                this.f157741a.m48898q2();
            }
        }, 150L);
        if (this.f31613h == null) {
            this.f31613h = new fyq(this);
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.s4z
            @Override // java.lang.Runnable
            public final void run() {
                this.f162473a.m48899r2();
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.j4z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116253a.m48900s2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m48888p2(Bundle bundle) {
        m48889r();
    }

    /* JADX INFO: renamed from: r */
    private void m48889r() {
        if (TextUtils.equals(this.f31615j, f31606q) || TextUtils.equals(this.f31615j, f31607r)) {
            this.f31611f.setInputType(1);
            this.f31610e.setBackground(getResources().getDrawable(c3c0.f78695a2));
        }
        this.f31612g.getPaint().setFakeBoldText(true);
        if (TextUtils.equals(this.f31615j, f31606q)) {
            this.f31611f.setSpaceHint("说点什么");
        } else {
            boolean zEquals = TextUtils.equals(this.f31615j, f31607r);
            VEditTextEmojiCompat vEditTextEmojiCompat = this.f31611f;
            if (zEquals) {
                vEditTextEmojiCompat.setSpaceHint("打个招呼");
            } else {
                vEditTextEmojiCompat.setSpaceHint("打个招呼…");
            }
        }
        xdl0.m208329E0(this.f31612g, new View.OnClickListener() { // from class: l.l4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126072a.m48891v2(view);
            }
        });
        this.f31611f.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.m4z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131346a.m48892w2((CharSequence) obj);
            }
        }));
        xdl0.m208329E0(this.f31608c, new View.OnClickListener() { // from class: l.n4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137149a.m48893y2(view);
            }
        });
        xdl0.m208329E0(this.f31609d, new View.OnClickListener() { // from class: l.o4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageHalfPageComposerAct.m48875X1(view);
            }
        });
        m48887n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m48891v2(View view) {
        if (TextUtils.isEmpty(this.f31611f.getText().toString().trim())) {
            return;
        }
        if (TextUtils.equals(this.f31615j, f31604o)) {
            zvf0.m220399u("e_online_match_chat_send", OMSDialogPositon.p_messages_view, new j760("other_uid", this.f31614i));
            act().hideInput();
            startActivity(MessagesAct.m48949p2(this, this.f31614i, false, false, false, false, null, 8, this.f31611f.getText().toString().trim()));
            m66873d2();
            return;
        }
        if (TextUtils.equals(this.f31615j, f31605p)) {
            String strTrim = this.f31611f.getText().toString().trim();
            act().hideInput();
            Intent intent = new Intent();
            intent.putExtra("input", strTrim);
            setResult(100, intent);
            m66873d2();
            return;
        }
        if (TextUtils.equals(this.f31615j, f31603n)) {
            String strTrim2 = this.f31611f.getText().toString().trim();
            act().hideInput();
            Intent intent2 = new Intent();
            intent2.putExtra("input", strTrim2);
            setResult(200, intent2);
            m66873d2();
            return;
        }
        if (TextUtils.equals(this.f31615j, f31606q) || TextUtils.equals(this.f31615j, f31607r)) {
            o6j0.m162859c("e_matched_send_message", "p_successful_match_view", new o6j0.C18854a[0]);
            final String strTrim3 = this.f31611f.getText().toString().trim();
            if (TextUtils.equals(this.f31615j, f31607r)) {
                m48890u2(strTrim3);
                return;
            }
            if (!qib0.f154711Z.m119125K(strTrim3)) {
                m48890u2(strTrim3);
                return;
            }
            act().dialog().m20503E0(R$string.f20745E4).m20500D(R$string.f20729C4).m20541k0(R$string.f20721B4).m20556t0(R$string.f20737D4, new Runnable() { // from class: l.q4z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152687a.m48890u2(strTrim3);
                }
            }).m20568z0();
            HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
            hashSet.add(this.f31614i);
            MessagesAct.f31635r.put(hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m48892w2(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence.toString().trim());
        VText vText = this.f31612g;
        if (zIsEmpty) {
            vText.setTextColor(getResources().getColor(a1c0.f67120B));
        } else {
            vText.setTextColor(getResources().getColor(a1c0.f67121C));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m48893y2(View view) {
        act().hideInput();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: A2, reason: merged with bridge method [inline-methods] */
    public final void m48890u2(String str) {
        if (act() == null) {
            return;
        }
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("input", str);
        setResult(100, intent);
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        if (TextUtils.equals(this.f31615j, f31606q) || TextUtils.equals(this.f31615j, f31607r)) {
            m48896m2(true);
            return;
        }
        super.m66873d2();
        xdl0.m208357U(this.f31610e, 0);
        int i = szb0.f167026a;
        overridePendingTransition(i, i);
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        if (!TextUtils.equals(this.f31615j, f31606q) && !TextUtils.equals(this.f31615j, f31607r)) {
            xdl0.m208357U(this.f31610e, i);
            return;
        }
        if (i == 0 && this.f31616k) {
            m48896m2(false);
            return;
        }
        if (i > 0) {
            this.f31616k = true;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p4z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f147248a.m48901z2(valueAnimator);
                }
            });
            valueAnimatorOfInt.setDuration(390L);
            valueAnimatorOfInt.setTarget(this.f31610e);
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public View m48895i2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t4z.m187232b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m48895i2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        this.f31614i = getIntent().getStringExtra(f31601l);
        this.f31615j = getIntent().getStringExtra(f31602m);
        if (TextUtils.isEmpty(this.f31614i)) {
            m66873d2();
        } else {
            creates(new e30() { // from class: l.i4z
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f111494a.m48888p2((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final void m48896m2(boolean z) {
        this.f31616k = false;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) this.f31610e.getLayoutParams()).bottomMargin, 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k4z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f121133a.m48897o2(valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(390L);
        valueAnimatorOfInt.setTarget(this.f31610e);
        if (z) {
            valueAnimatorOfInt.addListener(new C8515a());
        }
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m48897o2(ValueAnimator valueAnimator) {
        xdl0.m208357U(this.f31610e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m48898q2() {
        this.f31611f.requestFocus();
        showInput(this.f31611f, 0);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m48899r2() {
        this.f31613h.m123795h();
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m48900s2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f31613h.m123794g(this);
        } else if (c4319c == C4319c.f15549j) {
            this.f31613h.m123794g(null);
        } else if (c4319c == C4319c.f15552m) {
            this.f31613h.m123789b();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m48901z2(ValueAnimator valueAnimator) {
        xdl0.m208357U(this.f31610e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
