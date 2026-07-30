package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/qen0;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "N3", "(Lcom/p1/mobile/putong/data/User;)V", "", "userId", "P3", "(Ljava/lang/String;)V", Constants.KEY_T, "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qen0 extends pat<ho2> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qen0(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m174221J3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static void m174222K3(qen0 qen0Var, User user) {
        qen0Var.m174225N3(user);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m174224M3(qen0 qen0Var, String str, BLiveEnvelope bLiveEnvelope) {
        qen0Var.m206028F2().VoiceBlackListEvent.updateBlackStatus().mo172463j(str);
        lsi0.m151595y(w8u.m202217t(R$string.f46704Gf));
    }

    /* JADX INFO: renamed from: N3 */
    private final void m174225N3(final User user) {
        if (user != null) {
            String strM202213p = w8u.m202213p(user.name, 12);
            String strM202218u = w8u.m202218u(R$string.f46572Af, strM202213p);
            String strM202217t = w8u.m202217t(R$string.f46682Ff);
            strM202213p.getClass();
            new xh0.C21150a(this.f188513f).m208740s("").m208731j(wxr.INSTANCE.m206025b(strM202218u + strM202217t, strM202213p, kvc0.m147352a(h1c0.f105328Q))).m208738q(R$string.f46660Ef).m208736o(new View.OnClickListener() { // from class: l.nen0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qen0.m174226O3(this.f138633a, user, view);
                }
            }).m208737p(h1c0.f105357d).m208727f(w8u.m202217t(R$string.f46638Df)).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m174226O3(qen0 qen0Var, User user, View view) {
        String str = user.f56011id;
        str.getClass();
        qen0Var.m174227P3(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P3 */
    private final void m174227P3(final String userId) {
        duringCreated(VoiceRoomApiProvider.addDeFriendWithUserId(m206027E2().m149818o(), userId)).subscribe(ffw.m121194e(new e30() { // from class: l.oen0
            @Override // p149l.e30
            public final void call(Object obj) {
                qen0.m174224M3(this.f143351a, userId, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.pen0
            @Override // p149l.e30
            public final void call(Object obj) {
                qen0.m174221J3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VoiceBlackListEvent.addBlackList().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.men0
            @Override // p149l.e30
            public final void call(Object obj) {
                qen0.m174222K3(this.f133461a, (User) obj);
            }
        }));
    }
}
