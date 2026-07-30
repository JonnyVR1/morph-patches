package com.p046p1.mobile.putong.core.p053ui.match.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatHeatActionData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.IceBreakQuestion;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchSuccessNewLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.ccx;
import p149l.e30;
import p149l.e51;
import p149l.ikf0;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.pa30;
import p149l.pdx;
import p149l.pxe;
import p149l.qib0;
import p149l.qp4;
import p149l.roj0;
import p149l.rs4;
import p149l.su4;
import p149l.t100;
import p149l.tz00;
import p149l.upa;
import p149l.v9j;
import p149l.vdj;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MatchSuccessNewLayout extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public VText f30502A;

    /* JADX INFO: renamed from: B */
    public VImage f30503B;

    /* JADX INFO: renamed from: C */
    public Paint f30504C;

    /* JADX INFO: renamed from: D */
    public float f30505D;

    /* JADX INFO: renamed from: E */
    public float f30506E;

    /* JADX INFO: renamed from: F */
    public boolean f30507F;

    /* JADX INFO: renamed from: G */
    public final PorterDuffXfermode f30508G;

    /* JADX INFO: renamed from: H */
    public User f30509H;

    /* JADX INFO: renamed from: I */
    public float f30510I;

    /* JADX INFO: renamed from: J */
    public int f30511J;

    /* JADX INFO: renamed from: K */
    public int f30512K;

    /* JADX INFO: renamed from: L */
    public final String[] f30513L;

    /* JADX INFO: renamed from: M */
    public final String[] f30514M;

    /* JADX INFO: renamed from: N */
    public PointF f30515N;

    /* JADX INFO: renamed from: O */
    public boolean f30516O;

    /* JADX INFO: renamed from: P */
    public int f30517P;

    /* JADX INFO: renamed from: Q */
    public IceBreakQuestion f30518Q;

    /* JADX INFO: renamed from: R */
    public final Interpolator f30519R;

    /* JADX INFO: renamed from: S */
    public final Interpolator f30520S;

    /* JADX INFO: renamed from: T */
    public final Interpolator f30521T;

    /* JADX INFO: renamed from: U */
    public boolean f30522U;

    /* JADX INFO: renamed from: a */
    public MatchSuccessNewLayout f30523a;

    /* JADX INFO: renamed from: b */
    public View f30524b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f30525c;

    /* JADX INFO: renamed from: d */
    public AppCompatImageView f30526d;

    /* JADX INFO: renamed from: e */
    public VText f30527e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f30528f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f30529g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f30530h;

    /* JADX INFO: renamed from: i */
    public VImage f30531i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f30532j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f30533k;

    /* JADX INFO: renamed from: l */
    public VImage f30534l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f30535m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f30536n;

    /* JADX INFO: renamed from: o */
    public VText f30537o;

    /* JADX INFO: renamed from: p */
    public VText f30538p;

    /* JADX INFO: renamed from: q */
    public VLinear f30539q;

    /* JADX INFO: renamed from: r */
    public VImage f30540r;

    /* JADX INFO: renamed from: s */
    public VText f30541s;

    /* JADX INFO: renamed from: t */
    public VLinear f30542t;

    /* JADX INFO: renamed from: u */
    public VText f30543u;

    /* JADX INFO: renamed from: v */
    public VText f30544v;

    /* JADX INFO: renamed from: w */
    public VText f30545w;

    /* JADX INFO: renamed from: x */
    public VText f30546x;

    /* JADX INFO: renamed from: y */
    public VLinear f30547y;

    /* JADX INFO: renamed from: z */
    public VEditText f30548z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessNewLayout$a */
    public class C8457a implements TextWatcher {
        public C8457a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z;
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            MatchSuccessNewLayout matchSuccessNewLayout = MatchSuccessNewLayout.this;
            if (zIsEmpty) {
                VText vText = matchSuccessNewLayout.f30502A;
                z = false;
                xdl0.m208344M(vText, false);
            } else {
                VText vText2 = matchSuccessNewLayout.f30502A;
                z = true;
                xdl0.m208344M(vText2, true);
            }
            MatchSuccessNewLayout.this.f30502A.setEnabled(z);
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
        this.f30505D = Float.MAX_VALUE;
        this.f30506E = Float.MAX_VALUE;
        this.f30507F = false;
        this.f30508G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f30510I = 0.0f;
        this.f30511J = t100.f167231F / 3;
        this.f30512K = t100.f167240O / 3;
        this.f30513L = new String[]{"[" + App.f15369e.getString(R$string.f18704lj) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18673kj) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18567h4) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18536g4) + Constants.AES_SUFFIX};
        this.f30514M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f30516O = false;
        this.f30517P = 0;
        this.f30519R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f30520S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f30521T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f30522U = false;
        m47708U();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m47654A(Conversation conversation) {
        Conversation conversationMo223809clone = conversation.mo223809clone();
        conversationMo223809clone.read = Boolean.TRUE;
        CoreModule.f17545c.f19642f0.m33050mq(conversationMo223809clone);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m47661H(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m47670h() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m47671i() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m47678p() {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m47685w(Runnable runnable) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m47687y() {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m47689A0(Message message, boolean z, Throwable th) {
        if (su4.m185996f(th)) {
            su4.m185995e(m47698K(), th, ChatHeatActionData.ExclusiveAction.CHECK);
            this.f30522U = false;
        } else if (!TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            ccx.m106209f(R$string.f19096yh, this.f30509H.m60124fp().profileSmall());
            m47702O(false, z);
        } else {
            CoreModule.f17545c.f19642f0.m32750Of(message.f56011id);
            osi0.m165782f(R$string.f17844J7);
            this.f30522U = false;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m47691C0(int i, View view) {
        m47700M(this.f30513L[i], this.f30514M[i], i + 1);
    }

    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final void m47690B0(String str, final boolean z) {
        this.f30522U = true;
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f30509H.f56011id);
        if (NullChecker.m81303a(conversationM32856Xe)) {
            e51.m114774y(new Runnable() { // from class: l.wcx
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.bdx
                        @Override // p149l.d30
                        public final void call() {
                            MatchSuccessNewLayout.m47654A(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get("text");
        m47698K().duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32649Fn(this.f30509H.f56011id, message, null, false, false).flatMap(new w9j() { // from class: l.xcx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f192284a.m47738y0((Message) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ycx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197506a.m47739z0(z, (roj0) obj);
            }
        }, new e30() { // from class: l.zcx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202600a.m47689A0(message, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public void m47693E0(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!qib0.f154711Z.m119125K(str)) {
            m47690B0(str, z);
            return;
        }
        m47698K().dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.scx
            @Override // java.lang.Runnable
            public final void run() {
                this.f163786a.m47690B0(str, z);
            }
        }).m20568z0();
        HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
        hashSet.add(CoreModule.f17545c.f19639e0.m169430Pa(this.f30509H.f56011id).f56011id);
        MessagesAct.f31635r.put(hashSet);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m47694F0() {
        VText[] vTextArr = {this.f30543u, this.f30544v, this.f30545w, this.f30546x};
        zvf0.m220368A("e_match_emoji", m47698K().pageId(), j760.m140076a("emoji_quantity", 4));
        for (final int i = 0; i < 4; i++) {
            vTextArr[i].setText(this.f30513L[i]);
            xdl0.m208329E0(vTextArr[i], new View.OnClickListener() { // from class: l.ldx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127620a.m47691C0(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m47695G0() {
        this.f30548z.clearFocus();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m47696H0(float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(f);
        this.f30547y.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: J */
    public final void m47697J(View view) {
        pdx.m168443a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public MatchAct m47698K() {
        return (MatchAct) getContext();
    }

    /* JADX INFO: renamed from: L */
    public final void m47699L(final v9j<Boolean> v9jVar) {
        xdl0.m208329E0(this.f30503B, new View.OnClickListener() { // from class: l.mdx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133326a.m47718e0(v9jVar, view);
            }
        });
        xdl0.m208329E0(this.f30502A, new View.OnClickListener() { // from class: l.ndx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138562a.m47719f0(view);
            }
        });
        xdl0.m208329E0(this.f30523a, new View.OnClickListener() { // from class: l.odx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143253a.m47720g0(view);
            }
        });
        xdl0.m208329E0(this.f30529g, new View.OnClickListener() { // from class: l.fcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96871a.m47721h0(view);
            }
        });
        xdl0.m208329E0(this.f30532j, new View.OnClickListener() { // from class: l.gcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102058a.m47722i0(view);
            }
        });
        xdl0.m208329E0(this.f30548z, new View.OnClickListener() { // from class: l.hcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107111a.m47717d0(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m47700M(String str, String str2, int i) {
        if (this.f30522U) {
            return;
        }
        this.f30522U = true;
        pxe.m171835c().m171846l(str2);
        tz00.m191128j(m47698K(), this.f30509H, str, false, new Runnable() { // from class: l.qcx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m47678p();
            }
        }, new Runnable() { // from class: l.rcx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m47671i();
            }
        }, "");
        zvf0.m220399u("e_match_emoji", m47698K().pageId(), j760.m140076a("select_emoji", Integer.valueOf(i)));
        m47702O(true, false);
    }

    /* JADX INFO: renamed from: N */
    public final void m47701N() {
        int i = pa30.m167982l().male_enter_time;
        e51.m114743H(m47698K(), new Runnable() { // from class: l.adx
            @Override // java.lang.Runnable
            public final void run() {
                this.f68974a.m47723j0();
            }
        }, i / 4);
        e51.m114743H(m47698K(), new Runnable() { // from class: l.idx
            @Override // java.lang.Runnable
            public final void run() {
                this.f112697a.m47724k0();
            }
        }, i / 2);
        this.f30524b.setAlpha(0.5f);
        final int i2 = t100.f167266o;
        final View[] viewArr = {this.f30537o, this.f30538p, this.f30539q, this.f30542t, this.f30547y, this.f30503B};
        for (int i3 = 0; i3 < 6; i3++) {
            View view = viewArr[i3];
            view.setTranslationY(i2);
            view.setAlpha(0.0f);
        }
        final int iM186890d = (t100.m186889c().widthPixels / 2) + t100.m186890d(47.5f);
        this.f30529g.setTranslationX(-iM186890d);
        this.f30532j.setTranslationX(iM186890d);
        final PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 1.33f, 0.78f, 1.01f);
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        pa30.m167981k(i, new e30() { // from class: l.jdx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117446a.m47725l0(accelerateDecelerateInterpolator, viewArr, i2, pathInterpolator, iM186890d, (Float) obj);
            }
        }, new Runnable() { // from class: l.kdx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m47687y();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m47702O(boolean z, boolean z2) {
        final boolean z3 = true;
        if (!z || !TextUtils.equals(m47698K().f30469e, "tmp_from_home_swipe")) {
            if (z2) {
                m47698K().hideInput();
            }
            m47698K().f30473i = true;
            m47698K().lambda$debugItems$19();
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.kcx
            @Override // java.lang.Runnable
            public final void run() {
                this.f122516a.m47727n0();
            }
        };
        if (!z2) {
            pa30.m167981k(pa30.m167982l().male_keyboard_show_time, new e30() { // from class: l.lcx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127477a.m47728o0(z3, (Float) obj);
                }
            }, runnable);
            return;
        }
        m47698K().hideInput();
        final boolean z4 = false;
        pa30.m167981k(pa30.m167982l().male_keyboard_show_head_time, new e30() { // from class: l.mcx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133190a.m47729p0(z4, (Float) obj);
            }
        }, runnable);
    }

    /* JADX INFO: renamed from: P */
    public void m47703P(final Runnable runnable) {
        xdl0.m208344M(this.f30529g, false);
        xdl0.m208344M(this.f30534l, false);
        xdl0.m208344M(this.f30535m, false);
        pa30.m167981k(pa30.m167982l().male_exit_time, new e30() { // from class: l.cdx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80418a.m47730q0((Float) obj);
            }
        }, new Runnable() { // from class: l.ddx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m47661H(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m47704Q(float f) {
        pa30.m167973c(t100.f167231F * 3, this.f30511J, f, new e30() { // from class: l.gdx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102138a.m47731r0((Float) obj);
            }
        });
        pa30.m167973c(t100.f167240O * 3, this.f30512K, f, new e30() { // from class: l.hdx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107319a.m47732s0((Float) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m47705R(float f) {
        float width = (this.f30532j.getWidth() / 2.0f) + this.f30511J;
        float width2 = (this.f30532j.getWidth() / 2.0f) * 0.1f;
        int i = t100.f167254c;
        pa30.m167973c(width, width2 + i, f, new e30() { // from class: l.edx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90651a.setTranslateX(((Float) obj).floatValue());
            }
        });
        pa30.m167973c((this.f30532j.getHeight() / 2.0f) + this.f30512K, ((this.f30532j.getHeight() / 2.0f) * 0.1f) + i, f, new e30() { // from class: l.fdx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97083a.setTranslateY(((Float) obj).floatValue());
            }
        });
        pa30.m167980j(this.f30523a, 0.0f, (this.f30523a.getHeight() - this.f30515N.y) - t100.m186890d(60.0f), f);
        pa30.m167977g(this.f30532j, 1.0f, 0.1f, f);
        pa30.m167978h(this.f30532j, 1.0f, 0.1f, f);
        double d = f;
        MatchSuccessNewLayout matchSuccessNewLayout = this.f30523a;
        if (d >= 0.9d) {
            pa30.m167975e(matchSuccessNewLayout, 1.0f, 0.0f, (f * 10.0f) - 9.0f);
        } else {
            matchSuccessNewLayout.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: S */
    public final PointF m47706S(float f, float f2) {
        return new PointF(f / 2.0f, (((f2 / 2.0f) - (((RelativeLayout.LayoutParams) this.f30537o.getLayoutParams()).height / 2.0f)) - ((RelativeLayout.LayoutParams) this.f30528f.getLayoutParams()).bottomMargin) - (this.f30532j.getHeight() / 2.0f));
    }

    /* JADX INFO: renamed from: T */
    public final void m47707T(boolean z, float f) {
        float interpolation = this.f30521T.getInterpolation(f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30532j.getLayoutParams();
        float f2 = z ? 0.0f : layoutParams.leftMargin;
        float f3 = z ? layoutParams.leftMargin : 0.0f;
        float fM186890d = z ? 0.0f : t100.m186890d(40.0f);
        float fM186890d2 = z ? t100.m186890d(40.0f) : 0.0f;
        float f4 = z ? -10.0f : 10.0f;
        float f5 = z ? 10.0f : -10.0f;
        pa30.m167979i(this.f30529g, f2, f3, interpolation);
        pa30.m167980j(this.f30529g, fM186890d, fM186890d2, interpolation);
        pa30.m167976f(this.f30529g, f4, f5, interpolation);
        pa30.m167979i(this.f30532j, -f2, -f3, interpolation);
        View[] viewArr = {this.f30537o, this.f30538p, this.f30539q};
        float f6 = z ? 1.0f : 0.0f;
        float f7 = z ? 0.0f : 1.0f;
        for (int i = 0; i < 3; i++) {
            pa30.m167975e(viewArr[i], f6, f7, Math.min(f / 0.4f, 1.0f));
        }
        pa30.m167975e(this.f30529g, f6, f7, f);
    }

    /* JADX INFO: renamed from: U */
    public final void m47708U() {
        Paint paint = new Paint(1);
        this.f30504C = paint;
        paint.setDither(true);
        this.f30504C.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: V */
    public final void m47709V(User user) {
        String str;
        long jM155944o = mqi0.m155944o() - user.getLastActiveTimeMillis();
        if (jM155944o > 172800000) {
            xdl0.m208344M(this.f30535m, false);
            return;
        }
        if (jM155944o < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            str = "当前在线";
        } else if (jM155944o < 3600000) {
            str = String.format("%s分钟前活跃", Long.valueOf(jM155944o / Constants.ONE_MIN_IN_MILLIS));
        } else if (jM155944o < 86400000) {
            str = String.format("%s小时前活跃", Long.valueOf(jM155944o / 3600000));
        } else {
            str = jM155944o < 172800000 ? "昨天活跃" : null;
        }
        this.f30535m.setText(str);
        this.f30535m.setCompoundDrawablesWithIntrinsicBounds(App.f15369e.getResources().getDrawable(jM155944o < Constants.INBOX_V2_THROTTLE_WINDOW_MS ? x2c0.f189886Xd : x2c0.f189917Yd), (Drawable) null, (Drawable) null, (Drawable) null);
        xdl0.m208344M(this.f30535m, true);
    }

    /* JADX INFO: renamed from: W */
    public final void m47710W(String str) {
        int i = m47698K().f30472h;
        if (i != 12 && i != 11 && (i != 13 || !vdj.m198001c())) {
            xdl0.m208344M(this.f30531i, false);
            xdl0.m208344M(this.f30534l, false);
            return;
        }
        if (i == 12) {
            xdl0.m208344M(this.f30531i, true);
            xdl0.m208344M(this.f30534l, false);
            this.f30538p.setText("你超级喜欢了 " + str);
            return;
        }
        if (i == 11) {
            xdl0.m208344M(this.f30534l, true);
            xdl0.m208344M(this.f30531i, false);
            this.f30538p.setText(str + " 超级喜欢了你");
            return;
        }
        xdl0.m208344M(this.f30531i, true);
        xdl0.m208344M(this.f30534l, true);
        this.f30538p.setText("你和 " + str + " 超级喜欢了对方");
    }

    /* JADX INFO: renamed from: X */
    public final void m47711X() {
        User user = this.f30509H;
        boolean z = false;
        if (user == null || !user.isPicVerificationVerified()) {
            xdl0.m208344M(this.f30539q, false);
            return;
        }
        if (upa.m194847z()) {
            this.f30540r.setImageResource(x2c0.f189948Zd);
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (verificationCenterM31612k4 == null) {
            xdl0.m208344M(this.f30539q, true);
            return;
        }
        StudentVerificationStatus studentVerificationStatus = verificationCenterM31612k4.picVerificationInfo.status;
        if (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(studentVerificationStatus, "pending")) {
            z = true;
        }
        xdl0.m208344M(this.f30539q, z);
        if (z) {
            zvf0.m220368A("e_successful_match_view_verification", m47698K().pageId(), j760.m140076a("receiver_user_id", this.f30509H.f56011id));
        }
        xdl0.m208329E0(this.f30539q, new View.OnClickListener() { // from class: l.jcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117351a.m47733t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m47712Y(String str, v9j<Boolean> v9jVar) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        this.f30509H = userM169430Pa;
        if (userM169430Pa == null) {
            return;
        }
        this.f30522U = false;
        this.f30518Q = null;
        CoreModule.f17545c.f19639e0.m169535r9(false);
        m47694F0();
        m47714a0();
        m47699L(v9jVar);
        m47696H0(t100.f167261j);
        qib0.f154691G.m102331L0(this.f30530h, CoreModule.f17545c.f19639e0.m169520na().m60124fp().profileBig().formatted());
        qib0.f154691G.m102331L0(this.f30533k, this.f30509H.m60124fp().profileBig().formatted());
        xdl0.m208360X(this.f30526d, xdl0.m208331F0() + t100.f167254c);
        xdl0.m208360X(this.f30527e, xdl0.m208331F0() + t100.f167232G);
        this.f30526d.setAlpha(0.0f);
        this.f30527e.setAlpha(0.0f);
        this.f30527e.getPaint().setFakeBoldText(true);
        this.f30537o.getPaint().setFakeBoldText(true);
        this.f30538p.getPaint().setFakeBoldText(true);
        this.f30502A.getPaint().setFakeBoldText(true);
        this.f30548z.getPaint().setFakeBoldText(true);
        this.f30541s.getPaint().setFakeBoldText(true);
        String strConcat = this.f30509H.name;
        if (upa.m194809r1() && m47698K().f30472h == 44) {
            this.f30537o.setText("重逢配对");
            this.f30538p.setText("再次重逢你们依然互相喜欢，去聊聊吧");
        } else {
            if (strConcat.length() > 6) {
                strConcat = strConcat.substring(0, 6).concat("...");
            }
            this.f30538p.setText("你和 " + strConcat + " 相互喜欢了对方");
        }
        StringBuilder sb = new StringBuilder("和");
        sb.append(this.f30509H.isFemale() ? "她" : "他");
        sb.append("打个招呼吧");
        String string = sb.toString();
        this.f30548z.setHint(string);
        this.f30527e.setText(string);
        m47711X();
        m47710W(strConcat);
        if (upa.m194676O()) {
            m47709V(this.f30509H);
        }
        m47701N();
    }

    /* JADX INFO: renamed from: Z */
    public final void m47713Z(boolean z, float f) {
        float interpolation = this.f30520S.getInterpolation(f);
        pa30.m167973c(z ? t100.f167268q : 0.0f, z ? 0.0f : t100.f167268q, interpolation, new e30() { // from class: l.tcx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169481a.m47734u0((Float) obj);
            }
        });
        pa30.m167973c(z ? t100.f167260i : 0.0f, z ? 0.0f : t100.f167260i, interpolation, new e30() { // from class: l.ucx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175875a.m47696H0(((Float) obj).floatValue());
            }
        });
        int iIntValue = this.f30517P;
        if (iIntValue <= 0) {
            iIntValue = Act.savedKeyboardHeight.get().intValue();
        }
        int height = iIntValue - this.f30503B.getHeight();
        pa30.m167980j(this.f30547y, z ? 0 : -height, z ? -height : 0, interpolation);
        pa30.m167975e(this.f30542t, z ? 1.0f : 0.0f, z ? 0.0f : 1.0f, Math.min(interpolation / 0.3f, 1.0f));
        pa30.m167980j(this.f30542t, z ? 0 : -t100.f167227B, z ? -t100.f167227B : 0, interpolation);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m47714a0() {
        this.f30548z.addTextChangedListener(new C8457a());
        this.f30548z.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ecx
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f90574a.m47735v0(textView, i, keyEvent);
            }
        });
        xdl0.m208329E0(this.f30526d, new View.OnClickListener() { // from class: l.pcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148241a.m47736w0(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m47715b0(boolean z, int i) {
        this.f30516O = z;
        this.f30517P = i;
        if (this.f30522U) {
            return;
        }
        if (z) {
            this.f30525c.stopAnimation(false);
        } else {
            m47698K().hideInput();
            this.f30525c.startAnimation();
        }
        m47716c0(z, new Runnable() { // from class: l.icx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m47670h();
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m47716c0(final boolean z, final Runnable runnable) {
        pa30.m167981k(pa30.m167982l().male_keyboard_show_time, new e30() { // from class: l.ncx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138234a.m47737x0(z, (Float) obj);
            }
        }, new Runnable() { // from class: l.ocx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m47685w(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m47717d0(View view) {
        zvf0.m220396r("e_matched_text_box", m47698K().pageId());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        if (this.f30515N == null) {
            this.f30515N = m47706S(width, height);
        }
        if (this.f30507F) {
            PointF pointF = this.f30515N;
            canvas.translate(pointF.x, pointF.y);
            canvas.rotate(10.0f);
            float fM136795i = (ikf0.m136795i(((int) this.f30506E) * 2) * 0.0183f) + 3.412f;
            float f = this.f30505D;
            float f2 = this.f30506E;
            canvas.drawRoundRect(new RectF(-f, -f2, f, f2), ikf0.m136789c(fM136795i), ikf0.m136789c(fM136795i), this.f30504C);
            this.f30504C.setXfermode(this.f30508G);
            canvas.rotate(-10.0f);
            PointF pointF2 = this.f30515N;
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, this.f30504C, 31);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
        this.f30504C.setXfermode(null);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m47718e0(v9j v9jVar, View view) {
        if (!NullChecker.m81303a(v9jVar) || ((Boolean) v9jVar.call()).booleanValue()) {
            m47702O(false, false);
            zvf0.m220396r("e_match_continue", m47698K().pageId());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m47719f0(View view) {
        if (this.f30522U) {
            return;
        }
        m47693E0(this.f30548z.getText().toString().trim(), this.f30516O);
        zvf0.m220396r("e_matched_send_message", m47698K().pageId());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m47720g0(View view) {
        m47698K().hideInput();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m47721h0(View view) {
        zvf0.m220396r("e_matched_my_profile", m47698K().pageId());
        if (this.f30516O) {
            return;
        }
        m47698K().startActivity(ProfileAct.m50736n2(m47698K(), CoreModule.m29931H().userId(), "from_match", false));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m47722i0(View view) {
        zvf0.m220399u("e_matched_other_profile", m47698K().pageId(), j760.m140076a("moments_user_id", this.f30509H.f56011id));
        if (this.f30516O) {
            m47698K().hideInput();
        } else {
            m47698K().startActivity(ProfileAct.m50736n2(m47698K(), this.f30509H.f56011id, "from_match", false));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m47723j0() {
        SVGALoader.with(getContext()).from(upa.m194847z() ? "https://auto.tancdn.com/v1/raw/9b2b634e-49ac-49fd-b8bf-76bf3bc8514e14.svga" : "core_male_match_success_heart_bg.svga").isCacheable(true).autoPlay(true).repeatCount(-1).into(this.f30525c);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m47724k0() {
        SVGALoader.with(getContext()).from(upa.m194847z() ? "https://auto.tancdn.com/v1/raw/1b58e151-bc14-48d0-bde7-0155cf0b077a14.svga" : "core_male_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1).into(this.f30536n);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m47725l0(Interpolator interpolator, View[] viewArr, int i, Interpolator interpolator2, int i2, Float f) {
        float interpolation = interpolator.getInterpolation(f.floatValue());
        pa30.m167975e(this.f30524b, 0.5f, 1.0f, Math.min(1.0f, interpolation / 0.2f));
        if (interpolation >= 0.2f) {
            float f2 = ((interpolation * 5.0f) - 1.0f) / 4.0f;
            for (View view : viewArr) {
                float f3 = f2 / 0.6f;
                pa30.m167980j(view, i, 0.0f, Math.min(1.0f, f3));
                pa30.m167975e(view, 0.0f, 1.0f, Math.min(1.0f, f3));
            }
            float interpolation2 = interpolator2.getInterpolation(f2);
            pa30.m167979i(this.f30532j, i2, 0.0f, interpolation2);
            pa30.m167979i(this.f30529g, -i2, 0.0f, interpolation2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m47726m0() {
        xdl0.m208344M(this.f30523a, false);
        m47698K().f30473i = true;
        m47698K().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m47727n0() {
        m47703P(new Runnable() { // from class: l.vcx
            @Override // java.lang.Runnable
            public final void run() {
                this.f180996a.m47726m0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m47728o0(boolean z, Float f) {
        m47707T(z, f.floatValue());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47697J(this);
        boolean zM194847z = upa.m194847z();
        VImage vImage = this.f30503B;
        if (!zM194847z) {
            vImage.setImageResource(x2c0.f189855Wd);
            return;
        }
        vImage.setImageResource(x2c0.f190237ih);
        this.f30531i.setImageResource(x2c0.f190300kh);
        this.f30534l.setImageResource(x2c0.f190300kh);
        this.f30526d.setImageResource(x2c0.f190268jh);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m47729p0(boolean z, Float f) {
        m47713Z(z, Math.min(f.floatValue() / 0.3f, 1.0f));
        pa30.m167975e(this.f30527e, 1.0f, 0.0f, f.floatValue());
        pa30.m167975e(this.f30526d, 1.0f, 0.0f, f.floatValue());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m47730q0(Float f) {
        float interpolation = this.f30519R.getInterpolation(f.floatValue());
        if (interpolation <= 0.25f) {
            m47704Q(interpolation / 0.25f);
        } else {
            if (this.f30510I <= 0.25f) {
                m47704Q(1.0f);
            }
            m47705R((interpolation - 0.25f) / 0.75f);
        }
        if (interpolation > 0.8f && !CoreModule.f17545c.f19639e0.m169565z7()) {
            CoreModule.f17545c.f19639e0.m169535r9(true);
        }
        this.f30510I = interpolation;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m47731r0(Float f) {
        setTranslateX((this.f30532j.getWidth() / 2.0f) + f.floatValue());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m47732s0(Float f) {
        setTranslateY((this.f30532j.getHeight() / 2.0f) + f.floatValue());
    }

    public void setTranslateX(float f) {
        this.f30507F = true;
        this.f30505D = f;
        invalidate();
    }

    public void setTranslateY(float f) {
        this.f30507F = true;
        this.f30506E = f;
        invalidate();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m47733t0(View view) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            osi0.m165783g("已认证");
        } else if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            osi0.m165783g("正在审核中");
        } else {
            qp4.m175811q(m47698K());
        }
        zvf0.m220399u("e_successful_match_view_verification", "p_successful_match_view", vwb.m200311Y("receiver_user_id", this.f30509H.f56011id));
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m47734u0(Float f) {
        xdl0.m208358V(this.f30547y, f.intValue());
        xdl0.m208359W(this.f30547y, f.intValue());
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ boolean m47735v0(TextView textView, int i, KeyEvent keyEvent) {
        if (!rs4.f160804e.get().booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f30548z.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m81303a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f30502A.performClick();
        }
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m47736w0(View view) {
        if (this.f30516O) {
            m47702O(false, true);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m47737x0(boolean z, Float f) {
        m47707T(z, f.floatValue());
        m47713Z(z, Math.min(f.floatValue() / 0.3f, 1.0f));
        float f2 = z ? 0.0f : 1.0f;
        float f3 = z ? 1.0f : 0.0f;
        pa30.m167975e(this.f30527e, f2, f3, f.floatValue());
        pa30.m167975e(this.f30526d, f2, f3, f.floatValue());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C22306c m47738y0(Message message) {
        return CoreModule.f17545c.f19642f0.m32902ap(this.f30509H.f56011id);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m47739z0(boolean z, roj0 roj0Var) {
        lsi0.m151595y("消息已发送");
        m47702O(true, z);
    }

    public MatchSuccessNewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30505D = Float.MAX_VALUE;
        this.f30506E = Float.MAX_VALUE;
        this.f30507F = false;
        this.f30508G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f30510I = 0.0f;
        this.f30511J = t100.f167231F / 3;
        this.f30512K = t100.f167240O / 3;
        this.f30513L = new String[]{"[" + App.f15369e.getString(R$string.f18704lj) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18673kj) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18567h4) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18536g4) + Constants.AES_SUFFIX};
        this.f30514M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f30516O = false;
        this.f30517P = 0;
        this.f30519R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f30520S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f30521T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f30522U = false;
        m47708U();
    }

    public MatchSuccessNewLayout(Context context) {
        super(context);
        this.f30505D = Float.MAX_VALUE;
        this.f30506E = Float.MAX_VALUE;
        this.f30507F = false;
        this.f30508G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f30510I = 0.0f;
        this.f30511J = t100.f167231F / 3;
        this.f30512K = t100.f167240O / 3;
        this.f30513L = new String[]{"[" + App.f15369e.getString(R$string.f18704lj) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18673kj) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18567h4) + Constants.AES_SUFFIX, "[" + App.f15369e.getString(R$string.f18536g4) + Constants.AES_SUFFIX};
        this.f30514M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f30516O = false;
        this.f30517P = 0;
        this.f30519R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f30520S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f30521T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f30522U = false;
        m47708U();
    }
}
