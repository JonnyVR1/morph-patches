package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0179s;
import com.p000p1.mobile.putong.core.businessdata.meet.AbsMeetListData;
import com.p000p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p000p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p000p1.mobile.putong.core.businessdata.meet.MeetFeedImageItemData;
import com.p000p1.mobile.putong.core.businessdata.meet.MeetFeedSeeItemData;
import com.p000p1.mobile.putong.core.businessdata.meet.MeetFeedUserItemData;
import com.p000p1.mobile.putong.core.businessdata.meet.MeetFeedVideoItemData;
import com.p000p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.FeedType;
import com.p1.mobile.putong.core.data.MyMeetEntryFeed;
import com.p1.mobile.putong.core.data.MyMeetEntryV3;
import com.p1.mobile.putong.core.data.MyMeetFeedItem;
import com.p1.mobile.putong.core.data.MyMeetListV3;
import com.p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p1.mobile.putong.core.data.MyMeetSeeReminder;
import com.p1.mobile.putong.core.data.ODiamondListFeed;
import com.p1.mobile.putong.core.data.SvipWeeklyReport;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.VisitorCounter;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
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
import l.e30;
import l.jo0;
import l.mqi0;
import l.q860;
import l.roj0;
import l.stc0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w700;
import l.w9j;
import l.zpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.ax6;
import p006l.ia20;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.s */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000 \u009e\u00012\u00020\u0001:\u0002\u009f\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0019J\u0015\u0010\"\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b%\u0010&J9\u0010+\u001a\u00020\u00172\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0017¢\u0006\u0004\b-\u0010\u001eJ\u0017\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u0010¢\u0006\u0004\b5\u0010\u0012J\u0015\u00106\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103¢\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0017¢\u0006\u0004\b;\u0010\u001eJ\u0015\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010<¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0<0\u0010¢\u0006\u0004\b?\u0010\u0012J\u001b\u0010@\u001a\u00020\u00172\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t0<¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ3\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00102\u0006\u0010F\u001a\u00020E2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\bJ\u0010KJ%\u0010M\u001a\u00020\u00172\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00140\bj\b\u0012\u0004\u0012\u00020\u0014`\n¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0017¢\u0006\u0004\bR\u0010\u001eJ\r\u0010S\u001a\u00020E¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u0017¢\u0006\u0004\bU\u0010\u001eJ\r\u0010V\u001a\u00020\u001a¢\u0006\u0004\bV\u0010\u001cJ\r\u0010W\u001a\u00020\u0017¢\u0006\u0004\bW\u0010\u001eJ\u0015\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u0010¢\u0006\u0004\bY\u0010\u0012J\u0015\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u0010¢\u0006\u0004\bZ\u0010\u0012J\u0015\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0\u0010¢\u0006\u0004\b\\\u0010\u0012J\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020I0\u00102\b\b\u0002\u0010H\u001a\u00020EH\u0007¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0017¢\u0006\u0004\b_\u0010\u001eJ\r\u0010`\u001a\u00020\u001a¢\u0006\u0004\b`\u0010\u001cJ\r\u0010a\u001a\u00020\u001a¢\u0006\u0004\ba\u0010\u001cJ\r\u0010b\u001a\u00020\u0017¢\u0006\u0004\bb\u0010\u001eJ\u0015\u0010c\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\bc\u0010#J\u0015\u0010d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\bd\u0010\u0019J\u0013\u0010e\u001a\b\u0012\u0004\u0012\u00020I0\u0010¢\u0006\u0004\be\u0010\u0012J\r\u0010f\u001a\u00020\u0017¢\u0006\u0004\bf\u0010\u001eR \u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0<0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iRP\u0010m\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204 k*\n\u0012\u0004\u0012\u000204\u0018\u00010303 k*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204 k*\n\u0012\u0004\u0012\u000204\u0018\u00010303\u0018\u00010g0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010iR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00140g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010iR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020[0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010iR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010xR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00140|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R#\u0010\u0082\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u0001030g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010iR<\u0010\u0084\u0001\u001a&\u0012\f\u0012\n k*\u0004\u0018\u00010\r0\r k*\u0012\u0012\f\u0012\n k*\u0004\u0018\u00010\r0\r\u0018\u00010g0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010iR<\u0010\u0086\u0001\u001a&\u0012\f\u0012\n k*\u0004\u0018\u00010X0X k*\u0012\u0012\f\u0012\n k*\u0004\u0018\u00010X0X\u0018\u00010|0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010~R\u001c\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020[0g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010iR\u001c\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020I0g8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010iR\u0016\u0010\u008c\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010xR\u0016\u0010\u008e\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010xR)\u0010\u0093\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00140\u008f\u0001j\t\u0012\u0004\u0012\u00020\u0014`\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0095\u0001\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010xR!\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020I0|8\u0006¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010~\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R$\u0010\u009d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020.0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006 \u0001"}, d2 = {"Lcom/p1/mobile/putong/core/api/s;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/data/Envelope;", "envelope", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/businessdata/meet/AbsMeetListData;", "Lkotlin/collections/ArrayList;", "I4", "(Lcom/p1/mobile/putong/data/Envelope;)Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/data/VisitorCounter;", "N4", "()Lcom/p1/mobile/putong/data/VisitorCounter;", "Lrx/c;", "Q4", "()Lrx/c;", "s5", "", "r4", "uid", "", "H5", "(Ljava/lang/String;)V", "", "g4", "()Z", "S4", "()V", "n4", "userId", "R4", "k4", "(Ljava/lang/String;)Z", "needSuperlikeCount", "e4", "(Z)V", "Lcom/p1/mobile/putong/data/DbLinks;", "dbLinks", "fetchNew", "haveRead", "y4", "(Lcom/p1/mobile/putong/data/DbLinks;ZZZ)V", "Z4", "Lcom/p1/mobile/putong/core/data/MyMeetLiveItem;", "q4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/MyMeetLiveItem;", "p4", "()Ljava/lang/String;", "", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetLiveItemData;", "s4", "t4", "()Ljava/util/List;", "list", "K5", "(Ljava/util/List;)V", "m4", "Ll/q860;", "L4", "()Ll/q860;", "K4", "N5", "(Ll/q860;)V", "", "v4", "()I", "", "lastSeeReadTime", "sinceSortId", "lastVisitorTab2Time", "Ll/roj0;", "m5", "(JLjava/lang/String;J)Lrx/c;", "readList", "O5", "(Ljava/util/ArrayList;)V", "Lcom/p1/mobile/putong/core/data/MyMeetSeeReminder;", "w4", "()Lcom/p1/mobile/putong/core/data/MyMeetSeeReminder;", "f5", "u4", "()J", "M5", "j4", "o4", "Lcom/p1/mobile/putong/core/data/SvipWeeklyReport;", "y5", "I5", "Lcom/p1/mobile/putong/core/data/MyMeetEntryV3;", "P4", "T4", "(J)Lrx/c;", "L5", "i4", "h4", "J5", "l4", "F5", "O4", "G5", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "newMeetFeedBehaviorSubject", "kotlin.jvm.PlatformType", "S", "meetLiveUserBs", "T", "paidToInterceptUserIdBs", "U", "newMeetEntrySubject", "Ll/uqd0;", "V", "Ll/uqd0;", "firstSortId", "Ll/zpd0;", "W", "Ll/zpd0;", "showGuideToSwipeCardLastTime", "X", "meetVisitorsTabLastTime", "Lrx/subjects/b;", "Y", "Lrx/subjects/b;", "newMeetFeedLikersDataSectChangePs", "Lcom/p1/mobile/putong/core/data/ODiamondListFeed;", "Z", "oDiamondListFeedObs", "a0", "newVisitorsCounterBs", "b0", "svipWeeklyReportBs", "c0", "meetEntranceV4Bs", "d0", "meetEntranceRefreshBs", "e0", "meetNearbyTabLastTime", "f0", "meetEntranceAcceleratePairClickedMils", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "g0", "Ljava/util/HashSet;", "meetUsersCustomTagUidSet", "h0", "meet2SeeLikersOnLineTime", "i0", "M4", "()Lrx/subjects/b;", "newMeetLikersItemViewNotificationBs", "", "j0", "Ljava/util/Map;", "liveUserMap", "Companion", "a", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class C0179s extends ax6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final String f4086k0 = "text";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final a<q860<AbsMeetListData>> newMeetFeedBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final a<List<MeetLiveItemData>> meetLiveUserBs;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final a<String> paidToInterceptUserIdBs;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final a<MyMeetEntryV3> newMeetEntrySubject;

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
    public final b<String> newMeetFeedLikersDataSectChangePs;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public final a<List<ODiamondListFeed>> oDiamondListFeedObs;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public a<VisitorCounter> newVisitorsCounterBs;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public b<SvipWeeklyReport> svipWeeklyReportBs;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    public final a<MyMeetEntryV3> meetEntranceV4Bs;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    public final a<roj0> meetEntranceRefreshBs;

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
    public final b<roj0> newMeetLikersItemViewNotificationBs;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final Map<String, MyMeetLiveItem> liveUserMap;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/core/api/s$a;", "", "<init>", "()V", "", "MOMENT_TEXT_TYPE", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m6672a() {
            return C0179s.f4086k0;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179s(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        a<q860<AbsMeetListData>> aVarB = a.b();
        aVarB.getClass();
        this.newMeetFeedBehaviorSubject = aVarB;
        this.meetLiveUserBs = a.b();
        a<String> aVarC = a.c("");
        aVarC.getClass();
        this.paidToInterceptUserIdBs = aVarC;
        a<MyMeetEntryV3> aVarB2 = a.b();
        aVarB2.getClass();
        this.newMeetEntrySubject = aVarB2;
        this.firstSortId = new uqd0("firstSortId_" + CoreModule.m1850H().userId(), "");
        this.showGuideToSwipeCardLastTime = new zpd0("jump_guide_to_swipe_card_last_time_" + CoreModule.m1850H().userId(), 0L);
        this.meetVisitorsTabLastTime = new zpd0("meet_visitors_tab_last_time_mills_" + CoreModule.m1850H().userId(), 0L);
        b<String> bVarB = b.b();
        bVarB.getClass();
        this.newMeetFeedLikersDataSectChangePs = bVarB;
        a<List<ODiamondListFeed>> aVarB3 = a.b();
        aVarB3.getClass();
        this.oDiamondListFeedObs = aVarB3;
        this.newVisitorsCounterBs = a.b();
        this.svipWeeklyReportBs = b.b();
        a<MyMeetEntryV3> aVarB4 = a.b();
        aVarB4.getClass();
        this.meetEntranceV4Bs = aVarB4;
        a<roj0> aVarC2 = a.c(roj0.a);
        aVarC2.getClass();
        this.meetEntranceRefreshBs = aVarC2;
        this.meetNearbyTabLastTime = new zpd0("meet_nearby_tab_last_time_mills_" + CoreModule.m1850H().userId(), 0L);
        this.meetEntranceAcceleratePairClickedMils = new zpd0("meet_entrance_accelerate_pair_clicked_mills_" + CoreModule.m1850H().userId(), 0L);
        this.meetUsersCustomTagUidSet = new HashSet<>();
        this.meet2SeeLikersOnLineTime = new zpd0("meet_2_see_likers_online_time_" + CoreModule.m1850H().userId(), 0L);
        b<roj0> bVarB2 = b.b();
        bVarB2.getClass();
        this.newMeetLikersItemViewNotificationBs = bVarB2;
        this.liveUserMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: A4 */
    public static final stc0 m6527A4(StringBuilder sb) {
        return C0154a.f3483P.auth().q(C0154a.m3223e1(sb.toString())).f().b();
    }

    /* JADX INFO: renamed from: A5 */
    public static final Envelope m6528A5(C0179s c0179s, Envelope envelope) {
        c0179s.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Envelope m6530B4(C0179s c0179s, Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            c0179s.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: B5 */
    public static final Envelope m6531B5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C4 */
    public static final Envelope m6533C4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C5 */
    public static final SvipWeeklyReport m6534C5(C0179s c0179s, Envelope envelope) {
        envelope.getClass();
        SvipWeeklyReport svipWeeklyReport = envelope.getModuleData(CoreData.class).svipWeeklyReport;
        c0179s.svipWeeklyReportBs.onNext(svipWeeklyReport);
        return svipWeeklyReport;
    }

    /* JADX INFO: renamed from: D4 */
    public static final roj0 m6536D4(C0179s c0179s, DbLinks dbLinks, boolean z, Envelope envelope) {
        List list;
        Links linksNew_;
        DbLinks dbLinks2;
        q860 q860Var;
        List list2;
        ArrayList arrayList = new ArrayList();
        if (dbLinks == null) {
            envelope.getClass();
            arrayList.addAll(c0179s.m6628I4(envelope));
            if (z && (q860Var = (q860) c0179s.newMeetFeedBehaviorSubject.e()) != null && (list2 = q860Var.a) != null) {
                arrayList.addAll(list2);
            }
        } else {
            q860 q860Var2 = (q860) c0179s.newMeetFeedBehaviorSubject.e();
            if (q860Var2 != null && (list = q860Var2.a) != null) {
                arrayList.addAll(list);
            }
            envelope.getClass();
            final ArrayList<AbsMeetListData> arrayListM6628I4 = c0179s.m6628I4(envelope);
            vwb.d0(arrayList, new w9j() { // from class: l.wp9
                public final Object call(Object obj) {
                    return C0179s.m6539E4(arrayListM6628I4, (AbsMeetListData) obj);
                }
            });
            arrayList.addAll(arrayListM6628I4);
        }
        if (!vwb.J(arrayList)) {
            c0179s.firstSortId.put(((AbsMeetListData) arrayList.get(0)).item.sortId);
        }
        DbLinks dbLinks3 = new DbLinks();
        if (z) {
            q860 q860Var3 = (q860) c0179s.newMeetFeedBehaviorSubject.e();
            dbLinks3.total = q860Var3 != null ? q860Var3.d() : 0;
            q860 q860Var4 = (q860) c0179s.newMeetFeedBehaviorSubject.e();
            if (q860Var4 == null || (dbLinks2 = q860Var4.b) == null || (linksNew_ = dbLinks2.links) == null) {
                linksNew_ = Links.new_();
            }
            dbLinks3.links = linksNew_;
        } else {
            Pagination pagination = envelope.pagination;
            dbLinks3.total = pagination.total;
            dbLinks3.links = pagination.links;
        }
        c0179s.newMeetFeedBehaviorSubject.onNext(new q860(arrayList, dbLinks3));
        return roj0.a;
    }

    /* JADX INFO: renamed from: D5 */
    public static final SvipWeeklyReport m6537D5(Function1 function1, Object obj) {
        return (SvipWeeklyReport) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E4 */
    public static final Boolean m6539E4(ArrayList arrayList, final IMeetListData iMeetListData) {
        if (iMeetListData instanceof AbsMeetUserItemData) {
            return Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.fq9
                public final Object call(Object obj) {
                    return C0179s.m6542F4(iMeetListData, (AbsMeetListData) obj);
                }
            }));
        }
        return iMeetListData instanceof MeetFeedSeeItemData ? Boolean.valueOf(vwb.m(arrayList, new w9j() { // from class: l.gq9
            public final Object call(Object obj) {
                return C0179s.m6544G4((AbsMeetListData) obj);
            }
        })) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: E5 */
    public static final void m6540E5(C0179s c0179s, Throwable th) {
        c0179s.svipWeeklyReportBs.onNext((Object) null);
    }

    /* JADX INFO: renamed from: F4 */
    public static final Boolean m6542F4(IMeetListData iMeetListData, AbsMeetListData absMeetListData) {
        return absMeetListData instanceof AbsMeetUserItemData ? Boolean.valueOf(Intrinsics.d(((AbsMeetUserItemData) absMeetListData).item.id, ((AbsMeetUserItemData) iMeetListData).item.id)) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Boolean m6544G4(AbsMeetListData absMeetListData) {
        return Boolean.valueOf(absMeetListData instanceof MeetFeedSeeItemData);
    }

    /* JADX INFO: renamed from: H4 */
    public static final roj0 m6546H4(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Boolean m6549J4(MyMeetFeedItem myMeetFeedItem, Object obj) {
        obj.getClass();
        return Boolean.valueOf(Intrinsics.d(((CopyObject) ((CoreMomentInfo) obj)).id, myMeetFeedItem.momentId));
    }

    /* JADX INFO: renamed from: N3 */
    public static Unit m6553N3(ArrayList arrayList, Envelope envelope) {
        arrayList.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P5 */
    public static final stc0 m6556P5(String str) {
        return C0154a.f3483P.auth().l(utc0.create(Network.JSON, str)).q(C0154a.m3227f1()).b();
    }

    /* JADX INFO: renamed from: U3 */
    public static void m6561U3(C0179s c0179s, Throwable th) {
        a<MyMeetEntryV3> aVar = c0179s.meetEntranceV4Bs;
        aVar.onNext(aVar.e());
    }

    /* JADX INFO: renamed from: U4 */
    public static final stc0 m6562U4(StringBuilder sb) {
        return C0154a.f3483P.auth().q(C0154a.m3147K0(sb.toString())).b();
    }

    /* JADX INFO: renamed from: V4 */
    public static final Envelope m6564V4(C0179s c0179s, Envelope envelope) {
        envelope.getClass();
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            c0179s.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Envelope m6566W4(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X4 */
    public static final roj0 m6568X4(C0179s c0179s, Envelope envelope) {
        c0179s.meetEntranceV4Bs.onNext(envelope.getModuleData(CoreData.class).myMeetEntryV3);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final roj0 m6570Y4(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m6573a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a5 */
    public static final stc0 m6574a5() {
        return C0154a.f3483P.auth().q(C0154a.m3155M0()).f().b();
    }

    /* JADX INFO: renamed from: b4 */
    public static c m6576b4(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.ro9
            public final Object call() {
                return C0179s.m6556P5(str);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static final Envelope m6577b5(C0179s c0179s, Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            c0179s.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Envelope m6580c5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d5 */
    public static final roj0 m6582d5(C0179s c0179s, Envelope envelope) {
        LinkedHashMap linkedHashMap;
        MyMeetListV3 myMeetListV3;
        List<MyMeetLiveItem> list;
        User user;
        List list2;
        ArrayList arrayList = new ArrayList();
        CommonData moduleData = envelope.getModuleData(CommonData.class);
        if (moduleData == null || (list2 = moduleData.users) == null) {
            linkedHashMap = null;
        } else {
            List list3 = list2;
            linkedHashMap = new LinkedHashMap(kotlin.ranges.a.b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
            for (Object obj : list3) {
                linkedHashMap.put(((DbObject) ((User) obj)).id, obj);
            }
        }
        c0179s.liveUserMap.clear();
        CoreData moduleData2 = envelope.getModuleData(CoreData.class);
        if (moduleData2 != null && (myMeetListV3 = moduleData2.myMeetListV3) != null && (list = myMeetListV3.liveUsers) != null) {
            for (MyMeetLiveItem myMeetLiveItem : list) {
                if (TEnum.equals(myMeetLiveItem.liveType, "live") || TEnum.equals(myMeetLiveItem.liveType, "liveVoice")) {
                    c0179s.liveUserMap.put(myMeetLiveItem.userId, myMeetLiveItem);
                    if (linkedHashMap != null && (user = (User) linkedHashMap.get(myMeetLiveItem.userId)) != null) {
                        arrayList.add(new MeetLiveItemData(user, myMeetLiveItem));
                    }
                }
            }
        }
        c0179s.meetLiveUserBs.onNext(arrayList);
        return roj0.a;
    }

    /* JADX INFO: renamed from: e5 */
    public static final roj0 m6584e5(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f3 */
    public static c m6585f3(final StringBuilder sb, final C0179s c0179s, final DbLinks dbLinks, final boolean z) {
        c<Envelope> cVarM16573g = ia20.m16573g(new v9j() { // from class: l.yo9
            public final Object call() {
                return C0179s.m6527A4(sb);
            }
        }, false);
        final Function1 function1 = new Function1() { // from class: l.zo9
            public final Object invoke(Object obj) {
                return C0179s.m6530B4(this.f28860a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16573g.map(new w9j() { // from class: l.ap9
            public final Object call(Object obj) {
                return C0179s.m6533C4(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.bp9
            public final Object invoke(Object obj) {
                return C0179s.m6536D4(this.f9024a, dbLinks, z, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.cp9
            public final Object call(Object obj) {
                return C0179s.m6546H4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m6586f4(C0179s c0179s, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c0179s.m6648e4(z);
    }

    /* JADX INFO: renamed from: g5 */
    public static final stc0 m6588g5() {
        return C0154a.f3483P.auth().q(C0154a.m3159N0(CoreModule.m1850H().userId())).b();
    }

    /* JADX INFO: renamed from: h3 */
    public static c m6589h3(final C0179s c0179s) {
        c<Envelope> cVarM16573g = ia20.m16573g(new v9j() { // from class: l.qp9
            public final Object call() {
                return C0179s.m6574a5();
            }
        }, true);
        final Function1 function1 = new Function1() { // from class: l.sp9
            public final Object invoke(Object obj) {
                return C0179s.m6577b5(this.f21564a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16573g.map(new w9j() { // from class: l.tp9
            public final Object call(Object obj) {
                return C0179s.m6580c5(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.up9
            public final Object invoke(Object obj) {
                return C0179s.m6582d5(this.f23694a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.vp9
            public final Object call(Object obj) {
                return C0179s.m6584e5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public static final Envelope m6590h5(C0179s c0179s, Envelope envelope) {
        envelope.getClass();
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            c0179s.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Envelope m6592i5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m6594j5(C0179s c0179s, Envelope envelope) {
        if (NullChecker.a(envelope.getModuleData(CoreData.class).odiamondList)) {
            List list = envelope.getModuleData(CoreData.class).odiamondList.feeds;
            list.getClass();
            if (!vwb.J(list)) {
                c0179s.oDiamondListFeedObs.onNext(list);
            }
        } else {
            a<List<ODiamondListFeed>> aVar = c0179s.oDiamondListFeedObs;
            aVar.onNext(aVar.e());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m6596k5(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l3 */
    public static c m6597l3(final StringBuilder sb, final C0179s c0179s) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.so9
            public final Object call() {
                return C0179s.m6601n5(sb);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.to9
            public final Object invoke(Object obj) {
                return C0179s.m6603o5(this.f22208a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16571e.map(new w9j() { // from class: l.uo9
            public final Object call(Object obj) {
                return C0179s.m6605p5(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.wo9
            public final Object invoke(Object obj) {
                return C0179s.m6607q5(this.f25264a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.xo9
            public final Object call(Object obj) {
                return C0179s.m6609r5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m6598l5(C0179s c0179s, Throwable th) {
        a<List<ODiamondListFeed>> aVar = c0179s.oDiamondListFeedObs;
        aVar.onNext(aVar.e());
    }

    /* JADX INFO: renamed from: m3 */
    public static c m6599m3(final C0179s c0179s) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.jq9
            public final Object call() {
                return C0179s.m6612t5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.kq9
            public final Object invoke(Object obj) {
                return C0179s.m6614u5(this.f15961a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16571e.map(new w9j() { // from class: l.lq9
            public final Object call(Object obj) {
                return C0179s.m6616v5(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.lo9
            public final Object invoke(Object obj) {
                return C0179s.m6618w5(this.f16537a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.mo9
            public final Object call(Object obj) {
                return C0179s.m6620x5(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public static final stc0 m6601n5(StringBuilder sb) {
        return C0154a.f3483P.auth().q(C0154a.m3219d1(sb.toString())).b();
    }

    /* JADX INFO: renamed from: o5 */
    public static final Envelope m6603o5(C0179s c0179s, Envelope envelope) {
        envelope.getClass();
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            c0179s.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: p5 */
    public static final Envelope m6605p5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    public static final roj0 m6607q5(C0179s c0179s, Envelope envelope) {
        c0179s.newMeetEntrySubject.onNext(envelope.getModuleData(CoreData.class).myMeetEntryV3);
        return roj0.a;
    }

    /* JADX INFO: renamed from: r5 */
    public static final roj0 m6609r5(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t5 */
    public static final stc0 m6612t5() {
        return C0154a.f3483P.auth().q(C0154a.m3153L2(CoreModule.m1850H().userId())).f().b();
    }

    /* JADX INFO: renamed from: u5 */
    public static final Envelope m6614u5(C0179s c0179s, Envelope envelope) {
        c0179s.f8580Q.m3422w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: v3 */
    public static c m6615v3(final StringBuilder sb, final C0179s c0179s) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.dp9
            public final Object call() {
                return C0179s.m6562U4(sb);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.ep9
            public final Object invoke(Object obj) {
                return C0179s.m6564V4(this.f11386a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16571e.map(new w9j() { // from class: l.fp9
            public final Object call(Object obj) {
                return C0179s.m6566W4(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.hp9
            public final Object invoke(Object obj) {
                return C0179s.m6568X4(this.f14005a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.ip9
            public final Object call(Object obj) {
                return C0179s.m6570Y4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: v5 */
    public static final Envelope m6616v5(Function1 function1, Object obj) {
        return (Envelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w3 */
    public static c m6617w3(final C0179s c0179s) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.jp9
            public final Object call() {
                return C0179s.m6624z5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.kp9
            public final Object invoke(Object obj) {
                return C0179s.m6528A5(this.f15953a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16571e.map(new w9j() { // from class: l.lp9
            public final Object call(Object obj) {
                return C0179s.m6531B5(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.mp9
            public final Object invoke(Object obj) {
                return C0179s.m6534C5(this.f17176a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.np9
            public final Object call(Object obj) {
                return C0179s.m6537D5(function2, obj);
            }
        }).doOnError(new e30() { // from class: l.op9
            public final void call(Object obj) {
                C0179s.m6540E5(this.f18316a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public static final VisitorCounter m6618w5(C0179s c0179s, Envelope envelope) {
        envelope.getClass();
        VisitorCounter visitorCounter = envelope.getModuleData(CommonData.class).visitorCounter;
        visitorCounter.getClass();
        c0179s.newVisitorsCounterBs.onNext(visitorCounter);
        return visitorCounter;
    }

    /* JADX INFO: renamed from: x3 */
    public static c m6619x3(final C0179s c0179s) {
        c<Envelope> cVarM16571e = ia20.m16571e(new v9j() { // from class: l.xp9
            public final Object call() {
                return C0179s.m6588g5();
            }
        });
        final Function1 function1 = new Function1() { // from class: l.yp9
            public final Object invoke(Object obj) {
                return C0179s.m6590h5(this.f28335a, (Envelope) obj);
            }
        };
        c cVarObserveOn = cVarM16571e.map(new w9j() { // from class: l.zp9
            public final Object call(Object obj) {
                return C0179s.m6592i5(function1, obj);
            }
        }).observeOn(jo0.a());
        final Function1 function2 = new Function1() { // from class: l.aq9
            public final Object invoke(Object obj) {
                return C0179s.m6594j5(this.f8441a, (Envelope) obj);
            }
        };
        return cVarObserveOn.map(new w9j() { // from class: l.bq9
            public final Object call(Object obj) {
                return C0179s.m6596k5(function2, obj);
            }
        }).doOnError(new e30() { // from class: l.dq9
            public final void call(Object obj) {
                C0179s.m6598l5(this.f10524a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public static final VisitorCounter m6620x5(Function1 function1, Object obj) {
        return (VisitorCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static void m6622z3(C0179s c0179s, Throwable th) {
        a<MyMeetEntryV3> aVar = c0179s.newMeetEntrySubject;
        aVar.onNext(aVar.e());
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m6623z4(C0179s c0179s, DbLinks dbLinks, boolean z, boolean z2, boolean z3, int i, Object obj) {
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
        c0179s.m6670y4(dbLinks, z, z2, z3);
    }

    /* JADX INFO: renamed from: z5 */
    public static final stc0 m6624z5() {
        return C0154a.f3483P.auth().q(C0154a.m3296w2("/" + CoreModule.m1850H().userId() + "/svip-weekly-report")).f().b();
    }

    /* JADX INFO: renamed from: F5 */
    public final void m6625F5(@NotNull String uid) {
        uid.getClass();
        this.meetUsersCustomTagUidSet.add(uid);
    }

    /* JADX INFO: renamed from: G5 */
    public final void m6626G5() {
        this.meetEntranceRefreshBs.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: H5 */
    public final void m6627H5(@NotNull String uid) {
        uid.getClass();
        this.newMeetFeedLikersDataSectChangePs.onNext(uid);
    }

    /* JADX INFO: renamed from: I4 */
    public final ArrayList<AbsMeetListData> m6628I4(Envelope envelope) {
        MyMeetListV3 myMeetListV3;
        List<MyMeetFeedItem> list;
        CoreMomentInfo coreMomentInfoA;
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        CommonData moduleData2 = envelope.getModuleData(CommonData.class);
        ArrayList<AbsMeetListData> arrayList = new ArrayList<>();
        w700 w700VarCa = CoreModule.m1853N().Ca(envelope, CoreMomentInfo.JSON_ADAPTER);
        List list2 = moduleData2.users;
        list2.getClass();
        List list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.a.b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((DbObject) ((User) obj)).id, obj);
        }
        MyMeetListV3 myMeetListV4 = moduleData.myMeetListV3;
        if (!vwb.J(myMeetListV4 != null ? myMeetListV4.feeds : null) && (myMeetListV3 = moduleData.myMeetListV3) != null && (list = myMeetListV3.feeds) != null) {
            for (final MyMeetFeedItem myMeetFeedItem : list) {
                if (Intrinsics.d(myMeetFeedItem.type, FeedType.get("relationMoment")) || Intrinsics.d(myMeetFeedItem.type, FeedType.get("pickMoment"))) {
                    int iG = vwb.G(w700VarCa, new w9j() { // from class: l.eq9
                        public final Object call(Object obj2) {
                            return C0179s.m6549J4(myMeetFeedItem, obj2);
                        }
                    });
                    if (iG != -1 && w700VarCa != null && (coreMomentInfoA = w700VarCa.a(iG)) != null && (coreMomentInfoA instanceof CoreMomentInfo)) {
                        if (TextUtils.equals(myMeetFeedItem.momentMediaType, f4086k0)) {
                            CoreMomentInfo coreMomentInfo = coreMomentInfoA;
                            MeetFeedUserItemData meetFeedUserItemData = new MeetFeedUserItemData((User) linkedHashMap.get(coreMomentInfo.owner), myMeetFeedItem);
                            meetFeedUserItemData.setCoreMomentInfo(coreMomentInfo);
                            arrayList.add(meetFeedUserItemData);
                        } else {
                            CoreMomentInfo coreMomentInfo2 = coreMomentInfoA;
                            List list4 = coreMomentInfo2.media;
                            list4.getClass();
                            boolean z = CollectionsKt.getOrNull(list4, 0) instanceof Video;
                            String str = coreMomentInfo2.owner;
                            if (z) {
                                arrayList.add(new MeetFeedVideoItemData(coreMomentInfo2, (User) linkedHashMap.get(str), w700VarCa.c().get(iG), myMeetFeedItem));
                            } else {
                                arrayList.add(new MeetFeedImageItemData(coreMomentInfo2, (User) linkedHashMap.get(str), w700VarCa.c().get(iG), myMeetFeedItem));
                            }
                        }
                    }
                } else if (Intrinsics.d(myMeetFeedItem.type, FeedType.get("lowSeeUsers"))) {
                    arrayList.add(new MeetFeedSeeItemData(myMeetFeedItem));
                } else if (Intrinsics.d(myMeetFeedItem.type, FeedType.get("pickUser")) || Intrinsics.d(myMeetFeedItem.type, FeedType.get("highSeeUser")) || Intrinsics.d(myMeetFeedItem.type, FeedType.get("likedUser")) || Intrinsics.d(myMeetFeedItem.type, FeedType.get("seePortraitUser")) || Intrinsics.d(myMeetFeedItem.type, FeedType.get("lowSeeUser")) || Intrinsics.d(myMeetFeedItem.type, FeedType.get("momentLikeUser")) || Intrinsics.d(myMeetFeedItem.type, FeedType.get("momentBeLikeUser"))) {
                    if (Intrinsics.d(myMeetFeedItem.type, FeedType.get("seePortraitUser"))) {
                        this.f8580Q.f3676u0.m2372i5((String) myMeetFeedItem.userIds.get(0));
                    }
                    arrayList.add(new MeetFeedUserItemData((User) linkedHashMap.get(myMeetFeedItem.userIds.get(0)), myMeetFeedItem));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: I5 */
    public final c<SvipWeeklyReport> m6629I5() {
        c<SvipWeeklyReport> cVarAsObservable = this.svipWeeklyReportBs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: J5 */
    public final void m6630J5() {
        this.meetEntranceAcceleratePairClickedMils.put(Long.valueOf(mqi0.o()));
    }

    @NotNull
    /* JADX INFO: renamed from: K4 */
    public final c<q860<AbsMeetListData>> m6631K4() {
        c<q860<AbsMeetListData>> cVarAsObservable = this.newMeetFeedBehaviorSubject.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: K5 */
    public final void m6632K5(@NotNull List<? extends MeetLiveItemData> list) {
        list.getClass();
        this.meetLiveUserBs.onNext(list);
    }

    @Nullable
    /* JADX INFO: renamed from: L4 */
    public final q860<AbsMeetListData> m6633L4() {
        return (q860) this.newMeetFeedBehaviorSubject.e();
    }

    /* JADX INFO: renamed from: L5 */
    public final void m6634L5() {
        this.meetNearbyTabLastTime.put(Long.valueOf(mqi0.o()));
    }

    @NotNull
    /* JADX INFO: renamed from: M4 */
    public final b<roj0> m6635M4() {
        return this.newMeetLikersItemViewNotificationBs;
    }

    /* JADX INFO: renamed from: M5 */
    public final void m6636M5() {
        this.meetVisitorsTabLastTime.put(Long.valueOf(mqi0.o()));
    }

    @Nullable
    /* JADX INFO: renamed from: N4 */
    public final VisitorCounter m6637N4() {
        if (this.newVisitorsCounterBs.i()) {
            return (VisitorCounter) this.newVisitorsCounterBs.e();
        }
        return null;
    }

    /* JADX INFO: renamed from: N5 */
    public final void m6638N5(@NotNull q860<AbsMeetListData> list) {
        list.getClass();
        this.newMeetFeedBehaviorSubject.onNext(list);
    }

    @NotNull
    /* JADX INFO: renamed from: O4 */
    public final c<roj0> m6639O4() {
        c<roj0> cVarAsObservable = this.meetEntranceRefreshBs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: O5 */
    public final void m6640O5(@NotNull final ArrayList<String> readList) {
        readList.getClass();
        StringBuilder sb = new StringBuilder();
        for (String str : readList) {
            if (sb.length() == 0) {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            } else {
                sb.append(",");
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
        }
        final String str2 = "{\"ids\":[" + ((Object) sb) + "]}";
        c cVarScheduled = this.f8580Q.scheduled("update_meet_read_status", 0, new v9j() { // from class: l.vo9
            public final Object call() {
                return C0179s.m6576b4(str2);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.gp9
            public final Object invoke(Object obj) {
                return C0179s.m6553N3(readList, (Envelope) obj);
            }
        };
        cVarScheduled.subscribe(new e30() { // from class: l.rp9
            public final void call(Object obj) {
                C0179s.m6573a4(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final c<MyMeetEntryV3> m6641P4() {
        c<MyMeetEntryV3> cVarAsObservable = this.meetEntranceV4Bs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final c<VisitorCounter> m6642Q4() {
        c<VisitorCounter> cVarAsObservable = this.newVisitorsCounterBs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m6643R4(@NotNull String userId) {
        userId.getClass();
        this.paidToInterceptUserIdBs.onNext(userId);
    }

    /* JADX INFO: renamed from: S4 */
    public final void m6644S4() {
        this.showGuideToSwipeCardLastTime.put(Long.valueOf(mqi0.o()));
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: T4 */
    public final c<roj0> m6645T4(long lastVisitorTab2Time) {
        final StringBuilder sb = new StringBuilder();
        if (lastVisitorTab2Time > 0) {
            sb.append("?lastVisitorTab2Time=");
            sb.append(lastVisitorTab2Time);
        }
        c<roj0> cVarDoOnError = this.f8580Q.scheduled("meet_entry_v4", 0, new v9j() { // from class: l.cq9
            public final Object call() {
                return C0179s.m6615v3(sb, this);
            }
        }).doOnError(new e30() { // from class: l.hq9
            public final void call(Object obj) {
                C0179s.m6561U3(this.f14017a, (Throwable) obj);
            }
        });
        cVarDoOnError.getClass();
        return cVarDoOnError;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m6646Z4() {
        scheduled("live/v3", 0, new v9j() { // from class: l.iq9
            public final Object call() {
                return C0179s.m6589h3(this.f14686a);
            }
        });
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d4 */
    public final void m6647d4() {
        m6586f4(this, false, 1, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e4 */
    public final void m6648e4(boolean needSuperlikeCount) {
        q860 q860Var = (q860) this.newMeetFeedBehaviorSubject.e();
        m6623z4(this, q860Var != null ? q860Var.b : null, false, false, needSuperlikeCount, 6, null);
    }

    /* JADX INFO: renamed from: f5 */
    public final void m6649f5() {
        this.f8580Q.scheduled("meet_o_diamond_list_feeds", 0, new v9j() { // from class: l.pp9
            public final Object call() {
                return C0179s.m6619x3(this.f19257a);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final boolean m6650g4() {
        long jO = mqi0.o();
        Object obj = this.showGuideToSwipeCardLastTime.get();
        obj.getClass();
        return jO - ((Number) obj).longValue() > 7200000;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m6651h4() {
        Long l2 = (Long) this.meetEntranceAcceleratePairClickedMils.get();
        l2.getClass();
        return !mqi0.D(l2.longValue());
    }

    /* JADX INFO: renamed from: i4 */
    public final boolean m6652i4() {
        Long l2 = (Long) this.meetNearbyTabLastTime.get();
        l2.getClass();
        return !mqi0.D(l2.longValue());
    }

    /* JADX INFO: renamed from: j4 */
    public final boolean m6653j4() {
        Long l2 = (Long) this.meetVisitorsTabLastTime.get();
        l2.getClass();
        return (mqi0.D(l2.longValue()) || CoreModule.m1854P().m11706a().m19853a2()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m6654k4(@NotNull String userId) {
        userId.getClass();
        return TextUtils.equals(userId, (CharSequence) this.paidToInterceptUserIdBs.e());
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m6655l4(@NotNull String uid) {
        uid.getClass();
        return this.meetUsersCustomTagUidSet.contains(uid);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m6656m4() {
        this.meetLiveUserBs.onNext((Object) null);
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: m5 */
    public final c<roj0> m6657m5(long lastSeeReadTime, @Nullable String sinceSortId, long lastVisitorTab2Time) {
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
        c<roj0> cVarDoOnError = this.f8580Q.scheduled("new_meet_entry", 0, new v9j() { // from class: l.po9
            public final Object call() {
                return C0179s.m6597l3(sb, this);
            }
        }).doOnError(new e30() { // from class: l.qo9
            public final void call(Object obj) {
                C0179s.m6622z3(this.f19952a, (Throwable) obj);
            }
        });
        cVarDoOnError.getClass();
        return cVarDoOnError;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m6658n4() {
        this.paidToInterceptUserIdBs.onNext("");
    }

    /* JADX INFO: renamed from: o4 */
    public final void m6659o4() {
        this.meetVisitorsTabLastTime.put(0L);
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final String m6660p4() {
        Object obj = this.firstSortId.get();
        obj.getClass();
        return (String) obj;
    }

    @Nullable
    /* JADX INFO: renamed from: q4 */
    public final MyMeetLiveItem m6661q4(@NotNull String userId) {
        userId.getClass();
        return this.liveUserMap.get(userId);
    }

    @NotNull
    /* JADX INFO: renamed from: r4 */
    public final c<String> m6662r4() {
        c<String> cVarAsObservable = this.newMeetFeedLikersDataSectChangePs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: s4 */
    public final c<List<MeetLiveItemData>> m6663s4() {
        c<List<MeetLiveItemData>> cVarAsObservable = this.meetLiveUserBs.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: s5 */
    public final c<VisitorCounter> m6664s5() {
        c<VisitorCounter> cVarScheduled = scheduled("new_visitor_counter", 0, new v9j() { // from class: l.ko9
            public final Object call() {
                return C0179s.m6599m3(this.f15924a);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }

    @Nullable
    /* JADX INFO: renamed from: t4 */
    public final List<MeetLiveItemData> m6665t4() {
        return (List) this.meetLiveUserBs.e();
    }

    /* JADX INFO: renamed from: u4 */
    public final long m6666u4() {
        Object obj = this.meetVisitorsTabLastTime.get();
        obj.getClass();
        return ((Number) obj).longValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final int m6667v4() {
        MyMeetEntryFeed myMeetEntryFeed;
        MyMeetEntryV3 myMeetEntryV3 = (MyMeetEntryV3) this.newMeetEntrySubject.e();
        if (myMeetEntryV3 == null || (myMeetEntryFeed = myMeetEntryV3.feed) == null) {
            return 0;
        }
        return myMeetEntryFeed.newCount;
    }

    @Nullable
    /* JADX INFO: renamed from: w4 */
    public final MyMeetSeeReminder m6668w4() {
        MyMeetEntryV3 myMeetEntryV3 = (MyMeetEntryV3) this.newMeetEntrySubject.e();
        if (myMeetEntryV3 != null) {
            return myMeetEntryV3.seeReminder;
        }
        return null;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: x4 */
    public final void m6669x4(@Nullable DbLinks dbLinks, boolean z, boolean z2) {
        m6623z4(this, dbLinks, z, z2, false, 8, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: y4 */
    public final void m6670y4(@Nullable final DbLinks dbLinks, final boolean fetchNew, boolean haveRead, boolean needSuperlikeCount) {
        Links links;
        Long l2 = (Long) CoreModule.f1534c.f3676u0.f3243k0.get();
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
            sb.append("&sinceSortId=" + m6660p4());
        }
        scheduled("mymeet-feeds", 0, new v9j() { // from class: l.oo9
            public final Object call() {
                return C0179s.m6585f3(sb, this, dbLinks, fetchNew);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: y5 */
    public final c<SvipWeeklyReport> m6671y5() {
        c<SvipWeeklyReport> cVarScheduled = scheduled("refresh_svip_weekly_report", 0, new v9j() { // from class: l.no9
            public final Object call() {
                return C0179s.m6617w3(this.f17761a);
            }
        });
        cVarScheduled.getClass();
        return cVarScheduled;
    }
}
