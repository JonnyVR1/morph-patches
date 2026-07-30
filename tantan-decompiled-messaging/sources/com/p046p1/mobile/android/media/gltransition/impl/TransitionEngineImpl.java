package com.p046p1.mobile.android.media.gltransition.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.media.gltransition.TransitionEngine;
import com.p046p1.mobile.android.media.gltransition.impl.TransitionEngineImpl;
import com.p046p1.mobile.android.media.gltransition.utils.BitmapProcessor;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.live.base.data.BLiveOpenStatus;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.ByteStreamsKt;
import kotlin.ranges.C15167a;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a8q0;
import p149l.b9j0;
import p149l.c9j0;
import p149l.cre;
import p149l.d13;
import p149l.d4e;
import p149l.d9j0;
import p149l.eri;
import p149l.fri;
import p149l.ig3;
import p149l.j6f;
import p149l.jcr;
import p149l.jh3;
import p149l.jpb;
import p149l.jri;
import p149l.kcr;
import p149l.nyl;
import p149l.o3l0;
import p149l.ocj;
import p149l.ppb;
import p149l.qkq0;
import p149l.r4l0;
import p149l.std0;
import p149l.uwp;
import p149l.vek0;
import p149l.w7j0;
import p149l.wvf0;
import p149l.y8j0;
import p149l.z4l0;
import p149l.z8j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Î\u00012\u00020\u0001:\u0002Ï\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J3\u0010.\u001a\u00020-2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0003¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020-2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(H\u0003¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020#2\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u00020#2\u0006\u00108\u001a\u000200H\u0002¢\u0006\u0004\b6\u00109J\u0017\u0010<\u001a\u00020#2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0003J\u001f\u0010C\u001a\u00020\b2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010K\u001a\u00020\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002¢\u0006\u0004\bK\u0010LJ \u0010M\u001a\u00020\b2\u000e\b\u0004\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0082\b¢\u0006\u0004\bM\u0010DJ\u001d\u0010O\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0002¢\u0006\u0004\bO\u0010DJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010\u000eJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bQ\u0010\u000eJ\u001d\u0010S\u001a\u00020\b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0016¢\u0006\u0004\bS\u0010DJ;\u0010V\u001a\u00020\b2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(2\u0006\u0010U\u001a\u00020T2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\bV\u0010WJ;\u0010Y\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(2\u0006\u0010U\u001a\u00020T2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\bY\u0010WJ'\u0010Z\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\bZ\u0010\u0016J#\u0010[\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\bH\u0016¢\u0006\u0004\b]\u0010\u0003J\u001f\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010\nJ\u001f\u0010c\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010\u0003J\u001d\u0010k\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0010¢\u0006\u0004\bj\u0010DJ%\u0010p\u001a\u00020-2\u0006\u0010m\u001a\u00020l2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0010¢\u0006\u0004\bn\u0010oJ\u0017\u0010u\u001a\u00020\b2\u0006\u0010r\u001a\u00020qH\u0010¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020\b2\u0006\u0010w\u001a\u00020v2\u0006\u0010x\u001a\u00020EH\u0010¢\u0006\u0004\bs\u0010yJ\u000f\u0010}\u001a\u00020zH\u0010¢\u0006\u0004\b{\u0010|J\u000f\u0010x\u001a\u00020\bH\u0016¢\u0006\u0004\bx\u0010\u0003J6\u0010\u0082\u0001\u001a\u00020\b2\u0006\u0010~\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0*H\u0010¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R#\u0010\u0088\u0001\u001a\f\u0018\u00010\u0086\u0001j\u0005\u0018\u0001`\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010\u009d\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010\u009f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R \u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020#0 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020e0(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u009e\u0001R'\u0010¥\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030¤\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010ª\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0017\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0011\u0010¬\u0001R\u001a\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001c\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001d\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010·\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001a\u0010º\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010²\u0001R\u0017\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010½\u0001R4\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0005\bÂ\u0001\u0010\\R\u0019\u0010Ã\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010\u008e\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u008e\u0001R\u0017\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u008e\u0001R\u0017\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u008e\u0001R*\u0010Æ\u0001\u001a\u00020T2\u0007\u0010Å\u0001\u001a\u00020T8\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ë\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010¸\u0001¨\u0006Ð\u0001"}, m87232d2 = {"Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "<init>", "()V", "", "output", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;", "exportListener", "", "internalExportVideo", "(Ljava/lang/String;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;)V", "Ll/jcr;", Owner.TYPE, "initialize", "(Ll/jcr;)V", "initializeEGL", "Landroid/view/TextureView;", "textureView", "", "previewWidth", "previewHeight", "initPreview", "(Landroid/view/TextureView;II)V", "internalPlay", "prepareOutputSurface", "", "progress", "internalRender", "(F)V", "seekAt", "calculateIndexFromDuration", "(F)Ljava/lang/Integer;", FirebaseAnalytics.Param.INDEX, "calculateSeekOffset", "(IF)F", "Ll/std0;", "scene", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "interpolateOffset", "(Ll/std0;F)F", "", "images", "Lkotlin/Function1;", "", "onLoaded", "Lkotlinx/coroutines/o;", "applyPathData", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/o;", "Landroid/net/Uri;", "applyUriData", "(Ljava/util/List;)Lkotlinx/coroutines/o;", "processScene", "(Ll/std0;)V", "path", "createScene", "(Ljava/lang/String;)Ll/std0;", "uri", "(Landroid/net/Uri;)Ll/std0;", "Ljava/io/File;", "cacheFile", "assembleScene", "(Ljava/io/File;)Ll/std0;", "evaluateDuration", "setDefaultEndTransition", "prepareDrawer", "Lkotlin/Function0;", BLiveOpenStatus.draw, "renderFramebuffer", "(Lkotlin/jvm/functions/Function0;)V", "", "renderSurface", "(Z)V", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "runnables", "run", "(Ljava/util/Queue;)V", "addPreDrawQueue", "runnable", "io", "onCreate", "onDestroy", "log", "setLogger", "Ll/z4l0;", "format", "loadImageFromPath", "(Ljava/util/List;Ll/z4l0;Lkotlin/jvm/functions/Function1;)V", "uris", "loadImageFromUri", "setPreview", "play", "(Lkotlin/jvm/functions/Function1;)V", "pause", "exportVideo", "Ll/r4l0;", "videoEntry", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;", "assembleListener", "assembleVideo", "(Ll/r4l0;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;)V", "Ll/w7j0;", "transition", "setTransitionAt", "(ILl/w7j0;)V", "cancel", "render$android_release", "render", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "launch$android_release", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/o;", "launch", "Landroid/graphics/SurfaceTexture;", "texture", "createWindowSurface$android_release", "(Landroid/graphics/SurfaceTexture;)V", "createWindowSurface", "Landroid/view/Surface;", "surface", "release", "(Landroid/view/Surface;Z)V", "Ll/cre;", "requireEglCore$android_release", "()Ll/cre;", "requireEglCore", "renderToSurface", "onDraw", "processFrame$android_release", "(ZFLkotlin/jvm/functions/Function1;)V", "processFrame", "Ll/jpb;", "exceptionHandler", "Ll/jpb;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/p1/mobile/android/media/gltransition/TextureListener;", "userTextureListener", "Landroid/view/TextureView$SurfaceTextureListener;", "Ll/a8q0;", "outputSurface", "Ll/a8q0;", "framebuffer", "I", "outputTexId", "Ll/c9j0;", "textureDrawer", "Ll/c9j0;", "lifecycleOwner", "Ll/jcr;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "baseDir", "Ljava/lang/String;", "Ll/d13;", "bitmapCache", "Ll/d13;", "imageUris", "Ljava/util/List;", "imagePaths", "", "scenes", "transitions", "", "Ll/z8j0;", "transitionRenders", "Ljava/util/Map;", "totalDuration", "J", "", "durations", "[J", "Landroid/view/TextureView;", "Ll/d9j0;", "renderThread", "Ll/d9j0;", "Landroid/os/Handler;", "renderHandler", "Landroid/os/Handler;", "eglCore", "Ll/cre;", "preDraw", "Ljava/util/Queue;", "isPlaying", "Z", "Ll/nyl;", "ioThread", "Ll/nyl;", "ioHandler", "F", "playProgress", "Lkotlin/jvm/functions/Function1;", "getPlayProgress", "()Lkotlin/jvm/functions/Function1;", "setPlayProgress", "videoWidth", "videoHeight", "value", "videoFormat", "Ll/z4l0;", "setVideoFormat", "(Ll/z4l0;)V", "Ll/o3l0;", "videoComposer", "Ll/o3l0;", "prepared", "Companion", "a", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TransitionEngineImpl extends TransitionEngine {

    @NotNull
    private static final String BASE_DIR = "image.video";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private String baseDir;
    private d13 bitmapCache;
    private Context context;

    @NotNull
    private long[] durations;

    @Nullable
    private cre eglCore;

    @Nullable
    private List<String> imagePaths;

    @Nullable
    private List<? extends Uri> imageUris;

    @Nullable
    private Handler ioHandler;

    @NotNull
    private nyl ioThread;
    private boolean isPlaying;
    private jcr lifecycleOwner;
    private a8q0 outputSurface;

    @NotNull
    private Function1<? super Float, Unit> playProgress;

    @NotNull
    private final Queue<Runnable> preDraw;
    private boolean prepared;
    private int previewHeight;
    private int previewWidth;
    private float progress;

    @Nullable
    private Handler renderHandler;

    @NotNull
    private d9j0 renderThread;
    private c9j0 textureDrawer;
    private TextureView textureView;
    private long totalDuration;

    @NotNull
    private Map<String, z8j0> transitionRenders;

    @NotNull
    private List<? extends w7j0> transitions;

    @Nullable
    private TextureView.SurfaceTextureListener userTextureListener;

    @NotNull
    private final o3l0 videoComposer;

    @NotNull
    private z4l0 videoFormat;
    private int videoHeight;
    private int videoWidth;

    @NotNull
    private final jpb exceptionHandler = new C4337f(jpb.INSTANCE);
    private int framebuffer = -1;
    private int outputTexId = -1;

    @NotNull
    private List<std0> scenes = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl$a;", "", "<init>", "()V", "Ll/jcr;", Owner.TYPE, "Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "c", "(Ll/jcr;)Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "Landroid/content/Context;", "e", "(Ll/jcr;)Landroid/content/Context;", "context", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Ljava/lang/String;", "BASE_DIR", "Ljava/lang/String;", "android_release"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final TransitionEngineImpl m20773c(@NotNull jcr owner) {
            owner.getClass();
            TransitionEngineImpl transitionEngineImpl = new TransitionEngineImpl();
            owner.getLifecycle().mo2966a(transitionEngineImpl);
            return transitionEngineImpl;
        }

        /* JADX INFO: renamed from: d */
        public final String m20774d(Context context) {
            File file = new File(context.getExternalCacheDir(), TransitionEngineImpl.BASE_DIR);
            if (!file.exists() && !file.mkdirs()) {
                qkq0.m175383a("mkdirs failed");
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public final Context m20775e(jcr owner) {
            if (owner instanceof Activity) {
                Context applicationContext = ((ContextWrapper) owner).getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            }
            if (!(owner instanceof Fragment)) {
                ig3.m135964a("owner should be Activity or Fragment");
                return null;
            }
            Context applicationContext2 = ((Fragment) owner).requireContext().getApplicationContext();
            applicationContext2.getClass();
            return applicationContext2;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
    @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1", m87374f = "TransitionEngineImpl.kt", m87375l = {400}, m87376m = "invokeSuspend", m87377v = 1)
    @SourceDebugExtension
    public static final class C43281 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $images;
        final /* synthetic */ Function1<Long, Unit> $onLoaded;
        int label;
        final /* synthetic */ TransitionEngineImpl this$0;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$4, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"Ll/fri;", "Ll/std0;", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
        @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$4", m87374f = "TransitionEngineImpl.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
        public static final class AnonymousClass4 extends SuspendLambda implements Function3<fri<? super std0>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Long, Unit> $onLoaded;
            int label;
            final /* synthetic */ TransitionEngineImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass4(TransitionEngineImpl transitionEngineImpl, Function1<? super Long, Unit> function1, Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
                this.this$0 = transitionEngineImpl;
                this.$onLoaded = function1;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass4(this.this$0, this.$onLoaded, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uwp.m196133e();
                if (this.label != 0) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
                this.this$0.evaluateDuration();
                this.this$0.setDefaultEndTransition();
                this.this$0.prepareDrawer();
                this.$onLoaded.invoke(Boxing.m87372c(this.this$0.totalDuration));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$5, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"Ll/fri;", "Ll/std0;", "", "e", "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
        @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$5", m87374f = "TransitionEngineImpl.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
        public static final class AnonymousClass5 extends SuspendLambda implements Function3<fri<? super std0>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.L$0 = th;
                return anonymousClass5.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uwp.m196133e();
                if (this.label == 0) {
                    ResultKt.m87239b(obj);
                    return Unit.INSTANCE;
                }
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$a */
        @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class a<T> implements fri {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TransitionEngineImpl f15600a;

            public a(TransitionEngineImpl transitionEngineImpl) {
                this.f15600a = transitionEngineImpl;
            }

            @Override // p149l.fri
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(std0 std0Var, Continuation<? super Unit> continuation) {
                this.f15600a.processScene(std0Var);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43281(List<String> list, TransitionEngineImpl transitionEngineImpl, Function1<? super Long, Unit> function1, Continuation<? super C43281> continuation) {
            super(2, continuation);
            this.$images = list;
            this.this$0 = transitionEngineImpl;
            this.$onLoaded = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C43281(this.$images, this.this$0, this.$onLoaded, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C43281) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            eri eriVarM142964w;
            eri eriVarM142932D;
            eri eriVarM142947f;
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                List<String> list = this.$images;
                if (list != null) {
                    this.this$0.imagePaths = list;
                    final eri eriVarM142942a = jri.m142942a(list);
                    if (eriVarM142942a != null && (eriVarM142964w = jri.m142964w(new C4330xfc914da3(new eri<String>() { // from class: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        @Metadata(m87231d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/hsi", "<anonymous>"}, m87233k = 3, m87234mv = {2, 2, 0})
                        @SourceDebugExtension
                        public static final class AnonymousClass2<T> implements fri {

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ fri f15602a;

                            /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
                            @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2", m87374f = "TransitionEngineImpl.kt", m87375l = {223}, m87376m = "emit", m87377v = 1)
                            @SourceDebugExtension
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(fri friVar) {
                                this.f15602a = friVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Override // p149l.fri
                            @Nullable
                            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                                Object obj2 = anonymousClass1.result;
                                Object objM196133e = uwp.m196133e();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.m87239b(obj2);
                                    fri friVar = this.f15602a;
                                    if (new File((String) obj).exists()) {
                                        anonymousClass1.L$0 = SpillingKt.m87384a(obj);
                                        anonymousClass1.L$1 = SpillingKt.m87384a(anonymousClass1);
                                        anonymousClass1.L$2 = SpillingKt.m87384a(obj);
                                        anonymousClass1.L$3 = SpillingKt.m87384a(friVar);
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        if (friVar.emit(obj, anonymousClass1) == objM196133e) {
                                            return objM196133e;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    ResultKt.m87239b(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // p149l.eri
                        @Nullable
                        public Object collect(@NotNull fri<? super String> friVar, @NotNull Continuation continuation) {
                            Object objCollect = eriVarM142942a.collect(new AnonymousClass2(friVar), continuation);
                            return objCollect == uwp.m196133e() ? objCollect : Unit.INSTANCE;
                        }
                    }, null, this.this$0))) != null && (eriVarM142932D = jri.m142932D(eriVarM142964w, new AnonymousClass4(this.this$0, this.$onLoaded, null))) != null && (eriVarM142947f = jri.m142947f(eriVarM142932D, new AnonymousClass5(null))) != null) {
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (eriVarM142947f.collect(aVar, this) == objM196133e) {
                            return objM196133e;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1 */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m87232d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
    @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1", m87374f = "TransitionEngineImpl.kt", m87375l = {419}, m87376m = "invokeSuspend", m87377v = 1)
    @SourceDebugExtension
    public static final class C43311 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Uri> $images;
        int label;
        final /* synthetic */ TransitionEngineImpl this$0;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$3, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"Ll/fri;", "Ll/std0;", "", Careers.f38732it, "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
        @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$3", m87374f = "TransitionEngineImpl.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<fri<? super std0>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TransitionEngineImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TransitionEngineImpl transitionEngineImpl, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = transitionEngineImpl;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass3(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uwp.m196133e();
                if (this.label != 0) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
                this.this$0.evaluateDuration();
                this.this$0.setDefaultEndTransition();
                this.this$0.prepareDrawer();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$4, reason: invalid class name */
        @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m87232d2 = {"Ll/fri;", "Ll/std0;", "", "e", "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, m87233k = 3, m87234mv = {2, 2, 0})
        @DebugMetadata(m87373c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$4", m87374f = "TransitionEngineImpl.kt", m87375l = {}, m87376m = "invokeSuspend", m87377v = 1)
        public static final class AnonymousClass4 extends SuspendLambda implements Function3<fri<? super std0>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = th;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uwp.m196133e();
                if (this.label == 0) {
                    ResultKt.m87239b(obj);
                    return Unit.INSTANCE;
                }
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$a */
        @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class a<T> implements fri {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TransitionEngineImpl f15605a;

            public a(TransitionEngineImpl transitionEngineImpl) {
                this.f15605a = transitionEngineImpl;
            }

            @Override // p149l.fri
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(std0 std0Var, Continuation<? super Unit> continuation) {
                this.f15605a.processScene(std0Var);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43311(List<? extends Uri> list, TransitionEngineImpl transitionEngineImpl, Continuation<? super C43311> continuation) {
            super(2, continuation);
            this.$images = list;
            this.this$0 = transitionEngineImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C43311(this.$images, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return ((C43311) create(ppbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            eri eriVarM142964w;
            eri eriVarM142932D;
            eri eriVarM142947f;
            Object objM196133e = uwp.m196133e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m87239b(obj);
                List<Uri> list = this.$images;
                if (list != null) {
                    this.this$0.imageUris = list;
                    eri eriVarM142942a = jri.m142942a(list);
                    if (eriVarM142942a != null && (eriVarM142964w = jri.m142964w(new C4332xe01cfc1e(eriVarM142942a, null, this.this$0))) != null && (eriVarM142932D = jri.m142932D(eriVarM142964w, new AnonymousClass3(this.this$0, null))) != null && (eriVarM142947f = jri.m142947f(eriVarM142932D, new AnonymousClass4(null))) != null) {
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (eriVarM142947f.collect(aVar, this) == objM196133e) {
                            return objM196133e;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m87239b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$b */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4333b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f15608a;

        public RunnableC4333b(Function0<Unit> function0) {
            this.f15608a = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM223820constructorimpl;
            Function0<Unit> function0 = this.f15608a;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$c */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4334c implements Runnable {
        public RunnableC4334c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM223820constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (TransitionEngineImpl.this.outputTexId == -1) {
                    int width = TransitionEngineImpl.this.videoFormat.getWidth();
                    int height = TransitionEngineImpl.this.videoFormat.getHeight();
                    TransitionEngineImpl transitionEngineImpl = TransitionEngineImpl.this;
                    ocj ocjVar = ocj.INSTANCE;
                    transitionEngineImpl.outputTexId = ocjVar.m163529f();
                    TransitionEngineImpl transitionEngineImpl2 = TransitionEngineImpl.this;
                    transitionEngineImpl2.framebuffer = ocjVar.m163528e(width, height, transitionEngineImpl2.outputTexId);
                }
                objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$d */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4335d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ std0 f15610a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TransitionEngineImpl f15611b;

        public RunnableC4335d(std0 std0Var, TransitionEngineImpl transitionEngineImpl) {
            this.f15610a = std0Var;
            this.f15611b = transitionEngineImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM223820constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                this.f15610a.m185915g();
                z8j0 z8j0Var = (z8j0) this.f15611b.transitionRenders.get(this.f15610a.getTransition().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (z8j0Var != null) {
                    z8j0Var.m217606E();
                }
                z8j0 z8j0Var2 = (z8j0) this.f15611b.transitionRenders.get(this.f15610a.getTransition().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (z8j0Var2 != null) {
                    z8j0Var2.m217605D();
                }
                objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$e */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4336e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w7j0 f15613b;

        public RunnableC4336e(w7j0 w7j0Var) {
            this.f15613b = w7j0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM223820constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                z8j0 z8j0Var = (z8j0) TransitionEngineImpl.this.transitionRenders.get(this.f15613b.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (z8j0Var != null) {
                    z8j0Var.m217606E();
                }
                z8j0 z8j0Var2 = (z8j0) TransitionEngineImpl.this.transitionRenders.get(this.f15613b.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (z8j0Var2 != null) {
                    z8j0Var2.m217605D();
                }
                objM223820constructorimpl = Result.m223820constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$f */
    @Metadata(m87231d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"com/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl$f", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Ll/jpb;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C4337f extends AbstractCoroutineContextElement implements jpb {
        public C4337f(jpb.Companion companion) {
            super(companion);
        }

        @Override // p149l.jpb
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            vek0.m198202b("[exceptionHandler] error: " + exception, null, 2, null);
        }
    }

    public TransitionEngineImpl() {
        List<w7j0> listM100815b = b9j0.INSTANCE.m100815b();
        this.transitions = listM100815b;
        List<w7j0> list = listM100815b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (w7j0 w7j0Var : list) {
            Pair pairM87240a = TuplesKt.m87240a(w7j0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), y8j0.INSTANCE.m213406a(w7j0Var));
            linkedHashMap.put(pairM87240a.getFirst(), pairM87240a.getSecond());
        }
        this.transitionRenders = linkedHashMap;
        this.durations = new long[0];
        this.renderThread = new d9j0();
        this.preDraw = new LinkedList();
        this.ioThread = new nyl();
        this.playProgress = new Function1() { // from class: l.g8j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m20763o(((Float) obj).floatValue());
            }
        };
        this.videoWidth = 720;
        this.videoHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.previewWidth = 720;
        this.previewHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.videoFormat = z4l0.INSTANCE.m217104b();
        this.videoComposer = new o3l0(this);
    }

    private final void addPreDrawQueue(Function0<Unit> run) {
        this.preDraw.add(new RunnableC4333b(run));
    }

    private final InterfaceC15486o applyPathData(List<String> images, Function1<? super Long, Unit> onLoaded) {
        jcr jcrVar = this.lifecycleOwner;
        if (jcrVar == null) {
            Intrinsics.m87502r("lifecycleOwner");
            jcrVar = null;
        }
        return jh3.m141367d(kcr.m145604a(jcrVar), d4e.m109981b(), null, new C43281(images, this, onLoaded, null), 2, null);
    }

    private final InterfaceC15486o applyUriData(List<? extends Uri> images) {
        jcr jcrVar = this.lifecycleOwner;
        if (jcrVar == null) {
            Intrinsics.m87502r("lifecycleOwner");
            jcrVar = null;
        }
        return jh3.m141367d(kcr.m145604a(jcrVar), d4e.m109981b(), null, new C43311(images, this, null), 2, null);
    }

    private final std0 assembleScene(File cacheFile) throws NoSuchAlgorithmException, IOException {
        d13 d13Var;
        Object next;
        Bitmap bitmapM109567b;
        String absolutePath = cacheFile.getAbsolutePath();
        absolutePath.getClass();
        String strM198207g = vek0.m198207g(absolutePath);
        Iterator<T> it = this.scenes.iterator();
        do {
            d13Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m87488d(((std0) next).getId(), strM198207g));
        std0 std0Var = (std0) next;
        if (std0Var != null) {
            return std0Var;
        }
        BitmapProcessor.CropType cropType = BitmapProcessor.CropType.FIT_CENTER;
        d13 d13Var2 = this.bitmapCache;
        if (d13Var2 == null) {
            Intrinsics.m87502r("bitmapCache");
            d13Var2 = null;
        }
        if (d13Var2.m109566a(strM198207g + cropType.key())) {
            d13 d13Var3 = this.bitmapCache;
            if (d13Var3 == null) {
                Intrinsics.m87502r("bitmapCache");
            } else {
                d13Var = d13Var3;
            }
            bitmapM109567b = d13Var.m109567b(strM198207g + cropType.key());
        } else {
            BitmapProcessor.Companion companion = BitmapProcessor.INSTANCE;
            String absolutePath2 = cacheFile.getAbsolutePath();
            absolutePath2.getClass();
            BitmapProcessor bitmapProcessor = new BitmapProcessor(companion.m20791b(absolutePath2));
            bitmapProcessor.m20789l(this.videoFormat.getWidth(), this.videoFormat.getHeight(), this.videoFormat.getBgColor());
            Bitmap bitmapM20788k = bitmapProcessor.m20788k();
            d13 d13Var4 = this.bitmapCache;
            if (d13Var4 == null) {
                Intrinsics.m87502r("bitmapCache");
            } else {
                d13Var = d13Var4;
            }
            d13Var.m109568c(strM198207g + cropType.key(), bitmapM20788k);
            bitmapM109567b = bitmapM20788k;
        }
        String absolutePath3 = cacheFile.getAbsolutePath();
        absolutePath3.getClass();
        bitmapM109567b.getClass();
        return new std0(strM198207g, absolutePath3, bitmapM109567b);
    }

    private final Integer calculateIndexFromDuration(float seekAt) {
        long[] jArr = this.durations;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (seekAt <= jArr[i]) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    private final float calculateSeekOffset(int index, float seekAt) {
        long[] jArr = this.durations;
        int i = index - 1;
        return (seekAt - ((i < 0 || i >= jArr.length) ? 0L : jArr[i])) / this.scenes.get(index).getDuration();
    }

    @JvmStatic
    @NotNull
    public static final TransitionEngineImpl create(@NotNull jcr jcrVar) {
        return INSTANCE.m20773c(jcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final std0 createScene(Uri uri) throws NoSuchAlgorithmException, FileNotFoundException {
        String str = this.baseDir;
        if (str == null) {
            Intrinsics.m87502r("baseDir");
            str = null;
        }
        String string = uri.toString();
        string.getClass();
        File file = new File(str, "image-" + vek0.m198207g(string) + ".jpg");
        Context context = this.context;
        if (context == null) {
            Intrinsics.m87502r("context");
            context = null;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (inputStreamOpenInputStream != null) {
            ByteStreamsKt.m87402b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
        }
        if (inputStreamOpenInputStream != null) {
            vek0.m198205e(inputStreamOpenInputStream);
        }
        vek0.m198206f(fileOutputStream);
        return assembleScene(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evaluateDuration() {
        List<std0> list = this.scenes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (std0 std0Var : list) {
            arrayList.add(Long.valueOf(std0Var.getDuration() + std0Var.getTransition().getCom.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType.duration java.lang.String()));
        }
        this.totalDuration = CollectionsKt.sumOfLong(arrayList);
        List<std0> list2 = this.scenes;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        long duration = 0;
        for (std0 std0Var2 : list2) {
            duration += std0Var2.getDuration() + std0Var2.getTransition().getCom.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType.duration java.lang.String();
            arrayList2.add(Long.valueOf(duration));
        }
        this.durations = CollectionsKt.toLongArray(arrayList2);
    }

    /* JADX INFO: renamed from: h */
    public static Unit m20755h(TransitionEngine.InterfaceC4326c interfaceC4326c) {
        interfaceC4326c.mo20751b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m20756i(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.eglCore = new cre(null, 1);
        return Unit.INSTANCE;
    }

    private final void initPreview(TextureView textureView, int previewWidth, int previewHeight) {
        this.textureView = textureView;
        this.previewWidth = previewWidth;
        this.previewHeight = previewHeight;
        this.userTextureListener = textureView.getSurfaceTextureListener();
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        surfaceTexture.getClass();
        createWindowSurface$android_release(surfaceTexture);
    }

    public static /* synthetic */ void initPreview$default(TransitionEngineImpl transitionEngineImpl, TextureView textureView, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 720;
        }
        if ((i3 & 4) != 0) {
            i2 = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        }
        transitionEngineImpl.initPreview(textureView, i, i2);
    }

    private final void initialize(jcr owner) {
        this.lifecycleOwner = owner;
        Companion companion = INSTANCE;
        Context contextM20775e = companion.m20775e(owner);
        this.context = contextM20775e;
        Context context = null;
        if (contextM20775e == null) {
            Intrinsics.m87502r("context");
            contextM20775e = null;
        }
        this.baseDir = companion.m20774d(contextM20775e);
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.m87502r("context");
        } else {
            context = context2;
        }
        this.bitmapCache = new d13(context);
        this.renderThread.start();
        this.renderHandler = new Handler(this.renderThread.getLooper());
        this.ioThread.start();
        this.ioHandler = new Handler(this.ioThread.getLooper());
        initializeEGL();
    }

    private final void initializeEGL() {
        render$android_release(new Function0() { // from class: l.f8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20756i(this.f96382a);
            }
        });
    }

    private final void internalExportVideo(String output, final TransitionEngine.InterfaceC4326c exportListener) {
        exportListener.mo20753d();
        this.videoComposer.m162453o(new r4l0(this.videoFormat, null, output, this.totalDuration), new Function1() { // from class: l.o8j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m20768t(exportListener, ((Float) obj).floatValue());
            }
        }, new Function0() { // from class: l.p8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20758j(exportListener);
            }
        }, new Function1() { // from class: l.q8j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m20762n(exportListener, (Throwable) obj);
            }
        }, new Function0() { // from class: l.r8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20755h(exportListener);
            }
        });
    }

    private final void internalPlay() {
        TransitionEngineImpl transitionEngineImpl = this;
        if (transitionEngineImpl.isPlaying) {
            return;
        }
        long jNanoTime = System.nanoTime();
        double frameRate = 1.0E9d / ((double) transitionEngineImpl.videoFormat.getFrameRate());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = transitionEngineImpl.totalDuration;
        transitionEngineImpl.isPlaying = true;
        float f = transitionEngineImpl.progress;
        double d = 0.0d;
        long j2 = jCurrentTimeMillis;
        while (transitionEngineImpl.isPlaying) {
            long j3 = jNanoTime;
            float fCurrentTimeMillis = (System.currentTimeMillis() - jCurrentTimeMillis) / j;
            long jCurrentTimeMillis2 = jCurrentTimeMillis;
            if (fCurrentTimeMillis >= 1.0d) {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            float fM198204d = vek0.m198204d(fCurrentTimeMillis, 0.0f, 1.0f);
            long jNanoTime2 = System.nanoTime();
            d += (jNanoTime2 - j3) / frameRate;
            if (d >= 1.0d) {
                float f2 = fM198204d + f;
                transitionEngineImpl.progress = f2;
                d -= 1.0d;
                transitionEngineImpl.playProgress.invoke(Float.valueOf(f2));
            }
            TransitionEngine.processFrame$android_release$default(transitionEngineImpl, true, transitionEngineImpl.progress, null, 4, null);
            if (System.currentTimeMillis() - j2 > 1000) {
                j2 += 1000;
            }
            transitionEngineImpl = this;
            jCurrentTimeMillis = jCurrentTimeMillis2;
            jNanoTime = jNanoTime2;
        }
    }

    private final void internalRender(float progress) {
        run(this.preDraw);
        float f = this.totalDuration * progress;
        Integer numCalculateIndexFromDuration = calculateIndexFromDuration(f);
        if (numCalculateIndexFromDuration != null) {
            int iIntValue = numCalculateIndexFromDuration.intValue();
            float fCalculateSeekOffset = calculateSeekOffset(iIntValue, f);
            std0 std0Var = this.scenes.get(iIntValue);
            final int texId = std0Var.getTexId();
            std0 std0Var2 = (std0) CollectionsKt.getOrNull(this.scenes, iIntValue + 1);
            final int texId2 = std0Var2 != null ? std0Var2.getTexId() : -1;
            final z8j0 z8j0Var = this.transitionRenders.get(std0Var.getTransition().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
            if (z8j0Var == null) {
                return;
            }
            z8j0Var.m217604C(vek0.m198208h(interpolateOffset(std0Var, fCalculateSeekOffset), 0.0f, 1.0f));
            renderFramebuffer(new Function0() { // from class: l.s8j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransitionEngineImpl.m20765q(z8j0Var, texId, texId2);
                }
            });
        }
    }

    private final float interpolateOffset(std0 scene, float offset) {
        float f = scene.getTransition().getCom.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType.duration java.lang.String() / scene.getDuration();
        return vek0.m198204d((offset - (1.0f - f)) / f, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: io */
    private final void m20757io(final Function0<Unit> runnable) {
        Handler handler = this.ioHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.j8j0
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionEngineImpl.m20767s(runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public static Unit m20758j(TransitionEngine.InterfaceC4326c interfaceC4326c) {
        interfaceC4326c.mo20752c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m20759k(TransitionEngineImpl transitionEngineImpl) {
        Iterator<T> it = transitionEngineImpl.scenes.iterator();
        while (it.hasNext()) {
            ((std0) it.next()).m185913e();
        }
        Iterator<T> it2 = transitionEngineImpl.transitionRenders.values().iterator();
        while (it2.hasNext()) {
            ((z8j0) it2.next()).m213395o();
        }
        cre creVar = transitionEngineImpl.eglCore;
        if (creVar != null) {
            creVar.m108359e();
        }
        transitionEngineImpl.renderThread.quitSafely();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m20760l(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.internalPlay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m20761m() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m20762n(TransitionEngine.InterfaceC4326c interfaceC4326c, Throwable th) {
        th.getClass();
        interfaceC4326c.mo20750a(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static Unit m20763o(float f) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m20764p(TransitionEngineImpl transitionEngineImpl, Surface surface, boolean z) {
        if (transitionEngineImpl.outputSurface == null) {
            a8q0 a8q0Var = new a8q0(transitionEngineImpl.requireEglCore$android_release(), surface, z);
            transitionEngineImpl.outputSurface = a8q0Var;
            a8q0Var.m108495b();
        }
        if (transitionEngineImpl.textureDrawer == null) {
            c9j0 c9j0Var = new c9j0();
            transitionEngineImpl.textureDrawer = c9j0Var;
            c9j0Var.m105853b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareDrawer() {
        this.preDraw.add(new RunnableC4334c());
    }

    private final void prepareOutputSurface() {
        TextureView textureView;
        if (this.prepared || (textureView = this.textureView) == null) {
            return;
        }
        if (textureView == null) {
            Intrinsics.m87502r("textureView");
            textureView = null;
        }
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        surfaceTexture.getClass();
        createWindowSurface$android_release(surfaceTexture);
        this.prepared = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processScene(std0 scene) {
        this.scenes.add(scene);
        this.preDraw.add(new RunnableC4335d(scene, this));
    }

    /* JADX INFO: renamed from: q */
    public static Unit m20765q(z8j0 z8j0Var, int i, int i2) {
        z8j0Var.m217608z(i, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static void m20766r(Function0 function0) {
        Object objM223820constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
    }

    private final void renderFramebuffer(Function0<Unit> draw) {
        GLES20.glViewport(0, 0, this.videoWidth, this.videoHeight);
        GLES20.glBindFramebuffer(36160, this.framebuffer);
        draw.invoke();
        GLES20.glBindFramebuffer(36160, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void renderFramebuffer$default(TransitionEngineImpl transitionEngineImpl, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: l.k8j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransitionEngineImpl.m20761m();
                }
            };
        }
        transitionEngineImpl.renderFramebuffer(function0);
    }

    private final void renderSurface(boolean renderSurface) {
        if (renderSurface) {
            a8q0 a8q0Var = this.outputSurface;
            a8q0 a8q0Var2 = null;
            if (a8q0Var == null) {
                Intrinsics.m87502r("outputSurface");
                a8q0Var = null;
            }
            a8q0Var.m108495b();
            c9j0 c9j0Var = this.textureDrawer;
            if (c9j0Var == null) {
                Intrinsics.m87502r("textureDrawer");
                c9j0Var = null;
            }
            c9j0Var.m105852a(this.outputTexId, this.previewWidth, this.previewHeight);
            a8q0 a8q0Var3 = this.outputSurface;
            if (a8q0Var3 == null) {
                Intrinsics.m87502r("outputSurface");
            } else {
                a8q0Var2 = a8q0Var3;
            }
            a8q0Var2.m108497d();
        }
    }

    private final void run(Queue<Runnable> runnables) {
        while (!runnables.isEmpty()) {
            Runnable runnablePoll = runnables.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m20767s(Function0 function0) {
        Object objM223820constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
        Result.m223823exceptionOrNullimpl(objM223820constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDefaultEndTransition() {
        setTransitionAt(CollectionsKt.getLastIndex(this.scenes), new wvf0());
    }

    private final void setVideoFormat(z4l0 z4l0Var) {
        this.videoWidth = z4l0Var.getWidth();
        this.videoHeight = z4l0Var.getHeight();
        this.videoFormat = z4l0Var;
    }

    /* JADX INFO: renamed from: t */
    public static Unit m20768t(TransitionEngine.InterfaceC4326c interfaceC4326c, float f) {
        interfaceC4326c.mo20754e(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static Unit m20769u(TransitionEngineImpl transitionEngineImpl, SurfaceTexture surfaceTexture) {
        if (transitionEngineImpl.outputSurface == null) {
            a8q0 a8q0Var = new a8q0(transitionEngineImpl.requireEglCore$android_release(), surfaceTexture);
            transitionEngineImpl.outputSurface = a8q0Var;
            a8q0Var.m108495b();
        }
        if (transitionEngineImpl.textureDrawer == null) {
            c9j0 c9j0Var = new c9j0();
            transitionEngineImpl.textureDrawer = c9j0Var;
            c9j0Var.m105853b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static Unit m20770v(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.ioThread.quitSafely();
        return Unit.INSTANCE;
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void assembleVideo(@NotNull r4l0 videoEntry, @NotNull TransitionEngine.InterfaceC4325b assembleListener) {
        videoEntry.getClass();
        assembleListener.getClass();
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void cancel() {
        this.videoComposer.m162446g();
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void createWindowSurface$android_release(@NotNull final SurfaceTexture texture) {
        texture.getClass();
        render$android_release(new Function0() { // from class: l.n8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20769u(this.f137655a, texture);
            }
        });
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void exportVideo(@NotNull String output, @NotNull TransitionEngine.InterfaceC4326c exportListener) {
        output.getClass();
        exportListener.getClass();
        internalExportVideo(output, exportListener);
    }

    @NotNull
    public final Function1<Float, Unit> getPlayProgress() {
        return this.playProgress;
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    @NotNull
    public InterfaceC15486o launch$android_release(@NotNull CoroutineDispatcher dispatcher, @NotNull Function0<Unit> runnable) {
        dispatcher.getClass();
        runnable.getClass();
        jcr jcrVar = this.lifecycleOwner;
        if (jcrVar == null) {
            Intrinsics.m87502r("lifecycleOwner");
            jcrVar = null;
        }
        return jh3.m141367d(kcr.m145604a(jcrVar), dispatcher.plus(this.exceptionHandler), null, new TransitionEngineImpl$launch$1(runnable, null), 2, null);
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void loadImageFromPath(@Nullable List<String> images, @NotNull z4l0 format, @NotNull Function1<? super Long, Unit> onLoaded) {
        format.getClass();
        onLoaded.getClass();
        if (images != null) {
            applyPathData(images, onLoaded);
        }
        setVideoFormat(format);
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void loadImageFromUri(@Nullable List<? extends Uri> uris, @NotNull z4l0 format, @NotNull Function1<? super Long, Unit> onLoaded) {
        format.getClass();
        onLoaded.getClass();
        if (uris != null) {
            applyUriData(uris);
        }
        setVideoFormat(format);
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine, androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull jcr owner) {
        owner.getClass();
        initialize(owner);
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull jcr owner) {
        owner.getClass();
        release();
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void pause() {
        this.isPlaying = false;
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void play(@NotNull Function1<? super Float, Unit> progress) {
        progress.getClass();
        this.playProgress = progress;
        render$android_release(new Function0() { // from class: l.e8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20760l(this.f89831a);
            }
        });
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void processFrame$android_release(boolean renderToSurface, float progress, @NotNull Function1<? super Integer, Unit> onDraw) {
        onDraw.getClass();
        prepareOutputSurface();
        internalRender(progress);
        renderSurface(renderToSurface);
        onDraw.invoke(Integer.valueOf(this.outputTexId));
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void release() {
        this.isPlaying = false;
        cancel();
        render$android_release(new Function0() { // from class: l.l8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20759k(this.f126832a);
            }
        });
        m20757io(new Function0() { // from class: l.m8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20770v(this.f132581a);
            }
        });
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void render$android_release(@NotNull final Function0<Unit> runnable) {
        runnable.getClass();
        Handler handler = this.renderHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.i8j0
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionEngineImpl.m20766r(runnable);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    @NotNull
    public cre requireEglCore$android_release() {
        cre creVar = this.eglCore;
        if (creVar != null) {
            return creVar;
        }
        ig3.m135964a("Required value was null.");
        return null;
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void setLogger(@NotNull Function0<Unit> log) {
        log.getClass();
    }

    public final void setPlayProgress(@NotNull Function1<? super Float, Unit> function1) {
        function1.getClass();
        this.playProgress = function1;
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void setPreview(@NotNull TextureView textureView, int previewWidth, int previewHeight) {
        textureView.getClass();
        initPreview(textureView, previewWidth, previewHeight);
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void setTransitionAt(int index, @NotNull w7j0 transition) {
        transition.getClass();
        if (index < 0 || index >= this.scenes.size()) {
            ig3.m135964a("index out of range");
        } else {
            this.scenes.get(index).m185914f(transition);
            this.preDraw.add(new RunnableC4336e(transition));
        }
    }

    @Override // com.p046p1.mobile.android.media.gltransition.TransitionEngine
    public void createWindowSurface$android_release(@NotNull final Surface surface, final boolean release) {
        surface.getClass();
        render$android_release(new Function0() { // from class: l.h8j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m20764p(this.f106445a, surface, release);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final std0 createScene(String path) throws NoSuchAlgorithmException {
        String str = this.baseDir;
        if (str == null) {
            Intrinsics.m87502r("baseDir");
            str = null;
        }
        File file = new File(str, "image-" + vek0.m198207g(path) + ".jpg");
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteStreamsKt.m87402b(fileInputStream, fileOutputStream, 0, 2, null);
        vek0.m198205e(fileInputStream);
        vek0.m198206f(fileOutputStream);
        return assembleScene(file);
    }
}
