package com.p000p1.mobile.putong.core.newui.meet.likers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import l.e30;
import l.mkd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.l4y;
import p009l.z4y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0005J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/p1/mobile/putong/core/newui/meet/likers/MeetLikersFrag;", "Lcom/p1/mobile/putong/app/PutongMvpFrag;", "Ll/l4y;", "Ll/z4y;", "<init>", "()V", "P4", "()Ll/l4y;", "Q4", "()Ll/z4y;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "f4", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "R4", "(IILandroid/content/Intent;)Z", "", "pageId", "()Ljava/lang/String;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MeetLikersFrag extends PutongMvpFrag<l4y, z4y> {
    /* JADX INFO: renamed from: O4 */
    public static void m4592O4(MeetLikersFrag meetLikersFrag, boolean z) {
        if (z) {
            meetLikersFrag.J4().l();
        } else {
            meetLikersFrag.J4().k();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public l4y m4593M4() {
        return new l4y(this);
    }

    @NotNull
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public z4y m4594N4() {
        return new z4y(this);
    }

    /* JADX INFO: renamed from: R4 */
    public final boolean m4597R4(int requestCode, int resultCode, @Nullable Intent data) {
        return ((l4y) ((PutongMvpFrag) this).z).m17688O0(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: f4 */
    public void m4598f4() {
        super.f4();
        L4().subscribe(mkd0.G(new e30() { // from class: l.y2y
            public final void call(Object obj) {
                MeetLikersFrag.m4592O4(this.f22865a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return ((z4y) ((PutongMvpFrag) this).A).inflateView(inflater, parent);
    }

    @NotNull
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
