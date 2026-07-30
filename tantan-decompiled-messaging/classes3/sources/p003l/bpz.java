package p003l;

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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemBreakIceMessage;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageLeft;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageChatPrologueLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageExchangeQuestionAnswerLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagePicLikeGuideLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageProfileSettingAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreGiftInfo;
import com.p1.mobile.putong.core.data.EmojiAnimData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Prologue;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.ui.breaking.ProfileLikeLifePhotoAct;
import com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer;
import com.p1.mobile.putong.core.ui.messages.voicecall.VoiceCallControlView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
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
import l.a1c0;
import l.bt0;
import l.c3c0;
import l.dd80;
import l.e16;
import l.e51;
import l.hmb;
import l.j760;
import l.jf50;
import l.jtk;
import l.l6c0;
import l.lsi0;
import l.lz4;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.o7r;
import l.qib0;
import l.roj0;
import l.szb0;
import l.t100;
import l.ura;
import l.vwb;
import l.wc80;
import l.wmz;
import l.xdl0;
import l.y19;
import l.y4c0;
import l.yij0;
import l.zvf0;
import l.zxz;
import org.eclipse.jetty.servlet.ServletHandler;
import org.spongycastle.i18n.TextBundle;
import p014rx.C1099c;
import p014rx.schedulers.Schedulers;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bpz extends tqz<wmz> implements c0.c {

    /* JADX INFO: renamed from: M1 */
    public boolean f2427M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f2428N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f2429O1;

    /* JADX INFO: renamed from: P1 */
    public VoiceCallControlView f2430P1;

    /* JADX INFO: renamed from: Q1 */
    public tzz f2431Q1;

    /* JADX INFO: renamed from: R1 */
    public roy f2432R1;

    /* JADX INFO: renamed from: S1 */
    public final String f2433S1;

    /* JADX INFO: renamed from: T1 */
    public boolean f2434T1;

    /* JADX INFO: renamed from: U1 */
    public boolean f2435U1;

    /* JADX INFO: renamed from: V1 */
    public c4g0 f2436V1;

    /* JADX INFO: renamed from: W1 */
    public c4g0 f2437W1;

    /* JADX INFO: renamed from: X1 */
    public SVGAnimationView f2438X1;

    /* JADX INFO: renamed from: Y1 */
    public C1186b<roj0> f2439Y1;

    /* JADX INFO: renamed from: Z1 */
    public boolean f2440Z1;

    /* JADX INFO: renamed from: a2 */
    public boolean f2441a2;

    /* JADX INFO: renamed from: b2 */
    public int[] f2442b2;

    /* JADX INFO: renamed from: c2 */
    public RectF f2443c2;

    /* JADX INFO: renamed from: d2 */
    public RectF f2444d2;

    /* JADX INFO: renamed from: e2 */
    public RectF f2445e2;

    /* JADX INFO: renamed from: f2 */
    public Runnable f2446f2;

    /* JADX INFO: renamed from: g2 */
    public List<d30> f2447g2;

    /* JADX INFO: renamed from: h2 */
    public final Property<View, Integer> f2448h2;

    /* JADX INFO: renamed from: i2 */
    public boolean f2449i2;

    /* JADX INFO: renamed from: l.bpz$a */
    public class C0173a extends Property<View, Integer> {
        public C0173a(Class cls, String str) {
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
            bpz.this.m3156z5(num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.bpz$d */
    public class C0176d extends jf50 {
        public C0176d() {
        }

        /* JADX INFO: renamed from: b */
        public void m3159b(int i, int i2) {
            super.b(i, i2);
            if (i2 != 0) {
                bpz.this.m7922e0();
            }
        }
    }

    /* JADX INFO: renamed from: l.bpz$e */
    public class C0177e implements ud50 {

        /* JADX INFO: renamed from: a */
        public float f2458a = 0.0f;

        /* JADX INFO: renamed from: b */
        public boolean f2459b = false;

        public C0177e() {
        }

        @Override // p003l.ud50
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f2458a = motionEvent.getY();
                this.f2459b = false;
            } else if (action == 1) {
                this.f2459b = false;
            } else if (action == 2) {
                float y = motionEvent.getY();
                if (!this.f2459b && this.f2458a - y > 0.0f) {
                    bpz.this.m7922e0();
                    this.f2459b = true;
                }
                this.f2458a = y;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: l.bpz$f */
    public class C0178f extends AnimListener {
        public C0178f() {
        }

        public void onFinished() {
            super.onStart();
            bpz.this.f2440Z1 = false;
            xdl0.M(bpz.this.f7634S0, false);
            bpz.this.f2441a2 = true;
        }

        public void onStart() {
            super.onStart();
            xdl0.M(bpz.this.f7634S0, true);
        }
    }

    /* JADX INFO: renamed from: l.bpz$g */
    public class RunnableC0179g implements Runnable {
        public RunnableC0179g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int lastVisiblePositionHook = bpz.this.f7677n1.getLastVisiblePositionHook() - bpz.this.f7677n1.getFirstVisiblePositionHook(); lastVisiblePositionHook >= 0; lastVisiblePositionHook--) {
                View viewC = bpz.this.f7677n1.C(lastVisiblePositionHook);
                if (bpz.this.f2431Q1 != null && viewC == bpz.this.f2431Q1.mo4919g()) {
                    bpz bpzVar = bpz.this;
                    if (bpzVar.m3097Y3(bpzVar.f2431Q1.m8079u())) {
                        zxz.h().m(bpz.this.f7682p1.r3(), "headView");
                        zxz.h().p(bpz.this.f7682p1.r3(), "headView", bpz.this.f2431Q1.m8081w(), bpz.this.f2431Q1.m8079u());
                        return;
                    }
                } else if (viewC instanceof ItemMessageLeft) {
                    ItemMessageLeft itemMessageLeft = (ItemMessageLeft) viewC;
                    if (bpz.this.m3097Y3(itemMessageLeft.f1068M)) {
                        zxz.h().m(bpz.this.f7682p1.r3(), itemMessageLeft.getMessageId());
                        itemMessageLeft.m1504W0();
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.bpz$h */
    public class C0180h implements VoiceCallControlView.b {
        public C0180h() {
        }

        /* JADX INFO: renamed from: a */
        public void m3160a(boolean z) {
            if (z) {
                return;
            }
            View messageBarRoot = bpz.this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0().getMessageBarRoot();
            ViewGroup.LayoutParams layoutParams = messageBarRoot.getLayoutParams();
            layoutParams.height = -2;
            messageBarRoot.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: b */
        public void m3161b(float f, int i, int i2, boolean z) {
            View messageBarRoot = bpz.this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0().getMessageBarRoot();
            int height = messageBarRoot.getHeight();
            if (height > 0) {
                if (bpz.this.f7682p1.m6497e0().mo2063c0().m8905E0() || z) {
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
    public class C0181i extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f2464a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f2465b;

        public C0181i(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
            this.f2464a = warmingUpLevel;
            this.f2465b = warmingUpLevel2;
        }

        public void onStart() {
            super.onStart();
            bpz.this.m3152x5(this.f2464a, this.f2465b);
        }
    }

    /* JADX INFO: renamed from: l.bpz$j */
    public class C0182j extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageWarmingUpHelper.WarmingUpLevel f2467a;

        public C0182j(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
            this.f2467a = warmingUpLevel;
        }

        public void onStart() {
            super.onStart();
            bpz.this.m3148v5(this.f2467a);
        }
    }

    /* JADX INFO: renamed from: l.bpz$k */
    public class C0183k extends bt0.j {
        public C0183k() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bpz.this.f7649a.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: l.bpz$l */
    public class C0184l extends bt0.j {
        public C0184l() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            bpz.this.m7906X1();
        }
    }

    public bpz(MessagesAct messagesAct) {
        super(messagesAct);
        this.f2427M1 = false;
        this.f2428N1 = false;
        this.f2429O1 = false;
        this.f2433S1 = "giftTipKey";
        this.f2434T1 = false;
        this.f2435U1 = false;
        this.f2439Y1 = C1186b.m9978b();
        this.f2440Z1 = false;
        this.f2441a2 = false;
        this.f2442b2 = new int[2];
        this.f2443c2 = new RectF();
        this.f2444d2 = new RectF();
        this.f2445e2 = new RectF();
        this.f2446f2 = new RunnableC0179g();
        this.f2447g2 = new ArrayList();
        this.f2448h2 = new C0173a(Integer.TYPE, "backgroundColor");
        this.f2449i2 = false;
    }

    /* JADX INFO: renamed from: D2 */
    public static /* synthetic */ void m2986D2() {
    }

    /* JADX INFO: renamed from: M3 */
    public static kye.C0395a m3000M3(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList<kye.C0395a> arrayList = kye.f5127d;
            if (!vwb.J(arrayList)) {
                for (kye.C0395a c0395a : arrayList) {
                    if (str.contains(context.getResources().getString(c0395a.f5135b))) {
                        return c0395a;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ void m3002O2() {
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m3014a3(Throwable th) {
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m3021h3() {
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m3041u2(String str) {
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ void m3043v2(Throwable th) {
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m3048y2(Throwable th) {
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m3050z2() {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m3052A4() {
        e51.H(this.f7679o1, new Runnable() { // from class: l.doz
            @Override // java.lang.Runnable
            public final void run() {
                this.f3048a.m3155z4();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: A5 */
    public void m3053A5(boolean z) {
        this.f7670k0.setVisible(z);
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m3054B4() {
        mo3081Q1(true, new Runnable() { // from class: l.znz
            @Override // java.lang.Runnable
            public final void run() {
                this.f9387a.m3052A4();
            }
        });
    }

    /* JADX INFO: renamed from: B5 */
    public void m3055B5() {
        MessageWarmingUpHelper.m2311v("动画结束");
        this.f7682p1.P0 = false;
        mkd0.z(this.f2436V1);
        mkd0.z(this.f2437W1);
        if (NullChecker.a(this.f7682p1.R0)) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.ioz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4448a.m3092V4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m3056C4(List list, String str) {
        this.f7686r1.m5738B(14);
        MessageChatPrologueLayout messageChatPrologueLayout = (MessageChatPrologueLayout) o7r.a(this.f7679o1).inflate(l6c0.X4, (ViewGroup) this.f7608G0, false);
        this.f7608G0.addView(messageChatPrologueLayout);
        messageChatPrologueLayout.m1945d0(this.f7679o1, list, this, str);
        m7926f2(14, new Runnable() { // from class: l.rnz
            @Override // java.lang.Runnable
            public final void run() {
                bpz.m3050z2();
            }
        });
        xdl0.V(messageChatPrologueLayout, t100.m - this.f7608G0.getPaddingLeft());
        zvf0.A("e_send_opening_guidance", this.f7679o1.pageId(), new j760[]{vwb.Y("opening_guidance_showtime", str), vwb.Y("opening_content", ((Prologue) list.get(0)).value)});
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: D0 */
    public void mo3057D0() {
        super.mo3057D0();
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m3058D4(dd80 dd80Var) {
        dd80Var.dismiss();
        this.f7679o1.finish();
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: E1 */
    public boolean mo3059E1(Menu menu) {
        super.mo3059E1(menu);
        if (CoreModule.P().i().G1()) {
            MenuItem menuItemAdd = menu.add(4, y4c0.k2, 2, "");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(l6c0.c1);
            xdl0.E0(menuItemAdd.getActionView().findViewById(y4c0.k2), new View.OnClickListener() { // from class: l.xmz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8805a.m3120j4(view);
                }
            });
            return true;
        }
        if (this.f7682p1.m4226d4()) {
            CoreModule.P().i().m4(menu, this.f7682p1.r3(), act(), new d30() { // from class: l.inz
                @Override // p003l.d30
                public final void call() {
                    this.f4446a.m3123k4();
                }
            });
            return true;
        }
        wmz wmzVar = this.f7682p1;
        if (wmzVar.m4261k4(wmzVar.r3())) {
            CoreModule.P().i().r1(menu, this.f7682p1.r3(), act(), false, false, (String) null, (d30) null, (d30) null, (String) null);
            return true;
        }
        CoreModule.P().i().L2(menu, this.f7682p1.r3(), act(), true, true, (String) null, (d30) null, (d30) null, true, CoreModule.P().i().D(), "chat_page");
        return true;
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m3060E4(int i, View view) {
        CoreModule.c.f0.u1.put(Integer.valueOf(i));
        CoreModule.c.f0.t1.put(Long.valueOf(mqi0.o()));
        zvf0.x("e_switchphoto_pop", this.f7682p1.pageId());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m3061F4(String str) {
        this.f2428N1 = false;
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
    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m3062G4(MessageWarmingUpHelper.TempDownEnum tempDownEnum, View view) {
        if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.message) {
            this.f7682p1.m4173S6(tempDownEnum.imageRes + tempDownEnum.content);
        } else if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.photo) {
            PutongAct putongAct = this.f7679o1;
            putongAct.startActivityForResult(MediaPickerAct.X1(putongAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f7679o1.getString(R.string.h)).withFromType(4).build()), 786);
            this.f7679o1.overridePendingTransition(szb0.e, szb0.a);
        } else if (tempDownEnum == MessageWarmingUpHelper.TempDownEnum.chuEmo || tempDownEnum == MessageWarmingUpHelper.TempDownEnum.friendEmo) {
            Sticker stickerR3 = CoreModule.c.Z.r3(tempDownEnum.imageRes);
            if (NullChecker.a(stickerR3) && !TextUtils.isEmpty(((DbObject) stickerR3).id)) {
                this.f7682p1.m4168R6(stickerR3, false);
            }
        }
        o6j0.c("e_heat_reduce_remind", this.f7682p1.pageId(), new o6j0.a[]{o6j0.a.h("heat_reduce_function_name", tempDownEnum.key)});
        m7906X1();
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: H1 */
    public void mo3063H1(Message message) {
        if (!TEnum.equals(message.messageType, TextBundle.TEXT_ENTRY) || ((DbObject) message).id.startsWith("fake_private_question_id_") || ((DbObject) message).id.startsWith("fake_id_") || !this.f2441a2) {
            return;
        }
        EmojiAnimData emojiAnimDataM6952b = pxe.m6948c().m6952b();
        if (!emojiAnimDataM6952b.emojiAnimCreatedTime.containsKey(this.f7682p1.m4250i3()) || message.createdTime > ((Double) emojiAnimDataM6952b.emojiAnimCreatedTime.get(this.f7682p1.m4250i3())).doubleValue()) {
            String strM6950f = pxe.m6950f(message.value);
            if (TextUtils.isEmpty(strM6950f)) {
                return;
            }
            Map<String, Integer> map = kye.f5131h;
            if (map.containsKey(strM6950f)) {
                m3098Y4(map.get(strM6950f).intValue(), message);
            }
        }
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m3064H4() {
        SVGALoader.with(this.f7679o1).from("https://auto.tancdn.com/v1/raw/3590924d-0e8a-4b36-9c6f-25e1d8559e5810.svga").autoPlay(true).repeatCount(1).into(this.f7661g);
    }

    /* JADX INFO: renamed from: I3 */
    public final void m3065I3() {
        View viewInflate = o7r.a(this.f7679o1).inflate(l6c0.v4, (ViewGroup) this.f7678o, false);
        m7933i0(viewInflate);
        int childCount = this.f7678o.getChildCount();
        for (int i = 0; i < this.f7678o.getChildCount(); i++) {
            if (this.f7678o.getChildAt(i) == this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0()) {
                childCount = i;
                break;
            }
        }
        this.f7678o.addView(viewInflate, childCount);
        this.f7649a.setVisibility(8);
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m3066I4() {
        LinearLayout linearLayout = this.f7649a;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.0f).setDuration(300L);
            duration.addListener(new C0184l());
            duration.start();
        }
    }

    /* JADX INFO: renamed from: J3 */
    public final void m3067J3(View view, RectF rectF) {
        view.getLocationOnScreen(this.f2442b2);
        int[] iArr = this.f2442b2;
        float f = iArr[0];
        rectF.left = f;
        rectF.top = iArr[1];
        rectF.right = f + view.getWidth();
        rectF.bottom = rectF.top + view.getHeight();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ j760 m3068J4(double d, roj0 roj0Var) {
        List<Message> listF = CoreModule.k.c.F(this.f7682p1.m4250i3(), d);
        if (vwb.J(listF)) {
            return j760.a("", (Object) null);
        }
        for (Message message : listF) {
            if (TEnum.equals(message.messageType, TextBundle.TEXT_ENTRY)) {
                String strM6950f = pxe.m6950f(message.value);
                if (!TextUtils.isEmpty(strM6950f) && kye.f5131h.containsKey(strM6950f)) {
                    return j760.a(strM6950f, message);
                }
            }
        }
        return j760.a("", (Message) listF.get(0));
    }

    /* JADX INFO: renamed from: K3 */
    public void m3069K3() {
        Iterator<d30> it = this.f2447g2.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f2447g2.clear();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m3070K4(EmojiAnimData emojiAnimData, j760 j760Var) {
        if (!TextUtils.isEmpty((CharSequence) j760Var.a)) {
            m3098Y4(kye.f5131h.get(j760Var.a).intValue(), (Message) j760Var.b);
            return;
        }
        if (NullChecker.a(j760Var.b)) {
            emojiAnimData.emojiAnimCreatedTime.put(this.f7682p1.m4250i3(), Double.valueOf(((Message) j760Var.b).createdTime));
            pxe.m6948c().m6957j(emojiAnimData);
        }
        this.f2441a2 = true;
    }

    /* JADX INFO: renamed from: L3 */
    public void m3071L3(d30 d30Var) {
        if (this.f7682p1.lifecycle_() == c.i) {
            d30Var.call();
        } else {
            this.f2447g2.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m3072L4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f7679o1).from(MessageWarmingUpHelper.m2312w(warmingUpLevel)).autoPlay(true).animListener(new C0182j(warmingUpLevel)).repeatCount(1).into(this.f7675m1);
    }

    /* JADX INFO: renamed from: N3 */
    public C1099c<roj0> m3074N3() {
        return this.f2439Y1;
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: O0 */
    public void mo3076O0(int i, boolean z) {
        super.mo3076O0(i, z);
        this.f7682p1.Rg(z);
    }

    /* JADX INFO: renamed from: O3 */
    public boolean m3077O3() {
        return !vwb.J(this.f2447g2);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m3078O4(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, Long l2) {
        if (l2.longValue() > 11000) {
            m3055B5();
            return;
        }
        int iLongValue = (int) l2.longValue();
        if (iLongValue == 2233) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.voz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8363a.m3075N4(warmingUpLevel);
                }
            });
        }
        MessageBar messageBarM4844t0 = this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0();
        if (NullChecker.a(messageBarM4844t0)) {
            messageBarM4844t0.mo1925k(iLongValue, warmingUpLevel, this.f7682p1.m4260k3());
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m3079P3() {
        this.f7682p1.act().lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.bnz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2412a.m3109e4((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m3080P4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.f7679o1.getResources().getColor(a1c0.a0));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        sVGADynamicEntity.setDynamicText(MessageWarmingUpHelper.m2291b(this.f7682p1.m4270m3()) + "°C", textPaint, "wendushu");
        SVGALoader.with(this.f7679o1).from(MessageWarmingUpHelper.m2314y(warmingUpLevel)).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C0181i(warmingUpLevel2, warmingUpLevel)).repeatCount(1).into(this.f7675m1);
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: Q1 */
    public void mo3081Q1(boolean z, Runnable runnable) {
        if (NullChecker.a(this.f7608G0) && this.f7608G0.getChildCount() == 0) {
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        } else if (this.f7608G0.getChildCount() > 0) {
            if (NullChecker.a(this.f7686r1)) {
                this.f7686r1.m5757y(z, null);
            }
            m7895R1(z, runnable);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m3082Q4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f7679o1).from(MessageWarmingUpHelper.m2289A(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f7676n);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: R3 */
    public void m3083R3() {
        if (CoreModule.P().b().Yg() && this.f7698x1 == null) {
            Conversation conversationM4255j3 = this.f7682p1.m4255j3();
            if (NullChecker.a(conversationM4255j3)) {
                long j = (NullChecker.a(conversationM4255j3.property) && NullChecker.a(conversationM4255j3.property.intl_love_buzz)) ? conversationM4255j3.property.intl_love_buzz.expire : 0L;
                this.f7656d1.setBackgroundResource(c3c0.h1);
                this.f7654c1.setBackgroundResource(c3c0.i1);
                this.f7658e1.setText(CoreModule.P().b().Uq(j) + "  ");
                if (!xdl0.O0(this.f7654c1)) {
                    m7880I0();
                    m7918c2(m7873C0().getResources().getString(R.string.u3));
                }
                if (!CoreModule.P().b().la(j)) {
                    m7967z0();
                    return;
                }
                c0.a aVar = new c0.a();
                aVar.g("countdown_item_love_buzz_key").f(j).h(60L).a(true).d(this);
                CoreModule.c.t1.r(aVar);
                this.f7698x1 = act().duringCreated(CoreModule.c.t1.n("countdown_item_love_buzz_key")).subscribe((m250) mkd0.G(new e30() { // from class: l.cnz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f2738a.m3112f4((c0.b) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m3084R4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        SVGALoader.with(this.f7679o1).from(MessageWarmingUpHelper.m2315z(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f7672l);
    }

    /* JADX INFO: renamed from: S3 */
    public void m3085S3(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        if (warmingUpLevel.value <= MessageWarmingUpHelper.WarmingUpLevel.first.value) {
            return;
        }
        xdl0.M(this.f7607G, false);
        m3156z5(MessageWarmingUpHelper.m2302m(warmingUpLevel));
        m7936j0().y();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m3086S4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        this.f7682p1.m4208Z6(warmingUpLevel);
        m7936j0().y();
        SVGALoader.with(this.f7679o1).from(MessageWarmingUpHelper.m2289A(warmingUpLevel)).autoPlay(true).repeatCount(1).into(this.f7676n);
    }

    /* JADX INFO: renamed from: T3 */
    public void m3087T3() {
        if (User.isTeamAccount(this.f7682p1.f3543c)) {
            return;
        }
        User userPa = CoreModule.c.e0.Pa(this.f7682p1.r3());
        AppCompatTextView appCompatTextView = this.f7613I;
        StringBuilder sb = new StringBuilder("无法收到");
        sb.append(userPa.isFemale() ? "她" : "他");
        sb.append("的消息通知 ");
        appCompatTextView.setText(sb.toString());
        this.f7615J.setText("仅打开好友消息通知，及时回复".concat(userPa.isFemale() ? "她" : "他"));
        if (CoreModule.P().i().E3()) {
            m7952r0();
            return;
        }
        if (CoreModule.P().i().R2(this.f7682p1.f3543c)) {
            xdl0.M(this.f7610H, true);
            zvf0.x("e_open_button_click", "p_chat_view");
            HashSet hashSet = (HashSet) CoreModule.c.e0.q0.get();
            if (hashSet.size() < 2) {
                hashSet.add(this.f7682p1.f3543c);
                CoreModule.c.e0.q0.put(hashSet);
            }
            xdl0.E0(this.f7619L, new View.OnClickListener() { // from class: l.ymz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9082a.m3114g4(view);
                }
            });
            xdl0.E0(this.f7617K, new View.OnClickListener() { // from class: l.zmz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9382a.m3118i4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m3088T4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f7669k, this.f2448h2, MessageWarmingUpHelper.m2302m(warmingUpLevel), MessageWarmingUpHelper.m2302m(warmingUpLevel2));
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        arrayList.add(objectAnimatorOfInt);
        if (warmingUpLevel == MessageWarmingUpHelper.WarmingUpLevel.first) {
            arrayList.add(bt0.q(this.f7607G, "alpha", new float[]{1.0f, 0.0f}));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(900L);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m3089U3() {
        if (m7954s0()) {
            hmb.M(this.f7607G, false);
            hmb.M(this.f7627P, true);
            this.f7677n1.n(new C0176d());
            this.f7633S.setOnDispatchTouchEventListener(new C0177e());
            fuz fuzVar = new fuz(act(), new e30() { // from class: l.enz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f3342a.m3124k5((Media) obj);
                }
            });
            ArrayList arrayListN = vwb.n(CoreModule.c.e0.Pa(this.f7682p1.f3542b).pictures, new w9j() { // from class: l.fnz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Picture);
                }
            });
            fuzVar.m4470O(arrayListN.subList(1, arrayListN.size()));
            this.f7629Q.setAdapter(fuzVar);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m3090U4(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2, Long l2) {
        if (l2.longValue() > 11000) {
            m3055B5();
            return;
        }
        int iLongValue = (int) l2.longValue();
        if (warmingUpLevel == MessageWarmingUpHelper.WarmingUpLevel.not) {
            if (iLongValue == 150) {
                e51.F(this.f7679o1, new Runnable() { // from class: l.ooz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6190a.m3082Q4(warmingUpLevel2);
                    }
                });
            }
        } else if (iLongValue == 1450) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.qoz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6661a.m3084R4(warmingUpLevel2);
                }
            });
        } else if (iLongValue == 2150) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.roz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7029a.m3086S4(warmingUpLevel2);
                }
            });
        } else if (iLongValue == 2886) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.soz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7280a.m3088T4(warmingUpLevel, warmingUpLevel2);
                }
            });
        }
        MessageBar messageBarM4844t0 = this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0();
        if (NullChecker.a(messageBarM4844t0)) {
            messageBarM4844t0.mo1926l(iLongValue, warmingUpLevel, warmingUpLevel2, this.f7682p1.m4270m3());
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m3091V3(User user) {
        this.f7682p1.m6497e0().mo2051E().x0(user);
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m3092V4() {
        wmz wmzVar = this.f7682p1;
        if (wmzVar.R0 == null) {
            return;
        }
        ChatHeat chatHeatClone = wmzVar.R0.clone();
        this.f7682p1.R0 = null;
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM2307r = MessageWarmingUpHelper.m2307r(chatHeatClone.degree);
        MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM4265l3 = this.f7682p1.m4265l3();
        MessageWarmingUpHelper.m2311v("升温执行cache currentLevel = " + warmingUpLevelM4265l3 + " chatHeat=" + chatHeatClone.toJson());
        if (!NullChecker.a(warmingUpLevelM4265l3) || warmingUpLevelM2307r.value <= warmingUpLevelM4265l3.value) {
            return;
        }
        this.f7682p1.Mg(chatHeatClone);
    }

    /* JADX INFO: renamed from: W3 */
    public void m3093W3(boolean z) {
        this.f2429O1 = z;
        this.f7682p1.m6497e0().mo2063c0().m6499g0().mo5109l();
    }

    /* JADX INFO: renamed from: W4 */
    public void m3094W4(boolean z) {
        this.f2449i2 = z;
        if (NullChecker.a(this.f7686r1) && this.f7686r1.m5746m() == 10 && this.f7608G0.getChildCount() > 0 && NullChecker.a(this.f7686r1.f4989d) && NullChecker.a(this.f7686r1.f4989d.getAdapter())) {
            this.f7686r1.m5743G();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m3095X3(View view) {
        m3067J3(this.f7682p1.m6497e0().mo2051E().n0(), this.f2443c2);
        m3067J3(view, this.f2444d2);
        m3067J3(this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0(), this.f2445e2);
        RectF rectF = this.f2444d2;
        return rectF.top >= this.f2443c2.bottom && rectF.bottom <= this.f2445e2.top;
    }

    /* JADX INFO: renamed from: X4 */
    public void m3096X4() {
        m3069K3();
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m3097Y3(View view) {
        if (m3095X3(view)) {
            m3067J3(view, this.f2444d2);
            if (xdl0.w0() - this.f2444d2.top >= t100.d(100.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m3098Y4(int i, Message message) {
        EmojiAnimData emojiAnimDataM6952b = pxe.m6948c().m6952b();
        emojiAnimDataM6952b.emojiAnimCreatedTime.put(this.f7682p1.m4250i3(), Double.valueOf(message.createdTime));
        pxe.m6948c().m6957j(emojiAnimDataM6952b);
        if (this.f2440Z1) {
            return;
        }
        this.f2440Z1 = true;
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(BitmapFactory.decodeResource(this.f7679o1.getResources(), i), "emoji");
        SVGALoader.with(this.f7679o1).from(CoreModule.P().a().Cj()).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C0178f()).repeatCount(1).into(this.f7634S0);
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m3099Z3() {
        return this.f7671k1.o();
    }

    /* JADX INFO: renamed from: Z4 */
    public void m3100Z4(final CoreGiftInfo coreGiftInfo, final d30 d30Var) {
        if (coreGiftInfo.dynamicGift) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.qnz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6656a.m3125l4(coreGiftInfo, d30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a4 */
    public boolean m3101a4() {
        return this.f2435U1;
    }

    /* JADX INFO: renamed from: a5 */
    public void m3102a5(final Message message, final CoreGiftInfo coreGiftInfo, final d30 d30Var, final boolean z, final String str, final boolean z2) {
        if (coreGiftInfo.dynamicGift) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.aoz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2242a.m3129n4(coreGiftInfo, d30Var, z, str, z2, message);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b4 */
    public boolean m3103b4() {
        return this.f2449i2;
    }

    /* JADX INFO: renamed from: b5 */
    public void m3104b5(Message message, String str, Sticker sticker) {
        if (this.f2435U1) {
            return;
        }
        this.f2435U1 = true;
        ViewGroup viewGroup = (ViewGroup) this.f7679o1.getWindow().getDecorView();
        if (this.f2438X1 == null) {
            View sVGAnimationView = new SVGAnimationView(this.f7679o1);
            this.f2438X1 = sVGAnimationView;
            if (viewGroup instanceof FrameLayout) {
                ((FrameLayout) viewGroup).addView(sVGAnimationView, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        final tu4 tu4VarM8031a = tu4.m8031a(sticker);
        if (!NullChecker.a(tu4VarM8031a)) {
            this.f2435U1 = false;
            this.f2439Y1.onNext(roj0.a);
            return;
        }
        if (TextUtils.equals(sticker.name, "晚安") && !message.isMe()) {
            this.f7682p1.m6497e0().mo2063c0().m6499g0().mo5102d();
        }
        xdl0.M(this.f2438X1, true);
        tu4VarM8031a.m8035e(this.f2438X1, this.f7682p1.m6497e0().mo2063c0().m8921x0().m9972e().intValue(), this.f7682p1.m6497e0().mo2066l().m4309t7().f7665i, viewGroup);
        c4g0[] c4g0VarArr = new c4g0[1];
        SVGALoader.with(this.f7679o1).from(str).autoPlay(true).repeatCount(1).loadCallback(new C0175c()).animListener(new C0174b(tu4VarM8031a, viewGroup, c4g0VarArr)).into(this.f2438X1);
        if (tu4VarM8031a.f7775l) {
            c4g0VarArr[0] = this.f7682p1.m6497e0().mo2063c0().m8921x0().subscribe((m250<? super Integer>) mkd0.G(new e30() { // from class: l.pnz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6467a.m3131o4(tu4VarM8031a, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m3105c4() {
        return this.f2429O1;
    }

    /* JADX INFO: renamed from: c5 */
    public void m3106c5(User user) {
        xdl0.M(this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0(), true);
        this.f7674m.h(false, "0");
    }

    /* JADX INFO: renamed from: d4 */
    public void m3107d4(int i) {
        if (NullChecker.a(this.f7675m1)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7675m1.getLayoutParams();
            layoutParams.bottomMargin = t100.d(100.0f) + Math.abs(i);
            this.f7675m1.setLayoutParams(layoutParams);
        }
        if (NullChecker.a(this.f7676n)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f7676n.getLayoutParams();
            layoutParams2.bottomMargin = t100.d(100.0f) + Math.abs(i);
            this.f7676n.setLayoutParams(layoutParams2);
        }
        if (NullChecker.a(this.f7649a)) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f7649a.getLayoutParams();
            layoutParams3.bottomMargin = Math.abs(i);
            this.f7649a.setLayoutParams(layoutParams3);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m3108d5(boolean z) {
        String strK;
        final List listJ = lz4.h().j();
        if (z || !vwb.J(listJ)) {
            if (!this.f7612H1) {
                xdl0.U(this.f7681p0, t100.d(96.0f));
            }
            if (vwb.J(listJ)) {
                strK = lz4.h().k();
                this.f7605F0.setText("再来一批");
                zvf0.x("e_newmatch_next_batch", act().pageId());
            } else {
                zvf0.A("e_newmatch_next", act().pageId(), new j760[]{vwb.Y("other_uid", this.f7682p1.r3()), vwb.Y("newmatch_next_from", this.f7682p1.m4326y3()), vwb.Y("newmatch_next_number", Integer.valueOf(listJ.size()))});
                strK = (String) listJ.get(0);
                this.f7605F0.setText(y19.V() + " (" + listJ.size() + ")");
            }
            boolean zIsEmpty = TextUtils.isEmpty(strK);
            SimpleDraweeView simpleDraweeView = this.f7602E0;
            if (zIsEmpty) {
                xdl0.M(simpleDraweeView, false);
            } else {
                xdl0.M(simpleDraweeView, true);
                act().duringCreated(CoreModule.c.e0.Ka(strK).first()).subscribe((m250) mkd0.H(new e30() { // from class: l.xoz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f8811a.m3133p4((User) obj);
                    }
                }, new e30() { // from class: l.yoz
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        bpz.m3048y2((Throwable) obj);
                    }
                }));
            }
            xdl0.E0(this.f7681p0, new View.OnClickListener() { // from class: l.zoz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9391a.m3135q4(listJ, view);
                }
            });
            e51.F(act(), new Runnable() { // from class: l.apz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2254a.m3138r4();
                }
            });
        }
    }

    @Override // p003l.tqz
    public void destroy() {
        super.destroy();
        if (CoreModule.P().b().Yg()) {
            CoreModule.c.t1.u("countdown_item_love_buzz_key");
        }
        mkd0.z(this.f2436V1);
        mkd0.z(this.f2437W1);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m3109e4(c cVar) {
        if (cVar == c.i) {
            m3141s5();
        } else if (cVar == c.k) {
            this.f2441a2 = false;
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m3110e5(int i, int i2) {
        if (i == 0 && this.f2430P1 == null) {
            return;
        }
        if (i2 == 1) {
            this.f7682p1.m6497e0().mo2063c0().m6499g0().mo5108k(0, -1);
        }
        if (this.f2430P1 == null) {
            VoiceCallControlView voiceCallControlViewInflate = this.f7646Y0.inflate();
            this.f2430P1 = voiceCallControlViewInflate;
            voiceCallControlViewInflate.setVoiceCallAnimListener(new C0180h());
        }
        this.f2430P1.y(i, i2);
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: f0 */
    public u4z mo3111f0() {
        if (this.f7682p1.Gd()) {
            roy royVar = new roy();
            this.f2432R1 = royVar;
            return royVar;
        }
        tzz tzzVar = new tzz(this.f7682p1.r3());
        this.f2431Q1 = tzzVar;
        return tzzVar;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m3112f4(c0.b bVar) {
        if (NullChecker.a(bVar)) {
            this.f7658e1.setText(CoreModule.P().b().Uq(bVar.d) + "  ");
            if (bVar.a) {
                m7967z0();
                this.f7682p1.m6497e0().mo2046A0().m8830o2();
                CoreModule.c.t1.u("countdown_item_love_buzz_key");
            }
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
    /* JADX INFO: renamed from: f5 */
    public void m3113f5(Picture picture) {
        boolean zA = NullChecker.a(picture);
        SimpleDraweeView simpleDraweeView = this.f7667j;
        if (zA) {
            xdl0.M(simpleDraweeView, true);
            qib0.G.i0(this.f7667j, ((Media) picture).url);
            this.f7678o.setBackgroundColor(Color.parseColor("#00000000"));
            this.f2427M1 = true;
        } else {
            xdl0.M(simpleDraweeView, true);
            this.f7667j.setImageResource(0);
            this.f7667j.setBackgroundColor(Color.parseColor("#ffffff"));
            this.f2427M1 = false;
        }
        m7936j0().y();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m3114g4(View view) {
        zvf0.r("e_chat_open_push_close", "p_chat_view");
        HashSet hashSet = (HashSet) CoreModule.c.e0.s0.get();
        hashSet.add(this.f7682p1.f3543c);
        CoreModule.c.e0.s0.put(hashSet);
        xdl0.M(this.f7610H, false);
    }

    /* JADX INFO: renamed from: g5 */
    public boolean m3115g5(int i, boolean z) {
        boolean zM5740D = this.f7686r1.m5740D(m7940l0(), i, z);
        if (zM5740D && y19.a() && this.f7686r1.m5750q()) {
            this.f7686r1.m5737A(new Runnable() { // from class: l.dnz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3047a.m3142t4();
                }
            });
        }
        return zM5740D;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m3116h4(SettingGroups settingGroups) {
        lsi0.y("已开启消息通知");
        xdl0.M(this.f7610H, false);
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m3117h5(final List<BreakIce> list) {
        xdl0.M(this.f7608G0, true);
        mo3081Q1(false, new Runnable() { // from class: l.eoz
            @Override // java.lang.Runnable
            public final void run() {
                this.f3349a.m3149w4(list);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m3118i4(View view) {
        zvf0.r("e_open_button_click", "p_chat_view");
        if (NotificationCheckerCommon.a() != NotificationCheckerCommon.State.closed && !CoreModule.c.e0.p9().getUserPushAllEnable()) {
            act().duringCreated(CoreModule.c.e0.K9("openWithFriend", true, 0, 0)).subscribe((m250) mkd0.H(new e30() { // from class: l.xnz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8806a.m3116h4((SettingGroups) obj);
                }
            }, new e30() { // from class: l.ynz
                @Override // p003l.e30
                public final void call(Object obj) {
                    yij0.D((Throwable) obj);
                }
            }));
        } else {
            CoreModule.P().i().T();
            CoreModule.c.e0.K9("openWithFriend", true, 0, 0);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public boolean m3119i5() {
        xdl0.M(this.f7608G0, true);
        mo3081Q1(false, new Runnable() { // from class: l.tnz
            @Override // java.lang.Runnable
            public final void run() {
                this.f7566a.m3151x4();
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m3120j4(View view) {
        PutongAct putongActM7913a0 = act();
        MessagesAct messagesActM7913a0 = act();
        wmz wmzVar = this.f7682p1;
        putongActM7913a0.startActivity(MessageProfileSettingAct.m2006Y1(messagesActM7913a0, wmzVar.m4261k4(wmzVar.r3()), this.f7682p1.r3()));
    }

    /* JADX INFO: renamed from: j5 */
    public void m3121j5(final String str, String str2) {
        xdl0.M(this.f7680p, false);
        xdl0.M(this.f7691u, false);
        xdl0.M(this.f7699y, false);
        xdl0.M(this.f7597C, false);
        xdl0.M(this.f7610H, false);
        xdl0.M(this.f7621M, true);
        this.f7623N.setText(str2);
        xdl0.E0(this.f7621M, new View.OnClickListener() { // from class: l.anz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2240a.m3153y4(str, view);
            }
        });
        zvf0.A("e_chat_safety_notice", "p_chat_view", new j760[]{vwb.Y("user_risk_type", str), vwb.Y("risk_userid", this.f7682p1.r3())});
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: k0 */
    public j760<Integer, Integer> mo3122k0() {
        tzz tzzVar = this.f2431Q1;
        if (tzzVar == null || tzzVar.m8079u() == null) {
            return null;
        }
        SimpleDraweeView simpleDraweeViewM8079u = this.f2431Q1.m8079u();
        return vwb.Y(Integer.valueOf(simpleDraweeViewM8079u.getWidth()), Integer.valueOf(simpleDraweeViewM8079u.getHeight()));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m3123k4() {
        act().finish();
    }

    /* JADX INFO: renamed from: k5 */
    public void m3124k5(Media media) {
        Conversation conversationZp;
        if (y19.c()) {
            String str = this.f7682p1.f3543c;
            ConversationCounterTypeSp conversationCounterTypeSp = ConversationCounterTypeSp.ShowPicLikeGuideTime;
            if (mqi0.C(conversationCounterTypeSp.getLong(str), mqi0.o()) || (conversationZp = CoreModule.c.f0.zp(str)) == null || !TEnum.equals(conversationZp.status, ServletHandler.__DEFAULT_SERVLET) || !TextUtils.equals(conversationZp.convType, ServletHandler.__DEFAULT_SERVLET) || TextUtils.equals(conversationZp.otherStatus, "invalid")) {
                return;
            }
            if (y19.d()) {
                ProfileLikeLifePhotoAct.w2(this.f7679o1, str, media.url, vwb.J(media.tags) ? "" : (String) media.tags.get(0));
            } else {
                m7903V1();
                this.f7686r1.m5738B(13);
                MessagePicLikeGuideLayout messagePicLikeGuideLayout = (MessagePicLikeGuideLayout) o7r.a(this.f7679o1).inflate(l6c0.w5, (ViewGroup) this.f7608G0, false);
                this.f7608G0.addView(messagePicLikeGuideLayout);
                messagePicLikeGuideLayout.m2005a0(this.f7679o1, media, new Runnable() { // from class: l.nnz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5931a.m3054B4();
                    }
                });
                m7926f2(13, new Runnable() { // from class: l.onz
                    @Override // java.lang.Runnable
                    public final void run() {
                        bpz.m2986D2();
                    }
                });
                xdl0.V(messagePicLikeGuideLayout, t100.m - this.f7608G0.getPaddingLeft());
            }
            conversationCounterTypeSp.setLong(str, mqi0.o());
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m3125l4(CoreGiftInfo coreGiftInfo, d30 d30Var) {
        this.f7671k1.w(coreGiftInfo, d30Var);
    }

    /* JADX INFO: renamed from: l5 */
    public boolean m3126l5(final List<Prologue> list, final String str) {
        if (vwb.J(list)) {
            return false;
        }
        xdl0.M(this.f7608G0, true);
        mo3081Q1(false, new Runnable() { // from class: l.poz
            @Override // java.lang.Runnable
            public final void run() {
                this.f6473a.m3056C4(list, str);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m3127m4(Message message, View view) {
        zvf0.r("e_chat_gift_view_thanks", act().pageId());
        m3143t5();
        this.f7682p1.m4183U6(message);
    }

    /* JADX INFO: renamed from: m5 */
    public void m3128m5(final e30<dd80> e30Var) {
        final dd80 dd80VarO = this.f7679o1.newDialog().S(c3c0.C0).y0("功能全新升级").t0("本次聊天需要消耗一次消耗次数").P(false).M(false).b0("同意并聊天").W("不同意").O();
        dd80VarO.V(new Runnable() { // from class: l.gnz
            @Override // java.lang.Runnable
            public final void run() {
                this.f3957a.m3058D4(dd80VarO);
            }
        });
        dd80VarO.W(new Runnable() { // from class: l.hnz
            @Override // java.lang.Runnable
            public final void run() {
                e30Var.call(dd80VarO);
            }
        });
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m3129n4(CoreGiftInfo coreGiftInfo, d30 d30Var, boolean z, String str, boolean z2, final Message message) {
        this.f7671k1.w(coreGiftInfo, d30Var);
        this.f7671k1.C(z);
        if (z) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            CoreGiftLayer coreGiftLayer = this.f7671k1;
            if (zIsEmpty) {
                coreGiftLayer.n();
            } else {
                coreGiftLayer.G(str);
            }
            this.f7671k1.D(!z2);
            if (z2) {
                return;
            }
            zvf0.x("e_chat_gift_view_thanks", act().pageId());
            this.f7671k1.setThxTipClickListener(new View.OnClickListener() { // from class: l.coz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2741a.m3127m4(message, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m3130n5() {
        if (this.f7686r1.m5746m() != 10 || this.f7608G0.getChildCount() <= 0) {
            if (this.f7608G0.getChildCount() > 0) {
                return;
            }
            m3115g5(10, false);
        } else if (NullChecker.a(this.f7686r1.f4989d) && NullChecker.a(this.f7686r1.f4989d.getAdapter())) {
            this.f7686r1.m5743G();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m3131o4(tu4 tu4Var, Integer num) {
        if (NullChecker.a(this.f2438X1)) {
            this.f2438X1.setTranslationY(num.intValue() * tu4Var.f7776m);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public void m3132o5() {
        MessageBar messageBarM4844t0;
        int iIntValue;
        Conversation conversationM4255j3 = this.f7682p1.m4255j3();
        if (conversationM4255j3 == null || TEnum.equals(conversationM4255j3.status, "dismissed") || this.f7679o1.m2049C2() || (messageBarM4844t0 = this.f7682p1.m6497e0().mo2046A0().m6499g0().m4844t0()) == null) {
            return;
        }
        MessageBarActionItemType messageBarActionItemType = MessageBarActionItemType.MORE;
        if (!messageBarM4844t0.mo1917c(messageBarActionItemType) || !xoy.m8735f(conversationM4255j3.otherUser, false) || ((Boolean) CoreModule.c.f0.A1.get()).booleanValue() || (iIntValue = ((Integer) CoreModule.c.f0.u1.get()).intValue()) >= 3) {
            return;
        }
        if (mqi0.o() - ((Long) CoreModule.c.f0.t1.get()).longValue() < 86400000 || d.l().x("switchPicBubbleKey") || wc80.e().k()) {
            return;
        }
        final int i = iIntValue + 1;
        d.l().u(new a(this.f7679o1).D("照片新玩法限时开启！").k(new int[]{e16.c(this.f7679o1, ura.e().d().I4() ? a1c0.j : a1c0.x)}).G(a1c0.q).t(true).J(13.0f).w(t100.h).e(false).N(new a.d() { // from class: l.lnz
            /* JADX INFO: renamed from: a */
            public final void m6137a(View view) {
                this.f5372a.m3060E4(i, view);
            }
        }).d(new a.b() { // from class: l.mnz
            /* JADX INFO: renamed from: a */
            public final void m6416a(String str) {
                bpz.m3041u2(str);
            }
        }).E(false).x(t100.g).w(t100.k).b(8000L).q(jtk.D | jtk.E), messageBarM4844t0.mo1916b(messageBarActionItemType), "switchPicBubbleKey");
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m3133p4(User user) {
        if (user.isBannedNew() || user.isAccountCancellation()) {
            qib0.G.Y0(this.f7602E0, c3c0.h);
        } else {
            qib0.G.Q0(this.f7602E0, user.fp().profileSize(t100.q));
        }
    }

    /* JADX INFO: renamed from: p5 */
    public void m3134p5(User user) {
        this.f2428N1 = true;
        a aVar = new a(act());
        aVar.D(user.isFemale() ? act().string(R.string.y6) : act().string(R.string.z6)).q(jtk.A | jtk.E).B(t100.d(2.0f)).l(t100.d(7.0f)).p(75).b(3000L).e(true).j(new a.c() { // from class: l.woz
            /* JADX INFO: renamed from: a */
            public final void m8572a(String str) {
                this.f8582a.m3061F4(str);
            }
        }).x(t100.d(8.0f));
        d.l().t(aVar, this.f7682p1.m6497e0().mo2051E().o0());
        zvf0.A("e_bubble_chat_page_id_verification_tips", "p_chat_view", new j760[]{vwb.Y("tooltips_type", "bubble"), vwb.Y("tooltips_type_ui", "bubble_basic_double_edge"), vwb.Y("tooltips_trigger_page", "chat_page"), vwb.Y("tooltips_trigger_reason", "tips"), vwb.Y("tooltips_trigger_module", "null")});
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m3135q4(List list, View view) {
        String strK;
        if (vwb.J(list)) {
            strK = lz4.h().k();
            zvf0.r("e_newmatch_next_batch", act().pageId());
            lz4.h().p();
        } else {
            String str = (String) list.get(0);
            zvf0.u("e_newmatch_next", act().pageId(), new j760[]{vwb.Y("other_uid", this.f7682p1.r3()), vwb.Y("newmatch_next_from", this.f7682p1.m4326y3()), vwb.Y("newmatch_next_number", Integer.valueOf(list.size()))});
            strK = str;
        }
        lz4.h().q(strK);
        Intent intentM2036k2 = MessagesAct.m2036k2(act(), strK, false, false, 26);
        MessagesAct.m2044s2(intentM2036k2, "newmatch_next");
        act().startActivity(intentM2036k2);
        act().finish();
    }

    /* JADX INFO: renamed from: q5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m3075N4(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        m3065I3();
        final MessageWarmingUpHelper.TempDownEnum tempDownEnumM2306q = MessageWarmingUpHelper.m2306q(warmingUpLevel, this.f7682p1.f3542b);
        if (tempDownEnumM2306q == null) {
            return;
        }
        o6j0.h("e_heat_reduce_remind", this.f7682p1.pageId(), new o6j0.a[]{o6j0.a.h("heat_reduce_function_name", tempDownEnumM2306q.key)});
        this.f7608G0.removeAllViews();
        if (tempDownEnumM2306q == MessageWarmingUpHelper.TempDownEnum.message) {
            kye.C0395a c0395aM3000M3 = m3000M3(this.f7679o1, tempDownEnumM2306q.imageRes);
            if (NullChecker.a(c0395aM3000M3)) {
                this.f7657e.setImageResource(c0395aM3000M3.f5137d);
            }
        } else if (tempDownEnumM2306q == MessageWarmingUpHelper.TempDownEnum.photo) {
            this.f7657e.setImageResource(c3c0.W6);
        } else if (tempDownEnumM2306q == MessageWarmingUpHelper.TempDownEnum.chuEmo || tempDownEnumM2306q == MessageWarmingUpHelper.TempDownEnum.friendEmo) {
            Sticker stickerR3 = CoreModule.c.Z.r3(tempDownEnumM2306q.imageRes);
            if (NullChecker.a(stickerR3) && !vwb.J(stickerR3.pictures)) {
                qib0.G.L0(this.f7657e, ((Media) ((Picture) stickerR3.pictures.get(0))).url);
            }
        }
        this.f7653c.setText(String.format("温度下降了%s°C", MessageWarmingUpHelper.m2291b(this.f7682p1.m4270m3() - this.f7682p1.m4260k3())) + "\n" + tempDownEnumM2306q.title);
        this.f7659f.setText(tempDownEnumM2306q.content);
        xdl0.E0(this.f7655d, new View.OnClickListener() { // from class: l.loz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5378a.m3062G4(tempDownEnumM2306q, view);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f7649a, "alpha", 0.0f, 1.0f));
        arrayList.add(bt0.q(this.f7649a, "translationY", new float[]{t100.d(7.0f), 0.0f}));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C0183k());
        animatorSet.setDuration(483L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
        e51.H(this.f7679o1, new Runnable() { // from class: l.moz
            @Override // java.lang.Runnable
            public final void run() {
                this.f5695a.m3064H4();
            }
        }, 750L);
        e51.H(this.f7679o1, new Runnable() { // from class: l.noz
            @Override // java.lang.Runnable
            public final void run() {
                this.f5941a.m3066I4();
            }
        }, 5000L);
        SVGALoader.with(this.f7679o1).from(MessageWarmingUpHelper.m2313x()).autoPlay(true).repeatCount(5).into(this.f7663h);
    }

    @Override // p003l.tqz
    /* JADX INFO: renamed from: r */
    public void mo3137r() {
        super.mo3137r();
        if (CoreModule.P().i().V0()) {
            m3087T3();
        }
        m3079P3();
        m3089U3();
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m3138r4() {
        xdl0.M(this.f7681p0, true);
    }

    /* JADX INFO: renamed from: r5 */
    public void m3139r5() {
        if (!CoreModule.P().i().D() || ((Boolean) CoreModule.c.b1.S.get()).booleanValue()) {
            return;
        }
        e51.J(this.f2446f2);
        e51.H(act(), this.f2446f2, 500L);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m3140s4() {
        this.f7682p1.Dg();
    }

    /* JADX INFO: renamed from: s5 */
    public final void m3141s5() {
        final EmojiAnimData emojiAnimDataM6952b = pxe.m6948c().m6952b();
        final double dDoubleValue = emojiAnimDataM6952b.emojiAnimCreatedTime.containsKey(this.f7682p1.m4250i3()) ? ((Double) emojiAnimDataM6952b.emojiAnimCreatedTime.get(this.f7682p1.m4250i3())).doubleValue() + 1.0d : 0.0d;
        this.f7682p1.act().duringCreated(C1099c.just(roj0.a).observeOn(Schedulers.m9950io()).map(new w9j() { // from class: l.vnz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f8358a.m3068J4(dDoubleValue, (roj0) obj);
            }
        }).observeOn(jo0.m5414a())).subscribe((m250) mkd0.G(new e30() { // from class: l.wnz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8578a.m3070K4(emojiAnimDataM6952b, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m3142t4() {
        this.f7686r1.m5757y(true, new Runnable() { // from class: l.unz
            @Override // java.lang.Runnable
            public final void run() {
                this.f8039a.m3140s4();
            }
        });
        zvf0.u("e_close_click", this.f7679o1.pageId(), new j760[]{j760.a("shortcut_type", "emoji_picture")});
    }

    /* JADX INFO: renamed from: t5 */
    public void m3143t5() {
        if (m3099Z3()) {
            this.f7671k1.F();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m3145u4() {
        this.f7682p1.Dg();
    }

    /* JADX INFO: renamed from: u5 */
    public void m3146u5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m2311v("降温动画");
        int i = warmingUpLevel.value;
        if (i <= MessageWarmingUpHelper.WarmingUpLevel.not.value || i >= MessageWarmingUpHelper.WarmingUpLevel.five.value) {
            this.f7682p1.P0 = false;
            return;
        }
        int i2 = MessageWarmingUpHelper.WarmingUpLevel.first.value;
        PutongAct putongAct = this.f7679o1;
        if (i > i2) {
            e51.F(putongAct, new Runnable() { // from class: l.foz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3665a.m3072L4(warmingUpLevel);
                }
            });
        } else {
            e51.F(putongAct, new Runnable() { // from class: l.goz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3960a.m3073M4(warmingUpLevel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m3147v4() {
        mo3081Q1(true, new Runnable() { // from class: l.boz
            @Override // java.lang.Runnable
            public final void run() {
                this.f2416a.m3145u4();
            }
        });
    }

    /* JADX INFO: renamed from: v5 */
    public final void m3148v5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel) {
        MessageWarmingUpHelper.m2311v("tempDownAnimInner");
        this.f2437W1 = this.f7679o1.duringCreated(C1099c.interval(1L, TimeUnit.MILLISECONDS)).subscribe((m250) mkd0.H(new e30() { // from class: l.toz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7574a.m3078O4(warmingUpLevel, (Long) obj);
            }
        }, new e30() { // from class: l.uoz
            @Override // p003l.e30
            public final void call(Object obj) {
                bpz.m3014a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m3149w4(List list) {
        this.f7686r1.m5738B(12);
        ItemBreakIceMessage itemBreakIceMessage = (ItemBreakIceMessage) o7r.a(this.f7679o1).inflate(l6c0.Q2, (ViewGroup) this.f7608G0, false);
        this.f7608G0.addView(itemBreakIceMessage);
        itemBreakIceMessage.m1128h(this.f7679o1, CoreModule.c.f0.te(this.f7682p1.m4250i3(), list), new Runnable() { // from class: l.jnz
            @Override // java.lang.Runnable
            public final void run() {
                this.f4692a.m3147v4();
            }
        });
        m7926f2(12, new Runnable() { // from class: l.knz
            @Override // java.lang.Runnable
            public final void run() {
                bpz.m3002O2();
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public void m3150w5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        MessageWarmingUpHelper.m2311v("升温动画");
        if (warmingUpLevel != MessageWarmingUpHelper.WarmingUpLevel.not) {
            e51.F(this.f7679o1, new Runnable() { // from class: l.hoz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4241a.m3080P4(warmingUpLevel2, warmingUpLevel);
                }
            });
        } else {
            m3152x5(warmingUpLevel, warmingUpLevel2);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m3151x4() {
        this.f7686r1.m5738B(11);
        MessageExchangeQuestionAnswerLayout messageExchangeQuestionAnswerLayout = (MessageExchangeQuestionAnswerLayout) o7r.a(this.f7679o1).inflate(l6c0.Y4, (ViewGroup) this.f7608G0, false);
        this.f7608G0.addView(messageExchangeQuestionAnswerLayout);
        messageExchangeQuestionAnswerLayout.m1959a0(this.f7679o1, this);
        m7926f2(11, new Runnable() { // from class: l.snz
            @Override // java.lang.Runnable
            public final void run() {
                bpz.m3021h3();
            }
        });
        xdl0.V(messageExchangeQuestionAnswerLayout, t100.m - this.f7608G0.getPaddingLeft());
    }

    /* JADX INFO: renamed from: x5 */
    public final void m3152x5(final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel2) {
        this.f2436V1 = this.f7679o1.duringCreated(C1099c.interval(1L, TimeUnit.MILLISECONDS)).subscribe((m250) mkd0.H(new e30() { // from class: l.joz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4697a.m3090U4(warmingUpLevel, warmingUpLevel2, (Long) obj);
            }
        }, new e30() { // from class: l.koz
            @Override // p003l.e30
            public final void call(Object obj) {
                bpz.m3043v2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m3153y4(String str, View view) {
        ura.e().d().r7(act());
        zvf0.u("e_chat_safety_notice", "p_chat_view", new j760[]{vwb.Y("user_risk_type", str)});
    }

    /* JADX INFO: renamed from: y5 */
    public void m3154y5(int i) {
        VoiceCallControlView voiceCallControlView = this.f2430P1;
        if (voiceCallControlView == null) {
            return;
        }
        voiceCallControlView.x(i);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m3155z4() {
        this.f7682p1.Dg();
    }

    /* JADX INFO: renamed from: z5 */
    public void m3156z5(int i) {
        this.f7669k.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, -1}));
        this.f7679o1.setStatusBarColor(i);
        this.f7662g1.setBackgroundColor(this.f7679o1.getResources().getColor(a1c0.Y));
    }

    /* JADX INFO: renamed from: l.bpz$b */
    public class C0174b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public boolean f2451a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ tu4 f2452b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f2453c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ c4g0[] f2454d;

        public C0174b(tu4 tu4Var, ViewGroup viewGroup, c4g0[] c4g0VarArr) {
            this.f2452b = tu4Var;
            this.f2453c = viewGroup;
            this.f2454d = c4g0VarArr;
        }

        public void onFinished() {
            bpz.this.f2435U1 = false;
            bpz.this.f2439Y1.onNext(roj0.a);
            xdl0.M(bpz.this.f2438X1, false);
            this.f2453c.removeView(bpz.this.f2438X1);
            mkd0.z(this.f2454d[0]);
            bpz.this.f2438X1 = null;
        }

        public void onStep(int i) {
            int i2;
            super.onStep(i);
            if (!this.f2451a && (i2 = this.f2452b.f7772i) > 0 && i >= i2) {
                this.f2451a = true;
                ((Vibrator) CoreModule.b.getSystemService("vibrator")).vibrate(this.f2452b.f7773j);
            }
            if (vwb.J(this.f2452b.f7774k)) {
                return;
            }
            for (int i3 = 0; i3 < this.f2452b.f7774k.size(); i3++) {
                j760<Integer, Boolean> j760Var = this.f2452b.f7774k.get(i3);
                if (i > ((Integer) j760Var.a).intValue() && !((Boolean) j760Var.b).booleanValue()) {
                    this.f2452b.f7774k.set(i3, j760.a((Integer) j760Var.a, Boolean.TRUE));
                    bt0.l(this.f2453c, bt0.i, 0L, 140L, (Interpolator) null, new float[]{1.0f, 0.9f, 1.0f}).start();
                    return;
                }
            }
        }

        public void onStart() {
        }
    }

    /* JADX INFO: renamed from: l.bpz$c */
    public class C0175c implements RequestCallback {
        public C0175c() {
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            bpz.this.f2435U1 = false;
            bpz.this.f2439Y1.onNext(roj0.a);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3144u(String str, long j, long j2, long j3, long j4) {
    }
}
