package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.OnReceiveContentListener;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.base.vap.AnimView;
import com.p1.mobile.putong.live.base.vap.mix.c;
import com.p1.mobile.putong.live.base.vap.util.ScaleType;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.d30;
import l.e51;
import l.gkh0;
import l.hrl;
import l.irl;
import l.jml;
import l.no0;
import l.q4l0;
import l.r2m;
import l.t100;
import l.xdl0;
import l.yll;
import l.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p002l.AbstractC0675m4;
import p002l.f6l0;
import p002l.spe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\"\u0010&J\u0017\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u0010/J\u0019\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J+\u0010?\u001a\u00020\n2\u0010\u0010<\u001a\f\u0012\u0006\b\u0001\u0012\u00020;\u0018\u00010:2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\nH\u0014¢\u0006\u0004\bA\u0010\u0012J\u000f\u0010B\u001a\u00020\nH\u0014¢\u0006\u0004\bB\u0010\u0012J1\u0010J\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0G¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\u00020\n2\u0006\u0010D\u001a\u00020C2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020H0GH\u0002¢\u0006\u0004\bP\u0010QR\u001a\u0010V\u001a\u00020;8\u0006X\u0086D¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView;", "Lcom/p1/mobile/putong/live/base/vap/AnimView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/io/File;", "file", "", "p", "(Ljava/io/File;)V", "Ll/irl;", "fileContainer", "q", "(Ll/irl;)V", "r", "()V", "", "o", "()Z", "Lkotlin/Pair;", "", "getRealSize", "()Lkotlin/Pair;", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "isMute", "setMute", "(Z)V", "Ll/r2m;", "scaleType", "setScaleType", "(Ll/r2m;)V", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "type", "(Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;)V", "", "scaleX", "setScaleX", "(F)V", "scaleY", "setScaleY", "fps", "setFps", "(I)V", "playLoop", "setLoop", "Ll/jml;", "animListener", "setAnimListener", "(Ll/jml;)V", "Ll/hrl;", "fetchResource", "setFetchResource", "(Ll/hrl;)V", "", "", "mimeTypes", "Landroid/view/OnReceiveContentListener;", "listener", "setOnReceiveContentListener", "([Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;", "enterRoom", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "videoEffect", "Landroid/util/Pair;", "Landroid/graphics/Bitmap;", "bitmapPari", "v", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;Lcom/p1/mobile/putong/live/base/data/BLiveEffect;Landroid/util/Pair;)V", "Ll/d30;", "completeAction", "u", "(Ll/d30;)V", "w", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnterRoom;Landroid/util/Pair;)V", "l", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VapPlayerView extends AnimView {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$a */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$a", "Ll/yll;", "", "s", "s1", "", "i", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "e", "", "throwable", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0418a implements yll {
        /* JADX INFO: renamed from: a */
        public void m7829a(String s, String s1, Throwable throwable) {
            s.getClass();
            s1.getClass();
            throwable.getClass();
        }

        /* JADX INFO: renamed from: d */
        public void m7830d(String s, String s1) {
            s.getClass();
            s1.getClass();
        }

        /* JADX INFO: renamed from: e */
        public void m7831e(String s, String s1) {
            s.getClass();
            s1.getClass();
        }

        /* JADX INFO: renamed from: i */
        public void m7832i(String s, String s1) {
            s.getClass();
            s1.getClass();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$b */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$b", "Ll/jml;", "Ll/no0;", "animConfig", "", "e", "(Ll/no0;)Z", "", "c", "()V", "", "i", "d", "(ILl/no0;)V", "f", "b", "", "s", "a", "(ILjava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0419b implements jml {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d30 f6194b;

        public C0419b(d30 d30Var) {
            this.f6194b = d30Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public static void m7833g(VapPlayerView vapPlayerView) {
            xdl0.M(vapPlayerView, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public static void m7834h(VapPlayerView vapPlayerView, d30 d30Var) {
            xdl0.M(vapPlayerView, false);
            d30Var.call();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: i */
        public static void m7835i(int i, VapPlayerView vapPlayerView) {
            xdl0.D0(i, new View[]{vapPlayerView});
        }

        /* JADX INFO: renamed from: a */
        public void m7836a(int i, String s) {
            gkh0.j("[live][enter]", "vap play error " + i + " , msg = " + s);
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            e51.G(new Runnable() { // from class: l.wrk0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C0419b.m7833g(vapPlayerView);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public void m7837b() {
        }

        /* JADX INFO: renamed from: c */
        public void m7838c() {
        }

        /* JADX INFO: renamed from: d */
        public void m7839d(int i, no0 animConfig) {
            Objects.toString(animConfig);
        }

        /* JADX INFO: renamed from: e */
        public boolean m7840e(no0 animConfig) {
            animConfig.getClass();
            JSONObject jSONObjectE = animConfig.e();
            if (jSONObjectE != null) {
                jSONObjectE.toString();
            }
            float fD = animConfig.d();
            float fJ = animConfig.j();
            if (fD == 0.0f || fJ == 0.0f) {
                return true;
            }
            final int iD = (int) ((fJ / fD) * t100.d(100.0f));
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            xdl0.s0(new Runnable() { // from class: l.xrk0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C0419b.m7835i(iD, vapPlayerView);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: f */
        public void m7841f() {
            final VapPlayerView vapPlayerView = VapPlayerView.this;
            final d30 d30Var = this.f6194b;
            e51.G(new Runnable() { // from class: l.vrk0
                @Override // java.lang.Runnable
                public final void run() {
                    VapPlayerView.C0419b.m7834h(vapPlayerView, d30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.VapPlayerView$c */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/tray/VapPlayerView$c", "Ll/hrl;", "Lcom/p1/mobile/putong/live/base/vap/mix/c;", "resource", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "function1", "a", "(Lcom/p1/mobile/putong/live/base/vap/mix/c;Lkotlin/jvm/functions/Function1;)V", "", "c", "", "list", "b", "(Ljava/util/List;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0420c implements hrl {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Pair<Bitmap, Bitmap> f6195a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveEnterRoom f6196b;

        public C0420c(Pair<Bitmap, Bitmap> pair, BLiveEnterRoom bLiveEnterRoom) {
            this.f6195a = pair;
            this.f6196b = bLiveEnterRoom;
        }

        /* JADX INFO: renamed from: a */
        public void m7842a(c resource, Function1<? super Bitmap, Unit> function1) {
            resource.getClass();
            function1.getClass();
            if (TextUtils.equals(resource.a(), "03") && NullChecker.a(this.f6195a.first)) {
                function1.invoke(this.f6195a.first);
            } else if (TextUtils.equals(resource.a(), "04") && NullChecker.a(this.f6195a.second)) {
                function1.invoke(this.f6195a.second);
            } else {
                function1.invoke((Object) null);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m7843b(List<c> list) {
            list.getClass();
        }

        /* JADX INFO: renamed from: c */
        public void m7844c(c resource, Function1<? super String, Unit> function1) {
            String strConcat;
            resource.getClass();
            function1.getClass();
            if (!TextUtils.equals(resource.a(), "01")) {
                if (TextUtils.equals(resource.a(), "02")) {
                    function1.invoke("  " + this.f6196b.contentText);
                    return;
                }
                return;
            }
            int length = this.f6196b.userName.length();
            BLiveEnterRoom bLiveEnterRoom = this.f6196b;
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
        super(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        context.getClass();
        z0 z0Var = z0.INSTANCE;
        z0Var.e(false);
        z0Var.f(new C0418a());
        this.tag = "vap_player";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static void m7821t(f6l0 f6l0Var, BLiveEffect bLiveEffect, VapPlayerView vapPlayerView, q4l0 q4l0Var) {
        if (q4l0Var == null) {
            return;
        }
        File file = new File(f6l0Var.mo11105b(bLiveEffect) + "/video.mp4");
        if (file.isFile() && file.exists()) {
            vapPlayerView.setVisibility(0);
            vapPlayerView.m7823p(file);
        }
    }

    @NotNull
    public kotlin.Pair<Integer, Integer> getRealSize() {
        return super.getRealSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public Resources getResources() {
        Resources resources = super/*android.view.View*/.getResources();
        resources.getClass();
        return resources;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: o */
    public boolean m7822o() {
        return super.o();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: p */
    public void m7823p(@NotNull File file) {
        file.getClass();
        file.getPath();
        super.p(file);
    }

    /* JADX INFO: renamed from: q */
    public void m7824q(@NotNull irl fileContainer) {
        fileContainer.getClass();
        super.q(fileContainer);
    }

    /* JADX INFO: renamed from: r */
    public void m7825r() {
        super.r();
    }

    public void setAnimListener(@Nullable jml animListener) {
        super.setAnimListener(animListener);
    }

    public void setFetchResource(@Nullable hrl fetchResource) {
        super.setFetchResource(fetchResource);
    }

    public void setFps(int fps) {
        super.setFps(fps);
    }

    public void setLoop(int playLoop) {
        super.setLoop(playLoop);
    }

    public void setMute(boolean isMute) {
        super.setMute(isMute);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnReceiveContentListener(@Nullable String[] mimeTypes, @Nullable OnReceiveContentListener listener) {
        super/*android.widget.FrameLayout*/.setOnReceiveContentListener(mimeTypes, listener);
    }

    public void setScaleType(@NotNull r2m scaleType) {
        scaleType.getClass();
        super.setScaleType(scaleType);
        Objects.toString(scaleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScaleX(float scaleX) {
        super/*android.view.View*/.setScaleX(scaleX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setScaleY(float scaleY) {
        super/*android.view.View*/.setScaleY(scaleY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m7826u(@NotNull d30 completeAction) {
        completeAction.getClass();
        xdl0.D0(xdl0.y0(), new View[]{this});
        l(true);
        m(true);
        setScaleType(ScaleType.FIT_XY);
        setAnimListener(new C0419b(completeAction));
    }

    /* JADX INFO: renamed from: v */
    public final void m7827v(@NotNull BLiveEnterRoom enterRoom, @NotNull final BLiveEffect videoEffect, @NotNull Pair<Bitmap, Bitmap> bitmapPari) {
        enterRoom.getClass();
        videoEffect.getClass();
        bitmapPari.getClass();
        m7825r();
        m7828w(enterRoom, bitmapPari);
        AbstractC0675m4 abstractC0675m4M22604d = spe.m22604d("video");
        abstractC0675m4M22604d.getClass();
        final f6l0 f6l0Var = (f6l0) abstractC0675m4M22604d;
        f6l0Var.m12965m(videoEffect.id, videoEffect.hdType, videoEffect.zip, videoEffect.md5, new f6l0.InterfaceC0557a() { // from class: l.urk0
            @Override // p002l.f6l0.InterfaceC0557a
            /* JADX INFO: renamed from: a */
            public final void mo10170a(q4l0 q4l0Var) {
                VapPlayerView.m7821t(f6l0Var, videoEffect, this, q4l0Var);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m7828w(BLiveEnterRoom enterRoom, Pair<Bitmap, Bitmap> bitmapPari) {
        setFetchResource(new C0420c(bitmapPari, enterRoom));
    }

    public void setScaleType(@NotNull ScaleType type) {
        type.getClass();
        super.setScaleType(type);
        Objects.toString(type);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public VapPlayerView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ VapPlayerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
