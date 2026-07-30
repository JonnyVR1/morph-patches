package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.C1580h;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.internal.C1680e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.vivo.push.PushClientConstants;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15493d;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p153l.ay90;
import p153l.c4s;
import p153l.g0l0;
import p153l.lmk0;
import p153l.mmk0;
import p153l.p7f;
import p153l.wtq0;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.internal.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001lB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0012J!\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ!\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010%\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020\"2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b-\u0010.J+\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\"2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020,2\b\u00107\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:H\u0007¢\u0006\u0004\b<\u0010=J#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010@2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0@2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bC\u0010BJ-\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010Fj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`G2\b\u0010E\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bH\u0010IJ\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\t0J2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bK\u0010LJ-\u0010N\u001a\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020>2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010M\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\bN\u0010OJ\u0019\u0010R\u001a\u00020\t2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0007¢\u0006\u0004\bR\u0010SJ!\u0010W\u001a\u00020V2\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010U\u001a\u00020TH\u0007¢\u0006\u0004\bW\u0010XJ\u001f\u0010Z\u001a\u00020,2\u0006\u0010;\u001a\u00020:2\u0006\u0010Y\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020,2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b\\\u0010]J)\u0010b\u001a\u00020,2\b\u0010^\u001a\u0004\u0018\u00010\t2\u000e\u0010a\u001a\n\u0018\u00010_j\u0004\u0018\u0001``H\u0007¢\u0006\u0004\bb\u0010cJ#\u0010e\u001a\u00020,2\b\u0010^\u001a\u0004\u0018\u00010\t2\b\u0010d\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\be\u0010fJ-\u0010i\u001a\u00020,2\b\u0010^\u001a\u0004\u0018\u00010\t2\b\u0010d\u001a\u0004\u0018\u00010\t2\b\u0010h\u001a\u0004\u0018\u00010gH\u0007¢\u0006\u0004\bi\u0010jJ)\u0010a\u001a\u00020\u0006\"\u0004\b\u0000\u0010k2\b\u0010l\u001a\u0004\u0018\u00018\u00002\b\u0010*\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\ba\u0010mJ\u001d\u0010n\u001a\b\u0012\u0004\u0012\u00020\t0J2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bn\u0010LJ\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020\t0o2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bp\u0010qJ'\u0010s\u001a\u00020\t2\u0016\u0010r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0@H\u0007¢\u0006\u0004\bs\u0010tJ#\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0@2\u0006\u0010u\u001a\u00020\tH\u0007¢\u0006\u0004\bv\u0010wJ;\u0010}\u001a\u00020,2\u0006\u0010x\u001a\u00020>2\b\u0010z\u001a\u0004\u0018\u00010y2\b\u0010{\u001a\u0004\u0018\u00010\t2\u0006\u0010|\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b}\u0010~J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0005\b\u007f\u0010\u0080\u0001J#\u0010\u0082\u0001\u001a\u00020,2\u0006\u0010x\u001a\u00020>2\u0007\u0010\u0081\u0001\u001a\u00020:H\u0007¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JP\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00012\f\u0010\u0085\u0001\u001a\u0007\u0012\u0002\b\u00030\u0084\u00012\u0007\u0010\u0086\u0001\u001a\u00020\t2\"\u0010\u0088\u0001\u001a\u0012\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u00010\u0087\u0001\"\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001H\u0007¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001JK\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008c\u0001\u001a\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\t2\"\u0010\u0088\u0001\u001a\u0012\u0012\r\b\u0001\u0012\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u00010\u0087\u0001\"\t\u0012\u0002\b\u0003\u0018\u00010\u0084\u0001H\u0007¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JA\u0010k\u001a\u0004\u0018\u00010\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\u0090\u0001\u001a\u00030\u0089\u00012\u0018\u0010\u0091\u0001\u001a\r\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0087\u0001\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0005\bk\u0010\u0092\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:H\u0007¢\u0006\u0005\b\u0093\u0001\u0010=J\u001d\u0010\u0095\u0001\u001a\u00020\u00062\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001d\u0010\u0097\u0001\u001a\u00020\u00062\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u001d\u0010\u0098\u0001\u001a\u00020\u00062\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u0096\u0001J\u001c\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u0099\u0001\u001a\u00020$H\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J3\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009d\u00012\b\u0010/\u001a\u0004\u0018\u00010\"2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J6\u0010£\u0001\u001a\u00020,2\b\u0010¢\u0001\u001a\u00030¡\u00012\u0018\u0010r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010@H\u0007¢\u0006\u0006\b£\u0001\u0010¤\u0001J.\u0010¥\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010@2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0007¢\u0006\u0006\b¥\u0001\u0010¦\u0001J2\u0010§\u0001\u001a\u00020,2\b\u0010¢\u0001\u001a\u00030¡\u00012\u0014\u0010r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010@H\u0007¢\u0006\u0006\b§\u0001\u0010¤\u0001J*\u0010¨\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010@2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0007¢\u0006\u0006\b¨\u0001\u0010¦\u0001J\u001e\u0010«\u0001\u001a\u00020\u00062\n\u0010ª\u0001\u001a\u0005\u0018\u00010©\u0001H\u0007¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001c\u0010®\u0001\u001a\u00020\t2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0005\b®\u0001\u0010\u0012J%\u0010²\u0001\u001a\u00020,2\u0007\u0010¯\u0001\u001a\u00020\t2\b\u0010±\u0001\u001a\u00030°\u0001H\u0007¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001d\u0010´\u0001\u001a\u0004\u0018\u00010>2\u0007\u0010¯\u0001\u001a\u00020\tH\u0007¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001c\u0010·\u0001\u001a\u00030¶\u00012\u0007\u0010¯\u0001\u001a\u00020\tH\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001c\u0010º\u0001\u001a\u00020\t2\t\u0010¹\u0001\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0005\bº\u0001\u0010\u0012J\u0014\u0010»\u0001\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0006\b»\u0001\u0010\u0080\u0001J\u0012\u0010¼\u0001\u001a\u00020VH\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001a\u0010¾\u0001\u001a\u00020,2\u0007\u0010\u0081\u0001\u001a\u00020:H\u0002¢\u0006\u0005\b¾\u0001\u0010]J\u0011\u0010¿\u0001\u001a\u00020,H\u0002¢\u0006\u0005\b¿\u0001\u0010\u0003J\u001a\u0010À\u0001\u001a\u00020,2\u0007\u0010\u0081\u0001\u001a\u00020:H\u0002¢\u0006\u0005\bÀ\u0001\u0010]J\u0010\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\n\u0010Á\u0001J\u0011\u0010Â\u0001\u001a\u00020,H\u0002¢\u0006\u0005\bÂ\u0001\u0010\u0003J\u0011\u0010Ã\u0001\u001a\u00020,H\u0002¢\u0006\u0005\bÃ\u0001\u0010\u0003J\u001c\u0010Å\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u0014\u001a\u00030Ä\u0001H\u0002¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J2\u0010\u0005\u001a\u00020,2\u0006\u0010x\u001a\u00020>2\u0006\u0010z\u001a\u00020y2\b\u0010{\u001a\u0004\u0018\u00010\t2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0005\b\u0005\u0010Ç\u0001J*\u0010È\u0001\u001a\u00020,2\u0006\u0010x\u001a\u00020>2\u0006\u0010z\u001a\u00020y2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001a\u0010Ê\u0001\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0019\u0010h\u001a\u00020\t2\u0007\u0010Ì\u0001\u001a\u00020VH\u0007¢\u0006\u0005\bh\u0010Í\u0001J\u001a\u0010Î\u0001\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0006\bÎ\u0001\u0010Ë\u0001J\u001a\u0010Ï\u0001\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0006\bÏ\u0001\u0010Ë\u0001J\u001a\u0010Ð\u0001\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0006\bÐ\u0001\u0010Ë\u0001J\u001e\u0010Ó\u0001\u001a\u00020,2\n\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u0001H\u0007¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0019\u0010Õ\u0001\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0005\bÕ\u0001\u0010=R\u0018\u0010×\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010Ö\u0001R\u0018\u0010Ø\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010<R\u0018\u0010Ù\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010<R)\u0010Þ\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÈ\u0001\u0010<\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010à\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010ß\u0001R)\u0010ä\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010ß\u0001\u001a\u0006\bá\u0001\u0010\u0080\u0001\"\u0006\bâ\u0001\u0010ã\u0001R(\u0010ç\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b%\u0010ß\u0001\u001a\u0006\bå\u0001\u0010\u0080\u0001\"\u0006\bæ\u0001\u0010ã\u0001R*\u0010ê\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bZ\u0010ß\u0001\u001a\u0006\bè\u0001\u0010\u0080\u0001\"\u0006\bé\u0001\u0010ã\u0001R+\u0010ð\u0001\u001a\u0005\u0018\u00010ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\\\u0010ì\u0001\u001a\u0006\bÖ\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R\u0017\u0010ò\u0001\u001a\u0005\u0018\u00010ë\u00018G¢\u0006\b\u001a\u0006\bñ\u0001\u0010í\u0001R\u0015\u0010ô\u0001\u001a\u00030ë\u00018G¢\u0006\b\u001a\u0006\bó\u0001\u0010í\u0001R\u001e\u0010÷\u0001\u001a\u00020\u00068FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bö\u0001\u0010\u0003\u001a\u0006\bõ\u0001\u0010Á\u0001R\u0016\u0010ú\u0001\u001a\u0004\u0018\u00010>8G¢\u0006\b\u001a\u0006\bø\u0001\u0010ù\u0001R\u0014\u0010ü\u0001\u001a\u00020\u00068G¢\u0006\b\u001a\u0006\bû\u0001\u0010Á\u0001¨\u0006ý\u0001"}, m88121d2 = {"Lcom/facebook/internal/e;", "", "<init>", "()V", "", "c", "", "d0", "(Ljava/util/Collection;)Z", "", BLiveStormDanmakuGiftResourceType.f45294s, "c0", "(Ljava/lang/String;)Z", "valueIfNullOrEmpty", "k", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", Constants.KEY_KEY, "m0", "(Ljava/lang/String;)Ljava/lang/String;", "", HttpHeaderValues.BYTES, "D0", "([B)Ljava/lang/String;", "E0", "algorithm", "R", p7f.LATITUDE_SOUTH, "(Ljava/lang/String;[B)Ljava/lang/String;", "Ljava/security/MessageDigest;", "hash", "Q", "(Ljava/security/MessageDigest;[B)Ljava/lang/String;", "authority", "path", "Landroid/os/Bundle;", "parameters", "Landroid/net/Uri;", "g", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;", "queryString", "o0", "(Ljava/lang/String;)Landroid/os/Bundle;", "b", "value", "", "q0", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", StickerBundle.TYPE, "p0", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)Z", "Ljava/io/Closeable;", "closeable", "j", "(Ljava/io/Closeable;)V", "Ljava/net/URLConnection;", "connection", "r", "(Ljava/net/URLConnection;)V", "Landroid/content/Context;", "context", "J", "(Landroid/content/Context;)Ljava/lang/String;", "Lorg/json/JSONObject;", "jsonObject", "", "o", "(Lorg/json/JSONObject;)Ljava/util/Map;", "p", "Lorg/json/JSONArray;", "jsonArray", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "m", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "", "n", "(Lorg/json/JSONArray;)Ljava/util/List;", "nonJSONPropertyKey", BloodType.f39576O, "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "Ljava/io/InputStream;", "inputStream", "s0", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/io/OutputStream;", "outputStream", "", "q", "(Ljava/io/InputStream;Ljava/io/OutputStream;)I", "domain", "h", "(Landroid/content/Context;Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;)V", "tag", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "i0", "(Ljava/lang/String;Ljava/lang/Exception;)V", "msg", "j0", "(Ljava/lang/String;Ljava/lang/String;)V", "", Constants.KEY_T, "k0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", p7f.GPS_DIRECTION_TRUE, "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "g0", "", "f0", "(Lorg/json/JSONArray;)Ljava/util/Set;", "map", "l0", "(Ljava/util/Map;)Ljava/lang/String;", "str", "h0", "(Ljava/lang/String;)Ljava/util/Map;", CommandMessage.PARAMS, "Lcom/facebook/internal/AttributionIdentifiers;", "attributionIdentifiers", "anonymousAppDeviceGUID", "limitEventUsage", "B0", "(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;ZLandroid/content/Context;)V", "w", "()Ljava/lang/String;", "appContext", "C0", "(Lorg/json/JSONObject;Landroid/content/Context;)V", "Ljava/lang/Class;", "clazz", "methodName", "", "parameterTypes", "Ljava/lang/reflect/Method;", "K", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", PushClientConstants.TAG_CLASS_NAME, "L", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "receiver", FirebaseAnalytics.Param.METHOD, "args", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "u", "uri", "e0", "(Landroid/net/Uri;)Z", "X", "a0", "contentUri", "", "A", "(Landroid/net/Uri;)J", "Ljava/util/Date;", "dateBase", BaseSei.f14625Y, "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;", "Landroid/os/Parcel;", "parcel", "G0", "(Landroid/os/Parcel;Ljava/util/Map;)V", "t0", "(Landroid/os/Parcel;)Ljava/util/Map;", "F0", "r0", "Lcom/facebook/AccessToken;", "token", "Y", "(Lcom/facebook/AccessToken;)Z", "tokenGraphDomain", "F", "accessToken", "Lcom/facebook/internal/e$a;", "callback", "H", "(Ljava/lang/String;Lcom/facebook/internal/e$a;)V", "f", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lcom/facebook/GraphRequest;", "G", "(Ljava/lang/String;)Lcom/facebook/GraphRequest;", "graphDomain", "M", c4s.C_ZONE, "v0", "()I", "x0", "y0", "w0", "()Z", "u0", "z0", "", BLiveStormDanmakuGiftResourceType.f45292l, "(D)J", "(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Landroid/content/Context;)V", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Lcom/facebook/internal/AttributionIdentifiers;Landroid/content/Context;)V", "b0", "(Landroid/content/Context;)Z", "length", "(I)Ljava/lang/String;", "n0", p7f.GPS_MEASUREMENT_INTERRUPTED, "W", "Ljava/lang/Runnable;", "runnable", "A0", "(Ljava/lang/Runnable;)V", ResourceDirection.f39656v, "I", "numCPUCores", "timestampOfLastCheck", "totalExternalStorageGB", BaseSei.f14624X, "()J", "setAvailableExternalStorageGB", "(J)V", "availableExternalStorageGB", "Ljava/lang/String;", "deviceTimezoneAbbreviation", "E", "setDeviceTimeZoneName", "(Ljava/lang/String;)V", "deviceTimeZoneName", BaseSei.f14626Z, "setCarrierName", "carrierName", "P", "setVersionName", "versionName", "Ljava/util/Locale;", "Ljava/util/Locale;", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "locale", "N", "resourceLocale", "B", "currentLocale", "U", "isAutoAppLinkSetup$annotations", "isAutoAppLinkSetup", "D", "()Lorg/json/JSONObject;", "dataProcessingOptions", "Z", "isDataProcessingRestricted", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1680e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int numCPUCores;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static Locale locale;

    @NotNull
    public static final C1680e INSTANCE = new C1680e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static long timestampOfLastCheck = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static long totalExternalStorageGB = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static long availableExternalStorageGB = -1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static String deviceTimezoneAbbreviation = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static String deviceTimeZoneName = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static String carrierName = "NoCarrier";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static String versionName = "";

    /* JADX INFO: renamed from: com.facebook.internal.e$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/facebook/internal/e$a;", "", "Lorg/json/JSONObject;", "userInfo", "", "a", "(Lorg/json/JSONObject;)V", "Lcom/facebook/FacebookException;", "error", "b", "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7678a(@Nullable JSONObject userInfo);

        /* JADX INFO: renamed from: b */
        void mo7679b(@Nullable FacebookException error);
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final long m8859A(@NotNull Uri contentUri) {
        contentUri.getClass();
        Cursor cursorQuery = null;
        try {
            cursorQuery = C1600c.m8101l().getContentResolver().query(contentUri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: A0 */
    public static final void m8860A0(@Nullable Runnable runnable) {
        try {
            C1600c.m8110u().execute(runnable);
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: B */
    public static final Locale m8861B() {
        Locale localeM8874N = m8874N();
        if (localeM8874N != null) {
            return localeM8874N;
        }
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        return locale2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: B0 */
    public static final void m8862B0(@NotNull JSONObject params, @Nullable AttributionIdentifiers attributionIdentifiers, @Nullable String anonymousAppDeviceGUID, boolean limitEventUsage, @NotNull Context context) throws JSONException {
        params.getClass();
        context.getClass();
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.m8733g(feature)) {
            params.put("anon_id", anonymousAppDeviceGUID);
        }
        params.put("application_tracking_enabled", !limitEventUsage);
        params.put("advertiser_id_collection_enabled", C1600c.m8100k());
        if (attributionIdentifiers != null) {
            if (FeatureManager.m8733g(feature)) {
                INSTANCE.m8931c(params, attributionIdentifiers, anonymousAppDeviceGUID, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                if (FeatureManager.m8733g(feature)) {
                    INSTANCE.m8932d(params, attributionIdentifiers, context);
                } else {
                    params.put("attribution", attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.m8698h() != null) {
                params.put("advertiser_id", attributionIdentifiers.m8698h());
                params.put("advertiser_tracking_enabled", !attributionIdentifiers.getIsTrackingLimited());
            }
            if (!attributionIdentifiers.getIsTrackingLimited()) {
                String strM7862b = C1580h.m7862b();
                if (strM7862b.length() != 0) {
                    params.put("ud", strM7862b);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                params.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
        AppLinkManager appLinkManagerM7988a = AppLinkManager.INSTANCE.m7988a();
        Object objM7983e = appLinkManagerM7988a != null ? appLinkManagerM7988a.m7983e("campaign_ids") : null;
        if (objM7983e != null) {
            params.put("campaign_ids", objM7983e);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: C0 */
    public static final void m8863C0(@NotNull JSONObject params, @NotNull Context appContext) throws JSONException {
        Locale locale2;
        int i;
        params.getClass();
        appContext.getClass();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        INSTANCE.m8940x0(appContext);
        String packageName = appContext.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i3 = packageInfo.versionCode;
            versionName = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(versionName);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale2 = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale2 = Locale.getDefault();
        }
        locale = locale2;
        StringBuilder sb = new StringBuilder();
        Locale locale3 = locale;
        String language = locale3 != null ? locale3.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale4 = locale;
        String country = locale4 != null ? locale4.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            Object systemService = appContext.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    i2 = displayMetrics.heightPixels;
                    d = displayMetrics.density;
                } catch (Exception unused3) {
                }
                i = i2;
                i2 = i4;
            } else {
                i = 0;
            }
        } catch (Exception unused4) {
        }
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(INSTANCE.m8937v0());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        params.put("extinfo", jSONArray.toString());
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: D */
    public static final JSONObject m8864D() {
        if (ztb.m221490d(C1680e.class)) {
            return null;
        }
        try {
            String string = C1600c.m8101l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, C1680e.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: D0 */
    public static final String m8865D0(@NotNull byte[] bytes) {
        bytes.getClass();
        return INSTANCE.m8929S("SHA-1", bytes);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: E0 */
    public static final String m8866E0(@Nullable String key) {
        if (key == null) {
            return null;
        }
        return INSTANCE.m8928R("SHA-256", key);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: F */
    public static final String m8867F(@Nullable String tokenGraphDomain) {
        String strM8111v = C1600c.m8111v();
        if (tokenGraphDomain != null) {
            if (Intrinsics.m88377d(tokenGraphDomain, "gaming")) {
                return C15493d.m94370F(strM8111v, "facebook.com", "fb.gg", false, 4, null);
            }
            if (Intrinsics.m88377d(tokenGraphDomain, "instagram")) {
                return C15493d.m94370F(strM8111v, "facebook.com", "instagram.com", false, 4, null);
            }
        }
        return strM8111v;
    }

    @JvmStatic
    /* JADX INFO: renamed from: F0 */
    public static final void m8868F0(@NotNull Parcel parcel, @Nullable Map<String, String> map) {
        parcel.getClass();
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: G0 */
    public static final void m8869G0(@NotNull Parcel parcel, @Nullable Map<String, String> map) {
        parcel.getClass();
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: H */
    public static final void m8870H(@NotNull final String accessToken, @NotNull final a callback) {
        accessToken.getClass();
        callback.getClass();
        JSONObject jSONObjectM100866a = ay90.m100866a(accessToken);
        if (jSONObjectM100866a != null) {
            callback.mo7678a(jSONObjectM100866a);
            return;
        }
        GraphRequest.InterfaceC1539b interfaceC1539b = new GraphRequest.InterfaceC1539b() { // from class: l.pmk0
            @Override // com.facebook.GraphRequest.InterfaceC1539b
            /* JADX INFO: renamed from: a */
            public final void mo7602a(GraphResponse graphResponse) {
                C1680e.m8883a(callback, accessToken, graphResponse);
            }
        };
        GraphRequest graphRequestM8923G = INSTANCE.m8923G(accessToken);
        graphRequestM8923G.m7570C(interfaceC1539b);
        graphRequestM8923G.m7580k();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: J */
    public static final String m8871J(@Nullable Context context) {
        g0l0.m128439j(context, "context");
        return C1600c.m8102m();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: K */
    public static final Method m8872K(@NotNull Class<?> clazz, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        clazz.getClass();
        methodName.getClass();
        parameterTypes.getClass();
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: L */
    public static final Method m8873L(@NotNull String className, @NotNull String methodName, @NotNull Class<?>... parameterTypes) {
        className.getClass();
        methodName.getClass();
        parameterTypes.getClass();
        try {
            return m8872K(Class.forName(className), methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: N */
    public static final Locale m8874N() {
        try {
            return C1600c.m8101l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: O */
    public static final Object m8875O(@NotNull JSONObject jsonObject, @Nullable String key, @Nullable String nonJSONPropertyKey) throws JSONException {
        jsonObject.getClass();
        Object objOpt = jsonObject.opt(key);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (nonJSONPropertyKey == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(nonJSONPropertyKey, objOpt);
        return jSONObject;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: T */
    public static final Object m8876T(@Nullable Object receiver, @NotNull Method method, @NotNull Object... args) {
        method.getClass();
        args.getClass();
        try {
            return method.invoke(receiver, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: U */
    public static final boolean m8877U() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C1600c.m8102m()}, 1))));
            Context contextM8101l = C1600c.m8101l();
            PackageManager packageManager = contextM8101l.getPackageManager();
            String packageName = contextM8101l.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            listQueryIntentActivities.getClass();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.m88377d(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: V */
    public static final boolean m8878V(@NotNull Context context) {
        AutofillManager autofillManagerM159074a;
        context.getClass();
        return Build.VERSION.SDK_INT >= 26 && (autofillManagerM159074a = mmk0.m159074a(context.getSystemService(lmk0.m154874a()))) != null && autofillManagerM159074a.isAutofillSupported() && autofillManagerM159074a.isEnabled();
    }

    @JvmStatic
    /* JADX INFO: renamed from: W */
    public static final boolean m8879W(@NotNull Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null) {
            return false;
        }
        str.getClass();
        return new Regex(".+_cheets|cheets_.+").matches(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: X */
    public static final boolean m8880X(@Nullable Uri uri) {
        return uri != null && C15493d.m94381x("content", uri.getScheme(), true);
    }

    @JvmStatic
    /* JADX INFO: renamed from: Y */
    public static final boolean m8881Y(@Nullable AccessToken token) {
        return token != null && Intrinsics.m88377d(token, AccessToken.INSTANCE.m7490e());
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final boolean m8882Z() {
        if (ztb.m221490d(C1680e.class)) {
            return false;
        }
        try {
            JSONObject jSONObjectM8864D = m8864D();
            if (jSONObjectM8864D == null) {
                return false;
            }
            try {
                JSONArray jSONArray = jSONObjectM8864D.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    string.getClass();
                    String lowerCase = string.toLowerCase();
                    lowerCase.getClass();
                    if (Intrinsics.m88377d(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            ztb.m221488b(th, C1680e.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8883a(a aVar, String str, GraphResponse graphResponse) {
        aVar.getClass();
        str.getClass();
        graphResponse.getClass();
        if (graphResponse.getError() != null) {
            aVar.mo7679b(graphResponse.getError().getException());
            return;
        }
        JSONObject jSONObjectM7659d = graphResponse.getJsonObject();
        if (jSONObjectM7659d == null) {
            wtq0.m207906a("Required value was null.");
        } else {
            ay90.m100867b(str, jSONObjectM7659d);
            aVar.mo7678a(graphResponse.getJsonObject());
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a0 */
    public static final boolean m8884a0(@Nullable Uri uri) {
        return uri != null && C15493d.m94381x("file", uri.getScheme(), true);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8885b(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c0 */
    public static final boolean m8886c0(@Nullable String s) {
        return s == null || s.length() == 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d0 */
    public static final boolean m8887d0(@Nullable Collection<?> c) {
        return c == null || c.isEmpty();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final <T> boolean m8888e(@Nullable T a2, @Nullable T b) {
        if (a2 == null) {
            return b == null;
        }
        return Intrinsics.m88377d(a2, b);
    }

    @JvmStatic
    /* JADX INFO: renamed from: e0 */
    public static final boolean m8889e0(@Nullable Uri uri) {
        if (uri != null) {
            return C15493d.m94381x("http", uri.getScheme(), true) || C15493d.m94381x("https", uri.getScheme(), true) || C15493d.m94381x("fbstaging", uri.getScheme(), true);
        }
        return false;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final JSONObject m8890f(@NotNull String accessToken) {
        accessToken.getClass();
        JSONObject jSONObjectM100866a = ay90.m100866a(accessToken);
        if (jSONObjectM100866a != null) {
            return jSONObjectM100866a;
        }
        GraphResponse graphResponseM7579j = INSTANCE.m8923G(accessToken).m7579j();
        if (graphResponseM7579j.getError() != null) {
            return null;
        }
        return graphResponseM7579j.getJsonObject();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public static final Set<String> m8891f0(@NotNull JSONArray jsonArray) throws JSONException {
        jsonArray.getClass();
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String string = jsonArray.getString(i);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Uri m8892g(@Nullable String authority, @Nullable String path, @Nullable Bundle parameters) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(authority);
        builder.path(path);
        if (parameters != null) {
            for (String str : parameters.keySet()) {
                Object obj = parameters.get(str);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        uriBuild.getClass();
        return uriBuild;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g0 */
    public static final List<String> m8893g0(@NotNull JSONArray jsonArray) throws JSONException {
        jsonArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h0 */
    public static final Map<String, String> m8894h0(@NotNull String str) {
        str.getClass();
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m8895i(@NotNull Context context) {
        context.getClass();
        try {
            C1680e c1680e = INSTANCE;
            c1680e.m8933h(context, "facebook.com");
            c1680e.m8933h(context, ".facebook.com");
            c1680e.m8933h(context, "https://facebook.com");
            c1680e.m8933h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i0 */
    public static final void m8896i0(@Nullable String tag, @Nullable Exception e) {
        if (!C1600c.m8079D() || tag == null || e == null) {
            return;
        }
        e.getMessage();
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m8897j(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j0 */
    public static final void m8898j0(@Nullable String tag, @Nullable String msg) {
        C1600c.m8079D();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final String m8899k(@Nullable String s, @Nullable String valueIfNullOrEmpty) {
        return m8886c0(s) ? valueIfNullOrEmpty : s;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k0 */
    public static final void m8900k0(@Nullable String tag, @Nullable String msg, @Nullable Throwable t) {
        if (C1600c.m8079D()) {
            m8886c0(tag);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l0 */
    public static final String m8901l0(@NotNull Map<String, String> map) {
        map.getClass();
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        string.getClass();
        return string;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: m */
    public static final HashSet<String> m8902m(@Nullable JSONArray jsonArray) throws JSONException {
        if (jsonArray == null || jsonArray.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String string = jsonArray.getString(i);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: m0 */
    public static final String m8903m0(@NotNull String key) {
        key.getClass();
        return INSTANCE.m8928R("MD5", key);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final List<String> m8904n(@NotNull JSONArray jsonArray) {
        jsonArray.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                String string = jsonArray.getString(i);
                string.getClass();
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n0 */
    public static final boolean m8905n0(@NotNull Context context) {
        context.getClass();
        return m8878V(context);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final Map<String, Object> m8906o(@NotNull JSONObject jsonObject) {
        jsonObject.getClass();
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jsonObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArrayNames.getString(i);
                    string.getClass();
                    Object objM8906o = jsonObject.get(string);
                    if (objM8906o instanceof JSONObject) {
                        objM8906o = m8906o((JSONObject) objM8906o);
                    }
                    objM8906o.getClass();
                    map.put(string, objM8906o);
                } catch (JSONException unused) {
                }
            }
        }
        return map;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public static final Bundle m8907o0(@Nullable String queryString) {
        Bundle bundle = new Bundle();
        if (!m8886c0(queryString)) {
            if (queryString == null) {
                wtq0.m207906a("Required value was null.");
                return null;
            }
            for (String str : (String[]) StringsKt.split$default(queryString, new String[]{"&"}, false, 0, 6, null).toArray(new String[0])) {
                String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m8896i0("FacebookSDK", e);
                }
            }
        }
        return bundle;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final Map<String, String> m8908p(@NotNull JSONObject jsonObject) {
        jsonObject.getClass();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jsonObject.optString(next);
            if (strOptString != null) {
                next.getClass();
                map.put(next, strOptString);
            }
        }
        return map;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p0 */
    public static final boolean m8909p0(@NotNull Bundle bundle, @Nullable String key, @Nullable Object value) {
        bundle.getClass();
        if (value == null) {
            bundle.remove(key);
            return true;
        }
        if (value instanceof Boolean) {
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
            return true;
        }
        if (value instanceof boolean[]) {
            bundle.putBooleanArray(key, (boolean[]) value);
            return true;
        }
        if (value instanceof Double) {
            bundle.putDouble(key, ((Number) value).doubleValue());
            return true;
        }
        if (value instanceof double[]) {
            bundle.putDoubleArray(key, (double[]) value);
            return true;
        }
        if (value instanceof Integer) {
            bundle.putInt(key, ((Number) value).intValue());
            return true;
        }
        if (value instanceof int[]) {
            bundle.putIntArray(key, (int[]) value);
            return true;
        }
        if (value instanceof Long) {
            bundle.putLong(key, ((Number) value).longValue());
            return true;
        }
        if (value instanceof long[]) {
            bundle.putLongArray(key, (long[]) value);
            return true;
        }
        if (value instanceof String) {
            bundle.putString(key, (String) value);
            return true;
        }
        if (value instanceof JSONArray) {
            bundle.putString(key, ((JSONArray) value).toString());
            return true;
        }
        if (!(value instanceof JSONObject)) {
            return false;
        }
        bundle.putString(key, ((JSONObject) value).toString());
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final int m8910q(@Nullable InputStream inputStream, @NotNull OutputStream outputStream) throws Throwable {
        outputStream.getClass();
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = bufferedInputStream2.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i2);
                    i += i2;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: q0 */
    public static final void m8911q0(@NotNull Bundle b, @Nullable String key, @Nullable String value) {
        b.getClass();
        if (m8886c0(value)) {
            return;
        }
        b.putString(key, value);
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m8912r(@Nullable URLConnection connection) {
        if (connection == null || !(connection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) connection).disconnect();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: r0 */
    public static final Map<String, String> m8913r0(@NotNull Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: s0 */
    public static final String m8914s0(@Nullable InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            String string = sb.toString();
                            m8897j(bufferedInputStream);
                            m8897j(inputStreamReader);
                            return string;
                        }
                        sb.append(cArr, 0, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m8897j(bufferedInputStream);
                    m8897j(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final String m8915t(int length) {
        String string = new BigInteger(length * 5, new Random()).toString(32);
        string.getClass();
        return string;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: t0 */
    public static final Map<String, String> m8916t0(@NotNull Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map.put(parcel.readString(), parcel.readString());
        }
        return map;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m8917u(@Nullable Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m8918v(@NotNull Context context) {
        context.getClass();
        try {
            String strM8103n = C1600c.m8103n();
            if (strM8103n != null) {
                return strM8103n;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: w */
    public static final String m8919w() {
        Context contextM8101l = C1600c.m8101l();
        if (contextM8101l == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextM8101l.getPackageManager().getPackageInfo(contextM8101l.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: y */
    public static final Date m8920y(@Nullable Bundle bundle, @Nullable String key, @NotNull Date dateBase) {
        long jLongValue;
        dateBase.getClass();
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(key);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return jLongValue == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (jLongValue * 1000));
    }

    /* JADX INFO: renamed from: C */
    public final String m8921C() {
        AccessToken accessTokenM7490e = AccessToken.INSTANCE.m7490e();
        return (accessTokenM7490e == null || accessTokenM7490e.getGraphDomain() == null) ? "facebook" : accessTokenM7490e.getGraphDomain();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final String m8922E() {
        return deviceTimeZoneName;
    }

    /* JADX INFO: renamed from: G */
    public final GraphRequest m8923G(String accessToken) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", m8925M(m8921C()));
        bundle.putString("access_token", accessToken);
        GraphRequest graphRequestM7640y = GraphRequest.INSTANCE.m7640y(null, null);
        graphRequestM7640y.m7574G(bundle);
        graphRequestM7640y.m7573F(HttpMethod.GET);
        return graphRequestM7640y;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final Locale m8924I() {
        return locale;
    }

    /* JADX INFO: renamed from: M */
    public final String m8925M(String graphDomain) {
        return Intrinsics.m88377d(graphDomain, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public final String m8926P() {
        return versionName;
    }

    /* JADX INFO: renamed from: Q */
    public final String m8927Q(MessageDigest hash, byte[] bytes) {
        hash.update(bytes);
        byte[] bArrDigest = hash.digest();
        StringBuilder sb = new StringBuilder();
        bArrDigest.getClass();
        for (byte b : bArrDigest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: R */
    public final String m8928R(String algorithm, String key) {
        byte[] bytes = key.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return m8929S(algorithm, bytes);
    }

    /* JADX INFO: renamed from: S */
    public final String m8929S(String algorithm, byte[] bytes) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.getClass();
            return m8927Q(messageDigest, bytes);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m8930b0(Context context) {
        Method methodM8873L = m8873L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM8873L == null) {
            return false;
        }
        Object objM8876T = m8876T(null, methodM8873L, context);
        return (objM8876T instanceof Integer) && Intrinsics.m88377d(objM8876T, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m8931c(JSONObject params, AttributionIdentifiers attributionIdentifiers, String anonymousAppDeviceGUID, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !m8930b0(context)) {
            params.put("anon_id", anonymousAppDeviceGUID);
        } else {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put("anon_id", anonymousAppDeviceGUID);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8932d(JSONObject params, AttributionIdentifiers attributionIdentifiers, Context context) throws JSONException {
        if (Build.VERSION.SDK_INT < 31 || !m8930b0(context)) {
            params.put("attribution", attributionIdentifiers.getAttributionId());
        } else {
            if (attributionIdentifiers.getIsTrackingLimited()) {
                return;
            }
            params.put("attribution", attributionIdentifiers.getAttributionId());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8933h(Context context, String domain) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(domain);
        if (cookie == null) {
            return;
        }
        for (String str : (String[]) StringsKt.split$default(cookie, new String[]{com.meituan.robust.Constants.PACKNAME_END}, false, 0, 6, null).toArray(new String[0])) {
            String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"="}, false, 0, 6, null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str2 = strArr[0];
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.m88378e(str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str2.subSequence(i, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(domain, sb.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    /* JADX INFO: renamed from: l */
    public final long m8934l(double bytes) {
        return Math.round(bytes / 1.073741824E9d);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m8935s() {
        return Intrinsics.m88377d("mounted", Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8936u0() {
        try {
            if (m8935s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            availableExternalStorageGB = m8934l(availableExternalStorageGB);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final int m8937v0() {
        int i = numCPUCores;
        if (i > 0) {
            return i;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: l.qmk0
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return C1680e.m8885b(file, str);
                }
            });
            if (fileArrListFiles != null) {
                numCPUCores = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (numCPUCores <= 0) {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m8938w0(Context appContext) {
        if (Intrinsics.m88377d(carrierName, "NoCarrier")) {
            try {
                Object systemService = appContext.getSystemService("phone");
                systemService.getClass();
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                networkOperatorName.getClass();
                carrierName = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final long m8939x() {
        return availableExternalStorageGB;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m8940x0(Context appContext) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= 1800000) {
            timestampOfLastCheck = System.currentTimeMillis();
            m8941y0();
            m8938w0(appContext);
            m8943z0();
            m8936u0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m8941y0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            displayName.getClass();
            deviceTimezoneAbbreviation = displayName;
            String id = timeZone.getID();
            id.getClass();
            deviceTimeZoneName = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final String m8942z() {
        return carrierName;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m8943z0() {
        try {
            if (m8935s()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            totalExternalStorageGB = m8934l(totalExternalStorageGB);
        } catch (Exception unused) {
        }
    }
}
