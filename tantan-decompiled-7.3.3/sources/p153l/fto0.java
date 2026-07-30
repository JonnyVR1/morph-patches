package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\nR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m88121d2 = {"Ll/fto0;", "Ll/y8s;", "Ll/rwn0;", "Ll/sso0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", "", "userIdList", "scene", "k4", "(Ljava/util/List;Ljava/lang/String;)V", "m4", "(Ljava/lang/String;)V", "l4", "g4", "h4", "j4", "i4", "o4", "p4", "webH5Url", "Lcom/p1/mobile/putong/data/Link;", "e4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/data/Link;", "n4", "Ll/laj;", "j", "Ljava/util/List;", "getShareData", "()Ljava/util/List;", "setShareData", "(Ljava/util/List;)V", "shareData", "Ll/g0q;", "k", "Lkotlin/Lazy;", "f4", "()Ll/g0q;", "inviteFriendToSharePresenter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fto0 extends y8s<rwn0, sso0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public List<laj> shareData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy inviteFriendToSharePresenter;

    public fto0(@Nullable final dum<? extends rwn0> dumVar) {
        super(dumVar);
        this.shareData = new ArrayList();
        this.inviteFriendToSharePresenter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.yso0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fto0.m127361c4(dumVar, this);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public static void m127351S3(fto0 fto0Var, String str) {
        String str2;
        String strM161280d;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n2;
        str.getClass();
        Link linkM127363e4 = fto0Var.m127363e4(str);
        linkM127363e4.channel = LinkChannel.get("wechat-session");
        rwn0 rwn0Var = (rwn0) fto0Var.m213810E2();
        if (rwn0Var == null || (bLiveVoiceRoomMo183440n2 = rwn0Var.mo183440n()) == null || (str2 = bLiveVoiceRoomMo183440n2.bgThumbnailUrl) == null) {
            str2 = "";
        }
        String str3 = str2;
        rwn0 rwn0Var2 = (rwn0) fto0Var.m213810E2();
        if (rwn0Var2 == null || (bLiveVoiceRoomMo183440n = rwn0Var2.mo183440n()) == null || (strM161280d = bLiveVoiceRoomMo183440n.title) == null) {
            strM161280d = n3d0.m161280d(R$string.f48421uk);
        }
        new ShareHelper(linkM127363e4).m81168A0(fto0Var.act(), new ShareHelper.C13298c(fto0Var.act().string(R$string.f48531zk), vvp0.f185950b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), linkM127363e4.href, strM161280d, n3d0.m161280d(R$string.f48399tk), str3);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m127352T3(String str, BLiveEnvelope bLiveEnvelope) {
        if (Intrinsics.m88377d("inviteSettle", str)) {
            o1j0.m165651y("邀请成功");
        } else {
            o1j0.m165649w(R$string.f48443vk);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m127353U3(fto0 fto0Var, vxj0 vxj0Var) {
        fto0Var.m127374p4(BLiveHeatVoiceRoomTaskType.shareRoom);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m127354V3(fto0 fto0Var, String str) {
        str.getClass();
        fto0Var.m127374p4(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public static void m127355W3(fto0 fto0Var, String str) {
        String strM161280d;
        String str2;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n2;
        rwn0 rwn0Var = (rwn0) fto0Var.m213810E2();
        if (rwn0Var == null || (bLiveVoiceRoomMo183440n2 = rwn0Var.mo183440n()) == null || (strM161280d = bLiveVoiceRoomMo183440n2.title) == null) {
            strM161280d = n3d0.m161280d(R$string.f48421uk);
        }
        String str3 = strM161280d;
        String strM161280d2 = n3d0.m161280d(R$string.f48399tk);
        rwn0 rwn0Var2 = (rwn0) fto0Var.m213810E2();
        if (rwn0Var2 == null || (bLiveVoiceRoomMo183440n = rwn0Var2.mo183440n()) == null || (str2 = bLiveVoiceRoomMo183440n.bgThumbnailUrl) == null) {
            str2 = "";
        }
        String str4 = str2;
        str.getClass();
        Link linkM127363e4 = fto0Var.m127363e4(str);
        linkM127363e4.channel = LinkChannel.get("qq-space");
        new ShareHelper(linkM127363e4).m81168A0(fto0Var.act(), new ShareHelper.C13298c(fto0Var.act().string(R$string.f48531zk), gvb0.f106619b, LinkChannel.get("qq-space"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), linkM127363e4.href, str3, strM161280d2, str4);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m127356X3(fto0 fto0Var, BLiveEnvelope bLiveEnvelope) {
        h3f0 h3f0Var = h3f0.INSTANCE;
        BLiveData bLiveData = bLiveEnvelope.data;
        fto0Var.shareData = h3f0Var.m133466a(bLiveData.shareItems, bLiveData.masks);
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m127357Y3(fto0 fto0Var, View view) {
        fto0Var.m127372n4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public static void m127358Z3(fto0 fto0Var, String str) {
        String strM161280d;
        String str2;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n2;
        rwn0 rwn0Var = (rwn0) fto0Var.m213810E2();
        if (rwn0Var == null || (bLiveVoiceRoomMo183440n2 = rwn0Var.mo183440n()) == null || (strM161280d = bLiveVoiceRoomMo183440n2.title) == null) {
            strM161280d = n3d0.m161280d(R$string.f48421uk);
        }
        String str3 = strM161280d;
        String strM161280d2 = n3d0.m161280d(R$string.f48399tk);
        rwn0 rwn0Var2 = (rwn0) fto0Var.m213810E2();
        if (rwn0Var2 == null || (bLiveVoiceRoomMo183440n = rwn0Var2.mo183440n()) == null || (str2 = bLiveVoiceRoomMo183440n.bgThumbnailUrl) == null) {
            str2 = "";
        }
        String str4 = str2;
        str.getClass();
        Link linkM127363e4 = fto0Var.m127363e4(str);
        linkM127363e4.channel = LinkChannel.get("qq_friend");
        new ShareHelper(linkM127363e4).m81168A0(fto0Var.act(), new ShareHelper.C13298c(fto0Var.act().string(R$string.f48531zk), hvb0.f111748b, LinkChannel.get("qq_friend"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), linkM127363e4.href, str3, strM161280d2, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public static void m127359a4(fto0 fto0Var, String str, BLiveEnvelope bLiveEnvelope) {
        h3f0 h3f0Var = h3f0.INSTANCE;
        BLiveData bLiveData = bLiveEnvelope.data;
        List<laj> listM133466a = h3f0Var.m133466a(bLiveData.shareItems, bLiveData.masks);
        fto0Var.shareData = listM133466a;
        sso0 sso0Var = (sso0) fto0Var.viewModel;
        if (sso0Var != null) {
            sso0Var.m187779L(listM133466a, str);
        }
        D dM213810E2 = fto0Var.m213810E2();
        dM213810E2.getClass();
        jkp0.m145888s((rwn0) dM213810E2, !fto0Var.shareData.isEmpty());
    }

    /* JADX INFO: renamed from: b4 */
    public static void m127360b4(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: c4 */
    public static g0q m127361c4(dum dumVar, fto0 fto0Var) {
        g0q g0qVar = new g0q(dumVar);
        fto0Var.m153103z2(g0qVar);
        return g0qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public static void m127362d4(fto0 fto0Var, String str) {
        String strM161280d;
        String str2;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n;
        BLiveVoiceRoom bLiveVoiceRoomMo183440n2;
        str.getClass();
        Link linkM127363e4 = fto0Var.m127363e4(str);
        linkM127363e4.channel = LinkChannel.get("wechat-moments");
        rwn0 rwn0Var = (rwn0) fto0Var.m213810E2();
        if (rwn0Var == null || (bLiveVoiceRoomMo183440n2 = rwn0Var.mo183440n()) == null || (strM161280d = bLiveVoiceRoomMo183440n2.title) == null) {
            strM161280d = n3d0.m161280d(R$string.f48421uk);
        }
        String str3 = strM161280d;
        String strM161280d2 = n3d0.m161280d(R$string.f48399tk);
        rwn0 rwn0Var2 = (rwn0) fto0Var.m213810E2();
        if (rwn0Var2 == null || (bLiveVoiceRoomMo183440n = rwn0Var2.mo183440n()) == null || (str2 = bLiveVoiceRoomMo183440n.bgThumbnailUrl) == null) {
            str2 = "";
        }
        new ShareHelper(linkM127363e4).m81168A0(fto0Var.act(), new ShareHelper.C13298c(fto0Var.act().string(R$string.f48531zk), kvp0.f128981b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), linkM127363e4.href, str3, strM161280d2, str2);
    }

    /* JADX INFO: renamed from: e4 */
    public final Link m127363e4(String webH5Url) {
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.href = webH5Url;
        return link;
    }

    /* JADX INFO: renamed from: f4 */
    public final g0q m127364f4() {
        return (g0q) this.inviteFriendToSharePresenter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m127365g4(@NotNull String scene) {
        scene.getClass();
        if (m213810E2() == 0) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        jkp0.m145887r((rwn0) dM213810E2, "qq", scene);
        rwn0 rwn0Var = (rwn0) m213810E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("qq", rwn0Var != null ? rwn0Var.m202194o() : null, scene)).subscribe(dhw.m115826e(new y20() { // from class: l.uso0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127358Z3(this.f180840a, (String) obj);
            }
        }, new z2e0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m127366h4(@NotNull String scene) {
        scene.getClass();
        if (m213810E2() == 0) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        jkp0.m145887r((rwn0) dM213810E2, "qq_zone", scene);
        rwn0 rwn0Var = (rwn0) m213810E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("qqZone", rwn0Var != null ? rwn0Var.m202194o() : null, scene)).subscribe(dhw.m115826e(new y20() { // from class: l.eto0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127355W3(this.f95779a, (String) obj);
            }
        }, new z2e0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m127367i4() {
        if (m213810E2() == 0) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        jkp0.m145886q((rwn0) dM213810E2, Moments.TYPE);
        new th0.C20312a(this.f196919f).m191160s("分享到动态").m191151j("分享成功后，你的好友或粉丝可通过你发布的动态进入本群").m191147f("取消").m191148g(false).m191149h(false).m191143b(true).m191159r("分享").m191156o(new View.OnClickListener() { // from class: l.vso0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fto0.m127357Y3(this.f185642a, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m127368j4(@NotNull String scene) {
        scene.getClass();
        if (m213810E2() == 0) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        jkp0.m145886q((rwn0) dM213810E2, "friends");
        m127364f4().m128461Y3(scene);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m127369k4(@NotNull List<String> userIdList, @NotNull final String scene) {
        userIdList.getClass();
        scene.getClass();
        if (userIdList.isEmpty() || m213810E2() == 0) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        jkp0.m145872c((rwn0) dM213810E2, scene);
        D dM213810E3 = m213810E2();
        dM213810E3.getClass();
        duringCreated(VoiceRoomApiProvider.postSelectedShareItem(((rwn0) dM213810E3).m202194o(), userIdList, scene)).subscribe(dhw.m115826e(new y20() { // from class: l.bto0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127352T3(scene, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.cto0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127360b4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final void m127370l4(@NotNull String scene) {
        scene.getClass();
        if (m213810E2() == 0) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        jkp0.m145887r((rwn0) dM213810E2, "wechat_moments", scene);
        rwn0 rwn0Var = (rwn0) m213810E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("wechatMoment", rwn0Var != null ? rwn0Var.m202194o() : null, scene)).subscribe(dhw.m115826e(new y20() { // from class: l.ato0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127362d4(this.f73372a, (String) obj);
            }
        }, new z2e0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final void m127371m4(@NotNull String scene) {
        scene.getClass();
        if (m213810E2() == 0) {
            return;
        }
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        jkp0.m145887r((rwn0) dM213810E2, "wechat", scene);
        rwn0 rwn0Var = (rwn0) m213810E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("wechat", rwn0Var != null ? rwn0Var.m202194o() : null, scene)).subscribe(dhw.m115826e(new y20() { // from class: l.dto0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127351S3(this.f90609a, (String) obj);
            }
        }, new z2e0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final void m127372n4() {
        String strM202194o;
        rwn0 rwn0Var = (rwn0) m213810E2();
        if (rwn0Var == null || (strM202194o = rwn0Var.m202194o()) == null) {
            strM202194o = "";
        }
        zrv.f205799a.m207663d0(this.f196919f, zrv.m221193k().m203635h5(), strM202194o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final void m127373o4(final String scene) {
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(((rwn0) dM213810E2).m202194o(), scene)).subscribe(dhw.m115829h(new y20() { // from class: l.zso0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127359a4(this.f205885a, scene, (BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p4 */
    public final void m127374p4(String scene) {
        sso0 sso0Var;
        if (this.viewModel == 0) {
            Act act = this.f196918e.f90815a;
            act.getClass();
            sso0 sso0Var2 = new sso0(act, this);
            this.viewModel = sso0Var2;
            mo52715C(sso0Var2);
        }
        if (!this.shareData.isEmpty() && (sso0Var = (sso0) this.viewModel) != null) {
            sso0Var.m187779L(this.shareData, scene);
        }
        m127373o4(scene);
        sso0 sso0Var3 = (sso0) this.viewModel;
        if (sso0Var3 != null) {
            sso0Var3.m187784T(scene);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.tso0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127353U3(this.f176009a, (vxj0) obj);
            }
        }));
        duringCreated(m213811F2().VoiceVirtualLiveEvent.openSharePanelDialogWithScene().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.wso0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127354V3(this.f190662a, (String) obj);
            }
        }));
        D dM213810E2 = m213810E2();
        dM213810E2.getClass();
        duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(((rwn0) dM213810E2).m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.xso0
            @Override // p153l.y20
            public final void call(Object obj) {
                fto0.m127356X3(this.f196117a, (BLiveEnvelope) obj);
            }
        }));
    }
}
