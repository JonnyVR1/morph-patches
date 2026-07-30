package com.p051p1.mobile.putong.core.p058ui.lovebuzz.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.momomediaext.MMLiveEngine;
import com.immomo.momomediaext.MomoMediaConstants$BEAUTY_TYPE;
import com.immomo.momomediaext.sei.BaseSei;
import com.immomo.momomediaext.utils.MMLiveAudioVolumeConfig;
import com.immomo.momomediaext.utils.MMLiveErrorInfo;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.momo.mcamera.mask.MaskModel;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.BuzzResolution;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.c4s;
import p153l.do3;
import p153l.enw;
import p153l.f8w;
import p153l.ga1;
import p153l.gp3;
import p153l.haw;
import p153l.jj5;
import p153l.jpd0;
import p153l.k3d0;
import p153l.k8w;
import p153l.l51;
import p153l.o1j0;
import p153l.p7f;
import p153l.pb1;
import p153l.pq3;
import p153l.psd0;
import p153l.qn3;
import p153l.wx0;
import p153l.wzx;
import p153l.xa2;
import p153l.y20;
import p153l.zmw;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\t*\u0004²\u0001µ\u0001\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#JO\u0010+\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0019\u001a\u00020\f2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0)\"\u00020\fH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u0003J-\u00107\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00106\u001a\u00020\f¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0014¢\u0006\u0004\b;\u0010<J=\u0010=\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0004¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010@\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\u0004¢\u0006\u0004\bA\u0010\u0003J\r\u0010B\u001a\u00020\u0004¢\u0006\u0004\bB\u0010\u0003J\u0015\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0014¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0014¢\u0006\u0004\bG\u0010EJ\r\u0010H\u001a\u00020\u0004¢\u0006\u0004\bH\u0010\u0003J\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\u0004H\u0000¢\u0006\u0004\bJ\u0010\u0003J\u001d\u0010M\u001a\u0002022\u0006\u0010K\u001a\u00020\f2\u0006\u0010L\u001a\u00020\f¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00042\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0004¢\u0006\u0004\bW\u0010\u0003J1\u0010X\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\u0004\bX\u0010YJ1\u0010Z\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\u0004\bZ\u0010YJ1\u0010[\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\u0004\b[\u0010YJ1\u0010\\\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\f2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0)\"\u00020\f¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u0014¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u0014¢\u0006\u0004\ba\u0010<J\r\u0010b\u001a\u00020\u0014¢\u0006\u0004\bb\u0010<J\r\u0010c\u001a\u00020\u0014¢\u0006\u0004\bc\u0010<J\r\u0010d\u001a\u00020\u0014¢\u0006\u0004\bd\u0010<J\r\u0010e\u001a\u00020\u0014¢\u0006\u0004\be\u0010<J\r\u0010f\u001a\u00020\u0004¢\u0006\u0004\bf\u0010\u0003J\r\u0010g\u001a\u00020\u0004¢\u0006\u0004\bg\u0010\u0003J\u0017\u0010i\u001a\u00020\f2\b\b\u0002\u0010h\u001a\u00020\u0014¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0014¢\u0006\u0004\bk\u0010<R\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020m0l8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00140l8\u0006¢\u0006\f\n\u0004\bs\u0010o\u001a\u0004\bt\u0010qR\"\u0010y\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010J\u001a\u0004\bw\u0010<\"\u0004\bx\u0010ER\"\u0010}\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010J\u001a\u0004\b{\u0010<\"\u0004\b|\u0010ER\u0017\u0010\u0080\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010JR\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R,\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010JR\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R?\u0010¢\u0001\u001a&\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0006\u0012\u0004\u0018\u00010O0\u009c\u0001j\u0012\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0006\u0012\u0004\u0018\u00010O`\u009e\u00018\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R%\u0010¥\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b_\u0010J\u001a\u0005\b£\u0001\u0010<\"\u0005\b¤\u0001\u0010ER&\u0010©\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010J\u001a\u0005\b§\u0001\u0010<\"\u0005\b¨\u0001\u0010ER%\u0010¬\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b+\u0010J\u001a\u0005\bª\u0001\u0010<\"\u0005\b«\u0001\u0010ER\"\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u00ad\u00018\u0006¢\u0006\u000f\n\u0005\b\\\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u007fR\u0017\u0010´\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010³\u0001R\u0017\u0010·\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010¶\u0001R)\u0010¼\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b@\u0010\u009a\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001¨\u0006½\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager;", "", "<init>", "()V", "", "m", "a0", "j", "", "errorCode", "M", "(I)V", "", "userId", "Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;", "lintType", "channel", "channelKey", RemoteConfigConstants.RequestFieldKey.APP_ID, "userSign", "", "onlyAudio", "Lcom/immomo/momomediaext/utils/MMLiveRoomParams;", "r", "(Ljava/lang/String;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/immomo/momomediaext/utils/MMLiveRoomParams;", "type", "F", "(I)Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;", "userVideo", "Lcom/immomo/momomediaext/utils/MMLiveMediaConfig;", "D", "(Z)Lcom/immomo/momomediaext/utils/MMLiveMediaConfig;", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "conflictBusinessType", "i0", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function0;", "func", "fail", "", "permission", "p", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;[Ljava/lang/String;)V", "A", "()I", BaseSei.f14626Z, "o0", "K", "Lcom/immomo/momomediaext/utils/MMLiveUserConfig;", Constants.KEY_CONFIG, "Landroid/content/Context;", "context", "provider", "L", "(Lcom/immomo/momomediaext/utils/MMLiveUserConfig;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "b0", "(Ljava/lang/String;)V", "R", "()Z", Constants.KEY_T, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "k0", "u", p7f.GPS_MEASUREMENT_INTERRUPTED, "W", BLiveButtonType.mute, "f0", "(Z)V", "enable", "d0", "c0", BLiveStormDanmakuGiftResourceType.f45294s, "Z", "pubId", "roomId", "E", "(Ljava/lang/String;Ljava/lang/String;)Lcom/immomo/momomediaext/utils/MMLiveUserConfig;", "Landroid/view/SurfaceView;", "surface", "l0", "(Landroid/view/SurfaceView;)V", "width", "height", "g0", "(II)V", "n0", "q0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "p0", "X", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;[Ljava/lang/String;)Z", OMSTemplateModeType.toast, "n", "(Z)Z", "P", p7f.LATITUDE_SOUTH, BloodType.f39576O, "Q", "U", "m0", "j0", "video", BaseSei.f14624X, "(Z)Ljava/lang/String;", "Y", "Lrx/subjects/a;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "a", "Lrx/subjects/a;", BaseSei.f14625Y, "()Lrx/subjects/a;", "callState", "b", c4s.C_ZONE, "inMediaBuzzCallState", "c", "w", "setAudioMute", "audioMute", Constants.INAPP_DATA_TAG, "H", "setSpeakerPhone", "speakerPhone", "e", "Ljava/lang/String;", "mediaCallType", "f", "enablePreview", "Lcom/immomo/momomediaext/MMLiveEngine;", "g", "Lcom/immomo/momomediaext/MMLiveEngine;", "mLiveEngine", "Ll/pq3;", "h", "Ll/pq3;", "getFloatManager$buzz_intlGmsRelease", "()Ll/pq3;", "setFloatManager$buzz_intlGmsRelease", "(Ll/pq3;)V", "floatManager", "Landroid/media/AudioManager;", RXScreenCaptureService.KEY_INDEX, "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "afChangeListener", "k", "audioFocusChangeListenerRun", "Ljava/util/concurrent/atomic/AtomicInteger;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/concurrent/atomic/AtomicInteger;", "registerCount", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "J", "()Ljava/util/HashMap;", "userSurfaceInfoMap", "B", "e0", "hadVocal", "o", p7f.GPS_DIRECTION_TRUE, "h0", "isShowFace", "I", "setStartLint", "startLint", "Lrx/subjects/b;", "Lrx/subjects/b;", "G", "()Lrx/subjects/b;", "selfShowFaceSub", "com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$phoneStateReceiver$1", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$phoneStateReceiver$1;", "phoneStateReceiver", "com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$c", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$c;", "pusherListener", "getAddMask", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setAddMask", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "addMask", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzMediaCallManager {

    @NotNull
    public static final BuzzMediaCallManager INSTANCE = new BuzzMediaCallManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<BuzzCallState> callState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C22507a<Boolean> inMediaBuzzCallState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean audioMute;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean speakerPhone;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static volatile String mediaCallType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean enablePreview;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static MMLiveEngine mLiveEngine;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static pq3 floatManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static AudioManager audioManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public static AudioManager.OnAudioFocusChangeListener afChangeListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static boolean audioFocusChangeListenerRun;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static AtomicInteger registerCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<Long, SurfaceView> userSurfaceInfoMap;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static boolean hadVocal;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static boolean isShowFace;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static boolean startLint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final C22508b<Boolean> selfShowFaceSub;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public static String provider;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static final BuzzMediaCallManager$phoneStateReceiver$1 phoneStateReceiver;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public static final C8579c pusherListener;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static AtomicInteger addMask;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8577a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30954a;

        static {
            int[] iArr = new int[AudioBusinessType.values().length];
            try {
                iArr[AudioBusinessType.CHAT_ROOM_WINDOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioBusinessType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30954a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$b", "Ll/ga1;", "", "success", "()V", "", "currentBusinessKey", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "currentType", "currentCallBack", "conflictBusinessKey", "conflictBusinessType", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ll/ga1;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "current", "businessKey", "focusBusinessType", "b", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8578b implements ga1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f30955a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0<Unit> f30956b;

        public C8578b(Function0<Unit> function0, Function0<Unit> function1) {
            this.f30955a = function0;
            this.f30956b = function1;
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType current, String businessKey, AudioBusinessType focusBusinessType) {
            current.getClass();
            businessKey.getClass();
            focusBusinessType.getClass();
            BuzzMediaCallManager.INSTANCE.m48141W();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String currentBusinessKey, AudioBusinessType currentType, ga1 currentCallBack, String conflictBusinessKey, AudioBusinessType conflictBusinessType) {
            currentBusinessKey.getClass();
            currentType.getClass();
            currentCallBack.getClass();
            conflictBusinessKey.getClass();
            conflictBusinessType.getClass();
            if (conflictBusinessType.isHighLevelBusiness()) {
                BuzzMediaCallManager.INSTANCE.m48153i0(conflictBusinessType);
                this.f30956b.invoke();
            } else {
                pb1.m171472b().mo171478g(currentBusinessKey, currentType, currentCallBack);
                this.f30955a.invoke();
            }
        }

        @Override // p153l.ga1
        public void success() {
            this.f30955a.invoke();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$c */
    @Metadata(m88120d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\fJ+\u0010\u001a\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020\u00062\u0010\u0010,\u001a\f\u0012\u0006\b\u0001\u0012\u00020+\u0018\u00010*2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010)¨\u00061"}, m88121d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$c", "Ll/enw;", "", Oauth2AccessToken.KEY_UID, "", "data", "", "U", "(I[B)V", "Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;", "pushType", Constants.KEY_T, "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "rtcType", "u", "Lcom/immomo/momomediaext/utils/MMLiveErrorInfo;", "error", "o", "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;Lcom/immomo/momomediaext/utils/MMLiveErrorInfo;)V", "r", "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;I)V", "p", "q", "", "channel", "", BaseSei.f14626Z, "(Ljava/lang/String;JLcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", Reason.TYPE, "A", "(Ljava/lang/String;ILcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", UserId.TYPE, "Z", "(Ljava/lang/String;Ljava/lang/String;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "Landroid/view/SurfaceView;", "surfaceView", p7f.LATITUDE_SOUTH, "(Ljava/lang/String;Landroid/view/SurfaceView;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "a0", "routing", Constants.INAPP_DATA_TAG, "(I)V", "", "Lcom/immomo/mediacore/audio/AudioVolumeWeight;", "speakers", "e0", "([Lcom/immomo/mediacore/audio/AudioVolumeWeight;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "count", ResourceDirection.f39656v, "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8579c extends enw {
        @Override // p153l.enw
        /* JADX INFO: renamed from: A */
        public void mo48175A(String channel, int reason, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo48175A(channel, reason, rtcType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onLocalLeaveChannel:" + channel + " reason:" + reason);
            BuzzMediaCallManager.INSTANCE.m48173y().onNext(BuzzCallState.LEAVE_STATE);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: S */
        public void mo48176S(String uid, SurfaceView surfaceView, MMLiveRoomParams.MMLivePushType rtcType) {
            uid.getClass();
            super.mo48176S(uid, surfaceView, rtcType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onVideoChannelAdded:" + uid);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            buzzMediaCallManager.m48129J().put(Long.valueOf(Long.parseLong(uid)), surfaceView);
            buzzMediaCallManager.m48173y().onNext(BuzzCallState.PEER_VIDEO_JOIN);
            buzzMediaCallManager.m48173y().onNext(BuzzCallState.RECEIVE_PEER_VIDEO_FIRST);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: U */
        public void mo48177U(int uid, byte[] data) {
            super.mo48177U(uid, data);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onStreamMessage uid " + uid + " data " + data);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: Z */
        public void mo48178Z(String channel, String userid, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo48178Z(channel, userid, rtcType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onMemberJoinChannel:" + userid + " channel:" + channel);
            BuzzMediaCallManager.INSTANCE.m48173y().onNext(BuzzCallState.PEER_JOINED_STATE);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: a0 */
        public void mo48179a0(String uid, int reason, MMLiveRoomParams.MMLivePushType rtcType) {
            uid.getClass();
            super.mo48179a0(uid, reason, rtcType);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            buzzMediaCallManager.m48129J().remove(Long.valueOf(Long.parseLong(uid)));
            xa2 xa2Var = xa2.INSTANCE;
            xa2Var.m209830a("BuzzMediaCallManager", "onVideoChannelRemove:" + uid);
            buzzMediaCallManager.m48173y().onNext(BuzzCallState.PEER_VIDEO_REMOVE);
            xa2Var.m209830a("BuzzMediaCallManager", "onMemberLeaveChannel:" + uid + " reason:" + reason + " rtc:" + rtcType);
            buzzMediaCallManager.m48173y().onNext(BuzzCallState.MEMBER_LEAVE);
            BuzzMediaCallManager.m48119v(buzzMediaCallManager, 0, 1, null);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: d */
        public void mo48180d(int routing) {
            super.mo48180d(routing);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onAudioRouteChanged routing " + routing);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: e0 */
        public void mo48181e0(AudioVolumeWeight[] speakers, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo48181e0(speakers, rtcType);
            if (BuzzMediaCallManager.INSTANCE.m48121B() || speakers == null) {
                return;
            }
            for (AudioVolumeWeight audioVolumeWeight : speakers) {
                if (audioVolumeWeight.voicePitch > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && audioVolumeWeight.volume > 0.0f && TextUtils.equals(String.valueOf(audioVolumeWeight.uid), CoreModule.m30929H().userId())) {
                    BuzzMediaCallManager.INSTANCE.m48149e0(true);
                    return;
                }
            }
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: o */
        public void mo48182o(MMLiveRoomParams.MMLivePushType rtcType, MMLiveErrorInfo error) {
            error.getClass();
            super.mo48182o(rtcType, error);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onEngineError:" + rtcType + " what:" + error.what + " extra:" + error.extra);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            buzzMediaCallManager.m48173y().onNext(BuzzCallState.CONNECTION_LOST);
            buzzMediaCallManager.m48170u(error.what);
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: p */
        public void mo48183p(MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo48183p(rtcType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onEngineBufferStart");
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: q */
        public void mo48184q(MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo48184q(rtcType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onEngineBufferStopped");
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: r */
        public void mo48185r(MMLiveRoomParams.MMLivePushType rtcType, int error) {
            super.mo48185r(rtcType, error);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onEnginePushReplaced");
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: t */
        public void mo48186t(MMLiveRoomParams.MMLivePushType pushType) {
            super.mo48186t(pushType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onEnginePushStarted");
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: u */
        public void mo48187u(MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo48187u(rtcType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onEnginePushStopped");
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: v */
        public void mo48188v(int count) {
            super.mo48188v(count);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (buzzMediaCallManager.m48128I()) {
                buzzMediaCallManager.m48152h0(true);
                buzzMediaCallManager.m48126G().onNext(Boolean.TRUE);
            }
        }

        @Override // p153l.enw
        /* JADX INFO: renamed from: z */
        public void mo48189z(String channel, long uid, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo48189z(channel, uid, rtcType);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "onLocalJoinChannel:" + uid + " channel:" + channel);
            if (Intrinsics.m88377d(BuzzMediaCallManager.mediaCallType, "voiceBuzz")) {
                BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
                buzzMediaCallManager.m48148d0(buzzMediaCallManager.m48127H());
            }
            BuzzMediaCallManager.INSTANCE.m48173y().onNext(BuzzCallState.LOCAL_JOINED_STATE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$phoneStateReceiver$1] */
    static {
        C22507a<BuzzCallState> c22507aM222759c = C22507a.m222759c(BuzzCallState.UN_INIT_STATE);
        c22507aM222759c.getClass();
        callState = c22507aM222759c;
        C22507a<Boolean> c22507aM222759c2 = C22507a.m222759c(Boolean.FALSE);
        c22507aM222759c2.getClass();
        inMediaBuzzCallState = c22507aM222759c2;
        mediaCallType = "voiceBuzz";
        registerCount = new AtomicInteger(0);
        userSurfaceInfoMap = new HashMap<>();
        C22508b<Boolean> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        selfShowFaceSub = c22508bM222767b;
        provider = "1";
        phoneStateReceiver = new BroadcastReceiver() { // from class: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$phoneStateReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                context.getClass();
                intent.getClass();
                if (Intrinsics.m88377d("android.intent.action.PHONE_STATE", intent.getAction())) {
                    BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
                    if (!buzzMediaCallManager.m48133O() && buzzMediaCallManager.m48136R()) {
                        buzzMediaCallManager.m48173y().onNext(BuzzCallState.CONNECTION_LOST);
                        BuzzMediaCallManager.m48119v(buzzMediaCallManager, 0, 1, null);
                    }
                }
            }
        };
        pusherListener = new C8579c();
        addMask = new AtomicInteger(-1);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m48106N(BuzzMediaCallManager buzzMediaCallManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        buzzMediaCallManager.m48132M(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m48107a(boolean z) {
        AudioManager audioManager2;
        AudioManager audioManager3 = audioManager;
        if ((audioManager3 == null || audioManager3.getMode() != 3) && (audioManager2 = audioManager) != null) {
            audioManager2.setMode(3);
        }
        AudioManager audioManager4 = audioManager;
        if (audioManager4 != null) {
            audioManager4.setSpeakerphoneOn(z);
        }
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20093j0(z);
        }
        speakerPhone = z;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m48108b(Act act, Function0 function0, Function0 function1) {
        INSTANCE.m48163p(act, function0, function1, "memojiBuzz", new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m48109c(Act act, Function0 function0, Function0 function1) {
        INSTANCE.m48163p(act, function0, function1, "videoBuzz", new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m48110d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m48111e(MaskModel maskModel) {
        if (maskModel != null) {
            addMask.set(1);
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m20105t(maskModel);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m48112f(int i) {
        BuzzMediaCallManager buzzMediaCallManager = INSTANCE;
        if (!buzzMediaCallManager.m48133O() && buzzMediaCallManager.m48136R()) {
            m48119v(buzzMediaCallManager, 0, 1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m48113g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        INSTANCE.m48144Z();
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "ioLeave----consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: h */
    public static void m48114h() {
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20065L();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m48115i(boolean z, String str, int i, String str2, String str3, String str4, String str5, MMLiveTranscoding mMLiveTranscoding) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                BuzzMediaCallManager buzzMediaCallManager = INSTANCE;
                mMLiveEngine.m20110w(buzzMediaCallManager.m48123D(z), buzzMediaCallManager.m48167r(str, buzzMediaCallManager.m48125F(i), str2, str3, str4, str5, !z), mMLiveTranscoding);
            }
        } catch (Exception unused) {
        }
        xa2 xa2Var = xa2.INSTANCE;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C22507a<BuzzCallState> c22507a = callState;
        xa2Var.m209830a("BuzzMediaCallManager", "enter room consume " + jCurrentTimeMillis2 + " callState is " + c22507a.m222761e());
        if (c22507a.m222761e() == BuzzCallState.PREPARE_JOINING_STATE) {
            c22507a.onNext(BuzzCallState.JOINING_STATE);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m48118o(BuzzMediaCallManager buzzMediaCallManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return buzzMediaCallManager.m48160n(z);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m48119v(BuzzMediaCallManager buzzMediaCallManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        buzzMediaCallManager.m48170u(i);
    }

    /* JADX INFO: renamed from: A */
    public final int m48120A() {
        BuzzResolution buzzResolution;
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        int i = (loveBuzzDataM134315v0 == null || (buzzResolution = loveBuzzDataM134315v0.recommendResolution) == null) ? 480 : buzzResolution.width;
        int i2 = i != 0 ? i : 480;
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "getCameraWidth, width " + i2);
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m48121B() {
        return hadVocal;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final C22507a<Boolean> m48122C() {
        return inMediaBuzzCallState;
    }

    /* JADX INFO: renamed from: D */
    public final MMLiveMediaConfig m48123D(boolean userVideo) {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.encodeHeight = m48174z();
        mMLiveMediaConfig.encodeWidth = m48120A();
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 15;
        mMLiveMediaConfig.businessType = Integer.parseInt(m48172x(userVideo));
        mMLiveMediaConfig.cdnType = Integer.parseInt(provider);
        return mMLiveMediaConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final MMLiveUserConfig m48124E(@NotNull String pubId, @NotNull String roomId) {
        pubId.getClass();
        roomId.getClass();
        return new MMLiveUserConfig(CoreModule.m30934Q().mo68453ih(), CoreModule.m30934Q().mo68405Hh(), pubId, roomId, wx0.m208362b(App.f16088e), wx0.m208361a(App.f16088e), false);
    }

    /* JADX INFO: renamed from: F */
    public final MMLiveRoomParams.MMLivePushType m48125F(int type) {
        if (type == 1) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG;
        }
        if (type == 2) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfTX;
        }
        if (type == 3) {
            return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfWL;
        }
        if (type != 4) {
            return type != 5 ? MMLiveRoomParams.MMLivePushType.MMLiveTypeConfAG : MMLiveRoomParams.MMLivePushType.MMLiveTypeConfVolc;
        }
        return MMLiveRoomParams.MMLivePushType.MMLiveTypeConfMM;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final C22508b<Boolean> m48126G() {
        return selfShowFaceSub;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m48127H() {
        return speakerPhone;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m48128I() {
        return startLint;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final HashMap<Long, SurfaceView> m48129J() {
        return userSurfaceInfoMap;
    }

    /* JADX INFO: renamed from: K */
    public final void m48130K() {
        if (NullChecker.m82486a(floatManager)) {
            App.f16088e.unregisterActivityLifecycleCallbacks(floatManager);
        }
        floatManager = new pq3();
        App.f16088e.registerActivityLifecycleCallbacks(floatManager);
        m48162o0();
        m48158m();
    }

    /* JADX INFO: renamed from: L */
    public final synchronized void m48131L(@NotNull MMLiveUserConfig config, @NotNull Context context, @NotNull String type, @NotNull String provider2) {
        config.getClass();
        context.getClass();
        type.getClass();
        provider2.getClass();
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "initEngine, config is " + config);
        callState.onNext(BuzzCallState.INIT_STATE);
        mLiveEngine = new MMLiveEngine(config, context);
        mediaCallType = type;
        provider = provider2;
    }

    /* JADX INFO: renamed from: M */
    public final void m48132M(int errorCode) {
        f8w f8wVar = f8w.INSTANCE;
        if (f8wVar.m124565a(mediaCallType)) {
            f8wVar.m124566b(mediaCallType);
        }
        haw hawVarM134320a = haw.INSTANCE.m134320a();
        String str = mediaCallType;
        boolean z = false;
        if (!Intrinsics.m88377d(mediaCallType, "voiceBuzz") && !isShowFace) {
            z = true;
        }
        hawVarM134320a.m134273K0(str, z, !hadVocal, errorCode);
        if (!Intrinsics.m88377d(mediaCallType, "voiceBuzz")) {
            m48161n0();
        }
        m48154j();
        l51.m152919y(new Runnable() { // from class: l.kp3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m48113g();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final boolean m48133O() {
        BuzzCallState buzzCallStateM222761e = callState.m222761e();
        return buzzCallStateM222761e == BuzzCallState.LEAVE_STATE || buzzCallStateM222761e == BuzzCallState.MEMBER_LEAVE || buzzCallStateM222761e == BuzzCallState.UN_INIT_STATE || buzzCallStateM222761e == BuzzCallState.INIT_STATE || buzzCallStateM222761e == BuzzCallState.CONNECTION_LOST || buzzCallStateM222761e == BuzzCallState.RECEIVE_PHONE_CALL;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m48134P() {
        return !m48133O();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m48135Q() {
        return m48137S() || m48134P();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m48136R() {
        try {
            Object systemService = CoreModule.f18263b.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            return (telephonyManager == null || telephonyManager.getCallState() == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m48137S() {
        C22507a<BuzzCallState> c22507a = callState;
        return c22507a.m222761e() == BuzzCallState.PREPARE_JOINING_STATE || c22507a.m222761e() == BuzzCallState.INIT_STATE;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m48138T() {
        return isShowFace;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m48139U() {
        return !Intrinsics.m88377d(mediaCallType, "voiceBuzz");
    }

    /* JADX INFO: renamed from: V */
    public final void m48140V() {
        m48154j();
        callState.onNext(BuzzCallState.INIT_STATE);
        l51.m152919y(new Runnable() { // from class: l.op3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m48114h();
            }
        });
        m48147c0();
    }

    /* JADX INFO: renamed from: W */
    public final void m48141W() {
        if (!m48133O()) {
            callState.onNext(BuzzCallState.LEAVE_STATE);
            m48106N(this, 0, 1, null);
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "leaveRoom----");
            m48147c0();
            return;
        }
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "leaveRoom, but status is " + callState.m222761e());
    }

    /* JADX INFO: renamed from: X */
    public final void m48142X(@NotNull final Act act, @NotNull final Function0<Unit> func, @NotNull final Function0<Unit> fail) {
        act.getClass();
        func.getClass();
        fail.getClass();
        qn3.INSTANCE.m177194l(act, "memojiBuzz", new Function0() { // from class: l.sp3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuzzMediaCallManager.m48108b(act, func, fail);
            }
        }, fail);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m48143Y() {
        MaskModel maskModelM117151F = do3.INSTANCE.m117151F();
        if (addMask.get() == 1) {
            addMask.set(0);
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m20079V(maskModelM117151F);
            }
        } else {
            addMask.set(1);
            MMLiveEngine mMLiveEngine2 = mLiveEngine;
            if (mMLiveEngine2 != null) {
                mMLiveEngine2.m20105t(maskModelM117151F);
            }
        }
        return addMask.get() == 1;
    }

    /* JADX INFO: renamed from: Z */
    public final synchronized void m48144Z() {
        try {
            xa2.INSTANCE.m209830a("BuzzMediaCallManager", "releaseRtc");
            callState.onNext(BuzzCallState.UN_INIT_STATE);
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m20076S();
            }
            mLiveEngine = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX INFO: renamed from: a0 */
    public final void m48145a0() {
        boolean z;
        if (NullChecker.m82486a(audioManager) && NullChecker.m82486a(afChangeListener) && !audioFocusChangeListenerRun) {
            AudioManager audioManager2 = audioManager;
            Integer numValueOf = audioManager2 != null ? Integer.valueOf(audioManager2.requestAudioFocus(afChangeListener, 3, 2)) : null;
            if (numValueOf != null) {
                z = numValueOf.intValue() == 1;
            }
            audioFocusChangeListenerRun = z;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m48146b0(@NotNull String type) {
        type.getClass();
        mediaCallType = type;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m48147c0() {
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "resetState");
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20106t0(null);
        }
        audioMute = false;
        speakerPhone = false;
        hadVocal = false;
        isShowFace = false;
        startLint = false;
        mediaCallType = "voiceBuzz";
        AudioManager audioManager2 = audioManager;
        if (audioManager2 != null) {
            audioManager2.setMode(0);
        }
        AudioManager audioManager3 = audioManager;
        if (audioManager3 != null) {
            audioManager3.setSpeakerphoneOn(speakerPhone);
        }
        userSurfaceInfoMap.clear();
        addMask.set(-1);
        haw.INSTANCE.m134320a().m134303n0();
        pb1.m171472b().mo171476e(Reflection.m88396b(BuzzMediaCallManager.class).mo88360s());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m48148d0(final boolean enable) {
        l51.m152919y(new Runnable() { // from class: l.pp3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m48107a(enable);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m48149e0(boolean z) {
        hadVocal = z;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m48150f0(boolean mute) {
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20098o0(mute);
        }
        audioMute = mute;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m48151g0(int width, int height) {
        MMLiveEngine mMLiveEngine = mLiveEngine;
        zmw zmwVarM20047A = mMLiveEngine != null ? mMLiveEngine.m20047A() : null;
        if (zmwVarM20047A != null) {
            zmwVarM20047A.m220496M(width, height);
            MMLiveEngine mMLiveEngine2 = mLiveEngine;
            if (mMLiveEngine2 != null) {
                mMLiveEngine2.m20070O0(zmwVarM20047A);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m48152h0(boolean z) {
        isShowFace = z;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m48153i0(AudioBusinessType conflictBusinessType) {
        String strM148007c = k3d0.m148007c(R$string.f20939W0);
        int i = C8577a.f30954a[conflictBusinessType.ordinal()];
        if (i == 1) {
            strM148007c = AudioBusinessType.CHAT_ROOM_WINDOW.getBusinessMsg();
        } else if (i != 2) {
            k3d0.m148007c(R$string.f20939W0);
        } else {
            strM148007c = k3d0.m148007c(R$string.f20951b1);
        }
        o1j0.m165651y(strM148007c);
    }

    /* JADX INFO: renamed from: j */
    public final void m48154j() {
        if (NullChecker.m82486a(audioManager) && NullChecker.m82486a(afChangeListener) && audioFocusChangeListenerRun) {
            AudioManager audioManager2 = audioManager;
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(afChangeListener);
            }
            audioFocusChangeListenerRun = false;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m48155j0() {
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "startFloatMgr");
        pq3 pq3Var = floatManager;
        if (pq3Var != null) {
            pq3Var.m173290h();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m48156k0() {
        startLint = true;
        MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig = new MMLiveAudioVolumeConfig();
        mMLiveAudioVolumeConfig.interval = 1000;
        mMLiveAudioVolumeConfig.smooth = 3;
        mMLiveAudioVolumeConfig.report_vad = 1;
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20091h0(mMLiveAudioVolumeConfig);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[Catch: all -> 0x003d, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x002b, B:9:0x0031, B:11:0x0035, B:16:0x0045, B:15:0x0040, B:18:0x0049, B:19:0x0050, B:21:0x0065, B:23:0x006a, B:26:0x0073), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[Catch: all -> 0x003d, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x002b, B:9:0x0031, B:11:0x0035, B:16:0x0045, B:15:0x0040, B:18:0x0049, B:19:0x0050, B:21:0x0065, B:23:0x006a, B:26:0x0073), top: B:35:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: l0 */
    public final synchronized void m48157l0(@Nullable SurfaceView surface) {
        zmw zmwVar;
        MMLiveEngine mMLiveEngine;
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "startPreview surface is " + surface);
        enablePreview = true;
        boolean zEquals = TextUtils.equals(mediaCallType, "memojiBuzz");
        if (TextUtils.equals(mediaCallType, "voiceBuzz")) {
            if (zEquals) {
                do3.INSTANCE.m117148C(mLiveEngine);
            }
            zmwVar = new zmw(1, m48120A(), m48174z(), 15, surface);
            mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m20052C0(zmwVar);
            }
            if (zEquals && addMask.get() != 0) {
                do3 do3Var = do3.INSTANCE;
                do3Var.m117150E(mLiveEngine);
                do3Var.m117153m().subscribe(psd0.m173597H(new y20() { // from class: l.mp3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        BuzzMediaCallManager.m48111e((MaskModel) obj);
                    }
                }, new y20() { // from class: l.np3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        BuzzMediaCallManager.m48110d((Throwable) obj);
                    }
                }));
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT > 25) {
            try {
                MMLiveEngine mMLiveEngine2 = mLiveEngine;
                if (mMLiveEngine2 != null) {
                    mMLiveEngine2.m20088e0(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception unused) {
                isShowFace = true;
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            isShowFace = true;
        }
        if (zEquals) {
            do3.INSTANCE.m117148C(mLiveEngine);
        }
        zmwVar = new zmw(1, m48120A(), m48174z(), 15, surface);
        mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m20052C0(zmwVar);
        }
        if (zEquals) {
            do3 do3Var2 = do3.INSTANCE;
            do3Var2.m117150E(mLiveEngine);
            do3Var2.m117153m().subscribe(psd0.m173597H(new y20() { // from class: l.mp3
                @Override // p153l.y20
                public final void call(Object obj) {
                    BuzzMediaCallManager.m48111e((MaskModel) obj);
                }
            }, new y20() { // from class: l.np3
                @Override // p153l.y20
                public final void call(Object obj) {
                    BuzzMediaCallManager.m48110d((Throwable) obj);
                }
            }));
            return;
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: m */
    public final void m48158m() {
        Object systemService = CoreModule.f18263b.getSystemService("audio");
        systemService.getClass();
        audioManager = (AudioManager) systemService;
        afChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: l.qp3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                BuzzMediaCallManager.m48112f(i);
            }
        };
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48159m0() {
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "stopFloatMgr");
        pq3 pq3Var = floatManager;
        if (pq3Var != null) {
            pq3Var.m173291i();
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m48160n(boolean toast) {
        if (!Network.isConnected(CoreModule.f18263b)) {
            if (toast) {
                o1j0.m165649w(R$string.f20949b);
            }
            return false;
        }
        if (m48134P()) {
            if (toast) {
                o1j0.m165649w(R$string.f20907G0);
            }
            return false;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            return true;
        }
        if (toast) {
            audioBusinessTypeMo171474c.getClass();
            m48153i0(audioBusinessTypeMo171474c);
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final synchronized void m48161n0() {
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "stopPreview");
        if (enablePreview) {
            enablePreview = false;
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m20059G0();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m48162o0() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PHONE_STATE");
            intentFilter.setPriority(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            registerCount.incrementAndGet();
            jj5.m145017k(CoreModule.f18263b, phoneStateReceiver, intentFilter);
        } catch (SecurityException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m48163p(Act act, Function0<Unit> func, Function0<Unit> fail, String type, String... permission) {
        if (!k8w.INSTANCE.m148752a(act)) {
            fail.invoke();
            return;
        }
        if (!m48118o(this, false, 1, null)) {
            fail.invoke();
        } else if (m48165q(act, type, (String[]) Arrays.copyOf(permission, permission.length))) {
            pb1.m171472b().mo171477f(BuzzMediaCallManager.class.getSimpleName(), AudioBusinessType.BUZZ.setBusinessMsg(k3d0.m148007c(R$string.f20939W0)), new C8578b(func, fail));
        } else {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48164p0(@NotNull final Act act, @NotNull final Function0<Unit> func, @NotNull final Function0<Unit> fail) {
        act.getClass();
        func.getClass();
        fail.getClass();
        qn3.INSTANCE.m177194l(act, "videoBuzz", new Function0() { // from class: l.rp3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuzzMediaCallManager.m48109c(act, func, fail);
            }
        }, fail);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m48165q(@NotNull Act act, @NotNull String type, @NotNull String... permission) {
        act.getClass();
        type.getClass();
        permission.getClass();
        if (!PermissionHelper.m81064b((String[]) Arrays.copyOf(permission, permission.length))) {
            PermissionHelper.m81065c().m81083r((String[]) Arrays.copyOf(permission, permission.length)).m81088w(false).m81086u(true).m81074i(act);
            return false;
        }
        if (TextUtils.equals(type, "memojiBuzz")) {
            gp3 gp3Var = gp3.INSTANCE;
            if (!gp3Var.m131201e()) {
                gp3Var.m131202f();
                o1j0.m165637k(k3d0.m148007c(R$string.f21004x), true);
                return false;
            }
        }
        if (jpd0.m146488c()) {
            return true;
        }
        jpd0.m146489d();
        o1j0.m165637k(k3d0.m148007c(R$string.f20981l1), true);
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m48166q0(@NotNull Act act, @NotNull Function0<Unit> func, @NotNull Function0<Unit> fail) {
        act.getClass();
        func.getClass();
        fail.getClass();
        String[] strArr = wzx.m208784k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
        m48163p(act, func, fail, "voiceBuzz", (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: r */
    public final MMLiveRoomParams m48167r(String userId, MMLiveRoomParams.MMLivePushType lintType, String channel, String channelKey, String appId, String userSign, boolean onlyAudio) {
        MMLiveRoomParams mMLiveRoomParams = new MMLiveRoomParams();
        mMLiveRoomParams.userId = userId;
        mMLiveRoomParams.linkType = lintType;
        mMLiveRoomParams.channel = channel;
        mMLiveRoomParams.channelKey = channelKey;
        mMLiveRoomParams.confId = appId;
        mMLiveRoomParams.role = MMLiveRoomParams.MMLiveClientRole.MMLiveRTCClientRoleBroadcaster;
        mMLiveRoomParams.userSig = userSign;
        mMLiveRoomParams.onlyAudio = onlyAudio;
        return mMLiveRoomParams;
    }

    /* JADX INFO: renamed from: s */
    public final void m48168s() {
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "dispose");
        App.f16088e.unregisterActivityLifecycleCallbacks(floatManager);
        pq3 pq3Var = floatManager;
        if (pq3Var != null) {
            pq3Var.m173287e();
        }
        if (registerCount.get() > 0) {
            registerCount.set(0);
            try {
                CoreModule.f18263b.unregisterReceiver(phoneStateReceiver);
            } catch (Exception unused) {
            }
        }
        m48119v(this, 0, 1, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m48169t(@NotNull final String userId, final int lintType, @NotNull final String channel, @NotNull final String channelKey, @NotNull final String appId, @NotNull final String userSign) {
        userId.getClass();
        channel.getClass();
        channelKey.getClass();
        appId.getClass();
        userSign.getClass();
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "enterRoom, mediaCallType " + mediaCallType + " userId " + userId + " lintType " + lintType + " channel " + channel + " appId " + appId + " userSign " + userSign);
        haw.INSTANCE.m134320a().m134315v0();
        String str = mediaCallType;
        if (!Intrinsics.m88377d(str, "videoBuzz")) {
            Intrinsics.m88377d(str, "memojiBuzz");
        }
        boolean zM88377d = Intrinsics.m88377d(mediaCallType, "voiceBuzz");
        final boolean z = !zM88377d;
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            String str2 = CoreModule.f18264c.f20381e0.m116600p9().publicId;
            str2.getClass();
            mMLiveEngine.m20114y0(m48124E(str2, channel));
        }
        final MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        if (!zM88377d) {
            mMLiveTranscoding.videoBitrate = 1200000;
        }
        MMLiveEngine mMLiveEngine2 = mLiveEngine;
        if (mMLiveEngine2 != null) {
            mMLiveEngine2.m20106t0(pusherListener);
        }
        callState.onNext(BuzzCallState.PREPARE_JOINING_STATE);
        m48145a0();
        l51.m152919y(new Runnable() { // from class: l.lp3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m48115i(z, userId, lintType, channel, channelKey, appId, userSign, mMLiveTranscoding);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m48170u(int errorCode) {
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "forceLeaveRoom");
        m48132M(errorCode);
        m48147c0();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m48171w() {
        return audioMute;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final String m48172x(boolean video) {
        String str = video ? "200" : "201";
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "getBusinessType ".concat(str));
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final C22507a<BuzzCallState> m48173y() {
        return callState;
    }

    /* JADX INFO: renamed from: z */
    public final int m48174z() {
        BuzzResolution buzzResolution;
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        int i = (loveBuzzDataM134315v0 == null || (buzzResolution = loveBuzzDataM134315v0.recommendResolution) == null) ? 640 : buzzResolution.height;
        int i2 = i != 0 ? i : 640;
        xa2.INSTANCE.m209830a("BuzzMediaCallManager", "getCameraHeight, height " + i2);
        return i2;
    }
}
