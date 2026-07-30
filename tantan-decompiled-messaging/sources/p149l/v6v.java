package p149l;

import android.util.Pair;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveAssert;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class v6v extends bwr<f7v> {

    /* JADX INFO: renamed from: a */
    public final mss f180230a;

    public v6v(mss mssVar, VNavigationBar vNavigationBar, boolean z) {
        super(mssVar.f135531b);
        this.f180230a = mssVar;
        mo51532C(new f7v(vNavigationBar, z));
    }

    /* JADX INFO: renamed from: y2 */
    private C22306c<Pair<BLiveVoiceLiveAssert, List<BLiveVoiceSquareButton>>> m197229y2() {
        C22306c<BLiveVoiceLiveAssert> myGuild = VirtualVoiceRoomApiProvider.getMyGuild(ypv.f199493a.m199309D0());
        Objects.requireNonNull(myGuild);
        return C22306c.zip(myGuild.onErrorResumeNext(new w9j() { // from class: l.r6v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.empty();
            }
        }), VirtualVoiceRoomApiProvider.getVoiceSquareButtons().onErrorResumeNext(new w9j() { // from class: l.s6v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.empty();
            }
        }), new x9j() { // from class: l.t6v
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Pair.create((BLiveVoiceLiveAssert) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: A2 */
    public void m197230A2(BLiveSquareTab bLiveSquareTab) {
        ((f7v) this.viewModel).m119838q(this.f180230a.m156171a(), bLiveSquareTab);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ C22306c m197231B2(C4319c c4319c) {
        return m197229y2();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m197232C2(Pair pair) {
        ((f7v) this.viewModel).m119835A(this.f180230a.m156171a(), (List) pair.second);
        ((f7v) this.viewModel).m119836B((BLiveVoiceLiveAssert) pair.first);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m197233D2(Pair pair) {
        ((f7v) this.viewModel).m119835A(this.f180230a.m156171a(), (List) pair.second);
        ((f7v) this.viewModel).m119836B((BLiveVoiceLiveAssert) pair.first);
    }

    /* JADX INFO: renamed from: E2 */
    public void m197234E2() {
        duringCreated(m197229y2()).subscribe(ffw.m121197h(new e30() { // from class: l.u6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174887a.m197233D2((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public void m197235z2() {
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.o6v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).flatMap(new w9j() { // from class: l.p6v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f147446a.m197231B2((C4319c) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.q6v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152961a.m197232C2((Pair) obj);
            }
        }));
    }
}
