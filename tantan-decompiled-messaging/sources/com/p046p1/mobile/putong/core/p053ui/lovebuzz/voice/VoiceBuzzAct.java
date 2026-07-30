package com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzSearchFrag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseMediaBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.call.VoiceBuzzCallFrag;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d30;
import p149l.ilm0;
import p149l.j760;
import p149l.llm0;
import p149l.v4c0;
import p149l.x0c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J!\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseMediaBuzzAct;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "pageType", "V1", "(Ljava/lang/String;)V", "onBackPressed", "Ljava/util/ArrayList;", "Ll/j760;", "Ll/d30;", "debugItems", "()Ljava/util/ArrayList;", "Ll/ilm0;", "c", "Ll/ilm0;", "X1", "()Ll/ilm0;", "Z1", "(Ll/ilm0;)V", "presenter", "Ll/llm0;", Constants.INAPP_DATA_TAG, "Ll/llm0;", "Y1", "()Ll/llm0;", "a2", "(Ll/llm0;)V", "viewModel", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceBuzzAct extends BaseMediaBuzzAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ilm0 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public llm0 viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.voice.VoiceBuzzAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/VoiceBuzzAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "Landroid/content/Intent;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Landroid/content/Intent;", "modeType", "b", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "TAG", "Ljava/lang/String;", "SEARCH_VOICE", "VOICE_CALL", "MODE_TYPE", "PAGE_TYPE", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m47082a(@NotNull Act act, @NotNull String pageType) {
            act.getClass();
            pageType.getClass();
            return m47083b(act, pageType, Active.TYPE);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m47083b(@NotNull Act act, @NotNull String pageType, @NotNull String modeType) {
            act.getClass();
            pageType.getClass();
            modeType.getClass();
            Intent intent = new Intent(act, (Class<?>) VoiceBuzzAct.class);
            intent.putExtra("page_type", pageType);
            intent.putExtra("MODE_TYPE", modeType);
            return intent;
        }

        public Companion() {
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseMediaBuzzAct
    /* JADX INFO: renamed from: V1 */
    public void mo46922V1(@NotNull String pageType) {
        pageType.getClass();
        super.mo46922V1(pageType);
        m47079Y1().m150532d(pageType);
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final ilm0 m47078X1() {
        ilm0 ilm0Var = this.presenter;
        if (ilm0Var != null) {
            return ilm0Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public final llm0 m47079Y1() {
        llm0 llm0Var = this.viewModel;
        if (llm0Var != null) {
            return llm0Var;
        }
        Intrinsics.m87502r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m47080Z1(@NotNull ilm0 ilm0Var) {
        ilm0Var.getClass();
        this.presenter = ilm0Var;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m47081a2(@NotNull llm0 llm0Var) {
        llm0Var.getClass();
        this.viewModel = llm0Var;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    @NotNull
    public ArrayList<j760<String, d30>> debugItems() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentM2554h0 = supportFragmentManager.m2554h0(v4c0.f179907n);
        if (fragmentM2554h0 instanceof BaseBuzzSearchFrag) {
            return ((BaseBuzzSearchFrag) fragmentM2554h0).mo29633C4();
        }
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.getClass();
        return arrayListDebugItems;
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflateView = m47079Y1().inflateView(inflater, parent);
        m47079Y1().m150536r();
        m47078X1().m137007e0();
        return viewInflateView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentM2554h0 = getSupportFragmentManager().m2554h0(v4c0.f179907n);
        if (fragmentM2554h0 instanceof VoiceBuzzCallFrag) {
            return;
        }
        if (fragmentM2554h0 instanceof BaseBuzzSearchFrag) {
            ((BaseBuzzSearchFrag) fragmentM2554h0).m46919o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        setStatusBarColorResId(x0c0.f188960n);
        Act act = this.act;
        if (act != null) {
            act.setSwipeBackEnable(false);
        }
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        m47080Z1(new ilm0(this));
        m47081a2(new llm0(this));
        m47078X1().mo51532C(m47079Y1());
    }
}
