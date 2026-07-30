package com.p051p1.mobile.putong.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.google.gson.reflect.TypeToken;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15491b;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.C18334l2;
import p153l.azm;
import p153l.c4s;
import p153l.euk;
import p153l.fo0;
import p153l.i4g0;
import p153l.i5d0;
import p153l.k5d0;
import p153l.kl40;
import p153l.l51;
import p153l.p7f;
import p153l.pf60;
import p153l.r8g0;
import p153l.rg50;
import p153l.srb0;
import p153l.tu2;
import p153l.uqb0;
import p153l.uxj0;
import p153l.wyd0;
import p153l.x1d0;
import p153l.yp50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0087\u0001«\u0001\b\u0005\u0080\u0001\u0085\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ'\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b'\u0010$J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b)\u0010$J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b*\u0010$J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u00020\u0007H\u0007¢\u0006\u0004\b-\u0010\tJ\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u00020.H\u0007¢\u0006\u0004\b3\u00101J%\u00107\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0007¢\u0006\u0004\b9\u0010\u0003J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0013H\u0007¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u0013H\u0007¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u0019H\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0007¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0013H\u0007¢\u0006\u0004\bI\u0010\u0003J'\u0010M\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020AH\u0007¢\u0006\u0004\bM\u0010NJ\u0019\u0010Q\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\u00132\u0006\u0010T\u001a\u00020S2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b[\u0010VJ\u001f\u0010\\\u001a\u00020\u00132\u0006\u0010T\u001a\u00020S2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\b\\\u0010ZJ\u001f\u0010^\u001a\u00020\u00132\u0006\u0010X\u001a\u00020W2\u0006\u0010K\u001a\u00020]H\u0007¢\u0006\u0004\b^\u0010_J#\u0010b\u001a\u0004\u0018\u0001042\u0006\u0010`\u001a\u00020\u00072\b\b\u0002\u0010a\u001a\u00020AH\u0002¢\u0006\u0004\bb\u0010cJ#\u0010f\u001a\u00020\u00192\b\u0010d\u001a\u0004\u0018\u0001042\b\u0010e\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\bf\u0010gJ\u0019\u0010i\u001a\u00020A2\b\b\u0001\u0010h\u001a\u00020\u0019H\u0007¢\u0006\u0004\bi\u0010CJ\u000f\u0010j\u001a\u00020AH\u0007¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00132\u0006\u0010l\u001a\u00020AH\u0007¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020\u00132\u0006\u0010o\u001a\u00020AH\u0007¢\u0006\u0004\bp\u0010nJ\u000f\u0010q\u001a\u00020AH\u0007¢\u0006\u0004\bq\u0010kJ\u000f\u0010r\u001a\u00020\u0013H\u0007¢\u0006\u0004\br\u0010\u0003J\u000f\u0010s\u001a\u00020\u0013H\u0007¢\u0006\u0004\bs\u0010\u0003J\u0019\u0010t\u001a\u00020\u00132\b\b\u0001\u0010h\u001a\u00020\u0019H\u0007¢\u0006\u0004\bt\u0010uJ+\u0010w\u001a\u0004\u0018\u00010\u00072\b\u0010v\u001a\u0004\u0018\u0001042\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bw\u0010xJ\u001f\u0010z\u001a\u00020\u00132\u0006\u0010y\u001a\u0002042\u0006\u0010J\u001a\u00020\u0007H\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u0013H\u0002¢\u0006\u0004\b|\u0010\u0003J\u0017\u0010}\u001a\u00020\u00132\u0006\u0010K\u001a\u00020]H\u0007¢\u0006\u0004\b}\u0010~R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0083\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0083\u0001R\u001d\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u008b\u0001R\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0017\u0010l\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010MR\u0017\u0010\u0096\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0017\u0010\u0097\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010\u0098\u0001R\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0098\u0001R\u001a\u0010\u009b\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010\u0098\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u0017\u0010\u009d\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010MR\u001f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010\u0003\u001a\u0005\b\u008f\u0001\u0010\tR \u0010¢\u0001\u001a\u0004\u0018\u00010O8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¡\u0001\u0010\u0003\u001a\u0006\b\u0095\u0001\u0010 \u0001R\u001d\u0010¤\u0001\u001a\u00020\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b£\u0001\u0010\u0003\u001a\u0005\b\u0093\u0001\u0010\tR\u001d\u0010¦\u0001\u001a\u00020\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u0010\u0003\u001a\u0005\b\u0091\u0001\u0010\tR'\u0010ª\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010§\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b©\u0001\u0010\u0003\u001a\u0006\b\u008d\u0001\u0010¨\u0001¨\u0006¬\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/api/ABManager;", "", "<init>", "()V", "Ll/wyd0;", "b", "()Ll/wyd0;", "", "e", "()Ljava/lang/String;", "c0", "I", Constants.KEY_KEY, "i0", "(Ljava/lang/String;)Ljava/lang/String;", "b0", "j0", "Lcom/p1/mobile/putong/api/ABManager$d;", "abController", "", "R", "(Lcom/p1/mobile/putong/api/ABManager$d;)V", "h0", "ab_key", "property_key", "", "defaultVal", "A", "(Ljava/lang/String;Ljava/lang/String;I)I", "P", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "defaultString", "Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lrx/c;", "W", "()Lrx/c;", "Ll/uxj0;", "m", "o", "L", "q", "n", "p", "r", "E", "Landroid/os/Bundle;", "outState", "K", "(Landroid/os/Bundle;)V", "savedInstanceState", "J", "Lcom/p1/mobile/putong/api/ABManager$b;", "oldGroup", "newGroup", "G", "(Lcom/p1/mobile/putong/api/ABManager$b;Lcom/p1/mobile/putong/api/ABManager$b;)Lcom/p1/mobile/putong/api/ABManager$b;", "D", "Landroid/content/Context;", "context", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Landroid/content/Context;)V", BaseSei.f14624X, "a0", "state", "", ResourceDirection.f39656v, "(I)Z", "Ll/rg50$b;", "client", "f", "(Ll/rg50$b;)Ll/rg50$b;", "U", p7f.GPS_DIRECTION_TRUE, "type", "mode", "oneIdTimeOut", "Z", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lorg/json/JSONArray;", "jsonArray", BLiveStormDanmakuGiftResourceType.f45292l, "(Lorg/json/JSONArray;)Ljava/lang/String;", "Ll/x1d0;", SocialConstants.TYPE_REQUEST, "B", "(Ll/x1d0;)Ll/x1d0;", "Ll/i5d0;", "response", c4s.C_ZONE, "(Ll/x1d0;Ll/i5d0;)V", "M", "N", "Lcom/p1/mobile/putong/api/ABManager$Mode;", "g0", "(Ll/i5d0;Lcom/p1/mobile/putong/api/ABManager$Mode;)V", "testBody", "ignoreexpiredSince", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;Z)Lcom/p1/mobile/putong/api/ABManager$b;", "oldItem", "newItem", "H", "(Lcom/p1/mobile/putong/api/ABManager$b;Lcom/p1/mobile/putong/api/ABManager$b;)I", "deviceABStatus", BaseSei.f14625Y, "u", "()Z", "hasRequestUidAb", "X", "(Z)V", "hasUidOnNext", "Y", BaseSei.f14626Z, "d0", "f0", "e0", "(I)V", "abGroups", BloodType.f39576O, "(Lcom/p1/mobile/putong/api/ABManager$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "groups", p7f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/api/ABManager$b;Ljava/lang/String;)V", "w", "F", "(Lcom/p1/mobile/putong/api/ABManager$Mode;)V", "", "a", "Ljava/util/List;", "controllers", "Ll/wyd0;", "abgroups_mode_device", "c", "abgroups_mode_uid", Constants.INAPP_DATA_TAG, "newAbgroups_mode_device", "newAbgroups_mode_uid", "Lrx/subjects/a;", "Lrx/subjects/a;", "restartBs", "g", "modeDeviceBs", "h", "oneIdDeviceBs", RXScreenCaptureService.KEY_INDEX, "modeUserBs", "j", "modeUidBs", "k", "hasUidABOnNext", "INIT_STATE", "Lcom/p1/mobile/putong/api/ABManager$b;", "abGroupsUser", "abGroupsDevice", "abGroupsUid", "sDeviceABStatus", "hasInitABGroup", "getAbHeader$annotations", "abHeader", "()Lorg/json/JSONArray;", "getJSONAbNames$annotations", "jSONAbNames", "getDeviceABNames$annotations", "deviceABNames", "getAbNames$annotations", "abNames", "", "()Ljava/util/Set;", "getABGroupKeys$annotations", "aBGroupKeys", "Mode", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ABManager {

    @NotNull
    public static final ABManager INSTANCE = new ABManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<InterfaceC4829d> controllers = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 abgroups_mode_device = new wyd0("abgroups_mode_device", "");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 abgroups_mode_uid = new wyd0("abgroups_mode_uid", "");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 newAbgroups_mode_device = new wyd0("newabgroups_mode_device", "");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 newAbgroups_mode_uid = new wyd0("newabgroups_mode_uid", "");

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<Integer> restartBs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<uxj0> modeDeviceBs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<uxj0> oneIdDeviceBs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<uxj0> modeUserBs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<uxj0> modeUidBs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static volatile boolean hasRequestUidAb;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static volatile boolean hasUidABOnNext;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static volatile int INIT_STATE;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public static C4827b abGroupsUser;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public static C4827b abGroupsDevice;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public static C4827b abGroupsUid;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static volatile int sDeviceABStatus;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static volatile boolean hasInitABGroup;

    @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m88121d2 = {"Lcom/p1/mobile/putong/api/ABManager$Mode;", "", "mode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "user", Device.TYPE, Oauth2AccessToken.KEY_UID, "toString", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum Mode {
        user("user"),
        device(Device.TYPE),
        uid(Oauth2AccessToken.KEY_UID);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        private final String mode;

        Mode(String str) {
            this.mode = str;
        }

        @NotNull
        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.mode;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u000bR.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/p1/mobile/putong/api/ABManager$a;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKey", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", Constants.KEY_KEY, "b", "c", "f", "value", "", "Ljava/util/Map;", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "properties", "", "Z", "()Z", "e", "(Z)V", "restart", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C4826a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public Map<String, String> properties = new HashMap();

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean restart;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, String> m30375a() {
            return this.properties;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRestart() {
            return this.restart;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: d */
        public final void m30378d(@Nullable String str) {
            this.key = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m30379e(boolean z) {
            this.restart = z;
        }

        /* JADX INFO: renamed from: f */
        public final void m30380f(@Nullable String str) {
            this.value = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String str : this.properties.keySet()) {
                str.getClass();
                String str2 = str;
                sb.append("            ");
                sb.append(str2);
                sb.append(" : ");
                sb.append(this.properties.get(str2));
                sb.append(SignParameters.NEW_LINE);
            }
            return "        key => " + this.key + "\n        value => " + this.value + "\n        restart => " + this.restart + "\n        properties => \n" + ((Object) sb);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$b */
    @Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u0016\u0010\u000bR>\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u0018j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019`\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/api/ABManager$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "j", "(Ljava/lang/String;)V", "responseBody", "Lorg/json/JSONArray;", "b", "Lorg/json/JSONArray;", Constants.INAPP_DATA_TAG, "()Lorg/json/JSONArray;", RXScreenCaptureService.KEY_INDEX, "(Lorg/json/JSONArray;)V", "names", "c", "f", "abHeader", "Ljava/util/HashMap;", "Lcom/p1/mobile/putong/api/ABManager$a;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "h", "(Ljava/util/HashMap;)V", "groupMap", "", "D", "getExpiredSince", "()D", "g", "(D)V", "expiredSince", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C4827b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String responseBody;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public JSONArray names;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String abHeader;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public HashMap<String, C4826a> groupMap = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public double expiredSince = Double.MAX_VALUE;

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m30381a() {
            String strValueOf;
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray = this.names;
            if (jSONArray == null) {
                strValueOf = WeJson.EMPTY_ARR;
            } else {
                if ((jSONArray != null ? jSONArray.length() : 0) > 0) {
                    strValueOf = String.valueOf(this.names);
                } else {
                    strValueOf = WeJson.EMPTY_ARR;
                }
            }
            sb.append("{\"groupKeys\":");
            sb.append(strValueOf);
            sb.append("}");
            return sb.toString();
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAbHeader() {
            return this.abHeader;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final HashMap<String, C4826a> m30383c() {
            return this.groupMap;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final JSONArray getNames() {
            return this.names;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getResponseBody() {
            return this.responseBody;
        }

        /* JADX INFO: renamed from: f */
        public final void m30386f(@Nullable String str) {
            this.abHeader = str;
        }

        /* JADX INFO: renamed from: g */
        public final void m30387g(double d) {
            this.expiredSince = d;
        }

        /* JADX INFO: renamed from: h */
        public final void m30388h(@NotNull HashMap<String, C4826a> map) {
            map.getClass();
            this.groupMap = map;
        }

        /* JADX INFO: renamed from: i */
        public final void m30389i(@Nullable JSONArray jSONArray) {
            this.names = jSONArray;
        }

        /* JADX INFO: renamed from: j */
        public final void m30390j(@Nullable String str) {
            this.responseBody = str;
        }

        @NotNull
        public String toString() {
            String string;
            StringBuilder sb = new StringBuilder();
            for (String str : this.groupMap.keySet()) {
                str.getClass();
                String str2 = str;
                sb.append("    ");
                sb.append(str2);
                sb.append(" : \n");
                sb.append(String.valueOf(this.groupMap.get(str2)));
                sb.append(SignParameters.NEW_LINE);
            }
            JSONArray jSONArray = this.names;
            if (jSONArray == null || (string = jSONArray.toString()) == null) {
                string = "";
            }
            return C15491b.m94361i("\n   names => " + string + "\n   abHeader => " + this.abHeader + "\n   expiredSince => " + this.expiredSince + "\n   groups => \n   " + ((Object) sb) + "\n   ");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$c */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/api/ABManager$c;", "Ll/azm;", "<init>", "()V", "Ll/azm$a;", "chain", "Ll/i5d0;", "intercept", "(Ll/azm$a;)Ll/i5d0;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C4828c implements azm {
        @Override // p153l.azm
        @NotNull
        public i5d0 intercept(@NotNull azm.InterfaceC15867a chain) throws IOException {
            chain.getClass();
            ABManager aBManager = ABManager.INSTANCE;
            x1d0 x1d0VarRequest = chain.request();
            x1d0VarRequest.getClass();
            x1d0 x1d0VarM30364B = aBManager.m30364B(x1d0VarRequest);
            i5d0 i5d0VarMo101076a = chain.mo101076a(x1d0VarM30364B);
            i5d0VarMo101076a.getClass();
            aBManager.m30365C(x1d0VarM30364B, i5d0VarMo101076a);
            return i5d0VarMo101076a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$d */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/api/ABManager$d;", "", "", "a", "()V", "b", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC4829d {
        /* JADX INFO: renamed from: a */
        void mo30391a();

        /* JADX INFO: renamed from: b */
        void mo30392b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$e */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000f"}, m88121d2 = {"Lcom/p1/mobile/putong/api/ABManager$e;", "", "<init>", "()V", "Ll/x1d0;", "req", "", "b", "(Ll/x1d0;)V", "", "a", "Z", "sOneIdDeviceABValid", "()Z", "isOneIdDeviceABValid", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C4830e {

        @NotNull
        public static final C4830e INSTANCE = new C4830e();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public static volatile boolean sOneIdDeviceABValid = true;

        /* JADX INFO: renamed from: a */
        public final boolean m30393a() {
            return sOneIdDeviceABValid && !TextUtils.isEmpty(yp50.m217001d());
        }

        /* JADX INFO: renamed from: b */
        public final void m30394b(@NotNull x1d0 req) {
            req.getClass();
            if (TextUtils.isEmpty(req.m209026k().m182271A("oneid"))) {
                sOneIdDeviceABValid = false;
            } else {
                sOneIdDeviceABValid = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$f */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C4831f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17815a;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.user.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.device.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.uid.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17815a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$g */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m88121d2 = {"com/p1/mobile/putong/api/ABManager$g", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C4832g extends TypeToken<List<? extends Object>> {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$h */
    @Metadata(m88120d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m88121d2 = {"com/p1/mobile/putong/api/ABManager$h", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C4833h extends TypeToken<List<? extends Object>> {
    }

    static {
        C22507a<Integer> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        restartBs = c22507aM222758b;
        C22507a<uxj0> c22507aM222758b2 = C22507a.m222758b();
        c22507aM222758b2.getClass();
        modeDeviceBs = c22507aM222758b2;
        C22507a<uxj0> c22507aM222758b3 = C22507a.m222758b();
        c22507aM222758b3.getClass();
        oneIdDeviceBs = c22507aM222758b3;
        C22507a<uxj0> c22507aM222758b4 = C22507a.m222758b();
        c22507aM222758b4.getClass();
        modeUserBs = c22507aM222758b4;
        C22507a<uxj0> c22507aM222758b5 = C22507a.m222758b();
        c22507aM222758b5.getClass();
        modeUidBs = c22507aM222758b5;
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final int m30313A(@NotNull String ab_key, @NotNull String property_key, int defaultVal) {
        ab_key.getClass();
        property_key.getClass();
        try {
            String strM30370O = INSTANCE.m30370O(abGroupsUser, ab_key, property_key);
            if (strM30370O != null) {
                return Integer.parseInt(strM30370O);
            }
        } catch (NumberFormatException unused) {
        }
        return defaultVal;
    }

    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final synchronized void m30314D() {
        INIT_STATE = 1;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: E */
    public static final String m30315E() {
        C4827b c4827b = abGroupsUser;
        String strValueOf = c4827b == null ? "" : String.valueOf(c4827b);
        C4827b c4827b2 = abGroupsDevice;
        String strValueOf2 = c4827b2 == null ? "" : String.valueOf(c4827b2);
        C4827b c4827b3 = abGroupsUid;
        return strValueOf + strValueOf2 + (c4827b3 != null ? String.valueOf(c4827b3) : "");
    }

    @JvmStatic
    /* JADX INFO: renamed from: F */
    public static final void m30316F(@NotNull Mode mode) {
        String str;
        mode.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            int i = C4831f.f17815a[mode.ordinal()];
            if (i == 1) {
                str = m30317I().get();
            } else if (i == 2) {
                str = newAbgroups_mode_device.get();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = newAbgroups_mode_uid.get();
            }
            ABManager aBManager = INSTANCE;
            str.getClass();
            C4827b c4827bM30373s = aBManager.m30373s(str, true);
            i4g0.m138495D("e_clone_ab_info", "", new pf60("clone_ab_info", aBManager.m30372l(c4827bM30373s != null ? c4827bM30373s.getNames() : null)));
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: I */
    public static final wyd0 m30317I() {
        return new wyd0(App.f16088e, "newabgroups_user" + uqb0.f180397c0.userId(), "ab_nerver_save");
    }

    @JvmStatic
    /* JADX INFO: renamed from: J */
    public static final synchronized void m30318J(@NotNull Bundle savedInstanceState) {
        try {
            savedInstanceState.getClass();
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsUser")) && (abGroupsUser == null || INIT_STATE == 0)) {
                ABManager aBManager = INSTANCE;
                String str = m30333b().get();
                str.getClass();
                C4827b c4827bM30358t = m30358t(aBManager, str, false, 2, null);
                abGroupsUser = c4827bM30358t;
                String str2 = m30317I().get();
                str2.getClass();
                abGroupsUser = aBManager.m30366G(c4827bM30358t, aBManager.m30373s(str2, true));
                INIT_STATE = 1;
            }
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsDevice")) && abGroupsDevice == null) {
                ABManager aBManager2 = INSTANCE;
                C4827b c4827bM30358t2 = m30358t(aBManager2, m30339e(), false, 2, null);
                abGroupsDevice = c4827bM30358t2;
                String str3 = newAbgroups_mode_device.get();
                str3.getClass();
                abGroupsDevice = aBManager2.m30366G(c4827bM30358t2, aBManager2.m30373s(str3, true));
            }
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsUid")) && abGroupsUid == null) {
                ABManager aBManager3 = INSTANCE;
                C4827b c4827bM30358t3 = m30358t(aBManager3, m30336c0(), false, 2, null);
                abGroupsUid = c4827bM30358t3;
                String str4 = newAbgroups_mode_uid.get();
                str4.getClass();
                abGroupsUid = aBManager3.m30366G(c4827bM30358t3, aBManager3.m30373s(str4, true));
            }
            tu2.m192703a("[putong-common][ab]", "onRestoreAbGroupsInfo abGroupsUser = " + abGroupsUser + ", abGroupsDevice = " + abGroupsDevice + ", abGroupsUid = " + abGroupsUid);
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: K */
    public static final void m30319K(@NotNull Bundle outState) {
        outState.getClass();
        C4827b c4827b = abGroupsUser;
        if (c4827b != null) {
            c4827b.getClass();
            if (!TextUtils.isEmpty(c4827b.getResponseBody())) {
                outState.putString("abGroupsUser", "abGroupsUser.responseBody");
            }
        }
        C4827b c4827b2 = abGroupsDevice;
        if (c4827b2 != null) {
            c4827b2.getClass();
            if (!TextUtils.isEmpty(c4827b2.getResponseBody())) {
                outState.putString("abGroupsDevice", "abGroupsDevice.responseBody");
            }
        }
        C4827b c4827b3 = abGroupsUid;
        if (c4827b3 != null) {
            c4827b3.getClass();
            if (TextUtils.isEmpty(c4827b3.getResponseBody())) {
                return;
            }
            outState.putString("abGroupsUid", "abGroupsUid.responseBody");
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: L */
    public static final C22421c<uxj0> m30320L() {
        C22421c<uxj0> c22421cObserveOn = oneIdDeviceBs.onBackpressureLatest().observeOn(fo0.m126432a());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: P */
    public static final String m30321P(@NotNull String ab_key, @NotNull String property_key) {
        ab_key.getClass();
        property_key.getClass();
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: Q */
    public static final String m30322Q(@NotNull String ab_key, @NotNull String property_key, @Nullable String defaultString) {
        ab_key.getClass();
        property_key.getClass();
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: R */
    public static final void m30323R(@Nullable InterfaceC4829d abController) {
        if (abController != null) {
            if (hasInitABGroup) {
                abController.mo30391a();
            }
            controllers.add(abController);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: T */
    public static final synchronized void m30324T() {
        try {
            INIT_STATE = 0;
            modeUserBs.onNext(uxj0.f181467a);
            Iterator<InterfaceC4829d> it = controllers.iterator();
            while (it.hasNext()) {
                it.next().mo30392b();
            }
            tu2.m192703a("[putong-common][ab]", "resetAllAb");
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: U */
    public static final synchronized void m30325U() {
        m30333b().clear();
        abgroups_mode_uid.clear();
        abGroupsUser = null;
        abGroupsUid = null;
        tu2.m192703a("[putong-common][ab]", "resetUserAb");
    }

    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final void m30326V(@NotNull Context context) {
        context.getClass();
        restartBs.onNext(0);
        m30360v(3);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.getClass();
        launchIntentForPackage.addFlags(268468224);
        context.startActivity(launchIntentForPackage);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: W */
    public static final C22421c<Integer> m30327W() {
        return restartBs;
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final void m30328X(boolean hasRequestUidAb2) {
        hasRequestUidAb = hasRequestUidAb2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y */
    public static final void m30329Y(boolean hasUidOnNext) {
        hasUidABOnNext = hasUidOnNext;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final void m30330Z(@NotNull String type, @NotNull String mode, boolean oneIdTimeOut) {
        type.getClass();
        mode.getClass();
        i4g0.m138493B("e_ab_report", "", new pf60("ab_type", type), new pf60("ab_mode", mode), new pf60("oneid_timeout", Boolean.valueOf(oneIdTimeOut)));
    }

    /* JADX INFO: renamed from: a */
    public static void m30331a(int i) {
        restartBs.onNext(Integer.valueOf(i));
    }

    @JvmStatic
    /* JADX INFO: renamed from: a0 */
    public static final void m30332a0() {
        try {
            ABManager aBManager = INSTANCE;
            String str = m30333b().get();
            str.getClass();
            C4827b c4827bM30358t = m30358t(aBManager, str, false, 2, null);
            abGroupsUser = c4827bM30358t;
            String str2 = m30317I().get();
            str2.getClass();
            C4827b c4827bM30366G = aBManager.m30366G(c4827bM30358t, aBManager.m30373s(str2, true));
            abGroupsUser = c4827bM30366G;
            if (c4827bM30366G != null) {
                Iterator<InterfaceC4829d> it = controllers.iterator();
                while (it.hasNext()) {
                    it.next().mo30391a();
                }
            }
            tu2.m192703a("[putong-common][ab]", "tryInitUserAbInApplication abGroupsUser = " + abGroupsUser);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final wyd0 m30333b() {
        return new wyd0(App.f16088e, "abgroups" + uqb0.f180397c0.userId(), "ab_nerver_save");
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public static final String m30334b0(@NotNull String key) {
        HashMap<String, C4826a> mapM30383c;
        C4826a c4826a;
        String value;
        key.getClass();
        C4827b c4827b = abGroupsUid;
        return (c4827b == null || (mapM30383c = c4827b.m30383c()) == null || (c4826a = mapM30383c.get(key)) == null || (value = c4826a.getValue()) == null) ? "" : value;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public static final String m30336c0() {
        String str = abgroups_mode_uid.get();
        str.getClass();
        return str;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d0 */
    public static final void m30338d0() {
        ABManager aBManager = INSTANCE;
        String str = abgroups_mode_device.get();
        str.getClass();
        C4827b c4827bM30358t = m30358t(aBManager, str, false, 2, null);
        abGroupsDevice = c4827bM30358t;
        String str2 = newAbgroups_mode_device.get();
        str2.getClass();
        C4827b c4827bM30366G = aBManager.m30366G(c4827bM30358t, aBManager.m30373s(str2, true));
        abGroupsDevice = c4827bM30366G;
        tu2.m192703a("[putong-common][ab]", "tryInitDeviceGroupUseOld abGroupsDevice = " + c4827bM30366G);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m30339e() {
        String str = abgroups_mode_device.get();
        str.getClass();
        return str;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e0 */
    public static final synchronized void m30340e0(int deviceABStatus) {
        sDeviceABStatus = deviceABStatus;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final rg50.C19837b m30341f(@NotNull rg50.C19837b client) {
        client.getClass();
        INSTANCE.m30374w();
        rg50.C19837b c19837bM181363a = client.m181363a(new C4828c());
        c19837bM181363a.getClass();
        return c19837bM181363a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f0 */
    public static final void m30342f0() {
        ABManager aBManager = INSTANCE;
        String str = abgroups_mode_uid.get();
        str.getClass();
        C4827b c4827bM30358t = m30358t(aBManager, str, false, 2, null);
        abGroupsUid = c4827bM30358t;
        String str2 = newAbgroups_mode_uid.get();
        str2.getClass();
        C4827b c4827bM30366G = aBManager.m30366G(c4827bM30358t, aBManager.m30373s(str2, true));
        abGroupsUid = c4827bM30366G;
        tu2.m192703a("[putong-common][ab]", "tryInitUidGroupUseOld abGroupsUid = " + c4827bM30366G);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Set<String> m30343g() {
        C4827b c4827b;
        HashMap<String, C4826a> mapM30383c;
        C4827b c4827b2 = abGroupsUser;
        if ((c4827b2 != null ? c4827b2.m30383c() : null) == null || (c4827b = abGroupsUser) == null || (mapM30383c = c4827b.m30383c()) == null) {
            return null;
        }
        return mapM30383c.keySet();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g0 */
    public static final void m30344g0(@NotNull i5d0 response, @NotNull Mode mode) {
        response.getClass();
        mode.getClass();
        if (response.m138661I()) {
            String strM152524K = "";
            try {
                k5d0 k5d0VarM138670k = response.m138670k();
                strM152524K = C18334l2.m152524K(k5d0VarM138670k != null ? k5d0VarM138670k.string() : null);
                Objects.toString(mode);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
            if (mode == Mode.user) {
                m30317I().put(strM152524K);
            } else if (mode == Mode.device) {
                newAbgroups_mode_device.put(strM152524K);
            } else if (mode == Mode.uid) {
                newAbgroups_mode_uid.put(strM152524K);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m30345h() {
        if (uqb0.f180397c0.getAuthData().mo107143b() == null) {
            C4827b c4827b = abGroupsDevice;
            if (c4827b == null || c4827b == null) {
                return null;
            }
            return c4827b.getAbHeader();
        }
        if (abGroupsUser == null) {
            return "";
        }
        if (uqb0.f180397c0.signedIn_()) {
            C4827b c4827b2 = abGroupsUser;
            if (c4827b2 != null) {
                return c4827b2.getAbHeader();
            }
            return null;
        }
        C4827b c4827b3 = abGroupsUid;
        if (c4827b3 != null) {
            return c4827b3.getAbHeader();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h0 */
    public static final String m30346h0(@Nullable String key) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m30347i() {
        JSONArray jSONArrayM30351k = m30351k();
        return jSONArrayM30351k == null ? "" : INSTANCE.m30372l(jSONArrayM30351k);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i0 */
    public static final String m30348i0(@Nullable String key) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m30349j() {
        JSONArray names;
        C4827b c4827b = abGroupsDevice;
        if (c4827b != null) {
            c4827b.getClass();
            names = c4827b.getNames();
        } else {
            names = null;
        }
        return names == null ? "" : INSTANCE.m30372l(names);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j0 */
    public static final String m30350j0(@NotNull String key) {
        HashMap<String, C4826a> mapM30383c;
        C4826a c4826a;
        String value;
        key.getClass();
        C4827b c4827b = abGroupsUser;
        return (c4827b == null || (mapM30383c = c4827b.m30383c()) == null || (c4826a = mapM30383c.get(key)) == null || (value = c4826a.getValue()) == null) ? "" : value;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final JSONArray m30351k() {
        if (uqb0.f180397c0.getAuthData().mo107143b() == null) {
            C4827b c4827b = abGroupsDevice;
            if (c4827b == null) {
                return null;
            }
            c4827b.getClass();
            return c4827b.getNames();
        }
        if (uqb0.f180397c0.signedIn_()) {
            C4827b c4827b2 = abGroupsUser;
            if (c4827b2 == null) {
                return null;
            }
            c4827b2.getClass();
            return c4827b2.getNames();
        }
        C4827b c4827b3 = abGroupsUid;
        if (c4827b3 == null) {
            return null;
        }
        c4827b3.getClass();
        return c4827b3.getNames();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final C22421c<uxj0> m30352m() {
        C22421c<uxj0> c22421cObserveOn = modeDeviceBs.onBackpressureLatest().observeOn(fo0.m126432a());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final C22421c<uxj0> m30353n() {
        C22421c<uxj0> c22421cObserveOn = modeDeviceBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final C22421c<uxj0> m30354o() {
        C22421c<uxj0> c22421cObserveOn = modeUidBs.onBackpressureLatest().observeOn(fo0.m126432a());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final C22421c<uxj0> m30355p() {
        C22421c<uxj0> c22421cObserveOn = modeUidBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final C22421c<uxj0> m30356q() {
        C22421c<uxj0> c22421cObserveOn = modeUserBs.onBackpressureLatest().observeOn(fo0.m126432a());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final C22421c<uxj0> m30357r() {
        C22421c<uxj0> c22421cObserveOn = modeUserBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        c22421cObserveOn.getClass();
        return c22421cObserveOn;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C4827b m30358t(ABManager aBManager, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aBManager.m30373s(str, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final boolean m30359u() {
        return hasRequestUidAb;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final synchronized boolean m30360v(int state) {
        try {
            tu2.m192703a("[putong-common][ab]", "initAbGroup , state = " + state);
            try {
                if (INIT_STATE + state == 3) {
                    return false;
                }
                INIT_STATE = state;
                ABManager aBManager = INSTANCE;
                String str = m30333b().get();
                str.getClass();
                C4827b c4827bM30358t = m30358t(aBManager, str, false, 2, null);
                abGroupsUser = c4827bM30358t;
                String str2 = m30317I().get();
                str2.getClass();
                abGroupsUser = aBManager.m30366G(c4827bM30358t, aBManager.m30373s(str2, true));
                RemoteConfig.m80471c0();
                modeUserBs.onNext(uxj0.f181467a);
                C4827b c4827b = abGroupsUser;
                if (c4827b != null) {
                    c4827b.getClass();
                    c4827b.getAbHeader();
                    Iterator<InterfaceC4829d> it = controllers.iterator();
                    while (it.hasNext()) {
                        it.next().mo30391a();
                    }
                    hasInitABGroup = true;
                    ABManager aBManager2 = INSTANCE;
                    C4827b c4827b2 = abGroupsUser;
                    c4827b2.getClass();
                    aBManager2.m30371S(c4827b2, "user");
                    C18334l2 c18334l2 = uqb0.f180385Q;
                    C4827b c4827b3 = abGroupsUser;
                    c4827b3.getClass();
                    c18334l2.m152543W(c4827b3.m30381a());
                }
                tu2.m192703a("[putong-common][ab]", "initAbGroup abGroupsUser = " + abGroupsUser + ", state = " + state);
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("ABManager initAbGroup:" + e.getMessage(), e));
                tu2.m192703a("[putong-common][ab]", "initAbGroup error : e = " + e.getMessage());
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final void m30361x() {
        IntlCountryCodeController.m29108e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final synchronized boolean m30362y(int deviceABStatus) {
        boolean z;
        try {
            z = false;
            if (sDeviceABStatus != 2) {
                ABManager aBManager = INSTANCE;
                String str = abgroups_mode_device.get();
                str.getClass();
                C4827b c4827bM30358t = m30358t(aBManager, str, false, 2, null);
                abGroupsDevice = c4827bM30358t;
                String str2 = newAbgroups_mode_device.get();
                str2.getClass();
                abGroupsDevice = aBManager.m30366G(c4827bM30358t, aBManager.m30373s(str2, true));
                if (sDeviceABStatus == 0 || deviceABStatus != 2) {
                    C22507a<uxj0> c22507a = modeDeviceBs;
                    uxj0 uxj0Var = uxj0.f181467a;
                    c22507a.onNext(uxj0Var);
                    if (C4830e.INSTANCE.m30393a()) {
                        oneIdDeviceBs.onNext(uxj0Var);
                    }
                    C4827b c4827b = abGroupsDevice;
                    if (c4827b != null) {
                        c4827b.getClass();
                        aBManager.m30371S(c4827b, Device.TYPE);
                        C18334l2 c18334l2 = uqb0.f180385Q;
                        C4827b c4827b2 = abGroupsDevice;
                        c4827b2.getClass();
                        c18334l2.m152543W(c4827b2.m30381a());
                    }
                    tu2.m192703a("[putong-common][ab]", "initPreSignInDeviceGroup abGroupsDevice = " + abGroupsDevice);
                    z = true;
                }
                sDeviceABStatus = deviceABStatus;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: z */
    public static final boolean m30363z() {
        m30342f0();
        if (hasUidABOnNext) {
            return false;
        }
        modeUidBs.onNext(uxj0.f181467a);
        m30329Y(true);
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final x1d0 m30364B(x1d0 request) {
        if (ABHeaderControl.NO_AB_HEADER == request.m209025j(ABHeaderControl.class)) {
            return request;
        }
        try {
            return m30368M(request);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("ABManager interceptRequest:" + e.getMessage(), e));
            return request;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m30365C(x1d0 request, i5d0 response) {
        try {
            m30369N(request, response);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("ABManager interceptRespose:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: G */
    public final C4827b m30366G(C4827b oldGroup, C4827b newGroup) {
        if (newGroup != null) {
            if (oldGroup == null) {
                return newGroup;
            }
            String abHeader = newGroup.getAbHeader();
            if (abHeader != null) {
                if (abHeader.length() <= 0) {
                    abHeader = null;
                }
                if (abHeader != null) {
                    oldGroup.m30383c().putAll(newGroup.m30383c());
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM122577c = euk.m122577c(oldGroup.getAbHeader(), new C4833h().getType());
                        objM122577c.getClass();
                        Object objM122577c2 = euk.m122577c(newGroup.getAbHeader(), new C4832g().getType());
                        objM122577c2.getClass();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll((List) objM122577c);
                        arrayList.addAll((List) objM122577c2);
                        oldGroup.m30386f(euk.m122578d(arrayList));
                        Result.m225066constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m225066constructorimpl(ResultKt.m88127a(th));
                    }
                    if (oldGroup.getNames() != null) {
                        JSONArray names = newGroup.getNames();
                        if (names != null) {
                            int length = names.length();
                            for (int i = 0; i < length; i++) {
                                JSONArray names2 = oldGroup.getNames();
                                if (names2 != null) {
                                    names2.put(names.get(i));
                                }
                            }
                        }
                    } else {
                        oldGroup.m30389i(newGroup.getNames());
                    }
                }
            }
        }
        return oldGroup;
    }

    /* JADX INFO: renamed from: H */
    public final int m30367H(C4827b oldItem, C4827b newItem) {
        if (oldItem != null) {
            for (String str : oldItem.m30383c().keySet()) {
                str.getClass();
                String str2 = str;
                C4826a c4826a = oldItem.m30383c().get(str2);
                c4826a.getClass();
                if (c4826a.getRestart() && (newItem == null || !newItem.m30383c().containsKey(str2))) {
                    return 2;
                }
            }
        }
        if (newItem == null) {
            return 0;
        }
        for (String str3 : newItem.m30383c().keySet()) {
            str3.getClass();
            String str4 = str3;
            C4826a c4826a2 = newItem.m30383c().get(str4);
            c4826a2.getClass();
            if (c4826a2.getRestart() && (oldItem == null || !oldItem.m30383c().containsKey(str4))) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public final x1d0 m30368M(x1d0 request) {
        String abHeader;
        String abHeader2;
        String abHeader3;
        String abHeader4;
        String str = "";
        if (uqb0.f180397c0.getAuthData().mo107143b() == null) {
            C4827b c4827b = abGroupsDevice;
            if (!TextUtils.isEmpty(c4827b != null ? c4827b.getAbHeader() : null)) {
                x1d0.C21228a c21228aM209023h = request.m209023h();
                C4827b c4827b2 = abGroupsDevice;
                if (c4827b2 != null && (abHeader4 = c4827b2.getAbHeader()) != null) {
                    str = abHeader4;
                }
                x1d0 x1d0VarM209028b = c21228aM209023h.m209034h("X-Testing-Group", str).m209028b();
                x1d0VarM209028b.getClass();
                return x1d0VarM209028b;
            }
        } else {
            C4827b c4827b3 = abGroupsUser;
            if (!TextUtils.isEmpty(c4827b3 != null ? c4827b3.getAbHeader() : null)) {
                x1d0.C21228a c21228aM209023h2 = request.m209023h();
                C4827b c4827b4 = abGroupsUser;
                if (c4827b4 != null && (abHeader3 = c4827b4.getAbHeader()) != null) {
                    str = abHeader3;
                }
                x1d0 x1d0VarM209028b2 = c21228aM209023h2.m209034h("X-Testing-Group", str).m209028b();
                x1d0VarM209028b2.getClass();
                return x1d0VarM209028b2;
            }
            if (!TantanApp.f17900d.mo107143b().booleanValue()) {
                C4827b c4827b5 = abGroupsUid;
                if (!TextUtils.isEmpty(c4827b5 != null ? c4827b5.getAbHeader() : null)) {
                    x1d0.C21228a c21228aM209023h3 = request.m209023h();
                    C4827b c4827b6 = abGroupsUid;
                    if (c4827b6 != null && (abHeader2 = c4827b6.getAbHeader()) != null) {
                        str = abHeader2;
                    }
                    x1d0 x1d0VarM209028b3 = c21228aM209023h3.m209034h("X-Testing-Group", str).m209028b();
                    x1d0VarM209028b3.getClass();
                    return x1d0VarM209028b3;
                }
                C4827b c4827b7 = abGroupsDevice;
                if (!TextUtils.isEmpty(c4827b7 != null ? c4827b7.getAbHeader() : null)) {
                    x1d0.C21228a c21228aM209023h4 = request.m209023h();
                    C4827b c4827b8 = abGroupsDevice;
                    if (c4827b8 != null && (abHeader = c4827b8.getAbHeader()) != null) {
                        str = abHeader;
                    }
                    x1d0 x1d0VarM209028b4 = c21228aM209023h4.m209034h("X-Testing-Group", str).m209028b();
                    x1d0VarM209028b4.getClass();
                    return x1d0VarM209028b4;
                }
            }
        }
        return request;
    }

    /* JADX INFO: renamed from: N */
    public final void m30369N(x1d0 request, i5d0 response) {
        final int iM30367H;
        if (request.m209024i() != null && response.m138661I() && StringsKt.m94303P(String.valueOf(request.m209024i()), "X-Testing-Group-V2-Tag", false, 2, null)) {
            String strM152524K = "";
            try {
                k5d0 k5d0VarM138670k = response.m138670k();
                k5d0VarM138670k.getClass();
                strM152524K = C18334l2.m152524K(k5d0VarM138670k.string());
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
            uqb0.f180376H.updateServerTime(response.m138675u("Date"));
            if (Intrinsics.m88377d(request.m209024i(), "X-Testing-Group-V2-Tag" + Mode.user)) {
                m30330Z("response", "user", false);
                m30333b().put(strM152524K);
                tu2.m192703a("[putong-common][ab]", "initAbUser : " + strM152524K);
                strM152524K.getClass();
                C4827b c4827bM30358t = m30358t(this, strM152524K, false, 2, null);
                c4827bM30358t.getClass();
                c4827bM30358t.getAbHeader();
                if (INIT_STATE == 0 || (iM30367H = m30367H(abGroupsUser, c4827bM30358t)) == 0) {
                    return;
                }
                l51.m152893M(new Runnable() { // from class: l.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ABManager.m30331a(iM30367H);
                    }
                });
                return;
            }
            if (Intrinsics.m88377d(request.m209024i(), "X-Testing-Group-V2-Tag" + Mode.device)) {
                C4830e c4830e = C4830e.INSTANCE;
                c4830e.m30394b(request);
                if (c4830e.m30393a()) {
                    m30330Z("response", "oneid", false);
                } else {
                    m30330Z("response", "deviceid", false);
                }
                abgroups_mode_device.put(strM152524K);
                tu2.m192703a("[putong-common][ab]", "initAbDevice : " + strM152524K);
                return;
            }
            if (Intrinsics.m88377d(request.m209024i(), "X-Testing-Group-V2-Tag" + Mode.uid)) {
                m30330Z("response", Oauth2AccessToken.KEY_UID, false);
                abgroups_mode_uid.put(strM152524K);
                tu2.m192703a("[putong-common][ab]", "initAbUid : " + strM152524K);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m30370O(C4827b abGroups, String ab_key, String property_key) {
        HashMap<String, C4826a> mapM30383c;
        HashMap<String, C4826a> mapM30383c2;
        C4826a c4826a;
        Map<String, String> mapM30375a;
        if (abGroups == null || (mapM30383c = abGroups.m30383c()) == null || !mapM30383c.containsKey(ab_key) || abGroups == null || (mapM30383c2 = abGroups.m30383c()) == null || (c4826a = mapM30383c2.get(ab_key)) == null || (mapM30375a = c4826a.m30375a()) == null) {
            return null;
        }
        return mapM30375a.get(property_key);
    }

    /* JADX INFO: renamed from: S */
    public final void m30371S(C4827b groups, String type) {
        if (groups.m30383c() == null || groups.m30383c().size() <= 0 || !TextUtils.isEmpty(groups.getAbHeader())) {
            return;
        }
        CrashHelper.m82479c(new Throwable("HeaderNull " + type + "  group = " + groups.m30383c() + " header = " + groups.getAbHeader()));
    }

    /* JADX INFO: renamed from: l */
    public final String m30372l(JSONArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    arrayList.add(jsonArray.optString(i));
                } catch (JSONException e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
        String strJoin = TextUtils.join(Constants.SEPARATOR_COMMA, arrayList);
        strJoin.getClass();
        return strJoin;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0052 A[PHI: r8
      0x0052: PHI (r8v1 double) = (r8v0 double), (r8v5 double) binds: [B:6:0x0020, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0187 A[Catch: JSONException -> 0x00f2, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00f2, blocks: (B:47:0x00c2, B:49:0x00c8, B:50:0x00cf, B:52:0x00d5, B:54:0x00e8, B:57:0x00f8, B:61:0x011b, B:63:0x0125, B:65:0x0134, B:66:0x013c, B:68:0x0142, B:71:0x014f, B:73:0x0160, B:75:0x016e, B:81:0x0187, B:72:0x015c, B:79:0x017f), top: B:97:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f5  */
    /* JADX INFO: renamed from: s */
    public final C4827b m30373s(String testBody, boolean ignoreexpiredSince) {
        C4827b c4827b;
        String strOptString;
        String str;
        JSONObject jSONObject;
        double d;
        boolean z;
        List listEmptyList;
        String str2 = "restart";
        JSONArray jSONArrayOptJSONArray = null;
        if (Intrinsics.m88377d("ab_nerver_save", testBody)) {
            return null;
        }
        HashMap<String, C4826a> map = new HashMap<>();
        boolean zM180203b = r8g0.m180203b(testBody);
        String strOptString2 = WeJson.EMPTY_ARR;
        double dApiTimeStringToDate = Double.MAX_VALUE;
        if (zM180203b) {
            c4827b = null;
            strOptString2 = WeJson.EMPTY_ARR;
            jSONArrayOptJSONArray = null;
        } else {
            tu2.m192703a("[putong-common][ab]", "real_ab_test_data:" + testBody);
            try {
                JSONObject jSONObject2 = new JSONObject(testBody);
                dApiTimeStringToDate = Converter.apiTimeStringToDate(jSONObject2.optString("expiredSince"));
                if (ignoreexpiredSince || dApiTimeStringToDate > uqb0.f180376H.guessedCurrentServerTime()) {
                    try {
                        strOptString2 = jSONObject2.optString("abHeader");
                        strOptString2.getClass();
                        try {
                            jSONArrayOptJSONArray = jSONObject2.optJSONArray("names");
                            boolean z2 = true;
                            boolean z3 = jSONArrayOptJSONArray == null;
                            if (z3) {
                                try {
                                    jSONArrayOptJSONArray = new JSONArray();
                                } catch (JSONException e) {
                                    e = e;
                                    c4827b = null;
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    strOptString2 = strOptString2;
                                    CrashHelper.m82479c(new Exception(C15491b.m94361i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                    strOptString2 = strOptString2;
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    if (Intrinsics.m88377d(testBody, "ab_nerver_save")) {
                                        return c4827b;
                                    }
                                    C4827b c4827b2 = new C4827b();
                                    c4827b2.m30390j(testBody);
                                    c4827b2.m30389i(jSONArrayOptJSONArray);
                                    c4827b2.m30388h(map);
                                    c4827b2.m30386f(strOptString2);
                                    c4827b2.m30387g(dApiTimeStringToDate);
                                    return c4827b2;
                                }
                            }
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("groups");
                                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("properties");
                                Iterator<String> itKeys = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.keys() : null;
                                while (itKeys != null && itKeys.hasNext() == z2) {
                                    C4826a c4826a = new C4826a();
                                    String next = itKeys.next();
                                    next.getClass();
                                    String str3 = next;
                                    if (jSONObjectOptJSONObject != null) {
                                        try {
                                            strOptString = jSONObjectOptJSONObject.optString(str3);
                                        } catch (JSONException e2) {
                                            e = e2;
                                            c4827b = null;
                                            CrashHelper.m82479c(new Exception(C15491b.m94361i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                            strOptString2 = strOptString2;
                                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            if (Intrinsics.m88377d(testBody, "ab_nerver_save")) {
                                                return c4827b;
                                            }
                                            C4827b c4827b3 = new C4827b();
                                            c4827b3.m30390j(testBody);
                                            c4827b3.m30389i(jSONArrayOptJSONArray);
                                            c4827b3.m30388h(map);
                                            c4827b3.m30386f(strOptString2);
                                            c4827b3.m30387g(dApiTimeStringToDate);
                                            return c4827b3;
                                        }
                                    } else {
                                        strOptString = null;
                                    }
                                    c4826a.m30378d(str3);
                                    if (jSONObjectOptJSONObject2 != null) {
                                        d = dApiTimeStringToDate;
                                        try {
                                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(strOptString);
                                            if (jSONObjectOptJSONObject3 != null) {
                                                Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
                                                itKeys2.getClass();
                                                while (itKeys2.hasNext()) {
                                                    String next2 = itKeys2.next();
                                                    next2.getClass();
                                                    jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2;
                                                    String str4 = next2;
                                                    if (Intrinsics.m88377d(str4, str2)) {
                                                        c4826a.m30379e(jSONObjectOptJSONObject3.getBoolean(str2));
                                                    } else {
                                                        c4826a.m30375a().put(str4, jSONObjectOptJSONObject3.optString(str4));
                                                        str2 = str2;
                                                        itKeys2 = itKeys2;
                                                    }
                                                }
                                            }
                                            str = str2;
                                            jSONObject = jSONObjectOptJSONObject2;
                                        } catch (JSONException e3) {
                                            e = e3;
                                            dApiTimeStringToDate = d;
                                            c4827b = null;
                                            CrashHelper.m82479c(new Exception(C15491b.m94361i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                            strOptString2 = strOptString2;
                                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            if (Intrinsics.m88377d(testBody, "ab_nerver_save")) {
                                                return c4827b;
                                            }
                                            C4827b c4827b4 = new C4827b();
                                            c4827b4.m30390j(testBody);
                                            c4827b4.m30389i(jSONArrayOptJSONArray);
                                            c4827b4.m30388h(map);
                                            c4827b4.m30386f(strOptString2);
                                            c4827b4.m30387g(dApiTimeStringToDate);
                                            return c4827b4;
                                        }
                                    } else {
                                        str = str2;
                                        jSONObject = jSONObjectOptJSONObject2;
                                        d = dApiTimeStringToDate;
                                    }
                                    if (strOptString != null) {
                                        if (StringsKt.m94303P(strOptString, ":", false, 2, null)) {
                                            List<String> listSplit = new Regex(":").split(strOptString, 0);
                                            if (!listSplit.isEmpty()) {
                                                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                                                while (true) {
                                                    if (!listIterator.hasPrevious()) {
                                                        listEmptyList = CollectionsKt.emptyList();
                                                        break;
                                                    }
                                                    if (listIterator.previous().length() != 0) {
                                                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                listEmptyList = CollectionsKt.emptyList();
                                                break;
                                            }
                                            String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
                                            if (strArr.length == 2) {
                                                z = true;
                                                c4826a.m30380f(strArr[1]);
                                                map.put(str3, c4826a);
                                            } else {
                                                z = true;
                                            }
                                        } else {
                                            z = true;
                                        }
                                        if (z3) {
                                            jSONArrayOptJSONArray.getClass();
                                            jSONArrayOptJSONArray.put(strOptString);
                                        }
                                        z2 = z;
                                        dApiTimeStringToDate = d;
                                        str2 = str;
                                        jSONObjectOptJSONObject2 = jSONObject;
                                    } else {
                                        z = true;
                                    }
                                    c4826a.m30380f(strOptString);
                                    map.put(str3, c4826a);
                                    if (z3) {
                                        jSONArrayOptJSONArray.getClass();
                                        jSONArrayOptJSONArray.put(strOptString);
                                    }
                                    z2 = z;
                                    dApiTimeStringToDate = d;
                                    str2 = str;
                                    jSONObjectOptJSONObject2 = jSONObject;
                                }
                                dApiTimeStringToDate = dApiTimeStringToDate;
                                c4827b = null;
                            } catch (JSONException e4) {
                                e = e4;
                            }
                        } catch (JSONException e5) {
                            e = e5;
                            strOptString2 = strOptString2;
                            c4827b = null;
                            jSONArrayOptJSONArray = null;
                            CrashHelper.m82479c(new Exception(C15491b.m94361i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                            strOptString2 = strOptString2;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            if (Intrinsics.m88377d(testBody, "ab_nerver_save")) {
                                return c4827b;
                            }
                            C4827b c4827b5 = new C4827b();
                            c4827b5.m30390j(testBody);
                            c4827b5.m30389i(jSONArrayOptJSONArray);
                            c4827b5.m30388h(map);
                            c4827b5.m30386f(strOptString2);
                            c4827b5.m30387g(dApiTimeStringToDate);
                            return c4827b5;
                        }
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } else {
                    c4827b = null;
                    strOptString2 = WeJson.EMPTY_ARR;
                    jSONArrayOptJSONArray = null;
                }
            } catch (JSONException e7) {
                e = e7;
                c4827b = null;
            }
        }
        if (Intrinsics.m88377d(testBody, "ab_nerver_save")) {
            return c4827b;
        }
        C4827b c4827b6 = new C4827b();
        c4827b6.m30390j(testBody);
        c4827b6.m30389i(jSONArrayOptJSONArray);
        c4827b6.m30388h(map);
        c4827b6.m30386f(strOptString2);
        c4827b6.m30387g(dApiTimeStringToDate);
        return c4827b6;
    }

    /* JADX INFO: renamed from: w */
    public final void m30374w() {
        m30323R(new kl40());
        m30323R(new srb0());
    }
}
