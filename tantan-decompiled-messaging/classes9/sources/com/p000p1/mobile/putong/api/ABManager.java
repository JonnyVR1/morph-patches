package com.p000p1.mobile.putong.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import l.axm;
import l.du2;
import l.e51;
import l.exc0;
import l.gxc0;
import l.j760;
import l.jo0;
import l.k0g0;
import l.k850;
import l.ork;
import l.roj0;
import l.stc0;
import l.uqd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.C0959l2;
import p006l.ojb0;
import p006l.qib0;
import p006l.sh50;
import p006l.wc40;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0087\u0001«\u0001\b\u0005\u0080\u0001\u0085\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ'\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b&\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b'\u0010$J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b(\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b)\u0010$J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b*\u0010$J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0007¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u00020\u0007H\u0007¢\u0006\u0004\b-\u0010\tJ\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u00020.H\u0007¢\u0006\u0004\b3\u00101J%\u00107\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0013H\u0007¢\u0006\u0004\b9\u0010\u0003J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0013H\u0007¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u0013H\u0007¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u00020\u0019H\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0007¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0013H\u0007¢\u0006\u0004\bI\u0010\u0003J'\u0010M\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020AH\u0007¢\u0006\u0004\bM\u0010NJ\u0019\u0010Q\u001a\u00020\u00072\b\u0010P\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\u00132\u0006\u0010T\u001a\u00020S2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020S2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b[\u0010VJ\u001f\u0010\\\u001a\u00020\u00132\u0006\u0010T\u001a\u00020S2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\b\\\u0010ZJ\u001f\u0010^\u001a\u00020\u00132\u0006\u0010X\u001a\u00020W2\u0006\u0010K\u001a\u00020]H\u0007¢\u0006\u0004\b^\u0010_J#\u0010b\u001a\u0004\u0018\u0001042\u0006\u0010`\u001a\u00020\u00072\b\b\u0002\u0010a\u001a\u00020AH\u0002¢\u0006\u0004\bb\u0010cJ#\u0010f\u001a\u00020\u00192\b\u0010d\u001a\u0004\u0018\u0001042\b\u0010e\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\bf\u0010gJ\u0019\u0010i\u001a\u00020A2\b\b\u0001\u0010h\u001a\u00020\u0019H\u0007¢\u0006\u0004\bi\u0010CJ\u000f\u0010j\u001a\u00020AH\u0007¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00132\u0006\u0010l\u001a\u00020AH\u0007¢\u0006\u0004\bm\u0010nJ\u0017\u0010p\u001a\u00020\u00132\u0006\u0010o\u001a\u00020AH\u0007¢\u0006\u0004\bp\u0010nJ\u000f\u0010q\u001a\u00020AH\u0007¢\u0006\u0004\bq\u0010kJ\u000f\u0010r\u001a\u00020\u0013H\u0007¢\u0006\u0004\br\u0010\u0003J\u000f\u0010s\u001a\u00020\u0013H\u0007¢\u0006\u0004\bs\u0010\u0003J\u0019\u0010t\u001a\u00020\u00132\b\b\u0001\u0010h\u001a\u00020\u0019H\u0007¢\u0006\u0004\bt\u0010uJ+\u0010w\u001a\u0004\u0018\u00010\u00072\b\u0010v\u001a\u0004\u0018\u0001042\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\bw\u0010xJ\u001f\u0010z\u001a\u00020\u00132\u0006\u0010y\u001a\u0002042\u0006\u0010J\u001a\u00020\u0007H\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u0013H\u0002¢\u0006\u0004\b|\u0010\u0003J\u0017\u0010}\u001a\u00020\u00132\u0006\u0010K\u001a\u00020]H\u0007¢\u0006\u0004\b}\u0010~R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0083\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0083\u0001R\u001d\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u008b\u0001R\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008b\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u001e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020%0\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008b\u0001R\u0017\u0010l\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010MR\u0017\u0010\u0096\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0017\u0010\u0097\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u000bR\u001a\u0010\u0099\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b*\u0010\u0098\u0001R\u001a\u0010\u009a\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010\u0098\u0001R\u001a\u0010\u009b\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010\u0098\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u000bR\u0017\u0010\u009d\u0001\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010MR\u001f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009e\u0001\u0010\u0003\u001a\u0005\b\u008f\u0001\u0010\tR \u0010¢\u0001\u001a\u0004\u0018\u00010O8FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b¡\u0001\u0010\u0003\u001a\u0006\b\u0095\u0001\u0010 \u0001R\u001d\u0010¤\u0001\u001a\u00020\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b£\u0001\u0010\u0003\u001a\u0005\b\u0093\u0001\u0010\tR\u001d\u0010¦\u0001\u001a\u00020\u00078FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u0010\u0003\u001a\u0005\b\u0091\u0001\u0010\tR'\u0010ª\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010§\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b©\u0001\u0010\u0003\u001a\u0006\b\u008d\u0001\u0010¨\u0001¨\u0006¬\u0001"}, d2 = {"Lcom/p1/mobile/putong/api/ABManager;", "", "<init>", "()V", "Ll/uqd0;", "b", "()Ll/uqd0;", "", "e", "()Ljava/lang/String;", "c0", "I", "key", "i0", "(Ljava/lang/String;)Ljava/lang/String;", "b0", "j0", "Lcom/p1/mobile/putong/api/ABManager$d;", "abController", "", "R", "(Lcom/p1/mobile/putong/api/ABManager$d;)V", "h0", "ab_key", "property_key", "", "defaultVal", "A", "(Ljava/lang/String;Ljava/lang/String;I)I", "P", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "defaultString", "Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lrx/c;", "W", "()Lrx/c;", "Ll/roj0;", "m", "o", "L", "q", "n", "p", "r", "E", "Landroid/os/Bundle;", "outState", "K", "(Landroid/os/Bundle;)V", "savedInstanceState", "J", "Lcom/p1/mobile/putong/api/ABManager$b;", "oldGroup", "newGroup", "G", "(Lcom/p1/mobile/putong/api/ABManager$b;Lcom/p1/mobile/putong/api/ABManager$b;)Lcom/p1/mobile/putong/api/ABManager$b;", "D", "Landroid/content/Context;", "context", "V", "(Landroid/content/Context;)V", "x", "a0", "state", "", "v", "(I)Z", "Ll/k850$b;", "client", "f", "(Ll/k850$b;)Ll/k850$b;", "U", "T", "type", "mode", "oneIdTimeOut", "Z", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lorg/json/JSONArray;", "jsonArray", "l", "(Lorg/json/JSONArray;)Ljava/lang/String;", "Ll/stc0;", "request", "B", "(Ll/stc0;)Ll/stc0;", "Ll/exc0;", "response", "C", "(Ll/stc0;Ll/exc0;)V", "M", "N", "Lcom/p1/mobile/putong/api/ABManager$Mode;", "g0", "(Ll/exc0;Lcom/p1/mobile/putong/api/ABManager$Mode;)V", "testBody", "ignoreexpiredSince", "s", "(Ljava/lang/String;Z)Lcom/p1/mobile/putong/api/ABManager$b;", "oldItem", "newItem", "H", "(Lcom/p1/mobile/putong/api/ABManager$b;Lcom/p1/mobile/putong/api/ABManager$b;)I", "deviceABStatus", "y", "u", "()Z", "hasRequestUidAb", "X", "(Z)V", "hasUidOnNext", "Y", "z", "d0", "f0", "e0", "(I)V", "abGroups", "O", "(Lcom/p1/mobile/putong/api/ABManager$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "groups", "S", "(Lcom/p1/mobile/putong/api/ABManager$b;Ljava/lang/String;)V", "w", "F", "(Lcom/p1/mobile/putong/api/ABManager$Mode;)V", "", "a", "Ljava/util/List;", "controllers", "Ll/uqd0;", "abgroups_mode_device", "c", "abgroups_mode_uid", "d", "newAbgroups_mode_device", "newAbgroups_mode_uid", "Lrx/subjects/a;", "Lrx/subjects/a;", "restartBs", "g", "modeDeviceBs", "h", "oneIdDeviceBs", "i", "modeUserBs", "j", "modeUidBs", "k", "hasUidABOnNext", "INIT_STATE", "Lcom/p1/mobile/putong/api/ABManager$b;", "abGroupsUser", "abGroupsDevice", "abGroupsUid", "sDeviceABStatus", "hasInitABGroup", "getAbHeader$annotations", "abHeader", "()Lorg/json/JSONArray;", "getJSONAbNames$annotations", "jSONAbNames", "getDeviceABNames$annotations", "deviceABNames", "getAbNames$annotations", "abNames", "", "()Ljava/util/Set;", "getABGroupKeys$annotations", "aBGroupKeys", "Mode", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class ABManager {

    @NotNull
    public static final ABManager INSTANCE = new ABManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<InterfaceC0104d> controllers = new CopyOnWriteArrayList();

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
    public static final a<Integer> restartBs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final a<roj0> modeDeviceBs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final a<roj0> oneIdDeviceBs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final a<roj0> modeUserBs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static final a<roj0> modeUidBs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static volatile boolean hasRequestUidAb;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static volatile boolean hasUidABOnNext;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static volatile int INIT_STATE;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public static C0102b abGroupsUser;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public static C0102b abGroupsDevice;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public static C0102b abGroupsUid;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static volatile int sDeviceABStatus;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static volatile boolean hasInitABGroup;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/p1/mobile/putong/api/ABManager$Mode;", "", "mode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "user", "device", "uid", "toString", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Mode {
        user("user"),
        device("device"),
        uid("uid");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

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
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\u000bR.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/p1/mobile/putong/api/ABManager$a;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKey", "d", "(Ljava/lang/String;)V", "key", "b", "c", "f", "value", "", "Ljava/util/Map;", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "properties", "", "Z", "()Z", "e", "(Z)V", "restart", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0101a {

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
        public final Map<String, String> m1283a() {
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
        public final void m1286d(@Nullable String str) {
            this.key = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m1287e(boolean z) {
            this.restart = z;
        }

        /* JADX INFO: renamed from: f */
        public final void m1288f(@Nullable String str) {
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
                sb.append("\n");
            }
            return "        key => " + this.key + "\n        value => " + this.value + "\n        restart => " + this.restart + "\n        properties => \n" + ((Object) sb);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$b */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u0016\u0010\u000bR>\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u0018j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019`\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/p1/mobile/putong/api/ABManager$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "j", "(Ljava/lang/String;)V", "responseBody", "Lorg/json/JSONArray;", "b", "Lorg/json/JSONArray;", "d", "()Lorg/json/JSONArray;", "i", "(Lorg/json/JSONArray;)V", "names", "c", "f", "abHeader", "Ljava/util/HashMap;", "Lcom/p1/mobile/putong/api/ABManager$a;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "h", "(Ljava/util/HashMap;)V", "groupMap", "", "D", "getExpiredSince", "()D", "g", "(D)V", "expiredSince", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0102b {

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
        public HashMap<String, C0101a> groupMap = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public double expiredSince = Double.MAX_VALUE;

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m1289a() {
            String strValueOf;
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray = this.names;
            if (jSONArray == null) {
                strValueOf = "[]";
            } else {
                if ((jSONArray != null ? jSONArray.length() : 0) > 0) {
                    strValueOf = String.valueOf(this.names);
                } else {
                    strValueOf = "[]";
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
        public final HashMap<String, C0101a> m1291c() {
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
        public final void m1294f(@Nullable String str) {
            this.abHeader = str;
        }

        /* JADX INFO: renamed from: g */
        public final void m1295g(double d) {
            this.expiredSince = d;
        }

        /* JADX INFO: renamed from: h */
        public final void m1296h(@NotNull HashMap<String, C0101a> map) {
            map.getClass();
            this.groupMap = map;
        }

        /* JADX INFO: renamed from: i */
        public final void m1297i(@Nullable JSONArray jSONArray) {
            this.names = jSONArray;
        }

        /* JADX INFO: renamed from: j */
        public final void m1298j(@Nullable String str) {
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
                sb.append("\n");
            }
            JSONArray jSONArray = this.names;
            if (jSONArray == null || (string = jSONArray.toString()) == null) {
                string = "";
            }
            return b.i("\n   names => " + string + "\n   abHeader => " + this.abHeader + "\n   expiredSince => " + this.expiredSince + "\n   groups => \n   " + ((Object) sb) + "\n   ");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$c */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/api/ABManager$c;", "Ll/axm;", "<init>", "()V", "Ll/axm$a;", "chain", "Ll/exc0;", "intercept", "(Ll/axm$a;)Ll/exc0;", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0103c implements axm {
        @NotNull
        public exc0 intercept(@NotNull axm.a chain) throws IOException {
            chain.getClass();
            ABManager aBManager = ABManager.INSTANCE;
            stc0 stc0VarRequest = chain.request();
            stc0VarRequest.getClass();
            stc0 stc0VarM1272B = aBManager.m1272B(stc0VarRequest);
            exc0 exc0VarA = chain.a(stc0VarM1272B);
            exc0VarA.getClass();
            aBManager.m1273C(stc0VarM1272B, exc0VarA);
            return exc0VarA;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$d */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/api/ABManager$d;", "", "", "a", "()V", "b", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0104d {
        /* JADX INFO: renamed from: a */
        void mo1299a();

        /* JADX INFO: renamed from: b */
        void mo1300b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$e */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/p1/mobile/putong/api/ABManager$e;", "", "<init>", "()V", "Ll/stc0;", "req", "", "b", "(Ll/stc0;)V", "", "a", "Z", "sOneIdDeviceABValid", "()Z", "isOneIdDeviceABValid", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0105e {

        @NotNull
        public static final C0105e INSTANCE = new C0105e();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public static volatile boolean sOneIdDeviceABValid = true;

        /* JADX INFO: renamed from: a */
        public final boolean m1301a() {
            return sOneIdDeviceABValid && !TextUtils.isEmpty(sh50.m23745d());
        }

        /* JADX INFO: renamed from: b */
        public final void m1302b(@NotNull stc0 req) {
            req.getClass();
            if (TextUtils.isEmpty(req.k().A("oneid"))) {
                sOneIdDeviceABValid = false;
            } else {
                sOneIdDeviceABValid = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$f */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0106f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1085a;

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
            f1085a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$g */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/p1/mobile/putong/api/ABManager$g", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0107g extends TypeToken<List<? extends Object>> {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.api.ABManager$h */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/p1/mobile/putong/api/ABManager$h", "Lcom/google/gson/reflect/TypeToken;", "", "", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0108h extends TypeToken<List<? extends Object>> {
    }

    static {
        a<Integer> aVarB = a.b();
        aVarB.getClass();
        restartBs = aVarB;
        a<roj0> aVarB2 = a.b();
        aVarB2.getClass();
        modeDeviceBs = aVarB2;
        a<roj0> aVarB3 = a.b();
        aVarB3.getClass();
        oneIdDeviceBs = aVarB3;
        a<roj0> aVarB4 = a.b();
        aVarB4.getClass();
        modeUserBs = aVarB4;
        a<roj0> aVarB5 = a.b();
        aVarB5.getClass();
        modeUidBs = aVarB5;
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final int m1221A(@NotNull String ab_key, @NotNull String property_key, int defaultVal) {
        ab_key.getClass();
        property_key.getClass();
        try {
            String strM1278O = INSTANCE.m1278O(abGroupsUser, ab_key, property_key);
            if (strM1278O != null) {
                return Integer.parseInt(strM1278O);
            }
        } catch (NumberFormatException unused) {
        }
        return defaultVal;
    }

    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final synchronized void m1222D() {
        INIT_STATE = 1;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: E */
    public static final String m1223E() {
        C0102b c0102b = abGroupsUser;
        String strValueOf = c0102b == null ? "" : String.valueOf(c0102b);
        C0102b c0102b2 = abGroupsDevice;
        String strValueOf2 = c0102b2 == null ? "" : String.valueOf(c0102b2);
        C0102b c0102b3 = abGroupsUid;
        return strValueOf + strValueOf2 + (c0102b3 != null ? String.valueOf(c0102b3) : "");
    }

    @JvmStatic
    /* JADX INFO: renamed from: F */
    public static final void m1224F(@NotNull Mode mode) {
        String str;
        mode.getClass();
        try {
            Result.Companion companion = Result.Companion;
            int i = C0106f.f1085a[mode.ordinal()];
            if (i == 1) {
                str = (String) m1225I().get();
            } else if (i == 2) {
                str = (String) newAbgroups_mode_device.get();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = (String) newAbgroups_mode_uid.get();
            }
            ABManager aBManager = INSTANCE;
            str.getClass();
            C0102b c0102bM1281s = aBManager.m1281s(str, true);
            zvf0.D("e_clone_ab_info", "", new j760[]{new j760("clone_ab_info", aBManager.m1280l(c0102bM1281s != null ? c0102bM1281s.getNames() : null))});
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: I */
    public static final uqd0 m1225I() {
        return new uqd0(App.e, "newabgroups_user" + qib0.f19805c0.userId(), "ab_nerver_save");
    }

    @JvmStatic
    /* JADX INFO: renamed from: J */
    public static final synchronized void m1226J(@NotNull Bundle savedInstanceState) {
        try {
            savedInstanceState.getClass();
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsUser")) && (abGroupsUser == null || INIT_STATE == 0)) {
                ABManager aBManager = INSTANCE;
                Object obj = m1241b().get();
                obj.getClass();
                C0102b c0102bM1266t = m1266t(aBManager, (String) obj, false, 2, null);
                abGroupsUser = c0102bM1266t;
                Object obj2 = m1225I().get();
                obj2.getClass();
                abGroupsUser = aBManager.m1274G(c0102bM1266t, aBManager.m1281s((String) obj2, true));
                INIT_STATE = 1;
            }
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsDevice")) && abGroupsDevice == null) {
                ABManager aBManager2 = INSTANCE;
                C0102b c0102bM1266t2 = m1266t(aBManager2, m1247e(), false, 2, null);
                abGroupsDevice = c0102bM1266t2;
                Object obj3 = newAbgroups_mode_device.get();
                obj3.getClass();
                abGroupsDevice = aBManager2.m1274G(c0102bM1266t2, aBManager2.m1281s((String) obj3, true));
            }
            if (!TextUtils.isEmpty(savedInstanceState.getString("abGroupsUid")) && abGroupsUid == null) {
                ABManager aBManager3 = INSTANCE;
                C0102b c0102bM1266t3 = m1266t(aBManager3, m1244c0(), false, 2, null);
                abGroupsUid = c0102bM1266t3;
                Object obj4 = newAbgroups_mode_uid.get();
                obj4.getClass();
                abGroupsUid = aBManager3.m1274G(c0102bM1266t3, aBManager3.m1281s((String) obj4, true));
            }
            du2.a("[putong-common][ab]", "onRestoreAbGroupsInfo abGroupsUser = " + abGroupsUser + ", abGroupsDevice = " + abGroupsDevice + ", abGroupsUid = " + abGroupsUid);
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: K */
    public static final void m1227K(@NotNull Bundle outState) {
        outState.getClass();
        C0102b c0102b = abGroupsUser;
        if (c0102b != null) {
            c0102b.getClass();
            if (!TextUtils.isEmpty(c0102b.getResponseBody())) {
                outState.putString("abGroupsUser", "abGroupsUser.responseBody");
            }
        }
        C0102b c0102b2 = abGroupsDevice;
        if (c0102b2 != null) {
            c0102b2.getClass();
            if (!TextUtils.isEmpty(c0102b2.getResponseBody())) {
                outState.putString("abGroupsDevice", "abGroupsDevice.responseBody");
            }
        }
        C0102b c0102b3 = abGroupsUid;
        if (c0102b3 != null) {
            c0102b3.getClass();
            if (TextUtils.isEmpty(c0102b3.getResponseBody())) {
                return;
            }
            outState.putString("abGroupsUid", "abGroupsUid.responseBody");
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: L */
    public static final c<roj0> m1228L() {
        c<roj0> cVarObserveOn = oneIdDeviceBs.onBackpressureLatest().observeOn(jo0.a());
        cVarObserveOn.getClass();
        return cVarObserveOn;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: P */
    public static final String m1229P(@NotNull String ab_key, @NotNull String property_key) {
        ab_key.getClass();
        property_key.getClass();
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: Q */
    public static final String m1230Q(@NotNull String ab_key, @NotNull String property_key, @Nullable String defaultString) {
        ab_key.getClass();
        property_key.getClass();
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: R */
    public static final void m1231R(@Nullable InterfaceC0104d abController) {
        if (abController != null) {
            if (hasInitABGroup) {
                abController.mo1299a();
            }
            controllers.add(abController);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: T */
    public static final synchronized void m1232T() {
        try {
            INIT_STATE = 0;
            modeUserBs.onNext(roj0.a);
            Iterator<InterfaceC0104d> it = controllers.iterator();
            while (it.hasNext()) {
                it.next().mo1300b();
            }
            du2.a("[putong-common][ab]", "resetAllAb");
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: U */
    public static final synchronized void m1233U() {
        m1241b().clear();
        abgroups_mode_uid.clear();
        abGroupsUser = null;
        abGroupsUid = null;
        du2.a("[putong-common][ab]", "resetUserAb");
    }

    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final void m1234V(@NotNull Context context) {
        context.getClass();
        restartBs.onNext(0);
        m1268v(3);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.getClass();
        launchIntentForPackage.addFlags(268468224);
        context.startActivity(launchIntentForPackage);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: W */
    public static final c<Integer> m1235W() {
        return restartBs;
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final void m1236X(boolean hasRequestUidAb2) {
        hasRequestUidAb = hasRequestUidAb2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y */
    public static final void m1237Y(boolean hasUidOnNext) {
        hasUidABOnNext = hasUidOnNext;
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final void m1238Z(@NotNull String type, @NotNull String mode, boolean oneIdTimeOut) {
        type.getClass();
        mode.getClass();
        zvf0.B("e_ab_report", "", new j760[]{new j760("ab_type", type), new j760("ab_mode", mode), new j760("oneid_timeout", Boolean.valueOf(oneIdTimeOut))});
    }

    /* JADX INFO: renamed from: a */
    public static void m1239a(int i) {
        restartBs.onNext(Integer.valueOf(i));
    }

    @JvmStatic
    /* JADX INFO: renamed from: a0 */
    public static final void m1240a0() {
        try {
            ABManager aBManager = INSTANCE;
            Object obj = m1241b().get();
            obj.getClass();
            C0102b c0102bM1266t = m1266t(aBManager, (String) obj, false, 2, null);
            abGroupsUser = c0102bM1266t;
            Object obj2 = m1225I().get();
            obj2.getClass();
            C0102b c0102bM1274G = aBManager.m1274G(c0102bM1266t, aBManager.m1281s((String) obj2, true));
            abGroupsUser = c0102bM1274G;
            if (c0102bM1274G != null) {
                Iterator<InterfaceC0104d> it = controllers.iterator();
                while (it.hasNext()) {
                    it.next().mo1299a();
                }
            }
            du2.a("[putong-common][ab]", "tryInitUserAbInApplication abGroupsUser = " + abGroupsUser);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final uqd0 m1241b() {
        return new uqd0(App.e, "abgroups" + qib0.f19805c0.userId(), "ab_nerver_save");
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b0 */
    public static final String m1242b0(@NotNull String key) {
        HashMap<String, C0101a> mapM1291c;
        C0101a c0101a;
        String value;
        key.getClass();
        C0102b c0102b = abGroupsUid;
        return (c0102b == null || (mapM1291c = c0102b.m1291c()) == null || (c0101a = mapM1291c.get(key)) == null || (value = c0101a.getValue()) == null) ? "" : value;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c0 */
    public static final String m1244c0() {
        Object obj = abgroups_mode_uid.get();
        obj.getClass();
        return (String) obj;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d0 */
    public static final void m1246d0() {
        ABManager aBManager = INSTANCE;
        Object obj = abgroups_mode_device.get();
        obj.getClass();
        C0102b c0102bM1266t = m1266t(aBManager, (String) obj, false, 2, null);
        abGroupsDevice = c0102bM1266t;
        Object obj2 = newAbgroups_mode_device.get();
        obj2.getClass();
        C0102b c0102bM1274G = aBManager.m1274G(c0102bM1266t, aBManager.m1281s((String) obj2, true));
        abGroupsDevice = c0102bM1274G;
        du2.a("[putong-common][ab]", "tryInitDeviceGroupUseOld abGroupsDevice = " + c0102bM1274G);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m1247e() {
        Object obj = abgroups_mode_device.get();
        obj.getClass();
        return (String) obj;
    }

    @JvmStatic
    /* JADX INFO: renamed from: e0 */
    public static final synchronized void m1248e0(int deviceABStatus) {
        sDeviceABStatus = deviceABStatus;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final k850.b m1249f(@NotNull k850.b client) {
        client.getClass();
        INSTANCE.m1282w();
        k850.b bVarA = client.a(new C0103c());
        bVarA.getClass();
        return bVarA;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f0 */
    public static final void m1250f0() {
        ABManager aBManager = INSTANCE;
        Object obj = abgroups_mode_uid.get();
        obj.getClass();
        C0102b c0102bM1266t = m1266t(aBManager, (String) obj, false, 2, null);
        abGroupsUid = c0102bM1266t;
        Object obj2 = newAbgroups_mode_uid.get();
        obj2.getClass();
        C0102b c0102bM1274G = aBManager.m1274G(c0102bM1266t, aBManager.m1281s((String) obj2, true));
        abGroupsUid = c0102bM1274G;
        du2.a("[putong-common][ab]", "tryInitUidGroupUseOld abGroupsUid = " + c0102bM1274G);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Set<String> m1251g() {
        C0102b c0102b;
        HashMap<String, C0101a> mapM1291c;
        C0102b c0102b2 = abGroupsUser;
        if ((c0102b2 != null ? c0102b2.m1291c() : null) == null || (c0102b = abGroupsUser) == null || (mapM1291c = c0102b.m1291c()) == null) {
            return null;
        }
        return mapM1291c.keySet();
    }

    @JvmStatic
    /* JADX INFO: renamed from: g0 */
    public static final void m1252g0(@NotNull exc0 response, @NotNull Mode mode) {
        response.getClass();
        mode.getClass();
        if (response.I()) {
            String strM18502K = "";
            try {
                gxc0 gxc0VarK = response.k();
                strM18502K = C0959l2.m18502K(gxc0VarK != null ? gxc0VarK.string() : null);
                Objects.toString(mode);
            } catch (IOException e) {
                CrashHelper.c(e);
            }
            if (mode == Mode.user) {
                m1225I().put(strM18502K);
            } else if (mode == Mode.device) {
                newAbgroups_mode_device.put(strM18502K);
            } else if (mode == Mode.uid) {
                newAbgroups_mode_uid.put(strM18502K);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m1253h() {
        if (qib0.f19805c0.getAuthData().b() == null) {
            C0102b c0102b = abGroupsDevice;
            if (c0102b == null || c0102b == null) {
                return null;
            }
            return c0102b.getAbHeader();
        }
        if (abGroupsUser == null) {
            return "";
        }
        if (qib0.f19805c0.signedIn_()) {
            C0102b c0102b2 = abGroupsUser;
            if (c0102b2 != null) {
                return c0102b2.getAbHeader();
            }
            return null;
        }
        C0102b c0102b3 = abGroupsUid;
        if (c0102b3 != null) {
            return c0102b3.getAbHeader();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h0 */
    public static final String m1254h0(@Nullable String key) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m1255i() {
        JSONArray jSONArrayM1259k = m1259k();
        return jSONArrayM1259k == null ? "" : INSTANCE.m1280l(jSONArrayM1259k);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i0 */
    public static final String m1256i0(@Nullable String key) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m1257j() {
        JSONArray names;
        C0102b c0102b = abGroupsDevice;
        if (c0102b != null) {
            c0102b.getClass();
            names = c0102b.getNames();
        } else {
            names = null;
        }
        return names == null ? "" : INSTANCE.m1280l(names);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j0 */
    public static final String m1258j0(@NotNull String key) {
        HashMap<String, C0101a> mapM1291c;
        C0101a c0101a;
        String value;
        key.getClass();
        C0102b c0102b = abGroupsUser;
        return (c0102b == null || (mapM1291c = c0102b.m1291c()) == null || (c0101a = mapM1291c.get(key)) == null || (value = c0101a.getValue()) == null) ? "" : value;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static final JSONArray m1259k() {
        if (qib0.f19805c0.getAuthData().b() == null) {
            C0102b c0102b = abGroupsDevice;
            if (c0102b == null) {
                return null;
            }
            c0102b.getClass();
            return c0102b.getNames();
        }
        if (qib0.f19805c0.signedIn_()) {
            C0102b c0102b2 = abGroupsUser;
            if (c0102b2 == null) {
                return null;
            }
            c0102b2.getClass();
            return c0102b2.getNames();
        }
        C0102b c0102b3 = abGroupsUid;
        if (c0102b3 == null) {
            return null;
        }
        c0102b3.getClass();
        return c0102b3.getNames();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final c<roj0> m1260m() {
        c<roj0> cVarObserveOn = modeDeviceBs.onBackpressureLatest().observeOn(jo0.a());
        cVarObserveOn.getClass();
        return cVarObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final c<roj0> m1261n() {
        c<roj0> cVarObserveOn = modeDeviceBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        cVarObserveOn.getClass();
        return cVarObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final c<roj0> m1262o() {
        c<roj0> cVarObserveOn = modeUidBs.onBackpressureLatest().observeOn(jo0.a());
        cVarObserveOn.getClass();
        return cVarObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final c<roj0> m1263p() {
        c<roj0> cVarObserveOn = modeUidBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        cVarObserveOn.getClass();
        return cVarObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final c<roj0> m1264q() {
        c<roj0> cVarObserveOn = modeUserBs.onBackpressureLatest().observeOn(jo0.a());
        cVarObserveOn.getClass();
        return cVarObserveOn;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final c<roj0> m1265r() {
        c<roj0> cVarObserveOn = modeUserBs.onBackpressureLatest().observeOn(Schedulers.trampoline());
        cVarObserveOn.getClass();
        return cVarObserveOn;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C0102b m1266t(ABManager aBManager, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return aBManager.m1281s(str, z);
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final boolean m1267u() {
        return hasRequestUidAb;
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final synchronized boolean m1268v(int state) {
        try {
            du2.a("[putong-common][ab]", "initAbGroup , state = " + state);
            try {
                if (INIT_STATE + state == 3) {
                    return false;
                }
                INIT_STATE = state;
                ABManager aBManager = INSTANCE;
                Object obj = m1241b().get();
                obj.getClass();
                C0102b c0102bM1266t = m1266t(aBManager, (String) obj, false, 2, null);
                abGroupsUser = c0102bM1266t;
                Object obj2 = m1225I().get();
                obj2.getClass();
                abGroupsUser = aBManager.m1274G(c0102bM1266t, aBManager.m1281s((String) obj2, true));
                RemoteConfig.c0();
                modeUserBs.onNext(roj0.a);
                C0102b c0102b = abGroupsUser;
                if (c0102b != null) {
                    c0102b.getClass();
                    c0102b.getAbHeader();
                    Iterator<InterfaceC0104d> it = controllers.iterator();
                    while (it.hasNext()) {
                        it.next().mo1299a();
                    }
                    hasInitABGroup = true;
                    ABManager aBManager2 = INSTANCE;
                    C0102b c0102b2 = abGroupsUser;
                    c0102b2.getClass();
                    aBManager2.m1279S(c0102b2, "user");
                    C0959l2 c0959l2 = qib0.f19793Q;
                    C0102b c0102b3 = abGroupsUser;
                    c0102b3.getClass();
                    c0959l2.m18521W(c0102b3.m1289a());
                }
                du2.a("[putong-common][ab]", "initAbGroup abGroupsUser = " + abGroupsUser + ", state = " + state);
            } catch (Exception e) {
                CrashHelper.c(new Exception("ABManager initAbGroup:" + e.getMessage(), e));
                du2.a("[putong-common][ab]", "initAbGroup error : e = " + e.getMessage());
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: x */
    public static final void m1269x() {
        IntlCountryCodeController.m4e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final synchronized boolean m1270y(int deviceABStatus) {
        boolean z;
        try {
            z = false;
            if (sDeviceABStatus != 2) {
                ABManager aBManager = INSTANCE;
                Object obj = abgroups_mode_device.get();
                obj.getClass();
                C0102b c0102bM1266t = m1266t(aBManager, (String) obj, false, 2, null);
                abGroupsDevice = c0102bM1266t;
                Object obj2 = newAbgroups_mode_device.get();
                obj2.getClass();
                abGroupsDevice = aBManager.m1274G(c0102bM1266t, aBManager.m1281s((String) obj2, true));
                if (sDeviceABStatus == 0 || deviceABStatus != 2) {
                    a<roj0> aVar = modeDeviceBs;
                    roj0 roj0Var = roj0.a;
                    aVar.onNext(roj0Var);
                    if (C0105e.INSTANCE.m1301a()) {
                        oneIdDeviceBs.onNext(roj0Var);
                    }
                    C0102b c0102b = abGroupsDevice;
                    if (c0102b != null) {
                        c0102b.getClass();
                        aBManager.m1279S(c0102b, "device");
                        C0959l2 c0959l2 = qib0.f19793Q;
                        C0102b c0102b2 = abGroupsDevice;
                        c0102b2.getClass();
                        c0959l2.m18521W(c0102b2.m1289a());
                    }
                    du2.a("[putong-common][ab]", "initPreSignInDeviceGroup abGroupsDevice = " + abGroupsDevice);
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
    public static final boolean m1271z() {
        m1250f0();
        if (hasUidABOnNext) {
            return false;
        }
        modeUidBs.onNext(roj0.a);
        m1237Y(true);
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final stc0 m1272B(stc0 request) {
        if (ABHeaderControl.NO_AB_HEADER == request.j(ABHeaderControl.class)) {
            return request;
        }
        try {
            return m1276M(request);
        } catch (Exception e) {
            CrashHelper.c(new Exception("ABManager interceptRequest:" + e.getMessage(), e));
            return request;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m1273C(stc0 request, exc0 response) {
        try {
            m1277N(request, response);
        } catch (Exception e) {
            CrashHelper.c(new Exception("ABManager interceptRespose:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: G */
    public final C0102b m1274G(C0102b oldGroup, C0102b newGroup) {
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
                    oldGroup.m1291c().putAll(newGroup.m1291c());
                    try {
                        Result.Companion companion = Result.Companion;
                        Object objC = ork.c(oldGroup.getAbHeader(), new C0108h().getType());
                        objC.getClass();
                        Object objC2 = ork.c(newGroup.getAbHeader(), new C0107g().getType());
                        objC2.getClass();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll((List) objC);
                        arrayList.addAll((List) objC2);
                        oldGroup.m1294f(ork.d(arrayList));
                        Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        Result.constructor-impl(ResultKt.a(th));
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
                        oldGroup.m1297i(newGroup.getNames());
                    }
                }
            }
        }
        return oldGroup;
    }

    /* JADX INFO: renamed from: H */
    public final int m1275H(C0102b oldItem, C0102b newItem) {
        if (oldItem != null) {
            for (String str : oldItem.m1291c().keySet()) {
                str.getClass();
                String str2 = str;
                C0101a c0101a = oldItem.m1291c().get(str2);
                c0101a.getClass();
                if (c0101a.getRestart() && (newItem == null || !newItem.m1291c().containsKey(str2))) {
                    return 2;
                }
            }
        }
        if (newItem == null) {
            return 0;
        }
        for (String str3 : newItem.m1291c().keySet()) {
            str3.getClass();
            String str4 = str3;
            C0101a c0101a2 = newItem.m1291c().get(str4);
            c0101a2.getClass();
            if (c0101a2.getRestart() && (oldItem == null || !oldItem.m1291c().containsKey(str4))) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public final stc0 m1276M(stc0 request) {
        String abHeader;
        String abHeader2;
        String abHeader3;
        String abHeader4;
        String str = "";
        if (qib0.f19805c0.getAuthData().b() == null) {
            C0102b c0102b = abGroupsDevice;
            if (!TextUtils.isEmpty(c0102b != null ? c0102b.getAbHeader() : null)) {
                stc0.a aVarH = request.h();
                C0102b c0102b2 = abGroupsDevice;
                if (c0102b2 != null && (abHeader4 = c0102b2.getAbHeader()) != null) {
                    str = abHeader4;
                }
                stc0 stc0VarB = aVarH.h("X-Testing-Group", str).b();
                stc0VarB.getClass();
                return stc0VarB;
            }
        } else {
            C0102b c0102b3 = abGroupsUser;
            if (!TextUtils.isEmpty(c0102b3 != null ? c0102b3.getAbHeader() : null)) {
                stc0.a aVarH2 = request.h();
                C0102b c0102b4 = abGroupsUser;
                if (c0102b4 != null && (abHeader3 = c0102b4.getAbHeader()) != null) {
                    str = abHeader3;
                }
                stc0 stc0VarB2 = aVarH2.h("X-Testing-Group", str).b();
                stc0VarB2.getClass();
                return stc0VarB2;
            }
            if (!((Boolean) TantanApp.f1170d.b()).booleanValue()) {
                C0102b c0102b5 = abGroupsUid;
                if (!TextUtils.isEmpty(c0102b5 != null ? c0102b5.getAbHeader() : null)) {
                    stc0.a aVarH3 = request.h();
                    C0102b c0102b6 = abGroupsUid;
                    if (c0102b6 != null && (abHeader2 = c0102b6.getAbHeader()) != null) {
                        str = abHeader2;
                    }
                    stc0 stc0VarB3 = aVarH3.h("X-Testing-Group", str).b();
                    stc0VarB3.getClass();
                    return stc0VarB3;
                }
                C0102b c0102b7 = abGroupsDevice;
                if (!TextUtils.isEmpty(c0102b7 != null ? c0102b7.getAbHeader() : null)) {
                    stc0.a aVarH4 = request.h();
                    C0102b c0102b8 = abGroupsDevice;
                    if (c0102b8 != null && (abHeader = c0102b8.getAbHeader()) != null) {
                        str = abHeader;
                    }
                    stc0 stc0VarB4 = aVarH4.h("X-Testing-Group", str).b();
                    stc0VarB4.getClass();
                    return stc0VarB4;
                }
            }
        }
        return request;
    }

    /* JADX INFO: renamed from: N */
    public final void m1277N(stc0 request, exc0 response) {
        final int iM1275H;
        if (request.i() != null && response.I() && StringsKt.P(String.valueOf(request.i()), "X-Testing-Group-V2-Tag", false, 2, (Object) null)) {
            String strM18502K = "";
            try {
                gxc0 gxc0VarK = response.k();
                gxc0VarK.getClass();
                strM18502K = C0959l2.m18502K(gxc0VarK.string());
            } catch (IOException e) {
                CrashHelper.c(e);
            }
            qib0.f19784H.updateServerTime(response.u("Date"));
            if (Intrinsics.d(request.i(), "X-Testing-Group-V2-Tag" + Mode.user)) {
                m1238Z("response", "user", false);
                m1241b().put(strM18502K);
                du2.a("[putong-common][ab]", "initAbUser : " + strM18502K);
                strM18502K.getClass();
                C0102b c0102bM1266t = m1266t(this, strM18502K, false, 2, null);
                c0102bM1266t.getClass();
                c0102bM1266t.getAbHeader();
                if (INIT_STATE == 0 || (iM1275H = m1275H(abGroupsUser, c0102bM1266t)) == 0) {
                    return;
                }
                e51.M(new Runnable() { // from class: l.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ABManager.m1239a(iM1275H);
                    }
                });
                return;
            }
            if (Intrinsics.d(request.i(), "X-Testing-Group-V2-Tag" + Mode.device)) {
                C0105e c0105e = C0105e.INSTANCE;
                c0105e.m1302b(request);
                if (c0105e.m1301a()) {
                    m1238Z("response", "oneid", false);
                } else {
                    m1238Z("response", "deviceid", false);
                }
                abgroups_mode_device.put(strM18502K);
                du2.a("[putong-common][ab]", "initAbDevice : " + strM18502K);
                return;
            }
            if (Intrinsics.d(request.i(), "X-Testing-Group-V2-Tag" + Mode.uid)) {
                m1238Z("response", "uid", false);
                abgroups_mode_uid.put(strM18502K);
                du2.a("[putong-common][ab]", "initAbUid : " + strM18502K);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m1278O(C0102b abGroups, String ab_key, String property_key) {
        HashMap<String, C0101a> mapM1291c;
        HashMap<String, C0101a> mapM1291c2;
        C0101a c0101a;
        Map<String, String> mapM1283a;
        if (abGroups == null || (mapM1291c = abGroups.m1291c()) == null || !mapM1291c.containsKey(ab_key) || abGroups == null || (mapM1291c2 = abGroups.m1291c()) == null || (c0101a = mapM1291c2.get(ab_key)) == null || (mapM1283a = c0101a.m1283a()) == null) {
            return null;
        }
        return mapM1283a.get(property_key);
    }

    /* JADX INFO: renamed from: S */
    public final void m1279S(C0102b groups, String type) {
        if (groups.m1291c() == null || groups.m1291c().size() <= 0 || !TextUtils.isEmpty(groups.getAbHeader())) {
            return;
        }
        CrashHelper.c(new Throwable("HeaderNull " + type + "  group = " + groups.m1291c() + " header = " + groups.getAbHeader()));
    }

    /* JADX INFO: renamed from: l */
    public final String m1280l(JSONArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    arrayList.add(jsonArray.optString(i));
                } catch (JSONException e) {
                    CrashHelper.c(e);
                }
            }
        }
        String strJoin = TextUtils.join(",", arrayList);
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
    public final C0102b m1281s(String testBody, boolean ignoreexpiredSince) {
        C0102b c0102b;
        String strOptString;
        String str;
        JSONObject jSONObject;
        double d;
        boolean z;
        List listEmptyList;
        String str2 = "restart";
        JSONArray jSONArrayOptJSONArray = null;
        if (Intrinsics.d("ab_nerver_save", testBody)) {
            return null;
        }
        HashMap<String, C0101a> map = new HashMap<>();
        String strOptString2 = "[]";
        double dApiTimeStringToDate = Double.MAX_VALUE;
        if (k0g0.b(testBody)) {
            c0102b = null;
            strOptString2 = "[]";
            jSONArrayOptJSONArray = null;
        } else {
            du2.a("[putong-common][ab]", "real_ab_test_data:" + testBody);
            try {
                JSONObject jSONObject2 = new JSONObject(testBody);
                dApiTimeStringToDate = Converter.apiTimeStringToDate(jSONObject2.optString("expiredSince"));
                if (ignoreexpiredSince || dApiTimeStringToDate > qib0.f19784H.guessedCurrentServerTime()) {
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
                                    c0102b = null;
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    strOptString2 = strOptString2;
                                    CrashHelper.c(new Exception(b.i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                    strOptString2 = strOptString2;
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    if (Intrinsics.d(testBody, "ab_nerver_save")) {
                                        return c0102b;
                                    }
                                    C0102b c0102b2 = new C0102b();
                                    c0102b2.m1298j(testBody);
                                    c0102b2.m1297i(jSONArrayOptJSONArray);
                                    c0102b2.m1296h(map);
                                    c0102b2.m1294f(strOptString2);
                                    c0102b2.m1295g(dApiTimeStringToDate);
                                    return c0102b2;
                                }
                            }
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("groups");
                                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("properties");
                                Iterator<String> itKeys = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.keys() : null;
                                while (itKeys != null && itKeys.hasNext() == z2) {
                                    C0101a c0101a = new C0101a();
                                    String next = itKeys.next();
                                    next.getClass();
                                    String str3 = next;
                                    if (jSONObjectOptJSONObject != null) {
                                        try {
                                            strOptString = jSONObjectOptJSONObject.optString(str3);
                                        } catch (JSONException e2) {
                                            e = e2;
                                            c0102b = null;
                                            CrashHelper.c(new Exception(b.i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                            strOptString2 = strOptString2;
                                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            if (Intrinsics.d(testBody, "ab_nerver_save")) {
                                                return c0102b;
                                            }
                                            C0102b c0102b3 = new C0102b();
                                            c0102b3.m1298j(testBody);
                                            c0102b3.m1297i(jSONArrayOptJSONArray);
                                            c0102b3.m1296h(map);
                                            c0102b3.m1294f(strOptString2);
                                            c0102b3.m1295g(dApiTimeStringToDate);
                                            return c0102b3;
                                        }
                                    } else {
                                        strOptString = null;
                                    }
                                    c0101a.m1286d(str3);
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
                                                    if (Intrinsics.d(str4, str2)) {
                                                        c0101a.m1287e(jSONObjectOptJSONObject3.getBoolean(str2));
                                                    } else {
                                                        c0101a.m1283a().put(str4, jSONObjectOptJSONObject3.optString(str4));
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
                                            c0102b = null;
                                            CrashHelper.c(new Exception(b.i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                                            strOptString2 = strOptString2;
                                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            if (Intrinsics.d(testBody, "ab_nerver_save")) {
                                                return c0102b;
                                            }
                                            C0102b c0102b4 = new C0102b();
                                            c0102b4.m1298j(testBody);
                                            c0102b4.m1297i(jSONArrayOptJSONArray);
                                            c0102b4.m1296h(map);
                                            c0102b4.m1294f(strOptString2);
                                            c0102b4.m1295g(dApiTimeStringToDate);
                                            return c0102b4;
                                        }
                                    } else {
                                        str = str2;
                                        jSONObject = jSONObjectOptJSONObject2;
                                        d = dApiTimeStringToDate;
                                    }
                                    if (strOptString != null) {
                                        if (StringsKt.P(strOptString, ":", false, 2, (Object) null)) {
                                            List listSplit = new Regex(":").split(strOptString, 0);
                                            if (!listSplit.isEmpty()) {
                                                ListIterator listIterator = listSplit.listIterator(listSplit.size());
                                                while (true) {
                                                    if (!listIterator.hasPrevious()) {
                                                        listEmptyList = CollectionsKt.emptyList();
                                                        break;
                                                    }
                                                    if (((String) listIterator.previous()).length() != 0) {
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
                                                c0101a.m1288f(strArr[1]);
                                                map.put(str3, c0101a);
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
                                    c0101a.m1288f(strOptString);
                                    map.put(str3, c0101a);
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
                                c0102b = null;
                            } catch (JSONException e4) {
                                e = e4;
                            }
                        } catch (JSONException e5) {
                            e = e5;
                            strOptString2 = strOptString2;
                            c0102b = null;
                            jSONArrayOptJSONArray = null;
                            CrashHelper.c(new Exception(b.i("\n                    ABManager handleAbJson:" + e.getMessage() + "\n                    testBody=" + testBody + "\n                    "), e));
                            strOptString2 = strOptString2;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            if (Intrinsics.d(testBody, "ab_nerver_save")) {
                                return c0102b;
                            }
                            C0102b c0102b5 = new C0102b();
                            c0102b5.m1298j(testBody);
                            c0102b5.m1297i(jSONArrayOptJSONArray);
                            c0102b5.m1296h(map);
                            c0102b5.m1294f(strOptString2);
                            c0102b5.m1295g(dApiTimeStringToDate);
                            return c0102b5;
                        }
                    } catch (JSONException e6) {
                        e = e6;
                    }
                } else {
                    c0102b = null;
                    strOptString2 = "[]";
                    jSONArrayOptJSONArray = null;
                }
            } catch (JSONException e7) {
                e = e7;
                c0102b = null;
            }
        }
        if (Intrinsics.d(testBody, "ab_nerver_save")) {
            return c0102b;
        }
        C0102b c0102b6 = new C0102b();
        c0102b6.m1298j(testBody);
        c0102b6.m1297i(jSONArrayOptJSONArray);
        c0102b6.m1296h(map);
        c0102b6.m1294f(strOptString2);
        c0102b6.m1295g(dApiTimeStringToDate);
        return c0102b6;
    }

    /* JADX INFO: renamed from: w */
    public final void m1282w() {
        m1231R(new wc40());
        m1231R(new ojb0());
    }
}
