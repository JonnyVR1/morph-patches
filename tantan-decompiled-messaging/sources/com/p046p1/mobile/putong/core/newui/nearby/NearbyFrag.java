package com.p046p1.mobile.putong.core.newui.nearby;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.data.Permissions;
import com.p046p1.mobile.putong.core.newui.nearby.NearbyFrag;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.d30;
import p149l.e30;
import p149l.h820;
import p149l.l920;
import p149l.mkd0;
import p149l.t3m;
import p149l.yvv;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00017B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0006J/\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0014¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\tH\u0014¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010!\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b!\u0010'R\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0012R\"\u00105\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "Ll/l920;", "Ll/t3m;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "Z4", "()Lcom/p1/mobile/putong/core/newui/nearby/NearbyPresenter;", "a5", "()Ll/l920;", "Ll/h820;", "Y4", "()Ll/h820;", "onStart", "onResume", "onStop", "", "requestCode", "", "", Permissions.TYPE, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "hidden", "from", "z3", "(ZLjava/lang/String;)V", "d4", "f4", "pageId", "()Ljava/lang/String;", "V4", "B", "Ljava/lang/String;", b2s.C_ZONE, "Lkotlin/Lazy;", "X4", "adapter", "D", "Z", "getHasShowLocationPermissionDialog", "()Z", "setHasShowLocationPermissionDialog", "(Z)V", "hasShowLocationPermissionDialog", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class NearbyFrag extends PutongMvpFrag<NearbyPresenter, l920> implements t3m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.z720
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NearbyFrag.m42696P4(this.f201984a);
        }
    });

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean hasShowLocationPermissionDialog;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.nearby.NearbyFrag$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag$a;", "", "<init>", "()V", "", "from", "Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "a", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/newui/nearby/NearbyFrag;", "HIDE_NAVIGATION", "Ljava/lang/String;", "FROM", "NEARBY_FROM_MEET", "FROM_MEET_PAGE", "FROM_MY_TAB", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ NearbyFrag m42708b(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.m42709a(str);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final NearbyFrag m42709a(@Nullable String from) {
            NearbyFrag nearbyFrag = new NearbyFrag();
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(from)) {
                bundle.putString("from", from);
            }
            nearbyFrag.setArguments(bundle);
            return nearbyFrag;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static void m42695O4(NearbyFrag nearbyFrag, boolean z) {
        if (z) {
            nearbyFrag.mo29638J4().m109036l();
        } else {
            nearbyFrag.mo29638J4().m109035k();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static h820 m42696P4(NearbyFrag nearbyFrag) {
        p p = nearbyFrag.f17175z;
        p.getClass();
        return new h820((NearbyPresenter) p);
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m42697Q4() {
    }

    /* JADX INFO: renamed from: R4 */
    public static void m42698R4(NearbyFrag nearbyFrag, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        permissionDeniedReason.getClass();
        if (z) {
            ((NearbyPresenter) nearbyFrag.f17175z).m42742E0();
        }
    }

    /* JADX INFO: renamed from: T4 */
    public static void m42700T4() {
    }

    /* JADX INFO: renamed from: U4 */
    public static void m42701U4(DialogInterface dialogInterface) {
        new Function0() { // from class: l.b820
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NearbyFrag.m42702W4();
            }
        };
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m42702W4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public final void m42703V4() {
        this.hasShowLocationPermissionDialog = true;
        yvv.m216241b(act(), new PermissionHelper.InterfaceC13129b() { // from class: l.v720
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                NearbyFrag.m42698R4(this.f180286a, z, permissionDeniedReason);
            }
        }, new DialogInterface.OnCancelListener() { // from class: l.w720
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                NearbyFrag.m42701U4(dialogInterface);
            }
        }, new Runnable() { // from class: l.x720
            @Override // java.lang.Runnable
            public final void run() {
                NearbyFrag.m42697Q4();
            }
        }, new d30() { // from class: l.y720
            @Override // p149l.d30
            public final void call() {
                NearbyFrag.m42700T4();
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final h820 m42704X4() {
        return (h820) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Y4 */
    public final h820 m42705Y4() {
        return m42704X4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: Z4, reason: merged with bridge method [inline-methods] */
    public NearbyPresenter mo29641M4() {
        return new NearbyPresenter(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: a5, reason: merged with bridge method [inline-methods] */
    public l920 mo29642N4() {
        return new l920(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        Bundle arguments = getArguments();
        this.from = arguments != null ? arguments.getString("from") : null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.a820
            @Override // p149l.e30
            public final void call(Object obj) {
                NearbyFrag.m42695O4(this.f67996a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Nullable
    /* JADX INFO: renamed from: from, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(@Nullable Bundle sis) {
        super.mo20594n4(sis);
        l920 l920Var = (l920) this.f17174A;
        Bundle arguments = getArguments();
        l920Var.m148982W(arguments != null ? arguments.getBoolean("hideNavigation", true) : true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        ((NearbyPresenter) this.f17175z).m42748N0(requestCode, permissions, grantResults);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isHidden() || this.hasShowLocationPermissionDialog) {
            return;
        }
        m42703V4();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((l920) this.f17174A).m148974O();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ((l920) this.f17174A).m148975P();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_suggest_nearby";
    }

    @Override // p149l.t3m
    /* JADX INFO: renamed from: z3 */
    public void mo36212z3(boolean hidden, @NotNull String from) {
        from.getClass();
        if (!hidden && NullChecker.m81303a(this.f17175z) && NullChecker.m81303a(this.f17174A) && ((l920) this.f17174A).m148973N()) {
            ((NearbyPresenter) this.f17175z).m42751Q0();
            if (this.hasShowLocationPermissionDialog || !Intrinsics.m87488d(lifecycle_(), C4319c.f15548i)) {
                return;
            }
            m42703V4();
        }
    }
}
