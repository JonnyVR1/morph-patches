package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.MessageMomentGuide;
import com.p046p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p046p1.mobile.putong.core.data.OfficialAccountsSubMenu;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.VEditTextSougouGif;
import com.p046p1.mobile.putong.core.p053ui.messages.chatheat.MessageSpecialNotifyAct;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.p046p1.mobile.putong.core.p053ui.messages.model.record.view.RecordAnimLayout;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OfficialAccountAction;
import com.p046p1.mobile.putong.data.OfficialAccountActionType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.eclipse.jetty.http.MimeTypes;
import org.jetbrains.annotations.NotNull;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class guy implements s7m<xsy>, gpy {

    /* JADX INFO: renamed from: w */
    public static boolean f104485w = false;

    /* JADX INFO: renamed from: x */
    public static C22392a<roj0> f104486x = C22392a.m221512b();

    /* JADX INFO: renamed from: a */
    public xsy f104487a;

    /* JADX INFO: renamed from: b */
    public MessagesAct f104488b;

    /* JADX INFO: renamed from: c */
    public String f104489c;

    /* JADX INFO: renamed from: d */
    public View f104490d;

    /* JADX INFO: renamed from: e */
    public View f104491e;

    /* JADX INFO: renamed from: f */
    public boolean f104492f;

    /* JADX INFO: renamed from: g */
    public toy f104493g;

    /* JADX INFO: renamed from: j */
    public int f104496j;

    /* JADX INFO: renamed from: k */
    public MessageBar f104497k;

    /* JADX INFO: renamed from: l */
    public dqy f104498l;

    /* JADX INFO: renamed from: q */
    public View f104503q;

    /* JADX INFO: renamed from: s */
    public View f104505s;

    /* JADX INFO: renamed from: u */
    public Animator f104507u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f104508v;

    /* JADX INFO: renamed from: h */
    public boolean f104494h = false;

    /* JADX INFO: renamed from: m */
    public final String f104499m = "giftStyleTipKey";

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f104500n = new View.OnClickListener() { // from class: l.jty
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f119693a.m128191j1(view);
        }
    };

    /* JADX INFO: renamed from: o */
    public boolean f104501o = false;

    /* JADX INFO: renamed from: p */
    public Runnable f104502p = new RunnableC17161d();

    /* JADX INFO: renamed from: r */
    public Runnable f104504r = new RunnableC17163f();

    /* JADX INFO: renamed from: t */
    public boolean f104506t = false;

    /* JADX INFO: renamed from: i */
    public c4g0 f104495i = f104486x.subscribe(mkd0.m154955G(new e30() { // from class: l.uty
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f178306a.m128188h1((roj0) obj);
        }
    }));

    /* JADX INFO: renamed from: l.guy$b */
    public class ViewOnFocusChangeListenerC17159b implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC17159b() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m128225c() {
            guy.this.m128221z0(false);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m128226d() {
            guy.this.m128221z0(true);
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            guy guyVar = guy.this;
            if (z) {
                guyVar.f104487a.m156455e0().mo48974l().m120842t7().m190339y0(false);
                view.post(new Runnable() { // from class: l.huy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f109600a.m128225c();
                    }
                });
            } else {
                guyVar.m128189i0();
                view.post(new Runnable() { // from class: l.iuy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f115063a.m128226d();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l.guy$c */
    public class RunnableC17160c implements Runnable {
        public RunnableC17160c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Editable text = guy.this.f104497k.getBar_center_text().getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            guy.this.f104497k.getBar_center_text().requestFocus();
            guy.this.f104497k.getBar_center_text().setSelection(text.length());
        }
    }

    /* JADX INFO: renamed from: l.guy$d */
    public class RunnableC17161d implements Runnable {
        public RunnableC17161d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (guy.this.f104487a.m210892E1()) {
                return;
            }
            guy.this.m128126B1();
        }
    }

    /* JADX INFO: renamed from: l.guy$e */
    public class ViewOnClickListenerC17162e implements View.OnClickListener {
        public ViewOnClickListenerC17162e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            guy.this.m128189i0();
        }
    }

    /* JADX INFO: renamed from: l.guy$f */
    public class RunnableC17163f implements Runnable {
        public RunnableC17163f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (guy.this.f104503q == null) {
                return;
            }
            VText vText = (VText) guy.this.f104503q.findViewById(y4c0.f196181n2);
            Layout layout = vText.getLayout();
            if (vText.getLineCount() < 2 || !NullChecker.m81303a(layout) || layout.getEllipsisCount(1) <= 0) {
                return;
            }
            vText.setText(vText.getText().toString().substring(0, (layout.getLineStart(1) + layout.getEllipsisStart(1)) - 1).concat("...”"));
        }
    }

    /* JADX INFO: renamed from: l.guy$g */
    public static /* synthetic */ class C17164g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104515a;

        static {
            int[] iArr = new int[MessageBarActionItemType.values().length];
            f104515a = iArr;
            try {
                iArr[MessageBarActionItemType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104515a[MessageBarActionItemType.SHI_PAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104515a[MessageBarActionItemType.EMOJI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104515a[MessageBarActionItemType.PIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f104515a[MessageBarActionItemType.GIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f104515a[MessageBarActionItemType.MORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f104515a[MessageBarActionItemType.MENU_ENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f104515a[MessageBarActionItemType.MENU_ITEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f104515a[MessageBarActionItemType.BLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public guy(MessagesAct messagesAct) {
        this.f104488b = messagesAct;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m128092L(View view) {
        CoreModule.m29935P().m94652b().mo35095Fg();
        osi0.m165782f(R$string.f21112w3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m128107g1() {
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134707f();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m128112m(View view, float f) {
        float f2 = -f;
        view.setTranslationX(f2 - view.getWidth());
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f2 - view.getWidth(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m128116s(View view, float f) {
        float f2 = -f;
        view.setTranslationX(f2 - view.getWidth());
        view.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", f2 - view.getWidth(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: A0 */
    public void m128123A0() {
        if (CoreModule.m29935P().m94652b().mo35107Yg() && NullChecker.m81303a(this.f104497k)) {
            boolean zM210071e4 = xma.m210071e4();
            if (CoreModule.m29935P().m94652b().mo35130x3() || !zM210071e4) {
                Conversation conversationM120788j3 = this.f104487a.m156455e0().mo48974l().m120788j3();
                if (CoreModule.m29935P().m94652b().mo35109Zm(conversationM120788j3)) {
                    View messageBarRoot = this.f104497k.getMessageBarRoot();
                    VButton recoverMatchView = this.f104497k.getRecoverMatchView();
                    if (NullChecker.m81303a(recoverMatchView) && NullChecker.m81303a(messageBarRoot)) {
                        final User userMo120858x6 = this.f104487a.m156455e0().mo48974l().mo120858x6();
                        if (!NullChecker.m81303a(userMo120858x6) || userMo120858x6.unilateralBlock()) {
                            xdl0.m208344M(messageBarRoot, true);
                            xdl0.m208344M(recoverMatchView, false);
                            return;
                        }
                        if (!CoreModule.m29935P().m94652b().mo35113fq(conversationM120788j3)) {
                            m128182e0(conversationM120788j3);
                            return;
                        }
                        if (xdl0.m208349O0(recoverMatchView) && recoverMatchView.getAlpha() == 1.0f) {
                            return;
                        }
                        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134705d();
                        CoreModule.m29935P().m94652b().mo35096I7();
                        recoverMatchView.setBackgroundResource(c3c0.f78748g1);
                        recoverMatchView.setAlpha(1.0f);
                        xdl0.m208357U(recoverMatchView, t100.f167273v);
                        recoverMatchView.setText(R$string.f21072r3);
                        xdl0.m208329E0(recoverMatchView, new View.OnClickListener() { // from class: l.cuy
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f82607a.m128151Q0(userMo120858x6, view);
                            }
                        });
                        xdl0.m208344M(messageBarRoot, false);
                        xdl0.m208344M(recoverMatchView, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m128124A1() {
        MessageBar messageBar = this.f104497k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m49390u0();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B0 */
    public void m128125B0() {
        int i;
        int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue());
        this.f104497k.getHidden_slide_out().getLayoutParams().height = iMax;
        ((ViewGroup.MarginLayoutParams) this.f104497k.getLayoutParams()).bottomMargin = -iMax;
        this.f104497k.getBar_send().setOnClickListener(new View.OnClickListener() { // from class: l.zsy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204652a.m128163W0(view);
            }
        });
        xdl0.m208344M(this.f104497k.getBar_send(), !CoreModule.m29935P().m94658i().mo158447t1());
        boolean zMo158447t1 = CoreModule.m29935P().m94658i().mo158447t1();
        MessageBar messageBar = this.f104497k;
        if (zMo158447t1) {
            messageBar.getBar_center_text().setImeOptions(4);
        } else {
            messageBar.getBar_center_text().setInputType(this.f104497k.getBar_center_text().getInputType() | 131072);
            this.f104497k.getBar_center_text().setImeOptions(1);
        }
        boolean z = this.f104497k.getBar_center_text() instanceof VEditTextSougouGif;
        MessageBar messageBar2 = this.f104497k;
        if (z) {
            ((VEditTextSougouGif) messageBar2.getBar_center_text()).setOnSogouGifListener(new VEditTextSougouGif.InterfaceC8518a() { // from class: l.aty
                @Override // com.p046p1.mobile.putong.core.p053ui.messages.VEditTextSougouGif.InterfaceC8518a
                /* JADX INFO: renamed from: a */
                public final void mo49009a(Uri uri) {
                    this.f71692a.m128168Y0(uri);
                }
            });
        } else if (messageBar2.getBar_center_text() instanceof VEditTextEmojiCompat) {
            ((VEditTextEmojiCompat) this.f104497k.getBar_center_text()).setOnSogouGifListener(new VEditTextSougouGif.InterfaceC8518a() { // from class: l.bty
                @Override // com.p046p1.mobile.putong.core.p053ui.messages.VEditTextSougouGif.InterfaceC8518a
                /* JADX INFO: renamed from: a */
                public final void mo49009a(Uri uri) {
                    this.f77271a.m128155S0(uri);
                }
            });
        }
        this.f104497k.getBar_center_text().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.cty
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f82513a.m128157T0(textView, i2, keyEvent);
            }
        });
        this.f104497k.getBar_center_text().getInputExtras(true);
        new x9j() { // from class: l.dty
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f87912a.m128159U0((View) obj, (MotionEvent) obj2);
            }
        };
        this.f104497k.getBar_center_text().addTextChangedListener(new C17158a());
        this.f104497k.getBar_center_text().setOnFocusChangeListener(new ViewOnFocusChangeListenerC17159b());
        Intent intent = this.f104488b.getIntent();
        if (NullChecker.m81303a(intent)) {
            String action = intent.getAction();
            String type = intent.getType();
            if ("android.intent.action.SEND".equals(action) && NullChecker.m81303a(type)) {
                if (MimeTypes.TEXT_PLAIN.equals(type)) {
                    m128216w0(intent);
                } else if (type.startsWith("image/")) {
                    this.f104487a.m210932p1(vwb.m200324f0((Uri) intent.getParcelableExtra("android.intent.extra.STREAM")));
                }
            } else if ("android.intent.action.SEND_MULTIPLE".equals(action) && NullChecker.m81303a(type) && type.startsWith("image/")) {
                this.f104487a.m210932p1(intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
            }
        }
        if (CoreModule.f17554l.m94658i().mo158385h1() && (i = this.f104496j) > 0) {
            if (i == 1) {
                m128143L1("打个招呼吧");
                this.f104497k.getBar_center_text().setSpaceHint("打个招呼吧");
                m128172Z1();
                this.f104496j = 0;
            } else if (i == 2) {
                final String str = this.f104487a.m156455e0().mo48974l().f96911c;
                this.f104487a.duringCreated(CoreModule.f17545c.f19642f0.m32679Ig(str)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.ety
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f93195a.m128161V0(str, (Boolean) obj);
                    }
                }));
            }
        }
        if (NullChecker.m81303a(intent) && NullChecker.m81303a(this.f104497k.getBar_center_text())) {
            String stringExtra = intent.getStringExtra("appendMsg");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f104497k.getBar_center_text().setText(stringExtra);
            }
            if (intent.getBooleanExtra("keyboardUp", false)) {
                e51.m114741F(this.f104488b, new RunnableC17160c());
            }
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m128126B1() {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            if (audioBusinessTypeMo135235c == AudioBusinessType.PHONE) {
                lsi0.m151593w(R$string.f20744E3);
                return;
            } else if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
                lsi0.m151593w(R$string.f20752F3);
                return;
            } else {
                lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
                return;
            }
        }
        pxz.m171969f(this.f104488b.pageId(), this.f104487a.m156455e0().mo48974l().mo120828r3(), "voice");
        if (!PermissionHelper.m79881b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79891i(this.f104488b);
            return;
        }
        this.f104497k.getBar_center_text().clearFocus();
        RecordAnimLayout recordLayout = this.f104497k.getRecordLayout();
        recordLayout.setInputRect(dic0.m111871a(this.f104497k.getMessageBarRoot(), this.f104497k.getInputRoot(), true));
        recordLayout.m49465h();
        oic0.m164505b(recordLayout);
        xdl0.m208344M(recordLayout, true);
        recordLayout.m49473p();
        lwz lwzVarM156457g0 = this.f104487a.m156455e0().mo48976t0().m156457g0();
        this.f104497k.getRecordLayout().setRecordActionCallback(lwzVarM156457g0);
        lwzVarM156457g0.m152037v();
        this.f104487a.m156455e0().mo48974l().m120728X2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f104488b;
    }

    /* JADX INFO: renamed from: D0 */
    public final PopupWindow m128128D0(List<OfficialAccountsSubMenu> list, final int i) {
        View viewInflate = o7r.m163037a(this.f104488b).inflate(l6c0.f126457d4, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        viewInflate.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(y4c0.f196000L2);
        linearLayout.removeAllViews();
        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        int i2 = 0;
        while (i2 < list.size()) {
            final OfficialAccountsSubMenu officialAccountsSubMenu = list.get(i2);
            LinearLayout linearLayout2 = (LinearLayout) o7r.m163037a(this.f104488b).inflate(l6c0.f126464e4, (ViewGroup) null);
            viewInflate.setLayoutParams(layoutParams);
            linearLayout2.setFocusable(true);
            TextView textView = (TextView) linearLayout2.findViewById(y4c0.f196189o3);
            View viewFindViewById = linearLayout2.findViewById(y4c0.f196182n3);
            int i3 = i2 + 1;
            if (i3 == list.size()) {
                viewFindViewById.setVisibility(8);
                textView.setPadding(t100.m186890d(10.0f), t100.m186890d(12.0f), t100.m186890d(10.0f), t100.m186890d(17.0f));
            }
            textView.setText(officialAccountsSubMenu.text);
            final int size = list.size() - i2;
            textView.setOnClickListener(new View.OnClickListener() { // from class: l.wty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188063a.m128171Z0(officialAccountsSubMenu, i, size, popupWindow, view);
                }
            });
            linearLayout.addView(linearLayout2);
            m128137I1(officialAccountsSubMenu, i, size);
            i2 = i3;
        }
        return popupWindow;
    }

    /* JADX INFO: renamed from: E0 */
    public void m128129E0() {
        m128132G0(this.f104497k.getMessageBarRoot(), this.f104497k.getRecoverMatchView());
        if (y19.m212151K()) {
            m128131F1(this.f104487a.m156455e0().mo48974l().m120788j3(), CoreModule.f17545c.f19639e0.m169527p9());
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m128130E1() {
        this.f104497k.getBlockText().setVisibility(8);
        this.f104497k.getInputRoot().setVisibility(0);
        this.f104497k.getBar_send().setEnabled(true);
        this.f104493g = null;
    }

    /* JADX INFO: renamed from: F1 */
    public void m128131F1(Conversation conversation, User user) {
        if (conversation == null || TEnum.equals(conversation.status, "dismissed")) {
            return;
        }
        if (conversation.isFakeQuickChatConv() || conversation.isFakeHeartbeatConv()) {
            MessageBarOpt.MessageBarState messageBarState = MessageBarOpt.MessageBarState.DEFAULT;
            if (user.isRiskAuditAvatar()) {
                messageBarState = MessageBarOpt.MessageBarState.AVATAR_AUDIT;
            } else if (CoreModule.m29935P().m94658i().mo158299S0()) {
                messageBarState = MessageBarOpt.MessageBarState.FAKE_LOCK;
            }
            m128210t0().mo48836g(messageBarState);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m128132G0(View view, View view2) {
        if (CoreModule.m29935P().m94658i().mo158465x()) {
            Conversation conversationM120788j3 = this.f104487a.m156455e0().mo48974l().m120788j3();
            User userMo120858x6 = this.f104487a.m156455e0().mo48974l().mo120858x6();
            if (NullChecker.m81303a(conversationM120788j3) && TEnum.equals(conversationM120788j3.status, "dismissed") && !this.f104487a.m210893F1()) {
                if (CoreModule.m29935P().m94658i().mo158233G1()) {
                    xdl0.m208344M(view, false);
                }
                xdl0.m208344M(view2, true);
                this.f104492f = true;
                xdl0.m208329E0(view2, new View.OnClickListener() { // from class: l.duy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.f88021a.m128174a1(view3);
                    }
                });
                return;
            }
            if (NullChecker.m81303a(conversationM120788j3) && TEnum.equals(conversationM120788j3.status, "deleted")) {
                this.f104488b.m66873d2();
                return;
            }
            if (!NullChecker.m81303a(userMo120858x6) || !userMo120858x6.onlineMatchLocked()) {
                act().supportInvalidateOptionsMenu();
            }
            view2.setOnClickListener(null);
            xdl0.m208344M(view2, false);
            this.f104492f = false;
            if (CoreModule.m29935P().m94658i().mo158233G1()) {
                xdl0.m208344M(view, true);
            }
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final void m128133G1(OfficialAccountsMenu officialAccountsMenu, int i) {
        zvf0.m220399u("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, vwb.m200311Y("bottom_menu_id", officialAccountsMenu.f20460id), vwb.m200311Y("official_account_id", this.f104487a.m156455e0().mo48974l().mo120828r3()), vwb.m200311Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.m200311Y("bottom_menu_y_axis", 0), vwb.m200311Y("bottom_menu_name", officialAccountsMenu.text));
    }

    /* JADX INFO: renamed from: H0 */
    public void m128134H0(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageBar messageBar = this.f104497k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m49365V(warmingUpLevel);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m128135H1(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2) {
        zvf0.m220399u("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, vwb.m200311Y("bottom_menu_id", officialAccountsSubMenu.f20461id), vwb.m200311Y("official_account_id", this.f104487a.m156455e0().mo48974l().mo120828r3()), vwb.m200311Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.m200311Y("bottom_menu_y_axis", Integer.valueOf(i2)), vwb.m200311Y("bottom_menu_name", officialAccountsSubMenu.text));
    }

    /* JADX INFO: renamed from: I0 */
    public final boolean m128136I0() {
        return this.f104487a.m156455e0().mo48974l().f96893J.get().booleanValue();
    }

    /* JADX INFO: renamed from: I1 */
    public final void m128137I1(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2) {
        zvf0.m220368A("e_official_account_bottom_menu", OMSDialogPositon.p_chat_view, vwb.m200311Y("bottom_menu_id", officialAccountsSubMenu.f20461id), vwb.m200311Y("official_account_id", this.f104487a.m156455e0().mo48974l().mo120828r3()), vwb.m200311Y("bottom_menu_x_axis", Integer.valueOf(i)), vwb.m200311Y("bottom_menu_y_axis", Integer.valueOf(i2)), vwb.m200311Y("bottom_menu_name", officialAccountsSubMenu.text));
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m128138J0() {
        return false;
    }

    /* JADX INFO: renamed from: J1 */
    public void m128139J1(boolean z) {
        this.f104487a.m156455e0().mo48974l().f96893J.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: K0 */
    public void m128140K0(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, int i) {
        if (warmingUpLevel == null) {
            return;
        }
        if (i == 1) {
            mo127499a();
            e51.m114743H(this.f104488b, new Runnable() { // from class: l.xty
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194449a.m128181d1(warmingUpLevel);
                }
            }, 200L);
            return;
        }
        if (i == 2) {
            this.f104488b.startActivity(MessageSpecialNotifyAct.m49081g2(this.f104488b, this.f104487a.m156455e0().mo48974l().f96910b));
        } else if (i == 3) {
            mo127499a();
            e51.m114743H(this.f104488b, new Runnable() { // from class: l.yty
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200032a.m128183e1(warmingUpLevel);
                }
            }, 200L);
        } else if (i == 4) {
            m128215v1();
        }
    }

    /* JADX INFO: renamed from: K1 */
    public void m128141K1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f104497k.getBar_center_text().setText(str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m128142L0(View view) {
        this.f104494h = true;
    }

    /* JADX INFO: renamed from: L1 */
    public void m128143L1(String str) {
        this.f104497k.getBar_center_text().m49927y(str, 15);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m128144M0(String str) {
        this.f104494h = false;
    }

    @NotNull
    /* JADX INFO: renamed from: M1 */
    public final View m128145M1(String str, MessageMomentGuide messageMomentGuide) {
        xdl0.m208344M(this.f104488b.mo48974l().m120842t7().m190322p0(), true);
        this.f104488b.mo48974l().m120842t7().m190262L1(true);
        this.f104488b.mo48974l().m120842t7().m190265O1(true);
        this.f104488b.mo48974l().m120842t7().m190294d0();
        final View viewInflate = this.f104488b.inflater().inflate(l6c0.f126468f1, (ViewGroup) null, false);
        viewInflate.setVisibility(4);
        final float dimension = viewInflate.getResources().getDimension(x1c0.f189047b);
        if (this.f104488b.mo48974l().m120842t7().m190322p0().getChildCount() == 0) {
            viewInflate.post(new Runnable() { // from class: l.zty
                @Override // java.lang.Runnable
                public final void run() {
                    guy.m128112m(viewInflate, dimension);
                }
            });
        } else {
            viewInflate.setVisibility(0);
        }
        this.f104488b.mo48974l().m120842t7().m190278V1();
        this.f104488b.mo48974l().m120842t7().m190322p0().addView(viewInflate);
        VText vText = (VText) viewInflate.findViewById(y4c0.f195958E2);
        VText vText2 = (VText) viewInflate.findViewById(y4c0.f196081Z);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196209r2);
        VImage vImage = (VImage) viewInflate.findViewById(y4c0.f196175m3);
        ImageView imageView = (ImageView) viewInflate.findViewById(y4c0.f196015O);
        if (ura.m195053e().m195057d().mo33699I4()) {
            vText.setTextColor(this.f104488b.getResources().getColor(a1c0.f67153g));
            vText2.setTextColor(this.f104488b.getResources().getColor(a1c0.f67155i));
            imageView.setImageResource(c3c0.f78541I1);
        }
        vText.setText(str);
        vText2.setText(TextUtils.isEmpty(messageMomentGuide.desc) ? messageMomentGuide.getDefaultContent() : messageMomentGuide.desc);
        xdl0.m208344M(vImage, false);
        nvc0 nvc0Var = new nvc0(t100.m186890d(40.0f), t100.m186890d(40.0f));
        if (messageMomentGuide.type == 1 && !vwb.m200296J(messageMomentGuide.imageUrlList)) {
            qib0.f154691G.m102337O0(vDraweeView, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
        } else if (messageMomentGuide.type == 2 && !vwb.m200296J(messageMomentGuide.imageUrlList)) {
            xdl0.m208344M(vImage, true);
            qib0.f154691G.m102337O0(vDraweeView, messageMomentGuide.imageUrlList.get(0), true, false, nvc0Var, null);
        }
        xdl0.m208329E0(imageView, new View.OnClickListener() { // from class: l.auy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71874a.m128195l1(view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m128146N0(CoreGiftInfo coreGiftInfo) {
        this.f104487a.m156455e0().mo48974l().m120689O6(coreGiftInfo.f56011id);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m128147O0() {
        Editable text = this.f104497k.getBar_center_text().getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.f104497k.getBar_center_text().requestFocus();
        this.f104497k.getBar_center_text().setSelection(text.length());
    }

    /* JADX INFO: renamed from: O1 */
    public void m128148O1(int i) {
        this.f104496j = i;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m128149P0(Object obj) {
        if (NullChecker.m81303a(obj)) {
            this.f104487a.m210930n2((String) obj);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P1 */
    public final View m128150P1(CharSequence charSequence, CharSequence charSequence2) {
        xdl0.m208344M(this.f104488b.mo48974l().m120842t7().m190322p0(), true);
        this.f104488b.mo48974l().m120842t7().m190262L1(true);
        this.f104488b.mo48974l().m120842t7().m190265O1(true);
        this.f104488b.mo48974l().m120842t7().m190294d0();
        final View viewInflate = this.f104488b.inflater().inflate(l6c0.f126482h1, (ViewGroup) null, false);
        viewInflate.setVisibility(4);
        final float dimension = viewInflate.getResources().getDimension(x1c0.f189047b);
        if (this.f104488b.mo48974l().m120842t7().m190322p0().getChildCount() == 0) {
            viewInflate.post(new Runnable() { // from class: l.kty
                @Override // java.lang.Runnable
                public final void run() {
                    guy.m128116s(viewInflate, dimension);
                }
            });
        } else {
            viewInflate.setVisibility(0);
        }
        this.f104488b.mo48974l().m120842t7().m190278V1();
        LinearLayout linearLayoutM190322p0 = this.f104488b.mo48974l().m120842t7().m190322p0();
        int i = t100.f167260i;
        linearLayoutM190322p0.setPadding(i, 0, 0, 0);
        this.f104488b.mo48974l().m120842t7().m190322p0().addView(viewInflate);
        VText vText = (VText) viewInflate.findViewById(y4c0.f195958E2);
        VText vText2 = (VText) viewInflate.findViewById(y4c0.f196081Z);
        View viewFindViewById = viewInflate.findViewById(y4c0.f196248x);
        View viewFindViewById2 = viewInflate.findViewById(y4c0.f196130g0);
        ImageView imageView = (ImageView) viewInflate.findViewById(y4c0.f196015O);
        if (ura.m195053e().m195057d().mo33699I4()) {
            vText.setTextColor(this.f104488b.getResources().getColor(a1c0.f67155i));
            vText2.setTextColor(this.f104488b.getResources().getColor(a1c0.f67153g));
            viewFindViewById2.setBackgroundResource(c3c0.f78586N1);
            imageView.setImageResource(c3c0.f78541I1);
        }
        vText.setText(charSequence);
        vText2.setText(charSequence2);
        xdl0.m208329E0(imageView, new View.OnClickListener() { // from class: l.lty
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130021a.m128197m1(view);
            }
        });
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM120798l3 = this.f104487a.m156455e0().mo48974l().m120798l3();
        if (warmingUpLevelM120798l3 != MessageWarmingUpHelper.WarmingUpLevel.not) {
            jdm.m141040b(viewFindViewById, MessageWarmingUpHelper.m49179i(warmingUpLevelM120798l3), i, -1, 0, 0, 0);
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m128151Q0(User user, View view) {
        CoreModule.m29935P().m94652b().mo35116l9(this.f104488b, user.f56011id);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m128152Q1(String str) {
        if (this.f104503q == null) {
            View viewInflate = this.f104488b.inflater().inflate(l6c0.f126461e1, (ViewGroup) this.f104497k, false);
            this.f104503q = viewInflate;
            this.f104497k.addView(viewInflate, 0);
            boolean zMo158233G1 = CoreModule.m29935P().m94658i().mo158233G1();
            View view = this.f104503q;
            if (zMo158233G1) {
                view.setBackgroundColor(-526345);
            } else {
                view.setBackgroundColor(this.f104488b.color(a1c0.f67146a0));
            }
        }
        if (!CoreModule.m29935P().m94658i().mo158447t1()) {
            boolean zMo158233G2 = CoreModule.m29935P().m94658i().mo158233G1();
            MessageBar messageBar = this.f104497k;
            if (zMo158233G2) {
                messageBar.getBar_center_text().getText().toString().trim().isEmpty();
            } else if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                m128176b0(this.f104497k.getBar_send());
            }
        }
        m128170Z(this.f104497k.getBar_center_text());
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134707f();
        xdl0.m208320A(this.f104497k.getBar_center_text());
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            m128222z1(true);
        }
        VText vText = (VText) this.f104503q.findViewById(y4c0.f196181n2);
        VImage vImage = (VImage) this.f104503q.findViewById(y4c0.f196003M);
        vText.setText(String.format("“%s”", str));
        vText.post(this.f104504r);
        xdl0.m208329E0(vImage, new ViewOnClickListenerC17162e());
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(this.f104497k.getBar_center_text(), this.f104497k);
        xdl0.m208358V(vText, c21104gM208382j0.f192418a);
        xdl0.m208327D0(c21104gM208382j0.f192420c, vText);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m128153R0(Uri uri) {
        this.f104487a.m210941t2(uri);
    }

    /* JADX INFO: renamed from: R1 */
    public final void m128154R1(View view) {
        C4345a c4345a = new C4345a(this.f104488b);
        this.f104501o = true;
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D(act().getString(R$string.f21138z5)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20870k(-98787).m20883y(true).m20855J(13.0f).m20864e(true).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20869j(new C4345a.c() { // from class: l.gty
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f104361a.m128199n1(str);
            }
        }).m20875q(C4345a.f15683Q | C4345a.f15681O).m20859N(new C4345a.d() { // from class: l.hty
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
            /* JADX INFO: renamed from: a */
            public final void mo20887a(View view2) {
                this.f109454a.m128201o1(view2);
            }
        });
        C4348d.m20896l().m20908t(c4345a, view);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m128155S0(final Uri uri) {
        PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79892j(true).m79897o(new d30() { // from class: l.tty
            @Override // p149l.d30
            public final void call() {
                this.f172105a.m128153R0(uri);
            }
        }).m79891i(this.f104488b);
    }

    /* JADX INFO: renamed from: S1 */
    public void m128156S1(final String str) {
        if (User.isTeamAccount(this.f104487a.m156455e0().mo48974l().mo120828r3())) {
            return;
        }
        this.f104493g = new fpy(new d30() { // from class: l.buy
            @Override // p149l.d30
            public final void call() {
                this.f77383a.m128203p1(str);
            }
        });
        this.f104497k.getBlockText().setVisibility(0);
        this.f104497k.getInputRoot().setVisibility(8);
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134705d();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ boolean m128157T0(TextView textView, int i, KeyEvent keyEvent) {
        if (!CoreModule.m29935P().m94658i().mo158447t1()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f104497k.getBar_center_text().getText().toString().trim())) {
            return true;
        }
        if (i == 4 || i == 6 || (NullChecker.m81303a(keyEvent) && 66 == keyEvent.getKeyCode() && keyEvent.getAction() == 0)) {
            o6j0.m162859c("e_chat_message_send", act().pageId(), new o6j0.C18854a[0]);
            this.f104500n.onClick(this.f104497k.getBar_send());
        }
        return true;
    }

    /* JADX INFO: renamed from: T1 */
    public void m128158T1() {
        m128222z1(true);
        m128170Z(this.f104497k.getBar_center_text());
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134707f();
        xdl0.m208320A(this.f104497k.getBar_center_text());
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m128159U0(View view, MotionEvent motionEvent) {
        boolean zM208348O = xdl0.m208348O(view, motionEvent);
        if (motionEvent.getActionMasked() == 3) {
            this.f104487a.m156455e0().mo48976t0().m143741d1();
            return Boolean.TRUE;
        }
        if (motionEvent.getActionMasked() != 1) {
            return Boolean.FALSE;
        }
        ukw ukwVarM143739b1 = this.f104487a.m156455e0().mo48976t0().m143739b1();
        xsy xsyVar = this.f104487a;
        if (!zM208348O) {
            xsyVar.m156455e0().mo48976t0().m143741d1();
            return Boolean.TRUE;
        }
        if (xsyVar.m156455e0().mo48976t0().m156457g0().m152035q()) {
            if (NullChecker.m81303a(this.f104488b.res)) {
                this.f104487a.m156455e0().mo48974l().m120682M6(ukwVarM143739b1.m194196m(), "audio/mp3", (ukwVarM143739b1.m194202s() * 1.0f) / 1000.0f);
            }
        } else if (ukwVarM143739b1.m194203t()) {
            ukwVarM143739b1.m194192D();
        }
        if (NullChecker.m81303a(this.f104488b.res)) {
            this.f104487a.m156455e0().mo48976t0().m156457g0().m152034p();
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: U1 */
    public void m128160U1() {
        m128170Z(this.f104497k.getBar_center_text());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m128161V0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            String strConcat = (TEnum.equals(CoreModule.f17545c.f19639e0.m169430Pa(str).gender, "female") ? "她" : "他").concat("在等你回消息");
            m128158T1();
            m128143L1(strConcat);
            this.f104497k.getBar_center_text().setSpaceHint(strConcat);
        }
        this.f104496j = 0;
    }

    /* JADX INFO: renamed from: V1 */
    public void m128162V1(d30 d30Var) {
        this.f104493g = new fpy(d30Var);
        this.f104497k.getBlockText().setVisibility(0);
        this.f104497k.getBlockText().setText("");
        this.f104497k.getBlockText().setBackground(null);
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134705d();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m128163W0(View view) {
        o6j0.m162859c("e_chat_message_send", act().pageId(), new o6j0.C18854a[0]);
        this.f104500n.onClick(this.f104497k.getBar_send());
        if (CoreModule.m29935P().m94658i().mo158385h1()) {
            m128143L1(this.f104488b.getResources().getString(R$string.f20813N0));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f104488b;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m128165X0(Uri uri) {
        this.f104487a.m210941t2(uri);
    }

    /* JADX INFO: renamed from: X1 */
    public void m128166X1(String str, MessageMomentGuide messageMomentGuide) {
        m128217w1(m128145M1(str, messageMomentGuide));
    }

    /* JADX INFO: renamed from: Y */
    public void m128167Y() {
        if (m128187h0()) {
            return;
        }
        CoreModule.f17545c.f19642f0.f19931e0.m132487l(roj0.f160388a);
        ((MessageBarOpt) this.f104497k).mo48830a();
        ((MessageBarOpt) this.f104497k).mo48835f();
        int iM213066y0 = this.f104487a.m156455e0().mo48971c0().m213066y0();
        xsy xsyVar = this.f104487a;
        if (iM213066y0 != 4) {
            xsyVar.m156455e0().mo48971c0().m156457g0().mo134710k(4, -1);
        } else {
            xsyVar.m156455e0().mo48971c0().m156457g0().mo134706e();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m128168Y0(final Uri uri) {
        PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79892j(true).m79897o(new d30() { // from class: l.fty
            @Override // p149l.d30
            public final void call() {
                this.f99291a.m128165X0(uri);
            }
        }).m79891i(this.f104488b);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m128169Y1(PopupWindow popupWindow, View view) {
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        View contentView = popupWindow.getContentView();
        contentView.measure(0, 0);
        int[] iArr2 = new int[2];
        m128210t0().getLocationOnScreen(iArr2);
        int width = (iArr[0] + (view.getWidth() / 2)) - (contentView.getMeasuredWidth() / 2);
        int iM186890d = (iArr2[1] - t100.m186890d(5.0f)) - contentView.getMeasuredHeight();
        if (contentView.getMeasuredWidth() + width > xdl0.m208412y0() - t100.m186890d(6.0f)) {
            width = (xdl0.m208412y0() - t100.m186890d(6.0f)) - contentView.getMeasuredWidth();
            popupWindow.getContentView().setBackground(this.f104488b.getResources().getDrawable(c3c0.f78473A5));
        }
        popupWindow.showAtLocation(view, 51, width, iM186890d);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.update();
    }

    /* JADX INFO: renamed from: Z */
    public void m128170Z(View view) {
        if (this.f104497k.m48834e()) {
            this.f104497k.getBar_center_text().getVisibility();
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m128171Z0(OfficialAccountsSubMenu officialAccountsSubMenu, int i, int i2, PopupWindow popupWindow, View view) {
        m128135H1(officialAccountsSubMenu, i, i2);
        popupWindow.dismiss();
        if (NullChecker.m81303a(officialAccountsSubMenu.action)) {
            OfficialAccountAction officialAccountAction = officialAccountsSubMenu.action;
            m128178c0(officialAccountAction.type, officialAccountAction.data, officialAccountsSubMenu.f20461id);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m128172Z1() {
        if (NullChecker.m81303a(this.f104488b.mo48974l().m120842t7().m190320o0()) && this.f104488b.mo48974l().m120842t7().m190320o0().getVisibility() == 8) {
            xdl0.m208344M(this.f104488b.mo48974l().m120842t7().m190320o0(), true);
            zvf0.m220402x("e_picture_1_send", OMSDialogPositon.p_chat_view);
            zvf0.m220402x("e_picture_2_send", OMSDialogPositon.p_chat_view);
            zvf0.m220402x("e_picture_3_send", OMSDialogPositon.p_chat_view);
            TextView textView = (TextView) this.f104488b.mo48974l().m120842t7().m190320o0().findViewById(y4c0.f196170l5);
            TextView textView2 = (TextView) this.f104488b.mo48974l().m120842t7().m190320o0().findViewById(y4c0.f196163k5);
            TextView textView3 = (TextView) this.f104488b.mo48974l().m120842t7().m190320o0().findViewById(y4c0.f196156j5);
            xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.pty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151234a.m128205q1(view);
                }
            });
            xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.qty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156408a.m128207r1(view);
                }
            });
            xdl0.m208329E0(textView3, new View.OnClickListener() { // from class: l.rty
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161010a.m128209s1(view);
                }
            });
        }
    }

    @Override // p149l.gpy
    /* JADX INFO: renamed from: a */
    public void mo127499a() {
        if (m128187h0()) {
            return;
        }
        if (((MessageBarOpt) this.f104497k).f31959V) {
            o6j0.m162864h("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_emoji_entrance", "emoji"));
            o6j0.m162859c("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_emoji_entrance", "keyboard"));
        } else {
            o6j0.m162864h("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_emoji_entrance", "keyboard"));
            o6j0.m162859c("e_chat_emoji_entrance", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_emoji_entrance", "emoji"));
            CoreModule.f17545c.f19642f0.f19931e0.m132487l(roj0.f160388a);
        }
        ((MessageBarOpt) this.f104497k).mo48830a();
        ((MessageBarOpt) this.f104497k).mo48835f();
        m128204q0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m128173a0(int i, View view) {
        m128127C1(i, view);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m128174a1(View view) {
        this.f104487a.m156455e0().mo48959E().mo137242r0();
    }

    /* JADX INFO: renamed from: a2 */
    public void m128175a2() {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            if (audioBusinessTypeMo135235c == AudioBusinessType.PHONE) {
                lsi0.m151593w(R$string.f21076s);
                return;
            } else {
                lsi0.m151595y(audioBusinessTypeMo135235c.getBusinessMsg());
                return;
            }
        }
        this.f104487a.m156455e0().mo48974l().m120842t7().m190281X1();
        ((MessageBarOpt) this.f104497k).mo48830a();
        boolean zM113220d0 = this.f104498l.m113220d0();
        dqy dqyVar = this.f104498l;
        if (zM113220d0) {
            dqyVar.m113200J(true, false);
            this.f104498l.m113194F0();
        } else {
            dqyVar.m113188C0();
            zvf0.m220396r("e_live_camera", OMSDialogPositon.p_chat_view);
        }
    }

    @Override // p149l.gpy
    /* JADX INFO: renamed from: b */
    public void mo127500b(uoy uoyVar, View view, boolean z) {
        if (m128187h0()) {
            return;
        }
        CoreModule.f17545c.f19642f0.f19928d0.m132487l(roj0.f160388a);
        switch (C17164g.f104515a[uoyVar.m194573d().ordinal()]) {
            case 1:
                if (!uoyVar.m194574e(2)) {
                    if (!z) {
                        m128186g0(view);
                    } else {
                        m128126B1();
                    }
                } else if (!z) {
                    this.f104498l.m113198I(true);
                }
                break;
            case 2:
                if (CoreModule.m29935P().m94658i().mo158455v1()) {
                    m128154R1(view);
                }
                m128175a2();
                break;
            case 3:
                boolean zM194576g = uoyVar.m194576g();
                ((MessageBarOpt) this.f104497k).mo48830a();
                uoyVar.m194578i(!zM194576g);
                ((MessageBarOpt) this.f104497k).mo48835f();
                m128204q0();
                o6j0.m162859c("e_chat_emoji_button", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                break;
            case 4:
                o6j0.m162859c("e_chat_more_picture", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                MessagesAct messagesAct = this.f104488b;
                messagesAct.startActivityForResult(MediaPickerAct.m78919X1(messagesAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f104488b.getString(R$string.f20979h)).withFromType(4).build()), PutongAct.REQUEST_CODE_PICKER);
                this.f104488b.overridePendingTransition(szb0.f167030e, szb0.f167026a);
                pxz.m171969f(this.f104488b.pageId(), this.f104488b.f31640f.mo120828r3(), ReminderAction.photo);
                break;
            case 5:
                if (uoyVar.m194574e(2)) {
                    this.f104498l.m113196G0();
                }
                m128214v0();
                break;
            case 6:
                if (uoyVar.m194574e(2)) {
                    this.f104498l.m113190D0();
                }
                if (y19.m212159S() && C4348d.m20896l().m20912x("switchPicBubbleKey")) {
                    C4348d.m20896l().m20900k("switchPicBubbleKey");
                }
                boolean zM194576g2 = uoyVar.m194576g();
                ((MessageBarOpt) this.f104497k).mo48830a();
                uoyVar.m194578i(!zM194576g2);
                ((MessageBarOpt) this.f104497k).mo48835f();
                m128215v1();
                o6j0.m162859c("e_chat_more_button", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_more_status", zM194576g2 ? "on" : BLiveOperationTitleShowType.off));
                if (!zM194576g2) {
                    hkx hkxVarMo134703b = this.f104487a.m156455e0().mo48971c0().m156457g0().mo134703b();
                    if (NullChecker.m81303a(hkxVarMo134703b)) {
                        hkxVarMo134703b.m131606g();
                    }
                }
                break;
            case 7:
                boolean zM194576g3 = uoyVar.m194576g();
                ((MessageBarOpt) this.f104497k).mo48830a();
                uoyVar.m194578i(!zM194576g3);
                MessageBar messageBar = this.f104497k;
                if (!zM194576g3) {
                    ((MessageBarOpt) messageBar).m49388s0(this.f104487a.m156455e0().mo48974l().mo120828r3());
                    this.f104487a.m156455e0().mo48971c0().m156457g0().mo134710k(0, -1);
                } else {
                    ((MessageBarOpt) messageBar).m49358O();
                }
                break;
            case 8:
                m128213u1(uoyVar, view);
                break;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m128177b2(CharSequence charSequence, CharSequence charSequence2) {
        m128217w1(m128150P1(charSequence, charSequence2));
    }

    @Override // p149l.gpy
    /* JADX INFO: renamed from: c */
    public void mo127501c(MessageBarActionItemType messageBarActionItemType) {
        if (m128187h0()) {
            return;
        }
        int i = C17164g.f104515a[messageBarActionItemType.ordinal()];
    }

    /* JADX INFO: renamed from: c0 */
    public final void m128178c0(OfficialAccountActionType officialAccountActionType, String str, String str2) {
        String string = officialAccountActionType.toString();
        string.getClass();
        switch (string) {
            case "schema":
                if (!str.startsWith("tel:")) {
                    CoreModule.m29935P().m94658i().mo158334Y(act(), Uri.parse(str));
                    break;
                } else {
                    this.f104488b.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                    break;
                }
                break;
            case "text":
                this.f104487a.m156455e0().mo48974l().m120708S6(str);
                break;
            case "click":
                CoreModule.f17545c.f19642f0.m32711Ko(this.f104487a.m156455e0().mo48974l().mo120828r3(), str2);
                break;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m128179c2(int i) {
        MessageBar messageBar = this.f104497k;
        MessageBarActionItemType messageBarActionItemType = MessageBarActionItemType.MENU_ENTER;
        boolean zMo48832c = messageBar.mo48832c(messageBarActionItemType);
        MessageBar messageBar2 = this.f104497k;
        if (zMo48832c) {
            boolean zMo48833d = messageBar2.mo48833d(messageBarActionItemType);
            this.f104497k.mo48830a();
            this.f104497k.mo48837h(messageBarActionItemType, zMo48833d);
        } else {
            messageBar2.mo48830a();
        }
        if (i != 0) {
            if (i == 1) {
                this.f104497k.mo48837h(MessageBarActionItemType.EMOJI, true);
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f104497k.mo48837h(MessageBarActionItemType.MORE, true);
                return;
            }
        }
        this.f104497k.mo48835f();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xsy xsyVar) {
        this.f104487a = xsyVar;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m128181d1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        int i;
        Keyboard keyboardMo134702a = this.f104487a.m156455e0().mo48971c0().m156457g0().mo134702a();
        int i2 = warmingUpLevel.value;
        if (i2 >= MessageWarmingUpHelper.WarmingUpLevel.four.value) {
            i = 2;
        } else {
            i = i2 >= MessageWarmingUpHelper.WarmingUpLevel.second.value ? 1 : 0;
        }
        if (!NullChecker.m81303a(keyboardMo134702a.f31560f.getAdapter()) || keyboardMo134702a.f31560f.getAdapter().getCount() < i) {
            return;
        }
        keyboardMo134702a.f31564j.setSelection(keyboardMo134702a.f31560f.getAdapter().getCount() - i);
        VPager vPager = keyboardMo134702a.f31560f;
        vPager.m4176T(vPager.getAdapter().getCount() - i, false);
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f104507u)) {
            this.f104507u.cancel();
            this.f104507u = null;
        }
        if (NullChecker.m81303a(this.f104508v)) {
            this.f104508v.cancel();
            this.f104507u = null;
        }
        mkd0.m154992z(this.f104495i);
    }

    /* JADX INFO: renamed from: e0 */
    public void m128182e0(Conversation conversation) {
        if (NullChecker.m81303a(this.f104497k)) {
            View messageBarRoot = this.f104497k.getMessageBarRoot();
            VButton recoverMatchView = this.f104497k.getRecoverMatchView();
            if (NullChecker.m81303a(recoverMatchView) && NullChecker.m81303a(messageBarRoot)) {
                if (conversation.f20374mm > 0) {
                    xdl0.m208344M(messageBarRoot, true);
                    xdl0.m208344M(recoverMatchView, false);
                    return;
                }
                if (!CoreModule.m29935P().m94652b().mo35120nl(conversation) || !CoreModule.m29935P().m94652b().mo35106X7(conversation)) {
                    xdl0.m208344M(messageBarRoot, true);
                    xdl0.m208344M(recoverMatchView, false);
                    return;
                }
                if (conversation.userMessageCount < 3) {
                    xdl0.m208344M(messageBarRoot, true);
                    xdl0.m208344M(recoverMatchView, false);
                    return;
                }
                if (!xdl0.m208349O0(recoverMatchView) || recoverMatchView.getAlpha() == 1.0f) {
                    this.f104487a.m156455e0().mo48971c0().m156457g0().mo134705d();
                    CoreModule.m29935P().m94652b().mo35129wo();
                    recoverMatchView.setBackgroundResource(c3c0.f78637T0);
                    recoverMatchView.setAlpha(0.6f);
                    xdl0.m208357U(recoverMatchView, t100.f167273v);
                    recoverMatchView.setText(R$string.f21080s3);
                    xdl0.m208329E0(recoverMatchView, new View.OnClickListener() { // from class: l.ity
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            guy.m128092L(view);
                        }
                    });
                    xdl0.m208344M(messageBarRoot, false);
                    xdl0.m208344M(recoverMatchView, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m128183e1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        Keyboard keyboardMo134702a = this.f104487a.m156455e0().mo48971c0().m156457g0().mo134702a();
        int i = warmingUpLevel.value >= MessageWarmingUpHelper.WarmingUpLevel.four.value ? 1 : 0;
        if (!NullChecker.m81303a(keyboardMo134702a.f31560f.getAdapter()) || keyboardMo134702a.f31560f.getAdapter().getCount() < i) {
            return;
        }
        keyboardMo134702a.f31564j.setSelection(keyboardMo134702a.f31560f.getAdapter().getCount() - i);
        VPager vPager = keyboardMo134702a.f31560f;
        vPager.m4176T(vPager.getAdapter().getCount() - i, false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m128184f0() {
        View viewMo48831b = this.f104497k.mo48831b(MessageBarActionItemType.SHI_PAI);
        if (viewMo48831b == null || m128136I0() || this.f104501o) {
            return;
        }
        m128154R1(viewMo48831b);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m128185f1() {
        if (ruy.m181215g().m181226o(this.f104487a.m156455e0().mo48974l().m120788j3())) {
            act().m48969S2("chat_page_enter_text", "", true);
        } else {
            CoreModule.f17554l.m94658i().showProofAgeDlg(act(), "chat_page_enter_text");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m128186g0(View view) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            osi0.m165783g(audioBusinessTypeMo135235c == AudioBusinessType.PHONE ? hvc0.m133156c(R$string.f20744E3) : audioBusinessTypeMo135235c.getBusinessMsg());
            return;
        }
        C4345a c4345a = new C4345a(this.f104488b);
        C4348d.m20896l().m20900k("audio_tips_key");
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D(this.f104488b.getString(R$string.f20972g1)).m20871l(t100.m186890d(7.0f)).m20882x(t100.m186890d(10.0f)).m20874p(75).m20861b(3000L).m20858M(true).m20859N(new C4345a.d() { // from class: l.mty
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
            /* JADX INFO: renamed from: a */
            public final void mo20887a(View view2) {
                this.f135712a.m128142L0(view2);
            }
        }).m20869j(new C4345a.c() { // from class: l.nty
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f140553a.m128144M0(str);
            }
        }).m20875q(C4345a.f15683Q | C4345a.f15681O);
        if (ura.m195053e().m195057d().mo33699I4()) {
            c4345a.m20870k(this.f104488b.color(a1c0.f67156j));
        }
        C4348d.m20896l().m20909u(c4345a, view, "audio_tips_key");
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m128187h0() {
        if (NullChecker.m81303a(this.f104493g)) {
            return this.f104493g.mo122682a();
        }
        return false;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m128188h1(roj0 roj0Var) {
        if (NullChecker.m81303a(this.f104498l) && this.f104498l.m113220d0()) {
            this.f104498l.m113195G();
        } else if (NullChecker.m81303a(this.f104487a)) {
            e51.m114743H(this.f104497k.getContext(), new Runnable() { // from class: l.fuy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99367a.m128107g1();
                }
            }, 150L);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m128189i0() {
        View childAt = this.f104497k.getChildAt(0);
        View view = this.f104503q;
        if (childAt == view) {
            this.f104497k.removeView(view);
            this.f104503q = null;
        }
        this.f104487a.m156455e0().mo48974l().mo120674K6(null);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f104497k = (MessageBar) layoutInflater.inflate(l6c0.f126475g1, viewGroup, false);
        if (CoreModule.m29935P().m94658i().mo158222E() && this.f104487a.m156455e0().mo48974l().mo120764e4()) {
            this.f104497k.getBar_center_text().m49925w();
        }
        if (this.f104497k instanceof MessageBarOpt) {
            if (User.isBusinessAI1V1(this.f104487a.m156455e0().mo48974l().mo120828r3())) {
                ((MessageBarOpt) this.f104497k).m49360Q(true);
            }
            ((MessageBarOpt) this.f104497k).m49362S(xoy.m210447b(this.f104487a.m156455e0().mo48974l().mo120828r3(), this.f104487a.m156455e0().mo48974l().mo120764e4()), this);
            this.f104497k.getRecordLayout().setInputRootLayout(this.f104497k.getInputContent());
            this.f104498l = new dqy((MessageBarOpt) this.f104497k, this);
            ((MessageBarOpt) this.f104497k).m49389t0(new e30() { // from class: l.ysy
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199847a.m128149P0(obj);
                }
            });
        }
        return this.f104497k;
    }

    /* JADX INFO: renamed from: j0 */
    public void m128190j0() {
        m128210t0().getBarWrapper().removeView(this.f104487a.m156455e0().mo48978v0().m156457g0().f185294a);
        m128210t0().getBar_center_text().setEnabled(true);
        m128210t0().getBar_center_text().setFocusable(true);
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m128191j1(View view) {
        fcz<? extends DbObject, ?> fczVarMo48974l = this.f104487a.m156455e0().mo48974l();
        this.f104487a.m210935q2(this.f104497k.getBar_center_text().getText(), this.f104497k.getBar_center_text().getAtIdList());
        if (fczVarMo48974l.mo120733Y2()) {
            fczVarMo48974l.m120651F6();
            m128156S1(fczVarMo48974l.mo120828r3());
            this.f104497k.getBar_send().setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m128192k0() {
        this.f104488b.mo48974l().m120842t7().m190278V1();
        xdl0.m208344M(this.f104488b.mo48974l().m120842t7().m190322p0(), false);
        this.f104488b.mo48974l().m120842t7().m190262L1(false);
        this.f104488b.mo48974l().m120842t7().m190265O1(false);
        this.f104487a.m156455e0().mo48974l().m120757c7(null);
        this.f104487a.m156455e0().mo48974l().m120762d7(null);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m128193k1() {
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134707f();
        xdl0.m208320A(this.f104497k.getBar_center_text());
    }

    /* JADX INFO: renamed from: l0 */
    public void m128194l0() {
        int iM213066y0 = this.f104487a.m156455e0().mo48971c0().m213066y0();
        xsy xsyVar = this.f104487a;
        if (iM213066y0 != 1) {
            xsyVar.m156455e0().mo48971c0().m156457g0().mo134710k(1, -1);
            pxz.m171969f(this.f104488b.pageId(), this.f104487a.m156455e0().mo48974l().mo120828r3(), "emoji");
        } else {
            xsyVar.m156455e0().mo48971c0().m156457g0().mo134707f();
        }
        this.f104487a.m156455e0().mo48974l().m120842t7().m190339y0(false);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m128195l1(View view) {
        m128192k0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m128196m0() {
        View view = this.f104490d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m128197m1(View view) {
        m128192k0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m128198n0() {
        m128126B1();
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m128199n1(String str) {
        this.f104501o = false;
    }

    /* JADX INFO: renamed from: o0 */
    public void m128200o0() {
        this.f104497k.getRecordLayout().m49462e();
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m128201o1(View view) {
        m128139J1(true);
    }

    /* JADX INFO: renamed from: p0 */
    public void m128202p0() {
        if (this.f104494h) {
            this.f104494h = false;
            C4348d.m20896l().m20900k("audio_tips_key");
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m128203p1(String str) {
        act().m48968R2("", str);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m128204q0() {
        if (y19.m212159S() && C4348d.m20896l().m20912x("switchPicBubbleKey")) {
            C4348d.m20896l().m20900k("switchPicBubbleKey");
        }
        m128194l0();
        Keyboard keyboardMo134702a = this.f104487a.m156455e0().mo48971c0().m156457g0().mo134702a();
        if (!NullChecker.m81303a(this.f104498l) || !this.f104498l.m113220d0()) {
            keyboardMo134702a.f31560f.setScrollble(true);
            return;
        }
        keyboardMo134702a.f31560f.setScrollble(false);
        keyboardMo134702a.f31560f.setCurrentItem(0);
        this.f104498l.m113190D0();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m128205q1(View view) {
        zvf0.m220396r("e_picture_1_send", OMSDialogPositon.p_chat_view);
        fcz<? extends DbObject, ?> fczVarMo48974l = this.f104487a.m156455e0().mo48974l();
        this.f104487a.m210935q2(new SpannableStringBuilder("[暗中观察]"), this.f104497k.getBar_center_text().getAtIdList());
        if (fczVarMo48974l.mo120733Y2()) {
            fczVarMo48974l.m120651F6();
            m128156S1(fczVarMo48974l.mo120828r3());
            this.f104497k.getBar_send().setEnabled(false);
        }
        m128143L1(this.f104488b.getResources().getString(R$string.f20813N0));
        xdl0.m208344M(this.f104488b.mo48974l().m120842t7().m190320o0(), false);
    }

    /* JADX INFO: renamed from: r0 */
    public View m128206r0() {
        return this.f104505s;
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m128207r1(View view) {
        zvf0.m220396r("e_picture_2_send", OMSDialogPositon.p_chat_view);
        fcz<? extends DbObject, ?> fczVarMo48974l = this.f104487a.m156455e0().mo48974l();
        this.f104487a.m210935q2(new SpannableStringBuilder("[摆手]"), this.f104497k.getBar_center_text().getAtIdList());
        if (fczVarMo48974l.mo120733Y2()) {
            fczVarMo48974l.m120651F6();
            m128156S1(fczVarMo48974l.mo120828r3());
            this.f104497k.getBar_send().setEnabled(false);
        }
        m128143L1(this.f104488b.getResources().getString(R$string.f20813N0));
        xdl0.m208344M(this.f104488b.mo48974l().m120842t7().m190320o0(), false);
    }

    /* JADX INFO: renamed from: s0 */
    public String m128208s0() {
        return this.f104497k.getBar_center_text().getText().toString().trim();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m128209s1(View view) {
        zvf0.m220396r("e_picture_3_send", OMSDialogPositon.p_chat_view);
        fcz<? extends DbObject, ?> fczVarMo48974l = this.f104487a.m156455e0().mo48974l();
        this.f104487a.m210935q2(new SpannableStringBuilder("[嘿哈]"), this.f104497k.getBar_center_text().getAtIdList());
        if (fczVarMo48974l.mo120733Y2()) {
            fczVarMo48974l.m120651F6();
            m128156S1(fczVarMo48974l.mo120828r3());
            this.f104497k.getBar_send().setEnabled(false);
        }
        m128143L1(this.f104488b.getResources().getString(R$string.f20813N0));
        xdl0.m208344M(this.f104488b.mo48974l().m120842t7().m190320o0(), false);
    }

    /* JADX INFO: renamed from: t0 */
    public MessageBar m128210t0() {
        return this.f104497k;
    }

    /* JADX INFO: renamed from: t1 */
    public void m128211t1(boolean z) {
        if (!z) {
            if (this.f104487a.m156455e0().mo48974l().mo120733Y2()) {
                this.f104487a.m156455e0().mo48974l().m120651F6();
                m128156S1(this.f104487a.m156455e0().mo48974l().mo120828r3());
                return;
            } else {
                this.f104493g = null;
                this.f104497k.getBlockText().setVisibility(8);
                this.f104497k.getInputRoot().setVisibility(0);
                return;
            }
        }
        this.f104493g = new fpy(new d30() { // from class: l.sty
            @Override // p149l.d30
            public final void call() {
                this.f166400a.m128185f1();
            }
        });
        this.f104497k.getBlockText().setVisibility(0);
        this.f104497k.getBlockText().setText("");
        this.f104497k.getBlockText().setBackground(null);
        this.f104497k.getInputRoot().setVisibility(0);
        xdl0.m208322B(this.f104497k.getBar_center_text(), false);
        this.f104488b.hideInput(this.f104497k.getBar_center_text());
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134705d();
    }

    /* JADX INFO: renamed from: u0 */
    public dqy m128212u0() {
        return this.f104498l;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m128213u1(uoy uoyVar, View view) {
        if (uoyVar instanceof apy) {
            apy apyVar = (apy) uoyVar;
            OfficialAccountsMenu officialAccountsMenuM98198l = apyVar.m98198l();
            if (!vwb.m200296J(officialAccountsMenuM98198l.localMenus)) {
                m128133G1(officialAccountsMenuM98198l, apyVar.m98199m());
                m128169Y1(m128128D0(officialAccountsMenuM98198l.localMenus, apyVar.m98199m()), view);
            } else {
                if (!NullChecker.m81303a(officialAccountsMenuM98198l.action)) {
                    m128133G1(officialAccountsMenuM98198l, apyVar.m98199m());
                    return;
                }
                m128133G1(officialAccountsMenuM98198l, apyVar.m98199m());
                OfficialAccountAction officialAccountAction = officialAccountsMenuM98198l.action;
                m128178c0(officialAccountAction.type, officialAccountAction.data, officialAccountsMenuM98198l.f20460id);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m128214v0() {
        if (this.f104488b.isFinishing()) {
            return;
        }
        if (NullChecker.m81303a(m128206r0()) && xdl0.m208349O0(m128206r0())) {
            xdl0.m208344M(m128206r0(), false);
        }
        if (CoreModule.m29935P().m94658i().mo158399k0()) {
            zvf0.m220399u("e_chat_gift_icon", this.f104488b.pageId(), vwb.m200311Y("chat_keyboard_status", this.f104487a.m156455e0().mo48971c0().m213066y0() == 2 ? "show" : "hide"));
        }
        this.f104487a.m156455e0().mo48971c0().m156457g0().mo134705d();
        ftj.m123059d(this.f104488b, CoreGiftPanelName.get("chat"), new e30() { // from class: l.oty
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145638a.m128146N0((CoreGiftInfo) obj);
            }
        }, this.f104487a.m156455e0().mo48974l().mo120828r3(), this.f104488b.pageId(), null);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m128215v1() {
        if (this.f104487a.m156455e0().mo48971c0().m213066y0() != 3) {
            pxz.m171969f(this.f104488b.pageId(), this.f104487a.m156455e0().mo48974l().mo120828r3(), "more");
            this.f104487a.m156455e0().mo48971c0().m156457g0().mo134710k(3, -1);
        } else {
            this.f104487a.m156455e0().mo48971c0().m156457g0().mo134707f();
        }
        this.f104487a.m156455e0().mo48974l().m120842t7().m190339y0(false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m128216w0(Intent intent) {
        this.f104497k.getBar_center_text().setText(intent.getStringExtra("android.intent.extra.TEXT"));
        this.f104488b.post(new Runnable() { // from class: l.vty
            @Override // java.lang.Runnable
            public final void run() {
                this.f183015a.m128147O0();
            }
        });
    }

    /* JADX INFO: renamed from: w1 */
    public final void m128217w1(View view) {
        if (!CoreModule.m29935P().m94658i().mo158447t1()) {
            boolean zMo158233G1 = CoreModule.m29935P().m94658i().mo158233G1();
            MessageBar messageBar = this.f104497k;
            if (zMo158233G1) {
                if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                    m128220y1(this.f104497k.getBar_send());
                }
            } else if (!messageBar.getBar_center_text().getText().toString().trim().isEmpty()) {
                m128176b0(this.f104497k.getBar_send());
            }
        }
        m128170Z(this.f104497k.getBar_center_text());
        view.postDelayed(new Runnable() { // from class: l.euy
            @Override // java.lang.Runnable
            public final void run() {
                this.f93291a.m128193k1();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: x0 */
    public void m128218x0() {
        View view = this.f104491e;
        if (view != null && view.getVisibility() == 0) {
            this.f104491e.setVisibility(8);
        }
        View view2 = this.f104490d;
        if (view2 == null || view2.getVisibility() != 0) {
            return;
        }
        this.f104490d.setVisibility(8);
    }

    /* JADX INFO: renamed from: y0 */
    public void m128219y0() {
        MessageBar messageBar = this.f104497k;
        if (messageBar instanceof MessageBarOpt) {
            ((MessageBarOpt) messageBar).m49361R();
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m128220y1(View view) {
        dqy dqyVar = this.f104498l;
        if (dqyVar == null || (NullChecker.m81303a(dqyVar) && !this.f104498l.m113220d0())) {
            m128196m0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m128221z0(boolean z) {
        this.f104497k.getBar_center_text().m49928z(z & TextUtils.isEmpty(this.f104497k.getBar_center_text().getText().toString()));
    }

    /* JADX INFO: renamed from: b0 */
    public void m128176b0(View view) {
    }

    /* JADX INFO: renamed from: z1 */
    public void m128222z1(boolean z) {
    }

    /* JADX INFO: renamed from: C1 */
    public final void m128127C1(int i, View view) {
    }

    /* JADX INFO: renamed from: l.guy$a */
    public class C17158a implements TextWatcher {
        public C17158a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if ("Meizu".equals(Build.BRAND) && com.tencent.connect.common.Constants.VIA_REPORT_TYPE_WPA_STATE.equals(Build.MODEL) && guy.this.f104487a.m210892E1()) {
                guy.this.f104497k.getBar_center_text().removeTextChangedListener(this);
                guy.this.f104497k.getBar_center_text().setText((CharSequence) null);
                guy.this.f104497k.getBar_center_text().addTextChangedListener(this);
                return;
            }
            String string = editable != null ? editable.toString() : null;
            if (NullChecker.m81303a(guy.this.f104498l)) {
                guy.this.f104498l.m113241z0(TextUtils.isEmpty(string.trim()));
            }
            guy.this.f104487a.f194331c.m132487l(NullChecker.m81303a(string) ? string : "");
            if ((!CoreModule.m29935P().m94658i().mo158447t1() || guy.this.f104487a.m156455e0().mo48971c0().m213066y0() == 1) && string != null && !string.trim().isEmpty()) {
                if (guy.this.f104487a.m210892E1()) {
                    guy.this.f104487a.m156455e0().mo48976t0().m143741d1();
                }
                boolean zMo158233G1 = CoreModule.m29935P().m94658i().mo158233G1();
                guy guyVar = guy.this;
                if (zMo158233G1) {
                    guyVar.m128220y1(guyVar.f104497k.getBar_send());
                } else {
                    guyVar.m128176b0(guyVar.f104497k.getBar_send());
                    guy guyVar2 = guy.this;
                    guyVar2.m128173a0(0, guyVar2.f104497k.getBar_send());
                }
            }
            guy guyVar3 = guy.this;
            guyVar3.f104489c = guyVar3.f104497k.getBar_center_text().getText().toString().trim();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
