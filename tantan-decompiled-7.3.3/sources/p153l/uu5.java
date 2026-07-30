package p153l;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.confession.widget.FloatTouchWindowConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0002%(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00107R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00104¨\u0006;"}, m88121d2 = {"Ll/uu5;", "", "Ll/uu5$b;", "managerListener", "<init>", "(Ll/uu5$b;)V", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "message", "", "r", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", "", "k", "()Z", "", "tipText", "q", "(I)V", "g", "()V", "f", "Lcom/p1/mobile/android/app/Act;", "activity", "n", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;Lcom/p1/mobile/android/app/Act;)V", "m", "Landroid/view/View;", "popupHelpView", "o", "(Landroid/view/View;Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", "", "json", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;)Ljava/lang/String;", "j", "h", BLiveStormDanmakuGiftResourceType.f45294s, "a", "Ll/uu5$b;", "Landroid/widget/PopupWindow;", "b", "Landroid/widget/PopupWindow;", "popupWindow", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout;", "c", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout;", "popupContentView", "Lv/VButton;", Constants.INAPP_DATA_TAG, "Lv/VButton;", "matchButton", "e", "Z", "isShowingPopUpWindow", "Ll/kcg0;", "Ll/kcg0;", "activitySub", "isPopupWindowHiding", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class uu5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC20677b managerListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public PopupWindow popupWindow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public FloatTouchWindowConstraintLayout popupContentView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public VButton matchButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isShowingPopUpWindow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public kcg0 activitySub;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isPopupWindowHiding;

    /* JADX INFO: renamed from: l.uu5$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m88121d2 = {"Ll/uu5$b;", "", "", "b", "()V", "c", "a", "", Reason.TYPE, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC20677b {
        /* JADX INFO: renamed from: a */
        void mo142171a();

        /* JADX INFO: renamed from: b */
        void mo142172b();

        /* JADX INFO: renamed from: c */
        void mo142173c();

        /* JADX INFO: renamed from: d */
        void mo142174d(@NotNull String reason);
    }

    /* JADX INFO: renamed from: l.uu5$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/uu5$c", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout$b;", "", "isScrollUp", "", "a", "(Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20678c implements FloatTouchWindowConstraintLayout.InterfaceC13176b {
        public C20678c() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.confession.widget.FloatTouchWindowConstraintLayout.InterfaceC13176b
        /* JADX INFO: renamed from: a */
        public void mo79243a(boolean isScrollUp) {
            if (isScrollUp) {
                uu5.this.m198159g();
            }
        }
    }

    public uu5(@NotNull InterfaceC20677b interfaceC20677b) {
        interfaceC20677b.getClass();
        this.managerListener = interfaceC20677b;
    }

    /* JADX INFO: renamed from: a */
    public static void m198151a(uu5 uu5Var, C4470c c4470c) {
        uu5Var.m198161j();
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m198154d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m198155e(C4470c c4470c) {
        return Boolean.valueOf(Intrinsics.m88377d(c4470c, C4470c.f16269k));
    }

    /* JADX INFO: renamed from: i */
    public static final void m198156i(PopupWindow popupWindow, uu5 uu5Var) {
        popupWindow.dismiss();
        uu5Var.isPopupWindowHiding = false;
        uu5Var.managerListener.mo142171a();
        uu5Var.isShowingPopUpWindow = false;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m198157p(uu5 uu5Var, View view) {
        view.getClass();
        uu5Var.managerListener.mo142173c();
        uu5Var.m198159g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m198158f() {
        m198161j();
        this.popupWindow = null;
        this.popupContentView = null;
        this.matchButton = null;
        this.isShowingPopUpWindow = false;
        this.isPopupWindowHiding = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m198159g() {
        if (this.isPopupWindowHiding) {
            return;
        }
        this.isPopupWindowHiding = true;
        m198160h();
    }

    /* JADX INFO: renamed from: h */
    public final void m198160h() {
        final PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(popupWindow.getContentView(), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -popupWindow.getContentView().getHeight());
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.start();
            gt0.m132160f(objectAnimatorOfFloat, new Runnable() { // from class: l.tu5
                @Override // java.lang.Runnable
                public final void run() {
                    uu5.m198156i(popupWindow, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m198161j() {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.isPopupWindowHiding = false;
        }
        kcg0 kcg0Var = this.activitySub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsShowingPopUpWindow() {
        return this.isShowingPopUpWindow;
    }

    /* JADX INFO: renamed from: l */
    public final String m198163l(String json) {
        LangModel langModelM111775K = cpj.m111775K(json);
        return langModelM111775K != null ? langModelM111775K.getLocalName() : "";
    }

    /* JADX INFO: renamed from: m */
    public final void m198164m() {
        View viewInflate = LayoutInflater.from(zrv.f205803e).inflate(yec0.f199061e5, (ViewGroup) null, false);
        viewInflate.getClass();
        FloatTouchWindowConstraintLayout floatTouchWindowConstraintLayout = (FloatTouchWindowConstraintLayout) viewInflate;
        this.popupContentView = floatTouchWindowConstraintLayout;
        if (floatTouchWindowConstraintLayout != null) {
            floatTouchWindowConstraintLayout.setFloatTouchWindowListener(new C20678c());
            ynp0.m216936m(floatTouchWindowConstraintLayout.findViewById(mdc0.f136246n0), qa00.m175859d(2.0f));
        }
        PopupWindow popupWindow = new PopupWindow(zrv.f205803e);
        popupWindow.setContentView(this.popupContentView);
        popupWindow.setWidth(qa00.m175859d(375.0f));
        popupWindow.setHeight(qa00.m175859d(210.0f));
        popupWindow.setOutsideTouchable(false);
        popupWindow.setBackgroundDrawable(zrv.f205803e.getDrawable(obc0.f146357h7));
        this.popupWindow = popupWindow;
    }

    /* JADX INFO: renamed from: n */
    public final void m198165n(LongLinkConfession.ConfessionGiftReceiveMsg message, Act activity) {
        if (this.popupWindow == null || this.popupContentView == null) {
            m198164m();
        }
        C22421c<C4470c> c22421cLifecycle = activity.lifecycle();
        final Function1 function1 = new Function1() { // from class: l.pu5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return uu5.m198155e((C4470c) obj);
            }
        };
        this.activitySub = c22421cLifecycle.filter(new qcj() { // from class: l.qu5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uu5.m198154d(function1, obj);
            }
        }).take(1).subscribe(dhw.m115829h(new y20() { // from class: l.ru5
            @Override // p153l.y20
            public final void call(Object obj) {
                uu5.m198151a(this.f164900a, (C4470c) obj);
            }
        }));
        FloatTouchWindowConstraintLayout floatTouchWindowConstraintLayout = this.popupContentView;
        floatTouchWindowConstraintLayout.getClass();
        m198166o(floatTouchWindowConstraintLayout, message);
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.showAtLocation(activity.getWindow().getDecorView(), 48, 0, qa00.f156326m);
            m198169s();
            this.isShowingPopUpWindow = true;
            this.managerListener.mo142172b();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m198166o(View popupHelpView, LongLinkConfession.ConfessionGiftReceiveMsg message) {
        ((VText) popupHelpView.findViewById(mdc0.f136060T5)).setText(m198163l(message.getSlogan()));
        ((VText) popupHelpView.findViewById(mdc0.f136101Y1)).setText(xau.m209911u(R$string.f48161j2, Long.valueOf(message.getGift().getPrice())));
        ((VText) popupHelpView.findViewById(mdc0.f136053S7)).setText(message.getUser().getName());
        VButton vButton = (VButton) popupHelpView.findViewById(mdc0.f136049S3);
        this.matchButton = vButton;
        if (vButton != null) {
            vButton.setText(xau.m209911u(R$string.f48205l2, Long.valueOf(message.getShowTime())));
            czq.m113347c(vButton, new Function1() { // from class: l.su5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return uu5.m198157p(this.f170648a, (View) obj);
                }
            });
        }
        VDraweeView vDraweeView = (VDraweeView) popupHelpView.findViewById(mdc0.f136160e2);
        GradientDrawable gradientDrawableM124979i = fc2.m124979i(0, 0);
        gradientDrawableM124979i.setColor(n3d0.m161277a(n9c0.f140794S0));
        vDraweeView.setBackground(gradientDrawableM124979i);
        izs.m142868s("context_livingAct", vDraweeView, message.getGift().getIcon());
        ynp0.m216936m(vDraweeView, qa00.m175859d(12.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m198167q(int tipText) {
        if (tipText <= 0) {
            m198159g();
            return;
        }
        VButton vButton = this.matchButton;
        if (vButton != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM209911u = xau.m209911u(R$string.f48205l2, Integer.valueOf(tipText));
            strM209911u.getClass();
            vButton.setText(String.format(strM209911u, Arrays.copyOf(new Object[0], 0)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m198168r(@NotNull LongLinkConfession.ConfessionGiftReceiveMsg message) {
        Act act;
        message.getClass();
        if (Act.foreground_() != null) {
            Activity activity = Act.foreground_().f16062a.get();
            activity.getClass();
            act = (Act) activity;
        } else {
            act = null;
        }
        if (act == null) {
            this.managerListener.mo142174d("open popup window fail. Reason is : Act.foreground_() act is null.");
            return;
        }
        kcg0 kcg0Var = this.activitySub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        m198165n(message, act);
    }

    /* JADX INFO: renamed from: s */
    public final void m198169s() {
        FloatTouchWindowConstraintLayout floatTouchWindowConstraintLayout;
        if (this.popupWindow == null || (floatTouchWindowConstraintLayout = this.popupContentView) == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatTouchWindowConstraintLayout, (Property<FloatTouchWindowConstraintLayout, Float>) View.TRANSLATION_Y, -qa00.m175859d(210.0f), 0.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.start();
    }
}
