package com.p000p1.mobile.putong.core.p001ui.compliment;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.p000p1.mobile.putong.core.data.ComplimentText;
import com.p000p1.mobile.putong.core.data.CoreData;
import com.p000p1.mobile.putong.core.data.GameStage;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageAdditionalData;
import com.p000p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p000p1.mobile.putong.core.data.MessageChannel;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.compliment.C3079a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
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
import l.bd50;
import l.cwf0;
import l.d30;
import l.e30;
import l.eqh0;
import l.g30;
import l.gbl0;
import l.i0e;
import l.j760;
import l.jo0;
import l.l96;
import l.m6q0;
import l.mkd0;
import l.o59;
import l.o6n;
import l.o96;
import l.osi0;
import l.q89;
import l.qib0;
import l.roj0;
import l.rtm;
import l.szd;
import l.t100;
import l.u7c0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.xp5;
import l.y6q0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.bo5;
import p003l.co5;
import p003l.iyb0;
import p003l.mb90;
import p003l.wp5;
import v.AutoVDraweeView;
import v.VEditText;
import v.VImage;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ²\u00022\u00020\u0001:\u0002³\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010\u000fJ!\u0010#\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u000fJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010)J+\u0010.\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020!2\b\b\u0002\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020!H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\r2\u0006\u00102\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b3\u0010$J\u0017\u00104\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u001fJ\u0019\u00107\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010\u000fJ\u000f\u0010:\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010\u000fJ\u000f\u0010;\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010\u000fJ+\u0010=\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010<\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010/J'\u0010@\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u0001052\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bB\u00108J\u0017\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bG\u0010\u000fJ\u000f\u0010H\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010\u000fJ\u001f\u0010K\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b2\u0006\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020!2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bR\u0010\u000fJ\u0017\u0010S\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010\u001fJ\u000f\u0010T\u001a\u00020\rH\u0002¢\u0006\u0004\bT\u0010\u000fJ\u001f\u0010Z\u001a\u00020Y2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bZ\u0010[J\u0017\u0010^\u001a\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b^\u0010_J!\u0010a\u001a\u00020\u00002\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0`¢\u0006\u0004\ba\u0010bJ\u0019\u0010e\u001a\u00020\r2\b\u0010d\u001a\u0004\u0018\u00010cH\u0014¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\rH\u0016¢\u0006\u0004\bg\u0010\u000fJ\u000f\u0010h\u001a\u00020\rH\u0016¢\u0006\u0004\bh\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010nR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0085\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010xR*\u0010\u008d\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010t\u001a\u0005\b\u0097\u0001\u0010v\"\u0005\b\u0098\u0001\u0010xR*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010¥\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010\u009c\u0001\u001a\u0006\b£\u0001\u0010\u009e\u0001\"\u0006\b¤\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010\u0088\u0001\u001a\u0006\b§\u0001\u0010\u008a\u0001\"\u0006\b¨\u0001\u0010\u008c\u0001R)\u0010¬\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bN\u0010\u009c\u0001\u001a\u0006\bª\u0001\u0010\u009e\u0001\"\u0006\b«\u0001\u0010 \u0001R%\u0010¯\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bO\u0010t\u001a\u0005\b\u00ad\u0001\u0010v\"\u0005\b®\u0001\u0010xR&\u0010³\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0001\u0010t\u001a\u0005\b±\u0001\u0010v\"\u0005\b²\u0001\u0010xR*\u0010·\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010\u0090\u0001\u001a\u0006\bµ\u0001\u0010\u0092\u0001\"\u0006\b¶\u0001\u0010\u0094\u0001R*\u0010»\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¸\u0001\u0010\u009c\u0001\u001a\u0006\b¹\u0001\u0010\u009e\u0001\"\u0006\bº\u0001\u0010 \u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R&\u0010Ç\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÄ\u0001\u0010t\u001a\u0005\bÅ\u0001\u0010v\"\u0005\bÆ\u0001\u0010xR*\u0010Ë\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010\u0088\u0001\u001a\u0006\bÉ\u0001\u0010\u008a\u0001\"\u0006\bÊ\u0001\u0010\u008c\u0001R*\u0010Ï\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010\u0088\u0001\u001a\u0006\bÍ\u0001\u0010\u008a\u0001\"\u0006\bÎ\u0001\u0010\u008c\u0001R&\u0010Ó\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÐ\u0001\u0010t\u001a\u0005\bÑ\u0001\u0010v\"\u0005\bÒ\u0001\u0010xR*\u0010×\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010\u0090\u0001\u001a\u0006\bÕ\u0001\u0010\u0092\u0001\"\u0006\bÖ\u0001\u0010\u0094\u0001R*\u0010ß\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R*\u0010ç\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R&\u0010ë\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bè\u0001\u0010t\u001a\u0005\bé\u0001\u0010v\"\u0005\bê\u0001\u0010xR*\u0010ï\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bì\u0001\u0010\u0090\u0001\u001a\u0006\bí\u0001\u0010\u0092\u0001\"\u0006\bî\u0001\u0010\u0094\u0001R*\u0010ó\u0001\u001a\u00030à\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bð\u0001\u0010â\u0001\u001a\u0006\bñ\u0001\u0010ä\u0001\"\u0006\bò\u0001\u0010æ\u0001R*\u0010÷\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010Ú\u0001\u001a\u0006\bõ\u0001\u0010Ü\u0001\"\u0006\bö\u0001\u0010Þ\u0001R*\u0010û\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bø\u0001\u0010Ú\u0001\u001a\u0006\bù\u0001\u0010Ü\u0001\"\u0006\bú\u0001\u0010Þ\u0001R&\u0010ÿ\u0001\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bü\u0001\u0010t\u001a\u0005\bý\u0001\u0010v\"\u0005\bþ\u0001\u0010xR*\u0010\u0083\u0002\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0002\u0010¾\u0001\u001a\u0006\b\u0081\u0002\u0010À\u0001\"\u0006\b\u0082\u0002\u0010Â\u0001R&\u0010\u0087\u0002\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0002\u0010t\u001a\u0005\b\u0085\u0002\u0010v\"\u0005\b\u0086\u0002\u0010xR*\u0010\u008b\u0002\u001a\u00030\u0086\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0088\u0001\u001a\u0006\b\u0089\u0002\u0010\u008a\u0001\"\u0006\b\u008a\u0002\u0010\u008c\u0001R*\u0010\u0093\u0002\u001a\u00030\u008c\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u0097\u0002\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u0090\u0001\u001a\u0006\b\u0095\u0002\u0010\u0092\u0001\"\u0006\b\u0096\u0002\u0010\u0094\u0001R\u0019\u0010\u0099\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010Ù\u0001R\u001c\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u001b\u0010¤\u0002\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R'\u0010§\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u001a\u0010©\u0002\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0002\u0010nR\u0019\u0010«\u0002\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0002\u0010¥\u0002R\u001c\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010®\u0002R\u0016\u0010±\u0002\u001a\u00020!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b°\u0002\u00101¨\u0006´\u0002"}, d2 = {"Lcom/p1/mobile/putong/core/ui/compliment/a;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "targetUser", "", "from", "", "initialPhotoIndex", "liveRoomInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "", "L1", "()V", "s1", "T1", "tab", "V1", "(I)V", "X1", "Y1", "x0", "y0", "Q1", "R1", "O1", "W1", "text", "z1", "(Ljava/lang/String;)V", "A1", "", "fromQuickText", "F0", "(Ljava/lang/String;Z)V", "C0", "y1", "D1", "I0", "()Ljava/lang/String;", "H0", "event", "isUbc", "mcOnly", "E1", "(Ljava/lang/String;ZZ)V", "v1", "()Z", "pendingText", "U1", "J1", "Lcom/p1/mobile/putong/data/Envelope;", "envelope", "t1", "(Lcom/p1/mobile/putong/data/Envelope;)Z", "A0", "C1", "B1", "isPassiveWhisper", "G1", "Lkotlin/Function0;", "onNotMatched", "x1", "(Lcom/p1/mobile/putong/data/Envelope;Lkotlin/jvm/functions/Function0;)V", "u1", "", "Lcom/p1/mobile/putong/data/Media;", "J0", "()Ljava/util/List;", "r1", "P1", "imeBottom", "systemBarsBottom", "z0", "(II)I", "", "x", "y", "w1", "(FF)Z", "p1", "G0", "q1", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "q0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Ll/d30;", "callback", "N1", "(Ll/d30;)Lcom/p1/mobile/putong/core/ui/compliment/a;", "Lkotlin/Function1;", "M1", "(Lkotlin/jvm/functions/Function1;)Lcom/p1/mobile/putong/core/ui/compliment/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "show", "dismiss", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Lcom/p1/mobile/putong/data/User;", "l", "Ljava/lang/String;", "m", "Ljava/lang/Integer;", "n", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "U0", "()Landroid/widget/LinearLayout;", "set_layoutrootview", "(Landroid/widget/LinearLayout;)V", "_layoutrootview", "Lv/AutoVDraweeView;", "p", "Lv/AutoVDraweeView;", "o1", "()Lv/AutoVDraweeView;", "set_top_gradient_bg", "(Lv/AutoVDraweeView;)V", "_top_gradient_bg", "q", "Q0", "set_content", "_content", "Landroid/widget/FrameLayout;", "r", "Landroid/widget/FrameLayout;", "m1", "()Landroid/widget/FrameLayout;", "set_title_bar", "(Landroid/widget/FrameLayout;)V", "_title_bar", "Lv/VImage;", "s", "Lv/VImage;", "N0", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "t", "get_title_container", "set_title_container", "_title_container", "Lv/VText;", "u", "Lv/VText;", "n1", "()Lv/VText;", "set_title_name", "(Lv/VText;)V", "_title_name", "v", "l1", "set_title_age", "_title_age", "w", "P0", "set_compliment_count_container", "_compliment_count_container", "O0", "set_compliment_count_badge", "_compliment_count_badge", "Z0", "set_subtitle_area", "_subtitle_area", "z", "b1", "set_subtitle_root", "_subtitle_root", "A", "a1", "set_subtitle_icon", "_subtitle_icon", "B", "Y0", "set_subtitle", "_subtitle", "Landroidx/recyclerview/widget/RecyclerView;", "C", "Landroidx/recyclerview/widget/RecyclerView;", "V0", "()Landroidx/recyclerview/widget/RecyclerView;", "set_photo_container", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_photo_container", "D", "M0", "set_bottom_layout", "_bottom_layout", "E", "c1", "set_tab_container", "_tab_container", "F", "i1", "set_tab_paid_container", "_tab_paid_container", "G", "h1", "set_tab_paid", "_tab_paid", "H", "j1", "set_tab_paid_icon", "_tab_paid_icon", "Lv/VText_NoTopPadding;", "I", "Lv/VText_NoTopPadding;", "k1", "()Lv/VText_NoTopPadding;", "set_tab_paid_text", "(Lv/VText_NoTopPadding;)V", "_tab_paid_text", "Landroidx/constraintlayout/widget/ConstraintLayout;", "J", "Landroidx/constraintlayout/widget/ConstraintLayout;", "e1", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_tab_free_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_tab_free_container", "K", "d1", "set_tab_free", "_tab_free", "L", "f1", "set_tab_free_icon", "_tab_free_icon", "M", "get_tab_free_text_container", "set_tab_free_text_container", "_tab_free_text_container", "N", "g1", "set_tab_free_text", "_tab_free_text", "O", "R0", "set_free_label", "_free_label", "P", "L0", "set_bottom_content", "_bottom_content", "Q", "W0", "set_quick_compliment_container", "_quick_compliment_container", "R", "T0", "set_input_send_container", "_input_send_container", "S", "get_input_container", "set_input_container", "_input_container", "Lv/VEditText;", "T", "Lv/VEditText;", "S0", "()Lv/VEditText;", "set_input", "(Lv/VEditText;)V", "_input", "U", "X0", "set_send_btn", "_send_btn", "V", "currentTab", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;", "W", "Lcom/p1/mobile/putong/core/ui/compliment/ComplimentPhotoAdapter;", "photoAdapter", "Ll/iyb0;", "X", "Ll/iyb0;", "quickComplimentAdapter", "Y", "Ll/d30;", "onDismissCallback", "Z", "Lkotlin/jvm/functions/Function1;", "onComplimentSentSuccessCallback", "k0", "pendingWhisperText", "p0", "pendingFromQuickText", "Ll/cwf0;", "E0", "Ll/cwf0;", "statisticsPageHelper", "K0", "shouldShowDoubleTabs", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
@SourceDebugExtension
public final class C3079a extends szd {

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
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/p1/mobile/putong/core/ui/compliment/a$b", "Landroid/text/TextWatcher;", "", "s", "", GameStage.start, "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
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
            C3079a.this.m2029W1();
            if (C3079a.this.pendingWhisperText == null || C3079a.this.pendingFromQuickText) {
                return;
            }
            C3079a.this.pendingWhisperText = null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$c */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0006R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0016"}, d2 = {"com/p1/mobile/putong/core/ui/compliment/a$c", "Ll/m6q0$b;", "Ll/m6q0;", "animation", "", "c", "(Ll/m6q0;)V", "Ll/m6q0$a;", "bounds", "e", "(Ll/m6q0;Ll/m6q0$a;)Ll/m6q0$a;", "Ll/y6q0;", "insets", "", "runningAnimations", "d", "(Ll/y6q0;Ljava/util/List;)Ll/y6q0;", "b", "", "F", "startBottom", "endBottom", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class c extends m6q0.b {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public float startBottom;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public float endBottom;

