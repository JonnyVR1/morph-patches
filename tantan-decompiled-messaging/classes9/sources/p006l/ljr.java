package p006l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.mytab.LikersMyTabFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.jq2;
import l.mkd0;
import l.q860;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010#¢\u0006\u0004\b0\u0010)J\u0017\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010,¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0007R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u001cR\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0017R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR*\u0010X\u001a\n Q*\u0004\u0018\u00010P0P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Ll/ljr;", "Ll/jq2;", "Ll/mjr;", "Ll/ptl;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "", "liked", "superliked", "fromButton", "isQuickGreeting", "", "picIndex", "", "picUrl", "s0", "(ZZZZILjava/lang/String;)Z", "", "a0", "()V", "destroy", "Z", "t0", "Lcom/p1/mobile/putong/data/Links;", "links", "u0", "(Lcom/p1/mobile/putong/data/Links;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "x0", "(IILandroid/content/Intent;)Z", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "y0", "L", "(Lcom/p1/mobile/putong/data/User;)V", "k", "()Lcom/p1/mobile/putong/data/User;", "Landroid/view/ViewGroup;", "s", "()Landroid/view/ViewGroup;", "user", "A0", "clickItem", "z0", "(Landroid/view/ViewGroup;)V", "getFrom", "()Ljava/lang/String;", "seeCount", "J", "(I)V", "l", "()I", "P", "(I)Ljava/lang/String;", "a", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "b", "Lcom/p1/mobile/putong/data/Links;", "r0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "c", "I", "d", "couldLoadMore", "e", "Lcom/p1/mobile/putong/data/User;", "f", "Landroid/view/ViewGroup;", "clickedItem", "", "kotlin.jvm.PlatformType", "g", "Ljava/lang/Long;", "q0", "()Ljava/lang/Long;", "setLastReadTime", "(Ljava/lang/Long;)V", "lastReadTime", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.lastReadTime = (Long) CoreModule.f1534c.f3676u0.f3243k0.get();
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m18827e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m18828f0(c cVar) {
        cVar.getClass();
        return Boolean.valueOf(cVar == c.i);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m18829g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m18830h0(ljr ljrVar, int i, Intent intent, c cVar) {
        List list;
        Media media;
        if (NullChecker.a(ljrVar.clickedItem) && NullChecker.a(ljrVar.clickedUser)) {
            ViewGroup viewGroup = ljrVar.clickedItem;
            int intExtra = 0;
            if (viewGroup != null) {
                viewGroup.setClickable(false);
            }
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            User user = ljrVar.clickedUser;
            String stringExtra = (user == null || (list = user.pictures) == null || (media = (Media) list.get(0)) == null) ? null : media.url;
            if (intent != null) {
                intExtra = intent.getIntExtra("currentImageIndex", 0);
                stringExtra = intent.getStringExtra("currentImageUrl");
            }
            int i2 = intExtra;
            if (stringExtra == null) {
                stringExtra = "";
            }
            ljrVar.m18839s0(z, z2, true, false, i2, stringExtra);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m18831i0(ljr ljrVar, String str) {
        ljrVar.m18846t0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m18832j0(ljr ljrVar, Bundle bundle) {
        ((mjr) ((jq2) ljrVar).viewModel).m19273r();
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m18833k0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m18834l0(ljr ljrVar, NetworkInfo networkInfo) {
        ljrVar.m18846t0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m18835m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static Boolean m18836n0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m18837o0(ljr ljrVar, q860 q860Var) {
        Links links;
        DbLinks dbLinks;
        if (q860Var == null || (dbLinks = q860Var.b) == null || (links = dbLinks.links) == null) {
            links = null;
        }
        ljrVar.links = links;
        int iD = q860Var != null ? q860Var.d() : 0;
        ljrVar.seeCount = iD;
        if (iD > 0) {
            ljrVar.couldLoadMore = true;
        }
        ((mjr) ((jq2) ljrVar).viewModel).m19272j(q860Var);
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m18838p0(String str) {
        str.getClass();
        return Boolean.valueOf(Intrinsics.d("all", str) || Intrinsics.d("see", str));
    }

    /* JADX INFO: renamed from: s0 */
    private final boolean m18839s0(boolean liked, boolean superliked, boolean fromButton, boolean isQuickGreeting, int picIndex, String picUrl) {
        return CoreMemberModule.F().b().fe(liked, superliked, fromButton, isQuickGreeting, picIndex, picUrl, this, ((jq2) this).viewModel, this.frag);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m18840A0(@Nullable User user) {
        this.clickedUser = user;
    }

    /* JADX INFO: renamed from: E */
    public final void m18841E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        this.clickedUser = clickedUser;
        String str = ((Media) clickedUser.pictures.get(0)).url;
        str.getClass();
        if (!m18839s0(liked, false, fromButton, false, 0, str)) {
            yir yirVarM10177N4 = this.frag.m10177N4();
            yirVarM10177N4.getClass();
            yirVarM10177N4.notifyDataSetChanged();
        }
        CoreMemberModule.F().b().An(clickedUser);
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: J */
    public void mo10138J(int seeCount) {
        this.seeCount = seeCount;
    }

    @Override // p006l.ptl
    /* JADX INFO: renamed from: L */
    public void mo10140L(@Nullable User clickedUser) {
        CoreMemberModule.F().b().lm(act(), clickedUser, "[摆手]", false, (Runnable) null, (Runnable) null, "QuickGreeting");
    }

    @Override // p006l.ptl
    @NotNull
    /* JADX INFO: renamed from: P */
    public String mo10144P(int seeCount) {
        return "";
    }

    /* JADX INFO: renamed from: Z */
    public void m18842Z() {
        super.Z();
        m18846t0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m18843a0() {
        super.a0();
        creates(new e30() { // from class: l.zir
            public final void call(Object obj) {
                ljr.m18832j0(this.f28770a, (Bundle) obj);
            }
        });
        rx.c cVarSkip = duringCreated(ConnectivityReceiver.m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.cjr
            public final Object invoke(Object obj) {
                return ljr.m18833k0((NetworkInfo) obj);
            }
        };
        cVarSkip.filter(new w9j() { // from class: l.djr
            public final Object call(Object obj) {
                return ljr.m18827e0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ejr
            public final void call(Object obj) {
                ljr.m18834l0(this.f11192a, (NetworkInfo) obj);
            }
        }));
        rx.c cVarDuringCreated = duringCreated(bzc0.INSTANCE.m13044b().m13041d());
        final Function1 function2 = new Function1() { // from class: l.fjr
            public final Object invoke(Object obj) {
                return ljr.m18838p0((String) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.gjr
            public final Object call(Object obj) {
                return ljr.m18836n0(function2, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.hjr
            public final void call(Object obj) {
                ljr.m18831i0(this.f13915a, (String) obj);
            }
        }, new e30() { // from class: l.ijr
            public final void call(Object obj) {
                ljr.m18835m0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3676u0.m2337Q6()).subscribe(mkd0.G(new e30() { // from class: l.jjr
            public final void call(Object obj) {
                ljr.m18837o0(this.f15185a, (q860) obj);
            }
        }));
    }

    @Override // p006l.ptl
    @NotNull
    public String getFrom() {
        return "";
    }

    @Override // p006l.ptl
    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public User getClickedUser() {
        return this.clickedUser;
    }

    @Override // p006l.ptl
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

    @Override // p006l.ptl
    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public ViewGroup getClickedItem() {
        return this.clickedItem;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m18846t0() {
        this.lastReadTime = (Long) CoreModule.f1534c.f3676u0.f3243k0.get();
        CoreModule.f1534c.f3676u0.m2387n5();
        if (!xma.m27379e4() || CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
            m18847u0(null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m18847u0(@Nullable Links links) {
        if (!xma.m27379e4() || CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
            CoreLikers coreLikers = CoreModule.f1534c.f3676u0;
            Long l2 = this.lastReadTime;
            l2.getClass();
            coreLikers.m2363d7(links, l2.longValue(), 0);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m18848x0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != CoreModule.f1543l.m11706a().m5236Ck()) {
            if (requestCode != 786) {
                return false;
            }
            CoreMemberModule.F().b().Yq(resultCode, data, act());
            return true;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        rx.c cVarLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.kjr
            public final Object invoke(Object obj) {
                return ljr.m18828f0((c) obj);
            }
        };
        cVarLifecycle.takeFirst(new w9j() { // from class: l.ajr
            public final Object call(Object obj) {
                return ljr.m18829g0(function1, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bjr
            public final void call(Object obj) {
                ljr.m18830h0(this.f8929a, resultCode, data, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m18849y0(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        this.clickedUser = clickedUser;
        String str = ((Media) clickedUser.pictures.get(0)).url;
        str.getClass();
        if (m18839s0(liked, false, false, true, 0, str)) {
            return;
        }
        yir yirVarM10177N4 = this.frag.m10177N4();
        yirVarM10177N4.getClass();
        yirVarM10177N4.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m18850z0(@Nullable ViewGroup clickItem) {
        this.clickedItem = clickItem;
    }

    public void destroy() {
    }
}
