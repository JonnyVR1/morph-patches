package p002l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubTaskModelView;
import com.p1.mobile.putong.live.base.data.BLiveTask;
import l.d1q;
import l.v050;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class acs extends d1q<LiveFansClubTaskModelView> {

    /* JADX INFO: renamed from: a */
    public final BLiveTask f7502a;

    public acs(@NonNull BLiveTask bLiveTask) {
        this.f7502a = bLiveTask;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m9500u(LiveFansClubTaskModelView liveFansClubTaskModelView) {
        super.u(liveFansClubTaskModelView);
        liveFansClubTaskModelView.m6529b(this.f7502a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.a(this.f7502a, ((acs) obj).f7502a);
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f7502a});
    }

    /* JADX INFO: renamed from: o */
    public int m9499o() {
        return t6c0.f20031u3;
    }
}
