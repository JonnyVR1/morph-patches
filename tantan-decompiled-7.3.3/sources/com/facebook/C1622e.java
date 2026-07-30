package com.facebook;

import android.os.Handler;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.facebook.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0014\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c-\u0018B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u001d\b\u0016\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002¢\u0006\u0004\b\u0003\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010 J \u0010\"\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b$\u0010\rJ\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0010R$\u0010,\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b2\u00103R0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\rR0\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0011052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0011058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010\rR$\u0010@\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00101\u001a\u0004\b=\u00103\"\u0004\b>\u0010?R$\u0010E\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010B¨\u0006I"}, m88121d2 = {"Lcom/facebook/e;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "<init>", "()V", "", "requests", "(Ljava/util/Collection;)V", "", "([Lcom/facebook/GraphRequest;)V", "", "Lcom/facebook/GraphResponse;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/List;", "Lcom/facebook/d;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/facebook/d;", "Lcom/facebook/e$a;", "callback", "", "f", "(Lcom/facebook/e$a;)V", "element", "", "c", "(Lcom/facebook/GraphRequest;)Z", "", FirebaseAnalytics.Param.INDEX, "a", "(ILcom/facebook/GraphRequest;)V", BLiveResOperation.clear, "o", "(I)Lcom/facebook/GraphRequest;", "E", "F", "(ILcom/facebook/GraphRequest;)Lcom/facebook/GraphRequest;", "h", "j", "Landroid/os/Handler;", "Landroid/os/Handler;", "r", "()Landroid/os/Handler;", "G", "(Landroid/os/Handler;)V", "callbackHandler", "b", "I", "timeoutInMilliseconds", "", "Ljava/lang/String;", ResourceDirection.f39656v, "()Ljava/lang/String;", "id", "", "<set-?>", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "w", "e", BLiveStormDanmakuGiftResourceType.f45294s, "callbacks", "p", "setBatchApplicationId", "(Ljava/lang/String;)V", "batchApplicationId", BaseSei.f14625Y, "()I", "setTimeout", "(I)V", "timeout", BaseSei.f14624X, "size", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1622e extends AbstractList<GraphRequest> {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final AtomicInteger f6396g = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Handler callbackHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int timeoutInMilliseconds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<GraphRequest> requests;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<a> callbacks;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String batchApplicationId;

    /* JADX INFO: renamed from: com.facebook.e$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/facebook/e$a;", "", "Lcom/facebook/e;", "batch", "", "a", "(Lcom/facebook/e;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo8371a(@NotNull C1622e batch);
    }

    /* JADX INFO: renamed from: com.facebook.e$c */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Lcom/facebook/e$c;", "Lcom/facebook/e$a;", "Lcom/facebook/e;", "batch", "", "current", Constants.PRIORITY_MAX, "", "b", "(Lcom/facebook/e;JJ)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface c extends a {
        /* JADX INFO: renamed from: b */
        void m8372b(@NotNull C1622e batch, long current, long max);
    }

    public C1622e(@NotNull GraphRequest... graphRequestArr) {
        graphRequestArr.getClass();
        this.id = String.valueOf(Integer.valueOf(f6396g.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(ArraysKt.asList(graphRequestArr));
    }

    /* JADX INFO: renamed from: A */
    public /* bridge */ int m8348A(GraphRequest graphRequest) {
        return super.lastIndexOf(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ GraphRequest remove(int i) {
        return m8351E(i);
    }

    /* JADX INFO: renamed from: D */
    public /* bridge */ boolean m8350D(GraphRequest graphRequest) {
        return super.remove(graphRequest);
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public GraphRequest m8351E(int index) {
        return this.requests.remove(index);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public GraphRequest set(int index, @NotNull GraphRequest element) {
        element.getClass();
        return this.requests.set(index, element);
    }

    /* JADX INFO: renamed from: G */
    public final void m8353G(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int index, @NotNull GraphRequest element) {
        element.getClass();
        this.requests.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(@NotNull GraphRequest element) {
        element.getClass();
        return this.requests.add(element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.requests.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m8357g((GraphRequest) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m8356f(@NotNull a callback) {
        callback.getClass();
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    /* JADX INFO: renamed from: g */
    public /* bridge */ boolean m8357g(GraphRequest graphRequest) {
        return super.contains(graphRequest);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<GraphResponse> m8358h() {
        return m8359i();
    }

    /* JADX INFO: renamed from: i */
    public final List<GraphResponse> m8359i() {
        return GraphRequest.INSTANCE.m7624i(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m8370z((GraphRequest) obj);
        }
        return -1;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final AsyncTaskC1614d m8360j() {
        return m8361l();
    }

    /* JADX INFO: renamed from: l */
    public final AsyncTaskC1614d m8361l() {
        return GraphRequest.INSTANCE.m7627l(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m8348A((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public GraphRequest get(int index) {
        return this.requests.get(index);
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getBatchApplicationId() {
        return this.batchApplicationId;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final Handler getCallbackHandler() {
        return this.callbackHandler;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return m8350D((GraphRequest) obj);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final List<a> m8365s() {
        return this.callbacks;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m8368x();
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final List<GraphRequest> m8367w() {
        return this.requests;
    }

    /* JADX INFO: renamed from: x */
    public int m8368x() {
        return this.requests.size();
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    /* JADX INFO: renamed from: z */
    public /* bridge */ int m8370z(GraphRequest graphRequest) {
        return super.indexOf(graphRequest);
    }

    public C1622e(@NotNull Collection<GraphRequest> collection) {
        collection.getClass();
        this.id = String.valueOf(Integer.valueOf(f6396g.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(collection);
    }

    public C1622e() {
        this.id = String.valueOf(Integer.valueOf(f6396g.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList();
    }
}
