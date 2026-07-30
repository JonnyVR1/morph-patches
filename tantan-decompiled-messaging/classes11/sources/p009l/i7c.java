package p009l;

import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.RawRes;
import com.p000p1.mobile.putong.p004ui.datepicker.WheelView;
import com.p000p1.mobile.putong.p004ui.datepicker.p006ex.WheelDayView;
import com.p000p1.mobile.putong.p004ui.datepicker.p006ex.WheelMonthView;
import com.p000p1.mobile.putong.p004ui.datepicker.p006ex.WheelYearView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ig3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b3\u0018\u0000 û\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0001\u0016B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J'\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020*H\u0016¢\u0006\u0004\b8\u0010-J\u0017\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u00020.H\u0016¢\u0006\u0004\b:\u00101J\u001f\u0010=\u001a\u00020\u00122\u0006\u00109\u001a\u00020.2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J'\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u00020.2\u0006\u00109\u001a\u00020.2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020*H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00122\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00122\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bH\u0010GJ\u0017\u0010I\u001a\u00020\u00122\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bI\u0010GJ\u0017\u0010L\u001a\u00020\u00122\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00122\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020\u00122\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bO\u0010MJ\u0017\u0010P\u001a\u00020\u00122\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bP\u0010MJ'\u0010T\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020J2\u0006\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020JH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0010H\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0010H\u0016¢\u0006\u0004\b[\u0010ZJ\u000f\u0010\\\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\\\u0010ZJ\u000f\u0010]\u001a\u00020\u0004H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0006H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\bH\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u00122\u0006\u0010c\u001a\u00020VH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\u00122\u0006\u0010c\u001a\u00020VH\u0016¢\u0006\u0004\bf\u0010eJ\u0017\u0010g\u001a\u00020\u00122\u0006\u0010c\u001a\u00020VH\u0016¢\u0006\u0004\bg\u0010eJ\u0017\u0010h\u001a\u00020\u00122\u0006\u0010c\u001a\u00020VH\u0016¢\u0006\u0004\bh\u0010eJ\u0017\u0010j\u001a\u00020\u00122\u0006\u0010i\u001a\u00020\u0010H\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00122\u0006\u0010l\u001a\u00020\u0010H\u0016¢\u0006\u0004\bm\u0010kJ\u0017\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u00122\u0006\u0010r\u001a\u00020DH\u0016¢\u0006\u0004\bs\u0010GJ\u0017\u0010u\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0010H\u0016¢\u0006\u0004\bu\u0010kJ\u0017\u0010w\u001a\u00020\u00122\u0006\u0010v\u001a\u00020nH\u0016¢\u0006\u0004\bw\u0010qJ\u0017\u0010y\u001a\u00020\u00122\u0006\u0010x\u001a\u00020DH\u0016¢\u0006\u0004\by\u0010GJ\u0017\u0010{\u001a\u00020\u00122\u0006\u0010z\u001a\u00020\u0010H\u0016¢\u0006\u0004\b{\u0010kJ\u0017\u0010}\u001a\u00020\u00122\u0006\u0010|\u001a\u00020nH\u0016¢\u0006\u0004\b}\u0010qJ\u001a\u0010\u0080\u0001\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020~H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0083\u0001\u001a\u00020\u00122\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0083\u0001\u0010kJ\u001c\u0010\u0085\u0001\u001a\u00020\u00122\t\b\u0001\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0085\u0001\u0010kJ\u001c\u0010\u0086\u0001\u001a\u00020\u00122\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0086\u0001\u0010kJ\u001c\u0010\u0087\u0001\u001a\u00020\u00122\t\b\u0001\u0010\u0084\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0087\u0001\u0010kJ\u001a\u0010\u0089\u0001\u001a\u00020\u00122\u0007\u0010\u0088\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0089\u0001\u0010kJ\u001a\u0010\u008b\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020nH\u0016¢\u0006\u0005\b\u008b\u0001\u0010qJ\u001a\u0010\u008d\u0001\u001a\u00020\u00122\u0007\u0010\u008c\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u008d\u0001\u0010kJ\u001a\u0010\u008f\u0001\u001a\u00020\u00122\u0007\u0010\u008e\u0001\u001a\u00020nH\u0016¢\u0006\u0005\b\u008f\u0001\u0010qJ\u001a\u0010\u0091\u0001\u001a\u00020\u00122\u0007\u0010\u0090\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0091\u0001\u0010kJ\u001a\u0010\u0093\u0001\u001a\u00020\u00122\u0007\u0010\u0092\u0001\u001a\u00020nH\u0016¢\u0006\u0005\b\u0093\u0001\u0010qJ\u001c\u0010\u0096\u0001\u001a\u00020\u00122\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0099\u0001\u001a\u00020\u00122\u0007\u0010\u0098\u0001\u001a\u00020DH\u0016¢\u0006\u0005\b\u0099\u0001\u0010GJ\u001c\u0010\u009b\u0001\u001a\u00020\u00122\t\b\u0001\u0010\u009a\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u009b\u0001\u0010kJ\u001c\u0010\u009d\u0001\u001a\u00020\u00122\t\b\u0001\u0010\u009c\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u009d\u0001\u0010kJ\u001a\u0010\u009f\u0001\u001a\u00020\u00122\u0007\u0010\u009e\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u009f\u0001\u0010kJ\u001a\u0010¡\u0001\u001a\u00020\u00122\u0007\u0010 \u0001\u001a\u00020nH\u0016¢\u0006\u0005\b¡\u0001\u0010qJ\u001c\u0010¤\u0001\u001a\u00020\u00122\b\u0010£\u0001\u001a\u00030¢\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001a\u0010¦\u0001\u001a\u00020\u00122\u0007\u0010\u0088\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b¦\u0001\u0010kJ\u001a\u0010§\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020nH\u0016¢\u0006\u0005\b§\u0001\u0010qJ\u001c\u0010ª\u0001\u001a\u00020\u00122\b\u0010©\u0001\u001a\u00030¨\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001a\u0010\u00ad\u0001\u001a\u00020\u00122\u0007\u0010¬\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u00ad\u0001\u0010kJ\u001a\u0010¯\u0001\u001a\u00020\u00122\u0007\u0010®\u0001\u001a\u00020nH\u0016¢\u0006\u0005\b¯\u0001\u0010qJ\u001a\u0010±\u0001\u001a\u00020\u00122\u0007\u0010°\u0001\u001a\u00020DH\u0016¢\u0006\u0005\b±\u0001\u0010GJ\u001c\u0010³\u0001\u001a\u00020\u00122\t\b\u0001\u0010²\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b³\u0001\u0010kJ\u001c\u0010µ\u0001\u001a\u00020\u00122\t\b\u0001\u0010´\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bµ\u0001\u0010kJ\u001c\u0010¸\u0001\u001a\u00020\u00122\b\u0010·\u0001\u001a\u00030¶\u0001H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001a\u0010»\u0001\u001a\u00020\u00122\u0007\u0010º\u0001\u001a\u00020DH\u0016¢\u0006\u0005\b»\u0001\u0010GJ\u001c\u0010¼\u0001\u001a\u00020\u00122\b\u0010·\u0001\u001a\u00030¶\u0001H\u0016¢\u0006\u0006\b¼\u0001\u0010¹\u0001J\u001a\u0010¾\u0001\u001a\u00020\u00122\u0007\u0010½\u0001\u001a\u00020nH\u0016¢\u0006\u0005\b¾\u0001\u0010qJ\u001a\u0010À\u0001\u001a\u00020\u00122\u0007\u0010¿\u0001\u001a\u00020nH\u0016¢\u0006\u0005\bÀ\u0001\u0010qJ\u001a\u0010Â\u0001\u001a\u00020\u00122\u0007\u0010Á\u0001\u001a\u00020DH\u0016¢\u0006\u0005\bÂ\u0001\u0010GJ\u001c\u0010Ä\u0001\u001a\u00020\u00122\t\b\u0001\u0010Ã\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÄ\u0001\u0010kJ\u001a\u0010Æ\u0001\u001a\u00020\u00122\u0007\u0010Å\u0001\u001a\u00020nH\u0016¢\u0006\u0005\bÆ\u0001\u0010qJ\u001a\u0010È\u0001\u001a\u00020\u00122\u0007\u0010Ç\u0001\u001a\u00020DH\u0016¢\u0006\u0005\bÈ\u0001\u0010GJ\u001c\u0010Ë\u0001\u001a\u00020\u00122\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0016¢\u0006\u0006\bË\u0001\u0010Ì\u0001J0\u0010Ð\u0001\u001a\u00020\u00122\b\u0010Í\u0001\u001a\u00030É\u00012\b\u0010Î\u0001\u001a\u00030É\u00012\b\u0010Ï\u0001\u001a\u00030É\u0001H\u0016¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001c\u0010Ò\u0001\u001a\u00020\u00122\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0016¢\u0006\u0006\bÒ\u0001\u0010Ì\u0001J0\u0010Ö\u0001\u001a\u00020\u00122\b\u0010Ó\u0001\u001a\u00030É\u00012\b\u0010Ô\u0001\u001a\u00030É\u00012\b\u0010Õ\u0001\u001a\u00030É\u0001H\u0016¢\u0006\u0006\bÖ\u0001\u0010Ñ\u0001J\u0019\u0010×\u0001\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0010H\u0016¢\u0006\u0005\b×\u0001\u0010kJ\u0019\u0010Ø\u0001\u001a\u00020\u00122\u0006\u0010v\u001a\u00020nH\u0016¢\u0006\u0005\bØ\u0001\u0010qJ\u0019\u0010Ù\u0001\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÙ\u0001\u0010kJ\u0019\u0010Ú\u0001\u001a\u00020\u00122\u0006\u0010v\u001a\u00020nH\u0016¢\u0006\u0005\bÚ\u0001\u0010qJ\u001c\u0010Ü\u0001\u001a\u00020\u00122\t\b\u0001\u0010Û\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÜ\u0001\u0010kJ\u001c\u0010Þ\u0001\u001a\u00020\u00122\t\b\u0001\u0010Ý\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÞ\u0001\u0010kJ\u001c\u0010ß\u0001\u001a\u00020\u00122\t\b\u0001\u0010Û\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bß\u0001\u0010kJ\u001c\u0010à\u0001\u001a\u00020\u00122\t\b\u0001\u0010Ý\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bà\u0001\u0010kJ\u001a\u0010â\u0001\u001a\u00020\u00122\u0007\u0010á\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bâ\u0001\u0010kJ\u001a\u0010ä\u0001\u001a\u00020\u00122\u0007\u0010ã\u0001\u001a\u00020nH\u0016¢\u0006\u0005\bä\u0001\u0010qJ\u001a\u0010æ\u0001\u001a\u00020\u00122\u0007\u0010å\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bæ\u0001\u0010kJ\u001a\u0010è\u0001\u001a\u00020\u00122\u0007\u0010ç\u0001\u001a\u00020nH\u0016¢\u0006\u0005\bè\u0001\u0010qJ\u001a\u0010ê\u0001\u001a\u00020\u00122\u0007\u0010é\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bê\u0001\u0010kJ\u001a\u0010ë\u0001\u001a\u00020\u00122\u0007\u0010é\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bë\u0001\u0010kR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010ì\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010í\u0001R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010î\u0001R\u0018\u0010ï\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bB\u0010Þ\u0001R\u0018\u0010ð\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bW\u0010Þ\u0001R\u0018\u0010ñ\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\\\u0010Þ\u0001R\u0018\u0010ò\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b[\u0010Þ\u0001R\u0018\u0010ó\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010Þ\u0001R\u0018\u0010ô\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010Þ\u0001R\u0018\u0010ö\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010õ\u0001R\u001a\u0010ø\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010÷\u0001R\u001a\u0010ú\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\by\u0010ù\u0001¨\u0006ü\u0001"}, d2 = {"Ll/i7c;", "Ll/ie50;", "Ll/if50;", "", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;", "wheelYearView", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;", "wheelMonthView", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;", "wheelDayView", "<init>", "(Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;)V", "Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "wheelView", "Ll/l01;", "adapter", "", "position", "", "c", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView;Ll/l01;I)V", "scrollOffsetY", "a", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView;I)V", "state", "b", "Ll/nwm;", "textFormatter", "T0", "(Ll/nwm;)V", "Z", "v", "Ll/od50;", "listener", "c0", "(Ll/od50;)V", "d0", "(Ll/if50;)V", "startYear", "endYear", "S0", "(II)V", "Ljava/util/Date;", "date", "s0", "(Ljava/util/Date;)V", "Ljava/util/Calendar;", "calendar", "r0", "(Ljava/util/Calendar;)V", "year", "month", "day", "q0", "(III)V", "maxDate", "S", "maxCalendar", "Q", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "overRangeMode", "R", "(Ljava/util/Calendar;Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "minCalendar", "s", "(Ljava/util/Calendar;Ljava/util/Calendar;Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "d", "()Ljava/util/Date;", "", "isShow", "z0", "(Z)V", "y0", "w0", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;", "measureType", "Q0", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;)V", "X", "t", "T", "yearType", "monthType", "dayType", "U", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;Lcom/p1/mobile/putong/ui/datepicker/WheelView$MeasureType;)V", "", "e", "()Ljava/lang/String;", "h", "()I", "g", "f", "k", "()Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;", "j", "()Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;", "i", "()Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;", "str", "R0", "(Ljava/lang/String;)V", "Y", "u", "e0", "visibleItems", "N0", "(I)V", "lineSpacingPx", "P", "", "lineSpacingDp", "O", "(F)V", "isCyclic", "r", "textSizePx", "L0", "textSizeSp", "K0", "autoFit", "l", "minTextSizePx", "W", "minTextSizeSp", "V", "Landroid/graphics/Paint$Align;", "textAlign", "D0", "(Landroid/graphics/Paint$Align;)V", "textColor", "a0", "textColorRes", "b0", "t0", "u0", "paddingPx", "F0", "paddingDp", "E0", "textPaddingLeftPx", "H0", "textPaddingLeftDp", "G0", "textPaddingRightPx", "J0", "textPaddingRightDp", "I0", "Landroid/graphics/Typeface;", "typeface", "M0", "(Landroid/graphics/Typeface;)V", "showDivider", "x0", "dividerColor", "y", "dividerColorRes", "z", "dividerHeightPx", "B", "dividerHeightDp", "A", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;", "dividerType", "E", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$DividerType;)V", "P0", "O0", "Landroid/graphics/Paint$Cap;", "cap", "x", "(Landroid/graphics/Paint$Cap;)V", "offsetYPx", "D", "offsetYDp", "C", "showCurtain", "v0", "curtainColor", "m", "curtainColorRes", "n", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;", "direction", "w", "(Lcom/p1/mobile/putong/ui/datepicker/WheelView$CurvedArcDirection;)V", "curved", "o", "p", "factor", "q", "ratio", "f0", "soundEffect", "A0", "soundRes", "B0", "playVolume", "C0", "reset", "g0", "", "text", "F", "(Ljava/lang/CharSequence;)V", "yearLeft", "monthLeft", "dayLeft", "G", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "h0", "yearRight", "monthRight", "dayRight", "i0", "N", "M", "p0", "o0", "color", "H", "colorRes", "I", "j0", "k0", "marginRightPx", "L", "marginRightDp", "K", "marginLeftPx", "n0", "marginLeftDp", "m0", "gravity", "J", "l0", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;", "minYear", "maxYear", "minMonth", "maxMonth", "minDay", "maxDay", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "mOverRangeMode", "Ll/od50;", "dateSelectedListener", "Ll/if50;", "scrollChangedListener", "Companion", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class i7c implements ie50, if50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public WheelYearView wheelYearView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public WheelMonthView wheelMonthView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public WheelDayView wheelDayView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int minYear = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int maxYear = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int minMonth = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int maxMonth = -1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int minDay = -1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int maxDay = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public WheelView.OverRangeMode mOverRangeMode = WheelView.OverRangeMode.NORMAL;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public od50 dateSelectedListener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public if50 scrollChangedListener;

    public i7c(@Nullable WheelYearView wheelYearView, @Nullable WheelMonthView wheelMonthView, @Nullable WheelDayView wheelDayView) {
        this.wheelYearView = wheelYearView;
        this.wheelMonthView = wheelMonthView;
        this.wheelDayView = wheelDayView;
        if (wheelYearView != null) {
            wheelYearView.setOnItemSelectedListener(this);
        }
        WheelMonthView wheelMonthView2 = this.wheelMonthView;
        if (wheelMonthView2 != null) {
            wheelMonthView2.setOnItemSelectedListener(this);
        }
        WheelDayView wheelDayView2 = this.wheelDayView;
        if (wheelDayView2 != null) {
            wheelDayView2.setOnItemSelectedListener(this);
        }
        WheelYearView wheelYearView2 = this.wheelYearView;
        if (wheelYearView2 != null) {
            wheelYearView2.setOnScrollChangedListener(this);
        }
        WheelMonthView wheelMonthView3 = this.wheelMonthView;
        if (wheelMonthView3 != null) {
            wheelMonthView3.setOnScrollChangedListener(this);
        }
        WheelDayView wheelDayView3 = this.wheelDayView;
        if (wheelDayView3 != null) {
            wheelDayView3.setOnScrollChangedListener(this);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m16186A(float dividerHeightDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerHeight(dividerHeightDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerHeight(dividerHeightDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerHeight(dividerHeightDp);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m16187A0(boolean soundEffect) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setSoundEffect(soundEffect);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setSoundEffect(soundEffect);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setSoundEffect(soundEffect);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m16188B(int dividerHeightPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerHeight(dividerHeightPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerHeight(dividerHeightPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerHeight(dividerHeightPx);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m16189B0(@RawRes int soundRes) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setSoundResource(soundRes);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setSoundResource(soundRes);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setSoundResource(soundRes);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m16190C(float offsetYDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerOffsetY(offsetYDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerOffsetY(offsetYDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerOffsetY(offsetYDp);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m16191C0(float playVolume) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setSoundVolume(playVolume);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setSoundVolume(playVolume);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setSoundVolume(playVolume);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m16192D(int offsetYPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerOffsetY(offsetYPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerOffsetY(offsetYPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerOffsetY(offsetYPx);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m16193D0(@NotNull Paint.Align textAlign) {
        textAlign.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextAlign(textAlign);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextAlign(textAlign);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextAlign(textAlign);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m16194E(@NotNull WheelView.DividerType dividerType) {
        dividerType.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerType(dividerType);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerType(dividerType);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerType(dividerType);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m16195E0(float paddingDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextPadding(paddingDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextPadding(paddingDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextPadding(paddingDp);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m16196F(@NotNull CharSequence text) {
        text.getClass();
        m16198G(text, text, text);
    }

    /* JADX INFO: renamed from: F0 */
    public void m16197F0(int paddingPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextPaddingLeft(paddingPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextPaddingLeft(paddingPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextPaddingLeft(paddingPx);
        }
        WheelYearView wheelYearView2 = this.wheelYearView;
        if (wheelYearView2 != null) {
            wheelYearView2.setTextPaddingRight(paddingPx);
        }
        WheelMonthView wheelMonthView2 = this.wheelMonthView;
        if (wheelMonthView2 != null) {
            wheelMonthView2.setTextPaddingRight(paddingPx);
        }
        WheelDayView wheelDayView2 = this.wheelDayView;
        if (wheelDayView2 != null) {
            wheelDayView2.setTextPaddingRight(paddingPx);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m16198G(@NotNull CharSequence yearLeft, @NotNull CharSequence monthLeft, @NotNull CharSequence dayLeft) {
        yearLeft.getClass();
        monthLeft.getClass();
        dayLeft.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftText(yearLeft);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftText(monthLeft);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftText(dayLeft);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m16199G0(float textPaddingLeftDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextPaddingLeft(textPaddingLeftDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextPaddingLeft(textPaddingLeftDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextPaddingLeft(textPaddingLeftDp);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m16200H(@ColorInt int color) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftTextColor(color);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftTextColor(color);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftTextColor(color);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m16201H0(int textPaddingLeftPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextPaddingLeft(textPaddingLeftPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextPaddingLeft(textPaddingLeftPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextPaddingLeft(textPaddingLeftPx);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m16202I(@ColorRes int colorRes) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftTextColorRes(colorRes);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftTextColorRes(colorRes);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftTextColorRes(colorRes);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m16203I0(float textPaddingRightDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextPaddingRight(textPaddingRightDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextPaddingRight(textPaddingRightDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextPaddingRight(textPaddingRightDp);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m16204J(int gravity) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftTextGravity(gravity);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftTextGravity(gravity);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftTextGravity(gravity);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m16205J0(int textPaddingRightPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextPaddingRight(textPaddingRightPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextPaddingRight(textPaddingRightPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextPaddingRight(textPaddingRightPx);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m16206K(float marginRightDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftTextMarginRight(marginRightDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftTextMarginRight(marginRightDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftTextMarginRight(marginRightDp);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m16207K0(float textSizeSp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextSize(textSizeSp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextSize(textSizeSp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextSize(textSizeSp);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m16208L(int marginRightPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftTextMarginRight(marginRightPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftTextMarginRight(marginRightPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftTextMarginRight(marginRightPx);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m16209L0(int textSizePx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextSize(textSizePx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextSize(textSizePx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextSize(textSizePx);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m16210M(float textSizeSp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftTextSize(textSizeSp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftTextSize(textSizeSp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftTextSize(textSizeSp);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m16211M0(@NotNull Typeface typeface) {
        typeface.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.m9784O0(typeface, false);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.m9784O0(typeface, false);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.m9784O0(typeface, false);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m16212N(int textSizePx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLeftTextSize(textSizePx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLeftTextSize(textSizePx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLeftTextSize(textSizePx);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m16213N0(int visibleItems) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setVisibleItems(visibleItems);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setVisibleItems(visibleItems);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setVisibleItems(visibleItems);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m16214O(float lineSpacingDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLineSpacing(lineSpacingDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLineSpacing(lineSpacingDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLineSpacing(lineSpacingDp);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m16215O0(float paddingDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerPadding(paddingDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerPadding(paddingDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerPadding(paddingDp);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m16216P(int lineSpacingPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setLineSpacing(lineSpacingPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setLineSpacing(lineSpacingPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setLineSpacing(lineSpacingPx);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m16217P0(int paddingPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerPadding(paddingPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerPadding(paddingPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerPadding(paddingPx);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m16218Q(@NotNull Calendar maxCalendar) {
        maxCalendar.getClass();
        m16220R(maxCalendar, WheelView.OverRangeMode.NORMAL);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m16219Q0(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setMaxTextWidthMeasureType(measureType);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m16220R(@NotNull Calendar maxCalendar, @NotNull WheelView.OverRangeMode overRangeMode) {
        maxCalendar.getClass();
        overRangeMode.getClass();
        Integer num = (Integer) m16252k().m9800b0(0);
        this.minYear = num != null ? num.intValue() : 1970;
        this.maxYear = maxCalendar.get(1);
        this.minMonth = 1;
        this.maxMonth = maxCalendar.get(2) + 1;
        this.minDay = 1;
        this.maxDay = maxCalendar.get(5);
        this.mOverRangeMode = overRangeMode;
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            WheelYearView.m9884Y0(wheelYearView, 0, this.maxYear, overRangeMode, 1, null);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m16221R0(@NotNull String str) {
        str.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setPrefixText(str);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m16222S(@NotNull Date maxDate) {
        maxDate.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(maxDate);
        m16220R(calendar, WheelView.OverRangeMode.NORMAL);
    }

    /* JADX INFO: renamed from: S0 */
    public void m16223S0(int startYear, int endYear) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.m9888Z0(startYear, endYear);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m16224T(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        m16226U(measureType, measureType, measureType);
    }

    /* JADX INFO: renamed from: T0 */
    public void m16225T0(@NotNull nwm textFormatter) {
        textFormatter.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setTextFormatter(textFormatter);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m16226U(@NotNull WheelView.MeasureType yearType, @NotNull WheelView.MeasureType monthType, @NotNull WheelView.MeasureType dayType) {
        yearType.getClass();
        monthType.getClass();
        dayType.getClass();
        m16219Q0(yearType);
        m16229X(monthType);
        m16270t(dayType);
    }

    /* JADX INFO: renamed from: V */
    public void m16227V(float minTextSizeSp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setMinTextSize(minTextSizeSp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setMinTextSize(minTextSizeSp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setMinTextSize(minTextSizeSp);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m16228W(int minTextSizePx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setMinTextSize(minTextSizePx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setMinTextSize(minTextSizePx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setMinTextSize(minTextSizePx);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m16229X(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setMaxTextWidthMeasureType(measureType);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m16230Y(@NotNull String str) {
        str.getClass();
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setPrefixText(str);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m16231Z(@NotNull nwm textFormatter) {
        textFormatter.getClass();
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setTextFormatter(textFormatter);
        }
    }

    @Override // p009l.if50
    /* JADX INFO: renamed from: a */
    public void mo16232a(@NotNull WheelView wheelView, int scrollOffsetY) {
        wheelView.getClass();
        if50 if50Var = this.scrollChangedListener;
        if (if50Var != null) {
            if50Var.mo16232a(wheelView, scrollOffsetY);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m16233a0(@ColorInt int textColor) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setNormalTextColor(textColor);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setNormalTextColor(textColor);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setNormalTextColor(textColor);
        }
    }

    @Override // p009l.if50
    /* JADX INFO: renamed from: b */
    public void mo16234b(@NotNull WheelView wheelView, int state) {
        wheelView.getClass();
        if50 if50Var = this.scrollChangedListener;
        if (if50Var != null) {
            if50Var.mo16234b(wheelView, state);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m16235b0(@ColorRes int textColorRes) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setNormalTextColorRes(textColorRes);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setNormalTextColorRes(textColorRes);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setNormalTextColorRes(textColorRes);
        }
    }

    @Override // p009l.ie50
    /* JADX INFO: renamed from: c */
    public void mo16236c(@NotNull WheelView wheelView, @NotNull l01<?> adapter, int position) {
        Integer num;
        wheelView.getClass();
        adapter.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        int id = wheelYearView != null ? wheelYearView.getId() : -1;
        WheelMonthView wheelMonthView = this.wheelMonthView;
        int id2 = wheelMonthView != null ? wheelMonthView.getId() : -1;
        int id3 = wheelView.getId();
        if (id3 == id) {
            WheelYearView wheelYearView2 = this.wheelYearView;
            int iIntValue = (wheelYearView2 == null || (num = (Integer) wheelYearView2.m9800b0(position)) == null) ? 1970 : num.intValue();
            WheelDayView wheelDayView = this.wheelDayView;
            if (wheelDayView != null) {
                wheelDayView.setYear(iIntValue);
            }
            if (iIntValue == this.minYear) {
                WheelMonthView wheelMonthView2 = this.wheelMonthView;
                if (wheelMonthView2 != null) {
                    wheelMonthView2.m9878W0(this.minMonth, 12, this.mOverRangeMode);
                }
                int iM16244g = m16244g();
                WheelDayView wheelDayView2 = this.wheelDayView;
                if (wheelDayView2 != null) {
                    wheelDayView2.setMonth(iM16244g);
                }
                int i = this.minMonth;
                WheelDayView wheelDayView3 = this.wheelDayView;
                if (iM16244g == i) {
                    if (wheelDayView3 != null) {
                        wheelDayView3.m9865Y0(this.minDay, wheelDayView3.getMaxDay(), this.mOverRangeMode);
                    }
                } else if (wheelDayView3 != null) {
                    wheelDayView3.m9864X0(-1, -1);
                }
            } else if (iIntValue == this.maxYear) {
                WheelMonthView wheelMonthView3 = this.wheelMonthView;
                if (wheelMonthView3 != null) {
                    wheelMonthView3.m9878W0(1, this.maxMonth, this.mOverRangeMode);
                }
                int iM16244g2 = m16244g();
                WheelDayView wheelDayView4 = this.wheelDayView;
                if (wheelDayView4 != null) {
                    wheelDayView4.setMonth(iM16244g2);
                }
                int i2 = this.maxMonth;
                WheelDayView wheelDayView5 = this.wheelDayView;
                if (iM16244g2 == i2) {
                    if (wheelDayView5 != null) {
                        wheelDayView5.m9865Y0(1, this.maxDay, this.mOverRangeMode);
                    }
                } else if (wheelDayView5 != null) {
                    wheelDayView5.m9864X0(-1, -1);
                }
            } else {
                WheelDayView wheelDayView6 = this.wheelDayView;
                if (wheelDayView6 != null) {
                    wheelDayView6.setMonth(m16244g());
                }
                WheelMonthView wheelMonthView4 = this.wheelMonthView;
                if (wheelMonthView4 != null) {
                    wheelMonthView4.m9877V0(-1, -1);
                }
                WheelDayView wheelDayView7 = this.wheelDayView;
                if (wheelDayView7 != null) {
                    wheelDayView7.m9864X0(-1, -1);
                }
            }
        } else if (id3 == id2) {
            WheelDayView wheelDayView8 = this.wheelDayView;
            if (wheelDayView8 != null) {
                wheelDayView8.setMonth(position + 1);
            }
            int iM16246h = m16246h();
            int i3 = position + 1;
            if (i3 == this.minMonth && iM16246h == this.minYear) {
                WheelDayView wheelDayView9 = this.wheelDayView;
                if (wheelDayView9 != null) {
                    wheelDayView9.m9865Y0(this.minDay, wheelDayView9.getMaxDay(), this.mOverRangeMode);
                }
            } else if (i3 == this.maxMonth && iM16246h == this.maxYear) {
                WheelDayView wheelDayView10 = this.wheelDayView;
                if (wheelDayView10 != null) {
                    wheelDayView10.m9865Y0(1, this.maxDay, this.mOverRangeMode);
                }
            } else {
                WheelDayView wheelDayView11 = this.wheelDayView;
                if (wheelDayView11 != null) {
                    wheelDayView11.m9864X0(-1, -1);
                }
            }
        }
        od50 od50Var = this.dateSelectedListener;
        if (od50Var != null) {
            od50Var.m19681a(m16246h(), m16244g(), m16242f(), m16238d());
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m16237c0(@Nullable od50 listener) {
        this.dateSelectedListener = listener;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public Date m16238d() {
        try {
            Date date = new SimpleDateFormat("yyyy-M-d", Locale.getDefault()).parse(m16240e());
            return date == null ? new Date() : date;
        } catch (ParseException unused) {
            return new Date();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m16239d0(@Nullable if50 listener) {
        this.scrollChangedListener = listener;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public String m16240e() {
        return m16246h() + "-" + m16244g() + "-" + m16242f();
    }

    /* JADX INFO: renamed from: e0 */
    public void m16241e0(@NotNull String str) {
        str.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setPrefixText(str);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setPrefixText(str);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setPrefixText(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public int m16242f() {
        Integer num = (Integer) m16248i().getSelectedItem();
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    /* JADX INFO: renamed from: f0 */
    public void m16243f0(float ratio) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRefractRatio(ratio);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRefractRatio(ratio);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRefractRatio(ratio);
        }
    }

    /* JADX INFO: renamed from: g */
    public int m16244g() {
        return m16250j().getSelectedPosition() + 1;
    }

    /* JADX INFO: renamed from: g0 */
    public void m16245g0(boolean reset) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setResetSelectedPosition(reset);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setResetSelectedPosition(reset);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setResetSelectedPosition(reset);
        }
    }

    /* JADX INFO: renamed from: h */
    public int m16246h() {
        Integer num = (Integer) m16252k().getSelectedItem();
        if (num != null) {
            return num.intValue();
        }
        return 1970;
    }

    /* JADX INFO: renamed from: h0 */
    public void m16247h0(@NotNull CharSequence text) {
        text.getClass();
        m16249i0(text, text, text);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public WheelDayView m16248i() {
        if (this.wheelYearView == null) {
            ig3.a("WheelDayView is null.");
            return null;
        }
        WheelDayView wheelDayView = this.wheelDayView;
        wheelDayView.getClass();
        return wheelDayView;
    }

    /* JADX INFO: renamed from: i0 */
    public void m16249i0(@NotNull CharSequence yearRight, @NotNull CharSequence monthRight, @NotNull CharSequence dayRight) {
        yearRight.getClass();
        monthRight.getClass();
        dayRight.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightText(yearRight);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightText(monthRight);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightText(dayRight);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public WheelMonthView m16250j() {
        if (this.wheelYearView == null) {
            ig3.a("WheelMonthView is null.");
            return null;
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        wheelMonthView.getClass();
        return wheelMonthView;
    }

    /* JADX INFO: renamed from: j0 */
    public void m16251j0(@ColorInt int color) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightTextColor(color);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightTextColor(color);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightTextColor(color);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public WheelYearView m16252k() {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.getClass();
            return wheelYearView;
        }
        ig3.a("WheelYearView is null.");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public void m16253k0(@ColorRes int colorRes) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightTextColorRes(colorRes);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightTextColorRes(colorRes);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightTextColorRes(colorRes);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m16254l(boolean autoFit) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setAutoFitTextSize(autoFit);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setAutoFitTextSize(autoFit);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setAutoFitTextSize(autoFit);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m16255l0(int gravity) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightTextGravity(gravity);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightTextGravity(gravity);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightTextGravity(gravity);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m16256m(@ColorInt int curtainColor) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setCurtainColor(curtainColor);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setCurtainColor(curtainColor);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setCurtainColor(curtainColor);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m16257m0(float marginLeftDp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightTextMarginLeft(marginLeftDp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightTextMarginLeft(marginLeftDp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightTextMarginLeft(marginLeftDp);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m16258n(@ColorRes int curtainColorRes) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setCurtainColorRes(curtainColorRes);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setCurtainColorRes(curtainColorRes);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setCurtainColorRes(curtainColorRes);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m16259n0(int marginLeftPx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightTextMarginLeft(marginLeftPx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightTextMarginLeft(marginLeftPx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightTextMarginLeft(marginLeftPx);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m16260o(boolean curved) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setCurved(curved);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setCurved(curved);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setCurved(curved);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m16261o0(float textSizeSp) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightTextSize(textSizeSp);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightTextSize(textSizeSp);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightTextSize(textSizeSp);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m16262p(@NotNull WheelView.CurvedArcDirection direction) {
        direction.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setCurvedArcDirection(direction);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setCurvedArcDirection(direction);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setCurvedArcDirection(direction);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m16263p0(int textSizePx) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setRightTextSize(textSizePx);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setRightTextSize(textSizePx);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setRightTextSize(textSizePx);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m16264q(float factor) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setCurvedArcDirectionFactor(factor);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setCurvedArcDirectionFactor(factor);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setCurvedArcDirectionFactor(factor);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m16265q0(int year, int month, int day) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            WheelYearView.m9882U0(wheelYearView, year, false, 0, 6, null);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            WheelMonthView.m9874U0(wheelMonthView, month, false, 0, 6, null);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            WheelDayView.m9860W0(wheelDayView, day, false, 0, 6, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m16266r(boolean isCyclic) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setCyclic(isCyclic);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setCyclic(isCyclic);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setCyclic(isCyclic);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m16267r0(@NotNull Calendar calendar) {
        calendar.getClass();
        m16265q0(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    /* JADX INFO: renamed from: s */
    public void m16268s(@NotNull Calendar minCalendar, @NotNull Calendar maxCalendar, @NotNull WheelView.OverRangeMode overRangeMode) {
        minCalendar.getClass();
        maxCalendar.getClass();
        overRangeMode.getClass();
        this.minYear = minCalendar.get(1);
        this.maxYear = maxCalendar.get(1);
        this.minMonth = minCalendar.get(2) + 1;
        this.maxMonth = maxCalendar.get(2) + 1;
        this.minDay = minCalendar.get(5);
        this.maxDay = maxCalendar.get(5);
        this.mOverRangeMode = overRangeMode;
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.m9887W0(this.minYear, this.maxYear, overRangeMode);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m16269s0(@NotNull Date date) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        m16267r0(calendar);
    }

    /* JADX INFO: renamed from: t */
    public void m16270t(@NotNull WheelView.MeasureType measureType) {
        measureType.getClass();
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setMaxTextWidthMeasureType(measureType);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m16271t0(@ColorInt int textColor) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setSelectedTextColor(textColor);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setSelectedTextColor(textColor);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setSelectedTextColor(textColor);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m16272u(@NotNull String str) {
        str.getClass();
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setPrefixText(str);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m16273u0(@ColorRes int textColorRes) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setSelectedTextColorRes(textColorRes);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setSelectedTextColorRes(textColorRes);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setSelectedTextColorRes(textColorRes);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m16274v(@NotNull nwm textFormatter) {
        textFormatter.getClass();
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setTextFormatter(textFormatter);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m16275v0(boolean showCurtain) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setShowCurtain(showCurtain);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setShowCurtain(showCurtain);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setShowCurtain(showCurtain);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m16276w(@NotNull WheelView.CurvedArcDirection direction) {
        direction.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDirection(direction);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDirection(direction);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDirection(direction);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m16277w0(boolean isShow) {
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setVisibility(isShow ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m16278x(@NotNull Paint.Cap cap) {
        cap.getClass();
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerCap(cap);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerCap(cap);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerCap(cap);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m16279x0(boolean showDivider) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setShowDivider(showDivider);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setShowDivider(showDivider);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setShowDivider(showDivider);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m16280y(@ColorInt int dividerColor) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerColor(dividerColor);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerColor(dividerColor);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerColor(dividerColor);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m16281y0(boolean isShow) {
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setVisibility(isShow ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m16282z(@ColorRes int dividerColorRes) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setDividerColorRes(dividerColorRes);
        }
        WheelMonthView wheelMonthView = this.wheelMonthView;
        if (wheelMonthView != null) {
            wheelMonthView.setDividerColorRes(dividerColorRes);
        }
        WheelDayView wheelDayView = this.wheelDayView;
        if (wheelDayView != null) {
            wheelDayView.setDividerColorRes(dividerColorRes);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m16283z0(boolean isShow) {
        WheelYearView wheelYearView = this.wheelYearView;
        if (wheelYearView != null) {
            wheelYearView.setVisibility(isShow ? 0 : 8);
        }
    }
}
