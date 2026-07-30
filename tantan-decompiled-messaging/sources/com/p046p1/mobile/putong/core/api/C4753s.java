package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4753s;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedImageItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.FeedType;
import com.p046p1.mobile.putong.core.data.LiveType;
import com.p046p1.mobile.putong.core.data.MyMeetEntryFeed;
import com.p046p1.mobile.putong.core.data.MyMeetEntryV3;
import com.p046p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p046p1.mobile.putong.core.data.MyMeetListV3;
import com.p046p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p046p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p046p1.mobile.putong.core.data.ODiamondListFeed;
import com.p046p1.mobile.putong.core.data.SvipWeeklyReport;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.e30;
import p149l.ia20;
import p149l.j6f;
import p149l.jo0;
import p149l.mqi0;
import p149l.q860;
import p149l.roj0;
import p149l.stc0;
import p149l.uqd0;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.w700;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009f\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010\"\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b%\u0010&J9\u0010+\u001a\u00020\u00172\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0017¢\u0006\u0004\b-\u0010\u001eJ\u0017\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u0010¢\u0006\u0004\b5\u0010\u0012J\u0015\u00106\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103¢\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0017¢\u0006\u0004\b;\u0010\u001eJ\u0015\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010<¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0<0\u0010¢\u0006\u0004\b?\u0010\u0012J\u001b\u0010@\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t0<¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ3\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00102\u0006\u0010F\u001a\u00020E2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\bJ\u0010KJ%\u0010M\u001a\u00020\u00172\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00140\bj\b\u0012\u0004\u0012\u00020\u0014`\n¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0017¢\u0006\u0004\bR\u0010\u001eJ\r\u0010S\u001a\u00020E¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u0017¢\u0006\u0004\bU\u0010\u001eJ\r\u0010V\u001a\u00020\u001a¢\u0006\u0004\bV\u0010\u001cJ\r\u0010W\u001a\u00020\u0017¢\u0006\u0004\bW\u0010\u001eJ\u0015\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u0010¢\u0006\u0004\bY\u0010\u0012J\u0015\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u0010¢\u0006\u0004\bZ\u0010\u0012J\u0015\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u0010¢\u0006\u0004\b\\\u0010\u0012J\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020I0\u00102\b\b\u0002\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0017¢\u0006\u0004\b_\u0010\u001eJ\r\u0010`\u001a\u00020\u001a¢\u0006\u0004\b`\u0010\u001cJ\r\u0010a\u001a\u00020\u001a¢\u0006\u0004\ba\u0010\u001cJ\r\u0010b\u001a\u00020\u0017¢\u0006\u0004\bb\u0010\u001eJ\u0015\u0010c\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\bc\u0010#J\u0015\u0010d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\bd\u0010\u0019J\u0013\u0010e\u001a\b\u0012\u0004\u0012\u00020I0\u0010¢\u0006\u0004\be\u0010\u0012J\r\u0010f\u001a\u00020\u0017¢\u0006\u0004\bf\u0010\u001eR \u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0<0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iRP\u0010m\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204 k*\n\u0012\u0004\u0012\u000204\u0018\u00010303 k*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204 k*\n\u0012\u0004\u0012\u000204\u0018\u00010303\u0018\u00010g0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010iR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00140g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010iR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020[0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010iR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010xR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00140|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R#\u0010\u0082\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u0001030g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010iR<\u0010\u0084\u0001\u001a&\u0012\f\u0012\n k*\u0004\u0018\u00010\r0\r k*\u0012\u0012\f\u0012\n k*\u0004\u0018\u00010\r0\r\u0018\u00010g0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010iR<\u0010\u0086\u0001\u001a&\u0012\f\u0012\n k*\u0004\u0018\u00010X0X k*\u0012\u0012\f\u0012\n k*\u0004\u0018\u00010X0X\u0018\u00010|0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010~R\u001c\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020[0g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010iR\u001c\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020I0g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010iR\u0016\u0010\u008c\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010xR\u0016\u0010\u008e\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010xR)\u0010\u0093\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00140\u008f\u0001j\t\u0012\u0004\u0012\u00020\u0014`\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0095\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010xR!\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020I0|8\u0006¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010~\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R$\u0010\u009d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020.0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006 \u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/api/s;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/data/Envelope;", Envelope.TYPE, "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/businessdata/meet/AbsMeetListData;", "Lkotlin/collections/ArrayList;", "I4", "(Lcom/p1/mobile/putong/data/Envelope;)Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/data/VisitorCounter;", "N4", "()Lcom/p1/mobile/putong/data/VisitorCounter;", "Lrx/c;", "Q4", "()Lrx/c;", "s5", "", "r4", Oauth2AccessToken.KEY_UID, "", "H5", "(Ljava/lang/String;)V", "", "g4", "()Z", "S4", "()V", "n4", "userId", "R4", "k4", "(Ljava/lang/String;)Z", "needSuperlikeCount", "e4", "(Z)V", "Lcom/p1/mobile/putong/data/DbLinks;", "dbLinks", "fetchNew", "haveRead", "y4", "(Lcom/p1/mobile/putong/data/DbLinks;ZZZ)V", "Z4", "Lcom/p1/mobile/putong/core/data/MyMeetLiveItem;", "q4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/MyMeetLiveItem;", "p4", "()Ljava/lang/String;", "", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetLiveItemData;", "s4", "t4", "()Ljava/util/List;", "list", "K5", "(Ljava/util/List;)V", "m4", "Ll/q860;", "L4", "()Ll/q860;", "K4", "N5", "(Ll/q860;)V", "", "v4", "()I", "", "lastSeeReadTime", "sinceSortId", "lastVisitorTab2Time", "Ll/roj0;", "m5", "(JLjava/lang/String;J)Lrx/c;", "readList", "O5", "(Ljava/util/ArrayList;)V", "Lcom/p1/mobile/putong/core/data/MyMeetSeeReminder;", "w4", "()Lcom/p1/mobile/putong/core/data/MyMeetSeeReminder;", "f5", "u4", "()J", "M5", "j4", "o4", "Lcom/p1/mobile/putong/core/data/SvipWeeklyReport;", "y5", "I5", "Lcom/p1/mobile/putong/core/data/MyMeetEntryV3;", "P4", "T4", "(J)Lrx/c;", "L5", "i4", "h4", "J5", "l4", "F5", "O4", "G5", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "newMeetFeedBehaviorSubject", "kotlin.jvm.PlatformType", j6f.LATITUDE_SOUTH, "meetLiveUserBs", j6f.GPS_DIRECTION_TRUE, "paidToInterceptUserIdBs", "U", "newMeetEntrySubject", "Ll/uqd0;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/uqd0;", "firstSortId", "Ll/zpd0;", "W", "Ll/zpd0;", "showGuideToSwipeCardLastTime", "X", "meetVisitorsTabLastTime", "Lrx/subjects/b;", "Y", "Lrx/subjects/b;", "newMeetFeedLikersDataSectChangePs", "Lcom/p1/mobile/putong/core/data/ODiamondListFeed;", "Z", "oDiamondListFeedObs", "a0", "newVisitorsCounterBs", "b0", "svipWeeklyReportBs", "c0", "meetEntranceV4Bs", "d0", "meetEntranceRefreshBs", "e0", "meetNearbyTabLastTime", "f0", "meetEntranceAcceleratePairClickedMils", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "g0", "Ljava/util/HashSet;", "meetUsersCustomTagUidSet", "h0", "meet2SeeLikersOnLineTime", "i0", "M4", "()Lrx/subjects/b;", "newMeetLikersItemViewNotificationBs", "", "j0", "Ljava/util/Map;", "liveUserMap", "Companion", "a", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C4753s extends ax6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final String f20097k0 = "text";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final C22392a<q860<AbsMeetListData>> newMeetFeedBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final C22392a<List<MeetLiveItemData>> meetLiveUserBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final C22392a<String> paidToInterceptUserIdBs;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final C22392a<MyMeetEntryV3> newMeetEntrySubject;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public final uqd0 firstSortId;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public final zpd0 showGuideToSwipeCardLastTime;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public final zpd0 meetVisitorsTabLastTime;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public final C22393b<String> newMeetFeedLikersDataSectChangePs;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public final C22392a<List<ODiamondListFeed>> oDiamondListFeedObs;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public C22392a<VisitorCounter> newVisitorsCounterBs;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public C22393b<SvipWeeklyReport> svipWeeklyReportBs;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    public final C22392a<MyMeetEntryV3> meetEntranceV4Bs;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    public final C22392a<roj0> meetEntranceRefreshBs;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @NotNull
    public final zpd0 meetNearbyTabLastTime;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    public final zpd0 meetEntranceAcceleratePairClickedMils;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> meetUsersCustomTagUidSet;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    @NotNull
    public final zpd0 meet2SeeLikersOnLineTime;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    public final C22393b<roj0> newMeetLikersItemViewNotificationBs;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final Map<String, MyMeetLiveItem> liveUserMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.s$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/core/api/s$a;", "", "<init>", "()V", "", "MOMENT_TEXT_TYPE", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m34735a() {
            return C4753s.f20097k0;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4753s(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        C22392a<q860<AbsMeetListData>> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.newMeetFeedBehaviorSubject = c22392aM221512b;
        this.meetLiveUserBs = C22392a.m221512b();
        C22392a<String> c22392aM221513c = C22392a.m221513c("");
        c22392aM221513c.getClass();
        this.paidToInterceptUserIdBs = c22392aM221513c;
        C22392a<MyMeetEntryV3> c22392aM221512b2 = C22392a.m221512b();
        c22392aM221512b2.getClass();
        this.newMeetEntrySubject = c22392aM221512b2;
        this.firstSortId = new uqd0("firstSortId_" + CoreModule.m29931H().userId(), "");
        this.showGuideToSwipeCardLastTime = new zpd0("jump_guide_to_swipe_card_last_time_" + CoreModule.m29931H().userId(), 0L);
        this.meetVisitorsTabLastTime = new zpd0("meet_visitors_tab_last_time_mills_" + CoreModule.m29931H().userId(), 0L);
        C22393b<String> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        this.newMeetFeedLikersDataSectChangePs = c22393bM221521b;
        C22392a<List<ODiamondListFeed>> c22392aM221512b3 = C22392a.m221512b();
        c22392aM221512b3.getClass();
        this.oDiamondListFeedObs = c22392aM221512b3;
        this.newVisitorsCounterBs = C22392a.m221512b();
        this.svipWeeklyReportBs = C22393b.m221521b();
        C22392a<MyMeetEntryV3> c22392aM221512b4 = C22392a.m221512b();
        c22392aM221512b4.getClass();
        this.meetEntranceV4Bs = c22392aM221512b4;
        C22392a<roj0> c22392aM221513c2 = C22392a.m221513c(roj0.f160388a);
        c22392aM221513c2.getClass();
        this.meetEntranceRefreshBs = c22392aM221513c2;
        this.meetNearbyTabLastTime = new zpd0("meet_nearby_tab_last_time_mills_" + CoreModule.m29931H().userId(), 0L);
        this.meetEntranceAcceleratePairClickedMils = new zpd0("meet_entrance_accelerate_pair_clicked_mills_" + CoreModule.m29931H().userId(), 0L);
        this.meetUsersCustomTagUidSet = new HashSet<>();
        this.meet2SeeLikersOnLineTime = new zpd0("meet_2_see_likers_online_time_" + CoreModule.m29931H().userId(), 0L);
        C22393b<roj0> c22393bM221521b2 = C22393b.m221521b();
        c22393bM221521b2.getClass();
        this.newMeetLikersItemViewNotificationBs = c22393bM221521b2;
        this.liveUserMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: A4 */
    public static final stc0 m34590A4(StringBuilder sb) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31293e1(sb.toString())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: A5 */
    public static final Envelope m34591A5(C4753s c4753s, Envelope envelope) {
        c4753s.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Envelope m34593B4(C4753s c4753s, Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4753s.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: B5 */
    public static final Envelope m34594B5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C4 */
    public static final Envelope m34596C4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C5 */
    public static final SvipWeeklyReport m34597C5(C4753s c4753s, Envelope envelope) {
        envelope.getClass();
        SvipWeeklyReport svipWeeklyReport = ((CoreData) envelope.getModuleData(CoreData.class)).svipWeeklyReport;
        c4753s.svipWeeklyReportBs.m132487l(svipWeeklyReport);
        return svipWeeklyReport;
    }

    /* JADX INFO: renamed from: D4 */
    public static final roj0 m34599D4(C4753s c4753s, DbLinks dbLinks, boolean z, Envelope envelope) {
        List<AbsMeetListData> list;
        Links linksNew_;
        DbLinks dbLinks2;
        q860<AbsMeetListData> q860VarM221515e;
        List<AbsMeetListData> list2;
        ArrayList arrayList = new ArrayList();
        if (dbLinks == null) {
            envelope.getClass();
            arrayList.addAll(c4753s.m34691I4(envelope));
            if (z && (q860VarM221515e = c4753s.newMeetFeedBehaviorSubject.m221515e()) != null && (list2 = q860VarM221515e.f153135a) != null) {
                arrayList.addAll(list2);
            }
        } else {
            q860<AbsMeetListData> q860VarM221515e2 = c4753s.newMeetFeedBehaviorSubject.m221515e();
            if (q860VarM221515e2 != null && (list = q860VarM221515e2.f153135a) != null) {
                arrayList.addAll(list);
            }
            envelope.getClass();
            final ArrayList<AbsMeetListData> arrayListM34691I4 = c4753s.m34691I4(envelope);
            vwb.m200320d0(arrayList, new w9j() { // from class: l.wp9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C4753s.m34602E4(arrayListM34691I4, (AbsMeetListData) obj);
                }
            });
            arrayList.addAll(arrayListM34691I4);
        }
        if (!vwb.m200296J(arrayList)) {
            c4753s.firstSortId.put(((AbsMeetListData) arrayList.get(0)).item.sortId);
        }
        DbLinks dbLinks3 = new DbLinks();
        if (z) {
            q860<AbsMeetListData> q860VarM221515e3 = c4753s.newMeetFeedBehaviorSubject.m221515e();
            dbLinks3.total = q860VarM221515e3 != null ? q860VarM221515e3.m173344d() : 0;
            q860<AbsMeetListData> q860VarM221515e4 = c4753s.newMeetFeedBehaviorSubject.m221515e();
            if (q860VarM221515e4 == null || (dbLinks2 = q860VarM221515e4.f153136b) == null || (linksNew_ = dbLinks2.links) == null) {
                linksNew_ = Links.new_();
            }
            dbLinks3.links = linksNew_;
        } else {
            Pagination pagination = envelope.pagination;
            dbLinks3.total = pagination.total;
            dbLinks3.links = pagination.links;
        }
        c4753s.newMeetFeedBehaviorSubject.m132487l(new q860<>(arrayList, dbLinks3));
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: D5 */
    public static final SvipWeeklyReport m34600D5(Function1 function1, Object obj) {
        return (SvipWeeklyReport) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E4 */
    public static final Boolean m34602E4(ArrayList arrayList, final IMeetListData iMeetListData) {
        if (iMeetListData instanceof AbsMeetUserItemData) {
            return Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.fq9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C4753s.m34605F4(iMeetListData, (AbsMeetListData) obj);
                }
            }));
        }
        return iMeetListData instanceof MeetFeedSeeItemData ? Boolean.valueOf(vwb.m200337m(arrayList, new w9j() { // from class: l.gq9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34607G4((AbsMeetListData) obj);
            }
        })) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: E5 */
    public static final void m34603E5(C4753s c4753s, Throwable th) {
        c4753s.svipWeeklyReportBs.m132487l(null);
    }

    /* JADX INFO: renamed from: F4 */
    public static final Boolean m34605F4(IMeetListData iMeetListData, AbsMeetListData absMeetListData) {
        return absMeetListData instanceof AbsMeetUserItemData ? Boolean.valueOf(Intrinsics.m87488d(((AbsMeetUserItemData) absMeetListData).item.f20453id, ((AbsMeetUserItemData) iMeetListData).item.f20453id)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Boolean m34607G4(AbsMeetListData absMeetListData) {
        return Boolean.valueOf(absMeetListData instanceof MeetFeedSeeItemData);
    }

    /* JADX INFO: renamed from: H4 */
    public static final roj0 m34609H4(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Boolean m34612J4(MyMeetFeedItem myMeetFeedItem, Object obj) {
        obj.getClass();
        return Boolean.valueOf(Intrinsics.m87488d(((CoreMomentInfo) obj).f56008id, myMeetFeedItem.momentId));
    }

    /* JADX INFO: renamed from: N3 */
    public static Unit m34616N3(ArrayList arrayList, Envelope envelope) {
        arrayList.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P5 */
    public static final stc0 m34619P5(String str) {
        return C4728a.f19494P.auth().m185893l(utc0.create(Network.JSON, str)).m185898q(C4728a.m31297f1()).m185883b();
    }

    /* JADX INFO: renamed from: U3 */
    public static void m34624U3(C4753s c4753s, Throwable th) {
        C22392a<MyMeetEntryV3> c22392a = c4753s.meetEntranceV4Bs;
        c22392a.m132487l(c22392a.m221515e());
    }

    /* JADX INFO: renamed from: U4 */
    public static final stc0 m34625U4(StringBuilder sb) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31217K0(sb.toString())).m185883b();
    }

    /* JADX INFO: renamed from: V4 */
    public static final Envelope m34627V4(C4753s c4753s, Envelope envelope) {
        envelope.getClass();
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4753s.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Envelope m34629W4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X4 */
    public static final roj0 m34631X4(C4753s c4753s, Envelope envelope) {
        c4753s.meetEntranceV4Bs.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).myMeetEntryV3);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final roj0 m34633Y4(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m34636a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a5 */
    public static final stc0 m34637a5() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31225M0()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: b4 */
    public static C22306c m34639b4(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.ro9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34619P5(str);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static final Envelope m34640b5(C4753s c4753s, Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4753s.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Envelope m34643c5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d5 */
    public static final roj0 m34645d5(C4753s c4753s, Envelope envelope) {
        LinkedHashMap linkedHashMap;
        MyMeetListV3 myMeetListV3;
        List<MyMeetLiveItem> list;
        User user;
        List<User> list2;
        ArrayList arrayList = new ArrayList();
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (commonData == null || (list2 = commonData.users) == null) {
            linkedHashMap = null;
        } else {
            List<User> list3 = list2;
            linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
            for (Object obj : list3) {
                linkedHashMap.put(((User) obj).f56011id, obj);
            }
        }
        c4753s.liveUserMap.clear();
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (coreData != null && (myMeetListV3 = coreData.myMeetListV3) != null && (list = myMeetListV3.liveUsers) != null) {
            for (MyMeetLiveItem myMeetLiveItem : list) {
                if (TEnum.equals(myMeetLiveItem.liveType, "live") || TEnum.equals(myMeetLiveItem.liveType, LiveType.liveVoice)) {
                    c4753s.liveUserMap.put(myMeetLiveItem.userId, myMeetLiveItem);
                    if (linkedHashMap != null && (user = (User) linkedHashMap.get(myMeetLiveItem.userId)) != null) {
                        arrayList.add(new MeetLiveItemData(user, myMeetLiveItem));
                    }
                }
            }
        }
        c4753s.meetLiveUserBs.m132487l(arrayList);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: e5 */
    public static final roj0 m34647e5(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f3 */
    public static C22306c m34648f3(final StringBuilder sb, final C4753s c4753s, final DbLinks dbLinks, final boolean z) {
        C22306c<Envelope> c22306cM135123g = ia20.m135123g(new v9j() { // from class: l.yo9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34590A4(sb);
            }
        }, false);
        final Function1 function1 = new Function1() { // from class: l.zo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34593B4(this.f204093a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135123g.map(new w9j() { // from class: l.ap9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34596C4(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.bp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34599D4(this.f76611a, dbLinks, z, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.cp9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34609H4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m34649f4(C4753s c4753s, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c4753s.m34711e4(z);
    }

    /* JADX INFO: renamed from: g5 */
    public static final stc0 m34651g5() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31229N0(CoreModule.m29931H().userId())).m185883b();
    }

    /* JADX INFO: renamed from: h3 */
    public static C22306c m34652h3(final C4753s c4753s) {
        C22306c<Envelope> c22306cM135123g = ia20.m135123g(new v9j() { // from class: l.qp9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34637a5();
            }
        }, true);
        final Function1 function1 = new Function1() { // from class: l.sp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34640b5(this.f165761a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135123g.map(new w9j() { // from class: l.tp9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34643c5(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.up9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34645d5(this.f177580a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.vp9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34647e5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public static final Envelope m34653h5(C4753s c4753s, Envelope envelope) {
        envelope.getClass();
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4753s.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Envelope m34655i5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m34657j5(C4753s c4753s, Envelope envelope) {
        if (NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).odiamondList)) {
            List<ODiamondListFeed> list = ((CoreData) envelope.getModuleData(CoreData.class)).odiamondList.feeds;
            list.getClass();
            if (!vwb.m200296J(list)) {
                c4753s.oDiamondListFeedObs.m132487l(list);
            }
        } else {
            C22392a<List<ODiamondListFeed>> c22392a = c4753s.oDiamondListFeedObs;
            c22392a.m132487l(c22392a.m221515e());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m34659k5(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l3 */
    public static C22306c m34660l3(final StringBuilder sb, final C4753s c4753s) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.so9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34664n5(sb);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.to9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34666o5(this.f171323a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135121e.map(new w9j() { // from class: l.uo9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34668p5(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.wo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34670q5(this.f187390a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.xo9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34672r5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m34661l5(C4753s c4753s, Throwable th) {
        C22392a<List<ODiamondListFeed>> c22392a = c4753s.oDiamondListFeedObs;
        c22392a.m132487l(c22392a.m221515e());
    }

    /* JADX INFO: renamed from: m3 */
    public static C22306c m34662m3(final C4753s c4753s) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.jq9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34675t5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.kq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34677u5(this.f124226a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135121e.map(new w9j() { // from class: l.lq9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34679v5(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.lo9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34681w5(this.f129079a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.mo9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34683x5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public static final stc0 m34664n5(StringBuilder sb) {
        return C4728a.f19494P.auth().m185898q(C4728a.m31289d1(sb.toString())).m185883b();
    }

    /* JADX INFO: renamed from: o5 */
    public static final Envelope m34666o5(C4753s c4753s, Envelope envelope) {
        envelope.getClass();
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4753s.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: p5 */
    public static final Envelope m34668p5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    public static final roj0 m34670q5(C4753s c4753s, Envelope envelope) {
        c4753s.newMeetEntrySubject.m132487l(((CoreData) envelope.getModuleData(CoreData.class)).myMeetEntryV3);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: r5 */
    public static final roj0 m34672r5(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t5 */
    public static final stc0 m34675t5() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31223L2(CoreModule.m29931H().userId())).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: u5 */
    public static final Envelope m34677u5(C4753s c4753s, Envelope envelope) {
        c4753s.f72126Q.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: v3 */
    public static C22306c m34678v3(final StringBuilder sb, final C4753s c4753s) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.dp9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34625U4(sb);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.ep9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34627V4(this.f92615a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135121e.map(new w9j() { // from class: l.fp9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34629W4(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.hp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34631X4(this.f108903a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.ip9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34633Y4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: v5 */
    public static final Envelope m34679v5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w3 */
    public static C22306c m34680w3(final C4753s c4753s) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.jp9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34687z5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.kp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34591A5(this.f124128a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135121e.map(new w9j() { // from class: l.lp9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34594B5(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.mp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34597C5(this.f135025a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.np9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34600D5(function2, obj);
            }
        }).doOnError(new e30() { // from class: l.op9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4753s.m34603E5(this.f144958a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public static final VisitorCounter m34681w5(C4753s c4753s, Envelope envelope) {
        envelope.getClass();
        VisitorCounter visitorCounter = ((CommonData) envelope.getModuleData(CommonData.class)).visitorCounter;
        visitorCounter.getClass();
        c4753s.newVisitorsCounterBs.m132487l(visitorCounter);
        return visitorCounter;
    }

    /* JADX INFO: renamed from: x3 */
    public static C22306c m34682x3(final C4753s c4753s) {
        C22306c<Envelope> c22306cM135121e = ia20.m135121e(new v9j() { // from class: l.xp9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34651g5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.yp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34653h5(this.f199403a, (Envelope) obj);
            }
        };
        C22306c c22306cObserveOn = c22306cM135121e.map(new w9j() { // from class: l.zp9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34655i5(function1, obj);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.aq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34657j5(this.f71139a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.bq9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4753s.m34659k5(function2, obj);
            }
        }).doOnError(new e30() { // from class: l.dq9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4753s.m34661l5(this.f87398a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public static final VisitorCounter m34683x5(Function1 function1, Object obj) {
        return (VisitorCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static void m34685z3(C4753s c4753s, Throwable th) {
        C22392a<MyMeetEntryV3> c22392a = c4753s.newMeetEntrySubject;
        c22392a.m132487l(c22392a.m221515e());
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m34686z4(C4753s c4753s, DbLinks dbLinks, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            dbLinks = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        c4753s.m34733y4(dbLinks, z, z2, z3);
    }

    /* JADX INFO: renamed from: z5 */
    public static final stc0 m34687z5() {
        return C4728a.f19494P.auth().m185898q(C4728a.m31366w2("/" + CoreModule.m29931H().userId() + "/svip-weekly-report")).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: F5 */
    public final void m34688F5(@NotNull String uid) {
        uid.getClass();
        this.meetUsersCustomTagUidSet.add(uid);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m34689G5() {
        this.meetEntranceRefreshBs.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: H5 */
    public final void m34690H5(@NotNull String uid) {
        uid.getClass();
        this.newMeetFeedLikersDataSectChangePs.m132487l(uid);
    }

    /* JADX INFO: renamed from: I4 */
    public final ArrayList<AbsMeetListData> m34691I4(Envelope envelope) {
        MyMeetListV3 myMeetListV3;
        List<MyMeetFeedItem> list;
        ValueObject valueObject;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        ArrayList<AbsMeetListData> arrayList = new ArrayList<>();
        w700 w700Var = (w700) CoreModule.m29934N().mo60266Ca(envelope, CoreMomentInfo.JSON_ADAPTER);
        List<User> list2 = commonData.users;
        list2.getClass();
        List<User> list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((User) obj).f56011id, obj);
        }
        MyMeetListV3 myMeetListV4 = coreData.myMeetListV3;
        if (!vwb.m200296J(myMeetListV4 != null ? myMeetListV4.feeds : null) && (myMeetListV3 = coreData.myMeetListV3) != null && (list = myMeetListV3.feeds) != null) {
            for (final MyMeetFeedItem myMeetFeedItem : list) {
                if (Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.relationMoment)) || Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.pickMoment))) {
                    int iM200293G = vwb.m200293G(w700Var, new w9j() { // from class: l.eq9
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return C4753s.m34612J4(myMeetFeedItem, obj2);
                        }
                    });
                    if (iM200293G != -1 && w700Var != null && (valueObject = w700Var.get(iM200293G)) != null && (valueObject instanceof CoreMomentInfo)) {
                        if (TextUtils.equals(myMeetFeedItem.momentMediaType, f20097k0)) {
                            CoreMomentInfo coreMomentInfo = (CoreMomentInfo) valueObject;
                            MeetFeedUserItemData meetFeedUserItemData = new MeetFeedUserItemData((User) linkedHashMap.get(coreMomentInfo.owner), myMeetFeedItem);
                            meetFeedUserItemData.setCoreMomentInfo(coreMomentInfo);
                            arrayList.add(meetFeedUserItemData);
                        } else {
                            CoreMomentInfo coreMomentInfo2 = (CoreMomentInfo) valueObject;
                            List<Media> list4 = coreMomentInfo2.media;
                            list4.getClass();
                            boolean z = CollectionsKt.getOrNull(list4, 0) instanceof Video;
                            String str = coreMomentInfo2.owner;
                            if (z) {
                                arrayList.add(new MeetFeedVideoItemData(coreMomentInfo2, (User) linkedHashMap.get(str), w700Var.m202002c().get(iM200293G), myMeetFeedItem));
                            } else {
                                arrayList.add(new MeetFeedImageItemData(coreMomentInfo2, (User) linkedHashMap.get(str), w700Var.m202002c().get(iM200293G), myMeetFeedItem));
                            }
                        }
                    }
                } else if (Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.lowSeeUsers))) {
                    arrayList.add(new MeetFeedSeeItemData(myMeetFeedItem));
                } else if (Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.pickUser)) || Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.highSeeUser)) || Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get("likedUser")) || Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.seePortraitUser)) || Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.lowSeeUser)) || Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.momentLikeUser)) || Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.momentBeLikeUser))) {
                    if (Intrinsics.m87488d(myMeetFeedItem.type, FeedType.get(FeedType.seePortraitUser))) {
                        this.f72126Q.f19687u0.m30444i5(myMeetFeedItem.userIds.get(0));
                    }
                    arrayList.add(new MeetFeedUserItemData((User) linkedHashMap.get(myMeetFeedItem.userIds.get(0)), myMeetFeedItem));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: I5 */
    public final C22306c<SvipWeeklyReport> m34692I5() {
        C22306c<SvipWeeklyReport> c22306cAsObservable = this.svipWeeklyReportBs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: J5 */
    public final void m34693J5() {
        this.meetEntranceAcceleratePairClickedMils.put(Long.valueOf(mqi0.m155944o()));
    }

    @NotNull
    /* JADX INFO: renamed from: K4 */
    public final C22306c<q860<AbsMeetListData>> m34694K4() {
        C22306c<q860<AbsMeetListData>> c22306cAsObservable = this.newMeetFeedBehaviorSubject.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: K5 */
    public final void m34695K5(@NotNull List<? extends MeetLiveItemData> list) {
        list.getClass();
        this.meetLiveUserBs.m132487l(list);
    }

    @Nullable
    /* JADX INFO: renamed from: L4 */
    public final q860<AbsMeetListData> m34696L4() {
        return this.newMeetFeedBehaviorSubject.m221515e();
    }

    /* JADX INFO: renamed from: L5 */
    public final void m34697L5() {
        this.meetNearbyTabLastTime.put(Long.valueOf(mqi0.m155944o()));
    }

    @NotNull
    /* JADX INFO: renamed from: M4 */
    public final C22393b<roj0> m34698M4() {
        return this.newMeetLikersItemViewNotificationBs;
    }

    /* JADX INFO: renamed from: M5 */
    public final void m34699M5() {
        this.meetVisitorsTabLastTime.put(Long.valueOf(mqi0.m155944o()));
    }

    @Nullable
    /* JADX INFO: renamed from: N4 */
    public final VisitorCounter m34700N4() {
        if (this.newVisitorsCounterBs.m221519i()) {
            return this.newVisitorsCounterBs.m221515e();
        }
        return null;
    }

    /* JADX INFO: renamed from: N5 */
    public final void m34701N5(@NotNull q860<AbsMeetListData> list) {
        list.getClass();
        this.newMeetFeedBehaviorSubject.m132487l(list);
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final C22306c<roj0> m34702O4() {
        C22306c<roj0> c22306cAsObservable = this.meetEntranceRefreshBs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: O5 */
    public final void m34703O5(@NotNull final ArrayList<String> readList) {
        readList.getClass();
        StringBuilder sb = new StringBuilder();
        for (String str : readList) {
            if (sb.length() == 0) {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            } else {
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
        }
        final String str2 = "{\"ids\":[" + ((Object) sb) + "]}";
        C22306c c22306cScheduled = this.f72126Q.scheduled("update_meet_read_status", 0, new v9j() { // from class: l.vo9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34639b4(str2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.gp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4753s.m34616N3(readList, (Envelope) obj);
            }
        };
        c22306cScheduled.subscribe(new e30() { // from class: l.rp9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4753s.m34636a4(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final C22306c<MyMeetEntryV3> m34704P4() {
        C22306c<MyMeetEntryV3> c22306cAsObservable = this.meetEntranceV4Bs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final C22306c<VisitorCounter> m34705Q4() {
        C22306c<VisitorCounter> c22306cAsObservable = this.newVisitorsCounterBs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m34706R4(@NotNull String userId) {
        userId.getClass();
        this.paidToInterceptUserIdBs.m132487l(userId);
    }

    /* JADX INFO: renamed from: S4 */
    public final void m34707S4() {
        this.showGuideToSwipeCardLastTime.put(Long.valueOf(mqi0.m155944o()));
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: T4 */
    public final C22306c<roj0> m34708T4(long lastVisitorTab2Time) {
        final StringBuilder sb = new StringBuilder();
        if (lastVisitorTab2Time > 0) {
            sb.append("?lastVisitorTab2Time=");
            sb.append(lastVisitorTab2Time);
        }
        C22306c<roj0> c22306cDoOnError = this.f72126Q.scheduled("meet_entry_v4", 0, new v9j() { // from class: l.cq9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34678v3(sb, this);
            }
        }).doOnError(new e30() { // from class: l.hq9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4753s.m34624U3(this.f109047a, (Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m34709Z4() {
        scheduled("live/v3", 0, new v9j() { // from class: l.iq9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34652h3(this.f114435a);
            }
        });
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d4 */
    public final void m34710d4() {
        m34649f4(this, false, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e4 */
    public final void m34711e4(boolean needSuperlikeCount) {
        q860<AbsMeetListData> q860VarM221515e = this.newMeetFeedBehaviorSubject.m221515e();
        m34686z4(this, q860VarM221515e != null ? q860VarM221515e.f153136b : null, false, false, needSuperlikeCount, 6, null);
    }

    /* JADX INFO: renamed from: f5 */
    public final void m34712f5() {
        this.f72126Q.scheduled("meet_o_diamond_list_feeds", 0, new v9j() { // from class: l.pp9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34682x3(this.f150633a);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m34713g4() {
        long jM155944o = mqi0.m155944o();
        Long l2 = this.showGuideToSwipeCardLastTime.get();
        l2.getClass();
        return jM155944o - l2.longValue() > 7200000;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m34714h4() {
        Long l2 = this.meetEntranceAcceleratePairClickedMils.get();
        l2.getClass();
        return !mqi0.m155929D(l2.longValue());
    }

    /* JADX INFO: renamed from: i4 */
    public final boolean m34715i4() {
        Long l2 = this.meetNearbyTabLastTime.get();
        l2.getClass();
        return !mqi0.m155929D(l2.longValue());
    }

    /* JADX INFO: renamed from: j4 */
    public final boolean m34716j4() {
        Long l2 = this.meetVisitorsTabLastTime.get();
        l2.getClass();
        return (mqi0.m155929D(l2.longValue()) || CoreModule.m29935P().m94651a().mo158345a2()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m34717k4(@NotNull String userId) {
        userId.getClass();
        return TextUtils.equals(userId, this.paidToInterceptUserIdBs.m221515e());
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m34718l4(@NotNull String uid) {
        uid.getClass();
        return this.meetUsersCustomTagUidSet.contains(uid);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m34719m4() {
        this.meetLiveUserBs.m132487l(null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: m5 */
    public final C22306c<roj0> m34720m5(long lastSeeReadTime, @Nullable String sinceSortId, long lastVisitorTab2Time) {
        final StringBuilder sb = new StringBuilder();
        sb.append("?lastSeeTime=");
        sb.append(lastSeeReadTime);
        if (lastVisitorTab2Time > 0) {
            sb.append("&lastVisitorTab2Time=");
            sb.append(lastVisitorTab2Time);
        }
        if (!TextUtils.isEmpty(sinceSortId)) {
            sb.append("&sinceSortId=");
            sb.append(sinceSortId);
        }
        C22306c<roj0> c22306cDoOnError = this.f72126Q.scheduled("new_meet_entry", 0, new v9j() { // from class: l.po9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34660l3(sb, this);
            }
        }).doOnError(new e30() { // from class: l.qo9
            @Override // p149l.e30
            public final void call(Object obj) {
                C4753s.m34685z3(this.f155544a, (Throwable) obj);
            }
        });
        c22306cDoOnError.getClass();
        return c22306cDoOnError;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m34721n4() {
        this.paidToInterceptUserIdBs.m132487l("");
    }

    /* JADX INFO: renamed from: o4 */
    public final void m34722o4() {
        this.meetVisitorsTabLastTime.put(0L);
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final String m34723p4() {
        String str = this.firstSortId.get();
        str.getClass();
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: q4 */
    public final MyMeetLiveItem m34724q4(@NotNull String userId) {
        userId.getClass();
        return this.liveUserMap.get(userId);
    }

    @NotNull
    /* JADX INFO: renamed from: r4 */
    public final C22306c<String> m34725r4() {
        C22306c<String> c22306cAsObservable = this.newMeetFeedLikersDataSectChangePs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: s4 */
    public final C22306c<List<MeetLiveItemData>> m34726s4() {
        C22306c<List<MeetLiveItemData>> c22306cAsObservable = this.meetLiveUserBs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: s5 */
    public final C22306c<VisitorCounter> m34727s5() {
        C22306c<VisitorCounter> c22306cScheduled = scheduled("new_visitor_counter", 0, new v9j() { // from class: l.ko9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34662m3(this.f123972a);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: t4 */
    public final List<MeetLiveItemData> m34728t4() {
        return this.meetLiveUserBs.m221515e();
    }

    /* JADX INFO: renamed from: u4 */
    public final long m34729u4() {
        Long l2 = this.meetVisitorsTabLastTime.get();
        l2.getClass();
        return l2.longValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final int m34730v4() {
        MyMeetEntryFeed myMeetEntryFeed;
        MyMeetEntryV3 myMeetEntryV3M221515e = this.newMeetEntrySubject.m221515e();
        if (myMeetEntryV3M221515e == null || (myMeetEntryFeed = myMeetEntryV3M221515e.feed) == null) {
            return 0;
        }
        return myMeetEntryFeed.newCount;
    }

    @Nullable
    /* JADX INFO: renamed from: w4 */
    public final MyMeetSeeReminder m34731w4() {
        MyMeetEntryV3 myMeetEntryV3M221515e = this.newMeetEntrySubject.m221515e();
        if (myMeetEntryV3M221515e != null) {
            return myMeetEntryV3M221515e.seeReminder;
        }
        return null;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: x4 */
    public final void m34732x4(@Nullable DbLinks dbLinks, boolean z, boolean z2) {
        m34686z4(this, dbLinks, z, z2, false, 8, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: y4 */
    public final void m34733y4(@Nullable final DbLinks dbLinks, final boolean fetchNew, boolean haveRead, boolean needSuperlikeCount) {
        Links links;
        Long l2 = CoreModule.f17545c.f19687u0.f19254k0.get();
        final StringBuilder sb = new StringBuilder();
        if (((dbLinks == null || (links = dbLinks.links) == null) ? null : links.next) != null) {
            sb.append("?lastSeeTime=" + l2 + "&");
            sb.append(dbLinks.links.next);
        } else {
            sb.append("?lastSeeTime=" + l2);
        }
        if (haveRead) {
            sb.append("&haveRead=true");
        }
        if (needSuperlikeCount) {
            sb.append("&with=superLikeCount");
        }
        if (fetchNew) {
            sb.append("&fetchNew=true");
            sb.append("&sinceSortId=" + m34723p4());
        }
        scheduled("mymeet-feeds", 0, new v9j() { // from class: l.oo9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34648f3(sb, this, dbLinks, fetchNew);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: y5 */
    public final C22306c<SvipWeeklyReport> m34734y5() {
        C22306c<SvipWeeklyReport> c22306cScheduled = scheduled("refresh_svip_weekly_report", 0, new v9j() { // from class: l.no9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4753s.m34680w3(this.f139823a);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }
}
