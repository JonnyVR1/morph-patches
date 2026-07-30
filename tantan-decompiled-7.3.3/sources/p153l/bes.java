package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveTask;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubTaskModelView;

/* JADX INFO: loaded from: classes4.dex */
public class bes extends d3q<LiveFansClubTaskModelView> {

    /* JADX INFO: renamed from: a */
    public final BLiveTask f76415a;

    public bes(@NonNull BLiveTask bLiveTask) {
        this.f76415a = bLiveTask;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveFansClubTaskModelView liveFansClubTaskModelView) {
        super.mo71749u(liveFansClubTaskModelView);
        liveFansClubTaskModelView.m74189b(this.f76415a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k950.m148863a(this.f76415a, ((bes) obj).f76415a);
    }

    public int hashCode() {
        return k950.m148864b(this.f76415a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199267u3;
    }
}
