package com.p000p1.mobile.putong.core.newui.intlmeet.visitor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import l.e30;
import l.mkd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ijo;
import p009l.tjo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0005J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/visitor/IntlMeetVisitorFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/ijo;", "Ll/tjo;", "<init>", "()V", "P4", "()Ll/ijo;", "Q4", "()Ll/tjo;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "", "g4", "(Landroid/os/Bundle;)V", "f4", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "R4", "(IILandroid/content/Intent;)Z", "", "pageId", "()Ljava/lang/String;", "hidden", "onHiddenChanged", "(Z)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlMeetVisitorFrag extends PutongMvpFrag<ijo, tjo> {
    /* JADX INFO: renamed from: O4 */
    public static void m3563O4(IntlMeetVisitorFrag intlMeetVisitorFrag, boolean z) {
        if (!z) {
            intlMeetVisitorFrag.J4().k();
        } else {
            intlMeetVisitorFrag.J4().l();
            ((tjo) ((PutongMvpFrag) intlMeetVisitorFrag).A).m22566E();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public ijo m3564M4() {
        return new ijo(this);
    }

    @NotNull
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public tjo m3565N4() {
        return new tjo(this);
    }

    /* JADX INFO: renamed from: R4 */
    public final boolean m3568R4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((ijo) ((PutongMvpFrag) this).z).m16611I0(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: f4 */
    public void m3569f4() {
        super.f4();
        L4().subscribe(mkd0.G(new e30() { // from class: l.lio
            public final void call(Object obj) {
                IntlMeetVisitorFrag.m3563O4(this.f16179a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m3570g4(@Nullable Bundle sis) {
        super/*com.p1.mobile.android.app.Frag*/.g4(sis);
        ((tjo) ((PutongMvpFrag) this).A).m22577p();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return ((tjo) ((PutongMvpFrag) this).A).inflateView(inflater, parent);
    }

    public void onHiddenChanged(boolean hidden) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(hidden);
        ijo ijoVar = (ijo) ((PutongMvpFrag) this).z;
        if (ijoVar != null) {
            ijoVar.m16612J0(hidden);
        }
    }

    @NotNull
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
