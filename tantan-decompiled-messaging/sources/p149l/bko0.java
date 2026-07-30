package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
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
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\nR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m87232d2 = {"Ll/bko0;", "Ll/x6s;", "Ll/nnn0;", "Ll/ojo0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", "", "userIdList", "scene", "k4", "(Ljava/util/List;Ljava/lang/String;)V", "m4", "(Ljava/lang/String;)V", "l4", "g4", "h4", "j4", "i4", "o4", "p4", "webH5Url", "Lcom/p1/mobile/putong/data/Link;", "e4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/data/Link;", "n4", "Ll/r7j;", "j", "Ljava/util/List;", "getShareData", "()Ljava/util/List;", "setShareData", "(Ljava/util/List;)V", "shareData", "Ll/gyp;", "k", "Lkotlin/Lazy;", "f4", "()Ll/gyp;", "inviteFriendToSharePresenter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class bko0 extends x6s<nnn0, ojo0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public List<r7j> shareData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy inviteFriendToSharePresenter;

    public bko0(@Nullable final bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        this.shareData = new ArrayList();
        this.inviteFriendToSharePresenter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.ujo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bko0.m102447c4(bsmVar, this);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public static void m102437S3(bko0 bko0Var, String str) {
        String str2;
        String strM147355d;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n2;
        str.getClass();
        Link linkM102449e4 = bko0Var.m102449e4(str);
        linkM102449e4.channel = LinkChannel.get("wechat-session");
        nnn0 nnn0Var = (nnn0) bko0Var.m206027E2();
        if (nnn0Var == null || (bLiveVoiceRoomMo149817n2 = nnn0Var.mo149817n()) == null || (str2 = bLiveVoiceRoomMo149817n2.bgThumbnailUrl) == null) {
            str2 = "";
        }
        String str3 = str2;
        nnn0 nnn0Var2 = (nnn0) bko0Var.m206027E2();
        if (nnn0Var2 == null || (bLiveVoiceRoomMo149817n = nnn0Var2.mo149817n()) == null || (strM147355d = bLiveVoiceRoomMo149817n.title) == null) {
            strM147355d = kvc0.m147355d(R$string.f47573uk);
        }
        new ShareHelper(linkM102449e4).m79985A0(bko0Var.act(), new ShareHelper.C13135c(bko0Var.act().string(R$string.f47683zk), rmp0.f160111b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), linkM102449e4.href, strM147355d, kvc0.m147355d(R$string.f47551tk), str3);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m102438T3(String str, BLiveEnvelope bLiveEnvelope) {
        if (Intrinsics.m87488d("inviteSettle", str)) {
            lsi0.m151595y("邀请成功");
        } else {
            lsi0.m151593w(R$string.f47595vk);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m102439U3(bko0 bko0Var, soj0 soj0Var) {
        bko0Var.m102460p4(BLiveHeatVoiceRoomTaskType.shareRoom);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m102440V3(bko0 bko0Var, String str) {
        str.getClass();
        bko0Var.m102460p4(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public static void m102441W3(bko0 bko0Var, String str) {
        String strM147355d;
        String str2;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n2;
        nnn0 nnn0Var = (nnn0) bko0Var.m206027E2();
        if (nnn0Var == null || (bLiveVoiceRoomMo149817n2 = nnn0Var.mo149817n()) == null || (strM147355d = bLiveVoiceRoomMo149817n2.title) == null) {
            strM147355d = kvc0.m147355d(R$string.f47573uk);
        }
        String str3 = strM147355d;
        String strM147355d2 = kvc0.m147355d(R$string.f47551tk);
        nnn0 nnn0Var2 = (nnn0) bko0Var.m206027E2();
        if (nnn0Var2 == null || (bLiveVoiceRoomMo149817n = nnn0Var2.mo149817n()) == null || (str2 = bLiveVoiceRoomMo149817n.bgThumbnailUrl) == null) {
            str2 = "";
        }
        String str4 = str2;
        str.getClass();
        Link linkM102449e4 = bko0Var.m102449e4(str);
        linkM102449e4.channel = LinkChannel.get("qq-space");
        new ShareHelper(linkM102449e4).m79985A0(bko0Var.act(), new ShareHelper.C13135c(bko0Var.act().string(R$string.f47683zk), cnb0.f81658b, LinkChannel.get("qq-space"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), linkM102449e4.href, str3, strM147355d2, str4);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m102442X3(bko0 bko0Var, BLiveEnvelope bLiveEnvelope) {
        ave0 ave0Var = ave0.INSTANCE;
        BLiveData bLiveData = bLiveEnvelope.data;
        bko0Var.shareData = ave0Var.m99163a(bLiveData.shareItems, bLiveData.masks);
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m102443Y3(bko0 bko0Var, View view) {
        bko0Var.m102458n4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z3 */
    public static void m102444Z3(bko0 bko0Var, String str) {
        String strM147355d;
        String str2;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n2;
        nnn0 nnn0Var = (nnn0) bko0Var.m206027E2();
        if (nnn0Var == null || (bLiveVoiceRoomMo149817n2 = nnn0Var.mo149817n()) == null || (strM147355d = bLiveVoiceRoomMo149817n2.title) == null) {
            strM147355d = kvc0.m147355d(R$string.f47573uk);
        }
        String str3 = strM147355d;
        String strM147355d2 = kvc0.m147355d(R$string.f47551tk);
        nnn0 nnn0Var2 = (nnn0) bko0Var.m206027E2();
        if (nnn0Var2 == null || (bLiveVoiceRoomMo149817n = nnn0Var2.mo149817n()) == null || (str2 = bLiveVoiceRoomMo149817n.bgThumbnailUrl) == null) {
            str2 = "";
        }
        String str4 = str2;
        str.getClass();
        Link linkM102449e4 = bko0Var.m102449e4(str);
        linkM102449e4.channel = LinkChannel.get("qq_friend");
        new ShareHelper(linkM102449e4).m79985A0(bko0Var.act(), new ShareHelper.C13135c(bko0Var.act().string(R$string.f47683zk), dnb0.f87044b, LinkChannel.get("qq_friend"), new String[]{com.tencent.connect.common.Constants.PACKAGE_TIM, "com.tencent.mobileqq", "com.tencent.mobileqqi"}), linkM102449e4.href, str3, strM147355d2, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public static void m102445a4(bko0 bko0Var, String str, BLiveEnvelope bLiveEnvelope) {
        ave0 ave0Var = ave0.INSTANCE;
        BLiveData bLiveData = bLiveEnvelope.data;
        List<r7j> listM99163a = ave0Var.m99163a(bLiveData.shareItems, bLiveData.masks);
        bko0Var.shareData = listM99163a;
        ojo0 ojo0Var = (ojo0) bko0Var.viewModel;
        if (ojo0Var != null) {
            ojo0Var.m164728L(listM99163a, str);
        }
        D dM206027E2 = bko0Var.m206027E2();
        dM206027E2.getClass();
        fbp0.m120403s((nnn0) dM206027E2, !bko0Var.shareData.isEmpty());
    }

    /* JADX INFO: renamed from: b4 */
    public static void m102446b4(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: c4 */
    public static gyp m102447c4(bsm bsmVar, bko0 bko0Var) {
        gyp gypVar = new gyp(bsmVar);
        bko0Var.m144512z2(gypVar);
        return gypVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public static void m102448d4(bko0 bko0Var, String str) {
        String strM147355d;
        String str2;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n;
        BLiveVoiceRoom bLiveVoiceRoomMo149817n2;
        str.getClass();
        Link linkM102449e4 = bko0Var.m102449e4(str);
        linkM102449e4.channel = LinkChannel.get("wechat-moments");
        nnn0 nnn0Var = (nnn0) bko0Var.m206027E2();
        if (nnn0Var == null || (bLiveVoiceRoomMo149817n2 = nnn0Var.mo149817n()) == null || (strM147355d = bLiveVoiceRoomMo149817n2.title) == null) {
            strM147355d = kvc0.m147355d(R$string.f47573uk);
        }
        String str3 = strM147355d;
        String strM147355d2 = kvc0.m147355d(R$string.f47551tk);
        nnn0 nnn0Var2 = (nnn0) bko0Var.m206027E2();
        if (nnn0Var2 == null || (bLiveVoiceRoomMo149817n = nnn0Var2.mo149817n()) == null || (str2 = bLiveVoiceRoomMo149817n.bgThumbnailUrl) == null) {
            str2 = "";
        }
        new ShareHelper(linkM102449e4).m79985A0(bko0Var.act(), new ShareHelper.C13135c(bko0Var.act().string(R$string.f47683zk), gmp0.f103510b, LinkChannel.get("wechat-moments"), new String[]{"com.tencent.mm"}), linkM102449e4.href, str3, strM147355d2, str2);
    }

    /* JADX INFO: renamed from: e4 */
    public final Link m102449e4(String webH5Url) {
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.href = webH5Url;
        return link;
    }

    /* JADX INFO: renamed from: f4 */
    public final gyp m102450f4() {
        return (gyp) this.inviteFriendToSharePresenter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m102451g4(@NotNull String scene) {
        scene.getClass();
        if (m206027E2() == 0) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        fbp0.m120402r((nnn0) dM206027E2, "qq", scene);
        nnn0 nnn0Var = (nnn0) m206027E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("qq", nnn0Var != null ? nnn0Var.m149818o() : null, scene)).subscribe(ffw.m121194e(new e30() { // from class: l.qjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102444Z3(this.f154956a, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m102452h4(@NotNull String scene) {
        scene.getClass();
        if (m206027E2() == 0) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        fbp0.m120402r((nnn0) dM206027E2, "qq_zone", scene);
        nnn0 nnn0Var = (nnn0) m206027E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("qqZone", nnn0Var != null ? nnn0Var.m149818o() : null, scene)).subscribe(ffw.m121194e(new e30() { // from class: l.ako0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102441W3(this.f70290a, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final void m102453i4() {
        if (m206027E2() == 0) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        fbp0.m120401q((nnn0) dM206027E2, Moments.TYPE);
        new xh0.C21150a(this.f188513f).m208740s("分享到动态").m208731j("分享成功后，你的好友或粉丝可通过你发布的动态进入本群").m208727f("取消").m208728g(false).m208729h(false).m208723b(true).m208739r("分享").m208736o(new View.OnClickListener() { // from class: l.rjo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bko0.m102443Y3(this.f159728a, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public final void m102454j4(@NotNull String scene) {
        scene.getClass();
        if (m206027E2() == 0) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        fbp0.m120401q((nnn0) dM206027E2, "friends");
        m102450f4().m128724Y3(scene);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m102455k4(@NotNull List<String> userIdList, @NotNull final String scene) {
        userIdList.getClass();
        scene.getClass();
        if (userIdList.isEmpty() || m206027E2() == 0) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        fbp0.m120387c((nnn0) dM206027E2, scene);
        D dM206027E3 = m206027E2();
        dM206027E3.getClass();
        duringCreated(VoiceRoomApiProvider.postSelectedShareItem(((nnn0) dM206027E3).m149818o(), userIdList, scene)).subscribe(ffw.m121194e(new e30() { // from class: l.xjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102438T3(scene, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.yjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102446b4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public final void m102456l4(@NotNull String scene) {
        scene.getClass();
        if (m206027E2() == 0) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        fbp0.m120402r((nnn0) dM206027E2, "wechat_moments", scene);
        nnn0 nnn0Var = (nnn0) m206027E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("wechatMoment", nnn0Var != null ? nnn0Var.m149818o() : null, scene)).subscribe(ffw.m121194e(new e30() { // from class: l.wjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102448d4(this.f186667a, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final void m102457m4(@NotNull String scene) {
        scene.getClass();
        if (m206027E2() == 0) {
            return;
        }
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        fbp0.m120402r((nnn0) dM206027E2, "wechat", scene);
        nnn0 nnn0Var = (nnn0) m206027E2();
        duringCreated(VoiceRoomApiProvider.getShareUrl("wechat", nnn0Var != null ? nnn0Var.m149818o() : null, scene)).subscribe(ffw.m121194e(new e30() { // from class: l.zjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102437S3(this.f203437a, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final void m102458n4() {
        String strM149818o;
        nnn0 nnn0Var = (nnn0) m206027E2();
        if (nnn0Var == null || (strM149818o = nnn0Var.m149818o()) == null) {
            strM149818o = "";
        }
        ypv.f199493a.m199341d0(this.f188513f, ypv.m215672k().m195848h5(), strM149818o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final void m102459o4(final String scene) {
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(((nnn0) dM206027E2).m149818o(), scene)).subscribe(ffw.m121197h(new e30() { // from class: l.vjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102445a4(this.f181742a, scene, (BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p4 */
    public final void m102460p4(String scene) {
        ojo0 ojo0Var;
        if (this.viewModel == 0) {
            Act act = this.f188512e.f77095a;
            act.getClass();
            ojo0 ojo0Var2 = new ojo0(act, this);
            this.viewModel = ojo0Var2;
            mo51532C(ojo0Var2);
        }
        if (!this.shareData.isEmpty() && (ojo0Var = (ojo0) this.viewModel) != null) {
            ojo0Var.m164728L(this.shareData, scene);
        }
        m102459o4(scene);
        ojo0 ojo0Var3 = (ojo0) this.viewModel;
        if (ojo0Var3 != null) {
            ojo0Var3.m164733T(scene);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.pjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102439U3(this.f149853a, (soj0) obj);
            }
        }));
        duringCreated(m206028F2().VoiceVirtualLiveEvent.openSharePanelDialogWithScene().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.sjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102440V3(this.f164866a, (String) obj);
            }
        }));
        D dM206027E2 = m206027E2();
        dM206027E2.getClass();
        duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(((nnn0) dM206027E2).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.tjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                bko0.m102442X3(this.f170784a, (BLiveEnvelope) obj);
            }
        }));
    }
}
