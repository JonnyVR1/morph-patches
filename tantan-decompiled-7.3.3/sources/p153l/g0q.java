package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/g0q;", "Ll/y8s;", "Ll/oo2;", "Ll/b0q;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "scene", "", "Y3", "(Ljava/lang/String;)V", "", "userIdList", "X3", "(Ljava/util/List;)V", "W3", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "bLiveEnvelope", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "j", "Ljava/lang/String;", "inviteScene", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class g0q extends y8s<oo2, b0q> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String inviteScene;

    public g0q(@Nullable dum<?> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m128455S3(g0q g0qVar, BLiveEnvelope bLiveEnvelope) {
        String str = g0qVar.inviteScene;
        if (str == null) {
            Intrinsics.m88391r("inviteScene");
            str = null;
        }
        if (Intrinsics.m88377d("inviteSettle", str)) {
            o1j0.m165651y("邀请成功");
        } else {
            o1j0.m165649w(R$string.f48443vk);
        }
        ((b0q) g0qVar.viewModel).m101347N();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m128456T3(g0q g0qVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            g0qVar.m128462Z3(bLiveEnvelope);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m128457U3(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m128458V3(g0q g0qVar, Throwable th) {
        ((b0q) g0qVar.viewModel).m101350R();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX INFO: renamed from: W3 */
    public final void m128459W3(String scene) {
        if (this.viewModel == 0) {
            Act act = this.f196918e.f90815a;
            act.getClass();
            b0q b0qVar = new b0q(act, this);
            this.viewModel = b0qVar;
            mo52715C(b0qVar);
        }
        ((b0q) this.viewModel).m101349Q(scene);
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(M213810E2.m202194o(), scene)).subscribe(dhw.m115826e(new y20() { // from class: l.c0q
            @Override // p153l.y20
            public final void call(Object obj) {
                g0q.m128456T3(this.f79290a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.d0q
            @Override // p153l.y20
            public final void call(Object obj) {
                g0q.m128458V3(this.f84591a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public final void m128460X3(@NotNull List<String> userIdList) {
        userIdList.getClass();
        if (userIdList.isEmpty() || m213810E2() == 0) {
            return;
        }
        String str = this.inviteScene;
        String str2 = null;
        if (str == null) {
            Intrinsics.m88391r("inviteScene");
            str = null;
        }
        if (Intrinsics.m88377d("inviteSettle", str)) {
            String strM207631D0 = zrv.f205799a.m207631D0();
            ?? M213810E2 = m213810E2();
            M213810E2.getClass();
            String str3 = Intrinsics.m88377d(strM207631D0, M213810E2.m168526j0()) ? "p_anchor_audio_room" : "p_user_audio_room";
            ?? M213810E3 = m213810E2();
            M213810E3.getClass();
            pf60 pf60Var = new pf60("anchorId", M213810E3.m168526j0());
            ?? M213810E4 = m213810E2();
            M213810E4.getClass();
            i4g0.m138523u("e_audio_invite_friends_settle", str3, pf60Var, new pf60("roomId", M213810E4.m202194o()), new pf60("share_type", "more_friends"));
        }
        ?? M213810E5 = m213810E2();
        M213810E5.getClass();
        String strM202194o = M213810E5.m202194o();
        String str4 = this.inviteScene;
        if (str4 == null) {
            Intrinsics.m88391r("inviteScene");
        } else {
            str2 = str4;
        }
        duringCreated(VoiceRoomApiProvider.postSelectedShareItem(strM202194o, userIdList, str2)).subscribe(dhw.m115826e(new y20() { // from class: l.e0q
            @Override // p153l.y20
            public final void call(Object obj) {
                g0q.m128455S3(this.f91545a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.f0q
            @Override // p153l.y20
            public final void call(Object obj) {
                g0q.m128457U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m128461Y3(@NotNull String scene) {
        scene.getClass();
        this.inviteScene = scene;
        m128459W3(scene);
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m128462Z3(BLiveEnvelope bLiveEnvelope) {
        b0q b0qVar = (b0q) this.viewModel;
        h3f0 h3f0Var = h3f0.INSTANCE;
        BLiveData bLiveData = bLiveEnvelope.data;
        b0qVar.m101352U(h3f0Var.m133466a(bLiveData.shareItems, bLiveData.masks));
    }
}
