package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpInviteRecordItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/xwo0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/sweet/view/item/VoiceSweetCpInviteRecordItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;", "recordData", "Ll/z20;", "", "operationAction", "Ll/y20;", "openUserCard", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;Ll/z20;Ll/y20;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/sweet/view/item/VoiceSweetCpInviteRecordItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceSweetCpInviteRecord;", "b", "Ll/z20;", "c", "Ll/y20;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xwo0 extends d3q<VoiceSweetCpInviteRecordItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceSweetCpInviteRecord recordData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final z20<String, String> operationAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final y20<String> openUserCard;

    public xwo0(@NotNull BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, @NotNull z20<String, String> z20Var, @NotNull y20<String> y20Var) {
        bLiveVoiceSweetCpInviteRecord.getClass();
        z20Var.getClass();
        y20Var.getClass();
        this.recordData = bLiveVoiceSweetCpInviteRecord;
        this.operationAction = z20Var;
        this.openUserCard = y20Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull VoiceSweetCpInviteRecordItemView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m79749m0(this.recordData, this.operationAction, this.openUserCard);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198798Ia;
    }
}
