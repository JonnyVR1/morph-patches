package com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import com.p046p1.mobile.putong.core.p053ui.messages.KeyboardFrameWithShadowOutside;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.aichat.AIChatView;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.RecorderView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.p046p1.mobile.putong.core.p053ui.messages.model.record.view.RecordAnimLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageBarRootLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputEditRootLayout;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VButton;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.apy;
import p149l.bt0;
import p149l.c3c0;
import p149l.cry;
import p149l.e30;
import p149l.e51;
import p149l.gpy;
import p149l.jdm;
import p149l.l6c0;
import p149l.o6j0;
import p149l.o7r;
import p149l.soe;
import p149l.t100;
import p149l.uoy;
import p149l.ura;
import p149l.v0c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xoy;
import p149l.y19;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageBarOpt extends MessageBar {

    /* JADX INFO: renamed from: G0 */
    public static final Property<View, Integer> f31932G0;

    /* JADX INFO: renamed from: H0 */
    public static final Property<View, Integer> f31933H0;

    /* JADX INFO: renamed from: I0 */
    public static final Property<View, Integer> f31934I0;

    /* JADX INFO: renamed from: J0 */
    public static final Property<View, Integer> f31935J0;

    /* JADX INFO: renamed from: A */
    public VText f31936A;

    /* JADX INFO: renamed from: B */
    public RecorderView f31937B;

    /* JADX INFO: renamed from: C */
    public TextView f31938C;

    /* JADX INFO: renamed from: D */
    public VText f31939D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f31940E;

    /* JADX INFO: renamed from: E0 */
    public LinearLayout f31941E0;

    /* JADX INFO: renamed from: F */
    public RecordAnimLayout f31942F;

    /* JADX INFO: renamed from: F0 */
    public boolean f31943F0;

    /* JADX INFO: renamed from: G */
    public TextView f31944G;

    /* JADX INFO: renamed from: H */
    public TextView f31945H;

    /* JADX INFO: renamed from: I */
    public VText f31946I;

    /* JADX INFO: renamed from: J */
    public ImageView f31947J;

    /* JADX INFO: renamed from: K */
    public VButton f31948K;

    /* JADX INFO: renamed from: L */
    public KeyboardFrameWithShadowOutside f31949L;

    /* JADX INFO: renamed from: M */
    public ViewStub f31950M;

    /* JADX INFO: renamed from: N */
    public AIChatView f31951N;

    /* JADX INFO: renamed from: O */
    public String f31952O;

    /* JADX INFO: renamed from: P */
    public String f31953P;

    /* JADX INFO: renamed from: Q */
    public e30 f31954Q;

    /* JADX INFO: renamed from: R */
    public boolean f31955R;

    /* JADX INFO: renamed from: S */
    public boolean f31956S;

    /* JADX INFO: renamed from: T */
    public boolean f31957T;

    /* JADX INFO: renamed from: U */
    public AccelerateInterpolator f31958U;

    /* JADX INFO: renamed from: V */
    public boolean f31959V;

    /* JADX INFO: renamed from: W */
    public gpy f31960W;

    /* JADX INFO: renamed from: b */
    public MessageBarOpt f31961b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f31962c;

    /* JADX INFO: renamed from: d */
    public MessageSurfaceAnimContainer f31963d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f31964e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f31965f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f31966g;

    /* JADX INFO: renamed from: h */
    public TextView f31967h;

    /* JADX INFO: renamed from: i */
    public FilterScrollMoreViewPager f31968i;

    /* JADX INFO: renamed from: j */
    public TextView f31969j;

    /* JADX INFO: renamed from: k */
    public View f31970k;

    /* JADX INFO: renamed from: k0 */
    public List<uoy> f31971k0;

    /* JADX INFO: renamed from: l */
    public ImageView f31972l;

    /* JADX INFO: renamed from: m */
    public ImageView f31973m;

    /* JADX INFO: renamed from: n */
    public MessageBarRootLayout f31974n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f31975o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f31976p;

    /* JADX INFO: renamed from: p0 */
    public List<MessageBarActionItemView> f31977p0;

    /* JADX INFO: renamed from: q */
    public FrameLayout f31978q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f31979r;

    /* JADX INFO: renamed from: s */
    public VText f31980s;

    /* JADX INFO: renamed from: t */
    public View f31981t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f31982u;

    /* JADX INFO: renamed from: v */
    public MessageInputEditRootLayout f31983v;

    /* JADX INFO: renamed from: w */
    public VLinear f31984w;

    /* JADX INFO: renamed from: x */
    public VEditTextEmojiCompat f31985x;

    /* JADX INFO: renamed from: y */
    public SVGAnimationView f31986y;

    /* JADX INFO: renamed from: z */
    public VImage f31987z;

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
    public class C8547a extends Property<View, Integer> {
        public C8547a(Class cls, String str) {
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
    public class C8548b extends Property<View, Integer> {
        public C8548b(Class cls, String str) {
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
    public class C8549c extends Property<View, Integer> {
        public C8549c(Class cls, String str) {
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
            jdm.m141040b(view, num.intValue(), t100.f167260i, -1, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$d */
    public class ViewOnLongClickListenerC8550d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gpy f31988a;

        public ViewOnLongClickListenerC8550d(gpy gpyVar) {
            this.f31988a = gpyVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            uoy uoyVar = (uoy) view.getTag();
            if (NullChecker.m81303a(this.f31988a) && NullChecker.m81303a(uoyVar)) {
                this.f31988a.mo127500b(uoyVar, view, true);
            }
            return !uoyVar.m194574e(2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$e */
    public class C8551e implements TextWatcher {
        public C8551e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!MessageBarOpt.this.m49366W()) {
                boolean zIsEmpty = TextUtils.isEmpty(editable.toString().trim());
                MessageBarOpt messageBarOpt = MessageBarOpt.this;
                if (zIsEmpty) {
                    messageBarOpt.f31936A.setTextColor(messageBarOpt.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67120B));
                    return;
                } else {
                    messageBarOpt.f31936A.setTextColor(messageBarOpt.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67121C));
                    return;
                }
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(editable.toString().trim());
            MessageBarOpt messageBarOpt2 = MessageBarOpt.this;
            if (zIsEmpty2) {
                messageBarOpt2.f31936A.setTextColor(messageBarOpt2.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67120B));
                xdl0.m208321A0(MessageBarOpt.this.getContext(), MessageBarOpt.this.f31936A, c3c0.f78550J1);
            } else {
                messageBarOpt2.f31936A.setTextColor(messageBarOpt2.getResources().getColor(a1c0.f67119A));
                xdl0.m208321A0(MessageBarOpt.this.getContext(), MessageBarOpt.this.f31936A, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78577M1 : c3c0.f78568L1);
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
    public class C8552f extends bt0.C15966j {
        public C8552f() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) MessageBarOpt.this.f31983v.getLayoutParams();
            marginLayoutParams.leftMargin = t100.m186890d(59.0f);
            MessageBarOpt.this.f31983v.setLayoutParams(marginLayoutParams);
            MessageBarOpt.this.f31979r.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$g */
    public class C8553g extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f31992a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ double f31993b;

        public C8553g(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
            this.f31992a = warmingUpLevel;
            this.f31993b = d;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.m208344M(MessageBarOpt.this.f31979r, true);
            jdm.m141040b(MessageBarOpt.this.f31979r, MessageWarmingUpHelper.m49182l(this.f31992a), t100.f167260i, -1, 0, 0, 0);
            xdl0.m208344M(MessageBarOpt.this.f31980s, true);
            xdl0.m208344M(MessageBarOpt.this.f31981t, false);
            MessageBarOpt.this.f31980s.setText(MessageWarmingUpHelper.m49172b(this.f31993b) + "°C");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$h */
    public class C8554h extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f31995a;

        public C8554h(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f31995a = warmingUpLevel;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            MessageBarOpt.this.f31981t.setBackgroundResource(MessageWarmingUpHelper.m49181k(this.f31995a));
            xdl0.m208345M0(MessageBarOpt.this.f31981t, true);
            o6j0.m162864h("e_heat_entrance", ((MessagesAct) MessageBarOpt.this.getContext()).pageId(), new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$i */
    public class C8555i extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f31997a;

        public C8555i(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f31997a = warmingUpLevel;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f31981t.setBackgroundResource(MessageWarmingUpHelper.m49181k(this.f31997a));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$j */
    public class C8556j extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f31999a;

        public C8556j(double d) {
            this.f31999a = d;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f31980s.setText(MessageWarmingUpHelper.m49172b(this.f31999a) + "°C");
            xdl0.m208344M(MessageBarOpt.this.f31980s, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$k */
    public class C8557k extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f32001a;

        public C8557k(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f32001a = warmingUpLevel;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f31981t.setBackgroundResource(MessageWarmingUpHelper.m49181k(this.f32001a));
            MessageBarOpt.this.m49352D0(this.f32001a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$l */
    public class C8558l extends bt0.C15966j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f32003a;

        public C8558l(double d) {
            this.f32003a = d;
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f31980s.setText(MessageWarmingUpHelper.m49172b(this.f32003a) + "°C");
            xdl0.m208344M(MessageBarOpt.this.f31980s, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$m */
    public class C8559m extends Property<View, Integer> {
        public C8559m(Class cls, String str) {
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
        f31932G0 = new C8559m(cls, "marginLeft");
        f31933H0 = new C8547a(cls, "marginTop");
        f31934I0 = new C8548b(cls, "marginBottom");
        f31935J0 = new C8549c(cls, "backgroundColor");
    }

    public MessageBarOpt(Context context) {
        super(context);
        this.f31952O = "";
        this.f31953P = "";
        this.f31955R = false;
        this.f31956S = false;
        this.f31957T = false;
        this.f31958U = new AccelerateInterpolator();
        this.f31959V = false;
        this.f31943F0 = false;
    }

    private String getSafeSourceFrom() {
        if (!(getContext() instanceof MessagesAct)) {
            return "";
        }
        Conversation conversationM120788j3 = ((MessagesAct) getContext()).f31640f.m120788j3();
        if (!NullChecker.m81303a(conversationM120788j3)) {
            return "";
        }
        if (conversationM120788j3.isFakeHeartbeatConv()) {
            return "love_signal";
        }
        return conversationM120788j3.isFakeQuickChatConv() ? "quickchat" : "";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m49343u(gpy gpyVar, View view) {
        uoy uoyVar = (uoy) view.getTag();
        if (NullChecker.m81303a(gpyVar) && NullChecker.m81303a(uoyVar)) {
            gpyVar.mo127500b(uoyVar, view, false);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m49349A0() {
        if (m49366W()) {
            m49350B0(MessageBarActionItemType.EMOJI, false);
        } else {
            m49350B0(MessageBarActionItemType.EMOJI, true);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m49350B0(MessageBarActionItemType messageBarActionItemType, boolean z) {
        int size = this.f31971k0.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = this.f31971k0.get(i);
            if (uoyVar.m194573d() == messageBarActionItemType) {
                uoyVar.m194579j(z);
                uoyVar.m194580k(z);
            }
        }
        mo48835f();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m49351C0() {
        if (!CoreModule.f17545c.f19642f0.f19938g1.get().booleanValue() || CoreModule.f17545c.f19639e0.f149467s2.get().booleanValue()) {
            Context context = getContext();
            if (context instanceof MessagesAct) {
                MessagesAct messagesAct = (MessagesAct) context;
                messagesAct.mo48974l().m120842t7().m190278V1();
                o6j0.m162864h("e_heat_entrance_bubble", messagesAct.pageId(), new o6j0.C18854a[0]);
            }
            CoreModule.f17545c.f19642f0.f19938g1.put(Boolean.TRUE);
            TextView textView = new TextView(getContext());
            textView.setText("用温度记录你们的聊天时光。随着温\n度的升高，可解锁更多亲密功能");
            textView.setPadding(t100.m186890d(16.0f), t100.m186890d(10.0f), t100.m186890d(16.0f), t100.m186890d(10.0f));
            textView.setTextSize(13.0f);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(-1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.uqy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177793a.m49371b0(view);
                }
            });
            C4345a c4345a = new C4345a(getContext());
            C4345a c4345aM20883y = c4345a.m20877s(textView).m20874p(75).m20864e(true).m20883y(true);
            int i = t100.f167260i;
            c4345aM20883y.m20884z(i).m20861b(3000L).m20882x(-i).m20873o(C4345a.f15681O, t100.f167258g).m20875q(C4345a.f15683Q | C4345a.f15681O);
            c4345a.m20870k(getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : v0c0.f179101h));
            this.f31952O = C4348d.m20896l().m20908t(c4345a, this.f31979r);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m49352D0(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (C4348d.m20896l().m20912x(this.f31953P)) {
            return;
        }
        final Context context = getContext();
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            messagesAct.mo48974l().m120842t7().m190278V1();
            o6j0.m162864h("e_heat_increase_remind", messagesAct.pageId(), o6j0.C18854a.m162878h("heat_function_name", warmingUpLevel.key));
            View viewInflate = o7r.m163037a(getContext()).inflate(l6c0.f126314I2, (ViewGroup) null);
            ((ImageView) viewInflate.findViewById(y4c0.f196159k1)).setImageResource(MessageWarmingUpHelper.m49190t(warmingUpLevel));
            TextView textView = (TextView) viewInflate.findViewById(y4c0.f196032Q4);
            textView.getPaint().setFakeBoldText(true);
            textView.setText(MessageWarmingUpHelper.m49191u(warmingUpLevel));
            ((TextView) viewInflate.findViewById(y4c0.f196081Z)).setText(MessageWarmingUpHelper.m49189s(warmingUpLevel));
            TextView textView2 = (TextView) viewInflate.findViewById(y4c0.f195935B);
            textView2.getPaint().setFakeBoldText(true);
            textView2.setTextColor(MessageWarmingUpHelper.m49182l(warmingUpLevel));
            xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.ary
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f71368a.m49372c0(context, warmingUpLevel, view);
                }
            });
            C4345a c4345a = new C4345a(getContext());
            C4345a c4345aM20861b = c4345a.m20877s(viewInflate).m20874p(75).m20864e(true).m20883y(true).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            int i = t100.f167260i;
            c4345aM20861b.m20884z(i).m20875q(C4345a.f15683Q | C4345a.f15681O).m20882x(-i).m20873o(C4345a.f15681O, i).m20881w(t100.f167264m).m20870k(MessageWarmingUpHelper.m49180j(warmingUpLevel));
            this.f31953P = C4348d.m20896l().m20908t(c4345a, this.f31979r);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m49353E0() {
        if (this.f31955R) {
            return;
        }
        this.f31955R = true;
        o6j0.m162864h("e_im_fake_to_good", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("source_from", getSafeSourceFrom()));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m49354F0(String str) {
        if (NullChecker.m81303a(this.f31954Q)) {
            this.f31954Q.call(str);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m49355L(View view) {
        cry.m108460a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public ViewGroup m49356M() {
        return this.f31941E0;
    }

    /* JADX INFO: renamed from: N */
    public void m49357N() {
        Iterator<uoy> it = this.f31971k0.iterator();
        while (it.hasNext()) {
            it.next().m194571a(2);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m49358O() {
        int size = this.f31971k0.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = this.f31971k0.get(i);
            if (uoyVar instanceof apy) {
                uoyVar.m194579j(false);
            } else {
                uoyVar.m194579j(true);
            }
        }
        mo48835f();
    }

    /* JADX INFO: renamed from: P */
    public void m49359P() {
        m49355L(this);
    }

    /* JADX INFO: renamed from: Q */
    public void m49360Q(boolean z) {
        this.f31956S = z;
        xdl0.m208344M(this.f31940E, !z);
        boolean z2 = this.f31956S;
        FrameLayout frameLayout = this.f31978q;
        if (z2) {
            xdl0.m208357U(frameLayout, t100.f167260i);
        } else {
            xdl0.m208357U(frameLayout, 0);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m49361R() {
        xdl0.m208344M(this.f31979r, false);
    }

    /* JADX INFO: renamed from: S */
    public void m49362S(List<uoy> list, final gpy gpyVar) {
        this.f31971k0 = list;
        this.f31960W = gpyVar;
        this.f31977p0 = new ArrayList();
        this.f31941E0 = new LinearLayout(getContext());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        this.f31941E0.setLayoutTransition(layoutTransition);
        this.f31940E.addView(this.f31941E0, new FrameLayout.LayoutParams(-1, -1));
        if (vwb.m200296J(list)) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = list.get(i);
            MessageBarActionItemView messageBarActionItemViewM210448c = xoy.m210448c(uoyVar, getContext(), i, size);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f31941E0.addView(messageBarActionItemViewM210448c, layoutParams);
            this.f31977p0.add(messageBarActionItemViewM210448c);
            messageBarActionItemViewM210448c.setTag(uoyVar);
            xdl0.m208329E0(messageBarActionItemViewM210448c, new View.OnClickListener() { // from class: l.bry
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageBarOpt.m49343u(gpyVar, view);
                }
            });
            if (uoyVar.m194575f()) {
                messageBarActionItemViewM210448c.setOnLongClickListener(new ViewOnLongClickListenerC8550d(gpyVar));
            }
        }
        m49349A0();
    }

    /* JADX INFO: renamed from: T */
    public void m49363T() {
        if (!m49366W()) {
            m49395z0();
            return;
        }
        m49394y0();
        if (this.f31957T) {
            return;
        }
        this.f31957T = true;
        o6j0.m162864h("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_emoji_entrance", "emoji"));
    }

    /* JADX INFO: renamed from: U */
    public final void m49364U() {
        xdl0.m208329E0(this.f31939D, new View.OnClickListener() { // from class: l.pqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150823a.m49367X(view);
            }
        });
        this.f31936A.getPaint().setFakeBoldText(true);
        this.f31985x.addTextChangedListener(new C8551e());
        m49363T();
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31948K.setBackgroundResource(c3c0.f78746g);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m49365V(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        this.f31981t.setPivotX(t100.m186890d(15.0f));
        this.f31981t.setPivotY(t100.m186890d(30.0f));
        this.f31979r.setPivotX(t100.m186890d(25.5f));
        this.f31979r.setPivotY(t100.m186890d(21.0f));
        this.f31961b.setBackgroundResource(0);
        xdl0.m208329E0(this.f31979r, new View.OnClickListener() { // from class: l.fqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98865a.m49368Y(view);
            }
        });
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2 = MessageWarmingUpHelper.WarmingUpLevel.not;
        FrameLayout frameLayout = this.f31979r;
        if (warmingUpLevel == warmingUpLevel2) {
            xdl0.m208344M(frameLayout, false);
            return;
        }
        xdl0.m208344M(frameLayout, true);
        xdl0.m208344M(this.f31981t, true);
        o6j0.m162864h("e_heat_entrance", ((MessagesAct) getContext()).pageId(), new o6j0.C18854a[0]);
        xdl0.m208344M(this.f31980s, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31983v.getLayoutParams();
        marginLayoutParams.leftMargin = t100.m186890d(59.0f);
        this.f31983v.setLayoutParams(marginLayoutParams);
        jdm.m141040b(this.f31979r, MessageWarmingUpHelper.m49180j(warmingUpLevel), t100.f167260i, -1, 0, 0, 0);
        this.f31981t.setBackgroundResource(MessageWarmingUpHelper.m49181k(warmingUpLevel));
    }

    /* JADX INFO: renamed from: W */
    public boolean m49366W() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m49367X(View view) {
        if (NullChecker.m81303a(this.f31960W)) {
            this.f31960W.mo127501c(MessageBarActionItemType.BLOCK);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m49368Y(View view) {
        o6j0.m162859c("e_heat_entrance", ((MessagesAct) getContext()).pageId(), new o6j0.C18854a[0]);
        if (!TextUtils.isEmpty(this.f31952O)) {
            C4348d.m20896l().m20900k(this.f31952O);
        }
        if (!TextUtils.isEmpty(this.f31953P)) {
            C4348d.m20896l().m20900k(this.f31953P);
        }
        m49354F0("keyboard_left");
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m49369Z(View view) {
        o6j0.m162859c("e_im_fake_to_good", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("source_from", getSafeSourceFrom()));
        CoreModule.m29935P().m94658i().mo158218D1((Act) xdl0.m208328E(this));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: a */
    public void mo48830a() {
        Iterator<uoy> it = this.f31971k0.iterator();
        while (it.hasNext()) {
            it.next().m194578i(false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m49370a0(View view) {
        if (NullChecker.m81303a(this.f31960W)) {
            Context context = getContext();
            if (context instanceof MessagesAct) {
                final Keyboard keyboardMo134702a = ((MessagesAct) context).mo48971c0().m156457g0().mo134702a();
                if (NullChecker.m81303a(keyboardMo134702a)) {
                    if (this.f31959V) {
                        keyboardMo134702a.setAlpha(0.0f);
                        e51.m114743H(context, new Runnable() { // from class: l.gqy
                            @Override // java.lang.Runnable
                            public final void run() {
                                keyboardMo134702a.setAlpha(1.0f);
                            }
                        }, 300L);
                    } else {
                        keyboardMo134702a.setAlpha(1.0f);
                        bt0.m103753z(bt0.m103743p(keyboardMo134702a, "translationY", 0L, 200L, this.f31958U, t100.m186890d(200.0f), 0.0f)).start();
                    }
                }
            }
            this.f31960W.mo127499a();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: b */
    public View mo48831b(MessageBarActionItemType messageBarActionItemType) {
        if (vwb.m200296J(this.f31971k0)) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= this.f31971k0.size()) {
                i = -1;
                break;
            }
            if (this.f31971k0.get(i).m194573d() == messageBarActionItemType) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.f31977p0.size()) {
            return null;
        }
        return this.f31977p0.get(i);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m49371b0(View view) {
        m49354F0("keyboard_top");
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: c */
    public boolean mo48832c(MessageBarActionItemType messageBarActionItemType) {
        if (vwb.m200296J(this.f31971k0)) {
            return false;
        }
        Iterator<uoy> it = this.f31971k0.iterator();
        while (it.hasNext()) {
            if (it.next().m194573d() == messageBarActionItemType) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m49372c0(Context context, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, View view) {
        o6j0.m162859c("e_heat_increase_remind", ((MessagesAct) context).pageId(), o6j0.C18854a.m162878h("heat_function_name", warmingUpLevel.key));
        C4348d.m20896l().m20900k(this.f31953P);
        m49354F0("keyboard_top");
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: d */
    public boolean mo48833d(MessageBarActionItemType messageBarActionItemType) {
        if (vwb.m200296J(this.f31971k0)) {
            return false;
        }
        for (uoy uoyVar : this.f31971k0) {
            if (uoyVar.m194573d() == messageBarActionItemType) {
                return uoyVar.m194576g();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m49373d0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleX", 1.0f, 1.14f, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleY", 1.0f, 1.14f, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(384L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m49374e0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31979r, (Property<FrameLayout, Integer>) f31935J0, MessageWarmingUpHelper.m49180j(warmingUpLevel), MessageWarmingUpHelper.m49182l(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.m103744q(this.f31980s, "alpha", 0.0f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
        Animator duration = bt0.m103742o(this.f31980s, f31933H0, 14, 0).setDuration(233L);
        duration.addListener(new C8558l(d));
        duration.start();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: f */
    public void mo48835f() {
        int size = this.f31977p0.size();
        for (int i = 0; i < size; i++) {
            MessageBarActionItemView messageBarActionItemView = this.f31977p0.get(i);
            ((uoy) messageBarActionItemView.getTag()).mo98197c(messageBarActionItemView, i, size);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m49375f0() {
        bt0.m103742o(this.f31980s, f31933H0, 0, 14).setDuration(233L).start();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: g */
    public void mo48836g(MessageBarState messageBarState) {
        xdl0.m208329E0(getRecoverMatchView(), null);
        if (messageBarState == MessageBarState.DEFAULT) {
            xdl0.m208344M(getMessageBarRoot(), true);
            xdl0.m208344M(getRecoverMatchView(), false);
            return;
        }
        if (messageBarState == MessageBarState.FAKE_LOCK) {
            xdl0.m208344M(getMessageBarRoot(), false);
            xdl0.m208344M(getRecoverMatchView(), true);
            getRecoverMatchView().setBackgroundResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78746g : c3c0.f78728e);
            getRecoverMatchView().setTextColor(getResources().getColor(a1c0.f67146a0));
            getRecoverMatchView().setText("上传头像后开启聊天");
            xdl0.m208329E0(getRecoverMatchView(), new View.OnClickListener() { // from class: l.hqy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f109164a.m49369Z(view);
                }
            });
            m49353E0();
            return;
        }
        if (messageBarState == MessageBarState.AVATAR_AUDIT) {
            xdl0.m208344M(getMessageBarRoot(), false);
            xdl0.m208344M(getRecoverMatchView(), true);
            getRecoverMatchView().setBackgroundResource(c3c0.f78559K1);
            getRecoverMatchView().setTextColor(getResources().getColor(a1c0.f67146a0));
            getRecoverMatchView().setText("审核通过后即可开启聊天");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m49376g0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31979r, (Property<FrameLayout, Integer>) f31935J0, MessageWarmingUpHelper.m49182l(warmingUpLevel), MessageWarmingUpHelper.m49180j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.m103744q(this.f31980s, "alpha", 1.0f, 0.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public View getActionLayout() {
        return this.f31940E;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public AIChatView getAiChatview() {
        return this.f31951N;
    }

    public LinearLayout getBarMaskLayer() {
        return this.f31965f;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public FrameLayout getBarWrapper() {
        return this.f31978q;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public MessageInputBaseEditView getBar_center_text() {
        return this.f31985x;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public VLinear getBar_center_text_layout() {
        return this.f31984w;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public VText getBlockText() {
        return this.f31939D;
    }

    public RecorderView getCameraFunction() {
        return this.f31937B;
    }

    public View getChangeSizeView() {
        return this.f31970k;
    }

    public ImageView getCloseView() {
        return this.f31947J;
    }

    public TextView getCountDownTimer() {
        return this.f31969j;
    }

    public MessageInputEditRootLayout getEditRootView() {
        return this.f31983v;
    }

    public ImageView getExpandView() {
        return this.f31973m;
    }

    public TextView getFilterNameView() {
        return this.f31967h;
    }

    public FilterScrollMoreViewPager getFilterView() {
        return this.f31968i;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public View getGiftView() {
        if (vwb.m200296J(this.f31971k0)) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= this.f31971k0.size()) {
                i = -1;
                break;
            }
            if (this.f31971k0.get(i).m194573d() == MessageBarActionItemType.GIFT) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.f31977p0.size()) {
            return null;
        }
        return this.f31977p0.get(i);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public KeyboardFrameWithShadowOutside getHidden_slide_out() {
        return this.f31949L;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public View getInputAiView() {
        return this.f31986y;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public View getInputContent() {
        return this.f31975o;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public View getInputRoot() {
        return this.f31982u;
    }

    public ViewGroup getMaskLayer() {
        return this.f31966g;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public View getMessageBarRoot() {
        return this.f31974n;
    }

    public TextView getNoticeBubble() {
        return this.f31944G;
    }

    public TextView getNoticeVideo() {
        return this.f31945H;
    }

    public TextView getRealShotSend() {
        return this.f31938C;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public RecordAnimLayout getRecordLayout() {
        return this.f31942F;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public VButton getRecoverMatchView() {
        return this.f31948K;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public LinearLayout getReferenceView() {
        return this.f31976p;
    }

    public VText getSingleText() {
        return this.f31946I;
    }

    public LinearLayout getSurfaceContainer() {
        return this.f31964e;
    }

    public MessageSurfaceAnimContainer getSurfaceContent() {
        return this.f31963d;
    }

    public FrameLayout getSurfaceViewRooter() {
        return this.f31962c;
    }

    public ImageView getSwitchCameraView() {
        return this.f31972l;
    }

    public View getTempInputLayout() {
        return this.f31979r;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: h */
    public void mo48837h(MessageBarActionItemType messageBarActionItemType, boolean z) {
        int size = this.f31971k0.size();
        for (int i = 0; i < size; i++) {
            uoy uoyVar = this.f31971k0.get(i);
            if (uoyVar.m194573d() == messageBarActionItemType) {
                uoyVar.m194578i(z);
            }
        }
        mo48835f();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m49377h0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(350L);
        animatorSet.start();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: i */
    public void mo48838i(boolean z, boolean z2) {
        if (!z) {
            xdl0.m208344M(this.f31951N, false);
            xdl0.m208344M(this.f31940E, !this.f31956S);
            return;
        }
        if (y19.m212159S() && C4348d.m20896l().m20912x("switchPicBubbleKey")) {
            C4348d.m20896l().m20900k("switchPicBubbleKey");
        }
        xdl0.m208344M(this.f31951N, true);
        xdl0.m208344M(this.f31940E, false);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m49378i0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31979r, (Property<FrameLayout, Integer>) f31935J0, MessageWarmingUpHelper.m49182l(warmingUpLevel), MessageWarmingUpHelper.m49180j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.m103744q(this.f31980s, "alpha", 1.0f, 0.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: j */
    public void mo48839j(boolean z, boolean z2) {
        if (m49366W()) {
            this.f31959V = z;
            VImage vImage = this.f31987z;
            if (!z) {
                vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78476B : c3c0.f78467A);
                xdl0.m208357U(this.f31978q, this.f31956S ? t100.f167260i : t100.m186890d(0.0f));
                xdl0.m208344M(this.f31940E, !this.f31956S);
            } else {
                vImage.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78494D : c3c0.f78485C);
                if (z2) {
                    return;
                }
                xdl0.m208357U(this.f31978q, t100.m186890d(7.0f));
                xdl0.m208344M(this.f31940E, false);
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m49379j0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C8557k(warmingUpLevel));
        animatorSet.setDuration(367L);
        animatorSet.start();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: k */
    public void mo48840k(int i, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final double d) {
        if (i == 1916) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.vqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182684a.m49373d0();
                }
            });
            return;
        }
        if (i == 2233) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.wqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187744a.m49374e0(warmingUpLevel, d);
                }
            });
            return;
        }
        if (i == 5250) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.xqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194060a.m49375f0();
                }
            });
        } else if (i == 5333) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.yqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f199620a.m49376g0(warmingUpLevel);
                }
            });
        } else if (i == 5433) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.zqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204443a.m49377h0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m49380k0() {
        xdl0.m208344M(this.f31979r, false);
        Animator duration = bt0.m103742o(this.f31983v, f31932G0, 0, t100.m186890d(61.0f), t100.m186890d(59.0f)).setDuration(334L);
        duration.addListener(new C8552f());
        duration.start();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    /* JADX INFO: renamed from: l */
    public void mo48841l(int i, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, final double d) {
        if (warmingUpLevel != MessageWarmingUpHelper.WarmingUpLevel.not) {
            if (i == 1916) {
                e51.m114741F(getContext(), new Runnable() { // from class: l.qqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f155948a.m49385p0(warmingUpLevel);
                    }
                });
                return;
            }
            if (i == 2233) {
                e51.m114741F(getContext(), new Runnable() { // from class: l.rqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f160701a.m49386q0(warmingUpLevel, warmingUpLevel2, d);
                    }
                });
                return;
            }
            if (i == 5250) {
                e51.m114741F(getContext(), new Runnable() { // from class: l.sqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f166030a.m49387r0();
                    }
                });
                return;
            } else if (i == 5350) {
                e51.m114741F(getContext(), new Runnable() { // from class: l.tqy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f171647a.m49378i0(warmingUpLevel2);
                    }
                });
                return;
            } else {
                if (i == 5433) {
                    e51.m114741F(getContext(), new Runnable() { // from class: l.jqy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f119334a.m49379j0(warmingUpLevel2);
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (i == 0) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.iqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114567a.m49380k0();
                }
            });
            return;
        }
        if (i == 50) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.kqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124306a.m49381l0(warmingUpLevel2, d);
                }
            });
            return;
        }
        if (i == 3150) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.lqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129448a.m49382m0();
                }
            });
            return;
        }
        if (i == 3250) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.mqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135313a.m49383n0(warmingUpLevel2);
                }
            });
        } else if (i == 3333) {
            e51.m114741F(getContext(), new Runnable() { // from class: l.nqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140124a.m49384o0(warmingUpLevel2);
                }
            });
            e51.m114741F(getContext(), new Runnable() { // from class: l.oqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145208a.m49351C0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m49381l0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31979r, "scaleX", 0.0f, 1.04f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31979r, "scaleY", 0.0f, 1.04f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(466L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.addListener(new C8553g(warmingUpLevel, d));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m49382m0() {
        bt0.m103742o(this.f31980s, f31933H0, 0, t100.m186890d(0.0f), t100.m186890d(14.0f)).setDuration(233L).start();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m49383n0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorM103744q = bt0.m103744q(this.f31980s, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31979r, (Property<FrameLayout, Integer>) f31935J0, MessageWarmingUpHelper.m49182l(warmingUpLevel), MessageWarmingUpHelper.m49180j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        animatorSet.playTogether(animatorM103744q, objectAnimatorOfInt);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m49384o0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C8554h(warmingUpLevel));
        animatorSet.setDuration(350L);
        animatorSet.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49359P();
        m49364U();
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31985x.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31985x.setHintTextColor(getResources().getColor(a1c0.f67155i));
            soe.m185291a(this.f31985x);
            this.f31972l.setImageResource(c3c0.f78894w3);
            this.f31973m.setImageResource(c3c0.f78867t3);
            this.f31937B.setImageResource(c3c0.f78912y3);
            this.f31947J.setImageResource(c3c0.f78858s3);
            this.f31987z.setImageResource(c3c0.f78476B);
            this.f31944G.setBackgroundResource(c3c0.f78532H1);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m49385p0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleX", 1.0f, 1.14f, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f31981t, "scaleY", 1.0f, 1.14f, 0.0f));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C8555i(warmingUpLevel));
        animatorSet.setDuration(367L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m49386q0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f31979r, (Property<FrameLayout, Integer>) f31935J0, MessageWarmingUpHelper.m49180j(warmingUpLevel), MessageWarmingUpHelper.m49182l(warmingUpLevel2));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(bt0.m103744q(this.f31980s, "alpha", 0.0f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
        Animator duration = bt0.m103742o(this.f31980s, f31933H0, 14, 0).setDuration(233L);
        duration.addListener(new C8556j(d));
        duration.start();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m49387r0() {
        bt0.m103742o(this.f31980s, f31933H0, 0, 14).setDuration(233L).start();
    }

    /* JADX INFO: renamed from: s0 */
    public void m49388s0(String str) {
        int size = this.f31971k0.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            uoy uoyVar = this.f31971k0.get(i2);
            if (uoyVar instanceof apy) {
                uoyVar.m194579j(true);
                if (uoyVar instanceof apy) {
                    m49393x0(((apy) uoyVar).m98198l(), i, str);
                    i++;
                }
            } else {
                uoyVar.m194579j(false);
            }
        }
        mo48835f();
    }

    public void setEditTextAndEnsureFocus(String str) {
        getBar_center_text().setText(str);
        getBar_center_text().setFocusable(true);
        getBar_center_text().setFocusableInTouchMode(true);
        getBar_center_text().requestFocus();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public void setGroupStyle(Act act) {
        this.f31943F0 = true;
        m49363T();
        m49349A0();
    }

    /* JADX INFO: renamed from: t0 */
    public void m49389t0(e30 e30Var) {
        this.f31954Q = e30Var;
    }

    /* JADX INFO: renamed from: u0 */
    public void m49390u0() {
        if (NullChecker.m81303a(this.f31951N)) {
            this.f31951N.m49033e();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m49391v0(MessageBarActionItemView messageBarActionItemView) {
        int size = this.f31977p0.size();
        for (int i = 0; i < size; i++) {
            MessageBarActionItemView messageBarActionItemView2 = this.f31977p0.get(i);
            if (messageBarActionItemView2 == messageBarActionItemView) {
                ((uoy) messageBarActionItemView2.getTag()).mo98197c(messageBarActionItemView2, i, size);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m49392w0() {
        Iterator<uoy> it = this.f31971k0.iterator();
        while (it.hasNext()) {
            it.next().m194572b();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m49393x0(OfficialAccountsMenu officialAccountsMenu, int i, String str) {
        zvf0.m220368A("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, vwb.m200311Y("bottom_menu_id", officialAccountsMenu.f20460id), vwb.m200311Y("official_account_id", str), vwb.m200311Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.m200311Y("bottom_menu_y_axis", 0), vwb.m200311Y("bottom_menu_name", officialAccountsMenu.text));
    }

    /* JADX INFO: renamed from: y0 */
    public void m49394y0() {
        xdl0.m208344M(this.f31987z, true);
        this.f31983v.setBackgroundColor(0);
        xdl0.m208321A0(getContext(), this.f31984w, c3c0.f78550J1);
        if (TextUtils.isEmpty(this.f31985x.getText().toString().trim())) {
            xdl0.m208321A0(getContext(), this.f31936A, c3c0.f78550J1);
        } else {
            xdl0.m208321A0(getContext(), this.f31936A, ura.m195053e().m195057d().mo33699I4() ? c3c0.f78577M1 : c3c0.f78568L1);
        }
        xdl0.m208370d0(this.f31936A, t100.m186890d(14.0f));
        xdl0.m208372e0(this.f31936A, t100.m186890d(14.0f));
        xdl0.m208358V(this.f31936A, t100.m186890d(8.0f));
        xdl0.m208329E0(this.f31987z, new View.OnClickListener() { // from class: l.eqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92866a.m49370a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public void m49395z0() {
        xdl0.m208344M(this.f31987z, false);
        xdl0.m208321A0(getContext(), this.f31983v, c3c0.f78550J1);
        xdl0.m208323B0(this.f31984w, null);
        xdl0.m208323B0(this.f31936A, null);
        xdl0.m208370d0(this.f31936A, t100.m186890d(4.0f));
        xdl0.m208372e0(this.f31936A, t100.m186890d(16.0f));
        xdl0.m208358V(this.f31936A, t100.m186890d(0.0f));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.MessageBar
    public VText getBar_send() {
        return this.f31936A;
    }

    public MessageBarOpt(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31952O = "";
        this.f31953P = "";
        this.f31955R = false;
        this.f31956S = false;
        this.f31957T = false;
        this.f31958U = new AccelerateInterpolator();
        this.f31959V = false;
        this.f31943F0 = false;
    }

    public MessageBarOpt(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31952O = "";
        this.f31953P = "";
        this.f31955R = false;
        this.f31956S = false;
        this.f31957T = false;
        this.f31958U = new AccelerateInterpolator();
        this.f31959V = false;
        this.f31943F0 = false;
    }
}
