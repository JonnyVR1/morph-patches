package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageHalfPageComposerAct;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputEditRootLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.HashSet;
import p151v.VText;
import p153l.bnl0;
import p153l.d0r;
import p153l.f0r;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.pf60;
import p153l.psd0;
import p153l.qdz;
import p153l.sfj0;
import p153l.uqb0;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageHalfPageComposerAct extends PutongAct implements d0r {

    /* JADX INFO: renamed from: l */
    public static String f32449l = "key_message_uid";

    /* JADX INFO: renamed from: m */
    public static String f32450m = "from";

    /* JADX INFO: renamed from: n */
    public static String f32451n = "from_home_card";

    /* JADX INFO: renamed from: o */
    public static String f32452o = "from_message";

    /* JADX INFO: renamed from: p */
    public static String f32453p = "from_message_impress";

    /* JADX INFO: renamed from: q */
    public static String f32454q = "from_match_ice_break";

    /* JADX INFO: renamed from: r */
    public static String f32455r = "from_card_match_pop";

    /* JADX INFO: renamed from: c */
    public FrameLayout f32456c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f32457d;

    /* JADX INFO: renamed from: e */
    public MessageInputEditRootLayout f32458e;

    /* JADX INFO: renamed from: f */
    public VEditTextEmojiCompat f32459f;

    /* JADX INFO: renamed from: g */
    public VText f32460g;

    /* JADX INFO: renamed from: h */
    public f0r f32461h;

    /* JADX INFO: renamed from: i */
    public String f32462i;

    /* JADX INFO: renamed from: j */
    public String f32463j;

    /* JADX INFO: renamed from: k */
    public boolean f32464k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MessageHalfPageComposerAct$a */
    public class C8678a implements Animator.AnimatorListener {
        public C8678a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MessageHalfPageComposerAct.super.m68056e2();
            MessageHalfPageComposerAct.this.overridePendingTransition(y7c0.f197765c, y7c0.f197766d);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m50058Y1(View view) {
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m50069m2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MessageHalfPageComposerAct.class);
        intent.putExtra(f32449l, str);
        intent.putExtra(f32450m, str2);
        return intent;
    }

    /* JADX INFO: renamed from: o2 */
    private void m50070o2() {
        postDelayed(new Runnable() { // from class: l.odz
            @Override // java.lang.Runnable
            public final void run() {
                this.f146957a.m50082r2();
            }
        }, 150L);
        if (this.f32461h == null) {
            this.f32461h = new f0r(this);
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.pdz
            @Override // java.lang.Runnable
            public final void run() {
                this.f151850a.m50083s2();
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.gdz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103756a.m50084u2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m50071q2(Bundle bundle) {
        m50072r();
    }

    /* JADX INFO: renamed from: r */
    private void m50072r() {
        if (TextUtils.equals(this.f32463j, f32454q) || TextUtils.equals(this.f32463j, f32455r)) {
            this.f32459f.setInputType(1);
            this.f32458e.setBackground(getResources().getDrawable(ibc0.f113970a2));
        }
        this.f32460g.getPaint().setFakeBoldText(true);
        if (TextUtils.equals(this.f32463j, f32454q)) {
            this.f32459f.setSpaceHint("说点什么");
        } else {
            boolean zEquals = TextUtils.equals(this.f32463j, f32455r);
            VEditTextEmojiCompat vEditTextEmojiCompat = this.f32459f;
            if (zEquals) {
                vEditTextEmojiCompat.setSpaceHint("打个招呼");
            } else {
                vEditTextEmojiCompat.setSpaceHint("打个招呼…");
            }
        }
        bnl0.m105509E0(this.f32460g, new View.OnClickListener() { // from class: l.idz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114541a.m50074w2(view);
            }
        });
        this.f32459f.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.jdz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120374a.m50075y2((CharSequence) obj);
            }
        }));
        bnl0.m105509E0(this.f32456c, new View.OnClickListener() { // from class: l.kdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125287a.m50076z2(view);
            }
        });
        bnl0.m105509E0(this.f32457d, new View.OnClickListener() { // from class: l.ldz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageHalfPageComposerAct.m50058Y1(view);
            }
        });
        m50070o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m50074w2(View view) {
        if (TextUtils.isEmpty(this.f32459f.getText().toString().trim())) {
            return;
        }
        if (TextUtils.equals(this.f32463j, f32452o)) {
            i4g0.m138523u("e_online_match_chat_send", OMSDialogPositon.p_messages_view, new pf60("other_uid", this.f32462i));
            act().hideInput();
            startActivity(MessagesAct.m50132q2(this, this.f32462i, false, false, false, false, null, 8, this.f32459f.getText().toString().trim()));
            m68056e2();
            return;
        }
        if (TextUtils.equals(this.f32463j, f32453p)) {
            String strTrim = this.f32459f.getText().toString().trim();
            act().hideInput();
            Intent intent = new Intent();
            intent.putExtra("input", strTrim);
            setResult(100, intent);
            m68056e2();
            return;
        }
        if (TextUtils.equals(this.f32463j, f32451n)) {
            String strTrim2 = this.f32459f.getText().toString().trim();
            act().hideInput();
            Intent intent2 = new Intent();
            intent2.putExtra("input", strTrim2);
            setResult(200, intent2);
            m68056e2();
            return;
        }
        if (TextUtils.equals(this.f32463j, f32454q) || TextUtils.equals(this.f32463j, f32455r)) {
            sfj0.m185596c("e_matched_send_message", "p_successful_match_view", new sfj0.C20032a[0]);
            final String strTrim3 = this.f32459f.getText().toString().trim();
            if (TextUtils.equals(this.f32463j, f32455r)) {
                m50073v2(strTrim3);
                return;
            }
            if (!uqb0.f180394Z.m95954K(strTrim3)) {
                m50073v2(strTrim3);
                return;
            }
            act().dialog().m21502E0(R$string.f21487E4).m21499D(R$string.f21471C4).m21540k0(R$string.f21463B4).m21555t0(R$string.f21479D4, new Runnable() { // from class: l.ndz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141560a.m50073v2(strTrim3);
                }
            }).m21567z0();
            HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
            hashSet.add(this.f32462i);
            MessagesAct.f32483r.put(hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m50075y2(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence.toString().trim());
        VText vText = this.f32460g;
        if (zIsEmpty) {
            vText.setTextColor(getResources().getColor(g9c0.f102784B));
        } else {
            vText.setTextColor(getResources().getColor(g9c0.f102785C));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m50076z2(View view) {
        act().hideInput();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m50077A2(ValueAnimator valueAnimator) {
        bnl0.m105537U(this.f32458e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
    public final void m50073v2(String str) {
        if (act() == null) {
            return;
        }
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("input", str);
        setResult(100, intent);
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        if (TextUtils.equals(this.f32463j, f32454q) || TextUtils.equals(this.f32463j, f32455r)) {
            m50080n2(true);
            return;
        }
        super.m68056e2();
        bnl0.m105537U(this.f32458e, 0);
        int i = y7c0.f197763a;
        overridePendingTransition(i, i);
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        if (!TextUtils.equals(this.f32463j, f32454q) && !TextUtils.equals(this.f32463j, f32455r)) {
            bnl0.m105537U(this.f32458e, i);
            return;
        }
        if (i == 0 && this.f32464k) {
            m50080n2(false);
            return;
        }
        if (i > 0) {
            this.f32464k = true;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mdz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f136422a.m50077A2(valueAnimator);
                }
            });
            valueAnimatorOfInt.setDuration(390L);
            valueAnimatorOfInt.setTarget(this.f32458e);
            valueAnimatorOfInt.start();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m50079k2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        this.f32462i = getIntent().getStringExtra(f32449l);
        this.f32463j = getIntent().getStringExtra(f32450m);
        if (TextUtils.isEmpty(this.f32462i)) {
            m68056e2();
        } else {
            creates(new y20() { // from class: l.fdz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98532a.m50071q2((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k2 */
    public View m50079k2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qdz.m176214b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m50080n2(boolean z) {
        this.f32464k = false;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) this.f32458e.getLayoutParams()).bottomMargin, 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hdz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f109054a.m50081p2(valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(390L);
        valueAnimatorOfInt.setTarget(this.f32458e);
        if (z) {
            valueAnimatorOfInt.addListener(new C8678a());
        }
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m50081p2(ValueAnimator valueAnimator) {
        bnl0.m105537U(this.f32458e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m50082r2() {
        this.f32459f.requestFocus();
        showInput(this.f32459f, 0);
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m50083s2() {
        this.f32461h.m123510h();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m50084u2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f32461h.m123509g(this);
        } else if (c4470c == C4470c.f16268j) {
            this.f32461h.m123509g(null);
        } else if (c4470c == C4470c.f16271m) {
            this.f32461h.m123504b();
        }
    }
}
