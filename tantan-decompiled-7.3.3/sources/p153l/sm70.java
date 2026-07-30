package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicksUser;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.PicksHelper;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.PicksItemView;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020!¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006G"}, m88121d2 = {"Ll/sm70;", "Ll/ar2;", "Ll/an70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "viewModel", "i0", "(Ll/an70;)V", "Z", "a0", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "", "liked", "superLike", p7f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/PicksUser;ZZ)V", "hadSentSuperLiked", "likedUser", "Lcom/p1/mobile/putong/data/User;", "user", "fromButton", "o0", "(ZLcom/p1/mobile/putong/core/data/PicksUser;Lcom/p1/mobile/putong/data/User;Z)Z", MatchFrom.superLiked, "", "picIndex", "", "picUrl", "letter", "n0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)Z", "c", "(Z)V", "from", "s0", "(Ljava/lang/String;)V", "n", "()Z", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "a", "Lkotlin/Lazy;", "m0", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "touchHelperCallback", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "b", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "j0", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "p0", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;)V", "clickedItem", "Lcom/p1/mobile/putong/core/data/PicksUser;", "k0", "()Lcom/p1/mobile/putong/core/data/PicksUser;", "q0", "(Lcom/p1/mobile/putong/core/data/PicksUser;)V", Constants.INAPP_DATA_TAG, "I", "l0", "()I", "r0", "(I)V", "swipeCount", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class sm70 extends ar2<an70> implements C9133b.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy touchHelperCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public PicksItemView clickedItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public PicksUser clickedUser;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int swipeCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm70(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.touchHelperCallback = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.om70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sm70.m186763h0(this.f147901a);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static void m186760e0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f0 */
    public static void m186761f0(sm70 sm70Var, vg60 vg60Var) {
        if ((vg60Var != null ? vg60Var.f184001a : null) != null) {
            an70 an70Var = (an70) sm70Var.viewModel;
            List<T> list = vg60Var.f184001a;
            list.getClass();
            an70Var.m98951u(list);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m186762g0(sm70 sm70Var) {
        if (((an70) sm70Var.viewModel).m98950s() == PicksHelper.HeaderType.EXPAND) {
            PicksHelper.INSTANCE.m57923b().getExpandViewShow().put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static C9133b m186763h0(sm70 sm70Var) {
        return new C9133b(sm70Var);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b.a
    /* JADX INFO: renamed from: S */
    public void mo57974S(@NotNull PicksUser clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m186772q0(clickedUser);
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(clickedUser.f21210id);
        if (liked) {
            userM116503Pa.getClass();
            if (m186770o0(false, clickedUser, userM116503Pa, false)) {
                return;
            }
            ((an70) this.viewModel).m98945l().notifyDataSetChanged();
            return;
        }
        String str = userM116503Pa.picture(0).cover().profileMiddle().formatted();
        str.getClass();
        m186769n0(false, false, false, 0, str, userM116503Pa, null);
        ((an70) this.viewModel).m98945l().notifyDataSetChanged();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20400k1.m121123A3();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.pm70
            @Override // p153l.y20
            public final void call(Object obj) {
                sm70.m186760e0((Bundle) obj);
            }
        }, new x20() { // from class: l.qm70
            @Override // p153l.x20
            public final void call() {
                sm70.m186762g0(this.f158303a);
            }
        });
        duringCreated(CoreModule.f18264c.f20400k1.m121126E3()).compose(psd0.m173604O(((an70) this.viewModel).getHeaderView())).subscribe(psd0.m173596G(new y20() { // from class: l.rm70
            @Override // p153l.y20
            public final void call(Object obj) {
                sm70.m186761f0(this.f163831a, (vg60) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b.a
    /* JADX INFO: renamed from: c */
    public void mo57975c(boolean liked) {
        ((an70) this.viewModel).m98945l().notifyDataSetChanged();
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(@Nullable an70 viewModel) {
        super.mo52715C(viewModel);
    }

    @Nullable
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final PicksItemView getClickedItem() {
        return this.clickedItem;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final PicksUser m186766k0() {
        PicksUser picksUser = this.clickedUser;
        if (picksUser != null) {
            return picksUser;
        }
        Intrinsics.m88391r("clickedUser");
        return null;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final int getSwipeCount() {
        return this.swipeCount;
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final C9133b m186768m0() {
        return (C9133b) this.touchHelperCallback.getValue();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.picks.act.C9133b.a
    /* JADX INFO: renamed from: n */
    public boolean mo57976n() {
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m186769n0(boolean liked, boolean superLiked, boolean fromButton, int picIndex, @NotNull String picUrl, @NotNull User user, @Nullable String letter) {
        picUrl.getClass();
        user.getClass();
        return CoreMemberModule.m37004F().m187693b().mo37001vk(liked, superLiked, fromButton, picIndex, picUrl, user, letter, act(), (an70) this.viewModel, m186766k0(), this);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m186770o0(boolean hadSentSuperLiked, @NotNull PicksUser likedUser, @NotNull User user, boolean fromButton) {
        likedUser.getClass();
        user.getClass();
        m186772q0(likedUser);
        String str = user.picture(0).cover().url;
        str.getClass();
        return m186769n0(true, hadSentSuperLiked, fromButton, 0, str, user, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m186771p0(@Nullable PicksItemView picksItemView) {
        this.clickedItem = picksItemView;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m186772q0(@NotNull PicksUser picksUser) {
        picksUser.getClass();
        this.clickedUser = picksUser;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m186773r0(int i) {
        this.swipeCount = i;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m186774s0(@NotNull String from) {
        from.getClass();
        CoreMemberModule.m37004F().m187693b().mo36983X8(from, act());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
