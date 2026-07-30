package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p051p1.mobile.putong.core.data.SvipWeeklyReport;
import com.p051p1.mobile.putong.core.data.SvipWeeklyReportItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ll/fay;", "", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/SvipWeeklyReport;", "e", "()Lrx/c;", "svipWeeklyReport", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/SvipWeeklyReport;)V", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "a", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "c", "()Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "setSvipWeeklyItemData", "(Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;)V", "svipWeeklyItemData", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fay {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MeetFeedSvipWeeklyItemData svipWeeklyItemData;

    /* JADX INFO: renamed from: a */
    public static SvipWeeklyReport m124795a(Function1 function1, Object obj) {
        return (SvipWeeklyReport) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static SvipWeeklyReport m124796b(fay fayVar, SvipWeeklyReport svipWeeklyReport) {
        if (svipWeeklyReport == null) {
            return null;
        }
        fayVar.m124798d(svipWeeklyReport);
        return svipWeeklyReport;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final MeetFeedSvipWeeklyItemData getSvipWeeklyItemData() {
        return this.svipWeeklyItemData;
    }

    /* JADX INFO: renamed from: d */
    public final void m124798d(SvipWeeklyReport svipWeeklyReport) {
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
            if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_VISITOR)) {
                svipWeeklyItem.iconRes = gbc0.f103411t5;
                svipWeeklyItem.lable = "看过了我";
                svipWeeklyItem.svipWeeklyItemRenderType = 1;
            } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_LIKERS)) {
                svipWeeklyItem.iconRes = gbc0.f103395r5;
                svipWeeklyItem.lable = "喜欢了我";
                svipWeeklyItem.svipWeeklyItemRenderType = 1;
            } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_NEW_MATCH)) {
                svipWeeklyItem.iconRes = gbc0.f103403s5;
                svipWeeklyItem.lable = "新配对";
                svipWeeklyItem.svipWeeklyItemRenderType = 1;
            } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_CHATWITH)) {
                svipWeeklyItem.otherUserId = svipWeeklyReportItem.otherUserID;
                svipWeeklyItem.userImgUrl = svipWeeklyReportItem.userImgUrl;
                svipWeeklyItem.userName = svipWeeklyReportItem.userName;
                svipWeeklyItem.lable = "特别好友";
                svipWeeklyItem.svipWeeklyItemRenderType = 2;
            } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_CARE)) {
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
    public final C22421c<SvipWeeklyReport> m124799e() {
        if (!CoreModule.m30933P().m143410g().mo36058dh() || !joa.m146361M3()) {
            C22421c<SvipWeeklyReport> c22421cJust = C22421c.just(null);
            c22421cJust.getClass();
            return c22421cJust;
        }
        C22421c<SvipWeeklyReport> c22421cM35695I5 = CoreModule.f18264c.f20406m1.m35695I5();
        final Function1 function1 = new Function1() { // from class: l.day
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fay.m124796b(this.f85944a, (SvipWeeklyReport) obj);
            }
        };
        C22421c map = c22421cM35695I5.map(new qcj() { // from class: l.eay
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fay.m124795a(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
