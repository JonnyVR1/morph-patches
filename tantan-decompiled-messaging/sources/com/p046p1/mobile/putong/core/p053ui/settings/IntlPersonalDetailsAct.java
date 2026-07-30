package com.p046p1.mobile.putong.core.p053ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.settings.personaldetails.IntlPersonalDetailsPresenter;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hto;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "initDataOnCreate", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "initSubscription", "onBackPressed", "", "disableAutoPV", "()Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "c", "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "personalDetailsPresenter", "Ll/hto;", Constants.INAPP_DATA_TAG, "Ll/hto;", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlPersonalDetailsAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public IntlPersonalDetailsPresenter personalDetailsPresenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public hto viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.IntlPersonalDetailsAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "from", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m55003a(@Nullable Context context, @Nullable String from) {
            Intent intent = new Intent(context, (Class<?>) IntlPersonalDetailsAct.class);
            intent.putExtra("from", from);
            return intent;
        }

        public Companion() {
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        hto htoVar = this.viewModel;
        if (htoVar == null) {
            Intrinsics.m87502r("viewModel");
            htoVar = null;
        }
        return htoVar.inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.personalDetailsPresenter = new IntlPersonalDetailsPresenter(this);
        this.viewModel = new hto(this);
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.personalDetailsPresenter;
        hto htoVar = null;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("personalDetailsPresenter");
            intlPersonalDetailsPresenter = null;
        }
        hto htoVar2 = this.viewModel;
        if (htoVar2 == null) {
            Intrinsics.m87502r("viewModel");
        } else {
            htoVar = htoVar2;
        }
        intlPersonalDetailsPresenter.mo51532C(htoVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.personalDetailsPresenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("personalDetailsPresenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        User user;
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = null;
        hto htoVar = null;
        if (requestCode == 532) {
            hto htoVar2 = this.viewModel;
            if (htoVar2 == null) {
                Intrinsics.m87502r("viewModel");
            } else {
                htoVar = htoVar2;
            }
            htoVar.m132929l0();
        } else if (requestCode == 1 && data != null && resultCode == -1 && (user = (User) data.getSerializableExtra("result_data")) != null) {
            IntlPersonalDetailsPresenter intlPersonalDetailsPresenter2 = this.personalDetailsPresenter;
            if (intlPersonalDetailsPresenter2 == null) {
                Intrinsics.m87502r("personalDetailsPresenter");
            } else {
                intlPersonalDetailsPresenter = intlPersonalDetailsPresenter2;
            }
            intlPersonalDetailsPresenter.m55639F0(user);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        zvf0.m220396r("e_edit_basic_info_cancel_button", "p_edit_basic_info_view");
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.personalDetailsPresenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("personalDetailsPresenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m55646t0(getIntent().getStringExtra("from"));
    }
}
