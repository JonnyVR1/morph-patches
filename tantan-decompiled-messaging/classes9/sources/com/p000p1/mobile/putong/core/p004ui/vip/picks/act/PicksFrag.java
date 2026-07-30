package com.p000p1.mobile.putong.core.p004ui.vip.picks.act;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.app.PutongMvpFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.act.PicksFrag;
import com.p1.mobile.android.app.Frag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.cwf0;
import l.e30;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.bh70;
import p006l.qg70;
import p006l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001b\u0010(\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u000fR\u001b\u0010+\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0012¨\u0006."}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "Ll/bh70;", "<init>", "()V", "V4", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/a;", "W4", "()Ll/bh70;", "", "pageId", "()Ljava/lang/String;", "Ll/qg70;", "T4", "()Ll/qg70;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "S4", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "", "disableAutoPV", "()Z", "", "f4", "d4", "B", "Ljava/lang/String;", "C", "Z", "X4", "setSingleFrag", "(Z)V", "isSingleFrag", "D", "swipeFromKey", "E", "sourcePage", "F", "Lkotlin/Lazy;", "R4", "adapter", "G", "U4", "touchHelper", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PicksFrag extends PutongMvpFrag<C0405a, bh70> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public String pageId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean isSingleFrag;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final String swipeFromKey = "swipeFrom";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public String sourcePage = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.vd70
        public final Object invoke() {
            return PicksFrag.m10205Q4(this.f24275a);
        }
    });

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Lazy touchHelper = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.wd70
        public final Object invoke() {
            return PicksFrag.m10204P4(this.f25106a);
        }
    });

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.act.PicksFrag$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/PicksFrag$a;", "", "<init>", "()V", "", "from", "pageId", "", "isSingleFrag", "sourcePage", "Lcom/p1/mobile/android/app/Frag;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/p1/mobile/android/app/Frag;", "FROM_HOME_MEMBER", "Ljava/lang/String;", "IS_SINGLE_FRAG", "ACT_PAGE_ID", "SOURCE_PAGE", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Frag m10213b(Companion companion, String str, String str2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            return companion.m10214a(str, str2, z, str3);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Frag m10214a(@Nullable String from, @NotNull String pageId, boolean isSingleFrag, @NotNull String sourcePage) {
            pageId.getClass();
            sourcePage.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("from", from);
            bundle.putString("act_page_id", pageId);
            bundle.putBoolean("is_single_frag", isSingleFrag);
            if (!TextUtils.isEmpty(sourcePage)) {
                bundle.putString("source_page", sourcePage);
            }
            PicksFrag picksFrag = new PicksFrag();
            picksFrag.setArguments(bundle);
            return picksFrag;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static void m10203O4(PicksFrag picksFrag, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_privileged", xma.m27352G3());
            if (TextUtils.isEmpty(picksFrag.sourcePage)) {
                Bundle arguments = picksFrag.getArguments();
                if (TextUtils.equals(arguments != null ? arguments.getString("from") : null, "from_meet")) {
                    jSONObject.put("source_page_id", "p_diamond_tab");
                }
            } else {
                jSONObject.put("source_page_id", picksFrag.sourcePage);
            }
            picksFrag.pageHelper.o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static C0406b m10204P4(PicksFrag picksFrag) {
        C0406b.a aVar = picksFrag.f1164z;
        aVar.getClass();
        return new C0406b(aVar);
    }

    /* JADX INFO: renamed from: Q4 */
    public static qg70 m10205Q4(PicksFrag picksFrag) {
        p p = picksFrag.f1164z;
        p.getClass();
        return new qg70((C0405a) p);
    }

    /* JADX INFO: renamed from: R4 */
    public final qg70 m10206R4() {
        return (qg70) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final C0406b m10207S4() {
        return m10209U4();
    }

    @NotNull
    /* JADX INFO: renamed from: T4 */
    public final qg70 m10208T4() {
        return m10206R4();
    }

    /* JADX INFO: renamed from: U4 */
    public final C0406b m10209U4() {
        return (C0406b) this.touchHelper.getValue();
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: V4, reason: merged with bridge method [inline-methods] */
    public C0405a mo1551M4() {
        return new C0405a(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public bh70 mo1552N4() {
        return new bh70(this);
    }

    /* JADX INFO: renamed from: X4, reason: from getter */
    public final boolean getIsSingleFrag() {
        return this.isSingleFrag;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag, com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        String string;
        String string2;
        Bundle arguments = getArguments();
        this.isSingleFrag = arguments != null ? arguments.getBoolean("is_single_frag", true) : true;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 == null || (string = arguments2.getString("act_page_id", "")) == null) {
            string = "";
        }
        this.pageId = string;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("source_page", "")) != null) {
            str = string2;
        }
        this.sourcePage = str;
        if (this.isSingleFrag) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                arguments4.putString(this.swipeFromKey, "picks_view_card");
            }
        } else {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                arguments5.putString(this.swipeFromKey, "p_picks_view_membership,e_card,like_swipe");
            }
        }
        super.mo1548d4();
        cwf0 cwf0Var = this.pageHelper;
        String str2 = this.pageId;
        if (str2 == null) {
            Intrinsics.r("pageId");
            str2 = null;
        }
        cwf0Var.q(str2);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpFrag, com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        creates(new e30() { // from class: l.ud70
            public final void call(Object obj) {
                PicksFrag.m10203O4(this.f23491a, (Bundle) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    @NotNull
    public String pageId() {
        String str = this.pageId;
        if (str != null) {
            return str;
        }
        Intrinsics.r("pageId");
        return null;
    }
}
