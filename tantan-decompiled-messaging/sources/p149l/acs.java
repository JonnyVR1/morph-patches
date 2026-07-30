package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveTask;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubTaskModelView;

/* JADX INFO: loaded from: classes4.dex */
public class acs extends d1q<LiveFansClubTaskModelView> {

    /* JADX INFO: renamed from: a */
    public final BLiveTask f68875a;

    public acs(@NonNull BLiveTask bLiveTask) {
        this.f68875a = bLiveTask;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveFansClubTaskModelView liveFansClubTaskModelView) {
        super.mo70566u(liveFansClubTaskModelView);
        liveFansClubTaskModelView.m73006b(this.f68875a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.m196470a(this.f68875a, ((acs) obj).f68875a);
    }

    public int hashCode() {
        return v050.m196471b(this.f68875a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168535u3;
    }
}
