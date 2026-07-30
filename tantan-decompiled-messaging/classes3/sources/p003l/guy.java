package p003l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.Keyboard;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.VEditTextSougouGif;
import com.p000p1.mobile.putong.core.p001ui.messages.chatheat.MessageSpecialNotifyAct;
import com.p000p1.mobile.putong.core.p001ui.messages.emoji.VEditTextEmojiCompat;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarOpt;
import com.p000p1.mobile.putong.core.p001ui.messages.model.record.view.RecordAnimLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.MessageMomentGuide;
import com.p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.OfficialAccountAction;
import com.p1.mobile.putong.data.OfficialAccountActionType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e51;
import l.ftj;
import l.hvc0;
import l.ib1;
import l.j760;
import l.jdm;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.nvc0;
import l.o6j0;
import l.o7r;
import l.osi0;
import l.pxz;
import l.qib0;
import l.roj0;
import l.s7m;
import l.szb0;
import l.t100;
import l.ukw;
import l.ura;
import l.vwb;
import l.x1c0;
import l.xdl0;
import l.xma;
import l.y19;
import l.y4c0;
import l.ym2;
import l.zvf0;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p014rx.subjects.C1185a;
import p028v.VButton;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VPager;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class guy implements s7m<xsy>, gpy {

    /* JADX INFO: renamed from: w */
    public static boolean f4016w = false;

    /* JADX INFO: renamed from: x */
    public static C1185a<roj0> f4017x = C1185a.m9969b();

    /* JADX INFO: renamed from: a */
    public xsy f4018a;

    /* JADX INFO: renamed from: b */
    public MessagesAct f4019b;

    /* JADX INFO: renamed from: c */
    public String f4020c;

    /* JADX INFO: renamed from: d */
    public View f4021d;

    /* JADX INFO: renamed from: e */
    public View f4022e;

    /* JADX INFO: renamed from: f */
    public boolean f4023f;

    /* JADX INFO: renamed from: g */
    public toy f4024g;

    /* JADX INFO: renamed from: j */
    public int f4027j;

    /* JADX INFO: renamed from: k */
    public MessageBar f4028k;

    /* JADX INFO: renamed from: l */
    public dqy f4029l;

    /* JADX INFO: renamed from: q */
    public View f4034q;

    /* JADX INFO: renamed from: s */
    public View f4036s;

    /* JADX INFO: renamed from: u */
    public Animator f4038u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f4039v;

    /* JADX INFO: renamed from: h */
    public boolean f4025h = false;

    /* JADX INFO: renamed from: m */
    public final String f4030m = "giftStyleTipKey";

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f4031n = new View.OnClickListener() { // from class: l.jty
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f4736a.m4825j1(view);
        }
    };

    /* JADX INFO: renamed from: o */
    public boolean f4032o = false;

    /* JADX INFO: renamed from: p */
    public Runnable f4033p = new RunnableC0320d();

    /* JADX INFO: renamed from: r */
    public Runnable f4035r = new RunnableC0322f();

    /* JADX INFO: renamed from: t */
    public boolean f4037t = false;

    /* JADX INFO: renamed from: i */
    public c4g0 f4026i = f4017x.subscribe((m250<? super roj0>) mkd0.G(new e30() { // from class: l.uty
        @Override // p003l.e30
        public final void call(Object obj) {
            this.f8096a.m4821h1((roj0) obj);
        }
    }));

    /* JADX INFO: renamed from: l.guy$b */
    public class ViewOnFocusChangeListenerC0318b implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0318b() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m4859c() {
            guy.this.m4855z0(false);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m4860d() {
            guy.this.m4855z0(true);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            guy guyVar = guy.this;
            if (z) {
                guyVar.f4018a.m6497e0().mo2066l().m4309t7().m7965y0(false);
                view.post(new Runnable() { // from class: l.huy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4282a.m4859c();
                    }
                });
            } else {
                guyVar.m4822i0();
                view.post(new Runnable() { // from class: l.iuy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4504a.m4860d();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.guy$c */
    public class RunnableC0319c implements Runnable {
        public RunnableC0319c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Editable text = guy.this.f4028k.getBar_center_text().getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            guy.this.f4028k.getBar_center_text().requestFocus();
            guy.this.f4028k.getBar_center_text().setSelection(text.length());
        }
    }

    /* JADX INFO: renamed from: l.guy$d */
    public class RunnableC0320d implements Runnable {
        public RunnableC0320d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (guy.this.f4018a.m8790E1()) {
                return;
            }
            guy.this.m4758B1();
        }
    }

    /* JADX INFO: renamed from: l.guy$e */
    public class ViewOnClickListenerC0321e implements View.OnClickListener {
        public ViewOnClickListenerC0321e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            guy.this.m4822i0();
        }
    }

    /* JADX INFO: renamed from: l.guy$f */
    public class RunnableC0322f implements Runnable {
        public RunnableC0322f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (guy.this.f4034q == null) {
                return;
            }
            AppCompatTextView appCompatTextView = (VText) guy.this.f4034q.findViewById(y4c0.n2);
            Layout layout = appCompatTextView.getLayout();
            if (appCompatTextView.getLineCount() < 2 || !NullChecker.a(layout) || layout.getEllipsisCount(1) <= 0) {
                return;
            }
            appCompatTextView.setText(appCompatTextView.getText().toString().substring(0, (layout.getLineStart(1) + layout.getEllipsisStart(1)) - 1).concat("...”"));
        }
    }

    /* JADX INFO: renamed from: l.guy$g */
    public static /* synthetic */ class C0323g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4046a;

        static {
            int[] iArr = new int[MessageBarActionItemType.values().length];
            f4046a = iArr;
            try {
                iArr[MessageBarActionItemType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4046a[MessageBarActionItemType.SHI_PAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4046a[MessageBarActionItemType.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4046a[MessageBarActionItemType.PIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4046a[MessageBarActionItemType.GIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4046a[MessageBarActionItemType.MORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4046a[MessageBarActionItemType.MENU_ENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4046a[MessageBarActionItemType.MENU_ITEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4046a[MessageBarActionItemType.BLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public guy(MessagesAct messagesAct) {
        this.f4019b = messagesAct;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m4724L(View view) {
        CoreModule.P().b().Fg();
        osi0.f(R.string.w3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m4739g1() {
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5104f();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4744m(View view, float f) {
        float f2 = -f;
        view.setTranslationX(f2 - view.getWidth());
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f2 - view.getWidth(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m4748s(View view, float f) {
        float f2 = -f;
        view.setTranslationX(f2 - view.getWidth());
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f2 - view.getWidth(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: A0 */
    public void m4755A0() {
        if (CoreModule.P().b().Yg() && NullChecker.a(this.f4028k)) {
            boolean zE4 = xma.e4();
            if (CoreModule.P().b().x3() || !zE4) {
                Conversation conversationM4255j3 = this.f4018a.m6497e0().mo2066l().m4255j3();
                if (CoreModule.P().b().Zm(conversationM4255j3)) {
                    View messageBarRoot = this.f4028k.getMessageBarRoot();
                    VButton recoverMatchView = this.f4028k.getRecoverMatchView();
                    if (NullChecker.a(recoverMatchView) && NullChecker.a(messageBarRoot)) {
                        final User userM4325x6 = this.f4018a.m6497e0().mo2066l().m4325x6();
                        if (!NullChecker.a(userM4325x6) || userM4325x6.unilateralBlock()) {
                            xdl0.M(messageBarRoot, true);
                            xdl0.M(recoverMatchView, false);
                            return;
                        }
                        if (!CoreModule.P().b().fq(conversationM4255j3)) {
                            m4815e0(conversationM4255j3);
                            return;
                        }
                        if (xdl0.O0(recoverMatchView) && recoverMatchView.getAlpha() == 1.0f) {
                            return;
                        }
                        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5102d();
                        CoreModule.P().b().I7();
                        recoverMatchView.setBackgroundResource(c3c0.g1);
                        recoverMatchView.setAlpha(1.0f);
                        xdl0.U(recoverMatchView, t100.v);
                        recoverMatchView.setText(R.string.r3);
                        xdl0.E0(recoverMatchView, new View.OnClickListener() { // from class: l.cuy
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f2809a.m4784Q0(userM4325x6, view);
                            }
                        });
                        xdl0.M(messageBarRoot, false);
                        xdl0.M(recoverMatchView, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m4756A1() {
        MessageBar messageBar = this.f4028k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m2519u0();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B0 */
    public void m4757B0() {
        int i;
        int iMax = Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
        this.f4028k.getHidden_slide_out().getLayoutParams().height = iMax;
        ((ViewGroup.MarginLayoutParams) this.f4028k.getLayoutParams()).bottomMargin = -iMax;
        this.f4028k.getBar_send().setOnClickListener(new View.OnClickListener() { // from class: l.zsy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9412a.m4796W0(view);
            }
        });
        xdl0.M(this.f4028k.getBar_send(), !CoreModule.P().i().t1());
        boolean zT1 = CoreModule.P().i().t1();
        MessageBar messageBar = this.f4028k;
        if (zT1) {
            messageBar.getBar_center_text().setImeOptions(4);
        } else {
            messageBar.getBar_center_text().setInputType(this.f4028k.getBar_center_text().getInputType() | PKIFailureInfo.unsupportedVersion);
            this.f4028k.getBar_center_text().setImeOptions(1);
        }
        boolean z = this.f4028k.getBar_center_text() instanceof VEditTextSougouGif;
        MessageBar messageBar2 = this.f4028k;
        if (z) {
            ((VEditTextSougouGif) messageBar2.getBar_center_text()).setOnSogouGifListener(new VEditTextSougouGif.InterfaceC0101a() { // from class: l.aty
                @Override // com.p000p1.mobile.putong.core.p001ui.messages.VEditTextSougouGif.InterfaceC0101a
                /* JADX INFO: renamed from: a */
                public final void mo2107a(Uri uri) {
                    this.f2278a.m4801Y0(uri);
                }
            });
        } else if (messageBar2.getBar_center_text() instanceof VEditTextEmojiCompat) {
            ((VEditTextEmojiCompat) this.f4028k.getBar_center_text()).setOnSogouGifListener(new VEditTextSougouGif.InterfaceC0101a() { // from class: l.bty
                @Override // com.p000p1.mobile.putong.core.p001ui.messages.VEditTextSougouGif.InterfaceC0101a
                /* JADX INFO: renamed from: a */
                public final void mo2107a(Uri uri) {
                    this.f2493a.m4788S0(uri);
                }
            });
        }
        this.f4028k.getBar_center_text().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.cty
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f2804a.m4790T0(textView, i2, keyEvent);
            }
        });
        this.f4028k.getBar_center_text().getInputExtras(true);
        new x9j() { // from class: l.dty
            @Override // p003l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f3113a.m4792U0((View) obj, (MotionEvent) obj2);
            }
        };
        this.f4028k.getBar_center_text().addTextChangedListener(new C0317a());
        this.f4028k.getBar_center_text().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0318b());
        Intent intent = this.f4019b.getIntent();
        if (NullChecker.a(intent)) {
            String action = intent.getAction();
            String type = intent.getType();
            if ("android.intent.action.SEND".equals(action) && NullChecker.a(type)) {
                if (MimeTypes.TEXT_PLAIN.equals(type)) {
                    m4850w0(intent);
                } else if (type.startsWith("image/")) {
                    this.f4018a.m8831p1(vwb.f0(new Uri[]{(Uri) intent.getParcelableExtra("android.intent.extra.STREAM")}));
                }
            } else if ("android.intent.action.SEND_MULTIPLE".equals(action) && NullChecker.a(type) && type.startsWith("image/")) {
                this.f4018a.m8831p1(intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
            }
        }
        if (CoreModule.l.i().h1() && (i = this.f4027j) > 0) {
            if (i == 1) {
                m4776L1("打个招呼吧");
                this.f4028k.getBar_center_text().setSpaceHint("打个招呼吧");
                m4805Z1();
                this.f4027j = 0;
            } else if (i == 2) {
                final String str = this.f4018a.m6497e0().mo2066l().f3543c;
                this.f4018a.duringCreated(CoreModule.c.f0.Ig(str)).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.ety
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f3378a.m4794V0(str, (Boolean) obj);
                    }
                }));
            }
        }
        if (NullChecker.a(intent) && NullChecker.a(this.f4028k.getBar_center_text())) {
            String stringExtra = intent.getStringExtra("appendMsg");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f4028k.getBar_center_text().setText(stringExtra);
            }
            if (intent.getBooleanExtra("keyboardUp", false)) {
                e51.F(this.f4019b, new RunnableC0319c());
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m4758B1() {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            if (audioBusinessTypeC == AudioBusinessType.PHONE) {
                lsi0.w(R.string.E3);
                return;
            } else if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
                lsi0.w(R.string.F3);
                return;
            } else {
                lsi0.y(audioBusinessTypeC.getBusinessMsg());
                return;
            }
        }
        pxz.f(this.f4019b.pageId(), this.f4018a.m6497e0().mo2066l().m4295r3(), "voice");
        if (!PermissionHelper.b(new String[]{"android.permission.RECORD_AUDIO"})) {
            PermissionHelper.c().r(new String[]{"android.permission.RECORD_AUDIO"}).w(false).u(true).i(this.f4019b);
            return;
        }
        this.f4028k.getBar_center_text().clearFocus();
        RecordAnimLayout recordLayout = this.f4028k.getRecordLayout();
        recordLayout.setInputRect(dic0.m3586a(this.f4028k.getMessageBarRoot(), this.f4028k.getInputRoot(), true));
        recordLayout.m2612h();
        oic0.m6711b(recordLayout);
        xdl0.M(recordLayout, true);
        recordLayout.m2620p();
        lwz lwzVar = (lwz) this.f4018a.m6497e0().mo2068t0().m6499g0();
        this.f4028k.getRecordLayout().setRecordActionCallback(lwzVar);
        lwzVar.m6183v();
        this.f4018a.m6497e0().mo2066l().m4193X2();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m4759C0() {
        return this.f4019b;
    }

    /* JADX INFO: renamed from: D0 */
    public final PopupWindow m4761D0(List<OfficialAccountsSubMenu> list, final int i) {
        View viewInflate = o7r.a(this.f4019b).inflate(l6c0.d4, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        viewInflate.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(y4c0.L2);
        linearLayout.removeAllViews();
        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        int i2 = 0;
        while (i2 < list.size()) {
            final OfficialAccountsSubMenu officialAccountsSubMenu = list.get(i2);
            LinearLayout linearLayout2 = (LinearLayout) o7r.a(this.f4019b).inflate(l6c0.e4, (ViewGroup) null);
            viewInflate.setLayoutParams(layoutParams);
            linearLayout2.setFocusable(true);
            TextView textView = (TextView) linearLayout2.findViewById(y4c0.o3);
            View viewFindViewById = linearLayout2.findViewById(y4c0.n3);
            int i3 = i2 + 1;
            if (i3 == list.size()) {
                viewFindViewById.setVisibility(8);
                textView.setPadding(t100.d(10.0f), t100.d(12.0f), t100.d(10.0f), t100.d(17.0f));
            }
            textView.setText(officialAccountsSubMenu.text);
            final int size = list.size() - i2;
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.wty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8620a.m4804Z0(officialAccountsSubMenu, i, size, popupWindow, view);
                }
            });
            linearLayout.addView(linearLayout2);
            m4770I1(officialAccountsSubMenu, i, size);
            i2 = i3;
        }
        return popupWindow;
    }

    /* JADX INFO: renamed from: E0 */
    public void m4762E0() {
        m4765G0(this.f4028k.getMessageBarRoot(), this.f4028k.getRecoverMatchView());
        if (y19.K()) {
            m4764F1(this.f4018a.m6497e0().mo2066l().m4255j3(), CoreModule.c.e0.p9());
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m4763E1() {
        this.f4028k.getBlockText().setVisibility(8);
        this.f4028k.getInputRoot().setVisibility(0);
        this.f4028k.getBar_send().setEnabled(true);
        this.f4024g = null;
    }

    /* JADX INFO: renamed from: F1 */
    public void m4764F1(Conversation conversation, User user) {
        if (conversation == null || TEnum.equals(conversation.status, "dismissed")) {
            return;
        }
        if (conversation.isFakeQuickChatConv() || conversation.isFakeHeartbeatConv()) {
            MessageBarOpt.MessageBarState messageBarState = MessageBarOpt.MessageBarState.DEFAULT;
            if (user.isRiskAuditAvatar()) {
                messageBarState = MessageBarOpt.MessageBarState.AVATAR_AUDIT;
            } else if (CoreModule.P().i().S0()) {
                messageBarState = MessageBarOpt.MessageBarState.FAKE_LOCK;
            }
            m4844t0().mo1921g(messageBarState);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m4765G0(View view, View view2) {
        if (CoreModule.P().i().x()) {
            Conversation conversationM4255j3 = this.f4018a.m6497e0().mo2066l().m4255j3();
            User userM4325x6 = this.f4018a.m6497e0().mo2066l().m4325x6();
            if (NullChecker.a(conversationM4255j3) && TEnum.equals(conversationM4255j3.status, "dismissed") && !this.f4018a.m8791F1()) {
                if (CoreModule.P().i().G1()) {
                    xdl0.M(view, false);
                }
                xdl0.M(view2, true);
                this.f4023f = true;
                xdl0.E0(view2, new View.OnClickListener() { // from class: l.duy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.f3118a.m4807a1(view3);
                    }
                });
                return;
            }
            if (NullChecker.a(conversationM4255j3) && TEnum.equals(conversationM4255j3.status, "deleted")) {
                this.f4019b.finish();
                return;
            }
            if (!NullChecker.a(userM4325x6) || !userM4325x6.onlineMatchLocked()) {
                act().supportInvalidateOptionsMenu();
            }
            view2.setOnClickListener(null);
            xdl0.M(view2, false);
            this.f4023f = false;
            if (CoreModule.P().i().G1()) {
                xdl0.M(view, true);
            }
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final void m4766G1(OfficialAccountsMenu officialAccountsMenu, int i) {
        zvf0.u("e_official_account_bottom_menu", "p_chat_view", new j760[]{vwb.Y("bottom_menu_id", officialAccountsMenu.id), vwb.Y("official_account_id", this.f4018a.m6497e0().mo2066l().m4295r3()), vwb.Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.Y("bottom_menu_y_axis", 0), vwb.Y("bottom_menu_name", officialAccountsMenu.text)});
    }

    /* JADX INFO: renamed from: H0 */
    public void m4767H0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageBar messageBar = this.f4028k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m2494V(warmingUpLevel);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m4768H1(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2) {
        zvf0.u("e_official_account_bottom_menu", "p_chat_view", new j760[]{vwb.Y("bottom_menu_id", officialAccountsSubMenu.id), vwb.Y("official_account_id", this.f4018a.m6497e0().mo2066l().m4295r3()), vwb.Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.Y("bottom_menu_y_axis", Integer.valueOf(i2)), vwb.Y("bottom_menu_name", officialAccountsSubMenu.text)});
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m4769I0() {
        return ((Boolean) this.f4018a.m6497e0().mo2066l().f3525J.get()).booleanValue();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m4770I1(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2) {
        zvf0.A("e_official_account_bottom_menu", "p_chat_view", new j760[]{vwb.Y("bottom_menu_id", officialAccountsSubMenu.id), vwb.Y("official_account_id", this.f4018a.m6497e0().mo2066l().m4295r3()), vwb.Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.Y("bottom_menu_y_axis", Integer.valueOf(i2)), vwb.Y("bottom_menu_name", officialAccountsSubMenu.text)});
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m4771J0() {
        return false;
    }

    /* JADX INFO: renamed from: J1 */
    public void m4772J1(boolean z) {
        this.f4018a.m6497e0().mo2066l().f3525J.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K0 */
    public void m4773K0(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, int i) {
        if (warmingUpLevel == null) {
            return;
        }
        if (i == 1) {
            mo4657a();
            e51.H(this.f4019b, new Runnable() { // from class: l.xty
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8861a.m4814d1(warmingUpLevel);
                }
            }, 200L);
            return;
        }
        if (i == 2) {
            this.f4019b.startActivity(MessageSpecialNotifyAct.m2179g2(this.f4019b, this.f4018a.m6497e0().mo2066l().f3542b));
        } else if (i == 3) {
            mo4657a();
            e51.H(this.f4019b, new Runnable() { // from class: l.yty
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9142a.m4816e1(warmingUpLevel);
                }
            }, 200L);
        } else if (i == 4) {
            m4849v1();
        }
    }

    /* JADX INFO: renamed from: K1 */
    public void m4774K1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4028k.getBar_center_text().setText(str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m4775L0(View view) {
        this.f4025h = true;
    }

    /* JADX INFO: renamed from: L1 */
    public void m4776L1(String str) {
        this.f4028k.getBar_center_text().y(str, 15);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m4777M0(String str) {
        this.f4025h = false;
    }

    @NotNull
    /* JADX INFO: renamed from: M1 */
    public final View m4778M1(String str, MessageMomentGuide messageMomentGuide) {
        xdl0.M(this.f4019b.mo2066l().m4309t7().m7948p0(), true);
        this.f4019b.mo2066l().m4309t7().m7887L1(true);
        this.f4019b.mo2066l().m4309t7().m7890O1(true);
        this.f4019b.mo2066l().m4309t7().m7919d0();
        final View viewInflate = this.f4019b.inflater().inflate(l6c0.f1, (ViewGroup) null, false);
        viewInflate.setVisibility(4);
        final float dimension = viewInflate.getResources().getDimension(x1c0.b);
        if (this.f4019b.mo2066l().m4309t7().m7948p0().getChildCount() == 0) {
            viewInflate.post(new Runnable() { // from class: l.zty
                @Override // java.lang.Runnable
                public final void run() {
                    guy.m4744m(viewInflate, dimension);
                }
            });
        } else {
            viewInflate.setVisibility(0);
        }
        this.f4019b.mo2066l().m4309t7().m7903V1();
        this.f4019b.mo2066l().m4309t7().m7948p0().addView(viewInflate);
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.E2);
        AppCompatTextView appCompatTextView2 = (VText) viewInflate.findViewById(y4c0.Z);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.r2);
        AppCompatImageView appCompatImageView = (VImage) viewInflate.findViewById(y4c0.m3);
        ImageView imageView = (ImageView) viewInflate.findViewById(y4c0.O);
        if (ura.e().d().I4()) {
            appCompatTextView.setTextColor(this.f4019b.getResources().getColor(a1c0.g));
            appCompatTextView2.setTextColor(this.f4019b.getResources().getColor(a1c0.i));
            imageView.setImageResource(c3c0.I1);
        }
        appCompatTextView.setText(str);
        appCompatTextView2.setText(TextUtils.isEmpty(messageMomentGuide.desc) ? messageMomentGuide.getDefaultContent() : messageMomentGuide.desc);
        xdl0.M(appCompatImageView, false);
        nvc0 nvc0Var = new nvc0(t100.d(40.0f), t100.d(40.0f));
        if (messageMomentGuide.type == 1 && !vwb.J(messageMomentGuide.imageUrlList)) {
            qib0.G.O0(vDraweeView, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
        } else if (messageMomentGuide.type == 2 && !vwb.J(messageMomentGuide.imageUrlList)) {
            xdl0.M(appCompatImageView, true);
            qib0.G.O0(vDraweeView, (String) messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, (ym2) null);
        }
        xdl0.E0(imageView, new View.OnClickListener() { // from class: l.auy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2285a.m4829l1(view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m4779N0(CoreGiftInfo coreGiftInfo) {
        this.f4018a.m6497e0().mo2066l().m4154O6(((DbObject) coreGiftInfo).id);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m4780O0() {
        Editable text = this.f4028k.getBar_center_text().getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.f4028k.getBar_center_text().requestFocus();
        this.f4028k.getBar_center_text().setSelection(text.length());
    }

    /* JADX INFO: renamed from: O1 */
    public void m4781O1(int i) {
        this.f4027j = i;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m4782P0(Object obj) {
        if (NullChecker.a(obj)) {
            this.f4018a.m8829n2((String) obj);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P1 */
    public final View m4783P1(CharSequence charSequence, CharSequence charSequence2) {
        xdl0.M(this.f4019b.mo2066l().m4309t7().m7948p0(), true);
        this.f4019b.mo2066l().m4309t7().m7887L1(true);
        this.f4019b.mo2066l().m4309t7().m7890O1(true);
        this.f4019b.mo2066l().m4309t7().m7919d0();
        final View viewInflate = this.f4019b.inflater().inflate(l6c0.h1, (ViewGroup) null, false);
        viewInflate.setVisibility(4);
        final float dimension = viewInflate.getResources().getDimension(x1c0.b);
        if (this.f4019b.mo2066l().m4309t7().m7948p0().getChildCount() == 0) {
            viewInflate.post(new Runnable() { // from class: l.kty
                @Override // java.lang.Runnable
                public final void run() {
                    guy.m4748s(viewInflate, dimension);
                }
            });
        } else {
            viewInflate.setVisibility(0);
        }
        this.f4019b.mo2066l().m4309t7().m7903V1();
        LinearLayout linearLayoutM7948p0 = this.f4019b.mo2066l().m4309t7().m7948p0();
        int i = t100.i;
        linearLayoutM7948p0.setPadding(i, 0, 0, 0);
        this.f4019b.mo2066l().m4309t7().m7948p0().addView(viewInflate);
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.E2);
        AppCompatTextView appCompatTextView2 = (VText) viewInflate.findViewById(y4c0.Z);
        View viewFindViewById = viewInflate.findViewById(y4c0.x);
        View viewFindViewById2 = viewInflate.findViewById(y4c0.g0);
        ImageView imageView = (ImageView) viewInflate.findViewById(y4c0.O);
        if (ura.e().d().I4()) {
            appCompatTextView.setTextColor(this.f4019b.getResources().getColor(a1c0.i));
            appCompatTextView2.setTextColor(this.f4019b.getResources().getColor(a1c0.g));
            viewFindViewById2.setBackgroundResource(c3c0.N1);
            imageView.setImageResource(c3c0.I1);
        }
        appCompatTextView.setText(charSequence);
        appCompatTextView2.setText(charSequence2);
        xdl0.E0(imageView, new View.OnClickListener() { // from class: l.lty
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5415a.m4831m1(view);
            }
        });
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM4265l3 = this.f4018a.m6497e0().mo2066l().m4265l3();
        if (warmingUpLevelM4265l3 != MessageWarmingUpHelper.WarmingUpLevel.not) {
            jdm.b(viewFindViewById, MessageWarmingUpHelper.m2298i(warmingUpLevelM4265l3), i, -1, 0, 0, 0);
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m4784Q0(User user, View view) {
        CoreModule.P().b().l9(this.f4019b, ((DbObject) user).id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q1 */
    public void m4785Q1(String str) {
        if (this.f4034q == null) {
            View viewInflate = this.f4019b.inflater().inflate(l6c0.e1, (ViewGroup) this.f4028k, false);
            this.f4034q = viewInflate;
            this.f4028k.addView(viewInflate, 0);
            boolean zG1 = CoreModule.P().i().G1();
            View view = this.f4034q;
            if (zG1) {
                view.setBackgroundColor(-526345);
            } else {
                view.setBackgroundColor(this.f4019b.color(a1c0.a0));
            }
        }
        if (!CoreModule.P().i().t1()) {
            boolean zG2 = CoreModule.P().i().G1();
            MessageBar messageBar = this.f4028k;
            if (zG2) {
                messageBar.getBar_center_text().getText().toString().trim().isEmpty();
            } else if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                m4809b0(this.f4028k.getBar_send());
            }
        }
        m4803Z(this.f4028k.getBar_center_text());
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5104f();
        xdl0.A(this.f4028k.getBar_center_text());
        if (CoreModule.P().i().G1()) {
            m4856z1(true);
        }
        AppCompatTextView appCompatTextView = (VText) this.f4034q.findViewById(y4c0.n2);
        AppCompatImageView appCompatImageView = (VImage) this.f4034q.findViewById(y4c0.M);
        appCompatTextView.setText(String.format("“%s”", str));
        appCompatTextView.post(this.f4035r);
        xdl0.E0(appCompatImageView, new ViewOnClickListenerC0321e());
        xdl0.g gVarJ0 = xdl0.j0(this.f4028k.getBar_center_text(), this.f4028k);
        xdl0.V(appCompatTextView, gVarJ0.a);
        xdl0.D0(gVarJ0.c, new View[]{appCompatTextView});
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m4786R0(Uri uri) {
        this.f4018a.m8840t2(uri);
    }

    /* JADX INFO: renamed from: R1 */
    public final void m4787R1(View view) {
        a aVar = new a(this.f4019b);
        this.f4032o = true;
        aVar.B(t100.d(2.0f)).D(act().getString(R.string.z5)).l(t100.d(7.0f)).p(75).k(new int[]{-98787}).y(true).J(13.0f).e(true).b(5000L).j(new a.c() { // from class: l.gty
            /* JADX INFO: renamed from: a */
            public final void m4699a(String str) {
                this.f4011a.m4833n1(str);
            }
        }).q(a.Q | a.O).N(new a.d() { // from class: l.hty
            /* JADX INFO: renamed from: a */
            public final void m4997a(View view2) {
                this.f4278a.m4835o1(view2);
            }
        });
        d.l().t(aVar, view);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m4788S0(final Uri uri) {
        PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).w(false).u(true).j(true).o(new d30() { // from class: l.tty
            @Override // p003l.d30
            public final void call() {
                this.f7762a.m4786R0(uri);
            }
        }).i(this.f4019b);
    }

    /* JADX INFO: renamed from: S1 */
    public void m4789S1(final String str) {
        if (User.isTeamAccount(this.f4018a.m6497e0().mo2066l().m4295r3())) {
            return;
        }
        this.f4024g = new fpy(new d30() { // from class: l.buy
            @Override // p003l.d30
            public final void call() {
                this.f2506a.m4837p1(str);
            }
        });
        this.f4028k.getBlockText().setVisibility(0);
        this.f4028k.getInputRoot().setVisibility(8);
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5102d();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ boolean m4790T0(TextView textView, int i, KeyEvent keyEvent) {
        if (!CoreModule.P().i().t1()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f4028k.getBar_center_text().getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            o6j0.c("e_chat_message_send", act().pageId(), new o6j0.a[0]);
            this.f4031n.onClick(this.f4028k.getBar_send());
        }
        return true;
    }

    /* JADX INFO: renamed from: T1 */
    public void m4791T1() {
        m4856z1(true);
        m4803Z(this.f4028k.getBar_center_text());
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5104f();
        xdl0.A(this.f4028k.getBar_center_text());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m4792U0(View view, MotionEvent motionEvent) {
        boolean zO = xdl0.O(view, motionEvent);
        if (motionEvent.getActionMasked() == 3) {
            this.f4018a.m6497e0().mo2068t0().d1();
            return Boolean.TRUE;
        }
        if (motionEvent.getActionMasked() != 1) {
            return Boolean.FALSE;
        }
        ukw ukwVarB1 = this.f4018a.m6497e0().mo2068t0().b1();
        xsy xsyVar = this.f4018a;
        if (!zO) {
            xsyVar.m6497e0().mo2068t0().d1();
            return Boolean.TRUE;
        }
        if (((lwz) xsyVar.m6497e0().mo2068t0().m6499g0()).m6181q()) {
            if (NullChecker.a(((Act) this.f4019b).res)) {
                this.f4018a.m6497e0().mo2066l().m4147M6(ukwVarB1.m(), "audio/mp3", (ukwVarB1.s() * 1.0f) / 1000.0f);
            }
        } else if (ukwVarB1.t()) {
            ukwVarB1.D();
        }
        if (NullChecker.a(((Act) this.f4019b).res)) {
            ((lwz) this.f4018a.m6497e0().mo2068t0().m6499g0()).m6180p();
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: U1 */
    public void m4793U1() {
        m4803Z(this.f4028k.getBar_center_text());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m4794V0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            String strConcat = (TEnum.equals(CoreModule.c.e0.Pa(str).gender, "female") ? "她" : "他").concat("在等你回消息");
            m4791T1();
            m4776L1(strConcat);
            this.f4028k.getBar_center_text().setSpaceHint(strConcat);
        }
        this.f4027j = 0;
    }

    /* JADX INFO: renamed from: V1 */
    public void m4795V1(d30 d30Var) {
        this.f4024g = new fpy(d30Var);
        this.f4028k.getBlockText().setVisibility(0);
        this.f4028k.getBlockText().setText("");
        this.f4028k.getBlockText().setBackground(null);
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5102d();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m4796W0(View view) {
        o6j0.c("e_chat_message_send", act().pageId(), new o6j0.a[0]);
        this.f4031n.onClick(this.f4028k.getBar_send());
        if (CoreModule.P().i().h1()) {
            m4776L1(this.f4019b.getResources().getString(R.string.N0));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f4019b;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m4798X0(Uri uri) {
        this.f4018a.m8840t2(uri);
    }

    /* JADX INFO: renamed from: X1 */
    public void m4799X1(String str, MessageMomentGuide messageMomentGuide) {
        m4851w1(m4778M1(str, messageMomentGuide));
    }

    /* JADX INFO: renamed from: Y */
    public void m4800Y() {
        if (m4820h0()) {
            return;
        }
        CoreModule.c.f0.e0.onNext(roj0.a);
        ((MessageBarOpt) this.f4028k).mo1915a();
        ((MessageBarOpt) this.f4028k).mo1920f();
        int iM8922y0 = this.f4018a.m6497e0().mo2063c0().m8922y0();
        xsy xsyVar = this.f4018a;
        if (iM8922y0 != 4) {
            xsyVar.m6497e0().mo2063c0().m6499g0().mo5108k(4, -1);
        } else {
            xsyVar.m6497e0().mo2063c0().m6499g0().mo5103e();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m4801Y0(final Uri uri) {
        PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).w(false).u(true).j(true).o(new d30() { // from class: l.fty
            @Override // p003l.d30
            public final void call() {
                this.f3727a.m4798X0(uri);
            }
        }).i(this.f4019b);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m4802Y1(PopupWindow popupWindow, View view) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int[] iArr2 = new int[2];
        m4844t0().getLocationOnScreen(iArr2);
        int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
        int iD = (iArr2[1] - t100.d(5.0f)) - contentView.getMeasuredHeight();
        if (contentView.getMeasuredWidth() + width > xdl0.y0() - t100.d(6.0f)) {
            width = (xdl0.y0() - t100.d(6.0f)) - contentView.getMeasuredWidth();
            popupWindow.getContentView().setBackground(this.f4019b.getResources().getDrawable(c3c0.A5));
        }
        popupWindow.showAtLocation(view, 51, width, iD);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
    }

    /* JADX INFO: renamed from: Z */
    public void m4803Z(View view) {
        if (this.f4028k.m1919e()) {
            this.f4028k.getBar_center_text().getVisibility();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m4804Z0(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2, PopupWindow popupWindow, View view) {
        m4768H1(officialAccountsSubMenu, i, i2);
        popupWindow.dismiss();
        if (NullChecker.a(officialAccountsSubMenu.action)) {
            OfficialAccountAction officialAccountAction = officialAccountsSubMenu.action;
            m4811c0(officialAccountAction.type, officialAccountAction.data, officialAccountsSubMenu.id);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m4805Z1() {
        if (NullChecker.a(this.f4019b.mo2066l().m4309t7().m7946o0()) && this.f4019b.mo2066l().m4309t7().m7946o0().getVisibility() == 8) {
            xdl0.M(this.f4019b.mo2066l().m4309t7().m7946o0(), true);
            zvf0.x("e_picture_1_send", "p_chat_view");
            zvf0.x("e_picture_2_send", "p_chat_view");
            zvf0.x("e_picture_3_send", "p_chat_view");
            TextView textView = (TextView) this.f4019b.mo2066l().m4309t7().m7946o0().findViewById(y4c0.l5);
            TextView textView2 = (TextView) this.f4019b.mo2066l().m4309t7().m7946o0().findViewById(y4c0.k5);
            TextView textView3 = (TextView) this.f4019b.mo2066l().m4309t7().m7946o0().findViewById(y4c0.j5);
            xdl0.E0(textView, new View.OnClickListener() { // from class: l.pty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6512a.m4839q1(view);
                }
            });
            xdl0.E0(textView2, new View.OnClickListener() { // from class: l.qty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6699a.m4841r1(view);
                }
            });
            xdl0.E0(textView3, new View.OnClickListener() { // from class: l.rty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7071a.m4843s1(view);
                }
            });
        }
    }

    @Override // p003l.gpy
    /* JADX INFO: renamed from: a */
    public void mo4657a() {
        if (m4820h0()) {
            return;
        }
        if (((MessageBarOpt) this.f4028k).f1850V) {
            o6j0.h("e_chat_emoji_entrance", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_emoji_entrance", "emoji")});
            o6j0.c("e_chat_emoji_entrance", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_emoji_entrance", "keyboard")});
        } else {
            o6j0.h("e_chat_emoji_entrance", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_emoji_entrance", "keyboard")});
            o6j0.c("e_chat_emoji_entrance", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_emoji_entrance", "emoji")});
            CoreModule.c.f0.e0.onNext(roj0.a);
        }
        ((MessageBarOpt) this.f4028k).mo1915a();
        ((MessageBarOpt) this.f4028k).mo1920f();
        m4838q0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m4806a0(int i, View view) {
        m4760C1(i, view);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m4807a1(View view) {
        this.f4018a.m6497e0().mo2051E().r0();
    }

    /* JADX INFO: renamed from: a2 */
    public void m4808a2() {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            if (audioBusinessTypeC == AudioBusinessType.PHONE) {
                lsi0.w(R.string.s);
                return;
            } else {
                lsi0.y(audioBusinessTypeC.getBusinessMsg());
                return;
            }
        }
        this.f4018a.m6497e0().mo2066l().m4309t7().m7906X1();
        ((MessageBarOpt) this.f4028k).mo1915a();
        boolean zM3703d0 = this.f4029l.m3703d0();
        dqy dqyVar = this.f4029l;
        if (zM3703d0) {
            dqyVar.m3683J(true, false);
            this.f4029l.m3677F0();
        } else {
            dqyVar.m3671C0();
            zvf0.r("e_live_camera", "p_chat_view");
        }
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
    @Override // p003l.gpy
    /* JADX INFO: renamed from: b */
    public void mo4658b(uoy uoyVar, View view, boolean z) {
        if (m4820h0()) {
            return;
        }
        CoreModule.c.f0.d0.onNext(roj0.a);
        switch (C0323g.f4046a[uoyVar.m8186d().ordinal()]) {
            case 1:
                if (!uoyVar.m8187e(2)) {
                    if (!z) {
                        m4819g0(view);
                    } else {
                        m4758B1();
                    }
                } else if (!z) {
                    this.f4029l.m3681I(true);
                }
                break;
            case 2:
                if (CoreModule.P().i().v1()) {
                    m4787R1(view);
                }
                m4808a2();
                break;
            case 3:
                boolean zM8189g = uoyVar.m8189g();
                ((MessageBarOpt) this.f4028k).mo1915a();
                uoyVar.m8191i(!zM8189g);
                ((MessageBarOpt) this.f4028k).mo1920f();
                m4838q0();
                o6j0.c("e_chat_emoji_button", "p_chat_view", new o6j0.a[0]);
                break;
            case 4:
                o6j0.c("e_chat_more_picture", "p_chat_view", new o6j0.a[0]);
                PutongAct putongAct = this.f4019b;
                putongAct.startActivityForResult(MediaPickerAct.X1(putongAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f4019b.getString(R.string.h)).withFromType(4).build()), 786);
                this.f4019b.overridePendingTransition(szb0.e, szb0.a);
                pxz.f(this.f4019b.pageId(), this.f4019b.f1531f.m4295r3(), "photo");
                break;
            case 5:
                if (uoyVar.m8187e(2)) {
                    this.f4029l.m3679G0();
                }
                m4848v0();
                break;
            case 6:
                if (uoyVar.m8187e(2)) {
                    this.f4029l.m3673D0();
                }
                if (y19.S() && d.l().x("switchPicBubbleKey")) {
                    d.l().k("switchPicBubbleKey");
                }
                boolean zM8189g2 = uoyVar.m8189g();
                ((MessageBarOpt) this.f4028k).mo1915a();
                uoyVar.m8191i(!zM8189g2);
                ((MessageBarOpt) this.f4028k).mo1920f();
                m4849v1();
                o6j0.c("e_chat_more_button", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_more_status", zM8189g2 ? "on" : "off")});
                if (!zM8189g2) {
                    hkx hkxVarMo5100b = this.f4018a.m6497e0().mo2063c0().m6499g0().mo5100b();
                    if (NullChecker.a(hkxVarMo5100b)) {
                        hkxVarMo5100b.m4985g();
                    }
                }
                break;
            case 7:
                boolean zM8189g3 = uoyVar.m8189g();
                ((MessageBarOpt) this.f4028k).mo1915a();
                uoyVar.m8191i(!zM8189g3);
                MessageBar messageBar = this.f4028k;
                if (!zM8189g3) {
                    ((MessageBarOpt) messageBar).m2517s0(this.f4018a.m6497e0().mo2066l().m4295r3());
                    this.f4018a.m6497e0().mo2063c0().m6499g0().mo5108k(0, -1);
                } else {
                    ((MessageBarOpt) messageBar).m2487O();
                }
                break;
            case 8:
                m4847u1(uoyVar, view);
                break;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m4810b2(CharSequence charSequence, CharSequence charSequence2) {
        m4851w1(m4783P1(charSequence, charSequence2));
    }

    @Override // p003l.gpy
    /* JADX INFO: renamed from: c */
    public void mo4659c(MessageBarActionItemType messageBarActionItemType) {
        if (m4820h0()) {
            return;
        }
        int i = C0323g.f4046a[messageBarActionItemType.ordinal()];
    }

    /* JADX INFO: renamed from: c0 */
    public final void m4811c0(OfficialAccountActionType officialAccountActionType, String str, String str2) {
        String string = officialAccountActionType.toString();
        string.getClass();
        switch (string) {
            case "schema":
                if (!str.startsWith("tel:")) {
                    CoreModule.P().i().Y(act(), Uri.parse(str));
                    break;
                } else {
                    this.f4019b.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                    break;
                }
                break;
            case "text":
                this.f4018a.m6497e0().mo2066l().m4173S6(str);
                break;
            case "click":
                CoreModule.c.f0.Ko(this.f4018a.m6497e0().mo2066l().m4295r3(), str2);
                break;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m4812c2(int i) {
        MessageBar messageBar = this.f4028k;
        MessageBarActionItemType messageBarActionItemType = MessageBarActionItemType.MENU_ENTER;
        boolean zMo1917c = messageBar.mo1917c(messageBarActionItemType);
        MessageBar messageBar2 = this.f4028k;
        if (zMo1917c) {
            boolean zMo1918d = messageBar2.mo1918d(messageBarActionItemType);
            this.f4028k.mo1915a();
            this.f4028k.mo1922h(messageBarActionItemType, zMo1918d);
        } else {
            messageBar2.mo1915a();
        }
        if (i != 0) {
            if (i == 1) {
                this.f4028k.mo1922h(MessageBarActionItemType.EMOJI, true);
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f4028k.mo1922h(MessageBarActionItemType.MORE, true);
                return;
            }
        }
        this.f4028k.mo1920f();
    }

    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void m4823i1(xsy xsyVar) {
        this.f4018a = xsyVar;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m4814d1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        int i;
        Keyboard keyboardMo5099a = this.f4018a.m6497e0().mo2063c0().m6499g0().mo5099a();
        int i2 = warmingUpLevel.value;
        if (i2 >= MessageWarmingUpHelper.WarmingUpLevel.four.value) {
            i = 2;
        } else {
            i = i2 >= MessageWarmingUpHelper.WarmingUpLevel.second.value ? 1 : 0;
        }
        if (!NullChecker.a(keyboardMo5099a.f1451f.getAdapter()) || keyboardMo5099a.f1451f.getAdapter().getCount() < i) {
            return;
        }
        keyboardMo5099a.f1455j.setSelection(keyboardMo5099a.f1451f.getAdapter().getCount() - i);
        VPager vPager = keyboardMo5099a.f1451f;
        vPager.T(vPager.getAdapter().getCount() - i, false);
    }

    public void destroy() {
        if (NullChecker.a(this.f4038u)) {
            this.f4038u.cancel();
            this.f4038u = null;
        }
        if (NullChecker.a(this.f4039v)) {
            this.f4039v.cancel();
            this.f4038u = null;
        }
        mkd0.z(this.f4026i);
    }

    /* JADX INFO: renamed from: e0 */
    public void m4815e0(Conversation conversation) {
        if (NullChecker.a(this.f4028k)) {
            View messageBarRoot = this.f4028k.getMessageBarRoot();
            VButton recoverMatchView = this.f4028k.getRecoverMatchView();
            if (NullChecker.a(recoverMatchView) && NullChecker.a(messageBarRoot)) {
                if (conversation.mm > 0) {
                    xdl0.M(messageBarRoot, true);
                    xdl0.M(recoverMatchView, false);
                    return;
                }
                if (!CoreModule.P().b().nl(conversation) || !CoreModule.P().b().X7(conversation)) {
                    xdl0.M(messageBarRoot, true);
                    xdl0.M(recoverMatchView, false);
                    return;
                }
                if (conversation.userMessageCount < 3) {
                    xdl0.M(messageBarRoot, true);
                    xdl0.M(recoverMatchView, false);
                    return;
                }
                if (!xdl0.O0(recoverMatchView) || recoverMatchView.getAlpha() == 1.0f) {
                    this.f4018a.m6497e0().mo2063c0().m6499g0().mo5102d();
                    CoreModule.P().b().wo();
                    recoverMatchView.setBackgroundResource(c3c0.T0);
                    recoverMatchView.setAlpha(0.6f);
                    xdl0.U(recoverMatchView, t100.v);
                    recoverMatchView.setText(R.string.s3);
                    xdl0.E0(recoverMatchView, new View.OnClickListener() { // from class: l.ity
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            guy.m4724L(view);
                        }
                    });
                    xdl0.M(messageBarRoot, false);
                    xdl0.M(recoverMatchView, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m4816e1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        Keyboard keyboardMo5099a = this.f4018a.m6497e0().mo2063c0().m6499g0().mo5099a();
        int i = warmingUpLevel.value >= MessageWarmingUpHelper.WarmingUpLevel.four.value ? 1 : 0;
        if (!NullChecker.a(keyboardMo5099a.f1451f.getAdapter()) || keyboardMo5099a.f1451f.getAdapter().getCount() < i) {
            return;
        }
        keyboardMo5099a.f1455j.setSelection(keyboardMo5099a.f1451f.getAdapter().getCount() - i);
        VPager vPager = keyboardMo5099a.f1451f;
        vPager.T(vPager.getAdapter().getCount() - i, false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m4817f0() {
        View viewMo1916b = this.f4028k.mo1916b(MessageBarActionItemType.SHI_PAI);
        if (viewMo1916b == null || m4769I0() || this.f4032o) {
            return;
        }
        m4787R1(viewMo1916b);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m4818f1() {
        if (ruy.m7381g().m7392o(this.f4018a.m6497e0().mo2066l().m4255j3())) {
            act().m2061S2("chat_page_enter_text", "", true);
        } else {
            CoreModule.l.i().showProofAgeDlg(act(), "chat_page_enter_text");
        }
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
    /* JADX INFO: renamed from: g0 */
    public final void m4819g0(View view) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            osi0.g(audioBusinessTypeC == AudioBusinessType.PHONE ? hvc0.c(R.string.E3) : audioBusinessTypeC.getBusinessMsg());
            return;
        }
        a aVar = new a(this.f4019b);
        d.l().k("audio_tips_key");
        aVar.B(t100.d(2.0f)).D(this.f4019b.getString(R.string.g1)).l(t100.d(7.0f)).x(t100.d(10.0f)).p(75).b(3000L).M(true).N(new a.d() { // from class: l.mty
            /* JADX INFO: renamed from: a */
            public final void m6496a(View view2) {
                this.f5768a.m4775L0(view2);
            }
        }).j(new a.c() { // from class: l.nty
            /* JADX INFO: renamed from: a */
            public final void m6567a(String str) {
                this.f5973a.m4777M0(str);
            }
        }).q(a.Q | a.O);
        if (ura.e().d().I4()) {
            aVar.k(new int[]{this.f4019b.color(a1c0.j)});
        }
        d.l().u(aVar, view, "audio_tips_key");
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m4820h0() {
        if (NullChecker.a(this.f4024g)) {
            return this.f4024g.mo4390a();
        }
        return false;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m4821h1(roj0 roj0Var) {
        if (NullChecker.a(this.f4029l) && this.f4029l.m3703d0()) {
            this.f4029l.m3678G();
        } else if (NullChecker.a(this.f4018a)) {
            e51.H(this.f4028k.getContext(), new Runnable() { // from class: l.fuy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3730a.m4739g1();
                }
            }, 150L);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m4822i0() {
        View childAt = this.f4028k.getChildAt(0);
        View view = this.f4034q;
        if (childAt == view) {
            this.f4028k.removeView(view);
            this.f4034q = null;
        }
        this.f4018a.m6497e0().mo2066l().m4139K6(null);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f4028k = (MessageBar) layoutInflater.inflate(l6c0.g1, viewGroup, false);
        if (CoreModule.P().i().E() && this.f4018a.m6497e0().mo2066l().m4231e4()) {
            this.f4028k.getBar_center_text().w();
        }
        if (this.f4028k instanceof MessageBarOpt) {
            if (User.isBusinessAI1V1(this.f4018a.m6497e0().mo2066l().m4295r3())) {
                ((MessageBarOpt) this.f4028k).m2489Q(true);
            }
            ((MessageBarOpt) this.f4028k).m2491S(xoy.m8731b(this.f4018a.m6497e0().mo2066l().m4295r3(), this.f4018a.m6497e0().mo2066l().m4231e4()), this);
            this.f4028k.getRecordLayout().setInputRootLayout(this.f4028k.getInputContent());
            this.f4029l = new dqy((MessageBarOpt) this.f4028k, this);
            ((MessageBarOpt) this.f4028k).m2518t0(new e30() { // from class: l.ysy
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9131a.m4782P0(obj);
                }
            });
        }
        return this.f4028k;
    }

    /* JADX INFO: renamed from: j0 */
    public void m4824j0() {
        m4844t0().getBarWrapper().removeView(this.f4018a.m6497e0().mo2070v0().m6499g0().a);
        m4844t0().getBar_center_text().setEnabled(true);
        m4844t0().getBar_center_text().setFocusable(true);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m4825j1(View view) {
        fcz<? extends DbObject, ?> fczVarMo2066l = this.f4018a.m6497e0().mo2066l();
        this.f4018a.m8834q2(this.f4028k.getBar_center_text().getText(), this.f4028k.getBar_center_text().getAtIdList());
        if (fczVarMo2066l.m4198Y2()) {
            fczVarMo2066l.m4116F6();
            m4789S1(fczVarMo2066l.m4295r3());
            this.f4028k.getBar_send().setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m4826k0() {
        this.f4019b.mo2066l().m4309t7().m7903V1();
        xdl0.M(this.f4019b.mo2066l().m4309t7().m7948p0(), false);
        this.f4019b.mo2066l().m4309t7().m7887L1(false);
        this.f4019b.mo2066l().m4309t7().m7890O1(false);
        this.f4018a.m6497e0().mo2066l().m4224c7(null);
        this.f4018a.m6497e0().mo2066l().m4229d7(null);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m4827k1() {
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5104f();
        xdl0.A(this.f4028k.getBar_center_text());
    }

    /* JADX INFO: renamed from: l0 */
    public void m4828l0() {
        int iM8922y0 = this.f4018a.m6497e0().mo2063c0().m8922y0();
        xsy xsyVar = this.f4018a;
        if (iM8922y0 != 1) {
            xsyVar.m6497e0().mo2063c0().m6499g0().mo5108k(1, -1);
            pxz.f(this.f4019b.pageId(), this.f4018a.m6497e0().mo2066l().m4295r3(), "emoji");
        } else {
            xsyVar.m6497e0().mo2063c0().m6499g0().mo5104f();
        }
        this.f4018a.m6497e0().mo2066l().m4309t7().m7965y0(false);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m4829l1(View view) {
        m4826k0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m4830m0() {
        View view = this.f4021d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m4831m1(View view) {
        m4826k0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m4832n0() {
        m4758B1();
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m4833n1(String str) {
        this.f4032o = false;
    }

    /* JADX INFO: renamed from: o0 */
    public void m4834o0() {
        this.f4028k.getRecordLayout().m2609e();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m4835o1(View view) {
        m4772J1(true);
    }

    /* JADX INFO: renamed from: p0 */
    public void m4836p0() {
        if (this.f4025h) {
            this.f4025h = false;
            d.l().k("audio_tips_key");
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m4837p1(String str) {
        act().m2060R2("", str);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m4838q0() {
        if (y19.S() && d.l().x("switchPicBubbleKey")) {
            d.l().k("switchPicBubbleKey");
        }
        m4828l0();
        Keyboard keyboardMo5099a = this.f4018a.m6497e0().mo2063c0().m6499g0().mo5099a();
        if (!NullChecker.a(this.f4029l) || !this.f4029l.m3703d0()) {
            keyboardMo5099a.f1451f.setScrollble(true);
            return;
        }
        keyboardMo5099a.f1451f.setScrollble(false);
        keyboardMo5099a.f1451f.setCurrentItem(0);
        this.f4029l.m3673D0();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m4839q1(View view) {
        zvf0.r("e_picture_1_send", "p_chat_view");
        fcz<? extends DbObject, ?> fczVarMo2066l = this.f4018a.m6497e0().mo2066l();
        this.f4018a.m8834q2(new SpannableStringBuilder("[暗中观察]"), this.f4028k.getBar_center_text().getAtIdList());
        if (fczVarMo2066l.m4198Y2()) {
            fczVarMo2066l.m4116F6();
            m4789S1(fczVarMo2066l.m4295r3());
            this.f4028k.getBar_send().setEnabled(false);
        }
        m4776L1(this.f4019b.getResources().getString(R.string.N0));
        xdl0.M(this.f4019b.mo2066l().m4309t7().m7946o0(), false);
    }

    /* JADX INFO: renamed from: r0 */
    public View m4840r0() {
        return this.f4036s;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m4841r1(View view) {
        zvf0.r("e_picture_2_send", "p_chat_view");
        fcz<? extends DbObject, ?> fczVarMo2066l = this.f4018a.m6497e0().mo2066l();
        this.f4018a.m8834q2(new SpannableStringBuilder("[摆手]"), this.f4028k.getBar_center_text().getAtIdList());
        if (fczVarMo2066l.m4198Y2()) {
            fczVarMo2066l.m4116F6();
            m4789S1(fczVarMo2066l.m4295r3());
            this.f4028k.getBar_send().setEnabled(false);
        }
        m4776L1(this.f4019b.getResources().getString(R.string.N0));
        xdl0.M(this.f4019b.mo2066l().m4309t7().m7946o0(), false);
    }

    /* JADX INFO: renamed from: s0 */
    public String m4842s0() {
        return this.f4028k.getBar_center_text().getText().toString().trim();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m4843s1(View view) {
        zvf0.r("e_picture_3_send", "p_chat_view");
        fcz<? extends DbObject, ?> fczVarMo2066l = this.f4018a.m6497e0().mo2066l();
        this.f4018a.m8834q2(new SpannableStringBuilder("[嘿哈]"), this.f4028k.getBar_center_text().getAtIdList());
        if (fczVarMo2066l.m4198Y2()) {
            fczVarMo2066l.m4116F6();
            m4789S1(fczVarMo2066l.m4295r3());
            this.f4028k.getBar_send().setEnabled(false);
        }
        m4776L1(this.f4019b.getResources().getString(R.string.N0));
        xdl0.M(this.f4019b.mo2066l().m4309t7().m7946o0(), false);
    }

    /* JADX INFO: renamed from: t0 */
    public MessageBar m4844t0() {
        return this.f4028k;
    }

    /* JADX INFO: renamed from: t1 */
    public void m4845t1(boolean z) {
        if (!z) {
            if (this.f4018a.m6497e0().mo2066l().m4198Y2()) {
                this.f4018a.m6497e0().mo2066l().m4116F6();
                m4789S1(this.f4018a.m6497e0().mo2066l().m4295r3());
                return;
            } else {
                this.f4024g = null;
                this.f4028k.getBlockText().setVisibility(8);
                this.f4028k.getInputRoot().setVisibility(0);
                return;
            }
        }
        this.f4024g = new fpy(new d30() { // from class: l.sty
            @Override // p003l.d30
            public final void call() {
                this.f7305a.m4818f1();
            }
        });
        this.f4028k.getBlockText().setVisibility(0);
        this.f4028k.getBlockText().setText("");
        this.f4028k.getBlockText().setBackground(null);
        this.f4028k.getInputRoot().setVisibility(0);
        xdl0.B(this.f4028k.getBar_center_text(), false);
        this.f4019b.hideInput(this.f4028k.getBar_center_text());
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5102d();
    }

    /* JADX INFO: renamed from: u0 */
    public dqy m4846u0() {
        return this.f4029l;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m4847u1(uoy uoyVar, View view) {
        if (uoyVar instanceof apy) {
            apy apyVar = (apy) uoyVar;
            OfficialAccountsMenu officialAccountsMenuM2908l = apyVar.m2908l();
            if (!vwb.J(officialAccountsMenuM2908l.localMenus)) {
                m4766G1(officialAccountsMenuM2908l, apyVar.m2909m());
                m4802Y1(m4761D0(officialAccountsMenuM2908l.localMenus, apyVar.m2909m()), view);
            } else {
                if (!NullChecker.a(officialAccountsMenuM2908l.action)) {
                    m4766G1(officialAccountsMenuM2908l, apyVar.m2909m());
                    return;
                }
                m4766G1(officialAccountsMenuM2908l, apyVar.m2909m());
                OfficialAccountAction officialAccountAction = officialAccountsMenuM2908l.action;
                m4811c0(officialAccountAction.type, officialAccountAction.data, officialAccountsMenuM2908l.id);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m4848v0() {
        if (this.f4019b.isFinishing()) {
            return;
        }
        if (NullChecker.a(m4840r0()) && xdl0.O0(m4840r0())) {
            xdl0.M(m4840r0(), false);
        }
        if (CoreModule.P().i().k0()) {
            zvf0.u("e_chat_gift_icon", this.f4019b.pageId(), new j760[]{vwb.Y("chat_keyboard_status", this.f4018a.m6497e0().mo2063c0().m8922y0() == 2 ? "show" : "hide")});
        }
        this.f4018a.m6497e0().mo2063c0().m6499g0().mo5102d();
        ftj.d(this.f4019b, CoreGiftPanelName.get("chat"), new e30() { // from class: l.oty
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6225a.m4779N0((CoreGiftInfo) obj);
            }
        }, this.f4018a.m6497e0().mo2066l().m4295r3(), this.f4019b.pageId(), (d30) null);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m4849v1() {
        if (this.f4018a.m6497e0().mo2063c0().m8922y0() != 3) {
            pxz.f(this.f4019b.pageId(), this.f4018a.m6497e0().mo2066l().m4295r3(), "more");
            this.f4018a.m6497e0().mo2063c0().m6499g0().mo5108k(3, -1);
        } else {
            this.f4018a.m6497e0().mo2063c0().m6499g0().mo5104f();
        }
        this.f4018a.m6497e0().mo2066l().m4309t7().m7965y0(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m4850w0(Intent intent) {
        this.f4028k.getBar_center_text().setText(intent.getStringExtra("android.intent.extra.TEXT"));
        this.f4019b.post(new Runnable() { // from class: l.vty
            @Override // java.lang.Runnable
            public final void run() {
                this.f8411a.m4780O0();
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    public final void m4851w1(View view) {
        if (!CoreModule.P().i().t1()) {
            boolean zG1 = CoreModule.P().i().G1();
            MessageBar messageBar = this.f4028k;
            if (zG1) {
                if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                    m4854y1(this.f4028k.getBar_send());
                }
            } else if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                m4809b0(this.f4028k.getBar_send());
            }
        }
        m4803Z(this.f4028k.getBar_center_text());
        view.postDelayed(new Runnable() { // from class: l.euy
            @Override // java.lang.Runnable
            public final void run() {
                this.f3392a.m4827k1();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: x0 */
    public void m4852x0() {
        View view = this.f4022e;
        if (view != null && view.getVisibility() == 0) {
            this.f4022e.setVisibility(8);
        }
        View view2 = this.f4021d;
        if (view2 == null || view2.getVisibility() != 0) {
            return;
        }
        this.f4021d.setVisibility(8);
    }

    /* JADX INFO: renamed from: y0 */
    public void m4853y0() {
        MessageBar messageBar = this.f4028k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m2490R();
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m4854y1(View view) {
        dqy dqyVar = this.f4029l;
        if (dqyVar == null || (NullChecker.a(dqyVar) && !this.f4029l.m3703d0())) {
            m4830m0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m4855z0(boolean z) {
        this.f4028k.getBar_center_text().z(z & TextUtils.isEmpty(this.f4028k.getBar_center_text().getText().toString()));
    }

    /* JADX INFO: renamed from: b0 */
    public void m4809b0(View view) {
    }

    /* JADX INFO: renamed from: z1 */
    public void m4856z1(boolean z) {
    }

    /* JADX INFO: renamed from: C1 */
    public final void m4760C1(int i, View view) {
    }

    /* JADX INFO: renamed from: l.guy$a */
    public class C0317a implements TextWatcher {
        public C0317a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ("Meizu".equals(Build.BRAND) && "15".equals(Build.MODEL) && guy.this.f4018a.m8790E1()) {
                guy.this.f4028k.getBar_center_text().removeTextChangedListener(this);
                guy.this.f4028k.getBar_center_text().setText(null);
                guy.this.f4028k.getBar_center_text().addTextChangedListener(this);
                return;
            }
            String string = editable != null ? editable.toString() : null;
            if (NullChecker.a(guy.this.f4029l)) {
                guy.this.f4029l.m3724z0(TextUtils.isEmpty(string.trim()));
            }
            guy.this.f4018a.f8838c.onNext(NullChecker.a(string) ? string : "");
            if ((!CoreModule.P().i().t1() || guy.this.f4018a.m6497e0().mo2063c0().m8922y0() == 1) && string != null && !string.trim().isEmpty()) {
                if (guy.this.f4018a.m8790E1()) {
                    guy.this.f4018a.m6497e0().mo2068t0().d1();
                }
                boolean zG1 = CoreModule.P().i().G1();
                guy guyVar = guy.this;
                if (zG1) {
                    guyVar.m4854y1(guyVar.f4028k.getBar_send());
                } else {
                    guyVar.m4809b0(guyVar.f4028k.getBar_send());
                    guy guyVar2 = guy.this;
                    guyVar2.m4806a0(0, guyVar2.f4028k.getBar_send());
                }
            }
            guy guyVar3 = guy.this;
            guyVar3.f4020c = guyVar3.f4028k.getBar_center_text().getText().toString().trim();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
