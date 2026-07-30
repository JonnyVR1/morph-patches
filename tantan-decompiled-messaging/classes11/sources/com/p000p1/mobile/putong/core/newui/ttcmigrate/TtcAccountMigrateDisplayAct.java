package com.p000p1.mobile.putong.core.newui.ttcmigrate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ccj0;
import p009l.zbj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "", "initDataOnCreate", "initSubscription", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "shouldShowGradientStatusBar", "()Z", "shouldShowGradientActionBar", "onBackPressed", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "Ll/ccj0;", "c", "Ll/ccj0;", "viewModel", "Ll/zbj0;", "d", "Ll/zbj0;", "presenter", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TtcAccountMigrateDisplayAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ccj0 viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public zbj0 presenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.ttcmigrate.TtcAccountMigrateDisplayAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "a", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;)V", "", "KEY_MIGRATE_DATA", "Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m7953a(@NotNull Context context, @NotNull TtcMigrateDisplayData data) {
            context.getClass();
            data.getClass();
            Intent intent = new Intent(context, (Class<?>) TtcAccountMigrateDisplayAct.class);
            intent.putExtra("key_migrate_data", (Serializable) data);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        ccj0 ccj0Var = this.viewModel;
        if (ccj0Var == null) {
            Intrinsics.r("viewModel");
            ccj0Var = null;
        }
        return ccj0Var.inflateView(inflater, parent);
    }

    public void initDataOnCreate() {
        this.viewModel = new ccj0(this);
        zbj0 zbj0Var = new zbj0(this);
        this.presenter = zbj0Var;
        ccj0 ccj0Var = this.viewModel;
        if (ccj0Var == null) {
            Intrinsics.r("viewModel");
            ccj0Var = null;
        }
        zbj0Var.C(ccj0Var);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        zbj0 zbj0Var = this.presenter;
        if (zbj0Var == null) {
            Intrinsics.r("presenter");
            zbj0Var = null;
        }
        zbj0Var.m25632a0();
    }

    public void onBackPressed() {
    }

    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
        super.preCreateView(sis);
    }

    public boolean shouldShowGradientActionBar() {
        return false;
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
