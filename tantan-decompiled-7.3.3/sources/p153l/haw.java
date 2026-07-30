package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4903r;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.LoveBuzzEnvelope;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.RateLimited;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.text.TextBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.video.VideoBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.VoiceBuzzAct;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¦\u00012\u00020\u0001:\u0001xB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J_\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0012¢\u0006\u0004\b)\u0010\u001fJ\u0017\u0010*\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b-\u0010(Jo\u00100\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b0\u00101Jm\u00102\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\u0003J\r\u00109\u001a\u00020\u000f¢\u0006\u0004\b9\u0010\u0003J\u0017\u0010:\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b:\u00105J\u0017\u0010;\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b;\u00105J\u0017\u0010<\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b<\u00105J1\u0010A\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bC\u00105J\u001f\u0010E\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bE\u0010\u001aJA\u0010F\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bF\u0010GJ1\u0010H\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bJ\u0010KJ[\u0010N\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010L2\b\b\u0002\u0010M\u001a\u00020\u0012¢\u0006\u0004\bN\u0010OJK\u0010P\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\bP\u0010\u0017J!\u0010Q\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bQ\u0010\u001aJ!\u0010R\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bR\u0010\u001aJ\u0015\u0010S\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bU\u00105J\r\u0010V\u001a\u00020?¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020?¢\u0006\u0004\bY\u0010ZJK\u0010\\\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010[\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\\\u0010\u0017J\u001f\u0010]\u001a\u00020\u000f2\b\u0010[\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b]\u0010\u001aJ\r\u0010^\u001a\u00020\u000f¢\u0006\u0004\b^\u0010\u0003J\r\u0010_\u001a\u00020\u000f¢\u0006\u0004\b_\u0010\u0003J\u001f\u0010a\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010`\u001a\u00020\u0012¢\u0006\u0004\ba\u0010bJU\u0010f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010c\u001a\u00020\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\bf\u0010gJG\u0010j\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010i\u001a\u00020\u0012¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\u0012¢\u0006\u0004\bl\u0010\u001fJ\u001d\u0010n\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n¢\u0006\u0004\bn\u0010\u001aJ\u0019\u0010o\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020?¢\u0006\u0004\br\u0010ZJ\r\u0010s\u001a\u00020?¢\u0006\u0004\bs\u0010WJ\r\u0010t\u001a\u00020\u000f¢\u0006\u0004\bt\u0010\u0003J\r\u0010u\u001a\u00020\u000f¢\u0006\u0004\bu\u0010\u0003J\r\u0010v\u001a\u00020\u000f¢\u0006\u0004\bv\u0010\u0003R\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00040w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R7\u0010\u0082\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010}0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b~\u0010y\u001a\u0004\b\u007f\u0010{\"\u0006\b\u0080\u0001\u0010\u0081\u0001R9\u0010\u0086\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010}0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010y\u001a\u0005\b\u0084\u0001\u0010{\"\u0006\b\u0085\u0001\u0010\u0081\u0001R-\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\n0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0087\u0001\u0010y\u001a\u0005\b\u0088\u0001\u0010{\"\u0006\b\u0089\u0001\u0010\u0081\u0001R<\u0010\u0092\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010}0\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010¡\u0001\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010WR\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001¨\u0006§\u0001"}, m88121d2 = {"Ll/haw;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "data", "g0", "(Lcom/p1/mobile/putong/core/data/LoveBuzzData;)Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "token", "otherId", "from", "Lkotlin/Function0;", "", "success", "fail", "", "popBusiness", "Y0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "P0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cid", "h1", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "f0", "(Lcom/p1/mobile/putong/core/data/LoveBuzzData;Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "w0", "()Z", "v0", "()Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "Ll/eqx;", "B0", "()Ll/eqx;", "n0", "shown", "I0", "(Z)V", "L0", "x0", "(Lcom/p1/mobile/android/app/Act;)V", "open", "q1", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "filter", "q0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "W", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "c1", "(Ljava/lang/String;)V", "R0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "m1", "o1", "g1", "n1", "s0", "noFace", "noVocal", "", "errorCode", "K0", "(Ljava/lang/String;ZZI)V", "e1", "scene", "k1", "W0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "M0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "p1", "(ZLjava/lang/String;)V", "Lkotlin/Function1;", "enter", "X", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", "h0", "d1", "Z", "E0", "(Ljava/lang/String;)Z", "j1", "C0", "()I", "count", "i1", "(I)V", "bonusId", "c0", "e0", "s1", "r1", "showPop", "j0", "(Lcom/p1/mobile/android/app/Act;Z)Z", "rateLimit", "noCount", "coinBuySuc", "l0", "(Ljava/lang/String;Lcom/p1/mobile/android/app/Act;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z", "jump", "direct", "o0", "(Ljava/lang/String;Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "t0", "react", "b1", "F0", "(Ljava/lang/String;)Ljava/lang/String;", "mcc", "J0", "u0", "b0", "O0", "Q0", "Lrx/subjects/a;", "a", "Lrx/subjects/a;", "A0", "()Lrx/subjects/a;", "loveBuzzStatusBs", "Ll/pf60;", "b", "z0", "setLoveBuzzShowPopBS", "(Lrx/subjects/a;)V", "loveBuzzShowPopBS", "c", "G0", "setMediaBuzzShowPopBS", "mediaBuzzShowPopBS", Constants.INAPP_DATA_TAG, "H0", "setMediaBuzzWarnBS", "mediaBuzzWarnBS", "Lrx/subjects/b;", "e", "Lrx/subjects/b;", "D0", "()Lrx/subjects/b;", "setMediaBuzzNotifyPS", "(Lrx/subjects/b;)V", "mediaBuzzNotifyPS", "Ll/fqx;", "f", "Ll/fqx;", "mediaBuzzPair", "g", "Ll/eqx;", "mediaBuzzCallData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enterMediaBuzzPool", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "y0", "deviceLevel", "Ljava/util/concurrent/atomic/AtomicInteger;", "j", "Ljava/util/concurrent/atomic/AtomicInteger;", "buzzActive", "Companion", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class haw {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Lazy<haw> f108521k = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.l8w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return haw.m134201E();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C22507a<LoveBuzzData> loveBuzzStatusBs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C22507a<pf60<String, Object>> loveBuzzShowPopBS;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public C22507a<pf60<String, Object>> mediaBuzzShowPopBS;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public C22507a<String> mediaBuzzWarnBS;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public C22508b<pf60<String, Object>> mediaBuzzNotifyPS;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public fqx mediaBuzzPair;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public volatile eqx mediaBuzzCallData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean enterMediaBuzzPool;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy deviceLevel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger buzzActive;

    public haw() {
        C22507a<LoveBuzzData> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.loveBuzzStatusBs = c22507aM222758b;
        C22507a<pf60<String, Object>> c22507aM222758b2 = C22507a.m222758b();
        c22507aM222758b2.getClass();
        this.loveBuzzShowPopBS = c22507aM222758b2;
        C22507a<pf60<String, Object>> c22507aM222758b3 = C22507a.m222758b();
        c22507aM222758b3.getClass();
        this.mediaBuzzShowPopBS = c22507aM222758b3;
        C22507a<String> c22507aM222758b4 = C22507a.m222758b();
        c22507aM222758b4.getClass();
        this.mediaBuzzWarnBS = c22507aM222758b4;
        C22508b<pf60<String, Object>> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        this.mediaBuzzNotifyPS = c22508bM222767b;
        this.enterMediaBuzzPool = new AtomicBoolean(false);
        this.deviceLevel = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.s9w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(haw.m134203G());
            }
        });
        this.buzzActive = new AtomicInteger(-1);
    }

    /* JADX INFO: renamed from: A */
    public static Unit m134197A() {
        xa2.INSTANCE.m209830a("LoveBuzzManager", "checkBuzzJump confirm");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static LoveBuzzData m134198B(LoveBuzzData loveBuzzData) {
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3();
            return loveBuzzData;
        }
        CoreModule.f18264c.f20312H0.m155449k5();
        return loveBuzzData;
    }

    /* JADX INFO: renamed from: D */
    public static void m134200D(Function0 function0, haw hawVar, String str, LoveBuzzData loveBuzzData) {
        String str2;
        if (function0 != null) {
            function0.invoke();
        }
        if (loveBuzzData != null) {
            eqx.m122071r(hawVar.m134264B0(), null, Integer.valueOf(loveBuzzData.totalDuration), Integer.valueOf(loveBuzzData.remainingProlongCount), null, 9, null);
        }
        C22508b<pf60<String, Object>> c22508b = hawVar.mediaBuzzNotifyPS;
        if (Intrinsics.m88377d(str, "memojiBuzz")) {
            str2 = "memojiBuzz_prolong_time";
        } else {
            str2 = Intrinsics.m88377d(str, "videoBuzz") ? "videoBuzz_prolong_time" : "voiceBuzz_prolong_time";
        }
        c22508b.onNext(jyb.m147494Y(str2, null));
    }

    /* JADX INFO: renamed from: E */
    public static haw m134201E() {
        return new haw();
    }

    /* JADX INFO: renamed from: F */
    public static Unit m134202F(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static int m134203G() {
        return k8w.INSTANCE.m148757f();
    }

    /* JADX INFO: renamed from: I */
    public static void m134205I(Function0 function0, Throwable th) {
        xa2.INSTANCE.m209831b("LoveBuzzManager", "prolongMediaBuzz error is " + th.getMessage());
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m134207K(Act act, String str, Function0 function0, uxj0 uxj0Var) {
        act.startActivity(CoreModule.f18273l.m143405a().mo34449Xr(act, str));
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m134208L(Throwable th) {
        xa2.INSTANCE.m209831b("LoveBuzzManager", "getLoveBuzzStatus error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: M */
    public static void m134209M(Function0 function0, haw hawVar, String str, LoveBuzzData loveBuzzData) {
        String str2;
        if (loveBuzzData != null) {
            hawVar.m134264B0().m122088q(Boolean.valueOf(loveBuzzData.matched), Integer.valueOf(loveBuzzData.totalDuration), Integer.valueOf(loveBuzzData.remainingProlongCount), Boolean.TRUE);
        }
        if (function0 != null) {
            function0.invoke();
        }
        C22508b<pf60<String, Object>> c22508b = hawVar.mediaBuzzNotifyPS;
        if (Intrinsics.m88377d(str, "memojiBuzz")) {
            str2 = "memojiBuzz_like_relation";
        } else {
            str2 = Intrinsics.m88377d(str, "videoBuzz") ? "videoBuzz_like_relation" : "voiceBuzz_like_relation";
        }
        c22508b.onNext(jyb.m147494Y(str2, null));
    }

    /* JADX INFO: renamed from: N */
    public static void m134210N(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 100001) {
            o1j0.m165649w(R$string.f20948a1);
        }
        xa2.INSTANCE.m209831b("LoveBuzzManager", "switchTextBuzz error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m134211N0(haw hawVar, Act act, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "voiceBuzz";
        }
        hawVar.m134275M0(act, str, function0);
    }

    /* JADX INFO: renamed from: P */
    public static void m134213P(Throwable th) {
        xa2.INSTANCE.m209831b("LoveBuzzManager", "mediaBuzzLikePeer error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: Q */
    public static void m134214Q(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static void m134215R(String str, Function0 function0, Throwable th) {
        xa2.INSTANCE.m209830a("LoveBuzzManager", "buzzAddBonus error is " + th.getMessage());
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 100020) {
            f8w.INSTANCE.m124569e(str, "bonus_ed");
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        f8w.INSTANCE.m124569e(str, "bonus_unknown");
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m134216S(Function0 function0, LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        xa2.INSTANCE.m209830a("LoveBuzzManager", "changeMediaBuzz request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static final pf60 m134217S0(Integer num, uxj0 uxj0Var) {
        return jyb.m147494Y(uxj0Var, num);
    }

    /* JADX INFO: renamed from: T */
    public static C22421c m134218T(String str, final Integer num) {
        if (num != null && num.intValue() == 0) {
            C22421c<uxj0> c22421cM33905ap = CoreModule.f18264c.f20384f0.m33905ap(str);
            final Function1 function1 = new Function1() { // from class: l.j9w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return haw.m134221U0(num, (uxj0) obj);
                }
            };
            return c22421cM33905ap.map(new qcj() { // from class: l.k9w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return haw.m134223V0(function1, obj);
                }
            });
        }
        C22421c c22421cJust = C22421c.just(uxj0.f181467a);
        final Function1 function2 = new Function1() { // from class: l.g9w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return haw.m134217S0(num, (uxj0) obj);
            }
        };
        return c22421cJust.map(new qcj() { // from class: l.i9w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return haw.m134219T0(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static final pf60 m134219T0(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static void m134220U(Throwable th) {
    }

    /* JADX INFO: renamed from: U0 */
    public static final pf60 m134221U0(Integer num, uxj0 uxj0Var) {
        return jyb.m147494Y(uxj0Var, num);
    }

    /* JADX INFO: renamed from: V */
    public static void m134222V(haw hawVar, LoveBuzzData loveBuzzData) {
        if (loveBuzzData != null) {
            hawVar.loveBuzzStatusBs.onNext(hawVar.m134293g0(loveBuzzData));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static final pf60 m134223V0(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m134224X0(haw hawVar, Act act, Function0 function0, Function0 function1, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "voiceBuzz";
        }
        hawVar.m134281W0(act, function0, function1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m134225Y(haw hawVar, Act act, String str, String str2, Function0 function0, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "voiceBuzz";
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if ((i & 32) != 0) {
            z = true;
        }
        hawVar.m134282X(act, str, str3, function0, function2, z);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final pf60 m134226Z0(LoveBuzzEnvelope loveBuzzEnvelope, uxj0 uxj0Var) {
        return jyb.m147494Y(uxj0Var, loveBuzzEnvelope);
    }

    /* JADX INFO: renamed from: a */
    public static void m134227a(String str, haw hawVar, String str2, Function0 function0, LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        xa2.INSTANCE.m209830a("LoveBuzzManager", "buzzAddBonus request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        f8w.INSTANCE.m124569e(str, "bonus_ed");
        LoveBuzzData loveBuzzDataM134292f0 = hawVar.m134292f0(loveBuzzEnvelope != null ? loveBuzzEnvelope.data : null, str2);
        if (loveBuzzDataM134292f0 != null) {
            hawVar.loveBuzzStatusBs.onNext(loveBuzzDataM134292f0);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static final pf60 m134229a1(Function1 function1, Object obj) {
        return (pf60) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static LoveBuzzData m134230b(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m134231c(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m134232d(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 100001) {
            o1j0.m165649w(R$string.f20948a1);
        }
        xa2.INSTANCE.m209831b("LoveBuzzManager", "switchMediaBuzz error is " + th.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m134233d0(haw hawVar, Act act, String str, String str2, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        hawVar.m134287c0(act, str, str2, function0, function1);
    }

    /* JADX INFO: renamed from: e */
    public static void m134234e(String str, long j, Integer num) {
        if (Intrinsics.m88377d(str, "voiceBuzz")) {
            nbw.INSTANCE.m162232b0(pzi0.m174454o() - j, j);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m134235f(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            xa2.INSTANCE.m209831b("LoveBuzzManager", "extendLoveBuzzTime error is " + coreService.code);
            if (coreService.code == 100004) {
                CoreModule.f18264c.f20319J1.m35568c6();
            }
        }
        CoreModule.f18264c.f20319J1.m35582u5().onNext(Boolean.FALSE);
        xa2.INSTANCE.m209830a("LoveBuzzManager", "extendLoveBuzzTime error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m134236f1(haw hawVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        hawVar.m134291e1(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m134237g(Function1 function1, Throwable th) {
        int i = th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).code : -1;
        xa2.INSTANCE.m209830a("LoveBuzzManager", "acceptMediaBuzz error is " + th.getMessage() + " code is " + i);
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m134238h(haw hawVar, LoveBuzzData loveBuzzData) {
        if (loveBuzzData != null) {
            hawVar.loveBuzzStatusBs.onNext(hawVar.m134293g0(loveBuzzData));
        }
    }

    /* JADX INFO: renamed from: i */
    public static Unit m134239i(boolean z, Act act, Function0 function0) {
        if (z) {
            act.startActivity(VideoBuzzAct.INSTANCE.m48255a(act, "search_video"));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m134240i0(haw hawVar, Act act, String str, String str2, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "voiceBuzz";
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            function1 = null;
        }
        hawVar.m134295h0(act, str, str3, function0, function1);
    }

    /* JADX INFO: renamed from: j */
    public static void m134241j(Function0 function0, boolean z, Act act, String str, Function0 function1, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            xa2.INSTANCE.m209830a("LoveBuzzManager", "acceptLoveBuzz error is " + coreService.code);
            int i = coreService.code;
            if (i == 100002 || i == 100003) {
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            } else if (i == 100005 && z && k8w.INSTANCE.m148752a(act)) {
                d8w.INSTANCE.m114968N(act, "textBuzz", str, null);
            }
        }
        xa2.INSTANCE.m209830a("LoveBuzzManager", "acceptLoveBuzz error is " + th.getMessage());
        if (function1 != null) {
            function1.invoke();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ boolean m134243k0(haw hawVar, Act act, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hawVar.m134298j0(act, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static void m134244l(Act act, int i, pf60 pf60Var) {
        Integer num = (Integer) pf60Var.f152157b;
        boolean z = false;
        if (num != null && num.intValue() == 0) {
            i8w i8wVar = i8w.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = act.getResources().getString(R$string.f20997t0);
            string.getClass();
            i8wVar.m139036h(act, String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(C15274a.m88486b(i - 1, 0))}, 1)), Integer.valueOf(ebc0.f92861T));
            CoreModule.f18264c.f20319J1.m35568c6();
        }
        xa2.INSTANCE.m209830a("LoveBuzzManager", "extendLoveBuzzTime request code is " + num);
        C22508b<Boolean> c22508bM35582u5 = CoreModule.f18264c.f20319J1.m35582u5();
        if (num != null && num.intValue() == 0) {
            z = true;
        }
        c22508bM35582u5.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m134245l1(haw hawVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "videoBuzz";
        }
        hawVar.m134300k1(str, str2);
    }

    /* JADX INFO: renamed from: m */
    public static void m134246m(haw hawVar, LoveBuzzData loveBuzzData) {
        if (loveBuzzData != null) {
            hawVar.loveBuzzStatusBs.onNext(loveBuzzData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ boolean m134247m0(haw hawVar, String str, Act act, boolean z, String str2, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        return hawVar.m134301l0(str, act, z, str2, function0, function1);
    }

    /* JADX INFO: renamed from: n */
    public static C22421c m134248n(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static C22421c m134249o(String str, final LoveBuzzEnvelope loveBuzzEnvelope) {
        C22421c<uxj0> c22421cM33905ap = CoreModule.f18264c.f20384f0.m33905ap(str);
        final Function1 function1 = new Function1() { // from class: l.n9w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return haw.m134226Z0(loveBuzzEnvelope, (uxj0) obj);
            }
        };
        return c22421cM33905ap.map(new qcj() { // from class: l.o9w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return haw.m134229a1(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static void m134250p(haw hawVar, String str, LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        xa2.INSTANCE.m209830a("LoveBuzzManager", "buzzAddBonusNoResult request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        LoveBuzzData loveBuzzDataM134292f0 = hawVar.m134292f0(loveBuzzEnvelope != null ? loveBuzzEnvelope.data : null, str);
        if (loveBuzzDataM134292f0 != null) {
            hawVar.loveBuzzStatusBs.onNext(loveBuzzDataM134292f0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m134251p0(haw hawVar, String str, Act act, Function0 function0, Function0 function1, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function0 function2 = function1;
        if ((i & 16) != 0) {
            z = true;
        }
        hawVar.m134305o0(str, act, function0, function2, z);
    }

    /* JADX INFO: renamed from: q */
    public static void m134252q(boolean z, Act act, String str, Function0 function0, LoveBuzzEnvelope loveBuzzEnvelope) {
        Intent intentM48197b;
        Meta meta;
        xa2.INSTANCE.m209830a("LoveBuzzManager", "acceptMediaBuzz request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        if (z) {
            if (Intrinsics.m88377d(str, "videoBuzz")) {
                intentM48197b = VideoBuzzAct.INSTANCE.m48256b(act, "search_video", "passive");
            } else {
                intentM48197b = Intrinsics.m88377d(str, "memojiBuzz") ? MemojiBuzzAct.INSTANCE.m48197b(act, "search_memoji", "passive") : VoiceBuzzAct.INSTANCE.m48266b(act, "search_voice", "passive");
            }
            act.startActivity(intentM48197b);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: r */
    public static Unit m134253r(boolean z, Act act, Function0 function0) {
        if (z) {
            act.startActivity(VoiceBuzzAct.INSTANCE.m48265a(act, "search_voice"));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m134254r0(haw hawVar, Act act, String str, LoveBuzzPushData loveBuzzPushData, String str2, Function0 function0, Function0 function1, Function0 function2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        hawVar.m134308q0(act, str, loveBuzzPushData, str2, function0, function1, function2, (i & 128) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: s */
    public static void m134255s(Function0 function0, Throwable th) {
        xa2.INSTANCE.m209831b("LoveBuzzManager", "enterLoveBuzz error is " + th.getMessage());
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m134256t(Function0 function0, Throwable th) {
        xa2.INSTANCE.m209830a("LoveBuzzManager", "changeMediaBuzz error is " + th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 100019) {
                o1j0.m165649w(R$string.f21003w0);
            } else if (i == 100018) {
                o1j0.m165649w(R$string.f21001v0);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: u */
    public static Unit m134257u(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static void m134258v(haw hawVar, String str, String str2, Act act, Function0 function0, pf60 pf60Var) {
        LoveBuzzEnvelope loveBuzzEnvelope;
        Meta meta;
        xa2.INSTANCE.m209830a("LoveBuzzManager", "acceptLoveBuzz request code is " + ((pf60Var == null || (loveBuzzEnvelope = (LoveBuzzEnvelope) pf60Var.f152157b) == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        hawVar.m134296h1(str, str2);
        act.startActivity(CoreModule.f18273l.m143405a().mo34449Xr(act, str));
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: x */
    public static C22421c m134260x(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static Unit m134261y(haw hawVar, Act act, String str, String str2, String str3, Function0 function0, Function0 function1, boolean z) {
        hawVar.m134283Y0(act, str, str2, str3, function0, function1, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static Unit m134262z(boolean z, Act act, Function0 function0) {
        if (z) {
            act.startActivity(MemojiBuzzAct.INSTANCE.m48196a(act, "search_memoji"));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final C22507a<LoveBuzzData> m134263A0() {
        return this.loveBuzzStatusBs;
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public final eqx m134264B0() {
        if (this.mediaBuzzCallData == null) {
            this.mediaBuzzCallData = new eqx();
        }
        eqx eqxVar = this.mediaBuzzCallData;
        eqxVar.getClass();
        return eqxVar;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m134265C0() {
        Integer num = new vxd0("media_buzz_init_fail_count_" + CoreModule.m30929H().userId(), 0).get();
        num.getClass();
        return num.intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public final C22508b<pf60<String, Object>> m134266D0() {
        return this.mediaBuzzNotifyPS;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m134267E0(@NotNull String type) {
        type.getClass();
        Boolean bool = new jxd0("media_buzz_notify_shown_" + type + "_" + CoreModule.m30929H().userId(), Boolean.FALSE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public final String m134268F0(@Nullable String token) {
        fqx fqxVar;
        return (TextUtils.isEmpty(token) || (fqxVar = this.mediaBuzzPair) == null || !Intrinsics.m88377d(fqxVar.getChannelToken(), token)) ? "" : fqxVar.getReact();
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public final C22507a<pf60<String, Object>> m134269G0() {
        return this.mediaBuzzShowPopBS;
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public final C22507a<String> m134270H0() {
        return this.mediaBuzzWarnBS;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m134271I0(boolean shown) {
        CoreModule.f18264c.f20319J1.getLoveBuzzNotifyShown().put(Boolean.valueOf(shown));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m134272J0(int mcc) {
        CoreModule.f18264c.f20319J1.m35586x5(mcc);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m134273K0(@NotNull String type, boolean noFace, boolean noVocal, int errorCode) {
        type.getClass();
        String channelToken = m134264B0().getChannelToken();
        if (channelToken != null) {
            CoreModule.f18264c.f20319J1.m35587y5(channelToken, type, noFace, noVocal, errorCode);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m134274L0() {
        Boolean bool = CoreModule.f18264c.f20319J1.getLoveBuzzNotifyShown().get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m134275M0(@Nullable Act act, @NotNull final String type, @Nullable final Function0<Unit> success) {
        type.getClass();
        if (k8w.INSTANCE.m148752a(act)) {
            String channelToken = m134264B0().getChannelToken();
            if (TextUtils.isEmpty(channelToken) || act == null) {
                return;
            }
            C4903r c4903r = CoreModule.f18264c.f20319J1;
            channelToken.getClass();
            C22421c c22421cDuringCreated = act.duringCreated(c4903r.m35553G5(channelToken, type));
            if (c22421cDuringCreated != null) {
                c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.t9w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134209M(success, this, type, (LoveBuzzData) obj);
                    }
                }, new y20() { // from class: l.u9w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134213P((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m134276O0() {
        if (c69.m108119e()) {
            this.loveBuzzShowPopBS.onNext(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
            this.mediaBuzzShowPopBS.onNext(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
            this.buzzActive.set(-1);
            this.mediaBuzzWarnBS.onNext("");
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m134277P0(final Act act, String token, final String otherId, final Function0<Unit> success, final Function0<Unit> fail) {
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (k8w.INSTANCE.m148752a(act)) {
            act.duringCreated(CoreModule.f18264c.f20384f0.m33905ap(otherId)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.n8w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134207K(act, otherId, success, (uxj0) obj);
                }
            }, new y20() { // from class: l.o8w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134255s(fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m134278Q0() {
        if (c69.m108119e()) {
            if (c69.m108121g() || c69.m108120f()) {
                BuzzMediaCallManager.INSTANCE.m48168s();
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m134279R0(@NotNull final Act act, @NotNull final String otherId) {
        act.getClass();
        otherId.getClass();
        if (k8w.INSTANCE.m148752a(act)) {
            if (!Network.isConnected(act)) {
                o1j0.m165640n(R$string.f20949b);
                return;
            }
            final int iM143908f = j8w.INSTANCE.m143908f();
            if (iM143908f > 0) {
                nbw.INSTANCE.m162245l0("success");
                C22421c<Integer> c22421cM35561S5 = CoreModule.f18264c.f20319J1.m35561S5(otherId);
                final Function1 function1 = new Function1() { // from class: l.v8w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return haw.m134218T(otherId, (Integer) obj);
                    }
                };
                act.duringCreated((C22421c) c22421cM35561S5.flatMap(new qcj() { // from class: l.x8w
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return haw.m134260x(function1, obj);
                    }
                })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.y8w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134244l(act, iM143908f, (pf60) obj);
                    }
                }, new y20() { // from class: l.z8w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134235f((Throwable) obj);
                    }
                }));
                return;
            }
            if (joa.m146386f4()) {
                nbw.INSTANCE.m162245l0("no_svip");
                CoreModule.f18273l.m143405a().mo34575qm(act, "p_chat_view,e_intl_buzz_add_time,click", Privilege.loveBuzz, null);
            } else {
                nbw.INSTANCE.m162245l0("used_up");
                i8w.m139030i(i8w.INSTANCE, act, act.getResources().getString(R$string.f20961f), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m134280W(@NotNull final Act act, @Nullable final String token, @NotNull final String otherId, @Nullable final String from, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail, @Nullable Function0<Unit> filter, final boolean popBusiness) {
        act.getClass();
        otherId.getClass();
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (!k8w.INSTANCE.m148752a(act)) {
            if (fail != null) {
                fail.invoke();
            }
        } else {
            if (!popBusiness || j8w.INSTANCE.m143907e() != 0) {
                m134283Y0(act, token, otherId, from, success, fail, popBusiness);
                return;
            }
            d8w.INSTANCE.m114968N(act, "textBuzz", from, new Function0() { // from class: l.daw
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return haw.m134261y(this.f85931a, act, token, otherId, from, success, fail, popBusiness);
                }
            });
            if (filter != null) {
                filter.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m134281W0(@Nullable Act act, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail, @NotNull final String type) {
        type.getClass();
        if (!k8w.INSTANCE.m148752a(act)) {
            if (fail != null) {
                fail.invoke();
                return;
            }
            return;
        }
        String channelToken = m134264B0().getChannelToken();
        if (TextUtils.isEmpty(channelToken)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (act != null) {
            C4903r c4903r = CoreModule.f18264c.f20319J1;
            channelToken.getClass();
            C22421c c22421cDuringCreated = act.duringCreated(c4903r.m35565W5(channelToken, type));
            if (c22421cDuringCreated != null) {
                c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.l9w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134200D(success, this, type, (LoveBuzzData) obj);
                    }
                }, new y20() { // from class: l.m9w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134205I(fail, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m134282X(@NotNull final Act act, @Nullable String token, @NotNull final String type, @Nullable final Function0<Unit> success, @Nullable final Function1<? super Integer, Unit> fail, final boolean enter) {
        act.getClass();
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke(-1);
            }
        } else if (k8w.INSTANCE.m148752a(act)) {
            C4903r c4903r = CoreModule.f18264c.f20319J1;
            token.getClass();
            act.duringCreated(c4903r.m35557O4(token, type)).subscribe(psd0.m173597H(new y20() { // from class: l.baw
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134252q(enter, act, type, success, (LoveBuzzEnvelope) obj);
                }
            }, new y20() { // from class: l.caw
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134237g(fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke(-1);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m134283Y0(final Act act, final String token, final String otherId, final String from, final Function0<Unit> success, final Function0<Unit> fail, final boolean popBusiness) {
        if (k8w.INSTANCE.m148752a(act)) {
            C22421c c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20319J1.m35559Q4(token));
            final Function1 function1 = new Function1() { // from class: l.c9w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return haw.m134249o(otherId, (LoveBuzzEnvelope) obj);
                }
            };
            c22421cDuringCreated.flatMap(new qcj() { // from class: l.d9w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return haw.m134248n(function1, obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.e9w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134258v(this.f92699a, otherId, token, act, success, (pf60) obj);
                }
            }, new y20() { // from class: l.f9w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134241j(success, popBusiness, act, from, fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m134284Z(@Nullable String token, @NotNull String type) {
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            return;
        }
        C4903r c4903r = CoreModule.f18264c.f20319J1;
        token.getClass();
        c4903r.m35557O4(token, type);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m134285b0() {
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("LoveBuzzManager", "afterSignIn");
        this.buzzActive.set(-1);
        if (!c69.m108119e()) {
            xa2Var.m209830a("LoveBuzzManager", "afterSignIn, love buzz not active");
            return;
        }
        BuzzMediaCallManager.INSTANCE.m48130K();
        ebw ebwVar = ebw.INSTANCE;
        ebwVar.m120281c();
        ebwVar.m120280b();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m134286b1(@NotNull String token, @NotNull String react) {
        token.getClass();
        react.getClass();
        xa2.INSTANCE.m209830a("LoveBuzzManager", "recordMediaResp token " + token + " react " + react + " mediaBuzzPair " + this.mediaBuzzPair);
        if (!Intrinsics.m88377d(react, "invited")) {
            fqx fqxVar = this.mediaBuzzPair;
            if (!Intrinsics.m88377d(fqxVar != null ? fqxVar.getChannelToken() : null, token)) {
                return;
            }
        }
        if (this.mediaBuzzPair == null) {
            this.mediaBuzzPair = new fqx();
        }
        int iHashCode = react.hashCode();
        if (iHashCode != -2146525273) {
            if (iHashCode != -608496514) {
                if (iHashCode == 1960030843 && react.equals("invited")) {
                    fqx fqxVar2 = this.mediaBuzzPair;
                    if (fqxVar2 != null) {
                        fqxVar2.m126817c(token);
                    }
                    fqx fqxVar3 = this.mediaBuzzPair;
                    if (fqxVar3 != null) {
                        fqxVar3.m126818d(react);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!react.equals("rejected")) {
                return;
            }
        } else if (!react.equals("accepted")) {
            return;
        }
        fqx fqxVar4 = this.mediaBuzzPair;
        if (fqxVar4 != null) {
            fqxVar4.m126818d(react);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m134287c0(@Nullable Act act, @Nullable final String bonusId, @NotNull final String type, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail) {
        type.getClass();
        if (!k8w.INSTANCE.m148752a(act)) {
            xa2.INSTANCE.m209830a("LoveBuzzManager", "buzzAddBonus, act not valid");
            if (fail != null) {
                fail.invoke();
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(bonusId)) {
            xa2.INSTANCE.m209830a("LoveBuzzManager", "buzzAddBonus, want bonus but bonusId is empty");
            if (fail != null) {
                fail.invoke();
                return;
            }
            return;
        }
        f8w.INSTANCE.m124569e(bonusId, "bonus_ing");
        if (act != null) {
            C4903r c4903r = CoreModule.f18264c.f20319J1;
            bonusId.getClass();
            C22421c c22421cDuringCreated = act.duringCreated(c4903r.m35564V4(bonusId, type));
            if (c22421cDuringCreated != null) {
                c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.p9w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134227a(bonusId, this, type, success, (LoveBuzzEnvelope) obj);
                    }
                }, new y20() { // from class: l.q9w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134215R(bonusId, fail, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m134288c1(@Nullable String token) {
        if (TextUtils.isEmpty(token)) {
            return;
        }
        CoreModule.f18264c.f20319J1.m35571f6(token);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m134289d1(@Nullable String token, @NotNull String type) {
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            return;
        }
        C4903r c4903r = CoreModule.f18264c.f20319J1;
        token.getClass();
        c4903r.m35569d6(token, type);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m134290e0(@Nullable String bonusId, @NotNull final String type) {
        type.getClass();
        if (TextUtils.isEmpty(bonusId)) {
            xa2.INSTANCE.m209830a("LoveBuzzManager", "buzzAddBonusNoResult, want bonus but bonusId is empty");
            return;
        }
        f8w.INSTANCE.m124569e(bonusId, "bonus_ed");
        C4903r c4903r = CoreModule.f18264c.f20319J1;
        bonusId.getClass();
        C22421c<LoveBuzzEnvelope> c22421cM35564V4 = c4903r.m35564V4(bonusId, type);
        if (c22421cM35564V4 != null) {
            c22421cM35564V4.subscribe(psd0.m173597H(new y20() { // from class: l.a9w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134250p(this.f69080a, type, (LoveBuzzEnvelope) obj);
                }
            }, new y20() { // from class: l.b9w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134214Q((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m134291e1(@NotNull String type) {
        type.getClass();
        String channelToken = m134264B0().getChannelToken();
        if (channelToken != null) {
            CoreModule.f18264c.f20319J1.m35577n6(channelToken, type);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f0 */
    public final LoveBuzzData m134292f0(LoveBuzzData data, String type) {
        if (data == null) {
            return null;
        }
        LoveBuzzData loveBuzzDataM134315v0 = m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            switch (type) {
                case "voiceBuzz":
                    loveBuzzDataM134315v0.remainingVoiceBuzz = data.remainingVoiceBuzz;
                    loveBuzzDataM134315v0.remainingBonus.voiceBuzz = data.remainingBonus.voiceBuzz;
                    xa2.INSTANCE.m209830a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM134315v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                case "textBuzz":
                    loveBuzzDataM134315v0.remainingTextBuzz = data.remainingTextBuzz;
                    loveBuzzDataM134315v0.remainingBonus.textBuzz = data.remainingBonus.textBuzz;
                    xa2.INSTANCE.m209830a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM134315v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                case "videoBuzz":
                    loveBuzzDataM134315v0.remainingVideoBuzz = data.remainingVideoBuzz;
                    loveBuzzDataM134315v0.remainingBonus.videoBuzz = data.remainingBonus.videoBuzz;
                    xa2.INSTANCE.m209830a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM134315v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                case "memojiBuzz":
                    loveBuzzDataM134315v0.remainingMemojiBuzz = data.remainingMemojiBuzz;
                    loveBuzzDataM134315v0.remainingBonus.memojiBuzz = data.remainingBonus.memojiBuzz;
                    xa2.INSTANCE.m209830a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM134315v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                default:
                    if (type.equals("voiceBuzz")) {
                        loveBuzzDataM134315v0.remainingVoiceBuzz = data.remainingVoiceBuzz;
                        loveBuzzDataM134315v0.remainingBonus.voiceBuzz = data.remainingBonus.voiceBuzz;
                        xa2.INSTANCE.m209830a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM134315v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        break;
                    }
                    return null;
            }
        }
        return m134315v0();
    }

    /* JADX INFO: renamed from: g0 */
    public final LoveBuzzData m134293g0(LoveBuzzData data) {
        LoveBuzzData loveBuzzDataM134315v0 = m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            loveBuzzDataM134315v0.textBuzzToggle = data.textBuzzToggle;
            loveBuzzDataM134315v0.voiceBuzzToggle = data.voiceBuzzToggle;
            loveBuzzDataM134315v0.videoBuzzToggle = data.videoBuzzToggle;
            loveBuzzDataM134315v0.memojiBuzzToggle = data.memojiBuzzToggle;
        }
        return m134315v0();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m134294g1(@NotNull final String type) {
        type.getClass();
        final long jM174454o = pzi0.m174454o();
        if (Intrinsics.m88377d(type, "voiceBuzz")) {
            nbw.INSTANCE.m162233c0(jM174454o);
        }
        CoreModule.f18264c.f20319J1.m35579r6(type).subscribe(psd0.m173597H(new y20() { // from class: l.w8w
            @Override // p153l.y20
            public final void call(Object obj) {
                haw.m134234e(type, jM174454o, (Integer) obj);
            }
        }, new y20() { // from class: l.h9w
            @Override // p153l.y20
            public final void call(Object obj) {
                haw.m134220U((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m134295h0(@NotNull Act act, @Nullable String token, @NotNull String type, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail) {
        act.getClass();
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (k8w.INSTANCE.m148752a(act)) {
            C4903r c4903r = CoreModule.f18264c.f20319J1;
            token.getClass();
            act.duringCreated(c4903r.m35569d6(token, type)).subscribe(psd0.m173597H(new y20() { // from class: l.t8w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134216S(success, (LoveBuzzEnvelope) obj);
                }
            }, new y20() { // from class: l.u8w
                @Override // p153l.y20
                public final void call(Object obj) {
                    haw.m134256t(fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m134296h1(String cid, String token) {
        if (token != null) {
            CoreModule.f18264c.f20319J1.m35584v6(cid, token);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m134297i1(int count) {
        new vxd0("media_buzz_init_fail_count_" + CoreModule.m30929H().userId(), 0).put(Integer.valueOf(count));
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m134298j0(@NotNull Act act, boolean showPop) {
        act.getClass();
        if (!IntlCountryCodeController.m29117n() || CoreModule.f18273l.m143405a().mo180339J()) {
            return false;
        }
        if (!showPop) {
            return true;
        }
        CoreModule.f18273l.m143405a().showProofAgeDlg(act, "buzz_enter");
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m134299j1(@NotNull String type) {
        type.getClass();
        new jxd0("media_buzz_notify_shown_" + type + "_" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m134300k1(@NotNull String scene, @NotNull String type) {
        scene.getClass();
        type.getClass();
        eqx eqxVarM134264B0 = m134264B0();
        String channelToken = eqxVarM134264B0.getChannelToken();
        if (channelToken != null) {
            CoreModule.f18264c.f20319J1.m35585w6(channelToken, scene, (int) (pzi0.m174454o() - eqxVarM134264B0.getStartTime()), type);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0127  */
    /* JADX INFO: renamed from: l0 */
    public final boolean m134301l0(@NotNull String type, @NotNull Act act, boolean rateLimit, @Nullable String from, @Nullable Function0<Unit> noCount, @Nullable Function0<Unit> coinBuySuc) {
        Integer numValueOf;
        LoveBuzzData loveBuzzDataM134315v0;
        RateLimited rateLimited;
        RateLimited rateLimited2;
        RateLimited rateLimited3;
        RateLimited rateLimited4;
        type.getClass();
        act.getClass();
        boolean zM88377d = Intrinsics.m88377d(type, "textBuzz");
        Boolean boolValueOf = null;
        if (!zM88377d && m134243k0(this, act, false, 2, null)) {
            return false;
        }
        if (!zM88377d && BuzzMediaCallManager.INSTANCE.m48134P()) {
            o1j0.m165649w(R$string.f20907G0);
            return false;
        }
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    LoveBuzzData loveBuzzDataM134315v1 = INSTANCE.m134320a().m134315v0();
                    if (loveBuzzDataM134315v1 != null) {
                        numValueOf = Integer.valueOf(loveBuzzDataM134315v1.remainingMemojiBuzz);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    loveBuzzDataM134315v0 = INSTANCE.m134320a().m134315v0();
                    if (loveBuzzDataM134315v0 != null) {
                        numValueOf = Integer.valueOf(loveBuzzDataM134315v0.remainingTextBuzz);
                    } else {
                        numValueOf = null;
                    }
                }
            } else if (type.equals("videoBuzz")) {
                LoveBuzzData loveBuzzDataM134315v2 = INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v2 != null) {
                    numValueOf = Integer.valueOf(loveBuzzDataM134315v2.remainingVideoBuzz);
                } else {
                    numValueOf = null;
                }
            } else {
                loveBuzzDataM134315v0 = INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v0 != null) {
                    numValueOf = Integer.valueOf(loveBuzzDataM134315v0.remainingTextBuzz);
                } else {
                    numValueOf = null;
                }
            }
        } else if (type.equals("voiceBuzz")) {
            LoveBuzzData loveBuzzDataM134315v3 = INSTANCE.m134320a().m134315v0();
            if (loveBuzzDataM134315v3 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM134315v3.remainingVoiceBuzz);
            } else {
                numValueOf = null;
            }
        } else {
            loveBuzzDataM134315v0 = INSTANCE.m134320a().m134315v0();
            if (loveBuzzDataM134315v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM134315v0.remainingTextBuzz);
            } else {
                numValueOf = null;
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (iIntValue <= 0 && iIntValue != -1) {
            d8w.INSTANCE.m114968N(act, type, from, coinBuySuc);
            if (noCount != null) {
                noCount.invoke();
            }
            return false;
        }
        if (!rateLimit) {
            return true;
        }
        switch (type) {
            case "voiceBuzz":
                LoveBuzzData loveBuzzDataM134315v4 = INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v4 != null && (rateLimited = loveBuzzDataM134315v4.rateLimited) != null) {
                    boolValueOf = Boolean.valueOf(rateLimited.voiceBuzz);
                }
                break;
            case "textBuzz":
                LoveBuzzData loveBuzzDataM134315v5 = INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v5 != null && (rateLimited2 = loveBuzzDataM134315v5.rateLimited) != null) {
                    boolValueOf = Boolean.valueOf(rateLimited2.textBuzz);
                }
                break;
            case "videoBuzz":
                LoveBuzzData loveBuzzDataM134315v6 = INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v6 != null && (rateLimited3 = loveBuzzDataM134315v6.rateLimited) != null) {
                    boolValueOf = Boolean.valueOf(rateLimited3.videoBuzz);
                }
                break;
            case "memojiBuzz":
                LoveBuzzData loveBuzzDataM134315v7 = INSTANCE.m134320a().m134315v0();
                if (loveBuzzDataM134315v7 != null && (rateLimited4 = loveBuzzDataM134315v7.rateLimited) != null) {
                    boolValueOf = Boolean.valueOf(rateLimited4.memojiBuzz);
                }
                break;
            default:
                boolValueOf = Boolean.FALSE;
                break;
        }
        if (!(boolValueOf != null ? boolValueOf.booleanValue() : false)) {
            return true;
        }
        xa2.INSTANCE.m209830a("LoveBuzzManager", "showRateLimitedDlg ");
        d8w.INSTANCE.m114974W(act, new Function0() { // from class: l.r9w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return haw.m134197A();
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m134302m1() {
        CoreModule.f18264c.f20319J1.m35550A6();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m134303n0() {
        eqx eqxVar = this.mediaBuzzCallData;
        if (eqxVar != null) {
            eqxVar.m122084m();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m134304n1(@NotNull String type) {
        type.getClass();
        CoreModule.f18264c.f20319J1.m35552E6(type);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o0 */
    public final void m134305o0(@NotNull String type, @NotNull final Act act, @NotNull final Function0<Unit> jump, @Nullable final Function0<Unit> fail, final boolean direct) {
        type.getClass();
        act.getClass();
        jump.getClass();
        switch (type.hashCode()) {
            case -1019560155:
                if (type.equals("voiceBuzz")) {
                    BuzzMediaCallManager.INSTANCE.m48166q0(act, new Function0() { // from class: l.z9w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return haw.m134253r(direct, act, jump);
                        }
                    }, new Function0() { // from class: l.aaw
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return haw.m134231c(fail);
                        }
                    });
                    return;
                }
                break;
            case -1004163680:
                if (type.equals("textBuzz")) {
                    if (direct) {
                        act.startActivity(TextBuzzAct.INSTANCE.m48248a(act));
                    }
                    jump.invoke();
                    return;
                }
                break;
            case 1332422126:
                if (type.equals("videoBuzz")) {
                    BuzzMediaCallManager.INSTANCE.m48164p0(act, new Function0() { // from class: l.v9w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return haw.m134239i(direct, act, jump);
                        }
                    }, new Function0() { // from class: l.w9w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return haw.m134202F(fail);
                        }
                    });
                    return;
                }
                break;
            case 1740758636:
                if (type.equals("memojiBuzz")) {
                    BuzzMediaCallManager.INSTANCE.m48142X(act, new Function0() { // from class: l.x9w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return haw.m134262z(direct, act, jump);
                        }
                    }, new Function0() { // from class: l.y9w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return haw.m134257u(fail);
                        }
                    });
                    return;
                }
                break;
        }
        if (fail != null) {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m134306o1() {
        CoreModule.f18264c.f20319J1.m35554I6();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m134307p1(boolean open, @NotNull String type) {
        type.getClass();
        CoreModule.f18264c.f20319J1.m35556M6(open, type).subscribe(psd0.m173597H(new y20() { // from class: l.p8w
            @Override // p153l.y20
            public final void call(Object obj) {
                haw.m134222V(this.f151064a, (LoveBuzzData) obj);
            }
        }, new y20() { // from class: l.q8w
            @Override // p153l.y20
            public final void call(Object obj) {
                haw.m134232d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m134308q0(@NotNull Act act, @Nullable String token, @Nullable LoveBuzzPushData data, @Nullable String from, @Nullable Function0<Unit> success, @Nullable Function0<Unit> fail, @Nullable Function0<Unit> filter, boolean popBusiness) {
        act.getClass();
        if (data == null) {
            if (fail != null) {
                fail.invoke();
                return;
            }
            return;
        }
        if (!Network.isConnected(act)) {
            if (fail != null) {
                fail.invoke();
            }
            o1j0.m165640n(R$string.f20949b);
        } else if (Intrinsics.m88377d("intl.lovebuzz.invite", data.buzzIntent)) {
            String str = data.userId;
            str.getClass();
            m134280W(act, token, str, from, success, fail, filter, popBusiness);
        } else if (Intrinsics.m88377d("intl.lovebuzz.match", data.buzzIntent)) {
            String str2 = data.userId;
            str2.getClass();
            m134277P0(act, token, str2, success, fail);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m134309q1(boolean open) {
        (open ? CoreModule.f18264c.f20319J1.m35555K5() : CoreModule.f18264c.f20319J1.m35567b5()).subscribe(psd0.m173597H(new y20() { // from class: l.r8w
            @Override // p153l.y20
            public final void call(Object obj) {
                haw.m134238h(this.f161770a, (LoveBuzzData) obj);
            }
        }, new y20() { // from class: l.s8w
            @Override // p153l.y20
            public final void call(Object obj) {
                haw.m134210N((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public final void m134310r1() {
        if (!this.enterMediaBuzzPool.get()) {
            xa2.INSTANCE.m209830a("LoveBuzzManager", "tryOutMediaBuzzPool, but no had enter pool");
            return;
        }
        LoveBuzzData loveBuzzDataM134315v0 = m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            if (!loveBuzzDataM134315v0.videoBuzzToggle && !loveBuzzDataM134315v0.voiceBuzzToggle && !loveBuzzDataM134315v0.memojiBuzzToggle) {
                xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive, media buzz not toggle");
                return;
            }
            xa2.INSTANCE.m209830a("LoveBuzzManager", "outMediaBuzzPool");
            this.enterMediaBuzzPool.set(false);
            CoreModule.f18264c.f20319J1.m35558O5(loveBuzzDataM134315v0.voiceBuzzToggle, loveBuzzDataM134315v0.videoBuzzToggle, loveBuzzDataM134315v0.memojiBuzzToggle);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m134311s0(@NotNull String type) {
        type.getClass();
        String channelToken = m134264B0().getChannelToken();
        if (channelToken != null) {
            CoreModule.f18264c.f20319J1.m35573i5(channelToken, type);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m134312s1() {
        LoveBuzzData loveBuzzDataM134315v0 = m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            if (!loveBuzzDataM134315v0.videoBuzzToggle && !loveBuzzDataM134315v0.voiceBuzzToggle && !loveBuzzDataM134315v0.memojiBuzzToggle) {
                xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive, media buzz not toggle");
                return;
            }
            if (loveBuzzDataM134315v0.remainingVideoBuzz == 0 && loveBuzzDataM134315v0.remainingVoiceBuzz == 0 && loveBuzzDataM134315v0.remainingMemojiBuzz == 0 && !j8w.m143903b(j8w.INSTANCE, null, 1, null)) {
                xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive, remain count is 0");
                return;
            }
            boolean z = false;
            if (!BuzzMediaCallManager.INSTANCE.m48160n(false)) {
                xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive, checkMediaCanStart false");
                return;
            }
            String[] strArr = wzx.m208784k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
            if (!PermissionHelper.m81064b((String[]) Arrays.copyOf(strArr, strArr.length))) {
                xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive, check basic permission is false");
                return;
            }
            boolean zM81064b = PermissionHelper.m81064b("android.permission.CAMERA");
            if (!zM81064b && !loveBuzzDataM134315v0.voiceBuzzToggle) {
                xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive, camera not had permission and voice not toggle");
                return;
            }
            boolean zM131201e = gp3.INSTANCE.m131201e();
            if (!loveBuzzDataM134315v0.voiceBuzzToggle && !zM131201e) {
                xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive, liveSDKLoad not load and just memoji open ");
                return;
            }
            xa2.INSTANCE.m209830a("LoveBuzzManager", "tryReportBuzzPassive,reportBuzzPassive liveSDKLoad " + zM131201e);
            this.enterMediaBuzzPool.set(true);
            C4903r c4903r = CoreModule.f18264c.f20319J1;
            boolean z2 = loveBuzzDataM134315v0.voiceBuzzToggle;
            boolean z3 = (zM81064b && zM131201e) ? loveBuzzDataM134315v0.videoBuzzToggle : false;
            if (zM81064b && zM131201e) {
                z = loveBuzzDataM134315v0.memojiBuzzToggle;
            }
            c4903r.m35574j6(z2, z3, z);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m134313t0() {
        Objects.toString(this.buzzActive);
        if (this.buzzActive.get() != -1) {
            return this.buzzActive.get() == 1;
        }
        String strM80485F = RemoteConfig.m80481x().m80485F("intl_buzz_switch");
        strM80485F.getClass();
        if (TextUtils.isEmpty(strM80485F)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM80485F);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mcc");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (TextUtils.equals(jSONArrayOptJSONArray.optString(i), String.valueOf(uqb0.f180400f0))) {
                        this.buzzActive.set(1);
                        break;
                    }
                }
            }
            if (this.buzzActive.get() == 1) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("regionTag");
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    if (TextUtils.equals(jSONArrayOptJSONArray2.optString(i2), String.valueOf(uqb0.f180402h0))) {
                        this.buzzActive.set(1);
                        break;
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (this.buzzActive.get() != 1) {
            this.buzzActive.set(0);
        }
        return this.buzzActive.get() == 1;
    }

    /* JADX INFO: renamed from: u0 */
    public final int m134314u0() {
        LoveBuzzData loveBuzzDataM134315v0;
        int iM35575m5 = CoreModule.f18264c.f20319J1.m35575m5();
        if (iM35575m5 <= 0 || (loveBuzzDataM134315v0 = m134315v0()) == null || loveBuzzDataM134315v0.allowedMCCSwitchList.contains(Integer.valueOf(iM35575m5))) {
            return iM35575m5;
        }
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public final LoveBuzzData m134315v0() {
        return this.loveBuzzStatusBs.m222761e();
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m134316w0() {
        LoveBuzzData loveBuzzDataM134315v0 = m134315v0();
        if (loveBuzzDataM134315v0 != null) {
            return loveBuzzDataM134315v0.textBuzzToggle;
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m134317x0(@Nullable Act act) {
        Object map;
        if (k8w.INSTANCE.m148752a(act) && act != null) {
            C22421c<LoveBuzzData> c22421cM35576n5 = CoreModule.f18264c.f20319J1.m35576n5(m134318y0());
            if (c22421cM35576n5 != null) {
                final Function1 function1 = new Function1() { // from class: l.eaw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return haw.m134198B((LoveBuzzData) obj);
                    }
                };
                map = c22421cM35576n5.map(new qcj() { // from class: l.faw
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return haw.m134230b(function1, obj);
                    }
                });
            } else {
                map = null;
            }
            C22421c c22421cDuringCreated = act.duringCreated((C22421c) map);
            if (c22421cDuringCreated != null) {
                c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.gaw
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134246m(this.f103028a, (LoveBuzzData) obj);
                    }
                }, new y20() { // from class: l.m8w
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        haw.m134208L((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final int m134318y0() {
        return ((Number) this.deviceLevel.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final C22507a<pf60<String, Object>> m134319z0() {
        return this.loveBuzzShowPopBS;
    }

    /* JADX INFO: renamed from: l.haw$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/haw$a;", "", "<init>", "()V", "Ll/haw;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Ll/haw;", "instance", "", "TAG", "Ljava/lang/String;", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final haw m134320a() {
            return (haw) haw.f108521k.getValue();
        }

        public Companion() {
        }
    }
}
