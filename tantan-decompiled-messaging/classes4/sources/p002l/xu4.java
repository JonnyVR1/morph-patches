package p002l;

import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import l.j760;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/xu4;", "", "<init>", "()V", "Ll/x6s;", "presenter", "", "isChecked", "", "a", "(Ll/x6s;Z)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xu4 {

    @NotNull
    public static final xu4 INSTANCE = new xu4();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m26148a(@NotNull x6s<?, ?> presenter, boolean isChecked) {
        presenter.getClass();
        User userM14582l0 = presenter.m25547E2().m14582l0();
        userM14582l0.getClass();
        zvf0.w("e_live_bullet_switch", presenter.mo21430R2(), new j760[]{vwb.Y("anchor_id", ((DbObject) userM14582l0).id), vwb.Y("live_id", presenter.m25547E2().m17235k()), vwb.Y("state_before_sliding", !isChecked ? "on" : "off"), vwb.Y("state_end_sliding", isChecked ? "on" : "off")});
    }
}
