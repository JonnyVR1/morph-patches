package p153l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Vibrator;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.EmojiAnimData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Prologue;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeLifePhotoAct;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBreakIceMessage;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageLeft;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageChatPrologueLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageExchangeQuestionAnswerLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagePicLikeGuideLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageProfileSettingAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.voicecall.VoiceCallControlView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yxz extends qzz<tvz> implements RunnableC4884c0.c {

    /* JADX INFO: renamed from: M1 */
    public boolean f202025M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f202026N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f202027O1;

    /* JADX INFO: renamed from: P1 */
    public VoiceCallControlView f202028P1;

    /* JADX INFO: renamed from: Q1 */
    public q800 f202029Q1;

    /* JADX INFO: renamed from: R1 */
    public oxy f202030R1;

    /* JADX INFO: renamed from: S1 */
    public final String f202031S1;

    /* JADX INFO: renamed from: T1 */
    public boolean f202032T1;

    /* JADX INFO: renamed from: U1 */
    public boolean f202033U1;

    /* JADX INFO: renamed from: V1 */
    public kcg0 f202034V1;

    /* JADX INFO: renamed from: W1 */
    public kcg0 f202035W1;

    /* JADX INFO: renamed from: X1 */
    public SVGAnimationView f202036X1;

    /* JADX INFO: renamed from: Y1 */
    public C22508b<uxj0> f202037Y1;

    /* JADX INFO: renamed from: Z1 */
    public boolean f202038Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f202039a2;

    /* JADX INFO: renamed from: b2 */
    public int[] f202040b2;

    /* JADX INFO: renamed from: c2 */
    public RectF f202041c2;

    /* JADX INFO: renamed from: d2 */
    public RectF f202042d2;

    /* JADX INFO: renamed from: e2 */
    public RectF f202043e2;

    /* JADX INFO: renamed from: f2 */
    public Runnable f202044f2;

    /* JADX INFO: renamed from: g2 */
    public List<x20> f202045g2;

    /* JADX INFO: renamed from: h2 */
    public final Property<View, Integer> f202046h2;

    /* JADX INFO: renamed from: i2 */
    public boolean f202047i2;

    /* JADX INFO: renamed from: l.yxz$a */
    public class C21707a extends Property<View, Integer> {
        public C21707a(Class cls, String str) {
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
            yxz.this.m217914z5(num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.yxz$d */
    public class C21710d extends pn50 {
        public C21710d() {
        }

        @Override // p153l.pn50
        /* JADX INFO: renamed from: b */
        public void mo49560b(int i, int i2) {
            super.mo49560b(i, i2);
            if (i2 != 0) {
                yxz.this.m178940e0();
            }
        }
    }

    /* JADX INFO: renamed from: l.yxz$e */
    public class C21711e implements bm50 {

        /* JADX INFO: renamed from: a */
        public float f202056a = 0.0f;

        /* JADX INFO: renamed from: b */
        public boolean f202057b = false;

        public C21711e() {
        }

        @Override // p153l.bm50
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f202056a = motionEvent.getY();
                this.f202057b = false;
            } else if (action == 1) {
                this.f202057b = false;
            } else if (action == 2) {
                float y = motionEvent.getY();
                if (!this.f202057b && this.f202056a - y > 0.0f) {
                    yxz.this.m178940e0();
                    this.f202057b = true;
                }
                this.f202056a = y;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.yxz$f */
    public class C21712f extends AnimListener {
        public C21712f() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onStart();
            yxz.this.f202038Z1 = false;
            bnl0.m105524M(yxz.this.f160365S0, false);
            yxz.this.f202039a2 = true;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(yxz.this.f160365S0, true);
        }
    }

    /* JADX INFO: renamed from: l.yxz$g */
    public class RunnableC21713g implements Runnable {
        public RunnableC21713g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int lastVisiblePositionHook = yxz.this.f160408n1.getLastVisiblePositionHook() - yxz.this.f160408n1.getFirstVisiblePositionHook(); lastVisiblePositionHook >= 0; lastVisiblePositionHook--) {
                View viewMo50794C = yxz.this.f160408n1.mo50794C(lastVisiblePositionHook);
                if (yxz.this.f202029Q1 != null && viewMo50794C == yxz.this.f202029Q1.mo120538g()) {
                    yxz yxzVar = yxz.this;
                    if (yxzVar.m217859Y3(yxzVar.f202029Q1.m175742u())) {
                        w600.m205009h().m205015m(((tvz) yxz.this.f160413p1).mo111034r3(), "headView");
                        w600.m205009h().m205018p(((tvz) yxz.this.f160413p1).mo111034r3(), "headView", yxz.this.f202029Q1.m175744w(), yxz.this.f202029Q1.m175742u());
                        return;
                    }
                } else if (viewMo50794C instanceof ItemMessageLeft) {
                    ItemMessageLeft itemMessageLeft = (ItemMessageLeft) viewMo50794C;
                    if (yxz.this.m217859Y3(itemMessageLeft.f32025M)) {
                        w600.m205009h().m205015m(((tvz) yxz.this.f160413p1).mo111034r3(), itemMessageLeft.getMessageId());
                        itemMessageLeft.m49603W0();
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yxz$h */
    public class C21714h implements VoiceCallControlView.InterfaceC8762b {
        public C21714h() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.voicecall.VoiceCallControlView.InterfaceC8762b
        /* JADX INFO: renamed from: a */
        public void mo51273a(boolean z) {
            if (z) {
                return;
            }
            View messageBarRoot = ((tvz) yxz.this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0().getMessageBarRoot();
            ViewGroup.LayoutParams layoutParams = messageBarRoot.getLayoutParams();
            layoutParams.height = -2;
            messageBarRoot.setLayoutParams(layoutParams);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.voicecall.VoiceCallControlView.InterfaceC8762b
        /* JADX INFO: renamed from: b */
        public void mo51274b(float f, int i, int i2, boolean z) {
            View messageBarRoot = ((tvz) yxz.this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0().getMessageBarRoot();
            int height = messageBarRoot.getHeight();
            if (height > 0) {
                if (((tvz) yxz.this.f160413p1).m143372e0().mo50155d0().m201096E0() || z) {
                    messageBarRoot.setAlpha(1.0f - f);
                    messageBarRoot.setTranslationY(height * f);
                } else {
                    messageBarRoot.setAlpha(1.0f);
                    messageBarRoot.setTranslationY(0.0f);
                }
                ViewGroup.LayoutParams layoutParams = messageBarRoot.getLayoutParams();
                layoutParams.height = (int) (i + ((i2 - i) * f));
                messageBarRoot.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: l.yxz$i */
    public class C21715i extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f202062a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f202063b;

        public C21715i(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
            this.f202062a = warmingUpLevel;
            this.f202063b = warmingUpLevel2;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            yxz.this.m217910x5(this.f202062a, this.f202063b);
        }
    }

    /* JADX INFO: renamed from: l.yxz$j */
    public class C21716j extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f202065a;

        public C21716j(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f202065a = warmingUpLevel;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            yxz.this.m217906v5(this.f202065a);
        }
    }

    /* JADX INFO: renamed from: l.yxz$k */
    public class C21717k extends gt0.C17308j {
        public C21717k() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            yxz.this.f160380a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.yxz$l */
    public class C21718l extends gt0.C17308j {
        public C21718l() {
        }

        @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            yxz.this.m178924X1();
        }
    }

    public yxz(MessagesAct messagesAct) {
        super(messagesAct);
        this.f202025M1 = false;
        this.f202026N1 = false;
        this.f202027O1 = false;
        this.f202031S1 = "giftTipKey";
        this.f202032T1 = false;
        this.f202033U1 = false;
        this.f202037Y1 = C22508b.m222767b();
        this.f202038Z1 = false;
        this.f202039a2 = false;
        this.f202040b2 = new int[2];
        this.f202041c2 = new RectF();
        this.f202042d2 = new RectF();
        this.f202043e2 = new RectF();
        this.f202044f2 = new RunnableC21713g();
        this.f202045g2 = new ArrayList();
        this.f202046h2 = new C21707a(Integer.TYPE, "backgroundColor");
        this.f202047i2 = false;
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m217753D2() {
    }

    /* JADX INFO: renamed from: M3 */
    public static oze.C19253a m217767M3(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList<oze.C19253a> arrayList = oze.f149866d;
            if (!jyb.m147479J(arrayList)) {
                for (oze.C19253a c19253a : arrayList) {
                    if (str.contains(context.getResources().getString(c19253a.f149874b))) {
                        return c19253a;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ void m217769O2() {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m217781a3(Throwable th) {
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m217788h3() {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m217808u2(String str) {
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ void m217810v2(Throwable th) {
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m217815y2(Throwable th) {
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m217817z2() {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m217819A4() {
        l51.m152888H(this.f160410o1, new Runnable() { // from class: l.axz
            @Override // java.lang.Runnable
            public final void run() {
                this.f73932a.m217913z4();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: A5 */
    public void m217820A5(boolean z) {
        this.f160401k0.setVisible(z);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m217821B4() {
        mo178911Q1(true, new Runnable() { // from class: l.wwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f191354a.m217819A4();
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public void m217822B5() {
        MessageWarmingUpHelper.m50375v("动画结束");
        ((tvz) this.f160413p1).f176335P0 = false;
        psd0.m173633z(this.f202034V1);
        psd0.m173633z(this.f202035W1);
        if (NullChecker.m82486a(((tvz) this.f160413p1).f176337R0)) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.fxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f101332a.m217854V4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m217823C4(List list, String str) {
        this.f160417r1.m137683B(14);
        MessageChatPrologueLayout messageChatPrologueLayout = (MessageChatPrologueLayout) p9r.m171370a(this.f160410o1).inflate(qec0.f156974X4, (ViewGroup) this.f160339G0, false);
        this.f160339G0.addView(messageChatPrologueLayout);
        messageChatPrologueLayout.m50041d0(this.f160410o1, list, this, str);
        m178944f2(14, new Runnable() { // from class: l.owz
            @Override // java.lang.Runnable
            public final void run() {
                yxz.m217817z2();
            }
        });
        bnl0.m105538V(messageChatPrologueLayout, qa00.f156326m - this.f160339G0.getPaddingLeft());
        i4g0.m138492A("e_send_opening_guidance", this.f160410o1.pageId(), jyb.m147494Y("opening_guidance_showtime", str), jyb.m147494Y("opening_content", ((Prologue) list.get(0)).value));
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: D0 */
    public void mo154145D0() {
        super.mo154145D0();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m217824D4(jl80 jl80Var) {
        jl80Var.dismiss();
        this.f160410o1.m68056e2();
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: E1 */
    public boolean mo154146E1(Menu menu) {
        super.mo154146E1(menu);
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            MenuItem menuItemAdd = menu.add(4, edc0.f93395k2, 2, "");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(qec0.f157003c1);
            bnl0.m105509E0(menuItemAdd.getActionView().findViewById(edc0.f93395k2), new View.OnClickListener() { // from class: l.uvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181221a.m217881j4(view);
                }
            });
            return true;
        }
        if (((tvz) this.f160413p1).m110965d4()) {
            CoreModule.m30933P().m143412i().mo180502m4(menu, ((tvz) this.f160413p1).mo111034r3(), act(), new x20() { // from class: l.fwz
                @Override // p153l.x20
                public final void call() {
                    this.f101228a.m217883k4();
                }
            });
            return true;
        }
        P p = this.f160413p1;
        if (((tvz) p).m111000k4(((tvz) p).mo111034r3())) {
            CoreModule.m30933P().m143412i().mo180529r1(menu, ((tvz) this.f160413p1).mo111034r3(), act(), false, false, null, null, null, null);
            return true;
        }
        CoreModule.m30933P().m143412i().mo180354L2(menu, ((tvz) this.f160413p1).mo111034r3(), act(), true, true, null, null, null, true, CoreModule.m30933P().m143412i().mo180308D(), "chat_page");
        return true;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m217825E4(int i, View view) {
        CoreModule.f18264c.f20384f0.f20722u1.put(Integer.valueOf(i));
        CoreModule.f18264c.f20384f0.f20719t1.put(Long.valueOf(pzi0.m174454o()));
        i4g0.m138526x("e_switchphoto_pop", ((tvz) this.f160413p1).pageId());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m217826F4(String str) {
        this.f202026N1 = false;
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m217827G4(MessageWarmingUpHelper.TempDownEnum tempDownEnum, View view) {
        if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.message) {
            ((tvz) this.f160413p1).m110914S6(tempDownEnum.imageRes + tempDownEnum.content);
        } else if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.photo) {
            MessagesAct messagesAct = this.f160410o1;
            messagesAct.startActivityForResult(MediaPickerAct.m80102Y1(messagesAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f160410o1.getString(R$string.f21721h)).withFromType(4).build()), PutongAct.REQUEST_CODE_PICKER);
            this.f160410o1.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
        } else if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.chuEmo || tempDownEnum == MessageWarmingUpHelper.TempDownEnum.friendEmo) {
            Sticker stickerM35929r3 = CoreModule.f18264c.f20366Z.m35929r3(tempDownEnum.imageRes);
            if (NullChecker.m82486a(stickerM35929r3) && !TextUtils.isEmpty(stickerM35929r3.f56859id)) {
                ((tvz) this.f160413p1).m110909R6(stickerM35929r3, false);
            }
        }
        sfj0.m185596c("e_heat_reduce_remind", ((tvz) this.f160413p1).pageId(), sfj0.C20032a.m185615h("heat_reduce_function_name", tempDownEnum.key));
        m178924X1();
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: H1 */
    public void mo178895H1(Message message) {
        if (!TEnum.equals(message.messageType, "text") || message.f56859id.startsWith(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX) || message.f56859id.startsWith("fake_id_") || !this.f202039a2) {
            return;
        }
        EmojiAnimData emojiAnimDataM193576b = tye.m193572c().m193576b();
        if (!emojiAnimDataM193576b.emojiAnimCreatedTime.containsKey(((tvz) this.f160413p1).m110989i3()) || message.createdTime > emojiAnimDataM193576b.emojiAnimCreatedTime.get(((tvz) this.f160413p1).m110989i3()).doubleValue()) {
            String strM193574f = tye.m193574f(message.value);
            if (TextUtils.isEmpty(strM193574f)) {
                return;
            }
            Map<String, Integer> map = oze.f149870h;
            if (map.containsKey(strM193574f)) {
                m217860Y4(map.get(strM193574f).intValue(), message);
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m217828H4() {
        SVGALoader.with(this.f160410o1).from("https://auto.tancdn.com/v1/raw/3590924d-0e8a-4b36-9c6f-25e1d8559e5810.svga").autoPlay(true).repeatCount(1).into(this.f160392g);
    }

    /* JADX INFO: renamed from: I3 */
    public final void m217829I3() {
        View viewInflate = p9r.m171370a(this.f160410o1).inflate(qec0.f157139v4, (ViewGroup) this.f160409o, false);
        m178951i0(viewInflate);
        int childCount = this.f160409o.getChildCount();
        for (int i = 0; i < this.f160409o.getChildCount(); i++) {
            if (this.f160409o.getChildAt(i) == ((tvz) this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0()) {
                childCount = i;
                break;
            }
        }
        this.f160409o.addView(viewInflate, childCount);
        this.f160380a.setVisibility(8);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m217830I4() {
        LinearLayout linearLayout = this.f160380a;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.0f).setDuration(300L);
            duration.addListener(new C21718l());
            duration.start();
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m217831J3(View view, RectF rectF) {
        view.getLocationOnScreen(this.f202040b2);
        int[] iArr = this.f202040b2;
        float f = iArr[0];
        rectF.left = f;
        rectF.top = iArr[1];
        rectF.right = f + view.getWidth();
        rectF.bottom = rectF.top + view.getHeight();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ pf60 m217832J4(double d, uxj0 uxj0Var) {
        List<Message> listM189444F = CoreModule.f18272k.f115535c.m189444F(((tvz) this.f160413p1).m110989i3(), d);
        if (jyb.m147479J(listM189444F)) {
            return pf60.m172085a("", null);
        }
        for (Message message : listM189444F) {
            if (TEnum.equals(message.messageType, "text")) {
                String strM193574f = tye.m193574f(message.value);
                if (!TextUtils.isEmpty(strM193574f) && oze.f149870h.containsKey(strM193574f)) {
                    return pf60.m172085a(strM193574f, message);
                }
            }
        }
        return pf60.m172085a("", listM189444F.get(0));
    }

    /* JADX INFO: renamed from: K3 */
    public void m217833K3() {
        Iterator<x20> it = this.f202045g2.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f202045g2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m217834K4(EmojiAnimData emojiAnimData, pf60 pf60Var) {
        if (!TextUtils.isEmpty((CharSequence) pf60Var.f152156a)) {
            m217860Y4(oze.f149870h.get(pf60Var.f152156a).intValue(), (Message) pf60Var.f152157b);
            return;
        }
        if (NullChecker.m82486a(pf60Var.f152157b)) {
            emojiAnimData.emojiAnimCreatedTime.put(((tvz) this.f160413p1).m110989i3(), Double.valueOf(((Message) pf60Var.f152157b).createdTime));
            tye.m193572c().m193581j(emojiAnimData);
        }
        this.f202039a2 = true;
    }

    /* JADX INFO: renamed from: L3 */
    public void m217835L3(x20 x20Var) {
        if (((tvz) this.f160413p1).lifecycle_() == C4470c.f16267i) {
            x20Var.call();
        } else {
            this.f202045g2.add(x20Var);
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m217836L4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f160410o1).from(MessageWarmingUpHelper.m50376w(warmingUpLevel)).autoPlay(true).animListener(new C21716j(warmingUpLevel)).repeatCount(1).into(this.f160406m1);
    }

    /* JADX INFO: renamed from: N3 */
    public C22421c<uxj0> m217838N3() {
        return this.f202037Y1;
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: O0 */
    public void mo178906O0(int i, boolean z) {
        super.mo178906O0(i, z);
        ((tvz) this.f160413p1).m193190Rg(z);
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m217840O3() {
        return !jyb.m147479J(this.f202045g2);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m217841O4(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, Long l2) {
        if (l2.longValue() > 11000) {
            m217822B5();
            return;
        }
        int iLongValue = (int) l2.longValue();
        if (iLongValue == 2233) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.sxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171203a.m217839N4(warmingUpLevel);
                }
            });
        }
        MessageBar messageBarM114041t0 = ((tvz) this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0();
        if (NullChecker.m82486a(messageBarM114041t0)) {
            messageBarM114041t0.mo50023k(iLongValue, warmingUpLevel, ((tvz) this.f160413p1).m110999k3());
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m217842P3() {
        ((tvz) this.f160413p1).act().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.yvz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201773a.m217871e4((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m217843P4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.f156326m);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.f160410o1.getResources().getColor(g9c0.f102810a0));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        sVGADynamicEntity.setDynamicText(MessageWarmingUpHelper.m50355b(((tvz) this.f160413p1).m111009m3()) + "°C", textPaint, "wendushu");
        SVGALoader.with(this.f160410o1).from(MessageWarmingUpHelper.m50378y(warmingUpLevel)).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C21715i(warmingUpLevel2, warmingUpLevel)).repeatCount(1).into(this.f160406m1);
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: Q1 */
    public void mo178911Q1(boolean z, Runnable runnable) {
        if (NullChecker.m82486a(this.f160339G0) && this.f160339G0.getChildCount() == 0) {
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        } else if (this.f160339G0.getChildCount() > 0) {
            if (NullChecker.m82486a(this.f160417r1)) {
                this.f160417r1.m137702y(z, null);
            }
            m178913R1(z, runnable);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m217844Q4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f160410o1).from(MessageWarmingUpHelper.m50353A(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f160407n);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: R3 */
    public void m217845R3() {
        if (CoreModule.m30933P().m143406b().mo36110Yg() && this.f160429x1 == null) {
            Conversation conversationM110994j3 = ((tvz) this.f160413p1).m110994j3();
            if (NullChecker.m82486a(conversationM110994j3)) {
                long j = (NullChecker.m82486a(conversationM110994j3.property) && NullChecker.m82486a(conversationM110994j3.property.intl_love_buzz)) ? conversationM110994j3.property.intl_love_buzz.expire : 0L;
                this.f160387d1.setBackgroundResource(ibc0.f114032h1);
                this.f160385c1.setBackgroundResource(ibc0.f114041i1);
                this.f160389e1.setText(CoreModule.m30933P().m143406b().mo36105Uq(j) + "  ");
                if (!bnl0.m105529O0(this.f160385c1)) {
                    m178896I0();
                    m178936c2(getContext().getResources().getString(R$string.f21838u3));
                }
                if (!CoreModule.m30933P().m143406b().mo36120la(j)) {
                    m178986z0();
                    return;
                }
                RunnableC4884c0.a aVar = new RunnableC4884c0.a();
                aVar.m32526g("countdown_item_love_buzz_key").m32525f(j).m32527h(60L).m32520a(true).m32523d(this);
                CoreModule.f18264c.f20427t1.m32516r(aVar);
                this.f160429x1 = act().duringCreated(CoreModule.f18264c.f20427t1.m32512n("countdown_item_love_buzz_key")).subscribe(psd0.m173596G(new y20() { // from class: l.zvz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f206305a.m217873f4((RunnableC4884c0.b) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m217846R4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f160410o1).from(MessageWarmingUpHelper.m50379z(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f160403l);
    }

    /* JADX INFO: renamed from: S3 */
    public void m217847S3(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (warmingUpLevel.value <= MessageWarmingUpHelper.WarmingUpLevel.first.value) {
            return;
        }
        bnl0.m105524M(this.f160338G, false);
        m217914z5(MessageWarmingUpHelper.m50366m(warmingUpLevel));
        m178953j0().m153307y();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m217848S4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        ((tvz) this.f160413p1).m110948Z6(warmingUpLevel);
        m178953j0().m153307y();
        SVGALoader.with(this.f160410o1).from(MessageWarmingUpHelper.m50353A(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f160407n);
    }

    /* JADX INFO: renamed from: T3 */
    public void m217849T3() {
        if (User.isTeamAccount(((tvz) this.f160413p1).f82474c)) {
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(((tvz) this.f160413p1).mo111034r3());
        VText vText = this.f160344I;
        StringBuilder sb = new StringBuilder("无法收到");
        sb.append(userM116503Pa.isFemale() ? "她" : "他");
        sb.append("的消息通知 ");
        vText.setText(sb.toString());
        this.f160346J.setText("仅打开好友消息通知，及时回复".concat(userM116503Pa.isFemale() ? "她" : "他"));
        if (CoreModule.m30933P().m143412i().mo180318E3()) {
            m178971r0();
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180387R2(((tvz) this.f160413p1).f82474c)) {
            bnl0.m105524M(this.f160341H, true);
            i4g0.m138526x("e_open_button_click", OMSDialogPositon.p_chat_view);
            HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89308q0.get();
            if (hashSet.size() < 2) {
                hashSet.add(((tvz) this.f160413p1).f82474c);
                CoreModule.f18264c.f20381e0.f89308q0.put(hashSet);
            }
            bnl0.m105509E0(this.f160350L, new View.OnClickListener() { // from class: l.vvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186051a.m217875g4(view);
                }
            });
            bnl0.m105509E0(this.f160348K, new View.OnClickListener() { // from class: l.wvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191124a.m217879i4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m217850T4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f160400k, this.f202046h2, MessageWarmingUpHelper.m50366m(warmingUpLevel), MessageWarmingUpHelper.m50366m(warmingUpLevel2));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        if (warmingUpLevel == MessageWarmingUpHelper.WarmingUpLevel.first) {
            arrayList.add(gt0.m132171q(this.f160338G, "alpha", 1.0f, 0.0f));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(900L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m217851U3() {
        if (m178973s0()) {
            vnb.m201946M(this.f160338G, false);
            vnb.m201946M(this.f160358P, true);
            this.f160408n1.mo50800n(new C21710d());
            this.f160364S.setOnDispatchTouchEventListener(new C21711e());
            c300 c300Var = new c300(act(), new y20() { // from class: l.bwz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78801a.m217884k5((Media) obj);
                }
            });
            ArrayList arrayListM147522n = jyb.m147522n(CoreModule.f18264c.f20381e0.m116503Pa(((tvz) this.f160413p1).f82473b).pictures, new qcj() { // from class: l.cwz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            });
            c300Var.m107749O(arrayListM147522n.subList(1, arrayListM147522n.size()));
            this.f160360Q.setAdapter(c300Var);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m217852U4(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, Long l2) {
        if (l2.longValue() > 11000) {
            m217822B5();
            return;
        }
        int iLongValue = (int) l2.longValue();
        if (warmingUpLevel == MessageWarmingUpHelper.WarmingUpLevel.not) {
            if (iLongValue == 150) {
                l51.m152886F(this.f160410o1, new Runnable() { // from class: l.lxz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f134020a.m217844Q4(warmingUpLevel2);
                    }
                });
            }
        } else if (iLongValue == 1450) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.nxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144279a.m217846R4(warmingUpLevel2);
                }
            });
        } else if (iLongValue == 2150) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.oxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f149725a.m217848S4(warmingUpLevel2);
                }
            });
        } else if (iLongValue == 2886) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.pxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154603a.m217850T4(warmingUpLevel, warmingUpLevel2);
                }
            });
        }
        MessageBar messageBarM114041t0 = ((tvz) this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0();
        if (NullChecker.m82486a(messageBarM114041t0)) {
            messageBarM114041t0.mo50024l(iLongValue, warmingUpLevel, warmingUpLevel2, ((tvz) this.f160413p1).m111009m3());
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m217853V3(User user) {
        ((tvz) this.f160413p1).m143372e0().mo50143F().mo127924x0(user);
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m217854V4() {
        P p = this.f160413p1;
        if (((tvz) p).f176337R0 == null) {
            return;
        }
        ChatHeat chatHeatMo225055clone = ((tvz) p).f176337R0.mo225055clone();
        ((tvz) this.f160413p1).f176337R0 = null;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM50371r = MessageWarmingUpHelper.m50371r(chatHeatMo225055clone.degree);
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM111004l3 = ((tvz) this.f160413p1).m111004l3();
        MessageWarmingUpHelper.m50375v("升温执行cache currentLevel = " + warmingUpLevelM111004l3 + " chatHeat=" + chatHeatMo225055clone.toJson());
        if (!NullChecker.m82486a(warmingUpLevelM111004l3) || warmingUpLevelM50371r.value <= warmingUpLevelM111004l3.value) {
            return;
        }
        ((tvz) this.f160413p1).m193165Mg(chatHeatMo225055clone);
    }

    /* JADX INFO: renamed from: W3 */
    public void m217855W3(boolean z) {
        this.f202027O1 = z;
        ((tvz) this.f160413p1).m143372e0().mo50155d0().m143374g0().mo125466l();
    }

    /* JADX INFO: renamed from: W4 */
    public void m217856W4(boolean z) {
        this.f202047i2 = z;
        if (NullChecker.m82486a(this.f160417r1) && this.f160417r1.m137691m() == 10 && this.f160339G0.getChildCount() > 0 && NullChecker.m82486a(this.f160417r1.f112074d) && NullChecker.m82486a(this.f160417r1.f112074d.getAdapter())) {
            this.f160417r1.m137688G();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m217857X3(View view) {
        m217831J3(((tvz) this.f160413p1).m143372e0().mo50143F().m183226n0(), this.f202041c2);
        m217831J3(view, this.f202042d2);
        m217831J3(((tvz) this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0(), this.f202043e2);
        RectF rectF = this.f202042d2;
        return rectF.top >= this.f202041c2.bottom && rectF.bottom <= this.f202043e2.top;
    }

    /* JADX INFO: renamed from: X4 */
    public void m217858X4() {
        m217833K3();
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m217859Y3(View view) {
        if (m217857X3(view)) {
            m217831J3(view, this.f202042d2);
            if (bnl0.m105588w0() - this.f202042d2.top >= qa00.m175859d(100.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m217860Y4(int i, Message message) {
        EmojiAnimData emojiAnimDataM193576b = tye.m193572c().m193576b();
        emojiAnimDataM193576b.emojiAnimCreatedTime.put(((tvz) this.f160413p1).m110989i3(), Double.valueOf(message.createdTime));
        tye.m193572c().m193581j(emojiAnimDataM193576b);
        if (this.f202038Z1) {
            return;
        }
        this.f202038Z1 = true;
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(BitmapFactory.decodeResource(this.f160410o1.getResources(), i), "emoji");
        SVGALoader.with(this.f160410o1).from(CoreModule.m30933P().m143405a().mo34301Cj()).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C21712f()).repeatCount(1).into(this.f160365S0);
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m217861Z3() {
        return this.f160402k1.m46630o();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m217862Z4(final CoreGiftInfo coreGiftInfo, final x20 x20Var) {
        if (coreGiftInfo.dynamicGift) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.nwz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144054a.m217885l4(coreGiftInfo, x20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m217863a4() {
        return this.f202033U1;
    }

    /* JADX INFO: renamed from: a5 */
    public void m217864a5(final Message message, final CoreGiftInfo coreGiftInfo, final x20 x20Var, final boolean z, final String str, final boolean z2) {
        if (coreGiftInfo.dynamicGift) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.xwz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f196568a.m217889n4(coreGiftInfo, x20Var, z, str, z2, message);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m217865b4() {
        return this.f202047i2;
    }

    /* JADX INFO: renamed from: b5 */
    public void m217866b5(Message message, String str, Sticker sticker) {
        if (this.f202033U1) {
            return;
        }
        this.f202033U1 = true;
        ViewGroup viewGroup = (ViewGroup) this.f160410o1.getWindow().getDecorView();
        if (this.f202036X1 == null) {
            SVGAnimationView sVGAnimationView = new SVGAnimationView(this.f160410o1);
            this.f202036X1 = sVGAnimationView;
            if (viewGroup instanceof FrameLayout) {
                ((FrameLayout) viewGroup).addView(sVGAnimationView, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        final sv4 sv4VarM188109a = sv4.m188109a(sticker);
        if (!NullChecker.m82486a(sv4VarM188109a)) {
            this.f202033U1 = false;
            this.f202037Y1.m137019l(uxj0.f181467a);
            return;
        }
        if (TextUtils.equals(sticker.name, "晚安") && !message.isMe()) {
            ((tvz) this.f160413p1).m143372e0().mo50155d0().m143374g0().mo125460d();
        }
        bnl0.m105524M(this.f202036X1, true);
        sv4VarM188109a.m188113e(this.f202036X1, ((tvz) this.f160413p1).m143372e0().mo50155d0().m201110x0().m222761e().intValue(), ((tvz) this.f160413p1).m143372e0().mo50158l().m111048t7().f160396i, viewGroup);
        kcg0[] kcg0VarArr = new kcg0[1];
        SVGALoader.with(this.f160410o1).from(str).autoPlay(true).repeatCount(1).loadCallback(new C21709c()).animListener(new C21708b(sv4VarM188109a, viewGroup, kcg0VarArr)).into(this.f202036X1);
        if (sv4VarM188109a.f170805l) {
            kcg0VarArr[0] = ((tvz) this.f160413p1).m143372e0().mo50155d0().m201110x0().subscribe(psd0.m173596G(new y20() { // from class: l.mwz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139168a.m217891o4(sv4VarM188109a, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m217867c4() {
        return this.f202027O1;
    }

    /* JADX INFO: renamed from: c5 */
    public void m217868c5(User user) {
        bnl0.m105524M(((tvz) this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0(), true);
        this.f160405m.m50973h(false, "0");
    }

    /* JADX INFO: renamed from: d4 */
    public void m217869d4(int i) {
        if (NullChecker.m82486a(this.f160406m1)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f160406m1.getLayoutParams();
            layoutParams.bottomMargin = qa00.m175859d(100.0f) + Math.abs(i);
            this.f160406m1.setLayoutParams(layoutParams);
        }
        if (NullChecker.m82486a(this.f160407n)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f160407n.getLayoutParams();
            layoutParams2.bottomMargin = qa00.m175859d(100.0f) + Math.abs(i);
            this.f160407n.setLayoutParams(layoutParams2);
        }
        if (NullChecker.m82486a(this.f160380a)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f160380a.getLayoutParams();
            layoutParams3.bottomMargin = Math.abs(i);
            this.f160380a.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m217870d5(boolean z) {
        String strM147764k;
        final List<String> listM147763j = k05.m147755h().m147763j();
        if (z || !jyb.m147479J(listM147763j)) {
            if (!this.f160343H1) {
                bnl0.m105537U(this.f160412p0, qa00.m175859d(96.0f));
            }
            if (jyb.m147479J(listM147763j)) {
                strM147764k = k05.m147755h().m147764k();
                this.f160336F0.setText("再来一批");
                i4g0.m138526x("e_newmatch_next_batch", act().pageId());
            } else {
                i4g0.m138492A("e_newmatch_next", act().pageId(), jyb.m147494Y("other_uid", ((tvz) this.f160413p1).mo111034r3()), jyb.m147494Y("newmatch_next_from", ((tvz) this.f160413p1).m111065y3()), jyb.m147494Y("newmatch_next_number", Integer.valueOf(listM147763j.size())));
                strM147764k = listM147763j.get(0);
                this.f160336F0.setText(h39.m133433V() + " (" + listM147763j.size() + ")");
            }
            boolean zIsEmpty = TextUtils.isEmpty(strM147764k);
            VDraweeView vDraweeView = this.f160333E0;
            if (zIsEmpty) {
                bnl0.m105524M(vDraweeView, false);
            } else {
                bnl0.m105524M(vDraweeView, true);
                act().duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(strM147764k).first()).subscribe(psd0.m173597H(new y20() { // from class: l.uxz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f181523a.m217893p4((User) obj);
                    }
                }, new y20() { // from class: l.vxz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        yxz.m217815y2((Throwable) obj);
                    }
                }));
            }
            bnl0.m105509E0(this.f160412p0, new View.OnClickListener() { // from class: l.wxz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191550a.m217895q4(listM147763j, view);
                }
            });
            l51.m152886F(act(), new Runnable() { // from class: l.xxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f196708a.m217897r4();
                }
            });
        }
    }

    @Override // p153l.qzz, p153l.iam
    public void destroy() {
        super.destroy();
        if (CoreModule.m30933P().m143406b().mo36110Yg()) {
            CoreModule.f18264c.f20427t1.m32519u("countdown_item_love_buzz_key");
        }
        psd0.m173633z(this.f202034V1);
        psd0.m173633z(this.f202035W1);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m217871e4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m217900s5();
        } else if (c4470c == C4470c.f16269k) {
            this.f202039a2 = false;
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m217872e5(int i, int i2) {
        if (i == 0 && this.f202028P1 == null) {
            return;
        }
        if (i2 == 1) {
            ((tvz) this.f160413p1).m143372e0().mo50155d0().m143374g0().mo125465k(0, -1);
        }
        if (this.f202028P1 == null) {
            VoiceCallControlView voiceCallControlView = (VoiceCallControlView) this.f160377Y0.inflate();
            this.f202028P1 = voiceCallControlView;
            voiceCallControlView.setVoiceCallAnimListener(new C21714h());
        }
        this.f202028P1.m51271y(i, i2);
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: f0 */
    public rdz mo154147f0() {
        if (((tvz) this.f160413p1).m193133Gd()) {
            oxy oxyVar = new oxy();
            this.f202030R1 = oxyVar;
            return oxyVar;
        }
        q800 q800Var = new q800(((tvz) this.f160413p1).mo111034r3());
        this.f202029Q1 = q800Var;
        return q800Var;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m217873f4(RunnableC4884c0.b bVar) {
        if (NullChecker.m82486a(bVar)) {
            this.f160389e1.setText(CoreModule.m30933P().m143406b().mo36105Uq(bVar.f20466d) + "  ");
            if (bVar.f20463a) {
                m178986z0();
                ((tvz) this.f160413p1).m143372e0().mo50138B0().m194209o2();
                CoreModule.f18264c.f20427t1.m32519u("countdown_item_love_buzz_key");
            }
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m217874f5(Picture picture) {
        boolean zM82486a = NullChecker.m82486a(picture);
        VDraweeView vDraweeView = this.f160398j;
        if (zM82486a) {
            bnl0.m105524M(vDraweeView, true);
            uqb0.f180374G.m127146i0(this.f160398j, picture.url);
            this.f160409o.setBackgroundColor(Color.parseColor("#00000000"));
            this.f202025M1 = true;
        } else {
            bnl0.m105524M(vDraweeView, true);
            this.f160398j.setImageResource(0);
            this.f160398j.setBackgroundColor(Color.parseColor("#ffffff"));
            this.f202025M1 = false;
        }
        m178953j0().m153307y();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m217875g4(View view) {
        i4g0.m138520r("e_chat_open_push_close", OMSDialogPositon.p_chat_view);
        HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89322s0.get();
        hashSet.add(((tvz) this.f160413p1).f82474c);
        CoreModule.f18264c.f20381e0.f89322s0.put(hashSet);
        bnl0.m105524M(this.f160341H, false);
    }

    /* JADX INFO: renamed from: g5 */
    public boolean m217876g5(int i, boolean z) {
        boolean zM137685D = this.f160417r1.m137685D(m178958l0(), i, z);
        if (zM137685D && h39.m133437a() && this.f160417r1.m137695q()) {
            this.f160417r1.m137682A(new Runnable() { // from class: l.awz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73805a.m217901t4();
                }
            });
        }
        return zM137685D;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m217877h4(SettingGroups settingGroups) {
        o1j0.m165651y("已开启消息通知");
        bnl0.m105524M(this.f160341H, false);
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m217878h5(final List<BreakIce> list) {
        bnl0.m105524M(this.f160339G0, true);
        mo178911Q1(false, new Runnable() { // from class: l.bxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f78956a.m217907w4(list);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m217879i4(View view) {
        i4g0.m138520r("e_open_button_click", OMSDialogPositon.p_chat_view);
        if (NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed && !CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable()) {
            act().duringCreated(CoreModule.f18264c.f20381e0.m116482K9("openWithFriend", true, 0, 0)).subscribe(psd0.m173597H(new y20() { // from class: l.uwz
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181330a.m217877h4((SettingGroups) obj);
                }
            }, new y20() { // from class: l.vwz
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        } else {
            CoreModule.m30933P().m143412i().mo180397T();
            CoreModule.f18264c.f20381e0.m116482K9("openWithFriend", true, 0, 0);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public boolean m217880i5() {
        bnl0.m105524M(this.f160339G0, true);
        mo178911Q1(false, new Runnable() { // from class: l.qwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f159991a.m217909x4();
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m217881j4(View view) {
        MessagesAct messagesActAct = act();
        MessagesAct messagesActAct2 = act();
        P p = this.f160413p1;
        messagesActAct.startActivity(MessageProfileSettingAct.m50099Z1(messagesActAct2, ((tvz) p).m111000k4(((tvz) p).mo111034r3()), ((tvz) this.f160413p1).mo111034r3()));
    }

    /* JADX INFO: renamed from: j5 */
    public void m217882j5(final String str, String str2) {
        bnl0.m105524M(this.f160411p, false);
        bnl0.m105524M(this.f160422u, false);
        bnl0.m105524M(this.f160430y, false);
        bnl0.m105524M(this.f160328C, false);
        bnl0.m105524M(this.f160341H, false);
        bnl0.m105524M(this.f160352M, true);
        this.f160354N.setText(str2);
        bnl0.m105509E0(this.f160352M, new View.OnClickListener() { // from class: l.xvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196449a.m217911y4(str, view);
            }
        });
        i4g0.m138492A("e_chat_safety_notice", OMSDialogPositon.p_chat_view, jyb.m147494Y("user_risk_type", str), jyb.m147494Y("risk_userid", ((tvz) this.f160413p1).mo111034r3()));
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: k0 */
    public pf60<Integer, Integer> mo178955k0() {
        q800 q800Var = this.f202029Q1;
        if (q800Var == null || q800Var.m175742u() == null) {
            return null;
        }
        VDraweeView vDraweeViewM175742u = this.f202029Q1.m175742u();
        return jyb.m147494Y(Integer.valueOf(vDraweeViewM175742u.getWidth()), Integer.valueOf(vDraweeViewM175742u.getHeight()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m217883k4() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: k5 */
    public void m217884k5(Media media) {
        Conversation conversationM34219zp;
        if (h39.m133439c()) {
            String str = ((tvz) this.f160413p1).f82474c;
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.ShowPicLikeGuideTime;
            if (pzi0.m174438C(conversationCounterTypeSp.getLong(str), pzi0.m174454o()) || (conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str)) == null || !TEnum.equals(conversationM34219zp.status, "default") || !TextUtils.equals(conversationM34219zp.convType, "default") || TextUtils.equals(conversationM34219zp.otherStatus, "invalid")) {
                return;
            }
            if (h39.m133440d()) {
                ProfileLikeLifePhotoAct.m45627y2(this.f160410o1, str, media.url, jyb.m147479J(media.tags) ? "" : media.tags.get(0));
            } else {
                m178921V1();
                this.f160417r1.m137683B(13);
                MessagePicLikeGuideLayout messagePicLikeGuideLayout = (MessagePicLikeGuideLayout) p9r.m171370a(this.f160410o1).inflate(qec0.f157147w5, (ViewGroup) this.f160339G0, false);
                this.f160339G0.addView(messagePicLikeGuideLayout);
                messagePicLikeGuideLayout.m50098a0(this.f160410o1, media, new Runnable() { // from class: l.kwz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f129157a.m217821B4();
                    }
                });
                m178944f2(13, new Runnable() { // from class: l.lwz
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxz.m217753D2();
                    }
                });
                bnl0.m105538V(messagePicLikeGuideLayout, qa00.f156326m - this.f160339G0.getPaddingLeft());
            }
            conversationCounterTypeSp.setLong(str, pzi0.m174454o());
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m217885l4(CoreGiftInfo coreGiftInfo, x20 x20Var) {
        this.f160402k1.m46638w(coreGiftInfo, x20Var);
    }

    /* JADX INFO: renamed from: l5 */
    public boolean m217886l5(final List<Prologue> list, final String str) {
        if (jyb.m147479J(list)) {
            return false;
        }
        bnl0.m105524M(this.f160339G0, true);
        mo178911Q1(false, new Runnable() { // from class: l.mxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f139305a.m217823C4(list, str);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m217887m4(Message message, View view) {
        i4g0.m138520r("e_chat_gift_view_thanks", act().pageId());
        m217902t5();
        ((tvz) this.f160413p1).m110924U6(message);
    }

    /* JADX INFO: renamed from: m5 */
    public void m217888m5(final y20<jl80> y20Var) {
        final jl80 jl80VarM146020O = this.f160410o1.newDialog().m146024S(ibc0.f113761C0).m146056y0("功能全新升级").m146051t0("本次聊天需要消耗一次消耗次数").m146021P(false).m146018M(false).m146033b0("同意并聊天").m146028W("不同意").m146020O();
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.dwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f91053a.m217824D4(jl80VarM146020O);
            }
        });
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.ewz
            @Override // java.lang.Runnable
            public final void run() {
                y20Var.call(jl80VarM146020O);
            }
        });
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m217889n4(CoreGiftInfo coreGiftInfo, x20 x20Var, boolean z, String str, boolean z2, final Message message) {
        this.f160402k1.m46638w(coreGiftInfo, x20Var);
        this.f160402k1.m46623C(z);
        if (z) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            CoreGiftLayer coreGiftLayer = this.f160402k1;
            if (zIsEmpty) {
                coreGiftLayer.m46629n();
            } else {
                coreGiftLayer.m46627G(str);
            }
            this.f160402k1.m46624D(!z2);
            if (z2) {
                return;
            }
            i4g0.m138526x("e_chat_gift_view_thanks", act().pageId());
            this.f160402k1.setThxTipClickListener(new View.OnClickListener() { // from class: l.zwz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f206403a.m217887m4(message, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m217890n5() {
        if (this.f160417r1.m137691m() != 10 || this.f160339G0.getChildCount() <= 0) {
            if (this.f160339G0.getChildCount() > 0) {
                return;
            }
            m217876g5(10, false);
        } else if (NullChecker.m82486a(this.f160417r1.f112074d) && NullChecker.m82486a(this.f160417r1.f112074d.getAdapter())) {
            this.f160417r1.m137688G();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m217891o4(sv4 sv4Var, Integer num) {
        if (NullChecker.m82486a(this.f202036X1)) {
            this.f202036X1.setTranslationY(num.intValue() * sv4Var.f170806m);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m217892o5() {
        MessageBar messageBarM114041t0;
        int iIntValue;
        Conversation conversationM110994j3 = ((tvz) this.f160413p1).m110994j3();
        if (conversationM110994j3 == null || TEnum.equals(conversationM110994j3.status, "dismissed") || this.f160410o1.m50141D2() || (messageBarM114041t0 = ((tvz) this.f160413p1).m143372e0().mo50138B0().m143374g0().m114041t0()) == null) {
            return;
        }
        MessageBarActionItemType messageBarActionItemType = MessageBarActionItemType.MORE;
        if (!messageBarM114041t0.mo50015c(messageBarActionItemType) || !uxy.m198555f(conversationM110994j3.otherUser, false) || CoreModule.f18264c.f20384f0.f20584A1.get().booleanValue() || (iIntValue = CoreModule.f18264c.f20384f0.f20722u1.get().intValue()) >= 3) {
            return;
        }
        if (pzi0.m174454o() - CoreModule.f18264c.f20384f0.f20719t1.get().longValue() < 86400000 || C4499d.m21895l().m21911x("switchPicBubbleKey") || cl80.m110426e().m110433k()) {
            return;
        }
        final int i = iIntValue + 1;
        C4499d.m21895l().m21908u(new C4496a(this.f160410o1).m21848D("照片新玩法限时开启！").m21869k(j26.m143190c(this.f160410o1, gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102834x)).m21851G(g9c0.f102827q).m21877t(true).m21854J(13.0f).m21880w(qa00.f156321h).m21863e(false).m21858N(new C4496a.d() { // from class: l.iwz
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
            /* JADX INFO: renamed from: a */
            public final void mo21886a(View view) {
                this.f117302a.m217825E4(i, view);
            }
        }).m21862d(new C4496a.b() { // from class: l.jwz
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
            /* JADX INFO: renamed from: a */
            public final void mo21884a(String str) {
                yxz.m217808u2(str);
            }
        }).m21849E(false).m21881x(qa00.f156320g).m21880w(qa00.f156324k).m21860b(8000L).m21874q(zvk.f206227D | zvk.f206228E), messageBarM114041t0.mo50014b(messageBarActionItemType), "switchPicBubbleKey");
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m217893p4(User user) {
        if (user.isBannedNew() || user.isAccountCancellation()) {
            uqb0.f180374G.m127138Y0(this.f160333E0, ibc0.f114030h);
        } else {
            uqb0.f180374G.m127125Q0(this.f160333E0, user.m61308fp().profileSize(qa00.f156330q));
        }
    }

    /* JADX INFO: renamed from: p5 */
    public void m217894p5(User user) {
        this.f202026N1 = true;
        C4496a c4496a = new C4496a(act());
        c4496a.m21848D(user.isFemale() ? act().string(R$string.f21873y6) : act().string(R$string.f21881z6)).m21874q(zvk.f206224A | zvk.f206228E).m21846B(qa00.m175859d(2.0f)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21860b(3000L).m21863e(true).m21868j(new C4496a.c() { // from class: l.txz
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                this.f176626a.m217826F4(str);
            }
        }).m21881x(qa00.m175859d(8.0f));
        C4499d.m21895l().m21907t(c4496a, ((tvz) this.f160413p1).m143372e0().mo50143F().m183227o0());
        i4g0.m138492A("e_bubble_chat_page_id_verification_tips", OMSDialogPositon.p_chat_view, jyb.m147494Y("tooltips_type", "bubble"), jyb.m147494Y("tooltips_type_ui", "bubble_basic_double_edge"), jyb.m147494Y("tooltips_trigger_page", "chat_page"), jyb.m147494Y("tooltips_trigger_reason", "tips"), jyb.m147494Y("tooltips_trigger_module", "null"));
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m217895q4(List list, View view) {
        String strM147764k;
        if (jyb.m147479J(list)) {
            strM147764k = k05.m147755h().m147764k();
            i4g0.m138520r("e_newmatch_next_batch", act().pageId());
            k05.m147755h().m147769p();
        } else {
            String str = (String) list.get(0);
            i4g0.m138523u("e_newmatch_next", act().pageId(), jyb.m147494Y("other_uid", ((tvz) this.f160413p1).mo111034r3()), jyb.m147494Y("newmatch_next_from", ((tvz) this.f160413p1).m111065y3()), jyb.m147494Y("newmatch_next_number", Integer.valueOf(list.size())));
            strM147764k = str;
        }
        k05.m147755h().m147770q(strM147764k);
        Intent intentM50127l2 = MessagesAct.m50127l2(act(), strM147764k, false, false, 26);
        MessagesAct.m50135u2(intentM50127l2, "newmatch_next");
        act().startActivity(intentM50127l2);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: q5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m217839N4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        m217829I3();
        final MessageWarmingUpHelper.TempDownEnum tempDownEnumM50370q = MessageWarmingUpHelper.m50370q(warmingUpLevel, ((tvz) this.f160413p1).f82473b);
        if (tempDownEnumM50370q == null) {
            return;
        }
        sfj0.m185601h("e_heat_reduce_remind", ((tvz) this.f160413p1).pageId(), sfj0.C20032a.m185615h("heat_reduce_function_name", tempDownEnumM50370q.key));
        this.f160339G0.removeAllViews();
        if (tempDownEnumM50370q == MessageWarmingUpHelper.TempDownEnum.message) {
            oze.C19253a c19253aM217767M3 = m217767M3(this.f160410o1, tempDownEnumM50370q.imageRes);
            if (NullChecker.m82486a(c19253aM217767M3)) {
                this.f160388e.setImageResource(c19253aM217767M3.f149876d);
            }
        } else if (tempDownEnumM50370q == MessageWarmingUpHelper.TempDownEnum.photo) {
            this.f160388e.setImageResource(ibc0.f113942W6);
        } else if (tempDownEnumM50370q == MessageWarmingUpHelper.TempDownEnum.chuEmo || tempDownEnumM50370q == MessageWarmingUpHelper.TempDownEnum.friendEmo) {
            Sticker stickerM35929r3 = CoreModule.f18264c.f20366Z.m35929r3(tempDownEnumM50370q.imageRes);
            if (NullChecker.m82486a(stickerM35929r3) && !jyb.m147479J(stickerM35929r3.pictures)) {
                uqb0.f180374G.m127115L0(this.f160388e, stickerM35929r3.pictures.get(0).url);
            }
        }
        this.f160384c.setText(String.format("温度下降了%s°C", MessageWarmingUpHelper.m50355b(((tvz) this.f160413p1).m111009m3() - ((tvz) this.f160413p1).m110999k3())) + SignParameters.NEW_LINE + tempDownEnumM50370q.title);
        this.f160390f.setText(tempDownEnumM50370q.content);
        bnl0.m105509E0(this.f160386d, new View.OnClickListener() { // from class: l.ixz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117484a.m217827G4(tempDownEnumM50370q, view);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f160380a, "alpha", 0.0f, 1.0f));
        arrayList.add(gt0.m132171q(this.f160380a, "translationY", qa00.m175859d(7.0f), 0.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C21717k());
        animatorSet.setDuration(483L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        l51.m152888H(this.f160410o1, new Runnable() { // from class: l.jxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f123100a.m217828H4();
            }
        }, 750L);
        l51.m152888H(this.f160410o1, new Runnable() { // from class: l.kxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f129255a.m217830I4();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        SVGALoader.with(this.f160410o1).from(MessageWarmingUpHelper.m50377x()).autoPlay(true).repeatCount(5).into(this.f160394h);
    }

    @Override // p153l.qzz
    /* JADX INFO: renamed from: r */
    public void mo178970r() {
        super.mo178970r();
        if (CoreModule.m30933P().m143412i().mo180409V0()) {
            m217849T3();
        }
        m217842P3();
        m217851U3();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m217897r4() {
        bnl0.m105524M(this.f160412p0, true);
    }

    /* JADX INFO: renamed from: r5 */
    public void m217898r5() {
        if (!CoreModule.m30933P().m143412i().mo180308D() || CoreModule.f18264c.f20373b1.f193005S.get().booleanValue()) {
            return;
        }
        l51.m152890J(this.f202044f2);
        l51.m152888H(act(), this.f202044f2, 500L);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m217899s4() {
        ((tvz) this.f160413p1).m193122Dg();
    }

    /* JADX INFO: renamed from: s5 */
    public final void m217900s5() {
        final EmojiAnimData emojiAnimDataM193576b = tye.m193572c().m193576b();
        final double dDoubleValue = emojiAnimDataM193576b.emojiAnimCreatedTime.containsKey(((tvz) this.f160413p1).m110989i3()) ? emojiAnimDataM193576b.emojiAnimCreatedTime.get(((tvz) this.f160413p1).m110989i3()).doubleValue() + 1.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        ((tvz) this.f160413p1).act().duringCreated(C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.swz
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f171061a.m217832J4(dDoubleValue, (uxj0) obj);
            }
        }).observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.twz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176436a.m217834K4(emojiAnimDataM193576b, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m217901t4() {
        this.f160417r1.m137702y(true, new Runnable() { // from class: l.rwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f165259a.m217899s4();
            }
        });
        i4g0.m138523u("e_close_click", this.f160410o1.pageId(), pf60.m172085a("shortcut_type", "emoji_picture"));
    }

    /* JADX INFO: renamed from: t5 */
    public void m217902t5() {
        if (m217861Z3()) {
            this.f160402k1.m46626F();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m217903u4() {
        ((tvz) this.f160413p1).m193122Dg();
    }

    /* JADX INFO: renamed from: u5 */
    public void m217904u5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m50375v("降温动画");
        int i = warmingUpLevel.value;
        if (i <= MessageWarmingUpHelper.WarmingUpLevel.not.value || i >= MessageWarmingUpHelper.WarmingUpLevel.five.value) {
            ((tvz) this.f160413p1).f176335P0 = false;
            return;
        }
        int i2 = MessageWarmingUpHelper.WarmingUpLevel.first.value;
        MessagesAct messagesAct = this.f160410o1;
        if (i > i2) {
            l51.m152886F(messagesAct, new Runnable() { // from class: l.cxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84287a.m217836L4(warmingUpLevel);
                }
            });
        } else {
            l51.m152886F(messagesAct, new Runnable() { // from class: l.dxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91126a.m217837M4(warmingUpLevel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m217905v4() {
        mo178911Q1(true, new Runnable() { // from class: l.ywz
            @Override // java.lang.Runnable
            public final void run() {
                this.f201898a.m217903u4();
            }
        });
    }

    /* JADX INFO: renamed from: v5 */
    public final void m217906v5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m50375v("tempDownAnimInner");
        this.f202035W1 = this.f160410o1.duringCreated(C22421c.interval(1L, TimeUnit.MILLISECONDS)).subscribe(psd0.m173597H(new y20() { // from class: l.qxz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160085a.m217841O4(warmingUpLevel, (Long) obj);
            }
        }, new y20() { // from class: l.rxz
            @Override // p153l.y20
            public final void call(Object obj) {
                yxz.m217781a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m217907w4(List list) {
        this.f160417r1.m137683B(12);
        ItemBreakIceMessage itemBreakIceMessage = (ItemBreakIceMessage) p9r.m171370a(this.f160410o1).inflate(qec0.f156926Q2, (ViewGroup) this.f160339G0, false);
        this.f160339G0.addView(itemBreakIceMessage);
        itemBreakIceMessage.m49231h(this.f160410o1, CoreModule.f18264c.f20384f0.m34132te(((tvz) this.f160413p1).m110989i3(), list), new Runnable() { // from class: l.gwz
            @Override // java.lang.Runnable
            public final void run() {
                this.f106876a.m217905v4();
            }
        });
        m178944f2(12, new Runnable() { // from class: l.hwz
            @Override // java.lang.Runnable
            public final void run() {
                yxz.m217769O2();
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public void m217908w5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        MessageWarmingUpHelper.m50375v("升温动画");
        if (warmingUpLevel != MessageWarmingUpHelper.WarmingUpLevel.not) {
            l51.m152886F(this.f160410o1, new Runnable() { // from class: l.exz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96360a.m217843P4(warmingUpLevel2, warmingUpLevel);
                }
            });
        } else {
            m217910x5(warmingUpLevel, warmingUpLevel2);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m217909x4() {
        this.f160417r1.m137683B(11);
        MessageExchangeQuestionAnswerLayout messageExchangeQuestionAnswerLayout = (MessageExchangeQuestionAnswerLayout) p9r.m171370a(this.f160410o1).inflate(qec0.f156980Y4, (ViewGroup) this.f160339G0, false);
        this.f160339G0.addView(messageExchangeQuestionAnswerLayout);
        messageExchangeQuestionAnswerLayout.m50055a0(this.f160410o1, this);
        m178944f2(11, new Runnable() { // from class: l.pwz
            @Override // java.lang.Runnable
            public final void run() {
                yxz.m217788h3();
            }
        });
        bnl0.m105538V(messageExchangeQuestionAnswerLayout, qa00.f156326m - this.f160339G0.getPaddingLeft());
    }

    /* JADX INFO: renamed from: x5 */
    public final void m217910x5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        this.f202034V1 = this.f160410o1.duringCreated(C22421c.interval(1L, TimeUnit.MILLISECONDS)).subscribe(psd0.m173597H(new y20() { // from class: l.gxz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107016a.m217852U4(warmingUpLevel, warmingUpLevel2, (Long) obj);
            }
        }, new y20() { // from class: l.hxz
            @Override // p153l.y20
            public final void call(Object obj) {
                yxz.m217810v2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m217911y4(String str, View view) {
        gta.m132210e().m132214d().mo34916r7(act());
        i4g0.m138523u("e_chat_safety_notice", OMSDialogPositon.p_chat_view, jyb.m147494Y("user_risk_type", str));
    }

    /* JADX INFO: renamed from: y5 */
    public void m217912y5(int i) {
        VoiceCallControlView voiceCallControlView = this.f202028P1;
        if (voiceCallControlView == null) {
            return;
        }
        voiceCallControlView.m51270x(i);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m217913z4() {
        ((tvz) this.f160413p1).m193122Dg();
    }

    /* JADX INFO: renamed from: z5 */
    public void m217914z5(int i) {
        this.f160400k.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, -1}));
        this.f160410o1.setStatusBarColor(i);
        this.f160393g1.setBackgroundColor(this.f160410o1.getResources().getColor(g9c0.f102807Y));
    }

    /* JADX INFO: renamed from: l.yxz$b */
    public class C21708b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public boolean f202049a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ sv4 f202050b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f202051c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kcg0[] f202052d;

        public C21708b(sv4 sv4Var, ViewGroup viewGroup, kcg0[] kcg0VarArr) {
            this.f202050b = sv4Var;
            this.f202051c = viewGroup;
            this.f202052d = kcg0VarArr;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            yxz.this.f202033U1 = false;
            yxz.this.f202037Y1.m137019l(uxj0.f181467a);
            bnl0.m105524M(yxz.this.f202036X1, false);
            this.f202051c.removeView(yxz.this.f202036X1);
            psd0.m173633z(this.f202052d[0]);
            yxz.this.f202036X1 = null;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            int i2;
            super.onStep(i);
            if (!this.f202049a && (i2 = this.f202050b.f170802i) > 0 && i >= i2) {
                this.f202049a = true;
                ((Vibrator) CoreModule.f18263b.getSystemService("vibrator")).vibrate(this.f202050b.f170803j);
            }
            if (jyb.m147479J(this.f202050b.f170804k)) {
                return;
            }
            for (int i3 = 0; i3 < this.f202050b.f170804k.size(); i3++) {
                pf60<Integer, Boolean> pf60Var = this.f202050b.f170804k.get(i3);
                if (i > pf60Var.f152156a.intValue() && !pf60Var.f152157b.booleanValue()) {
                    this.f202050b.f170804k.set(i3, pf60.m172085a(pf60Var.f152156a, Boolean.TRUE));
                    gt0.m132166l(this.f202051c, gt0.f106354i, 0L, 140L, null, 1.0f, 0.9f, 1.0f).start();
                    return;
                }
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
        }
    }

    /* JADX INFO: renamed from: l.yxz$c */
    public class C21709c implements RequestCallback {
        public C21709c() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            yxz.this.f202033U1 = false;
            yxz.this.f202037Y1.m137019l(uxj0.f181467a);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
    }
}
