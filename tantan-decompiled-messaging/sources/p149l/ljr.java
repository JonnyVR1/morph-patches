package p149l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.mytab.LikersMyTabFrag;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010#¢\u0006\u0004\b0\u0010)J\u0017\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010,¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0007R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u001cR\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0017R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR*\u0010X\u001a\n Q*\u0004\u0018\u00010P0P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, m87232d2 = {"Ll/ljr;", "Ll/jq2;", "Ll/mjr;", "Ll/ptl;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "", "liked", "superliked", "fromButton", "isQuickGreeting", "", "picIndex", "", "picUrl", "s0", "(ZZZZILjava/lang/String;)Z", "", "a0", "()V", "destroy", "Z", "t0", "Lcom/p1/mobile/putong/data/Links;", "links", "u0", "(Lcom/p1/mobile/putong/data/Links;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "x0", "(IILandroid/content/Intent;)Z", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "y0", "L", "(Lcom/p1/mobile/putong/data/User;)V", "k", "()Lcom/p1/mobile/putong/data/User;", "Landroid/view/ViewGroup;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroid/view/ViewGroup;", "user", "A0", "clickItem", "z0", "(Landroid/view/ViewGroup;)V", "getFrom", "()Ljava/lang/String;", "seeCount", "J", "(I)V", BLiveStormDanmakuGiftResourceType.f44444l, "()I", "P", "(I)Ljava/lang/String;", "a", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "b", "Lcom/p1/mobile/putong/data/Links;", "r0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "c", "I", Constants.INAPP_DATA_TAG, "couldLoadMore", "e", "Lcom/p1/mobile/putong/data/User;", "f", "Landroid/view/ViewGroup;", "clickedItem", "", "kotlin.jvm.PlatformType", "g", "Ljava/lang/Long;", "q0", "()Ljava/lang/Long;", "setLastReadTime", "(Ljava/lang/Long;)V", "lastReadTime", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ljr extends jq2<mjr> implements ptl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public LikersMyTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Links links;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int seeCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean couldLoadMore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public User clickedUser;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ViewGroup clickedItem;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public Long lastReadTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljr(@NotNull LikersMyTabFrag likersMyTabFrag) {
        super(likersMyTabFrag);
        likersMyTabFrag.getClass();
        this.frag = likersMyTabFrag;
        this.lastReadTime = CoreModule.f17545c.f19687u0.f19254k0.get();
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m150015e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m150016f0(C4319c c4319c) {
        c4319c.getClass();
        return Boolean.valueOf(c4319c == C4319c.f15548i);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m150017g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m150018h0(ljr ljrVar, int i, Intent intent, C4319c c4319c) {
        List<Media> list;
        Media media;
        if (NullChecker.m81303a(ljrVar.clickedItem) && NullChecker.m81303a(ljrVar.clickedUser)) {
            ViewGroup viewGroup = ljrVar.clickedItem;
            int intExtra = 0;
            if (viewGroup != null) {
                viewGroup.setClickable(false);
            }
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            User user = ljrVar.clickedUser;
            String stringExtra = (user == null || (list = user.pictures) == null || (media = list.get(0)) == null) ? null : media.url;
            if (intent != null) {
                intExtra = intent.getIntExtra("currentImageIndex", 0);
                stringExtra = intent.getStringExtra("currentImageUrl");
            }
            int i2 = intExtra;
            if (stringExtra == null) {
                stringExtra = "";
            }
            ljrVar.m150027s0(z, z2, true, false, i2, stringExtra);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m150019i0(ljr ljrVar, String str) {
        ljrVar.m150032t0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m150020j0(ljr ljrVar, Bundle bundle) {
        ((mjr) ljrVar.viewModel).m154909r();
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m150021k0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m150022l0(ljr ljrVar, NetworkInfo networkInfo) {
        ljrVar.m150032t0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m150023m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static Boolean m150024n0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m150025o0(ljr ljrVar, q860 q860Var) {
        Links links;
        DbLinks dbLinks;
        if (q860Var == null || (dbLinks = q860Var.f153136b) == null || (links = dbLinks.links) == null) {
            links = null;
        }
        ljrVar.links = links;
        int iM173344d = q860Var != null ? q860Var.m173344d() : 0;
        ljrVar.seeCount = iM173344d;
        if (iM173344d > 0) {
            ljrVar.couldLoadMore = true;
        }
        ((mjr) ljrVar.viewModel).m154908j(q860Var);
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m150026p0(String str) {
        str.getClass();
        return Boolean.valueOf(Intrinsics.m87488d("all", str) || Intrinsics.m87488d("see", str));
    }

    /* JADX INFO: renamed from: s0 */
    private final boolean m150027s0(boolean liked, boolean superliked, boolean fromButton, boolean isQuickGreeting, int picIndex, String picUrl) {
        return CoreMemberModule.m36001F().m132651b().mo35988fe(liked, superliked, fromButton, isQuickGreeting, picIndex, picUrl, this, (qtl) this.viewModel, this.frag);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m150028A0(@Nullable User user) {
        this.clickedUser = user;
    }

    /* JADX INFO: renamed from: E */
    public final void m150029E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        this.clickedUser = clickedUser;
        String str = clickedUser.pictures.get(0).url;
        str.getClass();
        if (!m150027s0(liked, false, fromButton, false, 0, str)) {
            yir yirVarM56718N4 = this.frag.m56718N4();
            yirVarM56718N4.getClass();
            yirVarM56718N4.notifyDataSetChanged();
        }
        CoreMemberModule.m36001F().m132651b().mo35969An(clickedUser);
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: J */
    public void mo56681J(int seeCount) {
        this.seeCount = seeCount;
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: L */
    public void mo56683L(@Nullable User clickedUser) {
        CoreMemberModule.m36001F().m132651b().mo35992lm(act(), clickedUser, "[摆手]", false, null, null, "QuickGreeting");
    }

    @Override // p149l.ptl
    @NotNull
    /* JADX INFO: renamed from: P */
    public String mo56687P(int seeCount) {
        return "";
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m150032t0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.zir
            @Override // p149l.e30
            public final void call(Object obj) {
                ljr.m150020j0(this.f203351a, (Bundle) obj);
            }
        });
        C22306c c22306cSkip = duringCreated(ConnectivityReceiver.m81290m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.cjr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ljr.m150021k0((NetworkInfo) obj);
            }
        };
        c22306cSkip.filter(new w9j() { // from class: l.djr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ljr.m150015e0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ejr
            @Override // p149l.e30
            public final void call(Object obj) {
                ljr.m150022l0(this.f91777a, (NetworkInfo) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(bzc0.INSTANCE.m104570b().m104567d());
        final Function1 function2 = new Function1() { // from class: l.fjr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ljr.m150026p0((String) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.gjr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ljr.m150024n0(function2, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.hjr
            @Override // p149l.e30
            public final void call(Object obj) {
                ljr.m150019i0(this.f108107a, (String) obj);
            }
        }, new e30() { // from class: l.ijr
            @Override // p149l.e30
            public final void call(Object obj) {
                ljr.m150023m0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19687u0.m30409Q6()).subscribe(mkd0.m154955G(new e30() { // from class: l.jjr
            @Override // p149l.e30
            public final void call(Object obj) {
                ljr.m150025o0(this.f118313a, (q860) obj);
            }
        }));
    }

    @Override // p149l.ptl
    @NotNull
    public String getFrom() {
        return "";
    }

    @Override // p149l.ptl
    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public User getClickedUser() {
        return this.clickedUser;
    }

    @Override // p149l.ptl
    /* JADX INFO: renamed from: l, reason: from getter */
    public int getSeeCount() {
        return this.seeCount;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final Long getLastReadTime() {
        return this.lastReadTime;
    }

    @Nullable
    /* JADX INFO: renamed from: r0, reason: from getter */
    public final Links getLinks() {
        return this.links;
    }

    @Override // p149l.ptl
    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public ViewGroup getClickedItem() {
        return this.clickedItem;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m150032t0() {
        this.lastReadTime = CoreModule.f17545c.f19687u0.f19254k0.get();
        CoreModule.f17545c.f19687u0.m30459n5();
        if (!xma.m210071e4() || CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
            m150033u0(null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m150033u0(@Nullable Links links) {
        if (!xma.m210071e4() || CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
            CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
            Long l2 = this.lastReadTime;
            l2.getClass();
            coreLikers.m30435d7(links, l2.longValue(), 0);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m150034x0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != CoreModule.f17554l.m94651a().mo33299Ck()) {
            if (requestCode != 786) {
                return false;
            }
            CoreMemberModule.m36001F().m132651b().mo35981Yq(resultCode, data, act());
            return true;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.kjr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ljr.m150016f0((C4319c) obj);
            }
        };
        c22306cLifecycle.takeFirst(new w9j() { // from class: l.ajr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ljr.m150017g0(function1, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bjr
            @Override // p149l.e30
            public final void call(Object obj) {
                ljr.m150018h0(this.f75932a, resultCode, data, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m150035y0(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        this.clickedUser = clickedUser;
        String str = clickedUser.pictures.get(0).url;
        str.getClass();
        if (m150027s0(liked, false, false, true, 0, str)) {
            return;
        }
        yir yirVarM56718N4 = this.frag.m56718N4();
        yirVarM56718N4.getClass();
        yirVarM56718N4.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m150036z0(@Nullable ViewGroup clickItem) {
        this.clickedItem = clickItem;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
