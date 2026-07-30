package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/xu4;", "", "<init>", "()V", "Ll/x6s;", "presenter", "", "isChecked", "", "a", "(Ll/x6s;Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xu4 {

    @NotNull
    public static final xu4 INSTANCE = new xu4();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2, l.lh20] */
    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m211078a(@NotNull x6s<?, ?> presenter, boolean isChecked) {
        presenter.getClass();
        User userM132146l0 = presenter.m206027E2().m132146l0();
        userM132146l0.getClass();
        String strMo77274R2 = presenter.mo77274R2();
        j760 j760VarM200311Y = vwb.m200311Y("anchor_id", userM132146l0.f56011id);
        j760 j760VarM200311Y2 = vwb.m200311Y("live_id", presenter.m206027E2().m149814k());
        String str = BLiveOperationTitleShowType.off;
        j760 j760VarM200311Y3 = vwb.m200311Y("state_before_sliding", !isChecked ? "on" : BLiveOperationTitleShowType.off);
        if (isChecked) {
            str = "on";
        }
        zvf0.m220401w("e_live_bullet_switch", strMo77274R2, j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, vwb.m200311Y("state_end_sliding", str));
    }
}
