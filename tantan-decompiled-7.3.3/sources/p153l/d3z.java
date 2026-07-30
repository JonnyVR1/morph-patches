package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.MessageMomentGuide;
import com.p051p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p051p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.VEditTextSougouGif;
import com.p051p1.mobile.putong.core.p058ui.messages.chatheat.MessageSpecialNotifyAct;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.p051p1.mobile.putong.core.p058ui.messages.model.record.view.RecordAnimLayout;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OfficialAccountAction;
import com.p051p1.mobile.putong.data.OfficialAccountActionType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.NotNull;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class d3z implements iam<u1z>, dyy {

    /* JADX INFO: renamed from: w */
    public static boolean f84957w = false;

    /* JADX INFO: renamed from: x */
    public static C22507a<uxj0> f84958x = C22507a.m222758b();

    /* JADX INFO: renamed from: a */
    public u1z f84959a;

    /* JADX INFO: renamed from: b */
    public MessagesAct f84960b;

    /* JADX INFO: renamed from: c */
    public String f84961c;

    /* JADX INFO: renamed from: d */
    public View f84962d;

    /* JADX INFO: renamed from: e */
    public View f84963e;

    /* JADX INFO: renamed from: f */
    public boolean f84964f;

    /* JADX INFO: renamed from: g */
    public qxy f84965g;

    /* JADX INFO: renamed from: j */
    public int f84968j;

    /* JADX INFO: renamed from: k */
    public MessageBar f84969k;

    /* JADX INFO: renamed from: l */
    public azy f84970l;

    /* JADX INFO: renamed from: q */
    public View f84975q;

    /* JADX INFO: renamed from: s */
    public View f84977s;

    /* JADX INFO: renamed from: u */
    public Animator f84979u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f84980v;

    /* JADX INFO: renamed from: h */
    public boolean f84966h = false;

    /* JADX INFO: renamed from: m */
    public final String f84971m = "giftStyleTipKey";

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f84972n = new View.OnClickListener() { // from class: l.g2z
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f101904a.m114022j1(view);
        }
    };

    /* JADX INFO: renamed from: o */
    public boolean f84973o = false;

    /* JADX INFO: renamed from: p */
    public Runnable f84974p = new RunnableC16436d();

    /* JADX INFO: renamed from: r */
    public Runnable f84976r = new RunnableC16438f();

    /* JADX INFO: renamed from: t */
    public boolean f84978t = false;

    /* JADX INFO: renamed from: i */
    public kcg0 f84967i = f84958x.subscribe(psd0.m173596G(new y20() { // from class: l.r2z
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f160991a.m114019h1((uxj0) obj);
        }
    }));

    /* JADX INFO: renamed from: l.d3z$b */
    public class ViewOnFocusChangeListenerC16434b implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC16434b() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m114056c() {
            d3z.this.m114052z0(false);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m114057d() {
            d3z.this.m114052z0(true);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d3z d3zVar = d3z.this;
            if (z) {
                d3zVar.f84959a.m143372e0().mo50158l().m111048t7().m178984y0(false);
                view.post(new Runnable() { // from class: l.e3z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f92018a.m114056c();
                    }
                });
            } else {
                d3zVar.m114020i0();
                view.post(new Runnable() { // from class: l.f3z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97016a.m114057d();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.d3z$c */
    public class RunnableC16435c implements Runnable {
        public RunnableC16435c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Editable text = d3z.this.f84969k.getBar_center_text().getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            d3z.this.f84969k.getBar_center_text().requestFocus();
            d3z.this.f84969k.getBar_center_text().setSelection(text.length());
        }
    }

    /* JADX INFO: renamed from: l.d3z$d */
    public class RunnableC16436d implements Runnable {
        public RunnableC16436d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d3z.this.f84959a.m194170E1()) {
                return;
            }
            d3z.this.m113954B1();
        }
    }

    /* JADX INFO: renamed from: l.d3z$e */
    public class ViewOnClickListenerC16437e implements View.OnClickListener {
        public ViewOnClickListenerC16437e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d3z.this.m114020i0();
        }
    }

    /* JADX INFO: renamed from: l.d3z$f */
    public class RunnableC16438f implements Runnable {
        public RunnableC16438f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d3z.this.f84975q == null) {
                return;
            }
            VText vText = (VText) d3z.this.f84975q.findViewById(edc0.f93416n2);
            Layout layout = vText.getLayout();
            if (vText.getLineCount() < 2 || !NullChecker.m82486a(layout) || layout.getEllipsisCount(1) <= 0) {
                return;
            }
            vText.setText(vText.getText().toString().substring(0, (layout.getLineStart(1) + layout.getEllipsisStart(1)) - 1).concat("...”"));
        }
    }

    /* JADX INFO: renamed from: l.d3z$g */
    public static /* synthetic */ class C16439g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84987a;

        static {
            int[] iArr = new int[MessageBarActionItemType.values().length];
            f84987a = iArr;
            try {
                iArr[MessageBarActionItemType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84987a[MessageBarActionItemType.SHI_PAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84987a[MessageBarActionItemType.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84987a[MessageBarActionItemType.PIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84987a[MessageBarActionItemType.GIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84987a[MessageBarActionItemType.MORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84987a[MessageBarActionItemType.MENU_ENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f84987a[MessageBarActionItemType.MENU_ITEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84987a[MessageBarActionItemType.BLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public d3z(MessagesAct messagesAct) {
        this.f84960b = messagesAct;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m113920L(View view) {
        CoreModule.m30933P().m143406b().mo36098Fg();
        r1j0.m179419f(R$string.f21854w3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m113935g1() {
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125462f();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m113940m(View view, float f) {
        float f2 = -f;
        view.setTranslationX(f2 - view.getWidth());
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f2 - view.getWidth(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m113944s(View view, float f) {
        float f2 = -f;
        view.setTranslationX(f2 - view.getWidth());
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f2 - view.getWidth(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: A0 */
    public void m113951A0() {
        if (CoreModule.m30933P().m143406b().mo36110Yg() && NullChecker.m82486a(this.f84969k)) {
            boolean zM146386f4 = joa.m146386f4();
            if (CoreModule.m30933P().m143406b().mo36133x3() || !zM146386f4) {
                Conversation conversationM110994j3 = this.f84959a.m143372e0().mo50158l().m110994j3();
                if (CoreModule.m30933P().m143406b().mo36112Zm(conversationM110994j3)) {
                    View messageBarRoot = this.f84969k.getMessageBarRoot();
                    VButton recoverMatchView = this.f84969k.getRecoverMatchView();
                    if (NullChecker.m82486a(recoverMatchView) && NullChecker.m82486a(messageBarRoot)) {
                        final User userMo111064x6 = this.f84959a.m143372e0().mo50158l().mo111064x6();
                        if (!NullChecker.m82486a(userMo111064x6) || userMo111064x6.unilateralBlock()) {
                            bnl0.m105524M(messageBarRoot, true);
                            bnl0.m105524M(recoverMatchView, false);
                            return;
                        }
                        if (!CoreModule.m30933P().m143406b().mo36116fq(conversationM110994j3)) {
                            m114013e0(conversationM110994j3);
                            return;
                        }
                        if (bnl0.m105529O0(recoverMatchView) && recoverMatchView.getAlpha() == 1.0f) {
                            return;
                        }
                        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125460d();
                        CoreModule.m30933P().m143406b().mo36099I7();
                        recoverMatchView.setBackgroundResource(ibc0.f114023g1);
                        recoverMatchView.setAlpha(1.0f);
                        bnl0.m105537U(recoverMatchView, qa00.f156335v);
                        recoverMatchView.setText(R$string.f21814r3);
                        bnl0.m105509E0(recoverMatchView, new View.OnClickListener() { // from class: l.z2z
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f202771a.m113979Q0(userMo111064x6, view);
                            }
                        });
                        bnl0.m105524M(messageBarRoot, false);
                        bnl0.m105524M(recoverMatchView, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m113952A1() {
        MessageBar messageBar = this.f84969k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m50573u0();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B0 */
    public void m113953B0() {
        int i;
        int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
        this.f84969k.getHidden_slide_out().getLayoutParams().height = iMax;
        ((ViewGroup.MarginLayoutParams) this.f84969k.getLayoutParams()).bottomMargin = -iMax;
        this.f84969k.getBar_send().setOnClickListener(new View.OnClickListener() { // from class: l.w1z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186855a.m113991W0(view);
            }
        });
        bnl0.m105524M(this.f84969k.getBar_send(), !CoreModule.m30933P().m143412i().mo180539t1());
        boolean zMo180539t1 = CoreModule.m30933P().m143412i().mo180539t1();
        MessageBar messageBar = this.f84969k;
        if (zMo180539t1) {
            messageBar.getBar_center_text().setImeOptions(4);
        } else {
            messageBar.getBar_center_text().setInputType(this.f84969k.getBar_center_text().getInputType() | 131072);
            this.f84969k.getBar_center_text().setImeOptions(1);
        }
        boolean z = this.f84969k.getBar_center_text() instanceof VEditTextSougouGif;
        MessageBar messageBar2 = this.f84969k;
        if (z) {
            ((VEditTextSougouGif) messageBar2.getBar_center_text()).setOnSogouGifListener(new VEditTextSougouGif.InterfaceC8681a() { // from class: l.x1z
                @Override // com.p051p1.mobile.putong.core.p058ui.messages.VEditTextSougouGif.InterfaceC8681a
                /* JADX INFO: renamed from: a */
                public final void mo50192a(Uri uri) {
                    this.f192108a.m113996Y0(uri);
                }
            });
        } else if (messageBar2.getBar_center_text() instanceof VEditTextEmojiCompat) {
            ((VEditTextEmojiCompat) this.f84969k.getBar_center_text()).setOnSogouGifListener(new VEditTextSougouGif.InterfaceC8681a() { // from class: l.y1z
                @Override // com.p051p1.mobile.putong.core.p058ui.messages.VEditTextSougouGif.InterfaceC8681a
                /* JADX INFO: renamed from: a */
                public final void mo50192a(Uri uri) {
                    this.f197154a.m113983S0(uri);
                }
            });
        }
        this.f84969k.getBar_center_text().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.z1z
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f202614a.m113985T0(textView, i2, keyEvent);
            }
        });
        this.f84969k.getBar_center_text().getInputExtras(true);
        new rcj() { // from class: l.a2z
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f68231a.m113987U0((View) obj, (MotionEvent) obj2);
            }
        };
        this.f84969k.getBar_center_text().addTextChangedListener(new C16433a());
        this.f84969k.getBar_center_text().setOnFocusChangeListener(new ViewOnFocusChangeListenerC16434b());
        Intent intent = this.f84960b.getIntent();
        if (NullChecker.m82486a(intent)) {
            String action = intent.getAction();
            String type = intent.getType();
            if ("android.intent.action.SEND".equals(action) && NullChecker.m82486a(type)) {
                if (MimeTypes.TEXT_PLAIN.equals(type)) {
                    m114047w0(intent);
                } else if (type.startsWith("image/")) {
                    this.f84959a.m194210p1(jyb.m147507f0((Uri) intent.getParcelableExtra("android.intent.extra.STREAM")));
                }
            } else if ("android.intent.action.SEND_MULTIPLE".equals(action) && NullChecker.m82486a(type) && type.startsWith("image/")) {
                this.f84959a.m194210p1(intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
            }
        }
        if (CoreModule.f18273l.m143412i().mo180477h1() && (i = this.f84968j) > 0) {
            if (i == 1) {
                m113971L1("打个招呼吧");
                this.f84969k.getBar_center_text().setSpaceHint("打个招呼吧");
                m114000Z1();
                this.f84968j = 0;
            } else if (i == 2) {
                final String str = this.f84959a.m143372e0().mo50158l().f82474c;
                this.f84959a.duringCreated(CoreModule.f18264c.f20384f0.m33682Ig(str)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.b2z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f74689a.m113989V0(str, (Boolean) obj);
                    }
                }));
            }
        }
        if (NullChecker.m82486a(intent) && NullChecker.m82486a(this.f84969k.getBar_center_text())) {
            String stringExtra = intent.getStringExtra("appendMsg");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f84969k.getBar_center_text().setText(stringExtra);
            }
            if (intent.getBooleanExtra("keyboardUp", false)) {
                l51.m152886F(this.f84960b, new RunnableC16435c());
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m113954B1() {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            if (audioBusinessTypeMo171474c == AudioBusinessType.PHONE) {
                o1j0.m165649w(R$string.f21486E3);
                return;
            } else if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
                o1j0.m165649w(R$string.f21494F3);
                return;
            } else {
                o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
                return;
            }
        }
        m600.m157133f(this.f84960b.pageId(), this.f84959a.m143372e0().mo50158l().mo111034r3(), "voice");
        if (!PermissionHelper.m81064b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81074i(this.f84960b);
            return;
        }
        this.f84969k.getBar_center_text().clearFocus();
        RecordAnimLayout recordLayout = this.f84969k.getRecordLayout();
        recordLayout.setInputRect(kqc0.m150857a(this.f84969k.getMessageBarRoot(), this.f84969k.getInputRoot(), true));
        recordLayout.m50648h();
        vqc0.m202373b(recordLayout);
        bnl0.m105524M(recordLayout, true);
        recordLayout.m50656p();
        i500 i500VarM143374g0 = this.f84959a.m143372e0().mo50160u0().m143374g0();
        this.f84969k.getRecordLayout().setRecordActionCallback(i500VarM143374g0);
        i500VarM143374g0.m138619v();
        this.f84959a.m143372e0().mo50158l().m110934X2();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f84960b;
    }

    /* JADX INFO: renamed from: D0 */
    public final PopupWindow m113956D0(List<OfficialAccountsSubMenu> list, final int i) {
        View viewInflate = p9r.m171370a(this.f84960b).inflate(qec0.f157013d4, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        viewInflate.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(edc0.f93235L2);
        linearLayout.removeAllViews();
        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        int i2 = 0;
        while (i2 < list.size()) {
            final OfficialAccountsSubMenu officialAccountsSubMenu = list.get(i2);
            LinearLayout linearLayout2 = (LinearLayout) p9r.m171370a(this.f84960b).inflate(qec0.f157020e4, (ViewGroup) null);
            viewInflate.setLayoutParams(layoutParams);
            linearLayout2.setFocusable(true);
            TextView textView = (TextView) linearLayout2.findViewById(edc0.f93424o3);
            View viewFindViewById = linearLayout2.findViewById(edc0.f93417n3);
            int i3 = i2 + 1;
            if (i3 == list.size()) {
                viewFindViewById.setVisibility(8);
                textView.setPadding(qa00.m175859d(10.0f), qa00.m175859d(12.0f), qa00.m175859d(10.0f), qa00.m175859d(17.0f));
            }
            textView.setText(officialAccountsSubMenu.text);
            final int size = list.size() - i2;
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.t2z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171837a.m113999Z0(officialAccountsSubMenu, i, size, popupWindow, view);
                }
            });
            linearLayout.addView(linearLayout2);
            m113965I1(officialAccountsSubMenu, i, size);
            i2 = i3;
        }
        return popupWindow;
    }

    /* JADX INFO: renamed from: E0 */
    public void m113957E0() {
        m113960G0(this.f84969k.getMessageBarRoot(), this.f84969k.getRecoverMatchView());
        if (h39.m133422K()) {
            m113959F1(this.f84959a.m143372e0().mo50158l().m110994j3(), CoreModule.f18264c.f20381e0.m116600p9());
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m113958E1() {
        this.f84969k.getBlockText().setVisibility(8);
        this.f84969k.getInputRoot().setVisibility(0);
        this.f84969k.getBar_send().setEnabled(true);
        this.f84965g = null;
    }

    /* JADX INFO: renamed from: F1 */
    public void m113959F1(Conversation conversation, User user) {
        if (conversation == null || TEnum.equals(conversation.status, "dismissed")) {
            return;
        }
        if (conversation.isFakeQuickChatConv() || conversation.isFakeHeartbeatConv()) {
            MessageBarOpt.MessageBarState messageBarState = MessageBarOpt.MessageBarState.DEFAULT;
            if (user.isRiskAuditAvatar()) {
                messageBarState = MessageBarOpt.MessageBarState.AVATAR_AUDIT;
            } else if (CoreModule.m30933P().m143412i().mo180391S0()) {
                messageBarState = MessageBarOpt.MessageBarState.FAKE_LOCK;
            }
            m114041t0().mo50019g(messageBarState);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m113960G0(View view, View view2) {
        if (CoreModule.m30933P().m143412i().mo180557x()) {
            Conversation conversationM110994j3 = this.f84959a.m143372e0().mo50158l().m110994j3();
            User userMo111064x6 = this.f84959a.m143372e0().mo50158l().mo111064x6();
            if (NullChecker.m82486a(conversationM110994j3) && TEnum.equals(conversationM110994j3.status, "dismissed") && !this.f84959a.m194171F1()) {
                if (CoreModule.m30933P().m143412i().mo180325G1()) {
                    bnl0.m105524M(view, false);
                }
                bnl0.m105524M(view2, true);
                this.f84964f = true;
                bnl0.m105509E0(view2, new View.OnClickListener() { // from class: l.a3z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.f68341a.m114003a1(view3);
                    }
                });
                return;
            }
            if (NullChecker.m82486a(conversationM110994j3) && TEnum.equals(conversationM110994j3.status, "deleted")) {
                this.f84960b.m68056e2();
                return;
            }
            if (!NullChecker.m82486a(userMo111064x6) || !userMo111064x6.onlineMatchLocked()) {
                act().supportInvalidateOptionsMenu();
            }
            view2.setOnClickListener(null);
            bnl0.m105524M(view2, false);
            this.f84964f = false;
            if (CoreModule.m30933P().m143412i().mo180325G1()) {
                bnl0.m105524M(view, true);
            }
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final void m113961G1(OfficialAccountsMenu officialAccountsMenu, int i) {
        i4g0.m138523u("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, jyb.m147494Y("bottom_menu_id", officialAccountsMenu.f21202id), jyb.m147494Y("official_account_id", this.f84959a.m143372e0().mo50158l().mo111034r3()), jyb.m147494Y("bottom_menu_x_axis", Integer.valueOf(i)), jyb.m147494Y("bottom_menu_y_axis", 0), jyb.m147494Y("bottom_menu_name", officialAccountsMenu.text));
    }

    /* JADX INFO: renamed from: H0 */
    public void m113962H0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageBar messageBar = this.f84969k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m50548V(warmingUpLevel);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m113963H1(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2) {
        i4g0.m138523u("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, jyb.m147494Y("bottom_menu_id", officialAccountsSubMenu.f21203id), jyb.m147494Y("official_account_id", this.f84959a.m143372e0().mo50158l().mo111034r3()), jyb.m147494Y("bottom_menu_x_axis", Integer.valueOf(i)), jyb.m147494Y("bottom_menu_y_axis", Integer.valueOf(i2)), jyb.m147494Y("bottom_menu_name", officialAccountsSubMenu.text));
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m113964I0() {
        return this.f84959a.m143372e0().mo50158l().f82456J.get().booleanValue();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m113965I1(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2) {
        i4g0.m138492A("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, jyb.m147494Y("bottom_menu_id", officialAccountsSubMenu.f21203id), jyb.m147494Y("official_account_id", this.f84959a.m143372e0().mo50158l().mo111034r3()), jyb.m147494Y("bottom_menu_x_axis", Integer.valueOf(i)), jyb.m147494Y("bottom_menu_y_axis", Integer.valueOf(i2)), jyb.m147494Y("bottom_menu_name", officialAccountsSubMenu.text));
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m113966J0() {
        return false;
    }

    /* JADX INFO: renamed from: J1 */
    public void m113967J1(boolean z) {
        this.f84959a.m143372e0().mo50158l().f82456J.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K0 */
    public void m113968K0(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, int i) {
        if (warmingUpLevel == null) {
            return;
        }
        if (i == 1) {
            mo114001a();
            l51.m152888H(this.f84960b, new Runnable() { // from class: l.u2z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177269a.m114012d1(warmingUpLevel);
                }
            }, 200L);
            return;
        }
        if (i == 2) {
            this.f84960b.startActivity(MessageSpecialNotifyAct.m50264h2(this.f84960b, this.f84959a.m143372e0().mo50158l().f82473b));
        } else if (i == 3) {
            mo114001a();
            l51.m152888H(this.f84960b, new Runnable() { // from class: l.v2z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182133a.m114014e1(warmingUpLevel);
                }
            }, 200L);
        } else if (i == 4) {
            m114046v1();
        }
    }

    /* JADX INFO: renamed from: K1 */
    public void m113969K1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f84969k.getBar_center_text().setText(str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m113970L0(View view) {
        this.f84966h = true;
    }

    /* JADX INFO: renamed from: L1 */
    public void m113971L1(String str) {
        this.f84969k.getBar_center_text().m51110y(str, 15);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m113972M0(String str) {
        this.f84966h = false;
    }

    @NotNull
    /* JADX INFO: renamed from: M1 */
    public final View m113973M1(String str, MessageMomentGuide messageMomentGuide) {
        bnl0.m105524M(this.f84960b.mo50158l().m111048t7().m178966p0(), true);
        this.f84960b.mo50158l().m111048t7().m178903L1(true);
        this.f84960b.mo50158l().m111048t7().m178907O1(true);
        this.f84960b.mo50158l().m111048t7().m178937d0();
        final View viewInflate = this.f84960b.inflater().inflate(qec0.f157024f1, (ViewGroup) null, false);
        viewInflate.setVisibility(4);
        final float dimension = viewInflate.getResources().getDimension(eac0.f92754b);
        if (this.f84960b.mo50158l().m111048t7().m178966p0().getChildCount() == 0) {
            viewInflate.post(new Runnable() { // from class: l.w2z
                @Override // java.lang.Runnable
                public final void run() {
                    d3z.m113940m(viewInflate, dimension);
                }
            });
        } else {
            viewInflate.setVisibility(0);
        }
        this.f84960b.mo50158l().m111048t7().m178921V1();
        this.f84960b.mo50158l().m111048t7().m178966p0().addView(viewInflate);
        VText vText = (VText) viewInflate.findViewById(edc0.f93193E2);
        VText vText2 = (VText) viewInflate.findViewById(edc0.f93316Z);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93444r2);
        VImage vImage = (VImage) viewInflate.findViewById(edc0.f93410m3);
        ImageView imageView = (ImageView) viewInflate.findViewById(edc0.f93250O);
        if (gta.m132210e().m132214d().mo34702I4()) {
            vText.setTextColor(this.f84960b.getResources().getColor(g9c0.f102817g));
            vText2.setTextColor(this.f84960b.getResources().getColor(g9c0.f102819i));
            imageView.setImageResource(ibc0.f113816I1);
        }
        vText.setText(str);
        vText2.setText(TextUtils.isEmpty(messageMomentGuide.desc) ? messageMomentGuide.getDefaultContent() : messageMomentGuide.desc);
        bnl0.m105524M(vImage, false);
        q3d0 q3d0Var = new q3d0(qa00.m175859d(40.0f), qa00.m175859d(40.0f));
        if (messageMomentGuide.type == 1 && !jyb.m147479J(messageMomentGuide.imageUrlList)) {
            uqb0.f180374G.m127121O0(vDraweeView, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
        } else if (messageMomentGuide.type == 2 && !jyb.m147479J(messageMomentGuide.imageUrlList)) {
            bnl0.m105524M(vImage, true);
            uqb0.f180374G.m127121O0(vDraweeView, messageMomentGuide.imageUrlList.get(0), true, false, q3d0Var, null);
        }
        bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.x2z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192211a.m114026l1(view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m113974N0(CoreGiftInfo coreGiftInfo) {
        this.f84959a.m143372e0().mo50158l().m110895O6(coreGiftInfo.f56859id);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m113975O0() {
        Editable text = this.f84969k.getBar_center_text().getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.f84969k.getBar_center_text().requestFocus();
        this.f84969k.getBar_center_text().setSelection(text.length());
    }

    /* JADX INFO: renamed from: O1 */
    public void m113976O1(int i) {
        this.f84968j = i;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m113977P0(Object obj) {
        if (NullChecker.m82486a(obj)) {
            this.f84959a.m194208n2((String) obj);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P1 */
    public final View m113978P1(CharSequence charSequence, CharSequence charSequence2) {
        bnl0.m105524M(this.f84960b.mo50158l().m111048t7().m178966p0(), true);
        this.f84960b.mo50158l().m111048t7().m178903L1(true);
        this.f84960b.mo50158l().m111048t7().m178907O1(true);
        this.f84960b.mo50158l().m111048t7().m178937d0();
        final View viewInflate = this.f84960b.inflater().inflate(qec0.f157038h1, (ViewGroup) null, false);
        viewInflate.setVisibility(4);
        final float dimension = viewInflate.getResources().getDimension(eac0.f92754b);
        if (this.f84960b.mo50158l().m111048t7().m178966p0().getChildCount() == 0) {
            viewInflate.post(new Runnable() { // from class: l.h2z
                @Override // java.lang.Runnable
                public final void run() {
                    d3z.m113944s(viewInflate, dimension);
                }
            });
        } else {
            viewInflate.setVisibility(0);
        }
        this.f84960b.mo50158l().m111048t7().m178921V1();
        LinearLayout linearLayoutM178966p0 = this.f84960b.mo50158l().m111048t7().m178966p0();
        int i = qa00.f156322i;
        linearLayoutM178966p0.setPadding(i, 0, 0, 0);
        this.f84960b.mo50158l().m111048t7().m178966p0().addView(viewInflate);
        VText vText = (VText) viewInflate.findViewById(edc0.f93193E2);
        VText vText2 = (VText) viewInflate.findViewById(edc0.f93316Z);
        View viewFindViewById = viewInflate.findViewById(edc0.f93483x);
        View viewFindViewById2 = viewInflate.findViewById(edc0.f93365g0);
        ImageView imageView = (ImageView) viewInflate.findViewById(edc0.f93250O);
        if (gta.m132210e().m132214d().mo34702I4()) {
            vText.setTextColor(this.f84960b.getResources().getColor(g9c0.f102819i));
            vText2.setTextColor(this.f84960b.getResources().getColor(g9c0.f102817g));
            viewFindViewById2.setBackgroundResource(ibc0.f113861N1);
            imageView.setImageResource(ibc0.f113816I1);
        }
        vText.setText(charSequence);
        vText2.setText(charSequence2);
        bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.i2z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112680a.m114028m1(view);
            }
        });
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM111004l3 = this.f84959a.m143372e0().mo50158l().m111004l3();
        if (warmingUpLevelM111004l3 != MessageWarmingUpHelper.WarmingUpLevel.not) {
            zfm.m219546b(viewFindViewById, MessageWarmingUpHelper.m50362i(warmingUpLevelM111004l3), i, -1, 0, 0, 0);
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m113979Q0(User user, View view) {
        CoreModule.m30933P().m143406b().mo36119l9(this.f84960b, user.f56859id);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m113980Q1(String str) {
        if (this.f84975q == null) {
            View viewInflate = this.f84960b.inflater().inflate(qec0.f157017e1, (ViewGroup) this.f84969k, false);
            this.f84975q = viewInflate;
            this.f84969k.addView(viewInflate, 0);
            boolean zMo180325G1 = CoreModule.m30933P().m143412i().mo180325G1();
            View view = this.f84975q;
            if (zMo180325G1) {
                view.setBackgroundColor(-526345);
            } else {
                view.setBackgroundColor(this.f84960b.color(g9c0.f102810a0));
            }
        }
        if (!CoreModule.m30933P().m143412i().mo180539t1()) {
            boolean zMo180325G2 = CoreModule.m30933P().m143412i().mo180325G1();
            MessageBar messageBar = this.f84969k;
            if (zMo180325G2) {
                messageBar.getBar_center_text().getText().toString().trim().isEmpty();
            } else if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                m114006b0(this.f84969k.getBar_send());
            }
        }
        m113998Z(this.f84969k.getBar_center_text());
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125462f();
        bnl0.m105500A(this.f84969k.getBar_center_text());
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            m114053z1(true);
        }
        VText vText = (VText) this.f84975q.findViewById(edc0.f93416n2);
        VImage vImage = (VImage) this.f84975q.findViewById(edc0.f93238M);
        vText.setText(String.format("“%s”", str));
        vText.post(this.f84976r);
        bnl0.m105509E0(vImage, new ViewOnClickListenerC16437e());
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(this.f84969k.getBar_center_text(), this.f84969k);
        bnl0.m105538V(vText, c16067gM105562j0.f77559a);
        bnl0.m105507D0(c16067gM105562j0.f77561c, vText);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m113981R0(Uri uri) {
        this.f84959a.m194219t2(uri);
    }

    /* JADX INFO: renamed from: R1 */
    public final void m113982R1(View view) {
        C4496a c4496a = new C4496a(this.f84960b);
        this.f84973o = true;
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(act().getString(R$string.f21880z5)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21869k(-98787).m21882y(true).m21854J(13.0f).m21863e(true).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21868j(new C4496a.c() { // from class: l.d2z
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f84841a.m114030n1(str);
            }
        }).m21874q(C4496a.f16402Q | C4496a.f16400O).m21858N(new C4496a.d() { // from class: l.e2z
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
            /* JADX INFO: renamed from: a */
            public final void mo21886a(View view2) {
                this.f91878a.m114032o1(view2);
            }
        });
        C4499d.m21895l().m21907t(c4496a, view);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m113983S0(final Uri uri) {
        PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81075j(true).m81080o(new x20() { // from class: l.q2z
            @Override // p153l.x20
            public final void call() {
                this.f155396a.m113981R0(uri);
            }
        }).m81074i(this.f84960b);
    }

    /* JADX INFO: renamed from: S1 */
    public void m113984S1(final String str) {
        if (User.isTeamAccount(this.f84959a.m143372e0().mo50158l().mo111034r3())) {
            return;
        }
        this.f84965g = new cyy(new x20() { // from class: l.y2z
            @Override // p153l.x20
            public final void call() {
                this.f197290a.m114034p1(str);
            }
        });
        this.f84969k.getBlockText().setVisibility(0);
        this.f84969k.getInputRoot().setVisibility(8);
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125460d();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ boolean m113985T0(TextView textView, int i, KeyEvent keyEvent) {
        if (!CoreModule.m30933P().m143412i().mo180539t1()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f84969k.getBar_center_text().getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m82486a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            sfj0.m185596c("e_chat_message_send", act().pageId(), new sfj0.C20032a[0]);
            this.f84972n.onClick(this.f84969k.getBar_send());
        }
        return true;
    }

    /* JADX INFO: renamed from: T1 */
    public void m113986T1() {
        m114053z1(true);
        m113998Z(this.f84969k.getBar_center_text());
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125462f();
        bnl0.m105500A(this.f84969k.getBar_center_text());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m113987U0(View view, MotionEvent motionEvent) {
        boolean zM105528O = bnl0.m105528O(view, motionEvent);
        if (motionEvent.getActionMasked() == 3) {
            this.f84959a.m143372e0().mo50160u0().m128956d1();
            return Boolean.TRUE;
        }
        if (motionEvent.getActionMasked() != 1) {
            return Boolean.FALSE;
        }
        tnw tnwVarM128954b1 = this.f84959a.m143372e0().mo50160u0().m128954b1();
        u1z u1zVar = this.f84959a;
        if (!zM105528O) {
            u1zVar.m143372e0().mo50160u0().m128956d1();
            return Boolean.TRUE;
        }
        if (u1zVar.m143372e0().mo50160u0().m143374g0().m138617q()) {
            if (NullChecker.m82486a(this.f84960b.res)) {
                this.f84959a.m143372e0().mo50158l().m110888M6(tnwVarM128954b1.m191984m(), "audio/mp3", (tnwVarM128954b1.m191990s() * 1.0f) / 1000.0f);
            }
        } else if (tnwVarM128954b1.m191991t()) {
            tnwVarM128954b1.m191980D();
        }
        if (NullChecker.m82486a(this.f84960b.res)) {
            this.f84959a.m143372e0().mo50160u0().m143374g0().m138616p();
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: U1 */
    public void m113988U1() {
        m113998Z(this.f84969k.getBar_center_text());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m113989V0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            String strConcat = (TEnum.equals(CoreModule.f18264c.f20381e0.m116503Pa(str).gender, "female") ? "她" : "他").concat("在等你回消息");
            m113986T1();
            m113971L1(strConcat);
            this.f84969k.getBar_center_text().setSpaceHint(strConcat);
        }
        this.f84968j = 0;
    }

    /* JADX INFO: renamed from: V1 */
    public void m113990V1(x20 x20Var) {
        this.f84965g = new cyy(x20Var);
        this.f84969k.getBlockText().setVisibility(0);
        this.f84969k.getBlockText().setText("");
        this.f84969k.getBlockText().setBackground(null);
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125460d();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m113991W0(View view) {
        sfj0.m185596c("e_chat_message_send", act().pageId(), new sfj0.C20032a[0]);
        this.f84972n.onClick(this.f84969k.getBar_send());
        if (CoreModule.m30933P().m143412i().mo180477h1()) {
            m113971L1(this.f84960b.getResources().getString(R$string.f21555N0));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f84960b;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m113993X0(Uri uri) {
        this.f84959a.m194219t2(uri);
    }

    /* JADX INFO: renamed from: X1 */
    public void m113994X1(String str, MessageMomentGuide messageMomentGuide) {
        m114048w1(m113973M1(str, messageMomentGuide));
    }

    /* JADX INFO: renamed from: Y */
    public void m113995Y() {
        if (m114018h0()) {
            return;
        }
        CoreModule.f18264c.f20384f0.f20673e0.m137019l(uxj0.f181467a);
        ((MessageBarOpt) this.f84969k).mo50013a();
        ((MessageBarOpt) this.f84969k).mo50018f();
        int iM201111y0 = this.f84959a.m143372e0().mo50155d0().m201111y0();
        u1z u1zVar = this.f84959a;
        if (iM201111y0 != 4) {
            u1zVar.m143372e0().mo50155d0().m143374g0().mo125465k(4, -1);
        } else {
            u1zVar.m143372e0().mo50155d0().m143374g0().mo125461e();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m113996Y0(final Uri uri) {
        PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81075j(true).m81080o(new x20() { // from class: l.c2z
            @Override // p153l.x20
            public final void call() {
                this.f79532a.m113993X0(uri);
            }
        }).m81074i(this.f84960b);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m113997Y1(PopupWindow popupWindow, View view) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int[] iArr2 = new int[2];
        m114041t0().getLocationOnScreen(iArr2);
        int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
        int iM175859d = (iArr2[1] - qa00.m175859d(5.0f)) - contentView.getMeasuredHeight();
        if (contentView.getMeasuredWidth() + width > bnl0.m105592y0() - qa00.m175859d(6.0f)) {
            width = (bnl0.m105592y0() - qa00.m175859d(6.0f)) - contentView.getMeasuredWidth();
            popupWindow.getContentView().setBackground(this.f84960b.getResources().getDrawable(ibc0.f113748A5));
        }
        popupWindow.showAtLocation(view, 51, width, iM175859d);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
    }

    /* JADX INFO: renamed from: Z */
    public void m113998Z(View view) {
        if (this.f84969k.m50017e()) {
            this.f84969k.getBar_center_text().getVisibility();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m113999Z0(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2, PopupWindow popupWindow, View view) {
        m113963H1(officialAccountsSubMenu, i, i2);
        popupWindow.dismiss();
        if (NullChecker.m82486a(officialAccountsSubMenu.action)) {
            OfficialAccountAction officialAccountAction = officialAccountsSubMenu.action;
            m114009c0(officialAccountAction.type, officialAccountAction.data, officialAccountsSubMenu.f21203id);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m114000Z1() {
        if (NullChecker.m82486a(this.f84960b.mo50158l().m111048t7().m178964o0()) && this.f84960b.mo50158l().m111048t7().m178964o0().getVisibility() == 8) {
            bnl0.m105524M(this.f84960b.mo50158l().m111048t7().m178964o0(), true);
            i4g0.m138526x("e_picture_1_send", OMSDialogPositon.p_chat_view);
            i4g0.m138526x("e_picture_2_send", OMSDialogPositon.p_chat_view);
            i4g0.m138526x("e_picture_3_send", OMSDialogPositon.p_chat_view);
            TextView textView = (TextView) this.f84960b.mo50158l().m111048t7().m178964o0().findViewById(edc0.f93405l5);
            TextView textView2 = (TextView) this.f84960b.mo50158l().m111048t7().m178964o0().findViewById(edc0.f93398k5);
            TextView textView3 = (TextView) this.f84960b.mo50158l().m111048t7().m178964o0().findViewById(edc0.f93391j5);
            bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.m2z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134634a.m114036q1(view);
                }
            });
            bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.n2z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139901a.m114038r1(view);
                }
            });
            bnl0.m105509E0(textView3, new View.OnClickListener() { // from class: l.o2z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144809a.m114040s1(view);
                }
            });
        }
    }

    @Override // p153l.dyy
    /* JADX INFO: renamed from: a */
    public void mo114001a() {
        if (m114018h0()) {
            return;
        }
        if (((MessageBarOpt) this.f84969k).f32807V) {
            sfj0.m185601h("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_emoji_entrance", "emoji"));
            sfj0.m185596c("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_emoji_entrance", "keyboard"));
        } else {
            sfj0.m185601h("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_emoji_entrance", "keyboard"));
            sfj0.m185596c("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_emoji_entrance", "emoji"));
            CoreModule.f18264c.f20384f0.f20673e0.m137019l(uxj0.f181467a);
        }
        ((MessageBarOpt) this.f84969k).mo50013a();
        ((MessageBarOpt) this.f84969k).mo50018f();
        m114035q0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m114002a0(int i, View view) {
        m113955C1(i, view);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m114003a1(View view) {
        this.f84959a.m143372e0().mo50143F().mo127917r0();
    }

    /* JADX INFO: renamed from: a2 */
    public void m114004a2() {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            if (audioBusinessTypeMo171474c == AudioBusinessType.PHONE) {
                o1j0.m165649w(R$string.f21818s);
                return;
            } else {
                o1j0.m165651y(audioBusinessTypeMo171474c.getBusinessMsg());
                return;
            }
        }
        this.f84959a.m143372e0().mo50158l().m111048t7().m178924X1();
        ((MessageBarOpt) this.f84969k).mo50013a();
        boolean zM101199d0 = this.f84970l.m101199d0();
        azy azyVar = this.f84970l;
        if (zM101199d0) {
            azyVar.m101179J(true, false);
            this.f84970l.m101173F0();
        } else {
            azyVar.m101167C0();
            i4g0.m138520r("e_live_camera", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // p153l.dyy
    /* JADX INFO: renamed from: b */
    public void mo114005b(rxy rxyVar, View view, boolean z) {
        if (m114018h0()) {
            return;
        }
        CoreModule.f18264c.f20384f0.f20670d0.m137019l(uxj0.f181467a);
        switch (C16439g.f84987a[rxyVar.m183573d().ordinal()]) {
            case 1:
                if (!rxyVar.m183574e(2)) {
                    if (!z) {
                        m114017g0(view);
                    } else {
                        m113954B1();
                    }
                } else if (!z) {
                    this.f84970l.m101177I(true);
                }
                break;
            case 2:
                if (CoreModule.m30933P().m143412i().mo180547v1()) {
                    m113982R1(view);
                }
                m114004a2();
                break;
            case 3:
                boolean zM183576g = rxyVar.m183576g();
                ((MessageBarOpt) this.f84969k).mo50013a();
                rxyVar.m183578i(!zM183576g);
                ((MessageBarOpt) this.f84969k).mo50018f();
                m114035q0();
                sfj0.m185596c("e_chat_emoji_button", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                break;
            case 4:
                sfj0.m185596c("e_chat_more_picture", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                MessagesAct messagesAct = this.f84960b;
                messagesAct.startActivityForResult(MediaPickerAct.m80102Y1(messagesAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f84960b.getString(R$string.f21721h)).withFromType(4).build()), PutongAct.REQUEST_CODE_PICKER);
                this.f84960b.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
                m600.m157133f(this.f84960b.pageId(), this.f84960b.f32488f.mo111034r3(), ReminderAction.photo);
                break;
            case 5:
                if (rxyVar.m183574e(2)) {
                    this.f84970l.m101175G0();
                }
                m114045v0();
                break;
            case 6:
                if (rxyVar.m183574e(2)) {
                    this.f84970l.m101169D0();
                }
                if (h39.m133430S() && C4499d.m21895l().m21911x("switchPicBubbleKey")) {
                    C4499d.m21895l().m21899k("switchPicBubbleKey");
                }
                boolean zM183576g2 = rxyVar.m183576g();
                ((MessageBarOpt) this.f84969k).mo50013a();
                rxyVar.m183578i(!zM183576g2);
                ((MessageBarOpt) this.f84969k).mo50018f();
                m114046v1();
                sfj0.m185596c("e_chat_more_button", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_more_status", zM183576g2 ? "on" : BLiveOperationTitleShowType.off));
                if (!zM183576g2) {
                    etx etxVarMo125458b = this.f84959a.m143372e0().mo50155d0().m143374g0().mo125458b();
                    if (NullChecker.m82486a(etxVarMo125458b)) {
                        etxVarMo125458b.m122509g();
                    }
                }
                break;
            case 7:
                boolean zM183576g3 = rxyVar.m183576g();
                ((MessageBarOpt) this.f84969k).mo50013a();
                rxyVar.m183578i(!zM183576g3);
                MessageBar messageBar = this.f84969k;
                if (!zM183576g3) {
                    ((MessageBarOpt) messageBar).m50571s0(this.f84959a.m143372e0().mo50158l().mo111034r3());
                    this.f84959a.m143372e0().mo50155d0().m143374g0().mo125465k(0, -1);
                } else {
                    ((MessageBarOpt) messageBar).m50541O();
                }
                break;
            case 8:
                m114044u1(rxyVar, view);
                break;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m114007b2(CharSequence charSequence, CharSequence charSequence2) {
        m114048w1(m113978P1(charSequence, charSequence2));
    }

    @Override // p153l.dyy
    /* JADX INFO: renamed from: c */
    public void mo114008c(MessageBarActionItemType messageBarActionItemType) {
        if (m114018h0()) {
            return;
        }
        int i = C16439g.f84987a[messageBarActionItemType.ordinal()];
    }

    /* JADX INFO: renamed from: c0 */
    public final void m114009c0(OfficialAccountActionType officialAccountActionType, String str, String str2) {
        String string = officialAccountActionType.toString();
        string.getClass();
        switch (string) {
            case "schema":
                if (!str.startsWith("tel:")) {
                    CoreModule.m30933P().m143412i().mo180426Y(act(), Uri.parse(str));
                    break;
                } else {
                    this.f84960b.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                    break;
                }
                break;
            case "text":
                this.f84959a.m143372e0().mo50158l().m110914S6(str);
                break;
            case "click":
                CoreModule.f18264c.f20384f0.m33714Ko(this.f84959a.m143372e0().mo50158l().mo111034r3(), str2);
                break;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m114010c2(int i) {
        MessageBar messageBar = this.f84969k;
        MessageBarActionItemType messageBarActionItemType = MessageBarActionItemType.MENU_ENTER;
        boolean zMo50015c = messageBar.mo50015c(messageBarActionItemType);
        MessageBar messageBar2 = this.f84969k;
        if (zMo50015c) {
            boolean zMo50016d = messageBar2.mo50016d(messageBarActionItemType);
            this.f84969k.mo50013a();
            this.f84969k.mo50020h(messageBarActionItemType, zMo50016d);
        } else {
            messageBar2.mo50013a();
        }
        if (i != 0) {
            if (i == 1) {
                this.f84969k.mo50020h(MessageBarActionItemType.EMOJI, true);
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f84969k.mo50020h(MessageBarActionItemType.MORE, true);
                return;
            }
        }
        this.f84969k.mo50018f();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u1z u1zVar) {
        this.f84959a = u1zVar;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m114012d1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        int i;
        Keyboard keyboardMo125457a = this.f84959a.m143372e0().mo50155d0().m143374g0().mo125457a();
        int i2 = warmingUpLevel.value;
        if (i2 >= MessageWarmingUpHelper.WarmingUpLevel.four.value) {
            i = 2;
        } else {
            i = i2 >= MessageWarmingUpHelper.WarmingUpLevel.second.value ? 1 : 0;
        }
        if (!NullChecker.m82486a(keyboardMo125457a.f32408f.getAdapter()) || keyboardMo125457a.f32408f.getAdapter().getCount() < i) {
            return;
        }
        keyboardMo125457a.f32412j.setSelection(keyboardMo125457a.f32408f.getAdapter().getCount() - i);
        VPager vPager = keyboardMo125457a.f32408f;
        vPager.m4178T(vPager.getAdapter().getCount() - i, false);
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f84979u)) {
            this.f84979u.cancel();
            this.f84979u = null;
        }
        if (NullChecker.m82486a(this.f84980v)) {
            this.f84980v.cancel();
            this.f84979u = null;
        }
        psd0.m173633z(this.f84967i);
    }

    /* JADX INFO: renamed from: e0 */
    public void m114013e0(Conversation conversation) {
        if (NullChecker.m82486a(this.f84969k)) {
            View messageBarRoot = this.f84969k.getMessageBarRoot();
            VButton recoverMatchView = this.f84969k.getRecoverMatchView();
            if (NullChecker.m82486a(recoverMatchView) && NullChecker.m82486a(messageBarRoot)) {
                if (conversation.f21116mm > 0) {
                    bnl0.m105524M(messageBarRoot, true);
                    bnl0.m105524M(recoverMatchView, false);
                    return;
                }
                if (!CoreModule.m30933P().m143406b().mo36123nl(conversation) || !CoreModule.m30933P().m143406b().mo36109X7(conversation)) {
                    bnl0.m105524M(messageBarRoot, true);
                    bnl0.m105524M(recoverMatchView, false);
                    return;
                }
                if (conversation.userMessageCount < 3) {
                    bnl0.m105524M(messageBarRoot, true);
                    bnl0.m105524M(recoverMatchView, false);
                    return;
                }
                if (!bnl0.m105529O0(recoverMatchView) || recoverMatchView.getAlpha() == 1.0f) {
                    this.f84959a.m143372e0().mo50155d0().m143374g0().mo125460d();
                    CoreModule.m30933P().m143406b().mo36132wo();
                    recoverMatchView.setBackgroundResource(ibc0.f113912T0);
                    recoverMatchView.setAlpha(0.6f);
                    bnl0.m105537U(recoverMatchView, qa00.f156335v);
                    recoverMatchView.setText(R$string.f21822s3);
                    bnl0.m105509E0(recoverMatchView, new View.OnClickListener() { // from class: l.f2z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            d3z.m113920L(view);
                        }
                    });
                    bnl0.m105524M(messageBarRoot, false);
                    bnl0.m105524M(recoverMatchView, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m114014e1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        Keyboard keyboardMo125457a = this.f84959a.m143372e0().mo50155d0().m143374g0().mo125457a();
        int i = warmingUpLevel.value >= MessageWarmingUpHelper.WarmingUpLevel.four.value ? 1 : 0;
        if (!NullChecker.m82486a(keyboardMo125457a.f32408f.getAdapter()) || keyboardMo125457a.f32408f.getAdapter().getCount() < i) {
            return;
        }
        keyboardMo125457a.f32412j.setSelection(keyboardMo125457a.f32408f.getAdapter().getCount() - i);
        VPager vPager = keyboardMo125457a.f32408f;
        vPager.m4178T(vPager.getAdapter().getCount() - i, false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m114015f0() {
        View viewMo50014b = this.f84969k.mo50014b(MessageBarActionItemType.SHI_PAI);
        if (viewMo50014b == null || m113964I0() || this.f84973o) {
            return;
        }
        m113982R1(viewMo50014b);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m114016f1() {
        if (o3z.m165898g().m165909o(this.f84959a.m143372e0().mo50158l().m110994j3())) {
            act().m50153T2("chat_page_enter_text", "", true);
        } else {
            CoreModule.f18273l.m143412i().showProofAgeDlg(act(), "chat_page_enter_text");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m114017g0(View view) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            r1j0.m179420g(audioBusinessTypeMo171474c == AudioBusinessType.PHONE ? k3d0.m148007c(R$string.f21486E3) : audioBusinessTypeMo171474c.getBusinessMsg());
            return;
        }
        C4496a c4496a = new C4496a(this.f84960b);
        C4499d.m21895l().m21899k("audio_tips_key");
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(this.f84960b.getString(R$string.f21714g1)).m21870l(qa00.m175859d(7.0f)).m21881x(qa00.m175859d(10.0f)).m21873p(75).m21860b(3000L).m21857M(true).m21858N(new C4496a.d() { // from class: l.j2z
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
            /* JADX INFO: renamed from: a */
            public final void mo21886a(View view2) {
                this.f118131a.m113970L0(view2);
            }
        }).m21868j(new C4496a.c() { // from class: l.k2z
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f123673a.m113972M0(str);
            }
        }).m21874q(C4496a.f16402Q | C4496a.f16400O);
        if (gta.m132210e().m132214d().mo34702I4()) {
            c4496a.m21869k(this.f84960b.color(g9c0.f102820j));
        }
        C4499d.m21895l().m21908u(c4496a, view, "audio_tips_key");
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m114018h0() {
        if (NullChecker.m82486a(this.f84965g)) {
            return this.f84965g.mo113255a();
        }
        return false;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m114019h1(uxj0 uxj0Var) {
        if (NullChecker.m82486a(this.f84970l) && this.f84970l.m101199d0()) {
            this.f84970l.m101174G();
        } else if (NullChecker.m82486a(this.f84959a)) {
            l51.m152888H(this.f84969k.getContext(), new Runnable() { // from class: l.c3z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79653a.m113935g1();
                }
            }, 150L);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m114020i0() {
        View childAt = this.f84969k.getChildAt(0);
        View view = this.f84975q;
        if (childAt == view) {
            this.f84969k.removeView(view);
            this.f84975q = null;
        }
        this.f84959a.m143372e0().mo50158l().mo110880K6(null);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f84969k = (MessageBar) layoutInflater.inflate(qec0.f157031g1, viewGroup, false);
        if (CoreModule.m30933P().m143412i().mo180314E() && this.f84959a.m143372e0().mo50158l().mo110970e4()) {
            this.f84969k.getBar_center_text().m51108w();
        }
        if (this.f84969k instanceof MessageBarOpt) {
            if (User.isBusinessAI1V1(this.f84959a.m143372e0().mo50158l().mo111034r3())) {
                ((MessageBarOpt) this.f84969k).m50543Q(true);
            }
            ((MessageBarOpt) this.f84969k).m50545S(uxy.m198551b(this.f84959a.m143372e0().mo50158l().mo111034r3(), this.f84959a.m143372e0().mo50158l().mo110970e4()), this);
            this.f84969k.getRecordLayout().setInputRootLayout(this.f84969k.getInputContent());
            this.f84970l = new azy((MessageBarOpt) this.f84969k, this);
            ((MessageBarOpt) this.f84969k).m50572t0(new y20() { // from class: l.v1z
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182035a.m113977P0(obj);
                }
            });
        }
        return this.f84969k;
    }

    /* JADX INFO: renamed from: j0 */
    public void m114021j0() {
        m114041t0().getBarWrapper().removeView(this.f84959a.m143372e0().mo50163x0().m143374g0().f126961a);
        m114041t0().getBar_center_text().setEnabled(true);
        m114041t0().getBar_center_text().setFocusable(true);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m114022j1(View view) {
        clz<? extends DbObject, ?> clzVarMo50158l = this.f84959a.m143372e0().mo50158l();
        this.f84959a.m194213q2(this.f84969k.getBar_center_text().getText(), this.f84969k.getBar_center_text().getAtIdList());
        if (clzVarMo50158l.mo110939Y2()) {
            clzVarMo50158l.m110857F6();
            m113984S1(clzVarMo50158l.mo111034r3());
            this.f84969k.getBar_send().setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m114023k0() {
        this.f84960b.mo50158l().m111048t7().m178921V1();
        bnl0.m105524M(this.f84960b.mo50158l().m111048t7().m178966p0(), false);
        this.f84960b.mo50158l().m111048t7().m178903L1(false);
        this.f84960b.mo50158l().m111048t7().m178907O1(false);
        this.f84959a.m143372e0().mo50158l().m110963c7(null);
        this.f84959a.m143372e0().mo50158l().m110968d7(null);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m114024k1() {
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125462f();
        bnl0.m105500A(this.f84969k.getBar_center_text());
    }

    /* JADX INFO: renamed from: l0 */
    public void m114025l0() {
        int iM201111y0 = this.f84959a.m143372e0().mo50155d0().m201111y0();
        u1z u1zVar = this.f84959a;
        if (iM201111y0 != 1) {
            u1zVar.m143372e0().mo50155d0().m143374g0().mo125465k(1, -1);
            m600.m157133f(this.f84960b.pageId(), this.f84959a.m143372e0().mo50158l().mo111034r3(), "emoji");
        } else {
            u1zVar.m143372e0().mo50155d0().m143374g0().mo125462f();
        }
        this.f84959a.m143372e0().mo50158l().m111048t7().m178984y0(false);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m114026l1(View view) {
        m114023k0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m114027m0() {
        View view = this.f84962d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m114028m1(View view) {
        m114023k0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m114029n0() {
        m113954B1();
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m114030n1(String str) {
        this.f84973o = false;
    }

    /* JADX INFO: renamed from: o0 */
    public void m114031o0() {
        this.f84969k.getRecordLayout().m50645e();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m114032o1(View view) {
        m113967J1(true);
    }

    /* JADX INFO: renamed from: p0 */
    public void m114033p0() {
        if (this.f84966h) {
            this.f84966h = false;
            C4499d.m21895l().m21899k("audio_tips_key");
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m114034p1(String str) {
        act().m50152S2("", str);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m114035q0() {
        if (h39.m133430S() && C4499d.m21895l().m21911x("switchPicBubbleKey")) {
            C4499d.m21895l().m21899k("switchPicBubbleKey");
        }
        m114025l0();
        Keyboard keyboardMo125457a = this.f84959a.m143372e0().mo50155d0().m143374g0().mo125457a();
        if (!NullChecker.m82486a(this.f84970l) || !this.f84970l.m101199d0()) {
            keyboardMo125457a.f32408f.setScrollble(true);
            return;
        }
        keyboardMo125457a.f32408f.setScrollble(false);
        keyboardMo125457a.f32408f.setCurrentItem(0);
        this.f84970l.m101169D0();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m114036q1(View view) {
        i4g0.m138520r("e_picture_1_send", OMSDialogPositon.p_chat_view);
        clz<? extends DbObject, ?> clzVarMo50158l = this.f84959a.m143372e0().mo50158l();
        this.f84959a.m194213q2(new SpannableStringBuilder("[暗中观察]"), this.f84969k.getBar_center_text().getAtIdList());
        if (clzVarMo50158l.mo110939Y2()) {
            clzVarMo50158l.m110857F6();
            m113984S1(clzVarMo50158l.mo111034r3());
            this.f84969k.getBar_send().setEnabled(false);
        }
        m113971L1(this.f84960b.getResources().getString(R$string.f21555N0));
        bnl0.m105524M(this.f84960b.mo50158l().m111048t7().m178964o0(), false);
    }

    /* JADX INFO: renamed from: r0 */
    public View m114037r0() {
        return this.f84977s;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m114038r1(View view) {
        i4g0.m138520r("e_picture_2_send", OMSDialogPositon.p_chat_view);
        clz<? extends DbObject, ?> clzVarMo50158l = this.f84959a.m143372e0().mo50158l();
        this.f84959a.m194213q2(new SpannableStringBuilder("[摆手]"), this.f84969k.getBar_center_text().getAtIdList());
        if (clzVarMo50158l.mo110939Y2()) {
            clzVarMo50158l.m110857F6();
            m113984S1(clzVarMo50158l.mo111034r3());
            this.f84969k.getBar_send().setEnabled(false);
        }
        m113971L1(this.f84960b.getResources().getString(R$string.f21555N0));
        bnl0.m105524M(this.f84960b.mo50158l().m111048t7().m178964o0(), false);
    }

    /* JADX INFO: renamed from: s0 */
    public String m114039s0() {
        return this.f84969k.getBar_center_text().getText().toString().trim();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m114040s1(View view) {
        i4g0.m138520r("e_picture_3_send", OMSDialogPositon.p_chat_view);
        clz<? extends DbObject, ?> clzVarMo50158l = this.f84959a.m143372e0().mo50158l();
        this.f84959a.m194213q2(new SpannableStringBuilder("[嘿哈]"), this.f84969k.getBar_center_text().getAtIdList());
        if (clzVarMo50158l.mo110939Y2()) {
            clzVarMo50158l.m110857F6();
            m113984S1(clzVarMo50158l.mo111034r3());
            this.f84969k.getBar_send().setEnabled(false);
        }
        m113971L1(this.f84960b.getResources().getString(R$string.f21555N0));
        bnl0.m105524M(this.f84960b.mo50158l().m111048t7().m178964o0(), false);
    }

    /* JADX INFO: renamed from: t0 */
    public MessageBar m114041t0() {
        return this.f84969k;
    }

    /* JADX INFO: renamed from: t1 */
    public void m114042t1(boolean z) {
        if (!z) {
            if (this.f84959a.m143372e0().mo50158l().mo110939Y2()) {
                this.f84959a.m143372e0().mo50158l().m110857F6();
                m113984S1(this.f84959a.m143372e0().mo50158l().mo111034r3());
                return;
            } else {
                this.f84965g = null;
                this.f84969k.getBlockText().setVisibility(8);
                this.f84969k.getInputRoot().setVisibility(0);
                return;
            }
        }
        this.f84965g = new cyy(new x20() { // from class: l.p2z
            @Override // p153l.x20
            public final void call() {
                this.f150346a.m114016f1();
            }
        });
        this.f84969k.getBlockText().setVisibility(0);
        this.f84969k.getBlockText().setText("");
        this.f84969k.getBlockText().setBackground(null);
        this.f84969k.getInputRoot().setVisibility(0);
        bnl0.m105502B(this.f84969k.getBar_center_text(), false);
        this.f84960b.hideInput(this.f84969k.getBar_center_text());
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125460d();
    }

    /* JADX INFO: renamed from: u0 */
    public azy m114043u0() {
        return this.f84970l;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m114044u1(rxy rxyVar, View view) {
        if (rxyVar instanceof xxy) {
            xxy xxyVar = (xxy) rxyVar;
            OfficialAccountsMenu officialAccountsMenuM213596l = xxyVar.m213596l();
            if (!jyb.m147479J(officialAccountsMenuM213596l.localMenus)) {
                m113961G1(officialAccountsMenuM213596l, xxyVar.m213597m());
                m113997Y1(m113956D0(officialAccountsMenuM213596l.localMenus, xxyVar.m213597m()), view);
            } else {
                if (!NullChecker.m82486a(officialAccountsMenuM213596l.action)) {
                    m113961G1(officialAccountsMenuM213596l, xxyVar.m213597m());
                    return;
                }
                m113961G1(officialAccountsMenuM213596l, xxyVar.m213597m());
                OfficialAccountAction officialAccountAction = officialAccountsMenuM213596l.action;
                m114009c0(officialAccountAction.type, officialAccountAction.data, officialAccountsMenuM213596l.f21202id);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m114045v0() {
        if (this.f84960b.isFinishing()) {
            return;
        }
        if (NullChecker.m82486a(m114037r0()) && bnl0.m105529O0(m114037r0())) {
            bnl0.m105524M(m114037r0(), false);
        }
        if (CoreModule.m30933P().m143412i().mo180491k0()) {
            i4g0.m138523u("e_chat_gift_icon", this.f84960b.pageId(), jyb.m147494Y("chat_keyboard_status", this.f84959a.m143372e0().mo50155d0().m201111y0() == 2 ? "show" : "hide"));
        }
        this.f84959a.m143372e0().mo50155d0().m143374g0().mo125460d();
        vvj.m203016d(this.f84960b, CoreGiftPanelName.get("chat"), new y20() { // from class: l.l2z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129822a.m113974N0((CoreGiftInfo) obj);
            }
        }, this.f84959a.m143372e0().mo50158l().mo111034r3(), this.f84960b.pageId(), null);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m114046v1() {
        if (this.f84959a.m143372e0().mo50155d0().m201111y0() != 3) {
            m600.m157133f(this.f84960b.pageId(), this.f84959a.m143372e0().mo50158l().mo111034r3(), "more");
            this.f84959a.m143372e0().mo50155d0().m143374g0().mo125465k(3, -1);
        } else {
            this.f84959a.m143372e0().mo50155d0().m143374g0().mo125462f();
        }
        this.f84959a.m143372e0().mo50158l().m111048t7().m178984y0(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m114047w0(Intent intent) {
        this.f84969k.getBar_center_text().setText(intent.getStringExtra("android.intent.extra.TEXT"));
        this.f84960b.post(new Runnable() { // from class: l.s2z
            @Override // java.lang.Runnable
            public final void run() {
                this.f165945a.m113975O0();
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    public final void m114048w1(View view) {
        if (!CoreModule.m30933P().m143412i().mo180539t1()) {
            boolean zMo180325G1 = CoreModule.m30933P().m143412i().mo180325G1();
            MessageBar messageBar = this.f84969k;
            if (zMo180325G1) {
                if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                    m114051y1(this.f84969k.getBar_send());
                }
            } else if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                m114006b0(this.f84969k.getBar_send());
            }
        }
        m113998Z(this.f84969k.getBar_center_text());
        view.postDelayed(new Runnable() { // from class: l.b3z
            @Override // java.lang.Runnable
            public final void run() {
                this.f74838a.m114024k1();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: x0 */
    public void m114049x0() {
        View view = this.f84963e;
        if (view != null && view.getVisibility() == 0) {
            this.f84963e.setVisibility(8);
        }
        View view2 = this.f84962d;
        if (view2 == null || view2.getVisibility() != 0) {
            return;
        }
        this.f84962d.setVisibility(8);
    }

    /* JADX INFO: renamed from: y0 */
    public void m114050y0() {
        MessageBar messageBar = this.f84969k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m50544R();
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m114051y1(View view) {
        azy azyVar = this.f84970l;
        if (azyVar == null || (NullChecker.m82486a(azyVar) && !this.f84970l.m101199d0())) {
            m114027m0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m114052z0(boolean z) {
        this.f84969k.getBar_center_text().m51111z(z & TextUtils.isEmpty(this.f84969k.getBar_center_text().getText().toString()));
    }

    /* JADX INFO: renamed from: b0 */
    public void m114006b0(View view) {
    }

    /* JADX INFO: renamed from: z1 */
    public void m114053z1(boolean z) {
    }

    /* JADX INFO: renamed from: C1 */
    public final void m113955C1(int i, View view) {
    }

    /* JADX INFO: renamed from: l.d3z$a */
    public class C16433a implements TextWatcher {
        public C16433a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ("Meizu".equals(Build.BRAND) && com.tencent.connect.common.Constants.VIA_REPORT_TYPE_WPA_STATE.equals(Build.MODEL) && d3z.this.f84959a.m194170E1()) {
                d3z.this.f84969k.getBar_center_text().removeTextChangedListener(this);
                d3z.this.f84969k.getBar_center_text().setText((CharSequence) null);
                d3z.this.f84969k.getBar_center_text().addTextChangedListener(this);
                return;
            }
            String string = editable != null ? editable.toString() : null;
            if (NullChecker.m82486a(d3z.this.f84970l)) {
                d3z.this.f84970l.m101220z0(TextUtils.isEmpty(string.trim()));
            }
            d3z.this.f84959a.f177148c.m137019l(NullChecker.m82486a(string) ? string : "");
            if ((!CoreModule.m30933P().m143412i().mo180539t1() || d3z.this.f84959a.m143372e0().mo50155d0().m201111y0() == 1) && string != null && !string.trim().isEmpty()) {
                if (d3z.this.f84959a.m194170E1()) {
                    d3z.this.f84959a.m143372e0().mo50160u0().m128956d1();
                }
                boolean zMo180325G1 = CoreModule.m30933P().m143412i().mo180325G1();
                d3z d3zVar = d3z.this;
                if (zMo180325G1) {
                    d3zVar.m114051y1(d3zVar.f84969k.getBar_send());
                } else {
                    d3zVar.m114006b0(d3zVar.f84969k.getBar_send());
                    d3z d3zVar2 = d3z.this;
                    d3zVar2.m114002a0(0, d3zVar2.f84969k.getBar_send());
                }
            }
            d3z d3zVar3 = d3z.this;
            d3zVar3.f84961c = d3zVar3.f84969k.getBar_center_text().getText().toString().trim();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
