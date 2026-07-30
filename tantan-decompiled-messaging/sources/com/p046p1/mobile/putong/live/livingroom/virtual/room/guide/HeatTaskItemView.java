package com.p046p1.mobile.putong.live.livingroom.virtual.room.guide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceHeatTaskItemLayoutBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.guide.HeatTaskItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.hxs;
import p149l.i3c0;
import p149l.i5o0;
import p149l.osi0;
import p149l.syk;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/guide/HeatTaskItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceHeatTaskItemLayoutBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", Item.TYPE, "Ll/syk;", "presenter", "", "j0", "(Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;Ll/syk;)V", "k0", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class HeatTaskItemView extends LiveVoiceHeatTaskItemLayoutBindings {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeatTaskItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m77410i0(HeatTaskItemView heatTaskItemView, BLiveHeatVoiceRoomTask bLiveHeatVoiceRoomTask, syk sykVar, View view) {
        heatTaskItemView.m77412k0(bLiveHeatVoiceRoomTask, sykVar);
        if (bLiveHeatVoiceRoomTask.isDone()) {
            if (TextUtils.isEmpty(bLiveHeatVoiceRoomTask.buttonToast)) {
                return;
            }
            osi0.m165783g(bLiveHeatVoiceRoomTask.buttonToast);
            return;
        }
        if (TEnum.equals(bLiveHeatVoiceRoomTask.type, "call")) {
            sykVar.m186700e4(bLiveHeatVoiceRoomTask);
            return;
        }
        if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.notifyFans)) {
            sykVar.m186704i4(bLiveHeatVoiceRoomTask);
            return;
        }
        if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.notifySettled)) {
            sykVar.m186705j4();
        } else if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.shareRoom)) {
            sykVar.m186707l4();
        } else if (TEnum.equals(bLiveHeatVoiceRoomTask.type, BLiveHeatVoiceRoomTaskType.starRedPacket)) {
            sykVar.m186701f4(bLiveHeatVoiceRoomTask);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77411j0(@NotNull final BLiveHeatVoiceRoomTask item, @NotNull final syk<?> presenter) {
        item.getClass();
        presenter.getClass();
        this.f48341f.setText(item.name);
        this.f48342g.setText(item.description);
        this.f48343h.setText(item.buttonName);
        boolean zIsEmpty = TextUtils.isEmpty(item.buttonTip);
        VText vText = this.f48344i;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f48344i.setText(item.buttonTip);
        }
        boolean zIsDone = item.isDone();
        VText vText2 = this.f48343h;
        if (zIsDone) {
            vText2.setBackgroundResource(i3c0.f110861T0);
        } else {
            vText2.setBackgroundResource(i3c0.f111106o0);
        }
        if (!TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.notifySettled)) {
            this.f48343h.setEnabled(true);
        } else if (presenter.getHasCallInvite()) {
            this.f48343h.setText("已召唤");
            this.f48343h.setBackgroundResource(i3c0.f110861T0);
            this.f48343h.setEnabled(false);
        }
        hxs.m133407t("context_single_room", this.f48340e, item.icon, t100.f167229D);
        xdl0.m208329E0(getRoot(), new View.OnClickListener() { // from class: l.zxk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeatTaskItemView.m77410i0(this.f205460a, item, presenter, view);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m77412k0(BLiveHeatVoiceRoomTask item, syk<?> presenter) {
        if (TEnum.equals(item.type, "call")) {
            i5o0.m134523i(presenter, item);
            return;
        }
        if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.notifyFans)) {
            i5o0.m134518c(presenter, item);
            return;
        }
        if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.notifySettled)) {
            i5o0.m134521f(presenter, presenter.getHasCallInvite());
        } else if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.shareRoom)) {
            i5o0.m134524j(presenter);
        } else if (TEnum.equals(item.type, BLiveHeatVoiceRoomTaskType.starRedPacket)) {
            i5o0.INSTANCE.m134526g(presenter);
        }
    }
}
