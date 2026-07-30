package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4904s;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedImageItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.FeedType;
import com.p051p1.mobile.putong.core.data.LiveType;
import com.p051p1.mobile.putong.core.data.MyMeetEntryFeed;
import com.p051p1.mobile.putong.core.data.MyMeetEntryV3;
import com.p051p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p051p1.mobile.putong.core.data.MyMeetListV3;
import com.p051p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p051p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p051p1.mobile.putong.core.data.ODiamondListFeed;
import com.p051p1.mobile.putong.core.data.SvipWeeklyReport;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.byd0;
import p153l.dy6;
import p153l.fg00;
import p153l.fo0;
import p153l.jyb;
import p153l.p7f;
import p153l.pcj;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.uxj0;
import p153l.vg60;
import p153l.wyd0;
import p153l.x1d0;
import p153l.y20;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009f\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010\"\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b%\u0010&J9\u0010+\u001a\u00020\u00172\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0017¢\u0006\u0004\b-\u0010\u001eJ\u0017\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u0010¢\u0006\u0004\b5\u0010\u0012J\u0015\u00106\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103¢\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0017¢\u0006\u0004\b;\u0010\u001eJ\u0015\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010<¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0<0\u0010¢\u0006\u0004\b?\u0010\u0012J\u001b\u0010@\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t0<¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ3\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00102\u0006\u0010F\u001a\u00020E2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\bJ\u0010KJ%\u0010M\u001a\u00020\u00172\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00140\bj\b\u0012\u0004\u0012\u00020\u0014`\n¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0017¢\u0006\u0004\bR\u0010\u001eJ\r\u0010S\u001a\u00020E¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u0017¢\u0006\u0004\bU\u0010\u001eJ\r\u0010V\u001a\u00020\u001a¢\u0006\u0004\bV\u0010\u001cJ\r\u0010W\u001a\u00020\u0017¢\u0006\u0004\bW\u0010\u001eJ\u0015\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u0010¢\u0006\u0004\bY\u0010\u0012J\u0015\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u0010¢\u0006\u0004\bZ\u0010\u0012J\u0015\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u0010¢\u0006\u0004\b\\\u0010\u0012J\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020I0\u00102\b\b\u0002\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0017¢\u0006\u0004\b_\u0010\u001eJ\r\u0010`\u001a\u00020\u001a¢\u0006\u0004\b`\u0010\u001cJ\r\u0010a\u001a\u00020\u001a¢\u0006\u0004\ba\u0010\u001cJ\r\u0010b\u001a\u00020\u0017¢\u0006\u0004\bb\u0010\u001eJ\u0015\u0010c\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\bc\u0010#J\u0015\u0010d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\bd\u0010\u0019J\u0013\u0010e\u001a\b\u0012\u0004\u0012\u00020I0\u0010¢\u0006\u0004\be\u0010\u0012J\r\u0010f\u001a\u00020\u0017¢\u0006\u0004\bf\u0010\u001eR \u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0<0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iRP\u0010m\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204 k*\n\u0012\u0004\u0012\u000204\u0018\u00010303 k*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204 k*\n\u0012\u0004\u0012\u000204\u0018\u00010303\u0018\u00010g0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010iR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00140g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010iR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020[0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010iR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010xR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00140|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R#\u0010\u0082\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u0001030g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010iR<\u0010\u0084\u0001\u001a&\u0012\f\u0012\n k*\u0004\u0018\u00010\r0\r k*\u0012\u0012\f\u0012\n k*\u0004\u0018\u00010\r0\r\u0018\u00010g0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010iR<\u0010\u0086\u0001\u001a&\u0012\f\u0012\n k*\u0004\u0018\u00010X0X k*\u0012\u0012\f\u0012\n k*\u0004\u0018\u00010X0X\u0018\u00010|0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010~R\u001c\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020[0g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010iR\u001c\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020I0g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010iR\u0016\u0010\u008c\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010xR\u0016\u0010\u008e\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010xR)\u0010\u0093\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00140\u008f\u0001j\t\u0012\u0004\u0012\u00020\u0014`\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0095\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010xR!\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020I0|8\u0006¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010~\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R$\u0010\u009d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020.0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006 \u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/api/s;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/data/Envelope;", Envelope.TYPE, "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/businessdata/meet/AbsMeetListData;", "Lkotlin/collections/ArrayList;", "I4", "(Lcom/p1/mobile/putong/data/Envelope;)Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/data/VisitorCounter;", "N4", "()Lcom/p1/mobile/putong/data/VisitorCounter;", "Lrx/c;", "Q4", "()Lrx/c;", "s5", "", "r4", Oauth2AccessToken.KEY_UID, "", "H5", "(Ljava/lang/String;)V", "", "g4", "()Z", "S4", "()V", "n4", "userId", "R4", "k4", "(Ljava/lang/String;)Z", "needSuperlikeCount", "e4", "(Z)V", "Lcom/p1/mobile/putong/data/DbLinks;", "dbLinks", "fetchNew", "haveRead", "y4", "(Lcom/p1/mobile/putong/data/DbLinks;ZZZ)V", "Z4", "Lcom/p1/mobile/putong/core/data/MyMeetLiveItem;", "q4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/MyMeetLiveItem;", "p4", "()Ljava/lang/String;", "", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetLiveItemData;", "s4", "t4", "()Ljava/util/List;", "list", "K5", "(Ljava/util/List;)V", "m4", "Ll/vg60;", "L4", "()Ll/vg60;", "K4", "N5", "(Ll/vg60;)V", "", "v4", "()I", "", "lastSeeReadTime", "sinceSortId", "lastVisitorTab2Time", "Ll/uxj0;", "m5", "(JLjava/lang/String;J)Lrx/c;", "readList", "O5", "(Ljava/util/ArrayList;)V", "Lcom/p1/mobile/putong/core/data/MyMeetSeeReminder;", "w4", "()Lcom/p1/mobile/putong/core/data/MyMeetSeeReminder;", "f5", "u4", "()J", "M5", "j4", "o4", "Lcom/p1/mobile/putong/core/data/SvipWeeklyReport;", "y5", "I5", "Lcom/p1/mobile/putong/core/data/MyMeetEntryV3;", "P4", "T4", "(J)Lrx/c;", "L5", "i4", "h4", "J5", "l4", "F5", "O4", "G5", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "newMeetFeedBehaviorSubject", "kotlin.jvm.PlatformType", p7f.LATITUDE_SOUTH, "meetLiveUserBs", p7f.GPS_DIRECTION_TRUE, "paidToInterceptUserIdBs", "U", "newMeetEntrySubject", "Ll/wyd0;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/wyd0;", "firstSortId", "Ll/byd0;", "W", "Ll/byd0;", "showGuideToSwipeCardLastTime", "X", "meetVisitorsTabLastTime", "Lrx/subjects/b;", "Y", "Lrx/subjects/b;", "newMeetFeedLikersDataSectChangePs", "Lcom/p1/mobile/putong/core/data/ODiamondListFeed;", "Z", "oDiamondListFeedObs", "a0", "newVisitorsCounterBs", "b0", "svipWeeklyReportBs", "c0", "meetEntranceV4Bs", "d0", "meetEntranceRefreshBs", "e0", "meetNearbyTabLastTime", "f0", "meetEntranceAcceleratePairClickedMils", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "g0", "Ljava/util/HashSet;", "meetUsersCustomTagUidSet", "h0", "meet2SeeLikersOnLineTime", "i0", "M4", "()Lrx/subjects/b;", "newMeetLikersItemViewNotificationBs", "", "j0", "Ljava/util/Map;", "liveUserMap", "Companion", "a", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C4904s extends dy6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final String f20839k0 = "text";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final C22507a<vg60<AbsMeetListData>> newMeetFeedBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final C22507a<List<MeetLiveItemData>> meetLiveUserBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final C22507a<String> paidToInterceptUserIdBs;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final C22507a<MyMeetEntryV3> newMeetEntrySubject;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public final wyd0 firstSortId;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public final byd0 showGuideToSwipeCardLastTime;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public final byd0 meetVisitorsTabLastTime;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public final C22508b<String> newMeetFeedLikersDataSectChangePs;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public final C22507a<List<ODiamondListFeed>> oDiamondListFeedObs;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public C22507a<VisitorCounter> newVisitorsCounterBs;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public C22508b<SvipWeeklyReport> svipWeeklyReportBs;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    public final C22507a<MyMeetEntryV3> meetEntranceV4Bs;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    public final C22507a<uxj0> meetEntranceRefreshBs;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @NotNull
    public final byd0 meetNearbyTabLastTime;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    public final byd0 meetEntranceAcceleratePairClickedMils;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> meetUsersCustomTagUidSet;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    @NotNull
    public final byd0 meet2SeeLikersOnLineTime;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    public final C22508b<uxj0> newMeetLikersItemViewNotificationBs;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final Map<String, MyMeetLiveItem> liveUserMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.s$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/core/api/s$a;", "", "<init>", "()V", "", "MOMENT_TEXT_TYPE", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m35738a() {
            return C4904s.f20839k0;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4904s(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        C22507a<vg60<AbsMeetListData>> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.newMeetFeedBehaviorSubject = c22507aM222758b;
        this.meetLiveUserBs = C22507a.m222758b();
        C22507a<String> c22507aM222759c = C22507a.m222759c("");
        c22507aM222759c.getClass();
        this.paidToInterceptUserIdBs = c22507aM222759c;
        C22507a<MyMeetEntryV3> c22507aM222758b2 = C22507a.m222758b();
        c22507aM222758b2.getClass();
        this.newMeetEntrySubject = c22507aM222758b2;
        this.firstSortId = new wyd0("firstSortId_" + CoreModule.m30929H().userId(), "");
        this.showGuideToSwipeCardLastTime = new byd0("jump_guide_to_swipe_card_last_time_" + CoreModule.m30929H().userId(), 0L);
        this.meetVisitorsTabLastTime = new byd0("meet_visitors_tab_last_time_mills_" + CoreModule.m30929H().userId(), 0L);
        C22508b<String> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        this.newMeetFeedLikersDataSectChangePs = c22508bM222767b;
        C22507a<List<ODiamondListFeed>> c22507aM222758b3 = C22507a.m222758b();
        c22507aM222758b3.getClass();
        this.oDiamondListFeedObs = c22507aM222758b3;
        this.newVisitorsCounterBs = C22507a.m222758b();
        this.svipWeeklyReportBs = C22508b.m222767b();
        C22507a<MyMeetEntryV3> c22507aM222758b4 = C22507a.m222758b();
        c22507aM222758b4.getClass();
        this.meetEntranceV4Bs = c22507aM222758b4;
        C22507a<uxj0> c22507aM222759c2 = C22507a.m222759c(uxj0.f181467a);
        c22507aM222759c2.getClass();
        this.meetEntranceRefreshBs = c22507aM222759c2;
        this.meetNearbyTabLastTime = new byd0("meet_nearby_tab_last_time_mills_" + CoreModule.m30929H().userId(), 0L);
        this.meetEntranceAcceleratePairClickedMils = new byd0("meet_entrance_accelerate_pair_clicked_mills_" + CoreModule.m30929H().userId(), 0L);
        this.meetUsersCustomTagUidSet = new HashSet<>();
        this.meet2SeeLikersOnLineTime = new byd0("meet_2_see_likers_online_time_" + CoreModule.m30929H().userId(), 0L);
        C22508b<uxj0> c22508bM222767b2 = C22508b.m222767b();
        c22508bM222767b2.getClass();
        this.newMeetLikersItemViewNotificationBs = c22508bM222767b2;
        this.liveUserMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: A4 */
    public static final x1d0 m35593A4(StringBuilder sb) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32296e1(sb.toString())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: A5 */
    public static final Envelope m35594A5(C4904s c4904s, Envelope envelope) {
        c4904s.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Envelope m35596B4(C4904s c4904s, Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4904s.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: B5 */
    public static final Envelope m35597B5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C4 */
    public static final Envelope m35599C4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C5 */
    public static final SvipWeeklyReport m35600C5(C4904s c4904s, Envelope envelope) {
        envelope.getClass();
        SvipWeeklyReport svipWeeklyReport = ((CoreData) envelope.getModuleData(CoreData.class)).svipWeeklyReport;
        c4904s.svipWeeklyReportBs.m137019l(svipWeeklyReport);
        return svipWeeklyReport;
    }

    /* JADX INFO: renamed from: D4 */
    public static final uxj0 m35602D4(C4904s c4904s, DbLinks dbLinks, boolean z, Envelope envelope) {
        List<AbsMeetListData> list;
        Links linksNew_;
        DbLinks dbLinks2;
        vg60<AbsMeetListData> vg60VarM222761e;
        List<AbsMeetListData> list2;
        ArrayList arrayList = new ArrayList();
        if (dbLinks == null) {
            envelope.getClass();
            arrayList.addAll(c4904s.m35694I4(envelope));
            if (z && (vg60VarM222761e = c4904s.newMeetFeedBehaviorSubject.m222761e()) != null && (list2 = vg60VarM222761e.f184001a) != null) {
                arrayList.addAll(list2);
            }
        } else {
            vg60<AbsMeetListData> vg60VarM222761e2 = c4904s.newMeetFeedBehaviorSubject.m222761e();
            if (vg60VarM222761e2 != null && (list = vg60VarM222761e2.f184001a) != null) {
                arrayList.addAll(list);
            }
            envelope.getClass();
            final ArrayList<AbsMeetListData> arrayListM35694I4 = c4904s.m35694I4(envelope);
            jyb.m147503d0(arrayList, new qcj() { // from class: l.hr9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C4904s.m35605E4(arrayListM35694I4, (AbsMeetListData) obj);
                }
            });
            arrayList.addAll(arrayListM35694I4);
        }
        if (!jyb.m147479J(arrayList)) {
            c4904s.firstSortId.put(((AbsMeetListData) arrayList.get(0)).item.sortId);
        }
        DbLinks dbLinks3 = new DbLinks();
        if (z) {
            vg60<AbsMeetListData> vg60VarM222761e3 = c4904s.newMeetFeedBehaviorSubject.m222761e();
            dbLinks3.total = vg60VarM222761e3 != null ? vg60VarM222761e3.m201222d() : 0;
            vg60<AbsMeetListData> vg60VarM222761e4 = c4904s.newMeetFeedBehaviorSubject.m222761e();
            if (vg60VarM222761e4 == null || (dbLinks2 = vg60VarM222761e4.f184002b) == null || (linksNew_ = dbLinks2.links) == null) {
                linksNew_ = Links.new_();
            }
            dbLinks3.links = linksNew_;
        } else {
            Pagination pagination = envelope.pagination;
            dbLinks3.total = pagination.total;
            dbLinks3.links = pagination.links;
        }
        c4904s.newMeetFeedBehaviorSubject.m137019l(new vg60<>(arrayList, dbLinks3));
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: D5 */
    public static final SvipWeeklyReport m35603D5(Function1 function1, Object obj) {
        return (SvipWeeklyReport) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E4 */
    public static final Boolean m35605E4(ArrayList arrayList, final IMeetListData iMeetListData) {
        if (iMeetListData instanceof AbsMeetUserItemData) {
            return Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.qr9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C4904s.m35608F4(iMeetListData, (AbsMeetListData) obj);
                }
            }));
        }
        return iMeetListData instanceof MeetFeedSeeItemData ? Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.rr9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35610G4((AbsMeetListData) obj);
            }
        })) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: E5 */
    public static final void m35606E5(C4904s c4904s, Throwable th) {
        c4904s.svipWeeklyReportBs.m137019l(null);
    }

    /* JADX INFO: renamed from: F4 */
    public static final Boolean m35608F4(IMeetListData iMeetListData, AbsMeetListData absMeetListData) {
        return absMeetListData instanceof AbsMeetUserItemData ? Boolean.valueOf(Intrinsics.m88377d(((AbsMeetUserItemData) absMeetListData).item.f21195id, ((AbsMeetUserItemData) iMeetListData).item.f21195id)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Boolean m35610G4(AbsMeetListData absMeetListData) {
        return Boolean.valueOf(absMeetListData instanceof MeetFeedSeeItemData);
    }

    /* JADX INFO: renamed from: H4 */
    public static final uxj0 m35612H4(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Boolean m35615J4(MyMeetFeedItem myMeetFeedItem, Object obj) {
        obj.getClass();
        return Boolean.valueOf(Intrinsics.m88377d(((CoreMomentInfo) obj).f56856id, myMeetFeedItem.momentId));
    }

    /* JADX INFO: renamed from: N3 */
    public static Unit m35619N3(ArrayList arrayList, Envelope envelope) {
        arrayList.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P5 */
    public static final x1d0 m35622P5(String str) {
        return C4879a.f20236P.auth().m209038l(z1d0.create(Network.JSON, str)).m209043q(C4879a.m32300f1()).m209028b();
    }

    /* JADX INFO: renamed from: U3 */
    public static void m35627U3(C4904s c4904s, Throwable th) {
        C22507a<MyMeetEntryV3> c22507a = c4904s.meetEntranceV4Bs;
        c22507a.m137019l(c22507a.m222761e());
    }

    /* JADX INFO: renamed from: U4 */
    public static final x1d0 m35628U4(StringBuilder sb) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32220K0(sb.toString())).m209028b();
    }

    /* JADX INFO: renamed from: V4 */
    public static final Envelope m35630V4(C4904s c4904s, Envelope envelope) {
        envelope.getClass();
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4904s.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Envelope m35632W4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X4 */
    public static final uxj0 m35634X4(C4904s c4904s, Envelope envelope) {
        c4904s.meetEntranceV4Bs.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).myMeetEntryV3);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final uxj0 m35636Y4(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m35639a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a5 */
    public static final x1d0 m35640a5() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32228M0()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: b4 */
    public static C22421c m35642b4(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.cq9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35622P5(str);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static final Envelope m35643b5(C4904s c4904s, Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4904s.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Envelope m35646c5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d5 */
    public static final uxj0 m35648d5(C4904s c4904s, Envelope envelope) {
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
            linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
            for (Object obj : list3) {
                linkedHashMap.put(((User) obj).f56859id, obj);
            }
        }
        c4904s.liveUserMap.clear();
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (coreData != null && (myMeetListV3 = coreData.myMeetListV3) != null && (list = myMeetListV3.liveUsers) != null) {
            for (MyMeetLiveItem myMeetLiveItem : list) {
                if (TEnum.equals(myMeetLiveItem.liveType, "live") || TEnum.equals(myMeetLiveItem.liveType, LiveType.liveVoice)) {
                    c4904s.liveUserMap.put(myMeetLiveItem.userId, myMeetLiveItem);
                    if (linkedHashMap != null && (user = (User) linkedHashMap.get(myMeetLiveItem.userId)) != null) {
                        arrayList.add(new MeetLiveItemData(user, myMeetLiveItem));
                    }
                }
            }
        }
        c4904s.meetLiveUserBs.m137019l(arrayList);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: e5 */
    public static final uxj0 m35650e5(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f3 */
    public static C22421c m35651f3(final StringBuilder sb, final C4904s c4904s, final DbLinks dbLinks, final boolean z) {
        C22421c<Envelope> c22421cM176660g = qi20.m176660g(new pcj() { // from class: l.jq9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35593A4(sb);
            }
        }, false);
        final Function1 function1 = new Function1() { // from class: l.kq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35596B4(this.f128197a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176660g.map(new qcj() { // from class: l.lq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35599C4(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.mq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35602D4(this.f138025a, dbLinks, z, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.nq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35612H4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m35652f4(C4904s c4904s, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c4904s.m35714e4(z);
    }

    /* JADX INFO: renamed from: g5 */
    public static final x1d0 m35654g5() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32232N0(CoreModule.m30929H().userId())).m209028b();
    }

    /* JADX INFO: renamed from: h3 */
    public static C22421c m35655h3(final C4904s c4904s) {
        C22421c<Envelope> c22421cM176660g = qi20.m176660g(new pcj() { // from class: l.br9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35640a5();
            }
        }, true);
        final Function1 function1 = new Function1() { // from class: l.dr9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35643b5(this.f90365a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176660g.map(new qcj() { // from class: l.er9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35646c5(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.fr9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35648d5(this.f100407a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.gr9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35650e5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public static final Envelope m35656h5(C4904s c4904s, Envelope envelope) {
        envelope.getClass();
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4904s.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Envelope m35658i5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m35660j5(C4904s c4904s, Envelope envelope) {
        if (NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).odiamondList)) {
            List<ODiamondListFeed> list = ((CoreData) envelope.getModuleData(CoreData.class)).odiamondList.feeds;
            list.getClass();
            if (!jyb.m147479J(list)) {
                c4904s.oDiamondListFeedObs.m137019l(list);
            }
        } else {
            C22507a<List<ODiamondListFeed>> c22507a = c4904s.oDiamondListFeedObs;
            c22507a.m137019l(c22507a.m222761e());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m35662k5(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l3 */
    public static C22421c m35663l3(final StringBuilder sb, final C4904s c4904s) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.dq9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35667n5(sb);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.eq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35669o5(this.f95316a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176658e.map(new qcj() { // from class: l.fq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35671p5(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.hq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35673q5(this.f111100a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.iq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35675r5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m35664l5(C4904s c4904s, Throwable th) {
        C22507a<List<ODiamondListFeed>> c22507a = c4904s.oDiamondListFeedObs;
        c22507a.m137019l(c22507a.m222761e());
    }

    /* JADX INFO: renamed from: m3 */
    public static C22421c m35665m3(final C4904s c4904s) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.ur9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35678t5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.vr9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35680u5(this.f185438a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176658e.map(new qcj() { // from class: l.wr9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35682v5(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.wp9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35684w5(this.f190266a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.xp9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35686x5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public static final x1d0 m35667n5(StringBuilder sb) {
        return C4879a.f20236P.auth().m209043q(C4879a.m32292d1(sb.toString())).m209028b();
    }

    /* JADX INFO: renamed from: o5 */
    public static final Envelope m35669o5(C4904s c4904s, Envelope envelope) {
        envelope.getClass();
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            c4904s.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: p5 */
    public static final Envelope m35671p5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    public static final uxj0 m35673q5(C4904s c4904s, Envelope envelope) {
        c4904s.newMeetEntrySubject.m137019l(((CoreData) envelope.getModuleData(CoreData.class)).myMeetEntryV3);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: r5 */
    public static final uxj0 m35675r5(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t5 */
    public static final x1d0 m35678t5() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32226L2(CoreModule.m30929H().userId())).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: u5 */
    public static final Envelope m35680u5(C4904s c4904s, Envelope envelope) {
        c4904s.f91137Q.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: v3 */
    public static C22421c m35681v3(final StringBuilder sb, final C4904s c4904s) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.oq9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35628U4(sb);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.pq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35630V4(this.f153652a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176658e.map(new qcj() { // from class: l.qq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35632W4(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.sq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35634X4(this.f170153a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.tq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35636Y4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: v5 */
    public static final Envelope m35682v5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w3 */
    public static C22421c m35683w3(final C4904s c4904s) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.uq9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35690z5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.vq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35594A5(this.f185338a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176658e.map(new qcj() { // from class: l.wq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35597B5(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.xq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35600C5(this.f195789a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.yq9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35603D5(function2, obj);
            }
        }).doOnError(new y20() { // from class: l.zq9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4904s.m35606E5(this.f205575a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public static final VisitorCounter m35684w5(C4904s c4904s, Envelope envelope) {
        envelope.getClass();
        VisitorCounter visitorCounter = ((CommonData) envelope.getModuleData(CommonData.class)).visitorCounter;
        visitorCounter.getClass();
        c4904s.newVisitorsCounterBs.m137019l(visitorCounter);
        return visitorCounter;
    }

    /* JADX INFO: renamed from: x3 */
    public static C22421c m35685x3(final C4904s c4904s) {
        C22421c<Envelope> c22421cM176658e = qi20.m176658e(new pcj() { // from class: l.ir9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35654g5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.jr9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35656h5(this.f122319a, (Envelope) obj);
            }
        };
        C22421c c22421cObserveOn = c22421cM176658e.map(new qcj() { // from class: l.kr9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35658i5(function1, obj);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.lr9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35660j5(this.f133303a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.mr9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4904s.m35662k5(function2, obj);
            }
        }).doOnError(new y20() { // from class: l.or9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4904s.m35664l5(this.f148680a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public static final VisitorCounter m35686x5(Function1 function1, Object obj) {
        return (VisitorCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static void m35688z3(C4904s c4904s, Throwable th) {
        C22507a<MyMeetEntryV3> c22507a = c4904s.newMeetEntrySubject;
        c22507a.m137019l(c22507a.m222761e());
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m35689z4(C4904s c4904s, DbLinks dbLinks, boolean z, boolean z2, boolean z3, int i, Object obj) {
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
        c4904s.m35736y4(dbLinks, z, z2, z3);
    }

    /* JADX INFO: renamed from: z5 */
    public static final x1d0 m35690z5() {
        return C4879a.f20236P.auth().m209043q(C4879a.m32369w2("/" + CoreModule.m30929H().userId() + "/svip-weekly-report")).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: F5 */
    public final void m35691F5(@NotNull String uid) {
        uid.getClass();
        this.meetUsersCustomTagUidSet.add(uid);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m35692G5() {
        this.meetEntranceRefreshBs.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: H5 */
    public final void m35693H5(@NotNull String uid) {
        uid.getClass();
        this.newMeetFeedLikersDataSectChangePs.m137019l(uid);
    }

    /* JADX INFO: renamed from: I4 */
    public final ArrayList<AbsMeetListData> m35694I4(Envelope envelope) {
        MyMeetListV3 myMeetListV3;
        List<MyMeetFeedItem> list;
        ValueObject valueObject;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        ArrayList<AbsMeetListData> arrayList = new ArrayList<>();
        fg00 fg00Var = (fg00) CoreModule.m30932N().mo61450Ca(envelope, CoreMomentInfo.JSON_ADAPTER);
        List<User> list2 = commonData.users;
        list2.getClass();
        List<User> list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((User) obj).f56859id, obj);
        }
        MyMeetListV3 myMeetListV4 = coreData.myMeetListV3;
        if (!jyb.m147479J(myMeetListV4 != null ? myMeetListV4.feeds : null) && (myMeetListV3 = coreData.myMeetListV3) != null && (list = myMeetListV3.feeds) != null) {
            for (final MyMeetFeedItem myMeetFeedItem : list) {
                if (Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.relationMoment)) || Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.pickMoment))) {
                    int iM147476G = jyb.m147476G(fg00Var, new qcj() { // from class: l.pr9
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return C4904s.m35615J4(myMeetFeedItem, obj2);
                        }
                    });
                    if (iM147476G != -1 && fg00Var != null && (valueObject = fg00Var.get(iM147476G)) != null && (valueObject instanceof CoreMomentInfo)) {
                        if (TextUtils.equals(myMeetFeedItem.momentMediaType, f20839k0)) {
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
                                arrayList.add(new MeetFeedVideoItemData(coreMomentInfo2, (User) linkedHashMap.get(str), fg00Var.m125473c().get(iM147476G), myMeetFeedItem));
                            } else {
                                arrayList.add(new MeetFeedImageItemData(coreMomentInfo2, (User) linkedHashMap.get(str), fg00Var.m125473c().get(iM147476G), myMeetFeedItem));
                            }
                        }
                    }
                } else if (Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.lowSeeUsers))) {
                    arrayList.add(new MeetFeedSeeItemData(myMeetFeedItem));
                } else if (Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.pickUser)) || Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.highSeeUser)) || Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get("likedUser")) || Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.seePortraitUser)) || Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.lowSeeUser)) || Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.momentLikeUser)) || Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.momentBeLikeUser))) {
                    if (Intrinsics.m88377d(myMeetFeedItem.type, FeedType.get(FeedType.seePortraitUser))) {
                        this.f91137Q.f20429u0.m31446i5(myMeetFeedItem.userIds.get(0));
                    }
                    arrayList.add(new MeetFeedUserItemData((User) linkedHashMap.get(myMeetFeedItem.userIds.get(0)), myMeetFeedItem));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: I5 */
    public final C22421c<SvipWeeklyReport> m35695I5() {
        C22421c<SvipWeeklyReport> c22421cAsObservable = this.svipWeeklyReportBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: J5 */
    public final void m35696J5() {
        this.meetEntranceAcceleratePairClickedMils.put(Long.valueOf(pzi0.m174454o()));
    }

    @NotNull
    /* JADX INFO: renamed from: K4 */
    public final C22421c<vg60<AbsMeetListData>> m35697K4() {
        C22421c<vg60<AbsMeetListData>> c22421cAsObservable = this.newMeetFeedBehaviorSubject.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: K5 */
    public final void m35698K5(@NotNull List<? extends MeetLiveItemData> list) {
        list.getClass();
        this.meetLiveUserBs.m137019l(list);
    }

    @Nullable
    /* JADX INFO: renamed from: L4 */
    public final vg60<AbsMeetListData> m35699L4() {
        return this.newMeetFeedBehaviorSubject.m222761e();
    }

    /* JADX INFO: renamed from: L5 */
    public final void m35700L5() {
        this.meetNearbyTabLastTime.put(Long.valueOf(pzi0.m174454o()));
    }

    @NotNull
    /* JADX INFO: renamed from: M4 */
    public final C22508b<uxj0> m35701M4() {
        return this.newMeetLikersItemViewNotificationBs;
    }

    /* JADX INFO: renamed from: M5 */
    public final void m35702M5() {
        this.meetVisitorsTabLastTime.put(Long.valueOf(pzi0.m174454o()));
    }

    @Nullable
    /* JADX INFO: renamed from: N4 */
    public final VisitorCounter m35703N4() {
        if (this.newVisitorsCounterBs.m222765i()) {
            return this.newVisitorsCounterBs.m222761e();
        }
        return null;
    }

    /* JADX INFO: renamed from: N5 */
    public final void m35704N5(@NotNull vg60<AbsMeetListData> list) {
        list.getClass();
        this.newMeetFeedBehaviorSubject.m137019l(list);
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final C22421c<uxj0> m35705O4() {
        C22421c<uxj0> c22421cAsObservable = this.meetEntranceRefreshBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: O5 */
    public final void m35706O5(@NotNull final ArrayList<String> readList) {
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
        C22421c c22421cScheduled = this.f91137Q.scheduled("update_meet_read_status", 0, new pcj() { // from class: l.gq9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35642b4(str2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.rq9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4904s.m35619N3(readList, (Envelope) obj);
            }
        };
        c22421cScheduled.subscribe(new y20() { // from class: l.cr9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4904s.m35639a4(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final C22421c<MyMeetEntryV3> m35707P4() {
        C22421c<MyMeetEntryV3> c22421cAsObservable = this.meetEntranceV4Bs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final C22421c<VisitorCounter> m35708Q4() {
        C22421c<VisitorCounter> c22421cAsObservable = this.newVisitorsCounterBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m35709R4(@NotNull String userId) {
        userId.getClass();
        this.paidToInterceptUserIdBs.m137019l(userId);
    }

    /* JADX INFO: renamed from: S4 */
    public final void m35710S4() {
        this.showGuideToSwipeCardLastTime.put(Long.valueOf(pzi0.m174454o()));
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: T4 */
    public final C22421c<uxj0> m35711T4(long lastVisitorTab2Time) {
        final StringBuilder sb = new StringBuilder();
        if (lastVisitorTab2Time > 0) {
            sb.append("?lastVisitorTab2Time=");
            sb.append(lastVisitorTab2Time);
        }
        C22421c<uxj0> c22421cDoOnError = this.f91137Q.scheduled("meet_entry_v4", 0, new pcj() { // from class: l.nr9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35681v3(sb, this);
            }
        }).doOnError(new y20() { // from class: l.sr9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4904s.m35627U3(this.f170312a, (Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m35712Z4() {
        scheduled("live/v3", 0, new pcj() { // from class: l.tr9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35655h3(this.f175813a);
            }
        });
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d4 */
    public final void m35713d4() {
        m35652f4(this, false, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e4 */
    public final void m35714e4(boolean needSuperlikeCount) {
        vg60<AbsMeetListData> vg60VarM222761e = this.newMeetFeedBehaviorSubject.m222761e();
        m35689z4(this, vg60VarM222761e != null ? vg60VarM222761e.f184002b : null, false, false, needSuperlikeCount, 6, null);
    }

    /* JADX INFO: renamed from: f5 */
    public final void m35715f5() {
        this.f91137Q.scheduled("meet_o_diamond_list_feeds", 0, new pcj() { // from class: l.ar9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35685x3(this.f72920a);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m35716g4() {
        long jM174454o = pzi0.m174454o();
        Long l2 = this.showGuideToSwipeCardLastTime.get();
        l2.getClass();
        return jM174454o - l2.longValue() > 7200000;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m35717h4() {
        Long l2 = this.meetEntranceAcceleratePairClickedMils.get();
        l2.getClass();
        return !pzi0.m174439D(l2.longValue());
    }

    /* JADX INFO: renamed from: i4 */
    public final boolean m35718i4() {
        Long l2 = this.meetNearbyTabLastTime.get();
        l2.getClass();
        return !pzi0.m174439D(l2.longValue());
    }

    /* JADX INFO: renamed from: j4 */
    public final boolean m35719j4() {
        Long l2 = this.meetVisitorsTabLastTime.get();
        l2.getClass();
        return (pzi0.m174439D(l2.longValue()) || CoreModule.m30933P().m143405a().mo180437a2()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m35720k4(@NotNull String userId) {
        userId.getClass();
        return TextUtils.equals(userId, this.paidToInterceptUserIdBs.m222761e());
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m35721l4(@NotNull String uid) {
        uid.getClass();
        return this.meetUsersCustomTagUidSet.contains(uid);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m35722m4() {
        this.meetLiveUserBs.m137019l(null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: m5 */
    public final C22421c<uxj0> m35723m5(long lastSeeReadTime, @Nullable String sinceSortId, long lastVisitorTab2Time) {
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
        C22421c<uxj0> c22421cDoOnError = this.f91137Q.scheduled("new_meet_entry", 0, new pcj() { // from class: l.aq9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35663l3(sb, this);
            }
        }).doOnError(new y20() { // from class: l.bq9
            @Override // p153l.y20
            public final void call(Object obj) {
                C4904s.m35688z3(this.f77866a, (Throwable) obj);
            }
        });
        c22421cDoOnError.getClass();
        return c22421cDoOnError;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m35724n4() {
        this.paidToInterceptUserIdBs.m137019l("");
    }

    /* JADX INFO: renamed from: o4 */
    public final void m35725o4() {
        this.meetVisitorsTabLastTime.put(0L);
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final String m35726p4() {
        String str = this.firstSortId.get();
        str.getClass();
        return str;
    }

    @Nullable
    /* JADX INFO: renamed from: q4 */
    public final MyMeetLiveItem m35727q4(@NotNull String userId) {
        userId.getClass();
        return this.liveUserMap.get(userId);
    }

    @NotNull
    /* JADX INFO: renamed from: r4 */
    public final C22421c<String> m35728r4() {
        C22421c<String> c22421cAsObservable = this.newMeetFeedLikersDataSectChangePs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: s4 */
    public final C22421c<List<MeetLiveItemData>> m35729s4() {
        C22421c<List<MeetLiveItemData>> c22421cAsObservable = this.meetLiveUserBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: s5 */
    public final C22421c<VisitorCounter> m35730s5() {
        C22421c<VisitorCounter> c22421cScheduled = scheduled("new_visitor_counter", 0, new pcj() { // from class: l.vp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35665m3(this.f185222a);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: t4 */
    public final List<MeetLiveItemData> m35731t4() {
        return this.meetLiveUserBs.m222761e();
    }

    /* JADX INFO: renamed from: u4 */
    public final long m35732u4() {
        Long l2 = this.meetVisitorsTabLastTime.get();
        l2.getClass();
        return l2.longValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final int m35733v4() {
        MyMeetEntryFeed myMeetEntryFeed;
        MyMeetEntryV3 myMeetEntryV3M222761e = this.newMeetEntrySubject.m222761e();
        if (myMeetEntryV3M222761e == null || (myMeetEntryFeed = myMeetEntryV3M222761e.feed) == null) {
            return 0;
        }
        return myMeetEntryFeed.newCount;
    }

    @Nullable
    /* JADX INFO: renamed from: w4 */
    public final MyMeetSeeReminder m35734w4() {
        MyMeetEntryV3 myMeetEntryV3M222761e = this.newMeetEntrySubject.m222761e();
        if (myMeetEntryV3M222761e != null) {
            return myMeetEntryV3M222761e.seeReminder;
        }
        return null;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: x4 */
    public final void m35735x4(@Nullable DbLinks dbLinks, boolean z, boolean z2) {
        m35689z4(this, dbLinks, z, z2, false, 8, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: y4 */
    public final void m35736y4(@Nullable final DbLinks dbLinks, final boolean fetchNew, boolean haveRead, boolean needSuperlikeCount) {
        Links links;
        Long l2 = CoreModule.f18264c.f20429u0.f19996l0.get();
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
            sb.append("&sinceSortId=" + m35726p4());
        }
        scheduled("mymeet-feeds", 0, new pcj() { // from class: l.zp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35651f3(sb, this, dbLinks, fetchNew);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: y5 */
    public final C22421c<SvipWeeklyReport> m35737y5() {
        C22421c<SvipWeeklyReport> c22421cScheduled = scheduled("refresh_svip_weekly_report", 0, new pcj() { // from class: l.yp9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4904s.m35683w3(this.f201049a);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }
}
