package com.p046p1.mobile.putong.live.livingroom.common.chat;

import android.view.View;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\fÀ\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/chat/IChatItemLongClickArea;", "", "Landroid/view/View;", "getClickTarget", "()Landroid/view/View;", "Lcom/p1/mobile/putong/live/livingroom/common/chat/IChatItemLongClickArea$LongClickArea;", "getLongClickArea", "()Lcom/p1/mobile/putong/live/livingroom/common/chat/IChatItemLongClickArea$LongClickArea;", "setLongClickArea", "(Lcom/p1/mobile/putong/live/livingroom/common/chat/IChatItemLongClickArea$LongClickArea;)V", "longClickArea", "LongClickArea", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface IChatItemLongClickArea {

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/chat/IChatItemLongClickArea$LongClickArea;", "", "<init>", "(Ljava/lang/String;I)V", "AVATAR", "CONTENT", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum LongClickArea {
        AVATAR,
        CONTENT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<LongClickArea> getEntries() {
            return $ENTRIES;
        }
    }

    @NotNull
    View getClickTarget();

    @Nullable
    LongClickArea getLongClickArea();
}
