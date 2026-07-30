package com.p051p1.mobile.putong.core.newui.meet.likers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.idy;
import p153l.psd0;
import p153l.wdy;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0005J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/idy;", "Ll/wdy;", "<init>", "()V", "P4", "()Ll/idy;", "Q4", "()Ll/wdy;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "f4", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "R4", "(IILandroid/content/Intent;)Z", "", "pageId", "()Ljava/lang/String;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MeetLikersFrag extends PutongMvpFrag<idy, wdy> {
    /* JADX INFO: renamed from: O4 */
    public static void m41515O4(MeetLikersFrag meetLikersFrag, boolean z) {
        if (z) {
            meetLikersFrag.mo30636J4().m152777l();
        } else {
            meetLikersFrag.mo30636J4().m152776k();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public idy mo30639M4() {
        return new idy(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    @NotNull
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public wdy mo30640N4() {
        return new wdy(this);
    }

    /* JADX INFO: renamed from: R4 */
    public final boolean m41518R4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((idy) this.f17894z).m139579O0(requestCode, resultCode, data);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.vby
            @Override // p153l.y20
            public final void call(Object obj) {
                MeetLikersFrag.m41515O4(this.f183297a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return ((wdy) this.f17893A).inflateView(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
