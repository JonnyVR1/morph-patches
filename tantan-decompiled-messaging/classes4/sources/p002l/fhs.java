package p002l;

import android.app.Application;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p1.mobile.putong.live.base.data.Priority;
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
import l.e30;
import l.e51;
import l.w8u;
import l.xdl0;
import l.xi5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001N\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020!0#H\u0002¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010/R\u001b\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010F\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010/\"\u0004\bE\u0010\u0019R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010GR0\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060Ij\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0006`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010KR0\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0Ij\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r`J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010KR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010O¨\u0006Q"}, d2 = {"Ll/fhs;", "", "Ll/ihs;", "itemModel", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", "giftItemView", "", "position", "Ll/ahs;", "presenter", "<init>", "(Ll/ihs;Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;ILl/ahs;)V", "status", "", "withDownload", "Ll/e30;", "finishResult", "", "f", "(IZLl/e30;)V", "s", "()V", "g", "progress", "u", "(I)V", "n", "(Z)V", "m", "", "errMsg", "p", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;", "info", "", "list", "Ljava/io/File;", "file", "r", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;Ljava/util/List;Ljava/io/File;)V", "totalEffectSize", "q", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftGearEffectInfo;II)V", "o", "()Z", "i", "()I", "k", "()Ljava/lang/String;", "h", "()Ljava/util/List;", "a", "Ll/ihs;", "getItemModel", "()Ll/ihs;", "b", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", "l", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/LiveGiftItemView;", "c", "I", "getPosition", "d", "Ll/ahs;", "getPresenter", "()Ll/ahs;", "e", "j", "t", "currentState", "Ll/e30;", "finishAction", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "progressMap", "successMap", "l/fhs$a", "Ll/fhs$a;", "downloadListener", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public final C0568a downloadListener;

    /* JADX INFO: renamed from: l.fhs$a */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"l/fhs$a", "Ll/h7e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "d", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0568a implements h7e {
        public C0568a() {
        }

        /* JADX INFO: renamed from: e */
        public static void m13234e(fhs fhsVar, C0568a c0568a, String str) {
            if (fhsVar.getGiftItemView().isShowing()) {
                c0568a.onFailed(str);
            }
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(File file) {
            file.getClass();
            fhs.this.m13232t(4);
            xdl0.M(fhs.this.getGiftItemView().f5567o, false);
            xdl0.M(fhs.this.getGiftItemView().f5568p, true);
            xdl0.M(fhs.this.getGiftItemView().f5569q, true);
            fhs.this.getGiftItemView().setAlpha(1.0f);
            e30 e30Var = fhs.this.finishAction;
            if (e30Var != null) {
                e30Var.call(Integer.valueOf(fhs.this.getCurrentState()));
            }
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: b */
        public void mo8833b(int progress) {
            fhs.this.m13232t(2);
            fhs.this.getGiftItemView().f5560h.setText(w8u.t(R$string.f3337i5));
            fhs.this.m13233u(progress);
            e30 e30Var = fhs.this.finishAction;
            if (e30Var != null) {
                e30Var.call(Integer.valueOf(fhs.this.getCurrentState()));
            }
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo7820c(boolean z) {
            super.mo7820c(z);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: d */
        public void mo8834d(final String errMsg) {
            errMsg.getClass();
            Application application = App.e;
            final fhs fhsVar = fhs.this;
            e51.H(application, new Runnable() { // from class: l.dhs
                @Override // java.lang.Runnable
                public final void run() {
                    fhs.C0568a.m13234e(fhsVar, this, errMsg);
                }
            }, 500L);
        }

        @Override // p002l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p002l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            fhs.this.m13232t(3);
            fhs.this.getGiftItemView().f5560h.setText(w8u.t(R$string.f3380k5));
            fhs.this.getGiftItemView().f5568p.setText(w8u.t(R$string.f3358j5));
            fhs.this.getGiftItemView().setAlpha(0.5f);
            xdl0.M(fhs.this.getGiftItemView().f5567o, false);
            xdl0.M(fhs.this.getGiftItemView().f5568p, true);
            e30 e30Var = fhs.this.finishAction;
            if (e30Var != null) {
                e30Var.call(Integer.valueOf(fhs.this.getCurrentState()));
            }
        }

        @Override // p002l.h7e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: l.fhs$b */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"l/fhs$b", "Ll/h7e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "d", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0569b implements h7e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftGearEffectInfo f10377b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10378c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List<BLiveGiftGearEffectInfo> f10379d;

        public C0569b(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, int i, List<? extends BLiveGiftGearEffectInfo> list) {
            this.f10377b = bLiveGiftGearEffectInfo;
            this.f10378c = i;
            this.f10379d = list;
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(File file) {
            file.getClass();
            fhs.this.m13230r(this.f10377b, this.f10379d, file);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: b */
        public void mo8833b(int progress) {
            fhs.this.m13229q(this.f10377b, progress, this.f10378c);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo7820c(boolean z) {
            super.mo7820c(z);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: d */
        public void mo8834d(String errMsg) {
            errMsg.getClass();
            fhs.this.m13228p(errMsg);
        }

        @Override // p002l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p002l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            fhs.this.m13228p(errMsg);
        }

        @Override // p002l.h7e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: l.fhs$c */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"l/fhs$c", "Ll/h7e;", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0570c implements h7e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftGearEffectInfo f10381b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10382c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List<BLiveGiftGearEffectInfo> f10383d;

        public C0570c(BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo, int i, List<? extends BLiveGiftGearEffectInfo> list) {
            this.f10381b = bLiveGiftGearEffectInfo;
            this.f10382c = i;
            this.f10383d = list;
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(File file) {
            file.getClass();
            fhs.this.m13230r(this.f10381b, this.f10383d, file);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: b */
        public void mo8833b(int progress) {
            fhs.this.m13229q(this.f10381b, progress, this.f10382c);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo7820c(boolean z) {
            super.mo7820c(z);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: d */
        public /* bridge */ void mo8834d(String str) {
            super.mo8834d(str);
        }

        @Override // p002l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p002l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            fhs.this.m13228p(errMsg);
        }

        @Override // p002l.h7e
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
        this.downloadListener = new C0568a();
    }

    /* JADX INFO: renamed from: f */
    public final void m13218f(int status, boolean withDownload, @Nullable e30<Integer> finishResult) {
        this.currentState = status;
        this.finishAction = finishResult;
        xdl0.M0(this.giftItemView.f5568p, false);
        xdl0.M0(this.giftItemView.f5569q, false);
        xdl0.M(this.giftItemView.f5567o, true);
        xdl0.M(this.giftItemView.f5560h, true);
        m13233u(0);
        this.giftItemView.f5560h.setText(m13223k());
        if (this.itemModel.m15160h().gear.gearEffects.isEmpty()) {
            m13226n(withDownload);
        } else {
            m13225m(withDownload);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13219g() {
        aqe aqeVarM10039i = aqe.m10039i();
        boolean zIsEmpty = this.itemModel.m15160h().gear.gearEffects.isEmpty();
        ihs ihsVar = this.itemModel;
        if (zIsEmpty) {
            BLiveEffect bLiveEffectM10044h = aqeVarM10039i.m10044h(ihsVar.m15160h().liveResourceId);
            if (bLiveEffectM10044h != null) {
                aqeVarM10039i.m10048m(bLiveEffectM10044h, Priority.get("IMMEDIATE"));
                return;
            }
            return;
        }
        List list = ihsVar.m15160h().gear.gearEffects;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveEffect bLiveEffectM10044h2 = aqeVarM10039i.m10044h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId);
            if (bLiveEffectM10044h2 != null) {
                aqeVarM10039i.m10048m(bLiveEffectM10044h2, Priority.get("IMMEDIATE"));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List<BLiveGiftGearEffectInfo> m13220h() {
        HashMap map = new HashMap();
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo : this.itemModel.m15160h().gear.gearEffects) {
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
    public final int m13221i() {
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
    public final String m13223k() {
        int i = this.currentState;
        if (i == 1) {
            String strT = w8u.t(R$string.f3402l5);
            strT.getClass();
            return strT;
        }
        if (i == 2) {
            String strT2 = w8u.t(R$string.f3337i5);
            strT2.getClass();
            return strT2;
        }
        if (i != 3) {
            String strT3 = w8u.t(R$string.f3402l5);
            strT3.getClass();
            return strT3;
        }
        String strT4 = w8u.t(R$string.f3380k5);
        strT4.getClass();
        return strT4;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final LiveGiftItemView getGiftItemView() {
        return this.giftItemView;
    }

    /* JADX INFO: renamed from: m */
    public final void m13225m(boolean withDownload) {
        aqe aqeVarM10039i = aqe.m10039i();
        List<BLiveGiftGearEffectInfo> listM13220h = m13220h();
        ArrayList<BLiveGiftGearEffectInfo> arrayList = new ArrayList();
        for (Object obj : listM13220h) {
            BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo = (BLiveGiftGearEffectInfo) obj;
            boolean zM10045j = aqe.m10039i().m10045j(bLiveGiftGearEffectInfo.liveResourceId);
            if (zM10045j) {
                this.progressMap.put(bLiveGiftGearEffectInfo.liveResourceId, 100);
            }
            if (!zM10045j) {
                arrayList.add(obj);
            }
        }
        int size = listM13220h.size();
        for (BLiveGiftGearEffectInfo bLiveGiftGearEffectInfo2 : arrayList) {
            BLiveEffect bLiveEffectM10044h = aqeVarM10039i.m10044h(bLiveGiftGearEffectInfo2.liveResourceId);
            if (xi5.a(bLiveEffectM10044h)) {
                aqeVarM10039i.m10059x(bLiveGiftGearEffectInfo2.liveResourceId, null, new C0569b(bLiveGiftGearEffectInfo2, size, arrayList));
            } else {
                if (withDownload) {
                    aqeVarM10039i.m10047l(bLiveEffectM10044h);
                }
                m7s m7sVarM17759a = m7s.INSTANCE.m17759a();
                String str = bLiveEffectM10044h.zip;
                str.getClass();
                m7sVarM17759a.m17752n(str, new C0570c(bLiveGiftGearEffectInfo2, size, arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13226n(boolean withDownload) {
        aqe aqeVarM10039i = aqe.m10039i();
        BLiveEffect bLiveEffectM10044h = aqeVarM10039i.m10044h(this.itemModel.m15160h().liveResourceId);
        if (xi5.a(bLiveEffectM10044h)) {
            aqeVarM10039i.m10059x(this.itemModel.m15160h().liveResourceId, null, this.downloadListener);
            return;
        }
        if (withDownload) {
            aqeVarM10039i.m10047l(bLiveEffectM10044h);
        }
        m7s m7sVarM17759a = m7s.INSTANCE.m17759a();
        String str = bLiveEffectM10044h.zip;
        str.getClass();
        m7sVarM17759a.m17752n(str, this.downloadListener);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13227o() {
        return this.currentState == 3;
    }

    /* JADX INFO: renamed from: p */
    public final void m13228p(String errMsg) {
        this.downloadListener.onFailed(errMsg);
    }

    /* JADX INFO: renamed from: q */
    public final void m13229q(BLiveGiftGearEffectInfo info, int progress, int totalEffectSize) {
        this.progressMap.put(info.liveResourceId, Integer.valueOf(progress));
        if (m13227o()) {
            return;
        }
        this.downloadListener.mo8833b(m13221i() / totalEffectSize);
    }

    /* JADX INFO: renamed from: r */
    public final void m13230r(BLiveGiftGearEffectInfo info, List<? extends BLiveGiftGearEffectInfo> list, File file) {
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
            this.downloadListener.mo7819a(file);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m13231s() {
        BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(this.itemModel.m15160h().liveResourceId);
        if (bLiveEffectM10044h != null) {
            m7s m7sVarM17759a = m7s.INSTANCE.m17759a();
            String str = bLiveEffectM10044h.zip;
            str.getClass();
            m7sVarM17759a.m17750C(str, this.downloadListener);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13232t(int i) {
        this.currentState = i;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003 A[PHI: r0
      0x0003: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0001, B:6:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: u */
    public final void m13233u(int progress) {
        int i = 6;
        if (progress < 6) {
            progress = i;
        } else {
            i = 100;
            if (progress > 100) {
                progress = i;
            }
        }
        this.giftItemView.f5566n.setProgress(progress);
    }
}
