package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.OnReceiveContentListener;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.vap.AnimView;
import com.p051p1.mobile.putong.live.base.vap.mix.C12633c;
import com.p051p1.mobile.putong.live.base.vap.util.ScaleType;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.AbstractC18340l4;
import p153l.C21726z0;
import p153l.bnl0;
import p153l.jfl0;
import p153l.jo0;
import p153l.k5m;
import p153l.kol;
import p153l.l51;
import p153l.nsh0;
import p153l.qa00;
import p153l.udl0;
import p153l.vol;
import p153l.vtl;
import p153l.wqe;
import p153l.wtl;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\"\u0010&J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u0010/J\u0019\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J+\u0010?\u001a\u00020\n2\u0010\u0010<\u001a\f\u0012\u0006\b\u0001\u0012\u00020;\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\nH\u0014¢\u0006\u0004\bA\u0010\u0012J\u000f\u0010B\u001a\u00020\nH\u0014¢\u0006\u0004\bB\u0010\u0012J1\u0010J\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0GH\u0002¢\u0006\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020;8\u0006X\u0086D¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView;", "Lcom/p1/mobile/putong/live/base/vap/AnimView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/io/File;", "file", "", "p", "(Ljava/io/File;)V", "Ll/wtl;", "fileContainer", "q", "(Ll/wtl;)V", "r", "()V", "", "o", "()Z", "Lkotlin/Pair;", "", "getRealSize", "()Lkotlin/Pair;", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "isMute", "setMute", "(Z)V", "Ll/k5m;", "scaleType", "setScaleType", "(Ll/k5m;)V", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "type", "(Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;)V", "", "scaleX", "setScaleX", "(F)V", "scaleY", "setScaleY", "fps", "setFps", "(I)V", "playLoop", "setLoop", "Ll/vol;", "animListener", "setAnimListener", "(Ll/vol;)V", "Ll/vtl;", "fetchResource", "setFetchResource", "(Ll/vtl;)V", "", "", "mimeTypes", "Landroid/view/OnReceiveContentListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnReceiveContentListener", "([Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;", "enterRoom", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "videoEffect", "Landroid/util/Pair;", "Landroid/graphics/Bitmap;", "bitmapPari", ResourceDirection.f39656v, "(Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;Lcom/p1/mobile/putong/live/base/data/BLiveEffect;Landroid/util/Pair;)V", "Ll/x20;", "completeAction", "u", "(Ll/x20;)V", "w", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;Landroid/util/Pair;)V", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VapPlayerView extends AnimView {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$a */
    @Metadata(m88120d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$a", "Ll/kol;", "", BLiveStormDanmakuGiftResourceType.f45294s, "s1", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "e", "", "throwable", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C12992a implements kol {
        @Override // p153l.kol
        /* JADX INFO: renamed from: a */
        public void mo75437a(String s, String s1, Throwable throwable) {
            s.getClass();
            s1.getClass();
            throwable.getClass();
        }

        @Override // p153l.kol
        /* JADX INFO: renamed from: d */
        public void mo75438d(String s, String s1) {
            s.getClass();
            s1.getClass();
        }

        @Override // p153l.kol
        /* JADX INFO: renamed from: e */
        public void mo75439e(String s, String s1) {
            s.getClass();
            s1.getClass();
        }

        @Override // p153l.kol
        /* JADX INFO: renamed from: i */
        public void mo75440i(String s, String s1) {
            s.getClass();
            s1.getClass();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$b */
    @Metadata(m88120d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$b", "Ll/vol;", "Ll/jo0;", "animConfig", "", "e", "(Ll/jo0;)Z", "", "c", "()V", "", RXScreenCaptureService.KEY_INDEX, Constants.INAPP_DATA_TAG, "(ILl/jo0;)V", "f", "b", "", BLiveStormDanmakuGiftResourceType.f45294s, "a", "(ILjava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C12993b implements vol {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ x20 f51000b;

        public C12993b(x20 x20Var) {
            this.f51000b = x20Var;
        }

        /* JADX INFO: renamed from: g */
        public static void m75441g(VapPlayerView vapPlayerView) {
            bnl0.m105524M(vapPlayerView, false);
        }

        /* JADX INFO: renamed from: h */
        public static void m75442h(VapPlayerView vapPlayerView, x20 x20Var) {
            bnl0.m105524M(vapPlayerView, false);
            x20Var.call();
        }

        /* JADX INFO: renamed from: i */
        public static void m75443i(int i, VapPlayerView vapPlayerView) {
            bnl0.m105507D0(i, vapPlayerView);
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: a */
        public void mo69826a(int i, String s) {
            nsh0.m164608j("[live][enter]", "vap play error " + i + " , msg = " + s);
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            l51.m152887G(new Runnable() { // from class: l.c1l0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C12993b.m75441g(vapPlayerView);
                }
            });
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: b */
        public void mo69827b() {
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: c */
        public void mo69828c() {
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: d */
        public void mo69829d(int i, jo0 animConfig) {
            Objects.toString(animConfig);
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: e */
        public boolean mo69830e(jo0 animConfig) {
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
            final int iM175859d = (int) ((width / height) * qa00.m175859d(100.0f));
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            bnl0.m105580s0(new Runnable() { // from class: l.d1l0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C12993b.m75443i(iM175859d, vapPlayerView);
                }
            });
            return true;
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: f */
        public void mo69831f() {
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            final x20 x20Var = this.f51000b;
            l51.m152887G(new Runnable() { // from class: l.b1l0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C12993b.m75442h(vapPlayerView, x20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$c */
    @Metadata(m88120d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$c", "Ll/vtl;", "Lcom/p1/mobile/putong/live/base/vap/mix/c;", "resource", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "function1", "a", "(Lcom/p1/mobile/putong/live/base/vap/mix/c;Lkotlin/jvm/functions/Function1;)V", "", "c", "", "list", "b", "(Ljava/util/List;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C12994c implements vtl {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pair<Bitmap, Bitmap> f51001a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEnterRoom f51002b;

        public C12994c(Pair<Bitmap, Bitmap> pair, BLiveEnterRoom bLiveEnterRoom) {
            this.f51001a = pair;
            this.f51002b = bLiveEnterRoom;
        }

        @Override // p153l.vtl
        /* JADX INFO: renamed from: a */
        public void mo75444a(C12633c resource, Function1<? super Bitmap, Unit> function1) {
            resource.getClass();
            function1.getClass();
            if (TextUtils.equals(resource.getTag(), "03") && NullChecker.m82486a(this.f51001a.first)) {
                function1.invoke(this.f51001a.first);
            } else if (TextUtils.equals(resource.getTag(), "04") && NullChecker.m82486a(this.f51001a.second)) {
                function1.invoke(this.f51001a.second);
            } else {
                function1.invoke(null);
            }
        }

        @Override // p153l.vtl
        /* JADX INFO: renamed from: b */
        public void mo75445b(List<C12633c> list) {
            list.getClass();
        }

        @Override // p153l.vtl
        /* JADX INFO: renamed from: c */
        public void mo75446c(C12633c resource, Function1<? super String, Unit> function1) {
            String strConcat;
            resource.getClass();
            function1.getClass();
            if (!TextUtils.equals(resource.getTag(), "01")) {
                if (TextUtils.equals(resource.getTag(), "02")) {
                    function1.invoke("  " + this.f51002b.contentText);
                    return;
                }
                return;
            }
            int length = this.f51002b.userName.length();
            BLiveEnterRoom bLiveEnterRoom = this.f51002b;
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
        C21726z0 c21726z0 = C21726z0.INSTANCE;
        c21726z0.m218096e(false);
        c21726z0.m218097f(new C12992a());
        this.tag = "vap_player";
    }

    /* JADX INFO: renamed from: t */
    public static void m75433t(jfl0 jfl0Var, BLiveEffect bLiveEffect, VapPlayerView vapPlayerView, udl0 udl0Var) {
        if (udl0Var == null) {
            return;
        }
        File file = new File(jfl0Var.mo144686b(bLiveEffect) + "/video.mp4");
        if (file.isFile() && file.exists()) {
            vapPlayerView.setVisibility(0);
            vapPlayerView.mo69822p(file);
        }
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView, p153l.xol
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

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: o */
    public boolean mo69821o() {
        return super.mo69821o();
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: p */
    public void mo69822p(@NotNull File file) {
        file.getClass();
        file.getPath();
        super.mo69822p(file);
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: q */
    public void mo69823q(@NotNull wtl fileContainer) {
        fileContainer.getClass();
        super.mo69823q(fileContainer);
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    /* JADX INFO: renamed from: r */
    public void mo69824r() {
        super.mo69824r();
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    public void setAnimListener(@Nullable vol animListener) {
        super.setAnimListener(animListener);
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    public void setFetchResource(@Nullable vtl fetchResource) {
        super.setFetchResource(fetchResource);
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    public void setFps(int fps) {
        super.setFps(fps);
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    public void setLoop(int playLoop) {
        super.setLoop(playLoop);
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    public void setMute(boolean isMute) {
        super.setMute(isMute);
    }

    @Override // android.view.View
    public void setOnReceiveContentListener(@Nullable String[] mimeTypes, @Nullable OnReceiveContentListener listener) {
        super.setOnReceiveContentListener(mimeTypes, listener);
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
    public void setScaleType(@NotNull k5m scaleType) {
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
    public final void m75434u(@NotNull x20 completeAction) {
        completeAction.getClass();
        bnl0.m105507D0(bnl0.m105592y0(), this);
        m69818l(true);
        m69819m(true);
        setScaleType(ScaleType.FIT_XY);
        setAnimListener(new C12993b(completeAction));
    }

    /* JADX INFO: renamed from: v */
    public final void m75435v(@NotNull BLiveEnterRoom enterRoom, @NotNull final BLiveEffect videoEffect, @NotNull Pair<Bitmap, Bitmap> bitmapPari) {
        enterRoom.getClass();
        videoEffect.getClass();
        bitmapPari.getClass();
        mo69824r();
        m75436w(enterRoom, bitmapPari);
        AbstractC18340l4 abstractC18340l4M207509d = wqe.m207509d("video");
        abstractC18340l4M207509d.getClass();
        final jfl0 jfl0Var = (jfl0) abstractC18340l4M207509d;
        jfl0Var.m144689m(videoEffect.f45207id, videoEffect.hdType, videoEffect.zip, videoEffect.md5, new jfl0.InterfaceC17940a() { // from class: l.a1l0
            @Override // p153l.jfl0.InterfaceC17940a
            /* JADX INFO: renamed from: a */
            public final void mo95516a(udl0 udl0Var) {
                VapPlayerView.m75433t(jfl0Var, videoEffect, this, udl0Var);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m75436w(BLiveEnterRoom enterRoom, Pair<Bitmap, Bitmap> bitmapPari) {
        setFetchResource(new C12994c(bitmapPari, enterRoom));
    }

    @Override // com.p051p1.mobile.putong.live.base.vap.AnimView
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
