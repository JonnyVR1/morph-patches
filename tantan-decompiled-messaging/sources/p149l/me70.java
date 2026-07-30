package p149l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.PicksItemView;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010$\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020!¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006G"}, m87232d2 = {"Ll/me70;", "Ll/jq2;", "Ll/ue70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "viewModel", "i0", "(Ll/ue70;)V", "Z", "a0", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "", "liked", "superLike", j6f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/core/data/PicksUser;ZZ)V", "hadSentSuperLiked", "likedUser", "Lcom/p1/mobile/putong/data/User;", "user", "fromButton", "o0", "(ZLcom/p1/mobile/putong/core/data/PicksUser;Lcom/p1/mobile/putong/data/User;Z)Z", MatchFrom.superLiked, "", "picIndex", "", "picUrl", "letter", "n0", "(ZZZILjava/lang/String;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)Z", "c", "(Z)V", "from", "s0", "(Ljava/lang/String;)V", "n", "()Z", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "a", "Lkotlin/Lazy;", "m0", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "touchHelperCallback", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "b", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "j0", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "p0", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;)V", "clickedItem", "Lcom/p1/mobile/putong/core/data/PicksUser;", "k0", "()Lcom/p1/mobile/putong/core/data/PicksUser;", "q0", "(Lcom/p1/mobile/putong/core/data/PicksUser;)V", Constants.INAPP_DATA_TAG, "I", "l0", "()I", "r0", "(I)V", "swipeCount", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class me70 extends jq2<ue70> implements C8970b.a {

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
    public me70(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.touchHelperCallback = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ie70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return me70.m154152h0(this.f112712a);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public static void m154149e0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: f0 */
    public static void m154150f0(me70 me70Var, q860 q860Var) {
        if ((q860Var != null ? q860Var.f153135a : null) != null) {
            ue70 ue70Var = (ue70) me70Var.viewModel;
            List<T> list = q860Var.f153135a;
            list.getClass();
            ue70Var.m193238u(list);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m154151g0(me70 me70Var) {
        if (((ue70) me70Var.viewModel).m193237s() == PicksHelper.HeaderType.EXPAND) {
            PicksHelper.INSTANCE.m56740b().getExpandViewShow().put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static C8970b m154152h0(me70 me70Var) {
        return new C8970b(me70Var);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b.a
    /* JADX INFO: renamed from: S */
    public void mo56791S(@NotNull PicksUser clickedUser, boolean liked, boolean superLike) {
        clickedUser.getClass();
        m154161q0(clickedUser);
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(clickedUser.f20468id);
        if (liked) {
            userM169430Pa.getClass();
            if (m154159o0(false, clickedUser, userM169430Pa, false)) {
                return;
            }
            ((ue70) this.viewModel).m193232l().notifyDataSetChanged();
            return;
        }
        String str = userM169430Pa.picture(0).cover().profileMiddle().formatted();
        str.getClass();
        m154158n0(false, false, false, 0, str, userM169430Pa, null);
        ((ue70) this.viewModel).m193232l().notifyDataSetChanged();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19658k1.m184462A3();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.je70
            @Override // p149l.e30
            public final void call(Object obj) {
                me70.m154149e0((Bundle) obj);
            }
        }, new d30() { // from class: l.ke70
            @Override // p149l.d30
            public final void call() {
                me70.m154151g0(this.f122681a);
            }
        });
        duringCreated(CoreModule.f17545c.f19658k1.m184465E3()).compose(mkd0.m154963O(((ue70) this.viewModel).getHeaderView())).subscribe(mkd0.m154955G(new e30() { // from class: l.le70
            @Override // p149l.e30
            public final void call(Object obj) {
                me70.m154150f0(this.f127655a, (q860) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b.a
    /* JADX INFO: renamed from: c */
    public void mo56792c(boolean liked) {
        ((ue70) this.viewModel).m193232l().notifyDataSetChanged();
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(@Nullable ue70 viewModel) {
        super.mo51532C(viewModel);
    }

    @Nullable
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final PicksItemView getClickedItem() {
        return this.clickedItem;
    }

    @NotNull
    /* JADX INFO: renamed from: k0 */
    public final PicksUser m154155k0() {
        PicksUser picksUser = this.clickedUser;
        if (picksUser != null) {
            return picksUser;
        }
        Intrinsics.m87502r("clickedUser");
        return null;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final int getSwipeCount() {
        return this.swipeCount;
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final C8970b m154157m0() {
        return (C8970b) this.touchHelperCallback.getValue();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.picks.act.C8970b.a
    /* JADX INFO: renamed from: n */
    public boolean mo56793n() {
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m154158n0(boolean liked, boolean superLiked, boolean fromButton, int picIndex, @NotNull String picUrl, @NotNull User user, @Nullable String letter) {
        picUrl.getClass();
        user.getClass();
        return CoreMemberModule.m36001F().m132651b().mo35998vk(liked, superLiked, fromButton, picIndex, picUrl, user, letter, act(), (ue70) this.viewModel, m154155k0(), this);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m154159o0(boolean hadSentSuperLiked, @NotNull PicksUser likedUser, @NotNull User user, boolean fromButton) {
        likedUser.getClass();
        user.getClass();
        m154161q0(likedUser);
        String str = user.picture(0).cover().url;
        str.getClass();
        return m154158n0(true, hadSentSuperLiked, fromButton, 0, str, user, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m154160p0(@Nullable PicksItemView picksItemView) {
        this.clickedItem = picksItemView;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m154161q0(@NotNull PicksUser picksUser) {
        picksUser.getClass();
        this.clickedUser = picksUser;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m154162r0(int i) {
        this.swipeCount = i;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m154163s0(@NotNull String from) {
        from.getClass();
        CoreMemberModule.m36001F().m132651b().mo35980X8(from, act());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
