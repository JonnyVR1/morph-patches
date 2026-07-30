package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/wv4;", "", "<init>", "()V", "Ll/y8s;", "presenter", "", "isChecked", "", "a", "(Ll/y8s;Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wv4 {

    @NotNull
    public static final wv4 INSTANCE = new wv4();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.oo2, l.vp20] */
    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m207988a(@NotNull y8s<?, ?> presenter, boolean isChecked) {
        presenter.getClass();
        User userM168532l0 = presenter.m213810E2().m168532l0();
        userM168532l0.getClass();
        String strMo78457R2 = presenter.mo78457R2();
        pf60 pf60VarM147494Y = jyb.m147494Y("anchor_id", userM168532l0.f56859id);
        pf60 pf60VarM147494Y2 = jyb.m147494Y("live_id", presenter.m213810E2().m202191k());
        String str = BLiveOperationTitleShowType.off;
        pf60 pf60VarM147494Y3 = jyb.m147494Y("state_before_sliding", !isChecked ? "on" : BLiveOperationTitleShowType.off);
        if (isChecked) {
            str = "on";
        }
        i4g0.m138525w("e_live_bullet_switch", strMo78457R2, pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, jyb.m147494Y("state_end_sliding", str));
    }
}
