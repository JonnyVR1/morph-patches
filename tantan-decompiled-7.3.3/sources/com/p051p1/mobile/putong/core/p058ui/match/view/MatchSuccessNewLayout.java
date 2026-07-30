package com.p051p1.mobile.putong.core.p058ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatHeatActionData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.IceBreakQuestion;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchSuccessNewLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bfx;
import p153l.bnl0;
import p153l.d810;
import p153l.dbc0;
import p153l.dj30;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.o1j0;
import p153l.ogx;
import p153l.pcj;
import p153l.pf60;
import p153l.pgj;
import p153l.pq4;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.qt4;
import p153l.r1j0;
import p153l.rsf0;
import p153l.rv4;
import p153l.tye;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MatchSuccessNewLayout extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public VText f31350A;

    /* JADX INFO: renamed from: B */
    public VImage f31351B;

    /* JADX INFO: renamed from: C */
    public Paint f31352C;

    /* JADX INFO: renamed from: D */
    public float f31353D;

    /* JADX INFO: renamed from: E */
    public float f31354E;

    /* JADX INFO: renamed from: F */
    public boolean f31355F;

    /* JADX INFO: renamed from: G */
    public final PorterDuffXfermode f31356G;

    /* JADX INFO: renamed from: H */
    public User f31357H;

    /* JADX INFO: renamed from: I */
    public float f31358I;

    /* JADX INFO: renamed from: J */
    public int f31359J;

    /* JADX INFO: renamed from: K */
    public int f31360K;

    /* JADX INFO: renamed from: L */
    public final String[] f31361L;

    /* JADX INFO: renamed from: M */
    public final String[] f31362M;

    /* JADX INFO: renamed from: N */
    public PointF f31363N;

    /* JADX INFO: renamed from: O */
    public boolean f31364O;

    /* JADX INFO: renamed from: P */
    public int f31365P;

    /* JADX INFO: renamed from: Q */
    public IceBreakQuestion f31366Q;

    /* JADX INFO: renamed from: R */
    public final Interpolator f31367R;

    /* JADX INFO: renamed from: S */
    public final Interpolator f31368S;

    /* JADX INFO: renamed from: T */
    public final Interpolator f31369T;

    /* JADX INFO: renamed from: U */
    public boolean f31370U;

    /* JADX INFO: renamed from: a */
    public MatchSuccessNewLayout f31371a;

    /* JADX INFO: renamed from: b */
    public View f31372b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f31373c;

    /* JADX INFO: renamed from: d */
    public AppCompatImageView f31374d;

    /* JADX INFO: renamed from: e */
    public VText f31375e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f31376f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f31377g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f31378h;

    /* JADX INFO: renamed from: i */
    public VImage f31379i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f31380j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f31381k;

    /* JADX INFO: renamed from: l */
    public VImage f31382l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f31383m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f31384n;

    /* JADX INFO: renamed from: o */
    public VText f31385o;

    /* JADX INFO: renamed from: p */
    public VText f31386p;

    /* JADX INFO: renamed from: q */
    public VLinear f31387q;

    /* JADX INFO: renamed from: r */
    public VImage f31388r;

    /* JADX INFO: renamed from: s */
    public VText f31389s;

    /* JADX INFO: renamed from: t */
    public VLinear f31390t;

    /* JADX INFO: renamed from: u */
    public VText f31391u;

    /* JADX INFO: renamed from: v */
    public VText f31392v;

    /* JADX INFO: renamed from: w */
    public VText f31393w;

    /* JADX INFO: renamed from: x */
    public VText f31394x;

    /* JADX INFO: renamed from: y */
    public VLinear f31395y;

    /* JADX INFO: renamed from: z */
    public VEditText f31396z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessNewLayout$a */
    public class C8620a implements TextWatcher {
        public C8620a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z;
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            MatchSuccessNewLayout matchSuccessNewLayout = MatchSuccessNewLayout.this;
            if (zIsEmpty) {
                VText vText = matchSuccessNewLayout.f31350A;
                z = false;
                bnl0.m105524M(vText, false);
            } else {
                VText vText2 = matchSuccessNewLayout.f31350A;
                z = true;
                bnl0.m105524M(vText2, true);
            }
            MatchSuccessNewLayout.this.f31350A.setEnabled(z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public MatchSuccessNewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31353D = Float.MAX_VALUE;
        this.f31354E = Float.MAX_VALUE;
        this.f31355F = false;
        this.f31356G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f31358I = 0.0f;
        this.f31359J = qa00.f156293F / 3;
        this.f31360K = qa00.f156302O / 3;
        this.f31361L = new String[]{"[" + App.f16088e.getString(R$string.f18522Hj) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f18491Gj) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f19357j4) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f19328i4) + Constants.AES_SUFFIX};
        this.f31362M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f31364O = false;
        this.f31365P = 0;
        this.f31367R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f31368S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f31369T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f31370U = false;
        m48891U();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m48837A(Conversation conversation) {
        Conversation conversationMo225055clone = conversation.mo225055clone();
        conversationMo225055clone.read = Boolean.TRUE;
        CoreModule.f18264c.f20384f0.m34053mq(conversationMo225055clone);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m48844H(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m48853h() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m48854i() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m48861p() {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m48868w(Runnable runnable) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m48870y() {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m48872A0(Message message, boolean z, Throwable th) {
        if (rv4.m183256f(th)) {
            rv4.m183255e(m48881K(), th, ChatHeatActionData.ExclusiveAction.CHECK);
            this.f31370U = false;
        } else if (!TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            bfx.m104083f(R$string.f18884Th, this.f31357H.m61308fp().profileSmall());
            m48885O(false, z);
        } else {
            CoreModule.f18264c.f20384f0.m33753Of(message.f56859id);
            r1j0.m179419f(R$string.f18634L7);
            this.f31370U = false;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m48874C0(int i, View view) {
        m48883M(this.f31361L[i], this.f31362M[i], i + 1);
    }

    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final void m48873B0(String str, final boolean z) {
        this.f31370U = true;
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f31357H.f56859id);
        if (NullChecker.m82486a(conversationM33859Xe)) {
            l51.m152919y(new Runnable() { // from class: l.vfx
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.agx
                        @Override // p153l.x20
                        public final void call() {
                            MatchSuccessNewLayout.m48837A(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        m48881K().duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33652Fn(this.f31357H.f56859id, message, null, false, false).flatMap(new qcj() { // from class: l.wfx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f188897a.m48921y0((Message) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.xfx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194116a.m48922z0(z, (uxj0) obj);
            }
        }, new y20() { // from class: l.yfx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f199681a.m48872A0(message, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public void m48876E0(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!uqb0.f180394Z.m95954K(str)) {
            m48873B0(str, z);
            return;
        }
        m48881K().dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.rfx
            @Override // java.lang.Runnable
            public final void run() {
                this.f162886a.m48873B0(str, z);
            }
        }).m21567z0();
        HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
        hashSet.add(CoreModule.f18264c.f20381e0.m116503Pa(this.f31357H.f56859id).f56859id);
        MessagesAct.f32483r.put(hashSet);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m48877F0() {
        VText[] vTextArr = {this.f31391u, this.f31392v, this.f31393w, this.f31394x};
        i4g0.m138492A("e_match_emoji", m48881K().pageId(), pf60.m172085a("emoji_quantity", 4));
        for (final int i = 0; i < 4; i++) {
            vTextArr[i].setText(this.f31361L[i]);
            bnl0.m105509E0(vTextArr[i], new View.OnClickListener() { // from class: l.kgx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f126662a.m48874C0(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m48878G0() {
        this.f31396z.clearFocus();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m48879H0(float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(f);
        this.f31395y.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: J */
    public final void m48880J(View view) {
        ogx.m167667a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public MatchAct m48881K() {
        return (MatchAct) getContext();
    }

    /* JADX INFO: renamed from: L */
    public final void m48882L(final pcj<Boolean> pcjVar) {
        bnl0.m105509E0(this.f31351B, new View.OnClickListener() { // from class: l.lgx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132017a.m48901e0(pcjVar, view);
            }
        });
        bnl0.m105509E0(this.f31350A, new View.OnClickListener() { // from class: l.mgx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136808a.m48902f0(view);
            }
        });
        bnl0.m105509E0(this.f31371a, new View.OnClickListener() { // from class: l.ngx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141867a.m48903g0(view);
            }
        });
        bnl0.m105509E0(this.f31377g, new View.OnClickListener() { // from class: l.efx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93876a.m48904h0(view);
            }
        });
        bnl0.m105509E0(this.f31380j, new View.OnClickListener() { // from class: l.ffx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98845a.m48905i0(view);
            }
        });
        bnl0.m105509E0(this.f31396z, new View.OnClickListener() { // from class: l.gfx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103965a.m48900d0(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m48883M(String str, String str2, int i) {
        if (this.f31370U) {
            return;
        }
        this.f31370U = true;
        tye.m193572c().m193583l(str2);
        d810.m114777j(m48881K(), this.f31357H, str, false, new Runnable() { // from class: l.pfx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m48861p();
            }
        }, new Runnable() { // from class: l.qfx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m48854i();
            }
        }, "");
        i4g0.m138523u("e_match_emoji", m48881K().pageId(), pf60.m172085a("select_emoji", Integer.valueOf(i)));
        m48885O(true, false);
    }

    /* JADX INFO: renamed from: N */
    public final void m48884N() {
        int i = dj30.m116035l().male_enter_time;
        l51.m152888H(m48881K(), new Runnable() { // from class: l.zfx
            @Override // java.lang.Runnable
            public final void run() {
                this.f204243a.m48906j0();
            }
        }, i / 4);
        l51.m152888H(m48881K(), new Runnable() { // from class: l.hgx
            @Override // java.lang.Runnable
            public final void run() {
                this.f109448a.m48907k0();
            }
        }, i / 2);
        this.f31372b.setAlpha(0.5f);
        final int i2 = qa00.f156328o;
        final View[] viewArr = {this.f31385o, this.f31386p, this.f31387q, this.f31390t, this.f31395y, this.f31351B};
        for (int i3 = 0; i3 < 6; i3++) {
            View view = viewArr[i3];
            view.setTranslationY(i2);
            view.setAlpha(0.0f);
        }
        final int iM175859d = (qa00.m175858c().widthPixels / 2) + qa00.m175859d(47.5f);
        this.f31377g.setTranslationX(-iM175859d);
        this.f31380j.setTranslationX(iM175859d);
        final PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 1.33f, 0.78f, 1.01f);
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        dj30.m116034k(i, new y20() { // from class: l.igx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114826a.m48908l0(accelerateDecelerateInterpolator, viewArr, i2, pathInterpolator, iM175859d, (Float) obj);
            }
        }, new Runnable() { // from class: l.jgx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m48870y();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m48885O(boolean z, boolean z2) {
        final boolean z3 = true;
        if (!z || !TextUtils.equals(m48881K().f31317e, "tmp_from_home_swipe")) {
            if (z2) {
                m48881K().hideInput();
            }
            m48881K().f31321i = true;
            m48881K().lambda$debugItems$19();
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.jfx
            @Override // java.lang.Runnable
            public final void run() {
                this.f120654a.m48910n0();
            }
        };
        if (!z2) {
            dj30.m116034k(dj30.m116035l().male_keyboard_show_time, new y20() { // from class: l.kfx
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f126522a.m48911o0(z3, (Float) obj);
                }
            }, runnable);
            return;
        }
        m48881K().hideInput();
        final boolean z4 = false;
        dj30.m116034k(dj30.m116035l().male_keyboard_show_head_time, new y20() { // from class: l.lfx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131907a.m48912p0(z4, (Float) obj);
            }
        }, runnable);
    }

    /* JADX INFO: renamed from: P */
    public void m48886P(final Runnable runnable) {
        bnl0.m105524M(this.f31377g, false);
        bnl0.m105524M(this.f31382l, false);
        bnl0.m105524M(this.f31383m, false);
        dj30.m116034k(dj30.m116035l().male_exit_time, new y20() { // from class: l.bgx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76699a.m48913q0((Float) obj);
            }
        }, new Runnable() { // from class: l.cgx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m48844H(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m48887Q(float f) {
        dj30.m116026c(qa00.f156293F * 3, this.f31359J, f, new y20() { // from class: l.fgx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98984a.m48914r0((Float) obj);
            }
        });
        dj30.m116026c(qa00.f156302O * 3, this.f31360K, f, new y20() { // from class: l.ggx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104052a.m48915s0((Float) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m48888R(float f) {
        float width = (this.f31380j.getWidth() / 2.0f) + this.f31359J;
        float width2 = (this.f31380j.getWidth() / 2.0f) * 0.1f;
        int i = qa00.f156316c;
        dj30.m116026c(width, width2 + i, f, new y20() { // from class: l.dgx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88400a.setTranslateX(((Float) obj).floatValue());
            }
        });
        dj30.m116026c((this.f31380j.getHeight() / 2.0f) + this.f31360K, ((this.f31380j.getHeight() / 2.0f) * 0.1f) + i, f, new y20() { // from class: l.egx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93986a.setTranslateY(((Float) obj).floatValue());
            }
        });
        dj30.m116033j(this.f31371a, 0.0f, (this.f31371a.getHeight() - this.f31363N.y) - qa00.m175859d(60.0f), f);
        dj30.m116030g(this.f31380j, 1.0f, 0.1f, f);
        dj30.m116031h(this.f31380j, 1.0f, 0.1f, f);
        double d = f;
        MatchSuccessNewLayout matchSuccessNewLayout = this.f31371a;
        if (d >= 0.9d) {
            dj30.m116028e(matchSuccessNewLayout, 1.0f, 0.0f, (f * 10.0f) - 9.0f);
        } else {
            matchSuccessNewLayout.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: S */
    public final PointF m48889S(float f, float f2) {
        return new PointF(f / 2.0f, (((f2 / 2.0f) - (((RelativeLayout.LayoutParams) this.f31385o.getLayoutParams()).height / 2.0f)) - ((RelativeLayout.LayoutParams) this.f31376f.getLayoutParams()).bottomMargin) - (this.f31380j.getHeight() / 2.0f));
    }

    /* JADX INFO: renamed from: T */
    public final void m48890T(boolean z, float f) {
        float interpolation = this.f31369T.getInterpolation(f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31380j.getLayoutParams();
        float f2 = z ? 0.0f : layoutParams.leftMargin;
        float f3 = z ? layoutParams.leftMargin : 0.0f;
        float fM175859d = z ? 0.0f : qa00.m175859d(40.0f);
        float fM175859d2 = z ? qa00.m175859d(40.0f) : 0.0f;
        float f4 = z ? -10.0f : 10.0f;
        float f5 = z ? 10.0f : -10.0f;
        dj30.m116032i(this.f31377g, f2, f3, interpolation);
        dj30.m116033j(this.f31377g, fM175859d, fM175859d2, interpolation);
        dj30.m116029f(this.f31377g, f4, f5, interpolation);
        dj30.m116032i(this.f31380j, -f2, -f3, interpolation);
        View[] viewArr = {this.f31385o, this.f31386p, this.f31387q};
        float f6 = z ? 1.0f : 0.0f;
        float f7 = z ? 0.0f : 1.0f;
        for (int i = 0; i < 3; i++) {
            dj30.m116028e(viewArr[i], f6, f7, Math.min(f / 0.4f, 1.0f));
        }
        dj30.m116028e(this.f31377g, f6, f7, f);
    }

    /* JADX INFO: renamed from: U */
    public final void m48891U() {
        Paint paint = new Paint(1);
        this.f31352C = paint;
        paint.setDither(true);
        this.f31352C.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: V */
    public final void m48892V(User user) {
        String str;
        long jM174454o = pzi0.m174454o() - user.getLastActiveTimeMillis();
        if (jM174454o > 172800000) {
            bnl0.m105524M(this.f31383m, false);
            return;
        }
        if (jM174454o < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            str = "当前在线";
        } else if (jM174454o < 3600000) {
            str = String.format("%s分钟前活跃", Long.valueOf(jM174454o / Constants.ONE_MIN_IN_MILLIS));
        } else if (jM174454o < 86400000) {
            str = String.format("%s小时前活跃", Long.valueOf(jM174454o / 3600000));
        } else {
            str = jM174454o < 172800000 ? "昨天活跃" : null;
        }
        this.f31383m.setText(str);
        this.f31383m.setCompoundDrawablesWithIntrinsicBounds(App.f16088e.getResources().getDrawable(jM174454o < Constants.INBOX_V2_THROTTLE_WINDOW_MS ? dbc0.f86758Yd : dbc0.f86790Zd), (Drawable) null, (Drawable) null, (Drawable) null);
        bnl0.m105524M(this.f31383m, true);
    }

    /* JADX INFO: renamed from: W */
    public final void m48893W(String str) {
        int i = m48881K().f31320h;
        if (i != 12 && i != 11 && (i != 13 || !pgj.m172246c())) {
            bnl0.m105524M(this.f31379i, false);
            bnl0.m105524M(this.f31382l, false);
            return;
        }
        if (i == 12) {
            bnl0.m105524M(this.f31379i, true);
            bnl0.m105524M(this.f31382l, false);
            this.f31386p.setText("你超级喜欢了 " + str);
            return;
        }
        if (i == 11) {
            bnl0.m105524M(this.f31382l, true);
            bnl0.m105524M(this.f31379i, false);
            this.f31386p.setText(str + " 超级喜欢了你");
            return;
        }
        bnl0.m105524M(this.f31379i, true);
        bnl0.m105524M(this.f31382l, true);
        this.f31386p.setText("你和 " + str + " 超级喜欢了对方");
    }

    /* JADX INFO: renamed from: X */
    public final void m48894X() {
        User user = this.f31357H;
        boolean z = false;
        if (user == null || !user.isPicVerificationVerified()) {
            bnl0.m105524M(this.f31387q, false);
            return;
        }
        if (gra.m131778z()) {
            this.f31388r.setImageResource(dbc0.f86823ae);
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (verificationCenterM32615k4 == null) {
            bnl0.m105524M(this.f31387q, true);
            return;
        }
        StudentVerificationStatus studentVerificationStatus = verificationCenterM32615k4.picVerificationInfo.status;
        if (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(studentVerificationStatus, "pending")) {
            z = true;
        }
        bnl0.m105524M(this.f31387q, z);
        if (z) {
            i4g0.m138492A("e_successful_match_view_verification", m48881K().pageId(), pf60.m172085a("receiver_user_id", this.f31357H.f56859id));
        }
        bnl0.m105509E0(this.f31387q, new View.OnClickListener() { // from class: l.ifx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114718a.m48916t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m48895Y(String str, pcj<Boolean> pcjVar) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        this.f31357H = userM116503Pa;
        if (userM116503Pa == null) {
            return;
        }
        this.f31370U = false;
        this.f31366Q = null;
        CoreModule.f18264c.f20381e0.m116608r9(false);
        m48877F0();
        m48897a0();
        m48882L(pcjVar);
        m48879H0(qa00.f156323j);
        uqb0.f180374G.m127115L0(this.f31378h, CoreModule.f18264c.f20381e0.m116593na().m61308fp().profileBig().formatted());
        uqb0.f180374G.m127115L0(this.f31381k, this.f31357H.m61308fp().profileBig().formatted());
        bnl0.m105540X(this.f31374d, bnl0.m105511F0() + qa00.f156316c);
        bnl0.m105540X(this.f31375e, bnl0.m105511F0() + qa00.f156294G);
        this.f31374d.setAlpha(0.0f);
        this.f31375e.setAlpha(0.0f);
        this.f31375e.getPaint().setFakeBoldText(true);
        this.f31385o.getPaint().setFakeBoldText(true);
        this.f31386p.getPaint().setFakeBoldText(true);
        this.f31350A.getPaint().setFakeBoldText(true);
        this.f31396z.getPaint().setFakeBoldText(true);
        this.f31389s.getPaint().setFakeBoldText(true);
        String strConcat = this.f31357H.name;
        if (gra.m131740r1() && m48881K().f31320h == 44) {
            this.f31385o.setText("重逢配对");
            this.f31386p.setText("再次重逢你们依然互相喜欢，去聊聊吧");
        } else {
            if (strConcat.length() > 6) {
                strConcat = strConcat.substring(0, 6).concat("...");
            }
            this.f31386p.setText("你和 " + strConcat + " 相互喜欢了对方");
        }
        StringBuilder sb = new StringBuilder("和");
        sb.append(this.f31357H.isFemale() ? "她" : "他");
        sb.append("打个招呼吧");
        String string = sb.toString();
        this.f31396z.setHint(string);
        this.f31375e.setText(string);
        m48894X();
        m48893W(strConcat);
        if (gra.m131607O()) {
            m48892V(this.f31357H);
        }
        m48884N();
    }

    /* JADX INFO: renamed from: Z */
    public final void m48896Z(boolean z, float f) {
        float interpolation = this.f31368S.getInterpolation(f);
        dj30.m116026c(z ? qa00.f156330q : 0.0f, z ? 0.0f : qa00.f156330q, interpolation, new y20() { // from class: l.sfx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167777a.m48917u0((Float) obj);
            }
        });
        dj30.m116026c(z ? qa00.f156322i : 0.0f, z ? 0.0f : qa00.f156322i, interpolation, new y20() { // from class: l.tfx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174017a.m48879H0(((Float) obj).floatValue());
            }
        });
        int iIntValue = this.f31365P;
        if (iIntValue <= 0) {
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        int height = iIntValue - this.f31351B.getHeight();
        dj30.m116033j(this.f31395y, z ? 0 : -height, z ? -height : 0, interpolation);
        dj30.m116028e(this.f31390t, z ? 1.0f : 0.0f, z ? 0.0f : 1.0f, Math.min(interpolation / 0.3f, 1.0f));
        dj30.m116033j(this.f31390t, z ? 0 : -qa00.f156289B, z ? -qa00.f156289B : 0, interpolation);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m48897a0() {
        this.f31396z.addTextChangedListener(new C8620a());
        this.f31396z.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.dfx
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f88235a.m48918v0(textView, i, keyEvent);
            }
        });
        bnl0.m105509E0(this.f31374d, new View.OnClickListener() { // from class: l.ofx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147166a.m48919w0(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m48898b0(boolean z, int i) {
        this.f31364O = z;
        this.f31365P = i;
        if (this.f31370U) {
            return;
        }
        if (z) {
            this.f31373c.stopAnimation(false);
        } else {
            m48881K().hideInput();
            this.f31373c.startAnimation();
        }
        m48899c0(z, new Runnable() { // from class: l.hfx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m48853h();
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m48899c0(final boolean z, final Runnable runnable) {
        dj30.m116034k(dj30.m116035l().male_keyboard_show_time, new y20() { // from class: l.mfx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136678a.m48920x0(z, (Float) obj);
            }
        }, new Runnable() { // from class: l.nfx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m48868w(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m48900d0(View view) {
        i4g0.m138520r("e_matched_text_box", m48881K().pageId());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        if (this.f31363N == null) {
            this.f31363N = m48889S(width, height);
        }
        if (this.f31355F) {
            PointF pointF = this.f31363N;
            canvas.translate(pointF.x, pointF.y);
            canvas.rotate(10.0f);
            float fM182965i = (rsf0.m182965i(((int) this.f31354E) * 2) * 0.0183f) + 3.412f;
            float f = this.f31353D;
            float f2 = this.f31354E;
            canvas.drawRoundRect(new RectF(-f, -f2, f, f2), rsf0.m182959c(fM182965i), rsf0.m182959c(fM182965i), this.f31352C);
            this.f31352C.setXfermode(this.f31356G);
            canvas.rotate(-10.0f);
            PointF pointF2 = this.f31363N;
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, this.f31352C, 31);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
        this.f31352C.setXfermode(null);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m48901e0(pcj pcjVar, View view) {
        if (!NullChecker.m82486a(pcjVar) || ((Boolean) pcjVar.call()).booleanValue()) {
            m48885O(false, false);
            i4g0.m138520r("e_match_continue", m48881K().pageId());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m48902f0(View view) {
        if (this.f31370U) {
            return;
        }
        m48876E0(this.f31396z.getText().toString().trim(), this.f31364O);
        i4g0.m138520r("e_matched_send_message", m48881K().pageId());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m48903g0(View view) {
        m48881K().hideInput();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m48904h0(View view) {
        i4g0.m138520r("e_matched_my_profile", m48881K().pageId());
        if (this.f31364O) {
            return;
        }
        m48881K().startActivity(ProfileAct.m51920o2(m48881K(), CoreModule.m30929H().userId(), "from_match", false));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m48905i0(View view) {
        i4g0.m138523u("e_matched_other_profile", m48881K().pageId(), pf60.m172085a("moments_user_id", this.f31357H.f56859id));
        if (this.f31364O) {
            m48881K().hideInput();
        } else {
            m48881K().startActivity(ProfileAct.m51920o2(m48881K(), this.f31357H.f56859id, "from_match", false));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m48906j0() {
        SVGALoader.with(getContext()).from(gra.m131778z() ? "https://auto.tancdn.com/v1/raw/9b2b634e-49ac-49fd-b8bf-76bf3bc8514e14.svga" : "core_male_match_success_heart_bg.svga").isCacheable(true).autoPlay(true).repeatCount(-1).into(this.f31373c);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m48907k0() {
        SVGALoader.with(getContext()).from(gra.m131778z() ? "https://auto.tancdn.com/v1/raw/1b58e151-bc14-48d0-bde7-0155cf0b077a14.svga" : "core_male_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1).into(this.f31384n);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m48908l0(Interpolator interpolator, View[] viewArr, int i, Interpolator interpolator2, int i2, Float f) {
        float interpolation = interpolator.getInterpolation(f.floatValue());
        dj30.m116028e(this.f31372b, 0.5f, 1.0f, Math.min(1.0f, interpolation / 0.2f));
        if (interpolation >= 0.2f) {
            float f2 = ((interpolation * 5.0f) - 1.0f) / 4.0f;
            for (View view : viewArr) {
                float f3 = f2 / 0.6f;
                dj30.m116033j(view, i, 0.0f, Math.min(1.0f, f3));
                dj30.m116028e(view, 0.0f, 1.0f, Math.min(1.0f, f3));
            }
            float interpolation2 = interpolator2.getInterpolation(f2);
            dj30.m116032i(this.f31380j, i2, 0.0f, interpolation2);
            dj30.m116032i(this.f31377g, -i2, 0.0f, interpolation2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m48909m0() {
        bnl0.m105524M(this.f31371a, false);
        m48881K().f31321i = true;
        m48881K().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m48910n0() {
        m48886P(new Runnable() { // from class: l.ufx
            @Override // java.lang.Runnable
            public final void run() {
                this.f178843a.m48909m0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m48911o0(boolean z, Float f) {
        m48890T(z, f.floatValue());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48880J(this);
        boolean zM131778z = gra.m131778z();
        VImage vImage = this.f31351B;
        if (!zM131778z) {
            vImage.setImageResource(dbc0.f86726Xd);
            return;
        }
        vImage.setImageResource(dbc0.f86698Wh);
        this.f31379i.setImageResource(dbc0.f86762Yh);
        this.f31382l.setImageResource(dbc0.f86762Yh);
        this.f31374d.setImageResource(dbc0.f86730Xh);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m48912p0(boolean z, Float f) {
        m48896Z(z, Math.min(f.floatValue() / 0.3f, 1.0f));
        dj30.m116028e(this.f31375e, 1.0f, 0.0f, f.floatValue());
        dj30.m116028e(this.f31374d, 1.0f, 0.0f, f.floatValue());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m48913q0(Float f) {
        float interpolation = this.f31367R.getInterpolation(f.floatValue());
        if (interpolation <= 0.25f) {
            m48887Q(interpolation / 0.25f);
        } else {
            if (this.f31358I <= 0.25f) {
                m48887Q(1.0f);
            }
            m48888R((interpolation - 0.25f) / 0.75f);
        }
        if (interpolation > 0.8f && !CoreModule.f18264c.f20381e0.m116638z7()) {
            CoreModule.f18264c.f20381e0.m116608r9(true);
        }
        this.f31358I = interpolation;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m48914r0(Float f) {
        setTranslateX((this.f31380j.getWidth() / 2.0f) + f.floatValue());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m48915s0(Float f) {
        setTranslateY((this.f31380j.getHeight() / 2.0f) + f.floatValue());
    }

    public void setTranslateX(float f) {
        this.f31355F = true;
        this.f31353D = f;
        invalidate();
    }

    public void setTranslateY(float f) {
        this.f31355F = true;
        this.f31354E = f;
        invalidate();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m48916t0(View view) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            r1j0.m179420g("已认证");
        } else if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            r1j0.m179420g("正在审核中");
        } else {
            pq4.m173309q(m48881K());
        }
        i4g0.m138523u("e_successful_match_view_verification", "p_successful_match_view", jyb.m147494Y("receiver_user_id", this.f31357H.f56859id));
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m48917u0(Float f) {
        bnl0.m105538V(this.f31395y, f.intValue());
        bnl0.m105539W(this.f31395y, f.intValue());
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ boolean m48918v0(TextView textView, int i, KeyEvent keyEvent) {
        if (!qt4.f159383e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f31396z.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m82486a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f31350A.performClick();
        }
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m48919w0(View view) {
        if (this.f31364O) {
            m48885O(false, true);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m48920x0(boolean z, Float f) {
        m48890T(z, f.floatValue());
        m48896Z(z, Math.min(f.floatValue() / 0.3f, 1.0f));
        float f2 = z ? 0.0f : 1.0f;
        float f3 = z ? 1.0f : 0.0f;
        dj30.m116028e(this.f31375e, f2, f3, f.floatValue());
        dj30.m116028e(this.f31374d, f2, f3, f.floatValue());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C22421c m48921y0(Message message) {
        return CoreModule.f18264c.f20384f0.m33905ap(this.f31357H.f56859id);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m48922z0(boolean z, uxj0 uxj0Var) {
        o1j0.m165651y("消息已发送");
        m48885O(true, z);
    }

    public MatchSuccessNewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31353D = Float.MAX_VALUE;
        this.f31354E = Float.MAX_VALUE;
        this.f31355F = false;
        this.f31356G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f31358I = 0.0f;
        this.f31359J = qa00.f156293F / 3;
        this.f31360K = qa00.f156302O / 3;
        this.f31361L = new String[]{"[" + App.f16088e.getString(R$string.f18522Hj) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f18491Gj) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f19357j4) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f19328i4) + Constants.AES_SUFFIX};
        this.f31362M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f31364O = false;
        this.f31365P = 0;
        this.f31367R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f31368S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f31369T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f31370U = false;
        m48891U();
    }

    public MatchSuccessNewLayout(Context context) {
        super(context);
        this.f31353D = Float.MAX_VALUE;
        this.f31354E = Float.MAX_VALUE;
        this.f31355F = false;
        this.f31356G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f31358I = 0.0f;
        this.f31359J = qa00.f156293F / 3;
        this.f31360K = qa00.f156302O / 3;
        this.f31361L = new String[]{"[" + App.f16088e.getString(R$string.f18522Hj) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f18491Gj) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f19357j4) + Constants.AES_SUFFIX, "[" + App.f16088e.getString(R$string.f19328i4) + Constants.AES_SUFFIX};
        this.f31362M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f31364O = false;
        this.f31365P = 0;
        this.f31367R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f31368S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f31369T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f31370U = false;
        m48891U();
    }
}
