package com.p000p1.mobile.putong.core.p001ui.match.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.opengl.GLSurfaceView;
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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p000p1.mobile.putong.core.p001ui.match.view.MatchSuccessNewLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.ChatHeatActionData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.IceBreakQuestion;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.HashSet;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.pdx;
import l.qib0;
import l.qp4;
import l.roj0;
import l.rs4;
import l.t100;
import l.tz00;
import l.upa;
import l.vdj;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import org.spongycastle.i18n.TextBundle;
import p003l.ccx;
import p003l.e30;
import p003l.ikf0;
import p003l.m250;
import p003l.pa30;
import p003l.pxe;
import p003l.su4;
import p003l.v9j;
import p003l.w9j;
import p014rx.C1099c;
import p028v.VDraweeView;
import p028v.VEditText;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MatchSuccessNewLayout extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public VText f393A;

    /* JADX INFO: renamed from: B */
    public VImage f394B;

    /* JADX INFO: renamed from: C */
    public Paint f395C;

    /* JADX INFO: renamed from: D */
    public float f396D;

    /* JADX INFO: renamed from: E */
    public float f397E;

    /* JADX INFO: renamed from: F */
    public boolean f398F;

    /* JADX INFO: renamed from: G */
    public final PorterDuffXfermode f399G;

    /* JADX INFO: renamed from: H */
    public User f400H;

    /* JADX INFO: renamed from: I */
    public float f401I;

    /* JADX INFO: renamed from: J */
    public int f402J;

    /* JADX INFO: renamed from: K */
    public int f403K;

    /* JADX INFO: renamed from: L */
    public final String[] f404L;

    /* JADX INFO: renamed from: M */
    public final String[] f405M;

    /* JADX INFO: renamed from: N */
    public PointF f406N;

    /* JADX INFO: renamed from: O */
    public boolean f407O;

    /* JADX INFO: renamed from: P */
    public int f408P;

    /* JADX INFO: renamed from: Q */
    public IceBreakQuestion f409Q;

    /* JADX INFO: renamed from: R */
    public final Interpolator f410R;

    /* JADX INFO: renamed from: S */
    public final Interpolator f411S;

    /* JADX INFO: renamed from: T */
    public final Interpolator f412T;

    /* JADX INFO: renamed from: U */
    public boolean f413U;

    /* JADX INFO: renamed from: a */
    public MatchSuccessNewLayout f414a;

    /* JADX INFO: renamed from: b */
    public View f415b;

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f416c;

    /* JADX INFO: renamed from: d */
    public AppCompatImageView f417d;

    /* JADX INFO: renamed from: e */
    public VText f418e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f419f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f420g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f421h;

    /* JADX INFO: renamed from: i */
    public VImage f422i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f423j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f424k;

    /* JADX INFO: renamed from: l */
    public VImage f425l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f426m;

    /* JADX INFO: renamed from: n */
    public SVGAnimationView f427n;

    /* JADX INFO: renamed from: o */
    public VText f428o;

    /* JADX INFO: renamed from: p */
    public VText f429p;

    /* JADX INFO: renamed from: q */
    public VLinear f430q;

    /* JADX INFO: renamed from: r */
    public VImage f431r;

    /* JADX INFO: renamed from: s */
    public VText f432s;

    /* JADX INFO: renamed from: t */
    public VLinear f433t;

    /* JADX INFO: renamed from: u */
    public VText f434u;

    /* JADX INFO: renamed from: v */
    public VText f435v;

    /* JADX INFO: renamed from: w */
    public VText f436w;

    /* JADX INFO: renamed from: x */
    public VText f437x;

    /* JADX INFO: renamed from: y */
    public VLinear f438y;

    /* JADX INFO: renamed from: z */
    public VEditText f439z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.match.view.MatchSuccessNewLayout$a */
    public class C0040a implements TextWatcher {
        public C0040a() {
        }

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
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z;
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            MatchSuccessNewLayout matchSuccessNewLayout = MatchSuccessNewLayout.this;
            if (zIsEmpty) {
                AppCompatTextView appCompatTextView = matchSuccessNewLayout.f393A;
                z = false;
                xdl0.M(appCompatTextView, false);
            } else {
                AppCompatTextView appCompatTextView2 = matchSuccessNewLayout.f393A;
                z = true;
                xdl0.M(appCompatTextView2, true);
            }
            MatchSuccessNewLayout.this.f393A.setEnabled(z);
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
        this.f396D = Float.MAX_VALUE;
        this.f397E = Float.MAX_VALUE;
        this.f398F = false;
        this.f399G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f401I = 0.0f;
        this.f402J = t100.F / 3;
        this.f403K = t100.O / 3;
        this.f404L = new String[]{"[" + App.e.getString(R.string.lj) + "]", "[" + App.e.getString(R.string.kj) + "]", "[" + App.e.getString(R.string.h4) + "]", "[" + App.e.getString(R.string.g4) + "]"};
        this.f405M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f407O = false;
        this.f408P = 0;
        this.f410R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f411S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f412T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f413U = false;
        m772U();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m718A(Conversation conversation) {
        Conversation conversationClone = conversation.clone();
        conversationClone.read = Boolean.TRUE;
        CoreModule.c.f0.mq(conversationClone);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m725H(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m734h() {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m735i() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m742p() {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m749w(Runnable runnable) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m751y() {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m753A0(Message message, boolean z, Throwable th) {
        if (su4.m7637f(th)) {
            su4.m7636e(m762K(), th, ChatHeatActionData.ExclusiveAction.CHECK);
            this.f413U = false;
        } else if (!TantanException.Client.TantanForbidden.isIllegalContent(th)) {
            ccx.m3248f(R.string.yh, this.f400H.fp().profileSmall());
            m766O(false, z);
        } else {
            CoreModule.c.f0.Of(((DbObject) message).id);
            osi0.f(R.string.J7);
            this.f413U = false;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m755C0(int i, View view) {
        m764M(this.f404L[i], this.f405M[i], i + 1);
    }

    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final void m754B0(String str, final boolean z) {
        this.f413U = true;
        final Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) this.f400H).id);
        if (NullChecker.a(conversationXe)) {
            e51.y(new Runnable() { // from class: l.wcx
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.U.a(new d30() { // from class: l.bdx
                        @Override // p003l.d30
                        public final void call() {
                            MatchSuccessNewLayout.m718A(conversation);
                        }
                    });
                }
            });
        }
        final Message message = new Message();
        message.value = str;
        message.messageType = MessageType.get(TextBundle.TEXT_ENTRY);
        m762K().duringCreated(CoreModule.c.f0.Fn(((DbObject) this.f400H).id, message, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.xcx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f8768a.m802y0((Message) obj);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.ycx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9059a.m803z0(z, (roj0) obj);
            }
        }, new e30() { // from class: l.zcx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9308a.m753A0(message, z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E0 */
    public void m757E0(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!qib0.Z.K(str)) {
            m754B0(str, z);
            return;
        }
        m762K().dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.scx
            @Override // java.lang.Runnable
            public final void run() {
                this.f7217a.m754B0(str, z);
            }
        }).z0();
        HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
        hashSet.add(((DbObject) CoreModule.c.e0.Pa(((DbObject) this.f400H).id)).id);
        MessagesAct.f1526r.put(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    public final void m758F0() {
        VText[] vTextArr = {this.f434u, this.f435v, this.f436w, this.f437x};
        zvf0.A("e_match_emoji", m762K().pageId(), new j760[]{j760.a("emoji_quantity", 4)});
        for (final int i = 0; i < 4; i++) {
            vTextArr[i].setText(this.f404L[i]);
            xdl0.E0(vTextArr[i], new View.OnClickListener() { // from class: l.ldx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5283a.m755C0(i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m759G0() {
        this.f439z.clearFocus();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m760H0(float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(f);
        this.f438y.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: J */
    public final void m761J(View view) {
        pdx.a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public MatchAct m762K() {
        return (MatchAct) getContext();
    }

    /* JADX INFO: renamed from: L */
    public final void m763L(final v9j<Boolean> v9jVar) {
        xdl0.E0(this.f394B, new View.OnClickListener() { // from class: l.mdx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5591a.m782e0(v9jVar, view);
            }
        });
        xdl0.E0(this.f393A, new View.OnClickListener() { // from class: l.ndx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5880a.m783f0(view);
            }
        });
        xdl0.E0(this.f414a, new View.OnClickListener() { // from class: l.odx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6109a.m784g0(view);
            }
        });
        xdl0.E0(this.f420g, new View.OnClickListener() { // from class: l.fcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3511a.m785h0(view);
            }
        });
        xdl0.E0(this.f423j, new View.OnClickListener() { // from class: l.gcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3846a.m786i0(view);
            }
        });
        xdl0.E0(this.f439z, new View.OnClickListener() { // from class: l.hcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4170a.m781d0(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m764M(String str, String str2, int i) {
        if (this.f413U) {
            return;
        }
        this.f413U = true;
        pxe.m6948c().m6959l(str2);
        tz00.j(m762K(), this.f400H, str, false, new Runnable() { // from class: l.qcx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m742p();
            }
        }, new Runnable() { // from class: l.rcx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m735i();
            }
        }, "");
        zvf0.u("e_match_emoji", m762K().pageId(), new j760[]{j760.a("select_emoji", Integer.valueOf(i))});
        m766O(true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m765N() {
        int i = pa30.m6816l().male_enter_time;
        e51.H(m762K(), new Runnable() { // from class: l.adx
            @Override // java.lang.Runnable
            public final void run() {
                this.f2144a.m787j0();
            }
        }, i / 4);
        e51.H(m762K(), new Runnable() { // from class: l.idx
            @Override // java.lang.Runnable
            public final void run() {
                this.f4395a.m788k0();
            }
        }, i / 2);
        this.f415b.setAlpha(0.5f);
        final int i2 = t100.o;
        final View[] viewArr = {this.f428o, this.f429p, this.f430q, this.f433t, this.f438y, this.f394B};
        for (int i3 = 0; i3 < 6; i3++) {
            GLSurfaceView gLSurfaceView = viewArr[i3];
            gLSurfaceView.setTranslationY(i2);
            gLSurfaceView.setAlpha(0.0f);
        }
        final int iD = (t100.c().widthPixels / 2) + t100.d(47.5f);
        this.f420g.setTranslationX(-iD);
        this.f423j.setTranslationX(iD);
        final PathInterpolator pathInterpolator = new PathInterpolator(0.4f, 1.33f, 0.78f, 1.01f);
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        pa30.m6815k(i, new e30() { // from class: l.jdx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4621a.m789l0(accelerateDecelerateInterpolator, viewArr, i2, pathInterpolator, iD, (Float) obj);
            }
        }, new Runnable() { // from class: l.kdx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m751y();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m766O(boolean z, boolean z2) {
        final boolean z3 = true;
        if (!z || !TextUtils.equals(m762K().f360e, "tmp_from_home_swipe")) {
            if (z2) {
                m762K().hideInput();
            }
            m762K().f364i = true;
            m762K().finish();
            return;
        }
        Runnable runnable = new Runnable() { // from class: l.kcx
            @Override // java.lang.Runnable
            public final void run() {
                this.f4899a.m791n0();
            }
        };
        if (!z2) {
            pa30.m6815k(pa30.m6816l().male_keyboard_show_time, new e30() { // from class: l.lcx
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5260a.m792o0(z3, (Float) obj);
                }
            }, runnable);
            return;
        }
        m762K().hideInput();
        final boolean z4 = false;
        pa30.m6815k(pa30.m6816l().male_keyboard_show_head_time, new e30() { // from class: l.mcx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5585a.m793p0(z4, (Float) obj);
            }
        }, runnable);
    }

    /* JADX INFO: renamed from: P */
    public void m767P(final Runnable runnable) {
        xdl0.M(this.f420g, false);
        xdl0.M(this.f425l, false);
        xdl0.M(this.f426m, false);
        pa30.m6815k(pa30.m6816l().male_exit_time, new e30() { // from class: l.cdx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2624a.m794q0((Float) obj);
            }
        }, new Runnable() { // from class: l.ddx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m725H(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m768Q(float f) {
        pa30.m6807c(t100.F * 3, this.f402J, f, new e30() { // from class: l.gdx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3850a.m795r0((Float) obj);
            }
        });
        pa30.m6807c(t100.O * 3, this.f403K, f, new e30() { // from class: l.hdx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4174a.m796s0((Float) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m769R(float f) {
        float width = (this.f423j.getWidth() / 2.0f) + this.f402J;
        float width2 = (this.f423j.getWidth() / 2.0f) * 0.1f;
        int i = t100.c;
        pa30.m6807c(width, width2 + i, f, new e30() { // from class: l.edx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3257a.setTranslateX(((Float) obj).floatValue());
            }
        });
        pa30.m6807c((this.f423j.getHeight() / 2.0f) + this.f403K, ((this.f423j.getHeight() / 2.0f) * 0.1f) + i, f, new e30() { // from class: l.fdx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3571a.setTranslateY(((Float) obj).floatValue());
            }
        });
        pa30.m6814j(this.f414a, 0.0f, (this.f414a.getHeight() - this.f406N.y) - t100.d(60.0f), f);
        pa30.m6811g(this.f423j, 1.0f, 0.1f, f);
        pa30.m6812h(this.f423j, 1.0f, 0.1f, f);
        double d = f;
        MatchSuccessNewLayout matchSuccessNewLayout = this.f414a;
        if (d >= 0.9d) {
            pa30.m6809e(matchSuccessNewLayout, 1.0f, 0.0f, (f * 10.0f) - 9.0f);
        } else {
            matchSuccessNewLayout.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: S */
    public final PointF m770S(float f, float f2) {
        return new PointF(f / 2.0f, (((f2 / 2.0f) - (((RelativeLayout.LayoutParams) this.f428o.getLayoutParams()).height / 2.0f)) - ((RelativeLayout.LayoutParams) this.f419f.getLayoutParams()).bottomMargin) - (this.f423j.getHeight() / 2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final void m771T(boolean z, float f) {
        float interpolation = this.f412T.getInterpolation(f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f423j.getLayoutParams();
        float f2 = z ? 0.0f : layoutParams.leftMargin;
        float f3 = z ? layoutParams.leftMargin : 0.0f;
        float fD = z ? 0.0f : t100.d(40.0f);
        float fD2 = z ? t100.d(40.0f) : 0.0f;
        float f4 = z ? -10.0f : 10.0f;
        float f5 = z ? 10.0f : -10.0f;
        pa30.m6813i(this.f420g, f2, f3, interpolation);
        pa30.m6814j(this.f420g, fD, fD2, interpolation);
        pa30.m6810f(this.f420g, f4, f5, interpolation);
        pa30.m6813i(this.f423j, -f2, -f3, interpolation);
        View[] viewArr = {this.f428o, this.f429p, this.f430q};
        float f6 = z ? 1.0f : 0.0f;
        float f7 = z ? 0.0f : 1.0f;
        for (int i = 0; i < 3; i++) {
            pa30.m6809e(viewArr[i], f6, f7, Math.min(f / 0.4f, 1.0f));
        }
        pa30.m6809e(this.f420g, f6, f7, f);
    }

    /* JADX INFO: renamed from: U */
    public final void m772U() {
        Paint paint = new Paint(1);
        this.f395C = paint;
        paint.setDither(true);
        this.f395C.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: V */
    public final void m773V(User user) {
        String str;
        long jO = mqi0.o() - user.getLastActiveTimeMillis();
        if (jO > 172800000) {
            xdl0.M(this.f426m, false);
            return;
        }
        if (jO < 300000) {
            str = "当前在线";
        } else if (jO < 3600000) {
            str = String.format("%s分钟前活跃", Long.valueOf(jO / 60000));
        } else if (jO < 86400000) {
            str = String.format("%s小时前活跃", Long.valueOf(jO / 3600000));
        } else {
            str = jO < 172800000 ? "昨天活跃" : null;
        }
        this.f426m.setText(str);
        this.f426m.setCompoundDrawablesWithIntrinsicBounds(App.e.getResources().getDrawable(jO < 300000 ? x2c0.Xd : x2c0.Yd), (Drawable) null, (Drawable) null, (Drawable) null);
        xdl0.M(this.f426m, true);
    }

    /* JADX INFO: renamed from: W */
    public final void m774W(String str) {
        int i = m762K().f363h;
        if (i != 12 && i != 11 && (i != 13 || !vdj.c())) {
            xdl0.M(this.f422i, false);
            xdl0.M(this.f425l, false);
            return;
        }
        if (i == 12) {
            xdl0.M(this.f422i, true);
            xdl0.M(this.f425l, false);
            this.f429p.setText("你超级喜欢了 " + str);
            return;
        }
        if (i == 11) {
            xdl0.M(this.f425l, true);
            xdl0.M(this.f422i, false);
            this.f429p.setText(str + " 超级喜欢了你");
            return;
        }
        xdl0.M(this.f422i, true);
        xdl0.M(this.f425l, true);
        this.f429p.setText("你和 " + str + " 超级喜欢了对方");
    }

    /* JADX INFO: renamed from: X */
    public final void m775X() {
        User user = this.f400H;
        boolean z = false;
        if (user == null || !user.isPicVerificationVerified()) {
            xdl0.M(this.f430q, false);
            return;
        }
        if (upa.z()) {
            this.f431r.setImageResource(x2c0.Zd);
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (verificationCenterK4 == null) {
            xdl0.M(this.f430q, true);
            return;
        }
        StudentVerificationStatus studentVerificationStatus = verificationCenterK4.picVerificationInfo.status;
        if (!TEnum.equals(studentVerificationStatus, "verified") && !TEnum.equals(studentVerificationStatus, "pending")) {
            z = true;
        }
        xdl0.M(this.f430q, z);
        if (z) {
            zvf0.A("e_successful_match_view_verification", m762K().pageId(), new j760[]{j760.a("receiver_user_id", ((DbObject) this.f400H).id)});
        }
        xdl0.E0(this.f430q, new View.OnClickListener() { // from class: l.jcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4618a.m797t0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m776Y(String str, v9j<Boolean> v9jVar) {
        User userPa = CoreModule.c.e0.Pa(str);
        this.f400H = userPa;
        if (userPa == null) {
            return;
        }
        this.f413U = false;
        this.f409Q = null;
        CoreModule.c.e0.r9(false);
        m758F0();
        m778a0();
        m763L(v9jVar);
        m760H0(t100.j);
        qib0.G.L0(this.f421h, CoreModule.c.e0.na().fp().profileBig().formatted());
        qib0.G.L0(this.f424k, this.f400H.fp().profileBig().formatted());
        xdl0.X(this.f417d, xdl0.F0() + t100.c);
        xdl0.X(this.f418e, xdl0.F0() + t100.G);
        this.f417d.setAlpha(0.0f);
        this.f418e.setAlpha(0.0f);
        this.f418e.getPaint().setFakeBoldText(true);
        this.f428o.getPaint().setFakeBoldText(true);
        this.f429p.getPaint().setFakeBoldText(true);
        this.f393A.getPaint().setFakeBoldText(true);
        this.f439z.getPaint().setFakeBoldText(true);
        this.f432s.getPaint().setFakeBoldText(true);
        String strConcat = this.f400H.name;
        if (upa.r1() && m762K().f363h == 44) {
            this.f428o.setText("重逢配对");
            this.f429p.setText("再次重逢你们依然互相喜欢，去聊聊吧");
        } else {
            if (strConcat.length() > 6) {
                strConcat = strConcat.substring(0, 6).concat("...");
            }
            this.f429p.setText("你和 " + strConcat + " 相互喜欢了对方");
        }
        StringBuilder sb = new StringBuilder("和");
        sb.append(this.f400H.isFemale() ? "她" : "他");
        sb.append("打个招呼吧");
        CharSequence string = sb.toString();
        this.f439z.setHint(string);
        this.f418e.setText(string);
        m775X();
        m774W(strConcat);
        if (upa.O()) {
            m773V(this.f400H);
        }
        m765N();
    }

    /* JADX INFO: renamed from: Z */
    public final void m777Z(boolean z, float f) {
        float interpolation = this.f411S.getInterpolation(f);
        pa30.m6807c(z ? t100.q : 0.0f, z ? 0.0f : t100.q, interpolation, new e30() { // from class: l.tcx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7454a.m798u0((Float) obj);
            }
        });
        pa30.m6807c(z ? t100.i : 0.0f, z ? 0.0f : t100.i, interpolation, new e30() { // from class: l.ucx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7967a.m760H0(((Float) obj).floatValue());
            }
        });
        int iIntValue = this.f408P;
        if (iIntValue <= 0) {
            iIntValue = ((Integer) Act.savedKeyboardHeight.get()).intValue();
        }
        int height = iIntValue - this.f394B.getHeight();
        pa30.m6814j(this.f438y, z ? 0 : -height, z ? -height : 0, interpolation);
        pa30.m6809e(this.f433t, z ? 1.0f : 0.0f, z ? 0.0f : 1.0f, Math.min(interpolation / 0.3f, 1.0f));
        pa30.m6814j(this.f433t, z ? 0 : -t100.B, z ? -t100.B : 0, interpolation);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m778a0() {
        this.f439z.addTextChangedListener(new C0040a());
        this.f439z.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ecx
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f3254a.m799v0(textView, i, keyEvent);
            }
        });
        xdl0.E0(this.f417d, new View.OnClickListener() { // from class: l.pcx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6368a.m800w0(view);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m779b0(boolean z, int i) {
        this.f407O = z;
        this.f408P = i;
        if (this.f413U) {
            return;
        }
        if (z) {
            this.f416c.stopAnimation(false);
        } else {
            m762K().hideInput();
            this.f416c.startAnimation();
        }
        m780c0(z, new Runnable() { // from class: l.icx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m734h();
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public void m780c0(final boolean z, final Runnable runnable) {
        pa30.m6815k(pa30.m6816l().male_keyboard_show_time, new e30() { // from class: l.ncx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5876a.m801x0(z, (Float) obj);
            }
        }, new Runnable() { // from class: l.ocx
            @Override // java.lang.Runnable
            public final void run() {
                MatchSuccessNewLayout.m749w(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m781d0(View view) {
        zvf0.r("e_matched_text_box", m762K().pageId());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        if (this.f406N == null) {
            this.f406N = m770S(width, height);
        }
        if (this.f398F) {
            PointF pointF = this.f406N;
            canvas.translate(pointF.x, pointF.y);
            canvas.rotate(10.0f);
            float fM5152i = (ikf0.m5152i(((int) this.f397E) * 2) * 0.0183f) + 3.412f;
            float f = this.f396D;
            float f2 = this.f397E;
            canvas.drawRoundRect(new RectF(-f, -f2, f, f2), ikf0.m5146c(fM5152i), ikf0.m5146c(fM5152i), this.f395C);
            this.f395C.setXfermode(this.f399G);
            canvas.rotate(-10.0f);
            PointF pointF2 = this.f406N;
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, this.f395C, 31);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
        this.f395C.setXfermode(null);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m782e0(v9j v9jVar, View view) {
        if (!NullChecker.a(v9jVar) || ((Boolean) v9jVar.call()).booleanValue()) {
            m766O(false, false);
            zvf0.r("e_match_continue", m762K().pageId());
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m783f0(View view) {
        if (this.f413U) {
            return;
        }
        m757E0(this.f439z.getText().toString().trim(), this.f407O);
        zvf0.r("e_matched_send_message", m762K().pageId());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m784g0(View view) {
        m762K().hideInput();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m785h0(View view) {
        zvf0.r("e_matched_my_profile", m762K().pageId());
        if (this.f407O) {
            return;
        }
        m762K().startActivity(ProfileAct.n2(m762K(), CoreModule.H().userId(), "from_match", false));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m786i0(View view) {
        zvf0.u("e_matched_other_profile", m762K().pageId(), new j760[]{j760.a("moments_user_id", ((DbObject) this.f400H).id)});
        if (this.f407O) {
            m762K().hideInput();
        } else {
            m762K().startActivity(ProfileAct.n2(m762K(), ((DbObject) this.f400H).id, "from_match", false));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m787j0() {
        SVGALoader.with(getContext()).from(upa.z() ? "https://auto.tancdn.com/v1/raw/9b2b634e-49ac-49fd-b8bf-76bf3bc8514e14.svga" : "core_male_match_success_heart_bg.svga").isCacheable(true).autoPlay(true).repeatCount(-1).into(this.f416c);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m788k0() {
        SVGALoader.with(getContext()).from(upa.z() ? "https://auto.tancdn.com/v1/raw/1b58e151-bc14-48d0-bde7-0155cf0b077a14.svga" : "core_male_match_success_flow_bg.svga").isCacheable(true).autoPlay(true).repeatCount(1).into(this.f427n);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m789l0(Interpolator interpolator, View[] viewArr, int i, Interpolator interpolator2, int i2, Float f) {
        float interpolation = interpolator.getInterpolation(f.floatValue());
        pa30.m6809e(this.f415b, 0.5f, 1.0f, Math.min(1.0f, interpolation / 0.2f));
        if (interpolation >= 0.2f) {
            float f2 = ((interpolation * 5.0f) - 1.0f) / 4.0f;
            for (View view : viewArr) {
                float f3 = f2 / 0.6f;
                pa30.m6814j(view, i, 0.0f, Math.min(1.0f, f3));
                pa30.m6809e(view, 0.0f, 1.0f, Math.min(1.0f, f3));
            }
            float interpolation2 = interpolator2.getInterpolation(f2);
            pa30.m6813i(this.f423j, i2, 0.0f, interpolation2);
            pa30.m6813i(this.f420g, -i2, 0.0f, interpolation2);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m790m0() {
        xdl0.M(this.f414a, false);
        m762K().f364i = true;
        m762K().finish();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m791n0() {
        m767P(new Runnable() { // from class: l.vcx
            @Override // java.lang.Runnable
            public final void run() {
                this.f8281a.m790m0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m792o0(boolean z, Float f) {
        m771T(z, f.floatValue());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m761J(this);
        boolean z = upa.z();
        VImage vImage = this.f394B;
        if (!z) {
            vImage.setImageResource(x2c0.Wd);
            return;
        }
        vImage.setImageResource(x2c0.ih);
        this.f422i.setImageResource(x2c0.kh);
        this.f425l.setImageResource(x2c0.kh);
        this.f417d.setImageResource(x2c0.jh);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m793p0(boolean z, Float f) {
        m777Z(z, Math.min(f.floatValue() / 0.3f, 1.0f));
        pa30.m6809e(this.f418e, 1.0f, 0.0f, f.floatValue());
        pa30.m6809e(this.f417d, 1.0f, 0.0f, f.floatValue());
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m794q0(Float f) {
        float interpolation = this.f410R.getInterpolation(f.floatValue());
        if (interpolation <= 0.25f) {
            m768Q(interpolation / 0.25f);
        } else {
            if (this.f401I <= 0.25f) {
                m768Q(1.0f);
            }
            m769R((interpolation - 0.25f) / 0.75f);
        }
        if (interpolation > 0.8f && !CoreModule.c.e0.z7()) {
            CoreModule.c.e0.r9(true);
        }
        this.f401I = interpolation;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m795r0(Float f) {
        setTranslateX((this.f423j.getWidth() / 2.0f) + f.floatValue());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m796s0(Float f) {
        setTranslateY((this.f423j.getHeight() / 2.0f) + f.floatValue());
    }

    public void setTranslateX(float f) {
        this.f398F = true;
        this.f396D = f;
        invalidate();
    }

    public void setTranslateY(float f) {
        this.f398F = true;
        this.f397E = f;
        invalidate();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m797t0(View view) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            osi0.g("已认证");
        } else if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            osi0.g("正在审核中");
        } else {
            qp4.q(m762K());
        }
        zvf0.u("e_successful_match_view_verification", "p_successful_match_view", new j760[]{vwb.Y("receiver_user_id", ((DbObject) this.f400H).id)});
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m798u0(Float f) {
        xdl0.V(this.f438y, f.intValue());
        xdl0.W(this.f438y, f.intValue());
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ boolean m799v0(TextView textView, int i, KeyEvent keyEvent) {
        if (!((Boolean) rs4.e.get()).booleanValue()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f439z.getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            this.f393A.performClick();
        }
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m800w0(View view) {
        if (this.f407O) {
            m766O(false, true);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m801x0(boolean z, Float f) {
        m771T(z, f.floatValue());
        m777Z(z, Math.min(f.floatValue() / 0.3f, 1.0f));
        float f2 = z ? 0.0f : 1.0f;
        float f3 = z ? 1.0f : 0.0f;
        pa30.m6809e(this.f418e, f2, f3, f.floatValue());
        pa30.m6809e(this.f417d, f2, f3, f.floatValue());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C1099c m802y0(Message message) {
        return CoreModule.c.f0.ap(((DbObject) this.f400H).id);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m803z0(boolean z, roj0 roj0Var) {
        lsi0.y("消息已发送");
        m766O(true, z);
    }

    public MatchSuccessNewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f396D = Float.MAX_VALUE;
        this.f397E = Float.MAX_VALUE;
        this.f398F = false;
        this.f399G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f401I = 0.0f;
        this.f402J = t100.F / 3;
        this.f403K = t100.O / 3;
        this.f404L = new String[]{"[" + App.e.getString(R.string.lj) + "]", "[" + App.e.getString(R.string.kj) + "]", "[" + App.e.getString(R.string.h4) + "]", "[" + App.e.getString(R.string.g4) + "]"};
        this.f405M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f407O = false;
        this.f408P = 0;
        this.f410R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f411S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f412T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f413U = false;
        m772U();
    }

    public MatchSuccessNewLayout(Context context) {
        super(context);
        this.f396D = Float.MAX_VALUE;
        this.f397E = Float.MAX_VALUE;
        this.f398F = false;
        this.f399G = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f401I = 0.0f;
        this.f402J = t100.F / 3;
        this.f403K = t100.O / 3;
        this.f404L = new String[]{"[" + App.e.getString(R.string.lj) + "]", "[" + App.e.getString(R.string.kj) + "]", "[" + App.e.getString(R.string.h4) + "]", "[" + App.e.getString(R.string.g4) + "]"};
        this.f405M = new String[]{"NEW_EMOJI_HAHE", "NEW_EMOJI_BEER", "EMOJI_70", "EMOJI_63"};
        this.f407O = false;
        this.f408P = 0;
        this.f410R = new PathInterpolator(0.17f, 0.14f, 0.3f, 1.0f);
        this.f411S = new PathInterpolator(0.3f, 0.3f, 0.0f, 1.0f);
        this.f412T = new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
        this.f413U = false;
        m772U();
    }
}
