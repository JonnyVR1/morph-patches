package com.p046p1.mobile.putong.p065ui.datepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.IntRange;
import androidx.annotation.RawRes;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.datepicker.WheelView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.d9c0;
import p149l.e16;
import p149l.gbl0;
import p149l.gex;
import p149l.he50;
import p149l.ie50;
import p149l.if50;
import p149l.j6f;
import p149l.l01;
import p149l.l9r;
import p149l.qq3;
import p149l.vii0;
import p149l.vlf0;
import p149l.w4q;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\r\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 ª\u00042\u00020\u00012\u00020\u00022\u00020\u0003:\f¤\u0001«\u0004¬\u0004\u00ad\u0004®\u0004¡\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0015J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0015J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0015J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u0015J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0015J\u000f\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u0015J\u001b\u00102\u001a\u00020\b2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\b2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u0015J\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u0010\u0015J\u0017\u00109\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b>\u0010:J\u0017\u0010?\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b?\u0010:J\u0017\u0010@\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b@\u0010:J\u0017\u0010A\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bA\u0010:J\u0019\u0010C\u001a\u00020\u00172\b\u0010B\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\bC\u0010DJ/\u0010H\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010IJ?\u0010O\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bO\u0010PJ/\u0010Q\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010IJO\u0010U\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bU\u0010VJ?\u0010W\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010J\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bY\u0010\u0011J\u0017\u0010\\\u001a\u00020\b2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\fH\u0002¢\u0006\u0004\b^\u0010\u0015J\u000f\u0010_\u001a\u00020\fH\u0002¢\u0006\u0004\b_\u0010\u0015J\u000f\u0010`\u001a\u00020\fH\u0002¢\u0006\u0004\b`\u0010\u0015J\u000f\u0010a\u001a\u00020\fH\u0002¢\u0006\u0004\ba\u0010\u0015J\u000f\u0010b\u001a\u00020\fH\u0002¢\u0006\u0004\bb\u0010\u0015J\u0017\u0010e\u001a\u00020\f2\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\f2\u0006\u0010g\u001a\u00020\u001eH\u0002¢\u0006\u0004\bh\u0010!J\u0017\u0010j\u001a\u00020\f2\u0006\u0010i\u001a\u00020\bH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\f2\u0006\u0010l\u001a\u00020\bH\u0002¢\u0006\u0004\bm\u0010kJ\u000f\u0010n\u001a\u00020\fH\u0002¢\u0006\u0004\bn\u0010\u0015J\u000f\u0010o\u001a\u00020\fH\u0002¢\u0006\u0004\bo\u0010\u0015J\u000f\u0010p\u001a\u00020\fH\u0002¢\u0006\u0004\bp\u0010\u0015J\u000f\u0010q\u001a\u00020\fH\u0002¢\u0006\u0004\bq\u0010\u0015J\u001b\u0010r\u001a\u00020\u001e2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0004\bu\u0010\u0011J\u001f\u0010x\u001a\u00020\b2\u0006\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\bH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\b2\u0006\u0010z\u001a\u00020\bH\u0002¢\u0006\u0004\b{\u0010\u0011J\u000f\u0010|\u001a\u00020\bH\u0002¢\u0006\u0004\b|\u0010)J\u0017\u0010}\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\b2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u007f\u0010\u0011J\u0011\u0010\u0080\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0080\u0001\u0010)J\u0011\u0010\u0081\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0081\u0001\u0010\u0015J\u001a\u0010\u0083\u0001\u001a\u00020\f2\u0007\u0010\u0082\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0083\u0001\u0010!J\u0011\u0010\u0084\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u0015J\u0011\u0010\u0085\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u0015J\u0011\u0010\u0086\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0015J\u0011\u0010\u0087\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0015J\u0011\u0010\u0088\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0015J\u0011\u0010\u0089\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u0015J\u0019\u0010\u008a\u0001\u001a\u00020\b2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0011J\u0012\u0010\u008b\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0005\b\u008d\u0001\u0010~J&\u0010\u008e\u0001\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\b2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\f2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\fH\u0014¢\u0006\u0005\b\u0094\u0001\u0010\u0015J-\u0010\u0098\u0001\u001a\u00020\f2\u0007\u0010\u0095\u0001\u001a\u00020\b2\u0007\u0010\u0096\u0001\u001a\u00020\b2\u0007\u0010\u0097\u0001\u001a\u00020\bH\u0004¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J$\u0010\u009c\u0001\u001a\u00020\f2\u0007\u0010\u009a\u0001\u001a\u00020\b2\u0007\u0010\u009b\u0001\u001a\u00020\bH\u0014¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0019\u0010\u009e\u0001\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0014¢\u0006\u0005\b\u009e\u0001\u0010:J\u001e\u0010¡\u0001\u001a\u00020\u001e2\n\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u0001H\u0017¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b£\u0001\u0010\u0015J\u0011\u0010¤\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b¤\u0001\u0010\u0015J&\u0010§\u0001\u001a\u00020\f\"\u0004\b\u0000\u0010@2\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¥\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001c\u0010©\u0001\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u000300¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0016\u0010«\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u000100¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001a\u0010¯\u0001\u001a\u00020\f2\b\u0010®\u0001\u001a\u00030\u00ad\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J)\u0010¯\u0001\u001a\u00020\f2\u0017\u0010³\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\u00170±\u0001¢\u0006\u0006\b¯\u0001\u0010´\u0001J\u001a\u0010·\u0001\u001a\u00020\f2\b\u0010¶\u0001\u001a\u00030µ\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001J3\u0010·\u0001\u001a\u00020\f2!\u0010º\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\b0¹\u0001¢\u0006\u0006\b·\u0001\u0010»\u0001J\u0019\u0010½\u0001\u001a\u00020\f2\u0007\u0010¼\u0001\u001a\u00020\u001a¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0019\u0010À\u0001\u001a\u00020\f2\u0007\u0010¿\u0001\u001a\u00020\u001a¢\u0006\u0006\bÀ\u0001\u0010¾\u0001J'\u0010Ä\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Á\u00012\t\b\u0002\u0010Ã\u0001\u001a\u00020\u001eH\u0007¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001a\u0010Ç\u0001\u001a\u00020\f2\t\b\u0001\u0010Æ\u0001\u001a\u00020\b¢\u0006\u0005\bÇ\u0001\u0010kJ\u001a\u0010É\u0001\u001a\u00020\f2\t\b\u0001\u0010È\u0001\u001a\u00020\b¢\u0006\u0005\bÉ\u0001\u0010kJ\u0019\u0010Ë\u0001\u001a\u00020\f2\u0007\u0010Ê\u0001\u001a\u00020\u0017¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0019\u0010Î\u0001\u001a\u00020\f2\u0007\u0010Í\u0001\u001a\u00020\u001a¢\u0006\u0006\bÎ\u0001\u0010¾\u0001J\u0019\u0010Ð\u0001\u001a\u00020\f2\u0007\u0010Ï\u0001\u001a\u00020\u001a¢\u0006\u0006\bÐ\u0001\u0010¾\u0001J\u0019\u0010Ò\u0001\u001a\u00020\f2\u0007\u0010Ñ\u0001\u001a\u00020\u001a¢\u0006\u0006\bÒ\u0001\u0010¾\u0001J\u0019\u0010Ô\u0001\u001a\u00020\f2\u0007\u0010Ó\u0001\u001a\u00020\u001a¢\u0006\u0006\bÔ\u0001\u0010¾\u0001J\u001a\u0010Ö\u0001\u001a\u00020\f2\t\b\u0001\u0010Õ\u0001\u001a\u00020\b¢\u0006\u0005\bÖ\u0001\u0010kJ\u0019\u0010Ø\u0001\u001a\u00020\f2\u0007\u0010×\u0001\u001a\u00020\u001a¢\u0006\u0006\bØ\u0001\u0010¾\u0001J\u0019\u0010Ú\u0001\u001a\u00020\f2\u0007\u0010Ù\u0001\u001a\u00020\u001a¢\u0006\u0006\bÚ\u0001\u0010¾\u0001J\u0019\u0010Ü\u0001\u001a\u00020\f2\u0007\u0010Û\u0001\u001a\u00020\u001a¢\u0006\u0006\bÜ\u0001\u0010¾\u0001J\u001a\u0010Þ\u0001\u001a\u00020\f2\t\b\u0001\u0010Ý\u0001\u001a\u00020\b¢\u0006\u0005\bÞ\u0001\u0010kJ\u0018\u0010à\u0001\u001a\u00020\f2\u0007\u0010ß\u0001\u001a\u00020\b¢\u0006\u0005\bà\u0001\u0010kJ\u0019\u0010á\u0001\u001a\u00020\f2\u0007\u0010¼\u0001\u001a\u00020\u001a¢\u0006\u0006\bá\u0001\u0010¾\u0001J\u0019\u0010â\u0001\u001a\u00020\f2\u0007\u0010¼\u0001\u001a\u00020\u001a¢\u0006\u0006\bâ\u0001\u0010¾\u0001J\u001a\u0010ã\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Á\u0001¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u001a\u0010å\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Á\u0001¢\u0006\u0006\bå\u0001\u0010ä\u0001J\u001a\u0010ç\u0001\u001a\u00020\f2\t\b\u0001\u0010æ\u0001\u001a\u00020\b¢\u0006\u0005\bç\u0001\u0010kJ\u001a\u0010é\u0001\u001a\u00020\f2\t\b\u0001\u0010è\u0001\u001a\u00020\b¢\u0006\u0005\bé\u0001\u0010kJ\u0019\u0010ë\u0001\u001a\u00020\f2\u0007\u0010ê\u0001\u001a\u00020\u001a¢\u0006\u0006\bë\u0001\u0010¾\u0001J\u0019\u0010í\u0001\u001a\u00020\f2\u0007\u0010ì\u0001\u001a\u00020\u001a¢\u0006\u0006\bí\u0001\u0010¾\u0001J0\u0010ð\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\b2\t\b\u0002\u0010î\u0001\u001a\u00020\u001e2\t\b\u0002\u0010ï\u0001\u001a\u00020\bH\u0007¢\u0006\u0006\bð\u0001\u0010ñ\u0001J(\u0010ô\u0001\u001a\u00020\f2\t\b\u0003\u0010ò\u0001\u001a\u00020\b2\t\b\u0001\u0010ó\u0001\u001a\u00020\bH\u0007¢\u0006\u0006\bô\u0001\u0010\u009d\u0001J(\u0010õ\u0001\u001a\u00020\f2\t\b\u0003\u0010ò\u0001\u001a\u00020\b2\t\b\u0001\u0010ó\u0001\u001a\u00020\bH\u0007¢\u0006\u0006\bõ\u0001\u0010\u009d\u0001J2\u0010ö\u0001\u001a\u00020\f2\t\b\u0003\u0010ò\u0001\u001a\u00020\b2\t\b\u0001\u0010ó\u0001\u001a\u00020\b2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0007¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u000f\u0010ø\u0001\u001a\u00020\b¢\u0006\u0005\bø\u0001\u0010)J\u0018\u0010ù\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010@¢\u0006\u0006\bù\u0001\u0010ú\u0001J \u0010û\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010?2\u0006\u0010t\u001a\u00020\b¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u000f\u0010ý\u0001\u001a\u00020\b¢\u0006\u0005\bý\u0001\u0010)J)\u0010\u0080\u0002\u001a\u00020\b2\n\u0010þ\u0001\u001a\u0005\u0018\u00010²\u00012\t\b\u0002\u0010ÿ\u0001\u001a\u00020\u001eH\u0017¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0011\u0010\u0082\u0002\u001a\u00020\bH\u0004¢\u0006\u0005\b\u0082\u0002\u0010)J\u0010\u0010\u0083\u0002\u001a\u00020\u001a¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u0019\u0010\u0086\u0002\u001a\u00020\f2\u0007\u0010\u0085\u0002\u001a\u00020\u001a¢\u0006\u0006\b\u0086\u0002\u0010¾\u0001J\u001a\u0010\u0088\u0002\u001a\u00020\f2\t\b\u0001\u0010\u0087\u0002\u001a\u00020\b¢\u0006\u0005\b\u0088\u0002\u0010kJ\u001a\u0010\u008a\u0002\u001a\u00020\f2\u0007\u0010\u0089\u0002\u001a\u00020\bH\u0014¢\u0006\u0005\b\u008a\u0002\u0010kJ\u001a\u0010\u008c\u0002\u001a\u00020\f2\u0007\u0010\u008b\u0002\u001a\u00020\bH\u0014¢\u0006\u0005\b\u008c\u0002\u0010kJ&\u0010\u008d\u0002\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010t\u001a\u00020\bH\u0014¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J$\u0010\u0091\u0002\u001a\u00020\f2\u0007\u0010\u008f\u0002\u001a\u00020\b2\u0007\u0010\u0090\u0002\u001a\u00020\bH\u0014¢\u0006\u0006\b\u0091\u0002\u0010\u009d\u0001J\u001c\u0010\u0094\u0002\u001a\u00020\f2\n\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0092\u0002¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u001c\u0010\u0098\u0002\u001a\u00020\f2\n\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u0096\u0002¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J\u001c\u0010\u009c\u0002\u001a\u00020\f2\n\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u0002¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0017\u0010\u009f\u0002\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010\u009e\u0002R\u0018\u0010£\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u0018\u0010¥\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¢\u0002R\u0018\u0010¦\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010¢\u0002R\u0018\u0010ª\u0002\u001a\u00030§\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u0018\u0010®\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u0018\u0010°\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010\u00ad\u0002R\u0018\u0010²\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010\u00ad\u0002R\u0018\u0010´\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010³\u0002R\u0017\u0010µ\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010rR\u0017\u0010¶\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010rR\u0017\u0010·\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010rR\u0017\u0010¸\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010rR\u0017\u0010¹\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010rR\u0017\u0010º\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010rR\u0017\u0010»\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010rR\u0017\u0010¼\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010rR\u0017\u0010½\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010rR\u0017\u0010¾\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010rR\u0017\u0010¿\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010rR\u0017\u0010À\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010rR\u0017\u0010Á\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010rR\u0017\u0010Â\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010rR\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010rR\u0017\u0010Ã\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010rR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010rR\u0017\u0010Æ\u0002\u001a\u00030Ä\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010Å\u0002R\u0017\u0010É\u0002\u001a\u00030Ç\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010È\u0002R\u0015\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010Ê\u0002R\u0016\u0010Ë\u0002\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b^\u0010Ê\u0002R\u001b\u0010Î\u0002\u001a\u0005\u0018\u00010Ì\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010Í\u0002R\u0017\u0010Ï\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010rR\u0018\u0010Ð\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010rR\u0018\u0010Ñ\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010rR\u0017\u0010Ò\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010rR\u0017\u0010\u0089\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010rR\u0017\u0010Ó\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010rR\u0017\u0010Ô\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010bR\u0019\u0010Ö\u0002\u001a\u00030Õ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010UR\u0018\u0010×\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0083\u0001R\u0019\u0010Ù\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0002\u0010\u0083\u0001R \u0010Þ\u0002\u001a\u00030Ú\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b9\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u001e\u0010à\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010ß\u0002R\u0017\u0010á\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010rR\u0017\u0010â\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010rR\u0017\u0010ã\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010rR\u0017\u0010\u0095\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010rR3\u0010ë\u0002\u001a\u00030ä\u00022\b\u0010å\u0002\u001a\u00030ä\u00028\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b?\u0010æ\u0002\u001a\u0006\bç\u0002\u0010è\u0002\"\u0006\bé\u0002\u0010ê\u0002R.\u0010î\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\bH\u0010r\u001a\u0005\bì\u0002\u0010)\"\u0005\bí\u0002\u0010kR.\u0010ð\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\bo\u0010r\u001a\u0005\bï\u0002\u0010)\"\u0005\b½\u0001\u0010kR1\u0010ñ\u0002\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u0083\u0001\u001a\u0006\bñ\u0002\u0010\u008c\u0001\"\u0005\bò\u0002\u0010!R/\u0010ô\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010r\u001a\u0005\bó\u0002\u0010)\"\u0005\bÀ\u0001\u0010kR3\u0010û\u0002\u001a\u00030õ\u00022\b\u0010å\u0002\u001a\u00030õ\u00028\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b_\u0010ö\u0002\u001a\u0006\b÷\u0002\u0010ø\u0002\"\u0006\bù\u0002\u0010ú\u0002R.\u0010þ\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010r\u001a\u0005\bü\u0002\u0010)\"\u0005\bý\u0002\u0010kR/\u0010\u0081\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bõ\u0001\u0010r\u001a\u0005\bÿ\u0002\u0010)\"\u0005\b\u0080\u0003\u0010kR/\u0010\u0083\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bö\u0001\u0010r\u001a\u0005\b\u0082\u0003\u0010)\"\u0005\bÐ\u0001\u0010kR/\u0010\u0086\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0003\u0010r\u001a\u0005\b\u0085\u0003\u0010)\"\u0005\bÒ\u0001\u0010kR\u0019\u0010Ã\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010\u0083\u0001R\u001c\u0010\u0089\u0003\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0003\u0010\u0088\u0003R\u001c\u0010\u008a\u0003\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010\u0088\u0003R1\u0010\u008e\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0003\u0010\u0083\u0001\u001a\u0006\b\u008c\u0003\u0010\u008c\u0001\"\u0005\b\u008d\u0003\u0010!R.\u0010\u000f\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u0010r\u001a\u0005\b\u008f\u0003\u0010)\"\u0005\b\u0090\u0003\u0010kR/\u0010\u0093\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0003\u0010r\u001a\u0005\b\u0092\u0003\u0010)\"\u0005\bÔ\u0001\u0010kR1\u0010\u0097\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0094\u0003\u0010\u0083\u0001\u001a\u0006\b\u0095\u0003\u0010\u008c\u0001\"\u0005\b\u0096\u0003\u0010!R0\u0010\u0098\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\be\u0010\u0083\u0001\u001a\u0006\b\u0098\u0003\u0010\u008c\u0001\"\u0005\b\u0099\u0003\u0010!R0\u0010\u009c\u0003\u001a\u00020\b2\t\b\u0001\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b6\u0010r\u001a\u0005\b\u009a\u0003\u0010)\"\u0005\b\u009b\u0003\u0010kR/\u0010\u009f\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0003\u0010r\u001a\u0005\b\u009e\u0003\u0010)\"\u0005\bØ\u0001\u0010kR4\u0010§\u0003\u001a\u00030 \u00032\b\u0010å\u0002\u001a\u00030 \u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0003\u0010¢\u0003\u001a\u0006\b£\u0003\u0010¤\u0003\"\u0006\b¥\u0003\u0010¦\u0003R/\u0010ª\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0003\u0010r\u001a\u0005\b©\u0003\u0010)\"\u0005\bÚ\u0001\u0010kR4\u0010²\u0003\u001a\u00030«\u00032\b\u0010å\u0002\u001a\u00030«\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0003\u0010\u00ad\u0003\u001a\u0006\b®\u0003\u0010¯\u0003\"\u0006\b°\u0003\u0010±\u0003R/\u0010µ\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0003\u0010r\u001a\u0005\b´\u0003\u0010)\"\u0005\bÜ\u0001\u0010kR1\u0010·\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b¶\u0003\u0010\u0083\u0001\u001a\u0006\b·\u0003\u0010\u008c\u0001\"\u0005\b¸\u0003\u0010!R1\u0010¼\u0003\u001a\u00020\b2\t\b\u0001\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b¹\u0003\u0010r\u001a\u0005\bº\u0003\u0010)\"\u0005\b»\u0003\u0010kR/\u0010ß\u0001\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0003\u0010r\u001a\u0005\b¾\u0003\u0010)\"\u0005\b¿\u0003\u0010kR4\u0010Ç\u0003\u001a\u00030À\u00032\b\u0010å\u0002\u001a\u00030À\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÁ\u0003\u0010Â\u0003\u001a\u0006\bÃ\u0003\u0010Ä\u0003\"\u0006\bÅ\u0003\u0010Æ\u0003R\u001d\u0010Ê\u0003\u001a\u00020\b8\u0006X\u0086D¢\u0006\u000e\n\u0005\bÈ\u0003\u0010r\u001a\u0005\bÉ\u0003\u0010)R\u001a\u0010Í\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bË\u0003\u0010r\u001a\u0005\bÌ\u0003\u0010)R\u001a\u0010Ð\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bÎ\u0003\u0010r\u001a\u0005\bÏ\u0003\u0010)R\u001a\u0010Ó\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bÑ\u0003\u0010r\u001a\u0005\bÒ\u0003\u0010)R\u001a\u0010Ö\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bÔ\u0003\u0010r\u001a\u0005\bÕ\u0003\u0010)R1\u0010Ø\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b×\u0003\u0010\u0083\u0001\u001a\u0006\bØ\u0003\u0010\u008c\u0001\"\u0005\bÙ\u0003\u0010!R4\u0010Ý\u0003\u001a\u00030À\u00032\b\u0010å\u0002\u001a\u00030À\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÚ\u0003\u0010Â\u0003\u001a\u0006\bÛ\u0003\u0010Ä\u0003\"\u0006\bÜ\u0003\u0010Æ\u0003R1\u0010á\u0003\u001a\u00020\u001a2\u0007\u0010å\u0002\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bÞ\u0003\u0010b\u001a\u0006\bß\u0003\u0010\u0084\u0002\"\u0006\bà\u0003\u0010¾\u0001R1\u0010å\u0003\u001a\u00020\u001a2\u0007\u0010å\u0002\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bâ\u0003\u0010b\u001a\u0006\bã\u0003\u0010\u0084\u0002\"\u0006\bä\u0003\u0010¾\u0001R1\u0010ç\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bæ\u0003\u0010\u0083\u0001\u001a\u0006\bç\u0003\u0010\u008c\u0001\"\u0005\bè\u0003\u0010!R(\u0010ê\u0003\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bé\u0003\u0010\u0083\u0001\u001a\u0006\bê\u0003\u0010\u008c\u0001\"\u0005\bë\u0003\u0010!R\u0018\u0010\u0097\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bì\u0003\u0010rR\u0018\u0010\u0096\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bí\u0003\u0010rR\u001a\u0010ð\u0003\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0003\u0010ï\u0003R4\u0010ø\u0003\u001a\u00030ñ\u00032\b\u0010å\u0002\u001a\u00030ñ\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bò\u0003\u0010ó\u0003\u001a\u0006\bô\u0003\u0010õ\u0003\"\u0006\bö\u0003\u0010÷\u0003R4\u0010ü\u0003\u001a\u00030ñ\u00032\b\u0010å\u0002\u001a\u00030ñ\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bù\u0003\u0010ó\u0003\u001a\u0006\bú\u0003\u0010õ\u0003\"\u0006\bû\u0003\u0010÷\u0003R/\u0010ÿ\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bý\u0003\u0010r\u001a\u0005\bþ\u0003\u0010)\"\u0005\bá\u0001\u0010kR/\u0010\u0082\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0004\u0010r\u001a\u0005\b\u0081\u0004\u0010)\"\u0005\bâ\u0001\u0010kR/\u0010\u0085\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0004\u0010r\u001a\u0005\b\u0084\u0004\u0010)\"\u0005\bë\u0001\u0010kR/\u0010\u0088\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0004\u0010r\u001a\u0005\b\u0087\u0004\u0010)\"\u0005\bí\u0001\u0010kR/\u0010\u008c\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0004\u0010r\u001a\u0005\b\u008a\u0004\u0010)\"\u0005\b\u008b\u0004\u0010kR/\u0010\u0090\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0004\u0010r\u001a\u0005\b\u008e\u0004\u0010)\"\u0005\b\u008f\u0004\u0010kR/\u0010\u0094\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0004\u0010r\u001a\u0005\b\u0092\u0004\u0010)\"\u0005\b\u0093\u0004\u0010kR/\u0010\u0098\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0004\u0010r\u001a\u0005\b\u0096\u0004\u0010)\"\u0005\b\u0097\u0004\u0010kR\u001c\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0092\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0004\u0010\u009a\u0004R\u001c\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0004\u0010\u009c\u0004R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0004\u0010\u009e\u0004R+\u0010³\u0001\u001a\u0014\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\u0017\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0004\u0010 \u0004R5\u0010£\u0004\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0004\u0010¢\u0004R'\u0010¨\u0004\u001a\t\u0012\u0004\u0012\u00020\u001a0¤\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0004\u0010Û\u0002\u001a\u0006\b¦\u0004\u0010§\u0004R\u0018\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0004\u0010\u0083\u0001¨\u0006¯\u0004"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/view/View;", "Ljava/lang/Runnable;", "Ll/l01$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "f0", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "visibleItems", "k", "(I)I", "i0", "(Landroid/content/Context;)V", "g0", "()V", "D0", "", "measureText", "textWidth", "", "G0", "(Ljava/lang/String;I)F", "B", "", "isDataSetChanged", "A", "(Z)V", "r", BaseSei.f13930X, "u", "itemText", Constants.KEY_T, "(Ljava/lang/String;)I", ResourceDirection.f38808v, "()I", BaseSei.f13932Z, "q", "w", "p", "n", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/l01;", "adapter", "q0", "(Ll/l01;)I", "r0", BaseSei.f13931Y, "S0", "Landroid/graphics/Canvas;", "canvas", "P", "(Landroid/graphics/Canvas;)V", "corners", "X", "(Landroid/graphics/Canvas;I)V", j6f.LATITUDE_SOUTH, j6f.GPS_MEASUREMENT_INTERRUPTED, j6f.GPS_DIRECTION_TRUE, "U", "oriText", "E", "(Ljava/lang/String;)Ljava/lang/String;", FirebaseAnalytics.Param.INDEX, "scrolledOffset", "scrolledItem", "W", "(Landroid/graphics/Canvas;III)V", "text", "clipTop", "clipBottom", "item2CenterOffsetY", "centerToBaselineY", "K", "(Landroid/graphics/Canvas;Ljava/lang/String;IIII)V", "Q", "rotateX", "offsetY", "offsetZ", "J", "(Landroid/graphics/Canvas;Ljava/lang/String;IIFFFI)V", "R", "(Landroid/graphics/Canvas;Ljava/lang/String;FFFI)V", "a0", "Landroid/graphics/Paint;", "paint", b2s.C_ZONE, "(Landroid/graphics/Paint;)I", "D", "F0", "j0", "C0", "F", "Landroid/widget/OverScroller;", "scroller", "R0", "(Landroid/widget/OverScroller;)V", "isAnimate", "j", "deltaY", RXScreenCaptureService.KEY_INDEX, "(I)V", "distance", "N", "L", "k0", "w0", "B0", "I", "(Ll/l01;)Z", "position", "o", "dataHeight", "deltaDistance", BLiveStormDanmakuGiftResourceType.f44444l, "(II)I", "remainder", "m", "getCurrentPosition", "o0", "(I)Z", "c0", "M", "Y", "isMarkForceFinish", "Z", Constants.INAPP_DATA_TAG, "H", "s0", "u0", "v0", "t0", "G", "p0", "()Z", "m0", "n0", "(ILl/l01;)Z", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "overRangeMode", "E0", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "onDetachedFromWindow", "selectedPosition", "minSelectedPosition", "maxSelectedPosition", "h0", "(III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "run", "a", "", "data", "setData", "(Ljava/util/List;)V", "setAdapter", "(Ll/l01;)V", "getAdapter", "()Ll/l01;", "Ll/vii0;", "textFormatter", "setTextFormatter", "(Ll/vii0;)V", "Lkotlin/Function1;", "", "formatterBlock", "(Lkotlin/jvm/functions/Function1;)V", "Ll/w4q;", "itemIndexer", "setItemIndexer", "(Ll/w4q;)V", "Lkotlin/Function2;", "indexerBlock", "(Lkotlin/jvm/functions/Function2;)V", "textSizeSp", "setTextSize", "(F)V", "minTextSizeSp", "setMinTextSize", "Landroid/graphics/Typeface;", "typeface", "isBoldForSelectedItem", "O0", "(Landroid/graphics/Typeface;Z)V", "normalColorRes", "setNormalTextColorRes", "selectedColorRes", "setSelectedTextColorRes", "str", "setPrefixText", "(Ljava/lang/String;)V", "textPaddingDp", "setTextPadding", "textPaddingLeftDp", "setTextPaddingLeft", "textPaddingRightDp", "setTextPaddingRight", "lineSpacingDp", "setLineSpacing", "dividerColorRes", "setDividerColorRes", "dividerHeightDp", "setDividerHeight", "dividerPaddingDp", "setDividerPadding", "offsetYDp", "setDividerOffsetY", "curtainColorRes", "setCurtainColorRes", "curtainRadius", "setCurtainColorRadius", "setLeftTextSize", "setRightTextSize", "setLeftTypeface", "(Landroid/graphics/Typeface;)V", "setRightTypeface", "leftTextColorRes", "setLeftTextColorRes", "rightTextColorRes", "setRightTextColorRes", "marginRightDp", "setLeftTextMarginRight", "marginLeftDp", "setRightTextMarginLeft", "isSmoothScroll", "smoothDuration", "K0", "(IZI)V", "min", Constants.PRIORITY_MAX, "M0", "H0", "I0", "(IILcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "getSelectedPosition", "getSelectedItem", "()Ljava/lang/Object;", "b0", "(I)Ljava/lang/Object;", "getItemCount", Item.TYPE, "isCompareFormatText", "d0", "(Ljava/lang/Object;Z)I", "getItemHeight", "getSoundVolume", "()F", "playVolume", "setSoundVolume", "soundRes", "setSoundResource", "scrollOffsetY", "z0", "state", "A0", "y0", "(Ll/l01;I)V", "oldPosition", "newPosition", "x0", "Ll/ie50;", "itemSelectedListener", "setOnItemSelectedListener", "(Ll/ie50;)V", "Ll/he50;", "itemPositionChangedListener", "setOnItemPositionChangedListener", "(Ll/he50;)V", "Ll/if50;", "scrollChangedListener", "setOnScrollChangedListener", "(Ll/if50;)V", "Landroid/graphics/Paint;", "normalPaint", "Landroid/text/TextPaint;", "b", "Landroid/text/TextPaint;", "mainTextPaint", "c", "leftTextPaint", "rightTextPaint", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "path", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "mainTextRect", "g", "leftTextRect", "h", "rightTextRect", "Ljava/lang/String;", "prefixText", "mainTextMaxWidth", "originTextMaxWidth", "leftTextWidth", "rightTextWidth", "itemHeight", "mainTextHeight", "leftTextHeight", "rightTextHeight", "curvedArcWidth", "textDrawStartX", "centerY", "selectedItemTopLimit", "selectedItemBottomLimit", "clipLeft", "clipRight", "Landroid/graphics/Camera;", "Landroid/graphics/Camera;", "cameraForCurved", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrixForCurved", "Landroid/widget/OverScroller;", "adjustScroller", "Landroid/view/VelocityTracker;", "Landroid/view/VelocityTracker;", "velocityTracker", "maxFlingVelocity", "minFlingVelocity", "minScrollY", "maxScrollY", "scrolledY", "lastTouchY", "", "downStartTime", "isForceFinishScroll", BloodType.f38728O, "isFlingScroll", "Ll/vlf0;", "Lkotlin/Lazy;", "getSoundHelper", "()Ll/vlf0;", "soundHelper", "Ll/l01;", "wheelAdapter", "currentScrollPosition", "itemChangedPosition", "currentScrollState", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "value", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "getMaxTextWidthMeasureType", "()Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "setMaxTextWidthMeasureType", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;)V", "maxTextWidthMeasureType", "getGravity", "setGravity", "gravity", "getTextSize", "textSize", "isAutoFitTextSize", "setAutoFitTextSize", "getMinTextSize", "minTextSize", "Landroid/graphics/Paint$Align;", "Landroid/graphics/Paint$Align;", "getTextAlign", "()Landroid/graphics/Paint$Align;", "setTextAlign", "(Landroid/graphics/Paint$Align;)V", "textAlign", "getNormalTextColor", "setNormalTextColor", "normalTextColor", "getSelectedTextColor", "setSelectedTextColor", "selectedTextColor", "getTextPaddingLeft", "textPaddingLeft", "J0", "getTextPaddingRight", "textPaddingRight", "L0", "Landroid/graphics/Typeface;", "normalTypeface", "boldTypeface", "N0", "getDrawDebugRectEnabled", "setDrawDebugRectEnabled", "drawDebugRectEnabled", "getVisibleItems", "setVisibleItems", "P0", "getLineSpacing", "lineSpacing", "Q0", "l0", "setCyclic", "isCyclic", "isShowDivider", "setShowDivider", "getDividerColor", "setDividerColor", "dividerColor", "T0", "getDividerHeight", "dividerHeight", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "U0", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "getDividerType", "()Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "setDividerType", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;)V", "dividerType", "V0", "getDividerPadding", "dividerPadding", "Landroid/graphics/Paint$Cap;", "W0", "Landroid/graphics/Paint$Cap;", "getDividerCap", "()Landroid/graphics/Paint$Cap;", "setDividerCap", "(Landroid/graphics/Paint$Cap;)V", "dividerCap", "X0", "getDividerOffsetY", "dividerOffsetY", "Y0", "isShowCurtain", "setShowCurtain", "Z0", "getCurtainColor", "setCurtainColor", "curtainColor", "a1", "getCurtainRadius", "setCurtainRadius", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "b1", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "getDirection", "()Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "setDirection", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;)V", "direction", "c1", "getCORNER_TOP_LEFT", "CORNER_TOP_LEFT", "d1", "getCORNER_TOP_RIGHT", "CORNER_TOP_RIGHT", "e1", "getCORNER_BOTTOM_LEFT", "CORNER_BOTTOM_LEFT", "f1", "getCORNER_BOTTOM_RIGHT", "CORNER_BOTTOM_RIGHT", "g1", "getCORNER_ALL", "CORNER_ALL", "h1", "isCurved", "setCurved", "i1", "getCurvedArcDirection", "setCurvedArcDirection", "curvedArcDirection", "j1", "getCurvedArcDirectionFactor", "setCurvedArcDirectionFactor", "curvedArcDirectionFactor", "k1", "getRefractRatio", "setRefractRatio", "refractRatio", "l1", "isSoundEffect", "setSoundEffect", "m1", "isResetSelectedPosition", "setResetSelectedPosition", "n1", "o1", "p1", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "mOverRangeMode", "", "q1", "Ljava/lang/CharSequence;", "getLeftText", "()Ljava/lang/CharSequence;", "setLeftText", "(Ljava/lang/CharSequence;)V", "leftText", "r1", "getRightText", "setRightText", "rightText", "s1", "getLeftTextSize", "leftTextSize", "t1", "getRightTextSize", "rightTextSize", "u1", "getLeftTextMarginRight", "leftTextMarginRight", "v1", "getRightTextMarginLeft", "rightTextMarginLeft", "w1", "getLeftTextColor", "setLeftTextColor", "leftTextColor", "x1", "getRightTextColor", "setRightTextColor", "rightTextColor", "y1", "getLeftTextGravity", "setLeftTextGravity", "leftTextGravity", "z1", "getRightTextGravity", "setRightTextGravity", "rightTextGravity", "A1", "Ll/ie50;", "B1", "Ll/if50;", "C1", "Ll/vii0;", "D1", "Lkotlin/jvm/functions/Function1;", "E1", "Lkotlin/jvm/functions/Function2;", "itemIndexerBlock", "Landroid/util/SparseArray;", "F1", "getResizeArray", "()Landroid/util/SparseArray;", "resizeArray", "G1", "Companion", "CurvedArcDirection", "DividerType", "MeasureType", "OverRangeMode", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class WheelView extends View implements Runnable, l01.InterfaceC18123a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: H1 */
    public static final int f54312H1 = m79428O(2.0f);

    /* JADX INFO: renamed from: I1 */
    public static final int f54313I1 = m79430Q0(15.0f);

    /* JADX INFO: renamed from: J1 */
    public static final int f54314J1 = m79430Q0(6.0f);

    /* JADX INFO: renamed from: K1 */
    public static final int f54315K1 = m79428O(2.0f);

    /* JADX INFO: renamed from: L1 */
    public static final int f54316L1 = m79428O(1.0f);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Camera cameraForCurved;

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    @Nullable
    public ie50 itemSelectedListener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Matrix matrixForCurved;

    /* JADX INFO: renamed from: B1, reason: from kotlin metadata */
    @Nullable
    public if50 scrollChangedListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final OverScroller scroller;

    /* JADX INFO: renamed from: C1, reason: from kotlin metadata */
    @Nullable
    public vii0 textFormatter;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final OverScroller adjustScroller;

    /* JADX INFO: renamed from: D1, reason: from kotlin metadata */
    @Nullable
    public Function1<Object, String> formatterBlock;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public VelocityTracker velocityTracker;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public int minTextSize;

    /* JADX INFO: renamed from: E1, reason: from kotlin metadata */
    @Nullable
    public Function2<? super l01<?>, Object, Integer> itemIndexerBlock;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int maxFlingVelocity;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @NotNull
    public Paint.Align textAlign;

    /* JADX INFO: renamed from: F1, reason: from kotlin metadata */
    @NotNull
    public final Lazy resizeArray;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int minFlingVelocity;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @ColorInt
    public int normalTextColor;

    /* JADX INFO: renamed from: G1, reason: from kotlin metadata */
    public boolean isDataSetChanged;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int minScrollY;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @ColorInt
    public int selectedTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int maxScrollY;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public int textPaddingLeft;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public int scrollOffsetY;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public int textPaddingRight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int scrolledY;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public boolean isBoldForSelectedItem;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public float lastTouchY;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @Nullable
    public Typeface normalTypeface;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public long downStartTime;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @Nullable
    public Typeface boldTypeface;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isForceFinishScroll;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public boolean drawDebugRectEnabled;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isFlingScroll;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public int visibleItems;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public final Lazy soundHelper;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public int lineSpacing;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public l01<?> wheelAdapter;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public boolean isCyclic;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int currentScrollPosition;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public boolean isShowDivider;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public int itemChangedPosition;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public int dividerColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int currentScrollState;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public int dividerHeight;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int selectedPosition;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @NotNull
    public DividerType dividerType;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public MeasureType maxTextWidthMeasureType;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public int dividerPadding;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public int gravity;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @NotNull
    public Paint.Cap dividerCap;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public int dividerOffsetY;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public boolean isShowCurtain;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @ColorInt
    public int curtainColor;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Paint normalPaint;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public int curtainRadius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TextPaint mainTextPaint;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    @NotNull
    public CurvedArcDirection direction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final TextPaint leftTextPaint;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public final int CORNER_TOP_LEFT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final TextPaint rightTextPaint;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public final int CORNER_TOP_RIGHT;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Path path;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    public final int CORNER_BOTTOM_LEFT;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Rect mainTextRect;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    public final int CORNER_BOTTOM_RIGHT;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Rect leftTextRect;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public final int CORNER_ALL;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Rect rightTextRect;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    public boolean isCurved;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String prefixText;

    /* JADX INFO: renamed from: i1, reason: from kotlin metadata */
    @NotNull
    public CurvedArcDirection curvedArcDirection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int mainTextMaxWidth;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    public float curvedArcDirectionFactor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int originTextMaxWidth;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public int textSize;

    /* JADX INFO: renamed from: k1, reason: from kotlin metadata */
    public float refractRatio;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int leftTextWidth;

    /* JADX INFO: renamed from: l1, reason: from kotlin metadata */
    public boolean isSoundEffect;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int rightTextWidth;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    public boolean isResetSelectedPosition;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int itemHeight;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    public int maxSelectedPosition;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int mainTextHeight;

    /* JADX INFO: renamed from: o1, reason: from kotlin metadata */
    public int minSelectedPosition;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int leftTextHeight;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public boolean isAutoFitTextSize;

    /* JADX INFO: renamed from: p1, reason: from kotlin metadata */
    @NotNull
    public OverRangeMode mOverRangeMode;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int rightTextHeight;

    /* JADX INFO: renamed from: q1, reason: from kotlin metadata */
    @NotNull
    public CharSequence leftText;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int curvedArcWidth;

    /* JADX INFO: renamed from: r1, reason: from kotlin metadata */
    @NotNull
    public CharSequence rightText;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int textDrawStartX;

    /* JADX INFO: renamed from: s1, reason: from kotlin metadata */
    public int leftTextSize;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int centerY;

    /* JADX INFO: renamed from: t1, reason: from kotlin metadata */
    public int rightTextSize;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int selectedItemTopLimit;

    /* JADX INFO: renamed from: u1, reason: from kotlin metadata */
    public int leftTextMarginRight;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int selectedItemBottomLimit;

    /* JADX INFO: renamed from: v1, reason: from kotlin metadata */
    public int rightTextMarginLeft;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int clipLeft;

    /* JADX INFO: renamed from: w1, reason: from kotlin metadata */
    public int leftTextColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int clipTop;

    /* JADX INFO: renamed from: x1, reason: from kotlin metadata */
    public int rightTextColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public int clipRight;

    /* JADX INFO: renamed from: y1, reason: from kotlin metadata */
    public int leftTextGravity;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int clipBottom;

    /* JADX INFO: renamed from: z1, reason: from kotlin metadata */
    public int rightTextGravity;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum CurvedArcDirection {
        LEFT,
        CENTER,
        RIGHT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<CurvedArcDirection> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "WRAP", "WRAP_ALL", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum DividerType {
        FILL,
        WRAP,
        WRAP_ALL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<DividerType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "", "<init>", "(Ljava/lang/String;I)V", "SAME_WIDTH", "MAX_LENGTH", RelationshipStatus.DEFAULT, "SAME_WIDTH_WITH_NUM", "MAX_LENGTH_WITH_NUM", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum MeasureType {
        SAME_WIDTH,
        MAX_LENGTH,
        DEFAULT,
        SAME_WIDTH_WITH_NUM,
        MAX_LENGTH_WITH_NUM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<MeasureType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "CANT_SCROLL", "HIDE_ITEM", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum OverRangeMode {
        NORMAL,
        CANT_SCROLL,
        HIDE_ITEM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<OverRangeMode> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.datepicker.WheelView$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u0003R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010$\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0014\u0010'\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0014\u0010,\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020-8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u001dR\u0014\u00103\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u001dR\u0014\u00104\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u001dR\u0014\u00105\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u001dR\u0014\u00106\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u001dR\u0014\u00107\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u001dR\u0014\u00108\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u001dR\u0014\u00109\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u001dR\u0014\u0010:\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u001dR\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u00101R\u0014\u0010<\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u001dR\u0014\u0010=\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u001dR\u0014\u0010>\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u001dR\u0014\u0010?\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u001dR\u0014\u0010@\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u001dR\u0014\u0010A\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u001dR\u0014\u0010B\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u001dR\u0014\u0010C\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u001d¨\u0006D"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$a;", "", "<init>", "()V", "", "dp", "", "f", "(F)I", "sp", BLiveStormDanmakuGiftResourceType.f44444l, "gravity", "e", "(I)I", "align", "Landroid/graphics/Paint$Align;", Constants.INAPP_DATA_TAG, "(I)Landroid/graphics/Paint$Align;", "direction", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "b", "(I)Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "dividerType", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "c", "(I)Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "", "k", "DEFAULT_LINE_SPACING", "I", "h", "()I", "DEFAULT_TEXT_SIZE", "j", "DEFAULT_TEXT_PADDING", RXScreenCaptureService.KEY_INDEX, "DEFAULT_DIVIDER_HEIGHT", "g", "", "TAG", "Ljava/lang/String;", "DEFAULT_NORMAL_TEXT_COLOR", "DEFAULT_SELECTED_TEXT_COLOR", "DEFAULT_VISIBLE_ITEM", "DEFAULT_SCROLL_DURATION", "", "DEFAULT_CLICK_CONFIRM", "J", "DEFAULT_REFRACT_RATIO", "F", "TEXT_ALIGN_LEFT", "TEXT_ALIGN_CENTER", "TEXT_ALIGN_RIGHT", "SCROLL_STATE_IDLE", "SCROLL_STATE_DRAGGING", "SCROLL_STATE_SCROLLING", "CURVED_ARC_DIRECTION_LEFT", "CURVED_ARC_DIRECTION_CENTER", "CURVED_ARC_DIRECTION_RIGHT", "DEFAULT_CURVED_FACTOR", "DIVIDER_FILL", "DIVIDER_WRAP", "DIVIDER_WRAP_ALL", "MEASURED_BY_SAME_WIDTH", "MEASURED_BY_MAX_LENGTH", "MEASURED_BY_DEFAULT", "MEASURED_BY_SAME_WIDTH_WITH_NUM", "MEASURED_BY_MAX_LENGTH_WITH_NUM", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final CurvedArcDirection m79523b(int direction) {
            if (direction != 0) {
                return direction != 2 ? CurvedArcDirection.CENTER : CurvedArcDirection.RIGHT;
            }
            return CurvedArcDirection.LEFT;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final DividerType m79524c(int dividerType) {
            if (dividerType != 1) {
                return dividerType != 2 ? DividerType.FILL : DividerType.WRAP_ALL;
            }
            return DividerType.WRAP;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final Paint.Align m79525d(int align) {
            if (align != 0) {
                return align != 2 ? Paint.Align.CENTER : Paint.Align.RIGHT;
            }
            return Paint.Align.LEFT;
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final int m79526e(int gravity) {
            if (gravity != 1) {
                return gravity != 2 ? 17 : 80;
            }
            return 48;
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final int m79527f(float dp) {
            return (int) TypedValue.applyDimension(1, dp, Resources.getSystem().getDisplayMetrics());
        }

        /* JADX INFO: renamed from: g */
        public final int m79528g() {
            return WheelView.f54316L1;
        }

        /* JADX INFO: renamed from: h */
        public final int m79529h() {
            return WheelView.f54312H1;
        }

        /* JADX INFO: renamed from: i */
        public final int m79530i() {
            return WheelView.f54315K1;
        }

        /* JADX INFO: renamed from: j */
        public final int m79531j() {
            return WheelView.f54313I1;
        }

        /* JADX INFO: renamed from: k */
        public final void m79532k() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final int m79533l(float sp) {
            return (int) TypedValue.applyDimension(2, sp, Resources.getSystem().getDisplayMetrics());
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.datepicker.WheelView$b */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$b;", "Landroid/view/animation/Interpolator;", "<init>", "()V", "", "input", "getInterpolation", "(F)F", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class InterpolatorC13104b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float input) {
            float f = input - 1.0f;
            return (f * f * f * f * f) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.datepicker.WheelView$c */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C13105c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54423a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f54424b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f54425c;

        static {
            int[] iArr = new int[Paint.Align.values().length];
            try {
                iArr[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Align.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54423a = iArr;
            int[] iArr2 = new int[CurvedArcDirection.values().length];
            try {
                iArr2[CurvedArcDirection.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CurvedArcDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CurvedArcDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f54424b = iArr2;
            int[] iArr3 = new int[DividerType.values().length];
            try {
                iArr3[DividerType.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DividerType.WRAP_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f54425c = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.normalPaint = new Paint(1);
        this.mainTextPaint = new TextPaint(1);
        TextPaint textPaint = new TextPaint(1);
        this.leftTextPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.rightTextPaint = textPaint2;
        this.path = new Path();
        this.mainTextRect = new Rect();
        this.leftTextRect = new Rect();
        this.rightTextRect = new Rect();
        this.prefixText = "";
        this.cameraForCurved = new Camera();
        this.matrixForCurved = new Matrix();
        this.scroller = new OverScroller(context, new InterpolatorC13104b());
        this.adjustScroller = new OverScroller(context, new DecelerateInterpolator(2.5f));
        this.soundHelper = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.b5q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelView.m79431b();
            }
        });
        this.itemChangedPosition = -1;
        this.maxTextWidthMeasureType = MeasureType.DEFAULT;
        this.gravity = 17;
        int i2 = f54313I1;
        this.textSize = i2;
        this.minTextSize = f54314J1;
        Paint.Align align = Paint.Align.CENTER;
        this.textAlign = align;
        this.normalTextColor = -12303292;
        this.selectedTextColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
        int i3 = f54315K1;
        this.textPaddingLeft = i3;
        this.textPaddingRight = i3;
        this.visibleItems = 5;
        this.lineSpacing = f54312H1;
        this.dividerColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.dividerHeight = f54316L1;
        this.dividerType = DividerType.FILL;
        this.dividerCap = Paint.Cap.ROUND;
        CurvedArcDirection curvedArcDirection = CurvedArcDirection.CENTER;
        this.direction = curvedArcDirection;
        this.CORNER_TOP_LEFT = 1;
        this.CORNER_TOP_RIGHT = 2;
        this.CORNER_BOTTOM_LEFT = 4;
        this.CORNER_BOTTOM_RIGHT = 8;
        this.CORNER_ALL = 2 | 1 | 12;
        this.isCurved = true;
        this.curvedArcDirection = curvedArcDirection;
        this.curvedArcDirectionFactor = 0.75f;
        this.refractRatio = 1.0f;
        this.maxSelectedPosition = -1;
        this.minSelectedPosition = -1;
        this.mOverRangeMode = OverRangeMode.NORMAL;
        this.leftText = "";
        this.rightText = "";
        this.leftTextSize = i2;
        this.rightTextSize = i2;
        this.leftTextColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.rightTextColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.leftTextGravity = 17;
        this.rightTextGravity = 17;
        this.resizeArray = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.c5q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelView.m79432c();
            }
        });
        m79487i0(context);
        textPaint.setTextAlign(align);
        textPaint2.setTextAlign(align);
        if (attributeSet != null) {
            m79483f0(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m79425J0(WheelView wheelView, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: setSelectableRange");
            return;
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        wheelView.m79453H0(i, i2);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m79426L0(WheelView wheelView, int i, boolean z, int i2, int i3, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: setSelectedPosition");
            return;
        }
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 250;
        }
        wheelView.m79458K0(i, z, i2);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m79427N0(WheelView wheelView, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: setSelectedRange");
            return;
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        wheelView.m79461M0(i, i2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: O */
    public static final int m79428O(float f) {
        return INSTANCE.m79527f(f);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m79429P0(WheelView wheelView, Typeface typeface, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: setTypeface");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        wheelView.m79463O0(typeface, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: Q0 */
    public static final int m79430Q0(float f) {
        return INSTANCE.m79533l(f);
    }

    /* JADX INFO: renamed from: b */
    public static vlf0 m79431b() {
        return vlf0.INSTANCE.m198802a();
    }

    /* JADX INFO: renamed from: c */
    public static SparseArray m79432c() {
        return new SparseArray();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ int m79434e0(WheelView wheelView, Object obj, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: indexOf");
            return 0;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wheelView.mo79482d0(obj, z);
    }

    private final int getCurrentPosition() {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var == null) {
            INSTANCE.m79532k();
            return -1;
        }
        if (l01Var.m171097c() == 0) {
            return -1;
        }
        int i = this.scrollOffsetY;
        int i2 = this.itemHeight;
        int iM79460M = (i < 0 ? (i - (i2 / 2)) / m79460M() : (i + (i2 / 2)) / m79460M()) % l01Var.m171097c();
        return iM79460M < 0 ? iM79460M + l01Var.m171097c() : iM79460M;
    }

    private final SparseArray<Float> getResizeArray() {
        return (SparseArray) this.resizeArray.getValue();
    }

    private final vlf0 getSoundHelper() {
        return (vlf0) this.soundHelper.getValue();
    }

    /* JADX INFO: renamed from: A */
    public final void m79438A(boolean isDataSetChanged) {
        int i;
        m79504r();
        m79516x();
        if (isDataSetChanged || (i = this.mainTextMaxWidth) <= 0 || this.originTextMaxWidth != i) {
            m79510u();
        }
        m79500p();
    }

    /* JADX INFO: renamed from: A0 */
    public void m79439A0(int state) {
    }

    /* JADX INFO: renamed from: B */
    public final void m79440B() {
        int i = this.centerY;
        int i2 = this.itemHeight;
        int i3 = this.dividerOffsetY;
        this.selectedItemTopLimit = (i - (i2 / 2)) - i3;
        this.selectedItemBottomLimit = i + (i2 / 2) + i3;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m79441B0() {
        if (this.isSoundEffect) {
            getSoundHelper().m198799c();
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m79442C(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = fontMetrics.ascent;
        return (int) (f + ((fontMetrics.descent - f) / 2.0f));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m79443C0() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
    }

    /* JADX INFO: renamed from: D */
    public final void m79444D() {
        if (this.isBoldForSelectedItem) {
            this.mainTextPaint.setTypeface(this.normalTypeface);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m79445D0() {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            getResizeArray().clear();
            int iM171097c = l01Var.m171097c();
            for (int i = 0; i < iM171097c; i++) {
                String strM147992m = l01Var.m147992m(l01Var.m171098d(i));
                int iMeasureText = (int) this.mainTextPaint.measureText(strM147992m);
                if (iMeasureText > this.mainTextMaxWidth) {
                    getResizeArray().put(i, Float.valueOf(m79451G0(strM147992m, iMeasureText)));
                }
            }
            this.mainTextPaint.setTextSize(this.textSize);
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m79446E(String oriText) {
        String string;
        if (oriText == null || StringsKt.m93433Z0(oriText).toString().length() == 0) {
            return "";
        }
        if (this.isAutoFitTextSize) {
            return oriText;
        }
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(oriText, this.mainTextPaint, this.mainTextMaxWidth, TextUtils.TruncateAt.END);
        return (charSequenceEllipsize == null || (string = charSequenceEllipsize.toString()) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m79447E0(OverRangeMode overRangeMode) {
        OverRangeMode overRangeMode2 = this.mOverRangeMode;
        if (overRangeMode2 == OverRangeMode.HIDE_ITEM || overRangeMode != overRangeMode2) {
            l01<?> l01Var = this.wheelAdapter;
            if (l01Var != null) {
                l01Var.m171105k(-1, -1);
            }
            m79511u0();
        }
        this.mOverRangeMode = overRangeMode;
    }

    /* JADX INFO: renamed from: F */
    public final void m79448F() {
        if (!this.scroller.isFinished() || !this.adjustScroller.isFinished() || this.isForceFinishScroll || this.isFlingScroll || this.itemHeight == 0) {
            return;
        }
        this.currentScrollState = 0;
        m79439A0(0);
        if50 if50Var = this.scrollChangedListener;
        if (if50Var != null) {
            if50Var.mo134809b(this, 0);
        }
        int currentPosition = getCurrentPosition();
        if (currentPosition == this.selectedPosition) {
            return;
        }
        this.selectedPosition = currentPosition;
        this.currentScrollPosition = currentPosition;
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            l01Var.m148001v(currentPosition);
            if (m79454I(l01Var)) {
                m79519y0(l01Var, this.selectedPosition);
                ie50 ie50Var = this.itemSelectedListener;
                if (ie50Var != null) {
                    ie50Var.mo111089c(this, l01Var, this.selectedPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m79449F0() {
        if (this.isBoldForSelectedItem) {
            this.mainTextPaint.setTypeface(this.boldTypeface);
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m79450G(int position) {
        if (!m79501p0()) {
            if (this.mOverRangeMode == OverRangeMode.HIDE_ITEM) {
                int i = this.minSelectedPosition;
                int i2 = this.maxSelectedPosition;
                if (position > i2 || i > position) {
                    return position < i ? i : i2;
                }
                return position - i;
            }
            if (m79495m0(position)) {
                return this.minSelectedPosition;
            }
            l01<?> l01Var = this.wheelAdapter;
            if (l01Var != null && m79497n0(position, l01Var)) {
                return this.maxSelectedPosition;
            }
        }
        return position;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d A[PHI: r0
      0x002d: PHI (r0v6 float) = (r0v5 float), (r0v7 float) binds: [B:8:0x0021, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x003e A[LOOP:0: B:7:0x0016->B:17:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0034 A[SYNTHETIC] */
    /* JADX INFO: renamed from: G0 */
    public final float m79451G0(String measureText, int textWidth) {
        float f;
        float f2 = ((this.mainTextMaxWidth * 1.0f) / textWidth) * this.textSize;
        int i = this.minTextSize;
        if (f2 < i) {
            return i;
        }
        boolean z = true;
        while (true) {
            this.mainTextPaint.setTextSize(f2);
            float fMeasureText = this.mainTextPaint.measureText(measureText);
            if (!z) {
                f2 -= 1.0f;
                int i2 = this.minTextSize;
                if (f2 < i2) {
                    f = i2;
                    break;
                }
                if (fMeasureText <= this.mainTextMaxWidth) {
                    f = f2;
                    break;
                }
                z = false;
            } else {
                if (fMeasureText <= this.mainTextMaxWidth) {
                    f = f2;
                    break;
                }
                z = false;
            }
        }
        this.mainTextPaint.setTextSize(this.textSize);
        return f;
    }

    /* JADX INFO: renamed from: H */
    public final void m79452H() {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var == null) {
            INSTANCE.m79532k();
            return;
        }
        if (this.isResetSelectedPosition || l01Var.m171097c() <= 0) {
            this.selectedPosition = 0;
            this.currentScrollPosition = 0;
            l01Var.m148001v(0);
        } else if (this.selectedPosition >= l01Var.m171097c()) {
            int iM171097c = l01Var.m171097c() - 1;
            this.selectedPosition = iM171097c;
            this.currentScrollPosition = iM171097c;
            l01Var.m148001v(iM171097c);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: H0 */
    public final void m79453H0(@IntRange(from = 0) int min, @IntRange(from = 0) int max) {
        m79455I0(min, max, OverRangeMode.NORMAL);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m79454I(l01<?> adapter) {
        if (!m79501p0() && this.mOverRangeMode != OverRangeMode.HIDE_ITEM) {
            if (m79495m0(this.selectedPosition)) {
                m79426L0(this, this.minSelectedPosition, false, 0, 6, null);
                return false;
            }
            if (m79497n0(this.selectedPosition, adapter)) {
                m79426L0(this, this.maxSelectedPosition, false, 0, 6, null);
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: I0 */
    public final void m79455I0(@IntRange(from = 0) int min, @IntRange(from = 0) int max, @NotNull OverRangeMode overRangeMode) {
        WheelView wheelView;
        overRangeMode.getClass();
        if (max < min) {
            max = min;
        }
        if (min < 0 && max < 0) {
            this.minSelectedPosition = -1;
            this.maxSelectedPosition = -1;
            m79447E0(overRangeMode);
            m79506s();
            return;
        }
        this.minSelectedPosition = Math.max(0, min);
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null && max >= l01Var.m171100f()) {
            max = l01Var.m171100f() - 1;
        }
        this.maxSelectedPosition = max;
        m79447E0(overRangeMode);
        if (overRangeMode == OverRangeMode.HIDE_ITEM) {
            l01<?> l01Var2 = this.wheelAdapter;
            if (l01Var2 != null) {
                l01Var2.m171105k(this.minSelectedPosition, this.maxSelectedPosition);
            }
            m79511u0();
        }
        int i = this.selectedPosition;
        int i2 = this.minSelectedPosition;
        if (i < i2) {
            wheelView = this;
            m79426L0(wheelView, i2, false, 0, 6, null);
        } else {
            wheelView = this;
            int i3 = wheelView.maxSelectedPosition;
            if (i > i3) {
                m79426L0(wheelView, i3, false, 0, 6, null);
            }
        }
        wheelView.m79506s();
    }

    /* JADX INFO: renamed from: J */
    public final void m79456J(Canvas canvas, String text, int clipTop, int clipBottom, float rotateX, float offsetY, float offsetZ, int centerToBaselineY) {
        canvas.save();
        canvas.clipRect(this.clipLeft, clipTop, this.clipRight, clipBottom);
        m79466R(canvas, text, rotateX, offsetY, offsetZ, centerToBaselineY);
        canvas.restore();
    }

    /* JADX INFO: renamed from: K */
    public final void m79457K(Canvas canvas, String text, int clipTop, int clipBottom, int item2CenterOffsetY, int centerToBaselineY) {
        canvas.save();
        canvas.clipRect(this.clipLeft, clipTop, this.clipRight, clipBottom);
        canvas.drawText(text, 0, text.length(), this.textDrawStartX, (this.centerY + item2CenterOffsetY) - centerToBaselineY, (Paint) this.mainTextPaint);
        canvas.restore();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: K0 */
    public final void m79458K0(int position, boolean isSmoothScroll, int smoothDuration) {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var == null || position < 0 || position >= l01Var.m171100f()) {
            return;
        }
        m79481d();
        int iM79450G = m79450G(position);
        int iM79498o = m79498o(iM79450G);
        if (iM79498o == 0) {
            if (this.itemHeight == 0) {
                this.selectedPosition = iM79450G;
                this.currentScrollPosition = iM79450G;
                l01<?> l01Var2 = this.wheelAdapter;
                if (l01Var2 != null) {
                    l01Var2.m148001v(iM79450G);
                    m79519y0(l01Var2, this.selectedPosition);
                    ie50 ie50Var = this.itemSelectedListener;
                    if (ie50Var != null) {
                        ie50Var.mo111089c(this, l01Var2, this.selectedPosition);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (isSmoothScroll) {
            OverScroller overScroller = this.scroller;
            int i = this.scrollOffsetY;
            if (smoothDuration <= 0) {
                smoothDuration = 250;
            }
            overScroller.startScroll(0, i, 0, iM79498o, smoothDuration);
            m79491k0();
            gbl0.m125185b0(this, this);
            return;
        }
        m79462N(iM79498o);
        this.selectedPosition = iM79450G;
        this.currentScrollPosition = iM79450G;
        l01<?> l01Var3 = this.wheelAdapter;
        if (l01Var3 != null) {
            l01Var3.m148001v(iM79450G);
            m79519y0(l01Var3, this.selectedPosition);
            ie50 ie50Var2 = this.itemSelectedListener;
            if (ie50Var2 != null) {
                ie50Var2.mo111089c(this, l01Var3, this.selectedPosition);
            }
        }
        m79491k0();
    }

    /* JADX INFO: renamed from: L */
    public final void m79459L() {
        if (this.isCyclic) {
            return;
        }
        int i = this.scrollOffsetY;
        int i2 = this.minScrollY;
        if (i < i2) {
            this.scrollOffsetY = i2;
            return;
        }
        int i3 = this.maxScrollY;
        if (i > i3) {
            this.scrollOffsetY = i3;
        }
    }

    /* JADX INFO: renamed from: M */
    public final int m79460M() {
        int i = this.itemHeight;
        if (i > 0) {
            return i;
        }
        return 1;
    }

    @Deprecated
    @JvmOverloads
    /* JADX INFO: renamed from: M0 */
    public final void m79461M0(@IntRange(from = 0) int min, @IntRange(from = 0) int max) {
        m79453H0(min, max);
    }

    /* JADX INFO: renamed from: N */
    public final void m79462N(int distance) {
        this.scrollOffsetY += distance;
        m79459L();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: O0 */
    public final void m79463O0(@NotNull Typeface typeface, boolean isBoldForSelectedItem) {
        typeface.getClass();
        if (Intrinsics.m87488d(typeface, this.mainTextPaint.getTypeface()) && isBoldForSelectedItem == this.isBoldForSelectedItem) {
            return;
        }
        this.isBoldForSelectedItem = isBoldForSelectedItem;
        if (isBoldForSelectedItem) {
            if (typeface.isBold()) {
                this.normalTypeface = Typeface.create(typeface, 0);
                this.boldTypeface = typeface;
            } else {
                this.normalTypeface = typeface;
                this.boldTypeface = Typeface.create(typeface, 1);
            }
            this.mainTextPaint.setTypeface(this.boldTypeface);
        } else {
            this.mainTextPaint.setTypeface(typeface);
        }
        m79507s0();
    }

    /* JADX INFO: renamed from: P */
    public final void m79464P(Canvas canvas) {
        if (this.isShowCurtain) {
            this.normalPaint.setColor(this.curtainColor);
            int i = C13105c.f54424b[this.direction.ordinal()];
            if (i == 1) {
                float f = this.clipLeft;
                float f2 = this.selectedItemTopLimit;
                float f3 = this.clipRight;
                float f4 = this.selectedItemBottomLimit;
                int i2 = this.curtainRadius;
                canvas.drawRoundRect(f, f2, f3, f4, i2, i2, this.normalPaint);
                return;
            }
            if (i == 2) {
                m79474X(canvas, this.CORNER_TOP_LEFT | this.CORNER_BOTTOM_LEFT);
            } else if (i == 3) {
                m79474X(canvas, this.CORNER_TOP_RIGHT | this.CORNER_BOTTOM_RIGHT);
            } else {
                l9r.m149037a();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m79465Q(Canvas canvas, int index, int scrolledOffset, int scrolledItem) {
        WheelView wheelView;
        l01<?> l01Var = this.wheelAdapter;
        String strM79446E = m79446E(l01Var != null ? l01Var.m147993n(index) : null);
        if (StringsKt.m93433Z0(strM79446E).toString().length() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(this.prefixText)) {
            strM79446E = this.prefixText + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM79446E;
        }
        String str = strM79446E;
        int height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2;
        int i = ((index - scrolledItem) * this.itemHeight) - scrolledOffset;
        double d = height;
        if (Math.abs(i) > (3.141592653589793d * d) / 2.0d) {
            return;
        }
        double d2 = ((double) i) / d;
        float degrees = (float) Math.toDegrees(-d2);
        float fSin = (float) (Math.sin(d2) * d);
        float fCos = (float) ((1.0d - Math.cos(d2)) * d);
        int i2 = this.textDrawStartX;
        int iM79478a0 = m79478a0(index);
        if (Math.abs(i) <= 0) {
            this.mainTextPaint.setColor(this.selectedTextColor);
            this.mainTextPaint.setAlpha(255);
            wheelView = this;
            wheelView.m79456J(canvas, str, this.selectedItemTopLimit, this.selectedItemBottomLimit, degrees, fSin, fCos, iM79478a0);
        } else {
            wheelView = this;
            if (1 <= i && i < wheelView.itemHeight) {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.mainTextPaint.setAlpha(255);
                wheelView.m79456J(canvas, str, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, degrees, fSin, fCos, iM79478a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize);
                wheelView.m79444D();
                wheelView.m79456J(canvas, str, wheelView.selectedItemBottomLimit, wheelView.clipBottom, degrees, fSin, fCos, wheelView.m79442C(wheelView.mainTextPaint));
                wheelView.mainTextPaint.setTextSize(textSize);
                wheelView.m79449F0();
            } else if (i >= 0 || i <= (-wheelView.itemHeight)) {
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize2 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize2);
                wheelView.m79444D();
                wheelView.m79456J(canvas, str, wheelView.clipTop, wheelView.clipBottom, degrees, fSin, fCos, wheelView.m79442C(wheelView.mainTextPaint));
                wheelView.mainTextPaint.setTextSize(textSize2);
                wheelView.m79449F0();
            } else {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.mainTextPaint.setAlpha(255);
                wheelView.m79456J(canvas, str, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, degrees, fSin, fCos, iM79478a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize3 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize3);
                wheelView.m79444D();
                wheelView.m79456J(canvas, str, wheelView.clipTop, wheelView.selectedItemTopLimit, degrees, fSin, fCos, wheelView.m79442C(wheelView.mainTextPaint));
                wheelView.mainTextPaint.setTextSize(textSize3);
                wheelView.m79449F0();
            }
        }
        if (wheelView.isAutoFitTextSize) {
            wheelView.mainTextPaint.setTextSize(wheelView.textSize);
            wheelView.textDrawStartX = i2;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m79466R(Canvas canvas, String text, float rotateX, float offsetY, float offsetZ, int centerToBaselineY) {
        float f;
        float f2;
        float f3;
        this.cameraForCurved.save();
        this.cameraForCurved.translate(0.0f, 0.0f, offsetZ);
        this.cameraForCurved.rotateX(rotateX);
        this.cameraForCurved.getMatrix(this.matrixForCurved);
        this.cameraForCurved.restore();
        int iCenterX = this.mainTextRect.centerX();
        int i = C13105c.f54424b[this.curvedArcDirection.ordinal()];
        if (i != 2) {
            if (i != 3) {
                f3 = iCenterX;
            } else {
                f = iCenterX;
                f2 = 1.0f - this.curvedArcDirectionFactor;
            }
            float f4 = this.centerY + offsetY;
            this.matrixForCurved.preTranslate(-f3, -f4);
            this.matrixForCurved.postTranslate(f3, f4);
            canvas.concat(this.matrixForCurved);
            canvas.drawText(text, 0, text.length(), this.textDrawStartX, f4 - centerToBaselineY, (Paint) this.mainTextPaint);
        }
        f = iCenterX;
        f2 = 1.0f + this.curvedArcDirectionFactor;
        f3 = f * f2;
        float f5 = this.centerY + offsetY;
        this.matrixForCurved.preTranslate(-f3, -f5);
        this.matrixForCurved.postTranslate(f3, f5);
        canvas.concat(this.matrixForCurved);
        canvas.drawText(text, 0, text.length(), this.textDrawStartX, f5 - centerToBaselineY, (Paint) this.mainTextPaint);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m79467R0(OverScroller scroller) {
        int i = this.scrollOffsetY;
        int currY = scroller.getCurrY();
        this.scrollOffsetY = currY;
        if (i != currY) {
            this.currentScrollState = 2;
            m79439A0(2);
            if50 if50Var = this.scrollChangedListener;
            if (if50Var != null) {
                if50Var.mo134809b(this, 2);
            }
        }
        m79491k0();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062 A[PHI: r2 r3
      0x0062: PHI (r2v13 float) = (r2v9 float), (r2v20 float) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r3v3 int) = (r3v2 int), (r3v9 int) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0064 A[PHI: r1 r2
      0x0064: PHI (r1v10 int) = (r1v9 int), (r1v19 int) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r2v11 float) = (r2v9 float), (r2v20 float) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: S */
    public final void m79468S(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        if (this.isShowDivider) {
            this.normalPaint.setColor(this.dividerColor);
            float strokeWidth = this.normalPaint.getStrokeWidth();
            this.normalPaint.setStrokeJoin(Paint.Join.ROUND);
            this.normalPaint.setStrokeCap(this.dividerCap);
            this.normalPaint.setStrokeWidth(this.dividerHeight);
            int i3 = C13105c.f54425c[this.dividerType.ordinal()];
            if (i3 == 1) {
                Rect rect = this.mainTextRect;
                int i4 = rect.left;
                int i5 = this.dividerPadding;
                int i6 = i4 - i5;
                i = rect.right + i5;
                int i7 = this.clipLeft;
                f = i6 < i7 ? i7 : i6;
                i2 = this.clipRight;
                if (i > i2) {
                    f2 = i2;
                } else {
                    f2 = i;
                }
                f3 = f2;
                f4 = f;
            } else if (i3 != 2) {
                f4 = this.clipLeft;
                f3 = this.clipRight;
            } else {
                Rect rect2 = this.mainTextRect;
                int i8 = (rect2.left - this.leftTextWidth) - this.leftTextMarginRight;
                int i9 = this.dividerPadding;
                int i10 = i8 - i9;
                i = rect2.right + this.rightTextWidth + this.rightTextMarginLeft + i9;
                int i11 = this.clipLeft;
                f = i10 < i11 ? i11 : i10;
                i2 = this.clipRight;
                if (i > i2) {
                    f2 = i2;
                } else {
                    f2 = i;
                }
                f3 = f2;
                f4 = f;
            }
            int i12 = this.selectedItemTopLimit;
            canvas.drawLine(f4, i12, f3, i12, this.normalPaint);
            int i13 = this.selectedItemBottomLimit;
            canvas.drawLine(f4, i13, f3, i13, this.normalPaint);
            this.normalPaint.setStrokeWidth(strokeWidth);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m79469S0() {
        this.mainTextPaint.setTextAlign(this.textAlign);
    }

    /* JADX INFO: renamed from: T */
    public final void m79470T(Canvas canvas) {
        if (this.leftText.length() == 0) {
            return;
        }
        this.leftTextPaint.setTextSize(this.leftTextSize);
        this.leftTextPaint.setColor(this.leftTextColor);
        int iM79442C = m79442C(this.leftTextPaint);
        CharSequence charSequence = this.leftText;
        canvas.drawText(charSequence, 0, charSequence.length(), this.leftTextRect.centerX(), this.leftTextRect.centerY() - iM79442C, this.leftTextPaint);
    }

    /* JADX INFO: renamed from: U */
    public final void m79471U(Canvas canvas) {
        if (this.rightText.length() == 0) {
            return;
        }
        this.rightTextPaint.setTextSize(this.rightTextSize);
        this.rightTextPaint.setColor(this.rightTextColor);
        int iM79442C = m79442C(this.rightTextPaint);
        CharSequence charSequence = this.rightText;
        canvas.drawText(charSequence, 0, charSequence.length(), this.rightTextRect.centerX(), this.rightTextRect.centerY() - iM79442C, this.rightTextPaint);
    }

    /* JADX INFO: renamed from: V */
    public final void m79472V(Canvas canvas) {
        if (this.drawDebugRectEnabled) {
            int color = this.leftTextPaint.getColor();
            this.leftTextPaint.setColor(-16776961);
            canvas.drawRect(this.mainTextRect, this.leftTextPaint);
            this.leftTextPaint.setColor(-65536);
            canvas.drawRect(this.leftTextRect, this.leftTextPaint);
            this.leftTextPaint.setColor(-16711936);
            canvas.drawRect(this.rightTextRect, this.leftTextPaint);
            this.leftTextPaint.setColor(color);
        }
        m79470T(canvas);
        m79471U(canvas);
    }

    /* JADX INFO: renamed from: W */
    public final void m79473W(Canvas canvas, int index, int scrolledOffset, int scrolledItem) {
        WheelView wheelView;
        l01<?> l01Var = this.wheelAdapter;
        String strM79446E = m79446E(l01Var != null ? l01Var.m147993n(index) : null);
        if (StringsKt.m93433Z0(strM79446E).toString().length() == 0) {
            return;
        }
        int i = ((index - scrolledItem) * this.itemHeight) - scrolledOffset;
        int i2 = this.textDrawStartX;
        int iM79478a0 = m79478a0(index);
        if (Math.abs(i) <= 0) {
            this.mainTextPaint.setColor(this.selectedTextColor);
            wheelView = this;
            wheelView.m79457K(canvas, strM79446E, this.selectedItemTopLimit, this.selectedItemBottomLimit, i, iM79478a0);
        } else {
            wheelView = this;
            if (1 <= i && i < wheelView.itemHeight) {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.m79457K(canvas, strM79446E, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, i, iM79478a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize);
                wheelView.m79444D();
                wheelView.m79457K(canvas, strM79446E, wheelView.selectedItemBottomLimit, wheelView.clipBottom, i, iM79478a0);
                wheelView.mainTextPaint.setTextSize(textSize);
                wheelView.m79449F0();
            } else if (i >= 0 || i <= (-wheelView.itemHeight)) {
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize2 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize2);
                wheelView.m79444D();
                wheelView.m79457K(canvas, strM79446E, wheelView.clipTop, wheelView.clipBottom, i, iM79478a0);
                wheelView.mainTextPaint.setTextSize(textSize2);
                wheelView.m79449F0();
            } else {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.m79457K(canvas, strM79446E, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, i, iM79478a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize3 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize3);
                wheelView.m79444D();
                wheelView.m79457K(canvas, strM79446E, wheelView.clipTop, wheelView.selectedItemTopLimit, i, iM79478a0);
                wheelView.mainTextPaint.setTextSize(textSize3);
                wheelView.m79449F0();
            }
        }
        if (wheelView.isAutoFitTextSize) {
            wheelView.mainTextPaint.setTextSize(wheelView.textSize);
            wheelView.textDrawStartX = i2;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m79474X(Canvas canvas, int corners) {
        float fM79428O = m79428O(10.0f);
        float[] fArr = {fM79428O, fM79428O, fM79428O, fM79428O, fM79428O, fM79428O, fM79428O, fM79428O};
        this.path.reset();
        RectF rectF = new RectF(this.clipLeft, this.selectedItemTopLimit, this.clipRight, this.selectedItemBottomLimit);
        int i = corners ^ this.CORNER_ALL;
        if ((this.CORNER_TOP_LEFT & i) != 0) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        if ((this.CORNER_TOP_RIGHT & i) != 0) {
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
        }
        if ((this.CORNER_BOTTOM_RIGHT & i) != 0) {
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
        }
        if ((this.CORNER_BOTTOM_LEFT & i) != 0) {
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        this.path.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.path, this.normalPaint);
    }

    /* JADX INFO: renamed from: Y */
    public final void m79475Y() {
        m79476Z(false);
    }

    /* JADX INFO: renamed from: Z */
    public final void m79476Z(boolean isMarkForceFinish) {
        this.isFlingScroll = false;
        if (!this.scroller.isFinished()) {
            this.scroller.forceFinished(true);
            m79467R0(this.scroller);
            m79488j(false);
        }
        if (!this.adjustScroller.isFinished()) {
            this.adjustScroller.forceFinished(true);
            m79467R0(this.adjustScroller);
            m79488j(false);
        }
        if (isMarkForceFinish) {
            this.isForceFinishScroll = true;
        }
    }

    @Override // p149l.l01.InterfaceC18123a
    /* JADX INFO: renamed from: a */
    public void mo79477a() {
        m79475Y();
        m79448F();
    }

    /* JADX INFO: renamed from: a0 */
    public final int m79478a0(int index) {
        if (!this.isAutoFitTextSize) {
            return m79442C(this.mainTextPaint);
        }
        Float f = getResizeArray().get(index);
        TextPaint textPaint = this.mainTextPaint;
        if (f == null) {
            return m79442C(textPaint);
        }
        textPaint.setTextSize(f.floatValue());
        return m79442C(this.mainTextPaint);
    }

    @Nullable
    /* JADX INFO: renamed from: b0 */
    public final <V> V m79479b0(int position) {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            return (V) l01Var.m147991l(position);
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final int m79480c0(int position) {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var == null) {
            INSTANCE.m79532k();
            return 0;
        }
        if (l01Var.m171097c() == 0) {
            return 0;
        }
        int iM171097c = l01Var.m171097c();
        if (this.scrollOffsetY < 0) {
            position -= iM171097c;
        }
        if (Math.abs(position) < iM171097c) {
            position %= l01Var.m171097c();
        }
        return position * this.itemHeight;
    }

    /* JADX INFO: renamed from: d */
    public final void m79481d() {
        this.isFlingScroll = false;
        if (!this.scroller.isFinished()) {
            this.scroller.abortAnimation();
            m79467R0(this.scroller);
            m79488j(false);
        }
        if (this.adjustScroller.isFinished()) {
            return;
        }
        this.adjustScroller.abortAnimation();
        m79467R0(this.adjustScroller);
        m79488j(false);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d0 */
    public int mo79482d0(@Nullable Object item, boolean isCompareFormatText) {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            return l01Var.m147995p(item, isCompareFormatText);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m79483f0(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, d9c0.f84999I0);
        typedArrayObtainStyledAttributes.getClass();
        int i = d9c0.f85096u1;
        int i2 = f54313I1;
        setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(i, i2));
        setAutoFitTextSize(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85003K0, false));
        setMinTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85051f1, f54314J1));
        Companion companion = INSTANCE;
        setTextAlign(companion.m79525d(typedArrayObtainStyledAttributes.getInt(d9c0.f85084q1, 1)));
        int i3 = d9c0.f85087r1;
        int i4 = f54315K1;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, i4);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85090s1, i4);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85093t1, i4);
        if (dimensionPixelSize > 0) {
            setTextPaddingLeft(dimensionPixelSize);
            setTextPaddingRight(dimensionPixelSize);
        } else {
            setTextPaddingLeft(dimensionPixelSize2);
            setTextPaddingRight(dimensionPixelSize3);
        }
        String string = typedArrayObtainStyledAttributes.getString(d9c0.f85029X0);
        if (string == null) {
            string = "";
        }
        setLeftText(string);
        String string2 = typedArrayObtainStyledAttributes.getString(d9c0.f85060i1);
        setRightText(string2 != null ? string2 : "");
        setLeftTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85039b1, i2));
        setRightTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85072m1, i2));
        setLeftTextMarginRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85036a1, i4));
        setRightTextMarginLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85069l1, i4));
        setLeftTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85031Y0, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setRightTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85063j1, RoundedDrawable.DEFAULT_BORDER_COLOR));
        int i5 = typedArrayObtainStyledAttributes.getInt(d9c0.f85033Z0, 0);
        int i6 = typedArrayObtainStyledAttributes.getInt(d9c0.f85066k1, 0);
        setLeftTextGravity(companion.m79526e(i5));
        setRightTextGravity(companion.m79526e(i6));
        setGravity(typedArrayObtainStyledAttributes.getInt(d9c0.f85001J0, 17));
        setNormalTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85054g1, -12303292));
        setSelectedTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85078o1, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setLineSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85042c1, f54312H1));
        setVisibleItems(typedArrayObtainStyledAttributes.getInt(d9c0.f85099v1, 5));
        setVisibleItems(m79490k(this.visibleItems));
        m79485h0(typedArrayObtainStyledAttributes.getInt(d9c0.f85075n1, 0), typedArrayObtainStyledAttributes.getInt(d9c0.f85048e1, -1), typedArrayObtainStyledAttributes.getInt(d9c0.f85045d1, -1));
        setCyclic(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85015Q0, false));
        setShowDivider(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85081p1, false));
        setDividerType(companion.m79524c(typedArrayObtainStyledAttributes.getInt(d9c0.f85025V0, 0)));
        setDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85019S0, f54316L1));
        setDividerColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85017R0, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setDividerPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85023U0, i4));
        setDividerOffsetY(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85021T0, 0));
        setShowCurtain(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85027W0, false));
        setCurtainColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85005L0, 0));
        setCurtainRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85007M0, 0));
        setCurved(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85009N0, true));
        setCurvedArcDirection(companion.m79523b(typedArrayObtainStyledAttributes.getInt(d9c0.f85011O0, 1)));
        setCurvedArcDirectionFactor(typedArrayObtainStyledAttributes.getFloat(d9c0.f85013P0, 0.75f));
        setRefractRatio(typedArrayObtainStyledAttributes.getFloat(d9c0.f85057h1, 1.0f));
        float f = this.refractRatio;
        if (f > 1.0f || f < 0.0f) {
            setRefractRatio(1.0f);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m79484g0() {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            getSoundHelper().m198801e(0.3f);
            return;
        }
        getSoundHelper().m198801e((audioManager.getStreamVolume(3) * 1.0f) / audioManager.getStreamMaxVolume(3));
    }

    @Nullable
    public final l01<?> getAdapter() {
        return this.wheelAdapter;
    }

    public final int getCORNER_ALL() {
        return this.CORNER_ALL;
    }

    public final int getCORNER_BOTTOM_LEFT() {
        return this.CORNER_BOTTOM_LEFT;
    }

    public final int getCORNER_BOTTOM_RIGHT() {
        return this.CORNER_BOTTOM_RIGHT;
    }

    public final int getCORNER_TOP_LEFT() {
        return this.CORNER_TOP_LEFT;
    }

    public final int getCORNER_TOP_RIGHT() {
        return this.CORNER_TOP_RIGHT;
    }

    public final int getCurtainColor() {
        return this.curtainColor;
    }

    public final int getCurtainRadius() {
        return this.curtainRadius;
    }

    @NotNull
    public final CurvedArcDirection getCurvedArcDirection() {
        return this.curvedArcDirection;
    }

    public final float getCurvedArcDirectionFactor() {
        return this.curvedArcDirectionFactor;
    }

    @NotNull
    public final CurvedArcDirection getDirection() {
        return this.direction;
    }

    @NotNull
    public final Paint.Cap getDividerCap() {
        return this.dividerCap;
    }

    public final int getDividerColor() {
        return this.dividerColor;
    }

    public final int getDividerHeight() {
        return this.dividerHeight;
    }

    public final int getDividerOffsetY() {
        return this.dividerOffsetY;
    }

    public final int getDividerPadding() {
        return this.dividerPadding;
    }

    @NotNull
    public final DividerType getDividerType() {
        return this.dividerType;
    }

    public final boolean getDrawDebugRectEnabled() {
        return this.drawDebugRectEnabled;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getItemCount() {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            return l01Var.m171097c();
        }
        return 0;
    }

    public final int getItemHeight() {
        return this.itemHeight;
    }

    @NotNull
    public final CharSequence getLeftText() {
        return this.leftText;
    }

    public final int getLeftTextColor() {
        return this.leftTextColor;
    }

    public final int getLeftTextGravity() {
        return this.leftTextGravity;
    }

    public final int getLeftTextMarginRight() {
        return this.leftTextMarginRight;
    }

    public final int getLeftTextSize() {
        return this.leftTextSize;
    }

    public final int getLineSpacing() {
        return this.lineSpacing;
    }

    @NotNull
    public final MeasureType getMaxTextWidthMeasureType() {
        return this.maxTextWidthMeasureType;
    }

    public final int getMinTextSize() {
        return this.minTextSize;
    }

    public final int getNormalTextColor() {
        return this.normalTextColor;
    }

    public final float getRefractRatio() {
        return this.refractRatio;
    }

    @NotNull
    public final CharSequence getRightText() {
        return this.rightText;
    }

    public final int getRightTextColor() {
        return this.rightTextColor;
    }

    public final int getRightTextGravity() {
        return this.rightTextGravity;
    }

    public final int getRightTextMarginLeft() {
        return this.rightTextMarginLeft;
    }

    public final int getRightTextSize() {
        return this.rightTextSize;
    }

    @Nullable
    public final <T> T getSelectedItem() {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            return (T) l01Var.m147994o();
        }
        return null;
    }

    public final int getSelectedPosition() {
        mo79477a();
        if (this.mOverRangeMode != OverRangeMode.HIDE_ITEM) {
            return this.selectedPosition;
        }
        int i = this.minSelectedPosition;
        int i2 = this.maxSelectedPosition;
        int i3 = this.selectedPosition;
        if (i > i3 || i3 > i2) {
            return i3 < i ? i : i2;
        }
        return i3 + i;
    }

    public final int getSelectedTextColor() {
        return this.selectedTextColor;
    }

    public final float getSoundVolume() {
        return getSoundHelper().getSoundPlayVolume();
    }

    @NotNull
    public final Paint.Align getTextAlign() {
        return this.textAlign;
    }

    public final int getTextPaddingLeft() {
        return this.textPaddingLeft;
    }

    public final int getTextPaddingRight() {
        return this.textPaddingRight;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int getVisibleItems() {
        return this.visibleItems;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79485h0(int selectedPosition, int minSelectedPosition, int maxSelectedPosition) {
        this.minSelectedPosition = minSelectedPosition;
        this.maxSelectedPosition = maxSelectedPosition;
        int iM79450G = m79450G(selectedPosition);
        this.selectedPosition = iM79450G;
        this.currentScrollPosition = iM79450G;
    }

    /* JADX INFO: renamed from: i */
    public final void m79486i(int deltaY) {
        this.adjustScroller.startScroll(0, this.scrollOffsetY, 0, deltaY, 250);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m79487i0(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        m79469S0();
    }

    /* JADX INFO: renamed from: j */
    public final void m79488j(boolean isAnimate) {
        int iM79460M = this.scrollOffsetY % m79460M();
        if (iM79460M != 0) {
            int iM79494m = m79494m(iM79460M);
            if (isAnimate) {
                m79486i(iM79494m);
            } else {
                this.scrollOffsetY += iM79494m;
            }
        }
        m79491k0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79489j0() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m79490k(int visibleItems) {
        return Math.abs(((visibleItems / 2) * 2) + 1);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79491k0() {
        int i = this.scrollOffsetY;
        if (i != this.scrolledY) {
            this.scrolledY = i;
            mo79521z0(i);
            if50 if50Var = this.scrollChangedListener;
            if (if50Var != null) {
                if50Var.mo134807a(this, this.scrollOffsetY);
            }
            m79515w0();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m79492l(int dataHeight, int deltaDistance) {
        if (Math.abs(deltaDistance) < dataHeight / 2) {
            return deltaDistance;
        }
        int iAbs = dataHeight - Math.abs(deltaDistance);
        return deltaDistance < 0 ? iAbs : -iAbs;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final boolean getIsCyclic() {
        return this.isCyclic;
    }

    /* JADX INFO: renamed from: m */
    public final int m79494m(int remainder) {
        int iAbs = Math.abs(remainder);
        int i = this.itemHeight;
        if (iAbs > i / 2) {
            return this.scrollOffsetY < 0 ? (-i) - remainder : i - remainder;
        }
        return -remainder;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m79495m0(int position) {
        int i = this.minSelectedPosition;
        return i >= 0 && position < i;
    }

    /* JADX INFO: renamed from: n */
    public final void m79496n() {
        int iCenterX;
        int i = C13105c.f54423a[this.textAlign.ordinal()];
        if (i != 1) {
            Rect rect = this.mainTextRect;
            iCenterX = i != 2 ? rect.centerX() : rect.right;
        } else {
            iCenterX = this.mainTextRect.left;
        }
        this.textDrawStartX = iCenterX;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m79497n0(int position, l01<?> adapter) {
        int i = this.maxSelectedPosition;
        return i >= 0 && i < adapter.m171097c() && position > this.maxSelectedPosition;
    }

    /* JADX INFO: renamed from: o */
    public final int m79498o(int position) {
        if (!this.isCyclic) {
            return (position * this.itemHeight) - this.scrollOffsetY;
        }
        l01<?> l01Var = this.wheelAdapter;
        int iM171100f = l01Var != null ? l01Var.m171100f() : 0;
        int i = this.itemHeight;
        int i2 = iM171100f * i;
        int i3 = this.scrollOffsetY;
        int i4 = i3 % (i2 == 0 ? 1 : i2);
        int i5 = position * i;
        if (i3 < 0 && i4 != 0) {
            i5 = -(i2 - i5);
        }
        return m79492l(i2, i5 - i4);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m79499o0(int position) {
        if (this.wheelAdapter != null) {
            int iM79480c0 = m79480c0(position);
            int i = this.itemHeight / 6;
            int i2 = this.scrollOffsetY;
            l01<?> l01Var = this.wheelAdapter;
            l01Var.getClass();
            int iM171097c = i2 % (l01Var.m171097c() * this.itemHeight);
            int i3 = iM79480c0 - i;
            if (iM171097c <= iM79480c0 + i && i3 <= iM171097c) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSoundHelper().m198800d();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int i;
        int i2;
        canvas.getClass();
        super.onDraw(canvas);
        m79464P(canvas);
        m79468S(canvas);
        m79472V(canvas);
        int iM79460M = this.scrollOffsetY / m79460M();
        int iM79460M2 = this.scrollOffsetY % m79460M();
        int i3 = (this.visibleItems + 1) / 2;
        if (iM79460M2 >= 0) {
            if (iM79460M2 > 0) {
                i = iM79460M - i3;
                i2 = i3 + iM79460M + 1;
            } else {
                i = iM79460M - i3;
            }
            while (i < i2) {
                if (this.isCurved) {
                    m79465Q(canvas, i, iM79460M2, iM79460M);
                } else {
                    m79473W(canvas, i, iM79460M2, iM79460M);
                }
                i++;
            }
        }
        i = (iM79460M - i3) - 1;
        i2 = i3 + iM79460M;
        while (i < i2) {
            if (this.isCurved) {
                m79465Q(canvas, i, iM79460M2, iM79460M);
            } else {
                m79473W(canvas, i, iM79460M2, iM79460M);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        CurvedArcDirection curvedArcDirection;
        m79438A(this.isDataSetChanged);
        boolean z = this.isCurved;
        int i = this.itemHeight;
        int paddingTop = z ? (int) ((((double) ((i * this.visibleItems) * 2)) / 3.141592653589793d) + ((double) getPaddingTop()) + ((double) getPaddingBottom())) : getPaddingBottom() + (i * this.visibleItems) + getPaddingTop();
        int i2 = this.leftTextWidth + this.leftTextMarginRight;
        int i3 = this.rightText.length() == 0 ? 0 : this.rightTextWidth + this.rightTextMarginLeft;
        int iMax = this.gravity == 1 ? i2 + i3 : Math.max(i2, i3) * 2;
        int paddingLeft = this.mainTextMaxWidth + iMax + this.textPaddingLeft + this.textPaddingRight + getPaddingLeft() + getPaddingRight();
        if (this.isCurved && ((curvedArcDirection = this.curvedArcDirection) == CurvedArcDirection.LEFT || curvedArcDirection == CurvedArcDirection.RIGHT)) {
            int iSin = (int) (Math.sin(0.06544984694978735d) * ((double) paddingTop) * ((double) this.curvedArcDirectionFactor));
            if (paddingLeft <= this.mainTextMaxWidth + iSin) {
                paddingLeft += iSin;
                this.curvedArcWidth = iSin;
            } else {
                this.curvedArcWidth = 0;
            }
        }
        int iResolveSize = View.resolveSize(paddingLeft, widthMeasureSpec);
        if (paddingLeft > iResolveSize) {
            this.mainTextMaxWidth = (((((iResolveSize - this.textPaddingLeft) - this.textPaddingRight) - iMax) - getPaddingLeft()) - getPaddingRight()) - this.curvedArcWidth;
            this.isDataSetChanged = true;
        }
        setMeasuredDimension(iResolveSize, View.resolveSize(paddingTop, heightMeasureSpec));
        this.centerY = getMeasuredHeight() / 2;
        this.clipLeft = getPaddingLeft();
        this.clipTop = getPaddingTop();
        this.clipRight = getMeasuredWidth() - getPaddingRight();
        this.clipBottom = getMeasuredHeight() - getPaddingBottom();
        if (this.isAutoFitTextSize && this.isDataSetChanged) {
            m79445D0();
        }
        m79440B();
        m79520z();
        m79506s();
        m79518y();
        m79459L();
        this.isDataSetChanged = false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        l01<?> l01Var;
        if (!isEnabled() || (l01Var = this.wheelAdapter) == null || ((l01Var != null && l01Var.m171097c() == 0) || event == null)) {
            return super.onTouchEvent(event);
        }
        m79489j0();
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        int actionMasked = event.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            m79476Z(true);
            this.isFlingScroll = false;
            this.lastTouchY = event.getY();
            this.downStartTime = SystemClock.elapsedRealtime();
        } else if (actionMasked == 1) {
            this.isForceFinishScroll = false;
            VelocityTracker velocityTracker2 = this.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000, this.maxFlingVelocity);
            }
            VelocityTracker velocityTracker3 = this.velocityTracker;
            int yVelocity = velocityTracker3 != null ? (int) velocityTracker3.getYVelocity() : this.minFlingVelocity;
            if (Math.abs(yVelocity) > this.minFlingVelocity) {
                m79475Y();
                this.isFlingScroll = true;
                this.scroller.fling(0, this.scrollOffsetY, 0, -yVelocity, 0, 0, this.minScrollY, this.maxScrollY);
            } else {
                int y = SystemClock.elapsedRealtime() - this.downStartTime <= 120 ? (int) (event.getY() - this.centerY) : 0;
                int iM79494m = y + m79494m((this.scrollOffsetY + y) % m79460M());
                boolean z2 = iM79494m < 0 && this.scrollOffsetY + iM79494m >= this.minScrollY;
                if (iM79494m > 0 && this.scrollOffsetY + iM79494m <= this.maxScrollY) {
                    z = true;
                }
                if (z2 || z) {
                    m79486i(iM79494m);
                }
            }
            m79491k0();
            gbl0.m125185b0(this, this);
            m79443C0();
        } else if (actionMasked == 2) {
            float y2 = event.getY();
            float f = y2 - this.lastTouchY;
            this.currentScrollState = 1;
            m79439A0(1);
            if50 if50Var = this.scrollChangedListener;
            if (if50Var != null) {
                if50Var.mo134809b(this, 1);
            }
            if (Math.abs(f) < 1.0f) {
                return false;
            }
            m79462N((int) (-f));
            this.lastTouchY = y2;
            m79491k0();
        } else if (actionMasked == 3) {
            m79443C0();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m79500p() {
        this.itemHeight = (int) ((this.mainTextPaint.getFontMetrics().bottom - this.mainTextPaint.getFontMetrics().top) + this.lineSpacing);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m79501p0() {
        return this.maxSelectedPosition < 0 && this.minSelectedPosition < 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m79502q() {
        int i;
        int iCenterY;
        int i2;
        if (this.leftText.length() == 0) {
            return;
        }
        Rect rect = this.mainTextRect;
        int i3 = (rect.left - this.leftTextMarginRight) - this.leftTextWidth;
        int i4 = this.leftTextGravity;
        if (i4 != 48) {
            if (i4 != 80) {
                iCenterY = rect.centerY();
                i2 = this.leftTextHeight / 2;
            } else {
                iCenterY = rect.bottom;
                i2 = this.leftTextHeight;
            }
            i = iCenterY - i2;
        } else {
            i = rect.top;
        }
        this.leftTextRect.set(i3, i, this.leftTextWidth + i3, this.leftTextHeight + i);
    }

    /* JADX INFO: renamed from: q0 */
    public final int m79503q0(l01<?> adapter) {
        int i = this.maxSelectedPosition;
        return (i < 0 || i >= adapter.m171097c() || this.mOverRangeMode != OverRangeMode.CANT_SCROLL) ? adapter.m171097c() - 1 : this.maxSelectedPosition;
    }

    /* JADX INFO: renamed from: r */
    public final void m79504r() {
        if (this.leftText.length() == 0) {
            this.leftTextWidth = 0;
            this.leftTextHeight = 0;
        } else {
            this.leftTextPaint.setTextSize(this.leftTextSize);
            this.leftTextWidth = (int) this.leftTextPaint.measureText(this.leftText.toString());
            this.leftTextHeight = (int) (this.leftTextPaint.getFontMetrics().bottom - this.leftTextPaint.getFontMetrics().top);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final int m79505r0(l01<?> adapter) {
        int i = this.maxSelectedPosition;
        int i2 = this.minSelectedPosition;
        if (i2 < 0 || i2 >= i || i >= adapter.m171097c() || this.mOverRangeMode != OverRangeMode.CANT_SCROLL) {
            return 0;
        }
        return this.minSelectedPosition;
    }

    @Override // java.lang.Runnable
    public void run() {
        OverScroller overScroller = this.scroller;
        if (overScroller.isFinished()) {
            overScroller = this.adjustScroller;
        }
        m79448F();
        if (overScroller.computeScrollOffset()) {
            m79467R0(overScroller);
            gbl0.m125185b0(this, this);
        } else if (this.isFlingScroll) {
            this.isFlingScroll = false;
            m79488j(true);
            gbl0.m125185b0(this, this);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m79506s() {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var == null) {
            INSTANCE.m79532k();
        } else {
            this.minScrollY = this.isCyclic ? Integer.MIN_VALUE : m79505r0(l01Var) * this.itemHeight;
            this.maxScrollY = this.isCyclic ? Api.BaseClientBuilder.API_PRIORITY_OTHER : m79503q0(l01Var) * this.itemHeight;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m79507s0() {
        if (this.wheelAdapter != null) {
            m79475Y();
            requestLayout();
            invalidate();
        }
    }

    public final void setAdapter(@NotNull l01<?> adapter) {
        adapter.getClass();
        this.wheelAdapter = adapter;
        if (adapter != null) {
            adapter.m148002w(this.textFormatter);
            adapter.m147998s(this.formatterBlock);
            adapter.m171103i(this.isCyclic);
            adapter.m148001v(this.selectedPosition);
            adapter.m147997r(this);
            m79452H();
            m79511u0();
        }
    }

    public final void setAutoFitTextSize(boolean z) {
        this.isAutoFitTextSize = z;
        m79511u0();
    }

    public final void setCurtainColor(@ColorInt int i) {
        if (i == this.curtainColor) {
            return;
        }
        this.curtainColor = i;
        if (this.isShowCurtain) {
            invalidate();
        }
    }

    public final void setCurtainColorRadius(int curtainRadius) {
        setCurtainRadius(curtainRadius);
    }

    public final void setCurtainColorRes(@ColorRes int curtainColorRes) {
        setCurtainColor(e16.m114375c(getContext(), curtainColorRes));
    }

    public final void setCurtainRadius(int i) {
        if (i == this.curtainRadius) {
            return;
        }
        this.curtainRadius = i;
        m79507s0();
    }

    public final void setCurved(boolean z) {
        if (z == this.isCurved) {
            return;
        }
        this.isCurved = z;
        m79500p();
        requestLayout();
    }

    public final void setCurvedArcDirection(@NotNull CurvedArcDirection curvedArcDirection) {
        curvedArcDirection.getClass();
        if (curvedArcDirection == this.curvedArcDirection) {
            return;
        }
        this.curvedArcDirection = curvedArcDirection;
        if (this.isCurved) {
            requestLayout();
            invalidate();
        }
    }

    public final void setCurvedArcDirectionFactor(float f) {
        if (f == this.curvedArcDirectionFactor) {
            return;
        }
        this.curvedArcDirectionFactor = Math.min(1.0f, Math.max(0.0f, f));
        if (this.isCurved) {
            requestLayout();
            invalidate();
        }
    }

    public final void setCyclic(boolean z) {
        if (z == this.isCyclic) {
            return;
        }
        this.isCyclic = z;
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            l01Var.m171103i(z);
        }
        m79509t0();
    }

    public final <T> void setData(@NotNull List<? extends T> data) {
        data.getClass();
        setAdapter(new l01<>(data));
    }

    public final void setDirection(@NotNull CurvedArcDirection curvedArcDirection) {
        curvedArcDirection.getClass();
        if (curvedArcDirection == this.direction) {
            return;
        }
        this.direction = curvedArcDirection;
        if (this.isShowCurtain) {
            invalidate();
        }
    }

    public final void setDividerCap(@NotNull Paint.Cap cap) {
        cap.getClass();
        if (cap == this.dividerCap) {
            return;
        }
        this.dividerCap = cap;
        if (this.isShowDivider) {
            invalidate();
        }
    }

    public final void setDividerColor(@ColorInt int i) {
        if (i == this.dividerColor) {
            return;
        }
        this.dividerColor = i;
        if (this.isShowDivider) {
            invalidate();
        }
    }

    public final void setDividerColorRes(@ColorRes int dividerColorRes) {
        setDividerColor(e16.m114375c(getContext(), dividerColorRes));
    }

    public final void setDividerHeight(int i) {
        if (i == this.dividerHeight) {
            return;
        }
        this.dividerHeight = i;
        if (this.isShowDivider) {
            invalidate();
        }
    }

    public final void setDividerOffsetY(int i) {
        if (i == this.dividerOffsetY) {
            return;
        }
        this.dividerOffsetY = i;
        if (this.isShowDivider) {
            m79440B();
            invalidate();
        }
    }

    public final void setDividerPadding(int i) {
        if (i == this.dividerPadding) {
            return;
        }
        this.dividerPadding = i;
        if (this.isShowDivider) {
            invalidate();
        }
    }

    public final void setDividerType(@NotNull DividerType dividerType) {
        dividerType.getClass();
        if (dividerType == this.dividerType) {
            return;
        }
        this.dividerType = dividerType;
        if (this.isShowDivider) {
            invalidate();
        }
    }

    public final void setDrawDebugRectEnabled(boolean z) {
        if (z == this.drawDebugRectEnabled) {
            return;
        }
        this.drawDebugRectEnabled = z;
        invalidate();
    }

    public final void setGravity(int i) {
        if (i == this.gravity) {
            return;
        }
        this.gravity = i;
        m79511u0();
    }

    public final void setItemIndexer(@NotNull Function2<? super l01<?>, Object, Integer> indexerBlock) {
        indexerBlock.getClass();
        this.itemIndexerBlock = indexerBlock;
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            l01Var.m148000u(indexerBlock);
        }
    }

    public final void setLeftText(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        if (Intrinsics.m87488d(charSequence, this.leftText)) {
            return;
        }
        this.leftText = charSequence;
        m79507s0();
    }

    public final void setLeftTextColor(int i) {
        if (i == this.leftTextColor) {
            return;
        }
        this.leftTextColor = i;
        invalidate();
    }

    public final void setLeftTextColorRes(@ColorRes int leftTextColorRes) {
        setLeftTextColor(e16.m114375c(getContext(), leftTextColorRes));
    }

    public final void setLeftTextGravity(int i) {
        if (i == this.leftTextGravity) {
            return;
        }
        this.leftTextGravity = i;
        m79502q();
        invalidate();
    }

    public final void setLeftTextMarginRight(int i) {
        if (i == this.leftTextMarginRight) {
            return;
        }
        this.leftTextMarginRight = i;
        m79507s0();
    }

    public final void setLeftTextSize(int i) {
        if (i == this.leftTextSize) {
            return;
        }
        this.leftTextSize = i;
        m79507s0();
    }

    public final void setLeftTypeface(@NotNull Typeface typeface) {
        typeface.getClass();
        if (Intrinsics.m87488d(typeface, this.leftTextPaint.getTypeface())) {
            return;
        }
        this.leftTextPaint.setTypeface(typeface);
        m79507s0();
    }

    public final void setLineSpacing(int i) {
        if (i == this.lineSpacing) {
            return;
        }
        this.lineSpacing = i;
        m79507s0();
    }

    public final void setMaxTextWidthMeasureType(@NotNull MeasureType measureType) {
        measureType.getClass();
        if (measureType == this.maxTextWidthMeasureType) {
            return;
        }
        this.maxTextWidthMeasureType = measureType;
        m79507s0();
    }

    public final void setMinTextSize(int i) {
        if (i == this.minTextSize) {
            return;
        }
        this.minTextSize = i;
        m79507s0();
    }

    public final void setNormalTextColor(int i) {
        if (i == this.normalTextColor) {
            return;
        }
        this.normalTextColor = i;
        invalidate();
    }

    public final void setNormalTextColorRes(@ColorRes int normalColorRes) {
        setNormalTextColor(e16.m114375c(getContext(), normalColorRes));
    }

    public final void setOnItemSelectedListener(@Nullable ie50 itemSelectedListener) {
        this.itemSelectedListener = itemSelectedListener;
    }

    public final void setOnScrollChangedListener(@Nullable if50 scrollChangedListener) {
        this.scrollChangedListener = scrollChangedListener;
    }

    public final void setPrefixText(@NotNull String str) {
        str.getClass();
        this.prefixText = str;
    }

    public final void setRefractRatio(float f) {
        if (f == this.refractRatio) {
            return;
        }
        this.refractRatio = Math.min(1.0f, Math.max(0.0f, f));
        invalidate();
    }

    public final void setResetSelectedPosition(boolean z) {
        this.isResetSelectedPosition = z;
    }

    public final void setRightText(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        if (Intrinsics.m87488d(charSequence, this.rightText)) {
            return;
        }
        this.rightText = charSequence;
        m79507s0();
    }

    public final void setRightTextColor(int i) {
        if (i == this.rightTextColor) {
            return;
        }
        this.rightTextColor = i;
        invalidate();
    }

    public final void setRightTextColorRes(@ColorRes int rightTextColorRes) {
        setRightTextColor(e16.m114375c(getContext(), rightTextColorRes));
    }

    public final void setRightTextGravity(int i) {
        if (i == this.rightTextGravity) {
            return;
        }
        this.rightTextGravity = i;
        m79514w();
        invalidate();
    }

    public final void setRightTextMarginLeft(int i) {
        if (i == this.rightTextMarginLeft) {
            return;
        }
        this.rightTextMarginLeft = i;
        m79507s0();
    }

    public final void setRightTextSize(int i) {
        if (i == this.rightTextSize) {
            return;
        }
        this.rightTextSize = i;
        m79507s0();
    }

    public final void setRightTypeface(@NotNull Typeface typeface) {
        typeface.getClass();
        if (Intrinsics.m87488d(typeface, this.rightTextPaint.getTypeface())) {
            return;
        }
        this.rightTextPaint.setTypeface(typeface);
        m79507s0();
    }

    @JvmOverloads
    public final void setSelectableRange(@IntRange(from = 0) int i) {
        m79425J0(this, 0, i, 1, null);
    }

    @JvmOverloads
    public final void setSelectedPosition(int i) {
        m79426L0(this, i, false, 0, 6, null);
    }

    @Deprecated
    @JvmOverloads
    public final void setSelectedRange(@IntRange(from = 0) int i) {
        m79427N0(this, 0, i, 1, null);
    }

    public final void setSelectedTextColor(int i) {
        if (i == this.selectedTextColor) {
            return;
        }
        this.selectedTextColor = i;
        invalidate();
    }

    public final void setSelectedTextColorRes(@ColorRes int selectedColorRes) {
        setSelectedTextColor(e16.m114375c(getContext(), selectedColorRes));
    }

    public final void setShowCurtain(boolean z) {
        if (z == this.isShowCurtain) {
            return;
        }
        this.isShowCurtain = z;
        invalidate();
    }

    public final void setShowDivider(boolean z) {
        if (z == this.isShowDivider) {
            return;
        }
        this.isShowDivider = z;
        if (this.dividerOffsetY > 0) {
            m79440B();
        }
        invalidate();
    }

    public final void setSoundEffect(boolean z) {
        this.isSoundEffect = z;
        if (getSoundHelper().getSoundPlayVolume() == 0.0f) {
            m79484g0();
        }
    }

    public final void setSoundResource(@RawRes int soundRes) {
        vlf0 soundHelper = getSoundHelper();
        Context context = getContext();
        context.getClass();
        soundHelper.m198798b(context, soundRes);
    }

    public final void setSoundVolume(float playVolume) {
        getSoundHelper().m198801e(Math.min(1.0f, Math.max(0.0f, playVolume)));
    }

    public final void setTextAlign(@NotNull Paint.Align align) {
        align.getClass();
        if (align == this.textAlign) {
            return;
        }
        this.textAlign = align;
        m79513v0();
    }

    public final void setTextFormatter(@NotNull vii0 textFormatter) {
        textFormatter.getClass();
        this.textFormatter = textFormatter;
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            l01Var.m148002w(textFormatter);
            m79452H();
            m79511u0();
        }
    }

    public final void setTextPadding(float textPaddingDp) {
        int iM79428O = m79428O(textPaddingDp);
        setTextPaddingLeft(iM79428O);
        setTextPaddingRight(iM79428O);
    }

    public final void setTextPaddingLeft(int i) {
        if (i == this.textPaddingLeft) {
            return;
        }
        this.textPaddingLeft = i;
        requestLayout();
    }

    public final void setTextPaddingRight(int i) {
        if (i == this.textPaddingRight) {
            return;
        }
        this.textPaddingRight = i;
        requestLayout();
    }

    public final void setTextSize(int i) {
        if (i == this.textSize) {
            return;
        }
        this.textSize = i;
        m79511u0();
    }

    @JvmOverloads
    public final void setTypeface(@NotNull Typeface typeface) {
        typeface.getClass();
        m79429P0(this, typeface, false, 2, null);
    }

    public final void setVisibleItems(int i) {
        int iM79490k = m79490k(i);
        if (iM79490k == this.visibleItems) {
            return;
        }
        this.visibleItems = iM79490k;
        m79507s0();
    }

    /* JADX INFO: renamed from: t */
    public final int m79508t(String itemText) {
        return gex.m125859b(this.mainTextPaint.measureText(new Regex("\\d").replace(itemText, String.valueOf(m79512v()))));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m79509t0() {
        m79475Y();
        m79506s();
        m79518y();
        if (this.mOverRangeMode != OverRangeMode.HIDE_ITEM) {
            invalidate();
            return;
        }
        this.isDataSetChanged = true;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m79510u() {
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var == null) {
            INSTANCE.m79532k();
            return;
        }
        if (l01Var.m171097c() == 0) {
            return;
        }
        this.mainTextMaxWidth = 0;
        this.mainTextPaint.setTextSize(this.textSize);
        MeasureType measureType = this.maxTextWidthMeasureType;
        if (measureType == MeasureType.SAME_WIDTH) {
            this.mainTextMaxWidth = (int) this.mainTextPaint.measureText(l01Var.m147992m(l01Var.m171098d(0)));
        } else if (measureType == MeasureType.SAME_WIDTH_WITH_NUM) {
            this.mainTextMaxWidth = m79508t(l01Var.m147992m(l01Var.m171098d(0)));
        } else {
            int iM171097c = l01Var.m171097c();
            int length = -1;
            for (int i = 0; i < iM171097c; i++) {
                String strM147992m = l01Var.m147992m(l01Var.m171098d(i));
                MeasureType measureType2 = this.maxTextWidthMeasureType;
                if ((measureType2 != MeasureType.MAX_LENGTH && measureType2 != MeasureType.MAX_LENGTH_WITH_NUM) || strM147992m.length() > length) {
                    length = strM147992m.length();
                    if (this.maxTextWidthMeasureType == MeasureType.MAX_LENGTH_WITH_NUM) {
                        strM147992m = new Regex("\\d").replace(strM147992m, String.valueOf(m79512v()));
                    }
                    if (!TextUtils.isEmpty(this.prefixText)) {
                        strM147992m = this.prefixText + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM147992m;
                    }
                    this.mainTextMaxWidth = Math.max((int) this.mainTextPaint.measureText(strM147992m), this.mainTextMaxWidth);
                }
            }
        }
        this.originTextMaxWidth = this.mainTextMaxWidth;
        this.mainTextHeight = (int) (this.mainTextPaint.getFontMetrics().bottom - this.mainTextPaint.getFontMetrics().top);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m79511u0() {
        if (this.wheelAdapter != null) {
            this.isDataSetChanged = true;
            m79475Y();
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m79512v() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            int iM125859b = gex.m125859b(this.mainTextPaint.measureText(String.valueOf(i3)));
            if (iM125859b > i2) {
                i = i3;
                i2 = iM125859b;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m79513v0() {
        m79469S0();
        m79496n();
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m79514w() {
        int i;
        int iCenterY;
        int i2;
        if (this.rightText.length() == 0) {
            return;
        }
        Rect rect = this.mainTextRect;
        int i3 = rect.left + this.mainTextMaxWidth + this.rightTextMarginLeft;
        int i4 = this.rightTextGravity;
        if (i4 != 48) {
            if (i4 != 80) {
                iCenterY = rect.centerY();
                i2 = this.rightTextHeight / 2;
            } else {
                iCenterY = rect.bottom;
                i2 = this.rightTextHeight;
            }
            i = iCenterY - i2;
        } else {
            i = rect.top;
        }
        this.rightTextRect.set(i3, i, this.rightTextWidth + i3, this.rightTextHeight + i);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m79515w0() {
        int i = this.currentScrollPosition;
        int currentPosition = getCurrentPosition();
        if (i == currentPosition || !m79499o0(currentPosition) || this.itemChangedPosition == currentPosition) {
            return;
        }
        m79517x0(i, currentPosition);
        m79441B0();
        this.currentScrollPosition = currentPosition;
        this.itemChangedPosition = currentPosition;
    }

    /* JADX INFO: renamed from: x */
    public final void m79516x() {
        if (this.rightText.length() == 0) {
            this.rightTextWidth = 0;
            this.rightTextHeight = 0;
        } else {
            this.rightTextPaint.setTextSize(this.rightTextSize);
            this.rightTextWidth = (int) this.rightTextPaint.measureText(this.rightText.toString());
            this.rightTextHeight = (int) (this.rightTextPaint.getFontMetrics().bottom - this.rightTextPaint.getFontMetrics().top);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m79517x0(int oldPosition, int newPosition) {
    }

    /* JADX INFO: renamed from: y */
    public final void m79518y() {
        this.scrollOffsetY = this.selectedPosition * this.itemHeight;
    }

    /* JADX INFO: renamed from: y0 */
    public void m79519y0(@NotNull l01<?> adapter, int position) {
        adapter.getClass();
    }

    /* JADX INFO: renamed from: z */
    public final void m79520z() {
        int measuredHeight = getMeasuredHeight() / 2;
        int i = this.leftText.length() == 0 ? 0 : this.leftTextWidth + this.leftTextMarginRight;
        int measuredWidth = this.gravity == 1 ? ((((getMeasuredWidth() - i) - this.mainTextMaxWidth) - (this.rightText.length() != 0 ? this.rightTextWidth + this.rightTextMarginLeft : 0)) / 2) + i : (getMeasuredWidth() / 2) - (this.mainTextMaxWidth / 2);
        int i2 = this.mainTextHeight;
        int i3 = measuredHeight - (i2 / 2);
        this.mainTextRect.set(measuredWidth, i3, this.mainTextMaxWidth + measuredWidth, i2 + i3);
        m79502q();
        m79514w();
        m79496n();
    }

    /* JADX INFO: renamed from: z0 */
    public void mo79521z0(int scrollOffsetY) {
    }

    public final void setLeftTextMarginRight(float marginRightDp) {
        setLeftTextMarginRight(m79428O(marginRightDp));
    }

    public final void setLeftTextSize(float textSizeSp) {
        setLeftTextSize(m79430Q0(textSizeSp));
    }

    public final void setLineSpacing(float lineSpacingDp) {
        setLineSpacing(m79428O(lineSpacingDp));
    }

    public final void setMinTextSize(float minTextSizeSp) {
        setMinTextSize(m79430Q0(minTextSizeSp));
    }

    public final void setRightTextMarginLeft(float marginLeftDp) {
        setRightTextMarginLeft(m79428O(marginLeftDp));
    }

    public final void setRightTextSize(float textSizeSp) {
        setRightTextSize(m79430Q0(textSizeSp));
    }

    public final void setTextPaddingLeft(float textPaddingLeftDp) {
        setTextPaddingLeft(m79428O(textPaddingLeftDp));
    }

    public final void setTextPaddingRight(float textPaddingRightDp) {
        setTextPaddingRight(m79428O(textPaddingRightDp));
    }

    public final void setTextSize(float textSizeSp) {
        setTextSize(m79430Q0(textSizeSp));
    }

    public final void setItemIndexer(@NotNull w4q itemIndexer) {
        itemIndexer.getClass();
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            l01Var.m147999t(null);
        }
    }

    public final void setDividerHeight(float dividerHeightDp) {
        setDividerHeight(m79428O(dividerHeightDp));
    }

    public final void setDividerPadding(float dividerPaddingDp) {
        setDividerPadding(m79428O(dividerPaddingDp));
    }

    public final void setDividerOffsetY(float offsetYDp) {
        setDividerOffsetY(m79428O(offsetYDp));
    }

    public final void setTextFormatter(@NotNull Function1<Object, String> formatterBlock) {
        formatterBlock.getClass();
        this.formatterBlock = formatterBlock;
        l01<?> l01Var = this.wheelAdapter;
        if (l01Var != null) {
            l01Var.m147998s(formatterBlock);
            m79452H();
            m79511u0();
        }
    }

    public final void setOnItemPositionChangedListener(@Nullable he50 itemPositionChangedListener) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WheelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
