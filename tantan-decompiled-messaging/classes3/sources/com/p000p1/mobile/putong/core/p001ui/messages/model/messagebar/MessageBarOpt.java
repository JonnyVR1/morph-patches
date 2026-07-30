package com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.Keyboard;
import com.p000p1.mobile.putong.core.p001ui.messages.KeyboardFrameWithShadowOutside;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.aichat.AIChatView;
import com.p000p1.mobile.putong.core.p001ui.messages.emoji.VEditTextEmojiCompat;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p000p1.mobile.putong.core.p001ui.messages.media.widget.RecorderView;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarOpt;
import com.p000p1.mobile.putong.core.p001ui.messages.model.record.view.RecordAnimLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p1.mobile.putong.core.ui.messages.view.MessageBarRootLayout;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputEditRootLayout;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.a1c0;
import l.bt0;
import l.c3c0;
import l.cry;
import l.e51;
import l.j760;
import l.jdm;
import l.l6c0;
import l.o6j0;
import l.o7r;
import l.t100;
import l.ura;
import l.v0c0;
import l.vwb;
import l.xdl0;
import l.y19;
import l.y4c0;
import l.zvf0;
import p003l.apy;
import p003l.e30;
import p003l.gpy;
import p003l.soe;
import p003l.uoy;
import p003l.xoy;
import p028v.VButton;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageBarOpt extends MessageBar {

    /* JADX INFO: renamed from: G0 */
    public static final Property<View, Integer> f1823G0;

    /* JADX INFO: renamed from: H0 */
    public static final Property<View, Integer> f1824H0;

    /* JADX INFO: renamed from: I0 */
    public static final Property<View, Integer> f1825I0;

    /* JADX INFO: renamed from: J0 */
    public static final Property<View, Integer> f1826J0;

    /* JADX INFO: renamed from: A */
    public VText f1827A;

    /* JADX INFO: renamed from: B */
    public RecorderView f1828B;

    /* JADX INFO: renamed from: C */
    public TextView f1829C;

    /* JADX INFO: renamed from: D */
    public VText f1830D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f1831E;

    /* JADX INFO: renamed from: E0 */
    public LinearLayout f1832E0;

    /* JADX INFO: renamed from: F */
    public RecordAnimLayout f1833F;

    /* JADX INFO: renamed from: F0 */
    public boolean f1834F0;

    /* JADX INFO: renamed from: G */
    public TextView f1835G;

    /* JADX INFO: renamed from: H */
    public TextView f1836H;

    /* JADX INFO: renamed from: I */
    public VText f1837I;

    /* JADX INFO: renamed from: J */
    public ImageView f1838J;

    /* JADX INFO: renamed from: K */
    public VButton f1839K;

    /* JADX INFO: renamed from: L */
    public KeyboardFrameWithShadowOutside f1840L;

    /* JADX INFO: renamed from: M */
    public ViewStub f1841M;

    /* JADX INFO: renamed from: N */
    public AIChatView f1842N;

    /* JADX INFO: renamed from: O */
    public String f1843O;

    /* JADX INFO: renamed from: P */
    public String f1844P;

    /* JADX INFO: renamed from: Q */
    public e30 f1845Q;

    /* JADX INFO: renamed from: R */
    public boolean f1846R;

    /* JADX INFO: renamed from: S */
    public boolean f1847S;

    /* JADX INFO: renamed from: T */
    public boolean f1848T;

    /* JADX INFO: renamed from: U */
    public AccelerateInterpolator f1849U;

    /* JADX INFO: renamed from: V */
    public boolean f1850V;

    /* JADX INFO: renamed from: W */
    public gpy f1851W;

    /* JADX INFO: renamed from: b */
    public MessageBarOpt f1852b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1853c;

    /* JADX INFO: renamed from: d */
    public MessageSurfaceAnimContainer f1854d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f1855e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f1856f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f1857g;

    /* JADX INFO: renamed from: h */
    public TextView f1858h;

    /* JADX INFO: renamed from: i */
    public FilterScrollMoreViewPager f1859i;

    /* JADX INFO: renamed from: j */
    public TextView f1860j;

    /* JADX INFO: renamed from: k */
    public View f1861k;

    /* JADX INFO: renamed from: k0 */
    public List<uoy> f1862k0;

    /* JADX INFO: renamed from: l */
    public ImageView f1863l;

    /* JADX INFO: renamed from: m */
    public ImageView f1864m;

    /* JADX INFO: renamed from: n */
    public MessageBarRootLayout f1865n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f1866o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f1867p;

    /* JADX INFO: renamed from: p0 */
    public List<MessageBarActionItemView> f1868p0;

    /* JADX INFO: renamed from: q */
    public FrameLayout f1869q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f1870r;

    /* JADX INFO: renamed from: s */
    public VText f1871s;

    /* JADX INFO: renamed from: t */
    public View f1872t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f1873u;

    /* JADX INFO: renamed from: v */
    public MessageInputEditRootLayout f1874v;

    /* JADX INFO: renamed from: w */
    public VLinear f1875w;

    /* JADX INFO: renamed from: x */
    public VEditTextEmojiCompat f1876x;

    /* JADX INFO: renamed from: y */
    public SVGAnimationView f1877y;

    /* JADX INFO: renamed from: z */
    public VImage f1878z;

    public enum MessageBarState {
        DEFAULT("默认"),
        DISMISSED("解除配对"),
        FAKE_LOCK("fake锁资料"),
        AVATAR_AUDIT("资料审核中");

        private String des;

        MessageBarState(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$a */
    public class C0130a extends Property<View, Integer> {
        public C0130a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = num.intValue();
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$b */
    public class C0131b extends Property<View, Integer> {
        public C0131b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = num.intValue();
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$c */
    public class C0132c extends Property<View, Integer> {
        public C0132c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return (Integer) view.getTag();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            view.setTag(num);
            jdm.b(view, num.intValue(), t100.i, -1, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$d */
    public class ViewOnLongClickListenerC0133d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gpy f1879a;

        public ViewOnLongClickListenerC0133d(gpy gpyVar) {
            this.f1879a = gpyVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            uoy uoyVar = (uoy) view.getTag();
            if (NullChecker.a(this.f1879a) && NullChecker.a(uoyVar)) {
                this.f1879a.mo4658b(uoyVar, view, true);
            }
            return !uoyVar.m8187e(2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$e */
    public class C0134e implements TextWatcher {
        public C0134e() {
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
            if (!MessageBarOpt.this.m2495W()) {
                boolean zIsEmpty = TextUtils.isEmpty(editable.toString().trim());
                MessageBarOpt messageBarOpt = MessageBarOpt.this;
                if (zIsEmpty) {
                    messageBarOpt.f1827A.setTextColor(messageBarOpt.getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.B));
                    return;
                } else {
                    messageBarOpt.f1827A.setTextColor(messageBarOpt.getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.C));
                    return;
                }
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(editable.toString().trim());
            MessageBarOpt messageBarOpt2 = MessageBarOpt.this;
            if (zIsEmpty2) {
                messageBarOpt2.f1827A.setTextColor(messageBarOpt2.getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.B));
                xdl0.A0(MessageBarOpt.this.getContext(), MessageBarOpt.this.f1827A, c3c0.J1);
            } else {
                messageBarOpt2.f1827A.setTextColor(messageBarOpt2.getResources().getColor(a1c0.A));
                xdl0.A0(MessageBarOpt.this.getContext(), MessageBarOpt.this.f1827A, ura.e().d().I4() ? c3c0.M1 : c3c0.L1);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$f */
    public class C0135f extends bt0.j {
        public C0135f() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) MessageBarOpt.this.f1874v.getLayoutParams();
            marginLayoutParams.leftMargin = t100.d(59.0f);
            MessageBarOpt.this.f1874v.setLayoutParams(marginLayoutParams);
            MessageBarOpt.this.f1870r.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$g */
    public class C0136g extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f1883a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ double f1884b;

        public C0136g(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
            this.f1883a = warmingUpLevel;
            this.f1884b = d;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.M(MessageBarOpt.this.f1870r, true);
            jdm.b(MessageBarOpt.this.f1870r, MessageWarmingUpHelper.m2301l(this.f1883a), t100.i, -1, 0, 0, 0);
            xdl0.M(MessageBarOpt.this.f1871s, true);
            xdl0.M(MessageBarOpt.this.f1872t, false);
            MessageBarOpt.this.f1871s.setText(MessageWarmingUpHelper.m2291b(this.f1884b) + "°C");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$h */
    public class C0137h extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f1886a;

        public C0137h(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f1886a = warmingUpLevel;
        }

        public void onAnimationStart(Animator animator) {
            MessageBarOpt.this.f1872t.setBackgroundResource(MessageWarmingUpHelper.m2300k(this.f1886a));
            xdl0.M0(MessageBarOpt.this.f1872t, true);
            o6j0.h("e_heat_entrance", ((MessagesAct) MessageBarOpt.this.getContext()).pageId(), new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$i */
    public class C0138i extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f1888a;

        public C0138i(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f1888a = warmingUpLevel;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f1872t.setBackgroundResource(MessageWarmingUpHelper.m2300k(this.f1888a));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$j */
    public class C0139j extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f1890a;

        public C0139j(double d) {
            this.f1890a = d;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f1871s.setText(MessageWarmingUpHelper.m2291b(this.f1890a) + "°C");
            xdl0.M(MessageBarOpt.this.f1871s, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$k */
    public class C0140k extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f1892a;

        public C0140k(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f1892a = warmingUpLevel;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f1872t.setBackgroundResource(MessageWarmingUpHelper.m2300k(this.f1892a));
            MessageBarOpt.this.m2481D0(this.f1892a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$l */
    public class C0141l extends bt0.j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f1894a;

        public C0141l(double d) {
            this.f1894a = d;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f1871s.setText(MessageWarmingUpHelper.m2291b(this.f1894a) + "°C");
            xdl0.M(MessageBarOpt.this.f1871s, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$m */
    public class C0142m extends Property<View, Integer> {
        public C0142m(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = num.intValue();
            view.setLayoutParams(marginLayoutParams);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f1823G0 = new C0142m(cls, "marginLeft");
        f1824H0 = new C0130a(cls, "marginTop");
        f1825I0 = new C0131b(cls, "marginBottom");
        f1826J0 = new C0132c(cls, "backgroundColor");
    }

    public MessageBarOpt(Context context) {
        super(context);
        this.f1843O = "";
        this.f1844P = "";
        this.f1846R = false;
        this.f1847S = false;
        this.f1848T = false;
        this.f1849U = new AccelerateInterpolator();
        this.f1850V = false;
        this.f1834F0 = false;
    }

    private String getSafeSourceFrom() {
        if (!(getContext() instanceof MessagesAct)) {
            return "";
        }
        Conversation conversationM4255j3 = ((MessagesAct) getContext()).f1531f.m4255j3();
        if (!NullChecker.a(conversationM4255j3)) {
            return "";
        }
        if (conversationM4255j3.isFakeHeartbeatConv()) {
            return "love_signal";
        }
        return conversationM4255j3.isFakeQuickChatConv() ? "quickchat" : "";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m2472u(gpy gpyVar, View view) {
        uoy uoyVar = (uoy) view.getTag();
        if (NullChecker.a(gpyVar) && NullChecker.a(uoyVar)) {
            gpyVar.mo4658b(uoyVar, view, false);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m2478A0() {
        if (m2495W()) {
            m2479B0(MessageBarActionItemType.EMOJI, false);
        } else {
            m2479B0(MessageBarActionItemType.EMOJI, true);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m2479B0(MessageBarActionItemType messageBarActionItemType, boolean z) {
        int size = this.f1862k0.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = this.f1862k0.get(i);
            if (uoyVar.m8186d() == messageBarActionItemType) {
                uoyVar.m8192j(z);
                uoyVar.m8193k(z);
            }
        }
        mo1920f();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m2480C0() {
        if (!((Boolean) CoreModule.c.f0.g1.get()).booleanValue() || ((Boolean) CoreModule.c.e0.s2.get()).booleanValue()) {
            Object context = getContext();
            if (context instanceof MessagesAct) {
                MessagesAct messagesAct = (MessagesAct) context;
                messagesAct.mo2066l().m4309t7().m7903V1();
                o6j0.h("e_heat_entrance_bubble", messagesAct.pageId(), new o6j0.a[0]);
            }
            CoreModule.c.f0.g1.put(Boolean.TRUE);
            TextView textView = new TextView(getContext());
            textView.setText("用温度记录你们的聊天时光。随着温\n度的升高，可解锁更多亲密功能");
            textView.setPadding(t100.d(16.0f), t100.d(10.0f), t100.d(16.0f), t100.d(10.0f));
            textView.setTextSize(13.0f);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(-1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            xdl0.E0(textView, new View.OnClickListener() { // from class: l.uqy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8065a.m2500b0(view);
                }
            });
            a aVar = new a(getContext());
            a aVarY = aVar.s(textView).p(75).e(true).y(true);
            int i = t100.i;
            aVarY.z(i).b(3000L).x(-i).o(a.O, t100.g).q(a.Q | a.O);
            aVar.k(new int[]{getResources().getColor(ura.e().d().I4() ? a1c0.j : v0c0.h)});
            this.f1843O = d.l().t(aVar, this.f1870r);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public final void m2481D0(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (d.l().x(this.f1844P)) {
            return;
        }
        final Context context = getContext();
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            messagesAct.mo2066l().m4309t7().m7903V1();
            o6j0.h("e_heat_increase_remind", messagesAct.pageId(), new o6j0.a[]{o6j0.a.h("heat_function_name", warmingUpLevel.key)});
            View viewInflate = o7r.a(getContext()).inflate(l6c0.I2, (ViewGroup) null);
            ((ImageView) viewInflate.findViewById(y4c0.k1)).setImageResource(MessageWarmingUpHelper.m2309t(warmingUpLevel));
            TextView textView = (TextView) viewInflate.findViewById(y4c0.Q4);
            textView.getPaint().setFakeBoldText(true);
            textView.setText(MessageWarmingUpHelper.m2310u(warmingUpLevel));
            ((TextView) viewInflate.findViewById(y4c0.Z)).setText(MessageWarmingUpHelper.m2308s(warmingUpLevel));
            TextView textView2 = (TextView) viewInflate.findViewById(y4c0.B);
            textView2.getPaint().setFakeBoldText(true);
            textView2.setTextColor(MessageWarmingUpHelper.m2301l(warmingUpLevel));
            xdl0.E0(textView2, new View.OnClickListener() { // from class: l.ary
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2265a.m2501c0(context, warmingUpLevel, view);
                }
            });
            a aVar = new a(getContext());
            a aVarB = aVar.s(viewInflate).p(75).e(true).y(true).b(5000L);
            int i = t100.i;
            aVarB.z(i).q(a.Q | a.O).x(-i).o(a.O, i).w(t100.m).k(new int[]{MessageWarmingUpHelper.m2299j(warmingUpLevel)});
            this.f1844P = d.l().t(aVar, this.f1870r);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m2482E0() {
        if (this.f1846R) {
            return;
        }
        this.f1846R = true;
        o6j0.h("e_im_fake_to_good", "p_chat_view", new o6j0.a[]{o6j0.a.h("source_from", getSafeSourceFrom())});
    }

    /* JADX INFO: renamed from: F0 */
    public final void m2483F0(String str) {
        if (NullChecker.a(this.f1845Q)) {
            this.f1845Q.call(str);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m2484L(View view) {
        cry.a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public ViewGroup m2485M() {
        return this.f1832E0;
    }

    /* JADX INFO: renamed from: N */
    public void m2486N() {
        Iterator<uoy> it = this.f1862k0.iterator();
        while (it.hasNext()) {
            it.next().m8184a(2);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m2487O() {
        int size = this.f1862k0.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = this.f1862k0.get(i);
            if (uoyVar instanceof apy) {
                uoyVar.m8192j(false);
            } else {
                uoyVar.m8192j(true);
            }
        }
        mo1920f();
    }

    /* JADX INFO: renamed from: P */
    public void m2488P() {
        m2484L(this);
    }

    /* JADX INFO: renamed from: Q */
    public void m2489Q(boolean z) {
        this.f1847S = z;
        xdl0.M(this.f1831E, !z);
        boolean z2 = this.f1847S;
        FrameLayout frameLayout = this.f1869q;
        if (z2) {
            xdl0.U(frameLayout, t100.i);
        } else {
            xdl0.U(frameLayout, 0);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m2490R() {
        xdl0.M(this.f1870r, false);
    }

    /* JADX INFO: renamed from: S */
    public void m2491S(List<uoy> list, final gpy gpyVar) {
        this.f1862k0 = list;
        this.f1851W = gpyVar;
        this.f1868p0 = new ArrayList();
        this.f1832E0 = new LinearLayout(getContext());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        this.f1832E0.setLayoutTransition(layoutTransition);
        this.f1831E.addView(this.f1832E0, new FrameLayout.LayoutParams(-1, -1));
        if (vwb.J(list)) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = list.get(i);
            MessageBarActionItemView messageBarActionItemViewM8732c = xoy.m8732c(uoyVar, getContext(), i, size);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f1832E0.addView(messageBarActionItemViewM8732c, layoutParams);
            this.f1868p0.add(messageBarActionItemViewM8732c);
            messageBarActionItemViewM8732c.setTag(uoyVar);
            xdl0.E0(messageBarActionItemViewM8732c, new View.OnClickListener() { // from class: l.bry
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageBarOpt.m2472u(gpyVar, view);
                }
            });
            if (uoyVar.m8188f()) {
                messageBarActionItemViewM8732c.setOnLongClickListener(new ViewOnLongClickListenerC0133d(gpyVar));
            }
        }
        m2478A0();
    }

    /* JADX INFO: renamed from: T */
    public void m2492T() {
        if (!m2495W()) {
            m2524z0();
            return;
        }
        m2523y0();
        if (this.f1848T) {
            return;
        }
        this.f1848T = true;
        o6j0.h("e_chat_emoji_entrance", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_emoji_entrance", "emoji")});
    }

    /* JADX INFO: renamed from: U */
    public final void m2493U() {
        xdl0.E0(this.f1830D, new View.OnClickListener() { // from class: l.pqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6491a.m2496X(view);
            }
        });
        this.f1827A.getPaint().setFakeBoldText(true);
        this.f1876x.addTextChangedListener(new C0134e());
        m2492T();
        if (ura.e().d().I4()) {
            this.f1839K.setBackgroundResource(c3c0.g);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m2494V(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        this.f1872t.setPivotX(t100.d(15.0f));
        this.f1872t.setPivotY(t100.d(30.0f));
        this.f1870r.setPivotX(t100.d(25.5f));
        this.f1870r.setPivotY(t100.d(21.0f));
        this.f1852b.setBackgroundResource(0);
        xdl0.E0(this.f1870r, new View.OnClickListener() { // from class: l.fqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3685a.m2497Y(view);
            }
        });
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2 = MessageWarmingUpHelper.WarmingUpLevel.not;
        FrameLayout frameLayout = this.f1870r;
        if (warmingUpLevel == warmingUpLevel2) {
            xdl0.M(frameLayout, false);
            return;
        }
        xdl0.M(frameLayout, true);
        xdl0.M(this.f1872t, true);
        o6j0.h("e_heat_entrance", ((MessagesAct) getContext()).pageId(), new o6j0.a[0]);
        xdl0.M(this.f1871s, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1874v.getLayoutParams();
        marginLayoutParams.leftMargin = t100.d(59.0f);
        this.f1874v.setLayoutParams(marginLayoutParams);
        jdm.b(this.f1870r, MessageWarmingUpHelper.m2299j(warmingUpLevel), t100.i, -1, 0, 0, 0);
        this.f1872t.setBackgroundResource(MessageWarmingUpHelper.m2300k(warmingUpLevel));
    }

    /* JADX INFO: renamed from: W */
    public boolean m2495W() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m2496X(View view) {
        if (NullChecker.a(this.f1851W)) {
            this.f1851W.mo4659c(MessageBarActionItemType.BLOCK);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m2497Y(View view) {
        o6j0.c("e_heat_entrance", ((MessagesAct) getContext()).pageId(), new o6j0.a[0]);
        if (!TextUtils.isEmpty(this.f1843O)) {
            d.l().k(this.f1843O);
        }
        if (!TextUtils.isEmpty(this.f1844P)) {
            d.l().k(this.f1844P);
        }
        m2483F0("keyboard_left");
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m2498Z(View view) {
        o6j0.c("e_im_fake_to_good", "p_chat_view", new o6j0.a[]{o6j0.a.h("source_from", getSafeSourceFrom())});
        CoreModule.P().i().D1(xdl0.E(this));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: a */
    public void mo1915a() {
        Iterator<uoy> it = this.f1862k0.iterator();
        while (it.hasNext()) {
            it.next().m8191i(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m2499a0(View view) {
        if (NullChecker.a(this.f1851W)) {
            Context context = getContext();
            if (context instanceof MessagesAct) {
                final Keyboard keyboardMo5099a = ((MessagesAct) context).mo2063c0().m6499g0().mo5099a();
                if (NullChecker.a(keyboardMo5099a)) {
                    if (this.f1850V) {
                        keyboardMo5099a.setAlpha(0.0f);
                        e51.H(context, new Runnable() { // from class: l.gqy
                            @Override // java.lang.Runnable
                            public final void run() {
                                keyboardMo5099a.setAlpha(1.0f);
                            }
                        }, 300L);
                    } else {
                        keyboardMo5099a.setAlpha(1.0f);
                        bt0.z(new Animator[]{bt0.p(keyboardMo5099a, "translationY", 0L, 200L, this.f1849U, new float[]{t100.d(200.0f), 0.0f})}).start();
                    }
                }
            }
            this.f1851W.mo4657a();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: b */
    public View mo1916b(MessageBarActionItemType messageBarActionItemType) {
        if (vwb.J(this.f1862k0)) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= this.f1862k0.size()) {
                i = -1;
                break;
            }
            if (this.f1862k0.get(i).m8186d() == messageBarActionItemType) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.f1868p0.size()) {
            return null;
        }
        return this.f1868p0.get(i);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m2500b0(View view) {
        m2483F0("keyboard_top");
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: c */
    public boolean mo1917c(MessageBarActionItemType messageBarActionItemType) {
        if (vwb.J(this.f1862k0)) {
            return false;
        }
        Iterator<uoy> it = this.f1862k0.iterator();
        while (it.hasNext()) {
            if (it.next().m8186d() == messageBarActionItemType) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m2501c0(Context context, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, View view) {
        o6j0.c("e_heat_increase_remind", ((MessagesAct) context).pageId(), new o6j0.a[]{o6j0.a.h("heat_function_name", warmingUpLevel.key)});
        d.l().k(this.f1844P);
        m2483F0("keyboard_top");
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: d */
    public boolean mo1918d(MessageBarActionItemType messageBarActionItemType) {
        if (vwb.J(this.f1862k0)) {
            return false;
        }
        for (uoy uoyVar : this.f1862k0) {
            if (uoyVar.m8186d() == messageBarActionItemType) {
                return uoyVar.m8189g();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m2502d0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleX", 1.0f, 1.14f, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleY", 1.0f, 1.14f, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(384L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m2503e0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f1870r, (Property<FrameLayout, Integer>) f1826J0, MessageWarmingUpHelper.m2299j(warmingUpLevel), MessageWarmingUpHelper.m2301l(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.q(this.f1871s, "alpha", new float[]{0.0f, 1.0f}));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
        Animator duration = bt0.o(this.f1871s, f1824H0, new int[]{14, 0}).setDuration(233L);
        duration.addListener(new C0141l(d));
        duration.start();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: f */
    public void mo1920f() {
        int size = this.f1868p0.size();
        for (int i = 0; i < size; i++) {
            MessageBarActionItemView messageBarActionItemView = this.f1868p0.get(i);
            ((uoy) messageBarActionItemView.getTag()).mo2907c(messageBarActionItemView, i, size);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m2504f0() {
        bt0.o(this.f1871s, f1824H0, new int[]{0, 14}).setDuration(233L).start();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: g */
    public void mo1921g(MessageBarState messageBarState) {
        xdl0.E0(getRecoverMatchView(), (View.OnClickListener) null);
        if (messageBarState == MessageBarState.DEFAULT) {
            xdl0.M(getMessageBarRoot(), true);
            xdl0.M(getRecoverMatchView(), false);
            return;
        }
        if (messageBarState == MessageBarState.FAKE_LOCK) {
            xdl0.M(getMessageBarRoot(), false);
            xdl0.M(getRecoverMatchView(), true);
            getRecoverMatchView().setBackgroundResource(ura.e().d().I4() ? c3c0.g : c3c0.e);
            getRecoverMatchView().setTextColor(getResources().getColor(a1c0.a0));
            getRecoverMatchView().setText("上传头像后开启聊天");
            xdl0.E0(getRecoverMatchView(), new View.OnClickListener() { // from class: l.hqy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4260a.m2498Z(view);
                }
            });
            m2482E0();
            return;
        }
        if (messageBarState == MessageBarState.AVATAR_AUDIT) {
            xdl0.M(getMessageBarRoot(), false);
            xdl0.M(getRecoverMatchView(), true);
            getRecoverMatchView().setBackgroundResource(c3c0.K1);
            getRecoverMatchView().setTextColor(getResources().getColor(a1c0.a0));
            getRecoverMatchView().setText("审核通过后即可开启聊天");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m2505g0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f1870r, (Property<FrameLayout, Integer>) f1826J0, MessageWarmingUpHelper.m2301l(warmingUpLevel), MessageWarmingUpHelper.m2299j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.q(this.f1871s, "alpha", new float[]{1.0f, 0.0f}));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public View getActionLayout() {
        return this.f1831E;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public AIChatView getAiChatview() {
        return this.f1842N;
    }

    public LinearLayout getBarMaskLayer() {
        return this.f1856f;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public FrameLayout getBarWrapper() {
        return this.f1869q;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public MessageInputBaseEditView getBar_center_text() {
        return this.f1876x;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public VLinear getBar_center_text_layout() {
        return this.f1875w;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public VText getBlockText() {
        return this.f1830D;
    }

    public RecorderView getCameraFunction() {
        return this.f1828B;
    }

    public View getChangeSizeView() {
        return this.f1861k;
    }

    public ImageView getCloseView() {
        return this.f1838J;
    }

    public TextView getCountDownTimer() {
        return this.f1860j;
    }

    public MessageInputEditRootLayout getEditRootView() {
        return this.f1874v;
    }

    public ImageView getExpandView() {
        return this.f1864m;
    }

    public TextView getFilterNameView() {
        return this.f1858h;
    }

    public FilterScrollMoreViewPager getFilterView() {
        return this.f1859i;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public View getGiftView() {
        if (vwb.J(this.f1862k0)) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= this.f1862k0.size()) {
                i = -1;
                break;
            }
            if (this.f1862k0.get(i).m8186d() == MessageBarActionItemType.GIFT) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.f1868p0.size()) {
            return null;
        }
        return this.f1868p0.get(i);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public KeyboardFrameWithShadowOutside getHidden_slide_out() {
        return this.f1840L;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public View getInputAiView() {
        return this.f1877y;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public View getInputContent() {
        return this.f1866o;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public View getInputRoot() {
        return this.f1873u;
    }

    public ViewGroup getMaskLayer() {
        return this.f1857g;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public View getMessageBarRoot() {
        return this.f1865n;
    }

    public TextView getNoticeBubble() {
        return this.f1835G;
    }

    public TextView getNoticeVideo() {
        return this.f1836H;
    }

    public TextView getRealShotSend() {
        return this.f1829C;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public RecordAnimLayout getRecordLayout() {
        return this.f1833F;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public VButton getRecoverMatchView() {
        return this.f1839K;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public LinearLayout getReferenceView() {
        return this.f1867p;
    }

    public VText getSingleText() {
        return this.f1837I;
    }

    public LinearLayout getSurfaceContainer() {
        return this.f1855e;
    }

    public MessageSurfaceAnimContainer getSurfaceContent() {
        return this.f1854d;
    }

    public FrameLayout getSurfaceViewRooter() {
        return this.f1853c;
    }

    public ImageView getSwitchCameraView() {
        return this.f1863l;
    }

    public View getTempInputLayout() {
        return this.f1870r;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: h */
    public void mo1922h(MessageBarActionItemType messageBarActionItemType, boolean z) {
        int size = this.f1862k0.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = this.f1862k0.get(i);
            if (uoyVar.m8186d() == messageBarActionItemType) {
                uoyVar.m8191i(z);
            }
        }
        mo1920f();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m2506h0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(350L);
        animatorSet.start();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: i */
    public void mo1923i(boolean z, boolean z2) {
        if (!z) {
            xdl0.M(this.f1842N, false);
            xdl0.M(this.f1831E, !this.f1847S);
            return;
        }
        if (y19.S() && d.l().x("switchPicBubbleKey")) {
            d.l().k("switchPicBubbleKey");
        }
        xdl0.M(this.f1842N, true);
        xdl0.M(this.f1831E, false);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m2507i0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f1870r, (Property<FrameLayout, Integer>) f1826J0, MessageWarmingUpHelper.m2301l(warmingUpLevel), MessageWarmingUpHelper.m2299j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.q(this.f1871s, "alpha", new float[]{1.0f, 0.0f}));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: j */
    public void mo1924j(boolean z, boolean z2) {
        if (m2495W()) {
            this.f1850V = z;
            VImage vImage = this.f1878z;
            if (!z) {
                vImage.setImageResource(ura.e().d().I4() ? c3c0.B : c3c0.A);
                xdl0.U(this.f1869q, this.f1847S ? t100.i : t100.d(0.0f));
                xdl0.M(this.f1831E, !this.f1847S);
            } else {
                vImage.setImageResource(ura.e().d().I4() ? c3c0.D : c3c0.C);
                if (z2) {
                    return;
                }
                xdl0.U(this.f1869q, t100.d(7.0f));
                xdl0.M(this.f1831E, false);
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m2508j0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C0140k(warmingUpLevel));
        animatorSet.setDuration(367L);
        animatorSet.start();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: k */
    public void mo1925k(int i, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final double d) {
        if (i == 1916) {
            e51.F(getContext(), new Runnable() { // from class: l.vqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8400a.m2502d0();
                }
            });
            return;
        }
        if (i == 2233) {
            e51.F(getContext(), new Runnable() { // from class: l.wqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8604a.m2503e0(warmingUpLevel, d);
                }
            });
            return;
        }
        if (i == 5250) {
            e51.F(getContext(), new Runnable() { // from class: l.xqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8820a.m2504f0();
                }
            });
        } else if (i == 5333) {
            e51.F(getContext(), new Runnable() { // from class: l.yqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9114a.m2505g0(warmingUpLevel);
                }
            });
        } else if (i == 5433) {
            e51.F(getContext(), new Runnable() { // from class: l.zqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9402a.m2506h0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m2509k0() {
        xdl0.M(this.f1870r, false);
        Animator duration = bt0.o(this.f1874v, f1823G0, new int[]{0, t100.d(61.0f), t100.d(59.0f)}).setDuration(334L);
        duration.addListener(new C0135f());
        duration.start();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    /* JADX INFO: renamed from: l */
    public void mo1926l(int i, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, final double d) {
        if (warmingUpLevel != MessageWarmingUpHelper.WarmingUpLevel.not) {
            if (i == 1916) {
                e51.F(getContext(), new Runnable() { // from class: l.qqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6672a.m2514p0(warmingUpLevel);
                    }
                });
                return;
            }
            if (i == 2233) {
                e51.F(getContext(), new Runnable() { // from class: l.rqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7050a.m2515q0(warmingUpLevel, warmingUpLevel2, d);
                    }
                });
                return;
            }
            if (i == 5250) {
                e51.F(getContext(), new Runnable() { // from class: l.sqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7288a.m2516r0();
                    }
                });
                return;
            } else if (i == 5350) {
                e51.F(getContext(), new Runnable() { // from class: l.tqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7587a.m2507i0(warmingUpLevel2);
                    }
                });
                return;
            } else {
                if (i == 5433) {
                    e51.F(getContext(), new Runnable() { // from class: l.jqy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f4704a.m2508j0(warmingUpLevel2);
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (i == 0) {
            e51.F(getContext(), new Runnable() { // from class: l.iqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4471a.m2509k0();
                }
            });
            return;
        }
        if (i == 50) {
            e51.F(getContext(), new Runnable() { // from class: l.kqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5009a.m2510l0(warmingUpLevel2, d);
                }
            });
            return;
        }
        if (i == 3150) {
            e51.F(getContext(), new Runnable() { // from class: l.lqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5389a.m2511m0();
                }
            });
            return;
        }
        if (i == 3250) {
            e51.F(getContext(), new Runnable() { // from class: l.mqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5742a.m2512n0(warmingUpLevel2);
                }
            });
        } else if (i == 3333) {
            e51.F(getContext(), new Runnable() { // from class: l.nqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5954a.m2513o0(warmingUpLevel2);
                }
            });
            e51.F(getContext(), new Runnable() { // from class: l.oqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6217a.m2480C0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m2510l0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1870r, "scaleX", 0.0f, 1.04f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f1870r, "scaleY", 0.0f, 1.04f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(466L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.addListener(new C0136g(warmingUpLevel, d));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m2511m0() {
        bt0.o(this.f1871s, f1824H0, new int[]{0, t100.d(0.0f), t100.d(14.0f)}).setDuration(233L).start();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m2512n0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorQ = bt0.q(this.f1871s, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f1870r, (Property<FrameLayout, Integer>) f1826J0, MessageWarmingUpHelper.m2301l(warmingUpLevel), MessageWarmingUpHelper.m2299j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        animatorSet.playTogether(animatorQ, objectAnimatorOfInt);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m2513o0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C0137h(warmingUpLevel));
        animatorSet.setDuration(350L);
        animatorSet.start();
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
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2488P();
        m2493U();
        if (ura.e().d().I4()) {
            this.f1876x.setTextColor(getResources().getColor(a1c0.g));
            this.f1876x.setHintTextColor(getResources().getColor(a1c0.i));
            soe.m7631a(this.f1876x);
            this.f1863l.setImageResource(c3c0.w3);
            this.f1864m.setImageResource(c3c0.t3);
            this.f1828B.setImageResource(c3c0.y3);
            this.f1838J.setImageResource(c3c0.s3);
            this.f1878z.setImageResource(c3c0.B);
            this.f1835G.setBackgroundResource(c3c0.H1);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m2514p0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleX", 1.0f, 1.14f, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f1872t, "scaleY", 1.0f, 1.14f, 0.0f));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C0138i(warmingUpLevel));
        animatorSet.setDuration(367L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m2515q0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f1870r, (Property<FrameLayout, Integer>) f1826J0, MessageWarmingUpHelper.m2299j(warmingUpLevel), MessageWarmingUpHelper.m2301l(warmingUpLevel2));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.q(this.f1871s, "alpha", new float[]{0.0f, 1.0f}));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
        Animator duration = bt0.o(this.f1871s, f1824H0, new int[]{14, 0}).setDuration(233L);
        duration.addListener(new C0139j(d));
        duration.start();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m2516r0() {
        bt0.o(this.f1871s, f1824H0, new int[]{0, 14}).setDuration(233L).start();
    }

    /* JADX INFO: renamed from: s0 */
    public void m2517s0(String str) {
        int size = this.f1862k0.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            uoy uoyVar = this.f1862k0.get(i2);
            if (uoyVar instanceof apy) {
                uoyVar.m8192j(true);
                if (uoyVar instanceof apy) {
                    m2522x0(((apy) uoyVar).m2908l(), i, str);
                    i++;
                }
            } else {
                uoyVar.m8192j(false);
            }
        }
        mo1920f();
    }

    public void setEditTextAndEnsureFocus(String str) {
        getBar_center_text().setText(str);
        getBar_center_text().setFocusable(true);
        getBar_center_text().setFocusableInTouchMode(true);
        getBar_center_text().requestFocus();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public void setGroupStyle(Act act) {
        this.f1834F0 = true;
        m2492T();
        m2478A0();
    }

    /* JADX INFO: renamed from: t0 */
    public void m2518t0(e30 e30Var) {
        this.f1845Q = e30Var;
    }

    /* JADX INFO: renamed from: u0 */
    public void m2519u0() {
        if (NullChecker.a(this.f1842N)) {
            this.f1842N.m2131e();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m2520v0(MessageBarActionItemView messageBarActionItemView) {
        int size = this.f1868p0.size();
        for (int i = 0; i < size; i++) {
            MessageBarActionItemView messageBarActionItemView2 = this.f1868p0.get(i);
            if (messageBarActionItemView2 == messageBarActionItemView) {
                ((uoy) messageBarActionItemView2.getTag()).mo2907c(messageBarActionItemView2, i, size);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m2521w0() {
        Iterator<uoy> it = this.f1862k0.iterator();
        while (it.hasNext()) {
            it.next().m8185b();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m2522x0(OfficialAccountsMenu officialAccountsMenu, int i, String str) {
        zvf0.A("e_official_account_bottom_menu", "p_chat_view", new j760[]{vwb.Y("bottom_menu_id", officialAccountsMenu.id), vwb.Y("official_account_id", str), vwb.Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.Y("bottom_menu_y_axis", 0), vwb.Y("bottom_menu_name", officialAccountsMenu.text)});
    }

    /* JADX INFO: renamed from: y0 */
    public void m2523y0() {
        xdl0.M(this.f1878z, true);
        this.f1874v.setBackgroundColor(0);
        xdl0.A0(getContext(), this.f1875w, c3c0.J1);
        if (TextUtils.isEmpty(this.f1876x.getText().toString().trim())) {
            xdl0.A0(getContext(), this.f1827A, c3c0.J1);
        } else {
            xdl0.A0(getContext(), this.f1827A, ura.e().d().I4() ? c3c0.M1 : c3c0.L1);
        }
        xdl0.d0(this.f1827A, t100.d(14.0f));
        xdl0.e0(this.f1827A, t100.d(14.0f));
        xdl0.V(this.f1827A, t100.d(8.0f));
        xdl0.E0(this.f1878z, new View.OnClickListener() { // from class: l.eqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3367a.m2499a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public void m2524z0() {
        xdl0.M(this.f1878z, false);
        xdl0.A0(getContext(), this.f1874v, c3c0.J1);
        xdl0.B0(this.f1875w, (Drawable) null);
        xdl0.B0(this.f1827A, (Drawable) null);
        xdl0.d0(this.f1827A, t100.d(4.0f));
        xdl0.e0(this.f1827A, t100.d(16.0f));
        xdl0.V(this.f1827A, t100.d(0.0f));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.MessageBar
    public VText getBar_send() {
        return this.f1827A;
    }

    public MessageBarOpt(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1843O = "";
        this.f1844P = "";
        this.f1846R = false;
        this.f1847S = false;
        this.f1848T = false;
        this.f1849U = new AccelerateInterpolator();
        this.f1850V = false;
        this.f1834F0 = false;
    }

    public MessageBarOpt(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1843O = "";
        this.f1844P = "";
        this.f1846R = false;
        this.f1847S = false;
        this.f1848T = false;
        this.f1849U = new AccelerateInterpolator();
        this.f1850V = false;
        this.f1834F0 = false;
    }
}
