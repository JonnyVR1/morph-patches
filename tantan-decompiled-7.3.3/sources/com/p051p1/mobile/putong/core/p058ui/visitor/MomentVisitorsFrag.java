package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.visitor.MomentVisitorsFrag;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;
import p153l.joa;
import p153l.jyb;
import p153l.l4g0;
import p153l.psd0;
import p153l.sfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0005R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006,"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/MomentVisitorsFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/ui/visitor/c;", "Lcom/p1/mobile/putong/core/ui/visitor/d;", "<init>", "()V", "R4", "()Lcom/p1/mobile/putong/core/ui/visitor/c;", "S4", "()Lcom/p1/mobile/putong/core/ui/visitor/d;", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "f4", "Ll/l4g0;", "B", "Ll/l4g0;", "Q4", "()Ll/l4g0;", "setPermissionPageHelper", "(Ll/l4g0;)V", "permissionPageHelper", c4s.C_ZONE, "P4", "setDefaultPageHelper", "defaultPageHelper", "D", "getPrivilegePageHelper", "setPrivilegePageHelper", "privilegePageHelper", "", "E", "Z", "hasPermission", "", "F", "Ljava/lang/String;", "from", "G", "hideNavigation", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MomentVisitorsFrag extends PutongMvpFrag<C9210c, C9211d> {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public l4g0 permissionPageHelper = new l4g0("p_moment_visitor_set", MomentVisitorsAct.class.getName());

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public l4g0 defaultPageHelper;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public l4g0 privilegePageHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean hasPermission;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public boolean hideNavigation;

    public MomentVisitorsFrag() {
        this.defaultPageHelper = new l4g0(CoreModule.m30933P().m143405a().mo34452Y9() ? "p_my_visitor" : "p_moment_visitor", MomentVisitorsAct.class.getName());
        this.privilegePageHelper = new l4g0("p_my_visitor", MomentVisitorsAct.class.getName());
    }

    /* JADX INFO: renamed from: O4 */
    public static void m58970O4(MomentVisitorsFrag momentVisitorsFrag, C4470c c4470c) {
        c4470c.getClass();
        if (NullChecker.m82487b(momentVisitorsFrag.pageHelper)) {
            if (c4470c == C4470c.f16265g) {
                if (TextUtils.equals(momentVisitorsFrag.from, "from_meet_diamond")) {
                    momentVisitorsFrag.privilegePageHelper.m152781p(jyb.m147494Y("source_page_id", "p_diamond_tab"));
                    momentVisitorsFrag.defaultPageHelper.m152781p(jyb.m147494Y("source_page_id", "p_diamond_tab"));
                    momentVisitorsFrag.permissionPageHelper.m152781p(jyb.m147494Y("source_page_id", "p_diamond_tab"));
                } else if (TextUtils.equals(momentVisitorsFrag.from, "p_see_who_likes_me_view_membership")) {
                    momentVisitorsFrag.privilegePageHelper.m152781p(jyb.m147494Y("source_page_id", momentVisitorsFrag.from));
                    momentVisitorsFrag.defaultPageHelper.m152781p(jyb.m147494Y("source_page_id", momentVisitorsFrag.from));
                    momentVisitorsFrag.permissionPageHelper.m152781p(jyb.m147494Y("source_page_id", momentVisitorsFrag.from));
                }
                momentVisitorsFrag.privilegePageHelper.m152768c();
                momentVisitorsFrag.defaultPageHelper.m152768c();
                momentVisitorsFrag.permissionPageHelper.m152768c();
                return;
            }
            if (c4470c == C4470c.f16267i) {
                if (CoreModule.m30933P().m143405a().mo180463f() && !joa.m146357G3() && !CoreModule.m30933P().m143405a().mo34452Y9()) {
                    momentVisitorsFrag.privilegePageHelper.m152783r();
                }
                if (momentVisitorsFrag.hasPermission) {
                    momentVisitorsFrag.defaultPageHelper.m152783r();
                    return;
                } else {
                    momentVisitorsFrag.permissionPageHelper.m152783r();
                    return;
                }
            }
            if (c4470c != C4470c.f16268j) {
                if (c4470c == C4470c.f16271m) {
                    momentVisitorsFrag.privilegePageHelper.m152770e();
                    momentVisitorsFrag.defaultPageHelper.m152770e();
                    momentVisitorsFrag.permissionPageHelper.m152770e();
                    return;
                }
                return;
            }
            if (CoreModule.m30933P().m143405a().mo180463f() && !joa.m146357G3() && !CoreModule.m30933P().m143405a().mo34452Y9()) {
                momentVisitorsFrag.privilegePageHelper.m152772g();
            }
            if (momentVisitorsFrag.hasPermission) {
                momentVisitorsFrag.defaultPageHelper.m152772g();
            } else {
                momentVisitorsFrag.permissionPageHelper.m152772g();
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P4, reason: from getter */
    public final l4g0 getDefaultPageHelper() {
        return this.defaultPageHelper;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4, reason: from getter */
    public final l4g0 getPermissionPageHelper() {
        return this.permissionPageHelper;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C9210c mo30639M4() {
        return new C9210c(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public C9211d mo30640N4() {
        return new C9211d(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.permissionPageHelper.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("is_full", "1")));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.pt00
            @Override // p153l.y20
            public final void call(Object obj) {
                MomentVisitorsFrag.m58970O4(this.f153983a, (C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(@Nullable Bundle sis) {
        Bundle arguments = getArguments();
        this.hasPermission = arguments != null ? arguments.getBoolean("hasPermission", true) : true;
        Bundle arguments2 = getArguments();
        this.from = arguments2 != null ? arguments2.getString("from") : null;
        Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean("hideNavigation", false) : false;
        this.hideNavigation = z;
        ((C9210c) this.f17894z).m59085J0(this.hasPermission, this.from, z);
        CoreModule.f18264c.f20410n2.m121487g4(this.hasPermission);
        super.mo21593n4(sis);
    }
}
