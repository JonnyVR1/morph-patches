package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoicePublicLive;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/v9o0;", "Ll/x6s;", "Ll/ho2;", "", "Ll/k0p0$a;", "Ll/qqn0;", BaseSei.INFO, "<init>", "(Ll/qqn0;)V", "", Constants.KEY_T, "()V", "X0", "", "liveId", "X3", "(Ljava/lang/String;)V", "a4", "Z3", "Y3", "j", "Ljava/lang/String;", "voiceLiveId", "Ll/k0p0;", "k", "Lkotlin/Lazy;", "W3", "()Ll/k0p0;", "voiceVerifyHelper", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class v9o0 extends x6s<ho2, Object> implements k0p0.InterfaceC17900a {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String voiceLiveId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy voiceVerifyHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9o0(@NotNull qqn0 qqn0Var) {
        super(qqn0Var);
        qqn0Var.getClass();
        this.voiceVerifyHelper = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.s9o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v9o0.m197588V3(this.f163204a);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static void m197585S3(v9o0 v9o0Var) {
        v9o0Var.m197591Y3();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m197586T3(v9o0 v9o0Var, LongLinkVoicePublicLive.VoicePublicLive voicePublicLive) {
        String liveId = voicePublicLive.getLiveId();
        liveId.getClass();
        v9o0Var.m197590X3(liveId);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m197587U3(v9o0 v9o0Var) {
        v9o0Var.m197592Z3();
    }

    /* JADX INFO: renamed from: V3 */
    public static k0p0 m197588V3(v9o0 v9o0Var) {
        return new k0p0(v9o0Var, v9o0Var.act());
    }

    /* JADX INFO: renamed from: W3 */
    public final k0p0 m197589W3() {
        return (k0p0) this.voiceVerifyHelper.getValue();
    }

    @Override // p149l.k0p0.InterfaceC17900a
    /* JADX INFO: renamed from: X0 */
    public void mo105874X0() {
        String str = this.voiceLiveId;
        if (str == null) {
            Intrinsics.m87502r("voiceLiveId");
            str = null;
        }
        duringCreated(VoiceRoomApiProvider.publicVoiceRoom(str)).subscribe();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m197590X3(String liveId) {
        this.voiceLiveId = liveId;
        m197593a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m197592Z3() {
        if (vdt.m198092b(3)) {
            mo105874X0();
        } else {
            m197589W3().m144112p();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m197593a4() {
        Dialog dialogM20567z = this.f188513f.dialog().m20500D(R$string.f46590Bb).m20556t0(R$string.f46568Ab, new Runnable() { // from class: l.t9o0
            @Override // java.lang.Runnable
            public final void run() {
                v9o0.m197587U3(this.f169045a);
            }
        }).m20542l0(R$string.f47674zb, new Runnable() { // from class: l.u9o0
            @Override // java.lang.Runnable
            public final void run() {
                v9o0.m197585S3(this.f175480a);
            }
        }).m20567z();
        dialogM20567z.setCanceledOnTouchOutside(false);
        dialogM20567z.show();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189121l1()).subscribe(ffw.m121193d(new e30() { // from class: l.r9o0
            @Override // p149l.e30
            public final void call(Object obj) {
                v9o0.m197586T3(this.f158423a, (LongLinkVoicePublicLive.VoicePublicLive) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m197591Y3() {
    }
}
