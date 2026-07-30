package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceShareItems;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/ave0;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceShareItems;", "shareItemsList", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "masks", "Ll/r7j;", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ave0 {

    @NotNull
    public static final ave0 INSTANCE = new ave0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<r7j> m99163a(@Nullable List<BLiveVoiceShareItems> shareItemsList, @Nullable List<BLiveUserMask> masks) {
        List<BLiveUserMask> list;
        ArrayList arrayList = new ArrayList();
        List<BLiveVoiceShareItems> list2 = shareItemsList;
        if (list2 != null && !list2.isEmpty() && (list = masks) != null && !list.isEmpty()) {
            for (BLiveVoiceShareItems bLiveVoiceShareItems : shareItemsList) {
                for (BLiveUserMask bLiveUserMask : masks) {
                    if (Intrinsics.m87488d(bLiveVoiceShareItems.f44509id, bLiveUserMask.userId)) {
                        arrayList.add(new r7j(bLiveUserMask, false, bLiveVoiceShareItems.isOnline));
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
