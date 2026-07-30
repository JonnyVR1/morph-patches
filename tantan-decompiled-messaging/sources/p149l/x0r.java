package p149l;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongPageView;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class x0r implements s7m<e1r> {

    /* JADX INFO: renamed from: a */
    public final KtvAlreadyChooseSongPageView f188989a;

    /* JADX INFO: renamed from: b */
    public j0r f188990b;

    /* JADX INFO: renamed from: c */
    public e1r<nnn0, x0r> f188991c;

    public x0r(Act act) {
        this.f188989a = KtvAlreadyChooseSongPageView.m77033i0(act.getLayoutInflater());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f188989a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(e1r e1rVar) {
        this.f188991c = e1rVar;
    }

    /* JADX INFO: renamed from: b */
    public View m206645b() {
        return this.f188989a;
    }

    /* JADX INFO: renamed from: c */
    public void m206646c() {
        this.f188989a.f52376f.setVisibility(0);
        this.f188989a.f52375e.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public void m206647d(List<BLiveVoiceKTVOrder> list) {
        this.f188989a.f52376f.setVisibility(8);
        this.f188989a.f52375e.setVisibility(0);
        this.f188990b.m139201G(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        boolean z = this.f188991c.m206027E2().m160249P2().m102069r().m201354G(ypv.f199493a.m199309D0()).isManager || this.f188991c.m206027E2().mo97490p();
        Act act = getAct();
        final e1r<nnn0, x0r> e1rVar = this.f188991c;
        Objects.requireNonNull(e1rVar);
        j0r j0rVar = new j0r(act, new e30() { // from class: l.w0r
            @Override // p149l.e30
            public final void call(Object obj) {
                e1rVar.m114428b4((Pair) obj);
            }
        }, z);
        this.f188990b = j0rVar;
        this.f188989a.setAdapter(j0rVar);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
