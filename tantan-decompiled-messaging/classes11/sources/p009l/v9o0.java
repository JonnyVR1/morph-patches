package p009l;

import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.ffw;
import l.ho2;
import l.qqn0;
import l.vdt;
import l.wxs;
import l.x6s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll/v9o0;", "Ll/x6s;", "Ll/ho2;", "", "Ll/k0p0$a;", "Ll/qqn0;", "info", "<init>", "(Ll/qqn0;)V", "", "t", "()V", "X0", "", "liveId", "X3", "(Ljava/lang/String;)V", "a4", "Z3", "Y3", "j", "Ljava/lang/String;", "voiceLiveId", "Ll/k0p0;", "k", "Lkotlin/Lazy;", "W3", "()Ll/k0p0;", "voiceVerifyHelper", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v9o0 extends x6s<ho2, Object> implements k0p0.InterfaceC0981a {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String voiceLiveId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy voiceVerifyHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9o0(@NotNull qqn0 qqn0Var) {
        super(qqn0Var);
        qqn0Var.getClass();
        this.voiceVerifyHelper = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.s9o0
            public final Object invoke() {
                return v9o0.m23315V3(this.f20140a);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static void m23312S3(v9o0 v9o0Var) {
        v9o0Var.m23318Y3();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m23313T3(v9o0 v9o0Var, LongLinkVoicePublicLive.VoicePublicLive voicePublicLive) {
        String liveId = voicePublicLive.getLiveId();
        liveId.getClass();
        v9o0Var.m23317X3(liveId);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m23314U3(v9o0 v9o0Var) {
        v9o0Var.m23319Z3();
    }

    /* JADX INFO: renamed from: V3 */
    public static k0p0 m23315V3(v9o0 v9o0Var) {
        return new k0p0(v9o0Var, v9o0Var.act());
    }

    /* JADX INFO: renamed from: W3 */
    public final k0p0 m23316W3() {
        return (k0p0) this.voiceVerifyHelper.getValue();
    }

    @Override // p009l.k0p0.InterfaceC0981a
    /* JADX INFO: renamed from: X0 */
    public void mo12440X0() {
        String str = this.voiceLiveId;
        if (str == null) {
            Intrinsics.r("voiceLiveId");
            str = null;
        }
        duringCreated(VoiceRoomApiProvider.publicVoiceRoom(str)).subscribe();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m23317X3(String liveId) {
        this.voiceLiveId = liveId;
        m23320a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m23319Z3() {
        if (vdt.b(3)) {
            mo12440X0();
        } else {
            m23316W3().m17262p();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m23320a4() {
        Dialog dialogZ = ((wxs) this).f.dialog().D(R.string.Bb).t0(R.string.Ab, new Runnable() { // from class: l.t9o0
            @Override // java.lang.Runnable
            public final void run() {
                v9o0.m23314U3(this.f20584a);
            }
        }).l0(R.string.zb, new Runnable() { // from class: l.u9o0
            @Override // java.lang.Runnable
            public final void run() {
                v9o0.m23312S3(this.f21024a);
            }
        }).z();
        dialogZ.setCanceledOnTouchOutside(false);
        dialogZ.show();
    }

    /* JADX INFO: renamed from: t */
    public void m23321t() {
        super/*l.k4t*/.t();
        duringCreated(E2().q1().l1()).subscribe(ffw.d(new e30() { // from class: l.r9o0
            public final void call(Object obj) {
                v9o0.m23313T3(this.f19701a, (LongLinkVoicePublicLive.VoicePublicLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m23318Y3() {
    }
}
