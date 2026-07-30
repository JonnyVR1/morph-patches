package p149l;

import android.app.Application;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.Priority;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001N\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020!0#H\u0002¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010/R\u001b\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010F\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010/\"\u0004\bE\u0010\u0019R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010GR0\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060Ij\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010KR0\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0Ij\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010KR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010O¨\u0006Q"}, m87232d2 = {"Ll/fhs;", "", "Ll/ihs;", "itemModel", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", "giftItemView", "", "position", "Ll/ahs;", "presenter", "<init>", "(Ll/ihs;Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;ILl/ahs;)V", NotificationCompat.CATEGORY_STATUS, "", "withDownload", "Ll/e30;", "finishResult", "", "f", "(IZLl/e30;)V", BLiveStormDanmakuGiftResourceType.f44446s, "()V", "g", "progress", "u", "(I)V", "n", "(Z)V", "m", "", "errMsg", "p", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;", BaseSei.INFO, "", "list", "Ljava/io/File;", "file", "r", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;Ljava/util/List;Ljava/io/File;)V", "totalEffectSize", "q", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;II)V", "o", "()Z", RXScreenCaptureService.KEY_INDEX, "()I", "k", "()Ljava/lang/String;", "h", "()Ljava/util/List;", "a", "Ll/ihs;", "getItemModel", "()Ll/ihs;", "b", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", "c", "I", "getPosition", Constants.INAPP_DATA_TAG, "Ll/ahs;", "getPresenter", "()Ll/ahs;", "e", "j", Constants.KEY_T, "currentState", "Ll/e30;", "finishAction", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "progressMap", "successMap", "l/fhs$a", "Ll/fhs$a;", "downloadListener", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fhs {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ihs itemModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LiveGiftItemView giftItemView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int position;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ahs<?> presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int currentState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> finishAction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Integer> progressMap;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Boolean> successMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C16835a downloadListener;

    /* JADX INFO: renamed from: l.fhs$a */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"l/fhs$a", "Ll/h7e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16835a implements h7e {
        public C16835a() {
        }

        /* JADX INFO: renamed from: e */
        public static void m121445e(fhs fhsVar, C16835a c16835a, String str) {
            if (fhsVar.getGiftItemView().isShowing()) {
                c16835a.onFailed(str);
            }
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(File file) {
            file.getClass();
            fhs.this.m121443t(4);
            xdl0.m208344M(fhs.this.getGiftItemView().f49525o, false);
            xdl0.m208344M(fhs.this.getGiftItemView().f49526p, true);
            xdl0.m208344M(fhs.this.getGiftItemView().f49527q, true);
            fhs.this.getGiftItemView().setAlpha(1.0f);
            e30 e30Var = fhs.this.finishAction;
            if (e30Var != null) {
                e30Var.call(Integer.valueOf(fhs.this.getCurrentState()));
            }
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: b */
        public void mo75217b(int progress) {
            fhs.this.m121443t(2);
            fhs.this.getGiftItemView().f49518h.setText(w8u.m202217t(R$string.f47295i5));
            fhs.this.m121444u(progress);
            e30 e30Var = fhs.this.finishAction;
            if (e30Var != null) {
                e30Var.call(Integer.valueOf(fhs.this.getCurrentState()));
            }
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo74249c(boolean z) {
            super.mo74249c(z);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: d */
        public void mo75218d(final String errMsg) {
            errMsg.getClass();
            Application application = App.f15369e;
            final fhs fhsVar = fhs.this;
            e51.m114743H(application, new Runnable() { // from class: l.dhs
                @Override // java.lang.Runnable
                public final void run() {
                    fhs.C16835a.m121445e(fhsVar, this, errMsg);
                }
            }, 500L);
        }

        @Override // p149l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p149l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            fhs.this.m121443t(3);
            fhs.this.getGiftItemView().f49518h.setText(w8u.m202217t(R$string.f47338k5));
            fhs.this.getGiftItemView().f49526p.setText(w8u.m202217t(R$string.f47316j5));
            fhs.this.getGiftItemView().setAlpha(0.5f);
            xdl0.m208344M(fhs.this.getGiftItemView().f49525o, false);
            xdl0.m208344M(fhs.this.getGiftItemView().f49526p, true);
            e30 e30Var = fhs.this.finishAction;
            if (e30Var != null) {
                e30Var.call(Integer.valueOf(fhs.this.getCurrentState()));
            }
        }

        @Override // p149l.h7e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: l.fhs$b */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"l/fhs$b", "Ll/h7e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16836b implements h7e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftGearEffectInfo f97558b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f97559c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List<BLiveGiftGearEffectInfo> f97560d;

        /* JADX WARN: Multi-variable type inference failed */
        public C16836b(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, int i, List<? extends BLiveGiftGearEffectInfo> list) {
            this.f97558b = bLiveGiftGearEffectInfo;
            this.f97559c = i;
            this.f97560d = list;
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(File file) {
            file.getClass();
            fhs.this.m121441r(this.f97558b, this.f97560d, file);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: b */
        public void mo75217b(int progress) {
            fhs.this.m121440q(this.f97558b, progress, this.f97559c);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo74249c(boolean z) {
            super.mo74249c(z);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: d */
        public void mo75218d(String errMsg) {
            errMsg.getClass();
            fhs.this.m121439p(errMsg);
        }

        @Override // p149l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p149l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            fhs.this.m121439p(errMsg);
        }

        @Override // p149l.h7e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: l.fhs$c */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"l/fhs$c", "Ll/h7e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16837c implements h7e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftGearEffectInfo f97562b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f97563c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List<BLiveGiftGearEffectInfo> f97564d;

        /* JADX WARN: Multi-variable type inference failed */
        public C16837c(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, int i, List<? extends BLiveGiftGearEffectInfo> list) {
            this.f97562b = bLiveGiftGearEffectInfo;
            this.f97563c = i;
            this.f97564d = list;
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(File file) {
            file.getClass();
            fhs.this.m121441r(this.f97562b, this.f97564d, file);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: b */
        public void mo75217b(int progress) {
            fhs.this.m121440q(this.f97562b, progress, this.f97563c);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo74249c(boolean z) {
            super.mo74249c(z);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: d */
        public /* bridge */ void mo75218d(String str) {
            super.mo75218d(str);
        }

        @Override // p149l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p149l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            fhs.this.m121439p(errMsg);
        }

        @Override // p149l.h7e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    public fhs(@NotNull ihs ihsVar, @NotNull LiveGiftItemView liveGiftItemView, int i, @NotNull ahs<?> ahsVar) {
        ihsVar.getClass();
        liveGiftItemView.getClass();
        ahsVar.getClass();
        this.itemModel = ihsVar;
        this.giftItemView = liveGiftItemView;
        this.position = i;
        this.presenter = ahsVar;
        this.currentState = 1;
        this.progressMap = new HashMap<>();
        this.successMap = new HashMap<>();
        this.downloadListener = new C16835a();
    }

    /* JADX INFO: renamed from: f */
    public final void m121429f(int status, boolean withDownload, @Nullable e30<Integer> finishResult) {
        this.currentState = status;
        this.finishAction = finishResult;
        xdl0.m208345M0(this.giftItemView.f49526p, false);
        xdl0.m208345M0(this.giftItemView.f49527q, false);
        xdl0.m208344M(this.giftItemView.f49525o, true);
        xdl0.m208344M(this.giftItemView.f49518h, true);
        m121444u(0);
        this.giftItemView.f49518h.setText(m121434k());
        if (this.itemModel.m136283h().gear.gearEffects.isEmpty()) {
            m121437n(withDownload);
        } else {
            m121436m(withDownload);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m121430g() {
        aqe aqeVarM98261i = aqe.m98261i();
        boolean zIsEmpty = this.itemModel.m136283h().gear.gearEffects.isEmpty();
        ihs ihsVar = this.itemModel;
        if (zIsEmpty) {
            BLiveEffect bLiveEffectM98266h = aqeVarM98261i.m98266h(ihsVar.m136283h().liveResourceId);
            if (bLiveEffectM98266h != null) {
                aqeVarM98261i.m98270m(bLiveEffectM98266h, Priority.get("IMMEDIATE"));
                return;
            }
            return;
        }
        List<BLiveGiftGearEffectInfo> list = ihsVar.m136283h().gear.gearEffects;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BLiveEffect bLiveEffectM98266h2 = aqeVarM98261i.m98266h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId);
            if (bLiveEffectM98266h2 != null) {
                aqeVarM98261i.m98270m(bLiveEffectM98266h2, Priority.get("IMMEDIATE"));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List<BLiveGiftGearEffectInfo> m121431h() {
        HashMap map = new HashMap();
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : this.itemModel.m136283h().gear.gearEffects) {
            String str = bLiveGiftGearEffectInfo.liveResourceId;
            str.getClass();
            if (str.length() > 0) {
                map.put(bLiveGiftGearEffectInfo.liveResourceId, bLiveGiftGearEffectInfo);
            }
        }
        Collection collectionValues = map.values();
        collectionValues.getClass();
        return CollectionsKt.toList(collectionValues);
    }

    /* JADX INFO: renamed from: i */
    public final int m121432i() {
        Set<Map.Entry<String, Integer>> setEntrySet = this.progressMap.entrySet();
        setEntrySet.getClass();
        Iterator<T> it = setEntrySet.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            value.getClass();
            iIntValue += ((Number) value).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getCurrentState() {
        return this.currentState;
    }

    /* JADX INFO: renamed from: k */
    public final String m121434k() {
        int i = this.currentState;
        if (i == 1) {
            String strM202217t = w8u.m202217t(R$string.f47360l5);
            strM202217t.getClass();
            return strM202217t;
        }
        if (i == 2) {
            String strM202217t2 = w8u.m202217t(R$string.f47295i5);
            strM202217t2.getClass();
            return strM202217t2;
        }
        if (i != 3) {
            String strM202217t3 = w8u.m202217t(R$string.f47360l5);
            strM202217t3.getClass();
            return strM202217t3;
        }
        String strM202217t4 = w8u.m202217t(R$string.f47338k5);
        strM202217t4.getClass();
        return strM202217t4;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final LiveGiftItemView getGiftItemView() {
        return this.giftItemView;
    }

    /* JADX INFO: renamed from: m */
    public final void m121436m(boolean withDownload) {
        aqe aqeVarM98261i = aqe.m98261i();
        List<BLiveGiftGearEffectInfo> listM121431h = m121431h();
        ArrayList<BLiveGiftGearEffectInfo> arrayList = new ArrayList();
        for (Object obj : listM121431h) {
            BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo = (BLiveGiftGearEffectInfo) obj;
            boolean zM98267j = aqe.m98261i().m98267j(bLiveGiftGearEffectInfo.liveResourceId);
            if (zM98267j) {
                this.progressMap.put(bLiveGiftGearEffectInfo.liveResourceId, 100);
            }
            if (!zM98267j) {
                arrayList.add(obj);
            }
        }
        int size = listM121431h.size();
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2 : arrayList) {
            BLiveEffect bLiveEffectM98266h = aqeVarM98261i.m98266h(bLiveGiftGearEffectInfo2.liveResourceId);
            if (xi5.m208914a(bLiveEffectM98266h)) {
                aqeVarM98261i.m98281x(bLiveGiftGearEffectInfo2.liveResourceId, null, new C16836b(bLiveGiftGearEffectInfo2, size, arrayList));
            } else {
                if (withDownload) {
                    aqeVarM98261i.m98269l(bLiveEffectM98266h);
                }
                m7s m7sVarM153416a = m7s.INSTANCE.m153416a();
                String str = bLiveEffectM98266h.zip;
                str.getClass();
                m7sVarM153416a.m153409n(str, new C16837c(bLiveGiftGearEffectInfo2, size, arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m121437n(boolean withDownload) {
        aqe aqeVarM98261i = aqe.m98261i();
        BLiveEffect bLiveEffectM98266h = aqeVarM98261i.m98266h(this.itemModel.m136283h().liveResourceId);
        if (xi5.m208914a(bLiveEffectM98266h)) {
            aqeVarM98261i.m98281x(this.itemModel.m136283h().liveResourceId, null, this.downloadListener);
            return;
        }
        if (withDownload) {
            aqeVarM98261i.m98269l(bLiveEffectM98266h);
        }
        m7s m7sVarM153416a = m7s.INSTANCE.m153416a();
        String str = bLiveEffectM98266h.zip;
        str.getClass();
        m7sVarM153416a.m153409n(str, this.downloadListener);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m121438o() {
        return this.currentState == 3;
    }

    /* JADX INFO: renamed from: p */
    public final void m121439p(String errMsg) {
        this.downloadListener.onFailed(errMsg);
    }

    /* JADX INFO: renamed from: q */
    public final void m121440q(BLiveGiftGearEffectInfo info, int progress, int totalEffectSize) {
        this.progressMap.put(info.liveResourceId, Integer.valueOf(progress));
        if (m121438o()) {
            return;
        }
        this.downloadListener.mo75217b(m121432i() / totalEffectSize);
    }

    /* JADX INFO: renamed from: r */
    public final void m121441r(BLiveGiftGearEffectInfo info, List<? extends BLiveGiftGearEffectInfo> list, File file) {
        this.successMap.put(info.liveResourceId, Boolean.TRUE);
        Set<Map.Entry<String, Boolean>> setEntrySet = this.successMap.entrySet();
        setEntrySet.getClass();
        Set<Map.Entry<String, Boolean>> set = setEntrySet;
        int i = 0;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                value.getClass();
                if (((Boolean) value).booleanValue() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (list.size() == i) {
            this.downloadListener.mo74248a(file);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m121442s() {
        BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(this.itemModel.m136283h().liveResourceId);
        if (bLiveEffectM98266h != null) {
            m7s m7sVarM153416a = m7s.INSTANCE.m153416a();
            String str = bLiveEffectM98266h.zip;
            str.getClass();
            m7sVarM153416a.m153407C(str, this.downloadListener);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m121443t(int i) {
        this.currentState = i;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
      0x0003: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: u */
    public final void m121444u(int progress) {
        int i = 6;
        if (progress < 6) {
            progress = i;
        } else {
            i = 100;
            if (progress > 100) {
                progress = i;
            }
        }
        this.giftItemView.f49524n.setProgress(progress);
    }
}
