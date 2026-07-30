package com.p003p1.mobile.android.media.gltransition.impl;

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
import com.momo.xeengine.gift.XEGiftErrorCode;
import com.p003p1.mobile.android.media.gltransition.TransitionEngine;
import com.p003p1.mobile.android.media.gltransition.impl.TransitionEngineImpl;
import com.p003p1.mobile.android.media.gltransition.utils.BitmapProcessor;
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
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.o;
import l.d4e;
import l.eri;
import l.fri;
import l.hh3;
import l.ig3;
import l.jcr;
import l.jpb;
import l.jri;
import l.kcr;
import l.ppb;
import l.qkq0;
import l.uwp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p007l.a8q0;
import p007l.b9j0;
import p007l.c9j0;
import p007l.cre;
import p007l.d13;
import p007l.d9j0;
import p007l.nyl;
import p007l.o3l0;
import p007l.ocj;
import p007l.r4l0;
import p007l.std0;
import p007l.vek0;
import p007l.w7j0;
import p007l.wvf0;
import p007l.y8j0;
import p007l.z4l0;
import p007l.z8j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Î\u00012\u00020\u0001:\u0002Ï\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J3\u0010.\u001a\u00020-2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0003¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020-2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(H\u0003¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020#2\u0006\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u00020#2\u0006\u00108\u001a\u000200H\u0002¢\u0006\u0004\b6\u00109J\u0017\u0010<\u001a\u00020#2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0003J\u001f\u0010C\u001a\u00020\b2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001d\u0010K\u001a\u00020\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0HH\u0002¢\u0006\u0004\bK\u0010LJ \u0010M\u001a\u00020\b2\u000e\b\u0004\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0082\b¢\u0006\u0004\bM\u0010DJ\u001d\u0010O\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0002¢\u0006\u0004\bO\u0010DJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010\u000eJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bQ\u0010\u000eJ\u001d\u0010S\u001a\u00020\b2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0016¢\u0006\u0004\bS\u0010DJ;\u0010V\u001a\u00020\b2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(2\u0006\u0010U\u001a\u00020T2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\bV\u0010WJ;\u0010Y\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(2\u0006\u0010U\u001a\u00020T2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\bY\u0010WJ'\u0010Z\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\bZ\u0010\u0016J#\u0010[\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0*H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\bH\u0016¢\u0006\u0004\b]\u0010\u0003J\u001f\u0010^\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010\nJ\u001f\u0010c\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\bH\u0016¢\u0006\u0004\bi\u0010\u0003J\u001d\u0010k\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0010¢\u0006\u0004\bj\u0010DJ%\u0010p\u001a\u00020-2\u0006\u0010m\u001a\u00020l2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0AH\u0010¢\u0006\u0004\bn\u0010oJ\u0017\u0010u\u001a\u00020\b2\u0006\u0010r\u001a\u00020qH\u0010¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020\b2\u0006\u0010w\u001a\u00020v2\u0006\u0010x\u001a\u00020EH\u0010¢\u0006\u0004\bs\u0010yJ\u000f\u0010}\u001a\u00020zH\u0010¢\u0006\u0004\b{\u0010|J\u000f\u0010x\u001a\u00020\bH\u0016¢\u0006\u0004\bx\u0010\u0003J6\u0010\u0082\u0001\u001a\u00020\b2\u0006\u0010~\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0*H\u0010¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R#\u0010\u0088\u0001\u001a\f\u0018\u00010\u0086\u0001j\u0005\u0018\u0001`\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u001a\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010\u009d\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010\u009f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R \u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020#0 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R\u001f\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020e0(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u009e\u0001R'\u0010¥\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030¤\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010ª\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0017\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0011\u0010¬\u0001R\u001a\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001c\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001d\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0019\u0010·\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u001a\u0010º\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010²\u0001R\u0017\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010½\u0001R4\u0010¾\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0005\bÂ\u0001\u0010\\R\u0019\u0010Ã\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010\u008e\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u008e\u0001R\u0017\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010\u008e\u0001R\u0017\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u008e\u0001R*\u0010Æ\u0001\u001a\u00020T2\u0007\u0010Å\u0001\u001a\u00020T8\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ë\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010¸\u0001¨\u0006Ð\u0001"}, d2 = {"Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "<init>", "()V", "", "output", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;", "exportListener", "", "internalExportVideo", "(Ljava/lang/String;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;)V", "Ll/jcr;", "owner", "initialize", "(Ll/jcr;)V", "initializeEGL", "Landroid/view/TextureView;", "textureView", "", "previewWidth", "previewHeight", "initPreview", "(Landroid/view/TextureView;II)V", "internalPlay", "prepareOutputSurface", "", "progress", "internalRender", "(F)V", "seekAt", "calculateIndexFromDuration", "(F)Ljava/lang/Integer;", "index", "calculateSeekOffset", "(IF)F", "Ll/std0;", "scene", "offset", "interpolateOffset", "(Ll/std0;F)F", "", "images", "Lkotlin/Function1;", "", "onLoaded", "Lkotlinx/coroutines/o;", "applyPathData", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/o;", "Landroid/net/Uri;", "applyUriData", "(Ljava/util/List;)Lkotlinx/coroutines/o;", "processScene", "(Ll/std0;)V", "path", "createScene", "(Ljava/lang/String;)Ll/std0;", "uri", "(Landroid/net/Uri;)Ll/std0;", "Ljava/io/File;", "cacheFile", "assembleScene", "(Ljava/io/File;)Ll/std0;", "evaluateDuration", "setDefaultEndTransition", "prepareDrawer", "Lkotlin/Function0;", "draw", "renderFramebuffer", "(Lkotlin/jvm/functions/Function0;)V", "", "renderSurface", "(Z)V", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "runnables", "run", "(Ljava/util/Queue;)V", "addPreDrawQueue", "runnable", "io", "onCreate", "onDestroy", "log", "setLogger", "Ll/z4l0;", "format", "loadImageFromPath", "(Ljava/util/List;Ll/z4l0;Lkotlin/jvm/functions/Function1;)V", "uris", "loadImageFromUri", "setPreview", "play", "(Lkotlin/jvm/functions/Function1;)V", "pause", "exportVideo", "Ll/r4l0;", "videoEntry", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;", "assembleListener", "assembleVideo", "(Ll/r4l0;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;)V", "Ll/w7j0;", "transition", "setTransitionAt", "(ILl/w7j0;)V", "cancel", "render$android_release", "render", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "launch$android_release", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/o;", "launch", "Landroid/graphics/SurfaceTexture;", "texture", "createWindowSurface$android_release", "(Landroid/graphics/SurfaceTexture;)V", "createWindowSurface", "Landroid/view/Surface;", "surface", "release", "(Landroid/view/Surface;Z)V", "Ll/cre;", "requireEglCore$android_release", "()Ll/cre;", "requireEglCore", "renderToSurface", "onDraw", "processFrame$android_release", "(ZFLkotlin/jvm/functions/Function1;)V", "processFrame", "Ll/jpb;", "exceptionHandler", "Ll/jpb;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lcom/p1/mobile/android/media/gltransition/TextureListener;", "userTextureListener", "Landroid/view/TextureView$SurfaceTextureListener;", "Ll/a8q0;", "outputSurface", "Ll/a8q0;", "framebuffer", "I", "outputTexId", "Ll/c9j0;", "textureDrawer", "Ll/c9j0;", "lifecycleOwner", "Ll/jcr;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "baseDir", "Ljava/lang/String;", "Ll/d13;", "bitmapCache", "Ll/d13;", "imageUris", "Ljava/util/List;", "imagePaths", "", "scenes", "transitions", "", "Ll/z8j0;", "transitionRenders", "Ljava/util/Map;", "totalDuration", "J", "", "durations", "[J", "Landroid/view/TextureView;", "Ll/d9j0;", "renderThread", "Ll/d9j0;", "Landroid/os/Handler;", "renderHandler", "Landroid/os/Handler;", "eglCore", "Ll/cre;", "preDraw", "Ljava/util/Queue;", "isPlaying", "Z", "Ll/nyl;", "ioThread", "Ll/nyl;", "ioHandler", "F", "playProgress", "Lkotlin/jvm/functions/Function1;", "getPlayProgress", "()Lkotlin/jvm/functions/Function1;", "setPlayProgress", "videoWidth", "videoHeight", "value", "videoFormat", "Ll/z4l0;", "setVideoFormat", "(Ll/z4l0;)V", "Ll/o3l0;", "videoComposer", "Ll/o3l0;", "prepared", "Companion", "a", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    private final jpb exceptionHandler = new C0249f(jpb.h0);
    private int framebuffer = -1;
    private int outputTexId = -1;

    @NotNull
    private List<std0> scenes = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl$a;", "", "<init>", "()V", "Ll/jcr;", "owner", "Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "c", "(Ll/jcr;)Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "Landroid/content/Context;", "e", "(Ll/jcr;)Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)Ljava/lang/String;", "BASE_DIR", "Ljava/lang/String;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final TransitionEngineImpl m1044c(@NotNull jcr owner) {
            owner.getClass();
            TransitionEngineImpl transitionEngineImpl = new TransitionEngineImpl();
            owner.getLifecycle().a(transitionEngineImpl);
            return transitionEngineImpl;
        }

        /* JADX INFO: renamed from: d */
        public final String m1045d(Context context) {
            File file = new File(context.getExternalCacheDir(), TransitionEngineImpl.BASE_DIR);
            if (!file.exists() && !file.mkdirs()) {
                qkq0.a("mkdirs failed");
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        }

        /* JADX INFO: renamed from: e */
        public final Context m1046e(jcr owner) {
            if (owner instanceof Activity) {
                Context applicationContext = ((ContextWrapper) owner).getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            }
            if (!(owner instanceof Fragment)) {
                ig3.a("owner should be Activity or Fragment");
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1", f = "TransitionEngineImpl.kt", l = {XEGiftErrorCode.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 1)
    @SourceDebugExtension
    public static final class C02401 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<String> $images;
        final /* synthetic */ Function1<Long, Unit> $onLoaded;
        int label;
        final /* synthetic */ TransitionEngineImpl this$0;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll/fri;", "Ll/std0;", "", "it", "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$4", f = "TransitionEngineImpl.kt", l = {}, m = "invokeSuspend", v = 1)
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

            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass4(this.this$0, this.$onLoaded, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                uwp.e();
                if (this.label != 0) {
                    qkq0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.b(obj);
                this.this$0.evaluateDuration();
                this.this$0.setDefaultEndTransition();
                this.this$0.prepareDrawer();
                this.$onLoaded.invoke(Boxing.c(this.this$0.totalDuration));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll/fri;", "Ll/std0;", "", "e", "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$5", f = "TransitionEngineImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass5 extends SuspendLambda implements Function3<fri<? super std0>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(3, continuation);
            }

            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.L$0 = th;
                return anonymousClass5.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                uwp.e();
                if (this.label == 0) {
                    ResultKt.b(obj);
                    return Unit.INSTANCE;
                }
                qkq0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements fri {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TransitionEngineImpl f1299a;

            public a(TransitionEngineImpl transitionEngineImpl) {
                this.f1299a = transitionEngineImpl;
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(std0 std0Var, Continuation<? super Unit> continuation) {
                this.f1299a.processScene(std0Var);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02401(List<String> list, TransitionEngineImpl transitionEngineImpl, Function1<? super Long, Unit> function1, Continuation<? super C02401> continuation) {
            super(2, continuation);
            this.$images = list;
            this.this$0 = transitionEngineImpl;
            this.$onLoaded = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C02401(this.$images, this.this$0, this.$onLoaded, continuation);
        }

        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            eri eriVarW;
            eri eriVarD;
            eri eriVarF;
            Object objE = uwp.e();
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                List<String> list = this.$images;
                if (list != null) {
                    this.this$0.imagePaths = list;
                    final eri eriVarA = jri.a(list);
                    if (eriVarA != null && (eriVarW = jri.w(new C0242xfc914da3(new eri<String>() { // from class: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l/hsi", "<anonymous>"}, k = 3, mv = {2, 2, 0})
                        @SourceDebugExtension
                        public static final class AnonymousClass2<T> implements fri {

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ fri f1301a;

                            /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                            @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyPathData$1$invokeSuspend$$inlined$filter$1$2", f = "TransitionEngineImpl.kt", l = {223}, m = "emit", v = 1)
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

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(fri friVar) {
                                this.f1301a = friVar;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Nullable
                            public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                                Object objE = uwp.e();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.b(obj2);
                                    fri friVar = this.f1301a;
                                    if (new File((String) obj).exists()) {
                                        anonymousClass1.L$0 = SpillingKt.a(obj);
                                        anonymousClass1.L$1 = SpillingKt.a(anonymousClass1);
                                        anonymousClass1.L$2 = SpillingKt.a(obj);
                                        anonymousClass1.L$3 = SpillingKt.a(friVar);
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        if (friVar.emit(obj, anonymousClass1) == objE) {
                                            return objE;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        qkq0.a("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    ResultKt.b(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Nullable
                        public Object collect(@NotNull fri friVar, @NotNull Continuation continuation) {
                            Object objCollect = eriVarA.collect(new AnonymousClass2(friVar), continuation);
                            return objCollect == uwp.e() ? objCollect : Unit.INSTANCE;
                        }
                    }, null, this.this$0))) != null && (eriVarD = jri.D(eriVarW, new AnonymousClass4(this.this$0, this.$onLoaded, null))) != null && (eriVarF = jri.f(eriVarD, new AnonymousClass5(null))) != null) {
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (eriVarF.collect(aVar, this) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    qkq0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll/ppb;", "", "<anonymous>", "(Ll/ppb;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1", f = "TransitionEngineImpl.kt", l = {419}, m = "invokeSuspend", v = 1)
    @SourceDebugExtension
    public static final class C02431 extends SuspendLambda implements Function2<ppb, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Uri> $images;
        int label;
        final /* synthetic */ TransitionEngineImpl this$0;

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll/fri;", "Ll/std0;", "", "it", "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$3", f = "TransitionEngineImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass3 extends SuspendLambda implements Function3<fri<? super std0>, Throwable, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TransitionEngineImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TransitionEngineImpl transitionEngineImpl, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = transitionEngineImpl;
            }

            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass3(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                uwp.e();
                if (this.label != 0) {
                    qkq0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.b(obj);
                this.this$0.evaluateDuration();
                this.this$0.setDefaultEndTransition();
                this.this$0.prepareDrawer();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll/fri;", "Ll/std0;", "", "e", "", "<anonymous>", "(Ll/fri;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$4", f = "TransitionEngineImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass4 extends SuspendLambda implements Function3<fri<? super std0>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
            }

            public final Object invoke(fri<? super std0> friVar, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = th;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                uwp.e();
                if (this.label == 0) {
                    ResultKt.b(obj);
                    return Unit.INSTANCE;
                }
                qkq0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$applyUriData$1$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements fri {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TransitionEngineImpl f1304a;

            public a(TransitionEngineImpl transitionEngineImpl) {
                this.f1304a = transitionEngineImpl;
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(std0 std0Var, Continuation<? super Unit> continuation) {
                this.f1304a.processScene(std0Var);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02431(List<? extends Uri> list, TransitionEngineImpl transitionEngineImpl, Continuation<? super C02431> continuation) {
            super(2, continuation);
            this.$images = list;
            this.this$0 = transitionEngineImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C02431(this.$images, this.this$0, continuation);
        }

        public final Object invoke(ppb ppbVar, Continuation<? super Unit> continuation) {
            return create(ppbVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            eri eriVarW;
            eri eriVarD;
            eri eriVarF;
            Object objE = uwp.e();
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                List<Uri> list = this.$images;
                if (list != null) {
                    this.this$0.imageUris = list;
                    eri eriVarA = jri.a(list);
                    if (eriVarA != null && (eriVarW = jri.w(new C0244xe01cfc1e(eriVarA, null, this.this$0))) != null && (eriVarD = jri.D(eriVarW, new AnonymousClass3(this.this$0, null))) != null && (eriVarF = jri.f(eriVarD, new AnonymousClass4(null))) != null) {
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (eriVarF.collect(aVar, this) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    qkq0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RunnableC0245b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f1307a;

        public RunnableC0245b(Function0<Unit> function0) {
            this.f1307a = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            Function0<Unit> function0 = this.f1307a;
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.a(th));
            }
            Result.exceptionOrNull-impl(obj);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$c */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RunnableC0246c implements Runnable {
        public RunnableC0246c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            try {
                Result.Companion companion = Result.Companion;
                if (TransitionEngineImpl.this.outputTexId == -1) {
                    int width = TransitionEngineImpl.this.videoFormat.getWidth();
                    int height = TransitionEngineImpl.this.videoFormat.getHeight();
                    TransitionEngineImpl transitionEngineImpl = TransitionEngineImpl.this;
                    ocj ocjVar = ocj.INSTANCE;
                    transitionEngineImpl.outputTexId = ocjVar.m10194f();
                    TransitionEngineImpl transitionEngineImpl2 = TransitionEngineImpl.this;
                    transitionEngineImpl2.framebuffer = ocjVar.m10193e(width, height, transitionEngineImpl2.outputTexId);
                }
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.a(th));
            }
            Result.exceptionOrNull-impl(obj);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$d */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RunnableC0247d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ std0 f1309a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TransitionEngineImpl f1310b;

        public RunnableC0247d(std0 std0Var, TransitionEngineImpl transitionEngineImpl) {
            this.f1309a = std0Var;
            this.f1310b = transitionEngineImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            try {
                Result.Companion companion = Result.Companion;
                this.f1309a.m10723g();
                z8j0 z8j0Var = (z8j0) this.f1310b.transitionRenders.get(this.f1309a.getTransition().getName());
                if (z8j0Var != null) {
                    z8j0Var.m11992E();
                }
                z8j0 z8j0Var2 = (z8j0) this.f1310b.transitionRenders.get(this.f1309a.getTransition().getName());
                if (z8j0Var2 != null) {
                    z8j0Var2.m11991D();
                }
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.a(th));
            }
            Result.exceptionOrNull-impl(obj);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$e */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RunnableC0248e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w7j0 f1312b;

        public RunnableC0248e(w7j0 w7j0Var) {
            this.f1312b = w7j0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            try {
                Result.Companion companion = Result.Companion;
                z8j0 z8j0Var = (z8j0) TransitionEngineImpl.this.transitionRenders.get(this.f1312b.getName());
                if (z8j0Var != null) {
                    z8j0Var.m11992E();
                }
                z8j0 z8j0Var2 = (z8j0) TransitionEngineImpl.this.transitionRenders.get(this.f1312b.getName());
                if (z8j0Var2 != null) {
                    z8j0Var2.m11991D();
                }
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.a(th));
            }
            Result.exceptionOrNull-impl(obj);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.impl.TransitionEngineImpl$f */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl$f", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Ll/jpb;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C0249f extends AbstractCoroutineContextElement implements jpb {
        public C0249f(jpb.a aVar) {
            super(aVar);
        }

        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            vek0.m11263b("[exceptionHandler] error: " + exception, null, 2, null);
        }
    }

    public TransitionEngineImpl() {
        List<w7j0> listM8613b = b9j0.INSTANCE.m8613b();
        this.transitions = listM8613b;
        List<w7j0> list = listM8613b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (w7j0 w7j0Var : list) {
            Pair pairA = TuplesKt.a(w7j0Var.getName(), y8j0.INSTANCE.m11906a(w7j0Var));
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        this.transitionRenders = linkedHashMap;
        this.durations = new long[0];
        this.renderThread = new d9j0();
        this.preDraw = new LinkedList();
        this.ioThread = new nyl();
        this.playProgress = new Function1() { // from class: l.g8j0
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m1034o(((Float) obj).floatValue());
            }
        };
        this.videoWidth = 720;
        this.videoHeight = 1280;
        this.previewWidth = 720;
        this.previewHeight = 1280;
        this.videoFormat = z4l0.INSTANCE.m11974b();
        this.videoComposer = new o3l0(this);
    }

    private final void addPreDrawQueue(Function0<Unit> run) {
        this.preDraw.add(new RunnableC0245b(run));
    }

    private final o applyPathData(List<String> images, Function1<? super Long, Unit> onLoaded) {
        jcr jcrVar = this.lifecycleOwner;
        if (jcrVar == null) {
            Intrinsics.r("lifecycleOwner");
            jcrVar = null;
        }
        return hh3.d(kcr.a(jcrVar), d4e.b(), (CoroutineStart) null, new C02401(images, this, onLoaded, null), 2, (Object) null);
    }

    private final o applyUriData(List<? extends Uri> images) {
        jcr jcrVar = this.lifecycleOwner;
        if (jcrVar == null) {
            Intrinsics.r("lifecycleOwner");
            jcrVar = null;
        }
        return hh3.d(kcr.a(jcrVar), d4e.b(), (CoroutineStart) null, new C02431(images, this, null), 2, (Object) null);
    }

    private final std0 assembleScene(File cacheFile) throws NoSuchAlgorithmException, IOException {
        d13 d13Var;
        Object next;
        Bitmap bitmapM8836b;
        String absolutePath = cacheFile.getAbsolutePath();
        absolutePath.getClass();
        String strM11268g = vek0.m11268g(absolutePath);
        Iterator<T> it = this.scenes.iterator();
        do {
            d13Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((std0) next).getId(), strM11268g));
        std0 std0Var = (std0) next;
        if (std0Var != null) {
            return std0Var;
        }
        BitmapProcessor.CropType cropType = BitmapProcessor.CropType.FIT_CENTER;
        d13 d13Var2 = this.bitmapCache;
        if (d13Var2 == null) {
            Intrinsics.r("bitmapCache");
            d13Var2 = null;
        }
        if (d13Var2.m8835a(strM11268g + cropType.key())) {
            d13 d13Var3 = this.bitmapCache;
            if (d13Var3 == null) {
                Intrinsics.r("bitmapCache");
            } else {
                d13Var = d13Var3;
            }
            bitmapM8836b = d13Var.m8836b(strM11268g + cropType.key());
        } else {
            BitmapProcessor.Companion companion = BitmapProcessor.INSTANCE;
            String absolutePath2 = cacheFile.getAbsolutePath();
            absolutePath2.getClass();
            BitmapProcessor bitmapProcessor = new BitmapProcessor(companion.m1062b(absolutePath2));
            bitmapProcessor.m1060l(this.videoFormat.getWidth(), this.videoFormat.getHeight(), this.videoFormat.getBgColor());
            Bitmap bitmapM1059k = bitmapProcessor.m1059k();
            d13 d13Var4 = this.bitmapCache;
            if (d13Var4 == null) {
                Intrinsics.r("bitmapCache");
            } else {
                d13Var = d13Var4;
            }
            d13Var.m8837c(strM11268g + cropType.key(), bitmapM1059k);
            bitmapM8836b = bitmapM1059k;
        }
        String absolutePath3 = cacheFile.getAbsolutePath();
        absolutePath3.getClass();
        bitmapM8836b.getClass();
        return new std0(strM11268g, absolutePath3, bitmapM8836b);
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
        return INSTANCE.m1044c(jcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final std0 createScene(Uri uri) throws NoSuchAlgorithmException, FileNotFoundException {
        String str = this.baseDir;
        if (str == null) {
            Intrinsics.r("baseDir");
            str = null;
        }
        String string = uri.toString();
        string.getClass();
        File file = new File(str, "image-" + vek0.m11268g(string) + ".jpg");
        Context context = this.context;
        if (context == null) {
            Intrinsics.r("context");
            context = null;
        }
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (inputStreamOpenInputStream != null) {
            ByteStreamsKt.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, (Object) null);
        }
        if (inputStreamOpenInputStream != null) {
            vek0.m11266e(inputStreamOpenInputStream);
        }
        vek0.m11267f(fileOutputStream);
        return assembleScene(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evaluateDuration() {
        List<std0> list = this.scenes;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (std0 std0Var : list) {
            arrayList.add(Long.valueOf(std0Var.getDuration() + std0Var.getTransition().getDuration()));
        }
        this.totalDuration = CollectionsKt.sumOfLong(arrayList);
        List<std0> list2 = this.scenes;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        long duration = 0;
        for (std0 std0Var2 : list2) {
            duration += std0Var2.getDuration() + std0Var2.getTransition().getDuration();
            arrayList2.add(Long.valueOf(duration));
        }
        this.durations = CollectionsKt.toLongArray(arrayList2);
    }

    /* JADX INFO: renamed from: h */
    public static Unit m1026h(TransitionEngine.InterfaceC0238c interfaceC0238c) {
        interfaceC0238c.m1022b();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m1027i(TransitionEngineImpl transitionEngineImpl) {
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
            i2 = 1280;
        }
        transitionEngineImpl.initPreview(textureView, i, i2);
    }

    private final void initialize(jcr owner) {
        this.lifecycleOwner = owner;
        Companion companion = INSTANCE;
        Context contextM1046e = companion.m1046e(owner);
        this.context = contextM1046e;
        Context context = null;
        if (contextM1046e == null) {
            Intrinsics.r("context");
            contextM1046e = null;
        }
        this.baseDir = companion.m1045d(contextM1046e);
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.r("context");
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
            public final Object invoke() {
                return TransitionEngineImpl.m1027i(this.f2668a);
            }
        });
    }

    private final void internalExportVideo(String output, final TransitionEngine.InterfaceC0238c exportListener) {
        exportListener.m1024d();
        this.videoComposer.m10169o(new r4l0(this.videoFormat, null, output, this.totalDuration), new Function1() { // from class: l.o8j0
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m1039t(exportListener, ((Float) obj).floatValue());
            }
        }, new Function0() { // from class: l.p8j0
            public final Object invoke() {
                return TransitionEngineImpl.m1029j(exportListener);
            }
        }, new Function1() { // from class: l.q8j0
            public final Object invoke(Object obj) {
                return TransitionEngineImpl.m1033n(exportListener, (Throwable) obj);
            }
        }, new Function0() { // from class: l.r8j0
            public final Object invoke() {
                return TransitionEngineImpl.m1026h(exportListener);
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
            float fM11265d = vek0.m11265d(fCurrentTimeMillis, 0.0f, 1.0f);
            long jNanoTime2 = System.nanoTime();
            d += (jNanoTime2 - j3) / frameRate;
            if (d >= 1.0d) {
                float f2 = fM11265d + f;
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
            final z8j0 z8j0Var = this.transitionRenders.get(std0Var.getTransition().getName());
            if (z8j0Var == null) {
                return;
            }
            z8j0Var.m11990C(vek0.m11269h(interpolateOffset(std0Var, fCalculateSeekOffset), 0.0f, 1.0f));
            renderFramebuffer(new Function0() { // from class: l.s8j0
                public final Object invoke() {
                    return TransitionEngineImpl.m1036q(z8j0Var, texId, texId2);
                }
            });
        }
    }

    private final float interpolateOffset(std0 scene, float offset) {
        float duration = scene.getTransition().getDuration() / scene.getDuration();
        return vek0.m11265d((offset - (1.0f - duration)) / duration, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: io */
    private final void m1028io(final Function0<Unit> runnable) {
        Handler handler = this.ioHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.j8j0
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionEngineImpl.m1038s(runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public static Unit m1029j(TransitionEngine.InterfaceC0238c interfaceC0238c) {
        interfaceC0238c.m1023c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m1030k(TransitionEngineImpl transitionEngineImpl) {
        Iterator<T> it = transitionEngineImpl.scenes.iterator();
        while (it.hasNext()) {
            ((std0) it.next()).m10721e();
        }
        Iterator<T> it2 = transitionEngineImpl.transitionRenders.values().iterator();
        while (it2.hasNext()) {
            ((z8j0) it2.next()).m11895o();
        }
        cre creVar = transitionEngineImpl.eglCore;
        if (creVar != null) {
            creVar.m8795e();
        }
        transitionEngineImpl.renderThread.quitSafely();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m1031l(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.internalPlay();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m1032m() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m1033n(TransitionEngine.InterfaceC0238c interfaceC0238c, Throwable th) {
        th.getClass();
        interfaceC0238c.m1021a(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static Unit m1034o(float f) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static Unit m1035p(TransitionEngineImpl transitionEngineImpl, Surface surface, boolean z) {
        if (transitionEngineImpl.outputSurface == null) {
            a8q0 a8q0Var = new a8q0(transitionEngineImpl.requireEglCore$android_release(), surface, z);
            transitionEngineImpl.outputSurface = a8q0Var;
            a8q0Var.m8799b();
        }
        if (transitionEngineImpl.textureDrawer == null) {
            c9j0 c9j0Var = new c9j0();
            transitionEngineImpl.textureDrawer = c9j0Var;
            c9j0Var.m8782b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareDrawer() {
        this.preDraw.add(new RunnableC0246c());
    }

    private final void prepareOutputSurface() {
        TextureView textureView;
        if (this.prepared || (textureView = this.textureView) == null) {
            return;
        }
        if (textureView == null) {
            Intrinsics.r("textureView");
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
        this.preDraw.add(new RunnableC0247d(scene, this));
    }

    /* JADX INFO: renamed from: q */
    public static Unit m1036q(z8j0 z8j0Var, int i, int i2) {
        z8j0Var.m11994z(i, i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static void m1037r(Function0 function0) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.a(th));
        }
        Result.exceptionOrNull-impl(obj);
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
                public final Object invoke() {
                    return TransitionEngineImpl.m1032m();
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
                Intrinsics.r("outputSurface");
                a8q0Var = null;
            }
            a8q0Var.m8799b();
            c9j0 c9j0Var = this.textureDrawer;
            if (c9j0Var == null) {
                Intrinsics.r("textureDrawer");
                c9j0Var = null;
            }
            c9j0Var.m8781a(this.outputTexId, this.previewWidth, this.previewHeight);
            a8q0 a8q0Var3 = this.outputSurface;
            if (a8q0Var3 == null) {
                Intrinsics.r("outputSurface");
            } else {
                a8q0Var2 = a8q0Var3;
            }
            a8q0Var2.m8801d();
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
    public static void m1038s(Function0 function0) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.a(th));
        }
        Result.exceptionOrNull-impl(obj);
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
    public static Unit m1039t(TransitionEngine.InterfaceC0238c interfaceC0238c, float f) {
        interfaceC0238c.m1025e(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static Unit m1040u(TransitionEngineImpl transitionEngineImpl, SurfaceTexture surfaceTexture) {
        if (transitionEngineImpl.outputSurface == null) {
            a8q0 a8q0Var = new a8q0(transitionEngineImpl.requireEglCore$android_release(), surfaceTexture);
            transitionEngineImpl.outputSurface = a8q0Var;
            a8q0Var.m8799b();
        }
        if (transitionEngineImpl.textureDrawer == null) {
            c9j0 c9j0Var = new c9j0();
            transitionEngineImpl.textureDrawer = c9j0Var;
            c9j0Var.m8782b();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static Unit m1041v(TransitionEngineImpl transitionEngineImpl) {
        transitionEngineImpl.ioThread.quitSafely();
        return Unit.INSTANCE;
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void assembleVideo(@NotNull r4l0 videoEntry, @NotNull TransitionEngine.InterfaceC0237b assembleListener) {
        videoEntry.getClass();
        assembleListener.getClass();
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void cancel() {
        this.videoComposer.m10162g();
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void createWindowSurface$android_release(@NotNull final SurfaceTexture texture) {
        texture.getClass();
        render$android_release(new Function0() { // from class: l.n8j0
            public final Object invoke() {
                return TransitionEngineImpl.m1040u(this.f3380a, texture);
            }
        });
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void exportVideo(@NotNull String output, @NotNull TransitionEngine.InterfaceC0238c exportListener) {
        output.getClass();
        exportListener.getClass();
        internalExportVideo(output, exportListener);
    }

    @NotNull
    public final Function1<Float, Unit> getPlayProgress() {
        return this.playProgress;
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    @NotNull
    public o launch$android_release(@NotNull CoroutineDispatcher dispatcher, @NotNull Function0<Unit> runnable) {
        dispatcher.getClass();
        runnable.getClass();
        jcr jcrVar = this.lifecycleOwner;
        if (jcrVar == null) {
            Intrinsics.r("lifecycleOwner");
            jcrVar = null;
        }
        return hh3.d(kcr.a(jcrVar), dispatcher.plus(this.exceptionHandler), (CoroutineStart) null, new TransitionEngineImpl$launch$1(runnable, null), 2, (Object) null);
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void loadImageFromPath(@Nullable List<String> images, @NotNull z4l0 format, @NotNull Function1<? super Long, Unit> onLoaded) {
        format.getClass();
        onLoaded.getClass();
        if (images != null) {
            applyPathData(images, onLoaded);
        }
        setVideoFormat(format);
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void loadImageFromUri(@Nullable List<? extends Uri> uris, @NotNull z4l0 format, @NotNull Function1<? super Long, Unit> onLoaded) {
        format.getClass();
        onLoaded.getClass();
        if (uris != null) {
            applyUriData(uris);
        }
        setVideoFormat(format);
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void onCreate(@NotNull jcr owner) {
        owner.getClass();
        initialize(owner);
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void onDestroy(@NotNull jcr owner) {
        owner.getClass();
        release();
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void pause() {
        this.isPlaying = false;
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void play(@NotNull Function1<? super Float, Unit> progress) {
        progress.getClass();
        this.playProgress = progress;
        render$android_release(new Function0() { // from class: l.e8j0
            public final Object invoke() {
                return TransitionEngineImpl.m1031l(this.f2614a);
            }
        });
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void processFrame$android_release(boolean renderToSurface, float progress, @NotNull Function1<? super Integer, Unit> onDraw) {
        onDraw.getClass();
        prepareOutputSurface();
        internalRender(progress);
        renderSurface(renderToSurface);
        onDraw.invoke(Integer.valueOf(this.outputTexId));
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void release() {
        this.isPlaying = false;
        cancel();
        render$android_release(new Function0() { // from class: l.l8j0
            public final Object invoke() {
                return TransitionEngineImpl.m1030k(this.f3214a);
            }
        });
        m1028io(new Function0() { // from class: l.m8j0
            public final Object invoke() {
                return TransitionEngineImpl.m1041v(this.f3292a);
            }
        });
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void render$android_release(@NotNull final Function0<Unit> runnable) {
        runnable.getClass();
        Handler handler = this.renderHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: l.i8j0
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionEngineImpl.m1037r(runnable);
                }
            });
        }
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    @NotNull
    public cre requireEglCore$android_release() {
        cre creVar = this.eglCore;
        if (creVar != null) {
            return creVar;
        }
        ig3.a("Required value was null.");
        return null;
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void setLogger(@NotNull Function0<Unit> log) {
        log.getClass();
    }

    public final void setPlayProgress(@NotNull Function1<? super Float, Unit> function1) {
        function1.getClass();
        this.playProgress = function1;
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void setPreview(@NotNull TextureView textureView, int previewWidth, int previewHeight) {
        textureView.getClass();
        initPreview(textureView, previewWidth, previewHeight);
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void setTransitionAt(int index, @NotNull w7j0 transition) {
        transition.getClass();
        if (index < 0 || index >= this.scenes.size()) {
            ig3.a("index out of range");
        } else {
            this.scenes.get(index).m10722f(transition);
            this.preDraw.add(new RunnableC0248e(transition));
        }
    }

    @Override // com.p003p1.mobile.android.media.gltransition.TransitionEngine
    public void createWindowSurface$android_release(@NotNull final Surface surface, final boolean release) {
        surface.getClass();
        render$android_release(new Function0() { // from class: l.h8j0
            public final Object invoke() {
                return TransitionEngineImpl.m1035p(this.f2808a, surface, release);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final std0 createScene(String path) throws NoSuchAlgorithmException {
        String str = this.baseDir;
        if (str == null) {
            Intrinsics.r("baseDir");
            str = null;
        }
        File file = new File(str, "image-" + vek0.m11268g(path) + ".jpg");
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteStreamsKt.b(fileInputStream, fileOutputStream, 0, 2, (Object) null);
        vek0.m11266e(fileInputStream);
        vek0.m11267f(fileOutputStream);
        return assembleScene(file);
    }
}
