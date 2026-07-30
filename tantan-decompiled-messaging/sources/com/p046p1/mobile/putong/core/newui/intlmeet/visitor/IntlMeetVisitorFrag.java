package com.p046p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e30;
import p149l.ijo;
import p149l.mkd0;
import p149l.tjo;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0005J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$¨\u0006%"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/ijo;", "Ll/tjo;", "<init>", "()V", "P4", "()Ll/ijo;", "Q4", "()Ll/tjo;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "", "g4", "(Landroid/os/Bundle;)V", "f4", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "R4", "(IILandroid/content/Intent;)Z", "", "pageId", "()Ljava/lang/String;", "hidden", "onHiddenChanged", "(Z)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlMeetVisitorFrag extends PutongMvpFrag<ijo, tjo> {
    /* JADX INFO: renamed from: O4 */
    public static void m39505O4(IntlMeetVisitorFrag intlMeetVisitorFrag, boolean z) {
        if (!z) {
            intlMeetVisitorFrag.mo29638J4().m109035k();
        } else {
            intlMeetVisitorFrag.mo29638J4().m109036l();
            ((tjo) intlMeetVisitorFrag.f17174A).m189374E();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ijo mo29641M4() {
        return new ijo(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public tjo mo29642N4() {
        return new tjo(this);
    }

    /* JADX INFO: renamed from: R4 */
    public final boolean m39508R4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((ijo) this.f17175z).m136732I0(requestCode, resultCode, data);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.lio
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlMeetVisitorFrag.m39505O4(this.f128236a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        ((tjo) this.f17174A).m189384p();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return ((tjo) this.f17174A).inflateView(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        ijo ijoVar = (ijo) this.f17175z;
        if (ijoVar != null) {
            ijoVar.m136733J0(hidden);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
