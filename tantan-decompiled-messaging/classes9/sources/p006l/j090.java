package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Ll/j090;", "Ll/a190;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "h", "()Ljava/lang/String;", "t", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j090 extends a190 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j090(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    @Override // p006l.a190, p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return (xma.m27368Y3() || !sj20.m23814a().m23815b() || CoreModule.f1534c.f3587Q1.f4106R.m6697N() || sj20.m23814a().m23817d()) ? false : true;
    }

    @Override // p006l.a190, p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_hwafter24hodsvip";
    }

    @Override // p006l.a190
    @NotNull
    /* JADX INFO: renamed from: t */
    public String mo11698t() {
        return "e_privilege_button_hwafter24hodsvip";
    }
}
