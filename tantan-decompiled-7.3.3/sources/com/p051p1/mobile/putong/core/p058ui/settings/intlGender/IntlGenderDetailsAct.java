package com.p051p1.mobile.putong.core.p058ui.settings.intlGender;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aln;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initDataOnCreate", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "initSubscription", "onBackPressed", "", "disableAutoPV", "()Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Ll/aln;", "c", "Ll/aln;", "intlGenderDetailsPresenter", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/a;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/settings/intlGender/a;", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class IntlGenderDetailsAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public aln intlGenderDetailsPresenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C9053a viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.intlGender.IntlGenderDetailsAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/data/User;", "data", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/p1/mobile/putong/data/User;)Landroid/content/Intent;", "", "DATA", "Ljava/lang/String;", "RESULT_DATA", "", "REQUEST_CODE", "I", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m56744a(@Nullable Context context, @NotNull User data) {
            data.getClass();
            Intent intent = new Intent(context, (Class<?>) IntlGenderDetailsAct.class);
            intent.putExtra("data", data);
            return intent;
        }

        public Companion() {
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        C9053a c9053a = this.viewModel;
        if (c9053a == null) {
            Intrinsics.m88391r("viewModel");
            c9053a = null;
        }
        return c9053a.inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.intlGenderDetailsPresenter = new aln(this);
        this.viewModel = new C9053a(this);
        aln alnVar = this.intlGenderDetailsPresenter;
        C9053a c9053a = null;
        if (alnVar == null) {
            Intrinsics.m88391r("intlGenderDetailsPresenter");
            alnVar = null;
        }
        C9053a c9053a2 = this.viewModel;
        if (c9053a2 == null) {
            Intrinsics.m88391r("viewModel");
        } else {
            c9053a = c9053a2;
        }
        alnVar.mo52715C(c9053a);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        aln alnVar = this.intlGenderDetailsPresenter;
        if (alnVar == null) {
            Intrinsics.m88391r("intlGenderDetailsPresenter");
            alnVar = null;
        }
        alnVar.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != 2) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (data != null) {
            aln alnVar = this.intlGenderDetailsPresenter;
            if (alnVar == null) {
                Intrinsics.m88391r("intlGenderDetailsPresenter");
                alnVar = null;
            }
            alnVar.m98712p0(data);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        aln alnVar = this.intlGenderDetailsPresenter;
        if (alnVar == null) {
            Intrinsics.m88391r("intlGenderDetailsPresenter");
            alnVar = null;
        }
        alnVar.m98711o0((User) getIntent().getSerializableExtra("data"));
    }
}
