package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p1.mobile.putong.core.data.SvipWeeklyReport;
import com.p1.mobile.putong.core.data.SvipWeeklyReportItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.w9j;
import l.xma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ll/i1y;", "", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/SvipWeeklyReport;", "e", "()Lrx/c;", "svipWeeklyReport", "", "d", "(Lcom/p1/mobile/putong/core/data/SvipWeeklyReport;)V", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "a", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "c", "()Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "setSvipWeeklyItemData", "(Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;)V", "svipWeeklyItemData", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class i1y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MeetFeedSvipWeeklyItemData svipWeeklyItemData;

    /* JADX INFO: renamed from: a */
    public static SvipWeeklyReport m16171a(Function1 function1, Object obj) {
        return (SvipWeeklyReport) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static SvipWeeklyReport m16172b(i1y i1yVar, SvipWeeklyReport svipWeeklyReport) {
        if (svipWeeklyReport == null) {
            return null;
        }
        i1yVar.m16174d(svipWeeklyReport);
        return svipWeeklyReport;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final MeetFeedSvipWeeklyItemData getSvipWeeklyItemData() {
        return this.svipWeeklyItemData;
    }

    /* JADX INFO: renamed from: d */
    public final void m16174d(SvipWeeklyReport svipWeeklyReport) {
        MeetFeedSvipWeeklyItemData meetFeedSvipWeeklyItemData = new MeetFeedSvipWeeklyItemData();
        this.svipWeeklyItemData = meetFeedSvipWeeklyItemData;
        meetFeedSvipWeeklyItemData.title = svipWeeklyReport.title;
        meetFeedSvipWeeklyItemData.subTitle = svipWeeklyReport.subTitle;
        meetFeedSvipWeeklyItemData.svipWeeklyItems = new ArrayList();
        List<SvipWeeklyReportItem> list = svipWeeklyReport.statistics;
        list.getClass();
        for (SvipWeeklyReportItem svipWeeklyReportItem : list) {
            MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem = new MeetFeedSvipWeeklyItemData.SvipWeeklyItem();
            svipWeeklyItem.itemType = svipWeeklyReportItem.type;
            svipWeeklyItem.numberValue = svipWeeklyReportItem.count;
            meetFeedSvipWeeklyItemData.svipWeeklyItems.add(svipWeeklyItem);
            String str = svipWeeklyReportItem.type;
            if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_VISITOR)) {
                svipWeeklyItem.iconRes = b3c0.t5;
                svipWeeklyItem.lable = "看过了我";
                svipWeeklyItem.svipWeeklyItemRenderType = 1;
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_LIKERS)) {
                svipWeeklyItem.iconRes = b3c0.r5;
                svipWeeklyItem.lable = "喜欢了我";
                svipWeeklyItem.svipWeeklyItemRenderType = 1;
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_NEW_MATCH)) {
                svipWeeklyItem.iconRes = b3c0.s5;
                svipWeeklyItem.lable = "新配对";
                svipWeeklyItem.svipWeeklyItemRenderType = 1;
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_CHATWITH)) {
                svipWeeklyItem.otherUserId = svipWeeklyReportItem.otherUserID;
                svipWeeklyItem.userImgUrl = svipWeeklyReportItem.userImgUrl;
                svipWeeklyItem.userName = svipWeeklyReportItem.userName;
                svipWeeklyItem.lable = "特别好友";
                svipWeeklyItem.svipWeeklyItemRenderType = 2;
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_CARE)) {
                svipWeeklyItem.otherUserId = svipWeeklyReportItem.otherUserID;
                svipWeeklyItem.userImgUrl = svipWeeklyReportItem.userImgUrl;
                svipWeeklyItem.userName = svipWeeklyReportItem.userName;
                svipWeeklyItem.lable = "我最关心";
                svipWeeklyItem.svipWeeklyItemRenderType = 2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final c<SvipWeeklyReport> m16175e() {
        if (!CoreModule.P().g().dh() || !xma.L3()) {
            c<SvipWeeklyReport> cVarJust = c.just((Object) null);
            cVarJust.getClass();
            return cVarJust;
        }
        c cVarI5 = CoreModule.c.m1.I5();
        final Function1 function1 = new Function1() { // from class: l.g1y
            public final Object invoke(Object obj) {
                return i1y.m16172b(this.f13270a, (SvipWeeklyReport) obj);
            }
        };
        c<SvipWeeklyReport> map = cVarI5.map(new w9j() { // from class: l.h1y
            public final Object call(Object obj) {
                return i1y.m16171a(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
