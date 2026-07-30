package com.p051p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ilo;
import p153l.psd0;
import p153l.tlo;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0005J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$¨\u0006%"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/ilo;", "Ll/tlo;", "<init>", "()V", "P4", "()Ll/ilo;", "Q4", "()Ll/tlo;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "", "g4", "(Landroid/os/Bundle;)V", "f4", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "R4", "(IILandroid/content/Intent;)Z", "", "pageId", "()Ljava/lang/String;", "hidden", "onHiddenChanged", "(Z)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlMeetVisitorFrag extends PutongMvpFrag<ilo, tlo> {
    /* JADX INFO: renamed from: O4 */
    public static void m40508O4(IntlMeetVisitorFrag intlMeetVisitorFrag, boolean z) {
        if (!z) {
            intlMeetVisitorFrag.mo30636J4().m152776k();
        } else {
            intlMeetVisitorFrag.mo30636J4().m152777l();
            ((tlo) intlMeetVisitorFrag.f17893A).m191674E();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ilo mo30639M4() {
        return new ilo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public tlo mo30640N4() {
        return new tlo(this);
    }

    /* JADX INFO: renamed from: R4 */
    public final boolean m40511R4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((ilo) this.f17894z).m140665I0(requestCode, resultCode, data);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.lko
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlMeetVisitorFrag.m40508O4(this.f132491a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        ((tlo) this.f17893A).m191684p();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return ((tlo) this.f17893A).inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        ilo iloVar = (ilo) this.f17894z;
        if (iloVar != null) {
            iloVar.m140666J0(hidden);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
