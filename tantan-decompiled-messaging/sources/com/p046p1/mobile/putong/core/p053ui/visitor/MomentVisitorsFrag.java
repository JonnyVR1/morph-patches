package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.visitor.MomentVisitorsFrag;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.cwf0;
import p149l.e30;
import p149l.mkd0;
import p149l.o6j0;
import p149l.vwb;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0005R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006,"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/MomentVisitorsFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/ui/visitor/c;", "Lcom/p1/mobile/putong/core/ui/visitor/d;", "<init>", "()V", "R4", "()Lcom/p1/mobile/putong/core/ui/visitor/c;", "S4", "()Lcom/p1/mobile/putong/core/ui/visitor/d;", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "f4", "Ll/cwf0;", "B", "Ll/cwf0;", "Q4", "()Ll/cwf0;", "setPermissionPageHelper", "(Ll/cwf0;)V", "permissionPageHelper", b2s.C_ZONE, "P4", "setDefaultPageHelper", "defaultPageHelper", "D", "getPrivilegePageHelper", "setPrivilegePageHelper", "privilegePageHelper", "", "E", "Z", "hasPermission", "", "F", "Ljava/lang/String;", "from", "G", "hideNavigation", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MomentVisitorsFrag extends PutongMvpFrag<C9047c, C9048d> {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public cwf0 permissionPageHelper = new cwf0("p_moment_visitor_set", MomentVisitorsAct.class.getName());

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public cwf0 defaultPageHelper;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public cwf0 privilegePageHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean hasPermission;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean hideNavigation;

    public MomentVisitorsFrag() {
        this.defaultPageHelper = new cwf0(CoreModule.m29935P().m94651a().mo33449Y9() ? "p_my_visitor" : "p_moment_visitor", MomentVisitorsAct.class.getName());
        this.privilegePageHelper = new cwf0("p_my_visitor", MomentVisitorsAct.class.getName());
    }

    /* JADX INFO: renamed from: O4 */
    public static void m57787O4(MomentVisitorsFrag momentVisitorsFrag, C4319c c4319c) {
        c4319c.getClass();
        if (NullChecker.m81304b(momentVisitorsFrag.pageHelper)) {
            if (c4319c == C4319c.f15546g) {
                if (TextUtils.equals(momentVisitorsFrag.from, "from_meet_diamond")) {
                    momentVisitorsFrag.privilegePageHelper.m109040p(vwb.m200311Y("source_page_id", "p_diamond_tab"));
                    momentVisitorsFrag.defaultPageHelper.m109040p(vwb.m200311Y("source_page_id", "p_diamond_tab"));
                    momentVisitorsFrag.permissionPageHelper.m109040p(vwb.m200311Y("source_page_id", "p_diamond_tab"));
                } else if (TextUtils.equals(momentVisitorsFrag.from, "p_see_who_likes_me_view_membership")) {
                    momentVisitorsFrag.privilegePageHelper.m109040p(vwb.m200311Y("source_page_id", momentVisitorsFrag.from));
                    momentVisitorsFrag.defaultPageHelper.m109040p(vwb.m200311Y("source_page_id", momentVisitorsFrag.from));
                    momentVisitorsFrag.permissionPageHelper.m109040p(vwb.m200311Y("source_page_id", momentVisitorsFrag.from));
                }
                momentVisitorsFrag.privilegePageHelper.m109027c();
                momentVisitorsFrag.defaultPageHelper.m109027c();
                momentVisitorsFrag.permissionPageHelper.m109027c();
                return;
            }
            if (c4319c == C4319c.f15548i) {
                if (CoreModule.m29935P().m94651a().mo158371f() && !xma.m210043F3() && !CoreModule.m29935P().m94651a().mo33449Y9()) {
                    momentVisitorsFrag.privilegePageHelper.m109042r();
                }
                if (momentVisitorsFrag.hasPermission) {
                    momentVisitorsFrag.defaultPageHelper.m109042r();
                    return;
                } else {
                    momentVisitorsFrag.permissionPageHelper.m109042r();
                    return;
                }
            }
            if (c4319c != C4319c.f15549j) {
                if (c4319c == C4319c.f15552m) {
                    momentVisitorsFrag.privilegePageHelper.m109029e();
                    momentVisitorsFrag.defaultPageHelper.m109029e();
                    momentVisitorsFrag.permissionPageHelper.m109029e();
                    return;
                }
                return;
            }
            if (CoreModule.m29935P().m94651a().mo158371f() && !xma.m210043F3() && !CoreModule.m29935P().m94651a().mo33449Y9()) {
                momentVisitorsFrag.privilegePageHelper.m109031g();
            }
            if (momentVisitorsFrag.hasPermission) {
                momentVisitorsFrag.defaultPageHelper.m109031g();
            } else {
                momentVisitorsFrag.permissionPageHelper.m109031g();
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P4, reason: from getter */
    public final cwf0 getDefaultPageHelper() {
        return this.defaultPageHelper;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4, reason: from getter */
    public final cwf0 getPermissionPageHelper() {
        return this.permissionPageHelper;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C9047c mo29641M4() {
        return new C9047c(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public C9048d mo29642N4() {
        return new C9048d(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.permissionPageHelper.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("is_full", "1")));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.gl00
            @Override // p149l.e30
            public final void call(Object obj) {
                MomentVisitorsFrag.m57787O4(this.f103275a, (C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(@Nullable Bundle sis) {
        Bundle arguments = getArguments();
        this.hasPermission = arguments != null ? arguments.getBoolean("hasPermission", true) : true;
        Bundle arguments2 = getArguments();
        this.from = arguments2 != null ? arguments2.getString("from") : null;
        Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean("hideNavigation", false) : false;
        this.hideNavigation = z;
        ((C9047c) this.f17175z).m57902J0(this.hasPermission, this.from, z);
        CoreModule.f17545c.f19668n2.m175456g4(this.hasPermission);
        super.mo20594n4(sis);
    }
}
