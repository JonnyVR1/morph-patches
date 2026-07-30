package com.p000p1.mobile.putong.core.p001ui.lovebuzz.memoji.call;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.gfy;
import p003l.ofy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/memoji/call/MemojiBuzzCallFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "pageId", "()Ljava/lang/String;", "", "disableAutoPV", "()Z", "Ll/gfy;", "z", "Ll/gfy;", "M4", "()Ll/gfy;", "O4", "(Ll/gfy;)V", "presenter", "Ll/ofy;", "A", "Ll/ofy;", "N4", "()Ll/ofy;", "P4", "(Ll/ofy;)V", "viewModel", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MemojiBuzzCallFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public ofy viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public gfy presenter;

    @NotNull
    /* JADX INFO: renamed from: M4 */
    public final gfy m24M4() {
        gfy gfyVar = this.presenter;
        if (gfyVar != null) {
            return gfyVar;
        }
        Intrinsics.r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N4 */
    public final ofy m25N4() {
        ofy ofyVar = this.viewModel;
        if (ofyVar != null) {
            return ofyVar;
        }
        Intrinsics.r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: O4 */
    public final void m26O4(@NotNull gfy gfyVar) {
        gfyVar.getClass();
        this.presenter = gfyVar;
    }

    /* JADX INFO: renamed from: P4 */
    public final void m27P4(@NotNull ofy ofyVar) {
        ofyVar.getClass();
        this.viewModel = ofyVar;
    }

    /* JADX INFO: renamed from: d4 */
    public void m28d4() {
        super.d4();
        m26O4(new gfy(this));
        Act act = act();
        act.getClass();
        m27P4(new ofy(act));
        m24M4().C(m25N4());
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m29g4(@Nullable Bundle sis) {
        super/*com.p1.mobile.android.app.Frag*/.g4(sis);
        m25N4().m6697r();
        m24M4().C0();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m25N4().inflateView(inflater, container);
    }

    @NotNull
    public String pageId() {
        return "p_buzz_memoji_calling";
    }
}
