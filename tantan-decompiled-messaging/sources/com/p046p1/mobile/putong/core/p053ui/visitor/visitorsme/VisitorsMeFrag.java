package com.p046p1.mobile.putong.core.p053ui.visitor.visitorsme;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.visitor.visitorsme.VisitorsMeFrag;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.cwf0;
import p149l.e30;
import p149l.i9m0;
import p149l.mkd0;
import p149l.r9m0;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\u0005R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/i9m0;", "Ll/r9m0;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "P4", "()Ll/i9m0;", "Q4", "()Ll/r9m0;", "f4", "", "B", "Ljava/lang/String;", "from", "Ll/cwf0;", b2s.C_ZONE, "Ll/cwf0;", "myVisitorPageHelper", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VisitorsMeFrag extends PutongMvpFrag<i9m0, r9m0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public cwf0 myVisitorPageHelper = new cwf0("p_my_visitor", VisitorsMeFrag.class.getName());

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.visitorsme.VisitorsMeFrag$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag$a;", "", "<init>", "()V", "", "from", "", "fromDeepLink", "hideNavigation", "Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "a", "(Ljava/lang/String;ZZ)Lcom/p1/mobile/putong/core/ui/visitor/visitorsme/VisitorsMeFrag;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final VisitorsMeFrag m58075a(@Nullable String from, boolean fromDeepLink, boolean hideNavigation) {
            VisitorsMeFrag visitorsMeFrag = new VisitorsMeFrag();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(from)) {
                bundle.putString("from", from);
            }
            bundle.putBoolean("fromDeeplink", fromDeepLink);
            bundle.putBoolean("hideNavigation", hideNavigation);
            visitorsMeFrag.setArguments(bundle);
            return visitorsMeFrag;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static void m58072O4(VisitorsMeFrag visitorsMeFrag, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15546g) {
            visitorsMeFrag.myVisitorPageHelper.m109027c();
            return;
        }
        if (Intrinsics.m87488d(c4319c, C4319c.f15548i)) {
            visitorsMeFrag.myVisitorPageHelper.m109042r();
        } else if (Intrinsics.m87488d(c4319c, C4319c.f15549j)) {
            visitorsMeFrag.myVisitorPageHelper.m109031g();
        } else if (Intrinsics.m87488d(c4319c, C4319c.f15552m)) {
            visitorsMeFrag.myVisitorPageHelper.m109029e();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public i9m0 mo29641M4() {
        return new i9m0(this, this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public r9m0 mo29642N4() {
        return new r9m0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        if (TextUtils.equals(this.from, "from_meet_diamond")) {
            this.myVisitorPageHelper.m109040p(vwb.m200311Y("source_page_id", "p_diamond_tab"));
        } else if (TextUtils.equals(this.from, "p_see_who_likes_me_view_membership")) {
            this.myVisitorPageHelper.m109040p(vwb.m200311Y("source_page_id", this.from));
        }
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.q8m0
            @Override // p149l.e30
            public final void call(Object obj) {
                VisitorsMeFrag.m58072O4(this.f153199a, (C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(@Nullable Bundle sis) {
        super.mo20594n4(sis);
        Bundle arguments = getArguments();
        this.from = arguments != null ? arguments.getString("from") : null;
    }
}
