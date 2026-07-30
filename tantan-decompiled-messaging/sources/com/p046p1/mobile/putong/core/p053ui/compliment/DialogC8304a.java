package com.p046p1.mobile.putong.core.p053ui.compliment;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.C0613s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ComplimentText;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.compliment.DialogC8304a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.AutoVDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p149l.b2s;
import p149l.bd50;
import p149l.bo5;
import p149l.co5;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.eqh0;
import p149l.g30;
import p149l.gbl0;
import p149l.i0e;
import p149l.iyb0;
import p149l.j6f;
import p149l.jo0;
import p149l.m6q0;
import p149l.mb90;
import p149l.mkd0;
import p149l.o59;
import p149l.o6n;
import p149l.osi0;
import p149l.q89;
import p149l.qib0;
import p149l.roj0;
import p149l.rtm;
import p149l.szd;
import p149l.t100;
import p149l.u7c0;
import p149l.vwb;
import p149l.w0c0;
import p149l.wp5;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.xp5;
import p149l.y6q0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ²\u00022\u00020\u0001:\u0002³\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u000fJ!\u0010#\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u000fJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010)J+\u0010.\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b3\u0010$J\u0017\u00104\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u001fJ\u0019\u00107\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010\u000fJ\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010\u000fJ+\u0010=\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010/J'\u0010@\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u0001052\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bB\u00108J\u0017\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010\u000fJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020!2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bR\u0010\u000fJ\u0017\u0010S\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010\u001fJ\u000f\u0010T\u001a\u00020\rH\u0002¢\u0006\u0004\bT\u0010\u000fJ\u001f\u0010Z\u001a\u00020Y2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b^\u0010_J!\u0010a\u001a\u00020\u00002\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0`¢\u0006\u0004\ba\u0010bJ\u0019\u0010e\u001a\u00020\r2\b\u0010d\u001a\u0004\u0018\u00010cH\u0014¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\rH\u0016¢\u0006\u0004\bg\u0010\u000fJ\u000f\u0010h\u001a\u00020\rH\u0016¢\u0006\u0004\bh\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010nR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0085\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010xR*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010t\u001a\u0005\b\u0097\u0001\u0010v\"\u0005\b\u0098\u0001\u0010xR*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010¥\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u009c\u0001\u001a\u0006\b£\u0001\u0010\u009e\u0001\"\u0006\b¤\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010\u0088\u0001\u001a\u0006\b§\u0001\u0010\u008a\u0001\"\u0006\b¨\u0001\u0010\u008c\u0001R)\u0010¬\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bN\u0010\u009c\u0001\u001a\u0006\bª\u0001\u0010\u009e\u0001\"\u0006\b«\u0001\u0010 \u0001R%\u0010¯\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bO\u0010t\u001a\u0005\b\u00ad\u0001\u0010v\"\u0005\b®\u0001\u0010xR&\u0010³\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010t\u001a\u0005\b±\u0001\u0010v\"\u0005\b²\u0001\u0010xR*\u0010·\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010\u0090\u0001\u001a\u0006\bµ\u0001\u0010\u0092\u0001\"\u0006\b¶\u0001\u0010\u0094\u0001R*\u0010»\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0001\u0010\u009c\u0001\u001a\u0006\b¹\u0001\u0010\u009e\u0001\"\u0006\bº\u0001\u0010 \u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R&\u0010Ç\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÄ\u0001\u0010t\u001a\u0005\bÅ\u0001\u0010v\"\u0005\bÆ\u0001\u0010xR*\u0010Ë\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010\u0088\u0001\u001a\u0006\bÉ\u0001\u0010\u008a\u0001\"\u0006\bÊ\u0001\u0010\u008c\u0001R*\u0010Ï\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010\u0088\u0001\u001a\u0006\bÍ\u0001\u0010\u008a\u0001\"\u0006\bÎ\u0001\u0010\u008c\u0001R&\u0010Ó\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÐ\u0001\u0010t\u001a\u0005\bÑ\u0001\u0010v\"\u0005\bÒ\u0001\u0010xR*\u0010×\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010\u0090\u0001\u001a\u0006\bÕ\u0001\u0010\u0092\u0001\"\u0006\bÖ\u0001\u0010\u0094\u0001R*\u0010ß\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R*\u0010ç\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R&\u0010ë\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bè\u0001\u0010t\u001a\u0005\bé\u0001\u0010v\"\u0005\bê\u0001\u0010xR*\u0010ï\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bì\u0001\u0010\u0090\u0001\u001a\u0006\bí\u0001\u0010\u0092\u0001\"\u0006\bî\u0001\u0010\u0094\u0001R*\u0010ó\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bð\u0001\u0010â\u0001\u001a\u0006\bñ\u0001\u0010ä\u0001\"\u0006\bò\u0001\u0010æ\u0001R*\u0010÷\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010Ú\u0001\u001a\u0006\bõ\u0001\u0010Ü\u0001\"\u0006\bö\u0001\u0010Þ\u0001R*\u0010û\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bø\u0001\u0010Ú\u0001\u001a\u0006\bù\u0001\u0010Ü\u0001\"\u0006\bú\u0001\u0010Þ\u0001R&\u0010ÿ\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bü\u0001\u0010t\u001a\u0005\bý\u0001\u0010v\"\u0005\bþ\u0001\u0010xR*\u0010\u0083\u0002\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010¾\u0001\u001a\u0006\b\u0081\u0002\u0010À\u0001\"\u0006\b\u0082\u0002\u0010Â\u0001R&\u0010\u0087\u0002\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0002\u0010t\u001a\u0005\b\u0085\u0002\u0010v\"\u0005\b\u0086\u0002\u0010xR*\u0010\u008b\u0002\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0088\u0001\u001a\u0006\b\u0089\u0002\u0010\u008a\u0001\"\u0006\b\u008a\u0002\u0010\u008c\u0001R*\u0010\u0093\u0002\u001a\u00030\u008c\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u0097\u0002\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u0090\u0001\u001a\u0006\b\u0095\u0002\u0010\u0092\u0001\"\u0006\b\u0096\u0002\u0010\u0094\u0001R\u0019\u0010\u0099\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010Ù\u0001R\u001c\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u001b\u0010¤\u0002\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R'\u0010§\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u001a\u0010©\u0002\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0002\u0010nR\u0019\u0010«\u0002\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0002\u0010¥\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u0016\u0010±\u0002\u001a\u00020!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b°\u0002\u00101¨\u0006´\u0002"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/a;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "targetUser", "", "from", "", "initialPhotoIndex", "liveRoomInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "", "L1", "()V", "s1", "T1", "tab", "V1", "(I)V", "X1", "Y1", "x0", "y0", "Q1", "R1", "O1", "W1", "text", "z1", "(Ljava/lang/String;)V", "A1", "", "fromQuickText", "F0", "(Ljava/lang/String;Z)V", "C0", "y1", "D1", "I0", "()Ljava/lang/String;", "H0", NotificationCompat.CATEGORY_EVENT, "isUbc", "mcOnly", "E1", "(Ljava/lang/String;ZZ)V", "v1", "()Z", "pendingText", "U1", "J1", "Lcom/p1/mobile/putong/data/Envelope;", Envelope.TYPE, "t1", "(Lcom/p1/mobile/putong/data/Envelope;)Z", "A0", "C1", "B1", "isPassiveWhisper", "G1", "Lkotlin/Function0;", "onNotMatched", "x1", "(Lcom/p1/mobile/putong/data/Envelope;Lkotlin/jvm/functions/Function0;)V", "u1", "", "Lcom/p1/mobile/putong/data/Media;", "J0", "()Ljava/util/List;", "r1", "P1", "imeBottom", "systemBarsBottom", "z0", "(II)I", "", BaseSei.f13930X, BaseSei.f13931Y, "w1", "(FF)Z", "p1", "G0", "q1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "q0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", "callback", "N1", "(Ll/d30;)Lcom/p1/mobile/putong/core/ui/compliment/a;", "Lkotlin/Function1;", "M1", "(Lkotlin/jvm/functions/Function1;)Lcom/p1/mobile/putong/core/ui/compliment/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "show", SysnotifListener.ACTION_DISMISS, "j", "Lcom/p1/mobile/android/app/Act;", "k", "Lcom/p1/mobile/putong/data/User;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/String;", "m", "Ljava/lang/Integer;", "n", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "U0", "()Landroid/widget/LinearLayout;", "set_layoutrootview", "(Landroid/widget/LinearLayout;)V", "_layoutrootview", "Lv/AutoVDraweeView;", "p", "Lv/AutoVDraweeView;", "o1", "()Lv/AutoVDraweeView;", "set_top_gradient_bg", "(Lv/AutoVDraweeView;)V", "_top_gradient_bg", "q", "Q0", "set_content", "_content", "Landroid/widget/FrameLayout;", "r", "Landroid/widget/FrameLayout;", "m1", "()Landroid/widget/FrameLayout;", "set_title_bar", "(Landroid/widget/FrameLayout;)V", "_title_bar", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f44446s, "Lv/VImage;", "N0", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", Constants.KEY_T, "get_title_container", "set_title_container", "_title_container", "Lv/VText;", "u", "Lv/VText;", "n1", "()Lv/VText;", "set_title_name", "(Lv/VText;)V", "_title_name", ResourceDirection.f38808v, "l1", "set_title_age", "_title_age", "w", "P0", "set_compliment_count_container", "_compliment_count_container", "O0", "set_compliment_count_badge", "_compliment_count_badge", "Z0", "set_subtitle_area", "_subtitle_area", BaseSei.f13932Z, "b1", "set_subtitle_root", "_subtitle_root", "A", "a1", "set_subtitle_icon", "_subtitle_icon", "B", "Y0", "set_subtitle", "_subtitle", "Landroidx/recyclerview/widget/RecyclerView;", b2s.C_ZONE, "Landroidx/recyclerview/widget/RecyclerView;", "V0", "()Landroidx/recyclerview/widget/RecyclerView;", "set_photo_container", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_photo_container", "D", "M0", "set_bottom_layout", "_bottom_layout", "E", "c1", "set_tab_container", "_tab_container", "F", "i1", "set_tab_paid_container", "_tab_paid_container", "G", "h1", "set_tab_paid", "_tab_paid", "H", "j1", "set_tab_paid_icon", "_tab_paid_icon", "Lv/VText_NoTopPadding;", "I", "Lv/VText_NoTopPadding;", "k1", "()Lv/VText_NoTopPadding;", "set_tab_paid_text", "(Lv/VText_NoTopPadding;)V", "_tab_paid_text", "Landroidx/constraintlayout/widget/ConstraintLayout;", "J", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e1", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_tab_free_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_tab_free_container", "K", "d1", "set_tab_free", "_tab_free", "L", "f1", "set_tab_free_icon", "_tab_free_icon", "M", "get_tab_free_text_container", "set_tab_free_text_container", "_tab_free_text_container", "N", "g1", "set_tab_free_text", "_tab_free_text", BloodType.f38728O, "R0", "set_free_label", "_free_label", "P", "L0", "set_bottom_content", "_bottom_content", "Q", "W0", "set_quick_compliment_container", "_quick_compliment_container", "R", "T0", "set_input_send_container", "_input_send_container", j6f.LATITUDE_SOUTH, "get_input_container", "set_input_container", "_input_container", "Lv/VEditText;", j6f.GPS_DIRECTION_TRUE, "Lv/VEditText;", "S0", "()Lv/VEditText;", "set_input", "(Lv/VEditText;)V", "_input", "U", "X0", "set_send_btn", "_send_btn", j6f.GPS_MEASUREMENT_INTERRUPTED, "currentTab", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;", "W", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;", "photoAdapter", "Ll/iyb0;", "X", "Ll/iyb0;", "quickComplimentAdapter", "Y", "Ll/d30;", "onDismissCallback", "Z", "Lkotlin/jvm/functions/Function1;", "onComplimentSentSuccessCallback", "k0", "pendingWhisperText", "p0", "pendingFromQuickText", "Ll/cwf0;", "E0", "Ll/cwf0;", "statisticsPageHelper", "K0", "shouldShowDoubleTabs", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class DialogC8304a extends szd {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VImage _subtitle_icon;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public RecyclerView _photo_container;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout _bottom_layout;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public FrameLayout _tab_container;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @Nullable
    public cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public FrameLayout _tab_paid_container;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public LinearLayout _tab_paid;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VImage _tab_paid_icon;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VText_NoTopPadding _tab_paid_text;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ConstraintLayout _tab_free_container;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public LinearLayout _tab_free;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VImage _tab_free_icon;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ConstraintLayout _tab_free_text_container;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VText_NoTopPadding _tab_free_text;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VText_NoTopPadding _free_label;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public LinearLayout _bottom_content;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public RecyclerView _quick_compliment_container;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public LinearLayout _input_send_container;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public FrameLayout _input_container;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public VEditText _input;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public VImage _send_btn;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public int currentTab;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @Nullable
    public ComplimentPhotoAdapter photoAdapter;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @Nullable
    public iyb0 quickComplimentAdapter;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @Nullable
    public d30 onDismissCallback;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @Nullable
    public Function1<? super User, Unit> onComplimentSentSuccessCallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final User targetUser;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    @Nullable
    public String pendingWhisperText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final Integer initialPhotoIndex;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final String liveRoomInfo;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LinearLayout _layoutrootview;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public AutoVDraweeView _top_gradient_bg;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public boolean pendingFromQuickText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public LinearLayout _content;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public FrameLayout _title_bar;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public LinearLayout _title_container;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _title_name;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _title_age;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public FrameLayout _compliment_count_container;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VText _compliment_count_badge;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public LinearLayout _subtitle_area;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public LinearLayout _subtitle_root;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$b */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"com/p1/mobile/putong/core/ui/compliment/a$b", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            DialogC8304a.this.m44715W1();
            if (DialogC8304a.this.pendingWhisperText == null || DialogC8304a.this.pendingFromQuickText) {
                return;
            }
            DialogC8304a.this.pendingWhisperText = null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$c */
    @Metadata(m87231d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0006R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0016"}, m87232d2 = {"com/p1/mobile/putong/core/ui/compliment/a$c", "Ll/m6q0$b;", "Ll/m6q0;", "animation", "", "c", "(Ll/m6q0;)V", "Ll/m6q0$a;", "bounds", "e", "(Ll/m6q0;Ll/m6q0$a;)Ll/m6q0$a;", "Ll/y6q0;", "insets", "", "runningAnimations", Constants.INAPP_DATA_TAG, "(Ll/y6q0;Ljava/util/List;)Ll/y6q0;", "b", "", "F", "startBottom", "endBottom", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class c extends m6q0.AbstractC18406b {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public float startBottom;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public float endBottom;

        public c() {
            super(0);
        }

        @Override // p149l.m6q0.AbstractC18406b
        /* JADX INFO: renamed from: b */
        public void mo44748b(m6q0 animation) {
            animation.getClass();
            DialogC8304a.this.m44695M0().getTranslationY();
        }

        @Override // p149l.m6q0.AbstractC18406b
        /* JADX INFO: renamed from: c */
        public void mo44749c(m6q0 animation) {
            animation.getClass();
            this.startBottom = DialogC8304a.this.m44695M0().getTranslationY();
        }

        @Override // p149l.m6q0.AbstractC18406b
        /* JADX INFO: renamed from: d */
        public y6q0 mo44750d(y6q0 insets, List<m6q0> runningAnimations) {
            insets.getClass();
            runningAnimations.getClass();
            rtm rtmVarM213179f = insets.m213179f(y6q0.C21326l.m213232b());
            rtmVarM213179f.getClass();
            rtm rtmVarM213179f2 = insets.m213179f(y6q0.C21326l.m213236f());
            rtmVarM213179f2.getClass();
            rtm rtmVarM213179f3 = insets.m213179f(y6q0.C21326l.m213234d());
            rtmVarM213179f3.getClass();
            int iM44746z0 = DialogC8304a.this.m44746z0(rtmVarM213179f.f160975d, rtmVarM213179f2.f160975d);
            DialogC8304a.this.m44695M0().setTranslationY(-iM44746z0);
            int i = rtmVarM213179f3.f160975d;
            DialogC8304a dialogC8304a = DialogC8304a.this;
            if (iM44746z0 > 0) {
                xdl0.m208344M(dialogC8304a.m44722b1(), false);
                return insets;
            }
            xdl0.m208344M(dialogC8304a.m44722b1(), true);
            return insets;
        }

        @Override // p149l.m6q0.AbstractC18406b
        /* JADX INFO: renamed from: e */
        public m6q0.C18405a mo44751e(m6q0 animation, m6q0.C18405a bounds) {
            animation.getClass();
            bounds.getClass();
            this.endBottom = DialogC8304a.this.m44695M0().getTranslationY();
            return bounds;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$d */
    @Metadata(m87231d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"com/p1/mobile/putong/core/ui/compliment/a$d", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class d extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0588z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) > 0) {
                outRect.left = t100.m186890d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$e */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"com/p1/mobile/putong/core/ui/compliment/a$e", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class e extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0613s f28786a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f28787b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ DialogC8304a f28788c;

        public e(C0613s c0613s, LinearLayoutManager linearLayoutManager, DialogC8304a dialogC8304a) {
            this.f28786a = c0613s;
            this.f28787b = linearLayoutManager;
            this.f28788c = dialogC8304a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            View viewMo3811h;
            int position;
            ComplimentPhotoAdapter complimentPhotoAdapter;
            recyclerView.getClass();
            if (newState != 0 || (viewMo3811h = this.f28786a.mo3811h(this.f28787b)) == null || (position = this.f28787b.getPosition(viewMo3811h)) < 0 || (complimentPhotoAdapter = this.f28788c.photoAdapter) == null) {
                return;
            }
            complimentPhotoAdapter.m44617G(position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8304a(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        super(act, false, u7c0.f174985c);
        act.getClass();
        user.getClass();
        this.act = act;
        this.targetUser = user;
        this.from = str;
        this.initialPhotoIndex = num;
        this.liveRoomInfo = str2;
    }

    /* JADX INFO: renamed from: A1 */
    private final void m44623A1() {
        String string = StringsKt.m93433Z0(m44707S0().getText().toString()).toString();
        if (string.length() == 0) {
            osi0.m165782f(R$string.f18640jh);
        } else {
            m44629F1(this, "e_intl_compliment_send", false, true, 2, null);
            m44686F0(string, false);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m44624B0(DialogC8304a dialogC8304a) {
        Function1<? super User, Unit> function1 = dialogC8304a.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(dialogC8304a.targetUser);
        }
        dialogC8304a.dismiss();
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m44625D0(DialogC8304a dialogC8304a, roj0 roj0Var) {
        dialogC8304a.m44684D1();
        dialogC8304a.m44719Y1();
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m44627E0(DialogC8304a dialogC8304a, Throwable th) {
        dialogC8304a.m44684D1();
        dialogC8304a.m44719Y1();
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m44629F1(DialogC8304a dialogC8304a, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        dialogC8304a.m44685E1(str, z, z2);
    }

    /* JADX INFO: renamed from: H */
    public static void m44631H(final DialogC8304a dialogC8304a) {
        dialogC8304a.m44710U0().animate().translationY(dialogC8304a.m44710U0().getHeight()).setDuration(250L).withEndAction(new Runnable() { // from class: l.op5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8304a.m44624B0(this.f144951a);
            }
        }).start();
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m44632H1(DialogC8304a dialogC8304a, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        dialogC8304a.m44688G1(str, z, z2);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m44633I(DialogC8304a dialogC8304a, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        dialogC8304a.m44623A1();
        return true;
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m44634I1(DialogC8304a dialogC8304a, boolean z) {
        dialogC8304a.m44683C1();
        Function1<? super User, Unit> function1 = dialogC8304a.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(dialogC8304a.targetUser);
        }
        osi0.m165783g(App.f15369e.getString((z && xp5.m210472l()) ? R$string.f17636C9 : R$string.f18093Rg));
        dialogC8304a.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m44635J(DialogC8304a dialogC8304a, String str) {
        str.getClass();
        dialogC8304a.m44747z1(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static void m44636K(final DialogC8304a dialogC8304a, List list) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(dialogC8304a.m44714W0(), false);
            return;
        }
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComplimentText) it.next()).value);
        }
        dialogC8304a.quickComplimentAdapter = new iyb0(arrayList, new Function1() { // from class: l.wo5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8304a.m44647S1(this.f187381a, (String) obj);
            }
        });
        dialogC8304a.m44714W0().setAdapter(dialogC8304a.quickComplimentAdapter);
        xdl0.m208344M(dialogC8304a.m44714W0(), true);
    }

    /* JADX INFO: renamed from: K1 */
    public static final Unit m44637K1(DialogC8304a dialogC8304a, Envelope envelope) {
        if (dialogC8304a.m44738t1(envelope)) {
            co5.m107939k(OMSDialogPositon.p_navigation_view, xp5.m210472l() ? "0compliment" : "passive_whisper");
            osi0.m165783g(App.f15369e.getString(xp5.m210472l() ? R$string.f17636C9 : R$string.f18093Rg));
            dialogC8304a.m44683C1();
            Function1<? super User, Unit> function1 = dialogC8304a.onComplimentSentSuccessCallback;
            if (function1 != null) {
                function1.invoke(dialogC8304a.targetUser);
            }
            dialogC8304a.dismiss();
        } else {
            dialogC8304a.m44680A0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L1 */
    private final void m44639L1() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.clearFlags(131072);
        }
        PutongAct.setLightStatusBar(getWindow(), EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setSoftInputMode(16);
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m44641N(final DialogC8304a dialogC8304a, final boolean z, Envelope envelope) {
        String str;
        m44629F1(dialogC8304a, "e_intl_compliment_send", true, false, 4, null);
        m44629F1(dialogC8304a, "e_compliment_sent_succes", true, false, 4, null);
        if (z && xp5.m210472l()) {
            str = "0compliment";
        } else {
            str = z ? "passive_whisper" : "whisper";
        }
        co5.m107939k(OMSDialogPositon.p_navigation_view, str);
        dialogC8304a.m44743x1(envelope, new Function0() { // from class: l.kp5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC8304a.m44634I1(this.f124118a, z);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static void m44642O(DialogC8304a dialogC8304a, View view) {
        if (dialogC8304a.currentTab != 0) {
            dialogC8304a.m44713V1(0);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m44643P(DialogC8304a dialogC8304a, Envelope envelope) {
        m44629F1(dialogC8304a, "e_intl_compliment_send", true, false, 4, null);
        m44629F1(dialogC8304a, "e_compliment_sent_succes", true, false, 4, null);
        co5.m107939k(OMSDialogPositon.p_navigation_view, xp5.m210472l() ? "0compliment" : "passive_whisper");
        if (dialogC8304a.m44739u1(envelope)) {
            dialogC8304a.m44683C1();
            Function1<? super User, Unit> function1 = dialogC8304a.onComplimentSentSuccessCallback;
            if (function1 != null) {
                function1.invoke(dialogC8304a.targetUser);
            }
            dialogC8304a.act.startActivityWithCustomTransition(MatchAct.m47564g2(dialogC8304a.act, vwb.m200324f0(dialogC8304a.targetUser.f56011id), -1, null, null), new MatchAct.C8454b());
            return;
        }
        dialogC8304a.m44683C1();
        Function1<? super User, Unit> function2 = dialogC8304a.onComplimentSentSuccessCallback;
        if (function2 != null) {
            function2.invoke(dialogC8304a.targetUser);
        }
        osi0.m165783g(App.f15369e.getString(xp5.m210472l() ? R$string.f17636C9 : R$string.f18093Rg));
    }

    /* JADX INFO: renamed from: R */
    public static void m44645R(final DialogC8304a dialogC8304a, final Envelope envelope) {
        m44629F1(dialogC8304a, "e_intl_compliment_send", true, false, 4, null);
        m44629F1(dialogC8304a, "e_compliment_sent_succes", true, false, 4, null);
        dialogC8304a.m44743x1(envelope, new Function0() { // from class: l.ip5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC8304a.m44637K1(this.f114268a, envelope);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static y6q0 m44646S(DialogC8304a dialogC8304a, View view, y6q0 y6q0Var) {
        view.getClass();
        y6q0Var.getClass();
        rtm rtmVarM213179f = y6q0Var.m213179f(y6q0.C21326l.m213232b());
        rtmVarM213179f.getClass();
        rtm rtmVarM213179f2 = y6q0Var.m213179f(y6q0.C21326l.m213236f());
        rtmVarM213179f2.getClass();
        y6q0Var.m213179f(y6q0.C21326l.m213234d()).getClass();
        view.setTranslationY(-dialogC8304a.m44746z0(rtmVarM213179f.f160975d, rtmVarM213179f2.f160975d));
        return y6q0Var;
    }

    /* JADX INFO: renamed from: S1 */
    public static final Unit m44647S1(DialogC8304a dialogC8304a, String str) {
        str.getClass();
        dialogC8304a.m44747z1(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m44648T(DialogC8304a dialogC8304a, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        dialogC8304a.m44736p1();
        return true;
    }

    /* JADX INFO: renamed from: U */
    public static void m44649U(DialogC8304a dialogC8304a, roj0 roj0Var) {
        if (xma.m210086m3() > 0) {
            dialogC8304a.pendingWhisperText = null;
        }
        dialogC8304a.m44684D1();
        dialogC8304a.m44719Y1();
    }

    /* JADX INFO: renamed from: V */
    public static void m44650V(DialogC8304a dialogC8304a, roj0 roj0Var) {
        dialogC8304a.m44719Y1();
    }

    /* JADX INFO: renamed from: W */
    public static void m44651W(DialogC8304a dialogC8304a) {
        dialogC8304a.m44707S0().requestFocus();
        Object systemService = dialogC8304a.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(dialogC8304a.m44707S0(), 1);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m44652X(DialogC8304a dialogC8304a, DialogInterface dialogInterface) {
        i0e.m133796e(dialogC8304a.statisticsPageHelper);
        d30 d30Var = dialogC8304a.onDismissCallback;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m44653Y() {
    }

    /* JADX INFO: renamed from: Z */
    public static void m44654Z(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static Unit m44655a0(DialogC8304a dialogC8304a, int i) {
        ComplimentPhotoAdapter complimentPhotoAdapter = dialogC8304a.photoAdapter;
        if (complimentPhotoAdapter != null) {
            complimentPhotoAdapter.m44617G(i);
        }
        dialogC8304a.m44712V0().smoothScrollToPosition(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m44656b0(DialogC8304a dialogC8304a, View view) {
        if (dialogC8304a.currentTab != 1) {
            zvf0.m220396r("e_intl_whisper_tab_click", "p_intl_compliment_full_page");
            dialogC8304a.m44713V1(1);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m44657c0(DialogC8304a dialogC8304a, String str, PurchaseType purchaseType) {
        m44632H1(dialogC8304a, str, false, false, 2, null);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m44658d0(Throwable th) {
        co5.m107939k(OMSDialogPositon.p_navigation_view, "failed");
    }

    /* JADX INFO: renamed from: e0 */
    public static void m44659e0(Throwable th) {
        co5.m107939k(OMSDialogPositon.p_navigation_view, "failed");
    }

    /* JADX INFO: renamed from: f0 */
    public static void m44660f0(DialogC8304a dialogC8304a) {
        ComplimentPhotoAdapter complimentPhotoAdapter = dialogC8304a.photoAdapter;
        if (complimentPhotoAdapter != null) {
            complimentPhotoAdapter.m44617G(0);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m44661g0(Throwable th) {
        co5.m107939k(OMSDialogPositon.p_navigation_view, "failed");
    }

    /* JADX INFO: renamed from: h0 */
    public static void m44662h0(DialogC8304a dialogC8304a, View view) {
        dialogC8304a.m44736p1();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m44663i0(DialogC8304a dialogC8304a) {
        dialogC8304a.m44745y1();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m44664j0(DialogC8304a dialogC8304a, Throwable th) {
        xdl0.m208344M(dialogC8304a.m44714W0(), false);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m44665k0(DialogC8304a dialogC8304a, View view) {
        dialogC8304a.m44623A1();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m44666l0(DialogC8304a dialogC8304a, Throwable th) {
        dialogC8304a.m44684D1();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m44667m0(final DialogC8304a dialogC8304a, PurchaseType purchaseType, Act act, String str) {
        dialogC8304a.pendingWhisperText = null;
        dialogC8304a.act.duringCreated(CoreModule.f17545c.f19555C0.m210115x4().observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.bp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44625D0(this.f76603a, (roj0) obj);
            }
        }, new e30() { // from class: l.cp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44627E0(this.f81901a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m44668n0(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, DialogC8304a dialogC8304a, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            floatRef.element = motionEvent.getRawX();
            floatRef2.element = motionEvent.getRawY();
            return false;
        }
        if (action != 1) {
            return false;
        }
        float rawX = motionEvent.getRawX() - floatRef.element;
        float rawY = motionEvent.getRawY() - floatRef2.element;
        float fM186890d = t100.m186890d(10.0f);
        if ((rawX * rawX) + (rawY * rawY) >= fM186890d * fM186890d) {
            return false;
        }
        dialogC8304a.m44671q1();
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m44669o0(DialogC8304a dialogC8304a) {
        dialogC8304a.m44707S0().requestFocus();
        Object systemService = dialogC8304a.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(dialogC8304a.m44707S0(), 1);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m44670p0(DialogC8304a dialogC8304a, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || dialogC8304a.m44741w1(motionEvent.getRawX(), motionEvent.getRawY())) {
            return false;
        }
        dialogC8304a.m44671q1();
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    private final void m44671q1() {
        IBinder windowToken;
        Object systemService = this.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null && (windowToken = m44707S0().getWindowToken()) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
        m44707S0().clearFocus();
    }

    /* JADX INFO: renamed from: r1 */
    private final void m44673r1() {
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.pp5
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return DialogC8304a.m44648T(this.f150624a, dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qp5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogC8304a.m44652X(this.f155675a, dialogInterface);
            }
        });
        m44697N0().setOnClickListener(new View.OnClickListener() { // from class: l.rp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8304a.m44662h0(this.f160477a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    private final void m44675s1() {
        ViewGroup.LayoutParams layoutParams = m44703Q0().getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = xdl0.m208331F0();
        m44734n1().setText(this.targetUser.name);
        if (this.targetUser.age.intValue() > 0) {
            m44732l1().setText(String.valueOf(this.targetUser.age.intValue()));
            xdl0.m208344M(m44732l1(), true);
        } else {
            xdl0.m208344M(m44732l1(), false);
        }
        if (m44693K0()) {
            xdl0.m208344M(m44723c1(), true);
            m44709T1();
            m44731k1().setTypeface(eqh0.m117752c(3), 1);
            m44727g1().setTypeface(eqh0.m117752c(3), 1);
            m44705R0().setTypeface(eqh0.m117752c(3), 1);
        } else {
            xdl0.m208344M(m44723c1(), false);
        }
        m44704Q1();
        m44706R1();
        m44700O1();
        m44710U0().setOnTouchListener(new View.OnTouchListener() { // from class: l.ko5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogC8304a.m44670p0(this.f123960a, view, motionEvent);
            }
        });
        m44719Y1();
        this.act.duringCreated(CoreModule.f17545c.f19555C0.m210115x4().observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.vo5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44650V(this.f182336a, (roj0) obj);
            }
        }, new e30() { // from class: l.gp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44654Z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m44680A0() {
        m44681B1();
        bo5.m102906q(this.act, this.targetUser);
        m44683C1();
        m44710U0().post(new Runnable() { // from class: l.np5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8304a.m44631H(this.f139928a);
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public final void m44681B1() {
        Object systemService = this.act.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(30L, 150));
        } else {
            vibrator.vibrate(30L);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m44682C0(String text, boolean fromQuickText) {
        if (this.currentTab != 0) {
            m44632H1(this, text, fromQuickText, false, 4, null);
        } else {
            if (xma.m210086m3() > 0) {
                m44692J1(text);
                return;
            }
            this.pendingWhisperText = text;
            this.pendingFromQuickText = fromQuickText;
            o6n.INSTANCE.m162916a(this.act, "", new g30() { // from class: l.xo5
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    DialogC8304a.m44667m0(this.f193781a, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }, new d30() { // from class: l.yo5
                @Override // p149l.d30
                public final void call() {
                    DialogC8304a.m44663i0(this.f199260a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m44683C1() {
        CoreModule.f17545c.f19555C0.m210115x4();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m44684D1() {
        if (this.pendingFromQuickText) {
            return;
        }
        m44707S0().post(new Runnable() { // from class: l.jp5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8304a.m44669o0(this.f119053a);
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    public final void m44685E1(String event, boolean isUbc, boolean mcOnly) {
        String strM44689H0 = m44689H0();
        String strM44690I0 = m44690I0();
        if (isUbc) {
            zvf0.m220371D(event, "p_intl_compliment_full_page", vwb.m200311Y("compliment_type", strM44689H0), vwb.m200311Y("compliment_user_status", strM44690I0));
        } else if (mcOnly) {
            zvf0.m220399u(event, "p_intl_compliment_full_page", vwb.m200311Y("compliment_type", strM44689H0), vwb.m200311Y("compliment_user_status", strM44690I0));
        } else {
            zvf0.m220399u(event, "p_intl_compliment_full_page", vwb.m200311Y("compliment_type", strM44689H0), vwb.m200311Y("compliment_user_status", strM44690I0));
            zvf0.m220401w(event, "p_intl_compliment_full_page", vwb.m200311Y("compliment_type", strM44689H0), vwb.m200311Y("compliment_user_status", strM44690I0));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m44686F0(String text, boolean fromQuickText) {
        if (qib0.f154711Z.m119125K(text) || qib0.f154711Z.m119127M(text)) {
            this.act.dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20568z0();
        } else {
            m44682C0(text, fromQuickText);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m44687G0(String text) {
        if (m44740v1()) {
            return;
        }
        String str = this.targetUser.f56011id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM44691J0 = m44691J0();
        if (vwb.m200296J(listM44691J0)) {
            return;
        }
        listM44691J0.getClass();
        this.act.duringCreated(CoreModule.f17545c.f19693w0.m162777t3(str, o59.m162768k3(text, listM44691J0, false, this.liveRoomInfo).toJson()).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.tp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44643P(this.f171442a, (Envelope) obj);
            }
        }, new e30() { // from class: l.up5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44661g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G1 */
    public final void m44688G1(String text, boolean fromQuickText, final boolean isPassiveWhisper) {
        if (m44740v1()) {
            if (isPassiveWhisper) {
                return;
            }
            m44711U1(text, fromQuickText);
            return;
        }
        String str = this.targetUser.f56011id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM44691J0 = m44691J0();
        if (vwb.m200296J(listM44691J0)) {
            return;
        }
        listM44691J0.getClass();
        this.act.duringCreated(CoreModule.f17545c.f19693w0.m162777t3(str, o59.m162768k3(text, listM44691J0, false, this.liveRoomInfo).toJson()).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.dp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44641N(this.f87236a, isPassiveWhisper, (Envelope) obj);
            }
        }, new e30() { // from class: l.ep5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44659e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final String m44689H0() {
        return this.currentTab == 0 ? "compliment" : "whisper";
    }

    /* JADX INFO: renamed from: I0 */
    public final String m44690I0() {
        if (xma.m210081j4()) {
            return !xma.m210071e4() ? "premium" : "other";
        }
        return SummarizedPrivilegesId.ultraPremium;
    }

    /* JADX INFO: renamed from: J0 */
    public final List<Media> m44691J0() {
        ComplimentPhotoAdapter complimentPhotoAdapter = this.photoAdapter;
        if (complimentPhotoAdapter == null) {
            return null;
        }
        int iM44613C = complimentPhotoAdapter.m44613C();
        List<Media> list = this.targetUser.pictures;
        if (list == null || iM44613C < 0 || iM44613C >= list.size()) {
            return null;
        }
        Media media = this.targetUser.media(iM44613C);
        if (media instanceof Video) {
            media = ((Video) media).cover();
        }
        return CollectionsKt.listOf(media);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m44692J1(String text) {
        String str = this.targetUser.f56011id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM44691J0 = m44691J0();
        if (vwb.m200296J(listM44691J0)) {
            return;
        }
        listM44691J0.getClass();
        this.act.duringCreated(CoreModule.f17545c.f19693w0.m162777t3(str, o59.m162768k3(text, listM44691J0, true, this.liveRoomInfo).toJson()).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.fp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44645R(this.f98664a, (Envelope) obj);
            }
        }, new e30() { // from class: l.hp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44658d0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m44693K0() {
        q89 q89Var = CoreModule.f17545c.f19672p0;
        return q89Var.f153141S < q89Var.f153143U;
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final LinearLayout m44694L0() {
        LinearLayout linearLayout = this._bottom_content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_bottom_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final LinearLayout m44695M0() {
        LinearLayout linearLayout = this._bottom_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_bottom_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M1 */
    public final DialogC8304a m44696M1(@NotNull Function1<? super User, Unit> callback) {
        callback.getClass();
        this.onComplimentSentSuccessCallback = callback;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final VImage m44697N0() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N1 */
    public final DialogC8304a m44698N1(@Nullable d30 callback) {
        this.onDismissCallback = callback;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final VText m44699O0() {
        VText vText = this._compliment_count_badge;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_compliment_count_badge");
        return null;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m44700O1() {
        m44707S0().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(140)});
        m44707S0().addTextChangedListener(new b());
        m44707S0().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.so5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return DialogC8304a.m44633I(this.f165547a, textView, i, keyEvent);
            }
        });
        m44716X0().setOnClickListener(new View.OnClickListener() { // from class: l.to5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8304a.m44665k0(this.f171318a, view);
            }
        });
        m44707S0().post(new Runnable() { // from class: l.uo5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8304a.m44651W(this.f177493a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final FrameLayout m44701P0() {
        FrameLayout frameLayout = this._compliment_count_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_compliment_count_container");
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public final void m44702P1() {
        gbl0.m125156E0(m44695M0(), new c());
        gbl0.m125231y0(m44695M0(), new bd50() { // from class: l.sp5
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return DialogC8304a.m44646S(this.f165749a, view, y6q0Var);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public final LinearLayout m44703Q0() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m44704Q1() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act, 0, false);
        m44712V0().setLayoutManager(linearLayoutManager);
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(191.0f)) / 2;
        m44712V0().setPadding(iM208412y0, 0, iM208412y0, 0);
        m44712V0().addItemDecoration(new d());
        Act act = this.act;
        User user = this.targetUser;
        Function1 function1 = new Function1() { // from class: l.po5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8304a.m44655a0(this.f150451a, ((Integer) obj).intValue());
            }
        };
        Integer num = this.initialPhotoIndex;
        this.photoAdapter = new ComplimentPhotoAdapter(act, user, function1, num != null ? num.intValue() : 0);
        m44712V0().setAdapter(this.photoAdapter);
        m44712V0().setItemViewCacheSize(4);
        C0613s c0613s = new C0613s();
        c0613s.mo3857b(m44712V0());
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        m44712V0().setOnTouchListener(new View.OnTouchListener() { // from class: l.qo5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogC8304a.m44668n0(floatRef, floatRef2, this, view, motionEvent);
            }
        });
        m44712V0().addOnScrollListener(new e(c0613s, linearLayoutManager, this));
        m44712V0().post(new Runnable() { // from class: l.ro5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8304a.m44660f0(this.f160354a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public final VText_NoTopPadding m44705R0() {
        VText_NoTopPadding vText_NoTopPadding = this._free_label;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m87502r("_free_label");
        return null;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m44706R1() {
        m44714W0().setLayoutManager(new LinearLayoutManager(this.act, 0, false));
        List<ComplimentText> listM162771n3 = CoreModule.f17545c.f19693w0.m162771n3();
        if (vwb.m200296J(listM162771n3)) {
            xdl0.m208344M(m44714W0(), false);
            this.act.duringCreated(CoreModule.f17545c.f19693w0.m162770m3()).subscribe(mkd0.m154956H(new e30() { // from class: l.no5
                @Override // p149l.e30
                public final void call(Object obj) {
                    DialogC8304a.m44636K(this.f139818a, (List) obj);
                }
            }, new e30() { // from class: l.oo5
                @Override // p149l.e30
                public final void call(Object obj) {
                    DialogC8304a.m44664j0(this.f144846a, (Throwable) obj);
                }
            }));
            return;
        }
        listM162771n3.getClass();
        List<ComplimentText> list = listM162771n3;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComplimentText) it.next()).value);
        }
        this.quickComplimentAdapter = new iyb0(arrayList, new Function1() { // from class: l.mo5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8304a.m44635J(this.f134844a, (String) obj);
            }
        });
        m44714W0().setAdapter(this.quickComplimentAdapter);
        xdl0.m208344M(m44714W0(), true);
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final VEditText m44707S0() {
        VEditText vEditText = this._input;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m87502r("_input");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T0 */
    public final LinearLayout m44708T0() {
        LinearLayout linearLayout = this._input_send_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_input_send_container");
        return null;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m44709T1() {
        zvf0.m220402x("e_intl_whisper_tab_click", "p_intl_compliment_full_page");
        m44728h1().setOnClickListener(new View.OnClickListener() { // from class: l.vp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8304a.m44642O(this.f182453a, view);
            }
        });
        m44724d1().setOnClickListener(new View.OnClickListener() { // from class: l.lo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8304a.m44656b0(this.f129069a, view);
            }
        });
        m44717X1();
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public final LinearLayout m44710U0() {
        LinearLayout linearLayout = this._layoutrootview;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_layoutrootview");
        return null;
    }

    /* JADX INFO: renamed from: U1 */
    public final void m44711U1(final String pendingText, boolean fromQuickText) {
        String str = fromQuickText ? "p_intl_compliment_full_page,e_intl_compliment_quick_text_click,click" : "p_intl_compliment_full_page,e_intl_compliment_send,click";
        C8764c c8764c = C8764c.INSTANCE;
        C8764c.m53418O1(this.act, str, Privilege.vip_unlimited_likes, null, new d30() { // from class: l.mp5
            @Override // p149l.d30
            public final void call() {
                DialogC8304a.m44653Y();
            }
        }, false, null, null, new e30() { // from class: l.lp5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44657c0(this.f129164a, pendingText, (PurchaseType) obj);
            }
        }, 232, null);
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final RecyclerView m44712V0() {
        RecyclerView recyclerView = this._photo_container;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_photo_container");
        return null;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m44713V1(int tab) {
        this.currentTab = tab;
        m44717X1();
        m44719Y1();
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final RecyclerView m44714W0() {
        RecyclerView recyclerView = this._quick_compliment_container;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m87502r("_quick_compliment_container");
        return null;
    }

    /* JADX INFO: renamed from: W1 */
    public final void m44715W1() {
        int i;
        Editable text = m44707S0().getText();
        boolean z = text == null || text.length() == 0;
        int i2 = this.currentTab;
        if (i2 == 0 && z) {
            i = x2c0.f190420o9;
        } else if (i2 == 0 && !z) {
            i = x2c0.f190452p9;
        } else if (i2 == 1 && z) {
            i = x2c0.f190548s9;
        } else {
            i = (i2 != 1 || z) ? x2c0.f190420o9 : x2c0.f190580t9;
        }
        m44716X0().setImageResource(i);
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final VImage m44716X0() {
        VImage vImage = this._send_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_send_btn");
        return null;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m44717X1() {
        int color = App.f15369e.getColor(w0c0.f183788N);
        if (this.currentTab == 0) {
            m44729i1().setElevation(t100.m186890d(4.0f));
            m44731k1().setAlpha(1.0f);
            m44730j1().setAlpha(1.0f);
            m44725e1().setElevation(t100.m186890d(2.0f));
            m44727g1().setAlpha(0.4f);
            m44726f1().setAlpha(0.4f);
            m44727g1().setTextColor(color);
            m44726f1().setColorFilter(color);
            m44724d1().setBackgroundResource(x2c0.f190644v9);
            m44724d1().setPadding(t100.m186890d(33.0f), m44724d1().getPaddingTop(), 0, m44724d1().getPaddingBottom());
            return;
        }
        m44729i1().setElevation(t100.m186890d(2.0f));
        m44731k1().setAlpha(0.4f);
        m44730j1().setAlpha(0.4f);
        m44725e1().setElevation(t100.m186890d(4.0f));
        m44727g1().setAlpha(1.0f);
        m44726f1().setAlpha(1.0f);
        m44727g1().setTextColor(color);
        m44726f1().setColorFilter(color);
        m44724d1().setBackgroundResource(x2c0.f190612u9);
        m44724d1().setPadding(t100.m186890d(20.0f), m44724d1().getPaddingTop(), t100.m186890d(20.0f), m44724d1().getPaddingBottom());
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final VText m44718Y0() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m44719Y1() {
        if (this.currentTab == 0) {
            m44718Y0().setText(App.f15369e.getString(R$string.f18178Ub));
            m44699O0().setText(String.valueOf(xma.m210086m3()));
            xdl0.m208344M(m44701P0(), true);
            m44742x0();
            ComplimentPhotoAdapter complimentPhotoAdapter = this.photoAdapter;
            if (complimentPhotoAdapter != null) {
                complimentPhotoAdapter.m44618H(ComplimentPhotoAdapter.TabMode.COMPLIMENT);
            }
        } else {
            m44718Y0().setText(App.f15369e.getString(R$string.f18123Sg));
            xdl0.m208344M(m44701P0(), false);
            m44744y0();
            ComplimentPhotoAdapter complimentPhotoAdapter2 = this.photoAdapter;
            if (complimentPhotoAdapter2 != null) {
                complimentPhotoAdapter2.m44618H(ComplimentPhotoAdapter.TabMode.WHISPER);
            }
        }
        m44715W1();
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final LinearLayout m44720Z0() {
        LinearLayout linearLayout = this._subtitle_area;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_subtitle_area");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final VImage m44721a1() {
        VImage vImage = this._subtitle_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_subtitle_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final LinearLayout m44722b1() {
        LinearLayout linearLayout = this._subtitle_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_subtitle_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final FrameLayout m44723c1() {
        FrameLayout frameLayout = this._tab_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_tab_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final LinearLayout m44724d1() {
        LinearLayout linearLayout = this._tab_free;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_tab_free");
        return null;
    }

    @Override // p149l.szd, android.app.Dialog, android.content.DialogInterface, p149l.vzd.InterfaceC20772b
    public void dismiss() {
        m44671q1();
        gbl0.m125156E0(m44695M0(), null);
        gbl0.m125231y0(m44695M0(), null);
        xdl0.m208344M(m44722b1(), true);
        m44695M0().setTranslationY(0.0f);
        i0e.m133796e(this.statisticsPageHelper);
        d30 d30Var = this.onDismissCallback;
        if (d30Var != null) {
            d30Var.call();
        }
        super.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public final ConstraintLayout m44725e1() {
        ConstraintLayout constraintLayout = this._tab_free_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_tab_free_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f1 */
    public final VImage m44726f1() {
        VImage vImage = this._tab_free_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_tab_free_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g1 */
    public final VText_NoTopPadding m44727g1() {
        VText_NoTopPadding vText_NoTopPadding = this._tab_free_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m87502r("_tab_free_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final LinearLayout m44728h1() {
        LinearLayout linearLayout = this._tab_paid;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_tab_paid");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public final FrameLayout m44729i1() {
        FrameLayout frameLayout = this._tab_paid_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_tab_paid_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public final VImage m44730j1() {
        VImage vImage = this._tab_paid_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_tab_paid_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public final VText_NoTopPadding m44731k1() {
        VText_NoTopPadding vText_NoTopPadding = this._tab_paid_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m87502r("_tab_paid_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public final VText m44732l1() {
        VText vText = this._title_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m1 */
    public final FrameLayout m44733m1() {
        FrameLayout frameLayout = this._title_bar;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_title_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public final VText m44734n1() {
        VText vText = this._title_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o1 */
    public final AutoVDraweeView m44735o1() {
        AutoVDraweeView autoVDraweeView = this._top_gradient_bg;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m87502r("_top_gradient_bg");
        return null;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        setContentView(m44737q0(layoutInflater, null));
        m44639L1();
        m44675s1();
        m44673r1();
        m186756v(m44710U0());
    }

    /* JADX INFO: renamed from: p1 */
    public final void m44736p1() {
        String str = this.pendingWhisperText;
        this.pendingWhisperText = null;
        if (str != null && this.currentTab == 0) {
            m44687G0(str);
        }
        dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final View m44737q0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM204896b = wp5.m204896b(this, inflater, parent);
        viewM204896b.getClass();
        return viewM204896b;
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_compliment_full_page", DialogC8304a.class.getName());
        this.statisticsPageHelper = cwf0VarM133794c;
        if (cwf0VarM133794c != null) {
            cwf0VarM133794c.m109040p(vwb.m200311Y("compliment_tab", m44693K0() ? "all" : "compliment"));
        }
        i0e.m133797f(this.statisticsPageHelper);
        m44702P1();
    }

    /* JADX INFO: renamed from: t1 */
    public final boolean m44738t1(Envelope envelope) {
        CoreData coreData;
        List<Message> list;
        MessageAdditionalData messageAdditionalData;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment;
        if (envelope == null || (coreData = (CoreData) envelope.getModuleData(CoreData.class)) == null || (list = coreData.messages) == null) {
            return false;
        }
        List<Message> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Message message : list2) {
            if (Intrinsics.m87488d((message == null || (messageAdditionalData = message.additionalData) == null || (messageAdditionalDataCompliment = messageAdditionalData.compliment) == null) ? null : messageAdditionalDataCompliment.type, "free")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u1 */
    public final boolean m44739u1(Envelope envelope) {
        String str;
        CoreData coreData;
        List<Relationship> list;
        if (envelope == null || (str = this.targetUser.f56011id) == null || str.length() == 0 || (coreData = (CoreData) envelope.getModuleData(CoreData.class)) == null || (list = coreData.relationships) == null) {
            return false;
        }
        List<Relationship> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Relationship relationship : list2) {
            if (relationship != null && Intrinsics.m87488d(this.targetUser.f56011id, relationship.f38806id) && TEnum.equals(relationship.state, "matched")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m44740v1() {
        CounterLikeLimit counterLikeLimit;
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (counterM31484o3 == null || (counterLikeLimit = counterM31484o3.likeLimit) == null) {
            return false;
        }
        return counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m153867c(CoreModule.f17545c.f19639e0.m169527p9(), PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }

    /* JADX INFO: renamed from: w1 */
    public final boolean m44741w1(float x, float y) {
        Rect rect = new Rect();
        if (m44708T0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        if (m44714W0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        if (m44723c1().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        return m44697N0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m44742x0() {
        int color = Color.parseColor("#131110");
        int color2 = Color.parseColor("#C0A773");
        m44710U0().setBackgroundColor(color);
        m44735o1().setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjFBMzg1NjVCRjMzMzRENDU5RTJDREJBNUQyRTM2MjM2IiwidyI6NzUwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNTM4OTM5OTcwNjg0Njg3LCJwdCI6MjAyNjAyMDUxNH0.png");
        xdl0.m208344M(m44735o1(), true);
        m44703Q0().setBackgroundColor(0);
        m44733m1().setBackgroundColor(0);
        m44720Z0().setBackgroundColor(0);
        m44694L0().setBackgroundColor(color);
        m44734n1().setTextColor(color2);
        m44732l1().setTextColor(color2);
        m44718Y0().setTextColor(Color.parseColor("#66FFE7A8"));
        m44721a1().setImageResource(x2c0.f190484q9);
        m44721a1().clearColorFilter();
        m44697N0().setImageResource(x2c0.f190388n9);
        m44697N0().clearColorFilter();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m44743x1(Envelope envelope, Function0<Unit> onNotMatched) {
        if (!m44739u1(envelope)) {
            onNotMatched.invoke();
            return;
        }
        m44683C1();
        dismiss();
        Function1<? super User, Unit> function1 = this.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(this.targetUser);
        }
        this.act.startActivityWithCustomTransition(MatchAct.m47564g2(this.act, vwb.m200324f0(this.targetUser.f56011id), -1, null, null), new MatchAct.C8454b());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m44744y0() {
        int color = Color.parseColor("#F9F9F9");
        int color2 = App.f15369e.getColor(w0c0.f183788N);
        int color3 = App.f15369e.getColor(w0c0.f183863l);
        int color4 = Color.parseColor("#131110");
        m44710U0().setBackgroundColor(color2);
        m44703Q0().setBackgroundColor(color);
        m44733m1().setBackgroundColor(color2);
        m44720Z0().setBackgroundColor(color);
        m44694L0().setBackgroundColor(color4);
        xdl0.m208344M(m44735o1(), false);
        m44734n1().setTextColor(color3);
        m44732l1().setTextColor(color3);
        m44718Y0().setTextColor(Color.parseColor(Constants.BLACK));
        m44721a1().setImageResource(x2c0.f190676w9);
        m44721a1().clearColorFilter();
        m44697N0().setImageResource(x2c0.f190516r9);
        m44697N0().clearColorFilter();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m44745y1() {
        if (this.pendingWhisperText == null) {
            return;
        }
        this.act.duringCreated(CoreModule.f17545c.f19555C0.m210115x4().observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.zo5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44649U(this.f204089a, (roj0) obj);
            }
        }, new e30() { // from class: l.ap5
            @Override // p149l.e30
            public final void call(Object obj) {
                DialogC8304a.m44666l0(this.f70979a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final int m44746z0(int imeBottom, int systemBarsBottom) {
        String str = Build.MANUFACTURER;
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (Intrinsics.m87488d(lowerCase, HardwareEarMonitorUtils.MANUFACTURER_VIVO) || Intrinsics.m87488d(lowerCase, HardwareEarMonitorUtils.MANUFACTURER_OPPO)) ? imeBottom : Math.max(0, imeBottom - systemBarsBottom);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m44747z1(String text) {
        m44629F1(this, "e_intl_compliment_quick_text_click", false, false, 6, null);
        m44686F0(text, true);
    }
}
