package com.p046p1.mobile.putong.core.p053ui.lovebuzz.media;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.BuzzResolution;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.akw;
import p149l.b2s;
import p149l.dn3;
import p149l.e30;
import p149l.e51;
import p149l.fkw;
import p149l.ghd0;
import p149l.go3;
import p149l.h6w;
import p149l.hvc0;
import p149l.ib1;
import p149l.ii5;
import p149l.j6f;
import p149l.j8w;
import p149l.lsi0;
import p149l.m6w;
import p149l.mkd0;
import p149l.pp3;
import p149l.px0;
import p149l.qa2;
import p149l.qm3;
import p149l.z91;
import p149l.zqx;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\t*\u0004²\u0001µ\u0001\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#JO\u0010+\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0019\u001a\u00020\f2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0)\"\u00020\fH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u0003J-\u00107\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00106\u001a\u00020\f¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0014¢\u0006\u0004\b;\u0010<J=\u0010=\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0004¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010@\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\u0004¢\u0006\u0004\bA\u0010\u0003J\r\u0010B\u001a\u00020\u0004¢\u0006\u0004\bB\u0010\u0003J\u0015\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0014¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0014¢\u0006\u0004\bG\u0010EJ\r\u0010H\u001a\u00020\u0004¢\u0006\u0004\bH\u0010\u0003J\r\u0010I\u001a\u00020\u0004¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\u0004H\u0000¢\u0006\u0004\bJ\u0010\u0003J\u001d\u0010M\u001a\u0002022\u0006\u0010K\u001a\u00020\f2\u0006\u0010L\u001a\u00020\f¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00042\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u0004¢\u0006\u0004\bW\u0010\u0003J1\u0010X\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\u0004\bX\u0010YJ1\u0010Z\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\u0004\bZ\u0010YJ1\u0010[\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\u0004\b[\u0010YJ1\u0010\\\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\f2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0)\"\u00020\f¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u0014¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u0014¢\u0006\u0004\ba\u0010<J\r\u0010b\u001a\u00020\u0014¢\u0006\u0004\bb\u0010<J\r\u0010c\u001a\u00020\u0014¢\u0006\u0004\bc\u0010<J\r\u0010d\u001a\u00020\u0014¢\u0006\u0004\bd\u0010<J\r\u0010e\u001a\u00020\u0014¢\u0006\u0004\be\u0010<J\r\u0010f\u001a\u00020\u0004¢\u0006\u0004\bf\u0010\u0003J\r\u0010g\u001a\u00020\u0004¢\u0006\u0004\bg\u0010\u0003J\u0017\u0010i\u001a\u00020\f2\b\b\u0002\u0010h\u001a\u00020\u0014¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0014¢\u0006\u0004\bk\u0010<R\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020m0l8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00140l8\u0006¢\u0006\f\n\u0004\bs\u0010o\u001a\u0004\bt\u0010qR\"\u0010y\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010J\u001a\u0004\bw\u0010<\"\u0004\bx\u0010ER\"\u0010}\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010J\u001a\u0004\b{\u0010<\"\u0004\b|\u0010ER\u0017\u0010\u0080\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010JR\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R,\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010JR\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R?\u0010¢\u0001\u001a&\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0006\u0012\u0004\u0018\u00010O0\u009c\u0001j\u0012\u0012\u0005\u0012\u00030\u009d\u0001\u0012\u0006\u0012\u0004\u0018\u00010O`\u009e\u00018\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R%\u0010¥\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b_\u0010J\u001a\u0005\b£\u0001\u0010<\"\u0005\b¤\u0001\u0010ER&\u0010©\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010J\u001a\u0005\b§\u0001\u0010<\"\u0005\b¨\u0001\u0010ER%\u0010¬\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b+\u0010J\u001a\u0005\bª\u0001\u0010<\"\u0005\b«\u0001\u0010ER\"\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u00ad\u00018\u0006¢\u0006\u000f\n\u0005\b\\\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u007fR\u0017\u0010´\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010³\u0001R\u0017\u0010·\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010¶\u0001R)\u0010¼\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b@\u0010\u009a\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001¨\u0006½\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager;", "", "<init>", "()V", "", "m", "a0", "j", "", "errorCode", "M", "(I)V", "", "userId", "Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;", "lintType", "channel", "channelKey", RemoteConfigConstants.RequestFieldKey.APP_ID, "userSign", "", "onlyAudio", "Lcom/immomo/momomediaext/utils/MMLiveRoomParams;", "r", "(Ljava/lang/String;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/immomo/momomediaext/utils/MMLiveRoomParams;", "type", "F", "(I)Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;", "userVideo", "Lcom/immomo/momomediaext/utils/MMLiveMediaConfig;", "D", "(Z)Lcom/immomo/momomediaext/utils/MMLiveMediaConfig;", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "conflictBusinessType", "i0", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lkotlin/Function0;", "func", "fail", "", "permission", "p", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;[Ljava/lang/String;)V", "A", "()I", BaseSei.f13932Z, "o0", "K", "Lcom/immomo/momomediaext/utils/MMLiveUserConfig;", Constants.KEY_CONFIG, "Landroid/content/Context;", "context", "provider", "L", "(Lcom/immomo/momomediaext/utils/MMLiveUserConfig;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "b0", "(Ljava/lang/String;)V", "R", "()Z", Constants.KEY_T, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "k0", "u", j6f.GPS_MEASUREMENT_INTERRUPTED, "W", BLiveButtonType.mute, "f0", "(Z)V", "enable", "d0", "c0", BLiveStormDanmakuGiftResourceType.f44446s, "Z", "pubId", "roomId", "E", "(Ljava/lang/String;Ljava/lang/String;)Lcom/immomo/momomediaext/utils/MMLiveUserConfig;", "Landroid/view/SurfaceView;", "surface", "l0", "(Landroid/view/SurfaceView;)V", "width", "height", "g0", "(II)V", "n0", "q0", "(Lcom/p1/mobile/android/app/Act;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "p0", "X", "q", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;[Ljava/lang/String;)Z", OMSTemplateModeType.toast, "n", "(Z)Z", "P", j6f.LATITUDE_SOUTH, BloodType.f38728O, "Q", "U", "m0", "j0", "video", BaseSei.f13930X, "(Z)Ljava/lang/String;", "Y", "Lrx/subjects/a;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzCallState;", "a", "Lrx/subjects/a;", BaseSei.f13931Y, "()Lrx/subjects/a;", "callState", "b", b2s.C_ZONE, "inMediaBuzzCallState", "c", "w", "setAudioMute", "audioMute", Constants.INAPP_DATA_TAG, "H", "setSpeakerPhone", "speakerPhone", "e", "Ljava/lang/String;", "mediaCallType", "f", "enablePreview", "Lcom/immomo/momomediaext/MMLiveEngine;", "g", "Lcom/immomo/momomediaext/MMLiveEngine;", "mLiveEngine", "Ll/pp3;", "h", "Ll/pp3;", "getFloatManager$buzz_intlGmsRelease", "()Ll/pp3;", "setFloatManager$buzz_intlGmsRelease", "(Ll/pp3;)V", "floatManager", "Landroid/media/AudioManager;", RXScreenCaptureService.KEY_INDEX, "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "afChangeListener", "k", "audioFocusChangeListenerRun", "Ljava/util/concurrent/atomic/AtomicInteger;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/concurrent/atomic/AtomicInteger;", "registerCount", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "J", "()Ljava/util/HashMap;", "userSurfaceInfoMap", "B", "e0", "hadVocal", "o", j6f.GPS_DIRECTION_TRUE, "h0", "isShowFace", "I", "setStartLint", "startLint", "Lrx/subjects/b;", "Lrx/subjects/b;", "G", "()Lrx/subjects/b;", "selfShowFaceSub", "com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$phoneStateReceiver$1", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$phoneStateReceiver$1;", "phoneStateReceiver", "com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$c", "Lcom/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$c;", "pusherListener", "getAddMask", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setAddMask", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "addMask", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BuzzMediaCallManager {

    @NotNull
    public static final BuzzMediaCallManager INSTANCE = new BuzzMediaCallManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<BuzzCallState> callState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C22392a<Boolean> inMediaBuzzCallState;

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
    public static pp3 floatManager;

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
    public static final C22393b<Boolean> selfShowFaceSub;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public static String provider;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static final BuzzMediaCallManager$phoneStateReceiver$1 phoneStateReceiver;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public static final C8416c pusherListener;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static AtomicInteger addMask;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8414a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30106a;

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
            f30106a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$b", "Ll/z91;", "", "success", "()V", "", "currentBusinessKey", "Lcom/p1/mobile/putong/util/audio/AudioBusinessType;", "currentType", "currentCallBack", "conflictBusinessKey", "conflictBusinessType", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ll/z91;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "current", "businessKey", "focusBusinessType", "b", "(Lcom/p1/mobile/putong/util/audio/AudioBusinessType;Ljava/lang/String;Lcom/p1/mobile/putong/util/audio/AudioBusinessType;)V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8415b implements z91 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f30107a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0<Unit> f30108b;

        public C8415b(Function0<Unit> function0, Function0<Unit> function1) {
            this.f30107a = function0;
            this.f30108b = function1;
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType current, String businessKey, AudioBusinessType focusBusinessType) {
            current.getClass();
            businessKey.getClass();
            focusBusinessType.getClass();
            BuzzMediaCallManager.INSTANCE.m46958W();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String currentBusinessKey, AudioBusinessType currentType, z91 currentCallBack, String conflictBusinessKey, AudioBusinessType conflictBusinessType) {
            currentBusinessKey.getClass();
            currentType.getClass();
            currentCallBack.getClass();
            conflictBusinessKey.getClass();
            conflictBusinessType.getClass();
            if (conflictBusinessType.isHighLevelBusiness()) {
                BuzzMediaCallManager.INSTANCE.m46970i0(conflictBusinessType);
                this.f30108b.invoke();
            } else {
                ib1.m135233b().mo135239g(currentBusinessKey, currentType, currentCallBack);
                this.f30107a.invoke();
            }
        }

        @Override // p149l.z91
        public void success() {
            this.f30107a.invoke();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$c */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m87231d1 = {"\u0000O\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\fJ+\u0010\u001a\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J+\u0010-\u001a\u00020\u00062\u0010\u0010,\u001a\f\u0012\u0006\b\u0001\u0012\u00020+\u0018\u00010*2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010)¨\u00061"}, m87232d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/media/BuzzMediaCallManager$c", "Ll/fkw;", "", Oauth2AccessToken.KEY_UID, "", "data", "", "U", "(I[B)V", "Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;", "pushType", Constants.KEY_T, "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "rtcType", "u", "Lcom/immomo/momomediaext/utils/MMLiveErrorInfo;", "error", "o", "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;Lcom/immomo/momomediaext/utils/MMLiveErrorInfo;)V", "r", "(Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;I)V", "p", "q", "", "channel", "", BaseSei.f13932Z, "(Ljava/lang/String;JLcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", Reason.TYPE, "A", "(Ljava/lang/String;ILcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", UserId.TYPE, "Z", "(Ljava/lang/String;Ljava/lang/String;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "Landroid/view/SurfaceView;", "surfaceView", j6f.LATITUDE_SOUTH, "(Ljava/lang/String;Landroid/view/SurfaceView;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "a0", "routing", Constants.INAPP_DATA_TAG, "(I)V", "", "Lcom/immomo/mediacore/audio/AudioVolumeWeight;", "speakers", "e0", "([Lcom/immomo/mediacore/audio/AudioVolumeWeight;Lcom/immomo/momomediaext/utils/MMLiveRoomParams$MMLivePushType;)V", "count", ResourceDirection.f38808v, "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8416c extends fkw {
        @Override // p149l.fkw
        /* JADX INFO: renamed from: A */
        public void mo46992A(String channel, int reason, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo46992A(channel, reason, rtcType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onLocalLeaveChannel:" + channel + " reason:" + reason);
            BuzzMediaCallManager.INSTANCE.m46990y().onNext(BuzzCallState.LEAVE_STATE);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: S */
        public void mo46993S(String uid, SurfaceView surfaceView, MMLiveRoomParams.MMLivePushType rtcType) {
            uid.getClass();
            super.mo46993S(uid, surfaceView, rtcType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onVideoChannelAdded:" + uid);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            buzzMediaCallManager.m46946J().put(Long.valueOf(Long.parseLong(uid)), surfaceView);
            buzzMediaCallManager.m46990y().onNext(BuzzCallState.PEER_VIDEO_JOIN);
            buzzMediaCallManager.m46990y().onNext(BuzzCallState.RECEIVE_PEER_VIDEO_FIRST);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: U */
        public void mo46994U(int uid, byte[] data) {
            super.mo46994U(uid, data);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onStreamMessage uid " + uid + " data " + data);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: Z */
        public void mo46995Z(String channel, String userid, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo46995Z(channel, userid, rtcType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onMemberJoinChannel:" + userid + " channel:" + channel);
            BuzzMediaCallManager.INSTANCE.m46990y().onNext(BuzzCallState.PEER_JOINED_STATE);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: a0 */
        public void mo46996a0(String uid, int reason, MMLiveRoomParams.MMLivePushType rtcType) {
            uid.getClass();
            super.mo46996a0(uid, reason, rtcType);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            buzzMediaCallManager.m46946J().remove(Long.valueOf(Long.parseLong(uid)));
            qa2 qa2Var = qa2.INSTANCE;
            qa2Var.m173681a("BuzzMediaCallManager", "onVideoChannelRemove:" + uid);
            buzzMediaCallManager.m46990y().onNext(BuzzCallState.PEER_VIDEO_REMOVE);
            qa2Var.m173681a("BuzzMediaCallManager", "onMemberLeaveChannel:" + uid + " reason:" + reason + " rtc:" + rtcType);
            buzzMediaCallManager.m46990y().onNext(BuzzCallState.MEMBER_LEAVE);
            BuzzMediaCallManager.m46936v(buzzMediaCallManager, 0, 1, null);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: d */
        public void mo46997d(int routing) {
            super.mo46997d(routing);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onAudioRouteChanged routing " + routing);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: e0 */
        public void mo46998e0(AudioVolumeWeight[] speakers, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo46998e0(speakers, rtcType);
            if (BuzzMediaCallManager.INSTANCE.m46938B() || speakers == null) {
                return;
            }
            for (AudioVolumeWeight audioVolumeWeight : speakers) {
                if (audioVolumeWeight.voicePitch > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && audioVolumeWeight.volume > 0.0f && TextUtils.equals(String.valueOf(audioVolumeWeight.uid), CoreModule.m29931H().userId())) {
                    BuzzMediaCallManager.INSTANCE.m46966e0(true);
                    return;
                }
            }
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: o */
        public void mo46999o(MMLiveRoomParams.MMLivePushType rtcType, MMLiveErrorInfo error) {
            error.getClass();
            super.mo46999o(rtcType, error);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onEngineError:" + rtcType + " what:" + error.what + " extra:" + error.extra);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            buzzMediaCallManager.m46990y().onNext(BuzzCallState.CONNECTION_LOST);
            buzzMediaCallManager.m46987u(error.what);
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: p */
        public void mo47000p(MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo47000p(rtcType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onEngineBufferStart");
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: q */
        public void mo47001q(MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo47001q(rtcType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onEngineBufferStopped");
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: r */
        public void mo47002r(MMLiveRoomParams.MMLivePushType rtcType, int error) {
            super.mo47002r(rtcType, error);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onEnginePushReplaced");
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: t */
        public void mo47003t(MMLiveRoomParams.MMLivePushType pushType) {
            super.mo47003t(pushType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onEnginePushStarted");
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: u */
        public void mo47004u(MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo47004u(rtcType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onEnginePushStopped");
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: v */
        public void mo47005v(int count) {
            super.mo47005v(count);
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (buzzMediaCallManager.m46945I()) {
                buzzMediaCallManager.m46969h0(true);
                buzzMediaCallManager.m46943G().onNext(Boolean.TRUE);
            }
        }

        @Override // p149l.fkw
        /* JADX INFO: renamed from: z */
        public void mo47006z(String channel, long uid, MMLiveRoomParams.MMLivePushType rtcType) {
            super.mo47006z(channel, uid, rtcType);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "onLocalJoinChannel:" + uid + " channel:" + channel);
            if (Intrinsics.m87488d(BuzzMediaCallManager.mediaCallType, "voiceBuzz")) {
                BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
                buzzMediaCallManager.m46965d0(buzzMediaCallManager.m46944H());
            }
            BuzzMediaCallManager.INSTANCE.m46990y().onNext(BuzzCallState.LOCAL_JOINED_STATE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$phoneStateReceiver$1] */
    static {
        C22392a<BuzzCallState> c22392aM221513c = C22392a.m221513c(BuzzCallState.UN_INIT_STATE);
        c22392aM221513c.getClass();
        callState = c22392aM221513c;
        C22392a<Boolean> c22392aM221513c2 = C22392a.m221513c(Boolean.FALSE);
        c22392aM221513c2.getClass();
        inMediaBuzzCallState = c22392aM221513c2;
        mediaCallType = "voiceBuzz";
        registerCount = new AtomicInteger(0);
        userSurfaceInfoMap = new HashMap<>();
        C22393b<Boolean> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        selfShowFaceSub = c22393bM221521b;
        provider = "1";
        phoneStateReceiver = new BroadcastReceiver() { // from class: com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager$phoneStateReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                context.getClass();
                intent.getClass();
                if (Intrinsics.m87488d("android.intent.action.PHONE_STATE", intent.getAction())) {
                    BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
                    if (!buzzMediaCallManager.m46950O() && buzzMediaCallManager.m46953R()) {
                        buzzMediaCallManager.m46990y().onNext(BuzzCallState.CONNECTION_LOST);
                        BuzzMediaCallManager.m46936v(buzzMediaCallManager, 0, 1, null);
                    }
                }
            }
        };
        pusherListener = new C8416c();
        addMask = new AtomicInteger(-1);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m46923N(BuzzMediaCallManager buzzMediaCallManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        buzzMediaCallManager.m46949M(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m46924a(boolean z) {
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
            mMLiveEngine.m19113j0(z);
        }
        speakerPhone = z;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m46925b(Act act, Function0 function0, Function0 function1) {
        INSTANCE.m46980p(act, function0, function1, "memojiBuzz", new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m46926c(Act act, Function0 function0, Function0 function1) {
        INSTANCE.m46980p(act, function0, function1, "videoBuzz", new String[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m46927d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static void m46928e(MaskModel maskModel) {
        if (maskModel != null) {
            addMask.set(1);
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m19125t(maskModel);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m46929f(int i) {
        BuzzMediaCallManager buzzMediaCallManager = INSTANCE;
        if (!buzzMediaCallManager.m46950O() && buzzMediaCallManager.m46953R()) {
            m46936v(buzzMediaCallManager, 0, 1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m46930g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        INSTANCE.m46961Z();
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "ioLeave----consume " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: h */
    public static void m46931h() {
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19085L();
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m46932i(boolean z, String str, int i, String str2, String str3, String str4, String str5, MMLiveTranscoding mMLiveTranscoding) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                BuzzMediaCallManager buzzMediaCallManager = INSTANCE;
                mMLiveEngine.m19130w(buzzMediaCallManager.m46940D(z), buzzMediaCallManager.m46984r(str, buzzMediaCallManager.m46942F(i), str2, str3, str4, str5, !z), mMLiveTranscoding);
            }
        } catch (Exception unused) {
        }
        qa2 qa2Var = qa2.INSTANCE;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C22392a<BuzzCallState> c22392a = callState;
        qa2Var.m173681a("BuzzMediaCallManager", "enter room consume " + jCurrentTimeMillis2 + " callState is " + c22392a.m221515e());
        if (c22392a.m221515e() == BuzzCallState.PREPARE_JOINING_STATE) {
            c22392a.onNext(BuzzCallState.JOINING_STATE);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m46935o(BuzzMediaCallManager buzzMediaCallManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return buzzMediaCallManager.m46977n(z);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m46936v(BuzzMediaCallManager buzzMediaCallManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        buzzMediaCallManager.m46987u(i);
    }

    /* JADX INFO: renamed from: A */
    public final int m46937A() {
        BuzzResolution buzzResolution;
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        int i = (loveBuzzDataM140468v0 == null || (buzzResolution = loveBuzzDataM140468v0.recommendResolution) == null) ? 480 : buzzResolution.width;
        int i2 = i != 0 ? i : 480;
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "getCameraWidth, width " + i2);
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m46938B() {
        return hadVocal;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final C22392a<Boolean> m46939C() {
        return inMediaBuzzCallState;
    }

    /* JADX INFO: renamed from: D */
    public final MMLiveMediaConfig m46940D(boolean userVideo) {
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioBitrate = 64000;
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.encodeHeight = m46991z();
        mMLiveMediaConfig.encodeWidth = m46937A();
        mMLiveMediaConfig.videoBitRate = 1200000;
        mMLiveMediaConfig.videoFPS = 15;
        mMLiveMediaConfig.businessType = Integer.parseInt(m46989x(userVideo));
        mMLiveMediaConfig.cdnType = Integer.parseInt(provider);
        return mMLiveMediaConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final MMLiveUserConfig m46941E(@NotNull String pubId, @NotNull String roomId) {
        pubId.getClass();
        roomId.getClass();
        return new MMLiveUserConfig(CoreModule.m29936Q().mo67270ih(), CoreModule.m29936Q().mo67222Hh(), pubId, roomId, px0.m171778b(App.f15369e), px0.m171777a(App.f15369e), false);
    }

    /* JADX INFO: renamed from: F */
    public final MMLiveRoomParams.MMLivePushType m46942F(int type) {
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
    public final C22393b<Boolean> m46943G() {
        return selfShowFaceSub;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m46944H() {
        return speakerPhone;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m46945I() {
        return startLint;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final HashMap<Long, SurfaceView> m46946J() {
        return userSurfaceInfoMap;
    }

    /* JADX INFO: renamed from: K */
    public final void m46947K() {
        if (NullChecker.m81303a(floatManager)) {
            App.f15369e.unregisterActivityLifecycleCallbacks(floatManager);
        }
        floatManager = new pp3();
        App.f15369e.registerActivityLifecycleCallbacks(floatManager);
        m46979o0();
        m46975m();
    }

    /* JADX INFO: renamed from: L */
    public final synchronized void m46948L(@NotNull MMLiveUserConfig config, @NotNull Context context, @NotNull String type, @NotNull String provider2) {
        config.getClass();
        context.getClass();
        type.getClass();
        provider2.getClass();
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "initEngine, config is " + config);
        callState.onNext(BuzzCallState.INIT_STATE);
        mLiveEngine = new MMLiveEngine(config, context);
        mediaCallType = type;
        provider = provider2;
    }

    /* JADX INFO: renamed from: M */
    public final void m46949M(int errorCode) {
        h6w h6wVar = h6w.INSTANCE;
        if (h6wVar.m129529a(mediaCallType)) {
            h6wVar.m129530b(mediaCallType);
        }
        j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
        String str = mediaCallType;
        boolean z = false;
        if (!Intrinsics.m87488d(mediaCallType, "voiceBuzz") && !isShowFace) {
            z = true;
        }
        j8wVarM140473a.m140426K0(str, z, !hadVocal, errorCode);
        if (!Intrinsics.m87488d(mediaCallType, "voiceBuzz")) {
            m46978n0();
        }
        m46971j();
        e51.m114774y(new Runnable() { // from class: l.ko3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m46930g();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final boolean m46950O() {
        BuzzCallState buzzCallStateM221515e = callState.m221515e();
        return buzzCallStateM221515e == BuzzCallState.LEAVE_STATE || buzzCallStateM221515e == BuzzCallState.MEMBER_LEAVE || buzzCallStateM221515e == BuzzCallState.UN_INIT_STATE || buzzCallStateM221515e == BuzzCallState.INIT_STATE || buzzCallStateM221515e == BuzzCallState.CONNECTION_LOST || buzzCallStateM221515e == BuzzCallState.RECEIVE_PHONE_CALL;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m46951P() {
        return !m46950O();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m46952Q() {
        return m46954S() || m46951P();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m46953R() {
        try {
            Object systemService = CoreModule.f17544b.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            return (telephonyManager == null || telephonyManager.getCallState() == 0) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m46954S() {
        C22392a<BuzzCallState> c22392a = callState;
        return c22392a.m221515e() == BuzzCallState.PREPARE_JOINING_STATE || c22392a.m221515e() == BuzzCallState.INIT_STATE;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m46955T() {
        return isShowFace;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m46956U() {
        return !Intrinsics.m87488d(mediaCallType, "voiceBuzz");
    }

    /* JADX INFO: renamed from: V */
    public final void m46957V() {
        m46971j();
        callState.onNext(BuzzCallState.INIT_STATE);
        e51.m114774y(new Runnable() { // from class: l.oo3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m46931h();
            }
        });
        m46964c0();
    }

    /* JADX INFO: renamed from: W */
    public final void m46958W() {
        if (!m46950O()) {
            callState.onNext(BuzzCallState.LEAVE_STATE);
            m46923N(this, 0, 1, null);
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "leaveRoom----");
            m46964c0();
            return;
        }
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "leaveRoom, but status is " + callState.m221515e());
    }

    /* JADX INFO: renamed from: X */
    public final void m46959X(@NotNull final Act act, @NotNull final Function0<Unit> func, @NotNull final Function0<Unit> fail) {
        act.getClass();
        func.getClass();
        fail.getClass();
        qm3.INSTANCE.m175543l(act, "memojiBuzz", new Function0() { // from class: l.so3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuzzMediaCallManager.m46925b(act, func, fail);
            }
        }, fail);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m46960Y() {
        MaskModel maskModelM112599F = dn3.INSTANCE.m112599F();
        if (addMask.get() == 1) {
            addMask.set(0);
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m19099V(maskModelM112599F);
            }
        } else {
            addMask.set(1);
            MMLiveEngine mMLiveEngine2 = mLiveEngine;
            if (mMLiveEngine2 != null) {
                mMLiveEngine2.m19125t(maskModelM112599F);
            }
        }
        return addMask.get() == 1;
    }

    /* JADX INFO: renamed from: Z */
    public final synchronized void m46961Z() {
        try {
            qa2.INSTANCE.m173681a("BuzzMediaCallManager", "releaseRtc");
            callState.onNext(BuzzCallState.UN_INIT_STATE);
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m19096S();
            }
            mLiveEngine = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX INFO: renamed from: a0 */
    public final void m46962a0() {
        boolean z;
        if (NullChecker.m81303a(audioManager) && NullChecker.m81303a(afChangeListener) && !audioFocusChangeListenerRun) {
            AudioManager audioManager2 = audioManager;
            Integer numValueOf = audioManager2 != null ? Integer.valueOf(audioManager2.requestAudioFocus(afChangeListener, 3, 2)) : null;
            if (numValueOf != null) {
                z = numValueOf.intValue() == 1;
            }
            audioFocusChangeListenerRun = z;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m46963b0(@NotNull String type) {
        type.getClass();
        mediaCallType = type;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m46964c0() {
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "resetState");
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19126t0(null);
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
        j8w.INSTANCE.m140473a().m140456n0();
        ib1.m135233b().mo135237e(Reflection.m87507b(BuzzMediaCallManager.class).mo87471s());
    }

    /* JADX INFO: renamed from: d0 */
    public final void m46965d0(final boolean enable) {
        e51.m114774y(new Runnable() { // from class: l.po3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m46924a(enable);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m46966e0(boolean z) {
        hadVocal = z;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m46967f0(boolean mute) {
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19118o0(mute);
        }
        audioMute = mute;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m46968g0(int width, int height) {
        MMLiveEngine mMLiveEngine = mLiveEngine;
        akw akwVarM19067A = mMLiveEngine != null ? mMLiveEngine.m19067A() : null;
        if (akwVarM19067A != null) {
            akwVarM19067A.m97191M(width, height);
            MMLiveEngine mMLiveEngine2 = mLiveEngine;
            if (mMLiveEngine2 != null) {
                mMLiveEngine2.m19090O0(akwVarM19067A);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m46969h0(boolean z) {
        isShowFace = z;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m46970i0(AudioBusinessType conflictBusinessType) {
        String strM133156c = hvc0.m133156c(R$string.f20197W0);
        int i = C8414a.f30106a[conflictBusinessType.ordinal()];
        if (i == 1) {
            strM133156c = AudioBusinessType.CHAT_ROOM_WINDOW.getBusinessMsg();
        } else if (i != 2) {
            hvc0.m133156c(R$string.f20197W0);
        } else {
            strM133156c = hvc0.m133156c(R$string.f20209b1);
        }
        lsi0.m151595y(strM133156c);
    }

    /* JADX INFO: renamed from: j */
    public final void m46971j() {
        if (NullChecker.m81303a(audioManager) && NullChecker.m81303a(afChangeListener) && audioFocusChangeListenerRun) {
            AudioManager audioManager2 = audioManager;
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(afChangeListener);
            }
            audioFocusChangeListenerRun = false;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m46972j0() {
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "startFloatMgr");
        pp3 pp3Var = floatManager;
        if (pp3Var != null) {
            pp3Var.m170704h();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m46973k0() {
        startLint = true;
        MMLiveAudioVolumeConfig mMLiveAudioVolumeConfig = new MMLiveAudioVolumeConfig();
        mMLiveAudioVolumeConfig.interval = 1000;
        mMLiveAudioVolumeConfig.smooth = 3;
        mMLiveAudioVolumeConfig.report_vad = 1;
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19111h0(mMLiveAudioVolumeConfig);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[Catch: all -> 0x003d, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x002b, B:9:0x0031, B:11:0x0035, B:16:0x0045, B:15:0x0040, B:18:0x0049, B:19:0x0050, B:21:0x0065, B:23:0x006a, B:26:0x0073), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065 A[Catch: all -> 0x003d, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x002b, B:9:0x0031, B:11:0x0035, B:16:0x0045, B:15:0x0040, B:18:0x0049, B:19:0x0050, B:21:0x0065, B:23:0x006a, B:26:0x0073), top: B:35:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: l0 */
    public final synchronized void m46974l0(@Nullable SurfaceView surface) {
        akw akwVar;
        MMLiveEngine mMLiveEngine;
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "startPreview surface is " + surface);
        enablePreview = true;
        boolean zEquals = TextUtils.equals(mediaCallType, "memojiBuzz");
        if (TextUtils.equals(mediaCallType, "voiceBuzz")) {
            if (zEquals) {
                dn3.INSTANCE.m112596C(mLiveEngine);
            }
            akwVar = new akw(1, m46937A(), m46991z(), 15, surface);
            mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m19072C0(akwVar);
            }
            if (zEquals && addMask.get() != 0) {
                dn3 dn3Var = dn3.INSTANCE;
                dn3Var.m112598E(mLiveEngine);
                dn3Var.m112601m().subscribe(mkd0.m154956H(new e30() { // from class: l.mo3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        BuzzMediaCallManager.m46928e((MaskModel) obj);
                    }
                }, new e30() { // from class: l.no3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        BuzzMediaCallManager.m46927d((Throwable) obj);
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
                    mMLiveEngine2.m19108e0(MomoMediaConstants$BEAUTY_TYPE.BEAUTY_TYPE_ENGINE);
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
            dn3.INSTANCE.m112596C(mLiveEngine);
        }
        akwVar = new akw(1, m46937A(), m46991z(), 15, surface);
        mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            mMLiveEngine.m19072C0(akwVar);
        }
        if (zEquals) {
            dn3 dn3Var2 = dn3.INSTANCE;
            dn3Var2.m112598E(mLiveEngine);
            dn3Var2.m112601m().subscribe(mkd0.m154956H(new e30() { // from class: l.mo3
                @Override // p149l.e30
                public final void call(Object obj) {
                    BuzzMediaCallManager.m46928e((MaskModel) obj);
                }
            }, new e30() { // from class: l.no3
                @Override // p149l.e30
                public final void call(Object obj) {
                    BuzzMediaCallManager.m46927d((Throwable) obj);
                }
            }));
            return;
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: m */
    public final void m46975m() {
        Object systemService = CoreModule.f17544b.getSystemService("audio");
        systemService.getClass();
        audioManager = (AudioManager) systemService;
        afChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: l.qo3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                BuzzMediaCallManager.m46929f(i);
            }
        };
    }

    /* JADX INFO: renamed from: m0 */
    public final void m46976m0() {
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "stopFloatMgr");
        pp3 pp3Var = floatManager;
        if (pp3Var != null) {
            pp3Var.m170705i();
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m46977n(boolean toast) {
        if (!Network.isConnected(CoreModule.f17544b)) {
            if (toast) {
                lsi0.m151593w(R$string.f20207b);
            }
            return false;
        }
        if (m46951P()) {
            if (toast) {
                lsi0.m151593w(R$string.f20165G0);
            }
            return false;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            return true;
        }
        if (toast) {
            audioBusinessTypeMo135235c.getClass();
            m46970i0(audioBusinessTypeMo135235c);
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final synchronized void m46978n0() {
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "stopPreview");
        if (enablePreview) {
            enablePreview = false;
            MMLiveEngine mMLiveEngine = mLiveEngine;
            if (mMLiveEngine != null) {
                mMLiveEngine.m19079G0();
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m46979o0() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PHONE_STATE");
            intentFilter.setPriority(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            registerCount.incrementAndGet();
            ii5.m136341k(CoreModule.f17544b, phoneStateReceiver, intentFilter);
        } catch (SecurityException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m46980p(Act act, Function0<Unit> func, Function0<Unit> fail, String type, String... permission) {
        if (!m6w.INSTANCE.m153296a(act)) {
            fail.invoke();
            return;
        }
        if (!m46935o(this, false, 1, null)) {
            fail.invoke();
        } else if (m46982q(act, type, (String[]) Arrays.copyOf(permission, permission.length))) {
            ib1.m135233b().mo135238f(BuzzMediaCallManager.class.getSimpleName(), AudioBusinessType.BUZZ.setBusinessMsg(hvc0.m133156c(R$string.f20197W0)), new C8415b(func, fail));
        } else {
            fail.invoke();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m46981p0(@NotNull final Act act, @NotNull final Function0<Unit> func, @NotNull final Function0<Unit> fail) {
        act.getClass();
        func.getClass();
        fail.getClass();
        qm3.INSTANCE.m175543l(act, "videoBuzz", new Function0() { // from class: l.ro3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuzzMediaCallManager.m46926c(act, func, fail);
            }
        }, fail);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m46982q(@NotNull Act act, @NotNull String type, @NotNull String... permission) {
        act.getClass();
        type.getClass();
        permission.getClass();
        if (!PermissionHelper.m79881b((String[]) Arrays.copyOf(permission, permission.length))) {
            PermissionHelper.m79882c().m79900r((String[]) Arrays.copyOf(permission, permission.length)).m79905w(false).m79903u(true).m79891i(act);
            return false;
        }
        if (TextUtils.equals(type, "memojiBuzz")) {
            go3 go3Var = go3.INSTANCE;
            if (!go3Var.m127227e()) {
                go3Var.m127228f();
                lsi0.m151581k(hvc0.m133156c(R$string.f20262x), true);
                return false;
            }
        }
        if (ghd0.m126179c()) {
            return true;
        }
        ghd0.m126180d();
        lsi0.m151581k(hvc0.m133156c(R$string.f20239l1), true);
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m46983q0(@NotNull Act act, @NotNull Function0<Unit> func, @NotNull Function0<Unit> fail) {
        act.getClass();
        func.getClass();
        fail.getClass();
        String[] strArr = zqx.m219898k() ? new String[]{"android.permission.RECORD_AUDIO"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
        m46980p(act, func, fail, "voiceBuzz", (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: r */
    public final MMLiveRoomParams m46984r(String userId, MMLiveRoomParams.MMLivePushType lintType, String channel, String channelKey, String appId, String userSign, boolean onlyAudio) {
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
    public final void m46985s() {
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "dispose");
        App.f15369e.unregisterActivityLifecycleCallbacks(floatManager);
        pp3 pp3Var = floatManager;
        if (pp3Var != null) {
            pp3Var.m170701e();
        }
        if (registerCount.get() > 0) {
            registerCount.set(0);
            try {
                CoreModule.f17544b.unregisterReceiver(phoneStateReceiver);
            } catch (Exception unused) {
            }
        }
        m46936v(this, 0, 1, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m46986t(@NotNull final String userId, final int lintType, @NotNull final String channel, @NotNull final String channelKey, @NotNull final String appId, @NotNull final String userSign) {
        userId.getClass();
        channel.getClass();
        channelKey.getClass();
        appId.getClass();
        userSign.getClass();
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "enterRoom, mediaCallType " + mediaCallType + " userId " + userId + " lintType " + lintType + " channel " + channel + " appId " + appId + " userSign " + userSign);
        j8w.INSTANCE.m140473a().m140468v0();
        String str = mediaCallType;
        if (!Intrinsics.m87488d(str, "videoBuzz")) {
            Intrinsics.m87488d(str, "memojiBuzz");
        }
        boolean zM87488d = Intrinsics.m87488d(mediaCallType, "voiceBuzz");
        final boolean z = !zM87488d;
        MMLiveEngine mMLiveEngine = mLiveEngine;
        if (mMLiveEngine != null) {
            String str2 = CoreModule.f17545c.f19639e0.m169527p9().publicId;
            str2.getClass();
            mMLiveEngine.m19134y0(m46941E(str2, channel));
        }
        final MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        if (!zM87488d) {
            mMLiveTranscoding.videoBitrate = 1200000;
        }
        MMLiveEngine mMLiveEngine2 = mLiveEngine;
        if (mMLiveEngine2 != null) {
            mMLiveEngine2.m19126t0(pusherListener);
        }
        callState.onNext(BuzzCallState.PREPARE_JOINING_STATE);
        m46962a0();
        e51.m114774y(new Runnable() { // from class: l.lo3
            @Override // java.lang.Runnable
            public final void run() {
                BuzzMediaCallManager.m46932i(z, userId, lintType, channel, channelKey, appId, userSign, mMLiveTranscoding);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final void m46987u(int errorCode) {
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "forceLeaveRoom");
        m46949M(errorCode);
        m46964c0();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m46988w() {
        return audioMute;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final String m46989x(boolean video) {
        String str = video ? "200" : "201";
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "getBusinessType ".concat(str));
        return str;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final C22392a<BuzzCallState> m46990y() {
        return callState;
    }

    /* JADX INFO: renamed from: z */
    public final int m46991z() {
        BuzzResolution buzzResolution;
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        int i = (loveBuzzDataM140468v0 == null || (buzzResolution = loveBuzzDataM140468v0.recommendResolution) == null) ? 640 : buzzResolution.height;
        int i2 = i != 0 ? i : 640;
        qa2.INSTANCE.m173681a("BuzzMediaCallManager", "getCameraHeight, height " + i2);
        return i2;
    }
}
