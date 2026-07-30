package com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.call;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bum0;
import p153l.kum0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/voice/call/VoiceBuzzCallFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "Ll/bum0;", BaseSei.f14626Z, "Ll/bum0;", "M4", "()Ll/bum0;", "O4", "(Ll/bum0;)V", "presenter", "Ll/kum0;", "A", "Ll/kum0;", "N4", "()Ll/kum0;", "P4", "(Ll/kum0;)V", "viewModel", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceBuzzCallFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public kum0 viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public bum0 presenter;

    @NotNull
    /* JADX INFO: renamed from: M4 */
    public final bum0 m48267M4() {
        bum0 bum0Var = this.presenter;
        if (bum0Var != null) {
            return bum0Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final kum0 m48268N4() {
        kum0 kum0Var = this.viewModel;
        if (kum0Var != null) {
            return kum0Var;
        }
        Intrinsics.m88391r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m48269O4(@NotNull bum0 bum0Var) {
        bum0Var.getClass();
        this.presenter = bum0Var;
    }

    /* JADX INFO: renamed from: P4 */
    public final void m48270P4(@NotNull kum0 kum0Var) {
        kum0Var.getClass();
        this.viewModel = kum0Var;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m48269O4(new bum0(this));
        Act act = act();
        act.getClass();
        m48270P4(new kum0(act));
        m48267M4().mo52715C(m48268N4());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        m48268N4().m151613r();
        m48267M4().m187318C0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m48268N4().inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_buzz_voice_calling";
    }
}
