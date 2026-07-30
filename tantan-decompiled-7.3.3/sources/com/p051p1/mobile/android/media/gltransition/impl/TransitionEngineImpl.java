package com.p051p1.mobile.android.media.gltransition.impl;

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
import com.p051p1.mobile.android.media.gltransition.TransitionEngine;
import com.p051p1.mobile.android.media.gltransition.impl.TransitionEngineImpl;
import com.p051p1.mobile.android.media.gltransition.utils.BitmapProcessor;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.BLiveOpenStatus;
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
import kotlin.p122io.ByteStreamsKt;
import kotlin.ranges.C15274a;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ahj0;
import p153l.aui;
import p153l.bok0;
import p153l.bui;
import p153l.cij0;
import p153l.del0;
import p153l.dij0;
import p153l.drb;
import p153l.f4g0;
import p153l.fhq0;
import p153l.fij0;
import p153l.fui;
import p153l.g1m;
import p153l.gij0;
import p153l.gse;
import p153l.hij0;
import p153l.ifj;
import p153l.ker;
import p153l.ler;
import p153l.p7f;
import p153l.r5e;
import p153l.s13;
import p153l.tcl0;
import p153l.u1e0;
import p153l.uyp;
import p153l.vdl0;
import p153l.wg3;
import p153l.wtq0;
import p153l.xh3;
import p153l.xqb;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88120d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Î\u00012\u00020\u0001:\u0002Ï\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J3\u0010.\u001a\u00020-2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0003¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020-2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(H\u0003¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020#2\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u00020#2\u0006\u00108\u001a\u000200H\u0002¢\u0006\u0004\b6\u00109J\u0017\u0010<\u001a\u00020#2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0003J\u001f\u0010C\u001a\u00020\b2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010K\u001a\u00020\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002¢\u0006\u0004\bK\u0010LJ \u0010M\u001a\u00020\b2\u000e\b\u0004\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0082\b¢\u0006\u0004\bM\u0010DJ\u001d\u0010O\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0002¢\u0006\u0004\bO\u0010DJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010\u000eJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bQ\u0010\u000eJ\u001d\u0010S\u001a\u00020\b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0016¢\u0006\u0004\bS\u0010DJ;\u0010V\u001a\u00020\b2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(2\u0006\u0010U\u001a\u00020T2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\bV\u0010WJ;\u0010Y\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(2\u0006\u0010U\u001a\u00020T2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\bY\u0010WJ'\u0010Z\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\bZ\u0010\u0016J#\u0010[\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\bH\u0016¢\u0006\u0004\b]\u0010\u0003J\u001f\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010\nJ\u001f\u0010c\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010\u0003J\u001d\u0010k\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0010¢\u0006\u0004\bj\u0010DJ%\u0010p\u001a\u00020-2\u0006\u0010m\u001a\u00020l2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0010¢\u0006\u0004\bn\u0010oJ\u0017\u0010u\u001a\u00020\b2\u0006\u0010r\u001a\u00020qH\u0010¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020\b2\u0006\u0010w\u001a\u00020v2\u0006\u0010x\u001a\u00020EH\u0010¢\u0006\u0004\bs\u0010yJ\u000f\u0010}\u001a\u00020zH\u0010¢\u0006\u0004\b{\u0010|J\u000f\u0010x\u001a\u00020\bH\u0016¢\u0006\u0004\bx\u0010\u0003J6\u0010\u0082\u0001\u001a\u00020\b2\u0006\u0010~\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0*H\u0010¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R#\u0010\u0088\u0001\u001a\f\u0018\u00010\u0086\u0001j\u0005\u0018\u0001`\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010\u009d\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010\u009f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R \u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020#0 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020e0(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u009e\u0001R'\u0010¥\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030¤\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010ª\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0017\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0011\u0010¬\u0001R\u001a\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001c\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001d\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010·\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001a\u0010º\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010²\u0001R\u0017\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010½\u0001R4\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0005\bÂ\u0001\u0010\\R\u0019\u0010Ã\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010\u008e\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u008e\u0001R\u0017\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u008e\u0001R\u0017\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u008e\u0001R*\u0010Æ\u0001\u001a\u00020T2\u0007\u0010Å\u0001\u001a\u00020T8\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ë\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010¸\u0001¨\u0006Ð\u0001"}, m88121d2 = {"Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "<init>", "()V", "", "output", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;", "exportListener", "", "internalExportVideo", "(Ljava/lang/String;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;)V", "Ll/ker;", Owner.TYPE, "initialize", "(Ll/ker;)V", "initializeEGL", "Landroid/view/TextureView;", "textureView", "", "previewWidth", "previewHeight", "initPreview", "(Landroid/view/TextureView;II)V", "internalPlay", "prepareOutputSurface", "", "progress", "internalRender", "(F)V", "seekAt", "calculateIndexFromDuration", "(F)Ljava/lang/Integer;", FirebaseAnalytics.Param.INDEX, "calculateSeekOffset", "(IF)F", "Ll/u1e0;", "scene", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "interpolateOffset", "(Ll/u1e0;F)F", "", "images", "Lkotlin/Function1;", "", "onLoaded", "Lkotlinx/coroutines/o;", "applyPathData", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/o;", "Landroid/net/Uri;", "applyUriData", "(Ljava/util/List;)Lkotlinx/coroutines/o;", "processScene", "(Ll/u1e0;)V", "path", "createScene", "(Ljava/lang/String;)Ll/u1e0;", "uri", "(Landroid/net/Uri;)Ll/u1e0;", "Ljava/io/File;", "cacheFile", "assembleScene", "(Ljava/io/File;)Ll/u1e0;", "evaluateDuration", "setDefaultEndTransition", "prepareDrawer", "Lkotlin/Function0;", BLiveOpenStatus.draw, "renderFramebuffer", "(Lkotlin/jvm/functions/Function0;)V", "", "renderSurface", "(Z)V", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "runnables", "run", "(Ljava/util/Queue;)V", "addPreDrawQueue", "runnable", "io", "onCreate", "onDestroy", "log", "setLogger", "Ll/del0;", "format", "loadImageFromPath", "(Ljava/util/List;Ll/del0;Lkotlin/jvm/functions/Function1;)V", "uris", "loadImageFromUri", "setPreview", "play", "(Lkotlin/jvm/functions/Function1;)V", "pause", "exportVideo", "Ll/vdl0;", "videoEntry", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;", "assembleListener", "assembleVideo", "(Ll/vdl0;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;)V", "Ll/ahj0;", "transition", "setTransitionAt", "(ILl/ahj0;)V", "cancel", "render$android_release", "render", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "launch$android_release", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/o;", "launch", "Landroid/graphics/SurfaceTexture;", "texture", "createWindowSurface$android_release", "(Landroid/graphics/SurfaceTexture;)V", "createWindowSurface", "Landroid/view/Surface;", "surface", "release", "(Landroid/view/Surface;Z)V", "Ll/gse;", "requireEglCore$android_release", "()Ll/gse;", "requireEglCore", "renderToSurface", "onDraw", "processFrame$android_release", "(ZFLkotlin/jvm/functions/Function1;)V", "processFrame", "Ll/xqb;", "exceptionHandler", "Ll/xqb;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/p1/mobile/android/media/gltransition/TextureListener;", "userTextureListener", "Landroid/view/TextureView$SurfaceTextureListener;", "Ll/fhq0;", "outputSurface", "Ll/fhq0;", "framebuffer", "I", "outputTexId", "Ll/gij0;", "textureDrawer", "Ll/gij0;", "lifecycleOwner", "Ll/ker;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "baseDir", "Ljava/lang/String;", "Ll/s13;", "bitmapCache", "Ll/s13;", "imageUris", "Ljava/util/List;", "imagePaths", "", "scenes", "transitions", "", "Ll/dij0;", "transitionRenders", "Ljava/util/Map;", "totalDuration", "J", "", "durations", "[J", "Landroid/view/TextureView;", "Ll/hij0;", "renderThread", "Ll/hij0;", "Landroid/os/Handler;", "renderHandler", "Landroid/os/Handler;", "eglCore", "Ll/gse;", "preDraw", "Ljava/util/Queue;", "isPlaying", "Z", "Ll/g1m;", "ioThread", "Ll/g1m;", "ioHandler", "F", "playProgress", "Lkotlin/jvm/functions/Function1;", "getPlayProgress", "()Lkotlin/jvm/functions/Function1;", "setPlayProgress", "videoWidth", "videoHeight", "value", "videoFormat", "Ll/del0;", "setVideoFormat", "(Ll/del0;)V", "Ll/tcl0;", "videoComposer", "Ll/tcl0;", "prepared", "Companion", "a", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TransitionEngineImpl extends TransitionEngine {

    @NotNull
    private static final String BASE_DIR = "image.video";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private String baseDir;
    private s13 bitmapCache;
    private Context context;

    @NotNull
    private long[] durations;

    @Nullable
    private gse eglCore;

    @Nullable
    private List<String> imagePaths;

    @Nullable
    private List<? extends Uri> imageUris;

    @Nullable
    private Handler ioHandler;

    @NotNull
    private g1m ioThread;
    private boolean isPlaying;
    private ker lifecycleOwner;
    private fhq0 outputSurface;

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
    private hij0 renderThread;
    private gij0 textureDrawer;
    private TextureView textureView;
    private long totalDuration;

    @NotNull
    private Map<String, dij0> transitionRenders;

    @NotNull
    private List<? extends ahj0> transitions;

    @Nullable
    private TextureView.SurfaceTextureListener userTextureListener;

    @NotNull
    private final tcl0 videoComposer;

    @NotNull
    private del0 videoFormat;
    private int videoHeight;
    private int videoWidth;

    @NotNull
    private final xqb exceptionHandler = new C4488f(xqb.INSTANCE);
    private int framebuffer = -1;
    private int outputTexId = -1;

    @NotNull
    private List<u1e0> scenes = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl$a;", "", "<init>", "()V", "Ll/ker;", Owner.TYPE, "Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "c", "(Ll/ker;)Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "Landroid/content/Context;", "e", "(Ll/ker;)Landroid/content/Context;", "context", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;)Ljava/lang/String;", "BASE_DIR", "Ljava/lang/String;", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final TransitionEngineImpl m21772c(@NotNull ker owner) {
            owner.getClass();
            TransitionEngineImpl transitionEngineImpl = new TransitionEngineImpl();
            owner.getLifecycle().mo2967a(transitionEngineImpl);
            return transitionEngineImpl;
        }

        /* JADX INFO: renamed from: d */
        public final String m21773d(Context context) {
            File file = new File(context.getExternalCacheDir(), TransitionEngineImpl.BASE_DIR);
            if (!file.exists() && !file.mkdirs()) {
                wtq0.m207906a("mkdirs failed");
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public final Context m21774e(ker owner) {
            if (owner instanceof Activity) {
                Context applicationContext = ((ContextWrapper) owner).getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            }
            if (!(owner instanceof Fragment)) {
                wg3.m206174a("owner should be Activity or Fragment");
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
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
    @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1", m88263f = "TransitionEngineImpl.kt", m88264l = {400}, m88265m = "invokeSuspend", m88266v = 1)
    @SourceDebugExtension
    public static final class C44791 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $images;
        final /* synthetic */ Function1<Long, Unit> $onLoaded;
        int label;
        final /* synthetic */ TransitionEngineImpl this$0;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$4, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "Ll/u1e0;", "", Careers.f39580it, "", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
        @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$4", m88263f = "TransitionEngineImpl.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
        public static final class AnonymousClass4 extends SuspendLambda implements Function3<bui<? super u1e0>, Throwable, Continuation<? super Unit>, Object> {
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
            public final Object invoke(bui<? super u1e0> buiVar, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass4(this.this$0, this.$onLoaded, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uyp.m198688e();
                if (this.label != 0) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
                this.this$0.evaluateDuration();
                this.this$0.setDefaultEndTransition();
                this.this$0.prepareDrawer();
                this.$onLoaded.invoke(Boxing.m88261c(this.this$0.totalDuration));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$5, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "Ll/u1e0;", "", "e", "", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
        @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$5", m88263f = "TransitionEngineImpl.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
        public static final class AnonymousClass5 extends SuspendLambda implements Function3<bui<? super u1e0>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(bui<? super u1e0> buiVar, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.L$0 = th;
                return anonymousClass5.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uyp.m198688e();
                if (this.label == 0) {
                    ResultKt.m88128b(obj);
                    return Unit.INSTANCE;
                }
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$a */
        @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
        public static final class a<T> implements bui {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TransitionEngineImpl f16319a;

            public a(TransitionEngineImpl transitionEngineImpl) {
                this.f16319a = transitionEngineImpl;
            }

            @Override // p153l.bui
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(u1e0 u1e0Var, Continuation<? super Unit> continuation) {
                this.f16319a.processScene(u1e0Var);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C44791(List<String> list, TransitionEngineImpl transitionEngineImpl, Function1<? super Long, Unit> function1, Continuation<? super C44791> continuation) {
            super(2, continuation);
            this.$images = list;
            this.this$0 = transitionEngineImpl;
            this.$onLoaded = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C44791(this.$images, this.this$0, this.$onLoaded, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C44791) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            aui auiVarM127499w;
            aui auiVarM127467D;
            aui auiVarM127482f;
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                List<String> list = this.$images;
                if (list != null) {
                    this.this$0.imagePaths = list;
                    final aui auiVarM127477a = fui.m127477a(list);
                    if (auiVarM127477a != null && (auiVarM127499w = fui.m127499w(new C4481xfc914da3(new aui<String>() { // from class: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        @Metadata(m88120d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/dvi", "<anonymous>"}, m88122k = 3, m88123mv = {2, 2, 0})
                        @SourceDebugExtension
                        public static final class AnonymousClass2<T> implements bui {

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ bui f16321a;

                            /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
                            @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2", m88263f = "TransitionEngineImpl.kt", m88264l = {223}, m88265m = "emit", m88266v = 1)
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

                            public AnonymousClass2(bui buiVar) {
                                this.f16321a = buiVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Override // p153l.bui
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
                                Object objM198688e = uyp.m198688e();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.m88128b(obj2);
                                    bui buiVar = this.f16321a;
                                    if (new File((String) obj).exists()) {
                                        anonymousClass1.L$0 = SpillingKt.m88273a(obj);
                                        anonymousClass1.L$1 = SpillingKt.m88273a(anonymousClass1);
                                        anonymousClass1.L$2 = SpillingKt.m88273a(obj);
                                        anonymousClass1.L$3 = SpillingKt.m88273a(buiVar);
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        if (buiVar.emit(obj, anonymousClass1) == objM198688e) {
                                            return objM198688e;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    ResultKt.m88128b(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // p153l.aui
                        @Nullable
                        public Object collect(@NotNull bui<? super String> buiVar, @NotNull Continuation continuation) {
                            Object objCollect = auiVarM127477a.collect(new AnonymousClass2(buiVar), continuation);
                            return objCollect == uyp.m198688e() ? objCollect : Unit.INSTANCE;
                        }
                    }, null, this.this$0))) != null && (auiVarM127467D = fui.m127467D(auiVarM127499w, new AnonymousClass4(this.this$0, this.$onLoaded, null))) != null && (auiVarM127482f = fui.m127482f(auiVarM127467D, new AnonymousClass5(null))) != null) {
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (auiVarM127482f.collect(aVar, this) == objM198688e) {
                            return objM198688e;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
    @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1", m88263f = "TransitionEngineImpl.kt", m88264l = {419}, m88265m = "invokeSuspend", m88266v = 1)
    @SourceDebugExtension
    public static final class C44821 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Uri> $images;
        int label;
        final /* synthetic */ TransitionEngineImpl this$0;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$3, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "Ll/u1e0;", "", Careers.f39580it, "", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
        @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$3", m88263f = "TransitionEngineImpl.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<bui<? super u1e0>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TransitionEngineImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TransitionEngineImpl transitionEngineImpl, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = transitionEngineImpl;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(bui<? super u1e0> buiVar, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass3(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uyp.m198688e();
                if (this.label != 0) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
                this.this$0.evaluateDuration();
                this.this$0.setDefaultEndTransition();
                this.this$0.prepareDrawer();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$4, reason: invalid class name */
        @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"Ll/bui;", "Ll/u1e0;", "", "e", "", "<anonymous>", "(Ll/bui;Ljava/lang/Throwable;)V"}, m88122k = 3, m88123mv = {2, 2, 0})
        @DebugMetadata(m88262c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$4", m88263f = "TransitionEngineImpl.kt", m88264l = {}, m88265m = "invokeSuspend", m88266v = 1)
        public static final class AnonymousClass4 extends SuspendLambda implements Function3<bui<? super u1e0>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(bui<? super u1e0> buiVar, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = th;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                uyp.m198688e();
                if (this.label == 0) {
                    ResultKt.m88128b(obj);
                    return Unit.INSTANCE;
                }
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$a */
        @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
        public static final class a<T> implements bui {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TransitionEngineImpl f16324a;

            public a(TransitionEngineImpl transitionEngineImpl) {
                this.f16324a = transitionEngineImpl;
            }

            @Override // p153l.bui
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(u1e0 u1e0Var, Continuation<? super Unit> continuation) {
                this.f16324a.processScene(u1e0Var);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C44821(List<? extends Uri> list, TransitionEngineImpl transitionEngineImpl, Continuation<? super C44821> continuation) {
            super(2, continuation);
            this.$images = list;
            this.this$0 = transitionEngineImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C44821(this.$images, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C44821) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            aui auiVarM127499w;
            aui auiVarM127467D;
            aui auiVarM127482f;
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            if (i == 0) {
                ResultKt.m88128b(obj);
                List<Uri> list = this.$images;
                if (list != null) {
                    this.this$0.imageUris = list;
                    aui auiVarM127477a = fui.m127477a(list);
                    if (auiVarM127477a != null && (auiVarM127499w = fui.m127499w(new C4483xe01cfc1e(auiVarM127477a, null, this.this$0))) != null && (auiVarM127467D = fui.m127467D(auiVarM127499w, new AnonymousClass3(this.this$0, null))) != null && (auiVarM127482f = fui.m127482f(auiVarM127467D, new AnonymousClass4(null))) != null) {
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (auiVarM127482f.collect(aVar, this) == objM198688e) {
                            return objM198688e;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$b */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4484b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f16327a;

        public RunnableC4484b(Function0<Unit> function0) {
            this.f16327a = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM225066constructorimpl;
            Function0<Unit> function0 = this.f16327a;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$c */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4485c implements Runnable {
        public RunnableC4485c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM225066constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (TransitionEngineImpl.this.outputTexId == -1) {
                    int width = TransitionEngineImpl.this.videoFormat.getWidth();
                    int height = TransitionEngineImpl.this.videoFormat.getHeight();
                    TransitionEngineImpl transitionEngineImpl = TransitionEngineImpl.this;
                    ifj ifjVar = ifj.INSTANCE;
                    transitionEngineImpl.outputTexId = ifjVar.m139735f();
                    TransitionEngineImpl transitionEngineImpl2 = TransitionEngineImpl.this;
                    transitionEngineImpl2.framebuffer = ifjVar.m139734e(width, height, transitionEngineImpl2.outputTexId);
                }
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$d */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4486d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ u1e0 f16329a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TransitionEngineImpl f16330b;

        public RunnableC4486d(u1e0 u1e0Var, TransitionEngineImpl transitionEngineImpl) {
            this.f16329a = u1e0Var;
            this.f16330b = transitionEngineImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM225066constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                this.f16329a.m193960g();
                dij0 dij0Var = (dij0) this.f16330b.transitionRenders.get(this.f16329a.getTransition().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (dij0Var != null) {
                    dij0Var.m115890E();
                }
                dij0 dij0Var2 = (dij0) this.f16330b.transitionRenders.get(this.f16329a.getTransition().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (dij0Var2 != null) {
                    dij0Var2.m115889D();
                }
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$e */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class RunnableC4487e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ahj0 f16332b;

        public RunnableC4487e(ahj0 ahj0Var) {
            this.f16332b = ahj0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objM225066constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                dij0 dij0Var = (dij0) TransitionEngineImpl.this.transitionRenders.get(this.f16332b.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (dij0Var != null) {
                    dij0Var.m115890E();
                }
                dij0 dij0Var2 = (dij0) TransitionEngineImpl.this.transitionRenders.get(this.f16332b.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
                if (dij0Var2 != null) {
                    dij0Var2.m115889D();
                }
                objM225066constructorimpl = Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$f */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"com/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl$f", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Ll/xqb;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C4488f extends AbstractCoroutineContextElement implements xqb {
        public C4488f(xqb.Companion companion) {
            super(companion);
        }

        @Override // p153l.xqb
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            bok0.m105698b("[exceptionHandler] error: " + exception, null, 2, null);
        }
    }

    public TransitionEngineImpl() {
        List<ahj0> listM125685b = fij0.INSTANCE.m125685b();
        this.transitions = listM125685b;
        List<ahj0> list = listM125685b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (ahj0 ahj0Var : list) {
            Pair pairM88129a = TuplesKt.m88129a(ahj0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), cij0.INSTANCE.m109902a(ahj0Var));
            linkedHashMap.put(pairM88129a.getFirst(), pairM88129a.getSecond());
        }
        this.transitionRenders = linkedHashMap;
        this.durations = new long[0];
        this.renderThread = new hij0();
        this.preDraw = new LinkedList();
        this.ioThread = new g1m();
        this.playProgress = new Function1() { // from class: l.khj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m21762o(((Float) obj).floatValue());
            }
        };
        this.videoWidth = 720;
        this.videoHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.previewWidth = 720;
        this.previewHeight = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        this.videoFormat = del0.INSTANCE.m115433b();
        this.videoComposer = new tcl0(this);
    }

    private final void addPreDrawQueue(Function0<Unit> run) {
        this.preDraw.add(new RunnableC4484b(run));
    }

    private final InterfaceC15593o applyPathData(List<String> images, Function1<? super Long, Unit> onLoaded) {
        ker kerVar = this.lifecycleOwner;
        if (kerVar == null) {
            Intrinsics.m88391r("lifecycleOwner");
            kerVar = null;
        }
        return xh3.m210980d(ler.m153935a(kerVar), r5e.m179861b(), null, new C44791(images, this, onLoaded, null), 2, null);
    }

    private final InterfaceC15593o applyUriData(List<? extends Uri> images) {
        ker kerVar = this.lifecycleOwner;
        if (kerVar == null) {
            Intrinsics.m88391r("lifecycleOwner");
            kerVar = null;
        }
        return xh3.m210980d(ler.m153935a(kerVar), r5e.m179861b(), null, new C44821(images, this, null), 2, null);
    }

    private final u1e0 assembleScene(File cacheFile) throws NoSuchAlgorithmException, IOException {
        s13 s13Var;
        Object next;
        Bitmap bitmapM184013b;
        String absolutePath = cacheFile.getAbsolutePath();
        absolutePath.getClass();
        String strM105703g = bok0.m105703g(absolutePath);
        Iterator<T> it = this.scenes.iterator();
        do {
            s13Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m88377d(((u1e0) next).getId(), strM105703g));
        u1e0 u1e0Var = (u1e0) next;
        if (u1e0Var != null) {
            return u1e0Var;
        }
        BitmapProcessor.CropType cropType = BitmapProcessor.CropType.FIT_CENTER;
        s13 s13Var2 = this.bitmapCache;
        if (s13Var2 == null) {
            Intrinsics.m88391r("bitmapCache");
            s13Var2 = null;
        }
        if (s13Var2.m184012a(strM105703g + cropType.key())) {
            s13 s13Var3 = this.bitmapCache;
            if (s13Var3 == null) {
                Intrinsics.m88391r("bitmapCache");
            } else {
                s13Var = s13Var3;
            }
            bitmapM184013b = s13Var.m184013b(strM105703g + cropType.key());
        } else {
            BitmapProcessor.Companion companion = BitmapProcessor.INSTANCE;
            String absolutePath2 = cacheFile.getAbsolutePath();
            absolutePath2.getClass();
            BitmapProcessor bitmapProcessor = new BitmapProcessor(companion.m21790b(absolutePath2));
            bitmapProcessor.m21788l(this.videoFormat.getWidth(), this.videoFormat.getHeight(), this.videoFormat.getBgColor());
            Bitmap bitmapM21787k = bitmapProcessor.m21787k();
            s13 s13Var4 = this.bitmapCache;
            if (s13Var4 == null) {
                Intrinsics.m88391r("bitmapCache");
            } else {
                s13Var = s13Var4;
            }
            s13Var.m184014c(strM105703g + cropType.key(), bitmapM21787k);
            bitmapM184013b = bitmapM21787k;
        }
        String absolutePath3 = cacheFile.getAbsolutePath();
        absolutePath3.getClass();
        bitmapM184013b.getClass();
        return new u1e0(strM105703g, absolutePath3, bitmapM184013b);
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
    public static final TransitionEngineImpl create(@NotNull ker kerVar) {
        return INSTANCE.m21772c(kerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u1e0 createScene(Uri uri) throws NoSuchAlgorithmException, FileNotFoundException {
        String str = this.baseDir;
        if (str == null) {
            Intrinsics.m88391r("baseDir");
            str = null;
        }
        String string = uri.toString();
        string.getClass();
        File file = new File(str, "image-" + bok0.m105703g(string) + ".jpg");
        Context context = this.context;
        if (context == null) {
            Intrinsics.m88391r("context");
            context = null;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (inputStreamOpenInputStream != null) {
            ByteStreamsKt.m88291b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
        }
        if (inputStreamOpenInputStream != null) {
            bok0.m105701e(inputStreamOpenInputStream);
        }
        bok0.m105702f(fileOutputStream);
        return assembleScene(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evaluateDuration() {
        List<u1e0> list = this.scenes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (u1e0 u1e0Var : list) {
            arrayList.add(Long.valueOf(u1e0Var.getDuration() + u1e0Var.getTransition().getCom.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType.duration java.lang.String()));
        }
        this.totalDuration = CollectionsKt.sumOfLong(arrayList);
        List<u1e0> list2 = this.scenes;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        long duration = 0;
        for (u1e0 u1e0Var2 : list2) {
            duration += u1e0Var2.getDuration() + u1e0Var2.getTransition().getCom.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType.duration java.lang.String();
            arrayList2.add(Long.valueOf(duration));
        }
        this.durations = CollectionsKt.toLongArray(arrayList2);
    }

    /* JADX INFO: renamed from: h */
    public static Unit m21754h(TransitionEngine.InterfaceC4477c interfaceC4477c) {
        interfaceC4477c.mo21750b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m21755i(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.eglCore = new gse(null, 1);
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

    private final void initialize(ker owner) {
        this.lifecycleOwner = owner;
        Companion companion = INSTANCE;
        Context contextM21774e = companion.m21774e(owner);
        this.context = contextM21774e;
        Context context = null;
        if (contextM21774e == null) {
            Intrinsics.m88391r("context");
            contextM21774e = null;
        }
        this.baseDir = companion.m21773d(contextM21774e);
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.m88391r("context");
        } else {
            context = context2;
        }
        this.bitmapCache = new s13(context);
        this.renderThread.start();
        this.renderHandler = new Handler(this.renderThread.getLooper());
        this.ioThread.start();
        this.ioHandler = new Handler(this.ioThread.getLooper());
        initializeEGL();
    }

    private final void initializeEGL() {
        render$android_release(new Function0() { // from class: l.jhj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21755i(this.f120978a);
            }
        });
    }

    private final void internalExportVideo(String output, final TransitionEngine.InterfaceC4477c exportListener) {
        exportListener.mo21752d();
        this.videoComposer.m190465o(new vdl0(this.videoFormat, null, output, this.totalDuration), new Function1() { // from class: l.shj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m21767t(exportListener, ((Float) obj).floatValue());
            }
        }, new Function0() { // from class: l.thj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21757j(exportListener);
            }
        }, new Function1() { // from class: l.uhj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m21761n(exportListener, (Throwable) obj);
            }
        }, new Function0() { // from class: l.vhj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21754h(exportListener);
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
            float fM105700d = bok0.m105700d(fCurrentTimeMillis, 0.0f, 1.0f);
            long jNanoTime2 = System.nanoTime();
            d += (jNanoTime2 - j3) / frameRate;
            if (d >= 1.0d) {
                float f2 = fM105700d + f;
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
            u1e0 u1e0Var = this.scenes.get(iIntValue);
            final int texId = u1e0Var.getTexId();
            u1e0 u1e0Var2 = (u1e0) CollectionsKt.getOrNull(this.scenes, iIntValue + 1);
            final int texId2 = u1e0Var2 != null ? u1e0Var2.getTexId() : -1;
            final dij0 dij0Var = this.transitionRenders.get(u1e0Var.getTransition().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
            if (dij0Var == null) {
                return;
            }
            dij0Var.m115888C(bok0.m105704h(interpolateOffset(u1e0Var, fCalculateSeekOffset), 0.0f, 1.0f));
            renderFramebuffer(new Function0() { // from class: l.whj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransitionEngineImpl.m21764q(dij0Var, texId, texId2);
                }
            });
        }
    }

    private final float interpolateOffset(u1e0 scene, float offset) {
        float f = scene.getTransition().getCom.p1.mobile.putong.live.base.data.BLiveOperationTitleShowType.duration java.lang.String() / scene.getDuration();
        return bok0.m105700d((offset - (1.0f - f)) / f, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: io */
    private final void m21756io(final Function0<Unit> runnable) {
        Handler handler = this.ioHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.nhj0
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionEngineImpl.m21766s(runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public static Unit m21757j(TransitionEngine.InterfaceC4477c interfaceC4477c) {
        interfaceC4477c.mo21751c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m21758k(TransitionEngineImpl transitionEngineImpl) {
        Iterator<T> it = transitionEngineImpl.scenes.iterator();
        while (it.hasNext()) {
            ((u1e0) it.next()).m193958e();
        }
        Iterator<T> it2 = transitionEngineImpl.transitionRenders.values().iterator();
        while (it2.hasNext()) {
            ((dij0) it2.next()).m109891o();
        }
        gse gseVar = transitionEngineImpl.eglCore;
        if (gseVar != null) {
            gseVar.m132032e();
        }
        transitionEngineImpl.renderThread.quitSafely();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m21759l(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.internalPlay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m21760m() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m21761n(TransitionEngine.InterfaceC4477c interfaceC4477c, Throwable th) {
        th.getClass();
        interfaceC4477c.mo21749a(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static Unit m21762o(float f) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m21763p(TransitionEngineImpl transitionEngineImpl, Surface surface, boolean z) {
        if (transitionEngineImpl.outputSurface == null) {
            fhq0 fhq0Var = new fhq0(transitionEngineImpl.requireEglCore$android_release(), surface, z);
            transitionEngineImpl.outputSurface = fhq0Var;
            fhq0Var.m132220b();
        }
        if (transitionEngineImpl.textureDrawer == null) {
            gij0 gij0Var = new gij0();
            transitionEngineImpl.textureDrawer = gij0Var;
            gij0Var.m130325b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareDrawer() {
        this.preDraw.add(new RunnableC4485c());
    }

    private final void prepareOutputSurface() {
        TextureView textureView;
        if (this.prepared || (textureView = this.textureView) == null) {
            return;
        }
        if (textureView == null) {
            Intrinsics.m88391r("textureView");
            textureView = null;
        }
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        surfaceTexture.getClass();
        createWindowSurface$android_release(surfaceTexture);
        this.prepared = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processScene(u1e0 scene) {
        this.scenes.add(scene);
        this.preDraw.add(new RunnableC4486d(scene, this));
    }

    /* JADX INFO: renamed from: q */
    public static Unit m21764q(dij0 dij0Var, int i, int i2) {
        dij0Var.m115892z(i, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static void m21765r(Function0 function0) {
        Object objM225066constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
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
            function0 = new Function0() { // from class: l.ohj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransitionEngineImpl.m21760m();
                }
            };
        }
        transitionEngineImpl.renderFramebuffer(function0);
    }

    private final void renderSurface(boolean renderSurface) {
        if (renderSurface) {
            fhq0 fhq0Var = this.outputSurface;
            fhq0 fhq0Var2 = null;
            if (fhq0Var == null) {
                Intrinsics.m88391r("outputSurface");
                fhq0Var = null;
            }
            fhq0Var.m132220b();
            gij0 gij0Var = this.textureDrawer;
            if (gij0Var == null) {
                Intrinsics.m88391r("textureDrawer");
                gij0Var = null;
            }
            gij0Var.m130324a(this.outputTexId, this.previewWidth, this.previewHeight);
            fhq0 fhq0Var3 = this.outputSurface;
            if (fhq0Var3 == null) {
                Intrinsics.m88391r("outputSurface");
            } else {
                fhq0Var2 = fhq0Var3;
            }
            fhq0Var2.m132222d();
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
    public static void m21766s(Function0 function0) {
        Object objM225066constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Result.m225069exceptionOrNullimpl(objM225066constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDefaultEndTransition() {
        setTransitionAt(CollectionsKt.getLastIndex(this.scenes), new f4g0());
    }

    private final void setVideoFormat(del0 del0Var) {
        this.videoWidth = del0Var.getWidth();
        this.videoHeight = del0Var.getHeight();
        this.videoFormat = del0Var;
    }

    /* JADX INFO: renamed from: t */
    public static Unit m21767t(TransitionEngine.InterfaceC4477c interfaceC4477c, float f) {
        interfaceC4477c.mo21753e(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static Unit m21768u(TransitionEngineImpl transitionEngineImpl, SurfaceTexture surfaceTexture) {
        if (transitionEngineImpl.outputSurface == null) {
            fhq0 fhq0Var = new fhq0(transitionEngineImpl.requireEglCore$android_release(), surfaceTexture);
            transitionEngineImpl.outputSurface = fhq0Var;
            fhq0Var.m132220b();
        }
        if (transitionEngineImpl.textureDrawer == null) {
            gij0 gij0Var = new gij0();
            transitionEngineImpl.textureDrawer = gij0Var;
            gij0Var.m130325b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static Unit m21769v(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.ioThread.quitSafely();
        return Unit.INSTANCE;
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void assembleVideo(@NotNull vdl0 videoEntry, @NotNull TransitionEngine.InterfaceC4476b assembleListener) {
        videoEntry.getClass();
        assembleListener.getClass();
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void cancel() {
        this.videoComposer.m190458g();
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void createWindowSurface$android_release(@NotNull final SurfaceTexture texture) {
        texture.getClass();
        render$android_release(new Function0() { // from class: l.rhj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21768u(this.f163179a, texture);
            }
        });
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void exportVideo(@NotNull String output, @NotNull TransitionEngine.InterfaceC4477c exportListener) {
        output.getClass();
        exportListener.getClass();
        internalExportVideo(output, exportListener);
    }

    @NotNull
    public final Function1<Float, Unit> getPlayProgress() {
        return this.playProgress;
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    @NotNull
    public InterfaceC15593o launch$android_release(@NotNull CoroutineDispatcher dispatcher, @NotNull Function0<Unit> runnable) {
        dispatcher.getClass();
        runnable.getClass();
        ker kerVar = this.lifecycleOwner;
        if (kerVar == null) {
            Intrinsics.m88391r("lifecycleOwner");
            kerVar = null;
        }
        return xh3.m210980d(ler.m153935a(kerVar), dispatcher.plus(this.exceptionHandler), null, new TransitionEngineImpl$launch$1(runnable, null), 2, null);
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void loadImageFromPath(@Nullable List<String> images, @NotNull del0 format, @NotNull Function1<? super Long, Unit> onLoaded) {
        format.getClass();
        onLoaded.getClass();
        if (images != null) {
            applyPathData(images, onLoaded);
        }
        setVideoFormat(format);
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void loadImageFromUri(@Nullable List<? extends Uri> uris, @NotNull del0 format, @NotNull Function1<? super Long, Unit> onLoaded) {
        format.getClass();
        onLoaded.getClass();
        if (uris != null) {
            applyUriData(uris);
        }
        setVideoFormat(format);
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine, androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull ker owner) {
        owner.getClass();
        initialize(owner);
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull ker owner) {
        owner.getClass();
        release();
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void pause() {
        this.isPlaying = false;
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void play(@NotNull Function1<? super Float, Unit> progress) {
        progress.getClass();
        this.playProgress = progress;
        render$android_release(new Function0() { // from class: l.ihj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21759l(this.f114978a);
            }
        });
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void processFrame$android_release(boolean renderToSurface, float progress, @NotNull Function1<? super Integer, Unit> onDraw) {
        onDraw.getClass();
        prepareOutputSurface();
        internalRender(progress);
        renderSurface(renderToSurface);
        onDraw.invoke(Integer.valueOf(this.outputTexId));
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void release() {
        this.isPlaying = false;
        cancel();
        render$android_release(new Function0() { // from class: l.phj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21758k(this.f152443a);
            }
        });
        m21756io(new Function0() { // from class: l.qhj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21769v(this.f157718a);
            }
        });
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void render$android_release(@NotNull final Function0<Unit> runnable) {
        runnable.getClass();
        Handler handler = this.renderHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.mhj0
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionEngineImpl.m21765r(runnable);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    @NotNull
    public gse requireEglCore$android_release() {
        gse gseVar = this.eglCore;
        if (gseVar != null) {
            return gseVar;
        }
        wg3.m206174a("Required value was null.");
        return null;
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void setLogger(@NotNull Function0<Unit> log) {
        log.getClass();
    }

    public final void setPlayProgress(@NotNull Function1<? super Float, Unit> function1) {
        function1.getClass();
        this.playProgress = function1;
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void setPreview(@NotNull TextureView textureView, int previewWidth, int previewHeight) {
        textureView.getClass();
        initPreview(textureView, previewWidth, previewHeight);
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void setTransitionAt(int index, @NotNull ahj0 transition) {
        transition.getClass();
        if (index < 0 || index >= this.scenes.size()) {
            wg3.m206174a("index out of range");
        } else {
            this.scenes.get(index).m193959f(transition);
            this.preDraw.add(new RunnableC4487e(transition));
        }
    }

    @Override // com.p051p1.mobile.android.media.gltransition.TransitionEngine
    public void createWindowSurface$android_release(@NotNull final Surface surface, final boolean release) {
        surface.getClass();
        render$android_release(new Function0() { // from class: l.lhj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransitionEngineImpl.m21763p(this.f132105a, surface, release);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u1e0 createScene(String path) throws NoSuchAlgorithmException {
        String str = this.baseDir;
        if (str == null) {
            Intrinsics.m88391r("baseDir");
            str = null;
        }
        File file = new File(str, "image-" + bok0.m105703g(path) + ".jpg");
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteStreamsKt.m88291b(fileInputStream, fileOutputStream, 0, 2, null);
        bok0.m105701e(fileInputStream);
        bok0.m105702f(fileOutputStream);
        return assembleScene(file);
    }
}
