package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceShareItems;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/h3f0;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceShareItems;", "shareItemsList", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "masks", "Ll/laj;", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class h3f0 {

    @NotNull
    public static final h3f0 INSTANCE = new h3f0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<laj> m133466a(@Nullable List<BLiveVoiceShareItems> shareItemsList, @Nullable List<BLiveUserMask> masks) {
        List<BLiveUserMask> list;
        ArrayList arrayList = new ArrayList();
        List<BLiveVoiceShareItems> list2 = shareItemsList;
        if (list2 != null && !list2.isEmpty() && (list = masks) != null && !list.isEmpty()) {
            for (BLiveVoiceShareItems bLiveVoiceShareItems : shareItemsList) {
                for (BLiveUserMask bLiveUserMask : masks) {
                    if (Intrinsics.m88377d(bLiveVoiceShareItems.f45357id, bLiveUserMask.userId)) {
                        arrayList.add(new laj(bLiveUserMask, false, bLiveVoiceShareItems.isOnline));
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
