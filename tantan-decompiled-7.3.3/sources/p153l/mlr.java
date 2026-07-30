package p153l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.mytab.LikersMyTabFrag;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010#¢\u0006\u0004\b0\u0010)J\u0017\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010,¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00132\u0006\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0007R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u001cR\u0016\u00106\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0017R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR*\u0010X\u001a\n Q*\u0004\u0018\u00010P0P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, m88121d2 = {"Ll/mlr;", "Ll/ar2;", "Ll/nlr;", "Ll/dwl;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "", "liked", "superliked", "fromButton", "isQuickGreeting", "", "picIndex", "", "picUrl", "s0", "(ZZZZILjava/lang/String;)Z", "", "a0", "()V", "destroy", "Z", "t0", "Lcom/p1/mobile/putong/data/Links;", "links", "u0", "(Lcom/p1/mobile/putong/data/Links;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "x0", "(IILandroid/content/Intent;)Z", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "E", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "y0", "L", "(Lcom/p1/mobile/putong/data/User;)V", "k", "()Lcom/p1/mobile/putong/data/User;", "Landroid/view/ViewGroup;", BLiveStormDanmakuGiftResourceType.f45294s, "()Landroid/view/ViewGroup;", "user", "A0", "clickItem", "z0", "(Landroid/view/ViewGroup;)V", "getFrom", "()Ljava/lang/String;", "seeCount", "J", "(I)V", BLiveStormDanmakuGiftResourceType.f45292l, "()I", "P", "(I)Ljava/lang/String;", "a", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "b", "Lcom/p1/mobile/putong/data/Links;", "r0", "()Lcom/p1/mobile/putong/data/Links;", "setLinks", "c", "I", Constants.INAPP_DATA_TAG, "couldLoadMore", "e", "Lcom/p1/mobile/putong/data/User;", "f", "Landroid/view/ViewGroup;", "clickedItem", "", "kotlin.jvm.PlatformType", "g", "Ljava/lang/Long;", "q0", "()Ljava/lang/Long;", "setLastReadTime", "(Ljava/lang/Long;)V", "lastReadTime", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mlr extends ar2<nlr> implements dwl {

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
    public mlr(@NotNull LikersMyTabFrag likersMyTabFrag) {
        super(likersMyTabFrag);
        likersMyTabFrag.getClass();
        this.frag = likersMyTabFrag;
        this.lastReadTime = CoreModule.f18264c.f20429u0.f19996l0.get();
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m158925e0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m158926f0(C4470c c4470c) {
        c4470c.getClass();
        return Boolean.valueOf(c4470c == C4470c.f16267i);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m158927g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m158928h0(mlr mlrVar, int i, Intent intent, C4470c c4470c) {
        List<Media> list;
        Media media;
        if (NullChecker.m82486a(mlrVar.clickedItem) && NullChecker.m82486a(mlrVar.clickedUser)) {
            ViewGroup viewGroup = mlrVar.clickedItem;
            int intExtra = 0;
            if (viewGroup != null) {
                viewGroup.setClickable(false);
            }
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            boolean z2 = i == SwipeDirection.UP.getValue();
            User user = mlrVar.clickedUser;
            String stringExtra = (user == null || (list = user.pictures) == null || (media = list.get(0)) == null) ? null : media.url;
            if (intent != null) {
                intExtra = intent.getIntExtra("currentImageIndex", 0);
                stringExtra = intent.getStringExtra("currentImageUrl");
            }
            int i2 = intExtra;
            if (stringExtra == null) {
                stringExtra = "";
            }
            mlrVar.m158937s0(z, z2, true, false, i2, stringExtra);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m158929i0(mlr mlrVar, String str) {
        mlrVar.m158942t0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m158930j0(mlr mlrVar, Bundle bundle) {
        ((nlr) mlrVar.viewModel).m163773r();
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m158931k0(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: l0 */
    public static void m158932l0(mlr mlrVar, NetworkInfo networkInfo) {
        mlrVar.m158942t0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m158933m0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static Boolean m158934n0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m158935o0(mlr mlrVar, vg60 vg60Var) {
        Links links;
        DbLinks dbLinks;
        if (vg60Var == null || (dbLinks = vg60Var.f184002b) == null || (links = dbLinks.links) == null) {
            links = null;
        }
        mlrVar.links = links;
        int iM201222d = vg60Var != null ? vg60Var.m201222d() : 0;
        mlrVar.seeCount = iM201222d;
        if (iM201222d > 0) {
            mlrVar.couldLoadMore = true;
        }
        ((nlr) mlrVar.viewModel).m163772j(vg60Var);
    }

    /* JADX INFO: renamed from: p0 */
    public static Boolean m158936p0(String str) {
        str.getClass();
        return Boolean.valueOf(Intrinsics.m88377d("all", str) || Intrinsics.m88377d("see", str));
    }

    /* JADX INFO: renamed from: s0 */
    private final boolean m158937s0(boolean liked, boolean superliked, boolean fromButton, boolean isQuickGreeting, int picIndex, String picUrl) {
        return CoreMemberModule.m37004F().m187693b().mo36991fe(liked, superliked, fromButton, isQuickGreeting, picIndex, picUrl, this, (ewl) this.viewModel, this.frag);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m158938A0(@Nullable User user) {
        this.clickedUser = user;
    }

    /* JADX INFO: renamed from: E */
    public final void m158939E(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        this.clickedUser = clickedUser;
        String str = clickedUser.pictures.get(0).url;
        str.getClass();
        if (!m158937s0(liked, false, fromButton, false, 0, str)) {
            zkr zkrVarM57901N4 = this.frag.m57901N4();
            zkrVarM57901N4.getClass();
            zkrVarM57901N4.notifyDataSetChanged();
        }
        CoreMemberModule.m37004F().m187693b().mo36972An(clickedUser);
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: J */
    public void mo57864J(int seeCount) {
        this.seeCount = seeCount;
    }

    @Override // p153l.dwl
    /* JADX INFO: renamed from: L */
    public void mo57866L(@Nullable User clickedUser) {
        CoreMemberModule.m37004F().m187693b().mo36995lm(act(), clickedUser, "[摆手]", false, null, null, "QuickGreeting");
    }

    @Override // p153l.dwl
    @NotNull
    /* JADX INFO: renamed from: P */
    public String mo57870P(int seeCount) {
        return "";
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m158942t0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.alr
            @Override // p153l.y20
            public final void call(Object obj) {
                mlr.m158930j0(this.f72149a, (Bundle) obj);
            }
        });
        C22421c c22421cSkip = duringCreated(ConnectivityReceiver.m82473m()).skip(1);
        final Function1 function1 = new Function1() { // from class: l.dlr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mlr.m158931k0((NetworkInfo) obj);
            }
        };
        c22421cSkip.filter(new qcj() { // from class: l.elr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mlr.m158925e0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.flr
            @Override // p153l.y20
            public final void call(Object obj) {
                mlr.m158932l0(this.f99686a, (NetworkInfo) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(e7d0.INSTANCE.m119701b().m119698d());
        final Function1 function2 = new Function1() { // from class: l.glr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mlr.m158936p0((String) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.hlr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mlr.m158934n0(function2, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ilr
            @Override // p153l.y20
            public final void call(Object obj) {
                mlr.m158929i0(this.f115599a, (String) obj);
            }
        }, new y20() { // from class: l.jlr
            @Override // p153l.y20
            public final void call(Object obj) {
                mlr.m158933m0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20429u0.m31419U6()).subscribe(psd0.m173596G(new y20() { // from class: l.klr
            @Override // p153l.y20
            public final void call(Object obj) {
                mlr.m158935o0(this.f127407a, (vg60) obj);
            }
        }));
    }

    @Override // p153l.dwl
    @NotNull
    public String getFrom() {
        return "";
    }

    @Override // p153l.dwl
    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public User getClickedUser() {
        return this.clickedUser;
    }

    @Override // p153l.dwl
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

    @Override // p153l.dwl
    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public ViewGroup getClickedItem() {
        return this.clickedItem;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m158942t0() {
        this.lastReadTime = CoreModule.f18264c.f20429u0.f19996l0.get();
        CoreModule.f18264c.f20429u0.m31461n5();
        if (!joa.m146386f4() || CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
            m158943u0(null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m158943u0(@Nullable Links links) {
        if (!joa.m146386f4() || CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
            CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
            Long l2 = this.lastReadTime;
            l2.getClass();
            coreLikers.m31445h7(links, l2.longValue(), 0);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m158944x0(int requestCode, final int resultCode, @Nullable final Intent data) {
        if (requestCode != CoreModule.f18273l.m143405a().mo34302Ck()) {
            if (requestCode != 786) {
                return false;
            }
            CoreMemberModule.m37004F().m187693b().mo36984Yq(resultCode, data, act());
            return true;
        }
        if (resultCode != SwipeDirection.RIGHT.getValue() && resultCode != SwipeDirection.LEFT.getValue() && resultCode != SwipeDirection.UP.getValue()) {
            return false;
        }
        C22421c<C4470c> c22421cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.llr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mlr.m158926f0((C4470c) obj);
            }
        };
        c22421cLifecycle.takeFirst(new qcj() { // from class: l.blr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mlr.m158927g0(function1, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.clr
            @Override // p153l.y20
            public final void call(Object obj) {
                mlr.m158928h0(this.f82420a, resultCode, data, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m158945y0(@NotNull User clickedUser, boolean liked, boolean fromButton) {
        clickedUser.getClass();
        this.clickedUser = clickedUser;
        String str = clickedUser.pictures.get(0).url;
        str.getClass();
        if (m158937s0(liked, false, false, true, 0, str)) {
            return;
        }
        zkr zkrVarM57901N4 = this.frag.m57901N4();
        zkrVarM57901N4.getClass();
        zkrVarM57901N4.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m158946z0(@Nullable ViewGroup clickItem) {
        this.clickedItem = clickItem;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
