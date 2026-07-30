package com.p046p1.mobile.putong.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.google.gson.reflect.TypeToken;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15384b;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.C18133l2;
import p149l.axm;
import p149l.b2s;
import p149l.du2;
import p149l.e51;
import p149l.exc0;
import p149l.gxc0;
import p149l.j6f;
import p149l.j760;
import p149l.jo0;
import p149l.k0g0;
import p149l.k850;
import p149l.ojb0;
import p149l.ork;
import p149l.qib0;
import p149l.roj0;
import p149l.sh50;
import p149l.stc0;
import p149l.uqd0;
import p149l.wc40;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0087\u0001«\u0001\b\u0005\u0080\u0001\u0085\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ'\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b'\u0010$J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b)\u0010$J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b*\u0010$J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u00020\u0007H\u0007¢\u0006\u0004\b-\u0010\tJ\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u00020.H\u0007¢\u0006\u0004\b3\u00101J%\u00107\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0007¢\u0006\u0004\b9\u0010\u0003J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0013H\u0007¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u0013H\u0007¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u0019H\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0007¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0013H\u0007¢\u0006\u0004\bI\u0010\u0003J'\u0010M\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020AH\u0007¢\u0006\u0004\bM\u0010NJ\u0019\u0010Q\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\u00132\u0006\u0010T\u001a\u00020S2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b[\u0010VJ\u001f\u0010\\\u001a\u00020\u00132\u0006\u0010T\u001a\u00020S2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\b\\\u0010ZJ\u001f\u0010^\u001a\u00020\u00132\u0006\u0010X\u001a\u00020W2\u0006\u0010K\u001a\u00020]H\u0007¢\u0006\u0004\b^\u0010_J#\u0010b\u001a\u0004\u0018\u0001042\u0006\u0010`\u001a\u00020\u00072\b\b\u0002\u0010a\u001a\u00020AH\u0002¢\u0006\u0004\bb\u0010cJ#\u0010f\u001a\u00020\u00192\b\u0010d\u001a\u0004\u0018\u0001042\b\u0010e\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\bf\u0010gJ\u0019\u0010i\u001a\u00020A2\b\b\u0001\u0010h\u001a\u00020\u0019H\u0007¢\u0006\u0004\bi\u0010CJ\u000f\u0010j\u001a\u00020AH\u0007¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00132\u0006\u0010l\u001a\u00020AH\u0007¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020\u00132\u0006\u0010o\u001a\u00020AH\u0007¢\u0006\u0004\bp\u0010nJ\u000f\u0010q\u001a\u00020AH\u0007¢\u0006\u0004\bq\u0010kJ\u000f\u0010r\u001a\u00020\u0013H\u0007¢\u0006\u0004\br\u0010\u0003J\u000f\u0010s\u001a\u00020\u0013H\u0007¢\u0006\u0004\bs\u0010\u0003J\u0019\u0010t\u001a\u00020\u00132\b\b\u0001\u0010h\u001a\u00020\u0019H\u0007¢\u0006\u0004\bt\u0010uJ+\u0010w\u001a\u0004\u0018\u00010\u00072\b\u0010v\u001a\u0004\u0018\u0001042\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bw\u0010xJ\u001f\u0010z\u001a\u00020\u00132\u0006\u0010y\u001a\u0002042\u0006\u0010J\u001a\u00020\u0007H\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u0013H\u0002¢\u0006\u0004\b|\u0010\u0003J\u0017\u0010}\u001a\u00020\u00132\u0006\u0010K\u001a\u00020]H\u0007¢\u0006\u0004\b}\u0010~R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0083\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0083\u0001R\u001d\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u008b\u0001R\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0017\u0010l\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010MR\u0017\u0010\u0096\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0017\u0010\u0097\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010\u0098\u0001R\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0098\u0001R\u001a\u0010\u009b\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010\u0098\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u0017\u0010\u009d\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010MR\u001f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010\u0003\u001a\u0005\b\u008f\u0001\u0010\tR \u0010¢\u0001\u001a\u0004\u0018\u00010O8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¡\u0001\u0010\u0003\u001a\u0006\b\u0095\u0001\u0010 \u0001R\u001d\u0010¤\u0001\u001a\u00020\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b£\u0001\u0010\u0003\u001a\u0005\b\u0093\u0001\u0010\tR\u001d\u0010¦\u0001\u001a\u00020\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u0010\u0003\u001a\u0005\b\u0091\u0001\u0010\tR'\u0010ª\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010§\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b©\u0001\u0010\u0003\u001a\u0006\b\u008d\u0001\u0010¨\u0001¨\u0006¬\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/api/ABManager;", "", "<init>", "()V", "Ll/uqd0;", "b", "()Ll/uqd0;", "", "e", "()Ljava/lang/String;", "c0", "I", Constants.KEY_KEY, "i0", "(Ljava/lang/String;)Ljava/lang/String;", "b0", "j0", "Lcom/p1/mobile/putong/api/ABManager$d;", "abController", "", "R", "(Lcom/p1/mobile/putong/api/ABManager$d;)V", "h0", "ab_key", "property_key", "", "defaultVal", "A", "(Ljava/lang/String;Ljava/lang/String;I)I", "P", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "defaultString", "Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lrx/c;", "W", "()Lrx/c;", "Ll/roj0;", "m", "o", "L", "q", "n", "p", "r", "E", "Landroid/os/Bundle;", "outState", "K", "(Landroid/os/Bundle;)V", "savedInstanceState", "J", "Lcom/p1/mobile/putong/api/ABManager$b;", "oldGroup", "newGroup", "G", "(Lcom/p1/mobile/putong/api/ABManager$b;Lcom/p1/mobile/putong/api/ABManager$b;)Lcom/p1/mobile/putong/api/ABManager$b;", "D", "Landroid/content/Context;", "context", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Landroid/content/Context;)V", BaseSei.f13930X, "a0", "state", "", ResourceDirection.f38808v, "(I)Z", "Ll/k850$b;", "client", "f", "(Ll/k850$b;)Ll/k850$b;", "U", j6f.GPS_DIRECTION_TRUE, "type", "mode", "oneIdTimeOut", "Z", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lorg/json/JSONArray;", "jsonArray", BLiveStormDanmakuGiftResourceType.f44444l, "(Lorg/json/JSONArray;)Ljava/lang/String;", "Ll/stc0;", SocialConstants.TYPE_REQUEST, "B", "(Ll/stc0;)Ll/stc0;", "Ll/exc0;", "response", b2s.C_ZONE, "(Ll/stc0;Ll/exc0;)V", "M", "N", "Lcom/p1/mobile/putong/api/ABManager$Mode;", "g0", "(Ll/exc0;Lcom/p1/mobile/putong/api/ABManager$Mode;)V", "testBody", "ignoreexpiredSince", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;Z)Lcom/p1/mobile/putong/api/ABManager$b;", "oldItem", "newItem", "H", "(Lcom/p1/mobile/putong/api/ABManager$b;Lcom/p1/mobile/putong/api/ABManager$b;)I", "deviceABStatus", BaseSei.f13931Y, "u", "()Z", "hasRequestUidAb", "X", "(Z)V", "hasUidOnNext", "Y", BaseSei.f13932Z, "d0", "f0", "e0", "(I)V", "abGroups", BloodType.f38728O, "(Lcom/p1/mobile/putong/api/ABManager$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "groups", j6f.LATITUDE_SOUTH, "(Lcom/p1/mobile/putong/api/ABManager$b;Ljava/lang/String;)V", "w", "F", "(Lcom/p1/mobile/putong/api/ABManager$Mode;)V", "", "a", "Ljava/util/List;", "controllers", "Ll/uqd0;", "abgroups_mode_device", "c", "abgroups_mode_uid", Constants.INAPP_DATA_TAG, "newAbgroups_mode_device", "newAbgroups_mode_uid", "Lrx/subjects/a;", "Lrx/subjects/a;", "restartBs", "g", "modeDeviceBs", "h", "oneIdDeviceBs", RXScreenCaptureService.KEY_INDEX, "modeUserBs", "j", "modeUidBs", "k", "hasUidABOnNext", "INIT_STATE", "Lcom/p1/mobile/putong/api/ABManager$b;", "abGroupsUser", "abGroupsDevice", "abGroupsUid", "sDeviceABStatus", "hasInitABGroup", "getAbHeader$annotations", "abHeader", "()Lorg/json/JSONArray;", "getJSONAbNames$annotations", "jSONAbNames", "getDeviceABNames$annotations", "deviceABNames", "getAbNames$annotations", "abNames", "", "()Ljava/util/Set;", "getABGroupKeys$annotations", "aBGroupKeys", "Mode", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ABManager {

    @NotNull
    public static final ABManager INSTANCE = new ABManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<InterfaceC4678d> controllers = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 abgroups_mode_device = new uqd0("abgroups_mode_device", "");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 abgroups_mode_uid = new uqd0("abgroups_mode_uid", "");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 newAbgroups_mode_device = new uqd0("newabgroups_mode_device", "");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 newAbgroups_mode_uid = new uqd0("newabgroups_mode_uid", "");

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<Integer> restartBs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<roj0> modeDeviceBs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<roj0> oneIdDeviceBs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<roj0> modeUserBs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<roj0> modeUidBs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static volatile boolean hasRequestUidAb;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static volatile boolean hasUidABOnNext;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static volatile int INIT_STATE;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public static C4676b abGroupsUser;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public static C4676b abGroupsDevice;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public static C4676b abGroupsUid;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static volatile int sDeviceABStatus;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static volatile boolean hasInitABGroup;

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m87232d2 = {"Lcom/p1/mobile/putong/api/ABManager$Mode;", "", "mode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "user", Device.TYPE, Oauth2AccessToken.KEY_UID, "toString", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum Mode {
        user("user"),
        device(Device.TYPE),
        uid(Oauth2AccessToken.KEY_UID);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

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
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u000bR.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Lcom/p1/mobile/putong/api/ABManager$a;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKey", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", Constants.KEY_KEY, "b", "c", "f", "value", "", "Ljava/util/Map;", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "properties", "", "Z", "()Z", "e", "(Z)V", "restart", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C4675a {

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
        public final Map<String, String> m29377a() {
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
        public final void m29380d(@Nullable String str) {
            this.key = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m29381e(boolean z) {
            this.restart = z;
        }

        /* JADX INFO: renamed from: f */
        public final void m29382f(@Nullable String str) {
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
    @Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u0016\u0010\u000bR>\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u0018j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019`\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Lcom/p1/mobile/putong/api/ABManager$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "j", "(Ljava/lang/String;)V", "responseBody", "Lorg/json/JSONArray;", "b", "Lorg/json/JSONArray;", Constants.INAPP_DATA_TAG, "()Lorg/json/JSONArray;", RXScreenCaptureService.KEY_INDEX, "(Lorg/json/JSONArray;)V", "names", "c", "f", "abHeader", "Ljava/util/HashMap;", "Lcom/p1/mobile/putong/api/ABManager$a;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "h", "(Ljava/util/HashMap;)V", "groupMap", "", "D", "getExpiredSince", "()D", "g", "(D)V", "expiredSince", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C4676b {

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
        public HashMap<String, C4675a> groupMap = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public double expiredSince = Double.MAX_VALUE;

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m29383a() {
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
        public final HashMap<String, C4675a> m29385c() {
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
        public final void m29388f(@Nullable String str) {
            this.abHeader = str;
        }

        /* JADX INFO: renamed from: g */
        public final void m29389g(double d) {
            this.expiredSince = d;
        }

        /* JADX INFO: renamed from: h */
        public final void m29390h(@NotNull HashMap<String, C4675a> map) {
            map.getClass();
            this.groupMap = map;
        }

        /* JADX INFO: renamed from: i */
        public final void m29391i(@Nullable JSONArray jSONArray) {
            this.names = jSONArray;
        }

        /* JADX INFO: renamed from: j */
        public final void m29392j(@Nullable String str) {
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
            return C15384b.m93470i("\n   names => " + string + "\n   abHeader => " + this.abHeader + "\n   expiredSince => " + this.expiredSince + "\n   groups => \n   " + ((Object) sb) + "\n   ");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$c */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/api/ABManager$c;", "Ll/axm;", "<init>", "()V", "Ll/axm$a;", "chain", "Ll/exc0;", "intercept", "(Ll/axm$a;)Ll/exc0;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C4677c implements axm {
        @Override // p149l.axm
        @NotNull
        public exc0 intercept(@NotNull axm.InterfaceC15754a chain) throws IOException {
            chain.getClass();
            ABManager aBManager = ABManager.INSTANCE;
            stc0 stc0VarRequest = chain.request();
            stc0VarRequest.getClass();
            stc0 stc0VarM29366B = aBManager.m29366B(stc0VarRequest);
            exc0 exc0VarMo99454a = chain.mo99454a(stc0VarM29366B);
            exc0VarMo99454a.getClass();
            aBManager.m29367C(stc0VarM29366B, exc0VarMo99454a);
            return exc0VarMo99454a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$d */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/api/ABManager$d;", "", "", "a", "()V", "b", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC4678d {
        /* JADX INFO: renamed from: a */
        void mo29393a();

        /* JADX INFO: renamed from: b */
        void mo29394b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$e */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000f"}, m87232d2 = {"Lcom/p1/mobile/putong/api/ABManager$e;", "", "<init>", "()V", "Ll/stc0;", "req", "", "b", "(Ll/stc0;)V", "", "a", "Z", "sOneIdDeviceABValid", "()Z", "isOneIdDeviceABValid", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C4679e {

        @NotNull
        public static final C4679e INSTANCE = new C4679e();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public static volatile boolean sOneIdDeviceABValid = true;

        /* JADX INFO: renamed from: a */
        public final boolean m29395a() {
            return sOneIdDeviceABValid && !TextUtils.isEmpty(sh50.m184159d());
        }

        /* JADX INFO: renamed from: b */
        public final void m29396b(@NotNull stc0 req) {
            req.getClass();
            if (TextUtils.isEmpty(req.m185881k().m107507A("oneid"))) {
                sOneIdDeviceABValid = false;
            } else {
                sOneIdDeviceABValid = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$f */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C4680f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17096a;

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
            f17096a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$g */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m87232d2 = {"com/p1/mobile/putong/api/ABManager$g", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C4681g extends TypeToken<List<? extends Object>> {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$h */
    @Metadata(m87231d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m87232d2 = {"com/p1/mobile/putong/api/ABManager$h", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C4682h extends TypeToken<List<? extends Object>> {
    }

    static {
        C22392a<Integer> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        restartBs = c22392aM221512b;
        C22392a<roj0> c22392aM221512b2 = C22392a.m221512b();
        c22392aM221512b2.getClass();
        modeDeviceBs = c22392aM221512b2;
        C22392a<roj0> c22392aM221512b3 = C22392a.m221512b();
        c22392aM221512b3.getClass();
        oneIdDeviceBs = c22392aM221512b3;
        C22392a<roj0> c22392aM221512b4 = C22392a.m221512b();
        c22392aM221512b4.getClass();
        modeUserBs = c22392aM221512b4;
        C22392a<roj0> c22392aM221512b5 = C22392a.m221512b();
        c22392aM221512b5.getClass();
        modeUidBs = c22392aM221512b5;
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final int m29315A(@NotNull String ab_key, @NotNull String property_key, int defaultVal) {
        ab_key.getClass();
        property_key.getClass();
        try {
            String strM29372O = INSTANCE.m29372O(abGroupsUser, ab_key, property_key);
            if (strM29372O != null) {
                return Integer.parseInt(strM29372O);
            }
        } catch (NumberFormatException unused) {
        }
        return defaultVal;
    }

    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final synchronized void m29316D() {
        INIT_STATE = 1;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: E */
    public static final String m29317E() {
        C4676b c4676b = abGroupsUser;
        String strValueOf = c4676b == null ? "" : String.valueOf(c4676b);
        C4676b c4676b2 = abGroupsDevice;
        String strValueOf2 = c4676b2 == null ? "" : String.valueOf(c4676b2);
        C4676b c4676b3 = abGroupsUid;
        return strValueOf + strValueOf2 + (c4676b3 != null ? String.valueOf(c4676b3) : "");
    }

    @JvmStatic
    /* JADX INFO: renamed from: F */
    public static final void m29318F(@NotNull Mode mode) {
        String str;
        mode.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            int i = C4680f.f17096a[mode.ordinal()];
            if (i == 1) {
                str = m29319I().get();
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
            C4676b c4676bM29375s = aBManager.m29375s(str, true);
            zvf0.m220371D("e_clone_ab_info", "", new j760("clone_ab_info", aBManager.m29374l(c4676bM29375s != null ? c4676bM29375s.getNames() : null)));
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: I */
    public static final uqd0 m29319I() {
        return new uqd0(App.f15369e, "newabgroups_user" + qib0.f154714c0.userId(), "ab_nerver_save");
    }

    @JvmStatic
    /* JADX INFO: renamed from: J */
    public static final synchronized void m29320J(@NotNull Bundle savedInstanceState) {
        try {
            savedInstanceState.getClass();
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsUser")) && (abGroupsUser == null || INIT_STATE == 0)) {
                ABManager aBManager = INSTANCE;
                String str = m29335b().get();
                str.getClass();
                C4676b c4676bM29360t = m29360t(aBManager, str, false, 2, null);
                abGroupsUser = c4676bM29360t;
                String str2 = m29319I().get();
                str2.getClass();
                abGroupsUser = aBManager.m29368G(c4676bM29360t, aBManager.m29375s(str2, true));
                INIT_STATE = 1;
            }
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsDevice")) && abGroupsDevice == null) {
                ABManager aBManager2 = INSTANCE;
                C4676b c4676bM29360t2 = m29360t(aBManager2, m29341e(), false, 2, null);
                abGroupsDevice = c4676bM29360t2;
                String str3 = newAbgroups_mode_device.get();
                str3.getClass();
                abGroupsDevice = aBManager2.m29368G(c4676bM29360t2, aBManager2.m29375s(str3, true));
            }
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsUid")) && abGroupsUid == null) {
                ABManager aBManager3 = INSTANCE;
                C4676b c4676bM29360t3 = m29360t(aBManager3, m29338c0(), false, 2, null);
                abGroupsUid = c4676bM29360t3;
                String str4 = newAbgroups_mode_uid.get();
                str4.getClass();
                abGroupsUid = aBManager3.m29368G(c4676bM29360t3, aBManager3.m29375s(str4, true));
            }
            du2.m113670a("[putong-common][ab]", "onRestoreAbGroupsInfo abGroupsUser = " + abGroupsUser + ", abGroupsDevice = " + abGroupsDevice + ", abGroupsUid = " + abGroupsUid);
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: K */
    public static final void m29321K(@NotNull Bundle outState) {
        outState.getClass();
        C4676b c4676b = abGroupsUser;
        if (c4676b != null) {
            c4676b.getClass();
            if (!TextUtils.isEmpty(c4676b.getResponseBody())) {
                outState.putString("abGroupsUser", "abGroupsUser.responseBody");
            }
        }
        C4676b c4676b2 = abGroupsDevice;
        if (c4676b2 != null) {
            c4676b2.getClass();
            if (!TextUtils.isEmpty(c4676b2.getResponseBody())) {
                outState.putString("abGroupsDevice", "abGroupsDevice.responseBody");
            }
        }
        C4676b c4676b3 = abGroupsUid;
        if (c4676b3 != null) {
            c4676b3.getClass();
            if (TextUtils.isEmpty(c4676b3.getResponseBody())) {
                return;
            }
            outState.putString("abGroupsUid", "abGroupsUid.responseBody");
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: L */
    public static final C22306c<roj0> m29322L() {
        C22306c<roj0> c22306cObserveOn = oneIdDeviceBs.onBackpressureLatest().observeOn(jo0.m142408a());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: P */
    public static final String m29323P(@NotNull String ab_key, @NotNull String property_key) {
        ab_key.getClass();
        property_key.getClass();
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: Q */
    public static final String m29324Q(@NotNull String ab_key, @NotNull String property_key, @Nullable String defaultString) {
        ab_key.getClass();
        property_key.getClass();
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: R */
    public static final void m29325R(@Nullable InterfaceC4678d abController) {
        if (abController != null) {
            if (hasInitABGroup) {
                abController.mo29393a();
            }
            controllers.add(abController);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: T */
    public static final synchronized void m29326T() {
        try {
            INIT_STATE = 0;
            modeUserBs.onNext(roj0.f160388a);
            Iterator<InterfaceC4678d> it = controllers.iterator();
            while (it.hasNext()) {
                it.next().mo29394b();
            }
            du2.m113670a("[putong-common][ab]", "resetAllAb");
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: U */
    public static final synchronized void m29327U() {
        m29335b().clear();
        abgroups_mode_uid.clear();
        abGroupsUser = null;
        abGroupsUid = null;
        du2.m113670a("[putong-common][ab]", "resetUserAb");
    }

    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final void m29328V(@NotNull Context context) {
        context.getClass();
        restartBs.onNext(0);
        m29362v(3);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.getClass();
        launchIntentForPackage.addFlags(268468224);
        context.startActivity(launchIntentForPackage);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: W */
    public static final C22306c<Integer> m29329W() {
        return restartBs;
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final void m29330X(boolean hasRequestUidAb2) {
        hasRequestUidAb = hasRequestUidAb2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y */
    public static final void m29331Y(boolean hasUidOnNext) {
        hasUidABOnNext = hasUidOnNext;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final void m29332Z(@NotNull String type, @NotNull String mode, boolean oneIdTimeOut) {
        type.getClass();
        mode.getClass();
        zvf0.m220369B("e_ab_report", "", new j760("ab_type", type), new j760("ab_mode", mode), new j760("oneid_timeout", Boolean.valueOf(oneIdTimeOut)));
    }

    /* JADX INFO: renamed from: a */
    public static void m29333a(int i) {
        restartBs.onNext(Integer.valueOf(i));
    }

    @JvmStatic
    /* JADX INFO: renamed from: a0 */
    public static final void m29334a0() {
        try {
            ABManager aBManager = INSTANCE;
            String str = m29335b().get();
            str.getClass();
            C4676b c4676bM29360t = m29360t(aBManager, str, false, 2, null);
            abGroupsUser = c4676bM29360t;
            String str2 = m29319I().get();
            str2.getClass();
            C4676b c4676bM29368G = aBManager.m29368G(c4676bM29360t, aBManager.m29375s(str2, true));
            abGroupsUser = c4676bM29368G;
            if (c4676bM29368G != null) {
                Iterator<InterfaceC4678d> it = controllers.iterator();
                while (it.hasNext()) {
                    it.next().mo29393a();
                }
            }
            du2.m113670a("[putong-common][ab]", "tryInitUserAbInApplication abGroupsUser = " + abGroupsUser);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final uqd0 m29335b() {
        return new uqd0(App.f15369e, "abgroups" + qib0.f154714c0.userId(), "ab_nerver_save");
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public static final String m29336b0(@NotNull String key) {
        HashMap<String, C4675a> mapM29385c;
        C4675a c4675a;
        String value;
        key.getClass();
        C4676b c4676b = abGroupsUid;
        return (c4676b == null || (mapM29385c = c4676b.m29385c()) == null || (c4675a = mapM29385c.get(key)) == null || (value = c4675a.getValue()) == null) ? "" : value;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public static final String m29338c0() {
        String str = abgroups_mode_uid.get();
        str.getClass();
        return str;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d0 */
    public static final void m29340d0() {
        ABManager aBManager = INSTANCE;
        String str = abgroups_mode_device.get();
        str.getClass();
        C4676b c4676bM29360t = m29360t(aBManager, str, false, 2, null);
        abGroupsDevice = c4676bM29360t;
        String str2 = newAbgroups_mode_device.get();
        str2.getClass();
        C4676b c4676bM29368G = aBManager.m29368G(c4676bM29360t, aBManager.m29375s(str2, true));
        abGroupsDevice = c4676bM29368G;
        du2.m113670a("[putong-common][ab]", "tryInitDeviceGroupUseOld abGroupsDevice = " + c4676bM29368G);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m29341e() {
        String str = abgroups_mode_device.get();
        str.getClass();
        return str;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e0 */
    public static final synchronized void m29342e0(int deviceABStatus) {
        sDeviceABStatus = deviceABStatus;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final k850.C17954b m29343f(@NotNull k850.C17954b client) {
        client.getClass();
        INSTANCE.m29376w();
        k850.C17954b c17954bM144880a = client.m144880a(new C4677c());
        c17954bM144880a.getClass();
        return c17954bM144880a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f0 */
    public static final void m29344f0() {
        ABManager aBManager = INSTANCE;
        String str = abgroups_mode_uid.get();
        str.getClass();
        C4676b c4676bM29360t = m29360t(aBManager, str, false, 2, null);
        abGroupsUid = c4676bM29360t;
        String str2 = newAbgroups_mode_uid.get();
        str2.getClass();
        C4676b c4676bM29368G = aBManager.m29368G(c4676bM29360t, aBManager.m29375s(str2, true));
        abGroupsUid = c4676bM29368G;
        du2.m113670a("[putong-common][ab]", "tryInitUidGroupUseOld abGroupsUid = " + c4676bM29368G);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Set<String> m29345g() {
        C4676b c4676b;
        HashMap<String, C4675a> mapM29385c;
        C4676b c4676b2 = abGroupsUser;
        if ((c4676b2 != null ? c4676b2.m29385c() : null) == null || (c4676b = abGroupsUser) == null || (mapM29385c = c4676b.m29385c()) == null) {
            return null;
        }
        return mapM29385c.keySet();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g0 */
    public static final void m29346g0(@NotNull exc0 response, @NotNull Mode mode) {
        response.getClass();
        mode.getClass();
        if (response.m118597I()) {
            String strM148230K = "";
            try {
                gxc0 gxc0VarM118606k = response.m118606k();
                strM148230K = C18133l2.m148230K(gxc0VarM118606k != null ? gxc0VarM118606k.string() : null);
                Objects.toString(mode);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
            if (mode == Mode.user) {
                m29319I().put(strM148230K);
            } else if (mode == Mode.device) {
                newAbgroups_mode_device.put(strM148230K);
            } else if (mode == Mode.uid) {
                newAbgroups_mode_uid.put(strM148230K);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m29347h() {
        if (qib0.f154714c0.getAuthData().mo108248b() == null) {
            C4676b c4676b = abGroupsDevice;
            if (c4676b == null || c4676b == null) {
                return null;
            }
            return c4676b.getAbHeader();
        }
        if (abGroupsUser == null) {
            return "";
        }
        if (qib0.f154714c0.signedIn_()) {
            C4676b c4676b2 = abGroupsUser;
            if (c4676b2 != null) {
                return c4676b2.getAbHeader();
            }
            return null;
        }
        C4676b c4676b3 = abGroupsUid;
        if (c4676b3 != null) {
            return c4676b3.getAbHeader();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h0 */
    public static final String m29348h0(@Nullable String key) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m29349i() {
        JSONArray jSONArrayM29353k = m29353k();
        return jSONArrayM29353k == null ? "" : INSTANCE.m29374l(jSONArrayM29353k);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i0 */
    public static final String m29350i0(@Nullable String key) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m29351j() {
        JSONArray names;
        C4676b c4676b = abGroupsDevice;
        if (c4676b != null) {
            c4676b.getClass();
            names = c4676b.getNames();
        } else {
            names = null;
        }
        return names == null ? "" : INSTANCE.m29374l(names);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j0 */
    public static final String m29352j0(@NotNull String key) {
        HashMap<String, C4675a> mapM29385c;
        C4675a c4675a;
        String value;
        key.getClass();
        C4676b c4676b = abGroupsUser;
        return (c4676b == null || (mapM29385c = c4676b.m29385c()) == null || (c4675a = mapM29385c.get(key)) == null || (value = c4675a.getValue()) == null) ? "" : value;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final JSONArray m29353k() {
        if (qib0.f154714c0.getAuthData().mo108248b() == null) {
            C4676b c4676b = abGroupsDevice;
            if (c4676b == null) {
                return null;
            }
            c4676b.getClass();
            return c4676b.getNames();
        }
        if (qib0.f154714c0.signedIn_()) {
            C4676b c4676b2 = abGroupsUser;
            if (c4676b2 == null) {
                return null;
            }
            c4676b2.getClass();
            return c4676b2.getNames();
        }
        C4676b c4676b3 = abGroupsUid;
        if (c4676b3 == null) {
            return null;
        }
        c4676b3.getClass();
        return c4676b3.getNames();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final C22306c<roj0> m29354m() {
        C22306c<roj0> c22306cObserveOn = modeDeviceBs.onBackpressureLatest().observeOn(jo0.m142408a());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final C22306c<roj0> m29355n() {
        C22306c<roj0> c22306cObserveOn = modeDeviceBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final C22306c<roj0> m29356o() {
        C22306c<roj0> c22306cObserveOn = modeUidBs.onBackpressureLatest().observeOn(jo0.m142408a());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final C22306c<roj0> m29357p() {
        C22306c<roj0> c22306cObserveOn = modeUidBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final C22306c<roj0> m29358q() {
        C22306c<roj0> c22306cObserveOn = modeUserBs.onBackpressureLatest().observeOn(jo0.m142408a());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final C22306c<roj0> m29359r() {
        C22306c<roj0> c22306cObserveOn = modeUserBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        c22306cObserveOn.getClass();
        return c22306cObserveOn;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C4676b m29360t(ABManager aBManager, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aBManager.m29375s(str, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final boolean m29361u() {
        return hasRequestUidAb;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final synchronized boolean m29362v(int state) {
        try {
            du2.m113670a("[putong-common][ab]", "initAbGroup , state = " + state);
            try {
                if (INIT_STATE + state == 3) {
                    return false;
                }
                INIT_STATE = state;
                ABManager aBManager = INSTANCE;
                String str = m29335b().get();
                str.getClass();
                C4676b c4676bM29360t = m29360t(aBManager, str, false, 2, null);
                abGroupsUser = c4676bM29360t;
                String str2 = m29319I().get();
                str2.getClass();
                abGroupsUser = aBManager.m29368G(c4676bM29360t, aBManager.m29375s(str2, true));
                RemoteConfig.m79288c0();
                modeUserBs.onNext(roj0.f160388a);
                C4676b c4676b = abGroupsUser;
                if (c4676b != null) {
                    c4676b.getClass();
                    c4676b.getAbHeader();
                    Iterator<InterfaceC4678d> it = controllers.iterator();
                    while (it.hasNext()) {
                        it.next().mo29393a();
                    }
                    hasInitABGroup = true;
                    ABManager aBManager2 = INSTANCE;
                    C4676b c4676b2 = abGroupsUser;
                    c4676b2.getClass();
                    aBManager2.m29373S(c4676b2, "user");
                    C18133l2 c18133l2 = qib0.f154702Q;
                    C4676b c4676b3 = abGroupsUser;
                    c4676b3.getClass();
                    c18133l2.m148249W(c4676b3.m29383a());
                }
                du2.m113670a("[putong-common][ab]", "initAbGroup abGroupsUser = " + abGroupsUser + ", state = " + state);
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("ABManager initAbGroup:" + e.getMessage(), e));
                du2.m113670a("[putong-common][ab]", "initAbGroup error : e = " + e.getMessage());
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final void m29363x() {
        IntlCountryCodeController.m28109e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final synchronized boolean m29364y(int deviceABStatus) {
        boolean z;
        try {
            z = false;
            if (sDeviceABStatus != 2) {
                ABManager aBManager = INSTANCE;
                String str = abgroups_mode_device.get();
                str.getClass();
                C4676b c4676bM29360t = m29360t(aBManager, str, false, 2, null);
                abGroupsDevice = c4676bM29360t;
                String str2 = newAbgroups_mode_device.get();
                str2.getClass();
                abGroupsDevice = aBManager.m29368G(c4676bM29360t, aBManager.m29375s(str2, true));
                if (sDeviceABStatus == 0 || deviceABStatus != 2) {
                    C22392a<roj0> c22392a = modeDeviceBs;
                    roj0 roj0Var = roj0.f160388a;
                    c22392a.onNext(roj0Var);
                    if (C4679e.INSTANCE.m29395a()) {
                        oneIdDeviceBs.onNext(roj0Var);
                    }
                    C4676b c4676b = abGroupsDevice;
                    if (c4676b != null) {
                        c4676b.getClass();
                        aBManager.m29373S(c4676b, Device.TYPE);
                        C18133l2 c18133l2 = qib0.f154702Q;
                        C4676b c4676b2 = abGroupsDevice;
                        c4676b2.getClass();
                        c18133l2.m148249W(c4676b2.m29383a());
                    }
                    du2.m113670a("[putong-common][ab]", "initPreSignInDeviceGroup abGroupsDevice = " + abGroupsDevice);
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
    public static final boolean m29365z() {
        m29344f0();
        if (hasUidABOnNext) {
            return false;
        }
        modeUidBs.onNext(roj0.f160388a);
        m29331Y(true);
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final stc0 m29366B(stc0 request) {
        if (ABHeaderControl.NO_AB_HEADER == request.m185880j(ABHeaderControl.class)) {
            return request;
        }
        try {
            return m29370M(request);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("ABManager interceptRequest:" + e.getMessage(), e));
            return request;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m29367C(stc0 request, exc0 response) {
        try {
            m29371N(request, response);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("ABManager interceptRespose:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: G */
    public final C4676b m29368G(C4676b oldGroup, C4676b newGroup) {
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
                    oldGroup.m29385c().putAll(newGroup.m29385c());
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Object objM165671c = ork.m165671c(oldGroup.getAbHeader(), new C4682h().getType());
                        objM165671c.getClass();
                        Object objM165671c2 = ork.m165671c(newGroup.getAbHeader(), new C4681g().getType());
                        objM165671c2.getClass();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll((List) objM165671c);
                        arrayList.addAll((List) objM165671c2);
                        oldGroup.m29388f(ork.m165672d(arrayList));
                        Result.m223820constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m223820constructorimpl(ResultKt.m87238a(th));
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
                        oldGroup.m29391i(newGroup.getNames());
                    }
                }
            }
        }
        return oldGroup;
    }

    /* JADX INFO: renamed from: H */
    public final int m29369H(C4676b oldItem, C4676b newItem) {
        if (oldItem != null) {
            for (String str : oldItem.m29385c().keySet()) {
                str.getClass();
                String str2 = str;
                C4675a c4675a = oldItem.m29385c().get(str2);
                c4675a.getClass();
                if (c4675a.getRestart() && (newItem == null || !newItem.m29385c().containsKey(str2))) {
                    return 2;
                }
            }
        }
        if (newItem == null) {
            return 0;
        }
        for (String str3 : newItem.m29385c().keySet()) {
            str3.getClass();
            String str4 = str3;
            C4675a c4675a2 = newItem.m29385c().get(str4);
            c4675a2.getClass();
            if (c4675a2.getRestart() && (oldItem == null || !oldItem.m29385c().containsKey(str4))) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public final stc0 m29370M(stc0 request) {
        String abHeader;
        String abHeader2;
        String abHeader3;
        String abHeader4;
        String str = "";
        if (qib0.f154714c0.getAuthData().mo108248b() == null) {
            C4676b c4676b = abGroupsDevice;
            if (!TextUtils.isEmpty(c4676b != null ? c4676b.getAbHeader() : null)) {
                stc0.C20027a c20027aM185878h = request.m185878h();
                C4676b c4676b2 = abGroupsDevice;
                if (c4676b2 != null && (abHeader4 = c4676b2.getAbHeader()) != null) {
                    str = abHeader4;
                }
                stc0 stc0VarM185883b = c20027aM185878h.m185889h("X-Testing-Group", str).m185883b();
                stc0VarM185883b.getClass();
                return stc0VarM185883b;
            }
        } else {
            C4676b c4676b3 = abGroupsUser;
            if (!TextUtils.isEmpty(c4676b3 != null ? c4676b3.getAbHeader() : null)) {
                stc0.C20027a c20027aM185878h2 = request.m185878h();
                C4676b c4676b4 = abGroupsUser;
                if (c4676b4 != null && (abHeader3 = c4676b4.getAbHeader()) != null) {
                    str = abHeader3;
                }
                stc0 stc0VarM185883b2 = c20027aM185878h2.m185889h("X-Testing-Group", str).m185883b();
                stc0VarM185883b2.getClass();
                return stc0VarM185883b2;
            }
            if (!TantanApp.f17181d.mo108248b().booleanValue()) {
                C4676b c4676b5 = abGroupsUid;
                if (!TextUtils.isEmpty(c4676b5 != null ? c4676b5.getAbHeader() : null)) {
                    stc0.C20027a c20027aM185878h3 = request.m185878h();
                    C4676b c4676b6 = abGroupsUid;
                    if (c4676b6 != null && (abHeader2 = c4676b6.getAbHeader()) != null) {
                        str = abHeader2;
                    }
                    stc0 stc0VarM185883b3 = c20027aM185878h3.m185889h("X-Testing-Group", str).m185883b();
                    stc0VarM185883b3.getClass();
                    return stc0VarM185883b3;
                }
                C4676b c4676b7 = abGroupsDevice;
                if (!TextUtils.isEmpty(c4676b7 != null ? c4676b7.getAbHeader() : null)) {
                    stc0.C20027a c20027aM185878h4 = request.m185878h();
                    C4676b c4676b8 = abGroupsDevice;
                    if (c4676b8 != null && (abHeader = c4676b8.getAbHeader()) != null) {
                        str = abHeader;
                    }
                    stc0 stc0VarM185883b4 = c20027aM185878h4.m185889h("X-Testing-Group", str).m185883b();
                    stc0VarM185883b4.getClass();
                    return stc0VarM185883b4;
                }
            }
        }
        return request;
    }

    /* JADX INFO: renamed from: N */
    public final void m29371N(stc0 request, exc0 response) {
        final int iM29369H;
        if (request.m185879i() != null && response.m118597I() && StringsKt.m93412P(String.valueOf(request.m185879i()), "X-Testing-Group-V2-Tag", false, 2, null)) {
            String strM148230K = "";
            try {
                gxc0 gxc0VarM118606k = response.m118606k();
                gxc0VarM118606k.getClass();
                strM148230K = C18133l2.m148230K(gxc0VarM118606k.string());
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
            qib0.f154693H.updateServerTime(response.m118611u("Date"));
            if (Intrinsics.m87488d(request.m185879i(), "X-Testing-Group-V2-Tag" + Mode.user)) {
                m29332Z("response", "user", false);
                m29335b().put(strM148230K);
                du2.m113670a("[putong-common][ab]", "initAbUser : " + strM148230K);
                strM148230K.getClass();
                C4676b c4676bM29360t = m29360t(this, strM148230K, false, 2, null);
                c4676bM29360t.getClass();
                c4676bM29360t.getAbHeader();
                if (INIT_STATE == 0 || (iM29369H = m29369H(abGroupsUser, c4676bM29360t)) == 0) {
                    return;
                }
                e51.m114748M(new Runnable() { // from class: l.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ABManager.m29333a(iM29369H);
                    }
                });
                return;
            }
            if (Intrinsics.m87488d(request.m185879i(), "X-Testing-Group-V2-Tag" + Mode.device)) {
                C4679e c4679e = C4679e.INSTANCE;
                c4679e.m29396b(request);
                if (c4679e.m29395a()) {
                    m29332Z("response", "oneid", false);
                } else {
                    m29332Z("response", "deviceid", false);
                }
                abgroups_mode_device.put(strM148230K);
                du2.m113670a("[putong-common][ab]", "initAbDevice : " + strM148230K);
                return;
            }
            if (Intrinsics.m87488d(request.m185879i(), "X-Testing-Group-V2-Tag" + Mode.uid)) {
                m29332Z("response", Oauth2AccessToken.KEY_UID, false);
                abgroups_mode_uid.put(strM148230K);
                du2.m113670a("[putong-common][ab]", "initAbUid : " + strM148230K);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m29372O(C4676b abGroups, String ab_key, String property_key) {
        HashMap<String, C4675a> mapM29385c;
        HashMap<String, C4675a> mapM29385c2;
        C4675a c4675a;
        Map<String, String> mapM29377a;
        if (abGroups == null || (mapM29385c = abGroups.m29385c()) == null || !mapM29385c.containsKey(ab_key) || abGroups == null || (mapM29385c2 = abGroups.m29385c()) == null || (c4675a = mapM29385c2.get(ab_key)) == null || (mapM29377a = c4675a.m29377a()) == null) {
            return null;
        }
        return mapM29377a.get(property_key);
    }

    /* JADX INFO: renamed from: S */
    public final void m29373S(C4676b groups, String type) {
        if (groups.m29385c() == null || groups.m29385c().size() <= 0 || !TextUtils.isEmpty(groups.getAbHeader())) {
            return;
        }
        CrashHelper.m81296c(new Throwable("HeaderNull " + type + "  group = " + groups.m29385c() + " header = " + groups.getAbHeader()));
    }

    /* JADX INFO: renamed from: l */
    public final String m29374l(JSONArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    arrayList.add(jsonArray.optString(i));
                } catch (JSONException e) {
                    CrashHelper.m81296c(e);
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
    public final C4676b m29375s(String testBody, boolean ignoreexpiredSince) {
        C4676b c4676b;
        String strOptString;
        String str;
        JSONObject jSONObject;
        double d;
        boolean z;
        List listEmptyList;
        String str2 = "restart";
        JSONArray jSONArrayOptJSONArray = null;
        if (Intrinsics.m87488d("ab_nerver_save", testBody)) {
            return null;
        }
        HashMap<String, C4675a> map = new HashMap<>();
        boolean zM144048b = k0g0.m144048b(testBody);
        String strOptString2 = WeJson.EMPTY_ARR;
        double dApiTimeStringToDate = Double.MAX_VALUE;
        if (zM144048b) {
            c4676b = null;
            strOptString2 = WeJson.EMPTY_ARR;
            jSONArrayOptJSONArray = null;
        } else {
            du2.m113670a("[putong-common][ab]", "real_ab_test_data:" + testBody);
            try {
                JSONObject jSONObject2 = new JSONObject(testBody);
                dApiTimeStringToDate = Converter.apiTimeStringToDate(jSONObject2.optString("expiredSince"));
                if (ignoreexpiredSince || dApiTimeStringToDate > qib0.f154693H.guessedCurrentServerTime()) {
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
                                    c4676b = null;
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    strOptString2 = strOptString2;
                                    CrashHelper.m81296c(new Exception(C15384b.m93470i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                    strOptString2 = strOptString2;
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    if (Intrinsics.m87488d(testBody, "ab_nerver_save")) {
                                        return c4676b;
                                    }
                                    C4676b c4676b2 = new C4676b();
                                    c4676b2.m29392j(testBody);
                                    c4676b2.m29391i(jSONArrayOptJSONArray);
                                    c4676b2.m29390h(map);
                                    c4676b2.m29388f(strOptString2);
                                    c4676b2.m29389g(dApiTimeStringToDate);
                                    return c4676b2;
                                }
                            }
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("groups");
                                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("properties");
                                Iterator<String> itKeys = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.keys() : null;
                                while (itKeys != null && itKeys.hasNext() == z2) {
                                    C4675a c4675a = new C4675a();
                                    String next = itKeys.next();
                                    next.getClass();
                                    String str3 = next;
                                    if (jSONObjectOptJSONObject != null) {
                                        try {
                                            strOptString = jSONObjectOptJSONObject.optString(str3);
                                        } catch (JSONException e2) {
                                            e = e2;
                                            c4676b = null;
                                            CrashHelper.m81296c(new Exception(C15384b.m93470i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                            strOptString2 = strOptString2;
                                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            if (Intrinsics.m87488d(testBody, "ab_nerver_save")) {
                                                return c4676b;
                                            }
                                            C4676b c4676b3 = new C4676b();
                                            c4676b3.m29392j(testBody);
                                            c4676b3.m29391i(jSONArrayOptJSONArray);
                                            c4676b3.m29390h(map);
                                            c4676b3.m29388f(strOptString2);
                                            c4676b3.m29389g(dApiTimeStringToDate);
                                            return c4676b3;
                                        }
                                    } else {
                                        strOptString = null;
                                    }
                                    c4675a.m29380d(str3);
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
                                                    if (Intrinsics.m87488d(str4, str2)) {
                                                        c4675a.m29381e(jSONObjectOptJSONObject3.getBoolean(str2));
                                                    } else {
                                                        c4675a.m29377a().put(str4, jSONObjectOptJSONObject3.optString(str4));
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
                                            c4676b = null;
                                            CrashHelper.m81296c(new Exception(C15384b.m93470i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                            strOptString2 = strOptString2;
                                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            if (Intrinsics.m87488d(testBody, "ab_nerver_save")) {
                                                return c4676b;
                                            }
                                            C4676b c4676b4 = new C4676b();
                                            c4676b4.m29392j(testBody);
                                            c4676b4.m29391i(jSONArrayOptJSONArray);
                                            c4676b4.m29390h(map);
                                            c4676b4.m29388f(strOptString2);
                                            c4676b4.m29389g(dApiTimeStringToDate);
                                            return c4676b4;
                                        }
                                    } else {
                                        str = str2;
                                        jSONObject = jSONObjectOptJSONObject2;
                                        d = dApiTimeStringToDate;
                                    }
                                    if (strOptString != null) {
                                        if (StringsKt.m93412P(strOptString, ":", false, 2, null)) {
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
                                                c4675a.m29382f(strArr[1]);
                                                map.put(str3, c4675a);
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
                                    c4675a.m29382f(strOptString);
                                    map.put(str3, c4675a);
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
                                c4676b = null;
                            } catch (JSONException e4) {
                                e = e4;
                            }
                        } catch (JSONException e5) {
                            e = e5;
                            strOptString2 = strOptString2;
                            c4676b = null;
                            jSONArrayOptJSONArray = null;
                            CrashHelper.m81296c(new Exception(C15384b.m93470i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                            strOptString2 = strOptString2;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            if (Intrinsics.m87488d(testBody, "ab_nerver_save")) {
                                return c4676b;
                            }
                            C4676b c4676b5 = new C4676b();
                            c4676b5.m29392j(testBody);
                            c4676b5.m29391i(jSONArrayOptJSONArray);
                            c4676b5.m29390h(map);
                            c4676b5.m29388f(strOptString2);
                            c4676b5.m29389g(dApiTimeStringToDate);
                            return c4676b5;
                        }
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } else {
                    c4676b = null;
                    strOptString2 = WeJson.EMPTY_ARR;
                    jSONArrayOptJSONArray = null;
                }
            } catch (JSONException e7) {
                e = e7;
                c4676b = null;
            }
        }
        if (Intrinsics.m87488d(testBody, "ab_nerver_save")) {
            return c4676b;
        }
        C4676b c4676b6 = new C4676b();
        c4676b6.m29392j(testBody);
        c4676b6.m29391i(jSONArrayOptJSONArray);
        c4676b6.m29390h(map);
        c4676b6.m29388f(strOptString2);
        c4676b6.m29389g(dApiTimeStringToDate);
        return c4676b6;
    }

    /* JADX INFO: renamed from: w */
    public final void m29376w() {
        m29325R(new wc40());
        m29325R(new ojb0());
    }
}
