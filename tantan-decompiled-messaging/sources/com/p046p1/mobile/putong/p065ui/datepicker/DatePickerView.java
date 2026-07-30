package com.p046p1.mobile.putong.p065ui.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.RawRes;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p046p1.mobile.putong.data.OMSSizeType;
import com.p046p1.mobile.putong.p065ui.datepicker.p067ex.WheelDayView;
import com.p046p1.mobile.putong.p065ui.datepicker.p067ex.WheelMonthView;
import com.p046p1.mobile.putong.p065ui.datepicker.p067ex.WheelYearView;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d9c0;
import p149l.i7c;
import p149l.if50;
import p149l.nwm;
import p149l.od50;
import p149l.qhf0;
import p149l.s4c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0019\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00100\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b0\u00104J'\u00108\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020.H\u0016¢\u0006\u0004\b;\u00101J\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u000202H\u0016¢\u0006\u0004\b;\u00104J'\u0010@\u001a\u00020\u000b2\u0006\u0010=\u001a\u0002022\u0006\u0010<\u001a\u0002022\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u001aH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u001aH\u0016¢\u0006\u0004\bE\u0010DJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u001aH\u0016¢\u0006\u0004\bF\u0010DJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bK\u0010JJ\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bL\u0010JJ\u0017\u0010M\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bM\u0010JJ\u000f\u0010N\u001a\u00020.H\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0007H\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0007H\u0016¢\u0006\u0004\bU\u0010TJ\u000f\u0010V\u001a\u00020\u0007H\u0016¢\u0006\u0004\bV\u0010TJ\u000f\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0010H\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0012H\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u0007H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0007H\u0016¢\u0006\u0004\ba\u0010_J\u0017\u0010a\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\ba\u0010dJ\u0017\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020\u001aH\u0016¢\u0006\u0004\bf\u0010DJ\u0017\u0010h\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u0007H\u0016¢\u0006\u0004\bh\u0010_J\u0017\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020bH\u0016¢\u0006\u0004\bh\u0010dJ\u0017\u0010k\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u001aH\u0016¢\u0006\u0004\bk\u0010DJ\u0017\u0010m\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020\u0007H\u0016¢\u0006\u0004\bm\u0010_J\u0017\u0010m\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020bH\u0016¢\u0006\u0004\bm\u0010dJ\u0017\u0010q\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020oH\u0016¢\u0006\u0004\bq\u0010rJ\u0019\u0010t\u001a\u00020\u000b2\b\b\u0001\u0010s\u001a\u00020\u0007H\u0016¢\u0006\u0004\bt\u0010_J\u0019\u0010v\u001a\u00020\u000b2\b\b\u0001\u0010u\u001a\u00020\u0007H\u0016¢\u0006\u0004\bv\u0010_J\u0019\u0010w\u001a\u00020\u000b2\b\b\u0001\u0010s\u001a\u00020\u0007H\u0016¢\u0006\u0004\bw\u0010_J\u0019\u0010x\u001a\u00020\u000b2\b\b\u0001\u0010u\u001a\u00020\u0007H\u0016¢\u0006\u0004\bx\u0010_J\u0017\u0010z\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u0007H\u0016¢\u0006\u0004\bz\u0010_J\u0017\u0010z\u001a\u00020\u000b2\u0006\u0010{\u001a\u00020bH\u0016¢\u0006\u0004\bz\u0010dJ\u0017\u0010}\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020\u0007H\u0016¢\u0006\u0004\b}\u0010_J\u0017\u0010}\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020bH\u0016¢\u0006\u0004\b}\u0010dJ\u0019\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0080\u0001\u0010_J\u001a\u0010\u0080\u0001\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020bH\u0016¢\u0006\u0005\b\u0080\u0001\u0010dJ\u001c\u0010\u0084\u0001\u001a\u00020\u000b2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0087\u0001\u001a\u00020\u000b2\u0007\u0010\u0086\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0005\b\u0087\u0001\u0010DJ\u001c\u0010\u0089\u0001\u001a\u00020\u000b2\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0089\u0001\u0010_J\u001c\u0010\u008b\u0001\u001a\u00020\u000b2\t\b\u0001\u0010\u008a\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u008b\u0001\u0010_J\u001a\u0010\u008d\u0001\u001a\u00020\u000b2\u0007\u0010\u008c\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u008d\u0001\u0010_J\u001a\u0010\u008d\u0001\u001a\u00020\u000b2\u0007\u0010\u008e\u0001\u001a\u00020bH\u0016¢\u0006\u0005\b\u008d\u0001\u0010dJ\u001c\u0010\u0091\u0001\u001a\u00020\u000b2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0093\u0001\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0093\u0001\u0010_J\u0019\u0010\u0093\u0001\u001a\u00020\u000b2\u0006\u0010{\u001a\u00020bH\u0016¢\u0006\u0005\b\u0093\u0001\u0010dJ\u001c\u0010\u0096\u0001\u001a\u00020\u000b2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0099\u0001\u001a\u00020\u000b2\u0007\u0010\u0098\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u0099\u0001\u0010_J\u001a\u0010\u0099\u0001\u001a\u00020\u000b2\u0007\u0010\u009a\u0001\u001a\u00020bH\u0016¢\u0006\u0005\b\u0099\u0001\u0010dJ\u001a\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0005\b\u009c\u0001\u0010DJ\u001c\u0010\u009e\u0001\u001a\u00020\u000b2\t\b\u0001\u0010\u009d\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b\u009e\u0001\u0010_J\u001c\u0010 \u0001\u001a\u00020\u000b2\t\b\u0001\u0010\u009f\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b \u0001\u0010_J\u001c\u0010£\u0001\u001a\u00020\u000b2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001a\u0010¦\u0001\u001a\u00020\u000b2\u0007\u0010¥\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0005\b¦\u0001\u0010DJ\u001c\u0010§\u0001\u001a\u00020\u000b2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¤\u0001J\u001a\u0010©\u0001\u001a\u00020\u000b2\u0007\u0010¨\u0001\u001a\u00020bH\u0016¢\u0006\u0005\b©\u0001\u0010dJ\u001a\u0010«\u0001\u001a\u00020\u000b2\u0007\u0010ª\u0001\u001a\u00020bH\u0016¢\u0006\u0005\b«\u0001\u0010dJ\u001a\u0010\u00ad\u0001\u001a\u00020\u000b2\u0007\u0010¬\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0005\b\u00ad\u0001\u0010DJ\u001c\u0010¯\u0001\u001a\u00020\u000b2\t\b\u0001\u0010®\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\b¯\u0001\u0010_J\u001a\u0010±\u0001\u001a\u00020\u000b2\u0007\u0010°\u0001\u001a\u00020bH\u0016¢\u0006\u0005\b±\u0001\u0010dJ\u001a\u0010³\u0001\u001a\u00020\u000b2\u0007\u0010²\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0005\b³\u0001\u0010DJ\u001c\u0010¶\u0001\u001a\u00020\u000b2\b\u0010µ\u0001\u001a\u00030´\u0001H\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J0\u0010»\u0001\u001a\u00020\u000b2\b\u0010¸\u0001\u001a\u00030´\u00012\b\u0010¹\u0001\u001a\u00030´\u00012\b\u0010º\u0001\u001a\u00030´\u0001H\u0016¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001c\u0010½\u0001\u001a\u00020\u000b2\b\u0010µ\u0001\u001a\u00030´\u0001H\u0016¢\u0006\u0006\b½\u0001\u0010·\u0001J0\u0010Á\u0001\u001a\u00020\u000b2\b\u0010¾\u0001\u001a\u00030´\u00012\b\u0010¿\u0001\u001a\u00030´\u00012\b\u0010À\u0001\u001a\u00030´\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010¼\u0001J\u0019\u0010Â\u0001\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÂ\u0001\u0010_J\u0019\u0010Â\u0001\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020bH\u0016¢\u0006\u0005\bÂ\u0001\u0010dJ\u0019\u0010Ã\u0001\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÃ\u0001\u0010_J\u0019\u0010Ã\u0001\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020bH\u0016¢\u0006\u0005\bÃ\u0001\u0010dJ\u001c\u0010Å\u0001\u001a\u00020\u000b2\t\b\u0001\u0010Ä\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÅ\u0001\u0010_J\u001c\u0010Ç\u0001\u001a\u00020\u000b2\t\b\u0001\u0010Æ\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÇ\u0001\u0010_J\u001c\u0010È\u0001\u001a\u00020\u000b2\t\b\u0001\u0010Ä\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÈ\u0001\u0010_J\u001c\u0010É\u0001\u001a\u00020\u000b2\t\b\u0001\u0010Æ\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÉ\u0001\u0010_J\u001a\u0010Ë\u0001\u001a\u00020\u000b2\u0007\u0010Ê\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bË\u0001\u0010_J\u001a\u0010Ë\u0001\u001a\u00020\u000b2\u0007\u0010Ì\u0001\u001a\u00020bH\u0016¢\u0006\u0005\bË\u0001\u0010dJ\u001a\u0010Î\u0001\u001a\u00020\u000b2\u0007\u0010Í\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÎ\u0001\u0010_J\u001a\u0010Î\u0001\u001a\u00020\u000b2\u0007\u0010Ï\u0001\u001a\u00020bH\u0016¢\u0006\u0005\bÎ\u0001\u0010dJ\u001a\u0010Ñ\u0001\u001a\u00020\u000b2\u0007\u0010Ð\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÑ\u0001\u0010_J\u001a\u0010Ò\u0001\u001a\u00020\u000b2\u0007\u0010Ð\u0001\u001a\u00020\u0007H\u0016¢\u0006\u0005\bÒ\u0001\u0010_J\u001b\u0010Ô\u0001\u001a\u00020\u000b2\u0007\u0010Ó\u0001\u001a\u00020PH\u0016¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u001b\u0010Ö\u0001\u001a\u00020\u000b2\u0007\u0010Ó\u0001\u001a\u00020PH\u0016¢\u0006\u0006\bÖ\u0001\u0010Õ\u0001J\u001b\u0010×\u0001\u001a\u00020\u000b2\u0007\u0010Ó\u0001\u001a\u00020PH\u0016¢\u0006\u0006\b×\u0001\u0010Õ\u0001J\u001b\u0010Ø\u0001\u001a\u00020\u000b2\u0007\u0010Ó\u0001\u001a\u00020PH\u0016¢\u0006\u0006\bØ\u0001\u0010Õ\u0001R\u0017\u0010Û\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Ú\u0001R\u0018\u0010Ý\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010Ü\u0001R\u0018\u0010ß\u0001\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010Þ\u0001R\u0018\u0010à\u0001\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010Þ\u0001R\u0019\u0010á\u0001\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010Þ\u0001R\u0019\u0010â\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Ü\u0001R\u0018\u0010ã\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b8\u0010Ü\u0001R\u0018\u0010ä\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b,\u0010Ü\u0001¨\u0006å\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/DatePickerView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "b", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;", "wheelYearView", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;", "wheelMonthView", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;", "wheelDayView", "a", "(Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;)V", "Landroid/widget/LinearLayout$LayoutParams;", "yearLp", "monthLp", "dayLp", "", "c", "(Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;)Z", "Ll/nwm;", "textFormatter", "setYearTextFormatter", "(Ll/nwm;)V", "setMonthTextFormatter", "setDayTextFormatter", "Ll/od50;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnDateSelectedListener", "(Ll/od50;)V", "Ll/if50;", "setOnScrollChangedListener", "(Ll/if50;)V", "startYear", "endYear", "h", "(II)V", "Ljava/util/Date;", "date", "setSelectedDate", "(Ljava/util/Date;)V", "Ljava/util/Calendar;", "calendar", "(Ljava/util/Calendar;)V", MerchandiseTimeUnit.year, MerchandiseTimeUnit.month, "day", "g", "(III)V", "maxDate", "setMaxSelectedDate", "maxCalendar", "minCalendar", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "overRangeMode", Constants.INAPP_DATA_TAG, "(Ljava/util/Calendar;Ljava/util/Calendar;Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "isShow", "setShowYear", "(Z)V", "setShowMonth", "setShowDay", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "measureType", "setYearMaxTextWidthMeasureType", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;)V", "setMonthMaxTextWidthMeasureType", "setDayMaxTextWidthMeasureType", "setMaxTextWidthMeasureType", "getSelectedDate", "()Ljava/util/Date;", "", "getSelectedDateStr", "()Ljava/lang/String;", "getSelectedYear", "()I", "getSelectedMonth", "getSelectedDay", "getWheelYearView", "()Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;", "getWheelMonthView", "()Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;", "getWheelDayView", "()Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;", "visibleItems", "setVisibleItems", "(I)V", "lineSpacingPx", "setLineSpacing", "", "lineSpacingDp", "(F)V", "isCyclic", "setCyclic", "textSizePx", "setTextSize", "textSizeSp", "autoFit", "setAutoFitTextSize", "minTextSizePx", "setMinTextSize", "minTextSizeSp", "Landroid/graphics/Paint$Align;", "textAlign", "setTextAlign", "(Landroid/graphics/Paint$Align;)V", "textColor", "setNormalTextColor", "textColorRes", "setNormalTextColorRes", "setSelectedTextColor", "setSelectedTextColorRes", "paddingPx", "setTextPadding", "paddingDp", "textPaddingLeftPx", "setTextPaddingLeft", "textPaddingLeftDp", "textPaddingRightPx", "setTextPaddingRight", "textPaddingRightDp", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "(Landroid/graphics/Typeface;)V", "showDivider", "setShowDivider", "dividerColor", "setDividerColor", "dividerColorRes", "setDividerColorRes", "dividerHeightPx", "setDividerHeight", "dividerHeightDp", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "dividerType", "setDividerType", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;)V", "setWheelDividerPadding", "Landroid/graphics/Paint$Cap;", "cap", "setDividerCap", "(Landroid/graphics/Paint$Cap;)V", "offsetYPx", "setDividerOffsetY", "offsetYDp", "showCurtain", "setShowCurtain", "curtainColor", "setCurtainColor", "curtainColorRes", "setCurtainColorRes", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "direction", "setDirection", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;)V", "curved", "setCurved", "setCurvedArcDirection", "factor", "setCurvedArcDirectionFactor", OMSSizeType.ratio, "setRefractRatio", "soundEffect", "setSoundEffect", "soundRes", "setSoundResource", "playVolume", "setSoundVolume", "reset", "setResetSelectedPosition", "", "text", "setLeftText", "(Ljava/lang/CharSequence;)V", "yearLeft", "monthLeft", "dayLeft", "e", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "setRightText", "yearRight", "monthRight", "dayRight", "f", "setLeftTextSize", "setRightTextSize", "color", "setLeftTextColor", "colorRes", "setLeftTextColorRes", "setRightTextColor", "setRightTextColorRes", "marginRightPx", "setLeftTextMarginRight", "marginRightDp", "marginLeftPx", "setRightTextMarginLeft", "marginLeftDp", "gravity", "setLeftTextGravity", "setRightTextGravity", "str", "setYearPrefixText", "(Ljava/lang/String;)V", "setMonthPrefixText", "setDayPrefixText", "setPrefixText", "Ll/i7c;", "Ll/i7c;", "datePickerHelper", "Z", "widthWeightMode", "F", "yearWeight", "monthWeight", "dayWeight", "isShowYear", "isShowMonth", "isSHowDay", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class DatePickerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final i7c datePickerHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean widthWeightMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float yearWeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float monthWeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float dayWeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isShowYear;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isShowMonth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isSHowDay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DatePickerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.yearWeight = 1.0f;
        this.monthWeight = 1.0f;
        this.dayWeight = 1.0f;
        this.isShowYear = true;
        this.isShowMonth = true;
        this.isSHowDay = true;
        WheelYearView wheelYearView = new WheelYearView(context, null, 0, 6, null);
        WheelMonthView wheelMonthView = new WheelMonthView(context, null, 0, 6, null);
        WheelDayView wheelDayView = new WheelDayView(context, null, 0, 6, null);
        wheelYearView.setId(s4c0.f162310N0);
        wheelMonthView.setId(s4c0.f162308M0);
        wheelDayView.setId(s4c0.f162306L0);
        this.datePickerHelper = new i7c(wheelYearView, wheelMonthView, wheelDayView);
        if (attributeSet != null) {
            m79418b(context, attributeSet);
        }
        m79417a(wheelYearView, wheelMonthView, wheelDayView);
        setShowYear(this.isShowYear);
        setShowMonth(this.isShowMonth);
        setShowDay(this.isSHowDay);
        wheelYearView.setTextFormatter(new nwm("%04d"));
        wheelMonthView.setTextFormatter(new qhf0(null, 1, null));
        wheelDayView.setTextFormatter(new nwm("%02d"));
        setMaxTextWidthMeasureType(WheelView.MeasureType.SAME_WIDTH_WITH_NUM);
    }

    /* JADX INFO: renamed from: a */
    public final void m79417a(WheelYearView wheelYearView, WheelMonthView wheelMonthView, WheelDayView wheelDayView) {
        WheelView.CurvedArcDirection curvedArcDirection;
        int i = 0;
        setOrientation(0);
        int i2 = this.widthWeightMode ? 0 : -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, -2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, -2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, -2);
        layoutParams.gravity = 16;
        layoutParams2.gravity = 16;
        layoutParams3.gravity = 16;
        if (this.widthWeightMode) {
            layoutParams.weight = this.yearWeight;
            layoutParams2.weight = this.monthWeight;
            layoutParams3.weight = this.dayWeight;
        }
        if (!m79419c(wheelYearView, wheelMonthView, wheelDayView, layoutParams, layoutParams2, layoutParams3)) {
            addView(wheelMonthView, layoutParams2);
            addView(wheelDayView, layoutParams3);
            addView(wheelYearView, layoutParams);
        }
        int childCount = getChildCount();
        while (i < childCount) {
            View childAt = getChildAt(i);
            childAt.getClass();
            WheelView wheelView = (WheelView) childAt;
            if (i == 0) {
                curvedArcDirection = WheelView.CurvedArcDirection.LEFT;
            } else {
                curvedArcDirection = i == getChildCount() + (-1) ? WheelView.CurvedArcDirection.RIGHT : WheelView.CurvedArcDirection.CENTER;
            }
            wheelView.setDirection(curvedArcDirection);
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m79418b(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, d9c0.f85034a);
        typedArrayObtainStyledAttributes.getClass();
        this.widthWeightMode = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85016R, false);
        this.yearWeight = typedArrayObtainStyledAttributes.getFloat(d9c0.f85022U, 1.0f);
        this.monthWeight = typedArrayObtainStyledAttributes.getFloat(d9c0.f85100w, 1.0f);
        this.dayWeight = typedArrayObtainStyledAttributes.getFloat(d9c0.f85058i, 1.0f);
        this.isShowYear = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85004L, true);
        this.isShowMonth = typedArrayObtainStyledAttributes.getBoolean(d9c0.f85002K, true);
        this.isSHowDay = typedArrayObtainStyledAttributes.getBoolean(d9c0.f84998I, true);
        int i = typedArrayObtainStyledAttributes.getInt(d9c0.f85006M, -1);
        int i2 = typedArrayObtainStyledAttributes.getInt(d9c0.f85076o, -1);
        if (i > 0 && i2 > 0 && i2 >= i) {
            m79424h(i, i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(d9c0.f84994G, -1);
        int i4 = typedArrayObtainStyledAttributes.getInt(d9c0.f84990E, -1);
        int i5 = typedArrayObtainStyledAttributes.getInt(d9c0.f84988D, -1);
        if (i3 > 0 && i4 > 0 && i5 > 0) {
            m79423g(i3, i4, i5);
        }
        setVisibleItems(typedArrayObtainStyledAttributes.getInt(d9c0.f85014Q, 5));
        int i6 = d9c0.f85091t;
        WheelView.Companion companion = WheelView.INSTANCE;
        setLineSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(i6, companion.m79529h()));
        setCyclic(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85049f, false));
        setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85012P, companion.m79531j()));
        setTextAlign(companion.m79525d(typedArrayObtainStyledAttributes.getInt(d9c0.f85008N, 1)));
        setTextPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85010O, companion.m79530i()));
        setRefractRatio(typedArrayObtainStyledAttributes.getFloat(d9c0.f85106y, 1.0f));
        CharSequence text = typedArrayObtainStyledAttributes.getText(d9c0.f85018S);
        if (text == null) {
            text = "";
        }
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(d9c0.f85094u);
        if (text2 == null) {
            text2 = "";
        }
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(d9c0.f85052g);
        if (text3 == null) {
            text3 = "";
        }
        m79421e(text, text2, text3);
        CharSequence text4 = typedArrayObtainStyledAttributes.getText(d9c0.f85020T);
        if (text4 == null) {
            text4 = "";
        }
        CharSequence text5 = typedArrayObtainStyledAttributes.getText(d9c0.f85097v);
        if (text5 == null) {
            text5 = "";
        }
        CharSequence text6 = typedArrayObtainStyledAttributes.getText(d9c0.f85055h);
        m79422f(text4, text5, text6 != null ? text6 : "");
        setLeftTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85088s, companion.m79531j()));
        setRightTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f84986C, companion.m79531j()));
        setLeftTextMarginRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85085r, companion.m79530i()));
        setRightTextMarginLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f84983B, companion.m79530i()));
        setLeftTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85079p, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setRightTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85109z, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setLeftTextGravity(companion.m79526e(typedArrayObtainStyledAttributes.getInt(d9c0.f85082q, 0)));
        setRightTextGravity(companion.m79526e(typedArrayObtainStyledAttributes.getInt(d9c0.f84980A, 0)));
        setNormalTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85103x, -12303292));
        setSelectedTextColor(typedArrayObtainStyledAttributes.getColor(d9c0.f84992F, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setShowDivider(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85000J, false));
        setDividerType(companion.m79524c(typedArrayObtainStyledAttributes.getInt(d9c0.f85073n, 0)));
        setDividerColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85061j, RoundedDrawable.DEFAULT_BORDER_COLOR));
        setDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85064k, companion.m79528g()));
        setWheelDividerPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(d9c0.f85070m, companion.m79530i()));
        setDividerOffsetY(typedArrayObtainStyledAttributes.getDimensionPixelOffset(d9c0.f85067l, 0));
        setCurved(typedArrayObtainStyledAttributes.getBoolean(d9c0.f85040c, true));
        setCurvedArcDirection(companion.m79523b(typedArrayObtainStyledAttributes.getInt(d9c0.f85043d, 1)));
        setCurvedArcDirectionFactor(typedArrayObtainStyledAttributes.getFloat(d9c0.f85046e, 0.75f));
        setShowCurtain(typedArrayObtainStyledAttributes.getBoolean(d9c0.f84996H, false));
        setCurtainColor(typedArrayObtainStyledAttributes.getColor(d9c0.f85037b, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m79419c(WheelYearView wheelYearView, WheelMonthView wheelMonthView, WheelDayView wheelDayView, LinearLayout.LayoutParams yearLp, LinearLayout.LayoutParams monthLp, LinearLayout.LayoutParams dayLp) {
        char[] dateFormatOrder;
        char c = 'd';
        try {
            dateFormatOrder = DateFormat.getDateFormatOrder(getContext());
        } catch (Exception unused) {
            dateFormatOrder = new char[]{'y', 'M', 'd'};
        }
        String[] months = new DateFormatSymbols().getMonths();
        if (dateFormatOrder != null) {
            int length = dateFormatOrder.length;
            int i = 0;
            while (i < length) {
                char c2 = dateFormatOrder[i];
                if (c2 == 'M') {
                    addView(wheelMonthView, monthLp);
                } else if (c2 == c) {
                    addView(wheelDayView, dayLp);
                } else if (c2 == 'y') {
                    addView(wheelYearView, yearLp);
                }
                i++;
                c = 'd';
            }
            months.getClass();
            wheelMonthView.setData(ArraysKt.toMutableList(months));
            String language = Locale.getDefault().getLanguage();
            language.getClass();
            if (StringsKt.m93412P("th-TH", language, false, 2, null)) {
                setYearPrefixText("ค.ศ.");
            }
        }
        return dateFormatOrder != null;
    }

    /* JADX INFO: renamed from: d */
    public void m79420d(@NotNull Calendar minCalendar, @NotNull Calendar maxCalendar, @NotNull WheelView.OverRangeMode overRangeMode) {
        minCalendar.getClass();
        maxCalendar.getClass();
        overRangeMode.getClass();
        this.datePickerHelper.m134842s(minCalendar, maxCalendar, overRangeMode);
    }

    /* JADX INFO: renamed from: e */
    public void m79421e(@NotNull CharSequence yearLeft, @NotNull CharSequence monthLeft, @NotNull CharSequence dayLeft) {
        yearLeft.getClass();
        monthLeft.getClass();
        dayLeft.getClass();
        this.datePickerHelper.m134773G(yearLeft, monthLeft, dayLeft);
    }

    /* JADX INFO: renamed from: f */
    public void m79422f(@NotNull CharSequence yearRight, @NotNull CharSequence monthRight, @NotNull CharSequence dayRight) {
        yearRight.getClass();
        monthRight.getClass();
        dayRight.getClass();
        this.datePickerHelper.m134823i0(yearRight, monthRight, dayRight);
    }

    /* JADX INFO: renamed from: g */
    public void m79423g(int year, int month, int day) {
        this.datePickerHelper.m134839q0(year, month, day);
    }

    @NotNull
    public Date getSelectedDate() {
        return this.datePickerHelper.m134812d();
    }

    @NotNull
    public String getSelectedDateStr() {
        return this.datePickerHelper.m134814e();
    }

    public int getSelectedDay() {
        return this.datePickerHelper.m134816f();
    }

    public int getSelectedMonth() {
        return this.datePickerHelper.m134818g();
    }

    public int getSelectedYear() {
        return this.datePickerHelper.m134820h();
    }

    @NotNull
    public WheelDayView getWheelDayView() {
        return this.datePickerHelper.m134822i();
    }

    @NotNull
    public WheelMonthView getWheelMonthView() {
        return this.datePickerHelper.m134824j();
    }

    @NotNull
    public WheelYearView getWheelYearView() {
        return this.datePickerHelper.m134826k();
    }

    /* JADX INFO: renamed from: h */
    public void m79424h(int startYear, int endYear) {
        this.datePickerHelper.m134798S0(startYear, endYear);
    }

    public void setAutoFitTextSize(boolean autoFit) {
        this.datePickerHelper.m134828l(autoFit);
    }

    public void setCurtainColor(@ColorInt int curtainColor) {
        this.datePickerHelper.m134830m(curtainColor);
    }

    public void setCurtainColorRes(@ColorRes int curtainColorRes) {
        this.datePickerHelper.m134832n(curtainColorRes);
    }

    public void setCurved(boolean curved) {
        this.datePickerHelper.m134834o(curved);
    }

    public void setCurvedArcDirection(@NotNull WheelView.CurvedArcDirection direction) {
        direction.getClass();
        this.datePickerHelper.m134836p(direction);
    }

    public void setCurvedArcDirectionFactor(float factor) {
        this.datePickerHelper.m134838q(factor);
    }

    public void setCyclic(boolean isCyclic) {
        this.datePickerHelper.m134840r(isCyclic);
    }

    public void setDayMaxTextWidthMeasureType(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        this.datePickerHelper.m134844t(measureType);
    }

    public void setDayPrefixText(@NotNull String str) {
        str.getClass();
        this.datePickerHelper.m134846u(str);
    }

    public void setDayTextFormatter(@NotNull nwm textFormatter) {
        textFormatter.getClass();
        this.datePickerHelper.m134848v(textFormatter);
    }

    public void setDirection(@NotNull WheelView.CurvedArcDirection direction) {
        direction.getClass();
        this.datePickerHelper.m134850w(direction);
    }

    public void setDividerCap(@NotNull Paint.Cap cap) {
        cap.getClass();
        this.datePickerHelper.m134852x(cap);
    }

    public void setDividerColor(@ColorInt int dividerColor) {
        this.datePickerHelper.m134854y(dividerColor);
    }

    public void setDividerColorRes(@ColorRes int dividerColorRes) {
        this.datePickerHelper.m134856z(dividerColorRes);
    }

    public void setDividerHeight(int dividerHeightPx) {
        this.datePickerHelper.m134763B(dividerHeightPx);
    }

    public void setDividerOffsetY(int offsetYPx) {
        this.datePickerHelper.m134767D(offsetYPx);
    }

    public void setDividerType(@NotNull WheelView.DividerType dividerType) {
        dividerType.getClass();
        this.datePickerHelper.m134769E(dividerType);
    }

    public void setLeftText(@NotNull CharSequence text) {
        text.getClass();
        this.datePickerHelper.m134771F(text);
    }

    public void setLeftTextColor(@ColorInt int color) {
        this.datePickerHelper.m134775H(color);
    }

    public void setLeftTextColorRes(@ColorRes int colorRes) {
        this.datePickerHelper.m134777I(colorRes);
    }

    public void setLeftTextGravity(int gravity) {
        this.datePickerHelper.m134779J(gravity);
    }

    public void setLeftTextMarginRight(int marginRightPx) {
        this.datePickerHelper.m134783L(marginRightPx);
    }

    public void setLeftTextSize(int textSizePx) {
        this.datePickerHelper.m134787N(textSizePx);
    }

    public void setLineSpacing(int lineSpacingPx) {
        this.datePickerHelper.m134791P(lineSpacingPx);
    }

    public void setMaxSelectedDate(@NotNull Date maxDate) {
        maxDate.getClass();
        this.datePickerHelper.m134797S(maxDate);
    }

    public void setMaxTextWidthMeasureType(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        this.datePickerHelper.m134799T(measureType);
    }

    public void setMinTextSize(int minTextSizePx) {
        this.datePickerHelper.m134803W(minTextSizePx);
    }

    public void setMonthMaxTextWidthMeasureType(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        this.datePickerHelper.m134804X(measureType);
    }

    public void setMonthPrefixText(@NotNull String str) {
        str.getClass();
        this.datePickerHelper.m134805Y(str);
    }

    public void setMonthTextFormatter(@NotNull nwm textFormatter) {
        textFormatter.getClass();
        this.datePickerHelper.m134806Z(textFormatter);
    }

    public void setNormalTextColor(@ColorInt int textColor) {
        this.datePickerHelper.m134808a0(textColor);
    }

    public void setNormalTextColorRes(@ColorRes int textColorRes) {
        this.datePickerHelper.m134810b0(textColorRes);
    }

    public void setOnDateSelectedListener(@Nullable od50 listener) {
        this.datePickerHelper.m134811c0(listener);
    }

    public void setOnScrollChangedListener(@Nullable if50 listener) {
        this.datePickerHelper.m134813d0(listener);
    }

    public void setPrefixText(@NotNull String str) {
        str.getClass();
        this.datePickerHelper.m134815e0(str);
    }

    public void setRefractRatio(float ratio) {
        this.datePickerHelper.m134817f0(ratio);
    }

    public void setResetSelectedPosition(boolean reset) {
        this.datePickerHelper.m134819g0(reset);
    }

    public void setRightText(@NotNull CharSequence text) {
        text.getClass();
        this.datePickerHelper.m134821h0(text);
    }

    public void setRightTextColor(@ColorInt int color) {
        this.datePickerHelper.m134825j0(color);
    }

    public void setRightTextColorRes(@ColorRes int colorRes) {
        this.datePickerHelper.m134827k0(colorRes);
    }

    public void setRightTextGravity(int gravity) {
        this.datePickerHelper.m134829l0(gravity);
    }

    public void setRightTextMarginLeft(int marginLeftPx) {
        this.datePickerHelper.m134833n0(marginLeftPx);
    }

    public void setRightTextSize(int textSizePx) {
        this.datePickerHelper.m134837p0(textSizePx);
    }

    public void setSelectedDate(@NotNull Date date) {
        date.getClass();
        this.datePickerHelper.m134843s0(date);
    }

    public void setSelectedTextColor(@ColorInt int textColor) {
        this.datePickerHelper.m134845t0(textColor);
    }

    public void setSelectedTextColorRes(@ColorRes int textColorRes) {
        this.datePickerHelper.m134847u0(textColorRes);
    }

    public void setShowCurtain(boolean showCurtain) {
        this.datePickerHelper.m134849v0(showCurtain);
    }

    public void setShowDay(boolean isShow) {
        this.datePickerHelper.m134851w0(isShow);
    }

    public void setShowDivider(boolean showDivider) {
        this.datePickerHelper.m134853x0(showDivider);
    }

    public void setShowMonth(boolean isShow) {
        this.datePickerHelper.m134855y0(isShow);
    }

    public void setShowYear(boolean isShow) {
        this.datePickerHelper.m134857z0(isShow);
    }

    public void setSoundEffect(boolean soundEffect) {
        this.datePickerHelper.m134762A0(soundEffect);
    }

    public void setSoundResource(@RawRes int soundRes) {
        this.datePickerHelper.m134764B0(soundRes);
    }

    public void setSoundVolume(float playVolume) {
        this.datePickerHelper.m134766C0(playVolume);
    }

    public void setTextAlign(@NotNull Paint.Align textAlign) {
        textAlign.getClass();
        this.datePickerHelper.m134768D0(textAlign);
    }

    public void setTextPadding(int paddingPx) {
        this.datePickerHelper.m134772F0(paddingPx);
    }

    public void setTextPaddingLeft(int textPaddingLeftPx) {
        this.datePickerHelper.m134776H0(textPaddingLeftPx);
    }

    public void setTextPaddingRight(int textPaddingRightPx) {
        this.datePickerHelper.m134780J0(textPaddingRightPx);
    }

    public void setTextSize(int textSizePx) {
        this.datePickerHelper.m134784L0(textSizePx);
    }

    public void setTypeface(@NotNull Typeface typeface) {
        typeface.getClass();
        this.datePickerHelper.m134786M0(typeface);
    }

    public void setVisibleItems(int visibleItems) {
        this.datePickerHelper.m134788N0(visibleItems);
    }

    public void setWheelDividerPadding(int paddingPx) {
        this.datePickerHelper.m134792P0(paddingPx);
    }

    public void setYearMaxTextWidthMeasureType(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        this.datePickerHelper.m134794Q0(measureType);
    }

    public void setYearPrefixText(@NotNull String str) {
        str.getClass();
        this.datePickerHelper.m134796R0(str);
    }

    public void setYearTextFormatter(@NotNull nwm textFormatter) {
        textFormatter.getClass();
        this.datePickerHelper.m134800T0(textFormatter);
    }

    public void setDividerHeight(float dividerHeightDp) {
        this.datePickerHelper.m134761A(dividerHeightDp);
    }

    public void setDividerOffsetY(float offsetYDp) {
        this.datePickerHelper.m134765C(offsetYDp);
    }

    public void setLeftTextMarginRight(float marginRightDp) {
        this.datePickerHelper.m134781K(marginRightDp);
    }

    public void setLeftTextSize(float textSizeSp) {
        this.datePickerHelper.m134785M(textSizeSp);
    }

    public void setLineSpacing(float lineSpacingDp) {
        this.datePickerHelper.m134789O(lineSpacingDp);
    }

    public void setMinTextSize(float minTextSizeSp) {
        this.datePickerHelper.m134802V(minTextSizeSp);
    }

    public void setRightTextMarginLeft(float marginLeftDp) {
        this.datePickerHelper.m134831m0(marginLeftDp);
    }

    public void setRightTextSize(float textSizeSp) {
        this.datePickerHelper.m134835o0(textSizeSp);
    }

    public void setTextPadding(float paddingDp) {
        this.datePickerHelper.m134770E0(paddingDp);
    }

    public void setTextPaddingLeft(float textPaddingLeftDp) {
        this.datePickerHelper.m134774G0(textPaddingLeftDp);
    }

    public void setTextPaddingRight(float textPaddingRightDp) {
        this.datePickerHelper.m134778I0(textPaddingRightDp);
    }

    public void setTextSize(float textSizeSp) {
        this.datePickerHelper.m134782K0(textSizeSp);
    }

    public void setWheelDividerPadding(float paddingDp) {
        this.datePickerHelper.m134790O0(paddingDp);
    }

    public void setMaxSelectedDate(@NotNull Calendar maxCalendar) {
        maxCalendar.getClass();
        this.datePickerHelper.m134793Q(maxCalendar);
    }

    public void setSelectedDate(@NotNull Calendar calendar) {
        calendar.getClass();
        this.datePickerHelper.m134841r0(calendar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DatePickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DatePickerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DatePickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
