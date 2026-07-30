package p149l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserPeiLiaoView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-¨\u00061"}, m87232d2 = {"Ll/qyb0;", "Ll/aie0;", "Ll/m0m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "peiLiaoUser", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "", "K", "(Lcom/p1/mobile/android/app/Act;)V", "L", "()V", "", "isShow", "M", "(Z)V", "", "p", "()Ljava/lang/String;", "o", "", "j", "()I", "m", "()Lcom/p1/mobile/android/app/Act;", "breakAction", "n", "show", "f", "A", "J", "getPriority", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/data/User;", "Landroid/widget/PopupWindow;", "k", "Landroid/widget/PopupWindow;", "popupWindow", "Ll/c4g0;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/c4g0;", "subscription", "Ljava/lang/String;", "bubbleId", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qyb0 extends aie0 implements m0m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Map<String, qyb0> f156911n = new LinkedHashMap();

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
    public c4g0 subscription;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String bubbleId;

    public qyb0(Act act, User user) {
        this.act = act;
        this.peiLiaoUser = user;
        this.bubbleId = "pei_pei" + System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: B */
    public static void m177027B(qyb0 qyb0Var) {
        qyb0Var.m177036J();
        Act act = qyb0Var.act;
        String str = qyb0Var.peiLiaoUser.f56011id;
        str.getClass();
        ui50.m193861g(act, str);
        String str2 = qyb0Var.peiLiaoUser.f56011id;
        str2.getClass();
        ui50.m193865k(str2);
    }

    /* JADX INFO: renamed from: C */
    public static void m177028C(qyb0 qyb0Var, TabName tabName) {
        tabName.getClass();
        qyb0Var.m177034M(tabName == TabName.Msg);
    }

    /* JADX INFO: renamed from: F */
    public static void m177029F(qyb0 qyb0Var) {
        qyb0Var.m177036J();
        String str = qyb0Var.peiLiaoUser.f56011id;
        str.getClass();
        ui50.m193862h(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: I */
    public static final void m177031I(@NotNull String str) {
        INSTANCE.m177037a(str);
    }

    /* JADX INFO: renamed from: K */
    private final void m177032K(Act act) {
        if (C4371a.m21100p().m21108I()) {
            return;
        }
        this.subscription = v930.m197537k().distinctUntilChanged().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.pyb0
            @Override // p149l.e30
            public final void call(Object obj) {
                qyb0.m177028C(this.f151840a, (TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    private final void m177033L() {
        View viewFindViewById = this.act.findViewById(R.id.content);
        if (this.act.isFinishing() || this.act.isDestroyed()) {
            return;
        }
        PopupWindow popupWindow = this.popupWindow;
        popupWindow.getClass();
        if (popupWindow.isShowing() || !NullChecker.m81303a(viewFindViewById.getWindowToken())) {
            return;
        }
        PopupWindow popupWindow2 = this.popupWindow;
        popupWindow2.getClass();
        popupWindow2.showAtLocation(viewFindViewById, 49, 0, -t100.f167268q);
    }

    /* JADX INFO: renamed from: M */
    private final void m177034M(boolean isShow) {
        if (NullChecker.m81303a(this.popupWindow)) {
            if (isShow) {
                m177033L();
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
    public static final void m177035N(@NotNull Act act, @NotNull User user) {
        INSTANCE.m177038b(act, user);
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        v9j<Boolean> v9jVar = this.f69975d;
        if ((v9jVar != null && !v9jVar.call().booleanValue()) || this.act.isFinishing()) {
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            return 0;
        }
        View viewInflate = o7r.m163037a(this.act).inflate(f6c0.f95863kb, (ViewGroup) null);
        QuickChatAudioNewUiHeaderUserPeiLiaoView quickChatAudioNewUiHeaderUserPeiLiaoView = (QuickChatAudioNewUiHeaderUserPeiLiaoView) viewInflate.findViewById(u4c0.f173942N4);
        quickChatAudioNewUiHeaderUserPeiLiaoView.init();
        quickChatAudioNewUiHeaderUserPeiLiaoView.m42069m0(this.peiLiaoUser, new d30() { // from class: l.nyb0
            @Override // p149l.d30
            public final void call() {
                qyb0.m177027B(this.f141096a);
            }
        }, new d30() { // from class: l.oyb0
            @Override // p149l.d30
            public final void call() {
                qyb0.m177029F(this.f146313a);
            }
        });
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.popupWindow = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            popupWindow2.setAnimationStyle(v7c0.f180349D);
        }
        m177033L();
        String str = this.peiLiaoUser.f56011id;
        str.getClass();
        ui50.m193866l(str);
        m177032K(this.act);
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: J */
    public final void m177036J() {
        if (NullChecker.m81303a(this.popupWindow)) {
            PopupWindow popupWindow = this.popupWindow;
            popupWindow.getClass();
            popupWindow.dismiss();
            this.popupWindow = null;
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            c4g0 c4g0Var = this.subscription;
            if (c4g0Var != null) {
                c4g0Var.unsubscribe();
            }
            this.subscription = null;
            f156911n.remove(this.peiLiaoUser.f56011id);
            CoreModule.f17545c.f19663m0.m30982B8(this.peiLiaoUser.f56011id);
        }
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean show) {
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

    @Override // p149l.m0m
    public int getPriority() {
        return 4;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.act.hashCode();
    }

    @Override // p149l.l0m
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public Act getAct() {
        return this.act;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean breakAction) {
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
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    @Override // p149l.fdb0
    @NotNull
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return qyb0.class.getName();
    }

    @Override // p149l.fdb0
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public String getBubbleId() {
        return this.bubbleId;
    }

    /* JADX INFO: renamed from: l.qyb0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/qyb0$a;", "", "<init>", "()V", "", "userId", "", "a", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "ctx", "Lcom/p1/mobile/putong/data/User;", "peiLiaoUser", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "", "Ll/qyb0;", "quickPeiLiaoChatBubbles", "Ljava/util/Map;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m177037a(@NotNull String userId) {
            userId.getClass();
            qyb0 qyb0Var = (qyb0) qyb0.f156911n.get(userId);
            if (qyb0Var != null) {
                qyb0Var.m177036J();
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m177038b(@NotNull Act ctx, @NotNull User peiLiaoUser) {
            ctx.getClass();
            peiLiaoUser.getClass();
            if (((qyb0) qyb0.f156911n.get(peiLiaoUser.f56011id)) == null) {
                qyb0 qyb0Var = new qyb0(ctx, peiLiaoUser, null);
                qyb0Var.m96809y(40001);
                hdb0.m130575c().m130582i(qyb0Var);
                qyb0.f156911n.put(peiLiaoUser.f56011id, qyb0Var);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ qyb0(Act act, User user, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, user);
    }
}
