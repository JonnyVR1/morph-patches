package com.p000p1.mobile.putong.core.p004ui.settings.intlGender;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.User;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.ajn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initDataOnCreate", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "initSubscription", "onBackPressed", "", "disableAutoPV", "()Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Ll/ajn;", "c", "Ll/ajn;", "intlGenderDetailsPresenter", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/a;", "d", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/a;", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlGenderDetailsAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ajn intlGenderDetailsPresenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C0326a viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.intlGender.IntlGenderDetailsAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/data/User;", "data", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/p1/mobile/putong/data/User;)Landroid/content/Intent;", "", "DATA", "Ljava/lang/String;", "RESULT_DATA", "", "REQUEST_CODE", "I", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m8954a(@Nullable Context context, @NotNull User data) {
            data.getClass();
            Intent intent = new Intent(context, (Class<?>) IntlGenderDetailsAct.class);
            intent.putExtra("data", (Serializable) data);
            return intent;
        }

        public Companion() {
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        C0326a c0326a = this.viewModel;
        if (c0326a == null) {
            Intrinsics.r("viewModel");
            c0326a = null;
        }
        return c0326a.inflateView(inflater, parent);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.intlGenderDetailsPresenter = new ajn(this);
        this.viewModel = new C0326a(this);
        ajn ajnVar = this.intlGenderDetailsPresenter;
        C0326a c0326a = null;
        if (ajnVar == null) {
            Intrinsics.r("intlGenderDetailsPresenter");
            ajnVar = null;
        }
        C0326a c0326a2 = this.viewModel;
        if (c0326a2 == null) {
            Intrinsics.r("viewModel");
        } else {
            c0326a = c0326a2;
        }
        ajnVar.C(c0326a);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        ajn ajnVar = this.intlGenderDetailsPresenter;
        if (ajnVar == null) {
            Intrinsics.r("intlGenderDetailsPresenter");
            ajnVar = null;
        }
        ajnVar.m11866a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != 2) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (data != null) {
            ajn ajnVar = this.intlGenderDetailsPresenter;
            if (ajnVar == null) {
                Intrinsics.r("intlGenderDetailsPresenter");
                ajnVar = null;
            }
            ajnVar.m11872p0(data);
        }
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        ajn ajnVar = this.intlGenderDetailsPresenter;
        if (ajnVar == null) {
            Intrinsics.r("intlGenderDetailsPresenter");
            ajnVar = null;
        }
        ajnVar.m11871o0((User) getIntent().getSerializableExtra("data"));
    }
}