        public c() {
            super(0);
        }

        /* JADX INFO: renamed from: b */
        public void m2062b(m6q0 animation) {
            animation.getClass();
            C3079a.this.m2009M0().getTranslationY();
        }

        /* JADX INFO: renamed from: c */
        public void m2063c(m6q0 animation) {
            animation.getClass();
            this.startBottom = C3079a.this.m2009M0().getTranslationY();
        }

        /* JADX INFO: renamed from: d */
        public y6q0 m2064d(y6q0 insets, List<m6q0> runningAnimations) {
            insets.getClass();
            runningAnimations.getClass();
            rtm rtmVarF = insets.f(y6q0.l.b());
            rtmVarF.getClass();
            rtm rtmVarF2 = insets.f(y6q0.l.f());
            rtmVarF2.getClass();
            rtm rtmVarF3 = insets.f(y6q0.l.d());
            rtmVarF3.getClass();
            int iM2060z0 = C3079a.this.m2060z0(rtmVarF.d, rtmVarF2.d);
            C3079a.this.m2009M0().setTranslationY(-iM2060z0);
            int i = rtmVarF3.d;
            C3079a c3079a = C3079a.this;
            if (iM2060z0 > 0) {
                xdl0.M(c3079a.m2036b1(), false);
                return insets;
            }
            xdl0.M(c3079a.m2036b1(), true);
            return insets;
        }

