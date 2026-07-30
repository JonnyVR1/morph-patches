package p153l;

import android.app.Application;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.Priority;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001N\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020!0#H\u0002¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010/R\u001b\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010F\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010/\"\u0004\bE\u0010\u0019R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010GR0\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060Ij\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010KR0\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0Ij\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010KR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010O¨\u0006Q"}, m88121d2 = {"Ll/hjs;", "", "Ll/jjs;", "itemModel", "Lcom/p1/mobile/putong/live/external/internal/vchat/module/giftDialog/view/LiveVChatGiftItemView;", "giftItemView", "", "position", "Ll/ahu;", "presenter", "<init>", "(Ll/jjs;Lcom/p1/mobile/putong/live/external/internal/vchat/module/giftDialog/view/LiveVChatGiftItemView;ILl/ahu;)V", NotificationCompat.CATEGORY_STATUS, "", "withDownload", "Ll/y20;", "finishResult", "", "f", "(IZLl/y20;)V", BLiveStormDanmakuGiftResourceType.f45294s, "()V", "g", "progress", "u", "(I)V", "n", "(Z)V", "m", "", "errMsg", "p", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;", BaseSei.INFO, "", "list", "Ljava/io/File;", "file", "r", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;Ljava/util/List;Ljava/io/File;)V", "totalEffectSize", "q", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;II)V", "o", "()Z", RXScreenCaptureService.KEY_INDEX, "()I", "k", "()Ljava/lang/String;", "h", "()Ljava/util/List;", "a", "Ll/jjs;", "getItemModel", "()Ll/jjs;", "b", "Lcom/p1/mobile/putong/live/external/internal/vchat/module/giftDialog/view/LiveVChatGiftItemView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/live/external/internal/vchat/module/giftDialog/view/LiveVChatGiftItemView;", "c", "I", "getPosition", Constants.INAPP_DATA_TAG, "Ll/ahu;", "getPresenter", "()Ll/ahu;", "e", "j", Constants.KEY_T, "currentState", "Ll/y20;", "finishAction", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "progressMap", "successMap", "l/hjs$a", "Ll/hjs$a;", "downloadListener", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hjs {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final jjs itemModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LiveVChatGiftItemView giftItemView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int position;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ahu<?> presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int currentState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> finishAction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Integer> progressMap;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Boolean> successMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C17475a downloadListener;

    /* JADX INFO: renamed from: l.hjs$a */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"l/hjs$a", "Ll/w8e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17475a implements w8e {
        public C17475a() {
        }

        /* JADX INFO: renamed from: e */
        public static void m135524e(hjs hjsVar, C17475a c17475a, String str) {
            if (hjsVar.getGiftItemView().isShowing()) {
                c17475a.onFailed(str);
            }
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(File file) {
            file.getClass();
            hjs.this.m135522t(4);
            bnl0.m105524M(hjs.this.getGiftItemView().f46048o, false);
            bnl0.m105524M(hjs.this.getGiftItemView().f46049p, true);
            bnl0.m105524M(hjs.this.getGiftItemView().f46050q, true);
            hjs.this.getGiftItemView().setAlpha(1.0f);
            y20 y20Var = hjs.this.finishAction;
            if (y20Var != null) {
                y20Var.call(Integer.valueOf(hjs.this.getCurrentState()));
            }
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: b */
        public void mo76400b(int progress) {
            hjs.this.m135522t(2);
            hjs.this.getGiftItemView().f46041h.setText(xau.m209910t(R$string.f48143i5));
            hjs.this.m135523u(progress);
            y20 y20Var = hjs.this.finishAction;
            if (y20Var != null) {
                y20Var.call(Integer.valueOf(hjs.this.getCurrentState()));
            }
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo75432c(boolean z) {
            super.mo75432c(z);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: d */
        public void mo76401d(final String errMsg) {
            errMsg.getClass();
            Application application = App.f16088e;
            final hjs hjsVar = hjs.this;
            l51.m152888H(application, new Runnable() { // from class: l.fjs
                @Override // java.lang.Runnable
                public final void run() {
                    hjs.C17475a.m135524e(hjsVar, this, errMsg);
                }
            }, 500L);
        }

        @Override // p153l.w8e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p153l.w8e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            hjs.this.m135522t(3);
            hjs.this.getGiftItemView().f46041h.setText(xau.m209910t(R$string.f48186k5));
            hjs.this.getGiftItemView().f46049p.setText(xau.m209910t(R$string.f48164j5));
            hjs.this.getGiftItemView().setAlpha(0.5f);
            bnl0.m105524M(hjs.this.getGiftItemView().f46048o, false);
            bnl0.m105524M(hjs.this.getGiftItemView().f46049p, true);
            y20 y20Var = hjs.this.finishAction;
            if (y20Var != null) {
                y20Var.call(Integer.valueOf(hjs.this.getCurrentState()));
            }
        }

        @Override // p153l.w8e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: l.hjs$b */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"l/hjs$b", "Ll/w8e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17476b implements w8e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftGearEffectInfo f110310b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f110311c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List<BLiveGiftGearEffectInfo> f110312d;

        /* JADX WARN: Multi-variable type inference failed */
        public C17476b(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, int i, List<? extends BLiveGiftGearEffectInfo> list) {
            this.f110310b = bLiveGiftGearEffectInfo;
            this.f110311c = i;
            this.f110312d = list;
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(File file) {
            file.getClass();
            hjs.this.m135520r(this.f110310b, this.f110312d, file);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: b */
        public void mo76400b(int progress) {
            hjs.this.m135519q(this.f110310b, progress, this.f110311c);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo75432c(boolean z) {
            super.mo75432c(z);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: d */
        public void mo76401d(String errMsg) {
            errMsg.getClass();
            hjs.this.m135518p(errMsg);
        }

        @Override // p153l.w8e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p153l.w8e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            hjs.this.m135518p(errMsg);
        }

        @Override // p153l.w8e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: l.hjs$c */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"l/hjs$c", "Ll/w8e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17477c implements w8e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftGearEffectInfo f110314b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f110315c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List<BLiveGiftGearEffectInfo> f110316d;

        /* JADX WARN: Multi-variable type inference failed */
        public C17477c(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, int i, List<? extends BLiveGiftGearEffectInfo> list) {
            this.f110314b = bLiveGiftGearEffectInfo;
            this.f110315c = i;
            this.f110316d = list;
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(File file) {
            file.getClass();
            hjs.this.m135520r(this.f110314b, this.f110316d, file);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: b */
        public void mo76400b(int progress) {
            hjs.this.m135519q(this.f110314b, progress, this.f110315c);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo75432c(boolean z) {
            super.mo75432c(z);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: d */
        public /* bridge */ void mo76401d(String str) {
            super.mo76401d(str);
        }

        @Override // p153l.w8e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p153l.w8e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            hjs.this.m135518p(errMsg);
        }

        @Override // p153l.w8e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    public hjs(@NotNull jjs jjsVar, @NotNull LiveVChatGiftItemView liveVChatGiftItemView, int i, @NotNull ahu<?> ahuVar) {
        jjsVar.getClass();
        liveVChatGiftItemView.getClass();
        ahuVar.getClass();
        this.itemModel = jjsVar;
        this.giftItemView = liveVChatGiftItemView;
        this.position = i;
        this.presenter = ahuVar;
        this.currentState = 1;
        this.progressMap = new HashMap<>();
        this.successMap = new HashMap<>();
        this.downloadListener = new C17475a();
    }

    /* JADX INFO: renamed from: f */
    public final void m135508f(int status, boolean withDownload, @Nullable y20<Integer> finishResult) {
        this.currentState = status;
        this.finishAction = finishResult;
        bnl0.m105525M0(this.giftItemView.f46049p, false);
        bnl0.m105525M0(this.giftItemView.f46050q, false);
        bnl0.m105524M(this.giftItemView.f46048o, true);
        bnl0.m105524M(this.giftItemView.f46041h, true);
        m135523u(0);
        this.giftItemView.f46041h.setText(m135513k());
        if (this.itemModel.m145122h().gear.gearEffects.isEmpty()) {
            m135516n(withDownload);
        } else {
            m135515m(withDownload);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m135509g() {
        ere ereVarM122146i = ere.m122146i();
        boolean zIsEmpty = this.itemModel.m145122h().gear.gearEffects.isEmpty();
        jjs jjsVar = this.itemModel;
        if (zIsEmpty) {
            BLiveEffect bLiveEffectM122151h = ereVarM122146i.m122151h(jjsVar.m145122h().liveResourceId);
            if (bLiveEffectM122151h != null) {
                ereVarM122146i.m122155m(bLiveEffectM122151h, Priority.get("IMMEDIATE"));
                return;
            }
            return;
        }
        List<BLiveGiftGearEffectInfo> list = jjsVar.m145122h().gear.gearEffects;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BLiveEffect bLiveEffectM122151h2 = ereVarM122146i.m122151h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId);
            if (bLiveEffectM122151h2 != null) {
                ereVarM122146i.m122155m(bLiveEffectM122151h2, Priority.get("IMMEDIATE"));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List<BLiveGiftGearEffectInfo> m135510h() {
        HashMap map = new HashMap();
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : this.itemModel.m145122h().gear.gearEffects) {
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
    public final int m135511i() {
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
    public final String m135513k() {
        int i = this.currentState;
        if (i == 1) {
            String strM209910t = xau.m209910t(R$string.f48208l5);
            strM209910t.getClass();
            return strM209910t;
        }
        if (i == 2) {
            String strM209910t2 = xau.m209910t(R$string.f48143i5);
            strM209910t2.getClass();
            return strM209910t2;
        }
        if (i != 3) {
            String strM209910t3 = xau.m209910t(R$string.f48208l5);
            strM209910t3.getClass();
            return strM209910t3;
        }
        String strM209910t4 = xau.m209910t(R$string.f48186k5);
        strM209910t4.getClass();
        return strM209910t4;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final LiveVChatGiftItemView getGiftItemView() {
        return this.giftItemView;
    }

    /* JADX INFO: renamed from: m */
    public final void m135515m(boolean withDownload) {
        ere ereVarM122146i = ere.m122146i();
        List<BLiveGiftGearEffectInfo> listM135510h = m135510h();
        ArrayList<BLiveGiftGearEffectInfo> arrayList = new ArrayList();
        for (Object obj : listM135510h) {
            BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo = (BLiveGiftGearEffectInfo) obj;
            boolean zM122152j = ere.m122146i().m122152j(bLiveGiftGearEffectInfo.liveResourceId);
            if (zM122152j) {
                this.progressMap.put(bLiveGiftGearEffectInfo.liveResourceId, 100);
            }
            if (!zM122152j) {
                arrayList.add(obj);
            }
        }
        int size = listM135510h.size();
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2 : arrayList) {
            BLiveEffect bLiveEffectM122151h = ereVarM122146i.m122151h(bLiveGiftGearEffectInfo2.liveResourceId);
            if (yj5.m216388a(bLiveEffectM122151h)) {
                ereVarM122146i.m122166x(bLiveGiftGearEffectInfo2.liveResourceId, null, new C17476b(bLiveGiftGearEffectInfo2, size, arrayList));
            } else {
                if (withDownload) {
                    ereVarM122146i.m122154l(bLiveEffectM122151h);
                }
                n9s n9sVarM162034a = n9s.INSTANCE.m162034a();
                String str = bLiveEffectM122151h.zip;
                str.getClass();
                n9sVarM162034a.m162027n(str, new C17477c(bLiveGiftGearEffectInfo2, size, arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m135516n(boolean withDownload) {
        ere ereVarM122146i = ere.m122146i();
        BLiveEffect bLiveEffectM122151h = ereVarM122146i.m122151h(this.itemModel.m145122h().liveResourceId);
        if (yj5.m216388a(bLiveEffectM122151h)) {
            ereVarM122146i.m122166x(this.itemModel.m145122h().liveResourceId, null, this.downloadListener);
            return;
        }
        if (withDownload) {
            ereVarM122146i.m122154l(bLiveEffectM122151h);
        }
        n9s n9sVarM162034a = n9s.INSTANCE.m162034a();
        String str = bLiveEffectM122151h.zip;
        str.getClass();
        n9sVarM162034a.m162027n(str, this.downloadListener);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m135517o() {
        return this.currentState == 3;
    }

    /* JADX INFO: renamed from: p */
    public final void m135518p(String errMsg) {
        this.downloadListener.onFailed(errMsg);
    }

    /* JADX INFO: renamed from: q */
    public final void m135519q(BLiveGiftGearEffectInfo info, int progress, int totalEffectSize) {
        this.progressMap.put(info.liveResourceId, Integer.valueOf(progress));
        if (m135517o()) {
            return;
        }
        this.downloadListener.mo76400b(m135511i() / totalEffectSize);
    }

    /* JADX INFO: renamed from: r */
    public final void m135520r(BLiveGiftGearEffectInfo info, List<? extends BLiveGiftGearEffectInfo> list, File file) {
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
            this.downloadListener.mo75431a(file);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m135521s() {
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(this.itemModel.m145122h().liveResourceId);
        if (bLiveEffectM122151h != null) {
            n9s n9sVarM162034a = n9s.INSTANCE.m162034a();
            String str = bLiveEffectM122151h.zip;
            str.getClass();
            n9sVarM162034a.m162025C(str, this.downloadListener);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m135522t(int i) {
        this.currentState = i;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
      0x0003: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: u */
    public final void m135523u(int progress) {
        int i = 6;
        if (progress < 6) {
            progress = i;
        } else {
            i = 100;
            if (progress > 100) {
                progress = i;
            }
        }
        this.giftItemView.f46047n.setProgress(progress);
    }
}
