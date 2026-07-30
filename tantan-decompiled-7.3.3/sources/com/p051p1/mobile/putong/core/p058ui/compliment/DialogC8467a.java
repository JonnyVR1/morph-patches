package com.p051p1.mobile.putong.core.p058ui.compliment;

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
import androidx.recyclerview.widget.C0615s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ComplimentText;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.compliment.DialogC8467a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import p151v.AutoVDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p153l.a30;
import p153l.ar5;
import p153l.bnl0;
import p153l.br5;
import p153l.c4s;
import p153l.c9c0;
import p153l.dbc0;
import p153l.dgq0;
import p153l.fo0;
import p153l.fp5;
import p153l.g1e;
import p153l.gp5;
import p153l.i4g0;
import p153l.il50;
import p153l.joa;
import p153l.jyb;
import p153l.kkl0;
import p153l.l4g0;
import p153l.lyh0;
import p153l.m6c0;
import p153l.o8n;
import p153l.p7f;
import p153l.psd0;
import p153l.qa00;
import p153l.qj90;
import p153l.r1j0;
import p153l.rfq0;
import p153l.svm;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.x20;
import p153l.x69;
import p153l.y20;
import p153l.z99;
import p153l.zfc0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ²\u00022\u00020\u0001:\u0002³\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u000fJ!\u0010#\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u000fJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010)J+\u0010.\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b3\u0010$J\u0017\u00104\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u001fJ\u0019\u00107\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010\u000fJ\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010\u000fJ+\u0010=\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010/J'\u0010@\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u0001052\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bB\u00108J\u0017\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010\u000fJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020!2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bR\u0010\u000fJ\u0017\u0010S\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010\u001fJ\u000f\u0010T\u001a\u00020\rH\u0002¢\u0006\u0004\bT\u0010\u000fJ\u001f\u0010Z\u001a\u00020Y2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b^\u0010_J!\u0010a\u001a\u00020\u00002\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0`¢\u0006\u0004\ba\u0010bJ\u0019\u0010e\u001a\u00020\r2\b\u0010d\u001a\u0004\u0018\u00010cH\u0014¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\rH\u0016¢\u0006\u0004\bg\u0010\u000fJ\u000f\u0010h\u001a\u00020\rH\u0016¢\u0006\u0004\bh\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010nR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0085\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010xR*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010t\u001a\u0005\b\u0097\u0001\u0010v\"\u0005\b\u0098\u0001\u0010xR*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010¥\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u009c\u0001\u001a\u0006\b£\u0001\u0010\u009e\u0001\"\u0006\b¤\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010\u0088\u0001\u001a\u0006\b§\u0001\u0010\u008a\u0001\"\u0006\b¨\u0001\u0010\u008c\u0001R)\u0010¬\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bN\u0010\u009c\u0001\u001a\u0006\bª\u0001\u0010\u009e\u0001\"\u0006\b«\u0001\u0010 \u0001R%\u0010¯\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bO\u0010t\u001a\u0005\b\u00ad\u0001\u0010v\"\u0005\b®\u0001\u0010xR&\u0010³\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010t\u001a\u0005\b±\u0001\u0010v\"\u0005\b²\u0001\u0010xR*\u0010·\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010\u0090\u0001\u001a\u0006\bµ\u0001\u0010\u0092\u0001\"\u0006\b¶\u0001\u0010\u0094\u0001R*\u0010»\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0001\u0010\u009c\u0001\u001a\u0006\b¹\u0001\u0010\u009e\u0001\"\u0006\bº\u0001\u0010 \u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R&\u0010Ç\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÄ\u0001\u0010t\u001a\u0005\bÅ\u0001\u0010v\"\u0005\bÆ\u0001\u0010xR*\u0010Ë\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010\u0088\u0001\u001a\u0006\bÉ\u0001\u0010\u008a\u0001\"\u0006\bÊ\u0001\u0010\u008c\u0001R*\u0010Ï\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010\u0088\u0001\u001a\u0006\bÍ\u0001\u0010\u008a\u0001\"\u0006\bÎ\u0001\u0010\u008c\u0001R&\u0010Ó\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÐ\u0001\u0010t\u001a\u0005\bÑ\u0001\u0010v\"\u0005\bÒ\u0001\u0010xR*\u0010×\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010\u0090\u0001\u001a\u0006\bÕ\u0001\u0010\u0092\u0001\"\u0006\bÖ\u0001\u0010\u0094\u0001R*\u0010ß\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R*\u0010ç\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R&\u0010ë\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bè\u0001\u0010t\u001a\u0005\bé\u0001\u0010v\"\u0005\bê\u0001\u0010xR*\u0010ï\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bì\u0001\u0010\u0090\u0001\u001a\u0006\bí\u0001\u0010\u0092\u0001\"\u0006\bî\u0001\u0010\u0094\u0001R*\u0010ó\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bð\u0001\u0010â\u0001\u001a\u0006\bñ\u0001\u0010ä\u0001\"\u0006\bò\u0001\u0010æ\u0001R*\u0010÷\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010Ú\u0001\u001a\u0006\bõ\u0001\u0010Ü\u0001\"\u0006\bö\u0001\u0010Þ\u0001R*\u0010û\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bø\u0001\u0010Ú\u0001\u001a\u0006\bù\u0001\u0010Ü\u0001\"\u0006\bú\u0001\u0010Þ\u0001R&\u0010ÿ\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bü\u0001\u0010t\u001a\u0005\bý\u0001\u0010v\"\u0005\bþ\u0001\u0010xR*\u0010\u0083\u0002\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010¾\u0001\u001a\u0006\b\u0081\u0002\u0010À\u0001\"\u0006\b\u0082\u0002\u0010Â\u0001R&\u0010\u0087\u0002\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0002\u0010t\u001a\u0005\b\u0085\u0002\u0010v\"\u0005\b\u0086\u0002\u0010xR*\u0010\u008b\u0002\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0088\u0001\u001a\u0006\b\u0089\u0002\u0010\u008a\u0001\"\u0006\b\u008a\u0002\u0010\u008c\u0001R*\u0010\u0093\u0002\u001a\u00030\u008c\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u0097\u0002\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u0090\u0001\u001a\u0006\b\u0095\u0002\u0010\u0092\u0001\"\u0006\b\u0096\u0002\u0010\u0094\u0001R\u0019\u0010\u0099\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010Ù\u0001R\u001c\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u001b\u0010¤\u0002\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R'\u0010§\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u001a\u0010©\u0002\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0002\u0010nR\u0019\u0010«\u0002\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0002\u0010¥\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u0016\u0010±\u0002\u001a\u00020!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b°\u0002\u00101¨\u0006´\u0002"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/a;", "Ll/g1e;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "targetUser", "", "from", "", "initialPhotoIndex", "liveRoomInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "", "L1", "()V", "s1", "T1", "tab", "V1", "(I)V", "X1", "Y1", "x0", "y0", "Q1", "R1", "O1", "W1", "text", "z1", "(Ljava/lang/String;)V", "A1", "", "fromQuickText", "F0", "(Ljava/lang/String;Z)V", "C0", "y1", "D1", "I0", "()Ljava/lang/String;", "H0", NotificationCompat.CATEGORY_EVENT, "isUbc", "mcOnly", "E1", "(Ljava/lang/String;ZZ)V", "v1", "()Z", "pendingText", "U1", "J1", "Lcom/p1/mobile/putong/data/Envelope;", Envelope.TYPE, "t1", "(Lcom/p1/mobile/putong/data/Envelope;)Z", "A0", "C1", "B1", "isPassiveWhisper", "G1", "Lkotlin/Function0;", "onNotMatched", "x1", "(Lcom/p1/mobile/putong/data/Envelope;Lkotlin/jvm/functions/Function0;)V", "u1", "", "Lcom/p1/mobile/putong/data/Media;", "J0", "()Ljava/util/List;", "r1", "P1", "imeBottom", "systemBarsBottom", "z0", "(II)I", "", BaseSei.f14624X, BaseSei.f14625Y, "w1", "(FF)Z", "p1", "G0", "q1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "q0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/x20;", "callback", "N1", "(Ll/x20;)Lcom/p1/mobile/putong/core/ui/compliment/a;", "Lkotlin/Function1;", "M1", "(Lkotlin/jvm/functions/Function1;)Lcom/p1/mobile/putong/core/ui/compliment/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "show", SysnotifListener.ACTION_DISMISS, "j", "Lcom/p1/mobile/android/app/Act;", "k", "Lcom/p1/mobile/putong/data/User;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "m", "Ljava/lang/Integer;", "n", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "U0", "()Landroid/widget/LinearLayout;", "set_layoutrootview", "(Landroid/widget/LinearLayout;)V", "_layoutrootview", "Lv/AutoVDraweeView;", "p", "Lv/AutoVDraweeView;", "o1", "()Lv/AutoVDraweeView;", "set_top_gradient_bg", "(Lv/AutoVDraweeView;)V", "_top_gradient_bg", "q", "Q0", "set_content", "_content", "Landroid/widget/FrameLayout;", "r", "Landroid/widget/FrameLayout;", "m1", "()Landroid/widget/FrameLayout;", "set_title_bar", "(Landroid/widget/FrameLayout;)V", "_title_bar", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VImage;", "N0", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", Constants.KEY_T, "get_title_container", "set_title_container", "_title_container", "Lv/VText;", "u", "Lv/VText;", "n1", "()Lv/VText;", "set_title_name", "(Lv/VText;)V", "_title_name", ResourceDirection.f39656v, "l1", "set_title_age", "_title_age", "w", "P0", "set_compliment_count_container", "_compliment_count_container", "O0", "set_compliment_count_badge", "_compliment_count_badge", "Z0", "set_subtitle_area", "_subtitle_area", BaseSei.f14626Z, "b1", "set_subtitle_root", "_subtitle_root", "A", "a1", "set_subtitle_icon", "_subtitle_icon", "B", "Y0", "set_subtitle", "_subtitle", "Landroidx/recyclerview/widget/RecyclerView;", c4s.C_ZONE, "Landroidx/recyclerview/widget/RecyclerView;", "V0", "()Landroidx/recyclerview/widget/RecyclerView;", "set_photo_container", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_photo_container", "D", "M0", "set_bottom_layout", "_bottom_layout", "E", "c1", "set_tab_container", "_tab_container", "F", "i1", "set_tab_paid_container", "_tab_paid_container", "G", "h1", "set_tab_paid", "_tab_paid", "H", "j1", "set_tab_paid_icon", "_tab_paid_icon", "Lv/VText_NoTopPadding;", "I", "Lv/VText_NoTopPadding;", "k1", "()Lv/VText_NoTopPadding;", "set_tab_paid_text", "(Lv/VText_NoTopPadding;)V", "_tab_paid_text", "Landroidx/constraintlayout/widget/ConstraintLayout;", "J", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e1", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_tab_free_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_tab_free_container", "K", "d1", "set_tab_free", "_tab_free", "L", "f1", "set_tab_free_icon", "_tab_free_icon", "M", "get_tab_free_text_container", "set_tab_free_text_container", "_tab_free_text_container", "N", "g1", "set_tab_free_text", "_tab_free_text", BloodType.f39576O, "R0", "set_free_label", "_free_label", "P", "L0", "set_bottom_content", "_bottom_content", "Q", "W0", "set_quick_compliment_container", "_quick_compliment_container", "R", "T0", "set_input_send_container", "_input_send_container", p7f.LATITUDE_SOUTH, "get_input_container", "set_input_container", "_input_container", "Lv/VEditText;", p7f.GPS_DIRECTION_TRUE, "Lv/VEditText;", "S0", "()Lv/VEditText;", "set_input", "(Lv/VEditText;)V", "_input", "U", "X0", "set_send_btn", "_send_btn", p7f.GPS_MEASUREMENT_INTERRUPTED, "currentTab", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;", "W", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;", "photoAdapter", "Ll/m6c0;", "X", "Ll/m6c0;", "quickComplimentAdapter", "Y", "Ll/x20;", "onDismissCallback", "Z", "Lkotlin/jvm/functions/Function1;", "onComplimentSentSuccessCallback", "k0", "pendingWhisperText", "p0", "pendingFromQuickText", "Ll/l4g0;", "E0", "Ll/l4g0;", "statisticsPageHelper", "K0", "shouldShowDoubleTabs", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class DialogC8467a extends g1e {

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
    public l4g0 statisticsPageHelper;

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
    public m6c0 quickComplimentAdapter;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @Nullable
    public x20 onDismissCallback;

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
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"com/p1/mobile/putong/core/ui/compliment/a$b", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
            DialogC8467a.this.m45898W1();
            if (DialogC8467a.this.pendingWhisperText == null || DialogC8467a.this.pendingFromQuickText) {
                return;
            }
            DialogC8467a.this.pendingWhisperText = null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m88120d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0006R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0016"}, m88121d2 = {"com/p1/mobile/putong/core/ui/compliment/a$c", "Ll/rfq0$b;", "Ll/rfq0;", "animation", "", "c", "(Ll/rfq0;)V", "Ll/rfq0$a;", "bounds", "e", "(Ll/rfq0;Ll/rfq0$a;)Ll/rfq0$a;", "Ll/dgq0;", "insets", "", "runningAnimations", Constants.INAPP_DATA_TAG, "(Ll/dgq0;Ljava/util/List;)Ll/dgq0;", "b", "", "F", "startBottom", "endBottom", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class c extends rfq0.AbstractC19828b {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public float startBottom;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public float endBottom;

        public c() {
            super(0);
        }

        @Override // p153l.rfq0.AbstractC19828b
        /* JADX INFO: renamed from: b */
        public void mo45931b(rfq0 animation) {
            animation.getClass();
            DialogC8467a.this.m45878M0().getTranslationY();
        }

        @Override // p153l.rfq0.AbstractC19828b
        /* JADX INFO: renamed from: c */
        public void mo45932c(rfq0 animation) {
            animation.getClass();
            this.startBottom = DialogC8467a.this.m45878M0().getTranslationY();
        }

        @Override // p153l.rfq0.AbstractC19828b
        /* JADX INFO: renamed from: d */
        public dgq0 mo45933d(dgq0 insets, List<rfq0> runningAnimations) {
            insets.getClass();
            runningAnimations.getClass();
            svm svmVarM115680f = insets.m115680f(dgq0.C16531l.m115733b());
            svmVarM115680f.getClass();
            svm svmVarM115680f2 = insets.m115680f(dgq0.C16531l.m115737f());
            svmVarM115680f2.getClass();
            svm svmVarM115680f3 = insets.m115680f(dgq0.C16531l.m115735d());
            svmVarM115680f3.getClass();
            int iM45929z0 = DialogC8467a.this.m45929z0(svmVarM115680f.f170860d, svmVarM115680f2.f170860d);
            DialogC8467a.this.m45878M0().setTranslationY(-iM45929z0);
            int i = svmVarM115680f3.f170860d;
            DialogC8467a dialogC8467a = DialogC8467a.this;
            if (iM45929z0 > 0) {
                bnl0.m105524M(dialogC8467a.m45905b1(), false);
                return insets;
            }
            bnl0.m105524M(dialogC8467a.m45905b1(), true);
            return insets;
        }

        @Override // p153l.rfq0.AbstractC19828b
        /* JADX INFO: renamed from: e */
        public rfq0.C19827a mo45934e(rfq0 animation, rfq0.C19827a bounds) {
            animation.getClass();
            bounds.getClass();
            this.endBottom = DialogC8467a.this.m45878M0().getTranslationY();
            return bounds;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m88120d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"com/p1/mobile/putong/core/ui/compliment/a$d", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", OMSTemplateModeType.view, "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$a0;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class d extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C0561a0 state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) > 0) {
                outRect.left = qa00.m175859d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/ui/compliment/a$e", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class e extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0615s f29634a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f29635b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ DialogC8467a f29636c;

        public e(C0615s c0615s, LinearLayoutManager linearLayoutManager, DialogC8467a dialogC8467a) {
            this.f29634a = c0615s;
            this.f29635b = linearLayoutManager;
            this.f29636c = dialogC8467a;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            View viewMo3812h;
            int position;
            ComplimentPhotoAdapter complimentPhotoAdapter;
            recyclerView.getClass();
            if (newState != 0 || (viewMo3812h = this.f29634a.mo3812h(this.f29635b)) == null || (position = this.f29635b.getPosition(viewMo3812h)) < 0 || (complimentPhotoAdapter = this.f29636c.photoAdapter) == null) {
                return;
            }
            complimentPhotoAdapter.m45800G(position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC8467a(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        super(act, false, zfc0.f204117c);
        act.getClass();
        user.getClass();
        this.act = act;
        this.targetUser = user;
        this.from = str;
        this.initialPhotoIndex = num;
        this.liveRoomInfo = str2;
    }

    /* JADX INFO: renamed from: A1 */
    private final void m45806A1() {
        String string = StringsKt.m94324Z0(m45890S0().getText().toString()).toString();
        if (string.length() == 0) {
            r1j0.m179419f(R$string.f18427Eh);
        } else {
            m45812F1(this, "e_intl_compliment_send", false, true, 2, null);
            m45869F0(string, false);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m45807B0(DialogC8467a dialogC8467a) {
        Function1<? super User, Unit> function1 = dialogC8467a.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(dialogC8467a.targetUser);
        }
        dialogC8467a.dismiss();
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m45808D0(DialogC8467a dialogC8467a, uxj0 uxj0Var) {
        dialogC8467a.m45867D1();
        dialogC8467a.m45902Y1();
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m45810E0(DialogC8467a dialogC8467a, Throwable th) {
        dialogC8467a.m45867D1();
        dialogC8467a.m45902Y1();
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m45812F1(DialogC8467a dialogC8467a, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        dialogC8467a.m45868E1(str, z, z2);
    }

    /* JADX INFO: renamed from: H */
    public static void m45814H(final DialogC8467a dialogC8467a) {
        dialogC8467a.m45893U0().animate().translationY(dialogC8467a.m45893U0().getHeight()).setDuration(250L).withEndAction(new Runnable() { // from class: l.sq5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8467a.m45807B0(this.f170145a);
            }
        }).start();
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m45815H1(DialogC8467a dialogC8467a, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        dialogC8467a.m45871G1(str, z, z2);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m45816I(DialogC8467a dialogC8467a, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        dialogC8467a.m45806A1();
        return true;
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m45817I1(DialogC8467a dialogC8467a, boolean z) {
        dialogC8467a.m45866C1();
        Function1<? super User, Unit> function1 = dialogC8467a.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(dialogC8467a.targetUser);
        }
        r1j0.m179420g(App.f16088e.getString((z && br5.m106041l()) ? R$string.f18543I9 : R$string.f19432lh));
        dialogC8467a.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m45818J(DialogC8467a dialogC8467a, String str) {
        str.getClass();
        dialogC8467a.m45930z1(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static void m45819K(final DialogC8467a dialogC8467a, List list) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(dialogC8467a.m45897W0(), false);
            return;
        }
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComplimentText) it.next()).value);
        }
        dialogC8467a.quickComplimentAdapter = new m6c0(arrayList, new Function1() { // from class: l.aq5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8467a.m45830S1(this.f72787a, (String) obj);
            }
        });
        dialogC8467a.m45897W0().setAdapter(dialogC8467a.quickComplimentAdapter);
        bnl0.m105524M(dialogC8467a.m45897W0(), true);
    }

    /* JADX INFO: renamed from: K1 */
    public static final Unit m45820K1(DialogC8467a dialogC8467a, Envelope envelope) {
        if (dialogC8467a.m45921t1(envelope)) {
            gp5.m131237k(OMSDialogPositon.p_navigation_view, br5.m106041l() ? "0compliment" : "passive_whisper");
            r1j0.m179420g(App.f16088e.getString(br5.m106041l() ? R$string.f18543I9 : R$string.f19432lh));
            dialogC8467a.m45866C1();
            Function1<? super User, Unit> function1 = dialogC8467a.onComplimentSentSuccessCallback;
            if (function1 != null) {
                function1.invoke(dialogC8467a.targetUser);
            }
            dialogC8467a.dismiss();
        } else {
            dialogC8467a.m45863A0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L1 */
    private final void m45822L1() {
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
    public static void m45824N(final DialogC8467a dialogC8467a, final boolean z, Envelope envelope) {
        String str;
        m45812F1(dialogC8467a, "e_intl_compliment_send", true, false, 4, null);
        m45812F1(dialogC8467a, "e_compliment_sent_succes", true, false, 4, null);
        if (z && br5.m106041l()) {
            str = "0compliment";
        } else {
            str = z ? "passive_whisper" : "whisper";
        }
        gp5.m131237k(OMSDialogPositon.p_navigation_view, str);
        dialogC8467a.m45926x1(envelope, new Function0() { // from class: l.oq5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC8467a.m45817I1(this.f148546a, z);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static void m45825O(DialogC8467a dialogC8467a, View view) {
        if (dialogC8467a.currentTab != 0) {
            dialogC8467a.m45896V1(0);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m45826P(DialogC8467a dialogC8467a, Envelope envelope) {
        m45812F1(dialogC8467a, "e_intl_compliment_send", true, false, 4, null);
        m45812F1(dialogC8467a, "e_compliment_sent_succes", true, false, 4, null);
        gp5.m131237k(OMSDialogPositon.p_navigation_view, br5.m106041l() ? "0compliment" : "passive_whisper");
        if (dialogC8467a.m45922u1(envelope)) {
            dialogC8467a.m45866C1();
            Function1<? super User, Unit> function1 = dialogC8467a.onComplimentSentSuccessCallback;
            if (function1 != null) {
                function1.invoke(dialogC8467a.targetUser);
            }
            dialogC8467a.act.startActivityWithCustomTransition(MatchAct.m48747h2(dialogC8467a.act, jyb.m147507f0(dialogC8467a.targetUser.f56859id), -1, null, null), new MatchAct.C8617b());
            return;
        }
        dialogC8467a.m45866C1();
        Function1<? super User, Unit> function2 = dialogC8467a.onComplimentSentSuccessCallback;
        if (function2 != null) {
            function2.invoke(dialogC8467a.targetUser);
        }
        r1j0.m179420g(App.f16088e.getString(br5.m106041l() ? R$string.f18543I9 : R$string.f19432lh));
    }

    /* JADX INFO: renamed from: R */
    public static void m45828R(final DialogC8467a dialogC8467a, final Envelope envelope) {
        m45812F1(dialogC8467a, "e_intl_compliment_send", true, false, 4, null);
        m45812F1(dialogC8467a, "e_compliment_sent_succes", true, false, 4, null);
        dialogC8467a.m45926x1(envelope, new Function0() { // from class: l.mq5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogC8467a.m45820K1(this.f138004a, envelope);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static dgq0 m45829S(DialogC8467a dialogC8467a, View view, dgq0 dgq0Var) {
        view.getClass();
        dgq0Var.getClass();
        svm svmVarM115680f = dgq0Var.m115680f(dgq0.C16531l.m115733b());
        svmVarM115680f.getClass();
        svm svmVarM115680f2 = dgq0Var.m115680f(dgq0.C16531l.m115737f());
        svmVarM115680f2.getClass();
        dgq0Var.m115680f(dgq0.C16531l.m115735d()).getClass();
        view.setTranslationY(-dialogC8467a.m45929z0(svmVarM115680f.f170860d, svmVarM115680f2.f170860d));
        return dgq0Var;
    }

    /* JADX INFO: renamed from: S1 */
    public static final Unit m45830S1(DialogC8467a dialogC8467a, String str) {
        str.getClass();
        dialogC8467a.m45930z1(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m45831T(DialogC8467a dialogC8467a, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        dialogC8467a.m45919p1();
        return true;
    }

    /* JADX INFO: renamed from: U */
    public static void m45832U(DialogC8467a dialogC8467a, uxj0 uxj0Var) {
        if (joa.m146399m3() > 0) {
            dialogC8467a.pendingWhisperText = null;
        }
        dialogC8467a.m45867D1();
        dialogC8467a.m45902Y1();
    }

    /* JADX INFO: renamed from: V */
    public static void m45833V(DialogC8467a dialogC8467a, uxj0 uxj0Var) {
        dialogC8467a.m45902Y1();
    }

    /* JADX INFO: renamed from: W */
    public static void m45834W(DialogC8467a dialogC8467a) {
        dialogC8467a.m45890S0().requestFocus();
        Object systemService = dialogC8467a.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(dialogC8467a.m45890S0(), 1);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m45835X(DialogC8467a dialogC8467a, DialogInterface dialogInterface) {
        w1e.m204401e(dialogC8467a.statisticsPageHelper);
        x20 x20Var = dialogC8467a.onDismissCallback;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m45836Y() {
    }

    /* JADX INFO: renamed from: Z */
    public static void m45837Z(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static Unit m45838a0(DialogC8467a dialogC8467a, int i) {
        ComplimentPhotoAdapter complimentPhotoAdapter = dialogC8467a.photoAdapter;
        if (complimentPhotoAdapter != null) {
            complimentPhotoAdapter.m45800G(i);
        }
        dialogC8467a.m45895V0().smoothScrollToPosition(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m45839b0(DialogC8467a dialogC8467a, View view) {
        if (dialogC8467a.currentTab != 1) {
            i4g0.m138520r("e_intl_whisper_tab_click", "p_intl_compliment_full_page");
            dialogC8467a.m45896V1(1);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m45840c0(DialogC8467a dialogC8467a, String str, PurchaseType purchaseType) {
        m45815H1(dialogC8467a, str, false, false, 2, null);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m45841d0(Throwable th) {
        gp5.m131237k(OMSDialogPositon.p_navigation_view, "failed");
    }

    /* JADX INFO: renamed from: e0 */
    public static void m45842e0(Throwable th) {
        gp5.m131237k(OMSDialogPositon.p_navigation_view, "failed");
    }

    /* JADX INFO: renamed from: f0 */
    public static void m45843f0(DialogC8467a dialogC8467a) {
        ComplimentPhotoAdapter complimentPhotoAdapter = dialogC8467a.photoAdapter;
        if (complimentPhotoAdapter != null) {
            complimentPhotoAdapter.m45800G(0);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m45844g0(Throwable th) {
        gp5.m131237k(OMSDialogPositon.p_navigation_view, "failed");
    }

    /* JADX INFO: renamed from: h0 */
    public static void m45845h0(DialogC8467a dialogC8467a, View view) {
        dialogC8467a.m45919p1();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m45846i0(DialogC8467a dialogC8467a) {
        dialogC8467a.m45928y1();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m45847j0(DialogC8467a dialogC8467a, Throwable th) {
        bnl0.m105524M(dialogC8467a.m45897W0(), false);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m45848k0(DialogC8467a dialogC8467a, View view) {
        dialogC8467a.m45806A1();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m45849l0(DialogC8467a dialogC8467a, Throwable th) {
        dialogC8467a.m45867D1();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m45850m0(final DialogC8467a dialogC8467a, PurchaseType purchaseType, Act act, String str) {
        dialogC8467a.pendingWhisperText = null;
        dialogC8467a.act.duringCreated(CoreModule.f18264c.f20297C0.m146428y4().observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.fq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45808D0(this.f100246a, (uxj0) obj);
            }
        }, new y20() { // from class: l.gq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45810E0(this.f105650a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m45851n0(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, DialogC8467a dialogC8467a, View view, MotionEvent motionEvent) {
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
        float fM175859d = qa00.m175859d(10.0f);
        if ((rawX * rawX) + (rawY * rawY) >= fM175859d * fM175859d) {
            return false;
        }
        dialogC8467a.m45854q1();
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m45852o0(DialogC8467a dialogC8467a) {
        dialogC8467a.m45890S0().requestFocus();
        Object systemService = dialogC8467a.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(dialogC8467a.m45890S0(), 1);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m45853p0(DialogC8467a dialogC8467a, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || dialogC8467a.m45924w1(motionEvent.getRawX(), motionEvent.getRawY())) {
            return false;
        }
        dialogC8467a.m45854q1();
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    private final void m45854q1() {
        IBinder windowToken;
        Object systemService = this.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null && (windowToken = m45890S0().getWindowToken()) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
        m45890S0().clearFocus();
    }

    /* JADX INFO: renamed from: r1 */
    private final void m45856r1() {
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.tq5
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return DialogC8467a.m45831T(this.f175676a, dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uq5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogC8467a.m45835X(this.f180354a, dialogInterface);
            }
        });
        m45880N0().setOnClickListener(new View.OnClickListener() { // from class: l.vq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8467a.m45845h0(this.f185331a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    private final void m45858s1() {
        ViewGroup.LayoutParams layoutParams = m45886Q0().getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = bnl0.m105511F0();
        m45917n1().setText(this.targetUser.name);
        if (this.targetUser.age.intValue() > 0) {
            m45915l1().setText(String.valueOf(this.targetUser.age.intValue()));
            bnl0.m105524M(m45915l1(), true);
        } else {
            bnl0.m105524M(m45915l1(), false);
        }
        if (m45876K0()) {
            bnl0.m105524M(m45906c1(), true);
            m45892T1();
            m45914k1().setTypeface(lyh0.m156283c(3), 1);
            m45910g1().setTypeface(lyh0.m156283c(3), 1);
            m45888R0().setTypeface(lyh0.m156283c(3), 1);
        } else {
            bnl0.m105524M(m45906c1(), false);
        }
        m45887Q1();
        m45889R1();
        m45883O1();
        m45893U0().setOnTouchListener(new View.OnTouchListener() { // from class: l.op5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogC8467a.m45853p0(this.f148415a, view, motionEvent);
            }
        });
        m45902Y1();
        this.act.duringCreated(CoreModule.f18264c.f20297C0.m146428y4().observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.zp5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45833V(this.f205422a, (uxj0) obj);
            }
        }, new y20() { // from class: l.kq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45837Z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m45863A0() {
        m45864B1();
        fp5.m126535q(this.act, this.targetUser);
        m45866C1();
        m45893U0().post(new Runnable() { // from class: l.rq5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8467a.m45814H(this.f164431a);
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public final void m45864B1() {
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
    public final void m45865C0(String text, boolean fromQuickText) {
        if (this.currentTab != 0) {
            m45815H1(this, text, fromQuickText, false, 4, null);
        } else {
            if (joa.m146399m3() > 0) {
                m45875J1(text);
                return;
            }
            this.pendingWhisperText = text;
            this.pendingFromQuickText = fromQuickText;
            o8n.INSTANCE.m166608a(this.act, "", new a30() { // from class: l.bq5
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    DialogC8467a.m45850m0(this.f77855a, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }, new x20() { // from class: l.cq5
                @Override // p153l.x20
                public final void call() {
                    DialogC8467a.m45846i0(this.f83070a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m45866C1() {
        CoreModule.f18264c.f20297C0.m146428y4();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m45867D1() {
        if (this.pendingFromQuickText) {
            return;
        }
        m45890S0().post(new Runnable() { // from class: l.nq5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8467a.m45852o0(this.f143175a);
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    public final void m45868E1(String event, boolean isUbc, boolean mcOnly) {
        String strM45872H0 = m45872H0();
        String strM45873I0 = m45873I0();
        if (isUbc) {
            i4g0.m138495D(event, "p_intl_compliment_full_page", jyb.m147494Y("compliment_type", strM45872H0), jyb.m147494Y("compliment_user_status", strM45873I0));
        } else if (mcOnly) {
            i4g0.m138523u(event, "p_intl_compliment_full_page", jyb.m147494Y("compliment_type", strM45872H0), jyb.m147494Y("compliment_user_status", strM45873I0));
        } else {
            i4g0.m138523u(event, "p_intl_compliment_full_page", jyb.m147494Y("compliment_type", strM45872H0), jyb.m147494Y("compliment_user_status", strM45873I0));
            i4g0.m138525w(event, "p_intl_compliment_full_page", jyb.m147494Y("compliment_type", strM45872H0), jyb.m147494Y("compliment_user_status", strM45873I0));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m45869F0(String text, boolean fromQuickText) {
        if (uqb0.f180394Z.m95954K(text) || uqb0.f180394Z.m95956M(text)) {
            this.act.dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21567z0();
        } else {
            m45865C0(text, fromQuickText);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m45870G0(String text) {
        if (m45923v1()) {
            return;
        }
        String str = this.targetUser.f56859id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM45874J0 = m45874J0();
        if (jyb.m147479J(listM45874J0)) {
            return;
        }
        listM45874J0.getClass();
        this.act.duringCreated(CoreModule.f18264c.f20435w0.m209458t3(str, x69.m209449k3(text, listM45874J0, false, this.liveRoomInfo).toJson()).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.xq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45826P(this.f195781a, (Envelope) obj);
            }
        }, new y20() { // from class: l.yq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45844g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G1 */
    public final void m45871G1(String text, boolean fromQuickText, final boolean isPassiveWhisper) {
        if (m45923v1()) {
            if (isPassiveWhisper) {
                return;
            }
            m45894U1(text, fromQuickText);
            return;
        }
        String str = this.targetUser.f56859id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM45874J0 = m45874J0();
        if (jyb.m147479J(listM45874J0)) {
            return;
        }
        listM45874J0.getClass();
        this.act.duringCreated(CoreModule.f18264c.f20435w0.m209458t3(str, x69.m209449k3(text, listM45874J0, false, this.liveRoomInfo).toJson()).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.hq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45824N(this.f111086a, isPassiveWhisper, (Envelope) obj);
            }
        }, new y20() { // from class: l.iq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45842e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final String m45872H0() {
        return this.currentTab == 0 ? "compliment" : "whisper";
    }

    /* JADX INFO: renamed from: I0 */
    public final String m45873I0() {
        if (joa.m146396k4()) {
            return !joa.m146386f4() ? "premium" : "other";
        }
        return SummarizedPrivilegesId.ultraPremium;
    }

    /* JADX INFO: renamed from: J0 */
    public final List<Media> m45874J0() {
        ComplimentPhotoAdapter complimentPhotoAdapter = this.photoAdapter;
        if (complimentPhotoAdapter == null) {
            return null;
        }
        int iM45796C = complimentPhotoAdapter.m45796C();
        List<Media> list = this.targetUser.pictures;
        if (list == null || iM45796C < 0 || iM45796C >= list.size()) {
            return null;
        }
        Media media = this.targetUser.media(iM45796C);
        if (media instanceof Video) {
            media = ((Video) media).cover();
        }
        return CollectionsKt.listOf(media);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m45875J1(String text) {
        String str = this.targetUser.f56859id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM45874J0 = m45874J0();
        if (jyb.m147479J(listM45874J0)) {
            return;
        }
        listM45874J0.getClass();
        this.act.duringCreated(CoreModule.f18264c.f20435w0.m209458t3(str, x69.m209449k3(text, listM45874J0, true, this.liveRoomInfo).toJson()).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.jq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45828R(this.f122182a, (Envelope) obj);
            }
        }, new y20() { // from class: l.lq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45841d0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m45876K0() {
        z99 z99Var = CoreModule.f18264c.f20414p0;
        return z99Var.f203452S < z99Var.f203454U;
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final LinearLayout m45877L0() {
        LinearLayout linearLayout = this._bottom_content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_bottom_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final LinearLayout m45878M0() {
        LinearLayout linearLayout = this._bottom_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_bottom_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M1 */
    public final DialogC8467a m45879M1(@NotNull Function1<? super User, Unit> callback) {
        callback.getClass();
        this.onComplimentSentSuccessCallback = callback;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final VImage m45880N0() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N1 */
    public final DialogC8467a m45881N1(@Nullable x20 callback) {
        this.onDismissCallback = callback;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final VText m45882O0() {
        VText vText = this._compliment_count_badge;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_compliment_count_badge");
        return null;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m45883O1() {
        m45890S0().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(140)});
        m45890S0().addTextChangedListener(new b());
        m45890S0().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.wp5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return DialogC8467a.m45816I(this.f190257a, textView, i, keyEvent);
            }
        });
        m45899X0().setOnClickListener(new View.OnClickListener() { // from class: l.xp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8467a.m45848k0(this.f195684a, view);
            }
        });
        m45890S0().post(new Runnable() { // from class: l.yp5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8467a.m45834W(this.f201042a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final FrameLayout m45884P0() {
        FrameLayout frameLayout = this._compliment_count_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_compliment_count_container");
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public final void m45885P1() {
        kkl0.m150119E0(m45878M0(), new c());
        kkl0.m150194y0(m45878M0(), new il50() { // from class: l.wq5
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return DialogC8467a.m45829S(this.f190381a, view, dgq0Var);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public final LinearLayout m45886Q0() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m45887Q1() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act, 0, false);
        m45895V0().setLayoutManager(linearLayoutManager);
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(191.0f)) / 2;
        m45895V0().setPadding(iM105592y0, 0, iM105592y0, 0);
        m45895V0().addItemDecoration(new d());
        Act act = this.act;
        User user = this.targetUser;
        Function1 function1 = new Function1() { // from class: l.tp5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8467a.m45838a0(this.f175555a, ((Integer) obj).intValue());
            }
        };
        Integer num = this.initialPhotoIndex;
        this.photoAdapter = new ComplimentPhotoAdapter(act, user, function1, num != null ? num.intValue() : 0);
        m45895V0().setAdapter(this.photoAdapter);
        m45895V0().setItemViewCacheSize(4);
        C0615s c0615s = new C0615s();
        c0615s.mo3858b(m45895V0());
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        m45895V0().setOnTouchListener(new View.OnTouchListener() { // from class: l.up5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogC8467a.m45851n0(floatRef, floatRef2, this, view, motionEvent);
            }
        });
        m45895V0().addOnScrollListener(new e(c0615s, linearLayoutManager, this));
        m45895V0().post(new Runnable() { // from class: l.vp5
            @Override // java.lang.Runnable
            public final void run() {
                DialogC8467a.m45843f0(this.f185213a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public final VText_NoTopPadding m45888R0() {
        VText_NoTopPadding vText_NoTopPadding = this._free_label;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_free_label");
        return null;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m45889R1() {
        m45897W0().setLayoutManager(new LinearLayoutManager(this.act, 0, false));
        List<ComplimentText> listM209452n3 = CoreModule.f18264c.f20435w0.m209452n3();
        if (jyb.m147479J(listM209452n3)) {
            bnl0.m105524M(m45897W0(), false);
            this.act.duringCreated(CoreModule.f18264c.f20435w0.m209451m3()).subscribe(psd0.m173597H(new y20() { // from class: l.rp5
                @Override // p153l.y20
                public final void call(Object obj) {
                    DialogC8467a.m45819K(this.f164309a, (List) obj);
                }
            }, new y20() { // from class: l.sp5
                @Override // p153l.y20
                public final void call(Object obj) {
                    DialogC8467a.m45847j0(this.f170014a, (Throwable) obj);
                }
            }));
            return;
        }
        listM209452n3.getClass();
        List<ComplimentText> list = listM209452n3;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComplimentText) it.next()).value);
        }
        this.quickComplimentAdapter = new m6c0(arrayList, new Function1() { // from class: l.qp5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogC8467a.m45818J(this.f158821a, (String) obj);
            }
        });
        m45897W0().setAdapter(this.quickComplimentAdapter);
        bnl0.m105524M(m45897W0(), true);
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final VEditText m45890S0() {
        VEditText vEditText = this._input;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.m88391r("_input");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T0 */
    public final LinearLayout m45891T0() {
        LinearLayout linearLayout = this._input_send_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_input_send_container");
        return null;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m45892T1() {
        i4g0.m138526x("e_intl_whisper_tab_click", "p_intl_compliment_full_page");
        m45911h1().setOnClickListener(new View.OnClickListener() { // from class: l.zq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8467a.m45825O(this.f205569a, view);
            }
        });
        m45907d1().setOnClickListener(new View.OnClickListener() { // from class: l.pp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8467a.m45839b0(this.f153483a, view);
            }
        });
        m45900X1();
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public final LinearLayout m45893U0() {
        LinearLayout linearLayout = this._layoutrootview;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_layoutrootview");
        return null;
    }

    /* JADX INFO: renamed from: U1 */
    public final void m45894U1(final String pendingText, boolean fromQuickText) {
        String str = fromQuickText ? "p_intl_compliment_full_page,e_intl_compliment_quick_text_click,click" : "p_intl_compliment_full_page,e_intl_compliment_send,click";
        C8927c c8927c = C8927c.INSTANCE;
        C8927c.m54601O1(this.act, str, Privilege.vip_unlimited_likes, null, new x20() { // from class: l.qq5
            @Override // p153l.x20
            public final void call() {
                DialogC8467a.m45836Y();
            }
        }, false, null, null, new y20() { // from class: l.pq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45840c0(this.f153633a, pendingText, (PurchaseType) obj);
            }
        }, 232, null);
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final RecyclerView m45895V0() {
        RecyclerView recyclerView = this._photo_container;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_photo_container");
        return null;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m45896V1(int tab) {
        this.currentTab = tab;
        m45900X1();
        m45902Y1();
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final RecyclerView m45897W0() {
        RecyclerView recyclerView = this._quick_compliment_container;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_quick_compliment_container");
        return null;
    }

    /* JADX INFO: renamed from: W1 */
    public final void m45898W1() {
        int i;
        Editable text = m45890S0().getText();
        boolean z = text == null || text.length() == 0;
        int i2 = this.currentTab;
        if (i2 == 0 && z) {
            i = dbc0.f87310p9;
        } else if (i2 == 0 && !z) {
            i = dbc0.f87343q9;
        } else if (i2 == 1 && z) {
            i = dbc0.f87442t9;
        } else {
            i = (i2 != 1 || z) ? dbc0.f87310p9 : dbc0.f87475u9;
        }
        m45899X0().setImageResource(i);
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final VImage m45899X0() {
        VImage vImage = this._send_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_send_btn");
        return null;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m45900X1() {
        int color = App.f16088e.getColor(c9c0.f80357N);
        if (this.currentTab == 0) {
            m45912i1().setElevation(qa00.m175859d(4.0f));
            m45914k1().setAlpha(1.0f);
            m45913j1().setAlpha(1.0f);
            m45908e1().setElevation(qa00.m175859d(2.0f));
            m45910g1().setAlpha(0.4f);
            m45909f1().setAlpha(0.4f);
            m45910g1().setTextColor(color);
            m45909f1().setColorFilter(color);
            m45907d1().setBackgroundResource(dbc0.f87539w9);
            m45907d1().setPadding(qa00.m175859d(33.0f), m45907d1().getPaddingTop(), 0, m45907d1().getPaddingBottom());
            return;
        }
        m45912i1().setElevation(qa00.m175859d(2.0f));
        m45914k1().setAlpha(0.4f);
        m45913j1().setAlpha(0.4f);
        m45908e1().setElevation(qa00.m175859d(4.0f));
        m45910g1().setAlpha(1.0f);
        m45909f1().setAlpha(1.0f);
        m45910g1().setTextColor(color);
        m45909f1().setColorFilter(color);
        m45907d1().setBackgroundResource(dbc0.f87507v9);
        m45907d1().setPadding(qa00.m175859d(20.0f), m45907d1().getPaddingTop(), qa00.m175859d(20.0f), m45907d1().getPaddingBottom());
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final VText m45901Y0() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m45902Y1() {
        if (this.currentTab == 0) {
            m45901Y0().setText(App.f16088e.getString(R$string.f19365jc));
            m45882O0().setText(String.valueOf(joa.m146399m3()));
            bnl0.m105524M(m45884P0(), true);
            m45925x0();
            ComplimentPhotoAdapter complimentPhotoAdapter = this.photoAdapter;
            if (complimentPhotoAdapter != null) {
                complimentPhotoAdapter.m45801H(ComplimentPhotoAdapter.TabMode.COMPLIMENT);
            }
        } else {
            m45901Y0().setText(App.f16088e.getString(R$string.f19463mh));
            bnl0.m105524M(m45884P0(), false);
            m45927y0();
            ComplimentPhotoAdapter complimentPhotoAdapter2 = this.photoAdapter;
            if (complimentPhotoAdapter2 != null) {
                complimentPhotoAdapter2.m45801H(ComplimentPhotoAdapter.TabMode.WHISPER);
            }
        }
        m45898W1();
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final LinearLayout m45903Z0() {
        LinearLayout linearLayout = this._subtitle_area;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_subtitle_area");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final VImage m45904a1() {
        VImage vImage = this._subtitle_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_subtitle_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final LinearLayout m45905b1() {
        LinearLayout linearLayout = this._subtitle_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_subtitle_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final FrameLayout m45906c1() {
        FrameLayout frameLayout = this._tab_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_tab_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final LinearLayout m45907d1() {
        LinearLayout linearLayout = this._tab_free;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_tab_free");
        return null;
    }

    @Override // p153l.g1e, android.app.Dialog, android.content.DialogInterface, p153l.j1e.InterfaceC17849b
    public void dismiss() {
        m45854q1();
        kkl0.m150119E0(m45878M0(), null);
        kkl0.m150194y0(m45878M0(), null);
        bnl0.m105524M(m45905b1(), true);
        m45878M0().setTranslationY(0.0f);
        w1e.m204401e(this.statisticsPageHelper);
        x20 x20Var = this.onDismissCallback;
        if (x20Var != null) {
            x20Var.call();
        }
        super.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public final ConstraintLayout m45908e1() {
        ConstraintLayout constraintLayout = this._tab_free_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_tab_free_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f1 */
    public final VImage m45909f1() {
        VImage vImage = this._tab_free_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_tab_free_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g1 */
    public final VText_NoTopPadding m45910g1() {
        VText_NoTopPadding vText_NoTopPadding = this._tab_free_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_tab_free_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final LinearLayout m45911h1() {
        LinearLayout linearLayout = this._tab_paid;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_tab_paid");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public final FrameLayout m45912i1() {
        FrameLayout frameLayout = this._tab_paid_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_tab_paid_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public final VImage m45913j1() {
        VImage vImage = this._tab_paid_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_tab_paid_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public final VText_NoTopPadding m45914k1() {
        VText_NoTopPadding vText_NoTopPadding = this._tab_paid_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_tab_paid_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public final VText m45915l1() {
        VText vText = this._title_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m1 */
    public final FrameLayout m45916m1() {
        FrameLayout frameLayout = this._title_bar;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_title_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public final VText m45917n1() {
        VText vText = this._title_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o1 */
    public final AutoVDraweeView m45918o1() {
        AutoVDraweeView autoVDraweeView = this._top_gradient_bg;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_top_gradient_bg");
        return null;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        setContentView(m45920q0(layoutInflater, null));
        m45822L1();
        m45858s1();
        m45856r1();
        m128498v(m45893U0());
    }

    /* JADX INFO: renamed from: p1 */
    public final void m45919p1() {
        String str = this.pendingWhisperText;
        this.pendingWhisperText = null;
        if (str != null && this.currentTab == 0) {
            m45870G0(str);
        }
        dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final View m45920q0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM99645b = ar5.m99645b(this, inflater, parent);
        viewM99645b.getClass();
        return viewM99645b;
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_compliment_full_page", DialogC8467a.class.getName());
        this.statisticsPageHelper = l4g0VarM204399c;
        if (l4g0VarM204399c != null) {
            l4g0VarM204399c.m152781p(jyb.m147494Y("compliment_tab", m45876K0() ? "all" : "compliment"));
        }
        w1e.m204402f(this.statisticsPageHelper);
        m45885P1();
    }

    /* JADX INFO: renamed from: t1 */
    public final boolean m45921t1(Envelope envelope) {
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
            if (Intrinsics.m88377d((message == null || (messageAdditionalData = message.additionalData) == null || (messageAdditionalDataCompliment = messageAdditionalData.compliment) == null) ? null : messageAdditionalDataCompliment.type, "free")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u1 */
    public final boolean m45922u1(Envelope envelope) {
        String str;
        CoreData coreData;
        List<Relationship> list;
        if (envelope == null || (str = this.targetUser.f56859id) == null || str.length() == 0 || (coreData = (CoreData) envelope.getModuleData(CoreData.class)) == null || (list = coreData.relationships) == null) {
            return false;
        }
        List<Relationship> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Relationship relationship : list2) {
            if (relationship != null && Intrinsics.m88377d(this.targetUser.f56859id, relationship.f39654id) && TEnum.equals(relationship.state, "matched")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m45923v1() {
        CounterLikeLimit counterLikeLimit;
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (counterM32487o3 == null || (counterLikeLimit = counterM32487o3.likeLimit) == null) {
            return false;
        }
        return counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !qj90.m176831c(CoreModule.f18264c.f20381e0.m116600p9(), PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }

    /* JADX INFO: renamed from: w1 */
    public final boolean m45924w1(float x, float y) {
        Rect rect = new Rect();
        if (m45891T0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        if (m45897W0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        if (m45906c1().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        return m45880N0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m45925x0() {
        int color = Color.parseColor("#131110");
        int color2 = Color.parseColor("#C0A773");
        m45893U0().setBackgroundColor(color);
        m45918o1().setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjFBMzg1NjVCRjMzMzRENDU5RTJDREJBNUQyRTM2MjM2IiwidyI6NzUwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNTM4OTM5OTcwNjg0Njg3LCJwdCI6MjAyNjAyMDUxNH0.png");
        bnl0.m105524M(m45918o1(), true);
        m45886Q0().setBackgroundColor(0);
        m45916m1().setBackgroundColor(0);
        m45903Z0().setBackgroundColor(0);
        m45877L0().setBackgroundColor(color);
        m45917n1().setTextColor(color2);
        m45915l1().setTextColor(color2);
        m45901Y0().setTextColor(Color.parseColor("#66FFE7A8"));
        m45904a1().setImageResource(dbc0.f87376r9);
        m45904a1().clearColorFilter();
        m45880N0().setImageResource(dbc0.f87277o9);
        m45880N0().clearColorFilter();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m45926x1(Envelope envelope, Function0<Unit> onNotMatched) {
        if (!m45922u1(envelope)) {
            onNotMatched.invoke();
            return;
        }
        m45866C1();
        dismiss();
        Function1<? super User, Unit> function1 = this.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(this.targetUser);
        }
        this.act.startActivityWithCustomTransition(MatchAct.m48747h2(this.act, jyb.m147507f0(this.targetUser.f56859id), -1, null, null), new MatchAct.C8617b());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m45927y0() {
        int color = Color.parseColor("#F9F9F9");
        int color2 = App.f16088e.getColor(c9c0.f80357N);
        int color3 = App.f16088e.getColor(c9c0.f80433l);
        int color4 = Color.parseColor("#131110");
        m45893U0().setBackgroundColor(color2);
        m45886Q0().setBackgroundColor(color);
        m45916m1().setBackgroundColor(color2);
        m45903Z0().setBackgroundColor(color);
        m45877L0().setBackgroundColor(color4);
        bnl0.m105524M(m45918o1(), false);
        m45917n1().setTextColor(color3);
        m45915l1().setTextColor(color3);
        m45901Y0().setTextColor(Color.parseColor(Constants.BLACK));
        m45904a1().setImageResource(dbc0.f87571x9);
        m45904a1().clearColorFilter();
        m45880N0().setImageResource(dbc0.f87409s9);
        m45880N0().clearColorFilter();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m45928y1() {
        if (this.pendingWhisperText == null) {
            return;
        }
        this.act.duringCreated(CoreModule.f18264c.f20297C0.m146428y4().observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.dq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45832U(this.f90174a, (uxj0) obj);
            }
        }, new y20() { // from class: l.eq5
            @Override // p153l.y20
            public final void call(Object obj) {
                DialogC8467a.m45849l0(this.f95302a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final int m45929z0(int imeBottom, int systemBarsBottom) {
        String str = Build.MANUFACTURER;
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (Intrinsics.m88377d(lowerCase, HardwareEarMonitorUtils.MANUFACTURER_VIVO) || Intrinsics.m88377d(lowerCase, HardwareEarMonitorUtils.MANUFACTURER_OPPO)) ? imeBottom : Math.max(0, imeBottom - systemBarsBottom);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m45930z1(String text) {
        m45812F1(this, "e_intl_compliment_quick_text_click", false, false, 6, null);
        m45869F0(text, true);
    }
}
