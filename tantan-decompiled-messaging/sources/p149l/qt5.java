package p149l;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.confession.widget.FloatTouchWindowConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0002%(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00107R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00104¨\u0006;"}, m87232d2 = {"Ll/qt5;", "", "Ll/qt5$b;", "managerListener", "<init>", "(Ll/qt5$b;)V", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "message", "", "r", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", "", "k", "()Z", "", "tipText", "q", "(I)V", "g", "()V", "f", "Lcom/p1/mobile/android/app/Act;", "activity", "n", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;Lcom/p1/mobile/android/app/Act;)V", "m", "Landroid/view/View;", "popupHelpView", "o", "(Landroid/view/View;Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", "", "json", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;)Ljava/lang/String;", "j", "h", BLiveStormDanmakuGiftResourceType.f44446s, "a", "Ll/qt5$b;", "Landroid/widget/PopupWindow;", "b", "Landroid/widget/PopupWindow;", "popupWindow", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout;", "c", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout;", "popupContentView", "Lv/VButton;", Constants.INAPP_DATA_TAG, "Lv/VButton;", "matchButton", "e", "Z", "isShowingPopUpWindow", "Ll/c4g0;", "Ll/c4g0;", "activitySub", "isPopupWindowHiding", "Companion", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qt5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC19574b managerListener;

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
    public c4g0 activitySub;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isPopupWindowHiding;

    /* JADX INFO: renamed from: l.qt5$b */
    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m87232d2 = {"Ll/qt5$b;", "", "", "b", "()V", "c", "a", "", Reason.TYPE, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC19574b {
        /* JADX INFO: renamed from: a */
        void mo118004a();

        /* JADX INFO: renamed from: b */
        void mo118005b();

        /* JADX INFO: renamed from: c */
        void mo118006c();

        /* JADX INFO: renamed from: d */
        void mo118007d(@NotNull String reason);
    }

    /* JADX INFO: renamed from: l.qt5$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/qt5$c", "Lcom/p1/mobile/putong/live/livingroom/voice/confession/widget/FloatTouchWindowConstraintLayout$b;", "", "isScrollUp", "", "a", "(Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19575c implements FloatTouchWindowConstraintLayout.InterfaceC13013b {
        public C19575c() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.confession.widget.FloatTouchWindowConstraintLayout.InterfaceC13013b
        /* JADX INFO: renamed from: a */
        public void mo78060a(boolean isScrollUp) {
            if (isScrollUp) {
                qt5.this.m176398g();
            }
        }
    }

    public qt5(@NotNull InterfaceC19574b interfaceC19574b) {
        interfaceC19574b.getClass();
        this.managerListener = interfaceC19574b;
    }

    /* JADX INFO: renamed from: a */
    public static void m176390a(qt5 qt5Var, C4319c c4319c) {
        qt5Var.m176400j();
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m176393d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m176394e(C4319c c4319c) {
        return Boolean.valueOf(Intrinsics.m87488d(c4319c, C4319c.f15550k));
    }

    /* JADX INFO: renamed from: i */
    public static final void m176395i(PopupWindow popupWindow, qt5 qt5Var) {
        popupWindow.dismiss();
        qt5Var.isPopupWindowHiding = false;
        qt5Var.managerListener.mo118004a();
        qt5Var.isShowingPopUpWindow = false;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m176396p(qt5 qt5Var, View view) {
        view.getClass();
        qt5Var.managerListener.mo118006c();
        qt5Var.m176398g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m176397f() {
        m176400j();
        this.popupWindow = null;
        this.popupContentView = null;
        this.matchButton = null;
        this.isShowingPopUpWindow = false;
        this.isPopupWindowHiding = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m176398g() {
        if (this.isPopupWindowHiding) {
            return;
        }
        this.isPopupWindowHiding = true;
        m176399h();
    }

    /* JADX INFO: renamed from: h */
    public final void m176399h() {
        final PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(popupWindow.getContentView(), (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -popupWindow.getContentView().getHeight());
            objectAnimatorOfFloat.setDuration(400L);
            objectAnimatorOfFloat.start();
            bt0.m103733f(objectAnimatorOfFloat, new Runnable() { // from class: l.pt5
                @Override // java.lang.Runnable
                public final void run() {
                    qt5.m176395i(popupWindow, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m176400j() {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.isPopupWindowHiding = false;
        }
        c4g0 c4g0Var = this.activitySub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsShowingPopUpWindow() {
        return this.isShowingPopUpWindow;
    }

    /* JADX INFO: renamed from: l */
    public final String m176402l(String json) {
        LangModel langModelM155408K = mmj.m155408K(json);
        return langModelM155408K != null ? langModelM155408K.getLocalName() : "";
    }

    /* JADX INFO: renamed from: m */
    public final void m176403m() {
        View viewInflate = LayoutInflater.from(ypv.f199497e).inflate(t6c0.f168329e5, (ViewGroup) null, false);
        viewInflate.getClass();
        FloatTouchWindowConstraintLayout floatTouchWindowConstraintLayout = (FloatTouchWindowConstraintLayout) viewInflate;
        this.popupContentView = floatTouchWindowConstraintLayout;
        if (floatTouchWindowConstraintLayout != null) {
            floatTouchWindowConstraintLayout.setFloatTouchWindowListener(new C19575c());
            uep0.m193326m(floatTouchWindowConstraintLayout.findViewById(g5c0.f101001n0), t100.m186890d(2.0f));
        }
        PopupWindow popupWindow = new PopupWindow(ypv.f199497e);
        popupWindow.setContentView(this.popupContentView);
        popupWindow.setWidth(t100.m186890d(375.0f));
        popupWindow.setHeight(t100.m186890d(210.0f));
        popupWindow.setOutsideTouchable(false);
        popupWindow.setBackgroundDrawable(ypv.f199497e.getDrawable(i3c0.f111029h7));
        this.popupWindow = popupWindow;
    }

    /* JADX INFO: renamed from: n */
    public final void m176404n(LongLinkConfession.ConfessionGiftReceiveMsg message, Act activity) {
        if (this.popupWindow == null || this.popupContentView == null) {
            m176403m();
        }
        C22306c<C4319c> c22306cLifecycle = activity.lifecycle();
        final Function1 function1 = new Function1() { // from class: l.lt5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qt5.m176394e((C4319c) obj);
            }
        };
        this.activitySub = c22306cLifecycle.filter(new w9j() { // from class: l.mt5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qt5.m176393d(function1, obj);
            }
        }).take(1).subscribe(ffw.m121197h(new e30() { // from class: l.nt5
            @Override // p149l.e30
            public final void call(Object obj) {
                qt5.m176390a(this.f140432a, (C4319c) obj);
            }
        }));
        FloatTouchWindowConstraintLayout floatTouchWindowConstraintLayout = this.popupContentView;
        floatTouchWindowConstraintLayout.getClass();
        m176405o(floatTouchWindowConstraintLayout, message);
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.showAtLocation(activity.getWindow().getDecorView(), 48, 0, t100.f167264m);
            m176408s();
            this.isShowingPopUpWindow = true;
            this.managerListener.mo118005b();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m176405o(View popupHelpView, LongLinkConfession.ConfessionGiftReceiveMsg message) {
        ((VText) popupHelpView.findViewById(g5c0.f100815T5)).setText(m176402l(message.getSlogan()));
        ((VText) popupHelpView.findViewById(g5c0.f100856Y1)).setText(w8u.m202218u(R$string.f47313j2, Long.valueOf(message.getGift().getPrice())));
        ((VText) popupHelpView.findViewById(g5c0.f100808S7)).setText(message.getUser().getName());
        VButton vButton = (VButton) popupHelpView.findViewById(g5c0.f100804S3);
        this.matchButton = vButton;
        if (vButton != null) {
            vButton.setText(w8u.m202218u(R$string.f47357l2, Long.valueOf(message.getShowTime())));
            cxq.m109105c(vButton, new Function1() { // from class: l.ot5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qt5.m176396p(this.f145546a, (View) obj);
                }
            });
        }
        VDraweeView vDraweeView = (VDraweeView) popupHelpView.findViewById(g5c0.f100915e2);
        GradientDrawable gradientDrawableM213884i = yb2.m213884i(0, 0);
        gradientDrawableM213884i.setColor(kvc0.m147352a(h1c0.f105333S0));
        vDraweeView.setBackground(gradientDrawableM213884i);
        hxs.m133406s("context_livingAct", vDraweeView, message.getGift().getIcon());
        uep0.m193326m(vDraweeView, t100.m186890d(12.0f));
    }

    /* JADX INFO: renamed from: q */
    public final void m176406q(int tipText) {
        if (tipText <= 0) {
            m176398g();
            return;
        }
        VButton vButton = this.matchButton;
        if (vButton != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM202218u = w8u.m202218u(R$string.f47357l2, Integer.valueOf(tipText));
            strM202218u.getClass();
            vButton.setText(String.format(strM202218u, Arrays.copyOf(new Object[0], 0)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m176407r(@NotNull LongLinkConfession.ConfessionGiftReceiveMsg message) {
        Act act;
        message.getClass();
        if (Act.foreground_() != null) {
            Activity activity = Act.foreground_().f15343a.get();
            activity.getClass();
            act = (Act) activity;
        } else {
            act = null;
        }
        if (act == null) {
            this.managerListener.mo118007d("open popup window fail. Reason is : Act.foreground_() act is null.");
            return;
        }
        c4g0 c4g0Var = this.activitySub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        m176404n(message, act);
    }

    /* JADX INFO: renamed from: s */
    public final void m176408s() {
        FloatTouchWindowConstraintLayout floatTouchWindowConstraintLayout;
        if (this.popupWindow == null || (floatTouchWindowConstraintLayout = this.popupContentView) == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatTouchWindowConstraintLayout, (Property<FloatTouchWindowConstraintLayout, Float>) View.TRANSLATION_Y, -t100.m186890d(210.0f), 0.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.start();
    }
}
