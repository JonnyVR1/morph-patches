package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.model.VoiceChatGroupApplyItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/d6n0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/model/VoiceChatGroupApplyItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "voiceChatGroupApply", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;)V", "", "o", "()I", "itemView", "", "J", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/model/VoiceChatGroupApplyItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "I", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "setVoiceChatGroupApply", "Landroid/view/View$OnClickListener;", "b", "Landroid/view/View$OnClickListener;", "getAgreeClickListener", "()Landroid/view/View$OnClickListener;", "K", "(Landroid/view/View$OnClickListener;)V", "agreeClickListener", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d6n0 extends d3q<VoiceChatGroupApplyItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public BLiveVoiceChatGroupApply voiceChatGroupApply;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public View.OnClickListener agreeClickListener;

    public d6n0(@NotNull BLiveVoiceChatGroupApply bLiveVoiceChatGroupApply) {
        bLiveVoiceChatGroupApply.getClass();
        this.voiceChatGroupApply = bLiveVoiceChatGroupApply;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m114499H(d6n0 d6n0Var, View view) {
        view.getClass();
        View.OnClickListener onClickListener = d6n0Var.agreeClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final BLiveVoiceChatGroupApply getVoiceChatGroupApply() {
        return this.voiceChatGroupApply;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull VoiceChatGroupApplyItemView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m79284i0(this.voiceChatGroupApply);
        czq.m113347c(itemView.get_agree_btn(), new Function1() { // from class: l.c6n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d6n0.m114499H(this.f79982a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m114502K(@Nullable View.OnClickListener onClickListener) {
        this.agreeClickListener = onClickListener;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199129j8;
    }
}
