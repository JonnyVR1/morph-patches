package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, m88121d2 = {"Ll/s7n0;", "Ll/i6t;", "Ll/rwn0;", "Ll/y7n0;", "Ll/noo0;", BaseSei.INFO, "<init>", "(Ll/noo0;)V", "", "R3", "()V", Constants.KEY_T, "S3", "P3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s7n0 extends i6t<rwn0, y7n0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7n0(@NotNull noo0 noo0Var) {
        super(noo0Var);
        noo0Var.getClass();
        mo52715C(new y7n0());
    }

    /* JADX INFO: renamed from: J3 */
    public static void m185027J3(Throwable th) {
        l7n0 l7n0Var = l7n0.INSTANCE;
        th.getClass();
        l7n0Var.m153146a(th);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m185028K3(s7n0 s7n0Var, VoiceChatGroupInfo voiceChatGroupInfo) {
        ((y7n0) s7n0Var.viewModel).m214589z();
        o1j0.m165649w(R$string.f47830Tf);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m185029L3(s7n0 s7n0Var, VoiceChatGroupInfo voiceChatGroupInfo) {
        y7n0 y7n0Var = (y7n0) s7n0Var.viewModel;
        voiceChatGroupInfo.getClass();
        y7n0Var.m214574G(voiceChatGroupInfo);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m185030M3(s7n0 s7n0Var, BLiveEnvelope bLiveEnvelope) {
        ((y7n0) s7n0Var.viewModel).m214573E(true);
        ((y7n0) s7n0Var.viewModel).m214571B();
    }

    /* JADX INFO: renamed from: N3 */
    public static void m185031N3(s7n0 s7n0Var, Boolean bool) {
        s7n0Var.m185033R3();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m185032O3(Throwable th) {
        l7n0 l7n0Var = l7n0.INSTANCE;
        th.getClass();
        l7n0Var.m153146a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    private final void m185033R3() {
        b6n0 b6n0Var = b6n0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(b6n0Var.m102788p(strM202191k)).subscribe(dhw.m115829h(new y20() { // from class: l.n7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7n0.m185029L3(this.f140614a, (VoiceChatGroupInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m185034P3() {
        b6n0 b6n0Var = b6n0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(b6n0Var.m102789q(strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.o7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7n0.m185028K3(this.f145284a, (VoiceChatGroupInfo) obj);
            }
        }, new y20() { // from class: l.p7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7n0.m185027J3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m185035S3() {
        b6n0 b6n0Var = b6n0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(b6n0Var.m102786n(strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.q7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7n0.m185030M3(this.f155995a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.r7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7n0.m185032O3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().LiveVoiceChatGroupEvent.openChatGroupContentDialog(), new y20() { // from class: l.m7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7n0.m185031N3(this.f135092a, (Boolean) obj);
            }
        });
    }
}
