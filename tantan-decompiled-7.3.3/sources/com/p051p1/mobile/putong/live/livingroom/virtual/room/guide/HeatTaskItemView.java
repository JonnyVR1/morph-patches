package com.p051p1.mobile.putong.live.livingroom.virtual.room.guide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceHeatTaskItemLayoutBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.guide.HeatTaskItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.bnl0;
import p153l.i1l;
import p153l.izs;
import p153l.meo0;
import p153l.obc0;
import p153l.qa00;
import p153l.r1j0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/guide/HeatTaskItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHeatTaskItemLayoutBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", Item.TYPE, "Ll/i1l;", "presenter", "", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;Ll/i1l;)V", "k0", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class HeatTaskItemView extends LiveVoiceHeatTaskItemLayoutBindings {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeatTaskItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m78593i0(HeatTaskItemView heatTaskItemView, BLiveHeatVoiceRoomTask bLiveHeatVoiceRoomTask, i1l i1lVar, View view) {
        heatTaskItemView.m78595k0(bLiveHeatVoiceRoomTask, i1lVar);
        if (bLiveHeatVoiceRoomTask.isDone()) {
            if (TextUtils.isEmpty(bLiveHeatVoiceRoomTask.buttonToast)) {
                return;
            }
            r1j0.m179420g(bLiveHeatVoiceRoomTask.buttonToast);
            return;
        }
        if (TEnum.equals(bLiveHeatVoiceRoomTask.type, "call")) {
            i1lVar.m138133e4(bLiveHeatVoiceRoomTask);
            return;
        }
        if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.notifyFans)) {
            i1lVar.m138137i4(bLiveHeatVoiceRoomTask);
            return;
        }
        if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.notifySettled)) {
            i1lVar.m138138j4();
        } else if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.shareRoom)) {
            i1lVar.m138140l4();
        } else if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.starRedPacket)) {
            i1lVar.m138134f4(bLiveHeatVoiceRoomTask);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78594j0(@NotNull final BLiveHeatVoiceRoomTask item, @NotNull final i1l<?> presenter) {
        item.getClass();
        presenter.getClass();
        this.f49189f.setText(item.name);
        this.f49190g.setText(item.description);
        this.f49191h.setText(item.buttonName);
        boolean zIsEmpty = TextUtils.isEmpty(item.buttonTip);
        VText vText = this.f49192i;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f49192i.setText(item.buttonTip);
        }
        boolean zIsDone = item.isDone();
        VText vText2 = this.f49191h;
        if (zIsDone) {
            vText2.setBackgroundResource(obc0.f146189T0);
        } else {
            vText2.setBackgroundResource(obc0.f146434o0);
        }
        if (!TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.notifySettled)) {
            this.f49191h.setEnabled(true);
        } else if (presenter.getHasCallInvite()) {
            this.f49191h.setText("已召唤");
            this.f49191h.setBackgroundResource(obc0.f146189T0);
            this.f49191h.setEnabled(false);
        }
        izs.m142869t("context_single_room", this.f49188e, item.icon, qa00.f156291D);
        bnl0.m105509E0(getRoot(), new View.OnClickListener() { // from class: l.p0l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeatTaskItemView.m78593i0(this.f150073a, item, presenter, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78595k0(BLiveHeatVoiceRoomTask item, i1l<?> presenter) {
        if (TEnum.equals(item.type, "call")) {
            meo0.m158069i(presenter, item);
            return;
        }
        if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.notifyFans)) {
            meo0.m158064c(presenter, item);
            return;
        }
        if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.notifySettled)) {
            meo0.m158067f(presenter, presenter.getHasCallInvite());
        } else if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.shareRoom)) {
            meo0.m158070j(presenter);
        } else if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.starRedPacket)) {
            meo0.INSTANCE.m158072g(presenter);
        }
    }
}
