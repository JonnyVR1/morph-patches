package p153l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserPeiLiaoView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-¨\u00061"}, m88121d2 = {"Ll/u6c0;", "Ll/fqe0;", "Ll/g3m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "peiLiaoUser", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "", "K", "(Lcom/p1/mobile/android/app/Act;)V", "L", "()V", "", "isShow", "M", "(Z)V", "", "p", "()Ljava/lang/String;", "o", "", "j", "()I", "m", "()Lcom/p1/mobile/android/app/Act;", "breakAction", "n", "show", "f", "A", "J", "getPriority", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/data/User;", "Landroid/widget/PopupWindow;", "k", "Landroid/widget/PopupWindow;", "popupWindow", "Ll/kcg0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/kcg0;", "subscription", "Ljava/lang/String;", "bubbleId", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class u6c0 extends fqe0 implements g3m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Map<String, u6c0> f177745n = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final User peiLiaoUser;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public PopupWindow popupWindow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public kcg0 subscription;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String bubbleId;

    public u6c0(Act act, User user) {
        this.act = act;
        this.peiLiaoUser = user;
        this.bubbleId = "pei_pei" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: B */
    public static void m194660B(u6c0 u6c0Var) {
        u6c0Var.m194669J();
        Act act = u6c0Var.act;
        String str = u6c0Var.peiLiaoUser.f56859id;
        str.getClass();
        ar50.m99652g(act, str);
        String str2 = u6c0Var.peiLiaoUser.f56859id;
        str2.getClass();
        ar50.m99656k(str2);
    }

    /* JADX INFO: renamed from: C */
    public static void m194661C(u6c0 u6c0Var, TabName tabName) {
        tabName.getClass();
        u6c0Var.m194667M(tabName == TabName.Msg);
    }

    /* JADX INFO: renamed from: F */
    public static void m194662F(u6c0 u6c0Var) {
        u6c0Var.m194669J();
        String str = u6c0Var.peiLiaoUser.f56859id;
        str.getClass();
        ar50.m99653h(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: I */
    public static final void m194664I(@NotNull String str) {
        INSTANCE.m194670a(str);
    }

    /* JADX INFO: renamed from: K */
    private final void m194665K(Act act) {
        if (C4522a.m22099p().m22107I()) {
            return;
        }
        this.subscription = ji30.m144967k().distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.t6c0
            @Override // p153l.y20
            public final void call(Object obj) {
                u6c0.m194661C(this.f172324a, (TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    private final void m194666L() {
        View viewFindViewById = this.act.findViewById(R.id.content);
        if (this.act.isFinishing() || this.act.isDestroyed()) {
            return;
        }
        PopupWindow popupWindow = this.popupWindow;
        popupWindow.getClass();
        if (popupWindow.isShowing() || !NullChecker.m82486a(viewFindViewById.getWindowToken())) {
            return;
        }
        PopupWindow popupWindow2 = this.popupWindow;
        popupWindow2.getClass();
        popupWindow2.showAtLocation(viewFindViewById, 49, 0, -qa00.f156330q);
    }

    /* JADX INFO: renamed from: M */
    private final void m194667M(boolean isShow) {
        if (NullChecker.m82486a(this.popupWindow)) {
            if (isShow) {
                m194666L();
                return;
            }
            PopupWindow popupWindow = this.popupWindow;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: N */
    public static final void m194668N(@NotNull Act act, @NotNull User user) {
        INSTANCE.m194671b(act, user);
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        pcj<Boolean> pcjVar = this.f100279d;
        if ((pcjVar != null && !pcjVar.call().booleanValue()) || this.act.isFinishing()) {
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            return 0;
        }
        View viewInflate = p9r.m171370a(this.act).inflate(kec0.f126036rb, (ViewGroup) null);
        QuickChatAudioNewUiHeaderUserPeiLiaoView quickChatAudioNewUiHeaderUserPeiLiaoView = (QuickChatAudioNewUiHeaderUserPeiLiaoView) viewInflate.findViewById(adc0.f70064P4);
        quickChatAudioNewUiHeaderUserPeiLiaoView.init();
        quickChatAudioNewUiHeaderUserPeiLiaoView.m43080m0(this.peiLiaoUser, new x20() { // from class: l.r6c0
            @Override // p153l.x20
            public final void call() {
                u6c0.m194660B(this.f161463a);
            }
        }, new x20() { // from class: l.s6c0
            @Override // p153l.x20
            public final void call() {
                u6c0.m194662F(this.f166559a);
            }
        });
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.popupWindow = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            popupWindow2.setAnimationStyle(agc0.f71110D);
        }
        m194666L();
        String str = this.peiLiaoUser.f56859id;
        str.getClass();
        ar50.m99657l(str);
        m194665K(this.act);
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: J */
    public final void m194669J() {
        if (NullChecker.m82486a(this.popupWindow)) {
            PopupWindow popupWindow = this.popupWindow;
            popupWindow.getClass();
            popupWindow.dismiss();
            this.popupWindow = null;
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            kcg0 kcg0Var = this.subscription;
            if (kcg0Var != null) {
                kcg0Var.unsubscribe();
            }
            this.subscription = null;
            f177745n.remove(this.peiLiaoUser.f56859id);
            CoreModule.f18264c.f20405m0.m31985B8(this.peiLiaoUser.f56859id);
        }
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean show) {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.getClass();
            if (popupWindow.isShowing()) {
                PopupWindow popupWindow2 = this.popupWindow;
                if (show) {
                    popupWindow2.getClass();
                    popupWindow2.getContentView().setTranslationY(0.0f);
                    PopupWindow popupWindow3 = this.popupWindow;
                    popupWindow3.getClass();
                    popupWindow3.getContentView().setAlpha(1.0f);
                    return;
                }
                popupWindow2.getClass();
                popupWindow2.getContentView().setTranslationY(-4000.0f);
                PopupWindow popupWindow4 = this.popupWindow;
                popupWindow4.getClass();
                popupWindow4.getContentView().setAlpha(0.0f);
            }
        }
    }

    @Override // p153l.g3m
    public int getPriority() {
        return 4;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.act.hashCode();
    }

    @Override // p153l.f3m
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public Act getAct() {
        return this.act;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean breakAction) {
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            popupWindow.getClass();
            if (popupWindow.isShowing()) {
                PopupWindow popupWindow2 = this.popupWindow;
                popupWindow2.getClass();
                popupWindow2.dismiss();
                return;
            }
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    @Override // p153l.jlb0
    @NotNull
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return u6c0.class.getName();
    }

    @Override // p153l.jlb0
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public String getBubbleId() {
        return this.bubbleId;
    }

    /* JADX INFO: renamed from: l.u6c0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/u6c0$a;", "", "<init>", "()V", "", "userId", "", "a", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "ctx", "Lcom/p1/mobile/putong/data/User;", "peiLiaoUser", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "", "Ll/u6c0;", "quickPeiLiaoChatBubbles", "Ljava/util/Map;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m194670a(@NotNull String userId) {
            userId.getClass();
            u6c0 u6c0Var = (u6c0) u6c0.f177745n.get(userId);
            if (u6c0Var != null) {
                u6c0Var.m194669J();
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m194671b(@NotNull Act ctx, @NotNull User peiLiaoUser) {
            ctx.getClass();
            peiLiaoUser.getClass();
            if (((u6c0) u6c0.f177745n.get(peiLiaoUser.f56859id)) == null) {
                u6c0 u6c0Var = new u6c0(ctx, peiLiaoUser, null);
                u6c0Var.m126746y(40001);
                llb0.m154703c().m154710i(u6c0Var);
                u6c0.f177745n.put(peiLiaoUser.f56859id, u6c0Var);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ u6c0(Act act, User user, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, user);
    }
}
