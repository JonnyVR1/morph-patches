package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.app.PutongMvpFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.MomentVisitorsFrag;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import l.cwf0;
import l.e30;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0005R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006,"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/MomentVisitorsFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/ui/visitor/c;", "Lcom/p1/mobile/putong/core/ui/visitor/d;", "<init>", "()V", "R4", "()Lcom/p1/mobile/putong/core/ui/visitor/c;", "S4", "()Lcom/p1/mobile/putong/core/ui/visitor/d;", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "f4", "Ll/cwf0;", "B", "Ll/cwf0;", "Q4", "()Ll/cwf0;", "setPermissionPageHelper", "(Ll/cwf0;)V", "permissionPageHelper", "C", "P4", "setDefaultPageHelper", "defaultPageHelper", "D", "getPrivilegePageHelper", "setPrivilegePageHelper", "privilegePageHelper", "", "E", "Z", "hasPermission", "", "F", "Ljava/lang/String;", "from", "G", "hideNavigation", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MomentVisitorsFrag extends PutongMvpFrag<C0483c, C0484d> {

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
        this.defaultPageHelper = new cwf0(CoreModule.m1854P().m11706a().m5386Y9() ? "p_my_visitor" : "p_moment_visitor", MomentVisitorsAct.class.getName());
        this.privilegePageHelper = new cwf0("p_my_visitor", MomentVisitorsAct.class.getName());
    }

    /* JADX INFO: renamed from: O4 */
    public static void m11287O4(MomentVisitorsFrag momentVisitorsFrag, c cVar) {
        cVar.getClass();
        if (NullChecker.b(momentVisitorsFrag.pageHelper)) {
            if (cVar == c.g) {
                if (TextUtils.equals(momentVisitorsFrag.from, "from_meet_diamond")) {
                    momentVisitorsFrag.privilegePageHelper.p(new j760[]{vwb.Y("source_page_id", "p_diamond_tab")});
                    momentVisitorsFrag.defaultPageHelper.p(new j760[]{vwb.Y("source_page_id", "p_diamond_tab")});
                    momentVisitorsFrag.permissionPageHelper.p(new j760[]{vwb.Y("source_page_id", "p_diamond_tab")});
                } else if (TextUtils.equals(momentVisitorsFrag.from, "p_see_who_likes_me_view_membership")) {
                    momentVisitorsFrag.privilegePageHelper.p(new j760[]{vwb.Y("source_page_id", momentVisitorsFrag.from)});
                    momentVisitorsFrag.defaultPageHelper.p(new j760[]{vwb.Y("source_page_id", momentVisitorsFrag.from)});
                    momentVisitorsFrag.permissionPageHelper.p(new j760[]{vwb.Y("source_page_id", momentVisitorsFrag.from)});
                }
                momentVisitorsFrag.privilegePageHelper.c();
                momentVisitorsFrag.defaultPageHelper.c();
                momentVisitorsFrag.permissionPageHelper.c();
                return;
            }
            if (cVar == c.i) {
                if (CoreModule.m1854P().m11706a().m19879f() && !xma.m27351F3() && !CoreModule.m1854P().m11706a().m5386Y9()) {
                    momentVisitorsFrag.privilegePageHelper.r();
                }
                if (momentVisitorsFrag.hasPermission) {
                    momentVisitorsFrag.defaultPageHelper.r();
                    return;
                } else {
                    momentVisitorsFrag.permissionPageHelper.r();
                    return;
                }
            }
            if (cVar != c.j) {
                if (cVar == c.m) {
                    momentVisitorsFrag.privilegePageHelper.e();
                    momentVisitorsFrag.defaultPageHelper.e();
                    momentVisitorsFrag.permissionPageHelper.e();
                    return;
                }
                return;
            }
            if (CoreModule.m1854P().m11706a().m19879f() && !xma.m27351F3() && !CoreModule.m1854P().m11706a().m5386Y9()) {
                momentVisitorsFrag.privilegePageHelper.g();
            }
            if (momentVisitorsFrag.hasPermission) {
                momentVisitorsFrag.defaultPageHelper.g();
            } else {
                momentVisitorsFrag.permissionPageHelper.g();
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

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C0483c mo1551M4() {
        return new C0483c(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public C0484d mo1552N4() {
        return new C0484d(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag, com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        this.permissionPageHelper.o(o6j0.b(new o6j0.a[]{o6j0.a.h("is_full", "1")}));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.gl00
            public final void call(Object obj) {
                MomentVisitorsFrag.m11287O4(this.f13352a, (c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m11292n4(@Nullable Bundle sis) {
        Bundle arguments = getArguments();
        this.hasPermission = arguments != null ? arguments.getBoolean("hasPermission", true) : true;
        Bundle arguments2 = getArguments();
        this.from = arguments2 != null ? arguments2.getString("from") : null;
        Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean("hideNavigation", false) : false;
        this.hideNavigation = z;
        ((C0483c) this.f1164z).m11415J0(this.hasPermission, this.from, z);
        CoreModule.f1534c.f3657n2.m22272g4(this.hasPermission);
        super.n4(sis);
    }
}
