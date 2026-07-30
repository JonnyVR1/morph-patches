package com.p046p1.mobile.putong.core.p053ui.settings.relationshiplooking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.woc0;
import p149l.xoc0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/settings/relationshiplooking/RelationshipLookingAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initDataOnCreate", "initSubscription", "", "needBindBillingService", "()Z", "Ll/woc0;", "c", "Ll/woc0;", "presenter", "Ll/xoc0;", Constants.INAPP_DATA_TAG, "Ll/xoc0;", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class RelationshipLookingAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public woc0 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public xoc0 viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.relationshiplooking.RelationshipLookingAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/settings/relationshiplooking/RelationshipLookingAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "intlFriendPurpose", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "KEY_INTL_FRIEND_PURPOSE", "Ljava/lang/String;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m55680a(@NotNull Context context, @NotNull String intlFriendPurpose) {
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
    /* JADX INFO: renamed from: V1 */
    public static final Intent m55679V1(@NotNull Context context, @NotNull String str) {
        return INSTANCE.m55680a(context, str);
    }

    @Override // com.p046p1.mobile.android.app.Act
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        xoc0 xoc0Var = this.viewModel;
        if (xoc0Var == null) {
            Intrinsics.m87502r("viewModel");
            xoc0Var = null;
        }
        return xoc0Var.inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.presenter = new woc0(this);
        this.viewModel = new xoc0(this);
        woc0 woc0Var = this.presenter;
        xoc0 xoc0Var = null;
        if (woc0Var == null) {
            Intrinsics.m87502r("presenter");
            woc0Var = null;
        }
        xoc0 xoc0Var2 = this.viewModel;
        if (xoc0Var2 == null) {
            Intrinsics.m87502r("viewModel");
        } else {
            xoc0Var = xoc0Var2;
        }
        woc0Var.mo51532C(xoc0Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        woc0 woc0Var = this.presenter;
        if (woc0Var == null) {
            Intrinsics.m87502r("presenter");
            woc0Var = null;
        }
        woc0Var.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }
}
