package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/zio0;", "Ll/y8s;", "Ll/oo2;", "", "Ll/o9p0$a;", "Ll/uzn0;", BaseSei.INFO, "<init>", "(Ll/uzn0;)V", "", Constants.KEY_T, "()V", "X0", "", "liveId", "X3", "(Ljava/lang/String;)V", "a4", "Z3", "Y3", "j", "Ljava/lang/String;", "voiceLiveId", "Ll/o9p0;", "k", "Lkotlin/Lazy;", "W3", "()Ll/o9p0;", "voiceVerifyHelper", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class zio0 extends y8s<oo2, Object> implements o9p0.InterfaceC19062a {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String voiceLiveId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy voiceVerifyHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zio0(@NotNull uzn0 uzn0Var) {
        super(uzn0Var);
        uzn0Var.getClass();
        this.voiceVerifyHelper = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.wio0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zio0.m219931V3(this.f189377a);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static void m219928S3(zio0 zio0Var) {
        zio0Var.m219934Y3();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m219929T3(zio0 zio0Var, LongLinkVoicePublicLive.VoicePublicLive voicePublicLive) {
        String liveId = voicePublicLive.getLiveId();
        liveId.getClass();
        zio0Var.m219933X3(liveId);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m219930U3(zio0 zio0Var) {
        zio0Var.m219935Z3();
    }

    /* JADX INFO: renamed from: V3 */
    public static o9p0 m219931V3(zio0 zio0Var) {
        return new o9p0(zio0Var, zio0Var.act());
    }

    /* JADX INFO: renamed from: W3 */
    public final o9p0 m219932W3() {
        return (o9p0) this.voiceVerifyHelper.getValue();
    }

    @Override // p153l.o9p0.InterfaceC19062a
    /* JADX INFO: renamed from: X0 */
    public void mo130359X0() {
        String str = this.voiceLiveId;
        if (str == null) {
            Intrinsics.m88391r("voiceLiveId");
            str = null;
        }
        duringCreated(VoiceRoomApiProvider.publicVoiceRoom(str)).subscribe();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m219933X3(String liveId) {
        this.voiceLiveId = liveId;
        m219936a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m219935Z3() {
        if (wft.m206159b(3)) {
            mo130359X0();
        } else {
            m219932W3().m166794p();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m219936a4() {
        Dialog dialogM21566z = this.f196919f.dialog().m21499D(R$string.f47438Bb).m21555t0(R$string.f47416Ab, new Runnable() { // from class: l.xio0
            @Override // java.lang.Runnable
            public final void run() {
                zio0.m219930U3(this.f194474a);
            }
        }).m21541l0(R$string.f48522zb, new Runnable() { // from class: l.yio0
            @Override // java.lang.Runnable
            public final void run() {
                zio0.m219928S3(this.f200229a);
            }
        }).m21566z();
        dialogM21566z.setCanceledOnTouchOutside(false);
        dialogM21566z.show();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98303l1()).subscribe(dhw.m115825d(new y20() { // from class: l.vio0
            @Override // p153l.y20
            public final void call(Object obj) {
                zio0.m219929T3(this.f184285a, (LongLinkVoicePublicLive.VoicePublicLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m219934Y3() {
    }
}
