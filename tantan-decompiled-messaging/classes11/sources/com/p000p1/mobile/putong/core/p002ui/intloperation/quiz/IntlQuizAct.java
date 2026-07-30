package com.p000p1.mobile.putong.core.p002ui.intloperation.quiz;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.bt0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.l7p;
import p009l.r7p;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/quiz/IntlQuizAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/animation/Animator;", "exitAnimation", "()Landroid/animation/Animator;", "", "isAnonymousMode", "()Z", "shouldSwitchToTransparentStatus", "Ll/l7p;", "c", "Ll/l7p;", "V1", "()Ll/l7p;", "Y1", "(Ll/l7p;)V", "presenter", "Ll/r7p;", "d", "Ll/r7p;", "X1", "()Ll/r7p;", "Z1", "(Ll/r7p;)V", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlQuizAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public l7p presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public r7p viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.quiz.IntlQuizAct$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/quiz/IntlQuizAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "Landroid/content/Intent;", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;)Landroid/content/Intent;", "", "QUESTION_DATA", "Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m8408a(@NotNull Act act, @NotNull IntlMarketQuestionData data) {
            act.getClass();
            data.getClass();
            Intent intent = new Intent((Context) act, (Class<?>) IntlQuizAct.class);
            intent.putExtra("question_data", (Serializable) data);
            return intent;
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: V1 */
    public final l7p m8404V1() {
        l7p l7pVar = this.presenter;
        if (l7pVar != null) {
            return l7pVar;
        }
        Intrinsics.r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final r7p m8405X1() {
        r7p r7pVar = this.viewModel;
        if (r7pVar != null) {
            return r7pVar;
        }
        Intrinsics.r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m8406Y1(@NotNull l7p l7pVar) {
        l7pVar.getClass();
        this.presenter = l7pVar;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m8407Z1(@NotNull r7p r7pVar) {
        r7pVar.getClass();
        this.viewModel = r7pVar;
    }

    @Nullable
    public Animator exitAnimation() {
        return bt0.j(1);
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflateView = m8405X1().inflateView(inflater, parent);
        m8404V1().m17727f0();
        Serializable serializableExtra = ((Act) this).act.getIntent().getSerializableExtra("question_data");
        serializableExtra.getClass();
        m8404V1().m17726e0((IntlMarketQuestionData) serializableExtra);
        return viewInflateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    public boolean isAnonymousMode() {
        return false;
    }

    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        m8406Y1(new l7p(this));
        m8407Z1(new r7p(this));
        m8404V1().C(m8405X1());
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
