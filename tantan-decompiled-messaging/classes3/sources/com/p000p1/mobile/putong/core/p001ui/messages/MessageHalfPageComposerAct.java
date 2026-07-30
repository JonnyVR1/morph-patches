package com.p000p1.mobile.putong.core.p001ui.messages;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageHalfPageComposerAct;
import com.p000p1.mobile.putong.core.p001ui.messages.emoji.VEditTextEmojiCompat;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputEditRootLayout;
import java.util.Collection;
import java.util.HashSet;
import l.a1c0;
import l.c3c0;
import l.dyq;
import l.fyq;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.szb0;
import l.t4z;
import l.xdl0;
import l.zvf0;
import p003l.e30;
import p003l.m250;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageHalfPageComposerAct extends PutongAct implements dyq {

    /* JADX INFO: renamed from: l */
    public static String f1492l = "key_message_uid";

    /* JADX INFO: renamed from: m */
    public static String f1493m = "from";

    /* JADX INFO: renamed from: n */
    public static String f1494n = "from_home_card";

    /* JADX INFO: renamed from: o */
    public static String f1495o = "from_message";

    /* JADX INFO: renamed from: p */
    public static String f1496p = "from_message_impress";

    /* JADX INFO: renamed from: q */
    public static String f1497q = "from_match_ice_break";

    /* JADX INFO: renamed from: r */
    public static String f1498r = "from_card_match_pop";

    /* JADX INFO: renamed from: c */
    public FrameLayout f1499c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1500d;

    /* JADX INFO: renamed from: e */
    public MessageInputEditRootLayout f1501e;

    /* JADX INFO: renamed from: f */
    public VEditTextEmojiCompat f1502f;

    /* JADX INFO: renamed from: g */
    public VText f1503g;

    /* JADX INFO: renamed from: h */
    public fyq f1504h;

    /* JADX INFO: renamed from: i */
    public String f1505i;

    /* JADX INFO: renamed from: j */
    public String f1506j;

    /* JADX INFO: renamed from: k */
    public boolean f1507k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MessageHalfPageComposerAct$a */
    public class C0098a implements Animator.AnimatorListener {
        public C0098a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super/*com.p1.mobile.android.app.Act*/.finish();
            MessageHalfPageComposerAct.this.overridePendingTransition(szb0.c, szb0.d);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m1962X1(View view) {
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m1973l2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MessageHalfPageComposerAct.class);
        intent.putExtra(f1492l, str);
        intent.putExtra(f1493m, str2);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    private void m1974n2() {
        postDelayed(new Runnable() { // from class: l.r4z
            @Override // java.lang.Runnable
            public final void run() {
                this.f6779a.m1986q2();
            }
        }, 150L);
        if (this.f1504h == null) {
            this.f1504h = new fyq(this);
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.s4z
            @Override // java.lang.Runnable
            public final void run() {
                this.f7145a.m1987r2();
            }
        });
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.j4z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4575a.m1988s2((c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m1975p2(Bundle bundle) {
        m1976r();
    }

    /* JADX INFO: renamed from: r */
    private void m1976r() {
        if (TextUtils.equals(this.f1506j, f1497q) || TextUtils.equals(this.f1506j, f1498r)) {
            this.f1502f.setInputType(1);
            this.f1501e.setBackground(getResources().getDrawable(c3c0.a2));
        }
        this.f1503g.getPaint().setFakeBoldText(true);
        if (TextUtils.equals(this.f1506j, f1497q)) {
            this.f1502f.setSpaceHint("说点什么");
        } else {
            boolean zEquals = TextUtils.equals(this.f1506j, f1498r);
            VEditTextEmojiCompat vEditTextEmojiCompat = this.f1502f;
            if (zEquals) {
                vEditTextEmojiCompat.setSpaceHint("打个招呼");
            } else {
                vEditTextEmojiCompat.setSpaceHint("打个招呼…");
            }
        }
        xdl0.E0(this.f1503g, new View.OnClickListener() { // from class: l.l4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5213a.m1978v2(view);
            }
        });
        this.f1502f.m11488h().subscribe((m250<? super CharSequence>) mkd0.G(new e30() { // from class: l.m4z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5542a.m1979w2((CharSequence) obj);
            }
        }));
        xdl0.E0(this.f1499c, new View.OnClickListener() { // from class: l.n4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5833a.m1980y2(view);
            }
        });
        xdl0.E0(this.f1500d, new View.OnClickListener() { // from class: l.o4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageHalfPageComposerAct.m1962X1(view);
            }
        });
        m1974n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m1978v2(View view) {
        if (TextUtils.isEmpty(this.f1502f.getText().toString().trim())) {
            return;
        }
        if (TextUtils.equals(this.f1506j, f1495o)) {
            zvf0.u("e_online_match_chat_send", "p_messages_view", new j760[]{new j760("other_uid", this.f1505i)});
            act().hideInput();
            startActivity(MessagesAct.m2041p2(this, this.f1505i, false, false, false, false, null, 8, this.f1502f.getText().toString().trim()));
            finish();
            return;
        }
        if (TextUtils.equals(this.f1506j, f1496p)) {
            String strTrim = this.f1502f.getText().toString().trim();
            act().hideInput();
            Intent intent = new Intent();
            intent.putExtra("input", strTrim);
            setResult(100, intent);
            finish();
            return;
        }
        if (TextUtils.equals(this.f1506j, f1494n)) {
            String strTrim2 = this.f1502f.getText().toString().trim();
            act().hideInput();
            Intent intent2 = new Intent();
            intent2.putExtra("input", strTrim2);
            setResult(200, intent2);
            finish();
            return;
        }
        if (TextUtils.equals(this.f1506j, f1497q) || TextUtils.equals(this.f1506j, f1498r)) {
            o6j0.c("e_matched_send_message", "p_successful_match_view", new o6j0.a[0]);
            final String strTrim3 = this.f1502f.getText().toString().trim();
            if (TextUtils.equals(this.f1506j, f1498r)) {
                m1977u2(strTrim3);
                return;
            }
            if (!qib0.Z.K(strTrim3)) {
                m1977u2(strTrim3);
                return;
            }
            act().dialog().E0(R.string.E4).D(R.string.C4).k0(R.string.B4).t0(R.string.D4, new Runnable() { // from class: l.q4z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6589a.m1977u2(strTrim3);
                }
            }).z0();
            HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
            hashSet.add(this.f1505i);
            MessagesAct.f1526r.put(hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m1979w2(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence.toString().trim());
        AppCompatTextView appCompatTextView = this.f1503g;
        if (zIsEmpty) {
            appCompatTextView.setTextColor(getResources().getColor(a1c0.B));
        } else {
            appCompatTextView.setTextColor(getResources().getColor(a1c0.C));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m1980y2(View view) {
        act().hideInput();
        act().finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A2, reason: merged with bridge method [inline-methods] */
    public final void m1977u2(String str) {
        if (act() == null) {
            return;
        }
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("input", str);
        setResult(100, intent);
        finish();
    }

    public void finish() {
        if (TextUtils.equals(this.f1506j, f1497q) || TextUtils.equals(this.f1506j, f1498r)) {
            m1984m2(true);
            return;
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
        xdl0.U(this.f1501e, 0);
        int i = szb0.a;
        overridePendingTransition(i, i);
    }

    /* JADX INFO: renamed from: h */
    public void m1982h(int i, int i2) {
        if (!TextUtils.equals(this.f1506j, f1497q) && !TextUtils.equals(this.f1506j, f1498r)) {
            xdl0.U(this.f1501e, i);
            return;
        }
        if (i == 0 && this.f1507k) {
            m1984m2(false);
            return;
        }
        if (i > 0) {
            this.f1507k = true;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p4z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f6313a.m1989z2(valueAnimator);
                }
            });
            valueAnimatorOfInt.setDuration(390L);
            valueAnimatorOfInt.setTarget(this.f1501e);
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public View m1983i2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t4z.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m1983i2(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f1505i = getIntent().getStringExtra(f1492l);
        this.f1506j = getIntent().getStringExtra(f1493m);
        if (TextUtils.isEmpty(this.f1505i)) {
            finish();
        } else {
            creates(new e30() { // from class: l.i4z
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4349a.m1975p2((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final void m1984m2(boolean z) {
        this.f1507k = false;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((ViewGroup.MarginLayoutParams) this.f1501e.getLayoutParams()).bottomMargin, 0);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k4z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4805a.m1985o2(valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(390L);
        valueAnimatorOfInt.setTarget(this.f1501e);
        if (z) {
            valueAnimatorOfInt.addListener(new C0098a());
        }
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m1985o2(ValueAnimator valueAnimator) {
        xdl0.U(this.f1501e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m1986q2() {
        this.f1502f.requestFocus();
        showInput(this.f1502f, 0);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m1987r2() {
        this.f1504h.h();
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m1988s2(c cVar) {
        if (cVar == c.i) {
            this.f1504h.g(this);
        } else if (cVar == c.j) {
            this.f1504h.g((dyq) null);
        } else if (cVar == c.m) {
            this.f1504h.b();
        }
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m1989z2(ValueAnimator valueAnimator) {
        xdl0.U(this.f1501e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
