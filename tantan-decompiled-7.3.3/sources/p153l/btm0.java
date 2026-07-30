package p153l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/btm0;", "Ll/d3q;", "Landroid/widget/FrameLayout;", "Ll/pcp0;", "voiceVirtualBgPicData", "<init>", "(Ll/pcp0;)V", "", "o", "()I", "itemView", "", "I", "(Landroid/widget/FrameLayout;)V", "a", "Ll/pcp0;", "H", "()Ll/pcp0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class btm0 extends d3q<FrameLayout> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final pcp0 voiceVirtualBgPicData;

    public btm0(@NotNull pcp0 pcp0Var) {
        pcp0Var.getClass();
        this.voiceVirtualBgPicData = pcp0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final pcp0 getVoiceVirtualBgPicData() {
        return this.voiceVirtualBgPicData;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull FrameLayout itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        qnp0.m177261d1(itemView, txq.m193530c(10));
        float fM105592y0 = (bnl0.m105592y0() - qa00.m175859d(60.0f)) / 3.0f;
        bnl0.m105505C0(itemView, (int) ((4.0f * fM105592y0) / 3.0f));
        bnl0.m105507D0((int) fM105592y0, itemView);
        VDraweeView vDraweeView = (VDraweeView) itemView.findViewById(mdc0.f135906C4);
        ImageView imageView = (ImageView) itemView.findViewById(mdc0.f135934F5);
        View viewFindViewById = itemView.findViewById(mdc0.f136088W6);
        izs.m142868s("context_livingAct", vDraweeView, this.voiceVirtualBgPicData.getVoiceBackGroundPic().thumbnailUrl);
        bnl0.m105524M(imageView, this.voiceVirtualBgPicData.getIsSelected());
        bnl0.m105524M(viewFindViewById, this.voiceVirtualBgPicData.getIsSelected());
        bnl0.m105537U(itemView, qa00.m175859d(8.0f));
        int position = this.voiceVirtualBgPicData.getPosition() % 3;
        if (position == 0 || position == 1) {
            bnl0.m105539W(itemView, qa00.m175859d(8.0f));
        } else {
            if (position != 2) {
                return;
            }
            bnl0.m105539W(itemView, qa00.m175859d(0.0f));
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198882Pa;
    }
}
