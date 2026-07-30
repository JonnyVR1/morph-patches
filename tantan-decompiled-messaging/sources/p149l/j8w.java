package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4752r;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.LoveBuzzEnvelope;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.RateLimited;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.text.TextBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.video.VideoBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.VoiceBuzzAct;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¦\u00012\u00020\u0001:\u0001xB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J_\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JI\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0012¢\u0006\u0004\b)\u0010\u001fJ\u0017\u0010*\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b-\u0010(Jo\u00100\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b0\u00101Jm\u00102\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\u0003J\r\u00109\u001a\u00020\u000f¢\u0006\u0004\b9\u0010\u0003J\u0017\u0010:\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b:\u00105J\u0017\u0010;\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b;\u00105J\u0017\u0010<\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b<\u00105J1\u0010A\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bC\u00105J\u001f\u0010E\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bE\u0010\u001aJA\u0010F\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bF\u0010GJ1\u0010H\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bJ\u0010KJ[\u0010N\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010L2\b\b\u0002\u0010M\u001a\u00020\u0012¢\u0006\u0004\bN\u0010OJK\u0010P\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\bP\u0010\u0017J!\u0010Q\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bQ\u0010\u001aJ!\u0010R\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bR\u0010\u001aJ\u0015\u0010S\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\bU\u00105J\r\u0010V\u001a\u00020?¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020?¢\u0006\u0004\bY\u0010ZJK\u0010\\\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010[\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\\\u0010\u0017J\u001f\u0010]\u001a\u00020\u000f2\b\u0010[\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b]\u0010\u001aJ\r\u0010^\u001a\u00020\u000f¢\u0006\u0004\b^\u0010\u0003J\r\u0010_\u001a\u00020\u000f¢\u0006\u0004\b_\u0010\u0003J\u001f\u0010a\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010`\u001a\u00020\u0012¢\u0006\u0004\ba\u0010bJU\u0010f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010c\u001a\u00020\u00122\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\bf\u0010gJG\u0010j\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010i\u001a\u00020\u0012¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\u0012¢\u0006\u0004\bl\u0010\u001fJ\u001d\u0010n\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010m\u001a\u00020\n¢\u0006\u0004\bn\u0010\u001aJ\u0019\u0010o\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020?¢\u0006\u0004\br\u0010ZJ\r\u0010s\u001a\u00020?¢\u0006\u0004\bs\u0010WJ\r\u0010t\u001a\u00020\u000f¢\u0006\u0004\bt\u0010\u0003J\r\u0010u\u001a\u00020\u000f¢\u0006\u0004\bu\u0010\u0003J\r\u0010v\u001a\u00020\u000f¢\u0006\u0004\bv\u0010\u0003R\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00040w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R7\u0010\u0082\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010}0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b~\u0010y\u001a\u0004\b\u007f\u0010{\"\u0006\b\u0080\u0001\u0010\u0081\u0001R9\u0010\u0086\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010}0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010y\u001a\u0005\b\u0084\u0001\u0010{\"\u0006\b\u0085\u0001\u0010\u0081\u0001R-\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\n0w8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0087\u0001\u0010y\u001a\u0005\b\u0088\u0001\u0010{\"\u0006\b\u0089\u0001\u0010\u0081\u0001R<\u0010\u0092\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010}0\u008b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010¡\u0001\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010WR\u001a\u0010¥\u0001\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001¨\u0006§\u0001"}, m87232d2 = {"Ll/j8w;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "data", "g0", "(Lcom/p1/mobile/putong/core/data/LoveBuzzData;)Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "token", "otherId", "from", "Lkotlin/Function0;", "", "success", "fail", "", "popBusiness", "Y0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "P0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cid", "h1", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "f0", "(Lcom/p1/mobile/putong/core/data/LoveBuzzData;Ljava/lang/String;)Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "w0", "()Z", "v0", "()Lcom/p1/mobile/putong/core/data/LoveBuzzData;", "Ll/hhx;", "B0", "()Ll/hhx;", "n0", "shown", "I0", "(Z)V", "L0", "x0", "(Lcom/p1/mobile/android/app/Act;)V", "open", "q1", "Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;", "filter", "q0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/LoveBuzzPushData;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "W", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "c1", "(Ljava/lang/String;)V", "R0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "m1", "o1", "g1", "n1", "s0", "noFace", "noVocal", "", "errorCode", "K0", "(Ljava/lang/String;ZZI)V", "e1", "scene", "k1", "W0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "M0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "p1", "(ZLjava/lang/String;)V", "Lkotlin/Function1;", "enter", "X", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", "h0", "d1", "Z", "E0", "(Ljava/lang/String;)Z", "j1", "C0", "()I", "count", "i1", "(I)V", "bonusId", "c0", "e0", "s1", "r1", "showPop", "j0", "(Lcom/p1/mobile/android/app/Act;Z)Z", "rateLimit", "noCount", "coinBuySuc", "l0", "(Ljava/lang/String;Lcom/p1/mobile/android/app/Act;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z", "jump", "direct", "o0", "(Ljava/lang/String;Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "t0", "react", "b1", "F0", "(Ljava/lang/String;)Ljava/lang/String;", "mcc", "J0", "u0", "b0", "O0", "Q0", "Lrx/subjects/a;", "a", "Lrx/subjects/a;", "A0", "()Lrx/subjects/a;", "loveBuzzStatusBs", "Ll/j760;", "b", "z0", "setLoveBuzzShowPopBS", "(Lrx/subjects/a;)V", "loveBuzzShowPopBS", "c", "G0", "setMediaBuzzShowPopBS", "mediaBuzzShowPopBS", Constants.INAPP_DATA_TAG, "H0", "setMediaBuzzWarnBS", "mediaBuzzWarnBS", "Lrx/subjects/b;", "e", "Lrx/subjects/b;", "D0", "()Lrx/subjects/b;", "setMediaBuzzNotifyPS", "(Lrx/subjects/b;)V", "mediaBuzzNotifyPS", "Ll/ihx;", "f", "Ll/ihx;", "mediaBuzzPair", "g", "Ll/hhx;", "mediaBuzzCallData", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enterMediaBuzzPool", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "y0", "deviceLevel", "Ljava/util/concurrent/atomic/AtomicInteger;", "j", "Ljava/util/concurrent/atomic/AtomicInteger;", "buzzActive", "Companion", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class j8w {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Lazy<j8w> f116810k = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: l.n6w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j8w.m140354E();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C22392a<LoveBuzzData> loveBuzzStatusBs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C22392a<j760<String, Object>> loveBuzzShowPopBS;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public C22392a<j760<String, Object>> mediaBuzzShowPopBS;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public C22392a<String> mediaBuzzWarnBS;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public C22393b<j760<String, Object>> mediaBuzzNotifyPS;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ihx mediaBuzzPair;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public volatile hhx mediaBuzzCallData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean enterMediaBuzzPool;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy deviceLevel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger buzzActive;

    public j8w() {
        C22392a<LoveBuzzData> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.loveBuzzStatusBs = c22392aM221512b;
        C22392a<j760<String, Object>> c22392aM221512b2 = C22392a.m221512b();
        c22392aM221512b2.getClass();
        this.loveBuzzShowPopBS = c22392aM221512b2;
        C22392a<j760<String, Object>> c22392aM221512b3 = C22392a.m221512b();
        c22392aM221512b3.getClass();
        this.mediaBuzzShowPopBS = c22392aM221512b3;
        C22392a<String> c22392aM221512b4 = C22392a.m221512b();
        c22392aM221512b4.getClass();
        this.mediaBuzzWarnBS = c22392aM221512b4;
        C22393b<j760<String, Object>> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        this.mediaBuzzNotifyPS = c22393bM221521b;
        this.enterMediaBuzzPool = new AtomicBoolean(false);
        this.deviceLevel = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.u7w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(j8w.m140356G());
            }
        });
        this.buzzActive = new AtomicInteger(-1);
    }

    /* JADX INFO: renamed from: A */
    public static Unit m140350A() {
        qa2.INSTANCE.m173681a("LoveBuzzManager", "checkBuzzJump confirm");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static LoveBuzzData m140351B(LoveBuzzData loveBuzzData) {
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140262P3();
            return loveBuzzData;
        }
        CoreModule.f17545c.f19570H0.m210361k5();
        return loveBuzzData;
    }

    /* JADX INFO: renamed from: D */
    public static void m140353D(Function0 function0, j8w j8wVar, String str, LoveBuzzData loveBuzzData) {
        String str2;
        if (function0 != null) {
            function0.invoke();
        }
        if (loveBuzzData != null) {
            hhx.m131174r(j8wVar.m140417B0(), null, Integer.valueOf(loveBuzzData.totalDuration), Integer.valueOf(loveBuzzData.remainingProlongCount), null, 9, null);
        }
        C22393b<j760<String, Object>> c22393b = j8wVar.mediaBuzzNotifyPS;
        if (Intrinsics.m87488d(str, "memojiBuzz")) {
            str2 = "memojiBuzz_prolong_time";
        } else {
            str2 = Intrinsics.m87488d(str, "videoBuzz") ? "videoBuzz_prolong_time" : "voiceBuzz_prolong_time";
        }
        c22393b.onNext(vwb.m200311Y(str2, null));
    }

    /* JADX INFO: renamed from: E */
    public static j8w m140354E() {
        return new j8w();
    }

    /* JADX INFO: renamed from: F */
    public static Unit m140355F(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static int m140356G() {
        return m6w.INSTANCE.m153301f();
    }

    /* JADX INFO: renamed from: I */
    public static void m140358I(Function0 function0, Throwable th) {
        qa2.INSTANCE.m173682b("LoveBuzzManager", "prolongMediaBuzz error is " + th.getMessage());
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m140360K(Act act, String str, Function0 function0, roj0 roj0Var) {
        act.startActivity(CoreModule.f17554l.m94651a().mo33446Xr(act, str));
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m140361L(Throwable th) {
        qa2.INSTANCE.m173682b("LoveBuzzManager", "getLoveBuzzStatus error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: M */
    public static void m140362M(Function0 function0, j8w j8wVar, String str, LoveBuzzData loveBuzzData) {
        String str2;
        if (loveBuzzData != null) {
            j8wVar.m140417B0().m131191q(Boolean.valueOf(loveBuzzData.matched), Integer.valueOf(loveBuzzData.totalDuration), Integer.valueOf(loveBuzzData.remainingProlongCount), Boolean.TRUE);
        }
        if (function0 != null) {
            function0.invoke();
        }
        C22393b<j760<String, Object>> c22393b = j8wVar.mediaBuzzNotifyPS;
        if (Intrinsics.m87488d(str, "memojiBuzz")) {
            str2 = "memojiBuzz_like_relation";
        } else {
            str2 = Intrinsics.m87488d(str, "videoBuzz") ? "videoBuzz_like_relation" : "voiceBuzz_like_relation";
        }
        c22393b.onNext(vwb.m200311Y(str2, null));
    }

    /* JADX INFO: renamed from: N */
    public static void m140363N(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 100001) {
            lsi0.m151593w(R$string.f20206a1);
        }
        qa2.INSTANCE.m173682b("LoveBuzzManager", "switchTextBuzz error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m140364N0(j8w j8wVar, Act act, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "voiceBuzz";
        }
        j8wVar.m140428M0(act, str, function0);
    }

    /* JADX INFO: renamed from: P */
    public static void m140366P(Throwable th) {
        qa2.INSTANCE.m173682b("LoveBuzzManager", "mediaBuzzLikePeer error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: Q */
    public static void m140367Q(Throwable th) {
    }

    /* JADX INFO: renamed from: R */
    public static void m140368R(String str, Function0 function0, Throwable th) {
        qa2.INSTANCE.m173681a("LoveBuzzManager", "buzzAddBonus error is " + th.getMessage());
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 100020) {
            h6w.INSTANCE.m129533e(str, "bonus_ed");
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        h6w.INSTANCE.m129533e(str, "bonus_unknown");
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m140369S(Function0 function0, LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        qa2.INSTANCE.m173681a("LoveBuzzManager", "changeMediaBuzz request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static final j760 m140370S0(Integer num, roj0 roj0Var) {
        return vwb.m200311Y(roj0Var, num);
    }

    /* JADX INFO: renamed from: T */
    public static C22306c m140371T(String str, final Integer num) {
        if (num != null && num.intValue() == 0) {
            C22306c<roj0> c22306cM32902ap = CoreModule.f17545c.f19642f0.m32902ap(str);
            final Function1 function1 = new Function1() { // from class: l.l7w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j8w.m140374U0(num, (roj0) obj);
                }
            };
            return c22306cM32902ap.map(new w9j() { // from class: l.m7w
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return j8w.m140376V0(function1, obj);
                }
            });
        }
        C22306c c22306cJust = C22306c.just(roj0.f160388a);
        final Function1 function2 = new Function1() { // from class: l.i7w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j8w.m140370S0(num, (roj0) obj);
            }
        };
        return c22306cJust.map(new w9j() { // from class: l.k7w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j8w.m140372T0(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static final j760 m140372T0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static void m140373U(Throwable th) {
    }

    /* JADX INFO: renamed from: U0 */
    public static final j760 m140374U0(Integer num, roj0 roj0Var) {
        return vwb.m200311Y(roj0Var, num);
    }

    /* JADX INFO: renamed from: V */
    public static void m140375V(j8w j8wVar, LoveBuzzData loveBuzzData) {
        if (loveBuzzData != null) {
            j8wVar.loveBuzzStatusBs.onNext(j8wVar.m140446g0(loveBuzzData));
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static final j760 m140376V0(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m140377X0(j8w j8wVar, Act act, Function0 function0, Function0 function1, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "voiceBuzz";
        }
        j8wVar.m140434W0(act, function0, function1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m140378Y(j8w j8wVar, Act act, String str, String str2, Function0 function0, Function1 function1, boolean z, int i, Object obj) {
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
        j8wVar.m140435X(act, str, str3, function0, function2, z);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final j760 m140379Z0(LoveBuzzEnvelope loveBuzzEnvelope, roj0 roj0Var) {
        return vwb.m200311Y(roj0Var, loveBuzzEnvelope);
    }

    /* JADX INFO: renamed from: a */
    public static void m140380a(String str, j8w j8wVar, String str2, Function0 function0, LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        qa2.INSTANCE.m173681a("LoveBuzzManager", "buzzAddBonus request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        h6w.INSTANCE.m129533e(str, "bonus_ed");
        LoveBuzzData loveBuzzDataM140445f0 = j8wVar.m140445f0(loveBuzzEnvelope != null ? loveBuzzEnvelope.data : null, str2);
        if (loveBuzzDataM140445f0 != null) {
            j8wVar.loveBuzzStatusBs.onNext(loveBuzzDataM140445f0);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static final j760 m140382a1(Function1 function1, Object obj) {
        return (j760) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static LoveBuzzData m140383b(Function1 function1, Object obj) {
        return (LoveBuzzData) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m140384c(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m140385d(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 100001) {
            lsi0.m151593w(R$string.f20206a1);
        }
        qa2.INSTANCE.m173682b("LoveBuzzManager", "switchMediaBuzz error is " + th.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m140386d0(j8w j8wVar, Act act, String str, String str2, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        j8wVar.m140440c0(act, str, str2, function0, function1);
    }

    /* JADX INFO: renamed from: e */
    public static void m140387e(String str, long j, Integer num) {
        if (Intrinsics.m87488d(str, "voiceBuzz")) {
            p9w.INSTANCE.m167928b0(mqi0.m155944o() - j, j);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m140388f(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            qa2.INSTANCE.m173682b("LoveBuzzManager", "extendLoveBuzzTime error is " + coreService.code);
            if (coreService.code == 100004) {
                CoreModule.f17545c.f19577J1.m34565c6();
            }
        }
        CoreModule.f17545c.f19577J1.m34579u5().onNext(Boolean.FALSE);
        qa2.INSTANCE.m173681a("LoveBuzzManager", "extendLoveBuzzTime error is " + th.getMessage());
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m140389f1(j8w j8wVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "voiceBuzz";
        }
        j8wVar.m140444e1(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m140390g(Function1 function1, Throwable th) {
        int i = th instanceof TantanException.Client.CoreService ? ((TantanException.Client.CoreService) th).code : -1;
        qa2.INSTANCE.m173681a("LoveBuzzManager", "acceptMediaBuzz error is " + th.getMessage() + " code is " + i);
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m140391h(j8w j8wVar, LoveBuzzData loveBuzzData) {
        if (loveBuzzData != null) {
            j8wVar.loveBuzzStatusBs.onNext(j8wVar.m140446g0(loveBuzzData));
        }
    }

    /* JADX INFO: renamed from: i */
    public static Unit m140392i(boolean z, Act act, Function0 function0) {
        if (z) {
            act.startActivity(VideoBuzzAct.INSTANCE.m47072a(act, "search_video"));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m140393i0(j8w j8wVar, Act act, String str, String str2, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "voiceBuzz";
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            function1 = null;
        }
        j8wVar.m140448h0(act, str, str3, function0, function1);
    }

    /* JADX INFO: renamed from: j */
    public static void m140394j(Function0 function0, boolean z, Act act, String str, Function0 function1, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            qa2.INSTANCE.m173681a("LoveBuzzManager", "acceptLoveBuzz error is " + coreService.code);
            int i = coreService.code;
            if (i == 100002 || i == 100003) {
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            } else if (i == 100005 && z && m6w.INSTANCE.m153296a(act)) {
                f6w.INSTANCE.m119683N(act, "textBuzz", str, null);
            }
        }
        qa2.INSTANCE.m173681a("LoveBuzzManager", "acceptLoveBuzz error is " + th.getMessage());
        if (function1 != null) {
            function1.invoke();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ boolean m140396k0(j8w j8wVar, Act act, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return j8wVar.m140451j0(act, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static void m140397l(Act act, int i, j760 j760Var) {
        Integer num = (Integer) j760Var.f116565b;
        boolean z = false;
        if (num != null && num.intValue() == 0) {
            k6w k6wVar = k6w.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = act.getResources().getString(R$string.f20255t0);
            string.getClass();
            k6wVar.m144639h(act, String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(C15167a.m87596b(i - 1, 0))}, 1)), Integer.valueOf(y2c0.f195539T));
            CoreModule.f17545c.f19577J1.m34565c6();
        }
        qa2.INSTANCE.m173681a("LoveBuzzManager", "extendLoveBuzzTime request code is " + num);
        C22393b<Boolean> c22393bM34579u5 = CoreModule.f17545c.f19577J1.m34579u5();
        if (num != null && num.intValue() == 0) {
            z = true;
        }
        c22393bM34579u5.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m140398l1(j8w j8wVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "videoBuzz";
        }
        j8wVar.m140453k1(str, str2);
    }

    /* JADX INFO: renamed from: m */
    public static void m140399m(j8w j8wVar, LoveBuzzData loveBuzzData) {
        if (loveBuzzData != null) {
            j8wVar.loveBuzzStatusBs.onNext(loveBuzzData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ boolean m140400m0(j8w j8wVar, String str, Act act, boolean z, String str2, Function0 function0, Function0 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            function0 = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        return j8wVar.m140454l0(str, act, z, str2, function0, function1);
    }

    /* JADX INFO: renamed from: n */
    public static C22306c m140401n(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o */
    public static C22306c m140402o(String str, final LoveBuzzEnvelope loveBuzzEnvelope) {
        C22306c<roj0> c22306cM32902ap = CoreModule.f17545c.f19642f0.m32902ap(str);
        final Function1 function1 = new Function1() { // from class: l.p7w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j8w.m140379Z0(loveBuzzEnvelope, (roj0) obj);
            }
        };
        return c22306cM32902ap.map(new w9j() { // from class: l.q7w
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j8w.m140382a1(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static void m140403p(j8w j8wVar, String str, LoveBuzzEnvelope loveBuzzEnvelope) {
        Meta meta;
        qa2.INSTANCE.m173681a("LoveBuzzManager", "buzzAddBonusNoResult request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        LoveBuzzData loveBuzzDataM140445f0 = j8wVar.m140445f0(loveBuzzEnvelope != null ? loveBuzzEnvelope.data : null, str);
        if (loveBuzzDataM140445f0 != null) {
            j8wVar.loveBuzzStatusBs.onNext(loveBuzzDataM140445f0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m140404p0(j8w j8wVar, String str, Act act, Function0 function0, Function0 function1, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function0 function2 = function1;
        if ((i & 16) != 0) {
            z = true;
        }
        j8wVar.m140458o0(str, act, function0, function2, z);
    }

    /* JADX INFO: renamed from: q */
    public static void m140405q(boolean z, Act act, String str, Function0 function0, LoveBuzzEnvelope loveBuzzEnvelope) {
        Intent intentM47014b;
        Meta meta;
        qa2.INSTANCE.m173681a("LoveBuzzManager", "acceptMediaBuzz request code is " + ((loveBuzzEnvelope == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        if (z) {
            if (Intrinsics.m87488d(str, "videoBuzz")) {
                intentM47014b = VideoBuzzAct.INSTANCE.m47073b(act, "search_video", "passive");
            } else {
                intentM47014b = Intrinsics.m87488d(str, "memojiBuzz") ? MemojiBuzzAct.INSTANCE.m47014b(act, "search_memoji", "passive") : VoiceBuzzAct.INSTANCE.m47083b(act, "search_voice", "passive");
            }
            act.startActivity(intentM47014b);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: r */
    public static Unit m140406r(boolean z, Act act, Function0 function0) {
        if (z) {
            act.startActivity(VoiceBuzzAct.INSTANCE.m47082a(act, "search_voice"));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m140407r0(j8w j8wVar, Act act, String str, LoveBuzzPushData loveBuzzPushData, String str2, Function0 function0, Function0 function1, Function0 function2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        j8wVar.m140461q0(act, str, loveBuzzPushData, str2, function0, function1, function2, (i & 128) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: s */
    public static void m140408s(Function0 function0, Throwable th) {
        qa2.INSTANCE.m173682b("LoveBuzzManager", "enterLoveBuzz error is " + th.getMessage());
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m140409t(Function0 function0, Throwable th) {
        qa2.INSTANCE.m173681a("LoveBuzzManager", "changeMediaBuzz error is " + th.getMessage());
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 100019) {
                lsi0.m151593w(R$string.f20261w0);
            } else if (i == 100018) {
                lsi0.m151593w(R$string.f20259v0);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: u */
    public static Unit m140410u(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static void m140411v(j8w j8wVar, String str, String str2, Act act, Function0 function0, j760 j760Var) {
        LoveBuzzEnvelope loveBuzzEnvelope;
        Meta meta;
        qa2.INSTANCE.m173681a("LoveBuzzManager", "acceptLoveBuzz request code is " + ((j760Var == null || (loveBuzzEnvelope = (LoveBuzzEnvelope) j760Var.f116565b) == null || (meta = loveBuzzEnvelope.meta) == null) ? null : Integer.valueOf(meta.code)));
        j8wVar.m140449h1(str, str2);
        act.startActivity(CoreModule.f17554l.m94651a().mo33446Xr(act, str));
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: x */
    public static C22306c m140413x(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static Unit m140414y(j8w j8wVar, Act act, String str, String str2, String str3, Function0 function0, Function0 function1, boolean z) {
        j8wVar.m140436Y0(act, str, str2, str3, function0, function1, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static Unit m140415z(boolean z, Act act, Function0 function0) {
        if (z) {
            act.startActivity(MemojiBuzzAct.INSTANCE.m47013a(act, "search_memoji"));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A0 */
    public final C22392a<LoveBuzzData> m140416A0() {
        return this.loveBuzzStatusBs;
    }

    @NotNull
    /* JADX INFO: renamed from: B0 */
    public final hhx m140417B0() {
        if (this.mediaBuzzCallData == null) {
            this.mediaBuzzCallData = new hhx();
        }
        hhx hhxVar = this.mediaBuzzCallData;
        hhxVar.getClass();
        return hhxVar;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m140418C0() {
        Integer num = new tpd0("media_buzz_init_fail_count_" + CoreModule.m29931H().userId(), 0).get();
        num.getClass();
        return num.intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: D0 */
    public final C22393b<j760<String, Object>> m140419D0() {
        return this.mediaBuzzNotifyPS;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m140420E0(@NotNull String type) {
        type.getClass();
        Boolean bool = new hpd0("media_buzz_notify_shown_" + type + "_" + CoreModule.m29931H().userId(), Boolean.FALSE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: F0 */
    public final String m140421F0(@Nullable String token) {
        ihx ihxVar;
        return (TextUtils.isEmpty(token) || (ihxVar = this.mediaBuzzPair) == null || !Intrinsics.m87488d(ihxVar.getChannelToken(), token)) ? "" : ihxVar.getReact();
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public final C22392a<j760<String, Object>> m140422G0() {
        return this.mediaBuzzShowPopBS;
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public final C22392a<String> m140423H0() {
        return this.mediaBuzzWarnBS;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m140424I0(boolean shown) {
        CoreModule.f17545c.f19577J1.getLoveBuzzNotifyShown().put(Boolean.valueOf(shown));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m140425J0(int mcc) {
        CoreModule.f17545c.f19577J1.m34583x5(mcc);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m140426K0(@NotNull String type, boolean noFace, boolean noVocal, int errorCode) {
        type.getClass();
        String channelToken = m140417B0().getChannelToken();
        if (channelToken != null) {
            CoreModule.f17545c.f19577J1.m34584y5(channelToken, type, noFace, noVocal, errorCode);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m140427L0() {
        Boolean bool = CoreModule.f17545c.f19577J1.getLoveBuzzNotifyShown().get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m140428M0(@Nullable Act act, @NotNull final String type, @Nullable final Function0<Unit> success) {
        type.getClass();
        if (m6w.INSTANCE.m153296a(act)) {
            String channelToken = m140417B0().getChannelToken();
            if (TextUtils.isEmpty(channelToken) || act == null) {
                return;
            }
            C4752r c4752r = CoreModule.f17545c.f19577J1;
            channelToken.getClass();
            C22306c c22306cDuringCreated = act.duringCreated(c4752r.m34550G5(channelToken, type));
            if (c22306cDuringCreated != null) {
                c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.v7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140362M(success, this, type, (LoveBuzzData) obj);
                    }
                }, new e30() { // from class: l.w7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140366P((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m140429O0() {
        if (t49.m187151e()) {
            this.loveBuzzShowPopBS.onNext(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
            this.mediaBuzzShowPopBS.onNext(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
            this.buzzActive.set(-1);
            this.mediaBuzzWarnBS.onNext("");
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m140430P0(final Act act, String token, final String otherId, final Function0<Unit> success, final Function0<Unit> fail) {
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (m6w.INSTANCE.m153296a(act)) {
            act.duringCreated(CoreModule.f17545c.f19642f0.m32902ap(otherId)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.p6w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140360K(act, otherId, success, (roj0) obj);
                }
            }, new e30() { // from class: l.q6w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140408s(fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m140431Q0() {
        if (t49.m187151e()) {
            if (t49.m187153g() || t49.m187152f()) {
                BuzzMediaCallManager.INSTANCE.m46985s();
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m140432R0(@NotNull final Act act, @NotNull final String otherId) {
        act.getClass();
        otherId.getClass();
        if (m6w.INSTANCE.m153296a(act)) {
            if (!Network.isConnected(act)) {
                lsi0.m151584n(R$string.f20207b);
                return;
            }
            final int iM148777f = l6w.INSTANCE.m148777f();
            if (iM148777f > 0) {
                p9w.INSTANCE.m167941l0("success");
                C22306c<Integer> c22306cM34558S5 = CoreModule.f17545c.f19577J1.m34558S5(otherId);
                final Function1 function1 = new Function1() { // from class: l.x6w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j8w.m140371T(otherId, (Integer) obj);
                    }
                };
                act.duringCreated((C22306c) c22306cM34558S5.flatMap(new w9j() { // from class: l.z6w
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return j8w.m140413x(function1, obj);
                    }
                })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.a7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140397l(act, iM148777f, (j760) obj);
                    }
                }, new e30() { // from class: l.b7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140388f((Throwable) obj);
                    }
                }));
                return;
            }
            if (xma.m210071e4()) {
                p9w.INSTANCE.m167941l0("no_svip");
                CoreModule.f17554l.m94651a().mo33572qm(act, "p_chat_view,e_intl_buzz_add_time,click", Privilege.loveBuzz, null);
            } else {
                p9w.INSTANCE.m167941l0("used_up");
                k6w.m144633i(k6w.INSTANCE, act, act.getResources().getString(R$string.f20219f), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m140433W(@NotNull final Act act, @Nullable final String token, @NotNull final String otherId, @Nullable final String from, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail, @Nullable Function0<Unit> filter, final boolean popBusiness) {
        act.getClass();
        otherId.getClass();
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (!m6w.INSTANCE.m153296a(act)) {
            if (fail != null) {
                fail.invoke();
            }
        } else {
            if (!popBusiness || l6w.INSTANCE.m148776e() != 0) {
                m140436Y0(act, token, otherId, from, success, fail, popBusiness);
                return;
            }
            f6w.INSTANCE.m119683N(act, "textBuzz", from, new Function0() { // from class: l.f8w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j8w.m140414y(this.f96423a, act, token, otherId, from, success, fail, popBusiness);
                }
            });
            if (filter != null) {
                filter.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m140434W0(@Nullable Act act, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail, @NotNull final String type) {
        type.getClass();
        if (!m6w.INSTANCE.m153296a(act)) {
            if (fail != null) {
                fail.invoke();
                return;
            }
            return;
        }
        String channelToken = m140417B0().getChannelToken();
        if (TextUtils.isEmpty(channelToken)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (act != null) {
            C4752r c4752r = CoreModule.f17545c.f19577J1;
            channelToken.getClass();
            C22306c c22306cDuringCreated = act.duringCreated(c4752r.m34562W5(channelToken, type));
            if (c22306cDuringCreated != null) {
                c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.n7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140353D(success, this, type, (LoveBuzzData) obj);
                    }
                }, new e30() { // from class: l.o7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140358I(fail, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m140435X(@NotNull final Act act, @Nullable String token, @NotNull final String type, @Nullable final Function0<Unit> success, @Nullable final Function1<? super Integer, Unit> fail, final boolean enter) {
        act.getClass();
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke(-1);
            }
        } else if (m6w.INSTANCE.m153296a(act)) {
            C4752r c4752r = CoreModule.f17545c.f19577J1;
            token.getClass();
            act.duringCreated(c4752r.m34554O4(token, type)).subscribe(mkd0.m154956H(new e30() { // from class: l.d8w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140405q(enter, act, type, success, (LoveBuzzEnvelope) obj);
                }
            }, new e30() { // from class: l.e8w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140390g(fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke(-1);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m140436Y0(final Act act, final String token, final String otherId, final String from, final Function0<Unit> success, final Function0<Unit> fail, final boolean popBusiness) {
        if (m6w.INSTANCE.m153296a(act)) {
            C22306c c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19577J1.m34556Q4(token));
            final Function1 function1 = new Function1() { // from class: l.e7w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j8w.m140402o(otherId, (LoveBuzzEnvelope) obj);
                }
            };
            c22306cDuringCreated.flatMap(new w9j() { // from class: l.f7w
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return j8w.m140401n(function1, obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.g7w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140411v(this.f101453a, otherId, token, act, success, (j760) obj);
                }
            }, new e30() { // from class: l.h7w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140394j(success, popBusiness, act, from, fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m140437Z(@Nullable String token, @NotNull String type) {
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            return;
        }
        C4752r c4752r = CoreModule.f17545c.f19577J1;
        token.getClass();
        c4752r.m34554O4(token, type);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m140438b0() {
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("LoveBuzzManager", "afterSignIn");
        this.buzzActive.set(-1);
        if (!t49.m187151e()) {
            qa2Var.m173681a("LoveBuzzManager", "afterSignIn, love buzz not active");
            return;
        }
        BuzzMediaCallManager.INSTANCE.m46947K();
        g9w g9wVar = g9w.INSTANCE;
        g9wVar.m124852c();
        g9wVar.m124851b();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m140439b1(@NotNull String token, @NotNull String react) {
        token.getClass();
        react.getClass();
        qa2.INSTANCE.m173681a("LoveBuzzManager", "recordMediaResp token " + token + " react " + react + " mediaBuzzPair " + this.mediaBuzzPair);
        if (!Intrinsics.m87488d(react, "invited")) {
            ihx ihxVar = this.mediaBuzzPair;
            if (!Intrinsics.m87488d(ihxVar != null ? ihxVar.getChannelToken() : null, token)) {
                return;
            }
        }
        if (this.mediaBuzzPair == null) {
            this.mediaBuzzPair = new ihx();
        }
        int iHashCode = react.hashCode();
        if (iHashCode != -2146525273) {
            if (iHashCode != -608496514) {
                if (iHashCode == 1960030843 && react.equals("invited")) {
                    ihx ihxVar2 = this.mediaBuzzPair;
                    if (ihxVar2 != null) {
                        ihxVar2.m136325c(token);
                    }
                    ihx ihxVar3 = this.mediaBuzzPair;
                    if (ihxVar3 != null) {
                        ihxVar3.m136326d(react);
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
        ihx ihxVar4 = this.mediaBuzzPair;
        if (ihxVar4 != null) {
            ihxVar4.m136326d(react);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m140440c0(@Nullable Act act, @Nullable final String bonusId, @NotNull final String type, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail) {
        type.getClass();
        if (!m6w.INSTANCE.m153296a(act)) {
            qa2.INSTANCE.m173681a("LoveBuzzManager", "buzzAddBonus, act not valid");
            if (fail != null) {
                fail.invoke();
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(bonusId)) {
            qa2.INSTANCE.m173681a("LoveBuzzManager", "buzzAddBonus, want bonus but bonusId is empty");
            if (fail != null) {
                fail.invoke();
                return;
            }
            return;
        }
        h6w.INSTANCE.m129533e(bonusId, "bonus_ing");
        if (act != null) {
            C4752r c4752r = CoreModule.f17545c.f19577J1;
            bonusId.getClass();
            C22306c c22306cDuringCreated = act.duringCreated(c4752r.m34561V4(bonusId, type));
            if (c22306cDuringCreated != null) {
                c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.r7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140380a(bonusId, this, type, success, (LoveBuzzEnvelope) obj);
                    }
                }, new e30() { // from class: l.s7w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140368R(bonusId, fail, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m140441c1(@Nullable String token) {
        if (TextUtils.isEmpty(token)) {
            return;
        }
        CoreModule.f17545c.f19577J1.m34568f6(token);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m140442d1(@Nullable String token, @NotNull String type) {
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            return;
        }
        C4752r c4752r = CoreModule.f17545c.f19577J1;
        token.getClass();
        c4752r.m34566d6(token, type);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m140443e0(@Nullable String bonusId, @NotNull final String type) {
        type.getClass();
        if (TextUtils.isEmpty(bonusId)) {
            qa2.INSTANCE.m173681a("LoveBuzzManager", "buzzAddBonusNoResult, want bonus but bonusId is empty");
            return;
        }
        h6w.INSTANCE.m129533e(bonusId, "bonus_ed");
        C4752r c4752r = CoreModule.f17545c.f19577J1;
        bonusId.getClass();
        C22306c<LoveBuzzEnvelope> c22306cM34561V4 = c4752r.m34561V4(bonusId, type);
        if (c22306cM34561V4 != null) {
            c22306cM34561V4.subscribe(mkd0.m154956H(new e30() { // from class: l.c7w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140403p(this.f79660a, type, (LoveBuzzEnvelope) obj);
                }
            }, new e30() { // from class: l.d7w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140367Q((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m140444e1(@NotNull String type) {
        type.getClass();
        String channelToken = m140417B0().getChannelToken();
        if (channelToken != null) {
            CoreModule.f17545c.f19577J1.m34574n6(channelToken, type);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: f0 */
    public final LoveBuzzData m140445f0(LoveBuzzData data, String type) {
        if (data == null) {
            return null;
        }
        LoveBuzzData loveBuzzDataM140468v0 = m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            switch (type) {
                case "voiceBuzz":
                    loveBuzzDataM140468v0.remainingVoiceBuzz = data.remainingVoiceBuzz;
                    loveBuzzDataM140468v0.remainingBonus.voiceBuzz = data.remainingBonus.voiceBuzz;
                    qa2.INSTANCE.m173681a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM140468v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                case "textBuzz":
                    loveBuzzDataM140468v0.remainingTextBuzz = data.remainingTextBuzz;
                    loveBuzzDataM140468v0.remainingBonus.textBuzz = data.remainingBonus.textBuzz;
                    qa2.INSTANCE.m173681a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM140468v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                case "videoBuzz":
                    loveBuzzDataM140468v0.remainingVideoBuzz = data.remainingVideoBuzz;
                    loveBuzzDataM140468v0.remainingBonus.videoBuzz = data.remainingBonus.videoBuzz;
                    qa2.INSTANCE.m173681a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM140468v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                case "memojiBuzz":
                    loveBuzzDataM140468v0.remainingMemojiBuzz = data.remainingMemojiBuzz;
                    loveBuzzDataM140468v0.remainingBonus.memojiBuzz = data.remainingBonus.memojiBuzz;
                    qa2.INSTANCE.m173681a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM140468v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    break;
                default:
                    if (type.equals("voiceBuzz")) {
                        loveBuzzDataM140468v0.remainingVoiceBuzz = data.remainingVoiceBuzz;
                        loveBuzzDataM140468v0.remainingBonus.voiceBuzz = data.remainingBonus.voiceBuzz;
                        qa2.INSTANCE.m173681a("LoveBuzzManager", "cacheBuzzBonus cache is " + loveBuzzDataM140468v0 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                        break;
                    }
                    return null;
            }
        }
        return m140468v0();
    }

    /* JADX INFO: renamed from: g0 */
    public final LoveBuzzData m140446g0(LoveBuzzData data) {
        LoveBuzzData loveBuzzDataM140468v0 = m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            loveBuzzDataM140468v0.textBuzzToggle = data.textBuzzToggle;
            loveBuzzDataM140468v0.voiceBuzzToggle = data.voiceBuzzToggle;
            loveBuzzDataM140468v0.videoBuzzToggle = data.videoBuzzToggle;
            loveBuzzDataM140468v0.memojiBuzzToggle = data.memojiBuzzToggle;
        }
        return m140468v0();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m140447g1(@NotNull final String type) {
        type.getClass();
        final long jM155944o = mqi0.m155944o();
        if (Intrinsics.m87488d(type, "voiceBuzz")) {
            p9w.INSTANCE.m167929c0(jM155944o);
        }
        CoreModule.f17545c.f19577J1.m34576r6(type).subscribe(mkd0.m154956H(new e30() { // from class: l.y6w
            @Override // p149l.e30
            public final void call(Object obj) {
                j8w.m140387e(type, jM155944o, (Integer) obj);
            }
        }, new e30() { // from class: l.j7w
            @Override // p149l.e30
            public final void call(Object obj) {
                j8w.m140373U((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m140448h0(@NotNull Act act, @Nullable String token, @NotNull String type, @Nullable final Function0<Unit> success, @Nullable final Function0<Unit> fail) {
        act.getClass();
        type.getClass();
        if (TextUtils.isEmpty(token)) {
            if (fail != null) {
                fail.invoke();
            }
        } else if (m6w.INSTANCE.m153296a(act)) {
            C4752r c4752r = CoreModule.f17545c.f19577J1;
            token.getClass();
            act.duringCreated(c4752r.m34566d6(token, type)).subscribe(mkd0.m154956H(new e30() { // from class: l.v6w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140369S(success, (LoveBuzzEnvelope) obj);
                }
            }, new e30() { // from class: l.w6w
                @Override // p149l.e30
                public final void call(Object obj) {
                    j8w.m140409t(fail, (Throwable) obj);
                }
            }));
        } else if (fail != null) {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final void m140449h1(String cid, String token) {
        if (token != null) {
            CoreModule.f17545c.f19577J1.m34581v6(cid, token);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m140450i1(int count) {
        new tpd0("media_buzz_init_fail_count_" + CoreModule.m29931H().userId(), 0).put(Integer.valueOf(count));
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m140451j0(@NotNull Act act, boolean showPop) {
        act.getClass();
        if (!IntlCountryCodeController.m28118n() || CoreModule.f17554l.m94651a().mo158247J()) {
            return false;
        }
        if (!showPop) {
            return true;
        }
        CoreModule.f17554l.m94651a().showProofAgeDlg(act, "buzz_enter");
        return true;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m140452j1(@NotNull String type) {
        type.getClass();
        new hpd0("media_buzz_notify_shown_" + type + "_" + CoreModule.m29931H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m140453k1(@NotNull String scene, @NotNull String type) {
        scene.getClass();
        type.getClass();
        hhx hhxVarM140417B0 = m140417B0();
        String channelToken = hhxVarM140417B0.getChannelToken();
        if (channelToken != null) {
            CoreModule.f17545c.f19577J1.m34582w6(channelToken, scene, (int) (mqi0.m155944o() - hhxVarM140417B0.getStartTime()), type);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0127  */
    /* JADX INFO: renamed from: l0 */
    public final boolean m140454l0(@NotNull String type, @NotNull Act act, boolean rateLimit, @Nullable String from, @Nullable Function0<Unit> noCount, @Nullable Function0<Unit> coinBuySuc) {
        Integer numValueOf;
        LoveBuzzData loveBuzzDataM140468v0;
        RateLimited rateLimited;
        RateLimited rateLimited2;
        RateLimited rateLimited3;
        RateLimited rateLimited4;
        type.getClass();
        act.getClass();
        boolean zM87488d = Intrinsics.m87488d(type, "textBuzz");
        Boolean boolValueOf = null;
        if (!zM87488d && m140396k0(this, act, false, 2, null)) {
            return false;
        }
        if (!zM87488d && BuzzMediaCallManager.INSTANCE.m46951P()) {
            lsi0.m151593w(R$string.f20165G0);
            return false;
        }
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    LoveBuzzData loveBuzzDataM140468v1 = INSTANCE.m140473a().m140468v0();
                    if (loveBuzzDataM140468v1 != null) {
                        numValueOf = Integer.valueOf(loveBuzzDataM140468v1.remainingMemojiBuzz);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    loveBuzzDataM140468v0 = INSTANCE.m140473a().m140468v0();
                    if (loveBuzzDataM140468v0 != null) {
                        numValueOf = Integer.valueOf(loveBuzzDataM140468v0.remainingTextBuzz);
                    } else {
                        numValueOf = null;
                    }
                }
            } else if (type.equals("videoBuzz")) {
                LoveBuzzData loveBuzzDataM140468v2 = INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v2 != null) {
                    numValueOf = Integer.valueOf(loveBuzzDataM140468v2.remainingVideoBuzz);
                } else {
                    numValueOf = null;
                }
            } else {
                loveBuzzDataM140468v0 = INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v0 != null) {
                    numValueOf = Integer.valueOf(loveBuzzDataM140468v0.remainingTextBuzz);
                } else {
                    numValueOf = null;
                }
            }
        } else if (type.equals("voiceBuzz")) {
            LoveBuzzData loveBuzzDataM140468v3 = INSTANCE.m140473a().m140468v0();
            if (loveBuzzDataM140468v3 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM140468v3.remainingVoiceBuzz);
            } else {
                numValueOf = null;
            }
        } else {
            loveBuzzDataM140468v0 = INSTANCE.m140473a().m140468v0();
            if (loveBuzzDataM140468v0 != null) {
                numValueOf = Integer.valueOf(loveBuzzDataM140468v0.remainingTextBuzz);
            } else {
                numValueOf = null;
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (iIntValue <= 0 && iIntValue != -1) {
            f6w.INSTANCE.m119683N(act, type, from, coinBuySuc);
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
                LoveBuzzData loveBuzzDataM140468v4 = INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v4 != null && (rateLimited = loveBuzzDataM140468v4.rateLimited) != null) {
                    boolValueOf = Boolean.valueOf(rateLimited.voiceBuzz);
                }
                break;
            case "textBuzz":
                LoveBuzzData loveBuzzDataM140468v5 = INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v5 != null && (rateLimited2 = loveBuzzDataM140468v5.rateLimited) != null) {
                    boolValueOf = Boolean.valueOf(rateLimited2.textBuzz);
                }
                break;
            case "videoBuzz":
                LoveBuzzData loveBuzzDataM140468v6 = INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v6 != null && (rateLimited3 = loveBuzzDataM140468v6.rateLimited) != null) {
                    boolValueOf = Boolean.valueOf(rateLimited3.videoBuzz);
                }
                break;
            case "memojiBuzz":
                LoveBuzzData loveBuzzDataM140468v7 = INSTANCE.m140473a().m140468v0();
                if (loveBuzzDataM140468v7 != null && (rateLimited4 = loveBuzzDataM140468v7.rateLimited) != null) {
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
        qa2.INSTANCE.m173681a("LoveBuzzManager", "showRateLimitedDlg ");
        f6w.INSTANCE.m119689W(act, new Function0() { // from class: l.t7w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j8w.m140350A();
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m140455m1() {
        CoreModule.f17545c.f19577J1.m34547A6();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m140456n0() {
        hhx hhxVar = this.mediaBuzzCallData;
        if (hhxVar != null) {
            hhxVar.m131187m();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m140457n1(@NotNull String type) {
        type.getClass();
        CoreModule.f17545c.f19577J1.m34549E6(type);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o0 */
    public final void m140458o0(@NotNull String type, @NotNull final Act act, @NotNull final Function0<Unit> jump, @Nullable final Function0<Unit> fail, final boolean direct) {
        type.getClass();
        act.getClass();
        jump.getClass();
        switch (type.hashCode()) {
            case -1019560155:
                if (type.equals("voiceBuzz")) {
                    BuzzMediaCallManager.INSTANCE.m46983q0(act, new Function0() { // from class: l.b8w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j8w.m140406r(direct, act, jump);
                        }
                    }, new Function0() { // from class: l.c8w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j8w.m140384c(fail);
                        }
                    });
                    return;
                }
                break;
            case -1004163680:
                if (type.equals("textBuzz")) {
                    if (direct) {
                        act.startActivity(TextBuzzAct.INSTANCE.m47065a(act));
                    }
                    jump.invoke();
                    return;
                }
                break;
            case 1332422126:
                if (type.equals("videoBuzz")) {
                    BuzzMediaCallManager.INSTANCE.m46981p0(act, new Function0() { // from class: l.x7w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j8w.m140392i(direct, act, jump);
                        }
                    }, new Function0() { // from class: l.y7w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j8w.m140355F(fail);
                        }
                    });
                    return;
                }
                break;
            case 1740758636:
                if (type.equals("memojiBuzz")) {
                    BuzzMediaCallManager.INSTANCE.m46959X(act, new Function0() { // from class: l.z7w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j8w.m140415z(direct, act, jump);
                        }
                    }, new Function0() { // from class: l.a8w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j8w.m140410u(fail);
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
    public final void m140459o1() {
        CoreModule.f17545c.f19577J1.m34551I6();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m140460p1(boolean open, @NotNull String type) {
        type.getClass();
        CoreModule.f17545c.f19577J1.m34553M6(open, type).subscribe(mkd0.m154956H(new e30() { // from class: l.r6w
            @Override // p149l.e30
            public final void call(Object obj) {
                j8w.m140375V(this.f157984a, (LoveBuzzData) obj);
            }
        }, new e30() { // from class: l.s6w
            @Override // p149l.e30
            public final void call(Object obj) {
                j8w.m140385d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m140461q0(@NotNull Act act, @Nullable String token, @Nullable LoveBuzzPushData data, @Nullable String from, @Nullable Function0<Unit> success, @Nullable Function0<Unit> fail, @Nullable Function0<Unit> filter, boolean popBusiness) {
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
            lsi0.m151584n(R$string.f20207b);
        } else if (Intrinsics.m87488d("intl.lovebuzz.invite", data.buzzIntent)) {
            String str = data.userId;
            str.getClass();
            m140433W(act, token, str, from, success, fail, filter, popBusiness);
        } else if (Intrinsics.m87488d("intl.lovebuzz.match", data.buzzIntent)) {
            String str2 = data.userId;
            str2.getClass();
            m140430P0(act, token, str2, success, fail);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m140462q1(boolean open) {
        (open ? CoreModule.f17545c.f19577J1.m34552K5() : CoreModule.f17545c.f19577J1.m34564b5()).subscribe(mkd0.m154956H(new e30() { // from class: l.t6w
            @Override // p149l.e30
            public final void call(Object obj) {
                j8w.m140391h(this.f168649a, (LoveBuzzData) obj);
            }
        }, new e30() { // from class: l.u6w
            @Override // p149l.e30
            public final void call(Object obj) {
                j8w.m140363N((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public final void m140463r1() {
        if (!this.enterMediaBuzzPool.get()) {
            qa2.INSTANCE.m173681a("LoveBuzzManager", "tryOutMediaBuzzPool, but no had enter pool");
            return;
        }
        LoveBuzzData loveBuzzDataM140468v0 = m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            if (!loveBuzzDataM140468v0.videoBuzzToggle && !loveBuzzDataM140468v0.voiceBuzzToggle && !loveBuzzDataM140468v0.memojiBuzzToggle) {
                qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive, media buzz not toggle");
                return;
            }
            qa2.INSTANCE.m173681a("LoveBuzzManager", "outMediaBuzzPool");
            this.enterMediaBuzzPool.set(false);
            CoreModule.f17545c.f19577J1.m34555O5(loveBuzzDataM140468v0.voiceBuzzToggle, loveBuzzDataM140468v0.videoBuzzToggle, loveBuzzDataM140468v0.memojiBuzzToggle);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m140464s0(@NotNull String type) {
        type.getClass();
        String channelToken = m140417B0().getChannelToken();
        if (channelToken != null) {
            CoreModule.f17545c.f19577J1.m34570i5(channelToken, type);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m140465s1() {
        LoveBuzzData loveBuzzDataM140468v0 = m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            if (!loveBuzzDataM140468v0.videoBuzzToggle && !loveBuzzDataM140468v0.voiceBuzzToggle && !loveBuzzDataM140468v0.memojiBuzzToggle) {
                qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive, media buzz not toggle");
                return;
            }
            if (loveBuzzDataM140468v0.remainingVideoBuzz == 0 && loveBuzzDataM140468v0.remainingVoiceBuzz == 0 && loveBuzzDataM140468v0.remainingMemojiBuzz == 0 && !l6w.m148772b(l6w.INSTANCE, null, 1, null)) {
                qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive, remain count is 0");
                return;
            }
            boolean z = false;
            if (!BuzzMediaCallManager.INSTANCE.m46977n(false)) {
                qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive, checkMediaCanStart false");
                return;
            }
            String[] strArr = zqx.m219898k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
            if (!PermissionHelper.m79881b((String[]) Arrays.copyOf(strArr, strArr.length))) {
                qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive, check basic permission is false");
                return;
            }
            boolean zM79881b = PermissionHelper.m79881b("android.permission.CAMERA");
            if (!zM79881b && !loveBuzzDataM140468v0.voiceBuzzToggle) {
                qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive, camera not had permission and voice not toggle");
                return;
            }
            boolean zM127227e = go3.INSTANCE.m127227e();
            if (!loveBuzzDataM140468v0.voiceBuzzToggle && !zM127227e) {
                qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive, liveSDKLoad not load and just memoji open ");
                return;
            }
            qa2.INSTANCE.m173681a("LoveBuzzManager", "tryReportBuzzPassive,reportBuzzPassive liveSDKLoad " + zM127227e);
            this.enterMediaBuzzPool.set(true);
            C4752r c4752r = CoreModule.f17545c.f19577J1;
            boolean z2 = loveBuzzDataM140468v0.voiceBuzzToggle;
            boolean z3 = (zM79881b && zM127227e) ? loveBuzzDataM140468v0.videoBuzzToggle : false;
            if (zM79881b && zM127227e) {
                z = loveBuzzDataM140468v0.memojiBuzzToggle;
            }
            c4752r.m34571j6(z2, z3, z);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m140466t0() {
        Objects.toString(this.buzzActive);
        if (this.buzzActive.get() != -1) {
            return this.buzzActive.get() == 1;
        }
        String strM79302F = RemoteConfig.m79298x().m79302F("intl_buzz_switch");
        strM79302F.getClass();
        if (TextUtils.isEmpty(strM79302F)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM79302F);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mcc");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (TextUtils.equals(jSONArrayOptJSONArray.optString(i), String.valueOf(qib0.f154717f0))) {
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
                    if (TextUtils.equals(jSONArrayOptJSONArray2.optString(i2), String.valueOf(qib0.f154719h0))) {
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
    public final int m140467u0() {
        LoveBuzzData loveBuzzDataM140468v0;
        int iM34572m5 = CoreModule.f17545c.f19577J1.m34572m5();
        if (iM34572m5 <= 0 || (loveBuzzDataM140468v0 = m140468v0()) == null || loveBuzzDataM140468v0.allowedMCCSwitchList.contains(Integer.valueOf(iM34572m5))) {
            return iM34572m5;
        }
        return -1;
    }

    @Nullable
    /* JADX INFO: renamed from: v0 */
    public final LoveBuzzData m140468v0() {
        return this.loveBuzzStatusBs.m221515e();
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m140469w0() {
        LoveBuzzData loveBuzzDataM140468v0 = m140468v0();
        if (loveBuzzDataM140468v0 != null) {
            return loveBuzzDataM140468v0.textBuzzToggle;
        }
        return false;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m140470x0(@Nullable Act act) {
        Object map;
        if (m6w.INSTANCE.m153296a(act) && act != null) {
            C22306c<LoveBuzzData> c22306cM34573n5 = CoreModule.f17545c.f19577J1.m34573n5(m140471y0());
            if (c22306cM34573n5 != null) {
                final Function1 function1 = new Function1() { // from class: l.g8w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j8w.m140351B((LoveBuzzData) obj);
                    }
                };
                map = c22306cM34573n5.map(new w9j() { // from class: l.h8w
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return j8w.m140383b(function1, obj);
                    }
                });
            } else {
                map = null;
            }
            C22306c c22306cDuringCreated = act.duringCreated((C22306c) map);
            if (c22306cDuringCreated != null) {
                c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.i8w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140399m(this.f112075a, (LoveBuzzData) obj);
                    }
                }, new e30() { // from class: l.o6w
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j8w.m140361L((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final int m140471y0() {
        return ((Number) this.deviceLevel.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: z0 */
    public final C22392a<j760<String, Object>> m140472z0() {
        return this.loveBuzzShowPopBS;
    }

    /* JADX INFO: renamed from: l.j8w$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/j8w$a;", "", "<init>", "()V", "Ll/j8w;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Ll/j8w;", "instance", "", "TAG", "Ljava/lang/String;", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final j8w m140473a() {
            return (j8w) j8w.f116810k.getValue();
        }

        public Companion() {
        }
    }
}