        /* JADX INFO: renamed from: e */
        public m6q0.a m2065e(m6q0 animation, m6q0.a bounds) {
            animation.getClass();
            bounds.getClass();
            this.endBottom = C3079a.this.m2009M0().getTranslationY();
            return bounds;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$d */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p1/mobile/putong/core/ui/compliment/a$d", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", MessageChannel.state, "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class d extends RecyclerView.n {
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            if (parent.getChildAdapterPosition(view) > 0) {
                outRect.left = t100.d(24.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.compliment.a$e */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p1/mobile/putong/core/ui/compliment/a$e", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class e extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ s f1180a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LinearLayoutManager f1181b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3079a f1182c;

        public e(s sVar, LinearLayoutManager linearLayoutManager, C3079a c3079a) {
            this.f1180a = sVar;
            this.f1181b = linearLayoutManager;
            this.f1182c = c3079a;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            View viewH;
            int position;
            ComplimentPhotoAdapter complimentPhotoAdapter;
            recyclerView.getClass();
            if (newState != 0 || (viewH = this.f1180a.h(this.f1181b)) == null || (position = this.f1181b.getPosition(viewH)) < 0 || (complimentPhotoAdapter = this.f1182c.photoAdapter) == null) {
                return;
            }
            complimentPhotoAdapter.m1931G(position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3079a(@NotNull Act act, @NotNull User user, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        super(act, false, u7c0.c);
        act.getClass();
        user.getClass();
        this.act = act;
        this.targetUser = user;
        this.from = str;
        this.initialPhotoIndex = num;
        this.liveRoomInfo = str2;
    }

    /* JADX INFO: renamed from: A1 */
    private final void m1937A1() {
        String string = StringsKt.Z0(m2021S0().getText().toString()).toString();
        if (string.length() == 0) {
            osi0.f(R.string.jh);
        } else {
            m1943F1(this, "e_intl_compliment_send", false, true, 2, null);
            m2000F0(string, false);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m1938B0(C3079a c3079a) {
        Function1<? super User, Unit> function1 = c3079a.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(c3079a.targetUser);
        }
        c3079a.dismiss();
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m1939D0(C3079a c3079a, roj0 roj0Var) {
        c3079a.m1998D1();
        c3079a.m2033Y1();
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m1941E0(C3079a c3079a, Throwable th) {
        c3079a.m1998D1();
        c3079a.m2033Y1();
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m1943F1(C3079a c3079a, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c3079a.m1999E1(str, z, z2);
    }

    /* JADX INFO: renamed from: H */
    public static void m1945H(final C3079a c3079a) {
        c3079a.m2024U0().animate().translationY(c3079a.m2024U0().getHeight()).setDuration(250L).withEndAction(new Runnable() { // from class: l.op5
            @Override // java.lang.Runnable
            public final void run() {
                C3079a.m1938B0(this.f6704a);
            }
        }).start();
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m1946H1(C3079a c3079a, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c3079a.m2002G1(str, z, z2);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m1947I(C3079a c3079a, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        c3079a.m1937A1();
        return true;
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m1948I1(C3079a c3079a, boolean z) {
        c3079a.m1997C1();
        Function1<? super User, Unit> function1 = c3079a.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(c3079a.targetUser);
        }
        osi0.g(App.e.getString((z && xp5.l()) ? R.string.C9 : R.string.Rg));
        c3079a.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static Unit m1949J(C3079a c3079a, String str) {
        str.getClass();
        c3079a.m2061z1(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static void m1950K(final C3079a c3079a, List list) {
        if (vwb.J(list)) {
            xdl0.M(c3079a.m2028W0(), false);
            return;
        }
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComplimentText) it.next()).value);
        }
        c3079a.quickComplimentAdapter = new iyb0(arrayList, new Function1() { // from class: l.wo5
            public final Object invoke(Object obj) {
                return C3079a.m1961S1(this.f8210a, (String) obj);
            }
        });
        c3079a.m2028W0().setAdapter(c3079a.quickComplimentAdapter);
        xdl0.M(c3079a.m2028W0(), true);
    }

    /* JADX INFO: renamed from: K1 */
    public static final Unit m1951K1(C3079a c3079a, Envelope envelope) {
        if (c3079a.m2052t1(envelope)) {
            co5.m5984k("p_navigation_view", xp5.l() ? "0compliment" : "passive_whisper");
            osi0.g(App.e.getString(xp5.l() ? R.string.C9 : R.string.Rg));
            c3079a.m1997C1();
            Function1<? super User, Unit> function1 = c3079a.onComplimentSentSuccessCallback;
            if (function1 != null) {
                function1.invoke(c3079a.targetUser);
            }
            c3079a.dismiss();
        } else {
            c3079a.m1994A0();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L1 */
    private final void m1953L1() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
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
        PutongAct.setLightStatusBar(getWindow(), 1280);
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setSoftInputMode(16);
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m1955N(final C3079a c3079a, final boolean z, Envelope envelope) {
        String str;
        m1943F1(c3079a, "e_intl_compliment_send", true, false, 4, null);
        m1943F1(c3079a, "e_compliment_sent_succes", true, false, 4, null);
        if (z && xp5.l()) {
            str = "0compliment";
        } else {
            str = z ? "passive_whisper" : "whisper";
        }
        co5.m5984k("p_navigation_view", str);
        c3079a.m2057x1(envelope, new Function0() { // from class: l.kp5
            public final Object invoke() {
                return C3079a.m1948I1(this.f5688a, z);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static void m1956O(C3079a c3079a, View view) {
        if (c3079a.currentTab != 0) {
            c3079a.m2027V1(0);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m1957P(C3079a c3079a, Envelope envelope) {
        m1943F1(c3079a, "e_intl_compliment_send", true, false, 4, null);
        m1943F1(c3079a, "e_compliment_sent_succes", true, false, 4, null);
        co5.m5984k("p_navigation_view", xp5.l() ? "0compliment" : "passive_whisper");
        if (c3079a.m2053u1(envelope)) {
            c3079a.m1997C1();
            Function1<? super User, Unit> function1 = c3079a.onComplimentSentSuccessCallback;
            if (function1 != null) {
                function1.invoke(c3079a.targetUser);
            }
            c3079a.act.startActivityWithCustomTransition(MatchAct.g2(c3079a.act, vwb.f0(new String[]{((DbObject) c3079a.targetUser).id}), -1, (ArrayList) null, (String) null), new MatchAct.b());
            return;
        }
        c3079a.m1997C1();
        Function1<? super User, Unit> function2 = c3079a.onComplimentSentSuccessCallback;
        if (function2 != null) {
            function2.invoke(c3079a.targetUser);
        }
        osi0.g(App.e.getString(xp5.l() ? R.string.C9 : R.string.Rg));
    }

    /* JADX INFO: renamed from: R */
    public static void m1959R(final C3079a c3079a, final Envelope envelope) {
        m1943F1(c3079a, "e_intl_compliment_send", true, false, 4, null);
        m1943F1(c3079a, "e_compliment_sent_succes", true, false, 4, null);
        c3079a.m2057x1(envelope, new Function0() { // from class: l.ip5
            public final Object invoke() {
                return C3079a.m1951K1(this.f5190a, envelope);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static y6q0 m1960S(C3079a c3079a, View view, y6q0 y6q0Var) {
        view.getClass();
        y6q0Var.getClass();
        rtm rtmVarF = y6q0Var.f(y6q0.l.b());
        rtmVarF.getClass();
        rtm rtmVarF2 = y6q0Var.f(y6q0.l.f());
        rtmVarF2.getClass();
        y6q0Var.f(y6q0.l.d()).getClass();
        view.setTranslationY(-c3079a.m2060z0(rtmVarF.d, rtmVarF2.d));
        return y6q0Var;
    }

    /* JADX INFO: renamed from: S1 */
    public static final Unit m1961S1(C3079a c3079a, String str) {
        str.getClass();
        c3079a.m2061z1(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m1962T(C3079a c3079a, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        c3079a.m2050p1();
        return true;
    }

    /* JADX INFO: renamed from: U */
    public static void m1963U(C3079a c3079a, roj0 roj0Var) {
        if (xma.m3() > 0) {
            c3079a.pendingWhisperText = null;
        }
        c3079a.m1998D1();
        c3079a.m2033Y1();
    }

    /* JADX INFO: renamed from: V */
    public static void m1964V(C3079a c3079a, roj0 roj0Var) {
        c3079a.m2033Y1();
    }

    /* JADX INFO: renamed from: W */
    public static void m1965W(C3079a c3079a) {
        c3079a.m2021S0().requestFocus();
        Object systemService = c3079a.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c3079a.m2021S0(), 1);
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m1966X(C3079a c3079a, DialogInterface dialogInterface) {
        i0e.e(c3079a.statisticsPageHelper);
        d30 d30Var = c3079a.onDismissCallback;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m1967Y() {
    }

    /* JADX INFO: renamed from: Z */
    public static void m1968Z(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static Unit m1969a0(C3079a c3079a, int i) {
        ComplimentPhotoAdapter complimentPhotoAdapter = c3079a.photoAdapter;
        if (complimentPhotoAdapter != null) {
            complimentPhotoAdapter.m1931G(i);
        }
        c3079a.m2026V0().smoothScrollToPosition(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1970b0(C3079a c3079a, View view) {
        if (c3079a.currentTab != 1) {
            zvf0.r("e_intl_whisper_tab_click", "p_intl_compliment_full_page");
            c3079a.m2027V1(1);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m1971c0(C3079a c3079a, String str, PurchaseType purchaseType) {
        m1946H1(c3079a, str, false, false, 2, null);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m1972d0(Throwable th) {
        co5.m5984k("p_navigation_view", "failed");
    }

    /* JADX INFO: renamed from: e0 */
    public static void m1973e0(Throwable th) {
        co5.m5984k("p_navigation_view", "failed");
    }

    /* JADX INFO: renamed from: f0 */
    public static void m1974f0(C3079a c3079a) {
        ComplimentPhotoAdapter complimentPhotoAdapter = c3079a.photoAdapter;
        if (complimentPhotoAdapter != null) {
            complimentPhotoAdapter.m1931G(0);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static void m1975g0(Throwable th) {
        co5.m5984k("p_navigation_view", "failed");
    }

    /* JADX INFO: renamed from: h0 */
    public static void m1976h0(C3079a c3079a, View view) {
        c3079a.m2050p1();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m1977i0(C3079a c3079a) {
        c3079a.m2059y1();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m1978j0(C3079a c3079a, Throwable th) {
        xdl0.M(c3079a.m2028W0(), false);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m1979k0(C3079a c3079a, View view) {
        c3079a.m1937A1();
    }

    /* JADX INFO: renamed from: l0 */
    public static void m1980l0(C3079a c3079a, Throwable th) {
        c3079a.m1998D1();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m1981m0(final C3079a c3079a, PurchaseType purchaseType, Act act, String str) {
        c3079a.pendingWhisperText = null;
        c3079a.act.duringCreated(CoreModule.c.C0.x4().observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.bp5
            public final void call(Object obj) {
                C3079a.m1939D0(this.f3416a, (roj0) obj);
            }
        }, new e30() { // from class: l.cp5
            public final void call(Object obj) {
                C3079a.m1941E0(this.f4062a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m1982n0(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, C3079a c3079a, View view, MotionEvent motionEvent) {
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
        float fD = t100.d(10.0f);
        if ((rawX * rawX) + (rawY * rawY) >= fD * fD) {
            return false;
        }
        c3079a.m1985q1();
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m1983o0(C3079a c3079a) {
        c3079a.m2021S0().requestFocus();
        Object systemService = c3079a.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c3079a.m2021S0(), 1);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m1984p0(C3079a c3079a, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || c3079a.m2055w1(motionEvent.getRawX(), motionEvent.getRawY())) {
            return false;
        }
        c3079a.m1985q1();
        return false;
    }

    /* JADX INFO: renamed from: q1 */
    private final void m1985q1() {
        IBinder windowToken;
        Object systemService = this.act.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null && (windowToken = m2021S0().getWindowToken()) != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
        m2021S0().clearFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    private final void m1987r1() {
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.pp5
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return C3079a.m1962T(this.f6901a, dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qp5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C3079a.m1966X(this.f7074a, dialogInterface);
            }
        });
        m2011N0().setOnClickListener(new View.OnClickListener() { // from class: l.rp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3079a.m1976h0(this.f7204a, view);
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    private final void m1989s1() {
        ViewGroup.LayoutParams layoutParams = m2017Q0().getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = xdl0.F0();
        m2048n1().setText(this.targetUser.name);
        if (this.targetUser.age.intValue() > 0) {
            m2046l1().setText(String.valueOf(this.targetUser.age.intValue()));
            xdl0.M(m2046l1(), true);
        } else {
            xdl0.M(m2046l1(), false);
        }
        if (m2007K0()) {
            xdl0.M(m2037c1(), true);
            m2023T1();
            m2045k1().setTypeface(eqh0.c(3), 1);
            m2041g1().setTypeface(eqh0.c(3), 1);
            m2019R0().setTypeface(eqh0.c(3), 1);
        } else {
            xdl0.M(m2037c1(), false);
        }
        m2018Q1();
        m2020R1();
        m2014O1();
        m2024U0().setOnTouchListener(new View.OnTouchListener() { // from class: l.ko5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C3079a.m1984p0(this.f5682a, view, motionEvent);
            }
        });
        m2033Y1();
        this.act.duringCreated(CoreModule.c.C0.x4().observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.vo5
            public final void call(Object obj) {
                C3079a.m1964V(this.f8009a, (roj0) obj);
            }
        }, new e30() { // from class: l.gp5
            public final void call(Object obj) {
                C3079a.m1968Z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public final void m1994A0() {
        m1995B1();
        bo5.m5763q(this.act, this.targetUser);
        m1997C1();
        m2024U0().post(new Runnable() { // from class: l.np5
            @Override // java.lang.Runnable
            public final void run() {
                C3079a.m1945H(this.f6539a);
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public final void m1995B1() {
        Object systemService = this.act.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            o96.a(vibrator, l96.a(30L, 150));
        } else {
            vibrator.vibrate(30L);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m1996C0(String text, boolean fromQuickText) {
        if (this.currentTab != 0) {
            m1946H1(this, text, fromQuickText, false, 4, null);
        } else {
            if (xma.m3() > 0) {
                m2006J1(text);
                return;
            }
            this.pendingWhisperText = text;
            this.pendingFromQuickText = fromQuickText;
            o6n.Companion.a(this.act, "", new g30() { // from class: l.xo5
                /* JADX INFO: renamed from: a */
                public final void m10938a(Object obj, Object obj2, Object obj3) {
                    C3079a.m1981m0(this.f8554a, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }, new d30() { // from class: l.yo5
                public final void call() {
                    C3079a.m1977i0(this.f9091a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m1997C1() {
        CoreModule.c.C0.x4();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m1998D1() {
        if (this.pendingFromQuickText) {
            return;
        }
        m2021S0().post(new Runnable() { // from class: l.jp5
            @Override // java.lang.Runnable
            public final void run() {
                C3079a.m1983o0(this.f5363a);
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    public final void m1999E1(String event, boolean isUbc, boolean mcOnly) {
        String strM2003H0 = m2003H0();
        String strM2004I0 = m2004I0();
        if (isUbc) {
            zvf0.D(event, "p_intl_compliment_full_page", new j760[]{vwb.Y("compliment_type", strM2003H0), vwb.Y("compliment_user_status", strM2004I0)});
        } else if (mcOnly) {
            zvf0.u(event, "p_intl_compliment_full_page", new j760[]{vwb.Y("compliment_type", strM2003H0), vwb.Y("compliment_user_status", strM2004I0)});
        } else {
            zvf0.u(event, "p_intl_compliment_full_page", new j760[]{vwb.Y("compliment_type", strM2003H0), vwb.Y("compliment_user_status", strM2004I0)});
            zvf0.w(event, "p_intl_compliment_full_page", new j760[]{vwb.Y("compliment_type", strM2003H0), vwb.Y("compliment_user_status", strM2004I0)});
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m2000F0(String text, boolean fromQuickText) {
        if (qib0.Z.K(text) || qib0.Z.M(text)) {
            this.act.dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).z0();
        } else {
            m1996C0(text, fromQuickText);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m2001G0(String text) {
        if (m2054v1()) {
            return;
        }
        String str = ((DbObject) this.targetUser).id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM2005J0 = m2005J0();
        if (vwb.J(listM2005J0)) {
            return;
        }
        listM2005J0.getClass();
        this.act.duringCreated(CoreModule.c.w0.t3(str, o59.k3(text, listM2005J0, false, this.liveRoomInfo).toJson()).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.tp5
            public final void call(Object obj) {
                C3079a.m1957P(this.f7599a, (Envelope) obj);
            }
        }, new e30() { // from class: l.up5
            public final void call(Object obj) {
                C3079a.m1975g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G1 */
    public final void m2002G1(String text, boolean fromQuickText, final boolean isPassiveWhisper) {
        if (m2054v1()) {
            if (isPassiveWhisper) {
                return;
            }
            m2025U1(text, fromQuickText);
            return;
        }
        String str = ((DbObject) this.targetUser).id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM2005J0 = m2005J0();
        if (vwb.J(listM2005J0)) {
            return;
        }
        listM2005J0.getClass();
        this.act.duringCreated(CoreModule.c.w0.t3(str, o59.k3(text, listM2005J0, false, this.liveRoomInfo).toJson()).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.dp5
            public final void call(Object obj) {
                C3079a.m1955N(this.f4209a, isPassiveWhisper, (Envelope) obj);
            }
        }, new e30() { // from class: l.ep5
            public final void call(Object obj) {
                C3079a.m1973e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final String m2003H0() {
        return this.currentTab == 0 ? "compliment" : "whisper";
    }

    /* JADX INFO: renamed from: I0 */
    public final String m2004I0() {
        if (xma.j4()) {
            return !xma.e4() ? "premium" : "other";
        }
        return SummarizedPrivilegesId.ultraPremium;
    }

    /* JADX INFO: renamed from: J0 */
    public final List<Media> m2005J0() {
        ComplimentPhotoAdapter complimentPhotoAdapter = this.photoAdapter;
        if (complimentPhotoAdapter == null) {
            return null;
        }
        int iM1927C = complimentPhotoAdapter.m1927C();
        List list = this.targetUser.pictures;
        if (list == null || iM1927C < 0 || iM1927C >= list.size()) {
            return null;
        }
        Picture pictureMedia = this.targetUser.media(iM1927C);
        if (pictureMedia instanceof Video) {
            pictureMedia = ((Video) pictureMedia).cover();
        }
        return CollectionsKt.listOf(pictureMedia);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m2006J1(String text) {
        String str = ((DbObject) this.targetUser).id;
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        List<Media> listM2005J0 = m2005J0();
        if (vwb.J(listM2005J0)) {
            return;
        }
        listM2005J0.getClass();
        this.act.duringCreated(CoreModule.c.w0.t3(str, o59.k3(text, listM2005J0, true, this.liveRoomInfo).toJson()).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.fp5
            public final void call(Object obj) {
                C3079a.m1959R(this.f4483a, (Envelope) obj);
            }
        }, new e30() { // from class: l.hp5
            public final void call(Object obj) {
                C3079a.m1972d0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m2007K0() {
        q89 q89Var = CoreModule.c.p0;
        return q89Var.S < q89Var.U;
    }

    @NotNull
    /* JADX INFO: renamed from: L0 */
    public final LinearLayout m2008L0() {
        LinearLayout linearLayout = this._bottom_content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_bottom_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public final LinearLayout m2009M0() {
        LinearLayout linearLayout = this._bottom_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_bottom_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M1 */
    public final C3079a m2010M1(@NotNull Function1<? super User, Unit> callback) {
        callback.getClass();
        this.onComplimentSentSuccessCallback = callback;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public final VImage m2011N0() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N1 */
    public final C3079a m2012N1(@Nullable d30 callback) {
        this.onDismissCallback = callback;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public final VText m2013O0() {
        VText vText = this._compliment_count_badge;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_compliment_count_badge");
        return null;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m2014O1() {
        m2021S0().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(140)});
        m2021S0().addTextChangedListener(new b());
        m2021S0().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.so5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return C3079a.m1947I(this.f7418a, textView, i, keyEvent);
            }
        });
        m2030X0().setOnClickListener(new View.OnClickListener() { // from class: l.to5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3079a.m1979k0(this.f7589a, view);
            }
        });
        m2021S0().post(new Runnable() { // from class: l.uo5
            @Override // java.lang.Runnable
            public final void run() {
                C3079a.m1965W(this.f7781a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: P0 */
    public final FrameLayout m2015P0() {
        FrameLayout frameLayout = this._compliment_count_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_compliment_count_container");
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public final void m2016P1() {
        gbl0.E0(m2009M0(), new c());
        gbl0.y0(m2009M0(), new bd50() { // from class: l.sp5
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return C3079a.m1960S(this.f7430a, view, y6q0Var);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public final LinearLayout m2017Q0() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_content");
        return null;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m2018Q1() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act, 0, false);
        m2026V0().setLayoutManager(linearLayoutManager);
        int iY0 = (xdl0.y0() - t100.d(191.0f)) / 2;
        m2026V0().setPadding(iY0, 0, iY0, 0);
        m2026V0().addItemDecoration(new d());
        Act act = this.act;
        User user = this.targetUser;
        Function1 function1 = new Function1() { // from class: l.po5
            public final Object invoke(Object obj) {
                return C3079a.m1969a0(this.f6895a, ((Integer) obj).intValue());
            }
        };
        Integer num = this.initialPhotoIndex;
        this.photoAdapter = new ComplimentPhotoAdapter(act, user, function1, num != null ? num.intValue() : 0);
        m2026V0().setAdapter(this.photoAdapter);
        m2026V0().setItemViewCacheSize(4);
        s sVar = new s();
        sVar.b(m2026V0());
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        m2026V0().setOnTouchListener(new View.OnTouchListener() { // from class: l.qo5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C3079a.m1982n0(floatRef, floatRef2, this, view, motionEvent);
            }
        });
        m2026V0().addOnScrollListener(new e(sVar, linearLayoutManager, this));
        m2026V0().post(new Runnable() { // from class: l.ro5
            @Override // java.lang.Runnable
            public final void run() {
                C3079a.m1974f0(this.f7196a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: R0 */
    public final VText_NoTopPadding m2019R0() {
        VText_NoTopPadding vText_NoTopPadding = this._free_label;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.r("_free_label");
        return null;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m2020R1() {
        m2028W0().setLayoutManager(new LinearLayoutManager(this.act, 0, false));
        List listN3 = CoreModule.c.w0.n3();
        if (vwb.J(listN3)) {
            xdl0.M(m2028W0(), false);
            this.act.duringCreated(CoreModule.c.w0.m3()).subscribe(mkd0.H(new e30() { // from class: l.no5
                public final void call(Object obj) {
                    C3079a.m1950K(this.f6538a, (List) obj);
                }
            }, new e30() { // from class: l.oo5
                public final void call(Object obj) {
                    C3079a.m1978j0(this.f6695a, (Throwable) obj);
                }
            }));
            return;
        }
        listN3.getClass();
        List list = listN3;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ComplimentText) it.next()).value);
        }
        this.quickComplimentAdapter = new iyb0(arrayList, new Function1() { // from class: l.mo5
            public final Object invoke(Object obj) {
                return C3079a.m1949J(this.f6367a, (String) obj);
            }
        });
        m2028W0().setAdapter(this.quickComplimentAdapter);
        xdl0.M(m2028W0(), true);
    }

    @NotNull
    /* JADX INFO: renamed from: S0 */
    public final VEditText m2021S0() {
        VEditText vEditText = this._input;
        if (vEditText != null) {
            return vEditText;
        }
        Intrinsics.r("_input");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T0 */
    public final LinearLayout m2022T0() {
        LinearLayout linearLayout = this._input_send_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_input_send_container");
        return null;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m2023T1() {
        zvf0.x("e_intl_whisper_tab_click", "p_intl_compliment_full_page");
        m2042h1().setOnClickListener(new View.OnClickListener() { // from class: l.vp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3079a.m1956O(this.f8018a, view);
            }
        });
        m2038d1().setOnClickListener(new View.OnClickListener() { // from class: l.lo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3079a.m1970b0(this.f6176a, view);
            }
        });
        m2031X1();
    }

    @NotNull
    /* JADX INFO: renamed from: U0 */
    public final LinearLayout m2024U0() {
        LinearLayout linearLayout = this._layoutrootview;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_layoutrootview");
        return null;
    }

    /* JADX INFO: renamed from: U1 */
    public final void m2025U1(final String pendingText, boolean fromQuickText) {
        String str = fromQuickText ? "p_intl_compliment_full_page,e_intl_compliment_quick_text_click,click" : "p_intl_compliment_full_page,e_intl_compliment_send,click";
        com.p1.mobile.putong.core.ui.purchase.c cVar = com.p1.mobile.putong.core.ui.purchase.c.INSTANCE;
        com.p1.mobile.putong.core.ui.purchase.c.O1(this.act, str, Privilege.vip_unlimited_likes, (d30) null, new d30() { // from class: l.mp5
            public final void call() {
                C3079a.m1967Y();
            }
        }, false, (User) null, (Object) null, new e30() { // from class: l.lp5
            public final void call(Object obj) {
                C3079a.m1971c0(this.f6180a, pendingText, (PurchaseType) obj);
            }
        }, 232, (Object) null);
    }

    @NotNull
    /* JADX INFO: renamed from: V0 */
    public final RecyclerView m2026V0() {
        RecyclerView recyclerView = this._photo_container;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_photo_container");
        return null;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m2027V1(int tab) {
        this.currentTab = tab;
        m2031X1();
        m2033Y1();
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final RecyclerView m2028W0() {
        RecyclerView recyclerView = this._quick_compliment_container;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_quick_compliment_container");
        return null;
    }

    /* JADX INFO: renamed from: W1 */
    public final void m2029W1() {
        int i;
        Editable text = m2021S0().getText();
        boolean z = text == null || text.length() == 0;
        int i2 = this.currentTab;
        if (i2 == 0 && z) {
            i = x2c0.o9;
        } else if (i2 == 0 && !z) {
            i = x2c0.p9;
        } else if (i2 == 1 && z) {
            i = x2c0.s9;
        } else {
            i = (i2 != 1 || z) ? x2c0.o9 : x2c0.t9;
        }
        m2030X0().setImageResource(i);
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public final VImage m2030X0() {
        VImage vImage = this._send_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_send_btn");
        return null;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m2031X1() {
        int color = App.e.getColor(w0c0.N);
        if (this.currentTab == 0) {
            m2043i1().setElevation(t100.d(4.0f));
            m2045k1().setAlpha(1.0f);
            m2044j1().setAlpha(1.0f);
            m2039e1().setElevation(t100.d(2.0f));
            m2041g1().setAlpha(0.4f);
            m2040f1().setAlpha(0.4f);
            m2041g1().setTextColor(color);
            m2040f1().setColorFilter(color);
            m2038d1().setBackgroundResource(x2c0.v9);
            m2038d1().setPadding(t100.d(33.0f), m2038d1().getPaddingTop(), 0, m2038d1().getPaddingBottom());
            return;
        }
        m2043i1().setElevation(t100.d(2.0f));
        m2045k1().setAlpha(0.4f);
        m2044j1().setAlpha(0.4f);
        m2039e1().setElevation(t100.d(4.0f));
        m2041g1().setAlpha(1.0f);
        m2040f1().setAlpha(1.0f);
        m2041g1().setTextColor(color);
        m2040f1().setColorFilter(color);
        m2038d1().setBackgroundResource(x2c0.u9);
        m2038d1().setPadding(t100.d(20.0f), m2038d1().getPaddingTop(), t100.d(20.0f), m2038d1().getPaddingBottom());
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final VText m2032Y0() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m2033Y1() {
        if (this.currentTab == 0) {
            m2032Y0().setText(App.e.getString(R.string.Ub));
            m2013O0().setText(String.valueOf(xma.m3()));
            xdl0.M(m2015P0(), true);
            m2056x0();
            ComplimentPhotoAdapter complimentPhotoAdapter = this.photoAdapter;
            if (complimentPhotoAdapter != null) {
                complimentPhotoAdapter.m1932H(ComplimentPhotoAdapter.TabMode.COMPLIMENT);
            }
        } else {
            m2032Y0().setText(App.e.getString(R.string.Sg));
            xdl0.M(m2015P0(), false);
            m2058y0();
            ComplimentPhotoAdapter complimentPhotoAdapter2 = this.photoAdapter;
            if (complimentPhotoAdapter2 != null) {
                complimentPhotoAdapter2.m1932H(ComplimentPhotoAdapter.TabMode.WHISPER);
            }
        }
        m2029W1();
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final LinearLayout m2034Z0() {
        LinearLayout linearLayout = this._subtitle_area;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_subtitle_area");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a1 */
    public final VImage m2035a1() {
        VImage vImage = this._subtitle_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_subtitle_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b1 */
    public final LinearLayout m2036b1() {
        LinearLayout linearLayout = this._subtitle_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_subtitle_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public final FrameLayout m2037c1() {
        FrameLayout frameLayout = this._tab_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_tab_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d1 */
    public final LinearLayout m2038d1() {
        LinearLayout linearLayout = this._tab_free;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_tab_free");
        return null;
    }

    public void dismiss() {
        m1985q1();
        gbl0.E0(m2009M0(), (m6q0.b) null);
        gbl0.y0(m2009M0(), (bd50) null);
        xdl0.M(m2036b1(), true);
        m2009M0().setTranslationY(0.0f);
        i0e.e(this.statisticsPageHelper);
        d30 d30Var = this.onDismissCallback;
        if (d30Var != null) {
            d30Var.call();
        }
        super.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: e1 */
    public final ConstraintLayout m2039e1() {
        ConstraintLayout constraintLayout = this._tab_free_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_tab_free_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f1 */
    public final VImage m2040f1() {
        VImage vImage = this._tab_free_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_tab_free_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g1 */
    public final VText_NoTopPadding m2041g1() {
        VText_NoTopPadding vText_NoTopPadding = this._tab_free_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.r("_tab_free_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public final LinearLayout m2042h1() {
        LinearLayout linearLayout = this._tab_paid;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_tab_paid");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i1 */
    public final FrameLayout m2043i1() {
        FrameLayout frameLayout = this._tab_paid_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_tab_paid_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j1 */
    public final VImage m2044j1() {
        VImage vImage = this._tab_paid_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_tab_paid_icon");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public final VText_NoTopPadding m2045k1() {
        VText_NoTopPadding vText_NoTopPadding = this._tab_paid_text;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.r("_tab_paid_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public final VText m2046l1() {
        VText vText = this._title_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title_age");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m1 */
    public final FrameLayout m2047m1() {
        FrameLayout frameLayout = this._title_bar;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_title_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n1 */
    public final VText m2048n1() {
        VText vText = this._title_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o1 */
    public final AutoVDraweeView m2049o1() {
        AutoVDraweeView autoVDraweeView = this._top_gradient_bg;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.r("_top_gradient_bg");
        return null;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*androidx.appcompat.app.a*/.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        setContentView(m2051q0(layoutInflater, null));
        m1953L1();
        m1989s1();
        m1987r1();
        v(m2024U0());
    }

    /* JADX INFO: renamed from: p1 */
    public final void m2050p1() {
        String str = this.pendingWhisperText;
        this.pendingWhisperText = null;
        if (str != null && this.currentTab == 0) {
            m2001G0(str);
        }
        dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: q0 */
    public final View m2051q0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM10535b = wp5.m10535b(this, inflater, parent);
        viewM10535b.getClass();
        return viewM10535b;
    }

    public void show() {
        super.show();
        cwf0 cwf0VarC = i0e.c("p_intl_compliment_full_page", C3079a.class.getName());
        this.statisticsPageHelper = cwf0VarC;
        if (cwf0VarC != null) {
            cwf0VarC.p(new j760[]{vwb.Y("compliment_tab", m2007K0() ? "all" : "compliment")});
        }
        i0e.f(this.statisticsPageHelper);
        m2016P1();
    }

    /* JADX INFO: renamed from: t1 */
    public final boolean m2052t1(Envelope envelope) {
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
            if (Intrinsics.d((message == null || (messageAdditionalData = message.additionalData) == null || (messageAdditionalDataCompliment = messageAdditionalData.compliment) == null) ? null : messageAdditionalDataCompliment.type, "free")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u1 */
    public final boolean m2053u1(Envelope envelope) {
        String str;
        CoreData coreData;
        List<Relationship> list;
        if (envelope == null || (str = ((DbObject) this.targetUser).id) == null || str.length() == 0 || (coreData = (CoreData) envelope.getModuleData(CoreData.class)) == null || (list = coreData.relationships) == null) {
            return false;
        }
        List<Relationship> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (Relationship relationship : list2) {
            if (relationship != null && Intrinsics.d(((DbObject) this.targetUser).id, relationship.id) && TEnum.equals(relationship.state, "matched")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m2054v1() {
        CounterLikeLimit counterLikeLimit;
        Counter counterO3 = CoreModule.c.o3();
        if (counterO3 == null || (counterLikeLimit = counterO3.likeLimit) == null) {
            return false;
        }
        return counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !mb90.m8138c(CoreModule.c.e0.p9(), PurchaseType.TYPE_LIKENOLIMIT_PKG);
    }

    /* JADX INFO: renamed from: w1 */
    public final boolean m2055w1(float x, float y) {
        Rect rect = new Rect();
        if (m2022T0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        if (m2028W0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        if (m2037c1().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y)) {
            return true;
        }
        return m2011N0().getGlobalVisibleRect(rect) && rect.contains((int) x, (int) y);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m2056x0() {
        int color = Color.parseColor("#131110");
        int color2 = Color.parseColor("#C0A773");
        m2024U0().setBackgroundColor(color);
        m2049o1().setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjFBMzg1NjVCRjMzMzRENDU5RTJDREJBNUQyRTM2MjM2IiwidyI6NzUwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNTM4OTM5OTcwNjg0Njg3LCJwdCI6MjAyNjAyMDUxNH0.png");
        xdl0.M(m2049o1(), true);
        m2017Q0().setBackgroundColor(0);
        m2047m1().setBackgroundColor(0);
        m2034Z0().setBackgroundColor(0);
        m2008L0().setBackgroundColor(color);
        m2048n1().setTextColor(color2);
        m2046l1().setTextColor(color2);
        m2032Y0().setTextColor(Color.parseColor("#66FFE7A8"));
        m2035a1().setImageResource(x2c0.q9);
        m2035a1().clearColorFilter();
        m2011N0().setImageResource(x2c0.n9);
        m2011N0().clearColorFilter();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2057x1(Envelope envelope, Function0<Unit> onNotMatched) {
        if (!m2053u1(envelope)) {
            onNotMatched.invoke();
            return;
        }
        m1997C1();
        dismiss();
        Function1<? super User, Unit> function1 = this.onComplimentSentSuccessCallback;
        if (function1 != null) {
            function1.invoke(this.targetUser);
        }
        this.act.startActivityWithCustomTransition(MatchAct.g2(this.act, vwb.f0(new String[]{((DbObject) this.targetUser).id}), -1, (ArrayList) null, (String) null), new MatchAct.b());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m2058y0() {
        int color = Color.parseColor("#F9F9F9");
        int color2 = App.e.getColor(w0c0.N);
        int color3 = App.e.getColor(w0c0.l);
        int color4 = Color.parseColor("#131110");
        m2024U0().setBackgroundColor(color2);
        m2017Q0().setBackgroundColor(color);
        m2047m1().setBackgroundColor(color2);
        m2034Z0().setBackgroundColor(color);
        m2008L0().setBackgroundColor(color4);
        xdl0.M(m2049o1(), false);
        m2048n1().setTextColor(color3);
        m2046l1().setTextColor(color3);
        m2032Y0().setTextColor(Color.parseColor("#000000"));
        m2035a1().setImageResource(x2c0.w9);
        m2035a1().clearColorFilter();
        m2011N0().setImageResource(x2c0.r9);
        m2011N0().clearColorFilter();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m2059y1() {
        if (this.pendingWhisperText == null) {
            return;
        }
        this.act.duringCreated(CoreModule.c.C0.x4().observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.zo5
            public final void call(Object obj) {
                C3079a.m1963U(this.f9287a, (roj0) obj);
            }
        }, new e30() { // from class: l.ap5
            public final void call(Object obj) {
                C3079a.m1980l0(this.f2837a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final int m2060z0(int imeBottom, int systemBarsBottom) {
        String str = Build.MANUFACTURER;
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (Intrinsics.d(lowerCase, "vivo") || Intrinsics.d(lowerCase, "oppo")) ? imeBottom : Math.max(0, imeBottom - systemBarsBottom);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m2061z1(String text) {
        m1943F1(this, "e_intl_compliment_quick_text_click", false, false, 6, null);
        m2000F0(text, true);
    }
}
