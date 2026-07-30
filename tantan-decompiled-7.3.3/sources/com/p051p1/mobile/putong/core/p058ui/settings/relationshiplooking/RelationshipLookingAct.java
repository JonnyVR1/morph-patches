package com.p051p1.mobile.putong.core.p058ui.settings.relationshiplooking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bxc0;
import p153l.cxc0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/settings/relationshiplooking/RelationshipLookingAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initDataOnCreate", "initSubscription", "", "needBindBillingService", "()Z", "Ll/bxc0;", "c", "Ll/bxc0;", "presenter", "Ll/cxc0;", Constants.INAPP_DATA_TAG, "Ll/cxc0;", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class RelationshipLookingAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public bxc0 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public cxc0 viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.relationshiplooking.RelationshipLookingAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/settings/relationshiplooking/RelationshipLookingAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "intlFriendPurpose", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "KEY_INTL_FRIEND_PURPOSE", "Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m56863a(@NotNull Context context, @NotNull String intlFriendPurpose) {
            context.getClass();
            intlFriendPurpose.getClass();
            Intent intent = new Intent(context, (Class<?>) RelationshipLookingAct.class);
            intent.putExtra("key_intl_friend_purpose", intlFriendPurpose);
            return intent;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: X1 */
    public static final Intent m56862X1(@NotNull Context context, @NotNull String str) {
        return INSTANCE.m56863a(context, str);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        cxc0 cxc0Var = this.viewModel;
        if (cxc0Var == null) {
            Intrinsics.m88391r("viewModel");
            cxc0Var = null;
        }
        return cxc0Var.inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.presenter = new bxc0(this);
        this.viewModel = new cxc0(this);
        bxc0 bxc0Var = this.presenter;
        cxc0 cxc0Var = null;
        if (bxc0Var == null) {
            Intrinsics.m88391r("presenter");
            bxc0Var = null;
        }
        cxc0 cxc0Var2 = this.viewModel;
        if (cxc0Var2 == null) {
            Intrinsics.m88391r("viewModel");
        } else {
            cxc0Var = cxc0Var2;
        }
        bxc0Var.mo52715C(cxc0Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        bxc0 bxc0Var = this.presenter;
        if (bxc0Var == null) {
            Intrinsics.m88391r("presenter");
            bxc0Var = null;
        }
        bxc0Var.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }
}
