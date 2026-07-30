package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000e"}, m88121d2 = {"Ll/k890;", "Ll/s890;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "h", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class k890 extends s890 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k890(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    @Override // p153l.s890, p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return (joa.m146374Z3() || !cs20.m112113a().m112114b() || dk90.m116230i() || CoreModule.f18264c.f20340Q1.f20859R.m35763N() || cs20.m112113a().m112116d()) ? false : true;
    }

    @Override // p153l.s890, p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_hwafter24hoddefault";
    }

    @Override // p153l.s890
    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo148687s() {
        return "e_privilege_button_hwafter24hoddefault";
    }
}
