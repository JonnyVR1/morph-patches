package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/gyp;", "Ll/x6s;", "Ll/ho2;", "Ll/byp;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "scene", "", "Y3", "(Ljava/lang/String;)V", "", "userIdList", "X3", "(Ljava/util/List;)V", "W3", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "bLiveEnvelope", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "j", "Ljava/lang/String;", "inviteScene", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class gyp extends x6s<ho2, byp> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String inviteScene;

    public gyp(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m128718S3(gyp gypVar, BLiveEnvelope bLiveEnvelope) {
        String str = gypVar.inviteScene;
        if (str == null) {
            Intrinsics.m87502r("inviteScene");
            str = null;
        }
        if (Intrinsics.m87488d("inviteSettle", str)) {
            lsi0.m151595y("邀请成功");
        } else {
            lsi0.m151593w(R$string.f47595vk);
        }
        ((byp) gypVar.viewModel).m104500N();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m128719T3(gyp gypVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            gypVar.m128725Z3(bLiveEnvelope);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m128720U3(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m128721V3(gyp gypVar, Throwable th) {
        ((byp) gypVar.viewModel).m104503R();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final void m128722W3(String scene) {
        if (this.viewModel == 0) {
            Act act = this.f188512e.f77095a;
            act.getClass();
            byp bypVar = new byp(act, this);
            this.viewModel = bypVar;
            mo51532C(bypVar);
        }
        ((byp) this.viewModel).m104502Q(scene);
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(M206027E2.m149818o(), scene)).subscribe(ffw.m121194e(new e30() { // from class: l.cyp
            @Override // p149l.e30
            public final void call(Object obj) {
                gyp.m128719T3(this.f83021a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dyp
            @Override // p149l.e30
            public final void call(Object obj) {
                gyp.m128721V3(this.f88414a, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final void m128723X3(@NotNull List<String> userIdList) {
        userIdList.getClass();
        if (userIdList.isEmpty() || m206027E2() == 0) {
            return;
        }
        String str = this.inviteScene;
        String str2 = null;
        if (str == null) {
            Intrinsics.m87502r("inviteScene");
            str = null;
        }
        if (Intrinsics.m87488d("inviteSettle", str)) {
            String strM199309D0 = ypv.f199493a.m199309D0();
            ?? M206027E2 = m206027E2();
            M206027E2.getClass();
            String str3 = Intrinsics.m87488d(strM199309D0, M206027E2.m132140j0()) ? "p_anchor_audio_room" : "p_user_audio_room";
            ?? M206027E3 = m206027E2();
            M206027E3.getClass();
            j760 j760Var = new j760("anchorId", M206027E3.m132140j0());
            ?? M206027E4 = m206027E2();
            M206027E4.getClass();
            zvf0.m220399u("e_audio_invite_friends_settle", str3, j760Var, new j760("roomId", M206027E4.m149818o()), new j760("share_type", "more_friends"));
        }
        ?? M206027E5 = m206027E2();
        M206027E5.getClass();
        String strM149818o = M206027E5.m149818o();
        String str4 = this.inviteScene;
        if (str4 == null) {
            Intrinsics.m87502r("inviteScene");
        } else {
            str2 = str4;
        }
        duringCreated(VoiceRoomApiProvider.postSelectedShareItem(strM149818o, userIdList, str2)).subscribe(ffw.m121194e(new e30() { // from class: l.eyp
            @Override // p149l.e30
            public final void call(Object obj) {
                gyp.m128718S3(this.f93783a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.fyp
            @Override // p149l.e30
            public final void call(Object obj) {
                gyp.m128720U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m128724Y3(@NotNull String scene) {
        scene.getClass();
        this.inviteScene = scene;
        m128722W3(scene);
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m128725Z3(BLiveEnvelope bLiveEnvelope) {
        byp bypVar = (byp) this.viewModel;
        ave0 ave0Var = ave0.INSTANCE;
        BLiveData bLiveData = bLiveEnvelope.data;
        bypVar.m104505U(ave0Var.m99163a(bLiveData.shareItems, bLiveData.masks));
    }
}
