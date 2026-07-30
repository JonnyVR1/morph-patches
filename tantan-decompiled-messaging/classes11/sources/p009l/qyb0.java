package p009l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserPeiLiaoView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.aie0;
import l.c4g0;
import l.d30;
import l.e30;
import l.f0m;
import l.f6c0;
import l.fdb0;
import l.hdb0;
import l.m0m;
import l.mkd0;
import l.t100;
import l.u4c0;
import l.ui50;
import l.v7c0;
import l.v930;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\rJ\u000f\u0010!\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-¨\u00061"}, d2 = {"Ll/qyb0;", "Ll/aie0;", "Ll/m0m;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "peiLiaoUser", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "", "K", "(Lcom/p1/mobile/android/app/Act;)V", "L", "()V", "", "isShow", "M", "(Z)V", "", "p", "()Ljava/lang/String;", "o", "", "j", "()I", "m", "()Lcom/p1/mobile/android/app/Act;", "breakAction", "n", "show", "f", "A", "J", "getPriority", "i", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/data/User;", "Landroid/widget/PopupWindow;", "k", "Landroid/widget/PopupWindow;", "popupWindow", "Ll/c4g0;", "l", "Ll/c4g0;", "subscription", "Ljava/lang/String;", "bubbleId", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qyb0 extends aie0 implements m0m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Map<String, qyb0> f19576n = new LinkedHashMap();

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
    public static void m21327B(qyb0 qyb0Var) {
        qyb0Var.m21337J();
        Act act = qyb0Var.act;
        String str = ((DbObject) qyb0Var.peiLiaoUser).id;
        str.getClass();
        ui50.g(act, str);
        String str2 = ((DbObject) qyb0Var.peiLiaoUser).id;
        str2.getClass();
        ui50.k(str2);
    }

    /* JADX INFO: renamed from: C */
    public static void m21328C(qyb0 qyb0Var, TabName tabName) {
        tabName.getClass();
        qyb0Var.m21334M(tabName == TabName.Msg);
    }

    /* JADX INFO: renamed from: F */
    public static void m21329F(qyb0 qyb0Var) {
        qyb0Var.m21337J();
        String str = ((DbObject) qyb0Var.peiLiaoUser).id;
        str.getClass();
        ui50.h(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: I */
    public static final void m21331I(@NotNull String str) {
        INSTANCE.m21344a(str);
    }

    /* JADX INFO: renamed from: K */
    private final void m21332K(Act act) {
        if (a.p().I()) {
            return;
        }
        this.subscription = v930.k().distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.pyb0
            public final void call(Object obj) {
                qyb0.m21328C(this.f18967a, (TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L */
    private final void m21333L() {
        View viewFindViewById = this.act.findViewById(R.id.content);
        if (this.act.isFinishing() || this.act.isDestroyed()) {
            return;
        }
        PopupWindow popupWindow = this.popupWindow;
        popupWindow.getClass();
        if (popupWindow.isShowing() || !NullChecker.a(viewFindViewById.getWindowToken())) {
            return;
        }
        PopupWindow popupWindow2 = this.popupWindow;
        popupWindow2.getClass();
        popupWindow2.showAtLocation(viewFindViewById, 49, 0, -t100.q);
    }

    /* JADX INFO: renamed from: M */
    private final void m21334M(boolean isShow) {
        if (NullChecker.a(this.popupWindow)) {
            if (isShow) {
                m21333L();
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
    public static final void m21335N(@NotNull Act act, @NotNull User user) {
        INSTANCE.m21345b(act, user);
    }

    /* JADX INFO: renamed from: A */
    public int m21336A() {
        v9j v9jVar = ((aie0) this).d;
        if ((v9jVar != null && !((Boolean) v9jVar.call()).booleanValue()) || this.act.isFinishing()) {
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
            return 0;
        }
        View viewInflate = o7r.m19649a(this.act).inflate(f6c0.kb, (ViewGroup) null);
        QuickChatAudioNewUiHeaderUserPeiLiaoView quickChatAudioNewUiHeaderUserPeiLiaoView = (QuickChatAudioNewUiHeaderUserPeiLiaoView) viewInflate.findViewById(u4c0.N4);
        quickChatAudioNewUiHeaderUserPeiLiaoView.init();
        quickChatAudioNewUiHeaderUserPeiLiaoView.m6211m0(this.peiLiaoUser, new d30() { // from class: l.nyb0
            public final void call() {
                qyb0.m21327B(this.f17764a);
            }
        }, new d30() { // from class: l.oyb0
            public final void call() {
                qyb0.m21329F(this.f18297a);
            }
        });
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -2);
        this.popupWindow = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            popupWindow2.setAnimationStyle(v7c0.D);
        }
        m21333L();
        String str = ((DbObject) this.peiLiaoUser).id;
        str.getClass();
        ui50.l(str);
        m21332K(this.act);
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: J */
    public final void m21337J() {
        if (NullChecker.a(this.popupWindow)) {
            PopupWindow popupWindow = this.popupWindow;
            popupWindow.getClass();
            popupWindow.dismiss();
            this.popupWindow = null;
            if (NullChecker.a(((fdb0) this).b)) {
                ((fdb0) this).b.call();
            }
            c4g0 c4g0Var = this.subscription;
            if (c4g0Var != null) {
                c4g0Var.unsubscribe();
            }
            this.subscription = null;
            f19576n.remove(((DbObject) this.peiLiaoUser).id);
            CoreModule.c.m0.B8(((DbObject) this.peiLiaoUser).id);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m21338f(boolean show) {
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

    public int getPriority() {
        return 4;
    }

    /* JADX INFO: renamed from: j */
    public int m21339j() {
        return this.act.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: n */
    public void m21341n(boolean breakAction) {
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
        f0m f0mVar = ((aie0) this).f;
        if (f0mVar != null) {
            f0mVar.a(this);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public String m21342o() {
        return qyb0.class.getName();
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public String getBubbleId() {
        return this.bubbleId;
    }

    /* JADX INFO: renamed from: l.qyb0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll/qyb0$a;", "", "<init>", "()V", "", "userId", "", "a", "(Ljava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "ctx", "Lcom/p1/mobile/putong/data/User;", "peiLiaoUser", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;)V", "", "Ll/qyb0;", "quickPeiLiaoChatBubbles", "Ljava/util/Map;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m21344a(@NotNull String userId) {
            userId.getClass();
            qyb0 qyb0Var = (qyb0) qyb0.f19576n.get(userId);
            if (qyb0Var != null) {
                qyb0Var.m21337J();
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final void m21345b(@NotNull Act ctx, @NotNull User peiLiaoUser) {
            ctx.getClass();
            peiLiaoUser.getClass();
            if (((qyb0) qyb0.f19576n.get(((DbObject) peiLiaoUser).id)) == null) {
                qyb0 qyb0Var = new qyb0(ctx, peiLiaoUser, null);
                qyb0Var.y(40001);
                hdb0.c().i(qyb0Var);
                qyb0.f19576n.put(((DbObject) peiLiaoUser).id, qyb0Var);
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ qyb0(Act act, User user, DefaultConstructorMarker defaultConstructorMarker) {
        this(act, user);
    }
}
