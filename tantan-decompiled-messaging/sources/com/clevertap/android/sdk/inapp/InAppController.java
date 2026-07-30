package com.clevertap.android.sdk.inapp;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.delay.DelayedInAppResult;
import com.clevertap.android.sdk.inapp.delay.InAppScheduler;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlFooterFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHeaderFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeFooterFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHeaderFragment;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.clevertap.android.sdk.task.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.aqm;
import p149l.b2s;
import p149l.chi0;
import p149l.dqm;
import p149l.g2f;
import p149l.g95;
import p149l.hyd;
import p149l.ih3;
import p149l.j6f;
import p149l.l9r;
import p149l.mxf0;
import p149l.n2f;
import p149l.n95;
import p149l.oom;
import p149l.oyb;
import p149l.pg50;
import p149l.qs9;
import p149l.r26;
import p149l.tom;
import p149l.tt3;
import p149l.v260;
import p149l.vg2;
import p149l.vpq;
import p149l.wk0;
import p149l.xnm;
import p149l.yom;
import p149l.z360;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 Ô\u00012\u00020\u00012\u00020\u0002:\u0004Õ\u0001\u009d\u0001B«\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b>\u0010=J\u0017\u0010@\u001a\u00020,2\u0006\u0010?\u001a\u00020/H\u0002¢\u0006\u0004\b@\u00102J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u000205H\u0002¢\u0006\u0004\bE\u00109J\u0017\u0010F\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bF\u0010=J\u001f\u0010G\u001a\u00020,2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bI\u0010=J\u0017\u0010J\u001a\u0002052\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0003¢\u0006\u0004\bL\u0010=J\u0017\u0010M\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bM\u0010=J#\u0010P\u001a\b\u0012\u0004\u0012\u00020/0N2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020/0NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u0002052\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bR\u0010SJ!\u0010W\u001a\u00020,2\u0006\u0010T\u001a\u00020:2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020,2\u0006\u0010Z\u001a\u00020YH\u0003¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020/2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b]\u0010^J\u0019\u0010a\u001a\u0004\u0018\u00010B2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u0015\u0010e\u001a\u00020,2\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020,¢\u0006\u0004\bg\u0010.J'\u0010j\u001a\u00020,2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020/0N2\b\b\u0002\u0010i\u001a\u000205H\u0007¢\u0006\u0004\bj\u0010kJ\u001d\u0010m\u001a\u00020,2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020/0NH\u0007¢\u0006\u0004\bm\u0010nJ\r\u0010p\u001a\u00020o¢\u0006\u0004\bp\u0010qJ\u0015\u0010s\u001a\u00020,2\u0006\u0010r\u001a\u000205¢\u0006\u0004\bs\u0010tJ;\u0010y\u001a\u00020v2\u0006\u0010;\u001a\u00020:2\u0006\u0010`\u001a\u00020_2\u0006\u0010u\u001a\u00020B2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\by\u0010zJ+\u0010}\u001a\u0004\u0018\u00010v2\u0006\u0010;\u001a\u00020:2\u0006\u0010|\u001a\u00020{2\b\u0010x\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b}\u0010~J$\u0010\u0080\u0001\u001a\u00020,2\u0006\u0010;\u001a\u00020:2\b\u0010\u007f\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J$\u0010\u0082\u0001\u001a\u00020,2\u0006\u0010;\u001a\u00020:2\b\u0010\u007f\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J \u0010\u0084\u0001\u001a\u00020,2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020/0NH\u0007¢\u0006\u0005\b\u0084\u0001\u0010nJ>\u0010\u008b\u0001\u001a\u00020,2\u0007\u0010\u0085\u0001\u001a\u00020B2\u0015\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001JR\u0010\u008f\u0001\u001a\u00020,2\u0015\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00012\u001b\u0010\u008e\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020B\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00010N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JD\u0010\u0093\u0001\u001a\u00020,2$\u0010\u0091\u0001\u001a\u001f\u0012\u0004\u0012\u00020B\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020B\u0012\u0007\u0012\u0005\u0018\u00010\u0087\u00010\u0086\u00010\u0086\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0007¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J+\u0010\u0096\u0001\u001a\u00020,2\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020/0N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J+\u0010\u0099\u0001\u001a\u00020,2\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020/0N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u0097\u0001J+\u0010\u009b\u0001\u001a\u00020,2\r\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020/0N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u0097\u0001J\u000f\u0010\u009c\u0001\u001a\u00020,¢\u0006\u0005\b\u009c\u0001\u0010.J\u0019\u0010\u009d\u0001\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0005\b\u009d\u0001\u0010=J\u0011\u0010\u009e\u0001\u001a\u00020,H\u0007¢\u0006\u0005\b\u009e\u0001\u0010.R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009f\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010¸\u0001R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\"\u0010Ã\u0001\u001a\u000b\u0012\u0004\u0012\u00020c\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\"\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020,0Ä\u00018\u0006¢\u0006\u000f\n\u0005\b1\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\"\u0010Ì\u0001\u001a\r Ê\u0001*\u0005\u0018\u00010É\u00010É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010Ë\u0001R\u001f\u0010Î\u0001\u001a\u000b Ê\u0001*\u0004\u0018\u00010B0B8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010Í\u0001R\u0019\u0010Ñ\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b8\u0010Ð\u0001R\u001d\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010Ò\u0001¨\u0006Ö\u0001"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/InAppController;", "Ll/yom;", "Ll/z360;", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/tt3;", "executors", "Ll/r26;", "controllerManager", "Ll/vg2;", "callbackManager", "Ll/wk0;", "analyticsManager", "Ll/qs9;", "coreMetaData", "Lcom/clevertap/android/sdk/ManifestInfo;", "manifestInfo", "Ll/hyd;", "deviceInfo", "Ll/aqm;", "inAppQueue", "Ll/n2f;", "evaluationManager", "Ll/chi0;", "templatesManager", "Lcom/clevertap/android/sdk/inapp/a;", "inAppActionHandler", "Lcom/clevertap/android/sdk/inapp/b;", "inAppNotificationInflater", "Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "inAppDelayManager", "Ll/xnm;", "inAppInActionManager", "Ll/n95;", "clock", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "Ll/v260;", "pipManager", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/tt3;Ll/r26;Ll/vg2;Ll/wk0;Ll/qs9;Lcom/clevertap/android/sdk/ManifestInfo;Ll/hyd;Ll/aqm;Ll/n2f;Ll/chi0;Lcom/clevertap/android/sdk/inapp/a;Lcom/clevertap/android/sdk/inapp/b;Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;Ll/n95;Lcom/clevertap/android/sdk/network/NetworkMonitor;Ll/v260;)V", "", "n", "()V", "Lorg/json/JSONObject;", "inApp", Constants.KEY_T, "(Lorg/json/JSONObject;)V", "Landroid/app/Activity;", "activity", "", ResourceDirection.f38808v, "(Landroid/app/Activity;)Z", "w", "()Z", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", b2s.C_ZONE, "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "N", "jsonObject", j6f.GPS_MEASUREMENT_INTERRUPTED, "", "", "H", "(Lcom/clevertap/android/sdk/ManifestInfo;)Ljava/util/Set;", "A", "K", "L", "(Landroid/content/Context;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", BaseSei.f13932Z, BaseSei.f13931Y, "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)Z", "c0", "W", "", "inAppNotifications", "F", "(Ljava/util/List;)Ljava/util/List;", "M", "(Lorg/json/JSONObject;)Z", "notification", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "templateInAppData", "e0", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V", "", "targetId", "E", "(J)V", "B", "(J)Lorg/json/JSONObject;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "D", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;)Ljava/lang/String;", "Ll/oom;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Y", "(Ll/oom;)V", "f0", "delayedInApps", "shouldUpdateTTL", "Z", "(Ljava/util/List;Z)V", "inActionMetadata", "b0", "(Ljava/util/List;)V", "", "G", "()I", "showFallbackSettings", "X", "(Z)V", "callToAction", "Landroid/os/Bundle;", "additionalData", "activityContext", "y0", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;)Landroid/os/Bundle;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "button", "U", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;Landroid/content/Context;)Landroid/os/Bundle;", "formData", "J", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Landroid/os/Bundle;)V", "s0", "inappNotifs", "u", "eventName", "", "", "eventProperties", "Landroid/location/Location;", "userLocation", j6f.LATITUDE_SOUTH, "(Ljava/lang/String;Ljava/util/Map;Landroid/location/Location;)V", "chargeDetails", FirebaseAnalytics.Param.ITEMS, "R", "(Ljava/util/Map;Ljava/util/List;Landroid/location/Location;)V", "userAttributeChangedProperties", "location", j6f.GPS_DIRECTION_TRUE, "(Ljava/util/Map;Landroid/location/Location;)V", "appLaunchServerSideInApps", "P", "(Ljava/util/List;Landroid/location/Location;)V", "appLaunchServerSideInactionInApps", "Q", "appLaunchServerSideDelayedInApps", BloodType.f38728O, "d0", "a", BaseSei.f13930X, "Landroid/content/Context;", "b", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "c", "Ll/tt3;", Constants.INAPP_DATA_TAG, "Ll/r26;", "e", "Ll/vg2;", "f", "Ll/wk0;", "g", "Ll/qs9;", "h", "Ll/hyd;", RXScreenCaptureService.KEY_INDEX, "Ll/aqm;", "j", "Ll/n2f;", "k", "Ll/chi0;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/clevertap/android/sdk/inapp/a;", "m", "Lcom/clevertap/android/sdk/inapp/b;", "Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "o", "p", "Ll/n95;", "q", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "r", "Ll/v260;", "Ljava/lang/ref/WeakReference;", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/lang/ref/WeakReference;", "inAppDisplayListener", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "I", "()Lkotlin/jvm/functions/Function0;", "onAppLaunchEventSent", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "logger", "Ljava/lang/String;", "defaultLogTag", "Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "inAppState", "Ljava/util/Set;", "inAppExcludedActivityNames", "Companion", "InAppState", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class InAppController implements yom, z360 {

    /* JADX INFO: renamed from: y */
    private static final List<CTInAppNotification> f5014y = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: z */
    @Nullable
    private static volatile CTInAppNotification f5015z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final tt3 executors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final r26 controllerManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final vg2 callbackManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final wk0 analyticsManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final qs9 coreMetaData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final hyd deviceInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final aqm inAppQueue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final n2f evaluationManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final chi0 templatesManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final C1213a inAppActionHandler;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final C1214b inAppNotificationInflater;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final InAppScheduler<DelayedInAppResult> inAppDelayManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final InAppScheduler<xnm> inAppInActionManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final NetworkMonitor networkMonitor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final v260 pipManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private WeakReference<oom> inAppDisplayListener;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onAppLaunchEventSent;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Logger logger;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final String defaultLogTag;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    private volatile InAppState inAppState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Set<String> inAppExcludedActivityNames;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "", "<init>", "(Ljava/lang/String;I)V", "DISCARDED", "SUSPENDED", "RESUMED", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public enum InAppState {
        DISCARDED,
        SUSPENDED,
        RESUMED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<InAppState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1211b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5040a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f5041b;

        static {
            int[] iArr = new int[InAppActionType.values().length];
            try {
                iArr[InAppActionType.CUSTOM_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppActionType.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppActionType.OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppActionType.KEY_VALUES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5040a = iArr;
            int[] iArr2 = new int[CTInAppType.values().length];
            try {
                iArr2[CTInAppType.CTInAppTypeCoverHTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeInterstitialHTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHalfInterstitialHTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeCover.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeInterstitial.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeAlert.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeFooterHTML.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHeaderHTML.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeFooter.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHeader.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypePIP.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeCustomCodeTemplate.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            f5041b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$c */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1212c implements C1214b.a, FunctionAdapter {
        public C1212c() {
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function<?> mo6273a() {
            return new FunctionReferenceImpl(1, InAppController.this, InAppController.class, "notificationReady", "notificationReady(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", 0);
        }

        @Override // com.clevertap.android.sdk.inapp.C1214b.a
        /* JADX INFO: renamed from: b */
        public final void mo6274b(CTInAppNotification cTInAppNotification) {
            cTInAppNotification.getClass();
            InAppController.this.m6227N(cTInAppNotification);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C1214b.a) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m87488d(mo6273a(), ((FunctionAdapter) obj).mo6273a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6273a().hashCode();
        }
    }

    public InAppController(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull tt3 tt3Var, @NotNull r26 r26Var, @NotNull vg2 vg2Var, @NotNull wk0 wk0Var, @NotNull qs9 qs9Var, @NotNull ManifestInfo manifestInfo, @NotNull hyd hydVar, @NotNull aqm aqmVar, @NotNull n2f n2fVar, @NotNull chi0 chi0Var, @NotNull C1213a c1213a, @NotNull C1214b c1214b, @NotNull InAppScheduler<DelayedInAppResult> inAppScheduler, @NotNull InAppScheduler<xnm> inAppScheduler2, @NotNull n95 n95Var, @NotNull NetworkMonitor networkMonitor, @NotNull v260 v260Var) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        tt3Var.getClass();
        r26Var.getClass();
        vg2Var.getClass();
        wk0Var.getClass();
        qs9Var.getClass();
        manifestInfo.getClass();
        hydVar.getClass();
        aqmVar.getClass();
        n2fVar.getClass();
        chi0Var.getClass();
        c1213a.getClass();
        c1214b.getClass();
        inAppScheduler.getClass();
        inAppScheduler2.getClass();
        n95Var.getClass();
        networkMonitor.getClass();
        v260Var.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.executors = tt3Var;
        this.controllerManager = r26Var;
        this.callbackManager = vg2Var;
        this.analyticsManager = wk0Var;
        this.coreMetaData = qs9Var;
        this.deviceInfo = hydVar;
        this.inAppQueue = aqmVar;
        this.evaluationManager = n2fVar;
        this.templatesManager = chi0Var;
        this.inAppActionHandler = c1213a;
        this.inAppNotificationInflater = c1214b;
        this.inAppDelayManager = inAppScheduler;
        this.inAppInActionManager = inAppScheduler2;
        this.clock = n95Var;
        this.networkMonitor = networkMonitor;
        this.pipManager = v260Var;
        this.onAppLaunchEventSent = new Function0() { // from class: l.eom
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppController.m6239h(this.f92470a);
            }
        };
        this.logger = cleverTapInstanceConfig.getLogger();
        this.defaultLogTag = cleverTapInstanceConfig.getAccountId();
        this.inAppState = InAppState.RESUMED;
        this.inAppExcludedActivityNames = m6223H(manifestInfo);
    }

    /* JADX INFO: renamed from: A */
    private final boolean m6217A() {
        this.logger.verbose(this.defaultLogTag, "checking Pending Notifications");
        List<CTInAppNotification> list = f5014y;
        list.getClass();
        synchronized (list) {
            if (list.isEmpty()) {
                return false;
            }
            CTInAppNotification cTInAppNotificationRemove = list.remove(0);
            cTInAppNotificationRemove.getClass();
            m6255z(cTInAppNotificationRemove);
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    private final JSONObject m6218B(long targetId) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_EVT_NAME, Constants.WZRK_FETCH);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Constants.KEY_T, 6);
        jSONObject2.put("tgtId", targetId);
        Unit unit = Unit.INSTANCE;
        jSONObject.put(Constants.KEY_EVT_DATA, jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: C */
    private final void m6219C(final CTInAppNotification inAppNotification) {
        if (!Intrinsics.m87488d(Looper.myLooper(), Looper.getMainLooper())) {
            this.executors.m190591c().m6946g("InAppController:displayNotification", new Callable() { // from class: l.com
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InAppController.m6235e(this.f81848a, inAppNotification);
                }
            });
            return;
        }
        if (!inAppNotification.getIsRequestForPushPermission() || !this.inAppActionHandler.m6278b()) {
            m6255z(inAppNotification);
            m6225L(this.context, inAppNotification);
        } else {
            this.logger.verbose(this.defaultLogTag, "Not showing push permission request, permission is already granted");
            this.inAppActionHandler.m6283h();
            m6269d0();
        }
    }

    /* JADX INFO: renamed from: D */
    private final String m6220D(CTInAppAction action) {
        String actionUrl;
        if (action.getType() != InAppActionType.OPEN_URL || (actionUrl = action.getActionUrl()) == null || actionUrl.length() == 0) {
            return null;
        }
        return actionUrl;
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    private final void m6221E(long targetId) throws JSONException {
        this.logger.verbose(this.defaultLogTag, "Fetching in-action in-app content for targetId: " + targetId);
        this.analyticsManager.m203634S(m6218B(targetId));
    }

    /* JADX INFO: renamed from: F */
    private final List<JSONObject> m6222F(List<? extends JSONObject> inAppNotifications) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : inAppNotifications) {
            if (!m6226M((JSONObject) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    private final Set<String> m6223H(ManifestInfo manifestInfo) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String strM5886i = manifestInfo.m5886i();
        if (strM5886i != null) {
            Iterator it = StringsKt.split$default(strM5886i, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                String string = StringsKt.m93433Z0((String) it.next()).toString();
                if (!StringsKt.m93438e0(string)) {
                    linkedHashSet.add(string);
                }
            }
        }
        this.logger.debug(this.defaultLogTag, "In-app notifications will not be shown on " + CollectionsKt.joinToString$default(linkedHashSet, null, null, null, 0, null, null, 63, null));
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: K */
    private final void m6224K(CTInAppNotification inAppNotification) {
        this.logger.verbose(this.defaultLogTag, "Running inAppDidDismiss");
        if (f5015z != null) {
            CTInAppNotification cTInAppNotification = f5015z;
            if (Intrinsics.m87488d(cTInAppNotification != null ? cTInAppNotification.getCampaignId() : null, inAppNotification.getCampaignId())) {
                f5015z = null;
                m6217A();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m6225L(final Context context, CTInAppNotification inAppNotification) {
        if (inAppNotification.getIsLocalInApp()) {
            this.deviceInfo.m133555a0();
            this.executors.m190589a().m6946g("InAppController#incrementLocalInAppCountInPersistentStore", new Callable() { // from class: l.dom
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InAppController.m6242k(context, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    private final boolean m6226M(JSONObject inApp) {
        CustomTemplateInAppData customTemplateInAppDataM6309a = CustomTemplateInAppData.INSTANCE.m6309a(inApp);
        String templateName = customTemplateInAppDataM6309a != null ? customTemplateInAppDataM6309a.getTemplateName() : null;
        boolean z = (templateName == null || this.templatesManager.m106885f(templateName)) ? false : true;
        if (z) {
            this.logger.info("CustomTemplates", "Template with name \"" + templateName + "\" is not registered and cannot be presented");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m6227N(CTInAppNotification inAppNotification) {
        String templateName;
        if (inAppNotification.getError() != null) {
            this.logger.debug(this.defaultLogTag, "Unable to process inapp notification " + inAppNotification.getError());
            return;
        }
        CustomTemplateInAppData customTemplateData = inAppNotification.getCustomTemplateData();
        oyb oybVarM106884e = (customTemplateData == null || (templateName = customTemplateData.getTemplateName()) == null) ? null : this.templatesManager.m106884e(templateName);
        this.logger.debug(this.defaultLogTag, "Notification ready: " + inAppNotification.m6175s());
        if (oybVarM106884e == null || oybVarM106884e.getIsVisual()) {
            m6219C(inAppNotification);
        } else {
            m6229W(inAppNotification);
        }
    }

    /* JADX INFO: renamed from: V */
    private final void m6228V(JSONObject jsonObject) {
        this.logger.debug(this.defaultLogTag, "Preparing In-App for display: " + jsonObject);
        this.inAppNotificationInflater.m6293d(jsonObject, "InappController#prepareNotificationForDisplay", new C1212c());
    }

    /* JADX INFO: renamed from: W */
    private final void m6229W(CTInAppNotification inAppNotification) {
        this.templatesManager.m106886g(inAppNotification, this, FileResourceProvider.INSTANCE.m6502a(this.context, this.logger));
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m6230a0(InAppController inAppController, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        inAppController.m6266Z(list, z);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6231b(InAppController inAppController, xnm xnmVar) throws JSONException {
        inAppController.getClass();
        xnmVar.getClass();
        if (xnmVar instanceof xnm.C21186d) {
            Logger logger = inAppController.logger;
            String str = inAppController.defaultLogTag;
            StringBuilder sb = new StringBuilder("[InAppController]: In-action duration expired for targetId: ");
            xnm.C21186d c21186d = (xnm.C21186d) xnmVar;
            sb.append(c21186d.getTargetId());
            sb.append(", calling fetch API");
            logger.verbose(str, sb.toString());
            inAppController.m6221E(c21186d.getTargetId());
        } else if (xnmVar instanceof xnm.C21185c) {
            Logger logger2 = inAppController.logger;
            String str2 = inAppController.defaultLogTag;
            StringBuilder sb2 = new StringBuilder("[InAppController]Error scheduling in-action in-app: ");
            xnm.C21185c c21185c = (xnm.C21185c) xnmVar;
            sb2.append(c21185c.getMessage());
            sb2.append(" for targetId: ");
            sb2.append(c21185c.getTargetId());
            logger2.verbose(str2, sb2.toString());
        } else if (xnmVar instanceof xnm.C21183a) {
            inAppController.logger.verbose(inAppController.defaultLogTag, "[InAppController]In-action in-app cancelled for targetId: " + ((xnm.C21183a) xnmVar).m210183a());
        } else {
            if (!(xnmVar instanceof xnm.C21184b)) {
                l9r.m149037a();
                return null;
            }
            Logger logger3 = inAppController.logger;
            String str3 = inAppController.defaultLogTag;
            StringBuilder sb3 = new StringBuilder("[InAppController]In-action: in-app discarded ");
            xnm.C21184b c21184b = (xnm.C21184b) xnmVar;
            sb3.append(c21184b.getTargetId());
            sb3.append(": ");
            sb3.append(c21184b.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
            logger3.verbose(str3, sb3.toString());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m6232c(final InAppController inAppController, final boolean z, final DelayedInAppResult delayedInAppResult) {
        inAppController.getClass();
        delayedInAppResult.getClass();
        if (delayedInAppResult instanceof DelayedInAppResult.C1222b) {
            Logger logger = inAppController.logger;
            String accountId = inAppController.config.getAccountId();
            StringBuilder sb = new StringBuilder("[InAppController]: Successfully retrieved delayed in-app ");
            DelayedInAppResult.C1222b c1222b = (DelayedInAppResult.C1222b) delayedInAppResult;
            sb.append(c1222b.getInAppId());
            logger.verbose(accountId, sb.toString());
            inAppController.executors.m190593e(Constants.TAG_FEATURE_IN_APPS).m6946g("InAppController#executeDelayedInAppCallback-" + c1222b.getInAppId(), new Callable() { // from class: l.kom
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InAppController.m6241j(z, inAppController, delayedInAppResult);
                }
            });
        } else if (delayedInAppResult instanceof DelayedInAppResult.Error) {
            Logger logger2 = inAppController.logger;
            String accountId2 = inAppController.config.getAccountId();
            StringBuilder sb2 = new StringBuilder("[InAppController]: Error for delayed in-app ");
            DelayedInAppResult.Error error = (DelayedInAppResult.Error) delayedInAppResult;
            sb2.append(error.getInAppId());
            sb2.append(": ");
            sb2.append(error.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
            logger2.verbose(accountId2, sb2.toString(), error.getThrowable());
        } else {
            if (!(delayedInAppResult instanceof DelayedInAppResult.C1221a)) {
                l9r.m149037a();
                return null;
            }
            Logger logger3 = inAppController.logger;
            String accountId3 = inAppController.config.getAccountId();
            StringBuilder sb3 = new StringBuilder("[InAppController]: in-app discarded ");
            DelayedInAppResult.C1221a c1221a = (DelayedInAppResult.C1221a) delayedInAppResult;
            sb3.append(c1221a.getId());
            sb3.append(": ");
            sb3.append(c1221a.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
            logger3.verbose(accountId3, sb3.toString());
        }
        return Unit.INSTANCE;
    }

    @MainThread
    /* JADX INFO: renamed from: c0 */
    private final void m6233c0(CTInAppNotification inAppNotification) {
        CTInAppBaseFragment cTInAppHtmlFooterFragment;
        if (!m6254y(inAppNotification)) {
            this.logger.verbose(this.defaultLogTag, "Application has decided to not show this in-app notification: " + inAppNotification.getCampaignId());
            m6269d0();
            return;
        }
        if (this.inAppState == InAppState.DISCARDED) {
            this.logger.verbose(this.defaultLogTag, "InApp Notifications are set to be discarded at main thread check, not showing the InApp Notification");
            return;
        }
        if (!qs9.m176173x()) {
            f5014y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "Not in foreground, queueing this In App");
            return;
        }
        if (f5015z != null) {
            f5014y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "In App already displaying, queueing this In App");
            return;
        }
        Activity activityM176169i = qs9.m176169i();
        if (!m6252v(activityM176169i)) {
            f5014y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "Not showing In App on blacklisted activity, queuing this In App");
            return;
        }
        if (this.inAppState == InAppState.SUSPENDED) {
            f5014y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "InApp Notifications are set to be suspended at main thread check, queuing the In App");
            return;
        }
        if (this.clock.currentTimeMillis() / 1000 > inAppNotification.getTimeToLive()) {
            this.logger.debug("InApp has elapsed its time to live, not showing the InApp");
            return;
        }
        if (Intrinsics.m87488d(Constants.KEY_CUSTOM_HTML, inAppNotification.getType()) && !this.networkMonitor.m6803n()) {
            this.logger.debug(this.defaultLogTag, "Not showing HTML InApp due to no internet. An active internet connection is required to display the HTML InApp");
            m6269d0();
            return;
        }
        this.logger.verbose(this.defaultLogTag, "Attempting to show next In-App");
        f5015z = inAppNotification;
        CTInAppType inAppType = inAppNotification.getInAppType();
        switch (inAppType == null ? -1 : C1211b.f5041b[inAppType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                try {
                    if (activityM176169i == null) {
                        throw new IllegalStateException("Current activity reference not found");
                    }
                    this.logger.debug("Displaying In-App: " + inAppNotification.m6175s());
                    InAppNotificationActivity.m5847R0(activityM176169i, inAppNotification, this.config);
                    return;
                } catch (Throwable th) {
                    this.logger.verbose("Please verify the integration of your app. It is not setup to support in-app notifications yet.", th);
                    f5015z = null;
                    return;
                }
            case 11:
                cTInAppHtmlFooterFragment = new CTInAppHtmlFooterFragment();
                break;
            case 12:
                cTInAppHtmlFooterFragment = new CTInAppHtmlHeaderFragment();
                break;
            case 13:
                cTInAppHtmlFooterFragment = new CTInAppNativeFooterFragment();
                break;
            case 14:
                cTInAppHtmlFooterFragment = new CTInAppNativeHeaderFragment();
                break;
            case 15:
                try {
                    if (activityM176169i == null) {
                        throw new IllegalStateException("Current activity reference not found for PIP");
                    }
                    Logger logger = this.logger;
                    logger.getClass();
                    C1220d c1220d = new C1220d(inAppNotification, this, this, logger);
                    C1215c c1215c = C1215c.INSTANCE;
                    Logger logger2 = this.logger;
                    logger2.getClass();
                    C1265a c1265aM6299a = c1215c.m6299a(inAppNotification, c1220d, logger2);
                    Logger logger3 = this.logger;
                    if (c1265aM6299a == null) {
                        logger3.debug(this.defaultLogTag, "Failed to create PIPConfig, skipping");
                        f5015z = null;
                        m6269d0();
                        return;
                    } else {
                        logger3.debug("Displaying PIP In-App: " + inAppNotification.getCampaignId());
                        this.pipManager.m196745F(activityM176169i, c1265aM6299a, null);
                        return;
                    }
                } catch (Throwable th2) {
                    this.logger.verbose("Failed to show PIP in-app", th2);
                    f5015z = null;
                    m6269d0();
                    return;
                }
            case 16:
                m6229W(inAppNotification);
                return;
            default:
                this.logger.debug(this.defaultLogTag, "Unknown InApp Type found: " + inAppType);
                f5015z = null;
                return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = cTInAppHtmlFooterFragment;
        Logger logger4 = this.logger;
        if (activityM176169i == null) {
            logger4.debug("Unable to display In-App: Activity/Fragment is null");
            f5015z = null;
            return;
        }
        logger4.debug("Displaying In-App: " + inAppNotification.m6175s());
        CTInAppBaseFragment.Companion companion = CTInAppBaseFragment.INSTANCE;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
        String str = this.defaultLogTag;
        str.getClass();
        if (companion.m6408a(cTInAppBaseFragment, activityM176169i, inAppNotification, cleverTapInstanceConfig, str)) {
            return;
        }
        f5015z = null;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m6234d(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        inAppController.m6224K(cTInAppNotification);
        inAppController.m6245n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m6235e(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        inAppController.m6219C(cTInAppNotification);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m6236e0(CTInAppNotification notification, CustomTemplateInAppData templateInAppData) {
        String templateName = templateInAppData != null ? templateInAppData.getTemplateName() : null;
        if (templateName == null) {
            this.logger.debug("Cannot present template without name.");
            return;
        }
        oyb oybVarM106884e = this.templatesManager.m106884e(templateName);
        if (oybVarM106884e == null) {
            this.logger.debug("Cannot present non-registered template with name: ".concat(templateName));
            return;
        }
        CustomTemplateInAppData customTemplateInAppDataM6301a = templateInAppData.m6301a();
        customTemplateInAppDataM6301a.m6307g(true);
        CTInAppNotification cTInAppNotificationM6159b = notification.m6159b(customTemplateInAppDataM6301a);
        if (cTInAppNotificationM6159b == null) {
            this.logger.debug("Failed to present custom template with name: ".concat(templateName));
        } else if (oybVarM106884e.getIsVisual()) {
            m6251t(cTInAppNotificationM6159b.m6175s());
        } else {
            m6228V(cTInAppNotificationM6159b.m6175s());
        }
    }

    /* JADX INFO: renamed from: f */
    public static Unit m6237f(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        inAppController.m6224K(cTInAppNotification);
        inAppController.m6245n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6238g(InAppController inAppController, JSONObject jSONObject, String str) {
        inAppController.getClass();
        jSONObject.getClass();
        str.getClass();
        return !inAppController.evaluationManager.m157616C(dqm.INSTANCE.m113097a(jSONObject), str);
    }

    /* JADX INFO: renamed from: h */
    public static Unit m6239h(InAppController inAppController) {
        inAppController.getClass();
        Map<String, ? extends Object> mapM199286f = vpq.m199286f(inAppController.deviceInfo.m133569u());
        n2f n2fVar = inAppController.evaluationManager;
        mapM199286f.getClass();
        g95 g95VarM157628n = n2fVar.m157628n(mapM199286f, inAppController.coreMetaData.m176218p());
        if (!g95VarM157628n.m124778b().isEmpty()) {
            inAppController.m6271u(g95VarM157628n.m124778b());
        }
        if (!g95VarM157628n.m124777a().isEmpty()) {
            m6230a0(inAppController, g95VarM157628n.m124777a(), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static void m6240i(InAppController inAppController, CTInAppNotification cTInAppNotification, Boolean bool) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        if (bool.booleanValue()) {
            inAppController.m6233c0(cTInAppNotification);
        } else {
            inAppController.m6269d0();
        }
    }

    /* JADX INFO: renamed from: j */
    public static Unit m6241j(boolean z, InAppController inAppController, DelayedInAppResult delayedInAppResult) throws JSONException {
        inAppController.getClass();
        delayedInAppResult.getClass();
        if (z) {
            inAppController.logger.verbose(inAppController.config.getAccountId(), "updating ttl for delayed in-apps");
            n2f.m157604N(inAppController.evaluationManager, ((DelayedInAppResult.C1222b) delayedInAppResult).getInApp(), null, 2, null);
        }
        inAppController.m6251t(((DelayedInAppResult.C1222b) delayedInAppResult).getInApp());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m6242k(Context context, InAppController inAppController) {
        context.getClass();
        inAppController.getClass();
        mxf0.INSTANCE.m156907s(context, "local_in_app_count", inAppController.deviceInfo.m133544N());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m6243l(InAppController inAppController) {
        inAppController.getClass();
        inAppController.m6245n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m6244m(final InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        tom tomVarM177574i = inAppController.controllerManager.m177574i();
        if (tomVarM177574i == null) {
            inAppController.logger.verbose(inAppController.defaultLogTag, "InAppFCManager() is null, not showing " + cTInAppNotification.getCampaignId());
            return Boolean.FALSE;
        }
        if (tomVarM177574i.m189909d(cTInAppNotification, new Function2() { // from class: l.lom
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(InAppController.m6238g(this.f129121a, (JSONObject) obj, (String) obj2));
            }
        })) {
            return Boolean.TRUE;
        }
        inAppController.logger.verbose(inAppController.defaultLogTag, "InApp has been rejected by FC, not showing " + cTInAppNotification.getCampaignId());
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: n */
    private final void m6245n() {
        JSONObject jSONObjectMo98307b;
        try {
            if (!m6253w()) {
                this.logger.verbose("Not showing notification on blacklisted activity");
                return;
            }
            if (this.inAppState == InAppState.SUSPENDED) {
                this.logger.debug(this.defaultLogTag, "InApp Notifications are set to be suspended, not showing the InApp Notification");
                return;
            }
            if (m6217A() || (jSONObjectMo98307b = this.inAppQueue.mo98307b()) == null) {
                return;
            }
            if (this.inAppState != InAppState.DISCARDED) {
                m6228V(jSONObjectMo98307b);
            } else {
                this.logger.debug(this.defaultLogTag, "InApp Notifications are set to be discarded, dropping the InApp Notification");
            }
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "InApp: Couldn't parse JSON array string from prefs", th);
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m6251t(JSONObject inApp) {
        if (m6226M(inApp)) {
            return;
        }
        this.inAppQueue.mo98308c(inApp);
        m6269d0();
    }

    /* JADX INFO: renamed from: v */
    private final boolean m6252v(Activity activity) {
        if (activity == null) {
            return true;
        }
        String localClassName = activity.getLocalClassName();
        localClassName.getClass();
        Iterator<String> it = this.inAppExcludedActivityNames.iterator();
        while (it.hasNext()) {
            if (StringsKt.m93412P(localClassName, it.next(), false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    private final boolean m6253w() {
        return m6252v(qs9.m176169i());
    }

    /* JADX INFO: renamed from: y */
    private final boolean m6254y(CTInAppNotification inAppNotification) {
        this.callbackManager.mo100739m();
        return true;
    }

    /* JADX INFO: renamed from: z */
    private final void m6255z(final CTInAppNotification inAppNotification) {
        Task taskM190589a = this.executors.m190589a();
        taskM190589a.m6945f(new pg50() { // from class: l.iom
            @Override // p149l.pg50
            public final void onSuccess(Object obj) {
                InAppController.m6240i(this.f114174a, inAppNotification, (Boolean) obj);
            }
        });
        taskM190589a.m6946g("checkLimitsBeforeShowing", new Callable() { // from class: l.jom
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6244m(this.f118997a, inAppNotification);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final int m6256G() {
        return this.inAppDelayManager.m6330c();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final Function0<Unit> m6257I() {
        return this.onAppLaunchEventSent;
    }

    @Override // p149l.yom
    /* JADX INFO: renamed from: J */
    public void mo5854J(@NotNull final CTInAppNotification inAppNotification, @Nullable Bundle formData) {
        String templateName;
        inAppNotification.getClass();
        if (this.controllerManager.m177574i() != null) {
            CustomTemplateInAppData customTemplateData = inAppNotification.getCustomTemplateData();
            if (customTemplateData == null || (templateName = customTemplateData.getTemplateName()) == null) {
                templateName = "";
            }
            this.logger.verbose(this.defaultLogTag, "InApp Dismissed: " + inAppNotification.getCampaignId() + ' ' + templateName);
        } else {
            this.logger.verbose(this.defaultLogTag, "Not calling InApp Dismissed: " + inAppNotification.getCampaignId() + " because InAppFCManager is null");
        }
        try {
            this.callbackManager.mo100739m();
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "Failed to call the in-app notification listener", th);
        }
        this.executors.m190593e(Constants.TAG_FEATURE_IN_APPS).m6946g("InappController#inAppNotificationDidDismiss", new Callable() { // from class: l.bom
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6237f(this.f76531a, inAppNotification);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m6258O(@NotNull List<? extends JSONObject> appLaunchServerSideDelayedInApps, @Nullable Location userLocation) {
        appLaunchServerSideDelayedInApps.getClass();
        Map<String, ? extends Object> mapM199286f = vpq.m199286f(this.deviceInfo.m133569u());
        n2f n2fVar = this.evaluationManager;
        mapM199286f.getClass();
        List<JSONObject> listM157629o = n2fVar.m157629o(appLaunchServerSideDelayedInApps, mapM199286f, userLocation);
        if (listM157629o.isEmpty()) {
            return;
        }
        m6266Z(listM157629o, false);
    }

    /* JADX INFO: renamed from: P */
    public final void m6259P(@NotNull List<? extends JSONObject> appLaunchServerSideInApps, @Nullable Location userLocation) {
        appLaunchServerSideInApps.getClass();
        Map<String, ? extends Object> mapM199286f = vpq.m199286f(this.deviceInfo.m133569u());
        n2f n2fVar = this.evaluationManager;
        mapM199286f.getClass();
        List<JSONObject> listM157630p = n2fVar.m157630p(appLaunchServerSideInApps, mapM199286f, userLocation);
        if (listM157630p.isEmpty()) {
            return;
        }
        m6271u(listM157630p);
    }

    /* JADX INFO: renamed from: Q */
    public final void m6260Q(@NotNull List<? extends JSONObject> appLaunchServerSideInactionInApps, @Nullable Location userLocation) {
        appLaunchServerSideInactionInApps.getClass();
        Map<String, ? extends Object> mapM199286f = vpq.m199286f(this.deviceInfo.m133569u());
        n2f n2fVar = this.evaluationManager;
        mapM199286f.getClass();
        List<JSONObject> listM157630p = n2fVar.m157630p(appLaunchServerSideInactionInApps, mapM199286f, userLocation);
        if (listM157630p.isEmpty()) {
            return;
        }
        m6268b0(listM157630p);
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final void m6261R(@NotNull Map<String, ? extends Object> chargeDetails, @NotNull List<? extends Map<String, ? extends Object>> items, @Nullable Location userLocation) throws JSONException {
        chargeDetails.getClass();
        items.getClass();
        Map<String, ? extends Object> mapM199286f = vpq.m199286f(this.deviceInfo.m133569u());
        mapM199286f.putAll(chargeDetails);
        g2f g2fVarM157631q = this.evaluationManager.m157631q(mapM199286f, items, userLocation);
        if (!g2fVarM157631q.m124156b().isEmpty()) {
            m6271u(g2fVarM157631q.m124156b());
        }
        if (!g2fVarM157631q.m124155a().isEmpty()) {
            m6230a0(this, g2fVarM157631q.m124155a(), false, 2, null);
        }
        if (g2fVarM157631q.m124157c().isEmpty()) {
            return;
        }
        m6268b0(g2fVarM157631q.m124157c());
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final void m6262S(@NotNull String eventName, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) throws JSONException {
        eventName.getClass();
        eventProperties.getClass();
        Map<String, ? extends Object> mapM199286f = vpq.m199286f(this.deviceInfo.m133569u());
        mapM199286f.putAll(eventProperties);
        g2f g2fVarM157632r = this.evaluationManager.m157632r(eventName, mapM199286f, userLocation);
        if (!g2fVarM157632r.m124156b().isEmpty()) {
            m6271u(g2fVarM157632r.m124156b());
        }
        if (!g2fVarM157632r.m124155a().isEmpty()) {
            m6230a0(this, g2fVarM157632r.m124155a(), false, 2, null);
        }
        if (g2fVarM157632r.m124157c().isEmpty()) {
            return;
        }
        m6268b0(g2fVarM157632r.m124157c());
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m6263T(@NotNull Map<String, ? extends Map<String, ? extends Object>> userAttributeChangedProperties, @Nullable Location location) throws JSONException {
        userAttributeChangedProperties.getClass();
        Map<String, ? extends Object> mapM199286f = vpq.m199286f(this.deviceInfo.m133569u());
        n2f n2fVar = this.evaluationManager;
        mapM199286f.getClass();
        g2f g2fVarM157633s = n2fVar.m157633s(userAttributeChangedProperties, location, mapM199286f);
        if (!g2fVarM157633s.m124156b().isEmpty()) {
            m6271u(g2fVarM157633s.m124156b());
        }
        if (!g2fVarM157633s.m124155a().isEmpty()) {
            m6230a0(this, g2fVarM157633s.m124155a(), false, 2, null);
        }
        if (g2fVarM157633s.m124157c().isEmpty()) {
            return;
        }
        m6268b0(g2fVarM157633s.m124157c());
    }

    @Override // p149l.yom
    @Nullable
    /* JADX INFO: renamed from: U */
    public Bundle mo5860U(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppNotificationButton button, @Nullable Context activityContext) {
        inAppNotification.getClass();
        button.getClass();
        CTInAppAction cTInAppAction = button.action;
        if (cTInAppAction == null) {
            return null;
        }
        return mo5864y0(inAppNotification, cTInAppAction, button.getText(), null, activityContext);
    }

    /* JADX INFO: renamed from: X */
    public final void m6264X(boolean showFallbackSettings) {
        this.inAppActionHandler.m6281e(showFallbackSettings);
    }

    /* JADX INFO: renamed from: Y */
    public final void m6265Y(@NotNull oom display) {
        display.getClass();
        this.inAppDisplayListener = new WeakReference<>(display);
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final void m6266Z(@NotNull List<? extends JSONObject> delayedInApps, final boolean shouldUpdateTTL) {
        delayedInApps.getClass();
        this.logger.verbose(this.config.getAccountId(), "[InAppController]: Scheduling " + delayedInApps.size() + " delayed in-apps");
        this.inAppDelayManager.m6332e(delayedInApps, new Function1() { // from class: l.gom
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InAppController.m6232c(this.f103681a, shouldUpdateTTL, (DelayedInAppResult) obj);
            }
        });
    }

    @Override // p149l.z360
    /* JADX INFO: renamed from: a */
    public void mo6267a(@NotNull final CTInAppNotification inAppNotification) {
        inAppNotification.getClass();
        this.logger.verbose(this.defaultLogTag, "PIP failed to show: " + inAppNotification.getCampaignId());
        this.executors.m190593e(Constants.TAG_FEATURE_IN_APPS).m6946g("InAppController#onPIPShowFailed", new Callable() { // from class: l.mom
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6234d(this.f134921a, inAppNotification);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final void m6268b0(@NotNull List<? extends JSONObject> inActionMetadata) {
        inActionMetadata.getClass();
        this.logger.verbose(this.config.getAccountId(), "[InAppController]: Scheduling " + inActionMetadata.size() + " in-action in-apps");
        this.inAppInActionManager.m6332e(inActionMetadata, new Function1() { // from class: l.hom
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InAppController.m6231b(this.f108831a, (xnm) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6269d0() {
        if (this.config.isAnalyticsOnly()) {
            return;
        }
        this.executors.m190593e(Constants.TAG_FEATURE_IN_APPS).m6946g("InappController#showNotificationIfAvailable", new Callable() { // from class: l.fom
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6243l(this.f98578a);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6270f0() {
        this.logger.verbose("Unregistering InAppDisplay Listener");
        this.inAppDisplayListener = null;
    }

    @Override // p149l.yom
    /* JADX INFO: renamed from: s0 */
    public void mo5863s0(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData) {
        inAppNotification.getClass();
        tom tomVarM177574i = this.controllerManager.m177574i();
        if (tomVarM177574i != null) {
            tomVarM177574i.m189911f(this.context, inAppNotification);
        }
        this.analyticsManager.m203624I(false, inAppNotification, formData);
        try {
            this.callbackManager.mo100739m();
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "Failed to call the in-app notification listener", th);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final void m6271u(@NotNull List<? extends JSONObject> inappNotifs) {
        inappNotifs.getClass();
        try {
            this.inAppQueue.mo98306a(m6222F(inappNotifs));
            m6269d0();
        } catch (Exception e) {
            this.logger.debug(this.defaultLogTag, "InAppController: : InApp notification handling error.", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m6272x() {
        try {
            ih3.m136184b(null, new InAppController$cancelAllScheduledInApps$1(this, null), 1, null);
        } catch (Exception e) {
            this.logger.verbose(this.defaultLogTag, "[InAppController]: Error cancelling scheduled in-apps", e);
        }
    }

    @Override // p149l.yom
    @NotNull
    /* JADX INFO: renamed from: y0 */
    public Bundle mo5864y0(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppAction action, @NotNull String callToAction, @Nullable Bundle additionalData, @Nullable Context activityContext) {
        HashMap<String, String> mapM6127f;
        inAppNotification.getClass();
        action.getClass();
        callToAction.getClass();
        Bundle bundle = additionalData != null ? new Bundle(additionalData) : new Bundle();
        bundle.putString(Constants.NOTIFICATION_ID_TAG, inAppNotification.getCampaignId());
        bundle.putString(Constants.KEY_C2A, callToAction);
        String strM6220D = m6220D(action);
        if (strM6220D != null && strM6220D.length() != 0) {
            bundle.putString(Constants.DEEP_LINK_KEY, strM6220D);
        }
        if (!inAppNotification.getIsLocalInApp()) {
            this.analyticsManager.m203624I(true, inAppNotification, bundle);
        }
        InAppActionType type = action.getType();
        if (type == null) {
            this.logger.debug("Triggered in-app action without type");
            return bundle;
        }
        int i = C1211b.f5040a[type.ordinal()];
        if (i == 1) {
            m6236e0(inAppNotification, action.getCustomTemplateInAppData());
            return bundle;
        }
        if (i != 2) {
            if (i == 3) {
                String actionUrl = action.getActionUrl();
                if (actionUrl != null) {
                    this.inAppActionHandler.m6284i(actionUrl, activityContext);
                    return bundle;
                }
                this.logger.debug("Cannot trigger open url action without url value");
                return bundle;
            }
            if (i == 4 && (mapM6127f = action.m6127f()) != null && (!mapM6127f.isEmpty()) && this.callbackManager.mo100738l() != null) {
                this.callbackManager.mo100738l().m137563a(mapM6127f);
                return bundle;
            }
        } else if (CTInAppType.CTInAppTypeCustomCodeTemplate == inAppNotification.getInAppType()) {
            this.templatesManager.m106883c(inAppNotification);
        }
        return bundle;
    }
}
