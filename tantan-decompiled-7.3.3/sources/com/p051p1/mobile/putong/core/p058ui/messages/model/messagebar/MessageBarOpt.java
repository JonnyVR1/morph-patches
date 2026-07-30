package com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import com.p051p1.mobile.putong.core.p058ui.messages.KeyboardFrameWithShadowOutside;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.aichat.AIChatView;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.RecorderView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.p051p1.mobile.putong.core.p058ui.messages.model.record.view.RecordAnimLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageBarRootLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputEditRootLayout;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.b9c0;
import p153l.bnl0;
import p153l.dyy;
import p153l.edc0;
import p153l.g9c0;
import p153l.gt0;
import p153l.gta;
import p153l.h39;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.p9r;
import p153l.qa00;
import p153l.qec0;
import p153l.rxy;
import p153l.sfj0;
import p153l.uxy;
import p153l.wpe;
import p153l.xxy;
import p153l.y20;
import p153l.zfm;
import p153l.zzy;

/* JADX INFO: loaded from: classes4.dex */
public class MessageBarOpt extends MessageBar {

    /* JADX INFO: renamed from: G0 */
    public static final Property<View, Integer> f32780G0;

    /* JADX INFO: renamed from: H0 */
    public static final Property<View, Integer> f32781H0;

    /* JADX INFO: renamed from: I0 */
    public static final Property<View, Integer> f32782I0;

    /* JADX INFO: renamed from: J0 */
    public static final Property<View, Integer> f32783J0;

    /* JADX INFO: renamed from: A */
    public VText f32784A;

    /* JADX INFO: renamed from: B */
    public RecorderView f32785B;

    /* JADX INFO: renamed from: C */
    public TextView f32786C;

    /* JADX INFO: renamed from: D */
    public VText f32787D;

    /* JADX INFO: renamed from: E */
    public FrameLayout f32788E;

    /* JADX INFO: renamed from: E0 */
    public LinearLayout f32789E0;

    /* JADX INFO: renamed from: F */
    public RecordAnimLayout f32790F;

    /* JADX INFO: renamed from: F0 */
    public boolean f32791F0;

    /* JADX INFO: renamed from: G */
    public TextView f32792G;

    /* JADX INFO: renamed from: H */
    public TextView f32793H;

    /* JADX INFO: renamed from: I */
    public VText f32794I;

    /* JADX INFO: renamed from: J */
    public ImageView f32795J;

    /* JADX INFO: renamed from: K */
    public VButton f32796K;

    /* JADX INFO: renamed from: L */
    public KeyboardFrameWithShadowOutside f32797L;

    /* JADX INFO: renamed from: M */
    public ViewStub f32798M;

    /* JADX INFO: renamed from: N */
    public AIChatView f32799N;

    /* JADX INFO: renamed from: O */
    public String f32800O;

    /* JADX INFO: renamed from: P */
    public String f32801P;

    /* JADX INFO: renamed from: Q */
    public y20 f32802Q;

    /* JADX INFO: renamed from: R */
    public boolean f32803R;

    /* JADX INFO: renamed from: S */
    public boolean f32804S;

    /* JADX INFO: renamed from: T */
    public boolean f32805T;

    /* JADX INFO: renamed from: U */
    public AccelerateInterpolator f32806U;

    /* JADX INFO: renamed from: V */
    public boolean f32807V;

    /* JADX INFO: renamed from: W */
    public dyy f32808W;

    /* JADX INFO: renamed from: b */
    public MessageBarOpt f32809b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f32810c;

    /* JADX INFO: renamed from: d */
    public MessageSurfaceAnimContainer f32811d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f32812e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f32813f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f32814g;

    /* JADX INFO: renamed from: h */
    public TextView f32815h;

    /* JADX INFO: renamed from: i */
    public FilterScrollMoreViewPager f32816i;

    /* JADX INFO: renamed from: j */
    public TextView f32817j;

    /* JADX INFO: renamed from: k */
    public View f32818k;

    /* JADX INFO: renamed from: k0 */
    public List<rxy> f32819k0;

    /* JADX INFO: renamed from: l */
    public ImageView f32820l;

    /* JADX INFO: renamed from: m */
    public ImageView f32821m;

    /* JADX INFO: renamed from: n */
    public MessageBarRootLayout f32822n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f32823o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f32824p;

    /* JADX INFO: renamed from: p0 */
    public List<MessageBarActionItemView> f32825p0;

    /* JADX INFO: renamed from: q */
    public FrameLayout f32826q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f32827r;

    /* JADX INFO: renamed from: s */
    public VText f32828s;

    /* JADX INFO: renamed from: t */
    public View f32829t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f32830u;

    /* JADX INFO: renamed from: v */
    public MessageInputEditRootLayout f32831v;

    /* JADX INFO: renamed from: w */
    public VLinear f32832w;

    /* JADX INFO: renamed from: x */
    public VEditTextEmojiCompat f32833x;

    /* JADX INFO: renamed from: y */
    public SVGAnimationView f32834y;

