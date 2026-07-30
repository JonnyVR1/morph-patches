package p149l;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.EmojiAnimData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Prologue;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeLifePhotoAct;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBreakIceMessage;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageLeft;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageChatPrologueLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageExchangeQuestionAnswerLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagePicLikeGuideLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageProfileSettingAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.voicecall.VoiceCallControlView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
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
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class bpz extends tqz<wmz> implements RunnableC4733c0.c {

    /* JADX INFO: renamed from: M1 */
    public boolean f76692M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f76693N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f76694O1;

    /* JADX INFO: renamed from: P1 */
    public VoiceCallControlView f76695P1;

    /* JADX INFO: renamed from: Q1 */
    public tzz f76696Q1;

    /* JADX INFO: renamed from: R1 */
    public roy f76697R1;

    /* JADX INFO: renamed from: S1 */
    public final String f76698S1;

    /* JADX INFO: renamed from: T1 */
    public boolean f76699T1;

    /* JADX INFO: renamed from: U1 */
    public boolean f76700U1;

    /* JADX INFO: renamed from: V1 */
    public c4g0 f76701V1;

    /* JADX INFO: renamed from: W1 */
    public c4g0 f76702W1;

    /* JADX INFO: renamed from: X1 */
    public SVGAnimationView f76703X1;

    /* JADX INFO: renamed from: Y1 */
    public C22393b<roj0> f76704Y1;

    /* JADX INFO: renamed from: Z1 */
    public boolean f76705Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f76706a2;

    /* JADX INFO: renamed from: b2 */
    public int[] f76707b2;

    /* JADX INFO: renamed from: c2 */
    public RectF f76708c2;

    /* JADX INFO: renamed from: d2 */
    public RectF f76709d2;

    /* JADX INFO: renamed from: e2 */
    public RectF f76710e2;

    /* JADX INFO: renamed from: f2 */
    public Runnable f76711f2;

    /* JADX INFO: renamed from: g2 */
    public List<d30> f76712g2;

    /* JADX INFO: renamed from: h2 */
    public final Property<View, Integer> f76713h2;

    /* JADX INFO: renamed from: i2 */
    public boolean f76714i2;

    /* JADX INFO: renamed from: l.bpz$a */
    public class C15928a extends Property<View, Integer> {
        public C15928a(Class cls, String str) {
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
            bpz.this.m103275z5(num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.bpz$d */
    public class C15931d extends jf50 {
        public C15931d() {
        }

        @Override // p149l.jf50
        /* JADX INFO: renamed from: b */
        public void mo48377b(int i, int i2) {
            super.mo48377b(i, i2);
            if (i2 != 0) {
                bpz.this.m190297e0();
            }
        }
    }

    /* JADX INFO: renamed from: l.bpz$e */
    public class C15932e implements ud50 {

        /* JADX INFO: renamed from: a */
        public float f76723a = 0.0f;

        /* JADX INFO: renamed from: b */
        public boolean f76724b = false;

        public C15932e() {
        }

        @Override // p149l.ud50
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f76723a = motionEvent.getY();
                this.f76724b = false;
            } else if (action == 1) {
                this.f76724b = false;
            } else if (action == 2) {
                float y = motionEvent.getY();
                if (!this.f76724b && this.f76723a - y > 0.0f) {
                    bpz.this.m190297e0();
                    this.f76724b = true;
                }
                this.f76723a = y;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.bpz$f */
    public class C15933f extends AnimListener {
        public C15933f() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onStart();
            bpz.this.f76705Z1 = false;
            xdl0.m208344M(bpz.this.f171702S0, false);
            bpz.this.f76706a2 = true;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(bpz.this.f171702S0, true);
        }
    }

    /* JADX INFO: renamed from: l.bpz$g */
    public class RunnableC15934g implements Runnable {
        public RunnableC15934g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int lastVisiblePositionHook = bpz.this.f171745n1.getLastVisiblePositionHook() - bpz.this.f171745n1.getFirstVisiblePositionHook(); lastVisiblePositionHook >= 0; lastVisiblePositionHook--) {
                View viewMo49611C = bpz.this.f171745n1.mo49611C(lastVisiblePositionHook);
                if (bpz.this.f76696Q1 != null && viewMo49611C == bpz.this.f76696Q1.mo129345g()) {
                    bpz bpzVar = bpz.this;
                    if (bpzVar.m103217Y3(bpzVar.f76696Q1.m191246u())) {
                        zxz.m220864h().m220870m(((wmz) bpz.this.f171750p1).mo120828r3(), "headView");
                        zxz.m220864h().m220873p(((wmz) bpz.this.f171750p1).mo120828r3(), "headView", bpz.this.f76696Q1.m191248w(), bpz.this.f76696Q1.m191246u());
                        return;
                    }
                } else if (viewMo49611C instanceof ItemMessageLeft) {
                    ItemMessageLeft itemMessageLeft = (ItemMessageLeft) viewMo49611C;
                    if (bpz.this.m103217Y3(itemMessageLeft.f31177M)) {
                        zxz.m220864h().m220870m(((wmz) bpz.this.f171750p1).mo120828r3(), itemMessageLeft.getMessageId());
                        itemMessageLeft.m48420W0();
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.bpz$h */
    public class C15935h implements VoiceCallControlView.InterfaceC8599b {
        public C15935h() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.voicecall.VoiceCallControlView.InterfaceC8599b
        /* JADX INFO: renamed from: a */
        public void mo50090a(boolean z) {
            if (z) {
                return;
            }
            View messageBarRoot = ((wmz) bpz.this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0().getMessageBarRoot();
            ViewGroup.LayoutParams layoutParams = messageBarRoot.getLayoutParams();
            layoutParams.height = -2;
            messageBarRoot.setLayoutParams(layoutParams);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.voicecall.VoiceCallControlView.InterfaceC8599b
        /* JADX INFO: renamed from: b */
        public void mo50091b(float f, int i, int i2, boolean z) {
            View messageBarRoot = ((wmz) bpz.this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0().getMessageBarRoot();
            int height = messageBarRoot.getHeight();
            if (height > 0) {
                if (((wmz) bpz.this.f171750p1).m156455e0().mo48971c0().m213051E0() || z) {
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

    /* JADX INFO: renamed from: l.bpz$i */
    public class C15936i extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f76729a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f76730b;

        public C15936i(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
            this.f76729a = warmingUpLevel;
            this.f76730b = warmingUpLevel2;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bpz.this.m103271x5(this.f76729a, this.f76730b);
        }
    }

    /* JADX INFO: renamed from: l.bpz$j */
    public class C15937j extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f76732a;

        public C15937j(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f76732a = warmingUpLevel;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bpz.this.m103267v5(this.f76732a);
        }
    }

    /* JADX INFO: renamed from: l.bpz$k */
    public class C15938k extends bt0.C15966j {
        public C15938k() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bpz.this.f171717a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.bpz$l */
    public class C15939l extends bt0.C15966j {
        public C15939l() {
        }

        @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            bpz.this.m190281X1();
        }
    }

    public bpz(MessagesAct messagesAct) {
        super(messagesAct);
        this.f76692M1 = false;
        this.f76693N1 = false;
        this.f76694O1 = false;
        this.f76698S1 = "giftTipKey";
        this.f76699T1 = false;
        this.f76700U1 = false;
        this.f76704Y1 = C22393b.m221521b();
        this.f76705Z1 = false;
        this.f76706a2 = false;
        this.f76707b2 = new int[2];
        this.f76708c2 = new RectF();
        this.f76709d2 = new RectF();
        this.f76710e2 = new RectF();
        this.f76711f2 = new RunnableC15934g();
        this.f76712g2 = new ArrayList();
        this.f76713h2 = new C15928a(Integer.TYPE, "backgroundColor");
        this.f76714i2 = false;
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m103106D2() {
    }

    /* JADX INFO: renamed from: M3 */
    public static kye.C18115a m103120M3(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList<kye.C18115a> arrayList = kye.f125279d;
            if (!vwb.m200296J(arrayList)) {
                for (kye.C18115a c18115a : arrayList) {
                    if (str.contains(context.getResources().getString(c18115a.f125287b))) {
                        return c18115a;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ void m103122O2() {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m103134a3(Throwable th) {
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m103141h3() {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m103161u2(String str) {
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ void m103163v2(Throwable th) {
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m103168y2(Throwable th) {
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m103170z2() {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m103172A4() {
        e51.m114743H(this.f171747o1, new Runnable() { // from class: l.doz
            @Override // java.lang.Runnable
            public final void run() {
                this.f87214a.m103274z4();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: A5 */
    public void m103173A5(boolean z) {
        this.f171738k0.setVisible(z);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m103174B4() {
        mo103201Q1(true, new Runnable() { // from class: l.znz
            @Override // java.lang.Runnable
            public final void run() {
                this.f204036a.m103172A4();
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public void m103175B5() {
        MessageWarmingUpHelper.m49192v("动画结束");
        ((wmz) this.f171750p1).f187198P0 = false;
        mkd0.m154992z(this.f76701V1);
        mkd0.m154992z(this.f76702W1);
        if (NullChecker.m81303a(((wmz) this.f171750p1).f187200R0)) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.ioz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114218a.m103212V4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m103176C4(List list, String str) {
        this.f171754r1.m146772B(14);
        MessageChatPrologueLayout messageChatPrologueLayout = (MessageChatPrologueLayout) o7r.m163037a(this.f171747o1).inflate(l6c0.f126418X4, (ViewGroup) this.f171676G0, false);
        this.f171676G0.addView(messageChatPrologueLayout);
        messageChatPrologueLayout.m48858d0(this.f171747o1, list, this, str);
        m190301f2(14, new Runnable() { // from class: l.rnz
            @Override // java.lang.Runnable
            public final void run() {
                bpz.m103170z2();
            }
        });
        xdl0.m208358V(messageChatPrologueLayout, t100.f167264m - this.f171676G0.getPaddingLeft());
        zvf0.m220368A("e_send_opening_guidance", this.f171747o1.pageId(), vwb.m200311Y("opening_guidance_showtime", str), vwb.m200311Y("opening_content", ((Prologue) list.get(0)).value));
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: D0 */
    public void mo103177D0() {
        super.mo103177D0();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m103178D4(dd80 dd80Var) {
        dd80Var.dismiss();
        this.f171747o1.m66873d2();
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: E1 */
    public boolean mo103179E1(Menu menu) {
        super.mo103179E1(menu);
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            MenuItem menuItemAdd = menu.add(4, y4c0.f196160k2, 2, "");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(l6c0.f126447c1);
            xdl0.m208329E0(menuItemAdd.getActionView().findViewById(y4c0.f196160k2), new View.OnClickListener() { // from class: l.xmz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f193626a.m103240j4(view);
                }
            });
            return true;
        }
        if (((wmz) this.f171750p1).m120759d4()) {
            CoreModule.m29935P().m94658i().mo158410m4(menu, ((wmz) this.f171750p1).mo120828r3(), act(), new d30() { // from class: l.inz
                @Override // p149l.d30
                public final void call() {
                    this.f114075a.m103243k4();
                }
            });
            return true;
        }
        P p = this.f171750p1;
        if (((wmz) p).m120794k4(((wmz) p).mo120828r3())) {
            CoreModule.m29935P().m94658i().mo158437r1(menu, ((wmz) this.f171750p1).mo120828r3(), act(), false, false, null, null, null, null);
            return true;
        }
        CoreModule.m29935P().m94658i().mo158262L2(menu, ((wmz) this.f171750p1).mo120828r3(), act(), true, true, null, null, null, true, CoreModule.m29935P().m94658i().mo158216D(), "chat_page");
        return true;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m103180E4(int i, View view) {
        CoreModule.f17545c.f19642f0.f19980u1.put(Integer.valueOf(i));
        CoreModule.f17545c.f19642f0.f19977t1.put(Long.valueOf(mqi0.m155944o()));
        zvf0.m220402x("e_switchphoto_pop", ((wmz) this.f171750p1).pageId());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m103181F4(String str) {
        this.f76693N1 = false;
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m103182G4(MessageWarmingUpHelper.TempDownEnum tempDownEnum, View view) {
        if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.message) {
            ((wmz) this.f171750p1).m120708S6(tempDownEnum.imageRes + tempDownEnum.content);
        } else if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.photo) {
            MessagesAct messagesAct = this.f171747o1;
            messagesAct.startActivityForResult(MediaPickerAct.m78919X1(messagesAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f171747o1.getString(R$string.f20979h)).withFromType(4).build()), PutongAct.REQUEST_CODE_PICKER);
            this.f171747o1.overridePendingTransition(szb0.f167030e, szb0.f167026a);
        } else if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.chuEmo || tempDownEnum == MessageWarmingUpHelper.TempDownEnum.friendEmo) {
            Sticker stickerM34926r3 = CoreModule.f17545c.f19624Z.m34926r3(tempDownEnum.imageRes);
            if (NullChecker.m81303a(stickerM34926r3) && !TextUtils.isEmpty(stickerM34926r3.f56011id)) {
                ((wmz) this.f171750p1).m120703R6(stickerM34926r3, false);
            }
        }
        o6j0.m162859c("e_heat_reduce_remind", ((wmz) this.f171750p1).pageId(), o6j0.C18854a.m162878h("heat_reduce_function_name", tempDownEnum.key));
        m190281X1();
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: H1 */
    public void mo103183H1(Message message) {
        if (!TEnum.equals(message.messageType, "text") || message.f56011id.startsWith(DbObject.FAKE_ID_PRIVATE_QUESTION_PREFIX) || message.f56011id.startsWith("fake_id_") || !this.f76706a2) {
            return;
        }
        EmojiAnimData emojiAnimDataM171839b = pxe.m171835c().m171839b();
        if (!emojiAnimDataM171839b.emojiAnimCreatedTime.containsKey(((wmz) this.f171750p1).m120783i3()) || message.createdTime > emojiAnimDataM171839b.emojiAnimCreatedTime.get(((wmz) this.f171750p1).m120783i3()).doubleValue()) {
            String strM171837f = pxe.m171837f(message.value);
            if (TextUtils.isEmpty(strM171837f)) {
                return;
            }
            Map<String, Integer> map = kye.f125283h;
            if (map.containsKey(strM171837f)) {
                m103218Y4(map.get(strM171837f).intValue(), message);
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m103184H4() {
        SVGALoader.with(this.f171747o1).from("https://auto.tancdn.com/v1/raw/3590924d-0e8a-4b36-9c6f-25e1d8559e5810.svga").autoPlay(true).repeatCount(1).into(this.f171729g);
    }

    /* JADX INFO: renamed from: I3 */
    public final void m103185I3() {
        View viewInflate = o7r.m163037a(this.f171747o1).inflate(l6c0.f126583v4, (ViewGroup) this.f171746o, false);
        m190308i0(viewInflate);
        int childCount = this.f171746o.getChildCount();
        for (int i = 0; i < this.f171746o.getChildCount(); i++) {
            if (this.f171746o.getChildAt(i) == ((wmz) this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0()) {
                childCount = i;
                break;
            }
        }
        this.f171746o.addView(viewInflate, childCount);
        this.f171717a.setVisibility(8);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m103186I4() {
        LinearLayout linearLayout = this.f171717a;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.0f).setDuration(300L);
            duration.addListener(new C15939l());
            duration.start();
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m103187J3(View view, RectF rectF) {
        view.getLocationOnScreen(this.f76707b2);
        int[] iArr = this.f76707b2;
        float f = iArr[0];
        rectF.left = f;
        rectF.top = iArr[1];
        rectF.right = f + view.getWidth();
        rectF.bottom = rectF.top + view.getHeight();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ j760 m103188J4(double d, roj0 roj0Var) {
        List<Message> listM206048F = CoreModule.f17553k.f91940c.m206048F(((wmz) this.f171750p1).m120783i3(), d);
        if (vwb.m200296J(listM206048F)) {
            return j760.m140076a("", null);
        }
        for (Message message : listM206048F) {
            if (TEnum.equals(message.messageType, "text")) {
                String strM171837f = pxe.m171837f(message.value);
                if (!TextUtils.isEmpty(strM171837f) && kye.f125283h.containsKey(strM171837f)) {
                    return j760.m140076a(strM171837f, message);
                }
            }
        }
        return j760.m140076a("", listM206048F.get(0));
    }

    /* JADX INFO: renamed from: K3 */
    public void m103189K3() {
        Iterator<d30> it = this.f76712g2.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f76712g2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m103190K4(EmojiAnimData emojiAnimData, j760 j760Var) {
        if (!TextUtils.isEmpty((CharSequence) j760Var.f116564a)) {
            m103218Y4(kye.f125283h.get(j760Var.f116564a).intValue(), (Message) j760Var.f116565b);
            return;
        }
        if (NullChecker.m81303a(j760Var.f116565b)) {
            emojiAnimData.emojiAnimCreatedTime.put(((wmz) this.f171750p1).m120783i3(), Double.valueOf(((Message) j760Var.f116565b).createdTime));
            pxe.m171835c().m171844j(emojiAnimData);
        }
        this.f76706a2 = true;
    }

    /* JADX INFO: renamed from: L3 */
    public void m103191L3(d30 d30Var) {
        if (((wmz) this.f171750p1).lifecycle_() == C4319c.f15548i) {
            d30Var.call();
        } else {
            this.f76712g2.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m103192L4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f171747o1).from(MessageWarmingUpHelper.m49193w(warmingUpLevel)).autoPlay(true).animListener(new C15937j(warmingUpLevel)).repeatCount(1).into(this.f171743m1);
    }

    /* JADX INFO: renamed from: N3 */
    public C22306c<roj0> m103194N3() {
        return this.f76704Y1;
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: O0 */
    public void mo103196O0(int i, boolean z) {
        super.mo103196O0(i, z);
        ((wmz) this.f171750p1).m204402Rg(z);
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m103197O3() {
        return !vwb.m200296J(this.f76712g2);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m103198O4(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, Long l2) {
        if (l2.longValue() > 11000) {
            m103175B5();
            return;
        }
        int iLongValue = (int) l2.longValue();
        if (iLongValue == 2233) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.voz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182437a.m103195N4(warmingUpLevel);
                }
            });
        }
        MessageBar messageBarM128210t0 = ((wmz) this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0();
        if (NullChecker.m81303a(messageBarM128210t0)) {
            messageBarM128210t0.mo48840k(iLongValue, warmingUpLevel, ((wmz) this.f171750p1).m120793k3());
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m103199P3() {
        ((wmz) this.f171750p1).act().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.bnz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76468a.m103229e4((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m103200P4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.f167264m);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.f171747o1.getResources().getColor(a1c0.f67146a0));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        sVGADynamicEntity.setDynamicText(MessageWarmingUpHelper.m49172b(((wmz) this.f171750p1).m120803m3()) + "°C", textPaint, "wendushu");
        SVGALoader.with(this.f171747o1).from(MessageWarmingUpHelper.m49195y(warmingUpLevel)).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C15936i(warmingUpLevel2, warmingUpLevel)).repeatCount(1).into(this.f171743m1);
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: Q1 */
    public void mo103201Q1(boolean z, Runnable runnable) {
        if (NullChecker.m81303a(this.f171676G0) && this.f171676G0.getChildCount() == 0) {
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        } else if (this.f171676G0.getChildCount() > 0) {
            if (NullChecker.m81303a(this.f171754r1)) {
                this.f171754r1.m146791y(z, null);
            }
            m190270R1(z, runnable);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m103202Q4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f171747o1).from(MessageWarmingUpHelper.m49170A(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f171744n);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: R3 */
    public void m103203R3() {
        if (CoreModule.m29935P().m94652b().mo35107Yg() && this.f171766x1 == null) {
            Conversation conversationM120788j3 = ((wmz) this.f171750p1).m120788j3();
            if (NullChecker.m81303a(conversationM120788j3)) {
                long j = (NullChecker.m81303a(conversationM120788j3.property) && NullChecker.m81303a(conversationM120788j3.property.intl_love_buzz)) ? conversationM120788j3.property.intl_love_buzz.expire : 0L;
                this.f171724d1.setBackgroundResource(c3c0.f78757h1);
                this.f171722c1.setBackgroundResource(c3c0.f78766i1);
                this.f171726e1.setText(CoreModule.m29935P().m94652b().mo35102Uq(j) + "  ");
                if (!xdl0.m208349O0(this.f171722c1)) {
                    m190255I0();
                    m190293c2(getContext().getResources().getString(R$string.f21096u3));
                }
                if (!CoreModule.m29935P().m94652b().mo35117la(j)) {
                    m190341z0();
                    return;
                }
                RunnableC4733c0.a aVar = new RunnableC4733c0.a();
                aVar.m31523g("countdown_item_love_buzz_key").m31522f(j).m31524h(60L).m31517a(true).m31520d(this);
                CoreModule.f17545c.f19685t1.m31513r(aVar);
                this.f171766x1 = act().duringCreated(CoreModule.f17545c.f19685t1.m31509n("countdown_item_love_buzz_key")).subscribe(mkd0.m154955G(new e30() { // from class: l.cnz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f81699a.m103232f4((RunnableC4733c0.b) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m103204R4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f171747o1).from(MessageWarmingUpHelper.m49196z(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f171740l);
    }

    /* JADX INFO: renamed from: S3 */
    public void m103205S3(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (warmingUpLevel.value <= MessageWarmingUpHelper.WarmingUpLevel.first.value) {
            return;
        }
        xdl0.m208344M(this.f171675G, false);
        m103275z5(MessageWarmingUpHelper.m49183m(warmingUpLevel));
        m190310j0().m162104y();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m103206S4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        ((wmz) this.f171750p1).m120742Z6(warmingUpLevel);
        m190310j0().m162104y();
        SVGALoader.with(this.f171747o1).from(MessageWarmingUpHelper.m49170A(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f171744n);
    }

    /* JADX INFO: renamed from: T3 */
    public void m103207T3() {
        if (User.isTeamAccount(((wmz) this.f171750p1).f96911c)) {
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(((wmz) this.f171750p1).mo120828r3());
        VText vText = this.f171681I;
        StringBuilder sb = new StringBuilder("无法收到");
        sb.append(userM169430Pa.isFemale() ? "她" : "他");
        sb.append("的消息通知 ");
        vText.setText(sb.toString());
        this.f171683J.setText("仅打开好友消息通知，及时回复".concat(userM169430Pa.isFemale() ? "她" : "他"));
        if (CoreModule.m29935P().m94658i().mo158226E3()) {
            m190326r0();
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158295R2(((wmz) this.f171750p1).f96911c)) {
            xdl0.m208344M(this.f171678H, true);
            zvf0.m220402x("e_open_button_click", OMSDialogPositon.p_chat_view);
            HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149451q0.get();
            if (hashSet.size() < 2) {
                hashSet.add(((wmz) this.f171750p1).f96911c);
                CoreModule.f17545c.f19639e0.f149451q0.put(hashSet);
            }
            xdl0.m208329E0(this.f171687L, new View.OnClickListener() { // from class: l.ymz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f199130a.m103234g4(view);
                }
            });
            xdl0.m208329E0(this.f171685K, new View.OnClickListener() { // from class: l.zmz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203907a.m103238i4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m103208T4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f171737k, this.f76713h2, MessageWarmingUpHelper.m49183m(warmingUpLevel), MessageWarmingUpHelper.m49183m(warmingUpLevel2));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        if (warmingUpLevel == MessageWarmingUpHelper.WarmingUpLevel.first) {
            arrayList.add(bt0.m103744q(this.f171675G, "alpha", 1.0f, 0.0f));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(900L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m103209U3() {
        if (m190328s0()) {
            hmb.m131701M(this.f171675G, false);
            hmb.m131701M(this.f171695P, true);
            this.f171745n1.mo49617n(new C15931d());
            this.f171701S.setOnDispatchTouchEventListener(new C15932e());
            fuz fuzVar = new fuz(act(), new e30() { // from class: l.enz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92402a.m103244k5((Media) obj);
                }
            });
            ArrayList arrayListM200339n = vwb.m200339n(CoreModule.f17545c.f19639e0.m169430Pa(((wmz) this.f171750p1).f96910b).pictures, new w9j() { // from class: l.fnz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            });
            fuzVar.m123239O(arrayListM200339n.subList(1, arrayListM200339n.size()));
            this.f171697Q.setAdapter(fuzVar);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m103210U4(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, Long l2) {
        if (l2.longValue() > 11000) {
            m103175B5();
            return;
        }
        int iLongValue = (int) l2.longValue();
        if (warmingUpLevel == MessageWarmingUpHelper.WarmingUpLevel.not) {
            if (iLongValue == 150) {
                e51.m114741F(this.f171747o1, new Runnable() { // from class: l.ooz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144933a.m103202Q4(warmingUpLevel2);
                    }
                });
            }
        } else if (iLongValue == 1450) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.qoz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155653a.m103204R4(warmingUpLevel2);
                }
            });
        } else if (iLongValue == 2150) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.roz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160459a.m103206S4(warmingUpLevel2);
                }
            });
        } else if (iLongValue == 2886) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.soz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165735a.m103208T4(warmingUpLevel, warmingUpLevel2);
                }
            });
        }
        MessageBar messageBarM128210t0 = ((wmz) this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0();
        if (NullChecker.m81303a(messageBarM128210t0)) {
            messageBarM128210t0.mo48841l(iLongValue, warmingUpLevel, warmingUpLevel2, ((wmz) this.f171750p1).m120803m3());
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m103211V3(User user) {
        ((wmz) this.f171750p1).m156455e0().mo48959E().mo137249x0(user);
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m103212V4() {
        P p = this.f171750p1;
        if (((wmz) p).f187200R0 == null) {
            return;
        }
        ChatHeat chatHeatMo223809clone = ((wmz) p).f187200R0.mo223809clone();
        ((wmz) this.f171750p1).f187200R0 = null;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM49188r = MessageWarmingUpHelper.m49188r(chatHeatMo223809clone.degree);
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM120798l3 = ((wmz) this.f171750p1).m120798l3();
        MessageWarmingUpHelper.m49192v("升温执行cache currentLevel = " + warmingUpLevelM120798l3 + " chatHeat=" + chatHeatMo223809clone.toJson());
        if (!NullChecker.m81303a(warmingUpLevelM120798l3) || warmingUpLevelM49188r.value <= warmingUpLevelM120798l3.value) {
            return;
        }
        ((wmz) this.f171750p1).m204377Mg(chatHeatMo223809clone);
    }

    /* JADX INFO: renamed from: W3 */
    public void m103213W3(boolean z) {
        this.f76694O1 = z;
        ((wmz) this.f171750p1).m156455e0().mo48971c0().m156457g0().mo134711l();
    }

    /* JADX INFO: renamed from: W4 */
    public void m103214W4(boolean z) {
        this.f76714i2 = z;
        if (NullChecker.m81303a(this.f171754r1) && this.f171754r1.m146780m() == 10 && this.f171676G0.getChildCount() > 0 && NullChecker.m81303a(this.f171754r1.f124073d) && NullChecker.m81303a(this.f171754r1.f124073d.getAdapter())) {
            this.f171754r1.m146777G();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m103215X3(View view) {
        m103187J3(((wmz) this.f171750p1).m156455e0().mo48959E().m194277n0(), this.f76708c2);
        m103187J3(view, this.f76709d2);
        m103187J3(((wmz) this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0(), this.f76710e2);
        RectF rectF = this.f76709d2;
        return rectF.top >= this.f76708c2.bottom && rectF.bottom <= this.f76710e2.top;
    }

    /* JADX INFO: renamed from: X4 */
    public void m103216X4() {
        m103189K3();
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m103217Y3(View view) {
        if (m103215X3(view)) {
            m103187J3(view, this.f76709d2);
            if (xdl0.m208408w0() - this.f76709d2.top >= t100.m186890d(100.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m103218Y4(int i, Message message) {
        EmojiAnimData emojiAnimDataM171839b = pxe.m171835c().m171839b();
        emojiAnimDataM171839b.emojiAnimCreatedTime.put(((wmz) this.f171750p1).m120783i3(), Double.valueOf(message.createdTime));
        pxe.m171835c().m171844j(emojiAnimDataM171839b);
        if (this.f76705Z1) {
            return;
        }
        this.f76705Z1 = true;
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(BitmapFactory.decodeResource(this.f171747o1.getResources(), i), "emoji");
        SVGALoader.with(this.f171747o1).from(CoreModule.m29935P().m94651a().mo33298Cj()).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C15933f()).repeatCount(1).into(this.f171702S0);
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m103219Z3() {
        return this.f171739k1.m45447o();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m103220Z4(final CoreGiftInfo coreGiftInfo, final d30 d30Var) {
        if (coreGiftInfo.dynamicGift) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.qnz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155515a.m103245l4(coreGiftInfo, d30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m103221a4() {
        return this.f76700U1;
    }

    /* JADX INFO: renamed from: a5 */
    public void m103222a5(final Message message, final CoreGiftInfo coreGiftInfo, final d30 d30Var, final boolean z, final String str, final boolean z2) {
        if (coreGiftInfo.dynamicGift) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.aoz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70958a.m103249n4(coreGiftInfo, d30Var, z, str, z2, message);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m103223b4() {
        return this.f76714i2;
    }

    /* JADX INFO: renamed from: b5 */
    public void m103224b5(Message message, String str, Sticker sticker) {
        if (this.f76700U1) {
            return;
        }
        this.f76700U1 = true;
        ViewGroup viewGroup = (ViewGroup) this.f171747o1.getWindow().getDecorView();
        if (this.f76703X1 == null) {
            SVGAnimationView sVGAnimationView = new SVGAnimationView(this.f171747o1);
            this.f76703X1 = sVGAnimationView;
            if (viewGroup instanceof FrameLayout) {
                ((FrameLayout) viewGroup).addView(sVGAnimationView, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        final tu4 tu4VarM190676a = tu4.m190676a(sticker);
        if (!NullChecker.m81303a(tu4VarM190676a)) {
            this.f76700U1 = false;
            this.f76704Y1.m132487l(roj0.f160388a);
            return;
        }
        if (TextUtils.equals(sticker.name, "晚安") && !message.isMe()) {
            ((wmz) this.f171750p1).m156455e0().mo48971c0().m156457g0().mo134705d();
        }
        xdl0.m208344M(this.f76703X1, true);
        tu4VarM190676a.m190680e(this.f76703X1, ((wmz) this.f171750p1).m156455e0().mo48971c0().m213065x0().m221515e().intValue(), ((wmz) this.f171750p1).m156455e0().mo48974l().m120842t7().f171733i, viewGroup);
        c4g0[] c4g0VarArr = new c4g0[1];
        SVGALoader.with(this.f171747o1).from(str).autoPlay(true).repeatCount(1).loadCallback(new C15930c()).animListener(new C15929b(tu4VarM190676a, viewGroup, c4g0VarArr)).into(this.f76703X1);
        if (tu4VarM190676a.f172127l) {
            c4g0VarArr[0] = ((wmz) this.f171750p1).m156455e0().mo48971c0().m213065x0().subscribe(mkd0.m154955G(new e30() { // from class: l.pnz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150430a.m103251o4(tu4VarM190676a, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m103225c4() {
        return this.f76694O1;
    }

    /* JADX INFO: renamed from: c5 */
    public void m103226c5(User user) {
        xdl0.m208344M(((wmz) this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0(), true);
        this.f171742m.m49790h(false, "0");
    }

    /* JADX INFO: renamed from: d4 */
    public void m103227d4(int i) {
        if (NullChecker.m81303a(this.f171743m1)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f171743m1.getLayoutParams();
            layoutParams.bottomMargin = t100.m186890d(100.0f) + Math.abs(i);
            this.f171743m1.setLayoutParams(layoutParams);
        }
        if (NullChecker.m81303a(this.f171744n)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f171744n.getLayoutParams();
            layoutParams2.bottomMargin = t100.m186890d(100.0f) + Math.abs(i);
            this.f171744n.setLayoutParams(layoutParams2);
        }
        if (NullChecker.m81303a(this.f171717a)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f171717a.getLayoutParams();
            layoutParams3.bottomMargin = Math.abs(i);
            this.f171717a.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m103228d5(boolean z) {
        String strM152328k;
        final List<String> listM152327j = lz4.m152319h().m152327j();
        if (z || !vwb.m200296J(listM152327j)) {
            if (!this.f171680H1) {
                xdl0.m208357U(this.f171749p0, t100.m186890d(96.0f));
            }
            if (vwb.m200296J(listM152327j)) {
                strM152328k = lz4.m152319h().m152328k();
                this.f171673F0.setText("再来一批");
                zvf0.m220402x("e_newmatch_next_batch", act().pageId());
            } else {
                zvf0.m220368A("e_newmatch_next", act().pageId(), vwb.m200311Y("other_uid", ((wmz) this.f171750p1).mo120828r3()), vwb.m200311Y("newmatch_next_from", ((wmz) this.f171750p1).m120859y3()), vwb.m200311Y("newmatch_next_number", Integer.valueOf(listM152327j.size())));
                strM152328k = listM152327j.get(0);
                this.f171673F0.setText(y19.m212162V() + " (" + listM152327j.size() + ")");
            }
            boolean zIsEmpty = TextUtils.isEmpty(strM152328k);
            VDraweeView vDraweeView = this.f171670E0;
            if (zIsEmpty) {
                xdl0.m208344M(vDraweeView, false);
            } else {
                xdl0.m208344M(vDraweeView, true);
                act().duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(strM152328k).first()).subscribe(mkd0.m154956H(new e30() { // from class: l.xoz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f193891a.m103253p4((User) obj);
                    }
                }, new e30() { // from class: l.yoz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        bpz.m103168y2((Throwable) obj);
                    }
                }));
            }
            xdl0.m208329E0(this.f171749p0, new View.OnClickListener() { // from class: l.zoz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204161a.m103255q4(listM152327j, view);
                }
            });
            e51.m114741F(act(), new Runnable() { // from class: l.apz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71094a.m103258r4();
                }
            });
        }
    }

    @Override // p149l.tqz, p149l.s7m
    public void destroy() {
        super.destroy();
        if (CoreModule.m29935P().m94652b().mo35107Yg()) {
            CoreModule.f17545c.f19685t1.m31516u("countdown_item_love_buzz_key");
        }
        mkd0.m154992z(this.f76701V1);
        mkd0.m154992z(this.f76702W1);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m103229e4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m103261s5();
        } else if (c4319c == C4319c.f15550k) {
            this.f76706a2 = false;
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m103230e5(int i, int i2) {
        if (i == 0 && this.f76695P1 == null) {
            return;
        }
        if (i2 == 1) {
            ((wmz) this.f171750p1).m156455e0().mo48971c0().m156457g0().mo134710k(0, -1);
        }
        if (this.f76695P1 == null) {
            VoiceCallControlView voiceCallControlView = (VoiceCallControlView) this.f171714Y0.inflate();
            this.f76695P1 = voiceCallControlView;
            voiceCallControlView.setVoiceCallAnimListener(new C15935h());
        }
        this.f76695P1.m50088y(i, i2);
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: f0 */
    public u4z mo103231f0() {
        if (((wmz) this.f171750p1).m204345Gd()) {
            roy royVar = new roy();
            this.f76697R1 = royVar;
            return royVar;
        }
        tzz tzzVar = new tzz(((wmz) this.f171750p1).mo120828r3());
        this.f76696Q1 = tzzVar;
        return tzzVar;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m103232f4(RunnableC4733c0.b bVar) {
        if (NullChecker.m81303a(bVar)) {
            this.f171726e1.setText(CoreModule.m29935P().m94652b().mo35102Uq(bVar.f19724d) + "  ");
            if (bVar.f19721a) {
                m190341z0();
                ((wmz) this.f171750p1).m156455e0().mo48954A0().m210931o2();
                CoreModule.f17545c.f19685t1.m31516u("countdown_item_love_buzz_key");
            }
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m103233f5(Picture picture) {
        boolean zM81303a = NullChecker.m81303a(picture);
        VDraweeView vDraweeView = this.f171735j;
        if (zM81303a) {
            xdl0.m208344M(vDraweeView, true);
            qib0.f154691G.m102363i0(this.f171735j, picture.url);
            this.f171746o.setBackgroundColor(Color.parseColor("#00000000"));
            this.f76692M1 = true;
        } else {
            xdl0.m208344M(vDraweeView, true);
            this.f171735j.setImageResource(0);
            this.f171735j.setBackgroundColor(Color.parseColor("#ffffff"));
            this.f76692M1 = false;
        }
        m190310j0().m162104y();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m103234g4(View view) {
        zvf0.m220396r("e_chat_open_push_close", OMSDialogPositon.p_chat_view);
        HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149465s0.get();
        hashSet.add(((wmz) this.f171750p1).f96911c);
        CoreModule.f17545c.f19639e0.f149465s0.put(hashSet);
        xdl0.m208344M(this.f171678H, false);
    }

    /* JADX INFO: renamed from: g5 */
    public boolean m103235g5(int i, boolean z) {
        boolean zM146774D = this.f171754r1.m146774D(m190314l0(), i, z);
        if (zM146774D && y19.m212166a() && this.f171754r1.m146784q()) {
            this.f171754r1.m146771A(new Runnable() { // from class: l.dnz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87118a.m103262t4();
                }
            });
        }
        return zM146774D;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m103236h4(SettingGroups settingGroups) {
        lsi0.m151595y("已开启消息通知");
        xdl0.m208344M(this.f171678H, false);
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m103237h5(final List<BreakIce> list) {
        xdl0.m208344M(this.f171676G0, true);
        mo103201Q1(false, new Runnable() { // from class: l.eoz
            @Override // java.lang.Runnable
            public final void run() {
                this.f92507a.m103268w4(list);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m103238i4(View view) {
        zvf0.m220396r("e_open_button_click", OMSDialogPositon.p_chat_view);
        if (NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed && !CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable()) {
            act().duringCreated(CoreModule.f17545c.f19639e0.m169409K9("openWithFriend", true, 0, 0)).subscribe(mkd0.m154956H(new e30() { // from class: l.xnz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193767a.m103236h4((SettingGroups) obj);
                }
            }, new e30() { // from class: l.ynz
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        } else {
            CoreModule.m29935P().m94658i().mo158305T();
            CoreModule.f17545c.f19639e0.m169409K9("openWithFriend", true, 0, 0);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public boolean m103239i5() {
        xdl0.m208344M(this.f171676G0, true);
        mo103201Q1(false, new Runnable() { // from class: l.tnz
            @Override // java.lang.Runnable
            public final void run() {
                this.f171302a.m103270x4();
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m103240j4(View view) {
        MessagesAct messagesActM190288a0 = act();
        MessagesAct messagesActM190288a1 = act();
        P p = this.f171750p1;
        messagesActM190288a0.startActivity(MessageProfileSettingAct.m48916Y1(messagesActM190288a1, ((wmz) p).m120794k4(((wmz) p).mo120828r3()), ((wmz) this.f171750p1).mo120828r3()));
    }

    /* JADX INFO: renamed from: j5 */
    public void m103241j5(final String str, String str2) {
        xdl0.m208344M(this.f171748p, false);
        xdl0.m208344M(this.f171759u, false);
        xdl0.m208344M(this.f171767y, false);
        xdl0.m208344M(this.f171665C, false);
        xdl0.m208344M(this.f171678H, false);
        xdl0.m208344M(this.f171689M, true);
        this.f171691N.setText(str2);
        xdl0.m208329E0(this.f171689M, new View.OnClickListener() { // from class: l.anz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70776a.m103272y4(str, view);
            }
        });
        zvf0.m220368A("e_chat_safety_notice", OMSDialogPositon.p_chat_view, vwb.m200311Y("user_risk_type", str), vwb.m200311Y("risk_userid", ((wmz) this.f171750p1).mo120828r3()));
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: k0 */
    public j760<Integer, Integer> mo103242k0() {
        tzz tzzVar = this.f76696Q1;
        if (tzzVar == null || tzzVar.m191246u() == null) {
            return null;
        }
        VDraweeView vDraweeViewM191246u = this.f76696Q1.m191246u();
        return vwb.m200311Y(Integer.valueOf(vDraweeViewM191246u.getWidth()), Integer.valueOf(vDraweeViewM191246u.getHeight()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m103243k4() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: k5 */
    public void m103244k5(Media media) {
        Conversation conversationM33216zp;
        if (y19.m212168c()) {
            String str = ((wmz) this.f171750p1).f96911c;
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.ShowPicLikeGuideTime;
            if (mqi0.m155928C(conversationCounterTypeSp.getLong(str), mqi0.m155944o()) || (conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str)) == null || !TEnum.equals(conversationM33216zp.status, "default") || !TextUtils.equals(conversationM33216zp.convType, "default") || TextUtils.equals(conversationM33216zp.otherStatus, "invalid")) {
                return;
            }
            if (y19.m212169d()) {
                ProfileLikeLifePhotoAct.m44443w2(this.f171747o1, str, media.url, vwb.m200296J(media.tags) ? "" : media.tags.get(0));
            } else {
                m190278V1();
                this.f171754r1.m146772B(13);
                MessagePicLikeGuideLayout messagePicLikeGuideLayout = (MessagePicLikeGuideLayout) o7r.m163037a(this.f171747o1).inflate(l6c0.f126591w5, (ViewGroup) this.f171676G0, false);
                this.f171676G0.addView(messagePicLikeGuideLayout);
                messagePicLikeGuideLayout.m48915a0(this.f171747o1, media, new Runnable() { // from class: l.nnz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f139792a.m103174B4();
                    }
                });
                m190301f2(13, new Runnable() { // from class: l.onz
                    @Override // java.lang.Runnable
                    public final void run() {
                        bpz.m103106D2();
                    }
                });
                xdl0.m208358V(messagePicLikeGuideLayout, t100.f167264m - this.f171676G0.getPaddingLeft());
            }
            conversationCounterTypeSp.setLong(str, mqi0.m155944o());
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m103245l4(CoreGiftInfo coreGiftInfo, d30 d30Var) {
        this.f171739k1.m45455w(coreGiftInfo, d30Var);
    }

    /* JADX INFO: renamed from: l5 */
    public boolean m103246l5(final List<Prologue> list, final String str) {
        if (vwb.m200296J(list)) {
            return false;
        }
        xdl0.m208344M(this.f171676G0, true);
        mo103201Q1(false, new Runnable() { // from class: l.poz
            @Override // java.lang.Runnable
            public final void run() {
                this.f150574a.m103176C4(list, str);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m103247m4(Message message, View view) {
        zvf0.m220396r("e_chat_gift_view_thanks", act().pageId());
        m103263t5();
        ((wmz) this.f171750p1).m120718U6(message);
    }

    /* JADX INFO: renamed from: m5 */
    public void m103248m5(final e30<dd80> e30Var) {
        final dd80 dd80VarM110960O = this.f171747o1.newDialog().m110964S(c3c0.f78486C0).m110996y0("功能全新升级").m110991t0("本次聊天需要消耗一次消耗次数").m110961P(false).m110958M(false).m110973b0("同意并聊天").m110968W("不同意").m110960O();
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.gnz
            @Override // java.lang.Runnable
            public final void run() {
                this.f103637a.m103178D4(dd80VarM110960O);
            }
        });
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.hnz
            @Override // java.lang.Runnable
            public final void run() {
                e30Var.call(dd80VarM110960O);
            }
        });
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m103249n4(CoreGiftInfo coreGiftInfo, d30 d30Var, boolean z, String str, boolean z2, final Message message) {
        this.f171739k1.m45455w(coreGiftInfo, d30Var);
        this.f171739k1.m45440C(z);
        if (z) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            CoreGiftLayer coreGiftLayer = this.f171739k1;
            if (zIsEmpty) {
                coreGiftLayer.m45446n();
            } else {
                coreGiftLayer.m45444G(str);
            }
            this.f171739k1.m45441D(!z2);
            if (z2) {
                return;
            }
            zvf0.m220402x("e_chat_gift_view_thanks", act().pageId());
            this.f171739k1.setThxTipClickListener(new View.OnClickListener() { // from class: l.coz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81891a.m103247m4(message, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m103250n5() {
        if (this.f171754r1.m146780m() != 10 || this.f171676G0.getChildCount() <= 0) {
            if (this.f171676G0.getChildCount() > 0) {
                return;
            }
            m103235g5(10, false);
        } else if (NullChecker.m81303a(this.f171754r1.f124073d) && NullChecker.m81303a(this.f171754r1.f124073d.getAdapter())) {
            this.f171754r1.m146777G();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m103251o4(tu4 tu4Var, Integer num) {
        if (NullChecker.m81303a(this.f76703X1)) {
            this.f76703X1.setTranslationY(num.intValue() * tu4Var.f172128m);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m103252o5() {
        MessageBar messageBarM128210t0;
        int iIntValue;
        Conversation conversationM120788j3 = ((wmz) this.f171750p1).m120788j3();
        if (conversationM120788j3 == null || TEnum.equals(conversationM120788j3.status, "dismissed") || this.f171747o1.m48957C2() || (messageBarM128210t0 = ((wmz) this.f171750p1).m156455e0().mo48954A0().m156457g0().m128210t0()) == null) {
            return;
        }
        MessageBarActionItemType messageBarActionItemType = MessageBarActionItemType.MORE;
        if (!messageBarM128210t0.mo48832c(messageBarActionItemType) || !xoy.m210451f(conversationM120788j3.otherUser, false) || CoreModule.f17545c.f19642f0.f19842A1.get().booleanValue() || (iIntValue = CoreModule.f17545c.f19642f0.f19980u1.get().intValue()) >= 3) {
            return;
        }
        if (mqi0.m155944o() - CoreModule.f17545c.f19642f0.f19977t1.get().longValue() < 86400000 || C4348d.m20896l().m20912x("switchPicBubbleKey") || wc80.m202636e().m202643k()) {
            return;
        }
        final int i = iIntValue + 1;
        C4348d.m20896l().m20909u(new C4345a(this.f171747o1).m20849D("照片新玩法限时开启！").m20870k(e16.m114375c(this.f171747o1, ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67170x)).m20852G(a1c0.f67163q).m20878t(true).m20855J(13.0f).m20881w(t100.f167259h).m20864e(false).m20859N(new C4345a.d() { // from class: l.lnz
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
            /* JADX INFO: renamed from: a */
            public final void mo20887a(View view) {
                this.f129044a.m103180E4(i, view);
            }
        }).m20863d(new C4345a.b() { // from class: l.mnz
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
            /* JADX INFO: renamed from: a */
            public final void mo20885a(String str) {
                bpz.m103161u2(str);
            }
        }).m20850E(false).m20882x(t100.f167258g).m20881w(t100.f167262k).m20861b(8000L).m20875q(jtk.f119617D | jtk.f119618E), messageBarM128210t0.mo48831b(messageBarActionItemType), "switchPicBubbleKey");
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m103253p4(User user) {
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.f154691G.m102354Y0(this.f171670E0, c3c0.f78755h);
        } else {
            qib0.f154691G.m102341Q0(this.f171670E0, user.m60124fp().profileSize(t100.f167268q));
        }
    }

    /* JADX INFO: renamed from: p5 */
    public void m103254p5(User user) {
        this.f76693N1 = true;
        C4345a c4345a = new C4345a(act());
        c4345a.m20849D(user.isFemale() ? act().string(R$string.f21131y6) : act().string(R$string.f21139z6)).m20875q(jtk.f119614A | jtk.f119618E).m20847B(t100.m186890d(2.0f)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20861b(3000L).m20864e(true).m20869j(new C4345a.c() { // from class: l.woz
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                this.f187476a.m103181F4(str);
            }
        }).m20882x(t100.m186890d(8.0f));
        C4348d.m20896l().m20908t(c4345a, ((wmz) this.f171750p1).m156455e0().mo48959E().m194278o0());
        zvf0.m220368A("e_bubble_chat_page_id_verification_tips", OMSDialogPositon.p_chat_view, vwb.m200311Y("tooltips_type", "bubble"), vwb.m200311Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.m200311Y("tooltips_trigger_page", "chat_page"), vwb.m200311Y("tooltips_trigger_reason", "tips"), vwb.m200311Y("tooltips_trigger_module", "null"));
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m103255q4(List list, View view) {
        String strM152328k;
        if (vwb.m200296J(list)) {
            strM152328k = lz4.m152319h().m152328k();
            zvf0.m220396r("e_newmatch_next_batch", act().pageId());
            lz4.m152319h().m152333p();
        } else {
            String str = (String) list.get(0);
            zvf0.m220399u("e_newmatch_next", act().pageId(), vwb.m200311Y("other_uid", ((wmz) this.f171750p1).mo120828r3()), vwb.m200311Y("newmatch_next_from", ((wmz) this.f171750p1).m120859y3()), vwb.m200311Y("newmatch_next_number", Integer.valueOf(list.size())));
            strM152328k = str;
        }
        lz4.m152319h().m152334q(strM152328k);
        Intent intentM48944k2 = MessagesAct.m48944k2(act(), strM152328k, false, false, 26);
        MessagesAct.m48952s2(intentM48944k2, "newmatch_next");
        act().startActivity(intentM48944k2);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: q5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m103195N4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        m103185I3();
        final MessageWarmingUpHelper.TempDownEnum tempDownEnumM49187q = MessageWarmingUpHelper.m49187q(warmingUpLevel, ((wmz) this.f171750p1).f96910b);
        if (tempDownEnumM49187q == null) {
            return;
        }
        o6j0.m162864h("e_heat_reduce_remind", ((wmz) this.f171750p1).pageId(), o6j0.C18854a.m162878h("heat_reduce_function_name", tempDownEnumM49187q.key));
        this.f171676G0.removeAllViews();
        if (tempDownEnumM49187q == MessageWarmingUpHelper.TempDownEnum.message) {
            kye.C18115a c18115aM103120M3 = m103120M3(this.f171747o1, tempDownEnumM49187q.imageRes);
            if (NullChecker.m81303a(c18115aM103120M3)) {
                this.f171725e.setImageResource(c18115aM103120M3.f125289d);
            }
        } else if (tempDownEnumM49187q == MessageWarmingUpHelper.TempDownEnum.photo) {
            this.f171725e.setImageResource(c3c0.f78667W6);
        } else if (tempDownEnumM49187q == MessageWarmingUpHelper.TempDownEnum.chuEmo || tempDownEnumM49187q == MessageWarmingUpHelper.TempDownEnum.friendEmo) {
            Sticker stickerM34926r3 = CoreModule.f17545c.f19624Z.m34926r3(tempDownEnumM49187q.imageRes);
            if (NullChecker.m81303a(stickerM34926r3) && !vwb.m200296J(stickerM34926r3.pictures)) {
                qib0.f154691G.m102331L0(this.f171725e, stickerM34926r3.pictures.get(0).url);
            }
        }
        this.f171721c.setText(String.format("温度下降了%s°C", MessageWarmingUpHelper.m49172b(((wmz) this.f171750p1).m120803m3() - ((wmz) this.f171750p1).m120793k3())) + SignParameters.NEW_LINE + tempDownEnumM49187q.title);
        this.f171727f.setText(tempDownEnumM49187q.content);
        xdl0.m208329E0(this.f171723d, new View.OnClickListener() { // from class: l.loz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129150a.m103182G4(tempDownEnumM49187q, view);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f171717a, "alpha", 0.0f, 1.0f));
        arrayList.add(bt0.m103744q(this.f171717a, "translationY", t100.m186890d(7.0f), 0.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C15938k());
        animatorSet.setDuration(483L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        e51.m114743H(this.f171747o1, new Runnable() { // from class: l.moz
            @Override // java.lang.Runnable
            public final void run() {
                this.f134964a.m103184H4();
            }
        }, 750L);
        e51.m114743H(this.f171747o1, new Runnable() { // from class: l.noz
            @Override // java.lang.Runnable
            public final void run() {
                this.f139898a.m103186I4();
            }
        }, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        SVGALoader.with(this.f171747o1).from(MessageWarmingUpHelper.m49194x()).autoPlay(true).repeatCount(5).into(this.f171731h);
    }

    @Override // p149l.tqz
    /* JADX INFO: renamed from: r */
    public void mo103257r() {
        super.mo103257r();
        if (CoreModule.m29935P().m94658i().mo158317V0()) {
            m103207T3();
        }
        m103199P3();
        m103209U3();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m103258r4() {
        xdl0.m208344M(this.f171749p0, true);
    }

    /* JADX INFO: renamed from: r5 */
    public void m103259r5() {
        if (!CoreModule.m29935P().m94658i().mo158216D() || CoreModule.f17545c.f19631b1.f121927S.get().booleanValue()) {
            return;
        }
        e51.m114745J(this.f76711f2);
        e51.m114743H(act(), this.f76711f2, 500L);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m103260s4() {
        ((wmz) this.f171750p1).m204334Dg();
    }

    /* JADX INFO: renamed from: s5 */
    public final void m103261s5() {
        final EmojiAnimData emojiAnimDataM171839b = pxe.m171835c().m171839b();
        final double dDoubleValue = emojiAnimDataM171839b.emojiAnimCreatedTime.containsKey(((wmz) this.f171750p1).m120783i3()) ? emojiAnimDataM171839b.emojiAnimCreatedTime.get(((wmz) this.f171750p1).m120783i3()).doubleValue() + 1.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        ((wmz) this.f171750p1).act().duringCreated(C22306c.just(roj0.f160388a).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.vnz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182321a.m103188J4(dDoubleValue, (roj0) obj);
            }
        }).observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.wnz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187365a.m103190K4(emojiAnimDataM171839b, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m103262t4() {
        this.f171754r1.m146791y(true, new Runnable() { // from class: l.unz
            @Override // java.lang.Runnable
            public final void run() {
                this.f177475a.m103260s4();
            }
        });
        zvf0.m220399u("e_close_click", this.f171747o1.pageId(), j760.m140076a("shortcut_type", "emoji_picture"));
    }

    /* JADX INFO: renamed from: t5 */
    public void m103263t5() {
        if (m103219Z3()) {
            this.f171739k1.m45443F();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m103264u4() {
        ((wmz) this.f171750p1).m204334Dg();
    }

    /* JADX INFO: renamed from: u5 */
    public void m103265u5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m49192v("降温动画");
        int i = warmingUpLevel.value;
        if (i <= MessageWarmingUpHelper.WarmingUpLevel.not.value || i >= MessageWarmingUpHelper.WarmingUpLevel.five.value) {
            ((wmz) this.f171750p1).f187198P0 = false;
            return;
        }
        int i2 = MessageWarmingUpHelper.WarmingUpLevel.first.value;
        MessagesAct messagesAct = this.f171747o1;
        if (i > i2) {
            e51.m114741F(messagesAct, new Runnable() { // from class: l.foz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98648a.m103192L4(warmingUpLevel);
                }
            });
        } else {
            e51.m114741F(messagesAct, new Runnable() { // from class: l.goz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103747a.m103193M4(warmingUpLevel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m103266v4() {
        mo103201Q1(true, new Runnable() { // from class: l.boz
            @Override // java.lang.Runnable
            public final void run() {
                this.f76583a.m103264u4();
            }
        });
    }

    /* JADX INFO: renamed from: v5 */
    public final void m103267v5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m49192v("tempDownAnimInner");
        this.f76702W1 = this.f171747o1.duringCreated(C22306c.interval(1L, TimeUnit.MILLISECONDS)).subscribe(mkd0.m154956H(new e30() { // from class: l.toz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171422a.m103198O4(warmingUpLevel, (Long) obj);
            }
        }, new e30() { // from class: l.uoz
            @Override // p149l.e30
            public final void call(Object obj) {
                bpz.m103134a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m103268w4(List list) {
        this.f171754r1.m146772B(12);
        ItemBreakIceMessage itemBreakIceMessage = (ItemBreakIceMessage) o7r.m163037a(this.f171747o1).inflate(l6c0.f126370Q2, (ViewGroup) this.f171676G0, false);
        this.f171676G0.addView(itemBreakIceMessage);
        itemBreakIceMessage.m48048h(this.f171747o1, CoreModule.f17545c.f19642f0.m33129te(((wmz) this.f171750p1).m120783i3(), list), new Runnable() { // from class: l.jnz
            @Override // java.lang.Runnable
            public final void run() {
                this.f118907a.m103266v4();
            }
        });
        m190301f2(12, new Runnable() { // from class: l.knz
            @Override // java.lang.Runnable
            public final void run() {
                bpz.m103122O2();
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public void m103269w5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        MessageWarmingUpHelper.m49192v("升温动画");
        if (warmingUpLevel != MessageWarmingUpHelper.WarmingUpLevel.not) {
            e51.m114741F(this.f171747o1, new Runnable() { // from class: l.hoz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108875a.m103200P4(warmingUpLevel2, warmingUpLevel);
                }
            });
        } else {
            m103271x5(warmingUpLevel, warmingUpLevel2);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m103270x4() {
        this.f171754r1.m146772B(11);
        MessageExchangeQuestionAnswerLayout messageExchangeQuestionAnswerLayout = (MessageExchangeQuestionAnswerLayout) o7r.m163037a(this.f171747o1).inflate(l6c0.f126424Y4, (ViewGroup) this.f171676G0, false);
        this.f171676G0.addView(messageExchangeQuestionAnswerLayout);
        messageExchangeQuestionAnswerLayout.m48872a0(this.f171747o1, this);
        m190301f2(11, new Runnable() { // from class: l.snz
            @Override // java.lang.Runnable
            public final void run() {
                bpz.m103141h3();
            }
        });
        xdl0.m208358V(messageExchangeQuestionAnswerLayout, t100.f167264m - this.f171676G0.getPaddingLeft());
    }

    /* JADX INFO: renamed from: x5 */
    public final void m103271x5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        this.f76701V1 = this.f171747o1.duringCreated(C22306c.interval(1L, TimeUnit.MILLISECONDS)).subscribe(mkd0.m154956H(new e30() { // from class: l.joz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119027a.m103210U4(warmingUpLevel, warmingUpLevel2, (Long) obj);
            }
        }, new e30() { // from class: l.koz
            @Override // p149l.e30
            public final void call(Object obj) {
                bpz.m103163v2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m103272y4(String str, View view) {
        ura.m195053e().m195057d().mo33913r7(act());
        zvf0.m220399u("e_chat_safety_notice", OMSDialogPositon.p_chat_view, vwb.m200311Y("user_risk_type", str));
    }

    /* JADX INFO: renamed from: y5 */
    public void m103273y5(int i) {
        VoiceCallControlView voiceCallControlView = this.f76695P1;
        if (voiceCallControlView == null) {
            return;
        }
        voiceCallControlView.m50087x(i);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m103274z4() {
        ((wmz) this.f171750p1).m204334Dg();
    }

    /* JADX INFO: renamed from: z5 */
    public void m103275z5(int i) {
        this.f171737k.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, -1}));
        this.f171747o1.setStatusBarColor(i);
        this.f171730g1.setBackgroundColor(this.f171747o1.getResources().getColor(a1c0.f67143Y));
    }

    /* JADX INFO: renamed from: l.bpz$b */
    public class C15929b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public boolean f76716a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tu4 f76717b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f76718c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ c4g0[] f76719d;

        public C15929b(tu4 tu4Var, ViewGroup viewGroup, c4g0[] c4g0VarArr) {
            this.f76717b = tu4Var;
            this.f76718c = viewGroup;
            this.f76719d = c4g0VarArr;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bpz.this.f76700U1 = false;
            bpz.this.f76704Y1.m132487l(roj0.f160388a);
            xdl0.m208344M(bpz.this.f76703X1, false);
            this.f76718c.removeView(bpz.this.f76703X1);
            mkd0.m154992z(this.f76719d[0]);
            bpz.this.f76703X1 = null;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            int i2;
            super.onStep(i);
            if (!this.f76716a && (i2 = this.f76717b.f172124i) > 0 && i >= i2) {
                this.f76716a = true;
                ((Vibrator) CoreModule.f17544b.getSystemService("vibrator")).vibrate(this.f76717b.f172125j);
            }
            if (vwb.m200296J(this.f76717b.f172126k)) {
                return;
            }
            for (int i3 = 0; i3 < this.f76717b.f172126k.size(); i3++) {
                j760<Integer, Boolean> j760Var = this.f76717b.f172126k.get(i3);
                if (i > j760Var.f116564a.intValue() && !j760Var.f116565b.booleanValue()) {
                    this.f76717b.f172126k.set(i3, j760.m140076a(j760Var.f116564a, Boolean.TRUE));
                    bt0.m103739l(this.f76718c, bt0.f77162i, 0L, 140L, null, 1.0f, 0.9f, 1.0f).start();
                    return;
                }
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
        }
    }

    /* JADX INFO: renamed from: l.bpz$c */
    public class C15930c implements RequestCallback {
        public C15930c() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            bpz.this.f76700U1 = false;
            bpz.this.f76704Y1.m132487l(roj0.f160388a);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
    }
}
