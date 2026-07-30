package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.OnReceiveContentListener;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.vap.AnimView;
import com.p046p1.mobile.putong.live.base.vap.mix.C12470c;
import com.p046p1.mobile.putong.live.base.vap.util.ScaleType;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.AbstractC18387m4;
import p149l.C21588z0;
import p149l.d30;
import p149l.e51;
import p149l.f6l0;
import p149l.gkh0;
import p149l.hrl;
import p149l.irl;
import p149l.jml;
import p149l.no0;
import p149l.q4l0;
import p149l.r2m;
import p149l.spe;
import p149l.t100;
import p149l.xdl0;
import p149l.yll;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\"\u0010&J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u0010/J\u0019\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J+\u0010?\u001a\u00020\n2\u0010\u0010<\u001a\f\u0012\u0006\b\u0001\u0012\u00020;\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\nH\u0014¢\u0006\u0004\bA\u0010\u0012J\u000f\u0010B\u001a\u00020\nH\u0014¢\u0006\u0004\bB\u0010\u0012J1\u0010J\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0GH\u0002¢\u0006\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020;8\u0006X\u0086D¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView;", "Lcom/p1/mobile/putong/live/base/vap/AnimView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/io/File;", "file", "", "p", "(Ljava/io/File;)V", "Ll/irl;", "fileContainer", "q", "(Ll/irl;)V", "r", "()V", "", "o", "()Z", "Lkotlin/Pair;", "", "getRealSize", "()Lkotlin/Pair;", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "isMute", "setMute", "(Z)V", "Ll/r2m;", "scaleType", "setScaleType", "(Ll/r2m;)V", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "type", "(Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;)V", "", "scaleX", "setScaleX", "(F)V", "scaleY", "setScaleY", "fps", "setFps", "(I)V", "playLoop", "setLoop", "Ll/jml;", "animListener", "setAnimListener", "(Ll/jml;)V", "Ll/hrl;", "fetchResource", "setFetchResource", "(Ll/hrl;)V", "", "", "mimeTypes", "Landroid/view/OnReceiveContentListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnReceiveContentListener", "([Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;", "enterRoom", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "videoEffect", "Landroid/util/Pair;", "Landroid/graphics/Bitmap;", "bitmapPari", ResourceDirection.f38808v, "(Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;Lcom/p1/mobile/putong/live/base/data/BLiveEffect;Landroid/util/Pair;)V", "Ll/d30;", "completeAction", "u", "(Ll/d30;)V", "w", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;Landroid/util/Pair;)V", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VapPlayerView extends AnimView {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$a */
    @Metadata(m87231d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$a", "Ll/yll;", "", BLiveStormDanmakuGiftResourceType.f44446s, "s1", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "e", "", "throwable", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12829a implements yll {
        @Override // p149l.yll
        /* JADX INFO: renamed from: a */
        public void mo74254a(String s, String s1, Throwable throwable) {
            s.getClass();
            s1.getClass();
            throwable.getClass();
        }

        @Override // p149l.yll
        /* JADX INFO: renamed from: d */
        public void mo74255d(String s, String s1) {
            s.getClass();
            s1.getClass();
        }

        @Override // p149l.yll
        /* JADX INFO: renamed from: e */
        public void mo74256e(String s, String s1) {
            s.getClass();
            s1.getClass();
        }

        @Override // p149l.yll
        /* JADX INFO: renamed from: i */
        public void mo74257i(String s, String s1) {
            s.getClass();
            s1.getClass();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$b */
    @Metadata(m87231d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$b", "Ll/jml;", "Ll/no0;", "animConfig", "", "e", "(Ll/no0;)Z", "", "c", "()V", "", RXScreenCaptureService.KEY_INDEX, Constants.INAPP_DATA_TAG, "(ILl/no0;)V", "f", "b", "", BLiveStormDanmakuGiftResourceType.f44446s, "a", "(ILjava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12830b implements jml {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f50152b;

        public C12830b(d30 d30Var) {
            this.f50152b = d30Var;
        }

        /* JADX INFO: renamed from: g */
        public static void m74258g(VapPlayerView vapPlayerView) {
            xdl0.m208344M(vapPlayerView, false);
        }

        /* JADX INFO: renamed from: h */
        public static void m74259h(VapPlayerView vapPlayerView, d30 d30Var) {
            xdl0.m208344M(vapPlayerView, false);
            d30Var.call();
        }

        /* JADX INFO: renamed from: i */
        public static void m74260i(int i, VapPlayerView vapPlayerView) {
            xdl0.m208327D0(i, vapPlayerView);
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: a */
        public void mo68643a(int i, String s) {
            gkh0.m126627j("[live][enter]", "vap play error " + i + " , msg = " + s);
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            e51.m114742G(new Runnable() { // from class: l.wrk0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C12830b.m74258g(vapPlayerView);
                }
            });
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: b */
        public void mo68644b() {
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: c */
        public void mo68645c() {
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: d */
        public void mo68646d(int i, no0 animConfig) {
            Objects.toString(animConfig);
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: e */
        public boolean mo68647e(no0 animConfig) {
            animConfig.getClass();
            JSONObject jsonConfig = animConfig.getJsonConfig();
            if (jsonConfig != null) {
                jsonConfig.toString();
            }
            float height = animConfig.getHeight();
            float width = animConfig.getWidth();
            if (height == 0.0f || width == 0.0f) {
                return true;
            }
            final int iM186890d = (int) ((width / height) * t100.m186890d(100.0f));
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            xdl0.m208400s0(new Runnable() { // from class: l.xrk0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C12830b.m74260i(iM186890d, vapPlayerView);
                }
            });
            return true;
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: f */
        public void mo68648f() {
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            final d30 d30Var = this.f50152b;
            e51.m114742G(new Runnable() { // from class: l.vrk0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C12830b.m74259h(vapPlayerView, d30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$c */
    @Metadata(m87231d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$c", "Ll/hrl;", "Lcom/p1/mobile/putong/live/base/vap/mix/c;", "resource", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "function1", "a", "(Lcom/p1/mobile/putong/live/base/vap/mix/c;Lkotlin/jvm/functions/Function1;)V", "", "c", "", "list", "b", "(Ljava/util/List;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12831c implements hrl {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pair<Bitmap, Bitmap> f50153a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEnterRoom f50154b;

        public C12831c(Pair<Bitmap, Bitmap> pair, BLiveEnterRoom bLiveEnterRoom) {
            this.f50153a = pair;
            this.f50154b = bLiveEnterRoom;
        }

        @Override // p149l.hrl
        /* JADX INFO: renamed from: a */
        public void mo74261a(C12470c resource, Function1<? super Bitmap, Unit> function1) {
            resource.getClass();
            function1.getClass();
            if (TextUtils.equals(resource.getTag(), "03") && NullChecker.m81303a(this.f50153a.first)) {
                function1.invoke(this.f50153a.first);
            } else if (TextUtils.equals(resource.getTag(), "04") && NullChecker.m81303a(this.f50153a.second)) {
                function1.invoke(this.f50153a.second);
            } else {
                function1.invoke(null);
            }
        }

        @Override // p149l.hrl
        /* JADX INFO: renamed from: b */
        public void mo74262b(List<C12470c> list) {
            list.getClass();
        }

        @Override // p149l.hrl
        /* JADX INFO: renamed from: c */
        public void mo74263c(C12470c resource, Function1<? super String, Unit> function1) {
            String strConcat;
            resource.getClass();
            function1.getClass();
            if (!TextUtils.equals(resource.getTag(), "01")) {
                if (TextUtils.equals(resource.getTag(), "02")) {
                    function1.invoke("  " + this.f50154b.contentText);
                    return;
                }
                return;
            }
            int length = this.f50154b.userName.length();
            BLiveEnterRoom bLiveEnterRoom = this.f50154b;
            if (length > 6) {
                String str = bLiveEnterRoom.userName;
                str.getClass();
                strConcat = str.substring(0, 6).concat("...");
            } else {
                strConcat = bLiveEnterRoom.userName;
                strConcat.getClass();
            }
            function1.invoke("  " + strConcat);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VapPlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        context.getClass();
        C21588z0 c21588z0 = C21588z0.INSTANCE;
        c21588z0.m216710e(false);
        c21588z0.m216711f(new C12829a());
        this.tag = "vap_player";
    }

    /* JADX INFO: renamed from: t */
    public static void m74250t(f6l0 f6l0Var, BLiveEffect bLiveEffect, VapPlayerView vapPlayerView, q4l0 q4l0Var) {
        if (q4l0Var == null) {
            return;
        }
        File file = new File(f6l0Var.mo107443b(bLiveEffect) + "/video.mp4");
        if (file.isFile() && file.exists()) {
            vapPlayerView.setVisibility(0);
            vapPlayerView.mo68639p(file);
        }
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView, p149l.lml
    @NotNull
    public kotlin.Pair<Integer, Integer> getRealSize() {
        return super.getRealSize();
    }

    @Override // android.view.View
    @NotNull
    public Resources getResources() {
        Resources resources = super.getResources();
        resources.getClass();
        return resources;
    }

    @Override // android.view.View
    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: o */
    public boolean mo68638o() {
        return super.mo68638o();
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: p */
    public void mo68639p(@NotNull File file) {
        file.getClass();
        file.getPath();
        super.mo68639p(file);
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: q */
    public void mo68640q(@NotNull irl fileContainer) {
        fileContainer.getClass();
        super.mo68640q(fileContainer);
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: r */
    public void mo68641r() {
        super.mo68641r();
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    public void setAnimListener(@Nullable jml animListener) {
        super.setAnimListener(animListener);
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    public void setFetchResource(@Nullable hrl fetchResource) {
        super.setFetchResource(fetchResource);
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    public void setFps(int fps) {
        super.setFps(fps);
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    public void setLoop(int playLoop) {
        super.setLoop(playLoop);
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    public void setMute(boolean isMute) {
        super.setMute(isMute);
    }

    @Override // android.view.View
    public void setOnReceiveContentListener(@Nullable String[] mimeTypes, @Nullable OnReceiveContentListener listener) {
        super.setOnReceiveContentListener(mimeTypes, listener);
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    public void setScaleType(@NotNull r2m scaleType) {
        scaleType.getClass();
        super.setScaleType(scaleType);
        Objects.toString(scaleType);
    }

    @Override // android.view.View
    public void setScaleX(float scaleX) {
        super.setScaleX(scaleX);
    }

    @Override // android.view.View
    public void setScaleY(float scaleY) {
        super.setScaleY(scaleY);
    }

    /* JADX INFO: renamed from: u */
    public final void m74251u(@NotNull d30 completeAction) {
        completeAction.getClass();
        xdl0.m208327D0(xdl0.m208412y0(), this);
        m68635l(true);
        m68636m(true);
        setScaleType(ScaleType.FIT_XY);
        setAnimListener(new C12830b(completeAction));
    }

    /* JADX INFO: renamed from: v */
    public final void m74252v(@NotNull BLiveEnterRoom enterRoom, @NotNull final BLiveEffect videoEffect, @NotNull Pair<Bitmap, Bitmap> bitmapPari) {
        enterRoom.getClass();
        videoEffect.getClass();
        bitmapPari.getClass();
        mo68641r();
        m74253w(enterRoom, bitmapPari);
        AbstractC18387m4 abstractC18387m4M185365d = spe.m185365d("video");
        abstractC18387m4M185365d.getClass();
        final f6l0 f6l0Var = (f6l0) abstractC18387m4M185365d;
        f6l0Var.m119628m(videoEffect.f44359id, videoEffect.hdType, videoEffect.zip, videoEffect.md5, new f6l0.InterfaceC16768a() { // from class: l.urk0
            @Override // p149l.f6l0.InterfaceC16768a
            /* JADX INFO: renamed from: a */
            public final void mo100430a(q4l0 q4l0Var) {
                VapPlayerView.m74250t(f6l0Var, videoEffect, this, q4l0Var);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m74253w(BLiveEnterRoom enterRoom, Pair<Bitmap, Bitmap> bitmapPari) {
        setFetchResource(new C12831c(bitmapPari, enterRoom));
    }

    @Override // com.p046p1.mobile.putong.live.base.vap.AnimView
    public void setScaleType(@NotNull ScaleType type) {
        type.getClass();
        super.setScaleType(type);
        Objects.toString(type);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public VapPlayerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ VapPlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
