package com.p051p1.mobile.putong.p070ui.datepicker;

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
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.datepicker.WheelView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.c4s;
import p153l.euf0;
import p153l.fhx;
import p153l.j26;
import p153l.jhc0;
import p153l.kkl0;
import p153l.nbr;
import p153l.om50;
import p153l.on50;
import p153l.p7f;
import p153l.pm50;
import p153l.pr3;
import p153l.s01;
import p153l.vri0;
import p153l.w6q;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\r\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 ª\u00042\u00020\u00012\u00020\u00022\u00020\u0003:\f¤\u0001«\u0004¬\u0004\u00ad\u0004®\u0004¡\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0015J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0015J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0015J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0015J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u0015J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0015J\u000f\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u0015J\u001b\u00102\u001a\u00020\b2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\b2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u0015J\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u0010\u0015J\u0017\u00109\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b>\u0010:J\u0017\u0010?\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b?\u0010:J\u0017\u0010@\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b@\u0010:J\u0017\u0010A\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bA\u0010:J\u0019\u0010C\u001a\u00020\u00172\b\u0010B\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\bC\u0010DJ/\u0010H\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010IJ?\u0010O\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bO\u0010PJ/\u0010Q\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010IJO\u0010U\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bU\u0010VJ?\u0010W\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010J\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\bH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bY\u0010\u0011J\u0017\u0010\\\u001a\u00020\b2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\fH\u0002¢\u0006\u0004\b^\u0010\u0015J\u000f\u0010_\u001a\u00020\fH\u0002¢\u0006\u0004\b_\u0010\u0015J\u000f\u0010`\u001a\u00020\fH\u0002¢\u0006\u0004\b`\u0010\u0015J\u000f\u0010a\u001a\u00020\fH\u0002¢\u0006\u0004\ba\u0010\u0015J\u000f\u0010b\u001a\u00020\fH\u0002¢\u0006\u0004\bb\u0010\u0015J\u0017\u0010e\u001a\u00020\f2\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020\f2\u0006\u0010g\u001a\u00020\u001eH\u0002¢\u0006\u0004\bh\u0010!J\u0017\u0010j\u001a\u00020\f2\u0006\u0010i\u001a\u00020\bH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\f2\u0006\u0010l\u001a\u00020\bH\u0002¢\u0006\u0004\bm\u0010kJ\u000f\u0010n\u001a\u00020\fH\u0002¢\u0006\u0004\bn\u0010\u0015J\u000f\u0010o\u001a\u00020\fH\u0002¢\u0006\u0004\bo\u0010\u0015J\u000f\u0010p\u001a\u00020\fH\u0002¢\u0006\u0004\bp\u0010\u0015J\u000f\u0010q\u001a\u00020\fH\u0002¢\u0006\u0004\bq\u0010\u0015J\u001b\u0010r\u001a\u00020\u001e2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\b2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0004\bu\u0010\u0011J\u001f\u0010x\u001a\u00020\b2\u0006\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\bH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\b2\u0006\u0010z\u001a\u00020\bH\u0002¢\u0006\u0004\b{\u0010\u0011J\u000f\u0010|\u001a\u00020\bH\u0002¢\u0006\u0004\b|\u0010)J\u0017\u0010}\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\b2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u007f\u0010\u0011J\u0011\u0010\u0080\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0080\u0001\u0010)J\u0011\u0010\u0081\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0081\u0001\u0010\u0015J\u001a\u0010\u0083\u0001\u001a\u00020\f2\u0007\u0010\u0082\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0083\u0001\u0010!J\u0011\u0010\u0084\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u0015J\u0011\u0010\u0085\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u0015J\u0011\u0010\u0086\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0015J\u0011\u0010\u0087\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0015J\u0011\u0010\u0088\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0015J\u0011\u0010\u0089\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u0015J\u0019\u0010\u008a\u0001\u001a\u00020\b2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0011J\u0012\u0010\u008b\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\bH\u0002¢\u0006\u0005\b\u008d\u0001\u0010~J&\u0010\u008e\u0001\u001a\u00020\u001e2\u0006\u0010t\u001a\u00020\b2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\f2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\fH\u0014¢\u0006\u0005\b\u0094\u0001\u0010\u0015J-\u0010\u0098\u0001\u001a\u00020\f2\u0007\u0010\u0095\u0001\u001a\u00020\b2\u0007\u0010\u0096\u0001\u001a\u00020\b2\u0007\u0010\u0097\u0001\u001a\u00020\bH\u0004¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J$\u0010\u009c\u0001\u001a\u00020\f2\u0007\u0010\u009a\u0001\u001a\u00020\b2\u0007\u0010\u009b\u0001\u001a\u00020\bH\u0014¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0019\u0010\u009e\u0001\u001a\u00020\f2\u0006\u00108\u001a\u000207H\u0014¢\u0006\u0005\b\u009e\u0001\u0010:J\u001e\u0010¡\u0001\u001a\u00020\u001e2\n\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u0001H\u0017¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b£\u0001\u0010\u0015J\u0011\u0010¤\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b¤\u0001\u0010\u0015J&\u0010§\u0001\u001a\u00020\f\"\u0004\b\u0000\u0010@2\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¥\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001c\u0010©\u0001\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u000300¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0016\u0010«\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u000100¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001a\u0010¯\u0001\u001a\u00020\f2\b\u0010®\u0001\u001a\u00030\u00ad\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J)\u0010¯\u0001\u001a\u00020\f2\u0017\u0010³\u0001\u001a\u0012\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\u00170±\u0001¢\u0006\u0006\b¯\u0001\u0010´\u0001J\u001a\u0010·\u0001\u001a\u00020\f2\b\u0010¶\u0001\u001a\u00030µ\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001J3\u0010·\u0001\u001a\u00020\f2!\u0010º\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\b0¹\u0001¢\u0006\u0006\b·\u0001\u0010»\u0001J\u0019\u0010½\u0001\u001a\u00020\f2\u0007\u0010¼\u0001\u001a\u00020\u001a¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0019\u0010À\u0001\u001a\u00020\f2\u0007\u0010¿\u0001\u001a\u00020\u001a¢\u0006\u0006\bÀ\u0001\u0010¾\u0001J'\u0010Ä\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Á\u00012\t\b\u0002\u0010Ã\u0001\u001a\u00020\u001eH\u0007¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001a\u0010Ç\u0001\u001a\u00020\f2\t\b\u0001\u0010Æ\u0001\u001a\u00020\b¢\u0006\u0005\bÇ\u0001\u0010kJ\u001a\u0010É\u0001\u001a\u00020\f2\t\b\u0001\u0010È\u0001\u001a\u00020\b¢\u0006\u0005\bÉ\u0001\u0010kJ\u0019\u0010Ë\u0001\u001a\u00020\f2\u0007\u0010Ê\u0001\u001a\u00020\u0017¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0019\u0010Î\u0001\u001a\u00020\f2\u0007\u0010Í\u0001\u001a\u00020\u001a¢\u0006\u0006\bÎ\u0001\u0010¾\u0001J\u0019\u0010Ð\u0001\u001a\u00020\f2\u0007\u0010Ï\u0001\u001a\u00020\u001a¢\u0006\u0006\bÐ\u0001\u0010¾\u0001J\u0019\u0010Ò\u0001\u001a\u00020\f2\u0007\u0010Ñ\u0001\u001a\u00020\u001a¢\u0006\u0006\bÒ\u0001\u0010¾\u0001J\u0019\u0010Ô\u0001\u001a\u00020\f2\u0007\u0010Ó\u0001\u001a\u00020\u001a¢\u0006\u0006\bÔ\u0001\u0010¾\u0001J\u001a\u0010Ö\u0001\u001a\u00020\f2\t\b\u0001\u0010Õ\u0001\u001a\u00020\b¢\u0006\u0005\bÖ\u0001\u0010kJ\u0019\u0010Ø\u0001\u001a\u00020\f2\u0007\u0010×\u0001\u001a\u00020\u001a¢\u0006\u0006\bØ\u0001\u0010¾\u0001J\u0019\u0010Ú\u0001\u001a\u00020\f2\u0007\u0010Ù\u0001\u001a\u00020\u001a¢\u0006\u0006\bÚ\u0001\u0010¾\u0001J\u0019\u0010Ü\u0001\u001a\u00020\f2\u0007\u0010Û\u0001\u001a\u00020\u001a¢\u0006\u0006\bÜ\u0001\u0010¾\u0001J\u001a\u0010Þ\u0001\u001a\u00020\f2\t\b\u0001\u0010Ý\u0001\u001a\u00020\b¢\u0006\u0005\bÞ\u0001\u0010kJ\u0018\u0010à\u0001\u001a\u00020\f2\u0007\u0010ß\u0001\u001a\u00020\b¢\u0006\u0005\bà\u0001\u0010kJ\u0019\u0010á\u0001\u001a\u00020\f2\u0007\u0010¼\u0001\u001a\u00020\u001a¢\u0006\u0006\bá\u0001\u0010¾\u0001J\u0019\u0010â\u0001\u001a\u00020\f2\u0007\u0010¼\u0001\u001a\u00020\u001a¢\u0006\u0006\bâ\u0001\u0010¾\u0001J\u001a\u0010ã\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Á\u0001¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u001a\u0010å\u0001\u001a\u00020\f2\b\u0010Â\u0001\u001a\u00030Á\u0001¢\u0006\u0006\bå\u0001\u0010ä\u0001J\u001a\u0010ç\u0001\u001a\u00020\f2\t\b\u0001\u0010æ\u0001\u001a\u00020\b¢\u0006\u0005\bç\u0001\u0010kJ\u001a\u0010é\u0001\u001a\u00020\f2\t\b\u0001\u0010è\u0001\u001a\u00020\b¢\u0006\u0005\bé\u0001\u0010kJ\u0019\u0010ë\u0001\u001a\u00020\f2\u0007\u0010ê\u0001\u001a\u00020\u001a¢\u0006\u0006\bë\u0001\u0010¾\u0001J\u0019\u0010í\u0001\u001a\u00020\f2\u0007\u0010ì\u0001\u001a\u00020\u001a¢\u0006\u0006\bí\u0001\u0010¾\u0001J0\u0010ð\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\b2\t\b\u0002\u0010î\u0001\u001a\u00020\u001e2\t\b\u0002\u0010ï\u0001\u001a\u00020\bH\u0007¢\u0006\u0006\bð\u0001\u0010ñ\u0001J(\u0010ô\u0001\u001a\u00020\f2\t\b\u0003\u0010ò\u0001\u001a\u00020\b2\t\b\u0001\u0010ó\u0001\u001a\u00020\bH\u0007¢\u0006\u0006\bô\u0001\u0010\u009d\u0001J(\u0010õ\u0001\u001a\u00020\f2\t\b\u0003\u0010ò\u0001\u001a\u00020\b2\t\b\u0001\u0010ó\u0001\u001a\u00020\bH\u0007¢\u0006\u0006\bõ\u0001\u0010\u009d\u0001J2\u0010ö\u0001\u001a\u00020\f2\t\b\u0003\u0010ò\u0001\u001a\u00020\b2\t\b\u0001\u0010ó\u0001\u001a\u00020\b2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0007¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u000f\u0010ø\u0001\u001a\u00020\b¢\u0006\u0005\bø\u0001\u0010)J\u0018\u0010ù\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010@¢\u0006\u0006\bù\u0001\u0010ú\u0001J \u0010û\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010?2\u0006\u0010t\u001a\u00020\b¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u000f\u0010ý\u0001\u001a\u00020\b¢\u0006\u0005\bý\u0001\u0010)J)\u0010\u0080\u0002\u001a\u00020\b2\n\u0010þ\u0001\u001a\u0005\u0018\u00010²\u00012\t\b\u0002\u0010ÿ\u0001\u001a\u00020\u001eH\u0017¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0011\u0010\u0082\u0002\u001a\u00020\bH\u0004¢\u0006\u0005\b\u0082\u0002\u0010)J\u0010\u0010\u0083\u0002\u001a\u00020\u001a¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u0019\u0010\u0086\u0002\u001a\u00020\f2\u0007\u0010\u0085\u0002\u001a\u00020\u001a¢\u0006\u0006\b\u0086\u0002\u0010¾\u0001J\u001a\u0010\u0088\u0002\u001a\u00020\f2\t\b\u0001\u0010\u0087\u0002\u001a\u00020\b¢\u0006\u0005\b\u0088\u0002\u0010kJ\u001a\u0010\u008a\u0002\u001a\u00020\f2\u0007\u0010\u0089\u0002\u001a\u00020\bH\u0014¢\u0006\u0005\b\u008a\u0002\u0010kJ\u001a\u0010\u008c\u0002\u001a\u00020\f2\u0007\u0010\u008b\u0002\u001a\u00020\bH\u0014¢\u0006\u0005\b\u008c\u0002\u0010kJ&\u0010\u008d\u0002\u001a\u00020\f2\n\u00101\u001a\u0006\u0012\u0002\b\u0003002\u0006\u0010t\u001a\u00020\bH\u0014¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J$\u0010\u0091\u0002\u001a\u00020\f2\u0007\u0010\u008f\u0002\u001a\u00020\b2\u0007\u0010\u0090\u0002\u001a\u00020\bH\u0014¢\u0006\u0006\b\u0091\u0002\u0010\u009d\u0001J\u001c\u0010\u0094\u0002\u001a\u00020\f2\n\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0092\u0002¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u001c\u0010\u0098\u0002\u001a\u00020\f2\n\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u0096\u0002¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J\u001c\u0010\u009c\u0002\u001a\u00020\f2\n\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u0002¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0017\u0010\u009f\u0002\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010\u009e\u0002R\u0018\u0010£\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u0018\u0010¥\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¢\u0002R\u0018\u0010¦\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010¢\u0002R\u0018\u0010ª\u0002\u001a\u00030§\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u0018\u0010®\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u0018\u0010°\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010\u00ad\u0002R\u0018\u0010²\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010\u00ad\u0002R\u0018\u0010´\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010³\u0002R\u0017\u0010µ\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010rR\u0017\u0010¶\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010rR\u0017\u0010·\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010rR\u0017\u0010¸\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010rR\u0017\u0010¹\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010rR\u0017\u0010º\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010rR\u0017\u0010»\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010rR\u0017\u0010¼\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010rR\u0017\u0010½\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010rR\u0017\u0010¾\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010rR\u0017\u0010¿\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010rR\u0017\u0010À\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010rR\u0017\u0010Á\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010rR\u0017\u0010Â\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010rR\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010rR\u0017\u0010Ã\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010rR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010rR\u0017\u0010Æ\u0002\u001a\u00030Ä\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010Å\u0002R\u0017\u0010É\u0002\u001a\u00030Ç\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010È\u0002R\u0015\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010Ê\u0002R\u0016\u0010Ë\u0002\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b^\u0010Ê\u0002R\u001b\u0010Î\u0002\u001a\u0005\u0018\u00010Ì\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010Í\u0002R\u0017\u0010Ï\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010rR\u0018\u0010Ð\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010rR\u0018\u0010Ñ\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010rR\u0017\u0010Ò\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010rR\u0017\u0010\u0089\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010rR\u0017\u0010Ó\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010rR\u0017\u0010Ô\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010bR\u0019\u0010Ö\u0002\u001a\u00030Õ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010UR\u0018\u0010×\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0083\u0001R\u0019\u0010Ù\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0002\u0010\u0083\u0001R \u0010Þ\u0002\u001a\u00030Ú\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b9\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u001e\u0010à\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010ß\u0002R\u0017\u0010á\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010rR\u0017\u0010â\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010rR\u0017\u0010ã\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010rR\u0017\u0010\u0095\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010rR3\u0010ë\u0002\u001a\u00030ä\u00022\b\u0010å\u0002\u001a\u00030ä\u00028\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b?\u0010æ\u0002\u001a\u0006\bç\u0002\u0010è\u0002\"\u0006\bé\u0002\u0010ê\u0002R.\u0010î\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\bH\u0010r\u001a\u0005\bì\u0002\u0010)\"\u0005\bí\u0002\u0010kR.\u0010ð\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\bo\u0010r\u001a\u0005\bï\u0002\u0010)\"\u0005\b½\u0001\u0010kR1\u0010ñ\u0002\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u0083\u0001\u001a\u0006\bñ\u0002\u0010\u008c\u0001\"\u0005\bò\u0002\u0010!R/\u0010ô\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010r\u001a\u0005\bó\u0002\u0010)\"\u0005\bÀ\u0001\u0010kR3\u0010û\u0002\u001a\u00030õ\u00022\b\u0010å\u0002\u001a\u00030õ\u00028\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b_\u0010ö\u0002\u001a\u0006\b÷\u0002\u0010ø\u0002\"\u0006\bù\u0002\u0010ú\u0002R.\u0010þ\u0002\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010r\u001a\u0005\bü\u0002\u0010)\"\u0005\bý\u0002\u0010kR/\u0010\u0081\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\bõ\u0001\u0010r\u001a\u0005\bÿ\u0002\u0010)\"\u0005\b\u0080\u0003\u0010kR/\u0010\u0083\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bö\u0001\u0010r\u001a\u0005\b\u0082\u0003\u0010)\"\u0005\bÐ\u0001\u0010kR/\u0010\u0086\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0003\u0010r\u001a\u0005\b\u0085\u0003\u0010)\"\u0005\bÒ\u0001\u0010kR\u0019\u0010Ã\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010\u0083\u0001R\u001c\u0010\u0089\u0003\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0003\u0010\u0088\u0003R\u001c\u0010\u008a\u0003\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010\u0088\u0003R1\u0010\u008e\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0003\u0010\u0083\u0001\u001a\u0006\b\u008c\u0003\u0010\u008c\u0001\"\u0005\b\u008d\u0003\u0010!R.\u0010\u000f\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u0010r\u001a\u0005\b\u008f\u0003\u0010)\"\u0005\b\u0090\u0003\u0010kR/\u0010\u0093\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0003\u0010r\u001a\u0005\b\u0092\u0003\u0010)\"\u0005\bÔ\u0001\u0010kR1\u0010\u0097\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0094\u0003\u0010\u0083\u0001\u001a\u0006\b\u0095\u0003\u0010\u008c\u0001\"\u0005\b\u0096\u0003\u0010!R0\u0010\u0098\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\be\u0010\u0083\u0001\u001a\u0006\b\u0098\u0003\u0010\u008c\u0001\"\u0005\b\u0099\u0003\u0010!R0\u0010\u009c\u0003\u001a\u00020\b2\t\b\u0001\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b6\u0010r\u001a\u0005\b\u009a\u0003\u0010)\"\u0005\b\u009b\u0003\u0010kR/\u0010\u009f\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0003\u0010r\u001a\u0005\b\u009e\u0003\u0010)\"\u0005\bØ\u0001\u0010kR4\u0010§\u0003\u001a\u00030 \u00032\b\u0010å\u0002\u001a\u00030 \u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0003\u0010¢\u0003\u001a\u0006\b£\u0003\u0010¤\u0003\"\u0006\b¥\u0003\u0010¦\u0003R/\u0010ª\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0003\u0010r\u001a\u0005\b©\u0003\u0010)\"\u0005\bÚ\u0001\u0010kR4\u0010²\u0003\u001a\u00030«\u00032\b\u0010å\u0002\u001a\u00030«\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0003\u0010\u00ad\u0003\u001a\u0006\b®\u0003\u0010¯\u0003\"\u0006\b°\u0003\u0010±\u0003R/\u0010µ\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0003\u0010r\u001a\u0005\b´\u0003\u0010)\"\u0005\bÜ\u0001\u0010kR1\u0010·\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b¶\u0003\u0010\u0083\u0001\u001a\u0006\b·\u0003\u0010\u008c\u0001\"\u0005\b¸\u0003\u0010!R1\u0010¼\u0003\u001a\u00020\b2\t\b\u0001\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b¹\u0003\u0010r\u001a\u0005\bº\u0003\u0010)\"\u0005\b»\u0003\u0010kR/\u0010ß\u0001\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0003\u0010r\u001a\u0005\b¾\u0003\u0010)\"\u0005\b¿\u0003\u0010kR4\u0010Ç\u0003\u001a\u00030À\u00032\b\u0010å\u0002\u001a\u00030À\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÁ\u0003\u0010Â\u0003\u001a\u0006\bÃ\u0003\u0010Ä\u0003\"\u0006\bÅ\u0003\u0010Æ\u0003R\u001d\u0010Ê\u0003\u001a\u00020\b8\u0006X\u0086D¢\u0006\u000e\n\u0005\bÈ\u0003\u0010r\u001a\u0005\bÉ\u0003\u0010)R\u001a\u0010Í\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bË\u0003\u0010r\u001a\u0005\bÌ\u0003\u0010)R\u001a\u0010Ð\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bÎ\u0003\u0010r\u001a\u0005\bÏ\u0003\u0010)R\u001a\u0010Ó\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bÑ\u0003\u0010r\u001a\u0005\bÒ\u0003\u0010)R\u001a\u0010Ö\u0003\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\bÔ\u0003\u0010r\u001a\u0005\bÕ\u0003\u0010)R1\u0010Ø\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b×\u0003\u0010\u0083\u0001\u001a\u0006\bØ\u0003\u0010\u008c\u0001\"\u0005\bÙ\u0003\u0010!R4\u0010Ý\u0003\u001a\u00030À\u00032\b\u0010å\u0002\u001a\u00030À\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÚ\u0003\u0010Â\u0003\u001a\u0006\bÛ\u0003\u0010Ä\u0003\"\u0006\bÜ\u0003\u0010Æ\u0003R1\u0010á\u0003\u001a\u00020\u001a2\u0007\u0010å\u0002\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bÞ\u0003\u0010b\u001a\u0006\bß\u0003\u0010\u0084\u0002\"\u0006\bà\u0003\u0010¾\u0001R1\u0010å\u0003\u001a\u00020\u001a2\u0007\u0010å\u0002\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bâ\u0003\u0010b\u001a\u0006\bã\u0003\u0010\u0084\u0002\"\u0006\bä\u0003\u0010¾\u0001R1\u0010ç\u0003\u001a\u00020\u001e2\u0007\u0010å\u0002\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bæ\u0003\u0010\u0083\u0001\u001a\u0006\bç\u0003\u0010\u008c\u0001\"\u0005\bè\u0003\u0010!R(\u0010ê\u0003\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bé\u0003\u0010\u0083\u0001\u001a\u0006\bê\u0003\u0010\u008c\u0001\"\u0005\bë\u0003\u0010!R\u0018\u0010\u0097\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bì\u0003\u0010rR\u0018\u0010\u0096\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bí\u0003\u0010rR\u001a\u0010ð\u0003\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0003\u0010ï\u0003R4\u0010ø\u0003\u001a\u00030ñ\u00032\b\u0010å\u0002\u001a\u00030ñ\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bò\u0003\u0010ó\u0003\u001a\u0006\bô\u0003\u0010õ\u0003\"\u0006\bö\u0003\u0010÷\u0003R4\u0010ü\u0003\u001a\u00030ñ\u00032\b\u0010å\u0002\u001a\u00030ñ\u00038\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bù\u0003\u0010ó\u0003\u001a\u0006\bú\u0003\u0010õ\u0003\"\u0006\bû\u0003\u0010÷\u0003R/\u0010ÿ\u0003\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bý\u0003\u0010r\u001a\u0005\bþ\u0003\u0010)\"\u0005\bá\u0001\u0010kR/\u0010\u0082\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0004\u0010r\u001a\u0005\b\u0081\u0004\u0010)\"\u0005\bâ\u0001\u0010kR/\u0010\u0085\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0004\u0010r\u001a\u0005\b\u0084\u0004\u0010)\"\u0005\bë\u0001\u0010kR/\u0010\u0088\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0004\u0010r\u001a\u0005\b\u0087\u0004\u0010)\"\u0005\bí\u0001\u0010kR/\u0010\u008c\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0004\u0010r\u001a\u0005\b\u008a\u0004\u0010)\"\u0005\b\u008b\u0004\u0010kR/\u0010\u0090\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0004\u0010r\u001a\u0005\b\u008e\u0004\u0010)\"\u0005\b\u008f\u0004\u0010kR/\u0010\u0094\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0004\u0010r\u001a\u0005\b\u0092\u0004\u0010)\"\u0005\b\u0093\u0004\u0010kR/\u0010\u0098\u0004\u001a\u00020\b2\u0007\u0010å\u0002\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0004\u0010r\u001a\u0005\b\u0096\u0004\u0010)\"\u0005\b\u0097\u0004\u0010kR\u001c\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0092\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0004\u0010\u009a\u0004R\u001c\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0004\u0010\u009c\u0004R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0004\u0010\u009e\u0004R+\u0010³\u0001\u001a\u0014\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\u0017\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0004\u0010 \u0004R5\u0010£\u0004\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u000300\u0012\u0007\u0012\u0005\u0018\u00010²\u0001\u0012\u0004\u0012\u00020\b\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0004\u0010¢\u0004R'\u0010¨\u0004\u001a\t\u0012\u0004\u0012\u00020\u001a0¤\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0004\u0010Û\u0002\u001a\u0006\b¦\u0004\u0010§\u0004R\u0018\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0004\u0010\u0083\u0001¨\u0006¯\u0004"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/view/View;", "Ljava/lang/Runnable;", "Ll/s01$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "f0", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "visibleItems", "k", "(I)I", "i0", "(Landroid/content/Context;)V", "g0", "()V", "D0", "", "measureText", "textWidth", "", "G0", "(Ljava/lang/String;I)F", "B", "", "isDataSetChanged", "A", "(Z)V", "r", BaseSei.f14624X, "u", "itemText", Constants.KEY_T, "(Ljava/lang/String;)I", ResourceDirection.f39656v, "()I", BaseSei.f14626Z, "q", "w", "p", "n", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/s01;", "adapter", "q0", "(Ll/s01;)I", "r0", BaseSei.f14625Y, "S0", "Landroid/graphics/Canvas;", "canvas", "P", "(Landroid/graphics/Canvas;)V", "corners", "X", "(Landroid/graphics/Canvas;I)V", p7f.LATITUDE_SOUTH, p7f.GPS_MEASUREMENT_INTERRUPTED, p7f.GPS_DIRECTION_TRUE, "U", "oriText", "E", "(Ljava/lang/String;)Ljava/lang/String;", FirebaseAnalytics.Param.INDEX, "scrolledOffset", "scrolledItem", "W", "(Landroid/graphics/Canvas;III)V", "text", "clipTop", "clipBottom", "item2CenterOffsetY", "centerToBaselineY", "K", "(Landroid/graphics/Canvas;Ljava/lang/String;IIII)V", "Q", "rotateX", "offsetY", "offsetZ", "J", "(Landroid/graphics/Canvas;Ljava/lang/String;IIFFFI)V", "R", "(Landroid/graphics/Canvas;Ljava/lang/String;FFFI)V", "a0", "Landroid/graphics/Paint;", "paint", c4s.C_ZONE, "(Landroid/graphics/Paint;)I", "D", "F0", "j0", "C0", "F", "Landroid/widget/OverScroller;", "scroller", "R0", "(Landroid/widget/OverScroller;)V", "isAnimate", "j", "deltaY", RXScreenCaptureService.KEY_INDEX, "(I)V", "distance", "N", "L", "k0", "w0", "B0", "I", "(Ll/s01;)Z", "position", "o", "dataHeight", "deltaDistance", BLiveStormDanmakuGiftResourceType.f45292l, "(II)I", "remainder", "m", "getCurrentPosition", "o0", "(I)Z", "c0", "M", "Y", "isMarkForceFinish", "Z", Constants.INAPP_DATA_TAG, "H", "s0", "u0", "v0", "t0", "G", "p0", "()Z", "m0", "n0", "(ILl/s01;)Z", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "overRangeMode", "E0", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "onDetachedFromWindow", "selectedPosition", "minSelectedPosition", "maxSelectedPosition", "h0", "(III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "run", "a", "", "data", "setData", "(Ljava/util/List;)V", "setAdapter", "(Ll/s01;)V", "getAdapter", "()Ll/s01;", "Ll/vri0;", "textFormatter", "setTextFormatter", "(Ll/vri0;)V", "Lkotlin/Function1;", "", "formatterBlock", "(Lkotlin/jvm/functions/Function1;)V", "Ll/w6q;", "itemIndexer", "setItemIndexer", "(Ll/w6q;)V", "Lkotlin/Function2;", "indexerBlock", "(Lkotlin/jvm/functions/Function2;)V", "textSizeSp", "setTextSize", "(F)V", "minTextSizeSp", "setMinTextSize", "Landroid/graphics/Typeface;", "typeface", "isBoldForSelectedItem", "O0", "(Landroid/graphics/Typeface;Z)V", "normalColorRes", "setNormalTextColorRes", "selectedColorRes", "setSelectedTextColorRes", "str", "setPrefixText", "(Ljava/lang/String;)V", "textPaddingDp", "setTextPadding", "textPaddingLeftDp", "setTextPaddingLeft", "textPaddingRightDp", "setTextPaddingRight", "lineSpacingDp", "setLineSpacing", "dividerColorRes", "setDividerColorRes", "dividerHeightDp", "setDividerHeight", "dividerPaddingDp", "setDividerPadding", "offsetYDp", "setDividerOffsetY", "curtainColorRes", "setCurtainColorRes", "curtainRadius", "setCurtainColorRadius", "setLeftTextSize", "setRightTextSize", "setLeftTypeface", "(Landroid/graphics/Typeface;)V", "setRightTypeface", "leftTextColorRes", "setLeftTextColorRes", "rightTextColorRes", "setRightTextColorRes", "marginRightDp", "setLeftTextMarginRight", "marginLeftDp", "setRightTextMarginLeft", "isSmoothScroll", "smoothDuration", "K0", "(IZI)V", "min", Constants.PRIORITY_MAX, "M0", "H0", "I0", "(IILcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "getSelectedPosition", "getSelectedItem", "()Ljava/lang/Object;", "b0", "(I)Ljava/lang/Object;", "getItemCount", Item.TYPE, "isCompareFormatText", "d0", "(Ljava/lang/Object;Z)I", "getItemHeight", "getSoundVolume", "()F", "playVolume", "setSoundVolume", "soundRes", "setSoundResource", "scrollOffsetY", "z0", "state", "A0", "y0", "(Ll/s01;I)V", "oldPosition", "newPosition", "x0", "Ll/pm50;", "itemSelectedListener", "setOnItemSelectedListener", "(Ll/pm50;)V", "Ll/om50;", "itemPositionChangedListener", "setOnItemPositionChangedListener", "(Ll/om50;)V", "Ll/on50;", "scrollChangedListener", "setOnScrollChangedListener", "(Ll/on50;)V", "Landroid/graphics/Paint;", "normalPaint", "Landroid/text/TextPaint;", "b", "Landroid/text/TextPaint;", "mainTextPaint", "c", "leftTextPaint", "rightTextPaint", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "path", "Landroid/graphics/Rect;", "f", "Landroid/graphics/Rect;", "mainTextRect", "g", "leftTextRect", "h", "rightTextRect", "Ljava/lang/String;", "prefixText", "mainTextMaxWidth", "originTextMaxWidth", "leftTextWidth", "rightTextWidth", "itemHeight", "mainTextHeight", "leftTextHeight", "rightTextHeight", "curvedArcWidth", "textDrawStartX", "centerY", "selectedItemTopLimit", "selectedItemBottomLimit", "clipLeft", "clipRight", "Landroid/graphics/Camera;", "Landroid/graphics/Camera;", "cameraForCurved", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrixForCurved", "Landroid/widget/OverScroller;", "adjustScroller", "Landroid/view/VelocityTracker;", "Landroid/view/VelocityTracker;", "velocityTracker", "maxFlingVelocity", "minFlingVelocity", "minScrollY", "maxScrollY", "scrolledY", "lastTouchY", "", "downStartTime", "isForceFinishScroll", BloodType.f39576O, "isFlingScroll", "Ll/euf0;", "Lkotlin/Lazy;", "getSoundHelper", "()Ll/euf0;", "soundHelper", "Ll/s01;", "wheelAdapter", "currentScrollPosition", "itemChangedPosition", "currentScrollState", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "value", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "getMaxTextWidthMeasureType", "()Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "setMaxTextWidthMeasureType", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;)V", "maxTextWidthMeasureType", "getGravity", "setGravity", "gravity", "getTextSize", "textSize", "isAutoFitTextSize", "setAutoFitTextSize", "getMinTextSize", "minTextSize", "Landroid/graphics/Paint$Align;", "Landroid/graphics/Paint$Align;", "getTextAlign", "()Landroid/graphics/Paint$Align;", "setTextAlign", "(Landroid/graphics/Paint$Align;)V", "textAlign", "getNormalTextColor", "setNormalTextColor", "normalTextColor", "getSelectedTextColor", "setSelectedTextColor", "selectedTextColor", "getTextPaddingLeft", "textPaddingLeft", "J0", "getTextPaddingRight", "textPaddingRight", "L0", "Landroid/graphics/Typeface;", "normalTypeface", "boldTypeface", "N0", "getDrawDebugRectEnabled", "setDrawDebugRectEnabled", "drawDebugRectEnabled", "getVisibleItems", "setVisibleItems", "P0", "getLineSpacing", "lineSpacing", "Q0", "l0", "setCyclic", "isCyclic", "isShowDivider", "setShowDivider", "getDividerColor", "setDividerColor", "dividerColor", "T0", "getDividerHeight", "dividerHeight", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "U0", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "getDividerType", "()Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "setDividerType", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;)V", "dividerType", "V0", "getDividerPadding", "dividerPadding", "Landroid/graphics/Paint$Cap;", "W0", "Landroid/graphics/Paint$Cap;", "getDividerCap", "()Landroid/graphics/Paint$Cap;", "setDividerCap", "(Landroid/graphics/Paint$Cap;)V", "dividerCap", "X0", "getDividerOffsetY", "dividerOffsetY", "Y0", "isShowCurtain", "setShowCurtain", "Z0", "getCurtainColor", "setCurtainColor", "curtainColor", "a1", "getCurtainRadius", "setCurtainRadius", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "b1", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "getDirection", "()Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "setDirection", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;)V", "direction", "c1", "getCORNER_TOP_LEFT", "CORNER_TOP_LEFT", "d1", "getCORNER_TOP_RIGHT", "CORNER_TOP_RIGHT", "e1", "getCORNER_BOTTOM_LEFT", "CORNER_BOTTOM_LEFT", "f1", "getCORNER_BOTTOM_RIGHT", "CORNER_BOTTOM_RIGHT", "g1", "getCORNER_ALL", "CORNER_ALL", "h1", "isCurved", "setCurved", "i1", "getCurvedArcDirection", "setCurvedArcDirection", "curvedArcDirection", "j1", "getCurvedArcDirectionFactor", "setCurvedArcDirectionFactor", "curvedArcDirectionFactor", "k1", "getRefractRatio", "setRefractRatio", "refractRatio", "l1", "isSoundEffect", "setSoundEffect", "m1", "isResetSelectedPosition", "setResetSelectedPosition", "n1", "o1", "p1", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "mOverRangeMode", "", "q1", "Ljava/lang/CharSequence;", "getLeftText", "()Ljava/lang/CharSequence;", "setLeftText", "(Ljava/lang/CharSequence;)V", "leftText", "r1", "getRightText", "setRightText", "rightText", "s1", "getLeftTextSize", "leftTextSize", "t1", "getRightTextSize", "rightTextSize", "u1", "getLeftTextMarginRight", "leftTextMarginRight", "v1", "getRightTextMarginLeft", "rightTextMarginLeft", "w1", "getLeftTextColor", "setLeftTextColor", "leftTextColor", "x1", "getRightTextColor", "setRightTextColor", "rightTextColor", "y1", "getLeftTextGravity", "setLeftTextGravity", "leftTextGravity", "z1", "getRightTextGravity", "setRightTextGravity", "rightTextGravity", "A1", "Ll/pm50;", "B1", "Ll/on50;", "C1", "Ll/vri0;", "D1", "Lkotlin/jvm/functions/Function1;", "E1", "Lkotlin/jvm/functions/Function2;", "itemIndexerBlock", "Landroid/util/SparseArray;", "F1", "getResizeArray", "()Landroid/util/SparseArray;", "resizeArray", "G1", "Companion", "CurvedArcDirection", "DividerType", "MeasureType", "OverRangeMode", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public class WheelView extends View implements Runnable, s01.InterfaceC19946a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: H1 */
    public static final int f55160H1 = m80611O(2.0f);

    /* JADX INFO: renamed from: I1 */
    public static final int f55161I1 = m80613Q0(15.0f);

    /* JADX INFO: renamed from: J1 */
    public static final int f55162J1 = m80613Q0(6.0f);

    /* JADX INFO: renamed from: K1 */
    public static final int f55163K1 = m80611O(2.0f);

    /* JADX INFO: renamed from: L1 */
    public static final int f55164L1 = m80611O(1.0f);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Camera cameraForCurved;

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    @Nullable
    public pm50 itemSelectedListener;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Matrix matrixForCurved;

    /* JADX INFO: renamed from: B1, reason: from kotlin metadata */
    @Nullable
    public on50 scrollChangedListener;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final OverScroller scroller;

    /* JADX INFO: renamed from: C1, reason: from kotlin metadata */
    @Nullable
    public vri0 textFormatter;

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
    public Function2<? super s01<?>, Object, Integer> itemIndexerBlock;

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
    public s01<?> wheelAdapter;

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

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum CurvedArcDirection {
        LEFT,
        CENTER,
        RIGHT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<CurvedArcDirection> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "", "<init>", "(Ljava/lang/String;I)V", "FILL", "WRAP", "WRAP_ALL", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum DividerType {
        FILL,
        WRAP,
        WRAP_ALL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<DividerType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "", "<init>", "(Ljava/lang/String;I)V", "SAME_WIDTH", "MAX_LENGTH", RelationshipStatus.DEFAULT, "SAME_WIDTH_WITH_NUM", "MAX_LENGTH_WITH_NUM", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum MeasureType {
        SAME_WIDTH,
        MAX_LENGTH,
        DEFAULT,
        SAME_WIDTH_WITH_NUM,
        MAX_LENGTH_WITH_NUM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<MeasureType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "CANT_SCROLL", "HIDE_ITEM", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum OverRangeMode {
        NORMAL,
        CANT_SCROLL,
        HIDE_ITEM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<OverRangeMode> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.datepicker.WheelView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u0003R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010$\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0014\u0010'\u001a\u00020&8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001dR\u0014\u0010*\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u001dR\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001dR\u0014\u0010,\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020-8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u001dR\u0014\u00103\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u001dR\u0014\u00104\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u001dR\u0014\u00105\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u001dR\u0014\u00106\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u001dR\u0014\u00107\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u001dR\u0014\u00108\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u001dR\u0014\u00109\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u001dR\u0014\u0010:\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u001dR\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u00101R\u0014\u0010<\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u001dR\u0014\u0010=\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010\u001dR\u0014\u0010>\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u001dR\u0014\u0010?\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u001dR\u0014\u0010@\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u001dR\u0014\u0010A\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010\u001dR\u0014\u0010B\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u001dR\u0014\u0010C\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010\u001d¨\u0006D"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$a;", "", "<init>", "()V", "", "dp", "", "f", "(F)I", "sp", BLiveStormDanmakuGiftResourceType.f45292l, "gravity", "e", "(I)I", "align", "Landroid/graphics/Paint$Align;", Constants.INAPP_DATA_TAG, "(I)Landroid/graphics/Paint$Align;", "direction", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "b", "(I)Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "dividerType", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "c", "(I)Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "", "k", "DEFAULT_LINE_SPACING", "I", "h", "()I", "DEFAULT_TEXT_SIZE", "j", "DEFAULT_TEXT_PADDING", RXScreenCaptureService.KEY_INDEX, "DEFAULT_DIVIDER_HEIGHT", "g", "", "TAG", "Ljava/lang/String;", "DEFAULT_NORMAL_TEXT_COLOR", "DEFAULT_SELECTED_TEXT_COLOR", "DEFAULT_VISIBLE_ITEM", "DEFAULT_SCROLL_DURATION", "", "DEFAULT_CLICK_CONFIRM", "J", "DEFAULT_REFRACT_RATIO", "F", "TEXT_ALIGN_LEFT", "TEXT_ALIGN_CENTER", "TEXT_ALIGN_RIGHT", "SCROLL_STATE_IDLE", "SCROLL_STATE_DRAGGING", "SCROLL_STATE_SCROLLING", "CURVED_ARC_DIRECTION_LEFT", "CURVED_ARC_DIRECTION_CENTER", "CURVED_ARC_DIRECTION_RIGHT", "DEFAULT_CURVED_FACTOR", "DIVIDER_FILL", "DIVIDER_WRAP", "DIVIDER_WRAP_ALL", "MEASURED_BY_SAME_WIDTH", "MEASURED_BY_MAX_LENGTH", "MEASURED_BY_DEFAULT", "MEASURED_BY_SAME_WIDTH_WITH_NUM", "MEASURED_BY_MAX_LENGTH_WITH_NUM", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final CurvedArcDirection m80706b(int direction) {
            if (direction != 0) {
                return direction != 2 ? CurvedArcDirection.CENTER : CurvedArcDirection.RIGHT;
            }
            return CurvedArcDirection.LEFT;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final DividerType m80707c(int dividerType) {
            if (dividerType != 1) {
                return dividerType != 2 ? DividerType.FILL : DividerType.WRAP_ALL;
            }
            return DividerType.WRAP;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final Paint.Align m80708d(int align) {
            if (align != 0) {
                return align != 2 ? Paint.Align.CENTER : Paint.Align.RIGHT;
            }
            return Paint.Align.LEFT;
        }

        @JvmStatic
        /* JADX INFO: renamed from: e */
        public final int m80709e(int gravity) {
            if (gravity != 1) {
                return gravity != 2 ? 17 : 80;
            }
            return 48;
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final int m80710f(float dp) {
            return (int) TypedValue.applyDimension(1, dp, Resources.getSystem().getDisplayMetrics());
        }

        /* JADX INFO: renamed from: g */
        public final int m80711g() {
            return WheelView.f55164L1;
        }

        /* JADX INFO: renamed from: h */
        public final int m80712h() {
            return WheelView.f55160H1;
        }

        /* JADX INFO: renamed from: i */
        public final int m80713i() {
            return WheelView.f55163K1;
        }

        /* JADX INFO: renamed from: j */
        public final int m80714j() {
            return WheelView.f55161I1;
        }

        /* JADX INFO: renamed from: k */
        public final void m80715k() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: l */
        public final int m80716l(float sp) {
            return (int) TypedValue.applyDimension(2, sp, Resources.getSystem().getDisplayMetrics());
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.datepicker.WheelView$b */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/WheelView$b;", "Landroid/view/animation/Interpolator;", "<init>", "()V", "", "input", "getInterpolation", "(F)F", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class InterpolatorC13267b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float input) {
            float f = input - 1.0f;
            return (f * f * f * f * f) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.datepicker.WheelView$c */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C13268c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55271a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f55272b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f55273c;

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
            f55271a = iArr;
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
            f55272b = iArr2;
            int[] iArr3 = new int[DividerType.values().length];
            try {
                iArr3[DividerType.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[DividerType.WRAP_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f55273c = iArr3;
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
        this.scroller = new OverScroller(context, new InterpolatorC13267b());
        this.adjustScroller = new OverScroller(context, new DecelerateInterpolator(2.5f));
        this.soundHelper = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.feq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelView.m80614b();
            }
        });
        this.itemChangedPosition = -1;
        this.maxTextWidthMeasureType = MeasureType.DEFAULT;
        this.gravity = 17;
        int i2 = f55161I1;
        this.textSize = i2;
        this.minTextSize = f55162J1;
        Paint.Align align = Paint.Align.CENTER;
        this.textAlign = align;
        this.normalTextColor = -12303292;
        this.selectedTextColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
        int i3 = f55163K1;
        this.textPaddingLeft = i3;
        this.textPaddingRight = i3;
        this.visibleItems = 5;
        this.lineSpacing = f55160H1;
        this.dividerColor = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.dividerHeight = f55164L1;
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
        this.resizeArray = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.geq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelView.m80615c();
            }
        });
        m80670i0(context);
        textPaint.setTextAlign(align);
        textPaint2.setTextAlign(align);
        if (attributeSet != null) {
            m80666f0(context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m80608J0(WheelView wheelView, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: setSelectableRange");
            return;
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        wheelView.m80636H0(i, i2);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m80609L0(WheelView wheelView, int i, boolean z, int i2, int i3, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: setSelectedPosition");
            return;
        }
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 250;
        }
        wheelView.m80641K0(i, z, i2);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m80610N0(WheelView wheelView, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: setSelectedRange");
            return;
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        wheelView.m80644M0(i, i2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: O */
    public static final int m80611O(float f) {
        return INSTANCE.m80710f(f);
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m80612P0(WheelView wheelView, Typeface typeface, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: setTypeface");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        wheelView.m80646O0(typeface, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: Q0 */
    public static final int m80613Q0(float f) {
        return INSTANCE.m80716l(f);
    }

    /* JADX INFO: renamed from: b */
    public static euf0 m80614b() {
        return euf0.INSTANCE.m122568a();
    }

    /* JADX INFO: renamed from: c */
    public static SparseArray m80615c() {
        return new SparseArray();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ int m80617e0(WheelView wheelView, Object obj, boolean z, int i, Object obj2) {
        if (obj2 != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: indexOf");
            return 0;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wheelView.mo80665d0(obj, z);
    }

    private final int getCurrentPosition() {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var == null) {
            INSTANCE.m80715k();
            return -1;
        }
        if (s01Var.m127284c() == 0) {
            return -1;
        }
        int i = this.scrollOffsetY;
        int i2 = this.itemHeight;
        int iM80643M = (i < 0 ? (i - (i2 / 2)) / m80643M() : (i + (i2 / 2)) / m80643M()) % s01Var.m127284c();
        return iM80643M < 0 ? iM80643M + s01Var.m127284c() : iM80643M;
    }

    private final SparseArray<Float> getResizeArray() {
        return (SparseArray) this.resizeArray.getValue();
    }

    private final euf0 getSoundHelper() {
        return (euf0) this.soundHelper.getValue();
    }

    /* JADX INFO: renamed from: A */
    public final void m80621A(boolean isDataSetChanged) {
        int i;
        m80687r();
        m80699x();
        if (isDataSetChanged || (i = this.mainTextMaxWidth) <= 0 || this.originTextMaxWidth != i) {
            m80693u();
        }
        m80683p();
    }

    /* JADX INFO: renamed from: A0 */
    public void m80622A0(int state) {
    }

    /* JADX INFO: renamed from: B */
    public final void m80623B() {
        int i = this.centerY;
        int i2 = this.itemHeight;
        int i3 = this.dividerOffsetY;
        this.selectedItemTopLimit = (i - (i2 / 2)) - i3;
        this.selectedItemBottomLimit = i + (i2 / 2) + i3;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m80624B0() {
        if (this.isSoundEffect) {
            getSoundHelper().m122565c();
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m80625C(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = fontMetrics.ascent;
        return (int) (f + ((fontMetrics.descent - f) / 2.0f));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m80626C0() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
    }

    /* JADX INFO: renamed from: D */
    public final void m80627D() {
        if (this.isBoldForSelectedItem) {
            this.mainTextPaint.setTypeface(this.normalTypeface);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m80628D0() {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            getResizeArray().clear();
            int iM127284c = s01Var.m127284c();
            for (int i = 0; i < iM127284c; i++) {
                String strM183874m = s01Var.m183874m(s01Var.m127285d(i));
                int iMeasureText = (int) this.mainTextPaint.measureText(strM183874m);
                if (iMeasureText > this.mainTextMaxWidth) {
                    getResizeArray().put(i, Float.valueOf(m80634G0(strM183874m, iMeasureText)));
                }
            }
            this.mainTextPaint.setTextSize(this.textSize);
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m80629E(String oriText) {
        String string;
        if (oriText == null || StringsKt.m94324Z0(oriText).toString().length() == 0) {
            return "";
        }
        if (this.isAutoFitTextSize) {
            return oriText;
        }
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(oriText, this.mainTextPaint, this.mainTextMaxWidth, TextUtils.TruncateAt.END);
        return (charSequenceEllipsize == null || (string = charSequenceEllipsize.toString()) == null) ? "" : string;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m80630E0(OverRangeMode overRangeMode) {
        OverRangeMode overRangeMode2 = this.mOverRangeMode;
        if (overRangeMode2 == OverRangeMode.HIDE_ITEM || overRangeMode != overRangeMode2) {
            s01<?> s01Var = this.wheelAdapter;
            if (s01Var != null) {
                s01Var.m127292k(-1, -1);
            }
            m80694u0();
        }
        this.mOverRangeMode = overRangeMode;
    }

    /* JADX INFO: renamed from: F */
    public final void m80631F() {
        if (!this.scroller.isFinished() || !this.adjustScroller.isFinished() || this.isForceFinishScroll || this.isFlingScroll || this.itemHeight == 0) {
            return;
        }
        this.currentScrollState = 0;
        m80622A0(0);
        on50 on50Var = this.scrollChangedListener;
        if (on50Var != null) {
            on50Var.mo166520b(this, 0);
        }
        int currentPosition = getCurrentPosition();
        if (currentPosition == this.selectedPosition) {
            return;
        }
        this.selectedPosition = currentPosition;
        this.currentScrollPosition = currentPosition;
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            s01Var.m183883v(currentPosition);
            if (m80637I(s01Var)) {
                m80702y0(s01Var, this.selectedPosition);
                pm50 pm50Var = this.itemSelectedListener;
                if (pm50Var != null) {
                    pm50Var.mo163801c(this, s01Var, this.selectedPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m80632F0() {
        if (this.isBoldForSelectedItem) {
            this.mainTextPaint.setTypeface(this.boldTypeface);
        }
    }

    /* JADX INFO: renamed from: G */
    public final int m80633G(int position) {
        if (!m80684p0()) {
            if (this.mOverRangeMode == OverRangeMode.HIDE_ITEM) {
                int i = this.minSelectedPosition;
                int i2 = this.maxSelectedPosition;
                if (position > i2 || i > position) {
                    return position < i ? i : i2;
                }
                return position - i;
            }
            if (m80678m0(position)) {
                return this.minSelectedPosition;
            }
            s01<?> s01Var = this.wheelAdapter;
            if (s01Var != null && m80680n0(position, s01Var)) {
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
    public final float m80634G0(String measureText, int textWidth) {
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
    public final void m80635H() {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var == null) {
            INSTANCE.m80715k();
            return;
        }
        if (this.isResetSelectedPosition || s01Var.m127284c() <= 0) {
            this.selectedPosition = 0;
            this.currentScrollPosition = 0;
            s01Var.m183883v(0);
        } else if (this.selectedPosition >= s01Var.m127284c()) {
            int iM127284c = s01Var.m127284c() - 1;
            this.selectedPosition = iM127284c;
            this.currentScrollPosition = iM127284c;
            s01Var.m183883v(iM127284c);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: H0 */
    public final void m80636H0(@IntRange(from = 0) int min, @IntRange(from = 0) int max) {
        m80638I0(min, max, OverRangeMode.NORMAL);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m80637I(s01<?> adapter) {
        if (!m80684p0() && this.mOverRangeMode != OverRangeMode.HIDE_ITEM) {
            if (m80678m0(this.selectedPosition)) {
                m80609L0(this, this.minSelectedPosition, false, 0, 6, null);
                return false;
            }
            if (m80680n0(this.selectedPosition, adapter)) {
                m80609L0(this, this.maxSelectedPosition, false, 0, 6, null);
                return false;
            }
        }
        return true;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: I0 */
    public final void m80638I0(@IntRange(from = 0) int min, @IntRange(from = 0) int max, @NotNull OverRangeMode overRangeMode) {
        WheelView wheelView;
        overRangeMode.getClass();
        if (max < min) {
            max = min;
        }
        if (min < 0 && max < 0) {
            this.minSelectedPosition = -1;
            this.maxSelectedPosition = -1;
            m80630E0(overRangeMode);
            m80689s();
            return;
        }
        this.minSelectedPosition = Math.max(0, min);
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null && max >= s01Var.m127287f()) {
            max = s01Var.m127287f() - 1;
        }
        this.maxSelectedPosition = max;
        m80630E0(overRangeMode);
        if (overRangeMode == OverRangeMode.HIDE_ITEM) {
            s01<?> s01Var2 = this.wheelAdapter;
            if (s01Var2 != null) {
                s01Var2.m127292k(this.minSelectedPosition, this.maxSelectedPosition);
            }
            m80694u0();
        }
        int i = this.selectedPosition;
        int i2 = this.minSelectedPosition;
        if (i < i2) {
            wheelView = this;
            m80609L0(wheelView, i2, false, 0, 6, null);
        } else {
            wheelView = this;
            int i3 = wheelView.maxSelectedPosition;
            if (i > i3) {
                m80609L0(wheelView, i3, false, 0, 6, null);
            }
        }
        wheelView.m80689s();
    }

    /* JADX INFO: renamed from: J */
    public final void m80639J(Canvas canvas, String text, int clipTop, int clipBottom, float rotateX, float offsetY, float offsetZ, int centerToBaselineY) {
        canvas.save();
        canvas.clipRect(this.clipLeft, clipTop, this.clipRight, clipBottom);
        m80649R(canvas, text, rotateX, offsetY, offsetZ, centerToBaselineY);
        canvas.restore();
    }

    /* JADX INFO: renamed from: K */
    public final void m80640K(Canvas canvas, String text, int clipTop, int clipBottom, int item2CenterOffsetY, int centerToBaselineY) {
        canvas.save();
        canvas.clipRect(this.clipLeft, clipTop, this.clipRight, clipBottom);
        canvas.drawText(text, 0, text.length(), this.textDrawStartX, (this.centerY + item2CenterOffsetY) - centerToBaselineY, (Paint) this.mainTextPaint);
        canvas.restore();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: K0 */
    public final void m80641K0(int position, boolean isSmoothScroll, int smoothDuration) {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var == null || position < 0 || position >= s01Var.m127287f()) {
            return;
        }
        m80664d();
        int iM80633G = m80633G(position);
        int iM80681o = m80681o(iM80633G);
        if (iM80681o == 0) {
            if (this.itemHeight == 0) {
                this.selectedPosition = iM80633G;
                this.currentScrollPosition = iM80633G;
                s01<?> s01Var2 = this.wheelAdapter;
                if (s01Var2 != null) {
                    s01Var2.m183883v(iM80633G);
                    m80702y0(s01Var2, this.selectedPosition);
                    pm50 pm50Var = this.itemSelectedListener;
                    if (pm50Var != null) {
                        pm50Var.mo163801c(this, s01Var2, this.selectedPosition);
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
            overScroller.startScroll(0, i, 0, iM80681o, smoothDuration);
            m80674k0();
            kkl0.m150148b0(this, this);
            return;
        }
        m80645N(iM80681o);
        this.selectedPosition = iM80633G;
        this.currentScrollPosition = iM80633G;
        s01<?> s01Var3 = this.wheelAdapter;
        if (s01Var3 != null) {
            s01Var3.m183883v(iM80633G);
            m80702y0(s01Var3, this.selectedPosition);
            pm50 pm50Var2 = this.itemSelectedListener;
            if (pm50Var2 != null) {
                pm50Var2.mo163801c(this, s01Var3, this.selectedPosition);
            }
        }
        m80674k0();
    }

    /* JADX INFO: renamed from: L */
    public final void m80642L() {
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
    public final int m80643M() {
        int i = this.itemHeight;
        if (i > 0) {
            return i;
        }
        return 1;
    }

    @Deprecated
    @JvmOverloads
    /* JADX INFO: renamed from: M0 */
    public final void m80644M0(@IntRange(from = 0) int min, @IntRange(from = 0) int max) {
        m80636H0(min, max);
    }

    /* JADX INFO: renamed from: N */
    public final void m80645N(int distance) {
        this.scrollOffsetY += distance;
        m80642L();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: O0 */
    public final void m80646O0(@NotNull Typeface typeface, boolean isBoldForSelectedItem) {
        typeface.getClass();
        if (Intrinsics.m88377d(typeface, this.mainTextPaint.getTypeface()) && isBoldForSelectedItem == this.isBoldForSelectedItem) {
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
        m80690s0();
    }

    /* JADX INFO: renamed from: P */
    public final void m80647P(Canvas canvas) {
        if (this.isShowCurtain) {
            this.normalPaint.setColor(this.curtainColor);
            int i = C13268c.f55272b[this.direction.ordinal()];
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
                m80657X(canvas, this.CORNER_TOP_LEFT | this.CORNER_BOTTOM_LEFT);
            } else if (i == 3) {
                m80657X(canvas, this.CORNER_TOP_RIGHT | this.CORNER_BOTTOM_RIGHT);
            } else {
                nbr.m162172a();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m80648Q(Canvas canvas, int index, int scrolledOffset, int scrolledItem) {
        WheelView wheelView;
        s01<?> s01Var = this.wheelAdapter;
        String strM80629E = m80629E(s01Var != null ? s01Var.m183875n(index) : null);
        if (StringsKt.m94324Z0(strM80629E).toString().length() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(this.prefixText)) {
            strM80629E = this.prefixText + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM80629E;
        }
        String str = strM80629E;
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
        int iM80661a0 = m80661a0(index);
        if (Math.abs(i) <= 0) {
            this.mainTextPaint.setColor(this.selectedTextColor);
            this.mainTextPaint.setAlpha(255);
            wheelView = this;
            wheelView.m80639J(canvas, str, this.selectedItemTopLimit, this.selectedItemBottomLimit, degrees, fSin, fCos, iM80661a0);
        } else {
            wheelView = this;
            if (1 <= i && i < wheelView.itemHeight) {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.mainTextPaint.setAlpha(255);
                wheelView.m80639J(canvas, str, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, degrees, fSin, fCos, iM80661a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize);
                wheelView.m80627D();
                wheelView.m80639J(canvas, str, wheelView.selectedItemBottomLimit, wheelView.clipBottom, degrees, fSin, fCos, wheelView.m80625C(wheelView.mainTextPaint));
                wheelView.mainTextPaint.setTextSize(textSize);
                wheelView.m80632F0();
            } else if (i >= 0 || i <= (-wheelView.itemHeight)) {
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize2 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize2);
                wheelView.m80627D();
                wheelView.m80639J(canvas, str, wheelView.clipTop, wheelView.clipBottom, degrees, fSin, fCos, wheelView.m80625C(wheelView.mainTextPaint));
                wheelView.mainTextPaint.setTextSize(textSize2);
                wheelView.m80632F0();
            } else {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.mainTextPaint.setAlpha(255);
                wheelView.m80639J(canvas, str, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, degrees, fSin, fCos, iM80661a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize3 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize3);
                wheelView.m80627D();
                wheelView.m80639J(canvas, str, wheelView.clipTop, wheelView.selectedItemTopLimit, degrees, fSin, fCos, wheelView.m80625C(wheelView.mainTextPaint));
                wheelView.mainTextPaint.setTextSize(textSize3);
                wheelView.m80632F0();
            }
        }
        if (wheelView.isAutoFitTextSize) {
            wheelView.mainTextPaint.setTextSize(wheelView.textSize);
            wheelView.textDrawStartX = i2;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m80649R(Canvas canvas, String text, float rotateX, float offsetY, float offsetZ, int centerToBaselineY) {
        float f;
        float f2;
        float f3;
        this.cameraForCurved.save();
        this.cameraForCurved.translate(0.0f, 0.0f, offsetZ);
        this.cameraForCurved.rotateX(rotateX);
        this.cameraForCurved.getMatrix(this.matrixForCurved);
        this.cameraForCurved.restore();
        int iCenterX = this.mainTextRect.centerX();
        int i = C13268c.f55272b[this.curvedArcDirection.ordinal()];
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
    public final void m80650R0(OverScroller scroller) {
        int i = this.scrollOffsetY;
        int currY = scroller.getCurrY();
        this.scrollOffsetY = currY;
        if (i != currY) {
            this.currentScrollState = 2;
            m80622A0(2);
            on50 on50Var = this.scrollChangedListener;
            if (on50Var != null) {
                on50Var.mo166520b(this, 2);
            }
        }
        m80674k0();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062 A[PHI: r2 r3
      0x0062: PHI (r2v13 float) = (r2v9 float), (r2v20 float) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r3v3 int) = (r3v2 int), (r3v9 int) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0064 A[PHI: r1 r2
      0x0064: PHI (r1v10 int) = (r1v9 int), (r1v19 int) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r2v11 float) = (r2v9 float), (r2v20 float) binds: [B:24:0x007b, B:15:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: S */
    public final void m80651S(Canvas canvas) {
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
            int i3 = C13268c.f55273c[this.dividerType.ordinal()];
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
    public final void m80652S0() {
        this.mainTextPaint.setTextAlign(this.textAlign);
    }

    /* JADX INFO: renamed from: T */
    public final void m80653T(Canvas canvas) {
        if (this.leftText.length() == 0) {
            return;
        }
        this.leftTextPaint.setTextSize(this.leftTextSize);
        this.leftTextPaint.setColor(this.leftTextColor);
        int iM80625C = m80625C(this.leftTextPaint);
        CharSequence charSequence = this.leftText;
        canvas.drawText(charSequence, 0, charSequence.length(), this.leftTextRect.centerX(), this.leftTextRect.centerY() - iM80625C, this.leftTextPaint);
    }

    /* JADX INFO: renamed from: U */
    public final void m80654U(Canvas canvas) {
        if (this.rightText.length() == 0) {
            return;
        }
        this.rightTextPaint.setTextSize(this.rightTextSize);
        this.rightTextPaint.setColor(this.rightTextColor);
        int iM80625C = m80625C(this.rightTextPaint);
        CharSequence charSequence = this.rightText;
        canvas.drawText(charSequence, 0, charSequence.length(), this.rightTextRect.centerX(), this.rightTextRect.centerY() - iM80625C, this.rightTextPaint);
    }

    /* JADX INFO: renamed from: V */
    public final void m80655V(Canvas canvas) {
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
        m80653T(canvas);
        m80654U(canvas);
    }

    /* JADX INFO: renamed from: W */
    public final void m80656W(Canvas canvas, int index, int scrolledOffset, int scrolledItem) {
        WheelView wheelView;
        s01<?> s01Var = this.wheelAdapter;
        String strM80629E = m80629E(s01Var != null ? s01Var.m183875n(index) : null);
        if (StringsKt.m94324Z0(strM80629E).toString().length() == 0) {
            return;
        }
        int i = ((index - scrolledItem) * this.itemHeight) - scrolledOffset;
        int i2 = this.textDrawStartX;
        int iM80661a0 = m80661a0(index);
        if (Math.abs(i) <= 0) {
            this.mainTextPaint.setColor(this.selectedTextColor);
            wheelView = this;
            wheelView.m80640K(canvas, strM80629E, this.selectedItemTopLimit, this.selectedItemBottomLimit, i, iM80661a0);
        } else {
            wheelView = this;
            if (1 <= i && i < wheelView.itemHeight) {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.m80640K(canvas, strM80629E, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, i, iM80661a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize);
                wheelView.m80627D();
                wheelView.m80640K(canvas, strM80629E, wheelView.selectedItemBottomLimit, wheelView.clipBottom, i, iM80661a0);
                wheelView.mainTextPaint.setTextSize(textSize);
                wheelView.m80632F0();
            } else if (i >= 0 || i <= (-wheelView.itemHeight)) {
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize2 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize2);
                wheelView.m80627D();
                wheelView.m80640K(canvas, strM80629E, wheelView.clipTop, wheelView.clipBottom, i, iM80661a0);
                wheelView.mainTextPaint.setTextSize(textSize2);
                wheelView.m80632F0();
            } else {
                wheelView.mainTextPaint.setColor(wheelView.selectedTextColor);
                wheelView.m80640K(canvas, strM80629E, wheelView.selectedItemTopLimit, wheelView.selectedItemBottomLimit, i, iM80661a0);
                wheelView.mainTextPaint.setColor(wheelView.normalTextColor);
                float textSize3 = wheelView.mainTextPaint.getTextSize();
                wheelView.mainTextPaint.setTextSize(wheelView.refractRatio * textSize3);
                wheelView.m80627D();
                wheelView.m80640K(canvas, strM80629E, wheelView.clipTop, wheelView.selectedItemTopLimit, i, iM80661a0);
                wheelView.mainTextPaint.setTextSize(textSize3);
                wheelView.m80632F0();
            }
        }
        if (wheelView.isAutoFitTextSize) {
            wheelView.mainTextPaint.setTextSize(wheelView.textSize);
            wheelView.textDrawStartX = i2;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m80657X(Canvas canvas, int corners) {
        float fM80611O = m80611O(10.0f);
        float[] fArr = {fM80611O, fM80611O, fM80611O, fM80611O, fM80611O, fM80611O, fM80611O, fM80611O};
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
    public final void m80658Y() {
        m80659Z(false);
    }

    /* JADX INFO: renamed from: Z */
    public final void m80659Z(boolean isMarkForceFinish) {
        this.isFlingScroll = false;
        if (!this.scroller.isFinished()) {
            this.scroller.forceFinished(true);
            m80650R0(this.scroller);
            m80671j(false);
        }
        if (!this.adjustScroller.isFinished()) {
            this.adjustScroller.forceFinished(true);
            m80650R0(this.adjustScroller);
            m80671j(false);
        }
        if (isMarkForceFinish) {
            this.isForceFinishScroll = true;
        }
    }

    @Override // p153l.s01.InterfaceC19946a
    /* JADX INFO: renamed from: a */
    public void mo80660a() {
        m80658Y();
        m80631F();
    }

    /* JADX INFO: renamed from: a0 */
    public final int m80661a0(int index) {
        if (!this.isAutoFitTextSize) {
            return m80625C(this.mainTextPaint);
        }
        Float f = getResizeArray().get(index);
        TextPaint textPaint = this.mainTextPaint;
        if (f == null) {
            return m80625C(textPaint);
        }
        textPaint.setTextSize(f.floatValue());
        return m80625C(this.mainTextPaint);
    }

    @Nullable
    /* JADX INFO: renamed from: b0 */
    public final <V> V m80662b0(int position) {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            return (V) s01Var.m183873l(position);
        }
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public final int m80663c0(int position) {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var == null) {
            INSTANCE.m80715k();
            return 0;
        }
        if (s01Var.m127284c() == 0) {
            return 0;
        }
        int iM127284c = s01Var.m127284c();
        if (this.scrollOffsetY < 0) {
            position -= iM127284c;
        }
        if (Math.abs(position) < iM127284c) {
            position %= s01Var.m127284c();
        }
        return position * this.itemHeight;
    }

    /* JADX INFO: renamed from: d */
    public final void m80664d() {
        this.isFlingScroll = false;
        if (!this.scroller.isFinished()) {
            this.scroller.abortAnimation();
            m80650R0(this.scroller);
            m80671j(false);
        }
        if (this.adjustScroller.isFinished()) {
            return;
        }
        this.adjustScroller.abortAnimation();
        m80650R0(this.adjustScroller);
        m80671j(false);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d0 */
    public int mo80665d0(@Nullable Object item, boolean isCompareFormatText) {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            return s01Var.m183877p(item, isCompareFormatText);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m80666f0(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, jhc0.f120853I0);
        typedArrayObtainStyledAttributes.getClass();
        int i = jhc0.f120950u1;
        int i2 = f55161I1;
        setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(i, i2));
        setAutoFitTextSize(typedArrayObtainStyledAttributes.getBoolean(jhc0.f120857K0, false));
        setMinTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120905f1, f55162J1));
        Companion companion = INSTANCE;
        setTextAlign(companion.m80708d(typedArrayObtainStyledAttributes.getInt(jhc0.f120938q1, 1)));
        int i3 = jhc0.f120941r1;
        int i4 = f55163K1;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, i4);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120944s1, i4);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120947t1, i4);
        if (dimensionPixelSize > 0) {
            setTextPaddingLeft(dimensionPixelSize);
            setTextPaddingRight(dimensionPixelSize);
        } else {
            setTextPaddingLeft(dimensionPixelSize2);
            setTextPaddingRight(dimensionPixelSize3);
        }
        String string = typedArrayObtainStyledAttributes.getString(jhc0.f120883X0);
        if (string == null) {
            string = "";
        }
        setLeftText(string);
        String string2 = typedArrayObtainStyledAttributes.getString(jhc0.f120914i1);
        setRightText(string2 != null ? string2 : "");
        setLeftTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120893b1, i2));
        setRightTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120926m1, i2));
        setLeftTextMarginRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120890a1, i4));
        setRightTextMarginLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120923l1, i4));
        setLeftTextColor(typedArrayObtainStyledAttributes.getColor(jhc0.f120885Y0, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setRightTextColor(typedArrayObtainStyledAttributes.getColor(jhc0.f120917j1, RoundedDrawable.DEFAULT_BORDER_COLOR));
        int i5 = typedArrayObtainStyledAttributes.getInt(jhc0.f120887Z0, 0);
        int i6 = typedArrayObtainStyledAttributes.getInt(jhc0.f120920k1, 0);
        setLeftTextGravity(companion.m80709e(i5));
        setRightTextGravity(companion.m80709e(i6));
        setGravity(typedArrayObtainStyledAttributes.getInt(jhc0.f120855J0, 17));
        setNormalTextColor(typedArrayObtainStyledAttributes.getColor(jhc0.f120908g1, -12303292));
        setSelectedTextColor(typedArrayObtainStyledAttributes.getColor(jhc0.f120932o1, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setLineSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120896c1, f55160H1));
        setVisibleItems(typedArrayObtainStyledAttributes.getInt(jhc0.f120953v1, 5));
        setVisibleItems(m80673k(this.visibleItems));
        m80668h0(typedArrayObtainStyledAttributes.getInt(jhc0.f120929n1, 0), typedArrayObtainStyledAttributes.getInt(jhc0.f120902e1, -1), typedArrayObtainStyledAttributes.getInt(jhc0.f120899d1, -1));
        setCyclic(typedArrayObtainStyledAttributes.getBoolean(jhc0.f120869Q0, false));
        setShowDivider(typedArrayObtainStyledAttributes.getBoolean(jhc0.f120935p1, false));
        setDividerType(companion.m80707c(typedArrayObtainStyledAttributes.getInt(jhc0.f120879V0, 0)));
        setDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120873S0, f55164L1));
        setDividerColor(typedArrayObtainStyledAttributes.getColor(jhc0.f120871R0, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setDividerPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120877U0, i4));
        setDividerOffsetY(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120875T0, 0));
        setShowCurtain(typedArrayObtainStyledAttributes.getBoolean(jhc0.f120881W0, false));
        setCurtainColor(typedArrayObtainStyledAttributes.getColor(jhc0.f120859L0, 0));
        setCurtainRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(jhc0.f120861M0, 0));
        setCurved(typedArrayObtainStyledAttributes.getBoolean(jhc0.f120863N0, true));
        setCurvedArcDirection(companion.m80706b(typedArrayObtainStyledAttributes.getInt(jhc0.f120865O0, 1)));
        setCurvedArcDirectionFactor(typedArrayObtainStyledAttributes.getFloat(jhc0.f120867P0, 0.75f));
        setRefractRatio(typedArrayObtainStyledAttributes.getFloat(jhc0.f120911h1, 1.0f));
        float f = this.refractRatio;
        if (f > 1.0f || f < 0.0f) {
            setRefractRatio(1.0f);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m80667g0() {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager == null) {
            getSoundHelper().m122567e(0.3f);
            return;
        }
        getSoundHelper().m122567e((audioManager.getStreamVolume(3) * 1.0f) / audioManager.getStreamMaxVolume(3));
    }

    @Nullable
    public final s01<?> getAdapter() {
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
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            return s01Var.m127284c();
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
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            return (T) s01Var.m183876o();
        }
        return null;
    }

    public final int getSelectedPosition() {
        mo80660a();
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
    public final void m80668h0(int selectedPosition, int minSelectedPosition, int maxSelectedPosition) {
        this.minSelectedPosition = minSelectedPosition;
        this.maxSelectedPosition = maxSelectedPosition;
        int iM80633G = m80633G(selectedPosition);
        this.selectedPosition = iM80633G;
        this.currentScrollPosition = iM80633G;
    }

    /* JADX INFO: renamed from: i */
    public final void m80669i(int deltaY) {
        this.adjustScroller.startScroll(0, this.scrollOffsetY, 0, deltaY, 250);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m80670i0(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        m80652S0();
    }

    /* JADX INFO: renamed from: j */
    public final void m80671j(boolean isAnimate) {
        int iM80643M = this.scrollOffsetY % m80643M();
        if (iM80643M != 0) {
            int iM80677m = m80677m(iM80643M);
            if (isAnimate) {
                m80669i(iM80677m);
            } else {
                this.scrollOffsetY += iM80677m;
            }
        }
        m80674k0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m80672j0() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m80673k(int visibleItems) {
        return Math.abs(((visibleItems / 2) * 2) + 1);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m80674k0() {
        int i = this.scrollOffsetY;
        if (i != this.scrolledY) {
            this.scrolledY = i;
            mo80704z0(i);
            on50 on50Var = this.scrollChangedListener;
            if (on50Var != null) {
                on50Var.mo166518a(this, this.scrollOffsetY);
            }
            m80698w0();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m80675l(int dataHeight, int deltaDistance) {
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
    public final int m80677m(int remainder) {
        int iAbs = Math.abs(remainder);
        int i = this.itemHeight;
        if (iAbs > i / 2) {
            return this.scrollOffsetY < 0 ? (-i) - remainder : i - remainder;
        }
        return -remainder;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m80678m0(int position) {
        int i = this.minSelectedPosition;
        return i >= 0 && position < i;
    }

    /* JADX INFO: renamed from: n */
    public final void m80679n() {
        int iCenterX;
        int i = C13268c.f55271a[this.textAlign.ordinal()];
        if (i != 1) {
            Rect rect = this.mainTextRect;
            iCenterX = i != 2 ? rect.centerX() : rect.right;
        } else {
            iCenterX = this.mainTextRect.left;
        }
        this.textDrawStartX = iCenterX;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m80680n0(int position, s01<?> adapter) {
        int i = this.maxSelectedPosition;
        return i >= 0 && i < adapter.m127284c() && position > this.maxSelectedPosition;
    }

    /* JADX INFO: renamed from: o */
    public final int m80681o(int position) {
        if (!this.isCyclic) {
            return (position * this.itemHeight) - this.scrollOffsetY;
        }
        s01<?> s01Var = this.wheelAdapter;
        int iM127287f = s01Var != null ? s01Var.m127287f() : 0;
        int i = this.itemHeight;
        int i2 = iM127287f * i;
        int i3 = this.scrollOffsetY;
        int i4 = i3 % (i2 == 0 ? 1 : i2);
        int i5 = position * i;
        if (i3 < 0 && i4 != 0) {
            i5 = -(i2 - i5);
        }
        return m80675l(i2, i5 - i4);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m80682o0(int position) {
        if (this.wheelAdapter != null) {
            int iM80663c0 = m80663c0(position);
            int i = this.itemHeight / 6;
            int i2 = this.scrollOffsetY;
            s01<?> s01Var = this.wheelAdapter;
            s01Var.getClass();
            int iM127284c = i2 % (s01Var.m127284c() * this.itemHeight);
            int i3 = iM80663c0 - i;
            if (iM127284c <= iM80663c0 + i && i3 <= iM127284c) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSoundHelper().m122566d();
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
        m80647P(canvas);
        m80651S(canvas);
        m80655V(canvas);
        int iM80643M = this.scrollOffsetY / m80643M();
        int iM80643M2 = this.scrollOffsetY % m80643M();
        int i3 = (this.visibleItems + 1) / 2;
        if (iM80643M2 >= 0) {
            if (iM80643M2 > 0) {
                i = iM80643M - i3;
                i2 = i3 + iM80643M + 1;
            } else {
                i = iM80643M - i3;
            }
            while (i < i2) {
                if (this.isCurved) {
                    m80648Q(canvas, i, iM80643M2, iM80643M);
                } else {
                    m80656W(canvas, i, iM80643M2, iM80643M);
                }
                i++;
            }
        }
        i = (iM80643M - i3) - 1;
        i2 = i3 + iM80643M;
        while (i < i2) {
            if (this.isCurved) {
                m80648Q(canvas, i, iM80643M2, iM80643M);
            } else {
                m80656W(canvas, i, iM80643M2, iM80643M);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        CurvedArcDirection curvedArcDirection;
        m80621A(this.isDataSetChanged);
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
            m80628D0();
        }
        m80623B();
        m80703z();
        m80689s();
        m80701y();
        m80642L();
        this.isDataSetChanged = false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        s01<?> s01Var;
        if (!isEnabled() || (s01Var = this.wheelAdapter) == null || ((s01Var != null && s01Var.m127284c() == 0) || event == null)) {
            return super.onTouchEvent(event);
        }
        m80672j0();
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
            m80659Z(true);
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
                m80658Y();
                this.isFlingScroll = true;
                this.scroller.fling(0, this.scrollOffsetY, 0, -yVelocity, 0, 0, this.minScrollY, this.maxScrollY);
            } else {
                int y = SystemClock.elapsedRealtime() - this.downStartTime <= 120 ? (int) (event.getY() - this.centerY) : 0;
                int iM80677m = y + m80677m((this.scrollOffsetY + y) % m80643M());
                boolean z2 = iM80677m < 0 && this.scrollOffsetY + iM80677m >= this.minScrollY;
                if (iM80677m > 0 && this.scrollOffsetY + iM80677m <= this.maxScrollY) {
                    z = true;
                }
                if (z2 || z) {
                    m80669i(iM80677m);
                }
            }
            m80674k0();
            kkl0.m150148b0(this, this);
            m80626C0();
        } else if (actionMasked == 2) {
            float y2 = event.getY();
            float f = y2 - this.lastTouchY;
            this.currentScrollState = 1;
            m80622A0(1);
            on50 on50Var = this.scrollChangedListener;
            if (on50Var != null) {
                on50Var.mo166520b(this, 1);
            }
            if (Math.abs(f) < 1.0f) {
                return false;
            }
            m80645N((int) (-f));
            this.lastTouchY = y2;
            m80674k0();
        } else if (actionMasked == 3) {
            m80626C0();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m80683p() {
        this.itemHeight = (int) ((this.mainTextPaint.getFontMetrics().bottom - this.mainTextPaint.getFontMetrics().top) + this.lineSpacing);
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m80684p0() {
        return this.maxSelectedPosition < 0 && this.minSelectedPosition < 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m80685q() {
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
    public final int m80686q0(s01<?> adapter) {
        int i = this.maxSelectedPosition;
        return (i < 0 || i >= adapter.m127284c() || this.mOverRangeMode != OverRangeMode.CANT_SCROLL) ? adapter.m127284c() - 1 : this.maxSelectedPosition;
    }

    /* JADX INFO: renamed from: r */
    public final void m80687r() {
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
    public final int m80688r0(s01<?> adapter) {
        int i = this.maxSelectedPosition;
        int i2 = this.minSelectedPosition;
        if (i2 < 0 || i2 >= i || i >= adapter.m127284c() || this.mOverRangeMode != OverRangeMode.CANT_SCROLL) {
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
        m80631F();
        if (overScroller.computeScrollOffset()) {
            m80650R0(overScroller);
            kkl0.m150148b0(this, this);
        } else if (this.isFlingScroll) {
            this.isFlingScroll = false;
            m80671j(true);
            kkl0.m150148b0(this, this);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m80689s() {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var == null) {
            INSTANCE.m80715k();
        } else {
            this.minScrollY = this.isCyclic ? Integer.MIN_VALUE : m80688r0(s01Var) * this.itemHeight;
            this.maxScrollY = this.isCyclic ? Api.BaseClientBuilder.API_PRIORITY_OTHER : m80686q0(s01Var) * this.itemHeight;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m80690s0() {
        if (this.wheelAdapter != null) {
            m80658Y();
            requestLayout();
            invalidate();
        }
    }

    public final void setAdapter(@NotNull s01<?> adapter) {
        adapter.getClass();
        this.wheelAdapter = adapter;
        if (adapter != null) {
            adapter.m183884w(this.textFormatter);
            adapter.m183880s(this.formatterBlock);
            adapter.m127290i(this.isCyclic);
            adapter.m183883v(this.selectedPosition);
            adapter.m183879r(this);
            m80635H();
            m80694u0();
        }
    }

    public final void setAutoFitTextSize(boolean z) {
        this.isAutoFitTextSize = z;
        m80694u0();
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
        setCurtainColor(j26.m143190c(getContext(), curtainColorRes));
    }

    public final void setCurtainRadius(int i) {
        if (i == this.curtainRadius) {
            return;
        }
        this.curtainRadius = i;
        m80690s0();
    }

    public final void setCurved(boolean z) {
        if (z == this.isCurved) {
            return;
        }
        this.isCurved = z;
        m80683p();
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
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            s01Var.m127290i(z);
        }
        m80692t0();
    }

    public final <T> void setData(@NotNull List<? extends T> data) {
        data.getClass();
        setAdapter(new s01<>(data));
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
        setDividerColor(j26.m143190c(getContext(), dividerColorRes));
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
            m80623B();
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
        m80694u0();
    }

    public final void setItemIndexer(@NotNull Function2<? super s01<?>, Object, Integer> indexerBlock) {
        indexerBlock.getClass();
        this.itemIndexerBlock = indexerBlock;
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            s01Var.m183882u(indexerBlock);
        }
    }

    public final void setLeftText(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        if (Intrinsics.m88377d(charSequence, this.leftText)) {
            return;
        }
        this.leftText = charSequence;
        m80690s0();
    }

    public final void setLeftTextColor(int i) {
        if (i == this.leftTextColor) {
            return;
        }
        this.leftTextColor = i;
        invalidate();
    }

    public final void setLeftTextColorRes(@ColorRes int leftTextColorRes) {
        setLeftTextColor(j26.m143190c(getContext(), leftTextColorRes));
    }

    public final void setLeftTextGravity(int i) {
        if (i == this.leftTextGravity) {
            return;
        }
        this.leftTextGravity = i;
        m80685q();
        invalidate();
    }

    public final void setLeftTextMarginRight(int i) {
        if (i == this.leftTextMarginRight) {
            return;
        }
        this.leftTextMarginRight = i;
        m80690s0();
    }

    public final void setLeftTextSize(int i) {
        if (i == this.leftTextSize) {
            return;
        }
        this.leftTextSize = i;
        m80690s0();
    }

    public final void setLeftTypeface(@NotNull Typeface typeface) {
        typeface.getClass();
        if (Intrinsics.m88377d(typeface, this.leftTextPaint.getTypeface())) {
            return;
        }
        this.leftTextPaint.setTypeface(typeface);
        m80690s0();
    }

    public final void setLineSpacing(int i) {
        if (i == this.lineSpacing) {
            return;
        }
        this.lineSpacing = i;
        m80690s0();
    }

    public final void setMaxTextWidthMeasureType(@NotNull MeasureType measureType) {
        measureType.getClass();
        if (measureType == this.maxTextWidthMeasureType) {
            return;
        }
        this.maxTextWidthMeasureType = measureType;
        m80690s0();
    }

    public final void setMinTextSize(int i) {
        if (i == this.minTextSize) {
            return;
        }
        this.minTextSize = i;
        m80690s0();
    }

    public final void setNormalTextColor(int i) {
        if (i == this.normalTextColor) {
            return;
        }
        this.normalTextColor = i;
        invalidate();
    }

    public final void setNormalTextColorRes(@ColorRes int normalColorRes) {
        setNormalTextColor(j26.m143190c(getContext(), normalColorRes));
    }

    public final void setOnItemSelectedListener(@Nullable pm50 itemSelectedListener) {
        this.itemSelectedListener = itemSelectedListener;
    }

    public final void setOnScrollChangedListener(@Nullable on50 scrollChangedListener) {
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
        if (Intrinsics.m88377d(charSequence, this.rightText)) {
            return;
        }
        this.rightText = charSequence;
        m80690s0();
    }

    public final void setRightTextColor(int i) {
        if (i == this.rightTextColor) {
            return;
        }
        this.rightTextColor = i;
        invalidate();
    }

    public final void setRightTextColorRes(@ColorRes int rightTextColorRes) {
        setRightTextColor(j26.m143190c(getContext(), rightTextColorRes));
    }

    public final void setRightTextGravity(int i) {
        if (i == this.rightTextGravity) {
            return;
        }
        this.rightTextGravity = i;
        m80697w();
        invalidate();
    }

    public final void setRightTextMarginLeft(int i) {
        if (i == this.rightTextMarginLeft) {
            return;
        }
        this.rightTextMarginLeft = i;
        m80690s0();
    }

    public final void setRightTextSize(int i) {
        if (i == this.rightTextSize) {
            return;
        }
        this.rightTextSize = i;
        m80690s0();
    }

    public final void setRightTypeface(@NotNull Typeface typeface) {
        typeface.getClass();
        if (Intrinsics.m88377d(typeface, this.rightTextPaint.getTypeface())) {
            return;
        }
        this.rightTextPaint.setTypeface(typeface);
        m80690s0();
    }

    @JvmOverloads
    public final void setSelectableRange(@IntRange(from = 0) int i) {
        m80608J0(this, 0, i, 1, null);
    }

    @JvmOverloads
    public final void setSelectedPosition(int i) {
        m80609L0(this, i, false, 0, 6, null);
    }

    @Deprecated
    @JvmOverloads
    public final void setSelectedRange(@IntRange(from = 0) int i) {
        m80610N0(this, 0, i, 1, null);
    }

    public final void setSelectedTextColor(int i) {
        if (i == this.selectedTextColor) {
            return;
        }
        this.selectedTextColor = i;
        invalidate();
    }

    public final void setSelectedTextColorRes(@ColorRes int selectedColorRes) {
        setSelectedTextColor(j26.m143190c(getContext(), selectedColorRes));
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
            m80623B();
        }
        invalidate();
    }

    public final void setSoundEffect(boolean z) {
        this.isSoundEffect = z;
        if (getSoundHelper().getSoundPlayVolume() == 0.0f) {
            m80667g0();
        }
    }

    public final void setSoundResource(@RawRes int soundRes) {
        euf0 soundHelper = getSoundHelper();
        Context context = getContext();
        context.getClass();
        soundHelper.m122564b(context, soundRes);
    }

    public final void setSoundVolume(float playVolume) {
        getSoundHelper().m122567e(Math.min(1.0f, Math.max(0.0f, playVolume)));
    }

    public final void setTextAlign(@NotNull Paint.Align align) {
        align.getClass();
        if (align == this.textAlign) {
            return;
        }
        this.textAlign = align;
        m80696v0();
    }

    public final void setTextFormatter(@NotNull vri0 textFormatter) {
        textFormatter.getClass();
        this.textFormatter = textFormatter;
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            s01Var.m183884w(textFormatter);
            m80635H();
            m80694u0();
        }
    }

    public final void setTextPadding(float textPaddingDp) {
        int iM80611O = m80611O(textPaddingDp);
        setTextPaddingLeft(iM80611O);
        setTextPaddingRight(iM80611O);
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
        m80694u0();
    }

    @JvmOverloads
    public final void setTypeface(@NotNull Typeface typeface) {
        typeface.getClass();
        m80612P0(this, typeface, false, 2, null);
    }

    public final void setVisibleItems(int i) {
        int iM80673k = m80673k(i);
        if (iM80673k == this.visibleItems) {
            return;
        }
        this.visibleItems = iM80673k;
        m80690s0();
    }

    /* JADX INFO: renamed from: t */
    public final int m80691t(String itemText) {
        return fhx.m125609b(this.mainTextPaint.measureText(new Regex("\\d").replace(itemText, String.valueOf(m80695v()))));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m80692t0() {
        m80658Y();
        m80689s();
        m80701y();
        if (this.mOverRangeMode != OverRangeMode.HIDE_ITEM) {
            invalidate();
            return;
        }
        this.isDataSetChanged = true;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m80693u() {
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var == null) {
            INSTANCE.m80715k();
            return;
        }
        if (s01Var.m127284c() == 0) {
            return;
        }
        this.mainTextMaxWidth = 0;
        this.mainTextPaint.setTextSize(this.textSize);
        MeasureType measureType = this.maxTextWidthMeasureType;
        if (measureType == MeasureType.SAME_WIDTH) {
            this.mainTextMaxWidth = (int) this.mainTextPaint.measureText(s01Var.m183874m(s01Var.m127285d(0)));
        } else if (measureType == MeasureType.SAME_WIDTH_WITH_NUM) {
            this.mainTextMaxWidth = m80691t(s01Var.m183874m(s01Var.m127285d(0)));
        } else {
            int iM127284c = s01Var.m127284c();
            int length = -1;
            for (int i = 0; i < iM127284c; i++) {
                String strM183874m = s01Var.m183874m(s01Var.m127285d(i));
                MeasureType measureType2 = this.maxTextWidthMeasureType;
                if ((measureType2 != MeasureType.MAX_LENGTH && measureType2 != MeasureType.MAX_LENGTH_WITH_NUM) || strM183874m.length() > length) {
                    length = strM183874m.length();
                    if (this.maxTextWidthMeasureType == MeasureType.MAX_LENGTH_WITH_NUM) {
                        strM183874m = new Regex("\\d").replace(strM183874m, String.valueOf(m80695v()));
                    }
                    if (!TextUtils.isEmpty(this.prefixText)) {
                        strM183874m = this.prefixText + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + strM183874m;
                    }
                    this.mainTextMaxWidth = Math.max((int) this.mainTextPaint.measureText(strM183874m), this.mainTextMaxWidth);
                }
            }
        }
        this.originTextMaxWidth = this.mainTextMaxWidth;
        this.mainTextHeight = (int) (this.mainTextPaint.getFontMetrics().bottom - this.mainTextPaint.getFontMetrics().top);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m80694u0() {
        if (this.wheelAdapter != null) {
            this.isDataSetChanged = true;
            m80658Y();
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m80695v() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            int iM125609b = fhx.m125609b(this.mainTextPaint.measureText(String.valueOf(i3)));
            if (iM125609b > i2) {
                i = i3;
                i2 = iM125609b;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m80696v0() {
        m80652S0();
        m80679n();
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m80697w() {
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
    public final void m80698w0() {
        int i = this.currentScrollPosition;
        int currentPosition = getCurrentPosition();
        if (i == currentPosition || !m80682o0(currentPosition) || this.itemChangedPosition == currentPosition) {
            return;
        }
        m80700x0(i, currentPosition);
        m80624B0();
        this.currentScrollPosition = currentPosition;
        this.itemChangedPosition = currentPosition;
    }

    /* JADX INFO: renamed from: x */
    public final void m80699x() {
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
    public void m80700x0(int oldPosition, int newPosition) {
    }

    /* JADX INFO: renamed from: y */
    public final void m80701y() {
        this.scrollOffsetY = this.selectedPosition * this.itemHeight;
    }

    /* JADX INFO: renamed from: y0 */
    public void m80702y0(@NotNull s01<?> adapter, int position) {
        adapter.getClass();
    }

    /* JADX INFO: renamed from: z */
    public final void m80703z() {
        int measuredHeight = getMeasuredHeight() / 2;
        int i = this.leftText.length() == 0 ? 0 : this.leftTextWidth + this.leftTextMarginRight;
        int measuredWidth = this.gravity == 1 ? ((((getMeasuredWidth() - i) - this.mainTextMaxWidth) - (this.rightText.length() != 0 ? this.rightTextWidth + this.rightTextMarginLeft : 0)) / 2) + i : (getMeasuredWidth() / 2) - (this.mainTextMaxWidth / 2);
        int i2 = this.mainTextHeight;
        int i3 = measuredHeight - (i2 / 2);
        this.mainTextRect.set(measuredWidth, i3, this.mainTextMaxWidth + measuredWidth, i2 + i3);
        m80685q();
        m80697w();
        m80679n();
    }

    /* JADX INFO: renamed from: z0 */
    public void mo80704z0(int scrollOffsetY) {
    }

    public final void setLeftTextMarginRight(float marginRightDp) {
        setLeftTextMarginRight(m80611O(marginRightDp));
    }

    public final void setLeftTextSize(float textSizeSp) {
        setLeftTextSize(m80613Q0(textSizeSp));
    }

    public final void setLineSpacing(float lineSpacingDp) {
        setLineSpacing(m80611O(lineSpacingDp));
    }

    public final void setMinTextSize(float minTextSizeSp) {
        setMinTextSize(m80613Q0(minTextSizeSp));
    }

    public final void setRightTextMarginLeft(float marginLeftDp) {
        setRightTextMarginLeft(m80611O(marginLeftDp));
    }

    public final void setRightTextSize(float textSizeSp) {
        setRightTextSize(m80613Q0(textSizeSp));
    }

    public final void setTextPaddingLeft(float textPaddingLeftDp) {
        setTextPaddingLeft(m80611O(textPaddingLeftDp));
    }

    public final void setTextPaddingRight(float textPaddingRightDp) {
        setTextPaddingRight(m80611O(textPaddingRightDp));
    }

    public final void setTextSize(float textSizeSp) {
        setTextSize(m80613Q0(textSizeSp));
    }

    public final void setItemIndexer(@NotNull w6q itemIndexer) {
        itemIndexer.getClass();
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            s01Var.m183881t(null);
        }
    }

    public final void setDividerHeight(float dividerHeightDp) {
        setDividerHeight(m80611O(dividerHeightDp));
    }

    public final void setDividerPadding(float dividerPaddingDp) {
        setDividerPadding(m80611O(dividerPaddingDp));
    }

    public final void setDividerOffsetY(float offsetYDp) {
        setDividerOffsetY(m80611O(offsetYDp));
    }

    public final void setTextFormatter(@NotNull Function1<Object, String> formatterBlock) {
        formatterBlock.getClass();
        this.formatterBlock = formatterBlock;
        s01<?> s01Var = this.wheelAdapter;
        if (s01Var != null) {
            s01Var.m183880s(formatterBlock);
            m80635H();
            m80694u0();
        }
    }

    public final void setOnItemPositionChangedListener(@Nullable om50 itemPositionChangedListener) {
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
