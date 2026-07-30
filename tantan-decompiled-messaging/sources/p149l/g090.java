package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"Ll/g090;", "Ll/o090;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "h", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class g090 extends o090 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g090(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    @Override // p149l.o090, p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return (xma.m210060Y3() || !sj20.m184407a().m184408b() || zb90.m217832i() || CoreModule.f17545c.f19598Q1.f20117R.m34760N() || sj20.m184407a().m184410d()) ? false : true;
    }

    @Override // p149l.o090, p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_hwafter24hoddefault";
    }

    @Override // p149l.o090
    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo123954s() {
        return "e_privilege_button_hwafter24hoddefault";
    }
}