    /* JADX INFO: renamed from: z */
    public VImage f32835z;

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
    public class C8710a extends Property<View, Integer> {
        public C8710a(Class cls, String str) {
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
    public class C8711b extends Property<View, Integer> {
        public C8711b(Class cls, String str) {
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
    public class C8712c extends Property<View, Integer> {
        public C8712c(Class cls, String str) {
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
            zfm.m219546b(view, num.intValue(), qa00.f156322i, -1, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$d */
    public class ViewOnLongClickListenerC8713d implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dyy f32836a;

        public ViewOnLongClickListenerC8713d(dyy dyyVar) {
            this.f32836a = dyyVar;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            rxy rxyVar = (rxy) view.getTag();
            if (NullChecker.m82486a(this.f32836a) && NullChecker.m82486a(rxyVar)) {
                this.f32836a.mo114005b(rxyVar, view, true);
            }
            return !rxyVar.m183574e(2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$e */
    public class C8714e implements TextWatcher {
        public C8714e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!MessageBarOpt.this.m50549W()) {
                boolean zIsEmpty = TextUtils.isEmpty(editable.toString().trim());
                MessageBarOpt messageBarOpt = MessageBarOpt.this;
                if (zIsEmpty) {
                    messageBarOpt.f32784A.setTextColor(messageBarOpt.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102784B));
                    return;
                } else {
                    messageBarOpt.f32784A.setTextColor(messageBarOpt.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102785C));
                    return;
                }
            }
            boolean zIsEmpty2 = TextUtils.isEmpty(editable.toString().trim());
            MessageBarOpt messageBarOpt2 = MessageBarOpt.this;
            if (zIsEmpty2) {
                messageBarOpt2.f32784A.setTextColor(messageBarOpt2.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102784B));
                bnl0.m105501A0(MessageBarOpt.this.getContext(), MessageBarOpt.this.f32784A, ibc0.f113825J1);
            } else {
                messageBarOpt2.f32784A.setTextColor(messageBarOpt2.getResources().getColor(g9c0.f102783A));
                bnl0.m105501A0(MessageBarOpt.this.getContext(), MessageBarOpt.this.f32784A, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113852M1 : ibc0.f113843L1);
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
    public class C8715f extends gt0.C17308j {
        public C8715f() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) MessageBarOpt.this.f32831v.getLayoutParams();
            marginLayoutParams.leftMargin = qa00.m175859d(59.0f);
            MessageBarOpt.this.f32831v.setLayoutParams(marginLayoutParams);
            MessageBarOpt.this.f32827r.setClickable(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$g */
    public class C8716g extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f32840a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ double f32841b;

        public C8716g(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
            this.f32840a = warmingUpLevel;
            this.f32841b = d;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bnl0.m105524M(MessageBarOpt.this.f32827r, true);
            zfm.m219546b(MessageBarOpt.this.f32827r, MessageWarmingUpHelper.m50365l(this.f32840a), qa00.f156322i, -1, 0, 0, 0);
            bnl0.m105524M(MessageBarOpt.this.f32828s, true);
            bnl0.m105524M(MessageBarOpt.this.f32829t, false);
            MessageBarOpt.this.f32828s.setText(MessageWarmingUpHelper.m50355b(this.f32841b) + "°C");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$h */
    public class C8717h extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f32843a;

        public C8717h(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f32843a = warmingUpLevel;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            MessageBarOpt.this.f32829t.setBackgroundResource(MessageWarmingUpHelper.m50364k(this.f32843a));
            bnl0.m105525M0(MessageBarOpt.this.f32829t, true);
            sfj0.m185601h("e_heat_entrance", ((MessagesAct) MessageBarOpt.this.getContext()).pageId(), new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$i */
    public class C8718i extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f32845a;

        public C8718i(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f32845a = warmingUpLevel;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f32829t.setBackgroundResource(MessageWarmingUpHelper.m50364k(this.f32845a));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$j */
    public class C8719j extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f32847a;

        public C8719j(double d) {
            this.f32847a = d;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f32828s.setText(MessageWarmingUpHelper.m50355b(this.f32847a) + "°C");
            bnl0.m105524M(MessageBarOpt.this.f32828s, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$k */
    public class C8720k extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f32849a;

        public C8720k(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f32849a = warmingUpLevel;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f32829t.setBackgroundResource(MessageWarmingUpHelper.m50364k(this.f32849a));
            MessageBarOpt.this.m50535D0(this.f32849a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$l */
    public class C8721l extends gt0.C17308j {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ double f32851a;

        public C8721l(double d) {
            this.f32851a = d;
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            MessageBarOpt.this.f32828s.setText(MessageWarmingUpHelper.m50355b(this.f32851a) + "°C");
            bnl0.m105524M(MessageBarOpt.this.f32828s, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.messagebar.MessageBarOpt$m */
    public class C8722m extends Property<View, Integer> {
        public C8722m(Class cls, String str) {
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
        f32780G0 = new C8722m(cls, "marginLeft");
        f32781H0 = new C8710a(cls, "marginTop");
        f32782I0 = new C8711b(cls, "marginBottom");
        f32783J0 = new C8712c(cls, "backgroundColor");
    }

    public MessageBarOpt(Context context) {
        super(context);
        this.f32800O = "";
        this.f32801P = "";
        this.f32803R = false;
        this.f32804S = false;
        this.f32805T = false;
        this.f32806U = new AccelerateInterpolator();
        this.f32807V = false;
        this.f32791F0 = false;
    }

    private String getSafeSourceFrom() {
        if (!(getContext() instanceof MessagesAct)) {
            return "";
        }
        Conversation conversationM110994j3 = ((MessagesAct) getContext()).f32488f.m110994j3();
        if (!NullChecker.m82486a(conversationM110994j3)) {
            return "";
        }
        if (conversationM110994j3.isFakeHeartbeatConv()) {
            return "love_signal";
        }
        return conversationM110994j3.isFakeQuickChatConv() ? "quickchat" : "";
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m50526u(dyy dyyVar, View view) {
        rxy rxyVar = (rxy) view.getTag();
        if (NullChecker.m82486a(dyyVar) && NullChecker.m82486a(rxyVar)) {
            dyyVar.mo114005b(rxyVar, view, false);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m50532A0() {
        if (m50549W()) {
            m50533B0(MessageBarActionItemType.EMOJI, false);
        } else {
            m50533B0(MessageBarActionItemType.EMOJI, true);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m50533B0(MessageBarActionItemType messageBarActionItemType, boolean z) {
        int size = this.f32819k0.size();
        for (int i = 0; i < size; i++) {
            rxy rxyVar = this.f32819k0.get(i);
            if (rxyVar.m183573d() == messageBarActionItemType) {
                rxyVar.m183579j(z);
                rxyVar.m183580k(z);
            }
        }
        mo50018f();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m50534C0() {
        if (!CoreModule.f18264c.f20384f0.f20680g1.get().booleanValue() || CoreModule.f18264c.f20381e0.f89324s2.get().booleanValue()) {
            Context context = getContext();
            if (context instanceof MessagesAct) {
                MessagesAct messagesAct = (MessagesAct) context;
                messagesAct.mo50158l().m111048t7().m178921V1();
                sfj0.m185601h("e_heat_entrance_bubble", messagesAct.pageId(), new sfj0.C20032a[0]);
            }
            CoreModule.f18264c.f20384f0.f20680g1.put(Boolean.TRUE);
            TextView textView = new TextView(getContext());
            textView.setText("用温度记录你们的聊天时光。随着温\n度的升高，可解锁更多亲密功能");
            textView.setPadding(qa00.m175859d(16.0f), qa00.m175859d(10.0f), qa00.m175859d(16.0f), qa00.m175859d(10.0f));
            textView.setTextSize(13.0f);
            textView.getPaint().setFakeBoldText(true);
            textView.setTextColor(-1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.rzy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165641a.m50554b0(view);
                }
            });
            C4496a c4496a = new C4496a(getContext());
            C4496a c4496aM21882y = c4496a.m21876s(textView).m21873p(75).m21863e(true).m21882y(true);
            int i = qa00.f156322i;
            c4496aM21882y.m21883z(i).m21860b(3000L).m21881x(-i).m21872o(C4496a.f16400O, qa00.f156320g).m21874q(C4496a.f16402Q | C4496a.f16400O);
            c4496a.m21869k(getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : b9c0.f75562h));
            this.f32800O = C4499d.m21895l().m21907t(c4496a, this.f32827r);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m50535D0(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (C4499d.m21895l().m21911x(this.f32801P)) {
            return;
        }
        final Context context = getContext();
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            messagesAct.mo50158l().m111048t7().m178921V1();
            sfj0.m185601h("e_heat_increase_remind", messagesAct.pageId(), sfj0.C20032a.m185615h("heat_function_name", warmingUpLevel.key));
            View viewInflate = p9r.m171370a(getContext()).inflate(qec0.f156870I2, (ViewGroup) null);
            ((ImageView) viewInflate.findViewById(edc0.f93394k1)).setImageResource(MessageWarmingUpHelper.m50373t(warmingUpLevel));
            TextView textView = (TextView) viewInflate.findViewById(edc0.f93267Q4);
            textView.getPaint().setFakeBoldText(true);
            textView.setText(MessageWarmingUpHelper.m50374u(warmingUpLevel));
            ((TextView) viewInflate.findViewById(edc0.f93316Z)).setText(MessageWarmingUpHelper.m50372s(warmingUpLevel));
            TextView textView2 = (TextView) viewInflate.findViewById(edc0.f93170B);
            textView2.getPaint().setFakeBoldText(true);
            textView2.setTextColor(MessageWarmingUpHelper.m50365l(warmingUpLevel));
            bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.xzy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196932a.m50555c0(context, warmingUpLevel, view);
                }
            });
            C4496a c4496a = new C4496a(getContext());
            C4496a c4496aM21860b = c4496a.m21876s(viewInflate).m21873p(75).m21863e(true).m21882y(true).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
            int i = qa00.f156322i;
            c4496aM21860b.m21883z(i).m21874q(C4496a.f16402Q | C4496a.f16400O).m21881x(-i).m21872o(C4496a.f16400O, i).m21880w(qa00.f156326m).m21869k(MessageWarmingUpHelper.m50363j(warmingUpLevel));
            this.f32801P = C4499d.m21895l().m21907t(c4496a, this.f32827r);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m50536E0() {
        if (this.f32803R) {
            return;
        }
        this.f32803R = true;
        sfj0.m185601h("e_im_fake_to_good", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("source_from", getSafeSourceFrom()));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m50537F0(String str) {
        if (NullChecker.m82486a(this.f32802Q)) {
            this.f32802Q.call(str);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m50538L(View view) {
        zzy.m222292a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public ViewGroup m50539M() {
        return this.f32789E0;
    }

    /* JADX INFO: renamed from: N */
    public void m50540N() {
        Iterator<rxy> it = this.f32819k0.iterator();
        while (it.hasNext()) {
            it.next().m183571a(2);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m50541O() {
        int size = this.f32819k0.size();
        for (int i = 0; i < size; i++) {
            rxy rxyVar = this.f32819k0.get(i);
            if (rxyVar instanceof xxy) {
                rxyVar.m183579j(false);
            } else {
                rxyVar.m183579j(true);
            }
        }
        mo50018f();
    }

    /* JADX INFO: renamed from: P */
    public void m50542P() {
        m50538L(this);
    }

    /* JADX INFO: renamed from: Q */
    public void m50543Q(boolean z) {
        this.f32804S = z;
        bnl0.m105524M(this.f32788E, !z);
        boolean z2 = this.f32804S;
        FrameLayout frameLayout = this.f32826q;
        if (z2) {
            bnl0.m105537U(frameLayout, qa00.f156322i);
        } else {
            bnl0.m105537U(frameLayout, 0);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m50544R() {
        bnl0.m105524M(this.f32827r, false);
    }

    /* JADX INFO: renamed from: S */
    public void m50545S(List<rxy> list, final dyy dyyVar) {
        this.f32819k0 = list;
        this.f32808W = dyyVar;
        this.f32825p0 = new ArrayList();
        this.f32789E0 = new LinearLayout(getContext());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        this.f32789E0.setLayoutTransition(layoutTransition);
        this.f32788E.addView(this.f32789E0, new FrameLayout.LayoutParams(-1, -1));
        if (jyb.m147479J(list)) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rxy rxyVar = list.get(i);
            MessageBarActionItemView messageBarActionItemViewM198552c = uxy.m198552c(rxyVar, getContext(), i, size);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f32789E0.addView(messageBarActionItemViewM198552c, layoutParams);
            this.f32825p0.add(messageBarActionItemViewM198552c);
            messageBarActionItemViewM198552c.setTag(rxyVar);
            bnl0.m105509E0(messageBarActionItemViewM198552c, new View.OnClickListener() { // from class: l.yzy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageBarOpt.m50526u(dyyVar, view);
                }
            });
            if (rxyVar.m183575f()) {
                messageBarActionItemViewM198552c.setOnLongClickListener(new ViewOnLongClickListenerC8713d(dyyVar));
            }
        }
        m50532A0();
    }

    /* JADX INFO: renamed from: T */
    public void m50546T() {
        if (!m50549W()) {
            m50578z0();
            return;
        }
        m50577y0();
        if (this.f32805T) {
            return;
        }
        this.f32805T = true;
        sfj0.m185601h("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_emoji_entrance", "emoji"));
    }

    /* JADX INFO: renamed from: U */
    public final void m50547U() {
        bnl0.m105509E0(this.f32787D, new View.OnClickListener() { // from class: l.mzy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139575a.m50550X(view);
            }
        });
        this.f32784A.getPaint().setFakeBoldText(true);
        this.f32833x.addTextChangedListener(new C8714e());
        m50546T();
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32796K.setBackgroundResource(ibc0.f114021g);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m50548V(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        this.f32829t.setPivotX(qa00.m175859d(15.0f));
        this.f32829t.setPivotY(qa00.m175859d(30.0f));
        this.f32827r.setPivotX(qa00.m175859d(25.5f));
        this.f32827r.setPivotY(qa00.m175859d(21.0f));
        this.f32809b.setBackgroundResource(0);
        bnl0.m105509E0(this.f32827r, new View.OnClickListener() { // from class: l.czy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84506a.m50551Y(view);
            }
        });
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2 = MessageWarmingUpHelper.WarmingUpLevel.not;
        FrameLayout frameLayout = this.f32827r;
        if (warmingUpLevel == warmingUpLevel2) {
            bnl0.m105524M(frameLayout, false);
            return;
        }
        bnl0.m105524M(frameLayout, true);
        bnl0.m105524M(this.f32829t, true);
        sfj0.m185601h("e_heat_entrance", ((MessagesAct) getContext()).pageId(), new sfj0.C20032a[0]);
        bnl0.m105524M(this.f32828s, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32831v.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.m175859d(59.0f);
        this.f32831v.setLayoutParams(marginLayoutParams);
        zfm.m219546b(this.f32827r, MessageWarmingUpHelper.m50363j(warmingUpLevel), qa00.f156322i, -1, 0, 0, 0);
        this.f32829t.setBackgroundResource(MessageWarmingUpHelper.m50364k(warmingUpLevel));
    }

    /* JADX INFO: renamed from: W */
    public boolean m50549W() {
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m50550X(View view) {
        if (NullChecker.m82486a(this.f32808W)) {
            this.f32808W.mo114008c(MessageBarActionItemType.BLOCK);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m50551Y(View view) {
        sfj0.m185596c("e_heat_entrance", ((MessagesAct) getContext()).pageId(), new sfj0.C20032a[0]);
        if (!TextUtils.isEmpty(this.f32800O)) {
            C4499d.m21895l().m21899k(this.f32800O);
        }
        if (!TextUtils.isEmpty(this.f32801P)) {
            C4499d.m21895l().m21899k(this.f32801P);
        }
        m50537F0("keyboard_left");
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m50552Z(View view) {
        sfj0.m185596c("e_im_fake_to_good", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("source_from", getSafeSourceFrom()));
        CoreModule.m30933P().m143412i().mo180310D1((Act) bnl0.m105508E(this));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: a */
    public void mo50013a() {
        Iterator<rxy> it = this.f32819k0.iterator();
        while (it.hasNext()) {
            it.next().m183578i(false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m50553a0(View view) {
        if (NullChecker.m82486a(this.f32808W)) {
            Context context = getContext();
            if (context instanceof MessagesAct) {
                final Keyboard keyboardMo125457a = ((MessagesAct) context).mo50155d0().m143374g0().mo125457a();
                if (NullChecker.m82486a(keyboardMo125457a)) {
                    if (this.f32807V) {
                        keyboardMo125457a.setAlpha(0.0f);
                        l51.m152888H(context, new Runnable() { // from class: l.dzy
                            @Override // java.lang.Runnable
                            public final void run() {
                                keyboardMo125457a.setAlpha(1.0f);
                            }
                        }, 300L);
                    } else {
                        keyboardMo125457a.setAlpha(1.0f);
                        gt0.m132180z(gt0.m132170p(keyboardMo125457a, "translationY", 0L, 200L, this.f32806U, qa00.m175859d(200.0f), 0.0f)).start();
                    }
                }
            }
            this.f32808W.mo114001a();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: b */
    public View mo50014b(MessageBarActionItemType messageBarActionItemType) {
        if (jyb.m147479J(this.f32819k0)) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= this.f32819k0.size()) {
                i = -1;
                break;
            }
            if (this.f32819k0.get(i).m183573d() == messageBarActionItemType) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.f32825p0.size()) {
            return null;
        }
        return this.f32825p0.get(i);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m50554b0(View view) {
        m50537F0("keyboard_top");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: c */
    public boolean mo50015c(MessageBarActionItemType messageBarActionItemType) {
        if (jyb.m147479J(this.f32819k0)) {
            return false;
        }
        Iterator<rxy> it = this.f32819k0.iterator();
        while (it.hasNext()) {
            if (it.next().m183573d() == messageBarActionItemType) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m50555c0(Context context, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, View view) {
        sfj0.m185596c("e_heat_increase_remind", ((MessagesAct) context).pageId(), sfj0.C20032a.m185615h("heat_function_name", warmingUpLevel.key));
        C4499d.m21895l().m21899k(this.f32801P);
        m50537F0("keyboard_top");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: d */
    public boolean mo50016d(MessageBarActionItemType messageBarActionItemType) {
        if (jyb.m147479J(this.f32819k0)) {
            return false;
        }
        for (rxy rxyVar : this.f32819k0) {
            if (rxyVar.m183573d() == messageBarActionItemType) {
                return rxyVar.m183576g();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m50556d0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleX", 1.0f, 1.14f, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleY", 1.0f, 1.14f, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(384L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m50557e0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f32827r, (Property<FrameLayout, Integer>) f32783J0, MessageWarmingUpHelper.m50363j(warmingUpLevel), MessageWarmingUpHelper.m50365l(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(gt0.m132171q(this.f32828s, "alpha", 0.0f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
        Animator duration = gt0.m132169o(this.f32828s, f32781H0, 14, 0).setDuration(233L);
        duration.addListener(new C8721l(d));
        duration.start();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: f */
    public void mo50018f() {
        int size = this.f32825p0.size();
        for (int i = 0; i < size; i++) {
            MessageBarActionItemView messageBarActionItemView = this.f32825p0.get(i);
            ((rxy) messageBarActionItemView.getTag()).mo100971c(messageBarActionItemView, i, size);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m50558f0() {
        gt0.m132169o(this.f32828s, f32781H0, 0, 14).setDuration(233L).start();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: g */
    public void mo50019g(MessageBarState messageBarState) {
        bnl0.m105509E0(getRecoverMatchView(), null);
        if (messageBarState == MessageBarState.DEFAULT) {
            bnl0.m105524M(getMessageBarRoot(), true);
            bnl0.m105524M(getRecoverMatchView(), false);
            return;
        }
        if (messageBarState == MessageBarState.FAKE_LOCK) {
            bnl0.m105524M(getMessageBarRoot(), false);
            bnl0.m105524M(getRecoverMatchView(), true);
            getRecoverMatchView().setBackgroundResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114021g : ibc0.f114003e);
            getRecoverMatchView().setTextColor(getResources().getColor(g9c0.f102810a0));
            getRecoverMatchView().setText("上传头像后开启聊天");
            bnl0.m105509E0(getRecoverMatchView(), new View.OnClickListener() { // from class: l.ezy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96634a.m50552Z(view);
                }
            });
            m50536E0();
            return;
        }
        if (messageBarState == MessageBarState.AVATAR_AUDIT) {
            bnl0.m105524M(getMessageBarRoot(), false);
            bnl0.m105524M(getRecoverMatchView(), true);
            getRecoverMatchView().setBackgroundResource(ibc0.f113834K1);
            getRecoverMatchView().setTextColor(getResources().getColor(g9c0.f102810a0));
            getRecoverMatchView().setText("审核通过后即可开启聊天");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m50559g0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f32827r, (Property<FrameLayout, Integer>) f32783J0, MessageWarmingUpHelper.m50365l(warmingUpLevel), MessageWarmingUpHelper.m50363j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(gt0.m132171q(this.f32828s, "alpha", 1.0f, 0.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public View getActionLayout() {
        return this.f32788E;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public AIChatView getAiChatview() {
        return this.f32799N;
    }

    public LinearLayout getBarMaskLayer() {
        return this.f32813f;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public FrameLayout getBarWrapper() {
        return this.f32826q;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public MessageInputBaseEditView getBar_center_text() {
        return this.f32833x;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public VLinear getBar_center_text_layout() {
        return this.f32832w;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public VText getBlockText() {
        return this.f32787D;
    }

    public RecorderView getCameraFunction() {
        return this.f32785B;
    }

    public View getChangeSizeView() {
        return this.f32818k;
    }

    public ImageView getCloseView() {
        return this.f32795J;
    }

    public TextView getCountDownTimer() {
        return this.f32817j;
    }

    public MessageInputEditRootLayout getEditRootView() {
        return this.f32831v;
    }

    public ImageView getExpandView() {
        return this.f32821m;
    }

    public TextView getFilterNameView() {
        return this.f32815h;
    }

    public FilterScrollMoreViewPager getFilterView() {
        return this.f32816i;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public View getGiftView() {
        if (jyb.m147479J(this.f32819k0)) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= this.f32819k0.size()) {
                i = -1;
                break;
            }
            if (this.f32819k0.get(i).m183573d() == MessageBarActionItemType.GIFT) {
                break;
            }
            i++;
        }
        if (i < 0 || i >= this.f32825p0.size()) {
            return null;
        }
        return this.f32825p0.get(i);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public KeyboardFrameWithShadowOutside getHidden_slide_out() {
        return this.f32797L;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public View getInputAiView() {
        return this.f32834y;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public View getInputContent() {
        return this.f32823o;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public View getInputRoot() {
        return this.f32830u;
    }

    public ViewGroup getMaskLayer() {
        return this.f32814g;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public View getMessageBarRoot() {
        return this.f32822n;
    }

    public TextView getNoticeBubble() {
        return this.f32792G;
    }

    public TextView getNoticeVideo() {
        return this.f32793H;
    }

    public TextView getRealShotSend() {
        return this.f32786C;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public RecordAnimLayout getRecordLayout() {
        return this.f32790F;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public VButton getRecoverMatchView() {
        return this.f32796K;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public LinearLayout getReferenceView() {
        return this.f32824p;
    }

    public VText getSingleText() {
        return this.f32794I;
    }

    public LinearLayout getSurfaceContainer() {
        return this.f32812e;
    }

    public MessageSurfaceAnimContainer getSurfaceContent() {
        return this.f32811d;
    }

    public FrameLayout getSurfaceViewRooter() {
        return this.f32810c;
    }

    public ImageView getSwitchCameraView() {
        return this.f32820l;
    }

    public View getTempInputLayout() {
        return this.f32827r;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: h */
    public void mo50020h(MessageBarActionItemType messageBarActionItemType, boolean z) {
        int size = this.f32819k0.size();
        for (int i = 0; i < size; i++) {
            rxy rxyVar = this.f32819k0.get(i);
            if (rxyVar.m183573d() == messageBarActionItemType) {
                rxyVar.m183578i(z);
            }
        }
        mo50018f();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m50560h0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(350L);
        animatorSet.start();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: i */
    public void mo50021i(boolean z, boolean z2) {
        if (!z) {
            bnl0.m105524M(this.f32799N, false);
            bnl0.m105524M(this.f32788E, !this.f32804S);
            return;
        }
        if (h39.m133430S() && C4499d.m21895l().m21911x("switchPicBubbleKey")) {
            C4499d.m21895l().m21899k("switchPicBubbleKey");
        }
        bnl0.m105524M(this.f32799N, true);
        bnl0.m105524M(this.f32788E, false);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m50561i0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f32827r, (Property<FrameLayout, Integer>) f32783J0, MessageWarmingUpHelper.m50365l(warmingUpLevel), MessageWarmingUpHelper.m50363j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(gt0.m132171q(this.f32828s, "alpha", 1.0f, 0.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: j */
    public void mo50022j(boolean z, boolean z2) {
        if (m50549W()) {
            this.f32807V = z;
            VImage vImage = this.f32835z;
            if (!z) {
                vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113751B : ibc0.f113742A);
                bnl0.m105537U(this.f32826q, this.f32804S ? qa00.f156322i : qa00.m175859d(0.0f));
                bnl0.m105524M(this.f32788E, !this.f32804S);
            } else {
                vImage.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113769D : ibc0.f113760C);
                if (z2) {
                    return;
                }
                bnl0.m105537U(this.f32826q, qa00.m175859d(7.0f));
                bnl0.m105524M(this.f32788E, false);
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m50562j0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C8720k(warmingUpLevel));
        animatorSet.setDuration(367L);
        animatorSet.start();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: k */
    public void mo50023k(int i, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final double d) {
        if (i == 1916) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.szy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171436a.m50556d0();
                }
            });
            return;
        }
        if (i == 2233) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.tzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176834a.m50557e0(warmingUpLevel, d);
                }
            });
            return;
        }
        if (i == 5250) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.uzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181825a.m50558f0();
                }
            });
        } else if (i == 5333) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.vzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f186519a.m50559g0(warmingUpLevel);
                }
            });
        } else if (i == 5433) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.wzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191849a.m50560h0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m50563k0() {
        bnl0.m105524M(this.f32827r, false);
        Animator duration = gt0.m132169o(this.f32831v, f32780G0, 0, qa00.m175859d(61.0f), qa00.m175859d(59.0f)).setDuration(334L);
        duration.addListener(new C8715f());
        duration.start();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    /* JADX INFO: renamed from: l */
    public void mo50024l(int i, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, final double d) {
        if (warmingUpLevel != MessageWarmingUpHelper.WarmingUpLevel.not) {
            if (i == 1916) {
                l51.m152886F(getContext(), new Runnable() { // from class: l.nzy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144479a.m50568p0(warmingUpLevel);
                    }
                });
                return;
            }
            if (i == 2233) {
                l51.m152886F(getContext(), new Runnable() { // from class: l.ozy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f149976a.m50569q0(warmingUpLevel, warmingUpLevel2, d);
                    }
                });
                return;
            }
            if (i == 5250) {
                l51.m152886F(getContext(), new Runnable() { // from class: l.pzy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f154988a.m50570r0();
                    }
                });
                return;
            } else if (i == 5350) {
                l51.m152886F(getContext(), new Runnable() { // from class: l.qzy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f160312a.m50561i0(warmingUpLevel2);
                    }
                });
                return;
            } else {
                if (i == 5433) {
                    l51.m152886F(getContext(), new Runnable() { // from class: l.gzy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f107251a.m50562j0(warmingUpLevel2);
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (i == 0) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.fzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101561a.m50563k0();
                }
            });
            return;
        }
        if (i == 50) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.hzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112313a.m50564l0(warmingUpLevel2, d);
                }
            });
            return;
        }
        if (i == 3150) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.izy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117767a.m50565m0();
                }
            });
            return;
        }
        if (i == 3250) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.jzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123342a.m50566n0(warmingUpLevel2);
                }
            });
        } else if (i == 3333) {
            l51.m152886F(getContext(), new Runnable() { // from class: l.kzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129474a.m50567o0(warmingUpLevel2);
                }
            });
            l51.m152886F(getContext(), new Runnable() { // from class: l.lzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134284a.m50534C0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m50564l0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f32827r, "scaleX", 0.0f, 1.04f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32827r, "scaleY", 0.0f, 1.04f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(466L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.addListener(new C8716g(warmingUpLevel, d));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m50565m0() {
        gt0.m132169o(this.f32828s, f32781H0, 0, qa00.m175859d(0.0f), qa00.m175859d(14.0f)).setDuration(233L).start();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m50566n0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorM132171q = gt0.m132171q(this.f32828s, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f32827r, (Property<FrameLayout, Integer>) f32783J0, MessageWarmingUpHelper.m50365l(warmingUpLevel), MessageWarmingUpHelper.m50363j(warmingUpLevel));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        animatorSet.playTogether(animatorM132171q, objectAnimatorOfInt);
        animatorSet.setDuration(133L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m50567o0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleX", 0.0f, 1.07f, 0.98f, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleY", 0.0f, 1.07f, 0.98f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C8717h(warmingUpLevel));
        animatorSet.setDuration(350L);
        animatorSet.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50542P();
        m50547U();
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32833x.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32833x.setHintTextColor(getResources().getColor(g9c0.f102819i));
            wpe.m207454a(this.f32833x);
            this.f32820l.setImageResource(ibc0.f114169w3);
            this.f32821m.setImageResource(ibc0.f114142t3);
            this.f32785B.setImageResource(ibc0.f114187y3);
            this.f32795J.setImageResource(ibc0.f114133s3);
            this.f32835z.setImageResource(ibc0.f113751B);
            this.f32792G.setBackgroundResource(ibc0.f113807H1);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m50568p0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleX", 1.0f, 1.14f, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.f32829t, "scaleY", 1.0f, 1.14f, 0.0f));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C8718i(warmingUpLevel));
        animatorSet.setDuration(367L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m50569q0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, double d) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f32827r, (Property<FrameLayout, Integer>) f32783J0, MessageWarmingUpHelper.m50363j(warmingUpLevel), MessageWarmingUpHelper.m50365l(warmingUpLevel2));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        arrayList.add(gt0.m132171q(this.f32828s, "alpha", 0.0f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(133L);
        animatorSet.start();
        Animator duration = gt0.m132169o(this.f32828s, f32781H0, 14, 0).setDuration(233L);
        duration.addListener(new C8719j(d));
        duration.start();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m50570r0() {
        gt0.m132169o(this.f32828s, f32781H0, 0, 14).setDuration(233L).start();
    }

    /* JADX INFO: renamed from: s0 */
    public void m50571s0(String str) {
        int size = this.f32819k0.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            rxy rxyVar = this.f32819k0.get(i2);
            if (rxyVar instanceof xxy) {
                rxyVar.m183579j(true);
                if (rxyVar instanceof xxy) {
                    m50576x0(((xxy) rxyVar).m213596l(), i, str);
                    i++;
                }
            } else {
                rxyVar.m183579j(false);
            }
        }
        mo50018f();
    }

    public void setEditTextAndEnsureFocus(String str) {
        getBar_center_text().setText(str);
        getBar_center_text().setFocusable(true);
        getBar_center_text().setFocusableInTouchMode(true);
        getBar_center_text().requestFocus();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public void setGroupStyle(Act act) {
        this.f32791F0 = true;
        m50546T();
        m50532A0();
    }

    /* JADX INFO: renamed from: t0 */
    public void m50572t0(y20 y20Var) {
        this.f32802Q = y20Var;
    }

    /* JADX INFO: renamed from: u0 */
    public void m50573u0() {
        if (NullChecker.m82486a(this.f32799N)) {
            this.f32799N.m50216e();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m50574v0(MessageBarActionItemView messageBarActionItemView) {
        int size = this.f32825p0.size();
        for (int i = 0; i < size; i++) {
            MessageBarActionItemView messageBarActionItemView2 = this.f32825p0.get(i);
            if (messageBarActionItemView2 == messageBarActionItemView) {
                ((rxy) messageBarActionItemView2.getTag()).mo100971c(messageBarActionItemView2, i, size);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m50575w0() {
        Iterator<rxy> it = this.f32819k0.iterator();
        while (it.hasNext()) {
            it.next().m183572b();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m50576x0(OfficialAccountsMenu officialAccountsMenu, int i, String str) {
        i4g0.m138492A("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, jyb.m147494Y("bottom_menu_id", officialAccountsMenu.f21202id), jyb.m147494Y("official_account_id", str), jyb.m147494Y("bottom_menu_x_axis", Integer.valueOf(i)), jyb.m147494Y("bottom_menu_y_axis", 0), jyb.m147494Y("bottom_menu_name", officialAccountsMenu.text));
    }

    /* JADX INFO: renamed from: y0 */
    public void m50577y0() {
        bnl0.m105524M(this.f32835z, true);
        this.f32831v.setBackgroundColor(0);
        bnl0.m105501A0(getContext(), this.f32832w, ibc0.f113825J1);
        if (TextUtils.isEmpty(this.f32833x.getText().toString().trim())) {
            bnl0.m105501A0(getContext(), this.f32784A, ibc0.f113825J1);
        } else {
            bnl0.m105501A0(getContext(), this.f32784A, gta.m132210e().m132214d().mo34702I4() ? ibc0.f113852M1 : ibc0.f113843L1);
        }
        bnl0.m105550d0(this.f32784A, qa00.m175859d(14.0f));
        bnl0.m105552e0(this.f32784A, qa00.m175859d(14.0f));
        bnl0.m105538V(this.f32784A, qa00.m175859d(8.0f));
        bnl0.m105509E0(this.f32835z, new View.OnClickListener() { // from class: l.bzy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79184a.m50553a0(view);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public void m50578z0() {
        bnl0.m105524M(this.f32835z, false);
        bnl0.m105501A0(getContext(), this.f32831v, ibc0.f113825J1);
        bnl0.m105503B0(this.f32832w, null);
        bnl0.m105503B0(this.f32784A, null);
        bnl0.m105550d0(this.f32784A, qa00.m175859d(4.0f));
        bnl0.m105552e0(this.f32784A, qa00.m175859d(16.0f));
        bnl0.m105538V(this.f32784A, qa00.m175859d(0.0f));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.MessageBar
    public VText getBar_send() {
        return this.f32784A;
    }

    public MessageBarOpt(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32800O = "";
        this.f32801P = "";
        this.f32803R = false;
        this.f32804S = false;
        this.f32805T = false;
        this.f32806U = new AccelerateInterpolator();
        this.f32807V = false;
        this.f32791F0 = false;
    }

    public MessageBarOpt(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32800O = "";
        this.f32801P = "";
        this.f32803R = false;
        this.f32804S = false;
        this.f32805T = false;
        this.f32806U = new AccelerateInterpolator();
        this.f32807V = false;
        this.f32791F0 = false;
    }
}
