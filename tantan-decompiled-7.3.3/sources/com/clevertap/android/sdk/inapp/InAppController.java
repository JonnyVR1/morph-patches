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
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.network.NetworkMonitor;
import com.clevertap.android.sdk.task.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.ab60;
import p153l.arm;
import p153l.bu9;
import p153l.c0c;
import p153l.c4s;
import p153l.ch2;
import p153l.cqi0;
import p153l.csm;
import p153l.ec60;
import p153l.fsm;
import p153l.ha5;
import p153l.l3f;
import p153l.nbr;
import p153l.oa5;
import p153l.p7f;
import p153l.qqm;
import p153l.s3f;
import p153l.sk0;
import p153l.su3;
import p153l.uzd;
import p153l.v5g0;
import p153l.vo50;
import p153l.vqm;
import p153l.w36;
import p153l.wh3;
import p153l.wrq;
import p153l.zpm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 Ô\u00012\u00020\u00012\u00020\u0002:\u0004Õ\u0001\u009d\u0001B«\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b>\u0010=J\u0017\u0010@\u001a\u00020,2\u0006\u0010?\u001a\u00020/H\u0002¢\u0006\u0004\b@\u00102J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u000205H\u0002¢\u0006\u0004\bE\u00109J\u0017\u0010F\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bF\u0010=J\u001f\u0010G\u001a\u00020,2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bI\u0010=J\u0017\u0010J\u001a\u0002052\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0003¢\u0006\u0004\bL\u0010=J\u0017\u0010M\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bM\u0010=J#\u0010P\u001a\b\u0012\u0004\u0012\u00020/0N2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020/0NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u0002052\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bR\u0010SJ!\u0010W\u001a\u00020,2\u0006\u0010T\u001a\u00020:2\b\u0010V\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020,2\u0006\u0010Z\u001a\u00020YH\u0003¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020/2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b]\u0010^J\u0019\u0010a\u001a\u0004\u0018\u00010B2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u0015\u0010e\u001a\u00020,2\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020,¢\u0006\u0004\bg\u0010.J'\u0010j\u001a\u00020,2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020/0N2\b\b\u0002\u0010i\u001a\u000205H\u0007¢\u0006\u0004\bj\u0010kJ\u001d\u0010m\u001a\u00020,2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020/0NH\u0007¢\u0006\u0004\bm\u0010nJ\r\u0010p\u001a\u00020o¢\u0006\u0004\bp\u0010qJ\u0015\u0010s\u001a\u00020,2\u0006\u0010r\u001a\u000205¢\u0006\u0004\bs\u0010tJ;\u0010y\u001a\u00020v2\u0006\u0010;\u001a\u00020:2\u0006\u0010`\u001a\u00020_2\u0006\u0010u\u001a\u00020B2\b\u0010w\u001a\u0004\u0018\u00010v2\b\u0010x\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\by\u0010zJ+\u0010}\u001a\u0004\u0018\u00010v2\u0006\u0010;\u001a\u00020:2\u0006\u0010|\u001a\u00020{2\b\u0010x\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b}\u0010~J$\u0010\u0080\u0001\u001a\u00020,2\u0006\u0010;\u001a\u00020:2\b\u0010\u007f\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J$\u0010\u0082\u0001\u001a\u00020,2\u0006\u0010;\u001a\u00020:2\b\u0010\u007f\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J \u0010\u0084\u0001\u001a\u00020,2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020/0NH\u0007¢\u0006\u0005\b\u0084\u0001\u0010nJ>\u0010\u008b\u0001\u001a\u00020,2\u0007\u0010\u0085\u0001\u001a\u00020B2\u0015\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001JR\u0010\u008f\u0001\u001a\u00020,2\u0015\u0010\u008d\u0001\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00012\u001b\u0010\u008e\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020B\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00010N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JD\u0010\u0093\u0001\u001a\u00020,2$\u0010\u0091\u0001\u001a\u001f\u0012\u0004\u0012\u00020B\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020B\u0012\u0007\u0012\u0005\u0018\u00010\u0087\u00010\u0086\u00010\u0086\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0007¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J+\u0010\u0096\u0001\u001a\u00020,2\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020/0N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J+\u0010\u0099\u0001\u001a\u00020,2\r\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020/0N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u0097\u0001J+\u0010\u009b\u0001\u001a\u00020,2\r\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020/0N2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u0097\u0001J\u000f\u0010\u009c\u0001\u001a\u00020,¢\u0006\u0005\b\u009c\u0001\u0010.J\u0019\u0010\u009d\u0001\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0005\b\u009d\u0001\u0010=J\u0011\u0010\u009e\u0001\u001a\u00020,H\u0007¢\u0006\u0005\b\u009e\u0001\u0010.R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009f\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010¸\u0001R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\"\u0010Ã\u0001\u001a\u000b\u0012\u0004\u0012\u00020c\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\"\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020,0Ä\u00018\u0006¢\u0006\u000f\n\u0005\b1\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\"\u0010Ì\u0001\u001a\r Ê\u0001*\u0005\u0018\u00010É\u00010É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010Ë\u0001R\u001f\u0010Î\u0001\u001a\u000b Ê\u0001*\u0004\u0018\u00010B0B8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010Í\u0001R\u0019\u0010Ñ\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b8\u0010Ð\u0001R\u001d\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010Ò\u0001¨\u0006Ö\u0001"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/InAppController;", "Ll/arm;", "Ll/ec60;", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/su3;", "executors", "Ll/w36;", "controllerManager", "Ll/ch2;", "callbackManager", "Ll/sk0;", "analyticsManager", "Ll/bu9;", "coreMetaData", "Lcom/clevertap/android/sdk/ManifestInfo;", "manifestInfo", "Ll/uzd;", "deviceInfo", "Ll/csm;", "inAppQueue", "Ll/s3f;", "evaluationManager", "Ll/cqi0;", "templatesManager", "Lcom/clevertap/android/sdk/inapp/a;", "inAppActionHandler", "Lcom/clevertap/android/sdk/inapp/b;", "inAppNotificationInflater", "Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "Lcom/clevertap/android/sdk/inapp/delay/DelayedInAppResult;", "inAppDelayManager", "Ll/zpm;", "inAppInActionManager", "Ll/oa5;", "clock", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "networkMonitor", "Ll/ab60;", "pipManager", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/su3;Ll/w36;Ll/ch2;Ll/sk0;Ll/bu9;Lcom/clevertap/android/sdk/ManifestInfo;Ll/uzd;Ll/csm;Ll/s3f;Ll/cqi0;Lcom/clevertap/android/sdk/inapp/a;Lcom/clevertap/android/sdk/inapp/b;Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;Ll/oa5;Lcom/clevertap/android/sdk/network/NetworkMonitor;Ll/ab60;)V", "", "n", "()V", "Lorg/json/JSONObject;", "inApp", Constants.KEY_T, "(Lorg/json/JSONObject;)V", "Landroid/app/Activity;", "activity", "", ResourceDirection.f39656v, "(Landroid/app/Activity;)Z", "w", "()Z", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inAppNotification", c4s.C_ZONE, "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "N", "jsonObject", "U", "", "", "H", "(Lcom/clevertap/android/sdk/ManifestInfo;)Ljava/util/Set;", "A", "J", "L", "(Landroid/content/Context;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", BaseSei.f14626Z, BaseSei.f14625Y, "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)Z", "c0", "W", "", "inAppNotifications", "F", "(Ljava/util/List;)Ljava/util/List;", "M", "(Lorg/json/JSONObject;)Z", "notification", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "templateInAppData", "e0", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V", "", "targetId", "E", "(J)V", "B", "(J)Lorg/json/JSONObject;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "action", "D", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;)Ljava/lang/String;", "Ll/qqm;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Y", "(Ll/qqm;)V", "f0", "delayedInApps", "shouldUpdateTTL", "Z", "(Ljava/util/List;Z)V", "inActionMetadata", "b0", "(Ljava/util/List;)V", "", "G", "()I", "showFallbackSettings", "X", "(Z)V", "callToAction", "Landroid/os/Bundle;", "additionalData", "activityContext", "A0", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppAction;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;)Landroid/os/Bundle;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "button", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;Landroid/content/Context;)Landroid/os/Bundle;", "formData", "K", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Landroid/os/Bundle;)V", "t0", "inappNotifs", "u", "eventName", "", "", "eventProperties", "Landroid/location/Location;", "userLocation", p7f.LATITUDE_SOUTH, "(Ljava/lang/String;Ljava/util/Map;Landroid/location/Location;)V", "chargeDetails", FirebaseAnalytics.Param.ITEMS, "R", "(Ljava/util/Map;Ljava/util/List;Landroid/location/Location;)V", "userAttributeChangedProperties", "location", p7f.GPS_DIRECTION_TRUE, "(Ljava/util/Map;Landroid/location/Location;)V", "appLaunchServerSideInApps", "P", "(Ljava/util/List;Landroid/location/Location;)V", "appLaunchServerSideInactionInApps", "Q", "appLaunchServerSideDelayedInApps", BloodType.f39576O, "d0", "a", BaseSei.f14624X, "Landroid/content/Context;", "b", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "c", "Ll/su3;", Constants.INAPP_DATA_TAG, "Ll/w36;", "e", "Ll/ch2;", "f", "Ll/sk0;", "g", "Ll/bu9;", "h", "Ll/uzd;", RXScreenCaptureService.KEY_INDEX, "Ll/csm;", "j", "Ll/s3f;", "k", "Ll/cqi0;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/clevertap/android/sdk/inapp/a;", "m", "Lcom/clevertap/android/sdk/inapp/b;", "Lcom/clevertap/android/sdk/inapp/delay/InAppScheduler;", "o", "p", "Ll/oa5;", "q", "Lcom/clevertap/android/sdk/network/NetworkMonitor;", "r", "Ll/ab60;", "Ljava/lang/ref/WeakReference;", BLiveStormDanmakuGiftResourceType.f45294s, "Ljava/lang/ref/WeakReference;", "inAppDisplayListener", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "I", "()Lkotlin/jvm/functions/Function0;", "onAppLaunchEventSent", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "logger", "Ljava/lang/String;", "defaultLogTag", "Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "inAppState", "Ljava/util/Set;", "inAppExcludedActivityNames", "Companion", "InAppState", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class InAppController implements arm, ec60 {

    /* JADX INFO: renamed from: y */
    private static final List<CTInAppNotification> f5051y = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: z */
    @Nullable
    private static volatile CTInAppNotification f5052z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final su3 executors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final w36 controllerManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ch2 callbackManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final sk0 analyticsManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final uzd deviceInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final csm inAppQueue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final s3f evaluationManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final cqi0 templatesManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final C1236a inAppActionHandler;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final C1237b inAppNotificationInflater;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final InAppScheduler<DelayedInAppResult> inAppDelayManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final InAppScheduler<zpm> inAppInActionManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final NetworkMonitor networkMonitor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final ab60 pipManager;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    private WeakReference<qqm> inAppDisplayListener;

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

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "", "<init>", "(Ljava/lang/String;I)V", "DISCARDED", "SUSPENDED", "RESUMED", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public enum InAppState {
        DISCARDED,
        SUSPENDED,
        RESUMED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<InAppState> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1234b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5077a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f5078b;

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
            f5077a = iArr;
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
            f5078b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.InAppController$c */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1235c implements C1237b.a, FunctionAdapter {
        public C1235c() {
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function<?> mo6327a() {
            return new FunctionReferenceImpl(1, InAppController.this, InAppController.class, "notificationReady", "notificationReady(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", 0);
        }

        @Override // com.clevertap.android.sdk.inapp.C1237b.a
        /* JADX INFO: renamed from: b */
        public final void mo6328b(CTInAppNotification cTInAppNotification) {
            cTInAppNotification.getClass();
            InAppController.this.m6281N(cTInAppNotification);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C1237b.a) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m88377d(mo6327a(), ((FunctionAdapter) obj).mo6327a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6327a().hashCode();
        }
    }

    public InAppController(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull su3 su3Var, @NotNull w36 w36Var, @NotNull ch2 ch2Var, @NotNull sk0 sk0Var, @NotNull bu9 bu9Var, @NotNull ManifestInfo manifestInfo, @NotNull uzd uzdVar, @NotNull csm csmVar, @NotNull s3f s3fVar, @NotNull cqi0 cqi0Var, @NotNull C1236a c1236a, @NotNull C1237b c1237b, @NotNull InAppScheduler<DelayedInAppResult> inAppScheduler, @NotNull InAppScheduler<zpm> inAppScheduler2, @NotNull oa5 oa5Var, @NotNull NetworkMonitor networkMonitor, @NotNull ab60 ab60Var) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        su3Var.getClass();
        w36Var.getClass();
        ch2Var.getClass();
        sk0Var.getClass();
        bu9Var.getClass();
        manifestInfo.getClass();
        uzdVar.getClass();
        csmVar.getClass();
        s3fVar.getClass();
        cqi0Var.getClass();
        c1236a.getClass();
        c1237b.getClass();
        inAppScheduler.getClass();
        inAppScheduler2.getClass();
        oa5Var.getClass();
        networkMonitor.getClass();
        ab60Var.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.executors = su3Var;
        this.controllerManager = w36Var;
        this.callbackManager = ch2Var;
        this.analyticsManager = sk0Var;
        this.coreMetaData = bu9Var;
        this.deviceInfo = uzdVar;
        this.inAppQueue = csmVar;
        this.evaluationManager = s3fVar;
        this.templatesManager = cqi0Var;
        this.inAppActionHandler = c1236a;
        this.inAppNotificationInflater = c1237b;
        this.inAppDelayManager = inAppScheduler;
        this.inAppInActionManager = inAppScheduler2;
        this.clock = oa5Var;
        this.networkMonitor = networkMonitor;
        this.pipManager = ab60Var;
        this.onAppLaunchEventSent = new Function0() { // from class: l.gqm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppController.m6293h(this.f105690a);
            }
        };
        this.logger = cleverTapInstanceConfig.getLogger();
        this.defaultLogTag = cleverTapInstanceConfig.getAccountId();
        this.inAppState = InAppState.RESUMED;
        this.inAppExcludedActivityNames = m6277H(manifestInfo);
    }

    /* JADX INFO: renamed from: A */
    private final boolean m6271A() {
        this.logger.verbose(this.defaultLogTag, "checking Pending Notifications");
        List<CTInAppNotification> list = f5051y;
        list.getClass();
        synchronized (list) {
            if (list.isEmpty()) {
                return false;
            }
            CTInAppNotification cTInAppNotificationRemove = list.remove(0);
            cTInAppNotificationRemove.getClass();
            m6309z(cTInAppNotificationRemove);
            return true;
        }
    }

    /* JADX INFO: renamed from: B */
    private final JSONObject m6272B(long targetId) throws JSONException {
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
    private final void m6273C(final CTInAppNotification inAppNotification) {
        if (!Intrinsics.m88377d(Looper.myLooper(), Looper.getMainLooper())) {
            this.executors.m187989c().m7000g("InAppController:displayNotification", new Callable() { // from class: l.eqm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InAppController.m6289e(this.f95351a, inAppNotification);
                }
            });
            return;
        }
        if (!inAppNotification.getIsRequestForPushPermission() || !this.inAppActionHandler.m6332b()) {
            m6309z(inAppNotification);
            m6279L(this.context, inAppNotification);
        } else {
            this.logger.verbose(this.defaultLogTag, "Not showing push permission request, permission is already granted");
            this.inAppActionHandler.m6337h();
            m6323d0();
        }
    }

    /* JADX INFO: renamed from: D */
    private final String m6274D(CTInAppAction action) {
        String actionUrl;
        if (action.getType() != InAppActionType.OPEN_URL || (actionUrl = action.getActionUrl()) == null || actionUrl.length() == 0) {
            return null;
        }
        return actionUrl;
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    private final void m6275E(long targetId) throws JSONException {
        this.logger.verbose(this.defaultLogTag, "Fetching in-action in-app content for targetId: " + targetId);
        this.analyticsManager.m186390S(m6272B(targetId));
    }

    /* JADX INFO: renamed from: F */
    private final List<JSONObject> m6276F(List<? extends JSONObject> inAppNotifications) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : inAppNotifications) {
            if (!m6280M((JSONObject) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    private final Set<String> m6277H(ManifestInfo manifestInfo) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String strM5940i = manifestInfo.m5940i();
        if (strM5940i != null) {
            Iterator it = StringsKt.split$default(strM5940i, new String[]{Constants.SEPARATOR_COMMA}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                String string = StringsKt.m94324Z0((String) it.next()).toString();
                if (!StringsKt.m94329e0(string)) {
                    linkedHashSet.add(string);
                }
            }
        }
        this.logger.debug(this.defaultLogTag, "In-app notifications will not be shown on " + CollectionsKt.joinToString$default(linkedHashSet, null, null, null, 0, null, null, 63, null));
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: J */
    private final void m6278J(CTInAppNotification inAppNotification) {
        this.logger.verbose(this.defaultLogTag, "Running inAppDidDismiss");
        if (f5052z != null) {
            CTInAppNotification cTInAppNotification = f5052z;
            if (Intrinsics.m88377d(cTInAppNotification != null ? cTInAppNotification.getCampaignId() : null, inAppNotification.getCampaignId())) {
                f5052z = null;
                m6271A();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m6279L(final Context context, CTInAppNotification inAppNotification) {
        if (inAppNotification.getIsLocalInApp()) {
            this.deviceInfo.m198778a0();
            this.executors.m187987a().m7000g("InAppController#incrementLocalInAppCountInPersistentStore", new Callable() { // from class: l.fqm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InAppController.m6296k(context, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    private final boolean m6280M(JSONObject inApp) {
        CustomTemplateInAppData customTemplateInAppDataM6363a = CustomTemplateInAppData.INSTANCE.m6363a(inApp);
        String templateName = customTemplateInAppDataM6363a != null ? customTemplateInAppDataM6363a.getTemplateName() : null;
        boolean z = (templateName == null || this.templatesManager.m111909f(templateName)) ? false : true;
        if (z) {
            this.logger.info("CustomTemplates", "Template with name \"" + templateName + "\" is not registered and cannot be presented");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final void m6281N(CTInAppNotification inAppNotification) {
        String templateName;
        if (inAppNotification.getError() != null) {
            this.logger.debug(this.defaultLogTag, "Unable to process inapp notification " + inAppNotification.getError());
            return;
        }
        CustomTemplateInAppData customTemplateData = inAppNotification.getCustomTemplateData();
        c0c c0cVarM111908e = (customTemplateData == null || (templateName = customTemplateData.getTemplateName()) == null) ? null : this.templatesManager.m111908e(templateName);
        this.logger.debug(this.defaultLogTag, "Notification ready: " + inAppNotification.m6229s());
        if (c0cVarM111908e == null || c0cVarM111908e.getIsVisual()) {
            m6273C(inAppNotification);
        } else {
            m6283W(inAppNotification);
        }
    }

    /* JADX INFO: renamed from: U */
    private final void m6282U(JSONObject jsonObject) {
        this.logger.debug(this.defaultLogTag, "Preparing In-App for display: " + jsonObject);
        this.inAppNotificationInflater.m6347d(jsonObject, "InappController#prepareNotificationForDisplay", new C1235c());
    }

    /* JADX INFO: renamed from: W */
    private final void m6283W(CTInAppNotification inAppNotification) {
        this.templatesManager.m111910g(inAppNotification, this, FileResourceProvider.INSTANCE.m6556a(this.context, this.logger));
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m6284a0(InAppController inAppController, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        inAppController.m6320Z(list, z);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6285b(InAppController inAppController, zpm zpmVar) throws JSONException {
        inAppController.getClass();
        zpmVar.getClass();
        if (zpmVar instanceof zpm.C21858d) {
            Logger logger = inAppController.logger;
            String str = inAppController.defaultLogTag;
            StringBuilder sb = new StringBuilder("[InAppController]: In-action duration expired for targetId: ");
            zpm.C21858d c21858d = (zpm.C21858d) zpmVar;
            sb.append(c21858d.getTargetId());
            sb.append(", calling fetch API");
            logger.verbose(str, sb.toString());
            inAppController.m6275E(c21858d.getTargetId());
        } else if (zpmVar instanceof zpm.C21857c) {
            Logger logger2 = inAppController.logger;
            String str2 = inAppController.defaultLogTag;
            StringBuilder sb2 = new StringBuilder("[InAppController]Error scheduling in-action in-app: ");
            zpm.C21857c c21857c = (zpm.C21857c) zpmVar;
            sb2.append(c21857c.getMessage());
            sb2.append(" for targetId: ");
            sb2.append(c21857c.getTargetId());
            logger2.verbose(str2, sb2.toString());
        } else if (zpmVar instanceof zpm.C21855a) {
            inAppController.logger.verbose(inAppController.defaultLogTag, "[InAppController]In-action in-app cancelled for targetId: " + ((zpm.C21855a) zpmVar).m220849a());
        } else {
            if (!(zpmVar instanceof zpm.C21856b)) {
                nbr.m162172a();
                return null;
            }
            Logger logger3 = inAppController.logger;
            String str3 = inAppController.defaultLogTag;
            StringBuilder sb3 = new StringBuilder("[InAppController]In-action: in-app discarded ");
            zpm.C21856b c21856b = (zpm.C21856b) zpmVar;
            sb3.append(c21856b.getTargetId());
            sb3.append(": ");
            sb3.append(c21856b.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
            logger3.verbose(str3, sb3.toString());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m6286c(final InAppController inAppController, final boolean z, final DelayedInAppResult delayedInAppResult) {
        inAppController.getClass();
        delayedInAppResult.getClass();
        if (delayedInAppResult instanceof DelayedInAppResult.C1245b) {
            Logger logger = inAppController.logger;
            String accountId = inAppController.config.getAccountId();
            StringBuilder sb = new StringBuilder("[InAppController]: Successfully retrieved delayed in-app ");
            DelayedInAppResult.C1245b c1245b = (DelayedInAppResult.C1245b) delayedInAppResult;
            sb.append(c1245b.getInAppId());
            logger.verbose(accountId, sb.toString());
            inAppController.executors.m187991e(Constants.TAG_FEATURE_IN_APPS).m7000g("InAppController#executeDelayedInAppCallback-" + c1245b.getInAppId(), new Callable() { // from class: l.mqm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return InAppController.m6295j(z, inAppController, delayedInAppResult);
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
            if (!(delayedInAppResult instanceof DelayedInAppResult.C1244a)) {
                nbr.m162172a();
                return null;
            }
            Logger logger3 = inAppController.logger;
            String accountId3 = inAppController.config.getAccountId();
            StringBuilder sb3 = new StringBuilder("[InAppController]: in-app discarded ");
            DelayedInAppResult.C1244a c1244a = (DelayedInAppResult.C1244a) delayedInAppResult;
            sb3.append(c1244a.getId());
            sb3.append(": ");
            sb3.append(c1244a.getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
            logger3.verbose(accountId3, sb3.toString());
        }
        return Unit.INSTANCE;
    }

    @MainThread
    /* JADX INFO: renamed from: c0 */
    private final void m6287c0(CTInAppNotification inAppNotification) {
        CTInAppBaseFragment cTInAppHtmlFooterFragment;
        if (!m6308y(inAppNotification)) {
            this.logger.verbose(this.defaultLogTag, "Application has decided to not show this in-app notification: " + inAppNotification.getCampaignId());
            m6323d0();
            return;
        }
        if (this.inAppState == InAppState.DISCARDED) {
            this.logger.verbose(this.defaultLogTag, "InApp Notifications are set to be discarded at main thread check, not showing the InApp Notification");
            return;
        }
        if (!bu9.m106440x()) {
            f5051y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "Not in foreground, queueing this In App");
            return;
        }
        if (f5052z != null) {
            f5051y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "In App already displaying, queueing this In App");
            return;
        }
        Activity activityM106436i = bu9.m106436i();
        if (!m6306v(activityM106436i)) {
            f5051y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "Not showing In App on blacklisted activity, queuing this In App");
            return;
        }
        if (this.inAppState == InAppState.SUSPENDED) {
            f5051y.add(inAppNotification);
            this.logger.verbose(this.defaultLogTag, "InApp Notifications are set to be suspended at main thread check, queuing the In App");
            return;
        }
        if (this.clock.currentTimeMillis() / 1000 > inAppNotification.getTimeToLive()) {
            this.logger.debug("InApp has elapsed its time to live, not showing the InApp");
            return;
        }
        if (Intrinsics.m88377d(Constants.KEY_CUSTOM_HTML, inAppNotification.getType()) && !this.networkMonitor.m6857n()) {
            this.logger.debug(this.defaultLogTag, "Not showing HTML InApp due to no internet. An active internet connection is required to display the HTML InApp");
            m6323d0();
            return;
        }
        this.logger.verbose(this.defaultLogTag, "Attempting to show next In-App");
        f5052z = inAppNotification;
        CTInAppType inAppType = inAppNotification.getInAppType();
        switch (inAppType == null ? -1 : C1234b.f5078b[inAppType.ordinal()]) {
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
                    if (activityM106436i == null) {
                        throw new IllegalStateException("Current activity reference not found");
                    }
                    this.logger.debug("Displaying In-App: " + inAppNotification.m6229s());
                    InAppNotificationActivity.m5901S0(activityM106436i, inAppNotification, this.config);
                    return;
                } catch (Throwable th) {
                    this.logger.verbose("Please verify the integration of your app. It is not setup to support in-app notifications yet.", th);
                    f5052z = null;
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
                    if (activityM106436i == null) {
                        throw new IllegalStateException("Current activity reference not found for PIP");
                    }
                    Logger logger = this.logger;
                    logger.getClass();
                    C1243d c1243d = new C1243d(inAppNotification, this, this, logger);
                    C1238c c1238c = C1238c.INSTANCE;
                    Logger logger2 = this.logger;
                    logger2.getClass();
                    C1288a c1288aM6353a = c1238c.m6353a(inAppNotification, c1243d, logger2);
                    Logger logger3 = this.logger;
                    if (c1288aM6353a == null) {
                        logger3.debug(this.defaultLogTag, "Failed to create PIPConfig, skipping");
                        f5052z = null;
                        m6323d0();
                        return;
                    } else {
                        logger3.debug("Displaying PIP In-App: " + inAppNotification.getCampaignId());
                        this.pipManager.m96732F(activityM106436i, c1288aM6353a, null);
                        return;
                    }
                } catch (Throwable th2) {
                    this.logger.verbose("Failed to show PIP in-app", th2);
                    f5052z = null;
                    m6323d0();
                    return;
                }
            case 16:
                m6283W(inAppNotification);
                return;
            default:
                this.logger.debug(this.defaultLogTag, "Unknown InApp Type found: " + inAppType);
                f5052z = null;
                return;
        }
        CTInAppBaseFragment cTInAppBaseFragment = cTInAppHtmlFooterFragment;
        Logger logger4 = this.logger;
        if (activityM106436i == null) {
            logger4.debug("Unable to display In-App: Activity/Fragment is null");
            f5052z = null;
            return;
        }
        logger4.debug("Displaying In-App: " + inAppNotification.m6229s());
        CTInAppBaseFragment.Companion companion = CTInAppBaseFragment.INSTANCE;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
        String str = this.defaultLogTag;
        str.getClass();
        if (companion.m6462a(cTInAppBaseFragment, activityM106436i, inAppNotification, cleverTapInstanceConfig, str)) {
            return;
        }
        f5052z = null;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m6288d(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        inAppController.m6278J(cTInAppNotification);
        inAppController.m6299n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m6289e(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        inAppController.m6273C(cTInAppNotification);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m6290e0(CTInAppNotification notification, CustomTemplateInAppData templateInAppData) {
        String templateName = templateInAppData != null ? templateInAppData.getTemplateName() : null;
        if (templateName == null) {
            this.logger.debug("Cannot present template without name.");
            return;
        }
        c0c c0cVarM111908e = this.templatesManager.m111908e(templateName);
        if (c0cVarM111908e == null) {
            this.logger.debug("Cannot present non-registered template with name: ".concat(templateName));
            return;
        }
        CustomTemplateInAppData customTemplateInAppDataM6355a = templateInAppData.m6355a();
        customTemplateInAppDataM6355a.m6361g(true);
        CTInAppNotification cTInAppNotificationM6213b = notification.m6213b(customTemplateInAppDataM6355a);
        if (cTInAppNotificationM6213b == null) {
            this.logger.debug("Failed to present custom template with name: ".concat(templateName));
        } else if (c0cVarM111908e.getIsVisual()) {
            m6305t(cTInAppNotificationM6213b.m6229s());
        } else {
            m6282U(cTInAppNotificationM6213b.m6229s());
        }
    }

    /* JADX INFO: renamed from: f */
    public static Unit m6291f(InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        inAppController.m6278J(cTInAppNotification);
        inAppController.m6299n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6292g(InAppController inAppController, JSONObject jSONObject, String str) {
        inAppController.getClass();
        jSONObject.getClass();
        str.getClass();
        return !inAppController.evaluationManager.m184252C(fsm.INSTANCE.m127224a(jSONObject), str);
    }

    /* JADX INFO: renamed from: h */
    public static Unit m6293h(InAppController inAppController) {
        inAppController.getClass();
        Map<String, ? extends Object> mapM207619f = wrq.m207619f(inAppController.deviceInfo.m198792u());
        s3f s3fVar = inAppController.evaluationManager;
        mapM207619f.getClass();
        ha5 ha5VarM184264n = s3fVar.m184264n(mapM207619f, inAppController.coreMetaData.m106485p());
        if (!ha5VarM184264n.m134130b().isEmpty()) {
            inAppController.m6325u(ha5VarM184264n.m134130b());
        }
        if (!ha5VarM184264n.m134129a().isEmpty()) {
            m6284a0(inAppController, ha5VarM184264n.m134129a(), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static void m6294i(InAppController inAppController, CTInAppNotification cTInAppNotification, Boolean bool) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        if (bool.booleanValue()) {
            inAppController.m6287c0(cTInAppNotification);
        } else {
            inAppController.m6323d0();
        }
    }

    /* JADX INFO: renamed from: j */
    public static Unit m6295j(boolean z, InAppController inAppController, DelayedInAppResult delayedInAppResult) throws JSONException {
        inAppController.getClass();
        delayedInAppResult.getClass();
        if (z) {
            inAppController.logger.verbose(inAppController.config.getAccountId(), "updating ttl for delayed in-apps");
            s3f.m184240N(inAppController.evaluationManager, ((DelayedInAppResult.C1245b) delayedInAppResult).getInApp(), null, 2, null);
        }
        inAppController.m6305t(((DelayedInAppResult.C1245b) delayedInAppResult).getInApp());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static Unit m6296k(Context context, InAppController inAppController) {
        context.getClass();
        inAppController.getClass();
        v5g0.INSTANCE.m199873s(context, "local_in_app_count", inAppController.deviceInfo.m198767N());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static Unit m6297l(InAppController inAppController) {
        inAppController.getClass();
        inAppController.m6299n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m6298m(final InAppController inAppController, CTInAppNotification cTInAppNotification) {
        inAppController.getClass();
        cTInAppNotification.getClass();
        vqm vqmVarM204746i = inAppController.controllerManager.m204746i();
        if (vqmVarM204746i == null) {
            inAppController.logger.verbose(inAppController.defaultLogTag, "InAppFCManager() is null, not showing " + cTInAppNotification.getCampaignId());
            return Boolean.FALSE;
        }
        if (vqmVarM204746i.m202401d(cTInAppNotification, new Function2() { // from class: l.nqm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(InAppController.m6292g(this.f143244a, (JSONObject) obj, (String) obj2));
            }
        })) {
            return Boolean.TRUE;
        }
        inAppController.logger.verbose(inAppController.defaultLogTag, "InApp has been rejected by FC, not showing " + cTInAppNotification.getCampaignId());
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: n */
    private final void m6299n() {
        JSONObject jSONObjectMo112187b;
        try {
            if (!m6307w()) {
                this.logger.verbose("Not showing notification on blacklisted activity");
                return;
            }
            if (this.inAppState == InAppState.SUSPENDED) {
                this.logger.debug(this.defaultLogTag, "InApp Notifications are set to be suspended, not showing the InApp Notification");
                return;
            }
            if (m6271A() || (jSONObjectMo112187b = this.inAppQueue.mo112187b()) == null) {
                return;
            }
            if (this.inAppState != InAppState.DISCARDED) {
                m6282U(jSONObjectMo112187b);
            } else {
                this.logger.debug(this.defaultLogTag, "InApp Notifications are set to be discarded, dropping the InApp Notification");
            }
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "InApp: Couldn't parse JSON array string from prefs", th);
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m6305t(JSONObject inApp) {
        if (m6280M(inApp)) {
            return;
        }
        this.inAppQueue.mo112188c(inApp);
        m6323d0();
    }

    /* JADX INFO: renamed from: v */
    private final boolean m6306v(Activity activity) {
        if (activity == null) {
            return true;
        }
        String localClassName = activity.getLocalClassName();
        localClassName.getClass();
        Iterator<String> it = this.inAppExcludedActivityNames.iterator();
        while (it.hasNext()) {
            if (StringsKt.m94303P(localClassName, it.next(), false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    private final boolean m6307w() {
        return m6306v(bu9.m106436i());
    }

    /* JADX INFO: renamed from: y */
    private final boolean m6308y(CTInAppNotification inAppNotification) {
        this.callbackManager.mo96519m();
        return true;
    }

    /* JADX INFO: renamed from: z */
    private final void m6309z(final CTInAppNotification inAppNotification) {
        Task taskM187987a = this.executors.m187987a();
        taskM187987a.m6999f(new vo50() { // from class: l.kqm
            @Override // p153l.vo50
            public final void onSuccess(Object obj) {
                InAppController.m6294i(this.f128258a, inAppNotification, (Boolean) obj);
            }
        });
        taskM187987a.m7000g("checkLimitsBeforeShowing", new Callable() { // from class: l.lqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6298m(this.f133230a, inAppNotification);
            }
        });
    }

    @Override // p153l.arm
    @NotNull
    /* JADX INFO: renamed from: A0 */
    public Bundle mo5906A0(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppAction action, @NotNull String callToAction, @Nullable Bundle additionalData, @Nullable Context activityContext) {
        HashMap<String, String> mapM6181f;
        inAppNotification.getClass();
        action.getClass();
        callToAction.getClass();
        Bundle bundle = additionalData != null ? new Bundle(additionalData) : new Bundle();
        bundle.putString(Constants.NOTIFICATION_ID_TAG, inAppNotification.getCampaignId());
        bundle.putString(Constants.KEY_C2A, callToAction);
        String strM6274D = m6274D(action);
        if (strM6274D != null && strM6274D.length() != 0) {
            bundle.putString(Constants.DEEP_LINK_KEY, strM6274D);
        }
        if (!inAppNotification.getIsLocalInApp()) {
            this.analyticsManager.m186380I(true, inAppNotification, bundle);
        }
        InAppActionType type = action.getType();
        if (type == null) {
            this.logger.debug("Triggered in-app action without type");
            return bundle;
        }
        int i = C1234b.f5077a[type.ordinal()];
        if (i == 1) {
            m6290e0(inAppNotification, action.getCustomTemplateInAppData());
            return bundle;
        }
        if (i != 2) {
            if (i == 3) {
                String actionUrl = action.getActionUrl();
                if (actionUrl != null) {
                    this.inAppActionHandler.m6338i(actionUrl, activityContext);
                    return bundle;
                }
                this.logger.debug("Cannot trigger open url action without url value");
                return bundle;
            }
            if (i == 4 && (mapM6181f = action.m6181f()) != null && (!mapM6181f.isEmpty()) && this.callbackManager.mo96518l() != null) {
                this.callbackManager.mo96518l().m151102a(mapM6181f);
                return bundle;
            }
        } else if (CTInAppType.CTInAppTypeCustomCodeTemplate == inAppNotification.getInAppType()) {
            this.templatesManager.m111907c(inAppNotification);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: G */
    public final int m6310G() {
        return this.inAppDelayManager.m6384c();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final Function0<Unit> m6311I() {
        return this.onAppLaunchEventSent;
    }

    @Override // p153l.arm
    /* JADX INFO: renamed from: K */
    public void mo5909K(@NotNull final CTInAppNotification inAppNotification, @Nullable Bundle formData) {
        String templateName;
        inAppNotification.getClass();
        if (this.controllerManager.m204746i() != null) {
            CustomTemplateInAppData customTemplateData = inAppNotification.getCustomTemplateData();
            if (customTemplateData == null || (templateName = customTemplateData.getTemplateName()) == null) {
                templateName = "";
            }
            this.logger.verbose(this.defaultLogTag, "InApp Dismissed: " + inAppNotification.getCampaignId() + ' ' + templateName);
        } else {
            this.logger.verbose(this.defaultLogTag, "Not calling InApp Dismissed: " + inAppNotification.getCampaignId() + " because InAppFCManager is null");
        }
        try {
            this.callbackManager.mo96519m();
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "Failed to call the in-app notification listener", th);
        }
        this.executors.m187991e(Constants.TAG_FEATURE_IN_APPS).m7000g("InappController#inAppNotificationDidDismiss", new Callable() { // from class: l.dqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6291f(this.f90261a, inAppNotification);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m6312O(@NotNull List<? extends JSONObject> appLaunchServerSideDelayedInApps, @Nullable Location userLocation) {
        appLaunchServerSideDelayedInApps.getClass();
        Map<String, ? extends Object> mapM207619f = wrq.m207619f(this.deviceInfo.m198792u());
        s3f s3fVar = this.evaluationManager;
        mapM207619f.getClass();
        List<JSONObject> listM184265o = s3fVar.m184265o(appLaunchServerSideDelayedInApps, mapM207619f, userLocation);
        if (listM184265o.isEmpty()) {
            return;
        }
        m6320Z(listM184265o, false);
    }

    /* JADX INFO: renamed from: P */
    public final void m6313P(@NotNull List<? extends JSONObject> appLaunchServerSideInApps, @Nullable Location userLocation) {
        appLaunchServerSideInApps.getClass();
        Map<String, ? extends Object> mapM207619f = wrq.m207619f(this.deviceInfo.m198792u());
        s3f s3fVar = this.evaluationManager;
        mapM207619f.getClass();
        List<JSONObject> listM184266p = s3fVar.m184266p(appLaunchServerSideInApps, mapM207619f, userLocation);
        if (listM184266p.isEmpty()) {
            return;
        }
        m6325u(listM184266p);
    }

    /* JADX INFO: renamed from: Q */
    public final void m6314Q(@NotNull List<? extends JSONObject> appLaunchServerSideInactionInApps, @Nullable Location userLocation) {
        appLaunchServerSideInactionInApps.getClass();
        Map<String, ? extends Object> mapM207619f = wrq.m207619f(this.deviceInfo.m198792u());
        s3f s3fVar = this.evaluationManager;
        mapM207619f.getClass();
        List<JSONObject> listM184266p = s3fVar.m184266p(appLaunchServerSideInactionInApps, mapM207619f, userLocation);
        if (listM184266p.isEmpty()) {
            return;
        }
        m6322b0(listM184266p);
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final void m6315R(@NotNull Map<String, ? extends Object> chargeDetails, @NotNull List<? extends Map<String, ? extends Object>> items, @Nullable Location userLocation) throws JSONException {
        chargeDetails.getClass();
        items.getClass();
        Map<String, ? extends Object> mapM207619f = wrq.m207619f(this.deviceInfo.m198792u());
        mapM207619f.putAll(chargeDetails);
        l3f l3fVarM184267q = this.evaluationManager.m184267q(mapM207619f, items, userLocation);
        if (!l3fVarM184267q.m152695b().isEmpty()) {
            m6325u(l3fVarM184267q.m152695b());
        }
        if (!l3fVarM184267q.m152694a().isEmpty()) {
            m6284a0(this, l3fVarM184267q.m152694a(), false, 2, null);
        }
        if (l3fVarM184267q.m152696c().isEmpty()) {
            return;
        }
        m6322b0(l3fVarM184267q.m152696c());
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final void m6316S(@NotNull String eventName, @NotNull Map<String, ? extends Object> eventProperties, @Nullable Location userLocation) throws JSONException {
        eventName.getClass();
        eventProperties.getClass();
        Map<String, ? extends Object> mapM207619f = wrq.m207619f(this.deviceInfo.m198792u());
        mapM207619f.putAll(eventProperties);
        l3f l3fVarM184268r = this.evaluationManager.m184268r(eventName, mapM207619f, userLocation);
        if (!l3fVarM184268r.m152695b().isEmpty()) {
            m6325u(l3fVarM184268r.m152695b());
        }
        if (!l3fVarM184268r.m152694a().isEmpty()) {
            m6284a0(this, l3fVarM184268r.m152694a(), false, 2, null);
        }
        if (l3fVarM184268r.m152696c().isEmpty()) {
            return;
        }
        m6322b0(l3fVarM184268r.m152696c());
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m6317T(@NotNull Map<String, ? extends Map<String, ? extends Object>> userAttributeChangedProperties, @Nullable Location location) throws JSONException {
        userAttributeChangedProperties.getClass();
        Map<String, ? extends Object> mapM207619f = wrq.m207619f(this.deviceInfo.m198792u());
        s3f s3fVar = this.evaluationManager;
        mapM207619f.getClass();
        l3f l3fVarM184269s = s3fVar.m184269s(userAttributeChangedProperties, location, mapM207619f);
        if (!l3fVarM184269s.m152695b().isEmpty()) {
            m6325u(l3fVarM184269s.m152695b());
        }
        if (!l3fVarM184269s.m152694a().isEmpty()) {
            m6284a0(this, l3fVarM184269s.m152694a(), false, 2, null);
        }
        if (l3fVarM184269s.m152696c().isEmpty()) {
            return;
        }
        m6322b0(l3fVarM184269s.m152696c());
    }

    @Override // p153l.arm
    @Nullable
    /* JADX INFO: renamed from: V */
    public Bundle mo5915V(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppNotificationButton button, @Nullable Context activityContext) {
        inAppNotification.getClass();
        button.getClass();
        CTInAppAction cTInAppAction = button.action;
        if (cTInAppAction == null) {
            return null;
        }
        return mo5906A0(inAppNotification, cTInAppAction, button.getText(), null, activityContext);
    }

    /* JADX INFO: renamed from: X */
    public final void m6318X(boolean showFallbackSettings) {
        this.inAppActionHandler.m6335e(showFallbackSettings);
    }

    /* JADX INFO: renamed from: Y */
    public final void m6319Y(@NotNull qqm display) {
        display.getClass();
        this.inAppDisplayListener = new WeakReference<>(display);
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final void m6320Z(@NotNull List<? extends JSONObject> delayedInApps, final boolean shouldUpdateTTL) {
        delayedInApps.getClass();
        this.logger.verbose(this.config.getAccountId(), "[InAppController]: Scheduling " + delayedInApps.size() + " delayed in-apps");
        this.inAppDelayManager.m6386e(delayedInApps, new Function1() { // from class: l.iqm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InAppController.m6286c(this.f116423a, shouldUpdateTTL, (DelayedInAppResult) obj);
            }
        });
    }

    @Override // p153l.ec60
    /* JADX INFO: renamed from: a */
    public void mo6321a(@NotNull final CTInAppNotification inAppNotification) {
        inAppNotification.getClass();
        this.logger.verbose(this.defaultLogTag, "PIP failed to show: " + inAppNotification.getCampaignId());
        this.executors.m187991e(Constants.TAG_FEATURE_IN_APPS).m7000g("InAppController#onPIPShowFailed", new Callable() { // from class: l.oqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6288d(this.f148602a, inAppNotification);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final void m6322b0(@NotNull List<? extends JSONObject> inActionMetadata) {
        inActionMetadata.getClass();
        this.logger.verbose(this.config.getAccountId(), "[InAppController]: Scheduling " + inActionMetadata.size() + " in-action in-apps");
        this.inAppInActionManager.m6386e(inActionMetadata, new Function1() { // from class: l.jqm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InAppController.m6285b(this.f122228a, (zpm) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6323d0() {
        if (this.config.isAnalyticsOnly()) {
            return;
        }
        this.executors.m187991e(Constants.TAG_FEATURE_IN_APPS).m7000g("InappController#showNotificationIfAvailable", new Callable() { // from class: l.hqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InAppController.m6297l(this.f111155a);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6324f0() {
        this.logger.verbose("Unregistering InAppDisplay Listener");
        this.inAppDisplayListener = null;
    }

    @Override // p153l.arm
    /* JADX INFO: renamed from: t0 */
    public void mo5918t0(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData) {
        inAppNotification.getClass();
        vqm vqmVarM204746i = this.controllerManager.m204746i();
        if (vqmVarM204746i != null) {
            vqmVarM204746i.m202403f(this.context, inAppNotification);
        }
        this.analyticsManager.m186380I(false, inAppNotification, formData);
        try {
            this.callbackManager.mo96519m();
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "Failed to call the in-app notification listener", th);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final void m6325u(@NotNull List<? extends JSONObject> inappNotifs) {
        inappNotifs.getClass();
        try {
            this.inAppQueue.mo112186a(m6276F(inappNotifs));
            m6323d0();
        } catch (Exception e) {
            this.logger.debug(this.defaultLogTag, "InAppController: : InApp notification handling error.", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m6326x() {
        try {
            wh3.m206334b(null, new InAppController$cancelAllScheduledInApps$1(this, null), 1, null);
        } catch (Exception e) {
            this.logger.verbose(this.defaultLogTag, "[InAppController]: Error cancelling scheduled in-apps", e);
        }
    }
}
